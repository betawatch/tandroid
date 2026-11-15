package ch;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.hd;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class t0 extends hi.d {
    public SpannableStringBuilder l0;

    public void setLvlRequiredState(int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.l0).append((CharSequence) hd.G(i7, "ReactionLevelRequiredBtn", new Object[0]));
        g(spannableStringBuilder, true);
    }
}
