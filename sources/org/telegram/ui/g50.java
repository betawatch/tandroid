package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class g50 extends org.telegram.ui.Components.dk0 {
    public final Context c;
    public final /* synthetic */ h50 d;

    public g50(h50 h50Var, Context context) {
        this.d = h50Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int b10 = f1Var.b();
        h50 h50Var = this.d;
        return b10 == h50Var.r || b10 == h50Var.n || b10 == h50Var.s || b10 == 0;
    }

    @Override // v4.i0
    public final int b() {
        h50 h50Var = this.d;
        if (h50Var.e) {
            return 0;
        }
        return h50Var.x;
    }

    @Override // v4.i0
    public final int d(int i7) {
        h50 h50Var = this.d;
        if (i7 == h50Var.n || i7 == h50Var.s || i7 == h50Var.r) {
            return 0;
        }
        if (i7 == h50Var.w || i7 == h50Var.h) {
            return 1;
        }
        return i7 == 0 ? 2 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10 = f1Var.f;
        View view = f1Var.a;
        h50 h50Var = this.d;
        if (i10 == 0) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (i7 == h50Var.n) {
                x9Var.b(org.telegram.messenger.gd.N0(2131751750, null), true);
                return;
            } else if (i7 == h50Var.s) {
                x9Var.b(org.telegram.messenger.gd.N0(2131745262, null), false);
                return;
            } else {
                if (i7 == h50Var.r) {
                    x9Var.b(org.telegram.messenger.gd.N0(2131745827, null), true);
                    return;
                }
                return;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
            TLRPC.TL_chatInviteExported tL_chatInviteExported = h50Var.f;
            l8Var.a.setText(tL_chatInviteExported != null ? tL_chatInviteExported.link : "error");
            l8Var.setWillNotDraw(true);
            return;
        }
        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
        if (i7 == h50Var.w) {
            a9Var.setText("");
            return;
        }
        if (i7 == h50Var.h) {
            TLRPC.Chat O0 = h50Var.getMessagesController().O0(Long.valueOf(h50Var.d));
            if (!org.telegram.messenger.v3.T(O0) || O0.megagroup) {
                a9Var.setText(org.telegram.messenger.gd.N0(2131748718, null));
            } else {
                a9Var.setText(org.telegram.messenger.gd.N0(2131752374, null));
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        Context context = this.c;
        if (i7 == 0) {
            FrameLayout x9Var = new org.telegram.ui.Cells.x9(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, x9Var, null);
            frameLayout = x9Var;
        } else if (i7 != 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            TextView textView = new TextView(context);
            l8Var.a = textView;
            org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
            l8Var.addView(textView, c8.ma.d(-1, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 23.0f, 10.0f, 23.0f, 10.0f));
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.d6, l8Var, null);
            frameLayout = l8Var;
        } else {
            frameLayout = new org.telegram.ui.Cells.a9(context);
        }
        return new org.telegram.ui.Components.mj0(frameLayout);
    }
}
