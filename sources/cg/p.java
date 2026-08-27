package cg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.w4;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class p extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ fc0 c;
    public final Object d;
    public final /* synthetic */ fc0 e;
    public final /* synthetic */ fc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, w4 w4Var, fc0 fc0Var, n nVar, o oVar) {
        super(context);
        this.c = fc0Var;
        this.e = nVar;
        this.f = oVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(w4Var.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                canvas.drawText(":", ((n) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
                o oVar = (o) this.f;
                n nVar = (n) this.e;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                fc0 fc0Var = this.c;
                fc0Var.setItemCount(i12);
                nVar.setItemCount(i12);
                oVar.setItemCount(i12);
                fc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                oVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                fc0 fc0Var2 = (fc0) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                fc0 fc0Var3 = this.c;
                fc0Var3.setItemCount(i13);
                fc0Var2.setItemCount(i13);
                fc0 fc0Var4 = this.e;
                fc0Var4.setItemCount(i13);
                fc0 fc0Var5 = this.f;
                fc0Var5.setItemCount(i13);
                fc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                fc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
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
    public p(Context context, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, fc0 fc0Var4) {
        super(context);
        this.c = fc0Var;
        this.d = fc0Var2;
        this.e = fc0Var3;
        this.f = fc0Var4;
        this.b = false;
    }
}
