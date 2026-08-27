package lh;

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
import org.telegram.ui.Components.b70;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;

    public /* synthetic */ b0(e0 e0Var, int i10) {
        this.a = i10;
        this.b = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01df A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ag.o3 o3Var;
        long j10;
        ag.o3 o3Var2;
        boolean z10;
        long clamp;
        float f10;
        u uVar;
        ag.o3 o3Var3;
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                if (!e0Var.a0 && !e0Var.j0) {
                    d0 d0Var = e0Var.f0;
                    if (d0Var != null && (o3Var = d0Var.d) != null) {
                        o3Var.setVolume(0.0f);
                    }
                    d0 d0Var2 = e0Var.c0;
                    e0Var.f0 = d0Var2;
                    if (d0Var2 != null && d0Var2.n != null) {
                        Runnable runnable = e0Var.h0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        d0 d0Var3 = e0Var.f0;
                        ag.o3 o3Var4 = d0Var3.d;
                        if (o3Var4 != null) {
                            o3Var4.setVolume(d0Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(e0Var.getContext());
                        ImageView imageView = new ImageView(e0Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, h7.z5.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(e0Var.getContext());
                        textView.setText(LocaleController.getString(R.string.StoryCollageMenuHint));
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, h7.z5.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        b70 F = b70.F(e0Var.a, e0Var.b, e0Var);
                        if (e0Var.f0.n.K) {
                            t7 t7Var = new t7(e0Var.getContext(), 0);
                            t7Var.b = 0.0f;
                            t7Var.c = 1.5f;
                            t7Var.d(e0Var.f0.n.P);
                            t7Var.h = new ag.n0(e0Var, 25);
                            t7Var.N = AndroidUtilities.dp(220.0f);
                            F.q(t7Var);
                            F.o();
                        }
                        F.T = 220;
                        F.c(R.drawable.menu_camera_retake, LocaleController.getString(R.string.StoreCollageRetake), new b0(e0Var, 4), false);
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new b0(e0Var, 5), true);
                        F.o();
                        F.r(frameLayout, h7.z5.n(220, -2));
                        F.p = new ag.l3(15);
                        F.i = 1;
                        F.V = true;
                        F.u = true;
                        F.v = false;
                        int dp = AndroidUtilities.dp(12.0f);
                        int dp2 = AndroidUtilities.dp(10.0f);
                        F.l = dp;
                        F.k = dp2;
                        F.p = new b0(e0Var, 6);
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
                if (e0Var2.b0) {
                    e0Var2.b0 = false;
                    e0Var2.invalidate();
                    break;
                }
                break;
            case 3:
                e0 e0Var3 = this.b;
                long position = e0Var3.getPosition();
                d0 mainPart = e0Var3.getMainPart();
                if (mainPart == null) {
                    j10 = 0;
                } else {
                    z7 z7Var = mainPart.n;
                    j10 = z7Var.X + ((long) (z7Var.V * z7Var.h0));
                }
                for (int i10 = 0; i10 < e0Var3.h.size(); i10++) {
                    d0 d0Var4 = (d0) e0Var3.h.get(i10);
                    if (d0Var4.n != null && (o3Var2 = d0Var4.d) != null) {
                        long duration = o3Var2.getDuration();
                        long clamp2 = Utilities.clamp((position + j10) - d0Var4.n.X, duration, 0L);
                        if (!e0Var3.j0 || e0Var3.m0) {
                            float f11 = clamp2;
                            z7 z7Var2 = d0Var4.n;
                            float f12 = duration;
                            if (f11 > z7Var2.V * f12 && f11 < z7Var2.W * f12) {
                                z10 = true;
                                z7 z7Var3 = d0Var4.n;
                                float f13 = duration;
                                clamp = Utilities.clamp(clamp2, (long) (z7Var3.W * f13), (long) (z7Var3.V * f13));
                                if (d0Var4.d.isPlaying() != z10) {
                                    if (z10) {
                                        d0Var4.d.play();
                                    } else {
                                        d0Var4.d.pause();
                                    }
                                }
                                ag.o3 o3Var5 = d0Var4.d;
                                if (!e0Var3.r0) {
                                    z7 z7Var4 = d0Var4.n;
                                    if (!z7Var4.Y && e0Var3.j0) {
                                        f10 = z7Var4.P;
                                        o3Var5.setVolume(f10);
                                        if (Math.abs((d0Var4.g >= 0 ? d0Var4.g : d0Var4.d.getCurrentPosition()) - clamp) <= 450 && d0Var4.g < 0) {
                                            ag.o3 o3Var6 = d0Var4.d;
                                            d0Var4.g = clamp;
                                            o3Var6.seekTo(clamp, e0Var3.l0, new kh.c(d0Var4, 4));
                                        }
                                    }
                                }
                                f10 = 0.0f;
                                o3Var5.setVolume(f10);
                                if (Math.abs((d0Var4.g >= 0 ? d0Var4.g : d0Var4.d.getCurrentPosition()) - clamp) <= 450) {
                                    ag.o3 o3Var62 = d0Var4.d;
                                    d0Var4.g = clamp;
                                    o3Var62.seekTo(clamp, e0Var3.l0, new kh.c(d0Var4, 4));
                                }
                            }
                        }
                        z10 = false;
                        z7 z7Var32 = d0Var4.n;
                        float f132 = duration;
                        clamp = Utilities.clamp(clamp2, (long) (z7Var32.W * f132), (long) (z7Var32.V * f132));
                        if (d0Var4.d.isPlaying() != z10) {
                        }
                        ag.o3 o3Var52 = d0Var4.d;
                        if (!e0Var3.r0) {
                        }
                        f10 = 0.0f;
                        o3Var52.setVolume(f10);
                        if (Math.abs((d0Var4.g >= 0 ? d0Var4.g : d0Var4.d.getCurrentPosition()) - clamp) <= 450) {
                        }
                    }
                }
                cc ccVar = e0Var3.n0;
                if (ccVar != null) {
                    ccVar.setProgress(position);
                }
                q6 q6Var = e0Var3.o0;
                if (q6Var != null) {
                    q6Var.w(true);
                    e0Var3.o0.y(true);
                }
                if (e0Var3.j0 && e0Var3.m0) {
                    AndroidUtilities.runOnUIThread(e0Var3.s0, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    break;
                }
                break;
            case 4:
                e0 e0Var4 = this.b;
                d0 d0Var5 = e0Var4.f0;
                if (d0Var5 != null) {
                    d0Var5.a(null);
                    e0Var4.q();
                    e0Var4.invalidate();
                    Runnable runnable2 = e0Var4.i0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                e0 e0Var5 = this.b;
                d0 d0Var6 = e0Var5.f0;
                if (d0Var6 != null && e0Var5.h.indexOf(d0Var6) >= 0) {
                    u uVar2 = e0Var5.f;
                    int indexOf = uVar2.e.indexOf(d0Var6.h);
                    ArrayList arrayList = uVar2.e;
                    if (indexOf < 0 || indexOf >= arrayList.size()) {
                        uVar = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = 0;
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            t tVar = (t) arrayList2.get(i12);
                            if (tVar.c != i11) {
                                sb2.append("/");
                                i11 = tVar.c;
                            }
                            sb2.append(".");
                        }
                        uVar = new u(sb2.toString());
                    }
                    if (uVar.e.size() <= 1) {
                        e0Var5.e();
                        e0Var5.invalidate();
                    }
                    e0Var5.o(uVar);
                    e0Var5.b0 = true;
                    e0Var5.q();
                    e0Var5.invalidate();
                    Runnable runnable3 = e0Var5.i0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    sb sbVar = ((gb) e0Var5).u0;
                    sbVar.E0.a(false, true);
                    if (uVar.e.size() > 1) {
                        a0 a0Var = sbVar.C0;
                        sbVar.v0 = uVar;
                        a0Var.a(new v(uVar, false), true);
                        sbVar.C0.b(true, true);
                    } else {
                        sbVar.C0.b(false, true);
                    }
                    sbVar.m0(true);
                    sa saVar = sbVar.I0;
                    if (saVar != null) {
                        saVar.setMultipleOnClick(sbVar.w0.j());
                        sbVar.I0.setMaxCount(Math.min(10, u.b() - sbVar.w0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                d0 d0Var7 = this.b.f0;
                if (d0Var7 != null && (o3Var3 = d0Var7.d) != null) {
                    o3Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
