package org.telegram.ui.Components;

import android.content.Context;
import android.os.Vibrator;
import android.text.Spanned;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s3 extends eq {
    public final /* synthetic */ Context b;
    public final /* synthetic */ NumberTextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(int i7, Context context, NumberTextView numberTextView) {
        super(i7);
        this.b = context;
        this.c = numberTextView;
    }

    @Override // org.telegram.ui.Components.eq, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i7, i10, spanned, i11, i12);
        if (filter != null && charSequence != null && filter.length() != charSequence.length()) {
            Vibrator vibrator = (Vibrator) this.b.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            org.telegram.messenger.g0.D3(this.c);
        }
        return filter;
    }
}
