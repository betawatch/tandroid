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
import org.telegram.ui.jb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class hq0 extends rl0 {
    public int D;
    public gq0 E;
    public int G;
    public final /* synthetic */ lq0 H;
    public final Context c;
    public final fq0 e;
    public eq0 f;
    public eq0 h;
    public String n;
    public int r;
    public int s;
    public int v;
    public ArrayList d = new ArrayList();
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public int B = -1;
    public int C = -1;
    public boolean F = false;

    public hq0(lq0 lq0Var, Context context) {
        this.H = lq0Var;
        this.c = context;
        fq0 fq0Var = new fq0(false);
        this.e = fq0Var;
        fq0Var.a = new qk0(this, 1);
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        return (i10 == 1 || i10 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.searchQueue.cancelRunnable(this.f);
                this.f = null;
            }
            eq0 eq0Var = this.h;
            if (eq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(eq0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.H.K0(true);
            if (TextUtils.isEmpty(str)) {
                lq0.F0(this.H);
                this.r = -1;
                this.F = false;
            } else {
                this.F = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.H.N.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                eq0 eq0Var2 = new eq0(this, str, i10, 0);
                this.f = eq0Var2;
                dispatchQueue.postRunnable(eq0Var2, 300L);
            }
            this.H.K0(false);
        }
    }

    @Override // f2.o0
    public final int h() {
        this.D = 0;
        this.w = -1;
        this.x = -1;
        this.B = -1;
        this.C = -1;
        if (!TextUtils.isEmpty(this.n)) {
            int i10 = this.D;
            int i11 = i10 + 1;
            this.D = i11;
            this.y = i10;
            int size = this.e.d.size() + this.d.size() + i11;
            this.D = size;
            if (size == 1) {
                this.y = -1;
                this.D = 0;
                this.G = 0;
                return 0;
            }
            int i12 = size + 1;
            this.D = i12;
            this.C = size;
            this.G = i12;
            return i12;
        }
        int i13 = this.D;
        this.y = i13;
        this.D = i13 + 2;
        this.w = i13 + 1;
        lq0 lq0Var = this.H;
        if (lq0Var.B0.size() > 0) {
            int i14 = this.D;
            int i15 = i14 + 1;
            this.D = i15;
            this.x = i14;
            this.B = i15;
            this.D = lq0Var.B0.size() + i15;
        }
        int i16 = this.D;
        int i17 = i16 + 1;
        this.D = i17;
        this.C = i16;
        this.G = i17;
        return i17;
    }

    @Override // f2.o0
    public final int j(int i10) {
        if (i10 == this.C) {
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
    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        long j10;
        String str;
        String str2;
        TLObject tLObject;
        long j11;
        int indexOfIgnoreCase;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLObject tLObject2;
        String str3;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        lq0 lq0Var = this.H;
        a0.h hVar = lq0Var.R;
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((sl0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        fq0 fq0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i13 = i10 - 1;
            if (i13 < this.d.size()) {
                zp0 zp0Var = (zp0) this.d.get(i13);
                j11 = zp0Var.a.id;
                str2 = zp0Var.d;
                tLObject = null;
            } else {
                i13 -= this.d.size();
                TLObject tLObject3 = (TLObject) fq0Var.d.get(i13);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j10 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j10 = -chat.id;
                    str = chat.title;
                }
                String str5 = fq0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i14 = org.telegram.ui.ActionBar.j6.q6;
                    f6Var = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new e10(i14, f6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j11 = j10;
            }
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                h6Var.t(tLObject, null, str2, null, false, false);
                h6Var.J = i13 < h() + (-2);
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
        int i15 = this.B;
        long j12 = 0;
        if (i15 < 0 || i10 < i15) {
            tLObject2 = null;
            str3 = null;
        } else {
            TLObject tLObject4 = ((tf.y) lq0Var.B0.get(i10 - i15)).a;
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
                i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j12 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = fq0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i16 = org.telegram.ui.ActionBar.j6.q6;
                f6Var2 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new e10(i16, f6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
                tLObject2 = tLObject4;
                str3 = spannableStringBuilder2;
            }
        }
        TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
        if (view instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
            h6Var2.J = i10 < h() + (-2);
        } else {
            String str8 = str3;
            if (view instanceof org.telegram.ui.Cells.e7) {
                ((org.telegram.ui.Cells.e7) view).c(j12, hVar.h(j12) >= 0, str8);
            }
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        Context context = this.c;
        lq0 lq0Var = this.H;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, f6Var);
            h6Var.B0 = true;
            h6Var.i0 = true;
            view = h6Var;
        } else if (i10 == 2) {
            f6Var2 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            jb1 jb1Var = new jb1(context, 5, f6Var2);
            jb1Var.setItemAnimator(null);
            jb1Var.setLayoutAnimation(null);
            org.telegram.ui.k kVar = new org.telegram.ui.k(9);
            kVar.j1(0);
            jb1Var.setLayoutManager(kVar);
            i11 = ((org.telegram.ui.ActionBar.g3) lq0Var).currentAccount;
            f6Var3 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            gq0 gq0Var = new gq0(this, context, i11, f6Var3);
            this.E = gq0Var;
            jb1Var.setAdapter(gq0Var);
            jb1Var.setOnItemClickListener(new k(this, 12));
            view = jb1Var;
        } else if (i10 == 3) {
            f6Var4 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, f6Var4);
            u3Var.setTextColor(org.telegram.ui.ActionBar.j6.f7);
            u3Var.setBackgroundColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.e7));
            u3Var.setText(LocaleController.getString(R.string.Recent));
            view = u3Var;
        } else if (i10 == 4) {
            view = new eg.h0(this, context, 17);
        } else if (i10 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp((!lq0Var.e0 || lq0Var.l0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            f6Var5 = ((org.telegram.ui.ActionBar.g3) lq0Var).resourcesProvider;
            View e7Var = new org.telegram.ui.Cells.e7(context, 0, f6Var5);
            e7Var.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(100.0f)));
            view = e7Var;
        }
        return new el0(view);
    }
}
