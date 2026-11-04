package lg;

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
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.u8;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q1 extends FrameLayout {
    public final u8 a;
    public final ImageReceiver b;
    public final yh.l c;
    public final wo d;
    public final ImageView e;
    public final e6 f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public q1(Context context, e6 e6Var, boolean z10) {
        super(context);
        this.a = new u8((e6) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = e6Var;
        setWillNotDraw(false);
        int i3 = z10 ? 42 : 16;
        yh.l lVar = new yh.l(context);
        this.c = lVar;
        lVar.setLines(2);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        r6.V(lVar, k6.z6, e6Var);
        lVar.setTextSize(1, 14.0f);
        boolean z11 = bd.a0;
        addView(lVar, mf.d(-1, -2.0f, 7, z11 ? i3 : 64.0f, 7.0f, z11 ? 64.0f : i3, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            r6.t(imageView, k6.Ii, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            addView(imageView, mf.e(50, 50, (bd.a0 ? 3 : 5) | hs.x1));
        } else {
            this.e = null;
        }
        wo woVar = new wo(21, getContext(), e6Var);
        this.d = woVar;
        woVar.b(-1, k6.d6, k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, mf.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(t1 t1Var, String str, boolean z10) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j10;
        String str2;
        ac acVar;
        TLRPC.Photo photo2;
        String str3 = str;
        this.h = t1Var != null ? t1Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) t1Var.b);
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        int i3 = k6.G6;
        e6 e6Var = this.f;
        spannableStringBuilder.setSpan(new tz(i3, e6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new tz(k6.o6, e6Var), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        zi ziVar = t1Var.e;
        yh.l lVar = this.c;
        if (ziVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = t1Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = t1Var.e.v;
            }
            CharSequence m10 = i6.m(new SpannableStringBuilder(charSequence), lVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = t1Var.e.k;
            if (message != null) {
                zi.C5(m10, message.entities, lVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (t1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(80.0f);
            int a10 = t1Var.a() - 1;
            int i10 = p1.d;
            SpannableString spannableString = new SpannableString("+");
            p1 p1Var = new p1(a10);
            int L2 = (int) (((ly0) p1Var.c).c + org.telegram.messenger.g0.L(10.0f));
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
        int i11 = h10.t0;
        TLRPC.MessageMedia n12 = zi.n1(t1Var.e);
        ImageReceiver imageReceiver = this.b;
        if (n12 != null && (photo2 = n12.photo) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo2.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            ac f10 = ac.f(w10, n12.photo);
            zi ziVar2 = t1Var.e;
            imageReceiver.p0(f10, "36_36", ziVar2.G1, w10 != null ? w10.size : 0L, null, ziVar2, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (n12 != null && n12.document != null && (zi.M4(t1Var.e.k) || t1Var.e.u4())) {
            TLRPC.PhotoSize w11 = w7.w(n12.document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
            if (w11 == null) {
                ac b10 = ac.b(n12.document);
                j10 = n12.document.size;
                acVar = b10;
                str2 = "g";
            } else {
                ac f11 = ac.f(w11, n12.document);
                j10 = w11.size;
                str2 = "36_36";
                acVar = f11;
            }
            long j11 = j10;
            zi ziVar3 = t1Var.e;
            imageReceiver.p0(acVar, str2, ziVar3.G1, j11, null, ziVar3, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (n12 == null || (webPage = n12.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User f12 = h10.i(i11).f();
            u8 u8Var = this.a;
            u8Var.r(f12);
            imageReceiver.i0(h10.i(i11).f(), u8Var, null);
            imageReceiver.J0(org.telegram.messenger.g0.L(36.0f));
        } else {
            TLRPC.PhotoSize w12 = w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            imageReceiver.p0(ac.f(w12, n12.webpage.photo), "36_36", t1Var.e.G1, w12 != null ? w12.size : 0L, null, n12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        }
        this.r = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = bd.a0 ? getMeasuredWidth() - org.telegram.messenger.g0.L(51.0f) : org.telegram.messenger.g0.L(15.0f);
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
            canvas.drawRect(org.telegram.messenger.g0.L(bd.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(bd.a0 ? 64.0f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }

    public void setReorder(boolean z10) {
        this.e.animate().alpha((!z10 || this.h) ? 0.0f : 1.0f).start();
    }
}
