// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kz8 extends FrameLayout {
    public final pc0 a;
    public final ImageReceiver b;
    public final xna c;
    public final jh2 d;
    public final ImageView e;
    public final ylb f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public kz8(ylb ylbVar, Context context, boolean z) {
        super(context);
        this.a = new pc0((ylb) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = ylbVar;
        setWillNotDraw(false);
        int i = z ? 42 : 16;
        xna xnaVar = new xna(context);
        this.c = xnaVar;
        xnaVar.setLines(2);
        xnaVar.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(xnaVar, cmb.y6, ylbVar);
        xnaVar.setTextSize(1, 14.0f);
        boolean z2 = jb6.a0;
        addView(xnaVar, qoe.d(-1, -2.0f, 7, z2 ? i : 64.0f, 7.0f, z2 ? 64.0f : i, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            anb.s(imageView, cmb.Ki, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            addView(imageView, qoe.e(50, 50, (jb6.a0 ? 3 : 5) | nm7.w1));
        } else {
            this.e = null;
        }
        jh2 jh2Var = new jh2(21, ylbVar, getContext());
        this.d = jh2Var;
        jh2Var.b(-1, cmb.c6, cmb.j7);
        jh2Var.setDrawUnchecked(false);
        jh2Var.setDrawBackgroundAsArc(3);
        addView(jh2Var, qoe.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(oz8 oz8Var, String str, boolean z) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j;
        String str2;
        gn5 gn5Var;
        String str3 = str;
        this.h = oz8Var != null ? oz8Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) oz8Var.b);
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        int i = cmb.F6;
        ylb ylbVar = this.f;
        spannableStringBuilder.setSpan(new do4(i, ylbVar), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new do4(cmb.n6, ylbVar), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        k47 k47Var = oz8Var.e;
        xna xnaVar = this.c;
        if (k47Var != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = oz8Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = oz8Var.e.v;
            }
            CharSequence m = gw3.m(new SpannableStringBuilder(charSequence), xnaVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = oz8Var.e.k;
            if (message != null) {
                k47.A5(m, message.entities, xnaVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m);
        }
        if (oz8Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = gm.q.x - gm.L(80.0f);
            int a = oz8Var.a() - 1;
            int i2 = s0.d;
            SpannableString spannableString = new SpannableString("+");
            s0 s0Var = new s0(a);
            int L2 = (int) (((uib) s0Var.c).c + gm.L(10.0f));
            this.n[0] = L2;
            spannableString.setSpan(s0Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, xnaVar.getPaint(), (L * 1.5f) - r13[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        xnaVar.setText(spannableStringBuilder);
        int i3 = z8c.t0;
        TLRPC.MessageMedia m1 = k47.m1(oz8Var.e);
        ImageReceiver imageReceiver = this.b;
        if (m1 != null) {
            TLRPC.Photo photo2 = m1.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w = bc4.w(photo2.sizes, gm.L(36.0f), true, null, true);
                gn5 f = gn5.f(w, m1.photo);
                k47 k47Var2 = oz8Var.e;
                imageReceiver.c0(f, "36_36", k47Var2.I1, w != null ? w.size : 0L, null, k47Var2, 0);
                imageReceiver.q0(gm.L(4.0f));
            } else if (m1.document != null && (k47.K4(oz8Var.e.k) || oz8Var.e.s4())) {
                TLRPC.PhotoSize w2 = bc4.w(m1.document.thumbs, gm.L(36.0f), true, null, true);
                TLRPC.Document document = m1.document;
                if (w2 == null) {
                    gn5 b = gn5.b(document);
                    j = m1.document.size;
                    gn5Var = b;
                    str2 = "g";
                } else {
                    gn5 f2 = gn5.f(w2, document);
                    j = w2.size;
                    str2 = "36_36";
                    gn5Var = f2;
                }
                long j2 = j;
                k47 k47Var3 = oz8Var.e;
                imageReceiver.c0(gn5Var, str2, k47Var3.I1, j2, null, k47Var3, 0);
                imageReceiver.q0(gm.L(4.0f));
            }
            this.r = z;
            invalidate();
        }
        if (m1 == null || (webPage = m1.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User f3 = z8c.h(i3).f();
            pc0 pc0Var = this.a;
            pc0Var.q(f3);
            imageReceiver.U(z8c.h(i3).f(), pc0Var, null);
            imageReceiver.q0(gm.L(36.0f));
        } else {
            TLRPC.PhotoSize w3 = bc4.w(photo.sizes, gm.L(36.0f), true, null, true);
            imageReceiver.c0(gn5.f(w3, m1.webpage.photo), "36_36", oz8Var.e.I1, w3 != null ? w3.size : 0L, null, m1.webpage, 0);
            imageReceiver.q0(gm.L(4.0f));
        }
        this.r = z;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = jb6.a0 ? getMeasuredWidth() - gm.L(51.0f) : gm.L(15.0f);
        float L = gm.L(7.0f);
        float L2 = gm.L(36.0f);
        float L3 = gm.L(36.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.r) {
            Paint U0 = cmb.U0("paintDivider", this.f);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            canvas.drawRect(gm.L(jb6.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - gm.L(jb6.a0 ? 64.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }

    public void setReorder(boolean z) {
        this.e.animate().alpha((!z || this.h) ? 0.0f : 1.0f).start();
    }
}
