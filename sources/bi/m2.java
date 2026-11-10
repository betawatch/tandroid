package bi;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ m2(k7 k7Var, TLObject tLObject, boolean z9, TLRPC.Document document, boolean z10, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = k7Var;
        this.e = tLObject;
        this.b = z9;
        this.f = document;
        this.c = z10;
        this.h = tL_error;
        this.n = savestargift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t9 F;
        int i7 = this.a;
        boolean z9 = this.c;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.n;
        Object obj4 = this.f;
        boolean z10 = this.b;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj5;
                TLObject tLObject = (TLObject) obj;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj3;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error != null) {
                            if (z10 && k7Var.A2 != null && (F = ea.y(k7Var.a, false).F(k7Var.S1, false)) != null) {
                                F.m(k7Var.A2, !savestargift.unsave);
                            }
                            k7Var.k().t(org.telegram.messenger.id.a0(null, null, 2131743878, tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        k7Var.dismiss();
                        long w12 = k7Var.w1();
                        if (!z10) {
                            ea.y(k7Var.a, false).P(w12);
                        }
                        if (w12 < 0) {
                            org.telegram.ui.Components.gc.a0(T).s(document, org.telegram.messenger.id.M0(z9 ? 2131750260 : 2131750258, null), org.telegram.messenger.id.M0(z9 ? 2131750261 : 2131750259, null)).j();
                            break;
                        } else {
                            org.telegram.ui.Components.gc.a0(T).s(document, org.telegram.messenger.id.M0(z9 ? 2131750123 : 2131750121, null), org.telegram.messenger.g0.U2(org.telegram.messenger.id.M0(z9 ? 2131750124 : 2131750122, null), T instanceof ProfileActivity ? null : new k3(w12, T))).k(true);
                            break;
                        }
                    }
                }
                break;
            case 1:
                cn cnVar = (cn) obj5;
                String str = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                ij ijVar = (ij) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                if (!str.startsWith("video?")) {
                    if (z10 && !z9) {
                        cnVar.getParentActivity();
                        vf.c.o(str);
                        break;
                    } else {
                        cnVar.la(ijVar, false, false);
                        cnVar.Ba(characterStyle, str, false, q1Var, ijVar);
                        break;
                    }
                } else {
                    cnVar.k8(characterStyle, false, ijVar, q1Var);
                    break;
                }
            default:
                yh.m mVar = (yh.m) obj5;
                Runnable runnable = (Runnable) obj4;
                String str2 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                mVar.w = false;
                mVar.z = true;
                if (z10) {
                    org.telegram.messenger.g0.r(runnable);
                }
                yh.m.k(mVar.q, false, false);
                if (TextUtils.equals(str2, mVar.t) && tL_error2 == null) {
                    mVar.z = true;
                    mVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject2, str2, z9, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ m2(cn cnVar, String str, CharacterStyle characterStyle, ij ijVar, org.telegram.ui.Cells.q1 q1Var, boolean z9, boolean z10) {
        this.d = cnVar;
        this.e = str;
        this.f = characterStyle;
        this.h = ijVar;
        this.n = q1Var;
        this.b = z9;
        this.c = z10;
    }

    public /* synthetic */ m2(yh.m mVar, boolean z9, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        this.d = mVar;
        this.b = z9;
        this.f = runnable;
        this.n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.c = z10;
    }
}
