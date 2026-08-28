package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag0 implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ag0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        int i9 = this.a;
        int i10 = 1;
        Object obj = this.b;
        switch (i9) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                textView.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                j3.r0.w(org.telegram.ui.ActionBar.f6.D6, null, false, textView2, 1);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                return new ot0(photoViewer.A, photoViewer.P1, photoViewer.M, new nq0(photoViewer, 0), new xf0(photoViewer, i10));
        }
    }
}
