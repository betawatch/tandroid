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
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i41;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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

    public static void a(s2 s2Var, int i7, fj fjVar, TLRPC.Chat chat) {
        long j3;
        boolean z10;
        int i10;
        s2Var.getClass();
        int e12 = (fjVar == null || chat == null) ? 0 : fjVar.e1();
        if (s2Var.b != e12 || s2Var.e) {
            s2Var.f = null;
            s2Var.c = 0;
            s2Var.d = false;
            s2Var.e = false;
            s2Var.b = e12;
            TextPaint textPaint = org.telegram.ui.ActionBar.n6.F0[0];
            if (chat != null) {
                ArrayList l10 = mp.u1(i7).t7.l(chat.id);
                boolean z11 = true;
                if (l10 == null || l10.isEmpty()) {
                    if (mp.u1(i7).t7.e(chat.id)) {
                        s2Var.g = gd.M0(org.telegram.messenger.v3.p0(chat) ? 2131747998 : 2131747945, null);
                        return;
                    }
                    mp.u1(i7).t7.n(0, chat.id, true);
                    s2Var.g = gd.M0(2131748587, null);
                    s2Var.e = true;
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
                        s2Var.c = k10.length();
                        if (fjVar.P3()) {
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
                if (org.telegram.messenger.v3.p0(chat)) {
                    s2Var.f = new HashMap();
                    for (int i11 = 0; i11 < Math.min(4, arrayList.size()); i11++) {
                        if (spannableStringBuilder.length() != 0) {
                            spannableStringBuilder.append((CharSequence) "  ");
                        }
                        long o4 = org.telegram.messenger.n5.o(((TLRPC.TL_forumTopic) arrayList.get(i11)).from_id);
                        org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(i7, s2Var.a);
                        f5Var.h = false;
                        f5Var.c(o4);
                        s2Var.f.put(Long.valueOf(o4), f5Var);
                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(org.telegram.messenger.n5.l(j10.t0, o4));
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
                    i41 i41Var = new i41();
                    i41Var.a = o10;
                    i41Var.c = i14;
                    i41Var.b = org.telegram.ui.ActionBar.n6.v0(i14);
                    spannableStringBuilder.setSpan(i41Var, 0, Math.min(spannableStringBuilder.length(), i10 + 2), 0);
                }
                s2Var.g = spannableStringBuilder;
            }
        }
    }
}
