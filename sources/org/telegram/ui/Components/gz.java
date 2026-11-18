package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gz implements pj0, qj0 {
    public final /* synthetic */ pz a;

    public /* synthetic */ gz(pz pzVar) {
        this.a = pzVar;
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
    
        if ((r7 & (-1537)) == 0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ba  */
    @Override // org.telegram.ui.Components.qj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(int i7, View view) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.ro roVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.cx cxVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.messenger.ro roVar2;
        org.telegram.messenger.ro roVar3;
        int i10;
        String str;
        int i11;
        String str2;
        int i12;
        boolean z14;
        TLRPC.Chat O0;
        pz pzVar = this.a;
        lz lzVar = pzVar.K;
        if (!((org.telegram.ui.tw) lzVar).b.l2 && !pzVar.n) {
            nz nzVar = (nz) view;
            org.telegram.ui.tw twVar = (org.telegram.ui.tw) lzVar;
            org.telegram.ui.cx cxVar2 = twVar.b;
            if (cxVar2.T0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.h2) cxVar2).actionBar;
                if (!kVar.y() && cxVar2.U == 0.0f) {
                    y60 y60Var = cxVar2.M0;
                    if (y60Var != null && y60Var.E()) {
                        cxVar2.M0.v();
                        cxVar2.M0 = null;
                        return false;
                    }
                    if (nzVar.getId() != cxVar2.A0.getDefaultTabId()) {
                        ArrayList V0 = cxVar2.getMessagesController().V0();
                        int id2 = nzVar.getId();
                        if (V0 != null && id2 >= 0 && id2 < V0.size()) {
                            roVar = (org.telegram.messenger.ro) V0.get(nzVar.getId());
                            boolean z15 = true;
                            z10 = roVar != null;
                            boolean[] zArr = {true};
                            org.telegram.messenger.mp messagesController = cxVar2.getMessagesController();
                            arrayList = new ArrayList(!z10 ? messagesController.Y0(cxVar2.Y2) : messagesController.y);
                            if (roVar == null) {
                                roVar2 = (org.telegram.messenger.ro) cxVar2.getMessagesController().V0().get(nzVar.getId());
                                if (roVar2 != null) {
                                    int i13 = 0;
                                    while (i13 < arrayList.size()) {
                                        boolean z16 = z15;
                                        if (!roVar2.a(cxVar2.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i13)).id)) {
                                            arrayList.remove(i13);
                                            i13--;
                                        }
                                        i13++;
                                        z15 = z16;
                                    }
                                    z11 = z15;
                                    if (!roVar2.c()) {
                                        if (roVar2.i.isEmpty()) {
                                            int i14 = roVar2.g;
                                            int i15 = org.telegram.messenger.mp.I8;
                                        }
                                        z13 = false;
                                        if (z13) {
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= roVar2.h.size()) {
                                                    break;
                                                }
                                                long longValue = ((Long) roVar2.h.get(i16)).longValue();
                                                if (longValue < 0 && (O0 = cxVar2.getMessagesController().O0(Long.valueOf(-longValue))) != null && org.telegram.ui.kz.m0(O0)) {
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
                                    cxVar = cxVar2;
                                    z12 = false;
                                } else {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= arrayList.size()) {
                                            cxVar = cxVar2;
                                            z14 = z11;
                                            break;
                                        }
                                        cxVar = cxVar2;
                                        if (!cxVar2.getMessagesController().u2(((TLRPC.Dialog) arrayList.get(i17)).id, 0L, null)) {
                                            z14 = false;
                                            break;
                                        }
                                        i17++;
                                        cxVar2 = cxVar;
                                    }
                                    z12 = !z14;
                                }
                            } else {
                                cxVar = cxVar2;
                                z11 = true;
                                z12 = false;
                                z13 = false;
                                roVar2 = null;
                            }
                            if (z10) {
                                cxVar.getMessagesController().getClass();
                                if (roVar2 != null && (roVar2.g & 64) == 0) {
                                    roVar3 = roVar2;
                                }
                                roVar3 = null;
                            } else {
                                ArrayList V02 = cxVar.getMessagesController().V0();
                                for (int i18 = 0; i18 < V02.size(); i18++) {
                                    if (((org.telegram.messenger.ro) V02.get(i18)).d()) {
                                        roVar3 = (org.telegram.messenger.ro) V02.get(i18);
                                        break;
                                    }
                                }
                                roVar3 = null;
                            }
                            boolean z17 = (roVar3 == null && cxVar.getMessagesController().x0(roVar3)) ? z11 : false;
                            boolean z18 = false;
                            for (i10 = 0; i10 < arrayList.size(); i10++) {
                                if (((TLRPC.Dialog) arrayList.get(i10)).unread_mark || ((TLRPC.Dialog) arrayList.get(i10)).unread_count > 0) {
                                    z18 = z11;
                                }
                            }
                            org.telegram.ui.cx cxVar3 = cxVar;
                            y60 I = y60.I(cxVar3, nzVar);
                            kv kvVar = new kv(2, (byte) 0);
                            Paint paint = new Paint(z11 ? 1 : 0);
                            kvVar.c = paint;
                            kvVar.b = new RectF();
                            paint.setColor(twVar.b.getThemedColor(org.telegram.ui.ActionBar.n6.G8));
                            I.X(kvVar);
                            I.l(R.drawable.tabs_reorder, org.telegram.messenger.gd.M0(2131750694, null), new org.telegram.ui.bh(twVar, 25), cxVar3.getMessagesController().V0().size() <= 1);
                            if (z10) {
                                str = null;
                                i11 = 2131750770;
                            } else {
                                i11 = 2131750769;
                                str = null;
                            }
                            I.c(R.drawable.msg_edit, org.telegram.messenger.gd.M0(i11, str), new org.telegram.ui.sw(twVar, z10, roVar), false);
                            boolean z19 = roVar == null && !arrayList.isEmpty();
                            int i19 = !z12 ? R.drawable.msg_mute : R.drawable.msg_unmute;
                            if (z12) {
                                str2 = null;
                                i12 = 2131750684;
                            } else {
                                i12 = 2131750726;
                                str2 = null;
                            }
                            boolean z20 = z10;
                            I.l(i19, org.telegram.messenger.gd.M0(i12, str2), new di.p6(twVar, arrayList, z12, 27), z19);
                            I.l(R.drawable.msg_markread, org.telegram.messenger.gd.M0(2131748490, null), new org.telegram.ui.vs(8, twVar, arrayList), z18);
                            I.l(!z17 ? R.drawable.msg_discussion : R.drawable.msg_markunread, org.telegram.messenger.gd.M0(!z17 ? 2131750690 : 2131750686, null), new org.telegram.ui.sw(twVar, roVar3, z17), roVar3 == null);
                            I.l(R.drawable.msg_share, org.telegram.ui.kz.E0((roVar2 == null && roVar2.e()) ? -1 : 0, org.telegram.messenger.gd.M0(2131748733, null), true), new org.telegram.ui.up(twVar, zArr, roVar2, 3), z13);
                            I.m(R.drawable.msg_delete, new org.telegram.ui.vs(9, twVar, roVar), org.telegram.messenger.gd.M0(2131750776, null), !z20, true);
                            I.s = 96;
                            I.i = 3;
                            I.b0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                            I.a0();
                            cxVar3.M0 = I;
                            pzVar.G.d1(true);
                            return true;
                        }
                    }
                    roVar = null;
                    boolean z152 = true;
                    if (roVar != null) {
                    }
                    boolean[] zArr2 = {true};
                    org.telegram.messenger.mp messagesController2 = cxVar2.getMessagesController();
                    arrayList = new ArrayList(!z10 ? messagesController2.Y0(cxVar2.Y2) : messagesController2.y);
                    if (roVar == null) {
                    }
                    if (z10) {
                    }
                    if (roVar3 == null) {
                    }
                    boolean z182 = false;
                    while (i10 < arrayList.size()) {
                    }
                    org.telegram.ui.cx cxVar32 = cxVar;
                    y60 I2 = y60.I(cxVar32, nzVar);
                    kv kvVar2 = new kv(2, (byte) 0);
                    Paint paint2 = new Paint(z11 ? 1 : 0);
                    kvVar2.c = paint2;
                    kvVar2.b = new RectF();
                    paint2.setColor(twVar.b.getThemedColor(org.telegram.ui.ActionBar.n6.G8));
                    I2.X(kvVar2);
                    I2.l(R.drawable.tabs_reorder, org.telegram.messenger.gd.M0(2131750694, null), new org.telegram.ui.bh(twVar, 25), cxVar32.getMessagesController().V0().size() <= 1);
                    if (z10) {
                    }
                    I2.c(R.drawable.msg_edit, org.telegram.messenger.gd.M0(i11, str), new org.telegram.ui.sw(twVar, z10, roVar), false);
                    if (roVar == null) {
                    }
                    if (!z12) {
                    }
                    if (z12) {
                    }
                    boolean z202 = z10;
                    I2.l(i19, org.telegram.messenger.gd.M0(i12, str2), new di.p6(twVar, arrayList, z12, 27), z19);
                    I2.l(R.drawable.msg_markread, org.telegram.messenger.gd.M0(2131748490, null), new org.telegram.ui.vs(8, twVar, arrayList), z182);
                    if (roVar3 == null) {
                    }
                    I2.l(!z17 ? R.drawable.msg_discussion : R.drawable.msg_markunread, org.telegram.messenger.gd.M0(!z17 ? 2131750690 : 2131750686, null), new org.telegram.ui.sw(twVar, roVar3, z17), roVar3 == null);
                    I2.l(R.drawable.msg_share, org.telegram.ui.kz.E0((roVar2 == null && roVar2.e()) ? -1 : 0, org.telegram.messenger.gd.M0(2131748733, null), true), new org.telegram.ui.up(twVar, zArr2, roVar2, 3), z13);
                    I2.m(R.drawable.msg_delete, new org.telegram.ui.vs(9, twVar, roVar), org.telegram.messenger.gd.M0(2131750776, null), !z202, true);
                    I2.s = 96;
                    I2.i = 3;
                    I2.b0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                    I2.a0();
                    cxVar32.M0 = I2;
                    pzVar.G.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        pz pzVar = this.a;
        lz lzVar = pzVar.K;
        if (((org.telegram.ui.tw) lzVar).b.l2) {
            return;
        }
        nz nzVar = (nz) view;
        if (!pzVar.n) {
            if (i7 != pzVar.L || lzVar == null) {
                pzVar.g(nzVar.b, i7);
                return;
            } else {
                ((org.telegram.ui.tw) lzVar).b.R4(true, false);
                return;
            }
        }
        if (i7 != 0) {
            int L = org.telegram.messenger.g0.L(6.0f);
            RectF rectF = nzVar.f;
            float f12 = L;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.tw twVar = (org.telegram.ui.tw) pzVar.K;
            twVar.d((org.telegram.messenger.ro) twVar.b.getMessagesController().V0().get(nzVar.b.a));
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
    }
}
