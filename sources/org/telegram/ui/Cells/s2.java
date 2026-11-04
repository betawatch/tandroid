package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s2 {
    public final t2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public s2(t2 t2Var) {
        this.a = t2Var;
    }

    public static void a(s2 s2Var, int i3, zi ziVar, TLRPC.Chat chat) {
        long j10;
        boolean z10;
        int i10;
        s2Var.getClass();
        int f12 = (ziVar == null || chat == null) ? 0 : ziVar.f1();
        if (s2Var.b != f12 || s2Var.e) {
            s2Var.f = null;
            s2Var.c = 0;
            s2Var.d = false;
            s2Var.e = false;
            s2Var.b = f12;
            TextPaint textPaint = org.telegram.ui.ActionBar.k6.F0[0];
            if (chat != null) {
                ArrayList l10 = hp.s1(i3).q7.l(chat.id);
                boolean z11 = true;
                if (l10 == null || l10.isEmpty()) {
                    if (hp.s1(i3).q7.e(chat.id)) {
                        s2Var.g = bd.M0(org.telegram.messenger.t3.p0(chat) ? 2131748198 : 2131748145, null);
                        return;
                    }
                    hp.s1(i3).q7.n(0, chat.id, true);
                    s2Var.g = bd.M0(2131748787, null);
                    s2Var.e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(l10);
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new cg.d(14)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (ziVar == null || org.telegram.messenger.t3.p0(chat)) {
                    j10 = 0;
                    z10 = false;
                    i10 = 0;
                } else {
                    j10 = zi.c2(i3, ziVar.k, true, false);
                    TLRPC.TL_forumTopic f10 = hp.s1(i3).q7.f(chat.id, j10);
                    if (f10 != null) {
                        CharSequence j11 = rg.c.j(f10, textPaint, null);
                        spannableStringBuilder.append(j11);
                        i10 = f10.unread_count > 0 ? j11.length() : 0;
                        s2Var.c = j11.length();
                        if (ziVar.Q3()) {
                            s2Var.d = false;
                        } else {
                            s2Var.d = f10.unread_count > 0;
                        }
                    } else {
                        s2Var.d = false;
                        i10 = 0;
                    }
                    if (s2Var.d) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new r2(org.telegram.messenger.g0.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (org.telegram.messenger.t3.p0(chat)) {
                    s2Var.f = new HashMap();
                    for (int i11 = 0; i11 < Math.min(4, arrayList.size()); i11++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long o10 = org.telegram.messenger.m5.o(((TLRPC.TL_forumTopic) arrayList.get(i11)).from_id);
                        org.telegram.ui.h5 h5Var = new org.telegram.ui.h5(i3, s2Var.a);
                        h5Var.h = false;
                        h5Var.c(o10);
                        s2Var.f.put(Long.valueOf(o10), h5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.m5.l(h10.t0, o10));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(h5Var, 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                    }
                } else {
                    int i12 = 0;
                    for (int i13 = 4; i12 < Math.min(i13, arrayList.size()); i13 = 4) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i12)).id != j10) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z11 && z10) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(rg.c.j((TLRPC.ForumTopic) arrayList.get(i12), textPaint, null));
                            z11 = false;
                        }
                        i12++;
                    }
                }
                if (i10 > 0) {
                    Typeface o11 = org.telegram.messenger.g0.o();
                    int i14 = org.telegram.ui.ActionBar.k6.X8;
                    o31 o31Var = new o31();
                    o31Var.a = o11;
                    o31Var.c = i14;
                    o31Var.b = org.telegram.ui.ActionBar.k6.v0(i14);
                    spannableStringBuilder.setSpan(o31Var, 0, Math.min(spannableStringBuilder.length(), i10 + 2), 0);
                }
                s2Var.g = spannableStringBuilder;
            }
        }
    }
}
