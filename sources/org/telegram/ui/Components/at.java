package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;

    public /* synthetic */ at(dt dtVar, int i7) {
        this.a = i7;
        this.b = dtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dt dtVar = this.b;
                dtVar.post(new at(dtVar, 1));
                break;
            default:
                dt dtVar2 = this.b;
                dtVar2.h();
                dtVar2.d();
                break;
        }
    }
}
