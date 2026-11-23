package kg;

import a8.b8;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.view.ViewGroup;
import bi.x3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import ki.i3;
import ki.k2;
import ki.o2;
import ki.t2;
import oi.a6;
import oi.c6;
import oi.d3;
import oi.h3;
import oi.m5;
import oi.t3;
import oi.u5;
import oi.x5;
import oi.z5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.p10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.o6;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                TLObject tLObject = (TLObject) this.d;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.c;
                ArrayList arrayList = zVar.b;
                if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                    a8.g(new RuntimeException("Unexpected response from server!"), true);
                    return;
                }
                if (arrayList.contains(tL_businessChatLink)) {
                    arrayList.remove(tL_businessChatLink);
                    ks.f(zVar.a).k(ks.J1, new Object[0]);
                }
                zVar.f();
                return;
            case 1:
                z zVar2 = (z) this.b;
                String str = (String) this.d;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.c;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str;
                ConnectionsManager.getInstance(zVar2.a).sendRequest(deletebusinesschatlink, new bi.o1(20, zVar2, tL_businessChatLink2));
                return;
            case 2:
                k0 k0Var = (k0) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.d;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.c;
                f.a(k0Var.a).b();
                k0Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    kc.b0(T).Q(R.raw.contact_check, 36, gd.a0(null, null, 2131752772, n10.q(k0Var.U1))).j();
                    return;
                }
                return;
            case 3:
                u0 u0Var = (u0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                if (tL_error != null) {
                    u0Var.a.b(false);
                    kc.e0(tL_error);
                    return;
                } else if (!(tLObject2 instanceof TLRPC.TL_boolFalse)) {
                    u0Var.finishFragment();
                    return;
                } else {
                    u0Var.a.b(false);
                    f3.o(null, 2131743632, kc.b0(u0Var), null);
                    return;
                }
            case 4:
                e1.Z((e1) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                return;
            case 5:
                z1 z1Var = (z1) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                SharedPreferences sharedPreferences = (SharedPreferences) this.c;
                ArrayList arrayList2 = z1Var.d;
                if (tLObject3 instanceof TLRPC.TL_help_timezonesList) {
                    arrayList2.clear();
                    arrayList2.addAll(((TLRPC.TL_help_timezonesList) tLObject3).timezones);
                    SerializedData serializedData = new SerializedData(tLObject3.getObjectSize());
                    tLObject3.serializeToStream(serializedData);
                    sharedPreferences.edit().putString("timezones", Utilities.f(serializedData.toByteArray())).apply();
                    ks.f(z1Var.a).k(ks.t3, new Object[0]);
                }
                z1Var.c = true;
                z1Var.b = false;
                return;
            case 6:
                ArrayList arrayList3 = (ArrayList) this.b;
                HashMap hashMap = (HashMap) this.d;
                w10 w10Var = (w10) this.c;
                ArrayList arrayList4 = new ArrayList();
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    TLRPC.User user = (TLRPC.User) arrayList3.get(i10);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    ki.o oVar = new ki.o();
                    oVar.a = user;
                    oVar.b = z10;
                    arrayList4.add(oVar);
                }
                w10Var.a(arrayList4);
                return;
            case 7:
                boolean[] zArr = (boolean[]) this.b;
                TLObject tLObject4 = (TLObject) this.d;
                x3 x3Var = (x3) this.c;
                zArr[0] = false;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    x3Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 8:
                o2 o2Var = (o2) this.b;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                t2 t2Var = o2Var.d;
                if (!(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                    new kc(t2Var.r0, t2Var.G).Z(tL_error2).k(true);
                    return;
                }
                k2 k2Var = t2Var.E;
                k2Var.getClass();
                k2Var.y("emoji_status_access_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                return;
            case 9:
                i3 i3Var = (i3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.d;
                TLRPC.User user2 = (TLRPC.User) this.c;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                kc.b0(i3Var).I(R.raw.copy, gd.N0(2131754330, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131754331, ki.j.J0(connectedbotstarref.commission_permille), n10.q(user2)))).j();
                return;
            case 10:
                i3.D0((i3) this.b, (TLObject) this.d, (org.telegram.ui.ActionBar.t1) this.c);
                return;
            case 11:
                l2.x0 x0Var = (l2.x0) this.b;
                h9.f0 f0Var = (h9.f0) this.d;
                x2.g0 g0Var = (x2.g0) this.c;
                m2.d dVar = x0Var.c;
                h9.s1 f10 = f0Var.f();
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
                b8Var.s(c1Var.z0());
                return;
            case 12:
                l2.d1 d1Var = (l2.d1) this.b;
                Pair pair = (Pair) this.d;
                d1Var.b.h.l(((Integer) pair.first).intValue(), (x2.g0) pair.second, (nb.a) this.c);
                return;
            case 13:
                l2.d1 d1Var2 = (l2.d1) this.b;
                Pair pair2 = (Pair) this.d;
                d1Var2.b.h.K(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, (Exception) this.c);
                return;
            case 14:
                jb.m mVar = (jb.m) this.b;
                e2.u uVar = (e2.u) this.d;
                l2.f fVar = (l2.f) this.c;
                n2.s sVar = (n2.s) mVar.c;
                String str2 = h2.l0.a;
                m2.d dVar2 = ((l2.a0) sVar).a.s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1009, new m2.c(U, uVar, fVar, 7));
                return;
            case 15:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.d;
                h2.r rVar = (h2.r) this.c;
                int i11 = 22;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new i0(rVar, i11));
                    }
                    synchronized (n2.h0.t) {
                        try {
                            int i12 = n2.h0.v - 1;
                            n2.h0.v = i12;
                            if (i12 == 0) {
                                ScheduledExecutorService scheduledExecutorService = n2.h0.u;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                n2.h0.u = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new i0(rVar, i11));
                    }
                    synchronized (n2.h0.t) {
                        try {
                            int i13 = n2.h0.v - 1;
                            n2.h0.v = i13;
                            if (i13 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = n2.h0.u;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                n2.h0.u = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 16:
                t3 t3Var = (t3) this.b;
                x60 x60Var = (x60) this.d;
                m5 m5Var = (m5) this.c;
                if (t3Var.r4 != x60Var) {
                    return;
                }
                t3Var.r4 = null;
                if (t3Var.K3 && t3Var.q4 == m5Var && !m5Var.I.isEmpty()) {
                    t3Var.P2();
                    return;
                }
                return;
            case 17:
                t3 t3Var2 = (t3) this.b;
                oi.a aVar = (oi.a) this.d;
                oi.a aVar2 = (oi.a) this.c;
                ArrayList arrayList5 = t3Var2.x4;
                h3 h3Var = t3Var2.v3;
                if (h3Var == null || aVar == null || aVar2 == null) {
                    return;
                }
                int indexOf = arrayList5.indexOf(aVar);
                int indexOf2 = arrayList5.indexOf(aVar2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return;
                }
                while (i7 < arrayList5.size()) {
                    oi.a aVar3 = (oi.a) arrayList5.get(i7);
                    long j3 = aVar3.t;
                    if (j3 != 0) {
                        h3Var.X(i7, c6.l((TL_iv.RichText) t3Var2.u3.get(Long.valueOf(j3))));
                    } else {
                        h3Var.X(i7, a6.z(aVar3.b));
                    }
                    i7++;
                }
                h3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 18:
                ((t3) this.b).d5((String) this.c, (oi.a) this.d);
                return;
            case 19:
                u5 u5Var = (u5) this.b;
                oi.a aVar4 = (oi.a) this.d;
                z5 z5Var = (z5) this.c;
                x5 x5Var = u5Var.a.E;
                if (x5Var != null) {
                    ((d3) x5Var).d(aVar4, z5Var.a, z5Var.b, z5Var.c, z5Var.d, z5Var.e);
                    return;
                }
                return;
            case 20:
                ((VideoAds) this.b).lambda$show$3((fc) this.d, (TLRPC.TL_sponsoredMessage) this.c);
                return;
            case 21:
                ((VideoAds) this.b).lambda$show$5((fc) this.d, (boolean[]) this.c);
                return;
            case 22:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.d, (Runnable) this.c);
                return;
            case 23:
                ((p10) this.b).a((TLRPC.Updates) this.d, (TLRPC.TL_error) this.c);
                return;
            case 24:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                g2 g2Var = (g2) this.d;
                g2 g2Var2 = (g2) this.c;
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
            case 25:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                ((g2) this.d).presentFragment((bn) this.c);
                f3Var.c = false;
                return;
            case 26:
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                e3 e3Var = (e3) this.c;
                f3Var2.getClass();
                while (i7 < arrayList6.size()) {
                    if (((c3) arrayList6.get(i7)).a == e3Var) {
                        arrayList6.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                f3Var2.invalidate();
                return;
            case 27:
                m6 m6Var = (m6) this.b;
                TLObject tLObject6 = (TLObject) this.d;
                m6 m6Var2 = (m6) this.c;
                if (!(tLObject6 instanceof TLRPC.TL_wallPaper)) {
                    m6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject6;
                m6Var.h0 = w7.r(null, tL_wallPaper.document);
                ks.f(m6Var.F).b(m6Var, ks.Y1);
                ks.f(m6Var.F).b(m6Var, ks.Z1);
                w7.G(m6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 28:
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.b;
                o6.K0(v0Var.getContext(), v0Var.I, (TL_wallet.walletTransaction) this.d, null, null, null, (org.telegram.ui.Cells.n0) this.c, v0Var.h1);
                return;
            default:
                org.telegram.ui.Cells.v0 v0Var2 = (org.telegram.ui.Cells.v0) this.b;
                v0Var2.g1.T(v0Var2, (TLRPC.TL_premiumGiftOption) this.d, (String) this.c);
                return;
        }
    }

    public /* synthetic */ x(g2 g2Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = g2Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
