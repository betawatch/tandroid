package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ xj b;

    public /* synthetic */ hj(xj xjVar, int i10) {
        this.a = i10;
        this.b = xjVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qj qjVar = (qj) obj;
        qj qjVar2 = (qj) obj2;
        switch (this.a) {
            case 0:
                xj xjVar = this.b;
                xjVar.getClass();
                File file = qjVar.f;
                if (file != null) {
                    if (qjVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != qjVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || xjVar.c0) {
                            break;
                        } else {
                            long lastModified = qjVar.f.lastModified();
                            long lastModified2 = qjVar2.f.lastModified();
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
                    long lastModified3 = qjVar.f.lastModified();
                    long lastModified4 = qjVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return qjVar.f.getName().compareToIgnoreCase(qjVar2.f.getName());
    }
}
