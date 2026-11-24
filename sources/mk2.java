// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.View;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class mk2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mk2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cf  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap bitmap;
        ska skaVar;
        i64 i64Var;
        byte b = this.a;
        Bitmap bitmap2 = null;
        byte b2 = 1;
        int i = 0;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((pk2) obj).g = -1L;
                break;
            case 1:
                ((rk2) obj).a();
                break;
            case 2:
                ((yo2) obj).a();
                break;
            case 3:
                ((wp2) obj).invalidateOptionsMenu();
                break;
            case 4:
                up2 up2Var = (up2) obj;
                Runnable runnable = up2Var.b;
                if (runnable != null) {
                    runnable.run();
                    up2Var.b = null;
                    break;
                }
                break;
            case 5:
                yp2.b((yp2) obj);
                break;
            case 6:
                fq2 fq2Var = (fq2) obj;
                ArrayList arrayList = fq2Var.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((View) obj2).invalidate();
                }
                fq2Var.invalidateSelf();
                break;
            case 7:
                ((oq2) obj).invalidateSelf();
                break;
            case 8:
                pq2 pq2Var = (pq2) obj;
                StringBuilder sb = new StringBuilder("emoji/compound/0_");
                pq2Var.getClass();
                sb.append(pq2Var.a);
                sb.append("_");
                String l = de9.l(sb, pq2Var.b ? 1 : 0, ".png");
                HashMap hashMap = vu3.a;
                try {
                    int i2 = gl.p > 1.0f ? 1 : 2;
                    try {
                        InputStream open = a.b.getAssets().open(l);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = i2;
                        bitmap = BitmapFactory.decodeStream(open, null, options);
                        try {
                            open.close();
                        } catch (Throwable th) {
                            th = th;
                            fa4.g(th, true);
                            bitmap2 = bitmap;
                            if (bitmap2 != null) {
                            }
                            pq2.f.remove(Integer.valueOf(pq2Var.c));
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap = null;
                    }
                    bitmap2 = bitmap;
                } catch (Throwable th3) {
                    if (w01.a) {
                        fa4.e("Error loading emoji", th3);
                    }
                }
                if (bitmap2 != null) {
                    pq2.e.put(pq2Var.c, bitmap2);
                    ql3 ql3Var = vu3.l;
                    gl.r(ql3Var);
                    gl.c3(ql3Var);
                }
                pq2.f.remove(Integer.valueOf(pq2Var.c));
            case 9:
                ((c30) obj).o(true);
                break;
            case 10:
                ((tv2) obj).a.d();
                break;
            case 11:
                hx2 hx2Var = (hx2) obj;
                long j = hx2Var.b;
                if (j > 0) {
                    long j2 = j - 1;
                    hx2Var.b = j2;
                    hx2Var.a.o(j2);
                }
                if (hx2Var.b <= 0) {
                    hx2Var.c = false;
                }
                if (hx2Var.c) {
                    gl.d3(hx2Var.d, 1000L);
                    break;
                }
                break;
            case 12:
                ((xx2) obj).Y1.O(true);
                break;
            case 13:
                o03 o03Var = ((n03) obj).c;
                TLRPC.Peer peer = o03Var.Y1;
                d dVar = o03Var.a2;
                f13 f13Var = new f13(dVar, peer, o03Var.b2, o03Var.T1.size() > 1, o03Var.S1);
                if (dVar.getParentActivity() == null) {
                    f13Var.show();
                    break;
                } else {
                    dVar.showDialog(f13Var);
                    break;
                }
            case 14:
                ((w13) obj).e().M(new ts4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                break;
            case 15:
                y23 y23Var = (y23) obj;
                k34 k34Var = y23Var.b.J;
                if (k34Var != null) {
                    k34Var.b();
                }
                y23Var.b.k();
                break;
            case 16:
                ((ValueAnimator) obj).start();
                break;
            case 17:
                d dVar2 = ((i43) obj).h2.r;
                if (!(dVar2 instanceof mu1)) {
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new jh8(dVar2, 11, false));
                        break;
                    }
                } else {
                    dVar2.showDialog(new jh8(dVar2, 11, false));
                    break;
                }
                break;
            case 18:
                l93 l93Var = (l93) obj;
                tj Q2 = l93Var.Q();
                l93Var.V(Q2, 1028, new i93(Q2, b2));
                l93Var.f.d();
                break;
            case 19:
                q93 q93Var = (q93) obj;
                if (q93Var.d0 >= 300000) {
                    q93Var.n.L();
                    q93Var.d0 = 0L;
                    break;
                }
                break;
            case 20:
                ca3 ca3Var = (ca3) obj;
                if (!ca3Var.c) {
                    sq3 sq3Var = ca3Var.b;
                    if (sq3Var != null) {
                        sq3Var.c(ca3Var.a);
                    }
                    ca3Var.d.y.remove(ca3Var);
                    ca3Var.c = true;
                    break;
                }
                break;
            case 21:
                ((aa3) obj).c(null);
                break;
            case 22:
                sc3 sc3Var = (sc3) obj;
                if (sc3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && (skaVar = sc3Var.i) != null && skaVar.b && (i64Var = sc3Var.a) != null) {
                    i64Var.h.c(10, null).b();
                    break;
                }
                break;
            case 23:
                ((xc3) obj).i.u();
                break;
            case 24:
                fx0[] fx0VarArr = (fx0[]) obj;
                fx0 fx0Var = fx0VarArr[0];
                if (fx0Var != null) {
                    fx0Var.dismiss();
                    fx0VarArr[0] = null;
                    break;
                }
                break;
            case 25:
                up3 q = up3.q(((j5) obj).a);
                q.getMessagesStorage().a.c(new rp3(q, objArr == true ? 1 : 0));
                break;
            case 26:
                ((dk3) obj).updateColors();
                break;
            case 27:
                ((x4c) obj).updateColors();
                break;
            case 28:
                ((l9) obj).updateColors();
                break;
            default:
                ((cj3) ((vm2) obj).b).g0.setAlpha(1.0f);
                break;
        }
    }
}
