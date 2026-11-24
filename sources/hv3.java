// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hv3 extends oq3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = e66.e(8200);
    public final /* synthetic */ jv3 S;

    public hv3(jv3 jv3Var) {
        this.S = jv3Var;
    }

    public static void m(Canvas canvas, vl vlVar, iv3 iv3Var, float f) {
        if (vlVar != null) {
            vlVar.setAlpha((int) (f * 255.0f));
            vlVar.draw(canvas);
        } else if (iv3Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = iv3Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), iv3Var.f.x());
            iv3Var.f.setAlpha(f);
            iv3Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override // oq3
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        if (this.P == null) {
            return;
        }
        boolean z = true;
        boolean z2 = this.S.c0() || this.P.size() <= 4 || !this.R;
        if (!z2) {
            for (int i3 = 0; i3 < this.P.size(); i3++) {
                if (((iv3) this.P.get(i3)).getScale() != 1.0f) {
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

    @Override // oq3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            iv3 iv3Var = (iv3) arrayList.get(i);
            iv3Var.getClass();
            vl vlVar = iv3Var.d;
            if (vlVar != null) {
                vlVar.setColorFilter(this.S.p3);
            }
            iv3Var.r.h(canvas, iv3Var.n[this.L]);
            i++;
        }
    }

    @Override // oq3
    public final void d(Canvas canvas, float f) {
        vl vlVar;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i = 0; i < this.P.size(); i++) {
                iv3 iv3Var = (iv3) this.P.get(i);
                iv3Var.getClass();
                float scale = iv3Var.getScale();
                float alpha = iv3Var.getAlpha() * f;
                Rect rect = gl.Q;
                rect.set(iv3Var.getPaddingLeft() + ((int) iv3Var.getX()), iv3Var.getPaddingTop(), (iv3Var.getWidth() + ((int) iv3Var.getX())) - iv3Var.getPaddingRight(), iv3Var.getHeight() - iv3Var.getPaddingBottom());
                vl vlVar2 = iv3Var.d;
                if (vlVar2 != null) {
                    vlVar2.setBounds(rect);
                }
                ImageReceiver imageReceiver = iv3Var.f;
                if (imageReceiver != null) {
                    imageReceiver.j0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (vlVar = iv3Var.d) != null) {
                    vlVar.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, vlVar2, iv3Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, vlVar2, iv3Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // oq3
    public final void g() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                this.S.invalidate();
                return;
            }
            il5 il5Var = ((iv3) arrayList.get(i)).n[this.L];
            if (il5Var != null) {
                il5Var.a();
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    @Override // oq3
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
            iv3 iv3Var = (iv3) this.P.get(i2);
            iv3Var.getClass();
            il5[] il5VarArr = iv3Var.n;
            vl vlVar = iv3Var.d;
            ImageReceiver imageReceiver = vlVar != null ? vlVar.k : iv3Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(iv3Var.getAlpha());
                vl vlVar2 = iv3Var.d;
                if (vlVar2 != null) {
                    vlVar2.setColorFilter(this.S.p3);
                }
                int i3 = this.L;
                il5 Q = imageReceiver.Q(il5VarArr[i3], i3);
                il5VarArr[i3] = Q;
                Q.c = j;
                iv3Var.r = imageReceiver;
                if (imageReceiver.y() != null) {
                    iv3Var.r.y().Q(j);
                }
                if (iv3Var.r.m() != null) {
                    iv3Var.r.m().D(j);
                }
                Rect rect = gl.Q;
                rect.set(iv3Var.getPaddingLeft(), iv3Var.getPaddingTop(), iv3Var.getWidth() - iv3Var.getPaddingRight(), iv3Var.getHeight() - iv3Var.getPaddingBottom());
                oy8 y = imageReceiver.y();
                if (y == null || (i = y.c) == 0) {
                    km m = imageReceiver.m();
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
                            rect.offset((iv3Var.getLeft() + ((int) iv3Var.getTranslationX())) - this.O, 0);
                            il5VarArr[i3].b(rect);
                            arrayList.add(iv3Var);
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
                rect.offset((iv3Var.getLeft() + ((int) iv3Var.getTranslationX())) - this.O, 0);
                il5VarArr[i3].b(rect);
                arrayList.add(iv3Var);
            }
        }
    }
}
