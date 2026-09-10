package m;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.Rating;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f9;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.df0;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fc1;
import org.telegram.ui.l9;
import org.telegram.ui.ss0;
import org.telegram.ui.t9;
import org.telegram.ui.zt0;
import v7.f5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class g3 implements l.j, o0.a, no0, le.f, kg.o, zg.g, t9, pg.v1, r2.k, com.google.android.gms.common.api.internal.o, s4.h1, com.google.android.gms.common.api.internal.s, androidx.lifecycle.s0, w2.d, Continuation {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ g3(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // kg.o
    public void A() {
        cf0 cf0Var = ((df0) this.b).a;
        if (cf0Var != null) {
            ((ss0) cf0Var).a.e0.invalidate();
        }
    }

    @Override // l.j
    public boolean B(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 C(Class cls, v1.b bVar) {
        androidx.lifecycle.m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new androidx.lifecycle.m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    public void D(String str, n4.i0 i0Var) {
        Rating rating;
        float f7 = i0Var.b;
        int i10 = i0Var.a;
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 3) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Rating"));
        }
        Bundle bundle = (Bundle) this.b;
        if (i0Var.c == null) {
            if (i0Var.b()) {
                switch (i10) {
                    case 1:
                        i0Var.c = Rating.newHeartRating(i10 == 1 && f7 == 1.0f);
                        break;
                    case 2:
                        i0Var.c = Rating.newThumbRating(i10 == 2 && f7 == 1.0f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        i0Var.c = Rating.newStarRating(i10, i0Var.a());
                        break;
                    case 6:
                        if (i10 != 6 || !i0Var.b()) {
                            f7 = -1.0f;
                        }
                        i0Var.c = Rating.newPercentageRating(f7);
                        break;
                    default:
                        rating = null;
                        break;
                }
                bundle.putParcelable(str, rating);
            }
            i0Var.c = Rating.newUnratedRating(i10);
        }
        rating = i0Var.c;
        bundle.putParcelable(str, rating);
    }

    public void E(String str, String str2) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    public void F(CharSequence charSequence, String str) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a CharSequence"));
        }
        ((Bundle) this.b).putCharSequence(str, charSequence);
    }

    @Override // org.telegram.ui.t9
    public void J(String str) {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
        try {
            c1Var.P = System.currentTimeMillis();
            c1Var.y("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    @Override // org.telegram.ui.t9
    public String J0() {
        return ((org.telegram.ui.web.c1) this.b).i0;
    }

    @Override // kg.o
    public void N(boolean z10) {
        ((df0) this.b).c.setAspectLock(z10);
    }

    @Override // pg.v1
    public void V(float f7) {
        zt0 zt0Var = (zt0) this.b;
        og.x0.e(zt0Var.P1).k(String.valueOf(og.m.a.indexOf(zt0Var.W0.getCurrentBrush())), f7);
        og.v1 v1Var = zt0Var.K1;
        v1Var.c = f7;
        zt0Var.s0(v1Var, null);
    }

    @Override // org.telegram.ui.Components.no0
    public void W(float f7, boolean z10) {
        fc1 fc1Var = (fc1) ((org.telegram.ui.Cells.k0) this.b);
        int i10 = (int) (j6.q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        j6.q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = fc1Var.e.e;
            fl0 fl0Var = (fl0) themeActivity.b.K(themeActivity.f0);
            if (fl0Var != null) {
                ((f9) fl0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (j6.q * 100.0f))));
            }
            j6.E(true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 20:
                s6.f fVar = new s6.f(1, (TaskCompletionSource) obj2);
                s6.e eVar = (s6.e) ((s6.h) obj).u();
                s6.a aVar = (s6.a) this.b;
                Parcel I0 = eVar.I0();
                k7.a.d(I0, fVar);
                k7.a.c(I0, aVar);
                I0.writeStrongBinder(null);
                eVar.J0(I0, 2);
                return;
            default:
                v8.e eVar2 = (v8.e) this.b;
                e8.b bVar = (e8.b) obj;
                bVar.getClass();
                e8.a aVar2 = new e8.a(1, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.a;
                    obtain.writeInt(1);
                    eVar2.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th2) {
                        obtain.recycle();
                        throw th2;
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    f5.a(Status.h, Boolean.FALSE, aVar2.b);
                    return;
                }
        }
    }

    @Override // androidx.lifecycle.s0
    public androidx.lifecycle.p0 b(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // r2.k
    public r2.l c(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23 || (i10 < 31 && ((context = (Context) this.b) == null || i10 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new rb.a(20).c(nVar);
        }
        int h = b2.r0.h(((b2.s) nVar.c).r);
        e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + e2.d0.G(h));
        return new n7.a1(14, new r2.b(h, 0), new r2.b(h, 1)).c(nVar);
    }

    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // zg.g
    public void d(Canvas canvas) {
        sq0 sq0Var = (sq0) this.b;
        canvas.drawColor(sq0Var.getThemedColor(j6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            sq0Var.O0.b(canvas, -3);
        }
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ boolean e1(String str, l9 l9Var) {
        return false;
    }

    @Override // s4.h1
    public int f(View view) {
        return s4.o0.z(view) - ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).topMargin;
    }

    @Override // le.f
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // pg.v1
    public float get() {
        zt0 zt0Var = (zt0) this.b;
        int i10 = zt0Var.P1;
        og.m currentBrush = zt0Var.W0.getCurrentBrush();
        return currentBrush == null ? og.x0.e(i10).i : og.x0.e(i10).f(String.valueOf(og.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.telegram.ui.Components.no0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void h(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // le.f
    public /* synthetic */ boolean i(float f7) {
        return false;
    }

    @Override // kg.o
    public void i0(boolean z10) {
        df0 df0Var = (df0) this.b;
        df0Var.getClass();
        cf0 cf0Var = df0Var.a;
        if (cf0Var != null) {
            ((ss0) cf0Var).a(z10);
        }
    }

    public void k(int i10, int i11, c3.p pVar) {
        char c10;
        char c11;
        long j3;
        int i12;
        int i13;
        int i14;
        int i15;
        u3.d dVar = (u3.d) this.b;
        u3.e eVar = dVar.b;
        SparseArray sparseArray = dVar.c;
        e2.v vVar = dVar.k;
        e2.v vVar2 = dVar.i;
        int i16 = 1;
        int i17 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (dVar.J != 2) {
                    return;
                }
                u3.c cVar = (u3.c) sparseArray.get(dVar.P);
                int i18 = dVar.S;
                e2.v vVar3 = dVar.p;
                if (i18 != 4 || !"V_VP9".equals(cVar.c)) {
                    pVar.q(i11);
                    return;
                } else {
                    vVar3.G(i11);
                    pVar.readFully(vVar3.a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                dVar.d(i10);
                u3.c cVar2 = dVar.x;
                int i19 = cVar2.h;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    pVar.q(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                cVar2.P = bArr;
                pVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                dVar.d(i10);
                byte[] bArr2 = new byte[i11];
                dVar.x.j = bArr2;
                pVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                pVar.readFully(bArr3, 0, i11);
                dVar.d(i10);
                dVar.x.k = new c3.g0(1, 0, 0, bArr3);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(vVar.a, (byte) 0);
                pVar.readFully(vVar.a, 4 - i11, i11);
                vVar.J(0);
                dVar.z = (int) vVar.z();
                return;
            }
            if (i10 == 25506) {
                dVar.d(i10);
                byte[] bArr4 = new byte[i11];
                dVar.x.l = bArr4;
                pVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw b2.s0.a(null, "Unexpected id: " + i10);
            }
            dVar.d(i10);
            byte[] bArr5 = new byte[i11];
            dVar.x.x = bArr5;
            pVar.readFully(bArr5, 0, i11);
            return;
        }
        if (dVar.J == 0) {
            dVar.P = (int) eVar.b(pVar, false, true, 8);
            dVar.Q = eVar.c;
            dVar.L = -9223372036854775807L;
            dVar.J = 1;
            vVar2.G(0);
        }
        u3.c cVar3 = (u3.c) sparseArray.get(dVar.P);
        if (cVar3 == null) {
            pVar.q(i11 - dVar.Q);
            dVar.J = 0;
            return;
        }
        cVar3.Z.getClass();
        if (dVar.J == 1) {
            dVar.j(pVar, 3);
            int i20 = (vVar2.a[2] & 6) >> 1;
            byte b10 = 255;
            if (i20 == 0) {
                dVar.N = 1;
                int[] iArr = dVar.O;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.O = iArr;
                iArr[0] = (i11 - dVar.Q) - 3;
            } else {
                dVar.j(pVar, 4);
                int i21 = (vVar2.a[3] & 255) + 1;
                dVar.N = i21;
                int[] iArr2 = dVar.O;
                if (iArr2 == null) {
                    iArr2 = new int[i21];
                } else if (iArr2.length < i21) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i21)];
                }
                dVar.O = iArr2;
                if (i20 == 2) {
                    int i22 = (i11 - dVar.Q) - 4;
                    int i23 = dVar.N;
                    Arrays.fill(iArr2, 0, i23, i22 / i23);
                } else {
                    if (i20 != 1) {
                        if (i20 != 3) {
                            throw b2.s0.a(null, "Unexpected lacing value: " + i20);
                        }
                        int i24 = 0;
                        int i25 = 0;
                        int i26 = 4;
                        while (true) {
                            int i27 = dVar.N - i16;
                            if (i24 >= i27) {
                                c10 = 1;
                                c11 = 0;
                                dVar.O[i27] = ((i11 - dVar.Q) - i26) - i25;
                                break;
                            }
                            dVar.O[i24] = i17;
                            int i28 = i26 + 1;
                            dVar.j(pVar, i28);
                            if (vVar2.a[i26] == 0) {
                                throw b2.s0.a(null, "No valid varint length mask found");
                            }
                            int i29 = 0;
                            while (true) {
                                if (i29 >= 8) {
                                    j3 = 0;
                                    i12 = i28;
                                    break;
                                }
                                int i30 = 1 << (7 - i29);
                                if ((vVar2.a[i26] & i30) != 0) {
                                    i12 = i28 + i29;
                                    dVar.j(pVar, i12);
                                    j3 = vVar2.a[i26] & b10 & (~i30);
                                    while (i28 < i12) {
                                        j3 = (j3 << 8) | (vVar2.a[i28] & b10);
                                        i28++;
                                        b10 = 255;
                                    }
                                    if (i24 > 0) {
                                        j3 -= (1 << ((i29 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i29++;
                                    b10 = 255;
                                }
                            }
                            if (j3 < -2147483648L || j3 > 2147483647L) {
                                break;
                            }
                            int i31 = (int) j3;
                            int[] iArr3 = dVar.O;
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
                        throw b2.s0.a(null, "EBML lacing sample size out of range.");
                    }
                    int i32 = 0;
                    int i33 = 0;
                    int i34 = 4;
                    while (true) {
                        i13 = dVar.N - 1;
                        if (i32 >= i13) {
                            break;
                        }
                        dVar.O[i32] = 0;
                        while (true) {
                            i14 = i34 + 1;
                            dVar.j(pVar, i14);
                            int i35 = vVar2.a[i34] & 255;
                            int[] iArr4 = dVar.O;
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
                    dVar.O[i13] = ((i11 - dVar.Q) - i34) - i33;
                }
            }
            c10 = 1;
            c11 = 0;
            byte[] bArr6 = vVar2.a;
            dVar.K = dVar.l((bArr6[c10] & 255) | (bArr6[c11] << 8)) + dVar.E;
            dVar.R = (cVar3.e == 2 || (i10 == 163 && (vVar2.a[2] & 128) == 128)) ? 1 : 0;
            dVar.J = 2;
            dVar.M = 0;
        }
        if (i10 == 163) {
            while (true) {
                int i36 = dVar.M;
                if (i36 >= dVar.N) {
                    dVar.J = 0;
                    return;
                } else {
                    dVar.e(cVar3, ((dVar.M * cVar3.f) / MediaDataController.MAX_STYLE_RUNS_COUNT) + dVar.K, dVar.R, dVar.n(pVar, cVar3, dVar.O[i36], false), 0);
                    dVar.M++;
                }
            }
        } else {
            while (true) {
                int i37 = dVar.M;
                if (i37 >= dVar.N) {
                    return;
                }
                int[] iArr5 = dVar.O;
                iArr5[i37] = dVar.n(pVar, cVar3, iArr5[i37], true);
                dVar.M++;
            }
        }
    }

    @Override // org.telegram.ui.Components.no0
    public /* synthetic */ int k0() {
        return 0;
    }

    public void l(Runnable runnable) {
        Runnable runnable2 = (Runnable) ((HashMap) this.b).remove(runnable);
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
        }
    }

    @Override // s4.h1
    public int m() {
        return ((s4.o0) this.b).G();
    }

    @Override // kg.o
    public void m0() {
        cf0 cf0Var = ((df0) this.b).a;
        if (cf0Var != null) {
            PhotoViewer photoViewer = ((ss0) cf0Var).a;
            if (photoViewer.c2 == 1) {
                photoViewer.H2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // o0.a
    public Cursor n(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // l.j
    public void o(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.b;
        h hVar = toolbar.a.J;
        if (hVar == null || !hVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.W.c).iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.b0) it.next()).a.t();
            }
        }
    }

    @Override // org.telegram.ui.t9
    public void onDismiss() {
        org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
        c1Var.y("scan_qr_popup_closed", null);
        c1Var.h0 = false;
    }

    public void p() {
        HashMap hashMap = (HashMap) this.b;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.cancelRunOnUIThread((Runnable) ((Map.Entry) it.next()).getValue());
        }
        hashMap.clear();
    }

    @Override // s4.h1
    public int q() {
        s4.o0 o0Var = (s4.o0) this.b;
        return o0Var.n - o0Var.C();
    }

    @Override // s4.h1
    public View r(int i10) {
        return ((s4.o0) this.b).q(i10);
    }

    @Override // s4.h1
    public int s(View view) {
        return s4.o0.v(view) + ((ViewGroup.MarginLayoutParams) ((s4.p0) view.getLayoutParams())).bottomMargin;
    }

    public void t(int i10, long j3) {
        u3.d dVar = (u3.d) this.b;
        if (i10 == 20529) {
            if (j3 == 0) {
                return;
            }
            throw b2.s0.a(null, "ContentEncodingOrder " + j3 + " not supported");
        }
        if (i10 == 20530) {
            if (j3 == 1) {
                return;
            }
            throw b2.s0.a(null, "ContentEncodingScope " + j3 + " not supported");
        }
        switch (i10) {
            case 131:
                dVar.d(i10);
                dVar.x.e = (int) j3;
                return;
            case 136:
                dVar.d(i10);
                dVar.x.X = j3 == 1;
                return;
            case 155:
                dVar.L = dVar.l(j3);
                return;
            case 159:
                dVar.d(i10);
                dVar.x.Q = (int) j3;
                return;
            case 176:
                dVar.d(i10);
                dVar.x.n = (int) j3;
                return;
            case 179:
                dVar.a(i10);
                dVar.F.b(dVar.l(j3));
                return;
            case 186:
                dVar.d(i10);
                dVar.x.o = (int) j3;
                return;
            case 215:
                dVar.d(i10);
                dVar.x.d = (int) j3;
                return;
            case 231:
                dVar.E = dVar.l(j3);
                return;
            case 238:
                dVar.S = (int) j3;
                return;
            case 241:
                if (dVar.H) {
                    return;
                }
                dVar.a(i10);
                dVar.G.b(j3);
                dVar.H = true;
                return;
            case 251:
                dVar.T = true;
                return;
            case 16871:
                dVar.d(i10);
                dVar.x.h = (int) j3;
                return;
            case 16980:
                if (j3 == 3) {
                    return;
                }
                throw b2.s0.a(null, "ContentCompAlgo " + j3 + " not supported");
            case 17029:
                if (j3 < 1 || j3 > 2) {
                    throw b2.s0.a(null, "DocTypeReadVersion " + j3 + " not supported");
                }
                return;
            case 17143:
                if (j3 == 1) {
                    return;
                }
                throw b2.s0.a(null, "EBMLReadVersion " + j3 + " not supported");
            case 18401:
                if (j3 == 5) {
                    return;
                }
                throw b2.s0.a(null, "ContentEncAlgo " + j3 + " not supported");
            case 18408:
                if (j3 == 1) {
                    return;
                }
                throw b2.s0.a(null, "AESSettingsCipherMode " + j3 + " not supported");
            case 21420:
                dVar.A = j3 + dVar.s;
                return;
            case 21432:
                int i11 = (int) j3;
                dVar.d(i10);
                if (i11 == 0) {
                    dVar.x.y = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.x.y = 2;
                    return;
                } else if (i11 == 3) {
                    dVar.x.y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    dVar.x.y = 3;
                    return;
                }
            case 21680:
                dVar.d(i10);
                dVar.x.q = (int) j3;
                return;
            case 21682:
                dVar.d(i10);
                dVar.x.s = (int) j3;
                return;
            case 21690:
                dVar.d(i10);
                dVar.x.r = (int) j3;
                return;
            case 21930:
                dVar.d(i10);
                dVar.x.W = j3 == 1;
                return;
            case 21938:
                dVar.d(i10);
                u3.c cVar = dVar.x;
                cVar.z = true;
                cVar.p = (int) j3;
                return;
            case 21998:
                dVar.d(i10);
                dVar.x.g = (int) j3;
                return;
            case 22186:
                dVar.d(i10);
                dVar.x.T = j3;
                return;
            case 22203:
                dVar.d(i10);
                dVar.x.U = j3;
                return;
            case 25188:
                dVar.d(i10);
                dVar.x.R = (int) j3;
                return;
            case 30114:
                dVar.U = j3;
                return;
            case 30321:
                dVar.d(i10);
                int i12 = (int) j3;
                if (i12 == 0) {
                    dVar.x.t = 0;
                    return;
                }
                if (i12 == 1) {
                    dVar.x.t = 1;
                    return;
                } else if (i12 == 2) {
                    dVar.x.t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    dVar.x.t = 3;
                    return;
                }
            case 2352003:
                dVar.d(i10);
                dVar.x.f = (int) j3;
                return;
            case 2807729:
                dVar.t = j3;
                return;
            default:
                switch (i10) {
                    case 21945:
                        dVar.d(i10);
                        int i13 = (int) j3;
                        if (i13 == 1) {
                            dVar.x.C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            dVar.x.C = 1;
                            return;
                        }
                    case 21946:
                        dVar.d(i10);
                        int g10 = b2.j.g((int) j3);
                        if (g10 != -1) {
                            dVar.x.B = g10;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.d(i10);
                        dVar.x.z = true;
                        int f7 = b2.j.f((int) j3);
                        if (f7 != -1) {
                            dVar.x.A = f7;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.d(i10);
                        dVar.x.D = (int) j3;
                        return;
                    case 21949:
                        dVar.d(i10);
                        dVar.x.E = (int) j3;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    public String toString() {
        switch (this.a) {
            case 12:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            case 17:
                re.b bVar = re.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((qg.m0) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // zg.g
    public void u(g.z zVar) {
        zVar.a(((sq0) this.b).getThemedColor(j6.d6));
        zVar.b(SharedConfig.chatBlurEnabled());
    }

    public void v(za.b0 b0Var) {
        ((l5.q) ((i5.f) ((pa.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new th.e(this, 18)).a(new i5.a(null, b0Var, i5.d.a, null), new j2.h(10));
    }

    public void w(String str, Bitmap bitmap) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 2) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    @Override // le.f
    public void x() {
        ((org.telegram.ui.Components.l9) this.b).a.invalidate();
    }

    public void z(long j3, String str) {
        Integer num = (Integer) n4.m.c.get(str);
        if (num != null && num.intValue() != 0) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.b).putLong(str, j3);
    }

    public /* synthetic */ g3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ g3(s6.g gVar, s6.a aVar) {
        this.a = 20;
        this.b = aVar;
    }

    public g3(v1.c[] initializers) {
        this.a = 22;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.b = initializers;
    }

    public g3(ArrayList arrayList) {
        this.a = 18;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    public g3(TextView textView) {
        this.a = 14;
        this.b = new q1.g(textView);
    }

    public g3(Context context, Uri uri) {
        this.a = 3;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public g3(int i10) {
        this.a = i10;
        switch (i10) {
            case 4:
                this.b = new o2.d(5, 1.0f, false);
                break;
            case 9:
                this.b = new HashMap();
                break;
            case 24:
                this.b = new rb.a(28);
                break;
            case 27:
                this.b = new CopyOnWriteArrayList();
                break;
            case 28:
                this.b = new og.u0[yf.b.values().length];
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    @Override // le.f
    public /* synthetic */ void a() {
    }

    @Override // le.f
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.no0
    public void y() {
    }

    @Override // org.telegram.ui.t9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // le.f
    public /* synthetic */ void e(boolean z10) {
    }
}
