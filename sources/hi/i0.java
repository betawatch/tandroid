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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.r5;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
            spannableStringBuilder.setSpan(new r5(keyboardButton.style.icon, lVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(i6.m(keyboardButton.text, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        r6.t(imageView, k6.Mf, k0Var.a, PorterDuff.Mode.SRC_ATOP);
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
        int i11 = k6.Nf;
        f6 f6Var = this.n.a;
        int w02 = k6.w0(i11, f6Var);
        int w03 = k6.w0(k6.Of, f6Var);
        int w04 = k6.w0(k6.Mf, f6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = k6.r1(0.8f, k6.w0(k6.Rl, f6Var));
                k10 = i0.a.k(k6.w0(k6.i6, f6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = k6.r1(0.8f, k6.w0(k6.Sl, f6Var));
                k10 = i0.a.k(k6.w0(k6.i6, f6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = k6.r1(0.8f, k6.w0(k6.Tl, f6Var));
                k10 = i0.a.k(k6.w0(k6.i6, f6Var), r12);
            }
            i7 = r12;
            i10 = k10;
            w04 = -1;
            this.b.setColorFilter(w04);
            this.a.setTextColor(w04);
            boolean z9 = this.d;
            int i12 = (z9 || !this.e) ? L2 : L;
            boolean z10 = this.f;
            setBackground(k6.k0(i12, (z10 || !this.e) ? L2 : L, (z10 || !this.h) ? L2 : L, (z9 || !this.h) ? L2 : L, i7, i10, i10));
        }
        i7 = w02;
        i10 = w03;
        this.b.setColorFilter(w04);
        this.a.setTextColor(w04);
        boolean z92 = this.d;
        if (z92) {
        }
        boolean z102 = this.f;
        setBackground(k6.k0(i12, (z102 || !this.e) ? L2 : L, (z102 || !this.h) ? L2 : L, (z92 || !this.h) ? L2 : L, i7, i10, i10));
    }
}
