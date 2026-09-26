package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.uh1;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o1 extends FrameLayout {
    public final lj0 a;
    public final lj0 b;
    public final org.telegram.ui.Cells.z c;
    public org.telegram.ui.Components.w2 d;
    public n1 e;
    public int f;

    public o1(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        lj0 lj0Var = new lj0(context);
        this.a = lj0Var;
        lj0 lj0Var2 = new lj0(context);
        this.b = lj0Var2;
        lj0Var.f(R.raw.star_stroke, 37, 37, null);
        lj0Var2.f(R.raw.star_fill, 37, 37, null);
        lj0Var2.setAlpha(0.0f);
        addView(lj0Var, y5.c(37.0f, 37));
        addView(lj0Var2, y5.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = h6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
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
                o1[] o1VarArr = ((p1) ((le.b) n1Var2).b).c;
                while (true) {
                    i10 = this.f;
                    if (i11 > i10) {
                        break;
                    }
                    o1 o1Var = o1VarArr[i11];
                    lj0 lj0Var = o1Var.a;
                    lj0 lj0Var2 = o1Var.b;
                    lj0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    lj0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i12 = i10 + 1; i12 < o1VarArr.length; i12++) {
                    o1 o1Var2 = o1VarArr[i12];
                    lj0 lj0Var3 = o1Var2.a;
                    lj0 lj0Var4 = o1Var2.b;
                    lj0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    lj0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            n1 n1Var3 = this.e;
            if (n1Var3 != null) {
                o1[] o1VarArr2 = ((p1) ((le.b) n1Var3).b).c;
                for (int i13 = 0; i13 <= this.f; i13++) {
                    o1 o1Var3 = o1VarArr2[i13];
                    lj0 lj0Var5 = o1Var3.a;
                    lj0 lj0Var6 = o1Var3.b;
                    lj0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    lj0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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
                p1 p1Var = (p1) w2Var.c;
                Context context = (Context) w2Var.b;
                if (i16 >= 4) {
                    lj0 lj0Var7 = new lj0(context);
                    int dp = AndroidUtilities.dp(133.0f);
                    lj0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    p1Var.getLocationOnScreen(iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    p1Var.addView(lj0Var7, y5.c(133.0f, 133));
                    float f7 = width - i17;
                    float f10 = dp / 2.0f;
                    lj0Var7.setTranslationX(f7 - f10);
                    lj0Var7.setTranslationY((height - i18) - f10);
                    lj0Var7.setOnAnimationEndListener(new l1(p1Var, lj0Var7, 0));
                    lj0Var7.d();
                }
                uh1 uh1Var = p1Var.d;
                if (uh1Var != null) {
                    uh1Var.b.L = i16;
                }
            }
        } else if (action == 3 && (n1Var = this.e) != null) {
            o1[] o1VarArr3 = ((p1) ((le.b) n1Var).b).c;
            int length = o1VarArr3.length;
            while (i11 < length) {
                o1 o1Var4 = o1VarArr3[i11];
                lj0 lj0Var8 = o1Var4.a;
                lj0 lj0Var9 = o1Var4.b;
                lj0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                lj0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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
