package ga;

import a8.p0;
import aa.h;
import aa.j;
import aa.l;
import aa.m;
import android.os.Build;
import android.util.Log;
import da.e2;
import da.k2;
import da.q2;
import da.s0;
import da.t0;
import da.u0;
import da.u1;
import da.v0;
import da.w0;
import da.z0;
import da.z1;
import j$.util.Optional;
import j$.util.function.Function$-CC;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final ea.a g = new ea.a();
    public static final a3.c h = new a3.c(28);
    public static final h i = new h(3);
    public final AtomicInteger a = new AtomicInteger(0);
    public final d b;
    public final ia.c c;
    public final j d;

    public b(d dVar, ia.c cVar, j jVar) {
        this.b = dVar;
        this.c = cVar;
        this.d = jVar;
    }

    public static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String f(File file) {
        byte[] bArr = new byte[TLObject.FLAG_13];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void g(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final q2 a(String str, final t0 t0Var) {
        String str2 = t0Var.b;
        return Build.VERSION.SDK_INT >= 37 ? (str2.equals("crash") || str2.equals("ndk-crash")) ? (q2) Optional.of(this.b.b(str, "profiling-manager-info")).filter(new m(3)).flatMap(new l(1)).map(new Function() { // from class: ga.a
            public /* synthetic */ Function andThen(Function function) {
                return Function$-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                z1 z1Var = (z1) obj;
                t0 t0Var2 = t0.this;
                s0 a10 = t0Var2.a();
                k2 k2Var = t0Var2.c;
                u0 a11 = k2Var.a();
                w0 w0Var = (w0) ((v0) k2Var).a;
                List list = w0Var.a;
                e2 e2Var = w0Var.b;
                u1 u1Var = w0Var.c;
                z0 z0Var = w0Var.e;
                List list2 = w0Var.f;
                if (list2 != null) {
                    a11.a = new w0(list, e2Var, u1Var, z1Var, z0Var, list2);
                    a10.c = a11.a();
                    return a10.a();
                }
                StringBuilder sb2 = new StringBuilder();
                if (list2 == null) {
                    sb2.append(" binaries");
                }
                throw new IllegalStateException(p0.q("Missing required properties:", sb2));
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$-CC.$default$compose(this, function);
            }
        }).orElse(t0Var) : t0Var : t0Var;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        d dVar = this.b;
        arrayList.addAll(d.i(((File) dVar.h).listFiles()));
        arrayList.addAll(d.i(((File) dVar.n).listFiles()));
        a3.c cVar = h;
        Collections.sort(arrayList, cVar);
        List i7 = d.i(((File) dVar.f).listFiles());
        Collections.sort(i7, cVar);
        arrayList.addAll(i7);
        return arrayList;
    }

    public final NavigableSet d() {
        return new TreeSet(d.i(((File) this.b.e).list())).descendingSet();
    }

    public final void e(q2 q2Var, String str, boolean z9) {
        d dVar = this.b;
        int i7 = this.c.b().a.a;
        g.getClass();
        try {
            g(dVar.b(str, p0.p("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z9 ? "_" : "")), ea.a.a.u(q2Var));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        h hVar = new h(4);
        dVar.getClass();
        File file = new File((File) dVar.e, str);
        file.mkdirs();
        List<File> i10 = d.i(file.listFiles(hVar));
        Collections.sort(i10, new a3.c(29));
        int size = i10.size();
        for (File file2 : i10) {
            if (size <= i7) {
                return;
            }
            d.h(file2);
            size--;
        }
    }
}
