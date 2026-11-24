// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cw1 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cw1(ChatActivityEnterView chatActivityEnterView, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = chatActivityEnterView;
    }

    public final /* synthetic */ Boolean a(Canvas canvas, View view, long j) {
        return Boolean.valueOf(super.drawChild(canvas, view, j));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        RectF rectF;
        il0 il0Var;
        switch (this.a) {
            case 3:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (chatActivityEnterView.K1) {
                    float f3 = chatActivityEnterView.P1;
                    float f4 = 0.0f;
                    if (f3 > 0.0f) {
                        Paint paint = chatActivityEnterView.O1;
                        int[] iArr = chatActivityEnterView.S1;
                        int[] iArr2 = chatActivityEnterView.R1;
                        float f5 = 1.0f;
                        float i = Utilities.i(f3 * 1.25f, 1.0f, 0.0f);
                        float i2 = Utilities.i((f3 - 0.18f) * 1.25f, 1.0f, 0.0f);
                        float height = getHeight();
                        float min = Math.min(height - gl.L(44.0f), chatActivityEnterView.Z0(this));
                        float width = getWidth() - gl.L(2.5f);
                        ow1 ow1Var = chatActivityEnterView.K0;
                        int i3 = 0;
                        if (ow1Var == null || ow1Var.getVisibility() != 0) {
                            f = 44.0f;
                        } else {
                            f = 44.0f;
                            RectF rectF2 = gl.P;
                            ow1Var.e(rectF2);
                            ow1Var.getLocationInWindow(iArr2);
                            getLocationInWindow(iArr);
                            float f6 = (iArr2[0] - iArr[0]) + rectF2.left;
                            if (f6 > gl.L(120.0f)) {
                                width = f6 - gl.L(6.0f);
                            }
                        }
                        float f7 = 22.0f;
                        if (chatActivityEnterView.M1 == null && chatActivityEnterView.L1 != null) {
                            j92 C0 = chatActivityEnterView.C0();
                            al0 al0Var = (C0 == null || (il0Var = C0.n) == null) ? null : il0Var.w;
                            if (al0Var != null) {
                                il0 c = chatActivityEnterView.L1.c(this, al0Var, false);
                                chatActivityEnterView.M1 = c;
                                c.r(gl.L(22.0f));
                                il0 c2 = chatActivityEnterView.L1.c(this, al0Var, false);
                                chatActivityEnterView.N1 = c2;
                                c2.r(gl.L(22.0f));
                            }
                        }
                        while (i3 < 2) {
                            float f8 = i3 == 0 ? i : i2;
                            if (f8 <= f4) {
                                f2 = f7;
                            } else {
                                if (i3 == 0) {
                                    rectF = gl.P;
                                    f2 = f7;
                                    rectF.set(f4, height - gl.L(f), gl.L(f), height);
                                } else {
                                    f2 = f7;
                                    rectF = gl.P;
                                    rectF.set(gl.L(48.0f), min, width, height);
                                }
                                float R1 = gl.R1(0.92f, f5, f8);
                                canvas.save();
                                canvas.scale(R1, R1, rectF.centerX(), height - (gl.L(f) / 2.0f));
                                il0 il0Var2 = i3 == 0 ? chatActivityEnterView.M1 : chatActivityEnterView.N1;
                                if (il0Var2 != null) {
                                    il0Var2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                                    il0Var2.setAlpha((int) (f8 * 255.0f));
                                    il0Var2.draw(canvas);
                                } else {
                                    paint.setColor(bkb.p1(f8, chatActivityEnterView.F0(bkb.Ie)));
                                    canvas.drawRoundRect(rectF, gl.L(f2), gl.L(f2), paint);
                                }
                                canvas.restore();
                            }
                            i3++;
                            f7 = f2;
                            f4 = 0.0f;
                            f5 = 1.0f;
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                if (motionEvent.getAction() != 10) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    for (int i = 0; i < getChildCount(); i++) {
                        View childAt = getChildAt(i);
                        if (childAt.getVisibility() == 0 && childAt.getAlpha() > 0.0f) {
                            float x2 = childAt.getX() + childAt.getWidth();
                            if (x >= (childAt == this.b.K0 ? x2 - r6.l() : childAt.getX()) && x < x2 && y >= childAt.getY() && y < childAt.getY() + childAt.getHeight()) {
                            }
                        }
                    }
                    return false;
                }
                return super.dispatchHoverEvent(motionEvent);
            default:
                return super.dispatchHoverEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                qu1 qu1Var = chatActivityEnterView.l0;
                return (qu1Var == null || qu1Var.getVisibility() != 0) ? super.dispatchTouchEvent(motionEvent) : chatActivityEnterView.l0.dispatchTouchEvent(motionEvent);
            case 1:
            default:
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!chatActivityEnterView.K || chatActivityEnterView.q7 == 2) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(final Canvas canvas, final View view, final long j) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 1:
                if (view != null && view == chatActivityEnterView.F0) {
                    return chatActivityEnterView.v0(canvas, new h8c() { // from class: dw1
                        @Override // h8c
                        public final Object run() {
                            return cw1.this.a(canvas, view, j);
                        }
                    });
                }
                if (chatActivityEnterView.Y5 && view == chatActivityEnterView.f1) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            case 2:
                if (view == chatActivityEnterView.K0 && chatActivityEnterView.i0) {
                    return true;
                }
                return super.drawChild(canvas, view, j);
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        switch (this.a) {
            case 3:
                return !this.b.K1 && super.hasOverlappingRendering();
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                HashMap hashMap = this.b.C0;
                if (!hashMap.isEmpty()) {
                    for (int i5 = 0; i5 < getChildCount(); i5++) {
                        View childAt = getChildAt(i5);
                        Float f = (Float) hashMap.get(childAt);
                        if (f != null) {
                            childAt.setTranslationX(f.floatValue() - childAt.getLeft());
                            childAt.animate().translationX(0.0f).setDuration(150L).setInterpolator(s33.f).start();
                        }
                    }
                    hashMap.clear();
                    break;
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        s33 s33Var;
        switch (this.a) {
            case 1:
                super.onMeasure(i, i2);
                int max = Math.max(gl.L(44.0f), getMeasuredHeight());
                ChatActivityEnterView chatActivityEnterView = this.b;
                y74 y74Var = chatActivityEnterView.f7;
                float f = y74Var.f;
                if (f > 0.0f) {
                    if (y74Var.h) {
                        f = y74Var.g;
                    }
                    float f2 = max;
                    if (f != f2) {
                        y74Var.d = chatActivityEnterView.D0();
                        y74Var.e = (byte) 0;
                        s33 s33Var2 = la2.V;
                        if (chatActivityEnterView.G1 > 0 && SystemClock.uptimeMillis() < chatActivityEnterView.G1 && (s33Var = chatActivityEnterView.H1) != null) {
                            s33Var2 = s33Var;
                        }
                        y74Var.c = s33Var2;
                    }
                    y74Var.a(f2);
                } else {
                    y74Var.c(max);
                }
                chatActivityEnterView.Q();
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i, i2, i3, i4);
                setPivotX(i - gl.L(22.0f));
                setPivotY(i2 - gl.L(22.0f));
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                ChatActivityEnterView chatActivityEnterView = this.b;
                if (!chatActivityEnterView.K || chatActivityEnterView.q7 == 2) {
                    return false;
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 3:
                super.setVisibility(i);
                this.b.v2(true);
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }
}
