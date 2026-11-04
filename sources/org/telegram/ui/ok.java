package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ok implements org.telegram.ui.Components.zh {
    public final /* synthetic */ wm a;

    public ok(wm wmVar) {
        this.a = wmVar;
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ boolean L1() {
        return false;
    }

    @Override // org.telegram.ui.Components.zh
    public final void Y(org.telegram.ui.Components.ng ngVar) {
        this.a.w8(ngVar);
    }

    @Override // org.telegram.ui.Components.zh
    public final void a1(TLRPC.User user) {
        String n4 = org.telegram.messenger.l10.n(user);
        wm wmVar = this.a;
        if (wmVar.a0 == null || user == null || TextUtils.isEmpty(n4)) {
            return;
        }
        wmVar.a0.setFieldText("@" + n4 + " ");
        wmVar.a0.G0();
    }

    @Override // org.telegram.ui.Components.zh
    public final boolean g0() {
        return this.a.pa();
    }

    @Override // org.telegram.ui.Components.zh
    public final void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
        ei.x2 x2Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i12;
        int i13;
        char c2;
        char c10;
        ArrayList arrayList;
        boolean z15;
        HashMap<Object, Object> hashMap2;
        boolean z16;
        String str;
        TLRPC.Message message;
        wm wmVar = this.a;
        if (wmVar.getParentActivity() == null || (x2Var = wmVar.Y1) == null) {
            return;
        }
        boolean z17 = x2Var.y1;
        org.telegram.messenger.zi ziVar = x2Var.C3;
        wmVar.G5 = ziVar;
        if (ziVar != null && (message = ziVar.k) != null) {
            message.invert_media = z12;
        }
        if (i3 != 8 && i3 != 7 && (i3 != 4 || x2Var.b2.getSelectedPhotos().isEmpty())) {
            ei.x2 x2Var2 = wmVar.Y1;
            if (x2Var2 != null) {
                x2Var2.L(i3);
            }
            wmVar.Za(i3);
            return;
        }
        ei.x2 x2Var3 = wmVar.Y1;
        if (x2Var3 != null && i3 != 8) {
            x2Var3.a(true);
        }
        HashMap<Object, Object> selectedPhotos = wmVar.Y1.b2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = wmVar.Y1.b2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            hashMap = selectedPhotos;
        } else {
            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i14 = 0;
            while (i14 < ceil) {
                int i15 = i14 * 10;
                int min = Math.min(10, selectedPhotos.size() - i15);
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (i16 < min) {
                    int i17 = i15 + i16;
                    if (i17 >= selectedPhotosOrder.size()) {
                        hashMap2 = selectedPhotos;
                        z16 = z17;
                    } else {
                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) selectedPhotos.get(selectedPhotosOrder.get(i17));
                        org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
                        xyVar.b = yeVar.h;
                        boolean d = yeVar.d();
                        xyVar.p = d;
                        boolean z18 = yeVar.b;
                        if (z17 && d) {
                            xyVar.p = false;
                            z18 = false;
                        }
                        if (z18 || (str = yeVar.h) == null) {
                            String str2 = yeVar.I;
                            if (str2 != null) {
                                xyVar.c = str2;
                            }
                        } else {
                            xyVar.c = str;
                            if (!z17 && yeVar.c()) {
                                xyVar.y = yeVar.clone();
                            }
                        }
                        xyVar.e = yeVar.c;
                        xyVar.f = yeVar.g;
                        xyVar.g = yeVar.e;
                        xyVar.o = z18;
                        xyVar.q = yeVar.j();
                        hashMap2 = selectedPhotos;
                        z16 = z17;
                        xyVar.z = yeVar.m;
                        xyVar.A = yeVar.P;
                        CharSequence charSequence = yeVar.a;
                        xyVar.d = charSequence != null ? charSequence.toString() : null;
                        xyVar.i = yeVar.n;
                        xyVar.j = yeVar.r;
                        xyVar.h = yeVar.x;
                        xyVar.k = yeVar.s;
                        xyVar.r = yeVar.L;
                        xyVar.t = org.telegram.messenger.yy.h(yeVar.a);
                        xyVar.u = yeVar.M;
                        xyVar.w = yeVar.N;
                        xyVar.x = !z16 && yeVar.c();
                        arrayList2.add(xyVar);
                        yeVar.e();
                    }
                    i16++;
                    z17 = z16;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z19 = z17;
                if (i14 == 0) {
                    wmVar.B8(((org.telegram.messenger.xy) arrayList2.get(0)).d, ((org.telegram.messenger.xy) arrayList2.get(0)).i);
                    z14 = ((org.telegram.messenger.xy) arrayList2.get(0)).t;
                } else {
                    z14 = false;
                }
                org.telegram.messenger.zi ziVar2 = wmVar.G5;
                if (ziVar2 == null || !ziVar2.q5()) {
                    i12 = ceil;
                    i13 = i14;
                    c2 = 4;
                    org.telegram.messenger.yy.X(wmVar.getAccountInstance(), arrayList2, wmVar.k6, wmVar.E5, wmVar.m4, null, wmVar.C5, i3 == 4 || z13, z10, wmVar.G5, null, z11, i10, i11, z14, null, wmVar.W8(), j10, z12, j11, wmVar.h9(), wmVar.x5, null, false);
                } else {
                    org.telegram.messenger.ej ejVar = wmVar.x5;
                    if (ejVar == null) {
                        ejVar = org.telegram.messenger.ej.b(wmVar.G5.k.suggested_post);
                    }
                    org.telegram.messenger.ej ejVar2 = ejVar;
                    org.telegram.messenger.c accountInstance = wmVar.getAccountInstance();
                    int i18 = ceil;
                    long j12 = wmVar.k6;
                    org.telegram.messenger.zi ziVar3 = wmVar.G5;
                    int i19 = i14;
                    org.telegram.messenger.zi ziVar4 = wmVar.m4;
                    mm mmVar = wmVar.C5;
                    if (i3 == 4 || z13) {
                        c10 = 4;
                        arrayList = arrayList2;
                        z15 = true;
                    } else {
                        c10 = 4;
                        arrayList = arrayList2;
                        z15 = false;
                    }
                    i13 = i19;
                    i12 = i18;
                    c2 = c10;
                    org.telegram.messenger.yy.X(accountInstance, arrayList, j12, ziVar3, ziVar4, null, mmVar, z15, z10, null, null, z11, i10, i11, z14, null, wmVar.W8(), j10, z12, j11, wmVar.h9(), ejVar2, null, false);
                }
                i14 = i13 + 1;
                ceil = i12;
                selectedPhotos = hashMap3;
                z17 = z19;
            }
            hashMap = selectedPhotos;
            wmVar.K6();
            wmVar.a0.setFieldText("");
        }
        if (i10 != 0) {
            if (wmVar.h4 == -1) {
                wmVar.h4 = 0;
            }
            wmVar.h4 += hashMap.size();
            wmVar.id(true);
        }
    }

    @Override // org.telegram.ui.Components.zh
    public final void v0() {
        this.a.a0.L();
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void I0(Object obj) {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void r0() {
    }

    @Override // org.telegram.ui.Components.zh
    public final /* synthetic */ void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }
}
