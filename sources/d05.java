// default package

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class d05 extends hg0 {
    public final Set E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d05(int i, k05 k05Var, l05 l05Var, oxb oxbVar, Context context, Looper looper) {
        super(context, looper, r5, i, new i09((Object) k05Var, (byte) 25), new k09(l05Var, (byte) 22), (String) oxbVar.e);
        aef aefVar;
        synchronized (aef.g) {
            aef aefVar2 = aef.h;
            if (aefVar2 == null) {
                aefVar2 = new aef(context.getApplicationContext(), context.getMainLooper());
                aef.h = aefVar2;
            }
            aefVar = aefVar2;
        }
        Object obj = i05.d;
        xve.h(k05Var);
        xve.h(l05Var);
        Set set = (Set) oxbVar.b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                grb.i("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.E = set;
    }
}
