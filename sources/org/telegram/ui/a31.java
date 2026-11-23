package org.telegram.ui;

import android.app.Dialog;
import android.graphics.Bitmap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a31 implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a31(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        v4.f1 K;
        int i7 = this.a;
        int i10 = 2;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                n31.c0((n31) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 1:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                org.telegram.messenger.bz.u0 = false;
                org.telegram.messenger.bz.y();
                themeActivity.P0 = true;
                ((Dialog) atomicReference.get()).dismiss();
                org.telegram.ui.Components.ek0 ek0Var = themeActivity.b;
                if (ek0Var == null || !ek0Var.H || (K = ek0Var.K(themeActivity.N)) == null) {
                    return;
                }
                themeActivity.a.t(K, themeActivity.N);
                return;
            case 2:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                iy0 iy0Var = (iy0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    iy0Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.kc.b0(themeActivity2).I(R.raw.error, org.telegram.messenger.gd.N0(2131754308, null), org.telegram.messenger.gd.N0(2131754309, null)).j();
                    return;
                }
            case 3:
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) obj3;
                try {
                    ((org.telegram.messenger.w10) obj2).a((String) obj);
                    if (s0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (s0Var != null) {
                        s0Var.close();
                    }
                }
            case 4:
                ((org.telegram.ui.Wallet.s0) obj3).close();
                ((org.telegram.ui.Wallet.w8) obj2).a((String) obj);
                return;
            case 5:
                ((org.telegram.ui.Wallet.v0) obj3).q.put((TL_wallet.walletTransaction) obj, (org.telegram.messenger.w10) obj2);
                return;
            case 6:
                org.telegram.ui.Wallet.p0 p0Var = (org.telegram.ui.Wallet.p0) obj3;
                org.telegram.ui.Wallet.z8 z8Var = (org.telegram.ui.Wallet.z8) obj2;
                String str = (String) obj;
                if (str == null) {
                    org.telegram.ui.Wallet.v0.P("prepare disable backup: done!");
                    z8Var.a(p0Var, null);
                    return;
                } else {
                    p0Var.close();
                    org.telegram.ui.Wallet.v0.n("prepare disable backup, failed to save secret phrase to local storage: ".concat(str));
                    z8Var.a(null, str);
                    return;
                }
            case 7:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj3;
                org.telegram.ui.Wallet.a9 a9Var = (org.telegram.ui.Wallet.a9) obj2;
                String str2 = (String) obj;
                if (str2 != null) {
                    org.telegram.ui.Wallet.v0.n("disableBackupWithoutUpdatingPhrase: ".concat(str2));
                    a9Var.a(str2);
                    return;
                } else {
                    org.telegram.ui.Wallet.v0.P("sending disableBackup to server");
                    org.telegram.ui.Wallet.o3.a(v0Var.a, new ci.y(10), null, null, null, new fi.b0(5, v0Var, a9Var), true, true, new m.b3(null, null));
                    return;
                }
            case 8:
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.p(obj3, obj2, (String) obj, i10));
                return;
            case 9:
                ((org.telegram.ui.Wallet.m2) obj3).h = false;
                ((m60) obj2).a(null, (String) obj);
                return;
            case 10:
                ((org.telegram.ui.Wallet.s0) obj3).close();
                ((org.telegram.ui.Wallet.o) obj2).a((String) obj);
                return;
            case 11:
                ((org.telegram.ui.Wallet.s0) obj3).close();
                ((org.telegram.ui.Wallet.o) obj2).a((String) obj);
                return;
            case 12:
                ((org.telegram.ui.Wallet.s0) obj3).close();
                ((a31) obj2).a((String) obj);
                return;
            case 13:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) obj3;
                org.telegram.ui.Wallet.v0 v0Var2 = (org.telegram.ui.Wallet.v0) obj2;
                String str3 = (String) obj;
                o6Var.F0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str3)) {
                    org.telegram.ui.Wallet.v8 v8Var = new org.telegram.ui.Wallet.v8();
                    v8Var.s = v0Var2.E();
                    o6Var.presentFragment(v8Var);
                    return;
                } else if (str3 != null) {
                    org.telegram.ui.Components.kc.b0(o6Var).f0(str3, false);
                    return;
                } else {
                    o6Var.presentFragment(new org.telegram.ui.Wallet.oa());
                    return;
                }
            case 14:
                org.telegram.ui.Wallet.v8 v8Var2 = (org.telegram.ui.Wallet.v8) obj3;
                org.telegram.ui.Wallet.v0 v0Var3 = (org.telegram.ui.Wallet.v0) obj2;
                String str4 = (String) obj;
                v8Var2.d.setLoading(false);
                if (str4 != null) {
                    org.telegram.ui.Components.kc.b0(v8Var2).f0(str4, false);
                    return;
                } else {
                    v8Var2.finishFragment();
                    v0Var3.T();
                    return;
                }
            case 15:
                org.telegram.ui.Wallet.e9 e9Var = (org.telegram.ui.Wallet.e9) obj3;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj2;
                String str5 = (String) obj;
                if (str5 != null) {
                    org.telegram.ui.Components.kc.b0(e9Var).f0(str5, false);
                    return;
                }
                e9Var.finishFragment();
                if (g2Var instanceof org.telegram.ui.Wallet.o6) {
                    org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.u3(i10, g2Var), 300L);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Wallet.oa oaVar = (org.telegram.ui.Wallet.oa) obj3;
                String str6 = (String) obj;
                ((org.telegram.messenger.w10) obj2).a(str6);
                if (str6 != null || oaVar.r) {
                    return;
                }
                if (oaVar.getParentLayout() != null) {
                    for (org.telegram.ui.ActionBar.g2 g2Var2 : oaVar.getParentLayout().getFragmentStack()) {
                        if (g2Var2 instanceof org.telegram.ui.Wallet.o6) {
                            ((org.telegram.ui.Wallet.o6) g2Var2).T0();
                        }
                    }
                }
                oaVar.finishFragment();
                return;
            case 17:
                org.telegram.ui.Wallet.za.d0((org.telegram.ui.Wallet.za) obj3, (TL_wallet.tonConnectSession) obj2, (org.telegram.messenger.w10) obj);
                return;
            case 18:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) obj3;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj;
                n1Var.getClass();
                ((org.telegram.ui.web.x0[]) obj2)[0].finishFragment();
                org.telegram.messenger.w10 w10Var = n1Var.f;
                if (w10Var == null) {
                    vf.c.t(n1Var.getParentActivity(), w0Var.c);
                    return;
                } else {
                    n1Var.finishFragment();
                    w10Var.a(w0Var);
                    return;
                }
            default:
                org.telegram.ui.web.w1 w1Var = (org.telegram.ui.web.w1) obj3;
                w1Var.getClass();
                org.telegram.messenger.g0.g3(new org.telegram.ui.Components.as0(w1Var, (org.telegram.ui.web.v1) obj2, (Bitmap) obj, 16));
                return;
        }
    }

    public /* synthetic */ a31(org.telegram.ui.Wallet.v0 v0Var, org.telegram.ui.Wallet.p0 p0Var, org.telegram.ui.Wallet.z8 z8Var) {
        this.a = 6;
        this.b = p0Var;
        this.c = z8Var;
    }
}
