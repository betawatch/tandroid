package org.telegram.messenger;

import android.text.util.Linkify;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i7, int i10) {
        return i7 == 0 || charSequence.charAt(i7 - 1) != '@';
    }
}
