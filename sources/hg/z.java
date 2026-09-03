package hg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.Chat b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ Utilities.Callback e;

    public /* synthetic */ z(TLRPC.Chat chat, int i10, ArrayList arrayList, Utilities.Callback callback, int i11) {
        this.a = i11;
        this.b = chat;
        this.c = i10;
        this.d = arrayList;
        this.e = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TLRPC.Chat chat = this.b;
                ArrayList arrayList = this.d;
                if (chat == null) {
                    p0.m(this.c, arrayList);
                }
                this.e.run(arrayList);
                break;
            default:
                TLRPC.Chat chat2 = this.b;
                ArrayList arrayList2 = this.d;
                if (chat2 == null) {
                    p0.m(this.c, arrayList2);
                }
                this.e.run(arrayList2);
                break;
        }
    }
}
