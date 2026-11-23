package bi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
import org.telegram.ui.w91;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements w10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x3(String str, long j3, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.b = j3;
        this.c = i7;
        this.e = tL_messageActionStarGiftOnchainOffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        String str;
        TLRPC.Chat chat;
        int i7 = this.a;
        int i10 = this.c;
        long j3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i7) {
            case 0:
                String str2 = (String) obj3;
                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    l4.g(j3);
                    l4.d.remove(l4.a(i10, j3));
                    l4.c();
                    l4.t(2131749570, tL_messageActionStarGiftOnchainOffer.gift);
                    break;
                } else {
                    fc G = l4.h().G(R.raw.contact_check, 3, gd.a0(null, null, 2131749610, str2));
                    G.t = true;
                    G.j();
                    break;
                }
            default:
                w91 w91Var = (w91) obj3;
                bx bxVar = (bx) obj2;
                Boolean bool = (Boolean) obj;
                if (w91Var != null) {
                    w91Var.finishFragment();
                    bxVar.removeSelfFromStack();
                } else {
                    bxVar.finishFragment();
                }
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    if (j3 >= 0) {
                        TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(j3));
                        str = n10.l(c22);
                        chat = c22;
                    } else {
                        TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(-j3));
                        if (O0 == null) {
                            str = "";
                            chat = O0;
                        } else {
                            str = O0.title;
                            chat = O0;
                        }
                    }
                    kc b02 = kc.b0(T);
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, bool.booleanValue() ? 2131752976 : 2131752975, str));
                    b02.getClass();
                    b02.V(Arrays.asList(chat), W2, null, null).k(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x3(w91 w91Var, bx bxVar, long j3, int i7) {
        this.d = w91Var;
        this.e = bxVar;
        this.b = j3;
        this.c = i7;
    }
}
