package gg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.z5;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v0(k1 k1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = k1Var;
        this.f = charSequence;
        this.c = i10;
        this.h = arrayList;
        this.b = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((k1) this.e).U((CharSequence) this.f, this.c, (ArrayList) this.h, this.b, this.d);
                break;
            case 1:
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.b, (TLRPC.TL_messages_stickerSet) this.f, this.c, (String) this.h, this.d);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(h6.k1((z5) this.e, (File) this.f, this.c, this.b, (TLRPC.Document) this.h, this.d), 15));
                break;
        }
    }

    public /* synthetic */ v0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = mediaDataController;
        this.b = z10;
        this.f = tL_messages_stickerSet;
        this.c = i10;
        this.h = str;
        this.d = z11;
    }

    public /* synthetic */ v0(z5 z5Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = z5Var;
        this.f = file;
        this.c = i10;
        this.b = z10;
        this.h = document;
        this.d = z11;
    }
}
