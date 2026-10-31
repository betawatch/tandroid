package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.b30;
import org.telegram.messenger.cd;
import org.telegram.messenger.ic;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o5 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.g9 d;

    public o5(Context context) {
        super(context);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.d = g9Var;
        g9Var.getImageReceiver().J0(org.telegram.messenger.i0.L(8.0f));
        addView(g9Var, w7.b6.d(100, 100.0f, cd.X ? 5 : 3, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(textView, i10, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((cd.X ? 5 : 3) | 48);
        boolean z10 = cd.X;
        addView(textView, w7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 10.0f : 123.0f, 9.0f, z10 ? 123.0f : 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, i10, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((cd.X ? 5 : 3) | 48);
        boolean z11 = cd.X;
        addView(textView2, w7.b6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 10.0f : 123.0f, 33.0f, z11 ? 123.0f : 10.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.z6, null);
        z20.o(textView3, 1, 14.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity((cd.X ? 5 : 3) | 48);
        boolean z12 = cd.X;
        addView(textView3, w7.b6.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 10.0f : 123.0f, 90.0f, z12 ? 123.0f : 10.0f, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        TextView textView3 = this.c;
        textView3.setText(str3);
        if (org.telegram.messenger.i0.Q1()) {
            min = org.telegram.messenger.i0.Q0();
        } else {
            Point point = org.telegram.messenger.i0.q;
            min = Math.min(point.x, point.y);
        }
        float f7 = 640;
        float L = f7 / (((int) (min * 0.7f)) - org.telegram.messenger.i0.L(2.0f));
        int i10 = (int) (f7 / L);
        int i11 = (int) (360 / L);
        org.telegram.ui.Components.g9 g9Var = this.d;
        if (webDocument == null || !webDocument.mime_type.startsWith("image/")) {
            textView.setLayoutParams(w7.b6.d(-1, -2.0f, (cd.X ? 5 : 3) | 48, 17.0f, 9.0f, 17.0f, 0.0f));
            textView2.setLayoutParams(w7.b6.d(-1, -2.0f, (cd.X ? 5 : 3) | 48, 17.0f, 33.0f, 17.0f, 0.0f));
            textView3.setLayoutParams(w7.b6.d(-1, -2.0f, (cd.X ? 5 : 3) | 48, 17.0f, 90.0f, 17.0f, 9.0f));
            g9Var.setVisibility(8);
            return;
        }
        boolean z10 = cd.X;
        textView.setLayoutParams(w7.b6.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 10.0f : 123.0f, 9.0f, z10 ? 123.0f : 10.0f, 0.0f));
        boolean z11 = cd.X;
        textView2.setLayoutParams(w7.b6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 10.0f : 123.0f, 33.0f, z11 ? 123.0f : 10.0f, 0.0f));
        boolean z12 = cd.X;
        textView3.setLayoutParams(w7.b6.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 10.0f : 123.0f, 90.0f, z12 ? 123.0f : 10.0f, 0.0f));
        g9Var.setVisibility(0);
        Locale locale = Locale.US;
        g9Var.getImageReceiver().r0(ic.p(b30.c(webDocument)), a1.g.i(i10, i11, "_"), null, null, null, -1L, null, obj, 1);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (this.d.getVisibility() != 8) {
            i13 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(120.0f), TLObject.FLAG_30);
            i12 = i10;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            TextView textView = this.b;
            i12 = i10;
            measureChildWithMargins(textView, i12, 0, i11, 0);
            ((FrameLayout.LayoutParams) this.c.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(3.0f) + textView.getMeasuredHeight() + org.telegram.messenger.i0.L(33.0f);
            i13 = makeMeasureSpec;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), TLObject.FLAG_30), i13);
    }
}
