// default package

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class k22 implements rac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k22(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // rac
    public final Object a(Object obj) {
        gd1 gd1Var;
        byte b = this.a;
        byte b2 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                k47 k47Var = (k47) obj;
                ((s22) obj2).P = k47Var;
                return Boolean.valueOf(MediaController.w().n0(td4.u(k47Var), k47Var, 0L, true, null, 0L));
            case 1:
                uf8 uf8Var = (uf8) obj2;
                View view = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view);
                meb c = eq3.c((cmb.I.o() ? (byte) 3 : (byte) 6) * 0.12f, cmb.Fc);
                c.t = true;
                c.m = cmb.gf;
                imageReceiver.a0(gn5.p(vuc.b(uf8Var.b.geo, nm7.W4, nm7.x2, 15, Math.min(2, (int) Math.ceil(gm.p)))), null, null, null, new bk2(c), null, 0);
                view.addOnAttachStateChangeListener(new tf8(imageReceiver, objArr == true ? 1 : 0));
                imageReceiver.q0(gm.L(14.0f));
                return new yb1(imageReceiver, view.getContext().getResources().getDrawable(R.drawable.map_pin).mutate(), (byte) 4);
            case 2:
                return ((View) obj).getParent() != ((h15) obj2).c ? Boolean.FALSE : Boolean.valueOf(!l7c.K(r0.T(r1).f));
            case 3:
                Paint[] paintArr = ((if5) obj2).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 4:
                ry5 ry5Var = (ry5) obj2;
                Integer num = (Integer) obj;
                if (num.intValue() == 2) {
                    i22 i22Var = new i22(ry5Var.getContext(), new hy5(ry5Var), false, false, false, ry5Var.G1);
                    i22Var.n = true;
                    i22Var.v1(jb6.M0(2131754425, null));
                    i22Var.W3 = new mj4(ry5Var, i22Var, objArr2 == true ? 1 : 0, r4);
                    i22Var.setOnDismissListener(new g5((byte) 5));
                    i22Var.t1(1, false);
                    i22Var.Z0();
                    MediaController.h2 = true;
                    i22Var.d2.h0();
                    i22Var.show();
                } else if (num.intValue() == 6 && (gd1Var = ry5Var.P1) != null) {
                    gd1Var.a();
                }
                return Boolean.TRUE;
            case 5:
                wg6 wg6Var = (wg6) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    return Boolean.FALSE;
                }
                gm.c3(new sg6(wg6Var, b2));
                return Boolean.TRUE;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.e7;
                profileActivity.getClass();
                if (uRLSpan == null) {
                    return Boolean.FALSE;
                }
                profileActivity.i3(uRLSpan.getURL(), null);
                return Boolean.TRUE;
            case 7:
                int i = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i == 1);
            case 8:
                k47 k47Var2 = (k47) obj;
                ((zz9) obj2).k2 = k47Var2;
                return Boolean.valueOf(MediaController.w().n0(td4.u(k47Var2), k47Var2, 0L, true, null, 0L));
            case 9:
                uwa uwaVar = (uwa) obj2;
                return uwaVar.r[((Integer) obj).intValue() % uwaVar.r.length];
            case 10:
                wfb wfbVar = (wfb) obj2;
                return wfbVar.r[((Integer) obj).intValue() % wfbVar.r.length];
            case 11:
                return ((View) obj).getParent() != ((q7c) obj2) ? Boolean.FALSE : Boolean.valueOf(!l7c.K(r0.T(r1).f));
            default:
                return new ptc((wu) obj2, (Integer) obj, b2);
        }
    }
}
