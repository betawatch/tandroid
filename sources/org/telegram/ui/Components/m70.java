package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class m70 extends org.telegram.ui.ActionBar.z2 {
    public boolean i1;

    public m70(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.v0 = false;
        this.u0 = false;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        this.N = f7;
        g9 g9Var = new g9(context);
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(45.0f));
        f7.addView(g9Var, w7.b6.t(90, 90, 49, 0, 29, 0, 0));
        g9Var.e(chat, new r8(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.z20.n(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.z20.f(f7, textView, w7.b6.t(-2, -2, 49, 17, 24, 17, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(f10, org.telegram.ui.ActionBar.t6.r5, null);
        f10.setGravity(1);
        f7.addView(f10, w7.b6.t(-2, -2, 49, 30, 8, 30, 0));
        org.telegram.messenger.u3 f12 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(this.a).a).f1(chat.id, false, null);
        if (f12 != null) {
            if (TextUtils.isEmpty(f12.b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(f12.b.title);
            }
            int i10 = f12.b.participants_count;
            if (i10 == 0) {
                f10.setText(org.telegram.messenger.cd.L0(2131748203, null));
            } else {
                f10.setText(org.telegram.messenger.cd.G(i10, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            f10.setText(org.telegram.messenger.cd.L0(2131748203, null));
        }
        l70 l70Var = new l70(context);
        View view = new View(context);
        l70Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.f(org.telegram.ui.ActionBar.t6.Ci, 4.0f));
        l70Var.addView(view, w7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        l70Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.Gi, null, 1, 14.0f);
        l70Var.addView(textView2, w7.b6.e(-2, -2, 17));
        l70Var.setBackground(null);
        if (org.telegram.messenger.w3.W(chat)) {
            l70Var.setText(org.telegram.messenger.cd.L0(2131743501, null));
        } else {
            l70Var.setText(org.telegram.messenger.cd.L0(2131743391, null));
        }
        view.setOnClickListener(new h0(this, 28));
        f7.addView(l70Var, w7.b6.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void I0();

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        if (this.i1) {
            I0();
        }
    }
}
