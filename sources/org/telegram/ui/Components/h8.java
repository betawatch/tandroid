package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final org.telegram.ui.ActionBar.g1 b;
    public final g8 c;
    public long d;
    public final g90 e;

    public h8(Context context, ch0 ch0Var, final g8 g8Var, boolean z4, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z4 ? R.drawable.popup_fixed_alert : 0, 0, context, g6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = g8Var;
        if (ch0Var != null) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, g6Var).setOnClickListener(new e8(ch0Var, 0));
        }
        final int i11 = 0;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, g6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f8
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        g8Var.Q0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        g8Var.Q0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        g8Var.Q0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        g8Var.Q0(0, 71);
                        break;
                }
            }
        });
        final int i12 = 1;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, g6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f8
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        g8Var.Q0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        g8Var.Q0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        g8Var.Q0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        g8Var.Q0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 2;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, g6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f8
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        g8Var.Q0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        g8Var.Q0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        g8Var.Q0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        g8Var.Q0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, g6Var).setOnClickListener(new lh.u3(this, context, i10, g6Var, g8Var));
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, g6Var);
        this.b = c3;
        final int i14 = 3;
        c3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f8
            public final /* synthetic */ h8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        g8Var.Q0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        g8Var.Q0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        g8Var.Q0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        g8Var.Q0(0, 71);
                        break;
                }
            }
        });
        if (i10 != 1) {
            int i15 = org.telegram.ui.ActionBar.k6.q7;
            c3.c(org.telegram.ui.ActionBar.k6.w0(null, i15, false), org.telegram.ui.ActionBar.k6.w0(null, i15, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H8, g6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.k6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.b7, g6Var)));
            frameLayout.addView(view, k7.c6.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, k7.c6.n(-1, 8));
            g90 g90Var = new g90(context, null);
            this.e = g90Var;
            g90Var.setTag(R.id.fit_width_tag, 1);
            g90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            g90Var.setTextSize(1, 13.0f);
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.E8, false));
            g90Var.setMovementMethod(LinkMovementMethod.getInstance());
            g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.J6, false));
            g90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(g90Var, k7.c6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new af.b(this, i10, 27));
            return;
        }
        org.telegram.ui.ActionBar.g1 g1Var = this.b;
        if (i10 == 0) {
            g1Var.setVisibility(8);
        } else {
            g1Var.setVisibility(0);
        }
    }
}
