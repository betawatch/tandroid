package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.gf;
import org.telegram.messenger.qp;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cn0;
import org.telegram.ui.pn;
import org.telegram.ui.qw;
import org.telegram.ui.ww;
import org.telegram.ui.xv;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r2(di.y6 y6Var, c20 c20Var, long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.a = 3;
        this.c = y6Var;
        this.e = c20Var;
        this.b = j3;
        this.d = tL_premium_boostsStatus;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 0;
        long j3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj4;
                k7Var.c2.setLoading(false);
                ug.i0 i0Var = new ug.i0(26, k7Var.a, k7Var.getContext(), new w4(k7Var, i10), k7Var.I0);
                i0Var.A1((org.telegram.messenger.e3) obj);
                i0Var.z1((TL_stories.TL_premium_boostsStatus) obj3, true);
                i0Var.B1(j3);
                TLRPC.Chat M0 = ((qp) obj2).M0(Long.valueOf(-j3));
                if (M0 != null) {
                    i0Var.I2 = new j3(k7Var, M0);
                }
                i0Var.show();
                break;
            case 1:
                di.q qVar = (di.q) obj4;
                di.p pVar = (di.p) obj2;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    fi.va D = fi.va.D(qVar.e0.getParentActivity(), qVar.f);
                    D.N = j3;
                    fi.la laVar = D.c1;
                    if (laVar != null) {
                        laVar.setDialogId(j3);
                    }
                    D.M = false;
                    D.Q(fi.qa.c(pVar));
                    break;
                }
                break;
            case 2:
                di.y6 y6Var = (di.y6) obj4;
                c20 c20Var = (c20) obj3;
                qp qpVar = (qp) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    org.telegram.messenger.f3 G0 = qpVar.G0();
                    long j10 = this.b;
                    G0.b(j10, tL_premium_boostsStatus, new r2(y6Var, c20Var, j10, tL_premium_boostsStatus));
                    c20Var.a(Boolean.FALSE);
                    break;
                } else {
                    c20Var.a(Boolean.FALSE);
                    break;
                }
            case 3:
                di.y6 y6Var2 = (di.y6) obj4;
                c20 c20Var2 = (c20) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                org.telegram.messenger.e3 e3Var = (org.telegram.messenger.e3) obj;
                if (e3Var != null) {
                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                    r3 r3Var = y6Var2.j(j3) ? new r3(y6Var2, j3, 5) : null;
                    int i11 = ug.i0.O2;
                    if (Q != null && tL_premium_boostsStatus2 != null && Q.getContext() != null) {
                        ug.i0 i0Var2 = new ug.i0(18, Q.getCurrentAccount(), Q.getContext(), Q, Q.getResourceProvider());
                        i0Var2.A1(e3Var);
                        i0Var2.z1(tL_premium_boostsStatus2, true);
                        i0Var2.B1(j3);
                        i0Var2.I2 = r3Var;
                        i0Var2.show();
                    }
                    c20Var2.a(Boolean.FALSE);
                    break;
                } else {
                    c20Var2.a(Boolean.FALSE);
                    break;
                }
            case 4:
                pn.d0((pn) obj4, (org.telegram.ui.ActionBar.u1) obj2, (TL_stories.TL_premium_boostsStatus) obj3, this.b, (org.telegram.messenger.e3) obj);
                break;
            case 5:
                org.telegram.ui.ActionBar.f2[] f2VarArr = (org.telegram.ui.ActionBar.f2[]) obj2;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                ww wwVar = ((xv) obj4).b;
                wwVar.getMessagesController().T2(Long.valueOf(j3), null, 32);
                qw qwVar = wwVar.C2;
                wwVar.removeSelfFromStack();
                if (f2VarArr[1] != null) {
                    f2VarArr[0].removeSelfFromStack();
                    f2VarArr[1].finishFragment();
                } else {
                    f2VarArr[0].finishFragment();
                }
                if (qwVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(xr.a(-j3, 0L));
                    qwVar.y(wwVar, arrayList, null, false, wwVar.J2, wwVar.K2, wwVar.L2, null);
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                gf gfVar = (gf) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                if (bitmap == null) {
                    org.telegram.messenger.g0.h3(new cn0(photoViewer, 18));
                    break;
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(26.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                        canvas.scale(max, max);
                        canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                        org.telegram.messenger.g0.h3(new i0(photoViewer, gfVar, this.b, str, createBitmap, 14));
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        org.telegram.messenger.g0.h3(new cn0(photoViewer, 19));
                        return;
                    }
                }
            default:
                i5 i5Var = (i5) obj3;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                i5Var.s1(j3, new di.s2((zh.h1) obj4, bVar, (c20) obj2, i5Var, 19));
                break;
        }
    }

    public /* synthetic */ r2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    public /* synthetic */ r2(Object obj, Object obj2, Object obj3, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j3;
    }

    public /* synthetic */ r2(pn pnVar, org.telegram.ui.ActionBar.u1 u1Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j3) {
        this.a = 4;
        this.c = pnVar;
        this.e = u1Var;
        this.d = tL_premium_boostsStatus;
        this.b = j3;
    }
}
