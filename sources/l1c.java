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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class l1c extends FrameLayout implements vlb {
    public final Path a;
    public final Paint b;
    public Boolean c;
    public final /* synthetic */ s1c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1c(s1c s1cVar, Context context) {
        super(context);
        this.d = s1cVar;
        this.a = new Path();
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setColor(cmb.v0(cmb.g5, s1cVar.J0));
        cmb.m(paint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        s1c s1cVar = this.d;
        float F0 = s1cVar.F0(true);
        float U1 = gm.U1(pqe.a(F0 / gm.N(24.0f), 0.0f, 1.0f), 0, gm.L(12.0f));
        s1cVar.w1.setTranslationY(Math.max(gm.m, F0));
        boolean z = F0 <= ((float) gm.m) / 2.0f;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z) {
            this.c = Boolean.valueOf(z);
            gm.n3(s1cVar.getWindow(), gm.B(z ? cmb.v0(cmb.g5, s1cVar.J0) : cmb.v(cmb.v0(cmb.r8, s1cVar.J0), 855638016)) > 0.721f);
        }
        s1cVar.F.setTranslationY(Math.max(s1cVar.F.getHeight() + gm.L(56.0f) + gm.m, F0) + getTranslationY() + ((-r1.getTop()) - s1cVar.F.getHeight()));
        Path path = this.a;
        path.rewind();
        RectF rectF = gm.P;
        rectF.set(0.0f, F0, getWidth(), getHeight() + U1);
        path.addRoundRect(rectF, U1, U1, Path.Direction.CW);
        canvas.drawPath(path, this.b);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        s1c s1cVar = this.d;
        rkb rkbVar = s1cVar.J1;
        gkb gkbVar = s1cVar.I1;
        if (gkbVar != null && rkbVar != null) {
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + gkbVar.w());
            }
            if (gkbVar.w() && rkbVar.onTouchEvent(motionEvent)) {
                Log.d("TA2", "overlay consumed (handle)");
                return true;
            }
            boolean b = rkbVar.b(motionEvent);
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
        setTag(R.id.bulletin_delegate_tag, new oz((byte) 16));
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
        s1c s1cVar = this.d;
        s1cVar.F.setTranslationY(Math.max(s1cVar.F.getHeight() + gm.L(56.0f) + gm.m, s1cVar.F0(true)) + ((-r0.getTop()) - s1cVar.F.getHeight()) + f);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.b.setColor(cmb.v0(cmb.g5, this.d.J0));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
