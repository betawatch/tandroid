package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class l70 extends org.telegram.ui.ActionBar.w2 {
    public boolean m1;

    public l70(Context context, TLRPC.Chat chat) {
        super(context, true);
        int i7 = 0;
        this.w0 = false;
        this.v0 = false;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        this.O = g10;
        q9 q9Var = new q9(context);
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        g10.addView(q9Var, c8.ma.t(90, 90, 49, 0, 29, 0, 0));
        q9Var.f(chat, new b9(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.n10.p(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, null);
        textView.setGravity(1);
        TextView f10 = org.telegram.messenger.n10.f(g10, textView, c8.ma.t(-2, -2, 49, 17, 24, 17, 0), context);
        f10.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(f10, org.telegram.ui.ActionBar.m6.r5, null);
        f10.setGravity(1);
        g10.addView(f10, c8.ma.t(-2, -2, 49, 30, 8, 30, 0));
        org.telegram.messenger.t3 i12 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(this.a).a).i1(chat.id, false, null);
        if (i12 != null) {
            if (TextUtils.isEmpty(i12.b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(i12.b.title);
            }
            int i10 = i12.b.participants_count;
            if (i10 == 0) {
                f10.setText(org.telegram.messenger.gd.N0(2131747993, null));
            } else {
                f10.setText(org.telegram.messenger.gd.G(i10, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            f10.setText(org.telegram.messenger.gd.N0(2131747993, null));
        }
        k70 k70Var = new k70(context);
        View view = new View(context);
        k70Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.a6.f(org.telegram.ui.ActionBar.m6.Fi, 4.0f));
        k70Var.addView(view, c8.ma.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        k70Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.m6.Ji, null, 1, 14.0f);
        k70Var.addView(textView2, c8.ma.e(-2, -2, 17));
        k70Var.setBackground(null);
        if (org.telegram.messenger.v3.W(chat)) {
            k70Var.setText(org.telegram.messenger.gd.N0(2131743232, null));
        } else {
            k70Var.setText(org.telegram.messenger.gd.N0(2131743122, null));
        }
        view.setOnClickListener(new j70(this, i7));
        g10.addView(k70Var, c8.ma.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void J0();

    @Override // org.telegram.ui.ActionBar.w2
    public final void L() {
        super.L();
        if (this.m1) {
            J0();
        }
    }
}
