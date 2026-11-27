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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class e95 extends c79 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final /* synthetic */ j95 N;
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

    public e95(j95 j95Var, LaunchActivity launchActivity) {
        this.N = j95Var;
        this.c = launchActivity;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        return (i == 3 || i == 4 || i == 5 || i == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        j95 j95Var = this.N;
        ArrayList arrayList = j95Var.j2;
        vc2 vc2Var = j95Var.T2;
        if (vc2Var == null || vc2Var.k() || j95Var.l2) {
            return;
        }
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.G = 0;
        this.M = j95Var.T2.d.h(r47.B1(j95Var.u2)) >= 0;
        if (j95Var.h1()) {
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
        if (!arrayList.isEmpty() && j95Var.H0() && j95Var.T2.b.participants_count > uc7.s1(j95Var.n1.a).k4.U0.f()) {
            int i4 = this.G;
            this.G = i4 + 1;
            this.K = i4;
        }
        int i5 = this.G;
        this.d = i5;
        int size2 = j95Var.T2.g.size() + i5;
        this.G = size2;
        this.e = size2;
        if (j95Var.T2.j.isEmpty()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i6 = this.G;
            this.f = i6;
            int size3 = j95Var.T2.j.size() + i6;
            this.G = size3;
            this.h = size3;
        }
        if (j95Var.T2.m.isEmpty()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i7 = this.G;
            this.n = i7;
            int size4 = j95Var.T2.m.size() + i7;
            this.G = size4;
            this.r = size4;
        }
        if (j95Var.T2.l.isEmpty()) {
            this.s = -1;
            this.w = -1;
        } else {
            int i8 = this.G;
            this.s = i8;
            int size5 = j95Var.T2.l.size() + i8;
            this.G = size5;
            this.w = size5;
        }
        if (j95Var.h1()) {
            int i9 = this.G;
            this.y = i9;
            this.G = i9 + 2;
            this.E = i9 + 1;
        } else if (((!xc2.T(j95Var.S2) || ((chat2 = j95Var.S2) != null && chat2.megagroup)) && xc2.B(j95Var.S2)) || (xc2.T(j95Var.S2) && (chat = j95Var.S2) != null && !chat.megagroup && xc2.t0(chat))) {
            int i10 = this.G;
            this.G = i10 + 1;
            this.x = i10;
        }
        int i11 = this.G;
        this.G = i11 + 1;
        this.F = i11;
    }

    @Override // j79
    public final int b() {
        return this.G;
    }

    @Override // j79
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

    @Override // j79
    public final void f() {
        E();
        super.f();
    }

    @Override // j79
    public final void g(int i) {
        E();
        super.g(i);
    }

    @Override // j79
    public final void j(int i, int i2) {
        E();
        super.j(i, i2);
    }

    @Override // j79
    public final void l(int i, int i2) {
        E();
        super.l(i, i2);
    }

    @Override // j79
    public final void n(int i, int i2, Object obj) {
        E();
        super.n(i, i2, obj);
    }

    @Override // j79
    public final void p(int i, int i2) {
        E();
        super.p(i, i2);
    }

    @Override // j79
    public final void q(int i, int i2) {
        E();
        super.q(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        TLRPC.Chat chat;
        TLRPC.GroupCallParticipant groupCallParticipant;
        v85 v85Var;
        Long l;
        boolean z;
        boolean z2;
        boolean z3;
        wc2 wc2Var;
        v85 v85Var2;
        j95 j95Var = this.N;
        ArrayList arrayList = j95Var.x2;
        ArrayList arrayList2 = j95Var.z2;
        ArrayList arrayList3 = j95Var.j2;
        ArrayList arrayList4 = j95Var.y2;
        int i2 = f89Var.f;
        View view = f89Var.a;
        TLRPC.FileLocation fileLocation = null;
        if (i2 == 0) {
            tb5 tb5Var = (tb5) view;
            if (i == this.y) {
                int v0 = aob.v0(aob.v6, j95Var.J0);
                tb5Var.a(v0, v0);
                tb5Var.b(R.drawable.msg_contact_add, ob6.M0(2131743077, null), true);
                return;
            } else {
                if (i == this.E) {
                    int v02 = aob.v0(aob.v6, j95Var.J0);
                    tb5Var.a(v02, v02);
                    tb5Var.b(R.drawable.msg_link2, ob6.M0(2131743072, null), false);
                    return;
                }
                int R0 = hl.R0(j95Var.H1.getTag() != null ? 1.0f : 0.0f, 1.0f, aob.w0(null, aob.ch, false), aob.w0(null, aob.fh, false));
                tb5Var.a(R0, R0);
                if (!xc2.T(j95Var.S2) || (chat = j95Var.S2) == null || chat.megagroup || !xc2.t0(chat)) {
                    tb5Var.b(R.drawable.msg_contact_add, ob6.M0(2131743025, null), false);
                    return;
                } else {
                    tb5Var.b(R.drawable.msg_link, ob6.M0(2131742988, null), false);
                    return;
                }
            }
        }
        if (i2 == 1) {
            zb5 zb5Var = (zb5) view;
            int i3 = i - this.d;
            if (j95Var.l2) {
                if (i3 >= 0 && i3 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i3);
                }
                groupCallParticipant = null;
            } else {
                if (i3 >= 0 && i3 < j95Var.T2.g.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) j95Var.T2.g.get(i3);
                }
                groupCallParticipant = null;
            }
            if (groupCallParticipant != null) {
                long B1 = r47.B1(groupCallParticipant.peer);
                long B12 = r47.B1(j95Var.u2);
                if (B1 == B12 && (v85Var = j95Var.b4) != null) {
                    fileLocation = v85Var.c;
                }
                float f = fileLocation != null ? j95Var.b4.a : 1.0f;
                boolean z4 = zb5Var.getParticipant() != null && r47.B1(zb5Var.getParticipant().peer) == B1;
                zb5Var.e(j95Var.n1, groupCallParticipant, j95Var.T2, B12, fileLocation, z4);
                vb5 vb5Var = zb5Var.y;
                vb5Var.setProgress(f);
                if (f < 1.0f) {
                    hl.T3(vb5Var, true, 1.0f, true, z4);
                    return;
                } else {
                    hl.T3(vb5Var, false, 1.0f, true, z4);
                    return;
                }
            }
            return;
        }
        if (i2 != 2) {
            if (i2 == 4) {
                q95 q95Var = (q95) view;
                wc2 participant = q95Var.getParticipant();
                int i4 = i - this.H;
                q95Var.a = j95Var.m1.i(i);
                if (j95Var.l2) {
                    if (i4 >= 0 && i4 < arrayList4.size()) {
                        wc2Var = (wc2) arrayList4.get(i4);
                    }
                    wc2Var = null;
                } else {
                    if (i4 >= 0 && i4 < arrayList3.size()) {
                        wc2Var = (wc2) arrayList3.get(i4);
                    }
                    wc2Var = null;
                }
                if (wc2Var != null) {
                    if (r47.B1(wc2Var.a.peer) == r47.B1(j95Var.u2) && (v85Var2 = j95Var.b4) != null) {
                        fileLocation = v85Var2.c;
                    }
                    if (fileLocation != null) {
                        float f2 = j95Var.b4.a;
                    }
                    if (q95Var.getParticipant() != null) {
                        q95Var.getParticipant().equals(wc2Var);
                    }
                    q95Var.d = wc2Var;
                }
                if (participant == null || participant.equals(wc2Var) || !q95Var.e || q95Var.getRenderer() == null) {
                    return;
                }
                j95Var.F0(q95Var, false);
                j95Var.F0(q95Var, true);
                return;
            }
            return;
        }
        r95 r95Var = (r95) view;
        int i5 = i - this.f;
        int i6 = i - this.n;
        if (i6 < 0 || i6 >= j95Var.T2.m.size()) {
            int i7 = i - this.s;
            if (i7 < 0 || i7 >= j95Var.T2.l.size()) {
                if (j95Var.l2) {
                    if (i5 >= 0 && i5 < arrayList2.size()) {
                        l = (Long) arrayList2.get(i5);
                        z2 = false;
                        z3 = false;
                    }
                } else if (i5 >= 0 && i5 < j95Var.T2.j.size()) {
                    l = (Long) j95Var.T2.j.get(i5);
                    uc2 uc2Var = (uc2) j95Var.T2.k.get(l);
                    z = uc2Var != null && uc2Var.a();
                    z2 = false;
                    z3 = false;
                }
                z2 = false;
                z3 = false;
                z = false;
                l = null;
            } else {
                l = (Long) j95Var.T2.l.get(i - this.s);
                z3 = true;
                z2 = false;
                z = false;
            }
            if (l == null) {
                int i8 = j95Var.a;
                ema emaVar = r95Var.c;
                ema emaVar2 = r95Var.b;
                de0 de0Var = r95Var.a;
                TLRPC.User X1 = uc7.s1(i8).X1(l);
                r95Var.f = X1;
                rb0 rb0Var = r95Var.e;
                if (X1 == null) {
                    rb0Var.f(21);
                } else {
                    rb0Var.q(X1);
                }
                emaVar2.l(lbc.r(r95Var.f), false);
                de0Var.getImageReceiver().d = i8;
                de0Var.f(r95Var.f, rb0Var);
                emaVar.l(ob6.M0(z3 ? 2131745191 : z2 ? 2131745192 : z ? 2131751789 : 2131748859, null), false);
                float f3 = 0.5f;
                de0Var.setAlpha((z2 || z3) ? 0.5f : 1.0f);
                emaVar2.setAlpha((z2 || z3) ? 0.5f : 1.0f);
                if (!z2 && !z3) {
                    f3 = 1.0f;
                }
                emaVar.setAlpha(f3);
                ImageView imageView = r95Var.d;
                if (!z2 && !z3) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l = (Long) j95Var.T2.m.get(i - this.n);
        z2 = true;
        z3 = false;
        z = z3;
        if (l == null) {
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        LaunchActivity launchActivity = this.c;
        if (i != 0) {
            if (i == 1) {
                view2 = new b95(this, launchActivity);
            } else if (i == 2) {
                c95 c95Var = new c95(launchActivity);
                c95Var.n = aob.ih;
                Paint paint = new Paint();
                c95Var.h = paint;
                paint.setColor(aob.w0(null, aob.Xg, false));
                c95Var.e = new rb0((vnb) null);
                de0 de0Var = new de0(launchActivity);
                c95Var.a = de0Var;
                de0Var.setRoundRadius(hl.L(24.0f));
                boolean z = ob6.a0;
                c95Var.addView(de0Var, tre.d(46, 46.0f, (z ? 5 : 3) | 48, z ? 0.0f : 11.0f, 6.0f, z ? 11.0f : 0.0f, 0.0f));
                ema emaVar = new ema(launchActivity);
                c95Var.b = emaVar;
                yob.W(emaVar, aob.eh, null);
                emaVar.setTypeface(hl.o());
                emaVar.setTextSize(16);
                emaVar.setGravity((ob6.a0 ? 5 : 3) | 48);
                boolean z2 = ob6.a0;
                c95Var.addView(emaVar, tre.d(-1, 20.0f, (z2 ? 5 : 3) | 48, z2 ? 54.0f : 67.0f, 10.0f, z2 ? 67.0f : 54.0f, 0.0f));
                ema emaVar2 = new ema(launchActivity);
                c95Var.c = emaVar2;
                emaVar2.setTextSize(15);
                emaVar2.setGravity((ob6.a0 ? 5 : 3) | 48);
                emaVar2.setTextColor(aob.w0(null, c95Var.n, false));
                emaVar2.l(ob6.M0(2131748859, null), false);
                boolean z3 = ob6.a0;
                c95Var.addView(emaVar2, tre.d(-1, 20.0f, (z3 ? 5 : 3) | 48, z3 ? 54.0f : 67.0f, 32.0f, z3 ? 67.0f : 54.0f, 0.0f));
                ImageView imageView = new ImageView(launchActivity);
                c95Var.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(R.drawable.msg_invited);
                imageView.setImportantForAccessibility(2);
                imageView.setPadding(0, 0, hl.L(4.0f), 0);
                imageView.setColorFilter(new PorterDuffColorFilter(aob.w0(null, c95Var.n, false), PorterDuff.Mode.MULTIPLY));
                c95Var.addView(imageView, tre.d(48, -1.0f, (ob6.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                c95Var.setWillNotDraw(false);
                c95Var.setFocusable(true);
                view = c95Var;
            } else if (i == 4) {
                view2 = new d95(this, launchActivity);
            } else if (i != 5) {
                j95 j95Var = this.N;
                if (i == 6) {
                    TextView textView = new TextView(launchActivity);
                    textView.setTextColor(-8682615);
                    textView.setTextSize(1, 13.0f);
                    textView.setGravity(1);
                    textView.setPadding(0, 0, 0, hl.L(10.0f));
                    boolean W = xc2.W(j95Var.S2);
                    k5 k5Var = j95Var.n1;
                    if (W) {
                        textView.setText(ob6.a0(null, null, 2131743101, ob6.G(uc7.s1(k5Var.a).k4.U0.f(), "Participants", new Object[0])));
                        view2 = textView;
                    } else {
                        textView.setText(ob6.a0(null, null, 2131742877, ob6.G(uc7.s1(k5Var.a).k4.U0.f(), "Members", new Object[0])));
                        view2 = textView;
                    }
                } else if (i != 7) {
                    view = new View(launchActivity);
                } else {
                    if (j95Var.i2 == null) {
                        j95Var.i2 = new qc();
                    }
                    view2 = new tb(launchActivity, j95Var.i2);
                }
            } else {
                view = new t62(launchActivity, (byte) 9);
            }
            view = view2;
        } else {
            a95 a95Var = new a95(launchActivity);
            a95Var.h = 67;
            a95Var.n = (byte) 18;
            Paint paint2 = new Paint();
            a95Var.r = paint2;
            paint2.setColor(aob.w0(null, aob.Xg, false));
            a95Var.e = (byte) 23;
            ema emaVar3 = new ema(launchActivity);
            a95Var.a = emaVar3;
            yob.W(emaVar3, aob.G6, null);
            emaVar3.setTextSize(16);
            emaVar3.setGravity(ob6.a0 ? 5 : 3);
            emaVar3.setImportantForAccessibility(2);
            a95Var.addView(emaVar3);
            ema emaVar4 = new ema(launchActivity);
            a95Var.b = emaVar4;
            yob.W(emaVar4, aob.I6, null);
            emaVar4.setTextSize(16);
            emaVar4.setGravity(ob6.a0 ? 3 : 5);
            emaVar4.setImportantForAccessibility(2);
            a95Var.addView(emaVar4);
            ImageView imageView2 = new ImageView(launchActivity);
            a95Var.c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            yob.s(imageView2, aob.m6, null, PorterDuff.Mode.MULTIPLY);
            a95Var.addView(imageView2);
            ImageView imageView3 = new ImageView(launchActivity);
            a95Var.d = imageView3;
            imageView3.setScaleType(scaleType);
            a95Var.addView(imageView3);
            a95Var.setFocusable(true);
            view = a95Var;
        }
        return qu6.h(view, view, -1, -2);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        e85 e85Var = this.N.H1;
        int i = f89Var.f;
        View view = f89Var.a;
        if (i == 1) {
            zb5 zb5Var = (zb5) view;
            int i2 = e85Var.getTag() != null ? aob.ih : aob.dh;
            zb5Var.f(i2, aob.w0(null, i2, false));
            zb5Var.setDrawDivider(f89Var.b() != this.G - 2);
            return;
        }
        if (i == 2) {
            r95 r95Var = (r95) view;
            int i3 = e85Var.getTag() != null ? aob.ih : aob.dh;
            r95Var.a(i3, aob.w0(null, i3, false));
            r95Var.setDrawDivider(f89Var.b() != this.G - 2);
        }
    }
}
