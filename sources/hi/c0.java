package hi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.ui.Components.a70;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ c0(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d9 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e0 e0Var;
        long j3;
        e0 e0Var2;
        boolean z10;
        long k10;
        float f10;
        e0 e0Var3;
        v vVar = null;
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                if (!g0Var.f0 && !g0Var.o0) {
                    f0 f0Var = g0Var.k0;
                    if (f0Var != null && (e0Var = f0Var.d) != null) {
                        e0Var.setVolume(0.0f);
                    }
                    f0 f0Var2 = g0Var.h0;
                    g0Var.k0 = f0Var2;
                    if (f0Var2 != null && f0Var2.n != null) {
                        Runnable runnable = g0Var.m0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        f0 f0Var3 = g0Var.k0;
                        e0 e0Var4 = f0Var3.d;
                        if (e0Var4 != null) {
                            e0Var4.setVolume(f0Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(g0Var.getContext());
                        ImageView imageView = new ImageView(g0Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(g0Var.getContext());
                        o10.l(13.0f, 2131744462, 1, textView, null);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        a70 G = a70.G(g0Var.a, g0Var.b, g0Var);
                        if (g0Var.k0.n.K) {
                            w6 w6Var = new w6(g0Var.getContext(), 0);
                            w6Var.b = 0.0f;
                            w6Var.c = 1.5f;
                            w6Var.d(g0Var.k0.n.P);
                            w6Var.h = new ai.h0(g0Var, 22);
                            w6Var.S = org.telegram.messenger.g0.L(220.0f);
                            G.q(w6Var);
                            G.o(true);
                        }
                        G.W = ls.x3;
                        G.c(R.drawable.menu_camera_retake, hd.N0(2131744568, null), new c0(g0Var, 4), false);
                        G.c(R.drawable.msg_delete, hd.N0(2131751586, null), new c0(g0Var, 5), true);
                        G.o(true);
                        G.r(frameLayout, c8.ma.o(ls.x3, -2));
                        G.p = new ai.n(16);
                        G.i = 1;
                        G.Y = true;
                        G.u = true;
                        G.v = false;
                        int L = org.telegram.messenger.g0.L(12.0f);
                        int L2 = org.telegram.messenger.g0.L(10.0f);
                        G.l = L;
                        G.k = L2;
                        G.p = new c0(g0Var, 6);
                        G.a0();
                        try {
                            g0Var.performHapticFeedback(0, 1);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                this.b.invalidate();
                break;
            case 2:
                g0 g0Var2 = this.b;
                if (g0Var2.g0) {
                    g0Var2.g0 = false;
                    g0Var2.invalidate();
                    break;
                }
                break;
            case 3:
                g0 g0Var3 = this.b;
                long position = g0Var3.getPosition();
                f0 mainPart = g0Var3.getMainPart();
                if (mainPart == null) {
                    j3 = 0;
                } else {
                    c7 c7Var = mainPart.n;
                    j3 = c7Var.X + ((long) (c7Var.V * c7Var.h0));
                }
                for (int i7 = 0; i7 < g0Var3.h.size(); i7++) {
                    f0 f0Var4 = (f0) g0Var3.h.get(i7);
                    if (f0Var4.n != null && (e0Var2 = f0Var4.d) != null) {
                        long duration = e0Var2.getDuration();
                        long k11 = Utilities.k((position + j3) - f0Var4.n.X, duration, 0L);
                        if (!g0Var3.o0 || g0Var3.r0) {
                            float f11 = k11;
                            c7 c7Var2 = f0Var4.n;
                            float f12 = duration;
                            if (f11 > c7Var2.V * f12 && f11 < c7Var2.W * f12) {
                                z10 = true;
                                c7 c7Var3 = f0Var4.n;
                                float f13 = duration;
                                k10 = Utilities.k(k11, (long) (c7Var3.W * f13), (long) (c7Var3.V * f13));
                                if (f0Var4.d.isPlaying() != z10) {
                                    if (z10) {
                                        f0Var4.d.play();
                                    } else {
                                        f0Var4.d.pause();
                                    }
                                }
                                e0 e0Var5 = f0Var4.d;
                                if (!g0Var3.w0) {
                                    c7 c7Var4 = f0Var4.n;
                                    if (!c7Var4.Y && g0Var3.o0) {
                                        f10 = c7Var4.P;
                                        e0Var5.setVolume(f10);
                                        if (Math.abs((f0Var4.g >= 0 ? f0Var4.g : f0Var4.d.getCurrentPosition()) - k10) <= 450 && f0Var4.g < 0) {
                                            e0 e0Var6 = f0Var4.d;
                                            f0Var4.g = k10;
                                            e0Var6.seekTo(k10, g0Var3.q0, new l(f0Var4, 1));
                                        }
                                    }
                                }
                                f10 = 0.0f;
                                e0Var5.setVolume(f10);
                                if (Math.abs((f0Var4.g >= 0 ? f0Var4.g : f0Var4.d.getCurrentPosition()) - k10) <= 450) {
                                    e0 e0Var62 = f0Var4.d;
                                    f0Var4.g = k10;
                                    e0Var62.seekTo(k10, g0Var3.q0, new l(f0Var4, 1));
                                }
                            }
                        }
                        z10 = false;
                        c7 c7Var32 = f0Var4.n;
                        float f132 = duration;
                        k10 = Utilities.k(k11, (long) (c7Var32.W * f132), (long) (c7Var32.V * f132));
                        if (f0Var4.d.isPlaying() != z10) {
                        }
                        e0 e0Var52 = f0Var4.d;
                        if (!g0Var3.w0) {
                        }
                        f10 = 0.0f;
                        e0Var52.setVolume(f10);
                        if (Math.abs((f0Var4.g >= 0 ? f0Var4.g : f0Var4.d.getCurrentPosition()) - k10) <= 450) {
                        }
                    }
                }
                cb cbVar = g0Var3.s0;
                if (cbVar != null) {
                    cbVar.setProgress(position);
                }
                v5 v5Var = g0Var3.t0;
                if (v5Var != null) {
                    v5Var.w(true);
                    g0Var3.t0.y(true);
                }
                if (g0Var3.o0 && g0Var3.r0) {
                    org.telegram.messenger.g0.h3(g0Var3.x0, (long) (1000.0f / org.telegram.messenger.g0.r));
                    break;
                }
                break;
            case 4:
                g0 g0Var4 = this.b;
                f0 f0Var5 = g0Var4.k0;
                if (f0Var5 != null) {
                    f0Var5.a(null);
                    g0Var4.q();
                    g0Var4.invalidate();
                    Runnable runnable2 = g0Var4.n0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                g0 g0Var5 = this.b;
                f0 f0Var6 = g0Var5.k0;
                if (f0Var6 != null && g0Var5.h.indexOf(f0Var6) >= 0) {
                    v vVar2 = g0Var5.f;
                    int indexOf = vVar2.e.indexOf(f0Var6.h);
                    ArrayList arrayList = vVar2.e;
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = 0;
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            u uVar = (u) arrayList2.get(i11);
                            if (uVar.c != i10) {
                                sb2.append("/");
                                i10 = uVar.c;
                            }
                            sb2.append(".");
                        }
                        vVar = new v(sb2.toString());
                    }
                    if (vVar.e.size() <= 1) {
                        g0Var5.c();
                        g0Var5.invalidate();
                    }
                    g0Var5.o(vVar);
                    g0Var5.g0 = true;
                    g0Var5.q();
                    g0Var5.invalidate();
                    Runnable runnable3 = g0Var5.n0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    sa saVar = ((fa) g0Var5).z0;
                    saVar.J0.a(false, true);
                    if (vVar.e.size() > 1) {
                        b0 b0Var = saVar.H0;
                        saVar.A0 = vVar;
                        b0Var.a(new w(vVar, false), true);
                        saVar.H0.b(true, true);
                    } else {
                        saVar.H0.b(false, true);
                    }
                    saVar.l0(true);
                    g3 g3Var = saVar.N0;
                    if (g3Var != null) {
                        g3Var.setMultipleOnClick(saVar.B0.j());
                        saVar.N0.setMaxCount(Math.min(10, v.b() - saVar.B0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                f0 f0Var7 = this.b.k0;
                if (f0Var7 != null && (e0Var3 = f0Var7.d) != null) {
                    e0Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
