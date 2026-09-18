package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class a4 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ uc0 c;
    public final Object d;
    public final /* synthetic */ uc0 e;
    public final /* synthetic */ uc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Context context, a5 a5Var, uc0 uc0Var, tg.i iVar, tg.j jVar) {
        super(context);
        this.c = uc0Var;
        this.e = iVar;
        this.f = jVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(a5Var.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((tg.i) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
                uc0 uc0Var = (uc0) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                uc0 uc0Var2 = this.c;
                uc0Var2.setItemCount(i12);
                uc0Var.setItemCount(i12);
                uc0 uc0Var3 = this.e;
                uc0Var3.setItemCount(i12);
                uc0 uc0Var4 = this.f;
                uc0Var4.setItemCount(i12);
                uc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                uc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                uc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                uc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                tg.j jVar = (tg.j) this.f;
                tg.i iVar = (tg.i) this.e;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                uc0 uc0Var5 = this.c;
                uc0Var5.setItemCount(i13);
                iVar.setItemCount(i13);
                jVar.setItemCount(i13);
                uc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                iVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                jVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
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
    public a4(Context context, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, uc0 uc0Var4) {
        super(context);
        this.c = uc0Var;
        this.d = uc0Var2;
        this.e = uc0Var3;
        this.f = uc0Var4;
        this.b = false;
    }
}
