package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class p3 extends qq {
    public final /* synthetic */ Context b;
    public final /* synthetic */ NumberTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(int i10, Context context, NumberTextView numberTextView) {
        super(i10);
        this.b = context;
        this.c = numberTextView;
    }

    @Override // org.telegram.ui.Components.qq, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            AndroidUtilities.shakeView(this.c);
        }
        return filter;
    }
}
