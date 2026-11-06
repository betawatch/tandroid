package org.telegram.ui.ActionBar;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class n1 extends l5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Context context, int i7) {
        super(context);
        this.d = i7;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z9) {
        switch (this.d) {
            case 0:
                super.setEnabled(z9);
                setAlpha(z9 ? 1.0f : 0.5f);
                break;
            case 1:
                super.setEnabled(z9);
                setAlpha(z9 ? 1.0f : 0.5f);
                break;
            case 2:
                super.setEnabled(z9);
                setAlpha(z9 ? 1.0f : 0.5f);
                break;
            default:
                super.setEnabled(z9);
                setAlpha(z9 ? 1.0f : 0.5f);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.l5, android.widget.TextView
    public final void setTextColor(int i7) {
        switch (this.d) {
            case 0:
                super.setTextColor(i7);
                setBackground(k6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
            case 1:
                super.setTextColor(i7);
                setBackground(k6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
            case 2:
                super.setTextColor(i7);
                setBackground(k6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
            default:
                super.setTextColor(i7);
                setBackgroundDrawable(k6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
        }
    }
}
