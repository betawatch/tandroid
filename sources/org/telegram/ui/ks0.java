package org.telegram.ui;

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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ks0 extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Paint c;
    public final /* synthetic */ PremiumPreviewFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.c = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z9 = premiumPreviewFragment.h0;
        ug.y0 y0Var = premiumPreviewFragment.m0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.w0 != null) {
            premiumPreviewFragment.o0();
        }
        if (!premiumPreviewFragment.Z) {
            if (premiumPreviewFragment.a0) {
                float f10 = premiumPreviewFragment.b0 + 0.016f;
                premiumPreviewFragment.b0 = f10;
                if (f10 > 3.0f) {
                    premiumPreviewFragment.a0 = false;
                }
            } else {
                float f11 = premiumPreviewFragment.b0 - 0.016f;
                premiumPreviewFragment.b0 = f11;
                if (f11 < 1.0f) {
                    premiumPreviewFragment.a0 = true;
                }
            }
        }
        View m10 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
        premiumPreviewFragment.c0 = m10 == null ? 0 : m10.getBottom();
        kVar = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
        int L = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((premiumPreviewFragment.c0 - L) / (premiumPreviewFragment.Y - L));
        premiumPreviewFragment.f0 = f12;
        premiumPreviewFragment.f0 = Utilities.i(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
        int L2 = org.telegram.messenger.g0.L(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.c0 < L2) {
            premiumPreviewFragment.c0 = L2;
        }
        float f13 = premiumPreviewFragment.q0;
        premiumPreviewFragment.q0 = 0.0f;
        if (premiumPreviewFragment.c0 < org.telegram.messenger.g0.L(30.0f) + L2) {
            premiumPreviewFragment.q0 = ((org.telegram.messenger.g0.L(30.0f) + L2) - premiumPreviewFragment.c0) / org.telegram.messenger.g0.L(30.0f);
        }
        if (premiumPreviewFragment.W) {
            premiumPreviewFragment.q0 = 1.0f;
            premiumPreviewFragment.f0 = 1.0f;
        }
        if (f13 != premiumPreviewFragment.q0) {
            premiumPreviewFragment.a.invalidate();
        }
        int i7 = premiumPreviewFragment.c0;
        kVar3 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
        float L3 = org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(premiumPreviewFragment.U.e.getVisibility() == 0 ? 24.0f : 16.0f) + (i7 - ((premiumPreviewFragment.U.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.X));
        kVar4 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.X) - premiumPreviewFragment.U.a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.X) - premiumPreviewFragment.U.getTop()) - premiumPreviewFragment.U.a.getTop(), L3);
        float L4 = ((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f);
        premiumPreviewFragment.U.setTranslationY(max);
        premiumPreviewFragment.U.d.setTranslationY(L4 + org.telegram.messenger.g0.L(premiumPreviewFragment.g0 == 1 ? 9.0f : 16.0f));
        float f14 = premiumPreviewFragment.f0;
        float z10 = com.google.android.recaptcha.internal.a.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        premiumPreviewFragment.U.d.setScaleX(z10);
        premiumPreviewFragment.U.d.setScaleY(z10);
        premiumPreviewFragment.U.d.setAlpha(f15);
        premiumPreviewFragment.U.b.setAlpha(f15);
        premiumPreviewFragment.U.e.setAlpha(f15);
        premiumPreviewFragment.V.setAlpha(1.0f - premiumPreviewFragment.f0);
        premiumPreviewFragment.V.setTranslationY(premiumPreviewFragment.U.c.getY() + premiumPreviewFragment.U.getY() + ((-(r1.getMeasuredHeight() - premiumPreviewFragment.U.d.getMeasuredWidth())) / 2.0f));
        float L5 = org.telegram.messenger.g0.L(72.0f) - premiumPreviewFragment.U.a.getLeft();
        float f16 = premiumPreviewFragment.f0;
        premiumPreviewFragment.U.a.setTranslationX((1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * L5);
        ts0 ts0Var = premiumPreviewFragment.U;
        ts0Var.d.b.s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.b0) + (premiumPreviewFragment.U.c.getX() + ts0Var.getX())) / getMeasuredWidth();
        ts0 ts0Var2 = premiumPreviewFragment.U;
        ts0Var2.d.b.t = (premiumPreviewFragment.U.c.getY() + ts0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.Z) {
            invalidate();
            premiumPreviewFragment.K.invalidate();
            premiumPreviewFragment.J.invalidate();
        }
        y0Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.b0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z9) {
            int i10 = org.telegram.ui.ActionBar.k6.a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i10);
            Paint paint = this.c;
            paint.setColor(themedColor);
            boolean z11 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.q0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.a.f(premiumPreviewFragment.q0, premiumPreviewFragment.getThemedColor(i10), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.k6.d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
                    float height = kVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                    r11 = z11;
                }
            }
            canvas2 = canvas;
            r11 = z11;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), y0Var.f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.J.getVisibility() != 0) {
            premiumPreviewFragment.v0.b(premiumPreviewFragment.o0.d, r11);
            premiumPreviewFragment.v0.setBounds(r11, getHeight() - premiumPreviewFragment.o0.d, getWidth(), getHeight());
            premiumPreviewFragment.v0.draw(canvas2);
        }
        q4Var = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).parentLayout;
        if (q4Var == null || !z9) {
            return;
        }
        q4Var2 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).parentLayout;
        int i11 = (int) (premiumPreviewFragment.q0 * 255.0f);
        kVar5 = ((org.telegram.ui.ActionBar.f2) premiumPreviewFragment).actionBar;
        ((ActionBarLayout) q4Var2).p(canvas2, i11, kVar5.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.U.c.getX() + premiumPreviewFragment.U.getX();
        float y10 = premiumPreviewFragment.U.c.getY() + premiumPreviewFragment.U.getY();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(x10, y10, (premiumPreviewFragment.U.d == null ? 0 : r4.getMeasuredWidth()) + x10, (premiumPreviewFragment.U.d == null ? 0 : r6.getMeasuredHeight()) + y10);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.a) && !premiumPreviewFragment.a.I1) {
            motionEvent.offsetLocation(-x10, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.a = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.a = false;
            }
            premiumPreviewFragment.U.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.U.e.getX() + premiumPreviewFragment.U.getX();
        float y11 = premiumPreviewFragment.U.e.getY() + premiumPreviewFragment.U.getY();
        rectF.set(x11, y11, premiumPreviewFragment.U.e.getWidth() + x11, premiumPreviewFragment.U.e.getHeight() + y11);
        if (premiumPreviewFragment.q0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.b) && !premiumPreviewFragment.a.I1)) {
            motionEvent.offsetLocation(-x11, -y11);
            if (motionEvent.getAction() == 0) {
                this.b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.b = false;
            }
            premiumPreviewFragment.U.e.dispatchTouchEvent(motionEvent);
            if (this.b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.U.d.b.u = r3.getMeasuredWidth() / getMeasuredWidth();
        premiumPreviewFragment.U.d.b.v = r3.getMeasuredHeight() / getMeasuredHeight();
        ts0 ts0Var = premiumPreviewFragment.U;
        ts0Var.d.b.s = (premiumPreviewFragment.U.d.getX() + ts0Var.getX()) / getMeasuredWidth();
        ts0 ts0Var2 = premiumPreviewFragment.U;
        ts0Var2.d.b.t = (premiumPreviewFragment.U.d.getY() + ts0Var2.getY()) / getMeasuredHeight();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = 0;
        boolean z9 = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.W = z9;
        premiumPreviewFragment.X = org.telegram.messenger.g0.m;
        premiumPreviewFragment.U.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.V.getLayoutParams().height = premiumPreviewFragment.U.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.J;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i11 = org.telegram.messenger.g0.L(68.0f);
        }
        org.telegram.ui.Components.ly lyVar = premiumPreviewFragment.P;
        lyVar.M = (premiumPreviewFragment.X + i11) - org.telegram.messenger.g0.L(16.0f);
        lyVar.p1();
        premiumPreviewFragment.P.S = i11;
        super.onMeasure(i7, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.x0();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.c;
        ArrayList arrayList2 = premiumPreviewFragment.b;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            premiumPreviewFragment.L.a((us0) arrayList2.get(i14), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            ((us0) arrayList2.get(i14)).e = i13;
            i13 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            premiumPreviewFragment.L.a((us0) arrayList.get(i15), false);
            premiumPreviewFragment.L.measure(View.MeasureSpec.makeMeasureSpec(i7, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            ((us0) arrayList.get(i15)).e = i13;
            i13 += premiumPreviewFragment.L.getMeasuredHeight();
        }
        premiumPreviewFragment.N = i13;
    }
}
