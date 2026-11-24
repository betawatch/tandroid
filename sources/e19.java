// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e19 extends FrameLayout {
    public final s09 a;
    public final s09 b;
    public final fg0 c;
    public xr8 d;
    public d19 e;
    public int f;

    public e19(Activity activity) {
        super(activity);
        this.f = 0;
        setWillNotDraw(false);
        s09 s09Var = new s09(activity);
        this.a = s09Var;
        s09 s09Var2 = new s09(activity);
        this.b = s09Var2;
        s09Var.f(R.raw.star_stroke, 37, 37, null);
        s09Var2.f(R.raw.star_fill, 37, 37, null);
        s09Var2.setAlpha(0.0f);
        addView(s09Var, qoe.c(37.0f, 37));
        addView(s09Var2, qoe.c(37.0f, 37));
        fg0 h0 = cmb.h0(gm.L(37.0f), 0, on2.p(-1, 76));
        this.c = h0;
        h0.setCallback(this);
        setClickable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        d19 d19Var;
        int action = motionEvent.getAction();
        byte b = 0;
        if (action == 0) {
            d19 d19Var2 = this.e;
            if (d19Var2 != null) {
                e19[] e19VarArr = (e19[]) ((jp0) ((h68) d19Var2).b).d;
                while (true) {
                    if (b > this.f) {
                        break;
                    }
                    e19 e19Var = e19VarArr[b];
                    s09 s09Var = e19Var.a;
                    s09 s09Var2 = e19Var.b;
                    s09Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    s09Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    b++;
                }
                for (int i = r7 + 1; i < e19VarArr.length; i++) {
                    e19 e19Var2 = e19VarArr[i];
                    s09 s09Var3 = e19Var2.a;
                    s09 s09Var4 = e19Var2.b;
                    s09Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    s09Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            d19 d19Var3 = this.e;
            if (d19Var3 != null) {
                e19[] e19VarArr2 = (e19[]) ((jp0) ((h68) d19Var3).b).d;
                for (int i2 = 0; i2 <= this.f; i2++) {
                    e19 e19Var3 = e19VarArr2[i2];
                    s09 s09Var5 = e19Var3.a;
                    s09 s09Var6 = e19Var3.b;
                    s09Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    s09Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                xr8 xr8Var = this.d;
                float width = (getWidth() / 2.0f) + i3;
                float height = (getHeight() / 2.0f) + i4;
                int i5 = this.f + 1;
                jp0 jp0Var = (jp0) xr8Var.b;
                Activity activity = (Activity) xr8Var.c;
                if (i5 >= 4) {
                    s09 s09Var7 = new s09(activity);
                    int L = gm.L(133.0f);
                    s09Var7.f(R.raw.rate, nm7.Q1, nm7.Q1, null);
                    int[] iArr2 = new int[2];
                    jp0Var.getLocationOnScreen(iArr2);
                    int i6 = iArr2[0];
                    int i7 = iArr2[1];
                    jp0Var.addView(s09Var7, qoe.c(133.0f, nm7.Q1));
                    float f = L / 2.0f;
                    s09Var7.setTranslationX((width - i6) - f);
                    s09Var7.setTranslationY((height - i7) - f);
                    s09Var7.setOnAnimationEndListener(new c19(jp0Var, s09Var7, b));
                    s09Var7.d();
                }
                shc shcVar = (shc) jp0Var.e;
                if (shcVar != null) {
                    shcVar.b.M = i5;
                }
            }
        } else if (action == 3 && (d19Var = this.e) != null) {
            for (e19 e19Var4 : (e19[]) ((jp0) ((h68) d19Var).b).d) {
                s09 s09Var8 = e19Var4.a;
                s09 s09Var9 = e19Var4.b;
                s09Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                s09Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fg0 fg0Var = this.c;
        if (fg0Var != null) {
            fg0Var.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        fg0 fg0Var = this.c;
        if (fg0Var != null) {
            fg0Var.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        fg0 fg0Var = this.c;
        fg0Var.setBounds(0, 0, width, height);
        fg0Var.draw(canvas);
    }

    public void setAllStarsProvider(d19 d19Var) {
        this.e = d19Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
