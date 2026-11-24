// default package

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class b95 extends q59 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final /* synthetic */ g95 N;
    public final LaunchActivity c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public b95(g95 g95Var, LaunchActivity launchActivity) {
        this.N = g95Var;
        this.c = launchActivity;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return (i == 3 || i == 4 || i == 5 || i == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        g95 g95Var = this.N;
        ArrayList arrayList = g95Var.j2;
        qd2 qd2Var = g95Var.T2;
        if (qd2Var == null || qd2Var.k() || g95Var.l2) {
            return;
        }
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.G = 0;
        this.M = g95Var.T2.d.h(k47.B1(g95Var.u2)) >= 0;
        if (g95Var.g1()) {
            int i = this.G;
            this.G = i + 1;
            this.L = i;
        }
        int i2 = this.G;
        this.H = i2;
        int size = arrayList.size() + i2;
        this.G = size;
        this.I = size;
        if (arrayList.size() > 0) {
            int i3 = this.G;
            this.G = i3 + 1;
            this.J = i3;
        }
        if (!arrayList.isEmpty() && g95Var.G0() && g95Var.T2.b.participants_count > oc7.r1(g95Var.n1.a).l4.M0.f()) {
            int i4 = this.G;
            this.G = i4 + 1;
            this.K = i4;
        }
        int i5 = this.G;
        this.d = i5;
        int size2 = g95Var.T2.g.size() + i5;
        this.G = size2;
        this.e = size2;
        if (g95Var.T2.j.isEmpty()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i6 = this.G;
            this.f = i6;
            int size3 = g95Var.T2.j.size() + i6;
            this.G = size3;
            this.h = size3;
        }
        if (g95Var.T2.m.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i7 = this.G;
            this.n = i7;
            int size4 = g95Var.T2.m.size() + i7;
            this.G = size4;
            this.r = size4;
        }
        if (g95Var.T2.l.isEmpty()) {
            this.s = -1;
            this.w = -1;
        } else {
            int i8 = this.G;
            this.s = i8;
            int size5 = g95Var.T2.l.size() + i8;
            this.G = size5;
            this.w = size5;
        }
        if (g95Var.g1()) {
            int i9 = this.G;
            this.y = i9;
            this.G = i9 + 2;
            this.E = i9 + 1;
        } else if (((!sd2.T(g95Var.S2) || ((chat2 = g95Var.S2) != null && chat2.megagroup)) && sd2.B(g95Var.S2)) || (sd2.T(g95Var.S2) && (chat = g95Var.S2) != null && !chat.megagroup && sd2.t0(chat))) {
            int i10 = this.G;
            this.G = i10 + 1;
            this.x = i10;
        }
        int i11 = this.G;
        this.G = i11 + 1;
        this.F = i11;
    }

    @Override // y59
    public final int b() {
        return this.G;
    }

    @Override // y59
    public final int d(int i) {
        if (i == this.F) {
            return 3;
        }
        if (i == this.x || i == this.y || i == this.E) {
            return 0;
        }
        if (i == this.J) {
            return 5;
        }
        if (i >= this.d && i < this.e) {
            return 1;
        }
        if (i >= this.H && i < this.I) {
            return 4;
        }
        if (i == this.K) {
            return 6;
        }
        return i == this.L ? 7 : 2;
    }

    @Override // y59
    public final void f() {
        E();
        super.f();
    }

    @Override // y59
    public final void g(int i) {
        E();
        super.g(i);
    }

    @Override // y59
    public final void j(int i, int i2) {
        E();
        super.j(i, i2);
    }

    @Override // y59
    public final void l(int i, int i2) {
        E();
        super.l(i, i2);
    }

    @Override // y59
    public final void n(int i, int i2, Object obj) {
        E();
        super.n(i, i2, obj);
    }

    @Override // y59
    public final void p(int i, int i2) {
        E();
        super.p(i, i2);
    }

    @Override // y59
    public final void q(int i, int i2) {
        E();
        super.q(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        TLRPC.Chat chat;
        TLRPC.GroupCallParticipant groupCallParticipant;
        r85 r85Var;
        Long l;
        boolean z;
        boolean z2;
        boolean z3;
        rd2 rd2Var;
        r85 r85Var2;
        g95 g95Var = this.N;
        ArrayList arrayList = g95Var.x2;
        ArrayList arrayList2 = g95Var.z2;
        ArrayList arrayList3 = g95Var.j2;
        ArrayList arrayList4 = g95Var.y2;
        int i2 = u69Var.f;
        View view = u69Var.a;
        TLRPC.FileLocation fileLocation = null;
        if (i2 == 0) {
            qb5 qb5Var = (qb5) view;
            if (i == this.y) {
                int v0 = cmb.v0(cmb.u6, g95Var.J0);
                qb5Var.a(v0, v0);
                qb5Var.b(R.drawable.msg_contact_add, jb6.M0(2131743109, null), true);
                return;
            } else {
                if (i == this.E) {
                    int v02 = cmb.v0(cmb.u6, g95Var.J0);
                    qb5Var.a(v02, v02);
                    qb5Var.b(R.drawable.msg_link2, jb6.M0(2131743104, null), false);
                    return;
                }
                int R0 = gm.R0(g95Var.H1.getTag() != null ? 1.0f : 0.0f, 1.0f, cmb.w0(null, cmb.bh, false), cmb.w0(null, cmb.eh, false));
                qb5Var.a(R0, R0);
                if (!sd2.T(g95Var.S2) || (chat = g95Var.S2) == null || chat.megagroup || !sd2.t0(chat)) {
                    qb5Var.b(R.drawable.msg_contact_add, jb6.M0(2131743057, null), false);
                    return;
                } else {
                    qb5Var.b(R.drawable.msg_link, jb6.M0(2131743020, null), false);
                    return;
                }
            }
        }
        if (i2 == 1) {
            wb5 wb5Var = (wb5) view;
            int i3 = i - this.d;
            if (g95Var.l2) {
                if (i3 >= 0 && i3 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                }
                groupCallParticipant = null;
            } else {
                if (i3 >= 0 && i3 < g95Var.T2.g.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) g95Var.T2.g.get(i3);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long B1 = k47.B1(groupCallParticipant.peer);
                long B12 = k47.B1(g95Var.u2);
                if (B1 == B12 && (r85Var = g95Var.b4) != null) {
                    fileLocation = r85Var.c;
                }
                float f = fileLocation != null ? g95Var.b4.a : 1.0f;
                boolean z4 = wb5Var.getParticipant() != null && k47.B1(wb5Var.getParticipant().peer) == B1;
                wb5Var.e(g95Var.n1, groupCallParticipant, g95Var.T2, B12, fileLocation, z4);
                sb5 sb5Var = wb5Var.y;
                sb5Var.setProgress(f);
                if (f < 1.0f) {
                    gm.T3(sb5Var, true, 1.0f, true, z4);
                    return;
                } else {
                    gm.T3(sb5Var, false, 1.0f, true, z4);
                    return;
                }
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 4) {
                n95 n95Var = (n95) view;
                rd2 participant = n95Var.getParticipant();
                int i4 = i - this.H;
                n95Var.a = g95Var.m1.i(i);
                if (g95Var.l2) {
                    if (i4 >= 0 && i4 < arrayList4.size()) {
                        rd2Var = (rd2) arrayList4.get(i4);
                    }
                    rd2Var = null;
                } else {
                    if (i4 >= 0 && i4 < arrayList3.size()) {
                        rd2Var = (rd2) arrayList3.get(i4);
                    }
                    rd2Var = null;
                }
                if (rd2Var != null) {
                    if (k47.B1(rd2Var.a.peer) == k47.B1(g95Var.u2) && (r85Var2 = g95Var.b4) != null) {
                        fileLocation = r85Var2.c;
                    }
                    if (fileLocation != null) {
                        float f2 = g95Var.b4.a;
                    }
                    if (n95Var.getParticipant() != null) {
                        n95Var.getParticipant().equals(rd2Var);
                    }
                    n95Var.d = rd2Var;
                }
                if (participant == null || participant.equals(rd2Var) || !n95Var.e || n95Var.getRenderer() == null) {
                    return;
                }
                g95Var.E0(n95Var, false);
                g95Var.E0(n95Var, true);
                return;
            }
            return;
        }
        o95 o95Var = (o95) view;
        int i5 = i - this.f;
        int i6 = i - this.n;
        if (i6 < 0 || i6 >= g95Var.T2.m.size()) {
            int i7 = i - this.s;
            if (i7 < 0 || i7 >= g95Var.T2.l.size()) {
                if (g95Var.l2) {
                    if (i5 >= 0 && i5 < arrayList2.size()) {
                        l = (Long) arrayList2.get(i5);
                        z2 = false;
                        z3 = false;
                    }
                } else if (i5 >= 0 && i5 < g95Var.T2.j.size()) {
                    l = (Long) g95Var.T2.j.get(i5);
                    pd2 pd2Var = (pd2) g95Var.T2.k.get(l);
                    z = pd2Var != null && pd2Var.a();
                    z2 = false;
                    z3 = false;
                }
                z2 = false;
                z3 = false;
                z = false;
                l = null;
            } else {
                l = (Long) g95Var.T2.l.get(i - this.s);
                z3 = true;
                z2 = false;
                z = false;
            }
            if (l == null) {
                int i8 = g95Var.a;
                lka lkaVar = o95Var.c;
                lka lkaVar2 = o95Var.b;
                bf0 bf0Var = o95Var.a;
                TLRPC.User W1 = oc7.r1(i8).W1(l);
                o95Var.f = W1;
                pc0 pc0Var = o95Var.e;
                if (W1 == null) {
                    pc0Var.f(21);
                } else {
                    pc0Var.q(W1);
                }
                lkaVar2.l(m9c.r(o95Var.f), false);
                bf0Var.getImageReceiver().d = i8;
                bf0Var.f(o95Var.f, pc0Var);
                lkaVar.l(jb6.M0(z3 ? 2131745197 : z2 ? 2131745198 : z ? 2131751761 : 2131748862, null), false);
                float f3 = 0.5f;
                bf0Var.setAlpha((z2 || z3) ? 0.5f : 1.0f);
                lkaVar2.setAlpha((z2 || z3) ? 0.5f : 1.0f);
                if (!z2 && !z3) {
                    f3 = 1.0f;
                }
                lkaVar.setAlpha(f3);
                ImageView imageView = o95Var.d;
                if (!z2 && !z3) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l = (Long) g95Var.T2.m.get(i - this.n);
        z2 = true;
        z3 = false;
        z = z3;
        if (l == null) {
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        LaunchActivity launchActivity = this.c;
        if (i != 0) {
            if (i == 1) {
                view2 = new y85(this, launchActivity);
            } else if (i == 2) {
                z85 z85Var = new z85(launchActivity);
                z85Var.n = cmb.hh;
                Paint paint = new Paint();
                z85Var.h = paint;
                paint.setColor(cmb.w0(null, cmb.Wg, false));
                z85Var.e = new pc0((ylb) null);
                bf0 bf0Var = new bf0(launchActivity);
                z85Var.a = bf0Var;
                bf0Var.setRoundRadius(gm.L(24.0f));
                boolean z = jb6.a0;
                z85Var.addView(bf0Var, qoe.d(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
                lka lkaVar = new lka(launchActivity);
                z85Var.b = lkaVar;
                anb.W(lkaVar, cmb.dh, null);
                lkaVar.setTypeface(gm.o());
                lkaVar.setTextSize(16);
                lkaVar.setGravity((jb6.a0 ? 5 : 3) | 48);
                boolean z2 = jb6.a0;
                z85Var.addView(lkaVar, qoe.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 54.0f : 67.0f, 10.0f, z2 ? 67.0f : 54.0f, 0.0f));
                lka lkaVar2 = new lka(launchActivity);
                z85Var.c = lkaVar2;
                lkaVar2.setTextSize(15);
                lkaVar2.setGravity((jb6.a0 ? 5 : 3) | 48);
                lkaVar2.setTextColor(cmb.w0(null, z85Var.n, false));
                lkaVar2.l(jb6.M0(2131748862, null), false);
                boolean z3 = jb6.a0;
                z85Var.addView(lkaVar2, qoe.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 32.0f, z3 ? 67.0f : 54.0f, 0.0f));
                ImageView imageView = new ImageView(launchActivity);
                z85Var.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.msg_invited);
                imageView.setImportantForAccessibility(2);
                imageView.setPadding(0, 0, gm.L(4.0f), 0);
                imageView.setColorFilter(new PorterDuffColorFilter(cmb.w0(null, z85Var.n, false), PorterDuff.Mode.MULTIPLY));
                z85Var.addView(imageView, qoe.d(48, -1.0f, (jb6.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                z85Var.setWillNotDraw(false);
                z85Var.setFocusable(true);
                view = z85Var;
            } else if (i == 4) {
                view2 = new a95(this, launchActivity);
            } else if (i != 5) {
                g95 g95Var = this.N;
                if (i == 6) {
                    TextView textView = new TextView(launchActivity);
                    textView.setTextColor(-8682615);
                    textView.setTextSize(1, 13.0f);
                    textView.setGravity(1);
                    textView.setPadding(0, 0, 0, gm.L(10.0f));
                    boolean W = sd2.W(g95Var.S2);
                    j5 j5Var = g95Var.n1;
                    if (W) {
                        textView.setText(jb6.a0(null, null, 2131743133, jb6.G(oc7.r1(j5Var.a).l4.M0.f(), "Participants", new Object[0])));
                        view2 = textView;
                    } else {
                        textView.setText(jb6.a0(null, null, 2131742909, jb6.G(oc7.r1(j5Var.a).l4.M0.f(), "Members", new Object[0])));
                        view2 = textView;
                    }
                } else if (i != 7) {
                    view = new View(launchActivity);
                } else {
                    if (g95Var.i2 == null) {
                        g95Var.i2 = new pd();
                    }
                    view2 = new sb(launchActivity, g95Var.i2);
                }
            } else {
                view = new o72(launchActivity, (byte) 9);
            }
            view = view2;
        } else {
            x85 x85Var = new x85(launchActivity);
            x85Var.h = 67;
            x85Var.n = (byte) 18;
            Paint paint2 = new Paint();
            x85Var.r = paint2;
            paint2.setColor(cmb.w0(null, cmb.Wg, false));
            x85Var.e = (byte) 23;
            lka lkaVar3 = new lka(launchActivity);
            x85Var.a = lkaVar3;
            anb.W(lkaVar3, cmb.F6, null);
            lkaVar3.setTextSize(16);
            lkaVar3.setGravity(jb6.a0 ? 5 : 3);
            lkaVar3.setImportantForAccessibility(2);
            x85Var.addView(lkaVar3);
            lka lkaVar4 = new lka(launchActivity);
            x85Var.b = lkaVar4;
            anb.W(lkaVar4, cmb.H6, null);
            lkaVar4.setTextSize(16);
            lkaVar4.setGravity(jb6.a0 ? 3 : 5);
            lkaVar4.setImportantForAccessibility(2);
            x85Var.addView(lkaVar4);
            ImageView imageView2 = new ImageView(launchActivity);
            x85Var.c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            anb.s(imageView2, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
            x85Var.addView(imageView2);
            ImageView imageView3 = new ImageView(launchActivity);
            x85Var.d = imageView3;
            imageView3.setScaleType(scaleType);
            x85Var.addView(imageView3);
            x85Var.setFocusable(true);
            view = x85Var;
        }
        return kt6.h(view, view, -1, -2);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        a85 a85Var = this.N.H1;
        int i = u69Var.f;
        View view = u69Var.a;
        if (i == 1) {
            wb5 wb5Var = (wb5) view;
            int i2 = a85Var.getTag() != null ? cmb.hh : cmb.ch;
            wb5Var.f(i2, cmb.w0(null, i2, false));
            wb5Var.setDrawDivider(u69Var.b() != this.G - 2);
            return;
        }
        if (i == 2) {
            o95 o95Var = (o95) view;
            int i3 = a85Var.getTag() != null ? cmb.hh : cmb.ch;
            o95Var.a(i3, cmb.w0(null, i3, false));
            o95Var.setDrawDivider(u69Var.b() != this.G - 2);
        }
    }
}
