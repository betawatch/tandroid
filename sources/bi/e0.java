package bi;

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
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ e0(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
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
        h0 h0Var;
        long j3;
        h0 h0Var2;
        boolean z10;
        long clamp;
        float f7;
        x xVar;
        h0 h0Var3;
        switch (this.a) {
            case 0:
                j0 j0Var = this.b;
                if (!j0Var.e0 && !j0Var.n0) {
                    i0 i0Var = j0Var.j0;
                    if (i0Var != null && (h0Var = i0Var.d) != null) {
                        h0Var.setVolume(0.0f);
                    }
                    i0 i0Var2 = j0Var.g0;
                    j0Var.j0 = i0Var2;
                    if (i0Var2 != null && i0Var2.n != null) {
                        Runnable runnable = j0Var.l0;
                        if (runnable != null) {
                            runnable.run();
                        }
                        i0 i0Var3 = j0Var.j0;
                        h0 h0Var4 = i0Var3.d;
                        if (h0Var4 != null) {
                            h0Var4.setVolume(i0Var3.n.P);
                        }
                        FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                        ImageView imageView = new ImageView(j0Var.getContext());
                        imageView.setImageResource(R.drawable.menu_lightbulb);
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        frameLayout.addView(imageView, w7.a6.d(24, 24.0f, 19, 12.0f, 12.0f, 12.0f, 12.0f));
                        TextView textView = new TextView(j0Var.getContext());
                        textView.setText(LocaleController.getString(R.string.StoryCollageMenuHint));
                        textView.setTextSize(1, 13.0f);
                        textView.setTextColor(-1);
                        frameLayout.addView(textView, w7.a6.d(-1, -2.0f, 23, 47.0f, 8.0f, 24.0f, 8.0f));
                        w70 F = w70.F(j0Var.a, j0Var.b, j0Var);
                        if (j0Var.j0.n.K) {
                            k9 k9Var = new k9(j0Var.getContext(), 0);
                            k9Var.b = 0.0f;
                            k9Var.c = 1.5f;
                            k9Var.d(j0Var.j0.n.P);
                            k9Var.h = new ai.b(j0Var, 2);
                            k9Var.R = AndroidUtilities.dp(220.0f);
                            F.q(k9Var);
                            F.o();
                        }
                        F.T = 220;
                        F.c(R.drawable.menu_camera_retake, LocaleController.getString(R.string.StoreCollageRetake), new e0(j0Var, 4), false);
                        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new e0(j0Var, 5), true);
                        F.o();
                        F.r(frameLayout, w7.a6.n(220, -2));
                        F.p = new f0(0);
                        F.i = 1;
                        F.V = true;
                        F.u = true;
                        F.v = false;
                        int dp = AndroidUtilities.dp(12.0f);
                        int dp2 = AndroidUtilities.dp(10.0f);
                        F.l = dp;
                        F.k = dp2;
                        F.p = new e0(j0Var, 6);
                        F.Z();
                        try {
                            j0Var.performHapticFeedback(0, 1);
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
                j0 j0Var2 = this.b;
                if (j0Var2.f0) {
                    j0Var2.f0 = false;
                    j0Var2.invalidate();
                    break;
                }
                break;
            case 3:
                j0 j0Var3 = this.b;
                long position = j0Var3.getPosition();
                i0 mainPart = j0Var3.getMainPart();
                if (mainPart == null) {
                    j3 = 0;
                } else {
                    r9 r9Var = mainPart.n;
                    j3 = r9Var.X + ((long) (r9Var.V * r9Var.h0));
                }
                for (int i10 = 0; i10 < j0Var3.h.size(); i10++) {
                    i0 i0Var4 = (i0) j0Var3.h.get(i10);
                    if (i0Var4.n != null && (h0Var2 = i0Var4.d) != null) {
                        long duration = h0Var2.getDuration();
                        long clamp2 = Utilities.clamp((position + j3) - i0Var4.n.X, duration, 0L);
                        if (!j0Var3.n0 || j0Var3.q0) {
                            float f10 = clamp2;
                            r9 r9Var2 = i0Var4.n;
                            float f11 = duration;
                            if (f10 > r9Var2.V * f11 && f10 < r9Var2.W * f11) {
                                z10 = true;
                                r9 r9Var3 = i0Var4.n;
                                float f12 = duration;
                                clamp = Utilities.clamp(clamp2, (long) (r9Var3.W * f12), (long) (r9Var3.V * f12));
                                if (i0Var4.d.isPlaying() != z10) {
                                    if (z10) {
                                        i0Var4.d.play();
                                    } else {
                                        i0Var4.d.pause();
                                    }
                                }
                                h0 h0Var5 = i0Var4.d;
                                if (!j0Var3.v0) {
                                    r9 r9Var4 = i0Var4.n;
                                    if (!r9Var4.Y && j0Var3.n0) {
                                        f7 = r9Var4.P;
                                        h0Var5.setVolume(f7);
                                        if (Math.abs((i0Var4.g >= 0 ? i0Var4.g : i0Var4.d.getCurrentPosition()) - clamp) <= 450 && i0Var4.g < 0) {
                                            h0 h0Var6 = i0Var4.d;
                                            i0Var4.g = clamp;
                                            h0Var6.seekTo(clamp, j0Var3.p0, new a3.d(i0Var4, 13));
                                        }
                                    }
                                }
                                f7 = 0.0f;
                                h0Var5.setVolume(f7);
                                if (Math.abs((i0Var4.g >= 0 ? i0Var4.g : i0Var4.d.getCurrentPosition()) - clamp) <= 450) {
                                    h0 h0Var62 = i0Var4.d;
                                    i0Var4.g = clamp;
                                    h0Var62.seekTo(clamp, j0Var3.p0, new a3.d(i0Var4, 13));
                                }
                            }
                        }
                        z10 = false;
                        r9 r9Var32 = i0Var4.n;
                        float f122 = duration;
                        clamp = Utilities.clamp(clamp2, (long) (r9Var32.W * f122), (long) (r9Var32.V * f122));
                        if (i0Var4.d.isPlaying() != z10) {
                        }
                        h0 h0Var52 = i0Var4.d;
                        if (!j0Var3.v0) {
                        }
                        f7 = 0.0f;
                        h0Var52.setVolume(f7);
                        if (Math.abs((i0Var4.g >= 0 ? i0Var4.g : i0Var4.d.getCurrentPosition()) - clamp) <= 450) {
                        }
                    }
                }
                me meVar = j0Var3.r0;
                if (meVar != null) {
                    meVar.setProgress(position);
                }
                e8 e8Var = j0Var3.s0;
                if (e8Var != null) {
                    e8Var.w(true);
                    j0Var3.s0.y(true);
                }
                if (j0Var3.n0 && j0Var3.q0) {
                    AndroidUtilities.runOnUIThread(j0Var3.w0, (long) (1000.0f / AndroidUtilities.screenRefreshRate));
                    break;
                }
                break;
            case 4:
                j0 j0Var4 = this.b;
                i0 i0Var5 = j0Var4.j0;
                if (i0Var5 != null) {
                    i0Var5.a(null);
                    j0Var4.q();
                    j0Var4.invalidate();
                    Runnable runnable2 = j0Var4.m0;
                    if (runnable2 != null) {
                        runnable2.run();
                        break;
                    }
                }
                break;
            case 5:
                j0 j0Var5 = this.b;
                i0 i0Var6 = j0Var5.j0;
                if (i0Var6 != null && j0Var5.h.indexOf(i0Var6) >= 0) {
                    x xVar2 = j0Var5.f;
                    int indexOf = xVar2.e.indexOf(i0Var6.h);
                    ArrayList arrayList = xVar2.e;
                    if (indexOf < 0 || indexOf >= arrayList.size()) {
                        xVar = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(arrayList);
                        arrayList2.remove(indexOf);
                        StringBuilder sb2 = new StringBuilder();
                        int i11 = 0;
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            w wVar = (w) arrayList2.get(i12);
                            if (wVar.c != i11) {
                                sb2.append("/");
                                i11 = wVar.c;
                            }
                            sb2.append(".");
                        }
                        xVar = new x(sb2.toString());
                    }
                    if (xVar.e.size() <= 1) {
                        j0Var5.e();
                        j0Var5.invalidate();
                    }
                    j0Var5.o(xVar);
                    j0Var5.f0 = true;
                    j0Var5.q();
                    j0Var5.invalidate();
                    Runnable runnable3 = j0Var5.m0;
                    if (runnable3 != null) {
                        runnable3.run();
                    }
                    ce ceVar = ((md) j0Var5).y0;
                    ceVar.I0.a(false, true);
                    if (xVar.e.size() > 1) {
                        d0 d0Var = ceVar.G0;
                        ceVar.z0 = xVar;
                        d0Var.a(new y(xVar, false), true);
                        ceVar.G0.b(true, true);
                    } else {
                        ceVar.G0.b(false, true);
                    }
                    ceVar.m0(true);
                    xc xcVar = ceVar.M0;
                    if (xcVar != null) {
                        xcVar.setMultipleOnClick(ceVar.A0.j());
                        ceVar.M0.setMaxCount(Math.min(10, x.b() - ceVar.A0.getFilledCount()));
                        break;
                    }
                }
                break;
            default:
                i0 i0Var7 = this.b.j0;
                if (i0Var7 != null && (h0Var3 = i0Var7.d) != null) {
                    h0Var3.setVolume(0.0f);
                    break;
                }
                break;
        }
    }
}
