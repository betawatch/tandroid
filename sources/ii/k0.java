package ii;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k0 extends FrameLayout {
    public final yh.l a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ m0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(m0 m0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = m0Var;
        this.c = keyboardButton;
        yh.l lVar = new yh.l(context);
        this.a = lVar;
        lVar.r = false;
        lVar.setTextSize(1, 14.0f);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        hs.i(lVar);
        addView(lVar, mf.e(-2, -2, 17));
        hs.i(lVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new p5(keyboardButton.style.icon, lVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(i6.m(keyboardButton.text, lVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        r6.t(imageView, k6.Mf, m0Var.a, PorterDuff.Mode.SRC_ATOP);
        if (dg.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, mf.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        lVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i3;
        int i10;
        int r12;
        int k10;
        int L = org.telegram.messenger.g0.L(21.0f);
        int L2 = org.telegram.messenger.g0.L(11.0f);
        int i11 = k6.Nf;
        e6 e6Var = this.n.a;
        int w02 = k6.w0(i11, e6Var);
        int w03 = k6.w0(k6.Of, e6Var);
        int w04 = k6.w0(k6.Mf, e6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                r12 = k6.r1(0.8f, k6.w0(k6.Rl, e6Var));
                k10 = i0.a.k(k6.w0(k6.i6, e6Var), r12);
            } else if (keyboardButtonStyle.bg_danger) {
                r12 = k6.r1(0.8f, k6.w0(k6.Sl, e6Var));
                k10 = i0.a.k(k6.w0(k6.i6, e6Var), r12);
            } else if (keyboardButtonStyle.bg_success) {
                r12 = k6.r1(0.8f, k6.w0(k6.Tl, e6Var));
                k10 = i0.a.k(k6.w0(k6.i6, e6Var), r12);
            }
            i3 = r12;
            i10 = k10;
            w04 = -1;
            this.b.setColorFilter(w04);
            this.a.setTextColor(w04);
            boolean z10 = this.d;
            int i12 = (z10 || !this.e) ? L2 : L;
            boolean z11 = this.f;
            setBackground(k6.k0(i12, (z11 || !this.e) ? L2 : L, (z11 || !this.h) ? L2 : L, (z10 || !this.h) ? L2 : L, i3, i10, i10));
        }
        i3 = w02;
        i10 = w03;
        this.b.setColorFilter(w04);
        this.a.setTextColor(w04);
        boolean z102 = this.d;
        if (z102) {
        }
        boolean z112 = this.f;
        setBackground(k6.k0(i12, (z112 || !this.e) ? L2 : L, (z112 || !this.h) ? L2 : L, (z102 || !this.h) ? L2 : L, i3, i10, i10));
    }
}
