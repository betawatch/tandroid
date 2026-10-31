package oh;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
import rh.e4;
import rh.e6;
import rh.r1;
import rh.u5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h(q qVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.e = qVar;
        this.c = z10;
        this.f = runnable;
        this.b = str;
        this.h = tL_error;
        this.n = tLObject;
        this.d = z11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u5 F;
        int i10 = this.a;
        Object obj = this.b;
        Object obj2 = this.h;
        boolean z10 = this.d;
        Object obj3 = this.f;
        boolean z11 = this.c;
        Object obj4 = this.n;
        Object obj5 = this.e;
        switch (i10) {
            case 0:
                q qVar = (q) obj5;
                Runnable runnable = (Runnable) obj3;
                String str = (String) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj4;
                qVar.w = false;
                qVar.z = true;
                if (z11) {
                    i0.r(runnable);
                }
                q.k(qVar.q, false, false);
                if (TextUtils.equals(str, qVar.t) && tL_error == null) {
                    qVar.z = true;
                    qVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject, str, z10, false);
                    break;
                }
                break;
            case 1:
                un unVar = (un) obj5;
                String str2 = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj3;
                jj jjVar = (jj) obj2;
                q1 q1Var = (q1) obj4;
                if (!str2.startsWith("video?")) {
                    if (z11 && !z10) {
                        unVar.getParentActivity();
                        gf.f.m(str2);
                        break;
                    } else {
                        unVar.Z9(jjVar, false, false);
                        unVar.pa(characterStyle, str2, false, q1Var, jjVar);
                        break;
                    }
                } else {
                    unVar.c8(characterStyle, false, jjVar, q1Var);
                    break;
                }
            default:
                e4 e4Var = (e4) obj5;
                TLObject tLObject2 = (TLObject) obj4;
                TLRPC.Document document = (TLRPC.Document) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj;
                k2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error2 != null) {
                            if (z11 && e4Var.x2 != null && (F = e6.y(e4Var.a, false).F(e4Var.P1, false)) != null) {
                                F.m(e4Var.x2, !savestargift.unsave);
                            }
                            e4Var.k().t(cd.a0(null, null, 2131743903, tL_error2.text), null).k(false);
                            break;
                        }
                    } else {
                        e4Var.dismiss();
                        long x12 = e4Var.x1();
                        if (!z11) {
                            e6.y(e4Var.a, false).P(x12);
                        }
                        if (x12 < 0) {
                            cc.a0(T).s(document, cd.L0(z10 ? 2131750269 : 2131750267, null), cd.L0(z10 ? 2131750270 : 2131750268, null)).j();
                            break;
                        } else {
                            cc.a0(T).s(document, cd.L0(z10 ? 2131750132 : 2131750130, null), i0.T2(cd.L0(z10 ? 2131750133 : 2131750131, null), T instanceof ProfileActivity ? null : new r1(x12, T))).k(true);
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ h(un unVar, String str, CharacterStyle characterStyle, jj jjVar, q1 q1Var, boolean z10, boolean z11) {
        this.e = unVar;
        this.b = str;
        this.f = characterStyle;
        this.h = jjVar;
        this.n = q1Var;
        this.c = z10;
        this.d = z11;
    }

    public /* synthetic */ h(e4 e4Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.e = e4Var;
        this.n = tLObject;
        this.c = z10;
        this.f = document;
        this.d = z11;
        this.h = tL_error;
        this.b = savestargift;
    }
}
