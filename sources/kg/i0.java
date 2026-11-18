package kg;

import a8.b8;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.view.ViewGroup;
import bi.r3;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import ki.i3;
import ki.l2;
import ki.o2;
import ki.t2;
import oi.b6;
import oi.c3;
import oi.g3;
import oi.l5;
import oi.s3;
import oi.t5;
import oi.w5;
import oi.y5;
import oi.z5;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.o10;
import org.telegram.messenger.q10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d3;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.fa;
import org.telegram.ui.Cells.ha;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.y60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.n6;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i7 = 0;
        switch (this.a) {
            case 0:
                l0 l0Var = (l0) this.b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.c;
                TL_account.TL_businessBotRecipients tL_businessBotRecipients = (TL_account.TL_businessBotRecipients) this.d;
                f.a(l0Var.a).b();
                l0Var.dismiss();
                tL_connectedBot.recipients = tL_businessBotRecipients;
                h2 T = LaunchActivity.T();
                if (T != null) {
                    lc.b0(T).Q(R.raw.contact_check, 36, gd.a0(null, null, 2131752773, o10.q(l0Var.U1))).j();
                    return;
                }
                return;
            case 1:
                v0 v0Var = (v0) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                if (tL_error != null) {
                    v0Var.a.b(false);
                    lc.e0(tL_error);
                    return;
                } else if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
                    v0Var.finishFragment();
                    return;
                } else {
                    v0Var.a.b(false);
                    f3.o(null, 2131743642, lc.b0(v0Var), null);
                    return;
                }
            case 2:
                f1.Z((f1) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d);
                return;
            case 3:
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
                    ks.f(z1Var.a).k(ks.t3, new Object[0]);
                }
                z1Var.c = true;
                z1Var.b = false;
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) this.b;
                HashMap hashMap = (HashMap) this.c;
                x10 x10Var = (x10) this.d;
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    TLRPC.User user = (TLRPC.User) arrayList2.get(i10);
                    Boolean bool = (Boolean) hashMap.get(Long.valueOf(user.id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    ki.p pVar = new ki.p();
                    pVar.a = user;
                    pVar.b = z10;
                    arrayList3.add(pVar);
                }
                x10Var.a(arrayList3);
                return;
            case 5:
                boolean[] zArr = (boolean[]) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                r3 r3Var = (r3) this.d;
                zArr[0] = false;
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    r3Var.a(Boolean.TRUE);
                    return;
                }
                return;
            case 6:
                o2 o2Var = (o2) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                t2 t2Var = o2Var.d;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    new lc(t2Var.r0, t2Var.G).Z(tL_error2).k(true);
                    return;
                }
                l2 l2Var = t2Var.E;
                l2Var.getClass();
                l2Var.y("emoji_status_access_requested", org.telegram.ui.web.v0.A("cancelled", "status"));
                return;
            case 7:
                i3 i3Var = (i3) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                TLRPC.User user2 = (TLRPC.User) this.d;
                org.telegram.messenger.g0.g(connectedbotstarref.url);
                lc.b0(i3Var).I(R.raw.copy, gd.M0(2131754331, null), org.telegram.messenger.g0.W2(gd.a0(null, null, 2131754332, ki.k.J0(connectedbotstarref.commission_permille), o10.q(user2)))).j();
                return;
            case 8:
                i3.D0((i3) this.b, (TLObject) this.c, (org.telegram.ui.ActionBar.u1) this.d);
                return;
            case 9:
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
            case 10:
                l2.c1 c1Var2 = (l2.c1) this.b;
                Pair pair = (Pair) this.c;
                c1Var2.b.h.c(((Integer) pair.first).intValue(), (x2.g0) pair.second, (nb.a) this.d);
                return;
            case 11:
                l2.c1 c1Var3 = (l2.c1) this.b;
                Pair pair2 = (Pair) this.c;
                c1Var3.b.h.K(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, (Exception) this.d);
                return;
            case 12:
                k8.a aVar = (k8.a) this.b;
                e2.u uVar = (e2.u) this.c;
                l2.e eVar = (l2.e) this.d;
                n2.s sVar = (n2.s) aVar.c;
                String str = h2.l0.a;
                m2.d dVar2 = ((l2.z) sVar).a.s;
                m2.a U = dVar2.U();
                dVar2.V(U, 1009, new m2.c(U, uVar, eVar, 7));
                return;
            case 13:
                AudioTrack audioTrack = (AudioTrack) this.b;
                Handler handler = (Handler) this.c;
                h2.r rVar = (h2.r) this.d;
                int i11 = 22;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new j0(rVar, i11));
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
                        handler.post(new j0(rVar, i11));
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
            case 14:
                s3 s3Var = (s3) this.b;
                y60 y60Var = (y60) this.c;
                l5 l5Var = (l5) this.d;
                if (s3Var.r4 != y60Var) {
                    return;
                }
                s3Var.r4 = null;
                if (s3Var.K3 && s3Var.q4 == l5Var && !l5Var.I.isEmpty()) {
                    s3Var.P2();
                    return;
                }
                return;
            case 15:
                s3 s3Var2 = (s3) this.b;
                oi.a aVar2 = (oi.a) this.c;
                oi.a aVar3 = (oi.a) this.d;
                ArrayList arrayList4 = s3Var2.x4;
                g3 g3Var = s3Var2.v3;
                if (g3Var == null || aVar2 == null || aVar3 == null) {
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
                        g3Var.X(i7, b6.l((TL_iv.RichText) s3Var2.u3.get(Long.valueOf(j3))));
                    } else {
                        g3Var.X(i7, z5.z(aVar4.b));
                    }
                    i7++;
                }
                g3Var.i0(Math.min(indexOf, indexOf2), Math.max(indexOf, indexOf2));
                return;
            case 16:
                ((s3) this.b).d5((String) this.d, (oi.a) this.c);
                return;
            case 17:
                t5 t5Var = (t5) this.b;
                oi.a aVar5 = (oi.a) this.c;
                y5 y5Var = (y5) this.d;
                w5 w5Var = t5Var.a.E;
                if (w5Var != null) {
                    ((c3) w5Var).d(aVar5, y5Var.a, y5Var.b, y5Var.c, y5Var.d, y5Var.e);
                    return;
                }
                return;
            case 18:
                ((VideoAds) this.b).lambda$show$3((gc) this.c, (TLRPC.TL_sponsoredMessage) this.d);
                return;
            case 19:
                ((VideoAds) this.b).lambda$show$5((gc) this.c, (boolean[]) this.d);
                return;
            case 20:
                ((VideoPlayerHolderBase) this.b).lambda$release$3((TLRPC.Document) this.c, (Runnable) this.d);
                return;
            case 21:
                ((q10) this.b).a((TLRPC.Updates) this.c, (TLRPC.TL_error) this.d);
                return;
            case 22:
                ActionBarLayout actionBarLayout = (ActionBarLayout) this.b;
                h2 h2Var = (h2) this.c;
                h2 h2Var2 = (h2) this.d;
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
                actionBarLayout.m(h2Var);
                h2Var.setRemovingFromStack(false);
                h2Var.onTransitionAnimationEnd(false, true);
                h2Var2.onTransitionAnimationEnd(true, true);
                h2Var2.onBecomeFullyVisible();
                return;
            case 23:
                org.telegram.ui.ActionBar.g3 g3Var2 = (org.telegram.ui.ActionBar.g3) this.b;
                ((h2) this.c).presentFragment((bn) this.d);
                g3Var2.c = false;
                return;
            case 24:
                org.telegram.ui.ActionBar.g3 g3Var3 = (org.telegram.ui.ActionBar.g3) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                g3Var3.getClass();
                while (i7 < arrayList5.size()) {
                    if (((d3) arrayList5.get(i7)).a == f3Var) {
                        arrayList5.remove(i7);
                        i7--;
                    }
                    i7++;
                }
                g3Var3.invalidate();
                return;
            case 25:
                m6 m6Var = (m6) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                m6 m6Var2 = (m6) this.d;
                if (!(tLObject5 instanceof TLRPC.TL_wallPaper)) {
                    m6Var.s();
                    return;
                }
                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject5;
                m6Var.h0 = w7.r(null, tL_wallPaper.document);
                ks.f(m6Var.F).b(m6Var, ks.Y1);
                ks.f(m6Var.F).b(m6Var, ks.Z1);
                w7.G(m6Var2.F).W(tL_wallPaper.document, tL_wallPaper, 1, 1);
                return;
            case 26:
                org.telegram.ui.Cells.u0 u0Var = (org.telegram.ui.Cells.u0) this.b;
                n6.K0(u0Var.getContext(), u0Var.I, (TL_wallet.walletTransaction) this.c, null, null, null, (org.telegram.ui.Cells.n0) this.d, u0Var.h1);
                return;
            case 27:
                org.telegram.ui.Cells.u0 u0Var2 = (org.telegram.ui.Cells.u0) this.b;
                u0Var2.g1.b0(u0Var2, (TLRPC.TL_premiumGiftOption) this.c, (String) this.d);
                return;
            case 28:
                ha haVar = (ha) this.b;
                m6 m6Var3 = (m6) this.c;
                m6Var3.f = !m6Var3.d((File) this.d, m6Var3.c);
                org.telegram.messenger.g0.g3(new fa(9, haVar, m6Var3));
                return;
            default:
                org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.b;
                b5.J((Context) this.c, m0Var.h2, new org.telegram.ui.Cells.b5(m0Var), (i6) this.d);
                return;
        }
    }
}
