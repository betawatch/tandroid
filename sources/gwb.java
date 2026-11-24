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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class gwb extends n39 {
    public final ArrayList c = new ArrayList();
    public String d;
    public final /* synthetic */ lwb e;

    public gwb(lwb lwbVar) {
        this.e = lwbVar;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    public final void E(ArrayList arrayList, boolean z) {
        o39 o39Var = this.e.r;
        if (!z) {
            f();
            return;
        }
        boolean canScrollVertically = o39Var.canScrollVertically(-1);
        vu7.a(new ij3(this, arrayList, (byte) 5), true).c(this);
        if (canScrollVertically) {
            return;
        }
        o39Var.w0(0);
    }

    @Override // w39
    public final int b() {
        return this.c.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0361  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        TextPaint textPaint;
        TextPaint textPaint2;
        String str;
        TLRPC.Message message;
        int i2;
        TLRPC.Message message2;
        long j;
        CharSequence replace;
        CharSequence m;
        TLRPC.Chat K0;
        String str2;
        ArrayList arrayList = this.c;
        hwb hwbVar = (hwb) arrayList.get(i);
        kwb kwbVar = (kwb) s49Var.a;
        boolean z = i < arrayList.size() - 1;
        kwbVar.getClass();
        TLRPC.TL_forumTopic tL_forumTopic = hwbVar.a;
        kwbVar.c = z;
        lwb lwbVar = kwbVar.y;
        int i3 = lwbVar.a;
        TextPaint textPaint3 = lwbVar.o0;
        boolean z2 = lwbVar.c;
        boolean z3 = lwbVar.d;
        TextPaint textPaint4 = lwbVar.p0;
        long j2 = lwbVar.b;
        TextPaint textPaint5 = lwbVar.n0;
        wjb wjbVar = lwbVar.e;
        na7 q1 = na7.q1(i3);
        be0 be0Var = kwbVar.a;
        be0Var.setAnimatedEmojiDrawable(null);
        be0Var.b();
        be0Var.setScaleX(1.0f);
        be0Var.setScaleY(1.0f);
        be0Var.setRoundRadius(0);
        int v0 = bkb.v0(bkb.x6, wjbVar);
        be0Var.setColorFilter(null);
        up9 up9Var = hwbVar.b;
        if (up9Var != null) {
            String f = lwbVar.f(up9Var.a);
            k27 k27Var = up9Var.d;
            TLRPC.Message message3 = k27Var != null ? k27Var.k : null;
            i2 = (int) up9Var.f;
            kwbVar.n = false;
            kwbVar.r = up9Var.b;
            pb0 pb0Var = new pb0((wjb) null);
            be0Var.setRoundRadius(gl.L(10.0f));
            textPaint = textPaint4;
            textPaint2 = textPaint3;
            if (up9Var.a == y6c.h(i3).e()) {
                pb0Var.f(22);
                pb0Var.p = 0.38f;
                be0Var.setImageDrawable(pb0Var);
            } else {
                long j3 = up9Var.a;
                if (j3 == 2666000) {
                    pb0Var.f(21);
                    pb0Var.p = 0.38f;
                    be0Var.setImageDrawable(pb0Var);
                } else {
                    TLObject V1 = j3 > 0 ? q1.V1(Long.valueOf(j3)) : q1.K0(Long.valueOf(-j3));
                    pb0Var.o(V1);
                    be0Var.f(V1, pb0Var);
                }
            }
            str = f;
            message2 = message3;
        } else {
            textPaint = textPaint4;
            textPaint2 = textPaint3;
            if (tL_forumTopic == null) {
                String M0 = k96.M0(2131743745, null);
                if (z3) {
                    pb0 pb0Var2 = new pb0((wjb) null);
                    pb0Var2.f(1);
                    pb0Var2.p = 0.38f;
                    be0Var.setRoundRadius(gl.L(10.0f));
                    be0Var.setImageDrawable(pb0Var2);
                } else {
                    be0Var.setImageResource(R.drawable.other_chats);
                    be0Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                }
                ArrayList arrayList2 = (ArrayList) q1.S.f(j2);
                message2 = (arrayList2 == null || arrayList2.isEmpty()) ? null : ((k27) arrayList2.get(0)).k;
                TLRPC.Dialog dialog = (TLRPC.Dialog) q1.R.f(j2);
                int i4 = dialog != null ? dialog.unread_count : 0;
                kwbVar.n = q1.n2(lwbVar.b, 0L, null);
                kwbVar.r = false;
                str = M0;
                i2 = i4;
            } else {
                String str3 = tL_forumTopic.title;
                TLRPC.Message message4 = tL_forumTopic.topMessage;
                int i5 = tL_forumTopic.unread_count;
                str = str3;
                kwbVar.n = q1.n2(lwbVar.b, tL_forumTopic.id, null);
                kwbVar.r = tL_forumTopic.pinned;
                if (z2) {
                    long n = cf3.n(tL_forumTopic.from_id);
                    TLObject V12 = n > 0 ? q1.V1(Long.valueOf(n)) : q1.K0(Long.valueOf(-n));
                    pb0 pb0Var3 = new pb0((wjb) null);
                    pb0Var3.o(V12);
                    be0Var.setRoundRadius(gl.L(10.0f));
                    be0Var.f(V12, pb0Var3);
                    str = V12 instanceof TLRPC.User ? l7c.q((TLRPC.User) V12) : V12 instanceof TLRPC.Chat ? ((TLRPC.Chat) V12).title : str;
                    message2 = message4;
                    i2 = i5;
                } else {
                    if (tL_forumTopic.id == 1) {
                        be0Var.setImageResource(R.drawable.msg_filled_general);
                        be0Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
                        message = message4;
                    } else {
                        long j4 = tL_forumTopic.icon_emoji_id;
                        if (j4 != 0) {
                            message = message4;
                            be0Var.setAnimatedEmojiDrawable(vl.m(y6c.t0, j4, null, 3));
                        } else {
                            message = message4;
                            be0Var.setImageDrawable(mm4.f(tL_forumTopic));
                        }
                    }
                    i2 = i5;
                    message2 = message;
                }
            }
        }
        kwbVar.s = hwbVar.a() == lwbVar.L;
        kwbVar.h = i2 > 0 ? i2 > 999 ? "999+" : String.valueOf(i2) : null;
        int i6 = bkb.F6;
        textPaint5.setColor(bkb.v0(i6, wjbVar));
        textPaint2.setColor(v0);
        TextPaint textPaint6 = textPaint;
        textPaint6.setColor(bkb.p1(0.6f, bkb.v0(i6, wjbVar)));
        int L = lwbVar.J - gl.L(40.0f);
        String e1 = message2 != null ? k96.e1(message2.date) : "";
        int ceil = (int) Math.ceil(textPaint2.measureText(e1));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        kwbVar.f = new StaticLayout(e1, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
        int L2 = ((((L - gl.L(26.0f)) - kwbVar.f.getWidth()) - gl.L(6.0f)) - (kwbVar.n ? gl.L(18.0f) : 0)) - (kwbVar.r ? gl.L(19.0f) : 0);
        CharSequence replace2 = str == null ? "" : str.toString().replace('\n', ' ');
        int i7 = (z2 || z3) ? 0 : 1;
        HashMap hashMap = lwbVar.m0;
        if (message2 == null) {
            m = "";
        } else {
            long j5 = ((message2.id << 1) ^ (message2.dialog_id * 31)) ^ i7;
            CharSequence charSequence = (CharSequence) hashMap.get(Long.valueOf(j5));
            if (charSequence != null) {
                m = charSequence;
            } else {
                k27 k27Var2 = new k27(i3, message2, false, false);
                CharSequence charSequence2 = k27Var2.z;
                if (charSequence2 == null) {
                    charSequence2 = k27Var2.v;
                }
                if (charSequence2 == null) {
                    j = j2;
                    replace = "";
                } else {
                    j = j2;
                    replace = charSequence2.toString().replace('\n', ' ');
                }
                if (i7 != 0 && !k27Var2.k.out) {
                    long B1 = k27.B1(message2.from_id);
                    if (B1 > 0) {
                        TLRPC.User V13 = na7.q1(i3).V1(Long.valueOf(B1));
                        if (V13 != null) {
                            str2 = l7c.k(V13, true);
                            if (!TextUtils.isEmpty(str2)) {
                                replace = TextUtils.concat(str2, ": ", replace);
                            }
                        }
                        str2 = null;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    } else {
                        if (B1 < 0 && B1 != j && (K0 = na7.q1(i3).K0(Long.valueOf(-B1))) != null) {
                            str2 = K0.title;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                        str2 = null;
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    }
                }
                m = vu3.m(replace, textPaint6.getFontMetricsInt(), false, null, 0);
                hashMap.put(Long.valueOf(j5), m);
            }
        }
        if (!TextUtils.isEmpty(lwbVar.M)) {
            if (lwbVar.m(hwbVar)) {
                CharSequence u1 = gl.u1(replace2, lwbVar.M, wjbVar);
                if (u1 != null) {
                    replace2 = u1;
                }
            } else {
                TLObject e = lwbVar.e(hwbVar);
                String o = e instanceof TLRPC.User ? l7c.o((TLRPC.User) e) : e instanceof TLRPC.Chat ? hc2.K((TLRPC.Chat) e, false) : null;
                if (o != null && o.toLowerCase().contains(lwbVar.M)) {
                    StringBuilder sb = new StringBuilder("@");
                    TLObject e2 = lwbVar.e(hwbVar);
                    sb.append(e2 instanceof TLRPC.User ? l7c.o((TLRPC.User) e2) : e2 instanceof TLRPC.Chat ? hc2.K((TLRPC.Chat) e2, false) : null);
                    SpannableStringBuilder u12 = gl.u1(sb.toString(), lwbVar.M, wjbVar);
                    if (u12 != null) {
                        m = u12;
                    }
                }
            }
        }
        CharSequence m2 = vu3.m(replace2, textPaint5.getFontMetricsInt(), false, null, 0);
        float max = Math.max(0, L2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        kwbVar.d = new StaticLayout(TextUtils.ellipsize(m2, textPaint5, max, truncateAt), textPaint5, Math.max(1, L2), alignment, 1.0f, 0.0f, false);
        String str4 = kwbVar.h;
        int measureText = L - (str4 != null ? ((int) lwbVar.q0.measureText(str4)) + gl.L(22.0f) : 0);
        kwbVar.e = lwa.c(m, textPaint6, Math.max(1, measureText), alignment, gl.L(1.0f), truncateAt, Math.max(1, measureText), 2, true);
        if (kwbVar.n && kwbVar.w == null) {
            kwbVar.w = kwbVar.getContext().getDrawable(R.drawable.list_mute).mutate();
        }
        if (kwbVar.r && kwbVar.x == null) {
            kwbVar.x = kwbVar.getContext().getDrawable(R.drawable.list_pin).mutate();
        }
        kwbVar.requestLayout();
        kwbVar.invalidate();
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        kwb kwbVar = new kwb(this.e, viewGroup.getContext());
        kwbVar.setLayoutParams(new e49(-1, -2));
        return new y29(kwbVar);
    }
}
