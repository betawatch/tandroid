package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class nr0 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ pr0 d;

    public nr0(pr0 pr0Var, Context context) {
        this.d = pr0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7;
        int b10 = d1Var.b();
        pr0 pr0Var = this.d;
        if (b10 == pr0Var.i0 || b10 == pr0Var.u0 || b10 == pr0Var.v0) {
            return !pr0Var.I;
        }
        if (!pr0Var.I || b10 < (i7 = pr0Var.n0) || b10 >= pr0Var.D + i7) {
            if (b10 != pr0Var.o0 && b10 != pr0Var.r0 && b10 != pr0Var.s0 && (pr0Var.N != 0 || b10 != pr0Var.t0)) {
                return false;
            }
        } else if (b10 - i7 < pr0Var.y) {
            return false;
        }
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.d.x0;
    }

    @Override // v4.g0
    public final int d(int i7) {
        pr0 pr0Var = this.d;
        if (i7 == pr0Var.h0 || i7 == pr0Var.m0 || i7 == pr0Var.q0) {
            return 0;
        }
        if (i7 == pr0Var.l0) {
            return 1;
        }
        if (i7 == pr0Var.p0 || i7 == pr0Var.w0 || i7 == pr0Var.k0) {
            return 2;
        }
        if (i7 == pr0Var.o0) {
            return 3;
        }
        if (i7 == pr0Var.i0) {
            return 4;
        }
        if (i7 == pr0Var.j0) {
            return 7;
        }
        return (i7 == pr0Var.r0 || i7 == pr0Var.s0 || i7 == pr0Var.t0 || i7 == pr0Var.u0 || i7 == pr0Var.v0) ? 6 : 5;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        pr0 pr0Var = this.d;
        int i10 = pr0Var.N;
        boolean z9 = pr0Var.d0;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == pr0Var.h0) {
                n4Var.setText(org.telegram.messenger.hd.M0(z9 ? pr0Var.z0 != null ? 2131744075 : 2131744055 : 2131747164, null));
                return;
            }
            if (i7 != pr0Var.m0) {
                if (i7 == pr0Var.q0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131745496, null));
                    return;
                }
                return;
            } else if (i10 == 1) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746446, null));
                return;
            } else {
                n4Var.setText(org.telegram.messenger.hd.M0(z9 ? 2131744073 : 2131754246, null));
                return;
            }
        }
        if (i11 == 6) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setEnabled(!pr0Var.I);
            r8Var.getCheckBox().setAlpha(!pr0Var.I ? 1.0f : 0.6f);
            if (i7 == pr0Var.u0) {
                r8Var.f(org.telegram.messenger.hd.M0(2131744094, null), pr0Var.H, true);
                r8Var.e(null, true);
                return;
            }
            if (i7 == pr0Var.v0) {
                r8Var.f(org.telegram.messenger.hd.M0(2131744093, null), pr0Var.J, false);
                r8Var.e(null, true);
                return;
            }
            if (i7 == pr0Var.r0) {
                r8Var.f(org.telegram.messenger.hd.M0(2131747177, null), pr0Var.G, (pr0Var.s0 == -1 && pr0Var.t0 == -1) ? false : true);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.s0) {
                r8Var.f(org.telegram.messenger.hd.M0(2131747165, null), pr0Var.K, pr0Var.t0 != -1);
                r8Var.e(null, true);
                return;
            } else {
                if (i7 == pr0Var.t0) {
                    r8Var.f(org.telegram.messenger.hd.M0(2131747163, null), pr0Var.L, false);
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
            m8Var.g(-1, org.telegram.ui.ActionBar.k6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i12 = org.telegram.ui.ActionBar.k6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(m8Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.r6.y(m8Var, drawable2, org.telegram.ui.ActionBar.k6.k7, null, mode);
            m8Var.p(org.telegram.messenger.hd.M0(z9 ? 2131744069 : 2131754471, null), new org.telegram.ui.Components.xp(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        z8Var.setFixedSize(0);
        org.telegram.ui.ActionBar.r6.a0(z8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
        if (i7 == pr0Var.k0) {
            z8Var.setText(org.telegram.messenger.hd.M0(2131754472, null));
            return;
        }
        if (i7 == pr0Var.w0) {
            z8Var.setFixedSize(12);
            z8Var.setText(null);
            return;
        }
        int i13 = pr0Var.n - pr0Var.D;
        if (i13 <= 0) {
            z8Var.setText(org.telegram.messenger.hd.M0(z9 ? 2131744109 : 2131754469, null));
        } else if (z9) {
            z8Var.setText(org.telegram.messenger.hd.H(',', "TodoNewTaskInfo", i13));
        } else {
            z8Var.setText(org.telegram.messenger.hd.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.hd.G(i13, "Option", new Object[0])));
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        pr0 pr0Var = this.d;
        boolean z9 = pr0Var.c0;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                view = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            } else if (i7 == 2) {
                view = new org.telegram.ui.Cells.z8(context);
            } else if (i7 == 3) {
                View m8Var = new org.telegram.ui.Cells.m8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, m8Var, null);
                view = m8Var;
            } else if (i7 == 4) {
                kr0 kr0Var = new kr0(this, context, z9 ? 1 : 0);
                kr0Var.c();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, kr0Var, null);
                kr0Var.b(new fi.h7(7, this, kr0Var));
                view = kr0Var;
            } else if (i7 == 6) {
                View r8Var = new org.telegram.ui.Cells.r8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, r8Var, null);
                view = r8Var;
            } else if (i7 != 7) {
                mr0 mr0Var = new mr0(this, context, z9 ? 1 : 0, new g40(pr0Var, 22));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, mr0Var, null);
                mr0Var.b(new fi.h7(9, this, mr0Var));
                mr0Var.setShowNextButton(true);
                EditTextBoldCursor textView = mr0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new nd(3, this, mr0Var));
                textView.setOnKeyListener(new zf(mr0Var, 2));
                view = mr0Var;
            } else {
                lr0 lr0Var = new lr0(this, context, z9 ? 1 : 0);
                lr0Var.c();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, lr0Var, null);
                lr0Var.b(new fi.h7(8, this, lr0Var));
                view = lr0Var;
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, null);
            view = n4Var;
        }
        return jg.g.r(view, view, -1, -2);
    }

    @Override // v4.g0
    public final void y(v4.d1 d1Var) {
        pr0 pr0Var = this.d;
        boolean z9 = pr0Var.d0;
        int i7 = d1Var.f;
        View view = d1Var.a;
        if (i7 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            org.telegram.ui.Cells.z5 z5Var = a6Var.d;
            CharSequence charSequence = pr0Var.E;
            a6Var.n(charSequence != null ? charSequence : "", org.telegram.messenger.hd.M0(z9 ? 2131744054 : 2131746447, null), false);
            a6Var.setTag(null);
            a6Var.setEnabled(!pr0Var.I);
            z5Var.setEnabled(true ^ pr0Var.I);
            org.telegram.ui.ActionBar.r6.W(z5Var, org.telegram.ui.ActionBar.r6.L(pr0Var.I ? 0.6f : 1.0f, org.telegram.ui.ActionBar.k6.G6), pr0Var.getResourceProvider());
            pr0.h0(pr0Var, view, d1Var.b());
            return;
        }
        if (i7 != 5) {
            if (i7 == 7) {
                org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
                a6Var2.setTag(1);
                CharSequence charSequence2 = pr0Var.F;
                a6Var2.n(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.hd.M0(2131754474, null), false);
                a6Var2.setTag(null);
                pr0.h0(pr0Var, view, d1Var.b());
                return;
            }
            return;
        }
        int b10 = d1Var.b();
        org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
        a6Var3.setTag(1);
        org.telegram.ui.Cells.z5 z5Var2 = a6Var3.d;
        int i10 = b10 - pr0Var.n0;
        boolean z10 = !pr0Var.I || i10 >= pr0Var.y;
        z5Var2.setEnabled(z10);
        org.telegram.ui.ActionBar.r6.W(z5Var2, org.telegram.ui.ActionBar.r6.L(z10 ? 1.0f : 0.6f, org.telegram.ui.ActionBar.k6.G6), pr0Var.getResourceProvider());
        a6Var3.n(pr0Var.w[i10], org.telegram.messenger.hd.M0(z9 ? 2131744056 : 2131747773, null), true);
        a6Var3.setTag(null);
        ImageView imageView = a6Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
        ImageView imageView2 = a6Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z10 ? 1.0f : 0.45f);
        }
        if (!pr0Var.f0 && pr0Var.g0 == b10) {
            EditTextBoldCursor textView = a6Var3.getTextView();
            textView.requestFocus();
            org.telegram.messenger.g0.K3(textView);
            pr0Var.f0 = false;
            pr0Var.g0 = -1;
        }
        pr0.h0(pr0Var, view, b10);
    }

    @Override // v4.g0
    public final void z(v4.d1 d1Var) {
        int i7 = d1Var.f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) d1Var.a).getTextView();
            if (textView.isFocused()) {
                pr0 pr0Var = this.d;
                if (pr0Var.c0) {
                    org.telegram.ui.Components.ow0 ow0Var = pr0Var.Q;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    pr0Var.p0(true);
                }
                pr0Var.b0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}
