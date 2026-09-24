package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ai extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ wi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai(wi wiVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = wiVar;
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
                wi wiVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, wiVar.y0.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(wiVar.J0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                wiVar.J0.setColor(i0.a.k(wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.C5), (int) (((wiVar.V0 * 0.42d) + 0.58d) * Color.alpha(r5))));
                wiVar.L0.setColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.h5));
                int i10 = max / 2;
                wiVar.K0.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(wiVar.K0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), wiVar.L0);
                wiVar.L0.setColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.W9));
                wiVar.K0.set(AndroidUtilities.dp(2.0f) + r6, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(wiVar.K0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), wiVar.L0);
                canvas.drawText(format, measuredWidth - (r2 / 2), AndroidUtilities.dp(16.2f), wiVar.J0);
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
