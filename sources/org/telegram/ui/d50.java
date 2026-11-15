package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class d50 extends org.telegram.ui.Components.tj0 {
    public final Context c;
    public final /* synthetic */ e50 d;

    public d50(e50 e50Var, Context context) {
        this.d = e50Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int b10 = e1Var.b();
        e50 e50Var = this.d;
        return b10 == e50Var.r || b10 == e50Var.n || b10 == e50Var.s || b10 == 0;
    }

    @Override // v4.h0
    public final int b() {
        e50 e50Var = this.d;
        if (e50Var.e) {
            return 0;
        }
        return e50Var.x;
    }

    @Override // v4.h0
    public final int d(int i7) {
        e50 e50Var = this.d;
        if (i7 == e50Var.n || i7 == e50Var.s || i7 == e50Var.r) {
            return 0;
        }
        if (i7 == e50Var.w || i7 == e50Var.h) {
            return 1;
        }
        return i7 == 0 ? 2 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        int i10 = e1Var.f;
        View view = e1Var.a;
        e50 e50Var = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
            if (i7 == e50Var.n) {
                v9Var.b(org.telegram.messenger.hd.M0(2131751762, null), true);
                return;
            } else if (i7 == e50Var.s) {
                v9Var.b(org.telegram.messenger.hd.M0(2131745458, null), false);
                return;
            } else {
                if (i7 == e50Var.r) {
                    v9Var.b(org.telegram.messenger.hd.M0(2131746023, null), true);
                    return;
                }
                return;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            org.telegram.ui.Cells.j8 j8Var = (org.telegram.ui.Cells.j8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = e50Var.f;
            j8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            j8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
        if (i7 == e50Var.w) {
            y8Var.setText("");
            return;
        }
        if (i7 == e50Var.h) {
            TLRPC.Chat M0 = e50Var.getMessagesController().M0(Long.valueOf(e50Var.d));
            if (!org.telegram.messenger.t3.T(M0) || M0.megagroup) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131748911, null));
            } else {
                y8Var.setText(org.telegram.messenger.hd.M0(2131752386, null));
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout v9Var = new org.telegram.ui.Cells.v9(context);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, v9Var, null);
            frameLayout = v9Var;
        } else if (i7 != 1) {
            org.telegram.ui.Cells.j8 j8Var = new org.telegram.ui.Cells.j8(context);
            TextView textView = new TextView(context);
            j8Var.a = textView;
            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            j8Var.addView(textView, c8.ja.d(-1, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.d6, j8Var, null);
            frameLayout = j8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.y8(context);
        }
        return new org.telegram.ui.Components.cj0(frameLayout);
    }
}
