package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ jk b;

    public /* synthetic */ vj(jk jkVar, int i10) {
        this.a = i10;
        this.b = jkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ck ckVar = (ck) obj;
        ck ckVar2 = (ck) obj2;
        switch (this.a) {
            case 0:
                jk jkVar = this.b;
                jkVar.getClass();
                File file = ckVar.f;
                if (file != null) {
                    if (ckVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ckVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || jkVar.V) {
                            break;
                        } else {
                            long lastModified = ckVar.f.lastModified();
                            long lastModified2 = ckVar2.f.lastModified();
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
                    long lastModified3 = ckVar.f.lastModified();
                    long lastModified4 = ckVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return ckVar.f.getName().compareToIgnoreCase(ckVar2.f.getName());
    }
}
