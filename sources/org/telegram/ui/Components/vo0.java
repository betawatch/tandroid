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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class vo0 extends bk0 {
    public int H;
    public uo0 I;
    public int K;
    public final /* synthetic */ yo0 L;
    public final Context c;
    public final to0 e;
    public so0 f;
    public so0 h;
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

    public vo0(yo0 yo0Var, Context context) {
        this.L = yo0Var;
        this.c = context;
        to0 to0Var = new to0(false);
        this.e = to0Var;
        to0Var.a = new org.telegram.ui.Cells.b5(this);
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return (i7 == 1 || i7 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.g.a(this.f);
                this.f = null;
            }
            so0 so0Var = this.h;
            if (so0Var != null) {
                org.telegram.messenger.g0.r(so0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            f();
            this.L.L0(true);
            if (TextUtils.isEmpty(str)) {
                yo0.K0(this.L);
                this.r = -1;
                this.J = false;
            } else {
                this.J = true;
                int i7 = this.r + 1;
                this.r = i7;
                this.L.M1.e(true, true);
                org.telegram.messenger.q5 q5Var = Utilities.g;
                so0 so0Var2 = new so0(this, str, i7, 0);
                this.f = so0Var2;
                q5Var.d(so0Var2, 300L);
            }
            this.L.L0(false);
        }
    }

    @Override // v4.i0
    public final int b() {
        this.H = 0;
        this.x = -1;
        this.y = -1;
        this.F = -1;
        this.G = -1;
        if (!TextUtils.isEmpty(this.n)) {
            int i7 = this.H;
            int i10 = i7 + 1;
            this.H = i10;
            this.E = i7;
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
        yo0 yo0Var = this.L;
        if (yo0Var.A2.size() > 0) {
            int i13 = this.H;
            int i14 = i13 + 1;
            this.H = i14;
            this.y = i13;
            this.F = i14;
            this.H = yo0Var.A2.size() + i14;
        }
        int i15 = this.H;
        int i16 = i15 + 1;
        this.H = i16;
        this.G = i15;
        this.K = i16;
        return i16;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == this.G) {
            return 4;
        }
        if (i7 == this.E) {
            return 1;
        }
        if (i7 == this.x) {
            return 2;
        }
        if (i7 == this.y) {
            return 3;
        }
        return TextUtils.isEmpty(this.n) ? 0 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.text.SpannableStringBuilder] */
    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        long j3;
        String str;
        String str2;
        long j10;
        int A1;
        TLObject tLObject;
        CharSequence charSequence;
        TLRPC.TL_encryptedChat tL_encryptedChat;
        long j11;
        int A12;
        yo0 yo0Var = this.L;
        a0.h hVar = yo0Var.Q1;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 0 && i10 != 5) {
            if (i10 == 2) {
                ((ck0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m10 = null;
        to0 to0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (!isEmpty) {
            int i11 = i7 - 1;
            if (i11 < this.d.size()) {
                no0 no0Var = (no0) this.d.get(i11);
                j10 = no0Var.a.id;
                str2 = no0Var.d;
            } else {
                i11 -= this.d.size();
                tLObject2 = (TLObject) to0Var.d.get(i11);
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    j3 = user.id;
                    str = org.telegram.messenger.i5.m(0, user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    j3 = -chat.id;
                    str = chat.title;
                }
                String str3 = to0Var.c;
                if (TextUtils.isEmpty(str3) || str == null || (A1 = org.telegram.messenger.g0.A1(str.toString(), str3)) == -1) {
                    str2 = str;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new i00(org.telegram.ui.ActionBar.n6.q6, yo0Var.J0), A1, str3.length() + A1, 33);
                    str2 = spannableStringBuilder;
                }
                j10 = j3;
            }
            TLObject tLObject3 = tLObject2;
            if (view instanceof org.telegram.ui.Cells.g6) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                g6Var.x(tLObject3, null, str2, null, false, false);
                g6Var.N = i11 < b() + (-2);
                return;
            } else {
                String str4 = str2;
                if (view instanceof org.telegram.ui.Cells.d7) {
                    ((org.telegram.ui.Cells.d7) view).c(j10, hVar.h(j10) >= 0, str4);
                    return;
                }
                return;
            }
        }
        int i12 = this.F;
        if (i12 < 0 || i7 < i12) {
            tLObject = null;
            charSequence = null;
            tL_encryptedChat = null;
            j11 = 0;
        } else {
            TLObject tLObject4 = ((jg.g0) yo0Var.A2.get(i7 - i12)).a;
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject4;
                j11 = user2.id;
                m10 = org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name);
            } else if (tLObject4 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j11 = -chat2.id;
                m10 = chat2.title;
            } else {
                if (tLObject4 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject4;
                    TLRPC.User c22 = org.telegram.messenger.mp.u1(yo0Var.a).c2(Long.valueOf(tL_encryptedChat2.user_id));
                    if (c22 != null) {
                        j11 = c22.id;
                        m10 = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
                    }
                }
                j11 = 0;
            }
            String str5 = to0Var.c;
            if (TextUtils.isEmpty(str5) || m10 == null || (A12 = org.telegram.messenger.g0.A1(m10.toString(), str5)) == -1) {
                tLObject = tLObject4;
                charSequence = m10;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                spannableStringBuilder2.setSpan(new i00(org.telegram.ui.ActionBar.n6.q6, yo0Var.J0), A12, str5.length() + A12, 33);
                tLObject = tLObject4;
                charSequence = spannableStringBuilder2;
            }
            tL_encryptedChat = tL_encryptedChat2;
        }
        if (view instanceof org.telegram.ui.Cells.g6) {
            org.telegram.ui.Cells.g6 g6Var2 = (org.telegram.ui.Cells.g6) view;
            g6Var2.x(tLObject, tL_encryptedChat, charSequence, null, false, false);
            g6Var2.N = i7 < b() + (-2);
        } else {
            CharSequence charSequence2 = charSequence;
            if (view instanceof org.telegram.ui.Cells.d7) {
                ((org.telegram.ui.Cells.d7) view).c(j11, hVar.h(j11) >= 0, charSequence2);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        yo0 yo0Var = this.L;
        Context context = this.c;
        if (i7 == 0) {
            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, yo0Var.J0);
            g6Var.F0 = true;
            g6Var.m0 = true;
            view = g6Var;
        } else if (i7 == 2) {
            org.telegram.ui.f61 f61Var = new org.telegram.ui.f61(6, context, yo0Var.J0);
            f61Var.setItemAnimator(null);
            f61Var.setLayoutAnimation(null);
            jg.b0 b0Var = new jg.b0(11);
            b0Var.j1(0);
            f61Var.setLayoutManager(b0Var);
            uo0 uo0Var = new uo0(this, context, yo0Var.a, yo0Var.J0);
            this.I = uo0Var;
            f61Var.setAdapter(uo0Var);
            f61Var.setOnItemClickListener(new n(this, 12));
            view = f61Var;
        } else if (i7 == 3) {
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, yo0Var.J0);
            x3Var.setTextColor(org.telegram.ui.ActionBar.n6.f7);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.e7, x3Var, yo0Var.J0);
            x3Var.setText(org.telegram.messenger.gd.M0(2131746175, null));
            view = x3Var;
        } else if (i7 == 4) {
            view = new bi.i3(24, context, this);
        } else if (i7 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L((!yo0Var.d2 || yo0Var.k2[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            View d7Var = new org.telegram.ui.Cells.d7(0, context, yo0Var.J0);
            d7Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(100.0f)));
            view = d7Var;
        }
        return new kj0(view);
    }
}
