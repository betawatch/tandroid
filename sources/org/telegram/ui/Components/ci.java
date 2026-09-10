package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ci extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ yi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ci(yi yiVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = yiVar;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.b0.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 1:
                yi yiVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, yiVar.y0.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(yiVar.J0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                yiVar.J0.setColor(i0.a.k(yiVar.getThemedColor(org.telegram.ui.ActionBar.j6.C5), (int) (((yiVar.V0 * 0.42d) + 0.58d) * Color.alpha(r5))));
                yiVar.L0.setColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                int i10 = max / 2;
                yiVar.K0.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(yiVar.K0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), yiVar.L0);
                yiVar.L0.setColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.j6.W9));
                yiVar.K0.set(AndroidUtilities.dp(2.0f) + r6, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(yiVar.K0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), yiVar.L0);
                canvas.drawText(format, measuredWidth - (r2 / 2), AndroidUtilities.dp(16.2f), yiVar.J0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.b.b0.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
