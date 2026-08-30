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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class dw0 extends FrameLayout {
    public boolean a;
    public boolean b;
    public final Paint c;
    public final /* synthetic */ PremiumPreviewFragment d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw0(PremiumPreviewFragment premiumPreviewFragment, Context context) {
        super(context);
        this.d = premiumPreviewFragment;
        this.c = new Paint(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v20 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        ?? r11;
        Canvas canvas2;
        org.telegram.ui.ActionBar.e5 e5Var;
        org.telegram.ui.ActionBar.e5 e5Var2;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        org.telegram.ui.ActionBar.k kVar7;
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        boolean z4 = premiumPreviewFragment.e0;
        eg.q1 q1Var = premiumPreviewFragment.j0;
        if (Build.VERSION.SDK_INT >= 31 && premiumPreviewFragment.r0 != null) {
            premiumPreviewFragment.j0();
        }
        if (!premiumPreviewFragment.W) {
            if (premiumPreviewFragment.X) {
                float f10 = premiumPreviewFragment.Y + 0.016f;
                premiumPreviewFragment.Y = f10;
                if (f10 > 3.0f) {
                    premiumPreviewFragment.X = false;
                }
            } else {
                float f11 = premiumPreviewFragment.Y - 0.016f;
                premiumPreviewFragment.Y = f11;
                if (f11 < 1.0f) {
                    premiumPreviewFragment.X = true;
                }
            }
        }
        View m9 = premiumPreviewFragment.a.getLayoutManager() != null ? premiumPreviewFragment.a.getLayoutManager().m(0) : null;
        premiumPreviewFragment.Z = m9 == null ? 0 : m9.getBottom();
        kVar = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
        int dp = AndroidUtilities.dp(16.0f) + kVar.getBottom();
        float f12 = 1.0f - ((premiumPreviewFragment.Z - dp) / (premiumPreviewFragment.V - dp));
        premiumPreviewFragment.c0 = f12;
        premiumPreviewFragment.c0 = Utilities.clamp(f12, 1.0f, 0.0f);
        kVar2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
        int dp2 = AndroidUtilities.dp(16.0f) + kVar2.getBottom();
        if (premiumPreviewFragment.Z < dp2) {
            premiumPreviewFragment.Z = dp2;
        }
        float f13 = premiumPreviewFragment.n0;
        premiumPreviewFragment.n0 = 0.0f;
        if (premiumPreviewFragment.Z < AndroidUtilities.dp(30.0f) + dp2) {
            premiumPreviewFragment.n0 = ((AndroidUtilities.dp(30.0f) + dp2) - premiumPreviewFragment.Z) / AndroidUtilities.dp(30.0f);
        }
        if (premiumPreviewFragment.T) {
            premiumPreviewFragment.n0 = 1.0f;
            premiumPreviewFragment.c0 = 1.0f;
        }
        if (f13 != premiumPreviewFragment.n0) {
            premiumPreviewFragment.a.invalidate();
        }
        int i10 = premiumPreviewFragment.Z;
        kVar3 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
        float dp3 = AndroidUtilities.dp(24.0f) + AndroidUtilities.dp(premiumPreviewFragment.R.e.getVisibility() == 0 ? 24.0f : 16.0f) + (i10 - ((premiumPreviewFragment.R.getMeasuredHeight() + kVar3.getMeasuredHeight()) - premiumPreviewFragment.U));
        kVar4 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
        float max = Math.max((((((kVar4.getMeasuredHeight() - premiumPreviewFragment.U) - premiumPreviewFragment.R.a.getMeasuredHeight()) / 2.0f) + premiumPreviewFragment.U) - premiumPreviewFragment.R.getTop()) - premiumPreviewFragment.R.a.getTop(), dp3);
        float dp4 = ((-max) / 4.0f) + AndroidUtilities.dp(16.0f);
        premiumPreviewFragment.R.setTranslationY(max);
        premiumPreviewFragment.R.d.setTranslationY(dp4 + AndroidUtilities.dp(premiumPreviewFragment.d0 == 1 ? 9.0f : 16.0f));
        float f14 = premiumPreviewFragment.c0;
        float w10 = e2.c.w(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        premiumPreviewFragment.R.d.setScaleX(w10);
        premiumPreviewFragment.R.d.setScaleY(w10);
        premiumPreviewFragment.R.d.setAlpha(f15);
        premiumPreviewFragment.R.b.setAlpha(f15);
        premiumPreviewFragment.R.e.setAlpha(f15);
        premiumPreviewFragment.S.setAlpha(1.0f - premiumPreviewFragment.c0);
        premiumPreviewFragment.S.setTranslationY(premiumPreviewFragment.R.c.getY() + premiumPreviewFragment.R.getY() + ((-(r1.getMeasuredHeight() - premiumPreviewFragment.R.d.getMeasuredWidth())) / 2.0f));
        float dp5 = AndroidUtilities.dp(72.0f) - premiumPreviewFragment.R.a.getLeft();
        float f16 = premiumPreviewFragment.c0;
        premiumPreviewFragment.R.a.setTranslationX((1.0f - org.telegram.ui.Components.nr.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * dp5);
        ow0 ow0Var = premiumPreviewFragment.R;
        ow0Var.d.b.p = (((getMeasuredWidth() * 0.1f) * premiumPreviewFragment.Y) + (premiumPreviewFragment.R.c.getX() + ow0Var.getX())) / getMeasuredWidth();
        ow0 ow0Var2 = premiumPreviewFragment.R;
        ow0Var2.d.b.q = (premiumPreviewFragment.R.c.getY() + ow0Var2.getY()) / getMeasuredHeight();
        if (!premiumPreviewFragment.W) {
            invalidate();
            premiumPreviewFragment.H.invalidate();
            premiumPreviewFragment.G.invalidate();
        }
        q1Var.d(0, (-getMeasuredWidth()) * 0.1f * premiumPreviewFragment.Y, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (z4) {
            int i11 = org.telegram.ui.ActionBar.j6.a7;
            int themedColor = premiumPreviewFragment.getThemedColor(i11);
            Paint paint = this.c;
            paint.setColor(themedColor);
            r11 = 0;
            r11 = 0;
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            if (premiumPreviewFragment.n0 > 0.0f) {
                kVar6 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                if (kVar6 != null) {
                    paint.setColor(i0.a.d(premiumPreviewFragment.n0, premiumPreviewFragment.getThemedColor(i11), premiumPreviewFragment.getThemedColor(org.telegram.ui.ActionBar.j6.d6)));
                    float measuredWidth = getMeasuredWidth();
                    kVar7 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
                    float height = kVar7.getHeight();
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, measuredWidth, height, paint);
                }
            }
            canvas2 = canvas;
        } else {
            r11 = 0;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), q1Var.f);
        }
        super.dispatchDraw(canvas);
        if (premiumPreviewFragment.G.getVisibility() != 0) {
            premiumPreviewFragment.q0.b(premiumPreviewFragment.l0.d, r11);
            premiumPreviewFragment.q0.setBounds(r11, getHeight() - premiumPreviewFragment.l0.d, getWidth(), getHeight());
            premiumPreviewFragment.q0.draw(canvas2);
        }
        e5Var = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).parentLayout;
        if (e5Var == null || !z4) {
            return;
        }
        e5Var2 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).parentLayout;
        int i12 = (int) (premiumPreviewFragment.n0 * 255.0f);
        kVar5 = ((org.telegram.ui.ActionBar.p2) premiumPreviewFragment).actionBar;
        ((ActionBarLayout) e5Var2).p(canvas2, i12, kVar5.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        float x10 = premiumPreviewFragment.R.c.getX() + premiumPreviewFragment.R.getX();
        float y10 = premiumPreviewFragment.R.c.getY() + premiumPreviewFragment.R.getY();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(x10, y10, (premiumPreviewFragment.R.d == null ? 0 : r4.getMeasuredWidth()) + x10, (premiumPreviewFragment.R.d == null ? 0 : r6.getMeasuredHeight()) + y10);
        if ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.a) && !premiumPreviewFragment.a.H1) {
            motionEvent.offsetLocation(-x10, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.a = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.a = false;
            }
            premiumPreviewFragment.R.d.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x11 = premiumPreviewFragment.R.e.getX() + premiumPreviewFragment.R.getX();
        float y11 = premiumPreviewFragment.R.e.getY() + premiumPreviewFragment.R.getY();
        rectF.set(x11, y11, premiumPreviewFragment.R.e.getWidth() + x11, premiumPreviewFragment.R.e.getHeight() + y11);
        if (premiumPreviewFragment.n0 < 1.0f && ((rectF.contains(motionEvent.getX(), motionEvent.getY()) || this.b) && !premiumPreviewFragment.a.H1)) {
            motionEvent.offsetLocation(-x11, -y11);
            if (motionEvent.getAction() == 0) {
                this.b = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.b = false;
            }
            premiumPreviewFragment.R.e.dispatchTouchEvent(motionEvent);
            if (this.b) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.R.d.b.r = r3.getMeasuredWidth() / getMeasuredWidth();
        premiumPreviewFragment.R.d.b.s = r3.getMeasuredHeight() / getMeasuredHeight();
        ow0 ow0Var = premiumPreviewFragment.R;
        ow0Var.d.b.p = (premiumPreviewFragment.R.d.getX() + ow0Var.getX()) / getMeasuredWidth();
        ow0 ow0Var2 = premiumPreviewFragment.R;
        ow0Var2.d.b.q = (premiumPreviewFragment.R.d.getY() + ow0Var2.getY()) / getMeasuredHeight();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 0;
        boolean z4 = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        premiumPreviewFragment.T = z4;
        premiumPreviewFragment.U = AndroidUtilities.statusBarHeight;
        premiumPreviewFragment.R.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        premiumPreviewFragment.S.getLayoutParams().height = premiumPreviewFragment.R.getMeasuredHeight();
        FrameLayout frameLayout = premiumPreviewFragment.G;
        if (frameLayout != null && frameLayout.getVisibility() != 8) {
            i12 = AndroidUtilities.dp(68.0f);
        }
        org.telegram.ui.Components.pz pzVar = premiumPreviewFragment.M;
        pzVar.M = (premiumPreviewFragment.U + i12) - AndroidUtilities.dp(16.0f);
        pzVar.p1();
        premiumPreviewFragment.M.S = i12;
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) != 0) {
            premiumPreviewFragment.s0();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.d;
        ArrayList arrayList = premiumPreviewFragment.c;
        ArrayList arrayList2 = premiumPreviewFragment.b;
        int i14 = 0;
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            premiumPreviewFragment.I.a((pw0) arrayList2.get(i15), false);
            premiumPreviewFragment.I.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            ((pw0) arrayList2.get(i15)).e = i14;
            i14 += premiumPreviewFragment.I.getMeasuredHeight();
        }
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            premiumPreviewFragment.I.a((pw0) arrayList.get(i16), false);
            premiumPreviewFragment.I.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            ((pw0) arrayList.get(i16)).e = i14;
            i14 += premiumPreviewFragment.I.getMeasuredHeight();
        }
        premiumPreviewFragment.K = i14;
    }
}
