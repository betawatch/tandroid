package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import c8.na;
import di.n4;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.qb1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g1 extends FrameLayout {
    public final qh0 a;
    public final qh0 b;
    public final org.telegram.ui.Cells.y c;
    public org.telegram.ui.Components.g2 d;
    public f1 e;
    public int f;

    public g1(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        qh0 qh0Var = new qh0(context);
        this.a = qh0Var;
        qh0 qh0Var2 = new qh0(context);
        this.b = qh0Var2;
        qh0Var.f(R.raw.star_stroke, 37, 37, null);
        qh0Var2.f(R.raw.star_fill, 37, 37, null);
        qh0Var2.setAlpha(0.0f);
        addView(qh0Var, na.c(37.0f, 37));
        addView(qh0Var2, na.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = n6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i7;
        f1 f1Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action == 0) {
            f1 f1Var2 = this.e;
            if (f1Var2 != null) {
                g1[] g1VarArr = (g1[]) ((n4) ((org.telegram.tgnet.g) f1Var2).b).d;
                while (true) {
                    i7 = this.f;
                    if (i10 > i7) {
                        break;
                    }
                    g1 g1Var = g1VarArr[i10];
                    qh0 qh0Var = g1Var.a;
                    qh0 qh0Var2 = g1Var.b;
                    qh0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    qh0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i11 = i7 + 1; i11 < g1VarArr.length; i11++) {
                    g1 g1Var2 = g1VarArr[i11];
                    qh0 qh0Var3 = g1Var2.a;
                    qh0 qh0Var4 = g1Var2.b;
                    qh0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    qh0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            f1 f1Var3 = this.e;
            if (f1Var3 != null) {
                g1[] g1VarArr2 = (g1[]) ((n4) ((org.telegram.tgnet.g) f1Var3).b).d;
                for (int i12 = 0; i12 <= this.f; i12++) {
                    g1 g1Var3 = g1VarArr2[i12];
                    qh0 qh0Var5 = g1Var3.a;
                    qh0 qh0Var6 = g1Var3.b;
                    qh0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    qh0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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
                    qh0 qh0Var7 = new qh0(context);
                    int L = org.telegram.messenger.g0.L(133.0f);
                    qh0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    n4Var.getLocationOnScreen(iArr2);
                    int i16 = iArr2[0];
                    int i17 = iArr2[1];
                    n4Var.addView(qh0Var7, na.c(133.0f, 133));
                    float f10 = L / 2.0f;
                    qh0Var7.setTranslationX((width - i16) - f10);
                    qh0Var7.setTranslationY((height - i17) - f10);
                    qh0Var7.setOnAnimationEndListener(new e1(n4Var, qh0Var7, i10));
                    qh0Var7.d();
                }
                qb1 qb1Var = (qb1) n4Var.e;
                if (qb1Var != null) {
                    qb1Var.b.M = i15;
                }
            }
        } else if (action == 3 && (f1Var = this.e) != null) {
            g1[] g1VarArr3 = (g1[]) ((n4) ((org.telegram.tgnet.g) f1Var).b).d;
            int length = g1VarArr3.length;
            while (i10 < length) {
                g1 g1Var4 = g1VarArr3[i10];
                qh0 qh0Var8 = g1Var4.a;
                qh0 qh0Var9 = g1Var4.b;
                qh0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                qh0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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

    public void setAllStarsProvider(f1 f1Var) {
        this.e = f1Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
