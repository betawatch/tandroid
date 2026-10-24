package org.telegram.ui.Components;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk implements InputFilter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ qk(int i10, View view) {
        this.a = i10;
        this.b = view;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        switch (this.a) {
            case 0:
                return al.Q((al) this.b, charSequence, i10, i11, spanned, i12, i13);
            default:
                return (charSequence.length() <= 0 || !Character.isWhitespace(charSequence.charAt(0))) ? charSequence : (TextUtils.isEmpty(((wy0) this.b).getText()) || i12 == 0) ? "" : charSequence;
        }
    }
}
