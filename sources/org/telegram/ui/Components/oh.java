package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class oh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh(ki kiVar, Context context, int i9) {
        super(context);
        this.a = i9;
        this.b = kiVar;
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
                ki kiVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, kiVar.u0.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(kiVar.F0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                kiVar.F0.setColor(i0.a.k(kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.C5), (int) (((kiVar.R0 * 0.42d) + 0.58d) * Color.alpha(r5))));
                kiVar.H0.setColor(kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.h5));
                int i9 = max / 2;
                kiVar.G0.set(measuredWidth - i9, 0.0f, i9 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(kiVar.G0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), kiVar.H0);
                kiVar.H0.setColor(kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.W9));
                kiVar.G0.set(AndroidUtilities.dp(2.0f) + r6, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(kiVar.G0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), kiVar.H0);
                canvas.drawText(format, measuredWidth - (r2 / 2), AndroidUtilities.dp(16.2f), kiVar.F0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i9, i10, i11, i12);
                this.b.X.setBounds(0, (i10 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i9, i10);
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }
}
