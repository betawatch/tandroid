// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class i02 extends qn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ x02 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i02(x02 x02Var, byte b) {
        super("translation", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = x02Var;
                super("openProgress", (byte) 0);
                break;
            default:
                this.c = x02Var;
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009c, code lost:
    
        if (r7.v2 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    @Override // qn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj, float f) {
        int i;
        p02 p02Var;
        k62 k62Var;
        float f2;
        byte b = this.b;
        x02 x02Var = this.c;
        int i2 = 0;
        switch (b) {
            case 0:
                x02Var.X1 = f;
                p02 p02Var2 = x02Var.w2;
                if (p02Var2 != null) {
                    if ((p02Var2 instanceof m52) || (x02Var.v2 instanceof m52)) {
                        int max = Math.max(p02Var2.getWidth(), x02Var.v2.getWidth());
                        boolean z = x02Var.w2 instanceof m52;
                        p02 p02Var3 = x02Var.v2;
                        if (z) {
                            p02Var3.setTranslationX((-max) * f);
                            x02Var.w2.setTranslationX((1.0f - f) * max);
                        } else {
                            p02Var3.setTranslationX(max * f);
                            x02Var.w2.setTranslationX((1.0f - f) * (-max));
                        }
                    } else {
                        p02Var2.setAlpha(f);
                        x02Var.w2.w(f);
                        p02 p02Var4 = x02Var.w2;
                        k62 k62Var2 = x02Var.g2;
                        if (p02Var4 != k62Var2) {
                            if (x02Var.v2 == k62Var2) {
                                i = 0;
                            }
                            p02Var = x02Var.w2;
                            k62Var = x02Var.h2;
                            if (p02Var == k62Var) {
                                break;
                            } else {
                                i2 = 1;
                            }
                            x02Var.K1(i2);
                            x02Var.w2.setTranslationY(gl.L(78.0f) * f);
                            x02Var.v2.w(1.0f - Math.min(1.0f, f / 0.7f));
                            x02Var.v2.m(x02Var.i4);
                        } else {
                            i = 1;
                        }
                        x02Var.K1(i);
                        p02Var = x02Var.w2;
                        k62Var = x02Var.h2;
                        if (p02Var == k62Var) {
                        }
                        x02Var.K1(i2);
                        x02Var.w2.setTranslationY(gl.L(78.0f) * f);
                        x02Var.v2.w(1.0f - Math.min(1.0f, f / 0.7f));
                        x02Var.v2.m(x02Var.i4);
                    }
                    if (x02Var.q3 != null) {
                        x02Var.K1(1);
                    }
                    x02Var.b.invalidate();
                    break;
                }
                break;
            default:
                xz1 xz1Var = x02Var.v3;
                int childCount = xz1Var.getChildCount();
                while (i2 < childCount) {
                    float f3 = (3 - i2) * 32.0f;
                    View childAt = xz1Var.getChildAt(i2);
                    if (f > f3) {
                        float f4 = f - f3;
                        if (f4 <= 200.0f) {
                            float f5 = f4 / 200.0f;
                            f2 = s33.g.getInterpolation(f5) * 1.1f;
                            childAt.setAlpha(s33.j.getInterpolation(f5));
                        } else {
                            childAt.setAlpha(1.0f);
                            float f6 = f4 - 200.0f;
                            f2 = f6 <= 100.0f ? 1.1f - (s33.i.getInterpolation(f6 / 100.0f) * 0.1f) : 1.0f;
                        }
                    } else {
                        f2 = 0.0f;
                    }
                    if (childAt instanceof s02) {
                        ((s02) childAt).a.setAttachScale(f2);
                    }
                    i2++;
                }
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.b) {
            case 0:
                return Float.valueOf(this.c.X1);
            default:
                return Float.valueOf(0.0f);
        }
    }
}
