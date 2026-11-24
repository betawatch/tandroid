// default package

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.webkit.WebView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.telegram.messenger.ImageReceiver;
import org.telegram.utils.twidget.WidgetEngineService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class dkc implements OnCompleteListener, rmc, ll5, ed, iuc, xcb, f69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dkc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ll5
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ((joc) this.b).d0.f0();
    }

    @Override // rmc
    public final void a(float f, float f2, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((smc) obj).J.setShadowLayer(f * 2.0f, f2, -0.0f, bm2.o(i, Math.round(Color.alpha(i) * 0.5f)));
                break;
            default:
                ((gn) obj).s(f, f2, i);
                break;
        }
    }

    @Override // f69
    public final void accept(Object obj, Object obj2) {
        o0d o0dVar = (o0d) this.b;
        k0d k0dVar = (k0d) obj;
        k0dVar.getClass();
        x0d x0dVar = new x0d((TaskCompletionSource) obj2);
        v0d v0dVar = (v0d) k0dVar.k();
        ho hoVar = new ho(new jp2(-1, -1, 0, true), false);
        hoVar.c = false;
        r0d r0dVar = (r0d) v0dVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i = szc.a;
        obtain.writeStrongBinder(x0dVar);
        obtain.writeInt(1);
        o0dVar.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        hoVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            r0dVar.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public final InputStream b(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
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

    @Override // iuc
    public final void i(WebView webView, qx qxVar, Uri uri, boolean z, zs5 zs5Var) {
        zs5 zs5Var2;
        auc aucVar = (auc) this.b;
        if (webView == aucVar.o && z && uri != null && aucVar.f.equals(uri.toString()) && aucVar.j(webView)) {
            boolean z2 = qxVar.b;
            if (z2) {
                if (z2) {
                    synchronized (aucVar.a) {
                        if (aucVar.u || (zs5Var2 = aucVar.p) == null || zs5Var2 != zs5Var) {
                            return;
                        }
                        qxVar.b(1);
                        byte[] bArr = (byte[]) qxVar.d;
                        Objects.requireNonNull(bArr);
                        aucVar.k.execute(new isc((Object) aucVar, (Object) bArr, (byte) 8));
                        return;
                    }
                }
                return;
            }
            qxVar.b(0);
            String str = (String) qxVar.c;
            if (aucVar.q || str == null || !str.startsWith("tproxy-base64:")) {
                aucVar.i(str, zs5Var);
                return;
            }
            synchronized (aucVar.a) {
                if (!aucVar.u && aucVar.r && aucVar.p == zs5Var) {
                    if (str.length() - 14 > 1398112) {
                        aucVar.h();
                    } else {
                        aucVar.k.execute(new isc((Object) aucVar, (Object) str, (byte) 7));
                    }
                }
            }
        }
    }

    @Override // xcb
    public final Object m() {
        wtc wtcVar = (wtc) this.b;
        Iterator it = ((Iterable) ((lo9) wtcVar.b).c(new ho9((byte) 0))).iterator();
        while (it.hasNext()) {
            ((xl3) wtcVar.c).F((ra0) it.next(), 1, false);
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kdd.b((Intent) obj);
                break;
            case 11:
                ((nyc) obj).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        ((toc) this.b).c0();
    }

    @Override // ll5
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override // ll5
    public final void E(int i, Drawable drawable) {
    }
}
