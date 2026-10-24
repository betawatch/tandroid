package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class f81 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public f81(h81 h81Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = h81Var.b;
        this.b = h81Var.i;
        this.c = h81Var.j;
        arrayList.add(h81Var);
    }

    public final h81 a() {
        ArrayList arrayList = this.d;
        h81 h81Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h81 h81Var2 = (h81) obj;
            if (h81Var2.b()) {
                return h81Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            h81 h81Var3 = (h81) arrayList.get(i11);
            if (h81Var3.k < j10 && j81.Y(h81Var3.m)) {
                j10 = h81Var3.k;
                h81Var = h81Var3;
            }
        }
        return h81Var != null ? h81Var : (h81) arrayList.get(0);
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
        sb3.append(AndroidUtilities.formatFileSize((long) ((h81) arrayList.get(0)).l).replace(" ", ""));
        sb3.append("/s");
        if (((h81) arrayList.get(0)).m != null) {
            str2 = ", " + ((h81) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
