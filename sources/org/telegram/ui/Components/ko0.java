package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ko0 extends oj0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ mo0 h;

    public ko0(mo0 mo0Var, Context context) {
        this.h = mo0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f != 1;
    }

    public final TLRPC.TL_forumTopic E(int i7) {
        int i10 = i7 - 1;
        if (this.d) {
            i10 = i7 - 2;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_forumTopic) this.f.get(i10);
    }

    @Override // v4.g0
    public final int b() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // v4.g0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        long j3;
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) d1Var.a;
            if (i7 == 1 && this.d) {
                e7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i7);
                mo0 mo0Var = this.h;
                TLRPC.Dialog dialog = mo0Var.u2;
                boolean z9 = E != null && mo0Var.M1.h((long) E.id) >= 0;
                org.telegram.ui.Cells.b7 b7Var = e7Var.b;
                int i10 = e7Var.f;
                l9 l9Var = e7Var.a;
                TextView textView = e7Var.c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(-dialog.id));
                if (dialog.id > 0) {
                    textView.setText(E.title);
                    j3 = 0;
                } else if (M0 == null) {
                    j3 = 0;
                    textView.setText("");
                } else if (M0.monoforum) {
                    j3 = 0;
                    textView.setText(org.telegram.messenger.qp.s1(i10).B1(org.telegram.messenger.m5.o(E.from_id), false));
                } else {
                    j3 = 0;
                    textView.setText(E.title);
                }
                if (org.telegram.messenger.t3.p0(M0)) {
                    l9Var.setAnimatedEmojiDrawable(null);
                    l9Var.setImageDrawable(null);
                    long o4 = org.telegram.messenger.m5.o(E.from_id);
                    if (org.telegram.messenger.m5.E(o4)) {
                        TLRPC.User a22 = org.telegram.messenger.qp.s1(i10).a2(Long.valueOf(o4));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, e7Var.h);
                        b7Var.r(a22);
                        if (a22 != null) {
                            textView.setText(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                        } else {
                            textView.setText("");
                        }
                        l9Var.e(a22, b7Var);
                        l9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                    } else {
                        TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i10).M0(Long.valueOf(o4));
                        if (M02 != null) {
                            textView.setText(M02.title);
                        } else {
                            textView.setText("");
                        }
                        b7Var.q(M02);
                        l9Var.e(M0, b7Var);
                    }
                } else if (E.icon_emoji_id != j3) {
                    l9Var.setImageDrawable(null);
                    l9Var.setAnimatedEmojiDrawable(new i5(13, org.telegram.messenger.p10.s0, E.icon_emoji_id));
                } else {
                    l9Var.setAnimatedEmojiDrawable(null);
                    qg.a aVar = new qg.a(E.icon_color);
                    g70 g70Var = new g70(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    g70Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    g70Var.i = 1.8f;
                    xp xpVar = new xp(aVar, g70Var, 0, 0);
                    xpVar.x = true;
                    l9Var.setImageDrawable(xpVar);
                }
                l9Var.setRoundRadius((M0 == null || !M0.forum || z9) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f));
                e7Var.d = dialog.id;
                e7Var.e = E.id;
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View e7Var;
        Context context = this.c;
        if (i7 == 0 || i7 == 2) {
            e7Var = new org.telegram.ui.Cells.e7(context, this.h.I0);
            e7Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(100.0f)));
        } else {
            e7Var = new View(context);
            e7Var.setLayoutParams(new v4.o0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new xi0(e7Var);
    }
}
