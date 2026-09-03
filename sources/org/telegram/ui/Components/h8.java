package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class h8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final org.telegram.ui.ActionBar.g1 b;
    public final g8 c;
    public long d;
    public final f90 e;

    public h8(Context context, bh0 bh0Var, final g8 g8Var, boolean z4, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z4 ? R.drawable.popup_fixed_alert : 0, 0, context, f6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = g8Var;
        if (bh0Var != null) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, f6Var).setOnClickListener(new e8(bh0Var, 0));
        }
        final int i11 = 0;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, f6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f8
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
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, f6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f8
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
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, f6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.f8
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
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, f6Var).setOnClickListener(new kh.t3(this, context, i10, f6Var, g8Var));
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, f6Var);
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
            int i15 = org.telegram.ui.ActionBar.j6.q7;
            c3.c(org.telegram.ui.ActionBar.j6.w0(null, i15, false), org.telegram.ui.ActionBar.j6.w0(null, i15, false));
        }
        if (i10 != 1) {
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H8, f6Var));
            View view = new View(context);
            view.setBackground(org.telegram.ui.ActionBar.j6.U0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.b7, f6Var)));
            frameLayout.addView(view, k7.b6.c(-1.0f, -1));
            frameLayout.setTag(R.id.fit_width_tag, 1);
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, k7.b6.n(-1, 8));
            f90 f90Var = new f90(context, null);
            this.e = f90Var;
            f90Var.setTag(R.id.fit_width_tag, 1);
            f90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
            f90Var.setTextSize(1, 13.0f);
            f90Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E8, false));
            f90Var.setMovementMethod(LinkMovementMethod.getInstance());
            f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J6, false));
            f90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(f90Var, k7.b6.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
        }
    }

    public final void a() {
        this.c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new ah.b(this, i10, 26));
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
