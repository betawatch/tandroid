package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pg0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ qg0 d;

    public pg0(qg0 qg0Var, Context context) {
        this.d = qg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        qg0 qg0Var = this.d;
        return b10 == qg0Var.c || b10 == qg0Var.d || b10 == qg0Var.e || b10 == qg0Var.f || b10 == qg0Var.h || b10 == qg0Var.r;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.v;
    }

    @Override // f2.p0
    public final int j(int i10) {
        qg0 qg0Var = this.d;
        qg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == qg0Var.c || i10 == qg0Var.d || i10 == qg0Var.e || i10 == qg0Var.f || i10 == qg0Var.h) {
            return 1;
        }
        if (i10 == qg0Var.n) {
            return 2;
        }
        return i10 == qg0Var.r ? 3 : 4;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        qg0 qg0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                if (i10 == qg0Var.r) {
                    aaVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.p7, false));
                    aaVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == qg0Var.s) {
                a9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i10 == qg0Var.c) {
            z8Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == qg0Var.d) {
            z8Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == qg0Var.e) {
            z8Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == qg0Var.f) {
            z8Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == qg0Var.h) {
            z8Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        View view;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            frameLayout = m4Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.z6(context, (b) null);
                } else if (i10 != 3) {
                    view = new org.telegram.ui.Cells.a9(context);
                    view.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.b7));
                } else {
                    FrameLayout aaVar = new org.telegram.ui.Cells.aa(context);
                    aaVar.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
                    frameLayout = aaVar;
                }
                return yh.o(view, view, -1, -2);
            }
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setMultilineDetail(true);
            z8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            frameLayout = z8Var;
        }
        view = frameLayout;
        return yh.o(view, view, -1, -2);
    }
}
