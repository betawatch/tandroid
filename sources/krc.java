// default package

import android.content.Context;
import android.graphics.Canvas;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class krc extends FrameLayout {
    public final /* synthetic */ nrc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krc(nrc nrcVar, Context context) {
        super(context);
        this.a = nrcVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(-getLeft(), -getTop());
        guc gucVar = this.a.j;
        gucVar.p(canvas);
        canvas.restore();
        super.dispatchDraw(canvas);
        if (gucVar.q()) {
            postInvalidateOnAnimation();
        }
    }
}
