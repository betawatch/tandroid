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
import org.telegram.messenger.m10;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ j0(n0 n0Var, int i7) {
        this.a = i7;
        this.b = n0Var;
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
        l0 l0Var;
        long j3;
        l0 l0Var2;
        boolean z10;
        long k10;
        float f10;
        l0 l0Var3;
        c0 c0Var = null;
        switch (this.a) {
            case 0:
                n0 n0Var = this.b;
                if (!n0Var.f0 && !n0Var.o0) {
                    m0 m0Var = n0Var.k0;
                    if (m0Var != null && (l0Var = m0Var.d) != null) {
                        l0Var.setVolume(0.0f);
                    }
                    m0 m0Var2 = n0Var.h0;
                    n0Var.k0 = m0Var2;
                    if (m0Var2 != null && m0Var2.n != null) {
                        Runnable runnable = n0Var.m0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        m0 m0Var3 = n0Var.k0;
                        l0 l0Var4 = m0Var3.d;
                        if (l0Var4 != null) {
                            l0Var4.setVolume(m0Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(n0Var.getContext());
                        ImageView imageView = new ImageView(n0Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, c8.na.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(n0Var.getContext());
                        m10.l(13.0f, 2131744461, 1, textView, null);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, c8.na.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        x60 G = x60.G(n0Var.a, n0Var.b, n0Var);
                        if (n0Var.k0.n.K) {
                            g7 g7Var = new g7(n0Var.getContext(), 0);
                            g7Var.b = 0.0f;
                            g7Var.c = 1.5f;
                            g7Var.d(n0Var.k0.n.P);
                            g7Var.h = new ai.d0(n0Var, 22);
                            g7Var.S = org.telegram.messenger.g0.L(220.0f);
                            G.q(g7Var);
                            G.o(true);
                        }
                        G.W = ks.x3;
                        G.c(R.drawable.menu_camera_retake, gd.N0(2131744570, null), new j0(n0Var, 4), false);
                        G.c(R.drawable.msg_delete, gd.N0(2131751586, null), new j0(n0Var, 5), true);
                        G.o(true);
                        G.r(frameLayout, c8.na.o(ks.x3, -2));
                        G.p = new ai.k(16);
                        G.i = 1;
                        G.Y = true;
                        G.u = true;
                        G.v = false;
                        int L = org.telegram.messenger.g0.L(12.0f);
                        int L2 = org.telegram.messenger.g0.L(10.0f);
                        G.l = L;
                        G.k = L2;
                        G.p = new j0(n0Var, 6);
                        G.a0();
                        try {
                            n0Var.performHapticFeedback(0, 1);
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
                n0 n0Var2 = this.b;
                if (n0Var2.g0) {
                    n0Var2.g0 = false;
                    n0Var2.invalidate();
                    break;
                }
                break;
            case 3:
                n0 n0Var3 = this.b;
                long position = n0Var3.getPosition();
                m0 mainPart = n0Var3.getMainPart();
                if (mainPart == null) {
                    j3 = 0;
                } else {
                    x7 x7Var = mainPart.n;
                    j3 = x7Var.X + ((long) (x7Var.V * x7Var.h0));
                }
                for (int i7 = 0; i7 < n0Var3.h.size(); i7++) {
                    m0 m0Var4 = (m0) n0Var3.h.get(i7);
                    if (m0Var4.n != null && (l0Var2 = m0Var4.d) != null) {
                        long duration = l0Var2.getDuration();
                        long k11 = Utilities.k((position + j3) - m0Var4.n.X, duration, 0L);
                        if (!n0Var3.o0 || n0Var3.r0) {
                            float f11 = k11;
                            x7 x7Var2 = m0Var4.n;
                            float f12 = duration;
                            if (f11 > x7Var2.V * f12 && f11 < x7Var2.W * f12) {
                                z10 = true;
                                x7 x7Var3 = m0Var4.n;
                                float f13 = duration;
                                k10 = Utilities.k(k11, (long) (x7Var3.W * f13), (long) (x7Var3.V * f13));
                                if (m0Var4.d.isPlaying() != z10) {
                                    if (z10) {
                                        m0Var4.d.play();
                                    } else {
                                        m0Var4.d.pause();
                                    }
                                }
                                l0 l0Var5 = m0Var4.d;
                                if (!n0Var3.w0) {
                                    x7 x7Var4 = m0Var4.n;
                                    if (!x7Var4.Y && n0Var3.o0) {
                                        f10 = x7Var4.P;
                                        l0Var5.setVolume(f10);
                                        if (Math.abs((m0Var4.g >= 0 ? m0Var4.g : m0Var4.d.getCurrentPosition()) - k10) <= 450 && m0Var4.g < 0) {
                                            l0 l0Var6 = m0Var4.d;
                                            m0Var4.g = k10;
                                            l0Var6.seekTo(k10, n0Var3.q0, new w(m0Var4, 2));
                                        }
                                    }
                                }
                                f10 = 0.0f;
                                l0Var5.setVolume(f10);
                                if (Math.abs((m0Var4.g >= 0 ? m0Var4.g : m0Var4.d.getCurrentPosition()) - k10) <= 450) {
                                    l0 l0Var62 = m0Var4.d;
                                    m0Var4.g = k10;
                                    l0Var62.seekTo(k10, n0Var3.q0, new w(m0Var4, 2));
                                }
                            }
                        }
                        z10 = false;
                        x7 x7Var32 = m0Var4.n;
                        float f132 = duration;
                        k10 = Utilities.k(k11, (long) (x7Var32.W * f132), (long) (x7Var32.V * f132));
                        if (m0Var4.d.isPlaying() != z10) {
                        }
                        l0 l0Var52 = m0Var4.d;
                        if (!n0Var3.w0) {
                        }
                        f10 = 0.0f;
                        l0Var52.setVolume(f10);
                        if (Math.abs((m0Var4.g >= 0 ? m0Var4.g : m0Var4.d.getCurrentPosition()) - k10) <= 450) {
                        }
                    }
                }
                xb xbVar = n0Var3.s0;
                if (xbVar != null) {
                    xbVar.setProgress(position);
                }
                f6 f6Var = n0Var3.t0;
                if (f6Var != null) {
                    f6Var.w(true);
                    n0Var3.t0.y(true);
                }
                if (n0Var3.o0 && n0Var3.r0) {
                    org.telegram.messenger.g0.h3(n0Var3.x0, (long) (1000.0f / org.telegram.messenger.g0.r));
                    break;
                }
                break;
            case 4:
                n0 n0Var4 = this.b;
                m0 m0Var5 = n0Var4.k0;
                if (m0Var5 != null) {
                    m0Var5.a(null);
                    n0Var4.q();
                    n0Var4.invalidate();
                    Runnable runnable2 = n0Var4.n0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                n0 n0Var5 = this.b;
                m0 m0Var6 = n0Var5.k0;
                if (m0Var6 != null && n0Var5.h.indexOf(m0Var6) >= 0) {
                    c0 c0Var2 = n0Var5.f;
                    int indexOf = c0Var2.e.indexOf(m0Var6.h);
                    ArrayList arrayList = c0Var2.e;
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = 0;
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            b0 b0Var = (b0) arrayList2.get(i11);
                            if (b0Var.c != i10) {
                                sb2.append("/");
                                i10 = b0Var.c;
                            }
                            sb2.append(".");
                        }
                        c0Var = new c0(sb2.toString());
                    }
                    if (c0Var.e.size() <= 1) {
                        n0Var5.c();
                        n0Var5.invalidate();
                    }
                    n0Var5.o(c0Var);
                    n0Var5.g0 = true;
                    n0Var5.q();
                    n0Var5.invalidate();
                    Runnable runnable3 = n0Var5.n0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    nb nbVar = ((ab) n0Var5).z0;
                    nbVar.J0.a(false, true);
                    if (c0Var.e.size() > 1) {
                        i0 i0Var = nbVar.H0;
                        nbVar.A0 = c0Var;
                        i0Var.a(new d0(c0Var, false), true);
                        nbVar.H0.b(true, true);
                    } else {
                        nbVar.H0.b(false, true);
                    }
                    nbVar.l0(true);
                    p3 p3Var = nbVar.N0;
                    if (p3Var != null) {
                        p3Var.setMultipleOnClick(nbVar.B0.j());
                        nbVar.N0.setMaxCount(Math.min(10, c0.b() - nbVar.B0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                m0 m0Var7 = this.b.k0;
                if (m0Var7 != null && (l0Var3 = m0Var7.d) != null) {
                    l0Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
