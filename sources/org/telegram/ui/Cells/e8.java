package org.telegram.ui.Cells;

import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e8 extends org.telegram.ui.ActionBar.b6 {
    @Override // org.telegram.ui.ActionBar.b6
    public final boolean k(CharSequence charSequence) {
        return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
    }
}
