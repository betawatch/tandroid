package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ig0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ jg0 d;

    public ig0(jg0 jg0Var, Context context) {
        this.d = jg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        jg0 jg0Var = this.d;
        return b10 == jg0Var.c || b10 == jg0Var.d || b10 == jg0Var.e || b10 == jg0Var.f || b10 == jg0Var.h || b10 == jg0Var.r;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.v;
    }

    @Override // s4.h0
    public final int j(int i10) {
        jg0 jg0Var = this.d;
        jg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == jg0Var.c || i10 == jg0Var.d || i10 == jg0Var.e || i10 == jg0Var.f || i10 == jg0Var.h) {
            return 1;
        }
        if (i10 == jg0Var.n) {
            return 2;
        }
        return i10 == jg0Var.r ? 3 : 4;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (i10 == 0) {
                q4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        jg0 jg0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
                if (i10 == jg0Var.r) {
                    org.telegram.ui.ActionBar.f7.V(gaVar.getTextView(), org.telegram.ui.ActionBar.y6.p7, null);
                    gaVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            if (i10 == jg0Var.s) {
                i9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.h9 h9Var = (org.telegram.ui.Cells.h9) view;
        if (i10 == jg0Var.c) {
            h9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == jg0Var.d) {
            h9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == jg0Var.e) {
            h9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == jg0Var.f) {
            h9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == jg0Var.h) {
            h9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        Context context = this.c;
        if (i10 == 0) {
            View q4Var = new org.telegram.ui.Cells.q4(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, q4Var, null);
            view = q4Var;
        } else if (i10 == 1) {
            org.telegram.ui.Cells.h9 h9Var = new org.telegram.ui.Cells.h9(context);
            h9Var.setMultilineDetail(true);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, h9Var, null);
            view = h9Var;
        } else if (i10 == 2) {
            view = new org.telegram.ui.Cells.f7(context, (d3) null);
        } else {
            if (i10 != 3) {
                view2 = new org.telegram.ui.Cells.i9(context);
                return ic.a.n(view2, view2, -1, -2);
            }
            View gaVar = new org.telegram.ui.Cells.ga(context);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, gaVar, null);
            view = gaVar;
        }
        view2 = view;
        return ic.a.n(view2, view2, -1, -2);
    }
}
