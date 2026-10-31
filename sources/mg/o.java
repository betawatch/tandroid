package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextPaint;
import android.widget.LinearLayout;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.p4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o extends LinearLayout {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public final /* synthetic */ ac0 c;
    public final Object d;
    public final /* synthetic */ ac0 e;
    public final /* synthetic */ ac0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, p4 p4Var, ac0 ac0Var, m mVar, n nVar) {
        super(context);
        this.c = ac0Var;
        this.e = mVar;
        this.f = nVar;
        this.b = false;
        TextPaint textPaint = new TextPaint(1);
        this.d = textPaint;
        setWillNotDraw(false);
        textPaint.setTextSize(org.telegram.messenger.i0.L(20.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setColor(p4Var.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                canvas.drawText(":", ((m) this.e).getRight() - org.telegram.messenger.i0.L(12.0f), (getHeight() / 2.0f) - org.telegram.messenger.i0.L(11.0f), (TextPaint) this.d);
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
                n nVar = (n) this.f;
                m mVar = (m) this.e;
                this.b = true;
                Point point = org.telegram.messenger.i0.q;
                int i12 = point.x > point.y ? 3 : 5;
                ac0 ac0Var = this.c;
                ac0Var.setItemCount(i12);
                mVar.setItemCount(i12);
                nVar.setItemCount(i12);
                ac0Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                mVar.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                nVar.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                ac0 ac0Var2 = (ac0) this.d;
                this.b = true;
                Point point2 = org.telegram.messenger.i0.q;
                int i13 = point2.x > point2.y ? 3 : 5;
                ac0 ac0Var3 = this.c;
                ac0Var3.setItemCount(i13);
                ac0Var2.setItemCount(i13);
                ac0 ac0Var4 = this.e;
                ac0Var4.setItemCount(i13);
                ac0 ac0Var5 = this.f;
                ac0Var5.setItemCount(i13);
                ac0Var3.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                ac0Var2.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                ac0Var4.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                ac0Var5.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
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
    public o(Context context, ac0 ac0Var, ac0 ac0Var2, ac0 ac0Var3, ac0 ac0Var4) {
        super(context);
        this.c = ac0Var;
        this.d = ac0Var2;
        this.e = ac0Var3;
        this.f = ac0Var4;
        this.b = false;
    }
}
