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
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fc;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.ks;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.vy0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s1 extends FrameLayout {
    public final b9 a;
    public final ImageReceiver b;
    public final xh.l c;
    public final mp d;
    public final ImageView e;
    public final i6 f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public s1(Context context, i6 i6Var, boolean z10) {
        super(context);
        this.a = new b9((i6) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = i6Var;
        setWillNotDraw(false);
        int i7 = z10 ? 42 : 16;
        xh.l lVar = new xh.l(context);
        this.c = lVar;
        lVar.setLines(2);
        lVar.setEllipsize(TextUtils.TruncateAt.END);
        u6.U(lVar, n6.z6, i6Var);
        lVar.setTextSize(1, 14.0f);
        boolean z11 = gd.a0;
        addView(lVar, ma.d(-1, -2.0f, 7, z11 ? i7 : 64.0f, 7.0f, z11 ? 64.0f : i7, 0.0f));
        if (z10) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            u6.s(imageView, n6.Li, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            addView(imageView, ma.e(50, 50, (gd.a0 ? 3 : 5) | ks.x1));
        } else {
            this.e = null;
        }
        mp mpVar = new mp(21, getContext(), i6Var);
        this.d = mpVar;
        mpVar.b(-1, n6.d6, n6.k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
        addView(mpVar, ma.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(v1 v1Var, String str, boolean z10) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j3;
        String str2;
        fc fcVar;
        TLRPC.Photo photo2;
        String str3 = str;
        this.h = v1Var != null ? v1Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) v1Var.b);
        spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        int i7 = n6.G6;
        i6 i6Var = this.f;
        spannableStringBuilder.setSpan(new i00(i7, i6Var), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new i00(n6.o6, i6Var), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        fj fjVar = v1Var.e;
        xh.l lVar = this.c;
        if (fjVar != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = v1Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = v1Var.e.v;
            }
            CharSequence m10 = j6.m(new SpannableStringBuilder(charSequence), lVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = v1Var.e.k;
            if (message != null) {
                fj.B5(m10, message.entities, lVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m10);
        }
        if (v1Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(80.0f);
            int a10 = v1Var.a() - 1;
            int i10 = r1.d;
            SpannableString spannableString = new SpannableString("+");
            r1 r1Var = new r1(a10);
            int L2 = (int) (((vy0) r1Var.c).c + org.telegram.messenger.g0.L(10.0f));
            this.n[0] = L2;
            spannableString.setSpan(r1Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, lVar.getPaint(), (L * 1.5f) - r13[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        lVar.setText(spannableStringBuilder);
        int i11 = j10.t0;
        TLRPC.MessageMedia m12 = fj.m1(v1Var.e);
        ImageReceiver imageReceiver = this.b;
        if (m12 != null && (photo2 = m12.photo) != null) {
            TLRPC.PhotoSize w10 = w7.w(photo2.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            fc f10 = fc.f(w10, m12.photo);
            fj fjVar2 = v1Var.e;
            imageReceiver.p0(f10, "36_36", fjVar2.I1, w10 != null ? w10.size : 0L, null, fjVar2, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 != null && m12.document != null && (fj.L4(v1Var.e.k) || v1Var.e.t4())) {
            TLRPC.PhotoSize w11 = w7.w(m12.document.thumbs, org.telegram.messenger.g0.L(36.0f), true, null, true);
            if (w11 == null) {
                fc b10 = fc.b(m12.document);
                j3 = m12.document.size;
                fcVar = b10;
                str2 = "g";
            } else {
                fc f11 = fc.f(w11, m12.document);
                j3 = w11.size;
                str2 = "36_36";
                fcVar = f11;
            }
            long j10 = j3;
            fj fjVar3 = v1Var.e;
            imageReceiver.p0(fcVar, str2, fjVar3.I1, j10, null, fjVar3, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        } else if (m12 == null || (webPage = m12.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User f12 = j10.i(i11).f();
            b9 b9Var = this.a;
            b9Var.r(f12);
            imageReceiver.i0(j10.i(i11).f(), b9Var, null);
            imageReceiver.J0(org.telegram.messenger.g0.L(36.0f));
        } else {
            TLRPC.PhotoSize w12 = w7.w(photo.sizes, org.telegram.messenger.g0.L(36.0f), true, null, true);
            imageReceiver.p0(fc.f(w12, m12.webpage.photo), "36_36", v1Var.e.I1, w12 != null ? w12.size : 0L, null, m12.webpage, 0);
            imageReceiver.J0(org.telegram.messenger.g0.L(4.0f));
        }
        this.r = z10;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = gd.a0 ? getMeasuredWidth() - org.telegram.messenger.g0.L(51.0f) : org.telegram.messenger.g0.L(15.0f);
        float L = org.telegram.messenger.g0.L(7.0f);
        float L2 = org.telegram.messenger.g0.L(36.0f);
        float L3 = org.telegram.messenger.g0.L(36.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.r) {
            Paint W0 = n6.W0("paintDivider", this.f);
            if (W0 == null) {
                W0 = n6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(gd.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(gd.a0 ? 64.0f : 0.0f), getMeasuredHeight(), W0);
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
