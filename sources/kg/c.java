package kg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kp;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class c extends ig.d {
    public final kp r;
    public TLRPC.TL_help_country s;
    public final TextPaint v;
    public final e3.h w;

    public c(Context context, f6 f6Var) {
        super(context, f6Var);
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.w = new e3.h(this, 23);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        kp kpVar = new kp(context, 21, f6Var);
        this.r = kpVar;
        kpVar.b(j6.B5, j6.j7, j6.C5);
        kpVar.setDrawUnchecked(true);
        kpVar.setDrawBackgroundAsArc(10);
        addView(kpVar);
        kpVar.a(false, false);
        kpVar.setLayoutParams(b6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // ig.d
    public final int a() {
        return 22;
    }

    @Override // ig.d
    public final boolean b() {
        return true;
    }

    @Override // ig.d
    public final void c(boolean z4, boolean z10) {
        kp kpVar = this.r;
        if (kpVar.getVisibility() == 0) {
            kpVar.a(z4, z10);
        }
    }

    @Override // ig.d
    public final void d() {
        boolean z4 = LocaleController.isRTL;
        this.d.setLayoutParams(b6.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 20.0f : 52.0f, 0.0f, z4 ? 52.0f : 20.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        this.e.setLayoutParams(b6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.f.setLayoutParams(b6.d(22, 22.0f, (z11 ? 5 : 3) | 16, z11 ? 15.0f : 20.0f, 0.0f, z11 ? 20.0f : 15.0f, 0.0f));
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

    @Override // ig.d
    public int getFullHeight() {
        return 44;
    }
}
