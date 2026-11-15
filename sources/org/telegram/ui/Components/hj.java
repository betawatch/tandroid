package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ij b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ hj(ij ijVar, String str, int i7, int i10) {
        this.a = i10;
        this.b = ijVar;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ij ijVar = this.b;
                String str = this.c;
                int i7 = this.d;
                ijVar.getClass();
                org.telegram.messenger.g0.h3(new hj(ijVar, str, i7, 1));
                break;
            default:
                ij ijVar2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ijVar2.getClass();
                int i11 = org.telegram.messenger.m10.t0;
                Utilities.g.c(new oi.e0(ijVar2, str2, new ArrayList(org.telegram.messenger.g5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.g5.r(i11).f0), i11, i10));
                break;
        }
    }
}
