package org.telegram.ui.Components;

import java.io.File;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v11 implements org.telegram.messenger.is {
    public final /* synthetic */ String a;
    public final /* synthetic */ org.telegram.messenger.ns b;
    public final /* synthetic */ org.telegram.messenger.gj c;

    public v11(String str, org.telegram.messenger.ns nsVar, org.telegram.messenger.gj gjVar) {
        this.a = str;
        this.b = nsVar;
        this.c = gjVar;
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (this.a.equals(objArr[0])) {
            org.telegram.messenger.ns nsVar = this.b;
            int i11 = org.telegram.messenger.ns.Y1;
            nsVar.n(this, i11);
            nsVar.n(this, org.telegram.messenger.ns.Z1);
            org.telegram.messenger.gj gjVar = this.c;
            if (i7 == i11 && objArr.length > 1) {
                Object obj = objArr[1];
                if (obj instanceof File) {
                    x11.w(gjVar, ((File) obj).getAbsolutePath());
                    return;
                }
            }
            x11.m(gjVar);
        }
    }
}
