// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class nz9 extends View {
    public float E;
    public ArrayList F;
    public ArrayList G;
    public ArrayList H;
    public GradientDrawable I;
    public GestureDetector J;
    public float K;
    public int L;
    public boolean M;
    public ValueAnimator N;
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

    public static void a(SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z) {
        int i = storyViews == null ? 0 : storyViews.views_count;
        if (i > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new cm2(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) gl.o0(i, 0));
            if (storyViews == null || storyViews.reactions_count <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (z ? "\n" : "  "));
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new cm2(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) gl.o0(storyViews.reactions_count, 0));
        }
    }

    public abstract void b(int i);

    public final void c(int i, boolean z, boolean z2) {
        if ((this.L != i || z2) && getMeasuredHeight() > 0) {
            if (this.L != i) {
                this.L = i;
                b(i);
            }
            this.d.abortAnimation();
            this.M = false;
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.N.cancel();
                this.N = null;
            }
            if (!z) {
                this.e = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r6 + this.n) * i);
                invalidate();
                return;
            }
            float f = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r1 + this.n) * i);
            float f2 = this.e;
            if (f == f2) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new ae0(this, (byte) 12));
            this.N.addListener(new ng9((Object) this, (byte) 9));
            this.N.setInterpolator(s33.f);
            this.N.setDuration(200L);
            this.N.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i = this.s;
        this.f = (-(measuredWidth - i)) / 2.0f;
        this.h = ((getMeasuredWidth() - this.s) / 2.0f) + (((this.F.size() * (i + this.n)) - this.n) - getMeasuredWidth());
    }

    public mz9 getCenteredImageReciever() {
        ArrayList arrayList = this.H;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((mz9) arrayList.get(i)).b == this.L) {
                return (mz9) arrayList.get(i);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.L;
    }

    public float getFinalHeight() {
        return gl.L(180.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.H;
        super.onDetachedFromWindow();
        this.w = false;
        for (int i = 0; i < arrayList.size(); i++) {
            ((mz9) arrayList.get(i)).a.K();
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        float f4;
        float f5;
        int i2;
        float f6;
        mz9 mz9Var;
        ArrayList arrayList2;
        int i3;
        GradientDrawable gradientDrawable = this.I;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.G;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.e = r5.getCurrX();
            invalidate();
            this.M = true;
        } else if (this.M && (i = this.L) >= 0) {
            c(i, true, true);
        }
        float f7 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i4 = -1;
        float f8 = 2.1474836E9f;
        int i5 = -1;
        int i6 = 0;
        while (i6 < this.F.size()) {
            float f9 = -this.e;
            float f10 = f9 + ((this.n + r13) * i6);
            float f11 = ((this.s / f7) + f10) - measuredWidth;
            float abs = Math.abs(f11);
            int i7 = this.s;
            if (abs < i7) {
                float abs2 = Math.abs(f11);
                i7 = this.s;
                f = 1.0f;
                f2 = 1.0f - (abs2 / i7);
                f3 = (0.2f * f2) + 1.0f;
            } else {
                f = 1.0f;
                f2 = 0.0f;
                f3 = 1.0f;
            }
            if (i5 == i4 || abs < f8) {
                i5 = i6;
                f8 = abs;
            }
            float B = f11 < 0.0f ? ls6.B(f, f2, i7 * 0.1f, f10) : tb4.A(f, f2, i7 * 0.1f, f10);
            if (B > getMeasuredWidth() || this.s + B < 0.0f) {
                arrayList = arrayList4;
                f4 = measuredWidth;
                f5 = f8;
                i2 = i5;
                f6 = 2.0f;
            } else {
                int i8 = 0;
                while (true) {
                    if (i8 >= arrayList4.size()) {
                        mz9Var = new mz9(this);
                        mz9Var.a(i6);
                        mz9Var.b = i6;
                        break;
                    } else {
                        if (((mz9) arrayList4.get(i8)).b == i6) {
                            mz9Var = (mz9) arrayList4.remove(i8);
                            break;
                        }
                        i8++;
                    }
                }
                float f12 = this.s;
                float f13 = f12 * f3;
                float f14 = this.r;
                float f15 = f3 * f14;
                f4 = measuredWidth;
                float x = tb4.x(f13, f12, 2.0f, B);
                float x2 = tb4.x(f15, f14, 2.0f, this.y);
                if (this.E == 0.0f || i6 == (i3 = this.L)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f5 = f8;
                    i2 = i5;
                    mz9Var.a.i0(x, x2, f13, f15);
                } else {
                    f5 = f8;
                    i2 = i5;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    mz9Var.a.i0(gl.R1(getMeasuredWidth() * (i6 - i3), x, this.E), gl.R1(this.a, x2, this.E), gl.R1(this.b, f13, this.E), gl.R1(this.c, f15, this.E));
                }
                if (this.E == 1.0f || i6 != this.L) {
                    ImageReceiver imageReceiver = mz9Var.a;
                    imageReceiver.h(canvas, null);
                    if (mz9Var.c != null) {
                        int z = (int) yjb.z(f2, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(z);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.x() - gl.L(24.0f)), (int) imageReceiver.w(), ((int) imageReceiver.x()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        f6 = 2.0f;
                        canvas.translate(imageReceiver.r() - (this.K / 2.0f), (imageReceiver.x() - gl.L(8.0f)) - mz9Var.c.getHeight());
                        mz9Var.d.setAlpha(z);
                        mz9Var.c.draw(canvas);
                        canvas.restore();
                    } else {
                        f6 = 2.0f;
                    }
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = arrayList2;
                    f6 = 2.0f;
                }
                arrayList3.add(mz9Var);
            }
            i6++;
            f8 = f5;
            f7 = f6;
            measuredWidth = f4;
            i5 = i2;
            arrayList4 = arrayList;
            i4 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.N == null && this.L != i5) {
            this.L = i5;
            b(i5);
        }
        for (int i9 = 0; i9 < arrayList5.size(); i9++) {
            ((mz9) arrayList5.get(i9)).a.K();
        }
        arrayList5.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ArrayList arrayList = this.H;
        super.onMeasure(i, i2);
        this.n = gl.L(8.0f);
        int L = (int) (gl.L(180.0f) / 1.2f);
        this.r = L;
        int i3 = (int) ((L / 16.0f) * 9.0f);
        this.s = i3;
        float L2 = i3 - gl.L(8.0f);
        this.y = ((gl.L(180.0f) - this.r) / 2.0f) + gl.L(20.0f);
        d();
        if (this.x >= 0 && getMeasuredWidth() > 0) {
            this.L = -1;
            c(this.x, false, false);
            this.x = -1;
        }
        if (this.K != L2) {
            this.K = L2;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ((mz9) arrayList.get(i4)).a(((mz9) arrayList.get(i4)).b);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        this.J.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i = this.L) >= 0) {
            c(i, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f) {
        if (this.E == f) {
            return;
        }
        this.E = f;
        invalidate();
    }
}
