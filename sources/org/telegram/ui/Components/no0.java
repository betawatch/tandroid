package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class no0 extends tj0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ po0 h;

    public no0(po0 po0Var, Context context) {
        this.h = po0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f != 1;
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

    @Override // v4.h0
    public final int b() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // v4.h0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
        long j3;
        if (e1Var.f == 0) {
            org.telegram.ui.Cells.d7 d7Var = (org.telegram.ui.Cells.d7) e1Var.a;
            if (i7 == 1 && this.d) {
                d7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i7);
                po0 po0Var = this.h;
                TLRPC.Dialog dialog = po0Var.y2;
                boolean z10 = E != null && po0Var.Q1.h((long) E.id) >= 0;
                org.telegram.ui.Cells.a7 a7Var = d7Var.b;
                int i10 = d7Var.f;
                i9 i9Var = d7Var.a;
                TextView textView = d7Var.c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat M0 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(-dialog.id));
                if (dialog.id > 0) {
                    textView.setText(E.title);
                    j3 = 0;
                } else if (M0 == null) {
                    j3 = 0;
                    textView.setText("");
                } else if (M0.monoforum) {
                    j3 = 0;
                    textView.setText(org.telegram.messenger.np.s1(i10).B1(org.telegram.messenger.m5.o(E.from_id), false));
                } else {
                    j3 = 0;
                    textView.setText(E.title);
                }
                if (org.telegram.messenger.t3.p0(M0)) {
                    i9Var.setAnimatedEmojiDrawable(null);
                    i9Var.setImageDrawable(null);
                    long o4 = org.telegram.messenger.m5.o(E.from_id);
                    if (org.telegram.messenger.m5.E(o4)) {
                        TLRPC.User a22 = org.telegram.messenger.np.s1(i10).a2(Long.valueOf(o4));
                        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, d7Var.h);
                        a7Var.r(a22);
                        if (a22 != null) {
                            textView.setText(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                        } else {
                            textView.setText("");
                        }
                        i9Var.f(a22, a7Var);
                        i9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                    } else {
                        TLRPC.Chat M02 = org.telegram.messenger.np.s1(i10).M0(Long.valueOf(o4));
                        if (M02 != null) {
                            textView.setText(M02.title);
                        } else {
                            textView.setText("");
                        }
                        a7Var.q(M02);
                        i9Var.f(M0, a7Var);
                    }
                } else if (E.icon_emoji_id != j3) {
                    i9Var.setImageDrawable(null);
                    i9Var.setAnimatedEmojiDrawable(new g5(13, org.telegram.messenger.m10.t0, E.icon_emoji_id));
                } else {
                    i9Var.setAnimatedEmojiDrawable(null);
                    qg.a aVar = new qg.a(E.icon_color);
                    j70 j70Var = new j70(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    j70Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    j70Var.i = 1.8f;
                    fq fqVar = new fq(aVar, j70Var, 0, 0);
                    fqVar.x = true;
                    i9Var.setImageDrawable(fqVar);
                }
                i9Var.setRoundRadius((M0 == null || !M0.forum || z10) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f));
                d7Var.d = dialog.id;
                d7Var.e = E.id;
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View d7Var;
        Context context = this.c;
        if (i7 == 0 || i7 == 2) {
            d7Var = new org.telegram.ui.Cells.d7(context, this.h.J0);
            d7Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
        } else {
            d7Var = new View(context);
            d7Var.setLayoutParams(new v4.p0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new cj0(d7Var);
    }
}
