package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class j5 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.l9 d;

    public j5(Context context) {
        super(context);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.d = l9Var;
        l9Var.getImageReceiver().J0(org.telegram.messenger.g0.L(8.0f));
        addView(l9Var, c8.ha.d(100, 100.0f, hd.a0 ? 5 : 3, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i7, null);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z9 = hd.a0;
        addView(textView, c8.ha.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 10.0f : 123.0f, 9.0f, z9 ? 123.0f : 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, i7, null);
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z10 = hd.a0;
        addView(textView2, c8.ha.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 10.0f : 123.0f, 33.0f, z10 ? 123.0f : 10.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.z6, null);
        org.telegram.messenger.camera.q.n(textView3, 1, 14.0f, 1, 1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity((hd.a0 ? 5 : 3) | 48);
        boolean z11 = hd.a0;
        addView(textView3, c8.ha.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 10.0f : 123.0f, 90.0f, z11 ? 123.0f : 10.0f, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        TextView textView3 = this.c;
        textView3.setText(str3);
        if (org.telegram.messenger.g0.Q1()) {
            min = org.telegram.messenger.g0.Q0();
        } else {
            Point point = org.telegram.messenger.g0.q;
            min = Math.min(point.x, point.y);
        }
        float f10 = 640;
        float L = f10 / (((int) (min * 0.7f)) - org.telegram.messenger.g0.L(2.0f));
        int i7 = (int) (f10 / L);
        int i10 = (int) (360 / L);
        org.telegram.ui.Components.l9 l9Var = this.d;
        if (webDocument == null || !webDocument.mime_type.startsWith("image/")) {
            textView.setLayoutParams(c8.ha.d(-1, -2.0f, (hd.a0 ? 5 : 3) | 48, 17.0f, 9.0f, 17.0f, 0.0f));
            textView2.setLayoutParams(c8.ha.d(-1, -2.0f, (hd.a0 ? 5 : 3) | 48, 17.0f, 33.0f, 17.0f, 0.0f));
            textView3.setLayoutParams(c8.ha.d(-1, -2.0f, (hd.a0 ? 5 : 3) | 48, 17.0f, 90.0f, 17.0f, 9.0f));
            l9Var.setVisibility(8);
            return;
        }
        boolean z9 = hd.a0;
        textView.setLayoutParams(c8.ha.d(-1, -2.0f, (z9 ? 5 : 3) | 48, z9 ? 10.0f : 123.0f, 9.0f, z9 ? 123.0f : 10.0f, 0.0f));
        boolean z10 = hd.a0;
        textView2.setLayoutParams(c8.ha.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 10.0f : 123.0f, 33.0f, z10 ? 123.0f : 10.0f, 0.0f));
        boolean z11 = hd.a0;
        textView3.setLayoutParams(c8.ha.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 10.0f : 123.0f, 90.0f, z11 ? 123.0f : 10.0f, 0.0f));
        l9Var.setVisibility(0);
        Locale locale = Locale.US;
        l9Var.getImageReceiver().r0(hc.p(m20.c(webDocument)), com.google.android.recaptcha.internal.a.j(i7, "_", i10), null, null, null, -1L, null, obj, 1);
    }

    public final void b(TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, String str) {
        a(tL_messageMediaInvoice.title, tL_messageMediaInvoice.description, tL_messageMediaInvoice.webPhoto, str, tL_messageMediaInvoice);
    }

    public final void c(TLRPC.PaymentReceipt paymentReceipt, String str) {
        a(paymentReceipt.title, paymentReceipt.description, paymentReceipt.photo, str, paymentReceipt);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        if (this.d.getVisibility() != 8) {
            i12 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_30);
            i11 = i7;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            TextView textView = this.b;
            i11 = i7;
            measureChildWithMargins(textView, i11, 0, i10, 0);
            ((FrameLayout.LayoutParams) this.c.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(3.0f) + textView.getMeasuredHeight() + org.telegram.messenger.g0.L(33.0f);
            i12 = makeMeasureSpec;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), TLObject.FLAG_30), i12);
    }
}
