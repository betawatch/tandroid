package org.telegram.ui.ActionBar;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q1 extends v5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(Context context, int i10) {
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

    @Override // org.telegram.ui.ActionBar.v5, android.widget.TextView
    public final void setTextColor(int i10) {
        switch (this.d) {
            case 0:
                super.setTextColor(i10);
                setBackground(t6.J0(org.telegram.messenger.i0.L(20.0f), i10));
                break;
            case 1:
                super.setTextColor(i10);
                setBackground(t6.J0(org.telegram.messenger.i0.L(20.0f), i10));
                break;
            case 2:
                super.setTextColor(i10);
                setBackground(t6.J0(org.telegram.messenger.i0.L(20.0f), i10));
                break;
            default:
                super.setTextColor(i10);
                setBackgroundDrawable(t6.J0(org.telegram.messenger.i0.L(20.0f), i10));
                break;
        }
    }
}
