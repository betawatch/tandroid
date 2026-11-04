package gi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.bc;
import org.telegram.messenger.lc;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.is;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k1 extends is {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public final boolean R = lc.e(8200);
    public final /* synthetic */ m1 S;

    public k1(m1 m1Var) {
        this.S = m1Var;
    }

    public static void m(Canvas canvas, org.telegram.ui.Components.g5 g5Var, l1 l1Var, float f10) {
        if (g5Var != null) {
            g5Var.setAlpha((int) (f10 * 255.0f));
            g5Var.draw(canvas);
        } else if (l1Var.f != null) {
            canvas.save();
            ImageReceiver imageReceiver = l1Var.f;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), l1Var.f.A());
            l1Var.f.setAlpha(f10);
            l1Var.f.h(canvas, null);
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void a(Canvas canvas, long j10, int i3, int i10, float f10) {
        if (this.P == null) {
            return;
        }
        boolean z10 = true;
        boolean z11 = this.S.b0() || this.P.size() <= 4 || !this.R;
        if (!z11) {
            for (int i11 = 0; i11 < this.P.size(); i11++) {
                if (((l1) this.P.get(i11)).getScale() != 1.0f) {
                    break;
                }
            }
        }
        z10 = z11;
        if (!z10) {
            super.a(canvas, j10, i3, i10, f10);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f10);
        k();
    }

    @Override // org.telegram.ui.Components.is
    public final void c(Canvas canvas) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 >= arrayList.size()) {
                return;
            }
            l1 l1Var = (l1) arrayList.get(i3);
            l1Var.getClass();
            org.telegram.ui.Components.g5 g5Var = l1Var.d;
            if (g5Var != null) {
                g5Var.setColorFilter(this.S.p3);
            }
            l1Var.r.h(canvas, l1Var.n[this.L]);
            i3++;
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void d(Canvas canvas, float f10) {
        org.telegram.ui.Components.g5 g5Var;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            for (int i3 = 0; i3 < this.P.size(); i3++) {
                l1 l1Var = (l1) this.P.get(i3);
                l1Var.getClass();
                float scale = l1Var.getScale();
                float alpha = l1Var.getAlpha() * f10;
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(l1Var.getPaddingLeft() + ((int) l1Var.getX()), l1Var.getPaddingTop(), (l1Var.getWidth() + ((int) l1Var.getX())) - l1Var.getPaddingRight(), l1Var.getHeight() - l1Var.getPaddingBottom());
                org.telegram.ui.Components.g5 g5Var2 = l1Var.d;
                if (g5Var2 != null) {
                    g5Var2.setBounds(rect);
                }
                ImageReceiver imageReceiver = l1Var.f;
                if (imageReceiver != null) {
                    imageReceiver.z0(rect);
                }
                PorterDuffColorFilter porterDuffColorFilter = this.S.p3;
                if (porterDuffColorFilter != null && (g5Var = l1Var.d) != null) {
                    g5Var.setColorFilter(porterDuffColorFilter);
                }
                if (scale != 1.0f) {
                    canvas.save();
                    canvas.scale(scale, scale, rect.centerX(), rect.centerY());
                    m(canvas, g5Var2, l1Var, alpha);
                    canvas.restore();
                } else {
                    m(canvas, g5Var2, l1Var, alpha);
                }
            }
            canvas.restore();
        }
    }

    @Override // org.telegram.ui.Components.is
    public final void g() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i3 >= arrayList.size()) {
                this.S.invalidate();
                return;
            }
            bc bcVar = ((l1) arrayList.get(i3)).n[this.L];
            if (bcVar != null) {
                bcVar.a();
            }
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    @Override // org.telegram.ui.Components.is
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j10) {
        float intrinsicWidth;
        float width;
        int height;
        float f10;
        int i3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            l1 l1Var = (l1) this.P.get(i10);
            l1Var.getClass();
            bc[] bcVarArr = l1Var.n;
            org.telegram.ui.Components.g5 g5Var = l1Var.d;
            ImageReceiver imageReceiver = g5Var != null ? g5Var.k : l1Var.f;
            if (imageReceiver != null) {
                imageReceiver.setAlpha(l1Var.getAlpha());
                org.telegram.ui.Components.g5 g5Var2 = l1Var.d;
                if (g5Var2 != null) {
                    g5Var2.setColorFilter(this.S.p3);
                }
                int i11 = this.L;
                bc e02 = imageReceiver.e0(bcVarArr[i11], i11);
                bcVarArr[i11] = e02;
                e02.c = j10;
                l1Var.r = imageReceiver;
                if (imageReceiver.B() != null) {
                    l1Var.r.B().V(j10);
                }
                if (l1Var.r.m() != null) {
                    l1Var.r.m().D(j10);
                }
                Rect rect = org.telegram.messenger.g0.Q;
                rect.set(l1Var.getPaddingLeft(), l1Var.getPaddingTop(), l1Var.getWidth() - l1Var.getPaddingRight(), l1Var.getHeight() - l1Var.getPaddingBottom());
                ch0 B = imageReceiver.B();
                if (B == null || (i3 = B.c) == 0) {
                    org.telegram.ui.Components.t5 m10 = imageReceiver.m();
                    if (m10 == null || m10.getIntrinsicHeight() == 0) {
                        Bitmap n4 = imageReceiver.n();
                        if (n4 != null) {
                            width = n4.getWidth();
                            height = n4.getHeight();
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
                            rect.offset((l1Var.getLeft() + ((int) l1Var.getTranslationX())) - this.O, 0);
                            bcVarArr[i11].b(rect);
                            arrayList.add(l1Var);
                        }
                    } else {
                        width = m10.getIntrinsicWidth();
                        height = m10.getIntrinsicHeight();
                    }
                    f10 = height;
                } else {
                    width = B.b;
                    f10 = i3;
                }
                intrinsicWidth = width / f10;
                if (intrinsicWidth >= 1.0f) {
                }
                rect.offset((l1Var.getLeft() + ((int) l1Var.getTranslationX())) - this.O, 0);
                bcVarArr[i11].b(rect);
                arrayList.add(l1Var);
            }
        }
    }
}
