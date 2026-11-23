package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ pj(qj qjVar, String str, int i7, int i10) {
        this.a = i10;
        this.b = qjVar;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qj qjVar = this.b;
                String str = this.c;
                int i7 = this.d;
                qjVar.getClass();
                org.telegram.messenger.g0.g3(new pj(qjVar, str, i7, 1));
                break;
            default:
                qj qjVar2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                qjVar2.getClass();
                int i11 = org.telegram.messenger.i10.t0;
                Utilities.g.c(new bi.v3(qjVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.i5.r(i11).f0), i11, i10));
                break;
        }
    }
}
