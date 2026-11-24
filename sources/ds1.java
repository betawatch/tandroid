// default package

import android.text.Editable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ds1 implements v02 {
    public final /* synthetic */ mu1 a;

    public ds1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x31 x31Var;
        HashMap<Object, Object> hashMap;
        boolean z5;
        int i4;
        int i5;
        ArrayList arrayList;
        boolean z6;
        HashMap<Object, Object> hashMap2;
        boolean z7;
        String str;
        TLRPC.Message message;
        mu1 mu1Var = this.a;
        if (mu1Var.getParentActivity() == null || (x31Var = mu1Var.Y1) == null) {
            return;
        }
        boolean z8 = x31Var.A1;
        k27 k27Var = x31Var.E3;
        mu1Var.H5 = k27Var;
        if (k27Var != null && (message = k27Var.k) != null) {
            message.invert_media = z3;
        }
        if (i != 8 && i != 7 && (i != 4 || x31Var.d2.getSelectedPhotos().isEmpty())) {
            x31 x31Var2 = mu1Var.Y1;
            if (x31Var2 != null) {
                x31Var2.J(i);
            }
            mu1Var.Ga(i);
            return;
        }
        x31 x31Var3 = mu1Var.Y1;
        if (x31Var3 != null && i != 8) {
            x31Var3.a(true);
        }
        HashMap<Object, Object> selectedPhotos = mu1Var.Y1.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = mu1Var.Y1.d2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            hashMap = selectedPhotos;
        } else {
            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i6 = 0;
            while (i6 < ceil) {
                int i7 = i6 * 10;
                int min = Math.min(10, selectedPhotos.size() - i7);
                ArrayList arrayList2 = new ArrayList();
                int i8 = 0;
                while (i8 < min) {
                    int i9 = i7 + i8;
                    if (i9 >= selectedPhotosOrder.size()) {
                        hashMap2 = selectedPhotos;
                        z7 = z8;
                    } else {
                        jm6 jm6Var = (jm6) selectedPhotos.get(selectedPhotosOrder.get(i9));
                        y3a y3aVar = new y3a();
                        y3aVar.b = jm6Var.h;
                        boolean d = jm6Var.d();
                        y3aVar.p = d;
                        boolean z9 = jm6Var.b;
                        if (z8 && d) {
                            y3aVar.p = false;
                            z9 = false;
                        }
                        if (z9 || (str = jm6Var.h) == null) {
                            String str2 = jm6Var.I;
                            if (str2 != null) {
                                y3aVar.c = str2;
                            }
                        } else {
                            y3aVar.c = str;
                            if (!z8 && jm6Var.c()) {
                                y3aVar.y = jm6Var.clone();
                            }
                        }
                        y3aVar.e = jm6Var.c;
                        y3aVar.f = jm6Var.g;
                        y3aVar.g = jm6Var.e;
                        y3aVar.o = z9;
                        y3aVar.q = jm6Var.j();
                        hashMap2 = selectedPhotos;
                        z7 = z8;
                        y3aVar.z = jm6Var.m;
                        y3aVar.A = jm6Var.P;
                        CharSequence charSequence = jm6Var.a;
                        y3aVar.d = charSequence != null ? charSequence.toString() : null;
                        y3aVar.i = jm6Var.n;
                        y3aVar.j = jm6Var.r;
                        y3aVar.h = jm6Var.x;
                        y3aVar.k = jm6Var.s;
                        y3aVar.r = jm6Var.L;
                        y3aVar.t = z3a.h(jm6Var.a);
                        y3aVar.u = jm6Var.M;
                        y3aVar.w = jm6Var.N;
                        y3aVar.x = !z7 && jm6Var.c();
                        arrayList2.add(y3aVar);
                        jm6Var.e();
                    }
                    i8++;
                    z8 = z7;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z10 = z8;
                if (i6 == 0) {
                    mu1Var.w6(((y3a) arrayList2.get(0)).d, ((y3a) arrayList2.get(0)).i);
                    z5 = ((y3a) arrayList2.get(0)).t;
                } else {
                    z5 = false;
                }
                k27 k27Var2 = mu1Var.H5;
                if (k27Var2 == null || !k27Var2.o5()) {
                    i4 = ceil;
                    i5 = i6;
                    z3a.W(mu1Var.getAccountInstance(), arrayList2, mu1Var.l6, mu1Var.F5, mu1Var.m4, null, mu1Var.D5, i == 4 || z4, z, mu1Var.H5, null, z2, i2, i3, z5, null, mu1Var.O6(), j, z3, j2, mu1Var.a7(), mu1Var.y5, null, false);
                } else {
                    u47 u47Var = mu1Var.y5;
                    if (u47Var == null) {
                        u47Var = u47.b(mu1Var.H5.k.suggested_post);
                    }
                    u47 u47Var2 = u47Var;
                    j5 accountInstance = mu1Var.getAccountInstance();
                    int i10 = ceil;
                    long j3 = mu1Var.l6;
                    k27 k27Var3 = mu1Var.H5;
                    int i11 = i6;
                    k27 k27Var4 = mu1Var.m4;
                    bu1 bu1Var = mu1Var.D5;
                    if (i == 4 || z4) {
                        arrayList = arrayList2;
                        z6 = true;
                    } else {
                        arrayList = arrayList2;
                        z6 = false;
                    }
                    i5 = i11;
                    i4 = i10;
                    z3a.W(accountInstance, arrayList, j3, k27Var3, k27Var4, null, bu1Var, z6, z, null, null, z2, i2, i3, z5, null, mu1Var.O6(), j, z3, j2, mu1Var.a7(), u47Var2, null, false);
                }
                i6 = i5 + 1;
                ceil = i4;
                z8 = z10;
                selectedPhotos = hashMap3;
            }
            hashMap = selectedPhotos;
            mu1Var.y4();
            mu1Var.a0.setFieldText("");
        }
        if (i2 != 0) {
            if (mu1Var.h4 == -1) {
                mu1Var.h4 = 0;
            }
            mu1Var.h4 += hashMap.size();
            mu1Var.Yc(true);
        }
    }

    @Override // v02
    public final void I0() {
        this.a.a0.S();
    }

    @Override // v02
    public final boolean V1() {
        return false;
    }

    @Override // v02
    public final boolean f0() {
        return this.a.S9();
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
        String o = l7c.o(user);
        mu1 mu1Var = this.a;
        if (mu1Var.a0 == null || user == null || TextUtils.isEmpty(o)) {
            return;
        }
        mu1Var.a0.setFieldText("@" + o + " ");
        mu1Var.a0.h1();
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        this.a.q6(vq0Var);
    }

    @Override // v02
    public final void y0() {
    }

    @Override // v02
    public final void P0(Object obj) {
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
