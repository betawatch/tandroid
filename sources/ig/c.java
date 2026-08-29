package ig;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import cg.m2;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hp;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c extends gg.d {
    public final hp r;
    public TLRPC.TL_help_country s;
    public final TextPaint v;
    public final m2 w;

    public c(Context context, c6 c6Var) {
        super(context, c6Var);
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.w = new m2(this, 17);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        hp hpVar = new hp(context, 21, c6Var);
        this.r = hpVar;
        hpVar.b(g6.B5, g6.j7, g6.C5);
        hpVar.setDrawUnchecked(true);
        hpVar.setDrawBackgroundAsArc(10);
        addView(hpVar);
        hpVar.a(false, false);
        hpVar.setLayoutParams(f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // gg.d
    public final int a() {
        return 22;
    }

    @Override // gg.d
    public final boolean b() {
        return true;
    }

    @Override // gg.d
    public final void c(boolean z10, boolean z11) {
        hp hpVar = this.r;
        if (hpVar.getVisibility() == 0) {
            hpVar.a(z10, z11);
        }
    }

    @Override // gg.d
    public final void d() {
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(f6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(f6.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(f6.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
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

    @Override // gg.d
    public int getFullHeight() {
        return 44;
    }
}
