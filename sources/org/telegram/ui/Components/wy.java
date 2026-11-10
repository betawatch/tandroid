package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wy implements cj0, dj0 {
    public final /* synthetic */ ez a;

    public /* synthetic */ wy(ez ezVar) {
        this.a = ezVar;
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
    @Override // org.telegram.ui.Components.dj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(int i7, View view) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.messenger.vo voVar;
        boolean z9;
        ArrayList arrayList;
        org.telegram.ui.zw zwVar;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.messenger.vo voVar2;
        int i10;
        String str;
        int i11;
        String str2;
        int i12;
        boolean z13;
        TLRPC.Chat M0;
        ez ezVar = this.a;
        az azVar = ezVar.J;
        if (!((org.telegram.ui.qw) azVar).b.k2 && !ezVar.n) {
            cz czVar = (cz) view;
            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) azVar;
            org.telegram.ui.zw zwVar2 = qwVar.b;
            if (zwVar2.S0 == 0) {
                lVar = ((org.telegram.ui.ActionBar.f2) zwVar2).actionBar;
                if (!lVar.x() && zwVar2.T == 0.0f) {
                    k60 k60Var = zwVar2.L0;
                    if (k60Var != null && k60Var.D()) {
                        zwVar2.L0.u();
                        zwVar2.L0 = null;
                        return false;
                    }
                    if (czVar.getId() != zwVar2.z0.getDefaultTabId()) {
                        ArrayList T0 = zwVar2.getMessagesController().T0();
                        int id2 = czVar.getId();
                        if (T0 != null && id2 >= 0 && id2 < T0.size()) {
                            voVar = (org.telegram.messenger.vo) T0.get(czVar.getId());
                            boolean z14 = true;
                            z9 = voVar != null;
                            boolean[] zArr = {true};
                            org.telegram.messenger.qp messagesController = zwVar2.getMessagesController();
                            arrayList = new ArrayList(!z9 ? messagesController.W0(zwVar2.X2) : messagesController.y);
                            if (voVar == null) {
                                voVar2 = (org.telegram.messenger.vo) zwVar2.getMessagesController().T0().get(czVar.getId());
                                if (voVar2 != null) {
                                    int i13 = 0;
                                    while (i13 < arrayList.size()) {
                                        boolean z15 = z14;
                                        if (!voVar2.b(zwVar2.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i13)).id)) {
                                            arrayList.remove(i13);
                                            i13--;
                                        }
                                        i13++;
                                        z14 = z15;
                                    }
                                    z10 = z14;
                                    if (!voVar2.d()) {
                                        if (voVar2.i.isEmpty()) {
                                            int i14 = voVar2.g;
                                            int i15 = org.telegram.messenger.qp.C8;
                                        }
                                        z12 = false;
                                        if (z12) {
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= voVar2.h.size()) {
                                                    break;
                                                }
                                                long longValue = ((Long) voVar2.h.get(i16)).longValue();
                                                if (longValue < 0 && (M0 = zwVar2.getMessagesController().M0(Long.valueOf(-longValue))) != null && org.telegram.ui.jz.m0(M0)) {
                                                    zArr[0] = false;
                                                    break;
                                                }
                                                i16++;
                                            }
                                        }
                                    }
                                    z12 = z10;
                                    if (z12) {
                                    }
                                } else {
                                    z10 = true;
                                    z12 = false;
                                }
                                if (arrayList.isEmpty()) {
                                    zwVar = zwVar2;
                                    z11 = false;
                                } else {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= arrayList.size()) {
                                            zwVar = zwVar2;
                                            z13 = z10;
                                            break;
                                        }
                                        zwVar = zwVar2;
                                        if (!zwVar2.getMessagesController().r2(((TLRPC.Dialog) arrayList.get(i17)).id, 0L, null)) {
                                            z13 = false;
                                            break;
                                        }
                                        i17++;
                                        zwVar2 = zwVar;
                                    }
                                    z11 = !z13;
                                }
                            } else {
                                zwVar = zwVar2;
                                z10 = true;
                                z11 = false;
                                z12 = false;
                                voVar2 = null;
                            }
                            boolean z16 = false;
                            for (i10 = 0; i10 < arrayList.size(); i10++) {
                                if (((TLRPC.Dialog) arrayList.get(i10)).unread_mark || ((TLRPC.Dialog) arrayList.get(i10)).unread_count > 0) {
                                    z16 = z10;
                                }
                            }
                            org.telegram.ui.zw zwVar3 = zwVar;
                            k60 H = k60.H(zwVar3, czVar);
                            zu zuVar = new zu(2, (byte) 0);
                            Paint paint = new Paint(z10 ? 1 : 0);
                            zuVar.c = paint;
                            zuVar.b = new RectF();
                            paint.setColor(qwVar.b.getThemedColor(org.telegram.ui.ActionBar.m6.G8));
                            H.W(zuVar);
                            H.l(R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131750707, null), new org.telegram.ui.dh(qwVar, 25), zwVar3.getMessagesController().T0().size() <= 1);
                            if (z9) {
                                str = null;
                                i11 = 2131750781;
                            } else {
                                i11 = 2131750780;
                                str = null;
                            }
                            H.c(R.drawable.msg_edit, org.telegram.messenger.id.M0(i11, str), new bi.u7(qwVar, z9, voVar, 27), false);
                            boolean z17 = voVar == null && !arrayList.isEmpty();
                            int i18 = !z11 ? R.drawable.msg_mute : R.drawable.msg_unmute;
                            if (z11) {
                                str2 = null;
                                i12 = 2131750699;
                            } else {
                                i12 = 2131750737;
                                str2 = null;
                            }
                            boolean z18 = z9;
                            H.l(i18, org.telegram.messenger.id.M0(i12, str2), new bi.u7(qwVar, arrayList, z11, 28), z17);
                            H.l(R.drawable.msg_markread, org.telegram.messenger.id.M0(2131748682, null), new h41(18, qwVar, arrayList), z16);
                            H.l(R.drawable.msg_share, org.telegram.ui.jz.E0((voVar2 == null && voVar2.f()) ? -1 : 0, org.telegram.messenger.id.M0(2131748925, null), true), new org.telegram.ui.tp(qwVar, zArr, voVar2, 3), z12);
                            H.m(R.drawable.msg_delete, new h41(19, qwVar, voVar), org.telegram.messenger.id.M0(2131750787, null), !z18, true);
                            H.s = 96;
                            H.i = 3;
                            H.a0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                            H.Z();
                            zwVar3.L0 = H;
                            ezVar.F.d1(true);
                            return true;
                        }
                    }
                    voVar = null;
                    boolean z142 = true;
                    if (voVar != null) {
                    }
                    boolean[] zArr2 = {true};
                    org.telegram.messenger.qp messagesController2 = zwVar2.getMessagesController();
                    arrayList = new ArrayList(!z9 ? messagesController2.W0(zwVar2.X2) : messagesController2.y);
                    if (voVar == null) {
                    }
                    boolean z162 = false;
                    while (i10 < arrayList.size()) {
                    }
                    org.telegram.ui.zw zwVar32 = zwVar;
                    k60 H2 = k60.H(zwVar32, czVar);
                    zu zuVar2 = new zu(2, (byte) 0);
                    Paint paint2 = new Paint(z10 ? 1 : 0);
                    zuVar2.c = paint2;
                    zuVar2.b = new RectF();
                    paint2.setColor(qwVar.b.getThemedColor(org.telegram.ui.ActionBar.m6.G8));
                    H2.W(zuVar2);
                    H2.l(R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131750707, null), new org.telegram.ui.dh(qwVar, 25), zwVar32.getMessagesController().T0().size() <= 1);
                    if (z9) {
                    }
                    H2.c(R.drawable.msg_edit, org.telegram.messenger.id.M0(i11, str), new bi.u7(qwVar, z9, voVar, 27), false);
                    if (voVar == null) {
                    }
                    if (!z11) {
                    }
                    if (z11) {
                    }
                    boolean z182 = z9;
                    H2.l(i18, org.telegram.messenger.id.M0(i12, str2), new bi.u7(qwVar, arrayList, z11, 28), z17);
                    H2.l(R.drawable.msg_markread, org.telegram.messenger.id.M0(2131748682, null), new h41(18, qwVar, arrayList), z162);
                    H2.l(R.drawable.msg_share, org.telegram.ui.jz.E0((voVar2 == null && voVar2.f()) ? -1 : 0, org.telegram.messenger.id.M0(2131748925, null), true), new org.telegram.ui.tp(qwVar, zArr2, voVar2, 3), z12);
                    H2.m(R.drawable.msg_delete, new h41(19, qwVar, voVar), org.telegram.messenger.id.M0(2131750787, null), !z182, true);
                    H2.s = 96;
                    H2.i = 3;
                    H2.a0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                    H2.Z();
                    zwVar32.L0 = H2;
                    ezVar.F.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        ez ezVar = this.a;
        az azVar = ezVar.J;
        if (((org.telegram.ui.qw) azVar).b.k2) {
            return;
        }
        cz czVar = (cz) view;
        if (!ezVar.n) {
            if (i7 != ezVar.K || azVar == null) {
                ezVar.f(czVar.b, i7);
                return;
            } else {
                ((org.telegram.ui.qw) azVar).b.J4(true, false);
                return;
            }
        }
        if (i7 != 0) {
            int L = org.telegram.messenger.g0.L(6.0f);
            RectF rectF = czVar.f;
            float f12 = L;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.qw qwVar = (org.telegram.ui.qw) ezVar.J;
            qwVar.d((org.telegram.messenger.vo) qwVar.b.getMessagesController().T0().get(czVar.b.a));
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
