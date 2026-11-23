package kg;

import a8.b8;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.view.ViewGroup;
import bi.v3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import ki.h3;
import ki.k2;
import ki.n2;
import ki.s2;
import oi.a6;
import oi.c6;
import oi.d3;
import oi.m5;
import oi.t3;
import oi.u5;
import oi.x5;
import oi.z5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.r10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.ga;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y(ViewGroup viewGroup, Object obj, String str, int i7) {
        this.a = i7;
        this.b = viewGroup;
        this.d = obj;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                String str = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str;
                ConnectionsManager.getInstance(zVar.a).sendRequest(deletebusinesschatlink, new bi.o1(20, zVar, tL_businessChatLink));
                return;
            case 1:
                k0 k0Var = (k0) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                f.a(k0Var.a).b();
                k0Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    lc.b0(T).Q(R.raw.contact_check, 36, hd.a0(null, null, 2131752772, p10.q(k0Var.U1))).j();
                    return;
                }
                return;
            case 2:
                u0 u0Var = (u0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    u0Var.a.b(false);
                    lc.e0(tL_error);
                    return;
                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                    u0Var.finishFragment();
                    return;
                } else {
                    u0Var.a.b(false);
                    f3.o(null, 2131743634, lc.b0(u0Var), null);
                    return;
                }
            case 3:
                e1.Z((e1) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                return;
            case 4:
                z1 z1Var = (z1) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                SharedPreferences sharedPreferences = (SharedPreferences) this.d;
                ArrayList arrayList = z1Var.d;
                if (tLObject2 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList.clear();
                    arrayList.addAll(((TLRPC.TL_help_timezonesList) tLObject2).timezones);
                    SerializedData serializedData = new SerializedData(tLObject2.getObjectSize());
                    tLObject2.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    ls.f(z1Var.a).k(ls.t3, new Object[0]);
                }
                z1Var.c = true;
                z1Var.b = false;
                return;
            case 5:
                ArrayList arrayList2 = (ArrayList) this.b;
                HashMap hashMap = (HashMap) this.c;
                y10 y10Var = (y10) this.d;
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    ki.o oVar = new ki.o();
                    oVar.a = user;
                    oVar.b = z10;
                    arrayList3.add(oVar);
                }
                y10Var.a(arrayList3);
                return;
            case 6:
                boolean[] zArr = (boolean[]) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                v3 v3Var = (v3) this.d;
                zArr[0] = false;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    v3Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 7:
                n2 n2Var = (n2) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                s2 s2Var = n2Var.d;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    new lc(s2Var.r0, s2Var.G).Z(tL_error2).k(true);
                    return;
                }
                k2 k2Var = s2Var.E;
                k2Var.getClass();
                k2Var.y("emoji_status_access_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                return;
            case 8:
                h3 h3Var = (h3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                lc.b0(h3Var).I(R.raw.copy, hd.N0(2131754330, null), org.telegram.messenger.g0.W2(hd.a0(null, null, 2131754331, ki.j.J0(connectedbotstarref.commission_permille), p10.q(user2)))).j();
                return;
            case 9:
                h3.D0((h3) this.b, (TLObject) this.c, (org.telegram.ui.ActionBar.t1) this.d);
                return;
            case 10:
                l2.w0 w0Var = (l2.w0) this.b;
                h9.f0 f0Var = (h9.f0) this.c;
                x2.g0 g0Var = (x2.g0) this.d;
                m2.d dVar = w0Var.c;
                h9.t1 f10 = f0Var.f();
                b8 b8Var = dVar.d;
                e2.c1 c1Var = dVar.h;
                c1Var.getClass();
                b8Var.getClass();
                b8Var.b = h9.i0.q(f10);
                if (!f10.isEmpty()) {
                    b8Var.e = (x2.g0) f10.get(0);
                    g0Var.getClass();
                    b8Var.f = g0Var;
                }
                if (((x2.g0) b8Var.d) == null) {
                    b8Var.d = b8.f(c1Var, (h9.i0) b8Var.b, (x2.g0) b8Var.e, (e2.i1) b8Var.a);
                }
                b8Var.s(c1Var.y0());
                return;
            case 11:
                l2.c1 c1Var2 = (l2.c1) this.b;
                Pair pair = (Pair) this.c;
                c1Var2.b.h.c(((Integer) pair.first).intValue(), (x2.g0) pair.second, (nb.a) this.d);
                return;
            case 12:
                l2.c1 c1Var3 = (l2.c1) this.b;
                Pair pair2 = (Pair) this.c;
                c1Var3.b.h.K(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, (Exception) this.d);
                return;
            case 13:
                k8.a aVar = (k8.a) this.b;
                e2.u uVar = (e2.u) this.c;
                l2.e eVar = (l2.e) this.d;
                n2.s sVar = (n2.s) aVar.c;
                String str2 = h2.l0.a;
                m2.d dVar2 = ((l2.z) sVar).a.s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1009, new m2.c(U, uVar, eVar, 7));
                return;
            case 14:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                h2.r rVar = (h2.r) this.d;
                int i11 = 22;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new i0(rVar, i11));
                    }
                    synchronized (n2.g0.t) {
                        try {
                            int i12 = n2.g0.v - 1;
                            n2.g0.v = i12;
                            if (i12 == 0) {
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
                        handler.post(new i0(rVar, i11));
                    }
                    synchronized (n2.g0.t) {
                        try {
                            int i13 = n2.g0.v - 1;
                            n2.g0.v = i13;
                            if (i13 == 0) {
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
            case 15:
                t3 t3Var = (t3) this.b;
                a70 a70Var = (a70) this.c;
                m5 m5Var = (m5) this.d;
                if (t3Var.r4 != a70Var) {
                    return;
                }
                t3Var.r4 = null;
                if (t3Var.K3 && t3Var.q4 == m5Var && !m5Var.I.isEmpty()) {
                    t3Var.P2();
                    return;
                }
                return;
            case 16:
                t3 t3Var2 = (t3) this.b;
                oi.a aVar2 = (oi.a) this.c;
                oi.a aVar3 = (oi.a) this.d;
                ArrayList arrayList4 = t3Var2.x4;
                oi.h3 h3Var2 = t3Var2.v3;
                if (h3Var2 == null || aVar2 == null || aVar3 == null) {
                    return;
                }
                int indexOf = arrayList4.indexOf(aVar2);
                int indexOf2 = arrayList4.indexOf(aVar3);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                while (i7 < arrayList4.size()) {
                    oi.a aVar4 = (oi.a) arrayList4.get(i7);
                    long j3 = aVar4.t;
                    if (j3 != 0) {
                        h3Var2.X(i7, c6.l((TL_iv.RichText) t3Var2.u3.get(Long.valueOf(j3))));
                    } else {
                        h3Var2.X(i7, a6.z(aVar4.b));
                    }
                    i7++;
                }
                h3Var2.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 17:
                ((t3) this.b).d5((String) this.c, (oi.a) this.d);
                return;
            case 18:
                u5 u5Var = (u5) this.b;
                oi.a aVar5 = (oi.a) this.c;
                z5 z5Var = (z5) this.d;
                x5 x5Var = u5Var.a.E;
                if (x5Var != null) {
                    ((d3) x5Var).d(aVar5, z5Var.a, z5Var.b, z5Var.c, z5Var.d, z5Var.e);
                    return;
                }
                return;
            case 19:
                ((VideoAds) this.b).lambda$show$3((gc) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 20:
                ((VideoAds) this.b).lambda$show$5((gc) this.c, (boolean[]) this.d);
                return;
            case 21:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.c, (Runnable) this.d);
                return;
            case 22:
                ((r10) this.b).a((TLRPC.Updates) this.c, (TLRPC.TL_error) this.d);
                return;
            case 23:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                g2 g2Var = (g2) this.c;
                g2 g2Var2 = (g2) this.d;
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
                actionBarLayout.m(g2Var);
                g2Var.setRemovingFromStack(false);
                g2Var.onTransitionAnimationEnd(false, true);
                g2Var2.onTransitionAnimationEnd(true, true);
                g2Var2.onBecomeFullyVisible();
                return;
            case 24:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                ((g2) this.c).presentFragment((bn) this.d);
                f3Var.c = false;
                return;
            case 25:
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                e3 e3Var = (e3) this.d;
                f3Var2.getClass();
                while (i7 < arrayList5.size()) {
                    if (((c3) arrayList5.get(i7)).a == e3Var) {
                        arrayList5.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                f3Var2.invalidate();
                return;
            case 26:
                l6 l6Var = (l6) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                l6 l6Var2 = (l6) this.d;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    l6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                l6Var.h0 = w7.r(null, tL_wallPaper.document);
                ls.f(l6Var.F).b(l6Var, ls.Y1);
                ls.f(l6Var.F).b(l6Var, ls.Z1);
                w7.G(l6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 27:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                n6.K0(v0Var.getContext(), v0Var.I, (TL_wallet.walletTransaction) this.c, null, null, null, (org.telegram.ui.Cells.n0) this.d, v0Var.h1);
                return;
            case 28:
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.b;
                v0Var2.g1.b0(v0Var2, (TLRPC.TL_premiumGiftOption) this.d, (String) this.c);
                return;
            default:
                ia iaVar = (ia) this.b;
                l6 l6Var3 = (l6) this.c;
                l6Var3.f = !l6Var3.d((File) this.d, l6Var3.c);
                org.telegram.messenger.g0.g3(new ga(8, iaVar, l6Var3));
                return;
        }
    }

    public /* synthetic */ y(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
