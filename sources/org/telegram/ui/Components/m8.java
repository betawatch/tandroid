package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final org.telegram.ui.ActionBar.g1 b;
    public final l8 c;
    public long d;
    public final y80 e;

    public m8(Context context, qg0 qg0Var, final l8 l8Var, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z10 ? R.drawable.popup_fixed_alert : 0, 0, context, c6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = l8Var;
        if (qg0Var != null) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, c6Var).setOnClickListener(new j8(qg0Var, 0));
        }
        final int i11 = 0;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, c6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k8
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        l8Var.T0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        l8Var.T0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        l8Var.T0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        l8Var.T0(0, 71);
                        break;
                }
            }
        });
        final int i12 = 1;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, c6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k8
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        l8Var.T0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        l8Var.T0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        l8Var.T0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        l8Var.T0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 2;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, c6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k8
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        l8Var.T0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        l8Var.T0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        l8Var.T0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        l8Var.T0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, c6Var).setOnClickListener(new ih.u3(this, context, i10, c6Var, l8Var));
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, c6Var);
        this.b = c3;
        final int i14 = 3;
        c3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k8
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        l8Var.T0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        l8Var.T0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        l8Var.T0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        l8Var.T0(0, 71);
                        break;
                }
            }
        });
        if (i10 != 1) {
            int i15 = org.telegram.ui.ActionBar.g6.q7;
            c3.c(org.telegram.ui.ActionBar.g6.w0(null, i15, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.g6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.b7, c6Var)));
            frameLayout.addView(view, i7.f6.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, i7.f6.n(-1, 8));
            y80 y80Var = new y80(context, null);
            this.e = y80Var;
            y80Var.setTag(R.id.fit_width_tag, 1);
            y80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            y80Var.setTextSize(1, 13.0f);
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
            y80Var.setMovementMethod(LinkMovementMethod.getInstance());
            y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            y80Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(y80Var, i7.f6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new i8(this, i10, 0));
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
