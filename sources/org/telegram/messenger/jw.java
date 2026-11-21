package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
