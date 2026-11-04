package ci;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.bd;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ d2(l6 l6Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = l6Var;
        this.e = tLObject;
        this.b = z10;
        this.f = document;
        this.c = z11;
        this.h = tL_error;
        this.n = savestargift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s8 F;
        int i3 = this.a;
        boolean z10 = this.c;
        Object obj = this.e;
        Object obj2 = this.h;
        Object obj3 = this.n;
        Object obj4 = this.f;
        boolean z11 = this.b;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                l6 l6Var = (l6) obj5;
                TLObject tLObject = (TLObject) obj;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj3;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error != null) {
                            if (z11 && l6Var.y2 != null && (F = e9.y(l6Var.a, false).F(l6Var.Q1, false)) != null) {
                                F.m(l6Var.y2, !savestargift.unsave);
                            }
                            l6Var.k().t(bd.a0(null, null, 2131743888, tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        l6Var.dismiss();
                        long x12 = l6Var.x1();
                        if (!z11) {
                            e9.y(l6Var.a, false).P(x12);
                        }
                        if (x12 < 0) {
                            org.telegram.ui.Components.fc.a0(T).s(document, bd.M0(z10 ? 2131750268 : 2131750266, null), bd.M0(z10 ? 2131750269 : 2131750267, null)).j();
                            break;
                        } else {
                            org.telegram.ui.Components.fc.a0(T).s(document, bd.M0(z10 ? 2131750131 : 2131750129, null), org.telegram.messenger.g0.U2(bd.M0(z10 ? 2131750132 : 2131750130, null), T instanceof ProfileActivity ? null : new x2(x12, T))).k(true);
                            break;
                        }
                    }
                }
                break;
            case 1:
                wm wmVar = (wm) obj5;
                String str = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                zi ziVar = (zi) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                if (!str.startsWith("video?")) {
                    if (z11 && !z10) {
                        wmVar.getParentActivity();
                        sf.c.o(str);
                        break;
                    } else {
                        wmVar.ja(ziVar, false, false);
                        wmVar.za(characterStyle, str, false, q1Var, ziVar);
                        break;
                    }
                } else {
                    wmVar.j8(characterStyle, false, ziVar, q1Var);
                    break;
                }
            default:
                zh.k kVar = (zh.k) obj5;
                Runnable runnable = (Runnable) obj4;
                String str2 = (String) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject2 = (TLObject) obj;
                kVar.w = false;
                kVar.z = true;
                if (z11) {
                    org.telegram.messenger.g0.r(runnable);
                }
                zh.k.k(kVar.q, false, false);
                if (TextUtils.equals(str2, kVar.t) && tL_error2 == null) {
                    kVar.z = true;
                    kVar.g((TLRPC.TL_messages_chatInviteImporters) tLObject2, str2, z10, false);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d2(wm wmVar, String str, CharacterStyle characterStyle, zi ziVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        this.d = wmVar;
        this.e = str;
        this.f = characterStyle;
        this.h = ziVar;
        this.n = q1Var;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ d2(zh.k kVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = kVar;
        this.b = z10;
        this.f = runnable;
        this.n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.c = z11;
    }
}
