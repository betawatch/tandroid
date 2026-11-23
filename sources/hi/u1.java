package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.pc;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.us;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class u1 extends us {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = pc.e(8200);
    public final /* synthetic */ w1 S;

    public u1(w1 w1Var) {
        this.S = w1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.o5 o5Var, v1 v1Var, float f10) {
        if (o5Var != null) {
            o5Var.setAlpha((int) (f10 * 255.0f));
            o5Var.draw(canvas);
        } else if (v1Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = v1Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.z(), v1Var.f.B());
            v1Var.f.setAlpha(f10);
            v1Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void a(Canvas canvas, long j3, int i7, int i10, float f10) {
        if (this.P == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = this.S.b0() || this.P.size() <= 4 || !this.R;
        if (!z11) {
            for (int i11 = 0; i11 < this.P.size(); i11++) {
                if (((v1) this.P.get(i11)).getScale() != 1.0f) {
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

    @Override // org.telegram.ui.Components.us
    public final void c(Canvas canvas) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                return;
            }
            v1 v1Var = (v1) arrayList.get(i7);
            v1Var.getClass();
            org.telegram.ui.Components.o5 o5Var = v1Var.d;
            if (o5Var != null) {
                o5Var.setColorFilter(this.S.p3);
            }
            v1Var.r.h(canvas, v1Var.n[this.L]);
            i7++;
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.o5 o5Var;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i7 = 0; i7 < this.P.size(); i7++) {
                v1 v1Var = (v1) this.P.get(i7);
                v1Var.getClass();
                float scale = v1Var.getScale();
                float alpha = v1Var.getAlpha() * f10;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(v1Var.getPaddingLeft() + ((int) v1Var.getX()), v1Var.getPaddingTop(), (v1Var.getWidth() + ((int) v1Var.getX())) - v1Var.getPaddingRight(), v1Var.getHeight() - v1Var.getPaddingBottom());
                org.telegram.ui.Components.o5 o5Var2 = v1Var.d;
                if (o5Var2 != null) {
                    o5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = v1Var.f;
                if (imageReceiver != null) {
                    imageReceiver.A0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (o5Var = v1Var.d) != null) {
                    o5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, o5Var2, v1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, o5Var2, v1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.us
    public final void g() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i7 >= arrayList.size()) {
                this.S.invalidate();
                return;
            }
            org.telegram.messenger.gc gcVar = ((v1) arrayList.get(i7)).n[this.L];
            if (gcVar != null) {
                gcVar.a();
            }
            i7++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    @Override // org.telegram.ui.Components.us
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
            v1 v1Var = (v1) this.P.get(i10);
            v1Var.getClass();
            org.telegram.messenger.gc[] gcVarArr = v1Var.n;
            org.telegram.ui.Components.o5 o5Var = v1Var.d;
            ImageReceiver imageReceiver = o5Var != null ? o5Var.k : v1Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(v1Var.getAlpha());
                org.telegram.ui.Components.o5 o5Var2 = v1Var.d;
                if (o5Var2 != null) {
                    o5Var2.setColorFilter(this.S.p3);
                }
                int i11 = this.L;
                org.telegram.messenger.gc f02 = imageReceiver.f0(gcVarArr[i11], i11);
                gcVarArr[i11] = f02;
                f02.c = j3;
                v1Var.r = imageReceiver;
                if (imageReceiver.C() != null) {
                    v1Var.r.C().V(j3);
                }
                if (v1Var.r.m() != null) {
                    v1Var.r.m().D(j3);
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(v1Var.getPaddingLeft(), v1Var.getPaddingTop(), v1Var.getWidth() - v1Var.getPaddingRight(), v1Var.getHeight() - v1Var.getPaddingBottom());
                nh0 C = imageReceiver.C();
                if (C == null || (i7 = C.c) == 0) {
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
                            rect.offset((v1Var.getLeft() + ((int) v1Var.getTranslationX())) - this.O, 0);
                            gcVarArr[i11].b(rect);
                            arrayList.add(v1Var);
                        }
                    } else {
                        width = m10.getIntrinsicWidth();
                        height = m10.getIntrinsicHeight();
                    }
                    f10 = height;
                } else {
                    width = C.b;
                    f10 = i7;
                }
                intrinsicWidth = width / f10;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((v1Var.getLeft() + ((int) v1Var.getTranslationX())) - this.O, 0);
                gcVarArr[i11].b(rect);
                arrayList.add(v1Var);
            }
        }
    }
}
