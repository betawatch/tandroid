package bi;

import android.text.SpannableStringBuilder;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.y91;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements x10 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r3(String str, long j3, int i7, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer) {
        this.d = str;
        this.b = j3;
        this.c = i7;
        this.e = tL_messageActionStarGiftOnchainOffer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.messenger.x10
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
                    e4.g(j3);
                    e4.d.remove(e4.a(i10, j3));
                    e4.c();
                    e4.t(2131749571, tL_messageActionStarGiftOnchainOffer.gift);
                    break;
                } else {
                    gc G = e4.h().G(R.raw.contact_check, 3, gd.a0(null, null, 2131749611, str2));
                    G.t = true;
                    G.j();
                    break;
                }
            default:
                y91 y91Var = (y91) obj3;
                cx cxVar = (cx) obj2;
                Boolean bool = (Boolean) obj;
                if (y91Var != null) {
                    y91Var.finishFragment();
                    cxVar.removeSelfFromStack();
                } else {
                    cxVar.finishFragment();
                }
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    if (j3 >= 0) {
                        TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(j3));
                        str = o10.l(c22);
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
                    lc b02 = lc.b0(T);
                    SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.a0(null, null, bool.booleanValue() ? 2131752977 : 2131752976, str));
                    b02.getClass();
                    b02.V(Arrays.asList(chat), W2, null, null).k(false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ r3(y91 y91Var, cx cxVar, long j3, int i7) {
        this.d = y91Var;
        this.e = cxVar;
        this.b = j3;
        this.c = i7;
    }
}
