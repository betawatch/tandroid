package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y1 extends m5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Context context, int i10) {
        super(context);
        this.d = i10;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z4) {
        switch (this.d) {
            case 0:
                super.setEnabled(z4);
                setAlpha(z4 ? 1.0f : 0.5f);
                break;
            case 1:
                super.setEnabled(z4);
                setAlpha(z4 ? 1.0f : 0.5f);
                break;
            case 2:
                super.setEnabled(z4);
                setAlpha(z4 ? 1.0f : 0.5f);
                break;
            default:
                super.setEnabled(z4);
                setAlpha(z4 ? 1.0f : 0.5f);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m5, android.widget.TextView
    public final void setTextColor(int i10) {
        switch (this.d) {
            case 0:
                super.setTextColor(i10);
                setBackground(k6.G0(AndroidUtilities.dp(20.0f), i10));
                break;
            case 1:
                super.setTextColor(i10);
                setBackground(k6.G0(AndroidUtilities.dp(20.0f), i10));
                break;
            case 2:
                super.setTextColor(i10);
                setBackground(k6.G0(AndroidUtilities.dp(20.0f), i10));
                break;
            default:
                super.setTextColor(i10);
                setBackgroundDrawable(k6.G0(AndroidUtilities.dp(20.0f), i10));
                break;
        }
    }
}
