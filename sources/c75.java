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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c75 extends n39 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final /* synthetic */ h75 N;
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

    public c75(h75 h75Var, LaunchActivity launchActivity) {
        this.N = h75Var;
        this.c = launchActivity;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return (i == 3 || i == 4 || i == 5 || i == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        h75 h75Var = this.N;
        ArrayList arrayList = h75Var.j2;
        fc2 fc2Var = h75Var.T2;
        if (fc2Var == null || fc2Var.k() || h75Var.l2) {
            return;
        }
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.G = 0;
        this.M = h75Var.T2.d.h(k27.B1(h75Var.u2)) >= 0;
        if (h75Var.g1()) {
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
        if (!arrayList.isEmpty() && h75Var.G0() && h75Var.T2.b.participants_count > na7.q1(h75Var.n1.a).k4.M0.f()) {
            int i4 = this.G;
            this.G = i4 + 1;
            this.K = i4;
        }
        int i5 = this.G;
        this.d = i5;
        int size2 = h75Var.T2.g.size() + i5;
        this.G = size2;
        this.e = size2;
        if (h75Var.T2.j.isEmpty()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i6 = this.G;
            this.f = i6;
            int size3 = h75Var.T2.j.size() + i6;
            this.G = size3;
            this.h = size3;
        }
        if (h75Var.T2.m.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i7 = this.G;
            this.n = i7;
            int size4 = h75Var.T2.m.size() + i7;
            this.G = size4;
            this.r = size4;
        }
        if (h75Var.T2.l.isEmpty()) {
            this.s = -1;
            this.w = -1;
        } else {
            int i8 = this.G;
            this.s = i8;
            int size5 = h75Var.T2.l.size() + i8;
            this.G = size5;
            this.w = size5;
        }
        if (h75Var.g1()) {
            int i9 = this.G;
            this.y = i9;
            this.G = i9 + 2;
            this.E = i9 + 1;
        } else if (((!hc2.T(h75Var.S2) || ((chat2 = h75Var.S2) != null && chat2.megagroup)) && hc2.B(h75Var.S2)) || (hc2.T(h75Var.S2) && (chat = h75Var.S2) != null && !chat.megagroup && hc2.t0(chat))) {
            int i10 = this.G;
            this.G = i10 + 1;
            this.x = i10;
        }
        int i11 = this.G;
        this.G = i11 + 1;
        this.F = i11;
    }

    @Override // w39
    public final int b() {
        return this.G;
    }

    @Override // w39
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

    @Override // w39
    public final void f() {
        E();
        super.f();
    }

    @Override // w39
    public final void g(int i) {
        E();
        super.g(i);
    }

    @Override // w39
    public final void j(int i, int i2) {
        E();
        super.j(i, i2);
    }

    @Override // w39
    public final void l(int i, int i2) {
        E();
        super.l(i, i2);
    }

    @Override // w39
    public final void n(int i, int i2, Object obj) {
        E();
        super.n(i, i2, obj);
    }

    @Override // w39
    public final void p(int i, int i2) {
        E();
        super.p(i, i2);
    }

    @Override // w39
    public final void q(int i, int i2) {
        E();
        super.q(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        TLRPC.Chat chat;
        TLRPC.GroupCallParticipant groupCallParticipant;
        t65 t65Var;
        Long l;
        boolean z;
        boolean z2;
        boolean z3;
        gc2 gc2Var;
        t65 t65Var2;
        h75 h75Var = this.N;
        ArrayList arrayList = h75Var.x2;
        ArrayList arrayList2 = h75Var.z2;
        ArrayList arrayList3 = h75Var.j2;
        ArrayList arrayList4 = h75Var.y2;
        int i2 = s49Var.f;
        View view = s49Var.a;
        TLRPC.FileLocation fileLocation = null;
        if (i2 == 0) {
            s95 s95Var = (s95) view;
            if (i == this.y) {
                int v0 = bkb.v0(bkb.u6, h75Var.J0);
                s95Var.a(v0, v0);
                s95Var.b(R.drawable.msg_contact_add, k96.M0(2131743183, null), true);
                return;
            } else {
                if (i == this.E) {
                    int v02 = bkb.v0(bkb.u6, h75Var.J0);
                    s95Var.a(v02, v02);
                    s95Var.b(R.drawable.msg_link2, k96.M0(2131743178, null), false);
                    return;
                }
                int R0 = gl.R0(h75Var.H1.getTag() != null ? 1.0f : 0.0f, 1.0f, bkb.w0(null, bkb.bh, false), bkb.w0(null, bkb.eh, false));
                s95Var.a(R0, R0);
                if (!hc2.T(h75Var.S2) || (chat = h75Var.S2) == null || chat.megagroup || !hc2.t0(chat)) {
                    s95Var.b(R.drawable.msg_contact_add, k96.M0(2131743131, null), false);
                    return;
                } else {
                    s95Var.b(R.drawable.msg_link, k96.M0(2131743094, null), false);
                    return;
                }
            }
        }
        if (i2 == 1) {
            y95 y95Var = (y95) view;
            int i3 = i - this.d;
            if (h75Var.l2) {
                if (i3 >= 0 && i3 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                }
                groupCallParticipant = null;
            } else {
                if (i3 >= 0 && i3 < h75Var.T2.g.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) h75Var.T2.g.get(i3);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long B1 = k27.B1(groupCallParticipant.peer);
                long B12 = k27.B1(h75Var.u2);
                if (B1 == B12 && (t65Var = h75Var.b4) != null) {
                    fileLocation = t65Var.c;
                }
                float f = fileLocation != null ? h75Var.b4.a : 1.0f;
                boolean z4 = y95Var.getParticipant() != null && k27.B1(y95Var.getParticipant().peer) == B1;
                y95Var.e(h75Var.n1, groupCallParticipant, h75Var.T2, B12, fileLocation, z4);
                u95 u95Var = y95Var.y;
                u95Var.setProgress(f);
                if (f < 1.0f) {
                    gl.U3(u95Var, true, 1.0f, true, z4);
                    return;
                } else {
                    gl.U3(u95Var, false, 1.0f, true, z4);
                    return;
                }
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 4) {
                o75 o75Var = (o75) view;
                gc2 participant = o75Var.getParticipant();
                int i4 = i - this.H;
                o75Var.a = h75Var.m1.i(i);
                if (h75Var.l2) {
                    if (i4 >= 0 && i4 < arrayList4.size()) {
                        gc2Var = (gc2) arrayList4.get(i4);
                    }
                    gc2Var = null;
                } else {
                    if (i4 >= 0 && i4 < arrayList3.size()) {
                        gc2Var = (gc2) arrayList3.get(i4);
                    }
                    gc2Var = null;
                }
                if (gc2Var != null) {
                    if (k27.B1(gc2Var.a.peer) == k27.B1(h75Var.u2) && (t65Var2 = h75Var.b4) != null) {
                        fileLocation = t65Var2.c;
                    }
                    if (fileLocation != null) {
                        float f2 = h75Var.b4.a;
                    }
                    if (o75Var.getParticipant() != null) {
                        o75Var.getParticipant().equals(gc2Var);
                    }
                    o75Var.d = gc2Var;
                }
                if (participant == null || participant.equals(gc2Var) || !o75Var.e || o75Var.getRenderer() == null) {
                    return;
                }
                h75Var.E0(o75Var, false);
                h75Var.E0(o75Var, true);
                return;
            }
            return;
        }
        p75 p75Var = (p75) view;
        int i5 = i - this.f;
        int i6 = i - this.n;
        if (i6 < 0 || i6 >= h75Var.T2.m.size()) {
            int i7 = i - this.s;
            if (i7 < 0 || i7 >= h75Var.T2.l.size()) {
                if (h75Var.l2) {
                    if (i5 >= 0 && i5 < arrayList2.size()) {
                        l = (Long) arrayList2.get(i5);
                        z2 = false;
                        z3 = false;
                    }
                } else if (i5 >= 0 && i5 < h75Var.T2.j.size()) {
                    l = (Long) h75Var.T2.j.get(i5);
                    ec2 ec2Var = (ec2) h75Var.T2.k.get(l);
                    z = ec2Var != null && ec2Var.a();
                    z2 = false;
                    z3 = false;
                }
                z2 = false;
                z3 = false;
                z = false;
                l = null;
            } else {
                l = (Long) h75Var.T2.l.get(i - this.s);
                z3 = true;
                z2 = false;
                z = false;
            }
            if (l == null) {
                int i8 = h75Var.a;
                jia jiaVar = p75Var.c;
                jia jiaVar2 = p75Var.b;
                be0 be0Var = p75Var.a;
                TLRPC.User V1 = na7.q1(i8).V1(l);
                p75Var.f = V1;
                pb0 pb0Var = p75Var.e;
                if (V1 == null) {
                    pb0Var.f(21);
                } else {
                    pb0Var.q(V1);
                }
                jiaVar2.l(l7c.q(p75Var.f), false);
                be0Var.getImageReceiver().d = i8;
                be0Var.f(p75Var.f, pb0Var);
                jiaVar.l(k96.M0(z3 ? 2131745271 : z2 ? 2131745272 : z ? 2131751812 : 2131748913, null), false);
                float f3 = 0.5f;
                be0Var.setAlpha((z2 || z3) ? 0.5f : 1.0f);
                jiaVar2.setAlpha((z2 || z3) ? 0.5f : 1.0f);
                if (!z2 && !z3) {
                    f3 = 1.0f;
                }
                jiaVar.setAlpha(f3);
                ImageView imageView = p75Var.d;
                if (!z2 && !z3) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l = (Long) h75Var.T2.m.get(i - this.n);
        z2 = true;
        z3 = false;
        z = z3;
        if (l == null) {
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        LaunchActivity launchActivity = this.c;
        if (i != 0) {
            if (i == 1) {
                view2 = new z65(this, launchActivity);
            } else if (i == 2) {
                a75 a75Var = new a75(launchActivity);
                a75Var.n = bkb.hh;
                Paint paint = new Paint();
                a75Var.h = paint;
                paint.setColor(bkb.w0(null, bkb.Wg, false));
                a75Var.e = new pb0((wjb) null);
                be0 be0Var = new be0(launchActivity);
                a75Var.a = be0Var;
                be0Var.setRoundRadius(gl.L(24.0f));
                boolean z = k96.a0;
                a75Var.addView(be0Var, nme.d(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
                jia jiaVar = new jia(launchActivity);
                a75Var.b = jiaVar;
                zkb.W(jiaVar, bkb.dh, null);
                jiaVar.setTypeface(gl.o());
                jiaVar.setTextSize(16);
                jiaVar.setGravity((k96.a0 ? 5 : 3) | 48);
                boolean z2 = k96.a0;
                a75Var.addView(jiaVar, nme.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 54.0f : 67.0f, 10.0f, z2 ? 67.0f : 54.0f, 0.0f));
                jia jiaVar2 = new jia(launchActivity);
                a75Var.c = jiaVar2;
                jiaVar2.setTextSize(15);
                jiaVar2.setGravity((k96.a0 ? 5 : 3) | 48);
                jiaVar2.setTextColor(bkb.w0(null, a75Var.n, false));
                jiaVar2.l(k96.M0(2131748913, null), false);
                boolean z3 = k96.a0;
                a75Var.addView(jiaVar2, nme.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 32.0f, z3 ? 67.0f : 54.0f, 0.0f));
                ImageView imageView = new ImageView(launchActivity);
                a75Var.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.msg_invited);
                imageView.setImportantForAccessibility(2);
                imageView.setPadding(0, 0, gl.L(4.0f), 0);
                imageView.setColorFilter(new PorterDuffColorFilter(bkb.w0(null, a75Var.n, false), PorterDuff.Mode.MULTIPLY));
                a75Var.addView(imageView, nme.d(48, -1.0f, (k96.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                a75Var.setWillNotDraw(false);
                a75Var.setFocusable(true);
                view = a75Var;
            } else if (i == 4) {
                view2 = new b75(this, launchActivity);
            } else if (i != 5) {
                h75 h75Var = this.N;
                if (i == 6) {
                    TextView textView = new TextView(launchActivity);
                    textView.setTextColor(-8682615);
                    textView.setTextSize(1, 13.0f);
                    textView.setGravity(1);
                    textView.setPadding(0, 0, 0, gl.L(10.0f));
                    boolean W = hc2.W(h75Var.S2);
                    j5 j5Var = h75Var.n1;
                    if (W) {
                        textView.setText(k96.a0(null, null, 2131743207, k96.G(na7.q1(j5Var.a).k4.M0.f(), "Participants", new Object[0])));
                        view2 = textView;
                    } else {
                        textView.setText(k96.a0(null, null, 2131742983, k96.G(na7.q1(j5Var.a).k4.M0.f(), "Members", new Object[0])));
                        view2 = textView;
                    }
                } else if (i != 7) {
                    view = new View(launchActivity);
                } else {
                    if (h75Var.i2 == null) {
                        h75Var.i2 = new pc();
                    }
                    view2 = new sb(launchActivity, h75Var.i2);
                }
            } else {
                view = new d62(launchActivity, (byte) 9);
            }
            view = view2;
        } else {
            y65 y65Var = new y65(launchActivity);
            y65Var.h = 67;
            y65Var.n = (byte) 18;
            Paint paint2 = new Paint();
            y65Var.r = paint2;
            paint2.setColor(bkb.w0(null, bkb.Wg, false));
            y65Var.e = (byte) 23;
            jia jiaVar3 = new jia(launchActivity);
            y65Var.a = jiaVar3;
            zkb.W(jiaVar3, bkb.F6, null);
            jiaVar3.setTextSize(16);
            jiaVar3.setGravity(k96.a0 ? 5 : 3);
            jiaVar3.setImportantForAccessibility(2);
            y65Var.addView(jiaVar3);
            jia jiaVar4 = new jia(launchActivity);
            y65Var.b = jiaVar4;
            zkb.W(jiaVar4, bkb.H6, null);
            jiaVar4.setTextSize(16);
            jiaVar4.setGravity(k96.a0 ? 3 : 5);
            jiaVar4.setImportantForAccessibility(2);
            y65Var.addView(jiaVar4);
            ImageView imageView2 = new ImageView(launchActivity);
            y65Var.c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            zkb.s(imageView2, bkb.l6, null, PorterDuff.Mode.MULTIPLY);
            y65Var.addView(imageView2);
            ImageView imageView3 = new ImageView(launchActivity);
            y65Var.d = imageView3;
            imageView3.setScaleType(scaleType);
            y65Var.addView(imageView3);
            y65Var.setFocusable(true);
            view = y65Var;
        }
        return ls6.h(view, view, -1, -2);
    }

    @Override // w39
    public final void y(s49 s49Var) {
        c65 c65Var = this.N.H1;
        int i = s49Var.f;
        View view = s49Var.a;
        if (i == 1) {
            y95 y95Var = (y95) view;
            int i2 = c65Var.getTag() != null ? bkb.hh : bkb.ch;
            y95Var.f(i2, bkb.w0(null, i2, false));
            y95Var.setDrawDivider(s49Var.b() != this.G - 2);
            return;
        }
        if (i == 2) {
            p75 p75Var = (p75) view;
            int i3 = c65Var.getTag() != null ? bkb.hh : bkb.ch;
            p75Var.a(i3, bkb.w0(null, i3, false));
            p75Var.setDrawDivider(s49Var.b() != this.G - 2);
        }
    }
}
