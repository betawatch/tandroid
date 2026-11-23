package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class nr0 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ pr0 d;

    public nr0(pr0 pr0Var, Context context) {
        this.d = pr0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7;
        int b10 = f1Var.b();
        pr0 pr0Var = this.d;
        if (b10 == pr0Var.j0 || b10 == pr0Var.v0 || b10 == pr0Var.w0) {
            return !pr0Var.J;
        }
        if (!pr0Var.J || b10 < (i7 = pr0Var.o0) || b10 >= pr0Var.E + i7) {
            if (b10 != pr0Var.p0 && b10 != pr0Var.s0 && b10 != pr0Var.t0 && (pr0Var.O != 0 || b10 != pr0Var.u0)) {
                return false;
            }
        } else if (b10 - i7 < pr0Var.y) {
            return false;
        }
        return true;
    }

    @Override // v4.i0
    public final int b() {
        return this.d.y0;
    }

    @Override // v4.i0
    public final int d(int i7) {
        pr0 pr0Var = this.d;
        if (i7 == pr0Var.i0 || i7 == pr0Var.n0 || i7 == pr0Var.r0) {
            return 0;
        }
        if (i7 == pr0Var.m0) {
            return 1;
        }
        if (i7 == pr0Var.q0 || i7 == pr0Var.x0 || i7 == pr0Var.l0) {
            return 2;
        }
        if (i7 == pr0Var.p0) {
            return 3;
        }
        if (i7 == pr0Var.j0) {
            return 4;
        }
        if (i7 == pr0Var.k0) {
            return 7;
        }
        return (i7 == pr0Var.s0 || i7 == pr0Var.t0 || i7 == pr0Var.u0 || i7 == pr0Var.v0 || i7 == pr0Var.w0) ? 6 : 5;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        pr0 pr0Var = this.d;
        int i10 = pr0Var.O;
        boolean z10 = pr0Var.e0;
        int i11 = f1Var.f;
        View view = f1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            if (i7 == pr0Var.i0) {
                o4Var.setText(org.telegram.messenger.gd.N0(z10 ? pr0Var.A0 != null ? 2131743829 : 2131743809 : 2131746971, null));
                return;
            }
            if (i7 != pr0Var.n0) {
                if (i7 == pr0Var.r0) {
                    o4Var.setText(org.telegram.messenger.gd.N0(2131745299, null));
                    return;
                }
                return;
            } else if (i10 == 1) {
                o4Var.setText(org.telegram.messenger.gd.N0(2131746251, null));
                return;
            } else {
                o4Var.setText(org.telegram.messenger.gd.N0(z10 ? 2131743827 : 2131754243, null));
                return;
            }
        }
        if (i11 == 6) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setEnabled(!pr0Var.J);
            r8Var.getCheckBox().setAlpha(!pr0Var.J ? 1.0f : 0.6f);
            if (i7 == pr0Var.v0) {
                r8Var.f(org.telegram.messenger.gd.N0(2131743848, null), pr0Var.I, true);
                r8Var.e(null, true);
                return;
            }
            if (i7 == pr0Var.w0) {
                r8Var.f(org.telegram.messenger.gd.N0(2131743847, null), pr0Var.K, false);
                r8Var.e(null, true);
                return;
            }
            if (i7 == pr0Var.s0) {
                r8Var.f(org.telegram.messenger.gd.N0(2131746984, null), pr0Var.H, (pr0Var.t0 == -1 && pr0Var.u0 == -1) ? false : true);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.t0) {
                r8Var.f(org.telegram.messenger.gd.N0(2131746972, null), pr0Var.L, pr0Var.u0 != -1);
                r8Var.e(null, true);
                return;
            } else {
                if (i7 == pr0Var.u0) {
                    r8Var.f(org.telegram.messenger.gd.N0(2131746970, null), pr0Var.M, false);
                    r8Var.e(null, i10 == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i11 != 2) {
            if (i11 != 3) {
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            m8Var.g(-1, org.telegram.ui.ActionBar.n6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i12 = org.telegram.ui.ActionBar.n6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.u6.x(m8Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.u6.x(m8Var, drawable2, org.telegram.ui.ActionBar.n6.k7, null, mode);
            m8Var.p(org.telegram.messenger.gd.N0(z10 ? 2131743823 : 2131754468, null), new org.telegram.ui.Components.lq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.setFixedSize(0);
        org.telegram.ui.ActionBar.u6.Z(z8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.n6.b7);
        if (i7 == pr0Var.l0) {
            z8Var.setText(org.telegram.messenger.gd.N0(2131754469, null));
            return;
        }
        if (i7 == pr0Var.x0) {
            z8Var.setFixedSize(12);
            z8Var.setText(null);
            return;
        }
        int i13 = pr0Var.n - pr0Var.E;
        if (i13 <= 0) {
            z8Var.setText(org.telegram.messenger.gd.N0(z10 ? 2131743863 : 2131754466, null));
        } else if (z10) {
            z8Var.setText(org.telegram.messenger.gd.H(',', "TodoNewTaskInfo", i13));
        } else {
            z8Var.setText(org.telegram.messenger.gd.a0("AddAnOptionInfo", null, 2131754467, org.telegram.messenger.gd.G(i13, "Option", new Object[0])));
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        pr0 pr0Var = this.d;
        boolean z10 = pr0Var.d0;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
            } else if (i7 == 2) {
                view = new org.telegram.ui.Cells.z8(context);
            } else if (i7 == 3) {
                View m8Var = new org.telegram.ui.Cells.m8(context);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, m8Var, null);
                view = m8Var;
            } else if (i7 == 4) {
                kr0 kr0Var = new kr0(this, context, z10 ? 1 : 0);
                kr0Var.d();
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, kr0Var, null);
                kr0Var.c(new bi.v(14, this, kr0Var));
                view = kr0Var;
            } else if (i7 == 6) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, r8Var, null);
                view = r8Var;
            } else if (i7 != 7) {
                mr0 mr0Var = new mr0(this, context, z10 ? 1 : 0, new i40(pr0Var, 22));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, mr0Var, null);
                mr0Var.c(new bi.v(16, this, mr0Var));
                mr0Var.setShowNextButton(true);
                EditTextBoldCursor textView = mr0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new ld(3, this, mr0Var));
                textView.setOnKeyListener(new uf(mr0Var, 2));
                view = mr0Var;
            } else {
                lr0 lr0Var = new lr0(this, context, z10 ? 1 : 0);
                lr0Var.d();
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, lr0Var, null);
                lr0Var.c(new bi.v(15, this, lr0Var));
                view = lr0Var;
            }
        } else {
            View o4Var = new org.telegram.ui.Cells.o4(this.c, org.telegram.ui.ActionBar.n6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, o4Var, null);
            view = o4Var;
        }
        return i5.c.q(view, view, -1, -2);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        pr0 pr0Var = this.d;
        boolean z10 = pr0Var.e0;
        int i7 = f1Var.f;
        View view = f1Var.a;
        if (i7 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            bi.u uVar = a6Var.d;
            CharSequence charSequence = pr0Var.F;
            a6Var.o(charSequence != null ? charSequence : "", org.telegram.messenger.gd.N0(z10 ? 2131743808 : 2131746252, null), false);
            a6Var.setTag(null);
            a6Var.setEnabled(!pr0Var.J);
            uVar.setEnabled(true ^ pr0Var.J);
            org.telegram.ui.ActionBar.u6.V(uVar, org.telegram.ui.ActionBar.u6.K(pr0Var.J ? 0.6f : 1.0f, org.telegram.ui.ActionBar.n6.G6), pr0Var.getResourceProvider());
            pr0.h0(pr0Var, view, f1Var.b());
            return;
        }
        if (i7 != 5) {
            if (i7 == 7) {
                org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
                a6Var2.setTag(1);
                CharSequence charSequence2 = pr0Var.G;
                a6Var2.o(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.gd.N0(2131754471, null), false);
                a6Var2.setTag(null);
                pr0.h0(pr0Var, view, f1Var.b());
                return;
            }
            return;
        }
        int b10 = f1Var.b();
        org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
        a6Var3.setTag(1);
        bi.u uVar2 = a6Var3.d;
        int i10 = b10 - pr0Var.o0;
        boolean z11 = !pr0Var.J || i10 >= pr0Var.y;
        uVar2.setEnabled(z11);
        org.telegram.ui.ActionBar.u6.V(uVar2, org.telegram.ui.ActionBar.u6.K(z11 ? 1.0f : 0.6f, org.telegram.ui.ActionBar.n6.G6), pr0Var.getResourceProvider());
        a6Var3.o(pr0Var.w[i10], org.telegram.messenger.gd.N0(z10 ? 2131743810 : 2131747580, null), true);
        a6Var3.setTag(null);
        ImageView imageView = a6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = a6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!pr0Var.g0 && pr0Var.h0 == b10) {
            EditTextBoldCursor textView = a6Var3.getTextView();
            textView.requestFocus();
            org.telegram.messenger.g0.I3(textView);
            pr0Var.g0 = false;
            pr0Var.h0 = -1;
        }
        pr0.h0(pr0Var, view, b10);
    }

    @Override // v4.i0
    public final void z(v4.f1 f1Var) {
        int i7 = f1Var.f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) f1Var.a).getTextView();
            if (textView.isFocused()) {
                pr0 pr0Var = this.d;
                if (pr0Var.d0) {
                    org.telegram.ui.Components.zw0 zw0Var = pr0Var.R;
                    if (zw0Var != null) {
                        zw0Var.f();
                    }
                    pr0Var.p0(true);
                }
                pr0Var.c0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}
