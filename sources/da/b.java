package da;

import a1.g;
import a4.d;
import aa.b0;
import aa.c2;
import android.util.Log;
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
import y9.j;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final ba.a g = new ba.a();
    public static final d h = new d(7);
    public static final a i = new a(0);
    public final AtomicInteger a = new AtomicInteger(0);
    public final c b;
    public final b0 c;
    public final j d;

    public b(c cVar, b0 b0Var, j jVar) {
        this.b = cVar;
        this.c = b0Var;
        this.d = jVar;
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

    public static void f(File file, String str) {
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

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        c cVar = this.b;
        arrayList.addAll(c.e(cVar.e.listFiles()));
        arrayList.addAll(c.e(cVar.f.listFiles()));
        d dVar = h;
        Collections.sort(arrayList, dVar);
        List e10 = c.e(cVar.d.listFiles());
        Collections.sort(e10, dVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(c.e(this.b.c.list())).descendingSet();
    }

    public final void d(c2 c2Var, String str, boolean z10) {
        c cVar = this.b;
        int i10 = this.c.d().a.a;
        g.getClass();
        try {
            f(cVar.b(str, g.p("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z10 ? "_" : "")), ba.a.a.c(c2Var));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        a aVar = new a(1);
        cVar.getClass();
        File file = new File(cVar.c, str);
        file.mkdirs();
        List<File> e11 = c.e(file.listFiles(aVar));
        Collections.sort(e11, new d(8));
        int size = e11.size();
        for (File file2 : e11) {
            if (size <= i10) {
                return;
            }
            c.d(file2);
            size--;
        }
    }
}
