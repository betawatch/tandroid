// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class dz8 extends FrameLayout {
    public final ry8 a;
    public final ry8 b;
    public final ff0 c;
    public kq8 d;
    public cz8 e;
    public int f;

    public dz8(Activity activity) {
        super(activity);
        this.f = 0;
        setWillNotDraw(false);
        ry8 ry8Var = new ry8(activity);
        this.a = ry8Var;
        ry8 ry8Var2 = new ry8(activity);
        this.b = ry8Var2;
        ry8Var.f(R.raw.star_stroke, 37, 37, null);
        ry8Var2.f(R.raw.star_fill, 37, 37, null);
        ry8Var2.setAlpha(0.0f);
        addView(ry8Var, nme.c(37.0f, 37));
        addView(ry8Var2, nme.c(37.0f, 37));
        ff0 h0 = bkb.h0(gl.L(37.0f), 0, bm2.o(-1, 76));
        this.c = h0;
        h0.setCallback(this);
        setClickable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cz8 cz8Var;
        int action = motionEvent.getAction();
        byte b = 0;
        if (action == 0) {
            cz8 cz8Var2 = this.e;
            if (cz8Var2 != null) {
                dz8[] dz8VarArr = (dz8[]) ((jo0) ((k88) cz8Var2).b).d;
                while (true) {
                    if (b > this.f) {
                        break;
                    }
                    dz8 dz8Var = dz8VarArr[b];
                    ry8 ry8Var = dz8Var.a;
                    ry8 ry8Var2 = dz8Var.b;
                    ry8Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ry8Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    b++;
                }
                for (int i = r7 + 1; i < dz8VarArr.length; i++) {
                    dz8 dz8Var2 = dz8VarArr[i];
                    ry8 ry8Var3 = dz8Var2.a;
                    ry8 ry8Var4 = dz8Var2.b;
                    ry8Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ry8Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            cz8 cz8Var3 = this.e;
            if (cz8Var3 != null) {
                dz8[] dz8VarArr2 = (dz8[]) ((jo0) ((k88) cz8Var3).b).d;
                for (int i2 = 0; i2 <= this.f; i2++) {
                    dz8 dz8Var3 = dz8VarArr2[i2];
                    ry8 ry8Var5 = dz8Var3.a;
                    ry8 ry8Var6 = dz8Var3.b;
                    ry8Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ry8Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                kq8 kq8Var = this.d;
                float width = (getWidth() / 2.0f) + i3;
                float height = (getHeight() / 2.0f) + i4;
                int i5 = this.f + 1;
                jo0 jo0Var = (jo0) kq8Var.b;
                Activity activity = (Activity) kq8Var.c;
                if (i5 >= 4) {
                    ry8 ry8Var7 = new ry8(activity);
                    int L = gl.L(133.0f);
                    ry8Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    jo0Var.getLocationOnScreen(iArr2);
                    int i6 = iArr2[0];
                    int i7 = iArr2[1];
                    jo0Var.addView(ry8Var7, nme.c(133.0f, 133));
                    float f = L / 2.0f;
                    ry8Var7.setTranslationX((width - i6) - f);
                    ry8Var7.setTranslationY((height - i7) - f);
                    ry8Var7.setOnAnimationEndListener(new bz8(jo0Var, ry8Var7, b));
                    ry8Var7.d();
                }
                rfc rfcVar = (rfc) jo0Var.e;
                if (rfcVar != null) {
                    rfcVar.b.M = i5;
                }
            }
        } else if (action == 3 && (cz8Var = this.e) != null) {
            for (dz8 dz8Var4 : (dz8[]) ((jo0) ((k88) cz8Var).b).d) {
                ry8 ry8Var8 = dz8Var4.a;
                ry8 ry8Var9 = dz8Var4.b;
                ry8Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                ry8Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ff0 ff0Var = this.c;
        if (ff0Var != null) {
            ff0Var.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        ff0 ff0Var = this.c;
        if (ff0Var != null) {
            ff0Var.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        ff0 ff0Var = this.c;
        ff0Var.setBounds(0, 0, width, height);
        ff0Var.draw(canvas);
    }

    public void setAllStarsProvider(cz8 cz8Var) {
        this.e = cz8Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
