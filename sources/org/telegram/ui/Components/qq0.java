package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class qq0 extends dr0 {
    public final /* synthetic */ er0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq0(er0 er0Var, Context context) {
        super(context);
        this.r = er0Var;
        final int i10 = 1;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.h6.O5;
        int i12 = er0.b1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.c0(dp, er0Var.getThemedColor(i11)));
        addView(view, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ai.ic icVar = new ai.ic(this, context, 24);
        this.d = icVar;
        addView(icVar, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        int i13 = org.telegram.ui.ActionBar.h6.ng;
        j5Var.setTextColor(er0Var.getThemedColor(i13));
        j5Var.setTextSize(13);
        j5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        j5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        j5Var.setGravity(17);
        addView(j5Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        j5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cr0
            public final /* synthetic */ qq0 b;

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
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.b = j5Var2;
        j5Var2.setTextColor(er0Var.getThemedColor(i13));
        j5Var2.setTextSize(13);
        j5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        j5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        j5Var2.setGravity(17);
        addView(j5Var2, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        j5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.cr0
            public final /* synthetic */ qq0 b;

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
