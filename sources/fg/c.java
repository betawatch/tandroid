package fg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.dp;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends dg.d {
    public final dp r;
    public TLRPC.TL_help_country s;
    public final TextPaint v;
    public final af.e w;

    public c(Context context, b6 b6Var) {
        super(context, b6Var);
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.w = new af.e(this, 27);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        dp dpVar = new dp(context, 21, b6Var);
        this.r = dpVar;
        dpVar.b(f6.B5, f6.j7, f6.C5);
        dpVar.setDrawUnchecked(true);
        dpVar.setDrawBackgroundAsArc(10);
        addView(dpVar);
        dpVar.a(false, false);
        dpVar.setLayoutParams(e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // dg.d
    public final int a() {
        return 22;
    }

    @Override // dg.d
    public final boolean b() {
        return true;
    }

    @Override // dg.d
    public final void c(boolean z10, boolean z11) {
        dp dpVar = this.r;
        if (dpVar.getVisibility() == 0) {
            dpVar.a(z10, z11);
        }
    }

    @Override // dg.d
    public final void d() {
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(e6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(e6.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(e6.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.s;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.v.getFontMetricsInt(), 0, this.w);
        if (replaceWithRestrictedEmoji != null) {
            spannableStringBuilder.append(replaceWithRestrictedEmoji).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(16), replaceWithRestrictedEmoji.length(), replaceWithRestrictedEmoji.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new b(34), 0, 1, 0);
        }
        String countryName = LocaleController.getCountryName(tL_help_country.iso2);
        if (TextUtils.isEmpty(countryName)) {
            countryName = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) countryName);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.s;
    }

    @Override // dg.d
    public int getFullHeight() {
        return 44;
    }
}
