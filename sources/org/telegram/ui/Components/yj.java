package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ mk b;

    public /* synthetic */ yj(mk mkVar, int i7) {
        this.a = i7;
        this.b = mkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        fk fkVar = (fk) obj;
        fk fkVar2 = (fk) obj2;
        switch (this.a) {
            case 0:
                mk mkVar = this.b;
                mkVar.getClass();
                File file = fkVar.f;
                if (file != null) {
                    if (fkVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != fkVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || mkVar.d0) {
                            break;
                        } else {
                            long lastModified = fkVar.f.lastModified();
                            long lastModified2 = fkVar2.f.lastModified();
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
                    long lastModified3 = fkVar.f.lastModified();
                    long lastModified4 = fkVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return fkVar.f.getName().compareToIgnoreCase(fkVar2.f.getName());
    }
}
