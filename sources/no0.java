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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class no0 extends FrameLayout {
    public final wjb a;
    public final be0 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final l46 h;

    public no0(Activity activity, wjb wjbVar) {
        super(activity);
        this.a = wjbVar;
        LinearLayout m = ir2.m(activity, 0);
        m.setPadding(gl.L(16.0f), gl.L(5.0f), gl.L(8.0f), gl.L(5.0f));
        ote.b(m, 0.025f, 1.4f);
        addView(m, nme.e(-1, -1, kk7.D1));
        int i = bkb.Ei;
        Drawable Y = bkb.Y(bkb.p1(0.1f, bkb.v0(i, wjbVar)), 0, 0);
        vkb K = zkb.K(0.1f, i);
        setBackground(Y);
        zkb.j(this, Y, null, K, wjbVar);
        LinearLayout m2 = ir2.m(activity, 1);
        m.addView(m2, nme.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        m2.addView(linearLayout, nme.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i2 = bkb.F6;
        zkb.X(textView, i2, wjbVar);
        textView.setTypeface(gl.o());
        linearLayout.addView(textView, nme.p(-2, -2, 0.0f, 16));
        kk7.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        zkb.X(textView2, i, wjbVar);
        ote.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(gl.L(6.33f), 0, gl.L(6.33f), 0);
        ShapeDrawable b0 = bkb.b0(gl.L(9.0f), bkb.p1(0.1f, bkb.v0(i, wjbVar)));
        vkb K2 = zkb.K(0.1f, i);
        textView2.setBackground(b0);
        zkb.j(textView2, b0, K2, null, wjbVar);
        textView2.setText(k96.M0(2131753152, null));
        linearLayout.addView(textView2, nme.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        zkb.X(textView3, i2, wjbVar);
        textView3.setTypeface(gl.o());
        m2.addView(textView3, nme.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        kk7.i(textView3);
        l46 l46Var = new l46(activity, null);
        this.h = l46Var;
        l46Var.setTextSize(1, 13.0f);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        zkb.X(l46Var, i2, wjbVar);
        m2.addView(l46Var, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        kk7.i(l46Var);
        be0 be0Var = new be0(activity);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(4.0f));
        be0Var.setVisibility(8);
        m.addView(be0Var, nme.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(bkb.f0(5, bkb.p1(0.2f, bkb.v0(bkb.V5, wjbVar)), -1));
        ote.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.Te, wjbVar, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new x00((byte) 1));
        imageView.setVisibility(8);
        m.addView(imageView, nme.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final mu1 mu1Var, final k27 k27Var, wl1 wl1Var, wl1 wl1Var2) {
        boolean z;
        boolean z2;
        float measureText;
        float measureText2;
        if (k27Var == null) {
            return;
        }
        String str = k27Var.S0;
        TextView textView = this.d;
        CharSequence m = vu3.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0);
        CharSequence charSequence = k27Var.v;
        l46 l46Var = this.h;
        CharSequence m2 = vu3.m(charSequence, l46Var.getPaint().getFontMetricsInt(), false, null, 0);
        String str2 = k27Var.T0;
        TLRPC.MessageMedia messageMedia = k27Var.a1;
        ImageView imageView = this.c;
        be0 be0Var = this.b;
        if (messageMedia != null) {
            be0Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = k27Var.a1;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize w = ba4.w(document.thumbs, 48, false, null, false);
                gl5 b = gl5.b(k27Var.a1.document);
                gl5 c = gl5.c(w, k27Var.a1.document);
                z = true;
                be0Var.g(0, 0L, b, c, null, "48_48", "48_48", null);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w2 = ba4.w(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize w3 = ba4.w(k27Var.a1.photo.sizes, 48, true, w2, false);
                    z = true;
                    be0Var.g(0, 0L, gl5.i(w2, k27Var.a1.photo), gl5.i(w3, k27Var.a1.photo), null, "48_48", "48_48", null);
                } else {
                    z = true;
                }
            }
        } else {
            z = true;
            TLRPC.Photo photo2 = k27Var.V0;
            if (photo2 == null) {
                be0Var.setVisibility(8);
                imageView.setVisibility(0);
                z2 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131745021, null));
                int i = bkb.Ei;
                wjb wjbVar = this.a;
                spannableStringBuilder.setSpan(new cm4(i, wjbVar), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = gl.q.x - gl.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - gl.L(32.0f)) - gl.L(!z2 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(k96.M0(2131745021, null));
                    spannableStringBuilder.setSpan(new cm4(i, wjbVar), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                l46Var.setText(m2);
                l46Var.setOnLinkPressListener(new k46() { // from class: mo0
                    @Override // k46
                    public final void a(ClickableSpan clickableSpan) {
                        k27 k27Var2 = k27Var;
                        mu1 mu1Var2 = mu1Var;
                        mu1Var2.O9(k27Var2, false, false);
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                mu1Var2.ia(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(no0.this.h);
                    }
                });
                textView2.setOnClickListener(new j1(wl1Var, (byte) 16));
                setOnClickListener(new ee((Object) this, (Object) mu1Var, (Object) k27Var, (Object) str2, (byte) 4));
                imageView.setOnClickListener(new j1(wl1Var2, (byte) 17));
            }
            TLRPC.PhotoSize w4 = ba4.w(photo2.sizes, 48, true, null, true);
            be0Var.g(0, 0L, gl5.i(w4, k27Var.V0), gl5.i(ba4.w(k27Var.V0.sizes, 48, true, w4, false), k27Var.V0), null, "48_48", "48_48", null);
            be0Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z2 = z;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(k96.M0(2131745021, null));
        int i2 = bkb.Ei;
        wjb wjbVar2 = this.a;
        spannableStringBuilder2.setSpan(new cm4(i2, wjbVar2), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(m);
        measureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float L2 = gl.q.x - gl.L(44.660004f);
        TextView textView22 = this.f;
        measureText2 = ((L2 - textView22.getPaint().measureText(textView22.getText().toString())) - gl.L(32.0f)) - gl.L(!z2 ? 58.0f : 0.0f);
        TextView textView32 = this.e;
        if (measureText <= measureText2) {
        }
        textView.setText(spannableStringBuilder2);
        l46Var.setText(m2);
        l46Var.setOnLinkPressListener(new k46() { // from class: mo0
            @Override // k46
            public final void a(ClickableSpan clickableSpan) {
                k27 k27Var2 = k27Var;
                mu1 mu1Var2 = mu1Var;
                mu1Var2.O9(k27Var2, false, false);
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        mu1Var2.ia(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(no0.this.h);
            }
        });
        textView22.setOnClickListener(new j1(wl1Var, (byte) 16));
        setOnClickListener(new ee((Object) this, (Object) mu1Var, (Object) k27Var, (Object) str2, (byte) 4));
        imageView.setOnClickListener(new j1(wl1Var2, (byte) 17));
    }
}
