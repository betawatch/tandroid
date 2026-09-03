package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Serializable n;
    public final /* synthetic */ Object r;

    public /* synthetic */ n6(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i10, boolean z4, int i11, boolean z10, long j10) {
        this.h = mediaController;
        this.n = file;
        this.r = tL_document;
        this.c = i10;
        this.b = z4;
        this.e = i11;
        this.f = z10;
        this.d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaController) this.h).lambda$stopRecordingInternal$40((File) this.n, (TLRPC.TL_document) this.r, this.c, this.b, this.e, this.f, this.d);
                break;
            default:
                ((MessagesStorage) this.h).lambda$updatePinnedMessages$138(this.b, (HashMap) this.n, this.c, this.d, (ArrayList) this.r, this.e, this.f);
                break;
        }
    }

    public /* synthetic */ n6(MessagesStorage messagesStorage, boolean z4, HashMap hashMap, int i10, long j10, ArrayList arrayList, int i11, boolean z10) {
        this.h = messagesStorage;
        this.b = z4;
        this.n = hashMap;
        this.c = i10;
        this.d = j10;
        this.r = arrayList;
        this.e = i11;
        this.f = z10;
    }
}
