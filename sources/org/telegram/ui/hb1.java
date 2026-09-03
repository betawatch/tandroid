package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.TextView;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hb1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ThemeActivity a;

    public hb1(ThemeActivity themeActivity) {
        this.a = themeActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        if (i10 == -1) {
            this.a.finishFragment();
            return;
        }
        if (i10 == 1) {
            this.a.w0();
            return;
        }
        if (i10 == 2) {
            org.telegram.ui.ActionBar.i6 k10 = org.telegram.ui.ActionBar.k6.A0().k(false);
            if (k10.r == null) {
                this.a.getMessagesController().saveThemeToServer(k10.b, k10);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, k10.b, k10);
                return;
            }
            String str = "https://" + this.a.getMessagesController().linkPrefix + "/addtheme/" + k10.r.slug;
            this.a.showDialog(new org.telegram.ui.Components.lq0(this.a.getParentActivity(), null, str, false, str, false, null));
            return;
        }
        if (i10 == 3) {
            this.a.x0();
            return;
        }
        if (i10 == 4) {
            if (this.a.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a.getParentActivity());
            alertDialog$Builder.a.O = LocaleController.getString("ThemeResetToDefaultsTitle", R.string.ThemeResetToDefaultsTitle);
            alertDialog$Builder.a.Q = LocaleController.getString("ThemeResetToDefaultsText", R.string.ThemeResetToDefaultsText);
            alertDialog$Builder.k(LocaleController.getString("Reset", R.string.Reset), new kl0(this, 20));
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            this.a.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.q7, false));
                return;
            }
            return;
        }
        if (i10 == 5) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str2 = "Blue";
            String string = sharedPreferences.getString("lastDayTheme", "Blue");
            if (org.telegram.ui.ActionBar.k6.N0(string) == null || org.telegram.ui.ActionBar.k6.N0(string).q()) {
                string = "Blue";
            }
            String str3 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            if (org.telegram.ui.ActionBar.k6.N0(string2) == null || !org.telegram.ui.ActionBar.k6.N0(string2).q()) {
                string2 = "Dark Blue";
            }
            org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
            if (!string.equals(string2)) {
                str3 = string2;
            } else if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
                boolean equals = str2.equals(j6Var.m());
                org.telegram.ui.ActionBar.j6 N0 = !equals ? org.telegram.ui.ActionBar.k6.N0(str3) : org.telegram.ui.ActionBar.k6.N0(str2);
                int[] iArr = {(this.a.s.getIconView().getMeasuredWidth() / 2) + r9, (this.a.s.getIconView().getMeasuredHeight() / 2) + r9};
                this.a.s.getIconView().getLocationInWindow(iArr);
                int i11 = iArr[0];
                int i12 = iArr[1];
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), this.a.s.getIconView());
                this.a.A0(true);
                org.telegram.ui.ActionBar.k6.F1(this.a);
            }
            str2 = string;
            boolean equals2 = str2.equals(j6Var.m());
            if (!equals2) {
            }
            int[] iArr2 = {(this.a.s.getIconView().getMeasuredWidth() / 2) + i11, (this.a.s.getIconView().getMeasuredHeight() / 2) + i12};
            this.a.s.getIconView().getLocationInWindow(iArr2);
            int i112 = iArr2[0];
            int i122 = iArr2[1];
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(equals2), this.a.s.getIconView());
            this.a.A0(true);
            org.telegram.ui.ActionBar.k6.F1(this.a);
        }
    }
}
