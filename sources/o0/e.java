package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(String str, Context context, Object obj, int i9, int i10) {
        this.a = i10;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i9;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i9 = this.a;
        int i10 = this.d;
        Object obj = this.e;
        Context context = this.c;
        String str = this.b;
        switch (i9) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return g.b(str, context, DesugarCollections.unmodifiableList(arrayList), i10);
            default:
                try {
                    return g.b(str, context, (List) obj, i10);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
