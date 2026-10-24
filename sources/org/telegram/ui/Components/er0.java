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
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class er0 extends lm0 {
    public int G;
    public dr0 H;
    public int J;
    public final /* synthetic */ ir0 K;
    public final Context c;
    public final cr0 e;
    public br0 f;
    public br0 h;
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

    public er0(ir0 ir0Var, Context context) {
        this.K = ir0Var;
        this.c = context;
        cr0 cr0Var = new cr0(false);
        this.e = cr0Var;
        cr0Var.a = new ki.t1(this, 18);
    }

    @Override // org.telegram.ui.Components.lm0
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
            br0 br0Var = this.h;
            if (br0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(br0Var);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            l();
            this.K.P0(true);
            if (TextUtils.isEmpty(str)) {
                ir0.O0(this.K);
                this.r = -1;
                this.I = false;
            } else {
                this.I = true;
                int i10 = this.r + 1;
                this.r = i10;
                this.K.R.e(true, true);
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                br0 br0Var2 = new br0(this, str, i10, 0);
                this.f = br0Var2;
                dispatchQueue.postRunnable(br0Var2, 300L);
            }
            this.K.P0(false);
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
        ir0 ir0Var = this.K;
        if (ir0Var.F0.size() > 0) {
            int i14 = this.G;
            int i15 = i14 + 1;
            this.G = i15;
            this.x = i14;
            this.E = i15;
            this.G = ir0Var.F0.size() + i15;
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
        org.telegram.ui.ActionBar.g6 g6Var;
        TLObject tLObject2;
        String str3;
        int i11;
        int indexOfIgnoreCase2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        ir0 ir0Var = this.K;
        a0.h hVar = ir0Var.V;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 != 0 && i12 != 5) {
            if (i12 == 2) {
                ((mm0) view).getAdapter().l();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        String str4 = null;
        cr0 cr0Var = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat = null;
        if (!isEmpty) {
            int i13 = i10 - 1;
            if (i13 < this.d.size()) {
                wq0 wq0Var = (wq0) this.d.get(i13);
                j11 = wq0Var.a.id;
                str2 = wq0Var.d;
                tLObject = null;
            } else {
                i13 -= this.d.size();
                TLObject tLObject3 = (TLObject) cr0Var.d.get(i13);
                if (tLObject3 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject3;
                    j10 = user.id;
                    str = ContactsController.formatName(user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject3;
                    j10 = -chat.id;
                    str = chat.title;
                }
                String str5 = cr0Var.c;
                if (TextUtils.isEmpty(str5) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), str5)) == -1) {
                    str2 = str;
                    tLObject = tLObject3;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    int i14 = org.telegram.ui.ActionBar.k6.q6;
                    g6Var = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
                    spannableStringBuilder.setSpan(new m10(i14, g6Var), indexOfIgnoreCase, str5.length() + indexOfIgnoreCase, 33);
                    tLObject = tLObject3;
                    str2 = spannableStringBuilder;
                }
                j11 = j10;
            }
            if (view instanceof org.telegram.ui.Cells.i6) {
                org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                i6Var.t(tLObject, null, str2, null, false, false);
                i6Var.M = i13 < h() + (-2);
                return;
            } else {
                String str6 = str2;
                if (view instanceof org.telegram.ui.Cells.g7) {
                    ((org.telegram.ui.Cells.g7) view).c(j11, hVar.h(j11) >= 0, str6);
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
            TLObject tLObject4 = ((hg.g0) ir0Var.F0.get(i10 - i15)).a;
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
                i11 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                TLRPC.User user3 = MessagesController.getInstance(i11).getUser(Long.valueOf(tL_encryptedChat.user_id));
                if (user3 != null) {
                    j12 = user3.id;
                    str4 = ContactsController.formatName(user3.first_name, user3.last_name);
                }
            }
            String str7 = cr0Var.c;
            if (TextUtils.isEmpty(str7) || str4 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str4.toString(), str7)) == -1) {
                tLObject2 = tLObject4;
                str3 = str4;
            } else {
                ?? spannableStringBuilder2 = new SpannableStringBuilder(str4);
                int i16 = org.telegram.ui.ActionBar.k6.q6;
                g6Var2 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
                spannableStringBuilder2.setSpan(new m10(i16, g6Var2), indexOfIgnoreCase2, str7.length() + indexOfIgnoreCase2, 33);
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
                ((org.telegram.ui.Cells.g7) view).c(j12, hVar.h(j12) >= 0, str8);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.g6 g6Var;
        View view;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var3;
        org.telegram.ui.ActionBar.g6 g6Var4;
        org.telegram.ui.ActionBar.g6 g6Var5;
        org.telegram.ui.ActionBar.g6 g6Var6;
        Context context = this.c;
        ir0 ir0Var = this.K;
        if (i10 == 0) {
            g6Var = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, g6Var);
            i6Var.E0 = true;
            i6Var.l0 = true;
            view = i6Var;
        } else if (i10 == 2) {
            g6Var2 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            xa1 xa1Var = new xa1(context, 6, g6Var2);
            xa1Var.setItemAnimator(null);
            xa1Var.setLayoutAnimation(null);
            hg.a0 a0Var = new hg.a0(11);
            a0Var.j1(0);
            xa1Var.setLayoutManager(a0Var);
            i11 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
            g6Var3 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            dr0 dr0Var = new dr0(this, context, i11, g6Var3);
            this.H = dr0Var;
            xa1Var.setAdapter(dr0Var);
            xa1Var.setOnItemClickListener(new j(this, 12));
            view = xa1Var;
        } else if (i10 == 3) {
            g6Var4 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, g6Var4);
            u3Var.setTextColor(org.telegram.ui.ActionBar.k6.f7);
            int i12 = org.telegram.ui.ActionBar.k6.e7;
            g6Var5 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            org.telegram.ui.ActionBar.r6.i(i12, u3Var, g6Var5);
            u3Var.setText(LocaleController.getString(R.string.Recent));
            view = u3Var;
        } else if (i10 == 4) {
            view = new ai.jc(this, context, 22);
        } else if (i10 != 5) {
            View view2 = new View(context);
            view2.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp((!ir0Var.i0 || ir0Var.p0[1] == null) ? 56.0f : 109.0f)));
            view = view2;
        } else {
            g6Var6 = ((org.telegram.ui.ActionBar.h3) ir0Var).resourcesProvider;
            View g7Var = new org.telegram.ui.Cells.g7(context, 0, g6Var6);
            g7Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(100.0f)));
            view = g7Var;
        }
        return new wl0(view);
    }
}
