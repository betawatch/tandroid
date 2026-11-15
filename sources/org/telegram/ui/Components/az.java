package org.telegram.ui.Components;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class az implements hj0, ij0 {
    public final /* synthetic */ iz a;

    public /* synthetic */ az(iz izVar) {
        this.a = izVar;
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
    @Override // org.telegram.ui.Components.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(int i7, View view) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.messenger.so soVar;
        boolean z10;
        ArrayList arrayList;
        org.telegram.ui.yw ywVar;
        boolean z11;
        boolean z12;
        boolean z13;
        org.telegram.messenger.so soVar2;
        int i10;
        String str;
        int i11;
        String str2;
        int i12;
        boolean z14;
        TLRPC.Chat M0;
        iz izVar = this.a;
        ez ezVar = izVar.K;
        if (!((org.telegram.ui.pw) ezVar).b.l2 && !izVar.n) {
            gz gzVar = (gz) view;
            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) ezVar;
            org.telegram.ui.yw ywVar2 = pwVar.b;
            if (ywVar2.T0 == 0) {
                kVar = ((org.telegram.ui.ActionBar.e2) ywVar2).actionBar;
                if (!kVar.x() && ywVar2.U == 0.0f) {
                    m60 m60Var = ywVar2.M0;
                    if (m60Var != null && m60Var.D()) {
                        ywVar2.M0.u();
                        ywVar2.M0 = null;
                        return false;
                    }
                    if (gzVar.getId() != ywVar2.A0.getDefaultTabId()) {
                        ArrayList T0 = ywVar2.getMessagesController().T0();
                        int id2 = gzVar.getId();
                        if (T0 != null && id2 >= 0 && id2 < T0.size()) {
                            soVar = (org.telegram.messenger.so) T0.get(gzVar.getId());
                            boolean z15 = true;
                            z10 = soVar != null;
                            boolean[] zArr = {true};
                            org.telegram.messenger.np messagesController = ywVar2.getMessagesController();
                            arrayList = new ArrayList(!z10 ? messagesController.W0(ywVar2.Y2) : messagesController.y);
                            if (soVar == null) {
                                soVar2 = (org.telegram.messenger.so) ywVar2.getMessagesController().T0().get(gzVar.getId());
                                if (soVar2 != null) {
                                    int i13 = 0;
                                    while (i13 < arrayList.size()) {
                                        boolean z16 = z15;
                                        if (!soVar2.b(ywVar2.getAccountInstance(), ((TLRPC.Dialog) arrayList.get(i13)).id)) {
                                            arrayList.remove(i13);
                                            i13--;
                                        }
                                        i13++;
                                        z15 = z16;
                                    }
                                    z11 = z15;
                                    if (!soVar2.d()) {
                                        if (soVar2.i.isEmpty()) {
                                            int i14 = soVar2.g;
                                            int i15 = org.telegram.messenger.np.D8;
                                        }
                                        z13 = false;
                                        if (z13) {
                                            int i16 = 0;
                                            while (true) {
                                                if (i16 >= soVar2.h.size()) {
                                                    break;
                                                }
                                                long longValue = ((Long) soVar2.h.get(i16)).longValue();
                                                if (longValue < 0 && (M0 = ywVar2.getMessagesController().M0(Long.valueOf(-longValue))) != null && org.telegram.ui.hz.m0(M0)) {
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
                                    ywVar = ywVar2;
                                    z12 = false;
                                } else {
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 >= arrayList.size()) {
                                            ywVar = ywVar2;
                                            z14 = z11;
                                            break;
                                        }
                                        ywVar = ywVar2;
                                        if (!ywVar2.getMessagesController().r2(((TLRPC.Dialog) arrayList.get(i17)).id, 0L, null)) {
                                            z14 = false;
                                            break;
                                        }
                                        i17++;
                                        ywVar2 = ywVar;
                                    }
                                    z12 = !z14;
                                }
                            } else {
                                ywVar = ywVar2;
                                z11 = true;
                                z12 = false;
                                z13 = false;
                                soVar2 = null;
                            }
                            boolean z17 = false;
                            for (i10 = 0; i10 < arrayList.size(); i10++) {
                                if (((TLRPC.Dialog) arrayList.get(i10)).unread_mark || ((TLRPC.Dialog) arrayList.get(i10)).unread_count > 0) {
                                    z17 = z11;
                                }
                            }
                            org.telegram.ui.yw ywVar3 = ywVar;
                            m60 H = m60.H(ywVar3, gzVar);
                            fv fvVar = new fv(2, (byte) 0);
                            Paint paint = new Paint(z11 ? 1 : 0);
                            fvVar.c = paint;
                            fvVar.b = new RectF();
                            paint.setColor(pwVar.b.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                            H.W(fvVar);
                            H.l(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131750707, null), new org.telegram.ui.bh(pwVar, 25), ywVar3.getMessagesController().T0().size() <= 1);
                            if (z10) {
                                str = null;
                                i11 = 2131750781;
                            } else {
                                i11 = 2131750780;
                                str = null;
                            }
                            H.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(i11, str), new di.m6(pwVar, z10, soVar, 27), false);
                            boolean z18 = soVar == null && !arrayList.isEmpty();
                            int i18 = !z12 ? R.drawable.msg_mute : R.drawable.msg_unmute;
                            if (z12) {
                                str2 = null;
                                i12 = 2131750699;
                            } else {
                                i12 = 2131750737;
                                str2 = null;
                            }
                            boolean z19 = z10;
                            H.l(i18, org.telegram.messenger.hd.M0(i12, str2), new di.m6(pwVar, arrayList, z12, 28), z18);
                            H.l(R.drawable.msg_markread, org.telegram.messenger.hd.M0(2131748682, null), new org.telegram.ui.Components.voip.u(13, pwVar, arrayList), z17);
                            H.l(R.drawable.msg_share, org.telegram.ui.hz.E0((soVar2 == null && soVar2.f()) ? -1 : 0, org.telegram.messenger.hd.M0(2131748925, null), true), new org.telegram.ui.tp(pwVar, zArr, soVar2, 3), z13);
                            H.m(R.drawable.msg_delete, new org.telegram.ui.Components.voip.u(14, pwVar, soVar), org.telegram.messenger.hd.M0(2131750787, null), !z19, true);
                            H.s = 96;
                            H.i = 3;
                            H.a0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                            H.Z();
                            ywVar3.M0 = H;
                            izVar.G.d1(true);
                            return true;
                        }
                    }
                    soVar = null;
                    boolean z152 = true;
                    if (soVar != null) {
                    }
                    boolean[] zArr2 = {true};
                    org.telegram.messenger.np messagesController2 = ywVar2.getMessagesController();
                    arrayList = new ArrayList(!z10 ? messagesController2.W0(ywVar2.Y2) : messagesController2.y);
                    if (soVar == null) {
                    }
                    boolean z172 = false;
                    while (i10 < arrayList.size()) {
                    }
                    org.telegram.ui.yw ywVar32 = ywVar;
                    m60 H2 = m60.H(ywVar32, gzVar);
                    fv fvVar2 = new fv(2, (byte) 0);
                    Paint paint2 = new Paint(z11 ? 1 : 0);
                    fvVar2.c = paint2;
                    fvVar2.b = new RectF();
                    paint2.setColor(pwVar.b.getThemedColor(org.telegram.ui.ActionBar.j6.G8));
                    H2.W(fvVar2);
                    H2.l(R.drawable.tabs_reorder, org.telegram.messenger.hd.M0(2131750707, null), new org.telegram.ui.bh(pwVar, 25), ywVar32.getMessagesController().T0().size() <= 1);
                    if (z10) {
                    }
                    H2.c(R.drawable.msg_edit, org.telegram.messenger.hd.M0(i11, str), new di.m6(pwVar, z10, soVar, 27), false);
                    if (soVar == null) {
                    }
                    if (!z12) {
                    }
                    if (z12) {
                    }
                    boolean z192 = z10;
                    H2.l(i18, org.telegram.messenger.hd.M0(i12, str2), new di.m6(pwVar, arrayList, z12, 28), z18);
                    H2.l(R.drawable.msg_markread, org.telegram.messenger.hd.M0(2131748682, null), new org.telegram.ui.Components.voip.u(13, pwVar, arrayList), z172);
                    H2.l(R.drawable.msg_share, org.telegram.ui.hz.E0((soVar2 == null && soVar2.f()) ? -1 : 0, org.telegram.messenger.hd.M0(2131748925, null), true), new org.telegram.ui.tp(pwVar, zArr2, soVar2, 3), z13);
                    H2.m(R.drawable.msg_delete, new org.telegram.ui.Components.voip.u(14, pwVar, soVar), org.telegram.messenger.hd.M0(2131750787, null), !z192, true);
                    H2.s = 96;
                    H2.i = 3;
                    H2.a0(org.telegram.messenger.g0.L(-12.0f), org.telegram.messenger.g0.L(-4.0f));
                    H2.Z();
                    ywVar32.M0 = H2;
                    izVar.G.d1(true);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        iz izVar = this.a;
        ez ezVar = izVar.K;
        if (((org.telegram.ui.pw) ezVar).b.l2) {
            return;
        }
        gz gzVar = (gz) view;
        if (!izVar.n) {
            if (i7 != izVar.L || ezVar == null) {
                izVar.f(gzVar.b, i7);
                return;
            } else {
                ((org.telegram.ui.pw) ezVar).b.J4(true, false);
                return;
            }
        }
        if (i7 != 0) {
            int L = org.telegram.messenger.g0.L(6.0f);
            RectF rectF = gzVar.f;
            float f12 = L;
            if (rectF.left - f12 >= f10 || rectF.right + f12 <= f10) {
                return;
            }
            org.telegram.ui.pw pwVar = (org.telegram.ui.pw) izVar.K;
            pwVar.d((org.telegram.messenger.so) pwVar.b.getMessagesController().T0().get(gzVar.b.a));
        }
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
