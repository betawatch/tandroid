package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import bi.m5;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class c1 extends FrameLayout {
    public final ch0 a;
    public final ch0 b;
    public final org.telegram.ui.Cells.y c;
    public org.telegram.ui.Components.f2 d;
    public b1 e;
    public int f;

    public c1(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        ch0 ch0Var = new ch0(context);
        this.a = ch0Var;
        ch0 ch0Var2 = new ch0(context);
        this.b = ch0Var2;
        ch0Var.f(R.raw.star_stroke, 37, 37, null);
        ch0Var2.f(R.raw.star_fill, 37, 37, null);
        ch0Var2.setAlpha(0.0f);
        addView(ch0Var, ha.c(37.0f, 37));
        addView(ch0Var2, ha.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        b1 b1Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action == 0) {
            b1 b1Var2 = this.e;
            if (b1Var2 != null) {
                c1[] c1VarArr = (c1[]) ((m5) ((m3) b1Var2).b).d;
                while (true) {
                    i7 = this.f;
                    if (i10 > i7) {
                        break;
                    }
                    c1 c1Var = c1VarArr[i10];
                    ch0 ch0Var = c1Var.a;
                    ch0 ch0Var2 = c1Var.b;
                    ch0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ch0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i11 = i7 + 1; i11 < c1VarArr.length; i11++) {
                    c1 c1Var2 = c1VarArr[i11];
                    ch0 ch0Var3 = c1Var2.a;
                    ch0 ch0Var4 = c1Var2.b;
                    ch0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ch0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            b1 b1Var3 = this.e;
            if (b1Var3 != null) {
                c1[] c1VarArr2 = (c1[]) ((m5) ((m3) b1Var3).b).d;
                for (int i12 = 0; i12 <= this.f; i12++) {
                    c1 c1Var3 = c1VarArr2[i12];
                    ch0 ch0Var5 = c1Var3.a;
                    ch0 ch0Var6 = c1Var3.b;
                    ch0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ch0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i13 = iArr[0];
                int i14 = iArr[1];
                org.telegram.ui.Components.f2 f2Var = this.d;
                float width = (getWidth() / 2.0f) + i13;
                float height = (getHeight() / 2.0f) + i14;
                int i15 = this.f + 1;
                m5 m5Var = (m5) f2Var.b;
                Context context = (Context) f2Var.c;
                if (i15 >= 4) {
                    ch0 ch0Var7 = new ch0(context);
                    int L = org.telegram.messenger.g0.L(133.0f);
                    ch0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    m5Var.getLocationOnScreen(iArr2);
                    int i16 = iArr2[0];
                    int i17 = iArr2[1];
                    m5Var.addView(ch0Var7, ha.c(133.0f, 133));
                    float f10 = L / 2.0f;
                    ch0Var7.setTranslationX((width - i16) - f10);
                    ch0Var7.setTranslationY((height - i17) - f10);
                    ch0Var7.setOnAnimationEndListener(new a1(m5Var, ch0Var7, i10));
                    ch0Var7.d();
                }
                qb1 qb1Var = (qb1) m5Var.e;
                if (qb1Var != null) {
                    qb1Var.b.L = i15;
                }
            }
        } else if (action == 3 && (b1Var = this.e) != null) {
            c1[] c1VarArr3 = (c1[]) ((m5) ((m3) b1Var).b).d;
            int length = c1VarArr3.length;
            while (i10 < length) {
                c1 c1Var4 = c1VarArr3[i10];
                ch0 ch0Var8 = c1Var4.a;
                ch0 ch0Var9 = c1Var4.b;
                ch0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                ch0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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

    public void setAllStarsProvider(b1 b1Var) {
        this.e = b1Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
