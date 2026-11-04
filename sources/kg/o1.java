package kg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.tz;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class o1 extends sj0 {
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
    public v1 f;
    public a0.h h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public long y;

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 0 || i3 == 2 || i3 == 3;
    }

    public final Object E(int i3) {
        int size = this.d.size();
        int size2 = this.I.size();
        v1 v1Var = this.f;
        int size3 = v1Var.e.size();
        int size4 = v1Var.j.size();
        if (i3 >= 0 && i3 < size) {
            return this.d.get(i3);
        }
        int i10 = i3 - size;
        if (size2 > 0) {
            if (i10 == 0) {
                return null;
            }
            if (i10 > 0 && i10 <= size2) {
                return this.I.get(i10 - 1);
            }
            i10 -= size2 + 1;
        }
        if (i10 >= 0 && i10 < size4) {
            return v1Var.j.get(i10);
        }
        int i11 = i10 - size4;
        if (i11 <= 0 || i11 > size3) {
            return null;
        }
        return v1Var.e.get(i11 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
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
        timer2.schedule(new m1(0, this, str), 200L, 300L);
    }

    @Override // u4.h0
    public final int b() {
        v1 v1Var = this.f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = v1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = v1Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // u4.h0
    public final int d(int i3) {
        Object E = E(i3);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof d5 ? 3 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    @Override // u4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u4.d1 d1Var, int i3) {
        long j10;
        boolean z10;
        String str;
        CharSequence charSequence;
        int A1;
        CharSequence charSequence2;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 == 1) {
                x3 x3Var = (x3) view;
                if (i3 == this.K) {
                    x3Var.setText(bd.M0(2131749115, null));
                    return;
                } else if (E(i3) == null) {
                    x3Var.setText(bd.M0(2131749543, null));
                    return;
                } else {
                    x3Var.setText(bd.M0(2131747291, null));
                    return;
                }
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                d5 d5Var = (d5) E(i3);
                ((f6) view).x(d5Var, null, g5.m(0, d5Var.i, d5Var.j), k5.i(new StringBuilder("+"), (String) d5Var.g.get(0), mf.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i3);
            l8 l8Var = (l8) view;
            l8Var.g(-1, k6.o6);
            l8Var.k(bd.a0(null, null, 2131754452, mf.b.c().b("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i3);
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = l10.n(user);
                if (str != null && this.J != null && !str.toLowerCase().contains(this.J.toLowerCase()) && user.usernames != null) {
                    for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i11);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.J.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                j10 = user.id;
                z10 = user.self;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = t3.K(chat, false);
                j10 = chat.id;
                z10 = false;
            } else {
                j10 = 0;
                z10 = false;
                str = null;
            }
            if (i3 < this.d.size()) {
                charSequence = (CharSequence) this.e.get(i3);
                if (charSequence != null && str != null && str.length() > 0 && charSequence.toString().startsWith("@".concat(str))) {
                    charSequence2 = charSequence;
                    charSequence = null;
                    f6 f6Var = (f6) view;
                    if (z10) {
                        charSequence = bd.M0(2131745911, null);
                    }
                    f6Var.x(tLObject, null, charSequence, charSequence2, false, z10);
                    f6Var.w(this.h.h(j10) >= 0, false);
                }
                str = null;
            } else if (i3 <= this.d.size() || str == null) {
                charSequence = null;
                str = null;
            } else {
                String str3 = this.f.c;
                if (str3 != null && str3.startsWith("@")) {
                    str3 = str3.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) str);
                    if (str3 != null && (A1 = org.telegram.messenger.g0.A1(str, str3)) != -1) {
                        int length = str3.length();
                        if (A1 == 0) {
                            length++;
                        } else {
                            A1++;
                        }
                        spannableStringBuilder.setSpan(new tz(k6.q6, null), A1, length + A1, 33);
                    }
                    str = spannableStringBuilder;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                charSequence = null;
            }
            charSequence2 = str;
            f6 f6Var2 = (f6) view;
            if (z10) {
            }
            f6Var2.x(tLObject, null, charSequence, charSequence2, false, z10);
            f6Var2.w(this.h.h(j10) >= 0, false);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View view;
        Context context = this.c;
        if (i3 == 0) {
            f6 f6Var = new f6(context, null);
            f6Var.N0 = true;
            f6Var.F0 = true;
            view = f6Var;
        } else if (i3 == 1) {
            x3 x3Var = new x3(26, context, null);
            x3Var.setNoBackground(true);
            view = x3Var;
        } else if (i3 == 3) {
            f6 f6Var2 = new f6(context, null);
            f6Var2.N0 = true;
            f6Var2.F0 = true;
            view = f6Var2;
        } else if (i3 == 4) {
            View smVar = new sm(context, 7);
            smVar.setId(9);
            smVar.setTag(-33024);
            view = smVar;
        } else if (i3 != 5) {
            view = new l8(16, context, false);
        } else {
            iz izVar = new iz(context, null);
            izVar.setIsSingleCell(true);
            izVar.setViewType(29);
            r6.i(k6.d6, izVar, null);
            view = izVar;
        }
        return new bj0(view);
    }
}
