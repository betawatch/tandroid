package ah;

import ai.c6;
import ai.d6;
import ai.e6;
import ai.ga;
import ai.u6;
import ai.ua;
import ai.ub;
import ai.x5;
import ai.x6;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.Editable;
import android.util.Pair;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import ci.aa;
import ci.q9;
import ci.r9;
import ei.f6;
import ei.yb;
import gi.f4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ki.e3;
import ki.o5;
import ki.r5;
import ki.w5;
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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import org.telegram.ui.l4;
import rg.r1;
import w7.z5;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object, n2.l] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 8;
        int i11 = 0;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.c;
                a6 a6Var = (a6) this.d;
                int i12 = this.b;
                Editable text = a0Var.n.getText();
                int spanStart = text.getSpanStart(a6Var);
                int spanEnd = text.getSpanEnd(a6Var);
                int i13 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    a0Var.n.getText().delete(spanStart, spanEnd);
                    w wVar = a0Var.n;
                    wVar.setSelection(Math.min(i12 - i13, wVar.getText().length()));
                    break;
                }
                break;
            case 1:
                e6 e6Var = (e6) this.c;
                int i14 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = e6Var.V;
                ai.a6 a6Var2 = e6Var.f;
                x5 x5Var = e6Var.h;
                int i15 = 2;
                if (starGift == null) {
                    FrameLayout frameLayout = new FrameLayout(e6Var.getContext());
                    yj0 yj0Var = new yj0(e6Var.getContext());
                    yj0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout.addView(yj0Var, z5.e(32, 32, 17));
                    yj0Var.setScaleX(0.5f);
                    yj0Var.setScaleY(0.5f);
                    yj0Var.setAlpha(0.0f);
                    yj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    e6Var.l0 = yj0Var;
                    frameLayout.setBackground(new u6(AndroidUtilities.dp(12.0f), h6.m1(0.075f, -1)));
                    x5Var.a[i14].setVisibility(8);
                    frameLayout.setRotation(180.0f);
                    x5Var.f(i14, frameLayout);
                    e6Var.F.a(iArr[2], iArr[3]);
                    d6 d6Var = e6Var.b;
                    int[] iArr2 = e6Var.U;
                    d6Var.a(iArr2[2], iArr2[3]);
                    a6Var2.a(iArr[3], iArr[2]);
                    break;
                } else {
                    c6 c6Var = new c6(e6Var.getContext());
                    c6Var.a(starGift, false);
                    c6Var.setRotation(180.0f);
                    x5Var.f(i14, c6Var);
                    c6Var.setScaleX(0.5f);
                    c6Var.setScaleY(0.5f);
                    c6Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = c6Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    bs bsVar = bs.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(bsVar);
                    interpolator.setUpdateListener(new c0(e6Var, i15));
                    interpolator.start();
                    x5Var.a[i14].setVisibility(8);
                    a6Var2.setVisibility(0);
                    a6Var2.setAlpha(0.0f);
                    a6Var2.animate().alpha(0.5f).setDuration(820L).setInterpolator(bsVar).start();
                    break;
                }
            case 2:
                ((Utilities.Callback3) this.d).run(LocaleController.formatString(R.string.Gift2RarityHint, gi.l.H0(this.b)), (x6) this.c, Boolean.FALSE);
                break;
            case 3:
                ga gaVar = (ga) this.c;
                int i16 = this.b;
                TLObject tLObject = (TLObject) this.d;
                boolean[] zArr = gaVar.r;
                ArrayList[] arrayListArr = gaVar.q;
                int i17 = gaVar.a;
                gaVar.t[i16] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    MessagesController.getInstance(i17).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i17).putChats(starsStatus.chats, false);
                    arrayListArr[i16].addAll(starsStatus.history);
                    zArr[i16] = !arrayListArr[i16].isEmpty() || zArr[i16];
                    boolean[] zArr2 = gaVar.u;
                    boolean z10 = (starsStatus.flags & 1) == 0;
                    zArr2[i16] = z10;
                    gaVar.s[i16] = z10 ? null : starsStatus.next_offset;
                    gaVar.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 4:
                Context context = (Context) this.c;
                int i18 = this.b;
                pf.d.r(context, "https://" + MessagesController.getInstance(i18).linkPrefix + "/nft/" + ((String) this.d));
                break;
            case 5:
                ((ci.h1) this.c).F.put((String) this.d, Integer.valueOf(this.b));
                break;
            case 6:
                TLObject tLObject2 = (TLObject) this.c;
                int i19 = this.b;
                ua uaVar = (ua) this.d;
                if (tLObject2 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList = ((TL_stories.TL_albums) tLObject2).albums;
                    int size = arrayList.size();
                    while (i11 < size) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList.get(i11);
                        i11++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i19) {
                            uaVar.run(tL_storyAlbum2);
                            break;
                        }
                    }
                }
                uaVar.run(null);
                break;
            case 7:
                r9 r9Var = (r9) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                int i20 = this.b;
                aa aaVar = r9Var.d;
                q9 q9Var = aaVar.n0;
                int i21 = aaVar.h;
                q9Var.A0 = arrayList2;
                q9Var.y0 = i21;
                q9Var.setAdapter(null);
                q9Var.setAdapter(q9Var.z0);
                q9Var.setCurrentItem(i20);
                q9Var.C0 = true;
                break;
            case 8:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i22 = this.b;
                e2.o oVar = (e2.o) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    e2.q qVar = (e2.q) it.next();
                    if (!qVar.d) {
                        if (i22 != -1) {
                            qVar.b.b(i22);
                        }
                        qVar.c = true;
                        oVar.invoke(qVar.a);
                    }
                }
                break;
            case 9:
                ((FfmpegAudioWaveformLoader) this.c).lambda$new$0((String) this.d, this.b);
                break;
            case 10:
                ((FfmpegAudioWaveformLoader) this.c).lambda$receiveChunk$1((short[]) this.d, this.b);
                break;
            case 11:
                f6 f6Var = (f6) this.c;
                qg.l lVar = (qg.l) this.d;
                int i23 = this.b;
                if (f6Var.O0.getCurrentBrush() instanceof qg.l) {
                    f6Var.c1 = true;
                }
                f6Var.o(lVar);
                r1 r1Var = f6Var.k1;
                int i24 = r1Var.d + 1;
                r1Var.a(i24);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.a[i24], i23);
                r1Var.e = true;
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new g(this.b, ((MessagesStorage) this.c).getUsers(new ArrayList<>((HashSet) this.d)), i10));
                break;
            case 13:
                ((yb) this.c).b((short[]) this.d, this.b);
                break;
            case 14:
                int[] iArr3 = (int[]) this.c;
                int i25 = this.b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                if (iArr3[0] >= 0) {
                    ConnectionsManager.getInstance(i25).cancelRequest(iArr3[0], true);
                    iArr3[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i25).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    break;
                }
                break;
            case 15:
                f4 f4Var = (f4) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i26 = this.b;
                if (tLObject3 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject3;
                    f4Var.x = tL_webViewResultUrl.query_id;
                    f4Var.n.t(i26, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(f4Var.U);
                    break;
                }
                break;
            case 16:
                hg.h0 h0Var = (hg.h0) this.c;
                int i27 = this.b;
                String str = (String) this.d;
                int i28 = h0Var.s0;
                h0Var.r = null;
                if (i27 == h0Var.d0) {
                    if (h0Var.n >= 0) {
                        ConnectionsManager.getInstance(i28).cancelRequest(h0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    h0Var.n = ConnectionsManager.getInstance(i28).sendRequest(tL_channels_searchPosts, new hg.u(h0Var, i27, str, i11));
                    break;
                }
                break;
            case 17:
                i2.f1 f1Var = (i2.f1) this.c;
                Pair pair = (Pair) this.d;
                f1Var.b.h.a(((Integer) pair.first).intValue(), (u2.g0) pair.second, this.b);
                break;
            case 18:
                ig.y yVar = (ig.y) this.c;
                yVar.b.add(this.b, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(yVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 19:
                o5 o5Var = (o5) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i29 = this.b;
                r5 m10 = o5Var.getGrid().m(pagetablecell);
                if (m10 != null) {
                    ki.h1 h1Var = m10.a;
                    h1Var.r();
                    h1Var.setSelection(Math.max(0, Math.min(i29, h1Var.length())));
                    break;
                }
                break;
            case 20:
                w5 w5Var = (w5) this.c;
                ki.a aVar = (ki.a) this.d;
                int i30 = this.b;
                ki.c6 c6Var2 = w5Var.a;
                if (c6Var2.y != null) {
                    ki.c6.f(aVar.b, "");
                    ((e3) c6Var2.y).c(aVar, i30);
                    break;
                }
                break;
            case 21:
                n2.k kVar = (n2.k) this.c;
                this.d.a(kVar.a, kVar.b, this.b);
                break;
            case 22:
                ((View) this.d).postOnAnimation(new g((oh.a) this.c, this.b, 16));
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
                int i31 = this.b;
                Context context2 = (Context) this.c;
                f3[] f3VarArr = (f3[]) this.d;
                String str2 = MessagesController.getInstance(i31).freezeAppealUrl;
                if (!str2.startsWith("http://") && !str2.startsWith("https://")) {
                    str2 = "https://".concat(str2);
                }
                pf.d.r(context2, str2);
                f3VarArr[0].dismiss();
                break;
            case 27:
                l4 l4Var = (l4) this.c;
                String str3 = (String) this.d;
                int i32 = this.b;
                HashMap hashMap = new HashMap(l4Var.u0[0].c.w);
                ArrayList arrayList3 = new ArrayList(l4Var.u0[0].c.x);
                l4Var.V0 = null;
                Utilities.searchQueue.postRunnable(new ub(l4Var, arrayList3, hashMap, str3, i32, 15));
                break;
            case 28:
                l4 l4Var2 = (l4) this.c;
                int i33 = this.b;
                pf.c cVar = (pf.c) this.d;
                if (l4Var2.H0 == i33 && l4Var2.F0 != 0) {
                    ConnectionsManager.getInstance(l4Var2.X).cancelRequest(l4Var2.F0, false);
                    l4Var2.F0 = 0;
                }
                if (l4Var2.M0 == cVar) {
                    l4Var2.M0 = null;
                    break;
                }
                break;
            default:
                int i34 = this.b;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                MessagesController.getInstance(i34).putUsers(tL_chatInviteJoinResultWebView.users, false);
                BotGuardHelper.getInstance(i34).openGuardBotWebApp(-chat.id, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id);
                break;
        }
    }

    public /* synthetic */ o(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ o(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
