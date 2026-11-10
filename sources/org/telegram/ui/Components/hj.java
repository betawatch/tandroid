package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ uj b;

    public /* synthetic */ hj(uj ujVar, int i7) {
        this.a = i7;
        this.b = ujVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        oj ojVar = (oj) obj;
        oj ojVar2 = (oj) obj2;
        switch (this.a) {
            case 0:
                uj ujVar = this.b;
                ujVar.getClass();
                File file = ojVar.f;
                if (file != null) {
                    if (ojVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ojVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || ujVar.c0) {
                            break;
                        } else {
                            long lastModified = ojVar.f.lastModified();
                            long lastModified2 = ojVar2.f.lastModified();
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
                    long lastModified3 = ojVar.f.lastModified();
                    long lastModified4 = ojVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return ojVar.f.getName().compareToIgnoreCase(ojVar2.f.getName());
    }
}
