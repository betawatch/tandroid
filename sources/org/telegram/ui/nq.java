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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class nq extends org.telegram.ui.Components.oj0 {
    public final /* synthetic */ oq D;
    public final Context c;
    public final jg.z1 h;
    public lq n;
    public boolean s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public a0.h e = new a0.h();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public nq(oq oqVar, Context context) {
        this.D = oqVar;
        this.c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.h = z1Var;
        z1Var.a = new mq(this);
    }

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return d1Var.f != 1;
    }

    public final TLObject E(int i7) {
        jg.z1 z1Var = this.h;
        int size = z1Var.g.size();
        if (size != 0) {
            int i10 = size + 1;
            if (i10 > i7) {
                if (i7 == 0) {
                    return null;
                }
                return (TLObject) z1Var.g.get(i7 - 1);
            }
            i7 -= i10;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i11 = size2 + 1;
            if (i11 > i7) {
                if (i7 == 0) {
                    return null;
                }
                return (TLObject) this.d.get(i7 - 1);
            }
            i7 -= i11;
        }
        int size3 = z1Var.e.size();
        if (size3 == 0 || size3 + 1 <= i7 || i7 == 0) {
            return null;
        }
        return (TLObject) z1Var.e.get(i7 - 1);
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
        jg.z1 z1Var = this.h;
        oq oqVar = this.D;
        z1Var.g(null, oqVar.N != 0, false, true, false, org.telegram.messenger.t3.T(oqVar.n) ? this.D.M : 0L, false, this.D.N, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.D.b.e(true, true);
        org.telegram.messenger.p5 p5Var = Utilities.g;
        lq lqVar = new lq(this, str, 0);
        this.n = lqVar;
        p5Var.d(lqVar, 300L);
    }

    @Override // v4.g0
    public final int b() {
        return this.r;
    }

    @Override // v4.g0
    public final int d(int i7) {
        return (i7 == this.y || i7 == this.w || i7 == this.x) ? 1 : 0;
    }

    @Override // v4.g0
    public final void f() {
        bi.q1 q1Var;
        this.r = 0;
        jg.z1 z1Var = this.h;
        int size = z1Var.g.size();
        if (size != 0) {
            this.w = 0;
            this.r = size + 1 + this.r;
        } else {
            this.w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i7 = this.r;
            this.x = i7;
            this.r = size2 + 1 + i7;
        } else {
            this.x = -1;
        }
        int size3 = z1Var.e.size();
        if (size3 != 0) {
            int i10 = this.r;
            this.y = i10;
            this.r = size3 + 1 + i10;
        } else {
            this.y = -1;
        }
        oq oqVar = this.D;
        if (oqVar.n1 && (q1Var = oqVar.c) != null) {
            v4.g0 adapter = q1Var.getAdapter();
            nq nqVar = oqVar.e;
            if (adapter != nqVar) {
                bi.q1 q1Var2 = oqVar.c;
                q1Var2.W1 = true;
                q1Var2.X1 = 0;
                q1Var2.setAdapter(nqVar);
                oqVar.c.setFastScrollVisible(false);
                oqVar.c.setVerticalScrollBarEnabled(true);
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
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        String K;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        TLObject tLObject;
        int size;
        String str;
        boolean z9;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        String str3;
        int A1;
        int size2;
        int size3;
        int i10;
        String str4;
        int i11 = i7;
        int i12 = d1Var.f;
        View view = d1Var.a;
        oq oqVar = this.D;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i11 != this.w) {
                if (i11 == this.y) {
                    x3Var.setText(org.telegram.messenger.hd.M0(2131749534, null));
                    return;
                } else {
                    if (i11 == this.x) {
                        x3Var.setText(org.telegram.messenger.hd.M0(2131751780, null));
                        return;
                    }
                    return;
                }
            }
            int i13 = oqVar.N;
            if (i13 == 0) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131752451, null));
                return;
            }
            if (i13 == 3) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131752308, null));
                return;
            } else if (oqVar.s) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131752289, null));
                return;
            } else {
                x3Var.setText(org.telegram.messenger.hd.M0(2131752377, null));
                return;
            }
        }
        TLObject E = E(i11);
        if (!(E instanceof TLRPC.User)) {
            if (E instanceof TLRPC.ChannelParticipant) {
                long C1 = org.telegram.messenger.ij.C1(((TLRPC.ChannelParticipant) E).peer);
                if (C1 >= 0) {
                    TLRPC.User a22 = oqVar.getMessagesController().a2(Long.valueOf(C1));
                    chat = a22;
                    if (a22 != null) {
                        K = org.telegram.messenger.t10.n(a22);
                        chat2 = a22;
                        tLObject = chat2;
                    }
                    K = null;
                    chat2 = chat;
                    tLObject = chat2;
                } else {
                    TLRPC.Chat M0 = oqVar.getMessagesController().M0(Long.valueOf(-C1));
                    chat = M0;
                    if (M0 != null) {
                        K = org.telegram.messenger.t3.K(M0, false);
                        chat2 = M0;
                        tLObject = chat2;
                    }
                    K = null;
                    chat2 = chat;
                    tLObject = chat2;
                }
                jg.z1 z1Var = this.h;
                size = z1Var.g.size();
                if (size != 0) {
                    int i14 = size + 1;
                    if (i14 > i11) {
                        str = z1Var.n;
                        z9 = true;
                        if (!z9 && (size3 = this.d.size()) != 0) {
                            i10 = size3 + 1;
                            if (i10 <= i11) {
                                CharSequence charSequence = (CharSequence) this.f.get(i11 - 1);
                                if (charSequence != 0 && !TextUtils.isEmpty(K)) {
                                    if (charSequence.toString().startsWith("@" + K)) {
                                        spannableStringBuilder = null;
                                        str4 = charSequence;
                                        z9 = true;
                                        str2 = str4;
                                        str3 = str2;
                                        str3 = str2;
                                        if (!z9 && K != null) {
                                            size2 = z1Var.e.size();
                                            str3 = str2;
                                            if (size2 != 0) {
                                                str3 = str2;
                                                if (size2 + 1 > i11) {
                                                    String str5 = z1Var.c;
                                                    if (str5.startsWith("@")) {
                                                        str5 = str5.substring(1);
                                                    }
                                                    try {
                                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                                        spannableStringBuilder2.append((CharSequence) "@");
                                                        spannableStringBuilder2.append((CharSequence) K);
                                                        int A12 = org.telegram.messenger.g0.A1(K, str5);
                                                        str3 = spannableStringBuilder2;
                                                        if (A12 != -1) {
                                                            int length = str5.length();
                                                            if (A12 == 0) {
                                                                length++;
                                                            } else {
                                                                A12++;
                                                            }
                                                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.q6, null), A12, length + A12, 33);
                                                            str3 = spannableStringBuilder2;
                                                        }
                                                    } catch (Exception e10) {
                                                        org.telegram.messenger.a8.g(e10, true);
                                                        str3 = K;
                                                    }
                                                }
                                            }
                                        }
                                        if (str != null && K != null) {
                                            spannableStringBuilder = new SpannableStringBuilder(K);
                                            A1 = org.telegram.messenger.g0.A1(K, str);
                                            if (A1 != -1) {
                                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.k6.q6, null), A1, str.length() + A1, 33);
                                            }
                                        }
                                        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                                        a5Var.setTag(Integer.valueOf(i11));
                                        a5Var.c(tLObject, spannableStringBuilder, str3, false);
                                    }
                                }
                                str4 = null;
                                spannableStringBuilder = charSequence;
                                z9 = true;
                                str2 = str4;
                                str3 = str2;
                                str3 = str2;
                                if (!z9) {
                                    size2 = z1Var.e.size();
                                    str3 = str2;
                                    if (size2 != 0) {
                                    }
                                }
                                if (str != null) {
                                    spannableStringBuilder = new SpannableStringBuilder(K);
                                    A1 = org.telegram.messenger.g0.A1(K, str);
                                    if (A1 != -1) {
                                    }
                                }
                                org.telegram.ui.Cells.a5 a5Var2 = (org.telegram.ui.Cells.a5) view;
                                a5Var2.setTag(Integer.valueOf(i11));
                                a5Var2.c(tLObject, spannableStringBuilder, str3, false);
                            }
                            i11 -= i10;
                        }
                        str2 = null;
                        spannableStringBuilder = null;
                        str3 = str2;
                        str3 = str2;
                        if (!z9) {
                        }
                        if (str != null) {
                        }
                        org.telegram.ui.Cells.a5 a5Var22 = (org.telegram.ui.Cells.a5) view;
                        a5Var22.setTag(Integer.valueOf(i11));
                        a5Var22.c(tLObject, spannableStringBuilder, str3, false);
                    }
                    i11 -= i14;
                }
                str = null;
                z9 = false;
                if (!z9) {
                    i10 = size3 + 1;
                    if (i10 <= i11) {
                    }
                }
                str2 = null;
                spannableStringBuilder = null;
                str3 = str2;
                str3 = str2;
                if (!z9) {
                }
                if (str != null) {
                }
                org.telegram.ui.Cells.a5 a5Var222 = (org.telegram.ui.Cells.a5) view;
                a5Var222.setTag(Integer.valueOf(i11));
                a5Var222.c(tLObject, spannableStringBuilder, str3, false);
            }
            if (!(E instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                E = oqVar.getMessagesController().a2(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
            }
        }
        tLObject = E;
        K = null;
        jg.z1 z1Var2 = this.h;
        size = z1Var2.g.size();
        if (size != 0) {
        }
        str = null;
        z9 = false;
        if (!z9) {
        }
        str2 = null;
        spannableStringBuilder = null;
        str3 = str2;
        str3 = str2;
        if (!z9) {
        }
        if (str != null) {
        }
        org.telegram.ui.Cells.a5 a5Var2222 = (org.telegram.ui.Cells.a5) view;
        a5Var2222.setTag(Integer.valueOf(i11));
        a5Var2222.c(tLObject, spannableStringBuilder, str3, false);
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        org.telegram.ui.ActionBar.f6 f6Var;
        oq oqVar = this.D;
        if (i7 != 0) {
            f6Var = ((org.telegram.ui.ActionBar.f2) oqVar).resourceProvider;
            view = new org.telegram.ui.Cells.x3(26, this.c, f6Var);
            view.setBackground(null);
        } else {
            org.telegram.ui.Cells.a5 a5Var = new org.telegram.ui.Cells.a5(this.c, 2, 2, oqVar.d1 == 0, null);
            a5Var.G = true;
            a5Var.setDelegate(new mq(this));
            view = a5Var;
        }
        return new org.telegram.ui.Components.xi0(view);
    }
}
