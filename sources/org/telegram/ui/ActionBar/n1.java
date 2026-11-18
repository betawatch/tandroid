package org.telegram.ui.ActionBar;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class n1 extends o5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1(Context context, int i7) {
        super(context);
        this.d = i7;
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

    @Override // org.telegram.ui.ActionBar.o5, android.widget.TextView
    public final void setTextColor(int i7) {
        switch (this.d) {
            case 0:
                super.setTextColor(i7);
                setBackground(n6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
            case 1:
                super.setTextColor(i7);
                setBackground(n6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
            case 2:
                super.setTextColor(i7);
                setBackground(n6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
            default:
                super.setTextColor(i7);
                setBackgroundDrawable(n6.J0(org.telegram.messenger.g0.L(20.0f), i7));
                break;
        }
    }
}
