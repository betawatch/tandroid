package k9;

import a9.p;
import android.util.Log;
import c3.g;
import f9.i;
import f9.k;
import h9.a2;
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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final i9.a g = new i9.a();
    public static final a h = new a(0);
    public static final i i = new i(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final c b;
    public final g c;
    public final k d;

    public b(c cVar, g gVar, k kVar) {
        this.b = cVar;
        this.c = gVar;
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
        a aVar = h;
        Collections.sort(arrayList, aVar);
        List e9 = c.e(cVar.d.listFiles());
        Collections.sort(e9, aVar);
        arrayList.addAll(e9);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(this.b.c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z10) {
        c cVar = this.b;
        int i10 = this.c.d().a.a;
        g.getClass();
        int i11 = 1;
        try {
            f(cVar.b(str, p.m("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z10 ? "_" : "")), i9.a.a.h(a2Var));
        } catch (IOException e9) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e9);
        }
        i iVar = new i(3);
        cVar.getClass();
        File file = new File(cVar.c, str);
        file.mkdirs();
        List<File> e10 = c.e(file.listFiles(iVar));
        Collections.sort(e10, new a(i11));
        int size = e10.size();
        for (File file2 : e10) {
            if (size <= i10) {
                return;
            }
            c.d(file2);
            size--;
        }
    }
}
