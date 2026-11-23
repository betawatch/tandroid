package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class gz {
    public final ArrayList a;

    public gz() {
        File file = new File(System.getProperty("java.io.tmpdir"));
        if (!file.exists()) {
            file.mkdirs();
        }
        this.a = new ArrayList();
    }

    public void a() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e10) {
                yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e10);
            }
        }
        arrayList.clear();
    }

    public gz(ArrayList arrayList) {
        this.a = arrayList;
    }
}
