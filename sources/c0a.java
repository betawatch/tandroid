// default package

import android.content.SharedPreferences;
import android.location.Location;
import android.opengl.Matrix;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class c0a implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c0a(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0176 A[ADDED_TO_REGION, LOOP:1: B:38:0x0176->B:39:0x0178, LOOP_START, PHI: r6
      0x0176: PHI (r6v5 int) = (r6v0 int), (r6v6 int) binds: [B:37:0x0174, B:39:0x0178] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        char c;
        char c2;
        int i;
        boolean z3 = true;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((d0a) this.b).a();
                return;
            case 1:
                ((d1a) this.b).f();
                return;
            case 2:
                new kj8(((e2a) this.b).d.L.f, 14, false).show();
                return;
            case 3:
                gm.E3(((q2a) this.b).m1);
                return;
            case 4:
                ((h2b) this.b).a(null);
                return;
            case 5:
                gm.c3((e4a) this.b);
                return;
            case 6:
                a6a a6aVar = (a6a) this.b;
                a6aVar.getNotificationCenter().a(a6aVar, nm7.U1);
                a6aVar.getNotificationCenter().a(a6aVar, nm7.W1);
                a6aVar.getNotificationCenter().a(a6aVar, nm7.V1);
                a6aVar.getNotificationCenter().a(a6aVar, nm7.a2);
                a6aVar.getNotificationCenter().a(a6aVar, nm7.b2);
                a6aVar.getNotificationCenter().a(a6aVar, nm7.c2);
                a6aVar.getNotificationCenter().a(a6aVar, nm7.S1);
                a6aVar.getNotificationCenter().a(a6aVar, nm7.R1);
                a6aVar.getNotificationCenter().a(a6aVar, nm7.Y1);
                a6aVar.getNotificationCenter().a(a6aVar, nm7.Z1);
                return;
            case 7:
                eq eqVar = (eq) this.b;
                w5a w5aVar = (w5a) eqVar.a;
                Location location = (Location) eqVar.f;
                if (location != null) {
                    w5aVar.U(location);
                } else {
                    w5aVar.Q();
                }
                eqVar.c();
                return;
            case 8:
                ((SessionsActivity) this.b).m0();
                return;
            case 9:
                ((aca) this.b).b.W0(1);
                return;
            case 10:
                bda bdaVar = (bda) this.b;
                pw3[] pw3VarArr = bdaVar.a;
                if (bdaVar.b != 1) {
                    for (pw3 pw3Var : pw3VarArr) {
                        lka lkaVar = (lka) pw3Var.e;
                        lkaVar.setAlpha(1.0f);
                        lkaVar.setScaleX(1.0f);
                        lkaVar.setScaleY(1.0f);
                        ((lka) pw3Var.f).setAlpha(0.0f);
                    }
                    bdaVar.F = false;
                    gm.d3(bdaVar.H, 4000L);
                    return;
                }
                bdaVar.F = !bdaVar.F;
                int length = pw3VarArr.length;
                while (i2 < length) {
                    pw3 pw3Var2 = pw3VarArr[i2];
                    lka lkaVar2 = (lka) pw3Var2.e;
                    lka lkaVar3 = (lka) pw3Var2.f;
                    lkaVar2.setPivotX(0.0f);
                    lkaVar3.setPivotX(0.0f);
                    boolean z4 = bdaVar.F;
                    lka lkaVar4 = (lka) pw3Var2.e;
                    if (z4) {
                        lkaVar4.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        lkaVar3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    } else {
                        lkaVar4.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        lkaVar3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                    }
                    i2++;
                }
                gm.d3(bdaVar.H, 4000L);
                return;
            case 11:
                ((pw3) this.b).setVisibility(8);
                return;
            case 12:
                nha nhaVar = ((kea) this.b).H;
                if (nhaVar.F1) {
                    nhaVar.l1(false);
                    return;
                }
                return;
            case 13:
                ((sfa) this.b).a.z1(false);
                return;
            case 14:
                d dVar = ((zfa) this.b).f.y1;
                if (dVar != null) {
                    dVar.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                    return;
                }
                return;
            case 15:
                ((c0a) this.b).run();
                return;
            case 16:
                yga ygaVar = (yga) this.b;
                ArrayList arrayList = ygaVar.f;
                if (ygaVar.h) {
                    ygaVar.h = false;
                    ArrayList arrayList2 = new ArrayList();
                    while (i2 < arrayList.size()) {
                        if (((vr9) arrayList.get(i2)).b) {
                            arrayList2.add(Long.valueOf(((vr9) arrayList.get(i2)).a));
                        }
                        i2++;
                    }
                    wr9 E1 = ygaVar.y.y1.getMessagesController().E1();
                    ArrayList d = wr9.d(E1.j);
                    int i3 = E1.a;
                    if (arrayList2.size() > (z8c.h(i3).p() ? oc7.r1(i3).l4.i2.f() : oc7.r1(i3).l4.h2.f()) || wr9.j(d, arrayList2)) {
                        return;
                    }
                    E1.o(arrayList2);
                    return;
                }
                return;
            case 17:
                ((zga) this.b).F();
                return;
            case 18:
                ((sha) this.b).h();
                return;
            case 19:
                wm9 wm9Var = (wm9) this.b;
                synchronized (((ArrayDeque) wm9Var.c)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) wm9Var.b).edit();
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) wm9Var.c).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(",");
                    }
                    edit.putString("topic_operation_queue", sb.toString()).apply();
                }
                return;
            case 20:
                ((ela) this.b).V();
                return;
            case 21:
                return;
            case 22:
                ((kpa) this.b).onBackPressed();
                return;
            case 23:
                pnc pncVar = (pnc) this.b;
                mqc mqcVar = pncVar.c.k0;
                if (mqcVar != null) {
                    TL_wallet.nftItem nftitem = pncVar.b;
                    if (mqcVar.A()) {
                        mqcVar.c0(mqcVar.v(nftitem));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                qnc qncVar = (qnc) this.b;
                mqc mqcVar2 = qncVar.b.k0;
                if (mqcVar2 != null) {
                    mqcVar2.b0(qncVar.a);
                    return;
                }
                return;
            case 25:
                ura uraVar = (ura) this.b;
                uraVar.i0 = false;
                uraVar.k0 = false;
                uraVar.a(uraVar.a0, uraVar.b0, uraVar.c0, uraVar.d0);
                return;
            case 26:
                ((lra) this.b).invalidateSelf();
                return;
            case 27:
                ora oraVar = (ora) this.b;
                nra nraVar = oraVar.I;
                if (nraVar != null) {
                    ora oraVar2 = nraVar.a;
                    float[] fArr = nraVar.h;
                    if (!nraVar.e && (i = nraVar.c) != 0) {
                        if (nraVar.l) {
                            oraVar2.a();
                        } else {
                            int F = wi8.F(((mra) nraVar.b.get(i - 1)).a);
                            if (F == 1 || F == 2) {
                                z = true;
                                char c3 = 2;
                                oraVar2.a();
                                int i4 = nraVar.f - 1;
                                nraVar.f = i4;
                                c2 = c3;
                                if (i4 <= 0) {
                                    nraVar.b();
                                    c2 = c3;
                                }
                            } else if (F == 3) {
                                char c4 = 2;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (nraVar.f / nraVar.g)), 3.0d));
                                float f = 1.0f - pow;
                                if (Math.abs(nraVar.j * f) > 1.0E-4f || Math.abs(nraVar.k * f) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    float f2 = nraVar.j * f * 0.96f;
                                    oraVar2.getClass();
                                    ora.b(1.0f, 0.0f, f2, fArr2);
                                    oraVar2.getClass();
                                    ora.d(fArr2, fArr, fArr);
                                    float f3 = nraVar.k * f * 0.96f;
                                    oraVar2.getClass();
                                    ora.b(0.0f, 1.0f, f3, fArr2);
                                    ora.d(fArr2, fArr, fArr);
                                }
                                float[] fArr3 = nraVar.i;
                                float[] fArr4 = oraVar2.c;
                                int i5 = 0;
                                while (i5 < 16) {
                                    float f4 = fArr[i5];
                                    fArr4[i5] = td4.A(fArr3[i5], f4, pow, f4);
                                    i5++;
                                    z3 = z3;
                                }
                                z = z3;
                                float f5 = fArr4[0];
                                float f6 = fArr4[z ? 1 : 0];
                                float f7 = fArr4[2];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f5;
                                fArr5[z ? 1 : 0] = f6;
                                fArr5[2] = f7;
                                float f8 = fArr4[4];
                                float f9 = fArr4[5];
                                float f10 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f8;
                                fArr6[z ? 1 : 0] = f9;
                                fArr6[2] = f10;
                                float[] fArr7 = new float[3];
                                ora.e(fArr5);
                                ora.c(fArr5, fArr6, fArr7);
                                ora.e(fArr7);
                                ora.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[z ? 1 : 0] = fArr5[z ? 1 : 0];
                                fArr4[2] = fArr5[2];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[z ? 1 : 0];
                                fArr4[6] = fArr6[2];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[z ? 1 : 0];
                                fArr4[10] = fArr7[2];
                                int i6 = nraVar.f - 1;
                                nraVar.f = i6;
                                c2 = c4;
                                if (i6 <= 0) {
                                    System.arraycopy(nraVar.i, 0, oraVar2.c, 0, 16);
                                    oraVar2.d = 0.0f;
                                    oraVar2.e = 0.0f;
                                    nraVar.b();
                                    c2 = c4;
                                }
                            }
                        }
                    }
                    z = true;
                    c2 = 2;
                } else {
                    z = true;
                    char c5 = 2;
                    if (Math.abs(oraVar.d) <= 1.0E-4f && Math.abs(oraVar.e) <= 1.0E-4f) {
                        z2 = false;
                        c = c5;
                        if (oraVar.H == null ? z : z2) {
                            while (i2 < 6) {
                                Matrix.multiplyMV(oraVar.n, 0, oraVar.c, 0, oraVar.h[i2], 0);
                                oraVar.r[i2] = oraVar.n[c];
                                i2++;
                            }
                            Arrays.sort(oraVar.s, new i01(oraVar, (byte) 6));
                            oraVar.invalidate();
                        }
                        if (oraVar.isAttachedToWindow()) {
                            return;
                        }
                        gm.d3(oraVar.J, 16L);
                        return;
                    }
                    oraVar.a();
                    c2 = c5;
                }
                z2 = z ? 1 : 0;
                c = c2;
                if (oraVar.H == null ? z : z2) {
                }
                if (oraVar.isAttachedToWindow()) {
                }
                break;
            case 28:
                ((pra) this.b).invalidate();
                return;
            default:
                ((tra) this.b).invalidateSelf();
                return;
        }
    }
}
