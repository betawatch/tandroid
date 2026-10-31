package fg;

import ag.f3;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.tz;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.LaunchActivity;
import w7.u;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l extends FrameLayout implements us {
    public tk0 D;
    public ArrayList E;
    public int F;
    public i a;
    public eq b;
    public o1.j c;
    public o1.j d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public e r;
    public boolean s;
    public int w;
    public LinearLayout x;
    public TextView y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return u.a(f7, i0.L(16.0f), displayMetrics.widthPixels - i0.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return u.a(f7, i0.L(16.0f), displayMetrics.heightPixels - i0.L(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        int i10 = 1;
        arrayList.add(new a("Draw action bar shadow", new f3(1)));
        arrayList.add(new a("Show blur settings", new e(this, 0)));
        arrayList.add(new a(cd.L0(2131751648, null)));
        arrayList.add(new a(cd.L0(tz.J0 ? 2131751639 : 2131751631, null), new e(this, i10)));
        arrayList.add(new a(t6.I.q() ? "Switch to day theme" : "Switch to dark theme", new f3(2)));
        arrayList.add(new a(cd.L0(2131751614, null), new e(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        i iVar = this.a;
        ArrayList arrayList = this.E;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        if (z10) {
            this.x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                z4 M = ((LaunchActivity) getContext()).M();
                if (M instanceof b) {
                    arrayList.addAll(((b) M).F());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.F());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.F());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.D.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.w = window.getStatusBarColor();
        }
        final float translationX = iVar.getTranslationX();
        final float translationY = iVar.getTranslationY();
        o1.j jVar = new o1.j(new o1.i(z10 ? 0.0f : 1000.0f));
        o1.k p5 = f1.p(1000.0f, 900.0f, 1.0f);
        p5.i = z10 ? 1000.0f : 0.0f;
        jVar.m = p5;
        jVar.b(new o1.g() { // from class: fg.f
            @Override // o1.g
            public final void a(o1.j jVar2, float f7, float f10) {
                float f11 = f7 / 1000.0f;
                l lVar = l.this;
                LinearLayout linearLayout = lVar.x;
                linearLayout.setAlpha(f11);
                float L = i0.L(8.0f);
                float f12 = translationX;
                linearLayout.setTranslationX(i0.T1(f12 - L, 0.0f, f11));
                float L2 = i0.L(8.0f);
                float f13 = translationY;
                linearLayout.setTranslationY(i0.T1(f13 - L2, 0.0f, f11));
                i iVar2 = lVar.a;
                linearLayout.setPivotX(iVar2.getTranslationX() + i0.L(28.0f));
                linearLayout.setPivotY(iVar2.getTranslationY() + i0.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(i0.T1(iVar2.getWidth() / linearLayout.getWidth(), 1.0f, f11));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(i0.T1(iVar2.getHeight() / linearLayout.getHeight(), 1.0f, f11));
                }
                iVar2.setTranslationX(i0.T1(f12, (lVar.getWidth() / 2.0f) - i0.L(28.0f), f11));
                iVar2.setTranslationY(i0.T1(f13, (lVar.getHeight() / 2.0f) - i0.L(28.0f), f11));
                iVar2.setAlpha(1.0f - f11);
                window.setStatusBarColor(i0.b.f(f11, lVar.w, 2046820352));
                lVar.invalidate();
            }
        });
        jVar.a(new o1.f() { // from class: fg.g
            @Override // o1.f
            public final void a(o1.j jVar2, boolean z11, float f7, float f10) {
                l lVar = l.this;
                i iVar2 = lVar.a;
                iVar2.setTranslationX(translationX);
                iVar2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                lVar.x.setVisibility(8);
            }
        });
        jVar.h();
    }

    public final void d() {
        y j02 = t6.j0(i0.L(56.0f), t6.x0(null, t6.P9, false), t6.x0(null, t6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        eq eqVar = new eq(mutate, j02, 0, 0);
        int L = i0.L(56.0f);
        int L2 = i0.L(56.0f);
        eqVar.e = L;
        eqVar.f = L2;
        this.b = eqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        a7.y(this, drawable, t6.h5, null, mode);
        this.x.setBackground(drawable);
        a7.V(this.y, t6.j5, null);
        invalidate();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.n4) {
            d();
            this.D.getAdapter().f();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.x;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.e;
        float f7 = sharedPreferences.getFloat("x", -1.0f);
        float f10 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        i iVar = this.a;
        iVar.setTranslationX((f7 == -1.0f || f7 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        iVar.setTranslationY(f10 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f10));
        o1.j jVar = new o1.j(iVar, o1.j.o, iVar.getTranslationX());
        o1.k kVar = new o1.k(iVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.m = kVar;
        this.c = jVar;
        o1.j jVar2 = new o1.j(iVar, o1.j.p, iVar.getTranslationY());
        o1.k kVar2 = new o1.k(iVar.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.m = kVar2;
        this.d = jVar2;
        zs.e().c(this, zs.n4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        i iVar = this.a;
        iVar.setTranslationX(a(displayMetrics, iVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        iVar.setTranslationY(b(displayMetrics, iVar.getTranslationY()));
        this.c.m.i = iVar.getTranslationX();
        this.d.m.i = iVar.getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.d();
        this.d.d();
        zs.e().n(this, zs.n4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        i iVar = this.a;
        canvas.translate(iVar.getTranslationX(), iVar.getTranslationY());
        canvas.scale(iVar.getScaleX(), iVar.getScaleY(), iVar.getPivotX(), iVar.getPivotY());
        this.b.setAlpha((int) (iVar.getAlpha() * 255.0f));
        this.b.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
