package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ck implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk b;

    public /* synthetic */ ck(pk pkVar, int i10) {
        this.a = i10;
        this.b = pkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        jk jkVar = (jk) obj;
        jk jkVar2 = (jk) obj2;
        switch (this.a) {
            case 0:
                pk pkVar = this.b;
                pkVar.getClass();
                File file = jkVar.f;
                if (file != null) {
                    if (jkVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != jkVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || pkVar.c0) {
                            break;
                        } else {
                            long lastModified = jkVar.f.lastModified();
                            long lastModified2 = jkVar2.f.lastModified();
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
                    long lastModified3 = jkVar.f.lastModified();
                    long lastModified4 = jkVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return jkVar.f.getName().compareToIgnoreCase(jkVar2.f.getName());
    }
}
