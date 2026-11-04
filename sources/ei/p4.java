package ei;

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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class p4 extends View {
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

    public static void a(p4 p4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i3 = storyViews == null ? 0 : storyViews.views_count;
        if (i3 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new wp(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(i3, 0));
            if (storyViews == null || storyViews.reactions_count <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (z10 ? "\n" : "  "));
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new wp(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(storyViews.reactions_count, 0));
        }
    }

    public abstract void b(int i3);

    public final void c(int i3, boolean z10, boolean z11) {
        if ((this.L != i3 || z11) && getMeasuredHeight() > 0) {
            if (this.L != i3) {
                this.L = i3;
                b(i3);
            }
            this.d.abortAnimation();
            this.M = false;
            ValueAnimator valueAnimator = this.N;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.N.cancel();
                this.N = null;
            }
            if (!z10) {
                this.e = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r6 + this.n) * i3);
                invalidate();
                return;
            }
            float f10 = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r1 + this.n) * i3);
            float f11 = this.e;
            if (f10 == f11) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.N = ofFloat;
            ofFloat.addUpdateListener(new n4(this, 0));
            this.N.addListener(new ai.e1(this, 14));
            this.N.setInterpolator(xq.f);
            this.N.setDuration(200L);
            this.N.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i3 = this.s;
        this.f = (-(measuredWidth - i3)) / 2.0f;
        this.h = ((getMeasuredWidth() - this.s) / 2.0f) + (((this.F.size() * (i3 + this.n)) - this.n) - getMeasuredWidth());
    }

    public o4 getCenteredImageReciever() {
        ArrayList arrayList = this.H;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((o4) arrayList.get(i3)).b == this.L) {
                return (o4) arrayList.get(i3);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.L;
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
        ArrayList arrayList = this.H;
        super.onDetachedFromWindow();
        this.w = false;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((o4) arrayList.get(i3)).a.R();
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i10;
        float f14;
        o4 o4Var;
        ArrayList arrayList2;
        int i11;
        GradientDrawable gradientDrawable = this.I;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = this.G;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.e = r5.getCurrX();
            invalidate();
            this.M = true;
        } else if (this.M && (i3 = this.L) >= 0) {
            c(i3, true, true);
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
        while (i14 < this.F.size()) {
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
            float D = f19 < 0.0f ? a1.g.D(1.0f, f11, this.s * 0.1f, f18) : com.google.android.recaptcha.internal.a.y(1.0f, f11, this.s * 0.1f, f18);
            if (D > getMeasuredWidth() || this.s + D < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f16;
                i10 = i13;
                f14 = 2.0f;
            } else {
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList4.size()) {
                        o4Var = new o4(this);
                        o4Var.a(i14);
                        o4Var.b = i14;
                        break;
                    } else {
                        if (((o4) arrayList4.get(i15)).b == i14) {
                            o4Var = (o4) arrayList4.remove(i15);
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
                float y9 = org.telegram.messenger.k5.y(f21, f20, 2.0f, D);
                float y10 = org.telegram.messenger.k5.y(f23, f22, 2.0f, this.y);
                if (this.E == 0.0f || i14 == (i11 = this.L)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f16;
                    i10 = i13;
                    o4Var.a.y0(y9, y10, f21, f23);
                } else {
                    f13 = f16;
                    i10 = i13;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    o4Var.a.y0(org.telegram.messenger.g0.T1(getMeasuredWidth() * (i14 - i11), y9, this.E), org.telegram.messenger.g0.T1(this.a, y10, this.E), org.telegram.messenger.g0.T1(this.b, f21, this.E), org.telegram.messenger.g0.T1(this.c, f23, this.E));
                }
                if (this.E == 1.0f || i14 != this.L) {
                    ImageReceiver imageReceiver = o4Var.a;
                    imageReceiver.h(canvas, null);
                    if (o4Var.c != null) {
                        int A = (int) com.google.android.recaptcha.internal.a.A(f11, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(A);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.A() - org.telegram.messenger.g0.L(24.0f)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        f14 = 2.0f;
                        canvas.translate(imageReceiver.r() - (this.K / 2.0f), (imageReceiver.A() - org.telegram.messenger.g0.L(8.0f)) - o4Var.c.getHeight());
                        o4Var.d.setAlpha(A);
                        o4Var.c.draw(canvas);
                        canvas.restore();
                    } else {
                        f14 = 2.0f;
                    }
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = arrayList2;
                    f14 = 2.0f;
                }
                arrayList3.add(o4Var);
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
        if (this.N == null && this.L != i13) {
            this.L = i13;
            b(i13);
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            ((o4) arrayList5.get(i16)).a.R();
        }
        arrayList5.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        ArrayList arrayList = this.H;
        super.onMeasure(i3, i10);
        this.n = org.telegram.messenger.g0.L(8.0f);
        int L = (int) (org.telegram.messenger.g0.L(180.0f) / 1.2f);
        this.r = L;
        int i11 = (int) ((L / 16.0f) * 9.0f);
        this.s = i11;
        float L2 = i11 - org.telegram.messenger.g0.L(8.0f);
        this.y = ((org.telegram.messenger.g0.L(180.0f) - this.r) / 2.0f) + org.telegram.messenger.g0.L(20.0f);
        d();
        if (this.x >= 0 && getMeasuredWidth() > 0) {
            this.L = -1;
            c(this.x, false, false);
            this.x = -1;
        }
        if (this.K != L2) {
            this.K = L2;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((o4) arrayList.get(i12)).a(((o4) arrayList.get(i12)).b);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i3;
        this.J.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i3 = this.L) >= 0) {
            c(i3, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f10) {
        if (this.E == f10) {
            return;
        }
        this.E = f10;
        invalidate();
    }
}
