// default package

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class nsa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nsa(hx3 hx3Var, int i) {
        this.a = (byte) 8;
        this.b = hx3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                ssa ssaVar = (ssa) obj;
                nsa nsaVar = ssaVar.p0;
                bf0[] bf0VarArr = ssaVar.d;
                if (!bf0VarArr[2 - ssaVar.y0].getImageReceiver().C()) {
                    gm.r(nsaVar);
                    gm.d3(nsaVar, 150L);
                    break;
                } else {
                    xra xraVar = ssaVar.b0;
                    if (xraVar != null && xraVar.b == 1 && ssaVar.isAttachedToWindow()) {
                        gm.r(nsaVar);
                        ValueAnimator valueAnimator = ssaVar.o0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            ssaVar.o0 = null;
                        }
                        int i = 1 - ssaVar.y0;
                        ssaVar.y0 = i;
                        p09 y = bf0VarArr[2 - i].getImageReceiver().y();
                        p09 y2 = bf0VarArr[ssaVar.y0 + 1].getImageReceiver().y();
                        if (y2 != null && y != null) {
                            y2.O(false, y.o());
                        }
                        ssaVar.d0.b();
                        int i2 = ssaVar.y0 + 1;
                        TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = ssaVar.c0;
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ssaVar.f0.b();
                        stargiftattributebackdropArr[i2] = stargiftattributebackdrop;
                        ssaVar.e(i2, stargiftattributebackdrop);
                        ssaVar.g(1, (TL_stars.starGiftAttributePattern) ssaVar.e0.b(), true);
                        ssaVar.a();
                        float f = ssaVar.y0;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f, f);
                        ssaVar.o0 = ofFloat;
                        ofFloat.addUpdateListener(new psa(ssaVar, (byte) 2));
                        ssaVar.o0.addListener(new rsa(ssaVar));
                        ssaVar.o0.setDuration(320L);
                        ssaVar.o0.setInterpolator(d53.h);
                        ssaVar.o0.start();
                        break;
                    }
                }
                break;
            case 1:
                nxa nxaVar = (nxa) obj;
                if (nxaVar.V != null && nxaVar.b0 != -1) {
                    nxaVar.o1("POSTED_ALIGN");
                    nxaVar.V.a();
                    break;
                }
                break;
            case 2:
                ((ft4) obj).setPaused(true);
                break;
            case 3:
                ((q2a[]) obj)[0].dismiss();
                break;
            case 4:
                l11.u(((dxa) obj).getContext(), jb6.M0(2131744655, null));
                break;
            case 5:
                l11.u(((exa) obj).getContext(), jb6.M0(2131744655, null));
                break;
            case 6:
                xza xzaVar = (xza) obj;
                xzaVar.n0.a(xzaVar.k0.f0, xzaVar.l0.isAttachedToWindow());
                break;
            case 7:
                h0b h0bVar = (h0b) obj;
                if (h0bVar.isShowing()) {
                    h0bVar.E0(true);
                    break;
                }
                break;
            case 8:
                ((hx3) obj).m0(0);
                break;
            case 9:
                q0b q0bVar = (q0b) obj;
                if (!q0bVar.x) {
                    q0bVar.E = 0.0f;
                    break;
                }
                break;
            case 10:
                hs6.d0(z8c.t0).d(2, null, ((l1b) obj).f.document, (int) (System.currentTimeMillis() / 1000), false);
                break;
            case 11:
                ((g3b) obj).b();
                break;
            case 12:
                tr3 tr3Var = (tr3) obj;
                tr3Var.c(tr3Var.b);
                tr3Var.c = false;
                break;
            case 13:
                ((m7b) obj).run();
                break;
            case 14:
                l4b l4bVar = (l4b) obj;
                l4bVar.c();
                l4bVar.a(true);
                break;
            case 15:
                ((n3b) obj).a(null);
                break;
            case 16:
                ((u4b) obj).K();
                break;
            case 17:
                b5b b5bVar = (b5b) obj;
                ArrayList arrayList = b5bVar.c;
                if (arrayList != null) {
                    b5bVar.a.p1 = arrayList;
                }
                a58 a58Var = b5bVar.a;
                long j = b5bVar.b;
                if (a58Var.r1 != j || a58Var.p1 != null) {
                    a58Var.r1 = j;
                    a58Var.h1();
                    a58Var.f1();
                    a58Var.c1(true);
                    TL_stories.PeerStories peerStories = a58Var.z0.Q0;
                    h4b h4bVar = a58Var.I1;
                    if (peerStories == null) {
                        TL_stories.PeerStories x = h4bVar.x(j);
                        if (x == null) {
                            x = h4bVar.y(j);
                            z = true;
                        }
                        h4bVar.U(x, z);
                        break;
                    } else {
                        h4bVar.U(peerStories, true);
                        break;
                    }
                }
                break;
            case 18:
                ((i66) obj).e(true);
                break;
            case 19:
                ((y5b) obj).requestLayout();
                break;
            case 20:
                x6b x6bVar = (x6b) obj;
                hg5 hg5Var = x6bVar.c;
                if (hg5Var != null) {
                    hg5Var.f(true);
                    x6bVar.c = null;
                }
                x6bVar.b(false);
                break;
            case 21:
                v6b v6bVar = (v6b) obj;
                if (v6bVar.w) {
                    v6bVar.F = true;
                    v6bVar.G = System.currentTimeMillis();
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    v6bVar.e = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 771751935, 771751935, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    v6bVar.f = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 553648127, 553648127, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                    v6bVar.invalidate();
                    break;
                }
                break;
            case 22:
                b61 b61Var = (b61) obj;
                if (b61Var != null) {
                    b61Var.setLoading(false);
                    break;
                }
                break;
            case 23:
                ((x7b) ((i1a) obj).n).fullScroll(nm7.N1);
                break;
            case 24:
                u9b u9bVar = (u9b) obj;
                u9bVar.n0.onTouchEvent(gm.R());
                u9bVar.m0.I(gm.R());
                break;
            case 25:
                v9b v9bVar = (v9b) ((wt4) obj).m0;
                v9bVar.t(true);
                v9bVar.B0.setCameraThumb(v9bVar.y());
                break;
            case 26:
                a9b a9bVar = (a9b) obj;
                v9b v9bVar2 = a9bVar.c0;
                if (!v9bVar2.R1 && !v9bVar2.Q1 && v9bVar2.C0 != null && v9bVar2.g0 == 0 && v9bVar2.n1 != null) {
                    String M0 = jb6.M0(a9bVar.isFrontface() ? 2131744399 : 2131744398, null);
                    hg5 hg5Var2 = v9bVar2.n1;
                    hg5Var2.h = hg5.a(M0, hg5Var2.getTextPaint());
                    v9bVar2.n1.t(M0);
                    v9bVar2.n1.v();
                    oc7.d1().edit().putInt("storysvddualhint", oc7.d1().getInt("storysvddualhint", 0) + 1).apply();
                    break;
                }
                break;
            case 27:
                ((bf0) obj).setVisibility(8);
                break;
            case 28:
                oab oabVar = ((x9b) obj).b;
                try {
                    cab cabVar = oabVar.s;
                    if (cabVar != null) {
                        if (oabVar.b) {
                            gm.B2(cabVar);
                        } else {
                            oabVar.n.removeView(cabVar);
                        }
                        oabVar.s = null;
                        oabVar.q();
                        break;
                    }
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                ((cab) obj).y0.O(true);
                break;
        }
    }

    public /* synthetic */ nsa(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
