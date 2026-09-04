package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ BaseController e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ z2(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j3, int i10, int i11) {
        this.e = fileLoader;
        this.f = document;
        this.h = secureDocument;
        this.n = webFile;
        this.r = tL_fileLocationToBeDeprecated;
        this.s = imageLocation;
        this.v = obj;
        this.w = str;
        this.c = j3;
        this.b = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((FileLoader) this.e).lambda$loadFile$13((TLRPC.Document) this.f, (SecureDocument) this.h, (WebFile) this.n, (TLRPC.TL_fileLocationToBeDeprecated) this.r, (ImageLocation) this.s, this.v, (String) this.w, this.c, this.b, this.d);
                break;
            default:
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.b, (a0.i) this.f, (HashMap) this.h, (ArrayList) this.n, this.c, this.d, (a0.i) this.r, (HashMap) this.s, (a0.i) this.v, (Runnable) this.w);
                break;
        }
    }

    public /* synthetic */ z2(MediaDataController mediaDataController, int i10, a0.i iVar, HashMap hashMap, ArrayList arrayList, long j3, int i11, a0.i iVar2, HashMap hashMap2, a0.i iVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.b = i10;
        this.f = iVar;
        this.h = hashMap;
        this.n = arrayList;
        this.c = j3;
        this.d = i11;
        this.r = iVar2;
        this.s = hashMap2;
        this.v = iVar3;
        this.w = runnable;
    }
}
