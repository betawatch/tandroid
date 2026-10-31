package org.telegram.ui.Components;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q11 extends sk0 {
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ t11 d;

    public q11(t11 t11Var) {
        this.d = t11Var;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x045e  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        TextPaint textPaint;
        org.telegram.ui.ActionBar.p6 p6Var;
        TextPaint textPaint2;
        String str;
        TLRPC.Message message;
        int i11;
        long o10;
        TextPaint textPaint3;
        long j10;
        CharSequence replace;
        TLRPC.Chat L0;
        String str2;
        CharSequence charSequence;
        ArrayList arrayList = this.c;
        r11 r11Var = (r11) arrayList.get(i10);
        s11 s11Var = (s11) c1Var.a;
        boolean z11 = i10 < arrayList.size() - 1;
        s11Var.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = r11Var.a;
        s11Var.c = z11;
        t11 t11Var = s11Var.y;
        int i12 = t11Var.a;
        TextPaint textPaint4 = t11Var.U;
        boolean z12 = t11Var.c;
        boolean z13 = t11Var.d;
        TextPaint textPaint5 = t11Var.V;
        long j11 = t11Var.b;
        TextPaint textPaint6 = t11Var.T;
        org.telegram.ui.ActionBar.p6 p6Var2 = t11Var.e;
        org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i12);
        g9 g9Var = s11Var.a;
        g9Var.setAnimatedEmojiDrawable(null);
        g9Var.b();
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        g9Var.setRoundRadius(0);
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var2);
        g9Var.setColorFilter(null);
        org.telegram.messenger.fw fwVar = r11Var.b;
        if (fwVar != null) {
            z10 = z13;
            textPaint = textPaint4;
            str = t11Var.d(fwVar.a);
            org.telegram.messenger.jj jjVar = fwVar.d;
            TLRPC.Message message2 = jjVar != null ? jjVar.k : null;
            i11 = (int) fwVar.f;
            s11Var.n = false;
            s11Var.r = fwVar.b;
            r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
            p6Var = p6Var2;
            if (fwVar.a == org.telegram.messenger.d20.i(i12).e()) {
                r8Var.g(22);
                r8Var.p = 0.38f;
                g9Var.setImageDrawable(r8Var);
            } else {
                long j12 = fwVar.a;
                if (j12 == 2666000) {
                    r8Var.g(21);
                    r8Var.p = 0.38f;
                    g9Var.setImageDrawable(r8Var);
                } else {
                    TLObject Z1 = j12 > 0 ? r12.Z1(Long.valueOf(j12)) : r12.L0(Long.valueOf(-j12));
                    r8Var.p(Z1);
                    g9Var.e(Z1, r8Var);
                }
            }
            textPaint2 = textPaint6;
            message = message2;
        } else {
            z10 = z13;
            textPaint = textPaint4;
            p6Var = p6Var2;
            if (tL_forumTopic == null) {
                str = org.telegram.messenger.cd.L0(2131744009, null);
                if (z10) {
                    r8 r8Var2 = new r8((org.telegram.ui.ActionBar.p6) null);
                    r8Var2.g(1);
                    r8Var2.p = 0.38f;
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
                    g9Var.setImageDrawable(r8Var2);
                } else {
                    g9Var.setImageResource(R.drawable.other_chats);
                    g9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                ArrayList arrayList2 = (ArrayList) r12.R.f(j11);
                message = (arrayList2 == null || arrayList2.isEmpty()) ? null : ((org.telegram.messenger.jj) arrayList2.get(0)).k;
                TLRPC.Dialog dialog = (TLRPC.Dialog) r12.Q.f(j11);
                int i13 = dialog != null ? dialog.unread_count : 0;
                s11Var.n = r12.q2(t11Var.b, 0L, null);
                s11Var.r = false;
                textPaint2 = textPaint6;
                i11 = i13;
            } else {
                String str3 = tL_forumTopic.title;
                TLRPC.Message message3 = tL_forumTopic.topMessage;
                int i14 = tL_forumTopic.unread_count;
                textPaint2 = textPaint6;
                s11Var.n = r12.q2(t11Var.b, tL_forumTopic.id, null);
                s11Var.r = tL_forumTopic.pinned;
                if (z12) {
                    long o11 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                    TLObject Z12 = o11 > 0 ? r12.Z1(Long.valueOf(o11)) : r12.L0(Long.valueOf(-o11));
                    r8 r8Var3 = new r8((org.telegram.ui.ActionBar.p6) null);
                    r8Var3.p(Z12);
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
                    g9Var.e(Z12, r8Var3);
                    if (Z12 instanceof TLRPC.User) {
                        str = org.telegram.messenger.h20.p((TLRPC.User) Z12);
                    } else if (Z12 instanceof TLRPC.Chat) {
                        str = ((TLRPC.Chat) Z12).title;
                    }
                    message = message3;
                    i11 = i14;
                } else if (tL_forumTopic.id == 1) {
                    g9Var.setImageResource(R.drawable.msg_filled_general);
                    g9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                } else {
                    long j13 = tL_forumTopic.icon_emoji_id;
                    if (j13 != 0) {
                        g9Var.setAnimatedEmojiDrawable(f5.m(org.telegram.messenger.d20.s0, j13, null, 3));
                    } else {
                        g9Var.setImageDrawable(gg.e.e(tL_forumTopic));
                    }
                }
                str = str3;
                message = message3;
                i11 = i14;
            }
        }
        org.telegram.messenger.fw fwVar2 = r11Var.b;
        if (fwVar2 != null) {
            o10 = fwVar2.a;
        } else {
            TLRPC.TL_forumTopic tL_forumTopic2 = r11Var.a;
            o10 = tL_forumTopic2 == null ? 0L : r11Var.c.c ? org.telegram.messenger.o5.o(tL_forumTopic2.from_id) : tL_forumTopic2.id;
        }
        s11Var.s = o10 == t11Var.J;
        s11Var.h = i11 > 0 ? i11 > 999 ? "999+" : String.valueOf(i11) : null;
        int i15 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var3 = p6Var;
        TextPaint textPaint7 = textPaint2;
        textPaint7.setColor(org.telegram.ui.ActionBar.t6.w0(i15, p6Var3));
        TextPaint textPaint8 = textPaint;
        textPaint8.setColor(w02);
        textPaint5.setColor(org.telegram.ui.ActionBar.t6.r1(0.6f, org.telegram.ui.ActionBar.t6.w0(i15, p6Var3)));
        int L = org.telegram.messenger.i0.L(248.0f);
        CharSequence charSequence2 = "";
        String a12 = message != null ? org.telegram.messenger.cd.a1(message.date) : "";
        int ceil = (int) Math.ceil(textPaint8.measureText(a12));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        s11Var.f = new StaticLayout(a12, textPaint8, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - org.telegram.messenger.i0.L(26.0f)) - s11Var.f.getWidth()) - org.telegram.messenger.i0.L(6.0f)) - (s11Var.n ? org.telegram.messenger.i0.L(18.0f) : 0)) - (s11Var.r ? org.telegram.messenger.i0.L(19.0f) : 0);
        CharSequence replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i16 = (z12 || z10) ? 0 : 1;
        HashMap hashMap = t11Var.S;
        if (message == null) {
            textPaint3 = textPaint5;
        } else {
            long j14 = ((message.id << 1) ^ (message.dialog_id * 31)) ^ i16;
            CharSequence charSequence3 = (CharSequence) hashMap.get(Long.valueOf(j14));
            if (charSequence3 != null) {
                textPaint3 = textPaint5;
                charSequence2 = charSequence3;
            } else {
                org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(i12, message, false, false);
                CharSequence charSequence4 = jjVar2.z;
                if (charSequence4 == null) {
                    charSequence4 = jjVar2.v;
                }
                if (charSequence4 == null) {
                    textPaint3 = textPaint5;
                    j10 = j14;
                    replace = "";
                } else {
                    textPaint3 = textPaint5;
                    j10 = j14;
                    replace = charSequence4.toString().replace('\n', ' ');
                }
                if (i16 != 0 && !jjVar2.k.out) {
                    long C1 = org.telegram.messenger.jj.C1(message.from_id);
                    if (C1 > 0) {
                        TLRPC.User Z13 = org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(C1));
                        if (Z13 != null) {
                            str2 = org.telegram.messenger.h20.j(Z13, true);
                            if (!TextUtils.isEmpty(str2)) {
                                replace = TextUtils.concat(str2, ": ", replace);
                            }
                        }
                        str2 = null;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    } else {
                        if (C1 < 0 && C1 != j11 && (L0 = org.telegram.messenger.vp.r1(i12).L0(Long.valueOf(-C1))) != null) {
                            str2 = L0.title;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                        str2 = null;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    }
                }
                charSequence2 = org.telegram.messenger.k6.m(replace, textPaint3.getFontMetricsInt(), false, null, 0);
                hashMap.put(Long.valueOf(j10), charSequence2);
            }
        }
        if (!TextUtils.isEmpty(t11Var.K)) {
            if (t11Var.e(r11Var)) {
                CharSequence w12 = org.telegram.messenger.i0.w1(replace2, t11Var.K, p6Var3);
                if (w12 != null) {
                    replace2 = w12;
                }
            } else {
                TLObject c10 = t11Var.c(r11Var);
                String n10 = c10 instanceof TLRPC.User ? org.telegram.messenger.h20.n((TLRPC.User) c10) : c10 instanceof TLRPC.Chat ? org.telegram.messenger.w3.K((TLRPC.Chat) c10, false) : null;
                if (n10 != null && n10.toLowerCase().contains(t11Var.K)) {
                    StringBuilder sb2 = new StringBuilder("@");
                    TLObject c11 = t11Var.c(r11Var);
                    sb2.append(c11 instanceof TLRPC.User ? org.telegram.messenger.h20.n((TLRPC.User) c11) : c11 instanceof TLRPC.Chat ? org.telegram.messenger.w3.K((TLRPC.Chat) c11, false) : null);
                    SpannableStringBuilder w13 = org.telegram.messenger.i0.w1(sb2.toString(), t11Var.K, p6Var3);
                    if (w13 != null) {
                        charSequence = w13;
                        CharSequence m10 = org.telegram.messenger.k6.m(replace2, textPaint7.getFontMetricsInt(), false, null, 0);
                        float max = Math.max(0, L2);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        s11Var.d = new StaticLayout(TextUtils.ellipsize(m10, textPaint7, max, truncateAt), textPaint7, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
                        String str4 = s11Var.h;
                        int L3 = L - (str4 == null ? org.telegram.messenger.i0.L(22.0f) + ((int) t11Var.W.measureText(str4)) : 0);
                        s11Var.e = ov0.c(charSequence, textPaint3, Math.max(1, L3), alignment, org.telegram.messenger.i0.L(1.0f), truncateAt, Math.max(1, L3), 2, true);
                        if (s11Var.n && s11Var.w == null) {
                            s11Var.w = s11Var.getContext().getDrawable(R.drawable.list_mute).mutate();
                        }
                        if (s11Var.r && s11Var.x == null) {
                            s11Var.x = s11Var.getContext().getDrawable(R.drawable.list_pin).mutate();
                        }
                        s11Var.requestLayout();
                        s11Var.invalidate();
                    }
                }
            }
        }
        charSequence = charSequence2;
        CharSequence m102 = org.telegram.messenger.k6.m(replace2, textPaint7.getFontMetricsInt(), false, null, 0);
        float max2 = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        s11Var.d = new StaticLayout(TextUtils.ellipsize(m102, textPaint7, max2, truncateAt2), textPaint7, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str42 = s11Var.h;
        int L32 = L - (str42 == null ? org.telegram.messenger.i0.L(22.0f) + ((int) t11Var.W.measureText(str42)) : 0);
        s11Var.e = ov0.c(charSequence, textPaint3, Math.max(1, L32), alignment, org.telegram.messenger.i0.L(1.0f), truncateAt2, Math.max(1, L32), 2, true);
        if (s11Var.n) {
            s11Var.w = s11Var.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (s11Var.r) {
            s11Var.x = s11Var.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        s11Var.requestLayout();
        s11Var.invalidate();
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        s11 s11Var = new s11(this.d, viewGroup.getContext());
        s11Var.setLayoutParams(new s4.o0(-1, -2));
        return new ck0(s11Var);
    }
}
