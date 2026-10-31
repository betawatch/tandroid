package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n71 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ ThemeActivity a;

    public n71(ThemeActivity themeActivity) {
        this.a = themeActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    @Override // org.telegram.ui.ActionBar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        if (i10 == -1) {
            this.a.finishFragment();
            return;
        }
        if (i10 == 1) {
            this.a.A0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.ActionBar.r6 k10 = org.telegram.ui.ActionBar.t6.D0().k(false);
            if (k10.r == null) {
                this.a.getMessagesController().v4(k10.b, k10);
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.s4, k10.b, k10);
                return;
            }
            String str = "https://" + this.a.getMessagesController().U2 + "/addtheme/" + k10.r.slug;
            this.a.showDialog(new org.telegram.ui.Components.op0(this.a.getParentActivity(), null, str, false, str, false, null));
            return;
        }
        if (i10 == 3) {
            this.a.B0();
            return;
        }
        if (i10 == 4) {
            if (this.a.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a.getParentActivity());
            alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131744171, "ThemeResetToDefaultsTitle");
            alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131744172, "ThemeResetToDefaultsText");
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746135, "Reset"), new tj0(this, 19));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            this.a.showDialog(x1Var);
            TextView textView = (TextView) x1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                return;
            }
            return;
        }
        if (i10 == 5) {
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
            String str2 = "Blue";
            String string = sharedPreferences.getString("lastDayTheme", "Blue");
            if (org.telegram.ui.ActionBar.t6.Q0(string) == null || org.telegram.ui.ActionBar.t6.Q0(string).q()) {
                string = "Blue";
            }
            String str3 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            if (org.telegram.ui.ActionBar.t6.Q0(string2) == null || !org.telegram.ui.ActionBar.t6.Q0(string2).q()) {
                string2 = "Dark Blue";
            }
            org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
            if (!string.equals(string2)) {
                str3 = string2;
            } else if (s6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
                boolean equals = str2.equals(s6Var.m());
                org.telegram.ui.ActionBar.s6 Q0 = !equals ? org.telegram.ui.ActionBar.t6.Q0(str3) : org.telegram.ui.ActionBar.t6.Q0(str2);
                int[] iArr = {(this.a.s.getIconView().getMeasuredWidth() / 2) + r9, (this.a.s.getIconView().getMeasuredHeight() / 2) + r9};
                this.a.s.getIconView().getLocationInWindow(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, Q0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), this.a.s.getIconView());
                this.a.E0(true);
                org.telegram.ui.ActionBar.t6.M1(this.a);
            }
            str2 = string;
            boolean equals2 = str2.equals(s6Var.m());
            if (!equals2) {
            }
            int[] iArr2 = {(this.a.s.getIconView().getMeasuredWidth() / 2) + i11, (this.a.s.getIconView().getMeasuredHeight() / 2) + i12};
            this.a.s.getIconView().getLocationInWindow(iArr2);
            int i112 = iArr2[0];
            int i122 = iArr2[1];
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.t4, Q0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(equals2), this.a.s.getIconView());
            this.a.E0(true);
            org.telegram.ui.ActionBar.t6.M1(this.a);
        }
    }
}
