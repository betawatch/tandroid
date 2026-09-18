package org.telegram.ui.Cells;

import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b8 extends org.telegram.ui.ActionBar.k5 {
    @Override // org.telegram.ui.ActionBar.k5
    public final boolean k(CharSequence charSequence) {
        return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
    }
}
