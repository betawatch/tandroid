package ne;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import b8.jd;
import g2.q0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.lt;
import org.telegram.ui.rw;
import r4.n;
import r4.s0;
import r4.v;
import r4.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class h {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;
    public Object h;

    public h(ba.i composer, me.b bVar, j jVar, h[] hVarArr) {
        kotlin.jvm.internal.j.e(composer, "composer");
        this.b = composer;
        this.c = bVar;
        this.d = jVar;
        this.e = hVarArr;
        this.f = bVar.a;
        int ordinal = jVar.ordinal();
        if (hVarArr != null) {
            h hVar = hVarArr[ordinal];
            if (hVar == null && hVar == this) {
                return;
            }
            hVarArr[ordinal] = this;
        }
    }

    public h a(je.d descriptor) {
        h hVar;
        h[] hVarArr = (h[]) this.e;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        me.b bVar = (me.b) this.c;
        j f10 = f.f(descriptor, bVar);
        char c2 = f10.a;
        ba.i iVar = (ba.i) this.b;
        iVar.j(c2);
        iVar.b = true;
        String str = (String) this.g;
        if (str != null) {
            String str2 = (String) this.h;
            if (str2 == null) {
                str2 = descriptor.a();
            }
            iVar.i();
            j(str);
            iVar.j(':');
            j(str2);
            this.g = null;
            this.h = null;
        }
        return ((j) this.d) == f10 ? this : (hVarArr == null || (hVar = hVarArr[f10.ordinal()]) == null) ? new h(iVar, bVar, f10, hVarArr) : hVar;
    }

    public void b(je.d descriptor, int i3) {
        ba.i iVar = (ba.i) this.b;
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        int ordinal = ((j) this.d).ordinal();
        boolean z10 = true;
        if (ordinal == 1) {
            if (!iVar.b) {
                iVar.j(',');
            }
            iVar.i();
            return;
        }
        if (ordinal == 2) {
            if (iVar.b) {
                this.a = true;
                iVar.i();
                return;
            }
            if (i3 % 2 == 0) {
                iVar.j(',');
                iVar.i();
            } else {
                iVar.j(':');
                iVar.k();
                z10 = false;
            }
            this.a = z10;
            return;
        }
        if (ordinal != 3) {
            if (!iVar.b) {
                iVar.j(',');
            }
            iVar.i();
            f.e(descriptor, (me.b) this.c);
            j(descriptor.g(i3));
            iVar.j(':');
            iVar.k();
            return;
        }
        if (i3 == 0) {
            this.a = true;
        }
        if (i3 == 1) {
            iVar.j(',');
            iVar.k();
            this.a = false;
        }
    }

    public void c(int i3) {
        if (this.a) {
            j(String.valueOf(i3));
        } else {
            ((jc.a) ((ba.i) this.b).c).c(String.valueOf(i3));
        }
    }

    public void d(long j10) {
        if (this.a) {
            j(String.valueOf(j10));
        } else {
            ((jc.a) ((ba.i) this.b).c).c(String.valueOf(j10));
        }
    }

    public void e(je.d descriptor, int i3, long j10) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        b(descriptor, i3);
        d(j10);
    }

    public void f() {
        ba.i iVar = (ba.i) this.b;
        iVar.getClass();
        kotlin.jvm.internal.j.e("null", "v");
        ((jc.a) iVar.c).c("null");
    }

    public void g(je.d descriptor, int i3, he.a serializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        if (obj != null || ((q0) this.f).b) {
            kotlin.jvm.internal.j.e(descriptor, "descriptor");
            kotlin.jvm.internal.j.e(serializer, "serializer");
            b(descriptor, i3);
            if (serializer.d().c()) {
                i(serializer, obj);
            } else if (obj == null) {
                f();
            } else {
                i(serializer, obj);
            }
        }
    }

    public void h(je.d descriptor, int i3, he.a serializer, Object obj) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(serializer, "serializer");
        b(descriptor, i3);
        i(serializer, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(he.a serializer, Object obj) {
        String str;
        kotlin.jvm.internal.j.e(serializer, "serializer");
        q0 q0Var = ((me.b) this.c).a;
        q0Var.getClass();
        int ordinal = ((me.a) q0Var.f).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                jd e10 = serializer.d().e();
                if (kotlin.jvm.internal.j.a(e10, je.f.b) || kotlin.jvm.internal.j.a(e10, je.f.e)) {
                    je.d d = serializer.d();
                    kotlin.jvm.internal.j.e(d, "<this>");
                    Iterator it = d.getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str = (String) q0Var.e;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof me.c) {
                            str = ((me.c) annotation).discriminator();
                            break;
                        }
                    }
                    if (str != null) {
                        String a10 = serializer.d().a();
                        this.g = str;
                        this.h = a10;
                    }
                    serializer.c(this, obj);
                }
            } else if (ordinal != 2) {
                throw new androidx.car.app.j();
            }
        }
        str = null;
        if (str != null) {
        }
        serializer.c(this, obj);
    }

    public void j(String value) {
        int i3;
        kotlin.jvm.internal.j.e(value, "value");
        ba.i iVar = (ba.i) this.b;
        iVar.getClass();
        kotlin.jvm.internal.j.e(value, "value");
        jc.a aVar = (jc.a) iVar.c;
        aVar.a(aVar.c, value.length() + 2);
        char[] cArr = aVar.b;
        int i10 = aVar.c;
        int i11 = i10 + 1;
        cArr[i10] = '\"';
        int length = value.length();
        value.getChars(0, length, cArr, i11);
        int i12 = length + i11;
        int i13 = i11;
        while (i13 < i12) {
            char c2 = cArr[i13];
            byte[] bArr = i.b;
            if (c2 < bArr.length && bArr[c2] != 0) {
                int length2 = value.length();
                for (int i14 = i13 - i11; i14 < length2; i14++) {
                    aVar.a(i13, 2);
                    char charAt = value.charAt(i14);
                    byte[] bArr2 = i.b;
                    if (charAt < bArr2.length) {
                        byte b10 = bArr2[charAt];
                        if (b10 == 0) {
                            i3 = i13 + 1;
                            aVar.b[i13] = charAt;
                        } else {
                            if (b10 == 1) {
                                String str = i.a[charAt];
                                kotlin.jvm.internal.j.b(str);
                                aVar.a(i13, str.length());
                                str.getChars(0, str.length(), aVar.b, i13);
                                int length3 = str.length() + i13;
                                aVar.c = length3;
                                i13 = length3;
                            } else {
                                char[] cArr2 = aVar.b;
                                cArr2[i13] = '\\';
                                cArr2[i13 + 1] = (char) b10;
                                i13 += 2;
                                aVar.c = i13;
                            }
                        }
                    } else {
                        i3 = i13 + 1;
                        aVar.b[i13] = charAt;
                    }
                    i13 = i3;
                }
                aVar.a(i13, 1);
                aVar.b[i13] = '\"';
                aVar.c = i13 + 1;
                return;
            }
            i13++;
        }
        cArr[i12] = '\"';
        aVar.c = i12 + 1;
    }

    public void k(je.d descriptor, int i3, String value) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        kotlin.jvm.internal.j.e(value, "value");
        b(descriptor, i3);
        j(value);
    }

    public void l(je.d descriptor) {
        kotlin.jvm.internal.j.e(descriptor, "descriptor");
        j jVar = (j) this.d;
        ba.i iVar = (ba.i) this.b;
        iVar.getClass();
        iVar.b = false;
        iVar.j(jVar.b);
    }

    public FileInputStream m(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((t4.d) this.c).r();
            return null;
        }
    }

    public void n(int i3, Serializable serializable) {
        ((Executor) this.b).execute(new rw(this, i3, serializable, 24));
    }

    public void o() {
        int i3;
        r4.e eVar = (r4.e) this.c;
        PackageManager packageManager = (PackageManager) this.e;
        ArrayList arrayList = (ArrayList) this.f;
        if (this.a) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i10 = 0;
            while (true) {
                boolean z10 = true;
                if (!it2.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((y.c == null ? false : y.c().f()) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList2.get(i11);
                            i11++;
                            ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        ComponentName componentName = ((s0) arrayList.get(i12)).r;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (i12 < 0) {
                        s0 s0Var = new s0((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        s0Var.G = new e3(this, s0Var);
                        if (!s0Var.x) {
                            s0Var.x = true;
                            s0Var.r();
                        }
                        i3 = i10 + 1;
                        arrayList.add(i10, s0Var);
                        eVar.a(s0Var, false);
                    } else if (i12 >= i10) {
                        s0 s0Var2 = (s0) arrayList.get(i12);
                        if (!s0Var2.x) {
                            s0Var2.x = true;
                            s0Var2.r();
                        }
                        if (s0Var2.E == null) {
                            if (!s0Var2.x || (((n) s0Var2.h) == null && s0Var2.w.isEmpty())) {
                                z10 = false;
                            }
                            if (z10) {
                                s0Var2.q();
                                s0Var2.n();
                            }
                        }
                        i3 = i10 + 1;
                        Collections.swap(arrayList, i12, i10);
                    }
                    i10 = i3;
                }
            }
            if (i10 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i10; size3--) {
                    s0 s0Var3 = (s0) arrayList.get(size3);
                    v d = eVar.d(s0Var3);
                    if (d != null) {
                        s0Var3.getClass();
                        y.b();
                        s0Var3.f = null;
                        s0Var3.h(null);
                        eVar.m(d, null);
                        eVar.a.b(514, d);
                        eVar.l.remove(d);
                    }
                    arrayList.remove(s0Var3);
                    s0Var3.G = null;
                    if (s0Var3.x) {
                        s0Var3.x = false;
                        s0Var3.r();
                    }
                }
            }
        }
    }

    public boolean p(je.d dVar) {
        ((q0) this.f).getClass();
        return false;
    }

    public h(Context context, r4.e eVar) {
        this.f = new ArrayList();
        this.g = new androidx.mediarouter.app.f(this, 12);
        this.h = new lt(this, 22);
        this.b = context;
        this.c = eVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public h(AssetManager assetManager, Executor executor, t4.d dVar, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = dVar;
        this.g = str;
        this.e = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 >= 24 && i3 <= 34) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = t4.e.h;
                    break;
                case 26:
                    bArr = t4.e.g;
                    break;
                case 27:
                    bArr = t4.e.f;
                    break;
                case 28:
                case 29:
                case hs.T /* 30 */:
                    bArr = t4.e.e;
                    break;
                case hs.U /* 31 */:
                case 32:
                case 33:
                case 34:
                    bArr = t4.e.d;
                    break;
            }
        }
        this.d = bArr;
    }
}
