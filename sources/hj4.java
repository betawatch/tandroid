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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hj4 extends FrameLayout implements gk7 {
    public o39 E;
    public ArrayList F;
    public int G;
    public st a;
    public fm2 b;
    public yla c;
    public yla d;
    public SharedPreferences e;
    public boolean f;
    public boolean h;
    public boolean n;
    public cj4 r;
    public boolean s;
    public int w;
    public LinearLayout x;
    public TextView y;

    public static float a(DisplayMetrics displayMetrics, float f) {
        return moe.a(f, gl.L(16.0f), displayMetrics.widthPixels - gl.L(72.0f));
    }

    public static float b(DisplayMetrics displayMetrics, float f) {
        return moe.a(f, gl.L(16.0f), displayMetrics.heightPixels - gl.L(72.0f));
    }

    private List<zi4> getBuiltInDebugItems() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zi4("Theme"));
        arrayList.add(new zi4("Draw action bar shadow", new ql3((byte) 5)));
        arrayList.add(new zi4("Show blur settings", new cj4(this, (byte) 0)));
        arrayList.add(new zi4(k96.M0(2131751635, null)));
        arrayList.add(new zi4(k96.M0(gba.F0 ? 2131751626 : 2131751618, null), new cj4(this, (byte) 1)));
        arrayList.add(new zi4(bkb.I.o() ? "Switch to day theme" : "Switch to dark theme", new ql3((byte) 6)));
        arrayList.add(new zi4(k96.M0(2131751601, null), new cj4(this, (byte) 2)));
        return arrayList;
    }

    public final void c(final boolean z) {
        st stVar = this.a;
        ArrayList arrayList = this.F;
        if (this.s == z) {
            return;
        }
        this.s = z;
        if (z) {
            this.x.setVisibility(0);
            arrayList.clear();
            if (getContext() instanceof LaunchActivity) {
                ui5 N = ((LaunchActivity) getContext()).N();
                if (N instanceof aj4) {
                    arrayList.addAll(((aj4) N).E());
                }
                ActionBarLayout actionBarLayout = ((LaunchActivity) getContext()).r0;
                if (actionBarLayout != null) {
                    arrayList.addAll(actionBarLayout.E());
                }
                ActionBarLayout actionBarLayout2 = ((LaunchActivity) getContext()).q0;
                if (actionBarLayout2 != null) {
                    arrayList.addAll(actionBarLayout2.E());
                }
            }
            arrayList.addAll(getBuiltInDebugItems());
            this.E.getAdapter().f();
        }
        final Window window = ((Activity) getContext()).getWindow();
        if (z) {
            this.w = window.getStatusBarColor();
        }
        final float translationX = stVar.getTranslationX();
        final float translationY = stVar.getTranslationY();
        yla ylaVar = new yla(new ti4(z ? 0.0f : 1000.0f));
        zla j = oo1.j(1000.0f, 900.0f, 1.0f);
        j.i = z ? 1000.0f : 0.0f;
        ylaVar.m = j;
        ylaVar.b(new yr3() { // from class: dj4
            @Override // yr3
            public final void a(yla ylaVar2, float f, float f2) {
                float f3 = f / 1000.0f;
                hj4 hj4Var = hj4.this;
                LinearLayout linearLayout = hj4Var.x;
                linearLayout.setAlpha(f3);
                float L = gl.L(8.0f);
                float f4 = translationX;
                linearLayout.setTranslationX(gl.R1(f4 - L, 0.0f, f3));
                float L2 = gl.L(8.0f);
                float f5 = translationY;
                linearLayout.setTranslationY(gl.R1(f5 - L2, 0.0f, f3));
                st stVar2 = hj4Var.a;
                linearLayout.setPivotX(stVar2.getTranslationX() + gl.L(28.0f));
                linearLayout.setPivotY(stVar2.getTranslationY() + gl.L(28.0f));
                if (linearLayout.getWidth() != 0) {
                    linearLayout.setScaleX(gl.R1(stVar2.getWidth() / linearLayout.getWidth(), 1.0f, f3));
                }
                if (linearLayout.getHeight() != 0) {
                    linearLayout.setScaleY(gl.R1(stVar2.getHeight() / linearLayout.getHeight(), 1.0f, f3));
                }
                stVar2.setTranslationX(gl.R1(f4, (hj4Var.getWidth() / 2.0f) - gl.L(28.0f), f3));
                stVar2.setTranslationY(gl.R1(f5, (hj4Var.getHeight() / 2.0f) - gl.L(28.0f), f3));
                stVar2.setAlpha(1.0f - f3);
                window.setStatusBarColor(bm2.f(f3, hj4Var.w, 2046820352));
                hj4Var.invalidate();
            }
        });
        ylaVar.a(new xr3() { // from class: ej4
            @Override // xr3
            public final void a(yla ylaVar2, boolean z2, float f, float f2) {
                hj4 hj4Var = hj4.this;
                st stVar2 = hj4Var.a;
                stVar2.setTranslationX(translationX);
                stVar2.setTranslationY(translationY);
                if (z) {
                    return;
                }
                hj4Var.x.setVisibility(8);
            }
        });
        ylaVar.h();
    }

    public final void d() {
        ff0 h0 = bkb.h0(gl.L(56.0f), bkb.w0(null, bkb.O9, false), bkb.w0(null, bkb.P9, false));
        Drawable mutate = getResources().getDrawable(R.drawable.floating_shadow).mutate();
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, mode));
        fm2 fm2Var = new fm2(mutate, h0, 0, 0);
        int L = gl.L(56.0f);
        int L2 = gl.L(56.0f);
        fm2Var.e = L;
        fm2Var.f = L2;
        this.b = fm2Var;
        Drawable drawable = getResources().getDrawable(R.drawable.popup_fixed_alert3);
        zkb.x(this, drawable, bkb.g5, null, mode);
        this.x.setBackground(drawable);
        zkb.X(this.y, bkb.i5, null);
        invalidate();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.p4) {
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
        st stVar = this.a;
        stVar.setTranslationX((f == -1.0f || f >= ((float) displayMetrics.widthPixels) / 2.0f) ? a(displayMetrics, 2.1474836E9f) : a(displayMetrics, -2.1474836E9f));
        stVar.setTranslationY(f2 == -1.0f ? b(displayMetrics, 2.1474836E9f) : b(displayMetrics, f2));
        yla ylaVar = new yla(stVar, yla.o, stVar.getTranslationX());
        zla zlaVar = new zla(stVar.getTranslationX());
        zlaVar.b(650.0f);
        zlaVar.a(0.75f);
        ylaVar.m = zlaVar;
        this.c = ylaVar;
        yla ylaVar2 = new yla(stVar, yla.p, stVar.getTranslationY());
        zla zlaVar2 = new zla(stVar.getTranslationY());
        zlaVar2.b(650.0f);
        zlaVar2.a(0.75f);
        ylaVar2.m = zlaVar2;
        this.d = ylaVar2;
        kk7.e().b(this, kk7.p4);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c.d();
        this.d.d();
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        st stVar = this.a;
        stVar.setTranslationX(a(displayMetrics, stVar.getTranslationX() >= ((float) displayMetrics.widthPixels) / 2.0f ? 2.1474836E9f : -2.1474836E9f));
        stVar.setTranslationY(b(displayMetrics, stVar.getTranslationY()));
        this.c.m.i = stVar.getTranslationX();
        this.d.m.i = stVar.getTranslationY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.d();
        this.d.d();
        kk7.e().n(this, kk7.p4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        st stVar = this.a;
        canvas.translate(stVar.getTranslationX(), stVar.getTranslationY());
        canvas.scale(stVar.getScaleX(), stVar.getScaleY(), stVar.getPivotX(), stVar.getPivotY());
        this.b.setAlpha((int) (stVar.getAlpha() * 255.0f));
        this.b.setBounds(stVar.getLeft(), stVar.getTop(), stVar.getRight(), stVar.getBottom());
        this.b.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.s;
    }
}
