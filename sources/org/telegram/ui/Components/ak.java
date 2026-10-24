package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk b;

    public /* synthetic */ ak(nk nkVar, int i10) {
        this.a = i10;
        this.b = nkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        hk hkVar = (hk) obj;
        hk hkVar2 = (hk) obj2;
        switch (this.a) {
            case 0:
                nk nkVar = this.b;
                nkVar.getClass();
                File file = hkVar.f;
                if (file != null) {
                    if (hkVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != hkVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || nkVar.c0) {
                            break;
                        } else {
                            long lastModified = hkVar.f.lastModified();
                            long lastModified2 = hkVar2.f.lastModified();
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
                    long lastModified3 = hkVar.f.lastModified();
                    long lastModified4 = hkVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return hkVar.f.getName().compareToIgnoreCase(hkVar2.f.getName());
    }
}
