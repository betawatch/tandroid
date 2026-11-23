package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class ov implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv b;

    public /* synthetic */ ov(qv qvVar, int i7) {
        this.a = i7;
        this.b = qvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(false);
                break;
            case 1:
                this.b.o = false;
                break;
            case 2:
                qv qvVar = this.b;
                qvVar.o = false;
                qvVar.l = false;
                break;
            case 3:
                this.b.l();
                break;
            default:
                qv qvVar2 = this.b;
                if (!qvVar2.o) {
                    qvVar2.o = true;
                    ArrayList arrayList = new ArrayList(qvVar2.j);
                    ur a02 = ur.a0(qvVar2.a);
                    a02.a.c(new lg(qvVar2, a02, arrayList, 24));
                    break;
                }
                break;
        }
    }
}
