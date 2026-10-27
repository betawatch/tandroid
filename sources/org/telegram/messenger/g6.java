package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Serializable n;
    public final /* synthetic */ Object r;

    public /* synthetic */ g6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z10, int i11, boolean z11, long j10) {
        this.h = mediaController;
        this.n = file;
        this.r = tL_document;
        this.c = i10;
        this.b = z10;
        this.e = i11;
        this.f = z11;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$43((File) this.n, (TLRPC.TL_document) this.r, this.c, this.b, this.e, this.f, this.d);
                break;
            default:
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$142(this.b, (HashMap) this.n, this.c, this.d, (ArrayList) this.r, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ g6(MessagesStorage messagesStorage, boolean z10, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z11) {
        this.h = messagesStorage;
        this.b = z10;
        this.n = hashMap;
        this.c = i10;
        this.d = j10;
        this.r = arrayList;
        this.e = i11;
        this.f = z11;
    }
}
