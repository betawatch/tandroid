// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ge8 extends n39 {
    public final Context c;
    public final /* synthetic */ ie8 d;

    public ge8(ie8 ie8Var, Context context) {
        this.d = ie8Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i;
        int b = s49Var.b();
        ie8 ie8Var = this.d;
        if (b == ie8Var.j0 || b == ie8Var.v0 || b == ie8Var.w0) {
            return !ie8Var.J;
        }
        if (!ie8Var.J || b < (i = ie8Var.o0) || b >= ie8Var.E + i) {
            if (b != ie8Var.p0 && b != ie8Var.s0 && b != ie8Var.t0 && (ie8Var.O != 0 || b != ie8Var.u0)) {
                return false;
            }
        } else if (b - i < ie8Var.y) {
            return false;
        }
        return true;
    }

    @Override // w39
    public final int b() {
        return this.d.y0;
    }

    @Override // w39
    public final int d(int i) {
        ie8 ie8Var = this.d;
        if (i == ie8Var.i0 || i == ie8Var.n0 || i == ie8Var.r0) {
            return 0;
        }
        if (i == ie8Var.m0) {
            return 1;
        }
        if (i == ie8Var.q0 || i == ie8Var.x0 || i == ie8Var.l0) {
            return 2;
        }
        if (i == ie8Var.p0) {
            return 3;
        }
        if (i == ie8Var.j0) {
            return 4;
        }
        if (i == ie8Var.k0) {
            return 7;
        }
        return (i == ie8Var.s0 || i == ie8Var.t0 || i == ie8Var.u0 || i == ie8Var.v0 || i == ie8Var.w0) ? 6 : 5;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        ie8 ie8Var = this.d;
        byte b = ie8Var.O;
        boolean z = ie8Var.e0;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            ld5 ld5Var = (ld5) view;
            if (i == ie8Var.i0) {
                ld5Var.setText(k96.M0(z ? ie8Var.A0 != null ? 2131743833 : 2131743813 : 2131746972, null));
                return;
            }
            if (i != ie8Var.n0) {
                if (i == ie8Var.r0) {
                    ld5Var.setText(k96.M0(2131745303, null));
                    return;
                }
                return;
            } else if (b == 1) {
                ld5Var.setText(k96.M0(2131746254, null));
                return;
            } else {
                ld5Var.setText(k96.M0(z ? 2131743831 : 2131754243, null));
                return;
            }
        }
        if (i2 == 6) {
            ahb ahbVar = (ahb) view;
            ahbVar.setEnabled(!ie8Var.J);
            ahbVar.getCheckBox().setAlpha(!ie8Var.J ? 1.0f : 0.6f);
            if (i == ie8Var.v0) {
                ahbVar.f(k96.M0(2131743852, null), ie8Var.I, true);
                ahbVar.e(null, true);
                return;
            }
            if (i == ie8Var.w0) {
                ahbVar.f(k96.M0(2131743851, null), ie8Var.K, false);
                ahbVar.e(null, true);
                return;
            }
            if (i == ie8Var.s0) {
                ahbVar.f(k96.M0(2131746985, null), ie8Var.H, (ie8Var.t0 == -1 && ie8Var.u0 == -1) ? false : true);
                ahbVar.e(null, true);
                return;
            } else if (i == ie8Var.t0) {
                ahbVar.f(k96.M0(2131746973, null), ie8Var.L, ie8Var.u0 != -1);
                ahbVar.e(null, true);
                return;
            } else {
                if (i == ie8Var.u0) {
                    ahbVar.f(k96.M0(2131746971, null), ie8Var.M, false);
                    ahbVar.e(null, b == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i2 != 2) {
            if (i2 == 3) {
                wgb wgbVar = (wgb) view;
                wgbVar.g(-1, bkb.p6);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int i3 = bkb.M6;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                zkb.x(wgbVar, drawable, i3, null, mode);
                zkb.x(wgbVar, drawable2, bkb.j7, null, mode);
                wgbVar.p(k96.M0(z ? 2131743827 : 2131754468, null), new fm2(drawable, drawable2), false);
                return;
            }
            return;
        }
        mhb mhbVar = (mhb) view;
        mhbVar.setFixedSize(0);
        zkb.Z(mhbVar, context, R.drawable.greydivider_bottom, bkb.a7);
        if (i == ie8Var.l0) {
            mhbVar.setText(k96.M0(2131754469, null));
            return;
        }
        if (i == ie8Var.x0) {
            mhbVar.setFixedSize(12);
            mhbVar.setText(null);
            return;
        }
        int i4 = ie8Var.n - ie8Var.E;
        if (i4 <= 0) {
            mhbVar.setText(k96.M0(z ? 2131743867 : 2131754466, null));
        } else if (z) {
            mhbVar.setText(k96.H(',', "TodoNewTaskInfo", i4));
        } else {
            mhbVar.setText(k96.a0("AddAnOptionInfo", null, 2131754467, k96.G(i4, "Option", new Object[0])));
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        ie8 ie8Var = this.d;
        boolean z = ie8Var.d0;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                view = new b9a(context, (de9) null);
            } else if (i != 2) {
                byte b = 3;
                if (i != 3) {
                    byte b2 = 7;
                    if (i == 4) {
                        de8 de8Var = new de8(this, context, z ? 1 : 0);
                        de8Var.e();
                        zkb.h(bkb.c6, null, de8Var);
                        de8Var.c(new qy(this, de8Var, b2));
                        view = de8Var;
                    } else if (i == 6) {
                        View ahbVar = new ahb(context);
                        zkb.h(bkb.c6, null, ahbVar);
                        view = ahbVar;
                    } else if (i != 7) {
                        fe8 fe8Var = new fe8(this, context, z ? 1 : 0, new fr7(ie8Var, (byte) 19));
                        zkb.h(bkb.c6, null, fe8Var);
                        fe8Var.c(new qy(this, fe8Var, (byte) 9));
                        fe8Var.setShowNextButton(true);
                        EditTextBoldCursor textView = fe8Var.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new df(this, fe8Var, b));
                        textView.setOnKeyListener(new w6(fe8Var, (byte) 5));
                        view = fe8Var;
                    } else {
                        ee8 ee8Var = new ee8(this, context, z ? 1 : 0);
                        ee8Var.e();
                        zkb.h(bkb.c6, null, ee8Var);
                        ee8Var.c(new qy(this, ee8Var, (byte) 8));
                        view = ee8Var;
                    }
                } else {
                    View wgbVar = new wgb(context);
                    zkb.h(bkb.c6, null, wgbVar);
                    view = wgbVar;
                }
            } else {
                view = new mhb(context);
            }
        } else {
            View ld5Var = new ld5(this.c, bkb.K6, 21, 15, false, null);
            zkb.h(bkb.c6, null, ld5Var);
            view = ld5Var;
        }
        return ls6.h(view, view, -1, -2);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        ie8 ie8Var = this.d;
        boolean z = ie8Var.e0;
        int i = s49Var.f;
        View view = s49Var.a;
        if (i == 4) {
            le8 le8Var = (le8) view;
            le8Var.setTag(1);
            py pyVar = le8Var.d;
            CharSequence charSequence = ie8Var.F;
            le8Var.o(charSequence != null ? charSequence : "", k96.M0(z ? 2131743812 : 2131746255, null), false);
            le8Var.setTag(null);
            le8Var.setEnabled(!ie8Var.J);
            pyVar.setEnabled(!ie8Var.J);
            zkb.Y(pyVar, zkb.K(ie8Var.J ? 0.6f : 1.0f, bkb.F6), ie8Var.getResourceProvider());
            ie8Var.s0(s49Var.b(), view);
            return;
        }
        if (i != 5) {
            if (i == 7) {
                le8 le8Var2 = (le8) view;
                le8Var2.setTag(1);
                CharSequence charSequence2 = ie8Var.G;
                le8Var2.o(charSequence2 != null ? charSequence2 : "", k96.M0(2131754471, null), false);
                le8Var2.setTag(null);
                ie8Var.s0(s49Var.b(), view);
                return;
            }
            return;
        }
        int b = s49Var.b();
        le8 le8Var3 = (le8) view;
        le8Var3.setTag(1);
        py pyVar2 = le8Var3.d;
        int i2 = b - ie8Var.o0;
        boolean z2 = !ie8Var.J || i2 >= ie8Var.y;
        pyVar2.setEnabled(z2);
        zkb.Y(pyVar2, zkb.K(z2 ? 1.0f : 0.6f, bkb.F6), ie8Var.getResourceProvider());
        le8Var3.o(ie8Var.w[i2], k96.M0(z ? 2131743814 : 2131747581, null), true);
        le8Var3.setTag(null);
        ImageView imageView = le8Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
        ImageView imageView2 = le8Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z2 ? 1.0f : 0.45f);
        }
        if (!ie8Var.g0 && ie8Var.h0 == b) {
            EditTextBoldCursor textView = le8Var3.getTextView();
            textView.requestFocus();
            gl.E3(textView);
            ie8Var.g0 = false;
            ie8Var.h0 = -1;
        }
        ie8Var.s0(b, view);
    }

    @Override // w39
    public final void z(s49 s49Var) {
        int i = s49Var.f;
        if (i == 4 || i == 5) {
            EditTextBoldCursor textView = ((le8) s49Var.a).getTextView();
            if (textView.isFocused()) {
                ie8 ie8Var = this.d;
                if (ie8Var.d0) {
                    dbb dbbVar = ie8Var.R;
                    if (dbbVar != null) {
                        dbbVar.e();
                    }
                    ie8Var.l0(true);
                }
                ie8Var.c0 = null;
                textView.clearFocus();
                gl.t1(textView);
            }
        }
    }
}
