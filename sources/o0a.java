// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class o0a extends fr3 {
    public int N;
    public int O;
    public ArrayList P;
    public final ArrayList Q = new ArrayList();
    public float R = 1.0f;
    public final boolean S = i86.e(8200);
    public final OvershootInterpolator T = new OvershootInterpolator(3.0f);
    public final /* synthetic */ p0a U;

    public o0a(p0a p0aVar) {
        this.U = p0aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    @Override // fr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas, long j, int i, int i2, float f) {
        boolean z;
        int i3;
        ArrayList arrayList = this.P;
        if (arrayList == null) {
            return;
        }
        this.R = 1.0f;
        if (!arrayList.isEmpty()) {
            View view = (View) this.P.get(0);
            if (view.getY() > (this.U.getHeight() - this.U.getPaddingBottom()) - view.getHeight()) {
                this.R = (ete.a((-((view.getY() - this.U.getHeight()) + this.U.getPaddingBottom())) / view.getHeight(), 0.0f, 1.0f) * 0.75f) + 0.25f;
            }
        }
        p0a p0aVar = this.U;
        boolean z2 = true;
        boolean z3 = p0aVar.m3.a0 == 13 || this.R < 1.0f || p0aVar.d0() || this.P.size() <= 4 || !this.S || this.U.m3.g() || (i3 = this.U.m3.a0) == 4 || i3 == 6;
        if (!z3) {
            if (this.U.m3.R1 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                n1a n1aVar = this.U.m3;
                if (elapsedRealtime - n1aVar.R1 < n1aVar.e()) {
                    z = true;
                    for (int i4 = 0; i4 < this.P.size(); i4++) {
                        w0a w0aVar = (w0a) this.P.get(i4);
                        if (w0aVar.O != 0.0f || w0aVar.T != 0.0f || w0aVar.J != null || w0aVar.getTranslationX() != 0.0f || w0aVar.getTranslationY() != 0.0f || w0aVar.getAlpha() != 1.0f) {
                            break;
                        }
                        if (z) {
                            int i5 = w0aVar.c;
                            n1a n1aVar2 = this.U.m3;
                            if (i5 > n1aVar2.P1 && i5 < n1aVar2.Q1) {
                                break;
                            }
                        }
                        if (w0aVar.R) {
                            break;
                        }
                    }
                }
            }
            z = false;
            while (i4 < this.P.size()) {
            }
        }
        z2 = z3;
        float f2 = ri5.b ? 1.0f : f;
        if (!z2 && !ri5.e) {
            super.a(canvas, j, i, i2, f2);
            return;
        }
        i(System.currentTimeMillis());
        d(canvas, f2);
        k();
    }

    @Override // fr3
    public final void b(Canvas canvas, Bitmap bitmap, Paint paint) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
    }

    @Override // fr3
    public final void c(Canvas canvas) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Q;
            if (i >= arrayList.size()) {
                return;
            }
            w0a w0aVar = (w0a) arrayList.get(i);
            if (!w0aVar.b) {
                if (w0aVar.a) {
                    w0aVar.F.setBounds(w0aVar.G);
                    w0aVar.F.draw(canvas);
                } else {
                    ImageReceiver imageReceiver = w0aVar.r;
                    if (imageReceiver != null) {
                        imageReceiver.h(canvas, w0aVar.f[this.L]);
                    }
                }
            }
            i++;
        }
    }

    @Override // fr3
    public final void d(Canvas canvas, float f) {
        Drawable drawable;
        int i;
        n1a n1aVar = this.U.m3;
        if (this.P != null) {
            canvas.save();
            canvas.translate(-this.O, 0.0f);
            int i2 = 0;
            float f2 = f;
            int i3 = 0;
            while (i3 < this.P.size()) {
                w0a w0aVar = (w0a) this.P.get(i3);
                if (!w0aVar.b) {
                    float scaleX = w0aVar.getScaleX();
                    int i4 = n1aVar.a0;
                    if (i4 == 13) {
                        scaleX *= 0.87f;
                    }
                    float f3 = w0aVar.O;
                    if (f3 != 0.0f || (w0aVar.T > 0.0f && i4 != 3 && i4 != 4)) {
                        scaleX *= ((1.0f - Math.max((i4 == 3 || i4 == 4) ? 1.0f : w0aVar.T * 0.7f, f3)) * 0.2f) + 0.8f;
                    }
                    int i5 = (n1aVar.R1 <= 0 || SystemClock.elapsedRealtime() - n1aVar.R1 >= n1aVar.e()) ? i2 : 1;
                    if (i5 == 0 || n1aVar.P1 < 0 || n1aVar.Q1 < 0 || n1aVar.R1 <= 0) {
                        f2 *= w0aVar.getAlpha();
                    } else {
                        int S = RecyclerView.S(w0aVar);
                        int i6 = n1aVar.P1;
                        int i7 = S - i6;
                        int i8 = n1aVar.Q1 - i6;
                        if (i7 >= 0 && i7 < i8) {
                            float a = ete.a((SystemClock.elapsedRealtime() - n1aVar.R1) / n1aVar.d(), 0.0f, 1.0f);
                            float f4 = i7;
                            float f5 = i8;
                            float f6 = f5 / 4.0f;
                            float s = hl.s(a, f4, f5, f6);
                            scaleX *= (this.T.getInterpolation(hl.s(a, f4, f5, f6)) * 0.5f) + 0.5f;
                            f2 = s;
                        }
                    }
                    Rect rect = hl.Q;
                    rect.set(w0aVar.getPaddingLeft() + ((int) w0aVar.getX()), w0aVar.getPaddingTop(), (w0aVar.getWidth() + ((int) w0aVar.getX())) - w0aVar.getPaddingRight(), w0aVar.getHeight() - w0aVar.getPaddingBottom());
                    if (!n1aVar.y1 && i5 == 0) {
                        rect.offset(i2, (int) w0aVar.getTranslationY());
                    }
                    if (w0aVar.a) {
                        drawable = n1aVar.getPremiumStar();
                        int i9 = n1aVar.a0;
                        if (i9 == 5 || i9 == 10 || i9 == 9 || i9 == 7) {
                            rect.inset((int) ((-rect.width()) * 0.15f), (int) ((-rect.height()) * 0.15f));
                        }
                        drawable.setBounds(rect);
                        drawable.setAlpha(jn7.d4);
                    } else if (w0aVar.s || w0aVar.R) {
                        ImageReceiver imageReceiver = w0aVar.h;
                        if (imageReceiver != null) {
                            imageReceiver.j0(rect);
                        }
                        drawable = null;
                    } else if ((w0aVar.e != null || n1aVar.a0 == 13) && !w0aVar.b && (drawable = w0aVar.F) != null) {
                        drawable.setAlpha(jn7.d4);
                        drawable.setBounds(rect);
                    }
                    PorterDuffColorFilter porterDuffColorFilter = n1aVar.l1;
                    if (porterDuffColorFilter != null) {
                        Drawable drawable2 = w0aVar.F;
                        if (drawable2 instanceof wl) {
                            drawable2.setColorFilter(porterDuffColorFilter);
                        }
                    }
                    float f7 = this.R;
                    w0aVar.P = f7;
                    w0aVar.Q = i3;
                    if (scaleX != 1.0f || f7 < 1.0f) {
                        canvas.save();
                        float f8 = w0aVar.T;
                        if (f8 > 1.0f && (i = n1aVar.a0) != 3 && i != 4 && i != 6) {
                            float R1 = hl.R1(1.0f, 0.85f, f8);
                            canvas.scale(R1, R1, rect.centerX(), rect.centerY());
                        }
                        int i10 = n1aVar.a0;
                        if (i10 == 6 || i10 == 13 || i10 == 14) {
                            canvas.scale(scaleX, scaleX, rect.centerX(), rect.centerY());
                        } else {
                            w0aVar.getHeight();
                            float f9 = this.R;
                            if (f9 < 1.0f) {
                                canvas.scale(1.0f, f9, 0.0f, 0.0f);
                                canvas.skew((1.0f - this.R) * (1.0f - ((i3 * 2.0f) / this.P.size())), 0.0f);
                            }
                        }
                        m(canvas, drawable, w0aVar, f2);
                        canvas.restore();
                    } else {
                        m(canvas, drawable, w0aVar, f2);
                    }
                }
                i3++;
                i2 = 0;
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
                this.U.m3.i0.invalidate();
                return;
            }
            ln5 ln5Var = ((w0a) arrayList.get(i)).f[this.L];
            if (ln5Var != null) {
                ln5Var.a();
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c9  */
    @Override // fr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(long j) {
        int i;
        int i2;
        float f;
        int i3;
        ln5[] ln5VarArr;
        float alpha;
        ImageReceiver imageReceiver;
        Rect rect;
        int i4;
        Drawable premiumStar;
        n1a n1aVar = this.U.m3;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.P.size()) {
            w0a w0aVar = (w0a) this.P.get(i6);
            boolean z = w0aVar.b;
            ln5[] ln5VarArr2 = w0aVar.f;
            if (!z) {
                if (w0aVar.a) {
                    premiumStar = n1aVar.getPremiumStar();
                    int i7 = n1aVar.a0;
                    float f2 = (i7 == 5 || i7 == 10 || i7 == 9 || i7 == 7) ? 1.3f : 1.0f;
                    float f3 = w0aVar.O;
                    if (f3 != 0.0f || w0aVar.T > 0.0f) {
                        f2 *= ((1.0f - Math.max(w0aVar.T * 0.8f, f3)) * 0.2f) + 0.8f;
                    }
                    if (premiumStar != null) {
                        premiumStar.setAlpha(jn7.d4);
                        int width = (w0aVar.getWidth() - w0aVar.getPaddingLeft()) - w0aVar.getPaddingRight();
                        int height = (w0aVar.getHeight() - w0aVar.getPaddingTop()) - w0aVar.getPaddingBottom();
                        Rect rect2 = hl.Q;
                        float f4 = width / 2.0f;
                        float f5 = height / 2.0f;
                        rect2.set((int) ((w0aVar.getWidth() / 2.0f) - ((w0aVar.getScaleX() * f4) * f2)), (int) ((w0aVar.getHeight() / 2.0f) - ((w0aVar.getScaleY() * f5) * f2)), (int) ((w0aVar.getScaleX() * f4 * f2) + (w0aVar.getWidth() / 2.0f)), (int) ((w0aVar.getScaleY() * f5 * f2) + (w0aVar.getHeight() / 2.0f)));
                        rect2.offset(w0aVar.getLeft() - this.O, i5);
                        Rect rect3 = w0aVar.G;
                        if (rect3 == null) {
                            rect3 = new Rect();
                            w0aVar.G = rect3;
                        }
                        rect3.set(rect2);
                        w0aVar.setDrawable(premiumStar);
                        arrayList.add(w0aVar);
                    }
                } else {
                    if (n1aVar.R1 <= 0) {
                        f = 4.0f;
                    } else if (SystemClock.elapsedRealtime() - n1aVar.R1 >= n1aVar.e()) {
                        f = 4.0f;
                    } else if (n1aVar.P1 < 0 || n1aVar.Q1 < 0 || n1aVar.R1 <= 0) {
                        i3 = i6;
                        f = 4.0f;
                        ln5VarArr = ln5VarArr2;
                        alpha = w0aVar.getAlpha() * 1.0f;
                        if (!w0aVar.s || w0aVar.R) {
                            imageReceiver = w0aVar.h;
                            imageReceiver.setAlpha(alpha);
                        } else {
                            if (w0aVar.e != null) {
                                Drawable drawable = w0aVar.F;
                                wl wlVar = drawable instanceof wl ? (wl) drawable : null;
                                if (wlVar != null && (imageReceiver = wlVar.k) != null) {
                                    wlVar.setAlpha((int) (alpha * 255.0f));
                                    w0aVar.setDrawable(wlVar);
                                    w0aVar.F.setColorFilter(n1aVar.l1);
                                }
                            }
                            i2 = i3;
                            i = 0;
                            i6 = i2 + 1;
                            i5 = i;
                        }
                        imageReceiver.S((n1aVar.M1 || (n1aVar.N1 && w0aVar.M)) ? false : true);
                        if (w0aVar.M) {
                            imageReceiver.q0(hl.L(f));
                        } else {
                            imageReceiver.q0(0);
                        }
                        int i8 = this.L;
                        ln5 Q = imageReceiver.Q(ln5VarArr[i8], i8);
                        ln5VarArr[i8] = Q;
                        Q.c = j;
                        w0aVar.r = imageReceiver;
                        if (imageReceiver.y() != null) {
                            w0aVar.r.y().Q(j);
                        }
                        if (w0aVar.r.m() != null) {
                            w0aVar.r.m().D(j);
                        }
                        w0aVar.getWidth();
                        w0aVar.getPaddingLeft();
                        w0aVar.getPaddingRight();
                        w0aVar.getHeight();
                        w0aVar.getPaddingTop();
                        w0aVar.getPaddingBottom();
                        rect = hl.Q;
                        rect.set(w0aVar.getPaddingLeft(), w0aVar.getPaddingTop(), w0aVar.getWidth() - w0aVar.getPaddingRight(), w0aVar.getHeight() - w0aVar.getPaddingBottom());
                        if (w0aVar.M && (i4 = n1aVar.a0) != 3 && i4 != 4) {
                            rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                        }
                        i = 0;
                        rect.offset((w0aVar.getLeft() + ((int) w0aVar.getTranslationX())) - this.O, 0);
                        ln5VarArr[i8].b(rect);
                        w0aVar.P = 1.0f;
                        i2 = i3;
                        w0aVar.Q = i2;
                        arrayList.add(w0aVar);
                        i6 = i2 + 1;
                        i5 = i;
                    } else {
                        int S = RecyclerView.S(w0aVar);
                        int i9 = n1aVar.P1;
                        int i10 = S - i9;
                        int i11 = n1aVar.Q1 - i9;
                        if (i10 < 0 || i10 >= i11) {
                            i3 = i6;
                            f = 4.0f;
                            ln5VarArr = ln5VarArr2;
                            alpha = 1.0f;
                        } else {
                            f = 4.0f;
                            ln5VarArr = ln5VarArr2;
                            i3 = i6;
                            float a = ete.a((SystemClock.elapsedRealtime() - n1aVar.R1) / n1aVar.d(), 0.0f, 1.0f);
                            float f6 = i10;
                            float f7 = i11;
                            float f8 = f7 / 4.0f;
                            float s = hl.s(a, f6, f7, f8);
                            this.T.getInterpolation(hl.s(a, f6, f7, f8));
                            alpha = s * 1.0f;
                        }
                        if (w0aVar.s) {
                        }
                        imageReceiver = w0aVar.h;
                        imageReceiver.setAlpha(alpha);
                        imageReceiver.S((n1aVar.M1 || (n1aVar.N1 && w0aVar.M)) ? false : true);
                        if (w0aVar.M) {
                        }
                        int i82 = this.L;
                        ln5 Q2 = imageReceiver.Q(ln5VarArr[i82], i82);
                        ln5VarArr[i82] = Q2;
                        Q2.c = j;
                        w0aVar.r = imageReceiver;
                        if (imageReceiver.y() != null) {
                        }
                        if (w0aVar.r.m() != null) {
                        }
                        w0aVar.getWidth();
                        w0aVar.getPaddingLeft();
                        w0aVar.getPaddingRight();
                        w0aVar.getHeight();
                        w0aVar.getPaddingTop();
                        w0aVar.getPaddingBottom();
                        rect = hl.Q;
                        rect.set(w0aVar.getPaddingLeft(), w0aVar.getPaddingTop(), w0aVar.getWidth() - w0aVar.getPaddingRight(), w0aVar.getHeight() - w0aVar.getPaddingBottom());
                        if (w0aVar.M) {
                            rect.set(Math.round(rect.centerX() - ((rect.width() / 2.0f) * 0.86f)), Math.round(rect.centerY() - ((rect.height() / 2.0f) * 0.86f)), Math.round(((rect.width() / 2.0f) * 0.86f) + rect.centerX()), Math.round(((rect.height() / 2.0f) * 0.86f) + rect.centerY()));
                        }
                        i = 0;
                        rect.offset((w0aVar.getLeft() + ((int) w0aVar.getTranslationX())) - this.O, 0);
                        ln5VarArr[i82].b(rect);
                        w0aVar.P = 1.0f;
                        i2 = i3;
                        w0aVar.Q = i2;
                        arrayList.add(w0aVar);
                        i6 = i2 + 1;
                        i5 = i;
                    }
                    i3 = i6;
                    ln5VarArr = ln5VarArr2;
                    alpha = w0aVar.getAlpha() * 1.0f;
                    if (w0aVar.s) {
                    }
                    imageReceiver = w0aVar.h;
                    imageReceiver.setAlpha(alpha);
                    imageReceiver.S((n1aVar.M1 || (n1aVar.N1 && w0aVar.M)) ? false : true);
                    if (w0aVar.M) {
                    }
                    int i822 = this.L;
                    ln5 Q22 = imageReceiver.Q(ln5VarArr[i822], i822);
                    ln5VarArr[i822] = Q22;
                    Q22.c = j;
                    w0aVar.r = imageReceiver;
                    if (imageReceiver.y() != null) {
                    }
                    if (w0aVar.r.m() != null) {
                    }
                    w0aVar.getWidth();
                    w0aVar.getPaddingLeft();
                    w0aVar.getPaddingRight();
                    w0aVar.getHeight();
                    w0aVar.getPaddingTop();
                    w0aVar.getPaddingBottom();
                    rect = hl.Q;
                    rect.set(w0aVar.getPaddingLeft(), w0aVar.getPaddingTop(), w0aVar.getWidth() - w0aVar.getPaddingRight(), w0aVar.getHeight() - w0aVar.getPaddingBottom());
                    if (w0aVar.M) {
                    }
                    i = 0;
                    rect.offset((w0aVar.getLeft() + ((int) w0aVar.getTranslationX())) - this.O, 0);
                    ln5VarArr[i822].b(rect);
                    w0aVar.P = 1.0f;
                    i2 = i3;
                    w0aVar.Q = i2;
                    arrayList.add(w0aVar);
                    i6 = i2 + 1;
                    i5 = i;
                }
            }
            i = i5;
            i2 = i6;
            i6 = i2 + 1;
            i5 = i;
        }
    }

    public final void m(Canvas canvas, Drawable drawable, w0a w0aVar, float f) {
        if (drawable != null) {
            drawable.setAlpha((int) (f * 255.0f));
            drawable.draw(canvas);
            drawable.setColorFilter(this.U.m3.l1);
        } else if ((w0aVar.s || w0aVar.R) && w0aVar.h != null) {
            canvas.save();
            ImageReceiver imageReceiver = w0aVar.h;
            canvas.clipRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), w0aVar.h.x());
            w0aVar.h.setAlpha(f);
            w0aVar.h.h(canvas, null);
            canvas.restore();
        }
    }
}
