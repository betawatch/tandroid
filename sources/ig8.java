// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ig8 extends q59 {
    public final Context c;
    public final /* synthetic */ kg8 d;

    public ig8(kg8 kg8Var, Context context) {
        this.d = kg8Var;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i;
        int b = u69Var.b();
        kg8 kg8Var = this.d;
        if (b == kg8Var.j0 || b == kg8Var.v0 || b == kg8Var.w0) {
            return !kg8Var.J;
        }
        if (!kg8Var.J || b < (i = kg8Var.o0) || b >= kg8Var.E + i) {
            if (b != kg8Var.p0 && b != kg8Var.s0 && b != kg8Var.t0 && (kg8Var.O != 0 || b != kg8Var.u0)) {
                return false;
            }
        } else if (b - i < kg8Var.y) {
            return false;
        }
        return true;
    }

    @Override // y59
    public final int b() {
        return this.d.y0;
    }

    @Override // y59
    public final int d(int i) {
        kg8 kg8Var = this.d;
        if (i == kg8Var.i0 || i == kg8Var.n0 || i == kg8Var.r0) {
            return 0;
        }
        if (i == kg8Var.m0) {
            return 1;
        }
        if (i == kg8Var.q0 || i == kg8Var.x0 || i == kg8Var.l0) {
            return 2;
        }
        if (i == kg8Var.p0) {
            return 3;
        }
        if (i == kg8Var.j0) {
            return 4;
        }
        if (i == kg8Var.k0) {
            return 7;
        }
        return (i == kg8Var.s0 || i == kg8Var.t0 || i == kg8Var.u0 || i == kg8Var.v0 || i == kg8Var.w0) ? 6 : 5;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        kg8 kg8Var = this.d;
        byte b = kg8Var.O;
        boolean z = kg8Var.e0;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            jf5 jf5Var = (jf5) view;
            if (i == kg8Var.i0) {
                jf5Var.setText(jb6.M0(z ? kg8Var.A0 != null ? 2131743759 : 2131743739 : 2131746898, null));
                return;
            }
            if (i != kg8Var.n0) {
                if (i == kg8Var.r0) {
                    jf5Var.setText(jb6.M0(2131745229, null));
                    return;
                }
                return;
            } else if (b == 1) {
                jf5Var.setText(jb6.M0(2131746180, null));
                return;
            } else {
                jf5Var.setText(jb6.M0(z ? 2131743757 : 2131754211, null));
                return;
            }
        }
        if (i2 == 6) {
            bjb bjbVar = (bjb) view;
            bjbVar.setEnabled(!kg8Var.J);
            bjbVar.getCheckBox().setAlpha(!kg8Var.J ? 1.0f : 0.6f);
            if (i == kg8Var.v0) {
                bjbVar.f(jb6.M0(2131743778, null), kg8Var.I, true);
                bjbVar.e(null, true);
                return;
            }
            if (i == kg8Var.w0) {
                bjbVar.f(jb6.M0(2131743777, null), kg8Var.K, false);
                bjbVar.e(null, true);
                return;
            }
            if (i == kg8Var.s0) {
                bjbVar.f(jb6.M0(2131746911, null), kg8Var.H, (kg8Var.t0 == -1 && kg8Var.u0 == -1) ? false : true);
                bjbVar.e(null, true);
                return;
            } else if (i == kg8Var.t0) {
                bjbVar.f(jb6.M0(2131746899, null), kg8Var.L, kg8Var.u0 != -1);
                bjbVar.e(null, true);
                return;
            } else {
                if (i == kg8Var.u0) {
                    bjbVar.f(jb6.M0(2131746897, null), kg8Var.M, false);
                    bjbVar.e(null, b == 0);
                    return;
                }
                return;
            }
        }
        Context context = this.c;
        if (i2 != 2) {
            if (i2 == 3) {
                xib xibVar = (xib) view;
                xibVar.g(-1, cmb.p6);
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int i3 = cmb.M6;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                anb.x(xibVar, drawable, i3, null, mode);
                anb.x(xibVar, drawable2, cmb.j7, null, mode);
                xibVar.p(jb6.M0(z ? 2131743753 : 2131754468, null), new sn2(drawable, drawable2), false);
                return;
            }
            return;
        }
        njb njbVar = (njb) view;
        njbVar.setFixedSize(0);
        anb.Z(njbVar, context, R.drawable.greydivider_bottom, cmb.a7);
        if (i == kg8Var.l0) {
            njbVar.setText(jb6.M0(2131754469, null));
            return;
        }
        if (i == kg8Var.x0) {
            njbVar.setFixedSize(12);
            njbVar.setText(null);
            return;
        }
        int i4 = kg8Var.n - kg8Var.E;
        if (i4 <= 0) {
            njbVar.setText(jb6.M0(z ? 2131743793 : 2131754466, null));
        } else if (z) {
            njbVar.setText(jb6.H(',', "TodoNewTaskInfo", i4));
        } else {
            njbVar.setText(jb6.a0("AddAnOptionInfo", null, 2131754467, jb6.G(i4, "Option", new Object[0])));
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        kg8 kg8Var = this.d;
        boolean z = kg8Var.d0;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                view = new bba(context, (hg9) null);
            } else if (i != 2) {
                byte b = 3;
                if (i != 3) {
                    byte b2 = 7;
                    if (i == 4) {
                        fg8 fg8Var = new fg8(this, context, z ? 1 : 0);
                        fg8Var.e();
                        anb.h(cmb.c6, null, fg8Var);
                        fg8Var.c(new qz(this, fg8Var, b2));
                        view = fg8Var;
                    } else if (i == 6) {
                        View bjbVar = new bjb(context);
                        anb.h(cmb.c6, null, bjbVar);
                        view = bjbVar;
                    } else if (i != 7) {
                        hg8 hg8Var = new hg8(this, context, z ? 1 : 0, new m67(kg8Var, (byte) 22));
                        anb.h(cmb.c6, null, hg8Var);
                        hg8Var.c(new qz(this, hg8Var, (byte) 9));
                        hg8Var.setShowNextButton(true);
                        EditTextBoldCursor textView = hg8Var.getTextView();
                        textView.setImeOptions(textView.getImeOptions() | 5);
                        textView.setOnEditorActionListener(new eg(this, hg8Var, b));
                        textView.setOnKeyListener(new w6(hg8Var, (byte) 5));
                        view = hg8Var;
                    } else {
                        gg8 gg8Var = new gg8(this, context, z ? 1 : 0);
                        gg8Var.e();
                        anb.h(cmb.c6, null, gg8Var);
                        gg8Var.c(new qz(this, gg8Var, (byte) 8));
                        view = gg8Var;
                    }
                } else {
                    View xibVar = new xib(context);
                    anb.h(cmb.c6, null, xibVar);
                    view = xibVar;
                }
            } else {
                view = new njb(context);
            }
        } else {
            View jf5Var = new jf5(this.c, cmb.K6, 21, 15, false, null);
            anb.h(cmb.c6, null, jf5Var);
            view = jf5Var;
        }
        return kt6.h(view, view, -1, -2);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        kg8 kg8Var = this.d;
        boolean z = kg8Var.e0;
        int i = u69Var.f;
        View view = u69Var.a;
        if (i == 4) {
            ng8 ng8Var = (ng8) view;
            ng8Var.setTag(1);
            pz pzVar = ng8Var.d;
            CharSequence charSequence = kg8Var.F;
            ng8Var.o(charSequence != null ? charSequence : "", jb6.M0(z ? 2131743738 : 2131746181, null), false);
            ng8Var.setTag(null);
            ng8Var.setEnabled(!kg8Var.J);
            pzVar.setEnabled(!kg8Var.J);
            anb.Y(pzVar, anb.K(kg8Var.J ? 0.6f : 1.0f, cmb.F6), kg8Var.getResourceProvider());
            kg8Var.t0(u69Var.b(), view);
            return;
        }
        if (i != 5) {
            if (i == 7) {
                ng8 ng8Var2 = (ng8) view;
                ng8Var2.setTag(1);
                CharSequence charSequence2 = kg8Var.G;
                ng8Var2.o(charSequence2 != null ? charSequence2 : "", jb6.M0(2131754471, null), false);
                ng8Var2.setTag(null);
                kg8Var.t0(u69Var.b(), view);
                return;
            }
            return;
        }
        int b = u69Var.b();
        ng8 ng8Var3 = (ng8) view;
        ng8Var3.setTag(1);
        pz pzVar2 = ng8Var3.d;
        int i2 = b - kg8Var.o0;
        boolean z2 = !kg8Var.J || i2 >= kg8Var.y;
        pzVar2.setEnabled(z2);
        anb.Y(pzVar2, anb.K(z2 ? 1.0f : 0.6f, cmb.F6), kg8Var.getResourceProvider());
        ng8Var3.o(kg8Var.w[i2], jb6.M0(z ? 2131743740 : 2131747507, null), true);
        ng8Var3.setTag(null);
        ImageView imageView = ng8Var3.f;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
        ImageView imageView2 = ng8Var3.h;
        if (imageView2 != null) {
            imageView2.setAlpha(z2 ? 1.0f : 0.45f);
        }
        if (!kg8Var.g0 && kg8Var.h0 == b) {
            EditTextBoldCursor textView = ng8Var3.getTextView();
            textView.requestFocus();
            gm.E3(textView);
            kg8Var.g0 = false;
            kg8Var.h0 = -1;
        }
        kg8Var.t0(b, view);
    }

    @Override // y59
    public final void z(u69 u69Var) {
        int i = u69Var.f;
        if (i == 4 || i == 5) {
            EditTextBoldCursor textView = ((ng8) u69Var.a).getTextView();
            if (textView.isFocused()) {
                kg8 kg8Var = this.d;
                if (kg8Var.d0) {
                    fdb fdbVar = kg8Var.R;
                    if (fdbVar != null) {
                        fdbVar.e();
                    }
                    kg8Var.m0(true);
                }
                kg8Var.c0 = null;
                textView.clearFocus();
                gm.t1(textView);
            }
        }
    }
}
