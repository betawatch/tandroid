package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k2 implements ob0, org.telegram.ui.ActionBar.r1, org.telegram.ui.ActionBar.r6, org.telegram.ui.ActionBar.s6, z4, org.telegram.messenger.jc, org.telegram.messenger.cb, org.telegram.messenger.i9, p.a, ih.b, st0, tt0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k2(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.z4
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

    @Override // org.telegram.ui.Components.tt0
    public void c(Object obj, float f10) {
        xb0 xb0Var = (xb0) obj;
        switch (this.a) {
            case 26:
                xb0Var.f = f10;
                if (!xb0Var.E || xb0Var.G) {
                    xb0Var.c.setStrokeWidth(org.telegram.messenger.g0.T1(xb0Var.w, xb0Var.x, f10));
                    xb0Var.f();
                }
                xb0Var.invalidate();
                break;
            default:
                xb0Var.n = f10;
                if (!xb0Var.E || xb0Var.G) {
                    xb0Var.f();
                }
                xb0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.s6
    public void d(int i7, View view) {
        ((org.telegram.ui.ActionBar.z0) view).d(i7, i7);
    }

    @Override // org.telegram.ui.ActionBar.r6
    public int f(View view) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) view;
        if (z0Var.getTextView() != null) {
            return z0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.st0
    public float get(Object obj) {
        xb0 xb0Var = (xb0) obj;
        switch (this.a) {
            case 25:
                return xb0Var.f;
            case 26:
            default:
                return xb0Var.s;
            case 27:
                return xb0Var.n;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                u1Var.dismiss();
                break;
            case 5:
                Pattern pattern = b5.a;
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ob0
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
                int i7 = ry.V2;
                return 0;
        }
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable t6 = imageReceiver.t();
        if (t6 instanceof mh0) {
            mh0 mh0Var = (mh0) t6;
            mh0Var.P(0);
            mh0Var.stop();
            mh0Var.T(false, 0.0f);
        }
    }

    @Override // org.telegram.messenger.cb
    public void onClick() {
        int i7 = kl.G0;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
    }
}
