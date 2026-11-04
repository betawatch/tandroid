package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class mo0 extends sj0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ oo0 h;

    public mo0(oo0 oo0Var, Context context) {
        this.h = oo0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f != 1;
    }

    public final TLRPC.TL_forumTopic E(int i3) {
        int i10 = i3 - 1;
        if (this.d) {
            i10 = i3 - 2;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return (TLRPC.TL_forumTopic) this.f.get(i10);
    }

    @Override // u4.h0
    public final int b() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // u4.h0
    public final int d(int i3) {
        return i3 == 0 ? 1 : 0;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        long j10;
        if (d1Var.f == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) d1Var.a;
            if (i3 == 1 && this.d) {
                d7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i3);
                oo0 oo0Var = this.h;
                TLRPC.Dialog dialog = oo0Var.v2;
                boolean z10 = E != null && oo0Var.N1.h((long) E.id) >= 0;
                org.telegram.ui.Cells.a7 a7Var = d7Var.b;
                int i10 = d7Var.f;
                k9 k9Var = d7Var.a;
                TextView textView = d7Var.c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(-dialog.id));
                if (dialog.id > 0) {
                    textView.setText(E.title);
                    j10 = 0;
                } else if (M0 == null) {
                    j10 = 0;
                    textView.setText("");
                } else if (M0.monoforum) {
                    j10 = 0;
                    textView.setText(org.telegram.messenger.hp.s1(i10).B1(org.telegram.messenger.m5.o(E.from_id), false));
                } else {
                    j10 = 0;
                    textView.setText(E.title);
                }
                if (org.telegram.messenger.t3.p0(M0)) {
                    k9Var.setAnimatedEmojiDrawable(null);
                    k9Var.setImageDrawable(null);
                    long o10 = org.telegram.messenger.m5.o(E.from_id);
                    if (org.telegram.messenger.m5.E(o10)) {
                        TLRPC.User a22 = org.telegram.messenger.hp.s1(i10).a2(Long.valueOf(o10));
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, d7Var.h);
                        a7Var.r(a22);
                        if (a22 != null) {
                            textView.setText(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                        } else {
                            textView.setText("");
                        }
                        k9Var.e(a22, a7Var);
                        k9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                    } else {
                        TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i10).M0(Long.valueOf(o10));
                        if (M02 != null) {
                            textView.setText(M02.title);
                        } else {
                            textView.setText("");
                        }
                        a7Var.q(M02);
                        k9Var.e(M0, a7Var);
                    }
                } else if (E.icon_emoji_id != j10) {
                    k9Var.setImageDrawable(null);
                    k9Var.setAnimatedEmojiDrawable(new g5(13, org.telegram.messenger.h10.t0, E.icon_emoji_id));
                } else {
                    k9Var.setAnimatedEmojiDrawable(null);
                    rg.a aVar = new rg.a(E.icon_color);
                    c70 c70Var = new c70(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    c70Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    c70Var.i = 1.8f;
                    xp xpVar = new xp(aVar, c70Var, 0, 0);
                    xpVar.x = true;
                    k9Var.setImageDrawable(xpVar);
                }
                k9Var.setRoundRadius((M0 == null || !M0.forum || z10) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f));
                d7Var.d = dialog.id;
                d7Var.e = E.id;
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View d7Var;
        Context context = this.c;
        if (i3 == 0 || i3 == 2) {
            d7Var = new org.telegram.ui.Cells.d7(context, this.h.J0);
            d7Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
        } else {
            d7Var = new View(context);
            d7Var.setLayoutParams(new u4.p0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new bj0(d7Var);
    }
}
