// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kl2 b;

    public /* synthetic */ gl2(kl2 kl2Var, byte b) {
        this.a = b;
        this.b = kl2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c5 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        il2 il2Var;
        long j;
        il2 il2Var2;
        boolean z;
        long k;
        float f;
        il2 il2Var3;
        byte b = this.a;
        byte b2 = 6;
        byte b3 = 10;
        al2 al2Var = null;
        kl2 kl2Var = this.b;
        switch (b) {
            case 0:
                if (!kl2Var.f0 && !kl2Var.o0) {
                    jl2 jl2Var = kl2Var.k0;
                    if (jl2Var != null && (il2Var = jl2Var.d) != null) {
                        il2Var.setVolume(0.0f);
                    }
                    jl2 jl2Var2 = kl2Var.h0;
                    kl2Var.k0 = jl2Var2;
                    if (jl2Var2 != null && jl2Var2.n != null) {
                        Runnable runnable = kl2Var.m0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        jl2 jl2Var3 = kl2Var.k0;
                        il2 il2Var4 = jl2Var3.d;
                        if (il2Var4 != null) {
                            il2Var4.setVolume(jl2Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(kl2Var.getContext());
                        ImageView imageView = new ImageView(kl2Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, tre.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(kl2Var.getContext());
                        qd4.u(13.0f, 2131744359, 1, textView, null);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, tre.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        fu5 G = fu5.G(kl2Var.a, kl2Var.b, kl2Var);
                        if (kl2Var.k0.n.K) {
                            ena enaVar = new ena(kl2Var.getContext(), 0);
                            enaVar.b = 0.0f;
                            enaVar.c = 1.5f;
                            enaVar.c(kl2Var.k0.n.P);
                            enaVar.h = new te2(kl2Var, (byte) 25);
                            enaVar.S = hl.L(220.0f);
                            G.p(enaVar);
                            G.n(true);
                        }
                        G.Z = (short) 220;
                        G.b(R.drawable.menu_camera_retake, ob6.M0(2131744468, null), new gl2(kl2Var, (byte) 4), false);
                        G.b(R.drawable.msg_delete, ob6.M0(2131751563, null), new gl2(kl2Var, (byte) 5), true);
                        G.n(true);
                        G.q(frameLayout, tre.o(jn7.w3, -2));
                        G.p = new kc(b3);
                        G.i = (byte) 1;
                        G.b0 = true;
                        G.u = true;
                        G.v = false;
                        int L = hl.L(12.0f);
                        int L2 = hl.L(10.0f);
                        G.l = L;
                        G.k = L2;
                        G.p = new gl2(kl2Var, b2);
                        G.a0();
                        try {
                            kl2Var.performHapticFeedback(0, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                kl2Var.invalidate();
                break;
            case 2:
                if (kl2Var.g0) {
                    kl2Var.g0 = false;
                    kl2Var.invalidate();
                    break;
                }
                break;
            case 3:
                long position = kl2Var.getPosition();
                jl2 mainPart = kl2Var.getMainPart();
                if (mainPart == null) {
                    j = 0;
                } else {
                    c8b c8bVar = mainPart.n;
                    j = c8bVar.X + ((long) (c8bVar.V * c8bVar.h0));
                }
                for (int i = 0; i < kl2Var.h.size(); i++) {
                    jl2 jl2Var4 = (jl2) kl2Var.h.get(i);
                    if (jl2Var4.n != null && (il2Var2 = jl2Var4.d) != null) {
                        long duration = il2Var2.getDuration();
                        long k2 = Utilities.k((position + j) - jl2Var4.n.X, duration, 0L);
                        if (!kl2Var.o0 || kl2Var.r0) {
                            float f2 = k2;
                            c8b c8bVar2 = jl2Var4.n;
                            float f3 = duration;
                            if (f2 > c8bVar2.V * f3 && f2 < c8bVar2.W * f3) {
                                z = true;
                                c8b c8bVar3 = jl2Var4.n;
                                float f4 = duration;
                                k = Utilities.k(k2, (long) (c8bVar3.W * f4), (long) (c8bVar3.V * f4));
                                if (jl2Var4.d.isPlaying() != z) {
                                    il2 il2Var5 = jl2Var4.d;
                                    if (z) {
                                        il2Var5.play();
                                    } else {
                                        il2Var5.pause();
                                    }
                                }
                                il2 il2Var6 = jl2Var4.d;
                                if (!kl2Var.w0) {
                                    c8b c8bVar4 = jl2Var4.n;
                                    if (!c8bVar4.Y && kl2Var.o0) {
                                        f = c8bVar4.P;
                                        il2Var6.setVolume(f);
                                        if (Math.abs((jl2Var4.g >= 0 ? jl2Var4.g : jl2Var4.d.getCurrentPosition()) - k) <= 450 && jl2Var4.g < 0) {
                                            il2 il2Var7 = jl2Var4.d;
                                            jl2Var4.g = k;
                                            il2Var7.seekTo(k, kl2Var.q0, new vd2(jl2Var4, b2));
                                        }
                                    }
                                }
                                f = 0.0f;
                                il2Var6.setVolume(f);
                                if (Math.abs((jl2Var4.g >= 0 ? jl2Var4.g : jl2Var4.d.getCurrentPosition()) - k) <= 450) {
                                    il2 il2Var72 = jl2Var4.d;
                                    jl2Var4.g = k;
                                    il2Var72.seekTo(k, kl2Var.q0, new vd2(jl2Var4, b2));
                                }
                            }
                        }
                        z = false;
                        c8b c8bVar32 = jl2Var4.n;
                        float f42 = duration;
                        k = Utilities.k(k2, (long) (c8bVar32.W * f42), (long) (c8bVar32.V * f42));
                        if (jl2Var4.d.isPlaying() != z) {
                        }
                        il2 il2Var62 = jl2Var4.d;
                        if (!kl2Var.w0) {
                        }
                        f = 0.0f;
                        il2Var62.setVolume(f);
                        if (Math.abs((jl2Var4.g >= 0 ? jl2Var4.g : jl2Var4.d.getCurrentPosition()) - k) <= 450) {
                        }
                    }
                }
                ksb ksbVar = kl2Var.s0;
                if (ksbVar != null) {
                    ksbVar.setProgress(position);
                }
                mm8 mm8Var = kl2Var.t0;
                if (mm8Var != null) {
                    mm8Var.w(true);
                    kl2Var.t0.y(true);
                }
                if (kl2Var.o0 && kl2Var.r0) {
                    hl.d3(kl2Var.x0, (long) (1000.0f / hl.r));
                    break;
                }
                break;
            case 4:
                jl2 jl2Var5 = kl2Var.k0;
                if (jl2Var5 != null) {
                    jl2Var5.a(null);
                    kl2Var.q();
                    kl2Var.invalidate();
                    Runnable runnable2 = kl2Var.n0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                jl2 jl2Var6 = kl2Var.k0;
                if (jl2Var6 != null && kl2Var.h.indexOf(jl2Var6) >= 0) {
                    al2 al2Var2 = kl2Var.f;
                    int indexOf = al2Var2.e.indexOf(jl2Var6.h);
                    ArrayList arrayList = al2Var2.e;
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb = new StringBuilder();
                        int i2 = 0;
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            zk2 zk2Var = (zk2) arrayList2.get(i3);
                            if (zk2Var.c != i2) {
                                sb.append("/");
                                i2 = zk2Var.c;
                            }
                            sb.append(".");
                        }
                        al2Var = new al2(sb.toString());
                    }
                    if (al2Var.e.size() <= 1) {
                        kl2Var.b();
                        kl2Var.invalidate();
                    }
                    kl2Var.o(al2Var);
                    kl2Var.g0 = true;
                    kl2Var.q();
                    kl2Var.invalidate();
                    Runnable runnable3 = kl2Var.n0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    rbb rbbVar = ((fbb) kl2Var).y0;
                    rbbVar.J0.a(false, true);
                    int size = al2Var.e.size();
                    fl2 fl2Var = rbbVar.H0;
                    if (size > 1) {
                        rbbVar.A0 = al2Var;
                        fl2Var.a(new bl2(al2Var, false), true);
                        rbbVar.H0.b(true, true);
                    } else {
                        fl2Var.b(false, true);
                    }
                    rbbVar.l0(true);
                    zt4 zt4Var = rbbVar.N0;
                    if (zt4Var != null) {
                        zt4Var.setMultipleOnClick(rbbVar.B0.i());
                        rbbVar.N0.setMaxCount(Math.min(10, al2.b() - rbbVar.B0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                jl2 jl2Var7 = kl2Var.k0;
                if (jl2Var7 != null && (il2Var3 = jl2Var7.d) != null) {
                    il2Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
