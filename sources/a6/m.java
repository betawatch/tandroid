package a6;

import ah.g0;
import ah.j1;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import androidx.biometric.d0;
import androidx.biometric.f0;
import androidx.fragment.app.t;
import androidx.lifecycle.a0;
import b2.q0;
import bi.gb;
import bi.o5;
import c5.b0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.vision.e2;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.d7;
import di.m0;
import di.z6;
import fb.n;
import fi.y4;
import g6.q;
import g6.r;
import hg.a2;
import hg.k1;
import ig.t0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import ji.a3;
import ji.g1;
import ji.g2;
import ji.h1;
import ji.h5;
import ji.j0;
import ji.j5;
import ji.n2;
import ji.q3;
import ji.v3;
import ji.z0;
import m.i1;
import mg.p;
import n4.y;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.kv0;
import rg.d2;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m implements ek0, a0, kv0, androidx.activity.result.b, v0, OnSuccessListener, SuccessContinuation, p, d71, n, i1, s, a2, j0, g1, k2.n {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ m(int i10, boolean z10) {
        this.a = i10;
    }

    public static com.google.android.gms.common.api.internal.p U(Looper looper, Object obj, String str) {
        n6.l.i(obj, "Listener must not be null");
        n6.l.i(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.p(looper, obj, str);
    }

    @Override // ji.j0
    public void A(CharSequence charSequence) {
        q3 q3Var = ((z0) this.b).S;
        if (q3Var != null) {
            q3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            q3Var.a.s4(charSequence.toString());
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public void B(View view, j1 j1Var, boolean z10, boolean z11) {
        g0 g0Var = (g0) this.b;
        g0Var.a.ab(null, g0Var.e, g0Var.b, view, 0.0f, 0.0f, j1Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new a3.c(this, 2));
    }

    @Override // ji.g1
    public void C(h1 h1Var) {
        ji.a aVar;
        j5 j5Var = (j5) this.b;
        h5 h5Var = j5Var.s;
        if (h5Var == null || (aVar = j5Var.a) == null) {
            return;
        }
        v3 v3Var = ((a3) h5Var).a;
        ArrayList arrayList = v3Var.l3;
        long j3 = aVar.t;
        if (j3 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((ji.a) arrayList.get(i11)).k.contains(Long.valueOf(j3))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        g2 g2Var = v3Var.J3;
        if (g2Var != null) {
            g2Var.d();
        }
        ji.a aVar2 = new ji.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a4.a.x(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        v3Var.r4();
        v3Var.Y2.N(false);
        g2 g2Var2 = v3Var.J3;
        if (g2Var2 != null) {
            g2Var2.h();
        }
        v3Var.post(new n2(v3Var, aVar2, 26));
    }

    @Override // ji.j0
    public p9 D() {
        return (z0) this.b;
    }

    @Override // org.telegram.ui.kv0
    public void E0(MessageObject messageObject) {
        ((gb) ((o5) this.b).Q1).f(true);
    }

    @Override // ji.j0
    public ji.a F() {
        return ((z0) this.b).a;
    }

    @Override // hg.a2
    public /* synthetic */ a0.i G() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.kv0
    public void H(MessageObject messageObject) {
        ((gb) ((o5) this.b).Q1).f(false);
    }

    @Override // k2.n
    public void K() {
        ((androidx.media3.decoder.ffmpeg.b) this.b).Z = true;
    }

    @Override // ji.j0
    public boolean L() {
        z0 z0Var = (z0) this.b;
        q3 q3Var = z0Var.S;
        if (q3Var == null) {
            return false;
        }
        ji.a aVar = z0Var.a;
        return q3Var.a.R4();
    }

    @Override // ji.j0
    public void M(int i10, int i11) {
        z0 z0Var = (z0) this.b;
        q3 q3Var = z0Var.S;
        if (q3Var != null) {
            ji.a aVar = z0Var.a;
            g2 g2Var = q3Var.a.J3;
            if (g2Var != null) {
                g2Var.f(i10, i11);
            }
        }
    }

    @Override // ji.g1
    public void N(Editable editable) {
        ((j5) this.b).h();
    }

    @Override // k2.n
    public void O(k2.k kVar) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 0));
        }
    }

    @Override // ji.j0
    public void P() {
        z0 z0Var = (z0) this.b;
        q3 q3Var = z0Var.S;
        if (q3Var != null) {
            ji.a aVar = z0Var.a;
            v3 v3Var = q3Var.a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.h3.onContentChanged();
        }
    }

    @Override // hg.a2
    public /* synthetic */ boolean Q(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // ji.g1
    public /* synthetic */ boolean R(boolean z10) {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean S() {
        return false;
    }

    @Override // k2.n
    public void V(k2.k kVar) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e7 A[Catch: a | c -> 0x067a, TryCatch #1 {a | c -> 0x067a, blocks: (B:292:0x05cd, B:293:0x05e3, B:295:0x05e7, B:296:0x05ea, B:298:0x05ee, B:300:0x05f8, B:302:0x05fe, B:307:0x0603), top: B:291:0x05cd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aa.a X(pf.b bVar) {
        ArrayList arrayList;
        ic.c cVar;
        ic.c cVar2;
        ic.c cVar3;
        float f7;
        float f10;
        ic.a aVar;
        float f11;
        float f12;
        float f13;
        int i10;
        int i11;
        cc.j[] jVarArr;
        cc.a aVar2;
        dc.b bVar2;
        int i12;
        dc.d dVar;
        int i13;
        aa.a aVar3;
        List list;
        String str;
        int i14;
        boolean z10;
        double d;
        double abs;
        int i15;
        char c10;
        int i16;
        m mVar = (m) this.b;
        dc.b V = bVar.V();
        i iVar = new i(V, 25);
        ic.e eVar = new ic.e(V);
        int i17 = V.b;
        int i18 = V.a;
        int i19 = (i17 * 3) / 388;
        if (i19 < 3) {
            i19 = 3;
        }
        int[] iArr = new int[5];
        int i20 = i19 - 1;
        int i21 = 0;
        boolean z11 = false;
        while (true) {
            int i22 = 1;
            arrayList = eVar.b;
            if (i20 >= i17 || z11) {
                break;
            }
            Arrays.fill(iArr, i21);
            int i23 = 0;
            while (i23 < i18) {
                if (V.b(i23, i20)) {
                    if ((i21 & 1) == i22) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + i22;
                    i15 = i17;
                } else {
                    if ((i21 & 1) != 0) {
                        i15 = i17;
                        iArr[i21] = iArr[i21] + 1;
                    } else if (i21 == 4) {
                        if (!ic.e.b(iArr)) {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        } else if (eVar.c(i20, i23, iArr)) {
                            if (eVar.c) {
                                z11 = eVar.d();
                                i15 = i17;
                            } else {
                                if (arrayList.size() > i22) {
                                    int size = arrayList.size();
                                    int i24 = 0;
                                    ic.c cVar4 = null;
                                    while (true) {
                                        if (i24 >= size) {
                                            i15 = i17;
                                            c10 = 2;
                                            i16 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i24);
                                        i24++;
                                        ic.c cVar5 = (ic.c) obj;
                                        i15 = i17;
                                        if (cVar5.d >= 2) {
                                            if (cVar4 != null) {
                                                eVar.c = true;
                                                c10 = 2;
                                                i16 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        i17 = i15;
                                    }
                                } else {
                                    i15 = i17;
                                    i16 = 0;
                                    c10 = 2;
                                }
                                if (i16 > iArr[c10]) {
                                    i20 += (i16 - r5) - 2;
                                    i23 = i18 - 1;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i19 = 2;
                            i21 = 0;
                        } else {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        }
                        i21 = 3;
                    } else {
                        i15 = i17;
                        int i25 = i21 + 1;
                        iArr[i25] = iArr[i25] + 1;
                        i21 = i25;
                    }
                    i23++;
                    i17 = i15;
                    i22 = 1;
                }
                i23++;
                i17 = i15;
                i22 = 1;
            }
            int i26 = i17;
            if (ic.e.b(iArr) && eVar.c(i20, i18, iArr)) {
                int i27 = iArr[0];
                if (eVar.c) {
                    i19 = i27;
                    z11 = eVar.d();
                } else {
                    i19 = i27;
                }
            }
            i20 += i19;
            i17 = i26;
            i21 = 0;
        }
        if (arrayList.size() < 3) {
            throw cc.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ic.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, ic.e.e);
        ic.c[] cVarArr = new ic.c[3];
        int i28 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i29 = 2; i28 < arrayList.size() - i29; i29 = 2) {
            ic.c cVar6 = (ic.c) arrayList.get(i28);
            float f14 = cVar6.c;
            i28++;
            int i30 = i28;
            while (i30 < arrayList.size() - 1) {
                ic.c cVar7 = (ic.c) arrayList.get(i30);
                double e7 = ic.e.e(cVar6, cVar7);
                i30++;
                for (int i31 = i30; i31 < arrayList.size(); i31++) {
                    ic.c cVar8 = (ic.c) arrayList.get(i31);
                    if (cVar8.c <= 1.4f * f14) {
                        double e10 = ic.e.e(cVar7, cVar8);
                        double e11 = ic.e.e(cVar6, cVar8);
                        if (e7 < e10) {
                            if (e10 <= e11) {
                                e11 = e10;
                                e10 = e11;
                            } else if (e7 >= e11) {
                                d = e11;
                                e11 = e7;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d10 = abs;
                                }
                            }
                            d = e7;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e10 >= e11) {
                                d = e11;
                                e11 = e10;
                            } else if (e7 < e11) {
                                d = e10;
                                e10 = e11;
                                e11 = e7;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e10;
                            }
                            e10 = e7;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw cc.e.a();
        }
        float a2 = cc.j.a(cVarArr[0], cVarArr[1]);
        float a10 = cc.j.a(cVarArr[1], cVarArr[2]);
        float a11 = cc.j.a(cVarArr[0], cVarArr[2]);
        if (a10 >= a2 && a10 >= a11) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a11 < a10 || a11 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f15 = cVar.a;
        float f16 = cVar.b;
        if (e2.b(cVar2.a, f15, cVar3.b - f16, (cVar2.b - f16) * (cVar3.a - f15)) < 0.0f) {
            ic.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float h = iVar.h(cVar, cVar3);
        float f17 = cVar.a;
        float f18 = cVar3.b;
        float f19 = cVar3.a;
        float h10 = iVar.h(cVar, cVar2);
        float f20 = cVar2.b;
        float f21 = cVar2.a;
        float f22 = (h10 + h) / 2.0f;
        if (f22 < 1.0f) {
            throw cc.e.a();
        }
        float a12 = cc.j.a(cVar, cVar3) / f22;
        int i32 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = cc.j.a(cVar, cVar2) / f22;
        int i33 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i32) / 2;
        int i34 = i33 + 7;
        int i35 = i34 & 3;
        if (i35 == 0) {
            i34 = i33 + 8;
        } else if (i35 == 2) {
            i34 = i33 + 6;
        } else if (i35 == 3) {
            i34 = i33 + 5;
        }
        int i36 = i34;
        int[] iArr2 = hc.f.e;
        if (i36 % 4 != 1) {
            throw cc.c.a();
        }
        try {
            hc.f c11 = hc.f.c((i36 - 17) / 4);
            int i37 = (c11.a * 4) + 10;
            if (c11.b.length > 0) {
                float f23 = (f19 - f17) + f21;
                f10 = f19;
                float f24 = (f18 - f16) + f20;
                float f25 = 1.0f - (3.0f / i37);
                int z12 = (int) e2.z(f23, f17, f25, f17);
                int z13 = (int) e2.z(f24, f16, f25, f16);
                f7 = f17;
                for (int i38 = 4; i38 <= 16; i38 <<= 1) {
                    try {
                        aVar = iVar.r(f22, i38, z12, z13);
                        break;
                    } catch (cc.e unused) {
                    }
                }
            } else {
                f7 = f17;
                f10 = f19;
            }
            aVar = null;
            float f26 = i36 - 3.5f;
            if (aVar != null) {
                f11 = aVar.a;
                f12 = aVar.b;
                f13 = f26 - 3.0f;
            } else {
                f11 = (f10 - f7) + f21;
                f12 = (f18 - f16) + f20;
                f13 = f26;
            }
            float f27 = f12;
            float f28 = cVar.a;
            float f29 = cVar.b;
            float f30 = cVar3.a;
            float f31 = cVar3.b;
            float f32 = cVar2.a;
            float f33 = cVar2.b;
            dc.g a14 = dc.g.a(3.5f, 3.5f, f26, 3.5f, f13, f13, 3.5f, f26);
            ic.a aVar4 = aVar;
            float f34 = a14.e;
            float f35 = a14.i;
            float f36 = f34 * f35;
            float f37 = a14.f;
            float f38 = a14.h;
            float f39 = f36 - (f37 * f38);
            float f40 = a14.g;
            float f41 = f37 * f40;
            float f42 = a14.d;
            float f43 = f41 - (f42 * f35);
            float f44 = (f42 * f38) - (f34 * f40);
            float f45 = a14.c;
            float f46 = f45 * f38;
            float f47 = a14.b;
            float f48 = f46 - (f47 * f35);
            float f49 = a14.a;
            float f50 = (f35 * f49) - (f45 * f40);
            float f51 = (f40 * f47) - (f38 * f49);
            float f52 = (f47 * f37) - (f45 * f34);
            float f53 = (f45 * f42) - (f37 * f49);
            float f54 = (f49 * f34) - (f47 * f42);
            dc.g a15 = dc.g.a(f28, f29, f30, f31, f11, f27, f32, f33);
            float f55 = a15.a;
            float f56 = a15.d;
            float f57 = a15.g;
            float f58 = (f57 * f52) + (f56 * f48) + (f55 * f39);
            float f59 = (f57 * f53) + (f56 * f50) + (f55 * f43);
            float f60 = (f57 * f54) + (f56 * f51) + (f55 * f44);
            float f61 = a15.b;
            float f62 = a15.e;
            float f63 = a15.h;
            float f64 = (f63 * f52) + (f62 * f48) + (f61 * f39);
            float f65 = (f63 * f53) + (f62 * f50) + (f61 * f43);
            float f66 = (f63 * f54) + (f62 * f51) + (f61 * f44);
            float f67 = a15.c;
            float f68 = a15.f;
            float f69 = a15.i;
            float f70 = (f52 * f69) + (f48 * f68) + (f39 * f67);
            float f71 = (f53 * f69) + (f50 * f68) + (f43 * f67);
            float f72 = (f69 * f54) + (f68 * f51) + (f67 * f44);
            if (i36 <= 0 || i36 <= 0) {
                throw cc.e.a();
            }
            dc.b bVar3 = new dc.b(i36, i36);
            int i39 = i36 * 2;
            ic.c cVar10 = cVar;
            float[] fArr = new float[i39];
            int i40 = 0;
            while (i40 < i36) {
                int i41 = i36;
                float f73 = i40 + 0.5f;
                int i42 = 0;
                while (i42 < i39) {
                    int i43 = i42;
                    fArr[i43] = (i43 / 2) + 0.5f;
                    fArr[i43 + 1] = f73;
                    i42 = i43 + 2;
                }
                int i44 = i39 - 1;
                int i45 = i40;
                int i46 = 0;
                while (i46 < i44) {
                    float f74 = fArr[i46];
                    int i47 = i46 + 1;
                    int i48 = i46;
                    float f75 = fArr[i47];
                    ic.c cVar11 = cVar2;
                    float a16 = p6.a(f71, f75, f70 * f74, f72);
                    fArr[i48] = (((f59 * f75) + (f58 * f74)) + f60) / a16;
                    fArr[i47] = (((f75 * f65) + (f74 * f64)) + f66) / a16;
                    i46 = i48 + 2;
                    cVar2 = cVar11;
                }
                ic.c cVar12 = cVar2;
                int i49 = V.b;
                float f76 = f71;
                int i50 = 0;
                boolean z14 = true;
                while (i50 < i44 && z14) {
                    int i51 = (int) fArr[i50];
                    int i52 = i50 + 1;
                    int i53 = i44;
                    int i54 = (int) fArr[i52];
                    int i55 = i50;
                    if (i51 < -1 || i51 > i18 || i54 < -1 || i54 > i49) {
                        throw cc.e.a();
                    }
                    if (i51 == -1) {
                        fArr[i55] = 0.0f;
                    } else if (i51 == i18) {
                        fArr[i55] = i18 - 1;
                    } else {
                        z10 = false;
                        if (i54 != -1) {
                            fArr[i52] = 0.0f;
                        } else if (i54 == i49) {
                            fArr[i52] = i49 - 1;
                        } else {
                            z14 = z10;
                            i50 = i55 + 2;
                            i44 = i53;
                        }
                        z14 = true;
                        i50 = i55 + 2;
                        i44 = i53;
                    }
                    z10 = true;
                    if (i54 != -1) {
                    }
                    z14 = true;
                    i50 = i55 + 2;
                    i44 = i53;
                }
                int i56 = i39 - 2;
                boolean z15 = true;
                while (i56 >= 0 && z15) {
                    int i57 = (int) fArr[i56];
                    int i58 = i56 + 1;
                    int i59 = i56;
                    int i60 = (int) fArr[i58];
                    if (i57 < -1 || i57 > i18 || i60 < -1 || i60 > i49) {
                        throw cc.e.a();
                    }
                    if (i57 == -1) {
                        fArr[i59] = 0.0f;
                    } else if (i57 == i18) {
                        fArr[i59] = i18 - 1;
                    } else {
                        z15 = false;
                        if (i60 != -1) {
                            fArr[i58] = 0.0f;
                        } else if (i60 == i49) {
                            fArr[i58] = i49 - 1;
                        } else {
                            i56 = i59 - 2;
                        }
                        z15 = true;
                        i56 = i59 - 2;
                    }
                    z15 = true;
                    if (i60 != -1) {
                    }
                    z15 = true;
                    i56 = i59 - 2;
                }
                for (int i61 = 0; i61 < i39; i61 += 2) {
                    try {
                        if (V.b((int) fArr[i61], (int) fArr[i61 + 1])) {
                            int i62 = i61 / 2;
                            int i63 = (i62 / 32) + (bVar3.c * i45);
                            int[] iArr3 = bVar3.d;
                            iArr3[i63] = iArr3[i63] | (1 << (i62 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw cc.e.a();
                    }
                }
                i40 = i45 + 1;
                i36 = i41;
                f71 = f76;
                cVar2 = cVar12;
            }
            ic.c cVar13 = cVar2;
            if (aVar4 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new cc.j[]{cVar13, cVar10, cVar3};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new cc.j[]{cVar13, cVar10, cVar3, aVar4};
            }
            cc.j[] jVarArr2 = jVarArr;
            mVar.getClass();
            com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m();
            int i64 = bVar3.b;
            if (i64 < 21 || (i64 & i11) != i10) {
                throw cc.c.a();
            }
            mVar2.b = bVar3;
            try {
                dVar = mVar.Z(mVar2);
            } catch (cc.a e12) {
                aVar2 = e12;
                e = null;
                try {
                    mVar2.r();
                    mVar2.c = null;
                    mVar2.d = null;
                    mVar2.a = true;
                    mVar2.q();
                    mVar2.p();
                    bVar2 = (dc.b) mVar2.b;
                    i12 = 0;
                    while (i12 < bVar2.a) {
                        int i65 = i12 + 1;
                        for (int i66 = i65; i66 < bVar2.b; i66++) {
                            if (bVar2.b(i12, i66) != bVar2.b(i66, i12)) {
                                bVar2.a(i66, i12);
                                bVar2.a(i12, i66);
                            }
                        }
                        i12 = i65;
                    }
                    dc.d Z = mVar.Z(mVar2);
                    Z.e = new ob.a(10);
                    dVar = Z;
                    i13 = dVar.f;
                    if (e2.u(dVar.e)) {
                        cc.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    aVar3 = new aa.a(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        aVar3.z(cc.i.d, Integer.valueOf(i14));
                        aVar3.z(cc.i.e, Integer.valueOf(i13));
                    }
                    aVar3.z(cc.i.c, dVar.d);
                    aVar3.z(cc.i.f, "]Q" + dVar.h);
                    return aVar3;
                } catch (cc.a | cc.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (cc.c e13) {
                e = e13;
                aVar2 = null;
                mVar2.r();
                mVar2.c = null;
                mVar2.d = null;
                mVar2.a = true;
                mVar2.q();
                mVar2.p();
                bVar2 = (dc.b) mVar2.b;
                i12 = 0;
                while (i12 < bVar2.a) {
                }
                dc.d Z2 = mVar.Z(mVar2);
                Z2.e = new ob.a(10);
                dVar = Z2;
                i13 = dVar.f;
                if (e2.u(dVar.e)) {
                }
                aVar3 = new aa.a(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                aVar3.z(cc.i.c, dVar.d);
                aVar3.z(cc.i.f, "]Q" + dVar.h);
                return aVar3;
            }
            i13 = dVar.f;
            if (e2.u(dVar.e) && jVarArr2.length >= 3) {
                cc.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            aVar3 = new aa.a(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                aVar3.z(cc.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                aVar3.z(cc.i.b, str);
            }
            if (i13 >= 0 && (i14 = dVar.g) >= 0) {
                aVar3.z(cc.i.d, Integer.valueOf(i14));
                aVar3.z(cc.i.e, Integer.valueOf(i13));
            }
            aVar3.z(cc.i.c, dVar.d);
            aVar3.z(cc.i.f, "]Q" + dVar.h);
            return aVar3;
        } catch (IllegalArgumentException unused4) {
            throw cc.c.a();
        }
    }

    @Override // hg.a2
    public void Y(ArrayList arrayList) {
        switch (this.a) {
            case 22:
                k1 k1Var = (k1) this.b;
                String str = k1Var.Z;
                if (str != null) {
                    k1Var.U(str, k1Var.c0, k1Var.d0, k1Var.b0, k1Var.a0);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x0346, code lost:
    
        throw cc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03a2 A[LOOP:21: B:147:0x0224->B:177:0x03a2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0371 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dc.d Z(com.google.firebase.messaging.m mVar) {
        int e7;
        hc.e eVar;
        hc.c cVar;
        int i10;
        int i11;
        dc.c cVar2;
        int e10;
        hc.f q6 = mVar.q();
        hc.c cVar3 = mVar.p().a;
        hc.d p5 = mVar.p();
        hc.f q10 = mVar.q();
        int i12 = m1.j.d(8)[p5.b];
        dc.b bVar = (dc.b) mVar.b;
        int i13 = bVar.b;
        for (int i14 = 0; i14 < i13; i14++) {
            for (int i15 = 0; i15 < i13; i15++) {
                if (e2.a(i12, i14, i15)) {
                    bVar.a(i15, i14);
                }
            }
        }
        int i16 = q10.a * 4;
        int i17 = i16 + 17;
        int i18 = q10.d;
        dc.b bVar2 = new dc.b(i17, i17);
        bVar2.c(0, 0, 9, 9);
        int i19 = i16 + 9;
        bVar2.c(i19, 0, 8, 9);
        bVar2.c(0, i19, 9, 8);
        int[] iArr = q10.b;
        int length = iArr.length;
        for (int i20 = 0; i20 < length; i20++) {
            int i21 = iArr[i20] - 2;
            for (int i22 = 0; i22 < length; i22++) {
                if ((i20 != 0 || (i22 != 0 && i22 != length - 1)) && (i20 != length - 1 || i22 != 0)) {
                    bVar2.c(iArr[i22] - 2, i21, 5, 5);
                }
            }
        }
        int i23 = 6;
        bVar2.c(6, 9, 1, i16);
        bVar2.c(9, 6, i16, 1);
        if (q10.a > 6) {
            int i24 = i16 + 6;
            bVar2.c(i24, 0, 3, 6);
            bVar2.c(0, i24, 6, 3);
        }
        byte[] bArr = new byte[i18];
        int i25 = i13 - 1;
        int i26 = i25;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        boolean z10 = true;
        while (i26 > 0) {
            if (i26 == i23) {
                i26--;
            }
            for (int i30 = 0; i30 < i13; i30++) {
                int i31 = z10 ? i25 - i30 : i30;
                for (int i32 = 0; i32 < 2; i32++) {
                    int i33 = i26 - i32;
                    if (!bVar2.b(i33, i31)) {
                        i28++;
                        i29 <<= 1;
                        if (bVar.b(i33, i31)) {
                            i29 |= 1;
                        }
                        if (i28 == 8) {
                            bArr[i27] = (byte) i29;
                            i27++;
                            i28 = 0;
                            i29 = 0;
                        }
                    }
                }
            }
            z10 = !z10;
            i26 -= 2;
            i23 = 6;
        }
        if (i27 != i18) {
            throw cc.c.a();
        }
        if (i18 != q6.d) {
            throw new IllegalArgumentException();
        }
        b0 b0Var = q6.c[cVar3.ordinal()];
        q0[] q0VarArr = (q0[]) b0Var.c;
        int i34 = b0Var.b;
        int i35 = 0;
        for (q0 q0Var : q0VarArr) {
            i35 += q0Var.a;
        }
        hc.a[] aVarArr = new hc.a[i35];
        int i36 = 0;
        for (q0 q0Var2 : q0VarArr) {
            int i37 = 0;
            while (i37 < q0Var2.a) {
                int i38 = q0Var2.b;
                aVarArr[i36] = new hc.a(i38, new byte[i34 + i38]);
                i37++;
                i36++;
            }
        }
        int length2 = aVarArr[0].a.length;
        int i39 = i35 - 1;
        while (i39 >= 0 && aVarArr[i39].a.length != length2) {
            i39--;
        }
        int i40 = i39 + 1;
        int i41 = length2 - i34;
        int i42 = 0;
        int i43 = 0;
        while (i42 < i41) {
            int i44 = i43;
            int i45 = 0;
            while (i45 < i36) {
                aVarArr[i45].a[i42] = bArr[i44];
                i45++;
                i44++;
            }
            i42++;
            i43 = i44;
        }
        int i46 = i40;
        while (i46 < i36) {
            aVarArr[i46].a[i41] = bArr[i43];
            i46++;
            i43++;
        }
        boolean z11 = false;
        int length3 = aVarArr[0].a.length;
        while (i41 < length3) {
            int i47 = i43;
            int i48 = 0;
            while (i48 < i36) {
                aVarArr[i48].a[i48 < i40 ? i41 : i41 + 1] = bArr[i47];
                i48++;
                i47++;
            }
            i41++;
            i43 = i47;
        }
        int i49 = 0;
        for (int i50 = 0; i50 < i35; i50++) {
            i49 += aVarArr[i50].b;
        }
        byte[] bArr2 = new byte[i49];
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        while (i52 < i35) {
            hc.a aVar = aVarArr[i52];
            byte[] bArr3 = aVar.a;
            int i54 = aVar.b;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i55 = 0; i55 < length4; i55++) {
                iArr2[i55] = bArr3[i55] & 255;
            }
            try {
                int i56 = ((i) this.b).i(bArr3.length - i54, iArr2);
                for (int i57 = 0; i57 < i54; i57++) {
                    bArr3[i57] = (byte) iArr2[i57];
                }
                i51 += i56;
                int i58 = i53;
                int i59 = 0;
                while (i59 < i54) {
                    bArr2[i58] = bArr3[i59];
                    i59++;
                    i58++;
                }
                i52++;
                i53 = i58;
            } catch (fc.c unused) {
                cc.a aVar2 = cc.a.c;
                if (cc.h.a) {
                    throw new cc.a();
                }
                throw cc.a.c;
            }
        }
        char[] cArr = hc.b.a;
        b4.d dVar = new b4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i60 = -1;
        int i61 = -1;
        boolean z12 = false;
        boolean z13 = false;
        dc.c cVar4 = null;
        while (true) {
            try {
                int d = dVar.d();
                hc.e eVar2 = hc.e.c;
                if (d < 4 || (e7 = dVar.e(4)) == 0) {
                    eVar = eVar2;
                } else if (e7 == 1) {
                    eVar = hc.e.d;
                } else if (e7 == 2) {
                    eVar = hc.e.e;
                } else if (e7 == 3) {
                    eVar = hc.e.f;
                } else if (e7 == 4) {
                    eVar = hc.e.h;
                } else if (e7 == 5) {
                    eVar = hc.e.s;
                } else if (e7 == 7) {
                    eVar = hc.e.n;
                } else if (e7 == 8) {
                    eVar = hc.e.r;
                } else if (e7 == 9) {
                    eVar = hc.e.v;
                } else {
                    if (e7 != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = hc.e.w;
                }
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    cVar = cVar3;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i51;
                            i11 = 1;
                            int e11 = dVar.e(8);
                            if ((e11 & 128) == 0) {
                                e10 = e11 & 127;
                            } else if ((e11 & 192) == 128) {
                                e10 = ((e11 & 63) << 8) | dVar.e(8);
                            } else {
                                if ((e11 & 224) != 192) {
                                    throw cc.c.a();
                                }
                                e10 = ((e11 & 31) << 16) | dVar.e(16);
                            }
                            HashMap hashMap = dc.c.c;
                            if (e10 < 0 || e10 >= 900) {
                                break;
                            }
                            dc.c cVar5 = (dc.c) dc.c.c.get(Integer.valueOf(e10));
                            if (cVar5 == null) {
                                throw cc.c.a();
                            }
                            cVar2 = cVar5;
                        } else if (ordinal == 7) {
                            i10 = i51;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i51;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z13 = true;
                        } else if (ordinal != 9) {
                            int e12 = dVar.e(eVar.a(q6));
                            int ordinal2 = eVar.ordinal();
                            i10 = i51;
                            if (ordinal2 == 1) {
                                hc.b.e(dVar, sb2, e12);
                            } else if (ordinal2 == 2) {
                                hc.b.a(dVar, sb2, e12, z12);
                            } else if (ordinal2 == 4) {
                                hc.b.b(dVar, sb2, e12, cVar4, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw cc.c.a();
                                }
                                hc.b.d(dVar, sb2, e12);
                            }
                        } else {
                            i10 = i51;
                            int e13 = dVar.e(4);
                            int e14 = dVar.e(eVar.a(q6));
                            i11 = 1;
                            if (e13 == 1) {
                                hc.b.c(dVar, sb2, e14);
                            }
                        }
                        int i62 = i60;
                        if (eVar == eVar2) {
                            if (cVar2 != null) {
                                i11 = z11 ? 4 : z13 ? 6 : 2;
                            } else if (z11) {
                                i11 = 3;
                            } else if (z13) {
                                i11 = 5;
                            }
                            dc.d dVar2 = new dc.d(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, cVar.toString(), i62, i61, i11);
                            dVar2.d = Integer.valueOf(i10);
                            return dVar2;
                        }
                        i60 = i62;
                        cVar3 = cVar;
                        cVar4 = cVar2;
                        i51 = i10;
                    } else {
                        i10 = i51;
                        i11 = 1;
                        if (dVar.d() < 16) {
                            throw cc.c.a();
                        }
                        i60 = dVar.e(8);
                        i61 = dVar.e(8);
                    }
                    cVar2 = cVar4;
                    int i622 = i60;
                    if (eVar == eVar2) {
                    }
                } else {
                    cVar = cVar3;
                    i10 = i51;
                }
                i11 = 1;
                cVar2 = cVar4;
                int i6222 = i60;
                if (eVar == eVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw cc.c.a();
            }
        }
    }

    @Override // ji.j0
    public void a(h1 h1Var) {
        switch (this.a) {
            case 26:
                q3 q3Var = ((z0) this.b).S;
                if (q3Var != null) {
                    v3 v3Var = q3Var.a;
                    v3.L1(v3Var, h1Var);
                    v3Var.h3.v(h1Var, true);
                    break;
                }
                break;
            default:
                h5 h5Var = ((j5) this.b).s;
                if (h5Var != null) {
                    v3 v3Var2 = ((a3) h5Var).a;
                    v3.L1(v3Var2, h1Var);
                    v3Var2.h3.v(h1Var, true);
                    break;
                }
                break;
        }
    }

    public void a0() {
        ((t) this.b).d.R();
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 19:
                q qVar = new q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel O0 = iVar.O0();
                v.d(O0, qVar);
                O0.writeStringArray(strArr);
                iVar.T0(O0, 6);
                break;
            default:
                i7.b bVar = (i7.b) this.b;
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = bVar.k;
                Parcel K0 = iVar2.K0();
                int i10 = i7.f.a;
                K0.writeStrongBinder(aVar);
                K0.writeString(str);
                iVar2.L0(K0, 2);
                break;
        }
    }

    @Override // k2.n
    public void b(long j3) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new bi.g(yVar, j3, 12));
        }
    }

    public void c(HashMap hashMap) {
        if (((SparseArray) this.b) == null) {
            this.b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override // ji.j0
    public void c0() {
        z0 z0Var = (z0) this.b;
        q3 q3Var = z0Var.S;
        if (q3Var != null) {
            ji.a aVar = z0Var.a;
            v3.N1(q3Var.a);
        }
    }

    @Override // k2.n
    public void d() {
        ((androidx.media3.decoder.ffmpeg.b) this.b).f0 = true;
    }

    @Override // ji.g1
    public /* synthetic */ boolean e() {
        return false;
    }

    @Override // hg.a2
    public void f(int i10) {
        switch (this.a) {
            case 22:
                ((k1) this.b).l();
                break;
            default:
                AndroidUtilities.runOnUIThread(new t0(this, 0));
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r3 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 3) goto L23;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f0(Object obj) {
        Integer num = (Integer) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        int intValue = num.intValue();
        if (f0Var.F0 != null && Build.VERSION.SDK_INT >= 23) {
            int i10 = f0Var.C0.y;
            Context n10 = f0Var.n();
            Drawable drawable = null;
            if (n10 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i11 = R.drawable.fingerprint_dialog_fp_icon;
                if (i10 != 0 || intValue != 1) {
                    if (i10 == 1 && intValue == 2) {
                        i11 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i10 == 2) {
                        }
                        if (i10 == 1) {
                        }
                    }
                }
                drawable = n10.getDrawable(i11);
            }
            if (drawable != null) {
                f0Var.F0.setImageDrawable(drawable);
                if ((i10 != 0 || intValue != 1) && ((i10 == 1 && intValue == 2) || (i10 == 2 && intValue == 1))) {
                    d0.a(drawable);
                }
                f0Var.C0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? f0Var.D0 : f0Var.E0);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // ji.j0
    public void g() {
        z0 z0Var = (z0) this.b;
        q3 q3Var = z0Var.S;
        if (q3Var != null) {
            v3.O1(q3Var.a, z0Var.a);
        }
    }

    @Override // ji.g1
    public /* synthetic */ boolean h(h1 h1Var) {
        return false;
    }

    @Override // fb.n
    public Object h2() {
        Class cls = (Class) this.b;
        try {
            return fb.s.a.a(cls);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
        }
    }

    @Override // org.telegram.ui.kv0
    public /* synthetic */ TextureView i0() {
        return null;
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = aVar.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i10 != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i10);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i10);
        }
        int i11 = u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.O;
        if (resultReceiver != null) {
            resultReceiver.send(i11, extras);
        } else {
            u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
        }
        if (i11 != 0) {
            u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i11);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // ji.g1
    public /* synthetic */ boolean k(h1 h1Var) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void m(k6.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean n() {
        return true;
    }

    @Override // ji.g1
    public void o(h1 h1Var, int i10, int i11) {
        h5 h5Var;
        q9 textSelectionHelper;
        j5 j5Var = (j5) this.b;
        if (j5Var.w || i10 == i11 || (h5Var = j5Var.s) == null || (textSelectionHelper = ((a3) h5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        h1Var.post(new y4(this, h1Var, i11, textSelectionHelper, i10, 3));
    }

    @Override // k2.n
    public void onAudioSessionIdChanged(int i10) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new ah.g(yVar, i10, 12));
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // k2.n
    public void onSkipSilenceEnabledChanged(boolean z10) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new ah.u(8, yVar, z10));
        }
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        d7 d7Var = (d7) this.b;
        z6 z6Var = d7Var.M;
        g71 g71Var = d7Var.x;
        if (g71Var == null) {
            return;
        }
        if (g71Var.y()) {
            AndroidUtilities.runOnUIThread(z6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(z6Var);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((d6.a) this.b).getClass();
        v7.h5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        d2 d2Var = ((d7) this.b).w;
        if (d2Var != null) {
            float f10 = i10 / i11;
            if (Math.abs(d2Var.y0 - f10) >= 1.0E-4f) {
                d2Var.y0 = f10;
                d2Var.requestLayout();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void p(int i10) {
        k6.a aVar;
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.c()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // k2.n
    public void q(int i10, long j3, long j10) {
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.i(yVar, i10, j3, j10, 0));
        }
    }

    @Override // mg.p
    public void s() {
        ((m0) this.b).e.invalidate();
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        da.b bVar = (da.b) this.b;
        a4.m mVar = (a4.m) bVar.f;
        da.d dVar = (da.d) bVar.b;
        String str = (String) mVar.b;
        FileWriter fileWriter2 = null;
        try {
            HashMap i02 = a4.m.i0(dVar);
            aa.a aVar = new aa.a(str, i02);
            aVar.x("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar.x("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            a4.m.g0(aVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + i02;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = mVar.j0(aVar.m());
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e7);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.a O = ((xa.c) bVar.c).O(jSONObject);
            i iVar = (i) bVar.e;
            long j3 = O.c;
            iVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) iVar.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        w9.h.c(fileWriter, "Failed to close settings writer.");
                        da.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f;
                        SharedPreferences.Editor edit = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(O);
                        ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(O);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    w9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                w9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            w9.h.c(fileWriter, "Failed to close settings writer.");
            da.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f;
            SharedPreferences.Editor edit2 = ((Context) bVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(O);
            ((TaskCompletionSource) ((AtomicReference) bVar.i).get()).trySetResult(O);
        }
        return Tasks.forResult(null);
    }

    @Override // ji.j0
    public q9 u() {
        q3 q3Var = ((z0) this.b).S;
        if (q3Var == null) {
            return null;
        }
        return q3Var.a.getTextSelectionHelper();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void v(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // hg.a2
    public /* synthetic */ a0.i w() {
        switch (this.a) {
        }
        return null;
    }

    @Override // k2.n
    public void x() {
        x2.p pVar;
        androidx.media3.decoder.ffmpeg.b bVar = (androidx.media3.decoder.ffmpeg.b) this.b;
        synchronized (bVar.a) {
            pVar = bVar.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override // k2.n
    public void z(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        y yVar = ((androidx.media3.decoder.ffmpeg.b) this.b).I;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.f(yVar, exc, 1));
        }
    }

    public /* synthetic */ m(r rVar, String[] strArr) {
        this.a = 19;
        this.b = strArr;
    }

    @Override // org.telegram.ui.Components.d71
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public m(int i10) {
        this.a = i10;
        switch (i10) {
            case 10:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 20:
                this.b = new m(21);
                break;
            case 21:
                this.b = new i(fc.a.h, 20);
                break;
            default:
                this.b = new e2.v(10);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void J() {
    }

    @Override // k2.n
    public /* synthetic */ void T() {
    }

    @Override // mg.p
    public void b0() {
    }

    @Override // k2.n
    public /* synthetic */ void l() {
    }

    @Override // ji.g1
    public /* synthetic */ void r() {
    }

    private final /* synthetic */ void d0(ArrayList arrayList) {
    }

    @Override // mg.p
    public void E(boolean z10) {
    }

    @Override // mg.p
    public void W(boolean z10) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ji.g1
    public /* synthetic */ void y(CharSequence charSequence) {
    }

    @Override // ji.g1
    public /* synthetic */ void i(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onError(g71 g71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void I(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
