package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class p8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final org.telegram.ui.ActionBar.e1 b;
    public final o8 c;
    public long d;
    public final y90 e;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p8(Context context, th0 th0Var, final o8 o8Var, boolean z10, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z10 ? R.drawable.popup_fixed_alert : 0, 0, context, g6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = o8Var;
        if (th0Var != null) {
            org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, g6Var).setOnClickListener(new m8(th0Var, 0));
        }
        final int i12 = 0;
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, g6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n8
            public final /* synthetic */ p8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        o8Var.H0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        o8Var.H0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        o8Var.H0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        o8Var.H0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 1;
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, g6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n8
            public final /* synthetic */ p8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        o8Var.H0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        o8Var.H0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        o8Var.H0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        o8Var.H0(0, 71);
                        break;
                }
            }
        });
        final int i14 = 2;
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, g6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n8
            public final /* synthetic */ p8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        o8Var.H0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        o8Var.H0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        o8Var.H0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        o8Var.H0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, g6Var).setOnClickListener(new ci.b4(this, context, i10, g6Var, o8Var));
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, g6Var);
        this.b = c10;
        final int i15 = 3;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.n8
            public final /* synthetic */ p8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        o8Var.H0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        o8Var.H0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        o8Var.H0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        o8Var.H0(0, 71);
                        break;
                }
            }
        });
        if (i10 != 1) {
            if (g6Var != null) {
                int i16 = org.telegram.ui.ActionBar.k6.q7;
                e2 e2Var = new e2(14);
                e2 e2Var2 = new e2(15);
                int R = org.telegram.ui.ActionBar.r6.R(i16, -1, 0, 0.0f, null);
                e2Var2.d(R, c10);
                org.telegram.ui.ActionBar.l6 y3 = org.telegram.ui.ActionBar.r6.y(100, c10);
                y3.c(i16, -1, 0, 0.0f, null);
                y3.n = e2Var;
                y3.o = e2Var2;
                y3.m = false;
                y3.g = R;
                i11 = 1;
                if (i10 == i11) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.H8, frameLayout, g6Var);
                    View view = new View(context);
                    org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7, context, view, g6Var);
                    frameLayout.addView(view, w7.z5.c(-1.0f, -1));
                    frameLayout.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, w7.z5.n(-1, 8));
                    y90 y90Var = new y90(context, null);
                    this.e = y90Var;
                    y90Var.setTag(R.id.fit_width_tag, 1);
                    y90Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                    y90Var.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.W(y90Var, org.telegram.ui.ActionBar.k6.E8, null);
                    y90Var.setMovementMethod(LinkMovementMethod.getInstance());
                    org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.J6, null);
                    y90Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(y90Var, w7.z5.p(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    return;
                }
                return;
            }
            int i17 = org.telegram.ui.ActionBar.k6.q7;
            c10.c(i17, i17);
        }
        i11 = 1;
        if (i10 == i11) {
        }
    }

    public final void a() {
        this.c.dismiss();
        this.d = System.currentTimeMillis();
    }

    public final void b(int i10) {
        if (System.currentTimeMillis() - this.d < 200) {
            AndroidUtilities.runOnUIThread(new d2(this, i10, 2));
            return;
        }
        org.telegram.ui.ActionBar.e1 e1Var = this.b;
        if (i10 == 0) {
            e1Var.setVisibility(8);
        } else {
            e1Var.setVisibility(0);
        }
    }
}
