// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class no0 extends FrameLayout {
    public final vnb a;
    public final de0 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final p66 h;

    public no0(Activity activity, vnb vnbVar) {
        super(activity);
        this.a = vnbVar;
        LinearLayout m = bs2.m(activity, 0);
        m.setPadding(hl.L(16.0f), hl.L(5.0f), hl.L(8.0f), hl.L(5.0f));
        iye.b(m, 0.025f, 1.4f);
        addView(m, tre.e(-1, -1, jn7.D1));
        int i = aob.Fi;
        Drawable Y = aob.Y(aob.p1(0.1f, aob.v0(i, vnbVar)), 0, 0);
        uob K = yob.K(0.1f, i);
        setBackground(Y);
        yob.j(this, Y, null, K, vnbVar);
        LinearLayout m2 = bs2.m(activity, 1);
        m.addView(m2, tre.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        m2.addView(linearLayout, tre.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i2 = aob.G6;
        yob.X(textView, i2, vnbVar);
        textView.setTypeface(hl.o());
        linearLayout.addView(textView, tre.p(-2, -2, 0.0f, 16));
        jn7.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        yob.X(textView2, i, vnbVar);
        iye.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(hl.L(6.33f), 0, hl.L(6.33f), 0);
        ShapeDrawable b0 = aob.b0(hl.L(9.0f), aob.p1(0.1f, aob.v0(i, vnbVar)));
        uob K2 = yob.K(0.1f, i);
        textView2.setBackground(b0);
        yob.j(textView2, b0, K2, null, vnbVar);
        textView2.setText(ob6.M0(2131753148, null));
        linearLayout.addView(textView2, tre.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        yob.X(textView3, i2, vnbVar);
        textView3.setTypeface(hl.o());
        m2.addView(textView3, tre.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        jn7.i(textView3);
        p66 p66Var = new p66(activity, null);
        this.h = p66Var;
        p66Var.setTextSize(1, 13.0f);
        yob.G(p66Var, aob.Xc, vnbVar);
        yob.X(p66Var, i2, vnbVar);
        m2.addView(p66Var, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        jn7.i(p66Var);
        de0 de0Var = new de0(activity);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(4.0f));
        de0Var.setVisibility(8);
        m.addView(de0Var, tre.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(aob.f0(5, aob.p1(0.2f, aob.v0(aob.W5, vnbVar)), -1));
        iye.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.Ue, vnbVar, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new y00((byte) 1));
        imageView.setVisibility(8);
        m.addView(imageView, tre.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final zu1 zu1Var, final r47 r47Var, ny nyVar, ny nyVar2) {
        boolean z;
        boolean z2;
        float measureText;
        float measureText2;
        if (r47Var == null) {
            return;
        }
        String str = r47Var.S0;
        TextView textView = this.d;
        CharSequence m = pv3.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0);
        CharSequence charSequence = r47Var.v;
        p66 p66Var = this.h;
        CharSequence m2 = pv3.m(charSequence, p66Var.getPaint().getFontMetricsInt(), false, null, 0);
        String str2 = r47Var.T0;
        TLRPC.MessageMedia messageMedia = r47Var.a1;
        ImageView imageView = this.c;
        de0 de0Var = this.b;
        if (messageMedia != null) {
            de0Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = r47Var.a1;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize w = xb4.w(document.thumbs, 48, false, null, false);
                jn5 b = jn5.b(r47Var.a1.document);
                jn5 c = jn5.c(w, r47Var.a1.document);
                z = true;
                de0Var.g(0, 0L, b, c, null, "48_48", "48_48", null);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w2 = xb4.w(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize w3 = xb4.w(r47Var.a1.photo.sizes, 48, true, w2, false);
                    z = true;
                    de0Var.g(0, 0L, jn5.i(w2, r47Var.a1.photo), jn5.i(w3, r47Var.a1.photo), null, "48_48", "48_48", null);
                } else {
                    z = true;
                }
            }
        } else {
            z = true;
            TLRPC.Photo photo2 = r47Var.V0;
            if (photo2 == null) {
                de0Var.setVisibility(8);
                imageView.setVisibility(0);
                z2 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131744915, null));
                int i = aob.Fi;
                vnb vnbVar = this.a;
                spannableStringBuilder.setSpan(new ho4(i, vnbVar), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = hl.q.x - hl.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - hl.L(32.0f)) - hl.L(!z2 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(ob6.M0(2131744915, null));
                    spannableStringBuilder.setSpan(new ho4(i, vnbVar), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                p66Var.setText(m2);
                p66Var.setOnLinkPressListener(new o66() { // from class: mo0
                    @Override // o66
                    public final void a(ClickableSpan clickableSpan) {
                        r47 r47Var2 = r47Var;
                        zu1 zu1Var2 = zu1Var;
                        zu1Var2.Z9(r47Var2, false, false);
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                zu1Var2.ta(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(no0.this.h);
                    }
                });
                textView2.setOnClickListener(new k1(nyVar, (byte) 16));
                setOnClickListener(new cg((Object) this, (Object) zu1Var, (Object) r47Var, (Object) str2, (byte) 4));
                imageView.setOnClickListener(new k1(nyVar2, (byte) 17));
            }
            TLRPC.PhotoSize w4 = xb4.w(photo2.sizes, 48, true, null, true);
            de0Var.g(0, 0L, jn5.i(w4, r47Var.V0), jn5.i(xb4.w(r47Var.V0.sizes, 48, true, w4, false), r47Var.V0), null, "48_48", "48_48", null);
            de0Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z2 = z;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(ob6.M0(2131744915, null));
        int i2 = aob.Fi;
        vnb vnbVar2 = this.a;
        spannableStringBuilder2.setSpan(new ho4(i2, vnbVar2), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(m);
        measureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float L2 = hl.q.x - hl.L(44.660004f);
        TextView textView22 = this.f;
        measureText2 = ((L2 - textView22.getPaint().measureText(textView22.getText().toString())) - hl.L(32.0f)) - hl.L(!z2 ? 58.0f : 0.0f);
        TextView textView32 = this.e;
        if (measureText <= measureText2) {
        }
        textView.setText(spannableStringBuilder2);
        p66Var.setText(m2);
        p66Var.setOnLinkPressListener(new o66() { // from class: mo0
            @Override // o66
            public final void a(ClickableSpan clickableSpan) {
                r47 r47Var2 = r47Var;
                zu1 zu1Var2 = zu1Var;
                zu1Var2.Z9(r47Var2, false, false);
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        zu1Var2.ta(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(no0.this.h);
            }
        });
        textView22.setOnClickListener(new k1(nyVar, (byte) 16));
        setOnClickListener(new cg((Object) this, (Object) zu1Var, (Object) r47Var, (Object) str2, (byte) 4));
        imageView.setOnClickListener(new k1(nyVar2, (byte) 17));
    }
}
