package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class mb extends cb {
    public final ri0 a;
    public TextView b;
    public int c;

    public mb(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        ri0 ri0Var = new ri0(context);
        this.a = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(ri0Var, h7.z5.h(56.0f, 48.0f, 8388627));
        ag.v2 v2Var = new ag.v2(context, 2, null);
        v2Var.setDisablePaddingsOffset(true);
        this.b = v2Var;
        NotificationCenter.listenEmojiLoading(v2Var);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.b, h7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.g6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        ri0 ri0Var = this.a;
        ri0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            ri0Var.h(this.c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        ri0 ri0Var = this.a;
        ri0Var.setAutoRepeat(true);
        ri0Var.g(36, 36, document);
        for (String str : strArr) {
            ri0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.jb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.jb
    public final void onShow() {
        super.onShow();
        this.a.d();
    }

    public void setIconPaddingBottom(int i10) {
        this.a.setLayoutParams(h7.z5.i(56.0f, 48 - i10, 8388627, 0.0f, 0.0f, 0.0f, i10));
    }

    public void setTextColor(int i10) {
        this.c = i10;
        this.b.setTextColor(i10);
    }

    public mb(int i10, int i11, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, c6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}
