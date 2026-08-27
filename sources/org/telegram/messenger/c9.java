package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ c9(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = mediaDataController;
        this.c = z10;
        this.f = tL_messages_stickerSet;
        this.b = i10;
        this.h = str;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.c, (TLRPC.TL_messages_stickerSet) this.f, this.b, (String) this.h, this.d);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(org.telegram.ui.ActionBar.g6.k1((org.telegram.ui.ActionBar.z5) this.e, (File) this.f, this.b, this.c, (TLRPC.Document) this.h, this.d), 15));
                break;
            default:
                ((pf.u0) this.e).U((CharSequence) this.f, this.b, (ArrayList) this.h, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ c9(org.telegram.ui.ActionBar.z5 z5Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = z5Var;
        this.f = file;
        this.b = i10;
        this.c = z10;
        this.h = document;
        this.d = z11;
    }

    public /* synthetic */ c9(pf.u0 u0Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = u0Var;
        this.f = charSequence;
        this.b = i10;
        this.h = arrayList;
        this.c = z10;
        this.d = z11;
    }
}
