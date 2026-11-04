package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m00 implements org.telegram.ui.ActionBar.l0, org.telegram.ui.Components.hj0, r0.m, NativeInstance.AudioLevelsCallback, org.telegram.ui.ActionBar.d1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x30 b;

    public /* synthetic */ m00(x30 x30Var, int i3) {
        this.a = i3;
        this.b = x30Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        r0.h1 h1Var = k1Var.a;
        i0.b f10 = h1Var.f(647);
        i0.b f11 = h1Var.f(8);
        x30 x30Var = this.b;
        c20 c20Var = x30Var.z1;
        int max = Math.max(f11.d, (c20Var.O || c20Var.e) ? c20Var.getKeyboardHeight() : 0);
        ViewGroup.LayoutParams layoutParams = x30Var.T3.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = -f10.d;
        }
        if (c20Var.getEmojiView() != null) {
            c20Var.getEmojiView().setBottomInset(f10.d);
        }
        if (x30Var.K4) {
            ViewGroup viewGroup = x30Var.b;
            int i3 = x30Var.u0;
            viewGroup.setPadding(i3, 0, i3, 0);
        } else {
            ViewGroup viewGroup2 = x30Var.b;
            int i10 = x30Var.u0;
            viewGroup2.setPadding(f10.a + i10, f10.b, i10 + f10.c, f10.d);
        }
        x30Var.b.requestLayout();
        if (max == 0 && !c20Var.O && !c20Var.e && !c20Var.P) {
            c20Var.j();
        }
        if (max > 0) {
            org.telegram.ui.Components.li0 li0Var = x30Var.C1;
            if (li0Var == null) {
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                li0Var = null;
                if (Q != null) {
                    org.telegram.ui.Components.li0 li0Var2 = new org.telegram.ui.Components.li0(1, x30Var.a, x30Var.getContext(), Q, x30Var.J0);
                    x30Var.C1 = li0Var2;
                    li0Var2.setDelegate(new b30(x30Var));
                    x30Var.b.addView(x30Var.C1, b8.mf.e(-2, 52, 81));
                    x30Var.C1.p(null, null, false);
                    x30Var.y1.bringToFront();
                    x30Var.x1.bringToFront();
                    li0Var = x30Var.C1;
                }
            }
            x30Var.C1 = li0Var;
        }
        c20Var.K(f11.d, false);
        x30Var.u3.j(k1Var);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        switch (this.a) {
            case 1:
                x30 x30Var = this.b;
                if (x30Var.I1(view)) {
                    try {
                        x30Var.I1.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                }
                return false;
            default:
                x30 x30Var2 = this.b;
                if (!x30Var2.t1()) {
                    if (view instanceof org.telegram.ui.Components.voip.k) {
                        return x30Var2.I1(view);
                    }
                    if (view instanceof org.telegram.ui.Cells.f4) {
                        x30Var2.L1();
                        org.telegram.ui.Components.fh0 fh0Var = ((org.telegram.ui.Cells.f4) view).f;
                        if (fh0Var.isEnabled()) {
                            fh0Var.callOnClick();
                            return true;
                        }
                    }
                }
                return false;
        }
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void i(int i3) {
        this.b.G1.getActionBarMenuOnItemClick().b(i3);
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        x30 x30Var;
        z20 z20Var;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (z20Var = (x30Var = this.b).X4) != null && z20Var.isShowing()) {
            x30Var.X4.dismiss();
        }
    }

    @Override // org.telegram.messenger.voip.NativeInstance.AudioLevelsCallback
    public void run(int[] iArr, float[] fArr, boolean[] zArr) {
        u4.d1 K;
        x30 x30Var = this.b;
        q10 q10Var = x30Var.e4;
        u10 u10Var = x30Var.S3;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) x30Var.S2.p.get(iArr[i3]);
            if (groupCallParticipant != null) {
                if (u10Var.b) {
                    for (int i10 = 0; i10 < q10Var.getChildCount(); i10++) {
                        org.telegram.ui.Components.d10 d10Var = (org.telegram.ui.Components.d10) q10Var.getChildAt(i10);
                        if (org.telegram.messenger.zi.C1(d10Var.getParticipant().peer) == org.telegram.messenger.zi.C1(groupCallParticipant.peer)) {
                            d10Var.setAmplitude(fArr[i3] * 15.0f);
                        }
                    }
                } else {
                    int indexOf = (x30Var.k2 ? x30Var.v2 : x30Var.S2.g).indexOf(groupCallParticipant);
                    if (indexOf >= 0 && (K = x30Var.I1.K(indexOf + x30Var.H1.d)) != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) view).setAmplitude(fArr[i3] * 15.0f);
                            if (view == x30Var.P4 && !x30Var.d4) {
                                x30Var.b.invalidate();
                            }
                        }
                    }
                }
                u10Var.k(groupCallParticipant, fArr[i3] * 15.0f);
            }
        }
    }
}
