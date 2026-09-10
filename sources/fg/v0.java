package fg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v0(l1 l1Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = l1Var;
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
                ((l1) this.e).U((CharSequence) this.f, this.c, (ArrayList) this.h, this.b, this.d);
                break;
            case 1:
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.b, (TLRPC.TL_messages_stickerSet) this.f, this.c, (String) this.h, this.d);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(j6.k1((c6) this.e, (File) this.f, this.c, this.b, (TLRPC.Document) this.h, this.d), 15));
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

    public /* synthetic */ v0(c6 c6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = c6Var;
        this.f = file;
        this.c = i10;
        this.b = z10;
        this.h = document;
        this.d = z11;
    }
}
