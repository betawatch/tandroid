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
import c8.ja;
import c8.na;
import hi.p5;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.z70;
import org.telegram.ui.an;
import org.telegram.ui.ye;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class m extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final e6 a;
    public final i9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final z70 h;

    public m(Activity activity, e6 e6Var) {
        super(activity);
        this.a = e6Var;
        LinearLayout e10 = k5.e(activity, 0);
        e10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        na.b(e10, 0.025f, 1.4f);
        addView(e10, ja.e(-1, -1, ns.E1));
        int i7 = j6.Fi;
        Drawable a02 = j6.a0(j6.r1(0.1f, j6.w0(i7, e6Var)), 0, 0);
        m6 K = q6.K(0.1f, i7);
        setBackground(a02);
        q6.j(this, a02, null, K, e6Var);
        LinearLayout e11 = k5.e(activity, 1);
        e10.addView(e11, ja.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        e11.addView(linearLayout, ja.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = j6.G6;
        q6.U(textView, i10, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView, ja.p(-2, -2, 0.0f, 16));
        ns.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        q6.U(textView2, i7, e6Var);
        na.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(org.telegram.messenger.g0.L(6.33f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        ShapeDrawable d02 = j6.d0(org.telegram.messenger.g0.L(9.0f), j6.r1(0.1f, j6.w0(i7, e6Var)));
        m6 K2 = q6.K(0.1f, i7);
        textView2.setBackground(d02);
        q6.j(textView2, d02, K2, null, e6Var);
        textView2.setText(hd.M0(2131753155, null));
        linearLayout.addView(textView2, ja.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        q6.U(textView3, i10, e6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        e11.addView(textView3, ja.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        ns.i(textView3);
        z70 z70Var = new z70(activity, null);
        this.h = z70Var;
        z70Var.setTextSize(1, 13.0f);
        q6.G(z70Var, j6.Xc, e6Var);
        q6.U(z70Var, i10, e6Var);
        e11.addView(z70Var, ja.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        ns.i(z70Var);
        i9 i9Var = new i9(activity);
        this.b = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        i9Var.setVisibility(8);
        e10.addView(i9Var, ja.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(j6.h0(5, j6.r1(0.2f, j6.w0(j6.W5, e6Var)), -1));
        na.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        q6.s(imageView, j6.Ue, e6Var, PorterDuff.Mode.SRC_IN);
        imageView.setOnClickListener(new bi.o(7));
        imageView.setVisibility(8);
        e10.addView(imageView, ja.t(32, 32, 53, 10, 3, 0, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final an anVar, final gj gjVar, ye yeVar, ye yeVar2) {
        boolean z10;
        boolean z11;
        float measureText;
        float measureText2;
        int i7;
        if (gjVar == null) {
            return;
        }
        String str = gjVar.S0;
        TextView textView = this.d;
        CharSequence m10 = org.telegram.messenger.j6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0);
        CharSequence charSequence = gjVar.v;
        z70 z70Var = this.h;
        CharSequence m11 = org.telegram.messenger.j6.m(charSequence, z70Var.getPaint().getFontMetricsInt(), false, null, 0);
        String str2 = gjVar.T0;
        TLRPC.MessageMedia messageMedia = gjVar.a1;
        ImageView imageView = this.c;
        i9 i9Var = this.b;
        if (messageMedia != null) {
            i9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = gjVar.a1;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 48, false, null, false);
                gc b10 = gc.b(gjVar.a1.document);
                gc c10 = gc.c(w10, gjVar.a1.document);
                z10 = true;
                i9Var.g(0, 0L, null, "48_48", "48_48", null, b10, c10);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = w7.w(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize w12 = w7.w(gjVar.a1.photo.sizes, 48, true, w11, false);
                    z10 = true;
                    i9Var.g(0, 0L, null, "48_48", "48_48", null, gc.i(w11, gjVar.a1.photo), gc.i(w12, gjVar.a1.photo));
                } else {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
            TLRPC.Photo photo2 = gjVar.V0;
            if (photo2 == null) {
                i9Var.setVisibility(8);
                imageView.setVisibility(0);
                z11 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131745258, null));
                int i10 = j6.Fi;
                e6 e6Var = this.a;
                spannableStringBuilder.setSpan(new b00(i10, e6Var), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m10);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - org.telegram.messenger.g0.L(32.0f)) - org.telegram.messenger.g0.L(!z11 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131745258, null));
                    spannableStringBuilder.setSpan(new b00(i10, e6Var), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m10);
                    i7 = 8;
                } else {
                    i7 = 8;
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                z70Var.setText(m11);
                z70Var.setOnLinkPressListener(new y70() { // from class: ki.l
                    @Override // org.telegram.ui.Components.y70
                    public final void a(ClickableSpan clickableSpan) {
                        m mVar = m.this;
                        mVar.getClass();
                        an anVar2 = anVar;
                        if (anVar2 != null) {
                            anVar2.ma(gjVar, false, false);
                        }
                        if (clickableSpan instanceof URLSpan) {
                            String url = ((URLSpan) clickableSpan).getURL();
                            if (url != null) {
                                url = url.trim();
                            }
                            if (anVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                                anVar2.Ga(url, true);
                                return;
                            }
                        }
                        clickableSpan.onClick(mVar.h);
                    }
                });
                textView2.setOnClickListener(new p5(yeVar, i7));
                setOnClickListener(new bi.f4(this, anVar, gjVar, str2, 2));
                imageView.setOnClickListener(new p5(yeVar2, 9));
            }
            TLRPC.PhotoSize w13 = w7.w(photo2.sizes, 48, true, null, true);
            i9Var.g(0, 0L, null, "48_48", "48_48", null, gc.i(w13, gjVar.V0), gc.i(w7.w(gjVar.V0.sizes, 48, true, w13, false), gjVar.V0));
            i9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z11 = z10;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(hd.M0(2131745258, null));
        int i102 = j6.Fi;
        e6 e6Var2 = this.a;
        spannableStringBuilder2.setSpan(new b00(i102, e6Var2), 0, spannableStringBuilder2.length(), 33);
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
        z70Var.setText(m11);
        z70Var.setOnLinkPressListener(new y70() { // from class: ki.l
            @Override // org.telegram.ui.Components.y70
            public final void a(ClickableSpan clickableSpan) {
                m mVar = m.this;
                mVar.getClass();
                an anVar2 = anVar;
                if (anVar2 != null) {
                    anVar2.ma(gjVar, false, false);
                }
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    if (url != null) {
                        url = url.trim();
                    }
                    if (anVar2 != null && url != null && (url.startsWith("$") || url.startsWith("#"))) {
                        anVar2.Ga(url, true);
                        return;
                    }
                }
                clickableSpan.onClick(mVar.h);
            }
        });
        textView22.setOnClickListener(new p5(yeVar, i7));
        setOnClickListener(new bi.f4(this, anVar, gjVar, str2, 2));
        imageView.setOnClickListener(new p5(yeVar2, 9));
    }
}
