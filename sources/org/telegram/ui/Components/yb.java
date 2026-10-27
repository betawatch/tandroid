package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class yb extends nb {
    public final bk0 a;
    public TextView b;
    public int c;

    public yb(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        bk0 bk0Var = new bk0(context);
        this.a = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(bk0Var, kb1.l(56.0f, 48.0f, 8388627));
        xb xbVar = new xb(context, 0, null);
        xbVar.setDisablePaddingsOffset(true);
        this.b = xbVar;
        NotificationCenter.listenEmojiLoading(xbVar);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.b, kb1.m(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        org.telegram.ui.ActionBar.f7.H(this.b, org.telegram.ui.ActionBar.y6.Gi, u6Var);
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.y6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bk0 bk0Var = this.a;
        bk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bk0Var.h(this.c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        bk0 bk0Var = this.a;
        bk0Var.setAutoRepeat(true);
        bk0Var.g(36, 36, document);
        for (String str : strArr) {
            bk0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.ub
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.ub
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.a.setLayoutParams(kb1.m(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.c = i10;
        this.b.setTextColor(i10);
    }

    public yb(int i10, int i11, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this(context, u6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}
