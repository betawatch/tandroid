package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh(ti tiVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = tiVar;
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
                ti tiVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, tiVar.B0.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(tiVar.M0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                tiVar.M0.setColor(i0.a.o(tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.C5), (int) (((tiVar.Y0 * 0.42d) + 0.58d) * Color.alpha(r5))));
                tiVar.O0.setColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.h5));
                int i10 = max / 2;
                tiVar.N0.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(tiVar.N0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), tiVar.O0);
                tiVar.O0.setColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.W9));
                tiVar.N0.set(AndroidUtilities.dp(2.0f) + r6, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(tiVar.N0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), tiVar.O0);
                canvas.drawText(format, measuredWidth - (r2 / 2), AndroidUtilities.dp(16.2f), tiVar.M0);
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
