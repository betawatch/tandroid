package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l2 implements pb0, org.telegram.ui.ActionBar.q1, org.telegram.ui.ActionBar.q6, org.telegram.ui.ActionBar.r6, a5, org.telegram.messenger.jc, org.telegram.messenger.cb, org.telegram.messenger.i9, p.a, ih.b, vt0, wt0 {
    public final /* synthetic */ int a;

    public /* synthetic */ l2(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
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
    public gc a(lc lcVar) {
        return lcVar.k(false);
    }

    @Override // ih.b
    public Object b(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.wt0
    public void c(Object obj, float f10) {
        yb0 yb0Var = (yb0) obj;
        switch (this.a) {
            case 26:
                yb0Var.f = f10;
                if (!yb0Var.E || yb0Var.G) {
                    yb0Var.c.setStrokeWidth(org.telegram.messenger.g0.T1(yb0Var.w, yb0Var.x, f10));
                    yb0Var.f();
                }
                yb0Var.invalidate();
                break;
            default:
                yb0Var.n = f10;
                if (!yb0Var.E || yb0Var.G) {
                    yb0Var.f();
                }
                yb0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r6
    public void d(int i7, View view) {
        ((org.telegram.ui.ActionBar.y0) view).d(i7, i7);
    }

    @Override // org.telegram.ui.ActionBar.q6
    public int f(View view) {
        org.telegram.ui.ActionBar.y0 y0Var = (org.telegram.ui.ActionBar.y0) view;
        if (y0Var.getTextView() != null) {
            return y0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.vt0
    public float get(Object obj) {
        yb0 yb0Var = (yb0) obj;
        switch (this.a) {
            case 25:
                return yb0Var.f;
            case 26:
            default:
                return yb0Var.s;
            case 27:
                return yb0Var.n;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                t1Var.dismiss();
                break;
            case 5:
                Pattern pattern = c5.a;
                break;
            default:
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pb0
    public String i(int i7) {
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

    @Override // org.telegram.messenger.i9
    public Object m(Object obj) {
        switch (this.a) {
            case 21:
                return CheckBoxBase.I;
            default:
                int i7 = ty.V2;
                return 0;
        }
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable t6 = imageReceiver.t();
        if (t6 instanceof oh0) {
            oh0 oh0Var = (oh0) t6;
            oh0Var.P(0);
            oh0Var.stop();
            oh0Var.T(false, 0.0f);
        }
    }

    @Override // org.telegram.messenger.cb
    public void onClick() {
        int i7 = ml.G0;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
