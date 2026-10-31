package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.kd1;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v0 extends FrameLayout {
    public final ei0 a;
    public final ei0 b;
    public final org.telegram.ui.Cells.y c;
    public org.telegram.ui.Components.f2 d;
    public u0 e;
    public int f;

    public v0(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        ei0 ei0Var = new ei0(context);
        this.a = ei0Var;
        ei0 ei0Var2 = new ei0(context);
        this.b = ei0Var2;
        ei0Var.f(R.raw.star_stroke, 37, 37, null);
        ei0Var2.f(R.raw.star_fill, 37, 37, null);
        ei0Var2.setAlpha(0.0f);
        addView(ei0Var, b6.c(37.0f, 37));
        addView(ei0Var2, b6.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = t6.j0(org.telegram.messenger.i0.L(37.0f), 0, i0.b.o(-1, 76));
        this.c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        u0 u0Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action == 0) {
            u0 u0Var2 = this.e;
            if (u0Var2 != null) {
                v0[] v0VarArr = (v0[]) ((jg.b1) ((mg.l) u0Var2).b).d;
                while (true) {
                    i10 = this.f;
                    if (i11 > i10) {
                        break;
                    }
                    v0 v0Var = v0VarArr[i11];
                    ei0 ei0Var = v0Var.a;
                    ei0 ei0Var2 = v0Var.b;
                    ei0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ei0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i12 = i10 + 1; i12 < v0VarArr.length; i12++) {
                    v0 v0Var2 = v0VarArr[i12];
                    ei0 ei0Var3 = v0Var2.a;
                    ei0 ei0Var4 = v0Var2.b;
                    ei0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ei0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            u0 u0Var3 = this.e;
            if (u0Var3 != null) {
                v0[] v0VarArr2 = (v0[]) ((jg.b1) ((mg.l) u0Var3).b).d;
                for (int i13 = 0; i13 <= this.f; i13++) {
                    v0 v0Var3 = v0VarArr2[i13];
                    ei0 ei0Var5 = v0Var3.a;
                    ei0 ei0Var6 = v0Var3.b;
                    ei0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ei0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i14 = iArr[0];
                int i15 = iArr[1];
                org.telegram.ui.Components.f2 f2Var = this.d;
                float width = (getWidth() / 2.0f) + i14;
                float height = (getHeight() / 2.0f) + i15;
                int i16 = this.f + 1;
                jg.b1 b1Var = (jg.b1) f2Var.b;
                Context context = (Context) f2Var.c;
                if (i16 >= 4) {
                    ei0 ei0Var7 = new ei0(context);
                    int L = org.telegram.messenger.i0.L(133.0f);
                    ei0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    b1Var.getLocationOnScreen(iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    b1Var.addView(ei0Var7, b6.c(133.0f, 133));
                    float f7 = L / 2.0f;
                    ei0Var7.setTranslationX((width - i17) - f7);
                    ei0Var7.setTranslationY((height - i18) - f7);
                    ei0Var7.setOnAnimationEndListener(new t0(b1Var, ei0Var7, i11));
                    ei0Var7.d();
                }
                kd1 kd1Var = (kd1) b1Var.e;
                if (kd1Var != null) {
                    kd1Var.b.L = i16;
                }
            }
        } else if (action == 3 && (u0Var = this.e) != null) {
            v0[] v0VarArr3 = (v0[]) ((jg.b1) ((mg.l) u0Var).b).d;
            int length = v0VarArr3.length;
            while (i11 < length) {
                v0 v0Var4 = v0VarArr3[i11];
                ei0 ei0Var8 = v0Var4.a;
                ei0 ei0Var9 = v0Var4.b;
                ei0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                ei0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                i11++;
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

    public void setAllStarsProvider(u0 u0Var) {
        this.e = u0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
