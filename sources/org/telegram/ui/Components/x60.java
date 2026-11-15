package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class x60 extends org.telegram.ui.ActionBar.u2 {
    public boolean m1;

    public x60(Context context, TLRPC.Chat chat) {
        super(context, true);
        this.w0 = false;
        this.v0 = false;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.O = f10;
        i9 i9Var = new i9(context);
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(45.0f));
        f10.addView(i9Var, c8.ja.t(90, 90, 49, 0, 29, 0, 0));
        i9Var.f(chat, new t8(chat));
        TextView textView = new TextView(context);
        org.telegram.messenger.i20.o(textView, 1, 18.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, null);
        textView.setGravity(1);
        TextView f11 = org.telegram.messenger.i20.f(f10, textView, c8.ja.t(-2, -2, 49, 17, 24, 17, 0), context);
        f11.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(f11, org.telegram.ui.ActionBar.j6.r5, null);
        f11.setGravity(1);
        f10.addView(f11, c8.ja.t(-2, -2, 49, 30, 8, 30, 0));
        org.telegram.messenger.r3 g12 = org.telegram.messenger.np.s1(org.telegram.messenger.c.a(this.a).a).g1(chat.id, false, null);
        if (g12 != null) {
            if (TextUtils.isEmpty(g12.b.title)) {
                textView.setText(chat.title);
            } else {
                textView.setText(g12.b.title);
            }
            int i7 = g12.b.participants_count;
            if (i7 == 0) {
                f11.setText(org.telegram.messenger.hd.M0(2131748186, null));
            } else {
                f11.setText(org.telegram.messenger.hd.G(i7, "Participants", new Object[0]));
            }
        } else {
            textView.setText(chat.title);
            f11.setText(org.telegram.messenger.hd.M0(2131748186, null));
        }
        w60 w60Var = new w60(context);
        View view = new View(context);
        w60Var.a = view;
        view.setBackground(org.telegram.ui.ActionBar.y5.f(org.telegram.ui.ActionBar.j6.Fi, 4.0f));
        w60Var.addView(view, c8.ja.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(context);
        w60Var.b = textView2;
        textView2.setLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity(1);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        org.telegram.messenger.k5.m(textView2, org.telegram.ui.ActionBar.j6.Ji, null, 1, 14.0f);
        w60Var.addView(textView2, c8.ja.e(-2, -2, 17));
        w60Var.setBackground(null);
        if (org.telegram.messenger.t3.W(chat)) {
            w60Var.setText(org.telegram.messenger.hd.M0(2131743475, null));
        } else {
            w60Var.setText(org.telegram.messenger.hd.M0(2131743365, null));
        }
        view.setOnClickListener(new e0(this, 29));
        f10.addView(w60Var, c8.ja.t(-1, 50, 51, 0, 30, 0, 0));
    }

    public abstract void I0();

    @Override // org.telegram.ui.ActionBar.u2
    public final void L() {
        super.L();
        if (this.m1) {
            I0();
        }
    }
}
