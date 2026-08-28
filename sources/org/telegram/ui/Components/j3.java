package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j3 extends wp {
    public final /* synthetic */ Context b;
    public final /* synthetic */ NumberTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(int i9, Context context, NumberTextView numberTextView) {
        super(i9);
        this.b = context;
        this.c = numberTextView;
    }

    @Override // org.telegram.ui.Components.wp, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i9, i10, spanned, i11, i12);
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
