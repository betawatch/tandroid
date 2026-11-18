package bi;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k4(int i7, int i10, long j3, String str, boolean z10) {
        this.f = str;
        this.c = i7;
        this.b = z10;
        this.e = j3;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object obj = this.f;
        switch (i7) {
            case 0:
                final String str = (String) obj;
                TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
                getuniquestargift.slug = str;
                final int i10 = this.c;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                final int i11 = this.d;
                final long j3 = this.e;
                final boolean z10 = this.b;
                connectionsManager.sendRequest(getuniquestargift, new RequestDelegate() { // from class: bi.o4
                    @Override // org.telegram.tgnet.RequestDelegate
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        org.telegram.messenger.g0.g3(new m4(tLObject, i10, z10, j3, i11, str));
                    }
                });
                break;
            default:
                int i12 = ChatActivityEnterView.n7;
                ((ChatActivityEnterView) obj).s1(this.b, this.c, this.d, this.e, false);
                break;
        }
    }

    public /* synthetic */ k4(ChatActivityEnterView chatActivityEnterView, boolean z10, int i7, int i10, long j3) {
        this.f = chatActivityEnterView;
        this.b = z10;
        this.c = i7;
        this.d = i10;
        this.e = j3;
    }
}
