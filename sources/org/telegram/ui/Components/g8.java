package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final org.telegram.ui.ActionBar.f1 b;
    public final f8 c;
    public long d;
    public final p80 e;

    public g8(Context context, hg0 hg0Var, final f8 f8Var, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z10 ? R.drawable.popup_fixed_alert : 0, 0, context, c6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = f8Var;
        if (hg0Var != null) {
            org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, c6Var).setOnClickListener(new d8(hg0Var, 0));
        }
        final int i11 = 0;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, c6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e8
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.a();
                        f8Var.V0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        f8Var.V0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        f8Var.V0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        f8Var.V0(0, 71);
                        break;
                }
            }
        });
        final int i12 = 1;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, c6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e8
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        f8Var.V0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        f8Var.V0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        f8Var.V0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        f8Var.V0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 2;
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, c6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e8
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        f8Var.V0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        f8Var.V0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        f8Var.V0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        f8Var.V0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, c6Var).setOnClickListener(new gh.a4(this, context, i10, c6Var, f8Var));
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, c6Var);
        this.b = c10;
        final int i14 = 3;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.e8
            public final /* synthetic */ g8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        f8Var.V0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        f8Var.V0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        f8Var.V0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        f8Var.V0(0, 71);
                        break;
                }
            }
        });
        if (i10 != 1) {
            int i15 = org.telegram.ui.ActionBar.g6.q7;
            c10.c(org.telegram.ui.ActionBar.g6.w0(null, i15, false), org.telegram.ui.ActionBar.g6.w0(null, i15, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H8, c6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.g6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.b7, c6Var)));
            frameLayout.addView(view, h7.z5.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, h7.z5.n(-1, 8));
            p80 p80Var = new p80(context, null);
            this.e = p80Var;
            p80Var.setTag(R.id.fit_width_tag, 1);
            p80Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            p80Var.setTextSize(1, 13.0f);
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E8, false));
            p80Var.setMovementMethod(LinkMovementMethod.getInstance());
            p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J6, false));
            p80Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(p80Var, h7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new cg.w1(this, i10, 27));
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
