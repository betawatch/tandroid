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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a11 extends bk0 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final /* synthetic */ f11 e;

    public a11(f11 f11Var) {
        this.e = f11Var;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    public final void E(ArrayList arrayList, boolean z10) {
        ck0 ck0Var = this.e.r;
        if (!z10) {
            f();
            return;
        }
        boolean canScrollVertically = ck0Var.canScrollVertically(-1);
        v4.o.c(new jg.g(this, arrayList, 3), true).c(this);
        if (canScrollVertically) {
            return;
        }
        ck0Var.v0(0);
    }

    @Override // v4.i0
    public final int b() {
        return this.c.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x03ae, code lost:
    
        if (r0 != null) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0459  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        e11 e11Var;
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
        TLRPC.Chat O0;
        String str3;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList = this.c;
        b11 b11Var = (b11) arrayList.get(i7);
        e11 e11Var2 = (e11) f1Var.a;
        boolean z11 = i7 < arrayList.size() - 1;
        e11Var2.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = b11Var.a;
        e11Var2.c = z11;
        f11 f11Var = e11Var2.y;
        int i13 = f11Var.a;
        TextPaint textPaint3 = f11Var.o0;
        boolean z12 = f11Var.c;
        boolean z13 = f11Var.d;
        TextPaint textPaint4 = f11Var.p0;
        long j3 = f11Var.b;
        TextPaint textPaint5 = f11Var.n0;
        org.telegram.ui.ActionBar.i6 i6Var = f11Var.e;
        org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i13);
        q9 q9Var = e11Var2.a;
        q9Var.setAnimatedEmojiDrawable(null);
        q9Var.b();
        q9Var.setScaleX(1.0f);
        q9Var.setScaleY(1.0f);
        q9Var.setRoundRadius(0);
        int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.y6, i6Var);
        q9Var.setColorFilter(null);
        org.telegram.messenger.ov ovVar = b11Var.b;
        if (ovVar != null) {
            String g10 = f11Var.g(ovVar.a);
            org.telegram.messenger.fj fjVar = ovVar.d;
            TLRPC.Message message3 = fjVar != null ? fjVar.k : null;
            int i14 = (int) ovVar.f;
            e11Var = e11Var2;
            e11Var.n = false;
            e11Var.r = ovVar.b;
            b9 b9Var = new b9((org.telegram.ui.ActionBar.i6) null);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
            z10 = z13;
            if (ovVar.a == org.telegram.messenger.j10.i(i13).e()) {
                b9Var.g(22);
                b9Var.p = 0.38f;
                q9Var.setImageDrawable(b9Var);
            } else {
                long j10 = ovVar.a;
                if (j10 == 2666000) {
                    b9Var.g(21);
                    b9Var.p = 0.38f;
                    q9Var.setImageDrawable(b9Var);
                } else {
                    TLObject c22 = j10 > 0 ? u12.c2(Long.valueOf(j10)) : u12.O0(Long.valueOf(-j10));
                    b9Var.p(c22);
                    q9Var.f(c22, b9Var);
                }
            }
            textPaint = textPaint3;
            message = message3;
            i11 = i14;
            str = g10;
        } else {
            e11Var = e11Var2;
            z10 = z13;
            if (tL_forumTopic == null) {
                String M0 = org.telegram.messenger.gd.M0(2131743747, null);
                if (z10) {
                    b9 b9Var2 = new b9((org.telegram.ui.ActionBar.i6) null);
                    b9Var2.g(1);
                    b9Var2.p = 0.38f;
                    q9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    q9Var.setImageDrawable(b9Var2);
                } else {
                    q9Var.setImageResource(R.drawable.other_chats);
                    q9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                }
                ArrayList arrayList2 = (ArrayList) u12.S.f(j3);
                TLRPC.Message message4 = (arrayList2 == null || arrayList2.isEmpty()) ? null : ((org.telegram.messenger.fj) arrayList2.get(0)).k;
                TLRPC.Dialog dialog = (TLRPC.Dialog) u12.R.f(j3);
                int i15 = dialog != null ? dialog.unread_count : 0;
                e11Var.n = u12.u2(f11Var.b, 0L, null);
                e11Var.r = false;
                str = M0;
                textPaint = textPaint3;
                message = message4;
                i11 = i15;
            } else {
                String str4 = tL_forumTopic.title;
                TLRPC.Message message5 = tL_forumTopic.topMessage;
                int i16 = tL_forumTopic.unread_count;
                textPaint = textPaint3;
                str = str4;
                e11Var.n = u12.u2(f11Var.b, tL_forumTopic.id, null);
                e11Var.r = tL_forumTopic.pinned;
                if (z12) {
                    message = message5;
                    i10 = i16;
                    long o4 = org.telegram.messenger.n5.o(tL_forumTopic.from_id);
                    TLObject c23 = o4 > 0 ? u12.c2(Long.valueOf(o4)) : u12.O0(Long.valueOf(-o4));
                    b9 b9Var3 = new b9((org.telegram.ui.ActionBar.i6) null);
                    b9Var3.p(c23);
                    q9Var.setRoundRadius(org.telegram.messenger.g0.L(10.0f));
                    q9Var.f(c23, b9Var3);
                    if (c23 instanceof TLRPC.User) {
                        str2 = org.telegram.messenger.o10.q((TLRPC.User) c23);
                    } else if (c23 instanceof TLRPC.Chat) {
                        str2 = ((TLRPC.Chat) c23).title;
                    }
                    str = str2;
                    i11 = i10;
                } else {
                    message = message5;
                    i10 = i16;
                    if (tL_forumTopic.id == 1) {
                        q9Var.setImageResource(R.drawable.msg_filled_general);
                        q9Var.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
                    } else {
                        long j11 = tL_forumTopic.icon_emoji_id;
                        if (j11 != 0) {
                            message2 = message;
                            q9Var.setAnimatedEmojiDrawable(o5.m(org.telegram.messenger.j10.t0, j11, null, 3));
                        } else {
                            message2 = message;
                            q9Var.setImageDrawable(qg.c.f(tL_forumTopic));
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
        e11Var.s = b11Var.a() == f11Var.L;
        e11Var.h = i11 > 0 ? i11 > 999 ? "999+" : String.valueOf(i11) : null;
        int i17 = org.telegram.ui.ActionBar.n6.G6;
        textPaint5.setColor(org.telegram.ui.ActionBar.n6.w0(i17, i6Var));
        textPaint.setColor(w02);
        textPaint4.setColor(org.telegram.ui.ActionBar.n6.r1(0.6f, org.telegram.ui.ActionBar.n6.w0(i17, i6Var)));
        int L = f11Var.J - org.telegram.messenger.g0.L(40.0f);
        CharSequence charSequence3 = "";
        String e12 = message != null ? org.telegram.messenger.gd.e1(message.date) : "";
        int ceil = (int) Math.ceil(textPaint.measureText(e12));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        e11Var.f = new StaticLayout(e12, textPaint, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - org.telegram.messenger.g0.L(26.0f)) - e11Var.f.getWidth()) - org.telegram.messenger.g0.L(6.0f)) - (e11Var.n ? org.telegram.messenger.g0.L(18.0f) : 0)) - (e11Var.r ? org.telegram.messenger.g0.L(19.0f) : 0);
        String replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i18 = (z12 || z10) ? 0 : 1;
        HashMap hashMap = f11Var.m0;
        if (message == null) {
            textPaint2 = textPaint4;
        } else {
            long j12 = ((message.id << 1) ^ (message.dialog_id * 31)) ^ i18;
            CharSequence charSequence4 = (CharSequence) hashMap.get(Long.valueOf(j12));
            if (charSequence4 != null) {
                textPaint2 = textPaint4;
                charSequence3 = charSequence4;
            } else {
                org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(i13, message, false, false);
                CharSequence charSequence5 = fjVar2.z;
                if (charSequence5 == null) {
                    charSequence5 = fjVar2.v;
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
                if (i18 != 0 && !fjVar2.k.out) {
                    long B1 = org.telegram.messenger.fj.B1(message.from_id);
                    if (B1 > 0) {
                        TLRPC.User c24 = org.telegram.messenger.mp.u1(i12).c2(Long.valueOf(B1));
                        if (c24 != null) {
                            str3 = org.telegram.messenger.o10.k(c24, true);
                            if (!TextUtils.isEmpty(str3)) {
                                replace = TextUtils.concat(str3, ": ", replace);
                            }
                        }
                        str3 = null;
                        if (!TextUtils.isEmpty(str3)) {
                        }
                    } else {
                        if (B1 < 0 && B1 != j3 && (O0 = org.telegram.messenger.mp.u1(i12).O0(Long.valueOf(-B1))) != null) {
                            str3 = O0.title;
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
        if (!TextUtils.isEmpty(f11Var.M)) {
            if (f11Var.m(b11Var)) {
                charSequence = org.telegram.messenger.g0.w1(replace2, f11Var.M, i6Var);
            } else {
                TLObject f10 = f11Var.f(b11Var);
                String o10 = f10 instanceof TLRPC.User ? org.telegram.messenger.o10.o((TLRPC.User) f10) : f10 instanceof TLRPC.Chat ? org.telegram.messenger.v3.K((TLRPC.Chat) f10, false) : null;
                if (o10 != null && o10.toLowerCase().contains(f11Var.M)) {
                    StringBuilder sb2 = new StringBuilder("@");
                    TLObject f11 = f11Var.f(b11Var);
                    sb2.append(f11 instanceof TLRPC.User ? org.telegram.messenger.o10.o((TLRPC.User) f11) : f11 instanceof TLRPC.Chat ? org.telegram.messenger.v3.K((TLRPC.Chat) f11, false) : null);
                    SpannableStringBuilder w12 = org.telegram.messenger.g0.w1(sb2.toString(), f11Var.M, i6Var);
                    if (w12 != null) {
                        String str5 = replace2;
                        charSequence2 = w12;
                        charSequence = str5;
                        CharSequence m10 = org.telegram.messenger.j6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
                        float max = Math.max(0, L2);
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                        e11Var.d = new StaticLayout(TextUtils.ellipsize(m10, textPaint5, max, truncateAt), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
                        String str6 = e11Var.h;
                        int L3 = L - (str6 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) f11Var.q0.measureText(str6)) : 0);
                        e11Var.e = wu0.c(charSequence2, textPaint2, Math.max(1, L3), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt, Math.max(1, L3), 2, true);
                        if (e11Var.n && e11Var.w == null) {
                            e11Var.w = e11Var.getContext().getDrawable(R.drawable.list_mute).mutate();
                        }
                        if (e11Var.r && e11Var.x == null) {
                            e11Var.x = e11Var.getContext().getDrawable(R.drawable.list_pin).mutate();
                        }
                        e11Var.requestLayout();
                        e11Var.invalidate();
                    }
                }
            }
        }
        charSequence = replace2;
        charSequence2 = charSequence3;
        CharSequence m102 = org.telegram.messenger.j6.m(charSequence, textPaint5.getFontMetricsInt(), false, null, 0);
        float max2 = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
        e11Var.d = new StaticLayout(TextUtils.ellipsize(m102, textPaint5, max2, truncateAt2), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str62 = e11Var.h;
        int L32 = L - (str62 == null ? org.telegram.messenger.g0.L(22.0f) + ((int) f11Var.q0.measureText(str62)) : 0);
        e11Var.e = wu0.c(charSequence2, textPaint2, Math.max(1, L32), alignment, org.telegram.messenger.g0.L(1.0f), truncateAt2, Math.max(1, L32), 2, true);
        if (e11Var.n) {
            e11Var.w = e11Var.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (e11Var.r) {
            e11Var.x = e11Var.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        e11Var.requestLayout();
        e11Var.invalidate();
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        e11 e11Var = new e11(this.e, viewGroup.getContext());
        e11Var.setLayoutParams(new v4.q0(-1, -2));
        return new kj0(e11Var);
    }
}
