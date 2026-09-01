package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class f9 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ f9(MediaDataController mediaDataController, boolean z4, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z10) {
        this.e = mediaDataController;
        this.c = z4;
        this.f = tL_messages_stickerSet;
        this.b = i10;
        this.h = str;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.c, (TLRPC.TL_messages_stickerSet) this.f, this.b, (String) this.h, this.d);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(org.telegram.ui.ActionBar.k6.k1((org.telegram.ui.ActionBar.d6) this.e, (File) this.f, this.b, this.c, (TLRPC.Document) this.h, this.d), 15));
                break;
            default:
                ((uf.u0) this.e).U((CharSequence) this.f, this.b, (ArrayList) this.h, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ f9(org.telegram.ui.ActionBar.d6 d6Var, File file, int i10, boolean z4, TLRPC.Document document, boolean z10) {
        this.e = d6Var;
        this.f = file;
        this.b = i10;
        this.c = z4;
        this.h = document;
        this.d = z10;
    }

    public /* synthetic */ f9(uf.u0 u0Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z4, boolean z10) {
        this.e = u0Var;
        this.f = charSequence;
        this.b = i10;
        this.h = arrayList;
        this.c = z4;
        this.d = z10;
    }
}
