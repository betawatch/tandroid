package jg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.a8;
import org.telegram.messenger.f5;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.n10;
import org.telegram.messenger.o10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.i00;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.wz;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class s1 extends bk0 {
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
    public z1 f;
    public a0.h h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public long y;

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 0 || i7 == 2 || i7 == 3;
    }

    public final Object E(int i7) {
        int size = this.d.size();
        int size2 = this.I.size();
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
                return this.I.get(i10 - 1);
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
        timer2.schedule(new q1(0, this, str), 200L, 300L);
    }

    @Override // v4.i0
    public final int b() {
        z1 z1Var = this.f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = z1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = z1Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // v4.i0
    public final int d(int i7) {
        Object E = E(i7);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof f5 ? 3 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        long j3;
        boolean z10;
        String str;
        CharSequence charSequence;
        int A1;
        CharSequence charSequence2;
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 != 0) {
            if (i10 == 1) {
                y3 y3Var = (y3) view;
                if (i7 == this.K) {
                    y3Var.setText(gd.M0(2131748915, null));
                    return;
                } else if (E(i7) == null) {
                    y3Var.setText(gd.M0(2131749360, null));
                    return;
                } else {
                    y3Var.setText(gd.M0(2131747090, null));
                    return;
                }
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                f5 f5Var = (f5) E(i7);
                ((h6) view).x(f5Var, null, i5.m(0, f5Var.i, f5Var.j), n10.h(new StringBuilder("+"), (String) f5Var.g.get(0), pf.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i7);
            n8 n8Var = (n8) view;
            n8Var.g(-1, n6.o6);
            n8Var.k(gd.a0(null, null, 2131754450, pf.b.c().b("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i7);
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = o10.o(user);
                if (str != null && this.J != null && !str.toLowerCase().contains(this.J.toLowerCase()) && user.usernames != null) {
                    for (int i11 = 0; i11 < user.usernames.size(); i11++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i11);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.J.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                j3 = user.id;
                z10 = user.self;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = v3.K(chat, false);
                j3 = chat.id;
                z10 = false;
            } else {
                j3 = 0;
                z10 = false;
                str = null;
            }
            if (i7 < this.d.size()) {
                charSequence = (CharSequence) this.e.get(i7);
                if (charSequence != null && str != null && str.length() > 0 && charSequence.toString().startsWith("@".concat(str))) {
                    charSequence2 = charSequence;
                    charSequence = null;
                    h6 h6Var = (h6) view;
                    if (z10) {
                        charSequence = gd.M0(2131745706, null);
                    }
                    h6Var.x(tLObject, null, charSequence, charSequence2, false, z10);
                    h6Var.w(this.h.h(j3) >= 0, false);
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
                        spannableStringBuilder.setSpan(new i00(n6.q6, null), A1, length + A1, 33);
                    }
                    str = spannableStringBuilder;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                charSequence = null;
            }
            charSequence2 = str;
            h6 h6Var2 = (h6) view;
            if (z10) {
            }
            h6Var2.x(tLObject, null, charSequence, charSequence2, false, z10);
            h6Var2.w(this.h.h(j3) >= 0, false);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        Context context = this.c;
        if (i7 == 0) {
            h6 h6Var = new h6(context, null);
            h6Var.N0 = true;
            h6Var.F0 = true;
            view = h6Var;
        } else if (i7 == 1) {
            y3 y3Var = new y3(26, context, null);
            y3Var.setNoBackground(true);
            view = y3Var;
        } else if (i7 == 3) {
            h6 h6Var2 = new h6(context, null);
            h6Var2.N0 = true;
            h6Var2.F0 = true;
            view = h6Var2;
        } else if (i7 == 4) {
            View jnVar = new jn(context, 5);
            jnVar.setId(9);
            jnVar.setTag(-33024);
            view = jnVar;
        } else if (i7 != 5) {
            view = new n8(16, context, false);
        } else {
            wz wzVar = new wz(context, null);
            wzVar.setIsSingleCell(true);
            wzVar.setViewType(29);
            u6.h(n6.d6, wzVar, null);
            view = wzVar;
        }
        return new kj0(view);
    }
}
