package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class fz {
    public final ArrayList a;

    public fz() {
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

    public fz(ArrayList arrayList) {
        this.a = arrayList;
    }
}
