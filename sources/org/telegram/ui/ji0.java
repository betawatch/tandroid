package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ji0 extends org.telegram.ui.Components.q31 {
    public static final /* synthetic */ int b = 0;

    static {
        org.telegram.ui.Components.q31.h(new ji0());
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, org.telegram.ui.Components.r31 r31Var, boolean z10, org.telegram.ui.Components.f41 f41Var, org.telegram.ui.Components.l41 l41Var) {
        ki0 ki0Var = (ki0) view;
        TL_account.Passkey passkey = (TL_account.Passkey) r31Var.G;
        View.OnClickListener onClickListener = r31Var.D;
        TextView textView = ki0Var.n;
        TextView textView2 = ki0Var.h;
        org.telegram.ui.ActionBar.e6 e6Var = ki0Var.d;
        FrameLayout frameLayout = ki0Var.e;
        org.telegram.ui.Components.k9 k9Var = ki0Var.f;
        ki0Var.w = passkey.id;
        long j10 = passkey.software_emoji_id;
        if (j10 != 0) {
            k9Var.setAnimatedEmojiDrawable(org.telegram.ui.Components.g5.m(ki0Var.c, j10, null, 3));
            frameLayout.setBackground(null);
            k9Var.setColorFilter(null);
            ki0Var.a = false;
            k9Var.setScaleX(1.0f);
            k9Var.setScaleY(1.0f);
        } else {
            int L = org.telegram.messenger.g0.L(4.0f);
            int i3 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.C(frameLayout, org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.04f, org.telegram.ui.ActionBar.k6.w0(i3, e6Var))), org.telegram.ui.ActionBar.r6.L(0.04f, i3), e6Var);
            ki0Var.a();
            k9Var.setImageResource(R.drawable.msg2_permissions);
            k9Var.setScaleX(0.666f);
            k9Var.setScaleY(0.666f);
            k9Var.setAnimatedEmojiDrawable(null);
        }
        if (TextUtils.isEmpty(passkey.name)) {
            textView2.setText(org.telegram.messenger.bd.M0(2131747636, null));
        } else {
            textView2.setText(passkey.name);
        }
        int i10 = passkey.last_usage_date;
        if (i10 != 0) {
            textView.setText(org.telegram.messenger.bd.a0(null, null, 2131747642, org.telegram.messenger.bd.x(i10, false)));
        } else {
            textView.setText(org.telegram.messenger.bd.a0(null, null, 2131747655, org.telegram.messenger.bd.x(passkey.date, false)));
        }
        ki0Var.r.setOnClickListener(onClickListener);
        ki0Var.s = z10;
        ki0Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, org.telegram.ui.Components.tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ki0(i3, context, e6Var);
    }
}
