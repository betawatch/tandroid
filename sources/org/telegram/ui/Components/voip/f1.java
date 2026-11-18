package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c8.ma;
import di.n4;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.sb1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f1 extends FrameLayout {
    public final ph0 a;
    public final ph0 b;
    public final org.telegram.ui.Cells.y c;
    public org.telegram.ui.Components.g2 d;
    public e1 e;
    public int f;

    public f1(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        ph0 ph0Var = new ph0(context);
        this.a = ph0Var;
        ph0 ph0Var2 = new ph0(context);
        this.b = ph0Var2;
        ph0Var.f(R.raw.star_stroke, 37, 37, null);
        ph0Var2.f(R.raw.star_fill, 37, 37, null);
        ph0Var2.setAlpha(0.0f);
        addView(ph0Var, ma.c(37.0f, 37));
        addView(ph0Var2, ma.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = n6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        e1 e1Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action == 0) {
            e1 e1Var2 = this.e;
            if (e1Var2 != null) {
                f1[] f1VarArr = (f1[]) ((n4) ((org.telegram.ui.ActionBar.p) e1Var2).b).d;
                while (true) {
                    i7 = this.f;
                    if (i10 > i7) {
                        break;
                    }
                    f1 f1Var = f1VarArr[i10];
                    ph0 ph0Var = f1Var.a;
                    ph0 ph0Var2 = f1Var.b;
                    ph0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ph0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i11 = i7 + 1; i11 < f1VarArr.length; i11++) {
                    f1 f1Var2 = f1VarArr[i11];
                    ph0 ph0Var3 = f1Var2.a;
                    ph0 ph0Var4 = f1Var2.b;
                    ph0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ph0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            e1 e1Var3 = this.e;
            if (e1Var3 != null) {
                f1[] f1VarArr2 = (f1[]) ((n4) ((org.telegram.ui.ActionBar.p) e1Var3).b).d;
                for (int i12 = 0; i12 <= this.f; i12++) {
                    f1 f1Var3 = f1VarArr2[i12];
                    ph0 ph0Var5 = f1Var3.a;
                    ph0 ph0Var6 = f1Var3.b;
                    ph0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ph0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i13 = iArr[0];
                int i14 = iArr[1];
                org.telegram.ui.Components.g2 g2Var = this.d;
                float width = (getWidth() / 2.0f) + i13;
                float height = (getHeight() / 2.0f) + i14;
                int i15 = this.f + 1;
                n4 n4Var = (n4) g2Var.b;
                Context context = (Context) g2Var.c;
                if (i15 >= 4) {
                    ph0 ph0Var7 = new ph0(context);
                    int L = org.telegram.messenger.g0.L(133.0f);
                    ph0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    n4Var.getLocationOnScreen(iArr2);
                    int i16 = iArr2[0];
                    int i17 = iArr2[1];
                    n4Var.addView(ph0Var7, ma.c(133.0f, 133));
                    float f10 = L / 2.0f;
                    ph0Var7.setTranslationX((width - i16) - f10);
                    ph0Var7.setTranslationY((height - i17) - f10);
                    ph0Var7.setOnAnimationEndListener(new d1(n4Var, ph0Var7, i10));
                    ph0Var7.d();
                }
                sb1 sb1Var = (sb1) n4Var.e;
                if (sb1Var != null) {
                    sb1Var.b.M = i15;
                }
            }
        } else if (action == 3 && (e1Var = this.e) != null) {
            f1[] f1VarArr3 = (f1[]) ((n4) ((org.telegram.ui.ActionBar.p) e1Var).b).d;
            int length = f1VarArr3.length;
            while (i10 < length) {
                f1 f1Var4 = f1VarArr3[i10];
                ph0 ph0Var8 = f1Var4.a;
                ph0 ph0Var9 = f1Var4.b;
                ph0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                ph0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                i10++;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.y yVar = this.c;
        if (yVar != null) {
            yVar.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.y yVar = this.c;
        if (yVar != null) {
            yVar.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.y yVar = this.c;
        yVar.setBounds(0, 0, width, height);
        yVar.draw(canvas);
    }

    public void setAllStarsProvider(e1 e1Var) {
        this.e = e1Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
