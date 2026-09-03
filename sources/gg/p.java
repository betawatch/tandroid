package gg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xc0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class p extends LinearLayout {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final /* synthetic */ xc0 c;
    public final Object d;
    public final /* synthetic */ xc0 e;
    public final /* synthetic */ xc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, x4 x4Var, xc0 xc0Var, n nVar, o oVar) {
        super(context);
        this.c = xc0Var;
        this.e = nVar;
        this.f = oVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(x4Var.a);
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
                xc0 xc0Var = this.c;
                xc0Var.setItemCount(i12);
                nVar.setItemCount(i12);
                oVar.setItemCount(i12);
                xc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                nVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                oVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                xc0 xc0Var2 = (xc0) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                xc0 xc0Var3 = this.c;
                xc0Var3.setItemCount(i13);
                xc0Var2.setItemCount(i13);
                xc0 xc0Var4 = this.e;
                xc0Var4.setItemCount(i13);
                xc0 xc0Var5 = this.f;
                xc0Var5.setItemCount(i13);
                xc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                xc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                xc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                xc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
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
    public p(Context context, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, xc0 xc0Var4) {
        super(context);
        this.c = xc0Var;
        this.d = xc0Var2;
        this.e = xc0Var3;
        this.f = xc0Var4;
        this.b = false;
    }
}
