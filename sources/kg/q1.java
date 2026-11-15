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
import c8.ja;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gc;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ns;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b00;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class q1 extends FrameLayout {
    public final t8 a;
    public final ImageReceiver b;
    public final xh.l c;
    public final fp d;
    public final ImageView e;
    public final e6 f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public q1(Context context, e6 e6Var, boolean z10) {
        super(context);
        this.a = new t8((e6) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = e6Var;
        setWillNotDraw(false);
        int i7 = z10 ? 42 : 16;
        xh.l lVar = new xh.l(context);
        this.c = lVar;
        lVar.setLines(2);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        q6.U(lVar, j6.z6, e6Var);
        lVar.setTextSize(1, 14.0f);
        boolean z11 = hd.a0;
        addView(lVar, ja.d(-1, -2.0f, 7, z11 ? i7 : 64.0f, 7.0f, z11 ? 64.0f : i7, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            q6.s(imageView, j6.Li, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            addView(imageView, ja.e(50, 50, (hd.a0 ? 3 : 5) | ns.x1));
        } else {
            this.e = null;
        }
        fp fpVar = new fp(21, getContext(), e6Var);
        this.d = fpVar;
        fpVar.b(-1, j6.d6, j6.k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(3);
        addView(fpVar, ja.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(u1 u1Var, String str, boolean z10) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j3;
        String str2;
        gc gcVar;
        TLRPC.Photo photo2;
        String str3 = str;
        this.h = u1Var != null ? u1Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) u1Var.b);
        spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        int i7 = j6.G6;
        e6 e6Var = this.f;
        spannableStringBuilder.setSpan(new b00(i7, e6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new b00(j6.o6, e6Var), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        gj gjVar = u1Var.e;
        xh.l lVar = this.c;
        if (gjVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = u1Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = u1Var.e.v;
            }
            CharSequence m10 = org.telegram.messenger.j6.m(new SpannableStringBuilder(charSequence), lVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = u1Var.e.k;
            if (message != null) {
                gj.B5(m10, message.entities, lVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (u1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(80.0f);
            int a10 = u1Var.a() - 1;
            int i10 = p1.d;
            SpannableString spannableString = new SpannableString("+");
            p1 p1Var = new p1(a10);
            int L2 = (int) (((oy0) p1Var.c).c + org.telegram.messenger.g0.L(10.0f));
            this.n[0] = L2;
            spannableString.setSpan(p1Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, lVar.getPaint(), (L * 1.5f) - r13[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        lVar.setText(spannableStringBuilder);
        int i11 = m10.t0;
        TLRPC.MessageMedia m12 = gj.m1(u1Var.e);
        ImageReceiver imageReceiver = this.b;
        if (m12 != null && (photo2 = m12.photo) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo2.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            gc f10 = gc.f(w10, m12.photo);
            gj gjVar2 = u1Var.e;
            imageReceiver.p0(f10, "36_36", gjVar2.I1, w10 != null ? w10.size : 0L, null, gjVar2, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && m12.document != null && (gj.L4(u1Var.e.k) || u1Var.e.t4())) {
            TLRPC.PhotoSize w11 = w7.w(m12.document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
            if (w11 == null) {
                gc b10 = gc.b(m12.document);
                j3 = m12.document.size;
                gcVar = b10;
                str2 = "g";
            } else {
                gc f11 = gc.f(w11, m12.document);
                j3 = w11.size;
                str2 = "36_36";
                gcVar = f11;
            }
            long j10 = j3;
            gj gjVar3 = u1Var.e;
            imageReceiver.p0(gcVar, str2, gjVar3.I1, j10, null, gjVar3, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 == null || (webPage = m12.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User f12 = m10.i(i11).f();
            t8 t8Var = this.a;
            t8Var.r(f12);
            imageReceiver.i0(m10.i(i11).f(), t8Var, null);
            imageReceiver.J0(org.telegram.messenger.g0.L(36.0f));
        } else {
            TLRPC.PhotoSize w12 = w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            imageReceiver.p0(gc.f(w12, m12.webpage.photo), "36_36", u1Var.e.I1, w12 != null ? w12.size : 0L, null, m12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        }
        this.r = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = hd.a0 ? getMeasuredWidth() - org.telegram.messenger.g0.L(51.0f) : org.telegram.messenger.g0.L(15.0f);
        float L = org.telegram.messenger.g0.L(7.0f);
        float L2 = org.telegram.messenger.g0.L(36.0f);
        float L3 = org.telegram.messenger.g0.L(36.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.r) {
            Paint W0 = j6.W0("paintDivider", this.f);
            if (W0 == null) {
                W0 = j6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(hd.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(hd.a0 ? 64.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }

    public void setReorder(boolean z10) {
        this.e.animate().alpha((!z10 || this.h) ? 0.0f : 1.0f).start();
    }
}
