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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class b8c extends w29 {
    public final Context c;
    public final zr9 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final /* synthetic */ UsersSelectActivity w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public b8c(UsersSelectActivity usersSelectActivity, Context context) {
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
            if (!cf3.B(dialog.id)) {
                if (cf3.D(dialog.id)) {
                    TLRPC.User V1 = usersSelectActivity.getMessagesController().V1(Long.valueOf(dialog.id));
                    if (V1 != null && ((usersSelectActivity.H || !l7c.C(V1)) && (!V1.bot || z))) {
                        this.r.add(V1);
                        if (l7c.C(V1)) {
                            z3 = true;
                        }
                    }
                } else {
                    TLRPC.Chat K0 = usersSelectActivity.getMessagesController().K0(Long.valueOf(-dialog.id));
                    if (z2 && K0 != null) {
                        this.r.add(K0);
                    }
                }
            }
            i++;
            z3 = z3;
        }
        if (!z3 && usersSelectActivity.H) {
            this.r.add(0, usersSelectActivity.getMessagesController().V1(Long.valueOf(usersSelectActivity.getUserConfig().n)));
        }
        zr9 zr9Var = new zr9(false);
        this.f = zr9Var;
        zr9Var.p = false;
        zr9Var.a = new hza(this, (byte) 24);
    }

    @Override // w39
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof za5) {
            ((za5) view).a.getImageReceiver().c();
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f == 1;
    }

    @Override // w29
    public final String F(int i) {
        return null;
    }

    @Override // w29
    public final void G(o39 o39Var, float f, int[] iArr) {
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
            co3 co3Var = Utilities.g;
            a8c a8cVar = new a8c(this, str, z2, z, (byte) 0);
            this.h = a8cVar;
            co3Var.d(a8cVar, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        this.f.g(null, true, false, false, false, 0L, false, 0, 0);
        f();
    }

    @Override // w39
    public final int b() {
        if (this.n) {
            int size = this.d.size();
            zr9 zr9Var = this.f;
            return zr9Var.e.size() + zr9Var.d.size() + size;
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

    @Override // w39
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
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
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
        zr9 zr9Var = this.f;
        ArrayList arrayList = zr9Var.d;
        ArrayList arrayList2 = zr9Var.e;
        int i2 = s49Var.f;
        View view = s49Var.a;
        UsersSelectActivity usersSelectActivity = this.w;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                l35 l35Var = (l35) view;
                if (i != 0 || usersSelectActivity.G) {
                    l35Var.setText(k96.M0(2131750784, null));
                    return;
                } else {
                    l35Var.setText(k96.M0(2131750785, null));
                    return;
                }
            }
            return;
        }
        za5 za5Var = (za5) view;
        if (this.n) {
            int size = this.d.size();
            int size2 = arrayList2.size();
            int size3 = arrayList.size();
            obj = (i < 0 || i >= size) ? (i < size || i >= size3 + size) ? (i <= size + size3 || i >= (size2 + size) + size3) ? null : arrayList2.get((i - size) - size3) : arrayList.get(i - size) : this.d.get(i);
            if (obj != null) {
                String K = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : hc2.K((TLRPC.Chat) obj, false);
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
                                spannableStringBuilder5.setSpan(new cm2(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                                spannableStringBuilder5.append((CharSequence) k96.a0(null, null, 2131753873, k96.c0(i4)).toLowerCase());
                                z3 = true;
                                spannableStringBuilder4 = spannableStringBuilder5;
                            } else {
                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                spannableStringBuilder6.append((CharSequence) "d");
                                spannableStringBuilder6.setSpan(new cm2(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                                spannableStringBuilder6.append((CharSequence) k96.M0(2131753858, null));
                                spannableStringBuilder4 = spannableStringBuilder6;
                                z3 = false;
                            }
                            if (obj instanceof TLRPC.Chat) {
                                boolean z4 = z3;
                                z2 = hc2.y(13, (TLRPC.Chat) obj);
                                z = z4;
                                spannableStringBuilder3 = spannableStringBuilder4;
                                if (z2) {
                                    za5Var.setAlpha(1.0f);
                                } else {
                                    za5Var.setAlpha(0.5f);
                                }
                                za5Var.d(obj, charSequence, spannableStringBuilder3);
                                zkb.W(za5Var.getStatusTextView(), z ? bkb.m6 : bkb.x6, null);
                                if (j != j2) {
                                    za5Var.c(usersSelectActivity.P.h(j) >= 0, false);
                                    za5Var.setCheckBoxEnabled(true);
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
                            za5Var.d(obj, charSequence, spannableStringBuilder3);
                            zkb.W(za5Var.getStatusTextView(), z ? bkb.m6 : bkb.x6, null);
                            if (j != j2) {
                            }
                        } else if (!this.n) {
                            Paint.FontMetricsInt fontMetricsInt = za5Var.getStatusTextView().getPaint().getFontMetricsInt();
                            spannableStringBuilder = new SpannableStringBuilder();
                            ArrayList arrayList3 = usersSelectActivity.getMessagesController().G0;
                            int size4 = arrayList3.size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                t97 t97Var = (t97) arrayList3.get(i5);
                                if (t97Var.a(usersSelectActivity.getAccountInstance(), j)) {
                                    if (spannableStringBuilder.length() > 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    spannableStringBuilder.append((CharSequence) k27.A5(vu3.m(new SpannableStringBuilder(t97Var.b), fontMetricsInt, false, null, 0), t97Var.c, fontMetricsInt, false));
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
                    za5Var.d(obj, charSequence, spannableStringBuilder3);
                    zkb.W(za5Var.getStatusTextView(), z ? bkb.m6 : bkb.x6, null);
                    if (j != j2) {
                    }
                } else if (i > size && !TextUtils.isEmpty(K)) {
                    String str = zr9Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        spannableStringBuilder7.append((CharSequence) "@");
                        spannableStringBuilder7.append((CharSequence) K);
                        int y1 = gl.y1(K, str);
                        if (y1 != -1) {
                            int length = str.length();
                            if (y1 == 0) {
                                length++;
                            } else {
                                y1++;
                            }
                            spannableStringBuilder7.setSpan(new cm4(bkb.p6, null), y1, length + y1, 33);
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
                za5Var.d(obj, charSequence, spannableStringBuilder3);
                zkb.W(za5Var.getStatusTextView(), z ? bkb.m6 : bkb.x6, null);
                if (j != j2) {
                }
            }
        } else {
            int i6 = this.s;
            if (i < i6) {
                String str2 = "non_contacts";
                if (usersSelectActivity.y == 2) {
                    if (i == 1) {
                        M0 = k96.M0(2131750764, null);
                        str2 = "existing_chats";
                        i3 = 1;
                    } else if (i == 2 && !usersSelectActivity.J) {
                        M0 = k96.M0(2131750715, null);
                        str2 = "new_chats";
                    } else if (i == (!usersSelectActivity.J ? 1 : 0) + 2) {
                        M0 = k96.M0(2131750779, null);
                        str2 = "contacts";
                        i3 = 4;
                    } else {
                        M0 = k96.M0(2131750706, null);
                        i3 = 8;
                    }
                } else if (usersSelectActivity.K) {
                    if (i == 1) {
                        M0 = k96.M0(2131750779, null);
                        int i7 = na7.q5;
                        str2 = "contacts";
                        i3 = 1;
                    } else if (i == 2) {
                        M0 = k96.M0(2131750706, null);
                        int i8 = na7.q5;
                    } else if (i == 3) {
                        M0 = k96.M0(2131750762, null);
                        int i9 = na7.q5;
                        str2 = "groups";
                        i3 = 4;
                    } else if (i == 4) {
                        M0 = k96.M0(2131750788, null);
                        int i10 = na7.q5;
                        str2 = "channels";
                        i3 = 8;
                    } else {
                        M0 = k96.M0(2131750789, null);
                        int i11 = na7.q5;
                        str2 = "bots";
                        i3 = 16;
                    }
                } else if (i == 1) {
                    M0 = k96.M0(2131750724, null);
                    int i12 = na7.q5;
                    str2 = "muted";
                    i3 = 32;
                } else if (i == 2) {
                    M0 = k96.M0(2131750705, null);
                    int i13 = na7.q5;
                    str2 = "read";
                    i3 = 64;
                } else {
                    M0 = k96.M0(2131750792, null);
                    int i14 = na7.q5;
                    str2 = "archived";
                    i3 = 128;
                }
                za5Var.d(str2, M0, null);
                za5Var.c((usersSelectActivity.L & i3) == i3, false);
                za5Var.setCheckBoxEnabled(true);
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
        za5Var.d(obj, charSequence, spannableStringBuilder3);
        zkb.W(za5Var.getStatusTextView(), z ? bkb.m6 : bkb.x6, null);
        if (j != j2) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        return new y29(i != 1 ? new l35(context, null) : new za5(context, 1, 0, true));
    }
}
