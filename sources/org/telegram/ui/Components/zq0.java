package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class zq0 extends mr0 {
    public final /* synthetic */ nr0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq0(nr0 nr0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.u6 u6Var2;
        org.telegram.ui.ActionBar.u6 u6Var3;
        this.r = nr0Var;
        final int i10 = 1;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.y6.O5;
        int i12 = nr0.Z0;
        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, nr0Var.getThemedColor(i11));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        u6Var = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
        view.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(view, c02, N, null, u6Var);
        addView(view, kb1.h(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        bi.cc ccVar = new bi.cc(this, context, 23);
        this.d = ccVar;
        addView(ccVar, kb1.h(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.c = b6Var;
        int i13 = org.telegram.ui.ActionBar.y6.ng;
        u6Var2 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i13, u6Var2);
        b6Var.setTextSize(13);
        b6Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        b6Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        b6Var.setGravity(17);
        addView(b6Var, kb1.h(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        b6Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lr0
            public final /* synthetic */ zq0 b;

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
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.b = b6Var2;
        u6Var3 = ((org.telegram.ui.ActionBar.k3) nr0Var).resourcesProvider;
        org.telegram.ui.ActionBar.f7.Y(b6Var2, i13, u6Var3);
        b6Var2.setTextSize(13);
        b6Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        b6Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        b6Var2.setGravity(17);
        addView(b6Var2, kb1.h(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        b6Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.lr0
            public final /* synthetic */ zq0 b;

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
