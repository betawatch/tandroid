package org.telegram.ui.Cells;

import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class a8 extends org.telegram.ui.ActionBar.j5 {
    @Override // org.telegram.ui.ActionBar.j5
    public final boolean k(CharSequence charSequence) {
        return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
    }
}
