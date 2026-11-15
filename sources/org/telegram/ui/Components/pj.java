package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ dk b;

    public /* synthetic */ pj(dk dkVar, int i7) {
        this.a = i7;
        this.b = dkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        wj wjVar = (wj) obj;
        wj wjVar2 = (wj) obj2;
        switch (this.a) {
            case 0:
                dk dkVar = this.b;
                dkVar.getClass();
                File file = wjVar.f;
                if (file != null) {
                    if (wjVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != wjVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || dkVar.d0) {
                            break;
                        } else {
                            long lastModified = wjVar.f.lastModified();
                            long lastModified2 = wjVar2.f.lastModified();
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
                    long lastModified3 = wjVar.f.lastModified();
                    long lastModified4 = wjVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return wjVar.f.getName().compareToIgnoreCase(wjVar2.f.getName());
    }
}
