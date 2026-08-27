package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ gi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kh(gi giVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = giVar;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.draw(canvas);
                this.b.X.draw(canvas);
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
                gi giVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, giVar.u0.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(giVar.F0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                giVar.F0.setColor(i0.b.k(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.C5), (int) (((giVar.R0 * 0.42d) + 0.58d) * Color.alpha(r5))));
                giVar.H0.setColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.h5));
                int i10 = max / 2;
                giVar.G0.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(giVar.G0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), giVar.H0);
                giVar.H0.setColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.W9));
                giVar.G0.set(AndroidUtilities.dp(2.0f) + r6, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(giVar.G0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), giVar.H0);
                canvas.drawText(format, measuredWidth - (r2 / 2), AndroidUtilities.dp(16.2f), giVar.F0);
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
                this.b.X.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}
