package org.telegram.messenger;

import android.text.util.Linkify;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i7, int i10) {
        return i7 == 0 || charSequence.charAt(i7 - 1) != '@';
    }
}
