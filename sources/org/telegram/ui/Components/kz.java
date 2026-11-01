package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz implements ik0, jk0 {
    public final /* synthetic */ tz a;

    public /* synthetic */ kz(tz tzVar) {
        this.a = tzVar;
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        tz tzVar = this.a;
        oz ozVar = tzVar.J;
        if (((org.telegram.ui.qx) ozVar).b.j2) {
            return;
        }
        rz rzVar = (rz) view;
        if (!tzVar.n) {
            if (i10 != tzVar.K || ozVar == null) {
                tzVar.f(rzVar.b, i10);
                return;
            } else {
                ((org.telegram.ui.qx) ozVar).b.J4(true, false);
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
            org.telegram.ui.qx qxVar = (org.telegram.ui.qx) tzVar.J;
            qxVar.d((org.telegram.messenger.bp) qxVar.b.getMessagesController().S0().get(rzVar.b.a));
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
    @Override // org.telegram.ui.Components.jk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean f(int i10, View view) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.messenger.bp bpVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.zx zxVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.messenger.bp bpVar2;
        int i11;
        String str;
        int i12;
        String str2;
        int i13;
        boolean z14;
        TLRPC.Chat L0;
        tz tzVar = this.a;
        oz ozVar = tzVar.J;
        if (!((org.telegram.ui.qx) ozVar).b.j2 && !tzVar.n) {
            rz rzVar = (rz) view;
            org.telegram.ui.qx qxVar = (org.telegram.ui.qx) ozVar;
            org.telegram.ui.zx zxVar2 = qxVar.b;
            if (zxVar2.R0 == 0) {
                lVar = ((org.telegram.ui.ActionBar.k2) zxVar2).actionBar;
                if (!lVar.u() && zxVar2.T == 0.0f) {
                    z60 z60Var = zxVar2.L0;
                    if (z60Var != null && z60Var.D()) {
                        zxVar2.L0.u();
                        zxVar2.L0 = null;
                        return false;
                    }
                    if (rzVar.getId() != zxVar2.z0.getDefaultTabId()) {
                        ArrayList S0 = zxVar2.getMessagesController().S0();
                        int id2 = rzVar.getId();
                        if (S0 != null && id2 >= 0 && id2 < S0.size()) {
                            bpVar = (org.telegram.messenger.bp) S0.get(rzVar.getId());
                            boolean z15 = true;
                            z10 = bpVar != null;
                            boolean[] zArr = {true};
                            org.telegram.messenger.wp messagesController = zxVar2.getMessagesController();
                            arrayList = new ArrayList(!z10 ? messagesController.V0(zxVar2.W2) : messagesController.y);
                            if (bpVar == null) {
                                bpVar2 = (org.telegram.messenger.bp) zxVar2.getMessagesController().S0().get(rzVar.getId());
                                if (bpVar2 != null) {
                                    int i14 = 0;
                                    while (i14 < arrayList.size()) {
                                        boolean z16 = z15;
                                        if (!bpVar2.b(zxVar2.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i14)).id)) {
                                            arrayList.remove(i14);
                                            i14--;
                                        }
                                        i14++;
                                        z15 = z16;
                                    }
                                    z11 = z15;
                                    if (!bpVar2.d()) {
                                        if (bpVar2.i.isEmpty()) {
                                            int i15 = bpVar2.g;
                                            int i16 = org.telegram.messenger.wp.D8;
                                        }
                                        z13 = false;
                                        if (z13) {
                                            int i17 = 0;
                                            while (true) {
                                                if (i17 >= bpVar2.h.size()) {
                                                    break;
                                                }
                                                long longValue = ((Long) bpVar2.h.get(i17)).longValue();
                                                if (longValue < 0 && (L0 = zxVar2.getMessagesController().L0(Long.valueOf(-longValue))) != null && org.telegram.ui.h00.m0(L0)) {
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
                                    zxVar = zxVar2;
                                    z12 = false;
                                } else {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= arrayList.size()) {
                                            zxVar = zxVar2;
                                            z14 = z11;
                                            break;
                                        }
                                        zxVar = zxVar2;
                                        if (!zxVar2.getMessagesController().q2(((TLRPC.Dialog) arrayList.get(i18)).id, 0L, null)) {
                                            z14 = false;
                                            break;
                                        }
                                        i18++;
                                        zxVar2 = zxVar;
                                    }
                                    z12 = !z14;
                                }
                            } else {
                                zxVar = zxVar2;
                                z11 = true;
                                z12 = false;
                                z13 = false;
                                bpVar2 = null;
                            }
                            boolean z17 = false;
                            for (i11 = 0; i11 < arrayList.size(); i11++) {
                                if (((TLRPC.Dialog) arrayList.get(i11)).unread_mark || ((TLRPC.Dialog) arrayList.get(i11)).unread_count > 0) {
                                    z17 = z11;
                                }
                            }
                            org.telegram.ui.zx zxVar3 = zxVar;
                            z60 H = z60.H(zxVar3, rzVar);
                            lv lvVar = new lv(2, (byte) 0);
                            Paint paint = new Paint(z11 ? 1 : 0);
                            lvVar.c = paint;
                            lvVar.b = new RectF();
                            paint.setColor(qxVar.b.getThemedColor(org.telegram.ui.ActionBar.t6.G8));
                            H.W(lvVar);
                            H.l(R.drawable.tabs_reorder, org.telegram.messenger.dd.L0(2131750708, null), new org.telegram.ui.rh(qxVar, 26), zxVar3.getMessagesController().S0().size() <= 1);
                            if (z10) {
                                str = null;
                                i12 = 2131750782;
                            } else {
                                i12 = 2131750781;
                                str = null;
                            }
                            H.c(R.drawable.msg_edit, org.telegram.messenger.dd.L0(i12, str), new ag.j0(qxVar, z10, bpVar, 24), false);
                            boolean z18 = bpVar == null && !arrayList.isEmpty();
                            int i19 = !z12 ? R.drawable.msg_mute : R.drawable.msg_unmute;
                            if (z12) {
                                str2 = null;
                                i13 = 2131750700;
                            } else {
                                i13 = 2131750738;
                                str2 = null;
                            }
                            boolean z19 = z10;
                            H.l(i19, org.telegram.messenger.dd.L0(i13, str2), new ag.j0(qxVar, arrayList, z12, 25), z18);
                            H.l(R.drawable.msg_markread, org.telegram.messenger.dd.L0(2131748697, null), new org.telegram.ui.Components.voip.u(11, qxVar, arrayList), z17);
                            H.l(R.drawable.msg_share, org.telegram.ui.h00.E0((bpVar2 == null && bpVar2.f()) ? -1 : 0, org.telegram.messenger.dd.L0(2131748935, null), true), new org.telegram.ui.qq(qxVar, zArr, bpVar2, 3), z13);
                            H.m(R.drawable.msg_delete, new org.telegram.ui.Components.voip.u(12, qxVar, bpVar), org.telegram.messenger.dd.L0(2131750788, null), !z19, true);
                            H.s = 96;
                            H.i = 3;
                            H.a0(org.telegram.messenger.i0.L(-12.0f), org.telegram.messenger.i0.L(-4.0f));
                            H.Z();
                            zxVar3.L0 = H;
                            tzVar.F.d1(true);
                            return true;
                        }
                    }
                    bpVar = null;
                    boolean z152 = true;
                    if (bpVar != null) {
                    }
                    boolean[] zArr2 = {true};
                    org.telegram.messenger.wp messagesController2 = zxVar2.getMessagesController();
                    arrayList = new ArrayList(!z10 ? messagesController2.V0(zxVar2.W2) : messagesController2.y);
                    if (bpVar == null) {
                    }
                    boolean z172 = false;
                    while (i11 < arrayList.size()) {
                    }
                    org.telegram.ui.zx zxVar32 = zxVar;
                    z60 H2 = z60.H(zxVar32, rzVar);
                    lv lvVar2 = new lv(2, (byte) 0);
                    Paint paint2 = new Paint(z11 ? 1 : 0);
                    lvVar2.c = paint2;
                    lvVar2.b = new RectF();
                    paint2.setColor(qxVar.b.getThemedColor(org.telegram.ui.ActionBar.t6.G8));
                    H2.W(lvVar2);
                    H2.l(R.drawable.tabs_reorder, org.telegram.messenger.dd.L0(2131750708, null), new org.telegram.ui.rh(qxVar, 26), zxVar32.getMessagesController().S0().size() <= 1);
                    if (z10) {
                    }
                    H2.c(R.drawable.msg_edit, org.telegram.messenger.dd.L0(i12, str), new ag.j0(qxVar, z10, bpVar, 24), false);
                    if (bpVar == null) {
                    }
                    if (!z12) {
                    }
                    if (z12) {
                    }
                    boolean z192 = z10;
                    H2.l(i19, org.telegram.messenger.dd.L0(i13, str2), new ag.j0(qxVar, arrayList, z12, 25), z18);
                    H2.l(R.drawable.msg_markread, org.telegram.messenger.dd.L0(2131748697, null), new org.telegram.ui.Components.voip.u(11, qxVar, arrayList), z172);
                    H2.l(R.drawable.msg_share, org.telegram.ui.h00.E0((bpVar2 == null && bpVar2.f()) ? -1 : 0, org.telegram.messenger.dd.L0(2131748935, null), true), new org.telegram.ui.qq(qxVar, zArr2, bpVar2, 3), z13);
                    H2.m(R.drawable.msg_delete, new org.telegram.ui.Components.voip.u(12, qxVar, bpVar), org.telegram.messenger.dd.L0(2131750788, null), !z192, true);
                    H2.s = 96;
                    H2.i = 3;
                    H2.a0(org.telegram.messenger.i0.L(-12.0f), org.telegram.messenger.i0.L(-4.0f));
                    H2.Z();
                    zxVar32.L0 = H2;
                    tzVar.F.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
