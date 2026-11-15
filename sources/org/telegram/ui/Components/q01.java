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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class q01 extends tj0 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final /* synthetic */ v01 e;

    public q01(v01 v01Var) {
        this.e = v01Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override // v4.h0
    public final int b() {
        return this.c.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x03ae, code lost:
    
        if (r0 != null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0459  */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        u01 u01Var;
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
        s01 s01Var = (s01) arrayList.get(i7);
        u01 u01Var2 = (u01) e1Var.a;
        boolean z11 = i7 < arrayList.size() - 1;
        u01Var2.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = s01Var.a;
        u01Var2.c = z11;
        v01 v01Var = u01Var2.y;
        int i13 = v01Var.a;
        TextPaint textPaint3 = v01Var.k0;
        boolean z12 = v01Var.c;
        boolean z13 = v01Var.d;
        TextPaint textPaint4 = v01Var.l0;
        long j3 = v01Var.b;
        TextPaint textPaint5 = v01Var.j0;
        org.telegram.ui.ActionBar.e6 e6Var = v01Var.e;
        org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i13);
        i9 i9Var = u01Var2.a;
        i9Var.setAnimatedEmojiDrawable(null);
        i9Var.b();
        i9Var.setScaleX(1.0f);
        i9Var.setScaleY(1.0f);
        i9Var.setRoundRadius(0);
        int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y6, e6Var);
        i9Var.setColorFilter(null);
        org.telegram.messenger.sv svVar = s01Var.b;
        if (svVar != null) {
            String f10 = v01Var.f(svVar.a);
            org.telegram.messenger.gj gjVar = svVar.d;
            TLRPC.Message message3 = gjVar != null ? gjVar.k : null;
            int i14 = (int) svVar.f;
            u01Var = u01Var2;
            u01Var.n = false;
            u01Var.r = svVar.b;
            t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
            z10 = z13;
            if (svVar.a == org.telegram.messenger.m10.i(i13).e()) {
                t8Var.g(22);
                t8Var.p = 0.38f;
                i9Var.setImageDrawable(t8Var);
            } else {
                long j10 = svVar.a;
                if (j10 == 2666000) {
                    t8Var.g(21);
                    t8Var.p = 0.38f;
                    i9Var.setImageDrawable(t8Var);
                } else {
                    TLObject a22 = j10 > 0 ? s12.a2(Long.valueOf(j10)) : s12.M0(Long.valueOf(-j10));
                    t8Var.p(a22);
                    i9Var.f(a22, t8Var);
                }
            }
            textPaint = textPaint3;
            message = message3;
            i11 = i14;
            str = f10;
        } else {
            u01Var = u01Var2;
            z10 = z13;
            if (tL_forumTopic == null) {
                String M02 = org.telegram.messenger.hd.M0(2131743984, null);
                if (z10) {
                    t8 t8Var2 = new t8((org.telegram.ui.ActionBar.e6) null);
                    t8Var2.g(1);
                    t8Var2.p = 0.38f;
                    i9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    i9Var.setImageDrawable(t8Var2);
                } else {
                    i9Var.setImageResource(R.drawable.other_chats);
                    i9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                ArrayList arrayList2 = (ArrayList) s12.S.f(j3);
                TLRPC.Message message4 = (arrayList2 == null || arrayList2.isEmpty()) ? null : ((org.telegram.messenger.gj) arrayList2.get(0)).k;
                TLRPC.Dialog dialog = (TLRPC.Dialog) s12.R.f(j3);
                int i15 = dialog != null ? dialog.unread_count : 0;
                u01Var.n = s12.r2(v01Var.b, 0L, null);
                u01Var.r = false;
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
                u01Var.n = s12.r2(v01Var.b, tL_forumTopic.id, null);
                u01Var.r = tL_forumTopic.pinned;
                if (z12) {
                    message = message5;
                    i10 = i16;
                    long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                    TLObject a23 = o4 > 0 ? s12.a2(Long.valueOf(o4)) : s12.M0(Long.valueOf(-o4));
                    t8 t8Var3 = new t8((org.telegram.ui.ActionBar.e6) null);
                    t8Var3.p(a23);
                    i9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    i9Var.f(a23, t8Var3);
                    if (a23 instanceof TLRPC.User) {
                        str2 = org.telegram.messenger.q10.p((TLRPC.User) a23);
                    } else if (a23 instanceof TLRPC.Chat) {
                        str2 = ((TLRPC.Chat) a23).title;
                    }
                    str = str2;
                    i11 = i10;
                } else {
                    message = message5;
                    i10 = i16;
                    if (tL_forumTopic.id == 1) {
                        i9Var.setImageResource(R.drawable.msg_filled_general);
                        i9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    } else {
                        long j11 = tL_forumTopic.icon_emoji_id;
                        if (j11 != 0) {
                            message2 = message;
                            i9Var.setAnimatedEmojiDrawable(g5.m(org.telegram.messenger.m10.t0, j11, null, 3));
                        } else {
                            message2 = message;
                            i9Var.setImageDrawable(qg.c.e(tL_forumTopic));
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
        u01Var.s = s01Var.a() == v01Var.L;
        u01Var.h = i11 > 0 ? i11 > 999 ? "999+" : String.valueOf(i11) : null;
        int i17 = org.telegram.ui.ActionBar.j6.G6;
        textPaint5.setColor(org.telegram.ui.ActionBar.j6.w0(i17, e6Var));
        textPaint.setColor(w02);
        textPaint4.setColor(org.telegram.ui.ActionBar.j6.r1(0.6f, org.telegram.ui.ActionBar.j6.w0(i17, e6Var)));
        int L = v01Var.J - org.telegram.messenger.g0.L(40.0f);
        CharSequence charSequence3 = "";
        String e12 = message != null ? org.telegram.messenger.hd.e1(message.date) : "";
        int ceil = (int) Math.ceil(textPaint.measureText(e12));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        u01Var.f = new StaticLayout(e12, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - org.telegram.messenger.g0.L(26.0f)) - u01Var.f.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - (u01Var.n ? org.telegram.messenger.g0.L(18.0f) : 0)) - (u01Var.r ? org.telegram.messenger.g0.L(19.0f) : 0);
        String replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i18 = (z12 || z10) ? 0 : 1;
        HashMap hashMap = v01Var.i0;
        if (message == null) {
            textPaint2 = textPaint4;
        } else {
            long j12 = ((message.id << 1) ^ (message.dialog_id * 31)) ^ i18;
            CharSequence charSequence4 = (CharSequence) hashMap.get(Long.valueOf(j12));
            if (charSequence4 != null) {
                textPaint2 = textPaint4;
                charSequence3 = charSequence4;
            } else {
                org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(i13, message, false, false);
                CharSequence charSequence5 = gjVar2.z;
                if (charSequence5 == null) {
                    charSequence5 = gjVar2.v;
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
                if (i18 != 0 && !gjVar2.k.out) {
                    long B1 = org.telegram.messenger.gj.B1(message.from_id);
                    if (B1 > 0) {
                        TLRPC.User a24 = org.telegram.messenger.np.s1(i12).a2(Long.valueOf(B1));
                        if (a24 != null) {
                            str3 = org.telegram.messenger.q10.j(a24, true);
                            if (!TextUtils.isEmpty(str3)) {
                                replace = TextUtils.concat(str3, ": ", replace);
                            }
                        }
                        str3 = null;
                        if (!TextUtils.isEmpty(str3)) {
                        }
                    } else {
                        if (B1 < 0 && B1 != j3 && (M0 = org.telegram.messenger.np.s1(i12).M0(Long.valueOf(-B1))) != null) {
                            str3 = M0.title;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (!TextUtils.isEmpty(str3)) {
                        }
                    }
                }
                charSequence3 = org.telegram.messenger.j6.m(replace, textPaint2.getFontMetricsInt(), false, null, 0);
                hashMap.put(Long.valueOf(j12), charSequence3);
            }
        }
        if (!TextUtils.isEmpty(v01Var.M)) {
            if (v01Var.g(s01Var)) {
                charSequence = org.telegram.messenger.g0.w1(replace2, v01Var.M, e6Var);
            } else {
                TLObject e10 = v01Var.e(s01Var);
                String n10 = e10 instanceof TLRPC.User ? org.telegram.messenger.q10.n((TLRPC.User) e10) : e10 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e10, false) : null;
                if (n10 != null && n10.toLowerCase().contains(v01Var.M)) {
                    StringBuilder sb2 = new StringBuilder("@");
                    TLObject e11 = v01Var.e(s01Var);
                    sb2.append(e11 instanceof TLRPC.User ? org.telegram.messenger.q10.n((TLRPC.User) e11) : e11 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e11, false) : null);
                    SpannableStringBuilder w12 = org.telegram.messenger.g0.w1(sb2.toString(), v01Var.M, e6Var);
                    if (w12 != null) {
                        String str5 = replace2;
                        charSequence2 = w12;
                        charSequence = str5;
                        CharSequence m10 = org.telegram.messenger.j6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
                        float max = Math.max(0, L2);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        u01Var.d = new StaticLayout(TextUtils.ellipsize(m10, textPaint5, max, truncateAt), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
                        String str6 = u01Var.h;
                        int L3 = L - (str6 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) v01Var.m0.measureText(str6)) : 0);
                        u01Var.e = ou0.c(charSequence2, textPaint2, Math.max(1, L3), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt, Math.max(1, L3), 2, true);
                        if (u01Var.n && u01Var.w == null) {
                            u01Var.w = u01Var.getContext().getDrawable(R.drawable.list_mute).mutate();
                        }
                        if (u01Var.r && u01Var.x == null) {
                            u01Var.x = u01Var.getContext().getDrawable(R.drawable.list_pin).mutate();
                        }
                        u01Var.requestLayout();
                        u01Var.invalidate();
                    }
                }
            }
        }
        charSequence = replace2;
        charSequence2 = charSequence3;
        CharSequence m102 = org.telegram.messenger.j6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
        float max2 = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        u01Var.d = new StaticLayout(TextUtils.ellipsize(m102, textPaint5, max2, truncateAt2), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str62 = u01Var.h;
        int L32 = L - (str62 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) v01Var.m0.measureText(str62)) : 0);
        u01Var.e = ou0.c(charSequence2, textPaint2, Math.max(1, L32), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt2, Math.max(1, L32), 2, true);
        if (u01Var.n) {
            u01Var.w = u01Var.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (u01Var.r) {
            u01Var.x = u01Var.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        u01Var.requestLayout();
        u01Var.invalidate();
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        u01 u01Var = new u01(this.e, viewGroup.getContext());
        u01Var.setLayoutParams(new v4.p0(-1, -2));
        return new cj0(u01Var);
    }
}
