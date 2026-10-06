package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class a81 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public a81(c81 c81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = c81Var.b;
        this.b = c81Var.i;
        this.c = c81Var.j;
        arrayList.add(c81Var);
    }

    public final c81 a() {
        ArrayList arrayList = this.d;
        c81 c81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            c81 c81Var2 = (c81) obj;
            if (c81Var2.b()) {
                return c81Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            c81 c81Var3 = (c81) arrayList.get(i11);
            if (c81Var3.k < j3 && e81.Y(c81Var3.m)) {
                j3 = c81Var3.k;
                c81Var = c81Var3;
            }
        }
        return c81Var != null ? c81Var : (c81) arrayList.get(0);
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
        sb3.append(AndroidUtilities.formatFileSize((long) ((c81) arrayList.get(0)).l).replace(" ", ""));
        sb3.append("/s");
        if (((c81) arrayList.get(0)).m != null) {
            str2 = ", " + ((c81) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
