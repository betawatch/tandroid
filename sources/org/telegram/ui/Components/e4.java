package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e4 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ nd0 c;
    public final Object d;
    public final /* synthetic */ nd0 e;
    public final /* synthetic */ nd0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(Context context, d5 d5Var, nd0 nd0Var, vg.h hVar, vg.i iVar) {
        super(context);
        this.c = nd0Var;
        this.e = hVar;
        this.f = iVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(d5Var.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                super.onDraw(canvas);
                canvas.drawText(":", ((vg.h) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
                nd0 nd0Var = (nd0) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                nd0 nd0Var2 = this.c;
                nd0Var2.setItemCount(i12);
                nd0Var.setItemCount(i12);
                nd0 nd0Var3 = this.e;
                nd0Var3.setItemCount(i12);
                nd0 nd0Var4 = this.f;
                nd0Var4.setItemCount(i12);
                nd0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nd0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nd0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nd0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                vg.i iVar = (vg.i) this.f;
                vg.h hVar = (vg.h) this.e;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                nd0 nd0Var5 = this.c;
                nd0Var5.setItemCount(i13);
                hVar.setItemCount(i13);
                iVar.setItemCount(i13);
                nd0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                hVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                iVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
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
    public e4(Context context, nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3, nd0 nd0Var4) {
        super(context);
        this.c = nd0Var;
        this.d = nd0Var2;
        this.e = nd0Var3;
        this.f = nd0Var4;
        this.b = false;
    }
}
