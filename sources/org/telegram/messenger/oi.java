package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class oi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SendMessagesHelper b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ MessageObject d;
    public final /* synthetic */ String e;
    public final /* synthetic */ SendMessagesHelper.DelayedMessage f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ SendMessagesHelper.DelayedMessage n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ HashMap s;
    public final /* synthetic */ boolean v;

    public /* synthetic */ oi(SendMessagesHelper sendMessagesHelper, TLObject tLObject, MessageObject messageObject, String str, SendMessagesHelper.DelayedMessage delayedMessage, boolean z4, SendMessagesHelper.DelayedMessage delayedMessage2, Object obj, HashMap hashMap, boolean z10, int i10) {
        this.a = i10;
        this.b = sendMessagesHelper;
        this.c = tLObject;
        this.d = messageObject;
        this.e = str;
        this.f = delayedMessage;
        this.h = z4;
        this.n = delayedMessage2;
        this.r = obj;
        this.s = hashMap;
        this.v = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                HashMap hashMap = this.s;
                boolean z4 = this.v;
                Object obj = this.r;
                String str = this.e;
                this.b.lambda$performSendMessageRequest$77(this.c, this.d, str, this.f, this.h, this.n, obj, hashMap, z4);
                break;
            case 1:
                HashMap hashMap2 = this.s;
                boolean z10 = this.v;
                Object obj2 = this.r;
                String str2 = this.e;
                this.b.lambda$performSendMessageRequest$78(this.c, this.d, str2, this.f, this.h, this.n, obj2, hashMap2, z10);
                break;
            default:
                HashMap hashMap3 = this.s;
                boolean z11 = this.v;
                Object obj3 = this.r;
                String str3 = this.e;
                this.b.lambda$performSendMessageRequest$82(this.c, this.d, str3, this.f, this.h, this.n, obj3, hashMap3, z11);
                break;
        }
    }
}
