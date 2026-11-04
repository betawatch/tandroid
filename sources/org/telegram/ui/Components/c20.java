package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c20 extends sj0 {
    public final Context c;
    public final kg.v1 d;
    public a20 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final /* synthetic */ d20 x;

    public c20(d20 d20Var, Context context) {
        this.x = d20Var;
        this.c = context;
        kg.v1 v1Var = new kg.v1(true);
        this.d = v1Var;
        v1Var.a = new b20(this);
    }

    @Override // u4.h0
    public final void A(u4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.a5) {
            ((org.telegram.ui.Cells.a5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        View view = d1Var.a;
        return !((view instanceof org.telegram.ui.Cells.a5) && this.x.X1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && d1Var.f == 0;
    }

    @Override // u4.h0
    public final int b() {
        return this.f;
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (i3 == 0) {
            return 2;
        }
        if (i3 == this.r) {
            return 3;
        }
        return (i3 == this.w || i3 == this.s) ? 1 : 0;
    }

    @Override // u4.h0
    public final void f() {
        this.f = 1;
        kg.v1 v1Var = this.d;
        int size = v1Var.g.size();
        if (size != 0) {
            int i3 = this.f;
            this.s = i3;
            this.f = size + 1 + i3;
        } else {
            this.s = -1;
        }
        int size2 = v1Var.e.size();
        if (size2 != 0) {
            int i10 = this.f;
            this.w = i10;
            this.f = size2 + 1 + i10;
        } else {
            this.w = -1;
        }
        int i11 = this.f;
        this.f = i11 + 1;
        this.r = i11;
        super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007b  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        TLObject tLObject;
        boolean z10;
        TLRPC.User a22;
        int size;
        String str;
        boolean z11;
        int size2;
        int i10 = i3;
        int i11 = d1Var.f;
        View view = d1Var.a;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i10 == this.s) {
                x3Var.setText(org.telegram.messenger.bd.M0(2131752377, null));
                return;
            } else {
                if (i10 == this.w) {
                    x3Var.setText(org.telegram.messenger.bd.M0(2131749543, null));
                    return;
                }
                return;
            }
        }
        int i12 = this.s;
        kg.v1 v1Var = this.d;
        if (i12 >= 0 && i10 > i12) {
            if (i10 < v1Var.g.size() + i12 + 1) {
                tLObject = (TLObject) v1Var.g.get((i10 - this.s) - 1);
                z10 = tLObject instanceof TLRPC.User;
                d20 d20Var = this.x;
                if (z10) {
                    a22 = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    a22 = org.telegram.messenger.hp.s1(d20Var.a).a2(Long.valueOf(org.telegram.messenger.zi.C1(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    a22 = org.telegram.messenger.hp.s1(d20Var.a).a2(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                TLRPC.User user = a22;
                String n4 = org.telegram.messenger.l10.n(user);
                size = v1Var.g.size();
                if (size != 0) {
                    int i13 = size + 1;
                    if (i13 > i10) {
                        str = v1Var.n;
                        z11 = true;
                        if (!z11 || n4 == null || (size2 = v1Var.e.size()) == 0 || size2 + 1 <= i10) {
                            n4 = null;
                        } else {
                            String str2 = v1Var.c;
                            if (str2.startsWith("@")) {
                                str2 = str2.substring(1);
                            }
                            try {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "@");
                                spannableStringBuilder2.append((CharSequence) n4);
                                int A1 = org.telegram.messenger.g0.A1(n4, str2);
                                if (A1 != -1) {
                                    int length = str2.length();
                                    if (A1 == 0) {
                                        length++;
                                    } else {
                                        A1++;
                                    }
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.dh, false)), A1, length + A1, 33);
                                }
                                n4 = spannableStringBuilder2;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        }
                        if (str != null) {
                            String p10 = org.telegram.messenger.l10.p(user);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(p10);
                            int A12 = org.telegram.messenger.g0.A1(p10, str);
                            if (A12 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.dh, false)), A12, str.length() + A12, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                        a5Var.setTag(Integer.valueOf(i10));
                        a5Var.setCustomImageVisible(d20Var.X1.contains(Long.valueOf(user.id)));
                        a5Var.c(user, spannableStringBuilder, n4, false);
                    }
                    i10 -= i13;
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                n4 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.a5 a5Var2 = (org.telegram.ui.Cells.a5) view;
                a5Var2.setTag(Integer.valueOf(i10));
                a5Var2.setCustomImageVisible(d20Var.X1.contains(Long.valueOf(user.id)));
                a5Var2.c(user, spannableStringBuilder, n4, false);
            }
        }
        int i14 = this.w;
        if (i14 >= 0 && i10 > i14) {
            if (i10 < v1Var.e.size() + i14 + 1) {
                tLObject = (TLObject) v1Var.e.get((i10 - this.w) - 1);
                z10 = tLObject instanceof TLRPC.User;
                d20 d20Var2 = this.x;
                if (z10) {
                }
                TLRPC.User user2 = a22;
                String n42 = org.telegram.messenger.l10.n(user2);
                size = v1Var.g.size();
                if (size != 0) {
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                n42 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.a5 a5Var22 = (org.telegram.ui.Cells.a5) view;
                a5Var22.setTag(Integer.valueOf(i10));
                a5Var22.setCustomImageVisible(d20Var2.X1.contains(Long.valueOf(user2.id)));
                a5Var22.c(user2, spannableStringBuilder, n42, false);
            }
        }
        tLObject = null;
        z10 = tLObject instanceof TLRPC.User;
        d20 d20Var22 = this.x;
        if (z10) {
        }
        TLRPC.User user22 = a22;
        String n422 = org.telegram.messenger.l10.n(user22);
        size = v1Var.g.size();
        if (size != 0) {
        }
        str = null;
        z11 = false;
        if (z11) {
        }
        n422 = null;
        if (str != null) {
        }
        org.telegram.ui.Cells.a5 a5Var222 = (org.telegram.ui.Cells.a5) view;
        a5Var222.setTag(Integer.valueOf(i10));
        a5Var222.setCustomImageVisible(d20Var22.X1.contains(Long.valueOf(user22.id)));
        a5Var222.c(user22, spannableStringBuilder, n422, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i3 != 0) {
            Context context = this.c;
            if (i3 == 1) {
                ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Xg, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.k6.Eh);
                a5Var = x3Var;
            } else if (i3 != 2) {
                a5Var = new View(context);
            } else {
                ?? view = new View(context);
                view.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                a5Var = view;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.c, 2, 2, false, null);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.bh, false));
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.dh, false);
            a5Var2.P = true;
            a5Var2.I = x02;
            a5Var2.J = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.k6.hh);
            a5Var = a5Var2;
        }
        return new bj0(a5Var);
    }
}
