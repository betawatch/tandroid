package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fd1 extends org.telegram.ui.Components.ak0 {
    public final Context c;
    public final zf.m1 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final /* synthetic */ UsersSelectActivity w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public fd1(UsersSelectActivity usersSelectActivity, Context context) {
        this.w = usersSelectActivity;
        this.c = context;
        if (usersSelectActivity.F) {
            this.s = 0;
        } else {
            int i10 = usersSelectActivity.y;
            if (i10 == 2) {
                this.s = (!usersSelectActivity.H ? 1 : 0) + 5;
            } else if (i10 != 0) {
                this.s = 0;
            } else if (usersSelectActivity.I) {
                this.s = 7;
            } else {
                this.s = 5;
            }
        }
        int i11 = usersSelectActivity.y;
        boolean z10 = i11 != 2;
        boolean z11 = i11 != 2;
        ArrayList arrayList = usersSelectActivity.getMessagesController().y;
        int size = arrayList.size();
        int i12 = 0;
        boolean z12 = false;
        while (i12 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
            if (!org.telegram.messenger.o5.C(dialog.id)) {
                if (org.telegram.messenger.o5.E(dialog.id)) {
                    TLRPC.User Z1 = usersSelectActivity.getMessagesController().Z1(Long.valueOf(dialog.id));
                    if (Z1 != null && ((usersSelectActivity.G || !org.telegram.messenger.h20.B(Z1)) && (!Z1.bot || z10))) {
                        this.r.add(Z1);
                        if (org.telegram.messenger.h20.B(Z1)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat L0 = usersSelectActivity.getMessagesController().L0(Long.valueOf(-dialog.id));
                    if (z11 && L0 != null) {
                        this.r.add(L0);
                    }
                }
            }
            i12++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.G) {
            this.r.add(0, usersSelectActivity.getMessagesController().Z1(Long.valueOf(usersSelectActivity.getUserConfig().n)));
        }
        zf.m1 m1Var = new zf.m1(false);
        this.f = m1Var;
        m1Var.p = false;
        m1Var.a = new tj0(this, 24);
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.j4) {
            ((org.telegram.ui.Cells.j4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 1;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(org.telegram.ui.Components.tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.g.a(this.h);
            this.h = null;
        }
        int i10 = this.w.y;
        boolean z10 = i10 != 2;
        boolean z11 = i10 != 2;
        if (str != null) {
            org.telegram.messenger.r5 r5Var = Utilities.g;
            ed1 ed1Var = new ed1(this, str, z11, z10, 0);
            this.h = ed1Var;
            r5Var.d(ed1Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        this.f.g(null, true, false, false, false, 0L, false, 0, 0);
        f();
    }

    @Override // s4.g0
    public final int b() {
        if (this.n) {
            int size = this.d.size();
            zf.m1 m1Var = this.f;
            return m1Var.e.size() + m1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.w;
        int i10 = 0;
        if (!usersSelectActivity.F) {
            int i11 = usersSelectActivity.y;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.H ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.I ? 7 : 5;
            }
        }
        return this.r.size() + i10;
    }

    @Override // s4.g0
    public final int d(int i10) {
        int i11;
        if (!this.n) {
            UsersSelectActivity usersSelectActivity = this.w;
            if (!usersSelectActivity.F ? !((i11 = usersSelectActivity.y) != 2 ? i11 != 0 || (!usersSelectActivity.I ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.H ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01db  */
    /* JADX WARN: Type inference failed for: r11v20 */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        Object obj;
        String L0;
        CharSequence charSequence;
        SpannableStringBuilder spannableStringBuilder;
        long j10;
        int i11;
        long j11;
        SpannableStringBuilder spannableStringBuilder2;
        boolean z10;
        boolean z11;
        boolean y3;
        SpannableStringBuilder spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder4;
        int i12 = c1Var.f;
        View view = c1Var.a;
        UsersSelectActivity usersSelectActivity = this.w;
        int i13 = 2;
        if (i12 != 1) {
            if (i12 != 2) {
                return;
            }
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i10 != 0 || usersSelectActivity.F) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131750797, null));
                return;
            } else {
                z3Var.setText(org.telegram.messenger.cd.L0(2131750798, null));
                return;
            }
        }
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
        if (this.n) {
            int size = this.d.size();
            zf.m1 m1Var = this.f;
            ArrayList arrayList = m1Var.e;
            ArrayList arrayList2 = m1Var.d;
            int size2 = arrayList.size();
            int size3 = arrayList2.size();
            obj = (i10 < 0 || i10 >= size) ? (i10 < size || i10 >= size3 + size) ? (i10 <= size + size3 || i10 >= (size2 + size) + size3) ? null : m1Var.e.get((i10 - size) - size3) : arrayList2.get(i10 - size) : this.d.get(i10);
            if (obj != null) {
                String K = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : org.telegram.messenger.w3.K((TLRPC.Chat) obj, false);
                if (i10 < size) {
                    charSequence = (CharSequence) this.e.get(i10);
                    if (charSequence != null && !TextUtils.isEmpty(K)) {
                        if (charSequence.toString().startsWith("@" + K)) {
                            K = charSequence;
                        }
                    }
                    spannableStringBuilder = null;
                    j10 = obj instanceof TLRPC.User ? ((TLRPC.User) obj).id : obj instanceof TLRPC.Chat ? -((TLRPC.Chat) obj).id : 0L;
                    i11 = usersSelectActivity.y;
                    if (i11 != 2) {
                        if (i11 != 0) {
                            j11 = 0;
                            int i14 = usersSelectActivity.getMessagesController().Q.f(j10) != null ? ((TLRPC.Dialog) usersSelectActivity.getMessagesController().Q.f(j10)).ttl_period : 0;
                            if (i14 > 0) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append((CharSequence) "d");
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.dq(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                                spannableStringBuilder5.append((CharSequence) org.telegram.messenger.cd.a0(null, null, 2131753876, org.telegram.messenger.cd.c0(i14)).toLowerCase());
                                spannableStringBuilder2 = spannableStringBuilder5;
                                z10 = true;
                            } else {
                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                spannableStringBuilder6.append((CharSequence) "d");
                                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.dq(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.cd.L0(2131753861, null));
                                spannableStringBuilder2 = spannableStringBuilder6;
                                z10 = false;
                            }
                            if (obj instanceof TLRPC.Chat) {
                                boolean z12 = z10;
                                y3 = org.telegram.messenger.w3.y(13, (TLRPC.Chat) obj);
                                z11 = z12;
                                spannableStringBuilder3 = spannableStringBuilder2;
                                if (y3) {
                                }
                                j4Var.d(obj, charSequence, spannableStringBuilder3);
                                org.telegram.ui.ActionBar.a7.Y(j4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.t6.n6 : org.telegram.ui.ActionBar.t6.y6, null);
                                if (j10 == j11) {
                                }
                            } else {
                                z11 = z10;
                                spannableStringBuilder4 = spannableStringBuilder2;
                                y3 = true;
                                spannableStringBuilder3 = spannableStringBuilder4;
                                if (y3) {
                                }
                                j4Var.d(obj, charSequence, spannableStringBuilder3);
                                org.telegram.ui.ActionBar.a7.Y(j4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.t6.n6 : org.telegram.ui.ActionBar.t6.y6, null);
                                if (j10 == j11) {
                                }
                            }
                        } else if (!this.n) {
                            Paint.FontMetricsInt fontMetricsInt = j4Var.getStatusTextView().getPaint().getFontMetricsInt();
                            spannableStringBuilder = new SpannableStringBuilder();
                            ArrayList arrayList3 = usersSelectActivity.getMessagesController().P0;
                            int size4 = arrayList3.size();
                            j11 = 0;
                            for (int i15 = 0; i15 < size4; i15++) {
                                org.telegram.messenger.ap apVar = (org.telegram.messenger.ap) arrayList3.get(i15);
                                if (apVar.b(usersSelectActivity.getAccountInstance(), j10)) {
                                    if (spannableStringBuilder.length() > 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(new SpannableStringBuilder(apVar.b), fontMetricsInt, false, null, 0), apVar.c, fontMetricsInt, false));
                                }
                            }
                            z11 = false;
                            spannableStringBuilder4 = spannableStringBuilder;
                            y3 = true;
                            spannableStringBuilder3 = spannableStringBuilder4;
                            if (y3) {
                                j4Var.setAlpha(0.5f);
                            } else {
                                j4Var.setAlpha(1.0f);
                            }
                            j4Var.d(obj, charSequence, spannableStringBuilder3);
                            org.telegram.ui.ActionBar.a7.Y(j4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.t6.n6 : org.telegram.ui.ActionBar.t6.y6, null);
                            if (j10 == j11) {
                                j4Var.c(usersSelectActivity.N.h(j10) >= 0, false);
                                j4Var.setCheckBoxEnabled(true);
                                return;
                            }
                            return;
                        }
                    }
                    j11 = 0;
                    z11 = false;
                    spannableStringBuilder4 = spannableStringBuilder;
                    y3 = true;
                    spannableStringBuilder3 = spannableStringBuilder4;
                    if (y3) {
                    }
                    j4Var.d(obj, charSequence, spannableStringBuilder3);
                    org.telegram.ui.ActionBar.a7.Y(j4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.t6.n6 : org.telegram.ui.ActionBar.t6.y6, null);
                    if (j10 == j11) {
                    }
                } else if (i10 > size && !TextUtils.isEmpty(K)) {
                    String str = m1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        spannableStringBuilder7.append((CharSequence) "@");
                        spannableStringBuilder7.append((CharSequence) K);
                        int A1 = org.telegram.messenger.i0.A1(K, str);
                        if (A1 != -1) {
                            int length = str.length();
                            if (A1 == 0) {
                                length++;
                            } else {
                                A1++;
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, null), A1, length + A1, 33);
                        }
                        K = spannableStringBuilder7;
                    } catch (Exception unused) {
                    }
                }
                charSequence = null;
                spannableStringBuilder = K;
                if (obj instanceof TLRPC.User) {
                }
                i11 = usersSelectActivity.y;
                if (i11 != 2) {
                }
                j11 = 0;
                z11 = false;
                spannableStringBuilder4 = spannableStringBuilder;
                y3 = true;
                spannableStringBuilder3 = spannableStringBuilder4;
                if (y3) {
                }
                j4Var.d(obj, charSequence, spannableStringBuilder3);
                org.telegram.ui.ActionBar.a7.Y(j4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.t6.n6 : org.telegram.ui.ActionBar.t6.y6, null);
                if (j10 == j11) {
                }
            }
        } else {
            int i16 = this.s;
            if (i10 < i16) {
                String str2 = "non_contacts";
                if (usersSelectActivity.y == 2) {
                    if (i10 == 1) {
                        L0 = org.telegram.messenger.cd.L0(2131750777, null);
                        str2 = "existing_chats";
                        i13 = 1;
                    } else if (i10 == 2 && !usersSelectActivity.H) {
                        L0 = org.telegram.messenger.cd.L0(2131750728, null);
                        str2 = "new_chats";
                    } else if (i10 == (!usersSelectActivity.H ? 1 : 0) + 2) {
                        L0 = org.telegram.messenger.cd.L0(2131750792, null);
                        str2 = "contacts";
                        i13 = 4;
                    } else {
                        L0 = org.telegram.messenger.cd.L0(2131750721, null);
                        i13 = 8;
                    }
                } else if (usersSelectActivity.I) {
                    if (i10 == 1) {
                        L0 = org.telegram.messenger.cd.L0(2131750792, null);
                        int i17 = org.telegram.messenger.vp.D8;
                        i13 = 1;
                        str2 = "contacts";
                    } else if (i10 == 2) {
                        L0 = org.telegram.messenger.cd.L0(2131750721, null);
                        int i18 = org.telegram.messenger.vp.D8;
                    } else if (i10 == 3) {
                        L0 = org.telegram.messenger.cd.L0(2131750775, null);
                        int i19 = org.telegram.messenger.vp.D8;
                        str2 = "groups";
                        i13 = 4;
                    } else if (i10 == 4) {
                        L0 = org.telegram.messenger.cd.L0(2131750801, null);
                        int i20 = org.telegram.messenger.vp.D8;
                        str2 = "channels";
                        i13 = 8;
                    } else {
                        L0 = org.telegram.messenger.cd.L0(2131750802, null);
                        int i21 = org.telegram.messenger.vp.D8;
                        str2 = "bots";
                        i13 = 16;
                    }
                } else if (i10 == 1) {
                    L0 = org.telegram.messenger.cd.L0(2131750737, null);
                    int i22 = org.telegram.messenger.vp.D8;
                    str2 = "muted";
                    i13 = 32;
                } else if (i10 == 2) {
                    L0 = org.telegram.messenger.cd.L0(2131750720, null);
                    int i23 = org.telegram.messenger.vp.D8;
                    str2 = "read";
                    i13 = 64;
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131750805, null);
                    int i24 = org.telegram.messenger.vp.D8;
                    str2 = "archived";
                    i13 = 128;
                }
                j4Var.d(str2, L0, null);
                j4Var.c((usersSelectActivity.J & i13) == i13, false);
                j4Var.setCheckBoxEnabled(true);
                return;
            }
            obj = this.r.get(i10 - i16);
        }
        charSequence = null;
        spannableStringBuilder = null;
        if (obj instanceof TLRPC.User) {
        }
        i11 = usersSelectActivity.y;
        if (i11 != 2) {
        }
        j11 = 0;
        z11 = false;
        spannableStringBuilder4 = spannableStringBuilder;
        y3 = true;
        spannableStringBuilder3 = spannableStringBuilder4;
        if (y3) {
        }
        j4Var.d(obj, charSequence, spannableStringBuilder3);
        org.telegram.ui.ActionBar.a7.Y(j4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.t6.n6 : org.telegram.ui.ActionBar.t6.y6, null);
        if (j10 == j11) {
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        return new org.telegram.ui.Components.ck0(i10 != 1 ? new org.telegram.ui.Cells.z3(context, null) : new org.telegram.ui.Cells.j4(context, 1, 0, true));
    }
}
