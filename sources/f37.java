// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.URLSpan;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class f37 extends FrameLayout {
    public static final /* synthetic */ int e0 = 0;
    public final a8 E;
    public final k37 F;
    public final FrameLayout G;
    public final k37 H;
    public final k37 I;
    public final int J;
    public final mv6 K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public AnimatorSet Q;
    public final Rect R;
    public int S;
    public float T;
    public int U;
    public boolean V;
    public boolean W;
    public final int a;
    public int a0;
    public final n81 b;
    public int b0;
    public final s27 c;
    public boolean c0;
    public final qib d;
    public final /* synthetic */ l37 d0;
    public final z27 e;
    public final fu f;
    public final b37 h;
    public final jr n;
    public m27 r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final y27 w;
    public final y27 x;
    public final a8 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x06ca  */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.graphics.drawable.Drawable, java.lang.String, vkb] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f37(l37 l37Var, Context context, int i) {
        super(r5);
        o27 o27Var;
        ViewOutlineProvider viewOutlineProvider;
        Context context2;
        f37 f37Var;
        boolean z;
        k37 k37Var;
        k37 k37Var2;
        f37 f37Var2;
        int i2;
        qib m;
        int i3;
        ?? r12;
        o27 o27Var2;
        boolean z2;
        Object obj;
        Context context3 = context;
        this.d0 = l37Var;
        byte b = 1;
        this.L = true;
        this.M = -1;
        this.N = -1;
        final byte b2 = 0;
        this.O = false;
        this.R = new Rect();
        this.V = false;
        this.c0 = true;
        this.K = new mv6((Object) context3, (byte) 20);
        this.a = i;
        setOnTouchListener(new a7(this, (byte) 11));
        n81 n81Var = new n81((byte) 6, context3, this);
        this.b = n81Var;
        h37 h37Var = l37Var.G;
        boolean z3 = l37Var.b;
        o27 o27Var3 = l37Var.d;
        Drawable l = ((ku1) h37Var).l();
        if (((ku1) h37Var).f == null) {
            int i4 = bkb.a;
        }
        n81Var.U(l);
        n81Var.setOccupyStatusBar(false);
        byte b3 = 5;
        n81Var.setOutlineProvider(new cl0(this, b3));
        n81Var.setClipToOutline(true);
        n81Var.setElevation(gl.L(4.0f));
        s27 s27Var = new s27(context3, h37Var);
        this.c = s27Var;
        zkb.h(bkb.r8, h37Var, s27Var);
        z27 z27Var = new z27(this);
        this.e = z27Var;
        z27Var.D = new hr1(this, b);
        fu fuVar = new fu(this, context3, h37Var, (byte) 26);
        this.f = fuVar;
        b37 b37Var = new b37(this, fuVar, h37Var);
        this.h = b37Var;
        fuVar.setItemAnimator(b37Var);
        fuVar.setOnScrollListener(new ao2(this, (byte) 25));
        fuVar.setOnItemClickListener(new c37(this));
        jr jrVar = new jr(this, b3);
        this.n = jrVar;
        fuVar.setAdapter(jrVar);
        fuVar.setPadding(0, gl.L(4.0f), 0, gl.L(4.0f));
        s17 s17Var = new s17(this, b);
        byte b4 = 9;
        s17Var.O = new nq1(this, b4);
        fuVar.setClipToPadding(false);
        fuVar.setLayoutManager(s17Var);
        fuVar.i(new oq1(b4));
        n81Var.addView(fuVar);
        addView(n81Var, nme.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        n81Var.addView(s27Var, nme.c(-2.0f, -1));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, h37Var, getContext());
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new w27(this, (byte) 1));
        il0 c = l37Var.H.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c.p(nod.k(h37Var));
        c.q(gl.L(8.0f));
        c.S.e = true;
        c.r(gl.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, nme.c(-2.0f, -2));
        if (i == 0) {
            m27 m27Var = o27Var3.a;
            boolean z4 = o27Var3.s;
            if (m27Var != null) {
                if (!m27Var.j || o27Var3.i) {
                    i3 = 48;
                    r12 = 0;
                    o27Var = o27Var3;
                } else {
                    LinearLayout j = de9.j(context3, 1);
                    if (z3) {
                        o27Var2 = o27Var3;
                        z2 = true;
                        obj = null;
                    } else {
                        o27Var2 = o27Var3;
                        obj = null;
                        a8 a8Var = new a8(0, l37Var.G, context3, true, false);
                        a8Var.j(k96.M0(2131753753, null), R.drawable.msg_arrow_back, null);
                        a8Var.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                            public final /* synthetic */ f37 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i5;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                byte b5 = b2;
                                f37 f37Var3 = this.b;
                                switch (b5) {
                                    case 0:
                                        f37Var3.d0.d.d = null;
                                        f37Var3.e.e(false);
                                        f37Var3.g(false, false);
                                        f37Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        z27 z27Var2 = f37Var3.e;
                                        l37 l37Var2 = f37Var3.d0;
                                        if (f37Var3.a(null) != null) {
                                            if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                                mib mibVar = z27Var2.W;
                                                k27 a = f37Var3.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                                o27 o27Var4 = l37Var2.d;
                                                int i6 = z27Var2.u;
                                                o27Var4.e = i6;
                                                int i7 = z27Var2.v;
                                                o27Var4.f = i7;
                                                o27Var4.d = bu1.b(i6, i7, a);
                                                l37Var2.b();
                                                l37Var2.a(true);
                                                break;
                                            } else {
                                                f37Var3.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        z27 z27Var3 = f37Var3.e;
                                        l37 l37Var3 = f37Var3.d0;
                                        o27 o27Var5 = l37Var3.d;
                                        int i8 = l37Var3.x;
                                        boolean z5 = l37Var3.b;
                                        if (o27Var5.d != null && !z5) {
                                            o27Var5.d = null;
                                            z27Var3.e(false);
                                            f37Var3.g(false, true);
                                            f37Var3.l(true);
                                            break;
                                        } else if (z27Var3.v - z27Var3.u <= na7.q1(i8).k4.N1.f()) {
                                            k27 a2 = f37Var3.a(null);
                                            if (a2 != null) {
                                                if (!z27Var3.w()) {
                                                    o27Var5.e = 0;
                                                    int min = Math.min(na7.q1(i8).k4.N1.f(), bu1.d(a2));
                                                    o27Var5.f = min;
                                                    o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                                    View b6 = f37Var3.b();
                                                    if (b6 instanceof gb2) {
                                                        z27Var3.Z((gb2) b6, o27Var5.e, o27Var5.f);
                                                    }
                                                    if (!z5) {
                                                        f37Var3.s.getSwipeBack().e(f37Var3.J);
                                                    }
                                                    f37Var3.g(true, true);
                                                    break;
                                                } else {
                                                    o27Var5.e = z27Var3.u;
                                                    o27Var5.f = z27Var3.v;
                                                    mib mibVar2 = z27Var3.W;
                                                    o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var3.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                                    l37Var3.b();
                                                    l37Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            f37Var3.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        f37Var3.d0.c(false);
                                        break;
                                    case 4:
                                        f37Var3.d0.c(false);
                                        break;
                                    case 5:
                                        f37Var3.d0.a(true);
                                        break;
                                    case 6:
                                        l37 l37Var4 = f37Var3.d0;
                                        if (!l37Var4.b) {
                                            wr1 wr1Var = (wr1) l37Var4;
                                            wr1Var.a(true);
                                            mu1 mu1Var = wr1Var.I;
                                            mu1Var.F5 = null;
                                            mu1Var.D5 = null;
                                            mu1Var.x5.f(null, null, mu1Var.l6, null);
                                            mu1Var.w6();
                                            break;
                                        } else {
                                            wr1 wr1Var2 = (wr1) l37Var4;
                                            wr1Var2.a(true);
                                            mu1 mu1Var2 = wr1Var2.I;
                                            mu1Var2.D5 = null;
                                            mu1Var2.Rb(mu1Var2.F5);
                                            break;
                                        }
                                    case 7:
                                        f37Var3.d0.c(true);
                                        break;
                                    case 8:
                                        f37Var3.d0.a(true);
                                        break;
                                    case 9:
                                        wr1 wr1Var3 = (wr1) f37Var3.d0;
                                        wr1Var3.a(true);
                                        mu1 mu1Var3 = wr1Var3.I;
                                        mu1Var3.x5.d(null, mu1Var3.l6);
                                        mu1Var3.w6();
                                        break;
                                    case 10:
                                        f37Var3.d0.a(true);
                                        break;
                                    case 11:
                                        wr1 wr1Var4 = (wr1) f37Var3.d0;
                                        wr1Var4.a(true);
                                        mu1 mu1Var4 = wr1Var4.I;
                                        mu1Var4.Y5 = null;
                                        ar1 ar1Var = mu1Var4.a0;
                                        if (ar1Var != null) {
                                            ar1Var.N3 = null;
                                            ar1Var.O3 = false;
                                        }
                                        o27 o27Var6 = mu1Var4.x5;
                                        if (o27Var6 != null) {
                                            i5 = ((d) mu1Var4).currentAccount;
                                            k27 k27Var = mu1Var4.F5;
                                            o27Var6.e(i5, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                        }
                                        mu1Var4.w6();
                                        break;
                                    case 12:
                                        o27 o27Var7 = f37Var3.d0.d;
                                        if (o27Var7.o) {
                                            boolean z6 = !o27Var7.q;
                                            o27Var7.q = z6;
                                            f37Var3.H.a(z6, true);
                                            f37Var3.I.a(o27Var7.q, true);
                                            if (f37Var3.r.e.size() > 0 && (message2 = ((k27) f37Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z7 = o27Var7.q;
                                                messageMedia2.force_small_media = z7;
                                                messageMedia2.force_large_media = !z7;
                                            }
                                            if (f37Var3.r.f.size() > 0 && (message = ((k27) f37Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z8 = o27Var7.q;
                                                messageMedia.force_small_media = z8;
                                                messageMedia.force_large_media = !z8;
                                            }
                                            f37Var3.i();
                                            f37Var3.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        o27 o27Var8 = f37Var3.d0.d;
                                        boolean z9 = o27Var8.r;
                                        o27Var8.r = !z9;
                                        f37Var3.F.a(z9, true);
                                        if (f37Var3.r.e.size() > 0 && (message4 = ((k27) f37Var3.r.e.get(0)).k) != null) {
                                            message4.invert_media = o27Var8.r;
                                        }
                                        if (f37Var3.r.f.size() > 0 && (message3 = ((k27) f37Var3.r.f.get(0)).k) != null) {
                                            message3.invert_media = o27Var8.r;
                                        }
                                        f37Var3.i();
                                        f37Var3.V = true;
                                        break;
                                }
                            }
                        });
                        j.addView(a8Var, nme.o(-1, 48));
                        j8 j8Var = new j8(context3, h37Var);
                        zkb.i(j8Var, zkb.K(0.06f, bkb.D8), h37Var);
                        j8Var.setTag(R.id.fit_width_tag, 1);
                        j.addView(j8Var, nme.o(-1, 8));
                        a8 a8Var2 = new a8(0, l37Var.G, context3, false, true);
                        a8Var2.j(k96.M0(2131746237, null), R.drawable.menu_quote_specific, null);
                        z2 = true;
                        final boolean z5 = true ? 1 : 0;
                        a8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                            public final /* synthetic */ f37 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i5;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                byte b5 = z5;
                                f37 f37Var3 = this.b;
                                switch (b5) {
                                    case 0:
                                        f37Var3.d0.d.d = null;
                                        f37Var3.e.e(false);
                                        f37Var3.g(false, false);
                                        f37Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        z27 z27Var2 = f37Var3.e;
                                        l37 l37Var2 = f37Var3.d0;
                                        if (f37Var3.a(null) != null) {
                                            if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                                mib mibVar = z27Var2.W;
                                                k27 a = f37Var3.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                                o27 o27Var4 = l37Var2.d;
                                                int i6 = z27Var2.u;
                                                o27Var4.e = i6;
                                                int i7 = z27Var2.v;
                                                o27Var4.f = i7;
                                                o27Var4.d = bu1.b(i6, i7, a);
                                                l37Var2.b();
                                                l37Var2.a(true);
                                                break;
                                            } else {
                                                f37Var3.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        z27 z27Var3 = f37Var3.e;
                                        l37 l37Var3 = f37Var3.d0;
                                        o27 o27Var5 = l37Var3.d;
                                        int i8 = l37Var3.x;
                                        boolean z52 = l37Var3.b;
                                        if (o27Var5.d != null && !z52) {
                                            o27Var5.d = null;
                                            z27Var3.e(false);
                                            f37Var3.g(false, true);
                                            f37Var3.l(true);
                                            break;
                                        } else if (z27Var3.v - z27Var3.u <= na7.q1(i8).k4.N1.f()) {
                                            k27 a2 = f37Var3.a(null);
                                            if (a2 != null) {
                                                if (!z27Var3.w()) {
                                                    o27Var5.e = 0;
                                                    int min = Math.min(na7.q1(i8).k4.N1.f(), bu1.d(a2));
                                                    o27Var5.f = min;
                                                    o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                                    View b6 = f37Var3.b();
                                                    if (b6 instanceof gb2) {
                                                        z27Var3.Z((gb2) b6, o27Var5.e, o27Var5.f);
                                                    }
                                                    if (!z52) {
                                                        f37Var3.s.getSwipeBack().e(f37Var3.J);
                                                    }
                                                    f37Var3.g(true, true);
                                                    break;
                                                } else {
                                                    o27Var5.e = z27Var3.u;
                                                    o27Var5.f = z27Var3.v;
                                                    mib mibVar2 = z27Var3.W;
                                                    o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var3.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                                    l37Var3.b();
                                                    l37Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            f37Var3.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        f37Var3.d0.c(false);
                                        break;
                                    case 4:
                                        f37Var3.d0.c(false);
                                        break;
                                    case 5:
                                        f37Var3.d0.a(true);
                                        break;
                                    case 6:
                                        l37 l37Var4 = f37Var3.d0;
                                        if (!l37Var4.b) {
                                            wr1 wr1Var = (wr1) l37Var4;
                                            wr1Var.a(true);
                                            mu1 mu1Var = wr1Var.I;
                                            mu1Var.F5 = null;
                                            mu1Var.D5 = null;
                                            mu1Var.x5.f(null, null, mu1Var.l6, null);
                                            mu1Var.w6();
                                            break;
                                        } else {
                                            wr1 wr1Var2 = (wr1) l37Var4;
                                            wr1Var2.a(true);
                                            mu1 mu1Var2 = wr1Var2.I;
                                            mu1Var2.D5 = null;
                                            mu1Var2.Rb(mu1Var2.F5);
                                            break;
                                        }
                                    case 7:
                                        f37Var3.d0.c(true);
                                        break;
                                    case 8:
                                        f37Var3.d0.a(true);
                                        break;
                                    case 9:
                                        wr1 wr1Var3 = (wr1) f37Var3.d0;
                                        wr1Var3.a(true);
                                        mu1 mu1Var3 = wr1Var3.I;
                                        mu1Var3.x5.d(null, mu1Var3.l6);
                                        mu1Var3.w6();
                                        break;
                                    case 10:
                                        f37Var3.d0.a(true);
                                        break;
                                    case 11:
                                        wr1 wr1Var4 = (wr1) f37Var3.d0;
                                        wr1Var4.a(true);
                                        mu1 mu1Var4 = wr1Var4.I;
                                        mu1Var4.Y5 = null;
                                        ar1 ar1Var = mu1Var4.a0;
                                        if (ar1Var != null) {
                                            ar1Var.N3 = null;
                                            ar1Var.O3 = false;
                                        }
                                        o27 o27Var6 = mu1Var4.x5;
                                        if (o27Var6 != null) {
                                            i5 = ((d) mu1Var4).currentAccount;
                                            k27 k27Var = mu1Var4.F5;
                                            o27Var6.e(i5, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                        }
                                        mu1Var4.w6();
                                        break;
                                    case 12:
                                        o27 o27Var7 = f37Var3.d0.d;
                                        if (o27Var7.o) {
                                            boolean z6 = !o27Var7.q;
                                            o27Var7.q = z6;
                                            f37Var3.H.a(z6, true);
                                            f37Var3.I.a(o27Var7.q, true);
                                            if (f37Var3.r.e.size() > 0 && (message2 = ((k27) f37Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z7 = o27Var7.q;
                                                messageMedia2.force_small_media = z7;
                                                messageMedia2.force_large_media = !z7;
                                            }
                                            if (f37Var3.r.f.size() > 0 && (message = ((k27) f37Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z8 = o27Var7.q;
                                                messageMedia.force_small_media = z8;
                                                messageMedia.force_large_media = !z8;
                                            }
                                            f37Var3.i();
                                            f37Var3.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        o27 o27Var8 = f37Var3.d0.d;
                                        boolean z9 = o27Var8.r;
                                        o27Var8.r = !z9;
                                        f37Var3.F.a(z9, true);
                                        if (f37Var3.r.e.size() > 0 && (message4 = ((k27) f37Var3.r.e.get(0)).k) != null) {
                                            message4.invert_media = o27Var8.r;
                                        }
                                        if (f37Var3.r.f.size() > 0 && (message3 = ((k27) f37Var3.r.f.get(0)).k) != null) {
                                            message3.invert_media = o27Var8.r;
                                        }
                                        f37Var3.i();
                                        f37Var3.V = true;
                                        break;
                                }
                            }
                        });
                        j.addView(a8Var2, nme.o(-1, 48));
                    }
                    this.J = actionBarPopupWindow$ActionBarPopupWindowLayout.b(j);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z2);
                    FrameLayout frameLayout = new FrameLayout(context3);
                    ?? r122 = obj;
                    y27 y27Var = new y27(context, 1, true, false, l37Var.G, (byte) 0);
                    this.w = y27Var;
                    y27Var.j(k96.M0(z3 ? 2131746237 : 2131745461, r122), R.drawable.menu_select_quote, r122);
                    y27 y27Var2 = new y27(context, 1, true, false, l37Var.G, (byte) 1);
                    context3 = context;
                    this.x = y27Var2;
                    y27Var2.j(k96.M0(2131752060, r122), R.drawable.menu_quote_delete, r122);
                    int i5 = bkb.H5;
                    Drawable Y = bkb.Y(bkb.v0(i5, h37Var), 6, 0);
                    vkb M = zkb.M(i5);
                    frameLayout.setBackground(Y);
                    zkb.j(frameLayout, Y, r122, M, h37Var);
                    final byte b5 = 2;
                    frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                        public final /* synthetic */ f37 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b52 = b5;
                            f37 f37Var3 = this.b;
                            switch (b52) {
                                case 0:
                                    f37Var3.d0.d.d = null;
                                    f37Var3.e.e(false);
                                    f37Var3.g(false, false);
                                    f37Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z27 z27Var2 = f37Var3.e;
                                    l37 l37Var2 = f37Var3.d0;
                                    if (f37Var3.a(null) != null) {
                                        if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                            mib mibVar = z27Var2.W;
                                            k27 a = f37Var3.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                            o27 o27Var4 = l37Var2.d;
                                            int i6 = z27Var2.u;
                                            o27Var4.e = i6;
                                            int i7 = z27Var2.v;
                                            o27Var4.f = i7;
                                            o27Var4.d = bu1.b(i6, i7, a);
                                            l37Var2.b();
                                            l37Var2.a(true);
                                            break;
                                        } else {
                                            f37Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z27 z27Var3 = f37Var3.e;
                                    l37 l37Var3 = f37Var3.d0;
                                    o27 o27Var5 = l37Var3.d;
                                    int i8 = l37Var3.x;
                                    boolean z52 = l37Var3.b;
                                    if (o27Var5.d != null && !z52) {
                                        o27Var5.d = null;
                                        z27Var3.e(false);
                                        f37Var3.g(false, true);
                                        f37Var3.l(true);
                                        break;
                                    } else if (z27Var3.v - z27Var3.u <= na7.q1(i8).k4.N1.f()) {
                                        k27 a2 = f37Var3.a(null);
                                        if (a2 != null) {
                                            if (!z27Var3.w()) {
                                                o27Var5.e = 0;
                                                int min = Math.min(na7.q1(i8).k4.N1.f(), bu1.d(a2));
                                                o27Var5.f = min;
                                                o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                                View b6 = f37Var3.b();
                                                if (b6 instanceof gb2) {
                                                    z27Var3.Z((gb2) b6, o27Var5.e, o27Var5.f);
                                                }
                                                if (!z52) {
                                                    f37Var3.s.getSwipeBack().e(f37Var3.J);
                                                }
                                                f37Var3.g(true, true);
                                                break;
                                            } else {
                                                o27Var5.e = z27Var3.u;
                                                o27Var5.f = z27Var3.v;
                                                mib mibVar2 = z27Var3.W;
                                                o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var3.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                                l37Var3.b();
                                                l37Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f37Var3.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f37Var3.d0.c(false);
                                    break;
                                case 4:
                                    f37Var3.d0.c(false);
                                    break;
                                case 5:
                                    f37Var3.d0.a(true);
                                    break;
                                case 6:
                                    l37 l37Var4 = f37Var3.d0;
                                    if (!l37Var4.b) {
                                        wr1 wr1Var = (wr1) l37Var4;
                                        wr1Var.a(true);
                                        mu1 mu1Var = wr1Var.I;
                                        mu1Var.F5 = null;
                                        mu1Var.D5 = null;
                                        mu1Var.x5.f(null, null, mu1Var.l6, null);
                                        mu1Var.w6();
                                        break;
                                    } else {
                                        wr1 wr1Var2 = (wr1) l37Var4;
                                        wr1Var2.a(true);
                                        mu1 mu1Var2 = wr1Var2.I;
                                        mu1Var2.D5 = null;
                                        mu1Var2.Rb(mu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f37Var3.d0.c(true);
                                    break;
                                case 8:
                                    f37Var3.d0.a(true);
                                    break;
                                case 9:
                                    wr1 wr1Var3 = (wr1) f37Var3.d0;
                                    wr1Var3.a(true);
                                    mu1 mu1Var3 = wr1Var3.I;
                                    mu1Var3.x5.d(null, mu1Var3.l6);
                                    mu1Var3.w6();
                                    break;
                                case 10:
                                    f37Var3.d0.a(true);
                                    break;
                                case 11:
                                    wr1 wr1Var4 = (wr1) f37Var3.d0;
                                    wr1Var4.a(true);
                                    mu1 mu1Var4 = wr1Var4.I;
                                    mu1Var4.Y5 = null;
                                    ar1 ar1Var = mu1Var4.a0;
                                    if (ar1Var != null) {
                                        ar1Var.N3 = null;
                                        ar1Var.O3 = false;
                                    }
                                    o27 o27Var6 = mu1Var4.x5;
                                    if (o27Var6 != null) {
                                        i52 = ((d) mu1Var4).currentAccount;
                                        k27 k27Var = mu1Var4.F5;
                                        o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                    }
                                    mu1Var4.w6();
                                    break;
                                case 12:
                                    o27 o27Var7 = f37Var3.d0.d;
                                    if (o27Var7.o) {
                                        boolean z6 = !o27Var7.q;
                                        o27Var7.q = z6;
                                        f37Var3.H.a(z6, true);
                                        f37Var3.I.a(o27Var7.q, true);
                                        if (f37Var3.r.e.size() > 0 && (message2 = ((k27) f37Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = o27Var7.q;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (f37Var3.r.f.size() > 0 && (message = ((k27) f37Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = o27Var7.q;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        f37Var3.i();
                                        f37Var3.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o27 o27Var8 = f37Var3.d0.d;
                                    boolean z9 = o27Var8.r;
                                    o27Var8.r = !z9;
                                    f37Var3.F.a(z9, true);
                                    if (f37Var3.r.e.size() > 0 && (message4 = ((k27) f37Var3.r.e.get(0)).k) != null) {
                                        message4.invert_media = o27Var8.r;
                                    }
                                    if (f37Var3.r.f.size() > 0 && (message3 = ((k27) f37Var3.r.f.get(0)).k) != null) {
                                        message3.invert_media = o27Var8.r;
                                    }
                                    f37Var3.i();
                                    f37Var3.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout.addView(y27Var, nme.c(48.0f, -1));
                    frameLayout.addView(y27Var2, nme.c(48.0f, -1));
                    i3 = 48;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, nme.o(-1, 48));
                    o27Var = o27Var2;
                    r12 = r122;
                }
                if (!o27Var.t && !z4 && !o27Var.u) {
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    a8 a8Var3 = new a8(1, l37Var.G, context3, false, false);
                    this.y = a8Var3;
                    a8Var3.j(k96.M0(2131746060, r12), R.drawable.msg_forward_replace, r12);
                    final byte b6 = 3;
                    a8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                        public final /* synthetic */ f37 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b52 = b6;
                            f37 f37Var3 = this.b;
                            switch (b52) {
                                case 0:
                                    f37Var3.d0.d.d = null;
                                    f37Var3.e.e(false);
                                    f37Var3.g(false, false);
                                    f37Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z27 z27Var2 = f37Var3.e;
                                    l37 l37Var2 = f37Var3.d0;
                                    if (f37Var3.a(null) != null) {
                                        if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                            mib mibVar = z27Var2.W;
                                            k27 a = f37Var3.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                            o27 o27Var4 = l37Var2.d;
                                            int i6 = z27Var2.u;
                                            o27Var4.e = i6;
                                            int i7 = z27Var2.v;
                                            o27Var4.f = i7;
                                            o27Var4.d = bu1.b(i6, i7, a);
                                            l37Var2.b();
                                            l37Var2.a(true);
                                            break;
                                        } else {
                                            f37Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z27 z27Var3 = f37Var3.e;
                                    l37 l37Var3 = f37Var3.d0;
                                    o27 o27Var5 = l37Var3.d;
                                    int i8 = l37Var3.x;
                                    boolean z52 = l37Var3.b;
                                    if (o27Var5.d != null && !z52) {
                                        o27Var5.d = null;
                                        z27Var3.e(false);
                                        f37Var3.g(false, true);
                                        f37Var3.l(true);
                                        break;
                                    } else if (z27Var3.v - z27Var3.u <= na7.q1(i8).k4.N1.f()) {
                                        k27 a2 = f37Var3.a(null);
                                        if (a2 != null) {
                                            if (!z27Var3.w()) {
                                                o27Var5.e = 0;
                                                int min = Math.min(na7.q1(i8).k4.N1.f(), bu1.d(a2));
                                                o27Var5.f = min;
                                                o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                                View b62 = f37Var3.b();
                                                if (b62 instanceof gb2) {
                                                    z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                                }
                                                if (!z52) {
                                                    f37Var3.s.getSwipeBack().e(f37Var3.J);
                                                }
                                                f37Var3.g(true, true);
                                                break;
                                            } else {
                                                o27Var5.e = z27Var3.u;
                                                o27Var5.f = z27Var3.v;
                                                mib mibVar2 = z27Var3.W;
                                                o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var3.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                                l37Var3.b();
                                                l37Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f37Var3.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f37Var3.d0.c(false);
                                    break;
                                case 4:
                                    f37Var3.d0.c(false);
                                    break;
                                case 5:
                                    f37Var3.d0.a(true);
                                    break;
                                case 6:
                                    l37 l37Var4 = f37Var3.d0;
                                    if (!l37Var4.b) {
                                        wr1 wr1Var = (wr1) l37Var4;
                                        wr1Var.a(true);
                                        mu1 mu1Var = wr1Var.I;
                                        mu1Var.F5 = null;
                                        mu1Var.D5 = null;
                                        mu1Var.x5.f(null, null, mu1Var.l6, null);
                                        mu1Var.w6();
                                        break;
                                    } else {
                                        wr1 wr1Var2 = (wr1) l37Var4;
                                        wr1Var2.a(true);
                                        mu1 mu1Var2 = wr1Var2.I;
                                        mu1Var2.D5 = null;
                                        mu1Var2.Rb(mu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f37Var3.d0.c(true);
                                    break;
                                case 8:
                                    f37Var3.d0.a(true);
                                    break;
                                case 9:
                                    wr1 wr1Var3 = (wr1) f37Var3.d0;
                                    wr1Var3.a(true);
                                    mu1 mu1Var3 = wr1Var3.I;
                                    mu1Var3.x5.d(null, mu1Var3.l6);
                                    mu1Var3.w6();
                                    break;
                                case 10:
                                    f37Var3.d0.a(true);
                                    break;
                                case 11:
                                    wr1 wr1Var4 = (wr1) f37Var3.d0;
                                    wr1Var4.a(true);
                                    mu1 mu1Var4 = wr1Var4.I;
                                    mu1Var4.Y5 = null;
                                    ar1 ar1Var = mu1Var4.a0;
                                    if (ar1Var != null) {
                                        ar1Var.N3 = null;
                                        ar1Var.O3 = false;
                                    }
                                    o27 o27Var6 = mu1Var4.x5;
                                    if (o27Var6 != null) {
                                        i52 = ((d) mu1Var4).currentAccount;
                                        k27 k27Var = mu1Var4.F5;
                                        o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                    }
                                    mu1Var4.w6();
                                    break;
                                case 12:
                                    o27 o27Var7 = f37Var3.d0.d;
                                    if (o27Var7.o) {
                                        boolean z6 = !o27Var7.q;
                                        o27Var7.q = z6;
                                        f37Var3.H.a(z6, true);
                                        f37Var3.I.a(o27Var7.q, true);
                                        if (f37Var3.r.e.size() > 0 && (message2 = ((k27) f37Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = o27Var7.q;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (f37Var3.r.f.size() > 0 && (message = ((k27) f37Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = o27Var7.q;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        f37Var3.i();
                                        f37Var3.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o27 o27Var8 = f37Var3.d0.d;
                                    boolean z9 = o27Var8.r;
                                    o27Var8.r = !z9;
                                    f37Var3.F.a(z9, true);
                                    if (f37Var3.r.e.size() > 0 && (message4 = ((k27) f37Var3.r.e.get(0)).k) != null) {
                                        message4.invert_media = o27Var8.r;
                                    }
                                    if (f37Var3.r.f.size() > 0 && (message3 = ((k27) f37Var3.r.f.get(0)).k) != null) {
                                        message3.invert_media = o27Var8.r;
                                    }
                                    f37Var3.i();
                                    f37Var3.V = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    a8 a8Var4 = new a8(1, l37Var.G, context3, false, false);
                    this.E = a8Var4;
                    a8Var4.j(k96.M0(2131746235, r12), R.drawable.msg_forward_replace, r12);
                    final byte b7 = 4;
                    a8Var4.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                        public final /* synthetic */ f37 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b52 = b7;
                            f37 f37Var3 = this.b;
                            switch (b52) {
                                case 0:
                                    f37Var3.d0.d.d = null;
                                    f37Var3.e.e(false);
                                    f37Var3.g(false, false);
                                    f37Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z27 z27Var2 = f37Var3.e;
                                    l37 l37Var2 = f37Var3.d0;
                                    if (f37Var3.a(null) != null) {
                                        if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                            mib mibVar = z27Var2.W;
                                            k27 a = f37Var3.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                            o27 o27Var4 = l37Var2.d;
                                            int i6 = z27Var2.u;
                                            o27Var4.e = i6;
                                            int i7 = z27Var2.v;
                                            o27Var4.f = i7;
                                            o27Var4.d = bu1.b(i6, i7, a);
                                            l37Var2.b();
                                            l37Var2.a(true);
                                            break;
                                        } else {
                                            f37Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z27 z27Var3 = f37Var3.e;
                                    l37 l37Var3 = f37Var3.d0;
                                    o27 o27Var5 = l37Var3.d;
                                    int i8 = l37Var3.x;
                                    boolean z52 = l37Var3.b;
                                    if (o27Var5.d != null && !z52) {
                                        o27Var5.d = null;
                                        z27Var3.e(false);
                                        f37Var3.g(false, true);
                                        f37Var3.l(true);
                                        break;
                                    } else if (z27Var3.v - z27Var3.u <= na7.q1(i8).k4.N1.f()) {
                                        k27 a2 = f37Var3.a(null);
                                        if (a2 != null) {
                                            if (!z27Var3.w()) {
                                                o27Var5.e = 0;
                                                int min = Math.min(na7.q1(i8).k4.N1.f(), bu1.d(a2));
                                                o27Var5.f = min;
                                                o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                                View b62 = f37Var3.b();
                                                if (b62 instanceof gb2) {
                                                    z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                                }
                                                if (!z52) {
                                                    f37Var3.s.getSwipeBack().e(f37Var3.J);
                                                }
                                                f37Var3.g(true, true);
                                                break;
                                            } else {
                                                o27Var5.e = z27Var3.u;
                                                o27Var5.f = z27Var3.v;
                                                mib mibVar2 = z27Var3.W;
                                                o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var3.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                                l37Var3.b();
                                                l37Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f37Var3.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f37Var3.d0.c(false);
                                    break;
                                case 4:
                                    f37Var3.d0.c(false);
                                    break;
                                case 5:
                                    f37Var3.d0.a(true);
                                    break;
                                case 6:
                                    l37 l37Var4 = f37Var3.d0;
                                    if (!l37Var4.b) {
                                        wr1 wr1Var = (wr1) l37Var4;
                                        wr1Var.a(true);
                                        mu1 mu1Var = wr1Var.I;
                                        mu1Var.F5 = null;
                                        mu1Var.D5 = null;
                                        mu1Var.x5.f(null, null, mu1Var.l6, null);
                                        mu1Var.w6();
                                        break;
                                    } else {
                                        wr1 wr1Var2 = (wr1) l37Var4;
                                        wr1Var2.a(true);
                                        mu1 mu1Var2 = wr1Var2.I;
                                        mu1Var2.D5 = null;
                                        mu1Var2.Rb(mu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f37Var3.d0.c(true);
                                    break;
                                case 8:
                                    f37Var3.d0.a(true);
                                    break;
                                case 9:
                                    wr1 wr1Var3 = (wr1) f37Var3.d0;
                                    wr1Var3.a(true);
                                    mu1 mu1Var3 = wr1Var3.I;
                                    mu1Var3.x5.d(null, mu1Var3.l6);
                                    mu1Var3.w6();
                                    break;
                                case 10:
                                    f37Var3.d0.a(true);
                                    break;
                                case 11:
                                    wr1 wr1Var4 = (wr1) f37Var3.d0;
                                    wr1Var4.a(true);
                                    mu1 mu1Var4 = wr1Var4.I;
                                    mu1Var4.Y5 = null;
                                    ar1 ar1Var = mu1Var4.a0;
                                    if (ar1Var != null) {
                                        ar1Var.N3 = null;
                                        ar1Var.O3 = false;
                                    }
                                    o27 o27Var6 = mu1Var4.x5;
                                    if (o27Var6 != null) {
                                        i52 = ((d) mu1Var4).currentAccount;
                                        k27 k27Var = mu1Var4.F5;
                                        o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                    }
                                    mu1Var4.w6();
                                    break;
                                case 12:
                                    o27 o27Var7 = f37Var3.d0.d;
                                    if (o27Var7.o) {
                                        boolean z6 = !o27Var7.q;
                                        o27Var7.q = z6;
                                        f37Var3.H.a(z6, true);
                                        f37Var3.I.a(o27Var7.q, true);
                                        if (f37Var3.r.e.size() > 0 && (message2 = ((k27) f37Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = o27Var7.q;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (f37Var3.r.f.size() > 0 && (message = ((k27) f37Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = o27Var7.q;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        f37Var3.i();
                                        f37Var3.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o27 o27Var8 = f37Var3.d0.d;
                                    boolean z9 = o27Var8.r;
                                    o27Var8.r = !z9;
                                    f37Var3.F.a(z9, true);
                                    if (f37Var3.r.e.size() > 0 && (message4 = ((k27) f37Var3.r.e.get(0)).k) != null) {
                                        message4.invert_media = o27Var8.r;
                                    }
                                    if (f37Var3.r.f.size() > 0 && (message3 = ((k27) f37Var3.r.f.get(0)).k) != null) {
                                        message3.invert_media = o27Var8.r;
                                    }
                                    f37Var3.i();
                                    f37Var3.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView(a8Var4, nme.c(48.0f, -1));
                    frameLayout2.addView(a8Var3, nme.c(48.0f, -1));
                    i3 = 48;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, nme.o(-1, 48));
                }
                if (!z4 && !o27Var.u) {
                    View j8Var2 = new j8(context3, h37Var);
                    zkb.i(j8Var2, zkb.K(0.06f, bkb.D8), h37Var);
                    j8Var2.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var2, nme.o(-1, 8));
                }
                g(o27Var.d != null, false);
                int i6 = i3;
                a8 a8Var5 = new a8(1, l37Var.G, context3, false, false);
                a8Var5.j(k96.M0(2131754215, r12), R.drawable.msg_select, r12);
                final byte b8 = 5;
                a8Var5.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                    public final /* synthetic */ f37 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i52;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        byte b52 = b8;
                        f37 f37Var3 = this.b;
                        switch (b52) {
                            case 0:
                                f37Var3.d0.d.d = null;
                                f37Var3.e.e(false);
                                f37Var3.g(false, false);
                                f37Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                z27 z27Var2 = f37Var3.e;
                                l37 l37Var2 = f37Var3.d0;
                                if (f37Var3.a(null) != null) {
                                    if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                        mib mibVar = z27Var2.W;
                                        k27 a = f37Var3.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                        o27 o27Var4 = l37Var2.d;
                                        int i62 = z27Var2.u;
                                        o27Var4.e = i62;
                                        int i7 = z27Var2.v;
                                        o27Var4.f = i7;
                                        o27Var4.d = bu1.b(i62, i7, a);
                                        l37Var2.b();
                                        l37Var2.a(true);
                                        break;
                                    } else {
                                        f37Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                z27 z27Var3 = f37Var3.e;
                                l37 l37Var3 = f37Var3.d0;
                                o27 o27Var5 = l37Var3.d;
                                int i8 = l37Var3.x;
                                boolean z52 = l37Var3.b;
                                if (o27Var5.d != null && !z52) {
                                    o27Var5.d = null;
                                    z27Var3.e(false);
                                    f37Var3.g(false, true);
                                    f37Var3.l(true);
                                    break;
                                } else if (z27Var3.v - z27Var3.u <= na7.q1(i8).k4.N1.f()) {
                                    k27 a2 = f37Var3.a(null);
                                    if (a2 != null) {
                                        if (!z27Var3.w()) {
                                            o27Var5.e = 0;
                                            int min = Math.min(na7.q1(i8).k4.N1.f(), bu1.d(a2));
                                            o27Var5.f = min;
                                            o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                            View b62 = f37Var3.b();
                                            if (b62 instanceof gb2) {
                                                z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                            }
                                            if (!z52) {
                                                f37Var3.s.getSwipeBack().e(f37Var3.J);
                                            }
                                            f37Var3.g(true, true);
                                            break;
                                        } else {
                                            o27Var5.e = z27Var3.u;
                                            o27Var5.f = z27Var3.v;
                                            mib mibVar2 = z27Var3.W;
                                            o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var3.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                            l37Var3.b();
                                            l37Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    f37Var3.f();
                                    break;
                                }
                                break;
                            case 3:
                                f37Var3.d0.c(false);
                                break;
                            case 4:
                                f37Var3.d0.c(false);
                                break;
                            case 5:
                                f37Var3.d0.a(true);
                                break;
                            case 6:
                                l37 l37Var4 = f37Var3.d0;
                                if (!l37Var4.b) {
                                    wr1 wr1Var = (wr1) l37Var4;
                                    wr1Var.a(true);
                                    mu1 mu1Var = wr1Var.I;
                                    mu1Var.F5 = null;
                                    mu1Var.D5 = null;
                                    mu1Var.x5.f(null, null, mu1Var.l6, null);
                                    mu1Var.w6();
                                    break;
                                } else {
                                    wr1 wr1Var2 = (wr1) l37Var4;
                                    wr1Var2.a(true);
                                    mu1 mu1Var2 = wr1Var2.I;
                                    mu1Var2.D5 = null;
                                    mu1Var2.Rb(mu1Var2.F5);
                                    break;
                                }
                            case 7:
                                f37Var3.d0.c(true);
                                break;
                            case 8:
                                f37Var3.d0.a(true);
                                break;
                            case 9:
                                wr1 wr1Var3 = (wr1) f37Var3.d0;
                                wr1Var3.a(true);
                                mu1 mu1Var3 = wr1Var3.I;
                                mu1Var3.x5.d(null, mu1Var3.l6);
                                mu1Var3.w6();
                                break;
                            case 10:
                                f37Var3.d0.a(true);
                                break;
                            case 11:
                                wr1 wr1Var4 = (wr1) f37Var3.d0;
                                wr1Var4.a(true);
                                mu1 mu1Var4 = wr1Var4.I;
                                mu1Var4.Y5 = null;
                                ar1 ar1Var = mu1Var4.a0;
                                if (ar1Var != null) {
                                    ar1Var.N3 = null;
                                    ar1Var.O3 = false;
                                }
                                o27 o27Var6 = mu1Var4.x5;
                                if (o27Var6 != null) {
                                    i52 = ((d) mu1Var4).currentAccount;
                                    k27 k27Var = mu1Var4.F5;
                                    o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                }
                                mu1Var4.w6();
                                break;
                            case 12:
                                o27 o27Var7 = f37Var3.d0.d;
                                if (o27Var7.o) {
                                    boolean z6 = !o27Var7.q;
                                    o27Var7.q = z6;
                                    f37Var3.H.a(z6, true);
                                    f37Var3.I.a(o27Var7.q, true);
                                    if (f37Var3.r.e.size() > 0 && (message2 = ((k27) f37Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z7 = o27Var7.q;
                                        messageMedia2.force_small_media = z7;
                                        messageMedia2.force_large_media = !z7;
                                    }
                                    if (f37Var3.r.f.size() > 0 && (message = ((k27) f37Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z8 = o27Var7.q;
                                        messageMedia.force_small_media = z8;
                                        messageMedia.force_large_media = !z8;
                                    }
                                    f37Var3.i();
                                    f37Var3.V = true;
                                    break;
                                }
                                break;
                            default:
                                o27 o27Var8 = f37Var3.d0.d;
                                boolean z9 = o27Var8.r;
                                o27Var8.r = !z9;
                                f37Var3.F.a(z9, true);
                                if (f37Var3.r.e.size() > 0 && (message4 = ((k27) f37Var3.r.e.get(0)).k) != null) {
                                    message4.invert_media = o27Var8.r;
                                }
                                if (f37Var3.r.f.size() > 0 && (message3 = ((k27) f37Var3.r.f.get(0)).k) != null) {
                                    message3.invert_media = o27Var8.r;
                                }
                                f37Var3.i();
                                f37Var3.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var5, nme.o(-1, i6));
                a8 a8Var6 = new a8(1, l37Var.G, context, false, true);
                a8Var6.j(k96.M0(z3 ? 2131751348 : 2131751347, r12), R.drawable.msg_delete, r12);
                int i7 = bkb.p7;
                int i8 = bkb.o7;
                a8Var6.c(i7, i8);
                a8Var6.h(0.12f, i8);
                final byte b9 = 6;
                a8Var6.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                    public final /* synthetic */ f37 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i52;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        byte b52 = b9;
                        f37 f37Var3 = this.b;
                        switch (b52) {
                            case 0:
                                f37Var3.d0.d.d = null;
                                f37Var3.e.e(false);
                                f37Var3.g(false, false);
                                f37Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                z27 z27Var2 = f37Var3.e;
                                l37 l37Var2 = f37Var3.d0;
                                if (f37Var3.a(null) != null) {
                                    if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                        mib mibVar = z27Var2.W;
                                        k27 a = f37Var3.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                        o27 o27Var4 = l37Var2.d;
                                        int i62 = z27Var2.u;
                                        o27Var4.e = i62;
                                        int i72 = z27Var2.v;
                                        o27Var4.f = i72;
                                        o27Var4.d = bu1.b(i62, i72, a);
                                        l37Var2.b();
                                        l37Var2.a(true);
                                        break;
                                    } else {
                                        f37Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                z27 z27Var3 = f37Var3.e;
                                l37 l37Var3 = f37Var3.d0;
                                o27 o27Var5 = l37Var3.d;
                                int i82 = l37Var3.x;
                                boolean z52 = l37Var3.b;
                                if (o27Var5.d != null && !z52) {
                                    o27Var5.d = null;
                                    z27Var3.e(false);
                                    f37Var3.g(false, true);
                                    f37Var3.l(true);
                                    break;
                                } else if (z27Var3.v - z27Var3.u <= na7.q1(i82).k4.N1.f()) {
                                    k27 a2 = f37Var3.a(null);
                                    if (a2 != null) {
                                        if (!z27Var3.w()) {
                                            o27Var5.e = 0;
                                            int min = Math.min(na7.q1(i82).k4.N1.f(), bu1.d(a2));
                                            o27Var5.f = min;
                                            o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                            View b62 = f37Var3.b();
                                            if (b62 instanceof gb2) {
                                                z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                            }
                                            if (!z52) {
                                                f37Var3.s.getSwipeBack().e(f37Var3.J);
                                            }
                                            f37Var3.g(true, true);
                                            break;
                                        } else {
                                            o27Var5.e = z27Var3.u;
                                            o27Var5.f = z27Var3.v;
                                            mib mibVar2 = z27Var3.W;
                                            o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var3.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                            l37Var3.b();
                                            l37Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    f37Var3.f();
                                    break;
                                }
                                break;
                            case 3:
                                f37Var3.d0.c(false);
                                break;
                            case 4:
                                f37Var3.d0.c(false);
                                break;
                            case 5:
                                f37Var3.d0.a(true);
                                break;
                            case 6:
                                l37 l37Var4 = f37Var3.d0;
                                if (!l37Var4.b) {
                                    wr1 wr1Var = (wr1) l37Var4;
                                    wr1Var.a(true);
                                    mu1 mu1Var = wr1Var.I;
                                    mu1Var.F5 = null;
                                    mu1Var.D5 = null;
                                    mu1Var.x5.f(null, null, mu1Var.l6, null);
                                    mu1Var.w6();
                                    break;
                                } else {
                                    wr1 wr1Var2 = (wr1) l37Var4;
                                    wr1Var2.a(true);
                                    mu1 mu1Var2 = wr1Var2.I;
                                    mu1Var2.D5 = null;
                                    mu1Var2.Rb(mu1Var2.F5);
                                    break;
                                }
                            case 7:
                                f37Var3.d0.c(true);
                                break;
                            case 8:
                                f37Var3.d0.a(true);
                                break;
                            case 9:
                                wr1 wr1Var3 = (wr1) f37Var3.d0;
                                wr1Var3.a(true);
                                mu1 mu1Var3 = wr1Var3.I;
                                mu1Var3.x5.d(null, mu1Var3.l6);
                                mu1Var3.w6();
                                break;
                            case 10:
                                f37Var3.d0.a(true);
                                break;
                            case 11:
                                wr1 wr1Var4 = (wr1) f37Var3.d0;
                                wr1Var4.a(true);
                                mu1 mu1Var4 = wr1Var4.I;
                                mu1Var4.Y5 = null;
                                ar1 ar1Var = mu1Var4.a0;
                                if (ar1Var != null) {
                                    ar1Var.N3 = null;
                                    ar1Var.O3 = false;
                                }
                                o27 o27Var6 = mu1Var4.x5;
                                if (o27Var6 != null) {
                                    i52 = ((d) mu1Var4).currentAccount;
                                    k27 k27Var = mu1Var4.F5;
                                    o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                }
                                mu1Var4.w6();
                                break;
                            case 12:
                                o27 o27Var7 = f37Var3.d0.d;
                                if (o27Var7.o) {
                                    boolean z6 = !o27Var7.q;
                                    o27Var7.q = z6;
                                    f37Var3.H.a(z6, true);
                                    f37Var3.I.a(o27Var7.q, true);
                                    if (f37Var3.r.e.size() > 0 && (message2 = ((k27) f37Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z7 = o27Var7.q;
                                        messageMedia2.force_small_media = z7;
                                        messageMedia2.force_large_media = !z7;
                                    }
                                    if (f37Var3.r.f.size() > 0 && (message = ((k27) f37Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z8 = o27Var7.q;
                                        messageMedia.force_small_media = z8;
                                        messageMedia.force_large_media = !z8;
                                    }
                                    f37Var3.i();
                                    f37Var3.V = true;
                                    break;
                                }
                                break;
                            default:
                                o27 o27Var8 = f37Var3.d0.d;
                                boolean z9 = o27Var8.r;
                                o27Var8.r = !z9;
                                f37Var3.F.a(z9, true);
                                if (f37Var3.r.e.size() > 0 && (message4 = ((k27) f37Var3.r.e.get(0)).k) != null) {
                                    message4.invert_media = o27Var8.r;
                                }
                                if (f37Var3.r.f.size() > 0 && (message3 = ((k27) f37Var3.r.f.get(0)).k) != null) {
                                    message3.invert_media = o27Var8.r;
                                }
                                f37Var3.i();
                                f37Var3.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var6, nme.o(-1, i6));
                context2 = context;
                f37Var2 = this;
                viewOutlineProvider = r12;
                i2 = f37Var2.a;
                if (i2 == 1) {
                    f37Var2.r = o27Var.b;
                } else if (i2 == 0) {
                    f37Var2.r = o27Var.a;
                } else if (i2 == 2) {
                    f37Var2.r = o27Var.c;
                }
                m = f37Var2.e.m(context2);
                f37Var2.d = m;
                m.setElevation(gl.L(8.0f));
                m.setOutlineProvider(viewOutlineProvider);
                if (m.getParent() instanceof ViewGroup) {
                    ((ViewGroup) m.getParent()).removeView(m);
                }
                f37Var2.addView(m, nme.d(-1, -1.0f, 51, 0.0f, a.getCurrentActionBarHeight() / gl.p, 0.0f, 0.0f));
                f37Var2.e.Q(f37Var2.f);
            }
        }
        o27Var = o27Var3;
        viewOutlineProvider = null;
        viewOutlineProvider = null;
        final byte b10 = 8;
        if (i != 1 || o27Var.b == null) {
            final f37 f37Var3 = this;
            f37Var = f37Var3;
            if (i == 2) {
                f37Var = f37Var3;
                if (o27Var.c != null) {
                    k37 k37Var3 = new k37(context, R.raw.position_below, k96.M0(2131748735, null), R.raw.position_above, k96.M0(2131748731, null), l37Var.G);
                    f37Var3.F = k37Var3;
                    k37Var3.a(!o27Var.r, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(k37Var3, nme.o(-1, 48));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    f37Var3.G = frameLayout3;
                    int i9 = bkb.H5;
                    ff0 Y2 = bkb.Y(bkb.v0(i9, h37Var), 0, 0);
                    vkb M2 = zkb.M(i9);
                    frameLayout3.setBackground(Y2);
                    zkb.j(frameLayout3, Y2, null, M2, h37Var);
                    k37 k37Var4 = new k37(context, R.raw.media_shrink, k96.M0(2131748707, null), R.raw.media_enlarge, k96.M0(2131748706, null), l37Var.G);
                    f37Var3.H = k37Var4;
                    k37Var4.setBackground(null);
                    k37Var4.setVisibility(o27Var.p ? 4 : 0);
                    frameLayout3.addView(k37Var4, nme.o(-1, 48));
                    k37 k37Var5 = new k37(context, R.raw.media_shrink, k96.M0(2131748693, null), R.raw.media_enlarge, k96.M0(2131748692, null), l37Var.G);
                    f37Var3.I = k37Var5;
                    k37Var5.setBackground(null);
                    k37Var5.setVisibility(!o27Var.p ? 4 : 0);
                    frameLayout3.setAlpha(o27Var.o ? 1.0f : 0.5f);
                    frameLayout3.addView(k37Var5, nme.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, nme.o(-1, 48));
                    frameLayout3.setVisibility((!o27Var.n || o27Var.o) ? 0 : 8);
                    k37Var4.a(o27Var.q, false);
                    k37Var5.a(o27Var.q, false);
                    View j8Var3 = new j8(context, h37Var);
                    zkb.i(j8Var3, zkb.K(0.06f, bkb.D8), h37Var);
                    j8Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var3, nme.o(-1, 8));
                    a8 a8Var7 = new a8(1, l37Var.G, context, false, false);
                    a8Var7.j(k96.M0(2131754215, null), R.drawable.msg_select, null);
                    final byte b11 = 10;
                    a8Var7.setOnClickListener(new View.OnClickListener(f37Var3) { // from class: t27
                        public final /* synthetic */ f37 b;

                        {
                            this.b = f37Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b52 = b11;
                            f37 f37Var32 = this.b;
                            switch (b52) {
                                case 0:
                                    f37Var32.d0.d.d = null;
                                    f37Var32.e.e(false);
                                    f37Var32.g(false, false);
                                    f37Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z27 z27Var2 = f37Var32.e;
                                    l37 l37Var2 = f37Var32.d0;
                                    if (f37Var32.a(null) != null) {
                                        if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                            mib mibVar = z27Var2.W;
                                            k27 a = f37Var32.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                            o27 o27Var4 = l37Var2.d;
                                            int i62 = z27Var2.u;
                                            o27Var4.e = i62;
                                            int i72 = z27Var2.v;
                                            o27Var4.f = i72;
                                            o27Var4.d = bu1.b(i62, i72, a);
                                            l37Var2.b();
                                            l37Var2.a(true);
                                            break;
                                        } else {
                                            f37Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z27 z27Var3 = f37Var32.e;
                                    l37 l37Var3 = f37Var32.d0;
                                    o27 o27Var5 = l37Var3.d;
                                    int i82 = l37Var3.x;
                                    boolean z52 = l37Var3.b;
                                    if (o27Var5.d != null && !z52) {
                                        o27Var5.d = null;
                                        z27Var3.e(false);
                                        f37Var32.g(false, true);
                                        f37Var32.l(true);
                                        break;
                                    } else if (z27Var3.v - z27Var3.u <= na7.q1(i82).k4.N1.f()) {
                                        k27 a2 = f37Var32.a(null);
                                        if (a2 != null) {
                                            if (!z27Var3.w()) {
                                                o27Var5.e = 0;
                                                int min = Math.min(na7.q1(i82).k4.N1.f(), bu1.d(a2));
                                                o27Var5.f = min;
                                                o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                                View b62 = f37Var32.b();
                                                if (b62 instanceof gb2) {
                                                    z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                                }
                                                if (!z52) {
                                                    f37Var32.s.getSwipeBack().e(f37Var32.J);
                                                }
                                                f37Var32.g(true, true);
                                                break;
                                            } else {
                                                o27Var5.e = z27Var3.u;
                                                o27Var5.f = z27Var3.v;
                                                mib mibVar2 = z27Var3.W;
                                                o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var32.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                                l37Var3.b();
                                                l37Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f37Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f37Var32.d0.c(false);
                                    break;
                                case 4:
                                    f37Var32.d0.c(false);
                                    break;
                                case 5:
                                    f37Var32.d0.a(true);
                                    break;
                                case 6:
                                    l37 l37Var4 = f37Var32.d0;
                                    if (!l37Var4.b) {
                                        wr1 wr1Var = (wr1) l37Var4;
                                        wr1Var.a(true);
                                        mu1 mu1Var = wr1Var.I;
                                        mu1Var.F5 = null;
                                        mu1Var.D5 = null;
                                        mu1Var.x5.f(null, null, mu1Var.l6, null);
                                        mu1Var.w6();
                                        break;
                                    } else {
                                        wr1 wr1Var2 = (wr1) l37Var4;
                                        wr1Var2.a(true);
                                        mu1 mu1Var2 = wr1Var2.I;
                                        mu1Var2.D5 = null;
                                        mu1Var2.Rb(mu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f37Var32.d0.c(true);
                                    break;
                                case 8:
                                    f37Var32.d0.a(true);
                                    break;
                                case 9:
                                    wr1 wr1Var3 = (wr1) f37Var32.d0;
                                    wr1Var3.a(true);
                                    mu1 mu1Var3 = wr1Var3.I;
                                    mu1Var3.x5.d(null, mu1Var3.l6);
                                    mu1Var3.w6();
                                    break;
                                case 10:
                                    f37Var32.d0.a(true);
                                    break;
                                case 11:
                                    wr1 wr1Var4 = (wr1) f37Var32.d0;
                                    wr1Var4.a(true);
                                    mu1 mu1Var4 = wr1Var4.I;
                                    mu1Var4.Y5 = null;
                                    ar1 ar1Var = mu1Var4.a0;
                                    if (ar1Var != null) {
                                        ar1Var.N3 = null;
                                        ar1Var.O3 = false;
                                    }
                                    o27 o27Var6 = mu1Var4.x5;
                                    if (o27Var6 != null) {
                                        i52 = ((d) mu1Var4).currentAccount;
                                        k27 k27Var = mu1Var4.F5;
                                        o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                    }
                                    mu1Var4.w6();
                                    break;
                                case 12:
                                    o27 o27Var7 = f37Var32.d0.d;
                                    if (o27Var7.o) {
                                        boolean z6 = !o27Var7.q;
                                        o27Var7.q = z6;
                                        f37Var32.H.a(z6, true);
                                        f37Var32.I.a(o27Var7.q, true);
                                        if (f37Var32.r.e.size() > 0 && (message2 = ((k27) f37Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = o27Var7.q;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (f37Var32.r.f.size() > 0 && (message = ((k27) f37Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = o27Var7.q;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        f37Var32.i();
                                        f37Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o27 o27Var8 = f37Var32.d0.d;
                                    boolean z9 = o27Var8.r;
                                    o27Var8.r = !z9;
                                    f37Var32.F.a(z9, true);
                                    if (f37Var32.r.e.size() > 0 && (message4 = ((k27) f37Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = o27Var8.r;
                                    }
                                    if (f37Var32.r.f.size() > 0 && (message3 = ((k27) f37Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = o27Var8.r;
                                    }
                                    f37Var32.i();
                                    f37Var32.V = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var7, nme.o(-1, 48));
                    a8 a8Var8 = new a8(1, l37Var.G, context, false, true);
                    context2 = context;
                    a8Var8.j(k96.M0(2131751349, null), R.drawable.msg_delete, null);
                    int i10 = bkb.p7;
                    int i11 = bkb.o7;
                    a8Var8.c(i10, i11);
                    final byte b12 = 11;
                    a8Var8.setOnClickListener(new View.OnClickListener(f37Var3) { // from class: t27
                        public final /* synthetic */ f37 b;

                        {
                            this.b = f37Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b52 = b12;
                            f37 f37Var32 = this.b;
                            switch (b52) {
                                case 0:
                                    f37Var32.d0.d.d = null;
                                    f37Var32.e.e(false);
                                    f37Var32.g(false, false);
                                    f37Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z27 z27Var2 = f37Var32.e;
                                    l37 l37Var2 = f37Var32.d0;
                                    if (f37Var32.a(null) != null) {
                                        if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                            mib mibVar = z27Var2.W;
                                            k27 a = f37Var32.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                            o27 o27Var4 = l37Var2.d;
                                            int i62 = z27Var2.u;
                                            o27Var4.e = i62;
                                            int i72 = z27Var2.v;
                                            o27Var4.f = i72;
                                            o27Var4.d = bu1.b(i62, i72, a);
                                            l37Var2.b();
                                            l37Var2.a(true);
                                            break;
                                        } else {
                                            f37Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z27 z27Var3 = f37Var32.e;
                                    l37 l37Var3 = f37Var32.d0;
                                    o27 o27Var5 = l37Var3.d;
                                    int i82 = l37Var3.x;
                                    boolean z52 = l37Var3.b;
                                    if (o27Var5.d != null && !z52) {
                                        o27Var5.d = null;
                                        z27Var3.e(false);
                                        f37Var32.g(false, true);
                                        f37Var32.l(true);
                                        break;
                                    } else if (z27Var3.v - z27Var3.u <= na7.q1(i82).k4.N1.f()) {
                                        k27 a2 = f37Var32.a(null);
                                        if (a2 != null) {
                                            if (!z27Var3.w()) {
                                                o27Var5.e = 0;
                                                int min = Math.min(na7.q1(i82).k4.N1.f(), bu1.d(a2));
                                                o27Var5.f = min;
                                                o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                                View b62 = f37Var32.b();
                                                if (b62 instanceof gb2) {
                                                    z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                                }
                                                if (!z52) {
                                                    f37Var32.s.getSwipeBack().e(f37Var32.J);
                                                }
                                                f37Var32.g(true, true);
                                                break;
                                            } else {
                                                o27Var5.e = z27Var3.u;
                                                o27Var5.f = z27Var3.v;
                                                mib mibVar2 = z27Var3.W;
                                                o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var32.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                                l37Var3.b();
                                                l37Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f37Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f37Var32.d0.c(false);
                                    break;
                                case 4:
                                    f37Var32.d0.c(false);
                                    break;
                                case 5:
                                    f37Var32.d0.a(true);
                                    break;
                                case 6:
                                    l37 l37Var4 = f37Var32.d0;
                                    if (!l37Var4.b) {
                                        wr1 wr1Var = (wr1) l37Var4;
                                        wr1Var.a(true);
                                        mu1 mu1Var = wr1Var.I;
                                        mu1Var.F5 = null;
                                        mu1Var.D5 = null;
                                        mu1Var.x5.f(null, null, mu1Var.l6, null);
                                        mu1Var.w6();
                                        break;
                                    } else {
                                        wr1 wr1Var2 = (wr1) l37Var4;
                                        wr1Var2.a(true);
                                        mu1 mu1Var2 = wr1Var2.I;
                                        mu1Var2.D5 = null;
                                        mu1Var2.Rb(mu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f37Var32.d0.c(true);
                                    break;
                                case 8:
                                    f37Var32.d0.a(true);
                                    break;
                                case 9:
                                    wr1 wr1Var3 = (wr1) f37Var32.d0;
                                    wr1Var3.a(true);
                                    mu1 mu1Var3 = wr1Var3.I;
                                    mu1Var3.x5.d(null, mu1Var3.l6);
                                    mu1Var3.w6();
                                    break;
                                case 10:
                                    f37Var32.d0.a(true);
                                    break;
                                case 11:
                                    wr1 wr1Var4 = (wr1) f37Var32.d0;
                                    wr1Var4.a(true);
                                    mu1 mu1Var4 = wr1Var4.I;
                                    mu1Var4.Y5 = null;
                                    ar1 ar1Var = mu1Var4.a0;
                                    if (ar1Var != null) {
                                        ar1Var.N3 = null;
                                        ar1Var.O3 = false;
                                    }
                                    o27 o27Var6 = mu1Var4.x5;
                                    if (o27Var6 != null) {
                                        i52 = ((d) mu1Var4).currentAccount;
                                        k27 k27Var = mu1Var4.F5;
                                        o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                    }
                                    mu1Var4.w6();
                                    break;
                                case 12:
                                    o27 o27Var7 = f37Var32.d0.d;
                                    if (o27Var7.o) {
                                        boolean z6 = !o27Var7.q;
                                        o27Var7.q = z6;
                                        f37Var32.H.a(z6, true);
                                        f37Var32.I.a(o27Var7.q, true);
                                        if (f37Var32.r.e.size() > 0 && (message2 = ((k27) f37Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = o27Var7.q;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (f37Var32.r.f.size() > 0 && (message = ((k27) f37Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = o27Var7.q;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        f37Var32.i();
                                        f37Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o27 o27Var8 = f37Var32.d0.d;
                                    boolean z9 = o27Var8.r;
                                    o27Var8.r = !z9;
                                    f37Var32.F.a(z9, true);
                                    if (f37Var32.r.e.size() > 0 && (message4 = ((k27) f37Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = o27Var8.r;
                                    }
                                    if (f37Var32.r.f.size() > 0 && (message3 = ((k27) f37Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = o27Var8.r;
                                    }
                                    f37Var32.i();
                                    f37Var32.V = true;
                                    break;
                            }
                        }
                    });
                    a8Var8.h(0.12f, i11);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var8, nme.o(-1, 48));
                    final byte b13 = 12;
                    frameLayout3.setOnClickListener(new View.OnClickListener(f37Var3) { // from class: t27
                        public final /* synthetic */ f37 b;

                        {
                            this.b = f37Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b52 = b13;
                            f37 f37Var32 = this.b;
                            switch (b52) {
                                case 0:
                                    f37Var32.d0.d.d = null;
                                    f37Var32.e.e(false);
                                    f37Var32.g(false, false);
                                    f37Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z27 z27Var2 = f37Var32.e;
                                    l37 l37Var2 = f37Var32.d0;
                                    if (f37Var32.a(null) != null) {
                                        if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                            mib mibVar = z27Var2.W;
                                            k27 a = f37Var32.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                            o27 o27Var4 = l37Var2.d;
                                            int i62 = z27Var2.u;
                                            o27Var4.e = i62;
                                            int i72 = z27Var2.v;
                                            o27Var4.f = i72;
                                            o27Var4.d = bu1.b(i62, i72, a);
                                            l37Var2.b();
                                            l37Var2.a(true);
                                            break;
                                        } else {
                                            f37Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z27 z27Var3 = f37Var32.e;
                                    l37 l37Var3 = f37Var32.d0;
                                    o27 o27Var5 = l37Var3.d;
                                    int i82 = l37Var3.x;
                                    boolean z52 = l37Var3.b;
                                    if (o27Var5.d != null && !z52) {
                                        o27Var5.d = null;
                                        z27Var3.e(false);
                                        f37Var32.g(false, true);
                                        f37Var32.l(true);
                                        break;
                                    } else if (z27Var3.v - z27Var3.u <= na7.q1(i82).k4.N1.f()) {
                                        k27 a2 = f37Var32.a(null);
                                        if (a2 != null) {
                                            if (!z27Var3.w()) {
                                                o27Var5.e = 0;
                                                int min = Math.min(na7.q1(i82).k4.N1.f(), bu1.d(a2));
                                                o27Var5.f = min;
                                                o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                                View b62 = f37Var32.b();
                                                if (b62 instanceof gb2) {
                                                    z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                                }
                                                if (!z52) {
                                                    f37Var32.s.getSwipeBack().e(f37Var32.J);
                                                }
                                                f37Var32.g(true, true);
                                                break;
                                            } else {
                                                o27Var5.e = z27Var3.u;
                                                o27Var5.f = z27Var3.v;
                                                mib mibVar2 = z27Var3.W;
                                                o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var32.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                                l37Var3.b();
                                                l37Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f37Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f37Var32.d0.c(false);
                                    break;
                                case 4:
                                    f37Var32.d0.c(false);
                                    break;
                                case 5:
                                    f37Var32.d0.a(true);
                                    break;
                                case 6:
                                    l37 l37Var4 = f37Var32.d0;
                                    if (!l37Var4.b) {
                                        wr1 wr1Var = (wr1) l37Var4;
                                        wr1Var.a(true);
                                        mu1 mu1Var = wr1Var.I;
                                        mu1Var.F5 = null;
                                        mu1Var.D5 = null;
                                        mu1Var.x5.f(null, null, mu1Var.l6, null);
                                        mu1Var.w6();
                                        break;
                                    } else {
                                        wr1 wr1Var2 = (wr1) l37Var4;
                                        wr1Var2.a(true);
                                        mu1 mu1Var2 = wr1Var2.I;
                                        mu1Var2.D5 = null;
                                        mu1Var2.Rb(mu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f37Var32.d0.c(true);
                                    break;
                                case 8:
                                    f37Var32.d0.a(true);
                                    break;
                                case 9:
                                    wr1 wr1Var3 = (wr1) f37Var32.d0;
                                    wr1Var3.a(true);
                                    mu1 mu1Var3 = wr1Var3.I;
                                    mu1Var3.x5.d(null, mu1Var3.l6);
                                    mu1Var3.w6();
                                    break;
                                case 10:
                                    f37Var32.d0.a(true);
                                    break;
                                case 11:
                                    wr1 wr1Var4 = (wr1) f37Var32.d0;
                                    wr1Var4.a(true);
                                    mu1 mu1Var4 = wr1Var4.I;
                                    mu1Var4.Y5 = null;
                                    ar1 ar1Var = mu1Var4.a0;
                                    if (ar1Var != null) {
                                        ar1Var.N3 = null;
                                        ar1Var.O3 = false;
                                    }
                                    o27 o27Var6 = mu1Var4.x5;
                                    if (o27Var6 != null) {
                                        i52 = ((d) mu1Var4).currentAccount;
                                        k27 k27Var = mu1Var4.F5;
                                        o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                    }
                                    mu1Var4.w6();
                                    break;
                                case 12:
                                    o27 o27Var7 = f37Var32.d0.d;
                                    if (o27Var7.o) {
                                        boolean z6 = !o27Var7.q;
                                        o27Var7.q = z6;
                                        f37Var32.H.a(z6, true);
                                        f37Var32.I.a(o27Var7.q, true);
                                        if (f37Var32.r.e.size() > 0 && (message2 = ((k27) f37Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = o27Var7.q;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (f37Var32.r.f.size() > 0 && (message = ((k27) f37Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = o27Var7.q;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        f37Var32.i();
                                        f37Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o27 o27Var8 = f37Var32.d0.d;
                                    boolean z9 = o27Var8.r;
                                    o27Var8.r = !z9;
                                    f37Var32.F.a(z9, true);
                                    if (f37Var32.r.e.size() > 0 && (message4 = ((k27) f37Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = o27Var8.r;
                                    }
                                    if (f37Var32.r.f.size() > 0 && (message3 = ((k27) f37Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = o27Var8.r;
                                    }
                                    f37Var32.i();
                                    f37Var32.V = true;
                                    break;
                            }
                        }
                    });
                    final byte b14 = 13;
                    k37Var3.setOnClickListener(new View.OnClickListener(f37Var3) { // from class: t27
                        public final /* synthetic */ f37 b;

                        {
                            this.b = f37Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i52;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b52 = b14;
                            f37 f37Var32 = this.b;
                            switch (b52) {
                                case 0:
                                    f37Var32.d0.d.d = null;
                                    f37Var32.e.e(false);
                                    f37Var32.g(false, false);
                                    f37Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z27 z27Var2 = f37Var32.e;
                                    l37 l37Var2 = f37Var32.d0;
                                    if (f37Var32.a(null) != null) {
                                        if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                            mib mibVar = z27Var2.W;
                                            k27 a = f37Var32.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                            o27 o27Var4 = l37Var2.d;
                                            int i62 = z27Var2.u;
                                            o27Var4.e = i62;
                                            int i72 = z27Var2.v;
                                            o27Var4.f = i72;
                                            o27Var4.d = bu1.b(i62, i72, a);
                                            l37Var2.b();
                                            l37Var2.a(true);
                                            break;
                                        } else {
                                            f37Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z27 z27Var3 = f37Var32.e;
                                    l37 l37Var3 = f37Var32.d0;
                                    o27 o27Var5 = l37Var3.d;
                                    int i82 = l37Var3.x;
                                    boolean z52 = l37Var3.b;
                                    if (o27Var5.d != null && !z52) {
                                        o27Var5.d = null;
                                        z27Var3.e(false);
                                        f37Var32.g(false, true);
                                        f37Var32.l(true);
                                        break;
                                    } else if (z27Var3.v - z27Var3.u <= na7.q1(i82).k4.N1.f()) {
                                        k27 a2 = f37Var32.a(null);
                                        if (a2 != null) {
                                            if (!z27Var3.w()) {
                                                o27Var5.e = 0;
                                                int min = Math.min(na7.q1(i82).k4.N1.f(), bu1.d(a2));
                                                o27Var5.f = min;
                                                o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                                View b62 = f37Var32.b();
                                                if (b62 instanceof gb2) {
                                                    z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                                }
                                                if (!z52) {
                                                    f37Var32.s.getSwipeBack().e(f37Var32.J);
                                                }
                                                f37Var32.g(true, true);
                                                break;
                                            } else {
                                                o27Var5.e = z27Var3.u;
                                                o27Var5.f = z27Var3.v;
                                                mib mibVar2 = z27Var3.W;
                                                o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var32.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                                l37Var3.b();
                                                l37Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f37Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f37Var32.d0.c(false);
                                    break;
                                case 4:
                                    f37Var32.d0.c(false);
                                    break;
                                case 5:
                                    f37Var32.d0.a(true);
                                    break;
                                case 6:
                                    l37 l37Var4 = f37Var32.d0;
                                    if (!l37Var4.b) {
                                        wr1 wr1Var = (wr1) l37Var4;
                                        wr1Var.a(true);
                                        mu1 mu1Var = wr1Var.I;
                                        mu1Var.F5 = null;
                                        mu1Var.D5 = null;
                                        mu1Var.x5.f(null, null, mu1Var.l6, null);
                                        mu1Var.w6();
                                        break;
                                    } else {
                                        wr1 wr1Var2 = (wr1) l37Var4;
                                        wr1Var2.a(true);
                                        mu1 mu1Var2 = wr1Var2.I;
                                        mu1Var2.D5 = null;
                                        mu1Var2.Rb(mu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f37Var32.d0.c(true);
                                    break;
                                case 8:
                                    f37Var32.d0.a(true);
                                    break;
                                case 9:
                                    wr1 wr1Var3 = (wr1) f37Var32.d0;
                                    wr1Var3.a(true);
                                    mu1 mu1Var3 = wr1Var3.I;
                                    mu1Var3.x5.d(null, mu1Var3.l6);
                                    mu1Var3.w6();
                                    break;
                                case 10:
                                    f37Var32.d0.a(true);
                                    break;
                                case 11:
                                    wr1 wr1Var4 = (wr1) f37Var32.d0;
                                    wr1Var4.a(true);
                                    mu1 mu1Var4 = wr1Var4.I;
                                    mu1Var4.Y5 = null;
                                    ar1 ar1Var = mu1Var4.a0;
                                    if (ar1Var != null) {
                                        ar1Var.N3 = null;
                                        ar1Var.O3 = false;
                                    }
                                    o27 o27Var6 = mu1Var4.x5;
                                    if (o27Var6 != null) {
                                        i52 = ((d) mu1Var4).currentAccount;
                                        k27 k27Var = mu1Var4.F5;
                                        o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                                    }
                                    mu1Var4.w6();
                                    break;
                                case 12:
                                    o27 o27Var7 = f37Var32.d0.d;
                                    if (o27Var7.o) {
                                        boolean z6 = !o27Var7.q;
                                        o27Var7.q = z6;
                                        f37Var32.H.a(z6, true);
                                        f37Var32.I.a(o27Var7.q, true);
                                        if (f37Var32.r.e.size() > 0 && (message2 = ((k27) f37Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z7 = o27Var7.q;
                                            messageMedia2.force_small_media = z7;
                                            messageMedia2.force_large_media = !z7;
                                        }
                                        if (f37Var32.r.f.size() > 0 && (message = ((k27) f37Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z8 = o27Var7.q;
                                            messageMedia.force_small_media = z8;
                                            messageMedia.force_large_media = !z8;
                                        }
                                        f37Var32.i();
                                        f37Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o27 o27Var8 = f37Var32.d0.d;
                                    boolean z9 = o27Var8.r;
                                    o27Var8.r = !z9;
                                    f37Var32.F.a(z9, true);
                                    if (f37Var32.r.e.size() > 0 && (message4 = ((k27) f37Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = o27Var8.r;
                                    }
                                    if (f37Var32.r.f.size() > 0 && (message3 = ((k27) f37Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = o27Var8.r;
                                    }
                                    f37Var32.i();
                                    f37Var32.V = true;
                                    break;
                            }
                        }
                    });
                    f37Var2 = f37Var3;
                    i2 = f37Var2.a;
                    if (i2 == 1) {
                    }
                    m = f37Var2.e.m(context2);
                    f37Var2.d = m;
                    m.setElevation(gl.L(8.0f));
                    m.setOutlineProvider(viewOutlineProvider);
                    if (m.getParent() instanceof ViewGroup) {
                    }
                    f37Var2.addView(m, nme.d(-1, -1.0f, 51, 0.0f, a.getCurrentActionBarHeight() / gl.p, 0.0f, 0.0f));
                    f37Var2.e.Q(f37Var2.f);
                }
            }
        } else {
            if (!y6c.h(l37Var.x).p()) {
                for (int i12 = 0; i12 < o27Var.b.e.size(); i12++) {
                    if (((k27) o27Var.b.e.get(i12)).D == 36) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            k37 k37Var6 = new k37(context, R.raw.name_hide, k96.M0(o27Var.j ? 2131745140 : 2131745139, null), R.raw.name_show, k96.M0(o27Var.j ? 2131749117 : 2131749116, null), l37Var.G);
            this.s.a(k37Var6, nme.o(-1, 48));
            if (o27Var.g) {
                k37Var = k37Var6;
                k37 k37Var7 = new k37(context, R.raw.caption_hide, k96.M0(2131745152, null), R.raw.caption_show, k96.M0(2131749129, null), l37Var.G);
                k37Var7.a(o27Var.l, false);
                this.s.a(k37Var7, nme.o(-1, 48));
                k37Var2 = k37Var7;
            } else {
                k37Var = k37Var6;
                k37Var2 = null;
            }
            a8 a8Var9 = new a8(0, l37Var.G, context, true, false);
            final byte b15 = 7;
            a8Var9.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                public final /* synthetic */ f37 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i52;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    byte b52 = b15;
                    f37 f37Var32 = this.b;
                    switch (b52) {
                        case 0:
                            f37Var32.d0.d.d = null;
                            f37Var32.e.e(false);
                            f37Var32.g(false, false);
                            f37Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            z27 z27Var2 = f37Var32.e;
                            l37 l37Var2 = f37Var32.d0;
                            if (f37Var32.a(null) != null) {
                                if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                    mib mibVar = z27Var2.W;
                                    k27 a = f37Var32.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                    o27 o27Var4 = l37Var2.d;
                                    int i62 = z27Var2.u;
                                    o27Var4.e = i62;
                                    int i72 = z27Var2.v;
                                    o27Var4.f = i72;
                                    o27Var4.d = bu1.b(i62, i72, a);
                                    l37Var2.b();
                                    l37Var2.a(true);
                                    break;
                                } else {
                                    f37Var32.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            z27 z27Var3 = f37Var32.e;
                            l37 l37Var3 = f37Var32.d0;
                            o27 o27Var5 = l37Var3.d;
                            int i82 = l37Var3.x;
                            boolean z52 = l37Var3.b;
                            if (o27Var5.d != null && !z52) {
                                o27Var5.d = null;
                                z27Var3.e(false);
                                f37Var32.g(false, true);
                                f37Var32.l(true);
                                break;
                            } else if (z27Var3.v - z27Var3.u <= na7.q1(i82).k4.N1.f()) {
                                k27 a2 = f37Var32.a(null);
                                if (a2 != null) {
                                    if (!z27Var3.w()) {
                                        o27Var5.e = 0;
                                        int min = Math.min(na7.q1(i82).k4.N1.f(), bu1.d(a2));
                                        o27Var5.f = min;
                                        o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                        View b62 = f37Var32.b();
                                        if (b62 instanceof gb2) {
                                            z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                        }
                                        if (!z52) {
                                            f37Var32.s.getSwipeBack().e(f37Var32.J);
                                        }
                                        f37Var32.g(true, true);
                                        break;
                                    } else {
                                        o27Var5.e = z27Var3.u;
                                        o27Var5.f = z27Var3.v;
                                        mib mibVar2 = z27Var3.W;
                                        o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var32.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                        l37Var3.b();
                                        l37Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                f37Var32.f();
                                break;
                            }
                            break;
                        case 3:
                            f37Var32.d0.c(false);
                            break;
                        case 4:
                            f37Var32.d0.c(false);
                            break;
                        case 5:
                            f37Var32.d0.a(true);
                            break;
                        case 6:
                            l37 l37Var4 = f37Var32.d0;
                            if (!l37Var4.b) {
                                wr1 wr1Var = (wr1) l37Var4;
                                wr1Var.a(true);
                                mu1 mu1Var = wr1Var.I;
                                mu1Var.F5 = null;
                                mu1Var.D5 = null;
                                mu1Var.x5.f(null, null, mu1Var.l6, null);
                                mu1Var.w6();
                                break;
                            } else {
                                wr1 wr1Var2 = (wr1) l37Var4;
                                wr1Var2.a(true);
                                mu1 mu1Var2 = wr1Var2.I;
                                mu1Var2.D5 = null;
                                mu1Var2.Rb(mu1Var2.F5);
                                break;
                            }
                        case 7:
                            f37Var32.d0.c(true);
                            break;
                        case 8:
                            f37Var32.d0.a(true);
                            break;
                        case 9:
                            wr1 wr1Var3 = (wr1) f37Var32.d0;
                            wr1Var3.a(true);
                            mu1 mu1Var3 = wr1Var3.I;
                            mu1Var3.x5.d(null, mu1Var3.l6);
                            mu1Var3.w6();
                            break;
                        case 10:
                            f37Var32.d0.a(true);
                            break;
                        case 11:
                            wr1 wr1Var4 = (wr1) f37Var32.d0;
                            wr1Var4.a(true);
                            mu1 mu1Var4 = wr1Var4.I;
                            mu1Var4.Y5 = null;
                            ar1 ar1Var = mu1Var4.a0;
                            if (ar1Var != null) {
                                ar1Var.N3 = null;
                                ar1Var.O3 = false;
                            }
                            o27 o27Var6 = mu1Var4.x5;
                            if (o27Var6 != null) {
                                i52 = ((d) mu1Var4).currentAccount;
                                k27 k27Var = mu1Var4.F5;
                                o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                            }
                            mu1Var4.w6();
                            break;
                        case 12:
                            o27 o27Var7 = f37Var32.d0.d;
                            if (o27Var7.o) {
                                boolean z6 = !o27Var7.q;
                                o27Var7.q = z6;
                                f37Var32.H.a(z6, true);
                                f37Var32.I.a(o27Var7.q, true);
                                if (f37Var32.r.e.size() > 0 && (message2 = ((k27) f37Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z7 = o27Var7.q;
                                    messageMedia2.force_small_media = z7;
                                    messageMedia2.force_large_media = !z7;
                                }
                                if (f37Var32.r.f.size() > 0 && (message = ((k27) f37Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z8 = o27Var7.q;
                                    messageMedia.force_small_media = z8;
                                    messageMedia.force_large_media = !z8;
                                }
                                f37Var32.i();
                                f37Var32.V = true;
                                break;
                            }
                            break;
                        default:
                            o27 o27Var8 = f37Var32.d0.d;
                            boolean z9 = o27Var8.r;
                            o27Var8.r = !z9;
                            f37Var32.F.a(z9, true);
                            if (f37Var32.r.e.size() > 0 && (message4 = ((k27) f37Var32.r.e.get(0)).k) != null) {
                                message4.invert_media = o27Var8.r;
                            }
                            if (f37Var32.r.f.size() > 0 && (message3 = ((k27) f37Var32.r.f.get(0)).k) != null) {
                                message3.invert_media = o27Var8.r;
                            }
                            f37Var32.i();
                            f37Var32.V = true;
                            break;
                    }
                }
            });
            a8Var9.j(k96.M0(2131752520, null), R.drawable.msg_forward_replace, null);
            this.s.a(a8Var9, nme.o(-1, 48));
            j8 j8Var4 = new j8(context, h37Var);
            zkb.i(j8Var4, zkb.K(0.06f, bkb.D8), h37Var);
            j8Var4.setTag(R.id.fit_width_tag, 1);
            this.s.a(j8Var4, nme.o(-1, 8));
            a8 a8Var10 = new a8(1, l37Var.G, context, false, false);
            a8Var10.j(k96.M0(2131754215, null), R.drawable.msg_select, null);
            a8Var10.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                public final /* synthetic */ f37 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i52;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    byte b52 = b10;
                    f37 f37Var32 = this.b;
                    switch (b52) {
                        case 0:
                            f37Var32.d0.d.d = null;
                            f37Var32.e.e(false);
                            f37Var32.g(false, false);
                            f37Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            z27 z27Var2 = f37Var32.e;
                            l37 l37Var2 = f37Var32.d0;
                            if (f37Var32.a(null) != null) {
                                if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                    mib mibVar = z27Var2.W;
                                    k27 a = f37Var32.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                    o27 o27Var4 = l37Var2.d;
                                    int i62 = z27Var2.u;
                                    o27Var4.e = i62;
                                    int i72 = z27Var2.v;
                                    o27Var4.f = i72;
                                    o27Var4.d = bu1.b(i62, i72, a);
                                    l37Var2.b();
                                    l37Var2.a(true);
                                    break;
                                } else {
                                    f37Var32.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            z27 z27Var3 = f37Var32.e;
                            l37 l37Var3 = f37Var32.d0;
                            o27 o27Var5 = l37Var3.d;
                            int i82 = l37Var3.x;
                            boolean z52 = l37Var3.b;
                            if (o27Var5.d != null && !z52) {
                                o27Var5.d = null;
                                z27Var3.e(false);
                                f37Var32.g(false, true);
                                f37Var32.l(true);
                                break;
                            } else if (z27Var3.v - z27Var3.u <= na7.q1(i82).k4.N1.f()) {
                                k27 a2 = f37Var32.a(null);
                                if (a2 != null) {
                                    if (!z27Var3.w()) {
                                        o27Var5.e = 0;
                                        int min = Math.min(na7.q1(i82).k4.N1.f(), bu1.d(a2));
                                        o27Var5.f = min;
                                        o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                        View b62 = f37Var32.b();
                                        if (b62 instanceof gb2) {
                                            z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                        }
                                        if (!z52) {
                                            f37Var32.s.getSwipeBack().e(f37Var32.J);
                                        }
                                        f37Var32.g(true, true);
                                        break;
                                    } else {
                                        o27Var5.e = z27Var3.u;
                                        o27Var5.f = z27Var3.v;
                                        mib mibVar2 = z27Var3.W;
                                        o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var32.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                        l37Var3.b();
                                        l37Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                f37Var32.f();
                                break;
                            }
                            break;
                        case 3:
                            f37Var32.d0.c(false);
                            break;
                        case 4:
                            f37Var32.d0.c(false);
                            break;
                        case 5:
                            f37Var32.d0.a(true);
                            break;
                        case 6:
                            l37 l37Var4 = f37Var32.d0;
                            if (!l37Var4.b) {
                                wr1 wr1Var = (wr1) l37Var4;
                                wr1Var.a(true);
                                mu1 mu1Var = wr1Var.I;
                                mu1Var.F5 = null;
                                mu1Var.D5 = null;
                                mu1Var.x5.f(null, null, mu1Var.l6, null);
                                mu1Var.w6();
                                break;
                            } else {
                                wr1 wr1Var2 = (wr1) l37Var4;
                                wr1Var2.a(true);
                                mu1 mu1Var2 = wr1Var2.I;
                                mu1Var2.D5 = null;
                                mu1Var2.Rb(mu1Var2.F5);
                                break;
                            }
                        case 7:
                            f37Var32.d0.c(true);
                            break;
                        case 8:
                            f37Var32.d0.a(true);
                            break;
                        case 9:
                            wr1 wr1Var3 = (wr1) f37Var32.d0;
                            wr1Var3.a(true);
                            mu1 mu1Var3 = wr1Var3.I;
                            mu1Var3.x5.d(null, mu1Var3.l6);
                            mu1Var3.w6();
                            break;
                        case 10:
                            f37Var32.d0.a(true);
                            break;
                        case 11:
                            wr1 wr1Var4 = (wr1) f37Var32.d0;
                            wr1Var4.a(true);
                            mu1 mu1Var4 = wr1Var4.I;
                            mu1Var4.Y5 = null;
                            ar1 ar1Var = mu1Var4.a0;
                            if (ar1Var != null) {
                                ar1Var.N3 = null;
                                ar1Var.O3 = false;
                            }
                            o27 o27Var6 = mu1Var4.x5;
                            if (o27Var6 != null) {
                                i52 = ((d) mu1Var4).currentAccount;
                                k27 k27Var = mu1Var4.F5;
                                o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                            }
                            mu1Var4.w6();
                            break;
                        case 12:
                            o27 o27Var7 = f37Var32.d0.d;
                            if (o27Var7.o) {
                                boolean z6 = !o27Var7.q;
                                o27Var7.q = z6;
                                f37Var32.H.a(z6, true);
                                f37Var32.I.a(o27Var7.q, true);
                                if (f37Var32.r.e.size() > 0 && (message2 = ((k27) f37Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z7 = o27Var7.q;
                                    messageMedia2.force_small_media = z7;
                                    messageMedia2.force_large_media = !z7;
                                }
                                if (f37Var32.r.f.size() > 0 && (message = ((k27) f37Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z8 = o27Var7.q;
                                    messageMedia.force_small_media = z8;
                                    messageMedia.force_large_media = !z8;
                                }
                                f37Var32.i();
                                f37Var32.V = true;
                                break;
                            }
                            break;
                        default:
                            o27 o27Var8 = f37Var32.d0.d;
                            boolean z9 = o27Var8.r;
                            o27Var8.r = !z9;
                            f37Var32.F.a(z9, true);
                            if (f37Var32.r.e.size() > 0 && (message4 = ((k27) f37Var32.r.e.get(0)).k) != null) {
                                message4.invert_media = o27Var8.r;
                            }
                            if (f37Var32.r.f.size() > 0 && (message3 = ((k27) f37Var32.r.f.get(0)).k) != null) {
                                message3.invert_media = o27Var8.r;
                            }
                            f37Var32.i();
                            f37Var32.V = true;
                            break;
                    }
                }
            });
            this.s.a(a8Var10, nme.o(-1, 48));
            a8 a8Var11 = new a8(1, l37Var.G, context, false, true);
            a8Var11.j(k96.M0(2131751350, null), R.drawable.msg_delete, null);
            int i13 = bkb.p7;
            int i14 = bkb.o7;
            a8Var11.c(i13, i14);
            final byte b16 = 9;
            a8Var11.setOnClickListener(new View.OnClickListener(this) { // from class: t27
                public final /* synthetic */ f37 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i52;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    byte b52 = b16;
                    f37 f37Var32 = this.b;
                    switch (b52) {
                        case 0:
                            f37Var32.d0.d.d = null;
                            f37Var32.e.e(false);
                            f37Var32.g(false, false);
                            f37Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            z27 z27Var2 = f37Var32.e;
                            l37 l37Var2 = f37Var32.d0;
                            if (f37Var32.a(null) != null) {
                                if (z27Var2.v - z27Var2.u <= na7.q1(l37Var2.x).k4.N1.f()) {
                                    mib mibVar = z27Var2.W;
                                    k27 a = f37Var32.a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                                    o27 o27Var4 = l37Var2.d;
                                    int i62 = z27Var2.u;
                                    o27Var4.e = i62;
                                    int i72 = z27Var2.v;
                                    o27Var4.f = i72;
                                    o27Var4.d = bu1.b(i62, i72, a);
                                    l37Var2.b();
                                    l37Var2.a(true);
                                    break;
                                } else {
                                    f37Var32.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            z27 z27Var3 = f37Var32.e;
                            l37 l37Var3 = f37Var32.d0;
                            o27 o27Var5 = l37Var3.d;
                            int i82 = l37Var3.x;
                            boolean z52 = l37Var3.b;
                            if (o27Var5.d != null && !z52) {
                                o27Var5.d = null;
                                z27Var3.e(false);
                                f37Var32.g(false, true);
                                f37Var32.l(true);
                                break;
                            } else if (z27Var3.v - z27Var3.u <= na7.q1(i82).k4.N1.f()) {
                                k27 a2 = f37Var32.a(null);
                                if (a2 != null) {
                                    if (!z27Var3.w()) {
                                        o27Var5.e = 0;
                                        int min = Math.min(na7.q1(i82).k4.N1.f(), bu1.d(a2));
                                        o27Var5.f = min;
                                        o27Var5.d = bu1.b(o27Var5.e, min, a2);
                                        View b62 = f37Var32.b();
                                        if (b62 instanceof gb2) {
                                            z27Var3.Z((gb2) b62, o27Var5.e, o27Var5.f);
                                        }
                                        if (!z52) {
                                            f37Var32.s.getSwipeBack().e(f37Var32.J);
                                        }
                                        f37Var32.g(true, true);
                                        break;
                                    } else {
                                        o27Var5.e = z27Var3.u;
                                        o27Var5.f = z27Var3.v;
                                        mib mibVar2 = z27Var3.W;
                                        o27Var5.d = bu1.b(o27Var5.e, o27Var5.f, f37Var32.a(mibVar2 != null ? ((gb2) mibVar2).getMessageObject() : null));
                                        l37Var3.b();
                                        l37Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                f37Var32.f();
                                break;
                            }
                            break;
                        case 3:
                            f37Var32.d0.c(false);
                            break;
                        case 4:
                            f37Var32.d0.c(false);
                            break;
                        case 5:
                            f37Var32.d0.a(true);
                            break;
                        case 6:
                            l37 l37Var4 = f37Var32.d0;
                            if (!l37Var4.b) {
                                wr1 wr1Var = (wr1) l37Var4;
                                wr1Var.a(true);
                                mu1 mu1Var = wr1Var.I;
                                mu1Var.F5 = null;
                                mu1Var.D5 = null;
                                mu1Var.x5.f(null, null, mu1Var.l6, null);
                                mu1Var.w6();
                                break;
                            } else {
                                wr1 wr1Var2 = (wr1) l37Var4;
                                wr1Var2.a(true);
                                mu1 mu1Var2 = wr1Var2.I;
                                mu1Var2.D5 = null;
                                mu1Var2.Rb(mu1Var2.F5);
                                break;
                            }
                        case 7:
                            f37Var32.d0.c(true);
                            break;
                        case 8:
                            f37Var32.d0.a(true);
                            break;
                        case 9:
                            wr1 wr1Var3 = (wr1) f37Var32.d0;
                            wr1Var3.a(true);
                            mu1 mu1Var3 = wr1Var3.I;
                            mu1Var3.x5.d(null, mu1Var3.l6);
                            mu1Var3.w6();
                            break;
                        case 10:
                            f37Var32.d0.a(true);
                            break;
                        case 11:
                            wr1 wr1Var4 = (wr1) f37Var32.d0;
                            wr1Var4.a(true);
                            mu1 mu1Var4 = wr1Var4.I;
                            mu1Var4.Y5 = null;
                            ar1 ar1Var = mu1Var4.a0;
                            if (ar1Var != null) {
                                ar1Var.N3 = null;
                                ar1Var.O3 = false;
                            }
                            o27 o27Var6 = mu1Var4.x5;
                            if (o27Var6 != null) {
                                i52 = ((d) mu1Var4).currentAccount;
                                k27 k27Var = mu1Var4.F5;
                                o27Var6.e(i52, null, null, k27Var == mu1Var4.m4 ? null : k27Var, mu1Var4.D5, mu1Var4.H5);
                            }
                            mu1Var4.w6();
                            break;
                        case 12:
                            o27 o27Var7 = f37Var32.d0.d;
                            if (o27Var7.o) {
                                boolean z6 = !o27Var7.q;
                                o27Var7.q = z6;
                                f37Var32.H.a(z6, true);
                                f37Var32.I.a(o27Var7.q, true);
                                if (f37Var32.r.e.size() > 0 && (message2 = ((k27) f37Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z7 = o27Var7.q;
                                    messageMedia2.force_small_media = z7;
                                    messageMedia2.force_large_media = !z7;
                                }
                                if (f37Var32.r.f.size() > 0 && (message = ((k27) f37Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z8 = o27Var7.q;
                                    messageMedia.force_small_media = z8;
                                    messageMedia.force_large_media = !z8;
                                }
                                f37Var32.i();
                                f37Var32.V = true;
                                break;
                            }
                            break;
                        default:
                            o27 o27Var8 = f37Var32.d0.d;
                            boolean z9 = o27Var8.r;
                            o27Var8.r = !z9;
                            f37Var32.F.a(z9, true);
                            if (f37Var32.r.e.size() > 0 && (message4 = ((k27) f37Var32.r.e.get(0)).k) != null) {
                                message4.invert_media = o27Var8.r;
                            }
                            if (f37Var32.r.f.size() > 0 && (message3 = ((k27) f37Var32.r.f.get(0)).k) != null) {
                                message3.invert_media = o27Var8.r;
                            }
                            f37Var32.i();
                            f37Var32.V = true;
                            break;
                    }
                }
            });
            a8Var11.h(0.12f, i14);
            this.s.a(a8Var11, nme.o(-1, 48));
            k37 k37Var8 = k37Var;
            k37Var8.a(o27Var.k, false);
            k37 k37Var9 = k37Var2;
            f37 f37Var4 = this;
            k37Var8.setOnClickListener(new x27(this, z, context, k37Var9, k37Var8, (byte) 0));
            f37Var = f37Var4;
            if (k37Var9 != null) {
                k37Var9.setOnClickListener(new hu4(f37Var4, k37Var9, k37Var8, b15));
                f37Var = f37Var4;
            }
        }
        context2 = context;
        f37Var2 = f37Var;
        i2 = f37Var2.a;
        if (i2 == 1) {
        }
        m = f37Var2.e.m(context2);
        f37Var2.d = m;
        m.setElevation(gl.L(8.0f));
        m.setOutlineProvider(viewOutlineProvider);
        if (m.getParent() instanceof ViewGroup) {
        }
        f37Var2.addView(m, nme.d(-1, -1.0f, 51, 0.0f, a.getCurrentActionBarHeight() / gl.p, 0.0f, 0.0f));
        f37Var2.e.Q(f37Var2.f);
    }

    public final k27 a(k27 k27Var) {
        f27 f27Var;
        o27 o27Var = this.d0.d;
        m27 m27Var = o27Var.a;
        if (m27Var == null) {
            return null;
        }
        LongSparseArray longSparseArray = m27Var.d;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (f27Var = (f27) o27Var.a.d.valueAt(0)) == null) {
            return (k27) o27Var.a.e.get(0);
        }
        if (f27Var.i) {
            if (k27Var != null) {
                return k27Var;
            }
            bu1 bu1Var = o27Var.d;
            if (bu1Var != null) {
                return bu1Var.a;
            }
        }
        return f27Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b() {
        int i;
        View childAt;
        k27 a = a(null);
        if (a != null) {
            while (true) {
                fu fuVar = this.f;
                if (i >= fuVar.getChildCount()) {
                    break;
                }
                childAt = fuVar.getChildAt(i);
                ni5 ni5Var = (ni5) childAt;
                i = (ni5Var.getMessageObject() == null || !(ni5Var.getMessageObject() == a || ni5Var.getMessageObject().e1() == a.e1())) ? i + 1 : 0;
            }
            return childAt;
        }
        return null;
    }

    public final f27 c(k27 k27Var) {
        if (k27Var.c1() == 0) {
            return null;
        }
        f27 f27Var = (f27) this.r.d.get(k27Var.c1());
        if (f27Var == null || (f27Var.d.size() > 1 && f27Var.d(k27Var) != null)) {
            return f27Var;
        }
        return null;
    }

    public final boolean d(gb2 gb2Var) {
        k27 a;
        if (gb2Var == null || gb2Var.getMessageObject() == null || (a = a(null)) == null) {
            return false;
        }
        return gb2Var.getMessageObject() == a || gb2Var.getMessageObject().e1() == a.e1();
    }

    public final void e(float f, int i) {
        boolean z = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        n81 n81Var = this.b;
        s27 s27Var = this.c;
        if (z) {
            s27Var.setTranslationY(0.0f);
            n81Var.invalidateOutline();
            n81Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            s27Var.setTranslationY(i);
            n81Var.invalidateOutline();
            n81Var.setTranslationY(f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f + n81Var.getMeasuredHeight()) - gl.L(2.0f));
        }
        float x = n81Var.getX();
        qib qibVar = this.d;
        qibVar.setTranslationX(x);
        qibVar.setTranslationY(n81Var.getY());
    }

    public final void f() {
        l37 l37Var = this.d0;
        new u21(l37Var, l37Var.G).I(R.raw.error, k96.M0(2131746244, null), k96.M0(2131746243, null)).j();
    }

    public final void g(boolean z, boolean z2) {
        if (this.d0.b) {
            z = false;
        }
        if (z2 && this.P == z) {
            return;
        }
        this.P = z;
        AnimatorSet animatorSet = this.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.Q = null;
        }
        a8 a8Var = this.E;
        a8 a8Var2 = this.y;
        y27 y27Var = this.x;
        y27 y27Var2 = this.w;
        if (!z2) {
            if (y27Var2 != null) {
                y27Var2.setAlpha(!z ? 1.0f : 0.0f);
                y27Var2.setVisibility(!z ? 0 : 4);
            }
            if (y27Var != null) {
                y27Var.setAlpha(z ? 1.0f : 0.0f);
                y27Var.setVisibility(z ? 0 : 4);
            }
            if (a8Var2 != null) {
                a8Var2.setAlpha(!z ? 1.0f : 0.0f);
                a8Var2.setVisibility(!z ? 0 : 4);
            }
            if (a8Var != null) {
                a8Var.setAlpha(z ? 1.0f : 0.0f);
                a8Var.setVisibility(z ? 0 : 4);
                return;
            }
            return;
        }
        this.Q = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (y27Var2 != null) {
            y27Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(y27Var2, (Property<y27, Float>) property, !z ? 1.0f : 0.0f));
        }
        if (y27Var != null) {
            y27Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(y27Var, (Property<y27, Float>) property, z ? 1.0f : 0.0f));
        }
        if (a8Var2 != null) {
            a8Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(a8Var2, (Property<a8, Float>) property, !z ? 1.0f : 0.0f));
        }
        if (a8Var != null) {
            a8Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(a8Var, (Property<a8, Float>) property, z ? 1.0f : 0.0f));
        }
        this.Q.playTogether(arrayList);
        this.Q.setDuration(360L);
        this.Q.setInterpolator(s33.h);
        this.Q.addListener(new id4((byte) 14, this, z));
        this.Q.start();
    }

    public final void h(gb2 gb2Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (this.a == 2) {
            o27 o27Var = this.d0.d;
            if (!o27Var.n && (uRLSpan = o27Var.w) != null && (webPage = o27Var.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                gb2Var.t3(uRLSpan);
                return;
            }
        }
        gb2Var.t3(null);
    }

    public final void i() {
        int i;
        l37 l37Var = this.d0;
        o27 o27Var = l37Var.d;
        b37 b37Var = this.h;
        if (b37Var.k()) {
            this.W = true;
            return;
        }
        for (int i2 = 0; i2 < this.r.f.size(); i2++) {
            k27 k27Var = (k27) this.r.f.get(i2);
            k27Var.M1 = true;
            k27Var.h2 = l37Var.a;
            boolean z = o27Var.k;
            TLRPC.Message message = k27Var.k;
            if (z) {
                i = message.flags & (-5);
                message.flags = i;
                k27Var.g2 = true;
            } else {
                i = message.flags | 4;
                message.flags = i;
                k27Var.g2 = false;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = o27Var.v;
                if (webPage != null) {
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia == null || messageMedia.webpage != webPage) {
                        message.flags = i | 512;
                        message.media = new TLRPC.TL_messageMediaWebPage();
                        TLRPC.MessageMedia messageMedia2 = k27Var.k.media;
                        messageMedia2.webpage = o27Var.v;
                        boolean z2 = o27Var.q;
                        messageMedia2.force_large_media = !z2;
                        messageMedia2.force_small_media = z2;
                        messageMedia2.manual = true;
                        k27Var.y = null;
                        k27Var.o0();
                        k27Var.p0 = null;
                        k27Var.q0 = null;
                        k27Var.n0 = null;
                        k27Var.o0 = null;
                        k27Var.r0(true);
                        k27Var.K(true);
                    }
                } else {
                    message.flags = i & (-513);
                    message.media = null;
                }
            }
            if (o27Var.l) {
                k27Var.z = null;
            } else {
                k27Var.k0();
            }
            if (k27Var.S3()) {
                n27 n27Var = (n27) k27Var.k.media;
                n27Var.results.total_voters = o27Var.l ? 0 : n27Var.a;
            }
        }
        for (int i3 = 0; i3 < this.r.h.size(); i3++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i3)).chosen = !o27Var.k;
        }
        for (int i4 = 0; i4 < this.r.d.size(); i4++) {
            b37Var.U((f27) this.r.d.valueAt(i4));
        }
        this.n.l(0, this.r.f.size());
    }

    public final void j() {
        final int i = this.S;
        final float f = this.T;
        l37 l37Var = this.d0;
        boolean z = l37Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        fu fuVar = this.f;
        if (z) {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(gl.L(8.0f) + fuVar.getMeasuredWidth());
        } else {
            int measuredHeight = fuVar.getMeasuredHeight();
            int i2 = 0;
            for (int i3 = 0; i3 < fuVar.getChildCount(); i3++) {
                View childAt = fuVar.getChildAt(i3);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i2++;
                }
            }
            m27 m27Var = this.r;
            if (m27Var == null || i2 == 0 || i2 > m27Var.f.size()) {
                this.S = 0;
            } else {
                int c = b00.c(4.0f, measuredHeight, 0);
                this.S = c;
                this.S = Math.min(((fuVar.getMeasuredHeight() - this.S) + c) - ((int) ((((gl.q.y - (Build.VERSION.SDK_INT >= 35 ? gl.n : 0)) * 0.8f) - this.a0) - gl.L(8.0f))), this.S);
            }
            float z2 = oo1.z(getMeasuredHeight() - gl.L(16.0f), (this.b.getMeasuredHeight() - this.S) + (this.a0 - gl.L(8.0f)), 2.0f, gl.L(8.0f)) - this.S;
            this.T = z2;
            if (z2 > gl.L(8.0f)) {
                this.T = gl.L(8.0f);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth());
        }
        if (this.L) {
            float f2 = this.T;
            int i4 = this.S;
            this.U = i4;
            e(f2, i4);
            return;
        }
        if (this.S == i && this.T == f) {
            return;
        }
        ValueAnimator valueAnimator = l37Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        l37Var.h = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u27
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f3 = 1.0f - floatValue;
                f37 f37Var = f37.this;
                int i5 = (int) ((f37Var.S * floatValue) + (i * f3));
                f37Var.U = i5;
                f37Var.e((f37Var.T * floatValue) + (f * f3), i5);
            }
        });
        l37Var.h.setDuration(250L);
        l37Var.h.setInterpolator(la2.V);
        l37Var.h.addListener(new v85(this, (byte) 17));
        gl.d3(l37Var.E, 50L);
        this.U = i;
        e(f, i);
    }

    public final void k() {
        k27 k27Var;
        l37 l37Var = this.d0;
        o27 o27Var = l37Var.d;
        if (this.a == 0) {
            z27 z27Var = this.e;
            if (z27Var.v - z27Var.u <= na7.q1(l37Var.x).k4.N1.f()) {
                mib mibVar = z27Var.W;
                k27 a = a(mibVar != null ? ((gb2) mibVar).getMessageObject() : null);
                if (o27Var.d != null && z27Var.w()) {
                    o27Var.e = z27Var.u;
                    o27Var.f = z27Var.v;
                    if (a != null) {
                        bu1 bu1Var = o27Var.d;
                        if (bu1Var.m || (k27Var = bu1Var.a) == null || k27Var.e1() != a.e1()) {
                            o27Var.d = bu1.b(o27Var.e, o27Var.f, a);
                            l37Var.b();
                        }
                    }
                }
                z27Var.e(false);
            }
        }
    }

    public final void l(boolean z) {
        l37 l37Var = this.d0;
        TLRPC.User user = l37Var.n;
        o27 o27Var = l37Var.d;
        TLRPC.Chat chat = l37Var.r;
        s27 s27Var = this.c;
        int i = this.a;
        if (i == 1) {
            m27 m27Var = o27Var.b;
            s27Var.b(k96.G(m27Var == null ? 0 : m27Var.g.size(), "PreviewForwardMessagesCount", new Object[0]), z);
            s27Var.a(!o27Var.h ? o27Var.m ? user != null ? k96.a0("ForwardPreviewSendersNameVisible", null, 2131750562, qu2.m(0, user.first_name, user.last_name)) : (!hc2.T(chat) || chat.megagroup) ? k96.M0(2131750560, null) : k96.M0(2131750561, null) : user != null ? k96.a0("ForwardPreviewSendersNameVisible", null, 2131750562, qu2.m(0, user.first_name, user.last_name)) : (!hc2.T(chat) || chat.megagroup) ? k96.M0(2131750563, null) : k96.M0(2131750564, null) : !o27Var.k ? user != null ? k96.a0("ForwardPreviewSendersNameVisible", null, 2131750562, qu2.m(0, user.first_name, user.last_name)) : (!hc2.T(chat) || chat.megagroup) ? k96.M0(2131750560, null) : k96.M0(2131750561, null) : user != null ? k96.a0("ForwardPreviewSendersNameHidden", null, 2131750565, qu2.m(0, user.first_name, user.last_name)) : (!hc2.T(chat) || chat.megagroup) ? k96.M0(2131750563, null) : k96.M0(2131750564, null), z);
        } else {
            if (i != 0) {
                if (i == 2) {
                    s27Var.b(k96.M0(2131748356, null), z);
                    s27Var.a(k96.M0(2131748357, null), z);
                    return;
                }
                return;
            }
            if (o27Var.d == null || !o27Var.a.j) {
                s27Var.b(k96.M0(2131748353, null), z);
                s27Var.a(o27Var.a.j ? k96.M0(2131748354, null) : "", z);
            } else {
                s27Var.b(k96.M0(2131746689, null), z);
                s27Var.a(k96.M0(2131746688, null), z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            gl.d0(this.f, new hj3(this, (byte) 28));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
        this.c0 = true;
        this.L = true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        j();
        this.L = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
        l37 l37Var = this.d0;
        l37Var.w = z;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i, makeMeasureSpec);
        int i3 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i3, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        boolean z2 = l37Var.w;
        n81 n81Var = this.b;
        if (z2) {
            n81Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) n81Var.getLayoutParams()).topMargin = gl.L(8.0f);
            ((ViewGroup.MarginLayoutParams) n81Var.getLayoutParams()).bottomMargin = gl.L(8.0f);
            n81Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i), Math.max(gl.L(340.0f), View.MeasureSpec.getSize(i) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) n81Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) n81Var.getLayoutParams()).bottomMargin = 0;
            n81Var.getLayoutParams().height = (View.MeasureSpec.getSize(i2) - gl.L(6.0f)) - this.a0;
            if (n81Var.getLayoutParams().height < View.MeasureSpec.getSize(i2) * 0.5f) {
                n81Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i2) * 0.5f);
            }
            n81Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i2) - n81Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
        if (this.b0 != size) {
            for (int i4 = 0; i4 < this.r.f.size(); i4++) {
                k27 k27Var = (k27) this.r.f.get(i4);
                k27Var.d2 = l37Var.w ? n81Var.getLayoutParams().width : View.MeasureSpec.getSize(i) - gl.L(16.0f);
                k27Var.S1 = false;
                k27Var.M1 = true;
                jr jrVar = this.n;
                if (jrVar != null) {
                    jrVar.f();
                }
            }
            this.L = true;
        }
        this.b0 = size;
        super.onMeasure(i, i2);
    }
}
