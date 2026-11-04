package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class u3 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                d4 d4Var = (d4) this.b;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        d4Var.e.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.p3(d4Var.currentAccount, tL_chatThemeUniqueGift));
                    }
                    break;
                }
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            default:
                ((View) this.b).invalidate();
                break;
        }
    }
}
