// default package

import android.content.Intent;
import android.content.res.AssetManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.telegram.messenger.ImageReceiver;
import org.telegram.utils.twidget.WidgetEngineService;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.VideoTrack;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ftb implements m8, t69, ez5, fd, yma, sgb, ta9, rv9, Continuation, n7b, on5, NativeLifecycleLock.NativeDisposer, nr7, OnCompleteListener, erc, yyc, s99 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ftb(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // rv9
    public final boolean C1(int i) {
        return true;
    }

    @Override // rv9
    public final zh6 D0() {
        return null;
    }

    @Override // nr7
    public final l2d S(View view, l2d l2dVar) {
        View fragmentView;
        fj6 fj6Var = (fj6) ((iic) this.b);
        mq5 H0 = hl.H0(l2dVar, false);
        int i = H0.a;
        fj6Var.P = i;
        int i2 = H0.c;
        fj6Var.Q = i2;
        fj6Var.O = H0.d;
        boolean a = fj6Var.G.a();
        int L = a ? hl.L(44.0f) : 0;
        fj6Var.G.setPadding(0, 0, 0, fj6Var.O);
        int L2 = hl.L(72.0f) + fj6Var.O + L;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fj6Var.K.getLayoutParams();
        if (marginLayoutParams.height != L2) {
            marginLayoutParams.height = L2;
            fj6Var.K.setLayoutParams(marginLayoutParams);
        }
        int i3 = a ? fj6Var.O + L : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) fj6Var.c.getLayoutParams();
        if (marginLayoutParams2.bottomMargin != i3 || marginLayoutParams2.leftMargin != i || marginLayoutParams2.rightMargin != i2) {
            marginLayoutParams2.leftMargin = i;
            marginLayoutParams2.rightMargin = i2;
            marginLayoutParams2.bottomMargin = i3;
            fj6Var.c.setLayoutParams(marginLayoutParams2);
        }
        fj6Var.H.setPadding(i, 0, i2, fj6Var.O);
        if (a) {
            l2dVar = l2dVar.a.m(0, 0, 0, fj6Var.O);
        }
        fj6Var.k0();
        fj6Var.i0();
        SparseArray sparseArray = fj6Var.a;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            gic gicVar = (gic) sparseArray.valueAt(i4);
            if (gicVar != null && (fragmentView = gicVar.a.getFragmentView()) != null) {
                ihc.b(fragmentView, l2dVar);
            }
        }
        return l2d.b;
    }

    @Override // rv9
    public final zh6 Z0() {
        return null;
    }

    @Override // ez5
    public final void a(String str) {
        b4c b4cVar = (b4c) this.b;
        b4cVar.Z1 = str;
        b4cVar.e2.O(true);
    }

    @Override // s99
    public final void accept(Object obj, Object obj2) {
        f5d f5dVar = (f5d) this.b;
        b5d b5dVar = (b5d) obj;
        b5dVar.getClass();
        o5d o5dVar = new o5d((TaskCompletionSource) obj2);
        m5d m5dVar = (m5d) b5dVar.k();
        io ioVar = new io(new cq2(-1, -1, 0, true), false);
        ioVar.c = false;
        i5d i5dVar = (i5d) m5dVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i = j4d.a;
        obtain.writeStrongBinder(o5dVar);
        obtain.writeInt(1);
        f5dVar.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        ioVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            i5dVar.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // erc
    public final void b(float f, float f2, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                ((frc) obj).J.setShadowLayer(f * 2.0f, f2, -0.0f, vm2.o(i, Math.round(Color.alpha(i) * 0.5f)));
                break;
            default:
                ((hn) obj).s(f, f2, i);
                break;
        }
    }

    @Override // m8
    public final void c() {
        ((ktb) this.b).e();
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeDisposer
    public final void dispose(long j) {
        ((VideoTrack) this.b).lambda$dispose$2(j);
    }

    @Override // t69
    public final boolean e(int i, View view) {
        ((axb) this.b).K.e(i, view);
        return true;
    }

    @Override // sgb
    public final Object g() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                ds9 ds9Var = (ds9) ((ba0) obj).i;
                SQLiteDatabase a = ds9Var.a();
                a.beginTransaction();
                try {
                    a.compileStatement("DELETE FROM log_event_dropped").execute();
                    a.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + ds9Var.b.e()).execute();
                    a.setTransactionSuccessful();
                    return null;
                } finally {
                    a.endTransaction();
                }
            default:
                u8a u8aVar = (u8a) obj;
                Iterator it = ((Iterable) ((ds9) u8aVar.b).c(new vr9((byte) 3))).iterator();
                while (it.hasNext()) {
                    ((pm3) u8aVar.c).E((ta0) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // n7b, ic1
    public final long get() {
        kfc kfcVar = ((ua8) this.b).a.G2;
        if (kfcVar != null) {
            return kfcVar.S();
        }
        return 0L;
    }

    @Override // yyc
    public final void i(WebView webView, rx rxVar, Uri uri, boolean z, cv5 cv5Var) {
        cv5 cv5Var2;
        pyc pycVar = (pyc) this.b;
        if (webView == pycVar.o && z && uri != null && pycVar.f.equals(uri.toString()) && pycVar.j(webView)) {
            boolean z2 = rxVar.b;
            if (z2) {
                if (z2) {
                    synchronized (pycVar.a) {
                        if (pycVar.u || (cv5Var2 = pycVar.p) == null || cv5Var2 != cv5Var) {
                            return;
                        }
                        rxVar.b(1);
                        byte[] bArr = (byte[]) rxVar.d;
                        Objects.requireNonNull(bArr);
                        pycVar.k.execute(new cxc((Object) pycVar, (Object) bArr, (byte) 7));
                        return;
                    }
                }
                return;
            }
            rxVar.b(0);
            String str = (String) rxVar.c;
            if (pycVar.q || str == null || !str.startsWith("tproxy-base64:")) {
                pycVar.i(str, cv5Var);
                return;
            }
            synchronized (pycVar.a) {
                if (!pycVar.u && pycVar.r && pycVar.p == cv5Var) {
                    if (str.length() - 14 > 1398112) {
                        pycVar.h();
                    } else {
                        pycVar.k.execute(new cxc((Object) pycVar, (Object) str, (byte) 6));
                    }
                }
            }
        }
    }

    @Override // yma
    public final void j(int i) {
        pcc pccVar = ((b8c) this.b).D;
        if (pccVar != null) {
            pccVar.a(Integer.valueOf(i));
        }
    }

    public final InputStream l(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 21:
                ZipFile zipFile = (ZipFile) obj;
                String str2 = WidgetEngineService.b;
                ZipEntry entry = zipFile.getEntry("assets/WidgetSandbox/".concat(str));
                if (entry != null) {
                    return zipFile.getInputStream(entry);
                }
                throw new FileNotFoundException(str);
            default:
                String str3 = WidgetEngineService.b;
                return ((AssetManager) obj).open("WidgetSandbox/".concat(str));
        }
    }

    @Override // ta9
    public final void n(long j, ey7 ey7Var) {
        ivd.b(j, ey7Var, ((oz9) this.b).c);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 14:
                cid.b((Intent) obj);
                break;
            case 25:
                ((d3d) obj).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // rv9
    public final void p(int i) {
        bcc bccVar = (bcc) this.b;
        if (bccVar.h == null && !bccVar.f.e()) {
            bccVar.w.f.e(false, true);
        }
        bccVar.f();
    }

    @Override // on5
    public final void r(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        ((CountDownLatch) this.b).countDown();
        return null;
    }

    @Override // on5
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        boolean z4;
        bgc bgcVar;
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                cgc cgcVar = (cgc) obj;
                ImageReceiver imageReceiver2 = cgcVar.R;
                if (z) {
                    if (cgcVar.O != null || cgcVar.e0 != null) {
                        int L = hl.L(150.0f);
                        nc8 nc8Var = cgcVar.O;
                        if (nc8Var != null) {
                            int i5 = (int) cgcVar.P;
                            ArrayList arrayList = nc8Var.w;
                            int indexOf = arrayList.indexOf(nc8Var.b(i5));
                            if (indexOf == -1) {
                                z4 = true;
                                i4 = 0;
                            } else if (indexOf == arrayList.size() - 1) {
                                int videoDuration = nc8Var.getVideoDuration() / 1000;
                                z4 = true;
                                i4 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                            } else {
                                z4 = true;
                                i4 = 25;
                            }
                            float q = imageReceiver2.q() / Math.min(i4, 5);
                            float o = imageReceiver2.o() / ((int) Math.ceil(i4 / 5.0f));
                            nc8 nc8Var2 = cgcVar.O;
                            int i6 = (int) cgcVar.P;
                            int videoDuration2 = nc8Var2.getVideoDuration() / 1000;
                            int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i6)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i6 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i6 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i6 / 5.0f)) % 25 : ((int) Math.ceil(i6 / 10.0f)) % 25, i4 - 1);
                            cgcVar.S = (int) ((min % 5) * q);
                            cgcVar.T = (int) ((min / 5) * o);
                            i = (int) q;
                            cgcVar.U = i;
                            i2 = (int) o;
                            cgcVar.V = i2;
                        } else {
                            z4 = true;
                            int i7 = 0;
                            while (true) {
                                if (i7 < cgcVar.e0.size()) {
                                    bgcVar = (bgc) cgcVar.e0.get(i7);
                                    double d = i7 == 0 ? 0.0d : bgcVar.a;
                                    double d2 = i7 == cgcVar.e0.size() + (-1) ? 9.9999999E7d : ((bgc) cgcVar.e0.get(i7 + 1)).a;
                                    double d3 = cgcVar.P;
                                    if (d3 < d || d3 > d2) {
                                        i7++;
                                    }
                                } else {
                                    bgcVar = null;
                                }
                            }
                            if (bgcVar != null) {
                                cgcVar.S = bgcVar.b;
                                cgcVar.T = bgcVar.c;
                                i = cgcVar.c0;
                                cgcVar.U = i;
                                i2 = cgcVar.d0;
                                cgcVar.V = i2;
                            }
                        }
                        cgcVar.Q = z4;
                        float f = i / i2;
                        if (f > 1.0f) {
                            i3 = (int) (L / f);
                        } else {
                            L = (int) (L * f);
                            i3 = L;
                        }
                        ViewGroup.LayoutParams layoutParams = cgcVar.getLayoutParams();
                        if (cgcVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i3) {
                            layoutParams.width = L;
                            layoutParams.height = i3;
                            cgcVar.setVisibility(0);
                            cgcVar.requestLayout();
                            break;
                        }
                    }
                }
                break;
            default:
                ((vsc) obj).d0.f0();
                break;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((m7c) obj).a.J0(true);
                break;
            default:
                ((gtc) obj).c0();
                break;
        }
    }

    @Override // on5
    public final void z(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override // yma
    public final void m() {
    }

    private final void h(ImageReceiver imageReceiver) {
    }

    private final void k(ImageReceiver imageReceiver) {
    }

    @Override // rv9
    public final void X1(ArrayList arrayList) {
    }

    private final void d(int i, Drawable drawable) {
    }

    private final void f(int i, Drawable drawable) {
    }
}
