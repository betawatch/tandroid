package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ kk b;

    public /* synthetic */ wj(kk kkVar, int i7) {
        this.a = i7;
        this.b = kkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        dk dkVar = (dk) obj;
        dk dkVar2 = (dk) obj2;
        switch (this.a) {
            case 0:
                kk kkVar = this.b;
                kkVar.getClass();
                File file = dkVar.f;
                if (file != null) {
                    if (dkVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != dkVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || kkVar.d0) {
                            break;
                        } else {
                            long lastModified = dkVar.f.lastModified();
                            long lastModified2 = dkVar2.f.lastModified();
                            if (lastModified != lastModified2) {
                                if (lastModified > lastModified2) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                if (this.b.d0) {
                    break;
                } else {
                    long lastModified3 = dkVar.f.lastModified();
                    long lastModified4 = dkVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return dkVar.f.getName().compareToIgnoreCase(dkVar2.f.getName());
    }
}
