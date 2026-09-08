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
import org.telegram.ui.ec1;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class dq0 extends kl0 {
    public int G;
    public cq0 H;
    public int J;
    public final /* synthetic */ hq0 K;
    public final Context c;
    public final bq0 e;
    public aq0 f;
    public aq0 h;
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

    public dq0(hq0 hq0Var, Context context) {
        this.K = hq0Var;
        this.c = context;
        bq0 bq0Var = new bq0(false);
        this.e = bq0Var;
        bq0Var.a = new ji.u4(this, 14);
    }

    @Override // org.telegram.ui.Components.kl0
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
            aq0 aq0Var = this.h;
            if (aq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(aq0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.K.K0(true);
            if (TextUtils.isEmpty(str)) {
                hq0.F0(this.K);
                this.r = -1;
                this.I = false;
            } else {
                this.I = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.K.Q.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                aq0 aq0Var2 = new aq0(this, str, i10, 0);
                this.f = aq0Var2;
                dispatchQueue.postRunnable(aq0Var2, 300L);
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
        hq0 hq0Var = this.K;
        if (hq0Var.E0.size() > 0) {
            int i14 = this.G;
            int i15 = i14 + 1;
            this.G = i15;
            this.x = i14;
            this.E = i15;
            this.G = hq0Var.E0.size() + i15;
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
        org.telegram.ui.ActionBar.f6 f6Var;
        TLObject tLObject2;
        String str3;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        hq0 hq0Var = this.K;
        a0.i iVar = hq0Var.U;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((ll0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        bq0 bq0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i13 = i10 - 1;
            if (i13 < this.d.size()) {
                vp0 vp0Var = (vp0) this.d.get(i13);
                j10 = vp0Var.a.id;
                str2 = vp0Var.d;
                tLObject = null;
            } else {
                i13 -= this.d.size();
                TLObject tLObject3 = (TLObject) bq0Var.d.get(i13);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j3 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j3 = -chat.id;
                    str = chat.title;
                }
                String str5 = bq0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i14 = org.telegram.ui.ActionBar.j6.q6;
                    f6Var = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new e10(i14, f6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j10 = j3;
            }
            if (view instanceof org.telegram.ui.Cells.h6) {
                org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                h6Var.t(tLObject, null, str2, null, false, false);
                h6Var.M = i13 < h() + (-2);
                return;
            } else {
                String str6 = str2;
                if (view instanceof org.telegram.ui.Cells.f7) {
                    ((org.telegram.ui.Cells.f7) view).c(j10, iVar.h(j10) >= 0, str6);
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
            TLObject tLObject4 = ((hg.h0) hq0Var.E0.get(i10 - i15)).a;
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
                i11 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j11 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = bq0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i16 = org.telegram.ui.ActionBar.j6.q6;
                f6Var2 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new e10(i16, f6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
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
            if (view instanceof org.telegram.ui.Cells.f7) {
                ((org.telegram.ui.Cells.f7) view).c(j11, iVar.h(j11) >= 0, str8);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.f6 f6Var;
        View view;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var3;
        org.telegram.ui.ActionBar.f6 f6Var4;
        org.telegram.ui.ActionBar.f6 f6Var5;
        Context context = this.c;
        hq0 hq0Var = this.K;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
            org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, f6Var);
            h6Var.E0 = true;
            h6Var.l0 = true;
            view = h6Var;
        } else if (i10 == 2) {
            f6Var2 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
            ec1 ec1Var = new ec1(context, 6, f6Var2);
            ec1Var.setItemAnimator(null);
            ec1Var.setLayoutAnimation(null);
            hg.b0 b0Var = new hg.b0(11);
            b0Var.j1(0);
            ec1Var.setLayoutManager(b0Var);
            i11 = ((org.telegram.ui.ActionBar.f3) hq0Var).currentAccount;
            f6Var3 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
            cq0 cq0Var = new cq0(this, context, i11, f6Var3);
            this.H = cq0Var;
            ec1Var.setAdapter(cq0Var);
            ec1Var.setOnItemClickListener(new k(this, 12));
            view = ec1Var;
        } else if (i10 == 3) {
            f6Var4 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, f6Var4);
            u3Var.setTextColor(org.telegram.ui.ActionBar.j6.f7);
            u3Var.setBackgroundColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.e7));
            u3Var.setText(LocaleController.getString(R.string.Recent));
            view = u3Var;
        } else if (i10 == 4) {
            view = new di.eb(this, context, 22);
        } else if (i10 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp((!hq0Var.h0 || hq0Var.o0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            f6Var5 = ((org.telegram.ui.ActionBar.f3) hq0Var).resourcesProvider;
            View f7Var = new org.telegram.ui.Cells.f7(context, 0, f6Var5);
            f7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
            view = f7Var;
        }
        return new vk0(view);
    }
}
