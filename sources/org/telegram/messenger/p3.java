package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class p3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ p3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
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
                ((MessagesStorage) this.f).lambda$updateRepliesCount$198(this.b, this.c, this.d, (ArrayList) this.h, this.e);
                break;
        }
    }

    public /* synthetic */ p3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f = messagesStorage;
        this.b = i10;
        this.c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
