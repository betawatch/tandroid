package org.telegram.ui.Components;

import java.io.File;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class g21 implements org.telegram.messenger.gs {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.ls b;
    public final /* synthetic */ org.telegram.messenger.gj c;
    public final /* synthetic */ org.telegram.ui.Cells.m1 d;

    public g21(String str, org.telegram.messenger.ls lsVar, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.m1 m1Var) {
        this.a = str;
        this.b = lsVar;
        this.c = gjVar;
        this.d = m1Var;
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
                    j21.y(gjVar, ((File) obj).getAbsolutePath(), this.d);
                    return;
                }
            }
            j21.n(gjVar);
        }
    }
}
