package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class zh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zh(vi viVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = viVar;
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
                vi viVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, viVar.y0.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(viVar.J0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                viVar.J0.setColor(i0.a.k(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.C5), (int) (((viVar.V0 * 0.42d) + 0.58d) * Color.alpha(r5))));
                viVar.L0.setColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                int i10 = max / 2;
                viVar.K0.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(viVar.K0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), viVar.L0);
                viVar.L0.setColor(viVar.getThemedColor(org.telegram.ui.ActionBar.j6.W9));
                viVar.K0.set(AndroidUtilities.dp(2.0f) + r6, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(viVar.K0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), viVar.L0);
                canvas.drawText(format, measuredWidth - (r2 / 2), AndroidUtilities.dp(16.2f), viVar.J0);
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
