package org.telegram.messenger;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class c1 {
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
                arrayList.add(new b1(file2));
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
