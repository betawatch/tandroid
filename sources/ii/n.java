package ii;

import ai.r4;
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
import b8.mf;
import b8.pf;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.k5;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tz;
import org.telegram.ui.wm;
import org.telegram.ui.xe;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final e6 a;
    public final k9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final s70 h;

    public n(Activity activity, e6 e6Var) {
        super(activity);
        this.a = e6Var;
        LinearLayout e10 = k5.e(activity, 0);
        e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        pf.b(e10, 0.025f, 1.4f);
        addView(e10, mf.e(-1, -1, hs.E1));
        int i3 = k6.Ci;
        Drawable a02 = k6.a0(k6.r1(0.1f, k6.w0(i3, e6Var)), 0, 0);
        n6 L = r6.L(0.1f, i3);
        setBackground(a02);
        r6.k(this, a02, null, L, e6Var);
        LinearLayout e11 = k5.e(activity, 1);
        e10.addView(e11, mf.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        e11.addView(linearLayout, mf.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = k6.G6;
        r6.V(textView, i10, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView, mf.p(-2, -2, 0.0f, 16));
        hs.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        r6.V(textView2, i3, e6Var);
        pf.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(org.telegram.messenger.g0.L(6.33f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        ShapeDrawable d02 = k6.d0(org.telegram.messenger.g0.L(9.0f), k6.r1(0.1f, k6.w0(i3, e6Var)));
        n6 L2 = r6.L(0.1f, i3);
        textView2.setBackground(d02);
        r6.k(textView2, d02, L2, null, e6Var);
        textView2.setText(bd.M0(2131753155, null));
        linearLayout.addView(textView2, mf.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        r6.V(textView3, i10, e6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        e11.addView(textView3, mf.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        hs.i(textView3);
        s70 s70Var = new s70(activity, null);
        this.h = s70Var;
        s70Var.setTextSize(1, 13.0f);
        r6.H(s70Var, k6.Uc, e6Var);
        r6.V(s70Var, i10, e6Var);
        e11.addView(s70Var, mf.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        hs.i(s70Var);
        k9 k9Var = new k9(activity);
        this.b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        k9Var.setVisibility(8);
        e10.addView(k9Var, mf.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(k6.h0(5, k6.r1(0.2f, k6.w0(k6.W5, e6Var)), -1));
        pf.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        r6.t(imageView, k6.Re, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new ai.t(8));
        imageView.setVisibility(8);
        e10.addView(imageView, mf.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final wm wmVar, final zi ziVar, xe xeVar, xe xeVar2) {
        boolean z10;
        boolean z11;
        float measureText;
        float measureText2;
        if (ziVar == null) {
            return;
        }
        String str = ziVar.Q0;
        TextView textView = this.d;
        CharSequence m10 = i6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0);
        CharSequence charSequence = ziVar.v;
        s70 s70Var = this.h;
        CharSequence m11 = i6.m(charSequence, s70Var.getPaint().getFontMetricsInt(), false, null, 0);
        String str2 = ziVar.R0;
        TLRPC.MessageMedia messageMedia = ziVar.Y0;
        ImageView imageView = this.c;
        k9 k9Var = this.b;
        if (messageMedia != null) {
            k9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = ziVar.Y0;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 48, false, null, false);
                ac b10 = ac.b(ziVar.Y0.document);
                ac c2 = ac.c(w10, ziVar.Y0.document);
                z10 = true;
                k9Var.g(0, 0L, null, "48_48", "48_48", null, b10, c2);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = w7.w(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize w12 = w7.w(ziVar.Y0.photo.sizes, 48, true, w11, false);
                    z10 = true;
                    k9Var.g(0, 0L, null, "48_48", "48_48", null, ac.i(w11, ziVar.Y0.photo), ac.i(w12, ziVar.Y0.photo));
                } else {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
            TLRPC.Photo photo2 = ziVar.T0;
            if (photo2 == null) {
                k9Var.setVisibility(8);
                imageView.setVisibility(0);
                z11 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131745268, null));
                int i3 = k6.Ci;
                e6 e6Var = this.a;
                spannableStringBuilder.setSpan(new tz(i3, e6Var), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m10);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - org.telegram.messenger.g0.L(32.0f)) - org.telegram.messenger.g0.L(!z11 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131745268, null));
                    spannableStringBuilder.setSpan(new tz(i3, e6Var), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m10);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                s70Var.setText(m11);
                s70Var.setOnLinkPressListener(new r70() { // from class: ii.l
                    @Override // org.telegram.ui.Components.r70
                    public final void a(ClickableSpan clickableSpan) {
                        n nVar = n.this;
                        nVar.getClass();
                        wm wmVar2 = wmVar;
                        if (wmVar2 != null) {
                            wmVar2.ja(ziVar, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (wmVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                wmVar2.Da(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(nVar.h);
                    }
                });
                textView2.setOnClickListener(new ai.b(xeVar, 29));
                setOnClickListener(new r4(this, wmVar, ziVar, str2, 2));
                imageView.setOnClickListener(new m(xeVar2, 0));
            }
            TLRPC.PhotoSize w13 = w7.w(photo2.sizes, 48, true, null, true);
            k9Var.g(0, 0L, null, "48_48", "48_48", null, ac.i(w13, ziVar.T0), ac.i(w7.w(ziVar.T0.sizes, 48, true, w13, false), ziVar.T0));
            k9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z11 = z10;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(bd.M0(2131745268, null));
        int i32 = k6.Ci;
        e6 e6Var2 = this.a;
        spannableStringBuilder2.setSpan(new tz(i32, e6Var2), 0, spannableStringBuilder2.length(), 33);
        spannableStringBuilder2.append((CharSequence) " \u2009");
        spannableStringBuilder2.append(m10);
        measureText = textView.getPaint().measureText(spannableStringBuilder2.toString());
        float L2 = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(44.660004f);
        TextView textView22 = this.f;
        measureText2 = ((L2 - textView22.getPaint().measureText(textView22.getText().toString())) - org.telegram.messenger.g0.L(32.0f)) - org.telegram.messenger.g0.L(!z11 ? 58.0f : 0.0f);
        TextView textView32 = this.e;
        if (measureText <= measureText2) {
        }
        textView.setText(spannableStringBuilder2);
        s70Var.setText(m11);
        s70Var.setOnLinkPressListener(new r70() { // from class: ii.l
            @Override // org.telegram.ui.Components.r70
            public final void a(ClickableSpan clickableSpan) {
                n nVar = n.this;
                nVar.getClass();
                wm wmVar2 = wmVar;
                if (wmVar2 != null) {
                    wmVar2.ja(ziVar, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (wmVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        wmVar2.Da(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(nVar.h);
            }
        });
        textView22.setOnClickListener(new ai.b(xeVar, 29));
        setOnClickListener(new r4(this, wmVar, ziVar, str2, 2));
        imageView.setOnClickListener(new m(xeVar2, 0));
    }
}
