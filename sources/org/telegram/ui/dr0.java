package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dr0 extends org.telegram.ui.Components.sj0 {
    public final Context c;
    public final /* synthetic */ fr0 d;

    public dr0(fr0 fr0Var, Context context) {
        this.d = fr0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3;
        int b10 = d1Var.b();
        fr0 fr0Var = this.d;
        if (b10 == fr0Var.j0 || b10 == fr0Var.v0 || b10 == fr0Var.w0) {
            return !fr0Var.J;
        }
        if (!fr0Var.J || b10 < (i3 = fr0Var.o0) || b10 >= fr0Var.E + i3) {
            if (b10 != fr0Var.p0 && b10 != fr0Var.s0 && b10 != fr0Var.t0 && (fr0Var.O != 0 || b10 != fr0Var.u0)) {
                return false;
            }
        } else if (b10 - i3 < fr0Var.y) {
            return false;
        }
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return this.d.y0;
    }

    @Override // u4.h0
    public final int d(int i3) {
        fr0 fr0Var = this.d;
        if (i3 == fr0Var.i0 || i3 == fr0Var.n0 || i3 == fr0Var.r0) {
            return 0;
        }
        if (i3 == fr0Var.m0) {
            return 1;
        }
        if (i3 == fr0Var.q0 || i3 == fr0Var.x0 || i3 == fr0Var.l0) {
            return 2;
        }
        if (i3 == fr0Var.p0) {
            return 3;
        }
        if (i3 == fr0Var.j0) {
            return 4;
        }
        if (i3 == fr0Var.k0) {
            return 7;
        }
        return (i3 == fr0Var.s0 || i3 == fr0Var.t0 || i3 == fr0Var.u0 || i3 == fr0Var.v0 || i3 == fr0Var.w0) ? 6 : 5;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        fr0 fr0Var = this.d;
        int i10 = fr0Var.O;
        boolean z10 = fr0Var.e0;
        int i11 = d1Var.f;
        View view = d1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            if (i3 == fr0Var.i0) {
                n4Var.setText(org.telegram.messenger.bd.M0(z10 ? fr0Var.A0 != null ? 2131744084 : 2131744064 : 2131747173, null));
                return;
            }
            if (i3 != fr0Var.n0) {
                if (i3 == fr0Var.r0) {
                    n4Var.setText(org.telegram.messenger.bd.M0(2131745505, null));
                    return;
                }
                return;
            } else if (i10 == 1) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746455, null));
                return;
            } else {
                n4Var.setText(org.telegram.messenger.bd.M0(z10 ? 2131744082 : 2131754246, null));
                return;
            }
        }
        if (i11 == 6) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.setEnabled(!fr0Var.J);
            q8Var.getCheckBox().setAlpha(!fr0Var.J ? 1.0f : 0.6f);
            if (i3 == fr0Var.v0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131744103, null), fr0Var.I, true);
                q8Var.e(null, true);
                return;
            }
            if (i3 == fr0Var.w0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131744102, null), fr0Var.K, false);
                q8Var.e(null, true);
                return;
            }
            if (i3 == fr0Var.s0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131747186, null), fr0Var.H, (fr0Var.t0 == -1 && fr0Var.u0 == -1) ? false : true);
                q8Var.e(null, true);
                return;
            } else if (i3 == fr0Var.t0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131747174, null), fr0Var.L, fr0Var.u0 != -1);
                q8Var.e(null, true);
                return;
            } else {
                if (i3 == fr0Var.u0) {
                    q8Var.f(org.telegram.messenger.bd.M0(2131747172, null), fr0Var.M, false);
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
            l8Var.g(-1, org.telegram.ui.ActionBar.k6.q6);
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int i12 = org.telegram.ui.ActionBar.k6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.y(l8Var, drawable, i12, null, mode);
            org.telegram.ui.ActionBar.r6.y(l8Var, drawable2, org.telegram.ui.ActionBar.k6.k7, null, mode);
            l8Var.p(org.telegram.messenger.bd.M0(z10 ? 2131744078 : 2131754471, null), new org.telegram.ui.Components.xp(drawable, drawable2), false);
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        y8Var.setFixedSize(0);
        org.telegram.ui.ActionBar.r6.a0(y8Var, context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.b7);
        if (i3 == fr0Var.l0) {
            y8Var.setText(org.telegram.messenger.bd.M0(2131754472, null));
            return;
        }
        if (i3 == fr0Var.x0) {
            y8Var.setFixedSize(12);
            y8Var.setText(null);
            return;
        }
        int i13 = fr0Var.n - fr0Var.E;
        if (i13 <= 0) {
            y8Var.setText(org.telegram.messenger.bd.M0(z10 ? 2131744118 : 2131754469, null));
        } else if (z10) {
            y8Var.setText(org.telegram.messenger.bd.H(',', "TodoNewTaskInfo", i13));
        } else {
            y8Var.setText(org.telegram.messenger.bd.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.bd.G(i13, "Option", new Object[0])));
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        fr0 fr0Var = this.d;
        boolean z10 = fr0Var.d0;
        if (i3 != 0) {
            Context context = this.c;
            if (i3 == 1) {
                view = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
            } else if (i3 == 2) {
                view = new org.telegram.ui.Cells.y8(context);
            } else if (i3 == 3) {
                View l8Var = new org.telegram.ui.Cells.l8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l8Var, null);
                view = l8Var;
            } else if (i3 == 4) {
                ar0 ar0Var = new ar0(this, context, z10 ? 1 : 0);
                ar0Var.c();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, ar0Var, null);
                ar0Var.b(new ai.a0(14, this, ar0Var));
                view = ar0Var;
            } else if (i3 == 6) {
                View q8Var = new org.telegram.ui.Cells.q8(context);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, q8Var, null);
                view = q8Var;
            } else if (i3 != 7) {
                cr0 cr0Var = new cr0(this, context, z10 ? 1 : 0, new b40(fr0Var, 22));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, cr0Var, null);
                cr0Var.b(new ai.a0(16, this, cr0Var));
                cr0Var.setShowNextButton(true);
                EditTextBoldCursor textView = cr0Var.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new ld(3, this, cr0Var));
                textView.setOnKeyListener(new vf(cr0Var, 2));
                view = cr0Var;
            } else {
                br0 br0Var = new br0(this, context, z10 ? 1 : 0);
                br0Var.c();
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, br0Var, null);
                br0Var.b(new ai.a0(15, this, br0Var));
                view = br0Var;
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, n4Var, null);
            view = n4Var;
        }
        return k2.p1.p(view, view, -1, -2);
    }

    @Override // u4.h0
    public final void y(u4.d1 d1Var) {
        fr0 fr0Var = this.d;
        boolean z10 = fr0Var.e0;
        int i3 = d1Var.f;
        View view = d1Var.a;
        if (i3 == 4) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            z5Var.setTag(1);
            ai.z zVar = z5Var.d;
            CharSequence charSequence = fr0Var.F;
            z5Var.n(charSequence != null ? charSequence : "", org.telegram.messenger.bd.M0(z10 ? 2131744063 : 2131746456, null), false);
            z5Var.setTag(null);
            z5Var.setEnabled(!fr0Var.J);
            zVar.setEnabled(true ^ fr0Var.J);
            org.telegram.ui.ActionBar.r6.W(zVar, org.telegram.ui.ActionBar.r6.L(fr0Var.J ? 0.6f : 1.0f, org.telegram.ui.ActionBar.k6.G6), fr0Var.getResourceProvider());
            fr0.h0(fr0Var, view, d1Var.b());
            return;
        }
        if (i3 != 5) {
            if (i3 == 7) {
                org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
                z5Var2.setTag(1);
                CharSequence charSequence2 = fr0Var.G;
                z5Var2.n(charSequence2 != null ? charSequence2 : "", org.telegram.messenger.bd.M0(2131754474, null), false);
                z5Var2.setTag(null);
                fr0.h0(fr0Var, view, d1Var.b());
                return;
            }
            return;
        }
        int b10 = d1Var.b();
        org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
        z5Var3.setTag(1);
        ai.z zVar2 = z5Var3.d;
        int i10 = b10 - fr0Var.o0;
        boolean z11 = !fr0Var.J || i10 >= fr0Var.y;
        zVar2.setEnabled(z11);
        org.telegram.ui.ActionBar.r6.W(zVar2, org.telegram.ui.ActionBar.r6.L(z11 ? 1.0f : 0.6f, org.telegram.ui.ActionBar.k6.G6), fr0Var.getResourceProvider());
        z5Var3.n(fr0Var.w[i10], org.telegram.messenger.bd.M0(z10 ? 2131744065 : 2131747782, null), true);
        z5Var3.setTag(null);
        ImageView imageView = z5Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
        ImageView imageView2 = z5Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z11 ? 1.0f : 0.45f);
        }
        if (!fr0Var.g0 && fr0Var.h0 == b10) {
            EditTextBoldCursor textView = z5Var3.getTextView();
            textView.requestFocus();
            org.telegram.messenger.g0.K3(textView);
            fr0Var.g0 = false;
            fr0Var.h0 = -1;
        }
        fr0.h0(fr0Var, view, b10);
    }

    @Override // u4.h0
    public final void z(u4.d1 d1Var) {
        int i3 = d1Var.f;
        if (i3 == 4 || i3 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) d1Var.a).getTextView();
            if (textView.isFocused()) {
                fr0 fr0Var = this.d;
                if (fr0Var.d0) {
                    org.telegram.ui.Components.ow0 ow0Var = fr0Var.R;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    fr0Var.p0(true);
                }
                fr0Var.c0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}
