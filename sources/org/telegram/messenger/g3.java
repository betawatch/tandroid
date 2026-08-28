package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class g3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ g3(FilePathDatabase filePathDatabase, long j10, int i9, int i10, String str, int i11) {
        this.f = filePathDatabase;
        this.c = j10;
        this.b = i9;
        this.d = i10;
        this.h = str;
        this.e = i11;
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

    public /* synthetic */ g3(MessagesStorage messagesStorage, int i9, long j10, int i10, ArrayList arrayList, int i11) {
        this.f = messagesStorage;
        this.b = i9;
        this.c = j10;
        this.d = i10;
        this.h = arrayList;
        this.e = i11;
    }
}
