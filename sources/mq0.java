// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mq0 extends FrameLayout {
    public final tpa a;
    public final ImageView b;
    public final TL_keyboard.KeyboardButton c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean h;
    public final /* synthetic */ oq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq0(oq0 oq0Var, Context context, TL_keyboard.KeyboardButton keyboardButton) {
        super(context);
        this.n = oq0Var;
        this.c = keyboardButton;
        tpa tpaVar = new tpa(context);
        this.a = tpaVar;
        tpaVar.r = false;
        tpaVar.setTextSize(1, 14.0f);
        tpaVar.setTypeface(hl.o());
        jn7.i(tpaVar);
        addView(tpaVar, tre.e(-2, -2, 17));
        jn7.i(tpaVar);
        setTag(keyboardButton);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
        if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
            spannableStringBuilder.append((CharSequence) "* ");
            spannableStringBuilder.setSpan(new hm(keyboardButton.style.icon, tpaVar.getPaint().getFontMetricsInt()), 0, 1, 33);
        }
        spannableStringBuilder.append(pv3.m(keyboardButton.text, tpaVar.getPaint().getFontMetricsInt(), false, null, 0));
        ImageView imageView = new ImageView(getContext());
        this.b = imageView;
        yob.s(imageView, aob.Pf, oq0Var.a, PorterDuff.Mode.SRC_ATOP);
        if (ehb.b(keyboardButton)) {
            imageView.setImageResource(R.drawable.bot_webview);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        addView(imageView, tre.d(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
        tpaVar.setText(spannableStringBuilder);
    }

    public final void a() {
        int i;
        int i2;
        int p1;
        int k;
        int L = hl.L(21.0f);
        int L2 = hl.L(11.0f);
        int i3 = aob.Qf;
        vnb vnbVar = this.n.a;
        int v0 = aob.v0(i3, vnbVar);
        int v02 = aob.v0(aob.Rf, vnbVar);
        int v03 = aob.v0(aob.Pf, vnbVar);
        TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.c.style;
        if (keyboardButtonStyle != null) {
            if (keyboardButtonStyle.bg_primary) {
                p1 = aob.p1(0.8f, aob.v0(aob.Ul, vnbVar));
                k = vm2.k(aob.v0(aob.i6, vnbVar), p1);
            } else if (keyboardButtonStyle.bg_danger) {
                p1 = aob.p1(0.8f, aob.v0(aob.Vl, vnbVar));
                k = vm2.k(aob.v0(aob.i6, vnbVar), p1);
            } else if (keyboardButtonStyle.bg_success) {
                p1 = aob.p1(0.8f, aob.v0(aob.Wl, vnbVar));
                k = vm2.k(aob.v0(aob.i6, vnbVar), p1);
            }
            i = p1;
            i2 = k;
            v03 = -1;
            this.b.setColorFilter(v03);
            this.a.setTextColor(v03);
            boolean z = this.d;
            int i4 = (z || !this.e) ? L2 : L;
            boolean z2 = this.f;
            setBackground(aob.i0(i4, (z2 || !this.e) ? L2 : L, (z2 || !this.h) ? L2 : L, (z || !this.h) ? L2 : L, i, i2, i2));
        }
        i = v0;
        i2 = v02;
        this.b.setColorFilter(v03);
        this.a.setTextColor(v03);
        boolean z3 = this.d;
        if (z3) {
        }
        boolean z22 = this.f;
        setBackground(aob.i0(i4, (z22 || !this.e) ? L2 : L, (z22 || !this.h) ? L2 : L, (z3 || !this.h) ? L2 : L, i, i2, i2));
    }
}
