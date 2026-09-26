package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o71 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public o71(q71 q71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = q71Var.b;
        this.b = q71Var.i;
        this.c = q71Var.j;
        arrayList.add(q71Var);
    }

    public final q71 a() {
        ArrayList arrayList = this.d;
        q71 q71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            q71 q71Var2 = (q71) obj;
            if (q71Var2.b()) {
                return q71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            q71 q71Var3 = (q71) arrayList.get(i11);
            if (q71Var3.k < j3 && s71.Y(q71Var3.m)) {
                j3 = q71Var3.k;
                q71Var = q71Var3;
            }
        }
        return q71Var != null ? q71Var : (q71) arrayList.get(0);
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
        sb3.append(AndroidUtilities.formatFileSize((long) ((q71) arrayList.get(0)).l).replace(" ", ""));
        sb3.append("/s");
        if (((q71) arrayList.get(0)).m != null) {
            str2 = ", " + ((q71) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
