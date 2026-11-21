package org.telegram.messenger;

import android.view.View;
import java.util.List;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                f4 f4Var = (f4) this.b;
                List<TLRPC.TL_chatThemeUniqueGift> list = (List) obj;
                if (list != null) {
                    for (TLRPC.TL_chatThemeUniqueGift tL_chatThemeUniqueGift : list) {
                        f4Var.e.put(tL_chatThemeUniqueGift.gift.slug, new org.telegram.ui.ActionBar.s3(f4Var.currentAccount, tL_chatThemeUniqueGift));
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
