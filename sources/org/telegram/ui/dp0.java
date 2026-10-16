package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import java.io.File;
import org.telegram.messenger.ApplicationLoader;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eq0 b;

    public /* synthetic */ dp0(eq0 eq0Var, int i10) {
        this.a = i10;
        this.b = eq0Var;
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
        yp0 yp0Var;
        boolean z10;
        Drawable drawable;
        switch (this.a) {
            case 0:
                eq0 eq0Var = this.b;
                eq0Var.S = !eq0Var.S;
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
                        O0 = !eq0Var.S ? org.telegram.ui.ActionBar.g6.O0(str2) : org.telegram.ui.ActionBar.g6.O0(str);
                        eq0Var.v.clear();
                        strArr = new String[1];
                        String str3 = O0.d;
                        R0 = str3 == null ? org.telegram.ui.ActionBar.g6.R0(null, str3, strArr) : org.telegram.ui.ActionBar.g6.R0(new File(O0.b), null, strArr);
                        iArr = org.telegram.ui.ActionBar.g6.ql;
                        if (iArr != null) {
                            for (int i11 = 0; i11 < iArr.length; i11++) {
                                eq0Var.v.put(i11, iArr[i11]);
                            }
                        }
                        for (i10 = 0; i10 < R0.size(); i10++) {
                            eq0Var.v.put(R0.keyAt(i10), R0.valueAt(i10));
                        }
                        k10 = O0.k(false);
                        if (k10 != null) {
                            k10.c(R0, eq0Var.v);
                        }
                        yp0Var = eq0Var.h;
                        if (yp0Var != null && yp0Var.v != null) {
                            com.google.android.gms.internal.cast.z5 H = org.telegram.ui.ActionBar.g6.H(O0, eq0Var.v, strArr[0], 0, true);
                            tp0 tp0Var = eq0Var.h.v;
                            drawable = (BitmapDrawable) H.c;
                            if (drawable == null) {
                                drawable = (Drawable) H.b;
                            }
                            tp0Var.setOverrideBackground(drawable);
                        }
                        z10 = eq0Var.S;
                        if (eq0Var.a0 != z10) {
                            eq0Var.a0 = z10;
                            org.telegram.ui.Components.yj0 yj0Var = eq0Var.T;
                            yj0Var.P(z10 ? yj0Var.e[0] : 0);
                            org.telegram.ui.Components.yj0 yj0Var2 = eq0Var.T;
                            if (yj0Var2 != null) {
                                yj0Var2.start();
                            }
                        }
                        eq0Var.F0();
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                if (!eq0Var.S) {
                }
                eq0Var.v.clear();
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
                yp0Var = eq0Var.h;
                if (yp0Var != null) {
                    com.google.android.gms.internal.cast.z5 H2 = org.telegram.ui.ActionBar.g6.H(O0, eq0Var.v, strArr[0], 0, true);
                    tp0 tp0Var2 = eq0Var.h.v;
                    drawable = (BitmapDrawable) H2.c;
                    if (drawable == null) {
                    }
                    tp0Var2.setOverrideBackground(drawable);
                }
                z10 = eq0Var.S;
                if (eq0Var.a0 != z10) {
                }
                eq0Var.F0();
                break;
            default:
                this.b.D0(2);
                break;
        }
    }
}
