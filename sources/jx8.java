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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jx8 extends FrameLayout {
    public final pb0 a;
    public final ImageReceiver b;
    public final wla c;
    public final wf2 d;
    public final ImageView e;
    public final wjb f;
    public boolean h;
    public final int[] n;
    public boolean r;

    public jx8(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.a = new pb0((wjb) null);
        this.b = new ImageReceiver(this);
        this.n = new int[1];
        this.f = wjbVar;
        setWillNotDraw(false);
        int i = z ? 42 : 16;
        wla wlaVar = new wla(context);
        this.c = wlaVar;
        wlaVar.setLines(2);
        wlaVar.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(wlaVar, bkb.y6, wjbVar);
        wlaVar.setTextSize(1, 14.0f);
        boolean z2 = k96.a0;
        addView(wlaVar, nme.d(-1, -2.0f, 7, z2 ? i : 64.0f, 7.0f, z2 ? 64.0f : i, 0.0f));
        if (z) {
            ImageView imageView = new ImageView(context);
            this.e = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.list_reorder);
            zkb.s(imageView, bkb.Ki, null, PorterDuff.Mode.MULTIPLY);
            imageView.setAlpha(0.0f);
            addView(imageView, nme.e(50, 50, (k96.a0 ? 3 : 5) | kk7.w1));
        } else {
            this.e = null;
        }
        wf2 wf2Var = new wf2(21, wjbVar, getContext());
        this.d = wf2Var;
        wf2Var.b(-1, bkb.c6, bkb.j7);
        wf2Var.setDrawUnchecked(false);
        wf2Var.setDrawBackgroundAsArc(3);
        addView(wf2Var, nme.i(24.0f, 24.0f, 8388659, 33.0f, 25.0f, 0.0f, 0.0f));
    }

    public final void a(nx8 nx8Var, String str, boolean z) {
        TLRPC.WebPage webPage;
        TLRPC.Photo photo;
        long j;
        String str2;
        gl5 gl5Var;
        String str3 = str;
        this.h = nx8Var != null ? nx8Var.g : false;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str3 != null && str3.length() > 0 && !str3.startsWith("/")) {
            str3 = "/".concat(str3);
        }
        spannableStringBuilder.append((CharSequence) "/").append((CharSequence) nx8Var.b);
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        int i = bkb.F6;
        wjb wjbVar = this.f;
        spannableStringBuilder.setSpan(new cm4(i, wjbVar), 0, spannableStringBuilder.length(), 33);
        if (str3 != null) {
            spannableStringBuilder.setSpan(new cm4(bkb.n6, wjbVar), 0, Math.min(str3.length() <= 0 ? 1 : str3.length(), spannableStringBuilder.length()), 33);
        }
        k27 k27Var = nx8Var.e;
        wla wlaVar = this.c;
        if (k27Var != null) {
            spannableStringBuilder.append((CharSequence) " ");
            CharSequence charSequence = nx8Var.e.z;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = nx8Var.e.v;
            }
            CharSequence m = vu3.m(new SpannableStringBuilder(charSequence), wlaVar.getPaint().getFontMetricsInt(), false, null, 0);
            TLRPC.Message message = nx8Var.e.k;
            if (message != null) {
                k27.A5(m, message.entities, wlaVar.getPaint().getFontMetricsInt(), false);
            }
            spannableStringBuilder.append(m);
        }
        if (nx8Var.a() > 1) {
            spannableStringBuilder.append((CharSequence) "  ");
            int L = gl.q.x - gl.L(80.0f);
            int a = nx8Var.a() - 1;
            int i2 = s0.d;
            SpannableString spannableString = new SpannableString("+");
            s0 s0Var = new s0(a);
            int L2 = (int) (((tgb) s0Var.c).c + gl.L(10.0f));
            this.n[0] = L2;
            spannableString.setSpan(s0Var, 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(TextUtils.ellipsize(spannableStringBuilder, wlaVar.getPaint(), (L * 1.5f) - r13[0], TextUtils.TruncateAt.END));
            if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == 8230) {
                spannableStringBuilder2.append((CharSequence) "  ");
            }
            spannableStringBuilder2.append((CharSequence) spannableString);
            spannableStringBuilder = spannableStringBuilder2;
        }
        wlaVar.setText(spannableStringBuilder);
        int i3 = y6c.t0;
        TLRPC.MessageMedia m1 = k27.m1(nx8Var.e);
        ImageReceiver imageReceiver = this.b;
        if (m1 != null) {
            TLRPC.Photo photo2 = m1.photo;
            if (photo2 != null) {
                TLRPC.PhotoSize w = ba4.w(photo2.sizes, gl.L(36.0f), true, null, true);
                gl5 f = gl5.f(w, m1.photo);
                k27 k27Var2 = nx8Var.e;
                imageReceiver.c0(f, "36_36", k27Var2.I1, w != null ? w.size : 0L, null, k27Var2, 0);
                imageReceiver.q0(gl.L(4.0f));
            } else if (m1.document != null && (k27.K4(nx8Var.e.k) || nx8Var.e.s4())) {
                TLRPC.PhotoSize w2 = ba4.w(m1.document.thumbs, gl.L(36.0f), true, null, true);
                TLRPC.Document document = m1.document;
                if (w2 == null) {
                    gl5 b = gl5.b(document);
                    j = m1.document.size;
                    gl5Var = b;
                    str2 = "g";
                } else {
                    gl5 f2 = gl5.f(w2, document);
                    j = w2.size;
                    str2 = "36_36";
                    gl5Var = f2;
                }
                long j2 = j;
                k27 k27Var3 = nx8Var.e;
                imageReceiver.c0(gl5Var, str2, k27Var3.I1, j2, null, k27Var3, 0);
                imageReceiver.q0(gl.L(4.0f));
            }
            this.r = z;
            invalidate();
        }
        if (m1 == null || (webPage = m1.webpage) == null || (photo = webPage.photo) == null) {
            TLRPC.User f3 = y6c.h(i3).f();
            pb0 pb0Var = this.a;
            pb0Var.q(f3);
            imageReceiver.U(y6c.h(i3).f(), pb0Var, null);
            imageReceiver.q0(gl.L(36.0f));
        } else {
            TLRPC.PhotoSize w3 = ba4.w(photo.sizes, gl.L(36.0f), true, null, true);
            imageReceiver.c0(gl5.f(w3, m1.webpage.photo), "36_36", nx8Var.e.I1, w3 != null ? w3.size : 0L, null, m1.webpage, 0);
            imageReceiver.q0(gl.L(4.0f));
        }
        this.r = z;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredWidth = k96.a0 ? getMeasuredWidth() - gl.L(51.0f) : gl.L(15.0f);
        float L = gl.L(7.0f);
        float L2 = gl.L(36.0f);
        float L3 = gl.L(36.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(measuredWidth, L, L2, L3);
        imageReceiver.h(canvas, null);
        super.onDraw(canvas);
        if (this.r) {
            Paint U0 = bkb.U0("paintDivider", this.f);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            canvas.drawRect(gl.L(k96.a0 ? 0.0f : 64.0f), getMeasuredHeight() - 1, getWidth() - gl.L(k96.a0 ? 64.0f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f) + (this.r ? 1 : 0), TLObject.FLAG_30));
    }

    public void setReorder(boolean z) {
        this.e.animate().alpha((!z || this.h) ? 0.0f : 1.0f).start();
    }
}
