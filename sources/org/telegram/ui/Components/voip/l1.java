package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import ji.k5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.ci1;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public final aj0 a;
    public final aj0 b;
    public final org.telegram.ui.Cells.z c;
    public org.telegram.ui.Components.b3 d;
    public k1 e;
    public int f;

    public l1(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        aj0 aj0Var = new aj0(context);
        this.a = aj0Var;
        aj0 aj0Var2 = new aj0(context);
        this.b = aj0Var2;
        aj0Var.f(R.raw.star_stroke, 37, 37, null);
        aj0Var2.f(R.raw.star_fill, 37, 37, null);
        aj0Var2.setAlpha(0.0f);
        addView(aj0Var, x5.c(37.0f, 37));
        addView(aj0Var2, x5.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = j6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.c = h02;
        h02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        k1 k1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action == 0) {
            k1 k1Var2 = this.e;
            if (k1Var2 != null) {
                l1[] l1VarArr = ((m1) ((k5) k1Var2).b).c;
                while (true) {
                    i10 = this.f;
                    if (i11 > i10) {
                        break;
                    }
                    l1 l1Var = l1VarArr[i11];
                    aj0 aj0Var = l1Var.a;
                    aj0 aj0Var2 = l1Var.b;
                    aj0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    aj0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i12 = i10 + 1; i12 < l1VarArr.length; i12++) {
                    l1 l1Var2 = l1VarArr[i12];
                    aj0 aj0Var3 = l1Var2.a;
                    aj0 aj0Var4 = l1Var2.b;
                    aj0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    aj0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            k1 k1Var3 = this.e;
            if (k1Var3 != null) {
                l1[] l1VarArr2 = ((m1) ((k5) k1Var3).b).c;
                for (int i13 = 0; i13 <= this.f; i13++) {
                    l1 l1Var3 = l1VarArr2[i13];
                    aj0 aj0Var5 = l1Var3.a;
                    aj0 aj0Var6 = l1Var3.b;
                    aj0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    aj0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i14 = iArr[0];
                int i15 = iArr[1];
                org.telegram.ui.Components.b3 b3Var = this.d;
                float width = (getWidth() / 2.0f) + i14;
                float height = (getHeight() / 2.0f) + i15;
                int i16 = this.f + 1;
                m1 m1Var = (m1) b3Var.b;
                Context context = (Context) b3Var.c;
                if (i16 >= 4) {
                    aj0 aj0Var7 = new aj0(context);
                    int dp = AndroidUtilities.dp(133.0f);
                    aj0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    m1Var.getLocationOnScreen(iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    m1Var.addView(aj0Var7, x5.c(133.0f, 133));
                    float f7 = width - i17;
                    float f10 = dp / 2.0f;
                    aj0Var7.setTranslationX(f7 - f10);
                    aj0Var7.setTranslationY((height - i18) - f10);
                    aj0Var7.setOnAnimationEndListener(new i1(m1Var, aj0Var7, 0));
                    aj0Var7.d();
                }
                ci1 ci1Var = m1Var.d;
                if (ci1Var != null) {
                    ci1Var.b.L = i16;
                }
            }
        } else if (action == 3 && (k1Var = this.e) != null) {
            l1[] l1VarArr3 = ((m1) ((k5) k1Var).b).c;
            int length = l1VarArr3.length;
            while (i11 < length) {
                l1 l1Var4 = l1VarArr3[i11];
                aj0 aj0Var8 = l1Var4.a;
                aj0 aj0Var9 = l1Var4.b;
                aj0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                aj0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                i11++;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        org.telegram.ui.Cells.z zVar = this.c;
        if (zVar != null) {
            zVar.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        org.telegram.ui.Cells.z zVar = this.c;
        if (zVar != null) {
            zVar.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        org.telegram.ui.Cells.z zVar = this.c;
        zVar.setBounds(0, 0, width, height);
        zVar.draw(canvas);
    }

    public void setAllStarsProvider(k1 k1Var) {
        this.e = k1Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
