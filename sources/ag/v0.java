package ag;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bg.j3;
import bg.r2;
import i7.f6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import jh.c4;
import jh.e4;
import jh.f4;
import jh.g4;
import jh.i7;
import jh.s7;
import jh.t4;
import jh.w4;
import jh.z3;
import lh.i9;
import lh.y8;
import lh.z8;
import nh.jb;
import nh.t5;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.y71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.ca0;
import org.telegram.ui.em;
import org.telegram.ui.k4;
import org.telegram.ui.m4;
import org.telegram.ui.tn;
import org.telegram.ui.vl;
import org.telegram.ui.xg;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v0(int i10, Object obj, Object obj2, int i11) {
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
                f1 f1Var = (f1) this.c;
                f1Var.e((w1) this.d, this.b, f1Var.h);
                f1Var.h = null;
                break;
            case 1:
                bg.g1 g1Var = (bg.g1) this.c;
                l lVar = (l) this.d;
                int i11 = this.b;
                if (g1Var.S0.getCurrentBrush() instanceof l) {
                    g1Var.g1 = true;
                }
                g1Var.q(lVar);
                r2 r2Var = g1Var.p1;
                int i12 = r2Var.d + 1;
                r2Var.a(i12);
                AndroidUtilities.updateImageViewImageAnimated(r2Var.a[i12], i11);
                r2Var.e = true;
                break;
            case 2:
                ((e2.c) ((c2.b1) this.c).c).l0(this.b, this.d);
                break;
            case 3:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i13 = this.b;
                f5.j jVar = (f5.j) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    f5.l lVar2 = (f5.l) it.next();
                    if (!lVar2.d) {
                        if (i13 != -1) {
                            lVar2.b.b(i13);
                        }
                        lVar2.c = true;
                        jVar.invoke(lVar2.a);
                    }
                }
                break;
            case 4:
                gr0 gr0Var = (gr0) this.c;
                int i14 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                i7 i7Var = gr0Var.e;
                if (i14 != -1) {
                    int i15 = tL_starGiftCollection.collection_id;
                    int i16 = i7Var.a;
                    int f9 = i7Var.f(i15);
                    if (f9 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) i7Var.e.remove(f9);
                        i7Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i16).getInputPeer(i7Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i16).sendRequest(deletestargiftcollection, null);
                    }
                    gr0Var.f(true);
                    y71 y71Var = gr0Var.n;
                    if (i14 < i7Var.d().size()) {
                        i14++;
                    }
                    y71Var.d(-1, i14);
                    gr0Var.n();
                    break;
                }
                break;
            case 5:
                g4 g4Var = (g4) this.c;
                int i17 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = g4Var.R;
                c4 c4Var = g4Var.f;
                z3 z3Var = g4Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(g4Var.getContext());
                    aj0 aj0Var = new aj0(g4Var.getContext());
                    aj0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(aj0Var, f6.e(32, 32, 17));
                    aj0Var.setScaleX(0.5f);
                    aj0Var.setScaleY(0.5f);
                    aj0Var.setAlpha(0.0f);
                    aj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    g4Var.h0 = aj0Var;
                    frameLayout.setBackground(new t4(AndroidUtilities.dp(12.0f), g6.l1(0.075f, -1)));
                    z3Var.a[i17].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    z3Var.f(i17, frameLayout);
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
                    z3Var.f(i17, e4Var);
                    e4Var.setScaleX(0.5f);
                    e4Var.setScaleY(0.5f);
                    e4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = e4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    jr jrVar = jr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(jrVar);
                    interpolator.setUpdateListener(new bg.q1(g4Var, 12));
                    interpolator.start();
                    z3Var.a[i17].setVisibility(8);
                    c4Var.setVisibility(0);
                    c4Var.setAlpha(0.0f);
                    c4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(jrVar).start();
                    break;
                }
            case 6:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, ph.j.G0(this.b)), (w4) this.c, Boolean.FALSE);
                break;
            case 7:
                s7 s7Var = (s7) this.c;
                int i18 = this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = s7Var.r;
                ArrayList[] arrayListArr = s7Var.q;
                int i19 = s7Var.a;
                s7Var.t[i18] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i19).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i19).putChats(starsStatus.chats, false);
                    arrayListArr[i18].addAll(starsStatus.history);
                    zArr[i18] = !arrayListArr[i18].isEmpty() || zArr[i18];
                    boolean[] zArr2 = s7Var.u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i18] = z10;
                    s7Var.s[i18] = z10 ? null : starsStatus.next_offset;
                    s7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i19).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 8:
                Context context = (Context) this.c;
                int i20 = this.b;
                ye.d.s(context, "https://" + MessagesController.getInstance(i20).linkPrefix + "/nft/" + ((String) this.d));
                break;
            case 9:
                kg.s sVar = (kg.s) this.c;
                y5 y5Var = (y5) this.d;
                int i21 = this.b;
                Editable text = sVar.n.getText();
                int spanStart = text.getSpanStart(y5Var);
                int spanEnd = text.getSpanEnd(y5Var);
                int i22 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.n.getText().delete(spanStart, spanEnd);
                    kg.p pVar = sVar.n;
                    pVar.setSelection(Math.min(i21 - i22, pVar.getText().length()));
                    break;
                }
                break;
            case 10:
                ((lh.d1) this.c).B.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 11:
                TLObject tLObject2 = (TLObject) this.c;
                int i23 = this.b;
                ca0 ca0Var = (ca0) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i23) {
                            ca0Var.accept(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                ca0Var.accept(null);
                break;
            case 12:
                z8 z8Var = (z8) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i24 = this.b;
                i9 i9Var = z8Var.d;
                y8 y8Var = i9Var.j0;
                int i25 = i9Var.h;
                y8Var.w0 = arrayList2;
                y8Var.u0 = i25;
                y8Var.setAdapter(null);
                y8Var.setAdapter(y8Var.v0);
                y8Var.setCurrentItem(i24);
                y8Var.y0 = true;
                break;
            case 13:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 14:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 15:
                t5 t5Var = (t5) this.c;
                l lVar3 = (l) this.d;
                int i26 = this.b;
                if (t5Var.K0.getCurrentBrush() instanceof l) {
                    t5Var.Y0 = true;
                }
                t5Var.q(lVar3);
                r2 r2Var2 = t5Var.g1;
                int i27 = r2Var2.d + 1;
                r2Var2.a(i27);
                AndroidUtilities.updateImageViewImageAnimated(r2Var2.a[i27], i26);
                r2Var2.e = true;
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new bg.f(this.b, ((MessagesStorage) this.c).getUsers(new ArrayList<>((HashSet) this.d)), 13));
                break;
            case 17:
                ((jb) this.c).b((short[]) this.d, this.b);
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
                f3[] f3VarArr = (f3[]) this.d;
                String str = MessagesController.getInstance(i28).freezeAppealUrl;
                if (!str.startsWith("http://") && !str.startsWith("https://")) {
                    str = "https://".concat(str);
                }
                ye.d.s(context2, str);
                f3VarArr[0].dismiss();
                break;
            case 22:
                m4 m4Var = (m4) this.c;
                String str2 = (String) this.d;
                int i29 = this.b;
                HashMap hashMap = new HashMap(m4Var.q0[0].c.w);
                ArrayList arrayList3 = new ArrayList(m4Var.q0[0].c.x);
                m4Var.R0 = null;
                Utilities.searchQueue.postRunnable(new j3(m4Var, arrayList3, hashMap, str2, i29));
                break;
            case 23:
                m4 m4Var2 = (m4) this.c;
                int i30 = this.b;
                ye.c cVar = (ye.c) this.d;
                if (m4Var2.D0 == i30 && m4Var2.B0 != 0) {
                    ConnectionsManager.getInstance(m4Var2.T).cancelRequest(m4Var2.B0, false);
                    m4Var2.B0 = 0;
                }
                if (m4Var2.I0 == cVar) {
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
                int[] iArr3 = (int[]) this.d;
                k4Var.F = i32;
                k4Var.E = iArr3;
                k4Var.H.f0();
                break;
            case 26:
                String str3 = (String) this.c;
                int i33 = this.b;
                f3[] f3VarArr2 = (f3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse(str3);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.h2.h(LaunchActivity.C1, i33, tL_inputGroupCallSlug, false, null, null);
                f3VarArr2[0].dismiss();
                break;
            case 27:
                ((tn) this.c).Ka((ArrayList) this.d, this.b, false, false);
                break;
            case 28:
                tn tnVar = (tn) this.c;
                int i34 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                tnVar.t0.v0(0, i34, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new xg(i10, editTextBoldCursor), 100L);
                break;
            default:
                vl vlVar = (vl) this.c;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.d;
                int i35 = this.b;
                vlVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                em emVar = vlVar.a;
                emVar.M.j(i35, messageObject.getId(), true, messageObject.getDialogId() == emVar.M.H6 ? 1 : 0, true, 0);
                break;
        }
    }

    public /* synthetic */ v0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ v0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ v0(k4 k4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 25;
        this.c = k4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
