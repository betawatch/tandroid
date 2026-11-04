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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k01 extends sj0 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final /* synthetic */ n01 e;

    public k01(n01 n01Var) {
        this.e = n01Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x03ae, code lost:
    
        if (r0 != null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0459  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        m01 m01Var;
        boolean z10;
        TextPaint textPaint;
        String str;
        TLRPC.Message message;
        int i10;
        TLRPC.Message message2;
        int i11;
        String str2;
        TextPaint textPaint2;
        int i12;
        CharSequence replace;
        TLRPC.Chat M0;
        String str3;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList = this.c;
        l01 l01Var = (l01) arrayList.get(i3);
        m01 m01Var2 = (m01) d1Var.a;
        boolean z11 = i3 < arrayList.size() - 1;
        m01Var2.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = l01Var.a;
        m01Var2.c = z11;
        n01 n01Var = m01Var2.y;
        int i13 = n01Var.a;
        TextPaint textPaint3 = n01Var.c0;
        boolean z12 = n01Var.c;
        boolean z13 = n01Var.d;
        TextPaint textPaint4 = n01Var.d0;
        long j10 = n01Var.b;
        TextPaint textPaint5 = n01Var.b0;
        org.telegram.ui.ActionBar.e6 e6Var = n01Var.e;
        org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i13);
        k9 k9Var = m01Var2.a;
        k9Var.setAnimatedEmojiDrawable(null);
        k9Var.b();
        k9Var.setScaleX(1.0f);
        k9Var.setScaleY(1.0f);
        k9Var.setRoundRadius(0);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, e6Var);
        k9Var.setColorFilter(null);
        org.telegram.messenger.mv mvVar = l01Var.b;
        if (mvVar != null) {
            String e10 = n01Var.e(mvVar.a);
            org.telegram.messenger.zi ziVar = mvVar.d;
            TLRPC.Message message3 = ziVar != null ? ziVar.k : null;
            int i14 = (int) mvVar.f;
            m01Var = m01Var2;
            m01Var.n = false;
            m01Var.r = mvVar.b;
            u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
            z10 = z13;
            if (mvVar.a == org.telegram.messenger.h10.i(i13).e()) {
                u8Var.g(22);
                u8Var.p = 0.38f;
                k9Var.setImageDrawable(u8Var);
            } else {
                long j11 = mvVar.a;
                if (j11 == 2666000) {
                    u8Var.g(21);
                    u8Var.p = 0.38f;
                    k9Var.setImageDrawable(u8Var);
                } else {
                    TLObject a22 = j11 > 0 ? s12.a2(Long.valueOf(j11)) : s12.M0(Long.valueOf(-j11));
                    u8Var.p(a22);
                    k9Var.e(a22, u8Var);
                }
            }
            textPaint = textPaint3;
            message = message3;
            i11 = i14;
            str = e10;
        } else {
            m01Var = m01Var2;
            z10 = z13;
            if (tL_forumTopic == null) {
                String M02 = org.telegram.messenger.bd.M0(2131743994, null);
                if (z10) {
                    u8 u8Var2 = new u8((org.telegram.ui.ActionBar.e6) null);
                    u8Var2.g(1);
                    u8Var2.p = 0.38f;
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    k9Var.setImageDrawable(u8Var2);
                } else {
                    k9Var.setImageResource(R.drawable.other_chats);
                    k9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                ArrayList arrayList2 = (ArrayList) s12.S.f(j10);
                TLRPC.Message message4 = (arrayList2 == null || arrayList2.isEmpty()) ? null : ((org.telegram.messenger.zi) arrayList2.get(0)).k;
                TLRPC.Dialog dialog = (TLRPC.Dialog) s12.R.f(j10);
                int i15 = dialog != null ? dialog.unread_count : 0;
                m01Var.n = s12.r2(n01Var.b, 0L, null);
                m01Var.r = false;
                str = M02;
                textPaint = textPaint3;
                message = message4;
                i11 = i15;
            } else {
                String str4 = tL_forumTopic.title;
                TLRPC.Message message5 = tL_forumTopic.topMessage;
                int i16 = tL_forumTopic.unread_count;
                textPaint = textPaint3;
                str = str4;
                m01Var.n = s12.r2(n01Var.b, tL_forumTopic.id, null);
                m01Var.r = tL_forumTopic.pinned;
                if (z12) {
                    message = message5;
                    i10 = i16;
                    long o10 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                    TLObject a23 = o10 > 0 ? s12.a2(Long.valueOf(o10)) : s12.M0(Long.valueOf(-o10));
                    u8 u8Var3 = new u8((org.telegram.ui.ActionBar.e6) null);
                    u8Var3.p(a23);
                    k9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    k9Var.e(a23, u8Var3);
                    if (a23 instanceof TLRPC.User) {
                        str2 = org.telegram.messenger.l10.p((TLRPC.User) a23);
                    } else if (a23 instanceof TLRPC.Chat) {
                        str2 = ((TLRPC.Chat) a23).title;
                    }
                    str = str2;
                    i11 = i10;
                } else {
                    message = message5;
                    i10 = i16;
                    if (tL_forumTopic.id == 1) {
                        k9Var.setImageResource(R.drawable.msg_filled_general);
                        k9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    } else {
                        long j12 = tL_forumTopic.icon_emoji_id;
                        if (j12 != 0) {
                            message2 = message;
                            k9Var.setAnimatedEmojiDrawable(g5.m(org.telegram.messenger.h10.t0, j12, null, 3));
                        } else {
                            message2 = message;
                            k9Var.setImageDrawable(rg.c.e(tL_forumTopic));
                        }
                        i11 = i10;
                        message = message2;
                    }
                }
                message2 = message;
                i11 = i10;
                message = message2;
            }
        }
        m01Var.s = l01Var.a() == n01Var.L;
        m01Var.h = i11 > 0 ? i11 > 999 ? "999+" : String.valueOf(i11) : null;
        int i17 = org.telegram.ui.ActionBar.k6.G6;
        textPaint5.setColor(org.telegram.ui.ActionBar.k6.w0(i17, e6Var));
        textPaint.setColor(w02);
        textPaint4.setColor(org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(i17, e6Var)));
        int L = n01Var.J - org.telegram.messenger.g0.L(40.0f);
        CharSequence charSequence3 = "";
        String e12 = message != null ? org.telegram.messenger.bd.e1(message.date) : "";
        int ceil = (int) Math.ceil(textPaint.measureText(e12));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        m01Var.f = new StaticLayout(e12, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - org.telegram.messenger.g0.L(26.0f)) - m01Var.f.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - (m01Var.n ? org.telegram.messenger.g0.L(18.0f) : 0)) - (m01Var.r ? org.telegram.messenger.g0.L(19.0f) : 0);
        String replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i18 = (z12 || z10) ? 0 : 1;
        HashMap hashMap = n01Var.a0;
        if (message == null) {
            textPaint2 = textPaint4;
        } else {
            long j13 = ((message.id << 1) ^ (message.dialog_id * 31)) ^ i18;
            CharSequence charSequence4 = (CharSequence) hashMap.get(Long.valueOf(j13));
            if (charSequence4 != null) {
                textPaint2 = textPaint4;
                charSequence3 = charSequence4;
            } else {
                org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(i13, message, false, false);
                CharSequence charSequence5 = ziVar2.z;
                if (charSequence5 == null) {
                    charSequence5 = ziVar2.v;
                }
                if (charSequence5 == null) {
                    textPaint2 = textPaint4;
                    i12 = i13;
                    replace = "";
                } else {
                    textPaint2 = textPaint4;
                    i12 = i13;
                    replace = charSequence5.toString().replace('\n', ' ');
                }
                if (i18 != 0 && !ziVar2.k.out) {
                    long C1 = org.telegram.messenger.zi.C1(message.from_id);
                    if (C1 > 0) {
                        TLRPC.User a24 = org.telegram.messenger.hp.s1(i12).a2(Long.valueOf(C1));
                        if (a24 != null) {
                            str3 = org.telegram.messenger.l10.j(a24, true);
                            if (!TextUtils.isEmpty(str3)) {
                                replace = TextUtils.concat(str3, ": ", replace);
                            }
                        }
                        str3 = null;
                        if (!TextUtils.isEmpty(str3)) {
                        }
                    } else {
                        if (C1 < 0 && C1 != j10 && (M0 = org.telegram.messenger.hp.s1(i12).M0(Long.valueOf(-C1))) != null) {
                            str3 = M0.title;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (!TextUtils.isEmpty(str3)) {
                        }
                    }
                }
                charSequence3 = org.telegram.messenger.i6.m(replace, textPaint2.getFontMetricsInt(), false, null, 0);
                hashMap.put(Long.valueOf(j13), charSequence3);
            }
        }
        if (!TextUtils.isEmpty(n01Var.M)) {
            if (n01Var.f(l01Var)) {
                charSequence = org.telegram.messenger.g0.w1(replace2, n01Var.M, e6Var);
            } else {
                TLObject d = n01Var.d(l01Var);
                String n4 = d instanceof TLRPC.User ? org.telegram.messenger.l10.n((TLRPC.User) d) : d instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) d, false) : null;
                if (n4 != null && n4.toLowerCase().contains(n01Var.M)) {
                    StringBuilder sb2 = new StringBuilder("@");
                    TLObject d10 = n01Var.d(l01Var);
                    sb2.append(d10 instanceof TLRPC.User ? org.telegram.messenger.l10.n((TLRPC.User) d10) : d10 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) d10, false) : null);
                    SpannableStringBuilder w12 = org.telegram.messenger.g0.w1(sb2.toString(), n01Var.M, e6Var);
                    if (w12 != null) {
                        String str5 = replace2;
                        charSequence2 = w12;
                        charSequence = str5;
                        CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
                        float max = Math.max(0, L2);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        m01Var.d = new StaticLayout(TextUtils.ellipsize(m10, textPaint5, max, truncateAt), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
                        String str6 = m01Var.h;
                        int L3 = L - (str6 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) n01Var.e0.measureText(str6)) : 0);
                        m01Var.e = lu0.c(charSequence2, textPaint2, Math.max(1, L3), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt, Math.max(1, L3), 2, true);
                        if (m01Var.n && m01Var.w == null) {
                            m01Var.w = m01Var.getContext().getDrawable(R.drawable.list_mute).mutate();
                        }
                        if (m01Var.r && m01Var.x == null) {
                            m01Var.x = m01Var.getContext().getDrawable(R.drawable.list_pin).mutate();
                        }
                        m01Var.requestLayout();
                        m01Var.invalidate();
                    }
                }
            }
        }
        charSequence = replace2;
        charSequence2 = charSequence3;
        CharSequence m102 = org.telegram.messenger.i6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
        float max2 = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        m01Var.d = new StaticLayout(TextUtils.ellipsize(m102, textPaint5, max2, truncateAt2), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str62 = m01Var.h;
        int L32 = L - (str62 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) n01Var.e0.measureText(str62)) : 0);
        m01Var.e = lu0.c(charSequence2, textPaint2, Math.max(1, L32), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt2, Math.max(1, L32), 2, true);
        if (m01Var.n) {
            m01Var.w = m01Var.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (m01Var.r) {
            m01Var.x = m01Var.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        m01Var.requestLayout();
        m01Var.invalidate();
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        m01 m01Var = new m01(this.e, viewGroup.getContext());
        m01Var.setLayoutParams(new u4.p0(-1, -2));
        return new bj0(m01Var);
    }
}
