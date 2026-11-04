package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class q60 extends org.telegram.ui.ActionBar.t2 {
    public boolean j1;

    public q60(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.w0 = false;
        this.v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.O = f10;
        k9 k9Var = new k9(context);
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        f10.addView(k9Var, b8.mf.t(90, 90, 49, 0, 29, 0, 0));
        k9Var.e(chat, new u8(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.camera.q.m(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
        textView.setGravity(1);
        TextView f11 = org.telegram.messenger.camera.q.f(f10, textView, b8.mf.t(-2, -2, 49, 17, 24, 17, 0), context);
        f11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(f11, org.telegram.ui.ActionBar.k6.r5, null);
        f11.setGravity(1);
        f10.addView(f11, b8.mf.t(-2, -2, 49, 30, 8, 30, 0));
        org.telegram.messenger.r3 g12 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(this.a).a).g1(chat.id, false, null);
        if (g12 != null) {
            if (TextUtils.isEmpty(g12.b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(g12.b.title);
            }
            int i3 = g12.b.participants_count;
            if (i3 == 0) {
                f11.setText(org.telegram.messenger.bd.M0(2131748194, null));
            } else {
                f11.setText(org.telegram.messenger.bd.G(i3, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            f11.setText(org.telegram.messenger.bd.M0(2131748194, null));
        }
        p60 p60Var = new p60(context);
        View view = new View(context);
        p60Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.k6.Ci, 4.0f));
        p60Var.addView(view, b8.mf.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        p60Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.Gi, null, 1, 14.0f);
        p60Var.addView(textView2, b8.mf.e(-2, -2, 17));
        p60Var.setBackground(null);
        if (org.telegram.messenger.t3.W(chat)) {
            p60Var.setText(org.telegram.messenger.bd.M0(2131743485, null));
        } else {
            p60Var.setText(org.telegram.messenger.bd.M0(2131743375, null));
        }
        view.setOnClickListener(new f0(this, 28));
        f10.addView(p60Var, b8.mf.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void I0();

    @Override // org.telegram.ui.ActionBar.t2
    public final void K() {
        super.K();
        if (this.j1) {
            I0();
        }
    }
}
