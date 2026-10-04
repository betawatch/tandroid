package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class yh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ xi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh(xi xiVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = xiVar;
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
                xi xiVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, xiVar.y0.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(xiVar.J0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                xiVar.J0.setColor(i0.a.k(xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.C5), (int) (((xiVar.V0 * 0.42d) + 0.58d) * Color.alpha(r5))));
                xiVar.L0.setColor(xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.h5));
                int i10 = max / 2;
                xiVar.K0.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(xiVar.K0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), xiVar.L0);
                xiVar.L0.setColor(xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.W9));
                xiVar.K0.set(AndroidUtilities.dp(2.0f) + r6, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(xiVar.K0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), xiVar.L0);
                canvas.drawText(format, measuredWidth - (r2 / 2), AndroidUtilities.dp(16.2f), xiVar.J0);
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
