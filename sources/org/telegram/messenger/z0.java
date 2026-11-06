package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public abstract class z0 {
    public static final Set a = Collections.newSetFromMap(new ConcurrentHashMap());

    public static void a(File file, ArrayList arrayList) {
        File[] listFiles;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2, arrayList);
            } else if (!file2.getName().equals(".nomedia") && !a.contains(file2.getAbsolutePath())) {
                arrayList.add(new y0(file2));
            }
        }
    }

    public static void b(File file) {
        String absolutePath;
        if (file == null || (absolutePath = file.getAbsolutePath()) == null) {
            return;
        }
        a.remove(absolutePath);
    }
}
