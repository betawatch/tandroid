// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class l37 extends FrameLayout {
    public final ez3 E;
    public final ArrayList F;
    public final h37 G;
    public final kl0 H;
    public TLRPC.Peer a;
    public final boolean b;
    public final mu1 c;
    public final o27 d;
    public final j37 e;
    public final q27 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public l37(Context context, mu1 mu1Var, kl0 kl0Var, o27 o27Var, TLRPC.User user, TLRPC.Chat chat, int i, h37 h37Var, int i2, final boolean z) {
        super(context);
        this.E = new ez3(this, (byte) 28);
        this.F = new ArrayList(10);
        this.b = z;
        this.c = mu1Var;
        this.x = i;
        this.H = kl0Var;
        this.n = user;
        this.r = chat;
        this.d = o27Var;
        this.G = h37Var;
        this.f = new q27(this, context, h37Var);
        j37 j37Var = new j37(context, h37Var);
        this.e = j37Var;
        il0 c = kl0Var.c(j37Var, null, false);
        c.p(nod.k(h37Var));
        c.S.e = true;
        c.q(gl.L(8.0f));
        c.r(gl.L(16.0f));
        j37Var.setBackground(c);
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == 0 && o27Var.a != null) {
                this.e.a(0, k96.M0(2131748355, null));
            } else if (i4 != 1 || o27Var.b == null || z) {
                if (i4 == 2 && o27Var.c != null && !z) {
                    this.e.a(2, k96.M0(2131748358, null));
                }
            } else {
                this.e.a(1, k96.M0(2131748359, null));
            }
            if (i4 == i2) {
                i3 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new r27(this, context));
        this.f.setPosition(i3);
        this.e.setSelectedTab(i3);
        addView(this.e, nme.e(-1, 66, 87));
        addView(this.f, nme.d(-1, -1.0f, kk7.D1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new hj3(this, (byte) 27));
        setOnTouchListener(new View.OnTouchListener() { // from class: p27
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && !z) {
                    l37.this.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(la2.V).scaleY(1.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r3.k != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        if (r3.l == null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        int i;
        if (this.s) {
            byte b = 0;
            this.s = false;
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(la2.V).setListener(new id4((byte) 13, this, z));
            int i2 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i2 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i2];
                if (view instanceof f37) {
                    f37 f37Var = (f37) view;
                    if (f37Var.a == 0) {
                        f37Var.k();
                        break;
                    }
                }
                i2++;
            }
            wr1 wr1Var = (wr1) this;
            mu1 mu1Var = wr1Var.I;
            bu1 bu1Var = null;
            mu1Var.cb = null;
            mu1Var.i5();
            o27 o27Var = mu1Var.x5;
            if (o27Var != null) {
                bu1 bu1Var2 = mu1Var.D5;
                if (bu1Var2 == null) {
                    bu1Var2 = o27Var.d;
                    mu1Var.D5 = bu1Var2;
                }
                bu1 bu1Var3 = o27Var.d;
                if (bu1Var3 == null) {
                    mu1Var.D5 = null;
                } else {
                    bu1Var = bu1Var2;
                }
                if (bu1Var != null && bu1Var.m && bu1Var3 != null && bu1Var3.m) {
                    boolean z2 = true;
                    if (!bu1Var3.g) {
                        if (!bu1Var3.h) {
                            z2 = true ^ TextUtils.isEmpty(bu1Var3.i);
                        }
                        if (z2) {
                            bu1 bu1Var4 = mu1Var.x5.d;
                            mu1Var.D5 = bu1Var4;
                            bu1Var4.f = false;
                            if (mu1Var.Sb == 2) {
                                mu1Var.Qb(mu1Var.F5, bu1Var4);
                            }
                        }
                    }
                }
                bu1 bu1Var5 = mu1Var.D5;
                if (bu1Var5 != null) {
                    bu1Var5.f = false;
                    o27 o27Var2 = mu1Var.x5;
                    bu1Var5.b = o27Var2.e;
                    bu1Var5.c = o27Var2.f;
                    bu1Var5.f();
                    if (mu1Var.Sb == 2) {
                        mu1Var.Qb(mu1Var.F5, mu1Var.D5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    m27 m27Var = mu1Var.x5.b;
                    if (m27Var != null) {
                        m27Var.b(arrayList);
                    }
                    mu1Var.u6();
                }
            }
            if (mu1Var.Eb && z) {
                gl.e3(new vr1(wr1Var, b), 50L);
                mu1Var.Eb = false;
            }
            Activity parentActivity = mu1Var.getParentActivity();
            i = ((d) mu1Var).classGuid;
            gl.W2(parentActivity, i);
        }
    }

    public abstract void b();

    public abstract void c(boolean z);

    public void setSendAsPeer(TLRPC.Peer peer) {
        this.a = peer;
        int i = 0;
        while (true) {
            View[] viewArr = this.f.e;
            if (i >= viewArr.length) {
                return;
            }
            View view = viewArr[i];
            if (view != null) {
                f37 f37Var = (f37) view;
                if (f37Var.a == 1) {
                    f37Var.i();
                }
            }
            i++;
        }
    }
}
