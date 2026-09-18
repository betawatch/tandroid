package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class q71 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public q71(s71 s71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = s71Var.b;
        this.b = s71Var.i;
        this.c = s71Var.j;
        arrayList.add(s71Var);
    }

    public final s71 a() {
        ArrayList arrayList = this.d;
        s71 s71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            s71 s71Var2 = (s71) obj;
            if (s71Var2.b()) {
                return s71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            s71 s71Var3 = (s71) arrayList.get(i11);
            if (s71Var3.k < j3 && u71.Y(s71Var3.m)) {
                j3 = s71Var3.k;
                s71Var = s71Var3;
            }
        }
        return s71Var != null ? s71Var : (s71) arrayList.get(0);
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
        sb3.append(AndroidUtilities.formatFileSize((long) ((s71) arrayList.get(0)).l).replace(" ", ""));
        sb3.append("/s");
        if (((s71) arrayList.get(0)).m != null) {
            str2 = ", " + ((s71) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
