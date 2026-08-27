package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oj implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ bk b;

    public /* synthetic */ oj(bk bkVar, int i10) {
        this.a = i10;
        this.b = bkVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        vj vjVar = (vj) obj;
        vj vjVar2 = (vj) obj2;
        switch (this.a) {
            case 0:
                bk bkVar = this.b;
                bkVar.getClass();
                File file = vjVar.f;
                if (file != null) {
                    if (vjVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != vjVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || bkVar.V) {
                            break;
                        } else {
                            long lastModified = vjVar.f.lastModified();
                            long lastModified2 = vjVar2.f.lastModified();
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
                    long lastModified3 = vjVar.f.lastModified();
                    long lastModified4 = vjVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return vjVar.f.getName().compareToIgnoreCase(vjVar2.f.getName());
    }
}
