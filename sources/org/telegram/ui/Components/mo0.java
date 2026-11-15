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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mo0 extends tj0 {
    public int H;
    public lo0 I;
    public int K;
    public final /* synthetic */ po0 L;
    public final Context c;
    public final ko0 e;
    public jo0 f;
    public jo0 h;
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

    public mo0(po0 po0Var, Context context) {
        this.L = po0Var;
        this.c = context;
        ko0 ko0Var = new ko0(false);
        this.e = ko0Var;
        ko0Var.a = new cf(this);
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return (i7 == 1 || i7 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.g.a(this.f);
                this.f = null;
            }
            jo0 jo0Var = this.h;
            if (jo0Var != null) {
                org.telegram.messenger.g0.r(jo0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            f();
            this.L.K0(true);
            if (TextUtils.isEmpty(str)) {
                po0.J0(this.L);
                this.r = -1;
                this.J = false;
            } else {
                this.J = true;
                int i7 = this.r + 1;
                this.r = i7;
                this.L.M1.e(true, true);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                jo0 jo0Var2 = new jo0(this, str, i7, 0);
                this.f = jo0Var2;
                p5Var.d(jo0Var2, 300L);
            }
            this.L.K0(false);
        }
    }

    @Override // v4.h0
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
        po0 po0Var = this.L;
        if (po0Var.A2.size() > 0) {
            int i13 = this.H;
            int i14 = i13 + 1;
            this.H = i14;
            this.y = i13;
            this.F = i14;
            this.H = po0Var.A2.size() + i14;
        }
        int i15 = this.H;
        int i16 = i15 + 1;
        this.H = i16;
        this.G = i15;
        this.K = i16;
        return i16;
    }

    @Override // v4.h0
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
    @Override // v4.h0
    public final void t(v4.e1 e1Var, int i7) {
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
        po0 po0Var = this.L;
        a0.h hVar = po0Var.Q1;
        int i10 = e1Var.f;
        View view = e1Var.a;
        if (i10 != 0 && i10 != 5) {
            if (i10 == 2) {
                ((uj0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m10 = null;
        ko0 ko0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (!isEmpty) {
            int i11 = i7 - 1;
            if (i11 < this.d.size()) {
                eo0 eo0Var = (eo0) this.d.get(i11);
                j10 = eo0Var.a.id;
                str2 = eo0Var.d;
            } else {
                i11 -= this.d.size();
                tLObject2 = (TLObject) ko0Var.d.get(i11);
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    j3 = user.id;
                    str = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    j3 = -chat.id;
                    str = chat.title;
                }
                String str3 = ko0Var.c;
                if (TextUtils.isEmpty(str3) || str == null || (A1 = org.telegram.messenger.g0.A1(str.toString(), str3)) == -1) {
                    str2 = str;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new b00(org.telegram.ui.ActionBar.j6.q6, po0Var.J0), A1, str3.length() + A1, 33);
                    str2 = spannableStringBuilder;
                }
                j10 = j3;
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
                    ((org.telegram.ui.Cells.c7) view).c(j10, hVar.h(j10) >= 0, str4);
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
            TLObject tLObject4 = ((jg.g0) po0Var.A2.get(i7 - i12)).a;
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject4;
                j11 = user2.id;
                m10 = org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name);
            } else if (tLObject4 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j11 = -chat2.id;
                m10 = chat2.title;
            } else {
                if (tLObject4 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject4;
                    TLRPC.User a22 = org.telegram.messenger.np.s1(po0Var.a).a2(Long.valueOf(tL_encryptedChat2.user_id));
                    if (a22 != null) {
                        j11 = a22.id;
                        m10 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                    }
                }
                j11 = 0;
            }
            String str5 = ko0Var.c;
            if (TextUtils.isEmpty(str5) || m10 == null || (A12 = org.telegram.messenger.g0.A1(m10.toString(), str5)) == -1) {
                tLObject = tLObject4;
                charSequence = m10;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                spannableStringBuilder2.setSpan(new b00(org.telegram.ui.ActionBar.j6.q6, po0Var.J0), A12, str5.length() + A12, 33);
                tLObject = tLObject4;
                charSequence = spannableStringBuilder2;
            }
            tL_encryptedChat = tL_encryptedChat2;
        }
        if (view instanceof org.telegram.ui.Cells.f6) {
            org.telegram.ui.Cells.f6 f6Var2 = (org.telegram.ui.Cells.f6) view;
            f6Var2.x(tLObject, tL_encryptedChat, charSequence, null, false, false);
            f6Var2.N = i7 < b() + (-2);
        } else {
            CharSequence charSequence2 = charSequence;
            if (view instanceof org.telegram.ui.Cells.c7) {
                ((org.telegram.ui.Cells.c7) view).c(j11, hVar.h(j11) >= 0, charSequence2);
            }
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        po0 po0Var = this.L;
        Context context = this.c;
        if (i7 == 0) {
            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, po0Var.J0);
            f6Var.F0 = true;
            f6Var.m0 = true;
            view = f6Var;
        } else if (i7 == 2) {
            org.telegram.ui.b61 b61Var = new org.telegram.ui.b61(6, context, po0Var.J0);
            b61Var.setItemAnimator(null);
            b61Var.setLayoutAnimation(null);
            jg.b0 b0Var = new jg.b0(11);
            b0Var.j1(0);
            b61Var.setLayoutManager(b0Var);
            lo0 lo0Var = new lo0(this, context, po0Var.a, po0Var.J0);
            this.I = lo0Var;
            b61Var.setAdapter(lo0Var);
            b61Var.setOnItemClickListener(new j(this, 12));
            view = b61Var;
        } else if (i7 == 3) {
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, po0Var.J0);
            x3Var.setTextColor(org.telegram.ui.ActionBar.j6.f7);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.e7, x3Var, po0Var.J0);
            x3Var.setText(org.telegram.messenger.hd.M0(2131746370, null));
            view = x3Var;
        } else if (i7 == 4) {
            view = new bi.o2(24, context, this);
        } else if (i7 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L((!po0Var.d2 || po0Var.k2[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            View c7Var = new org.telegram.ui.Cells.c7(0, context, po0Var.J0);
            c7Var.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(100.0f)));
            view = c7Var;
        }
        return new cj0(view);
    }
}
