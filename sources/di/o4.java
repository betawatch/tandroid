package di;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class o4 extends View {
    public float D;
    public ArrayList E;
    public ArrayList F;
    public ArrayList G;
    public GradientDrawable H;
    public GestureDetector I;
    public float J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public int a;
    public int b;
    public int c;
    public Scroller d;
    public float e;
    public float f;
    public float h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public float y;

    public static void a(o4 o4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z9) {
        int i7 = storyViews == null ? 0 : storyViews.views_count;
        if (i7 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new wp(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(i7, 0));
            if (storyViews == null || storyViews.reactions_count <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (z9 ? "\n" : "  "));
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new wp(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(storyViews.reactions_count, 0));
        }
    }

    public abstract void b(int i7);

    public final void c(int i7, boolean z9, boolean z10) {
        if ((this.K != i7 || z10) && getMeasuredHeight() > 0) {
            if (this.K != i7) {
                this.K = i7;
                b(i7);
            }
            this.d.abortAnimation();
            this.L = false;
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.M.cancel();
                this.M = null;
            }
            if (!z9) {
                this.e = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r6 + this.n) * i7);
                invalidate();
                return;
            }
            float f10 = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r1 + this.n) * i7);
            float f11 = this.e;
            if (f10 == f11) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.M = ofFloat;
            ofFloat.addUpdateListener(new m4(this, 0));
            this.M.addListener(new bi.t5(this, 12));
            this.M.setInterpolator(xq.f);
            this.M.setDuration(200L);
            this.M.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i7 = this.s;
        this.f = (-(measuredWidth - i7)) / 2.0f;
        this.h = ((getMeasuredWidth() - this.s) / 2.0f) + (((this.E.size() * (i7 + this.n)) - this.n) - getMeasuredWidth());
    }

    public n4 getCenteredImageReciever() {
        ArrayList arrayList = this.G;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((n4) arrayList.get(i7)).b == this.K) {
                return (n4) arrayList.get(i7);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.K;
    }

    public float getFinalHeight() {
        return org.telegram.messenger.g0.L(180.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.G;
        super.onDetachedFromWindow();
        this.w = false;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((n4) arrayList.get(i7)).a.R();
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i10;
        float f14;
        n4 n4Var;
        ArrayList arrayList2;
        int i11;
        GradientDrawable gradientDrawable = this.H;
        ArrayList arrayList3 = this.G;
        ArrayList arrayList4 = this.F;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.e = r5.getCurrX();
            invalidate();
            this.L = true;
        } else if (this.L && (i7 = this.K) >= 0) {
            c(i7, true, true);
        }
        float f15 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i12 = -1;
        float f16 = 2.14748365E9f;
        int i13 = -1;
        int i14 = 0;
        while (i14 < this.E.size()) {
            float f17 = -this.e;
            float f18 = f17 + ((this.n + r13) * i14);
            float f19 = ((this.s / f15) + f18) - measuredWidth;
            float abs = Math.abs(f19);
            if (abs < this.s) {
                f11 = 1.0f - (Math.abs(f19) / this.s);
                f10 = (0.2f * f11) + 1.0f;
            } else {
                f10 = 1.0f;
                f11 = 0.0f;
            }
            if (i13 == i12 || abs < f16) {
                i13 = i14;
                f16 = abs;
            }
            float v = f19 < 0.0f ? com.google.android.recaptcha.internal.a.v(1.0f, f11, this.s * 0.1f, f18) : com.google.android.recaptcha.internal.a.z(1.0f, f11, this.s * 0.1f, f18);
            if (v > getMeasuredWidth() || this.s + v < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f16;
                i10 = i13;
                f14 = 2.0f;
            } else {
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList4.size()) {
                        n4Var = new n4(this);
                        n4Var.a(i14);
                        n4Var.b = i14;
                        break;
                    } else {
                        if (((n4) arrayList4.get(i15)).b == i14) {
                            n4Var = (n4) arrayList4.remove(i15);
                            break;
                        }
                        i15++;
                    }
                }
                float f20 = this.s;
                float f21 = f20 * f10;
                float f22 = this.r;
                float f23 = f10 * f22;
                f12 = measuredWidth;
                float y10 = org.telegram.messenger.k5.y(f21, f20, 2.0f, v);
                float y11 = org.telegram.messenger.k5.y(f23, f22, 2.0f, this.y);
                if (this.D == 0.0f || i14 == (i11 = this.K)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f16;
                    i10 = i13;
                    n4Var.a.y0(y10, y11, f21, f23);
                } else {
                    f13 = f16;
                    i10 = i13;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    n4Var.a.y0(org.telegram.messenger.g0.T1(getMeasuredWidth() * (i14 - i11), y10, this.D), org.telegram.messenger.g0.T1(this.a, y11, this.D), org.telegram.messenger.g0.T1(this.b, f21, this.D), org.telegram.messenger.g0.T1(this.c, f23, this.D));
                }
                if (this.D == 1.0f || i14 != this.K) {
                    ImageReceiver imageReceiver = n4Var.a;
                    imageReceiver.h(canvas, null);
                    if (n4Var.c != null) {
                        int B = (int) com.google.android.recaptcha.internal.a.B(f11, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(B);
                        gradientDrawable.setBounds((int) imageReceiver.K0, (int) (imageReceiver.A() - org.telegram.messenger.g0.L(24.0f)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        f14 = 2.0f;
                        canvas.translate(imageReceiver.r() - (this.J / 2.0f), (imageReceiver.A() - org.telegram.messenger.g0.L(8.0f)) - n4Var.c.getHeight());
                        n4Var.d.setAlpha(B);
                        n4Var.c.draw(canvas);
                        canvas.restore();
                    } else {
                        f14 = 2.0f;
                    }
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = arrayList2;
                    f14 = 2.0f;
                }
                arrayList3.add(n4Var);
            }
            i14++;
            f16 = f13;
            f15 = f14;
            measuredWidth = f12;
            i13 = i10;
            arrayList4 = arrayList;
            i12 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.M == null && this.K != i13) {
            this.K = i13;
            b(i13);
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            ((n4) arrayList5.get(i16)).a.R();
        }
        arrayList5.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList = this.G;
        super.onMeasure(i7, i10);
        this.n = org.telegram.messenger.g0.L(8.0f);
        int L = (int) (org.telegram.messenger.g0.L(180.0f) / 1.2f);
        this.r = L;
        int i11 = (int) ((L / 16.0f) * 9.0f);
        this.s = i11;
        float L2 = i11 - org.telegram.messenger.g0.L(8.0f);
        this.y = ((org.telegram.messenger.g0.L(180.0f) - this.r) / 2.0f) + org.telegram.messenger.g0.L(20.0f);
        d();
        if (this.x >= 0 && getMeasuredWidth() > 0) {
            this.K = -1;
            c(this.x, false, false);
            this.x = -1;
        }
        if (this.J != L2) {
            this.J = L2;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((n4) arrayList.get(i12)).a(((n4) arrayList.get(i12)).b);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        this.I.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i7 = this.K) >= 0) {
            c(i7, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f10) {
        if (this.D == f10) {
            return;
        }
        this.D = f10;
        invalidate();
    }
}
