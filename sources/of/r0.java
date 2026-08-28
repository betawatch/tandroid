package of;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ r0(f1 f1Var, CharSequence charSequence, int i9, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = f1Var;
        this.f = charSequence;
        this.c = i9;
        this.h = arrayList;
        this.b = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((f1) this.e).U((CharSequence) this.f, this.c, (ArrayList) this.h, this.b, this.d);
                break;
            case 1:
                ((MediaDataController) this.e).lambda$processLoadedDiceStickers$89(this.b, (TLRPC.TL_messages_stickerSet) this.f, this.c, (String) this.h, this.d);
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(f6.k1((y5) this.e, (File) this.f, this.c, this.b, (TLRPC.Document) this.h, this.d), 15));
                break;
        }
    }

    public /* synthetic */ r0(MediaDataController mediaDataController, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i9, String str, boolean z11) {
        this.e = mediaDataController;
        this.b = z10;
        this.f = tL_messages_stickerSet;
        this.c = i9;
        this.h = str;
        this.d = z11;
    }

    public /* synthetic */ r0(y5 y5Var, File file, int i9, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = y5Var;
        this.f = file;
        this.c = i9;
        this.b = z10;
        this.h = document;
        this.d = z11;
    }
}
