package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d60 extends org.telegram.ui.Components.sk0 {
    public final Context c;
    public final /* synthetic */ e60 d;

    public d60(e60 e60Var, Context context) {
        this.d = e60Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        e60 e60Var = this.d;
        return b10 == e60Var.r || b10 == e60Var.n || b10 == e60Var.s || b10 == 0;
    }

    @Override // s4.g0
    public final int b() {
        e60 e60Var = this.d;
        if (e60Var.e) {
            return 0;
        }
        return e60Var.x;
    }

    @Override // s4.g0
    public final int d(int i10) {
        e60 e60Var = this.d;
        if (i10 == e60Var.n || i10 == e60Var.s || i10 == e60Var.r) {
            return 0;
        }
        if (i10 == e60Var.w || i10 == e60Var.h) {
            return 1;
        }
        return i10 == 0 ? 2 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        e60 e60Var = this.d;
        if (i11 == 0) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (i10 == e60Var.n) {
                x9Var.b(org.telegram.messenger.cd.L0(2131751762, null), true);
                return;
            } else if (i10 == e60Var.s) {
                x9Var.b(org.telegram.messenger.cd.L0(2131745476, null), false);
                return;
            } else {
                if (i10 == e60Var.r) {
                    x9Var.b(org.telegram.messenger.cd.L0(2131746040, null), true);
                    return;
                }
                return;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = e60Var.f;
            o8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            o8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
        if (i10 == e60Var.w) {
            b9Var.setText("");
            return;
        }
        if (i10 == e60Var.h) {
            TLRPC.Chat L0 = e60Var.getMessagesController().L0(Long.valueOf(e60Var.d));
            if (!org.telegram.messenger.w3.T(L0) || L0.megagroup) {
                b9Var.setText(org.telegram.messenger.cd.L0(2131748921, null));
            } else {
                b9Var.setText(org.telegram.messenger.cd.L0(2131752386, null));
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i10 == 0) {
            FrameLayout x9Var = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, x9Var, null);
            frameLayout = x9Var;
        } else if (i10 != 1) {
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context);
            TextView textView = new TextView(context);
            o8Var.a = textView;
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
            o8Var.addView(textView, w7.b6.d(-1, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, o8Var, null);
            frameLayout = o8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.b9(context);
        }
        return new org.telegram.ui.Components.ck0(frameLayout);
    }
}
