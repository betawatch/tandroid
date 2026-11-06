package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ij implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ vj b;

    public /* synthetic */ ij(vj vjVar, int i7) {
        this.a = i7;
        this.b = vjVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        pj pjVar = (pj) obj;
        pj pjVar2 = (pj) obj2;
        switch (this.a) {
            case 0:
                vj vjVar = this.b;
                vjVar.getClass();
                File file = pjVar.f;
                if (file != null) {
                    if (pjVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != pjVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || vjVar.c0) {
                            break;
                        } else {
                            long lastModified = pjVar.f.lastModified();
                            long lastModified2 = pjVar2.f.lastModified();
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
                    long lastModified3 = pjVar.f.lastModified();
                    long lastModified4 = pjVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return pjVar.f.getName().compareToIgnoreCase(pjVar2.f.getName());
    }
}
