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
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class zq0 extends hm0 {
    public int G;
    public yq0 H;
    public int J;
    public final /* synthetic */ dr0 K;
    public final Context c;
    public final xq0 e;
    public wq0 f;
    public wq0 h;
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

    public zq0(dr0 dr0Var, Context context) {
        this.K = dr0Var;
        this.c = context;
        xq0 xq0Var = new xq0(false);
        this.e = xq0Var;
        xq0Var.a = new ki.t1(this, 18);
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f;
        return (i10 == 1 || i10 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.searchQueue.cancelRunnable(this.f);
                this.f = null;
            }
            wq0 wq0Var = this.h;
            if (wq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(wq0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.K.L0(true);
            if (TextUtils.isEmpty(str)) {
                dr0.G0(this.K);
                this.r = -1;
                this.I = false;
            } else {
                this.I = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.K.Q.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                wq0 wq0Var2 = new wq0(this, str, i10, 0);
                this.f = wq0Var2;
                dispatchQueue.postRunnable(wq0Var2, 300L);
            }
            this.K.L0(false);
        }
    }

    @Override // s4.g0
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
        dr0 dr0Var = this.K;
        if (dr0Var.E0.size() > 0) {
            int i14 = this.G;
            int i15 = i14 + 1;
            this.G = i15;
            this.x = i14;
            this.E = i15;
            this.G = dr0Var.E0.size() + i15;
        }
        int i16 = this.G;
        int i17 = i16 + 1;
        this.G = i17;
        this.F = i16;
        this.J = i17;
        return i17;
    }

    @Override // s4.g0
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
    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.d6 d6Var;
        TLObject tLObject2;
        String str3;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.d6 d6Var2;
        dr0 dr0Var = this.K;
        a0.h hVar = dr0Var.U;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((im0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        xq0 xq0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i13 = i10 - 1;
            if (i13 < this.d.size()) {
                rq0 rq0Var = (rq0) this.d.get(i13);
                j11 = rq0Var.a.id;
                str2 = rq0Var.d;
                tLObject = null;
            } else {
                i13 -= this.d.size();
                TLObject tLObject3 = (TLObject) xq0Var.d.get(i13);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j10 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j10 = -chat.id;
                    str = chat.title;
                }
                String str5 = xq0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i14 = org.telegram.ui.ActionBar.h6.q6;
                    d6Var = ((org.telegram.ui.ActionBar.f3) dr0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new m10(i14, d6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j11 = j10;
            }
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                h6Var.t(tLObject, null, str2, null, false, false);
                h6Var.M = i13 < h() + (-2);
                return;
            } else {
                String str6 = str2;
                if (view instanceof org.telegram.ui.Cells.e7) {
                    ((org.telegram.ui.Cells.e7) view).c(j11, hVar.h(j11) >= 0, str6);
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
            TLObject tLObject4 = ((hg.g0) dr0Var.E0.get(i10 - i15)).a;
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
                i11 = ((org.telegram.ui.ActionBar.f3) dr0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j12 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = xq0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i16 = org.telegram.ui.ActionBar.h6.q6;
                d6Var2 = ((org.telegram.ui.ActionBar.f3) dr0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new m10(i16, d6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
                tLObject2 = tLObject4;
                str3 = spannableStringBuilder2;
            }
        }
        TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
        if (view instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
            h6Var2.M = i10 < h() + (-2);
        } else {
            String str8 = str3;
            if (view instanceof org.telegram.ui.Cells.e7) {
                ((org.telegram.ui.Cells.e7) view).c(j12, hVar.h(j12) >= 0, str8);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.d6 d6Var;
        View view;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var3;
        org.telegram.ui.ActionBar.d6 d6Var4;
        org.telegram.ui.ActionBar.d6 d6Var5;
        Context context = this.c;
        dr0 dr0Var = this.K;
        if (i10 == 0) {
            d6Var = ((org.telegram.ui.ActionBar.f3) dr0Var).resourcesProvider;
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, d6Var);
            h6Var.E0 = true;
            h6Var.l0 = true;
            view = h6Var;
        } else if (i10 == 2) {
            d6Var2 = ((org.telegram.ui.ActionBar.f3) dr0Var).resourcesProvider;
            ua1 ua1Var = new ua1(context, 6, d6Var2);
            ua1Var.setItemAnimator(null);
            ua1Var.setLayoutAnimation(null);
            hg.a0 a0Var = new hg.a0(11);
            a0Var.j1(0);
            ua1Var.setLayoutManager(a0Var);
            i11 = ((org.telegram.ui.ActionBar.f3) dr0Var).currentAccount;
            d6Var3 = ((org.telegram.ui.ActionBar.f3) dr0Var).resourcesProvider;
            yq0 yq0Var = new yq0(this, context, i11, d6Var3);
            this.H = yq0Var;
            ua1Var.setAdapter(yq0Var);
            ua1Var.setOnItemClickListener(new j(this, 12));
            view = ua1Var;
        } else if (i10 == 3) {
            d6Var4 = ((org.telegram.ui.ActionBar.f3) dr0Var).resourcesProvider;
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, d6Var4);
            u3Var.setTextColor(org.telegram.ui.ActionBar.h6.f7);
            u3Var.setBackgroundColor(dr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.e7));
            u3Var.setText(LocaleController.getString(R.string.Recent));
            view = u3Var;
        } else if (i10 == 4) {
            view = new ai.ic(this, context, 23);
        } else if (i10 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp((!dr0Var.h0 || dr0Var.o0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            d6Var5 = ((org.telegram.ui.ActionBar.f3) dr0Var).resourcesProvider;
            View e7Var = new org.telegram.ui.Cells.e7(context, 0, d6Var5);
            e7Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
            view = e7Var;
        }
        return new sl0(view);
    }
}
