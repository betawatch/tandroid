package n2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.Editable;
import android.util.Log;
import android.util.SparseArray;
import android.widget.TextView;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.tasks.OnSuccessListener;
import g7.i5;
import h3.t1;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nh.j4;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.ge0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.op0;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.Components.sg;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.k9;
import org.telegram.ui.qa1;
import org.telegram.ui.rr0;
import org.telegram.ui.s9;
import org.telegram.ui.web.z0;
import org.telegram.ui.ys0;
import pf.i1;
import rh.b2;
import rh.c1;
import rh.d1;
import rh.g0;
import rh.i2;
import rh.k3;
import rh.p3;
import rh.v2;
import rh.w0;
import rh.w4;
import rh.y4;
import yf.p1;
import yf.r0;
import zf.v1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements androidx.activity.result.b, OnSuccessListener, o0.a, oa.m, pn0, ud.d, uf.m, j61, i1, s9, ei, g0, c1, v1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.s9
    public void C(String str) {
        z0 z0Var = (z0) this.b;
        try {
            z0Var.L = System.currentTimeMillis();
            z0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e9) {
            FileLog.e(e9);
        }
    }

    @Override // uf.m
    public void D(boolean z10) {
        ge0 ge0Var = (ge0) this.b;
        ge0Var.getClass();
        fe0 fe0Var = ge0Var.a;
        if (fe0Var != null) {
            ((rr0) fe0Var).a(z10);
        }
    }

    @Override // pf.i1
    public boolean D0(int i10) {
        return i10 == ((op0) this.b).r;
    }

    @Override // ud.d
    public /* synthetic */ boolean E() {
        return false;
    }

    @Override // ud.d
    public /* synthetic */ boolean G(float f10) {
        return false;
    }

    @Override // uf.m
    public void H() {
        fe0 fe0Var = ((ge0) this.b).a;
        if (fe0Var != null) {
            PhotoViewer photoViewer = ((rr0) fe0Var).a;
            if (photoViewer.Y1 == 1) {
                photoViewer.D2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // rh.g0
    public void I0() {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            rh.a aVar = w0Var.a;
            p3 p3Var = k3Var.a;
            b2 b2Var = p3Var.F3;
            if (b2Var != null) {
                b2Var.g();
            }
            p3Var.d3.onContentChanged();
        }
    }

    @Override // pf.i1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // rh.g0
    public j9 N() {
        k3 k3Var = ((w0) this.b).O;
        if (k3Var == null) {
            return null;
        }
        return k3Var.a.getTextSelectionHelper();
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ boolean N0() {
        return false;
    }

    @Override // rh.c1
    public void N1(d1 d1Var, int i10, int i11) {
        w4 w4Var;
        j9 textSelectionHelper;
        y4 y4Var = (y4) this.b;
        if (y4Var.w || i10 == i11 || (w4Var = y4Var.s) == null || (textSelectionHelper = ((v2) w4Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        d1Var.post(new j4(this, d1Var, i11, textSelectionHelper, i10, 5));
    }

    @Override // org.telegram.ui.Components.pn0
    public void P(float f10, boolean z10) {
        switch (this.a) {
            case 7:
                qa1 qa1Var = (qa1) ((k0) this.b);
                int i10 = (int) (g6.q * 100.0f);
                int i11 = (int) (f10 * 100.0f);
                g6.q = f10;
                if (i10 != i11) {
                    ThemeActivity themeActivity = qa1Var.e.e;
                    lk0 lk0Var = (lk0) themeActivity.b.K(themeActivity.b0);
                    if (lk0Var != null) {
                        ((x8) lk0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (g6.q * 100.0f))));
                    }
                    g6.E(true);
                    break;
                }
                break;
            default:
                vf.h hVar = (vf.h) this.b;
                float f11 = hVar.b;
                float z11 = com.google.android.recaptcha.internal.a.z(hVar.c, f11, f10, f11);
                hVar.d = z11;
                if (z10) {
                    l6 l6Var = hVar.e;
                    l6Var.getClass();
                    l6Var.c(null, z11);
                }
                hVar.invalidate();
                break;
        }
    }

    @Override // rh.g0
    public void S(CharSequence charSequence) {
        k3 k3Var = ((w0) this.b).O;
        if (k3Var != null) {
            k3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            k3Var.a.t4(charSequence.toString());
        }
    }

    @Override // rh.c1
    public /* synthetic */ boolean T1(boolean z10) {
        return false;
    }

    @Override // rh.g0
    public void X0() {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            rh.a aVar = w0Var.a;
            p3.O1(k3Var.a);
        }
    }

    @Override // androidx.activity.result.b
    public void a(Object obj) {
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.b;
        int i10 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.J;
        if (resultReceiver != null) {
            resultReceiver.send(i10, intent == null ? null : intent.getExtras());
        }
        int i11 = aVar.a;
        if (i11 != -1 || i10 != 0) {
            com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // org.telegram.ui.Components.pn0
    public /* synthetic */ int a0() {
        switch (this.a) {
        }
        return 0;
    }

    public void c(HashMap hashMap) {
        if (((SparseArray) this.b) == null) {
            this.b = new SparseArray(hashMap.size());
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ((SparseArray) this.b).put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
        }
    }

    @Override // zf.v1
    public void c0(float f10) {
        ys0 ys0Var = (ys0) this.b;
        r0.e(ys0Var.L1).k(String.valueOf(yf.m.a.indexOf(ys0Var.S0.getCurrentBrush())), f10);
        p1 p1Var = ys0Var.G1;
        p1Var.c = f10;
        ys0Var.s0(p1Var, null);
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // o0.a
    public Cursor d(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e9) {
            Log.w("FontsProvider", "Unable to query the content provider", e9);
            return null;
        }
    }

    public void e(int i10, int i11, m3.l lVar) {
        char c10;
        char c11;
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        s3.e eVar = (s3.e) this.b;
        s3.f fVar = eVar.b;
        SparseArray sparseArray = eVar.c;
        d5.z zVar = eVar.i;
        d5.z zVar2 = eVar.g;
        int i16 = 1;
        int i17 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (eVar.G != 2) {
                    return;
                }
                s3.d dVar = (s3.d) sparseArray.get(eVar.M);
                int i18 = eVar.P;
                d5.z zVar3 = eVar.n;
                if (i18 != 4 || !"V_VP9".equals(dVar.b)) {
                    lVar.t(i11);
                    return;
                } else {
                    zVar3.z(i11);
                    lVar.readFully(zVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                eVar.d(i10);
                s3.d dVar2 = eVar.u;
                int i19 = dVar2.g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    lVar.t(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                dVar2.N = bArr;
                lVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                eVar.d(i10);
                byte[] bArr2 = new byte[i11];
                eVar.u.i = bArr2;
                lVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                lVar.readFully(bArr3, 0, i11);
                eVar.d(i10);
                eVar.u.j = new m3.v(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(zVar.a, (byte) 0);
                lVar.readFully(zVar.a, 4 - i11, i11);
                zVar.C(0);
                eVar.w = (int) zVar.s();
                return;
            }
            if (i10 == 25506) {
                eVar.d(i10);
                byte[] bArr4 = new byte[i11];
                eVar.u.k = bArr4;
                lVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw t1.a("Unexpected id: " + i10, null);
            }
            eVar.d(i10);
            byte[] bArr5 = new byte[i11];
            eVar.u.v = bArr5;
            lVar.readFully(bArr5, 0, i11);
            return;
        }
        if (eVar.G == 0) {
            eVar.M = (int) fVar.b(lVar, false, true, 8);
            eVar.N = fVar.c;
            eVar.I = -9223372036854775807L;
            eVar.G = 1;
            zVar2.z(0);
        }
        s3.d dVar3 = (s3.d) sparseArray.get(eVar.M);
        if (dVar3 == null) {
            lVar.t(i11 - eVar.N);
            eVar.G = 0;
            return;
        }
        dVar3.X.getClass();
        if (eVar.G == 1) {
            eVar.i(lVar, 3);
            int i20 = (zVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                eVar.K = 1;
                int[] iArr = eVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                eVar.L = iArr;
                iArr[0] = (i11 - eVar.N) - 3;
            } else {
                eVar.i(lVar, 4);
                int i21 = (zVar2.a[3] & 255) + 1;
                eVar.K = i21;
                int[] iArr2 = eVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                eVar.L = iArr2;
                if (i20 == 2) {
                    int i22 = (i11 - eVar.N) - 4;
                    int i23 = eVar.K;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw t1.a("Unexpected lacing value: " + i20, null);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = eVar.K - i16;
                            if (i24 >= i27) {
                                c10 = 1;
                                c11 = 0;
                                eVar.L[i27] = ((i11 - eVar.N) - i26) - i25;
                                break;
                            }
                            eVar.L[i24] = i17;
                            int i28 = i26 + 1;
                            eVar.i(lVar, i28);
                            if (zVar2.a[i26] == 0) {
                                throw t1.a("No valid varint length mask found", null);
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= 8) {
                                    j10 = 0;
                                    i12 = i28;
                                    break;
                                }
                                int i30 = 1 << (7 - i29);
                                if ((zVar2.a[i26] & i30) != 0) {
                                    i12 = i28 + i29;
                                    eVar.i(lVar, i12);
                                    j10 = zVar2.a[i26] & b10 & (~i30);
                                    while (i28 < i12) {
                                        j10 = (j10 << 8) | (zVar2.a[i28] & b10);
                                        i28++;
                                        b10 = 255;
                                    }
                                    if (i24 > 0) {
                                        j10 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    b10 = 255;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int i31 = (int) j10;
                            int[] iArr3 = eVar.L;
                            if (i24 != 0) {
                                i31 += iArr3[i24 - 1];
                            }
                            iArr3[i24] = i31;
                            i25 += i31;
                            i24++;
                            i26 = i12;
                            b10 = 255;
                            i16 = 1;
                            i17 = 0;
                        }
                        throw t1.a("EBML lacing sample size out of range.", null);
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i13 = eVar.K - 1;
                        if (i32 >= i13) {
                            break;
                        }
                        eVar.L[i32] = 0;
                        while (true) {
                            i14 = i34 + 1;
                            eVar.i(lVar, i14);
                            int i35 = zVar2.a[i34] & 255;
                            int[] iArr4 = eVar.L;
                            i15 = iArr4[i32] + i35;
                            iArr4[i32] = i15;
                            if (i35 != 255) {
                                break;
                            } else {
                                i34 = i14;
                            }
                        }
                        i33 += i15;
                        i32++;
                        i34 = i14;
                    }
                    eVar.L[i13] = ((i11 - eVar.N) - i34) - i33;
                }
            }
            c10 = 1;
            c11 = 0;
            byte[] bArr6 = zVar2.a;
            eVar.H = eVar.k((bArr6[c10] & 255) | (bArr6[c11] << 8)) + eVar.B;
            eVar.O = (dVar3.d == 2 || (i10 == 163 && (zVar2.a[2] & 128) == 128)) ? 1 : 0;
            eVar.G = 2;
            eVar.J = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = eVar.J;
                if (i36 >= eVar.K) {
                    eVar.G = 0;
                    return;
                } else {
                    eVar.e(dVar3, ((eVar.J * dVar3.e) / MediaDataController.MAX_STYLE_RUNS_COUNT) + eVar.H, eVar.O, eVar.l(lVar, dVar3, eVar.L[i36], false), 0);
                    eVar.J++;
                }
            }
        } else {
            while (true) {
                int i37 = eVar.J;
                if (i37 >= eVar.K) {
                    return;
                }
                int[] iArr5 = eVar.L;
                iArr5[i37] = eVar.l(lVar, dVar3, iArr5[i37], true);
                eVar.J++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e3 A[Catch: a | c -> 0x0674, TryCatch #0 {a | c -> 0x0674, blocks: (B:292:0x05c9, B:293:0x05df, B:295:0x05e3, B:296:0x05e6, B:298:0x05ea, B:300:0x05f4, B:302:0x05fa, B:307:0x05ff), top: B:291:0x05c9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j9.a f(g5.b bVar) {
        ArrayList arrayList;
        rb.c cVar;
        rb.c cVar2;
        rb.c cVar3;
        float f10;
        float f11;
        rb.a aVar;
        float f12;
        float f13;
        float f14;
        int i10;
        int i11;
        lb.j[] jVarArr;
        lb.a aVar2;
        mb.b bVar2;
        int i12;
        mb.d dVar;
        int i13;
        j9.a aVar3;
        List list;
        String str;
        int i14;
        boolean z10;
        double d;
        double abs;
        int i15;
        char c10;
        int i16;
        o0.b bVar3 = (o0.b) this.b;
        mb.b n10 = bVar.n();
        m5.o oVar = new m5.o(n10, 17);
        rb.e eVar = new rb.e(n10);
        int i17 = n10.b;
        int i18 = n10.a;
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
                if (n10.b(i23, i20)) {
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
                        if (!rb.e.b(iArr)) {
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
                                    rb.c cVar4 = null;
                                    while (true) {
                                        if (i24 >= size) {
                                            i15 = i17;
                                            c10 = 2;
                                            i16 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i24);
                                        i24++;
                                        rb.c cVar5 = (rb.c) obj;
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
            if (rb.e.b(iArr) && eVar.c(i20, i18, iArr)) {
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
            throw lb.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((rb.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, rb.e.e);
        rb.c[] cVarArr = new rb.c[3];
        int i28 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i29 = 2; i28 < arrayList.size() - i29; i29 = 2) {
            rb.c cVar6 = (rb.c) arrayList.get(i28);
            float f15 = cVar6.c;
            i28++;
            int i30 = i28;
            while (i30 < arrayList.size() - 1) {
                rb.c cVar7 = (rb.c) arrayList.get(i30);
                double e9 = rb.e.e(cVar6, cVar7);
                i30++;
                for (int i31 = i30; i31 < arrayList.size(); i31++) {
                    rb.c cVar8 = (rb.c) arrayList.get(i31);
                    if (cVar8.c <= 1.4f * f15) {
                        double e10 = rb.e.e(cVar7, cVar8);
                        double e11 = rb.e.e(cVar6, cVar8);
                        if (e9 < e10) {
                            if (e10 <= e11) {
                                e11 = e10;
                                e10 = e11;
                            } else if (e9 >= e11) {
                                d = e11;
                                e11 = e9;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d10 = abs;
                                }
                            }
                            d = e9;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e10 >= e11) {
                                d = e11;
                                e11 = e10;
                            } else if (e9 < e11) {
                                d = e10;
                                e10 = e11;
                                e11 = e9;
                                abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e10;
                            }
                            e10 = e9;
                            abs = Math.abs(e10 - (d * 2.0d)) + Math.abs(e10 - (e11 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw lb.e.a();
        }
        float a2 = lb.j.a(cVarArr[0], cVarArr[1]);
        float a3 = lb.j.a(cVarArr[1], cVarArr[2]);
        float a10 = lb.j.a(cVarArr[0], cVarArr[2]);
        if (a3 >= a2 && a3 >= a10) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a10 < a3 || a10 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f16 = cVar.a;
        float f17 = cVar.b;
        if (pa.b(cVar2.a, f16, cVar3.b - f17, (cVar2.b - f17) * (cVar3.a - f16)) < 0.0f) {
            rb.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float o10 = oVar.o(cVar, cVar3);
        float f18 = cVar.a;
        float f19 = cVar3.b;
        float f20 = cVar3.a;
        float o11 = oVar.o(cVar, cVar2);
        float f21 = cVar2.b;
        float f22 = cVar2.a;
        float f23 = (o11 + o10) / 2.0f;
        if (f23 < 1.0f) {
            throw lb.e.a();
        }
        float a11 = lb.j.a(cVar, cVar3) / f23;
        int i32 = (int) (a11 + (a11 < 0.0f ? -0.5f : 0.5f));
        float a12 = lb.j.a(cVar, cVar2) / f23;
        int i33 = (((int) (a12 + (a12 >= 0.0f ? 0.5f : -0.5f))) + i32) / 2;
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
        int[] iArr2 = qb.e.e;
        if (i36 % 4 != 1) {
            throw lb.c.a();
        }
        try {
            qb.e c11 = qb.e.c((i36 - 17) / 4);
            int i37 = (c11.a * 4) + 10;
            if (c11.b.length > 0) {
                float f24 = (f20 - f18) + f22;
                f11 = f20;
                float f25 = (f19 - f17) + f21;
                float f26 = 1.0f - (3.0f / i37);
                int z12 = (int) com.google.android.recaptcha.internal.a.z(f24, f18, f26, f18);
                int z13 = (int) com.google.android.recaptcha.internal.a.z(f25, f17, f26, f17);
                f10 = f18;
                for (int i38 = 4; i38 <= 16; i38 <<= 1) {
                    try {
                        aVar = oVar.v(f23, i38, z12, z13);
                        break;
                    } catch (lb.e unused) {
                    }
                }
            } else {
                f10 = f18;
                f11 = f20;
            }
            aVar = null;
            float f27 = i36 - 3.5f;
            if (aVar != null) {
                f12 = aVar.a;
                f13 = aVar.b;
                f14 = f27 - 3.0f;
            } else {
                f12 = (f11 - f10) + f22;
                f13 = (f19 - f17) + f21;
                f14 = f27;
            }
            float f28 = f13;
            float f29 = cVar.a;
            float f30 = cVar.b;
            float f31 = cVar3.a;
            float f32 = cVar3.b;
            float f33 = cVar2.a;
            float f34 = cVar2.b;
            mb.g a13 = mb.g.a(3.5f, 3.5f, f27, 3.5f, f14, f14, 3.5f, f27);
            rb.a aVar4 = aVar;
            float f35 = a13.e;
            float f36 = a13.i;
            float f37 = f35 * f36;
            float f38 = a13.f;
            float f39 = a13.h;
            float f40 = f37 - (f38 * f39);
            float f41 = a13.g;
            float f42 = f38 * f41;
            float f43 = a13.d;
            float f44 = f42 - (f43 * f36);
            float f45 = (f43 * f39) - (f35 * f41);
            float f46 = a13.c;
            float f47 = f46 * f39;
            float f48 = a13.b;
            float f49 = f47 - (f48 * f36);
            float f50 = a13.a;
            float f51 = (f36 * f50) - (f46 * f41);
            float f52 = (f41 * f48) - (f39 * f50);
            float f53 = (f48 * f38) - (f46 * f35);
            float f54 = (f46 * f43) - (f38 * f50);
            float f55 = (f50 * f35) - (f48 * f43);
            mb.g a14 = mb.g.a(f29, f30, f31, f32, f12, f28, f33, f34);
            float f56 = a14.a;
            float f57 = a14.d;
            float f58 = a14.g;
            float f59 = (f58 * f53) + (f57 * f49) + (f56 * f40);
            float f60 = (f58 * f54) + (f57 * f51) + (f56 * f44);
            float f61 = (f58 * f55) + (f57 * f52) + (f56 * f45);
            float f62 = a14.b;
            float f63 = a14.e;
            float f64 = a14.h;
            float f65 = (f64 * f53) + (f63 * f49) + (f62 * f40);
            float f66 = (f64 * f54) + (f63 * f51) + (f62 * f44);
            float f67 = (f64 * f55) + (f63 * f52) + (f62 * f45);
            float f68 = a14.c;
            float f69 = a14.f;
            float f70 = a14.i;
            float f71 = (f53 * f70) + (f49 * f69) + (f40 * f68);
            float f72 = (f54 * f70) + (f51 * f69) + (f44 * f68);
            float f73 = (f70 * f55) + (f69 * f52) + (f68 * f45);
            if (i36 <= 0 || i36 <= 0) {
                throw lb.e.a();
            }
            mb.b bVar4 = new mb.b(i36, i36);
            int i39 = i36 * 2;
            rb.c cVar10 = cVar;
            float[] fArr = new float[i39];
            int i40 = 0;
            while (i40 < i36) {
                int i41 = i36;
                float f74 = i40 + 0.5f;
                int i42 = 0;
                while (i42 < i39) {
                    int i43 = i42;
                    fArr[i43] = (i43 / 2) + 0.5f;
                    fArr[i43 + 1] = f74;
                    i42 = i43 + 2;
                }
                int i44 = i39 - 1;
                int i45 = i40;
                int i46 = 0;
                while (i46 < i44) {
                    float f75 = fArr[i46];
                    int i47 = i46 + 1;
                    int i48 = i46;
                    float f76 = fArr[i47];
                    rb.c cVar11 = cVar2;
                    float d11 = com.google.android.recaptcha.internal.a.d(f72, f76, f71 * f75, f73);
                    fArr[i48] = (((f60 * f76) + (f59 * f75)) + f61) / d11;
                    fArr[i47] = (((f76 * f66) + (f75 * f65)) + f67) / d11;
                    i46 = i48 + 2;
                    cVar2 = cVar11;
                }
                rb.c cVar12 = cVar2;
                int i49 = n10.b;
                float f77 = f72;
                int i50 = 0;
                boolean z14 = true;
                while (i50 < i44 && z14) {
                    int i51 = (int) fArr[i50];
                    int i52 = i50 + 1;
                    int i53 = i44;
                    int i54 = (int) fArr[i52];
                    int i55 = i50;
                    if (i51 < -1 || i51 > i18 || i54 < -1 || i54 > i49) {
                        throw lb.e.a();
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
                        throw lb.e.a();
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
                        if (n10.b((int) fArr[i61], (int) fArr[i61 + 1])) {
                            int i62 = i61 / 2;
                            int i63 = (i62 / 32) + (bVar4.c * i45);
                            int[] iArr3 = bVar4.d;
                            iArr3[i63] = iArr3[i63] | (1 << (i62 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw lb.e.a();
                    }
                }
                i40 = i45 + 1;
                i36 = i41;
                f72 = f77;
                cVar2 = cVar12;
            }
            rb.c cVar13 = cVar2;
            if (aVar4 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new lb.j[]{cVar13, cVar10, cVar3};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new lb.j[]{cVar13, cVar10, cVar3, aVar4};
            }
            lb.j[] jVarArr2 = jVarArr;
            bVar3.getClass();
            com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
            int i64 = bVar4.b;
            int i65 = 21;
            if (i64 < 21 || (i64 & i11) != i10) {
                throw lb.c.a();
            }
            lVar.b = bVar4;
            try {
                dVar = bVar3.b(lVar);
            } catch (lb.a e12) {
                aVar2 = e12;
                e = null;
                try {
                    lVar.p();
                    lVar.c = null;
                    lVar.d = null;
                    lVar.a = true;
                    lVar.o();
                    lVar.n();
                    bVar2 = (mb.b) lVar.b;
                    i12 = 0;
                    while (i12 < bVar2.a) {
                        int i66 = i12 + 1;
                        for (int i67 = i66; i67 < bVar2.b; i67++) {
                            if (bVar2.b(i12, i67) != bVar2.b(i67, i12)) {
                                bVar2.a(i67, i12);
                                bVar2.a(i12, i67);
                            }
                        }
                        i12 = i66;
                    }
                    mb.d b10 = bVar3.b(lVar);
                    b10.e = new w9.d(i65);
                    dVar = b10;
                    i13 = dVar.f;
                    if (com.google.android.recaptcha.internal.a.u(dVar.e)) {
                        lb.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    aVar3 = new j9.a(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        aVar3.H(lb.i.d, Integer.valueOf(i14));
                        aVar3.H(lb.i.e, Integer.valueOf(i13));
                    }
                    aVar3.H(lb.i.c, dVar.d);
                    aVar3.H(lb.i.f, "]Q" + dVar.h);
                    return aVar3;
                } catch (lb.a | lb.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (lb.c e13) {
                e = e13;
                aVar2 = null;
                lVar.p();
                lVar.c = null;
                lVar.d = null;
                lVar.a = true;
                lVar.o();
                lVar.n();
                bVar2 = (mb.b) lVar.b;
                i12 = 0;
                while (i12 < bVar2.a) {
                }
                mb.d b102 = bVar3.b(lVar);
                b102.e = new w9.d(i65);
                dVar = b102;
                i13 = dVar.f;
                if (com.google.android.recaptcha.internal.a.u(dVar.e)) {
                }
                aVar3 = new j9.a(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                aVar3.H(lb.i.c, dVar.d);
                aVar3.H(lb.i.f, "]Q" + dVar.h);
                return aVar3;
            }
            i13 = dVar.f;
            if (com.google.android.recaptcha.internal.a.u(dVar.e) && jVarArr2.length >= 3) {
                lb.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            aVar3 = new j9.a(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                aVar3.H(lb.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                aVar3.H(lb.i.b, str);
            }
            if (i13 >= 0 && (i14 = dVar.g) >= 0) {
                aVar3.H(lb.i.d, Integer.valueOf(i14));
                aVar3.H(lb.i.e, Integer.valueOf(i13));
            }
            aVar3.H(lb.i.c, dVar.d);
            aVar3.H(lb.i.f, "]Q" + dVar.h);
            return aVar3;
        } catch (IllegalArgumentException unused4) {
            throw lb.c.a();
        }
    }

    @Override // rh.c1
    public /* synthetic */ boolean f1(d1 d1Var) {
        return false;
    }

    @Override // oa.m
    public Object f2() {
        switch (this.a) {
            case 5:
                Class cls = (Class) this.b;
                try {
                    return oa.r.a.a(cls);
                } catch (Exception e9) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e9);
                }
            default:
                throw new ma.j((String) this.b);
        }
    }

    @Override // rh.g0
    public void g(d1 d1Var) {
        switch (this.a) {
            case 18:
                k3 k3Var = ((w0) this.b).O;
                if (k3Var != null) {
                    p3 p3Var = k3Var.a;
                    p3.M1(p3Var, d1Var);
                    p3Var.d3.n0(d1Var, true);
                    break;
                }
                break;
            default:
                w4 w4Var = ((y4) this.b).s;
                if (w4Var != null) {
                    p3 p3Var2 = ((v2) w4Var).a;
                    p3.M1(p3Var2, d1Var);
                    p3Var2.d3.n0(d1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // zf.v1
    public float get() {
        ys0 ys0Var = (ys0) this.b;
        int i10 = ys0Var.L1;
        yf.m currentBrush = ys0Var.S0.getCurrentBrush();
        return currentBrush == null ? r0.e(i10).i : r0.e(i10).f(String.valueOf(yf.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.telegram.ui.Components.pn0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 7:
                return " ";
            default:
                vf.h hVar = (vf.h) this.b;
                float f10 = hVar.b;
                return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f10)) + f10));
        }
    }

    public String h(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            t9.d dVar = (t9.d) this.b;
            t9.e eVar = new t9.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // pf.i1
    public /* synthetic */ a0.h h0() {
        return null;
    }

    @Override // pf.i1
    public void i(int i10) {
        op0 op0Var = (op0) this.b;
        sp0 sp0Var = op0Var.G;
        op0Var.s = i10;
        if (op0Var.v != i10) {
            op0Var.d.clear();
        }
        int i11 = op0Var.F;
        if (op0Var.h() != 0 || op0Var.e.e() || op0Var.E) {
            sp0Var.t0.b(i11);
        } else {
            sp0Var.M.e(false, true);
        }
        op0Var.l();
        int i12 = sp0.W0;
        sp0Var.K0(true);
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ boolean i1(String str, k9 k9Var) {
        return false;
    }

    public void j(int i10, long j10) {
        s3.e eVar = (s3.e) this.b;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw t1.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw t1.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        int i11 = 3;
        switch (i10) {
            case 131:
                eVar.d(i10);
                eVar.u.d = (int) j10;
                return;
            case 136:
                eVar.d(i10);
                eVar.u.V = j10 == 1;
                return;
            case 155:
                eVar.I = eVar.k(j10);
                return;
            case 159:
                eVar.d(i10);
                eVar.u.O = (int) j10;
                return;
            case 176:
                eVar.d(i10);
                eVar.u.m = (int) j10;
                return;
            case 179:
                eVar.a(i10);
                eVar.C.c(eVar.k(j10));
                return;
            case 186:
                eVar.d(i10);
                eVar.u.n = (int) j10;
                return;
            case 215:
                eVar.d(i10);
                eVar.u.c = (int) j10;
                return;
            case 231:
                eVar.B = eVar.k(j10);
                return;
            case 238:
                eVar.P = (int) j10;
                return;
            case 241:
                if (eVar.E) {
                    return;
                }
                eVar.a(i10);
                eVar.D.c(j10);
                eVar.E = true;
                return;
            case 251:
                eVar.Q = true;
                return;
            case 16871:
                eVar.d(i10);
                eVar.u.g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw t1.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw t1.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw t1.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw t1.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw t1.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                eVar.x = j10 + eVar.q;
                return;
            case 21432:
                int i12 = (int) j10;
                eVar.d(i10);
                if (i12 == 0) {
                    eVar.u.w = 0;
                    return;
                }
                if (i12 == 1) {
                    eVar.u.w = 2;
                    return;
                } else if (i12 == 3) {
                    eVar.u.w = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    eVar.u.w = 3;
                    return;
                }
            case 21680:
                eVar.d(i10);
                eVar.u.o = (int) j10;
                return;
            case 21682:
                eVar.d(i10);
                eVar.u.q = (int) j10;
                return;
            case 21690:
                eVar.d(i10);
                eVar.u.p = (int) j10;
                return;
            case 21930:
                eVar.d(i10);
                eVar.u.U = j10 == 1;
                return;
            case 21998:
                eVar.d(i10);
                eVar.u.f = (int) j10;
                return;
            case 22186:
                eVar.d(i10);
                eVar.u.R = j10;
                return;
            case 22203:
                eVar.d(i10);
                eVar.u.S = j10;
                return;
            case 25188:
                eVar.d(i10);
                eVar.u.P = (int) j10;
                return;
            case 30114:
                eVar.R = j10;
                return;
            case 30321:
                eVar.d(i10);
                int i13 = (int) j10;
                if (i13 == 0) {
                    eVar.u.r = 0;
                    return;
                }
                if (i13 == 1) {
                    eVar.u.r = 1;
                    return;
                } else if (i13 == 2) {
                    eVar.u.r = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    eVar.u.r = 3;
                    return;
                }
            case 2352003:
                eVar.d(i10);
                eVar.u.e = (int) j10;
                return;
            case 2807729:
                eVar.r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        eVar.d(i10);
                        int i14 = (int) j10;
                        if (i14 == 1) {
                            eVar.u.A = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            eVar.u.A = 1;
                            return;
                        }
                    case 21946:
                        eVar.d(i10);
                        int i15 = (int) j10;
                        String str = e5.b.f;
                        if (i15 != 1) {
                            if (i15 == 16) {
                                i11 = 6;
                            } else if (i15 == 18) {
                                i11 = 7;
                            } else if (i15 != 6 && i15 != 7) {
                                i11 = -1;
                            }
                        }
                        if (i11 != -1) {
                            eVar.u.z = i11;
                            return;
                        }
                        return;
                    case 21947:
                        eVar.d(i10);
                        eVar.u.x = true;
                        int a2 = e5.b.a((int) j10);
                        if (a2 != -1) {
                            eVar.u.y = a2;
                            return;
                        }
                        return;
                    case 21948:
                        eVar.d(i10);
                        eVar.u.B = (int) j10;
                        return;
                    case 21949:
                        eVar.d(i10);
                        eVar.u.C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // uf.m
    public void k() {
        fe0 fe0Var = ((ge0) this.b).a;
        if (fe0Var != null) {
            ((rr0) fe0Var).a.a0.invalidate();
        }
    }

    @Override // ud.d
    public void l1() {
        ((d9) this.b).a.invalidate();
    }

    @Override // rh.g0
    public void m() {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            p3.P1(k3Var.a, w0Var.a);
        }
    }

    @Override // rh.c1
    public /* synthetic */ boolean n() {
        return false;
    }

    @Override // rh.c1
    public /* synthetic */ boolean o0(d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.s9
    public void onDismiss() {
        z0 z0Var = (z0) this.b;
        z0Var.v("scan_qr_popup_closed", null);
        z0Var.d0 = false;
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onStateChanged(boolean z10, int i10) {
        xj0 xj0Var = (xj0) this.b;
        if (z10 && xj0Var.n.o() >= 0) {
            xj0Var.w = true;
        }
        tf0 tf0Var = xj0Var.f;
        mb0 mb0Var = xj0Var.x;
        tf0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(mb0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(mb0Var, 16L);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((n5.a) this.b).getClass();
        i5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public Object p() {
        if (y6.a.b == null) {
            y6.a.b = new com.google.firebase.messaging.s();
        }
        synchronized (y6.a.a) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // uf.m
    public void q(boolean z10) {
        ((ge0) this.b).c.setAspectLock(z10);
    }

    @Override // rh.g0
    public i9 q0() {
        return (w0) this.b;
    }

    @Override // org.telegram.ui.Components.pn0
    public void r() {
        int i10 = this.a;
    }

    @Override // rh.c1
    public void r1(Editable editable) {
        ((y4) this.b).h();
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ boolean s() {
        return false;
    }

    public void t() {
        o5.h hVar = (o5.h) this.b;
        Iterator it = hVar.h.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        Iterator it2 = hVar.i.iterator();
        while (it2.hasNext()) {
            ((o5.g) it2.next()).a();
        }
    }

    @Override // rh.g0
    public rh.a u0() {
        return ((w0) this.b).a;
    }

    @Override // rh.g0
    public boolean w0() {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var == null) {
            return false;
        }
        rh.a aVar = w0Var.a;
        return k3Var.a.S4();
    }

    @Override // rh.c1
    public void w1(d1 d1Var) {
        rh.a aVar;
        y4 y4Var = (y4) this.b;
        w4 w4Var = y4Var.s;
        if (w4Var == null || (aVar = y4Var.a) == null) {
            return;
        }
        p3 p3Var = ((v2) w4Var).a;
        ArrayList arrayList = p3Var.h3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((rh.a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        rh.a aVar2 = new rh.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a9.p.s(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        p3Var.s4();
        p3Var.U2.N(false);
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        p3Var.post(new i2(p3Var, aVar2, 26));
    }

    @Override // org.telegram.ui.Components.ei
    public void y(sg sgVar) {
        int i10;
        i10 = ((n2) ((qf.m) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(sgVar);
    }

    @Override // rh.g0
    public void y0(int i10, int i11) {
        w0 w0Var = (w0) this.b;
        k3 k3Var = w0Var.O;
        if (k3Var != null) {
            rh.a aVar = w0Var.a;
            b2 b2Var = k3Var.a.F3;
            if (b2Var != null) {
                b2Var.f(i10, i11);
            }
        }
    }

    @Override // org.telegram.ui.s9
    public String z0() {
        return ((z0) this.b).e0;
    }

    public b0(i6.a aVar) {
        this.a = 23;
        y5.l.h(aVar);
        this.b = aVar;
    }

    @Override // org.telegram.ui.Components.j61
    public void onRenderedFirstFrame() {
    }

    public b0(int i10) {
        this.a = i10;
        switch (i10) {
            case 14:
                this.b = new o0.b(13);
                break;
            case 17:
                break;
            default:
                this.b = new o4.d(5, 1.0f, false);
                break;
        }
    }

    public b0(TextView textView) {
        this.a = 15;
        this.b = new q1.g(textView);
    }

    public b0(Context context, Uri uri) {
        this.a = 2;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void l() {
    }

    private final void o() {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void F() {
    }

    @Override // ud.d
    public /* synthetic */ void K() {
    }

    @Override // rh.c1
    public /* synthetic */ void K0() {
    }

    @Override // ud.d
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void w() {
    }

    @Override // ud.d
    public /* synthetic */ void A(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void I(Object obj) {
    }

    @Override // org.telegram.ui.s9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // pf.i1
    public /* synthetic */ void V0(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void g0(TLRPC.User user) {
    }

    @Override // rh.c1
    public /* synthetic */ void g1(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // rh.c1
    public /* synthetic */ void B(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onError(m61 m61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }

    @Override // org.telegram.ui.Components.ei
    public /* synthetic */ void P0(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override // org.telegram.ui.Components.ei
    public void n0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
