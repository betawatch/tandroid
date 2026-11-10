package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g20 extends oj0 {
    public final Context c;
    public final jg.z1 d;
    public e20 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final /* synthetic */ h20 x;

    public g20(h20 h20Var, Context context) {
        this.x = h20Var;
        this.c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.a = new f20(this);
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
        View view = d1Var.a;
        return !((view instanceof org.telegram.ui.Cells.a5) && this.x.Z1.contains(Long.valueOf(((org.telegram.ui.Cells.a5) view).getUserId()))) && d1Var.f == 0;
    }

    @Override // v4.g0
    public final int b() {
        return this.f;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.r) {
            return 3;
        }
        return (i7 == this.w || i7 == this.s) ? 1 : 0;
    }

    @Override // v4.g0
    public final void f() {
        this.f = 1;
        jg.z1 z1Var = this.d;
        int size = z1Var.g.size();
        if (size != 0) {
            int i7 = this.f;
            this.s = i7;
            this.f = size + 1 + i7;
        } else {
            this.s = -1;
        }
        int size2 = z1Var.e.size();
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
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        TLObject tLObject;
        boolean z9;
        TLRPC.User a22;
        int size;
        String str;
        boolean z10;
        int size2;
        int i10 = i7;
        int i11 = d1Var.f;
        View view = d1Var.a;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i10 == this.s) {
                x3Var.setText(org.telegram.messenger.id.M0(2131752377, null));
                return;
            } else {
                if (i10 == this.w) {
                    x3Var.setText(org.telegram.messenger.id.M0(2131749535, null));
                    return;
                }
                return;
            }
        }
        int i12 = this.s;
        jg.z1 z1Var = this.d;
        if (i12 >= 0 && i10 > i12) {
            if (i10 < z1Var.g.size() + i12 + 1) {
                tLObject = (TLObject) z1Var.g.get((i10 - this.s) - 1);
                z9 = tLObject instanceof TLRPC.User;
                h20 h20Var = this.x;
                if (z9) {
                    a22 = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    a22 = org.telegram.messenger.qp.s1(h20Var.a).a2(Long.valueOf(org.telegram.messenger.ij.B1(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    a22 = org.telegram.messenger.qp.s1(h20Var.a).a2(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                TLRPC.User user = a22;
                String n10 = org.telegram.messenger.t10.n(user);
                size = z1Var.g.size();
                if (size != 0) {
                    int i13 = size + 1;
                    if (i13 > i10) {
                        str = z1Var.n;
                        z10 = true;
                        if (!z10 || n10 == null || (size2 = z1Var.e.size()) == 0 || size2 + 1 <= i10) {
                            n10 = null;
                        } else {
                            String str2 = z1Var.c;
                            if (str2.startsWith("@")) {
                                str2 = str2.substring(1);
                            }
                            try {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "@");
                                spannableStringBuilder2.append((CharSequence) n10);
                                int A1 = org.telegram.messenger.g0.A1(n10, str2);
                                if (A1 != -1) {
                                    int length = str2.length();
                                    if (A1 == 0) {
                                        length++;
                                    } else {
                                        A1++;
                                    }
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.dh, false)), A1, length + A1, 33);
                                }
                                n10 = spannableStringBuilder2;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        }
                        if (str != null) {
                            String p10 = org.telegram.messenger.t10.p(user);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(p10);
                            int A12 = org.telegram.messenger.g0.A1(p10, str);
                            if (A12 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.dh, false)), A12, str.length() + A12, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) view;
                        a5Var.setTag(Integer.valueOf(i10));
                        a5Var.setCustomImageVisible(h20Var.Z1.contains(Long.valueOf(user.id)));
                        a5Var.c(user, spannableStringBuilder, n10, false);
                    }
                    i10 -= i13;
                }
                str = null;
                z10 = false;
                if (z10) {
                }
                n10 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.a5 a5Var2 = (org.telegram.ui.Cells.a5) view;
                a5Var2.setTag(Integer.valueOf(i10));
                a5Var2.setCustomImageVisible(h20Var.Z1.contains(Long.valueOf(user.id)));
                a5Var2.c(user, spannableStringBuilder, n10, false);
            }
        }
        int i14 = this.w;
        if (i14 >= 0 && i10 > i14) {
            if (i10 < z1Var.e.size() + i14 + 1) {
                tLObject = (TLObject) z1Var.e.get((i10 - this.w) - 1);
                z9 = tLObject instanceof TLRPC.User;
                h20 h20Var2 = this.x;
                if (z9) {
                }
                TLRPC.User user2 = a22;
                String n102 = org.telegram.messenger.t10.n(user2);
                size = z1Var.g.size();
                if (size != 0) {
                }
                str = null;
                z10 = false;
                if (z10) {
                }
                n102 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.a5 a5Var22 = (org.telegram.ui.Cells.a5) view;
                a5Var22.setTag(Integer.valueOf(i10));
                a5Var22.setCustomImageVisible(h20Var2.Z1.contains(Long.valueOf(user2.id)));
                a5Var22.c(user2, spannableStringBuilder, n102, false);
            }
        }
        tLObject = null;
        z9 = tLObject instanceof TLRPC.User;
        h20 h20Var22 = this.x;
        if (z9) {
        }
        TLRPC.User user22 = a22;
        String n1022 = org.telegram.messenger.t10.n(user22);
        size = z1Var.g.size();
        if (size != 0) {
        }
        str = null;
        z10 = false;
        if (z10) {
        }
        n1022 = null;
        if (str != null) {
        }
        org.telegram.ui.Cells.a5 a5Var222 = (org.telegram.ui.Cells.a5) view;
        a5Var222.setTag(Integer.valueOf(i10));
        a5Var222.setCustomImageVisible(h20Var22.Z1.contains(Long.valueOf(user22.id)));
        a5Var222.c(user22, spannableStringBuilder, n1022, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, org.telegram.ui.Cells.x3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.a5 a5Var;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                ?? x3Var = new org.telegram.ui.Cells.x3(context, null);
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Xg, x3Var, null);
                x3Var.setTextColor(org.telegram.ui.ActionBar.m6.Eh);
                a5Var = x3Var;
            } else if (i7 != 2) {
                a5Var = new View(context);
            } else {
                ?? view = new View(context);
                view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                a5Var = view;
            }
        } else {
            org.telegram.ui.Cells.a5 a5Var2 = new org.telegram.ui.Cells.a5(this.c, 2, 2, false, null);
            a5Var2.setCustomRightImage(R.drawable.msg_invited);
            a5Var2.setNameColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.bh, false));
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Zg, false);
            int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.dh, false);
            a5Var2.O = true;
            a5Var2.H = x02;
            a5Var2.I = x03;
            a5Var2.setDividerColor(org.telegram.ui.ActionBar.m6.hh);
            a5Var = a5Var2;
        }
        return new xi0(a5Var);
    }
}
