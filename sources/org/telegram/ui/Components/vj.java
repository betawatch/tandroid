package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                        } else if (isDirectory || jkVar.W) {
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
                if (this.b.W) {
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
