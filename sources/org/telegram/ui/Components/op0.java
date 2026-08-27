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
import org.telegram.ui.ta1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class op0 extends yk0 {
    public int C;
    public np0 D;
    public int F;
    public final /* synthetic */ sp0 G;
    public final Context c;
    public final mp0 e;
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

    public op0(sp0 sp0Var, Context context) {
        this.G = sp0Var;
        this.c = context;
        mp0 mp0Var = new mp0(false);
        this.e = mp0Var;
        mp0Var.a = new n2.b0(this, 12);
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f;
        return (i10 == 1 || i10 == 4) ? false : true;
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
                sp0.F0(this.G);
                this.r = -1;
                this.E = false;
            } else {
                this.E = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.G.M.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                kp0 kp0Var2 = new kp0(this, str, i10, 0);
                this.f = kp0Var2;
                dispatchQueue.postRunnable(kp0Var2, 300L);
            }
            this.G.K0(false);
        }
    }

    @Override // f2.q0
    public final int h() {
        this.C = 0;
        this.w = -1;
        this.x = -1;
        this.A = -1;
        this.B = -1;
        if (!TextUtils.isEmpty(this.n)) {
            int i10 = this.C;
            int i11 = i10 + 1;
            this.C = i11;
            this.y = i10;
            int size = this.e.d.size() + this.d.size() + i11;
            this.C = size;
            if (size == 1) {
                this.y = -1;
                this.C = 0;
                this.F = 0;
                return 0;
            }
            int i12 = size + 1;
            this.C = i12;
            this.B = size;
            this.F = i12;
            return i12;
        }
        int i13 = this.C;
        this.y = i13;
        this.C = i13 + 2;
        this.w = i13 + 1;
        sp0 sp0Var = this.G;
        if (sp0Var.A0.size() > 0) {
            int i14 = this.C;
            int i15 = i14 + 1;
            this.C = i15;
            this.x = i14;
            this.A = i15;
            this.C = sp0Var.A0.size() + i15;
        }
        int i16 = this.C;
        int i17 = i16 + 1;
        this.C = i17;
        this.B = i16;
        this.F = i17;
        return i17;
    }

    @Override // f2.q0
    public final int j(int i10) {
        if (i10 == this.B) {
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
    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.c6 c6Var;
        TLObject tLObject2;
        String str3;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        sp0 sp0Var = this.G;
        a0.h hVar = sp0Var.Q;
        int i12 = o1Var.f;
        View view = o1Var.a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((zk0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        mp0 mp0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i13 = i10 - 1;
            if (i13 < this.d.size()) {
                fp0 fp0Var = (fp0) this.d.get(i13);
                j11 = fp0Var.a.id;
                str2 = fp0Var.d;
                tLObject = null;
            } else {
                i13 -= this.d.size();
                TLObject tLObject3 = (TLObject) mp0Var.d.get(i13);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j10 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j10 = -chat.id;
                    str = chat.title;
                }
                String str5 = mp0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i14 = org.telegram.ui.ActionBar.g6.q6;
                    c6Var = ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new s00(i14, c6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j11 = j10;
            }
            if (view instanceof org.telegram.ui.Cells.e6) {
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                e6Var.u(tLObject, null, str2, null, false, false);
                e6Var.I = i13 < h() + (-2);
                return;
            } else {
                String str6 = str2;
                if (view instanceof org.telegram.ui.Cells.b7) {
                    ((org.telegram.ui.Cells.b7) view).c(j11, hVar.h(j11) >= 0, str6);
                    return;
                }
                return;
            }
        }
        int i15 = this.A;
        long j12 = 0;
        if (i15 < 0 || i10 < i15) {
            tLObject2 = null;
            str3 = null;
        } else {
            TLObject tLObject4 = ((pf.y) sp0Var.A0.get(i10 - i15)).a;
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
                i11 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j12 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = mp0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i16 = org.telegram.ui.ActionBar.g6.q6;
                c6Var2 = ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new s00(i16, c6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
                tLObject2 = tLObject4;
                str3 = spannableStringBuilder2;
            }
        }
        TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
        if (view instanceof org.telegram.ui.Cells.e6) {
            org.telegram.ui.Cells.e6 e6Var2 = (org.telegram.ui.Cells.e6) view;
            e6Var2.u(tLObject2, tL_encryptedChat2, str3, null, false, false);
            e6Var2.I = i10 < h() + (-2);
        } else {
            String str8 = str3;
            if (view instanceof org.telegram.ui.Cells.b7) {
                ((org.telegram.ui.Cells.b7) view).c(j12, hVar.h(j12) >= 0, str8);
            }
        }
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        Context context = this.c;
        sp0 sp0Var = this.G;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider;
            org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, c6Var);
            e6Var.A0 = true;
            e6Var.h0 = true;
            view = e6Var;
        } else if (i10 == 2) {
            c6Var2 = ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider;
            ta1 ta1Var = new ta1(context, 5, c6Var2);
            ta1Var.setItemAnimator(null);
            ta1Var.setLayoutAnimation(null);
            org.telegram.ui.j jVar = new org.telegram.ui.j(9);
            jVar.j1(0);
            ta1Var.setLayoutManager(jVar);
            i11 = ((org.telegram.ui.ActionBar.e3) sp0Var).currentAccount;
            c6Var3 = ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider;
            np0 np0Var = new np0(this, context, i11, c6Var3);
            this.D = np0Var;
            ta1Var.setAdapter(np0Var);
            ta1Var.setOnItemClickListener(new j(this, 12));
            view = ta1Var;
        } else if (i10 == 3) {
            c6Var4 = ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider;
            org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, c6Var4);
            s3Var.setTextColor(org.telegram.ui.ActionBar.g6.f7);
            s3Var.setBackgroundColor(sp0Var.getThemedColor(org.telegram.ui.ActionBar.g6.e7));
            s3Var.setText(LocaleController.getString(R.string.Recent));
            view = s3Var;
        } else if (i10 == 4) {
            view = new ag.s0(this, context, 21);
        } else if (i10 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp((!sp0Var.d0 || sp0Var.k0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            c6Var5 = ((org.telegram.ui.ActionBar.e3) sp0Var).resourcesProvider;
            View b7Var = new org.telegram.ui.Cells.b7(context, 0, c6Var5);
            b7Var.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(100.0f)));
            view = b7Var;
        }
        return new lk0(view);
    }
}
