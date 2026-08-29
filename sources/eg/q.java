package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.qc0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ qc0 c;
    public final Object d;
    public final /* synthetic */ qc0 e;
    public final /* synthetic */ qc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, a5 a5Var, qc0 qc0Var, o oVar, p pVar) {
        super(context);
        this.c = qc0Var;
        this.e = oVar;
        this.f = pVar;
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
            case 0:
                super.onDraw(canvas);
                canvas.drawText(":", ((o) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
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
                p pVar = (p) this.f;
                o oVar = (o) this.e;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                qc0 qc0Var = this.c;
                qc0Var.setItemCount(i12);
                oVar.setItemCount(i12);
                pVar.setItemCount(i12);
                qc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                oVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                pVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                qc0 qc0Var2 = (qc0) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                qc0 qc0Var3 = this.c;
                qc0Var3.setItemCount(i13);
                qc0Var2.setItemCount(i13);
                qc0 qc0Var4 = this.e;
                qc0Var4.setItemCount(i13);
                qc0 qc0Var5 = this.f;
                qc0Var5.setItemCount(i13);
                qc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                qc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                qc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                qc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
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
    public q(Context context, qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, qc0 qc0Var4) {
        super(context);
        this.c = qc0Var;
        this.d = qc0Var2;
        this.e = qc0Var3;
        this.f = qc0Var4;
        this.b = false;
    }
}
