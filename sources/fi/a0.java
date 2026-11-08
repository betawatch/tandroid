package fi;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ a0(e0 e0Var, int i7) {
        this.a = i7;
        this.b = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01da A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        c0 c0Var;
        long j3;
        c0 c0Var2;
        boolean z9;
        long k10;
        float f10;
        c0 c0Var3;
        t tVar = null;
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                if (!e0Var.e0 && !e0Var.n0) {
                    d0 d0Var = e0Var.j0;
                    if (d0Var != null && (c0Var = d0Var.d) != null) {
                        c0Var.setVolume(0.0f);
                    }
                    d0 d0Var2 = e0Var.g0;
                    e0Var.j0 = d0Var2;
                    if (d0Var2 != null && d0Var2.n != null) {
                        Runnable runnable = e0Var.l0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        d0 d0Var3 = e0Var.j0;
                        c0 c0Var4 = d0Var3.d;
                        if (c0Var4 != null) {
                            c0Var4.setVolume(d0Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(e0Var.getContext());
                        ImageView imageView = new ImageView(e0Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, c8.ha.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(e0Var.getContext());
                        textView.setText(id.M0(2131744708, null));
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        k60 F = k60.F(e0Var.a, e0Var.b, e0Var);
                        if (e0Var.j0.n.K) {
                            y6 y6Var = new y6(e0Var.getContext(), 0);
                            y6Var.b = 0.0f;
                            y6Var.c = 1.5f;
                            y6Var.d(e0Var.j0.n.P);
                            y6Var.h = new ai.i(e0Var, 17);
                            y6Var.R = org.telegram.messenger.g0.L(220.0f);
                            F.q(y6Var);
                            F.o();
                        }
                        F.T = qs.x3;
                        F.c(R.drawable.menu_camera_retake, id.M0(2131744814, null), new a0(e0Var, 4), false);
                        F.c(R.drawable.msg_delete, id.M0(2131751599, null), new a0(e0Var, 5), true);
                        F.o();
                        F.r(frameLayout, c8.ha.o(qs.x3, -2));
                        F.p = new ai.m0(10);
                        F.i = 1;
                        F.V = true;
                        F.u = true;
                        F.v = false;
                        int L = org.telegram.messenger.g0.L(12.0f);
                        int L2 = org.telegram.messenger.g0.L(10.0f);
                        F.l = L;
                        F.k = L2;
                        F.p = new a0(e0Var, 6);
                        F.Z();
                        try {
                            e0Var.performHapticFeedback(0, 1);
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
                e0 e0Var2 = this.b;
                if (e0Var2.f0) {
                    e0Var2.f0 = false;
                    e0Var2.invalidate();
                    break;
                }
                break;
            case 3:
                e0 e0Var3 = this.b;
                long position = e0Var3.getPosition();
                d0 mainPart = e0Var3.getMainPart();
                if (mainPart == null) {
                    j3 = 0;
                } else {
                    e7 e7Var = mainPart.n;
                    j3 = e7Var.X + ((long) (e7Var.V * e7Var.h0));
                }
                for (int i7 = 0; i7 < e0Var3.h.size(); i7++) {
                    d0 d0Var4 = (d0) e0Var3.h.get(i7);
                    if (d0Var4.n != null && (c0Var2 = d0Var4.d) != null) {
                        long duration = c0Var2.getDuration();
                        long k11 = Utilities.k((position + j3) - d0Var4.n.X, duration, 0L);
                        if (!e0Var3.n0 || e0Var3.q0) {
                            float f11 = k11;
                            e7 e7Var2 = d0Var4.n;
                            float f12 = duration;
                            if (f11 > e7Var2.V * f12 && f11 < e7Var2.W * f12) {
                                z9 = true;
                                e7 e7Var3 = d0Var4.n;
                                float f13 = duration;
                                k10 = Utilities.k(k11, (long) (e7Var3.W * f13), (long) (e7Var3.V * f13));
                                if (d0Var4.d.isPlaying() != z9) {
                                    if (z9) {
                                        d0Var4.d.play();
                                    } else {
                                        d0Var4.d.pause();
                                    }
                                }
                                c0 c0Var5 = d0Var4.d;
                                if (!e0Var3.v0) {
                                    e7 e7Var4 = d0Var4.n;
                                    if (!e7Var4.Y && e0Var3.n0) {
                                        f10 = e7Var4.P;
                                        c0Var5.setVolume(f10);
                                        if (Math.abs((d0Var4.g >= 0 ? d0Var4.g : d0Var4.d.getCurrentPosition()) - k10) <= 450 && d0Var4.g < 0) {
                                            c0 c0Var6 = d0Var4.d;
                                            d0Var4.g = k10;
                                            c0Var6.seekTo(k10, e0Var3.p0, new di.s7(d0Var4, 14));
                                        }
                                    }
                                }
                                f10 = 0.0f;
                                c0Var5.setVolume(f10);
                                if (Math.abs((d0Var4.g >= 0 ? d0Var4.g : d0Var4.d.getCurrentPosition()) - k10) <= 450) {
                                    c0 c0Var62 = d0Var4.d;
                                    d0Var4.g = k10;
                                    c0Var62.seekTo(k10, e0Var3.p0, new di.s7(d0Var4, 14));
                                }
                            }
                        }
                        z9 = false;
                        e7 e7Var32 = d0Var4.n;
                        float f132 = duration;
                        k10 = Utilities.k(k11, (long) (e7Var32.W * f132), (long) (e7Var32.V * f132));
                        if (d0Var4.d.isPlaying() != z9) {
                        }
                        c0 c0Var52 = d0Var4.d;
                        if (!e0Var3.v0) {
                        }
                        f10 = 0.0f;
                        c0Var52.setVolume(f10);
                        if (Math.abs((d0Var4.g >= 0 ? d0Var4.g : d0Var4.d.getCurrentPosition()) - k10) <= 450) {
                        }
                    }
                }
                fb fbVar = e0Var3.r0;
                if (fbVar != null) {
                    fbVar.setProgress(position);
                }
                y5 y5Var = e0Var3.s0;
                if (y5Var != null) {
                    y5Var.w(true);
                    e0Var3.s0.y(true);
                }
                if (e0Var3.n0 && e0Var3.q0) {
                    org.telegram.messenger.g0.i3(e0Var3.w0, (long) (1000.0f / org.telegram.messenger.g0.r));
                    break;
                }
                break;
            case 4:
                e0 e0Var4 = this.b;
                d0 d0Var5 = e0Var4.j0;
                if (d0Var5 != null) {
                    d0Var5.a(null);
                    e0Var4.q();
                    e0Var4.invalidate();
                    Runnable runnable2 = e0Var4.m0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                e0 e0Var5 = this.b;
                d0 d0Var6 = e0Var5.j0;
                if (d0Var6 != null && e0Var5.h.indexOf(d0Var6) >= 0) {
                    t tVar2 = e0Var5.f;
                    int indexOf = tVar2.e.indexOf(d0Var6.h);
                    ArrayList arrayList = tVar2.e;
                    if (indexOf >= 0 && indexOf < arrayList.size()) {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb2 = new StringBuilder();
                        int i10 = 0;
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            s sVar = (s) arrayList2.get(i11);
                            if (sVar.c != i10) {
                                sb2.append("/");
                                i10 = sVar.c;
                            }
                            sb2.append(".");
                        }
                        tVar = new t(sb2.toString());
                    }
                    if (tVar.e.size() <= 1) {
                        e0Var5.c();
                        e0Var5.invalidate();
                    }
                    e0Var5.o(tVar);
                    e0Var5.f0 = true;
                    e0Var5.q();
                    e0Var5.invalidate();
                    Runnable runnable3 = e0Var5.m0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    va vaVar = ((ia) e0Var5).y0;
                    vaVar.I0.a(false, true);
                    if (tVar.e.size() > 1) {
                        z zVar = vaVar.G0;
                        vaVar.z0 = tVar;
                        zVar.a(new u(tVar, false), true);
                        vaVar.G0.b(true, true);
                    } else {
                        vaVar.G0.b(false, true);
                    }
                    vaVar.l0(true);
                    i3 i3Var = vaVar.M0;
                    if (i3Var != null) {
                        i3Var.setMultipleOnClick(vaVar.A0.j());
                        vaVar.M0.setMaxCount(Math.min(10, t.b() - vaVar.A0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                d0 d0Var7 = this.b.j0;
                if (d0Var7 != null && (c0Var3 = d0Var7.d) != null) {
                    c0Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
