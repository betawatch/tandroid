package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class kg0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ lg0 d;

    public kg0(lg0 lg0Var, Context context) {
        this.d = lg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        lg0 lg0Var = this.d;
        return b10 == lg0Var.c || b10 == lg0Var.d || b10 == lg0Var.e || b10 == lg0Var.f || b10 == lg0Var.h || b10 == lg0Var.r;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.v;
    }

    @Override // s4.g0
    public final int j(int i10) {
        lg0 lg0Var = this.d;
        lg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == lg0Var.c || i10 == lg0Var.d || i10 == lg0Var.e || i10 == lg0Var.f || i10 == lg0Var.h) {
            return 1;
        }
        if (i10 == lg0Var.n) {
            return 2;
        }
        return i10 == lg0Var.r ? 3 : 4;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        lg0 lg0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                if (i10 == lg0Var.r) {
                    org.telegram.ui.ActionBar.r6.W(caVar.getTextView(), org.telegram.ui.ActionBar.k6.p7, null);
                    caVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == lg0Var.s) {
                e9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
        if (i10 == lg0Var.c) {
            d9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == lg0Var.d) {
            d9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == lg0Var.e) {
            d9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == lg0Var.f) {
            d9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == lg0Var.h) {
            d9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            View l4Var = new org.telegram.ui.Cells.l4(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, l4Var, null);
            view = l4Var;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setMultilineDetail(true);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, d9Var, null);
            view = d9Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
        } else if (i10 != 3) {
            View e9Var = new org.telegram.ui.Cells.e9(context);
            org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7, context, e9Var, null);
            view = e9Var;
        } else {
            View caVar = new org.telegram.ui.Cells.ca(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, caVar, null);
            view = caVar;
        }
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
