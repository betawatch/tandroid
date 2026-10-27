package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoader b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ a3(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
        this.a = i10;
        this.b = fileLoader;
        this.c = document;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setLoadingVideo$0(this.c, this.d);
                break;
            default:
                this.b.lambda$removeLoadingVideo$1(this.c, this.d);
                break;
        }
    }
}
