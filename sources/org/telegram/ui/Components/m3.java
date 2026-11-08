package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class m3 extends pp {
    public final /* synthetic */ Context b;
    public final /* synthetic */ NumberTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(int i7, Context context, NumberTextView numberTextView) {
        super(i7);
        this.b = context;
        this.c = numberTextView;
    }

    @Override // org.telegram.ui.Components.pp, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i7, i10, spanned, i11, i12);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.F3(this.c);
        }
        return filter;
    }
}
