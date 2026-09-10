package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.BuildVars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class x {
    public static ArrayList f;
    public final String a;
    public final int b;
    public final int c;
    public final int[] d;
    public final ArrayList e = new ArrayList();

    public x(String str) {
        str = str == null ? "." : str;
        this.a = str;
        String[] split = str.split("/");
        int length = split.length;
        this.c = length;
        this.d = new int[length];
        int i10 = 0;
        for (int i11 = 0; i11 < split.length; i11++) {
            this.d[i11] = split[i11].length();
            i10 = Math.max(i10, split[i11].length());
        }
        this.b = i10;
        for (int i12 = 0; i12 < split.length; i12++) {
            for (int i13 = 0; i13 < split[i12].length(); i13++) {
                this.e.add(new w(this, i13, i12));
            }
        }
    }

    public static ArrayList a() {
        if (f == null) {
            ArrayList arrayList = new ArrayList();
            f = arrayList;
            arrayList.add(new x("./."));
            f.add(new x(".."));
            f.add(new x("../."));
            f.add(new x("./.."));
            f.add(new x("././."));
            f.add(new x("..."));
            f.add(new x("../.."));
            f.add(new x("./../.."));
            f.add(new x("../../."));
            f.add(new x("../../.."));
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                f.add(new x("../../../.."));
                f.add(new x(".../.../..."));
                f.add(new x("..../..../...."));
                f.add(new x(".../.../.../..."));
            }
        }
        return f;
    }

    public static int b() {
        ArrayList a2 = a();
        int size = a2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = a2.get(i11);
            i11++;
            i10 = Math.max(i10, ((x) obj).e.size());
        }
        return i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        return TextUtils.equals(this.a, ((x) obj).a);
    }

    public final String toString() {
        return this.a;
    }
}
