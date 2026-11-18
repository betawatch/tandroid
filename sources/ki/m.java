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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q9;
import org.telegram.ui.af;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class m extends FrameLayout {
    public static final /* synthetic */ int n = 0;
    public final i6 a;
    public final q9 b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final k80 h;

    public m(Activity activity, i6 i6Var) {
        super(activity);
        this.a = i6Var;
        LinearLayout f10 = org.telegram.messenger.f3.f(activity, 0);
        f10.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(5.0f));
        ra.b(f10, 0.025f, 1.4f);
        addView(f10, ma.e(-1, -1, ks.E1));
        int i7 = n6.Fi;
        Drawable a02 = n6.a0(n6.r1(0.1f, n6.w0(i7, i6Var)), 0, 0);
        q6 K = u6.K(0.1f, i7);
        setBackground(a02);
        u6.j(this, a02, null, K, i6Var);
        LinearLayout f11 = org.telegram.messenger.f3.f(activity, 1);
        f10.addView(f11, ma.p(-1, -2, 1.0f, 3));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        f11.addView(linearLayout, ma.q(-1, -2, 0.0f, 51, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = n6.G6;
        u6.U(textView, i10, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        linearLayout.addView(textView, ma.p(-2, -2, 0.0f, 16));
        ks.i(textView);
        TextView textView2 = new TextView(activity);
        this.f = textView2;
        textView2.setTextSize(1, 11.0f);
        u6.U(textView2, i7, i6Var);
        ra.b(textView2, 0.1f, 1.5f);
        textView2.setPadding(org.telegram.messenger.g0.L(6.33f), 0, org.telegram.messenger.g0.L(6.33f), 0);
        ShapeDrawable d02 = n6.d0(org.telegram.messenger.g0.L(9.0f), n6.r1(0.1f, n6.w0(i7, i6Var)));
        q6 K2 = u6.K(0.1f, i7);
        textView2.setBackground(d02);
        u6.j(textView2, d02, K2, null, i6Var);
        textView2.setText(gd.M0(2131753153, null));
        linearLayout.addView(textView2, ma.q(-2, 17, 0.0f, 19, 5, 1, 0, 0));
        TextView textView3 = new TextView(activity);
        this.e = textView3;
        textView3.setVisibility(8);
        textView3.setTextSize(1, 14.0f);
        u6.U(textView3, i10, i6Var);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        f11.addView(textView3, ma.k(0.0f, 0.0f, 0.0f, 2.0f, -1, -2));
        ks.i(textView3);
        k80 k80Var = new k80(activity, null);
        this.h = k80Var;
        k80Var.setTextSize(1, 13.0f);
        u6.G(k80Var, n6.Xc, i6Var);
        u6.U(k80Var, i10, i6Var);
        f11.addView(k80Var, ma.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        ks.i(k80Var);
        q9 q9Var = new q9(activity);
        this.b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(4.0f));
        q9Var.setVisibility(8);
        f10.addView(q9Var, ma.t(48, 48, 53, 10, 0, 2, 2));
        ImageView imageView = new ImageView(activity);
        this.c = imageView;
        imageView.setBackground(n6.h0(5, n6.r1(0.2f, n6.w0(n6.W5, i6Var)), -1));
        ra.a(imageView);
        imageView.setImageResource(R.drawable.msg_close);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        u6.s(imageView, n6.Ue, i6Var, PorterDuff.Mode.SRC_IN);
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
    public final void a(final bn bnVar, final fj fjVar, af afVar, af afVar2) {
        boolean z10;
        boolean z11;
        float measureText;
        float measureText2;
        if (fjVar == null) {
            return;
        }
        String str = fjVar.S0;
        TextView textView = this.d;
        CharSequence m10 = j6.m(str, textView.getPaint().getFontMetricsInt(), false, null, 0);
        CharSequence charSequence = fjVar.v;
        k80 k80Var = this.h;
        CharSequence m11 = j6.m(charSequence, k80Var.getPaint().getFontMetricsInt(), false, null, 0);
        String str2 = fjVar.T0;
        TLRPC.MessageMedia messageMedia = fjVar.a1;
        ImageView imageView = this.c;
        q9 q9Var = this.b;
        if (messageMedia != null) {
            q9Var.setVisibility(0);
            imageView.setVisibility(8);
            TLRPC.MessageMedia messageMedia2 = fjVar.a1;
            TLRPC.Document document = messageMedia2.document;
            if (document != null) {
                TLRPC.PhotoSize w10 = w7.w(document.thumbs, 48, false, null, false);
                fc b10 = fc.b(fjVar.a1.document);
                fc c10 = fc.c(w10, fjVar.a1.document);
                z10 = true;
                q9Var.g(0, 0L, null, "48_48", "48_48", null, b10, c10);
            } else {
                TLRPC.Photo photo = messageMedia2.photo;
                if (photo != null) {
                    TLRPC.PhotoSize w11 = w7.w(photo.sizes, 48, true, null, true);
                    TLRPC.PhotoSize w12 = w7.w(fjVar.a1.photo.sizes, 48, true, w11, false);
                    z10 = true;
                    q9Var.g(0, 0L, null, "48_48", "48_48", null, fc.i(w11, fjVar.a1.photo), fc.i(w12, fjVar.a1.photo));
                } else {
                    z10 = true;
                }
            }
        } else {
            z10 = true;
            TLRPC.Photo photo2 = fjVar.V0;
            if (photo2 == null) {
                q9Var.setVisibility(8);
                imageView.setVisibility(0);
                z11 = false;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131745023, null));
                int i7 = n6.Fi;
                i6 i6Var = this.a;
                spannableStringBuilder.setSpan(new i00(i7, i6Var), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " \u2009");
                spannableStringBuilder.append(m10);
                measureText = textView.getPaint().measureText(spannableStringBuilder.toString());
                float L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(44.660004f);
                TextView textView2 = this.f;
                measureText2 = ((L - textView2.getPaint().measureText(textView2.getText().toString())) - org.telegram.messenger.g0.L(32.0f)) - org.telegram.messenger.g0.L(!z11 ? 58.0f : 0.0f);
                TextView textView3 = this.e;
                if (measureText <= measureText2) {
                    spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131745023, null));
                    spannableStringBuilder.setSpan(new i00(i7, i6Var), 0, spannableStringBuilder.length(), 33);
                    textView3.setVisibility(0);
                    textView3.setText(m10);
                } else {
                    textView3.setVisibility(8);
                }
                textView.setText(spannableStringBuilder);
                k80Var.setText(m11);
                k80Var.setOnLinkPressListener(new j80() { // from class: ki.l
                    @Override // org.telegram.ui.Components.j80
                    public final void a(ClickableSpan clickableSpan) {
                        m mVar = m.this;
                        mVar.getClass();
                        bn bnVar2 = bnVar;
                        if (bnVar2 != null) {
                            bnVar2.ma(fjVar, false, false);
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
                        clickableSpan.onClick(mVar.h);
                    }
                });
                textView2.setOnClickListener(new hi.o0(afVar, 10));
                setOnClickListener(new bi.n6(this, bnVar, fjVar, str2, 2));
                imageView.setOnClickListener(new hi.o0(afVar2, 11));
            }
            TLRPC.PhotoSize w13 = w7.w(photo2.sizes, 48, true, null, true);
            q9Var.g(0, 0L, null, "48_48", "48_48", null, fc.i(w13, fjVar.V0), fc.i(w7.w(fjVar.V0.sizes, 48, true, w13, false), fjVar.V0));
            q9Var.setVisibility(0);
            imageView.setVisibility(8);
        }
        z11 = z10;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(gd.M0(2131745023, null));
        int i72 = n6.Fi;
        i6 i6Var2 = this.a;
        spannableStringBuilder2.setSpan(new i00(i72, i6Var2), 0, spannableStringBuilder2.length(), 33);
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
        k80Var.setText(m11);
        k80Var.setOnLinkPressListener(new j80() { // from class: ki.l
            @Override // org.telegram.ui.Components.j80
            public final void a(ClickableSpan clickableSpan) {
                m mVar = m.this;
                mVar.getClass();
                bn bnVar2 = bnVar;
                if (bnVar2 != null) {
                    bnVar2.ma(fjVar, false, false);
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
                clickableSpan.onClick(mVar.h);
            }
        });
        textView22.setOnClickListener(new hi.o0(afVar, 10));
        setOnClickListener(new bi.n6(this, bnVar, fjVar, str2, 2));
        imageView.setOnClickListener(new hi.o0(afVar2, 11));
    }
}
