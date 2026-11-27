// default package

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
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class bcc extends l69 {
    public final Context c;
    public final sv9 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final /* synthetic */ UsersSelectActivity w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public bcc(UsersSelectActivity usersSelectActivity, Context context) {
        this.w = usersSelectActivity;
        this.c = context;
        if (usersSelectActivity.G) {
            this.s = 0;
        } else {
            byte b = usersSelectActivity.y;
            if (b == 2) {
                this.s = (!usersSelectActivity.J ? 1 : 0) + 5;
            } else if (b != 0) {
                this.s = 0;
            } else if (usersSelectActivity.K) {
                this.s = 7;
            } else {
                this.s = 5;
            }
        }
        byte b2 = usersSelectActivity.y;
        boolean z = b2 != 2 || usersSelectActivity.I;
        boolean z2 = b2 != 2;
        ArrayList arrayList = usersSelectActivity.getMessagesController().y;
        int size = arrayList.size();
        int i = 0;
        boolean z3 = false;
        while (i < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
            if (!wf3.B(dialog.id)) {
                if (wf3.D(dialog.id)) {
                    TLRPC.User X1 = usersSelectActivity.getMessagesController().X1(Long.valueOf(dialog.id));
                    if (X1 != null && ((usersSelectActivity.H || !lbc.D(X1)) && (!X1.bot || z))) {
                        this.r.add(X1);
                        if (lbc.D(X1)) {
                            z3 = true;
                        }
                    }
                } else {
                    TLRPC.Chat M0 = usersSelectActivity.getMessagesController().M0(Long.valueOf(-dialog.id));
                    if (z2 && M0 != null) {
                        this.r.add(M0);
                    }
                }
            }
            i++;
            z3 = z3;
        }
        if (!z3 && usersSelectActivity.H) {
            this.r.add(0, usersSelectActivity.getMessagesController().X1(Long.valueOf(usersSelectActivity.getUserConfig().n)));
        }
        sv9 sv9Var = new sv9(false);
        this.f = sv9Var;
        sv9Var.p = false;
        sv9Var.a = new ftb(this, (byte) 7);
    }

    @Override // j79
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof bd5) {
            ((bd5) view).a.getImageReceiver().c();
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 1;
    }

    @Override // l69
    public final String F(int i) {
        return null;
    }

    @Override // l69
    public final void G(d79 d79Var, float f, int[] iArr) {
        iArr[0] = (int) (b() * f);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.g.a(this.h);
            this.h = null;
        }
        UsersSelectActivity usersSelectActivity = this.w;
        byte b = usersSelectActivity.y;
        boolean z = b != 2 || usersSelectActivity.I;
        boolean z2 = b != 2;
        if (str != null) {
            to3 to3Var = Utilities.g;
            acc accVar = new acc(this, str, z2, z, (byte) 0);
            this.h = accVar;
            to3Var.d(accVar, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        this.f.g(null, true, false, false, false, 0L, false, 0, 0);
        f();
    }

    @Override // j79
    public final int b() {
        if (this.n) {
            int size = this.d.size();
            sv9 sv9Var = this.f;
            return sv9Var.e.size() + sv9Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.w;
        int i = 0;
        if (!usersSelectActivity.G) {
            byte b = usersSelectActivity.y;
            if (b == 2) {
                i = (!usersSelectActivity.J ? 1 : 0) + 3;
            } else if (b == 0) {
                i = usersSelectActivity.K ? 7 : 5;
            }
        }
        return this.r.size() + i;
    }

    @Override // j79
    public final int d(int i) {
        byte b;
        if (!this.n) {
            UsersSelectActivity usersSelectActivity = this.w;
            if (!usersSelectActivity.G ? !((b = usersSelectActivity.y) != 2 ? b != 0 || (!usersSelectActivity.K ? !(i == 0 || i == 4) : !(i == 0 || i == 6)) : i != 0 && i != (!usersSelectActivity.J ? 1 : 0) + 4) : i == 0) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d6  */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        Object obj;
        String M0;
        CharSequence charSequence;
        SpannableStringBuilder spannableStringBuilder;
        long j;
        byte b;
        long j2;
        boolean z;
        SpannableStringBuilder spannableStringBuilder2;
        boolean z2;
        SpannableStringBuilder spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder4;
        boolean z3;
        sv9 sv9Var = this.f;
        ArrayList arrayList = sv9Var.d;
        ArrayList arrayList2 = sv9Var.e;
        int i2 = f89Var.f;
        View view = f89Var.a;
        UsersSelectActivity usersSelectActivity = this.w;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                p55 p55Var = (p55) view;
                if (i != 0 || usersSelectActivity.G) {
                    p55Var.setText(ob6.M0(2131750761, null));
                    return;
                } else {
                    p55Var.setText(ob6.M0(2131750762, null));
                    return;
                }
            }
            return;
        }
        bd5 bd5Var = (bd5) view;
        if (this.n) {
            int size = this.d.size();
            int size2 = arrayList2.size();
            int size3 = arrayList.size();
            obj = (i < 0 || i >= size) ? (i < size || i >= size3 + size) ? (i <= size + size3 || i >= (size2 + size) + size3) ? null : arrayList2.get((i - size) - size3) : arrayList.get(i - size) : this.d.get(i);
            if (obj != null) {
                String K = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : xc2.K((TLRPC.Chat) obj, false);
                if (i < size) {
                    charSequence = (CharSequence) this.e.get(i);
                    if (charSequence != null && !TextUtils.isEmpty(K)) {
                        if (charSequence.toString().startsWith("@" + K)) {
                            K = charSequence;
                        }
                    }
                    spannableStringBuilder = null;
                    j = obj instanceof TLRPC.User ? ((TLRPC.User) obj).id : obj instanceof TLRPC.Chat ? -((TLRPC.Chat) obj).id : 0L;
                    b = usersSelectActivity.y;
                    if (b != 2) {
                        if (b != 0) {
                            j2 = 0;
                            int i4 = usersSelectActivity.getMessagesController().R.f(j) != null ? ((TLRPC.Dialog) usersSelectActivity.getMessagesController().R.f(j)).ttl_period : 0;
                            if (i4 > 0) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                spannableStringBuilder5.append((CharSequence) "d");
                                spannableStringBuilder5.setSpan(new wm2(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                                spannableStringBuilder5.append((CharSequence) ob6.a0(null, null, 2131753869, ob6.c0(i4)).toLowerCase());
                                z3 = true;
                                spannableStringBuilder4 = spannableStringBuilder5;
                            } else {
                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                spannableStringBuilder6.append((CharSequence) "d");
                                spannableStringBuilder6.setSpan(new wm2(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                                spannableStringBuilder6.append((CharSequence) ob6.M0(2131753854, null));
                                spannableStringBuilder4 = spannableStringBuilder6;
                                z3 = false;
                            }
                            if (obj instanceof TLRPC.Chat) {
                                boolean z4 = z3;
                                z2 = xc2.y(13, (TLRPC.Chat) obj);
                                z = z4;
                                spannableStringBuilder3 = spannableStringBuilder4;
                                if (z2) {
                                    bd5Var.setAlpha(1.0f);
                                } else {
                                    bd5Var.setAlpha(0.5f);
                                }
                                bd5Var.d(obj, charSequence, spannableStringBuilder3);
                                yob.W(bd5Var.getStatusTextView(), z ? aob.n6 : aob.y6, null);
                                if (j != j2) {
                                    bd5Var.c(usersSelectActivity.P.h(j) >= 0, false);
                                    bd5Var.setCheckBoxEnabled(true);
                                    return;
                                }
                                return;
                            }
                            z = z3;
                            spannableStringBuilder2 = spannableStringBuilder4;
                            z2 = true;
                            spannableStringBuilder3 = spannableStringBuilder2;
                            if (z2) {
                            }
                            bd5Var.d(obj, charSequence, spannableStringBuilder3);
                            yob.W(bd5Var.getStatusTextView(), z ? aob.n6 : aob.y6, null);
                            if (j != j2) {
                            }
                        } else if (!this.n) {
                            Paint.FontMetricsInt fontMetricsInt = bd5Var.getStatusTextView().getPaint().getFontMetricsInt();
                            spannableStringBuilder = new SpannableStringBuilder();
                            ArrayList arrayList3 = usersSelectActivity.getMessagesController().G0;
                            int size4 = arrayList3.size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                ac7 ac7Var = (ac7) arrayList3.get(i5);
                                if (ac7Var.a(usersSelectActivity.getAccountInstance(), j)) {
                                    if (spannableStringBuilder.length() > 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    spannableStringBuilder.append((CharSequence) r47.A5(pv3.m(new SpannableStringBuilder(ac7Var.b), fontMetricsInt, false, null, 0), ac7Var.c, fontMetricsInt, false));
                                }
                            }
                        }
                    }
                    j2 = 0;
                    z = false;
                    spannableStringBuilder2 = spannableStringBuilder;
                    z2 = true;
                    spannableStringBuilder3 = spannableStringBuilder2;
                    if (z2) {
                    }
                    bd5Var.d(obj, charSequence, spannableStringBuilder3);
                    yob.W(bd5Var.getStatusTextView(), z ? aob.n6 : aob.y6, null);
                    if (j != j2) {
                    }
                } else if (i > size && !TextUtils.isEmpty(K)) {
                    String str = sv9Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        spannableStringBuilder7.append((CharSequence) "@");
                        spannableStringBuilder7.append((CharSequence) K);
                        int y1 = hl.y1(K, str);
                        if (y1 != -1) {
                            int length = str.length();
                            if (y1 == 0) {
                                length++;
                            } else {
                                y1++;
                            }
                            spannableStringBuilder7.setSpan(new ho4(aob.q6, null), y1, length + y1, 33);
                        }
                        K = spannableStringBuilder7;
                    } catch (Exception unused) {
                    }
                }
                charSequence = null;
                spannableStringBuilder = K;
                if (obj instanceof TLRPC.User) {
                }
                b = usersSelectActivity.y;
                if (b != 2) {
                }
                j2 = 0;
                z = false;
                spannableStringBuilder2 = spannableStringBuilder;
                z2 = true;
                spannableStringBuilder3 = spannableStringBuilder2;
                if (z2) {
                }
                bd5Var.d(obj, charSequence, spannableStringBuilder3);
                yob.W(bd5Var.getStatusTextView(), z ? aob.n6 : aob.y6, null);
                if (j != j2) {
                }
            }
        } else {
            int i6 = this.s;
            if (i < i6) {
                String str2 = "non_contacts";
                if (usersSelectActivity.y == 2) {
                    if (i == 1) {
                        M0 = ob6.M0(2131750741, null);
                        str2 = "existing_chats";
                        i3 = 1;
                    } else if (i == 2 && !usersSelectActivity.J) {
                        M0 = ob6.M0(2131750692, null);
                        str2 = "new_chats";
                    } else if (i == (!usersSelectActivity.J ? 1 : 0) + 2) {
                        M0 = ob6.M0(2131750756, null);
                        str2 = "contacts";
                        i3 = 4;
                    } else {
                        M0 = ob6.M0(2131750683, null);
                        i3 = 8;
                    }
                } else if (usersSelectActivity.K) {
                    if (i == 1) {
                        M0 = ob6.M0(2131750756, null);
                        int i7 = uc7.r5;
                        str2 = "contacts";
                        i3 = 1;
                    } else if (i == 2) {
                        M0 = ob6.M0(2131750683, null);
                        int i8 = uc7.r5;
                    } else if (i == 3) {
                        M0 = ob6.M0(2131750739, null);
                        int i9 = uc7.r5;
                        str2 = "groups";
                        i3 = 4;
                    } else if (i == 4) {
                        M0 = ob6.M0(2131750765, null);
                        int i10 = uc7.r5;
                        str2 = "channels";
                        i3 = 8;
                    } else {
                        M0 = ob6.M0(2131750766, null);
                        int i11 = uc7.r5;
                        str2 = "bots";
                        i3 = 16;
                    }
                } else if (i == 1) {
                    M0 = ob6.M0(2131750701, null);
                    int i12 = uc7.r5;
                    str2 = "muted";
                    i3 = 32;
                } else if (i == 2) {
                    M0 = ob6.M0(2131750682, null);
                    int i13 = uc7.r5;
                    str2 = "read";
                    i3 = 64;
                } else {
                    M0 = ob6.M0(2131750769, null);
                    int i14 = uc7.r5;
                    str2 = "archived";
                    i3 = 128;
                }
                bd5Var.d(str2, M0, null);
                bd5Var.c((usersSelectActivity.L & i3) == i3, false);
                bd5Var.setCheckBoxEnabled(true);
                return;
            }
            obj = this.r.get(i - i6);
        }
        charSequence = null;
        spannableStringBuilder = null;
        if (obj instanceof TLRPC.User) {
        }
        b = usersSelectActivity.y;
        if (b != 2) {
        }
        j2 = 0;
        z = false;
        spannableStringBuilder2 = spannableStringBuilder;
        z2 = true;
        spannableStringBuilder3 = spannableStringBuilder2;
        if (z2) {
        }
        bd5Var.d(obj, charSequence, spannableStringBuilder3);
        yob.W(bd5Var.getStatusTextView(), z ? aob.n6 : aob.y6, null);
        if (j != j2) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        return new n69(i != 1 ? new p55(context, null) : new bd5(context, 1, 0, true));
    }
}
