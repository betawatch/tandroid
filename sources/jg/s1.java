package jg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.d5;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.g6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.xz;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class s1 extends oj0 {
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public z1 f;
    public a0.h h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public long y;

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 0 || i7 == 2 || i7 == 3;
    }

    public final Object E(int i7) {
        int size = this.d.size();
        int size2 = this.H.size();
        z1 z1Var = this.f;
        int size3 = z1Var.e.size();
        int size4 = z1Var.j.size();
        if (i7 >= 0 && i7 < size) {
            return this.d.get(i7);
        }
        int i10 = i7 - size;
        if (size2 > 0) {
            if (i10 == 0) {
                return null;
            }
            if (i10 > 0 && i10 <= size2) {
                return this.H.get(i10 - 1);
            }
            i10 -= size2 + 1;
        }
        if (i10 >= 0 && i10 < size4) {
            return z1Var.j.get(i10);
        }
        int i11 = i10 - size4;
        if (i11 <= 0 || i11 > size3) {
            return null;
        }
        return z1Var.e.get(i11 - 1);
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
        this.H.clear();
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
        timer2.schedule(new q1(0, this, str), 200L, 300L);
    }

    @Override // v4.g0
    public final int b() {
        z1 z1Var = this.f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = z1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = z1Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // v4.g0
    public final int d(int i7) {
        Object E = E(i7);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof d5 ? 3 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    @Override // v4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.d1 d1Var, int i7) {
        long j3;
        boolean z9;
        String str;
        CharSequence charSequence;
        int A1;
        CharSequence charSequence2;
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 == 1) {
                x3 x3Var = (x3) view;
                if (i7 == this.J) {
                    x3Var.setText(id.M0(2131749107, null));
                    return;
                } else if (E(i7) == null) {
                    x3Var.setText(id.M0(2131749535, null));
                    return;
                } else {
                    x3Var.setText(id.M0(2131747283, null));
                    return;
                }
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                d5 d5Var = (d5) E(i7);
                ((g6) view).x(d5Var, null, g5.m(0, d5Var.i, d5Var.j), k5.i(new StringBuilder("+"), (String) d5Var.g.get(0), pf.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i7);
            m8 m8Var = (m8) view;
            m8Var.g(-1, m6.o6);
            m8Var.k(id.a0(null, null, 2131754452, pf.b.c().b("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i7);
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = t10.n(user);
                if (str != null && this.I != null && !str.toLowerCase().contains(this.I.toLowerCase()) && user.usernames != null) {
                    for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i11);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.I.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                j3 = user.id;
                z9 = user.self;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = t3.K(chat, false);
                j3 = chat.id;
                z9 = false;
            } else {
                j3 = 0;
                z9 = false;
                str = null;
            }
            if (i7 < this.d.size()) {
                charSequence = (CharSequence) this.e.get(i7);
                if (charSequence != null && str != null && str.length() > 0 && charSequence.toString().startsWith("@".concat(str))) {
                    charSequence2 = charSequence;
                    charSequence = null;
                    g6 g6Var = (g6) view;
                    if (z9) {
                        charSequence = id.M0(2131745901, null);
                    }
                    g6Var.x(tLObject, null, charSequence, charSequence2, false, z9);
                    g6Var.w(this.h.h(j3) >= 0, false);
                }
                str = null;
            } else if (i7 <= this.d.size() || str == null) {
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
                        spannableStringBuilder.setSpan(new xz(m6.q6, null), A1, length + A1, 33);
                    }
                    str = spannableStringBuilder;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                charSequence = null;
            }
            charSequence2 = str;
            g6 g6Var2 = (g6) view;
            if (z9) {
            }
            g6Var2.x(tLObject, null, charSequence, charSequence2, false, z9);
            g6Var2.w(this.h.h(j3) >= 0, false);
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = this.c;
        if (i7 == 0) {
            g6 g6Var = new g6(context, null);
            g6Var.M0 = true;
            g6Var.E0 = true;
            view = g6Var;
        } else if (i7 == 1) {
            x3 x3Var = new x3(26, context, null);
            x3Var.setNoBackground(true);
            view = x3Var;
        } else if (i7 == 3) {
            g6 g6Var2 = new g6(context, null);
            g6Var2.M0 = true;
            g6Var2.E0 = true;
            view = g6Var2;
        } else if (i7 == 4) {
            View smVar = new sm(context, 6);
            smVar.setId(9);
            smVar.setTag(-33024);
            view = smVar;
        } else if (i7 != 5) {
            view = new m8(16, context, false);
        } else {
            lz lzVar = new lz(context, null);
            lzVar.setIsSingleCell(true);
            lzVar.setViewType(29);
            t6.h(m6.d6, lzVar, null);
            view = lzVar;
        }
        return new xi0(view);
    }
}
