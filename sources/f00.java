// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import java.util.Collections;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class f00 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((m00) obj).onBackPressed();
                break;
            case 1:
                yh4 yh4Var = (yh4) obj;
                ((Context) yh4Var.b).unregisterReceiver((p00) yh4Var.c);
                break;
            case 2:
                p00 p00Var = (p00) obj;
                if (p00Var.c.a) {
                    p00Var.a.a.v1(3, false);
                    break;
                }
                break;
            case 3:
                ((u00) obj).l();
                break;
            case 4:
                ((h30) obj).n.r1.setVisibility(8);
                break;
            case 5:
                a86 a86Var = (a86) obj;
                a86Var.getClass();
                if (Thread.currentThread() == a86Var.a) {
                    a86Var.e(-1, new w00((byte) 3));
                    break;
                }
                break;
            case 6:
                ((y70) ((trc) obj).d).n();
                break;
            case 7:
                bd0 bd0Var = (bd0) obj;
                if (!bd0Var.x) {
                    bd0Var.x = true;
                    vs9.d(new f(bd0Var, (byte) 13));
                    break;
                }
                break;
            case 8:
                be0 be0Var = (be0) obj;
                be0Var.b.g3.O(true);
                be0Var.Z(true);
                break;
            case 9:
                gf0 gf0Var = (gf0) obj;
                new exa(gf0Var.getContext(), gf0Var.b).show();
                break;
            case 10:
                try {
                    ((Bitmap) obj).recycle();
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 11:
                vl0 vl0Var = (vl0) obj;
                vl0Var.o = true;
                vl0Var.d.invalidate();
                break;
            case 12:
                ul0 ul0Var = (ul0) obj;
                if (!ul0Var.a) {
                    vl0 vl0Var2 = ul0Var.d;
                    Bitmap[] bitmapArr = vl0Var2.g;
                    Canvas[] canvasArr = vl0Var2.h;
                    vl0Var2.g = vl0Var2.f;
                    vl0Var2.h = vl0Var2.i;
                    vl0Var2.f = bitmapArr;
                    vl0Var2.i = canvasArr;
                    vl0Var2.k = false;
                    a91 a91Var = vl0Var2.d;
                    if (a91Var != null) {
                        a91Var.invalidate();
                        break;
                    }
                }
                break;
            case 13:
                sm0 sm0Var = ((xm0) obj).t;
                if (sm0Var != null) {
                    sm0Var.d();
                    break;
                }
                break;
            case 14:
                sm0 sm0Var2 = (sm0) obj;
                sm0Var2.o = (Bitmap) sm0Var2.n.c;
                sm0Var2.d();
                break;
            case 15:
                cb cbVar = ((dn0) ((cn0) obj).c).f;
                if (cbVar != null) {
                    cbVar.d();
                    break;
                }
                break;
            case 16:
                ((wo0) obj).a(null);
                break;
            case 17:
                ((u35) obj).a(Collections.EMPTY_LIST);
                break;
            case 18:
                ((to0) obj).a(null);
                break;
            case 19:
                ((iq0) obj).invalidateSelf();
                break;
            case 20:
                ((jq0) obj).invalidateSelf();
                break;
            case 21:
                ((lq0) obj).d();
                break;
            case 22:
                yq0 yq0Var = (yq0) obj;
                gm.r(yq0Var.b0);
                yq0Var.N = false;
                yq0Var.invalidate();
                break;
            case 23:
                ((xq0) obj).invalidateSelf();
                break;
            case 24:
                gs0 gs0Var = (gs0) obj;
                kea keaVar = gs0Var.a0;
                t3b t3bVar = gs0Var.a;
                keaVar.a(t3bVar == null ? "" : t3bVar.E);
                break;
            case 25:
                ((ss0) obj).e();
                break;
            case 26:
            case 27:
                ((ts0) obj).c();
                break;
            case 28:
                ((us0) obj).a();
                break;
            default:
                ((vs0) obj).a();
                break;
        }
    }
}
