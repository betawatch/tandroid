// default package

import android.text.util.Linkify;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class il implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i, int i2) {
        return i == 0 || charSequence.charAt(i - 1) != '@';
    }
}
