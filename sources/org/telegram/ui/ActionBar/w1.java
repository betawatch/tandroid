package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class w1 extends k5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w1(Context context, int i10) {
        super(context);
        this.d = i10;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z10) {
        switch (this.d) {
            case 0:
                super.setEnabled(z10);
                setAlpha(z10 ? 1.0f : 0.5f);
                break;
            case 1:
                super.setEnabled(z10);
                setAlpha(z10 ? 1.0f : 0.5f);
                break;
            case 2:
                super.setEnabled(z10);
                setAlpha(z10 ? 1.0f : 0.5f);
                break;
            default:
                super.setEnabled(z10);
                setAlpha(z10 ? 1.0f : 0.5f);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.k5, android.widget.TextView
    public final void setTextColor(int i10) {
        switch (this.d) {
            case 0:
                super.setTextColor(i10);
                setBackground(i6.G0(AndroidUtilities.dp(20.0f), i10));
                break;
            case 1:
                super.setTextColor(i10);
                setBackground(i6.G0(AndroidUtilities.dp(20.0f), i10));
                break;
            case 2:
                super.setTextColor(i10);
                setBackground(i6.G0(AndroidUtilities.dp(20.0f), i10));
                break;
            default:
                super.setTextColor(i10);
                setBackgroundDrawable(i6.G0(AndroidUtilities.dp(20.0f), i10));
                break;
        }
    }
}
