// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mr0 extends FrameLayout {
    public final xna a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ or0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(or0 or0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = or0Var;
        this.c = keyboardButton;
        xna xnaVar = new xna(context);
        this.a = xnaVar;
        xnaVar.r = false;
        xnaVar.setTextSize(1, 14.0f);
        xnaVar.setTypeface(gm.o());
        nm7.i(xnaVar);
        addView(xnaVar, qoe.e(-2, -2, 17));
        nm7.i(xnaVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new gn(keyboardButton.style.icon, xnaVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(gw3.m(keyboardButton.text, xnaVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        anb.s(imageView, cmb.Of, or0Var.a, PorterDuff.Mode.SRC_ATOP);
        if (kfb.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, qoe.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        xnaVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i;
        int i2;
        int p1;
        int l;
        int L = gm.L(21.0f);
        int L2 = gm.L(11.0f);
        int i3 = cmb.Pf;
        ylb ylbVar = this.n.a;
        int v0 = cmb.v0(i3, ylbVar);
        int v02 = cmb.v0(cmb.Qf, ylbVar);
        int v03 = cmb.v0(cmb.Of, ylbVar);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                p1 = cmb.p1(0.8f, cmb.v0(cmb.Tl, ylbVar));
                l = on2.l(cmb.v0(cmb.h6, ylbVar), p1);
            } else if (keyboardButtonStyle.bg_danger) {
                p1 = cmb.p1(0.8f, cmb.v0(cmb.Ul, ylbVar));
                l = on2.l(cmb.v0(cmb.h6, ylbVar), p1);
            } else if (keyboardButtonStyle.bg_success) {
                p1 = cmb.p1(0.8f, cmb.v0(cmb.Vl, ylbVar));
                l = on2.l(cmb.v0(cmb.h6, ylbVar), p1);
            }
            i = p1;
            i2 = l;
            v03 = -1;
            this.b.setColorFilter(v03);
            this.a.setTextColor(v03);
            boolean z = this.d;
            int i4 = (z || !this.e) ? L2 : L;
            boolean z2 = this.f;
            setBackground(cmb.i0(i4, (z2 || !this.e) ? L2 : L, (z2 || !this.h) ? L2 : L, (z || !this.h) ? L2 : L, i, i2, i2));
        }
        i = v0;
        i2 = v02;
        this.b.setColorFilter(v03);
        this.a.setTextColor(v03);
        boolean z3 = this.d;
        if (z3) {
        }
        boolean z22 = this.f;
        setBackground(cmb.i0(i4, (z22 || !this.e) ? L2 : L, (z22 || !this.h) ? L2 : L, (z3 || !this.h) ? L2 : L, i, i2, i2));
    }
}
