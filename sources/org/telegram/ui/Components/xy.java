package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xy implements cj0, dj0 {
    public final /* synthetic */ fz a;

    public /* synthetic */ xy(fz fzVar) {
        this.a = fzVar;
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.vo voVar;
        boolean z9;
        ArrayList arrayList;
        org.telegram.ui.ww wwVar;
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
        fz fzVar = this.a;
        bz bzVar = fzVar.J;
        if (!((org.telegram.ui.nw) bzVar).b.j2 && !fzVar.n) {
            dz dzVar = (dz) view;
            org.telegram.ui.nw nwVar = (org.telegram.ui.nw) bzVar;
            org.telegram.ui.ww wwVar2 = nwVar.b;
            if (wwVar2.R0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.f2) wwVar2).actionBar;
                if (!kVar.v() && wwVar2.T == 0.0f) {
                    k60 k60Var = wwVar2.L0;
                    if (k60Var != null && k60Var.D()) {
                        wwVar2.L0.u();
                        wwVar2.L0 = null;
                        return false;
                    }
                    if (dzVar.getId() != wwVar2.z0.getDefaultTabId()) {
                        ArrayList T0 = wwVar2.getMessagesController().T0();
                        int id2 = dzVar.getId();
                        if (T0 != null && id2 >= 0 && id2 < T0.size()) {
                            voVar = (org.telegram.messenger.vo) T0.get(dzVar.getId());
                            boolean z14 = true;
                            z9 = voVar != null;
                            boolean[] zArr = {true};
                            org.telegram.messenger.qp messagesController = wwVar2.getMessagesController();
                            arrayList = new ArrayList(!z9 ? messagesController.W0(wwVar2.W2) : messagesController.y);
                            if (voVar == null) {
                                voVar2 = (org.telegram.messenger.vo) wwVar2.getMessagesController().T0().get(dzVar.getId());
                                if (voVar2 != null) {
                                    int i13 = 0;
                                    while (i13 < arrayList.size()) {
                                        boolean z15 = z14;
                                        if (!voVar2.b(wwVar2.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i13)).id)) {
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
                                                if (longValue < 0 && (M0 = wwVar2.getMessagesController().M0(Long.valueOf(-longValue))) != null && org.telegram.ui.gz.m0(M0)) {
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
                                    wwVar = wwVar2;
                                    z11 = false;
                                } else {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= arrayList.size()) {
                                            wwVar = wwVar2;
                                            z13 = z10;
                                            break;
                                        }
                                        wwVar = wwVar2;
                                        if (!wwVar2.getMessagesController().r2(((TLRPC.Dialog) arrayList.get(i17)).id, 0L, null)) {
                                            z13 = false;
                                            break;
                                        }
                                        i17++;
                                        wwVar2 = wwVar;
                                    }
                                    z11 = !z13;
                                }
                            } else {
                                wwVar = wwVar2;
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
                            org.telegram.ui.ww wwVar3 = wwVar;
                            k60 H = k60.H(wwVar3, dzVar);
                            av avVar = new av(2, (byte) 0);
                            Paint paint = new Paint(z10 ? 1 : 0);
                            avVar.c = paint;
                            avVar.b = new RectF();
                            paint.setColor(nwVar.b.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                            H.W(avVar);
                            H.l(R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131750708, null), new org.telegram.ui.bh(nwVar, 25), wwVar3.getMessagesController().T0().size() <= 1);
                            if (z9) {
                                str = null;
                                i11 = 2131750782;
                            } else {
                                i11 = 2131750781;
                                str = null;
                            }
                            H.c(R.drawable.msg_edit, org.telegram.messenger.id.M0(i11, str), new bi.u7(nwVar, z9, voVar, 27), false);
                            boolean z17 = voVar == null && !arrayList.isEmpty();
                            int i18 = !z11 ? R.drawable.msg_mute : R.drawable.msg_unmute;
                            if (z11) {
                                str2 = null;
                                i12 = 2131750700;
                            } else {
                                i12 = 2131750738;
                                str2 = null;
                            }
                            boolean z18 = z9;
                            H.l(i18, org.telegram.messenger.id.M0(i12, str2), new bi.u7(nwVar, arrayList, z11, 28), z17);
                            H.l(R.drawable.msg_markread, org.telegram.messenger.id.M0(2131748683, null), new l51(17, nwVar, arrayList), z16);
                            H.l(R.drawable.msg_share, org.telegram.ui.gz.E0((voVar2 == null && voVar2.f()) ? -1 : 0, org.telegram.messenger.id.M0(2131748926, null), true), new org.telegram.ui.rp(nwVar, zArr, voVar2, 3), z12);
                            H.m(R.drawable.msg_delete, new l51(18, nwVar, voVar), org.telegram.messenger.id.M0(2131750788, null), !z18, true);
                            H.s = 96;
                            H.i = 3;
                            H.a0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                            H.Z();
                            wwVar3.L0 = H;
                            fzVar.F.d1(true);
                            return true;
                        }
                    }
                    voVar = null;
                    boolean z142 = true;
                    if (voVar != null) {
                    }
                    boolean[] zArr2 = {true};
                    org.telegram.messenger.qp messagesController2 = wwVar2.getMessagesController();
                    arrayList = new ArrayList(!z9 ? messagesController2.W0(wwVar2.W2) : messagesController2.y);
                    if (voVar == null) {
                    }
                    boolean z162 = false;
                    while (i10 < arrayList.size()) {
                    }
                    org.telegram.ui.ww wwVar32 = wwVar;
                    k60 H2 = k60.H(wwVar32, dzVar);
                    av avVar2 = new av(2, (byte) 0);
                    Paint paint2 = new Paint(z10 ? 1 : 0);
                    avVar2.c = paint2;
                    avVar2.b = new RectF();
                    paint2.setColor(nwVar.b.getThemedColor(org.telegram.ui.ActionBar.k6.G8));
                    H2.W(avVar2);
                    H2.l(R.drawable.tabs_reorder, org.telegram.messenger.id.M0(2131750708, null), new org.telegram.ui.bh(nwVar, 25), wwVar32.getMessagesController().T0().size() <= 1);
                    if (z9) {
                    }
                    H2.c(R.drawable.msg_edit, org.telegram.messenger.id.M0(i11, str), new bi.u7(nwVar, z9, voVar, 27), false);
                    if (voVar == null) {
                    }
                    if (!z11) {
                    }
                    if (z11) {
                    }
                    boolean z182 = z9;
                    H2.l(i18, org.telegram.messenger.id.M0(i12, str2), new bi.u7(nwVar, arrayList, z11, 28), z17);
                    H2.l(R.drawable.msg_markread, org.telegram.messenger.id.M0(2131748683, null), new l51(17, nwVar, arrayList), z162);
                    H2.l(R.drawable.msg_share, org.telegram.ui.gz.E0((voVar2 == null && voVar2.f()) ? -1 : 0, org.telegram.messenger.id.M0(2131748926, null), true), new org.telegram.ui.rp(nwVar, zArr2, voVar2, 3), z12);
                    H2.m(R.drawable.msg_delete, new l51(18, nwVar, voVar), org.telegram.messenger.id.M0(2131750788, null), !z182, true);
                    H2.s = 96;
                    H2.i = 3;
                    H2.a0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                    H2.Z();
                    wwVar32.L0 = H2;
                    fzVar.F.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        fz fzVar = this.a;
        bz bzVar = fzVar.J;
        if (((org.telegram.ui.nw) bzVar).b.j2) {
            return;
        }
        dz dzVar = (dz) view;
        if (!fzVar.n) {
            if (i7 != fzVar.K || bzVar == null) {
                fzVar.f(dzVar.b, i7);
                return;
            } else {
                ((org.telegram.ui.nw) bzVar).b.J4(true, false);
                return;
            }
        }
        if (i7 != 0) {
            int L = org.telegram.messenger.g0.L(6.0f);
            RectF rectF = dzVar.f;
            float f12 = L;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.nw nwVar = (org.telegram.ui.nw) fzVar.J;
            nwVar.d((org.telegram.messenger.vo) nwVar.b.getMessagesController().T0().get(dzVar.b.a));
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
