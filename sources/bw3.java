// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bw3 extends fr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = i86.e(8200);
    public final /* synthetic */ dw3 S;

    public bw3(dw3 dw3Var) {
        this.S = dw3Var;
    }

    public static void m(Canvas canvas, wl wlVar, cw3 cw3Var, float f) {
        if (wlVar != null) {
            wlVar.setAlpha((int) (f * 255.0f));
            wlVar.draw(canvas);
        } else if (cw3Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = cw3Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), cw3Var.f.x());
            cw3Var.f.setAlpha(f);
            cw3Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override // fr3
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        if (this.P == null) {
            return;
        }
        boolean z = true;
        boolean z2 = this.S.d0() || this.P.size() <= 4 || !this.R;
        if (!z2) {
            for (int i3 = 0; i3 < this.P.size(); i3++) {
                if (((cw3) this.P.get(i3)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z = z2;
        if (!z) {
            super.a(canvas, j, i, i2, f);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f);
        k();
    }

    @Override // fr3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            cw3 cw3Var = (cw3) arrayList.get(i);
            cw3Var.getClass();
            wl wlVar = cw3Var.d;
            if (wlVar != null) {
                wlVar.setColorFilter(this.S.p3);
            }
            cw3Var.r.h(canvas, cw3Var.n[this.L]);
            i++;
        }
    }

    @Override // fr3
    public final void d(Canvas canvas, float f) {
        wl wlVar;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i = 0; i < this.P.size(); i++) {
                cw3 cw3Var = (cw3) this.P.get(i);
                cw3Var.getClass();
                float scale = cw3Var.getScale();
                float alpha = cw3Var.getAlpha() * f;
                Rect rect = hl.Q;
                rect.set(cw3Var.getPaddingLeft() + ((int) cw3Var.getX()), cw3Var.getPaddingTop(), (cw3Var.getWidth() + ((int) cw3Var.getX())) - cw3Var.getPaddingRight(), cw3Var.getHeight() - cw3Var.getPaddingBottom());
                wl wlVar2 = cw3Var.d;
                if (wlVar2 != null) {
                    wlVar2.setBounds(rect);
                }
                ImageReceiver imageReceiver = cw3Var.f;
                if (imageReceiver != null) {
                    imageReceiver.j0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (wlVar = cw3Var.d) != null) {
                    wlVar.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, wlVar2, cw3Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, wlVar2, cw3Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // fr3
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                this.S.invalidate();
                return;
            }
            ln5 ln5Var = ((cw3) arrayList.get(i)).n[this.L];
            if (ln5Var != null) {
                ln5Var.a();
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    @Override // fr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j) {
        float intrinsicWidth;
        float width;
        int height;
        float f;
        int i;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i2 = 0; i2 < this.P.size(); i2++) {
            cw3 cw3Var = (cw3) this.P.get(i2);
            cw3Var.getClass();
            ln5[] ln5VarArr = cw3Var.n;
            wl wlVar = cw3Var.d;
            ImageReceiver imageReceiver = wlVar != null ? wlVar.k : cw3Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(cw3Var.getAlpha());
                wl wlVar2 = cw3Var.d;
                if (wlVar2 != null) {
                    wlVar2.setColorFilter(this.S.p3);
                }
                int i3 = this.L;
                ln5 Q = imageReceiver.Q(ln5VarArr[i3], i3);
                ln5VarArr[i3] = Q;
                Q.c = j;
                cw3Var.r = imageReceiver;
                if (imageReceiver.y() != null) {
                    cw3Var.r.y().Q(j);
                }
                if (cw3Var.r.m() != null) {
                    cw3Var.r.m().D(j);
                }
                Rect rect = hl.Q;
                rect.set(cw3Var.getPaddingLeft(), cw3Var.getPaddingTop(), cw3Var.getWidth() - cw3Var.getPaddingRight(), cw3Var.getHeight() - cw3Var.getPaddingBottom());
                b29 y = imageReceiver.y();
                if (y == null || (i = y.c) == 0) {
                    lm m = imageReceiver.m();
                    if (m == null || m.getIntrinsicHeight() == 0) {
                        Bitmap n = imageReceiver.n();
                        if (n != null) {
                            width = n.getWidth();
                            height = n.getHeight();
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
                            rect.offset((cw3Var.getLeft() + ((int) cw3Var.getTranslationX())) - this.O, 0);
                            ln5VarArr[i3].b(rect);
                            arrayList.add(cw3Var);
                        }
                    } else {
                        width = m.getIntrinsicWidth();
                        height = m.getIntrinsicHeight();
                    }
                    f = height;
                } else {
                    width = y.b;
                    f = i;
                }
                intrinsicWidth = width / f;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((cw3Var.getLeft() + ((int) cw3Var.getTranslationX())) - this.O, 0);
                ln5VarArr[i3].b(rect);
                arrayList.add(cw3Var);
            }
        }
    }
}
