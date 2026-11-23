package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class yo0 extends dk0 {
    public final Context c;
    public boolean d;
    public boolean e;
    public ArrayList f;
    public final /* synthetic */ ap0 h;

    public yo0(ap0 ap0Var, Context context) {
        this.h = ap0Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return f1Var.f != 1;
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

    @Override // v4.i0
    public final int b() {
        ArrayList arrayList = this.f;
        return (arrayList != null ? arrayList.size() + 1 : 0) + (this.d ? 1 : 0);
    }

    @Override // v4.i0
    public final int d(int i7) {
        return i7 == 0 ? 1 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        long j3;
        if (f1Var.f == 0) {
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) f1Var.a;
            if (i7 == 1 && this.d) {
                f7Var.setAsNewBotForumTopic(this.e);
                return;
            }
            if (this.f != null) {
                TLRPC.TL_forumTopic E = E(i7);
                ap0 ap0Var = this.h;
                TLRPC.Dialog dialog = ap0Var.y2;
                boolean z10 = E != null && ap0Var.Q1.h((long) E.id) >= 0;
                org.telegram.ui.Cells.c7 c7Var = f7Var.b;
                int i10 = f7Var.f;
                q9 q9Var = f7Var.a;
                TextView textView = f7Var.c;
                if (dialog == null) {
                    return;
                }
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i10).O0(Long.valueOf(-dialog.id));
                if (dialog.id > 0) {
                    textView.setText(E.title);
                    j3 = 0;
                } else if (O0 == null) {
                    j3 = 0;
                    textView.setText("");
                } else if (O0.monoforum) {
                    j3 = 0;
                    textView.setText(org.telegram.messenger.np.u1(i10).D1(org.telegram.messenger.n5.o(E.from_id), false));
                } else {
                    j3 = 0;
                    textView.setText(E.title);
                }
                if (org.telegram.messenger.v3.p0(O0)) {
                    q9Var.setAnimatedEmojiDrawable(null);
                    q9Var.setImageDrawable(null);
                    long o4 = org.telegram.messenger.n5.o(E.from_id);
                    if (org.telegram.messenger.n5.E(o4)) {
                        TLRPC.User c22 = org.telegram.messenger.np.u1(i10).c2(Long.valueOf(o4));
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, f7Var.h);
                        c7Var.r(c22);
                        if (c22 != null) {
                            textView.setText(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                        } else {
                            textView.setText("");
                        }
                        q9Var.f(c22, c7Var);
                        q9Var.setRoundRadius(org.telegram.messenger.g0.L(28.0f));
                    } else {
                        TLRPC.Chat O02 = org.telegram.messenger.np.u1(i10).O0(Long.valueOf(o4));
                        if (O02 != null) {
                            textView.setText(O02.title);
                        } else {
                            textView.setText("");
                        }
                        c7Var.q(O02);
                        q9Var.f(O0, c7Var);
                    }
                } else if (E.icon_emoji_id != j3) {
                    q9Var.setImageDrawable(null);
                    q9Var.setAnimatedEmojiDrawable(new p5(13, org.telegram.messenger.k10.t0, E.icon_emoji_id));
                } else {
                    q9Var.setAnimatedEmojiDrawable(null);
                    qg.a aVar = new qg.a(E.icon_color);
                    w70 w70Var = new w70(1, null);
                    String upperCase = E.title.trim().toUpperCase();
                    w70Var.a(upperCase.length() >= 1 ? upperCase.substring(0, 1) : "");
                    w70Var.i = 1.8f;
                    oq oqVar = new oq(aVar, w70Var, 0, 0);
                    oqVar.x = true;
                    q9Var.setImageDrawable(oqVar);
                }
                q9Var.setRoundRadius((O0 == null || !O0.forum || z10) ? org.telegram.messenger.g0.L(28.0f) : org.telegram.messenger.g0.L(16.0f));
                f7Var.d = dialog.id;
                f7Var.e = E.id;
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View f7Var;
        Context context = this.c;
        if (i7 == 0 || i7 == 2) {
            f7Var = new org.telegram.ui.Cells.f7(context, this.h.J0);
            f7Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(100.0f)));
        } else {
            f7Var = new View(context);
            f7Var.setLayoutParams(new v4.q0(-1, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
        }
        return new mj0(f7Var);
    }
}
