package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yq0 extends lr0 {
    public final /* synthetic */ mr0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(mr0 mr0Var, Context context) {
        super(context);
        this.r = mr0Var;
        final int i10 = 1;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.i6.O5;
        int i12 = mr0.a1;
        view.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.c0(dp, mr0Var.getThemedColor(i11)));
        addView(view, w7.x5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        ci.bb bbVar = new ci.bb(this, context, 23);
        this.d = bbVar;
        addView(bbVar, w7.x5.a(36.0f, 14.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        int i13 = org.telegram.ui.ActionBar.i6.ng;
        j5Var.setTextColor(mr0Var.getThemedColor(i13));
        j5Var.setTextSize(13);
        j5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        j5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        j5Var.setGravity(17);
        addView(j5Var, w7.x5.a(-1.0f, 14.0f, 0.0f, 0.0f, 0.0f, -1, 51));
        j5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kr0
            public final /* synthetic */ yq0 b;

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
        j5Var2.setTextColor(mr0Var.getThemedColor(i13));
        j5Var2.setTextSize(13);
        j5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        j5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        j5Var2.setGravity(17);
        addView(j5Var2, w7.x5.a(-1.0f, 0.0f, 0.0f, 14.0f, 0.0f, -1, 51));
        j5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.kr0
            public final /* synthetic */ yq0 b;

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
