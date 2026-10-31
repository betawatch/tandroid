package org.telegram.messenger;

import android.text.util.Linkify;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i10, int i11) {
        return i10 == 0 || charSequence.charAt(i10 - 1) != '@';
    }
}
