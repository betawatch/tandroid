package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz implements hk0, ik0 {
    public final /* synthetic */ tz a;

    public /* synthetic */ kz(tz tzVar) {
        this.a = tzVar;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        tz tzVar = this.a;
        oz ozVar = tzVar.J;
        if (((org.telegram.ui.rx) ozVar).b.j2) {
            return;
        }
        rz rzVar = (rz) view;
        if (!tzVar.n) {
            if (i10 != tzVar.K || ozVar == null) {
                tzVar.f(rzVar.b, i10);
                return;
            } else {
                ((org.telegram.ui.rx) ozVar).b.I4(true, false);
                return;
            }
        }
        if (i10 != 0) {
            int L = org.telegram.messenger.i0.L(6.0f);
            RectF rectF = rzVar.f;
            float f11 = L;
            if (rectF.left - f11 >= f7 || rectF.right + f11 <= f7) {
                return;
            }
            org.telegram.ui.rx rxVar = (org.telegram.ui.rx) tzVar.J;
            rxVar.d((org.telegram.messenger.ap) rxVar.b.getMessagesController().S0().get(rzVar.b.a));
        }
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
    @Override // org.telegram.ui.Components.ik0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(int i10, View view) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.messenger.ap apVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.ay ayVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.messenger.ap apVar2;
        int i11;
        String str;
        int i12;
        String str2;
        int i13;
        boolean z14;
        TLRPC.Chat L0;
        tz tzVar = this.a;
        oz ozVar = tzVar.J;
        if (!((org.telegram.ui.rx) ozVar).b.j2 && !tzVar.n) {
            rz rzVar = (rz) view;
            org.telegram.ui.rx rxVar = (org.telegram.ui.rx) ozVar;
            org.telegram.ui.ay ayVar2 = rxVar.b;
            if (ayVar2.R0 == 0) {
                lVar = ((org.telegram.ui.ActionBar.k2) ayVar2).actionBar;
                if (!lVar.u() && ayVar2.T == 0.0f) {
                    z60 z60Var = ayVar2.L0;
                    if (z60Var != null && z60Var.D()) {
                        ayVar2.L0.u();
                        ayVar2.L0 = null;
                        return false;
                    }
                    if (rzVar.getId() != ayVar2.z0.getDefaultTabId()) {
                        ArrayList S0 = ayVar2.getMessagesController().S0();
                        int id2 = rzVar.getId();
                        if (S0 != null && id2 >= 0 && id2 < S0.size()) {
                            apVar = (org.telegram.messenger.ap) S0.get(rzVar.getId());
                            boolean z15 = true;
                            z10 = apVar != null;
                            boolean[] zArr = {true};
                            org.telegram.messenger.vp messagesController = ayVar2.getMessagesController();
                            arrayList = new ArrayList(!z10 ? messagesController.V0(ayVar2.W2) : messagesController.y);
                            if (apVar == null) {
                                apVar2 = (org.telegram.messenger.ap) ayVar2.getMessagesController().S0().get(rzVar.getId());
                                if (apVar2 != null) {
                                    int i14 = 0;
                                    while (i14 < arrayList.size()) {
                                        boolean z16 = z15;
                                        if (!apVar2.b(ayVar2.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i14)).id)) {
                                            arrayList.remove(i14);
                                            i14--;
                                        }
                                        i14++;
                                        z15 = z16;
                                    }
                                    z11 = z15;
                                    if (!apVar2.d()) {
                                        if (apVar2.i.isEmpty()) {
                                            int i15 = apVar2.g;
                                            int i16 = org.telegram.messenger.vp.D8;
                                        }
                                        z13 = false;
                                        if (z13) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= apVar2.h.size()) {
                                                    break;
                                                }
                                                long longValue = ((Long) apVar2.h.get(i17)).longValue();
                                                if (longValue < 0 && (L0 = ayVar2.getMessagesController().L0(Long.valueOf(-longValue))) != null && org.telegram.ui.i00.l0(L0)) {
                                                    zArr[0] = false;
                                                    break;
                                                }
                                                i17++;
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
                                    ayVar = ayVar2;
                                    z12 = false;
                                } else {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= arrayList.size()) {
                                            ayVar = ayVar2;
                                            z14 = z11;
                                            break;
                                        }
                                        ayVar = ayVar2;
                                        if (!ayVar2.getMessagesController().q2(((TLRPC.Dialog) arrayList.get(i18)).id, 0L, null)) {
                                            z14 = false;
                                            break;
                                        }
                                        i18++;
                                        ayVar2 = ayVar;
                                    }
                                    z12 = !z14;
                                }
                            } else {
                                ayVar = ayVar2;
                                z11 = true;
                                z12 = false;
                                z13 = false;
                                apVar2 = null;
                            }
                            boolean z17 = false;
                            for (i11 = 0; i11 < arrayList.size(); i11++) {
                                if (((TLRPC.Dialog) arrayList.get(i11)).unread_mark || ((TLRPC.Dialog) arrayList.get(i11)).unread_count > 0) {
                                    z17 = z11;
                                }
                            }
                            org.telegram.ui.ay ayVar3 = ayVar;
                            z60 H = z60.H(ayVar3, rzVar);
                            lv lvVar = new lv(2, (byte) 0);
                            Paint paint = new Paint(z11 ? 1 : 0);
                            lvVar.c = paint;
                            lvVar.b = new RectF();
                            paint.setColor(rxVar.b.getThemedColor(org.telegram.ui.ActionBar.t6.G8));
                            H.W(lvVar);
                            H.l(R.drawable.tabs_reorder, org.telegram.messenger.cd.L0(2131750708, null), new org.telegram.ui.rh(rxVar, 26), ayVar3.getMessagesController().S0().size() <= 1);
                            if (z10) {
                                str = null;
                                i12 = 2131750782;
                            } else {
                                i12 = 2131750781;
                                str = null;
                            }
                            H.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(i12, str), new ag.j0(rxVar, z10, apVar, 24), false);
                            boolean z18 = apVar == null && !arrayList.isEmpty();
                            int i19 = !z12 ? R.drawable.msg_mute : R.drawable.msg_unmute;
                            if (z12) {
                                str2 = null;
                                i13 = 2131750700;
                            } else {
                                i13 = 2131750738;
                                str2 = null;
                            }
                            boolean z19 = z10;
                            H.l(i19, org.telegram.messenger.cd.L0(i13, str2), new ag.j0(rxVar, arrayList, z12, 25), z18);
                            H.l(R.drawable.msg_markread, org.telegram.messenger.cd.L0(2131748697, null), new org.telegram.ui.xs(10, rxVar, arrayList), z17);
                            H.l(R.drawable.msg_share, org.telegram.ui.i00.D0((apVar2 == null && apVar2.f()) ? -1 : 0, org.telegram.messenger.cd.L0(2131748935, null), true), new org.telegram.ui.qq(rxVar, zArr, apVar2, 3), z13);
                            H.m(R.drawable.msg_delete, new org.telegram.ui.xs(11, rxVar, apVar), org.telegram.messenger.cd.L0(2131750788, null), !z19, true);
                            H.s = 96;
                            H.i = 3;
                            H.a0(org.telegram.messenger.i0.L(-12.0f), org.telegram.messenger.i0.L(-4.0f));
                            H.Z();
                            ayVar3.L0 = H;
                            tzVar.F.d1(true);
                            return true;
                        }
                    }
                    apVar = null;
                    boolean z152 = true;
                    if (apVar != null) {
                    }
                    boolean[] zArr2 = {true};
                    org.telegram.messenger.vp messagesController2 = ayVar2.getMessagesController();
                    arrayList = new ArrayList(!z10 ? messagesController2.V0(ayVar2.W2) : messagesController2.y);
                    if (apVar == null) {
                    }
                    boolean z172 = false;
                    while (i11 < arrayList.size()) {
                    }
                    org.telegram.ui.ay ayVar32 = ayVar;
                    z60 H2 = z60.H(ayVar32, rzVar);
                    lv lvVar2 = new lv(2, (byte) 0);
                    Paint paint2 = new Paint(z11 ? 1 : 0);
                    lvVar2.c = paint2;
                    lvVar2.b = new RectF();
                    paint2.setColor(rxVar.b.getThemedColor(org.telegram.ui.ActionBar.t6.G8));
                    H2.W(lvVar2);
                    H2.l(R.drawable.tabs_reorder, org.telegram.messenger.cd.L0(2131750708, null), new org.telegram.ui.rh(rxVar, 26), ayVar32.getMessagesController().S0().size() <= 1);
                    if (z10) {
                    }
                    H2.c(R.drawable.msg_edit, org.telegram.messenger.cd.L0(i12, str), new ag.j0(rxVar, z10, apVar, 24), false);
                    if (apVar == null) {
                    }
                    if (!z12) {
                    }
                    if (z12) {
                    }
                    boolean z192 = z10;
                    H2.l(i19, org.telegram.messenger.cd.L0(i13, str2), new ag.j0(rxVar, arrayList, z12, 25), z18);
                    H2.l(R.drawable.msg_markread, org.telegram.messenger.cd.L0(2131748697, null), new org.telegram.ui.xs(10, rxVar, arrayList), z172);
                    H2.l(R.drawable.msg_share, org.telegram.ui.i00.D0((apVar2 == null && apVar2.f()) ? -1 : 0, org.telegram.messenger.cd.L0(2131748935, null), true), new org.telegram.ui.qq(rxVar, zArr2, apVar2, 3), z13);
                    H2.m(R.drawable.msg_delete, new org.telegram.ui.xs(11, rxVar, apVar), org.telegram.messenger.cd.L0(2131750788, null), !z192, true);
                    H2.s = 96;
                    H2.i = 3;
                    H2.a0(org.telegram.messenger.i0.L(-12.0f), org.telegram.messenger.i0.L(-4.0f));
                    H2.Z();
                    ayVar32.L0 = H2;
                    tzVar.F.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
