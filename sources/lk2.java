// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qk2 b;

    public /* synthetic */ lk2(qk2 qk2Var, byte b) {
        this.a = b;
        this.b = qk2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ok2 ok2Var;
        long j;
        ok2 ok2Var2;
        boolean z;
        long k;
        float f;
        ok2 ok2Var3;
        byte b = this.a;
        byte b2 = 10;
        fk2 fk2Var = null;
        boolean z2 = false;
        qk2 qk2Var = this.b;
        switch (b) {
            case 0:
                if (!qk2Var.f0 && !qk2Var.o0) {
                    pk2 pk2Var = qk2Var.k0;
                    if (pk2Var != null && (ok2Var = pk2Var.d) != null) {
                        ok2Var.setVolume(0.0f);
                    }
                    pk2 pk2Var2 = qk2Var.h0;
                    qk2Var.k0 = pk2Var2;
                    if (pk2Var2 != null && pk2Var2.n != null) {
                        Runnable runnable = qk2Var.m0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        pk2 pk2Var3 = qk2Var.k0;
                        ok2 ok2Var4 = pk2Var3.d;
                        if (ok2Var4 != null) {
                            ok2Var4.setVolume(pk2Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(qk2Var.getContext());
                        ImageView imageView = new ImageView(qk2Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, nme.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(qk2Var.getContext());
                        tb4.u(13.0f, 2131744465, 1, textView, null);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, nme.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        cs5 G = cs5.G(qk2Var.a, qk2Var.b, qk2Var);
                        if (qk2Var.k0.n.K) {
                            lja ljaVar = new lja(qk2Var.getContext(), 0);
                            ljaVar.b = 0.0f;
                            ljaVar.c = 1.5f;
                            ljaVar.c(qk2Var.k0.n.P);
                            ljaVar.h = new be2(qk2Var, (byte) 25);
                            ljaVar.S = gl.L(220.0f);
                            G.p(ljaVar);
                            G.n(true);
                        }
                        G.W = (short) 220;
                        G.b(R.drawable.menu_camera_retake, k96.M0(2131744574, null), new lk2(qk2Var, (byte) 4), false);
                        G.b(R.drawable.msg_delete, k96.M0(2131751586, null), new lk2(qk2Var, (byte) 5), true);
                        G.n(true);
                        G.q(frameLayout, nme.o(kk7.w3, -2));
                        G.p = new jc(b2);
                        G.i = (byte) 1;
                        G.Y = true;
                        G.u = true;
                        G.v = false;
                        int L = gl.L(12.0f);
                        int L2 = gl.L(10.0f);
                        G.l = L;
                        G.k = L2;
                        G.p = new lk2(qk2Var, (byte) 6);
                        G.a0();
                        try {
                            qk2Var.performHapticFeedback(0, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                qk2Var.invalidate();
                break;
            case 2:
                if (qk2Var.g0) {
                    qk2Var.g0 = false;
                    qk2Var.invalidate();
                    break;
                }
                break;
            case 3:
                long position = qk2Var.getPosition();
                pk2 mainPart = qk2Var.getMainPart();
                if (mainPart == null) {
                    j = 0;
                } else {
                    f4b f4bVar = mainPart.n;
                    j = f4bVar.X + ((long) (f4bVar.V * f4bVar.h0));
                }
                int i = 0;
                while (i < qk2Var.h.size()) {
                    pk2 pk2Var4 = (pk2) qk2Var.h.get(i);
                    if (pk2Var4.n != null && (ok2Var2 = pk2Var4.d) != null) {
                        long duration = ok2Var2.getDuration();
                        long k2 = Utilities.k((position + j) - pk2Var4.n.X, duration, 0L);
                        if (!qk2Var.o0 || qk2Var.r0) {
                            float f2 = k2;
                            f4b f4bVar2 = pk2Var4.n;
                            float f3 = duration;
                            if (f2 > f4bVar2.V * f3 && f2 < f4bVar2.W * f3) {
                                z = true;
                                f4b f4bVar3 = pk2Var4.n;
                                float f4 = duration;
                                k = Utilities.k(k2, (long) (f4bVar3.W * f4), (long) (f4bVar3.V * f4));
                                if (pk2Var4.d.isPlaying() != z) {
                                    ok2 ok2Var5 = pk2Var4.d;
                                    if (z) {
                                        ok2Var5.play();
                                    } else {
                                        ok2Var5.pause();
                                    }
                                }
                                ok2 ok2Var6 = pk2Var4.d;
                                if (!qk2Var.w0) {
                                    f4b f4bVar4 = pk2Var4.n;
                                    if (!f4bVar4.Y && qk2Var.o0) {
                                        f = f4bVar4.P;
                                        ok2Var6.setVolume(f);
                                        if (Math.abs((pk2Var4.g >= 0 ? pk2Var4.g : pk2Var4.d.getCurrentPosition()) - k) <= 450 && pk2Var4.g < 0) {
                                            ok2 ok2Var7 = pk2Var4.d;
                                            pk2Var4.g = k;
                                            ok2Var7.seekTo(k, qk2Var.q0, new mk2(pk2Var4, (byte) 0));
                                        }
                                    }
                                }
                                f = 0.0f;
                                ok2Var6.setVolume(f);
                                if (Math.abs((pk2Var4.g >= 0 ? pk2Var4.g : pk2Var4.d.getCurrentPosition()) - k) <= 450) {
                                    ok2 ok2Var72 = pk2Var4.d;
                                    pk2Var4.g = k;
                                    ok2Var72.seekTo(k, qk2Var.q0, new mk2(pk2Var4, (byte) 0));
                                }
                            }
                        }
                        z = z2;
                        f4b f4bVar32 = pk2Var4.n;
                        float f42 = duration;
                        k = Utilities.k(k2, (long) (f4bVar32.W * f42), (long) (f4bVar32.V * f42));
                        if (pk2Var4.d.isPlaying() != z) {
                        }
                        ok2 ok2Var62 = pk2Var4.d;
                        if (!qk2Var.w0) {
                        }
                        f = 0.0f;
                        ok2Var62.setVolume(f);
                        if (Math.abs((pk2Var4.g >= 0 ? pk2Var4.g : pk2Var4.d.getCurrentPosition()) - k) <= 450) {
                        }
                    }
                    i++;
                    z2 = false;
                }
                kob kobVar = qk2Var.s0;
                if (kobVar != null) {
                    kobVar.setProgress(position);
                }
                zi8 zi8Var = qk2Var.t0;
                if (zi8Var != null) {
                    zi8Var.w(true);
                    qk2Var.t0.y(true);
                }
                if (qk2Var.o0 && qk2Var.r0) {
                    gl.e3(qk2Var.x0, (long) (1000.0f / gl.r));
                    break;
                }
                break;
            case 4:
                pk2 pk2Var5 = qk2Var.k0;
                if (pk2Var5 != null) {
                    pk2Var5.a(null);
                    qk2Var.q();
                    qk2Var.invalidate();
                    Runnable runnable2 = qk2Var.n0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                pk2 pk2Var6 = qk2Var.k0;
                if (pk2Var6 != null && qk2Var.h.indexOf(pk2Var6) >= 0) {
                    fk2 fk2Var2 = qk2Var.f;
                    int indexOf = fk2Var2.e.indexOf(pk2Var6.h);
                    ArrayList arrayList = fk2Var2.e;
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb = new StringBuilder();
                        int i2 = 0;
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            ek2 ek2Var = (ek2) arrayList2.get(i3);
                            if (ek2Var.c != i2) {
                                sb.append("/");
                                i2 = ek2Var.c;
                            }
                            sb.append(".");
                        }
                        fk2Var = new fk2(sb.toString());
                    }
                    if (fk2Var.e.size() <= 1) {
                        qk2Var.b();
                        qk2Var.invalidate();
                    }
                    qk2Var.o(fk2Var);
                    qk2Var.g0 = true;
                    qk2Var.q();
                    qk2Var.invalidate();
                    Runnable runnable3 = qk2Var.n0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    t7b t7bVar = ((h7b) qk2Var).y0;
                    t7bVar.J0.a(false, true);
                    int size = fk2Var.e.size();
                    kk2 kk2Var = t7bVar.H0;
                    if (size > 1) {
                        t7bVar.A0 = fk2Var;
                        kk2Var.a(new gk2(fk2Var, false), true);
                        t7bVar.H0.b(true, true);
                    } else {
                        kk2Var.b(false, true);
                    }
                    t7bVar.l0(true);
                    vr4 vr4Var = t7bVar.N0;
                    if (vr4Var != null) {
                        vr4Var.setMultipleOnClick(t7bVar.B0.i());
                        t7bVar.N0.setMaxCount(Math.min(10, fk2.b() - t7bVar.B0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                pk2 pk2Var7 = qk2Var.k0;
                if (pk2Var7 != null && (ok2Var3 = pk2Var7.d) != null) {
                    ok2Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
