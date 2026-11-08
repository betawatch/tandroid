package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a01 implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ a01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.a = i7;
        this.b = linkedHashSet;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.c20
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
