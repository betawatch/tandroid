// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ml8 extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Paint c;
    public final /* synthetic */ PremiumPreviewFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml8(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.c = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        ?? r11;
        Canvas canvas2;
        wk5 wk5Var;
        wk5 wk5Var2;
        a aVar5;
        a aVar6;
        a aVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z = premiumPreviewFragment.i0;
        al8 al8Var = premiumPreviewFragment.n0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.x0 != null) {
            premiumPreviewFragment.m0();
        }
        if (!premiumPreviewFragment.a0) {
            boolean z2 = premiumPreviewFragment.b0;
            float f = premiumPreviewFragment.c0;
            if (z2) {
                float f2 = f + 0.016f;
                premiumPreviewFragment.c0 = f2;
                if (f2 > 3.0f) {
                    premiumPreviewFragment.b0 = false;
                }
            } else {
                float f3 = f - 0.016f;
                premiumPreviewFragment.c0 = f3;
                if (f3 < 1.0f) {
                    premiumPreviewFragment.b0 = true;
                }
            }
        }
        View m = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
        premiumPreviewFragment.d0 = m == null ? 0 : m.getBottom();
        aVar = ((e) premiumPreviewFragment).actionBar;
        int L = hl.L(16.0f) + aVar.getBottom();
        float f4 = 1.0f - ((premiumPreviewFragment.d0 - L) / (premiumPreviewFragment.Z - L));
        premiumPreviewFragment.g0 = f4;
        premiumPreviewFragment.g0 = Utilities.i(f4, 1.0f, 0.0f);
        aVar2 = ((e) premiumPreviewFragment).actionBar;
        int L2 = hl.L(16.0f) + aVar2.getBottom();
        int i = premiumPreviewFragment.d0;
        if (i < L2) {
            premiumPreviewFragment.d0 = L2;
            i = L2;
        }
        float f5 = premiumPreviewFragment.r0;
        premiumPreviewFragment.r0 = 0.0f;
        if (i < hl.L(30.0f) + L2) {
            premiumPreviewFragment.r0 = ((hl.L(30.0f) + L2) - premiumPreviewFragment.d0) / hl.L(30.0f);
        }
        if (premiumPreviewFragment.X) {
            premiumPreviewFragment.r0 = 1.0f;
            premiumPreviewFragment.g0 = 1.0f;
        }
        if (f5 != premiumPreviewFragment.r0) {
            premiumPreviewFragment.a.invalidate();
        }
        int i2 = premiumPreviewFragment.d0;
        aVar3 = ((e) premiumPreviewFragment).actionBar;
        float L3 = hl.L(24.0f) + hl.L(premiumPreviewFragment.V.e.getVisibility() == 0 ? 24.0f : 16.0f) + (i2 - ((premiumPreviewFragment.V.getMeasuredHeight() + aVar3.getMeasuredHeight()) - premiumPreviewFragment.Y));
        aVar4 = ((e) premiumPreviewFragment).actionBar;
        float max = Math.max((((((aVar4.getMeasuredHeight() - premiumPreviewFragment.Y) - premiumPreviewFragment.V.a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.Y) - premiumPreviewFragment.V.getTop()) - premiumPreviewFragment.V.a.getTop(), L3);
        float L4 = ((-max) / 4.0f) + hl.L(16.0f);
        premiumPreviewFragment.V.setTranslationY(max);
        premiumPreviewFragment.V.d.setTranslationY(L4 + hl.L(premiumPreviewFragment.h0 ? 9.0f : 16.0f));
        float f6 = premiumPreviewFragment.g0;
        float A = qd4.A(1.0f, f6, 0.4f, 0.6f);
        float f7 = 1.0f - (f6 > 0.5f ? (f6 - 0.5f) / 0.5f : 0.0f);
        premiumPreviewFragment.V.d.setScaleX(A);
        premiumPreviewFragment.V.d.setScaleY(A);
        premiumPreviewFragment.V.d.setAlpha(f7);
        premiumPreviewFragment.V.b.setAlpha(f7);
        premiumPreviewFragment.V.e.setAlpha(f7);
        premiumPreviewFragment.W.setAlpha(1.0f - premiumPreviewFragment.g0);
        premiumPreviewFragment.W.setTranslationY(premiumPreviewFragment.V.c.getY() + premiumPreviewFragment.V.getY() + ((-(r1.getMeasuredHeight() - premiumPreviewFragment.V.d.getMeasuredWidth())) / 2.0f));
        float L5 = hl.L(72.0f) - premiumPreviewFragment.V.a.getLeft();
        float f8 = premiumPreviewFragment.g0;
        premiumPreviewFragment.V.a.setTranslationX((1.0f - k43.h.getInterpolation(1.0f - (f8 > 0.3f ? (f8 - 0.3f) / 0.7f : 0.0f))) * L5);
        rl8 rl8Var = premiumPreviewFragment.V;
        rl8Var.d.b.s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.c0) + (premiumPreviewFragment.V.c.getX() + rl8Var.getX())) / getMeasuredWidth();
        rl8 rl8Var2 = premiumPreviewFragment.V;
        rl8Var2.d.b.t = (premiumPreviewFragment.V.c.getY() + rl8Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.a0) {
            invalidate();
            premiumPreviewFragment.L.invalidate();
            premiumPreviewFragment.K.invalidate();
        }
        al8Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z) {
            int i3 = aob.a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i3);
            Paint paint = this.c;
            paint.setColor(themedColor);
            boolean z3 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.r0 > 0.0f) {
                aVar6 = ((e) premiumPreviewFragment).actionBar;
                if (aVar6 != null) {
                    paint.setColor(vm2.f(premiumPreviewFragment.r0, premiumPreviewFragment.getThemedColor(i3), premiumPreviewFragment.getThemedColor(aob.d6)));
                    float measuredWidth = getMeasuredWidth();
                    aVar7 = ((e) premiumPreviewFragment).actionBar;
                    float height = aVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                    r11 = z3;
                }
            }
            canvas2 = canvas;
            r11 = z3;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), al8Var.f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.K.getVisibility() != 0) {
            premiumPreviewFragment.w0.b(premiumPreviewFragment.p0.d, r11);
            premiumPreviewFragment.w0.setBounds(r11, getHeight() - premiumPreviewFragment.p0.d, getWidth(), getHeight());
            premiumPreviewFragment.w0.draw(canvas2);
        }
        wk5Var = ((e) premiumPreviewFragment).parentLayout;
        if (wk5Var == null || !z) {
            return;
        }
        wk5Var2 = ((e) premiumPreviewFragment).parentLayout;
        int i4 = (int) (premiumPreviewFragment.r0 * 255.0f);
        aVar5 = ((e) premiumPreviewFragment).actionBar;
        ((ActionBarLayout) wk5Var2).n(canvas2, i4, aVar5.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x = premiumPreviewFragment.V.c.getX() + premiumPreviewFragment.V.getX();
        float y = premiumPreviewFragment.V.c.getY() + premiumPreviewFragment.V.getY();
        RectF rectF = hl.P;
        rectF.set(x, y, (premiumPreviewFragment.V.d == null ? 0 : r4.getMeasuredWidth()) + x, (premiumPreviewFragment.V.d == null ? 0 : r6.getMeasuredHeight()) + y);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.a) && !premiumPreviewFragment.a.J1) {
            motionEvent.offsetLocation(-x, -y);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.a = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.a = false;
            }
            premiumPreviewFragment.V.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x2 = premiumPreviewFragment.V.e.getX() + premiumPreviewFragment.V.getX();
        float y2 = premiumPreviewFragment.V.e.getY() + premiumPreviewFragment.V.getY();
        rectF.set(x2, y2, premiumPreviewFragment.V.e.getWidth() + x2, premiumPreviewFragment.V.e.getHeight() + y2);
        if (premiumPreviewFragment.r0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.b) && !premiumPreviewFragment.a.J1)) {
            motionEvent.offsetLocation(-x2, -y2);
            if (motionEvent.getAction() == 0) {
                this.b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.b = false;
            }
            premiumPreviewFragment.V.e.dispatchTouchEvent(motionEvent);
            if (this.b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.V.d.b.u = r2.getMeasuredWidth() / getMeasuredWidth();
        premiumPreviewFragment.V.d.b.v = r2.getMeasuredHeight() / getMeasuredHeight();
        rl8 rl8Var = premiumPreviewFragment.V;
        rl8Var.d.b.s = (premiumPreviewFragment.V.d.getX() + rl8Var.getX()) / getMeasuredWidth();
        rl8 rl8Var2 = premiumPreviewFragment.V;
        rl8Var2.d.b.t = (premiumPreviewFragment.V.d.getY() + rl8Var2.getY()) / getMeasuredHeight();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        boolean z = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.X = z;
        premiumPreviewFragment.Y = hl.m;
        premiumPreviewFragment.V.measure(i, 0);
        premiumPreviewFragment.W.getLayoutParams().height = premiumPreviewFragment.V.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.K;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i3 = hl.L(68.0f);
        }
        td4 td4Var = premiumPreviewFragment.Q;
        td4Var.M = (premiumPreviewFragment.Y + i3) - hl.L(16.0f);
        td4Var.o1();
        premiumPreviewFragment.Q.S = i3;
        super.onMeasure(i, i2);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.x0();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.c;
        ArrayList arrayList2 = premiumPreviewFragment.b;
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList2.size(); i6++) {
            premiumPreviewFragment.M.a((sl8) arrayList2.get(i6), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
            ((sl8) arrayList2.get(i6)).e = i5;
            i5 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            premiumPreviewFragment.M.a((sl8) arrayList.get(i7), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
            ((sl8) arrayList.get(i7)).e = i5;
            i5 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        premiumPreviewFragment.O = i5;
    }
}
