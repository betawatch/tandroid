package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ty implements gj0, hj0 {
    public final /* synthetic */ bz a;

    public /* synthetic */ ty(bz bzVar) {
        this.a = bzVar;
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        bz bzVar = this.a;
        xy xyVar = bzVar.K;
        if (((org.telegram.ui.kw) xyVar).b.k2) {
            return;
        }
        zy zyVar = (zy) view;
        if (!bzVar.n) {
            if (i3 != bzVar.L || xyVar == null) {
                bzVar.f(zyVar.b, i3);
                return;
            } else {
                ((org.telegram.ui.kw) xyVar).b.J4(true, false);
                return;
            }
        }
        if (i3 != 0) {
            int L = org.telegram.messenger.g0.L(6.0f);
            RectF rectF = zyVar.f;
            float f12 = L;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.kw kwVar = (org.telegram.ui.kw) bzVar.K;
            kwVar.d((org.telegram.messenger.mo) kwVar.b.getMessagesController().T0().get(zyVar.b.a));
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
    
        if ((r7 & (-1537)) == 0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01de  */
    @Override // org.telegram.ui.Components.hj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(int i3, View view) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.mo moVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.uw uwVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.messenger.mo moVar2;
        int i10;
        String str;
        int i11;
        String str2;
        int i12;
        boolean z14;
        TLRPC.Chat M0;
        bz bzVar = this.a;
        xy xyVar = bzVar.K;
        if (!((org.telegram.ui.kw) xyVar).b.k2 && !bzVar.n) {
            zy zyVar = (zy) view;
            org.telegram.ui.kw kwVar = (org.telegram.ui.kw) xyVar;
            org.telegram.ui.uw uwVar2 = kwVar.b;
            if (uwVar2.S0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.d2) uwVar2).actionBar;
                if (!kVar.v() && uwVar2.U == 0.0f) {
                    f60 f60Var = uwVar2.M0;
                    if (f60Var != null && f60Var.D()) {
                        uwVar2.M0.u();
                        uwVar2.M0 = null;
                        return false;
                    }
                    if (zyVar.getId() != uwVar2.A0.getDefaultTabId()) {
                        ArrayList T0 = uwVar2.getMessagesController().T0();
                        int id2 = zyVar.getId();
                        if (T0 != null && id2 >= 0 && id2 < T0.size()) {
                            moVar = (org.telegram.messenger.mo) T0.get(zyVar.getId());
                            boolean z15 = true;
                            z10 = moVar != null;
                            boolean[] zArr = {true};
                            org.telegram.messenger.hp messagesController = uwVar2.getMessagesController();
                            arrayList = new ArrayList(!z10 ? messagesController.W0(uwVar2.X2) : messagesController.y);
                            if (moVar == null) {
                                moVar2 = (org.telegram.messenger.mo) uwVar2.getMessagesController().T0().get(zyVar.getId());
                                if (moVar2 != null) {
                                    int i13 = 0;
                                    while (i13 < arrayList.size()) {
                                        boolean z16 = z15;
                                        if (!moVar2.b(uwVar2.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i13)).id)) {
                                            arrayList.remove(i13);
                                            i13--;
                                        }
                                        i13++;
                                        z15 = z16;
                                    }
                                    z11 = z15;
                                    if (!moVar2.d()) {
                                        if (moVar2.i.isEmpty()) {
                                            int i14 = moVar2.g;
                                            int i15 = org.telegram.messenger.hp.C8;
                                        }
                                        z13 = false;
                                        if (z13) {
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= moVar2.h.size()) {
                                                    break;
                                                }
                                                long longValue = ((Long) moVar2.h.get(i16)).longValue();
                                                if (longValue < 0 && (M0 = uwVar2.getMessagesController().M0(Long.valueOf(-longValue))) != null && org.telegram.ui.ez.m0(M0)) {
                                                    zArr[0] = false;
                                                    break;
                                                }
                                                i16++;
                                            }
                                        }
                                    }
                                    z13 = z11;
                                    if (z13) {
                                    }
                                } else {
                                    z11 = true;
                                    z13 = false;
                                }
                                if (arrayList.isEmpty()) {
                                    uwVar = uwVar2;
                                    z12 = false;
                                } else {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= arrayList.size()) {
                                            uwVar = uwVar2;
                                            z14 = z11;
                                            break;
                                        }
                                        uwVar = uwVar2;
                                        if (!uwVar2.getMessagesController().r2(((TLRPC.Dialog) arrayList.get(i17)).id, 0L, null)) {
                                            z14 = false;
                                            break;
                                        }
                                        i17++;
                                        uwVar2 = uwVar;
                                    }
                                    z12 = !z14;
                                }
                            } else {
                                uwVar = uwVar2;
                                z11 = true;
                                z12 = false;
                                z13 = false;
                                moVar2 = null;
                            }
                            boolean z17 = false;
                            for (i10 = 0; i10 < arrayList.size(); i10++) {
                                if (((TLRPC.Dialog) arrayList.get(i10)).unread_mark || ((TLRPC.Dialog) arrayList.get(i10)).unread_count > 0) {
                                    z17 = z11;
                                }
                            }
                            org.telegram.ui.uw uwVar3 = uwVar;
                            f60 H = f60.H(uwVar3, zyVar);
                            yu yuVar = new yu(2, (byte) 0);
                            Paint paint = new Paint(z11 ? 1 : 0);
                            yuVar.c = paint;
                            yuVar.b = new RectF();
                            paint.setColor(kwVar.b.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                            H.W(yuVar);
                            H.l(R.drawable.tabs_reorder, org.telegram.messenger.bd.M0(2131750708, null), new org.telegram.ui.xg(kwVar, 25), uwVar3.getMessagesController().T0().size() <= 1);
                            if (z10) {
                                str = null;
                                i11 = 2131750782;
                            } else {
                                i11 = 2131750781;
                                str = null;
                            }
                            H.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(i11, str), new ci.v6(kwVar, z10, moVar, 27), false);
                            boolean z18 = moVar == null && !arrayList.isEmpty();
                            int i18 = !z12 ? R.drawable.msg_mute : R.drawable.msg_unmute;
                            if (z12) {
                                str2 = null;
                                i12 = 2131750700;
                            } else {
                                i12 = 2131750738;
                                str2 = null;
                            }
                            boolean z19 = z10;
                            H.l(i18, org.telegram.messenger.bd.M0(i12, str2), new ci.v6(kwVar, arrayList, z12, 28), z18);
                            H.l(R.drawable.msg_markread, org.telegram.messenger.bd.M0(2131748690, null), new p11(22, kwVar, arrayList), z17);
                            H.l(R.drawable.msg_share, org.telegram.ui.ez.E0((moVar2 == null && moVar2.f()) ? -1 : 0, org.telegram.messenger.bd.M0(2131748933, null), true), new org.telegram.ui.pp(kwVar, zArr, moVar2, 3), z13);
                            H.m(R.drawable.msg_delete, new p11(23, kwVar, moVar), org.telegram.messenger.bd.M0(2131750788, null), !z19, true);
                            H.s = 96;
                            H.i = 3;
                            H.a0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                            H.Z();
                            uwVar3.M0 = H;
                            bzVar.G.d1(true);
                            return true;
                        }
                    }
                    moVar = null;
                    boolean z152 = true;
                    if (moVar != null) {
                    }
                    boolean[] zArr2 = {true};
                    org.telegram.messenger.hp messagesController2 = uwVar2.getMessagesController();
                    arrayList = new ArrayList(!z10 ? messagesController2.W0(uwVar2.X2) : messagesController2.y);
                    if (moVar == null) {
                    }
                    boolean z172 = false;
                    while (i10 < arrayList.size()) {
                    }
                    org.telegram.ui.uw uwVar32 = uwVar;
                    f60 H2 = f60.H(uwVar32, zyVar);
                    yu yuVar2 = new yu(2, (byte) 0);
                    Paint paint2 = new Paint(z11 ? 1 : 0);
                    yuVar2.c = paint2;
                    yuVar2.b = new RectF();
                    paint2.setColor(kwVar.b.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                    H2.W(yuVar2);
                    H2.l(R.drawable.tabs_reorder, org.telegram.messenger.bd.M0(2131750708, null), new org.telegram.ui.xg(kwVar, 25), uwVar32.getMessagesController().T0().size() <= 1);
                    if (z10) {
                    }
                    H2.c(R.drawable.msg_edit, org.telegram.messenger.bd.M0(i11, str), new ci.v6(kwVar, z10, moVar, 27), false);
                    if (moVar == null) {
                    }
                    if (!z12) {
                    }
                    if (z12) {
                    }
                    boolean z192 = z10;
                    H2.l(i18, org.telegram.messenger.bd.M0(i12, str2), new ci.v6(kwVar, arrayList, z12, 28), z18);
                    H2.l(R.drawable.msg_markread, org.telegram.messenger.bd.M0(2131748690, null), new p11(22, kwVar, arrayList), z172);
                    H2.l(R.drawable.msg_share, org.telegram.ui.ez.E0((moVar2 == null && moVar2.f()) ? -1 : 0, org.telegram.messenger.bd.M0(2131748933, null), true), new org.telegram.ui.pp(kwVar, zArr2, moVar2, 3), z13);
                    H2.m(R.drawable.msg_delete, new p11(23, kwVar, moVar), org.telegram.messenger.bd.M0(2131750788, null), !z192, true);
                    H2.s = 96;
                    H2.i = 3;
                    H2.a0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                    H2.Z();
                    uwVar32.M0 = H2;
                    bzVar.G.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
