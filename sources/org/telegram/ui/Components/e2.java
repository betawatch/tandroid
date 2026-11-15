package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements org.telegram.ui.ActionBar.q1, eb0, org.telegram.ui.ActionBar.n6, org.telegram.ui.ActionBar.o6, r4, org.telegram.messenger.kc, org.telegram.messenger.db, org.telegram.messenger.j9, p.a, ih.b, kt0, lt0 {
    public final /* synthetic */ int a;

    public /* synthetic */ e2(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.messenger.kc
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        Drawable t6 = imageReceiver.t();
        if (t6 instanceof ch0) {
            ch0 ch0Var = (ch0) t6;
            ch0Var.P(0);
            ch0Var.stop();
            ch0Var.T(false, 0.0f);
        }
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        switch (this.a) {
            case 15:
                MediaController.B().B0(1, i7, z10, false);
                break;
            default:
                MediaController.B().B0(1, i7, z10, false);
                break;
        }
    }

    @Override // p.a
    public xb a(cc ccVar) {
        return ccVar.k(false);
    }

    @Override // ih.b
    public Object b(Bitmap bitmap) {
        return bitmap.getConfig() == Bitmap.Config.ALPHA_8 ? bitmap : bitmap.extractAlpha();
    }

    @Override // org.telegram.ui.Components.lt0
    public void c(Object obj, float f10) {
        mb0 mb0Var = (mb0) obj;
        switch (this.a) {
            case 25:
                mb0Var.f = f10;
                if (!mb0Var.E || mb0Var.G) {
                    mb0Var.c.setStrokeWidth(org.telegram.messenger.g0.T1(mb0Var.w, mb0Var.x, f10));
                    mb0Var.f();
                }
                mb0Var.invalidate();
                break;
            case 26:
            default:
                mb0Var.s = f10;
                mb0Var.f();
                break;
            case 27:
                mb0Var.n = f10;
                if (!mb0Var.E || mb0Var.G) {
                    mb0Var.f();
                }
                mb0Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.eb0
    public String e(int i7) {
        switch (this.a) {
            case 1:
                boolean z10 = org.telegram.messenger.hd.c0;
                String format = String.format("%02d", Integer.valueOf((i7 % 12 != 0 || z10) ? i7 % (z10 ? 24 : 12) : 12));
                if (i7 >= 24) {
                    break;
                }
                break;
            case 3:
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
            case 6:
                switch (i7) {
                }
            case 8:
                switch (i7) {
                }
        }
        return String.format("%02d", Integer.valueOf(i7));
    }

    @Override // org.telegram.ui.ActionBar.o6
    public void f(int i7, View view) {
        ((org.telegram.ui.ActionBar.z0) view).d(i7, i7);
    }

    @Override // org.telegram.ui.ActionBar.n6
    public int g(View view) {
        org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) view;
        if (z0Var.getTextView() != null) {
            return z0Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // org.telegram.ui.Components.kt0
    public float get(Object obj) {
        mb0 mb0Var = (mb0) obj;
        switch (this.a) {
            case 24:
                return mb0Var.f;
            case 25:
            default:
                return mb0Var.s;
            case 26:
                return mb0Var.n;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                t1Var.dismiss();
                break;
            case 4:
                Pattern pattern = t4.a;
                break;
            default:
                t1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.j9
    public Object o(Object obj) {
        switch (this.a) {
            case 20:
                return CheckBoxBase.I;
            default:
                int i7 = ly.V2;
                return 0;
        }
    }

    @Override // org.telegram.messenger.db
    public void onClick() {
        int i7 = dl.G0;
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void A(ImageReceiver imageReceiver) {
    }

    @Override // org.telegram.messenger.kc
    public /* synthetic */ void O(int i7, Drawable drawable) {
    }
}
