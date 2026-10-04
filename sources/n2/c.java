package n2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;
import gg.b2;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.h1;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x81;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.y50;
import org.telegram.ui.Components.ya0;
import org.telegram.ui.Components.zq0;
import org.telegram.ui.a71;
import pg.u0;
import qg.v1;
import qg.w0;
import s4.c1;
import s4.e0;
import s4.h0;
import s4.p0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes.dex */
public final class c implements o0.b, u71, d5, ya0, a81, b2, e91, com.google.android.gms.common.api.internal.s, v1, com.google.android.gms.common.api.internal.o, e0, n5.b, y2.g, a71 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(int i10, boolean z10) {
        this.a = i10;
    }

    public static c h(float f7, int i10) {
        Point point = AndroidUtilities.displaySize;
        int i11 = (int) (point.x * f7);
        int i12 = (int) (point.y * f7);
        if (i11 == i12) {
            return new c(i11, i12, new int[0]);
        }
        if (i10 == 3) {
            return new c(i11, i12, new int[]{i12, i11});
        }
        return (i10 == 1) == (i11 < i12) ? new c(i11, i12, new int[0]) : new c(i12, i11, new int[0]);
    }

    @Override // s4.e0
    public void D(int i10, int i11) {
        ((h0) this.b).p(i10, i11);
    }

    @Override // qg.v1
    public void E(float f7) {
        w0 w0Var = (w0) this.b;
        u0.e(w0Var.a).k("-1", f7);
        w0Var.e.setBrushSize(f7);
    }

    @Override // org.telegram.ui.Components.ya0
    public void F(int i10, int i11, CharSequence charSequence, boolean z10) {
        xi xiVar = (xi) this.b;
        if (xiVar.k1() == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xiVar.k1().getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, xiVar.k1().getEditText().getPaint().getFontMetricsInt(), false);
            }
            xiVar.k1().setText(spannableStringBuilder);
            xiVar.k1().setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        ((ChatActivityEnterView) this.b).T0(i10, z10, 0, true, 0L);
    }

    @Override // s4.e0
    public void O0(int i10, int i11) {
        ((h0) this.b).t(i10, i11);
    }

    @Override // gg.b2
    public void a(int i10) {
        vq0 vq0Var = (vq0) this.b;
        zq0 zq0Var = vq0Var.K;
        vq0Var.s = i10;
        if (vq0Var.v != i10) {
            vq0Var.d.clear();
        }
        int i11 = vq0Var.J;
        if (vq0Var.h() != 0 || vq0Var.e.e() || vq0Var.I) {
            zq0Var.x0.b(i11);
        } else {
            zq0Var.Q.e(false, true);
        }
        vq0Var.l();
        int i12 = zq0.W0;
        zq0Var.H0(true);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 11:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.a aVar = (p6.a) ((p6.c) obj).u();
                n6.o oVar = (n6.o) this.b;
                Parcel I0 = aVar.I0();
                k7.a.c(I0, oVar);
                try {
                    aVar.b.transact(1, I0, null, 1);
                    I0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    I0.recycle();
                    throw th2;
                }
            default:
                v8.j jVar = (v8.j) this.b;
                e8.b bVar = (e8.b) obj;
                Bundle G = bVar.G();
                G.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
                e8.a aVar2 = new e8.a(0, (TaskCompletionSource) obj2);
                try {
                    e8.i iVar = (e8.i) bVar.u();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = e8.c.a;
                    obtain.writeInt(1);
                    jVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar2);
                    try {
                        iVar.a.transact(19, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th3) {
                        obtain.recycle();
                        throw th3;
                    }
                } catch (RemoteException e7) {
                    Log.e("WalletClientImpl", "RemoteException getting payment data", e7);
                    Bundle bundle = Bundle.EMPTY;
                    aVar2.O(Status.h, null);
                    return;
                }
        }
    }

    public boolean b(int i10) {
        x81 x81Var = ((g91) this.b).L;
        if (x81Var == null) {
            return false;
        }
        return x81Var.c(i10);
    }

    @Override // o0.b
    public Cursor c(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e7) {
            Log.w("FontsProvider", "Unable to query the content provider", e7);
            return null;
        }
    }

    @Override // o0.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (obj != null) {
                throw new ClassCastException();
            }
            try {
                throw null;
            } catch (Exception e7) {
                yc.i.d.log(Level.WARNING, "could not delete file ", (Throwable) e7);
            }
        }
        arrayList.clear();
    }

    public void e(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int i10 = aVar.a;
        if (i10 == 1) {
            recyclerView.x.V(recyclerView, aVar.b, aVar.d);
            return;
        }
        if (i10 == 2) {
            recyclerView.x.Y(recyclerView, aVar.b, aVar.d);
        } else if (i10 == 4) {
            recyclerView.x.a0(recyclerView, aVar.b, aVar.d, aVar.c);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.x.X(recyclerView, aVar.b, aVar.d);
        }
    }

    public void f(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int L = recyclerView.e.L();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < L; i15++) {
            View K = recyclerView.e.K(i15);
            c1 U = RecyclerView.U(K);
            if (U != null && !U.r() && (i13 = U.c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.l) == 0) {
                    if (U.m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.m = arrayList;
                        U.n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.m.add(obj);
                }
                ((p0) K.getLayoutParams()).c = true;
            }
        }
        of.e eVar = recyclerView.b;
        ArrayList arrayList2 = (ArrayList) eVar.e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            c1 c1Var = (c1) arrayList2.get(size);
            if (c1Var != null && (i12 = c1Var.c) >= i10 && i12 < i14) {
                c1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.x0 = true;
    }

    @Override // fd.a
    public Object get() {
        String packageName = ((Context) ((fd.a) this.b).get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public void i(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int L = recyclerView.e.L();
        for (int i12 = 0; i12 < L; i12++) {
            c1 U = RecyclerView.U(recyclerView.e.K(i12));
            if (U != null && !U.r() && U.c >= i10) {
                U.n(i11, false);
                recyclerView.t0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            c1 c1Var = (c1) arrayList.get(i13);
            if (c1Var != null && c1Var.c >= i10) {
                c1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.w0 = true;
    }

    @Override // org.telegram.ui.Components.u71
    public void invalidate() {
        ((u1) ((h1) this.b).b).invalidate();
    }

    public void j(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.b;
        int L = recyclerView.e.L();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < L; i20++) {
            c1 U = RecyclerView.U(recyclerView.e.K(i20));
            if (U != null && (i18 = U.c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.t0.f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.b.e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            c1 c1Var = (c1) arrayList.get(i21);
            if (c1Var != null && (i17 = c1Var.c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    c1Var.n(i11 - i10, false);
                } else {
                    c1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.w0 = true;
    }

    public void k(float f7) {
        g91 g91Var = (g91) this.b;
        View[] viewArr = g91Var.e;
        if (f7 == 1.0f) {
            if (viewArr[1] != null) {
                g91Var.G();
                g91Var.h.put(g91Var.f[1], viewArr[1]);
                g91Var.removeView(viewArr[1]);
                g91Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            g91Var.A(g91Var.b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (g91Var.y) {
            g91Var.F(view, (1.0f - f7) * viewArr[0].getMeasuredWidth());
            g91Var.F(viewArr[0], (-r1.getMeasuredWidth()) * f7);
        } else {
            g91Var.F(view, (1.0f - f7) * (-viewArr[0].getMeasuredWidth()));
            g91Var.F(viewArr[0], r1.getMeasuredWidth() * f7);
        }
        g91Var.x(false);
    }

    public void l(da.b bVar, Thread thread, Throwable th2) {
        w9.n nVar = (w9.n) this.b;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w9.x.a(nVar.e.m(new w9.l(nVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e7);
            }
        }
    }

    @Override // s4.e0
    public void m0(int i10, int i11) {
        ((h0) this.b).s(i10, i11);
    }

    @Override // s4.e0
    public void n1(int i10, int i11) {
        ((h0) this.b).r(i10, i11, null);
    }

    @Override // org.telegram.ui.Components.a81
    public void onError(d81 d81Var, Exception exc) {
        FileLog.e(exc);
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public void onStateChanged(boolean z10, int i10) {
        f60 f60Var;
        VideoEditedInfo videoEditedInfo;
        y50 y50Var = (y50) this.b;
        d81 d81Var = y50Var.H0.T;
        if (d81Var != null && d81Var.y() && i10 == 4 && (videoEditedInfo = (f60Var = y50Var.H0).S) != null) {
            d81 d81Var2 = f60Var.T;
            long j3 = videoEditedInfo.startTime;
            if (j3 <= 0) {
                j3 = 0;
            }
            d81Var2.K(j3);
        }
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void q(Object obj) {
        ((g8.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // org.telegram.ui.Components.ya0
    public Paint.FontMetricsInt r() {
        return ((xi) this.b).E0.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // y2.g
    public k4.d s(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.b).a.x(iOException);
        return y2.l.e;
    }

    @Override // y2.g
    public void v(y2.i iVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.b;
        synchronized (z2.b.b) {
            z10 = z2.b.c;
        }
        if (z10) {
            dVar.a();
        } else {
            dVar.a.x(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // gg.b2
    public /* synthetic */ a0.i w() {
        return null;
    }

    @Override // gg.b2
    public /* synthetic */ a0.i y() {
        return null;
    }

    @Override // gg.b2
    public boolean z(int i10) {
        return i10 == ((vq0) this.b).r;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.a81
    public void onRenderedFirstFrame() {
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 26:
                File file = new File(System.getProperty("java.io.tmpdir"));
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.b = new ArrayList();
                break;
            default:
                this.b = new o2.d(5, 1.0f, false);
                break;
        }
    }

    @Override // qg.v1
    public float get() {
        w0 w0Var = (w0) this.b;
        int i10 = w0Var.a;
        pg.m currentBrush = w0Var.e.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).i;
        }
        return u0.e(i10).f("-1", currentBrush.d());
    }

    public c(int i10, int i11, int[] iArr) {
        this.a = 4;
        m60[] m60VarArr = new m60[(iArr.length / 2) + 1];
        this.b = m60VarArr;
        m60 m60Var = new m60(i10, i11);
        int i12 = 0;
        m60VarArr[0] = m60Var;
        while (i12 < iArr.length / 2) {
            int i13 = i12 + 1;
            int i14 = i12 * 2;
            ((m60[]) this.b)[i13] = new m60(iArr[i14], iArr[i14 + 1]);
            i12 = i13;
        }
    }

    public c(TextView textView) {
        this.a = 12;
        this.b = new q1.g(textView);
    }

    public c(Context context, Uri uri) {
        this.a = 1;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    @Override // gg.b2
    public /* synthetic */ void C(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.ya0
    public /* synthetic */ void G(String str) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.ya0
    public /* synthetic */ void g(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.ya0
    public /* synthetic */ void x(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.a81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override // y2.g
    public /* synthetic */ void t(y2.i iVar, long j3, long j10, int i10) {
    }

    @Override // y2.g
    public void x0(y2.i iVar, long j3, long j10, boolean z10) {
    }
}
