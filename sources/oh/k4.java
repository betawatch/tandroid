package oh;

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
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class k4 extends View {
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public GradientDrawable E;
    public GestureDetector F;
    public float G;
    public int H;
    public boolean I;
    public ValueAnimator J;
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

    public static void a(k4 k4Var, SpannableStringBuilder spannableStringBuilder, TL_stories.StoryViews storyViews, boolean z4) {
        int i10 = storyViews == null ? 0 : storyViews.views_count;
        if (i10 > 0) {
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new oq(R.drawable.msg_views, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(i10, 0));
            if (storyViews == null || storyViews.reactions_count <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (z4 ? "\n" : "  "));
            spannableStringBuilder.append("d");
            spannableStringBuilder.setSpan(new oq(R.drawable.mini_like_filled, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            spannableStringBuilder.append(" ").append((CharSequence) AndroidUtilities.formatWholeNumber(storyViews.reactions_count, 0));
        }
    }

    public abstract void b(int i10);

    public final void c(int i10, boolean z4, boolean z10) {
        if ((this.H != i10 || z10) && getMeasuredHeight() > 0) {
            if (this.H != i10) {
                this.H = i10;
                b(i10);
            }
            this.d.abortAnimation();
            this.I = false;
            ValueAnimator valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
                this.J = null;
            }
            if (!z4) {
                this.e = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r6 + this.n) * i10);
                invalidate();
                return;
            }
            float f10 = (this.s / 2.0f) + ((-getMeasuredWidth()) / 2.0f) + ((r1 + this.n) * i10);
            float f11 = this.e;
            if (f10 == f11) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.J = ofFloat;
            ofFloat.addUpdateListener(new f2.d0(this, 3));
            this.J.addListener(new dg.l0(this, 22));
            this.J.setInterpolator(pr.f);
            this.J.setDuration(200L);
            this.J.start();
        }
    }

    public final void d() {
        int measuredWidth = getMeasuredWidth();
        int i10 = this.s;
        this.f = (-(measuredWidth - i10)) / 2.0f;
        this.h = ((getMeasuredWidth() - this.s) / 2.0f) + (((this.B.size() * (i10 + this.n)) - this.n) - getMeasuredWidth());
    }

    public j4 getCenteredImageReciever() {
        ArrayList arrayList = this.D;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((j4) arrayList.get(i10)).b == this.H) {
                return (j4) arrayList.get(i10);
            }
        }
        return null;
    }

    public int getClosestPosition() {
        return this.H;
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
        ArrayList arrayList = this.D;
        super.onDetachedFromWindow();
        this.v = false;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((j4) arrayList.get(i10)).a.onDetachedFromWindow();
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        ArrayList arrayList;
        float f12;
        float f13;
        int i11;
        j4 j4Var;
        ArrayList arrayList2;
        int i12;
        GradientDrawable gradientDrawable = this.E;
        ArrayList arrayList3 = this.D;
        ArrayList arrayList4 = this.C;
        super.onDraw(canvas);
        if (this.d.computeScrollOffset()) {
            this.e = r5.getCurrX();
            invalidate();
            this.I = true;
        } else if (this.I && (i10 = this.H) >= 0) {
            c(i10, true, true);
        }
        float f14 = 2.0f;
        float measuredWidth = getMeasuredWidth() / 2.0f;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
        arrayList3.clear();
        int i13 = -1;
        float f15 = 2.14748365E9f;
        int i14 = 0;
        int i15 = -1;
        while (i14 < this.B.size()) {
            float f16 = -this.e;
            float f17 = f16 + ((this.n + r13) * i14);
            float f18 = ((this.s / f14) + f17) - measuredWidth;
            float abs = Math.abs(f18);
            if (abs < this.s) {
                f10 = 1.0f - (Math.abs(f18) / this.s);
                f11 = (0.2f * f10) + 1.0f;
            } else {
                f10 = 0.0f;
                f11 = 1.0f;
            }
            if (i15 == i13 || abs < f15) {
                i15 = i14;
                f15 = abs;
            }
            float c3 = f18 < 0.0f ? yh.c(1.0f, f10, this.s * 0.1f, f17) : e2.c.w(1.0f, f10, this.s * 0.1f, f17);
            if (c3 > getMeasuredWidth() || this.s + c3 < 0.0f) {
                arrayList = arrayList4;
                f12 = measuredWidth;
                f13 = f15;
                i11 = i15;
            } else {
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList4.size()) {
                        j4Var = new j4(this);
                        j4Var.a(i14);
                        j4Var.b = i14;
                        break;
                    } else {
                        if (((j4) arrayList4.get(i16)).b == i14) {
                            j4Var = (j4) arrayList4.remove(i16);
                            break;
                        }
                        i16++;
                    }
                }
                float f19 = this.s;
                float f20 = f19 * f11;
                float f21 = this.r;
                float f22 = f11 * f21;
                f12 = measuredWidth;
                float a2 = org.telegram.messenger.y3.a(f20, f19, 2.0f, c3);
                float a10 = org.telegram.messenger.y3.a(f22, f21, 2.0f, this.x);
                if (this.y == 0.0f || i14 == (i12 = this.H)) {
                    arrayList2 = arrayList3;
                    arrayList = arrayList4;
                    f13 = f15;
                    i11 = i15;
                    j4Var.a.setImageCoords(a2, a10, f20, f22);
                } else {
                    f13 = f15;
                    i11 = i15;
                    arrayList = arrayList4;
                    arrayList2 = arrayList3;
                    j4Var.a.setImageCoords(AndroidUtilities.lerp(getMeasuredWidth() * (i14 - i12), a2, this.y), AndroidUtilities.lerp(this.a, a10, this.y), AndroidUtilities.lerp(this.b, f20, this.y), AndroidUtilities.lerp(this.c, f22, this.y));
                }
                if (this.y == 1.0f || i14 != this.H) {
                    ImageReceiver imageReceiver = j4Var.a;
                    imageReceiver.draw(canvas);
                    if (j4Var.c != null) {
                        int y10 = (int) e2.c.y(f10, 0.3f, 0.7f, 255.0f);
                        gradientDrawable.setAlpha(y10);
                        gradientDrawable.setBounds((int) imageReceiver.getImageX(), (int) (imageReceiver.getImageY2() - AndroidUtilities.dp(24.0f)), (int) imageReceiver.getImageX2(), ((int) imageReceiver.getImageY2()) + 2);
                        gradientDrawable.draw(canvas);
                        canvas.save();
                        canvas.translate(imageReceiver.getCenterX() - (this.G / 2.0f), (imageReceiver.getImageY2() - AndroidUtilities.dp(8.0f)) - j4Var.c.getHeight());
                        j4Var.d.setAlpha(y10);
                        j4Var.c.draw(canvas);
                        canvas.restore();
                    }
                    arrayList3 = arrayList2;
                } else {
                    arrayList3 = arrayList2;
                }
                arrayList3.add(j4Var);
            }
            i14++;
            f15 = f13;
            measuredWidth = f12;
            i15 = i11;
            arrayList4 = arrayList;
            f14 = 2.0f;
            i13 = -1;
        }
        ArrayList arrayList5 = arrayList4;
        if (this.J == null && this.H != i15) {
            this.H = i15;
            b(i15);
        }
        for (int i17 = 0; i17 < arrayList5.size(); i17++) {
            ((j4) arrayList5.get(i17)).a.onDetachedFromWindow();
        }
        arrayList5.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList = this.D;
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
            this.H = -1;
            c(this.w, false, false);
            this.w = -1;
        }
        if (this.G != dp2) {
            this.G = dp2;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((j4) arrayList.get(i13)).a(((j4) arrayList.get(i13)).b);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10;
        this.F.onTouchEvent(motionEvent);
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.d.isFinished() && (i10 = this.H) >= 0) {
            c(i10, true, true);
        }
        return true;
    }

    public void setProgressToOpen(float f10) {
        if (this.y == f10) {
            return;
        }
        this.y = f10;
        invalidate();
    }
}
