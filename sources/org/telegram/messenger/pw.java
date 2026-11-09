package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class pw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gz b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ pw(gz gzVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = gzVar;
        this.c = j3;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().l3(this.d, this.c);
                break;
            case 1:
                this.b.getMessagesController().l3(this.d, this.c);
                break;
            default:
                this.b.getMessagesController().l3(this.d, this.c);
                break;
        }
    }
}
