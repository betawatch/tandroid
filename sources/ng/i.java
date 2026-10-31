package ng;

import ag.l;
import ag.t0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import k2.u;
import mg.y1;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.tk0;
import qg.k;
import s4.c1;
import s4.o0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i extends hg.c {
    public final p6 d;
    public final Context e;
    public tk0 f;
    public ArrayList n;
    public boolean s;
    public z3 w;
    public final boolean x;
    public boolean y;
    public final HashMap r = new HashMap();
    public boolean D = true;
    public final boolean h = true;

    public i(Context context, p6 p6Var, boolean z10) {
        this.e = context;
        this.x = z10;
        this.d = p6Var;
        l lVar = new l(this, 23);
        hs a02 = hs.a0(d20.s0);
        a02.a.c(new u(25, a02, lVar));
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull M0 = vp.r1(d20.s0).M0(chat.id);
        if (M0 != null && (i10 = M0.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.r;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        ArrayList arrayList = this.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        g(this.n.size() - 1);
    }

    @Override // s4.g0
    public final int b() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.g0
    public final int d(int i10) {
        ArrayList arrayList = this.n;
        if (arrayList == null || i10 < 0) {
            return -1;
        }
        return ((h) arrayList.get(i10)).a;
    }

    @Override // s4.g0
    public final void t(c1 c1Var, int i10) {
        boolean z10;
        int i11;
        ArrayList arrayList = this.n;
        if (arrayList == null || i10 < 0) {
            return;
        }
        h hVar = (h) arrayList.get(i10);
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = 8;
        if (i12 != 3) {
            if (i12 == 6) {
                qg.b bVar = (qg.b) view;
                z10 = i10 < this.n.size() - 1 && (i11 = i10 + 1) < this.n.size() - 1 && ((h) this.n.get(i11)).a != 7;
                bVar.w = hVar.f;
                bVar.f();
                bVar.setDivider(z10);
                bVar.c(hVar.k, false);
                return;
            }
            if (i12 == -1) {
                int i14 = hVar.l;
                if (i14 < 0) {
                    i14 = (int) (i0.q.y * 0.3f);
                }
                view.setLayoutParams(new o0(-1, i14));
                return;
            }
            if (i12 == 7) {
                ((qg.d) view).setLetter(hVar.g);
                return;
            }
            if (i12 == 5) {
                try {
                    ((dw0) view).b.getImageReceiver().P0(false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    p8 p8Var = (p8) view;
                    p8Var.g(t6.v6, t6.u6);
                    p8Var.o(hVar.j, hVar.g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == hVar.q) {
                            return;
                        }
                        i0.E2(hVar.q);
                        frameLayout.addView(hVar.q, b6.c(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            z3 z3Var = (z3) view;
            if (TextUtils.equals(z3Var.getText(), hVar.g)) {
                CharSequence charSequence = hVar.h;
                if (charSequence == null) {
                    charSequence = "";
                }
                z3Var.a(charSequence, hVar.m);
            } else {
                z3Var.setText(k6.p(hVar.g, z3Var.getTextView(), null));
                if (!TextUtils.isEmpty(hVar.h)) {
                    CharSequence charSequence2 = hVar.h;
                    t0 t0Var = hVar.m;
                    y3 y3Var = z3Var.b;
                    y3Var.c(charSequence2, false, true);
                    y3Var.setOnClickListener(t0Var);
                    y3Var.setVisibility(0);
                }
            }
            this.w = z3Var;
            return;
        }
        k kVar = (k) view;
        Drawable drawable = hVar.r;
        if (drawable != null) {
            CharSequence charSequence3 = hVar.g;
            CharSequence charSequence4 = hVar.h;
            kVar.x.setVisibility(8);
            kVar.H = null;
            kVar.I = null;
            g9 g9Var = kVar.c;
            g9Var.setRoundRadius(i0.L(20.0f));
            g9Var.setImageDrawable(drawable);
            og.c cVar = kVar.d;
            cVar.k(charSequence3);
            boolean[] zArr = kVar.s;
            zArr[0] = false;
            kVar.setSubtitle(charSequence4);
            a7.Y(kVar.e, zArr[0] ? t6.n5 : t6.r5, kVar.a);
            ep epVar = kVar.w;
            if (epVar != null) {
                epVar.setAlpha(1.0f);
            }
            cVar.i(null);
        } else {
            TLRPC.User user = hVar.c;
            if (user != null) {
                kVar.setUser(user);
                CharSequence charSequence5 = hVar.h;
                if (charSequence5 != null) {
                    kVar.setSubtitle(charSequence5);
                    a7.Y(kVar.e, t6.r5, this.d);
                }
            } else {
                TLRPC.Chat chat = hVar.e;
                if (chat != null) {
                    kVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = hVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            kVar.setUser(d20.i(d20.s0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            kVar.setUser(vp.r1(d20.s0).Z1(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat L0 = vp.r1(d20.s0).L0(Long.valueOf(inputPeer.chat_id));
                            kVar.h(F(L0), L0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat L02 = vp.r1(d20.s0).L0(Long.valueOf(inputPeer.channel_id));
                            kVar.h(F(L02), L02);
                        }
                    }
                }
            }
        }
        kVar.c(hVar.k, false);
        kVar.i(false, 1.0f);
        int i15 = i10 + 1;
        kVar.setDivider(i15 >= this.n.size() || ((h) this.n.get(i15)).a == i12);
        if (i15 < this.n.size() && ((h) this.n.get(i15)).a == 7) {
            kVar.setDivider(false);
        }
        kVar.setOptions(hVar.n);
        y1 y1Var = hVar.o;
        y1 y1Var2 = hVar.p;
        ImageView imageView = kVar.F;
        ImageView imageView2 = kVar.D;
        boolean z11 = y1Var != null;
        kVar.y = z11;
        imageView2.setVisibility((z11 && kVar.G) ? 0 : 8);
        imageView2.setOnClickListener(y1Var);
        z10 = y1Var2 != null;
        kVar.E = z10;
        if (z10 && kVar.G) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(y1Var2);
        kVar.g(this.D, false);
    }

    @Override // s4.g0
    public final c1 w(ViewGroup viewGroup, int i10) {
        View kVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            kVar = view;
        } else if (i10 == 3) {
            kVar = new k(this.e, this.x, this.y, this.d, this.s);
        } else {
            p6 p6Var = this.d;
            if (i10 == 5) {
                dw0 dw0Var = new dw0(context, null, 1, p6Var);
                dw0Var.d.setText(cd.L0(2131748183, null));
                dw0Var.e.setText(cd.L0(2131745824, null));
                dw0Var.a.setTranslationY(i0.L(24.0f));
                kVar = dw0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    qg.d dVar = new qg.d(context, p6Var);
                    dVar.setTag(-33024);
                    kVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        kVar = dVar;
                    }
                } else if (i10 == 6) {
                    qg.b bVar = new qg.b(context, p6Var);
                    bVar.setTag(-33024);
                    kVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        kVar = bVar;
                    }
                } else if (i10 == 8) {
                    z3 z3Var = new z3(context, p6Var);
                    z3Var.setTag(-33024);
                    kVar = z3Var;
                    if (z10) {
                        z3Var.setBackground(null);
                        kVar = z3Var;
                    }
                } else if (i10 == 9) {
                    p8 p8Var = new p8(context, p6Var);
                    p8Var.n = 16;
                    p8Var.x = 19;
                    kVar = p8Var;
                } else {
                    kVar = i10 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new ck0(kVar);
    }

    @Override // s4.g0
    public final void y(c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof k) {
            ((k) view).g(this.D, false);
        }
    }
}
