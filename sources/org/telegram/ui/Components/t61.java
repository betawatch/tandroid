package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class t61 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public t61(v61 v61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = v61Var.b;
        this.b = v61Var.i;
        this.c = v61Var.j;
        arrayList.add(v61Var);
    }

    public final v61 a() {
        ArrayList arrayList = this.d;
        v61 v61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v61 v61Var2 = (v61) obj;
            if (v61Var2.b()) {
                return v61Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            v61 v61Var3 = (v61) arrayList.get(i11);
            if (v61Var3.k < j10 && x61.Y(v61Var3.m)) {
                j10 = v61Var3.k;
                v61Var = v61Var3;
            }
        }
        return v61Var != null ? v61Var : (v61) arrayList.get(0);
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
        sb3.append(AndroidUtilities.formatFileSize((long) ((v61) arrayList.get(0)).l).replace(" ", ""));
        sb3.append("/s");
        if (((v61) arrayList.get(0)).m != null) {
            str2 = ", " + ((v61) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
