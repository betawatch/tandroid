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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class k3c extends FrameLayout implements snb {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final /* synthetic */ r3c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3c(r3c r3cVar, Context context) {
        super(context);
        this.d = r3cVar;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(aob.v0(aob.h5, r3cVar.J0));
        aob.m(paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r3c r3cVar = this.d;
        float G0 = r3cVar.G0(true);
        float U1 = hl.U1(ete.a(G0 / hl.N(24.0f), 0.0f, 1.0f), 0, hl.L(12.0f));
        r3cVar.w1.setTranslationY(Math.max(hl.m, G0));
        boolean z = G0 <= ((float) hl.m) / 2.0f;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z) {
            this.c = Boolean.valueOf(z);
            hl.n3(r3cVar.getWindow(), hl.B(z ? aob.v0(aob.h5, r3cVar.J0) : aob.v(aob.v0(aob.s8, r3cVar.J0), 855638016)) > 0.721f);
        }
        r3cVar.F.setTranslationY(Math.max(r3cVar.F.getHeight() + hl.L(56.0f) + hl.m, G0) + getTranslationY() + ((-r1.getTop()) - r3cVar.F.getHeight()));
        Path path = this.a;
        path.rewind();
        RectF rectF = hl.P;
        rectF.set(0.0f, G0, getWidth(), getHeight() + U1);
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        r3c r3cVar = this.d;
        lmb lmbVar = r3cVar.J1;
        amb ambVar = r3cVar.I1;
        if (ambVar != null && lmbVar != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + ambVar.w());
            }
            if (ambVar.w() && lmbVar.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b = lmbVar.b(motionEvent);
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
        setTag(R.id.bulletin_delegate_tag, new py((byte) 16));
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
        r3c r3cVar = this.d;
        r3cVar.F.setTranslationY(Math.max(r3cVar.F.getHeight() + hl.L(56.0f) + hl.m, r3cVar.G0(true)) + ((-r0.getTop()) - r3cVar.F.getHeight()) + f);
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.b.setColor(aob.v0(aob.h5, this.d.J0));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
