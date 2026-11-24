// default package

import android.content.SharedPreferences;
import android.widget.TextView;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lkb extends c6 {
    public final /* synthetic */ ThemeActivity a;

    public lkb(ThemeActivity themeActivity) {
        this.a = themeActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    @Override // c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        if (i == -1) {
            this.a.finishFragment();
            return;
        }
        if (i == 1) {
            this.a.u0();
            return;
        }
        if (i == 2) {
            zjb i2 = bkb.B0().i(false);
            TLRPC.TL_theme tL_theme = i2.r;
            ThemeActivity themeActivity = this.a;
            if (tL_theme == null) {
                themeActivity.getMessagesController().A4(i2.b, i2);
                kk7.e().k(kk7.u4, i2.b, i2);
                return;
            }
            String str = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + i2.r.slug;
            this.a.showDialog(new taa(this.a.getParentActivity(), null, str, false, str, false, null));
            return;
        }
        if (i == 3) {
            this.a.v0();
            return;
        }
        if (i == 4) {
            if (this.a.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a.getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131743905, "ThemeResetToDefaultsTitle");
                alertDialog$Builder.a.U = k96.M0(2131743906, "ThemeResetToDefaultsText");
                alertDialog$Builder.j(k96.M0(2131745925, "Reset"), new hza(this, (byte) 14));
                alertDialog$Builder.g(k96.M0(2131752577, "Cancel"), null);
                hd hdVar = alertDialog$Builder.a;
                this.a.showDialog(hdVar);
                TextView textView = (TextView) hdVar.c(-1);
                if (textView != null) {
                    zkb.X(textView, bkb.p7, null);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 5) {
            SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
            String str2 = "Blue";
            String string = sharedPreferences.getString("lastDayTheme", "Blue");
            if (bkb.O0(string) == null || bkb.O0(string).o()) {
                string = "Blue";
            }
            String str3 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            if (bkb.O0(string2) == null || !bkb.O0(string2).o()) {
                string2 = "Dark Blue";
            }
            akb akbVar = bkb.I;
            if (!string.equals(string2)) {
                str3 = string2;
            } else if (akbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
                boolean equals = str2.equals(akbVar.k());
                akb O0 = !equals ? bkb.O0(str3) : bkb.O0(str2);
                int[] iArr = {(this.a.s.getIconView().getMeasuredWidth() / 2) + r9, (this.a.s.getIconView().getMeasuredHeight() / 2) + r9};
                this.a.s.getIconView().getLocationInWindow(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                kk7.e().k(kk7.v4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), this.a.s.getIconView());
                this.a.E0(true);
                bkb.K1(this.a);
            }
            str2 = string;
            boolean equals2 = str2.equals(akbVar.k());
            if (!equals2) {
            }
            int[] iArr2 = {(this.a.s.getIconView().getMeasuredWidth() / 2) + i3, (this.a.s.getIconView().getMeasuredHeight() / 2) + i4};
            this.a.s.getIconView().getLocationInWindow(iArr2);
            int i32 = iArr2[0];
            int i42 = iArr2[1];
            kk7.e().k(kk7.v4, O0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(equals2), this.a.s.getIconView());
            this.a.E0(true);
            bkb.K1(this.a);
        }
    }
}
