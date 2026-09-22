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
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class sq0 extends xl0 {
    public int G;
    public rq0 H;
    public int J;
    public final /* synthetic */ wq0 K;
    public final Context c;
    public final qq0 e;
    public pq0 f;
    public pq0 h;
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

    public sq0(wq0 wq0Var, Context context) {
        this.K = wq0Var;
        this.c = context;
        qq0 qq0Var = new qq0(false);
        this.e = qq0Var;
        qq0Var.a = new l.d(this, 13);
    }

    @Override // org.telegram.ui.Components.xl0
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
            pq0 pq0Var = this.h;
            if (pq0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(pq0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.K.K0(true);
            if (TextUtils.isEmpty(str)) {
                wq0.F0(this.K);
                this.r = -1;
                this.I = false;
            } else {
                this.I = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.K.Q.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                pq0 pq0Var2 = new pq0(this, str, i10, 0);
                this.f = pq0Var2;
                dispatchQueue.postRunnable(pq0Var2, 300L);
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
        wq0 wq0Var = this.K;
        if (wq0Var.E0.size() > 0) {
            int i14 = this.G;
            int i15 = i14 + 1;
            this.G = i15;
            this.x = i14;
            this.E = i15;
            this.G = wq0Var.E0.size() + i15;
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
        wq0 wq0Var = this.K;
        a0.i iVar = wq0Var.U;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((yl0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        qq0 qq0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i13 = i10 - 1;
            if (i13 < this.d.size()) {
                kq0 kq0Var = (kq0) this.d.get(i13);
                j10 = kq0Var.a.id;
                str2 = kq0Var.d;
                tLObject = null;
            } else {
                i13 -= this.d.size();
                TLObject tLObject3 = (TLObject) qq0Var.d.get(i13);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j3 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j3 = -chat.id;
                    str = chat.title;
                }
                String str5 = qq0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i14 = org.telegram.ui.ActionBar.j6.q6;
                    f6Var = ((org.telegram.ui.ActionBar.f3) wq0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new e10(i14, f6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j10 = j3;
            }
            if (view instanceof org.telegram.ui.Cells.j6) {
                org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) view;
                j6Var.t(tLObject, null, str2, null, false, false);
                j6Var.M = i13 < h() + (-2);
                return;
            } else {
                String str6 = str2;
                if (view instanceof org.telegram.ui.Cells.h7) {
                    ((org.telegram.ui.Cells.h7) view).c(j10, iVar.h(j10) >= 0, str6);
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
            TLObject tLObject4 = ((gg.h0) wq0Var.E0.get(i10 - i15)).a;
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
                i11 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j11 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = qq0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i16 = org.telegram.ui.ActionBar.j6.q6;
                f6Var2 = ((org.telegram.ui.ActionBar.f3) wq0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new e10(i16, f6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
                tLObject2 = tLObject4;
                str3 = spannableStringBuilder2;
            }
        }
        TLRPC.TL_encryptedChat tL_encryptedChat2 = tL_encryptedChat;
        if (view instanceof org.telegram.ui.Cells.j6) {
            org.telegram.ui.Cells.j6 j6Var2 = (org.telegram.ui.Cells.j6) view;
            j6Var2.t(tLObject2, tL_encryptedChat2, str3, null, false, false);
            j6Var2.M = i10 < h() + (-2);
        } else {
            String str8 = str3;
            if (view instanceof org.telegram.ui.Cells.h7) {
                ((org.telegram.ui.Cells.h7) view).c(j11, iVar.h(j11) >= 0, str8);
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
        wq0 wq0Var = this.K;
        if (i10 == 0) {
            f6Var = ((org.telegram.ui.ActionBar.f3) wq0Var).resourcesProvider;
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, f6Var);
            j6Var.E0 = true;
            j6Var.l0 = true;
            view = j6Var;
        } else if (i10 == 2) {
            f6Var2 = ((org.telegram.ui.ActionBar.f3) wq0Var).resourcesProvider;
            fc1 fc1Var = new fc1(context, 6, f6Var2);
            fc1Var.setItemAnimator(null);
            fc1Var.setLayoutAnimation(null);
            gg.b0 b0Var = new gg.b0(11);
            b0Var.j1(0);
            fc1Var.setLayoutManager(b0Var);
            i11 = ((org.telegram.ui.ActionBar.f3) wq0Var).currentAccount;
            f6Var3 = ((org.telegram.ui.ActionBar.f3) wq0Var).resourcesProvider;
            rq0 rq0Var = new rq0(this, context, i11, f6Var3);
            this.H = rq0Var;
            fc1Var.setAdapter(rq0Var);
            fc1Var.setOnItemClickListener(new j(this, 12));
            view = fc1Var;
        } else if (i10 == 3) {
            f6Var4 = ((org.telegram.ui.ActionBar.f3) wq0Var).resourcesProvider;
            org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(context, f6Var4);
            w3Var.setTextColor(org.telegram.ui.ActionBar.j6.f7);
            w3Var.setBackgroundColor(wq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.e7));
            w3Var.setText(LocaleController.getString(R.string.Recent));
            view = w3Var;
        } else if (i10 == 4) {
            view = new ci.eb(this, context, 22);
        } else if (i10 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp((!wq0Var.h0 || wq0Var.o0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            f6Var5 = ((org.telegram.ui.ActionBar.f3) wq0Var).resourcesProvider;
            View h7Var = new org.telegram.ui.Cells.h7(context, 0, f6Var5);
            h7Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(100.0f)));
            view = h7Var;
        }
        return new il0(view);
    }
}
