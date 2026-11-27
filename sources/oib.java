// default package

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class oib extends ArrayList {
    public final Class a;
    public final Class b;

    public oib(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ko9 h() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance((Class<?>) this.b, size);
        for (int i = 0; i < size; i++) {
            objArr[i] = ((Pair) get(i)).first;
            objArr2[i] = ((Pair) get(i)).second;
        }
        return new ko9(objArr, objArr2);
    }
}
