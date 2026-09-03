package ag;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class o extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList B;
    public int C;
    public l a;
    public pq b;
    public o1.j c;
    public o1.j d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public g r;
    public boolean s;
    public int v;
    public LinearLayout w;
    public TextView x;
    public sl0 y;

    public static float a(DisplayMetrics displayMetrics, float f10) {
        return k7.o.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f10) {
        return k7.o.a(f10, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new f(0)));
        arrayList.add(new a("Show blur settings", new g(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new a(LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug), new g(this, 1)));
        arrayList.add(new a(k6.I.q() ? "Switch to day theme" : "Switch to dark theme", new f(1)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new g(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z4) {
        l lVar = this.a;
        ArrayList arrayList = this.B;
        if (this.s == z4) {
            return;
        }
        this.s = z4;
        if (z4) {
            this.w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                f5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).p0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).o0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z4) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = lVar.getTranslationX();
        final float translationY = lVar.getTranslationY();
        o1.j jVar = new o1.j(new kb.a(z4 ? 0.0f : 1000.0f));
        o1.k n10 = yh.n(1000.0f, 900.0f, 1.0f);
        n10.i = z4 ? 1000.0f : 0.0f;
        jVar.u = n10;
        jVar.b(new o1.g() { // from class: ag.i
            @Override // o1.g
            public final void a(o1.h hVar, float f10, float f11) {
                float f12 = f10 / 1000.0f;
                o oVar = o.this;
                LinearLayout linearLayout = oVar.w;
                linearLayout.setAlpha(f12);
                float dp = AndroidUtilities.dp(8.0f);
                float f13 = translationX;
                linearLayout.setTranslationX(AndroidUtilities.lerp(f13 - dp, 0.0f, f12));
                float dp2 = AndroidUtilities.dp(8.0f);
                float f14 = translationY;
                linearLayout.setTranslationY(AndroidUtilities.lerp(f14 - dp2, 0.0f, f12));
                l lVar2 = oVar.a;
                linearLayout.setPivotX(lVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(lVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(lVar2.getWidth() / linearLayout.getWidth(), 1.0f, f12));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(lVar2.getHeight() / linearLayout.getHeight(), 1.0f, f12));
                }
                lVar2.setTranslationX(AndroidUtilities.lerp(f13, (oVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                lVar2.setTranslationY(AndroidUtilities.lerp(f14, (oVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f12));
                lVar2.setAlpha(1.0f - f12);
                window.setStatusBarColor(i0.a.d(f12, oVar.v, 2046820352));
                oVar.invalidate();
            }
        });
        jVar.a(new o1.f() { // from class: ag.j
            @Override // o1.f
            public final void a(o1.h hVar, boolean z10, float f10, float f11) {
                o oVar = o.this;
                l lVar2 = oVar.a;
                lVar2.setTranslationX(translationX);
                lVar2.setTranslationY(translationY);
                if (z4) {
                    return;
                }
                oVar.w.setVisibility(8);
            }
        });
        jVar.f();
    }

    public final void d() {
        z h02 = k6.h0(AndroidUtilities.dp(56.0f), k6.w0(null, k6.P9, false), k6.w0(null, k6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        pq pqVar = new pq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        pqVar.e = dp;
        pqVar.f = dp2;
        this.b = pqVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        drawable.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.h5, false), mode));
        this.w.setBackground(drawable);
        this.x.setTextColor(k6.w0(null, k6.j5, false));
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout = this.w;
        if (view == linearLayout) {
            canvas.drawColor(Color.argb((int) (linearLayout.getAlpha() * 122.0f), 0, 0, 0));
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SharedPreferences sharedPreferences = this.e;
        float f10 = sharedPreferences.getFloat("x", -1.0f);
        float f11 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        l lVar = this.a;
        lVar.setTranslationX((f10 == -1.0f || f10 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        lVar.setTranslationY(f11 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f11));
        o1.j jVar = new o1.j(lVar, o1.h.m, lVar.getTranslationX());
        o1.k kVar = new o1.k(lVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.u = kVar;
        this.c = jVar;
        o1.j jVar2 = new o1.j(lVar, o1.h.n, lVar.getTranslationY());
        o1.k kVar2 = new o1.k(lVar.getTranslationY());
        kVar2.b(650.0f);
        kVar2.a(0.75f);
        jVar2.u = kVar2;
        this.d = jVar2;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.c();
        this.d.c();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        l lVar = this.a;
        lVar.setTranslationX(a(displayMetrics, lVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        lVar.setTranslationY(b(displayMetrics, lVar.getTranslationY()));
        this.c.u.i = lVar.getTranslationX();
        this.d.u.i = lVar.getTranslationY();
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
        l lVar = this.a;
        canvas.translate(lVar.getTranslationX(), lVar.getTranslationY());
        canvas.scale(lVar.getScaleX(), lVar.getScaleY(), lVar.getPivotX(), lVar.getPivotY());
        this.b.setAlpha((int) (lVar.getAlpha() * 255.0f));
        this.b.setBounds(lVar.getLeft(), lVar.getTop(), lVar.getRight(), lVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
