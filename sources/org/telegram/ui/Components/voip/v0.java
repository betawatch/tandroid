package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import b8.mf;
import ci.t4;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.ib1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v0 extends FrameLayout {
    public final fh0 a;
    public final fh0 b;
    public final org.telegram.ui.Cells.y c;
    public i41 d;
    public u0 e;
    public int f;

    public v0(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        fh0 fh0Var = new fh0(context);
        this.a = fh0Var;
        fh0 fh0Var2 = new fh0(context);
        this.b = fh0Var2;
        fh0Var.f(R.raw.star_stroke, 37, 37, null);
        fh0Var2.f(R.raw.star_fill, 37, 37, null);
        fh0Var2.setAlpha(0.0f);
        addView(fh0Var, mf.c(37.0f, 37));
        addView(fh0Var2, mf.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = k6.j0(org.telegram.messenger.g0.L(37.0f), 0, i0.a.o(-1, 76));
        this.c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i3;
        u0 u0Var;
        int action = motionEvent.getAction();
        int i10 = 0;
        if (action == 0) {
            u0 u0Var2 = this.e;
            if (u0Var2 != null) {
                v0[] v0VarArr = (v0[]) ((t4) ((e3) u0Var2).b).d;
                while (true) {
                    i3 = this.f;
                    if (i10 > i3) {
                        break;
                    }
                    v0 v0Var = v0VarArr[i10];
                    fh0 fh0Var = v0Var.a;
                    fh0 fh0Var2 = v0Var.b;
                    fh0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    fh0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i10++;
                }
                for (int i11 = i3 + 1; i11 < v0VarArr.length; i11++) {
                    v0 v0Var2 = v0VarArr[i11];
                    fh0 fh0Var3 = v0Var2.a;
                    fh0 fh0Var4 = v0Var2.b;
                    fh0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    fh0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            u0 u0Var3 = this.e;
            if (u0Var3 != null) {
                v0[] v0VarArr2 = (v0[]) ((t4) ((e3) u0Var3).b).d;
                for (int i12 = 0; i12 <= this.f; i12++) {
                    v0 v0Var3 = v0VarArr2[i12];
                    fh0 fh0Var5 = v0Var3.a;
                    fh0 fh0Var6 = v0Var3.b;
                    fh0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    fh0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i13 = iArr[0];
                int i14 = iArr[1];
                i41 i41Var = this.d;
                float width = (getWidth() / 2.0f) + i13;
                float height = (getHeight() / 2.0f) + i14;
                int i15 = this.f + 1;
                t4 t4Var = (t4) i41Var.b;
                Context context = (Context) i41Var.c;
                if (i15 >= 4) {
                    fh0 fh0Var7 = new fh0(context);
                    int L = org.telegram.messenger.g0.L(133.0f);
                    fh0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    t4Var.getLocationOnScreen(iArr2);
                    int i16 = iArr2[0];
                    int i17 = iArr2[1];
                    t4Var.addView(fh0Var7, mf.c(133.0f, 133));
                    float f10 = L / 2.0f;
                    fh0Var7.setTranslationX((width - i16) - f10);
                    fh0Var7.setTranslationY((height - i17) - f10);
                    fh0Var7.setOnAnimationEndListener(new t0(t4Var, fh0Var7, i10));
                    fh0Var7.d();
                }
                ib1 ib1Var = (ib1) t4Var.e;
                if (ib1Var != null) {
                    ib1Var.b.M = i15;
                }
            }
        } else if (action == 3 && (u0Var = this.e) != null) {
            v0[] v0VarArr3 = (v0[]) ((t4) ((e3) u0Var).b).d;
            int length = v0VarArr3.length;
            while (i10 < length) {
                v0 v0Var4 = v0VarArr3[i10];
                fh0 fh0Var8 = v0Var4.a;
                fh0 fh0Var9 = v0Var4.b;
                fh0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                fh0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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

    public void setAllStarsProvider(u0 u0Var) {
        this.e = u0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
