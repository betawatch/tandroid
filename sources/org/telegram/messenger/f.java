package org.telegram.messenger;

import android.text.util.Linkify;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i7, int i10) {
        return i7 == 0 || charSequence.charAt(i7 - 1) != '@';
    }
}
