package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class m8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final org.telegram.ui.ActionBar.f1 b;
    public final l8 c;
    public long d;
    public final c90 e;

    public m8(Context context, ug0 ug0Var, final l8 l8Var, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z10 ? R.drawable.popup_fixed_alert : 0, 0, context, e6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = l8Var;
        if (ug0Var != null) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, e6Var).setOnClickListener(new j8(ug0Var, 0));
        }
        final int i11 = 0;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, e6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k8
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        l8Var.U0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        l8Var.U0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        l8Var.U0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        l8Var.U0(0, 71);
                        break;
                }
            }
        });
        final int i12 = 1;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, e6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k8
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        l8Var.U0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        l8Var.U0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        l8Var.U0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        l8Var.U0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 2;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, e6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k8
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        l8Var.U0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        l8Var.U0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        l8Var.U0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        l8Var.U0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, e6Var).setOnClickListener(new ai.p5(this, context, i10, e6Var, l8Var));
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, e6Var);
        this.b = c10;
        final int i14 = 3;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.k8
            public final /* synthetic */ m8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        l8Var.U0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        l8Var.U0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        l8Var.U0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        l8Var.U0(0, 71);
                        break;
                }
            }
        });
        if (i10 != 1) {
            int i15 = org.telegram.ui.ActionBar.i6.q7;
            c10.c(org.telegram.ui.ActionBar.i6.w0(null, i15, false), org.telegram.ui.ActionBar.i6.w0(null, i15, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.H8, e6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.i6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.b7, e6Var)));
            frameLayout.addView(view, w7.x5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.x5.n(-1, 8));
            c90 c90Var = new c90(context, null);
            this.e = c90Var;
            c90Var.setTag(R.id.fit_width_tag, 1);
            c90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            c90Var.setTextSize(1, 13.0f);
            c90Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.E8, false));
            c90Var.setMovementMethod(LinkMovementMethod.getInstance());
            c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.J6, false));
            c90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(c90Var, w7.x5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new ai.n8(this, i10, 29));
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
