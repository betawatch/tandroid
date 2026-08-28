package kh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;

    public /* synthetic */ b0(f0 f0Var, int i9) {
        this.a = i9;
        this.b = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        d0 d0Var;
        long j10;
        d0 d0Var2;
        boolean z10;
        long clamp;
        float f10;
        u uVar;
        d0 d0Var3;
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                if (!f0Var.a0 && !f0Var.j0) {
                    e0 e0Var = f0Var.f0;
                    if (e0Var != null && (d0Var = e0Var.d) != null) {
                        d0Var.setVolume(0.0f);
                    }
                    e0 e0Var2 = f0Var.c0;
                    f0Var.f0 = e0Var2;
                    if (e0Var2 != null && e0Var2.n != null) {
                        Runnable runnable = f0Var.h0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        e0 e0Var3 = f0Var.f0;
                        d0 d0Var4 = e0Var3.d;
                        if (d0Var4 != null) {
                            d0Var4.setVolume(e0Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(f0Var.getContext());
                        ImageView imageView = new ImageView(f0Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, g7.e6.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(f0Var.getContext());
                        textView.setText(LocaleController.getString(R.string.StoryCollageMenuHint));
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        x60 F = x60.F(f0Var.a, f0Var.b, f0Var);
                        if (f0Var.f0.n.K) {
                            u7 u7Var = new u7(f0Var.getContext(), 0);
                            u7Var.b = 0.0f;
                            u7Var.c = 1.5f;
                            u7Var.d(f0Var.f0.n.P);
                            u7Var.h = new bg.i(f0Var, 23);
                            u7Var.N = AndroidUtilities.dp(220.0f);
                            F.q(u7Var);
                            F.o();
                        }
                        F.T = 220;
                        F.c(R.drawable.menu_camera_retake, LocaleController.getString(R.string.StoreCollageRetake), new b0(f0Var, 4), false);
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new b0(f0Var, 5), true);
                        F.o();
                        F.r(frameLayout, g7.e6.n(220, -2));
                        F.p = new bg.d2(14);
                        F.i = 1;
                        F.V = true;
                        F.u = true;
                        F.v = false;
                        int dp = AndroidUtilities.dp(12.0f);
                        int dp2 = AndroidUtilities.dp(10.0f);
                        F.l = dp;
                        F.k = dp2;
                        F.p = new b0(f0Var, 6);
                        F.Z();
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
                if (f0Var2.b0) {
                    f0Var2.b0 = false;
                    f0Var2.invalidate();
                    break;
                }
                break;
            case 3:
                f0 f0Var3 = this.b;
                long position = f0Var3.getPosition();
                e0 mainPart = f0Var3.getMainPart();
                if (mainPart == null) {
                    j10 = 0;
                } else {
                    a8 a8Var = mainPart.n;
                    j10 = a8Var.X + ((long) (a8Var.V * a8Var.h0));
                }
                for (int i9 = 0; i9 < f0Var3.h.size(); i9++) {
                    e0 e0Var4 = (e0) f0Var3.h.get(i9);
                    if (e0Var4.n != null && (d0Var2 = e0Var4.d) != null) {
                        long duration = d0Var2.getDuration();
                        long clamp2 = Utilities.clamp((position + j10) - e0Var4.n.X, duration, 0L);
                        if (!f0Var3.j0 || f0Var3.m0) {
                            float f11 = clamp2;
                            a8 a8Var2 = e0Var4.n;
                            float f12 = duration;
                            if (f11 > a8Var2.V * f12 && f11 < a8Var2.W * f12) {
                                z10 = true;
                                a8 a8Var3 = e0Var4.n;
                                float f13 = duration;
                                clamp = Utilities.clamp(clamp2, (long) (a8Var3.W * f13), (long) (a8Var3.V * f13));
                                if (e0Var4.d.isPlaying() != z10) {
                                    if (z10) {
                                        e0Var4.d.play();
                                    } else {
                                        e0Var4.d.pause();
                                    }
                                }
                                d0 d0Var5 = e0Var4.d;
                                if (!f0Var3.r0) {
                                    a8 a8Var4 = e0Var4.n;
                                    if (!a8Var4.Y && f0Var3.j0) {
                                        f10 = a8Var4.P;
                                        d0Var5.setVolume(f10);
                                        if (Math.abs((e0Var4.g >= 0 ? e0Var4.g : e0Var4.d.getCurrentPosition()) - clamp) <= 450 && e0Var4.g < 0) {
                                            d0 d0Var6 = e0Var4.d;
                                            e0Var4.g = clamp;
                                            d0Var6.seekTo(clamp, f0Var3.l0, new ih.g(e0Var4, 27));
                                        }
                                    }
                                }
                                f10 = 0.0f;
                                d0Var5.setVolume(f10);
                                if (Math.abs((e0Var4.g >= 0 ? e0Var4.g : e0Var4.d.getCurrentPosition()) - clamp) <= 450) {
                                    d0 d0Var62 = e0Var4.d;
                                    e0Var4.g = clamp;
                                    d0Var62.seekTo(clamp, f0Var3.l0, new ih.g(e0Var4, 27));
                                }
                            }
                        }
                        z10 = false;
                        a8 a8Var32 = e0Var4.n;
                        float f132 = duration;
                        clamp = Utilities.clamp(clamp2, (long) (a8Var32.W * f132), (long) (a8Var32.V * f132));
                        if (e0Var4.d.isPlaying() != z10) {
                        }
                        d0 d0Var52 = e0Var4.d;
                        if (!f0Var3.r0) {
                        }
                        f10 = 0.0f;
                        d0Var52.setVolume(f10);
                        if (Math.abs((e0Var4.g >= 0 ? e0Var4.g : e0Var4.d.getCurrentPosition()) - clamp) <= 450) {
                        }
                    }
                }
                gc gcVar = f0Var3.n0;
                if (gcVar != null) {
                    gcVar.setProgress(position);
                }
                r6 r6Var = f0Var3.o0;
                if (r6Var != null) {
                    r6Var.w(true);
                    f0Var3.o0.y(true);
                }
                if (f0Var3.j0 && f0Var3.m0) {
                    AndroidUtilities.runOnUIThread(f0Var3.s0, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    break;
                }
                break;
            case 4:
                f0 f0Var4 = this.b;
                e0 e0Var5 = f0Var4.f0;
                if (e0Var5 != null) {
                    e0Var5.a(null);
                    f0Var4.q();
                    f0Var4.invalidate();
                    Runnable runnable2 = f0Var4.i0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                f0 f0Var5 = this.b;
                e0 e0Var6 = f0Var5.f0;
                if (e0Var6 != null && f0Var5.h.indexOf(e0Var6) >= 0) {
                    u uVar2 = f0Var5.f;
                    int indexOf = uVar2.e.indexOf(e0Var6.h);
                    ArrayList arrayList = uVar2.e;
                    if (indexOf < 0 || indexOf >= arrayList.size()) {
                        uVar = null;
                    } else {
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
                        f0Var5.e();
                        f0Var5.invalidate();
                    }
                    f0Var5.o(uVar);
                    f0Var5.b0 = true;
                    f0Var5.q();
                    f0Var5.invalidate();
                    Runnable runnable3 = f0Var5.i0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    wb wbVar = ((jb) f0Var5).u0;
                    wbVar.E0.a(false, true);
                    if (uVar.e.size() > 1) {
                        a0 a0Var = wbVar.C0;
                        wbVar.v0 = uVar;
                        a0Var.a(new v(uVar, false), true);
                        wbVar.C0.b(true, true);
                    } else {
                        wbVar.C0.b(false, true);
                    }
                    wbVar.m0(true);
                    va vaVar = wbVar.I0;
                    if (vaVar != null) {
                        vaVar.setMultipleOnClick(wbVar.w0.j());
                        wbVar.I0.setMaxCount(Math.min(10, u.b() - wbVar.w0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                e0 e0Var7 = this.b.f0;
                if (e0Var7 != null && (d0Var3 = e0Var7.d) != null) {
                    d0Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
