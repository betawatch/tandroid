package org.telegram.ui.Components;

import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i4 extends p80 {
    @Override // org.telegram.ui.Components.p80, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(org.telegram.messenger.k6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
