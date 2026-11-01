package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q11 implements org.telegram.messenger.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ q11(LinkedHashSet linkedHashSet, Runnable runnable, int i10) {
        this.a = i10;
        this.b = linkedHashSet;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null) {
                    this.b.addAll(arrayList);
                }
                this.c.run();
                break;
            default:
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    this.b.addAll(tL_emojiList.document_id);
                }
                this.c.run();
                break;
        }
    }
}
