package fi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.zg0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class k1 extends is {
    public int M;
    public int N;
    public ArrayList O;
    public final ArrayList P = new ArrayList();
    public final boolean Q = sc.e(8200);
    public final /* synthetic */ m1 R;

    public k1(m1 m1Var) {
        this.R = m1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.i5 i5Var, l1 l1Var, float f10) {
        if (i5Var != null) {
            i5Var.setAlpha((int) (f10 * 255.0f));
            i5Var.draw(canvas);
        } else if (l1Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = l1Var.f;
            canvas.clipRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), l1Var.f.A());
            l1Var.f.setAlpha(f10);
            l1Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.O == null) {
            return;
        }
        boolean z9 = true;
        boolean z10 = this.R.b0() || this.O.size() <= 4 || !this.Q;
        if (!z10) {
            for (int i11 = 0; i11 < this.O.size(); i11++) {
                if (((l1) this.O.get(i11)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z9 = z10;
        if (!z9) {
            super.a(canvas, j3, i7, i10, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.is
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                return;
            }
            l1 l1Var = (l1) arrayList.get(i7);
            l1Var.getClass();
            org.telegram.ui.Components.i5 i5Var = l1Var.d;
            if (i5Var != null) {
                i5Var.setColorFilter(this.R.o3);
            }
            l1Var.r.h(canvas, l1Var.n[this.K]);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.i5 i5Var;
        if (this.O != null) {
            canvas.save();
            canvas.translate(-this.N, 0.0f);
            for (int i7 = 0; i7 < this.O.size(); i7++) {
                l1 l1Var = (l1) this.O.get(i7);
                l1Var.getClass();
                float scale = l1Var.getScale();
                float alpha = l1Var.getAlpha() * f10;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(l1Var.getPaddingLeft() + ((int) l1Var.getX()), l1Var.getPaddingTop(), (l1Var.getWidth() + ((int) l1Var.getX())) - l1Var.getPaddingRight(), l1Var.getHeight() - l1Var.getPaddingBottom());
                org.telegram.ui.Components.i5 i5Var2 = l1Var.d;
                if (i5Var2 != null) {
                    i5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = l1Var.f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.R.o3;
                if (porterDuffColorFilter != null && (i5Var = l1Var.d) != null) {
                    i5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, i5Var2, l1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, i5Var2, l1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.P;
            if (i7 >= arrayList.size()) {
                this.R.invalidate();
                return;
            }
            ic icVar = ((l1) arrayList.get(i7)).n[this.K];
            if (icVar != null) {
                icVar.a();
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    @Override // org.telegram.ui.Components.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j3) {
        float intrinsicWidth;
        float width;
        int height;
        float f10;
        int i7;
        ArrayList arrayList = this.P;
        arrayList.clear();
        for (int i10 = 0; i10 < this.O.size(); i10++) {
            l1 l1Var = (l1) this.O.get(i10);
            l1Var.getClass();
            ic[] icVarArr = l1Var.n;
            org.telegram.ui.Components.i5 i5Var = l1Var.d;
            ImageReceiver imageReceiver = i5Var != null ? i5Var.k : l1Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(l1Var.getAlpha());
                org.telegram.ui.Components.i5 i5Var2 = l1Var.d;
                if (i5Var2 != null) {
                    i5Var2.setColorFilter(this.R.o3);
                }
                int i11 = this.K;
                ic e02 = imageReceiver.e0(icVarArr[i11], i11);
                icVarArr[i11] = e02;
                e02.c = j3;
                l1Var.r = imageReceiver;
                if (imageReceiver.B() != null) {
                    l1Var.r.B().V(j3);
                }
                if (l1Var.r.m() != null) {
                    l1Var.r.m().D(j3);
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(l1Var.getPaddingLeft(), l1Var.getPaddingTop(), l1Var.getWidth() - l1Var.getPaddingRight(), l1Var.getHeight() - l1Var.getPaddingBottom());
                zg0 B = imageReceiver.B();
                if (B == null || (i7 = B.c) == 0) {
                    org.telegram.ui.Components.v5 m10 = imageReceiver.m();
                    if (m10 == null || m10.getIntrinsicHeight() == 0) {
                        Bitmap n10 = imageReceiver.n();
                        if (n10 != null) {
                            width = n10.getWidth();
                            height = n10.getHeight();
                        } else {
                            Drawable drawable = imageReceiver.m0;
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
                            rect.offset((l1Var.getLeft() + ((int) l1Var.getTranslationX())) - this.N, 0);
                            icVarArr[i11].b(rect);
                            arrayList.add(l1Var);
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
                rect.offset((l1Var.getLeft() + ((int) l1Var.getTranslationX())) - this.N, 0);
                icVarArr[i11].b(rect);
                arrayList.add(l1Var);
            }
        }
    }
}
