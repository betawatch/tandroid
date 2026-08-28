package mh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.t5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class m0 extends FrameLayout {
    public final dh.u a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ o0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(o0 o0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = o0Var;
        this.c = keyboardButton;
        dh.u uVar = new dh.u(context);
        this.a = uVar;
        uVar.f = false;
        uVar.setTextSize(1, 14.0f);
        uVar.setTypeface(AndroidUtilities.bold());
        NotificationCenter.listenEmojiLoading(uVar);
        addView(uVar, e6.e(-2, -2, 17));
        NotificationCenter.listenEmojiLoading(uVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new t5(keyboardButton.style.icon, uVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, uVar.getPaint().getFontMetricsInt(), false));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        imageView.setColorFilter(f6.v0(f6.Xe, o0Var.a));
        if (gf.c.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, e6.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        uVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i9;
        int i10;
        int l1;
        int h;
        int dp = AndroidUtilities.dp(21.0f);
        int dp2 = AndroidUtilities.dp(11.0f);
        int i11 = f6.Ye;
        b6 b6Var = this.n.a;
        int v02 = f6.v0(i11, b6Var);
        int v03 = f6.v0(f6.Ze, b6Var);
        int v04 = f6.v0(f6.Xe, b6Var);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                l1 = f6.l1(0.8f, f6.v0(f6.dl, b6Var));
                h = i0.a.h(f6.v0(f6.i6, b6Var), l1);
            } else if (keyboardButtonStyle.bg_danger) {
                l1 = f6.l1(0.8f, f6.v0(f6.el, b6Var));
                h = i0.a.h(f6.v0(f6.i6, b6Var), l1);
            } else if (keyboardButtonStyle.bg_success) {
                l1 = f6.l1(0.8f, f6.v0(f6.fl, b6Var));
                h = i0.a.h(f6.v0(f6.i6, b6Var), l1);
            }
            i9 = l1;
            i10 = h;
            v04 = -1;
            this.b.setColorFilter(v04);
            this.a.setTextColor(v04);
            boolean z10 = this.d;
            int i12 = (z10 || !this.e) ? dp2 : dp;
            boolean z11 = this.f;
            setBackground(f6.i0(i12, (z11 || !this.e) ? dp2 : dp, (z11 || !this.h) ? dp2 : dp, (z10 || !this.h) ? dp2 : dp, i9, i10, i10));
        }
        i9 = v02;
        i10 = v03;
        this.b.setColorFilter(v04);
        this.a.setTextColor(v04);
        boolean z102 = this.d;
        if (z102) {
        }
        boolean z112 = this.f;
        setBackground(f6.i0(i12, (z112 || !this.e) ? dp2 : dp, (z112 || !this.h) ? dp2 : dp, (z102 || !this.h) ? dp2 : dp, i9, i10, i10));
    }
}
