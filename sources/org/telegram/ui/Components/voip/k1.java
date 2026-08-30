package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import k7.b6;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.ih1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k1 extends FrameLayout {
    public final jj0 a;
    public final jj0 b;
    public final org.telegram.ui.Cells.z c;
    public org.telegram.ui.Components.o1 d;
    public j1 e;
    public int f;

    public k1(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        jj0 jj0Var = new jj0(context);
        this.a = jj0Var;
        jj0 jj0Var2 = new jj0(context);
        this.b = jj0Var2;
        jj0Var.f(R.raw.star_stroke, 37, 37, null);
        jj0Var2.f(R.raw.star_fill, 37, 37, null);
        jj0Var2.setAlpha(0.0f);
        addView(jj0Var, b6.c(37.0f, 37));
        addView(jj0Var2, b6.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = j6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.c = h02;
        h02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        j1 j1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action == 0) {
            j1 j1Var2 = this.e;
            if (j1Var2 != null) {
                k1[] k1VarArr = ((l1) ((m5) j1Var2).b).c;
                while (true) {
                    i10 = this.f;
                    if (i11 > i10) {
                        break;
                    }
                    k1 k1Var = k1VarArr[i11];
                    jj0 jj0Var = k1Var.a;
                    jj0 jj0Var2 = k1Var.b;
                    jj0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    jj0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i12 = i10 + 1; i12 < k1VarArr.length; i12++) {
                    k1 k1Var2 = k1VarArr[i12];
                    jj0 jj0Var3 = k1Var2.a;
                    jj0 jj0Var4 = k1Var2.b;
                    jj0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    jj0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            j1 j1Var3 = this.e;
            if (j1Var3 != null) {
                k1[] k1VarArr2 = ((l1) ((m5) j1Var3).b).c;
                for (int i13 = 0; i13 <= this.f; i13++) {
                    k1 k1Var3 = k1VarArr2[i13];
                    jj0 jj0Var5 = k1Var3.a;
                    jj0 jj0Var6 = k1Var3.b;
                    jj0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    jj0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i14 = iArr[0];
                int i15 = iArr[1];
                org.telegram.ui.Components.o1 o1Var = this.d;
                float width = (getWidth() / 2.0f) + i14;
                float height = (getHeight() / 2.0f) + i15;
                int i16 = this.f + 1;
                l1 l1Var = (l1) o1Var.b;
                Context context = (Context) o1Var.c;
                if (i16 >= 4) {
                    jj0 jj0Var7 = new jj0(context);
                    int dp = AndroidUtilities.dp(133.0f);
                    jj0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    l1Var.getLocationOnScreen(iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    l1Var.addView(jj0Var7, b6.c(133.0f, 133));
                    float f10 = width - i17;
                    float f11 = dp / 2.0f;
                    jj0Var7.setTranslationX(f10 - f11);
                    jj0Var7.setTranslationY((height - i18) - f11);
                    jj0Var7.setOnAnimationEndListener(new h1(l1Var, jj0Var7, 0));
                    jj0Var7.d();
                }
                ih1 ih1Var = l1Var.d;
                if (ih1Var != null) {
                    ih1Var.b.I = i16;
                }
            }
        } else if (action == 3 && (j1Var = this.e) != null) {
            k1[] k1VarArr3 = ((l1) ((m5) j1Var).b).c;
            int length = k1VarArr3.length;
            while (i11 < length) {
                k1 k1Var4 = k1VarArr3[i11];
                jj0 jj0Var8 = k1Var4.a;
                jj0 jj0Var9 = k1Var4.b;
                jj0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                jj0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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

    public void setAllStarsProvider(j1 j1Var) {
        this.e = j1Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
