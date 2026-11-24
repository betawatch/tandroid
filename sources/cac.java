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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cac extends z49 {
    public final Context c;
    public final bu9 f;
    public Runnable h;
    public boolean n;
    public final int s;
    public final /* synthetic */ UsersSelectActivity w;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public cac(UsersSelectActivity usersSelectActivity, Context context) {
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
            if (!pg3.B(dialog.id)) {
                if (pg3.D(dialog.id)) {
                    TLRPC.User W1 = usersSelectActivity.getMessagesController().W1(Long.valueOf(dialog.id));
                    if (W1 != null && ((usersSelectActivity.H || !m9c.D(W1)) && (!W1.bot || z))) {
                        this.r.add(W1);
                        if (m9c.D(W1)) {
                            z3 = true;
                        }
                    }
                } else {
                    TLRPC.Chat L0 = usersSelectActivity.getMessagesController().L0(Long.valueOf(-dialog.id));
                    if (z2 && L0 != null) {
                        this.r.add(L0);
                    }
                }
            }
            i++;
            z3 = z3;
        }
        if (!z3 && usersSelectActivity.H) {
            this.r.add(0, usersSelectActivity.getMessagesController().W1(Long.valueOf(usersSelectActivity.getUserConfig().n)));
        }
        bu9 bu9Var = new bu9(false);
        this.f = bu9Var;
        bu9Var.p = false;
        bu9Var.a = new wta(this, (byte) 28);
    }

    @Override // y59
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof xc5) {
            ((xc5) view).a.getImageReceiver().c();
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 1;
    }

    @Override // z49
    public final String F(int i) {
        return null;
    }

    @Override // z49
    public final void G(r59 r59Var, float f, int[] iArr) {
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
            mp3 mp3Var = Utilities.g;
            bac bacVar = new bac(this, str, z2, z, (byte) 0);
            this.h = bacVar;
            mp3Var.d(bacVar, 300L);
            return;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        this.f.g(null, true, false, false, false, 0L, false, 0, 0);
        f();
    }

    @Override // y59
    public final int b() {
        if (this.n) {
            int size = this.d.size();
            bu9 bu9Var = this.f;
            return bu9Var.e.size() + bu9Var.d.size() + size;
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

    @Override // y59
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
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
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
        bu9 bu9Var = this.f;
        ArrayList arrayList = bu9Var.d;
        ArrayList arrayList2 = bu9Var.e;
        int i2 = u69Var.f;
        View view = u69Var.a;
        UsersSelectActivity usersSelectActivity = this.w;
        int i3 = 2;
        if (i2 != 1) {
            if (i2 == 2) {
                l55 l55Var = (l55) view;
                if (i != 0 || usersSelectActivity.G) {
                    l55Var.setText(jb6.M0(2131750733, null));
                    return;
                } else {
                    l55Var.setText(jb6.M0(2131750734, null));
                    return;
                }
            }
            return;
        }
        xc5 xc5Var = (xc5) view;
        if (this.n) {
            int size = this.d.size();
            int size2 = arrayList2.size();
            int size3 = arrayList.size();
            obj = (i < 0 || i >= size) ? (i < size || i >= size3 + size) ? (i <= size + size3 || i >= (size2 + size) + size3) ? null : arrayList2.get((i - size) - size3) : arrayList.get(i - size) : this.d.get(i);
            if (obj != null) {
                String K = obj instanceof TLRPC.User ? ((TLRPC.User) obj).username : sd2.K((TLRPC.Chat) obj, false);
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
                                spannableStringBuilder5.setSpan(new pn2(R.drawable.msg_mini_fireon, 0), 0, 1, 0);
                                spannableStringBuilder5.append((CharSequence) jb6.a0(null, null, 2131753841, jb6.c0(i4)).toLowerCase());
                                z3 = true;
                                spannableStringBuilder4 = spannableStringBuilder5;
                            } else {
                                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                                spannableStringBuilder6.append((CharSequence) "d");
                                spannableStringBuilder6.setSpan(new pn2(R.drawable.msg_mini_fireoff, 0), 0, 1, 0);
                                spannableStringBuilder6.append((CharSequence) jb6.M0(2131753826, null));
                                spannableStringBuilder4 = spannableStringBuilder6;
                                z3 = false;
                            }
                            if (obj instanceof TLRPC.Chat) {
                                boolean z4 = z3;
                                z2 = sd2.y(13, (TLRPC.Chat) obj);
                                z = z4;
                                spannableStringBuilder3 = spannableStringBuilder4;
                                if (z2) {
                                    xc5Var.setAlpha(1.0f);
                                } else {
                                    xc5Var.setAlpha(0.5f);
                                }
                                xc5Var.d(obj, charSequence, spannableStringBuilder3);
                                anb.W(xc5Var.getStatusTextView(), z ? cmb.m6 : cmb.x6, null);
                                if (j != j2) {
                                    xc5Var.c(usersSelectActivity.P.h(j) >= 0, false);
                                    xc5Var.setCheckBoxEnabled(true);
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
                            xc5Var.d(obj, charSequence, spannableStringBuilder3);
                            anb.W(xc5Var.getStatusTextView(), z ? cmb.m6 : cmb.x6, null);
                            if (j != j2) {
                            }
                        } else if (!this.n) {
                            Paint.FontMetricsInt fontMetricsInt = xc5Var.getStatusTextView().getPaint().getFontMetricsInt();
                            spannableStringBuilder = new SpannableStringBuilder();
                            ArrayList arrayList3 = usersSelectActivity.getMessagesController().G0;
                            int size4 = arrayList3.size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                ub7 ub7Var = (ub7) arrayList3.get(i5);
                                if (ub7Var.a(usersSelectActivity.getAccountInstance(), j)) {
                                    if (spannableStringBuilder.length() > 0) {
                                        spannableStringBuilder.append((CharSequence) ", ");
                                    }
                                    spannableStringBuilder.append((CharSequence) k47.A5(gw3.m(new SpannableStringBuilder(ub7Var.b), fontMetricsInt, false, null, 0), ub7Var.c, fontMetricsInt, false));
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
                    xc5Var.d(obj, charSequence, spannableStringBuilder3);
                    anb.W(xc5Var.getStatusTextView(), z ? cmb.m6 : cmb.x6, null);
                    if (j != j2) {
                    }
                } else if (i > size && !TextUtils.isEmpty(K)) {
                    String str = bu9Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                        spannableStringBuilder7.append((CharSequence) "@");
                        spannableStringBuilder7.append((CharSequence) K);
                        int y1 = gm.y1(K, str);
                        if (y1 != -1) {
                            int length = str.length();
                            if (y1 == 0) {
                                length++;
                            } else {
                                y1++;
                            }
                            spannableStringBuilder7.setSpan(new do4(cmb.p6, null), y1, length + y1, 33);
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
                xc5Var.d(obj, charSequence, spannableStringBuilder3);
                anb.W(xc5Var.getStatusTextView(), z ? cmb.m6 : cmb.x6, null);
                if (j != j2) {
                }
            }
        } else {
            int i6 = this.s;
            if (i < i6) {
                String str2 = "non_contacts";
                if (usersSelectActivity.y == 2) {
                    if (i == 1) {
                        M0 = jb6.M0(2131750713, null);
                        str2 = "existing_chats";
                        i3 = 1;
                    } else if (i == 2 && !usersSelectActivity.J) {
                        M0 = jb6.M0(2131750664, null);
                        str2 = "new_chats";
                    } else if (i == (!usersSelectActivity.J ? 1 : 0) + 2) {
                        M0 = jb6.M0(2131750728, null);
                        str2 = "contacts";
                        i3 = 4;
                    } else {
                        M0 = jb6.M0(2131750655, null);
                        i3 = 8;
                    }
                } else if (usersSelectActivity.K) {
                    if (i == 1) {
                        M0 = jb6.M0(2131750728, null);
                        int i7 = oc7.s5;
                        str2 = "contacts";
                        i3 = 1;
                    } else if (i == 2) {
                        M0 = jb6.M0(2131750655, null);
                        int i8 = oc7.s5;
                    } else if (i == 3) {
                        M0 = jb6.M0(2131750711, null);
                        int i9 = oc7.s5;
                        str2 = "groups";
                        i3 = 4;
                    } else if (i == 4) {
                        M0 = jb6.M0(2131750737, null);
                        int i10 = oc7.s5;
                        str2 = "channels";
                        i3 = 8;
                    } else {
                        M0 = jb6.M0(2131750738, null);
                        int i11 = oc7.s5;
                        str2 = "bots";
                        i3 = 16;
                    }
                } else if (i == 1) {
                    M0 = jb6.M0(2131750673, null);
                    int i12 = oc7.s5;
                    str2 = "muted";
                    i3 = 32;
                } else if (i == 2) {
                    M0 = jb6.M0(2131750654, null);
                    int i13 = oc7.s5;
                    str2 = "read";
                    i3 = 64;
                } else {
                    M0 = jb6.M0(2131750741, null);
                    int i14 = oc7.s5;
                    str2 = "archived";
                    i3 = 128;
                }
                xc5Var.d(str2, M0, null);
                xc5Var.c((usersSelectActivity.L & i3) == i3, false);
                xc5Var.setCheckBoxEnabled(true);
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
        xc5Var.d(obj, charSequence, spannableStringBuilder3);
        anb.W(xc5Var.getStatusTextView(), z ? cmb.m6 : cmb.x6, null);
        if (j != j2) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        return new b59(i != 1 ? new l55(context, null) : new xc5(context, 1, 0, true));
    }
}
