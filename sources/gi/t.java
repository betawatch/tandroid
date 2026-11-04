package gi;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t {
    public static ArrayList f;
    public final String a;
    public final int b;
    public final int c;
    public final int[] d;
    public final ArrayList e = new ArrayList();

    public t(String str) {
        str = str == null ? "." : str;
        this.a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.c = length;
        this.d = new int[length];
        int i3 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i3 = Math.max(i3, split[i10].length());
        }
        this.b = i3;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.e.add(new s(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f == null) {
            ArrayList arrayList = new ArrayList();
            f = arrayList;
            arrayList.add(new t("./."));
            f.add(new t(".."));
            f.add(new t("../."));
            f.add(new t("./.."));
            f.add(new t("././."));
            f.add(new t("..."));
            f.add(new t("../.."));
            f.add(new t("./../.."));
            f.add(new t("../../."));
            f.add(new t("../../.."));
            boolean z10 = org.telegram.messenger.r2.a;
        }
        return f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i3 = Math.max(i3, ((t) obj).e.size());
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        return TextUtils.equals(this.a, ((t) obj).a);
    }

    public final String toString() {
        return this.a;
    }
}
