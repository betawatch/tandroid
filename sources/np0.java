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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class np0 extends FrameLayout {
    public final ylb a;
    public final bf0 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final l66 h;

    public np0(Activity activity, ylb ylbVar) {
        super(activity);
        this.a = ylbVar;
        LinearLayout l = td4.l(activity, 0);
        l.setPadding(gm.L(16.0f), gm.L(5.0f), gm.L(8.0f), gm.L(5.0f));
        rve.b(l, 0.025f, 1.4f);
        addView(l, qoe.e(-1, -1, nm7.D1));
        int i = cmb.Ei;
        Drawable Y = cmb.Y(cmb.p1(0.1f, cmb.v0(i, ylbVar)), 0, 0);
        wmb K = anb.K(0.1f, i);
        setBackground(Y);
        anb.j(this, Y, null, K, ylbVar);
        LinearLayout l2 = td4.l(activity, 1);
        l.addView(l2, qoe.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        l2.addView(linearLayout, qoe.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i2 = cmb.F6;
        anb.X(textView, i2, ylbVar);
        textView.setTypeface(gm.o());
        linearLayout.addView(textView, qoe.p(-2, -2, 0.0f, 16));
        nm7.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        anb.X(textView2, i, ylbVar);
        rve.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(gm.L(6.33f), 0, gm.L(6.33f), 0);
        ShapeDrawable b0 = cmb.b0(gm.L(9.0f), cmb.p1(0.1f, cmb.v0(i, ylbVar)));
        wmb K2 = anb.K(0.1f, i);
        textView2.setBackground(b0);
        anb.j(textView2, b0, K2, null, ylbVar);
        textView2.setText(jb6.M0(2131753120, null));
        linearLayout.addView(textView2, qoe.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        anb.X(textView3, i2, ylbVar);
        textView3.setTypeface(gm.o());
        l2.addView(textView3, qoe.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        nm7.i(textView3);
        l66 l66Var = new l66(activity, null);
        this.h = l66Var;
        l66Var.setTextSize(1, 13.0f);
        anb.G(l66Var, cmb.Wc, ylbVar);
        anb.X(l66Var, i2, ylbVar);
        l2.addView(l66Var, qoe.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        nm7.i(l66Var);
        bf0 bf0Var = new bf0(activity);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(4.0f));
        bf0Var.setVisibility(8);
        l.addView(bf0Var, qoe.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(cmb.f0(5, cmb.p1(0.2f, cmb.v0(cmb.V5, ylbVar)), -1));
        rve.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.Te, ylbVar, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new x10((byte) 1));
        imageView.setVisibility(8);
        l.addView(imageView, qoe.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final yv1 yv1Var, final k47 k47Var, en1 en1Var, en1 en1Var2) {
        boolean z;
        boolean z2;
        float measureText;
        float measureText2;
        if (k47Var == null) {
            return;
        }
        String str = k47Var.S0;
        TextView textView = this.d;
        CharSequence m = gw3.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0);
        CharSequence charSequence = k47Var.v;
        l66 l66Var = this.h;
        CharSequence m2 = gw3.m(charSequence, l66Var.getPaint().getFontMetricsInt(), false, null, 0);
        String str2 = k47Var.T0;
        TLRPC.MessageMedia messageMedia = k47Var.a1;
        ImageView imageView = this.c;
        bf0 bf0Var = this.b;
        if (messageMedia != null) {
            bf0Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = k47Var.a1;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize w = bc4.w(document.thumbs, 48, false, null, false);
                gn5 b = gn5.b(k47Var.a1.document);
                gn5 c = gn5.c(w, k47Var.a1.document);
                z = true;
                bf0Var.g(0, 0L, b, c, null, "48_48", "48_48", null);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w2 = bc4.w(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize w3 = bc4.w(k47Var.a1.photo.sizes, 48, true, w2, false);
                    z = true;
                    bf0Var.g(0, 0L, gn5.i(w2, k47Var.a1.photo), gn5.i(w3, k47Var.a1.photo), null, "48_48", "48_48", null);
                } else {
                    z = true;
                }
            }
        } else {
            z = true;
            TLRPC.Photo photo2 = k47Var.V0;
            if (photo2 == null) {
                bf0Var.setVisibility(8);
                imageView.setVisibility(0);
                z2 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131744947, null));
                int i = cmb.Ei;
                ylb ylbVar = this.a;
                spannableStringBuilder.setSpan(new do4(i, ylbVar), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = gm.q.x - gm.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - gm.L(32.0f)) - gm.L(!z2 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(jb6.M0(2131744947, null));
                    spannableStringBuilder.setSpan(new do4(i, ylbVar), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                l66Var.setText(m2);
                l66Var.setOnLinkPressListener(new k66() { // from class: mp0
                    @Override // k66
                    public final void a(ClickableSpan clickableSpan) {
                        k47 k47Var2 = k47Var;
                        yv1 yv1Var2 = yv1Var;
                        yv1Var2.Y9(k47Var2, false, false);
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                yv1Var2.sa(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(np0.this.h);
                    }
                });
                textView2.setOnClickListener(new j1(en1Var, (byte) 17));
                setOnClickListener(new ef((Object) this, (Object) yv1Var, (Object) k47Var, (Object) str2, (byte) 4));
                imageView.setOnClickListener(new j1(en1Var2, (byte) 18));
            }
            TLRPC.PhotoSize w4 = bc4.w(photo2.sizes, 48, true, null, true);
            bf0Var.g(0, 0L, gn5.i(w4, k47Var.V0), gn5.i(bc4.w(k47Var.V0.sizes, 48, true, w4, false), k47Var.V0), null, "48_48", "48_48", null);
            bf0Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z2 = z;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(jb6.M0(2131744947, null));
        int i2 = cmb.Ei;
        ylb ylbVar2 = this.a;
        spannableStringBuilder2.setSpan(new do4(i2, ylbVar2), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(m);
        measureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float L2 = gm.q.x - gm.L(44.660004f);
        TextView textView22 = this.f;
        measureText2 = ((L2 - textView22.getPaint().measureText(textView22.getText().toString())) - gm.L(32.0f)) - gm.L(!z2 ? 58.0f : 0.0f);
        TextView textView32 = this.e;
        if (measureText <= measureText2) {
        }
        textView.setText(spannableStringBuilder2);
        l66Var.setText(m2);
        l66Var.setOnLinkPressListener(new k66() { // from class: mp0
            @Override // k66
            public final void a(ClickableSpan clickableSpan) {
                k47 k47Var2 = k47Var;
                yv1 yv1Var2 = yv1Var;
                yv1Var2.Y9(k47Var2, false, false);
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        yv1Var2.sa(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(np0.this.h);
            }
        });
        textView22.setOnClickListener(new j1(en1Var, (byte) 17));
        setOnClickListener(new ef((Object) this, (Object) yv1Var, (Object) k47Var, (Object) str2, (byte) 4));
        imageView.setOnClickListener(new j1(en1Var2, (byte) 18));
    }
}
