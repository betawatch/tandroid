package org.telegram.messenger;

import android.text.util.Linkify;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i7, int i10) {
        return i7 == 0 || charSequence.charAt(i7 - 1) != '@';
    }
}
