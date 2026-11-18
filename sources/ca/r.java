package ca;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import ch.s;
import ch.x;
import com.google.android.gms.internal.vision.e2;
import d3.b0;
import d3.t;
import di.a5;
import di.b5;
import di.d6;
import di.e5;
import di.e6;
import di.fb;
import di.gb;
import di.h1;
import di.o0;
import di.pb;
import di.r0;
import di.r4;
import di.s4;
import di.t4;
import di.u0;
import di.u4;
import di.v4;
import di.w4;
import di.y5;
import di.z5;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import m.o3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.x20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.r8;
import org.telegram.ui.Wallet.v5;
import org.telegram.ui.Wallet.w5;
import org.telegram.ui.bn;
import ug.z0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a() {
        ab.q qVar = (ab.q) this.b;
        Map map = null;
        ((AtomicReference) qVar.c).set(null);
        synchronized (qVar) {
            try {
                if (((AtomicMarkableReference) qVar.b).isMarked()) {
                    map = ((e) ((AtomicMarkableReference) qVar.b).getReference()).a();
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) qVar.b;
                    atomicMarkableReference.set((e) atomicMarkableReference.getReference(), false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (map != null) {
            o3 o3Var = (o3) qVar.d;
            ((h) o3Var.a).h((String) o3Var.c, map, qVar.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0295  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        char c10;
        char c11;
        char c12;
        int i7;
        String str = null;
        switch (this.a) {
            case 0:
                o3 o3Var = (o3) this.b;
                synchronized (((AtomicMarkableReference) o3Var.g)) {
                    try {
                        if (((AtomicMarkableReference) o3Var.g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) o3Var.g).getReference();
                            ((AtomicMarkableReference) o3Var.g).set(str, false);
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    ((h) o3Var.a).i((String) o3Var.c, str);
                    return;
                }
                return;
            case 1:
                a();
                return;
            case 2:
                s sVar = (s) ((ob.c) this.b).b;
                ch.r rVar = sVar.b;
                if (rVar != null) {
                    rVar.d(true);
                }
                sVar.a.O7(true);
                return;
            case 3:
                ((ValueAnimator) this.b).start();
                return;
            case 4:
                h2 h2Var = ((x) this.b).h2.r;
                if (h2Var instanceof bn) {
                    h2Var.showDialog(new z0(h2Var, 11, false));
                    return;
                }
                h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.showDialog(new z0(h2Var, 11, false));
                    return;
                }
                return;
            case 5:
                ((ci.s) this.b).e();
                return;
            case 6:
                ((d3.e) this.b).h.r();
                return;
            case 7:
                ((t) this.b).m--;
                return;
            case 8:
                r0.a.postVsyncCallback((b0) this.b);
                return;
            case 9:
                di.b bVar = (di.b) this.b;
                bVar.getClass();
                new gb(bVar.getContext(), bVar.b).show();
                return;
            case 10:
                di.s sVar2 = (di.s) this.b;
                if (!sVar2.isAttachedToWindow() || sVar2.c.canScrollVertically(1)) {
                    return;
                }
                sVar2.a();
                return;
            case 11:
                new qu0(((x20) this.b).getContext()).show();
                return;
            case 12:
                EditTextBoldCursor editTextBoldCursor = ((o0) this.b).s1;
                editTextBoldCursor.requestFocus();
                g0.I3(editTextBoldCursor);
                return;
            case 13:
                g0.I3(((r0) this.b).r1);
                return;
            case 14:
                g0.I3(((u0) this.b).n1);
                return;
            case 15:
                ((h1) this.b).onBackPressed();
                return;
            case 16:
                v5 v5Var = (v5) ((e6) this.b);
                r8 r8Var = v5Var.c.k0;
                if (r8Var != null) {
                    TL_wallet.nftItem nftitem = v5Var.b;
                    if (r8Var.A()) {
                        r8Var.c0(r8Var.v(nftitem));
                        return;
                    }
                    return;
                }
                return;
            case 17:
                w5 w5Var = (w5) ((d6) this.b);
                r8 r8Var2 = w5Var.b.k0;
                if (r8Var2 != null) {
                    r8Var2.b0(w5Var.a);
                    return;
                }
                return;
            case 18:
                b5 b5Var = (b5) this.b;
                b5Var.i0 = false;
                b5Var.k0 = false;
                b5Var.a(b5Var.a0, b5Var.b0, b5Var.c0, b5Var.d0);
                return;
            case 19:
                ((r4) this.b).invalidateSelf();
                return;
            case 20:
                v4 v4Var = (v4) this.b;
                u4 u4Var = v4Var.I;
                if (u4Var != null) {
                    v4 v4Var2 = u4Var.a;
                    float[] fArr = u4Var.h;
                    if (!u4Var.e && (i7 = u4Var.c) != 0) {
                        if (u4Var.l) {
                            v4Var2.a();
                        } else {
                            int c13 = p1.g.c(((t4) u4Var.b.get(i7 - 1)).a);
                            if (c13 == 1 || c13 == 2) {
                                c10 = 2;
                                c11 = 1;
                                v4Var2.a();
                                int i10 = u4Var.f - 1;
                                u4Var.f = i10;
                                if (i10 <= 0) {
                                    u4Var.b();
                                }
                            } else if (c13 == 3) {
                                char c14 = 2;
                                float pow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (u4Var.f / u4Var.g)), 3.0d));
                                float f10 = 1.0f - pow;
                                if (Math.abs(u4Var.j * f10) > 1.0E-4f || Math.abs(u4Var.k * f10) > 1.0E-4f) {
                                    float[] fArr2 = new float[16];
                                    c11 = 1;
                                    float f11 = u4Var.j * f10 * 0.96f;
                                    v4Var2.getClass();
                                    v4.b(1.0f, 0.0f, f11, fArr2);
                                    v4Var2.getClass();
                                    v4.d(fArr2, fArr, fArr);
                                    float f12 = u4Var.k * f10 * 0.96f;
                                    v4Var2.getClass();
                                    v4.b(0.0f, 1.0f, f12, fArr2);
                                    v4.d(fArr2, fArr, fArr);
                                } else {
                                    c11 = 1;
                                }
                                float[] fArr3 = u4Var.i;
                                float[] fArr4 = v4Var2.c;
                                int i11 = 0;
                                while (i11 < 16) {
                                    float f13 = fArr[i11];
                                    fArr4[i11] = e2.z(fArr3[i11], f13, pow, f13);
                                    i11++;
                                    c14 = c14;
                                }
                                c10 = c14;
                                float f14 = fArr4[0];
                                float f15 = fArr4[c11];
                                float f16 = fArr4[c10];
                                float[] fArr5 = new float[3];
                                fArr5[0] = f14;
                                fArr5[c11] = f15;
                                fArr5[c10] = f16;
                                float f17 = fArr4[4];
                                float f18 = fArr4[5];
                                float f19 = fArr4[6];
                                float[] fArr6 = new float[3];
                                fArr6[0] = f17;
                                fArr6[c11] = f18;
                                fArr6[c10] = f19;
                                float[] fArr7 = new float[3];
                                v4.e(fArr5);
                                v4.c(fArr5, fArr6, fArr7);
                                v4.e(fArr7);
                                v4.c(fArr7, fArr5, fArr6);
                                fArr4[0] = fArr5[0];
                                fArr4[c11] = fArr5[c11];
                                fArr4[c10] = fArr5[c10];
                                fArr4[4] = fArr6[0];
                                fArr4[5] = fArr6[c11];
                                fArr4[6] = fArr6[c10];
                                fArr4[8] = fArr7[0];
                                fArr4[9] = fArr7[c11];
                                fArr4[10] = fArr7[c10];
                                int i12 = u4Var.f - 1;
                                u4Var.f = i12;
                                if (i12 <= 0) {
                                    System.arraycopy(u4Var.i, 0, v4Var2.c, 0, 16);
                                    v4Var2.d = 0.0f;
                                    v4Var2.e = 0.0f;
                                    u4Var.b();
                                }
                            }
                        }
                    }
                    c10 = 2;
                    c11 = 1;
                } else {
                    c10 = 2;
                    c11 = 1;
                    if (Math.abs(v4Var.d) <= 1.0E-4f && Math.abs(v4Var.e) <= 1.0E-4f) {
                        c12 = 0;
                        if ((v4Var.H == null ? c11 : c12) != 0) {
                            for (int i13 = 0; i13 < 6; i13++) {
                                Matrix.multiplyMV(v4Var.n, 0, v4Var.c, 0, v4Var.h[i13], 0);
                                v4Var.r[i13] = v4Var.n[c10];
                            }
                            Arrays.sort(v4Var.s, new s4(v4Var, 0));
                            v4Var.invalidate();
                        }
                        if (v4Var.isAttachedToWindow()) {
                            return;
                        }
                        g0.h3(v4Var.J, 16L);
                        return;
                    }
                    v4Var.a();
                }
                c12 = c11;
                if ((v4Var.H == null ? c11 : c12) != 0) {
                }
                if (v4Var.isAttachedToWindow()) {
                }
                break;
            case 21:
                ((w4) this.b).invalidate();
                return;
            case 22:
                ((a5) this.b).invalidateSelf();
                return;
            case 23:
                z5 z5Var = (z5) this.b;
                r rVar2 = z5Var.p0;
                q9[] q9VarArr = z5Var.d;
                if (!q9VarArr[2 - z5Var.y0].getImageReceiver().J()) {
                    g0.r(rVar2);
                    g0.h3(rVar2, 150L);
                    return;
                }
                e5 e5Var = z5Var.b0;
                if (e5Var != null && e5Var.c == 1 && z5Var.isAttachedToWindow()) {
                    g0.r(rVar2);
                    ValueAnimator valueAnimator = z5Var.o0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        z5Var.o0 = null;
                    }
                    int i14 = 1 - z5Var.y0;
                    z5Var.y0 = i14;
                    mh0 B = q9VarArr[2 - i14].getImageReceiver().B();
                    mh0 B2 = q9VarArr[z5Var.y0 + 1].getImageReceiver().B();
                    if (B2 != null && B != null) {
                        B2.T(false, B.t());
                    }
                    z5Var.d0.c();
                    int i15 = z5Var.y0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = z5Var.c0;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) z5Var.f0.c();
                    stargiftattributebackdropArr[i15] = stargiftattributebackdrop;
                    z5Var.e(i15, stargiftattributebackdrop);
                    z5Var.g(1, (TL_stars.starGiftAttributePattern) z5Var.e0.c(), true);
                    z5Var.a();
                    float f20 = z5Var.y0;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f - f20, f20);
                    z5Var.o0 = ofFloat;
                    ofFloat.addUpdateListener(new di.v5(z5Var, 2));
                    z5Var.o0.addListener(new y5(z5Var));
                    z5Var.o0.setDuration(320L);
                    z5Var.o0.setInterpolator(lr.h);
                    z5Var.o0.start();
                    return;
                }
                return;
            case 24:
                pb pbVar = (pb) this.b;
                if (pbVar.V == null || pbVar.b0 == -1) {
                    return;
                }
                pbVar.o1("POSTED_ALIGN");
                pbVar.V.a();
                return;
            case 25:
                ((vg.m) this.b).setPaused(true);
                return;
            case 26:
                g0.I3((EditTextBoldCursor) this.b);
                return;
            case 27:
                ((u0[]) this.b)[0].dismiss();
                return;
            case 28:
                vf.c.t(((fb) this.b).getContext(), gd.M0(2131744731, null));
                return;
            default:
                vf.c.t(((gb) this.b).getContext(), gd.M0(2131744731, null));
                return;
        }
    }
}
