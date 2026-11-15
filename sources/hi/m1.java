package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.qc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.os;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class m1 extends os {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = qc.e(8200);
    public final /* synthetic */ o1 S;

    public m1(o1 o1Var) {
        this.S = o1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.g5 g5Var, n1 n1Var, float f10) {
        if (g5Var != null) {
            g5Var.setAlpha((int) (f10 * 255.0f));
            g5Var.draw(canvas);
        } else if (n1Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = n1Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), n1Var.f.A());
            n1Var.f.setAlpha(f10);
            n1Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.os
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.P == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = this.S.b0() || this.P.size() <= 4 || !this.R;
        if (!z11) {
            for (int i11 = 0; i11 < this.P.size(); i11++) {
                if (((n1) this.P.get(i11)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j3, i7, i10, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.os
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            n1 n1Var = (n1) arrayList.get(i7);
            n1Var.getClass();
            org.telegram.ui.Components.g5 g5Var = n1Var.d;
            if (g5Var != null) {
                g5Var.setColorFilter(this.S.p3);
            }
            n1Var.r.h(canvas, n1Var.n[this.L]);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.os
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.g5 g5Var;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i7 = 0; i7 < this.P.size(); i7++) {
                n1 n1Var = (n1) this.P.get(i7);
                n1Var.getClass();
                float scale = n1Var.getScale();
                float alpha = n1Var.getAlpha() * f10;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(n1Var.getPaddingLeft() + ((int) n1Var.getX()), n1Var.getPaddingTop(), (n1Var.getWidth() + ((int) n1Var.getX())) - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                org.telegram.ui.Components.g5 g5Var2 = n1Var.d;
                if (g5Var2 != null) {
                    g5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = n1Var.f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (g5Var = n1Var.d) != null) {
                    g5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, g5Var2, n1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, g5Var2, n1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.os
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                this.S.invalidate();
                return;
            }
            hc hcVar = ((n1) arrayList.get(i7)).n[this.L];
            if (hcVar != null) {
                hcVar.a();
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    @Override // org.telegram.ui.Components.os
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j3) {
        float intrinsicWidth;
        float width;
        int height;
        float f10;
        int i7;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            n1 n1Var = (n1) this.P.get(i10);
            n1Var.getClass();
            hc[] hcVarArr = n1Var.n;
            org.telegram.ui.Components.g5 g5Var = n1Var.d;
            ImageReceiver imageReceiver = g5Var != null ? g5Var.k : n1Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(n1Var.getAlpha());
                org.telegram.ui.Components.g5 g5Var2 = n1Var.d;
                if (g5Var2 != null) {
                    g5Var2.setColorFilter(this.S.p3);
                }
                int i11 = this.L;
                hc e02 = imageReceiver.e0(hcVarArr[i11], i11);
                hcVarArr[i11] = e02;
                e02.c = j3;
                n1Var.r = imageReceiver;
                if (imageReceiver.B() != null) {
                    n1Var.r.B().V(j3);
                }
                if (n1Var.r.m() != null) {
                    n1Var.r.m().D(j3);
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(n1Var.getPaddingLeft(), n1Var.getPaddingTop(), n1Var.getWidth() - n1Var.getPaddingRight(), n1Var.getHeight() - n1Var.getPaddingBottom());
                ch0 B = imageReceiver.B();
                if (B == null || (i7 = B.c) == 0) {
                    org.telegram.ui.Components.t5 m10 = imageReceiver.m();
                    if (m10 == null || m10.getIntrinsicHeight() == 0) {
                        Bitmap n10 = imageReceiver.n();
                        if (n10 != null) {
                            width = n10.getWidth();
                            height = n10.getHeight();
                        } else {
                            Drawable drawable = imageReceiver.n0;
                            intrinsicWidth = (drawable == null || drawable.getIntrinsicHeight() == 0) ? 1.0f : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
                            if (intrinsicWidth >= 1.0f) {
                                float height2 = (rect.height() * intrinsicWidth) / 2.0f;
                                int centerX = (int) (rect.centerX() - height2);
                                rect.left = centerX;
                                rect.right = (int) (rect.centerX() + height2);
                            } else if (intrinsicWidth > 1.0f) {
                                float width2 = (rect.width() / intrinsicWidth) / 2.0f;
                                int centerY = (int) (rect.centerY() - width2);
                                rect.top = centerY;
                                rect.bottom = (int) (rect.centerY() + width2);
                            }
                            rect.offset((n1Var.getLeft() + ((int) n1Var.getTranslationX())) - this.O, 0);
                            hcVarArr[i11].b(rect);
                            arrayList.add(n1Var);
                        }
                    } else {
                        width = m10.getIntrinsicWidth();
                        height = m10.getIntrinsicHeight();
                    }
                    f10 = height;
                } else {
                    width = B.b;
                    f10 = i7;
                }
                intrinsicWidth = width / f10;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((n1Var.getLeft() + ((int) n1Var.getTranslationX())) - this.O, 0);
                hcVarArr[i11].b(rect);
                arrayList.add(n1Var);
            }
        }
    }
}
