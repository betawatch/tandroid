package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.km;
import org.telegram.ui.hi1;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m1 extends FrameLayout {
    public final kj0 a;
    public final kj0 b;
    public final org.telegram.ui.Cells.z c;
    public km d;
    public l1 e;
    public int f;

    public m1(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        kj0 kj0Var = new kj0(context);
        this.a = kj0Var;
        kj0 kj0Var2 = new kj0(context);
        this.b = kj0Var2;
        kj0Var.f(R.raw.star_stroke, 37, 37, null);
        kj0Var2.f(R.raw.star_fill, 37, 37, null);
        kj0Var2.setAlpha(0.0f);
        addView(kj0Var, a6.c(37.0f, 37));
        addView(kj0Var2, a6.c(37.0f, 37));
        org.telegram.ui.Cells.z h02 = j6.h0(AndroidUtilities.dp(37.0f), 0, i0.a.k(-1, 76));
        this.c = h02;
        h02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        l1 l1Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action == 0) {
            l1 l1Var2 = this.e;
            if (l1Var2 != null) {
                m1[] m1VarArr = ((n1) ((org.telegram.tgnet.j) l1Var2).b).c;
                while (true) {
                    i10 = this.f;
                    if (i11 > i10) {
                        break;
                    }
                    m1 m1Var = m1VarArr[i11];
                    kj0 kj0Var = m1Var.a;
                    kj0 kj0Var2 = m1Var.b;
                    kj0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    kj0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i12 = i10 + 1; i12 < m1VarArr.length; i12++) {
                    m1 m1Var2 = m1VarArr[i12];
                    kj0 kj0Var3 = m1Var2.a;
                    kj0 kj0Var4 = m1Var2.b;
                    kj0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    kj0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            l1 l1Var3 = this.e;
            if (l1Var3 != null) {
                m1[] m1VarArr2 = ((n1) ((org.telegram.tgnet.j) l1Var3).b).c;
                for (int i13 = 0; i13 <= this.f; i13++) {
                    m1 m1Var3 = m1VarArr2[i13];
                    kj0 kj0Var5 = m1Var3.a;
                    kj0 kj0Var6 = m1Var3.b;
                    kj0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    kj0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i14 = iArr[0];
                int i15 = iArr[1];
                km kmVar = this.d;
                float width = (getWidth() / 2.0f) + i14;
                float height = (getHeight() / 2.0f) + i15;
                int i16 = this.f + 1;
                n1 n1Var = (n1) kmVar.b;
                Context context = (Context) kmVar.c;
                if (i16 >= 4) {
                    kj0 kj0Var7 = new kj0(context);
                    int dp = AndroidUtilities.dp(133.0f);
                    kj0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    n1Var.getLocationOnScreen(iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    n1Var.addView(kj0Var7, a6.c(133.0f, 133));
                    float f7 = width - i17;
                    float f10 = dp / 2.0f;
                    kj0Var7.setTranslationX(f7 - f10);
                    kj0Var7.setTranslationY((height - i18) - f10);
                    kj0Var7.setOnAnimationEndListener(new j1(n1Var, kj0Var7, 0));
                    kj0Var7.d();
                }
                hi1 hi1Var = n1Var.d;
                if (hi1Var != null) {
                    hi1Var.b.L = i16;
                }
            }
        } else if (action == 3 && (l1Var = this.e) != null) {
            m1[] m1VarArr3 = ((n1) ((org.telegram.tgnet.j) l1Var).b).c;
            int length = m1VarArr3.length;
            while (i11 < length) {
                m1 m1Var4 = m1VarArr3[i11];
                kj0 kj0Var8 = m1Var4.a;
                kj0 kj0Var9 = m1Var4.b;
                kj0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                kj0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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

    public void setAllStarsProvider(l1 l1Var) {
        this.e = l1Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
