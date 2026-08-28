package kh;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u {
    public static ArrayList f;
    public final String a;
    public final int b;
    public final int c;
    public final int[] d;
    public final ArrayList e = new ArrayList();

    public u(String str) {
        str = str == null ? "." : str;
        this.a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.c = length;
        this.d = new int[length];
        int i9 = 0;
        for (int i10 = 0; i10 < split.length; i10++) {
            this.d[i10] = split[i10].length();
            i9 = Math.max(i9, split[i10].length());
        }
        this.b = i9;
        for (int i11 = 0; i11 < split.length; i11++) {
            for (int i12 = 0; i12 < split[i11].length(); i12++) {
                this.e.add(new t(this, i12, i11));
            }
        }
    }

    public static ArrayList a() {
        if (f == null) {
            ArrayList arrayList = new ArrayList();
            f = arrayList;
            arrayList.add(new u("./."));
            f.add(new u(".."));
            f.add(new u("../."));
            f.add(new u("./.."));
            f.add(new u("././."));
            f.add(new u("..."));
            f.add(new u("../.."));
            f.add(new u("./../.."));
            f.add(new u("../../."));
            f.add(new u("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f.add(new u("../../../.."));
                f.add(new u(".../.../..."));
                f.add(new u("..../..../...."));
                f.add(new u(".../.../.../..."));
            }
        }
        return f;
    }

    public static int b() {
        ArrayList a2 = a();
        int size = a2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = a2.get(i10);
            i10++;
            i9 = Math.max(i9, ((u) obj).e.size());
        }
        return i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        return TextUtils.equals(this.a, ((u) obj).a);
    }

    public final String toString() {
        return this.a;
    }
}
