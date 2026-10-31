package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mp0 extends sk0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ op0 h;

    public mp0(op0 op0Var, Context context) {
        this.h = op0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 1;
    }

    public final TLRPC.TL_forumTopic E(int i10) {
        int i11 = i10 - 1;
        if (this.d) {
            i11 = i10 - 2;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_forumTopic) this.f.get(i11);
    }

    @Override // s4.g0
    public final int b() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // s4.g0
    public final int d(int i10) {
        return i10 == 0 ? 1 : 0;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        long j10;
        if (c1Var.f == 0) {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) c1Var.a;
            if (i10 == 1 && this.d) {
                i7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i10);
                op0 op0Var = this.h;
                TLRPC.Dialog dialog = op0Var.u2;
                boolean z10 = E != null && op0Var.M1.h((long) E.id) >= 0;
                org.telegram.ui.Cells.f7 f7Var = i7Var.b;
                int i11 = i7Var.f;
                g9 g9Var = i7Var.a;
                TextView textView = i7Var.c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(-dialog.id));
                if (dialog.id > 0) {
                    textView.setText(E.title);
                    j10 = 0;
                } else if (L0 == null) {
                    j10 = 0;
                    textView.setText("");
                } else if (L0.monoforum) {
                    j10 = 0;
                    textView.setText(org.telegram.messenger.vp.r1(i11).A1(org.telegram.messenger.o5.o(E.from_id), false));
                } else {
                    j10 = 0;
                    textView.setText(E.title);
                }
                if (org.telegram.messenger.w3.p0(L0)) {
                    g9Var.setAnimatedEmojiDrawable(null);
                    g9Var.setImageDrawable(null);
                    long o10 = org.telegram.messenger.o5.o(E.from_id);
                    if (org.telegram.messenger.o5.E(o10)) {
                        TLRPC.User Z1 = org.telegram.messenger.vp.r1(i11).Z1(Long.valueOf(o10));
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, i7Var.h);
                        f7Var.r(Z1);
                        if (Z1 != null) {
                            textView.setText(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                        } else {
                            textView.setText("");
                        }
                        g9Var.e(Z1, f7Var);
                        g9Var.setRoundRadius(org.telegram.messenger.i0.L(28.0f));
                    } else {
                        TLRPC.Chat L02 = org.telegram.messenger.vp.r1(i11).L0(Long.valueOf(o10));
                        if (L02 != null) {
                            textView.setText(L02.title);
                        } else {
                            textView.setText("");
                        }
                        f7Var.q(L02);
                        g9Var.e(L0, f7Var);
                    }
                } else if (E.icon_emoji_id != j10) {
                    g9Var.setImageDrawable(null);
                    g9Var.setAnimatedEmojiDrawable(new f5(13, org.telegram.messenger.d20.s0, E.icon_emoji_id));
                } else {
                    g9Var.setAnimatedEmojiDrawable(null);
                    gg.a aVar = new gg.a(E.icon_color);
                    z70 z70Var = new z70(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    z70Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    z70Var.i = 1.8f;
                    eq eqVar = new eq(aVar, z70Var, 0, 0);
                    eqVar.x = true;
                    g9Var.setImageDrawable(eqVar);
                }
                g9Var.setRoundRadius((L0 == null || !L0.forum || z10) ? org.telegram.messenger.i0.L(28.0f) : org.telegram.messenger.i0.L(16.0f));
                i7Var.d = dialog.id;
                i7Var.e = E.id;
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View i7Var;
        Context context = this.c;
        if (i10 == 0 || i10 == 2) {
            i7Var = new org.telegram.ui.Cells.i7(context, this.h.I0);
            i7Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(100.0f)));
        } else {
            i7Var = new View(context);
            i7Var.setLayoutParams(new s4.o0(-1, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()));
        }
        return new ck0(i7Var);
    }
}
