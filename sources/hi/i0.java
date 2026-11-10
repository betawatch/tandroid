package hi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.i6;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.q5;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class i0 extends FrameLayout {
    public final xh.l a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ k0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = k0Var;
        this.c = keyboardButton;
        xh.l lVar = new xh.l(context);
        this.a = lVar;
        lVar.r = false;
        lVar.setTextSize(1, 14.0f);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        qs.i(lVar);
        addView(lVar, ha.e(-2, -2, 17));
        qs.i(lVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new q5(keyboardButton.style.icon, lVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(i6.m(keyboardButton.text, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        t6.s(imageView, m6.Mf, k0Var.a, PorterDuff.Mode.SRC_ATOP);
        if (cg.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, ha.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        lVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i7;
        int i10;
        int r12;
        int k10;
        int L = org.telegram.messenger.g0.L(21.0f);
        int L2 = org.telegram.messenger.g0.L(11.0f);
        int i11 = m6.Nf;
        h6 h6Var = this.n.a;
        int w02 = m6.w0(i11, h6Var);
        int w03 = m6.w0(m6.Of, h6Var);
        int w04 = m6.w0(m6.Mf, h6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = m6.r1(0.8f, m6.w0(m6.Rl, h6Var));
                k10 = i0.a.k(m6.w0(m6.i6, h6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = m6.r1(0.8f, m6.w0(m6.Sl, h6Var));
                k10 = i0.a.k(m6.w0(m6.i6, h6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = m6.r1(0.8f, m6.w0(m6.Tl, h6Var));
                k10 = i0.a.k(m6.w0(m6.i6, h6Var), r12);
            }
            i7 = r12;
            i10 = k10;
            w04 = -1;
            this.b.setColorFilter(w04);
            this.a.setTextColor(w04);
            boolean z9 = this.d;
            int i12 = (z9 || !this.e) ? L2 : L;
            boolean z10 = this.f;
            setBackground(m6.k0(i12, (z10 || !this.e) ? L2 : L, (z10 || !this.h) ? L2 : L, (z9 || !this.h) ? L2 : L, i7, i10, i10));
        }
        i7 = w02;
        i10 = w03;
        this.b.setColorFilter(w04);
        this.a.setTextColor(w04);
        boolean z92 = this.d;
        if (z92) {
        }
        boolean z102 = this.f;
        setBackground(m6.k0(i12, (z102 || !this.e) ? L2 : L, (z102 || !this.h) ? L2 : L, (z92 || !this.h) ? L2 : L, i7, i10, i10));
    }
}
