package lh;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jr;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class i4 extends View {
    public ArrayList A;
    public ArrayList B;
    public ArrayList C;
    public GradientDrawable D;
    public GestureDetector E;
    public float F;
    public int G;
    public boolean H;
    public ValueAnimator I;
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
    public boolean v;
    public int w;
    public float x;
    public float y;

    public static void a(i4 i4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z10) {
        int i10 = storyViews == null ? 0 : storyViews.views_count;
        if (i10 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new iq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i10, 0));
            if (storyViews == null || storyViews.reactions_count <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (z10 ? "\n" : "  "));
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new iq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(storyViews.reactions_count, 0));
        }
    }

    public abstract void b(int i10);

    public final void c(int i10, boolean z10, boolean z11) {
        if ((this.G != i10 || z11) && getMeasuredHeight() > 0) {
            if (this.G != i10) {
                this.G = i10;
                b(i10);
            }
            this.d.abortAnimation();
            this.H = false;
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
                this.I = null;
            }
            if (!z10) {
                this.e = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r6 + this.n) * i10);
                invalidate();
                return;
            }
            float f9 = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r1 + this.n) * i10);
            float f10 = this.e;
            if (f9 == f10) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new cg.c1(this, 3));
            this.I.addListener(new ag.m0(this, 21));
            this.I.setInterpolator(jr.f);
            this.I.setDuration(200L);
            this.I.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.s;
        this.f = (-(measuredWidth - i10)) / 2.0f;
        this.h = ((getMeasuredWidth() - this.s) / 2.0f) + (((this.A.size() * (i10 + this.n)) - this.n) - getMeasuredWidth());
    }

    public h4 getCenteredImageReciever() {
        ArrayList arrayList = this.C;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((h4) arrayList.get(i10)).b == this.G) {
                return (h4) arrayList.get(i10);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.G;
    }

    public float getFinalHeight() {
        return AndroidUtilities.dp(180.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList = this.C;
        super.onDetachedFromWindow();
        this.v = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((h4) arrayList.get(i10)).a.onDetachedFromWindow();
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f9;
        float f10;
        ArrayList arrayList;
        float f11;
        float f12;
        int i11;
        h4 h4Var;
        ArrayList arrayList2;
        int i12;
        GradientDrawable gradientDrawable = this.D;
        ArrayList arrayList3 = this.C;
        ArrayList arrayList4 = this.B;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.e = r5.getCurrX();
            invalidate();
            this.H = true;
        } else if (this.H && (i10 = this.G) >= 0) {
            c(i10, true, true);
        }
        float f13 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i13 = -1;
        float f14 = 2.14748365E9f;
        int i14 = 0;
        int i15 = -1;
        while (i14 < this.A.size()) {
            float f15 = -this.e;
            float f16 = f15 + ((this.n + r13) * i14);
            float f17 = ((this.s / f13) + f16) - measuredWidth;
            float abs = Math.abs(f17);
            if (abs < this.s) {
                f9 = 1.0f - (Math.abs(f17) / this.s);
                f10 = (0.2f * f9) + 1.0f;
            } else {
                f9 = 0.0f;
                f10 = 1.0f;
            }
            if (i15 == i13 || abs < f14) {
                i15 = i14;
                f14 = abs;
            }
            float b10 = f17 < 0.0f ? th.b(1.0f, f9, this.s * 0.1f, f16) : com.google.android.recaptcha.internal.a.z(1.0f, f9, this.s * 0.1f, f16);
            if (b10 > getMeasuredWidth() || this.s + b10 < 0.0f) {
                arrayList = arrayList4;
                f11 = measuredWidth;
                f12 = f14;
                i11 = i15;
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList4.size()) {
                        h4Var = new h4(this);
                        h4Var.a(i14);
                        h4Var.b = i14;
                        break;
                    } else {
                        if (((h4) arrayList4.get(i16)).b == i14) {
                            h4Var = (h4) arrayList4.remove(i16);
                            break;
                        }
                        i16++;
                    }
                }
                float f18 = this.s;
                float f19 = f18 * f10;
                float f20 = this.r;
                float f21 = f10 * f20;
                f11 = measuredWidth;
                float a2 = org.telegram.messenger.x3.a(f19, f18, 2.0f, b10);
                float a10 = org.telegram.messenger.x3.a(f21, f20, 2.0f, this.x);
                if (this.y == 0.0f || i14 == (i12 = this.G)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f12 = f14;
                    i11 = i15;
                    h4Var.a.setImageCoords(a2, a10, f19, f21);
                } else {
                    f12 = f14;
                    i11 = i15;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    h4Var.a.setImageCoords(AndroidUtilities.lerp(getMeasuredWidth() * (i14 - i12), a2, this.y), AndroidUtilities.lerp(this.a, a10, this.y), AndroidUtilities.lerp(this.b, f19, this.y), AndroidUtilities.lerp(this.c, f21, this.y));
                }
                if (this.y == 1.0f || i14 != this.G) {
                    ImageReceiver imageReceiver = h4Var.a;
                    imageReceiver.draw(canvas);
                    if (h4Var.c != null) {
                        int B = (int) com.google.android.recaptcha.internal.a.B(f9, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(B);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageReceiver.getCenterX() - (this.F / 2.0f), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - h4Var.c.getHeight());
                        h4Var.d.setAlpha(B);
                        h4Var.c.draw(canvas);
                        canvas.restore();
                    }
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = arrayList2;
                }
                arrayList3.add(h4Var);
            }
            i14++;
            f14 = f12;
            measuredWidth = f11;
            i15 = i11;
            arrayList4 = arrayList;
            f13 = 2.0f;
            i13 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.I == null && this.G != i15) {
            this.G = i15;
            b(i15);
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            ((h4) arrayList5.get(i17)).a.onDetachedFromWindow();
        }
        arrayList5.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.C;
        super.onMeasure(i10, i11);
        this.n = AndroidUtilities.dp(8.0f);
        int dp = (int) (AndroidUtilities.dp(180.0f) / 1.2f);
        this.r = dp;
        int i12 = (int) ((dp / 16.0f) * 9.0f);
        this.s = i12;
        float dp2 = i12 - AndroidUtilities.dp(8.0f);
        this.x = ((AndroidUtilities.dp(180.0f) - this.r) / 2.0f) + AndroidUtilities.dp(20.0f);
        d();
        if (this.w >= 0 && getMeasuredWidth() > 0) {
            this.G = -1;
            c(this.w, false, false);
            this.w = -1;
        }
        if (this.F != dp2) {
            this.F = dp2;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((h4) arrayList.get(i13)).a(((h4) arrayList.get(i13)).b);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        this.E.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i10 = this.G) >= 0) {
            c(i10, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f9) {
        if (this.y == f9) {
            return;
        }
        this.y = f9;
        invalidate();
    }
}
