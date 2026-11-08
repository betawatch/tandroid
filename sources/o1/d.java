package o1;

import a8.ab;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;
import org.telegram.tgnet.TLObject;
import p1.i;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class d {
    public final ka.b a;
    public final i b;
    public final Context c;
    public final String d;
    public final gd.i e;
    public final LinkedHashSet f;

    public d(Context context, String sharedPreferencesName, Set keysToMigrate, ka.b bVar, i iVar) {
        j.e(context, "context");
        j.e(sharedPreferencesName, "sharedPreferencesName");
        j.e(keysToMigrate, "keysToMigrate");
        a aVar = new a(0, context, sharedPreferencesName);
        this.a = bVar;
        this.b = iVar;
        this.c = context;
        this.d = sharedPreferencesName;
        this.e = ab.b(aVar);
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
    public final Object a(Object obj, kd.c cVar) {
        c cVar2;
        Object obj2;
        int i7;
        d dVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                cVar2.d = i10 - TLObject.FLAG_31;
                obj2 = cVar2.b;
                jd.a aVar = jd.a.a;
                i7 = cVar2.d;
                boolean z9 = true;
                if (i7 != 0) {
                    af.b.c(obj2);
                    cVar2.a = this;
                    cVar2.d = 1;
                    obj2 = this.a.invoke(obj, cVar2);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    dVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = cVar2.a;
                    af.b.c(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boolean.FALSE;
                }
                LinkedHashSet linkedHashSet = dVar.f;
                gd.i iVar = dVar.e;
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
                    z9 = false;
                    return Boolean.valueOf(z9);
                }
                Map<String, ?> all = ((SharedPreferences) iVar.getValue()).getAll();
                j.d(all, "sharedPrefs.all");
            }
        }
        cVar2 = new c(this, cVar);
        obj2 = cVar2.b;
        jd.a aVar2 = jd.a.a;
        i7 = cVar2.d;
        boolean z92 = true;
        if (i7 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
