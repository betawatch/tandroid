package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dp0 extends qp0 {
    public final /* synthetic */ rp0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp0(rp0 rp0Var, Context context) {
        super(context);
        this.n = rp0Var;
        final int i9 = 1;
        this.f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = org.telegram.ui.ActionBar.f6.O5;
        int i11 = rp0.W0;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.b0(dp, rp0Var.getThemedColor(i10)));
        addView(view, g7.e6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        fh.l2 l2Var = new fh.l2(this, context, 22);
        this.c = l2Var;
        addView(l2Var, g7.e6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var;
        int i12 = org.telegram.ui.ActionBar.f6.ng;
        h5Var.setTextColor(rp0Var.getThemedColor(i12));
        h5Var.setTextSize(13);
        h5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i13 = 0;
        h5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        h5Var.setGravity(17);
        addView(h5Var, g7.e6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        h5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pp0
            public final /* synthetic */ dp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
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
        h5Var2.setTextColor(rp0Var.getThemedColor(i12));
        h5Var2.setTextSize(13);
        h5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        h5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        h5Var2.setGravity(17);
        addView(h5Var2, g7.e6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        h5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.pp0
            public final /* synthetic */ dp0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i9) {
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
