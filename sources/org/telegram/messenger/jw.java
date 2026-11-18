package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class jw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zy b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ jw(zy zyVar, long j3, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = zyVar;
        this.c = j3;
        this.d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getMessagesController().s3(this.d, this.c);
                break;
            case 1:
                this.b.getMessagesController().s3(this.d, this.c);
                break;
            default:
                this.b.getMessagesController().s3(this.d, this.c);
                break;
        }
    }
}
