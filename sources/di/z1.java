package di;

import android.text.TextUtils;
import android.text.style.CharacterStyle;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ z1(f6 f6Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        this.d = f6Var;
        this.e = tLObject;
        this.b = z10;
        this.f = document;
        this.c = z11;
        this.h = tL_error;
        this.n = savestargift;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m8 F;
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
                f6 f6Var = (f6) obj5;
                TLObject tLObject = (TLObject) obj;
                TLRPC.Document document = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                TL_stars.saveStarGift savestargift = (TL_stars.saveStarGift) obj3;
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error != null) {
                            if (z11 && f6Var.B2 != null && (F = x8.y(f6Var.a, false).F(f6Var.T1, false)) != null) {
                                F.m(f6Var.B2, true ^ savestargift.unsave);
                            }
                            f6Var.k().t(org.telegram.ui.Components.lc.W(tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        f6Var.dismiss();
                        long C1 = f6Var.C1();
                        if (!z11) {
                            x8.y(f6Var.a, false).O(C1);
                        }
                        if (C1 < 0) {
                            org.telegram.ui.Components.lc.b0(T).s(document, gd.M0(z10 ? 2131750244 : 2131750242, null), gd.M0(z10 ? 2131750245 : 2131750243, null)).j();
                            break;
                        } else {
                            org.telegram.ui.Components.lc.b0(T).s(document, gd.M0(z10 ? 2131750107 : 2131750105, null), org.telegram.messenger.g0.T2(gd.M0(z10 ? 2131750108 : 2131750106, null), T instanceof ProfileActivity ? null : new ch.r0(C1, T))).k(true);
                            break;
                        }
                    }
                }
                break;
            case 1:
                bn bnVar = (bn) obj5;
                String str = (String) obj;
                CharacterStyle characterStyle = (CharacterStyle) obj4;
                fj fjVar = (fj) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj3;
                if (!str.startsWith("video?")) {
                    if (z11 && !z10) {
                        bnVar.getParentActivity();
                        vf.c.o(str);
                        break;
                    } else {
                        bnVar.ma(fjVar, false, false);
                        bnVar.Ca(characterStyle, str, false, q1Var, fjVar);
                        break;
                    }
                } else {
                    bnVar.l8(characterStyle, false, fjVar, q1Var);
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

    public /* synthetic */ z1(bn bnVar, String str, CharacterStyle characterStyle, fj fjVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, boolean z11) {
        this.d = bnVar;
        this.e = str;
        this.f = characterStyle;
        this.h = fjVar;
        this.n = q1Var;
        this.b = z10;
        this.c = z11;
    }

    public /* synthetic */ z1(zh.l lVar, boolean z10, Runnable runnable, String str, TLRPC.TL_error tL_error, TLObject tLObject, boolean z11) {
        this.d = lVar;
        this.b = z10;
        this.f = runnable;
        this.n = str;
        this.h = tL_error;
        this.e = tLObject;
        this.c = z11;
    }
}
