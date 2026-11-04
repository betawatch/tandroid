package kg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.cg;
import org.telegram.messenger.dg;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q0(e1 e1Var, CharSequence charSequence, int i3, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = e1Var;
        this.f = charSequence;
        this.c = i3;
        this.h = arrayList;
        this.b = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((e1) this.e).U((CharSequence) this.f, this.c, (ArrayList) this.h, this.b, this.d);
                break;
            case 1:
                li liVar = (li) this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f;
                String str = (String) this.h;
                boolean z10 = this.b;
                int i3 = this.c;
                if (z10) {
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i3) >= 86400) {
                        org.telegram.messenger.g0.i3(new cg(liVar, str, this.d, 0), (tL_messages_stickerSet != null || z10) ? 0L : 1000L);
                        if (tL_messages_stickerSet == null) {
                        }
                    }
                }
                if (tL_messages_stickerSet == null) {
                    if (!z10) {
                        liVar.F1(str, null, i3);
                        break;
                    }
                } else {
                    if (!z10) {
                        liVar.F1(str, tL_messages_stickerSet, i3);
                    }
                    org.telegram.messenger.g0.h3(new dg(liVar, str, tL_messages_stickerSet, 0));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new d4(k6.p1((b6) this.e, (File) this.f, this.c, this.b, (TLRPC.Document) this.h, this.d), 3));
                break;
        }
    }

    public /* synthetic */ q0(li liVar, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i3, String str, boolean z11) {
        this.e = liVar;
        this.b = z10;
        this.f = tL_messages_stickerSet;
        this.c = i3;
        this.h = str;
        this.d = z11;
    }

    public /* synthetic */ q0(b6 b6Var, File file, int i3, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = b6Var;
        this.f = file;
        this.c = i3;
        this.b = z10;
        this.h = document;
        this.d = z11;
    }
}
