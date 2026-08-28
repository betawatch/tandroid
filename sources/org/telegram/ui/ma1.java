package org.telegram.ui;

import android.content.SharedPreferences;
import android.widget.TextView;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ma1 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ThemeActivity a;

    public ma1(ThemeActivity themeActivity) {
        this.a = themeActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    @Override // org.telegram.ui.ActionBar.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i9) {
        if (i9 == -1) {
            this.a.finishFragment();
            return;
        }
        if (i9 == 1) {
            this.a.v0();
            return;
        }
        if (i9 == 2) {
            org.telegram.ui.ActionBar.d6 k10 = org.telegram.ui.ActionBar.f6.A0().k(false);
            if (k10.r == null) {
                this.a.getMessagesController().saveThemeToServer(k10.b, k10);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, k10.b, k10);
                return;
            }
            String str = "https://" + this.a.getMessagesController().linkPrefix + "/addtheme/" + k10.r.slug;
            this.a.showDialog(new org.telegram.ui.Components.rp0(this.a.getParentActivity(), null, str, false, str, false, null));
            return;
        }
        if (i9 == 3) {
            this.a.w0();
            return;
        }
        if (i9 == 4) {
            if (this.a.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a.getParentActivity());
            alertDialog$Builder.a.N = LocaleController.getString("ThemeResetToDefaultsTitle", R.string.ThemeResetToDefaultsTitle);
            alertDialog$Builder.a.P = LocaleController.getString("ThemeResetToDefaultsText", R.string.ThemeResetToDefaultsText);
            alertDialog$Builder.k(LocaleController.getString("Reset", R.string.Reset), new dl0(this, 20));
            alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            this.a.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        if (i9 == 5) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str2 = "Blue";
            String string = sharedPreferences.getString("lastDayTheme", "Blue");
            if (org.telegram.ui.ActionBar.f6.N0(string) == null || org.telegram.ui.ActionBar.f6.N0(string).q()) {
                string = "Blue";
            }
            String str3 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            if (org.telegram.ui.ActionBar.f6.N0(string2) == null || !org.telegram.ui.ActionBar.f6.N0(string2).q()) {
                string2 = "Dark Blue";
            }
            org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
            if (!string.equals(string2)) {
                str3 = string2;
            } else if (e6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
                boolean equals = str2.equals(e6Var.m());
                org.telegram.ui.ActionBar.e6 N0 = !equals ? org.telegram.ui.ActionBar.f6.N0(str3) : org.telegram.ui.ActionBar.f6.N0(str2);
                int[] iArr = {(this.a.s.getIconView().getMeasuredWidth() / 2) + r9, (this.a.s.getIconView().getMeasuredHeight() / 2) + r9};
                this.a.s.getIconView().getLocationInWindow(iArr);
                int i10 = iArr[0];
                int i11 = iArr[1];
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), this.a.s.getIconView());
                this.a.z0(true);
                org.telegram.ui.ActionBar.f6.F1(this.a);
            }
            str2 = string;
            boolean equals2 = str2.equals(e6Var.m());
            if (!equals2) {
            }
            int[] iArr2 = {(this.a.s.getIconView().getMeasuredWidth() / 2) + i10, (this.a.s.getIconView().getMeasuredHeight() / 2) + i11};
            this.a.s.getIconView().getLocationInWindow(iArr2);
            int i102 = iArr2[0];
            int i112 = iArr2[1];
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(equals2), this.a.s.getIconView());
            this.a.z0(true);
            org.telegram.ui.ActionBar.f6.F1(this.a);
        }
    }
}
