package org.telegram.ui.Components;

import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class m3 extends TextView {
    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(org.telegram.messenger.j6.m(charSequence, getPaint().getFontMetricsInt(), false, null, 0), bufferType);
    }
}
