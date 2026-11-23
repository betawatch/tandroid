package jg;

import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.kg;
import org.telegram.messenger.lg;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.m6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class t0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ t0(h1 h1Var, CharSequence charSequence, int i7, ArrayList arrayList, boolean z10, boolean z11) {
        this.e = h1Var;
        this.f = charSequence;
        this.c = i7;
        this.h = arrayList;
        this.b = z10;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((h1) this.e).U((CharSequence) this.f, this.c, (ArrayList) this.h, this.b, this.d);
                break;
            case 1:
                si siVar = (si) this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.f;
                String str = (String) this.h;
                boolean z10 = this.b;
                int i7 = this.c;
                if (z10) {
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i7) >= 86400) {
                        org.telegram.messenger.g0.h3(new kg(siVar, str, this.d, 0), (tL_messages_stickerSet != null || z10) ? 0L : 1000L);
                        if (tL_messages_stickerSet == null) {
                        }
                    }
                }
                if (tL_messages_stickerSet == null) {
                    if (!z10) {
                        siVar.K1(str, null, i7);
                        break;
                    }
                } else {
                    if (!z10) {
                        siVar.K1(str, tL_messages_stickerSet, i7);
                    }
                    org.telegram.messenger.g0.g3(new lg(siVar, str, tL_messages_stickerSet, 0));
                    break;
                }
                break;
            default:
                org.telegram.messenger.g0.g3(new oi.c2(m6.p1((d6) this.e, (File) this.f, this.c, this.b, (TLRPC.Document) this.h, this.d), 15));
                break;
        }
    }

    public /* synthetic */ t0(si siVar, boolean z10, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, String str, boolean z11) {
        this.e = siVar;
        this.b = z10;
        this.f = tL_messages_stickerSet;
        this.c = i7;
        this.h = str;
        this.d = z11;
    }

    public /* synthetic */ t0(d6 d6Var, File file, int i7, boolean z10, TLRPC.Document document, boolean z11) {
        this.e = d6Var;
        this.f = file;
        this.c = i7;
        this.b = z10;
        this.h = document;
        this.d = z11;
    }
}
