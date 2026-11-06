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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class jo0 extends oj0 {
    public int G;
    public io0 H;
    public int J;
    public final /* synthetic */ mo0 K;
    public final Context c;
    public final ho0 e;
    public go0 f;
    public go0 h;
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

    public jo0(mo0 mo0Var, Context context) {
        this.K = mo0Var;
        this.c = context;
        ho0 ho0Var = new ho0(false);
        this.e = ho0Var;
        ho0Var.a = new n(this);
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return (i7 == 1 || i7 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.g.a(this.f);
                this.f = null;
            }
            go0 go0Var = this.h;
            if (go0Var != null) {
                org.telegram.messenger.g0.r(go0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            f();
            this.K.K0(true);
            if (TextUtils.isEmpty(str)) {
                mo0.J0(this.K);
                this.r = -1;
                this.I = false;
            } else {
                this.I = true;
                int i7 = this.r + 1;
                this.r = i7;
                this.K.I1.e(true, true);
                org.telegram.messenger.p5 p5Var = Utilities.g;
                go0 go0Var2 = new go0(this, str, i7, 0);
                this.f = go0Var2;
                p5Var.d(go0Var2, 300L);
            }
            this.K.K0(false);
        }
    }

    @Override // v4.g0
    public final int b() {
        this.G = 0;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        if (!TextUtils.isEmpty(this.n)) {
            int i7 = this.G;
            int i10 = i7 + 1;
            this.G = i10;
            this.D = i7;
            int size = this.e.d.size() + this.d.size() + i10;
            this.G = size;
            if (size == 1) {
                this.D = -1;
                this.G = 0;
                this.J = 0;
                return 0;
            }
            int i11 = size + 1;
            this.G = i11;
            this.F = size;
            this.J = i11;
            return i11;
        }
        int i12 = this.G;
        this.D = i12;
        this.G = i12 + 2;
        this.x = i12 + 1;
        mo0 mo0Var = this.K;
        if (mo0Var.w2.size() > 0) {
            int i13 = this.G;
            int i14 = i13 + 1;
            this.G = i14;
            this.y = i13;
            this.E = i14;
            this.G = mo0Var.w2.size() + i14;
        }
        int i15 = this.G;
        int i16 = i15 + 1;
        this.G = i16;
        this.F = i15;
        this.J = i16;
        return i16;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == this.F) {
            return 4;
        }
        if (i7 == this.D) {
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
    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
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
        mo0 mo0Var = this.K;
        a0.h hVar = mo0Var.M1;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0 && i10 != 5) {
            if (i10 == 2) {
                ((pj0) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m10 = null;
        ho0 ho0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (!isEmpty) {
            int i11 = i7 - 1;
            if (i11 < this.d.size()) {
                bo0 bo0Var = (bo0) this.d.get(i11);
                j10 = bo0Var.a.id;
                str2 = bo0Var.d;
            } else {
                i11 -= this.d.size();
                tLObject2 = (TLObject) ho0Var.d.get(i11);
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    j3 = user.id;
                    str = org.telegram.messenger.g5.m(0, user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    j3 = -chat.id;
                    str = chat.title;
                }
                String str3 = ho0Var.c;
                if (TextUtils.isEmpty(str3) || str == null || (A1 = org.telegram.messenger.g0.A1(str.toString(), str3)) == -1) {
                    str2 = str;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new xz(org.telegram.ui.ActionBar.k6.q6, mo0Var.I0), A1, str3.length() + A1, 33);
                    str2 = spannableStringBuilder;
                }
                j10 = j3;
            }
            TLObject tLObject3 = tLObject2;
            if (view instanceof org.telegram.ui.Cells.g6) {
                org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                g6Var.x(tLObject3, null, str2, null, false, false);
                g6Var.M = i11 < b() + (-2);
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
        int i12 = this.E;
        if (i12 < 0 || i7 < i12) {
            tLObject = null;
            charSequence = null;
            tL_encryptedChat = null;
            j11 = 0;
        } else {
            TLObject tLObject4 = ((jg.g0) mo0Var.w2.get(i7 - i12)).a;
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
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(mo0Var.a).a2(Long.valueOf(tL_encryptedChat2.user_id));
                    if (a22 != null) {
                        j11 = a22.id;
                        m10 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
                    }
                }
                j11 = 0;
            }
            String str5 = ho0Var.c;
            if (TextUtils.isEmpty(str5) || m10 == null || (A12 = org.telegram.messenger.g0.A1(m10.toString(), str5)) == -1) {
                tLObject = tLObject4;
                charSequence = m10;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m10);
                spannableStringBuilder2.setSpan(new xz(org.telegram.ui.ActionBar.k6.q6, mo0Var.I0), A12, str5.length() + A12, 33);
                tLObject = tLObject4;
                charSequence = spannableStringBuilder2;
            }
            tL_encryptedChat = tL_encryptedChat2;
        }
        if (view instanceof org.telegram.ui.Cells.g6) {
            org.telegram.ui.Cells.g6 g6Var2 = (org.telegram.ui.Cells.g6) view;
            g6Var2.x(tLObject, tL_encryptedChat, charSequence, null, false, false);
            g6Var2.M = i7 < b() + (-2);
        } else {
            CharSequence charSequence2 = charSequence;
            if (view instanceof org.telegram.ui.Cells.d7) {
                ((org.telegram.ui.Cells.d7) view).c(j11, hVar.h(j11) >= 0, charSequence2);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        mo0 mo0Var = this.K;
        Context context = this.c;
        if (i7 == 0) {
            org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, mo0Var.I0);
            g6Var.E0 = true;
            g6Var.l0 = true;
            view = g6Var;
        } else if (i7 == 2) {
            org.telegram.ui.e61 e61Var = new org.telegram.ui.e61(6, context, mo0Var.I0);
            e61Var.setItemAnimator(null);
            e61Var.setLayoutAnimation(null);
            jg.b0 b0Var = new jg.b0(11);
            b0Var.j1(0);
            e61Var.setLayoutManager(b0Var);
            io0 io0Var = new io0(this, context, mo0Var.a, mo0Var.I0);
            this.H = io0Var;
            e61Var.setAdapter(io0Var);
            e61Var.setOnItemClickListener(new k(this, 12));
            view = e61Var;
        } else if (i7 == 3) {
            org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(context, mo0Var.I0);
            x3Var.setTextColor(org.telegram.ui.ActionBar.k6.f7);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.e7, x3Var, mo0Var.I0);
            x3Var.setText(org.telegram.messenger.hd.M0(2131746369, null));
            view = x3Var;
        } else if (i7 == 4) {
            view = new bi.ec(23, context, this);
        } else if (i7 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L((!mo0Var.Z1 || mo0Var.g2[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            View d7Var = new org.telegram.ui.Cells.d7(0, context, mo0Var.I0);
            d7Var.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(100.0f)));
            view = d7Var;
        }
        return new xi0(view);
    }
}
