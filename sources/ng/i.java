package ng;

import ah.j;
import ah.w;
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
import o1.k;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.LaunchActivity;
import w7.p;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList E;
    public int F;
    public w a;
    public oq b;
    public k c;
    public k d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public c r;
    public boolean s;
    public int v;
    public LinearLayout w;
    public TextView x;
    public ll0 y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return p.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return p.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new j(15)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new a(LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug), new c(this, 1)));
        arrayList.add(new a(j6.I.q() ? "Switch to day theme" : "Switch to dark theme", new j(16)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        w wVar = this.a;
        ArrayList arrayList = this.E;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        if (z10) {
            this.w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                d5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).A());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.A());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.A());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = wVar.getTranslationX();
        final float translationY = wVar.getTranslationY();
        k kVar = new k(new o1.j(z10 ? 0.0f : 1000.0f));
        l l4 = p6.l(1000.0f, 900.0f, 1.0f);
        l4.i = z10 ? 1000.0f : 0.0f;
        kVar.u = l4;
        kVar.b(new o1.g() { // from class: ng.d
            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                float f11 = f7 / 1000.0f;
                i iVar = i.this;
                LinearLayout linearLayout = iVar.w;
                linearLayout.setAlpha(f11);
                float dp = AndroidUtilities.dp(8.0f);
                float f12 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f12 - dp, 0.0f, f11));
                float dp2 = AndroidUtilities.dp(8.0f);
                float f13 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f13 - dp2, 0.0f, f11));
                w wVar2 = iVar.a;
                linearLayout.setPivotX(wVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(wVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(wVar2.getWidth() / linearLayout.getWidth(), 1.0f, f11));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(wVar2.getHeight() / linearLayout.getHeight(), 1.0f, f11));
                }
                wVar2.setTranslationX(AndroidUtilities.lerp(f12, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f11));
                wVar2.setTranslationY(AndroidUtilities.lerp(f13, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f11));
                wVar2.setAlpha(1.0f - f11);
                window.setStatusBarColor(i0.a.d(f11, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        kVar.a(new o1.f() { // from class: ng.e
            @Override // o1.f
            public final void a(o1.h hVar, boolean z11, float f7, float f10) {
                i iVar = i.this;
                w wVar2 = iVar.a;
                wVar2.setTranslationX(translationX);
                wVar2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                iVar.w.setVisibility(8);
            }
        });
        kVar.f();
    }

    public final void d() {
        z h02 = j6.h0(AndroidUtilities.dp(56.0f), j6.w0(null, j6.P9, false), j6.w0(null, j6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        oq oqVar = new oq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        oqVar.e = dp;
        oqVar.f = dp2;
        this.b = oqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.h5, false), mode));
        this.w.setBackground(drawable);
        this.x.setTextColor(j6.w0(null, j6.j5, false));
        invalidate();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didSetNewTheme) {
            d();
            this.y.getAdapter().l();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout = this.w;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.e;
        float f7 = sharedPreferences.getFloat("x", -1.0f);
        float f10 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w wVar = this.a;
        wVar.setTranslationX((f7 == -1.0f || f7 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        wVar.setTranslationY(f10 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f10));
        k kVar = new k(wVar, o1.h.m, wVar.getTranslationX());
        l lVar = new l(wVar.getTranslationX());
        lVar.b(650.0f);
        lVar.a(0.75f);
        kVar.u = lVar;
        this.c = kVar;
        k kVar2 = new k(wVar, o1.h.n, wVar.getTranslationY());
        l lVar2 = new l(wVar.getTranslationY());
        lVar2.b(650.0f);
        lVar2.a(0.75f);
        kVar2.u = lVar2;
        this.d = kVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        w wVar = this.a;
        wVar.setTranslationX(a(displayMetrics, wVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        wVar.setTranslationY(b(displayMetrics, wVar.getTranslationY()));
        this.c.u.i = wVar.getTranslationX();
        this.d.u.i = wVar.getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.c();
        this.d.c();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        w wVar = this.a;
        canvas.translate(wVar.getTranslationX(), wVar.getTranslationY());
        canvas.scale(wVar.getScaleX(), wVar.getScaleY(), wVar.getPivotX(), wVar.getPivotY());
        this.b.setAlpha((int) (wVar.getAlpha() * 255.0f));
        this.b.setBounds(wVar.getLeft(), wVar.getTop(), wVar.getRight(), wVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
