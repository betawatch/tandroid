package org.telegram.ui.Cells;

import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b8 extends org.telegram.ui.ActionBar.h5 {
    @Override // org.telegram.ui.ActionBar.h5
    public final boolean k(CharSequence charSequence) {
        return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
    }
}
