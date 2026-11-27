// default package

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.cast.CastDevice;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public class lh2 implements caa, ty9, xj0, cf7, ni9, f73, l71, vt3, iy7 {
    public static volatile lh2 d;
    public static final int[] e = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public static final sae f = new sae();
    public static final Object h = new Object();
    public static int n;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public lh2(byte b) {
        this.a = b;
        byte b2 = 10;
        switch (b) {
            case 3:
                this.b = new SparseIntArray();
                this.c = new SparseIntArray();
                break;
            case 11:
                this.b = new zm9((byte) 10);
                this.c = new SparseIntArray();
                break;
            case 14:
                break;
            case 26:
                this.b = new HashMap();
                this.c = pk2.b;
                break;
            default:
                id1 c = id1.c(a.b);
                c22 c22Var = new c22(b2);
                c.getClass();
                xve.e("Must be called from the main thread.");
                baa baaVar = c.c;
                baaVar.getClass();
                try {
                    gfd gfdVar = baaVar.a;
                    kad kadVar = new kad(c22Var);
                    Parcel R = gfdVar.R();
                    ald.d(R, kadVar);
                    gfdVar.V(R, 4);
                } catch (RemoteException e2) {
                    baa.c.a(e2, "Unable to call %s on %s.", "addCastStateListener", gfd.class.getSimpleName());
                }
                this.b = new rx6((byte) 23);
                baa b3 = c.b();
                this.c = b3;
                b3.a(this);
                W(b3.c());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static lh2 e(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e2) {
                e = e2;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e3) {
            e = e3;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new lh2(fileChannel, fileLock, (byte) 19);
        } catch (IOException e4) {
            e = e4;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e5) {
            e = e5;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e6) {
            e = e6;
            Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public static pk2 k(pk2 pk2Var, List list) {
        pk2Var.getClass();
        Map map = pk2Var.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new pk2(hashMap);
    }

    public static lh2 t() {
        lh2 lh2Var;
        lh2 lh2Var2 = d;
        if (lh2Var2 != null) {
            return lh2Var2;
        }
        synchronized (lh2.class) {
            lh2Var = d;
            if (lh2Var == null) {
                lh2Var = new lh2((byte) 0);
                d = lh2Var;
            }
        }
        return lh2Var;
    }

    @Override // cf7
    public final void A(boolean z) {
        g81 g81Var = ((e81) this.c).b;
        g81Var.y.finishFragment();
        zu1 zu1Var = (zu1) this.b;
        j81 j81Var = g81Var.y;
        zu1Var.k6(j81Var.Q, j81Var.R + 86400, z);
    }

    @Override // caa
    public final void B(v8a v8aVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((md1) v8aVar).a());
    }

    @Override // caa
    public final void C(v8a v8aVar, boolean z) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((md1) v8aVar).a() + " " + z);
    }

    @Override // caa
    public final void D(v8a v8aVar, int i) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((md1) v8aVar).a() + " " + i);
    }

    @Override // ni9
    public final void E(int i) {
        v72 v72Var = (v72) this.c;
        v72Var.b.I1(v72Var, i);
        v72Var.e0();
        v72Var.Z();
    }

    public final void F(g9 g9Var) {
        u8a u8aVar = (u8a) this.b;
        ((ActionMode.Callback) u8aVar.a).onDestroyActionMode(u8aVar.q(g9Var));
        cp cpVar = (cp) this.c;
        if (cpVar.F != null) {
            cpVar.f.getDecorView().removeCallbacks(cpVar.G);
        }
        if (cpVar.E != null) {
            zic zicVar = cpVar.H;
            if (zicVar != null) {
                zicVar.b();
            }
            zic a = ihc.a(cpVar.E);
            a.a(0.0f);
            cpVar.H = a;
            a.d(new so(this, (byte) 2));
        }
        cpVar.y = null;
        ViewGroup viewGroup = cpVar.K;
        WeakHashMap weakHashMap = ihc.a;
        ygc.c(viewGroup);
        cpVar.w();
    }

    public final void G(long j, File file) {
        synchronized (((v20) this.c).c) {
            ((v20) this.c).d.put(Long.valueOf(j), file);
        }
    }

    public final void H(pk2 pk2Var) {
        for (Map.Entry entry : new HashMap((HashMap) this.b).entrySet()) {
            if (entry.getKey() != null) {
                grb.o();
                return;
            } else {
                List list = (List) entry.getValue();
                if (!k(pk2Var, list).equals(k((pk2) this.c, list))) {
                    throw null;
                }
            }
        }
        this.c = pk2Var;
    }

    @Override // iy7
    public final Object I(Uri uri, l73 l73Var) {
        gg4 gg4Var = (gg4) ((iy7) this.b).I(uri, l73Var);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? gg4Var : (gg4) gg4Var.a(list);
    }

    @Override // caa
    public final void J(v8a v8aVar, int i) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((md1) v8aVar).a() + " " + i);
    }

    @Override // ni9
    public final void K(oi9 oi9Var, View view) {
        v72 v72Var = (v72) this.c;
        fu5 fu5Var = new fu5(v72Var, (vnb) this.b, view, false, false, true);
        fu5Var.W = true;
        e eVar = v72Var.b.Z1;
        v72Var.getContext();
        v72Var.I = cj9.b(fu5Var, eVar, oi9Var, true);
    }

    @Override // ni9
    public final void L() {
        ui9 ui9Var = ((v72) this.c).s;
        if (ui9Var != null) {
            ui9Var.e(false, true);
            int i = ui9Var.c0;
            ui9Var.g(i != 2 ? i : 0, true);
        }
    }

    public final boolean M(g9 g9Var, f27 f27Var) {
        ViewGroup viewGroup = ((cp) this.c).K;
        WeakHashMap weakHashMap = ihc.a;
        ygc.c(viewGroup);
        u8a u8aVar = (u8a) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) u8aVar.a;
        pfb q = u8aVar.q(g9Var);
        vla vlaVar = (vla) u8aVar.d;
        Menu menu = (Menu) vlaVar.get(f27Var);
        if (menu == null) {
            menu = new d37((Context) u8aVar.b, f27Var);
            vlaVar.put(f27Var, menu);
        }
        return callback.onPrepareActionMode(q, menu);
    }

    @Override // caa
    public final void N(v8a v8aVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((md1) v8aVar).a() + " " + str);
    }

    @Override // ni9
    public final fu5 O(View view) {
        v72 v72Var = (v72) this.c;
        fu5 fu5Var = new fu5(v72Var, (vnb) this.b, view, false, false, true);
        v72Var.I = fu5Var;
        return fu5Var;
    }

    @Override // caa
    public final void P(v8a v8aVar, String str) {
        md1 md1Var = (md1) v8aVar;
        Log.d("CAST_SESSION", "onSessionStarted " + md1Var.a() + " " + str);
        W(md1Var);
    }

    public final void Q() {
        try {
            ((FileLock) this.c).release();
            ((FileChannel) this.b).close();
        } catch (IOException e2) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e2);
        }
    }

    @Override // ni9
    public final void R() {
        v72 v72Var = (v72) this.c;
        v72Var.b0();
        v72Var.c0();
    }

    @Override // ni9
    public final void S(mi9 mi9Var, View view) {
        v72 v72Var = (v72) this.c;
        fu5 fu5Var = new fu5(v72Var, (vnb) this.b, view, false, false, true);
        fu5Var.W = true;
        v72Var.I = cj9.c(fu5Var, v72Var.b.Z1, v72Var.getContext(), (vnb) this.b, mi9Var, true);
    }

    public final void T(qh2 qh2Var) {
        nh2 nh2Var;
        qh2 qh2Var2;
        Log.d("CAST_CONTROLLER", "set current media");
        rx6 rx6Var = (rx6) this.b;
        qh2 qh2Var3 = (qh2) rx6Var.c;
        if (go.w()) {
            if (qh2Var3 != null) {
                ArrayList arrayList = qh2Var3.a;
                if (qh2Var != null && arrayList.size() == qh2Var.a.size()) {
                    for (int i = 0; i < arrayList.size(); i++) {
                        ph2 h2 = qh2Var3.h(i);
                        ph2 h3 = qh2Var.h(i);
                        if (h2 == null) {
                            if (h3 == null) {
                            }
                        } else if (h3 != null && Objects.equals(h2.a, h3.a) && Objects.equals(h2.b, h3.b) && Objects.equals(h2.c, h3.c) && h2.d.equals(h3.d) && h2.e == h3.e && h2.f == h3.f) {
                        }
                    }
                    return;
                }
            } else if (qh2Var == null) {
                return;
            }
        }
        if (((kh2) rx6Var.d) != null && qh2Var != null) {
            rx6Var.q(qh2Var);
        }
        if (((kh2) rx6Var.d) != null && (qh2Var2 = (qh2) rx6Var.c) != null) {
            rx6Var.l0(qh2Var2);
        }
        if (qh2Var != null && qh2Var.a.size() > 0 && !qh2Var.h(0).a.startsWith("audio/") && (nh2Var = (nh2) rx6Var.b) != null) {
            nh2Var.k(null, null);
        }
        kh2 kh2Var = (kh2) rx6Var.d;
        if (kh2Var != null && qh2Var != null) {
            kh2Var.d = qh2Var;
            kh2Var.g = 0;
            kh2Var.h = 0;
            kh2Var.p();
        }
        rx6Var.c = qh2Var;
    }

    public final Drawable U(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.c) == null) {
                this.c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = U(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    public final x1c V(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = (int[]) this.b;
            if (i2 >= iArr.length) {
                efd.c("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new po3();
            }
            if (i == iArr[i2]) {
                return ((ys9[]) this.c)[i2];
            }
            i2++;
        }
    }

    public final void W(md1 md1Var) {
        rx6 rx6Var = (rx6) this.b;
        if (md1Var != null) {
            xve.e("Must be called from the main thread.");
            v99 v99Var = md1Var.j;
            String a = md1Var.a();
            if (TextUtils.isEmpty(a) || v99Var == null) {
                return;
            }
            kh2 kh2Var = (kh2) rx6Var.d;
            if (kh2Var == null || !TextUtils.equals(kh2Var.c.a(), a)) {
                rx6Var.q0(new kh2(md1Var, (baa) this.c, v99Var));
                xve.e("Must be called from the main thread.");
                CastDevice castDevice = md1Var.k;
                String str = castDevice != null ? castDevice.d : null;
                PhotoViewer q0 = PhotoViewer.q0();
                nh2.h();
                if (q0.F == null || q0.f0 == null || !q0.V0()) {
                    return;
                }
                new d31(q0.f0, new x53()).Q(org.telegram.messenger.beta.R.raw.forward, 36, !TextUtils.isEmpty(str) ? ob6.a0(null, null, 2131752067, str) : ob6.M0(2131752068, null)).j();
            }
        }
    }

    @Override // xj0
    public final x76 X(nt6 nt6Var) {
        Uri uri;
        byte[] bArr;
        rx6 rx6Var = (rx6) this.c;
        if (rx6Var != null && (((uri = (Uri) rx6Var.c) != null && uri.equals(nt6Var.n)) || ((bArr = (byte[]) rx6Var.b) != null && Arrays.equals(bArr, nt6Var.k)))) {
            x76 x76Var = (x76) ((rx6) this.c).d;
            x76Var.getClass();
            return x76Var;
        }
        x76 X = ((xj0) this.b).X(nt6Var);
        if (X == null) {
            return null;
        }
        this.c = new rx6(nt6Var, X);
        return X;
    }

    public final int Y(int i) {
        synchronized (h) {
            int i2 = ((SparseIntArray) this.b).get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            int i3 = n;
            n = i3 + 1;
            ((SparseIntArray) this.b).append(i, i3);
            ((SparseIntArray) this.c).append(i3, i);
            return i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[RETURN] */
    @Override // ni9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(float f2) {
        boolean z;
        ui9 ui9Var = ((v72) this.c).s;
        if (ui9Var != null) {
            FrameLayout frameLayout = ui9Var.I;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f2 >= r3[1]) {
                    z = true;
                    ui9Var.e(z, true);
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            ui9Var.e(z, true);
            if (!z) {
            }
        }
        return false;
    }

    @Override // ni9
    public final void b(km9 km9Var, String str) {
        v72 v72Var = (v72) this.c;
        xq2 xq2Var = v72Var.w;
        if (xq2Var == null) {
            vnb vnbVar = (vnb) this.b;
            xq2Var = new xq2(new q72((Object) this, (Object) vnbVar, (byte) 0), vnbVar);
            v72Var.w = xq2Var;
        }
        xq2Var.z(km9Var, str);
    }

    @Override // xj0
    public final x76 b0(byte[] bArr) {
        byte[] bArr2;
        rx6 rx6Var = (rx6) this.c;
        if (rx6Var == null || (bArr2 = (byte[]) rx6Var.b) == null || !Arrays.equals(bArr2, bArr)) {
            x76 b0 = ((xj0) this.b).b0(bArr);
            this.c = new rx6(bArr, b0);
            return b0;
        }
        x76 x76Var = (x76) ((rx6) this.c).d;
        x76Var.getClass();
        return x76Var;
    }

    @Override // vt3
    public final void c() {
        ((ot3) this.c).b(((xt3) this.b).getText());
    }

    @Override // f73
    public final h73 createDataSource() {
        return new qa3((Context) this.b, ((vh4) this.c).createDataSource());
    }

    @Override // ni9
    public final void d(int i) {
        ((v72) this.c).S(74, i);
    }

    @Override // l71
    public final void dismiss() {
        ((df3) this.c).dismiss();
    }

    @Override // ni9
    public final void f() {
        v72 v72Var = (v72) this.c;
        pi9 pi9Var = v72Var.r;
        ui9 ui9Var = v72Var.s;
        if (ui9Var != null) {
            di9 di9Var = pi9Var.v3;
            int i = (di9Var != null && di9Var.w() && pi9Var.F4()) ? 1 : 0;
            if (ui9Var.b0 == 2) {
                ui9Var.c0 = i;
            } else {
                ui9Var.g(i, true);
            }
            if (i != 0) {
                v72Var.a0();
            }
        }
        v72Var.d0();
    }

    @Override // l71
    public final void g(t61 t61Var, c71 c71Var, boolean z) {
        df3 df3Var = (df3) this.c;
        cf3 cf3Var = df3Var.S1;
        if (c71Var != null) {
            ((d71) this.b).i(c71Var);
            df3Var.Z1.e();
            d71 d71Var = df3Var.b2;
            j35[] j35VarArr = df3Var.W1;
            sg2[] sg2VarArr = df3Var.X1;
            sg2 sg2Var = sg2VarArr[0];
            if (sg2Var != null) {
                j35 j35Var = j35VarArr[0];
                boolean z2 = d71Var.m;
                j35Var.b = z2;
                sg2Var.c(z2, true);
            }
            sg2 sg2Var2 = sg2VarArr[1];
            if (sg2Var2 != null) {
                j35 j35Var2 = j35VarArr[1];
                boolean z3 = d71Var.n;
                j35Var2.b = z3;
                sg2Var2.c(z3, true);
            }
            sg2 sg2Var3 = sg2VarArr[2];
            if (sg2Var3 != null) {
                j35 j35Var3 = j35VarArr[2];
                boolean z4 = d71Var.o;
                j35Var3.b = z4;
                sg2Var3.c(z4, true);
            }
            sg2 sg2Var4 = sg2VarArr[3];
            if (sg2Var4 != null) {
                j35 j35Var4 = j35VarArr[3];
                boolean z5 = d71Var.p;
                j35Var4.b = z5;
                sg2Var4.c(z5, true);
            }
            sg2 sg2Var5 = sg2VarArr[4];
            if (sg2Var5 != null) {
                j35 j35Var5 = j35VarArr[4];
                boolean z6 = d71Var.q;
                j35Var5.b = z6;
                sg2Var5.c(z6, true);
            }
            df3Var.V1.a(cf3Var.d(), true);
            cf3Var.c(true);
        }
    }

    @Override // ty9
    public final CharSequence getContentDescription() {
        return null;
    }

    @Override // ni9
    public final void h() {
        ui9 ui9Var = ((v72) this.c).s;
        if (ui9Var != null) {
            int i = ui9Var.b0;
            if (i == 2) {
                i = 0;
            }
            ui9Var.c0 = i;
            ui9Var.e(false, false);
            ui9Var.g(2, true);
        }
    }

    public final void i() {
        String str = (String) this.b;
        try {
            new File((File) ((gd4) this.c).c, str).createNewFile();
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e2);
        }
    }

    @Override // ty9
    public final int i0() {
        return 0;
    }

    @Override // ni9
    public final void j(dg9 dg9Var, boolean z) {
        ((v72) this.c).b.d1(dg9Var, z);
    }

    public final void l(p93 p93Var) {
        synchronized (p93Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new l30(this, p93Var, (byte) 0));
        }
    }

    @Override // caa
    public final void m(v8a v8aVar, int i) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((md1) v8aVar).a() + " " + i);
        ((rx6) this.b).q0(null);
    }

    @Override // caa
    public final void n(v8a v8aVar) {
        md1 md1Var = (md1) v8aVar;
        Log.d("CAST_SESSION", "onSessionStarting " + md1Var.a());
        W(md1Var);
    }

    @Override // ty9
    public final void o(boolean z, float f2) {
        ((TextView) this.b).setText("Alpha " + yk0.o1);
        yk0.o1 = f2;
        ((yk0) this.c).l1.K();
    }

    @Override // ni9
    public final void onContentChanged() {
        v72 v72Var = (v72) this.c;
        ui9 ui9Var = v72Var.s;
        if (ui9Var != null) {
            ui9Var.setSendLoading(v72Var.r.j3());
        }
        v72Var.Y(true);
        v72Var.c0();
        k72 k72Var = v72Var.Q;
        hl.r(k72Var);
        hl.d3(k72Var, 1000L);
    }

    @Override // caa
    public final void p(v8a v8aVar, int i) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((md1) v8aVar).a() + " " + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public final ArrayList q() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        ri6 ri6Var = (ri6) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) ri6Var.b;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new sq2((String) it.next(), (byte) 0));
        }
        return arrayList2;
    }

    public final vi7 r(int i, long j, boolean z) {
        zm9 zm9Var = (zm9) this.b;
        if (i > 0) {
            i = ((SparseIntArray) this.c).get(i, 0);
        }
        if (i == 0) {
            return null;
        }
        long j2 = i;
        LongSparseArray H0 = zm9Var.H0(j, 0L);
        vi7 vi7Var = (vi7) (H0 != null ? H0.get(j2) : null);
        if (vi7Var != null || !z) {
            return vi7Var;
        }
        vi7 vi7Var2 = new vi7();
        zm9Var.N0(j, 0L, j2, vi7Var2);
        return vi7Var2;
    }

    public final e84 s(Object... objArr) {
        Constructor a;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    try {
                        a = ((da3) this.b).a();
                    } catch (Exception e2) {
                        throw new RuntimeException("Error instantiating extension", e2);
                    }
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (e84) a.newInstance(objArr);
        } catch (Exception e3) {
            su3.f("Unexpected error creating extractor", e3);
            return null;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 9:
                try {
                    rj0 rj0Var = (rj0) this.c;
                    if (rj0Var == null) {
                        rj0Var = ((rx6) this.b).I();
                        this.c = rj0Var;
                    }
                    return rj0Var.toString();
                } catch (tm7 unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override // ni9
    public final void u() {
        v72 v72Var = (v72) this.c;
        if (v72Var.getCurrentItemTop() != v72Var.J) {
            v72Var.b.I1(v72Var, 0);
        }
        v72Var.e0();
        v72Var.Z();
    }

    public final boolean w() {
        return ((kh2) ((rx6) this.b).d) != null;
    }

    @Override // ni9
    public final void y(mk0 mk0Var) {
        v72 v72Var = (v72) this.c;
        n12 n12Var = v72Var.b;
        e eVar = n12Var.Z1;
        if (eVar == null || mk0Var == null || !(mk0Var.b instanceof TL_iv.pageBlockMap) || !hl.H1(eVar)) {
            return;
        }
        n12 n12Var2 = new n12(v72Var.getContext(), n12Var.Z1, false, false, false, null);
        n12Var2.W3 = new sae();
        n12Var2.J1 = true;
        n12Var2.u3.setVisibility(8);
        n12Var2.t4 = new ie((Object) v72Var, (Object) mk0Var, (Object) n12Var2, (byte) 26);
        n12Var2.a1();
        n12Var2.show();
    }

    public void z(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.b;
        ko9 v = ko9.v(absSeekBar.getContext(), attributeSet, e, i);
        Drawable p = v.p(0);
        if (p != null) {
            if (p instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) p;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable U = U(animationDrawable.getFrame(i2), true);
                    U.setLevel(10000);
                    animationDrawable2.addFrame(U, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                p = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(p);
        }
        Drawable p2 = v.p(1);
        if (p2 != null) {
            absSeekBar.setProgressDrawable(U(p2, false));
        }
        v.y();
    }

    @Override // l71
    public final void clear() {
    }

    @Override // l71
    public final void v() {
    }

    @Override // ty9
    public final void x() {
    }

    public /* synthetic */ lh2(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ lh2(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ lh2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public lh2(gd4 gd4Var) {
        this.a = (byte) 2;
        this.b = gd4Var;
        this.c = f;
    }

    public lh2(Context context) {
        this.a = (byte) 21;
        vh4 vh4Var = new vh4((byte) 5);
        this.b = context.getApplicationContext();
        this.c = vh4Var;
    }

    public lh2(String str) {
        this.a = (byte) 27;
        this.c = null;
        this.b = str;
    }

    public lh2(Handler handler, p30 p30Var) {
        this.a = (byte) 7;
        if (p30Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = p30Var;
    }

    public lh2(EditText editText) {
        this.a = (byte) 25;
        this.b = editText;
        bz3 bz3Var = new bz3(editText);
        this.c = bz3Var;
        editText.addTextChangedListener(bz3Var);
        if (kx3.b == null) {
            synchronized (kx3.a) {
                if (kx3.b == null) {
                    kx3 kx3Var = new kx3();
                    try {
                        kx3.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, kx3.class.getClassLoader());
                    } catch (Throwable unused) {
                    }
                    kx3.b = kx3Var;
                }
            }
        }
        editText.setEditableFactory(kx3.b);
    }

    public lh2(da3 da3Var) {
        this.a = (byte) 22;
        this.b = da3Var;
        this.c = new AtomicBoolean(false);
    }
}
