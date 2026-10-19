package gi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class l0 extends FrameLayout {
    public final wh.n a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ n0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = n0Var;
        this.c = keyboardButton;
        wh.n nVar = new wh.n(context);
        this.a = nVar;
        nVar.r = false;
        nVar.setTextSize(1, 14.0f);
        nVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(nVar);
        addView(nVar, z5.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(nVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new a6(keyboardButton.style.icon, nVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, nVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        imageView.setColorFilter(h6.w0(h6.Xe, n0Var.a));
        if (ag.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, z5.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        nVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i10;
        int i11;
        int m12;
        int k10;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i12 = h6.Ye;
        d6 d6Var = this.n.a;
        int w02 = h6.w0(i12, d6Var);
        int w03 = h6.w0(h6.Ze, d6Var);
        int w04 = h6.w0(h6.Xe, d6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                m12 = h6.m1(0.8f, h6.w0(h6.dl, d6Var));
                k10 = i0.a.k(h6.w0(h6.i6, d6Var), m12);
            } else if (keyboardButtonStyle.bg_danger) {
                m12 = h6.m1(0.8f, h6.w0(h6.el, d6Var));
                k10 = i0.a.k(h6.w0(h6.i6, d6Var), m12);
            } else if (keyboardButtonStyle.bg_success) {
                m12 = h6.m1(0.8f, h6.w0(h6.fl, d6Var));
                k10 = i0.a.k(h6.w0(h6.i6, d6Var), m12);
            }
            i10 = m12;
            i11 = k10;
            w04 = -1;
            this.b.setColorFilter(w04);
            this.a.setTextColor(w04);
            boolean z10 = this.d;
            int i13 = (z10 || !this.e) ? dp2 : dp;
            boolean z11 = this.f;
            setBackground(h6.j0(i13, (z11 || !this.e) ? dp2 : dp, (z11 || !this.h) ? dp2 : dp, (z10 || !this.h) ? dp2 : dp, i10, i11, i11));
        }
        i10 = w02;
        i11 = w03;
        this.b.setColorFilter(w04);
        this.a.setTextColor(w04);
        boolean z102 = this.d;
        if (z102) {
        }
        boolean z112 = this.f;
        setBackground(h6.j0(i13, (z112 || !this.e) ? dp2 : dp, (z112 || !this.h) ? dp2 : dp, (z102 || !this.h) ? dp2 : dp, i10, i11, i11));
    }
}
