package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class an extends View {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ an(Context context, int i9) {
        super(context);
        this.a = i9;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                if (getAlpha() != 0.0f) {
                    AndroidUtilities.rectTmp.set(0.0f, 0.0f, getWidth(), getHeight());
                    invalidate();
                    break;
                }
                break;
            case 10:
                super.onDraw(canvas);
                canvas.drawLine(0.0f, AndroidUtilities.dp(14.0f), 2.0f, getMeasuredHeight() - AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.k0);
                break;
            case 17:
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
                break;
            case 18:
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
                break;
            case 19:
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
                break;
            case 20:
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
                break;
            case 28:
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 1:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
                break;
            case 2:
            case 10:
            case 17:
            case 18:
            case 19:
            case 20:
            case 28:
            default:
                super.onMeasure(i9, i10);
                break;
            case 3:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), TLObject.FLAG_30));
                break;
            case 4:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
                break;
            case 6:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), TLObject.FLAG_30));
                break;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(8.0f), TLObject.FLAG_30));
                break;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
                break;
            case 9:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), TLObject.FLAG_30));
                break;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), TLObject.FLAG_30));
                break;
            case 12:
                Point point = AndroidUtilities.displaySize;
                int i11 = point.x;
                int i12 = point.y;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (i12 * (i11 < i12 ? 0.56f : 0.3f)), TLObject.FLAG_30));
                break;
            case 13:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(5.0f), TLObject.FLAG_30));
                break;
            case 14:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), TLObject.FLAG_30));
                break;
            case 15:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
                break;
            case 16:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(org.telegram.ui.o50.B3 ? 0.0f : 8.0f), TLObject.FLAG_30));
                break;
            case 21:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), TLObject.FLAG_30));
                break;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
                break;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(7.33f), TLObject.FLAG_30));
                break;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), TLObject.FLAG_30));
                break;
            case 25:
                super.onMeasure(i9, i10);
                setPivotX(getMeasuredWidth() / 2);
                setPivotY(getMeasuredHeight());
                break;
            case 26:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), TLObject.FLAG_30));
                break;
            case 27:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), TLObject.FLAG_30));
                break;
            case 29:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(6.0f), TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }
}
