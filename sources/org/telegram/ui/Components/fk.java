package org.telegram.ui.Components;

import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fk implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ sk b;

    public /* synthetic */ fk(sk skVar, int i10) {
        this.a = i10;
        this.b = skVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        mk mkVar = (mk) obj;
        mk mkVar2 = (mk) obj2;
        switch (this.a) {
            case 0:
                sk skVar = this.b;
                skVar.getClass();
                File file = mkVar.f;
                if (file != null) {
                    if (mkVar2.f != null) {
                        boolean isDirectory = file.isDirectory();
                        if (isDirectory != mkVar2.f.isDirectory()) {
                            if (isDirectory) {
                            }
                        } else if (isDirectory || skVar.c0) {
                            break;
                        } else {
                            long lastModified = mkVar.f.lastModified();
                            long lastModified2 = mkVar2.f.lastModified();
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
                    long lastModified3 = mkVar.f.lastModified();
                    long lastModified4 = mkVar2.f.lastModified();
                    if (lastModified3 != lastModified4) {
                        if (lastModified3 > lastModified4) {
                        }
                    }
                }
                break;
        }
        return mkVar.f.getName().compareToIgnoreCase(mkVar2.f.getName());
    }
}
