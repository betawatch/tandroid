package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewSwitcher;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class df0 implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ df0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.widget.ViewSwitcher.ViewFactory
    public final View makeView() {
        int i10 = this.a;
        int i11 = 1;
        Object obj = this.b;
        switch (i10) {
            case 0:
                TextView textView = new TextView((Context) obj);
                textView.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                org.telegram.ui.ActionBar.a7.E(textView, org.telegram.ui.ActionBar.t6.H6, null);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 1);
                return textView;
            case 1:
                TextView textView2 = new TextView((Context) obj);
                org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.D6, null);
                textView2.setGravity(1);
                textView2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                textView2.setTextSize(1, 15.0f);
                return textView2;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                return new vr0(photoViewer.E, photoViewer.T1, photoViewer.Q, new xo0(photoViewer, 0), new af0(photoViewer, i11));
        }
    }
}
