package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pl implements org.telegram.ui.Components.ai {
    public final /* synthetic */ un a;

    public pl(un unVar) {
        this.a = unVar;
    }

    @Override // org.telegram.ui.Components.ai
    public final void C(org.telegram.ui.Components.mg mgVar) {
        this.a.p8(mgVar);
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean D() {
        return this.a.fa();
    }

    @Override // org.telegram.ui.Components.ai
    public final void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
        ag.v vVar;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i13;
        int i14;
        char c10;
        char c11;
        ArrayList arrayList;
        boolean z15;
        HashMap<Object, Object> hashMap2;
        boolean z16;
        String str;
        TLRPC.Message message;
        un unVar = this.a;
        if (unVar.getParentActivity() == null || (vVar = unVar.X1) == null) {
            return;
        }
        boolean z17 = vVar.x1;
        org.telegram.messenger.jj jjVar = vVar.B3;
        unVar.F5 = jjVar;
        if (jjVar != null && (message = jjVar.k) != null) {
            message.invert_media = z12;
        }
        if (i10 != 8 && i10 != 7 && (i10 != 4 || vVar.a2.getSelectedPhotos().isEmpty())) {
            ag.v vVar2 = unVar.X1;
            if (vVar2 != null) {
                vVar2.N(i10);
            }
            unVar.Pa(i10);
            return;
        }
        ag.v vVar3 = unVar.X1;
        if (vVar3 != null && i10 != 8) {
            vVar3.a(true);
        }
        HashMap<Object, Object> selectedPhotos = unVar.X1.a2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = unVar.X1.a2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            hashMap = selectedPhotos;
        } else {
            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i15 = 0;
            while (i15 < ceil) {
                int i16 = i15 * 10;
                int min = Math.min(10, selectedPhotos.size() - i16);
                ArrayList arrayList2 = new ArrayList();
                int i17 = 0;
                while (i17 < min) {
                    int i18 = i16 + i17;
                    if (i18 >= selectedPhotosOrder.size()) {
                        hashMap2 = selectedPhotos;
                        z16 = z17;
                    } else {
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i18));
                        org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
                        pzVar.b = efVar.h;
                        boolean d = efVar.d();
                        pzVar.p = d;
                        boolean z18 = efVar.b;
                        if (z17 && d) {
                            pzVar.p = false;
                            z18 = false;
                        }
                        if (z18 || (str = efVar.h) == null) {
                            String str2 = efVar.I;
                            if (str2 != null) {
                                pzVar.c = str2;
                            }
                        } else {
                            pzVar.c = str;
                            if (!z17 && efVar.c()) {
                                pzVar.y = efVar.clone();
                            }
                        }
                        pzVar.e = efVar.c;
                        pzVar.f = efVar.g;
                        pzVar.g = efVar.e;
                        pzVar.o = z18;
                        pzVar.q = efVar.i();
                        hashMap2 = selectedPhotos;
                        z16 = z17;
                        pzVar.z = efVar.m;
                        pzVar.A = efVar.P;
                        CharSequence charSequence = efVar.a;
                        pzVar.d = charSequence != null ? charSequence.toString() : null;
                        pzVar.i = efVar.n;
                        pzVar.j = efVar.r;
                        pzVar.h = efVar.x;
                        pzVar.k = efVar.s;
                        pzVar.r = efVar.L;
                        pzVar.t = org.telegram.messenger.qz.h(efVar.a);
                        pzVar.u = efVar.M;
                        pzVar.w = efVar.N;
                        pzVar.x = !z16 && efVar.c();
                        arrayList2.add(pzVar);
                        efVar.e();
                    }
                    i17++;
                    z17 = z16;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z19 = z17;
                if (i15 == 0) {
                    unVar.u8(((org.telegram.messenger.pz) arrayList2.get(0)).d, ((org.telegram.messenger.pz) arrayList2.get(0)).i);
                    z14 = ((org.telegram.messenger.pz) arrayList2.get(0)).t;
                } else {
                    z14 = false;
                }
                org.telegram.messenger.jj jjVar2 = unVar.F5;
                if (jjVar2 == null || !jjVar2.p5()) {
                    i13 = ceil;
                    i14 = i15;
                    c10 = 4;
                    org.telegram.messenger.qz.X(unVar.getAccountInstance(), arrayList2, unVar.j6, unVar.D5, unVar.l4, null, unVar.B5, i10 == 4 || z13, z10, unVar.F5, null, z11, i11, i12, z14, null, unVar.P8(), j10, z12, j11, unVar.a9(), unVar.w5, null, false);
                } else {
                    org.telegram.messenger.oj ojVar = unVar.w5;
                    if (ojVar == null) {
                        ojVar = org.telegram.messenger.oj.b(unVar.F5.k.suggested_post);
                    }
                    org.telegram.messenger.oj ojVar2 = ojVar;
                    org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
                    int i19 = ceil;
                    long j12 = unVar.j6;
                    org.telegram.messenger.jj jjVar3 = unVar.F5;
                    int i20 = i15;
                    org.telegram.messenger.jj jjVar4 = unVar.l4;
                    kn knVar = unVar.B5;
                    if (i10 == 4 || z13) {
                        c11 = 4;
                        arrayList = arrayList2;
                        z15 = true;
                    } else {
                        c11 = 4;
                        arrayList = arrayList2;
                        z15 = false;
                    }
                    i14 = i20;
                    i13 = i19;
                    c10 = c11;
                    org.telegram.messenger.qz.X(accountInstance, arrayList, j12, jjVar3, jjVar4, null, knVar, z15, z10, null, null, z11, i11, i12, z14, null, unVar.P8(), j10, z12, j11, unVar.a9(), ojVar2, null, false);
                }
                i15 = i14 + 1;
                ceil = i13;
                selectedPhotos = hashMap3;
                z17 = z19;
            }
            hashMap = selectedPhotos;
            unVar.F6();
            unVar.Z.setFieldText("");
        }
        if (i11 != 0) {
            if (unVar.g4 == -1) {
                unVar.g4 = 0;
            }
            unVar.g4 += hashMap.size();
            unVar.Yc(true);
        }
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ boolean a1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void j0() {
        this.a.Z.L();
    }

    @Override // org.telegram.ui.Components.ai
    public final void v0(TLRPC.User user) {
        String n10 = org.telegram.messenger.h20.n(user);
        un unVar = this.a;
        if (unVar.Z == null || user == null || TextUtils.isEmpty(n10)) {
            return;
        }
        unVar.Z.setFieldText("@" + n10 + " ");
        unVar.Z.F0();
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void n0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void N() {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }
}
