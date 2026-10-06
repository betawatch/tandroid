package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk b;

    public /* synthetic */ ek(rk rkVar, int i10) {
        this.a = i10;
        this.b = rkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        lk lkVar = (lk) obj;
        lk lkVar2 = (lk) obj2;
        switch (this.a) {
            case 0:
                rk rkVar = this.b;
                rkVar.getClass();
                File file = lkVar.f;
                if (file != null) {
                    if (lkVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != lkVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || rkVar.c0) {
                            break;
                        } else {
                            long lastModified = lkVar.f.lastModified();
                            long lastModified2 = lkVar2.f.lastModified();
                            if (lastModified != lastModified2) {
                                if (lastModified > lastModified2) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                if (this.b.c0) {
                    break;
                } else {
                    long lastModified3 = lkVar.f.lastModified();
                    long lastModified4 = lkVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return lkVar.f.getName().compareToIgnoreCase(lkVar2.f.getName());
    }
}
