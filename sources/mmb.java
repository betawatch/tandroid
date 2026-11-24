// default package

import android.content.SharedPreferences;
import android.widget.TextView;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mmb extends c6 {
    public final /* synthetic */ ThemeActivity a;

    public mmb(ThemeActivity themeActivity) {
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
            this.a.v0();
            return;
        }
        if (i == 2) {
            amb i2 = cmb.B0().i(false);
            TLRPC.TL_theme tL_theme = i2.r;
            ThemeActivity themeActivity = this.a;
            if (tL_theme == null) {
                themeActivity.getMessagesController().D4(i2.b, i2);
                nm7.e().k(nm7.w4, i2.b, i2);
                return;
            }
            String str = "https://" + themeActivity.getMessagesController().N2 + "/addtheme/" + i2.r.slug;
            this.a.showDialog(new tca(this.a.getParentActivity(), null, str, false, str, false, null));
            return;
        }
        if (i == 3) {
            this.a.w0();
            return;
        }
        if (i == 4) {
            if (this.a.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a.getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131743831, "ThemeResetToDefaultsTitle");
                alertDialog$Builder.a.U = jb6.M0(2131743832, "ThemeResetToDefaultsText");
                alertDialog$Builder.j(jb6.M0(2131745851, "Reset"), new wta(this, (byte) 18));
                alertDialog$Builder.g(jb6.M0(2131752542, "Cancel"), null);
                he heVar = alertDialog$Builder.a;
                this.a.showDialog(heVar);
                TextView textView = (TextView) heVar.c(-1);
                if (textView != null) {
                    anb.X(textView, cmb.p7, null);
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
            if (cmb.O0(string) == null || cmb.O0(string).o()) {
                string = "Blue";
            }
            String str3 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            if (cmb.O0(string2) == null || !cmb.O0(string2).o()) {
                string2 = "Dark Blue";
            }
            bmb bmbVar = cmb.I;
            if (!string.equals(string2)) {
                str3 = string2;
            } else if (bmbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
                boolean equals = str2.equals(bmbVar.k());
                bmb O0 = !equals ? cmb.O0(str3) : cmb.O0(str2);
                int[] iArr = {(this.a.s.getIconView().getMeasuredWidth() / 2) + r9, (this.a.s.getIconView().getMeasuredHeight() / 2) + r9};
                this.a.s.getIconView().getLocationInWindow(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                nm7.e().k(nm7.x4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), this.a.s.getIconView());
                this.a.F0(true);
                cmb.K1(this.a);
            }
            str2 = string;
            boolean equals2 = str2.equals(bmbVar.k());
            if (!equals2) {
            }
            int[] iArr2 = {(this.a.s.getIconView().getMeasuredWidth() / 2) + i3, (this.a.s.getIconView().getMeasuredHeight() / 2) + i4};
            this.a.s.getIconView().getLocationInWindow(iArr2);
            int i32 = iArr2[0];
            int i42 = iArr2[1];
            nm7.e().k(nm7.x4, O0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(equals2), this.a.s.getIconView());
            this.a.F0(true);
            cmb.K1(this.a);
        }
    }
}
