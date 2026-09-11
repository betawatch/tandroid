package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class c71 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public c71(e71 e71Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = e71Var.b;
        this.b = e71Var.i;
        this.c = e71Var.j;
        arrayList.add(e71Var);
    }

    public final e71 a() {
        ArrayList arrayList = this.d;
        e71 e71Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            e71 e71Var2 = (e71) obj;
            if (e71Var2.b()) {
                return e71Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            e71 e71Var3 = (e71) arrayList.get(i11);
            if (e71Var3.k < j3 && g71.Y(e71Var3.m)) {
                j3 = e71Var3.k;
                e71Var = e71Var3;
            }
        }
        return e71Var != null ? e71Var : (e71) arrayList.get(0);
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
        sb3.append(AndroidUtilities.formatFileSize((long) ((e71) arrayList.get(0)).l).replace(" ", ""));
        sb3.append("/s");
        if (((e71) arrayList.get(0)).m != null) {
            str2 = ", " + ((e71) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
