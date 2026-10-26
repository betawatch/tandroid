package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class e4 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ md0 c;
    public final Object d;
    public final /* synthetic */ md0 e;
    public final /* synthetic */ md0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(Context context, d5 d5Var, md0 md0Var, vg.h hVar, vg.i iVar) {
        super(context);
        this.c = md0Var;
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
                md0 md0Var = (md0) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                md0 md0Var2 = this.c;
                md0Var2.setItemCount(i12);
                md0Var.setItemCount(i12);
                md0 md0Var3 = this.e;
                md0Var3.setItemCount(i12);
                md0 md0Var4 = this.f;
                md0Var4.setItemCount(i12);
                md0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                md0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                md0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                md0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                vg.i iVar = (vg.i) this.f;
                vg.h hVar = (vg.h) this.e;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                md0 md0Var5 = this.c;
                md0Var5.setItemCount(i13);
                hVar.setItemCount(i13);
                iVar.setItemCount(i13);
                md0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
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
    public e4(Context context, md0 md0Var, md0 md0Var2, md0 md0Var3, md0 md0Var4) {
        super(context);
        this.c = md0Var;
        this.d = md0Var2;
        this.e = md0Var3;
        this.f = md0Var4;
        this.b = false;
    }
}
