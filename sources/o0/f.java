package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class f implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(String str, Context context, Object obj, int i3, int i10) {
        this.a = i10;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i3 = this.a;
        int i10 = this.d;
        Object obj = this.e;
        Context context = this.c;
        String str = this.b;
        switch (i3) {
            case 0:
                Object[] objArr = {(e) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return h.b(str, context, DesugarCollections.unmodifiableList(arrayList), i10);
            default:
                try {
                    return h.b(str, context, (List) obj, i10);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
