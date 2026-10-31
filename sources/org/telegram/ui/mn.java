package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mn extends org.telegram.ui.ActionBar.p0 {
    public float a;
    public final /* synthetic */ un b;

    public mn(un unVar) {
        this.b = unVar;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final boolean a() {
        return this.b.I3 == null;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final boolean b() {
        un unVar = this.b;
        if (!unVar.Wc.f) {
            if (unVar.I3 != null && unVar.D1 != null) {
                View currentView = unVar.E1.getCurrentView();
                un unVar2 = currentView instanceof wn ? ((wn) currentView).a : unVar;
                if (!unVar2.Uc.f) {
                    unVar2.ec(true);
                    return false;
                }
                int currentPosition = unVar.D1.a.getCurrentPosition();
                int i10 = unVar.F1;
                if (currentPosition != i10) {
                    unVar.D1.a.d(i10, i10);
                    return false;
                }
            } else if (unVar.Uc.f) {
                unVar.ec(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final boolean d() {
        return this.b.B3;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void f() {
        un unVar = this.b;
        unVar.T7();
        if (unVar.C3 != null || unVar.D3 != null) {
            ImageView imageView = unVar.h3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (unVar.B3) {
            unVar.W1.getAdapter().U(null, 0, null, false, true);
            unVar.B3 = false;
            unVar.j0.P("", true);
        }
        unVar.j0.setSearchFieldHint(org.telegram.messenger.cd.L0(unVar.S9() ? 2131745885 : 2131745853, null));
        unVar.g3.setVisibility(0);
        ImageView imageView2 = unVar.h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        unVar.C3 = null;
        unVar.D3 = null;
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void h() {
        int i10;
        int i11;
        org.telegram.messenger.jj jjVar;
        TLRPC.Chat chat;
        un unVar = this.b;
        unVar.G3 = false;
        unVar.Pc();
        unVar.cd();
        ImageView imageView = unVar.g3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = unVar.h3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (unVar.B3) {
            unVar.W1.getAdapter().U(null, 0, null, false, true);
            unVar.B3 = false;
        }
        unVar.W1.setReversed(false);
        unVar.W1.getAdapter().k0 = false;
        unVar.u7();
        unVar.C3 = null;
        unVar.D3 = null;
        unVar.I3 = null;
        unVar.j0.setSearchFieldHint(org.telegram.messenger.cd.L0(unVar.S9() ? 2131745885 : 2131745853, null));
        unVar.j0.setSearchFieldCaption(null);
        unVar.Vc.a(false, true);
        unVar.Wc.a(false, true);
        if (unVar.Z.g0() && TextUtils.isEmpty(unVar.Z.getSlowModeTimer()) && (((chat = unVar.e) == null || org.telegram.messenger.w3.q(chat)) && !unVar.Q9())) {
            org.telegram.ui.ActionBar.t0 t0Var = unVar.i0;
            if (t0Var != null) {
                t0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = unVar.f0;
            if (xVar != null) {
                xVar.e(0);
            }
            cs csVar = unVar.e0;
            if (csVar != null) {
                csVar.b(true);
            }
            org.telegram.ui.ActionBar.t0 t0Var2 = unVar.o0;
            if (t0Var2 != null && unVar.da) {
                t0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = unVar.p0;
            if (xVar2 != null && unVar.ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var3 = unVar.k0;
            if (t0Var3 != null) {
                t0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = unVar.l0;
            if (t0Var4 != null) {
                t0Var4.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.t0 t0Var5 = unVar.i0;
            if (t0Var5 != null) {
                t0Var5.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar3 = unVar.p0;
            if (xVar3 != null && unVar.ea) {
                xVar3.e(0);
            }
            org.telegram.ui.ActionBar.t0 t0Var6 = unVar.k0;
            if (t0Var6 != null) {
                t0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.t0 t0Var7 = unVar.o0;
            if (t0Var7 != null && unVar.da) {
                t0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.x xVar4 = unVar.f0;
            if (xVar4 != null) {
                xVar4.e(8);
            }
            cs csVar2 = unVar.e0;
            if (csVar2 != null) {
                csVar2.b(false);
            }
        }
        if (unVar.E1 != null) {
            if (unVar.D1.a.getCurrentPosition() != 0) {
                unVar.D1.a.d(0, 0);
                unVar.G1 = true;
            } else {
                unVar.E1.h.clear();
            }
        }
        int i12 = unVar.f4;
        if (i12 == 3 || i12 == 8 || ((unVar.r4 == 0 && !org.telegram.messenger.h20.z(unVar.f)) || ((jjVar = unVar.l4) != null && jjVar.N1() < 10))) {
            unVar.j0.setVisibility(8);
        }
        unVar.q0 = false;
        unVar.pd();
        org.telegram.messenger.ui mediaDataController = unVar.getMediaDataController();
        mediaDataController.Y0.clear();
        mediaDataController.Z0.clear();
        mediaDataController.a1.clear();
        if (unVar.c4 == 3) {
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.oa.a(i11).b(3).a();
        } else {
            i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(i10);
            a2.b.a();
            a2.c.a();
        }
        zf.b1 b1Var = unVar.a4;
        if (b1Var != null) {
            b1Var.f();
        }
        unVar.Xa();
        unVar.Bc(false);
        unVar.Sc(0, true);
        unVar.sd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new ln(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        unVar.Uc.a(false, true);
        unVar.bd();
        unVar.E3 = null;
        unVar.cd();
        unVar.Pc();
        wk wkVar = unVar.C1;
        if (wkVar != null) {
            wkVar.d.M(new fr(2));
            wkVar.h = 0L;
            unVar.C1.g(false);
        }
        kk kkVar = unVar.D1;
        if (kkVar != null) {
            kkVar.b(false);
        }
        unVar.Cb(false);
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void i() {
        kk kkVar;
        int i10;
        un unVar = this.b;
        unVar.G3 = true;
        unVar.Pc();
        unVar.cd();
        if (((unVar.r4 != 0 && unVar.f4 != 3) || org.telegram.messenger.h20.z(unVar.f)) && !unVar.yc) {
            unVar.Ba(null);
        }
        if (unVar.i5) {
            unVar.saveKeyboardPositionBeforeTransition();
            if (!unVar.ib) {
                Activity parentActivity = unVar.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
                org.telegram.messenger.i0.Z2(parentActivity, i10);
            }
            org.telegram.messenger.i0.h3(new rh(this, 11), 500L);
            ij ijVar = unVar.u2;
            if (ijVar != null) {
                ijVar.b(true);
            }
            org.telegram.ui.Components.q30 q30Var = unVar.w2;
            if (q30Var != null) {
                q30Var.b(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new ln(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wk wkVar = unVar.C1;
        if (wkVar != null) {
            wkVar.g(!unVar.ib && wkVar.a() && unVar.I3 == null);
        }
        if (unVar.I3 == null || (kkVar = unVar.D1) == null) {
            return;
        }
        int currentPosition = kkVar.a.getCurrentPosition();
        int i11 = unVar.F1;
        if (currentPosition != i11) {
            unVar.D1.a.d(i11, i11);
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void j(zf.e0 e0Var) {
        un unVar = this.b;
        wk wkVar = unVar.C1;
        if (wkVar != null) {
            wkVar.d.M(new fr(2));
            wkVar.h = 0L;
        }
        unVar.E3 = null;
        unVar.cd();
        unVar.Pc();
        unVar.Cb(false);
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.p6 p6Var;
        un unVar = this.b;
        boolean z10 = false;
        unVar.Zc(0, 0, -1);
        String obj = editTextBoldCursor != null ? editTextBoldCursor.getText().toString() : unVar.H3;
        unVar.H3 = obj;
        if (TextUtils.isEmpty(obj) || !(unVar.H3.startsWith("$") || unVar.H3.startsWith("#"))) {
            unVar.I3 = null;
            kk kkVar = unVar.D1;
            if (kkVar != null) {
                kkVar.b(false);
                unVar.bd();
            }
            kk kkVar2 = unVar.D1;
            if (kkVar2 != null && kkVar2.a.getCurrentPosition() != 0) {
                unVar.D1.a.d(0, 0);
            }
        } else {
            unVar.U7();
            if (unVar.H3.contains("@")) {
                String str = unVar.H3;
                p6Var = ((org.telegram.ui.ActionBar.k2) unVar).resourceProvider;
                unVar.presentFragment(new org.telegram.ui.Components.j30(str, p6Var));
                return;
            }
            if (unVar.I3 == null) {
                unVar.I3 = unVar.H3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new ln(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                wk wkVar = unVar.C1;
                if (wkVar != null) {
                    if (!unVar.ib && wkVar.a() && unVar.I3 == null) {
                        z10 = true;
                    }
                    wkVar.g(z10);
                }
            }
            unVar.I3 = unVar.H3;
            unVar.Z6(true);
            i11 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
            org.telegram.messenger.oa.a(i11).c(unVar.I3);
            unVar.H1.f.O(true);
            View currentView = unVar.E1.getCurrentView();
            if (unVar.c4 == 3) {
                i13 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                org.telegram.messenger.oa.a(i13).b(3).a();
            } else {
                i12 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(i12);
                a2.b.a();
                a2.c.a();
            }
            if (currentView instanceof wn) {
                ((wn) currentView).a.dd(unVar.I3);
            }
            unVar.bd();
            unVar.r2.e(true, true);
            unVar.ec(true);
            z10 = true;
        }
        kk kkVar3 = unVar.D1;
        if (kkVar3 != null) {
            kkVar3.b(z10);
        }
        org.telegram.messenger.ui mediaDataController = unVar.getMediaDataController();
        String str2 = unVar.H3;
        long j10 = unVar.j6;
        long j11 = unVar.b7;
        i10 = ((org.telegram.ui.ActionBar.k2) unVar).classGuid;
        mediaDataController.X1(str2, j10, j11, i10, 0, unVar.r4, false, unVar.C3, unVar.D3, true, unVar.E3);
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void l(EditText editText) {
        un unVar = this.b;
        fe.b bVar = unVar.Wc;
        if (unVar.I3 == null) {
            unVar.ec(false);
        }
        unVar.T7();
        if (unVar.B3) {
            unVar.W1.getAdapter().U("@" + editText.getText().toString(), 0, unVar.K6, true, true);
        } else if (unVar.C3 == null && unVar.D3 == null && unVar.h3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.cd.L0(2131745783, null))) {
            unVar.h3.callOnClick();
        }
        if (unVar.I3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != bVar.f) {
                if (z10) {
                    unVar.U7();
                }
                bVar.a(z10, true);
                hk hkVar = unVar.E1;
                if (hkVar != null) {
                    hkVar.E(0);
                }
                if (z10) {
                    unVar.ec(true);
                }
                unVar.Bc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final boolean m() {
        return this.b.I3 == null;
    }
}
