package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lo0 extends sj0 {
    public int H;
    public ko0 I;
    public int K;
    public final /* synthetic */ oo0 L;
    public final Context c;
    public final jo0 e;
    public io0 f;
    public io0 h;
    public String n;
    public int r;
    public int s;
    public int w;
    public ArrayList d = new ArrayList();
    public int x = -1;
    public int y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public boolean J = false;

    public lo0(oo0 oo0Var, Context context) {
        this.L = oo0Var;
        this.c = context;
        jo0 jo0Var = new jo0(false);
        this.e = jo0Var;
        jo0Var.a = new y00(this);
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return (i3 == 1 || i3 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.g.a(this.f);
                this.f = null;
            }
            io0 io0Var = this.h;
            if (io0Var != null) {
                org.telegram.messenger.g0.r(io0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            f();
            this.L.K0(true);
            if (TextUtils.isEmpty(str)) {
                oo0.J0(this.L);
                this.r = -1;
                this.J = false;
            } else {
                this.J = true;
                int i3 = this.r + 1;
                this.r = i3;
                this.L.J1.e(true, true);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                io0 io0Var2 = new io0(this, str, i3, 0);
                this.f = io0Var2;
                p5Var.e(io0Var2, 300L);
            }
            this.L.K0(false);
        }
    }

    @Override // u4.h0
    public final int b() {
        this.H = 0;
        this.x = -1;
        this.y = -1;
        this.F = -1;
        this.G = -1;
        if (!TextUtils.isEmpty(this.n)) {
            int i3 = this.H;
            int i10 = i3 + 1;
            this.H = i10;
            this.E = i3;
            int size = this.e.d.size() + this.d.size() + i10;
            this.H = size;
            if (size == 1) {
                this.E = -1;
                this.H = 0;
                this.K = 0;
                return 0;
            }
            int i11 = size + 1;
            this.H = i11;
            this.G = size;
            this.K = i11;
            return i11;
        }
        int i12 = this.H;
        this.E = i12;
        this.H = i12 + 2;
        this.x = i12 + 1;
        oo0 oo0Var = this.L;
        if (oo0Var.x2.size() > 0) {
            int i13 = this.H;
            int i14 = i13 + 1;
            this.H = i14;
            this.y = i13;
            this.F = i14;
            this.H = oo0Var.x2.size() + i14;
        }
        int i15 = this.H;
        int i16 = i15 + 1;
        this.H = i16;
        this.G = i15;
        this.K = i16;
        return i16;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == this.G) {
            return 4;
        }
        if (i3 == this.E) {
            return 1;
        }
        if (i3 == this.x) {
            return 2;
        }
        if (i3 == this.y) {
            return 3;
        }
        return TextUtils.isEmpty(this.n) ? 0 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.text.SpannableStringBuilder] */
    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        long j10;
        String str;
        String str2;
        long j11;
        int A1;
        TLObject tLObject;
        CharSequence charSequence;
        TLRPC.TL_encryptedChat tL_encryptedChat;
        long j12;
        int A12;
        oo0 oo0Var = this.L;
        a0.h hVar = oo0Var.N1;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0 && i10 != 5) {
            if (i10 == 2) {
                ((tj0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m10 = null;
        jo0 jo0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (!isEmpty) {
            int i11 = i3 - 1;
            if (i11 < this.d.size()) {
                do0 do0Var = (do0) this.d.get(i11);
                j11 = do0Var.a.id;
                str2 = do0Var.d;
            } else {
                i11 -= this.d.size();
                tLObject2 = (TLObject) jo0Var.d.get(i11);
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    j10 = user.id;
                    str = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    j10 = -chat.id;
                    str = chat.title;
                }
                String str3 = jo0Var.c;
                if (TextUtils.isEmpty(str3) || str == null || (A1 = org.telegram.messenger.g0.A1(str.toString(), str3)) == -1) {
                    str2 = str;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new tz(org.telegram.ui.ActionBar.k6.q6, oo0Var.J0), A1, str3.length() + A1, 33);
                    str2 = spannableStringBuilder;
                }
                j11 = j10;
            }
            TLObject tLObject3 = tLObject2;
            if (view instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                f6Var.x(tLObject3, null, str2, null, false, false);
                f6Var.N = i11 < b() + (-2);
                return;
            } else {
                String str4 = str2;
                if (view instanceof org.telegram.ui.Cells.c7) {
                    ((org.telegram.ui.Cells.c7) view).c(j11, hVar.h(j11) >= 0, str4);
                    return;
                }
                return;
            }
        }
        int i12 = this.F;
        if (i12 < 0 || i3 < i12) {
            tLObject = null;
            charSequence = null;
            tL_encryptedChat = null;
            j12 = 0;
        } else {
            TLObject tLObject4 = ((kg.d0) oo0Var.x2.get(i3 - i12)).a;
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject4;
                j12 = user2.id;
                m10 = org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name);
            } else if (tLObject4 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j12 = -chat2.id;
                m10 = chat2.title;
            } else {
                if (tLObject4 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject4;
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(oo0Var.a).a2(Long.valueOf(tL_encryptedChat2.user_id));
                    if (a22 != null) {
                        j12 = a22.id;
                        m10 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                    }
                }
                j12 = 0;
            }
            String str5 = jo0Var.c;
            if (TextUtils.isEmpty(str5) || m10 == null || (A12 = org.telegram.messenger.g0.A1(m10.toString(), str5)) == -1) {
                tLObject = tLObject4;
                charSequence = m10;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                spannableStringBuilder2.setSpan(new tz(org.telegram.ui.ActionBar.k6.q6, oo0Var.J0), A12, str5.length() + A12, 33);
                tLObject = tLObject4;
                charSequence = spannableStringBuilder2;
            }
            tL_encryptedChat = tL_encryptedChat2;
        }
        if (view instanceof org.telegram.ui.Cells.f6) {
            org.telegram.ui.Cells.f6 f6Var2 = (org.telegram.ui.Cells.f6) view;
            f6Var2.x(tLObject, tL_encryptedChat, charSequence, null, false, false);
            f6Var2.N = i3 < b() + (-2);
        } else {
            CharSequence charSequence2 = charSequence;
            if (view instanceof org.telegram.ui.Cells.c7) {
                ((org.telegram.ui.Cells.c7) view).c(j12, hVar.h(j12) >= 0, charSequence2);
            }
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        oo0 oo0Var = this.L;
        Context context = this.c;
        if (i3 == 0) {
            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, oo0Var.J0);
            f6Var.F0 = true;
            f6Var.m0 = true;
            view = f6Var;
        } else if (i3 == 2) {
            org.telegram.ui.u51 u51Var = new org.telegram.ui.u51(6, context, oo0Var.J0);
            u51Var.setItemAnimator(null);
            u51Var.setLayoutAnimation(null);
            kg.y yVar = new kg.y(11);
            yVar.j1(0);
            u51Var.setLayoutManager(yVar);
            ko0 ko0Var = new ko0(this, context, oo0Var.a, oo0Var.J0);
            this.I = ko0Var;
            u51Var.setAdapter(ko0Var);
            u51Var.setOnItemClickListener(new k(this, 12));
            view = u51Var;
        } else if (i3 == 3) {
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, oo0Var.J0);
            x3Var.setTextColor(org.telegram.ui.ActionBar.k6.f7);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.e7, x3Var, oo0Var.J0);
            x3Var.setText(org.telegram.messenger.bd.M0(2131746378, null));
            view = x3Var;
        } else if (i3 == 4) {
            view = new ai.x2(24, context, this);
        } else if (i3 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L((!oo0Var.a2 || oo0Var.h2[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            View c7Var = new org.telegram.ui.Cells.c7(0, context, oo0Var.J0);
            c7Var.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
            view = c7Var;
        }
        return new bj0(view);
    }
}
