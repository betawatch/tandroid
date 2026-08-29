package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bl0 extends org.telegram.ui.Components.v41 {
    public static final /* synthetic */ int a = 0;

    static {
        org.telegram.ui.Components.v41.setup(new bl0());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        cl0 cl0Var = (cl0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) w41Var.G;
        View.OnClickListener onClickListener = w41Var.D;
        TextView textView = cl0Var.f;
        TextView textView2 = cl0Var.e;
        org.telegram.ui.ActionBar.c6 c6Var = cl0Var.b;
        FrameLayout frameLayout = cl0Var.c;
        org.telegram.ui.Components.t9 t9Var = cl0Var.d;
        cl0Var.r = passkey.id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            t9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.p5.n(cl0Var.a, j10, null, 3));
            frameLayout.setBackground(null);
            t9Var.setColorFilter(null);
            t9Var.setScaleX(1.0f);
            t9Var.setScaleY(1.0f);
        } else {
            int dp = AndroidUtilities.dp(4.0f);
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(0.04f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var))));
            t9Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var)), PorterDuff.Mode.SRC_IN));
            t9Var.setImageResource(R.drawable.msg2_permissions);
            t9Var.setScaleX(0.666f);
            t9Var.setScaleY(0.666f);
            t9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(LocaleController.getString(R.string.PasskeyUnknown));
        } else {
            textView2.setText(passkey.name);
        }
        int i11 = passkey.last_usage_date;
        if (i11 != 0) {
            textView.setText(LocaleController.formatString(R.string.PasskeyLastUsedOn, LocaleController.formatDateTime(i11, false)));
        } else {
            textView.setText(LocaleController.formatString(R.string.PasskeyCreatedOn, LocaleController.formatDateTime(passkey.date, false)));
        }
        cl0Var.h.setOnClickListener(onClickListener);
        cl0Var.n = z10;
        cl0Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new cl0(context, i10, c6Var);
    }
}
