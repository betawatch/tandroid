package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk b;

    public /* synthetic */ tj(hk hkVar, int i10) {
        this.a = i10;
        this.b = hkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ak akVar = (ak) obj;
        ak akVar2 = (ak) obj2;
        switch (this.a) {
            case 0:
                hk hkVar = this.b;
                hkVar.getClass();
                File file = akVar.f;
                if (file != null) {
                    if (akVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != akVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || hkVar.W) {
                            break;
                        } else {
                            long lastModified = akVar.f.lastModified();
                            long lastModified2 = akVar2.f.lastModified();
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
                    long lastModified3 = akVar.f.lastModified();
                    long lastModified4 = akVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return akVar.f.getName().compareToIgnoreCase(akVar2.f.getName());
    }
}
