package h2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.biometric.k;
import androidx.core.graphics.drawable.IconCompat;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import c0.l;
import com.google.android.gms.common.api.internal.s1;
import e0.o0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ l c;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl d;

    public /* synthetic */ e(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, ArrayList arrayList, l lVar, int i10) {
        this.a = i10;
        this.d = shortcutInfoCompatSaverImpl;
        this.b = arrayList;
        this.c = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        if (r8 != 5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        g0.c cVar;
        o0[] o0VarArr;
        PersistableBundle persistableBundle;
        switch (this.a) {
            case 0:
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.d;
                    if (i10 >= size) {
                        shortcutInfoCompatSaverImpl.h(this.c);
                        return;
                    }
                    Object obj = arrayList.get(i10);
                    i10++;
                    String str3 = (String) obj;
                    shortcutInfoCompatSaverImpl.b.remove(str3);
                    v8.a aVar = (v8.a) shortcutInfoCompatSaverImpl.c.remove(str3);
                    if (aVar != null) {
                        aVar.cancel(false);
                    }
                }
            default:
                ArrayList arrayList2 = this.b;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (true) {
                    ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl2 = this.d;
                    if (i11 >= size2) {
                        shortcutInfoCompatSaverImpl2.h(this.c);
                        return;
                    }
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    g0.c cVar2 = (g0.c) obj2;
                    Set set = cVar2.j;
                    if (set != null && !set.isEmpty()) {
                        IconCompat iconCompat = cVar2.h;
                        if (iconCompat != null) {
                            int i12 = iconCompat.i();
                            if (i12 != 1) {
                                if (i12 != 2) {
                                    break;
                                } else {
                                    str = shortcutInfoCompatSaverImpl2.a.getResources().getResourceName(iconCompat.g());
                                    str2 = null;
                                    cVar = new g0.c();
                                    cVar.a = cVar2.a;
                                    cVar.b = cVar2.b;
                                    Intent[] intentArr = cVar2.c;
                                    cVar.c = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
                                    cVar.d = cVar2.d;
                                    cVar.e = cVar2.e;
                                    cVar.f = cVar2.f;
                                    cVar.g = cVar2.g;
                                    cVar.h = cVar2.h;
                                    cVar.k = cVar2.k;
                                    cVar.l = cVar2.l;
                                    cVar.m = cVar2.m;
                                    o0VarArr = cVar2.i;
                                    if (o0VarArr != null) {
                                        cVar.i = (o0[]) Arrays.copyOf(o0VarArr, o0VarArr.length);
                                    }
                                    if (cVar2.j != null) {
                                        cVar.j = new HashSet(cVar2.j);
                                    }
                                    persistableBundle = cVar2.n;
                                    if (persistableBundle != null) {
                                        cVar.n = persistableBundle;
                                    }
                                    cVar.h = null;
                                    if (TextUtils.isEmpty(cVar.e)) {
                                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                                    }
                                    Intent[] intentArr2 = cVar.c;
                                    if (intentArr2 != null && intentArr2.length != 0) {
                                        h hVar = new h(cVar, str, str2);
                                        Bitmap f10 = str2 != null ? cVar2.h.f() : null;
                                        String str4 = cVar2.b;
                                        shortcutInfoCompatSaverImpl2.b.put(str4, hVar);
                                        if (f10 != null) {
                                            s1 s1Var = new s1(shortcutInfoCompatSaverImpl2, f10, str2, 3);
                                            l lVar = new l();
                                            shortcutInfoCompatSaverImpl2.e.submit(new k(lVar, s1Var, false, 15));
                                            v8.a aVar2 = (v8.a) shortcutInfoCompatSaverImpl2.c.put(str4, lVar);
                                            if (aVar2 != null) {
                                                aVar2.cancel(false);
                                            }
                                            lVar.c(new s1(this, str4, lVar), shortcutInfoCompatSaverImpl2.d);
                                        }
                                    }
                                }
                            }
                            str2 = new File(shortcutInfoCompatSaverImpl2.g, UUID.randomUUID().toString()).getAbsolutePath();
                            str = null;
                            cVar = new g0.c();
                            cVar.a = cVar2.a;
                            cVar.b = cVar2.b;
                            Intent[] intentArr3 = cVar2.c;
                            cVar.c = (Intent[]) Arrays.copyOf(intentArr3, intentArr3.length);
                            cVar.d = cVar2.d;
                            cVar.e = cVar2.e;
                            cVar.f = cVar2.f;
                            cVar.g = cVar2.g;
                            cVar.h = cVar2.h;
                            cVar.k = cVar2.k;
                            cVar.l = cVar2.l;
                            cVar.m = cVar2.m;
                            o0VarArr = cVar2.i;
                            if (o0VarArr != null) {
                            }
                            if (cVar2.j != null) {
                            }
                            persistableBundle = cVar2.n;
                            if (persistableBundle != null) {
                            }
                            cVar.h = null;
                            if (TextUtils.isEmpty(cVar.e)) {
                            }
                        }
                        str = null;
                        str2 = null;
                        cVar = new g0.c();
                        cVar.a = cVar2.a;
                        cVar.b = cVar2.b;
                        Intent[] intentArr32 = cVar2.c;
                        cVar.c = (Intent[]) Arrays.copyOf(intentArr32, intentArr32.length);
                        cVar.d = cVar2.d;
                        cVar.e = cVar2.e;
                        cVar.f = cVar2.f;
                        cVar.g = cVar2.g;
                        cVar.h = cVar2.h;
                        cVar.k = cVar2.k;
                        cVar.l = cVar2.l;
                        cVar.m = cVar2.m;
                        o0VarArr = cVar2.i;
                        if (o0VarArr != null) {
                        }
                        if (cVar2.j != null) {
                        }
                        persistableBundle = cVar2.n;
                        if (persistableBundle != null) {
                        }
                        cVar.h = null;
                        if (TextUtils.isEmpty(cVar.e)) {
                        }
                    }
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
        }
    }
}
