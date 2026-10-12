package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class fp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gq0 b;

    public /* synthetic */ fp0(gq0 gq0Var, int i10) {
        this.a = i10;
        this.b = gq0Var;
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
        org.telegram.ui.ActionBar.f6 O0;
        String[] strArr;
        SparseIntArray R0;
        int[] iArr;
        int i10;
        org.telegram.ui.ActionBar.e6 k10;
        aq0 aq0Var;
        boolean z10;
        Drawable drawable;
        switch (this.a) {
            case 0:
                gq0 gq0Var = this.b;
                gq0Var.S = !gq0Var.S;
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string) == null || org.telegram.ui.ActionBar.g6.O0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string2) == null || !org.telegram.ui.ActionBar.g6.O0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
                if (string.equals(string2)) {
                    if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        O0 = !gq0Var.S ? org.telegram.ui.ActionBar.g6.O0(str2) : org.telegram.ui.ActionBar.g6.O0(str);
                        gq0Var.v.clear();
                        strArr = new String[1];
                        String str3 = O0.d;
                        R0 = str3 == null ? org.telegram.ui.ActionBar.g6.R0(null, str3, strArr) : org.telegram.ui.ActionBar.g6.R0(new File(O0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.g6.ql;
                        if (iArr != null) {
                            for (int i11 = 0; i11 < iArr.length; i11++) {
                                gq0Var.v.put(i11, iArr[i11]);
                            }
                        }
                        for (i10 = 0; i10 < R0.size(); i10++) {
                            gq0Var.v.put(R0.keyAt(i10), R0.valueAt(i10));
                        }
                        k10 = O0.k(false);
                        if (k10 != null) {
                            k10.c(R0, gq0Var.v);
                        }
                        aq0Var = gq0Var.h;
                        if (aq0Var != null && aq0Var.v != null) {
                            com.google.android.gms.internal.cast.z5 H = org.telegram.ui.ActionBar.g6.H(O0, gq0Var.v, strArr[0], 0, true);
                            vp0 vp0Var = gq0Var.h.v;
                            drawable = (BitmapDrawable) H.c;
                            if (drawable == null) {
                                drawable = (Drawable) H.b;
                            }
                            vp0Var.setOverrideBackground(drawable);
                        }
                        z10 = gq0Var.S;
                        if (gq0Var.a0 != z10) {
                            gq0Var.a0 = z10;
                            org.telegram.ui.Components.yj0 yj0Var = gq0Var.T;
                            yj0Var.P(z10 ? yj0Var.e[0] : 0);
                            org.telegram.ui.Components.yj0 yj0Var2 = gq0Var.T;
                            if (yj0Var2 != null) {
                                yj0Var2.start();
                            }
                        }
                        gq0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!gq0Var.S) {
                }
                gq0Var.v.clear();
                strArr = new String[1];
                String str32 = O0.d;
                if (str32 == null) {
                }
                iArr = org.telegram.ui.ActionBar.g6.ql;
                if (iArr != null) {
                }
                while (i10 < R0.size()) {
                }
                k10 = O0.k(false);
                if (k10 != null) {
                }
                aq0Var = gq0Var.h;
                if (aq0Var != null) {
                    com.google.android.gms.internal.cast.z5 H2 = org.telegram.ui.ActionBar.g6.H(O0, gq0Var.v, strArr[0], 0, true);
                    vp0 vp0Var2 = gq0Var.h.v;
                    drawable = (BitmapDrawable) H2.c;
                    if (drawable == null) {
                    }
                    vp0Var2.setOverrideBackground(drawable);
                }
                z10 = gq0Var.S;
                if (gq0Var.a0 != z10) {
                }
                gq0Var.F0();
                break;
            default:
                this.b.D0(2);
                break;
        }
    }
}
