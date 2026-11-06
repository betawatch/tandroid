package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ij;
import org.telegram.messenger.lc;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.xo;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ca implements dj0, bg.p, lc, org.telegram.messenger.j9, xo, w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void O(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.xo
    public void a() {
        switch (this.a) {
            case 4:
                o4 o4Var = (o4) this.b;
                float progress = 1.0f - (o4Var.w.getProgress() * 0.143f);
                org.telegram.ui.Components.l9 l9Var = o4Var.a;
                l9Var.setScaleX(progress);
                l9Var.setScaleY(progress);
                o4Var.invalidate();
                break;
            default:
                d7 d7Var = (d7) this.b;
                float progress2 = 1.0f - (d7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.l9 l9Var2 = d7Var.a;
                l9Var2.setScaleX(progress2);
                l9Var2.setScaleY(progress2);
                d7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        ga gaVar = (ga) this.b;
        gaVar.getClass();
        gaVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.messenger.w10
    public Object d(Number number, Object obj) {
        return (CharSequence) ((ai.c0) this.b).a((Integer) obj);
    }

    @Override // org.telegram.messenger.lc
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        zg0 B;
        q0 q0Var;
        int w10;
        ij ijVar;
        switch (this.a) {
            case 2:
                t0 t0Var = (t0) this.b;
                if (z9 && (B = t0Var.I.B()) != null) {
                    ij ijVar2 = t0Var.P0;
                    if (ijVar2 != null && !ijVar2.m1) {
                        ijVar2.m1 = true;
                        B.N(0, false, false);
                        org.telegram.messenger.g0.h3(new o0(B, 0));
                        if (ijVar2.l1 || t0Var.L1) {
                            ijVar2.l1 = false;
                            t0Var.L1 = false;
                            try {
                                t0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (t0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) t0Var.getContext()).v0.c(false);
                            }
                            TLRPC.VideoSize videoSize = t0Var.I1;
                            if (videoSize != null && (q0Var = t0Var.f1) != null) {
                                q0Var.D(t0Var, t0Var.H1, videoSize);
                                break;
                            }
                        }
                    } else if (B.a0 < 1) {
                        B.stop();
                        B.N(B.e[0] - 1, false, false);
                        break;
                    }
                }
                break;
            default:
                o7 o7Var = (o7) this.b;
                ImageReceiver imageReceiver2 = o7Var.d;
                ImageReceiver imageReceiver3 = o7Var.c;
                if (z9 && !z10 && (ijVar = o7Var.n) != null && ijVar.u2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.v0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z9 && !z10 && o7Var.w0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.g0.J0(imageReceiver3.n());
                    o7Var.a = J0;
                    CheckBoxBase checkBoxBase = o7Var.P;
                    if (checkBoxBase != null && checkBoxBase.x != (w10 = org.telegram.ui.ActionBar.k6.w(J0, org.telegram.ui.ActionBar.k6.r1(0.25f, -1)))) {
                        checkBoxBase.x = w10;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // bg.p
    public void j(long j3) {
        ((l) this.b).b(j3);
    }

    @Override // org.telegram.messenger.j9
    public boolean run() {
        TLRPC.Message message;
        l4 l4Var;
        q1 q1Var = (q1) this.b;
        ij ijVar = q1Var.P5;
        if (ijVar == null || (message = ijVar.k) == null) {
            return false;
        }
        if (ijVar.D != 29 || ((l4Var = q1Var.W5) != null && l4Var.i)) {
            return (message.noforwards && !ij.d3(message)) || q1Var.P5.T4() || q1Var.P5.z2();
        }
        return true;
    }

    @Override // org.telegram.messenger.lc
    public /* synthetic */ void t0(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    private final /* synthetic */ void f(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void g(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void b(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void e(int i7, Drawable drawable) {
    }
}
