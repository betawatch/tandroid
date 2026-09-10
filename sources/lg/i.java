package lg;

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
import bi.f0;
import bi.n7;
import java.util.ArrayList;
import java.util.List;
import o1.j;
import o1.k;
import o1.l;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r6;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.LaunchActivity;
import w7.q;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList E;
    public int F;
    public n7 a;
    public vq b;
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
    public vl0 y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return q.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return q.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new f0(8)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new a(LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug), new c(this, 1)));
        arrayList.add(new a(j6.I.q() ? "Switch to day theme" : "Switch to dark theme", new f0(9)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        n7 n7Var = this.a;
        ArrayList arrayList = this.E;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        if (z10) {
            this.w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                f5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).z());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.z());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.z());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = n7Var.getTranslationX();
        final float translationY = n7Var.getTranslationY();
        k kVar = new k(new j(z10 ? 0.0f : 1000.0f));
        l l4 = r6.l(1000.0f, 900.0f, 1.0f);
        l4.i = z10 ? 1000.0f : 0.0f;
        kVar.u = l4;
        kVar.b(new o1.g() { // from class: lg.d
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
                n7 n7Var2 = iVar.a;
                linearLayout.setPivotX(n7Var2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(n7Var2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(n7Var2.getWidth() / linearLayout.getWidth(), 1.0f, f11));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(n7Var2.getHeight() / linearLayout.getHeight(), 1.0f, f11));
                }
                n7Var2.setTranslationX(AndroidUtilities.lerp(f12, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f11));
                n7Var2.setTranslationY(AndroidUtilities.lerp(f13, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f11));
                n7Var2.setAlpha(1.0f - f11);
                window.setStatusBarColor(i0.a.d(f11, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        kVar.a(new o1.f() { // from class: lg.e
            @Override // o1.f
            public final void a(o1.h hVar, boolean z11, float f7, float f10) {
                i iVar = i.this;
                n7 n7Var2 = iVar.a;
                n7Var2.setTranslationX(translationX);
                n7Var2.setTranslationY(translationY);
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
        vq vqVar = new vq(mutate, h02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        vqVar.e = dp;
        vqVar.f = dp2;
        this.b = vqVar;
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
        n7 n7Var = this.a;
        n7Var.setTranslationX((f7 == -1.0f || f7 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        n7Var.setTranslationY(f10 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f10));
        k kVar = new k(n7Var, o1.h.m, n7Var.getTranslationX());
        l lVar = new l(n7Var.getTranslationX());
        lVar.b(650.0f);
        lVar.a(0.75f);
        kVar.u = lVar;
        this.c = kVar;
        k kVar2 = new k(n7Var, o1.h.n, n7Var.getTranslationY());
        l lVar2 = new l(n7Var.getTranslationY());
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
        n7 n7Var = this.a;
        n7Var.setTranslationX(a(displayMetrics, n7Var.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        n7Var.setTranslationY(b(displayMetrics, n7Var.getTranslationY()));
        this.c.u.i = n7Var.getTranslationX();
        this.d.u.i = n7Var.getTranslationY();
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
        n7 n7Var = this.a;
        canvas.translate(n7Var.getTranslationX(), n7Var.getTranslationY());
        canvas.scale(n7Var.getScaleX(), n7Var.getScaleY(), n7Var.getPivotX(), n7Var.getPivotY());
        this.b.setAlpha((int) (n7Var.getAlpha() * 255.0f));
        this.b.setBounds(n7Var.getLeft(), n7Var.getTop(), n7Var.getRight(), n7Var.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
