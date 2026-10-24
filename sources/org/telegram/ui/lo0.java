package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class lo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp0 b;

    public /* synthetic */ lo0(lp0 lp0Var, int i10) {
        this.a = i10;
        this.b = lp0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4 A[LOOP:1: B:37:0x00ae->B:39:0x00b4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x007b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.j6 P0;
        String[] strArr;
        SparseIntArray S0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.i6 k10;
        fp0 fp0Var;
        boolean z10;
        Drawable drawable;
        switch (this.a) {
            case 0:
                lp0 lp0Var = this.b;
                lp0Var.S = !lp0Var.S;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.P0(string) == null || org.telegram.ui.ActionBar.k6.P0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.P0(string2) == null || !org.telegram.ui.ActionBar.k6.P0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
                if (string.equals(string2)) {
                    if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        P0 = !lp0Var.S ? org.telegram.ui.ActionBar.k6.P0(str2) : org.telegram.ui.ActionBar.k6.P0(str);
                        lp0Var.v.clear();
                        strArr = new String[1];
                        String str3 = P0.d;
                        S0 = str3 == null ? org.telegram.ui.ActionBar.k6.S0(null, str3, strArr) : org.telegram.ui.ActionBar.k6.S0(new File(P0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.k6.ql;
                        if (iArr != null) {
                            for (int i11 = 0; i11 < iArr.length; i11++) {
                                lp0Var.v.put(i11, iArr[i11]);
                            }
                        }
                        for (i10 = 0; i10 < S0.size(); i10++) {
                            lp0Var.v.put(S0.keyAt(i10), S0.valueAt(i10));
                        }
                        k10 = P0.k(false);
                        if (k10 != null) {
                            k10.c(S0, lp0Var.v);
                        }
                        fp0Var = lp0Var.h;
                        if (fp0Var != null && fp0Var.v != null) {
                            com.google.android.gms.internal.cast.z5 H = org.telegram.ui.ActionBar.k6.H(P0, lp0Var.v, strArr[0], 0, true);
                            ap0 ap0Var = lp0Var.h.v;
                            drawable = (BitmapDrawable) H.c;
                            if (drawable == null) {
                                drawable = (Drawable) H.b;
                            }
                            ap0Var.setOverrideBackground(drawable);
                        }
                        z10 = lp0Var.S;
                        if (lp0Var.a0 != z10) {
                            lp0Var.a0 = z10;
                            org.telegram.ui.Components.yj0 yj0Var = lp0Var.T;
                            yj0Var.P(z10 ? yj0Var.e[0] : 0);
                            org.telegram.ui.Components.yj0 yj0Var2 = lp0Var.T;
                            if (yj0Var2 != null) {
                                yj0Var2.start();
                            }
                        }
                        lp0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!lp0Var.S) {
                }
                lp0Var.v.clear();
                strArr = new String[1];
                String str32 = P0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.k6.ql;
                if (iArr != null) {
                }
                while (i10 < S0.size()) {
                }
                k10 = P0.k(false);
                if (k10 != null) {
                }
                fp0Var = lp0Var.h;
                if (fp0Var != null) {
                    com.google.android.gms.internal.cast.z5 H2 = org.telegram.ui.ActionBar.k6.H(P0, lp0Var.v, strArr[0], 0, true);
                    ap0 ap0Var2 = lp0Var.h.v;
                    drawable = (BitmapDrawable) H2.c;
                    if (drawable == null) {
                    }
                    ap0Var2.setOverrideBackground(drawable);
                }
                z10 = lp0Var.S;
                if (lp0Var.a0 != z10) {
                }
                lp0Var.F0();
                break;
            default:
                this.b.D0(2);
                break;
        }
    }
}
