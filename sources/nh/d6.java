package nh;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.webkit.WebView;
import android.widget.TextView;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.zg;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.Components.zp0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ki0;
import org.telegram.ui.pr0;
import org.telegram.ui.qx;
import org.telegram.ui.ta1;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d6 implements u61, o0.a, o2.n, zn0, vd.e, wf.m, rf.j1, org.telegram.ui.q9, o4.i, OnCompleteListener, pa.m, r5.a, com.google.android.gms.common.api.internal.s, li, vn0, org.telegram.ui.Components.b5, th.g0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ d6(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // rf.j1
    public boolean A(int i10) {
        switch (this.a) {
            case 10:
                if (i10 == ((zp0) this.b).r) {
                }
                break;
            default:
                if (i10 == ((mn0) this.b).Z) {
                }
                break;
        }
        return false;
    }

    @Override // th.g0
    public void B(CharSequence charSequence) {
        th.e4 e4Var = ((th.g4) this.b).C;
        if (e4Var != null) {
            th.l3 l3Var = (th.l3) e4Var;
            l3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            l3Var.a.t4(charSequence.toString());
        }
    }

    @Override // wf.m
    public void C(boolean z10) {
        ((pe0) this.b).c.setAspectLock(z10);
    }

    @Override // th.g0
    public org.telegram.ui.Cells.j9 D() {
        return (th.g4) this.b;
    }

    @Override // rf.j1
    public void E(ArrayList arrayList) {
        switch (this.a) {
            case 10:
                break;
            default:
                mn0 mn0Var = (mn0) this.b;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    mn0Var.F.add(((rf.i1) arrayList.get(i10)).a);
                }
                qx qxVar = mn0Var.Q;
                if (qxVar != null) {
                    qxVar.d(mn0Var.z0 > 0, false);
                }
                mn0Var.l();
                break;
        }
    }

    @Override // org.telegram.ui.q9
    public String E0() {
        return ((org.telegram.ui.web.z0) this.b).e0;
    }

    @Override // o4.i
    public long F(long j10) {
        return 1L;
    }

    @Override // th.g0
    public th.a G() {
        return ((th.g4) this.b).a;
    }

    @Override // o4.i
    public long H(long j10, long j11) {
        return 1L;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        th.x1 x1Var = (th.x1) this.b;
        x1Var.s0(i10, i11, z10);
        ki0 ki0Var = x1Var.K0;
        if (ki0Var != null) {
            ki0Var.i();
            x1Var.K0 = null;
        }
    }

    @Override // org.telegram.ui.q9
    public void J(String str) {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
        try {
            z0Var.L = System.currentTimeMillis();
            z0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            FileLog.e(e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05cf A[Catch: a | c -> 0x0662, TryCatch #4 {a | c -> 0x0662, blocks: (B:292:0x05b5, B:293:0x05cb, B:295:0x05cf, B:296:0x05d2, B:298:0x05d6, B:300:0x05e0, B:302:0x05e6, B:307:0x05eb), top: B:291:0x05b5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l3.g0 K(g9.l lVar) {
        ArrayList arrayList;
        sb.c cVar;
        sb.c cVar2;
        sb.c cVar3;
        float f9;
        float f10;
        sb.a aVar;
        float f11;
        float f12;
        float f13;
        int i10;
        int i11;
        mb.j[] jVarArr;
        mb.a aVar2;
        nb.b bVar;
        int i12;
        nb.d dVar;
        int i13;
        l3.g0 g0Var;
        List list;
        String str;
        int i14;
        boolean z10;
        double d;
        double abs;
        char c3;
        int i15;
        o1.a aVar3 = (o1.a) this.b;
        nb.b k9 = lVar.k();
        org.telegram.ui.Components.n nVar = new org.telegram.ui.Components.n(k9, 16);
        sb.e eVar = new sb.e(k9);
        int i16 = k9.b;
        int i17 = k9.a;
        int i18 = (i16 * 3) / 388;
        if (i18 < 3) {
            i18 = 3;
        }
        int[] iArr = new int[5];
        int i19 = i18 - 1;
        int i20 = 0;
        boolean z11 = false;
        while (true) {
            int i21 = 1;
            arrayList = eVar.b;
            if (i19 >= i16 || z11) {
                break;
            }
            Arrays.fill(iArr, i20);
            int i22 = 0;
            while (i22 < i17) {
                if (k9.b(i22, i19)) {
                    if ((i20 & 1) == i21) {
                        i20++;
                    }
                    iArr[i20] = iArr[i20] + i21;
                } else {
                    if ((i20 & 1) != 0) {
                        iArr[i20] = iArr[i20] + 1;
                    } else if (i20 == 4) {
                        if (!sb.e.b(iArr)) {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        } else if (eVar.c(i19, i22, iArr)) {
                            if (eVar.c) {
                                z11 = eVar.d();
                            } else {
                                if (arrayList.size() > i21) {
                                    int size = arrayList.size();
                                    int i23 = 0;
                                    sb.c cVar4 = null;
                                    while (true) {
                                        if (i23 >= size) {
                                            c3 = 2;
                                            i15 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i23);
                                        i23++;
                                        sb.c cVar5 = (sb.c) obj;
                                        int i24 = size;
                                        if (cVar5.d >= 2) {
                                            if (cVar4 != null) {
                                                eVar.c = true;
                                                c3 = 2;
                                                i15 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        size = i24;
                                    }
                                } else {
                                    i15 = 0;
                                    c3 = 2;
                                }
                                if (i15 > iArr[c3]) {
                                    i19 += (i15 - r4) - 2;
                                    i22 = i17 - 1;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i18 = 2;
                            i20 = 0;
                        } else {
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        }
                        i20 = 3;
                    } else {
                        int i25 = i20 + 1;
                        iArr[i25] = iArr[i25] + 1;
                        i20 = i25;
                    }
                    i22++;
                    i21 = 1;
                }
                i22++;
                i21 = 1;
            }
            if (sb.e.b(iArr) && eVar.c(i19, i17, iArr)) {
                int i26 = iArr[0];
                if (eVar.c) {
                    i18 = i26;
                    z11 = eVar.d();
                } else {
                    i18 = i26;
                }
            }
            i19 += i18;
            i20 = 0;
        }
        if (arrayList.size() < 3) {
            throw mb.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((sb.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, sb.e.e);
        sb.c[] cVarArr = new sb.c[3];
        int i27 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i28 = 2; i27 < arrayList.size() - i28; i28 = 2) {
            sb.c cVar6 = (sb.c) arrayList.get(i27);
            float f14 = cVar6.c;
            i27++;
            int i29 = i27;
            while (i29 < arrayList.size() - 1) {
                sb.c cVar7 = (sb.c) arrayList.get(i29);
                double e10 = sb.e.e(cVar6, cVar7);
                i29++;
                for (int i30 = i29; i30 < arrayList.size(); i30++) {
                    sb.c cVar8 = (sb.c) arrayList.get(i30);
                    if (cVar8.c <= 1.4f * f14) {
                        double e11 = sb.e.e(cVar7, cVar8);
                        double e12 = sb.e.e(cVar6, cVar8);
                        if (e10 < e11) {
                            if (e11 <= e12) {
                                e12 = e11;
                                e11 = e12;
                            } else if (e10 >= e12) {
                                d = e12;
                                e12 = e10;
                                abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d10 = abs;
                                }
                            }
                            d = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e11 >= e12) {
                                d = e12;
                                e12 = e11;
                            } else if (e10 < e12) {
                                d = e11;
                                e11 = e12;
                                e12 = e10;
                                abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e11;
                            }
                            e11 = e10;
                            abs = Math.abs(e11 - (d * 2.0d)) + Math.abs(e11 - (e12 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw mb.e.a();
        }
        float a2 = mb.j.a(cVarArr[0], cVarArr[1]);
        float a10 = mb.j.a(cVarArr[1], cVarArr[2]);
        float a11 = mb.j.a(cVarArr[0], cVarArr[2]);
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
        if (th.b(cVar2.a, f15, cVar3.b - f16, (cVar2.b - f16) * (cVar3.a - f15)) < 0.0f) {
            sb.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float b10 = nVar.b(cVar, cVar3);
        float f17 = cVar.a;
        float f18 = cVar3.b;
        float f19 = cVar3.a;
        float b11 = nVar.b(cVar, cVar2);
        float f20 = cVar2.b;
        float f21 = cVar2.a;
        float f22 = (b11 + b10) / 2.0f;
        if (f22 < 1.0f) {
            throw mb.e.a();
        }
        float a12 = mb.j.a(cVar, cVar3) / f22;
        int i31 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = mb.j.a(cVar, cVar2) / f22;
        int i32 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i31) / 2;
        int i33 = i32 + 7;
        int i34 = i33 & 3;
        if (i34 == 0) {
            i33 = i32 + 8;
        } else if (i34 == 2) {
            i33 = i32 + 6;
        } else if (i34 == 3) {
            i33 = i32 + 5;
        }
        int i35 = i33;
        int[] iArr2 = rb.e.e;
        if (i35 % 4 != 1) {
            throw mb.c.a();
        }
        try {
            rb.e c6 = rb.e.c((i35 - 17) / 4);
            int i36 = (c6.a * 4) + 10;
            if (c6.b.length > 0) {
                float f23 = (f19 - f17) + f21;
                f10 = f19;
                float f24 = (f18 - f16) + f20;
                float f25 = 1.0f - (3.0f / i36);
                int z12 = (int) com.google.android.recaptcha.internal.a.z(f23, f17, f25, f17);
                int z13 = (int) com.google.android.recaptcha.internal.a.z(f24, f16, f25, f16);
                f9 = f17;
                for (int i37 = 4; i37 <= 16; i37 <<= 1) {
                    try {
                        aVar = nVar.h(f22, i37, z12, z13);
                        break;
                    } catch (mb.e unused) {
                    }
                }
            } else {
                f9 = f17;
                f10 = f19;
            }
            aVar = null;
            float f26 = i35 - 3.5f;
            if (aVar != null) {
                f11 = aVar.a;
                f12 = aVar.b;
                f13 = f26 - 3.0f;
            } else {
                f11 = (f10 - f9) + f21;
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
            nb.g a14 = nb.g.a(3.5f, 3.5f, f26, 3.5f, f13, f13, 3.5f, f26);
            sb.a aVar4 = aVar;
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
            nb.g a15 = nb.g.a(f28, f29, f30, f31, f11, f27, f32, f33);
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
            if (i35 <= 0 || i35 <= 0) {
                throw mb.e.a();
            }
            nb.b bVar2 = new nb.b(i35, i35);
            int i38 = i35 * 2;
            sb.c cVar10 = cVar;
            float[] fArr = new float[i38];
            int i39 = 0;
            while (i39 < i35) {
                int i40 = i35;
                float f73 = i39 + 0.5f;
                int i41 = 0;
                while (i41 < i38) {
                    int i42 = i41;
                    fArr[i42] = (i42 / 2) + 0.5f;
                    fArr[i42 + 1] = f73;
                    i41 = i42 + 2;
                }
                int i43 = i38 - 1;
                int i44 = i39;
                int i45 = 0;
                while (i45 < i43) {
                    float f74 = fArr[i45];
                    int i46 = i45 + 1;
                    int i47 = i45;
                    float f75 = fArr[i46];
                    sb.c cVar11 = cVar2;
                    float d11 = com.google.android.recaptcha.internal.a.d(f71, f75, f70 * f74, f72);
                    fArr[i47] = (((f59 * f75) + (f58 * f74)) + f60) / d11;
                    fArr[i46] = (((f75 * f65) + (f74 * f64)) + f66) / d11;
                    i45 = i47 + 2;
                    cVar2 = cVar11;
                }
                sb.c cVar12 = cVar2;
                int i48 = k9.b;
                float f76 = f71;
                int i49 = 0;
                boolean z14 = true;
                while (i49 < i43 && z14) {
                    int i50 = (int) fArr[i49];
                    int i51 = i49 + 1;
                    int i52 = i43;
                    int i53 = (int) fArr[i51];
                    int i54 = i49;
                    if (i50 < -1 || i50 > i17 || i53 < -1 || i53 > i48) {
                        throw mb.e.a();
                    }
                    if (i50 == -1) {
                        fArr[i54] = 0.0f;
                    } else if (i50 == i17) {
                        fArr[i54] = i17 - 1;
                    } else {
                        z10 = false;
                        if (i53 != -1) {
                            fArr[i51] = 0.0f;
                        } else if (i53 == i48) {
                            fArr[i51] = i48 - 1;
                        } else {
                            z14 = z10;
                            i49 = i54 + 2;
                            i43 = i52;
                        }
                        z14 = true;
                        i49 = i54 + 2;
                        i43 = i52;
                    }
                    z10 = true;
                    if (i53 != -1) {
                    }
                    z14 = true;
                    i49 = i54 + 2;
                    i43 = i52;
                }
                int i55 = i38 - 2;
                boolean z15 = true;
                while (i55 >= 0 && z15) {
                    int i56 = (int) fArr[i55];
                    int i57 = i55 + 1;
                    int i58 = i55;
                    int i59 = (int) fArr[i57];
                    if (i56 < -1 || i56 > i17 || i59 < -1 || i59 > i48) {
                        throw mb.e.a();
                    }
                    if (i56 == -1) {
                        fArr[i58] = 0.0f;
                    } else if (i56 == i17) {
                        fArr[i58] = i17 - 1;
                    } else {
                        z15 = false;
                        if (i59 != -1) {
                            fArr[i57] = 0.0f;
                        } else if (i59 == i48) {
                            fArr[i57] = i48 - 1;
                        } else {
                            i55 = i58 - 2;
                        }
                        z15 = true;
                        i55 = i58 - 2;
                    }
                    z15 = true;
                    if (i59 != -1) {
                    }
                    z15 = true;
                    i55 = i58 - 2;
                }
                for (int i60 = 0; i60 < i38; i60 += 2) {
                    try {
                        if (k9.b((int) fArr[i60], (int) fArr[i60 + 1])) {
                            int i61 = i60 / 2;
                            int i62 = (i61 / 32) + (bVar2.c * i44);
                            int[] iArr3 = bVar2.d;
                            iArr3[i62] = iArr3[i62] | (1 << (i61 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw mb.e.a();
                    }
                }
                i39 = i44 + 1;
                i35 = i40;
                f71 = f76;
                cVar2 = cVar12;
            }
            sb.c cVar13 = cVar2;
            if (aVar4 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new mb.j[]{cVar13, cVar10, cVar3};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new mb.j[]{cVar13, cVar10, cVar3, aVar4};
            }
            mb.j[] jVarArr2 = jVarArr;
            aVar3.getClass();
            ab.m mVar = new ab.m();
            int i63 = bVar2.b;
            if (i63 < 21 || (i63 & i11) != i10) {
                throw mb.c.a();
            }
            mVar.b = bVar2;
            try {
                dVar = aVar3.w(mVar);
            } catch (mb.a e13) {
                aVar2 = e13;
                e = null;
                try {
                    mVar.p();
                    mVar.c = null;
                    mVar.d = null;
                    mVar.a = true;
                    mVar.o();
                    mVar.n();
                    bVar = (nb.b) mVar.b;
                    i12 = 0;
                    while (i12 < bVar.a) {
                        int i64 = i12 + 1;
                        for (int i65 = i64; i65 < bVar.b; i65++) {
                            if (bVar.b(i12, i65) != bVar.b(i65, i12)) {
                                bVar.a(i65, i12);
                                bVar.a(i12, i65);
                            }
                        }
                        i12 = i64;
                    }
                    nb.d w10 = aVar3.w(mVar);
                    w10.e = new x9.d(22);
                    dVar = w10;
                    i13 = dVar.f;
                    if (com.google.android.recaptcha.internal.a.u(dVar.e)) {
                        mb.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    g0Var = new l3.g0(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        g0Var.A(mb.i.d, Integer.valueOf(i14));
                        g0Var.A(mb.i.e, Integer.valueOf(i13));
                    }
                    g0Var.A(mb.i.c, dVar.d);
                    g0Var.A(mb.i.f, "]Q" + dVar.h);
                    return g0Var;
                } catch (mb.a | mb.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (mb.c e14) {
                e = e14;
                aVar2 = null;
                mVar.p();
                mVar.c = null;
                mVar.d = null;
                mVar.a = true;
                mVar.o();
                mVar.n();
                bVar = (nb.b) mVar.b;
                i12 = 0;
                while (i12 < bVar.a) {
                }
                nb.d w102 = aVar3.w(mVar);
                w102.e = new x9.d(22);
                dVar = w102;
                i13 = dVar.f;
                if (com.google.android.recaptcha.internal.a.u(dVar.e)) {
                }
                g0Var = new l3.g0(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                g0Var.A(mb.i.c, dVar.d);
                g0Var.A(mb.i.f, "]Q" + dVar.h);
                return g0Var;
            }
            i13 = dVar.f;
            if (com.google.android.recaptcha.internal.a.u(dVar.e) && jVarArr2.length >= 3) {
                mb.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            g0Var = new l3.g0(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                g0Var.A(mb.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                g0Var.A(mb.i.b, str);
            }
            if (i13 >= 0 && (i14 = dVar.g) >= 0) {
                g0Var.A(mb.i.d, Integer.valueOf(i14));
                g0Var.A(mb.i.e, Integer.valueOf(i13));
            }
            g0Var.A(mb.i.c, dVar.d);
            g0Var.A(mb.i.f, "]Q" + dVar.h);
            return g0Var;
        } catch (IllegalArgumentException unused4) {
            throw mb.c.a();
        }
    }

    @Override // th.g0
    public boolean M() {
        th.g4 g4Var = (th.g4) this.b;
        th.e4 e4Var = g4Var.C;
        if (e4Var == null) {
            return false;
        }
        th.a aVar = g4Var.a;
        return ((th.l3) e4Var).a.S4();
    }

    @Override // wf.m
    public void P(boolean z10) {
        pe0 pe0Var = (pe0) this.b;
        pe0Var.getClass();
        oe0 oe0Var = pe0Var.a;
        if (oe0Var != null) {
            ((pr0) oe0Var).a(z10);
        }
    }

    @Override // wf.m
    public void R() {
        oe0 oe0Var = ((pe0) this.b).a;
        if (oe0Var != null) {
            PhotoViewer photoViewer = ((pr0) oe0Var).a;
            if (photoViewer.Y1 == 1) {
                photoViewer.D2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ boolean T1() {
        return false;
    }

    @Override // org.telegram.ui.Components.zn0
    public void W(float f9, boolean z10) {
        ta1 ta1Var = (ta1) ((org.telegram.ui.Cells.k0) this.b);
        int i10 = (int) (org.telegram.ui.ActionBar.g6.q * 100.0f);
        int i11 = (int) (f9 * 100.0f);
        org.telegram.ui.ActionBar.g6.q = f9;
        if (i10 != i11) {
            ThemeActivity themeActivity = ta1Var.e.e;
            vk0 vk0Var = (vk0) themeActivity.b.K(themeActivity.b0);
            if (vk0Var != null) {
                ((org.telegram.ui.Cells.y8) vk0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.g6.q * 100.0f))));
            }
            org.telegram.ui.ActionBar.g6.E(true);
        }
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ boolean a0() {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 22:
                s5.r rVar = new s5.r(1, (TaskCompletionSource) obj2);
                s5.i iVar = (s5.i) ((s5.t) obj).u();
                Parcel M0 = iVar.M0();
                com.google.android.gms.internal.cast.u.d(M0, rVar);
                M0.writeStringArray((String[]) obj3);
                iVar.R0(M0, 6);
                break;
            case 23:
            default:
                m5.l lVar = new m5.l((TaskCompletionSource) obj2);
                u6.i iVar2 = (u6.i) ((u6.c) obj).u();
                Parcel I0 = iVar2.I0();
                int i11 = u6.f.a;
                I0.writeStrongBinder(lVar);
                u6.f.c(I0, (j5.e) obj3);
                iVar2.J0(I0, 1);
                break;
            case 24:
                t6.f fVar = new t6.f(1, (TaskCompletionSource) obj2);
                t6.d dVar = (t6.d) ((t6.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = c7.b.a;
                obtain.writeStrongBinder(fVar);
                c7.b.b(obtain, (GetCredentialRequest) obj3);
                c7.b.b(obtain, gVar);
                ((t6.b) dVar).E0(obtain, 1);
                break;
        }
    }

    @Override // o4.i
    public long b(long j10) {
        return 0L;
    }

    @Override // org.telegram.ui.Components.vn0
    public void c(float f9) {
        th.x xVar = (th.x) this.b;
        MessageObject messageObject = xVar.L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f9;
        MediaController.getInstance().seekToProgress(xVar.L, f9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                b9.b.g((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // o2.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) ce.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // org.telegram.ui.Components.vn0
    public void d(float f9) {
        MessageObject messageObject = ((th.x) this.b).L;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f9;
    }

    @Override // org.telegram.ui.q9
    public /* synthetic */ boolean d1(String str, org.telegram.ui.i9 i9Var) {
        return false;
    }

    @Override // th.g0
    public void e(th.d1 d1Var) {
        th.e4 e4Var = ((th.g4) this.b).C;
        if (e4Var != null) {
            th.p3 p3Var = ((th.l3) e4Var).a;
            th.p3.M1(p3Var, d1Var);
            p3Var.d3.U(d1Var, true);
        }
    }

    @Override // rf.j1
    public void f(int i10) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 10:
                zp0 zp0Var = (zp0) obj;
                dq0 dq0Var = zp0Var.G;
                zp0Var.s = i10;
                if (zp0Var.v != i10) {
                    zp0Var.d.clear();
                }
                int i12 = zp0Var.F;
                if (zp0Var.h() != 0 || zp0Var.e.e() || zp0Var.E) {
                    dq0Var.t0.b(i12);
                } else {
                    dq0Var.M.e(false, true);
                }
                zp0Var.l();
                int i13 = dq0.W0;
                dq0Var.K0(true);
                break;
            default:
                mn0 mn0Var = (mn0) obj;
                mn0Var.z0--;
                mn0Var.a0 = i10;
                if (mn0Var.b0 != i10) {
                    mn0Var.s.clear();
                }
                if (mn0Var.c0 != i10) {
                    mn0Var.E.clear();
                }
                mn0Var.J = true;
                qx qxVar = mn0Var.Q;
                if (qxVar != null) {
                    qxVar.d(mn0Var.z0 > 0, true);
                }
                mn0Var.l();
                qx qxVar2 = mn0Var.Q;
                if (qxVar2 != null) {
                    qxVar2.c();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // o2.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) ce.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // th.g0
    public void h0(int i10, int i11) {
        th.g4 g4Var = (th.g4) this.b;
        th.e4 e4Var = g4Var.C;
        if (e4Var != null) {
            th.a aVar = g4Var.a;
            th.b2 b2Var = ((th.l3) e4Var).a.F3;
            if (b2Var != null) {
                b2Var.f(i10, i11);
            }
        }
    }

    @Override // th.g0
    public void i() {
        th.g4 g4Var = (th.g4) this.b;
        th.e4 e4Var = g4Var.C;
        if (e4Var != null) {
            th.p3.P1(((th.l3) e4Var).a, g4Var.a);
        }
    }

    @Override // th.g0
    public void i0() {
        th.g4 g4Var = (th.g4) this.b;
        th.e4 e4Var = g4Var.C;
        if (e4Var != null) {
            th.a aVar = g4Var.a;
            th.p3 p3Var = ((th.l3) e4Var).a;
            th.b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.d3.onContentChanged();
        }
    }

    @Override // vd.e
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // vd.e
    public /* synthetic */ boolean k(float f9) {
        return false;
    }

    @Override // org.telegram.ui.Components.zn0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // th.g0
    public void l0() {
        th.g4 g4Var = (th.g4) this.b;
        th.e4 e4Var = g4Var.C;
        if (e4Var != null) {
            th.a aVar = g4Var.a;
            th.p3.O1(((th.l3) e4Var).a);
        }
    }

    @Override // o0.a
    public Cursor m(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // o4.i
    public long n(long j10, long j11) {
        return 0L;
    }

    @Override // o4.i
    public long o(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // r5.a
    public void o0(Bitmap bitmap) {
        ((r5.h) this.b).e(bitmap, 3);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        p5.c.h((p5.c) ((p5.j) this.b).c, "joinApplication", task);
    }

    @Override // org.telegram.ui.q9
    public void onDismiss() {
        org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.b;
        z0Var.v("scan_qr_popup_closed", null);
        z0Var.d0 = false;
    }

    @Override // org.telegram.ui.Components.u61
    public void onError(x61 x61Var, Exception exc) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.u61
    public void onRenderedFirstFrame() {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.Components.u61
    public void onStateChanged(boolean z10, int i10) {
        switch (this.a) {
            case 0:
                f6 f6Var = (f6) this.b;
                a6 a6Var = f6Var.H;
                AndroidUtilities.cancelRunOnUIThread(a6Var);
                x61 x61Var = f6Var.y;
                if (x61Var != null && x61Var.z()) {
                    AndroidUtilities.runOnUIThread(a6Var);
                    break;
                }
                break;
            default:
                gk0 gk0Var = (gk0) this.b;
                if (z10 && gk0Var.n.o() >= 0) {
                    gk0Var.w = true;
                }
                cg0 cg0Var = gk0Var.f;
                xb0 xb0Var = gk0Var.x;
                cg0Var.a(z10, true);
                AndroidUtilities.cancelRunOnUIThread(xb0Var);
                if (z10) {
                    AndroidUtilities.runOnUIThread(xb0Var, 16L);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.u61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((f6) this.b).i();
                break;
        }
    }

    @Override // org.telegram.ui.Components.u61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
        int i13 = this.a;
    }

    @Override // o4.i
    public p4.j p(long j10) {
        return (p4.j) this.b;
    }

    @Override // pa.m
    public Object p2() {
        switch (this.a) {
            case 15:
                Class cls = (Class) this.b;
                try {
                    return pa.r.a.a(cls);
                } catch (Exception e10) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
                }
            default:
                throw new na.j((String) this.b);
        }
    }

    @Override // rf.j1
    public /* synthetic */ a0.h q() {
        switch (this.a) {
        }
        return null;
    }

    @Override // o4.i
    public long r(long j10, long j11) {
        return 0L;
    }

    @Override // o2.n
    public String[] s() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // rf.j1
    public /* synthetic */ a0.h t() {
        switch (this.a) {
        }
        return null;
    }

    @Override // wf.m
    public void u() {
        oe0 oe0Var = ((pe0) this.b).a;
        if (oe0Var != null) {
            ((pr0) oe0Var).a.a0.invalidate();
        }
    }

    @Override // vd.e
    public void w() {
        ((org.telegram.ui.Components.j9) this.b).a.invalidate();
    }

    @Override // th.g0
    public org.telegram.ui.Cells.k9 x() {
        th.e4 e4Var = ((th.g4) this.b).C;
        if (e4Var != null) {
            return ((th.l3) e4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.li
    public void x0(zg zgVar) {
        int i10;
        i10 = ((org.telegram.ui.ActionBar.o2) ((sf.l) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(zgVar);
    }

    @Override // o4.i
    public boolean y() {
        return true;
    }

    @Override // o4.i
    public long z() {
        return 0L;
    }

    public /* synthetic */ d6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
        int i10 = this.a;
    }

    public /* synthetic */ d6(org.telegram.ui.Components.n nVar) {
        this.a = 12;
        this.b = (com.google.android.gms.internal.play_billing.r) nVar.b;
    }

    public d6(int i10) {
        this.a = i10;
        switch (i10) {
            case 19:
                this.b = new o1.a(18);
                break;
            default:
                this.b = new SparseArray();
                break;
        }
    }

    public d6(TextView textView) {
        this.a = 17;
        this.b = new q1.g(textView);
    }

    public d6(Context context, Uri uri) {
        this.a = 1;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void O() {
    }

    private final void S() {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void L0() {
    }

    @Override // vd.e
    public /* synthetic */ void a() {
    }

    @Override // vd.e
    public /* synthetic */ void l() {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void u0() {
    }

    @Override // org.telegram.ui.Components.zn0
    public void v() {
    }

    private final /* synthetic */ void Q(k3.a aVar) {
    }

    private final /* synthetic */ void T(k3.a aVar) {
    }

    private final /* synthetic */ void U(k3.a aVar) {
    }

    private final /* synthetic */ void V(k3.a aVar) {
    }

    private final /* synthetic */ void X(k3.a aVar) {
    }

    private final /* synthetic */ void Y(k3.a aVar) {
    }

    private final /* synthetic */ void Z(ArrayList arrayList) {
    }

    private final /* synthetic */ void b0(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.q9
    public /* synthetic */ void S0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // vd.e
    public /* synthetic */ void h(boolean z10) {
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void j1(TLRPC.User user) {
    }

    private final void L(x61 x61Var, Exception exc) {
    }

    private final void N(x61 x61Var, Exception exc) {
    }

    @Override // o4.i
    public long g(long j10, long j11) {
        return j11;
    }

    @Override // org.telegram.ui.Components.li
    public /* synthetic */ void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    private final void c0(int i10, int i11, float f9, int i12) {
    }

    private final void d0(int i10, int i11, float f9, int i12) {
    }

    @Override // org.telegram.ui.Components.li
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
