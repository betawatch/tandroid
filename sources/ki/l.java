package ki;

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
import c8.ma;
import c8.ra;
import hi.o4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.ls;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.k00;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.q9;
import org.telegram.ui.af;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class l extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final h6 a;
    public final q9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final m80 h;

    public l(Activity activity, h6 h6Var) {
        super(activity);
        this.a = h6Var;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 0);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        ra.b(f10, 0.025f, 1.4f);
        addView(f10, ma.e(-1, -1, ls.E1));
        int i7 = m6.Fi;
        Drawable a02 = m6.a0(m6.r1(0.1f, m6.w0(i7, h6Var)), 0, 0);
        p6 K = t6.K(0.1f, i7);
        setBackground(a02);
        t6.j(this, a02, null, K, h6Var);
        LinearLayout f11 = org.telegram.messenger.f3.f(activity, 1);
        f10.addView(f11, ma.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        f11.addView(linearLayout, ma.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = m6.G6;
        t6.U(textView, i10, h6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView, ma.p(-2, -2, 0.0f, 16));
        ls.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        t6.U(textView2, i7, h6Var);
        ra.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(org.telegram.messenger.g0.L(6.33f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        ShapeDrawable d02 = m6.d0(org.telegram.messenger.g0.L(9.0f), m6.r1(0.1f, m6.w0(i7, h6Var)));
        p6 K2 = t6.K(0.1f, i7);
        textView2.setBackground(d02);
        t6.j(textView2, d02, K2, null, h6Var);
        textView2.setText(hd.N0(2131753152, null));
        linearLayout.addView(textView2, ma.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        t6.U(textView3, i10, h6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        f11.addView(textView3, ma.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        ls.i(textView3);
        m80 m80Var = new m80(activity, null);
        this.h = m80Var;
        m80Var.setTextSize(1, 13.0f);
        t6.G(m80Var, m6.Xc, h6Var);
        t6.U(m80Var, i10, h6Var);
        f11.addView(m80Var, ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        ls.i(m80Var);
        q9 q9Var = new q9(activity);
        this.b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        q9Var.setVisibility(8);
        f10.addView(q9Var, ma.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(m6.h0(5, m6.r1(0.2f, m6.w0(m6.W5, h6Var)), -1));
        ra.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        t6.s(imageView, m6.Ue, h6Var, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new bi.o(9));
        imageView.setVisibility(8);
        f10.addView(imageView, ma.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final bn bnVar, final gj gjVar, af afVar, af afVar2) {
        boolean z10;
        boolean z11;
        float measureText;
        float measureText2;
        if (gjVar == null) {
            return;
        }
        String str = gjVar.S0;
        TextView textView = this.d;
        CharSequence m10 = j6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0);
        CharSequence charSequence = gjVar.v;
        m80 m80Var = this.h;
        CharSequence m11 = j6.m(charSequence, m80Var.getPaint().getFontMetricsInt(), false, null, 0);
        String str2 = gjVar.T0;
        TLRPC.MessageMedia messageMedia = gjVar.a1;
        ImageView imageView = this.c;
        q9 q9Var = this.b;
        if (messageMedia != null) {
            q9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = gjVar.a1;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 48, false, null, false);
                gc b10 = gc.b(gjVar.a1.document);
                gc c10 = gc.c(w10, gjVar.a1.document);
                z10 = true;
                q9Var.g(0, 0L, null, "48_48", "48_48", null, b10, c10);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = w7.w(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize w12 = w7.w(gjVar.a1.photo.sizes, 48, true, w11, false);
                    z10 = true;
                    q9Var.g(0, 0L, null, "48_48", "48_48", null, gc.i(w11, gjVar.a1.photo), gc.i(w12, gjVar.a1.photo));
                } else {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
            TLRPC.Photo photo2 = gjVar.V0;
            if (photo2 == null) {
                q9Var.setVisibility(8);
                imageView.setVisibility(0);
                z11 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131745015, null));
                int i7 = m6.Fi;
                h6 h6Var = this.a;
                spannableStringBuilder.setSpan(new k00(i7, h6Var), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m10);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - org.telegram.messenger.g0.L(32.0f)) - org.telegram.messenger.g0.L(!z11 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131745015, null));
                    spannableStringBuilder.setSpan(new k00(i7, h6Var), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m10);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                m80Var.setText(m11);
                m80Var.setOnLinkPressListener(new l80() { // from class: ki.k
                    @Override // org.telegram.ui.Components.l80
                    public final void a(ClickableSpan clickableSpan) {
                        l lVar = l.this;
                        lVar.getClass();
                        bn bnVar2 = bnVar;
                        if (bnVar2 != null) {
                            bnVar2.ma(gjVar, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (bnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                bnVar2.Ga(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(lVar.h);
                    }
                });
                textView2.setOnClickListener(new o4(afVar, 9));
                setOnClickListener(new bi.p6(this, bnVar, gjVar, str2, 2));
                imageView.setOnClickListener(new o4(afVar2, 10));
            }
            TLRPC.PhotoSize w13 = w7.w(photo2.sizes, 48, true, null, true);
            q9Var.g(0, 0L, null, "48_48", "48_48", null, gc.i(w13, gjVar.V0), gc.i(w7.w(gjVar.V0.sizes, 48, true, w13, false), gjVar.V0));
            q9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z11 = z10;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.N0(2131745015, null));
        int i72 = m6.Fi;
        h6 h6Var2 = this.a;
        spannableStringBuilder2.setSpan(new k00(i72, h6Var2), 0, spannableStringBuilder2.length(), 33);
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
        m80Var.setText(m11);
        m80Var.setOnLinkPressListener(new l80() { // from class: ki.k
            @Override // org.telegram.ui.Components.l80
            public final void a(ClickableSpan clickableSpan) {
                l lVar = l.this;
                lVar.getClass();
                bn bnVar2 = bnVar;
                if (bnVar2 != null) {
                    bnVar2.ma(gjVar, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (bnVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        bnVar2.Ga(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(lVar.h);
            }
        });
        textView22.setOnClickListener(new o4(afVar, 9));
        setOnClickListener(new bi.p6(this, bnVar, gjVar, str2, 2));
        imageView.setOnClickListener(new o4(afVar2, 10));
    }
}
