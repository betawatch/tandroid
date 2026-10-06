package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.sh1;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout {
    public final nj0 a;
    public final nj0 b;
    public final org.telegram.ui.Cells.z c;
    public org.telegram.ui.Components.w2 d;
    public n1 e;
    public int f;

    public o1(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        nj0 nj0Var = new nj0(context);
        this.a = nj0Var;
        nj0 nj0Var2 = new nj0(context);
        this.b = nj0Var2;
        nj0Var.f(R.raw.star_stroke, 37, 37, null);
        nj0Var2.f(R.raw.star_fill, 37, 37, null);
        nj0Var2.setAlpha(0.0f);
        addView(nj0Var, z5.c(37.0f, 37));
        addView(nj0Var2, z5.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = i6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.c = h02;
        h02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        n1 n1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action == 0) {
            n1 n1Var2 = this.e;
            if (n1Var2 != null) {
                o1[] o1VarArr = ((p1) ((k2.v) n1Var2).b).c;
                while (true) {
                    i10 = this.f;
                    if (i11 > i10) {
                        break;
                    }
                    o1 o1Var = o1VarArr[i11];
                    nj0 nj0Var = o1Var.a;
                    nj0 nj0Var2 = o1Var.b;
                    nj0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    nj0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i12 = i10 + 1; i12 < o1VarArr.length; i12++) {
                    o1 o1Var2 = o1VarArr[i12];
                    nj0 nj0Var3 = o1Var2.a;
                    nj0 nj0Var4 = o1Var2.b;
                    nj0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    nj0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            n1 n1Var3 = this.e;
            if (n1Var3 != null) {
                o1[] o1VarArr2 = ((p1) ((k2.v) n1Var3).b).c;
                for (int i13 = 0; i13 <= this.f; i13++) {
                    o1 o1Var3 = o1VarArr2[i13];
                    nj0 nj0Var5 = o1Var3.a;
                    nj0 nj0Var6 = o1Var3.b;
                    nj0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    nj0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i14 = iArr[0];
                int i15 = iArr[1];
                org.telegram.ui.Components.w2 w2Var = this.d;
                float width = (getWidth() / 2.0f) + i14;
                float height = (getHeight() / 2.0f) + i15;
                int i16 = this.f + 1;
                p1 p1Var = (p1) w2Var.b;
                Context context = (Context) w2Var.c;
                if (i16 >= 4) {
                    nj0 nj0Var7 = new nj0(context);
                    int dp = AndroidUtilities.dp(133.0f);
                    nj0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    p1Var.getLocationOnScreen(iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    p1Var.addView(nj0Var7, z5.c(133.0f, 133));
                    float f7 = width - i17;
                    float f10 = dp / 2.0f;
                    nj0Var7.setTranslationX(f7 - f10);
                    nj0Var7.setTranslationY((height - i18) - f10);
                    nj0Var7.setOnAnimationEndListener(new l1(p1Var, nj0Var7, 0));
                    nj0Var7.d();
                }
                sh1 sh1Var = p1Var.d;
                if (sh1Var != null) {
                    sh1Var.b.L = i16;
                }
            }
        } else if (action == 3 && (n1Var = this.e) != null) {
            o1[] o1VarArr3 = ((p1) ((k2.v) n1Var).b).c;
            int length = o1VarArr3.length;
            while (i11 < length) {
                o1 o1Var4 = o1VarArr3[i11];
                nj0 nj0Var8 = o1Var4.a;
                nj0 nj0Var9 = o1Var4.b;
                nj0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                nj0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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

    public void setAllStarsProvider(n1 n1Var) {
        this.e = n1Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
