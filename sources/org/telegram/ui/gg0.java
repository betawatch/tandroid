package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class gg0 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ hg0 d;

    public gg0(hg0 hg0Var, Context context) {
        this.d = hg0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        hg0 hg0Var = this.d;
        return b10 == hg0Var.c || b10 == hg0Var.d || b10 == hg0Var.e || b10 == hg0Var.f || b10 == hg0Var.h || b10 == hg0Var.r;
    }

    @Override // f2.r0
    public final int h() {
        return this.d.v;
    }

    @Override // f2.r0
    public final int j(int i9) {
        hg0 hg0Var = this.d;
        hg0Var.getClass();
        if (i9 == 0) {
            return 0;
        }
        if (i9 == hg0Var.c || i9 == hg0Var.d || i9 == hg0Var.e || i9 == hg0Var.f || i9 == hg0Var.h) {
            return 1;
        }
        if (i9 == hg0Var.n) {
            return 2;
        }
        return i9 == hg0Var.r ? 3 : 4;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == 0) {
                m4Var.setText(LocaleController.getString(R.string.AlternativeOptions));
                return;
            }
            return;
        }
        hg0 hg0Var = this.d;
        if (i10 != 1) {
            if (i10 == 3) {
                org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
                if (i9 == hg0Var.r) {
                    baVar.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.p7, false));
                    baVar.b(LocaleController.getString(R.string.LogOutTitle), false);
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
            if (i9 == hg0Var.s) {
                b9Var.setText(LocaleController.getString(R.string.LogOutInfo));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        if (i9 == hg0Var.c) {
            a9Var.b(R.drawable.msg_contact_add, LocaleController.getString(R.string.AddAnotherAccount), LocaleController.getString(R.string.AddAnotherAccountInfo), true);
            return;
        }
        if (i9 == hg0Var.d) {
            a9Var.b(R.drawable.msg_permissions, LocaleController.getString(R.string.SetPasscode), LocaleController.getString(R.string.SetPasscodeInfo), true);
            return;
        }
        if (i9 == hg0Var.e) {
            a9Var.b(R.drawable.msg_clearcache, LocaleController.getString(R.string.ClearCache), LocaleController.getString(R.string.ClearCacheInfo), true);
        } else if (i9 == hg0Var.f) {
            a9Var.b(R.drawable.msg_newphone, LocaleController.getString(R.string.ChangePhoneNumber), LocaleController.getString(R.string.ChangePhoneNumberInfo), true);
        } else if (i9 == hg0Var.h) {
            a9Var.b(R.drawable.msg_help, LocaleController.getString(R.string.ContactSupport), LocaleController.getString(R.string.ContactSupportInfo), false);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        View view;
        Context context = this.c;
        if (i9 == 0) {
            FrameLayout m4Var = new org.telegram.ui.Cells.m4(context);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            frameLayout = m4Var;
        } else {
            if (i9 != 1) {
                if (i9 == 2) {
                    view = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                } else if (i9 != 3) {
                    view = new org.telegram.ui.Cells.b9(context);
                    view.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.b7));
                } else {
                    FrameLayout baVar = new org.telegram.ui.Cells.ba(context);
                    baVar.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
                    frameLayout = baVar;
                }
                return j3.r0.s(view, view, -1, -2);
            }
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setMultilineDetail(true);
            a9Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            frameLayout = a9Var;
        }
        view = frameLayout;
        return j3.r0.s(view, view, -1, -2);
    }
}
