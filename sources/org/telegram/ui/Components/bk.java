package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ok b;

    public /* synthetic */ bk(ok okVar, int i10) {
        this.a = i10;
        this.b = okVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ik ikVar = (ik) obj;
        ik ikVar2 = (ik) obj2;
        switch (this.a) {
            case 0:
                ok okVar = this.b;
                okVar.getClass();
                File file = ikVar.f;
                if (file != null) {
                    if (ikVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != ikVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || okVar.c0) {
                            break;
                        } else {
                            long lastModified = ikVar.f.lastModified();
                            long lastModified2 = ikVar2.f.lastModified();
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
                    long lastModified3 = ikVar.f.lastModified();
                    long lastModified4 = ikVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return ikVar.f.getName().compareToIgnoreCase(ikVar2.f.getName());
    }
}
