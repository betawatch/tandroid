package org.telegram.ui.ActionBar;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l1 extends l5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Context context, int i3) {
        super(context);
        this.d = i3;
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

    @Override // org.telegram.ui.ActionBar.l5, android.widget.TextView
    public final void setTextColor(int i3) {
        switch (this.d) {
            case 0:
                super.setTextColor(i3);
                setBackground(k6.J0(org.telegram.messenger.g0.L(20.0f), i3));
                break;
            case 1:
                super.setTextColor(i3);
                setBackground(k6.J0(org.telegram.messenger.g0.L(20.0f), i3));
                break;
            case 2:
                super.setTextColor(i3);
                setBackground(k6.J0(org.telegram.messenger.g0.L(20.0f), i3));
                break;
            default:
                super.setTextColor(i3);
                setBackgroundDrawable(k6.J0(org.telegram.messenger.g0.L(20.0f), i3));
                break;
        }
    }
}
