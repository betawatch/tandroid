package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r4 extends gq {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(Context context) {
        super(255);
        this.b = context;
    }

    @Override // org.telegram.ui.Components.gq, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        Vibrator vibrator;
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && charSequence != null && filter.length() != charSequence.length() && (vibrator = (Vibrator) this.b.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
        return filter;
    }
}
