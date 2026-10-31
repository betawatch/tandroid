package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u2 {
    public final v2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public u2(v2 v2Var) {
        this.a = v2Var;
    }

    public static void a(u2 u2Var, int i10, jj jjVar, TLRPC.Chat chat) {
        long j10;
        boolean z10;
        int i11;
        u2Var.getClass();
        int f12 = (jjVar == null || chat == null) ? 0 : jjVar.f1();
        if (u2Var.b != f12 || u2Var.e) {
            u2Var.f = null;
            u2Var.c = 0;
            u2Var.d = false;
            u2Var.e = false;
            u2Var.b = f12;
            TextPaint textPaint = org.telegram.ui.ActionBar.t6.F0[0];
            if (chat != null) {
                ArrayList l4 = vp.r1(i10).r7.l(chat.id);
                boolean z11 = true;
                if (l4 == null || l4.isEmpty()) {
                    if (vp.r1(i10).r7.e(chat.id)) {
                        u2Var.g = cd.L0(org.telegram.messenger.w3.p0(chat) ? 2131748207 : 2131748153, null);
                        return;
                    }
                    vp.r1(i10).r7.n(0, chat.id, true);
                    u2Var.g = cd.L0(2131748789, null);
                    u2Var.e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(l4);
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new bi.t6(5)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (jjVar == null || org.telegram.messenger.w3.p0(chat)) {
                    j10 = 0;
                    z10 = false;
                    i11 = 0;
                } else {
                    j10 = jj.c2(i10, jjVar.k, true, false);
                    TLRPC.TL_forumTopic f7 = vp.r1(i10).r7.f(chat.id, j10);
                    if (f7 != null) {
                        CharSequence j11 = gg.e.j(f7, textPaint, null);
                        spannableStringBuilder.append(j11);
                        i11 = f7.unread_count > 0 ? j11.length() : 0;
                        u2Var.c = j11.length();
                        if (jjVar.P3()) {
                            u2Var.d = false;
                        } else {
                            u2Var.d = f7.unread_count > 0;
                        }
                    } else {
                        u2Var.d = false;
                        i11 = 0;
                    }
                    if (u2Var.d) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new t2(org.telegram.messenger.i0.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (org.telegram.messenger.w3.p0(chat)) {
                    u2Var.f = new HashMap();
                    for (int i12 = 0; i12 < Math.min(4, arrayList.size()); i12++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long o10 = org.telegram.messenger.o5.o(((TLRPC.TL_forumTopic) arrayList.get(i12)).from_id);
                        org.telegram.ui.e5 e5Var = new org.telegram.ui.e5(i10, u2Var.a);
                        e5Var.h = false;
                        e5Var.c(o10);
                        u2Var.f.put(Long.valueOf(o10), e5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.o5.l(d20.s0, o10));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(e5Var, 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                    }
                } else {
                    int i13 = 0;
                    for (int i14 = 4; i13 < Math.min(i14, arrayList.size()); i14 = 4) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i13)).id != j10) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z11 && z10) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(gg.e.j((TLRPC.ForumTopic) arrayList.get(i13), textPaint, null));
                            z11 = false;
                        }
                        i13++;
                    }
                }
                if (i11 > 0) {
                    Typeface o11 = org.telegram.messenger.i0.o();
                    int i15 = org.telegram.ui.ActionBar.t6.X8;
                    x41 x41Var = new x41();
                    x41Var.a = o11;
                    x41Var.c = i15;
                    x41Var.b = org.telegram.ui.ActionBar.t6.v0(i15);
                    spannableStringBuilder.setSpan(x41Var, 0, Math.min(spannableStringBuilder.length(), i11 + 2), 0);
                }
                u2Var.g = spannableStringBuilder;
            }
        }
    }
}
