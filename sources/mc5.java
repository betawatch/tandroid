// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class mc5 extends z49 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final /* synthetic */ oc5 J;
    public final Context c;
    public final bu9 f;
    public Runnable h;
    public boolean n;
    public int s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public mc5(oc5 oc5Var, Context context) {
        TLRPC.Chat L0;
        TLRPC.User W1;
        this.J = oc5Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        bw2 contactsController = oc5Var.getContactsController();
        boolean z = oc5Var.R;
        ArrayList arrayList = contactsController.f0;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.User W12 = oc5Var.getMessagesController().W1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i)).user_id));
            if (W12 != null && !W12.self && !W12.deleted) {
                this.r.add(W12);
                hashSet.add(Long.valueOf(W12.id));
            }
        }
        if (oc5Var.Q || oc5Var.P || z) {
            ArrayList arrayList2 = oc5Var.getMessagesController().y;
            if (z) {
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i2);
                    if (pg3.D(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (W1 = oc5Var.getMessagesController().W1(Long.valueOf(dialog.id))) != null && !m9c.z(W1) && !m9c.D(W1) && !m9c.v(W1) && !m9c.C(dialog.id) && !oc7.G2(W1)) {
                        this.r.add(W1);
                        hashSet.add(Long.valueOf(W1.id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i3);
                    if (pg3.y(dialog2.id) && (L0 = oc5Var.getMessagesController().L0(Long.valueOf(-dialog2.id))) != null && L0.migrated_to == null && (!sd2.T(L0) || L0.megagroup)) {
                        this.r.add(L0);
                    }
                }
            }
            Collections.sort(this.r, new hc5());
            TLObject tLObject = null;
            int i4 = 0;
            while (i4 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i4);
                if (tLObject != null) {
                    String a = hc5.a(tLObject);
                    String substring = TextUtils.isEmpty(a) ? "" : a.substring(0, 1);
                    String a2 = hc5.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a2) ? "" : a2.substring(0, 1))) {
                        i4++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.r;
                String a3 = hc5.a(tLObject2);
                arrayList3.add(i4, new nc5(TextUtils.isEmpty(a3) ? "" : a3.substring(0, 1)));
                i4++;
                tLObject = tLObject2;
            }
        }
        bu9 bu9Var = new bu9(false);
        this.f = bu9Var;
        bu9Var.a = new wx4((Object) this, (byte) 9);
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
        if (u69Var.f == 0) {
            return false;
        }
        oc5 oc5Var = this.J;
        if (oc5Var.K == null) {
            return true;
        }
        View view = u69Var.a;
        if (!(view instanceof xc5)) {
            return true;
        }
        Object object = ((xc5) view).getObject();
        return !(object instanceof TLRPC.User) || oc5Var.K.h(((TLRPC.User) object).id) < 0;
    }

    @Override // z49
    public final String F(int i) {
        String str;
        String str2;
        if (this.n || i < this.F) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i2 = this.F;
        if (i >= size + i2) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i - i2);
        if (tLObject instanceof nc5) {
            return ((nc5) tLObject).a;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = ((TLRPC.Chat) tLObject).title;
            str2 = "";
        }
        if (jb6.b0 == 1) {
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
        }
        return "";
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
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        bu9 bu9Var = this.f;
        oc5 oc5Var = this.J;
        byte b = 0;
        bu9Var.g(null, true, oc5Var.P || oc5Var.Q, false, false, 0L, false, 0, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        mp3 mp3Var = Utilities.g;
        kc5 kc5Var = new kc5(this, str, b);
        this.h = kc5Var;
        mp3Var.d(kc5Var, 300L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // y59
    public final int b() {
        int i;
        boolean z;
        oc5 oc5Var = this.J;
        long j = oc5Var.I;
        long j2 = oc5Var.H;
        this.H = -1;
        this.s = -1;
        this.x = -1;
        this.w = -1;
        this.y = -1;
        this.E = -1;
        if (this.n) {
            int size = this.d.size();
            bu9 bu9Var = this.f;
            int size2 = bu9Var.d.size();
            int size3 = bu9Var.e.size();
            int i2 = size + size2;
            if (size3 != 0) {
                i2 += size3 + 1;
            }
            this.I = i2;
            return i2;
        }
        if (oc5Var.R) {
            this.x = 0;
            i = 1;
        } else {
            i = 0;
        }
        if (oc5Var.W) {
            int i3 = i + 1;
            this.w = i;
            this.s = i;
            i += 2;
            this.y = i3;
        } else if (oc5Var.X) {
            int i4 = i + 1;
            this.w = i;
            this.s = i;
            i += 2;
            this.E = i4;
        } else {
            this.w = i;
        }
        this.F = i;
        int size4 = this.r.size() + i;
        if (oc5Var.S) {
            if (j2 != 0) {
                boolean y = sd2.y(3, oc5Var.getMessagesController().L0(Long.valueOf(j2)));
                this.G = y ? 1 : 0;
                z = y;
            } else if (j != 0) {
                TLRPC.Chat L0 = oc5Var.getMessagesController().L0(Long.valueOf(j));
                ?? r0 = (!sd2.y(3, L0) || sd2.t0(L0)) ? 0 : 2;
                this.G = r0 == true ? 1 : 0;
                z = r0;
            } else {
                this.G = 0;
                z = false;
            }
            if (z) {
                this.F++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.H = 0;
            size4++;
        }
        this.I = size4;
        return size4;
    }

    @Override // y59
    public final int d(int i) {
        if (this.n) {
            return i == this.f.d.size() + this.d.size() ? 0 : 1;
        }
        if (i == this.x) {
            return 2;
        }
        if (i == this.s) {
            return 0;
        }
        if (i == this.y || i == this.E) {
            return 1;
        }
        if (this.G != 0 && i == 0) {
            return 2;
        }
        if (this.H == i) {
            return 3;
        }
        int i2 = i - this.F;
        if (i2 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i2 >= arrayList.size() || !(arrayList.get(i - this.F) instanceof nc5)) ? 1 : 0;
    }

    @Override // y59
    public final void f() {
        super.f();
        this.J.w0();
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String K;
        int i2 = u69Var.f;
        View view = u69Var.a;
        ArrayList arrayList = this.r;
        oc5 oc5Var = this.J;
        CharSequence charSequence3 = null;
        if (i2 == 0) {
            l55 l55Var = (l55) view;
            if (this.n) {
                l55Var.setText(jb6.M0(2131749309, null));
            } else if (i == this.s) {
                l55Var.setText(jb6.M0(2131746503, null));
            } else {
                int i3 = i - this.F;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i - this.F);
                    if (tLObject2 instanceof nc5) {
                        l55Var.setText(((nc5) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i == this.w) {
                l55Var.a((oc5Var.Y == null && oc5Var.a0.i()) ? "" : jb6.M0(2131751394, null), new ca5(this, (byte) 7));
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                xib xibVar = (xib) view;
                if (i == this.x) {
                    xibVar.o(R.drawable.menu_link_create2, jb6.M0(2131749242, null), false);
                    xibVar.g(cmb.u6, cmb.t6);
                    return;
                } else if (this.G == 2) {
                    xibVar.o(R.drawable.msg_link2, jb6.M0(2131752346, null), false);
                    xibVar.g(cmb.l6, cmb.F6);
                    return;
                } else {
                    xibVar.o(R.drawable.msg_link2, jb6.M0(2131748867, null), false);
                    xibVar.g(cmb.l6, cmb.F6);
                    return;
                }
            }
            return;
        }
        xc5 xc5Var = (xc5) view;
        if (this.n) {
            int size = this.d.size();
            bu9 bu9Var = this.f;
            ArrayList arrayList2 = bu9Var.e;
            ArrayList arrayList3 = bu9Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i < 0 || i >= size) ? (i < size || i >= size3 + size) ? (i <= size + size3 || i > (size2 + size) + size3) ? null : (TLObject) bu9Var.e.get(((i - size) - size3) - 1) : (TLObject) arrayList3.get(i - size) : (TLObject) this.d.get(i);
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    K = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    K = sd2.K((TLRPC.Chat) tLObject, false);
                }
                if (i < size) {
                    charSequence2 = (CharSequence) this.e.get(i);
                    if (charSequence2 != null && !TextUtils.isEmpty(K)) {
                        if (charSequence2.toString().startsWith("@" + K)) {
                            charSequence3 = charSequence2;
                            charSequence2 = null;
                        }
                    }
                } else if (i > size && !TextUtils.isEmpty(K)) {
                    String str = bu9Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) K);
                        int y1 = gm.y1(K, str);
                        if (y1 != -1) {
                            int length = str.length();
                            if (y1 == 0) {
                                length++;
                            } else {
                                y1++;
                            }
                            spannableStringBuilder.setSpan(new do4(cmb.p6, null), y1, length + y1, 33);
                        }
                        charSequence2 = null;
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception unused) {
                        charSequence2 = null;
                        charSequence3 = K;
                    }
                }
                CharSequence charSequence4 = charSequence3;
                charSequence3 = charSequence2;
                charSequence = charSequence4;
            }
            charSequence2 = null;
            CharSequence charSequence42 = charSequence3;
            charSequence3 = charSequence2;
            charSequence = charSequence42;
        } else {
            if (i == this.y) {
                xc5Var.r = true;
                xc5Var.f = "premium";
                xc5Var.a.setImageDrawable(xc5.b(xc5Var.getContext(), false));
                xc5Var.b.l(jb6.M0(2131746515, null), false);
                lka lkaVar = xc5Var.c;
                int i4 = cmb.x6;
                lkaVar.setTag(Integer.valueOf(i4));
                if (xc5Var.L) {
                    i4 = cmb.eh;
                }
                anb.W(lkaVar, i4, xc5Var.N);
                lkaVar.setEmojiColor(lkaVar.getTextColor());
                lkaVar.l(jb6.M0(2131746513, null), false);
                xc5Var.c(oc5Var.Y != null, false);
                return;
            }
            if (i == this.E) {
                xc5Var.s = true;
                xc5Var.f = "miniapps";
                bf0 bf0Var = xc5Var.a;
                xc5Var.getContext();
                bf0Var.setImageDrawable(xc5.a(false));
                xc5Var.b.l(jb6.M0(2131746541, null), false);
                lka lkaVar2 = xc5Var.c;
                int i5 = cmb.x6;
                lkaVar2.setTag(Integer.valueOf(i5));
                if (xc5Var.L) {
                    i5 = cmb.eh;
                }
                anb.W(lkaVar2, i5, xc5Var.N);
                lkaVar2.setEmojiColor(lkaVar2.getTextColor());
                lkaVar2.l(jb6.M0(2131746540, null), false);
                xc5Var.c(oc5Var.Z != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i - this.F);
            charSequence = null;
        }
        xc5Var.d(tLObject, charSequence3, charSequence);
        long j = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j != 0) {
            vh6 vh6Var = oc5Var.K;
            if (vh6Var == null || vh6Var.h(j) < 0) {
                xc5Var.c(oc5Var.a0.h(j) >= 0, false);
                xc5Var.setCheckBoxEnabled(true);
            } else {
                xc5Var.c(true, false);
                xc5Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View l55Var;
        Context context = this.c;
        if (i == 0) {
            l55Var = new l55(context, null);
        } else if (i == 1) {
            l55Var = new xc5(context, 1, 0, false);
        } else if (i != 3) {
            l55Var = new xib(context);
        } else {
            lc5 lc5Var = new lc5(context, null, 0, null, (byte) 0);
            lc5Var.setLayoutParams(new g69(-1, -1));
            lc5Var.e.setVisibility(8);
            lc5Var.d.setText(jb6.M0(2131747957, null));
            lc5Var.setAnimateLayoutChange(true);
            l55Var = lc5Var;
        }
        return new b59(l55Var);
    }
}
