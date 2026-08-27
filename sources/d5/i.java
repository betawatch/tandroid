package d5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import c2.z0;
import cg.w1;
import gh.e1;
import h7.z5;
import hh.c4;
import hh.e4;
import hh.f4;
import hh.g4;
import hh.k7;
import hh.u4;
import hh.u7;
import hh.x4;
import hh.z3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import jh.d1;
import jh.i9;
import jh.y8;
import jh.z8;
import lh.f6;
import lh.vb;
import nh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.ah;
import org.telegram.ui.da0;
import org.telegram.ui.dm;
import org.telegram.ui.k4;
import org.telegram.ui.m4;
import org.telegram.ui.rn;
import org.telegram.ui.ul;
import zf.r1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i11 = this.b;
                k kVar = (k) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    m mVar = (m) it.next();
                    if (!mVar.d) {
                        if (i11 != -1) {
                            mVar.b.b(i11);
                        }
                        mVar.c = true;
                        kVar.invoke(mVar.a);
                    }
                }
                break;
            case 1:
                ((e2.c) ((z0) this.c).c).n(this.b, this.d);
                break;
            case 2:
                wq0 wq0Var = (wq0) this.c;
                int i12 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                k7 k7Var = wq0Var.e;
                if (i12 != -1) {
                    int i13 = tL_starGiftCollection.collection_id;
                    int i14 = k7Var.a;
                    int f10 = k7Var.f(i13);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) k7Var.e.remove(f10);
                        k7Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i14).getInputPeer(k7Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i14).sendRequest(deletestargiftcollection, null);
                    }
                    wq0Var.f(true);
                    o71 o71Var = wq0Var.n;
                    if (i12 < k7Var.d().size()) {
                        i12++;
                    }
                    o71Var.d(-1, i12);
                    wq0Var.n();
                    break;
                }
                break;
            case 3:
                g4 g4Var = (g4) this.c;
                int i15 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = g4Var.R;
                c4 c4Var = g4Var.f;
                z3 z3Var = g4Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(g4Var.getContext());
                    ri0 ri0Var = new ri0(g4Var.getContext());
                    ri0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(ri0Var, z5.e(32, 32, 17));
                    ri0Var.setScaleX(0.5f);
                    ri0Var.setScaleY(0.5f);
                    ri0Var.setAlpha(0.0f);
                    ri0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    g4Var.h0 = ri0Var;
                    frameLayout.setBackground(new u4(AndroidUtilities.dp(12.0f), g6.l1(0.075f, -1)));
                    z3Var.a[i15].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    z3Var.f(i15, frameLayout);
                    g4Var.B.a(iArr[2], iArr[3]);
                    f4 f4Var = g4Var.b;
                    int[] iArr2 = g4Var.Q;
                    f4Var.a(iArr2[2], iArr2[3]);
                    c4Var.a(iArr[3], iArr[2]);
                    break;
                } else {
                    e4 e4Var = new e4(g4Var.getContext());
                    e4Var.a(starGift, false);
                    e4Var.setRotation(180.0f);
                    z3Var.f(i15, e4Var);
                    e4Var.setScaleX(0.5f);
                    e4Var.setScaleY(0.5f);
                    e4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = e4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    er erVar = er.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(erVar);
                    interpolator.setUpdateListener(new ag.u(g4Var, 6));
                    interpolator.start();
                    z3Var.a[i15].setVisibility(8);
                    c4Var.setVisibility(0);
                    c4Var.setAlpha(0.0f);
                    c4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(erVar).start();
                    break;
                }
            case 4:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, nh.k.G0(this.b)), (x4) this.c, Boolean.FALSE);
                break;
            case 5:
                u7 u7Var = (u7) this.c;
                int i16 = this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = u7Var.r;
                ArrayList[] arrayListArr = u7Var.q;
                int i17 = u7Var.a;
                u7Var.t[i16] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i17).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i17).putChats(starsStatus.chats, false);
                    arrayListArr[i16].addAll(starsStatus.history);
                    zArr[i16] = !arrayListArr[i16].isEmpty() || zArr[i16];
                    boolean[] zArr2 = u7Var.u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i16] = z10;
                    u7Var.s[i16] = z10 ? null : starsStatus.next_offset;
                    u7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 6:
                Context context = (Context) this.c;
                int i18 = this.b;
                we.e.s(context, "https://" + MessagesController.getInstance(i18).linkPrefix + "/nft/" + ((String) this.d));
                break;
            case 7:
                ig.s sVar = (ig.s) this.c;
                t5 t5Var = (t5) this.d;
                int i19 = this.b;
                Editable text = sVar.n.getText();
                int spanStart = text.getSpanStart(t5Var);
                int spanEnd = text.getSpanEnd(t5Var);
                int i20 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.n.getText().delete(spanStart, spanEnd);
                    ig.p pVar = sVar.n;
                    pVar.setSelection(Math.min(i19 - i20, pVar.getText().length()));
                    break;
                }
                break;
            case 8:
                ((d1) this.c).B.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 9:
                TLObject tLObject2 = (TLObject) this.c;
                int i21 = this.b;
                da0 da0Var = (da0) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i21) {
                            da0Var.accept(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                da0Var.accept(null);
                break;
            case 10:
                z8 z8Var = (z8) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i22 = this.b;
                i9 i9Var = z8Var.d;
                y8 y8Var = i9Var.j0;
                int i23 = i9Var.h;
                y8Var.w0 = arrayList2;
                y8Var.u0 = i23;
                y8Var.setAdapter(null);
                y8Var.setAdapter(y8Var.v0);
                y8Var.setCurrentItem(i22);
                y8Var.y0 = true;
                break;
            case 11:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 12:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 13:
                f6 f6Var = (f6) this.c;
                yf.l lVar = (yf.l) this.d;
                int i24 = this.b;
                if (f6Var.K0.getCurrentBrush() instanceof yf.l) {
                    f6Var.Y0 = true;
                }
                f6Var.l(lVar);
                r1 r1Var = f6Var.g1;
                int i25 = r1Var.d + 1;
                r1Var.a(i25);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.a[i25], i24);
                r1Var.e = true;
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new w1(this.b, ((MessagesStorage) this.c).getUsers(new ArrayList<>((HashSet) this.d)), 10));
                break;
            case 15:
                ((vb) this.c).b((short[]) this.d, this.b);
                break;
            case 16:
                int[] iArr3 = (int[]) this.c;
                int i26 = this.b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i26).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i26).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    break;
                }
                break;
            case 17:
                nh.e4 e4Var2 = (nh.e4) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i27 = this.b;
                x3 x3Var = e4Var2.n;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    e4Var2.x = tL_webViewResultUrl.query_id;
                    if (tL_webViewResultUrl.same_origin) {
                        x3Var.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    x3Var.r(i27, tL_webViewResultUrl.url);
                    AndroidUtilities.runOnUIThread(e4Var2.Q);
                    break;
                }
                break;
            case 18:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 19:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 20:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 21:
                int i28 = this.b;
                Context context2 = (Context) this.c;
                e3[] e3VarArr = (e3[]) this.d;
                String str = MessagesController.getInstance(i28).freezeAppealUrl;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    str = "https://".concat(str);
                }
                we.e.s(context2, str);
                e3VarArr[0].dismiss();
                break;
            case 22:
                m4 m4Var = (m4) this.c;
                String str2 = (String) this.d;
                int i29 = this.b;
                HashMap hashMap = new HashMap(m4Var.q0[0].c.w);
                ArrayList arrayList3 = new ArrayList(m4Var.q0[0].c.x);
                m4Var.R0 = null;
                Utilities.searchQueue.postRunnable(new e1(m4Var, arrayList3, hashMap, str2, i29, 11));
                break;
            case 23:
                m4 m4Var2 = (m4) this.c;
                int i30 = this.b;
                we.d dVar = (we.d) this.d;
                if (m4Var2.D0 == i30 && m4Var2.B0 != 0) {
                    ConnectionsManager.getInstance(m4Var2.T).cancelRequest(m4Var2.B0, false);
                    m4Var2.B0 = 0;
                }
                if (m4Var2.I0 == dVar) {
                    m4Var2.I0 = null;
                    break;
                }
                break;
            case 24:
                int i31 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesController.getInstance(i31).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i31).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 25:
                k4 k4Var = (k4) this.c;
                int i32 = this.b;
                int[] iArr4 = (int[]) this.d;
                k4Var.F = i32;
                k4Var.E = iArr4;
                k4Var.H.f0();
                break;
            case 26:
                String str3 = (String) this.c;
                int i33 = this.b;
                e3[] e3VarArr2 = (e3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse(str3);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                e2.h(LaunchActivity.C1, i33, tL_inputGroupCallSlug, false, null, null);
                e3VarArr2[0].dismiss();
                break;
            case 27:
                ((rn) this.c).Ka((ArrayList) this.d, this.b, false, false);
                break;
            case 28:
                rn rnVar = (rn) this.c;
                int i34 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                rnVar.t0.v0(0, i34, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new ah(i10, editTextBoldCursor), 100L);
                break;
            default:
                ul ulVar = (ul) this.c;
                v0 v0Var = (v0) this.d;
                int i35 = this.b;
                ulVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                dm dmVar = ulVar.a;
                dmVar.M.j(i35, messageObject.getId(), true, messageObject.getDialogId() == dmVar.M.H6 ? 1 : 0, true, 0);
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ i(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ i(k4 k4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 25;
        this.c = k4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
