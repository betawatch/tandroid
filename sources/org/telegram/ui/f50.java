package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ g50 d;

    public f50(g50 g50Var, Context context) {
        this.d = g50Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        g50 g50Var = this.d;
        return b10 == g50Var.r || b10 == g50Var.n || b10 == g50Var.s || b10 == 0;
    }

    @Override // v4.i0
    public final int b() {
        g50 g50Var = this.d;
        if (g50Var.e) {
            return 0;
        }
        return g50Var.x;
    }

    @Override // v4.i0
    public final int d(int i7) {
        g50 g50Var = this.d;
        if (i7 == g50Var.n || i7 == g50Var.s || i7 == g50Var.r) {
            return 0;
        }
        if (i7 == g50Var.w || i7 == g50Var.h) {
            return 1;
        }
        return i7 == 0 ? 2 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        g50 g50Var = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
            if (i7 == g50Var.n) {
                w9Var.b(org.telegram.messenger.gd.N0(2131751750, null), true);
                return;
            } else if (i7 == g50Var.s) {
                w9Var.b(org.telegram.messenger.gd.N0(2131745262, null), false);
                return;
            } else {
                if (i7 == g50Var.r) {
                    w9Var.b(org.telegram.messenger.gd.N0(2131745827, null), true);
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
            TLRPC.TL_chatInviteExported tL_chatInviteExported = g50Var.f;
            k8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            k8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
        if (i7 == g50Var.w) {
            z8Var.setText("");
            return;
        }
        if (i7 == g50Var.h) {
            TLRPC.Chat O0 = g50Var.getMessagesController().O0(Long.valueOf(g50Var.d));
            if (!org.telegram.messenger.v3.T(O0) || O0.megagroup) {
                z8Var.setText(org.telegram.messenger.gd.N0(2131748718, null));
            } else {
                z8Var.setText(org.telegram.messenger.gd.N0(2131752374, null));
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout w9Var = new org.telegram.ui.Cells.w9(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, w9Var, null);
            frameLayout = w9Var;
        } else if (i7 != 1) {
            org.telegram.ui.Cells.k8 k8Var = new org.telegram.ui.Cells.k8(context);
            TextView textView = new TextView(context);
            k8Var.a = textView;
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
            k8Var.addView(textView, c8.na.d(-1, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, k8Var, null);
            frameLayout = k8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.z8(context);
        }
        return new org.telegram.ui.Components.mj0(frameLayout);
    }
}
