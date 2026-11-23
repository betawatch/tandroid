package ch;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t0 extends hi.e {
    public SpannableStringBuilder m0;

    public void setLvlRequiredState(int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.m0).append((CharSequence) hd.G(i7, "ReactionLevelRequiredBtn", new Object[0]));
        g(spannableStringBuilder, true);
    }
}
