// default package

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.telegram.messenger.ImageReceiver;
import org.telegram.utils.twidget.WidgetEngineService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class lcc implements r5b, ln5, qq7, OnCompleteListener, roc, ee, jwc, yeb, h89 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lcc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ln5
    public final void B0(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        View fragmentView;
        bj6 bj6Var = (bj6) ((jgc) this.b);
        iq5 H0 = gm.H0(wzcVar, false);
        int i = H0.a;
        bj6Var.M = i;
        int i2 = H0.c;
        bj6Var.N = i2;
        bj6Var.L = H0.d;
        boolean a = bj6Var.y.a();
        int L = a ? gm.L(44.0f) : 0;
        bj6Var.y.setPadding(0, 0, 0, bj6Var.L);
        int L2 = gm.L(72.0f) + bj6Var.L + L;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bj6Var.H.getLayoutParams();
        if (marginLayoutParams.height != L2) {
            marginLayoutParams.height = L2;
            bj6Var.H.setLayoutParams(marginLayoutParams);
        }
        int i3 = a ? bj6Var.L + L : 0;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) bj6Var.c.getLayoutParams();
        if (marginLayoutParams2.bottomMargin != i3 || marginLayoutParams2.leftMargin != i || marginLayoutParams2.rightMargin != i2) {
            marginLayoutParams2.leftMargin = i;
            marginLayoutParams2.rightMargin = i2;
            marginLayoutParams2.bottomMargin = i3;
            bj6Var.c.setLayoutParams(marginLayoutParams2);
        }
        bj6Var.E.setPadding(i, 0, i2, bj6Var.L);
        if (a) {
            wzcVar = wzcVar.a.m(0, 0, 0, bj6Var.L);
        }
        bj6Var.h0();
        bj6Var.g0();
        SparseArray sparseArray = bj6Var.a;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            hgc hgcVar = (hgc) sparseArray.valueAt(i4);
            if (hgcVar != null && (fragmentView = hgcVar.a.getFragmentView()) != null) {
                kfc.b(fragmentView, wzcVar);
            }
        }
        return wzc.b;
    }

    @Override // ln5
    public final void L(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override // roc
    public final void a(float f, float f2, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 5:
                ((soc) obj).J.setShadowLayer(f * 2.0f, f2, -0.0f, on2.p(i, Math.round(Color.alpha(i) * 0.5f)));
                break;
            default:
                ((ho) obj).s(f, f2, i);
                break;
        }
    }

    @Override // h89
    public final void accept(Object obj, Object obj2) {
        q2d q2dVar = (q2d) this.b;
        m2d m2dVar = (m2d) obj;
        m2dVar.getClass();
        z2d z2dVar = new z2d((TaskCompletionSource) obj2);
        x2d x2dVar = (x2d) m2dVar.k();
        hp hpVar = new hp(new uq2(-1, -1, 0, true), false);
        hpVar.c = false;
        t2d t2dVar = (t2d) x2dVar;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.firebase.pnv.internal.IFpnvService");
        int i = t1d.a;
        obtain.writeStrongBinder(z2dVar);
        obtain.writeInt(1);
        q2dVar.writeToParcel(obtain, 0);
        obtain.writeInt(1);
        hpVar.writeToParcel(obtain, 0);
        Parcel obtain2 = Parcel.obtain();
        try {
            t2dVar.a.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // jwc
    public final void b(WebView webView, ry ryVar, Uri uri, boolean z, yu5 yu5Var) {
        yu5 yu5Var2;
        bwc bwcVar = (bwc) this.b;
        if (webView == bwcVar.o && z && uri != null && bwcVar.f.equals(uri.toString()) && bwcVar.j(webView)) {
            boolean z2 = ryVar.b;
            if (z2) {
                if (z2) {
                    synchronized (bwcVar.a) {
                        if (bwcVar.u || (yu5Var2 = bwcVar.p) == null || yu5Var2 != yu5Var) {
                            return;
                        }
                        ryVar.a(1);
                        byte[] bArr = (byte[]) ryVar.d;
                        Objects.requireNonNull(bArr);
                        bwcVar.k.execute(new ptc(bwcVar, bArr, (byte) 10));
                        return;
                    }
                }
                return;
            }
            ryVar.a(0);
            String str = (String) ryVar.c;
            if (bwcVar.q || str == null || !str.startsWith("tproxy-base64:")) {
                bwcVar.i(str, yu5Var);
                return;
            }
            synchronized (bwcVar.a) {
                if (!bwcVar.u && bwcVar.r && bwcVar.p == yu5Var) {
                    if (str.length() - 14 > 1398112) {
                        bwcVar.h();
                    } else {
                        bwcVar.k.execute(new ptc(bwcVar, str, (byte) 9));
                    }
                }
            }
        }
    }

    @Override // ln5
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        boolean z4;
        eec eecVar;
        int i;
        int i2;
        int i3;
        int i4;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 2:
                fec fecVar = (fec) obj;
                ImageReceiver imageReceiver2 = fecVar.R;
                if (z) {
                    if (fecVar.O != null || fecVar.e0 != null) {
                        int L = gm.L(150.0f);
                        ya8 ya8Var = fecVar.O;
                        if (ya8Var != null) {
                            int i5 = (int) fecVar.P;
                            ArrayList arrayList = ya8Var.w;
                            int indexOf = arrayList.indexOf(ya8Var.b(i5));
                            if (indexOf == -1) {
                                z4 = true;
                                i4 = 0;
                            } else if (indexOf == arrayList.size() - 1) {
                                int videoDuration = ya8Var.getVideoDuration() / 1000;
                                z4 = true;
                                i4 = Math.min(25, (((int) (videoDuration <= 100 ? Math.ceil(videoDuration) : videoDuration <= 250 ? Math.ceil(videoDuration / 2.0f) : videoDuration <= 500 ? Math.ceil(videoDuration / 4.0f) : videoDuration <= 1000 ? Math.ceil(videoDuration / 5.0f) : Math.ceil(videoDuration / 10.0f))) - ((arrayList.size() - 1) * 25)) + 1);
                            } else {
                                z4 = true;
                                i4 = 25;
                            }
                            float q = imageReceiver2.q() / Math.min(i4, 5);
                            float o = imageReceiver2.o() / ((int) Math.ceil(i4 / 5.0f));
                            ya8 ya8Var2 = fecVar.O;
                            int i6 = (int) fecVar.P;
                            int videoDuration2 = ya8Var2.getVideoDuration() / 1000;
                            int min = Math.min(videoDuration2 <= 100 ? ((int) Math.ceil(i6)) % 25 : videoDuration2 <= 250 ? ((int) Math.ceil(i6 / 2.0f)) % 25 : videoDuration2 <= 500 ? ((int) Math.ceil(i6 / 4.0f)) % 25 : videoDuration2 <= 1000 ? ((int) Math.ceil(i6 / 5.0f)) % 25 : ((int) Math.ceil(i6 / 10.0f)) % 25, i4 - 1);
                            fecVar.S = (int) ((min % 5) * q);
                            fecVar.T = (int) ((min / 5) * o);
                            i = (int) q;
                            fecVar.U = i;
                            i2 = (int) o;
                            fecVar.V = i2;
                        } else {
                            z4 = true;
                            int i7 = 0;
                            while (true) {
                                if (i7 < fecVar.e0.size()) {
                                    eecVar = (eec) fecVar.e0.get(i7);
                                    double d = i7 == 0 ? 0.0d : eecVar.a;
                                    double d2 = i7 == fecVar.e0.size() + (-1) ? 9.9999999E7d : ((eec) fecVar.e0.get(i7 + 1)).a;
                                    double d3 = fecVar.P;
                                    if (d3 < d || d3 > d2) {
                                        i7++;
                                    }
                                } else {
                                    eecVar = null;
                                }
                            }
                            if (eecVar != null) {
                                fecVar.S = eecVar.b;
                                fecVar.T = eecVar.c;
                                i = fecVar.c0;
                                fecVar.U = i;
                                i2 = fecVar.d0;
                                fecVar.V = i2;
                            }
                        }
                        fecVar.Q = z4;
                        float f = i / i2;
                        if (f > 1.0f) {
                            i3 = (int) (L / f);
                        } else {
                            L = (int) (L * f);
                            i3 = L;
                        }
                        ViewGroup.LayoutParams layoutParams = fecVar.getLayoutParams();
                        if (fecVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i3) {
                            layoutParams.width = L;
                            layoutParams.height = i3;
                            fecVar.setVisibility(0);
                            fecVar.requestLayout();
                            break;
                        }
                    }
                }
                break;
            default:
                ((lqc) obj).d0.f0();
                break;
        }
    }

    @Override // yeb
    public final Object e() {
        e7a e7aVar = (e7a) this.b;
        Iterator it = ((Iterable) ((mq9) e7aVar.b).c(new dq9((byte) 1))).iterator();
        while (it.hasNext()) {
            ((in3) e7aVar.c).E((rb0) it.next(), 1, false);
        }
        return null;
    }

    @Override // r5b, id1
    public final long get() {
        ndc ndcVar = ((e98) this.b).a.G2;
        if (ndcVar != null) {
            return ndcVar.S();
        }
        return 0L;
    }

    public final InputStream h(String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
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

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 4:
                mfd.b((Intent) obj);
                break;
            case 15:
                ((o0d) obj).b.trySetResult(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        ((vqc) this.b).d0();
    }

    private final void f(ImageReceiver imageReceiver) {
    }

    private final void g(ImageReceiver imageReceiver) {
    }

    private final void c(int i, Drawable drawable) {
    }

    private final void d(int i, Drawable drawable) {
    }
}
