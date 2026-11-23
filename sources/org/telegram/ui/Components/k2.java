package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements mb0, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6, z4, org.telegram.messenger.jc, org.telegram.messenger.cb, org.telegram.messenger.i9, p.a, ih.b, ut0, vt0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k2(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 16:
                MediaController.B().B0(1, i7, z10, false);
                break;
            default:
                MediaController.B().B0(1, i7, z10, false);
                break;
        }
    }

    @Override // p.a
    public fc a(kc kcVar) {
        return kcVar.k(false);
    }

    @Override // ih.b
    public Object b(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.vt0
    public void d(Object obj, float f10) {
        vb0 vb0Var = (vb0) obj;
        switch (this.a) {
            case 26:
                vb0Var.f = f10;
                if (!vb0Var.E || vb0Var.G) {
                    vb0Var.c.setStrokeWidth(org.telegram.messenger.g0.T1(vb0Var.w, vb0Var.x, f10));
                    vb0Var.f();
                }
                vb0Var.invalidate();
                break;
            default:
                vb0Var.n = f10;
                if (!vb0Var.E || vb0Var.G) {
                    vb0Var.f();
                }
                vb0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.mb0
    public String e(int i7) {
        switch (this.a) {
            case 2:
                boolean z10 = org.telegram.messenger.gd.c0;
                String format = String.format("%02d", Integer.valueOf((i7 % 12 != 0 || z10) ? i7 % (z10 ? 24 : 12) : 12));
                if (i7 >= 24) {
                    break;
                }
                break;
            case 4:
                if (i7 != 0) {
                    if (i7 >= 1 && i7 < 16) {
                        break;
                    } else if (i7 != 16) {
                        if (i7 != 17) {
                            if (i7 != 18) {
                                if (i7 != 19) {
                                    if (i7 == 20) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
            case 7:
                switch (i7) {
                }
            case 9:
                switch (i7) {
                }
        }
        return String.format("%02d", Integer.valueOf(i7));
    }

    @Override // org.telegram.ui.ActionBar.s6
    public void g(int i7, View view) {
        ((org.telegram.ui.ActionBar.y0) view).d(i7, i7);
    }

    @Override // org.telegram.ui.Components.ut0
    public float get(Object obj) {
        vb0 vb0Var = (vb0) obj;
        switch (this.a) {
            case 25:
                return vb0Var.f;
            case 26:
            default:
                return vb0Var.s;
            case 27:
                return vb0Var.n;
        }
    }

    @Override // org.telegram.messenger.i9
    public Object h(Object obj) {
        switch (this.a) {
            case 21:
                return CheckBoxBase.I;
            default:
                int i7 = qy.V2;
                return 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                t1Var.dismiss();
                break;
            case 5:
                Pattern pattern = b5.a;
                break;
            default:
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r6
    public int k(View view) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) view;
        if (y0Var.getTextView() != null) {
            return y0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // org.telegram.messenger.cb
    public void onClick() {
        int i7 = kl.G0;
    }

    @Override // org.telegram.messenger.jc
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable t6 = imageReceiver.t();
        if (t6 instanceof nh0) {
            nh0 nh0Var = (nh0) t6;
            nh0Var.P(0);
            nh0Var.stop();
            nh0Var.T(false, 0.0f);
        }
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void r(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void J(int i7, Drawable drawable) {
    }
}
