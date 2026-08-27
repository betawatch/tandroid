package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.WebFile;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i5 extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;
    public final org.telegram.ui.Components.n9 d;

    public i5(Context context) {
        super(context);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.d = n9Var;
        n9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(8.0f));
        addView(n9Var, h7.z5.d(100, 100.0f, LocaleController.isRTL ? 5 : 3, 10.0f, 10.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z10 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 10.0f : 123.0f, 9.0f, z10 ? 123.0f : 10.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, h7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 10.0f : 123.0f, 33.0f, z11 ? 123.0f : 10.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.c = textView3;
        rl.p(textView3, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.z6, false), 1, 14.0f, 1);
        textView3.setMaxLines(1);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        boolean z12 = LocaleController.isRTL;
        addView(textView3, h7.z5.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 10.0f : 123.0f, 90.0f, z12 ? 123.0f : 10.0f, 9.0f));
    }

    public final void a(String str, String str2, TLRPC.WebDocument webDocument, String str3, Object obj) {
        int min;
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        TextView textView3 = this.c;
        textView3.setText(str3);
        if (AndroidUtilities.isTablet()) {
            min = AndroidUtilities.getMinTabletSide();
        } else {
            Point point = AndroidUtilities.displaySize;
            min = Math.min(point.x, point.y);
        }
        float f10 = 640;
        float dp = f10 / (((int) (min * 0.7f)) - AndroidUtilities.dp(2.0f));
        int i10 = (int) (f10 / dp);
        int i11 = (int) (360 / dp);
        org.telegram.ui.Components.n9 n9Var = this.d;
        if (webDocument == null || !webDocument.mime_type.startsWith("image/")) {
            textView.setLayoutParams(h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 17.0f, 9.0f, 17.0f, 0.0f));
            textView2.setLayoutParams(h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 17.0f, 33.0f, 17.0f, 0.0f));
            textView3.setLayoutParams(h7.z5.d(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 17.0f, 90.0f, 17.0f, 9.0f));
            n9Var.setVisibility(8);
            return;
        }
        boolean z10 = LocaleController.isRTL;
        textView.setLayoutParams(h7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 10.0f : 123.0f, 9.0f, z10 ? 123.0f : 10.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        textView2.setLayoutParams(h7.z5.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 10.0f : 123.0f, 33.0f, z11 ? 123.0f : 10.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        textView3.setLayoutParams(h7.z5.d(-1, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 10.0f : 123.0f, 90.0f, z12 ? 123.0f : 10.0f, 0.0f));
        n9Var.setVisibility(0);
        Locale locale = Locale.US;
        n9Var.getImageReceiver().setImage(ImageLocation.getForWebFile(WebFile.createWithWebDocument(webDocument)), com.google.android.recaptcha.internal.a.l(i10, "_", i11), null, null, -1L, null, obj, 1);
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
            i13 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_30);
            i12 = i10;
        } else {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            TextView textView = this.b;
            i12 = i10;
            measureChildWithMargins(textView, i12, 0, i11, 0);
            ((FrameLayout.LayoutParams) this.c.getLayoutParams()).topMargin = AndroidUtilities.dp(3.0f) + textView.getMeasuredHeight() + AndroidUtilities.dp(33.0f);
            i13 = makeMeasureSpec;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), TLObject.FLAG_30), i13);
    }
}
