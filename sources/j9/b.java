package j9;

import a5.e;
import aa.d;
import android.util.Log;
import c3.h;
import e9.i;
import e9.k;
import g9.a2;
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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final h9.c g = new h9.c();
    public static final e h = new e(29);
    public static final i i = new i(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final c b;
    public final h c;
    public final k d;

    public b(c cVar, h hVar, k kVar) {
        this.b = cVar;
        this.c = hVar;
        this.d = kVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
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
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.b;
        arrayList.addAll(c.e(cVar.e.listFiles()));
        arrayList.addAll(c.e(cVar.f.listFiles()));
        e eVar = h;
        Collections.sort(arrayList, eVar);
        List e10 = c.e(cVar.d.listFiles());
        Collections.sort(e10, eVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(this.b.c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z10) {
        c cVar = this.b;
        int i9 = this.c.d().a.a;
        g.getClass();
        int i10 = 0;
        try {
            f(cVar.b(str, d.o("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z10 ? "_" : "")), h9.c.a.u(a2Var));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        i iVar = new i(3);
        cVar.getClass();
        File file = new File(cVar.c, str);
        file.mkdirs();
        List<File> e11 = c.e(file.listFiles(iVar));
        Collections.sort(e11, new a(i10));
        int size = e11.size();
        for (File file2 : e11) {
            if (size <= i9) {
                return;
            }
            c.d(file2);
            size--;
        }
    }
}
