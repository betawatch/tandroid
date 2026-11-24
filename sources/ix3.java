// default package

import android.animation.ValueAnimator;
import android.view.View;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ix3 extends View {
    public il5[] a;
    public ml b;
    public gm c;
    public ValueAnimator d;
    public float e;

    public TLRPC.Document getDocument() {
        gm gmVar = this.c;
        if (gmVar == null) {
            return null;
        }
        TLRPC.Document document = gmVar.document;
        if (document != null) {
            return document;
        }
        return vl.e(y6c.t0, gmVar.getDocumentId());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setPadding(gl.L(2.0f), gl.L(2.0f), gl.L(2.0f), gl.L(2.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.removeAllListeners();
                this.d.cancel();
            }
            if (z) {
                return;
            }
            float f = this.e;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new uz1(this, (byte) 19));
                this.d.addListener(new im2(this, (byte) 16));
                b00.n(5.0f, this.d);
                this.d.setDuration(350L);
                this.d.start();
            }
        }
    }
}
