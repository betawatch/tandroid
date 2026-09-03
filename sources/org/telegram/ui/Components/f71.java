package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f71 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public f71(h71 h71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = h71Var.b;
        this.b = h71Var.i;
        this.c = h71Var.j;
        arrayList.add(h71Var);
    }

    public final h71 a() {
        ArrayList arrayList = this.d;
        h71 h71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h71 h71Var2 = (h71) obj;
            if (h71Var2.b()) {
                return h71Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            h71 h71Var3 = (h71) arrayList.get(i11);
            if (h71Var3.k < j10 && j71.Y(h71Var3.m)) {
                j10 = h71Var3.k;
                h71Var = h71Var3;
            }
        }
        return h71Var != null ? h71Var : (h71) arrayList.get(0);
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
        sb2.append(AndroidUtilities.formatFileSize((long) ((h71) arrayList.get(0)).l).replace(" ", ""));
        sb2.append("/s");
        if (((h71) arrayList.get(0)).m != null) {
            str2 = ", " + ((h71) arrayList.get(0)).m;
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
