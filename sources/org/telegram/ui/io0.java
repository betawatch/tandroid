package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class io0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jp0 b;

    public /* synthetic */ io0(jp0 jp0Var, int i10) {
        this.a = i10;
        this.b = jp0Var;
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
        org.telegram.ui.ActionBar.g6 O0;
        String[] strArr;
        SparseIntArray R0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.f6 k10;
        dp0 dp0Var;
        boolean z10;
        Drawable drawable;
        switch (this.a) {
            case 0:
                jp0 jp0Var = this.b;
                jp0Var.S = !jp0Var.S;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string) == null || org.telegram.ui.ActionBar.h6.O0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string2) == null || !org.telegram.ui.ActionBar.h6.O0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.g6 g6Var = org.telegram.ui.ActionBar.h6.I;
                if (string.equals(string2)) {
                    if (g6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        O0 = !jp0Var.S ? org.telegram.ui.ActionBar.h6.O0(str2) : org.telegram.ui.ActionBar.h6.O0(str);
                        jp0Var.v.clear();
                        strArr = new String[1];
                        String str3 = O0.d;
                        R0 = str3 == null ? org.telegram.ui.ActionBar.h6.R0(null, str3, strArr) : org.telegram.ui.ActionBar.h6.R0(new File(O0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.h6.ql;
                        if (iArr != null) {
                            for (int i11 = 0; i11 < iArr.length; i11++) {
                                jp0Var.v.put(i11, iArr[i11]);
                            }
                        }
                        for (i10 = 0; i10 < R0.size(); i10++) {
                            jp0Var.v.put(R0.keyAt(i10), R0.valueAt(i10));
                        }
                        k10 = O0.k(false);
                        if (k10 != null) {
                            k10.c(R0, jp0Var.v);
                        }
                        dp0Var = jp0Var.h;
                        if (dp0Var != null && dp0Var.v != null) {
                            com.google.android.gms.internal.cast.z5 H = org.telegram.ui.ActionBar.h6.H(O0, jp0Var.v, strArr[0], 0, true);
                            yo0 yo0Var = jp0Var.h.v;
                            drawable = (BitmapDrawable) H.c;
                            if (drawable == null) {
                                drawable = (Drawable) H.b;
                            }
                            yo0Var.setOverrideBackground(drawable);
                        }
                        z10 = jp0Var.S;
                        if (jp0Var.a0 != z10) {
                            jp0Var.a0 = z10;
                            org.telegram.ui.Components.uj0 uj0Var = jp0Var.T;
                            uj0Var.P(z10 ? uj0Var.e[0] : 0);
                            org.telegram.ui.Components.uj0 uj0Var2 = jp0Var.T;
                            if (uj0Var2 != null) {
                                uj0Var2.start();
                            }
                        }
                        jp0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!jp0Var.S) {
                }
                jp0Var.v.clear();
                strArr = new String[1];
                String str32 = O0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.h6.ql;
                if (iArr != null) {
                }
                while (i10 < R0.size()) {
                }
                k10 = O0.k(false);
                if (k10 != null) {
                }
                dp0Var = jp0Var.h;
                if (dp0Var != null) {
                    com.google.android.gms.internal.cast.z5 H2 = org.telegram.ui.ActionBar.h6.H(O0, jp0Var.v, strArr[0], 0, true);
                    yo0 yo0Var2 = jp0Var.h.v;
                    drawable = (BitmapDrawable) H2.c;
                    if (drawable == null) {
                    }
                    yo0Var2.setOverrideBackground(drawable);
                }
                z10 = jp0Var.S;
                if (jp0Var.a0 != z10) {
                }
                jp0Var.F0();
                break;
            default:
                this.b.D0(2);
                break;
        }
    }
}
