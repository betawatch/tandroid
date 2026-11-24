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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jyb extends q59 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final /* synthetic */ oyb e;

    public jyb(oyb oybVar) {
        this.e = oybVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return true;
    }

    public final void E(ArrayList arrayList, boolean z) {
        r59 r59Var = this.e.r;
        if (!z) {
            f();
            return;
        }
        boolean canScrollVertically = r59Var.canScrollVertically(-1);
        ww7.a(new tk3(this, arrayList, (byte) 5), true).c(this);
        if (canScrollVertically) {
            return;
        }
        r59Var.w0(0);
    }

    @Override // y59
    public final int b() {
        return this.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0361  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        TextPaint textPaint;
        TextPaint textPaint2;
        String str;
        TLRPC.Message message;
        int i2;
        TLRPC.Message message2;
        long j;
        CharSequence replace;
        CharSequence m;
        TLRPC.Chat L0;
        String str2;
        ArrayList arrayList = this.c;
        kyb kybVar = (kyb) arrayList.get(i);
        nyb nybVar = (nyb) u69Var.a;
        boolean z = i < arrayList.size() - 1;
        nybVar.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = kybVar.a;
        nybVar.c = z;
        oyb oybVar = nybVar.y;
        int i3 = oybVar.a;
        TextPaint textPaint3 = oybVar.o0;
        boolean z2 = oybVar.c;
        boolean z3 = oybVar.d;
        TextPaint textPaint4 = oybVar.p0;
        long j2 = oybVar.b;
        TextPaint textPaint5 = oybVar.n0;
        ylb ylbVar = oybVar.e;
        oc7 r1 = oc7.r1(i3);
        bf0 bf0Var = nybVar.a;
        bf0Var.setAnimatedEmojiDrawable(null);
        bf0Var.b();
        bf0Var.setScaleX(1.0f);
        bf0Var.setScaleY(1.0f);
        bf0Var.setRoundRadius(0);
        int v0 = cmb.v0(cmb.x6, ylbVar);
        bf0Var.setColorFilter(null);
        vr9 vr9Var = kybVar.b;
        if (vr9Var != null) {
            String f = oybVar.f(vr9Var.a);
            k47 k47Var = vr9Var.d;
            TLRPC.Message message3 = k47Var != null ? k47Var.k : null;
            i2 = (int) vr9Var.f;
            nybVar.n = false;
            nybVar.r = vr9Var.b;
            pc0 pc0Var = new pc0((ylb) null);
            bf0Var.setRoundRadius(gm.L(10.0f));
            textPaint = textPaint4;
            textPaint2 = textPaint3;
            if (vr9Var.a == z8c.h(i3).e()) {
                pc0Var.f(22);
                pc0Var.p = 0.38f;
                bf0Var.setImageDrawable(pc0Var);
            } else {
                long j3 = vr9Var.a;
                if (j3 == 2666000) {
                    pc0Var.f(21);
                    pc0Var.p = 0.38f;
                    bf0Var.setImageDrawable(pc0Var);
                } else {
                    TLObject W1 = j3 > 0 ? r1.W1(Long.valueOf(j3)) : r1.L0(Long.valueOf(-j3));
                    pc0Var.o(W1);
                    bf0Var.f(W1, pc0Var);
                }
            }
            str = f;
            message2 = message3;
        } else {
            textPaint = textPaint4;
            textPaint2 = textPaint3;
            if (tL_forumTopic == null) {
                String M0 = jb6.M0(2131743671, null);
                if (z3) {
                    pc0 pc0Var2 = new pc0((ylb) null);
                    pc0Var2.f(1);
                    pc0Var2.p = 0.38f;
                    bf0Var.setRoundRadius(gm.L(10.0f));
                    bf0Var.setImageDrawable(pc0Var2);
                } else {
                    bf0Var.setImageResource(R.drawable.other_chats);
                    bf0Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                }
                ArrayList arrayList2 = (ArrayList) r1.S.f(j2);
                message2 = (arrayList2 == null || arrayList2.isEmpty()) ? null : ((k47) arrayList2.get(0)).k;
                TLRPC.Dialog dialog = (TLRPC.Dialog) r1.R.f(j2);
                int i4 = dialog != null ? dialog.unread_count : 0;
                nybVar.n = r1.o2(oybVar.b, 0L, null);
                nybVar.r = false;
                str = M0;
                i2 = i4;
            } else {
                String str3 = tL_forumTopic.title;
                TLRPC.Message message4 = tL_forumTopic.topMessage;
                int i5 = tL_forumTopic.unread_count;
                str = str3;
                nybVar.n = r1.o2(oybVar.b, tL_forumTopic.id, null);
                nybVar.r = tL_forumTopic.pinned;
                if (z2) {
                    long n = pg3.n(tL_forumTopic.from_id);
                    TLObject W12 = n > 0 ? r1.W1(Long.valueOf(n)) : r1.L0(Long.valueOf(-n));
                    pc0 pc0Var3 = new pc0((ylb) null);
                    pc0Var3.o(W12);
                    bf0Var.setRoundRadius(gm.L(10.0f));
                    bf0Var.f(W12, pc0Var3);
                    str = W12 instanceof TLRPC.User ? m9c.r((TLRPC.User) W12) : W12 instanceof TLRPC.Chat ? ((TLRPC.Chat) W12).title : str;
                    message2 = message4;
                    i2 = i5;
                } else {
                    if (tL_forumTopic.id == 1) {
                        bf0Var.setImageResource(R.drawable.msg_filled_general);
                        bf0Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                        message = message4;
                    } else {
                        long j4 = tL_forumTopic.icon_emoji_id;
                        if (j4 != 0) {
                            message = message4;
                            bf0Var.setAnimatedEmojiDrawable(vm.m(z8c.t0, j4, null, 3));
                        } else {
                            message = message4;
                            bf0Var.setImageDrawable(no4.f(tL_forumTopic));
                        }
                    }
                    i2 = i5;
                    message2 = message;
                }
            }
        }
        nybVar.s = kybVar.a() == oybVar.L;
        nybVar.h = i2 > 0 ? i2 > 999 ? "999+" : String.valueOf(i2) : null;
        int i6 = cmb.F6;
        textPaint5.setColor(cmb.v0(i6, ylbVar));
        textPaint2.setColor(v0);
        TextPaint textPaint6 = textPaint;
        textPaint6.setColor(cmb.p1(0.6f, cmb.v0(i6, ylbVar)));
        int L = oybVar.J - gm.L(40.0f);
        String e1 = message2 != null ? jb6.e1(message2.date) : "";
        int ceil = (int) Math.ceil(textPaint2.measureText(e1));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        nybVar.f = new StaticLayout(e1, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - gm.L(26.0f)) - nybVar.f.getWidth()) - gm.L(6.0f)) - (nybVar.n ? gm.L(18.0f) : 0)) - (nybVar.r ? gm.L(19.0f) : 0);
        CharSequence replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i7 = (z2 || z3) ? 0 : 1;
        HashMap hashMap = oybVar.m0;
        if (message2 == null) {
            m = "";
        } else {
            long j5 = ((message2.id << 1) ^ (message2.dialog_id * 31)) ^ i7;
            CharSequence charSequence = (CharSequence) hashMap.get(Long.valueOf(j5));
            if (charSequence != null) {
                m = charSequence;
            } else {
                k47 k47Var2 = new k47(i3, message2, false, false);
                CharSequence charSequence2 = k47Var2.z;
                if (charSequence2 == null) {
                    charSequence2 = k47Var2.v;
                }
                if (charSequence2 == null) {
                    j = j2;
                    replace = "";
                } else {
                    j = j2;
                    replace = charSequence2.toString().replace('\n', ' ');
                }
                if (i7 != 0 && !k47Var2.k.out) {
                    long B1 = k47.B1(message2.from_id);
                    if (B1 > 0) {
                        TLRPC.User W13 = oc7.r1(i3).W1(Long.valueOf(B1));
                        if (W13 != null) {
                            str2 = m9c.k(W13, true);
                            if (!TextUtils.isEmpty(str2)) {
                                replace = TextUtils.concat(str2, ": ", replace);
                            }
                        }
                        str2 = null;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    } else {
                        if (B1 < 0 && B1 != j && (L0 = oc7.r1(i3).L0(Long.valueOf(-B1))) != null) {
                            str2 = L0.title;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                        str2 = null;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    }
                }
                m = gw3.m(replace, textPaint6.getFontMetricsInt(), false, null, 0);
                hashMap.put(Long.valueOf(j5), m);
            }
        }
        if (!TextUtils.isEmpty(oybVar.M)) {
            if (oybVar.m(kybVar)) {
                CharSequence u1 = gm.u1(replace2, oybVar.M, ylbVar);
                if (u1 != null) {
                    replace2 = u1;
                }
            } else {
                TLObject e = oybVar.e(kybVar);
                String p = e instanceof TLRPC.User ? m9c.p((TLRPC.User) e) : e instanceof TLRPC.Chat ? sd2.K((TLRPC.Chat) e, false) : null;
                if (p != null && p.toLowerCase().contains(oybVar.M)) {
                    StringBuilder sb = new StringBuilder("@");
                    TLObject e2 = oybVar.e(kybVar);
                    sb.append(e2 instanceof TLRPC.User ? m9c.p((TLRPC.User) e2) : e2 instanceof TLRPC.Chat ? sd2.K((TLRPC.Chat) e2, false) : null);
                    SpannableStringBuilder u12 = gm.u1(sb.toString(), oybVar.M, ylbVar);
                    if (u12 != null) {
                        m = u12;
                    }
                }
            }
        }
        CharSequence m2 = gw3.m(replace2, textPaint5.getFontMetricsInt(), false, null, 0);
        float max = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        nybVar.d = new StaticLayout(TextUtils.ellipsize(m2, textPaint5, max, truncateAt), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str4 = nybVar.h;
        int measureText = L - (str4 != null ? ((int) oybVar.q0.measureText(str4)) + gm.L(22.0f) : 0);
        nybVar.e = oya.c(m, textPaint6, Math.max(1, measureText), alignment, gm.L(1.0f), truncateAt, Math.max(1, measureText), 2, true);
        if (nybVar.n && nybVar.w == null) {
            nybVar.w = nybVar.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (nybVar.r && nybVar.x == null) {
            nybVar.x = nybVar.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        nybVar.requestLayout();
        nybVar.invalidate();
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        nyb nybVar = new nyb(this.e, viewGroup.getContext());
        nybVar.setLayoutParams(new g69(-1, -2));
        return new b59(nybVar);
    }
}
