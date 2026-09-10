package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ tk b;

    public /* synthetic */ ek(tk tkVar, int i10) {
        this.a = i10;
        this.b = tkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        nk nkVar = (nk) obj;
        nk nkVar2 = (nk) obj2;
        switch (this.a) {
            case 0:
                tk tkVar = this.b;
                tkVar.getClass();
                File file = nkVar.f;
                if (file != null) {
                    if (nkVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != nkVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || tkVar.c0) {
                            break;
                        } else {
                            long lastModified = nkVar.f.lastModified();
                            long lastModified2 = nkVar2.f.lastModified();
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
                    long lastModified3 = nkVar.f.lastModified();
                    long lastModified4 = nkVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return nkVar.f.getName().compareToIgnoreCase(nkVar2.f.getName());
    }
}
