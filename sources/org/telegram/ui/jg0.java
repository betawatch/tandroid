package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class jg0 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ kg0 d;

    public jg0(kg0 kg0Var, Context context) {
        this.d = kg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int b10 = o1Var.b();
        kg0 kg0Var = this.d;
        return b10 == kg0Var.c || b10 == kg0Var.d || b10 == kg0Var.e || b10 == kg0Var.f || b10 == kg0Var.h || b10 == kg0Var.r;
    }

    @Override // f2.q0
    public final int h() {
        return this.d.v;
    }

    @Override // f2.q0
    public final int j(int i10) {
        kg0 kg0Var = this.d;
        kg0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == kg0Var.c || i10 == kg0Var.d || i10 == kg0Var.e || i10 == kg0Var.f || i10 == kg0Var.h) {
            return 1;
        }
        if (i10 == kg0Var.n) {
            return 2;
        }
        return i10 == kg0Var.r ? 3 : 4;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == 0) {
                j4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        kg0 kg0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
                if (i10 == kg0Var.r) {
                    x9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.p7, false));
                    x9Var.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == kg0Var.s) {
                x8Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
        if (i10 == kg0Var.c) {
            w8Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == kg0Var.d) {
            w8Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == kg0Var.e) {
            w8Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == kg0Var.f) {
            w8Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == kg0Var.h) {
            w8Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        View view;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout j4Var = new org.telegram.ui.Cells.j4(context);
            j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = j4Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
                } else if (i10 != 3) {
                    view = new org.telegram.ui.Cells.x8(context);
                    view.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.b7));
                } else {
                    FrameLayout x9Var = new org.telegram.ui.Cells.x9(context);
                    x9Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
                    frameLayout = x9Var;
                }
                return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
            }
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            w8Var.setMultilineDetail(true);
            w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            frameLayout = w8Var;
        }
        view = frameLayout;
        return org.telegram.ui.Cells.pa.l(view, view, -1, -2);
    }
}
