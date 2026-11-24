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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class f57 extends FrameLayout {
    public static final /* synthetic */ int e0 = 0;
    public final a8 E;
    public final k57 F;
    public final FrameLayout G;
    public final k57 H;
    public final k57 I;
    public final int J;
    public final mx6 K;
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
    public final w91 b;
    public int b0;
    public final s47 c;
    public boolean c0;
    public final rkb d;
    public final /* synthetic */ l57 d0;
    public final z47 e;
    public final fv f;
    public final b57 h;
    public final js n;
    public m47 r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final y47 w;
    public final y47 x;
    public final a8 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x06da  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.graphics.drawable.Drawable, java.lang.String, wmb] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f57(l57 l57Var, Context context, int i) {
        super(r5);
        o47 o47Var;
        ViewOutlineProvider viewOutlineProvider;
        Context context2;
        f57 f57Var;
        boolean z;
        k57 k57Var;
        k57 k57Var2;
        f57 f57Var2;
        int i2;
        rkb m;
        boolean z2;
        ?? r11;
        int i3;
        o47 o47Var2;
        boolean z3;
        Object obj;
        Context context3 = context;
        this.d0 = l57Var;
        byte b = 1;
        this.L = true;
        this.M = -1;
        this.N = -1;
        final byte b2 = 0;
        this.O = false;
        this.R = new Rect();
        this.V = false;
        this.c0 = true;
        this.K = new mx6((Object) context3, (byte) 20);
        this.a = i;
        setOnTouchListener(new a7(this, (byte) 11));
        byte b3 = 6;
        w91 w91Var = new w91(b3, context3, this);
        this.b = w91Var;
        h57 h57Var = l57Var.G;
        boolean z4 = l57Var.b;
        o47 o47Var3 = l57Var.d;
        Drawable l = ((wv1) h57Var).l();
        if (((wv1) h57Var).f == null) {
            int i4 = cmb.a;
        }
        w91Var.U(l);
        w91Var.setOccupyStatusBar(false);
        w91Var.setOutlineProvider(new cm0(this, b3));
        w91Var.setClipToOutline(true);
        w91Var.setElevation(gm.L(4.0f));
        s47 s47Var = new s47(context3, h57Var);
        this.c = s47Var;
        anb.h(cmb.r8, h57Var, s47Var);
        z47 z47Var = new z47(this);
        this.e = z47Var;
        z47Var.D = new ts1(this, b);
        byte b4 = 26;
        fv fvVar = new fv(this, context3, h57Var, b4);
        this.f = fvVar;
        b57 b57Var = new b57(this, fvVar, h57Var);
        this.h = b57Var;
        fvVar.setItemAnimator(b57Var);
        fvVar.setOnScrollListener(new ip2(this, b4));
        fvVar.setOnItemClickListener(new c57(this));
        js jsVar = new js(this, (byte) 5);
        this.n = jsVar;
        fvVar.setAdapter(jsVar);
        fvVar.setPadding(0, gm.L(4.0f), 0, gm.L(4.0f));
        s37 s37Var = new s37(this, b);
        byte b5 = 9;
        s37Var.O = new zr1(this, b5);
        fvVar.setClipToPadding(false);
        fvVar.setLayoutManager(s37Var);
        fvVar.i(new as1(b5));
        w91Var.addView(fvVar);
        addView(w91Var, qoe.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        w91Var.addView(s47Var, qoe.c(-2.0f, -1));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, h57Var, getContext());
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new w47(this, (byte) 1));
        im0 c = l57Var.H.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c.p(qqd.k(h57Var));
        c.q(gm.L(8.0f));
        c.S.e = true;
        c.r(gm.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, qoe.c(-2.0f, -2));
        if (i == 0) {
            m47 m47Var = o47Var3.a;
            boolean z5 = o47Var3.s;
            if (m47Var != null) {
                boolean z6 = m47Var.j;
                float f = 48.0f;
                if (!z6 || o47Var3.i) {
                    z2 = z5;
                    r11 = 0;
                    o47Var = o47Var3;
                } else {
                    LinearLayout i5 = hg9.i(context3, 1);
                    if (z4) {
                        i3 = 2131746163;
                        o47Var2 = o47Var3;
                        z2 = z5;
                        z3 = true;
                        obj = null;
                    } else {
                        z2 = z5;
                        o47Var2 = o47Var3;
                        obj = null;
                        a8 a8Var = new a8(0, l57Var.G, context3, true, false);
                        a8Var.j(jb6.M0(2131753721, null), R.drawable.msg_arrow_back, null);
                        a8Var.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                            public final /* synthetic */ f57 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i6;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                byte b6 = b2;
                                f57 f57Var3 = this.b;
                                switch (b6) {
                                    case 0:
                                        f57Var3.d0.d.d = null;
                                        f57Var3.e.e(false);
                                        f57Var3.g(false, false);
                                        f57Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        z47 z47Var2 = f57Var3.e;
                                        l57 l57Var2 = f57Var3.d0;
                                        if (f57Var3.a(null) != null) {
                                            if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                                nkb nkbVar = z47Var2.W;
                                                k47 a = f57Var3.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                                o47 o47Var4 = l57Var2.d;
                                                int i7 = z47Var2.u;
                                                o47Var4.e = i7;
                                                int i8 = z47Var2.v;
                                                o47Var4.f = i8;
                                                o47Var4.d = nv1.b(i7, i8, a);
                                                l57Var2.b();
                                                l57Var2.a(true);
                                                break;
                                            } else {
                                                f57Var3.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        z47 z47Var3 = f57Var3.e;
                                        l57 l57Var3 = f57Var3.d0;
                                        o47 o47Var5 = l57Var3.d;
                                        int i9 = l57Var3.x;
                                        boolean z7 = l57Var3.b;
                                        if (o47Var5.d != null && !z7) {
                                            o47Var5.d = null;
                                            z47Var3.e(false);
                                            f57Var3.g(false, true);
                                            f57Var3.l(true);
                                            break;
                                        } else if (z47Var3.v - z47Var3.u <= oc7.r1(i9).l4.N1.f()) {
                                            k47 a2 = f57Var3.a(null);
                                            if (a2 != null) {
                                                if (!z47Var3.w()) {
                                                    o47Var5.e = 0;
                                                    int min = Math.min(oc7.r1(i9).l4.N1.f(), nv1.d(a2));
                                                    o47Var5.f = min;
                                                    o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                                    View b7 = f57Var3.b();
                                                    if (b7 instanceof rc2) {
                                                        z47Var3.Z((rc2) b7, o47Var5.e, o47Var5.f);
                                                    }
                                                    if (!z7) {
                                                        f57Var3.s.getSwipeBack().e(f57Var3.J);
                                                    }
                                                    f57Var3.g(true, true);
                                                    break;
                                                } else {
                                                    o47Var5.e = z47Var3.u;
                                                    o47Var5.f = z47Var3.v;
                                                    nkb nkbVar2 = z47Var3.W;
                                                    o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var3.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                                    l57Var3.b();
                                                    l57Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            f57Var3.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        f57Var3.d0.c(false);
                                        break;
                                    case 4:
                                        f57Var3.d0.c(false);
                                        break;
                                    case 5:
                                        f57Var3.d0.a(true);
                                        break;
                                    case 6:
                                        l57 l57Var4 = f57Var3.d0;
                                        if (!l57Var4.b) {
                                            jt1 jt1Var = (jt1) l57Var4;
                                            jt1Var.a(true);
                                            yv1 yv1Var = jt1Var.I;
                                            yv1Var.F5 = null;
                                            yv1Var.D5 = null;
                                            yv1Var.x5.f(null, null, yv1Var.l6, null);
                                            yv1Var.D6();
                                            break;
                                        } else {
                                            jt1 jt1Var2 = (jt1) l57Var4;
                                            jt1Var2.a(true);
                                            yv1 yv1Var2 = jt1Var2.I;
                                            yv1Var2.D5 = null;
                                            yv1Var2.dc(yv1Var2.F5);
                                            break;
                                        }
                                    case 7:
                                        f57Var3.d0.c(true);
                                        break;
                                    case 8:
                                        f57Var3.d0.a(true);
                                        break;
                                    case 9:
                                        jt1 jt1Var3 = (jt1) f57Var3.d0;
                                        jt1Var3.a(true);
                                        yv1 yv1Var3 = jt1Var3.I;
                                        yv1Var3.x5.d(null, yv1Var3.l6);
                                        yv1Var3.D6();
                                        break;
                                    case 10:
                                        f57Var3.d0.a(true);
                                        break;
                                    case 11:
                                        jt1 jt1Var4 = (jt1) f57Var3.d0;
                                        jt1Var4.a(true);
                                        yv1 yv1Var4 = jt1Var4.I;
                                        yv1Var4.Y5 = null;
                                        ms1 ms1Var = yv1Var4.a0;
                                        if (ms1Var != null) {
                                            ms1Var.N3 = null;
                                            ms1Var.O3 = false;
                                        }
                                        o47 o47Var6 = yv1Var4.x5;
                                        if (o47Var6 != null) {
                                            i6 = ((d) yv1Var4).currentAccount;
                                            k47 k47Var = yv1Var4.F5;
                                            o47Var6.e(i6, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                        }
                                        yv1Var4.D6();
                                        break;
                                    case 12:
                                        o47 o47Var7 = f57Var3.d0.d;
                                        if (o47Var7.o) {
                                            boolean z8 = !o47Var7.q;
                                            o47Var7.q = z8;
                                            f57Var3.H.a(z8, true);
                                            f57Var3.I.a(o47Var7.q, true);
                                            if (f57Var3.r.e.size() > 0 && (message2 = ((k47) f57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z9 = o47Var7.q;
                                                messageMedia2.force_small_media = z9;
                                                messageMedia2.force_large_media = !z9;
                                            }
                                            if (f57Var3.r.f.size() > 0 && (message = ((k47) f57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z10 = o47Var7.q;
                                                messageMedia.force_small_media = z10;
                                                messageMedia.force_large_media = !z10;
                                            }
                                            f57Var3.i();
                                            f57Var3.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        o47 o47Var8 = f57Var3.d0.d;
                                        boolean z11 = o47Var8.r;
                                        o47Var8.r = !z11;
                                        f57Var3.F.a(z11, true);
                                        if (f57Var3.r.e.size() > 0 && (message4 = ((k47) f57Var3.r.e.get(0)).k) != null) {
                                            message4.invert_media = o47Var8.r;
                                        }
                                        if (f57Var3.r.f.size() > 0 && (message3 = ((k47) f57Var3.r.f.get(0)).k) != null) {
                                            message3.invert_media = o47Var8.r;
                                        }
                                        f57Var3.i();
                                        f57Var3.V = true;
                                        break;
                                }
                            }
                        });
                        i5.addView(a8Var, qoe.o(-1, 48));
                        j8 j8Var = new j8(context3, h57Var);
                        anb.i(j8Var, anb.K(0.06f, cmb.D8), h57Var);
                        j8Var.setTag(R.id.fit_width_tag, 1);
                        i5.addView(j8Var, qoe.o(-1, 8));
                        a8 a8Var2 = new a8(0, l57Var.G, context3, false, true);
                        i3 = 2131746163;
                        a8Var2.j(jb6.M0(2131746163, null), R.drawable.menu_quote_specific, null);
                        z3 = true;
                        final boolean z7 = true ? 1 : 0;
                        a8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                            public final /* synthetic */ f57 b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i6;
                                TLRPC.Message message;
                                TLRPC.MessageMedia messageMedia;
                                TLRPC.Message message2;
                                TLRPC.MessageMedia messageMedia2;
                                TLRPC.Message message3;
                                TLRPC.Message message4;
                                byte b6 = z7;
                                f57 f57Var3 = this.b;
                                switch (b6) {
                                    case 0:
                                        f57Var3.d0.d.d = null;
                                        f57Var3.e.e(false);
                                        f57Var3.g(false, false);
                                        f57Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        z47 z47Var2 = f57Var3.e;
                                        l57 l57Var2 = f57Var3.d0;
                                        if (f57Var3.a(null) != null) {
                                            if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                                nkb nkbVar = z47Var2.W;
                                                k47 a = f57Var3.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                                o47 o47Var4 = l57Var2.d;
                                                int i7 = z47Var2.u;
                                                o47Var4.e = i7;
                                                int i8 = z47Var2.v;
                                                o47Var4.f = i8;
                                                o47Var4.d = nv1.b(i7, i8, a);
                                                l57Var2.b();
                                                l57Var2.a(true);
                                                break;
                                            } else {
                                                f57Var3.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        z47 z47Var3 = f57Var3.e;
                                        l57 l57Var3 = f57Var3.d0;
                                        o47 o47Var5 = l57Var3.d;
                                        int i9 = l57Var3.x;
                                        boolean z72 = l57Var3.b;
                                        if (o47Var5.d != null && !z72) {
                                            o47Var5.d = null;
                                            z47Var3.e(false);
                                            f57Var3.g(false, true);
                                            f57Var3.l(true);
                                            break;
                                        } else if (z47Var3.v - z47Var3.u <= oc7.r1(i9).l4.N1.f()) {
                                            k47 a2 = f57Var3.a(null);
                                            if (a2 != null) {
                                                if (!z47Var3.w()) {
                                                    o47Var5.e = 0;
                                                    int min = Math.min(oc7.r1(i9).l4.N1.f(), nv1.d(a2));
                                                    o47Var5.f = min;
                                                    o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                                    View b7 = f57Var3.b();
                                                    if (b7 instanceof rc2) {
                                                        z47Var3.Z((rc2) b7, o47Var5.e, o47Var5.f);
                                                    }
                                                    if (!z72) {
                                                        f57Var3.s.getSwipeBack().e(f57Var3.J);
                                                    }
                                                    f57Var3.g(true, true);
                                                    break;
                                                } else {
                                                    o47Var5.e = z47Var3.u;
                                                    o47Var5.f = z47Var3.v;
                                                    nkb nkbVar2 = z47Var3.W;
                                                    o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var3.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                                    l57Var3.b();
                                                    l57Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            f57Var3.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        f57Var3.d0.c(false);
                                        break;
                                    case 4:
                                        f57Var3.d0.c(false);
                                        break;
                                    case 5:
                                        f57Var3.d0.a(true);
                                        break;
                                    case 6:
                                        l57 l57Var4 = f57Var3.d0;
                                        if (!l57Var4.b) {
                                            jt1 jt1Var = (jt1) l57Var4;
                                            jt1Var.a(true);
                                            yv1 yv1Var = jt1Var.I;
                                            yv1Var.F5 = null;
                                            yv1Var.D5 = null;
                                            yv1Var.x5.f(null, null, yv1Var.l6, null);
                                            yv1Var.D6();
                                            break;
                                        } else {
                                            jt1 jt1Var2 = (jt1) l57Var4;
                                            jt1Var2.a(true);
                                            yv1 yv1Var2 = jt1Var2.I;
                                            yv1Var2.D5 = null;
                                            yv1Var2.dc(yv1Var2.F5);
                                            break;
                                        }
                                    case 7:
                                        f57Var3.d0.c(true);
                                        break;
                                    case 8:
                                        f57Var3.d0.a(true);
                                        break;
                                    case 9:
                                        jt1 jt1Var3 = (jt1) f57Var3.d0;
                                        jt1Var3.a(true);
                                        yv1 yv1Var3 = jt1Var3.I;
                                        yv1Var3.x5.d(null, yv1Var3.l6);
                                        yv1Var3.D6();
                                        break;
                                    case 10:
                                        f57Var3.d0.a(true);
                                        break;
                                    case 11:
                                        jt1 jt1Var4 = (jt1) f57Var3.d0;
                                        jt1Var4.a(true);
                                        yv1 yv1Var4 = jt1Var4.I;
                                        yv1Var4.Y5 = null;
                                        ms1 ms1Var = yv1Var4.a0;
                                        if (ms1Var != null) {
                                            ms1Var.N3 = null;
                                            ms1Var.O3 = false;
                                        }
                                        o47 o47Var6 = yv1Var4.x5;
                                        if (o47Var6 != null) {
                                            i6 = ((d) yv1Var4).currentAccount;
                                            k47 k47Var = yv1Var4.F5;
                                            o47Var6.e(i6, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                        }
                                        yv1Var4.D6();
                                        break;
                                    case 12:
                                        o47 o47Var7 = f57Var3.d0.d;
                                        if (o47Var7.o) {
                                            boolean z8 = !o47Var7.q;
                                            o47Var7.q = z8;
                                            f57Var3.H.a(z8, true);
                                            f57Var3.I.a(o47Var7.q, true);
                                            if (f57Var3.r.e.size() > 0 && (message2 = ((k47) f57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z9 = o47Var7.q;
                                                messageMedia2.force_small_media = z9;
                                                messageMedia2.force_large_media = !z9;
                                            }
                                            if (f57Var3.r.f.size() > 0 && (message = ((k47) f57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z10 = o47Var7.q;
                                                messageMedia.force_small_media = z10;
                                                messageMedia.force_large_media = !z10;
                                            }
                                            f57Var3.i();
                                            f57Var3.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        o47 o47Var8 = f57Var3.d0.d;
                                        boolean z11 = o47Var8.r;
                                        o47Var8.r = !z11;
                                        f57Var3.F.a(z11, true);
                                        if (f57Var3.r.e.size() > 0 && (message4 = ((k47) f57Var3.r.e.get(0)).k) != null) {
                                            message4.invert_media = o47Var8.r;
                                        }
                                        if (f57Var3.r.f.size() > 0 && (message3 = ((k47) f57Var3.r.f.get(0)).k) != null) {
                                            message3.invert_media = o47Var8.r;
                                        }
                                        f57Var3.i();
                                        f57Var3.V = true;
                                        break;
                                }
                            }
                        });
                        i5.addView(a8Var2, qoe.o(-1, 48));
                    }
                    this.J = actionBarPopupWindow$ActionBarPopupWindowLayout.b(i5);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z3);
                    FrameLayout frameLayout = new FrameLayout(context3);
                    int i6 = i3;
                    ?? r112 = obj;
                    y47 y47Var = new y47(context, 1, true, false, l57Var.G, (byte) 0);
                    this.w = y47Var;
                    y47Var.j(jb6.M0(z4 ? i6 : 2131745387, r112), R.drawable.menu_select_quote, r112);
                    y47 y47Var2 = new y47(context, 1, true, false, l57Var.G, (byte) 1);
                    context3 = context;
                    this.x = y47Var2;
                    y47Var2.j(jb6.M0(2131752009, r112), R.drawable.menu_quote_delete, r112);
                    int i7 = cmb.H5;
                    Drawable Y = cmb.Y(cmb.v0(i7, h57Var), 6, 0);
                    wmb M = anb.M(i7);
                    frameLayout.setBackground(Y);
                    anb.j(frameLayout, Y, r112, M, h57Var);
                    final byte b6 = 2;
                    frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                        public final /* synthetic */ f57 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i62;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b62 = b6;
                            f57 f57Var3 = this.b;
                            switch (b62) {
                                case 0:
                                    f57Var3.d0.d.d = null;
                                    f57Var3.e.e(false);
                                    f57Var3.g(false, false);
                                    f57Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z47 z47Var2 = f57Var3.e;
                                    l57 l57Var2 = f57Var3.d0;
                                    if (f57Var3.a(null) != null) {
                                        if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                            nkb nkbVar = z47Var2.W;
                                            k47 a = f57Var3.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                            o47 o47Var4 = l57Var2.d;
                                            int i72 = z47Var2.u;
                                            o47Var4.e = i72;
                                            int i8 = z47Var2.v;
                                            o47Var4.f = i8;
                                            o47Var4.d = nv1.b(i72, i8, a);
                                            l57Var2.b();
                                            l57Var2.a(true);
                                            break;
                                        } else {
                                            f57Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z47 z47Var3 = f57Var3.e;
                                    l57 l57Var3 = f57Var3.d0;
                                    o47 o47Var5 = l57Var3.d;
                                    int i9 = l57Var3.x;
                                    boolean z72 = l57Var3.b;
                                    if (o47Var5.d != null && !z72) {
                                        o47Var5.d = null;
                                        z47Var3.e(false);
                                        f57Var3.g(false, true);
                                        f57Var3.l(true);
                                        break;
                                    } else if (z47Var3.v - z47Var3.u <= oc7.r1(i9).l4.N1.f()) {
                                        k47 a2 = f57Var3.a(null);
                                        if (a2 != null) {
                                            if (!z47Var3.w()) {
                                                o47Var5.e = 0;
                                                int min = Math.min(oc7.r1(i9).l4.N1.f(), nv1.d(a2));
                                                o47Var5.f = min;
                                                o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                                View b7 = f57Var3.b();
                                                if (b7 instanceof rc2) {
                                                    z47Var3.Z((rc2) b7, o47Var5.e, o47Var5.f);
                                                }
                                                if (!z72) {
                                                    f57Var3.s.getSwipeBack().e(f57Var3.J);
                                                }
                                                f57Var3.g(true, true);
                                                break;
                                            } else {
                                                o47Var5.e = z47Var3.u;
                                                o47Var5.f = z47Var3.v;
                                                nkb nkbVar2 = z47Var3.W;
                                                o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var3.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                                l57Var3.b();
                                                l57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f57Var3.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f57Var3.d0.c(false);
                                    break;
                                case 4:
                                    f57Var3.d0.c(false);
                                    break;
                                case 5:
                                    f57Var3.d0.a(true);
                                    break;
                                case 6:
                                    l57 l57Var4 = f57Var3.d0;
                                    if (!l57Var4.b) {
                                        jt1 jt1Var = (jt1) l57Var4;
                                        jt1Var.a(true);
                                        yv1 yv1Var = jt1Var.I;
                                        yv1Var.F5 = null;
                                        yv1Var.D5 = null;
                                        yv1Var.x5.f(null, null, yv1Var.l6, null);
                                        yv1Var.D6();
                                        break;
                                    } else {
                                        jt1 jt1Var2 = (jt1) l57Var4;
                                        jt1Var2.a(true);
                                        yv1 yv1Var2 = jt1Var2.I;
                                        yv1Var2.D5 = null;
                                        yv1Var2.dc(yv1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f57Var3.d0.c(true);
                                    break;
                                case 8:
                                    f57Var3.d0.a(true);
                                    break;
                                case 9:
                                    jt1 jt1Var3 = (jt1) f57Var3.d0;
                                    jt1Var3.a(true);
                                    yv1 yv1Var3 = jt1Var3.I;
                                    yv1Var3.x5.d(null, yv1Var3.l6);
                                    yv1Var3.D6();
                                    break;
                                case 10:
                                    f57Var3.d0.a(true);
                                    break;
                                case 11:
                                    jt1 jt1Var4 = (jt1) f57Var3.d0;
                                    jt1Var4.a(true);
                                    yv1 yv1Var4 = jt1Var4.I;
                                    yv1Var4.Y5 = null;
                                    ms1 ms1Var = yv1Var4.a0;
                                    if (ms1Var != null) {
                                        ms1Var.N3 = null;
                                        ms1Var.O3 = false;
                                    }
                                    o47 o47Var6 = yv1Var4.x5;
                                    if (o47Var6 != null) {
                                        i62 = ((d) yv1Var4).currentAccount;
                                        k47 k47Var = yv1Var4.F5;
                                        o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                    }
                                    yv1Var4.D6();
                                    break;
                                case 12:
                                    o47 o47Var7 = f57Var3.d0.d;
                                    if (o47Var7.o) {
                                        boolean z8 = !o47Var7.q;
                                        o47Var7.q = z8;
                                        f57Var3.H.a(z8, true);
                                        f57Var3.I.a(o47Var7.q, true);
                                        if (f57Var3.r.e.size() > 0 && (message2 = ((k47) f57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = o47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (f57Var3.r.f.size() > 0 && (message = ((k47) f57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = o47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        f57Var3.i();
                                        f57Var3.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o47 o47Var8 = f57Var3.d0.d;
                                    boolean z11 = o47Var8.r;
                                    o47Var8.r = !z11;
                                    f57Var3.F.a(z11, true);
                                    if (f57Var3.r.e.size() > 0 && (message4 = ((k47) f57Var3.r.e.get(0)).k) != null) {
                                        message4.invert_media = o47Var8.r;
                                    }
                                    if (f57Var3.r.f.size() > 0 && (message3 = ((k47) f57Var3.r.f.get(0)).k) != null) {
                                        message3.invert_media = o47Var8.r;
                                    }
                                    f57Var3.i();
                                    f57Var3.V = true;
                                    break;
                            }
                        }
                    });
                    f = 48.0f;
                    frameLayout.addView(y47Var, qoe.c(48.0f, -1));
                    frameLayout.addView(y47Var2, qoe.c(48.0f, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, qoe.o(-1, 48));
                    o47Var = o47Var2;
                    r11 = r112;
                }
                if (!o47Var.t && !z2 && !o47Var.u) {
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    float f2 = f;
                    a8 a8Var3 = new a8(1, l57Var.G, context3, false, false);
                    this.y = a8Var3;
                    a8Var3.j(jb6.M0(2131745986, r11), R.drawable.msg_forward_replace, r11);
                    final byte b7 = 3;
                    a8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                        public final /* synthetic */ f57 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i62;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b62 = b7;
                            f57 f57Var3 = this.b;
                            switch (b62) {
                                case 0:
                                    f57Var3.d0.d.d = null;
                                    f57Var3.e.e(false);
                                    f57Var3.g(false, false);
                                    f57Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z47 z47Var2 = f57Var3.e;
                                    l57 l57Var2 = f57Var3.d0;
                                    if (f57Var3.a(null) != null) {
                                        if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                            nkb nkbVar = z47Var2.W;
                                            k47 a = f57Var3.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                            o47 o47Var4 = l57Var2.d;
                                            int i72 = z47Var2.u;
                                            o47Var4.e = i72;
                                            int i8 = z47Var2.v;
                                            o47Var4.f = i8;
                                            o47Var4.d = nv1.b(i72, i8, a);
                                            l57Var2.b();
                                            l57Var2.a(true);
                                            break;
                                        } else {
                                            f57Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z47 z47Var3 = f57Var3.e;
                                    l57 l57Var3 = f57Var3.d0;
                                    o47 o47Var5 = l57Var3.d;
                                    int i9 = l57Var3.x;
                                    boolean z72 = l57Var3.b;
                                    if (o47Var5.d != null && !z72) {
                                        o47Var5.d = null;
                                        z47Var3.e(false);
                                        f57Var3.g(false, true);
                                        f57Var3.l(true);
                                        break;
                                    } else if (z47Var3.v - z47Var3.u <= oc7.r1(i9).l4.N1.f()) {
                                        k47 a2 = f57Var3.a(null);
                                        if (a2 != null) {
                                            if (!z47Var3.w()) {
                                                o47Var5.e = 0;
                                                int min = Math.min(oc7.r1(i9).l4.N1.f(), nv1.d(a2));
                                                o47Var5.f = min;
                                                o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                                View b72 = f57Var3.b();
                                                if (b72 instanceof rc2) {
                                                    z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                                }
                                                if (!z72) {
                                                    f57Var3.s.getSwipeBack().e(f57Var3.J);
                                                }
                                                f57Var3.g(true, true);
                                                break;
                                            } else {
                                                o47Var5.e = z47Var3.u;
                                                o47Var5.f = z47Var3.v;
                                                nkb nkbVar2 = z47Var3.W;
                                                o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var3.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                                l57Var3.b();
                                                l57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f57Var3.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f57Var3.d0.c(false);
                                    break;
                                case 4:
                                    f57Var3.d0.c(false);
                                    break;
                                case 5:
                                    f57Var3.d0.a(true);
                                    break;
                                case 6:
                                    l57 l57Var4 = f57Var3.d0;
                                    if (!l57Var4.b) {
                                        jt1 jt1Var = (jt1) l57Var4;
                                        jt1Var.a(true);
                                        yv1 yv1Var = jt1Var.I;
                                        yv1Var.F5 = null;
                                        yv1Var.D5 = null;
                                        yv1Var.x5.f(null, null, yv1Var.l6, null);
                                        yv1Var.D6();
                                        break;
                                    } else {
                                        jt1 jt1Var2 = (jt1) l57Var4;
                                        jt1Var2.a(true);
                                        yv1 yv1Var2 = jt1Var2.I;
                                        yv1Var2.D5 = null;
                                        yv1Var2.dc(yv1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f57Var3.d0.c(true);
                                    break;
                                case 8:
                                    f57Var3.d0.a(true);
                                    break;
                                case 9:
                                    jt1 jt1Var3 = (jt1) f57Var3.d0;
                                    jt1Var3.a(true);
                                    yv1 yv1Var3 = jt1Var3.I;
                                    yv1Var3.x5.d(null, yv1Var3.l6);
                                    yv1Var3.D6();
                                    break;
                                case 10:
                                    f57Var3.d0.a(true);
                                    break;
                                case 11:
                                    jt1 jt1Var4 = (jt1) f57Var3.d0;
                                    jt1Var4.a(true);
                                    yv1 yv1Var4 = jt1Var4.I;
                                    yv1Var4.Y5 = null;
                                    ms1 ms1Var = yv1Var4.a0;
                                    if (ms1Var != null) {
                                        ms1Var.N3 = null;
                                        ms1Var.O3 = false;
                                    }
                                    o47 o47Var6 = yv1Var4.x5;
                                    if (o47Var6 != null) {
                                        i62 = ((d) yv1Var4).currentAccount;
                                        k47 k47Var = yv1Var4.F5;
                                        o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                    }
                                    yv1Var4.D6();
                                    break;
                                case 12:
                                    o47 o47Var7 = f57Var3.d0.d;
                                    if (o47Var7.o) {
                                        boolean z8 = !o47Var7.q;
                                        o47Var7.q = z8;
                                        f57Var3.H.a(z8, true);
                                        f57Var3.I.a(o47Var7.q, true);
                                        if (f57Var3.r.e.size() > 0 && (message2 = ((k47) f57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = o47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (f57Var3.r.f.size() > 0 && (message = ((k47) f57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = o47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        f57Var3.i();
                                        f57Var3.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o47 o47Var8 = f57Var3.d0.d;
                                    boolean z11 = o47Var8.r;
                                    o47Var8.r = !z11;
                                    f57Var3.F.a(z11, true);
                                    if (f57Var3.r.e.size() > 0 && (message4 = ((k47) f57Var3.r.e.get(0)).k) != null) {
                                        message4.invert_media = o47Var8.r;
                                    }
                                    if (f57Var3.r.f.size() > 0 && (message3 = ((k47) f57Var3.r.f.get(0)).k) != null) {
                                        message3.invert_media = o47Var8.r;
                                    }
                                    f57Var3.i();
                                    f57Var3.V = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    a8 a8Var4 = new a8(1, l57Var.G, context3, false, false);
                    this.E = a8Var4;
                    a8Var4.j(jb6.M0(2131746161, r11), R.drawable.msg_forward_replace, r11);
                    final byte b8 = 4;
                    a8Var4.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                        public final /* synthetic */ f57 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i62;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b62 = b8;
                            f57 f57Var3 = this.b;
                            switch (b62) {
                                case 0:
                                    f57Var3.d0.d.d = null;
                                    f57Var3.e.e(false);
                                    f57Var3.g(false, false);
                                    f57Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z47 z47Var2 = f57Var3.e;
                                    l57 l57Var2 = f57Var3.d0;
                                    if (f57Var3.a(null) != null) {
                                        if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                            nkb nkbVar = z47Var2.W;
                                            k47 a = f57Var3.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                            o47 o47Var4 = l57Var2.d;
                                            int i72 = z47Var2.u;
                                            o47Var4.e = i72;
                                            int i8 = z47Var2.v;
                                            o47Var4.f = i8;
                                            o47Var4.d = nv1.b(i72, i8, a);
                                            l57Var2.b();
                                            l57Var2.a(true);
                                            break;
                                        } else {
                                            f57Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z47 z47Var3 = f57Var3.e;
                                    l57 l57Var3 = f57Var3.d0;
                                    o47 o47Var5 = l57Var3.d;
                                    int i9 = l57Var3.x;
                                    boolean z72 = l57Var3.b;
                                    if (o47Var5.d != null && !z72) {
                                        o47Var5.d = null;
                                        z47Var3.e(false);
                                        f57Var3.g(false, true);
                                        f57Var3.l(true);
                                        break;
                                    } else if (z47Var3.v - z47Var3.u <= oc7.r1(i9).l4.N1.f()) {
                                        k47 a2 = f57Var3.a(null);
                                        if (a2 != null) {
                                            if (!z47Var3.w()) {
                                                o47Var5.e = 0;
                                                int min = Math.min(oc7.r1(i9).l4.N1.f(), nv1.d(a2));
                                                o47Var5.f = min;
                                                o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                                View b72 = f57Var3.b();
                                                if (b72 instanceof rc2) {
                                                    z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                                }
                                                if (!z72) {
                                                    f57Var3.s.getSwipeBack().e(f57Var3.J);
                                                }
                                                f57Var3.g(true, true);
                                                break;
                                            } else {
                                                o47Var5.e = z47Var3.u;
                                                o47Var5.f = z47Var3.v;
                                                nkb nkbVar2 = z47Var3.W;
                                                o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var3.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                                l57Var3.b();
                                                l57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f57Var3.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f57Var3.d0.c(false);
                                    break;
                                case 4:
                                    f57Var3.d0.c(false);
                                    break;
                                case 5:
                                    f57Var3.d0.a(true);
                                    break;
                                case 6:
                                    l57 l57Var4 = f57Var3.d0;
                                    if (!l57Var4.b) {
                                        jt1 jt1Var = (jt1) l57Var4;
                                        jt1Var.a(true);
                                        yv1 yv1Var = jt1Var.I;
                                        yv1Var.F5 = null;
                                        yv1Var.D5 = null;
                                        yv1Var.x5.f(null, null, yv1Var.l6, null);
                                        yv1Var.D6();
                                        break;
                                    } else {
                                        jt1 jt1Var2 = (jt1) l57Var4;
                                        jt1Var2.a(true);
                                        yv1 yv1Var2 = jt1Var2.I;
                                        yv1Var2.D5 = null;
                                        yv1Var2.dc(yv1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f57Var3.d0.c(true);
                                    break;
                                case 8:
                                    f57Var3.d0.a(true);
                                    break;
                                case 9:
                                    jt1 jt1Var3 = (jt1) f57Var3.d0;
                                    jt1Var3.a(true);
                                    yv1 yv1Var3 = jt1Var3.I;
                                    yv1Var3.x5.d(null, yv1Var3.l6);
                                    yv1Var3.D6();
                                    break;
                                case 10:
                                    f57Var3.d0.a(true);
                                    break;
                                case 11:
                                    jt1 jt1Var4 = (jt1) f57Var3.d0;
                                    jt1Var4.a(true);
                                    yv1 yv1Var4 = jt1Var4.I;
                                    yv1Var4.Y5 = null;
                                    ms1 ms1Var = yv1Var4.a0;
                                    if (ms1Var != null) {
                                        ms1Var.N3 = null;
                                        ms1Var.O3 = false;
                                    }
                                    o47 o47Var6 = yv1Var4.x5;
                                    if (o47Var6 != null) {
                                        i62 = ((d) yv1Var4).currentAccount;
                                        k47 k47Var = yv1Var4.F5;
                                        o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                    }
                                    yv1Var4.D6();
                                    break;
                                case 12:
                                    o47 o47Var7 = f57Var3.d0.d;
                                    if (o47Var7.o) {
                                        boolean z8 = !o47Var7.q;
                                        o47Var7.q = z8;
                                        f57Var3.H.a(z8, true);
                                        f57Var3.I.a(o47Var7.q, true);
                                        if (f57Var3.r.e.size() > 0 && (message2 = ((k47) f57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = o47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (f57Var3.r.f.size() > 0 && (message = ((k47) f57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = o47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        f57Var3.i();
                                        f57Var3.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o47 o47Var8 = f57Var3.d0.d;
                                    boolean z11 = o47Var8.r;
                                    o47Var8.r = !z11;
                                    f57Var3.F.a(z11, true);
                                    if (f57Var3.r.e.size() > 0 && (message4 = ((k47) f57Var3.r.e.get(0)).k) != null) {
                                        message4.invert_media = o47Var8.r;
                                    }
                                    if (f57Var3.r.f.size() > 0 && (message3 = ((k47) f57Var3.r.f.get(0)).k) != null) {
                                        message3.invert_media = o47Var8.r;
                                    }
                                    f57Var3.i();
                                    f57Var3.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView(a8Var4, qoe.c(f2, -1));
                    frameLayout2.addView(a8Var3, qoe.c(f2, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, qoe.o(-1, 48));
                }
                if (!z2 && !o47Var.u) {
                    View j8Var2 = new j8(context3, h57Var);
                    anb.i(j8Var2, anb.K(0.06f, cmb.D8), h57Var);
                    j8Var2.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var2, qoe.o(-1, 8));
                }
                g(o47Var.d != null, false);
                a8 a8Var5 = new a8(1, l57Var.G, context3, false, false);
                a8Var5.j(jb6.M0(2131754183, r11), R.drawable.msg_select, r11);
                final byte b9 = 5;
                a8Var5.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                    public final /* synthetic */ f57 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i62;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        byte b62 = b9;
                        f57 f57Var3 = this.b;
                        switch (b62) {
                            case 0:
                                f57Var3.d0.d.d = null;
                                f57Var3.e.e(false);
                                f57Var3.g(false, false);
                                f57Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                z47 z47Var2 = f57Var3.e;
                                l57 l57Var2 = f57Var3.d0;
                                if (f57Var3.a(null) != null) {
                                    if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                        nkb nkbVar = z47Var2.W;
                                        k47 a = f57Var3.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                        o47 o47Var4 = l57Var2.d;
                                        int i72 = z47Var2.u;
                                        o47Var4.e = i72;
                                        int i8 = z47Var2.v;
                                        o47Var4.f = i8;
                                        o47Var4.d = nv1.b(i72, i8, a);
                                        l57Var2.b();
                                        l57Var2.a(true);
                                        break;
                                    } else {
                                        f57Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                z47 z47Var3 = f57Var3.e;
                                l57 l57Var3 = f57Var3.d0;
                                o47 o47Var5 = l57Var3.d;
                                int i9 = l57Var3.x;
                                boolean z72 = l57Var3.b;
                                if (o47Var5.d != null && !z72) {
                                    o47Var5.d = null;
                                    z47Var3.e(false);
                                    f57Var3.g(false, true);
                                    f57Var3.l(true);
                                    break;
                                } else if (z47Var3.v - z47Var3.u <= oc7.r1(i9).l4.N1.f()) {
                                    k47 a2 = f57Var3.a(null);
                                    if (a2 != null) {
                                        if (!z47Var3.w()) {
                                            o47Var5.e = 0;
                                            int min = Math.min(oc7.r1(i9).l4.N1.f(), nv1.d(a2));
                                            o47Var5.f = min;
                                            o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                            View b72 = f57Var3.b();
                                            if (b72 instanceof rc2) {
                                                z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                            }
                                            if (!z72) {
                                                f57Var3.s.getSwipeBack().e(f57Var3.J);
                                            }
                                            f57Var3.g(true, true);
                                            break;
                                        } else {
                                            o47Var5.e = z47Var3.u;
                                            o47Var5.f = z47Var3.v;
                                            nkb nkbVar2 = z47Var3.W;
                                            o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var3.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                            l57Var3.b();
                                            l57Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    f57Var3.f();
                                    break;
                                }
                                break;
                            case 3:
                                f57Var3.d0.c(false);
                                break;
                            case 4:
                                f57Var3.d0.c(false);
                                break;
                            case 5:
                                f57Var3.d0.a(true);
                                break;
                            case 6:
                                l57 l57Var4 = f57Var3.d0;
                                if (!l57Var4.b) {
                                    jt1 jt1Var = (jt1) l57Var4;
                                    jt1Var.a(true);
                                    yv1 yv1Var = jt1Var.I;
                                    yv1Var.F5 = null;
                                    yv1Var.D5 = null;
                                    yv1Var.x5.f(null, null, yv1Var.l6, null);
                                    yv1Var.D6();
                                    break;
                                } else {
                                    jt1 jt1Var2 = (jt1) l57Var4;
                                    jt1Var2.a(true);
                                    yv1 yv1Var2 = jt1Var2.I;
                                    yv1Var2.D5 = null;
                                    yv1Var2.dc(yv1Var2.F5);
                                    break;
                                }
                            case 7:
                                f57Var3.d0.c(true);
                                break;
                            case 8:
                                f57Var3.d0.a(true);
                                break;
                            case 9:
                                jt1 jt1Var3 = (jt1) f57Var3.d0;
                                jt1Var3.a(true);
                                yv1 yv1Var3 = jt1Var3.I;
                                yv1Var3.x5.d(null, yv1Var3.l6);
                                yv1Var3.D6();
                                break;
                            case 10:
                                f57Var3.d0.a(true);
                                break;
                            case 11:
                                jt1 jt1Var4 = (jt1) f57Var3.d0;
                                jt1Var4.a(true);
                                yv1 yv1Var4 = jt1Var4.I;
                                yv1Var4.Y5 = null;
                                ms1 ms1Var = yv1Var4.a0;
                                if (ms1Var != null) {
                                    ms1Var.N3 = null;
                                    ms1Var.O3 = false;
                                }
                                o47 o47Var6 = yv1Var4.x5;
                                if (o47Var6 != null) {
                                    i62 = ((d) yv1Var4).currentAccount;
                                    k47 k47Var = yv1Var4.F5;
                                    o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                }
                                yv1Var4.D6();
                                break;
                            case 12:
                                o47 o47Var7 = f57Var3.d0.d;
                                if (o47Var7.o) {
                                    boolean z8 = !o47Var7.q;
                                    o47Var7.q = z8;
                                    f57Var3.H.a(z8, true);
                                    f57Var3.I.a(o47Var7.q, true);
                                    if (f57Var3.r.e.size() > 0 && (message2 = ((k47) f57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z9 = o47Var7.q;
                                        messageMedia2.force_small_media = z9;
                                        messageMedia2.force_large_media = !z9;
                                    }
                                    if (f57Var3.r.f.size() > 0 && (message = ((k47) f57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z10 = o47Var7.q;
                                        messageMedia.force_small_media = z10;
                                        messageMedia.force_large_media = !z10;
                                    }
                                    f57Var3.i();
                                    f57Var3.V = true;
                                    break;
                                }
                                break;
                            default:
                                o47 o47Var8 = f57Var3.d0.d;
                                boolean z11 = o47Var8.r;
                                o47Var8.r = !z11;
                                f57Var3.F.a(z11, true);
                                if (f57Var3.r.e.size() > 0 && (message4 = ((k47) f57Var3.r.e.get(0)).k) != null) {
                                    message4.invert_media = o47Var8.r;
                                }
                                if (f57Var3.r.f.size() > 0 && (message3 = ((k47) f57Var3.r.f.get(0)).k) != null) {
                                    message3.invert_media = o47Var8.r;
                                }
                                f57Var3.i();
                                f57Var3.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var5, qoe.o(-1, 48));
                a8 a8Var6 = new a8(1, l57Var.G, context, false, true);
                a8Var6.j(jb6.M0(z4 ? 2131751297 : 2131751296, r11), R.drawable.msg_delete, r11);
                int i8 = cmb.p7;
                int i9 = cmb.o7;
                a8Var6.c(i8, i9);
                a8Var6.h(0.12f, i9);
                final byte b10 = 6;
                a8Var6.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                    public final /* synthetic */ f57 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i62;
                        TLRPC.Message message;
                        TLRPC.MessageMedia messageMedia;
                        TLRPC.Message message2;
                        TLRPC.MessageMedia messageMedia2;
                        TLRPC.Message message3;
                        TLRPC.Message message4;
                        byte b62 = b10;
                        f57 f57Var3 = this.b;
                        switch (b62) {
                            case 0:
                                f57Var3.d0.d.d = null;
                                f57Var3.e.e(false);
                                f57Var3.g(false, false);
                                f57Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                z47 z47Var2 = f57Var3.e;
                                l57 l57Var2 = f57Var3.d0;
                                if (f57Var3.a(null) != null) {
                                    if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                        nkb nkbVar = z47Var2.W;
                                        k47 a = f57Var3.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                        o47 o47Var4 = l57Var2.d;
                                        int i72 = z47Var2.u;
                                        o47Var4.e = i72;
                                        int i82 = z47Var2.v;
                                        o47Var4.f = i82;
                                        o47Var4.d = nv1.b(i72, i82, a);
                                        l57Var2.b();
                                        l57Var2.a(true);
                                        break;
                                    } else {
                                        f57Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                z47 z47Var3 = f57Var3.e;
                                l57 l57Var3 = f57Var3.d0;
                                o47 o47Var5 = l57Var3.d;
                                int i92 = l57Var3.x;
                                boolean z72 = l57Var3.b;
                                if (o47Var5.d != null && !z72) {
                                    o47Var5.d = null;
                                    z47Var3.e(false);
                                    f57Var3.g(false, true);
                                    f57Var3.l(true);
                                    break;
                                } else if (z47Var3.v - z47Var3.u <= oc7.r1(i92).l4.N1.f()) {
                                    k47 a2 = f57Var3.a(null);
                                    if (a2 != null) {
                                        if (!z47Var3.w()) {
                                            o47Var5.e = 0;
                                            int min = Math.min(oc7.r1(i92).l4.N1.f(), nv1.d(a2));
                                            o47Var5.f = min;
                                            o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                            View b72 = f57Var3.b();
                                            if (b72 instanceof rc2) {
                                                z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                            }
                                            if (!z72) {
                                                f57Var3.s.getSwipeBack().e(f57Var3.J);
                                            }
                                            f57Var3.g(true, true);
                                            break;
                                        } else {
                                            o47Var5.e = z47Var3.u;
                                            o47Var5.f = z47Var3.v;
                                            nkb nkbVar2 = z47Var3.W;
                                            o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var3.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                            l57Var3.b();
                                            l57Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    f57Var3.f();
                                    break;
                                }
                                break;
                            case 3:
                                f57Var3.d0.c(false);
                                break;
                            case 4:
                                f57Var3.d0.c(false);
                                break;
                            case 5:
                                f57Var3.d0.a(true);
                                break;
                            case 6:
                                l57 l57Var4 = f57Var3.d0;
                                if (!l57Var4.b) {
                                    jt1 jt1Var = (jt1) l57Var4;
                                    jt1Var.a(true);
                                    yv1 yv1Var = jt1Var.I;
                                    yv1Var.F5 = null;
                                    yv1Var.D5 = null;
                                    yv1Var.x5.f(null, null, yv1Var.l6, null);
                                    yv1Var.D6();
                                    break;
                                } else {
                                    jt1 jt1Var2 = (jt1) l57Var4;
                                    jt1Var2.a(true);
                                    yv1 yv1Var2 = jt1Var2.I;
                                    yv1Var2.D5 = null;
                                    yv1Var2.dc(yv1Var2.F5);
                                    break;
                                }
                            case 7:
                                f57Var3.d0.c(true);
                                break;
                            case 8:
                                f57Var3.d0.a(true);
                                break;
                            case 9:
                                jt1 jt1Var3 = (jt1) f57Var3.d0;
                                jt1Var3.a(true);
                                yv1 yv1Var3 = jt1Var3.I;
                                yv1Var3.x5.d(null, yv1Var3.l6);
                                yv1Var3.D6();
                                break;
                            case 10:
                                f57Var3.d0.a(true);
                                break;
                            case 11:
                                jt1 jt1Var4 = (jt1) f57Var3.d0;
                                jt1Var4.a(true);
                                yv1 yv1Var4 = jt1Var4.I;
                                yv1Var4.Y5 = null;
                                ms1 ms1Var = yv1Var4.a0;
                                if (ms1Var != null) {
                                    ms1Var.N3 = null;
                                    ms1Var.O3 = false;
                                }
                                o47 o47Var6 = yv1Var4.x5;
                                if (o47Var6 != null) {
                                    i62 = ((d) yv1Var4).currentAccount;
                                    k47 k47Var = yv1Var4.F5;
                                    o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                }
                                yv1Var4.D6();
                                break;
                            case 12:
                                o47 o47Var7 = f57Var3.d0.d;
                                if (o47Var7.o) {
                                    boolean z8 = !o47Var7.q;
                                    o47Var7.q = z8;
                                    f57Var3.H.a(z8, true);
                                    f57Var3.I.a(o47Var7.q, true);
                                    if (f57Var3.r.e.size() > 0 && (message2 = ((k47) f57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z9 = o47Var7.q;
                                        messageMedia2.force_small_media = z9;
                                        messageMedia2.force_large_media = !z9;
                                    }
                                    if (f57Var3.r.f.size() > 0 && (message = ((k47) f57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z10 = o47Var7.q;
                                        messageMedia.force_small_media = z10;
                                        messageMedia.force_large_media = !z10;
                                    }
                                    f57Var3.i();
                                    f57Var3.V = true;
                                    break;
                                }
                                break;
                            default:
                                o47 o47Var8 = f57Var3.d0.d;
                                boolean z11 = o47Var8.r;
                                o47Var8.r = !z11;
                                f57Var3.F.a(z11, true);
                                if (f57Var3.r.e.size() > 0 && (message4 = ((k47) f57Var3.r.e.get(0)).k) != null) {
                                    message4.invert_media = o47Var8.r;
                                }
                                if (f57Var3.r.f.size() > 0 && (message3 = ((k47) f57Var3.r.f.get(0)).k) != null) {
                                    message3.invert_media = o47Var8.r;
                                }
                                f57Var3.i();
                                f57Var3.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var6, qoe.o(-1, 48));
                context2 = context;
                f57Var2 = this;
                viewOutlineProvider = r11;
                i2 = f57Var2.a;
                if (i2 == 1) {
                    f57Var2.r = o47Var.b;
                } else if (i2 == 0) {
                    f57Var2.r = o47Var.a;
                } else if (i2 == 2) {
                    f57Var2.r = o47Var.c;
                }
                m = f57Var2.e.m(context2);
                f57Var2.d = m;
                m.setElevation(gm.L(8.0f));
                m.setOutlineProvider(viewOutlineProvider);
                if (m.getParent() instanceof ViewGroup) {
                    ((ViewGroup) m.getParent()).removeView(m);
                }
                f57Var2.addView(m, qoe.d(-1, -1.0f, 51, 0.0f, a.getCurrentActionBarHeight() / gm.p, 0.0f, 0.0f));
                f57Var2.e.Q(f57Var2.f);
            }
        }
        o47Var = o47Var3;
        viewOutlineProvider = null;
        viewOutlineProvider = null;
        if (i != 1 || o47Var.b == null) {
            final f57 f57Var3 = this;
            f57Var = f57Var3;
            if (i == 2) {
                f57Var = f57Var3;
                if (o47Var.c != null) {
                    k57 k57Var3 = new k57(context, R.raw.position_below, jb6.M0(2131748684, null), R.raw.position_above, jb6.M0(2131748680, null), l57Var.G);
                    f57Var3.F = k57Var3;
                    k57Var3.a(!o47Var.r, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(k57Var3, qoe.o(-1, 48));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    f57Var3.G = frameLayout3;
                    int i10 = cmb.H5;
                    fg0 Y2 = cmb.Y(cmb.v0(i10, h57Var), 0, 0);
                    wmb M2 = anb.M(i10);
                    frameLayout3.setBackground(Y2);
                    anb.j(frameLayout3, Y2, null, M2, h57Var);
                    k57 k57Var4 = new k57(context, R.raw.media_shrink, jb6.M0(2131748656, null), R.raw.media_enlarge, jb6.M0(2131748655, null), l57Var.G);
                    f57Var3.H = k57Var4;
                    k57Var4.setBackground(null);
                    k57Var4.setVisibility(o47Var.p ? 4 : 0);
                    frameLayout3.addView(k57Var4, qoe.o(-1, 48));
                    k57 k57Var5 = new k57(context, R.raw.media_shrink, jb6.M0(2131748642, null), R.raw.media_enlarge, jb6.M0(2131748641, null), l57Var.G);
                    f57Var3.I = k57Var5;
                    k57Var5.setBackground(null);
                    k57Var5.setVisibility(!o47Var.p ? 4 : 0);
                    frameLayout3.setAlpha(o47Var.o ? 1.0f : 0.5f);
                    frameLayout3.addView(k57Var5, qoe.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, qoe.o(-1, 48));
                    frameLayout3.setVisibility((!o47Var.n || o47Var.o) ? 0 : 8);
                    k57Var4.a(o47Var.q, false);
                    k57Var5.a(o47Var.q, false);
                    View j8Var3 = new j8(context, h57Var);
                    anb.i(j8Var3, anb.K(0.06f, cmb.D8), h57Var);
                    j8Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(j8Var3, qoe.o(-1, 8));
                    a8 a8Var7 = new a8(1, l57Var.G, context, false, false);
                    a8Var7.j(jb6.M0(2131754183, null), R.drawable.msg_select, null);
                    final byte b11 = 10;
                    a8Var7.setOnClickListener(new View.OnClickListener(f57Var3) { // from class: t47
                        public final /* synthetic */ f57 b;

                        {
                            this.b = f57Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i62;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b62 = b11;
                            f57 f57Var32 = this.b;
                            switch (b62) {
                                case 0:
                                    f57Var32.d0.d.d = null;
                                    f57Var32.e.e(false);
                                    f57Var32.g(false, false);
                                    f57Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z47 z47Var2 = f57Var32.e;
                                    l57 l57Var2 = f57Var32.d0;
                                    if (f57Var32.a(null) != null) {
                                        if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                            nkb nkbVar = z47Var2.W;
                                            k47 a = f57Var32.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                            o47 o47Var4 = l57Var2.d;
                                            int i72 = z47Var2.u;
                                            o47Var4.e = i72;
                                            int i82 = z47Var2.v;
                                            o47Var4.f = i82;
                                            o47Var4.d = nv1.b(i72, i82, a);
                                            l57Var2.b();
                                            l57Var2.a(true);
                                            break;
                                        } else {
                                            f57Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z47 z47Var3 = f57Var32.e;
                                    l57 l57Var3 = f57Var32.d0;
                                    o47 o47Var5 = l57Var3.d;
                                    int i92 = l57Var3.x;
                                    boolean z72 = l57Var3.b;
                                    if (o47Var5.d != null && !z72) {
                                        o47Var5.d = null;
                                        z47Var3.e(false);
                                        f57Var32.g(false, true);
                                        f57Var32.l(true);
                                        break;
                                    } else if (z47Var3.v - z47Var3.u <= oc7.r1(i92).l4.N1.f()) {
                                        k47 a2 = f57Var32.a(null);
                                        if (a2 != null) {
                                            if (!z47Var3.w()) {
                                                o47Var5.e = 0;
                                                int min = Math.min(oc7.r1(i92).l4.N1.f(), nv1.d(a2));
                                                o47Var5.f = min;
                                                o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                                View b72 = f57Var32.b();
                                                if (b72 instanceof rc2) {
                                                    z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                                }
                                                if (!z72) {
                                                    f57Var32.s.getSwipeBack().e(f57Var32.J);
                                                }
                                                f57Var32.g(true, true);
                                                break;
                                            } else {
                                                o47Var5.e = z47Var3.u;
                                                o47Var5.f = z47Var3.v;
                                                nkb nkbVar2 = z47Var3.W;
                                                o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var32.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                                l57Var3.b();
                                                l57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f57Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f57Var32.d0.c(false);
                                    break;
                                case 4:
                                    f57Var32.d0.c(false);
                                    break;
                                case 5:
                                    f57Var32.d0.a(true);
                                    break;
                                case 6:
                                    l57 l57Var4 = f57Var32.d0;
                                    if (!l57Var4.b) {
                                        jt1 jt1Var = (jt1) l57Var4;
                                        jt1Var.a(true);
                                        yv1 yv1Var = jt1Var.I;
                                        yv1Var.F5 = null;
                                        yv1Var.D5 = null;
                                        yv1Var.x5.f(null, null, yv1Var.l6, null);
                                        yv1Var.D6();
                                        break;
                                    } else {
                                        jt1 jt1Var2 = (jt1) l57Var4;
                                        jt1Var2.a(true);
                                        yv1 yv1Var2 = jt1Var2.I;
                                        yv1Var2.D5 = null;
                                        yv1Var2.dc(yv1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f57Var32.d0.c(true);
                                    break;
                                case 8:
                                    f57Var32.d0.a(true);
                                    break;
                                case 9:
                                    jt1 jt1Var3 = (jt1) f57Var32.d0;
                                    jt1Var3.a(true);
                                    yv1 yv1Var3 = jt1Var3.I;
                                    yv1Var3.x5.d(null, yv1Var3.l6);
                                    yv1Var3.D6();
                                    break;
                                case 10:
                                    f57Var32.d0.a(true);
                                    break;
                                case 11:
                                    jt1 jt1Var4 = (jt1) f57Var32.d0;
                                    jt1Var4.a(true);
                                    yv1 yv1Var4 = jt1Var4.I;
                                    yv1Var4.Y5 = null;
                                    ms1 ms1Var = yv1Var4.a0;
                                    if (ms1Var != null) {
                                        ms1Var.N3 = null;
                                        ms1Var.O3 = false;
                                    }
                                    o47 o47Var6 = yv1Var4.x5;
                                    if (o47Var6 != null) {
                                        i62 = ((d) yv1Var4).currentAccount;
                                        k47 k47Var = yv1Var4.F5;
                                        o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                    }
                                    yv1Var4.D6();
                                    break;
                                case 12:
                                    o47 o47Var7 = f57Var32.d0.d;
                                    if (o47Var7.o) {
                                        boolean z8 = !o47Var7.q;
                                        o47Var7.q = z8;
                                        f57Var32.H.a(z8, true);
                                        f57Var32.I.a(o47Var7.q, true);
                                        if (f57Var32.r.e.size() > 0 && (message2 = ((k47) f57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = o47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (f57Var32.r.f.size() > 0 && (message = ((k47) f57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = o47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        f57Var32.i();
                                        f57Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o47 o47Var8 = f57Var32.d0.d;
                                    boolean z11 = o47Var8.r;
                                    o47Var8.r = !z11;
                                    f57Var32.F.a(z11, true);
                                    if (f57Var32.r.e.size() > 0 && (message4 = ((k47) f57Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = o47Var8.r;
                                    }
                                    if (f57Var32.r.f.size() > 0 && (message3 = ((k47) f57Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = o47Var8.r;
                                    }
                                    f57Var32.i();
                                    f57Var32.V = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var7, qoe.o(-1, 48));
                    a8 a8Var8 = new a8(1, l57Var.G, context, false, true);
                    context2 = context;
                    a8Var8.j(jb6.M0(2131751298, null), R.drawable.msg_delete, null);
                    int i11 = cmb.p7;
                    int i12 = cmb.o7;
                    a8Var8.c(i11, i12);
                    final byte b12 = 11;
                    a8Var8.setOnClickListener(new View.OnClickListener(f57Var3) { // from class: t47
                        public final /* synthetic */ f57 b;

                        {
                            this.b = f57Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i62;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b62 = b12;
                            f57 f57Var32 = this.b;
                            switch (b62) {
                                case 0:
                                    f57Var32.d0.d.d = null;
                                    f57Var32.e.e(false);
                                    f57Var32.g(false, false);
                                    f57Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z47 z47Var2 = f57Var32.e;
                                    l57 l57Var2 = f57Var32.d0;
                                    if (f57Var32.a(null) != null) {
                                        if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                            nkb nkbVar = z47Var2.W;
                                            k47 a = f57Var32.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                            o47 o47Var4 = l57Var2.d;
                                            int i72 = z47Var2.u;
                                            o47Var4.e = i72;
                                            int i82 = z47Var2.v;
                                            o47Var4.f = i82;
                                            o47Var4.d = nv1.b(i72, i82, a);
                                            l57Var2.b();
                                            l57Var2.a(true);
                                            break;
                                        } else {
                                            f57Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z47 z47Var3 = f57Var32.e;
                                    l57 l57Var3 = f57Var32.d0;
                                    o47 o47Var5 = l57Var3.d;
                                    int i92 = l57Var3.x;
                                    boolean z72 = l57Var3.b;
                                    if (o47Var5.d != null && !z72) {
                                        o47Var5.d = null;
                                        z47Var3.e(false);
                                        f57Var32.g(false, true);
                                        f57Var32.l(true);
                                        break;
                                    } else if (z47Var3.v - z47Var3.u <= oc7.r1(i92).l4.N1.f()) {
                                        k47 a2 = f57Var32.a(null);
                                        if (a2 != null) {
                                            if (!z47Var3.w()) {
                                                o47Var5.e = 0;
                                                int min = Math.min(oc7.r1(i92).l4.N1.f(), nv1.d(a2));
                                                o47Var5.f = min;
                                                o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                                View b72 = f57Var32.b();
                                                if (b72 instanceof rc2) {
                                                    z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                                }
                                                if (!z72) {
                                                    f57Var32.s.getSwipeBack().e(f57Var32.J);
                                                }
                                                f57Var32.g(true, true);
                                                break;
                                            } else {
                                                o47Var5.e = z47Var3.u;
                                                o47Var5.f = z47Var3.v;
                                                nkb nkbVar2 = z47Var3.W;
                                                o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var32.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                                l57Var3.b();
                                                l57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f57Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f57Var32.d0.c(false);
                                    break;
                                case 4:
                                    f57Var32.d0.c(false);
                                    break;
                                case 5:
                                    f57Var32.d0.a(true);
                                    break;
                                case 6:
                                    l57 l57Var4 = f57Var32.d0;
                                    if (!l57Var4.b) {
                                        jt1 jt1Var = (jt1) l57Var4;
                                        jt1Var.a(true);
                                        yv1 yv1Var = jt1Var.I;
                                        yv1Var.F5 = null;
                                        yv1Var.D5 = null;
                                        yv1Var.x5.f(null, null, yv1Var.l6, null);
                                        yv1Var.D6();
                                        break;
                                    } else {
                                        jt1 jt1Var2 = (jt1) l57Var4;
                                        jt1Var2.a(true);
                                        yv1 yv1Var2 = jt1Var2.I;
                                        yv1Var2.D5 = null;
                                        yv1Var2.dc(yv1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f57Var32.d0.c(true);
                                    break;
                                case 8:
                                    f57Var32.d0.a(true);
                                    break;
                                case 9:
                                    jt1 jt1Var3 = (jt1) f57Var32.d0;
                                    jt1Var3.a(true);
                                    yv1 yv1Var3 = jt1Var3.I;
                                    yv1Var3.x5.d(null, yv1Var3.l6);
                                    yv1Var3.D6();
                                    break;
                                case 10:
                                    f57Var32.d0.a(true);
                                    break;
                                case 11:
                                    jt1 jt1Var4 = (jt1) f57Var32.d0;
                                    jt1Var4.a(true);
                                    yv1 yv1Var4 = jt1Var4.I;
                                    yv1Var4.Y5 = null;
                                    ms1 ms1Var = yv1Var4.a0;
                                    if (ms1Var != null) {
                                        ms1Var.N3 = null;
                                        ms1Var.O3 = false;
                                    }
                                    o47 o47Var6 = yv1Var4.x5;
                                    if (o47Var6 != null) {
                                        i62 = ((d) yv1Var4).currentAccount;
                                        k47 k47Var = yv1Var4.F5;
                                        o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                    }
                                    yv1Var4.D6();
                                    break;
                                case 12:
                                    o47 o47Var7 = f57Var32.d0.d;
                                    if (o47Var7.o) {
                                        boolean z8 = !o47Var7.q;
                                        o47Var7.q = z8;
                                        f57Var32.H.a(z8, true);
                                        f57Var32.I.a(o47Var7.q, true);
                                        if (f57Var32.r.e.size() > 0 && (message2 = ((k47) f57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = o47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (f57Var32.r.f.size() > 0 && (message = ((k47) f57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = o47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        f57Var32.i();
                                        f57Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o47 o47Var8 = f57Var32.d0.d;
                                    boolean z11 = o47Var8.r;
                                    o47Var8.r = !z11;
                                    f57Var32.F.a(z11, true);
                                    if (f57Var32.r.e.size() > 0 && (message4 = ((k47) f57Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = o47Var8.r;
                                    }
                                    if (f57Var32.r.f.size() > 0 && (message3 = ((k47) f57Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = o47Var8.r;
                                    }
                                    f57Var32.i();
                                    f57Var32.V = true;
                                    break;
                            }
                        }
                    });
                    a8Var8.h(0.12f, i12);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var8, qoe.o(-1, 48));
                    final byte b13 = 12;
                    frameLayout3.setOnClickListener(new View.OnClickListener(f57Var3) { // from class: t47
                        public final /* synthetic */ f57 b;

                        {
                            this.b = f57Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i62;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b62 = b13;
                            f57 f57Var32 = this.b;
                            switch (b62) {
                                case 0:
                                    f57Var32.d0.d.d = null;
                                    f57Var32.e.e(false);
                                    f57Var32.g(false, false);
                                    f57Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z47 z47Var2 = f57Var32.e;
                                    l57 l57Var2 = f57Var32.d0;
                                    if (f57Var32.a(null) != null) {
                                        if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                            nkb nkbVar = z47Var2.W;
                                            k47 a = f57Var32.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                            o47 o47Var4 = l57Var2.d;
                                            int i72 = z47Var2.u;
                                            o47Var4.e = i72;
                                            int i82 = z47Var2.v;
                                            o47Var4.f = i82;
                                            o47Var4.d = nv1.b(i72, i82, a);
                                            l57Var2.b();
                                            l57Var2.a(true);
                                            break;
                                        } else {
                                            f57Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z47 z47Var3 = f57Var32.e;
                                    l57 l57Var3 = f57Var32.d0;
                                    o47 o47Var5 = l57Var3.d;
                                    int i92 = l57Var3.x;
                                    boolean z72 = l57Var3.b;
                                    if (o47Var5.d != null && !z72) {
                                        o47Var5.d = null;
                                        z47Var3.e(false);
                                        f57Var32.g(false, true);
                                        f57Var32.l(true);
                                        break;
                                    } else if (z47Var3.v - z47Var3.u <= oc7.r1(i92).l4.N1.f()) {
                                        k47 a2 = f57Var32.a(null);
                                        if (a2 != null) {
                                            if (!z47Var3.w()) {
                                                o47Var5.e = 0;
                                                int min = Math.min(oc7.r1(i92).l4.N1.f(), nv1.d(a2));
                                                o47Var5.f = min;
                                                o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                                View b72 = f57Var32.b();
                                                if (b72 instanceof rc2) {
                                                    z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                                }
                                                if (!z72) {
                                                    f57Var32.s.getSwipeBack().e(f57Var32.J);
                                                }
                                                f57Var32.g(true, true);
                                                break;
                                            } else {
                                                o47Var5.e = z47Var3.u;
                                                o47Var5.f = z47Var3.v;
                                                nkb nkbVar2 = z47Var3.W;
                                                o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var32.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                                l57Var3.b();
                                                l57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f57Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f57Var32.d0.c(false);
                                    break;
                                case 4:
                                    f57Var32.d0.c(false);
                                    break;
                                case 5:
                                    f57Var32.d0.a(true);
                                    break;
                                case 6:
                                    l57 l57Var4 = f57Var32.d0;
                                    if (!l57Var4.b) {
                                        jt1 jt1Var = (jt1) l57Var4;
                                        jt1Var.a(true);
                                        yv1 yv1Var = jt1Var.I;
                                        yv1Var.F5 = null;
                                        yv1Var.D5 = null;
                                        yv1Var.x5.f(null, null, yv1Var.l6, null);
                                        yv1Var.D6();
                                        break;
                                    } else {
                                        jt1 jt1Var2 = (jt1) l57Var4;
                                        jt1Var2.a(true);
                                        yv1 yv1Var2 = jt1Var2.I;
                                        yv1Var2.D5 = null;
                                        yv1Var2.dc(yv1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f57Var32.d0.c(true);
                                    break;
                                case 8:
                                    f57Var32.d0.a(true);
                                    break;
                                case 9:
                                    jt1 jt1Var3 = (jt1) f57Var32.d0;
                                    jt1Var3.a(true);
                                    yv1 yv1Var3 = jt1Var3.I;
                                    yv1Var3.x5.d(null, yv1Var3.l6);
                                    yv1Var3.D6();
                                    break;
                                case 10:
                                    f57Var32.d0.a(true);
                                    break;
                                case 11:
                                    jt1 jt1Var4 = (jt1) f57Var32.d0;
                                    jt1Var4.a(true);
                                    yv1 yv1Var4 = jt1Var4.I;
                                    yv1Var4.Y5 = null;
                                    ms1 ms1Var = yv1Var4.a0;
                                    if (ms1Var != null) {
                                        ms1Var.N3 = null;
                                        ms1Var.O3 = false;
                                    }
                                    o47 o47Var6 = yv1Var4.x5;
                                    if (o47Var6 != null) {
                                        i62 = ((d) yv1Var4).currentAccount;
                                        k47 k47Var = yv1Var4.F5;
                                        o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                    }
                                    yv1Var4.D6();
                                    break;
                                case 12:
                                    o47 o47Var7 = f57Var32.d0.d;
                                    if (o47Var7.o) {
                                        boolean z8 = !o47Var7.q;
                                        o47Var7.q = z8;
                                        f57Var32.H.a(z8, true);
                                        f57Var32.I.a(o47Var7.q, true);
                                        if (f57Var32.r.e.size() > 0 && (message2 = ((k47) f57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = o47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (f57Var32.r.f.size() > 0 && (message = ((k47) f57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = o47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        f57Var32.i();
                                        f57Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o47 o47Var8 = f57Var32.d0.d;
                                    boolean z11 = o47Var8.r;
                                    o47Var8.r = !z11;
                                    f57Var32.F.a(z11, true);
                                    if (f57Var32.r.e.size() > 0 && (message4 = ((k47) f57Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = o47Var8.r;
                                    }
                                    if (f57Var32.r.f.size() > 0 && (message3 = ((k47) f57Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = o47Var8.r;
                                    }
                                    f57Var32.i();
                                    f57Var32.V = true;
                                    break;
                            }
                        }
                    });
                    final byte b14 = 13;
                    k57Var3.setOnClickListener(new View.OnClickListener(f57Var3) { // from class: t47
                        public final /* synthetic */ f57 b;

                        {
                            this.b = f57Var3;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i62;
                            TLRPC.Message message;
                            TLRPC.MessageMedia messageMedia;
                            TLRPC.Message message2;
                            TLRPC.MessageMedia messageMedia2;
                            TLRPC.Message message3;
                            TLRPC.Message message4;
                            byte b62 = b14;
                            f57 f57Var32 = this.b;
                            switch (b62) {
                                case 0:
                                    f57Var32.d0.d.d = null;
                                    f57Var32.e.e(false);
                                    f57Var32.g(false, false);
                                    f57Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    z47 z47Var2 = f57Var32.e;
                                    l57 l57Var2 = f57Var32.d0;
                                    if (f57Var32.a(null) != null) {
                                        if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                            nkb nkbVar = z47Var2.W;
                                            k47 a = f57Var32.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                            o47 o47Var4 = l57Var2.d;
                                            int i72 = z47Var2.u;
                                            o47Var4.e = i72;
                                            int i82 = z47Var2.v;
                                            o47Var4.f = i82;
                                            o47Var4.d = nv1.b(i72, i82, a);
                                            l57Var2.b();
                                            l57Var2.a(true);
                                            break;
                                        } else {
                                            f57Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    z47 z47Var3 = f57Var32.e;
                                    l57 l57Var3 = f57Var32.d0;
                                    o47 o47Var5 = l57Var3.d;
                                    int i92 = l57Var3.x;
                                    boolean z72 = l57Var3.b;
                                    if (o47Var5.d != null && !z72) {
                                        o47Var5.d = null;
                                        z47Var3.e(false);
                                        f57Var32.g(false, true);
                                        f57Var32.l(true);
                                        break;
                                    } else if (z47Var3.v - z47Var3.u <= oc7.r1(i92).l4.N1.f()) {
                                        k47 a2 = f57Var32.a(null);
                                        if (a2 != null) {
                                            if (!z47Var3.w()) {
                                                o47Var5.e = 0;
                                                int min = Math.min(oc7.r1(i92).l4.N1.f(), nv1.d(a2));
                                                o47Var5.f = min;
                                                o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                                View b72 = f57Var32.b();
                                                if (b72 instanceof rc2) {
                                                    z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                                }
                                                if (!z72) {
                                                    f57Var32.s.getSwipeBack().e(f57Var32.J);
                                                }
                                                f57Var32.g(true, true);
                                                break;
                                            } else {
                                                o47Var5.e = z47Var3.u;
                                                o47Var5.f = z47Var3.v;
                                                nkb nkbVar2 = z47Var3.W;
                                                o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var32.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                                l57Var3.b();
                                                l57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        f57Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    f57Var32.d0.c(false);
                                    break;
                                case 4:
                                    f57Var32.d0.c(false);
                                    break;
                                case 5:
                                    f57Var32.d0.a(true);
                                    break;
                                case 6:
                                    l57 l57Var4 = f57Var32.d0;
                                    if (!l57Var4.b) {
                                        jt1 jt1Var = (jt1) l57Var4;
                                        jt1Var.a(true);
                                        yv1 yv1Var = jt1Var.I;
                                        yv1Var.F5 = null;
                                        yv1Var.D5 = null;
                                        yv1Var.x5.f(null, null, yv1Var.l6, null);
                                        yv1Var.D6();
                                        break;
                                    } else {
                                        jt1 jt1Var2 = (jt1) l57Var4;
                                        jt1Var2.a(true);
                                        yv1 yv1Var2 = jt1Var2.I;
                                        yv1Var2.D5 = null;
                                        yv1Var2.dc(yv1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    f57Var32.d0.c(true);
                                    break;
                                case 8:
                                    f57Var32.d0.a(true);
                                    break;
                                case 9:
                                    jt1 jt1Var3 = (jt1) f57Var32.d0;
                                    jt1Var3.a(true);
                                    yv1 yv1Var3 = jt1Var3.I;
                                    yv1Var3.x5.d(null, yv1Var3.l6);
                                    yv1Var3.D6();
                                    break;
                                case 10:
                                    f57Var32.d0.a(true);
                                    break;
                                case 11:
                                    jt1 jt1Var4 = (jt1) f57Var32.d0;
                                    jt1Var4.a(true);
                                    yv1 yv1Var4 = jt1Var4.I;
                                    yv1Var4.Y5 = null;
                                    ms1 ms1Var = yv1Var4.a0;
                                    if (ms1Var != null) {
                                        ms1Var.N3 = null;
                                        ms1Var.O3 = false;
                                    }
                                    o47 o47Var6 = yv1Var4.x5;
                                    if (o47Var6 != null) {
                                        i62 = ((d) yv1Var4).currentAccount;
                                        k47 k47Var = yv1Var4.F5;
                                        o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                                    }
                                    yv1Var4.D6();
                                    break;
                                case 12:
                                    o47 o47Var7 = f57Var32.d0.d;
                                    if (o47Var7.o) {
                                        boolean z8 = !o47Var7.q;
                                        o47Var7.q = z8;
                                        f57Var32.H.a(z8, true);
                                        f57Var32.I.a(o47Var7.q, true);
                                        if (f57Var32.r.e.size() > 0 && (message2 = ((k47) f57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = o47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (f57Var32.r.f.size() > 0 && (message = ((k47) f57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = o47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        f57Var32.i();
                                        f57Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    o47 o47Var8 = f57Var32.d0.d;
                                    boolean z11 = o47Var8.r;
                                    o47Var8.r = !z11;
                                    f57Var32.F.a(z11, true);
                                    if (f57Var32.r.e.size() > 0 && (message4 = ((k47) f57Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = o47Var8.r;
                                    }
                                    if (f57Var32.r.f.size() > 0 && (message3 = ((k47) f57Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = o47Var8.r;
                                    }
                                    f57Var32.i();
                                    f57Var32.V = true;
                                    break;
                            }
                        }
                    });
                    f57Var2 = f57Var3;
                    i2 = f57Var2.a;
                    if (i2 == 1) {
                    }
                    m = f57Var2.e.m(context2);
                    f57Var2.d = m;
                    m.setElevation(gm.L(8.0f));
                    m.setOutlineProvider(viewOutlineProvider);
                    if (m.getParent() instanceof ViewGroup) {
                    }
                    f57Var2.addView(m, qoe.d(-1, -1.0f, 51, 0.0f, a.getCurrentActionBarHeight() / gm.p, 0.0f, 0.0f));
                    f57Var2.e.Q(f57Var2.f);
                }
            }
        } else {
            if (!z8c.h(l57Var.x).p()) {
                for (int i13 = 0; i13 < o47Var.b.e.size(); i13++) {
                    if (((k47) o47Var.b.e.get(i13)).D == 36) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            k57 k57Var6 = new k57(context, R.raw.name_hide, jb6.M0(o47Var.j ? 2131745066 : 2131745065, null), R.raw.name_show, jb6.M0(o47Var.j ? 2131749066 : 2131749065, null), l57Var.G);
            this.s.a(k57Var6, qoe.o(-1, 48));
            if (o47Var.g) {
                k57Var = k57Var6;
                k57 k57Var7 = new k57(context, R.raw.caption_hide, jb6.M0(2131745078, null), R.raw.caption_show, jb6.M0(2131749078, null), l57Var.G);
                k57Var7.a(o47Var.l, false);
                this.s.a(k57Var7, qoe.o(-1, 48));
                k57Var2 = k57Var7;
            } else {
                k57Var = k57Var6;
                k57Var2 = null;
            }
            a8 a8Var9 = new a8(0, l57Var.G, context, true, false);
            final byte b15 = 7;
            a8Var9.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                public final /* synthetic */ f57 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i62;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    byte b62 = b15;
                    f57 f57Var32 = this.b;
                    switch (b62) {
                        case 0:
                            f57Var32.d0.d.d = null;
                            f57Var32.e.e(false);
                            f57Var32.g(false, false);
                            f57Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            z47 z47Var2 = f57Var32.e;
                            l57 l57Var2 = f57Var32.d0;
                            if (f57Var32.a(null) != null) {
                                if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                    nkb nkbVar = z47Var2.W;
                                    k47 a = f57Var32.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                    o47 o47Var4 = l57Var2.d;
                                    int i72 = z47Var2.u;
                                    o47Var4.e = i72;
                                    int i82 = z47Var2.v;
                                    o47Var4.f = i82;
                                    o47Var4.d = nv1.b(i72, i82, a);
                                    l57Var2.b();
                                    l57Var2.a(true);
                                    break;
                                } else {
                                    f57Var32.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            z47 z47Var3 = f57Var32.e;
                            l57 l57Var3 = f57Var32.d0;
                            o47 o47Var5 = l57Var3.d;
                            int i92 = l57Var3.x;
                            boolean z72 = l57Var3.b;
                            if (o47Var5.d != null && !z72) {
                                o47Var5.d = null;
                                z47Var3.e(false);
                                f57Var32.g(false, true);
                                f57Var32.l(true);
                                break;
                            } else if (z47Var3.v - z47Var3.u <= oc7.r1(i92).l4.N1.f()) {
                                k47 a2 = f57Var32.a(null);
                                if (a2 != null) {
                                    if (!z47Var3.w()) {
                                        o47Var5.e = 0;
                                        int min = Math.min(oc7.r1(i92).l4.N1.f(), nv1.d(a2));
                                        o47Var5.f = min;
                                        o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                        View b72 = f57Var32.b();
                                        if (b72 instanceof rc2) {
                                            z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                        }
                                        if (!z72) {
                                            f57Var32.s.getSwipeBack().e(f57Var32.J);
                                        }
                                        f57Var32.g(true, true);
                                        break;
                                    } else {
                                        o47Var5.e = z47Var3.u;
                                        o47Var5.f = z47Var3.v;
                                        nkb nkbVar2 = z47Var3.W;
                                        o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var32.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                        l57Var3.b();
                                        l57Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                f57Var32.f();
                                break;
                            }
                            break;
                        case 3:
                            f57Var32.d0.c(false);
                            break;
                        case 4:
                            f57Var32.d0.c(false);
                            break;
                        case 5:
                            f57Var32.d0.a(true);
                            break;
                        case 6:
                            l57 l57Var4 = f57Var32.d0;
                            if (!l57Var4.b) {
                                jt1 jt1Var = (jt1) l57Var4;
                                jt1Var.a(true);
                                yv1 yv1Var = jt1Var.I;
                                yv1Var.F5 = null;
                                yv1Var.D5 = null;
                                yv1Var.x5.f(null, null, yv1Var.l6, null);
                                yv1Var.D6();
                                break;
                            } else {
                                jt1 jt1Var2 = (jt1) l57Var4;
                                jt1Var2.a(true);
                                yv1 yv1Var2 = jt1Var2.I;
                                yv1Var2.D5 = null;
                                yv1Var2.dc(yv1Var2.F5);
                                break;
                            }
                        case 7:
                            f57Var32.d0.c(true);
                            break;
                        case 8:
                            f57Var32.d0.a(true);
                            break;
                        case 9:
                            jt1 jt1Var3 = (jt1) f57Var32.d0;
                            jt1Var3.a(true);
                            yv1 yv1Var3 = jt1Var3.I;
                            yv1Var3.x5.d(null, yv1Var3.l6);
                            yv1Var3.D6();
                            break;
                        case 10:
                            f57Var32.d0.a(true);
                            break;
                        case 11:
                            jt1 jt1Var4 = (jt1) f57Var32.d0;
                            jt1Var4.a(true);
                            yv1 yv1Var4 = jt1Var4.I;
                            yv1Var4.Y5 = null;
                            ms1 ms1Var = yv1Var4.a0;
                            if (ms1Var != null) {
                                ms1Var.N3 = null;
                                ms1Var.O3 = false;
                            }
                            o47 o47Var6 = yv1Var4.x5;
                            if (o47Var6 != null) {
                                i62 = ((d) yv1Var4).currentAccount;
                                k47 k47Var = yv1Var4.F5;
                                o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                            }
                            yv1Var4.D6();
                            break;
                        case 12:
                            o47 o47Var7 = f57Var32.d0.d;
                            if (o47Var7.o) {
                                boolean z8 = !o47Var7.q;
                                o47Var7.q = z8;
                                f57Var32.H.a(z8, true);
                                f57Var32.I.a(o47Var7.q, true);
                                if (f57Var32.r.e.size() > 0 && (message2 = ((k47) f57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z9 = o47Var7.q;
                                    messageMedia2.force_small_media = z9;
                                    messageMedia2.force_large_media = !z9;
                                }
                                if (f57Var32.r.f.size() > 0 && (message = ((k47) f57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z10 = o47Var7.q;
                                    messageMedia.force_small_media = z10;
                                    messageMedia.force_large_media = !z10;
                                }
                                f57Var32.i();
                                f57Var32.V = true;
                                break;
                            }
                            break;
                        default:
                            o47 o47Var8 = f57Var32.d0.d;
                            boolean z11 = o47Var8.r;
                            o47Var8.r = !z11;
                            f57Var32.F.a(z11, true);
                            if (f57Var32.r.e.size() > 0 && (message4 = ((k47) f57Var32.r.e.get(0)).k) != null) {
                                message4.invert_media = o47Var8.r;
                            }
                            if (f57Var32.r.f.size() > 0 && (message3 = ((k47) f57Var32.r.f.get(0)).k) != null) {
                                message3.invert_media = o47Var8.r;
                            }
                            f57Var32.i();
                            f57Var32.V = true;
                            break;
                    }
                }
            });
            a8Var9.j(jb6.M0(2131752485, null), R.drawable.msg_forward_replace, null);
            this.s.a(a8Var9, qoe.o(-1, 48));
            j8 j8Var4 = new j8(context, h57Var);
            anb.i(j8Var4, anb.K(0.06f, cmb.D8), h57Var);
            j8Var4.setTag(R.id.fit_width_tag, 1);
            final byte b16 = 8;
            this.s.a(j8Var4, qoe.o(-1, 8));
            byte b17 = 7;
            a8 a8Var10 = new a8(1, l57Var.G, context, false, false);
            a8Var10.j(jb6.M0(2131754183, null), R.drawable.msg_select, null);
            a8Var10.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                public final /* synthetic */ f57 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i62;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    byte b62 = b16;
                    f57 f57Var32 = this.b;
                    switch (b62) {
                        case 0:
                            f57Var32.d0.d.d = null;
                            f57Var32.e.e(false);
                            f57Var32.g(false, false);
                            f57Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            z47 z47Var2 = f57Var32.e;
                            l57 l57Var2 = f57Var32.d0;
                            if (f57Var32.a(null) != null) {
                                if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                    nkb nkbVar = z47Var2.W;
                                    k47 a = f57Var32.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                    o47 o47Var4 = l57Var2.d;
                                    int i72 = z47Var2.u;
                                    o47Var4.e = i72;
                                    int i82 = z47Var2.v;
                                    o47Var4.f = i82;
                                    o47Var4.d = nv1.b(i72, i82, a);
                                    l57Var2.b();
                                    l57Var2.a(true);
                                    break;
                                } else {
                                    f57Var32.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            z47 z47Var3 = f57Var32.e;
                            l57 l57Var3 = f57Var32.d0;
                            o47 o47Var5 = l57Var3.d;
                            int i92 = l57Var3.x;
                            boolean z72 = l57Var3.b;
                            if (o47Var5.d != null && !z72) {
                                o47Var5.d = null;
                                z47Var3.e(false);
                                f57Var32.g(false, true);
                                f57Var32.l(true);
                                break;
                            } else if (z47Var3.v - z47Var3.u <= oc7.r1(i92).l4.N1.f()) {
                                k47 a2 = f57Var32.a(null);
                                if (a2 != null) {
                                    if (!z47Var3.w()) {
                                        o47Var5.e = 0;
                                        int min = Math.min(oc7.r1(i92).l4.N1.f(), nv1.d(a2));
                                        o47Var5.f = min;
                                        o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                        View b72 = f57Var32.b();
                                        if (b72 instanceof rc2) {
                                            z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                        }
                                        if (!z72) {
                                            f57Var32.s.getSwipeBack().e(f57Var32.J);
                                        }
                                        f57Var32.g(true, true);
                                        break;
                                    } else {
                                        o47Var5.e = z47Var3.u;
                                        o47Var5.f = z47Var3.v;
                                        nkb nkbVar2 = z47Var3.W;
                                        o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var32.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                        l57Var3.b();
                                        l57Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                f57Var32.f();
                                break;
                            }
                            break;
                        case 3:
                            f57Var32.d0.c(false);
                            break;
                        case 4:
                            f57Var32.d0.c(false);
                            break;
                        case 5:
                            f57Var32.d0.a(true);
                            break;
                        case 6:
                            l57 l57Var4 = f57Var32.d0;
                            if (!l57Var4.b) {
                                jt1 jt1Var = (jt1) l57Var4;
                                jt1Var.a(true);
                                yv1 yv1Var = jt1Var.I;
                                yv1Var.F5 = null;
                                yv1Var.D5 = null;
                                yv1Var.x5.f(null, null, yv1Var.l6, null);
                                yv1Var.D6();
                                break;
                            } else {
                                jt1 jt1Var2 = (jt1) l57Var4;
                                jt1Var2.a(true);
                                yv1 yv1Var2 = jt1Var2.I;
                                yv1Var2.D5 = null;
                                yv1Var2.dc(yv1Var2.F5);
                                break;
                            }
                        case 7:
                            f57Var32.d0.c(true);
                            break;
                        case 8:
                            f57Var32.d0.a(true);
                            break;
                        case 9:
                            jt1 jt1Var3 = (jt1) f57Var32.d0;
                            jt1Var3.a(true);
                            yv1 yv1Var3 = jt1Var3.I;
                            yv1Var3.x5.d(null, yv1Var3.l6);
                            yv1Var3.D6();
                            break;
                        case 10:
                            f57Var32.d0.a(true);
                            break;
                        case 11:
                            jt1 jt1Var4 = (jt1) f57Var32.d0;
                            jt1Var4.a(true);
                            yv1 yv1Var4 = jt1Var4.I;
                            yv1Var4.Y5 = null;
                            ms1 ms1Var = yv1Var4.a0;
                            if (ms1Var != null) {
                                ms1Var.N3 = null;
                                ms1Var.O3 = false;
                            }
                            o47 o47Var6 = yv1Var4.x5;
                            if (o47Var6 != null) {
                                i62 = ((d) yv1Var4).currentAccount;
                                k47 k47Var = yv1Var4.F5;
                                o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                            }
                            yv1Var4.D6();
                            break;
                        case 12:
                            o47 o47Var7 = f57Var32.d0.d;
                            if (o47Var7.o) {
                                boolean z8 = !o47Var7.q;
                                o47Var7.q = z8;
                                f57Var32.H.a(z8, true);
                                f57Var32.I.a(o47Var7.q, true);
                                if (f57Var32.r.e.size() > 0 && (message2 = ((k47) f57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z9 = o47Var7.q;
                                    messageMedia2.force_small_media = z9;
                                    messageMedia2.force_large_media = !z9;
                                }
                                if (f57Var32.r.f.size() > 0 && (message = ((k47) f57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z10 = o47Var7.q;
                                    messageMedia.force_small_media = z10;
                                    messageMedia.force_large_media = !z10;
                                }
                                f57Var32.i();
                                f57Var32.V = true;
                                break;
                            }
                            break;
                        default:
                            o47 o47Var8 = f57Var32.d0.d;
                            boolean z11 = o47Var8.r;
                            o47Var8.r = !z11;
                            f57Var32.F.a(z11, true);
                            if (f57Var32.r.e.size() > 0 && (message4 = ((k47) f57Var32.r.e.get(0)).k) != null) {
                                message4.invert_media = o47Var8.r;
                            }
                            if (f57Var32.r.f.size() > 0 && (message3 = ((k47) f57Var32.r.f.get(0)).k) != null) {
                                message3.invert_media = o47Var8.r;
                            }
                            f57Var32.i();
                            f57Var32.V = true;
                            break;
                    }
                }
            });
            this.s.a(a8Var10, qoe.o(-1, 48));
            a8 a8Var11 = new a8(1, l57Var.G, context, false, true);
            a8Var11.j(jb6.M0(2131751299, null), R.drawable.msg_delete, null);
            int i14 = cmb.p7;
            int i15 = cmb.o7;
            a8Var11.c(i14, i15);
            final byte b18 = 9;
            a8Var11.setOnClickListener(new View.OnClickListener(this) { // from class: t47
                public final /* synthetic */ f57 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i62;
                    TLRPC.Message message;
                    TLRPC.MessageMedia messageMedia;
                    TLRPC.Message message2;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Message message3;
                    TLRPC.Message message4;
                    byte b62 = b18;
                    f57 f57Var32 = this.b;
                    switch (b62) {
                        case 0:
                            f57Var32.d0.d.d = null;
                            f57Var32.e.e(false);
                            f57Var32.g(false, false);
                            f57Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            z47 z47Var2 = f57Var32.e;
                            l57 l57Var2 = f57Var32.d0;
                            if (f57Var32.a(null) != null) {
                                if (z47Var2.v - z47Var2.u <= oc7.r1(l57Var2.x).l4.N1.f()) {
                                    nkb nkbVar = z47Var2.W;
                                    k47 a = f57Var32.a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                                    o47 o47Var4 = l57Var2.d;
                                    int i72 = z47Var2.u;
                                    o47Var4.e = i72;
                                    int i82 = z47Var2.v;
                                    o47Var4.f = i82;
                                    o47Var4.d = nv1.b(i72, i82, a);
                                    l57Var2.b();
                                    l57Var2.a(true);
                                    break;
                                } else {
                                    f57Var32.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            z47 z47Var3 = f57Var32.e;
                            l57 l57Var3 = f57Var32.d0;
                            o47 o47Var5 = l57Var3.d;
                            int i92 = l57Var3.x;
                            boolean z72 = l57Var3.b;
                            if (o47Var5.d != null && !z72) {
                                o47Var5.d = null;
                                z47Var3.e(false);
                                f57Var32.g(false, true);
                                f57Var32.l(true);
                                break;
                            } else if (z47Var3.v - z47Var3.u <= oc7.r1(i92).l4.N1.f()) {
                                k47 a2 = f57Var32.a(null);
                                if (a2 != null) {
                                    if (!z47Var3.w()) {
                                        o47Var5.e = 0;
                                        int min = Math.min(oc7.r1(i92).l4.N1.f(), nv1.d(a2));
                                        o47Var5.f = min;
                                        o47Var5.d = nv1.b(o47Var5.e, min, a2);
                                        View b72 = f57Var32.b();
                                        if (b72 instanceof rc2) {
                                            z47Var3.Z((rc2) b72, o47Var5.e, o47Var5.f);
                                        }
                                        if (!z72) {
                                            f57Var32.s.getSwipeBack().e(f57Var32.J);
                                        }
                                        f57Var32.g(true, true);
                                        break;
                                    } else {
                                        o47Var5.e = z47Var3.u;
                                        o47Var5.f = z47Var3.v;
                                        nkb nkbVar2 = z47Var3.W;
                                        o47Var5.d = nv1.b(o47Var5.e, o47Var5.f, f57Var32.a(nkbVar2 != null ? ((rc2) nkbVar2).getMessageObject() : null));
                                        l57Var3.b();
                                        l57Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                f57Var32.f();
                                break;
                            }
                            break;
                        case 3:
                            f57Var32.d0.c(false);
                            break;
                        case 4:
                            f57Var32.d0.c(false);
                            break;
                        case 5:
                            f57Var32.d0.a(true);
                            break;
                        case 6:
                            l57 l57Var4 = f57Var32.d0;
                            if (!l57Var4.b) {
                                jt1 jt1Var = (jt1) l57Var4;
                                jt1Var.a(true);
                                yv1 yv1Var = jt1Var.I;
                                yv1Var.F5 = null;
                                yv1Var.D5 = null;
                                yv1Var.x5.f(null, null, yv1Var.l6, null);
                                yv1Var.D6();
                                break;
                            } else {
                                jt1 jt1Var2 = (jt1) l57Var4;
                                jt1Var2.a(true);
                                yv1 yv1Var2 = jt1Var2.I;
                                yv1Var2.D5 = null;
                                yv1Var2.dc(yv1Var2.F5);
                                break;
                            }
                        case 7:
                            f57Var32.d0.c(true);
                            break;
                        case 8:
                            f57Var32.d0.a(true);
                            break;
                        case 9:
                            jt1 jt1Var3 = (jt1) f57Var32.d0;
                            jt1Var3.a(true);
                            yv1 yv1Var3 = jt1Var3.I;
                            yv1Var3.x5.d(null, yv1Var3.l6);
                            yv1Var3.D6();
                            break;
                        case 10:
                            f57Var32.d0.a(true);
                            break;
                        case 11:
                            jt1 jt1Var4 = (jt1) f57Var32.d0;
                            jt1Var4.a(true);
                            yv1 yv1Var4 = jt1Var4.I;
                            yv1Var4.Y5 = null;
                            ms1 ms1Var = yv1Var4.a0;
                            if (ms1Var != null) {
                                ms1Var.N3 = null;
                                ms1Var.O3 = false;
                            }
                            o47 o47Var6 = yv1Var4.x5;
                            if (o47Var6 != null) {
                                i62 = ((d) yv1Var4).currentAccount;
                                k47 k47Var = yv1Var4.F5;
                                o47Var6.e(i62, null, null, k47Var == yv1Var4.m4 ? null : k47Var, yv1Var4.D5, yv1Var4.H5);
                            }
                            yv1Var4.D6();
                            break;
                        case 12:
                            o47 o47Var7 = f57Var32.d0.d;
                            if (o47Var7.o) {
                                boolean z8 = !o47Var7.q;
                                o47Var7.q = z8;
                                f57Var32.H.a(z8, true);
                                f57Var32.I.a(o47Var7.q, true);
                                if (f57Var32.r.e.size() > 0 && (message2 = ((k47) f57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z9 = o47Var7.q;
                                    messageMedia2.force_small_media = z9;
                                    messageMedia2.force_large_media = !z9;
                                }
                                if (f57Var32.r.f.size() > 0 && (message = ((k47) f57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z10 = o47Var7.q;
                                    messageMedia.force_small_media = z10;
                                    messageMedia.force_large_media = !z10;
                                }
                                f57Var32.i();
                                f57Var32.V = true;
                                break;
                            }
                            break;
                        default:
                            o47 o47Var8 = f57Var32.d0.d;
                            boolean z11 = o47Var8.r;
                            o47Var8.r = !z11;
                            f57Var32.F.a(z11, true);
                            if (f57Var32.r.e.size() > 0 && (message4 = ((k47) f57Var32.r.e.get(0)).k) != null) {
                                message4.invert_media = o47Var8.r;
                            }
                            if (f57Var32.r.f.size() > 0 && (message3 = ((k47) f57Var32.r.f.get(0)).k) != null) {
                                message3.invert_media = o47Var8.r;
                            }
                            f57Var32.i();
                            f57Var32.V = true;
                            break;
                    }
                }
            });
            a8Var11.h(0.12f, i15);
            this.s.a(a8Var11, qoe.o(-1, 48));
            k57 k57Var8 = k57Var;
            k57Var8.a(o47Var.k, false);
            k57 k57Var9 = k57Var2;
            f57 f57Var4 = this;
            k57Var8.setOnClickListener(new x47(this, z, context, k57Var9, k57Var8, (byte) 0));
            f57Var = f57Var4;
            if (k57Var9 != null) {
                k57Var9.setOnClickListener(new jw4(f57Var4, k57Var9, k57Var8, b17));
                f57Var = f57Var4;
            }
        }
        context2 = context;
        f57Var2 = f57Var;
        i2 = f57Var2.a;
        if (i2 == 1) {
        }
        m = f57Var2.e.m(context2);
        f57Var2.d = m;
        m.setElevation(gm.L(8.0f));
        m.setOutlineProvider(viewOutlineProvider);
        if (m.getParent() instanceof ViewGroup) {
        }
        f57Var2.addView(m, qoe.d(-1, -1.0f, 51, 0.0f, a.getCurrentActionBarHeight() / gm.p, 0.0f, 0.0f));
        f57Var2.e.Q(f57Var2.f);
    }

    public final k47 a(k47 k47Var) {
        f47 f47Var;
        o47 o47Var = this.d0.d;
        m47 m47Var = o47Var.a;
        if (m47Var == null) {
            return null;
        }
        LongSparseArray longSparseArray = m47Var.d;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (f47Var = (f47) o47Var.a.d.valueAt(0)) == null) {
            return (k47) o47Var.a.e.get(0);
        }
        if (f47Var.i) {
            if (k47Var != null) {
                return k47Var;
            }
            nv1 nv1Var = o47Var.d;
            if (nv1Var != null) {
                return nv1Var.a;
            }
        }
        return f47Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b() {
        int i;
        View childAt;
        k47 a = a(null);
        if (a != null) {
            while (true) {
                fv fvVar = this.f;
                if (i >= fvVar.getChildCount()) {
                    break;
                }
                childAt = fvVar.getChildAt(i);
                mk5 mk5Var = (mk5) childAt;
                i = (mk5Var.getMessageObject() == null || !(mk5Var.getMessageObject() == a || mk5Var.getMessageObject().e1() == a.e1())) ? i + 1 : 0;
            }
            return childAt;
        }
        return null;
    }

    public final f47 c(k47 k47Var) {
        if (k47Var.c1() == 0) {
            return null;
        }
        f47 f47Var = (f47) this.r.d.get(k47Var.c1());
        if (f47Var == null || (f47Var.d.size() > 1 && f47Var.d(k47Var) != null)) {
            return f47Var;
        }
        return null;
    }

    public final boolean d(rc2 rc2Var) {
        k47 a;
        if (rc2Var == null || rc2Var.getMessageObject() == null || (a = a(null)) == null) {
            return false;
        }
        return rc2Var.getMessageObject() == a || rc2Var.getMessageObject().e1() == a.e1();
    }

    public final void e(float f, int i) {
        boolean z = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        w91 w91Var = this.b;
        s47 s47Var = this.c;
        if (z) {
            s47Var.setTranslationY(0.0f);
            w91Var.invalidateOutline();
            w91Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            s47Var.setTranslationY(i);
            w91Var.invalidateOutline();
            w91Var.setTranslationY(f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f + w91Var.getMeasuredHeight()) - gm.L(2.0f));
        }
        float x = w91Var.getX();
        rkb rkbVar = this.d;
        rkbVar.setTranslationX(x);
        rkbVar.setTranslationY(w91Var.getY());
    }

    public final void f() {
        l57 l57Var = this.d0;
        new c41(l57Var, l57Var.G).I(R.raw.error, jb6.M0(2131746170, null), jb6.M0(2131746169, null)).j();
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
        y47 y47Var = this.x;
        y47 y47Var2 = this.w;
        if (!z2) {
            if (y47Var2 != null) {
                y47Var2.setAlpha(!z ? 1.0f : 0.0f);
                y47Var2.setVisibility(!z ? 0 : 4);
            }
            if (y47Var != null) {
                y47Var.setAlpha(z ? 1.0f : 0.0f);
                y47Var.setVisibility(z ? 0 : 4);
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
        if (y47Var2 != null) {
            y47Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(y47Var2, (Property<y47, Float>) property, !z ? 1.0f : 0.0f));
        }
        if (y47Var != null) {
            y47Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(y47Var, (Property<y47, Float>) property, z ? 1.0f : 0.0f));
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
        this.Q.setInterpolator(d53.h);
        this.Q.addListener(new jf4((byte) 14, this, z));
        this.Q.start();
    }

    public final void h(rc2 rc2Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (this.a == 2) {
            o47 o47Var = this.d0.d;
            if (!o47Var.n && (uRLSpan = o47Var.w) != null && (webPage = o47Var.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                rc2Var.t3(uRLSpan);
                return;
            }
        }
        rc2Var.t3(null);
    }

    public final void i() {
        int i;
        l57 l57Var = this.d0;
        o47 o47Var = l57Var.d;
        b57 b57Var = this.h;
        if (b57Var.k()) {
            this.W = true;
            return;
        }
        for (int i2 = 0; i2 < this.r.f.size(); i2++) {
            k47 k47Var = (k47) this.r.f.get(i2);
            k47Var.M1 = true;
            k47Var.h2 = l57Var.a;
            boolean z = o47Var.k;
            TLRPC.Message message = k47Var.k;
            if (z) {
                i = message.flags & (-5);
                message.flags = i;
                k47Var.g2 = true;
            } else {
                i = message.flags | 4;
                message.flags = i;
                k47Var.g2 = false;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = o47Var.v;
                if (webPage != null) {
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia == null || messageMedia.webpage != webPage) {
                        message.flags = i | 512;
                        message.media = new TLRPC.TL_messageMediaWebPage();
                        TLRPC.MessageMedia messageMedia2 = k47Var.k.media;
                        messageMedia2.webpage = o47Var.v;
                        boolean z2 = o47Var.q;
                        messageMedia2.force_large_media = !z2;
                        messageMedia2.force_small_media = z2;
                        messageMedia2.manual = true;
                        k47Var.y = null;
                        k47Var.o0();
                        k47Var.p0 = null;
                        k47Var.q0 = null;
                        k47Var.n0 = null;
                        k47Var.o0 = null;
                        k47Var.r0(true);
                        k47Var.K(true);
                    }
                } else {
                    message.flags = i & (-513);
                    message.media = null;
                }
            }
            if (o47Var.l) {
                k47Var.z = null;
            } else {
                k47Var.k0();
            }
            if (k47Var.S3()) {
                n47 n47Var = (n47) k47Var.k.media;
                n47Var.results.total_voters = o47Var.l ? 0 : n47Var.a;
            }
        }
        for (int i3 = 0; i3 < this.r.h.size(); i3++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i3)).chosen = !o47Var.k;
        }
        for (int i4 = 0; i4 < this.r.d.size(); i4++) {
            b57Var.U((f47) this.r.d.valueAt(i4));
        }
        this.n.l(0, this.r.f.size());
    }

    public final void j() {
        final int i = this.S;
        final float f = this.T;
        l57 l57Var = this.d0;
        boolean z = l57Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        fv fvVar = this.f;
        if (z) {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(gm.L(8.0f) + fvVar.getMeasuredWidth());
        } else {
            int measuredHeight = fvVar.getMeasuredHeight();
            int i2 = 0;
            for (int i3 = 0; i3 < fvVar.getChildCount(); i3++) {
                View childAt = fvVar.getChildAt(i3);
                if (RecyclerView.R(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i2++;
                }
            }
            m47 m47Var = this.r;
            if (m47Var == null || i2 == 0 || i2 > m47Var.f.size()) {
                this.S = 0;
            } else {
                int c = b10.c(4.0f, measuredHeight, 0);
                this.S = c;
                this.S = Math.min(((fvVar.getMeasuredHeight() - this.S) + c) - ((int) ((((gm.q.y - (Build.VERSION.SDK_INT >= 35 ? gm.n : 0)) * 0.8f) - this.a0) - gm.L(8.0f))), this.S);
            }
            float z2 = aq1.z(getMeasuredHeight() - gm.L(16.0f), (this.b.getMeasuredHeight() - this.S) + (this.a0 - gm.L(8.0f)), 2.0f, gm.L(8.0f)) - this.S;
            this.T = z2;
            if (z2 > gm.L(8.0f)) {
                this.T = gm.L(8.0f);
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
        ValueAnimator valueAnimator = l57Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        l57Var.h = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u47
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f3 = 1.0f - floatValue;
                f57 f57Var = f57.this;
                int i5 = (int) ((f57Var.S * floatValue) + (i * f3));
                f57Var.U = i5;
                f57Var.e((f57Var.T * floatValue) + (f * f3), i5);
            }
        });
        l57Var.h.setDuration(250L);
        l57Var.h.setInterpolator(wb2.V);
        l57Var.h.addListener(new v85(this, (byte) 19));
        gm.d3(l57Var.E, 50L);
        this.U = i;
        e(f, i);
    }

    public final void k() {
        k47 k47Var;
        l57 l57Var = this.d0;
        o47 o47Var = l57Var.d;
        if (this.a == 0) {
            z47 z47Var = this.e;
            if (z47Var.v - z47Var.u <= oc7.r1(l57Var.x).l4.N1.f()) {
                nkb nkbVar = z47Var.W;
                k47 a = a(nkbVar != null ? ((rc2) nkbVar).getMessageObject() : null);
                if (o47Var.d != null && z47Var.w()) {
                    o47Var.e = z47Var.u;
                    o47Var.f = z47Var.v;
                    if (a != null) {
                        nv1 nv1Var = o47Var.d;
                        if (nv1Var.m || (k47Var = nv1Var.a) == null || k47Var.e1() != a.e1()) {
                            o47Var.d = nv1.b(o47Var.e, o47Var.f, a);
                            l57Var.b();
                        }
                    }
                }
                z47Var.e(false);
            }
        }
    }

    public final void l(boolean z) {
        l57 l57Var = this.d0;
        TLRPC.User user = l57Var.n;
        o47 o47Var = l57Var.d;
        TLRPC.Chat chat = l57Var.r;
        s47 s47Var = this.c;
        int i = this.a;
        if (i == 1) {
            m47 m47Var = o47Var.b;
            s47Var.b(jb6.G(m47Var == null ? 0 : m47Var.g.size(), "PreviewForwardMessagesCount", new Object[0]), z);
            s47Var.a(!o47Var.h ? o47Var.m ? user != null ? jb6.a0("ForwardPreviewSendersNameVisible", null, 2131750511, bw2.m(0, user.first_name, user.last_name)) : (!sd2.T(chat) || chat.megagroup) ? jb6.M0(2131750509, null) : jb6.M0(2131750510, null) : user != null ? jb6.a0("ForwardPreviewSendersNameVisible", null, 2131750511, bw2.m(0, user.first_name, user.last_name)) : (!sd2.T(chat) || chat.megagroup) ? jb6.M0(2131750512, null) : jb6.M0(2131750513, null) : !o47Var.k ? user != null ? jb6.a0("ForwardPreviewSendersNameVisible", null, 2131750511, bw2.m(0, user.first_name, user.last_name)) : (!sd2.T(chat) || chat.megagroup) ? jb6.M0(2131750509, null) : jb6.M0(2131750510, null) : user != null ? jb6.a0("ForwardPreviewSendersNameHidden", null, 2131750514, bw2.m(0, user.first_name, user.last_name)) : (!sd2.T(chat) || chat.megagroup) ? jb6.M0(2131750512, null) : jb6.M0(2131750513, null), z);
        } else {
            if (i != 0) {
                if (i == 2) {
                    s47Var.b(jb6.M0(2131748305, null), z);
                    s47Var.a(jb6.M0(2131748306, null), z);
                    return;
                }
                return;
            }
            if (o47Var.d == null || !o47Var.a.j) {
                s47Var.b(jb6.M0(2131748302, null), z);
                s47Var.a(o47Var.a.j ? jb6.M0(2131748303, null) : "", z);
            } else {
                s47Var.b(jb6.M0(2131746615, null), z);
                s47Var.a(jb6.M0(2131746614, null), z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            gm.d0(this.f, new sk3(this, (byte) 28));
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
        l57 l57Var = this.d0;
        l57Var.w = z;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i, makeMeasureSpec);
        int i3 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i3, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        boolean z2 = l57Var.w;
        w91 w91Var = this.b;
        if (z2) {
            w91Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w91Var.getLayoutParams()).topMargin = gm.L(8.0f);
            ((ViewGroup.MarginLayoutParams) w91Var.getLayoutParams()).bottomMargin = gm.L(8.0f);
            w91Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i), Math.max(gm.L(340.0f), View.MeasureSpec.getSize(i) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w91Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w91Var.getLayoutParams()).bottomMargin = 0;
            w91Var.getLayoutParams().height = (View.MeasureSpec.getSize(i2) - gm.L(6.0f)) - this.a0;
            if (w91Var.getLayoutParams().height < View.MeasureSpec.getSize(i2) * 0.5f) {
                w91Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i2) * 0.5f);
            }
            w91Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i2) - w91Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
        if (this.b0 != size) {
            for (int i4 = 0; i4 < this.r.f.size(); i4++) {
                k47 k47Var = (k47) this.r.f.get(i4);
                k47Var.d2 = l57Var.w ? w91Var.getLayoutParams().width : View.MeasureSpec.getSize(i) - gm.L(16.0f);
                k47Var.S1 = false;
                k47Var.M1 = true;
                js jsVar = this.n;
                if (jsVar != null) {
                    jsVar.f();
                }
            }
            this.L = true;
        }
        this.b0 = size;
        super.onMeasure(i, i2);
    }
}
