// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class d62 extends View {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d62(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 14:
                canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
                break;
            case 15:
                canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
                break;
            case 16:
                canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
                break;
            case 17:
                canvas.drawLine(k96.a0 ? 0.0f : gl.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(20.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
                break;
            case 27:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, gl.L(14.0f), 2.0f, getMeasuredHeight() - gl.L(14.0f), bkb.j0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(6.0f), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (gl.q.y * 0.4f), TLObject.FLAG_30));
                break;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(300.0f), TLObject.FLAG_30));
                break;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), TLObject.FLAG_30));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(52.0f), TLObject.FLAG_30));
                break;
            case 6:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(4.0f), TLObject.FLAG_30));
                break;
            case 7:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(81.0f), TLObject.FLAG_30));
                break;
            case 8:
                Point point = gl.q;
                int i3 = point.x;
                int i4 = point.y;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i4 * (i3 < i4 ? 0.56f : 0.3f)), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(h75.u5 ? 0.0f : 8.0f), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(5.0f), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(16.0f), TLObject.FLAG_30));
                break;
            case 12:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(52.0f), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(8.0f), TLObject.FLAG_30));
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 27:
            default:
                super.onMeasure(i, i2);
                break;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(12.0f), TLObject.FLAG_30));
                break;
            case 19:
                setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(36.0f));
                break;
            case 20:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(68.0f), TLObject.FLAG_30));
                break;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(7.33f), TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(16.0f), TLObject.FLAG_30));
                break;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(52.0f), TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(i, i2);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                break;
            case 25:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(52.0f), TLObject.FLAG_30));
                break;
            case 26:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(32.0f), TLObject.FLAG_30));
                break;
            case 28:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(4.0f), TLObject.FLAG_30));
                break;
        }
    }
}
