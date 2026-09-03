package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class oh extends View {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh(li liVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.b = liVar;
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
                li liVar = this.b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, liVar.v0.getSelectedItemsCount())));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ((int) Math.ceil(liVar.G0.measureText(format))), AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                liVar.G0.setColor(i0.a.k(liVar.getThemedColor(org.telegram.ui.ActionBar.j6.C5), (int) (((liVar.S0 * 0.42d) + 0.58d) * Color.alpha(r5))));
                liVar.I0.setColor(liVar.getThemedColor(org.telegram.ui.ActionBar.j6.h5));
                int i10 = max / 2;
                liVar.H0.set(measuredWidth - i10, 0.0f, i10 + measuredWidth, getMeasuredHeight());
                canvas.drawRoundRect(liVar.H0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), liVar.I0);
                liVar.I0.setColor(liVar.getThemedColor(org.telegram.ui.ActionBar.j6.W9));
                liVar.H0.set(AndroidUtilities.dp(2.0f) + r6, AndroidUtilities.dp(2.0f), r3 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(liVar.H0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), liVar.I0);
                canvas.drawText(format, measuredWidth - (r2 / 2), AndroidUtilities.dp(16.2f), liVar.G0);
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
