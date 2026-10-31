package ag;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.nm;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.vs;
import org.telegram.ui.ad;
import org.telegram.ui.cp;
import org.telegram.ui.dc;
import org.telegram.ui.h8;
import org.telegram.ui.ic;
import org.telegram.ui.iq;
import org.telegram.ui.j6;
import org.telegram.ui.j9;
import org.telegram.ui.jc;
import org.telegram.ui.kd;
import org.telegram.ui.l01;
import org.telegram.ui.oa;
import org.telegram.ui.oo;
import org.telegram.ui.p4;
import org.telegram.ui.qp;
import org.telegram.ui.s9;
import org.telegram.ui.sb;
import org.telegram.ui.u9;
import org.telegram.ui.v50;
import org.telegram.ui.x5;
import org.telegram.ui.xp;
import org.telegram.ui.y6;
import org.telegram.ui.z9;
import org.telegram.ui.zc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        int i11;
        int i12;
        p6 p6Var;
        i5 i5Var;
        i5 i5Var2;
        int i13;
        int i14;
        int i15 = this.a;
        int i16 = 4;
        final int i17 = 0;
        final int i18 = 1;
        Object obj = this.b;
        switch (i15) {
            case 0:
                f fVar = (f) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        fVar.b0();
                        break;
                    }
                } else if (fVar.onBackPressed(true)) {
                    fVar.finishFragment();
                    break;
                }
                break;
            case 1:
                w wVar = (w) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        wVar.l0();
                        break;
                    }
                } else if (wVar.onBackPressed(true)) {
                    wVar.finishFragment();
                    break;
                }
                break;
            case 2:
                t1 t1Var = (t1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        t1Var.e0();
                        break;
                    }
                } else if (t1Var.onBackPressed(true)) {
                    t1Var.finishFragment();
                    break;
                }
                break;
            case 3:
                v1 v1Var = (v1) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        v1Var.b0();
                        break;
                    }
                } else if (v1Var.onBackPressed(true)) {
                    v1Var.finishFragment();
                    break;
                }
                break;
            case 4:
                f2 f2Var = (f2) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        f2Var.a0();
                        break;
                    }
                } else if (f2Var.onBackPressed(true)) {
                    f2Var.finishFragment();
                    break;
                }
                break;
            case 5:
                h2 h2Var = (h2) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        h2Var.h0();
                        break;
                    }
                } else if (h2Var.onBackPressed(true)) {
                    h2Var.finishFragment();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((j2) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                z2 z2Var = (z2) obj;
                ArrayList arrayList = z2Var.b;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, z2Var.getParentActivity(), z2Var.getResourceProvider());
                            String G = cd.G(arrayList.size(), "BusinessRepliesDeleteTitle", new Object[0]);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = G;
                            x1Var.T = cd.G(arrayList.size(), "BusinessRepliesDeleteMessage", new Object[0]);
                            alertDialog$Builder.k(cd.L0(2131746336, null), new a1.c(this, i16));
                            alertDialog$Builder.h(cd.L0(2131752589, null), null);
                            z2Var.showDialog(x1Var);
                            break;
                        }
                    } else if (arrayList.size() == 1) {
                        int intValue = ((Integer) arrayList.get(0)).intValue();
                        i11 = ((org.telegram.ui.ActionBar.k2) z2Var).currentAccount;
                        h3 c10 = i3.f(i11).c(intValue);
                        if (c10 != null) {
                            Activity parentActivity = z2Var.getParentActivity();
                            i12 = ((org.telegram.ui.ActionBar.k2) z2Var).currentAccount;
                            p6Var = ((org.telegram.ui.ActionBar.k2) z2Var).resourceProvider;
                            z2.h0(parentActivity, i12, null, c10, p6Var, new s2(this, intValue, 0));
                            break;
                        }
                    }
                } else if (!arrayList.isEmpty()) {
                    z2.b0(z2Var);
                    break;
                } else {
                    z2Var.finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((m3) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((kg.i1) obj).dismiss();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((org.telegram.ui.f) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((org.telegram.ui.j) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((org.telegram.ui.n) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((l01) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((p4) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((x5) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                y6 y6Var = (y6) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                y6.k0(y6Var, true);
                                break;
                            }
                        } else {
                            y6.k0(y6Var, false);
                            break;
                        }
                    } else {
                        y6.j0(y6Var);
                        break;
                    }
                } else {
                    i5Var = ((org.telegram.ui.ActionBar.k2) y6Var).simpleActionBar;
                    if (!i5Var.s()) {
                        y6Var.finishFragment();
                        break;
                    } else {
                        sh.b bVar = y6Var.d0;
                        if (bVar != null) {
                            bVar.d();
                        }
                        j6 j6Var = y6Var.M;
                        if (j6Var != null) {
                            j6Var.f(false);
                            y6Var.M.e();
                            break;
                        }
                    }
                }
                break;
            case 17:
                h8 h8Var = (h8) obj;
                if (i10 == -1) {
                    if (h8Var.P != 0 || h8Var.Q != 0 || h8Var.G) {
                        h8Var.G = false;
                        h8Var.P = 0;
                        h8Var.Q = 0;
                        h8Var.A0();
                        h8Var.t0();
                        break;
                    } else {
                        h8Var.finishFragment();
                        break;
                    }
                }
                break;
            case 18:
                j9 j9Var = (j9) obj;
                if (i10 != -1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            j9.d0(j9Var, true);
                            break;
                        }
                    } else {
                        j9.d0(j9Var, false);
                        break;
                    }
                } else {
                    i5Var2 = ((org.telegram.ui.ActionBar.k2) j9Var).simpleActionBar;
                    if (!i5Var2.s()) {
                        j9Var.finishFragment();
                        break;
                    } else {
                        j9Var.i0(true);
                        break;
                    }
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((u9) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                z9 z9Var = (z9) obj;
                if (i10 != -1) {
                    if (i10 == 1 && z9Var.a.getText().length() != 0) {
                        z9.Y(z9Var);
                        z9Var.finishFragment();
                        break;
                    }
                } else {
                    z9Var.finishFragment();
                    break;
                }
                break;
            case 21:
                oa oaVar = (oa) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        oa.c0(oaVar);
                        oa.d0(oaVar);
                        break;
                    }
                } else {
                    oaVar.finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((sb) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                zc zcVar = (zc) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        FrameLayout frameLayout = (FrameLayout) zcVar.getParentActivity().getWindow().getDecorView();
                        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        zcVar.L.setAlpha(0.0f);
                        frameLayout.draw(canvas);
                        zcVar.L.setAlpha(1.0f);
                        Paint paint = new Paint(1);
                        paint.setColor(-16777216);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        Paint paint2 = new Paint(1);
                        paint2.setFilterBitmap(true);
                        int[] iArr = new int[2];
                        zcVar.L.getLocationInWindow(iArr);
                        float f7 = iArr[0];
                        float f10 = iArr[1];
                        float max = Math.max(createBitmap.getHeight(), createBitmap.getWidth()) + org.telegram.messenger.i0.n;
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                        ic icVar = new ic(zcVar, zcVar.getParentActivity(), canvas, (zcVar.L.getMeasuredWidth() / 2.0f) + f7, (zcVar.L.getMeasuredHeight() / 2.0f) + f10, max, paint, createBitmap, paint2, f7, f10, 0);
                        zcVar.m0 = icVar;
                        icVar.setOnTouchListener(new org.telegram.ui.ActionBar.n2(1));
                        zcVar.n0 = 0.0f;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        zcVar.o0 = ofFloat;
                        ofFloat.addUpdateListener(new jc(zcVar, 0));
                        zcVar.o0.addListener(new s9(zcVar, 14));
                        zcVar.o0.setDuration(400L);
                        zcVar.o0.setInterpolator(vs.e);
                        zcVar.o0.start();
                        frameLayout.addView(zcVar.m0, new ViewGroup.LayoutParams(-1, -1));
                        org.telegram.messenger.i0.g3(new dc(zcVar, 0));
                        break;
                    }
                } else if (zcVar.b >= zcVar.Y0() && zcVar.W0()) {
                    zcVar.b1();
                    break;
                } else {
                    zcVar.finishFragment();
                    break;
                }
                break;
            case 24:
                kd kdVar = (kd) obj;
                long j10 = kdVar.j0;
                ad adVar = kdVar.w0;
                if (i10 != -1) {
                    if (i10 == 1) {
                        int i19 = kdVar.i0;
                        if (i19 != 0) {
                            if (i19 == 1) {
                                if (kdVar.b0) {
                                    j20 j20Var = kdVar.u0;
                                    if (j20Var != null) {
                                        j20Var.a(kdVar, Long.valueOf(j10));
                                    }
                                } else if (kdVar.y.length() == 0) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kdVar.getParentActivity());
                                    String L0 = cd.L0(2131752316, null);
                                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                                    x1Var2.R = L0;
                                    x1Var2.T = cd.L0(2131752317, null);
                                    alertDialog$Builder2.k(cd.L0(2131752041, null), null);
                                    kdVar.showDialog(x1Var2);
                                    break;
                                } else if (!kdVar.a0) {
                                    Vibrator vibrator = (Vibrator) kdVar.getParentActivity().getSystemService("vibrator");
                                    if (vibrator != null) {
                                        vibrator.vibrate(200L);
                                    }
                                    org.telegram.messenger.i0.E3(kdVar.V);
                                    break;
                                } else {
                                    org.telegram.messenger.i0.h3(adVar, 200L);
                                    i13 = ((org.telegram.ui.ActionBar.k2) kdVar).currentAccount;
                                    vp r12 = vp.r1(i13);
                                    long j11 = kdVar.j0;
                                    String str = kdVar.Y;
                                    Runnable runnable = new Runnable(this) { // from class: org.telegram.ui.fd
                                        public final /* synthetic */ ag.e b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i17) {
                                                case 0:
                                                    kd kdVar2 = (kd) this.b.b;
                                                    kdVar2.l0(false);
                                                    org.telegram.messenger.j20 j20Var2 = kdVar2.u0;
                                                    if (j20Var2 != null) {
                                                        j20Var2.a(kdVar2, Long.valueOf(kdVar2.j0));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    kd kdVar3 = (kd) this.b.b;
                                                    kdVar3.l0(false);
                                                    org.telegram.messenger.j20 j20Var3 = kdVar3.u0;
                                                    if (j20Var3 != null) {
                                                        j20Var3.a(kdVar3, Long.valueOf(kdVar3.j0));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    Runnable runnable2 = new Runnable(this) { // from class: org.telegram.ui.fd
                                        public final /* synthetic */ ag.e b;

                                        {
                                            this.b = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i18) {
                                                case 0:
                                                    kd kdVar2 = (kd) this.b.b;
                                                    kdVar2.l0(false);
                                                    org.telegram.messenger.j20 j20Var2 = kdVar2.u0;
                                                    if (j20Var2 != null) {
                                                        j20Var2.a(kdVar2, Long.valueOf(kdVar2.j0));
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    kd kdVar3 = (kd) this.b.b;
                                                    kdVar3.l0(false);
                                                    org.telegram.messenger.j20 j20Var3 = kdVar3.u0;
                                                    if (j20Var3 != null) {
                                                        j20Var3.a(kdVar3, Long.valueOf(kdVar3.j0));
                                                        break;
                                                    }
                                                    break;
                                            }
                                        }
                                    };
                                    TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                                    tL_channels_updateUsername.channel = r12.g1(j11);
                                    tL_channels_updateUsername.username = str;
                                    r12.getConnectionsManager().sendRequest(tL_channels_updateUsername, new nm(r12, j11, str, runnable, kdVar, tL_channels_updateUsername, runnable2), 64);
                                }
                                if (kdVar.u0 == null) {
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("step", 2);
                                    bundle.putLong("chatId", j10);
                                    bundle.putInt("chatType", 2);
                                    kdVar.presentFragment(new v50(bundle), true);
                                    break;
                                }
                            }
                        } else if (kdVar.getParentActivity() != null) {
                            if (!kdVar.s0) {
                                if (kdVar.d.a.length() != 0) {
                                    kdVar.s0 = true;
                                    org.telegram.messenger.i0.h3(adVar, 200L);
                                    if (!kdVar.x.g()) {
                                        i14 = ((org.telegram.ui.ActionBar.k2) kdVar).currentAccount;
                                        kdVar.t0 = Integer.valueOf(vp.r1(i14).U(kdVar.d.getText().toString(), new ArrayList(), kdVar.y.getText().toString(), 2, false, null, null, -1, kdVar));
                                        break;
                                    } else {
                                        kdVar.r0 = true;
                                        break;
                                    }
                                } else {
                                    Vibrator vibrator2 = (Vibrator) kdVar.getParentActivity().getSystemService("vibrator");
                                    if (vibrator2 != null) {
                                        vibrator2.vibrate(200L);
                                    }
                                    org.telegram.messenger.i0.E3(kdVar.d);
                                    break;
                                }
                            } else {
                                kd.c0(kdVar);
                                break;
                            }
                        }
                    }
                } else if (!kdVar.s0) {
                    kdVar.finishFragment();
                    break;
                } else {
                    kd.c0(kdVar);
                    break;
                }
                break;
            case 25:
                oo ooVar = (oo) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        ooVar.n0();
                        break;
                    }
                } else if (ooVar.i0(true)) {
                    ooVar.finishFragment();
                    break;
                }
                break;
            case 26:
                cp cpVar = (cp) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        l5 l5Var = cpVar.r;
                        if (l5Var == null || !l5Var.y.f) {
                            cpVar.d0();
                            break;
                        }
                    }
                } else {
                    cpVar.finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((qp) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((xp) obj).finishFragment();
                    break;
                }
                break;
            default:
                iq iqVar = (iq) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        iqVar.v0(true);
                        break;
                    }
                } else if (iqVar.q0(true)) {
                    iqVar.finishFragment();
                    break;
                }
                break;
        }
    }
}
