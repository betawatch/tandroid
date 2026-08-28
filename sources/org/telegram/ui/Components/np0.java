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
import org.telegram.ui.va1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class np0 extends vk0 {
    public int C;
    public mp0 D;
    public int F;
    public final /* synthetic */ rp0 G;
    public final Context c;
    public final lp0 e;
    public kp0 f;
    public kp0 h;
    public String n;
    public int r;
    public int s;
    public int v;
    public ArrayList d = new ArrayList();
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int A = -1;
    public int B = -1;
    public boolean E = false;

    public np0(rp0 rp0Var, Context context) {
        this.G = rp0Var;
        this.c = context;
        lp0 lp0Var = new lp0(false);
        this.e = lp0Var;
        lp0Var.a = new n5.a0(this, 10);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f;
        return (i9 == 1 || i9 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.searchQueue.cancelRunnable(this.f);
                this.f = null;
            }
            kp0 kp0Var = this.h;
            if (kp0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(kp0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.G.K0(true);
            if (TextUtils.isEmpty(str)) {
                rp0.E0(this.G);
                this.r = -1;
                this.E = false;
            } else {
                this.E = true;
                int i9 = this.r + 1;
                this.r = i9;
                this.G.M.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                kp0 kp0Var2 = new kp0(this, str, i9, 0);
                this.f = kp0Var2;
                dispatchQueue.postRunnable(kp0Var2, 300L);
            }
            this.G.K0(false);
        }
    }

    @Override // f2.r0
    public final int h() {
        this.C = 0;
        this.w = -1;
        this.x = -1;
        this.A = -1;
        this.B = -1;
        if (!TextUtils.isEmpty(this.n)) {
            int i9 = this.C;
            int i10 = i9 + 1;
            this.C = i10;
            this.y = i9;
            int size = this.e.d.size() + this.d.size() + i10;
            this.C = size;
            if (size == 1) {
                this.y = -1;
                this.C = 0;
                this.F = 0;
                return 0;
            }
            int i11 = size + 1;
            this.C = i11;
            this.B = size;
            this.F = i11;
            return i11;
        }
        int i12 = this.C;
        this.y = i12;
        this.C = i12 + 2;
        this.w = i12 + 1;
        rp0 rp0Var = this.G;
        if (rp0Var.A0.size() > 0) {
            int i13 = this.C;
            int i14 = i13 + 1;
            this.C = i14;
            this.x = i13;
            this.A = i14;
            this.C = rp0Var.A0.size() + i14;
        }
        int i15 = this.C;
        int i16 = i15 + 1;
        this.C = i16;
        this.B = i15;
        this.F = i16;
        return i16;
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (i9 == this.B) {
            return 4;
        }
        if (i9 == this.y) {
            return 1;
        }
        if (i9 == this.w) {
            return 2;
        }
        if (i9 == this.x) {
            return 3;
        }
        return TextUtils.isEmpty(this.n) ? 0 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.text.SpannableStringBuilder] */
    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.b6 b6Var;
        TLObject tLObject2;
        String str3;
        int i10;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.b6 b6Var2;
        rp0 rp0Var = this.G;
        a0.h hVar = rp0Var.Q;
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 != 0 && i11 != 5) {
            if (i11 == 2) {
                ((wk0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        lp0 lp0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i12 = i9 - 1;
            if (i12 < this.d.size()) {
                fp0 fp0Var = (fp0) this.d.get(i12);
                j11 = fp0Var.a.id;
                str2 = fp0Var.d;
                tLObject = null;
            } else {
                i12 -= this.d.size();
                TLObject tLObject3 = (TLObject) lp0Var.d.get(i12);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j10 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j10 = -chat.id;
                    str = chat.title;
                }
                String str5 = lp0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i13 = org.telegram.ui.ActionBar.f6.q6;
                    b6Var = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new p00(i13, b6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j11 = j10;
            }
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                h6Var.t(tLObject, null, str2, null, false, false);
                h6Var.I = i12 < h() + (-2);
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
        int i14 = this.A;
        long j12 = 0;
        if (i14 < 0 || i9 < i14) {
            tLObject2 = null;
            str3 = null;
        } else {
            TLObject tLObject4 = ((of.e0) rp0Var.A0.get(i9 - i14)).a;
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
                i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i10).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j12 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = lp0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i15 = org.telegram.ui.ActionBar.f6.q6;
                b6Var2 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new p00(i15, b6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
                tLObject2 = tLObject4;
                str3 = spannableStringBuilder2;
            }
        }
        TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
        if (view instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
            h6Var2.I = i9 < h() + (-2);
        } else {
            String str8 = str3;
            if (view instanceof org.telegram.ui.Cells.e7) {
                ((org.telegram.ui.Cells.e7) view).c(j12, hVar.h(j12) >= 0, str8);
            }
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.b6 b6Var;
        View view;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var3;
        org.telegram.ui.ActionBar.b6 b6Var4;
        org.telegram.ui.ActionBar.b6 b6Var5;
        Context context = this.c;
        rp0 rp0Var = this.G;
        if (i9 == 0) {
            b6Var = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, b6Var);
            h6Var.A0 = true;
            h6Var.h0 = true;
            view = h6Var;
        } else if (i9 == 2) {
            b6Var2 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            va1 va1Var = new va1(context, 6, b6Var2);
            va1Var.setItemAnimator(null);
            va1Var.setLayoutAnimation(null);
            of.y yVar = new of.y(10);
            yVar.j1(0);
            va1Var.setLayoutManager(yVar);
            i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).currentAccount;
            b6Var3 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            mp0 mp0Var = new mp0(this, context, i10, b6Var3);
            this.D = mp0Var;
            va1Var.setAdapter(mp0Var);
            va1Var.setOnItemClickListener(new j(this, 12));
            view = va1Var;
        } else if (i9 == 3) {
            b6Var4 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            org.telegram.ui.Cells.v3 v3Var = new org.telegram.ui.Cells.v3(context, b6Var4);
            v3Var.setTextColor(org.telegram.ui.ActionBar.f6.f7);
            v3Var.setBackgroundColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.e7));
            v3Var.setText(LocaleController.getString(R.string.Recent));
            view = v3Var;
        } else if (i9 == 4) {
            view = new fh.l2(this, context, 21);
        } else if (i9 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp((!rp0Var.d0 || rp0Var.k0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            b6Var5 = ((org.telegram.ui.ActionBar.f3) rp0Var).resourcesProvider;
            View e7Var = new org.telegram.ui.Cells.e7(context, 0, b6Var5);
            e7Var.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(100.0f)));
            view = e7Var;
        }
        return new ik0(view);
    }
}
