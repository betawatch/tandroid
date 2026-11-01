package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.id1;
import w7.b6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class w0 extends FrameLayout {
    public final fi0 a;
    public final fi0 b;
    public final org.telegram.ui.Cells.y c;
    public org.telegram.ui.Components.f2 d;
    public v0 e;
    public int f;

    public w0(Context context) {
        super(context);
        this.f = 0;
        setWillNotDraw(false);
        fi0 fi0Var = new fi0(context);
        this.a = fi0Var;
        fi0 fi0Var2 = new fi0(context);
        this.b = fi0Var2;
        fi0Var.f(R.raw.star_stroke, 37, 37, null);
        fi0Var2.f(R.raw.star_fill, 37, 37, null);
        fi0Var2.setAlpha(0.0f);
        addView(fi0Var, b6.c(37.0f, 37));
        addView(fi0Var2, b6.c(37.0f, 37));
        org.telegram.ui.Cells.y j02 = t6.j0(org.telegram.messenger.i0.L(37.0f), 0, i0.b.o(-1, 76));
        this.c = j02;
        j02.setCallback(this);
        setClickable(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        v0 v0Var;
        int action = motionEvent.getAction();
        int i11 = 0;
        if (action == 0) {
            v0 v0Var2 = this.e;
            if (v0Var2 != null) {
                w0[] w0VarArr = (w0[]) ((jg.b1) ((mg.l) v0Var2).b).d;
                while (true) {
                    i10 = this.f;
                    if (i11 > i10) {
                        break;
                    }
                    w0 w0Var = w0VarArr[i11];
                    fi0 fi0Var = w0Var.a;
                    fi0 fi0Var2 = w0Var.b;
                    fi0Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    fi0Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i11++;
                }
                for (int i12 = i10 + 1; i12 < w0VarArr.length; i12++) {
                    w0 w0Var2 = w0VarArr[i12];
                    fi0 fi0Var3 = w0Var2.a;
                    fi0 fi0Var4 = w0Var2.b;
                    fi0Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    fi0Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            v0 v0Var3 = this.e;
            if (v0Var3 != null) {
                w0[] w0VarArr2 = (w0[]) ((jg.b1) ((mg.l) v0Var3).b).d;
                for (int i13 = 0; i13 <= this.f; i13++) {
                    w0 w0Var3 = w0VarArr2[i13];
                    fi0 fi0Var5 = w0Var3.a;
                    fi0 fi0Var6 = w0Var3.b;
                    fi0Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    fi0Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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
                    fi0 fi0Var7 = new fi0(context);
                    int L = org.telegram.messenger.i0.L(133.0f);
                    fi0Var7.f(R.raw.rate, 133, 133, null);
                    int[] iArr2 = new int[2];
                    b1Var.getLocationOnScreen(iArr2);
                    int i17 = iArr2[0];
                    int i18 = iArr2[1];
                    b1Var.addView(fi0Var7, b6.c(133.0f, 133));
                    float f7 = L / 2.0f;
                    fi0Var7.setTranslationX((width - i17) - f7);
                    fi0Var7.setTranslationY((height - i18) - f7);
                    fi0Var7.setOnAnimationEndListener(new u0(b1Var, fi0Var7, i11));
                    fi0Var7.d();
                }
                id1 id1Var = (id1) b1Var.e;
                if (id1Var != null) {
                    id1Var.b.L = i16;
                }
            }
        } else if (action == 3 && (v0Var = this.e) != null) {
            w0[] w0VarArr3 = (w0[]) ((jg.b1) ((mg.l) v0Var).b).d;
            int length = w0VarArr3.length;
            while (i11 < length) {
                w0 w0Var4 = w0VarArr3[i11];
                fi0 fi0Var8 = w0Var4.a;
                fi0 fi0Var9 = w0Var4.b;
                fi0Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                fi0Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
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

    public void setAllStarsProvider(v0 v0Var) {
        this.e = v0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
