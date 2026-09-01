package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yp0 extends lq0 {
    public final /* synthetic */ mq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp0(mq0 mq0Var, Context context) {
        super(context);
        this.n = mq0Var;
        final int i10 = 1;
        this.f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.k6.O5;
        int i12 = mq0.X0;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.b0(dp, mq0Var.getThemedColor(i11)));
        addView(view, k7.c6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        fg.h0 h0Var = new fg.h0(this, context, 18);
        this.c = h0Var;
        addView(h0Var, k7.c6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.b = l5Var;
        int i13 = org.telegram.ui.ActionBar.k6.ng;
        l5Var.setTextColor(mq0Var.getThemedColor(i13));
        l5Var.setTextSize(13);
        l5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        l5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        l5Var.setGravity(17);
        addView(l5Var, k7.c6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        l5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kq0
            public final /* synthetic */ yp0 b;

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
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(context);
        this.a = l5Var2;
        l5Var2.setTextColor(mq0Var.getThemedColor(i13));
        l5Var2.setTextSize(13);
        l5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        l5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        l5Var2.setGravity(17);
        addView(l5Var2, k7.c6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        l5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kq0
            public final /* synthetic */ yp0 b;

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
