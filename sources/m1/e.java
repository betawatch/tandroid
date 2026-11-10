package m1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e extends kd.j implements rd.l {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, id.c cVar, int i7) {
        super(1, cVar);
        this.a = i7;
        this.c = obj;
    }

    @Override // kd.a
    public final id.c create(id.c cVar) {
        switch (this.a) {
            case 0:
                return new e((o1.d) this.c, cVar, 0);
            default:
                return new e((x) this.c, cVar, 1);
        }
    }

    @Override // rd.l
    public final Object invoke(Object obj) {
        id.c cVar = (id.c) obj;
        switch (this.a) {
        }
        return ((e) create(cVar)).invokeSuspend(gd.k.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        switch (this.a) {
            case 0:
                jd.a aVar = jd.a.a;
                int i7 = this.b;
                gd.k kVar = gd.k.a;
                if (i7 == 0) {
                    af.b.c(obj);
                    o1.d dVar = (o1.d) this.c;
                    this.b = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) dVar.e.getValue()).edit();
                    LinkedHashSet linkedHashSet = dVar.f;
                    if (linkedHashSet == null) {
                        edit.clear();
                    } else {
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            edit.remove((String) it.next());
                        }
                    }
                    if (!edit.commit()) {
                        throw new IOException("Unable to delete migrated keys from SharedPreferences.");
                    }
                    if (((SharedPreferences) dVar.e.getValue()).getAll().isEmpty() && (context = dVar.c) != null && (str = dVar.d) != null) {
                        if (Build.VERSION.SDK_INT >= 24) {
                            o1.b.a(context, str);
                        } else {
                            File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                            File file2 = new File(file.getPath() + ".bak");
                            file.delete();
                            file2.delete();
                        }
                    }
                    if (linkedHashSet != null) {
                        linkedHashSet.clear();
                    }
                    if (kVar == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                return kVar;
            default:
                jd.a aVar2 = jd.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                    return obj;
                }
                af.b.c(obj);
                x xVar = (x) this.c;
                this.b = 1;
                Object invoke = xVar.invoke(this);
                return invoke == aVar2 ? aVar2 : invoke;
        }
    }
}
