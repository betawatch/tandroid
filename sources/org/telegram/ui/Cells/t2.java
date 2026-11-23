package org.telegram.ui.Cells;

import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t2 {
    public final u2 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public HashMap f;
    public CharSequence g;

    public t2(u2 u2Var) {
        this.a = u2Var;
    }

    public static void a(t2 t2Var, int i7, fj fjVar, TLRPC.Chat chat) {
        long j3;
        boolean z10;
        int i10;
        t2Var.getClass();
        int e12 = (fjVar == null || chat == null) ? 0 : fjVar.e1();
        if (t2Var.b != e12 || t2Var.e) {
            t2Var.f = null;
            t2Var.c = 0;
            t2Var.d = false;
            t2Var.e = false;
            t2Var.b = e12;
            TextPaint textPaint = org.telegram.ui.ActionBar.n6.F0[0];
            if (chat != null) {
                ArrayList l10 = mp.u1(i7).t7.l(chat.id);
                boolean z11 = true;
                if (l10 == null || l10.isEmpty()) {
                    if (mp.u1(i7).t7.e(chat.id)) {
                        t2Var.g = gd.N0(org.telegram.messenger.v3.p0(chat) ? 2131747997 : 2131747944, null);
                        return;
                    }
                    mp.u1(i7).t7.n(0, chat.id, true);
                    t2Var.g = gd.N0(2131748586, null);
                    t2Var.e = true;
                    return;
                }
                ArrayList arrayList = new ArrayList(l10);
                Collections.sort(arrayList, Comparator$-CC.comparingInt(new bg.d(14)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (fjVar == null || org.telegram.messenger.v3.p0(chat)) {
                    j3 = 0;
                    z10 = false;
                    i10 = 0;
                } else {
                    j3 = fj.b2(i7, fjVar.k, true, false);
                    TLRPC.TL_forumTopic f10 = mp.u1(i7).t7.f(chat.id, j3);
                    if (f10 != null) {
                        CharSequence k10 = qg.c.k(f10, textPaint, null);
                        spannableStringBuilder.append(k10);
                        i10 = f10.unread_count > 0 ? k10.length() : 0;
                        t2Var.c = k10.length();
                        if (fjVar.P3()) {
                            t2Var.d = false;
                        } else {
                            t2Var.d = f10.unread_count > 0;
                        }
                    } else {
                        t2Var.d = false;
                        i10 = 0;
                    }
                    if (t2Var.d) {
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.setSpan(new s2(org.telegram.messenger.g0.L(3.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (org.telegram.messenger.v3.p0(chat)) {
                    t2Var.f = new HashMap();
                    for (int i11 = 0; i11 < Math.min(4, arrayList.size()); i11++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long o4 = org.telegram.messenger.n5.o(((TLRPC.TL_forumTopic) arrayList.get(i11)).from_id);
                        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i7, t2Var.a);
                        f5Var.h = false;
                        f5Var.c(o4);
                        t2Var.f.put(Long.valueOf(o4), f5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.n5.l(i10.t0, o4));
                        valueOf.insert(0, (CharSequence) "  ");
                        valueOf.setSpan(f5Var, 0, 1, 33);
                        spannableStringBuilder.append((CharSequence) valueOf);
                    }
                } else {
                    int i12 = 0;
                    for (int i13 = 4; i12 < Math.min(i13, arrayList.size()); i13 = 4) {
                        if (((TLRPC.TL_forumTopic) arrayList.get(i12)).id != j3) {
                            if (spannableStringBuilder.length() != 0) {
                                if (z11 && z10) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                } else {
                                    spannableStringBuilder.append((CharSequence) ", ");
                                }
                            }
                            spannableStringBuilder.append(qg.c.k((TLRPC.ForumTopic) arrayList.get(i12), textPaint, null));
                            z11 = false;
                        }
                        i12++;
                    }
                }
                if (i10 > 0) {
                    Typeface o10 = org.telegram.messenger.g0.o();
                    int i14 = org.telegram.ui.ActionBar.n6.X8;
                    k41 k41Var = new k41();
                    k41Var.a = o10;
                    k41Var.c = i14;
                    k41Var.b = org.telegram.ui.ActionBar.n6.v0(i14);
                    spannableStringBuilder.setSpan(k41Var, 0, Math.min(spannableStringBuilder.length(), i10 + 2), 0);
                }
                t2Var.g = spannableStringBuilder;
            }
        }
    }
}
