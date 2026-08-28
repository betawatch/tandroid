package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.ug1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k1 extends FrameLayout {
    public final pi0 a;
    public final pi0 b;
    public final org.telegram.ui.Cells.z c;
    public org.telegram.ui.Components.g1 d;
    public j1 e;
    public int f;

    public k1(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        pi0 pi0Var = new pi0(context);
        this.a = pi0Var;
        pi0 pi0Var2 = new pi0(context);
        this.b = pi0Var2;
        pi0Var.f(R.raw.star_stroke, 37, 37, null);
        pi0Var2.f(R.raw.star_fill, 37, 37, null);
        pi0Var2.setAlpha(0.0f);
        addView(pi0Var, e6.c(37.0f, 37));
        addView(pi0Var2, e6.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = f6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.c = h02;
        h02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i9;
        j1 j1Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action == 0) {
            j1 j1Var2 = this.e;
            if (j1Var2 != null) {
                k1[] k1VarArr = ((l1) ((kh.p) j1Var2).b).c;
                while (true) {
                    i9 = this.f;
                    if (i10 > i9) {
                        break;
                    }
                    k1 k1Var = k1VarArr[i10];
                    pi0 pi0Var = k1Var.a;
                    pi0 pi0Var2 = k1Var.b;
                    pi0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    pi0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i11 = i9 + 1; i11 < k1VarArr.length; i11++) {
                    k1 k1Var2 = k1VarArr[i11];
                    pi0 pi0Var3 = k1Var2.a;
                    pi0 pi0Var4 = k1Var2.b;
                    pi0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    pi0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            j1 j1Var3 = this.e;
            if (j1Var3 != null) {
                k1[] k1VarArr2 = ((l1) ((kh.p) j1Var3).b).c;
                for (int i12 = 0; i12 <= this.f; i12++) {
                    k1 k1Var3 = k1VarArr2[i12];
                    pi0 pi0Var5 = k1Var3.a;
                    pi0 pi0Var6 = k1Var3.b;
                    pi0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    pi0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i13 = iArr[0];
                int i14 = iArr[1];
                org.telegram.ui.Components.g1 g1Var = this.d;
                float width = (getWidth() / 2.0f) + i13;
                float height = (getHeight() / 2.0f) + i14;
                int i15 = this.f + 1;
                l1 l1Var = (l1) g1Var.b;
                Context context = (Context) g1Var.c;
                if (i15 >= 4) {
                    pi0 pi0Var7 = new pi0(context);
                    int dp = AndroidUtilities.dp(133.0f);
                    pi0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    l1Var.getLocationOnScreen(iArr2);
                    int i16 = iArr2[0];
                    int i17 = iArr2[1];
                    l1Var.addView(pi0Var7, e6.c(133.0f, 133));
                    float f10 = width - i16;
                    float f11 = dp / 2.0f;
                    pi0Var7.setTranslationX(f10 - f11);
                    pi0Var7.setTranslationY((height - i17) - f11);
                    pi0Var7.setOnAnimationEndListener(new h1(l1Var, pi0Var7, 0));
                    pi0Var7.d();
                }
                ug1 ug1Var = l1Var.d;
                if (ug1Var != null) {
                    ug1Var.b.H = i15;
                }
            }
        } else if (action == 3 && (j1Var = this.e) != null) {
            k1[] k1VarArr3 = ((l1) ((kh.p) j1Var).b).c;
            int length = k1VarArr3.length;
            while (i10 < length) {
                k1 k1Var4 = k1VarArr3[i10];
                pi0 pi0Var8 = k1Var4.a;
                pi0 pi0Var9 = k1Var4.b;
                pi0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                pi0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                i10++;
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
