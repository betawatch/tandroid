package l1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import b8.ib;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends hd.j implements od.l {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, fd.c cVar, int i3) {
        super(1, cVar);
        this.a = i3;
        this.c = obj;
    }

    @Override // hd.a
    public final fd.c create(fd.c cVar) {
        switch (this.a) {
            case 0:
                return new e((n1.d) this.c, cVar, 0);
            default:
                return new e((x) this.c, cVar, 1);
        }
    }

    @Override // od.l
    public final Object invoke(Object obj) {
        fd.c cVar = (fd.c) obj;
        switch (this.a) {
        }
        return ((e) create(cVar)).invokeSuspend(dd.k.a);
    }

    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        String str;
        switch (this.a) {
            case 0:
                gd.a aVar = gd.a.a;
                int i3 = this.b;
                dd.k kVar = dd.k.a;
                if (i3 == 0) {
                    ib.b(obj);
                    n1.d dVar = (n1.d) this.c;
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
                            n1.b.a(context, str);
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
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                return kVar;
            default:
                gd.a aVar2 = gd.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                    return obj;
                }
                ib.b(obj);
                x xVar = (x) this.c;
                this.b = 1;
                Object invoke = xVar.invoke(this);
                return invoke == aVar2 ? aVar2 : invoke;
        }
    }
}
