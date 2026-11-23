package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ kk b;

    public /* synthetic */ xj(kk kkVar, int i7) {
        this.a = i7;
        this.b = kkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ek ekVar = (ek) obj;
        ek ekVar2 = (ek) obj2;
        switch (this.a) {
            case 0:
                kk kkVar = this.b;
                kkVar.getClass();
                File file = ekVar.f;
                if (file != null) {
                    if (ekVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ekVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || kkVar.d0) {
                            break;
                        } else {
                            long lastModified = ekVar.f.lastModified();
                            long lastModified2 = ekVar2.f.lastModified();
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
                    long lastModified3 = ekVar.f.lastModified();
                    long lastModified4 = ekVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return ekVar.f.getName().compareToIgnoreCase(ekVar2.f.getName());
    }
}
