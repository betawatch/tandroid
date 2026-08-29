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
import org.telegram.ui.wa1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zp0 extends il0 {
    public int C;
    public yp0 D;
    public int F;
    public final /* synthetic */ dq0 G;
    public final Context c;
    public final xp0 e;
    public vp0 f;
    public vp0 h;
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

    public zp0(dq0 dq0Var, Context context) {
        this.G = dq0Var;
        this.c = context;
        xp0 xp0Var = new xp0(false);
        this.e = xp0Var;
        xp0Var.a = new nh.d6(this, 10);
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f;
        return (i10 == 1 || i10 == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.searchQueue.cancelRunnable(this.f);
                this.f = null;
            }
            vp0 vp0Var = this.h;
            if (vp0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(vp0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.G.K0(true);
            if (TextUtils.isEmpty(str)) {
                dq0.F0(this.G);
                this.r = -1;
                this.E = false;
            } else {
                this.E = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.G.M.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                vp0 vp0Var2 = new vp0(this, str, i10, 0);
                this.f = vp0Var2;
                dispatchQueue.postRunnable(vp0Var2, 300L);
            }
            this.G.K0(false);
        }
    }

    @Override // f2.p0
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
        dq0 dq0Var = this.G;
        if (dq0Var.A0.size() > 0) {
            int i14 = this.C;
            int i15 = i14 + 1;
            this.C = i15;
            this.x = i14;
            this.A = i15;
            this.C = dq0Var.A0.size() + i15;
        }
        int i16 = this.C;
        int i17 = i16 + 1;
        this.C = i17;
        this.B = i16;
        this.F = i17;
        return i17;
    }

    @Override // f2.p0
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
    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
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
        dq0 dq0Var = this.G;
        a0.h hVar = dq0Var.Q;
        int i12 = n1Var.f;
        View view = n1Var.a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((jl0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        xp0 xp0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i13 = i10 - 1;
            if (i13 < this.d.size()) {
                qp0 qp0Var = (qp0) this.d.get(i13);
                j11 = qp0Var.a.id;
                str2 = qp0Var.d;
                tLObject = null;
            } else {
                i13 -= this.d.size();
                TLObject tLObject3 = (TLObject) xp0Var.d.get(i13);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j10 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j10 = -chat.id;
                    str = chat.title;
                }
                String str5 = xp0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i14 = org.telegram.ui.ActionBar.g6.q6;
                    c6Var = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new a10(i14, c6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j11 = j10;
            }
            if (view instanceof org.telegram.ui.Cells.f6) {
                org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
                f6Var.t(tLObject, null, str2, null, false, false);
                f6Var.I = i13 < h() + (-2);
                return;
            } else {
                String str6 = str2;
                if (view instanceof org.telegram.ui.Cells.c7) {
                    ((org.telegram.ui.Cells.c7) view).c(j11, hVar.h(j11) >= 0, str6);
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
            TLObject tLObject4 = ((rf.z) dq0Var.A0.get(i10 - i15)).a;
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
                i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j12 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = xp0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i16 = org.telegram.ui.ActionBar.g6.q6;
                c6Var2 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new a10(i16, c6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
                tLObject2 = tLObject4;
                str3 = spannableStringBuilder2;
            }
        }
        TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
        if (view instanceof org.telegram.ui.Cells.f6) {
            org.telegram.ui.Cells.f6 f6Var2 = (org.telegram.ui.Cells.f6) view;
            f6Var2.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
            f6Var2.I = i10 < h() + (-2);
        } else {
            String str8 = str3;
            if (view instanceof org.telegram.ui.Cells.c7) {
                ((org.telegram.ui.Cells.c7) view).c(j12, hVar.h(j12) >= 0, str8);
            }
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c6 c6Var;
        View view;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var3;
        org.telegram.ui.ActionBar.c6 c6Var4;
        org.telegram.ui.ActionBar.c6 c6Var5;
        Context context = this.c;
        dq0 dq0Var = this.G;
        if (i10 == 0) {
            c6Var = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, c6Var);
            f6Var.A0 = true;
            f6Var.h0 = true;
            view = f6Var;
        } else if (i10 == 2) {
            c6Var2 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            wa1 wa1Var = new wa1(context, 5, c6Var2);
            wa1Var.setItemAnimator(null);
            wa1Var.setLayoutAnimation(null);
            org.telegram.ui.k kVar = new org.telegram.ui.k(9);
            kVar.j1(0);
            wa1Var.setLayoutManager(kVar);
            i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).currentAccount;
            c6Var3 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            yp0 yp0Var = new yp0(this, context, i11, c6Var3);
            this.D = yp0Var;
            wa1Var.setAdapter(yp0Var);
            wa1Var.setOnItemClickListener(new k(this, 12));
            view = wa1Var;
        } else if (i10 == 3) {
            c6Var4 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            org.telegram.ui.Cells.s3 s3Var = new org.telegram.ui.Cells.s3(context, c6Var4);
            s3Var.setTextColor(org.telegram.ui.ActionBar.g6.f7);
            s3Var.setBackgroundColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.e7));
            s3Var.setText(LocaleController.getString(R.string.Recent));
            view = s3Var;
        } else if (i10 == 4) {
            view = new cg.h0(this, context, 19);
        } else if (i10 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp((!dq0Var.d0 || dq0Var.k0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            c6Var5 = ((org.telegram.ui.ActionBar.f3) dq0Var).resourcesProvider;
            View c7Var = new org.telegram.ui.Cells.c7(context, 0, c6Var5);
            c7Var.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(100.0f)));
            view = c7Var;
        }
        return new vk0(view);
    }
}
