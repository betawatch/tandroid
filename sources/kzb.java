// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class kzb extends FrameLayout implements tjb {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final /* synthetic */ rzb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzb(rzb rzbVar, Context context) {
        super(context);
        this.d = rzbVar;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(bkb.v0(bkb.g5, rzbVar.J0));
        bkb.m(paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        rzb rzbVar = this.d;
        float F0 = rzbVar.F0(true);
        float U1 = gl.U1(moe.a(F0 / gl.N(24.0f), 0.0f, 1.0f), 0, gl.L(12.0f));
        rzbVar.w1.setTranslationY(Math.max(gl.m, F0));
        boolean z = F0 <= ((float) gl.m) / 2.0f;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z) {
            this.c = Boolean.valueOf(z);
            gl.n3(rzbVar.getWindow(), gl.B(z ? bkb.v0(bkb.g5, rzbVar.J0) : bkb.v(bkb.v0(bkb.r8, rzbVar.J0), 855638016)) > 0.721f);
        }
        rzbVar.F.setTranslationY(Math.max(rzbVar.F.getHeight() + gl.L(56.0f) + gl.m, F0) + getTranslationY() + ((-r1.getTop()) - rzbVar.F.getHeight()));
        Path path = this.a;
        path.rewind();
        RectF rectF = gl.P;
        rectF.set(0.0f, F0, getWidth(), getHeight() + U1);
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        rzb rzbVar = this.d;
        qib qibVar = rzbVar.J1;
        fib fibVar = rzbVar.I1;
        if (fibVar != null && qibVar != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + fibVar.w());
            }
            if (fibVar.w() && qibVar.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b = qibVar.b(motionEvent);
            if (motionEvent.getAction() == 1) {
                Log.d("TA2", "checkOnTap=" + b);
            }
            if (b) {
                motionEvent.setAction(3);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTag(R.id.bulletin_delegate_tag, new oy((byte) 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setTag(R.id.bulletin_delegate_tag, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        rzb rzbVar = this.d;
        rzbVar.F.setTranslationY(Math.max(rzbVar.F.getHeight() + gl.L(56.0f) + gl.m, rzbVar.F0(true)) + ((-r0.getTop()) - rzbVar.F.getHeight()) + f);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.b.setColor(bkb.v0(bkb.g5, this.d.J0));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
