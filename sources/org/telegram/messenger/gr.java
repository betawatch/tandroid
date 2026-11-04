package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gr implements Runnable {
    public final /* synthetic */ qr a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ TLRPC.Reaction d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ r10 n;

    public /* synthetic */ gr(qr qrVar, String str, long j10, TLRPC.Reaction reaction, int i3, int i10, boolean z10, r10 r10Var) {
        this.a = qrVar;
        this.b = str;
        this.c = j10;
        this.d = reaction;
        this.e = i3;
        this.f = i10;
        this.h = z10;
        this.n = r10Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gr.run():void");
    }
}
