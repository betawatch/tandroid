// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i0c extends c79 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final /* synthetic */ n0c e;

    public i0c(n0c n0cVar) {
        this.e = n0cVar;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return true;
    }

    public final void E(ArrayList arrayList, boolean z) {
        d79 d79Var = this.e.r;
        if (!z) {
            f();
            return;
        }
        boolean canScrollVertically = d79Var.canScrollVertically(-1);
        cy7.a(new ak3(this, arrayList, (byte) 5), true).c(this);
        if (canScrollVertically) {
            return;
        }
        d79Var.x0(0);
    }

    @Override // j79
    public final int b() {
        return this.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0361  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        TextPaint textPaint;
        TextPaint textPaint2;
        String str;
        TLRPC.Message message;
        int i2;
        TLRPC.Message message2;
        long j;
        CharSequence replace;
        CharSequence m;
        TLRPC.Chat M0;
        String str2;
        ArrayList arrayList = this.c;
        j0c j0cVar = (j0c) arrayList.get(i);
        m0c m0cVar = (m0c) f89Var.a;
        boolean z = i < arrayList.size() - 1;
        m0cVar.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = j0cVar.a;
        m0cVar.c = z;
        n0c n0cVar = m0cVar.y;
        int i3 = n0cVar.a;
        TextPaint textPaint3 = n0cVar.o0;
        boolean z2 = n0cVar.c;
        boolean z3 = n0cVar.d;
        TextPaint textPaint4 = n0cVar.p0;
        long j2 = n0cVar.b;
        TextPaint textPaint5 = n0cVar.n0;
        vnb vnbVar = n0cVar.e;
        uc7 s1 = uc7.s1(i3);
        de0 de0Var = m0cVar.a;
        de0Var.setAnimatedEmojiDrawable(null);
        de0Var.b();
        de0Var.setScaleX(1.0f);
        de0Var.setScaleY(1.0f);
        de0Var.setRoundRadius(0);
        int v0 = aob.v0(aob.y6, vnbVar);
        de0Var.setColorFilter(null);
        mt9 mt9Var = j0cVar.b;
        if (mt9Var != null) {
            String f = n0cVar.f(mt9Var.a);
            r47 r47Var = mt9Var.d;
            TLRPC.Message message3 = r47Var != null ? r47Var.k : null;
            i2 = (int) mt9Var.f;
            m0cVar.n = false;
            m0cVar.r = mt9Var.b;
            rb0 rb0Var = new rb0((vnb) null);
            de0Var.setRoundRadius(hl.L(10.0f));
            textPaint = textPaint4;
            textPaint2 = textPaint3;
            if (mt9Var.a == yac.h(i3).e()) {
                rb0Var.f(22);
                rb0Var.p = 0.38f;
                de0Var.setImageDrawable(rb0Var);
            } else {
                long j3 = mt9Var.a;
                if (j3 == 2666000) {
                    rb0Var.f(21);
                    rb0Var.p = 0.38f;
                    de0Var.setImageDrawable(rb0Var);
                } else {
                    TLObject X1 = j3 > 0 ? s1.X1(Long.valueOf(j3)) : s1.M0(Long.valueOf(-j3));
                    rb0Var.o(X1);
                    de0Var.f(X1, rb0Var);
                }
            }
            str = f;
            message2 = message3;
        } else {
            textPaint = textPaint4;
            textPaint2 = textPaint3;
            if (tL_forumTopic == null) {
                String M02 = ob6.M0(2131743639, null);
                if (z3) {
                    rb0 rb0Var2 = new rb0((vnb) null);
                    rb0Var2.f(1);
                    rb0Var2.p = 0.38f;
                    de0Var.setRoundRadius(hl.L(10.0f));
                    de0Var.setImageDrawable(rb0Var2);
                } else {
                    de0Var.setImageResource(R.drawable.other_chats);
                    de0Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                }
                ArrayList arrayList2 = (ArrayList) s1.S.f(j2);
                message2 = (arrayList2 == null || arrayList2.isEmpty()) ? null : ((r47) arrayList2.get(0)).k;
                TLRPC.Dialog dialog = (TLRPC.Dialog) s1.R.f(j2);
                int i4 = dialog != null ? dialog.unread_count : 0;
                m0cVar.n = s1.p2(n0cVar.b, 0L, null);
                m0cVar.r = false;
                str = M02;
                i2 = i4;
            } else {
                String str3 = tL_forumTopic.title;
                TLRPC.Message message4 = tL_forumTopic.topMessage;
                int i5 = tL_forumTopic.unread_count;
                str = str3;
                m0cVar.n = s1.p2(n0cVar.b, tL_forumTopic.id, null);
                m0cVar.r = tL_forumTopic.pinned;
                if (z2) {
                    long n = wf3.n(tL_forumTopic.from_id);
                    TLObject X12 = n > 0 ? s1.X1(Long.valueOf(n)) : s1.M0(Long.valueOf(-n));
                    rb0 rb0Var3 = new rb0((vnb) null);
                    rb0Var3.o(X12);
                    de0Var.setRoundRadius(hl.L(10.0f));
                    de0Var.f(X12, rb0Var3);
                    str = X12 instanceof TLRPC.User ? lbc.r((TLRPC.User) X12) : X12 instanceof TLRPC.Chat ? ((TLRPC.Chat) X12).title : str;
                    message2 = message4;
                    i2 = i5;
                } else {
                    if (tL_forumTopic.id == 1) {
                        de0Var.setImageResource(R.drawable.msg_filled_general);
                        de0Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                        message = message4;
                    } else {
                        long j4 = tL_forumTopic.icon_emoji_id;
                        if (j4 != 0) {
                            message = message4;
                            de0Var.setAnimatedEmojiDrawable(wl.m(yac.t0, j4, null, 3));
                        } else {
                            message = message4;
                            de0Var.setImageDrawable(ro4.f(tL_forumTopic));
                        }
                    }
                    i2 = i5;
                    message2 = message;
                }
            }
        }
        m0cVar.s = j0cVar.a() == n0cVar.L;
        m0cVar.h = i2 > 0 ? i2 > 999 ? "999+" : String.valueOf(i2) : null;
        int i6 = aob.G6;
        textPaint5.setColor(aob.v0(i6, vnbVar));
        textPaint2.setColor(v0);
        TextPaint textPaint6 = textPaint;
        textPaint6.setColor(aob.p1(0.6f, aob.v0(i6, vnbVar)));
        int L = n0cVar.J - hl.L(40.0f);
        String e1 = message2 != null ? ob6.e1(message2.date) : "";
        int ceil = (int) Math.ceil(textPaint2.measureText(e1));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        m0cVar.f = new StaticLayout(e1, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - hl.L(26.0f)) - m0cVar.f.getWidth()) - hl.L(6.0f)) - (m0cVar.n ? hl.L(18.0f) : 0)) - (m0cVar.r ? hl.L(19.0f) : 0);
        CharSequence replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i7 = (z2 || z3) ? 0 : 1;
        HashMap hashMap = n0cVar.m0;
        if (message2 == null) {
            m = "";
        } else {
            long j5 = ((message2.id << 1) ^ (message2.dialog_id * 31)) ^ i7;
            CharSequence charSequence = (CharSequence) hashMap.get(Long.valueOf(j5));
            if (charSequence != null) {
                m = charSequence;
            } else {
                r47 r47Var2 = new r47(i3, message2, false, false);
                CharSequence charSequence2 = r47Var2.z;
                if (charSequence2 == null) {
                    charSequence2 = r47Var2.v;
                }
                if (charSequence2 == null) {
                    j = j2;
                    replace = "";
                } else {
                    j = j2;
                    replace = charSequence2.toString().replace('\n', ' ');
                }
                if (i7 != 0 && !r47Var2.k.out) {
                    long B1 = r47.B1(message2.from_id);
                    if (B1 > 0) {
                        TLRPC.User X13 = uc7.s1(i3).X1(Long.valueOf(B1));
                        if (X13 != null) {
                            str2 = lbc.k(X13, true);
                            if (!TextUtils.isEmpty(str2)) {
                                replace = TextUtils.concat(str2, ": ", replace);
                            }
                        }
                        str2 = null;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    } else {
                        if (B1 < 0 && B1 != j && (M0 = uc7.s1(i3).M0(Long.valueOf(-B1))) != null) {
                            str2 = M0.title;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                        str2 = null;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    }
                }
                m = pv3.m(replace, textPaint6.getFontMetricsInt(), false, null, 0);
                hashMap.put(Long.valueOf(j5), m);
            }
        }
        if (!TextUtils.isEmpty(n0cVar.M)) {
            if (n0cVar.m(j0cVar)) {
                CharSequence u1 = hl.u1(replace2, n0cVar.M, vnbVar);
                if (u1 != null) {
                    replace2 = u1;
                }
            } else {
                TLObject e = n0cVar.e(j0cVar);
                String p = e instanceof TLRPC.User ? lbc.p((TLRPC.User) e) : e instanceof TLRPC.Chat ? xc2.K((TLRPC.Chat) e, false) : null;
                if (p != null && p.toLowerCase().contains(n0cVar.M)) {
                    StringBuilder sb = new StringBuilder("@");
                    TLObject e2 = n0cVar.e(j0cVar);
                    sb.append(e2 instanceof TLRPC.User ? lbc.p((TLRPC.User) e2) : e2 instanceof TLRPC.Chat ? xc2.K((TLRPC.Chat) e2, false) : null);
                    SpannableStringBuilder u12 = hl.u1(sb.toString(), n0cVar.M, vnbVar);
                    if (u12 != null) {
                        m = u12;
                    }
                }
            }
        }
        CharSequence m2 = pv3.m(replace2, textPaint5.getFontMetricsInt(), false, null, 0);
        float max = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        m0cVar.d = new StaticLayout(TextUtils.ellipsize(m2, textPaint5, max, truncateAt), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str4 = m0cVar.h;
        int measureText = L - (str4 != null ? ((int) n0cVar.q0.measureText(str4)) + hl.L(22.0f) : 0);
        m0cVar.e = o0b.c(m, textPaint6, Math.max(1, measureText), alignment, hl.L(1.0f), truncateAt, Math.max(1, measureText), 2, true);
        if (m0cVar.n && m0cVar.w == null) {
            m0cVar.w = m0cVar.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (m0cVar.r && m0cVar.x == null) {
            m0cVar.x = m0cVar.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        m0cVar.requestLayout();
        m0cVar.invalidate();
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        m0c m0cVar = new m0c(this.e, viewGroup.getContext());
        m0cVar.setLayoutParams(new r79(-1, -2));
        return new n69(m0cVar);
    }
}
