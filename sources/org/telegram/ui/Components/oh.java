package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class oh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh(mi miVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = miVar;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.Y.draw(canvas);
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
                mi miVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, miVar.v0.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(miVar.G0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                miVar.G0.setColor(i0.a.k(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.C5), (int) (((miVar.S0 * 0.42d) + 0.58d) * Color.alpha(r5))));
                miVar.I0.setColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.h5));
                int i10 = max / 2;
                miVar.H0.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(miVar.H0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), miVar.I0);
                miVar.I0.setColor(miVar.getThemedColor(org.telegram.ui.ActionBar.k6.W9));
                miVar.H0.set(AndroidUtilities.dp(2.0f) + r6, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(miVar.H0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), miVar.I0);
                canvas.drawText(format, measuredWidth - (r2 / 2), AndroidUtilities.dp(16.2f), miVar.G0);
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
                this.b.Y.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
