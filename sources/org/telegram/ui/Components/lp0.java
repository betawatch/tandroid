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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lp0 extends sk0 {
    public int G;
    public kp0 H;
    public int J;
    public final /* synthetic */ op0 K;
    public final Context c;
    public final jp0 e;
    public ip0 f;
    public ip0 h;
    public String n;
    public int r;
    public int s;
    public int w;
    public ArrayList d = new ArrayList();
    public int x = -1;
    public int y = -1;
    public int D = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public lp0(op0 op0Var, Context context) {
        this.K = op0Var;
        this.c = context;
        jp0 jp0Var = new jp0(false);
        this.e = jp0Var;
        jp0Var.a = new m2.t(this, 13);
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 1 || i10 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.g.a(this.f);
                this.f = null;
            }
            ip0 ip0Var = this.h;
            if (ip0Var != null) {
                org.telegram.messenger.i0.r(ip0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            f();
            this.K.K0(true);
            if (TextUtils.isEmpty(str)) {
                op0.J0(this.K);
                this.r = -1;
                this.I = false;
            } else {
                this.I = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.K.I1.e(true, true);
                org.telegram.messenger.r5 r5Var = Utilities.g;
                ip0 ip0Var2 = new ip0(this, str, i10, 0);
                this.f = ip0Var2;
                r5Var.d(ip0Var2, 300L);
            }
            this.K.K0(false);
        }
    }

    @Override // s4.g0
    public final int b() {
        this.G = 0;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        if (!TextUtils.isEmpty(this.n)) {
            int i10 = this.G;
            int i11 = i10 + 1;
            this.G = i11;
            this.D = i10;
            int size = this.e.d.size() + this.d.size() + i11;
            this.G = size;
            if (size == 1) {
                this.D = -1;
                this.G = 0;
                this.J = 0;
                return 0;
            }
            int i12 = size + 1;
            this.G = i12;
            this.F = size;
            this.J = i12;
            return i12;
        }
        int i13 = this.G;
        this.D = i13;
        this.G = i13 + 2;
        this.x = i13 + 1;
        op0 op0Var = this.K;
        if (op0Var.w2.size() > 0) {
            int i14 = this.G;
            int i15 = i14 + 1;
            this.G = i15;
            this.y = i14;
            this.E = i15;
            this.G = op0Var.w2.size() + i15;
        }
        int i16 = this.G;
        int i17 = i16 + 1;
        this.G = i17;
        this.F = i16;
        this.J = i17;
        return i17;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == this.F) {
            return 4;
        }
        if (i10 == this.D) {
            return 1;
        }
        if (i10 == this.x) {
            return 2;
        }
        if (i10 == this.y) {
            return 3;
        }
        return TextUtils.isEmpty(this.n) ? 0 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.text.SpannableStringBuilder] */
    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
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
        op0 op0Var = this.K;
        a0.h hVar = op0Var.M1;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0 && i11 != 5) {
            if (i11 == 2) {
                ((tk0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m10 = null;
        jp0 jp0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (!isEmpty) {
            int i12 = i10 - 1;
            if (i12 < this.d.size()) {
                dp0 dp0Var = (dp0) this.d.get(i12);
                j11 = dp0Var.a.id;
                str2 = dp0Var.d;
            } else {
                i12 -= this.d.size();
                tLObject2 = (TLObject) jp0Var.d.get(i12);
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    j10 = user.id;
                    str = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    j10 = -chat.id;
                    str = chat.title;
                }
                String str3 = jp0Var.c;
                if (TextUtils.isEmpty(str3) || str == null || (A1 = org.telegram.messenger.i0.A1(str.toString(), str3)) == -1) {
                    str2 = str;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new l00(org.telegram.ui.ActionBar.t6.q6, op0Var.I0), A1, str3.length() + A1, 33);
                    str2 = spannableStringBuilder;
                }
                j11 = j10;
            }
            TLObject tLObject3 = tLObject2;
            if (view instanceof org.telegram.ui.Cells.k6) {
                org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                k6Var.z(tLObject3, null, str2, null, false, false);
                k6Var.M = i12 < b() + (-2);
                return;
            } else {
                String str4 = str2;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).c(j11, hVar.h(j11) >= 0, str4);
                    return;
                }
                return;
            }
        }
        int i13 = this.E;
        if (i13 < 0 || i10 < i13) {
            tLObject = null;
            charSequence = null;
            tL_encryptedChat = null;
            j12 = 0;
        } else {
            TLObject tLObject4 = ((zf.y) op0Var.w2.get(i10 - i13)).a;
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject4;
                j12 = user2.id;
                m10 = org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name);
            } else if (tLObject4 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j12 = -chat2.id;
                m10 = chat2.title;
            } else {
                if (tLObject4 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject4;
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(op0Var.a).Z1(Long.valueOf(tL_encryptedChat2.user_id));
                    if (Z1 != null) {
                        j12 = Z1.id;
                        m10 = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
                    }
                }
                j12 = 0;
            }
            String str5 = jp0Var.c;
            if (TextUtils.isEmpty(str5) || m10 == null || (A12 = org.telegram.messenger.i0.A1(m10.toString(), str5)) == -1) {
                tLObject = tLObject4;
                charSequence = m10;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                spannableStringBuilder2.setSpan(new l00(org.telegram.ui.ActionBar.t6.q6, op0Var.I0), A12, str5.length() + A12, 33);
                tLObject = tLObject4;
                charSequence = spannableStringBuilder2;
            }
            tL_encryptedChat = tL_encryptedChat2;
        }
        if (view instanceof org.telegram.ui.Cells.k6) {
            org.telegram.ui.Cells.k6 k6Var2 = (org.telegram.ui.Cells.k6) view;
            k6Var2.z(tLObject, tL_encryptedChat, charSequence, null, false, false);
            k6Var2.M = i10 < b() + (-2);
        } else {
            CharSequence charSequence2 = charSequence;
            if (view instanceof org.telegram.ui.Cells.h7) {
                ((org.telegram.ui.Cells.h7) view).c(j12, hVar.h(j12) >= 0, charSequence2);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        op0 op0Var = this.K;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = 4;
            if (i10 == 2) {
                org.telegram.ui.w71 w71Var = new org.telegram.ui.w71(i11, context, op0Var.I0);
                w71Var.setItemAnimator(null);
                w71Var.setLayoutAnimation(null);
                dh.f fVar = new dh.f(10);
                fVar.j1(0);
                w71Var.setLayoutManager(fVar);
                kp0 kp0Var = new kp0(this, context, op0Var.a, op0Var.I0);
                this.H = kp0Var;
                w71Var.setAdapter(kp0Var);
                w71Var.setOnItemClickListener(new k(this, 12));
                view = w71Var;
            } else if (i10 == 3) {
                org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(context, op0Var.I0);
                z3Var.setTextColor(org.telegram.ui.ActionBar.t6.f7);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.e7, z3Var, op0Var.I0);
                z3Var.setText(org.telegram.messenger.cd.L0(2131746385, null));
                view = z3Var;
            } else if (i10 == 4) {
                view = new bi.t0(this, context, 18);
            } else if (i10 != 5) {
                View view2 = new View(context);
                view2.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L((!op0Var.Z1 || op0Var.g2[1] == null) ? 56.0f : 109.0f)));
                view = view2;
            } else {
                View h7Var = new org.telegram.ui.Cells.h7(0, context, op0Var.I0);
                h7Var.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(100.0f)));
                view = h7Var;
            }
        } else {
            org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, op0Var.I0);
            k6Var.E0 = true;
            k6Var.l0 = true;
            view = k6Var;
        }
        return new ck0(view);
    }
}
