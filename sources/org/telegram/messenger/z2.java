package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoader b;
    public final /* synthetic */ TLRPC.Document c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ z2(FileLoader fileLoader, TLRPC.Document document, boolean z10, int i10) {
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
