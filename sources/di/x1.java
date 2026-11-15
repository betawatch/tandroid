package di;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ x1(c6 c6Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = c6Var;
        this.e = tLObject;
        this.b = z10;
        this.f = document;
        this.c = z11;
        this.h = tL_error;
        this.n = savestargift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j8 F;
        int i7 = this.a;
        boolean z10 = this.c;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.n;
        Object obj4 = this.f;
        boolean z11 = this.b;
        Object obj5 = this.d;
        switch (i7) {
            case 0:
                c6 c6Var = (c6) obj5;
                TLObject tLObject = (TLObject) obj;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj3;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error != null) {
                            if (z11 && c6Var.B2 != null && (F = u8.y(c6Var.a, false).F(c6Var.T1, false)) != null) {
                                F.m(c6Var.B2, !savestargift.unsave);
                            }
                            c6Var.k().t(hd.a0(null, null, 2131743878, tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        c6Var.dismiss();
                        long x12 = c6Var.x1();
                        if (!z11) {
                            u8.y(c6Var.a, false).P(x12);
                        }
                        if (x12 < 0) {
                            org.telegram.ui.Components.cc.a0(T).s(document, hd.M0(z10 ? 2131750260 : 2131750258, null), hd.M0(z10 ? 2131750261 : 2131750259, null)).j();
                            break;
                        } else {
                            org.telegram.ui.Components.cc.a0(T).s(document, hd.M0(z10 ? 2131750123 : 2131750121, null), org.telegram.messenger.g0.U2(hd.M0(z10 ? 2131750124 : 2131750122, null), T instanceof ProfileActivity ? null : new ch.r0(x12, T))).k(true);
                            break;
                        }
                    }
                }
                break;
            case 1:
                an anVar = (an) obj5;
                String str = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                gj gjVar = (gj) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                if (!str.startsWith("video?")) {
                    if (z11 && !z10) {
                        anVar.getParentActivity();
                        vf.c.o(str);
                        break;
                    } else {
                        anVar.ma(gjVar, false, false);
                        anVar.Ca(characterStyle, str, false, q1Var, gjVar);
                        break;
                    }
                } else {
                    anVar.l8(characterStyle, false, gjVar, q1Var);
                    break;
                }
            default:
                zh.l lVar = (zh.l) obj5;
                Runnable runnable = (Runnable) obj4;
                String str2 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                lVar.w = false;
                lVar.z = true;
                if (z11) {
                    org.telegram.messenger.g0.r(runnable);
                }
                zh.l.k(lVar.q, false, false);
                if (TextUtils.equals(str2, lVar.t) && tL_error2 == null) {
                    lVar.z = true;
                    lVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject2, str2, z10, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x1(an anVar, String str, CharacterStyle characterStyle, gj gjVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        this.d = anVar;
        this.e = str;
        this.f = characterStyle;
        this.h = gjVar;
        this.n = q1Var;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ x1(zh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = lVar;
        this.b = z10;
        this.f = runnable;
        this.n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.c = z11;
    }
}
