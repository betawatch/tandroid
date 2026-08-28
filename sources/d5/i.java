package d5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.Editable;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bg.c2;
import bg.q0;
import c2.a1;
import fh.g1;
import g7.e6;
import gh.b4;
import gh.e4;
import gh.g4;
import gh.h4;
import gh.i4;
import gh.l7;
import gh.v7;
import gh.w4;
import gh.z4;
import ih.c9;
import ih.d9;
import ih.f1;
import ih.m9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kh.g6;
import kh.zb;
import mh.z3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.LocaleController;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.j4;
import org.telegram.ui.l4;
import org.telegram.ui.qn;
import org.telegram.ui.yg;
import org.telegram.ui.z90;
import yf.r1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(int i9, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.b = i9;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = 3;
        char c10 = 1;
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
                ((e2.d) ((a1) this.c).c).g(this.b, this.d);
                break;
            case 2:
                vq0 vq0Var = (vq0) this.c;
                int i12 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                l7 l7Var = vq0Var.e;
                if (i12 != -1) {
                    int i13 = tL_starGiftCollection.collection_id;
                    int i14 = l7Var.a;
                    int f10 = l7Var.f(i13);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) l7Var.e.remove(f10);
                        l7Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i14).getInputPeer(l7Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i14).sendRequest(deletestargiftcollection, null);
                    }
                    vq0Var.f(true);
                    m71 m71Var = vq0Var.n;
                    if (i12 < l7Var.d().size()) {
                        i12++;
                    }
                    m71Var.d(-1, i12);
                    vq0Var.n();
                    break;
                }
                break;
            case 3:
                i4 i4Var = (i4) this.c;
                int i15 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = i4Var.R;
                e4 e4Var = i4Var.f;
                b4 b4Var = i4Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(i4Var.getContext());
                    pi0 pi0Var = new pi0(i4Var.getContext());
                    pi0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(pi0Var, e6.e(32, 32, 17));
                    pi0Var.setScaleX(0.5f);
                    pi0Var.setScaleY(0.5f);
                    pi0Var.setAlpha(0.0f);
                    pi0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    i4Var.h0 = pi0Var;
                    frameLayout.setBackground(new w4(AndroidUtilities.dp(12.0f), f6.l1(0.075f, -1)));
                    b4Var.a[i15].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    b4Var.f(i15, frameLayout);
                    i4Var.B.a(iArr[2], iArr[3]);
                    h4 h4Var = i4Var.b;
                    int[] iArr2 = i4Var.Q;
                    h4Var.a(iArr2[2], iArr2[3]);
                    e4Var.a(iArr[3], iArr[2]);
                    break;
                } else {
                    g4 g4Var = new g4(i4Var.getContext());
                    g4Var.a(starGift, false);
                    g4Var.setRotation(180.0f);
                    b4Var.f(i15, g4Var);
                    g4Var.setScaleX(0.5f);
                    g4Var.setScaleY(0.5f);
                    g4Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = g4Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    gr grVar = gr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(grVar);
                    interpolator.setUpdateListener(new bg.b(i4Var, i9));
                    interpolator.start();
                    b4Var.a[i15].setVisibility(8);
                    e4Var.setVisibility(0);
                    e4Var.setAlpha(0.0f);
                    e4Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(grVar).start();
                    break;
                }
            case 4:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, mh.l.F0(this.b)), (z4) this.c, Boolean.FALSE);
                break;
            case 5:
                v7 v7Var = (v7) this.c;
                int i16 = this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = v7Var.r;
                ArrayList[] arrayListArr = v7Var.q;
                int i17 = v7Var.a;
                v7Var.t[i16] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i17).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i17).putChats(starsStatus.chats, false);
                    arrayListArr[i16].addAll(starsStatus.history);
                    zArr[i16] = !arrayListArr[i16].isEmpty() || zArr[i16];
                    boolean[] zArr2 = v7Var.u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i16] = z10;
                    v7Var.s[i16] = z10 ? null : starsStatus.next_offset;
                    v7Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 6:
                Context context = (Context) this.c;
                int i18 = this.b;
                ve.e.s(context, "https://" + MessagesController.getInstance(i18).linkPrefix + "/nft/" + ((String) this.d));
                break;
            case 7:
                hg.s sVar = (hg.s) this.c;
                t5 t5Var = (t5) this.d;
                int i19 = this.b;
                Editable text = sVar.n.getText();
                int spanStart = text.getSpanStart(t5Var);
                int spanEnd = text.getSpanEnd(t5Var);
                int i20 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    sVar.n.getText().delete(spanStart, spanEnd);
                    hg.p pVar = sVar.n;
                    pVar.setSelection(Math.min(i19 - i20, pVar.getText().length()));
                    break;
                }
                break;
            case 8:
                ((f1) this.c).B.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 9:
                TLObject tLObject2 = (TLObject) this.c;
                int i21 = this.b;
                z90 z90Var = (z90) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i21) {
                            z90Var.accept(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                z90Var.accept(null);
                break;
            case 10:
                d9 d9Var = (d9) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i22 = this.b;
                m9 m9Var = d9Var.d;
                c9 c9Var = m9Var.j0;
                int i23 = m9Var.h;
                c9Var.w0 = arrayList2;
                c9Var.u0 = i23;
                c9Var.setAdapter(null);
                c9Var.setAdapter(c9Var.v0);
                c9Var.setCurrentItem(i22);
                c9Var.y0 = true;
                break;
            case 11:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 12:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 13:
                g6 g6Var = (g6) this.c;
                xf.l lVar = (xf.l) this.d;
                int i24 = this.b;
                if (g6Var.K0.getCurrentBrush() instanceof xf.l) {
                    g6Var.Y0 = true;
                }
                g6Var.n(lVar);
                r1 r1Var = g6Var.g1;
                int i25 = r1Var.d + 1;
                r1Var.a(i25);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.a[i25], i24);
                r1Var.e = true;
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new c2(this.b, ((MessagesStorage) this.c).getUsers(new ArrayList<>((HashSet) this.d)), 10));
                break;
            case 15:
                ((zb) this.c).b((short[]) this.d, this.b);
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
                mh.g4 g4Var2 = (mh.g4) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i27 = this.b;
                z3 z3Var = g4Var2.n;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    g4Var2.x = tL_webViewResultUrl.query_id;
                    if (tL_webViewResultUrl.same_origin) {
                        z3Var.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    z3Var.r(i27, tL_webViewResultUrl.url);
                    AndroidUtilities.runOnUIThread(g4Var2.Q);
                    break;
                }
                break;
            case 18:
                of.f0 f0Var = (of.f0) this.c;
                int i28 = this.b;
                String str = (String) this.d;
                int i29 = f0Var.o0;
                f0Var.r = null;
                if (i28 == f0Var.Z) {
                    if (f0Var.n >= 0) {
                        ConnectionsManager.getInstance(i29).cancelRequest(f0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    f0Var.n = ConnectionsManager.getInstance(i29).sendRequest(tL_channels_searchPosts, new q0(f0Var, i28, str, c10 == true ? 1 : 0));
                    break;
                }
                break;
            case 19:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 20:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 21:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 22:
                int i30 = this.b;
                Context context2 = (Context) this.c;
                f3[] f3VarArr = (f3[]) this.d;
                String str2 = MessagesController.getInstance(i30).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                ve.e.s(context2, str2);
                f3VarArr[0].dismiss();
                break;
            case 23:
                l4 l4Var = (l4) this.c;
                String str3 = (String) this.d;
                int i31 = this.b;
                HashMap hashMap = new HashMap(l4Var.q0[0].c.w);
                ArrayList arrayList3 = new ArrayList(l4Var.q0[0].c.x);
                l4Var.R0 = null;
                Utilities.searchQueue.postRunnable(new g1(l4Var, arrayList3, hashMap, str3, i31, 13));
                break;
            case 24:
                l4 l4Var2 = (l4) this.c;
                int i32 = this.b;
                ve.d dVar = (ve.d) this.d;
                if (l4Var2.D0 == i32 && l4Var2.B0 != 0) {
                    ConnectionsManager.getInstance(l4Var2.T).cancelRequest(l4Var2.B0, false);
                    l4Var2.B0 = 0;
                }
                if (l4Var2.I0 == dVar) {
                    l4Var2.I0 = null;
                    break;
                }
                break;
            case 25:
                int i33 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesController.getInstance(i33).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i33).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
            case 26:
                j4 j4Var = (j4) this.c;
                int i34 = this.b;
                int[] iArr4 = (int[]) this.d;
                j4Var.F = i34;
                j4Var.E = iArr4;
                j4Var.H.f0();
                break;
            case 27:
                String str4 = (String) this.c;
                int i35 = this.b;
                f3[] f3VarArr2 = (f3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                Uri parse = Uri.parse(str4);
                tL_inputGroupCallSlug.slug = parse.getPathSegments().get(parse.getPathSegments().size() - 1);
                e2.h(LaunchActivity.C1, i35, tL_inputGroupCallSlug, false, null, null);
                f3VarArr2[0].dismiss();
                break;
            case 28:
                ((qn) this.c).Ka((ArrayList) this.d, this.b, false, false);
                break;
            default:
                qn qnVar = (qn) this.c;
                int i36 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                qnVar.t0.v0(0, i36, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new yg(i10, editTextBoldCursor), 100L);
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
    }

    public /* synthetic */ i(Object obj, Object obj2, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
    }

    public /* synthetic */ i(j4 j4Var, int i9, int[] iArr, int[] iArr2) {
        this.a = 26;
        this.c = j4Var;
        this.b = i9;
        this.d = iArr2;
    }
}
