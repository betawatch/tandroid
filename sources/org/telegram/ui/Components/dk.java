package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk b;

    public /* synthetic */ dk(qk qkVar, int i10) {
        this.a = i10;
        this.b = qkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        kk kkVar = (kk) obj;
        kk kkVar2 = (kk) obj2;
        switch (this.a) {
            case 0:
                qk qkVar = this.b;
                qkVar.getClass();
                File file = kkVar.f;
                if (file != null) {
                    if (kkVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != kkVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || qkVar.c0) {
                            break;
                        } else {
                            long lastModified = kkVar.f.lastModified();
                            long lastModified2 = kkVar2.f.lastModified();
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
                    long lastModified3 = kkVar.f.lastModified();
                    long lastModified4 = kkVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return kkVar.f.getName().compareToIgnoreCase(kkVar2.f.getName());
    }
}
