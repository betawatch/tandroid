package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ oj(pj pjVar, String str, int i7, int i10) {
        this.a = i10;
        this.b = pjVar;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pj pjVar = this.b;
                String str = this.c;
                int i7 = this.d;
                pjVar.getClass();
                org.telegram.messenger.g0.g3(new oj(pjVar, str, i7, 1));
                break;
            default:
                pj pjVar2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                pjVar2.getClass();
                int i11 = org.telegram.messenger.j10.t0;
                Utilities.g.c(new bi.p3(pjVar2, str2, new ArrayList(org.telegram.messenger.i5.r(i11).Z.values()), new ArrayList(org.telegram.messenger.i5.r(i11).f0), i11, i10));
                break;
        }
    }
}
