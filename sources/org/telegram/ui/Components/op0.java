package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class op0 extends cq0 {
    public final /* synthetic */ dq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op0(dq0 dq0Var, Context context) {
        super(context);
        this.n = dq0Var;
        final int i10 = 1;
        this.f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.g6.O5;
        int i12 = dq0.W0;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.b0(dp, dq0Var.getThemedColor(i11)));
        addView(view, i7.f6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        cg.h0 h0Var = new cg.h0(this, context, 20);
        this.c = h0Var;
        addView(h0Var, i7.f6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        int i13 = org.telegram.ui.ActionBar.g6.ng;
        h5Var.setTextColor(dq0Var.getThemedColor(i13));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, i7.f6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bq0
            public final /* synthetic */ op0 b;

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
        this.a = h5Var2;
        h5Var2.setTextColor(dq0Var.getThemedColor(i13));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, i7.f6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        h5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.bq0
            public final /* synthetic */ op0 b;

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
