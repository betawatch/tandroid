// default package

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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ll4 extends FrameLayout implements fn7 {
    public d79 E;
    public ArrayList F;
    public int G;
    public tt a;
    public zm2 b;
    public vpa c;
    public vpa d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public gl4 r;
    public boolean s;
    public int w;
    public LinearLayout x;
    public TextView y;

    public static float a(DisplayMetrics displayMetrics, float f) {
        return ete.a(f, hl.L(16.0f), displayMetrics.widthPixels - hl.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f) {
        return ete.a(f, hl.L(16.0f), displayMetrics.heightPixels - hl.L(72.0f));
    }

    private List<dl4> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new dl4("Theme"));
        arrayList.add(new dl4("Draw action bar shadow", new jm3((byte) 7)));
        arrayList.add(new dl4("Show blur settings", new gl4(this, (byte) 0)));
        arrayList.add(new dl4(ob6.M0(2131751612, null)));
        arrayList.add(new dl4(ob6.M0(xea.F0 ? 2131751603 : 2131751595, null), new gl4(this, (byte) 1)));
        arrayList.add(new dl4(aob.I.o() ? "Switch to day theme" : "Switch to dark theme", new jm3((byte) 8)));
        arrayList.add(new dl4(ob6.M0(2131751578, null), new gl4(this, (byte) 2)));
        return arrayList;
    }

    public final void c(final boolean z) {
        tt ttVar = this.a;
        ArrayList arrayList = this.F;
        if (this.s == z) {
            return;
        }
        this.s = z;
        if (z) {
            this.x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                wk5 N = ((LaunchActivity) getContext()).N();
                if (N instanceof el4) {
                    arrayList.addAll(((el4) N).D());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).r0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.D());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).q0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.D());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z) {
            this.w = window.getStatusBarColor();
        }
        final float translationX = ttVar.getTranslationX();
        final float translationY = ttVar.getTranslationY();
        vpa vpaVar = new vpa(new xk4(z ? 0.0f : 1000.0f));
        wpa j = bp1.j(1000.0f, 900.0f, 1.0f);
        j.i = z ? 1000.0f : 0.0f;
        vpaVar.m = j;
        vpaVar.b(new qs3() { // from class: hl4
            @Override // qs3
            public final void a(vpa vpaVar2, float f, float f2) {
                float f3 = f / 1000.0f;
                ll4 ll4Var = ll4.this;
                LinearLayout linearLayout = ll4Var.x;
                linearLayout.setAlpha(f3);
                float L = hl.L(8.0f);
                float f4 = translationX;
                linearLayout.setTranslationX(hl.R1(f4 - L, 0.0f, f3));
                float L2 = hl.L(8.0f);
                float f5 = translationY;
                linearLayout.setTranslationY(hl.R1(f5 - L2, 0.0f, f3));
                tt ttVar2 = ll4Var.a;
                linearLayout.setPivotX(ttVar2.getTranslationX() + hl.L(28.0f));
                linearLayout.setPivotY(ttVar2.getTranslationY() + hl.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(hl.R1(ttVar2.getWidth() / linearLayout.getWidth(), 1.0f, f3));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(hl.R1(ttVar2.getHeight() / linearLayout.getHeight(), 1.0f, f3));
                }
                ttVar2.setTranslationX(hl.R1(f4, (ll4Var.getWidth() / 2.0f) - hl.L(28.0f), f3));
                ttVar2.setTranslationY(hl.R1(f5, (ll4Var.getHeight() / 2.0f) - hl.L(28.0f), f3));
                ttVar2.setAlpha(1.0f - f3);
                window.setStatusBarColor(vm2.f(f3, ll4Var.w, 2046820352));
                ll4Var.invalidate();
            }
        });
        vpaVar.a(new ps3() { // from class: il4
            @Override // ps3
            public final void a(vpa vpaVar2, boolean z2, float f, float f2) {
                ll4 ll4Var = ll4.this;
                tt ttVar2 = ll4Var.a;
                ttVar2.setTranslationX(translationX);
                ttVar2.setTranslationY(translationY);
                if (z) {
                    return;
                }
                ll4Var.x.setVisibility(8);
            }
        });
        vpaVar.h();
    }

    public final void d() {
        hf0 h0 = aob.h0(hl.L(56.0f), aob.w0(null, aob.P9, false), aob.w0(null, aob.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        zm2 zm2Var = new zm2(mutate, h0, 0, 0);
        int L = hl.L(56.0f);
        int L2 = hl.L(56.0f);
        zm2Var.e = L;
        zm2Var.f = L2;
        this.b = zm2Var;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        yob.x(this, drawable, aob.h5, null, mode);
        this.x.setBackground(drawable);
        yob.X(this.y, aob.j5, null);
        invalidate();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.q4) {
            d();
            this.E.getAdapter().f();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        LinearLayout linearLayout = this.x;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.e;
        float f = sharedPreferences.getFloat("x", -1.0f);
        float f2 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        tt ttVar = this.a;
        ttVar.setTranslationX((f == -1.0f || f >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.1474836E9f) : a(displayMetrics, -2.1474836E9f));
        ttVar.setTranslationY(f2 == -1.0f ? b(displayMetrics, 2.1474836E9f) : b(displayMetrics, f2));
        vpa vpaVar = new vpa(ttVar, vpa.o, ttVar.getTranslationX());
        wpa wpaVar = new wpa(ttVar.getTranslationX());
        wpaVar.b(650.0f);
        wpaVar.a(0.75f);
        vpaVar.m = wpaVar;
        this.c = vpaVar;
        vpa vpaVar2 = new vpa(ttVar, vpa.p, ttVar.getTranslationY());
        wpa wpaVar2 = new wpa(ttVar.getTranslationY());
        wpaVar2.b(650.0f);
        wpaVar2.a(0.75f);
        vpaVar2.m = wpaVar2;
        this.d = vpaVar2;
        jn7.e().b(this, jn7.q4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        tt ttVar = this.a;
        ttVar.setTranslationX(a(displayMetrics, ttVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.1474836E9f : -2.1474836E9f));
        ttVar.setTranslationY(b(displayMetrics, ttVar.getTranslationY()));
        this.c.m.i = ttVar.getTranslationX();
        this.d.m.i = ttVar.getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.d();
        this.d.d();
        jn7.e().n(this, jn7.q4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        tt ttVar = this.a;
        canvas.translate(ttVar.getTranslationX(), ttVar.getTranslationY());
        canvas.scale(ttVar.getScaleX(), ttVar.getScaleY(), ttVar.getPivotX(), ttVar.getPivotY());
        this.b.setAlpha((int) (ttVar.getAlpha() * 255.0f));
        this.b.setBounds(ttVar.getLeft(), ttVar.getTop(), ttVar.getRight(), ttVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
