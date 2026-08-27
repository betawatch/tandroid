package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m10 extends FrameLayout implements ud.b {
    public final ud.a a;
    public final ud.a b;
    public final ri0 c;
    public final RadialProgressView d;
    public final org.telegram.ui.ActionBar.c6 e;
    public ArrayList f;
    public final boolean h;
    public final og.c n;
    public final lg.f r;
    public final lh.f s;
    public float v;
    public float w;
    public boolean x;

    public m10(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var, false);
    }

    public static FrameLayout.LayoutParams b() {
        return h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static FrameLayout.LayoutParams c() {
        return h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 80, 20.0f, 0.0f, 20.0f, 14.0f);
    }

    public static void d(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
        view.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        view.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f10));
        view.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    private void setAdditionalTranslationY(float f10) {
        if (this.v != f10) {
            this.x = true;
            super.setTranslationY(this.w + f10);
            this.x = false;
            this.v = f10;
        }
    }

    public final void a(View view) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(view);
        d(view, 1.0f - this.b.e);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        lg.f fVar = this.r;
        if (fVar != null) {
            fVar.draw(canvas);
        }
        super.draw(canvas);
    }

    public final void e(boolean z10, boolean z11) {
        this.a.a(z10, z11);
    }

    public final void f(boolean z10, boolean z11) {
        this.b.a(z10, z11);
    }

    public final void g() {
        boolean z10 = this.h;
        RadialProgressView radialProgressView = this.d;
        ri0 ri0Var = this.c;
        org.telegram.ui.ActionBar.c6 c6Var = this.e;
        if (!z10) {
            int i10 = org.telegram.ui.ActionBar.g6.O9;
            ri0Var.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), PorterDuff.Mode.SRC_IN);
            radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
            setBackground(org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(48.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Qh, c6Var)));
            return;
        }
        int i11 = org.telegram.ui.ActionBar.g6.v8;
        ri0Var.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.SRC_IN);
        radialProgressView.setProgressColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        this.n.a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
        this.s.b();
        this.r.u();
        invalidate();
        int dp = AndroidUtilities.dp(18.0f);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.i6, c6Var);
        int dp2 = AndroidUtilities.dp(6.0f);
        setBackground(org.telegram.ui.ActionBar.g6.W(dp, v02, dp2, dp2, dp2, dp2));
    }

    public boolean getButtonVisible() {
        return this.a.f;
    }

    public boolean getProgressVisible() {
        return this.b.f;
    }

    @Override // android.view.View
    public float getTranslationY() {
        return this.x ? super.getTranslationY() : this.w;
    }

    @Override // ud.b
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        int i11 = 0;
        if (i10 == 0) {
            d(this, f10);
            setClickable(f10 >= 0.99f);
            setAdditionalTranslationY((1.0f - f10) * AndroidUtilities.dp(this.h ? 64.0f : 40.0f));
        } else if (i10 == 1) {
            d(this.d, f10);
            float f12 = 1.0f - f10;
            d(this.c, f12);
            ArrayList arrayList = this.f;
            if (arrayList != null) {
                int size = arrayList.size();
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    d((View) obj, f12);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        lg.f fVar = this.r;
        if (fVar != null) {
            fVar.setBounds(0, 0, i10, i11);
        }
    }

    public void setImageResource(int i10) {
        this.c.setImageResource(i10);
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (this.w != f10) {
            this.x = true;
            super.setTranslationY(this.v + f10);
            this.x = false;
            this.w = f10;
        }
    }

    public m10(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        er erVar = er.h;
        this.a = new ud.a(0, this, erVar, 380L, true);
        this.b = new ud.a(1, this, erVar, 380L, false);
        this.e = c6Var;
        this.h = z10;
        ri0 ri0Var = new ri0(context);
        this.c = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ri0Var, h7.z5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.d = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        radialProgressView.setStrokeWidth(2.0f);
        addView(radialProgressView, h7.z5.c(-1.0f, -1));
        d(radialProgressView, 0.0f);
        h7.b6.a(this);
        if (!z10) {
            setOutlineProvider(gf.r0.a);
            setTranslationZ(AndroidUtilities.dpf2(0.5f));
        }
        if (z10) {
            lh.f fVar = new lh.f(org.telegram.ui.ActionBar.g6.h5, null);
            this.s = fVar;
            og.c cVar = new og.c();
            this.n = cVar;
            lg.f fVar2 = new lg.f(cVar);
            this.r = fVar2;
            fVar2.n(fVar);
            float dpf2 = AndroidUtilities.dpf2(0.4f);
            float dpf22 = AndroidUtilities.dpf2(0.4f);
            lg.c cVar2 = fVar2.h;
            cVar2.i = dpf2;
            cVar2.j = dpf22;
            fVar2.p(AndroidUtilities.dp(18.0f));
            fVar2.o(AndroidUtilities.dp(5.66f));
        }
        g();
    }

    @Override // ud.b
    public final /* synthetic */ void A(float f10, int i10) {
    }
}
