package org.telegram.ui.Components;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r8 {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout a;
    public final org.telegram.ui.ActionBar.g1 b;
    public final q8 c;
    public long d;
    public final aa0 e;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r8(Context context, th0 th0Var, final q8 q8Var, boolean z10, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        int i11;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(z10 ? R.drawable.popup_fixed_alert : 0, 0, context, u6Var);
        this.a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        this.c = q8Var;
        if (th0Var != null) {
            org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, u6Var).setOnClickListener(new o8(th0Var, 0));
        }
        final int i12 = 0;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1d, LocaleController.getString(R.string.AutoDelete1Day), false, u6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p8
            public final /* synthetic */ r8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.a();
                        q8Var.T0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        q8Var.T0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        q8Var.T0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        q8Var.T0(0, 71);
                        break;
                }
            }
        });
        final int i13 = 1;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1w, LocaleController.getString(R.string.AutoDelete7Days), false, u6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p8
            public final /* synthetic */ r8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.a();
                        q8Var.T0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        q8Var.T0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        q8Var.T0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        q8Var.T0(0, 71);
                        break;
                }
            }
        });
        final int i14 = 2;
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_autodelete_1m, LocaleController.getString(R.string.AutoDelete1Month), false, u6Var).setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p8
            public final /* synthetic */ r8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.b.a();
                        q8Var.T0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        q8Var.T0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        q8Var.T0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        q8Var.T0(0, 71);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_customize, i10 == 1 ? LocaleController.getString(R.string.AutoDeleteCustom2) : LocaleController.getString(R.string.AutoDeleteCustom), false, u6Var).setOnClickListener(new di.c4(this, context, i10, u6Var, q8Var));
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_disable, LocaleController.getString(R.string.AutoDeleteDisable), false, u6Var);
        this.b = c10;
        final int i15 = 3;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.Components.p8
            public final /* synthetic */ r8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.b.a();
                        q8Var.T0(86400, 70);
                        break;
                    case 1:
                        this.b.a();
                        q8Var.T0(604800, 70);
                        break;
                    case 2:
                        this.b.a();
                        q8Var.T0(2678400, 70);
                        break;
                    default:
                        this.b.a();
                        q8Var.T0(0, 71);
                        break;
                }
            }
        });
        if (i10 != 1) {
            if (u6Var != null) {
                int i16 = org.telegram.ui.ActionBar.y6.q7;
                f2 f2Var = new f2(18);
                f2 f2Var2 = new f2(19);
                int Q = org.telegram.ui.ActionBar.f7.Q(i16, -1, 0, 0.0f, null);
                f2Var2.d(Q, c10);
                org.telegram.ui.ActionBar.z6 x9 = org.telegram.ui.ActionBar.f7.x(100, c10);
                x9.c(i16, -1, 0, 0.0f, null);
                x9.n = f2Var;
                x9.o = f2Var2;
                x9.m = false;
                x9.g = Q;
                i11 = 1;
                if (i10 == i11) {
                    FrameLayout frameLayout = new FrameLayout(context);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.H8, frameLayout, u6Var);
                    View view = new View(context);
                    org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider, org.telegram.ui.ActionBar.y6.b7, context, view, u6Var);
                    frameLayout.addView(view, kb1.g(-1.0f, -1));
                    frameLayout.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, kb1.r(-1, 8));
                    aa0 aa0Var = new aa0(context, null);
                    this.e = aa0Var;
                    aa0Var.setTag(R.id.fit_width_tag, 1);
                    aa0Var.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                    aa0Var.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.E8, null);
                    aa0Var.setMovementMethod(LinkMovementMethod.getInstance());
                    org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.J6, null);
                    aa0Var.setText(LocaleController.getString(R.string.AutoDeletePopupDescription));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(aa0Var, kb1.t(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                    return;
                }
                return;
            }
            int i17 = org.telegram.ui.ActionBar.y6.q7;
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
            AndroidUtilities.runOnUIThread(new h2(this, i10, 2));
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
