package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n4 extends wp {
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(Context context) {
        super(255);
        this.b = context;
    }

    @Override // org.telegram.ui.Components.wp, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        Vibrator vibrator;
        CharSequence filter = super.filter(charSequence, i9, i10, spanned, i11, i12);
        if (filter != null && charSequence != null && filter.length() != charSequence.length() && (vibrator = (Vibrator) this.b.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200L);
        }
        return filter;
    }
}
