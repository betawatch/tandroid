package l9;

import a4.w;
import android.util.Log;
import c5.e;
import e3.f;
import g9.i;
import g9.k;
import i9.a2;
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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final j9.a g = new j9.a();
    public static final e h = new e(23);
    public static final i i = new i(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final b b;
    public final f c;
    public final k d;

    public a(b bVar, f fVar, k kVar) {
        this.b = bVar;
        this.c = fVar;
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
        b bVar = this.b;
        arrayList.addAll(b.e(bVar.e.listFiles()));
        arrayList.addAll(b.e(bVar.f.listFiles()));
        e eVar = h;
        Collections.sort(arrayList, eVar);
        List e10 = b.e(bVar.d.listFiles());
        Collections.sort(e10, eVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.e(this.b.c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z10) {
        b bVar = this.b;
        int i10 = this.c.d().a.a;
        g.getClass();
        try {
            f(bVar.b(str, w.n("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z10 ? "_" : "")), j9.a.a.y(a2Var));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        i iVar = new i(3);
        bVar.getClass();
        File file = new File(bVar.c, str);
        file.mkdirs();
        List<File> e11 = b.e(file.listFiles(iVar));
        Collections.sort(e11, new e(24));
        int size = e11.size();
        for (File file2 : e11) {
            if (size <= i10) {
                return;
            }
            b.d(file2);
            size--;
        }
    }
}
