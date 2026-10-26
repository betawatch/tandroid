package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ir0 extends lm0 {
    public int G;
    public hr0 H;
    public int J;
    public final /* synthetic */ mr0 K;
    public final Context c;
    public final gr0 e;
    public fr0 f;
    public fr0 h;
    public String n;
    public int r;
    public int s;
    public int v;
    public ArrayList d = new ArrayList();
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int E = -1;
    public int F = -1;
    public boolean I = false;

    public ir0(mr0 mr0Var, Context context) {
        this.K = mr0Var;
        this.c = context;
        gr0 gr0Var = new gr0(false);
        this.e = gr0Var;
        gr0Var.a = new li.e3(this, 11);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f;
        return (i10 == 1 || i10 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.searchQueue.cancelRunnable(this.f);
                this.f = null;
            }
            fr0 fr0Var = this.h;
            if (fr0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(fr0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.K.M0(true);
            if (TextUtils.isEmpty(str)) {
                mr0.C0(this.K);
                this.r = -1;
                this.I = false;
            } else {
                this.I = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.K.R.e(true, true);
                DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
                fr0 fr0Var2 = new fr0(this, str, i10, 0);
                this.f = fr0Var2;
                dispatchQueue2.postRunnable(fr0Var2, 300L);
            }
            this.K.M0(false);
        }
    }

    @Override // s4.h0
    public final int h() {
        this.G = 0;
        this.w = -1;
        this.x = -1;
        this.E = -1;
        this.F = -1;
        if (!TextUtils.isEmpty(this.n)) {
            int i10 = this.G;
            int i11 = i10 + 1;
            this.G = i11;
            this.y = i10;
            int size = this.e.d.size() + this.d.size() + i11;
            this.G = size;
            if (size == 1) {
                this.y = -1;
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
        this.y = i13;
        this.G = i13 + 2;
        this.w = i13 + 1;
        mr0 mr0Var = this.K;
        if (mr0Var.F0.size() > 0) {
            int i14 = this.G;
            int i15 = i14 + 1;
            this.G = i15;
            this.x = i14;
            this.E = i15;
            this.G = mr0Var.F0.size() + i15;
        }
        int i16 = this.G;
        int i17 = i16 + 1;
        this.G = i17;
        this.F = i16;
        this.J = i17;
        return i17;
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (i10 == this.F) {
            return 4;
        }
        if (i10 == this.y) {
            return 1;
        }
        if (i10 == this.w) {
            return 2;
        }
        if (i10 == this.x) {
            return 3;
        }
        return TextUtils.isEmpty(this.n) ? 0 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.text.SpannableStringBuilder] */
    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.u6 u6Var;
        TLObject tLObject2;
        String str3;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.u6 u6Var2;
        mr0 mr0Var = this.K;
        a0.h hVar = mr0Var.V;
        int i12 = e1Var.f;
        View view = e1Var.a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((mm0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        gr0 gr0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i13 = i10 - 1;
            if (i13 < this.d.size()) {
                ar0 ar0Var = (ar0) this.d.get(i13);
                j11 = ar0Var.a.id;
                str2 = ar0Var.d;
                tLObject = null;
            } else {
                i13 -= this.d.size();
                TLObject tLObject3 = (TLObject) gr0Var.d.get(i13);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j10 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j10 = -chat.id;
                    str = chat.title;
                }
                String str5 = gr0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i14 = org.telegram.ui.ActionBar.y6.q6;
                    u6Var = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new p10(i14, u6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j11 = j10;
            }
            if (view instanceof org.telegram.ui.Cells.m6) {
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
                m6Var.s(tLObject, null, str2, null, false, false);
                m6Var.M = i13 < h() + (-2);
                return;
            } else {
                String str6 = str2;
                if (view instanceof org.telegram.ui.Cells.k7) {
                    ((org.telegram.ui.Cells.k7) view).c(j11, hVar.h(j11) >= 0, str6);
                    return;
                }
                return;
            }
        }
        int i15 = this.E;
        long j12 = 0;
        if (i15 < 0 || i10 < i15) {
            tLObject2 = null;
            str3 = null;
        } else {
            TLObject tLObject4 = ((ig.h0) mr0Var.F0.get(i10 - i15)).a;
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject4;
                j12 = user2.id;
                str4 = ContactsController.formatName(user2.first_name, user2.last_name);
            } else if (tLObject4 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j12 = -chat2.id;
                str4 = chat2.title;
            } else if (tLObject4 instanceof TLRPC.TL_encryptedChat) {
                tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject4;
                i11 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j12 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = gr0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i16 = org.telegram.ui.ActionBar.y6.q6;
                u6Var2 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new p10(i16, u6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
                tLObject2 = tLObject4;
                str3 = spannableStringBuilder2;
            }
        }
        TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
        if (view instanceof org.telegram.ui.Cells.m6) {
            org.telegram.ui.Cells.m6 m6Var2 = (org.telegram.ui.Cells.m6) view;
            m6Var2.s(tLObject2, tL_encryptedChat2, str3, null, false, false);
            m6Var2.M = i10 < h() + (-2);
        } else {
            String str8 = str3;
            if (view instanceof org.telegram.ui.Cells.k7) {
                ((org.telegram.ui.Cells.k7) view).c(j12, hVar.h(j12) >= 0, str8);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.u6 u6Var;
        View view;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var3;
        org.telegram.ui.ActionBar.u6 u6Var4;
        org.telegram.ui.ActionBar.u6 u6Var5;
        org.telegram.ui.ActionBar.u6 u6Var6;
        Context context = this.c;
        mr0 mr0Var = this.K;
        if (i10 == 0) {
            u6Var = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, u6Var);
            m6Var.E0 = true;
            m6Var.l0 = true;
            view = m6Var;
        } else if (i10 == 2) {
            u6Var2 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            org.telegram.ui.za1 za1Var = new org.telegram.ui.za1(context, 6, u6Var2);
            za1Var.setItemAnimator(null);
            za1Var.setLayoutAnimation(null);
            ig.a0 a0Var = new ig.a0(11);
            a0Var.k1(0);
            za1Var.setLayoutManager(a0Var);
            i11 = ((org.telegram.ui.ActionBar.k3) mr0Var).currentAccount;
            u6Var3 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            hr0 hr0Var = new hr0(this, context, i11, u6Var3);
            this.H = hr0Var;
            za1Var.setAdapter(hr0Var);
            za1Var.setOnItemClickListener(new j(this, 12));
            view = za1Var;
        } else if (i10 == 3) {
            u6Var4 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(context, u6Var4);
            z3Var.setTextColor(org.telegram.ui.ActionBar.y6.f7);
            int i12 = org.telegram.ui.ActionBar.y6.e7;
            u6Var5 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            org.telegram.ui.ActionBar.f7.i(i12, z3Var, u6Var5);
            z3Var.setText(LocaleController.getString(R.string.Recent));
            view = z3Var;
        } else if (i10 == 4) {
            view = new bi.cc(this, context, 22);
        } else if (i10 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp((!mr0Var.i0 || mr0Var.p0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            u6Var6 = ((org.telegram.ui.ActionBar.k3) mr0Var).resourcesProvider;
            View k7Var = new org.telegram.ui.Cells.k7(context, 0, u6Var6);
            k7Var.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(100.0f)));
            view = k7Var;
        }
        return new vl0(view);
    }
}
