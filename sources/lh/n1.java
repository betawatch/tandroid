package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ n1(int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.run((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.b;
                if (callback != null) {
                    callback.run(bool);
                    break;
                }
                break;
        }
    }
}
