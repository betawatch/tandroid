package ki;

import a8.b8;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Handler;
import android.text.Editable;
import android.util.Pair;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import oi.a6;
import oi.k5;
import oi.s5;
import oi.v5;
import oi.x5;
import oi.y5;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.hp;
import org.telegram.messenger.ns;
import org.telegram.messenger.q10;
import org.telegram.messenger.s10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w7;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.y7;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        xe xeVar;
        Editable text;
        int i7 = 6;
        int i10 = 0;
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                HashMap hashMap = (HashMap) this.c;
                z10 z10Var = (z10) this.d;
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    TLRPC.User user = (TLRPC.User) arrayList.get(i11);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    q qVar = new q();
                    qVar.a = user;
                    qVar.b = z10;
                    arrayList2.add(qVar);
                }
                z10Var.a(arrayList2);
                return;
            case 1:
                boolean[] zArr = (boolean[]) this.b;
                TLObject tLObject = (TLObject) this.c;
                p1 p1Var = (p1) this.d;
                zArr[0] = false;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    p1Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                s2 s2Var = (s2) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                x2 x2Var = s2Var.d;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    new cc(x2Var.r0, x2Var.G).Y(tL_error).k(true);
                    return;
                }
                p2 p2Var = x2Var.E;
                p2Var.getClass();
                p2Var.y("emoji_status_access_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                return;
            case 3:
                n3 n3Var = (n3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                cc.a0(n3Var).I(R.raw.copy, hd.M0(2131754333, null), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131754334, k.J0(connectedbotstarref.commission_permille), q10.p(user2)))).j();
                return;
            case 4:
                n3.D0((n3) this.b, (TLObject) this.c, (org.telegram.ui.ActionBar.t1) this.d);
                return;
            case 5:
                l2.w0 w0Var = (l2.w0) this.b;
                h9.f0 f0Var = (h9.f0) this.c;
                x2.f0 f0Var2 = (x2.f0) this.d;
                m2.e eVar = w0Var.c;
                h9.s1 f10 = f0Var.f();
                b8 b8Var = eVar.d;
                e2.c1 c1Var = eVar.h;
                c1Var.getClass();
                b8Var.getClass();
                b8Var.b = h9.i0.q(f10);
                if (!f10.isEmpty()) {
                    b8Var.e = (x2.f0) f10.get(0);
                    f0Var2.getClass();
                    b8Var.f = f0Var2;
                }
                if (((x2.f0) b8Var.d) == null) {
                    b8Var.d = b8.f(c1Var, (h9.i0) b8Var.b, (x2.f0) b8Var.e, (e2.i1) b8Var.a);
                }
                b8Var.s(c1Var.y0());
                return;
            case 6:
                l2.c1 c1Var2 = (l2.c1) this.b;
                Pair pair = (Pair) this.c;
                c1Var2.b.h.p(((Integer) pair.first).intValue(), (x2.f0) pair.second, (nb.a) this.d);
                return;
            case 7:
                l2.c1 c1Var3 = (l2.c1) this.b;
                Pair pair2 = (Pair) this.c;
                c1Var3.b.h.K(((Integer) pair2.first).intValue(), (x2.f0) pair2.second, (Exception) this.d);
                return;
            case 8:
                k8.a aVar = (k8.a) this.b;
                e2.u uVar = (e2.u) this.c;
                l2.e eVar2 = (l2.e) this.d;
                n2.s sVar = (n2.s) aVar.c;
                String str = h2.l0.a;
                m2.e eVar3 = ((l2.z) sVar).a.s;
                m2.a U = eVar3.U();
                eVar3.V(U, 1009, new m2.c(U, uVar, eVar2, i7));
                return;
            case 9:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                h2.r rVar = (h2.r) this.d;
                int i12 = 18;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new kg.j1(rVar, i12));
                    }
                    synchronized (n2.g0.t) {
                        try {
                            int i13 = n2.g0.v - 1;
                            n2.g0.v = i13;
                            if (i13 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.g0.u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.g0.u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new kg.j1(rVar, i12));
                    }
                    synchronized (n2.g0.t) {
                        try {
                            int i14 = n2.g0.v - 1;
                            n2.g0.v = i14;
                            if (i14 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.g0.u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.g0.u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 10:
                oi.q3 q3Var = (oi.q3) this.b;
                m60 m60Var = (m60) this.c;
                k5 k5Var = (k5) this.d;
                if (q3Var.r4 != m60Var) {
                    return;
                }
                q3Var.r4 = null;
                if (q3Var.K3 && q3Var.q4 == k5Var && !k5Var.I.isEmpty()) {
                    q3Var.P2();
                    return;
                }
                return;
            case 11:
                oi.q3 q3Var2 = (oi.q3) this.b;
                oi.a aVar2 = (oi.a) this.c;
                oi.a aVar3 = (oi.a) this.d;
                ArrayList arrayList3 = q3Var2.x4;
                oi.e3 e3Var = q3Var2.v3;
                if (e3Var == null || aVar2 == null || aVar3 == null) {
                    return;
                }
                int indexOf = arrayList3.indexOf(aVar2);
                int indexOf2 = arrayList3.indexOf(aVar3);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                while (i10 < arrayList3.size()) {
                    oi.a aVar4 = (oi.a) arrayList3.get(i10);
                    long j3 = aVar4.t;
                    if (j3 != 0) {
                        e3Var.X(i10, a6.l((TL_iv.RichText) q3Var2.u3.get(Long.valueOf(j3))));
                    } else {
                        e3Var.X(i10, y5.z(aVar4.b));
                    }
                    i10++;
                }
                e3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 12:
                ((oi.q3) this.b).d5((String) this.d, (oi.a) this.c);
                return;
            case 13:
                s5 s5Var = (s5) this.b;
                oi.a aVar5 = (oi.a) this.c;
                x5 x5Var = (x5) this.d;
                v5 v5Var = s5Var.a.E;
                if (v5Var != null) {
                    ((oi.a3) v5Var).d(aVar5, x5Var.a, x5Var.b, x5Var.c, x5Var.d, x5Var.e);
                    return;
                }
                return;
            case 14:
                ((VideoAds) this.b).lambda$show$3((xb) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 15:
                ((VideoAds) this.b).lambda$show$5((xb) this.c, (boolean[]) this.d);
                return;
            case 16:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.c, (Runnable) this.d);
                return;
            case 17:
                ((s10) this.b).a((TLObject) this.c, (TLRPC.TL_error) this.d);
                return;
            case 18:
                ((s10) this.b).a((TLRPC.Updates) this.c, (TLRPC.TL_error) this.d);
                return;
            case 19:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.c;
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarLayout.K;
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && (viewGroup = (ViewGroup) actionBarPopupWindow$ActionBarPopupWindowLayout.getParent()) != null) {
                    viewGroup.removeView(actionBarLayout.K);
                }
                if (actionBarLayout.h || actionBarLayout.b0) {
                    actionBarLayout.w.setScaleX(1.0f);
                    actionBarLayout.w.setScaleY(1.0f);
                    actionBarLayout.h = false;
                    actionBarLayout.K = null;
                    actionBarLayout.b0 = false;
                } else {
                    actionBarLayout.w.setTranslationX(0.0f);
                }
                actionBarLayout.m(e2Var);
                e2Var.setRemovingFromStack(false);
                e2Var.onTransitionAnimationEnd(false, true);
                e2Var2.onTransitionAnimationEnd(true, true);
                e2Var2.onBecomeFullyVisible();
                return;
            case 20:
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.b;
                ((org.telegram.ui.ActionBar.e2) this.c).presentFragment((an) this.d);
                c3Var.c = false;
                return;
            case 21:
                org.telegram.ui.ActionBar.c3 c3Var2 = (org.telegram.ui.ActionBar.c3) this.c;
                ArrayList arrayList4 = (ArrayList) this.b;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.d;
                c3Var2.getClass();
                while (i10 < arrayList4.size()) {
                    if (((org.telegram.ui.ActionBar.z2) arrayList4.get(i10)).a == b3Var) {
                        arrayList4.remove(i10);
                        i10--;
                    }
                    i10++;
                }
                c3Var2.invalidate();
                return;
            case 22:
                i6 i6Var = (i6) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                i6 i6Var2 = (i6) this.d;
                if (!(tLObject3 instanceof TLRPC.TL_wallPaper)) {
                    i6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject3;
                i6Var.h0 = w7.r(null, tL_wallPaper.document);
                ns.f(i6Var.F).b(i6Var, ns.Y1);
                ns.f(i6Var.F).b(i6Var, ns.Z1);
                w7.G(i6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 23:
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) this.b;
                org.telegram.ui.Wallet.y5.G0(t0Var.getContext(), t0Var.I, (TL_wallet.walletTransaction) this.c, null, null, null, (org.telegram.ui.Cells.m0) this.d, t0Var.h1);
                return;
            case 24:
                org.telegram.ui.Cells.t0 t0Var2 = (org.telegram.ui.Cells.t0) this.b;
                t0Var2.g1.g0(t0Var2, (TLRPC.TL_premiumGiftOption) this.c, (String) this.d);
                return;
            case 25:
                ga gaVar = (ga) this.b;
                i6 i6Var3 = (i6) this.c;
                i6Var3.f = !i6Var3.d((File) this.d, i6Var3.c);
                org.telegram.messenger.g0.h3(new ea(8, gaVar, i6Var3));
                return;
            case 26:
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) this.b;
                t4.J((Context) this.c, d0Var.h2, new ia.d(d0Var, 28), (e6) this.d);
                return;
            case 27:
                y7 y7Var = (y7) this.b;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                t1Var.dismiss();
                if (tLObject4 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_account_saveMusic tL_account_saveMusic = new TLRPC.TL_account_saveMusic();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_account_saveMusic.id = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject4).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    hp hpVar = y7Var.q2;
                    if (hpVar != null) {
                        hpVar.c.add(0, hpVar.d(document));
                        hpVar.e();
                    }
                    y7Var.r2.clear();
                    y7Var.r2.addAll(y7Var.q2.c);
                    y7Var.u1.f();
                    ConnectionsManager.getInstance(y7Var.a).sendRequest(tL_account_saveMusic, null);
                    return;
                }
                return;
            case 28:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                String str2 = (String) this.c;
                Runnable runnable = (Runnable) this.d;
                if (chatActivityEnterView.G2 || (xeVar = chatActivityEnterView.F0) == null || (text = xeVar.getText()) == null) {
                    return;
                }
                int length = text.length();
                String concat = ((length <= 0 || Character.isWhitespace(text.charAt(length + (-1)))) ? "" : " ").concat(str2);
                chatActivityEnterView.l1 = true;
                text.insert(length, concat);
                chatActivityEnterView.F0.setSelection(text.length());
                if (runnable != null) {
                    runnable.run();
                    return;
                } else {
                    chatActivityEnterView.W0();
                    org.telegram.messenger.g0.i3(new nd(chatActivityEnterView, i7), 420L);
                    return;
                }
            default:
                pe peVar = (pe) this.b;
                jt0 jt0Var = (jt0) this.c;
                en0 en0Var = (en0) this.d;
                peVar.getClass();
                jt0Var.getViewTreeObserver().removeOnDrawListener(peVar);
                en0Var.a.setHideAvatar(true);
                return;
        }
    }

    public /* synthetic */ n(org.telegram.ui.ActionBar.c3 c3Var, ArrayList arrayList, org.telegram.ui.ActionBar.b3 b3Var) {
        this.a = 21;
        this.c = c3Var;
        this.b = arrayList;
        this.d = b3Var;
    }
}
