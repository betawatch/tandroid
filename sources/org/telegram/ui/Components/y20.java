package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y20 extends sk0 {
    public final Context c;
    public final zf.m1 d;
    public w20 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final /* synthetic */ z20 x;

    public y20(z20 z20Var, Context context) {
        this.x = z20Var;
        this.c = context;
        zf.m1 m1Var = new zf.m1(true);
        this.d = m1Var;
        m1Var.a = new x20(this);
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
        View view = c1Var.a;
        return !((view instanceof org.telegram.ui.Cells.e5) && this.x.W1.contains(Long.valueOf(((org.telegram.ui.Cells.e5) view).getUserId()))) && c1Var.f == 0;
    }

    @Override // s4.g0
    public final int b() {
        return this.f;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == this.r) {
            return 3;
        }
        return (i10 == this.w || i10 == this.s) ? 1 : 0;
    }

    @Override // s4.g0
    public final void f() {
        this.f = 1;
        zf.m1 m1Var = this.d;
        int size = m1Var.g.size();
        if (size != 0) {
            int i10 = this.f;
            this.s = i10;
            this.f = size + 1 + i10;
        } else {
            this.s = -1;
        }
        int size2 = m1Var.e.size();
        if (size2 != 0) {
            int i11 = this.f;
            this.w = i11;
            this.f = size2 + 1 + i11;
        } else {
            this.w = -1;
        }
        int i12 = this.f;
        this.f = i12 + 1;
        this.r = i12;
        super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007b  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        TLObject tLObject;
        boolean z10;
        TLRPC.User Z1;
        int size;
        String str;
        boolean z11;
        int size2;
        int i11 = i10;
        int i12 = c1Var.f;
        View view = c1Var.a;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i11 == this.s) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131752377, null));
                return;
            } else {
                if (i11 == this.w) {
                    z3Var.setText(org.telegram.messenger.cd.L0(2131749544, null));
                    return;
                }
                return;
            }
        }
        int i13 = this.s;
        zf.m1 m1Var = this.d;
        if (i13 >= 0 && i11 > i13) {
            if (i11 < m1Var.g.size() + i13 + 1) {
                tLObject = (TLObject) m1Var.g.get((i11 - this.s) - 1);
                z10 = tLObject instanceof TLRPC.User;
                z20 z20Var = this.x;
                if (z10) {
                    Z1 = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    Z1 = org.telegram.messenger.vp.r1(z20Var.a).Z1(Long.valueOf(org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    Z1 = org.telegram.messenger.vp.r1(z20Var.a).Z1(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                TLRPC.User user = Z1;
                String n10 = org.telegram.messenger.h20.n(user);
                size = m1Var.g.size();
                if (size != 0) {
                    int i14 = size + 1;
                    if (i14 > i11) {
                        str = m1Var.n;
                        z11 = true;
                        if (!z11 || n10 == null || (size2 = m1Var.e.size()) == 0 || size2 + 1 <= i11) {
                            n10 = null;
                        } else {
                            String str2 = m1Var.c;
                            if (str2.startsWith("@")) {
                                str2 = str2.substring(1);
                            }
                            try {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "@");
                                spannableStringBuilder2.append((CharSequence) n10);
                                int A1 = org.telegram.messenger.i0.A1(n10, str2);
                                if (A1 != -1) {
                                    int length = str2.length();
                                    if (A1 == 0) {
                                        length++;
                                    } else {
                                        A1++;
                                    }
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.dh, false)), A1, length + A1, 33);
                                }
                                n10 = spannableStringBuilder2;
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, true);
                            }
                        }
                        if (str != null) {
                            String p5 = org.telegram.messenger.h20.p(user);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(p5);
                            int A12 = org.telegram.messenger.i0.A1(p5, str);
                            if (A12 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.dh, false)), A12, str.length() + A12, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) view;
                        e5Var.setTag(Integer.valueOf(i11));
                        e5Var.setCustomImageVisible(z20Var.W1.contains(Long.valueOf(user.id)));
                        e5Var.c(user, spannableStringBuilder, n10, false);
                    }
                    i11 -= i14;
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                n10 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.e5 e5Var2 = (org.telegram.ui.Cells.e5) view;
                e5Var2.setTag(Integer.valueOf(i11));
                e5Var2.setCustomImageVisible(z20Var.W1.contains(Long.valueOf(user.id)));
                e5Var2.c(user, spannableStringBuilder, n10, false);
            }
        }
        int i15 = this.w;
        if (i15 >= 0 && i11 > i15) {
            if (i11 < m1Var.e.size() + i15 + 1) {
                tLObject = (TLObject) m1Var.e.get((i11 - this.w) - 1);
                z10 = tLObject instanceof TLRPC.User;
                z20 z20Var2 = this.x;
                if (z10) {
                }
                TLRPC.User user2 = Z1;
                String n102 = org.telegram.messenger.h20.n(user2);
                size = m1Var.g.size();
                if (size != 0) {
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                n102 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.e5 e5Var22 = (org.telegram.ui.Cells.e5) view;
                e5Var22.setTag(Integer.valueOf(i11));
                e5Var22.setCustomImageVisible(z20Var2.W1.contains(Long.valueOf(user2.id)));
                e5Var22.c(user2, spannableStringBuilder, n102, false);
            }
        }
        tLObject = null;
        z10 = tLObject instanceof TLRPC.User;
        z20 z20Var22 = this.x;
        if (z10) {
        }
        TLRPC.User user22 = Z1;
        String n1022 = org.telegram.messenger.h20.n(user22);
        size = m1Var.g.size();
        if (size != 0) {
        }
        str = null;
        z11 = false;
        if (z11) {
        }
        n1022 = null;
        if (str != null) {
        }
        org.telegram.ui.Cells.e5 e5Var222 = (org.telegram.ui.Cells.e5) view;
        e5Var222.setTag(Integer.valueOf(i11));
        e5Var222.setCustomImageVisible(z20Var22.W1.contains(Long.valueOf(user22.id)));
        e5Var222.c(user22, spannableStringBuilder, n1022, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, org.telegram.ui.Cells.z3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.e5 e5Var;
        if (i10 != 0) {
            Context context = this.c;
            if (i10 == 1) {
                ?? z3Var = new org.telegram.ui.Cells.z3(context, null);
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Xg, z3Var, null);
                z3Var.setTextColor(org.telegram.ui.ActionBar.t6.Eh);
                e5Var = z3Var;
            } else if (i10 != 2) {
                e5Var = new View(context);
            } else {
                ?? view = new View(context);
                view.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                e5Var = view;
            }
        } else {
            org.telegram.ui.Cells.e5 e5Var2 = new org.telegram.ui.Cells.e5(2, 2, this.c, null, false);
            e5Var2.setCustomRightImage(R.drawable.msg_invited);
            e5Var2.setNameColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bh, false));
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.dh, false);
            e5Var2.O = true;
            e5Var2.H = x02;
            e5Var2.I = x03;
            e5Var2.setDividerColor(org.telegram.ui.ActionBar.t6.hh);
            e5Var = e5Var2;
        }
        return new ck0(e5Var);
    }
}
