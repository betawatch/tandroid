package ch;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.gd;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t0 extends hi.d {
    public SpannableStringBuilder m0;

    public void setLvlRequiredState(int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.m0).append((CharSequence) gd.G(i7, "ReactionLevelRequiredBtn", new Object[0]));
        g(spannableStringBuilder, true);
    }
}
