package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.at;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class m1 extends View {
    public int a;
    public float b;
    public final /* synthetic */ n1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, Context context) {
        super(context);
        this.c = n1Var;
        setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        setLayoutParams(new s4.o0(-2, 0));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n1 n1Var = this.c;
        n1Var.e3.setColor(this.a);
        float min = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f;
        if (this.b != 0.0f) {
            min -= (n1Var.f3.getStrokeWidth() + org.telegram.messenger.i0.L(3.0f)) * this.b;
        }
        float width = ((getWidth() / 2.0f) + getPaddingLeft()) - getPaddingRight();
        float height = ((getHeight() / 2.0f) + getPaddingTop()) - getPaddingBottom();
        n1.A1(width, height, min, this.a, canvas);
        if (this.b != 0.0f) {
            n1Var.f3.setColor(this.a);
            n1Var.f3.setAlpha(at.e4);
            canvas.drawCircle(width, height, (Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - org.telegram.messenger.i0.L(2.0f), n1Var.f3);
        }
    }
}
