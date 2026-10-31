package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class or extends org.telegram.ui.Components.sk0 {
    public final /* synthetic */ pr D;
    public final Context c;
    public final zf.m1 h;
    public mr n;
    public boolean s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public or(pr prVar, Context context) {
        this.D = prVar;
        this.c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.h = m1Var;
        m1Var.a = new nr(this);
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.e5) {
            ((org.telegram.ui.Cells.e5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f != 1;
    }

    public final TLObject E(int i10) {
        zf.m1 m1Var = this.h;
        int size = m1Var.g.size();
        if (size != 0) {
            int i11 = size + 1;
            if (i11 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) m1Var.g.get(i10 - 1);
            }
            i10 -= i11;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i12 = size2 + 1;
            if (i12 > i10) {
                if (i10 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i10 - 1);
            }
            i10 -= i12;
        }
        int size3 = m1Var.e.size();
        if (size3 == 0 || size3 + 1 <= i10 || i10 == 0) {
            return null;
        }
        return (TLObject) m1Var.e.get(i10 - 1);
    }

    public final void F(String str) {
        if (this.n != null) {
            Utilities.g.a(this.n);
            this.n = null;
        }
        this.d.clear();
        this.e.b();
        this.f.clear();
        this.h.f(null, null);
        zf.m1 m1Var = this.h;
        pr prVar = this.D;
        m1Var.g(null, prVar.N != 0, false, true, false, org.telegram.messenger.w3.T(prVar.n) ? this.D.M : 0L, false, this.D.N, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.D.b.e(true, true);
        org.telegram.messenger.r5 r5Var = Utilities.g;
        mr mrVar = new mr(this, str, 0);
        this.n = mrVar;
        r5Var.d(mrVar, 300L);
    }

    @Override // s4.g0
    public final int b() {
        return this.r;
    }

    @Override // s4.g0
    public final int d(int i10) {
        return (i10 == this.y || i10 == this.w || i10 == this.x) ? 1 : 0;
    }

    @Override // s4.g0
    public final void f() {
        ag.b1 b1Var;
        this.r = 0;
        zf.m1 m1Var = this.h;
        int size = m1Var.g.size();
        if (size != 0) {
            this.w = 0;
            this.r = size + 1 + this.r;
        } else {
            this.w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i10 = this.r;
            this.x = i10;
            this.r = size2 + 1 + i10;
        } else {
            this.x = -1;
        }
        int size3 = m1Var.e.size();
        if (size3 != 0) {
            int i11 = this.r;
            this.y = i11;
            this.r = size3 + 1 + i11;
        } else {
            this.y = -1;
        }
        pr prVar = this.D;
        if (prVar.n1 && (b1Var = prVar.c) != null) {
            s4.g0 adapter = b1Var.getAdapter();
            or orVar = prVar.e;
            if (adapter != orVar) {
                ag.b1 b1Var2 = prVar.c;
                b1Var2.W1 = true;
                b1Var2.X1 = 0;
                b1Var2.setAdapter(orVar);
                prVar.c.setFastScrollVisible(false);
                prVar.c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x011e  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        String K;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLObject tLObject;
        int size;
        String str;
        boolean z10;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        String str3;
        int A1;
        int size2;
        int size3;
        int i11;
        String str4;
        int i12 = i10;
        int i13 = c1Var.f;
        View view = c1Var.a;
        pr prVar = this.D;
        if (i13 != 0) {
            if (i13 != 1) {
                return;
            }
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i12 != this.w) {
                if (i12 == this.y) {
                    z3Var.setText(org.telegram.messenger.cd.L0(2131749544, null));
                    return;
                } else {
                    if (i12 == this.x) {
                        z3Var.setText(org.telegram.messenger.cd.L0(2131751780, null));
                        return;
                    }
                    return;
                }
            }
            int i14 = prVar.N;
            if (i14 == 0) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131752451, null));
                return;
            }
            if (i14 == 3) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131752308, null));
                return;
            } else if (prVar.s) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131752289, null));
                return;
            } else {
                z3Var.setText(org.telegram.messenger.cd.L0(2131752377, null));
                return;
            }
        }
        TLObject E = E(i12);
        if (!(E instanceof TLRPC.User)) {
            if (E instanceof TLRPC.ChannelParticipant) {
                long C1 = org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) E).peer);
                if (C1 >= 0) {
                    TLRPC.User Z1 = prVar.getMessagesController().Z1(Long.valueOf(C1));
                    chat = Z1;
                    if (Z1 != null) {
                        K = org.telegram.messenger.h20.n(Z1);
                        chat2 = Z1;
                        tLObject = chat2;
                    }
                    K = null;
                    chat2 = chat;
                    tLObject = chat2;
                } else {
                    TLRPC.Chat L0 = prVar.getMessagesController().L0(Long.valueOf(-C1));
                    chat = L0;
                    if (L0 != null) {
                        K = org.telegram.messenger.w3.K(L0, false);
                        chat2 = L0;
                        tLObject = chat2;
                    }
                    K = null;
                    chat2 = chat;
                    tLObject = chat2;
                }
                zf.m1 m1Var = this.h;
                size = m1Var.g.size();
                if (size != 0) {
                    int i15 = size + 1;
                    if (i15 > i12) {
                        str = m1Var.n;
                        z10 = true;
                        if (!z10 && (size3 = this.d.size()) != 0) {
                            i11 = size3 + 1;
                            if (i11 <= i12) {
                                CharSequence charSequence = (CharSequence) this.f.get(i12 - 1);
                                if (charSequence != 0 && !TextUtils.isEmpty(K)) {
                                    if (charSequence.toString().startsWith("@" + K)) {
                                        spannableStringBuilder = null;
                                        str4 = charSequence;
                                        z10 = true;
                                        str2 = str4;
                                        str3 = str2;
                                        str3 = str2;
                                        if (!z10 && K != null) {
                                            size2 = m1Var.e.size();
                                            str3 = str2;
                                            if (size2 != 0) {
                                                str3 = str2;
                                                if (size2 + 1 > i12) {
                                                    String str5 = m1Var.c;
                                                    if (str5.startsWith("@")) {
                                                        str5 = str5.substring(1);
                                                    }
                                                    try {
                                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                        spannableStringBuilder2.append((CharSequence) "@");
                                                        spannableStringBuilder2.append((CharSequence) K);
                                                        int A12 = org.telegram.messenger.i0.A1(K, str5);
                                                        str3 = spannableStringBuilder2;
                                                        if (A12 != -1) {
                                                            int length = str5.length();
                                                            if (A12 == 0) {
                                                                length++;
                                                            } else {
                                                                A12++;
                                                            }
                                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, null), A12, length + A12, 33);
                                                            str3 = spannableStringBuilder2;
                                                        }
                                                    } catch (Exception e) {
                                                        org.telegram.messenger.f8.g(e, true);
                                                        str3 = K;
                                                    }
                                                }
                                            }
                                        }
                                        if (str != null && K != null) {
                                            spannableStringBuilder = new SpannableStringBuilder(K);
                                            A1 = org.telegram.messenger.i0.A1(K, str);
                                            if (A1 != -1) {
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, null), A1, str.length() + A1, 33);
                                            }
                                        }
                                        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
                                        e5Var.setTag(Integer.valueOf(i12));
                                        e5Var.c(tLObject, spannableStringBuilder, str3, false);
                                    }
                                }
                                str4 = null;
                                spannableStringBuilder = charSequence;
                                z10 = true;
                                str2 = str4;
                                str3 = str2;
                                str3 = str2;
                                if (!z10) {
                                    size2 = m1Var.e.size();
                                    str3 = str2;
                                    if (size2 != 0) {
                                    }
                                }
                                if (str != null) {
                                    spannableStringBuilder = new SpannableStringBuilder(K);
                                    A1 = org.telegram.messenger.i0.A1(K, str);
                                    if (A1 != -1) {
                                    }
                                }
                                org.telegram.ui.Cells.e5 e5Var2 = (org.telegram.ui.Cells.e5) view;
                                e5Var2.setTag(Integer.valueOf(i12));
                                e5Var2.c(tLObject, spannableStringBuilder, str3, false);
                            }
                            i12 -= i11;
                        }
                        str2 = null;
                        spannableStringBuilder = null;
                        str3 = str2;
                        str3 = str2;
                        if (!z10) {
                        }
                        if (str != null) {
                        }
                        org.telegram.ui.Cells.e5 e5Var22 = (org.telegram.ui.Cells.e5) view;
                        e5Var22.setTag(Integer.valueOf(i12));
                        e5Var22.c(tLObject, spannableStringBuilder, str3, false);
                    }
                    i12 -= i15;
                }
                str = null;
                z10 = false;
                if (!z10) {
                    i11 = size3 + 1;
                    if (i11 <= i12) {
                    }
                }
                str2 = null;
                spannableStringBuilder = null;
                str3 = str2;
                str3 = str2;
                if (!z10) {
                }
                if (str != null) {
                }
                org.telegram.ui.Cells.e5 e5Var222 = (org.telegram.ui.Cells.e5) view;
                e5Var222.setTag(Integer.valueOf(i12));
                e5Var222.c(tLObject, spannableStringBuilder, str3, false);
            }
            if (!(E instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                E = prVar.getMessagesController().Z1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
            }
        }
        tLObject = E;
        K = null;
        zf.m1 m1Var2 = this.h;
        size = m1Var2.g.size();
        if (size != 0) {
        }
        str = null;
        z10 = false;
        if (!z10) {
        }
        str2 = null;
        spannableStringBuilder = null;
        str3 = str2;
        str3 = str2;
        if (!z10) {
        }
        if (str != null) {
        }
        org.telegram.ui.Cells.e5 e5Var2222 = (org.telegram.ui.Cells.e5) view;
        e5Var2222.setTag(Integer.valueOf(i12));
        e5Var2222.c(tLObject, spannableStringBuilder, str3, false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        org.telegram.ui.ActionBar.p6 p6Var;
        pr prVar = this.D;
        if (i10 != 0) {
            p6Var = ((org.telegram.ui.ActionBar.k2) prVar).resourceProvider;
            view = new org.telegram.ui.Cells.z3(26, this.c, p6Var);
            view.setBackground(null);
        } else {
            org.telegram.ui.Cells.e5 e5Var = new org.telegram.ui.Cells.e5(2, 2, this.c, null, prVar.d1 == 0);
            e5Var.G = true;
            e5Var.setDelegate(new nr(this));
            view = e5Var;
        }
        return new org.telegram.ui.Components.ck0(view);
    }
}
