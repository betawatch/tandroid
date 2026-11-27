// default package

import android.content.SharedPreferences;
import android.widget.TextView;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class kob extends d6 {
    public final /* synthetic */ ThemeActivity a;

    public kob(ThemeActivity themeActivity) {
        this.a = themeActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0151  */
    @Override // d6
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
            ynb i2 = aob.B0().i(false);
            TLRPC.TL_theme tL_theme = i2.r;
            ThemeActivity themeActivity = this.a;
            if (tL_theme == null) {
                themeActivity.getMessagesController().J4(i2.b, i2);
                jn7.e().k(jn7.v4, i2.b, i2);
                return;
            }
            String str = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + i2.r.slug;
            this.a.showDialog(new kea(this.a.getParentActivity(), null, str, false, str, false, null));
            return;
        }
        if (i == 3) {
            this.a.w0();
            return;
        }
        if (i == 4) {
            if (this.a.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131743799, "ThemeResetToDefaultsTitle");
                alertDialog$Builder.a.U = ob6.M0(2131743800, "ThemeResetToDefaultsText");
                alertDialog$Builder.j(ob6.M0(2131745845, "Reset"), new hja(this, (byte) 27));
                alertDialog$Builder.g(ob6.M0(2131752570, "Cancel"), null);
                id idVar = alertDialog$Builder.a;
                this.a.showDialog(idVar);
                TextView textView = (TextView) idVar.c(-1);
                if (textView != null) {
                    yob.X(textView, aob.q7, null);
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
            if (aob.O0(string) == null || aob.O0(string).o()) {
                string = "Blue";
            }
            String str3 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            if (aob.O0(string2) == null || !aob.O0(string2).o()) {
                string2 = "Dark Blue";
            }
            znb znbVar = aob.I;
            if (!string.equals(string2)) {
                str3 = string2;
            } else if (znbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
                boolean equals = str2.equals(znbVar.k());
                znb O0 = !equals ? aob.O0(str3) : aob.O0(str2);
                int[] iArr = {(this.a.s.getIconView().getMeasuredWidth() / 2) + r9, (this.a.s.getIconView().getMeasuredHeight() / 2) + r9};
                this.a.s.getIconView().getLocationInWindow(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                jn7.e().k(jn7.w4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), this.a.s.getIconView());
                this.a.F0(true);
                aob.K1(this.a);
            }
            str2 = string;
            boolean equals2 = str2.equals(znbVar.k());
            if (!equals2) {
            }
            int[] iArr2 = {(this.a.s.getIconView().getMeasuredWidth() / 2) + i3, (this.a.s.getIconView().getMeasuredHeight() / 2) + i4};
            this.a.s.getIconView().getLocationInWindow(iArr2);
            int i32 = iArr2[0];
            int i42 = iArr2[1];
            jn7.e().k(jn7.w4, O0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(equals2), this.a.s.getIconView());
            this.a.F0(true);
            aob.K1(this.a);
        }
    }
}
