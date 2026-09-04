package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.webkit.CookieManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class hu0 extends org.telegram.ui.Components.qf0 {
    public final Rect M;
    public final /* synthetic */ PhotoViewer N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu0(PhotoViewer photoViewer, PhotoViewer photoViewer2, Context context, org.telegram.ui.ActionBar.f1 f1Var) {
        super(context);
        this.N = photoViewer;
        this.a = UserConfig.selectedAccount;
        this.v = new ArrayList();
        this.L = new org.telegram.ui.Components.cc0(this, 10);
        this.b = photoViewer2;
        this.r = f1Var;
        int i10 = 1;
        org.telegram.ui.Components.nu nuVar = new org.telegram.ui.Components.nu(this, context, context, i10);
        this.f = nuVar;
        nuVar.getSettings().setJavaScriptEnabled(true);
        nuVar.getSettings().setDomStorageEnabled(true);
        nuVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        nuVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(nuVar, true);
        nuVar.setWebViewClient(new fg.i(this, i10));
        addView(nuVar, w7.x5.e(-1, -1, 51));
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.x5.e(-2, -2, 17));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.y6, null, false, textView, 17);
        linearLayout.addView(textView, w7.x5.q(-2, -2, 1));
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.j6.n6;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        textView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        int i12 = org.telegram.ui.ActionBar.y5.a;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.d(new float[]{12.0f}, 0, org.telegram.ui.ActionBar.y5.b(org.telegram.ui.ActionBar.j6.w0(null, i11, false))));
        textView2.setVisibility(8);
        linearLayout.addView(textView2, w7.x5.t(-2, -2, 1, 0, 8, 0, 0));
        di.eb ebVar = new di.eb(this, context, 20);
        this.h = ebVar;
        ebVar.setBackgroundColor(-16777216);
        ebVar.setVisibility(4);
        addView(ebVar, w7.x5.c(-1.0f, -1));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.n = radialProgressView;
        radialProgressView.setVisibility(4);
        addView(radialProgressView, w7.x5.e(-2, -2, 17));
        this.M = new Rect();
    }

    public final void j(Canvas canvas, int i10, int i11) {
        Bitmap bitmap = this.N.C4.getBitmap();
        if (bitmap != null) {
            float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int width = (int) (bitmap.getWidth() * min);
            int height = (int) (bitmap.getHeight() * min);
            int i12 = (i11 - height) / 2;
            int i13 = (i10 - width) / 2;
            Rect rect = this.M;
            rect.set(i13, i12, width + i13, height + i12);
            canvas.drawBitmap(bitmap, (Rect) null, rect, (Paint) null);
        }
    }
}
