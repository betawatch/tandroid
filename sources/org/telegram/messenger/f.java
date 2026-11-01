package org.telegram.messenger;

import android.text.util.Linkify;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i10, int i11) {
        return i10 == 0 || charSequence.charAt(i10 - 1) != '@';
    }
}
