package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.w4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ bc0 c;
    public final Object d;
    public final /* synthetic */ bc0 e;
    public final /* synthetic */ bc0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, w4 w4Var, bc0 bc0Var, q qVar, r rVar) {
        super(context);
        this.c = bc0Var;
        this.e = qVar;
        this.f = rVar;
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
                canvas.drawText(":", ((q) this.e).getRight() - AndroidUtilities.dp(12.0f), (getHeight() / 2.0f) - AndroidUtilities.dp(11.0f), (TextPaint) this.d);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 0:
                r rVar = (r) this.f;
                q qVar = (q) this.e;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i11 = point.x > point.y ? 3 : 5;
                bc0 bc0Var = this.c;
                bc0Var.setItemCount(i11);
                qVar.setItemCount(i11);
                rVar.setItemCount(i11);
                bc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                qVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                rVar.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i11;
                this.b = false;
                super.onMeasure(i9, i10);
                break;
            default:
                bc0 bc0Var2 = (bc0) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i12 = point2.x > point2.y ? 3 : 5;
                bc0 bc0Var3 = this.c;
                bc0Var3.setItemCount(i12);
                bc0Var2.setItemCount(i12);
                bc0 bc0Var4 = this.e;
                bc0Var4.setItemCount(i12);
                bc0 bc0Var5 = this.f;
                bc0Var5.setItemCount(i12);
                bc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                bc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                bc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                bc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i9, i10);
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
    public s(Context context, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, bc0 bc0Var4) {
        super(context);
        this.c = bc0Var;
        this.d = bc0Var2;
        this.e = bc0Var3;
        this.f = bc0Var4;
        this.b = false;
    }
}
