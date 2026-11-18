package hi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.y60;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ b0(f0 f0Var, int i7) {
        this.a = i7;
        this.b = f0Var;
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
        d0 d0Var;
        long j3;
        d0 d0Var2;
        boolean z10;
        long k10;
        float f10;
        d0 d0Var3;
        u uVar = null;
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                if (!f0Var.f0 && !f0Var.o0) {
                    e0 e0Var = f0Var.k0;
                    if (e0Var != null && (d0Var = e0Var.d) != null) {
                        d0Var.setVolume(0.0f);
                    }
                    e0 e0Var2 = f0Var.h0;
                    f0Var.k0 = e0Var2;
                    if (e0Var2 != null && e0Var2.n != null) {
                        Runnable runnable = f0Var.m0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        e0 e0Var3 = f0Var.k0;
                        d0 d0Var4 = e0Var3.d;
                        if (d0Var4 != null) {
                            d0Var4.setVolume(e0Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(f0Var.getContext());
                        ImageView imageView = new ImageView(f0Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, c8.ma.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(f0Var.getContext());
                        n10.l(13.0f, 2131744470, 1, textView, null);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        y60 G = y60.G(f0Var.a, f0Var.b, f0Var);
                        if (f0Var.k0.n.K) {
                            x6 x6Var = new x6(f0Var.getContext(), 0);
                            x6Var.b = 0.0f;
                            x6Var.c = 1.5f;
                            x6Var.d(f0Var.k0.n.P);
                            x6Var.h = new ai.g0(f0Var, 22);
                            x6Var.S = org.telegram.messenger.g0.L(220.0f);
                            G.q(x6Var);
                            G.o(true);
                        }
                        G.W = ks.x3;
                        G.c(R.drawable.menu_camera_retake, gd.M0(2131744576, null), new b0(f0Var, 4), false);
                        G.c(R.drawable.msg_delete, gd.M0(2131751587, null), new b0(f0Var, 5), true);
                        G.o(true);
                        G.r(frameLayout, c8.ma.o(ks.x3, -2));
                        G.p = new ai.o(16);
                        G.i = 1;
                        G.Y = true;
                        G.u = true;
                        G.v = false;
                        int L = org.telegram.messenger.g0.L(12.0f);
                        int L2 = org.telegram.messenger.g0.L(10.0f);
                        G.l = L;
                        G.k = L2;
                        G.p = new b0(f0Var, 6);
                        G.a0();
                        try {
                            f0Var.performHapticFeedback(0, 1);
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
                f0 f0Var2 = this.b;
                if (f0Var2.g0) {
                    f0Var2.g0 = false;
                    f0Var2.invalidate();
                    break;
                }
                break;
            case 3:
                f0 f0Var3 = this.b;
                long position = f0Var3.getPosition();
                e0 mainPart = f0Var3.getMainPart();
                if (mainPart == null) {
                    j3 = 0;
                } else {
                    d7 d7Var = mainPart.n;
                    j3 = d7Var.X + ((long) (d7Var.V * d7Var.h0));
                }
                for (int i7 = 0; i7 < f0Var3.h.size(); i7++) {
                    e0 e0Var4 = (e0) f0Var3.h.get(i7);
                    if (e0Var4.n != null && (d0Var2 = e0Var4.d) != null) {
                        long duration = d0Var2.getDuration();
                        long k11 = Utilities.k((position + j3) - e0Var4.n.X, duration, 0L);
                        if (!f0Var3.o0 || f0Var3.r0) {
                            float f11 = k11;
                            d7 d7Var2 = e0Var4.n;
                            float f12 = duration;
                            if (f11 > d7Var2.V * f12 && f11 < d7Var2.W * f12) {
                                z10 = true;
                                d7 d7Var3 = e0Var4.n;
                                float f13 = duration;
                                k10 = Utilities.k(k11, (long) (d7Var3.W * f13), (long) (d7Var3.V * f13));
                                if (e0Var4.d.isPlaying() != z10) {
                                    if (z10) {
                                        e0Var4.d.play();
                                    } else {
                                        e0Var4.d.pause();
                                    }
                                }
                                d0 d0Var5 = e0Var4.d;
                                if (!f0Var3.w0) {
                                    d7 d7Var4 = e0Var4.n;
                                    if (!d7Var4.Y && f0Var3.o0) {
                                        f10 = d7Var4.P;
                                        d0Var5.setVolume(f10);
                                        if (Math.abs((e0Var4.g >= 0 ? e0Var4.g : e0Var4.d.getCurrentPosition()) - k10) <= 450 && e0Var4.g < 0) {
                                            d0 d0Var6 = e0Var4.d;
                                            e0Var4.g = k10;
                                            d0Var6.seekTo(k10, f0Var3.q0, new k(e0Var4, 1));
                                        }
                                    }
                                }
                                f10 = 0.0f;
                                d0Var5.setVolume(f10);
                                if (Math.abs((e0Var4.g >= 0 ? e0Var4.g : e0Var4.d.getCurrentPosition()) - k10) <= 450) {
                                    d0 d0Var62 = e0Var4.d;
                                    e0Var4.g = k10;
                                    d0Var62.seekTo(k10, f0Var3.q0, new k(e0Var4, 1));
                                }
                            }
                        }
                        z10 = false;
                        d7 d7Var32 = e0Var4.n;
                        float f132 = duration;
                        k10 = Utilities.k(k11, (long) (d7Var32.W * f132), (long) (d7Var32.V * f132));
                        if (e0Var4.d.isPlaying() != z10) {
                        }
                        d0 d0Var52 = e0Var4.d;
                        if (!f0Var3.w0) {
                        }
                        f10 = 0.0f;
                        d0Var52.setVolume(f10);
                        if (Math.abs((e0Var4.g >= 0 ? e0Var4.g : e0Var4.d.getCurrentPosition()) - k10) <= 450) {
                        }
                    }
                }
                db dbVar = f0Var3.s0;
                if (dbVar != null) {
                    dbVar.setProgress(position);
                }
                w5 w5Var = f0Var3.t0;
                if (w5Var != null) {
                    w5Var.w(true);
                    f0Var3.t0.y(true);
                }
                if (f0Var3.o0 && f0Var3.r0) {
                    org.telegram.messenger.g0.h3(f0Var3.x0, (long) (1000.0f / org.telegram.messenger.g0.r));
                    break;
                }
                break;
            case 4:
                f0 f0Var4 = this.b;
                e0 e0Var5 = f0Var4.k0;
                if (e0Var5 != null) {
                    e0Var5.a(null);
                    f0Var4.q();
                    f0Var4.invalidate();
                    Runnable runnable2 = f0Var4.n0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                f0 f0Var5 = this.b;
                e0 e0Var6 = f0Var5.k0;
                if (e0Var6 != null && f0Var5.h.indexOf(e0Var6) >= 0) {
                    u uVar2 = f0Var5.f;
                    int indexOf = uVar2.e.indexOf(e0Var6.h);
                    ArrayList arrayList = uVar2.e;
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = 0;
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            t tVar = (t) arrayList2.get(i11);
                            if (tVar.c != i10) {
                                sb2.append("/");
                                i10 = tVar.c;
                            }
                            sb2.append(".");
                        }
                        uVar = new u(sb2.toString());
                    }
                    if (uVar.e.size() <= 1) {
                        f0Var5.c();
                        f0Var5.invalidate();
                    }
                    f0Var5.o(uVar);
                    f0Var5.g0 = true;
                    f0Var5.q();
                    f0Var5.invalidate();
                    Runnable runnable3 = f0Var5.n0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    ta taVar = ((ga) f0Var5).z0;
                    taVar.J0.a(false, true);
                    if (uVar.e.size() > 1) {
                        a0 a0Var = taVar.H0;
                        taVar.A0 = uVar;
                        a0Var.a(new v(uVar, false), true);
                        taVar.H0.b(true, true);
                    } else {
                        taVar.H0.b(false, true);
                    }
                    taVar.l0(true);
                    h3 h3Var = taVar.N0;
                    if (h3Var != null) {
                        h3Var.setMultipleOnClick(taVar.B0.j());
                        taVar.N0.setMaxCount(Math.min(10, u.b() - taVar.B0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                e0 e0Var7 = this.b.k0;
                if (e0Var7 != null && (d0Var3 = e0Var7.d) != null) {
                    d0Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
