package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class f implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(String str, Context context, Object obj, int i10, int i11) {
        this.a = i11;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.a;
        int i11 = this.d;
        Object obj = this.e;
        Context context = this.c;
        String str = this.b;
        switch (i10) {
            case 0:
                Object[] objArr = {(e) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return h.b(str, context, DesugarCollections.unmodifiableList(arrayList), i11);
            default:
                try {
                    return h.b(str, context, (List) obj, i11);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
