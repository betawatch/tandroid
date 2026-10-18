package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final /* synthetic */ class l3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ l3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
        this.f = filePathDatabase;
        this.c = j10;
        this.b = i10;
        this.d = i11;
        this.h = str;
        this.e = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((FilePathDatabase) this.f).lambda$putPath$1(this.c, this.b, this.d, (String) this.h, this.e);
                break;
            default:
                ((MessagesStorage) this.f).lambda$updateRepliesCount$194(this.b, this.c, this.d, (ArrayList) this.h, this.e);
                break;
        }
    }

    public /* synthetic */ l3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f = messagesStorage;
        this.b = i10;
        this.c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
