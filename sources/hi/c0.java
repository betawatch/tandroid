package hi;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class c0 {
    public static ArrayList f;
    public final String a;
    public final int b;
    public final int c;
    public final int[] d;
    public final ArrayList e = new ArrayList();

    public c0(String str) {
        str = str == null ? "." : str;
        this.a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.c = length;
        this.d = new int[length];
        int i7 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i7 = Math.max(i7, split[i10].length());
        }
        this.b = i7;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.e.add(new b0(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f == null) {
            ArrayList arrayList = new ArrayList();
            f = arrayList;
            arrayList.add(new c0("./."));
            f.add(new c0(".."));
            f.add(new c0("../."));
            f.add(new c0("./.."));
            f.add(new c0("././."));
            f.add(new c0("..."));
            f.add(new c0("../.."));
            f.add(new c0("./../.."));
            f.add(new c0("../../."));
            f.add(new c0("../../.."));
            boolean z10 = org.telegram.messenger.s2.a;
        }
        return f;
    }

    public static int b() {
        ArrayList a10 = a();
        int size = a10.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a10.get(i10);
            i10++;
            i7 = Math.max(i7, ((c0) obj).e.size());
        }
        return i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        return TextUtils.equals(this.a, ((c0) obj).a);
    }

    public final String toString() {
        return this.a;
    }
}
