package org.telegram.ui.ActionBar;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x1 extends i5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Context context, int i9) {
        super(context);
        this.d = i9;
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

    @Override // org.telegram.ui.ActionBar.i5, android.widget.TextView
    public final void setTextColor(int i9) {
        switch (this.d) {
            case 0:
                super.setTextColor(i9);
                setBackground(f6.G0(AndroidUtilities.dp(20.0f), i9));
                break;
            case 1:
                super.setTextColor(i9);
                setBackground(f6.G0(AndroidUtilities.dp(20.0f), i9));
                break;
            case 2:
                super.setTextColor(i9);
                setBackground(f6.G0(AndroidUtilities.dp(20.0f), i9));
                break;
            default:
                super.setTextColor(i9);
                setBackgroundDrawable(f6.G0(AndroidUtilities.dp(20.0f), i9));
                break;
        }
    }
}
