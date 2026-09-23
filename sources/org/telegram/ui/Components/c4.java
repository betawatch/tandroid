package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c4 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ tc0 c;
    public final Object d;
    public final /* synthetic */ tc0 e;
    public final /* synthetic */ tc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Context context, c5 c5Var, tc0 tc0Var, tg.i iVar, tg.j jVar) {
        super(context);
        this.c = tc0Var;
        this.e = iVar;
        this.f = jVar;
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
                tc0 tc0Var = (tc0) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                tc0 tc0Var2 = this.c;
                tc0Var2.setItemCount(i12);
                tc0Var.setItemCount(i12);
                tc0 tc0Var3 = this.e;
                tc0Var3.setItemCount(i12);
                tc0 tc0Var4 = this.f;
                tc0Var4.setItemCount(i12);
                tc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                tc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                tc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                tc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                tg.j jVar = (tg.j) this.f;
                tg.i iVar = (tg.i) this.e;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                tc0 tc0Var5 = this.c;
                tc0Var5.setItemCount(i13);
                iVar.setItemCount(i13);
                jVar.setItemCount(i13);
                tc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
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
    public c4(Context context, tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3, tc0 tc0Var4) {
        super(context);
        this.c = tc0Var;
        this.d = tc0Var2;
        this.e = tc0Var3;
        this.f = tc0Var4;
        this.b = false;
    }
}
