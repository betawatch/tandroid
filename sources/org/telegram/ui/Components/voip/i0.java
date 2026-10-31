package org.telegram.ui.Components.voip;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.m5;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.Wallet.ba;
import org.telegram.ui.Wallet.g6;
import org.telegram.ui.ud1;
import rh.e4;
import rh.h8;
import vh.o8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i0 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = obj;
    }

    public void a(tg.b bVar, wg.d dVar) {
        bh.i iVar = (bh.i) this.b;
        iVar.c(bVar, dVar);
        iVar.setIgnoreFastWay(true);
        iVar.setFadeHeightTop(org.telegram.messenger.i0.L(48.0f));
        iVar.setFadeHeightBottom(org.telegram.messenger.i0.L(48.0f));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        switch (this.a) {
            case 13:
                super.addView(view, i10, i11);
                ((zg.e) this.b).e();
                break;
            default:
                super.addView(view, i10, i11);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 6:
                if (((h8) this.b).t0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                if (((wh.g) this.b).s0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.a) {
            case 2:
                if (!((g6) this.b).a || view.getTag() == g6.n0) {
                    return super.drawChild(canvas, view, j10);
                }
                return false;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 7:
                super.onDraw(canvas);
                sg.o oVar = (sg.o) this.b;
                if (oVar.y > 0) {
                    canvas.drawRect(0.0f, getHeight() - oVar.y, getWidth(), getHeight(), oVar.D);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                return ((g6) this.b).a || super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                sg.o oVar = (sg.o) this.b;
                if (oVar.N && z10) {
                    oVar.i0(oVar.P.e);
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((b6) this.b).S.c(org.telegram.messenger.i0.L(4.0f))));
                break;
            case 4:
                super.onMeasure(i10, i11);
                ((ph.c1) this.b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                ((ud1) this.b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        switch (this.a) {
            case 12:
                super.onViewAdded(view);
                bringChildToFront((bh.i) this.b);
                break;
            default:
                super.onViewAdded(view);
                break;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        switch (this.a) {
            case 3:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((ba) this.b).j0(true);
                    break;
                }
                break;
            default:
                super.onWindowFocusChanged(z10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        switch (this.a) {
            case 5:
                super.setTranslationY(f7);
                e4 e4Var = (e4) this.b;
                rh.n2 n2Var = e4Var.W1;
                if (n2Var != null && n2Var.getVisibility() == 0) {
                    e4Var.W1.invalidate();
                    break;
                }
                break;
            case 9:
                o8 o8Var = (o8) this.b;
                if (getTranslationY() != f7 && o8Var.c1 != null) {
                    super.setTranslationY(f7);
                    o8Var.c1.y();
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, int i10) {
        super(context);
        this.a = i10;
        switch (i10) {
            case 12:
                super(context);
                bh.i iVar = new bh.i(context);
                this.b = iVar;
                addView(iVar, w7.b6.g());
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, String str, th.b bVar) {
        super(context);
        this.a = 8;
        int L = org.telegram.messenger.i0.L(12.0f);
        int i10 = t6.j5;
        Drawable d02 = t6.d0(L, t6.r1(0.06f, t6.w0(i10, bVar)));
        w6 L2 = a7.L(0.06f, i10);
        setBackground(d02);
        a7.k(this, d02, L2, null, bVar);
        LinearLayout f7 = m5.f(context, 1);
        addView(f7, w7.b6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        f6 f6Var = new f6(context, false, true, true);
        this.b = f6Var;
        f6Var.b(0.6f, 450L, gr.h);
        f6Var.setTextSize(org.telegram.messenger.i0.L(17.0f));
        a7.Z(f6Var, i10, bVar);
        f6Var.setScaleProperty(0.7f);
        f6Var.setGravity(17);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setAllowCancel(true);
        f7.addView(f6Var, w7.b6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        a7.V(textView, i10, bVar);
        textView.setGravity(17);
        f7.addView(textView, w7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(sg.o oVar, Context context) {
        super(context);
        this.a = 7;
        this.b = oVar;
        setWillNotDraw(false);
    }
}
