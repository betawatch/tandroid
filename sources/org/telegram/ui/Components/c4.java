package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class c4 extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ vc0 c;
    public final Object d;
    public final /* synthetic */ vc0 e;
    public final /* synthetic */ vc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Context context, c5 c5Var, vc0 vc0Var, ug.h hVar, ug.i iVar) {
        super(context);
        this.c = vc0Var;
        this.e = hVar;
        this.f = iVar;
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
                canvas.drawText(":", ((ug.h) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
                vc0 vc0Var = (vc0) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                vc0 vc0Var2 = this.c;
                vc0Var2.setItemCount(i12);
                vc0Var.setItemCount(i12);
                vc0 vc0Var3 = this.e;
                vc0Var3.setItemCount(i12);
                vc0 vc0Var4 = this.f;
                vc0Var4.setItemCount(i12);
                vc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                vc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                vc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                vc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                ug.i iVar = (ug.i) this.f;
                ug.h hVar = (ug.h) this.e;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                vc0 vc0Var5 = this.c;
                vc0Var5.setItemCount(i13);
                hVar.setItemCount(i13);
                iVar.setItemCount(i13);
                vc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
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
    public c4(Context context, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, vc0 vc0Var4) {
        super(context);
        this.c = vc0Var;
        this.d = vc0Var2;
        this.e = vc0Var3;
        this.f = vc0Var4;
        this.b = false;
    }
}
