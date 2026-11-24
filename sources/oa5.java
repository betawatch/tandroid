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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oa5 extends w29 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final /* synthetic */ qa5 J;
    public final Context c;
    public final zr9 f;
    public Runnable h;
    public boolean n;
    public int s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public oa5(qa5 qa5Var, Context context) {
        TLRPC.Chat K0;
        TLRPC.User V1;
        this.J = qa5Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        qu2 contactsController = qa5Var.getContactsController();
        boolean z = qa5Var.R;
        ArrayList arrayList = contactsController.f0;
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.User V12 = qa5Var.getMessagesController().V1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i)).user_id));
            if (V12 != null && !V12.self && !V12.deleted) {
                this.r.add(V12);
                hashSet.add(Long.valueOf(V12.id));
            }
        }
        if (qa5Var.Q || qa5Var.P || z) {
            ArrayList arrayList2 = qa5Var.getMessagesController().y;
            if (z) {
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i2);
                    if (cf3.D(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (V1 = qa5Var.getMessagesController().V1(Long.valueOf(dialog.id))) != null && !l7c.z(V1) && !l7c.D(V1) && !l7c.v(V1) && !l7c.C(dialog.id) && !na7.E2(V1)) {
                        this.r.add(V1);
                        hashSet.add(Long.valueOf(V1.id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i3);
                    if (cf3.y(dialog2.id) && (K0 = qa5Var.getMessagesController().K0(Long.valueOf(-dialog2.id))) != null && K0.migrated_to == null && (!hc2.T(K0) || K0.megagroup)) {
                        this.r.add(K0);
                    }
                }
            }
            Collections.sort(this.r, new ja5());
            TLObject tLObject = null;
            int i4 = 0;
            while (i4 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i4);
                if (tLObject != null) {
                    String a = ja5.a(tLObject);
                    String substring = TextUtils.isEmpty(a) ? "" : a.substring(0, 1);
                    String a2 = ja5.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a2) ? "" : a2.substring(0, 1))) {
                        i4++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.r;
                String a3 = ja5.a(tLObject2);
                arrayList3.add(i4, new pa5(TextUtils.isEmpty(a3) ? "" : a3.substring(0, 1)));
                i4++;
                tLObject = tLObject2;
            }
        }
        zr9 zr9Var = new zr9(false);
        this.f = zr9Var;
        zr9Var.a = new ry4((Object) this, (byte) 6);
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
        if (s49Var.f == 0) {
            return false;
        }
        qa5 qa5Var = this.J;
        if (qa5Var.K == null) {
            return true;
        }
        View view = s49Var.a;
        if (!(view instanceof za5)) {
            return true;
        }
        Object object = ((za5) view).getObject();
        return !(object instanceof TLRPC.User) || qa5Var.K.h(((TLRPC.User) object).id) < 0;
    }

    @Override // w29
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
        if (tLObject instanceof pa5) {
            return ((pa5) tLObject).a;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = ((TLRPC.Chat) tLObject).title;
            str2 = "";
        }
        if (k96.b0 == 1) {
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
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        zr9 zr9Var = this.f;
        qa5 qa5Var = this.J;
        byte b = 0;
        zr9Var.g(null, true, qa5Var.P || qa5Var.Q, false, false, 0L, false, 0, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        co3 co3Var = Utilities.g;
        ma5 ma5Var = new ma5(this, str, b);
        this.h = ma5Var;
        co3Var.d(ma5Var, 300L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // w39
    public final int b() {
        int i;
        boolean z;
        qa5 qa5Var = this.J;
        long j = qa5Var.I;
        long j2 = qa5Var.H;
        this.H = -1;
        this.s = -1;
        this.x = -1;
        this.w = -1;
        this.y = -1;
        this.E = -1;
        if (this.n) {
            int size = this.d.size();
            zr9 zr9Var = this.f;
            int size2 = zr9Var.d.size();
            int size3 = zr9Var.e.size();
            int i2 = size + size2;
            if (size3 != 0) {
                i2 += size3 + 1;
            }
            this.I = i2;
            return i2;
        }
        if (qa5Var.R) {
            this.x = 0;
            i = 1;
        } else {
            i = 0;
        }
        if (qa5Var.W) {
            int i3 = i + 1;
            this.w = i;
            this.s = i;
            i += 2;
            this.y = i3;
        } else if (qa5Var.X) {
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
        if (qa5Var.S) {
            if (j2 != 0) {
                boolean y = hc2.y(3, qa5Var.getMessagesController().K0(Long.valueOf(j2)));
                this.G = y ? 1 : 0;
                z = y;
            } else if (j != 0) {
                TLRPC.Chat K0 = qa5Var.getMessagesController().K0(Long.valueOf(j));
                ?? r0 = (!hc2.y(3, K0) || hc2.t0(K0)) ? 0 : 2;
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

    @Override // w39
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
        return (i2 >= arrayList.size() || !(arrayList.get(i - this.F) instanceof pa5)) ? 1 : 0;
    }

    @Override // w39
    public final void f() {
        super.f();
        this.J.v0();
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String K;
        int i2 = s49Var.f;
        View view = s49Var.a;
        ArrayList arrayList = this.r;
        qa5 qa5Var = this.J;
        CharSequence charSequence3 = null;
        if (i2 == 0) {
            l35 l35Var = (l35) view;
            if (this.n) {
                l35Var.setText(k96.M0(2131749360, null));
            } else if (i == this.s) {
                l35Var.setText(k96.M0(2131746577, null));
            } else {
                int i3 = i - this.F;
                if (i3 >= 0 && i3 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i - this.F);
                    if (tLObject2 instanceof pa5) {
                        l35Var.setText(((pa5) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i == this.w) {
                l35Var.a((qa5Var.Y == null && qa5Var.a0.i()) ? "" : k96.M0(2131751445, null), new b95(this, (byte) 4));
                return;
            }
            return;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                wgb wgbVar = (wgb) view;
                if (i == this.x) {
                    wgbVar.o(R.drawable.menu_link_create2, k96.M0(2131749293, null), false);
                    wgbVar.g(bkb.u6, bkb.t6);
                    return;
                } else if (this.G == 2) {
                    wgbVar.o(R.drawable.msg_link2, k96.M0(2131752390, null), false);
                    wgbVar.g(bkb.l6, bkb.F6);
                    return;
                } else {
                    wgbVar.o(R.drawable.msg_link2, k96.M0(2131748918, null), false);
                    wgbVar.g(bkb.l6, bkb.F6);
                    return;
                }
            }
            return;
        }
        za5 za5Var = (za5) view;
        if (this.n) {
            int size = this.d.size();
            zr9 zr9Var = this.f;
            ArrayList arrayList2 = zr9Var.e;
            ArrayList arrayList3 = zr9Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i < 0 || i >= size) ? (i < size || i >= size3 + size) ? (i <= size + size3 || i > (size2 + size) + size3) ? null : (TLObject) zr9Var.e.get(((i - size) - size3) - 1) : (TLObject) arrayList3.get(i - size) : (TLObject) this.d.get(i);
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    K = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    K = hc2.K((TLRPC.Chat) tLObject, false);
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
                    String str = zr9Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) K);
                        int y1 = gl.y1(K, str);
                        if (y1 != -1) {
                            int length = str.length();
                            if (y1 == 0) {
                                length++;
                            } else {
                                y1++;
                            }
                            spannableStringBuilder.setSpan(new cm4(bkb.p6, null), y1, length + y1, 33);
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
                za5Var.r = true;
                za5Var.f = "premium";
                za5Var.a.setImageDrawable(za5.b(za5Var.getContext(), false));
                za5Var.b.l(k96.M0(2131746589, null), false);
                jia jiaVar = za5Var.c;
                int i4 = bkb.x6;
                jiaVar.setTag(Integer.valueOf(i4));
                if (za5Var.L) {
                    i4 = bkb.eh;
                }
                zkb.W(jiaVar, i4, za5Var.N);
                jiaVar.setEmojiColor(jiaVar.getTextColor());
                jiaVar.l(k96.M0(2131746587, null), false);
                za5Var.c(qa5Var.Y != null, false);
                return;
            }
            if (i == this.E) {
                za5Var.s = true;
                za5Var.f = "miniapps";
                be0 be0Var = za5Var.a;
                za5Var.getContext();
                be0Var.setImageDrawable(za5.a(false));
                za5Var.b.l(k96.M0(2131746615, null), false);
                jia jiaVar2 = za5Var.c;
                int i5 = bkb.x6;
                jiaVar2.setTag(Integer.valueOf(i5));
                if (za5Var.L) {
                    i5 = bkb.eh;
                }
                zkb.W(jiaVar2, i5, za5Var.N);
                jiaVar2.setEmojiColor(jiaVar2.getTextColor());
                jiaVar2.l(k96.M0(2131746614, null), false);
                za5Var.c(qa5Var.Z != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i - this.F);
            charSequence = null;
        }
        za5Var.d(tLObject, charSequence3, charSequence);
        long j = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j != 0) {
            vf6 vf6Var = qa5Var.K;
            if (vf6Var == null || vf6Var.h(j) < 0) {
                za5Var.c(qa5Var.a0.h(j) >= 0, false);
                za5Var.setCheckBoxEnabled(true);
            } else {
                za5Var.c(true, false);
                za5Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View l35Var;
        Context context = this.c;
        if (i == 0) {
            l35Var = new l35(context, null);
        } else if (i == 1) {
            l35Var = new za5(context, 1, 0, false);
        } else if (i != 3) {
            l35Var = new wgb(context);
        } else {
            na5 na5Var = new na5(context, null, 0, null, (byte) 0);
            na5Var.setLayoutParams(new e49(-1, -1));
            na5Var.e.setVisibility(8);
            na5Var.d.setText(k96.M0(2131748031, null));
            na5Var.setAnimateLayoutChange(true);
            l35Var = na5Var;
        }
        return new y29(l35Var);
    }
}
