package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e71 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public e71(g71 g71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = g71Var.b;
        this.b = g71Var.i;
        this.c = g71Var.j;
        arrayList.add(g71Var);
    }

    public final g71 a() {
        ArrayList arrayList = this.d;
        g71 g71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g71 g71Var2 = (g71) obj;
            if (g71Var2.b()) {
                return g71Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            g71 g71Var3 = (g71) arrayList.get(i11);
            if (g71Var3.k < j10 && i71.Y(g71Var3.m)) {
                j10 = g71Var3.k;
                g71Var = g71Var3;
            }
        }
        return g71Var != null ? g71Var : (g71) arrayList.get(0);
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
        boolean z4 = SharedConfig.debugVideoQualities;
        boolean z10 = this.a;
        String str2 = "";
        if (!z4) {
            StringBuilder sb = new StringBuilder();
            sb.append(b());
            sb.append("p");
            if (z10) {
                str2 = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            }
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.b);
        sb2.append("x");
        sb2.append(this.c);
        if (z10) {
            str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("\n");
        ArrayList arrayList = this.d;
        sb2.append(AndroidUtilities.formatFileSize((long) ((g71) arrayList.get(0)).l).replace(" ", ""));
        sb2.append("/s");
        if (((g71) arrayList.get(0)).m != null) {
            str2 = ", " + ((g71) arrayList.get(0)).m;
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
