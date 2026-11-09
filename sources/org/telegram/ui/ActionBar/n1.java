package org.telegram.ui.ActionBar;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n1 extends m5 {
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

    @Override // org.telegram.ui.ActionBar.m5, android.widget.TextView
    public final void setTextColor(int i7) {
        switch (this.d) {
            case 0:
                super.setTextColor(i7);
                setBackground(l6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
            case 1:
                super.setTextColor(i7);
                setBackground(l6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
            case 2:
                super.setTextColor(i7);
                setBackground(l6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
            default:
                super.setTextColor(i7);
                setBackgroundDrawable(l6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
        }
    }
}
