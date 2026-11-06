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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class n01 extends oj0 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final /* synthetic */ s01 e;

    public n01(s01 s01Var) {
        this.e = s01Var;
    }

    @Override // org.telegram.ui.Components.oj0
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
        r01 r01Var;
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
        p01 p01Var = (p01) arrayList.get(i7);
        r01 r01Var2 = (r01) d1Var.a;
        boolean z10 = i7 < arrayList.size() - 1;
        r01Var2.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = p01Var.a;
        r01Var2.c = z10;
        s01 s01Var = r01Var2.y;
        int i13 = s01Var.a;
        TextPaint textPaint3 = s01Var.j0;
        boolean z11 = s01Var.c;
        boolean z12 = s01Var.d;
        TextPaint textPaint4 = s01Var.k0;
        long j3 = s01Var.b;
        TextPaint textPaint5 = s01Var.i0;
        org.telegram.ui.ActionBar.f6 f6Var = s01Var.e;
        org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i13);
        l9 l9Var = r01Var2.a;
        l9Var.setAnimatedEmojiDrawable(null);
        l9Var.b();
        l9Var.setScaleX(1.0f);
        l9Var.setScaleY(1.0f);
        l9Var.setRoundRadius(0);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, f6Var);
        l9Var.setColorFilter(null);
        org.telegram.messenger.uv uvVar = p01Var.b;
        if (uvVar != null) {
            String f10 = s01Var.f(uvVar.a);
            org.telegram.messenger.ij ijVar = uvVar.d;
            TLRPC.Message message3 = ijVar != null ? ijVar.k : null;
            int i14 = (int) uvVar.f;
            r01Var = r01Var2;
            r01Var.n = false;
            r01Var.r = uvVar.b;
            w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
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
            r01Var = r01Var2;
            z9 = z12;
            if (tL_forumTopic == null) {
                String M02 = org.telegram.messenger.hd.M0(2131743985, null);
                if (z9) {
                    w8 w8Var2 = new w8((org.telegram.ui.ActionBar.f6) null);
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
                r01Var.n = s12.r2(s01Var.b, 0L, null);
                r01Var.r = false;
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
                r01Var.n = s12.r2(s01Var.b, tL_forumTopic.id, null);
                r01Var.r = tL_forumTopic.pinned;
                if (z11) {
                    message = message5;
                    i10 = i16;
                    long o4 = org.telegram.messenger.m5.o(tL_forumTopic.from_id);
                    TLObject a23 = o4 > 0 ? s12.a2(Long.valueOf(o4)) : s12.M0(Long.valueOf(-o4));
                    w8 w8Var3 = new w8((org.telegram.ui.ActionBar.f6) null);
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
        r01Var.s = p01Var.a() == s01Var.K;
        r01Var.h = i11 > 0 ? i11 > 999 ? "999+" : String.valueOf(i11) : null;
        int i17 = org.telegram.ui.ActionBar.k6.G6;
        textPaint5.setColor(org.telegram.ui.ActionBar.k6.w0(i17, f6Var));
        textPaint.setColor(w02);
        textPaint4.setColor(org.telegram.ui.ActionBar.k6.r1(0.6f, org.telegram.ui.ActionBar.k6.w0(i17, f6Var)));
        int L = s01Var.I - org.telegram.messenger.g0.L(40.0f);
        CharSequence charSequence3 = "";
        String e12 = message != null ? org.telegram.messenger.hd.e1(message.date) : "";
        int ceil = (int) Math.ceil(textPaint.measureText(e12));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        r01Var.f = new StaticLayout(e12, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - org.telegram.messenger.g0.L(26.0f)) - r01Var.f.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - (r01Var.n ? org.telegram.messenger.g0.L(18.0f) : 0)) - (r01Var.r ? org.telegram.messenger.g0.L(19.0f) : 0);
        String replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i18 = (z11 || z9) ? 0 : 1;
        HashMap hashMap = s01Var.h0;
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
                    long C1 = org.telegram.messenger.ij.C1(message.from_id);
                    if (C1 > 0) {
                        TLRPC.User a24 = org.telegram.messenger.qp.s1(i12).a2(Long.valueOf(C1));
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
                        if (C1 < 0 && C1 != j3 && (M0 = org.telegram.messenger.qp.s1(i12).M0(Long.valueOf(-C1))) != null) {
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
        if (!TextUtils.isEmpty(s01Var.L)) {
            if (s01Var.g(p01Var)) {
                charSequence = org.telegram.messenger.g0.w1(replace2, s01Var.L, f6Var);
            } else {
                TLObject e10 = s01Var.e(p01Var);
                String n10 = e10 instanceof TLRPC.User ? org.telegram.messenger.t10.n((TLRPC.User) e10) : e10 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e10, false) : null;
                if (n10 != null && n10.toLowerCase().contains(s01Var.L)) {
                    StringBuilder sb2 = new StringBuilder("@");
                    TLObject e11 = s01Var.e(p01Var);
                    sb2.append(e11 instanceof TLRPC.User ? org.telegram.messenger.t10.n((TLRPC.User) e11) : e11 instanceof TLRPC.Chat ? org.telegram.messenger.t3.K((TLRPC.Chat) e11, false) : null);
                    SpannableStringBuilder w12 = org.telegram.messenger.g0.w1(sb2.toString(), s01Var.L, f6Var);
                    if (w12 != null) {
                        String str5 = replace2;
                        charSequence2 = w12;
                        charSequence = str5;
                        CharSequence m10 = org.telegram.messenger.i6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
                        float max = Math.max(0, L2);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        r01Var.d = new StaticLayout(TextUtils.ellipsize(m10, textPaint5, max, truncateAt), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
                        String str6 = r01Var.h;
                        int L3 = L - (str6 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) s01Var.l0.measureText(str6)) : 0);
                        r01Var.e = mu0.c(charSequence2, textPaint2, Math.max(1, L3), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt, Math.max(1, L3), 2, true);
                        if (r01Var.n && r01Var.w == null) {
                            r01Var.w = r01Var.getContext().getDrawable(R.drawable.list_mute).mutate();
                        }
                        if (r01Var.r && r01Var.x == null) {
                            r01Var.x = r01Var.getContext().getDrawable(R.drawable.list_pin).mutate();
                        }
                        r01Var.requestLayout();
                        r01Var.invalidate();
                    }
                }
            }
        }
        charSequence = replace2;
        charSequence2 = charSequence3;
        CharSequence m102 = org.telegram.messenger.i6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
        float max2 = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        r01Var.d = new StaticLayout(TextUtils.ellipsize(m102, textPaint5, max2, truncateAt2), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str62 = r01Var.h;
        int L32 = L - (str62 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) s01Var.l0.measureText(str62)) : 0);
        r01Var.e = mu0.c(charSequence2, textPaint2, Math.max(1, L32), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt2, Math.max(1, L32), 2, true);
        if (r01Var.n) {
            r01Var.w = r01Var.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (r01Var.r) {
            r01Var.x = r01Var.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        r01Var.requestLayout();
        r01Var.invalidate();
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        r01 r01Var = new r01(this.e, viewGroup.getContext());
        r01Var.setLayoutParams(new v4.o0(-1, -2));
        return new xi0(r01Var);
    }
}
