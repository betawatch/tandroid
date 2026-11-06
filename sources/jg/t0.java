package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.kg;
import org.telegram.messenger.lg;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m5;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ t0(i1 i1Var, CharSequence charSequence, int i7, ArrayList arrayList, boolean z9, boolean z10) {
        this.e = i1Var;
        this.f = charSequence;
        this.c = i7;
        this.h = arrayList;
        this.b = z9;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((i1) this.e).U((CharSequence) this.f, this.c, (ArrayList) this.h, this.b, this.d);
                break;
            case 1:
                ui uiVar = (ui) this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f;
                String str = (String) this.h;
                boolean z9 = this.b;
                int i7 = this.c;
                if (z9) {
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                        org.telegram.messenger.g0.i3(new kg(uiVar, str, this.d, 0), (tL_messages_stickerSet != null || z9) ? 0L : 1000L);
                        if (tL_messages_stickerSet == null) {
                        }
                    }
                }
                if (tL_messages_stickerSet == null) {
                    if (!z9) {
                        uiVar.F1(str, null, i7);
                        break;
                    }
                } else {
                    if (!z9) {
                        uiVar.F1(str, tL_messages_stickerSet, i7);
                    }
                    org.telegram.messenger.g0.h3(new lg(uiVar, str, tL_messages_stickerSet, 0));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.h3(new m5(k6.p1((c6) this.e, (File) this.f, this.c, this.b, (TLRPC.Document) this.h, this.d), 0));
                break;
        }
    }

    public /* synthetic */ t0(ui uiVar, boolean z9, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, String str, boolean z10) {
        this.e = uiVar;
        this.b = z9;
        this.f = tL_messages_stickerSet;
        this.c = i7;
        this.h = str;
        this.d = z10;
    }

    public /* synthetic */ t0(c6 c6Var, File file, int i7, boolean z9, TLRPC.Document document, boolean z10) {
        this.e = c6Var;
        this.f = file;
        this.c = i7;
        this.b = z9;
        this.h = document;
        this.d = z10;
    }
}
