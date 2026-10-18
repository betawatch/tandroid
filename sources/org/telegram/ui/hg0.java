package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class hg0 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ ig0 d;

    public hg0(ig0 ig0Var, Context context) {
        this.d = ig0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        ig0 ig0Var = this.d;
        return b10 == ig0Var.c || b10 == ig0Var.d || b10 == ig0Var.e || b10 == ig0Var.f || b10 == ig0Var.h || b10 == ig0Var.r;
    }

    @Override // s4.g0
    public final int h() {
        return this.d.v;
    }

    @Override // s4.g0
    public final int j(int i10) {
        ig0 ig0Var = this.d;
        ig0Var.getClass();
        if (i10 == 0) {
            return 0;
        }
        if (i10 == ig0Var.c || i10 == ig0Var.d || i10 == ig0Var.e || i10 == ig0Var.f || i10 == ig0Var.h) {
            return 1;
        }
        if (i10 == ig0Var.n) {
            return 2;
        }
        return i10 == ig0Var.r ? 3 : 4;
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
        ig0 ig0Var = this.d;
        if (i11 != 1) {
            if (i11 == 3) {
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                if (i10 == ig0Var.r) {
                    baVar.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.p7, false));
                    baVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i11 != 4) {
                return;
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == ig0Var.s) {
                d9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
        if (i10 == ig0Var.c) {
            c9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i10 == ig0Var.d) {
            c9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i10 == ig0Var.e) {
            c9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i10 == ig0Var.f) {
            c9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i10 == ig0Var.h) {
            c9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        View view;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout l4Var = new org.telegram.ui.Cells.l4(context);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = l4Var;
        } else {
            if (i10 != 1) {
                if (i10 == 2) {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                } else if (i10 != 3) {
                    view = new org.telegram.ui.Cells.d9(context);
                    view.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.b7));
                } else {
                    FrameLayout baVar = new org.telegram.ui.Cells.ba(context);
                    baVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
                    frameLayout = baVar;
                }
                return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
            }
            org.telegram.ui.Cells.c9 c9Var = new org.telegram.ui.Cells.c9(context);
            c9Var.setMultilineDetail(true);
            c9Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            frameLayout = c9Var;
        }
        view = frameLayout;
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
