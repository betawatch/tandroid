package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bn extends View {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bn(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 5:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, org.telegram.messenger.i0.L(14.0f), 2.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(14.0f), org.telegram.ui.ActionBar.t6.k0);
                break;
            case 12:
                canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
                break;
            case 13:
                canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
                break;
            case 14:
                canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
                break;
            case 15:
                canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
                break;
            case 23:
                canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
                break;
            case 25:
                if (getAlpha() != 0.0f) {
                    org.telegram.messenger.i0.P.set(0.0f, 0.0f, getWidth(), getHeight());
                    invalidate();
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(68.0f), TLObject.FLAG_30));
                break;
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), TLObject.FLAG_30));
                break;
            case 4:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.i0.q.y * 0.4f), TLObject.FLAG_30));
                break;
            case 5:
            case 12:
            case 13:
            case 14:
            case 15:
            case 23:
            case 25:
            default:
                super.onMeasure(i10, i11);
                break;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(300.0f), TLObject.FLAG_30));
                break;
            case 7:
                Point point = org.telegram.messenger.i0.q;
                int i12 = point.x;
                int i13 = point.y;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i13 * (i12 < i13 ? 0.56f : 0.3f)), TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(5.0f), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.i0.q.y * 0.4f), TLObject.FLAG_30));
                break;
            case 10:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(4.0f), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(org.telegram.ui.b50.w5 ? 0.0f : 8.0f), TLObject.FLAG_30));
                break;
            case 16:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(12.0f), TLObject.FLAG_30));
                break;
            case 17:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(36.0f));
                break;
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(7.33f), TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), TLObject.FLAG_30));
                break;
            case 20:
                super.onMeasure(i10, i11);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                break;
            case 21:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(4.0f), TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(6.0f), TLObject.FLAG_30));
                break;
            case 26:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), TLObject.FLAG_30));
                break;
            case 27:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), TLObject.FLAG_30));
                break;
            case 28:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(52.0f), TLObject.FLAG_30));
                break;
            case 29:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(81.0f), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 25:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
