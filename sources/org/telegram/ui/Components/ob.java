package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class ob extends eb {
    public final pi0 a;
    public TextView b;
    public int c;

    public ob(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        pi0 pi0Var = new pi0(context);
        this.a = pi0Var;
        pi0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(pi0Var, g7.e6.h(56.0f, 48.0f, 8388627));
        fh.e4 e4Var = new fh.e4(context, 1, null);
        e4Var.setDisablePaddingsOffset(true);
        this.b = e4Var;
        NotificationCenter.listenEmojiLoading(e4Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.b, g7.e6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.f6.Fi));
    }

    public final void c(int i9, int i10, int i11, String... strArr) {
        pi0 pi0Var = this.a;
        pi0Var.f(i9, i10, i11, null);
        for (String str : strArr) {
            pi0Var.h(this.c, str);
        }
    }

    public final void d(int i9, String... strArr) {
        c(i9, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        pi0 pi0Var = this.a;
        pi0Var.setAutoRepeat(true);
        pi0Var.g(36, 36, document);
        for (String str : strArr) {
            pi0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.lb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.lb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i9) {
        this.a.setLayoutParams(g7.e6.i(56.0f, 48 - i9, 8388627, 0.0f, 0.0f, 0.0f, i9));
    }

    public void setTextColor(int i9) {
        this.c = i9;
        this.b.setTextColor(i9);
    }

    public ob(int i9, int i10, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, b6Var);
        setBackground(i9);
        setTextColor(i10);
    }
}
