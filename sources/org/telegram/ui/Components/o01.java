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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class o01 extends pj0 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final /* synthetic */ t01 e;

    public o01(t01 t01Var) {
        this.e = t01Var;
    }

    @Override // org.telegram.ui.Components.pj0
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override // v4.g0
    public final int b() {
        return this.c.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x03ae, code lost:
    
        if (r0 != null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0459  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        s01 s01Var;
        boolean z9;
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
        q01 q01Var = (q01) arrayList.get(i7);
        s01 s01Var2 = (s01) d1Var.a;
        boolean z10 = i7 < arrayList.size() - 1;
        s01Var2.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = q01Var.a;
        s01Var2.c = z10;
        t01 t01Var = s01Var2.y;
        int i13 = t01Var.a;
        TextPaint textPaint3 = t01Var.j0;
        boolean z11 = t01Var.c;
        boolean z12 = t01Var.d;
        TextPaint textPaint4 = t01Var.k0;
        long j3 = t01Var.b;
        TextPaint textPaint5 = t01Var.i0;
        org.telegram.ui.ActionBar.g6 g6Var = t01Var.e;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i13);
        l9 l9Var = s01Var2.a;
        l9Var.setAnimatedEmojiDrawable(null);
        l9Var.b();
        l9Var.setScaleX(1.0f);
        l9Var.setScaleY(1.0f);
        l9Var.setRoundRadius(0);
        int w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.y6, g6Var);
        l9Var.setColorFilter(null);
        org.telegram.messenger.uv uvVar = q01Var.b;
        if (uvVar != null) {
            String f10 = t01Var.f(uvVar.a);
            org.telegram.messenger.ij ijVar = uvVar.d;
            TLRPC.Message message3 = ijVar != null ? ijVar.k : null;
            int i14 = (int) uvVar.f;
            s01Var = s01Var2;
            s01Var.n = false;
            s01Var.r = uvVar.b;
            w8 w8Var = new w8((org.telegram.ui.ActionBar.g6) null);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
            z9 = z12;
            if (uvVar.a == org.telegram.messenger.p10.i(i13).e()) {
                w8Var.g(22);
                w8Var.p = 0.38f;
                l9Var.setImageDrawable(w8Var);
            } else {
                long j10 = uvVar.a;
                if (j10 == 2666000) {
                    w8Var.g(21);
                    w8Var.p = 0.38f;
                    l9Var.setImageDrawable(w8Var);
                } else {
                    TLObject a22 = j10 > 0 ? s12.a2(Long.valueOf(j10)) : s12.M0(Long.valueOf(-j10));
                    w8Var.p(a22);
                    l9Var.e(a22, w8Var);
                }
            }
            textPaint = textPaint3;
            message = message3;
            i11 = i14;
            str = f10;
        } else {
            s01Var = s01Var2;
            z9 = z12;
            if (tL_forumTopic == null) {
                String M02 = org.telegram.messenger.id.M0(2131743984, null);
                if (z9) {
                    w8 w8Var2 = new w8((org.telegram.ui.ActionBar.g6) null);
                    w8Var2.g(1);
                    w8Var2.p = 0.38f;
                    l9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    l9Var.setImageDrawable(w8Var2);
                } else {
                    l9Var.setImageResource(R.drawable.other_chats);
                    l9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                ArrayList arrayList2 = (ArrayList) s12.R.f(j3);
                TLRPC.Message message4 = (arrayList2 == null || arrayList2.isEmpty()) ? null : ((org.telegram.messenger.ij) arrayList2.get(0)).k;
                TLRPC.Dialog dialog = (TLRPC.Dialog) s12.Q.f(j3);
                int i15 = dialog != null ? dialog.unread_count : 0;
                s01Var.n = s12.r2(t01Var.b, 0L, null);
                s01Var.r = false;
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
                s01Var.n = s12.r2(t01Var.b, tL_forumTopic.id, null);
                s01Var.r = tL_forumTopic.pinned;
                if (z11) {
                    message = message5;
                    i10 = i16;
                    long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                    TLObject a23 = o4 > 0 ? s12.a2(Long.valueOf(o4)) : s12.M0(Long.valueOf(-o4));
                    w8 w8Var3 = new w8((org.telegram.ui.ActionBar.g6) null);
                    w8Var3.p(a23);
                    l9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    l9Var.e(a23, w8Var3);
                    if (a23 instanceof TLRPC.User) {
                        str2 = org.telegram.messenger.t10.p((TLRPC.User) a23);
                    } else if (a23 instanceof TLRPC.Chat) {
                        str2 = ((TLRPC.Chat) a23).title;
                    }
                    str = str2;
                    i11 = i10;
                } else {
                    message = message5;
                    i10 = i16;
                    if (tL_forumTopic.id == 1) {
                        l9Var.setImageResource(R.drawable.msg_filled_general);
                        l9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    } else {
                        long j11 = tL_forumTopic.icon_emoji_id;
                        if (j11 != 0) {
                            message2 = message;
                            l9Var.setAnimatedEmojiDrawable(i5.m(org.telegram.messenger.p10.s0, j11, null, 3));
                        } else {
                            message2 = message;
                            l9Var.setImageDrawable(qg.d.e(tL_forumTopic));
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
        s01Var.s = q01Var.a() == t01Var.K;
        s01Var.h = i11 > 0 ? i11 > 999 ? "999+" : String.valueOf(i11) : null;
        int i17 = org.telegram.ui.ActionBar.l6.G6;
        textPaint5.setColor(org.telegram.ui.ActionBar.l6.w0(i17, g6Var));
        textPaint.setColor(w02);
        textPaint4.setColor(org.telegram.ui.ActionBar.l6.r1(0.6f, org.telegram.ui.ActionBar.l6.w0(i17, g6Var)));
        int L = t01Var.I - org.telegram.messenger.g0.L(40.0f);
        CharSequence charSequence3 = "";
        String e12 = message != null ? org.telegram.messenger.id.e1(message.date) : "";
        int ceil = (int) Math.ceil(textPaint.measureText(e12));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        s01Var.f = new StaticLayout(e12, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - org.telegram.messenger.g0.L(26.0f)) - s01Var.f.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - (s01Var.n ? org.telegram.messenger.g0.L(18.0f) : 0)) - (s01Var.r ? org.telegram.messenger.g0.L(19.0f) : 0);
        String replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i18 = (z11 || z9) ? 0 : 1;
        HashMap hashMap = t01Var.h0;
        if (message == null) {
            textPaint2 = textPaint4;
        } else {
            long j12 = ((message.id << 1) ^ (message.dialog_id * 31)) ^ i18;
            CharSequence charSequence4 = (CharSequence) hashMap.get(Long.valueOf(j12));
            if (charSequence4 != null) {
                textPaint2 = textPaint4;
                charSequence3 = charSequence4;
            } else {
                org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(i13, message, false, false);
                CharSequence charSequence5 = ijVar2.z;
                if (charSequence5 == null) {
                    charSequence5 = ijVar2.v;
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
                if (i18 != 0 && !ijVar2.k.out) {
                    long B1 = org.telegram.messenger.ij.B1(message.from_id);
                    if (B1 > 0) {
                        TLRPC.User a24 = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(B1));
                        if (a24 != null) {
                            str3 = org.telegram.messenger.t10.j(a24, true);
                            if (!TextUtils.isEmpty(str3)) {
                                replace = TextUtils.concat(str3, ": ", replace);
                            }
                        }
                        str3 = null;
                        if (!TextUtils.isEmpty(str3)) {
                        }
                    } else {
                        if (B1 < 0 && B1 != j3 && (M0 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-B1))) != null) {
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
                hashMap.put(Long.valueOf(j12), charSequence3);
            }
        }
        if (!TextUtils.isEmpty(t01Var.L)) {
            if (t01Var.g(q01Var)) {
                charSequence = org.telegram.messenger.g0.w1(replace2, t01Var.L, g6Var);
            } else {
                TLObject e10 = t01Var.e(q01Var);
                String n10 = e10 instanceof TLRPC.User ? org.telegram.messenger.t10.n((TLRPC.User) e10) : e10 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e10, false) : null;
                if (n10 != null && n10.toLowerCase().contains(t01Var.L)) {
                    StringBuilder sb2 = new StringBuilder("@");
                    TLObject e11 = t01Var.e(q01Var);
                    sb2.append(e11 instanceof TLRPC.User ? org.telegram.messenger.t10.n((TLRPC.User) e11) : e11 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e11, false) : null);
                    SpannableStringBuilder w12 = org.telegram.messenger.g0.w1(sb2.toString(), t01Var.L, g6Var);
                    if (w12 != null) {
                        String str5 = replace2;
                        charSequence2 = w12;
                        charSequence = str5;
                        CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
                        float max = Math.max(0, L2);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        s01Var.d = new StaticLayout(TextUtils.ellipsize(m10, textPaint5, max, truncateAt), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
                        String str6 = s01Var.h;
                        int L3 = L - (str6 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) t01Var.l0.measureText(str6)) : 0);
                        s01Var.e = ou0.c(charSequence2, textPaint2, Math.max(1, L3), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt, Math.max(1, L3), 2, true);
                        if (s01Var.n && s01Var.w == null) {
                            s01Var.w = s01Var.getContext().getDrawable(R.drawable.list_mute).mutate();
                        }
                        if (s01Var.r && s01Var.x == null) {
                            s01Var.x = s01Var.getContext().getDrawable(R.drawable.list_pin).mutate();
                        }
                        s01Var.requestLayout();
                        s01Var.invalidate();
                    }
                }
            }
        }
        charSequence = replace2;
        charSequence2 = charSequence3;
        CharSequence m102 = org.telegram.messenger.i6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
        float max2 = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        s01Var.d = new StaticLayout(TextUtils.ellipsize(m102, textPaint5, max2, truncateAt2), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str62 = s01Var.h;
        int L32 = L - (str62 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) t01Var.l0.measureText(str62)) : 0);
        s01Var.e = ou0.c(charSequence2, textPaint2, Math.max(1, L32), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt2, Math.max(1, L32), 2, true);
        if (s01Var.n) {
            s01Var.w = s01Var.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (s01Var.r) {
            s01Var.x = s01Var.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        s01Var.requestLayout();
        s01Var.invalidate();
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        s01 s01Var = new s01(this.e, viewGroup.getContext());
        s01Var.setLayoutParams(new v4.o0(-1, -2));
        return new yi0(s01Var);
    }
}
