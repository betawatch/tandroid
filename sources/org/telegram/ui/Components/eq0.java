package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class eq0 extends rq0 {
    public final /* synthetic */ sq0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq0(sq0 sq0Var, Context context) {
        super(context);
        this.n = sq0Var;
        final int i10 = 1;
        this.f = new Paint(1);
        this.h = new RectF();
        View view = new View(context);
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.j6.O5;
        int i12 = sq0.a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.b0(dp, sq0Var.getThemedColor(i11)));
        addView(view, w7.a6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.nc ncVar = new bi.nc(this, context, 23);
        this.c = ncVar;
        addView(ncVar, w7.a6.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.b = l5Var;
        int i13 = org.telegram.ui.ActionBar.j6.ng;
        l5Var.setTextColor(sq0Var.getThemedColor(i13));
        l5Var.setTextSize(13);
        l5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        l5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        l5Var.setGravity(17);
        addView(l5Var, w7.a6.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        l5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qq0
            public final /* synthetic */ eq0 b;

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
        l5Var2.setTextColor(sq0Var.getThemedColor(i13));
        l5Var2.setTextSize(13);
        l5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        l5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        l5Var2.setGravity(17);
        addView(l5Var2, w7.a6.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        l5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.qq0
            public final /* synthetic */ eq0 b;

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
