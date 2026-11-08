package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tm extends View {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tm(Context context, int i7) {
        super(context);
        this.a = i7;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 8:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, org.telegram.messenger.g0.L(14.0f), 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(14.0f), org.telegram.ui.ActionBar.k6.k0);
                break;
            case 15:
                canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
                break;
            case 16:
                canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
                break;
            case 17:
                canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
                break;
            case 18:
                canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
                break;
            case 26:
                canvas.drawLine(org.telegram.messenger.id.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(32.0f), TLObject.FLAG_30));
                break;
            case 2:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
                break;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
                break;
            case 4:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(81.0f), TLObject.FLAG_30));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(8.0f), TLObject.FLAG_30));
                break;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
                break;
            case 7:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.q.y * 0.4f), TLObject.FLAG_30));
                break;
            case 8:
            case 15:
            case 16:
            case 17:
            case 18:
            case 26:
            default:
                super.onMeasure(i7, i10);
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(300.0f), TLObject.FLAG_30));
                break;
            case 10:
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x;
                int i12 = point.y;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec((int) (i12 * (i11 < i12 ? 0.56f : 0.3f)), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(5.0f), TLObject.FLAG_30));
                break;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (org.telegram.messenger.g0.q.y * 0.4f), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(4.0f), TLObject.FLAG_30));
                break;
            case 14:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(org.telegram.ui.c40.w5 ? 0.0f : 8.0f), TLObject.FLAG_30));
                break;
            case 19:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(12.0f), TLObject.FLAG_30));
                break;
            case 20:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(36.0f));
                break;
            case 21:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(7.33f), TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30));
                break;
            case 23:
                super.onMeasure(i7, i10);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                break;
            case 24:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(52.0f), TLObject.FLAG_30));
                break;
            case 25:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(4.0f), TLObject.FLAG_30));
                break;
            case 27:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(6.0f), TLObject.FLAG_30));
                break;
            case 28:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), TLObject.FLAG_30));
                break;
        }
    }
}
