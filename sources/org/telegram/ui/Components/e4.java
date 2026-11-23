package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e4 extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ qb0 c;
    public final Object d;
    public final /* synthetic */ qb0 e;
    public final /* synthetic */ qb0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(Context context, y4 y4Var, qb0 qb0Var, wg.f fVar, wg.g gVar) {
        super(context);
        this.c = qb0Var;
        this.e = fVar;
        this.f = gVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.g0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setColor(y4Var.a);
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
                qb0 qb0Var = (qb0) this.d;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                qb0 qb0Var2 = this.c;
                qb0Var2.setItemCount(i11);
                qb0Var.setItemCount(i11);
                qb0 qb0Var3 = this.e;
                qb0Var3.setItemCount(i11);
                qb0 qb0Var4 = this.f;
                qb0Var4.setItemCount(i11);
                qb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                qb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                qb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                qb0Var4.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            default:
                wg.g gVar = (wg.g) this.f;
                wg.f fVar = (wg.f) this.e;
                this.b = true;
                Point point2 = org.telegram.messenger.g0.q;
                int i12 = point2.x > point2.y ? 3 : 5;
                qb0 qb0Var5 = this.c;
                qb0Var5.setItemCount(i12);
                fVar.setItemCount(i12);
                gVar.setItemCount(i12);
                qb0Var5.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
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
    public e4(Context context, qb0 qb0Var, qb0 qb0Var2, qb0 qb0Var3, qb0 qb0Var4) {
        super(context);
        this.c = qb0Var;
        this.d = qb0Var2;
        this.e = qb0Var3;
        this.f = qb0Var4;
        this.b = false;
    }
}
