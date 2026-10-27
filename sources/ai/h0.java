package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bi.ca;
import bi.p6;
import bi.s5;
import bi.s6;
import bi.sb;
import bi.ua;
import bi.v5;
import bi.x5;
import bi.y5;
import bi.z5;
import di.o9;
import di.p9;
import di.y9;
import fi.e6;
import fi.vb;
import hi.o4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import li.d3;
import li.d6;
import li.p5;
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
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.j4;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h0(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.Object, n2.k] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                o0.p((r2) this.c, this.b + 1, (j0) this.d);
                break;
            case 1:
                bh.u uVar = (bh.u) this.c;
                c6 c6Var = (c6) this.d;
                int i11 = this.b;
                Editable text = uVar.h.getText();
                int spanStart = text.getSpanStart(c6Var);
                int spanEnd = text.getSpanEnd(c6Var);
                int i12 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    uVar.h.getText().delete(spanStart, spanEnd);
                    bh.q qVar = uVar.h;
                    qVar.setSelection(Math.min(i11 - i12, qVar.getText().length()));
                    break;
                }
                break;
            case 2:
                z5 z5Var = (z5) this.c;
                int i13 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = z5Var.V;
                v5 v5Var = z5Var.f;
                s5 s5Var = z5Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(z5Var.getContext());
                    bk0 bk0Var = new bk0(z5Var.getContext());
                    bk0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(bk0Var, kb1.i(32, 32, 17));
                    bk0Var.setScaleX(0.5f);
                    bk0Var.setScaleY(0.5f);
                    bk0Var.setAlpha(0.0f);
                    bk0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    z5Var.l0 = bk0Var;
                    frameLayout.setBackground(new p6(AndroidUtilities.dp(12.0f), y6.o1(0.075f, -1)));
                    s5Var.a[i13].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    s5Var.f(i13, frameLayout);
                    z5Var.F.a(iArr[2], iArr[3]);
                    y5 y5Var = z5Var.b;
                    int[] iArr2 = z5Var.U;
                    y5Var.a(iArr2[2], iArr2[3]);
                    v5Var.a(iArr[3], iArr[2]);
                    break;
                } else {
                    x5 x5Var = new x5(z5Var.getContext());
                    x5Var.a(starGift, false);
                    x5Var.setRotation(180.0f);
                    s5Var.f(i13, x5Var);
                    x5Var.setScaleX(0.5f);
                    x5Var.setScaleY(0.5f);
                    x5Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = x5Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    ds dsVar = ds.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(dsVar);
                    interpolator.setUpdateListener(new g0(z5Var, 4));
                    interpolator.start();
                    s5Var.a[i13].setVisibility(8);
                    v5Var.setVisibility(0);
                    v5Var.setAlpha(0.0f);
                    v5Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(dsVar).start();
                    break;
                }
            case 3:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, hi.k.F0(this.b)), (s6) this.c, Boolean.FALSE);
                break;
            case 4:
                ca caVar = (ca) this.c;
                int i14 = this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = caVar.r;
                ArrayList[] arrayListArr = caVar.q;
                int i15 = caVar.a;
                caVar.t[i14] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                    arrayListArr[i14].addAll(starsStatus.history);
                    zArr[i14] = !arrayListArr[i14].isEmpty() || zArr[i14];
                    boolean[] zArr2 = caVar.u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i14] = z10;
                    caVar.s[i14] = z10 ? null : starsStatus.next_offset;
                    caVar.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 5:
                Context context = (Context) this.c;
                int i16 = this.b;
                qf.d.r(context, "https://" + MessagesController.getInstance(i16).linkPrefix + "/nft/" + ((String) this.d));
                break;
            case 6:
                ((di.h1) this.c).F.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 7:
                TLObject tLObject2 = (TLObject) this.c;
                int i17 = this.b;
                ua uaVar = (ua) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i10 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i10);
                        i10++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i17) {
                            uaVar.run(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                uaVar.run(null);
                break;
            case 8:
                p9 p9Var = (p9) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i18 = this.b;
                y9 y9Var = p9Var.d;
                o9 o9Var = y9Var.n0;
                int i19 = y9Var.h;
                o9Var.A0 = arrayList2;
                o9Var.y0 = i19;
                o9Var.setAdapter(null);
                o9Var.setAdapter(o9Var.z0);
                o9Var.setCurrentItem(i18);
                o9Var.C0 = true;
                break;
            case 9:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i20 = this.b;
                e2.o oVar = (e2.o) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    e2.q qVar2 = (e2.q) it.next();
                    if (!qVar2.d) {
                        if (i20 != -1) {
                            qVar2.b.b(i20);
                        }
                        qVar2.c = true;
                        oVar.invoke(qVar2.a);
                    }
                }
                break;
            case 10:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 11:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 12:
                e6 e6Var = (e6) this.c;
                rg.l lVar = (rg.l) this.d;
                int i21 = this.b;
                if (e6Var.D0.getCurrentBrush() instanceof rg.l) {
                    e6Var.R0 = true;
                }
                e6Var.i(lVar);
                sg.s1 s1Var = e6Var.Z0;
                int i22 = s1Var.d + 1;
                s1Var.a(i22);
                AndroidUtilities.updateImageViewImageAnimated(s1Var.a[i22], i21);
                s1Var.e = true;
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ag.r0(this.b, ((MessagesStorage) this.c).getUsers(new ArrayList<>((HashSet) this.d)), 9));
                break;
            case 14:
                ((vb) this.c).b((short[]) this.d, this.b);
                break;
            case 15:
                int[] iArr3 = (int[]) this.c;
                int i23 = this.b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i23).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i23).removeObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    break;
                }
                break;
            case 16:
                o4 o4Var = (o4) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i24 = this.b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    o4Var.x = tL_webViewResultUrl.query_id;
                    o4Var.n.t(i24, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(o4Var.U);
                    break;
                }
                break;
            case 17:
                i2.g1 g1Var = (i2.g1) this.c;
                Pair pair = (Pair) this.d;
                g1Var.b.h.a(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.b);
                break;
            case 18:
                ig.i0 i0Var = (ig.i0) this.c;
                int i25 = this.b;
                String str = (String) this.d;
                int i26 = i0Var.s0;
                i0Var.r = null;
                if (i25 == i0Var.d0) {
                    if (i0Var.n >= 0) {
                        ConnectionsManager.getInstance(i26).cancelRequest(i0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    i0Var.n = ConnectionsManager.getInstance(i26).sendRequest(tL_channels_searchPosts, new ig.u(i0Var, i25, str, i10));
                    break;
                }
                break;
            case 19:
                jg.z zVar = (jg.z) this.c;
                zVar.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(zVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 20:
                p5 p5Var = (p5) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i27 = this.b;
                li.s5 m10 = p5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    li.g1 g1Var2 = m10.a;
                    g1Var2.r();
                    g1Var2.setSelection(Math.max(0, Math.min(i27, g1Var2.length())));
                    break;
                }
                break;
            case 21:
                li.x5 x5Var2 = (li.x5) this.c;
                li.a aVar = (li.a) this.d;
                int i28 = this.b;
                d6 d6Var = x5Var2.a;
                if (d6Var.y != null) {
                    d6.e(aVar.b, "");
                    ((d3) d6Var.y).c(aVar, i28);
                    break;
                }
                break;
            case 22:
                n2.j jVar = (n2.j) this.c;
                this.d.a(jVar.a, jVar.b, this.b);
                break;
            case 23:
                ((CameraView) this.c).lambda$createCamera$13(this.b, (SurfaceTexture) this.d);
                break;
            case 24:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                break;
            case 25:
                ((VoIPService) this.c).lambda$createGroupInstance$74((String) this.d, this.b);
                break;
            case 26:
                int i29 = this.b;
                Context context2 = (Context) this.c;
                k3[] k3VarArr = (k3[]) this.d;
                String str2 = MessagesController.getInstance(i29).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                qf.d.r(context2, str2);
                k3VarArr[0].dismiss();
                break;
            case 27:
                j4 j4Var = (j4) this.c;
                String str3 = (String) this.d;
                int i30 = this.b;
                HashMap hashMap = new HashMap(j4Var.u0[0].c.w);
                ArrayList arrayList3 = new ArrayList(j4Var.u0[0].c.x);
                j4Var.W0 = null;
                Utilities.searchQueue.postRunnable(new sb(j4Var, arrayList3, hashMap, str3, i30, 15));
                break;
            case 28:
                j4 j4Var2 = (j4) this.c;
                int i31 = this.b;
                qf.c cVar = (qf.c) this.d;
                if (j4Var2.I0 == i31 && j4Var2.G0 != 0) {
                    ConnectionsManager.getInstance(j4Var2.X).cancelRequest(j4Var2.G0, false);
                    j4Var2.G0 = 0;
                }
                if (j4Var2.N0 == cVar) {
                    j4Var2.N0 = null;
                    break;
                }
                break;
            default:
                int i32 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesController.getInstance(i32).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i32).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
        }
    }

    public /* synthetic */ h0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ h0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
