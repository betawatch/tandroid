package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class a3 implements Runnable {
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

    public /* synthetic */ a3(FileLoader fileLoader, TLRPC.Document document, SecureDocument secureDocument, WebFile webFile, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ImageLocation imageLocation, Object obj, String str, long j10, int i10, int i11) {
        this.e = fileLoader;
        this.f = document;
        this.h = secureDocument;
        this.n = webFile;
        this.r = tL_fileLocationToBeDeprecated;
        this.s = imageLocation;
        this.v = obj;
        this.w = str;
        this.c = j10;
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
                ((MediaDataController) this.e).lambda$processLoadedStickers$105(this.b, (a0.h) this.f, (HashMap) this.h, (ArrayList) this.n, this.c, this.d, (a0.h) this.r, (HashMap) this.s, (a0.h) this.v, (Runnable) this.w);
                break;
        }
    }

    public /* synthetic */ a3(MediaDataController mediaDataController, int i10, a0.h hVar, HashMap hashMap, ArrayList arrayList, long j10, int i11, a0.h hVar2, HashMap hashMap2, a0.h hVar3, Runnable runnable) {
        this.e = mediaDataController;
        this.b = i10;
        this.f = hVar;
        this.h = hashMap;
        this.n = arrayList;
        this.c = j10;
        this.d = i11;
        this.r = hVar2;
        this.s = hashMap2;
        this.v = hVar3;
        this.w = runnable;
    }
}
