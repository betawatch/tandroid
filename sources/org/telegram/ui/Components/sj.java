package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ fk b;

    public /* synthetic */ sj(fk fkVar, int i9) {
        this.a = i9;
        this.b = fkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zj zjVar = (zj) obj;
        zj zjVar2 = (zj) obj2;
        switch (this.a) {
            case 0:
                fk fkVar = this.b;
                fkVar.getClass();
                File file = zjVar.f;
                if (file != null) {
                    if (zjVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != zjVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || fkVar.V) {
                            break;
                        } else {
                            long lastModified = zjVar.f.lastModified();
                            long lastModified2 = zjVar2.f.lastModified();
                            if (lastModified != lastModified2) {
                                if (lastModified > lastModified2) {
                                }
                            }
                        }
                    }
                }
                break;
            default:
                if (this.b.V) {
                    break;
                } else {
                    long lastModified3 = zjVar.f.lastModified();
                    long lastModified4 = zjVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return zjVar.f.getName().compareToIgnoreCase(zjVar2.f.getName());
    }
}
