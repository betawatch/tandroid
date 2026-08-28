package dg;

import android.text.InputFilter;
import android.text.Spanned;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k extends InputFilter.LengthFilter {
    public final /* synthetic */ m a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar) {
        super(128);
        this.a = mVar;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        CharSequence filter = super.filter(charSequence, i9, i10, spanned, i11, i12);
        if (filter != null && filter.length() == 0) {
            AndroidUtilities.shakeView(this.a.a);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
        }
        return filter;
    }
}
