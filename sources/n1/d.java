package n1;

import android.content.Context;
import android.content.SharedPreferences;
import b8.hb;
import b8.ib;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;
import o1.i;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d {
    public final ja.b a;
    public final i b;
    public final Context c;
    public final String d;
    public final dd.i e;
    public final LinkedHashSet f;

    public d(Context context, String sharedPreferencesName, Set keysToMigrate, ja.b bVar, i iVar) {
        j.e(context, "context");
        j.e(sharedPreferencesName, "sharedPreferencesName");
        j.e(keysToMigrate, "keysToMigrate");
        a aVar = new a(0, context, sharedPreferencesName);
        this.a = bVar;
        this.b = iVar;
        this.c = context;
        this.d = sharedPreferencesName;
        this.e = hb.b(aVar);
        this.f = keysToMigrate == e.a ? null : new LinkedHashSet(keysToMigrate);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r5.isEmpty() == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, hd.c cVar) {
        c cVar2;
        Object obj2;
        int i3;
        d dVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                cVar2.d = i10 - TLObject.FLAG_31;
                obj2 = cVar2.b;
                gd.a aVar = gd.a.a;
                i3 = cVar2.d;
                boolean z10 = true;
                if (i3 != 0) {
                    ib.b(obj2);
                    cVar2.a = this;
                    cVar2.d = 1;
                    obj2 = this.a.invoke(obj, cVar2);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    dVar = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = cVar2.a;
                    ib.b(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = dVar.f;
                dd.i iVar = dVar.e;
                if (linkedHashSet != null) {
                    SharedPreferences sharedPreferences = (SharedPreferences) iVar.getValue();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            if (sharedPreferences.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z10 = false;
                    return Boolean.valueOf(z10);
                }
                Map<String, ?> all = ((SharedPreferences) iVar.getValue()).getAll();
                j.d(all, "sharedPrefs.all");
            }
        }
        cVar2 = new c(this, cVar);
        obj2 = cVar2.b;
        gd.a aVar2 = gd.a.a;
        i3 = cVar2.d;
        boolean z102 = true;
        if (i3 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
