package dg;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class l extends m {
    public static final List b = Arrays.asList(new i(), new j(), new k(), new h(), new g());

    public static l p(int i10) {
        List list = b;
        if (i10 >= 0 && i10 <= list.size()) {
            return (l) list.get(i10);
        }
        StringBuilder sb = new StringBuilder("Shape type must be in range from 0 to ");
        sb.append(list.size() - 1);
        sb.append(", but got ");
        sb.append(i10);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    @Override // dg.m
    public final float a() {
        return 1.0f;
    }

    @Override // dg.m
    public final String i(int i10) {
        if (i10 == 0 || i10 == 1) {
            return "shape";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }

    public abstract int m();

    public abstract String n();

    public abstract int o();
}
