package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class om extends org.telegram.ui.ActionBar.m0 {
    public float a;
    public final /* synthetic */ wm b;

    public om(wm wmVar) {
        this.b = wmVar;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean a() {
        return this.b.J3 == null;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean b() {
        wm wmVar = this.b;
        if (!wmVar.fd.f) {
            if (wmVar.J3 != null && wmVar.E1 != null) {
                View currentView = wmVar.F1.getCurrentView();
                wm wmVar2 = currentView instanceof ym ? ((ym) currentView).a : wmVar;
                if (!wmVar2.dd.f) {
                    wmVar2.oc(true);
                    return false;
                }
                int currentPosition = wmVar.E1.a.getCurrentPosition();
                int i3 = wmVar.G1;
                if (currentPosition != i3) {
                    wmVar.E1.a.d(i3, i3);
                    return false;
                }
            } else if (wmVar.dd.f) {
                wmVar.oc(false);
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean d() {
        return this.b.C3;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void f() {
        wm wmVar = this.b;
        wmVar.a8();
        if (wmVar.D3 != null || wmVar.E3 != null) {
            ImageView imageView = wmVar.i3;
            if (imageView != null) {
                imageView.callOnClick();
                return;
            }
            return;
        }
        if (wmVar.C3) {
            wmVar.X1.getAdapter().U(null, 0, null, false, true);
            wmVar.C3 = false;
            wmVar.k0.P("", true);
        }
        wmVar.k0.setSearchFieldHint(org.telegram.messenger.bd.M0(wmVar.ca() ? 2131745878 : 2131745846, null));
        wmVar.h3.setVisibility(0);
        ImageView imageView2 = wmVar.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        wmVar.D3 = null;
        wmVar.E3 = null;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void h() {
        int i3;
        int i10;
        org.telegram.messenger.zi ziVar;
        TLRPC.Chat chat;
        wm wmVar = this.b;
        wmVar.H3 = false;
        wmVar.Zc();
        wmVar.md();
        ImageView imageView = wmVar.h3;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = wmVar.i3;
        if (imageView2 != null) {
            imageView2.setVisibility(0);
        }
        if (wmVar.C3) {
            wmVar.X1.getAdapter().U(null, 0, null, false, true);
            wmVar.C3 = false;
        }
        wmVar.X1.setReversed(false);
        wmVar.X1.getAdapter().l0 = false;
        wmVar.A7();
        wmVar.D3 = null;
        wmVar.E3 = null;
        wmVar.J3 = null;
        wmVar.k0.setSearchFieldHint(org.telegram.messenger.bd.M0(wmVar.ca() ? 2131745878 : 2131745846, null));
        wmVar.k0.setSearchFieldCaption(null);
        wmVar.ed.a(false, true);
        wmVar.fd.a(false, true);
        if (wmVar.a0.h0() && TextUtils.isEmpty(wmVar.a0.getSlowModeTimer()) && (((chat = wmVar.e) == null || org.telegram.messenger.t3.q(chat)) && !wmVar.aa())) {
            org.telegram.ui.ActionBar.q0 q0Var = wmVar.j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar = wmVar.g0;
            if (wVar != null) {
                wVar.e(0);
            }
            ar arVar = wmVar.f0;
            if (arVar != null) {
                arVar.b(true);
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = wmVar.p0;
            if (q0Var2 != null && wmVar.ea) {
                q0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar2 = wmVar.q0;
            if (wVar2 != null && wmVar.fa) {
                wVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = wmVar.l0;
            if (q0Var3 != null) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = wmVar.m0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
        } else {
            org.telegram.ui.ActionBar.q0 q0Var5 = wmVar.j0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w wVar3 = wmVar.q0;
            if (wVar3 != null && wmVar.fa) {
                wVar3.e(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var6 = wmVar.l0;
            if (q0Var6 != null) {
                q0Var6.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var7 = wmVar.p0;
            if (q0Var7 != null && wmVar.ea) {
                q0Var7.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w wVar4 = wmVar.g0;
            if (wVar4 != null) {
                wVar4.e(8);
            }
            ar arVar2 = wmVar.f0;
            if (arVar2 != null) {
                arVar2.b(false);
            }
        }
        if (wmVar.F1 != null) {
            if (wmVar.E1.a.getCurrentPosition() != 0) {
                wmVar.E1.a.d(0, 0);
                wmVar.H1 = true;
            } else {
                wmVar.F1.h.clear();
            }
        }
        int i11 = wmVar.g4;
        if (i11 == 3 || i11 == 8 || ((wmVar.s4 == 0 && !org.telegram.messenger.l10.z(wmVar.f)) || ((ziVar = wmVar.m4) != null && ziVar.N1() < 10))) {
            wmVar.k0.setVisibility(8);
        }
        wmVar.r0 = false;
        wmVar.zd();
        org.telegram.messenger.li mediaDataController = wmVar.getMediaDataController();
        mediaDataController.Z0.clear();
        mediaDataController.a1.clear();
        mediaDataController.b1.clear();
        if (wmVar.d4 == 3) {
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.ha.a(i10).b(3).a();
        } else {
            i3 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(i3);
            a10.b.a();
            a10.c.a();
        }
        kg.i1 i1Var = wmVar.b4;
        if (i1Var != null) {
            i1Var.f();
        }
        wmVar.hb();
        wmVar.Lc(false);
        wmVar.cd(0, true);
        wmVar.Cd(false);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 0.0f);
        ofFloat.addUpdateListener(new nm(this, 2));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wmVar.dd.a(false, true);
        wmVar.ld();
        wmVar.F3 = null;
        wmVar.md();
        wmVar.Zc();
        wj wjVar = wmVar.D1;
        if (wjVar != null) {
            wjVar.d.M(new cq(2));
            wjVar.h = 0L;
            wmVar.D1.g(false);
        }
        jj jjVar = wmVar.E1;
        if (jjVar != null) {
            jjVar.b(false);
        }
        wmVar.Mb(false);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void i() {
        jj jjVar;
        int i3;
        wm wmVar = this.b;
        wmVar.H3 = true;
        wmVar.Zc();
        wmVar.md();
        if (((wmVar.s4 != 0 && wmVar.g4 != 3) || org.telegram.messenger.l10.z(wmVar.f)) && !wmVar.Hc) {
            wmVar.La(null);
        }
        if (wmVar.j5) {
            wmVar.saveKeyboardPositionBeforeTransition();
            if (!wmVar.jb) {
                Activity parentActivity = wmVar.getParentActivity();
                i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                org.telegram.messenger.g0.a3(parentActivity, i3);
            }
            org.telegram.messenger.g0.i3(new xg(this, 10), 500L);
            gi.l3 l3Var = wmVar.v2;
            if (l3Var != null) {
                l3Var.f(true);
            }
            gi.l3 l3Var2 = wmVar.x2;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
        ofFloat.addUpdateListener(new nm(this, 1));
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
        ofFloat.setDuration(320L);
        ofFloat.start();
        wj wjVar = wmVar.D1;
        if (wjVar != null) {
            wjVar.g(!wmVar.jb && wjVar.a() && wmVar.J3 == null);
        }
        if (wmVar.J3 == null || (jjVar = wmVar.E1) == null) {
            return;
        }
        int currentPosition = jjVar.a.getCurrentPosition();
        int i10 = wmVar.G1;
        if (currentPosition != i10) {
            wmVar.E1.a.d(i10, i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void j(kg.l0 l0Var) {
        wm wmVar = this.b;
        wj wjVar = wmVar.D1;
        if (wjVar != null) {
            wjVar.d.M(new cq(2));
            wjVar.h = 0L;
        }
        wmVar.F3 = null;
        wmVar.md();
        wmVar.Zc();
        wmVar.Mb(false);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        int i3;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.e6 e6Var;
        wm wmVar = this.b;
        boolean z10 = false;
        wmVar.jd(0, 0, -1);
        String obj = editTextBoldCursor != null ? editTextBoldCursor.getText().toString() : wmVar.I3;
        wmVar.I3 = obj;
        if (TextUtils.isEmpty(obj) || !(wmVar.I3.startsWith("$") || wmVar.I3.startsWith("#"))) {
            wmVar.J3 = null;
            jj jjVar = wmVar.E1;
            if (jjVar != null) {
                jjVar.b(false);
                wmVar.ld();
            }
            jj jjVar2 = wmVar.E1;
            if (jjVar2 != null && jjVar2.a.getCurrentPosition() != 0) {
                wmVar.E1.a.d(0, 0);
            }
        } else {
            wmVar.b8();
            if (wmVar.I3.contains("@")) {
                String str = wmVar.I3;
                e6Var = ((org.telegram.ui.ActionBar.d2) wmVar).resourceProvider;
                wmVar.presentFragment(new org.telegram.ui.Components.n20(str, e6Var));
                return;
            }
            if (wmVar.J3 == null) {
                wmVar.J3 = wmVar.I3;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a, 1.0f);
                ofFloat.addUpdateListener(new nm(this, 0));
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                ofFloat.setDuration(320L);
                ofFloat.start();
                wj wjVar = wmVar.D1;
                if (wjVar != null) {
                    if (!wmVar.jb && wjVar.a() && wmVar.J3 == null) {
                        z10 = true;
                    }
                    wjVar.g(z10);
                }
            }
            wmVar.J3 = wmVar.I3;
            wmVar.f7(true);
            i10 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
            org.telegram.messenger.ha.a(i10).c(wmVar.J3);
            wmVar.I1.f.O(true);
            View currentView = wmVar.F1.getCurrentView();
            if (wmVar.d4 == 3) {
                i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                org.telegram.messenger.ha.a(i12).b(3).a();
            } else {
                i11 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(i11);
                a10.b.a();
                a10.c.a();
            }
            if (currentView instanceof ym) {
                ((ym) currentView).a.nd(wmVar.J3);
            }
            wmVar.ld();
            wmVar.s2.e(true, true);
            wmVar.oc(true);
            z10 = true;
        }
        jj jjVar3 = wmVar.E1;
        if (jjVar3 != null) {
            jjVar3.b(z10);
        }
        org.telegram.messenger.li mediaDataController = wmVar.getMediaDataController();
        String str2 = wmVar.I3;
        long j10 = wmVar.k6;
        long j11 = wmVar.c7;
        i3 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
        mediaDataController.X1(str2, j10, j11, i3, 0, wmVar.s4, false, wmVar.D3, wmVar.E3, true, wmVar.F3);
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        wm wmVar = this.b;
        qe.a aVar = wmVar.fd;
        if (wmVar.J3 == null) {
            wmVar.oc(false);
        }
        wmVar.a8();
        if (wmVar.C3) {
            wmVar.X1.getAdapter().U("@" + editText.getText().toString(), 0, wmVar.L6, true, true);
        } else if (wmVar.D3 == null && wmVar.E3 == null && wmVar.i3 != null && TextUtils.equals(editText.getText(), org.telegram.messenger.bd.M0(2131745776, null))) {
            wmVar.i3.callOnClick();
        }
        if (wmVar.J3 != null) {
            boolean z10 = editText.length() == 0;
            if (z10 != aVar.f) {
                if (z10) {
                    wmVar.b8();
                }
                aVar.a(z10, true);
                gi.g1 g1Var = wmVar.F1;
                if (g1Var != null) {
                    g1Var.D(0);
                }
                if (z10) {
                    wmVar.oc(true);
                }
                wmVar.Lc(false);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final boolean m() {
        return this.b.J3 == null;
    }
}
