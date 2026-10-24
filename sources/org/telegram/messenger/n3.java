package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class n3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;

    public /* synthetic */ n3(FilePathDatabase filePathDatabase, long j10, int i10, int i11, String str, int i12) {
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

    public /* synthetic */ n3(MessagesStorage messagesStorage, int i10, long j10, int i11, ArrayList arrayList, int i12) {
        this.f = messagesStorage;
        this.b = i10;
        this.c = j10;
        this.d = i11;
        this.h = arrayList;
        this.e = i12;
    }
}
