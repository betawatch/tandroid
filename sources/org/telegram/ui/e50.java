package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class e50 extends org.telegram.ui.Components.oj0 {
    public final Context c;
    public final /* synthetic */ f50 d;

    public e50(f50 f50Var, Context context) {
        this.d = f50Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int b10 = d1Var.b();
        f50 f50Var = this.d;
        return b10 == f50Var.r || b10 == f50Var.n || b10 == f50Var.s || b10 == 0;
    }

    @Override // v4.g0
    public final int b() {
        f50 f50Var = this.d;
        if (f50Var.e) {
            return 0;
        }
        return f50Var.x;
    }

    @Override // v4.g0
    public final int d(int i7) {
        f50 f50Var = this.d;
        if (i7 == f50Var.n || i7 == f50Var.s || i7 == f50Var.r) {
            return 0;
        }
        if (i7 == f50Var.w || i7 == f50Var.h) {
            return 1;
        }
        return i7 == 0 ? 2 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        f50 f50Var = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            if (i7 == f50Var.n) {
                w9Var.b(org.telegram.messenger.id.M0(2131751762, null), true);
                return;
            } else if (i7 == f50Var.s) {
                w9Var.b(org.telegram.messenger.id.M0(2131745461, null), false);
                return;
            } else {
                if (i7 == f50Var.r) {
                    w9Var.b(org.telegram.messenger.id.M0(2131746026, null), true);
                    return;
                }
                return;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = f50Var.f;
            k8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            k8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i7 == f50Var.w) {
            z8Var.setText("");
            return;
        }
        if (i7 == f50Var.h) {
            TLRPC.Chat M0 = f50Var.getMessagesController().M0(Long.valueOf(f50Var.d));
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                z8Var.setText(org.telegram.messenger.id.M0(2131748912, null));
            } else {
                z8Var.setText(org.telegram.messenger.id.M0(2131752386, null));
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout w9Var = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, w9Var, null);
            frameLayout = w9Var;
        } else if (i7 != 1) {
            org.telegram.ui.Cells.k8 k8Var = new org.telegram.ui.Cells.k8(context);
            TextView textView = new TextView(context);
            k8Var.a = textView;
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 16);
            k8Var.addView(textView, c8.ha.d(-1, -2.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, k8Var, null);
            frameLayout = k8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.z8(context);
        }
        return new org.telegram.ui.Components.xi0(frameLayout);
    }
}
