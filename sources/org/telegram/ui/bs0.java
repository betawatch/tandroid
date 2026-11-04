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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bs0 extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Paint c;
    public final /* synthetic */ PremiumPreviewFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
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
        boolean z10 = premiumPreviewFragment.i0;
        vg.x0 x0Var = premiumPreviewFragment.n0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.x0 != null) {
            premiumPreviewFragment.o0();
        }
        if (!premiumPreviewFragment.a0) {
            if (premiumPreviewFragment.b0) {
                float f10 = premiumPreviewFragment.c0 + 0.016f;
                premiumPreviewFragment.c0 = f10;
                if (f10 > 3.0f) {
                    premiumPreviewFragment.b0 = false;
                }
            } else {
                float f11 = premiumPreviewFragment.c0 - 0.016f;
                premiumPreviewFragment.c0 = f11;
                if (f11 < 1.0f) {
                    premiumPreviewFragment.b0 = true;
                }
            }
        }
        View m10 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
        premiumPreviewFragment.d0 = m10 == null ? 0 : m10.getBottom();
        kVar = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
        int L = org.telegram.messenger.g0.L(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((premiumPreviewFragment.d0 - L) / (premiumPreviewFragment.Z - L));
        premiumPreviewFragment.g0 = f12;
        premiumPreviewFragment.g0 = Utilities.i(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
        int L2 = org.telegram.messenger.g0.L(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.d0 < L2) {
            premiumPreviewFragment.d0 = L2;
        }
        float f13 = premiumPreviewFragment.r0;
        premiumPreviewFragment.r0 = 0.0f;
        if (premiumPreviewFragment.d0 < org.telegram.messenger.g0.L(30.0f) + L2) {
            premiumPreviewFragment.r0 = ((org.telegram.messenger.g0.L(30.0f) + L2) - premiumPreviewFragment.d0) / org.telegram.messenger.g0.L(30.0f);
        }
        if (premiumPreviewFragment.X) {
            premiumPreviewFragment.r0 = 1.0f;
            premiumPreviewFragment.g0 = 1.0f;
        }
        if (f13 != premiumPreviewFragment.r0) {
            premiumPreviewFragment.a.invalidate();
        }
        int i3 = premiumPreviewFragment.d0;
        kVar3 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
        float L3 = org.telegram.messenger.g0.L(24.0f) + org.telegram.messenger.g0.L(premiumPreviewFragment.V.e.getVisibility() == 0 ? 24.0f : 16.0f) + (i3 - ((premiumPreviewFragment.V.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.Y));
        kVar4 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.Y) - premiumPreviewFragment.V.a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.Y) - premiumPreviewFragment.V.getTop()) - premiumPreviewFragment.V.a.getTop(), L3);
        float L4 = ((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f);
        premiumPreviewFragment.V.setTranslationY(max);
        premiumPreviewFragment.V.d.setTranslationY(L4 + org.telegram.messenger.g0.L(premiumPreviewFragment.h0 == 1 ? 9.0f : 16.0f));
        float f14 = premiumPreviewFragment.g0;
        float y9 = com.google.android.recaptcha.internal.a.y(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        premiumPreviewFragment.V.d.setScaleX(y9);
        premiumPreviewFragment.V.d.setScaleY(y9);
        premiumPreviewFragment.V.d.setAlpha(f15);
        premiumPreviewFragment.V.b.setAlpha(f15);
        premiumPreviewFragment.V.e.setAlpha(f15);
        premiumPreviewFragment.W.setAlpha(1.0f - premiumPreviewFragment.g0);
        premiumPreviewFragment.W.setTranslationY(premiumPreviewFragment.V.c.getY() + premiumPreviewFragment.V.getY() + ((-(r1.getMeasuredHeight() - premiumPreviewFragment.V.d.getMeasuredWidth())) / 2.0f));
        float L5 = org.telegram.messenger.g0.L(72.0f) - premiumPreviewFragment.V.a.getLeft();
        float f16 = premiumPreviewFragment.g0;
        premiumPreviewFragment.V.a.setTranslationX((1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * L5);
        ks0 ks0Var = premiumPreviewFragment.V;
        ks0Var.d.b.s = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.c0) + (premiumPreviewFragment.V.c.getX() + ks0Var.getX())) / getMeasuredWidth();
        ks0 ks0Var2 = premiumPreviewFragment.V;
        ks0Var2.d.b.t = (premiumPreviewFragment.V.c.getY() + ks0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.a0) {
            invalidate();
            premiumPreviewFragment.L.invalidate();
            premiumPreviewFragment.K.invalidate();
        }
        x0Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z10) {
            int i10 = org.telegram.ui.ActionBar.k6.a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i10);
            Paint paint = this.c;
            paint.setColor(themedColor);
            boolean z11 = false;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.r0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.a.f(premiumPreviewFragment.r0, premiumPreviewFragment.getThemedColor(i10), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.k6.d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
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
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), x0Var.f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.K.getVisibility() != 0) {
            premiumPreviewFragment.w0.b(premiumPreviewFragment.p0.d, r11);
            premiumPreviewFragment.w0.setBounds(r11, getHeight() - premiumPreviewFragment.p0.d, getWidth(), getHeight());
            premiumPreviewFragment.w0.draw(canvas2);
        }
        q4Var = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).parentLayout;
        if (q4Var == null || !z10) {
            return;
        }
        q4Var2 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).parentLayout;
        int i11 = (int) (premiumPreviewFragment.r0 * 255.0f);
        kVar5 = ((org.telegram.ui.ActionBar.d2) premiumPreviewFragment).actionBar;
        ((ActionBarLayout) q4Var2).p(canvas2, i11, kVar5.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.V.c.getX() + premiumPreviewFragment.V.getX();
        float y9 = premiumPreviewFragment.V.c.getY() + premiumPreviewFragment.V.getY();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(x10, y9, (premiumPreviewFragment.V.d == null ? 0 : r4.getMeasuredWidth()) + x10, (premiumPreviewFragment.V.d == null ? 0 : r6.getMeasuredHeight()) + y9);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.a) && !premiumPreviewFragment.a.J1) {
            motionEvent.offsetLocation(-x10, -y9);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.a = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.a = false;
            }
            premiumPreviewFragment.V.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.V.e.getX() + premiumPreviewFragment.V.getX();
        float y10 = premiumPreviewFragment.V.e.getY() + premiumPreviewFragment.V.getY();
        rectF.set(x11, y10, premiumPreviewFragment.V.e.getWidth() + x11, premiumPreviewFragment.V.e.getHeight() + y10);
        if (premiumPreviewFragment.r0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.b) && !premiumPreviewFragment.a.J1)) {
            motionEvent.offsetLocation(-x11, -y10);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.V.d.b.u = r3.getMeasuredWidth() / getMeasuredWidth();
        premiumPreviewFragment.V.d.b.v = r3.getMeasuredHeight() / getMeasuredHeight();
        ks0 ks0Var = premiumPreviewFragment.V;
        ks0Var.d.b.s = (premiumPreviewFragment.V.d.getX() + ks0Var.getX()) / getMeasuredWidth();
        ks0 ks0Var2 = premiumPreviewFragment.V;
        ks0Var2.d.b.t = (premiumPreviewFragment.V.d.getY() + ks0Var2.getY()) / getMeasuredHeight();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11 = 0;
        boolean z10 = View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.X = z10;
        premiumPreviewFragment.Y = org.telegram.messenger.g0.m;
        premiumPreviewFragment.V.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.W.getLayoutParams().height = premiumPreviewFragment.V.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.K;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i11 = org.telegram.messenger.g0.L(68.0f);
        }
        org.telegram.ui.Components.jy jyVar = premiumPreviewFragment.Q;
        jyVar.M = (premiumPreviewFragment.Y + i11) - org.telegram.messenger.g0.L(16.0f);
        jyVar.p1();
        premiumPreviewFragment.Q.S = i11;
        super.onMeasure(i3, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.x0();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.c;
        ArrayList arrayList2 = premiumPreviewFragment.b;
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            premiumPreviewFragment.M.a((ls0) arrayList2.get(i14), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            ((ls0) arrayList2.get(i14)).e = i13;
            i13 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            premiumPreviewFragment.M.a((ls0) arrayList.get(i15), false);
            premiumPreviewFragment.M.measure(View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_31));
            ((ls0) arrayList.get(i15)).e = i13;
            i13 += premiumPreviewFragment.M.getMeasuredHeight();
        }
        premiumPreviewFragment.O = i13;
    }
}
