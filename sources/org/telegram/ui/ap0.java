package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq0 b;

    public /* synthetic */ ap0(cq0 cq0Var, int i10) {
        this.a = i10;
        this.b = cq0Var;
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
        wp0 wp0Var;
        boolean z10;
        Drawable drawable;
        switch (this.a) {
            case 0:
                cq0 cq0Var = this.b;
                cq0Var.S = !cq0Var.S;
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
                        N0 = !cq0Var.S ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
                        cq0Var.v.clear();
                        strArr = new String[1];
                        String str3 = N0.d;
                        Q0 = str3 == null ? org.telegram.ui.ActionBar.j6.Q0(null, str3, strArr) : org.telegram.ui.ActionBar.j6.Q0(new File(N0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.j6.nl;
                        if (iArr != null) {
                            for (int i11 = 0; i11 < iArr.length; i11++) {
                                cq0Var.v.put(i11, iArr[i11]);
                            }
                        }
                        for (i10 = 0; i10 < Q0.size(); i10++) {
                            cq0Var.v.put(Q0.keyAt(i10), Q0.valueAt(i10));
                        }
                        k10 = N0.k(false);
                        if (k10 != null) {
                            k10.c(Q0, cq0Var.v);
                        }
                        wp0Var = cq0Var.h;
                        if (wp0Var != null && wp0Var.v != null) {
                            cf.c H = org.telegram.ui.ActionBar.j6.H(N0, cq0Var.v, strArr[0], 0, true);
                            rp0 rp0Var = cq0Var.h.v;
                            drawable = (BitmapDrawable) H.b;
                            if (drawable == null) {
                                drawable = (Drawable) H.a;
                            }
                            rp0Var.setOverrideBackground(drawable);
                        }
                        z10 = cq0Var.S;
                        if (cq0Var.a0 != z10) {
                            cq0Var.a0 = z10;
                            org.telegram.ui.Components.hj0 hj0Var = cq0Var.T;
                            hj0Var.P(z10 ? hj0Var.e[0] : 0);
                            org.telegram.ui.Components.hj0 hj0Var2 = cq0Var.T;
                            if (hj0Var2 != null) {
                                hj0Var2.start();
                            }
                        }
                        cq0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!cq0Var.S) {
                }
                cq0Var.v.clear();
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
                wp0Var = cq0Var.h;
                if (wp0Var != null) {
                    cf.c H2 = org.telegram.ui.ActionBar.j6.H(N0, cq0Var.v, strArr[0], 0, true);
                    rp0 rp0Var2 = cq0Var.h.v;
                    drawable = (BitmapDrawable) H2.b;
                    if (drawable == null) {
                    }
                    rp0Var2.setOverrideBackground(drawable);
                }
                z10 = cq0Var.S;
                if (cq0Var.a0 != z10) {
                }
                cq0Var.F0();
                break;
            default:
                this.b.D0(2);
                break;
        }
    }
}
