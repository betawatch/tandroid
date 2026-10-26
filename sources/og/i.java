package og;

import a8.ee;
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
import bh.p;
import java.util.ArrayList;
import java.util.List;
import o1.j;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d3;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public ArrayList E;
    public int F;
    public p a;
    public ar b;
    public j c;
    public j d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public c r;
    public boolean s;
    public int v;
    public LinearLayout w;
    public TextView x;
    public mm0 y;

    public static float a(DisplayMetrics displayMetrics, float f7) {
        return ee.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.widthPixels - AndroidUtilities.dp(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f7) {
        return ee.a(f7, AndroidUtilities.dp(16.0f), displayMetrics.heightPixels - AndroidUtilities.dp(72.0f));
    }

    private List<a> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a("Theme"));
        arrayList.add(new a("Draw action bar shadow", new ag.c(21)));
        arrayList.add(new a("Show blur settings", new c(this, 0)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugGeneral)));
        arrayList.add(new a(LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug), new c(this, 1)));
        arrayList.add(new a(y6.I.q() ? "Switch to day theme" : "Switch to dark theme", new ag.c(22)));
        arrayList.add(new a(LocaleController.getString(R.string.DebugSendLogs), new c(this, 2)));
        return arrayList;
    }

    public final void c(final boolean z10) {
        p pVar = this.a;
        ArrayList arrayList = this.E;
        if (this.s == z10) {
            return;
        }
        this.s = z10;
        if (z10) {
            this.w.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                j5 O = ((LaunchActivity) getContext()).O();
                if (O instanceof b) {
                    arrayList.addAll(((b) O).B());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).s0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.B());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).r0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.B());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.y.getAdapter().l();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z10) {
            this.v = window.getStatusBarColor();
        }
        final float translationX = pVar.getTranslationX();
        final float translationY = pVar.getTranslationY();
        j jVar = new j(new ac.a(z10 ? 0.0f : 1000.0f));
        k l4 = d3.l(1000.0f, 900.0f, 1.0f);
        l4.i = z10 ? 1000.0f : 0.0f;
        jVar.u = l4;
        jVar.b(new o1.g() { // from class: og.d
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
                p pVar2 = iVar.a;
                linearLayout.setPivotX(pVar2.getTranslationX() + AndroidUtilities.dp(28.0f));
                linearLayout.setPivotY(pVar2.getTranslationY() + AndroidUtilities.dp(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(AndroidUtilities.lerp(pVar2.getWidth() / linearLayout.getWidth(), 1.0f, f11));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(AndroidUtilities.lerp(pVar2.getHeight() / linearLayout.getHeight(), 1.0f, f11));
                }
                pVar2.setTranslationX(AndroidUtilities.lerp(f12, (iVar.getWidth() / 2.0f) - AndroidUtilities.dp(28.0f), f11));
                pVar2.setTranslationY(AndroidUtilities.lerp(f13, (iVar.getHeight() / 2.0f) - AndroidUtilities.dp(28.0f), f11));
                pVar2.setAlpha(1.0f - f11);
                window.setStatusBarColor(i0.a.f(f11, iVar.v, 2046820352));
                iVar.invalidate();
            }
        });
        jVar.a(new o1.f() { // from class: og.e
            @Override // o1.f
            public final void a(o1.h hVar, boolean z11, float f7, float f10) {
                i iVar = i.this;
                p pVar2 = iVar.a;
                pVar2.setTranslationX(translationX);
                pVar2.setTranslationY(translationY);
                if (z10) {
                    return;
                }
                iVar.w.setVisibility(8);
            }
        });
        jVar.h();
    }

    public final void d() {
        y i02 = y6.i0(AndroidUtilities.dp(56.0f), y6.x0(null, y6.P9, false), y6.x0(null, y6.Q9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        ar arVar = new ar(mutate, i02, 0, 0);
        int dp = AndroidUtilities.dp(56.0f);
        int dp2 = AndroidUtilities.dp(56.0f);
        arVar.e = dp;
        arVar.f = dp2;
        this.b = arVar;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        f7.y(this, drawable, y6.h5, null, mode);
        this.w.setBackground(drawable);
        f7.V(this.x, y6.j5, null);
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
        float f7 = sharedPreferences.getFloat("x", -1.0f);
        float f10 = sharedPreferences.getFloat("y", -1.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        p pVar = this.a;
        pVar.setTranslationX((f7 == -1.0f || f7 >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.14748365E9f) : a(displayMetrics, -2.14748365E9f));
        pVar.setTranslationY(f10 == -1.0f ? b(displayMetrics, 2.14748365E9f) : b(displayMetrics, f10));
        j jVar = new j(pVar, o1.h.m, pVar.getTranslationX());
        k kVar = new k(pVar.getTranslationX());
        kVar.b(650.0f);
        kVar.a(0.75f);
        jVar.u = kVar;
        this.c = jVar;
        j jVar2 = new j(pVar, o1.h.n, pVar.getTranslationY());
        k kVar2 = new k(pVar.getTranslationY());
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
        p pVar = this.a;
        pVar.setTranslationX(a(displayMetrics, pVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.14748365E9f : -2.14748365E9f));
        pVar.setTranslationY(b(displayMetrics, pVar.getTranslationY()));
        this.c.u.i = pVar.getTranslationX();
        this.d.u.i = pVar.getTranslationY();
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
        p pVar = this.a;
        canvas.translate(pVar.getTranslationX(), pVar.getTranslationY());
        canvas.scale(pVar.getScaleX(), pVar.getScaleY(), pVar.getPivotX(), pVar.getPivotY());
        this.b.setAlpha((int) (pVar.getAlpha() * 255.0f));
        this.b.setBounds(pVar.getLeft(), pVar.getTop(), pVar.getRight(), pVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
