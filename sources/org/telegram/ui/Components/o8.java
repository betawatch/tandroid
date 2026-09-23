package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final org.telegram.ui.ActionBar.f1 b;
    public final n8 c;
    public long d;
    public final d90 e;

    public o8(Context context, vg0 vg0Var, final n8 n8Var, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z10 ? R.drawable.popup_fixed_alert : 0, 0, context, d6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = n8Var;
        if (vg0Var != null) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, d6Var).setOnClickListener(new l8(vg0Var, 0));
        }
        final int i11 = 0;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, d6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m8
            public final /* synthetic */ o8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        n8Var.U0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        n8Var.U0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        n8Var.U0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        n8Var.U0(0, 71);
                        break;
                }
            }
        });
        final int i12 = 1;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, d6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m8
            public final /* synthetic */ o8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        n8Var.U0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        n8Var.U0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        n8Var.U0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        n8Var.U0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 2;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, d6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m8
            public final /* synthetic */ o8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        n8Var.U0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        n8Var.U0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        n8Var.U0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        n8Var.U0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, d6Var).setOnClickListener(new ai.o5(this, context, i10, d6Var, n8Var));
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, d6Var);
        this.b = c10;
        final int i14 = 3;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.m8
            public final /* synthetic */ o8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        n8Var.U0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        n8Var.U0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        n8Var.U0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        n8Var.U0(0, 71);
                        break;
                }
            }
        });
        if (i10 != 1) {
            int i15 = org.telegram.ui.ActionBar.h6.q7;
            c10.c(org.telegram.ui.ActionBar.h6.w0(null, i15, false), org.telegram.ui.ActionBar.h6.w0(null, i15, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H8, d6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.h6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.b7, d6Var)));
            frameLayout.addView(view, w7.x5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.x5.n(-1, 8));
            d90 d90Var = new d90(context, null);
            this.e = d90Var;
            d90Var.setTag(R.id.fit_width_tag, 1);
            d90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            d90Var.setTextSize(1, 13.0f);
            d90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.E8, false));
            d90Var.setMovementMethod(LinkMovementMethod.getInstance());
            d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J6, false));
            d90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(d90Var, w7.x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new ai.o8(this, i10, 29));
            return;
        }
        org.telegram.ui.ActionBar.f1 f1Var = this.b;
        if (i10 == 0) {
            f1Var.setVisibility(8);
        } else {
            f1Var.setVisibility(0);
        }
    }
}
