// default package

import android.text.util.Linkify;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ik implements Linkify.MatchFilter {
    @Override // android.text.util.Linkify.MatchFilter
    public final boolean acceptMatch(CharSequence charSequence, int i, int i2) {
        return i == 0 || charSequence.charAt(i - 1) != '@';
    }
}
