package fi;

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
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public abstract class f4 extends View {
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

    public static void a(f4 f4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i7 = storyViews == null ? 0 : storyViews.views_count;
        if (i7 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new nq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(i7, 0));
            if (storyViews == null || storyViews.reactions_count <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (z10 ? "\n" : "  "));
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new nq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) org.telegram.messenger.g0.o0(storyViews.reactions_count, 0));
        }
    }

    public abstract void b(int i7);

    public final void c(int i7, boolean z10, boolean z11) {
        if ((this.L != i7 || z11) && getMeasuredHeight() > 0) {
            if (this.L != i7) {
                this.L = i7;
                b(i7);
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
            this.N = ofFloat;
            ofFloat.addUpdateListener(new d4(this, 0));
            this.N.addListener(new ai.k0(this, 14));
            this.N.setInterpolator(nr.f);
            this.N.setDuration(200L);
            this.N.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i7 = this.s;
        this.f = (-(measuredWidth - i7)) / 2.0f;
        this.h = ((getMeasuredWidth() - this.s) / 2.0f) + (((this.F.size() * (i7 + this.n)) - this.n) - getMeasuredWidth());
    }

    public e4 getCenteredImageReciever() {
        ArrayList arrayList = this.H;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((e4) arrayList.get(i7)).b == this.L) {
                return (e4) arrayList.get(i7);
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
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((e4) arrayList.get(i7)).a.R();
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
        e4 e4Var;
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
        } else if (this.M && (i7 = this.L) >= 0) {
            c(i7, true, true);
        }
        float f15 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i12 = -1;
        float f16 = 2.1474836E9f;
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
            float t6 = f19 < 0.0f ? com.google.android.gms.internal.vision.e2.t(1.0f, f11, this.s * 0.1f, f18) : com.google.android.gms.internal.vision.e2.z(1.0f, f11, this.s * 0.1f, f18);
            if (t6 > getMeasuredWidth() || this.s + t6 < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f16;
                i10 = i13;
                f14 = 2.0f;
            } else {
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList4.size()) {
                        e4Var = new e4(this);
                        e4Var.a(i14);
                        e4Var.b = i14;
                        break;
                    } else {
                        if (((e4) arrayList4.get(i15)).b == i14) {
                            e4Var = (e4) arrayList4.remove(i15);
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
                float y10 = org.telegram.messenger.f3.y(f21, f20, 2.0f, t6);
                float y11 = org.telegram.messenger.f3.y(f23, f22, 2.0f, this.y);
                if (this.E == 0.0f || i14 == (i11 = this.L)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f16;
                    i10 = i13;
                    e4Var.a.y0(y10, y11, f21, f23);
                } else {
                    f13 = f16;
                    i10 = i13;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    e4Var.a.y0(org.telegram.messenger.g0.T1(getMeasuredWidth() * (i14 - i11), y10, this.E), org.telegram.messenger.g0.T1(this.a, y11, this.E), org.telegram.messenger.g0.T1(this.b, f21, this.E), org.telegram.messenger.g0.T1(this.c, f23, this.E));
                }
                if (this.E == 1.0f || i14 != this.L) {
                    ImageReceiver imageReceiver = e4Var.a;
                    imageReceiver.h(canvas, null);
                    if (e4Var.c != null) {
                        int B = (int) com.google.android.gms.internal.vision.e2.B(f11, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(B);
                        gradientDrawable.setBounds((int) imageReceiver.L0, (int) (imageReceiver.A() - org.telegram.messenger.g0.L(24.0f)), (int) imageReceiver.y(), ((int) imageReceiver.A()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        f14 = 2.0f;
                        canvas.translate(imageReceiver.r() - (this.K / 2.0f), (imageReceiver.A() - org.telegram.messenger.g0.L(8.0f)) - e4Var.c.getHeight());
                        e4Var.d.setAlpha(B);
                        e4Var.c.draw(canvas);
                        canvas.restore();
                    } else {
                        f14 = 2.0f;
                    }
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = arrayList2;
                    f14 = 2.0f;
                }
                arrayList3.add(e4Var);
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
            ((e4) arrayList5.get(i16)).a.R();
        }
        arrayList5.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList = this.H;
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
            this.L = -1;
            c(this.x, false, false);
            this.x = -1;
        }
        if (this.K != L2) {
            this.K = L2;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((e4) arrayList.get(i12)).a(((e4) arrayList.get(i12)).b);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i7;
        this.J.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i7 = this.L) >= 0) {
            c(i7, true, true);
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
