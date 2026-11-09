package hi;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import c8.ka;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.yz;
import org.telegram.ui.af;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class l extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final g6 a;
    public final l9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final x70 h;

    public l(Activity activity, g6 g6Var) {
        super(activity);
        this.a = g6Var;
        LinearLayout e10 = k5.e(activity, 0);
        e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        ka.b(e10, 0.025f, 1.4f);
        addView(e10, ha.e(-1, -1, qs.E1));
        int i7 = l6.Ci;
        Drawable a02 = l6.a0(l6.r1(0.1f, l6.w0(i7, g6Var)), 0, 0);
        o6 K = s6.K(0.1f, i7);
        setBackground(a02);
        s6.j(this, a02, null, K, g6Var);
        LinearLayout e11 = k5.e(activity, 1);
        e10.addView(e11, ha.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        e11.addView(linearLayout, ha.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = l6.G6;
        s6.U(textView, i10, g6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView, ha.p(-2, -2, 0.0f, 16));
        qs.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        s6.U(textView2, i7, g6Var);
        ka.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(org.telegram.messenger.g0.L(6.33f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        ShapeDrawable d02 = l6.d0(org.telegram.messenger.g0.L(9.0f), l6.r1(0.1f, l6.w0(i7, g6Var)));
        o6 K2 = s6.K(0.1f, i7);
        textView2.setBackground(d02);
        s6.j(textView2, d02, K2, null, g6Var);
        textView2.setText(id.M0(2131753155, null));
        linearLayout.addView(textView2, ha.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        s6.U(textView3, i10, g6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        e11.addView(textView3, ha.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        qs.i(textView3);
        x70 x70Var = new x70(activity, null);
        this.h = x70Var;
        x70Var.setTextSize(1, 13.0f);
        s6.G(x70Var, l6.Uc, g6Var);
        s6.U(x70Var, i10, g6Var);
        e11.addView(x70Var, ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        qs.i(x70Var);
        l9 l9Var = new l9(activity);
        this.b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        l9Var.setVisibility(8);
        e10.addView(l9Var, ha.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(l6.h0(5, l6.r1(0.2f, l6.w0(l6.W5, g6Var)), -1));
        ka.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        s6.s(imageView, l6.Re, g6Var, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new bi.l1(4));
        imageView.setVisibility(8);
        e10.addView(imageView, ha.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final cn cnVar, final ij ijVar, af afVar, af afVar2) {
        boolean z9;
        boolean z10;
        float measureText;
        float measureText2;
        if (ijVar == null) {
            return;
        }
        String str = ijVar.Q0;
        TextView textView = this.d;
        CharSequence m10 = i6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0);
        CharSequence charSequence = ijVar.v;
        x70 x70Var = this.h;
        CharSequence m11 = i6.m(charSequence, x70Var.getPaint().getFontMetricsInt(), false, null, 0);
        String str2 = ijVar.R0;
        TLRPC.MessageMedia messageMedia = ijVar.Y0;
        ImageView imageView = this.c;
        l9 l9Var = this.b;
        if (messageMedia != null) {
            l9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = ijVar.Y0;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 48, false, null, false);
                hc b10 = hc.b(ijVar.Y0.document);
                hc c10 = hc.c(w10, ijVar.Y0.document);
                z9 = true;
                l9Var.g(0, 0L, null, "48_48", "48_48", null, b10, c10);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = w7.w(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize w12 = w7.w(ijVar.Y0.photo.sizes, 48, true, w11, false);
                    z9 = true;
                    l9Var.g(0, 0L, null, "48_48", "48_48", null, hc.i(w11, ijVar.Y0.photo), hc.i(w12, ijVar.Y0.photo));
                } else {
                    z9 = true;
                }
            }
        } else {
            z9 = true;
            TLRPC.Photo photo2 = ijVar.T0;
            if (photo2 == null) {
                l9Var.setVisibility(8);
                imageView.setVisibility(0);
                z10 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131745258, null));
                int i7 = l6.Ci;
                g6 g6Var = this.a;
                spannableStringBuilder.setSpan(new yz(i7, g6Var), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m10);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - org.telegram.messenger.g0.L(32.0f)) - org.telegram.messenger.g0.L(!z10 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(id.M0(2131745258, null));
                    spannableStringBuilder.setSpan(new yz(i7, g6Var), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m10);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                x70Var.setText(m11);
                x70Var.setOnLinkPressListener(new w70() { // from class: hi.k
                    @Override // org.telegram.ui.Components.w70
                    public final void a(ClickableSpan clickableSpan) {
                        l lVar = l.this;
                        lVar.getClass();
                        cn cnVar2 = cnVar;
                        if (cnVar2 != null) {
                            cnVar2.la(ijVar, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (cnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                cnVar2.Fa(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(lVar.h);
                    }
                });
                textView2.setOnClickListener(new ah.d(afVar, 26));
                setOnClickListener(new di.v3(this, cnVar, ijVar, str2, 1));
                imageView.setOnClickListener(new ah.d(afVar2, 27));
            }
            TLRPC.PhotoSize w13 = w7.w(photo2.sizes, 48, true, null, true);
            l9Var.g(0, 0L, null, "48_48", "48_48", null, hc.i(w13, ijVar.T0), hc.i(w7.w(ijVar.T0.sizes, 48, true, w13, false), ijVar.T0));
            l9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z10 = z9;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(id.M0(2131745258, null));
        int i72 = l6.Ci;
        g6 g6Var2 = this.a;
        spannableStringBuilder2.setSpan(new yz(i72, g6Var2), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(m10);
        measureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float L2 = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(44.660004f);
        TextView textView22 = this.f;
        measureText2 = ((L2 - textView22.getPaint().measureText(textView22.getText().toString())) - org.telegram.messenger.g0.L(32.0f)) - org.telegram.messenger.g0.L(!z10 ? 58.0f : 0.0f);
        TextView textView32 = this.e;
        if (measureText <= measureText2) {
        }
        textView.setText(spannableStringBuilder2);
        x70Var.setText(m11);
        x70Var.setOnLinkPressListener(new w70() { // from class: hi.k
            @Override // org.telegram.ui.Components.w70
            public final void a(ClickableSpan clickableSpan) {
                l lVar = l.this;
                lVar.getClass();
                cn cnVar2 = cnVar;
                if (cnVar2 != null) {
                    cnVar2.la(ijVar, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (cnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        cnVar2.Fa(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(lVar.h);
            }
        });
        textView22.setOnClickListener(new ah.d(afVar, 26));
        setOnClickListener(new di.v3(this, cnVar, ijVar, str2, 1));
        imageView.setOnClickListener(new ah.d(afVar2, 27));
    }
}
