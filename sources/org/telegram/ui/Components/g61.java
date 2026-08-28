package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g61 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public g61(i61 i61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = i61Var.b;
        this.b = i61Var.i;
        this.c = i61Var.j;
        arrayList.add(i61Var);
    }

    public final i61 a() {
        ArrayList arrayList = this.d;
        i61 i61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            i61 i61Var2 = (i61) obj;
            if (i61Var2.b()) {
                return i61Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i61 i61Var3 = (i61) arrayList.get(i10);
            if (i61Var3.k < j10 && k61.Y(i61Var3.m)) {
                j10 = i61Var3.k;
                i61Var = i61Var3;
            }
        }
        return i61Var != null ? i61Var : (i61) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.b, this.c);
        if (Math.abs(min - 2160) < 55) {
            return 2160;
        }
        if (Math.abs(min - 1440) < 55) {
            return 1440;
        }
        if (Math.abs(min - 1080) < 55) {
            return 1080;
        }
        if (Math.abs(min - 720) < 55) {
            return 720;
        }
        if (Math.abs(min - 480) < 55) {
            return 480;
        }
        if (Math.abs(min - 360) < 55) {
            return 360;
        }
        if (Math.abs(min - 240) < 55) {
            return 240;
        }
        if (Math.abs(min - 144) < 55) {
            return 144;
        }
        return min;
    }

    public final String toString() {
        String str;
        boolean z10 = SharedConfig.debugVideoQualities;
        boolean z11 = this.a;
        String str2 = "";
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append("p");
            if (z11) {
                str2 = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z11) {
            str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(AndroidUtilities.formatFileSize((long) ((i61) arrayList.get(0)).l).replace(" ", ""));
        sb3.append("/s");
        if (((i61) arrayList.get(0)).m != null) {
            str2 = ", " + ((i61) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
