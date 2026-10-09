package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class bc extends qb {
    public final fk0 a;
    public TextView b;
    public int c;

    public bc(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        fk0 fk0Var = new fk0(context);
        this.a = fk0Var;
        fk0Var.setScaleType(ImageView.ScaleType.CENTER);
        addView(fk0Var, w7.x5.h(56.0f, 48.0f, 8388627));
        ac acVar = new ac(context, 0, null);
        acVar.setDisablePaddingsOffset(true);
        this.b = acVar;
        NotificationCenter.listenEmojiLoading(acVar);
        this.b.setSingleLine();
        this.b.setTypeface(Typeface.SANS_SERIF);
        this.b.setTextSize(1, 15.0f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.b.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        addView(this.b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 16.0f, 0.0f));
        this.b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Gi));
        setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Hi));
        setBackground(getThemedColor(org.telegram.ui.ActionBar.i6.Fi));
    }

    public final void c(int i10, int i11, int i12, String... strArr) {
        fk0 fk0Var = this.a;
        fk0Var.f(i10, i11, i12, null);
        for (String str : strArr) {
            fk0Var.h(this.c, str);
        }
    }

    public final void d(int i10, String... strArr) {
        c(i10, 32, 32, strArr);
    }

    public final void e(TLRPC.Document document, String... strArr) {
        fk0 fk0Var = this.a;
        fk0Var.setAutoRepeat(true);
        fk0Var.g(36, 36, document);
        for (String str : strArr) {
            fk0Var.h(this.c, str);
        }
    }

    @Override // org.telegram.ui.Components.xb
    public CharSequence getAccessibilityText() {
        return this.b.getText();
    }

    @Override // org.telegram.ui.Components.xb
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

    public bc(int i10, int i11, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(context, e6Var);
        setBackground(i10);
        setTextColor(i11);
    }
}
