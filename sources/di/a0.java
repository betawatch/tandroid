package di;

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
import org.telegram.ui.Components.n70;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ a0(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
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
        c0 c0Var;
        long j3;
        c0 c0Var2;
        boolean z10;
        long clamp;
        float f7;
        t tVar;
        c0 c0Var3;
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
                        frameLayout.addView(imageView, w7.x5.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(e0Var.getContext());
                        textView.setText(LocaleController.getString(R.string.StoryCollageMenuHint));
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        n70 F = n70.F(e0Var.a, e0Var.b, e0Var);
                        if (e0Var.j0.n.K) {
                            i8 i8Var = new i8(e0Var.getContext(), 0);
                            i8Var.b = 0.0f;
                            i8Var.c = 1.5f;
                            i8Var.d(e0Var.j0.n.P);
                            i8Var.h = new bi.o1(e0Var, 6);
                            i8Var.R = AndroidUtilities.dp(220.0f);
                            F.q(i8Var);
                            F.o();
                        }
                        F.T = 220;
                        F.c(R.drawable.menu_camera_retake, LocaleController.getString(R.string.StoreCollageRetake), new a0(e0Var, 4), false);
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new a0(e0Var, 5), true);
                        F.o();
                        F.r(frameLayout, w7.x5.n(220, -2));
                        F.p = new ah.j(7);
                        F.i = 1;
                        F.V = true;
                        F.u = true;
                        F.v = false;
                        int dp = AndroidUtilities.dp(12.0f);
                        int dp2 = AndroidUtilities.dp(10.0f);
                        F.l = dp;
                        F.k = dp2;
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
                    o8 o8Var = mainPart.n;
                    j3 = o8Var.X + ((long) (o8Var.V * o8Var.h0));
                }
                for (int i10 = 0; i10 < e0Var3.h.size(); i10++) {
                    d0 d0Var4 = (d0) e0Var3.h.get(i10);
                    if (d0Var4.n != null && (c0Var2 = d0Var4.d) != null) {
                        long duration = c0Var2.getDuration();
                        long clamp2 = Utilities.clamp((position + j3) - d0Var4.n.X, duration, 0L);
                        if (!e0Var3.n0 || e0Var3.q0) {
                            float f10 = clamp2;
                            o8 o8Var2 = d0Var4.n;
                            float f11 = duration;
                            if (f10 > o8Var2.V * f11 && f10 < o8Var2.W * f11) {
                                z10 = true;
                                o8 o8Var3 = d0Var4.n;
                                float f12 = duration;
                                clamp = Utilities.clamp(clamp2, (long) (o8Var3.W * f12), (long) (o8Var3.V * f12));
                                if (d0Var4.d.isPlaying() != z10) {
                                    if (z10) {
                                        d0Var4.d.play();
                                    } else {
                                        d0Var4.d.pause();
                                    }
                                }
                                c0 c0Var5 = d0Var4.d;
                                if (!e0Var3.v0) {
                                    o8 o8Var4 = d0Var4.n;
                                    if (!o8Var4.Y && e0Var3.n0) {
                                        f7 = o8Var4.P;
                                        c0Var5.setVolume(f7);
                                        if (Math.abs((d0Var4.g >= 0 ? d0Var4.g : d0Var4.d.getCurrentPosition()) - clamp) <= 450 && d0Var4.g < 0) {
                                            c0 c0Var6 = d0Var4.d;
                                            d0Var4.g = clamp;
                                            c0Var6.seekTo(clamp, e0Var3.p0, new bi.oa(d0Var4, 13));
                                        }
                                    }
                                }
                                f7 = 0.0f;
                                c0Var5.setVolume(f7);
                                if (Math.abs((d0Var4.g >= 0 ? d0Var4.g : d0Var4.d.getCurrentPosition()) - clamp) <= 450) {
                                    c0 c0Var62 = d0Var4.d;
                                    d0Var4.g = clamp;
                                    c0Var62.seekTo(clamp, e0Var3.p0, new bi.oa(d0Var4, 13));
                                }
                            }
                        }
                        z10 = false;
                        o8 o8Var32 = d0Var4.n;
                        float f122 = duration;
                        clamp = Utilities.clamp(clamp2, (long) (o8Var32.W * f122), (long) (o8Var32.V * f122));
                        if (d0Var4.d.isPlaying() != z10) {
                        }
                        c0 c0Var52 = d0Var4.d;
                        if (!e0Var3.v0) {
                        }
                        f7 = 0.0f;
                        c0Var52.setVolume(f7);
                        if (Math.abs((d0Var4.g >= 0 ? d0Var4.g : d0Var4.d.getCurrentPosition()) - clamp) <= 450) {
                        }
                    }
                }
                zc zcVar = e0Var3.r0;
                if (zcVar != null) {
                    zcVar.setProgress(position);
                }
                d7 d7Var = e0Var3.s0;
                if (d7Var != null) {
                    d7Var.w(true);
                    e0Var3.s0.y(true);
                }
                if (e0Var3.n0 && e0Var3.q0) {
                    AndroidUtilities.runOnUIThread(e0Var3.w0, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
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
                    if (indexOf < 0 || indexOf >= arrayList.size()) {
                        tVar = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = 0;
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            s sVar = (s) arrayList2.get(i12);
                            if (sVar.c != i11) {
                                sb2.append("/");
                                i11 = sVar.c;
                            }
                            sb2.append(".");
                        }
                        tVar = new t(sb2.toString());
                    }
                    if (tVar.e.size() <= 1) {
                        e0Var5.e();
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
                    pc pcVar = ((cc) e0Var5).y0;
                    pcVar.I0.a(false, true);
                    if (tVar.e.size() > 1) {
                        z zVar = pcVar.G0;
                        pcVar.z0 = tVar;
                        zVar.a(new u(tVar, false), true);
                        pcVar.G0.b(true, true);
                    } else {
                        pcVar.G0.b(false, true);
                    }
                    pcVar.m0(true);
                    ob obVar = pcVar.M0;
                    if (obVar != null) {
                        obVar.setMultipleOnClick(pcVar.A0.j());
                        pcVar.M0.setMaxCount(Math.min(10, t.b() - pcVar.A0.getFilledCount()));
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
