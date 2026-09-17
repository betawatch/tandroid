package org.telegram.ui.Cells;

import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class b8 extends org.telegram.ui.ActionBar.j5 {
    @Override // org.telegram.ui.ActionBar.j5
    public final boolean k(CharSequence charSequence) {
        return l(Emoji.replaceEmoji(charSequence, getPaint().getFontMetricsInt(), false), false);
    }
}
