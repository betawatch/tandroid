package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ np0 b;

    public /* synthetic */ oo0(np0 np0Var, int i10) {
        this.a = i10;
        this.b = np0Var;
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
        org.telegram.ui.ActionBar.i6 N0;
        String[] strArr;
        SparseIntArray Q0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.h6 k10;
        hp0 hp0Var;
        boolean z4;
        Drawable drawable;
        switch (this.a) {
            case 0:
                np0 np0Var = this.b;
                np0Var.P = !np0Var.P;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                if (string.equals(string2)) {
                    if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        N0 = !np0Var.P ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
                        np0Var.v.clear();
                        strArr = new String[1];
                        String str3 = N0.d;
                        Q0 = str3 == null ? org.telegram.ui.ActionBar.j6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.j6.Q0(new File(N0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.j6.nl;
                        if (iArr != null) {
                            for (int i11 = 0; i11 < iArr.length; i11++) {
                                np0Var.v.put(i11, iArr[i11]);
                            }
                        }
                        for (i10 = 0; i10 < Q0.size(); i10++) {
                            np0Var.v.put(Q0.keyAt(i10), Q0.valueAt(i10));
                        }
                        k10 = N0.k(false);
                        if (k10 != null) {
                            k10.c(Q0, np0Var.v);
                        }
                        hp0Var = np0Var.h;
                        if (hp0Var != null && hp0Var.v != null) {
                            c5.j H = org.telegram.ui.ActionBar.j6.H(N0, np0Var.v, strArr[0], 0, true);
                            cp0 cp0Var = np0Var.h.v;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            cp0Var.setOverrideBackground(drawable);
                        }
                        z4 = np0Var.P;
                        if (np0Var.X != z4) {
                            np0Var.X = z4;
                            org.telegram.ui.Components.gj0 gj0Var = np0Var.Q;
                            gj0Var.N(z4 ? gj0Var.e[0] : 0);
                            org.telegram.ui.Components.gj0 gj0Var2 = np0Var.Q;
                            if (gj0Var2 != null) {
                                gj0Var2.start();
                            }
                        }
                        np0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!np0Var.P) {
                }
                np0Var.v.clear();
                strArr = new String[1];
                String str32 = N0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.j6.nl;
                if (iArr != null) {
                }
                while (i10 < Q0.size()) {
                }
                k10 = N0.k(false);
                if (k10 != null) {
                }
                hp0Var = np0Var.h;
                if (hp0Var != null) {
                    c5.j H2 = org.telegram.ui.ActionBar.j6.H(N0, np0Var.v, strArr[0], 0, true);
                    cp0 cp0Var2 = np0Var.h.v;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    cp0Var2.setOverrideBackground(drawable);
                }
                z4 = np0Var.P;
                if (np0Var.X != z4) {
                }
                np0Var.F0();
                break;
            default:
                this.b.D0(2);
                break;
        }
    }
}
