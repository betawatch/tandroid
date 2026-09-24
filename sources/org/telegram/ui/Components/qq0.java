package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wb1;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class qq0 extends vl0 {
    public int G;
    public pq0 H;
    public int J;
    public final /* synthetic */ uq0 K;
    public final Context c;
    public final oq0 e;
    public nq0 f;
    public nq0 h;
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

    public qq0(uq0 uq0Var, Context context) {
        this.K = uq0Var;
        this.c = context;
        oq0 oq0Var = new oq0(false);
        this.e = oq0Var;
        oq0Var.a = new n2.e(this, 10);
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return (i10 == 1 || i10 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.searchQueue.cancelRunnable(this.f);
                this.f = null;
            }
            nq0 nq0Var = this.h;
            if (nq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(nq0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.K.K0(true);
            if (TextUtils.isEmpty(str)) {
                uq0.F0(this.K);
                this.r = -1;
                this.I = false;
            } else {
                this.I = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.K.Q.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                nq0 nq0Var2 = new nq0(this, str, i10, 0);
                this.f = nq0Var2;
                dispatchQueue.postRunnable(nq0Var2, 300L);
            }
            this.K.K0(false);
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
        uq0 uq0Var = this.K;
        if (uq0Var.E0.size() > 0) {
            int i14 = this.G;
            int i15 = i14 + 1;
            this.G = i15;
            this.x = i14;
            this.E = i15;
            this.G = uq0Var.E0.size() + i15;
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
    public final void v(s4.c1 c1Var, int i10) {
        long j3;
        String str;
        String str2;
        TLObject tLObject;
        long j10;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.d6 d6Var;
        TLObject tLObject2;
        String str3;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.d6 d6Var2;
        uq0 uq0Var = this.K;
        a0.i iVar = uq0Var.U;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((wl0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        oq0 oq0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i13 = i10 - 1;
            if (i13 < this.d.size()) {
                iq0 iq0Var = (iq0) this.d.get(i13);
                j10 = iq0Var.a.id;
                str2 = iq0Var.d;
                tLObject = null;
            } else {
                i13 -= this.d.size();
                TLObject tLObject3 = (TLObject) oq0Var.d.get(i13);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j3 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j3 = -chat.id;
                    str = chat.title;
                }
                String str5 = oq0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i14 = org.telegram.ui.ActionBar.h6.q6;
                    d6Var = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new f10(i14, d6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j10 = j3;
            }
            if (view instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                i6Var.t(tLObject, null, str2, null, false, false);
                i6Var.M = i13 < h() + (-2);
                return;
            } else {
                String str6 = str2;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).c(j10, iVar.h(j10) >= 0, str6);
                    return;
                }
                return;
            }
        }
        int i15 = this.E;
        long j11 = 0;
        if (i15 < 0 || i10 < i15) {
            tLObject2 = null;
            str3 = null;
        } else {
            TLObject tLObject4 = ((gg.h0) uq0Var.E0.get(i10 - i15)).a;
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject4;
                j11 = user2.id;
                str4 = ContactsController.formatName(user2.first_name, user2.last_name);
            } else if (tLObject4 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j11 = -chat2.id;
                str4 = chat2.title;
            } else if (tLObject4 instanceof TLRPC.TL_encryptedChat) {
                tL_encryptedChat = (TLRPC.TL_encryptedChat) tLObject4;
                i11 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j11 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = oq0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i16 = org.telegram.ui.ActionBar.h6.q6;
                d6Var2 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new f10(i16, d6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
                tLObject2 = tLObject4;
                str3 = spannableStringBuilder2;
            }
        }
        TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
        if (view instanceof org.telegram.ui.Cells.i6) {
            org.telegram.ui.Cells.i6 i6Var2 = (org.telegram.ui.Cells.i6) view;
            i6Var2.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
            i6Var2.M = i10 < h() + (-2);
        } else {
            String str8 = str3;
            if (view instanceof org.telegram.ui.Cells.g7) {
                ((org.telegram.ui.Cells.g7) view).c(j11, iVar.h(j11) >= 0, str8);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.ActionBar.d6 d6Var5;
        Context context = this.c;
        uq0 uq0Var = this.K;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, d6Var);
            i6Var.E0 = true;
            i6Var.l0 = true;
            view = i6Var;
        } else if (i10 == 2) {
            d6Var2 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            wb1 wb1Var = new wb1(context, 6, d6Var2);
            wb1Var.setItemAnimator(null);
            wb1Var.setLayoutAnimation(null);
            gg.b0 b0Var = new gg.b0(11);
            b0Var.j1(0);
            wb1Var.setLayoutManager(b0Var);
            i11 = ((org.telegram.ui.ActionBar.e3) uq0Var).currentAccount;
            d6Var3 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            pq0 pq0Var = new pq0(this, context, i11, d6Var3);
            this.H = pq0Var;
            wb1Var.setAdapter(pq0Var);
            wb1Var.setOnItemClickListener(new j(this, 12));
            view = wb1Var;
        } else if (i10 == 3) {
            d6Var4 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, d6Var4);
            v3Var.setTextColor(org.telegram.ui.ActionBar.h6.f7);
            v3Var.setBackgroundColor(uq0Var.getThemedColor(org.telegram.ui.ActionBar.h6.e7));
            v3Var.setText(LocaleController.getString(R.string.Recent));
            view = v3Var;
        } else if (i10 == 4) {
            view = new ci.bb(this, context, 22);
        } else if (i10 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp((!uq0Var.h0 || uq0Var.o0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            d6Var5 = ((org.telegram.ui.ActionBar.e3) uq0Var).resourcesProvider;
            View g7Var = new org.telegram.ui.Cells.g7(context, 0, d6Var5);
            g7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
            view = g7Var;
        }
        return new gl0(view);
    }
}
