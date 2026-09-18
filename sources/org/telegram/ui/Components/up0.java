package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class up0 extends hq0 {
    public final /* synthetic */ iq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up0(iq0 iq0Var, Context context) {
        super(context);
        this.n = iq0Var;
        final int i10 = 1;
        this.f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.j6.O5;
        int i12 = iq0.a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(dp, iq0Var.getThemedColor(i11)));
        addView(view, w7.x5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ci.eb ebVar = new ci.eb(this, context, 23);
        this.c = ebVar;
        addView(ebVar, w7.x5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var;
        int i13 = org.telegram.ui.ActionBar.j6.ng;
        k5Var.setTextColor(iq0Var.getThemedColor(i13));
        k5Var.setTextSize(13);
        k5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        k5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        k5Var.setGravity(17);
        addView(k5Var, w7.x5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        k5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gq0
            public final /* synthetic */ up0 b;

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
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var2;
        k5Var2.setTextColor(iq0Var.getThemedColor(i13));
        k5Var2.setTextSize(13);
        k5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        k5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        k5Var2.setGravity(17);
        addView(k5Var2, w7.x5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        k5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gq0
            public final /* synthetic */ up0 b;

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
