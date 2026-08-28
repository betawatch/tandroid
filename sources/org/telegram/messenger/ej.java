package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ej implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ TLRPC.Message f;
    public final /* synthetic */ int h;
    public final /* synthetic */ TLRPC.Message n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ int s;

    public /* synthetic */ ej(SendMessagesHelper sendMessagesHelper, ArrayList arrayList, int i9, int i10, TLRPC.Message message, int i11, TLRPC.Message message2, MessageObject messageObject, int i12, int i13) {
        this.a = i13;
        this.b = sendMessagesHelper;
        this.c = arrayList;
        this.d = i9;
        this.e = i10;
        this.f = message;
        this.h = i11;
        this.n = message2;
        this.r = messageObject;
        this.s = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$sendMessage$9(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s);
                break;
            default:
                this.b.lambda$sendMessage$10(this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s);
                break;
        }
    }
}
