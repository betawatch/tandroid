package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class uq0 extends hr0 {
    public final /* synthetic */ ir0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(ir0 ir0Var, Context context) {
        super(context);
        this.r = ir0Var;
        final int i10 = 1;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.g6.O5;
        int i12 = ir0.a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.c0(dp, ir0Var.getThemedColor(i11)));
        addView(view, w7.z5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        di.ab abVar = new di.ab(this, context, 23);
        this.d = abVar;
        addView(abVar, w7.z5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        int i13 = org.telegram.ui.ActionBar.g6.ng;
        h5Var.setTextColor(ir0Var.getThemedColor(i13));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, w7.z5.a(-1.0f, 14.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        h5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gr0
            public final /* synthetic */ uq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i14) {
                    case 0:
                        this.b.a(0);
                        break;
                    default:
                        this.b.a(1);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var2;
        h5Var2.setTextColor(ir0Var.getThemedColor(i13));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, w7.z5.a(-1.0f, 0.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        h5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gr0
            public final /* synthetic */ uq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        this.b.a(0);
                        break;
                    default:
                        this.b.a(1);
                        break;
                }
            }
        });
    }
}
