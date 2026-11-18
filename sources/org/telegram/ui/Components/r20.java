package org.telegram.ui.Components;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class r20 extends bk0 {
    public final Context c;
    public final jg.z1 d;
    public p20 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final /* synthetic */ s20 x;

    public r20(s20 s20Var, Context context) {
        this.x = s20Var;
        this.c = context;
        jg.z1 z1Var = new jg.z1(true);
        this.d = z1Var;
        z1Var.a = new q20(this);
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).a();
        }
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        View view = f1Var.a;
        return !((view instanceof org.telegram.ui.Cells.b5) && this.x.a2.contains(Long.valueOf(((org.telegram.ui.Cells.b5) view).getUserId()))) && f1Var.f == 0;
    }

    @Override // v4.i0
    public final int b() {
        return this.f;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 2;
        }
        if (i7 == this.r) {
            return 3;
        }
        return (i7 == this.w || i7 == this.s) ? 1 : 0;
    }

    @Override // v4.i0
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
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        TLObject tLObject;
        boolean z10;
        TLRPC.User c22;
        int size;
        String str;
        boolean z11;
        int size2;
        int i10 = i7;
        int i11 = f1Var.f;
        View view = f1Var.a;
        SpannableStringBuilder spannableStringBuilder = null;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            if (i10 == this.s) {
                y3Var.setText(org.telegram.messenger.gd.M0(2131752366, null));
                return;
            } else {
                if (i10 == this.w) {
                    y3Var.setText(org.telegram.messenger.gd.M0(2131749360, null));
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
                z10 = tLObject instanceof TLRPC.User;
                s20 s20Var = this.x;
                if (z10) {
                    c22 = (TLRPC.User) tLObject;
                } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                    c22 = org.telegram.messenger.mp.u1(s20Var.a).c2(Long.valueOf(org.telegram.messenger.fj.B1(((TLRPC.ChannelParticipant) tLObject).peer)));
                } else if (!(tLObject instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    c22 = org.telegram.messenger.mp.u1(s20Var.a).c2(Long.valueOf(((TLRPC.ChatParticipant) tLObject).user_id));
                }
                TLRPC.User user = c22;
                String o4 = org.telegram.messenger.o10.o(user);
                size = z1Var.g.size();
                if (size != 0) {
                    int i13 = size + 1;
                    if (i13 > i10) {
                        str = z1Var.n;
                        z11 = true;
                        if (!z11 || o4 == null || (size2 = z1Var.e.size()) == 0 || size2 + 1 <= i10) {
                            o4 = null;
                        } else {
                            String str2 = z1Var.c;
                            if (str2.startsWith("@")) {
                                str2 = str2.substring(1);
                            }
                            try {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                spannableStringBuilder2.append((CharSequence) "@");
                                spannableStringBuilder2.append((CharSequence) o4);
                                int A1 = org.telegram.messenger.g0.A1(o4, str2);
                                if (A1 != -1) {
                                    int length = str2.length();
                                    if (A1 == 0) {
                                        length++;
                                    } else {
                                        A1++;
                                    }
                                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.gh, false)), A1, length + A1, 33);
                                }
                                o4 = spannableStringBuilder2;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                            }
                        }
                        if (str != null) {
                            String q10 = org.telegram.messenger.o10.q(user);
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(q10);
                            int A12 = org.telegram.messenger.g0.A1(q10, str);
                            if (A12 != -1) {
                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.gh, false)), A12, str.length() + A12, 33);
                            }
                            spannableStringBuilder = spannableStringBuilder3;
                        }
                        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) view;
                        b5Var.setTag(Integer.valueOf(i10));
                        b5Var.setCustomImageVisible(s20Var.a2.contains(Long.valueOf(user.id)));
                        b5Var.c(user, spannableStringBuilder, o4, false);
                    }
                    i10 -= i13;
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                o4 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.b5 b5Var2 = (org.telegram.ui.Cells.b5) view;
                b5Var2.setTag(Integer.valueOf(i10));
                b5Var2.setCustomImageVisible(s20Var.a2.contains(Long.valueOf(user.id)));
                b5Var2.c(user, spannableStringBuilder, o4, false);
            }
        }
        int i14 = this.w;
        if (i14 >= 0 && i10 > i14) {
            if (i10 < z1Var.e.size() + i14 + 1) {
                tLObject = (TLObject) z1Var.e.get((i10 - this.w) - 1);
                z10 = tLObject instanceof TLRPC.User;
                s20 s20Var2 = this.x;
                if (z10) {
                }
                TLRPC.User user2 = c22;
                String o42 = org.telegram.messenger.o10.o(user2);
                size = z1Var.g.size();
                if (size != 0) {
                }
                str = null;
                z11 = false;
                if (z11) {
                }
                o42 = null;
                if (str != null) {
                }
                org.telegram.ui.Cells.b5 b5Var22 = (org.telegram.ui.Cells.b5) view;
                b5Var22.setTag(Integer.valueOf(i10));
                b5Var22.setCustomImageVisible(s20Var2.a2.contains(Long.valueOf(user2.id)));
                b5Var22.c(user2, spannableStringBuilder, o42, false);
            }
        }
        tLObject = null;
        z10 = tLObject instanceof TLRPC.User;
        s20 s20Var22 = this.x;
        if (z10) {
        }
        TLRPC.User user22 = c22;
        String o422 = org.telegram.messenger.o10.o(user22);
        size = z1Var.g.size();
        if (size != 0) {
        }
        str = null;
        z11 = false;
        if (z11) {
        }
        o422 = null;
        if (str != null) {
        }
        org.telegram.ui.Cells.b5 b5Var222 = (org.telegram.ui.Cells.b5) view;
        b5Var222.setTag(Integer.valueOf(i10));
        b5Var222.setCustomImageVisible(s20Var22.a2.contains(Long.valueOf(user22.id)));
        b5Var222.c(user22, spannableStringBuilder, o422, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.view.View, org.telegram.ui.Cells.y3] */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.view.View] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.b5 b5Var;
        if (i7 != 0) {
            Context context = this.c;
            if (i7 == 1) {
                ?? y3Var = new org.telegram.ui.Cells.y3(context, null);
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.ah, y3Var, null);
                y3Var.setTextColor(org.telegram.ui.ActionBar.n6.Hh);
                b5Var = y3Var;
            } else if (i7 != 2) {
                b5Var = new View(context);
            } else {
                ?? view = new View(context);
                view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                b5Var = view;
            }
        } else {
            org.telegram.ui.Cells.b5 b5Var2 = new org.telegram.ui.Cells.b5(this.c, 2, 2, false, null);
            b5Var2.setCustomRightImage(R.drawable.msg_invited);
            b5Var2.setNameColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.eh, false));
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.ch, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.gh, false);
            b5Var2.P = true;
            b5Var2.I = x02;
            b5Var2.J = x03;
            b5Var2.setDividerColor(org.telegram.ui.ActionBar.n6.kh);
            b5Var = b5Var2;
        }
        return new kj0(b5Var);
    }
}
