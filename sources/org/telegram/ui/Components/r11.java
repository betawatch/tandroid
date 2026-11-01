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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r11 extends tk0 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final /* synthetic */ u11 e;

    public r11(u11 u11Var) {
        this.e = u11Var;
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.g0
    public final int b() {
        return this.c.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x03ae, code lost:
    
        if (r0 != null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0459  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        t11 t11Var;
        boolean z10;
        TextPaint textPaint;
        String str;
        TLRPC.Message message;
        int i11;
        TLRPC.Message message2;
        int i12;
        String str2;
        TextPaint textPaint2;
        int i13;
        CharSequence replace;
        TLRPC.Chat L0;
        String str3;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList = this.c;
        s11 s11Var = (s11) arrayList.get(i10);
        t11 t11Var2 = (t11) c1Var.a;
        boolean z11 = i10 < arrayList.size() - 1;
        t11Var2.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = s11Var.a;
        t11Var2.c = z11;
        u11 u11Var = t11Var2.y;
        int i14 = u11Var.a;
        TextPaint textPaint3 = u11Var.b0;
        boolean z12 = u11Var.c;
        boolean z13 = u11Var.d;
        TextPaint textPaint4 = u11Var.c0;
        long j10 = u11Var.b;
        TextPaint textPaint5 = u11Var.a0;
        org.telegram.ui.ActionBar.p6 p6Var = u11Var.e;
        org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i14);
        g9 g9Var = t11Var2.a;
        g9Var.setAnimatedEmojiDrawable(null);
        g9Var.b();
        g9Var.setScaleX(1.0f);
        g9Var.setScaleY(1.0f);
        g9Var.setRoundRadius(0);
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.y6, p6Var);
        g9Var.setColorFilter(null);
        org.telegram.messenger.gw gwVar = s11Var.b;
        if (gwVar != null) {
            String e = u11Var.e(gwVar.a);
            org.telegram.messenger.kj kjVar = gwVar.d;
            TLRPC.Message message3 = kjVar != null ? kjVar.k : null;
            int i15 = (int) gwVar.f;
            t11Var = t11Var2;
            t11Var.n = false;
            t11Var.r = gwVar.b;
            r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
            z10 = z13;
            if (gwVar.a == org.telegram.messenger.e20.i(i14).e()) {
                r8Var.g(22);
                r8Var.p = 0.38f;
                g9Var.setImageDrawable(r8Var);
            } else {
                long j11 = gwVar.a;
                if (j11 == 2666000) {
                    r8Var.g(21);
                    r8Var.p = 0.38f;
                    g9Var.setImageDrawable(r8Var);
                } else {
                    TLObject Z1 = j11 > 0 ? r12.Z1(Long.valueOf(j11)) : r12.L0(Long.valueOf(-j11));
                    r8Var.p(Z1);
                    g9Var.e(Z1, r8Var);
                }
            }
            textPaint = textPaint3;
            message = message3;
            i12 = i15;
            str = e;
        } else {
            t11Var = t11Var2;
            z10 = z13;
            if (tL_forumTopic == null) {
                String L02 = org.telegram.messenger.dd.L0(2131744009, null);
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
                ArrayList arrayList2 = (ArrayList) r12.R.f(j10);
                TLRPC.Message message4 = (arrayList2 == null || arrayList2.isEmpty()) ? null : ((org.telegram.messenger.kj) arrayList2.get(0)).k;
                TLRPC.Dialog dialog = (TLRPC.Dialog) r12.Q.f(j10);
                int i16 = dialog != null ? dialog.unread_count : 0;
                t11Var.n = r12.q2(u11Var.b, 0L, null);
                t11Var.r = false;
                str = L02;
                textPaint = textPaint3;
                message = message4;
                i12 = i16;
            } else {
                String str4 = tL_forumTopic.title;
                TLRPC.Message message5 = tL_forumTopic.topMessage;
                int i17 = tL_forumTopic.unread_count;
                textPaint = textPaint3;
                str = str4;
                t11Var.n = r12.q2(u11Var.b, tL_forumTopic.id, null);
                t11Var.r = tL_forumTopic.pinned;
                if (z12) {
                    message = message5;
                    i11 = i17;
                    long o10 = org.telegram.messenger.o5.o(tL_forumTopic.from_id);
                    TLObject Z12 = o10 > 0 ? r12.Z1(Long.valueOf(o10)) : r12.L0(Long.valueOf(-o10));
                    r8 r8Var3 = new r8((org.telegram.ui.ActionBar.p6) null);
                    r8Var3.p(Z12);
                    g9Var.setRoundRadius(org.telegram.messenger.i0.L(10.0f));
                    g9Var.e(Z12, r8Var3);
                    if (Z12 instanceof TLRPC.User) {
                        str2 = org.telegram.messenger.i20.p((TLRPC.User) Z12);
                    } else if (Z12 instanceof TLRPC.Chat) {
                        str2 = ((TLRPC.Chat) Z12).title;
                    }
                    str = str2;
                    i12 = i11;
                } else {
                    message = message5;
                    i11 = i17;
                    if (tL_forumTopic.id == 1) {
                        g9Var.setImageResource(R.drawable.msg_filled_general);
                        g9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    } else {
                        long j12 = tL_forumTopic.icon_emoji_id;
                        if (j12 != 0) {
                            message2 = message;
                            g9Var.setAnimatedEmojiDrawable(f5.m(org.telegram.messenger.e20.s0, j12, null, 3));
                        } else {
                            message2 = message;
                            g9Var.setImageDrawable(gg.e.e(tL_forumTopic));
                        }
                        i12 = i11;
                        message = message2;
                    }
                }
                message2 = message;
                i12 = i11;
                message = message2;
            }
        }
        t11Var.s = s11Var.a() == u11Var.K;
        t11Var.h = i12 > 0 ? i12 > 999 ? "999+" : String.valueOf(i12) : null;
        int i18 = org.telegram.ui.ActionBar.t6.G6;
        textPaint5.setColor(org.telegram.ui.ActionBar.t6.w0(i18, p6Var));
        textPaint.setColor(w02);
        textPaint4.setColor(org.telegram.ui.ActionBar.t6.r1(0.6f, org.telegram.ui.ActionBar.t6.w0(i18, p6Var)));
        int L = u11Var.I - org.telegram.messenger.i0.L(40.0f);
        CharSequence charSequence3 = "";
        String a12 = message != null ? org.telegram.messenger.dd.a1(message.date) : "";
        int ceil = (int) Math.ceil(textPaint.measureText(a12));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        t11Var.f = new StaticLayout(a12, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - org.telegram.messenger.i0.L(26.0f)) - t11Var.f.getWidth()) - org.telegram.messenger.i0.L(6.0f)) - (t11Var.n ? org.telegram.messenger.i0.L(18.0f) : 0)) - (t11Var.r ? org.telegram.messenger.i0.L(19.0f) : 0);
        String replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i19 = (z12 || z10) ? 0 : 1;
        HashMap hashMap = u11Var.W;
        if (message == null) {
            textPaint2 = textPaint4;
        } else {
            long j13 = ((message.id << 1) ^ (message.dialog_id * 31)) ^ i19;
            CharSequence charSequence4 = (CharSequence) hashMap.get(Long.valueOf(j13));
            if (charSequence4 != null) {
                textPaint2 = textPaint4;
                charSequence3 = charSequence4;
            } else {
                org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(i14, message, false, false);
                CharSequence charSequence5 = kjVar2.z;
                if (charSequence5 == null) {
                    charSequence5 = kjVar2.v;
                }
                if (charSequence5 == null) {
                    textPaint2 = textPaint4;
                    i13 = i14;
                    replace = "";
                } else {
                    textPaint2 = textPaint4;
                    i13 = i14;
                    replace = charSequence5.toString().replace('\n', ' ');
                }
                if (i19 != 0 && !kjVar2.k.out) {
                    long C1 = org.telegram.messenger.kj.C1(message.from_id);
                    if (C1 > 0) {
                        TLRPC.User Z13 = org.telegram.messenger.wp.r1(i13).Z1(Long.valueOf(C1));
                        if (Z13 != null) {
                            str3 = org.telegram.messenger.i20.j(Z13, true);
                            if (!TextUtils.isEmpty(str3)) {
                                replace = TextUtils.concat(str3, ": ", replace);
                            }
                        }
                        str3 = null;
                        if (!TextUtils.isEmpty(str3)) {
                        }
                    } else {
                        if (C1 < 0 && C1 != j10 && (L0 = org.telegram.messenger.wp.r1(i13).L0(Long.valueOf(-C1))) != null) {
                            str3 = L0.title;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (!TextUtils.isEmpty(str3)) {
                        }
                    }
                }
                charSequence3 = org.telegram.messenger.k6.m(replace, textPaint2.getFontMetricsInt(), false, null, 0);
                hashMap.put(Long.valueOf(j13), charSequence3);
            }
        }
        if (!TextUtils.isEmpty(u11Var.L)) {
            if (u11Var.f(s11Var)) {
                charSequence = org.telegram.messenger.i0.w1(replace2, u11Var.L, p6Var);
            } else {
                TLObject d = u11Var.d(s11Var);
                String n10 = d instanceof TLRPC.User ? org.telegram.messenger.i20.n((TLRPC.User) d) : d instanceof TLRPC.Chat ? org.telegram.messenger.w3.K((TLRPC.Chat) d, false) : null;
                if (n10 != null && n10.toLowerCase().contains(u11Var.L)) {
                    StringBuilder sb2 = new StringBuilder("@");
                    TLObject d10 = u11Var.d(s11Var);
                    sb2.append(d10 instanceof TLRPC.User ? org.telegram.messenger.i20.n((TLRPC.User) d10) : d10 instanceof TLRPC.Chat ? org.telegram.messenger.w3.K((TLRPC.Chat) d10, false) : null);
                    SpannableStringBuilder w12 = org.telegram.messenger.i0.w1(sb2.toString(), u11Var.L, p6Var);
                    if (w12 != null) {
                        String str5 = replace2;
                        charSequence2 = w12;
                        charSequence = str5;
                        CharSequence m10 = org.telegram.messenger.k6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
                        float max = Math.max(0, L2);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        t11Var.d = new StaticLayout(TextUtils.ellipsize(m10, textPaint5, max, truncateAt), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
                        String str6 = t11Var.h;
                        int L3 = L - (str6 == null ? org.telegram.messenger.i0.L(22.0f) + ((int) u11Var.d0.measureText(str6)) : 0);
                        t11Var.e = pv0.c(charSequence2, textPaint2, Math.max(1, L3), alignment, org.telegram.messenger.i0.L(1.0f), truncateAt, Math.max(1, L3), 2, true);
                        if (t11Var.n && t11Var.w == null) {
                            t11Var.w = t11Var.getContext().getDrawable(R.drawable.list_mute).mutate();
                        }
                        if (t11Var.r && t11Var.x == null) {
                            t11Var.x = t11Var.getContext().getDrawable(R.drawable.list_pin).mutate();
                        }
                        t11Var.requestLayout();
                        t11Var.invalidate();
                    }
                }
            }
        }
        charSequence = replace2;
        charSequence2 = charSequence3;
        CharSequence m102 = org.telegram.messenger.k6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
        float max2 = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        t11Var.d = new StaticLayout(TextUtils.ellipsize(m102, textPaint5, max2, truncateAt2), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str62 = t11Var.h;
        int L32 = L - (str62 == null ? org.telegram.messenger.i0.L(22.0f) + ((int) u11Var.d0.measureText(str62)) : 0);
        t11Var.e = pv0.c(charSequence2, textPaint2, Math.max(1, L32), alignment, org.telegram.messenger.i0.L(1.0f), truncateAt2, Math.max(1, L32), 2, true);
        if (t11Var.n) {
            t11Var.w = t11Var.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (t11Var.r) {
            t11Var.x = t11Var.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        t11Var.requestLayout();
        t11Var.invalidate();
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        t11 t11Var = new t11(this.e, viewGroup.getContext());
        t11Var.setLayoutParams(new s4.o0(-1, -2));
        return new dk0(t11Var);
    }
}
