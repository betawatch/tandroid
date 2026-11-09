package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class y3 extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ ib0 c;
    public final Object d;
    public final /* synthetic */ ib0 e;
    public final /* synthetic */ ib0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(Context context, s4 s4Var, ib0 ib0Var, wg.f fVar, wg.g gVar) {
        super(context);
        this.c = ib0Var;
        this.e = fVar;
        this.f = gVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(s4Var.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((wg.f) this.e).getRight() - org.telegram.messenger.g0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.g0.L(11.0f), (TextPaint) this.d);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                ib0 ib0Var = (ib0) this.d;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                ib0 ib0Var2 = this.c;
                ib0Var2.setItemCount(i11);
                ib0Var.setItemCount(i11);
                ib0 ib0Var3 = this.e;
                ib0Var3.setItemCount(i11);
                ib0 ib0Var4 = this.f;
                ib0Var4.setItemCount(i11);
                ib0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                ib0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                ib0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                ib0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            default:
                wg.g gVar = (wg.g) this.f;
                wg.f fVar = (wg.f) this.e;
                this.b = true;
                Point point2 = org.telegram.messenger.g0.q;
                int i12 = point2.x > point2.y ? 3 : 5;
                ib0 ib0Var5 = this.c;
                ib0Var5.setItemCount(i12);
                fVar.setItemCount(i12);
                gVar.setItemCount(i12);
                ib0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                fVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                gVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(Context context, ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, ib0 ib0Var4) {
        super(context);
        this.c = ib0Var;
        this.d = ib0Var2;
        this.e = ib0Var3;
        this.f = ib0Var4;
        this.b = false;
    }
}
