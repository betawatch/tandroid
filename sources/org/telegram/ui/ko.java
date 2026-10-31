package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ko implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ko(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = j10;
        this.e = obj3;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        long j10 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                oo.c0((oo) obj4, (org.telegram.ui.ActionBar.x1) obj3, (TL_stories.TL_premium_boostsStatus) obj2, this.c, (org.telegram.messenger.h3) obj);
                break;
            case 1:
                org.telegram.ui.ActionBar.k2[] k2VarArr = (org.telegram.ui.ActionBar.k2[]) obj2;
                ((org.telegram.ui.ActionBar.x1) obj3).dismiss();
                ay ayVar = ((cx) obj4).b;
                ayVar.getMessagesController().R2(Long.valueOf(j10), null, 32);
                ux uxVar = ayVar.C2;
                ayVar.removeSelfFromStack();
                if (k2VarArr[1] != null) {
                    k2VarArr[0].removeSelfFromStack();
                    k2VarArr[1].finishFragment();
                } else {
                    k2VarArr[0].finishFragment();
                }
                if (uxVar != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(org.telegram.messenger.gs.a(-j10, 0L));
                    uxVar.y(ayVar, arrayList, null, false, ayVar.J2, ayVar.K2, ayVar.L2, null);
                    break;
                }
                break;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                String str = (String) obj3;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (bitmap == null) {
                    org.telegram.messenger.i0.g3(new qo0(photoViewer, 16));
                    break;
                } else {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                        fileOutputStream.close();
                        Bitmap createBitmap = Bitmap.createBitmap(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(26.0f), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        canvas.translate(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f);
                        float max = Math.max(createBitmap.getWidth() / bitmap.getWidth(), createBitmap.getHeight() / bitmap.getHeight());
                        canvas.scale(max, max);
                        canvas.drawBitmap(bitmap, (-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f, paint);
                        org.telegram.messenger.i0.g3(new org.telegram.messenger.voip.g(photoViewer, efVar, this.c, str, createBitmap, 6));
                        break;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                        org.telegram.messenger.i0.g3(new qo0(photoViewer, 17));
                        return;
                    }
                }
            case 3:
                ph.w0 w0Var = (ph.w0) obj3;
                gf.e eVar = (gf.e) obj;
                eVar.d();
                w0Var.s1(j10, new ag.m2((ph.l1) obj4, eVar, (org.telegram.messenger.q20) obj2, w0Var, 16));
                break;
            case 4:
                rh.e4 e4Var = (rh.e4) obj4;
                e4Var.c2.setLoading(false);
                kg.q0 q0Var = new kg.q0(26, e4Var.a, e4Var.getContext(), new kg.q1(e4Var, 9), e4Var.I0);
                q0Var.A1((org.telegram.messenger.h3) obj);
                q0Var.z1((TL_stories.TL_premium_boostsStatus) obj2, true);
                q0Var.B1(j10);
                TLRPC.Chat L0 = ((org.telegram.messenger.vp) obj3).L0(Long.valueOf(-j10));
                if (L0 != null) {
                    q0Var.I2 = new mg.h(e4Var, L0);
                }
                q0Var.show();
                break;
            case 5:
                th.m mVar = (th.m) obj4;
                th.l lVar = (th.l) obj2;
                ((org.telegram.ui.ActionBar.x1) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    vh.o8 D = vh.o8.D(mVar.e0.getParentActivity(), mVar.f);
                    D.N = j10;
                    vh.e8 e8Var = D.c1;
                    if (e8Var != null) {
                        e8Var.setDialogId(j10);
                    }
                    D.M = false;
                    D.Q(vh.j8.c(lVar));
                    break;
                }
                break;
            case 6:
                th.e5 e5Var = (th.e5) obj4;
                org.telegram.messenger.q20 q20Var = (org.telegram.messenger.q20) obj3;
                org.telegram.messenger.vp vpVar = (org.telegram.messenger.vp) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                if (tL_premium_boostsStatus != null) {
                    org.telegram.messenger.i3 G0 = vpVar.G0();
                    long j11 = this.c;
                    G0.b(j11, tL_premium_boostsStatus, new ko(e5Var, q20Var, j11, tL_premium_boostsStatus, 7));
                    q20Var.a(Boolean.FALSE);
                    break;
                } else {
                    q20Var.a(Boolean.FALSE);
                    break;
                }
            default:
                th.e5 e5Var2 = (th.e5) obj4;
                org.telegram.messenger.q20 q20Var2 = (org.telegram.messenger.q20) obj3;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj2;
                org.telegram.messenger.h3 h3Var = (org.telegram.messenger.h3) obj;
                if (h3Var != null) {
                    org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                    bi.e eVar2 = e5Var2.j(j10) ? new bi.e(e5Var2, j10, 26) : null;
                    int i11 = kg.q0.O2;
                    if (Q != null && tL_premium_boostsStatus2 != null && Q.getContext() != null) {
                        kg.q0 q0Var2 = new kg.q0(18, Q.getCurrentAccount(), Q.getContext(), Q, Q.getResourceProvider());
                        q0Var2.A1(h3Var);
                        q0Var2.z1(tL_premium_boostsStatus2, true);
                        q0Var2.B1(j10);
                        q0Var2.I2 = eVar2;
                        q0Var2.show();
                    }
                    q20Var2.a(Boolean.FALSE);
                    break;
                } else {
                    q20Var2.a(Boolean.FALSE);
                    break;
                }
        }
    }

    public /* synthetic */ ko(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.e = obj3;
        this.c = j10;
    }

    public /* synthetic */ ko(rh.e4 e4Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, org.telegram.messenger.vp vpVar) {
        this.a = 4;
        this.d = e4Var;
        this.e = tL_premium_boostsStatus;
        this.c = j10;
        this.b = vpVar;
    }
}
