package org.telegram.ui.Components;

import java.io.File;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g21 implements org.telegram.messenger.gs {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.ls b;
    public final /* synthetic */ org.telegram.messenger.gj c;

    public g21(String str, org.telegram.messenger.ls lsVar, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.m1 m1Var) {
        this.a = str;
        this.b = lsVar;
        this.c = gjVar;
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.a.equals(objArr[0])) {
            org.telegram.messenger.ls lsVar = this.b;
            int i11 = org.telegram.messenger.ls.Y1;
            lsVar.n(this, i11);
            lsVar.n(this, org.telegram.messenger.ls.Z1);
            org.telegram.messenger.gj gjVar = this.c;
            if (i7 == i11 && objArr.length > 1) {
                Object obj = objArr[1];
                if (obj instanceof File) {
                    j21.y(gjVar, ((File) obj).getAbsolutePath());
                    return;
                }
            }
            j21.n(gjVar);
        }
    }
}
