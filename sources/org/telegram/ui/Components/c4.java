package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class c4 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ qd0 c;
    public final Object d;
    public final /* synthetic */ qd0 e;
    public final /* synthetic */ qd0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Context context, c5 c5Var, qd0 qd0Var, ug.f fVar, ug.g gVar) {
        super(context);
        this.c = qd0Var;
        this.e = fVar;
        this.f = gVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(c5Var.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((ug.f) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                qd0 qd0Var = (qd0) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                qd0 qd0Var2 = this.c;
                qd0Var2.setItemCount(i12);
                qd0Var.setItemCount(i12);
                qd0 qd0Var3 = this.e;
                qd0Var3.setItemCount(i12);
                qd0 qd0Var4 = this.f;
                qd0Var4.setItemCount(i12);
                qd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                qd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                qd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                qd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                ug.g gVar = (ug.g) this.f;
                ug.f fVar = (ug.f) this.e;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                qd0 qd0Var5 = this.c;
                qd0Var5.setItemCount(i13);
                fVar.setItemCount(i13);
                gVar.setItemCount(i13);
                qd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                gVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
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
    public c4(Context context, qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3, qd0 qd0Var4) {
        super(context);
        this.c = qd0Var;
        this.d = qd0Var2;
        this.e = qd0Var3;
        this.f = qd0Var4;
        this.b = false;
    }
}
