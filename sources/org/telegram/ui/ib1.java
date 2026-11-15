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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ib1 extends org.telegram.ui.Components.aj0 {
    public final Context c;
    public final jg.z1 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final /* synthetic */ UsersSelectActivity w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public ib1(UsersSelectActivity usersSelectActivity, Context context) {
        this.w = usersSelectActivity;
        this.c = context;
        if (usersSelectActivity.G) {
            this.s = 0;
        } else {
            int i7 = usersSelectActivity.y;
            if (i7 == 2) {
                this.s = (!usersSelectActivity.J ? 1 : 0) + 5;
            } else if (i7 != 0) {
                this.s = 0;
            } else if (usersSelectActivity.K) {
                this.s = 7;
            } else {
                this.s = 5;
            }
        }
        int i10 = usersSelectActivity.y;
        boolean z10 = i10 != 2 || usersSelectActivity.I;
        boolean z11 = i10 != 2;
        ArrayList arrayList = usersSelectActivity.getMessagesController().y;
        int size = arrayList.size();
        int i11 = 0;
        boolean z12 = false;
        while (i11 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (!org.telegram.messenger.m5.C(dialog.id)) {
                if (org.telegram.messenger.m5.E(dialog.id)) {
                    TLRPC.User a22 = usersSelectActivity.getMessagesController().a2(Long.valueOf(dialog.id));
                    if (a22 != null && ((usersSelectActivity.H || !org.telegram.messenger.q10.B(a22)) && (!a22.bot || z10))) {
                        this.r.add(a22);
                        if (org.telegram.messenger.q10.B(a22)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat M0 = usersSelectActivity.getMessagesController().M0(Long.valueOf(-dialog.id));
                    if (z11 && M0 != null) {
                        this.r.add(M0);
                    }
                }
            }
            i11++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.H) {
            this.r.add(0, usersSelectActivity.getMessagesController().a2(Long.valueOf(usersSelectActivity.getUserConfig().n)));
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f = z1Var;
        z1Var.p = false;
        z1Var.a = new ni0(this, 23);
    }

    @Override // v4.h0
    public final void A(v4.e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        return e1Var.f == 1;
    }

    @Override // org.telegram.ui.Components.aj0
    public final String F(int i7) {
        return null;
    }

    @Override // org.telegram.ui.Components.aj0
    public final void G(org.telegram.ui.Components.uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.g.a(this.h);
            this.h = null;
        }
        UsersSelectActivity usersSelectActivity = this.w;
        int i7 = usersSelectActivity.y;
        boolean z10 = i7 != 2 || usersSelectActivity.I;
        boolean z11 = i7 != 2;
        if (str != null) {
            org.telegram.messenger.p5 p5Var = Utilities.g;
            hb1 hb1Var = new hb1(this, str, z11, z10, 0);
            this.h = hb1Var;
            p5Var.d(hb1Var, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        this.f.g(null, true, false, false, false, 0L, false, 0, 0);
        f();
    }

    @Override // v4.h0
    public final int b() {
        if (this.n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f;
            return z1Var.e.size() + z1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.w;
        int i7 = 0;
        if (!usersSelectActivity.G) {
            int i10 = usersSelectActivity.y;
            if (i10 == 2) {
                i7 = (!usersSelectActivity.J ? 1 : 0) + 3;
            } else if (i10 == 0) {
                i7 = usersSelectActivity.K ? 7 : 5;
            }
        }
        return this.r.size() + i7;
    }

    @Override // v4.h0
    public final int d(int i7) {
        int i10;
        if (!this.n) {
            UsersSelectActivity usersSelectActivity = this.w;
            if (!usersSelectActivity.G ? !((i10 = usersSelectActivity.y) != 2 ? i10 != 0 || (!usersSelectActivity.K ? !(i7 == 0 || i7 == 4) : !(i7 == 0 || i7 == 6)) : i7 != 0 && i7 != (!usersSelectActivity.J ? 1 : 0) + 4) : i7 == 0) {
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
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        Object obj;
        String M0;
        CharSequence charSequence;
        SpannableStringBuilder spannableStringBuilder;
        long j3;
        int i10;
        long j10;
        SpannableStringBuilder spannableStringBuilder2;
        boolean z10;
        boolean z11;
        boolean y10;
        SpannableStringBuilder spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder4;
        int i11 = e1Var.f;
        View view = e1Var.a;
        UsersSelectActivity usersSelectActivity = this.w;
        int i12 = 2;
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (i7 != 0 || usersSelectActivity.G) {
                x3Var.setText(org.telegram.messenger.hd.M0(2131750796, null));
                return;
            } else {
                x3Var.setText(org.telegram.messenger.hd.M0(2131750797, null));
                return;
            }
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        if (this.n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f;
            ArrayList arrayList = z1Var.e;
            ArrayList arrayList2 = z1Var.d;
            int size2 = arrayList.size();
            int size3 = arrayList2.size();
            obj = (i7 < 0 || i7 >= size) ? (i7 < size || i7 >= size3 + size) ? (i7 <= size + size3 || i7 >= (size2 + size) + size3) ? null : z1Var.e.get((i7 - size) - size3) : arrayList2.get(i7 - size) : this.d.get(i7);
            if (obj != null) {
                String K = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : org.telegram.messenger.t3.K((TLRPC.Chat) obj, false);
                if (i7 < size) {
                    charSequence = (CharSequence) this.e.get(i7);
                    if (charSequence != null && !TextUtils.isEmpty(K)) {
                        if (charSequence.toString().startsWith("@" + K)) {
                            K = charSequence;
                        }
                    }
                    spannableStringBuilder = null;
                    j3 = obj instanceof TLRPC.User ? ((TLRPC.User) obj).id : obj instanceof TLRPC.Chat ? -((TLRPC.Chat) obj).id : 0L;
                    i10 = usersSelectActivity.y;
                    if (i10 != 2) {
                        if (i10 != 0) {
                            j10 = 0;
                            int i13 = usersSelectActivity.getMessagesController().R.f(j3) != null ? ((TLRPC.Dialog) usersSelectActivity.getMessagesController().R.f(j3)).ttl_period : 0;
                            if (i13 > 0) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append((CharSequence) "d");
                                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                                spannableStringBuilder5.append((CharSequence) org.telegram.messenger.hd.a0(null, null, 2131753876, org.telegram.messenger.hd.c0(i13)).toLowerCase());
                                spannableStringBuilder2 = spannableStringBuilder5;
                                z10 = true;
                            } else {
                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                spannableStringBuilder6.append((CharSequence) "d");
                                spannableStringBuilder6.setSpan(new org.telegram.ui.Components.eq(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                                spannableStringBuilder6.append((CharSequence) org.telegram.messenger.hd.M0(2131753861, null));
                                spannableStringBuilder2 = spannableStringBuilder6;
                                z10 = false;
                            }
                            if (obj instanceof TLRPC.Chat) {
                                boolean z12 = z10;
                                y10 = org.telegram.messenger.t3.y(13, (TLRPC.Chat) obj);
                                z11 = z12;
                                spannableStringBuilder3 = spannableStringBuilder2;
                                if (y10) {
                                }
                                h4Var.d(obj, charSequence, spannableStringBuilder3);
                                org.telegram.ui.ActionBar.q6.X(h4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, null);
                                if (j3 == j10) {
                                }
                            } else {
                                z11 = z10;
                                spannableStringBuilder4 = spannableStringBuilder2;
                                y10 = true;
                                spannableStringBuilder3 = spannableStringBuilder4;
                                if (y10) {
                                }
                                h4Var.d(obj, charSequence, spannableStringBuilder3);
                                org.telegram.ui.ActionBar.q6.X(h4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, null);
                                if (j3 == j10) {
                                }
                            }
                        } else if (!this.n) {
                            Paint.FontMetricsInt fontMetricsInt = h4Var.getStatusTextView().getPaint().getFontMetricsInt();
                            spannableStringBuilder = new SpannableStringBuilder();
                            ArrayList arrayList3 = usersSelectActivity.getMessagesController().Q0;
                            int size4 = arrayList3.size();
                            j10 = 0;
                            for (int i14 = 0; i14 < size4; i14++) {
                                org.telegram.messenger.so soVar = (org.telegram.messenger.so) arrayList3.get(i14);
                                if (soVar.b(usersSelectActivity.getAccountInstance(), j3)) {
                                    if (spannableStringBuilder.length() > 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    spannableStringBuilder.append((CharSequence) org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(new SpannableStringBuilder(soVar.b), fontMetricsInt, false, null, 0), soVar.c, fontMetricsInt, false));
                                }
                            }
                            z11 = false;
                            spannableStringBuilder4 = spannableStringBuilder;
                            y10 = true;
                            spannableStringBuilder3 = spannableStringBuilder4;
                            if (y10) {
                                h4Var.setAlpha(0.5f);
                            } else {
                                h4Var.setAlpha(1.0f);
                            }
                            h4Var.d(obj, charSequence, spannableStringBuilder3);
                            org.telegram.ui.ActionBar.q6.X(h4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, null);
                            if (j3 == j10) {
                                h4Var.c(usersSelectActivity.P.h(j3) >= 0, false);
                                h4Var.setCheckBoxEnabled(true);
                                return;
                            }
                            return;
                        }
                    }
                    j10 = 0;
                    z11 = false;
                    spannableStringBuilder4 = spannableStringBuilder;
                    y10 = true;
                    spannableStringBuilder3 = spannableStringBuilder4;
                    if (y10) {
                    }
                    h4Var.d(obj, charSequence, spannableStringBuilder3);
                    org.telegram.ui.ActionBar.q6.X(h4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, null);
                    if (j3 == j10) {
                    }
                } else if (i7 > size && !TextUtils.isEmpty(K)) {
                    String str = z1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        spannableStringBuilder7.append((CharSequence) "@");
                        spannableStringBuilder7.append((CharSequence) K);
                        int A1 = org.telegram.messenger.g0.A1(K, str);
                        if (A1 != -1) {
                            int length = str.length();
                            if (A1 == 0) {
                                length++;
                            } else {
                                A1++;
                            }
                            spannableStringBuilder7.setSpan(new org.telegram.ui.Components.b00(org.telegram.ui.ActionBar.j6.q6, null), A1, length + A1, 33);
                        }
                        K = spannableStringBuilder7;
                    } catch (Exception unused) {
                    }
                }
                charSequence = null;
                spannableStringBuilder = K;
                if (obj instanceof TLRPC.User) {
                }
                i10 = usersSelectActivity.y;
                if (i10 != 2) {
                }
                j10 = 0;
                z11 = false;
                spannableStringBuilder4 = spannableStringBuilder;
                y10 = true;
                spannableStringBuilder3 = spannableStringBuilder4;
                if (y10) {
                }
                h4Var.d(obj, charSequence, spannableStringBuilder3);
                org.telegram.ui.ActionBar.q6.X(h4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, null);
                if (j3 == j10) {
                }
            }
        } else {
            int i15 = this.s;
            if (i7 < i15) {
                String str2 = "non_contacts";
                if (usersSelectActivity.y == 2) {
                    if (i7 == 1) {
                        M0 = org.telegram.messenger.hd.M0(2131750776, null);
                        str2 = "existing_chats";
                        i12 = 1;
                    } else if (i7 == 2 && !usersSelectActivity.J) {
                        M0 = org.telegram.messenger.hd.M0(2131750727, null);
                        str2 = "new_chats";
                    } else if (i7 == (!usersSelectActivity.J ? 1 : 0) + 2) {
                        M0 = org.telegram.messenger.hd.M0(2131750791, null);
                        str2 = "contacts";
                        i12 = 4;
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131750720, null);
                        i12 = 8;
                    }
                } else if (usersSelectActivity.K) {
                    if (i7 == 1) {
                        M0 = org.telegram.messenger.hd.M0(2131750791, null);
                        int i16 = org.telegram.messenger.np.D8;
                        i12 = 1;
                        str2 = "contacts";
                    } else if (i7 == 2) {
                        M0 = org.telegram.messenger.hd.M0(2131750720, null);
                        int i17 = org.telegram.messenger.np.D8;
                    } else if (i7 == 3) {
                        M0 = org.telegram.messenger.hd.M0(2131750774, null);
                        int i18 = org.telegram.messenger.np.D8;
                        str2 = "groups";
                        i12 = 4;
                    } else if (i7 == 4) {
                        M0 = org.telegram.messenger.hd.M0(2131750800, null);
                        int i19 = org.telegram.messenger.np.D8;
                        str2 = "channels";
                        i12 = 8;
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131750801, null);
                        int i20 = org.telegram.messenger.np.D8;
                        str2 = "bots";
                        i12 = 16;
                    }
                } else if (i7 == 1) {
                    M0 = org.telegram.messenger.hd.M0(2131750736, null);
                    int i21 = org.telegram.messenger.np.D8;
                    str2 = "muted";
                    i12 = 32;
                } else if (i7 == 2) {
                    M0 = org.telegram.messenger.hd.M0(2131750719, null);
                    int i22 = org.telegram.messenger.np.D8;
                    str2 = "read";
                    i12 = 64;
                } else {
                    M0 = org.telegram.messenger.hd.M0(2131750804, null);
                    int i23 = org.telegram.messenger.np.D8;
                    str2 = "archived";
                    i12 = 128;
                }
                h4Var.d(str2, M0, null);
                h4Var.c((usersSelectActivity.L & i12) == i12, false);
                h4Var.setCheckBoxEnabled(true);
                return;
            }
            obj = this.r.get(i7 - i15);
        }
        charSequence = null;
        spannableStringBuilder = null;
        if (obj instanceof TLRPC.User) {
        }
        i10 = usersSelectActivity.y;
        if (i10 != 2) {
        }
        j10 = 0;
        z11 = false;
        spannableStringBuilder4 = spannableStringBuilder;
        y10 = true;
        spannableStringBuilder3 = spannableStringBuilder4;
        if (y10) {
        }
        h4Var.d(obj, charSequence, spannableStringBuilder3);
        org.telegram.ui.ActionBar.q6.X(h4Var.getStatusTextView(), !z11 ? org.telegram.ui.ActionBar.j6.n6 : org.telegram.ui.ActionBar.j6.y6, null);
        if (j3 == j10) {
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.c;
        return new org.telegram.ui.Components.cj0(i7 != 1 ? new org.telegram.ui.Cells.x3(context, null) : new org.telegram.ui.Cells.h4(context, 1, 0, true));
    }
}
