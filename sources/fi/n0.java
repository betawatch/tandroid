package fi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.z5;
import w7.x5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class n0 extends FrameLayout {
    public final wh.p a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ p0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = p0Var;
        this.c = keyboardButton;
        wh.p pVar = new wh.p(context);
        this.a = pVar;
        pVar.f = false;
        pVar.setTextSize(1, 14.0f);
        pVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(pVar);
        addView(pVar, x5.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(pVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new z5(keyboardButton.style.icon, pVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, pVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        imageView.setColorFilter(j6.v0(j6.Xe, p0Var.a));
        if (zf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, x5.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        pVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i10;
        int i11;
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i12 = j6.Ye;
        f6 f6Var = this.n.a;
        int v02 = j6.v0(i12, f6Var);
        int v03 = j6.v0(j6.Ze, f6Var);
        int v04 = j6.v0(j6.Xe, f6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = j6.l1(0.8f, j6.v0(j6.dl, f6Var));
                h = i0.a.h(j6.v0(j6.i6, f6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = j6.l1(0.8f, j6.v0(j6.el, f6Var));
                h = i0.a.h(j6.v0(j6.i6, f6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = j6.l1(0.8f, j6.v0(j6.fl, f6Var));
                h = i0.a.h(j6.v0(j6.i6, f6Var), l1);
            }
            i10 = l1;
            i11 = h;
            v04 = -1;
            this.b.setColorFilter(v04);
            this.a.setTextColor(v04);
            boolean z10 = this.d;
            int i13 = (z10 || !this.e) ? dp2 : dp;
            boolean z11 = this.f;
            setBackground(j6.i0(i13, (z11 || !this.e) ? dp2 : dp, (z11 || !this.h) ? dp2 : dp, (z10 || !this.h) ? dp2 : dp, i10, i11, i11));
        }
        i10 = v02;
        i11 = v03;
        this.b.setColorFilter(v04);
        this.a.setTextColor(v04);
        boolean z102 = this.d;
        if (z102) {
        }
        boolean z112 = this.f;
        setBackground(j6.i0(i13, (z112 || !this.e) ? dp2 : dp, (z112 || !this.h) ? dp2 : dp, (z102 || !this.h) ? dp2 : dp, i10, i11, i11));
    }
}
