package org.telegram.messenger;

import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class sh implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ sh(vi viVar, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, String str, boolean z11) {
        this.e = viVar;
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
                vi viVar = (vi) this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f;
                String str = (String) this.h;
                boolean z10 = this.c;
                int i10 = this.b;
                if (z10) {
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i10) >= 86400) {
                        i0.h3(new kg(viVar, str, this.d, 0), (tL_messages_stickerSet != null || z10) ? 0L : 1000L);
                        if (tL_messages_stickerSet == null) {
                        }
                    }
                }
                if (tL_messages_stickerSet == null) {
                    if (!z10) {
                        viVar.F1(str, null, i10);
                        break;
                    }
                } else {
                    if (!z10) {
                        viVar.F1(str, tL_messages_stickerSet, i10);
                    }
                    i0.g3(new lg(viVar, str, tL_messages_stickerSet, 0));
                    break;
                }
                break;
            case 1:
                i0.g3(new lg.s(org.telegram.ui.ActionBar.t6.p1((org.telegram.ui.ActionBar.m6) this.e, (File) this.f, this.b, this.c, (TLRPC.Document) this.h, this.d), 29));
                break;
            default:
                ((zf.x0) this.e).U((CharSequence) this.f, this.b, (ArrayList) this.h, this.c, this.d);
                break;
        }
    }

    public /* synthetic */ sh(org.telegram.ui.ActionBar.m6 m6Var, File file, int i10, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = m6Var;
        this.f = file;
        this.b = i10;
        this.c = z10;
        this.h = document;
        this.d = z11;
    }

    public /* synthetic */ sh(zf.x0 x0Var, CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = x0Var;
        this.f = charSequence;
        this.b = i10;
        this.h = arrayList;
        this.c = z10;
        this.d = z11;
    }
}
