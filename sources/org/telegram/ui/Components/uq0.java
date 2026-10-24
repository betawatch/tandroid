package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class uq0 extends hr0 {
    public final /* synthetic */ ir0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(ir0 ir0Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        org.telegram.ui.ActionBar.g6 g6Var3;
        this.r = ir0Var;
        final int i10 = 1;
        this.h = new Paint(1);
        this.n = new RectF();
        View view = new View(context);
        this.a = view;
        int dp = AndroidUtilities.dp(18.0f);
        int i11 = org.telegram.ui.ActionBar.k6.O5;
        int i12 = ir0.d1;
        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, ir0Var.getThemedColor(i11));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        g6Var = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
        view.setBackground(c02);
        org.telegram.ui.ActionBar.r6.k(view, c02, O, null, g6Var);
        addView(view, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        ai.jc jcVar = new ai.jc(this, context, 23);
        this.d = jcVar;
        addView(jcVar, w7.z5.d(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var;
        int i13 = org.telegram.ui.ActionBar.k6.ng;
        g6Var2 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.Z(n5Var, i13, g6Var2);
        n5Var.setTextSize(13);
        n5Var.setLeftDrawable(R.drawable.msg_tabs_mic1);
        final int i14 = 0;
        n5Var.l(LocaleController.getString(R.string.VoipGroupInviteCanSpeak), false);
        n5Var.setGravity(17);
        addView(n5Var, w7.z5.d(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
        n5Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gr0
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
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.b = n5Var2;
        g6Var3 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
        org.telegram.ui.ActionBar.r6.Z(n5Var2, i13, g6Var3);
        n5Var2.setTextSize(13);
        n5Var2.setLeftDrawable(R.drawable.msg_tabs_mic2);
        n5Var2.l(LocaleController.getString(R.string.VoipGroupInviteListenOnly), false);
        n5Var2.setGravity(17);
        addView(n5Var2, w7.z5.d(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
        n5Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.gr0
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
