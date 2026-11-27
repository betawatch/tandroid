// default package

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class a38 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final de0 d;

    public a38(Context context) {
        super(context);
        de0 de0Var = new de0(context);
        this.d = de0Var;
        de0Var.getImageReceiver().q0(hl.L(8.0f));
        addView(de0Var, tre.d(100, 100.0f, ob6.a0 ? 5 : 3, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        int i = aob.G6;
        yob.X(textView, i, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(hl.o());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z = ob6.a0;
        addView(textView, tre.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 10.0f : 123.0f, 9.0f, z ? 123.0f : 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.X(textView2, i, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z2 = ob6.a0;
        addView(textView2, tre.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 10.0f : 123.0f, 33.0f, z2 ? 123.0f : 10.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        yob.X(textView3, aob.z6, null);
        ik8.w(textView3, 1, 14.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity((ob6.a0 ? 5 : 3) | 48);
        boolean z3 = ob6.a0;
        addView(textView3, tre.d(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 10.0f : 123.0f, 90.0f, z3 ? 123.0f : 10.0f, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        TextView textView3 = this.c;
        textView3.setText(str3);
        if (hl.O1()) {
            min = hl.P0();
        } else {
            Point point = hl.q;
            min = Math.min(point.x, point.y);
        }
        float L = 640.0f / (((int) (min * 0.7f)) - hl.L(2.0f));
        int i = (int) (640.0f / L);
        int i2 = (int) (360.0f / L);
        de0 de0Var = this.d;
        if (webDocument == null || !webDocument.mime_type.startsWith("image/")) {
            textView.setLayoutParams(tre.d(-1, -2.0f, (ob6.a0 ? 5 : 3) | 48, 17.0f, 9.0f, 17.0f, 0.0f));
            textView2.setLayoutParams(tre.d(-1, -2.0f, (ob6.a0 ? 5 : 3) | 48, 17.0f, 33.0f, 17.0f, 0.0f));
            textView3.setLayoutParams(tre.d(-1, -2.0f, (ob6.a0 ? 5 : 3) | 48, 17.0f, 90.0f, 17.0f, 9.0f));
            de0Var.setVisibility(8);
            return;
        }
        boolean z = ob6.a0;
        textView.setLayoutParams(tre.d(-1, -2.0f, (z ? 5 : 3) | 48, z ? 10.0f : 123.0f, 9.0f, z ? 123.0f : 10.0f, 0.0f));
        boolean z2 = ob6.a0;
        textView2.setLayoutParams(tre.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 10.0f : 123.0f, 33.0f, z2 ? 123.0f : 10.0f, 0.0f));
        boolean z3 = ob6.a0;
        textView3.setLayoutParams(tre.d(-1, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 10.0f : 123.0f, 90.0f, z3 ? 123.0f : 10.0f, 0.0f));
        de0Var.setVisibility(0);
        Locale locale = Locale.US;
        de0Var.getImageReceiver().Z(jn5.p(jxc.c(webDocument)), qd4.m(i, i2, "_"), null, null, null, -1L, null, obj, 1);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a38 a38Var;
        int i3;
        int i4;
        if (this.d.getVisibility() != 8) {
            i4 = View.MeasureSpec.makeMeasureSpec(hl.L(120.0f), TLObject.FLAG_30);
            a38Var = this;
            i3 = i;
        } else {
            TextView textView = this.b;
            a38Var = this;
            i3 = i;
            a38Var.measureChildWithMargins(textView, i3, 0, i2, 0);
            ((FrameLayout.LayoutParams) a38Var.c.getLayoutParams()).topMargin = hl.L(3.0f) + textView.getMeasuredHeight() + hl.L(33.0f);
            i4 = 0;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), i4);
    }
}
