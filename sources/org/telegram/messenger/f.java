package org.telegram.messenger;

import android.text.util.Linkify;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i3, int i10) {
        return i3 == 0 || charSequence.charAt(i3 - 1) != '@';
    }
}
