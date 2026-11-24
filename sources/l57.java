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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class l57 extends FrameLayout {
    public final o04 E;
    public final ArrayList F;
    public final h57 G;
    public final km0 H;
    public TLRPC.Peer a;
    public final boolean b;
    public final yv1 c;
    public final o47 d;
    public final j57 e;
    public final q47 f;
    public ValueAnimator h;
    public final TLRPC.User n;
    public final TLRPC.Chat r;
    public boolean s;
    public boolean w;
    public final int x;
    public boolean y;

    public l57(Context context, yv1 yv1Var, km0 km0Var, o47 o47Var, TLRPC.User user, TLRPC.Chat chat, int i, h57 h57Var, int i2, final boolean z) {
        super(context);
        this.E = new o04(this, (byte) 28);
        this.F = new ArrayList(10);
        this.b = z;
        this.c = yv1Var;
        this.x = i;
        this.H = km0Var;
        this.n = user;
        this.r = chat;
        this.d = o47Var;
        this.G = h57Var;
        this.f = new q47(this, context, h57Var);
        j57 j57Var = new j57(context, h57Var);
        this.e = j57Var;
        im0 c = km0Var.c(j57Var, null, false);
        c.p(qqd.k(h57Var));
        c.S.e = true;
        c.q(gm.L(8.0f));
        c.r(gm.L(16.0f));
        j57Var.setBackground(c);
        int i3 = 0;
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == 0 && o47Var.a != null) {
                this.e.a(0, jb6.M0(2131748304, null));
            } else if (i4 != 1 || o47Var.b == null || z) {
                if (i4 == 2 && o47Var.c != null && !z) {
                    this.e.a(2, jb6.M0(2131748307, null));
                }
            } else {
                this.e.a(1, jb6.M0(2131748308, null));
            }
            if (i4 == i2) {
                i3 = this.e.a.size() - 1;
            }
        }
        this.f.setAdapter(new r47(this, context));
        this.f.setPosition(i3);
        this.e.setSelectedTab(i3);
        addView(this.e, qoe.e(-1, 66, 87));
        addView(this.f, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 0.0f, 66.0f));
        this.e.setOnTabClick(new sk3(this, (byte) 27));
        setOnTouchListener(new View.OnTouchListener() { // from class: p47
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1 && !z) {
                    l57.this.a(true);
                }
                return true;
            }
        });
        this.s = true;
        setAlpha(0.0f);
        setScaleX(0.95f);
        setScaleY(0.95f);
        animate().alpha(1.0f).scaleX(1.0f).setDuration(250L).setInterpolator(wb2.V).scaleY(1.0f);
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
            animate().alpha(0.0f).scaleX(0.95f).scaleY(0.95f).setDuration(250L).setInterpolator(wb2.V).setListener(new jf4((byte) 13, this, z));
            int i2 = 0;
            while (true) {
                View[] viewArr = this.f.e;
                if (i2 >= viewArr.length) {
                    break;
                }
                View view = viewArr[i2];
                if (view instanceof f57) {
                    f57 f57Var = (f57) view;
                    if (f57Var.a == 0) {
                        f57Var.k();
                        break;
                    }
                }
                i2++;
            }
            jt1 jt1Var = (jt1) this;
            yv1 yv1Var = jt1Var.I;
            nv1 nv1Var = null;
            yv1Var.cb = null;
            yv1Var.q5();
            o47 o47Var = yv1Var.x5;
            if (o47Var != null) {
                nv1 nv1Var2 = yv1Var.D5;
                if (nv1Var2 == null) {
                    nv1Var2 = o47Var.d;
                    yv1Var.D5 = nv1Var2;
                }
                nv1 nv1Var3 = o47Var.d;
                if (nv1Var3 == null) {
                    yv1Var.D5 = null;
                } else {
                    nv1Var = nv1Var2;
                }
                if (nv1Var != null && nv1Var.m && nv1Var3 != null && nv1Var3.m) {
                    boolean z2 = true;
                    if (!nv1Var3.g) {
                        if (!nv1Var3.h) {
                            z2 = true ^ TextUtils.isEmpty(nv1Var3.i);
                        }
                        if (z2) {
                            nv1 nv1Var4 = yv1Var.x5.d;
                            yv1Var.D5 = nv1Var4;
                            nv1Var4.f = false;
                            if (yv1Var.ac == 2) {
                                yv1Var.ec(yv1Var.F5, nv1Var4);
                            }
                        }
                    }
                }
                nv1 nv1Var5 = yv1Var.D5;
                if (nv1Var5 != null) {
                    nv1Var5.f = false;
                    o47 o47Var2 = yv1Var.x5;
                    nv1Var5.b = o47Var2.e;
                    nv1Var5.c = o47Var2.f;
                    nv1Var5.f();
                    if (yv1Var.ac == 2) {
                        yv1Var.ec(yv1Var.F5, yv1Var.D5);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    m47 m47Var = yv1Var.x5.b;
                    if (m47Var != null) {
                        m47Var.b(arrayList);
                    }
                    yv1Var.D6();
                }
            }
            if (yv1Var.Mb && z) {
                gm.d3(new it1(jt1Var, b), 50L);
                yv1Var.Mb = false;
            }
            Activity parentActivity = yv1Var.getParentActivity();
            i = ((d) yv1Var).classGuid;
            gm.V2(parentActivity, i);
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
                f57 f57Var = (f57) view;
                if (f57Var.a == 1) {
                    f57Var.i();
                }
            }
            i++;
        }
    }
}
