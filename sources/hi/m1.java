package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class m1 extends vs {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = pc.e(8200);
    public final /* synthetic */ o1 S;

    public m1(o1 o1Var) {
        this.S = o1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.o5 o5Var, n1 n1Var, float f10) {
        if (o5Var != null) {
            o5Var.setAlpha((int) (f10 * 255.0f));
            o5Var.draw(canvas);
        } else if (n1Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = n1Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), n1Var.f.A());
            n1Var.f.setAlpha(f10);
            n1Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vs
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

    @Override // org.telegram.ui.Components.vs
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            n1 n1Var = (n1) arrayList.get(i7);
            n1Var.getClass();
            org.telegram.ui.Components.o5 o5Var = n1Var.d;
            if (o5Var != null) {
                o5Var.setColorFilter(this.S.p3);
            }
            n1Var.r.h(canvas, n1Var.n[this.L]);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.o5 o5Var;
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
                org.telegram.ui.Components.o5 o5Var2 = n1Var.d;
                if (o5Var2 != null) {
                    o5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = n1Var.f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (o5Var = n1Var.d) != null) {
                    o5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, o5Var2, n1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, o5Var2, n1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.vs
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                this.S.invalidate();
                return;
            }
            gc gcVar = ((n1) arrayList.get(i7)).n[this.L];
            if (gcVar != null) {
                gcVar.a();
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    @Override // org.telegram.ui.Components.vs
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
            gc[] gcVarArr = n1Var.n;
            org.telegram.ui.Components.o5 o5Var = n1Var.d;
            ImageReceiver imageReceiver = o5Var != null ? o5Var.k : n1Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(n1Var.getAlpha());
                org.telegram.ui.Components.o5 o5Var2 = n1Var.d;
                if (o5Var2 != null) {
                    o5Var2.setColorFilter(this.S.p3);
                }
                int i11 = this.L;
                gc e02 = imageReceiver.e0(gcVarArr[i11], i11);
                gcVarArr[i11] = e02;
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
                mh0 B = imageReceiver.B();
                if (B == null || (i7 = B.c) == 0) {
                    org.telegram.ui.Components.b6 m10 = imageReceiver.m();
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
                            gcVarArr[i11].b(rect);
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
                gcVarArr[i11].b(rect);
                arrayList.add(n1Var);
            }
        }
    }
}
