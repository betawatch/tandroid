package org.telegram.messenger;

import android.text.util.Linkify;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i7, int i10) {
        return i7 == 0 || charSequence.charAt(i7 - 1) != '@';
    }
}
