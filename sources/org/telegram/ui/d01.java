package org.telegram.ui;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d01 implements org.telegram.messenger.y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashSet b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ d01(LinkedHashSet linkedHashSet, Runnable runnable, int i7) {
        this.a = i7;
        this.b = linkedHashSet;
        this.c = runnable;
    }

    @Override // org.telegram.messenger.y10
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
