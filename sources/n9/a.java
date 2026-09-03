package n9;

import android.util.Log;
import e3.g;
import e5.f;
import i9.i;
import i9.k;
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
import k9.a2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final l9.a g = new l9.a();
    public static final f h = new f(21);
    public static final i i = new i(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final b b;
    public final g c;
    public final k d;

    public a(b bVar, g gVar, k kVar) {
        this.b = bVar;
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
        f fVar = h;
        Collections.sort(arrayList, fVar);
        List e6 = b.e(bVar.d.listFiles());
        Collections.sort(e6, fVar);
        arrayList.addAll(e6);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.e(this.b.c.list())).descendingSet();
    }

    public final void d(a2 a2Var, String str, boolean z4) {
        b bVar = this.b;
        int i10 = this.c.d().a.a;
        g.getClass();
        try {
            f(bVar.b(str, android.support.v4.media.a.o("event", String.format(Locale.US, "%010d", Integer.valueOf(this.a.getAndIncrement())), z4 ? "_" : "")), l9.a.a.d(a2Var));
        } catch (IOException e6) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e6);
        }
        i iVar = new i(3);
        bVar.getClass();
        File file = new File(bVar.c, str);
        file.mkdirs();
        List<File> e10 = b.e(file.listFiles(iVar));
        Collections.sort(e10, new f(22));
        int size = e10.size();
        for (File file2 : e10) {
            if (size <= i10) {
                return;
            }
            b.d(file2);
            size--;
        }
    }
}
