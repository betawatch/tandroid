package ag;

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
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.x41;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y2 extends FrameLayout {
    public final r8 a;
    public final ImageReceiver b;
    public final nh.p c;
    public final ep d;
    public final ImageView e;
    public final p6 f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public y2(Context context, p6 p6Var, boolean z10) {
        super(context);
        this.a = new r8((p6) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = p6Var;
        setWillNotDraw(false);
        int i10 = z10 ? 42 : 16;
        nh.p pVar = new nh.p(context);
        this.c = pVar;
        pVar.setLines(2);
        pVar.setEllipsize(TextUtils.TruncateAt.END);
        a7.V(pVar, t6.z6, p6Var);
        pVar.setTextSize(1, 14.0f);
        boolean z11 = cd.X;
        addView(pVar, b6.d(-1, -2.0f, 7, z11 ? i10 : 64.0f, 7.0f, z11 ? 64.0f : i10, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            a7.t(imageView, t6.Ii, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            addView(imageView, b6.e(50, 50, (cd.X ? 3 : 5) | zs.x1));
        } else {
            this.e = null;
        }
        ep epVar = new ep(21, getContext(), p6Var);
        this.d = epVar;
        epVar.b(-1, t6.d6, t6.k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        addView(epVar, b6.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(h3 h3Var, String str, boolean z10) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        ic icVar;
        TLRPC.Photo photo2;
        String str3 = str;
        this.h = h3Var != null ? h3Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) h3Var.b);
        spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
        int i10 = t6.G6;
        p6 p6Var = this.f;
        spannableStringBuilder.setSpan(new l00(i10, p6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new l00(t6.o6, p6Var), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        jj jjVar = h3Var.e;
        nh.p pVar = this.c;
        if (jjVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = h3Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = h3Var.e.v;
            }
            CharSequence m10 = k6.m(new SpannableStringBuilder(charSequence), pVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = h3Var.e.k;
            if (message != null) {
                jj.A5(m10, message.entities, pVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (h3Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(80.0f);
            int a2 = h3Var.a() - 1;
            int i11 = x2.d;
            SpannableString spannableString = new SpannableString("+");
            x2 x2Var = new x2(a2);
            int L2 = (int) (((qz0) x2Var.c).c + org.telegram.messenger.i0.L(10.0f));
            this.n[0] = L2;
            spannableString.setSpan(x2Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, pVar.getPaint(), (L * 1.5f) - r13[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        pVar.setText(spannableStringBuilder);
        int i12 = d20.s0;
        TLRPC.MessageMedia n12 = jj.n1(h3Var.e);
        ImageReceiver imageReceiver = this.b;
        if (n12 != null && (photo2 = n12.photo) != null) {
            TLRPC.PhotoSize w9 = b8.w(photo2.sizes, org.telegram.messenger.i0.L(36.0f), true, null, true);
            ic f7 = ic.f(w9, n12.photo);
            jj jjVar2 = h3Var.e;
            imageReceiver.p0(f7, "36_36", jjVar2.G1, w9 != null ? w9.size : 0L, null, jjVar2, 0);
            imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
        } else if (n12 != null && n12.document != null && (jj.L4(h3Var.e.k) || h3Var.e.t4())) {
            TLRPC.PhotoSize w10 = b8.w(n12.document.thumbs, org.telegram.messenger.i0.L(36.0f), true, null, true);
            if (w10 == null) {
                ic b10 = ic.b(n12.document);
                j10 = n12.document.size;
                icVar = b10;
                str2 = "g";
            } else {
                ic f10 = ic.f(w10, n12.document);
                j10 = w10.size;
                str2 = "36_36";
                icVar = f10;
            }
            long j11 = j10;
            jj jjVar3 = h3Var.e;
            imageReceiver.p0(icVar, str2, jjVar3.G1, j11, null, jjVar3, 0);
            imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
        } else if (n12 == null || (webPage = n12.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User f11 = d20.i(i12).f();
            r8 r8Var = this.a;
            r8Var.r(f11);
            imageReceiver.i0(d20.i(i12).f(), r8Var, null);
            imageReceiver.J0(org.telegram.messenger.i0.L(36.0f));
        } else {
            TLRPC.PhotoSize w11 = b8.w(photo.sizes, org.telegram.messenger.i0.L(36.0f), true, null, true);
            imageReceiver.p0(ic.f(w11, n12.webpage.photo), "36_36", h3Var.e.G1, w11 != null ? w11.size : 0L, null, n12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.i0.L(4.0f));
        }
        this.r = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = cd.X ? getMeasuredWidth() - org.telegram.messenger.i0.L(51.0f) : org.telegram.messenger.i0.L(15.0f);
        float L = org.telegram.messenger.i0.L(7.0f);
        float L2 = org.telegram.messenger.i0.L(36.0f);
        float L3 = org.telegram.messenger.i0.L(36.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.r) {
            Paint W0 = t6.W0("paintDivider", this.f);
            if (W0 == null) {
                W0 = t6.k0;
            }
            canvas.drawRect(org.telegram.messenger.i0.L(cd.X ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.i0.L(cd.X ? 64.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }

    public void setReorder(boolean z10) {
        this.e.animate().alpha((!z10 || this.h) ? 0.0f : 1.0f).start();
    }
}
