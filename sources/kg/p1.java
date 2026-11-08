package kg;

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
import c8.ha;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hc;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.yz;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p1 extends FrameLayout {
    public final w8 a;
    public final ImageReceiver b;
    public final xh.l c;
    public final wo d;
    public final ImageView e;
    public final f6 f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public p1(Context context, f6 f6Var, boolean z9) {
        super(context);
        this.a = new w8((f6) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = f6Var;
        setWillNotDraw(false);
        int i7 = z9 ? 42 : 16;
        xh.l lVar = new xh.l(context);
        this.c = lVar;
        lVar.setLines(2);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        r6.V(lVar, k6.z6, f6Var);
        lVar.setTextSize(1, 14.0f);
        boolean z10 = id.a0;
        addView(lVar, ha.d(-1, -2.0f, 7, z10 ? i7 : 64.0f, 7.0f, z10 ? 64.0f : i7, 0.0f));
        if (z9) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            r6.t(imageView, k6.Ii, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            addView(imageView, ha.e(50, 50, (id.a0 ? 3 : 5) | qs.x1));
        } else {
            this.e = null;
        }
        wo woVar = new wo(21, getContext(), f6Var);
        this.d = woVar;
        woVar.b(-1, k6.d6, k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, ha.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(s1 s1Var, String str, boolean z9) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j3;
        String str2;
        hc hcVar;
        TLRPC.Photo photo2;
        String str3 = str;
        this.h = s1Var != null ? s1Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) s1Var.b);
        spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        int i7 = k6.G6;
        f6 f6Var = this.f;
        spannableStringBuilder.setSpan(new yz(i7, f6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new yz(k6.o6, f6Var), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        ij ijVar = s1Var.e;
        xh.l lVar = this.c;
        if (ijVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = s1Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = s1Var.e.v;
            }
            CharSequence m10 = i6.m(new SpannableStringBuilder(charSequence), lVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = s1Var.e.k;
            if (message != null) {
                ij.C5(m10, message.entities, lVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (s1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(80.0f);
            int a10 = s1Var.a() - 1;
            int i10 = o1.d;
            SpannableString spannableString = new SpannableString("+");
            o1 o1Var = new o1(a10);
            int L2 = (int) (((my0) o1Var.c).c + org.telegram.messenger.g0.L(10.0f));
            this.n[0] = L2;
            spannableString.setSpan(o1Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, lVar.getPaint(), (L * 1.5f) - r13[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        lVar.setText(spannableStringBuilder);
        int i11 = p10.s0;
        TLRPC.MessageMedia n1 = ij.n1(s1Var.e);
        ImageReceiver imageReceiver = this.b;
        if (n1 != null && (photo2 = n1.photo) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo2.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            hc f10 = hc.f(w10, n1.photo);
            ij ijVar2 = s1Var.e;
            imageReceiver.p0(f10, "36_36", ijVar2.G1, w10 != null ? w10.size : 0L, null, ijVar2, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (n1 != null && n1.document != null && (ij.M4(s1Var.e.k) || s1Var.e.u4())) {
            TLRPC.PhotoSize w11 = w7.w(n1.document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
            if (w11 == null) {
                hc b10 = hc.b(n1.document);
                j3 = n1.document.size;
                hcVar = b10;
                str2 = "g";
            } else {
                hc f11 = hc.f(w11, n1.document);
                j3 = w11.size;
                str2 = "36_36";
                hcVar = f11;
            }
            long j10 = j3;
            ij ijVar3 = s1Var.e;
            imageReceiver.p0(hcVar, str2, ijVar3.G1, j10, null, ijVar3, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (n1 == null || (webPage = n1.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User f12 = p10.i(i11).f();
            w8 w8Var = this.a;
            w8Var.r(f12);
            imageReceiver.i0(p10.i(i11).f(), w8Var, null);
            imageReceiver.J0(org.telegram.messenger.g0.L(36.0f));
        } else {
            TLRPC.PhotoSize w12 = w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            imageReceiver.p0(hc.f(w12, n1.webpage.photo), "36_36", s1Var.e.G1, w12 != null ? w12.size : 0L, null, n1.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        }
        this.r = z9;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = id.a0 ? getMeasuredWidth() - org.telegram.messenger.g0.L(51.0f) : org.telegram.messenger.g0.L(15.0f);
        float L = org.telegram.messenger.g0.L(7.0f);
        float L2 = org.telegram.messenger.g0.L(36.0f);
        float L3 = org.telegram.messenger.g0.L(36.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.r) {
            Paint W0 = k6.W0("paintDivider", this.f);
            if (W0 == null) {
                W0 = k6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(id.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(id.a0 ? 64.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }

    public void setReorder(boolean z9) {
        this.e.animate().alpha((!z9 || this.h) ? 0.0f : 1.0f).start();
    }
}
