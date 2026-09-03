package jg;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k extends InputFilter.LengthFilter {
    public final /* synthetic */ m a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar) {
        super(128);
        this.a = mVar;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        CharSequence filter = super.filter(charSequence, i10, i11, spanned, i12, i13);
        if (filter != null && filter.length() == 0) {
            AndroidUtilities.shakeView(this.a.a);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        return filter;
    }
}
