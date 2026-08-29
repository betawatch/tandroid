package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gg0 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ hg0 d;

    public gg0(hg0 hg0Var, Context context) {
        this.d = hg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        hg0 hg0Var = this.d;
        return b10 == hg0Var.c || b10 == hg0Var.d || b10 == hg0Var.e || b10 == hg0Var.f || b10 == hg0Var.h || b10 == hg0Var.r;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.v;
    }

    @Override // f2.p0
    public final int j(int i10) {
        hg0 hg0Var = this.d;
        hg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == hg0Var.c || i10 == hg0Var.d || i10 == hg0Var.e || i10 == hg0Var.f || i10 == hg0Var.h) {
            return 1;
        }
        if (i10 == hg0Var.n) {
            return 2;
        }
        return i10 == hg0Var.r ? 3 : 4;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 == 0) {
                k4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        hg0 hg0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
                if (i10 == hg0Var.r) {
                    y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                    y9Var.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == hg0Var.s) {
                y8Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
        if (i10 == hg0Var.c) {
            x8Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == hg0Var.d) {
            x8Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == hg0Var.e) {
            x8Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == hg0Var.f) {
            x8Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == hg0Var.h) {
            x8Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        View view;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout k4Var = new org.telegram.ui.Cells.k4(context);
            k4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = k4Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.x6(context, (b) null);
                } else if (i10 != 3) {
                    view = new org.telegram.ui.Cells.y8(context);
                    view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                } else {
                    FrameLayout y9Var = new org.telegram.ui.Cells.y9(context);
                    y9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    frameLayout = y9Var;
                }
                return th.m(view, view, -1, -2);
            }
            org.telegram.ui.Cells.x8 x8Var = new org.telegram.ui.Cells.x8(context);
            x8Var.setMultilineDetail(true);
            x8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = x8Var;
        }
        view = frameLayout;
        return th.m(view, view, -1, -2);
    }
}
