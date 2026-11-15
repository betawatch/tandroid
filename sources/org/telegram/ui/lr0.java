package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class lr0 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ nr0 d;

    public lr0(nr0 nr0Var, Context context) {
        this.d = nr0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7;
        int b10 = e1Var.b();
        nr0 nr0Var = this.d;
        if (b10 == nr0Var.j0 || b10 == nr0Var.v0 || b10 == nr0Var.w0) {
            return !nr0Var.J;
        }
        if (!nr0Var.J || b10 < (i7 = nr0Var.o0) || b10 >= nr0Var.E + i7) {
            if (b10 != nr0Var.p0 && b10 != nr0Var.s0 && b10 != nr0Var.t0 && (nr0Var.O != 0 || b10 != nr0Var.u0)) {
                return false;
            }
        } else if (b10 - i7 < nr0Var.y) {
            return false;
        }
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.d.y0;
    }

    @Override // v4.h0
    public final int d(int i7) {
        nr0 nr0Var = this.d;
        if (i7 == nr0Var.i0 || i7 == nr0Var.n0 || i7 == nr0Var.r0) {
            return 0;
        }
        if (i7 == nr0Var.m0) {
            return 1;
        }
        if (i7 == nr0Var.q0 || i7 == nr0Var.x0 || i7 == nr0Var.l0) {
            return 2;
        }
        if (i7 == nr0Var.p0) {
            return 3;
        }
        if (i7 == nr0Var.j0) {
            return 4;
        }
        if (i7 == nr0Var.k0) {
            return 7;
        }
        return (i7 == nr0Var.s0 || i7 == nr0Var.t0 || i7 == nr0Var.u0 || i7 == nr0Var.v0 || i7 == nr0Var.w0) ? 6 : 5;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        nr0 nr0Var = this.d;
        int i10 = nr0Var.O;
        boolean z10 = nr0Var.e0;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i7 == nr0Var.i0) {
                n4Var.setText(org.telegram.messenger.hd.M0(z10 ? nr0Var.A0 != null ? 2131744074 : 2131744054 : 2131747165, null));
                return;
            }
            if (i7 != nr0Var.n0) {
                if (i7 == nr0Var.r0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131745495, null));
                    return;
                }
                return;
            } else if (i10 == 1) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746447, null));
                return;
            } else {
                n4Var.setText(org.telegram.messenger.hd.M0(z10 ? 2131744072 : 2131754246, null));
                return;
            }
        }
        if (i11 == 6) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.setEnabled(!nr0Var.J);
            q8Var.getCheckBox().setAlpha(!nr0Var.J ? 1.0f : 0.6f);
            if (i7 == nr0Var.v0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131744093, null), nr0Var.I, true);
                q8Var.e(null, true);
                return;
            }
            if (i7 == nr0Var.w0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131744092, null), nr0Var.K, false);
                q8Var.e(null, true);
                return;
            }
            if (i7 == nr0Var.s0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131747178, null), nr0Var.H, (nr0Var.t0 == -1 && nr0Var.u0 == -1) ? false : true);
                q8Var.e(null, true);
                return;
            } else if (i7 == nr0Var.t0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131747166, null), nr0Var.L, nr0Var.u0 != -1);
                q8Var.e(null, true);
                return;
            } else {
                if (i7 == nr0Var.u0) {
                    q8Var.f(org.telegram.messenger.hd.M0(2131747164, null), nr0Var.M, false);
                    q8Var.e(null, i10 == 0);
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
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            l8Var.g(-1, org.telegram.ui.ActionBar.j6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i12 = org.telegram.ui.ActionBar.j6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.q6.x(l8Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.q6.x(l8Var, drawable2, org.telegram.ui.ActionBar.j6.k7, null, mode);
            l8Var.p(org.telegram.messenger.hd.M0(z10 ? 2131744068 : 2131754471, null), new org.telegram.ui.Components.fq(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.setFixedSize(0);
        org.telegram.ui.ActionBar.q6.Z(y8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7);
        if (i7 == nr0Var.l0) {
            y8Var.setText(org.telegram.messenger.hd.M0(2131754472, null));
            return;
        }
        if (i7 == nr0Var.x0) {
            y8Var.setFixedSize(12);
            y8Var.setText(null);
            return;
        }
        int i13 = nr0Var.n - nr0Var.E;
        if (i13 <= 0) {
            y8Var.setText(org.telegram.messenger.hd.M0(z10 ? 2131744108 : 2131754469, null));
        } else if (z10) {
            y8Var.setText(org.telegram.messenger.hd.H(',', "TodoNewTaskInfo", i13));
        } else {
            y8Var.setText(org.telegram.messenger.hd.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.hd.G(i13, "Option", new Object[0])));
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        nr0 nr0Var = this.d;
        boolean z10 = nr0Var.d0;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
            } else if (i7 == 2) {
                view = new org.telegram.ui.Cells.y8(context);
            } else if (i7 == 3) {
                View l8Var = new org.telegram.ui.Cells.l8(context);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, l8Var, null);
                view = l8Var;
            } else if (i7 == 4) {
                ir0 ir0Var = new ir0(this, context, z10 ? 1 : 0);
                ir0Var.d();
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, ir0Var, null);
                ir0Var.c(new bi.v(14, this, ir0Var));
                view = ir0Var;
            } else if (i7 == 6) {
                View q8Var = new org.telegram.ui.Cells.q8(context);
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, q8Var, null);
                view = q8Var;
            } else if (i7 != 7) {
                kr0 kr0Var = new kr0(this, context, z10 ? 1 : 0, new g40(nr0Var, 22));
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, kr0Var, null);
                kr0Var.c(new bi.v(16, this, kr0Var));
                kr0Var.setShowNextButton(true);
                EditTextBoldCursor textView = kr0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new ld(3, this, kr0Var));
                textView.setOnKeyListener(new sf(kr0Var, 2));
                view = kr0Var;
            } else {
                jr0 jr0Var = new jr0(this, context, z10 ? 1 : 0);
                jr0Var.d();
                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, jr0Var, null);
                jr0Var.c(new bi.v(15, this, jr0Var));
                view = jr0Var;
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, n4Var, null);
            view = n4Var;
        }
        return i5.c.q(view, view, -1, -2);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        nr0 nr0Var = this.d;
        boolean z10 = nr0Var.e0;
        int i7 = e1Var.f;
        View view = e1Var.a;
        if (i7 == 4) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            z5Var.setTag(1);
            bi.u uVar = z5Var.d;
            CharSequence charSequence = nr0Var.F;
            z5Var.o(charSequence != null ? charSequence : "", org.telegram.messenger.hd.M0(z10 ? 2131744053 : 2131746448, null), false);
            z5Var.setTag(null);
            z5Var.setEnabled(!nr0Var.J);
            uVar.setEnabled(true ^ nr0Var.J);
            org.telegram.ui.ActionBar.q6.V(uVar, org.telegram.ui.ActionBar.q6.K(nr0Var.J ? 0.6f : 1.0f, org.telegram.ui.ActionBar.j6.G6), nr0Var.getResourceProvider());
            nr0.h0(nr0Var, view, e1Var.b());
            return;
        }
        if (i7 != 5) {
            if (i7 == 7) {
                org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
                z5Var2.setTag(1);
                CharSequence charSequence2 = nr0Var.G;
                z5Var2.o(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.hd.M0(2131754474, null), false);
                z5Var2.setTag(null);
                nr0.h0(nr0Var, view, e1Var.b());
                return;
            }
            return;
        }
        int b10 = e1Var.b();
        org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
        z5Var3.setTag(1);
        bi.u uVar2 = z5Var3.d;
        int i10 = b10 - nr0Var.o0;
        boolean z11 = !nr0Var.J || i10 >= nr0Var.y;
        uVar2.setEnabled(z11);
        org.telegram.ui.ActionBar.q6.V(uVar2, org.telegram.ui.ActionBar.q6.K(z11 ? 1.0f : 0.6f, org.telegram.ui.ActionBar.j6.G6), nr0Var.getResourceProvider());
        z5Var3.o(nr0Var.w[i10], org.telegram.messenger.hd.M0(z10 ? 2131744055 : 2131747774, null), true);
        z5Var3.setTag(null);
        ImageView imageView = z5Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = z5Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!nr0Var.g0 && nr0Var.h0 == b10) {
            EditTextBoldCursor textView = z5Var3.getTextView();
            textView.requestFocus();
            org.telegram.messenger.g0.J3(textView);
            nr0Var.g0 = false;
            nr0Var.h0 = -1;
        }
        nr0.h0(nr0Var, view, b10);
    }

    @Override // v4.h0
    public final void z(v4.e1 e1Var) {
        int i7 = e1Var.f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) e1Var.a).getTextView();
            if (textView.isFocused()) {
                nr0 nr0Var = this.d;
                if (nr0Var.d0) {
                    org.telegram.ui.Components.rw0 rw0Var = nr0Var.R;
                    if (rw0Var != null) {
                        rw0Var.f();
                    }
                    nr0Var.p0(true);
                }
                nr0Var.c0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}
