package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u31;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public static void a(s2 s2Var, int i7, ij ijVar, TLRPC.Chat chat) {
        long j3;
        boolean z9;
        int i10;
        s2Var.getClass();
        int e12 = (ijVar == null || chat == null) ? 0 : ijVar.e1();
        if (s2Var.b != e12 || s2Var.e) {
            s2Var.f = null;
            s2Var.c = 0;
            s2Var.d = false;
            s2Var.e = false;
            s2Var.b = e12;
            TextPaint textPaint = org.telegram.ui.ActionBar.m6.F0[0];
            if (chat != null) {
                ArrayList l10 = qp.s1(i7).q7.l(chat.id);
                boolean z10 = true;
                if (l10 == null || l10.isEmpty()) {
                    if (qp.s1(i7).q7.e(chat.id)) {
                        s2Var.g = id.M0(org.telegram.messenger.t3.p0(chat) ? 2131748190 : 2131748137, null);
                        return;
                    }
                    qp.s1(i7).q7.n(0, chat.id, true);
                    s2Var.g = id.M0(2131748779, null);
                    s2Var.e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(l10);
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(14)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (ijVar == null || org.telegram.messenger.t3.p0(chat)) {
                    j3 = 0;
                    z9 = false;
                    i10 = 0;
                } else {
                    j3 = ij.b2(i7, ijVar.k, true, false);
                    TLRPC.TL_forumTopic f10 = qp.s1(i7).q7.f(chat.id, j3);
                    if (f10 != null) {
                        CharSequence j10 = qg.d.j(f10, textPaint, null);
                        spannableStringBuilder.append(j10);
                        i10 = f10.unread_count > 0 ? j10.length() : 0;
                        s2Var.c = j10.length();
                        if (ijVar.P3()) {
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
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                if (org.telegram.messenger.t3.p0(chat)) {
                    s2Var.f = new HashMap();
                    for (int i11 = 0; i11 < Math.min(4, arrayList.size()); i11++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long o4 = org.telegram.messenger.m5.o(((TLRPC.TL_forumTopic) arrayList.get(i11)).from_id);
                        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i7, s2Var.a);
                        f5Var.h = false;
                        f5Var.c(o4);
                        s2Var.f.put(Long.valueOf(o4), f5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.m5.l(p10.s0, o4));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(f5Var, 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                    }
                } else {
                    int i12 = 0;
                    for (int i13 = 4; i12 < Math.min(i13, arrayList.size()); i13 = 4) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i12)).id != j3) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z10 && z9) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(qg.d.j((TLRPC.ForumTopic) arrayList.get(i12), textPaint, null));
                            z10 = false;
                        }
                        i12++;
                    }
                }
                if (i10 > 0) {
                    Typeface o10 = org.telegram.messenger.g0.o();
                    int i14 = org.telegram.ui.ActionBar.m6.X8;
                    u31 u31Var = new u31();
                    u31Var.a = o10;
                    u31Var.c = i14;
                    u31Var.b = org.telegram.ui.ActionBar.m6.v0(i14);
                    spannableStringBuilder.setSpan(u31Var, 0, Math.min(spannableStringBuilder.length(), i10 + 2), 0);
                }
                s2Var.g = spannableStringBuilder;
            }
        }
    }
}
