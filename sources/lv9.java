// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class lv9 extends c79 {
    public boolean E;
    public int F;
    public int G;
    public ArrayList H;
    public ArrayList I;
    public String J;
    public int K;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public sv9 f;
    public zh6 h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public long y;

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return i == 0 || i == 2 || i == 3;
    }

    public final Object E(int i) {
        int size = this.d.size();
        int size2 = this.I.size();
        sv9 sv9Var = this.f;
        int size3 = sv9Var.e.size();
        ArrayList arrayList = sv9Var.j;
        int size4 = arrayList.size();
        if (i >= 0 && i < size) {
            return this.d.get(i);
        }
        int i2 = i - size;
        if (size2 > 0) {
            if (i2 == 0) {
                return null;
            }
            if (i2 > 0 && i2 <= size2) {
                return this.I.get(i2 - 1);
            }
            i2 -= size2 + 1;
        }
        if (i2 >= 0 && i2 < size4) {
            return arrayList.get(i2);
        }
        int i3 = i2 - size4;
        if (i3 <= 0 || i3 > size3) {
            return null;
        }
        return sv9Var.e.get(i3 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        this.d.clear();
        this.I.clear();
        this.e.clear();
        if (this.r) {
            this.f.g(null, true, false, this.s, this.w, this.y, this.x, 0, 0);
        }
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Timer timer2 = new Timer();
        this.n = timer2;
        timer2.schedule(new iy2(this, str, (byte) 3), 200L, 300L);
    }

    @Override // j79
    public final int b() {
        sv9 sv9Var = this.f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = sv9Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = sv9Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // j79
    public final int d(int i) {
        Object E = E(i);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof iv2 ? 3 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b5  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        long j;
        boolean z;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        int y1;
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                p55 p55Var = (p55) view;
                if (i == this.K) {
                    p55Var.setText(ob6.M0(2131748861, null));
                    return;
                } else if (E(i) == null) {
                    p55Var.setText(ob6.M0(2131749306, null));
                    return;
                } else {
                    p55Var.setText(ob6.M0(2131747010, null));
                    return;
                }
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    iv2 iv2Var = (iv2) E(i);
                    ((bv8) view).C(iv2Var, null, lv2.m(0, iv2Var.i, iv2Var.j), xnb.k(new StringBuilder("+"), (String) iv2Var.g.get(0), f78.f()), false, false);
                    return;
                }
                return;
            }
            String str2 = (String) E(i);
            skb skbVar = (skb) view;
            skbVar.g(-1, aob.o6);
            skbVar.k(ob6.a0(null, null, 2131754445, f78.f().e("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i);
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = lbc.p(user);
                if (str != null && this.J != null && !str.toLowerCase().contains(this.J.toLowerCase()) && user.usernames != null) {
                    for (int i3 = 0; i3 < user.usernames.size(); i3++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i3);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.J.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                j = user.id;
                z = user.self;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = xc2.K(chat, false);
                j = chat.id;
                z = false;
            } else {
                j = 0;
                z = false;
                str = null;
            }
            if (i >= this.d.size()) {
                if (i <= this.d.size() || str == null) {
                    charSequence = null;
                    charSequence2 = null;
                } else {
                    String str3 = this.f.c;
                    if (str3 != null && str3.startsWith("@")) {
                        str3 = str3.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append("@");
                        spannableStringBuilder.append((CharSequence) str);
                        if (str3 != null && (y1 = hl.y1(str, str3)) != -1) {
                            int length = str3.length();
                            if (y1 == 0) {
                                length++;
                            } else {
                                y1++;
                            }
                            spannableStringBuilder.setSpan(new ho4(aob.q6, null), y1, length + y1, 33);
                        }
                        charSequence2 = spannableStringBuilder;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        charSequence = null;
                        charSequence2 = str;
                    }
                }
                bv8 bv8Var = (bv8) view;
                if (z) {
                }
                bv8Var.C(tLObject, null, charSequence, charSequence2, false, z);
                bv8Var.A(this.h.h(j) >= 0, false);
            }
            charSequence = (CharSequence) this.e.get(i);
            if (charSequence == null || str == null || str.length() <= 0 || !charSequence.toString().startsWith("@".concat(str))) {
                charSequence2 = null;
                bv8 bv8Var2 = (bv8) view;
                if (z) {
                    charSequence = ob6.M0(2131745629, null);
                }
                bv8Var2.C(tLObject, null, charSequence, charSequence2, false, z);
                bv8Var2.A(this.h.h(j) >= 0, false);
            }
            charSequence2 = charSequence;
            charSequence = null;
            bv8 bv8Var22 = (bv8) view;
            if (z) {
            }
            bv8Var22.C(tLObject, null, charSequence, charSequence2, false, z);
            bv8Var22.A(this.h.h(j) >= 0, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        bv8 bv8Var;
        View view;
        Context context = this.c;
        if (i == 0) {
            bv8 bv8Var2 = new bv8(context, null);
            bv8Var2.O0 = true;
            bv8Var2.G0 = true;
            bv8Var = bv8Var2;
        } else if (i == 1) {
            p55 p55Var = new p55(26, null, context);
            p55Var.setNoBackground(true);
            bv8Var = p55Var;
        } else {
            if (i != 3) {
                if (i == 4) {
                    view = new t62(context, (byte) 23);
                    view.setId(9);
                    view.setTag(-33024);
                } else if (i != 5) {
                    view = new skb(16, context, false);
                } else {
                    tk4 tk4Var = new tk4(context, null);
                    tk4Var.setIsSingleCell(true);
                    tk4Var.setViewType(29);
                    yob.h(aob.d6, null, tk4Var);
                    bv8Var = tk4Var;
                }
                return new n69(view);
            }
            bv8 bv8Var3 = new bv8(context, null);
            bv8Var3.O0 = true;
            bv8Var3.G0 = true;
            bv8Var = bv8Var3;
        }
        view = bv8Var;
        return new n69(view);
    }
}
