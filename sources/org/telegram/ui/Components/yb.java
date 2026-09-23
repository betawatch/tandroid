package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public class yb extends nb {
    public final bj0 a;
    public TextView b;
    public int c;

    public yb(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        bj0 bj0Var = new bj0(context);
        this.a = bj0Var;
        bj0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(bj0Var, w7.x5.h(56.0f, 48.0f, 8388627));
        xb xbVar = new xb(context, 0, null);
        xbVar.setDisablePaddingsOffset(true);
        this.b = xbVar;
        NotificationCenter.listenEmojiLoading(xbVar);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.h6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        bj0 bj0Var = this.a;
        bj0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            bj0Var.h(this.c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        bj0 bj0Var = this.a;
        bj0Var.setAutoRepeat(true);
        bj0Var.g(36, 36, document);
        for (String str : strArr) {
            bj0Var.h(this.c, str);
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
        this.a.setLayoutParams(w7.x5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.c = i10;
        this.b.setTextColor(i10);
    }

    public yb(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this(context, d6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}
