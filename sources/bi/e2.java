package bi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import hi.ja;
import hi.oa;
import hi.ta;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.ef;
import org.telegram.messenger.fs;
import org.telegram.messenger.mp;
import org.telegram.messenger.sr;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.cw;
import org.telegram.ui.cx;
import org.telegram.ui.hn0;
import org.telegram.ui.rn;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e2(fi.p6 p6Var, x10 x10Var, long j3, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.a = 4;
        this.c = p6Var;
        this.e = x10Var;
        this.b = j3;
        this.d = tL_premium_boostsStatus;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        long j3 = this.b;
        int i10 = 1;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i7) {
            case 0:
                v2 v2Var = (v2) obj3;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                v2Var.w1(j3, new i2((j3) obj4, bVar, (x10) obj2, v2Var, 0));
                break;
            case 1:
                di.f6 f6Var = (di.f6) obj4;
                f6Var.g2.setLoading(false);
                ug.l0 l0Var = new ug.l0(26, f6Var.a, f6Var.getContext(), new y8(f6Var, i10), f6Var.J0);
                l0Var.B1((org.telegram.messenger.g3) obj);
                l0Var.A1((TL_stories.TL_premium_boostsStatus) obj3, true);
                l0Var.C1(j3);
                TLRPC.Chat O0 = ((mp) obj2).O0(Long.valueOf(-j3));
                if (O0 != null) {
                    l0Var.M2 = new di.t2(f6Var, O0);
                }
                l0Var.show();
                break;
            case 2:
                fi.q qVar = (fi.q) obj4;
                fi.p pVar = (fi.p) obj2;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ta D = ta.D(qVar.f0.getParentActivity(), qVar.f);
                    D.O = j3;
                    ja jaVar = D.d1;
                    if (jaVar != null) {
                        jaVar.setDialogId(j3);
                    }
                    D.N = false;
                    D.Q(oa.c(pVar));
                    break;
                }
                break;
            case 3:
                fi.p6 p6Var = (fi.p6) obj4;
                x10 x10Var = (x10) obj2;
                mp mpVar = (mp) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    org.telegram.messenger.h3 I0 = mpVar.I0();
                    long j10 = this.b;
                    I0.b(j10, tL_premium_boostsStatus, new e2(p6Var, x10Var, j10, tL_premium_boostsStatus));
                    x10Var.a(Boolean.FALSE);
                    break;
                } else {
                    x10Var.a(Boolean.FALSE);
                    break;
                }
            case 4:
                fi.p6 p6Var2 = (fi.p6) obj4;
                x10 x10Var2 = (x10) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj3;
                org.telegram.messenger.g3 g3Var = (org.telegram.messenger.g3) obj;
                if (g3Var != null) {
                    org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                    y3 y3Var = p6Var2.j(j3) ? new y3(p6Var2, j3, 6) : null;
                    int i11 = ug.l0.S2;
                    if (Q != null && tL_premium_boostsStatus2 != null && Q.getContext() != null) {
                        ug.l0 l0Var2 = new ug.l0(18, Q.getCurrentAccount(), Q.getContext(), Q, Q.getResourceProvider());
                        l0Var2.B1(g3Var);
                        l0Var2.A1(tL_premium_boostsStatus2, true);
                        l0Var2.C1(j3);
                        l0Var2.M2 = y3Var;
                        l0Var2.show();
                    }
                    x10Var2.a(Boolean.FALSE);
                    break;
                } else {
                    x10Var2.a(Boolean.FALSE);
                    break;
                }
            case 5:
                rn.d0((rn) obj4, (org.telegram.ui.ActionBar.u1) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.b, (org.telegram.messenger.g3) obj);
                break;
            case 6:
                org.telegram.ui.ActionBar.h2[] h2VarArr = (org.telegram.ui.ActionBar.h2[]) obj2;
                ((org.telegram.ui.ActionBar.u1) obj3).dismiss();
                cx cxVar = ((cw) obj4).b;
                cxVar.getMessagesController().Z2(Long.valueOf(j3), null, 32);
                ww wwVar = cxVar.E2;
                cxVar.removeSelfFromStack();
                if (h2VarArr[1] != null) {
                    h2VarArr[0].removeSelfFromStack();
                    h2VarArr[1].finishFragment();
                } else {
                    h2VarArr[0].finishFragment();
                }
                if (wwVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(sr.a(-j3, 0L));
                    wwVar.y(cxVar, arrayList, null, false, cxVar.L2, cxVar.M2, cxVar.N2, null);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                ef efVar = (ef) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                if (bitmap == null) {
                    org.telegram.messenger.g0.g3(new hn0(photoViewer, 18));
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
                        org.telegram.messenger.g0.g3(new k2(photoViewer, efVar, this.b, str, createBitmap, 14));
                        break;
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                        org.telegram.messenger.g0.g3(new hn0(photoViewer, 19));
                    }
                }
        }
    }

    public /* synthetic */ e2(fi.p6 p6Var, x10 x10Var, mp mpVar, long j3) {
        this.a = 3;
        this.c = p6Var;
        this.e = x10Var;
        this.d = mpVar;
        this.b = j3;
    }

    public /* synthetic */ e2(Object obj, Object obj2, long j3, Object obj3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
        this.e = obj3;
    }

    public /* synthetic */ e2(fs fsVar, Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = fsVar;
        this.d = obj;
        this.e = obj2;
        this.b = j3;
    }
}
