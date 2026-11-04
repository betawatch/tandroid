package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class w3 extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ cb0 c;
    public final Object d;
    public final /* synthetic */ cb0 e;
    public final /* synthetic */ cb0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Context context, q4 q4Var, cb0 cb0Var, xg.h hVar, xg.i iVar) {
        super(context);
        this.c = cb0Var;
        this.e = hVar;
        this.f = iVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(q4Var.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((xg.h) this.e).getRight() - org.telegram.messenger.g0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.g0.L(11.0f), (TextPaint) this.d);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        switch (this.a) {
            case 0:
                cb0 cb0Var = (cb0) this.d;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                cb0 cb0Var2 = this.c;
                cb0Var2.setItemCount(i11);
                cb0Var.setItemCount(i11);
                cb0 cb0Var3 = this.e;
                cb0Var3.setItemCount(i11);
                cb0 cb0Var4 = this.f;
                cb0Var4.setItemCount(i11);
                cb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                cb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                cb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                cb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i3, i10);
                break;
            default:
                xg.i iVar = (xg.i) this.f;
                xg.h hVar = (xg.h) this.e;
                this.b = true;
                Point point2 = org.telegram.messenger.g0.q;
                int i12 = point2.x > point2.y ? 3 : 5;
                cb0 cb0Var5 = this.c;
                cb0Var5.setItemCount(i12);
                hVar.setItemCount(i12);
                iVar.setItemCount(i12);
                cb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                hVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                iVar.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i3, i10);
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
    public w3(Context context, cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, cb0 cb0Var4) {
        super(context);
        this.c = cb0Var;
        this.d = cb0Var2;
        this.e = cb0Var3;
        this.f = cb0Var4;
        this.b = false;
    }
}
