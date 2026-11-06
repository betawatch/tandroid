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
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.xz;
import org.telegram.ui.af;
import org.telegram.ui.an;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class l extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final f6 a;
    public final l9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final w70 h;

    public l(Activity activity, f6 f6Var) {
        super(activity);
        this.a = f6Var;
        LinearLayout e10 = k5.e(activity, 0);
        e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        ka.b(e10, 0.025f, 1.4f);
        addView(e10, ha.e(-1, -1, qs.E1));
        int i7 = k6.Ci;
        Drawable a02 = k6.a0(k6.r1(0.1f, k6.w0(i7, f6Var)), 0, 0);
        n6 L = r6.L(0.1f, i7);
        setBackground(a02);
        r6.k(this, a02, null, L, f6Var);
        LinearLayout e11 = k5.e(activity, 1);
        e10.addView(e11, ha.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        e11.addView(linearLayout, ha.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = k6.G6;
        r6.V(textView, i10, f6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView, ha.p(-2, -2, 0.0f, 16));
        qs.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        r6.V(textView2, i7, f6Var);
        ka.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(org.telegram.messenger.g0.L(6.33f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(9.0f), k6.r1(0.1f, k6.w0(i7, f6Var)));
        n6 L2 = r6.L(0.1f, i7);
        textView2.setBackground(d02);
        r6.k(textView2, d02, L2, null, f6Var);
        textView2.setText(hd.M0(2131753155, null));
        linearLayout.addView(textView2, ha.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        r6.V(textView3, i10, f6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        e11.addView(textView3, ha.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        qs.i(textView3);
        w70 w70Var = new w70(activity, null);
        this.h = w70Var;
        w70Var.setTextSize(1, 13.0f);
        r6.H(w70Var, k6.Uc, f6Var);
        r6.V(w70Var, i10, f6Var);
        e11.addView(w70Var, ha.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        qs.i(w70Var);
        l9 l9Var = new l9(activity);
        this.b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        l9Var.setVisibility(8);
        e10.addView(l9Var, ha.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(k6.h0(5, k6.r1(0.2f, k6.w0(k6.W5, f6Var)), -1));
        ka.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        r6.t(imageView, k6.Re, f6Var, PorterDuff.Mode.SRC_IN);
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
    public final void a(final an anVar, final ij ijVar, af afVar, af afVar2) {
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
        w70 w70Var = this.h;
        CharSequence m11 = i6.m(charSequence, w70Var.getPaint().getFontMetricsInt(), false, null, 0);
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
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131745259, null));
                int i7 = k6.Ci;
                f6 f6Var = this.a;
                spannableStringBuilder.setSpan(new xz(i7, f6Var), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m10);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - org.telegram.messenger.g0.L(32.0f)) - org.telegram.messenger.g0.L(!z10 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131745259, null));
                    spannableStringBuilder.setSpan(new xz(i7, f6Var), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m10);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                w70Var.setText(m11);
                w70Var.setOnLinkPressListener(new v70() { // from class: hi.k
                    @Override // org.telegram.ui.Components.v70
                    public final void a(ClickableSpan clickableSpan) {
                        l lVar = l.this;
                        lVar.getClass();
                        an anVar2 = anVar;
                        if (anVar2 != null) {
                            anVar2.ja(ijVar, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (anVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                anVar2.Da(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(lVar.h);
                    }
                });
                textView2.setOnClickListener(new ah.d(afVar, 26));
                setOnClickListener(new di.u3(this, anVar, ijVar, str2, 1));
                imageView.setOnClickListener(new ah.d(afVar2, 27));
            }
            TLRPC.PhotoSize w13 = w7.w(photo2.sizes, 48, true, null, true);
            l9Var.g(0, 0L, null, "48_48", "48_48", null, hc.i(w13, ijVar.T0), hc.i(w7.w(ijVar.T0.sizes, 48, true, w13, false), ijVar.T0));
            l9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z10 = z9;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131745259, null));
        int i72 = k6.Ci;
        f6 f6Var2 = this.a;
        spannableStringBuilder2.setSpan(new xz(i72, f6Var2), 0, spannableStringBuilder2.length(), 33);
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
        w70Var.setText(m11);
        w70Var.setOnLinkPressListener(new v70() { // from class: hi.k
            @Override // org.telegram.ui.Components.v70
            public final void a(ClickableSpan clickableSpan) {
                l lVar = l.this;
                lVar.getClass();
                an anVar2 = anVar;
                if (anVar2 != null) {
                    anVar2.ja(ijVar, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (anVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        anVar2.Da(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(lVar.h);
            }
        });
        textView22.setOnClickListener(new ah.d(afVar, 26));
        setOnClickListener(new di.u3(this, anVar, ijVar, str2, 1));
        imageView.setOnClickListener(new ah.d(afVar2, 27));
    }
}
