package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.fj;
import org.telegram.messenger.jc;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class da implements qj0, bg.q, jc, org.telegram.messenger.h9, np, r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ da(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void G0(int i7, Drawable drawable) {
        int i10 = this.a;
    }

    @Override // org.telegram.messenger.jc
    public /* synthetic */ void V(ImageReceiver imageReceiver) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.np
    public void a() {
        switch (this.a) {
            case 4:
                o4 o4Var = (o4) this.b;
                float progress = 1.0f - (o4Var.w.getProgress() * 0.143f);
                org.telegram.ui.Components.q9 q9Var = o4Var.a;
                q9Var.setScaleX(progress);
                q9Var.setScaleY(progress);
                o4Var.invalidate();
                break;
            default:
                d7 d7Var = (d7) this.b;
                float progress2 = 1.0f - (d7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.q9 q9Var2 = d7Var.a;
                q9Var2.setScaleX(progress2);
                q9Var2.setScaleY(progress2);
                d7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        ha haVar = (ha) this.b;
        haVar.getClass();
        haVar.C1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.messenger.r10
    public Object g(Number number, Object obj) {
        return (CharSequence) ((ci.y) this.b).a((Integer) obj);
    }

    @Override // bg.q
    public void i(long j3) {
        ((l) this.b).b(j3);
    }

    @Override // org.telegram.messenger.jc
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mh0 B;
        r0 r0Var;
        int w10;
        fj fjVar;
        switch (this.a) {
            case 2:
                u0 u0Var = (u0) this.b;
                if (z10 && (B = u0Var.J.B()) != null) {
                    fj fjVar2 = u0Var.Q0;
                    if (fjVar2 != null && !fjVar2.o1) {
                        fjVar2.o1 = true;
                        B.N(0, false, false);
                        org.telegram.messenger.g0.g3(new p0(B, 0));
                        if (fjVar2.n1 || u0Var.M1) {
                            fjVar2.n1 = false;
                            u0Var.M1 = false;
                            try {
                                u0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (u0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) u0Var.getContext()).w0.c(false);
                            }
                            TLRPC.VideoSize videoSize = u0Var.J1;
                            if (videoSize != null && (r0Var = u0Var.g1) != null) {
                                r0Var.Q(u0Var, u0Var.I1, videoSize);
                                break;
                            }
                        }
                    } else if (B.b0 < 1) {
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
                if (z10 && !z11 && (fjVar = o7Var.n) != null && fjVar.t2() && imageReceiver3.n() != null) {
                    if (imageReceiver2.n() != null) {
                        imageReceiver2.n().recycle();
                    }
                    imageReceiver2.v0(Utilities.D(imageReceiver3.n(), false));
                }
                if (z10 && !z11 && o7Var.x0 && imageReceiver3.n() != null) {
                    int J0 = org.telegram.messenger.g0.J0(imageReceiver3.n());
                    o7Var.a = J0;
                    CheckBoxBase checkBoxBase = o7Var.Q;
                    if (checkBoxBase != null && checkBoxBase.x != (w10 = org.telegram.ui.ActionBar.n6.w(J0, org.telegram.ui.ActionBar.n6.r1(0.25f, -1)))) {
                        checkBoxBase.x = w10;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.h9
    public boolean run() {
        TLRPC.Message message;
        l4 l4Var;
        q1 q1Var = (q1) this.b;
        fj fjVar = q1Var.Q5;
        if (fjVar == null || (message = fjVar.k) == null) {
            return false;
        }
        if (fjVar.D != 29 || ((l4Var = q1Var.X5) != null && l4Var.i)) {
            return (message.noforwards && !fj.c3(message)) || q1Var.Q5.S4() || q1Var.Q5.y2();
        }
        return true;
    }

    private final /* synthetic */ void e(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void f(ImageReceiver imageReceiver) {
    }

    private final /* synthetic */ void b(int i7, Drawable drawable) {
    }

    private final /* synthetic */ void d(int i7, Drawable drawable) {
    }
}
