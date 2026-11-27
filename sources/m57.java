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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class m57 extends FrameLayout {
    public static final /* synthetic */ int e0 = 0;
    public final b8 E;
    public final r57 F;
    public final FrameLayout G;
    public final r57 H;
    public final r57 I;
    public final int J;
    public final rx6 K;
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
    public final w81 b;
    public int b0;
    public final z47 c;
    public boolean c0;
    public final lmb d;
    public final /* synthetic */ s57 d0;
    public final g57 e;
    public final gu f;
    public final i57 h;
    public final kr n;
    public t47 r;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout s;
    public final f57 w;
    public final f57 x;
    public final b8 y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x06dd  */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [android.graphics.drawable.Drawable, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.graphics.drawable.Drawable, java.lang.String, uob] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m57(s57 s57Var, Context context, int i) {
        super(r5);
        v47 v47Var;
        ViewOutlineProvider viewOutlineProvider;
        Context context2;
        m57 m57Var;
        boolean z;
        r57 r57Var;
        r57 r57Var2;
        m57 m57Var2;
        int i2;
        lmb m;
        boolean z2;
        ?? r11;
        int i3;
        v47 v47Var2;
        boolean z3;
        Object obj;
        Context context3 = context;
        this.d0 = s57Var;
        byte b = 1;
        this.L = true;
        this.M = -1;
        this.N = -1;
        final byte b2 = 0;
        this.O = false;
        this.R = new Rect();
        this.V = false;
        this.c0 = true;
        this.K = new rx6((Object) context3, (byte) 20);
        this.a = i;
        setOnTouchListener(new b7(this, (byte) 11));
        byte b3 = 6;
        w81 w81Var = new w81(b3, context3, this);
        this.b = w81Var;
        o57 o57Var = s57Var.G;
        boolean z4 = s57Var.b;
        v47 v47Var3 = s57Var.d;
        Drawable l = ((xu1) o57Var).l();
        if (((xu1) o57Var).f == null) {
            int i4 = aob.a;
        }
        w81Var.U(l);
        w81Var.setOccupyStatusBar(false);
        w81Var.setOutlineProvider(new dl0(this, b3));
        w81Var.setClipToOutline(true);
        w81Var.setElevation(hl.L(4.0f));
        z47 z47Var = new z47(context3, o57Var);
        this.c = z47Var;
        yob.h(aob.s8, o57Var, z47Var);
        g57 g57Var = new g57(this);
        this.e = g57Var;
        g57Var.D = new ur1(this, b);
        gu guVar = new gu(this, context3, o57Var, (byte) 26);
        this.f = guVar;
        i57 i57Var = new i57(this, guVar, o57Var);
        this.h = i57Var;
        guVar.setItemAnimator(i57Var);
        guVar.setOnScrollListener(new to2(this, (byte) 25));
        guVar.setOnItemClickListener(new j57(this));
        kr krVar = new kr(this, (byte) 5);
        this.n = krVar;
        guVar.setAdapter(krVar);
        guVar.setPadding(0, hl.L(4.0f), 0, hl.L(4.0f));
        z37 z37Var = new z37(this, b);
        byte b4 = 9;
        z37Var.O = new ar1(this, b4);
        guVar.setClipToPadding(false);
        guVar.setLayoutManager(z37Var);
        guVar.i(new br1(b4));
        w81Var.addView(guVar);
        addView(w81Var, tre.d(-1, 400.0f, 0, 8.0f, 0.0f, 8.0f, 0.0f));
        w81Var.addView(z47Var, tre.c(-2.0f, -1));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 1, o57Var, getContext());
        this.s = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setOnForegroundOpenFinished(new d57(this, (byte) 1));
        jl0 c = s57Var.H.c(actionBarPopupWindow$ActionBarPopupWindowLayout, null, false);
        c.p(dtd.k(o57Var));
        c.q(hl.L(8.0f));
        c.S.e = true;
        c.r(hl.L(12.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackground(c);
        addView(actionBarPopupWindow$ActionBarPopupWindowLayout, tre.c(-2.0f, -2));
        if (i == 0) {
            t47 t47Var = v47Var3.a;
            boolean z5 = v47Var3.s;
            if (t47Var != null) {
                boolean z6 = t47Var.j;
                float f = 48.0f;
                if (!z6 || v47Var3.i) {
                    z2 = z5;
                    r11 = 0;
                    v47Var = v47Var3;
                } else {
                    LinearLayout j = uh9.j(context3, 1);
                    if (z4) {
                        i3 = 2131746157;
                        v47Var2 = v47Var3;
                        z2 = z5;
                        z3 = true;
                        obj = null;
                    } else {
                        z2 = z5;
                        v47Var2 = v47Var3;
                        obj = null;
                        b8 b8Var = new b8(0, s57Var.G, context3, true, false);
                        b8Var.j(ob6.M0(2131753749, null), R.drawable.msg_arrow_back, null);
                        b8Var.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                            public final /* synthetic */ m57 b;

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
                                m57 m57Var3 = this.b;
                                switch (b5) {
                                    case 0:
                                        m57Var3.d0.d.d = null;
                                        m57Var3.e.e(false);
                                        m57Var3.g(false, false);
                                        m57Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        g57 g57Var2 = m57Var3.e;
                                        s57 s57Var2 = m57Var3.d0;
                                        if (m57Var3.a(null) != null) {
                                            if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                                hmb hmbVar = g57Var2.W;
                                                r47 a = m57Var3.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                                v47 v47Var4 = s57Var2.d;
                                                int i6 = g57Var2.u;
                                                v47Var4.e = i6;
                                                int i7 = g57Var2.v;
                                                v47Var4.f = i7;
                                                v47Var4.d = ou1.b(i6, i7, a);
                                                s57Var2.b();
                                                s57Var2.a(true);
                                                break;
                                            } else {
                                                m57Var3.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        g57 g57Var3 = m57Var3.e;
                                        s57 s57Var3 = m57Var3.d0;
                                        v47 v47Var5 = s57Var3.d;
                                        int i8 = s57Var3.x;
                                        boolean z7 = s57Var3.b;
                                        if (v47Var5.d != null && !z7) {
                                            v47Var5.d = null;
                                            g57Var3.e(false);
                                            m57Var3.g(false, true);
                                            m57Var3.l(true);
                                            break;
                                        } else if (g57Var3.v - g57Var3.u <= uc7.s1(i8).l4.V1.f()) {
                                            r47 a2 = m57Var3.a(null);
                                            if (a2 != null) {
                                                if (!g57Var3.w()) {
                                                    v47Var5.e = 0;
                                                    int min = Math.min(uc7.s1(i8).l4.V1.f(), ou1.d(a2));
                                                    v47Var5.f = min;
                                                    v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                                    View b6 = m57Var3.b();
                                                    if (b6 instanceof wb2) {
                                                        g57Var3.Z((wb2) b6, v47Var5.e, v47Var5.f);
                                                    }
                                                    if (!z7) {
                                                        m57Var3.s.getSwipeBack().e(m57Var3.J);
                                                    }
                                                    m57Var3.g(true, true);
                                                    break;
                                                } else {
                                                    v47Var5.e = g57Var3.u;
                                                    v47Var5.f = g57Var3.v;
                                                    hmb hmbVar2 = g57Var3.W;
                                                    v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var3.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                                    s57Var3.b();
                                                    s57Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            m57Var3.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        m57Var3.d0.c(false);
                                        break;
                                    case 4:
                                        m57Var3.d0.c(false);
                                        break;
                                    case 5:
                                        m57Var3.d0.a(true);
                                        break;
                                    case 6:
                                        s57 s57Var4 = m57Var3.d0;
                                        if (!s57Var4.b) {
                                            ks1 ks1Var = (ks1) s57Var4;
                                            ks1Var.a(true);
                                            zu1 zu1Var = ks1Var.I;
                                            zu1Var.F5 = null;
                                            zu1Var.D5 = null;
                                            zu1Var.x5.f(null, null, zu1Var.l6, null);
                                            zu1Var.D6();
                                            break;
                                        } else {
                                            ks1 ks1Var2 = (ks1) s57Var4;
                                            ks1Var2.a(true);
                                            zu1 zu1Var2 = ks1Var2.I;
                                            zu1Var2.D5 = null;
                                            zu1Var2.dc(zu1Var2.F5);
                                            break;
                                        }
                                    case 7:
                                        m57Var3.d0.c(true);
                                        break;
                                    case 8:
                                        m57Var3.d0.a(true);
                                        break;
                                    case 9:
                                        ks1 ks1Var3 = (ks1) m57Var3.d0;
                                        ks1Var3.a(true);
                                        zu1 zu1Var3 = ks1Var3.I;
                                        zu1Var3.x5.d(null, zu1Var3.l6);
                                        zu1Var3.D6();
                                        break;
                                    case 10:
                                        m57Var3.d0.a(true);
                                        break;
                                    case 11:
                                        ks1 ks1Var4 = (ks1) m57Var3.d0;
                                        ks1Var4.a(true);
                                        zu1 zu1Var4 = ks1Var4.I;
                                        zu1Var4.Y5 = null;
                                        nr1 nr1Var = zu1Var4.a0;
                                        if (nr1Var != null) {
                                            nr1Var.M3 = null;
                                            nr1Var.N3 = false;
                                        }
                                        v47 v47Var6 = zu1Var4.x5;
                                        if (v47Var6 != null) {
                                            i5 = ((e) zu1Var4).currentAccount;
                                            r47 r47Var = zu1Var4.F5;
                                            v47Var6.e(i5, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                        }
                                        zu1Var4.D6();
                                        break;
                                    case 12:
                                        v47 v47Var7 = m57Var3.d0.d;
                                        if (v47Var7.o) {
                                            boolean z8 = !v47Var7.q;
                                            v47Var7.q = z8;
                                            m57Var3.H.a(z8, true);
                                            m57Var3.I.a(v47Var7.q, true);
                                            if (m57Var3.r.e.size() > 0 && (message2 = ((r47) m57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z9 = v47Var7.q;
                                                messageMedia2.force_small_media = z9;
                                                messageMedia2.force_large_media = !z9;
                                            }
                                            if (m57Var3.r.f.size() > 0 && (message = ((r47) m57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z10 = v47Var7.q;
                                                messageMedia.force_small_media = z10;
                                                messageMedia.force_large_media = !z10;
                                            }
                                            m57Var3.i();
                                            m57Var3.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        v47 v47Var8 = m57Var3.d0.d;
                                        boolean z11 = v47Var8.r;
                                        v47Var8.r = !z11;
                                        m57Var3.F.a(z11, true);
                                        if (m57Var3.r.e.size() > 0 && (message4 = ((r47) m57Var3.r.e.get(0)).k) != null) {
                                            message4.invert_media = v47Var8.r;
                                        }
                                        if (m57Var3.r.f.size() > 0 && (message3 = ((r47) m57Var3.r.f.get(0)).k) != null) {
                                            message3.invert_media = v47Var8.r;
                                        }
                                        m57Var3.i();
                                        m57Var3.V = true;
                                        break;
                                }
                            }
                        });
                        j.addView(b8Var, tre.o(-1, 48));
                        k8 k8Var = new k8(context3, o57Var);
                        yob.i(k8Var, yob.K(0.06f, aob.E8), o57Var);
                        k8Var.setTag(R.id.fit_width_tag, 1);
                        j.addView(k8Var, tre.o(-1, 8));
                        b8 b8Var2 = new b8(0, s57Var.G, context3, false, true);
                        i3 = 2131746157;
                        b8Var2.j(ob6.M0(2131746157, null), R.drawable.menu_quote_specific, null);
                        z3 = true;
                        final boolean z7 = true ? 1 : 0;
                        b8Var2.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                            public final /* synthetic */ m57 b;

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
                                byte b5 = z7;
                                m57 m57Var3 = this.b;
                                switch (b5) {
                                    case 0:
                                        m57Var3.d0.d.d = null;
                                        m57Var3.e.e(false);
                                        m57Var3.g(false, false);
                                        m57Var3.s.getSwipeBack().b(true);
                                        break;
                                    case 1:
                                        g57 g57Var2 = m57Var3.e;
                                        s57 s57Var2 = m57Var3.d0;
                                        if (m57Var3.a(null) != null) {
                                            if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                                hmb hmbVar = g57Var2.W;
                                                r47 a = m57Var3.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                                v47 v47Var4 = s57Var2.d;
                                                int i6 = g57Var2.u;
                                                v47Var4.e = i6;
                                                int i7 = g57Var2.v;
                                                v47Var4.f = i7;
                                                v47Var4.d = ou1.b(i6, i7, a);
                                                s57Var2.b();
                                                s57Var2.a(true);
                                                break;
                                            } else {
                                                m57Var3.f();
                                                break;
                                            }
                                        }
                                        break;
                                    case 2:
                                        g57 g57Var3 = m57Var3.e;
                                        s57 s57Var3 = m57Var3.d0;
                                        v47 v47Var5 = s57Var3.d;
                                        int i8 = s57Var3.x;
                                        boolean z72 = s57Var3.b;
                                        if (v47Var5.d != null && !z72) {
                                            v47Var5.d = null;
                                            g57Var3.e(false);
                                            m57Var3.g(false, true);
                                            m57Var3.l(true);
                                            break;
                                        } else if (g57Var3.v - g57Var3.u <= uc7.s1(i8).l4.V1.f()) {
                                            r47 a2 = m57Var3.a(null);
                                            if (a2 != null) {
                                                if (!g57Var3.w()) {
                                                    v47Var5.e = 0;
                                                    int min = Math.min(uc7.s1(i8).l4.V1.f(), ou1.d(a2));
                                                    v47Var5.f = min;
                                                    v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                                    View b6 = m57Var3.b();
                                                    if (b6 instanceof wb2) {
                                                        g57Var3.Z((wb2) b6, v47Var5.e, v47Var5.f);
                                                    }
                                                    if (!z72) {
                                                        m57Var3.s.getSwipeBack().e(m57Var3.J);
                                                    }
                                                    m57Var3.g(true, true);
                                                    break;
                                                } else {
                                                    v47Var5.e = g57Var3.u;
                                                    v47Var5.f = g57Var3.v;
                                                    hmb hmbVar2 = g57Var3.W;
                                                    v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var3.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                                    s57Var3.b();
                                                    s57Var3.a(true);
                                                    break;
                                                }
                                            }
                                        } else {
                                            m57Var3.f();
                                            break;
                                        }
                                        break;
                                    case 3:
                                        m57Var3.d0.c(false);
                                        break;
                                    case 4:
                                        m57Var3.d0.c(false);
                                        break;
                                    case 5:
                                        m57Var3.d0.a(true);
                                        break;
                                    case 6:
                                        s57 s57Var4 = m57Var3.d0;
                                        if (!s57Var4.b) {
                                            ks1 ks1Var = (ks1) s57Var4;
                                            ks1Var.a(true);
                                            zu1 zu1Var = ks1Var.I;
                                            zu1Var.F5 = null;
                                            zu1Var.D5 = null;
                                            zu1Var.x5.f(null, null, zu1Var.l6, null);
                                            zu1Var.D6();
                                            break;
                                        } else {
                                            ks1 ks1Var2 = (ks1) s57Var4;
                                            ks1Var2.a(true);
                                            zu1 zu1Var2 = ks1Var2.I;
                                            zu1Var2.D5 = null;
                                            zu1Var2.dc(zu1Var2.F5);
                                            break;
                                        }
                                    case 7:
                                        m57Var3.d0.c(true);
                                        break;
                                    case 8:
                                        m57Var3.d0.a(true);
                                        break;
                                    case 9:
                                        ks1 ks1Var3 = (ks1) m57Var3.d0;
                                        ks1Var3.a(true);
                                        zu1 zu1Var3 = ks1Var3.I;
                                        zu1Var3.x5.d(null, zu1Var3.l6);
                                        zu1Var3.D6();
                                        break;
                                    case 10:
                                        m57Var3.d0.a(true);
                                        break;
                                    case 11:
                                        ks1 ks1Var4 = (ks1) m57Var3.d0;
                                        ks1Var4.a(true);
                                        zu1 zu1Var4 = ks1Var4.I;
                                        zu1Var4.Y5 = null;
                                        nr1 nr1Var = zu1Var4.a0;
                                        if (nr1Var != null) {
                                            nr1Var.M3 = null;
                                            nr1Var.N3 = false;
                                        }
                                        v47 v47Var6 = zu1Var4.x5;
                                        if (v47Var6 != null) {
                                            i5 = ((e) zu1Var4).currentAccount;
                                            r47 r47Var = zu1Var4.F5;
                                            v47Var6.e(i5, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                        }
                                        zu1Var4.D6();
                                        break;
                                    case 12:
                                        v47 v47Var7 = m57Var3.d0.d;
                                        if (v47Var7.o) {
                                            boolean z8 = !v47Var7.q;
                                            v47Var7.q = z8;
                                            m57Var3.H.a(z8, true);
                                            m57Var3.I.a(v47Var7.q, true);
                                            if (m57Var3.r.e.size() > 0 && (message2 = ((r47) m57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                                boolean z9 = v47Var7.q;
                                                messageMedia2.force_small_media = z9;
                                                messageMedia2.force_large_media = !z9;
                                            }
                                            if (m57Var3.r.f.size() > 0 && (message = ((r47) m57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                                boolean z10 = v47Var7.q;
                                                messageMedia.force_small_media = z10;
                                                messageMedia.force_large_media = !z10;
                                            }
                                            m57Var3.i();
                                            m57Var3.V = true;
                                            break;
                                        }
                                        break;
                                    default:
                                        v47 v47Var8 = m57Var3.d0.d;
                                        boolean z11 = v47Var8.r;
                                        v47Var8.r = !z11;
                                        m57Var3.F.a(z11, true);
                                        if (m57Var3.r.e.size() > 0 && (message4 = ((r47) m57Var3.r.e.get(0)).k) != null) {
                                            message4.invert_media = v47Var8.r;
                                        }
                                        if (m57Var3.r.f.size() > 0 && (message3 = ((r47) m57Var3.r.f.get(0)).k) != null) {
                                            message3.invert_media = v47Var8.r;
                                        }
                                        m57Var3.i();
                                        m57Var3.V = true;
                                        break;
                                }
                            }
                        });
                        j.addView(b8Var2, tre.o(-1, 48));
                    }
                    this.J = actionBarPopupWindow$ActionBarPopupWindowLayout.b(j);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().setStickToRight(z3);
                    FrameLayout frameLayout = new FrameLayout(context3);
                    int i5 = i3;
                    ?? r112 = obj;
                    f57 f57Var = new f57(context, 1, true, false, s57Var.G, (byte) 0);
                    this.w = f57Var;
                    f57Var.j(ob6.M0(z4 ? i5 : 2131745381, r112), R.drawable.menu_select_quote, r112);
                    f57 f57Var2 = new f57(context, 1, true, false, s57Var.G, (byte) 1);
                    context3 = context;
                    this.x = f57Var2;
                    f57Var2.j(ob6.M0(2131752037, r112), R.drawable.menu_quote_delete, r112);
                    int i6 = aob.I5;
                    Drawable Y = aob.Y(aob.v0(i6, o57Var), 6, 0);
                    uob M = yob.M(i6);
                    frameLayout.setBackground(Y);
                    yob.j(frameLayout, Y, r112, M, o57Var);
                    final byte b5 = 2;
                    frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                        public final /* synthetic */ m57 b;

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
                            m57 m57Var3 = this.b;
                            switch (b52) {
                                case 0:
                                    m57Var3.d0.d.d = null;
                                    m57Var3.e.e(false);
                                    m57Var3.g(false, false);
                                    m57Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    g57 g57Var2 = m57Var3.e;
                                    s57 s57Var2 = m57Var3.d0;
                                    if (m57Var3.a(null) != null) {
                                        if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                            hmb hmbVar = g57Var2.W;
                                            r47 a = m57Var3.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                            v47 v47Var4 = s57Var2.d;
                                            int i62 = g57Var2.u;
                                            v47Var4.e = i62;
                                            int i7 = g57Var2.v;
                                            v47Var4.f = i7;
                                            v47Var4.d = ou1.b(i62, i7, a);
                                            s57Var2.b();
                                            s57Var2.a(true);
                                            break;
                                        } else {
                                            m57Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    g57 g57Var3 = m57Var3.e;
                                    s57 s57Var3 = m57Var3.d0;
                                    v47 v47Var5 = s57Var3.d;
                                    int i8 = s57Var3.x;
                                    boolean z72 = s57Var3.b;
                                    if (v47Var5.d != null && !z72) {
                                        v47Var5.d = null;
                                        g57Var3.e(false);
                                        m57Var3.g(false, true);
                                        m57Var3.l(true);
                                        break;
                                    } else if (g57Var3.v - g57Var3.u <= uc7.s1(i8).l4.V1.f()) {
                                        r47 a2 = m57Var3.a(null);
                                        if (a2 != null) {
                                            if (!g57Var3.w()) {
                                                v47Var5.e = 0;
                                                int min = Math.min(uc7.s1(i8).l4.V1.f(), ou1.d(a2));
                                                v47Var5.f = min;
                                                v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                                View b6 = m57Var3.b();
                                                if (b6 instanceof wb2) {
                                                    g57Var3.Z((wb2) b6, v47Var5.e, v47Var5.f);
                                                }
                                                if (!z72) {
                                                    m57Var3.s.getSwipeBack().e(m57Var3.J);
                                                }
                                                m57Var3.g(true, true);
                                                break;
                                            } else {
                                                v47Var5.e = g57Var3.u;
                                                v47Var5.f = g57Var3.v;
                                                hmb hmbVar2 = g57Var3.W;
                                                v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var3.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                                s57Var3.b();
                                                s57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        m57Var3.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    m57Var3.d0.c(false);
                                    break;
                                case 4:
                                    m57Var3.d0.c(false);
                                    break;
                                case 5:
                                    m57Var3.d0.a(true);
                                    break;
                                case 6:
                                    s57 s57Var4 = m57Var3.d0;
                                    if (!s57Var4.b) {
                                        ks1 ks1Var = (ks1) s57Var4;
                                        ks1Var.a(true);
                                        zu1 zu1Var = ks1Var.I;
                                        zu1Var.F5 = null;
                                        zu1Var.D5 = null;
                                        zu1Var.x5.f(null, null, zu1Var.l6, null);
                                        zu1Var.D6();
                                        break;
                                    } else {
                                        ks1 ks1Var2 = (ks1) s57Var4;
                                        ks1Var2.a(true);
                                        zu1 zu1Var2 = ks1Var2.I;
                                        zu1Var2.D5 = null;
                                        zu1Var2.dc(zu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    m57Var3.d0.c(true);
                                    break;
                                case 8:
                                    m57Var3.d0.a(true);
                                    break;
                                case 9:
                                    ks1 ks1Var3 = (ks1) m57Var3.d0;
                                    ks1Var3.a(true);
                                    zu1 zu1Var3 = ks1Var3.I;
                                    zu1Var3.x5.d(null, zu1Var3.l6);
                                    zu1Var3.D6();
                                    break;
                                case 10:
                                    m57Var3.d0.a(true);
                                    break;
                                case 11:
                                    ks1 ks1Var4 = (ks1) m57Var3.d0;
                                    ks1Var4.a(true);
                                    zu1 zu1Var4 = ks1Var4.I;
                                    zu1Var4.Y5 = null;
                                    nr1 nr1Var = zu1Var4.a0;
                                    if (nr1Var != null) {
                                        nr1Var.M3 = null;
                                        nr1Var.N3 = false;
                                    }
                                    v47 v47Var6 = zu1Var4.x5;
                                    if (v47Var6 != null) {
                                        i52 = ((e) zu1Var4).currentAccount;
                                        r47 r47Var = zu1Var4.F5;
                                        v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                    }
                                    zu1Var4.D6();
                                    break;
                                case 12:
                                    v47 v47Var7 = m57Var3.d0.d;
                                    if (v47Var7.o) {
                                        boolean z8 = !v47Var7.q;
                                        v47Var7.q = z8;
                                        m57Var3.H.a(z8, true);
                                        m57Var3.I.a(v47Var7.q, true);
                                        if (m57Var3.r.e.size() > 0 && (message2 = ((r47) m57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = v47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (m57Var3.r.f.size() > 0 && (message = ((r47) m57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = v47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        m57Var3.i();
                                        m57Var3.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    v47 v47Var8 = m57Var3.d0.d;
                                    boolean z11 = v47Var8.r;
                                    v47Var8.r = !z11;
                                    m57Var3.F.a(z11, true);
                                    if (m57Var3.r.e.size() > 0 && (message4 = ((r47) m57Var3.r.e.get(0)).k) != null) {
                                        message4.invert_media = v47Var8.r;
                                    }
                                    if (m57Var3.r.f.size() > 0 && (message3 = ((r47) m57Var3.r.f.get(0)).k) != null) {
                                        message3.invert_media = v47Var8.r;
                                    }
                                    m57Var3.i();
                                    m57Var3.V = true;
                                    break;
                            }
                        }
                    });
                    f = 48.0f;
                    frameLayout.addView(f57Var, tre.c(48.0f, -1));
                    frameLayout.addView(f57Var2, tre.c(48.0f, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout, tre.o(-1, 48));
                    v47Var = v47Var2;
                    r11 = r112;
                }
                if (!v47Var.t && !z2 && !v47Var.u) {
                    FrameLayout frameLayout2 = new FrameLayout(context3);
                    float f2 = f;
                    b8 b8Var3 = new b8(1, s57Var.G, context3, false, false);
                    this.y = b8Var3;
                    b8Var3.j(ob6.M0(2131745980, r11), R.drawable.msg_forward_replace, r11);
                    final byte b6 = 3;
                    b8Var3.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                        public final /* synthetic */ m57 b;

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
                            m57 m57Var3 = this.b;
                            switch (b52) {
                                case 0:
                                    m57Var3.d0.d.d = null;
                                    m57Var3.e.e(false);
                                    m57Var3.g(false, false);
                                    m57Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    g57 g57Var2 = m57Var3.e;
                                    s57 s57Var2 = m57Var3.d0;
                                    if (m57Var3.a(null) != null) {
                                        if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                            hmb hmbVar = g57Var2.W;
                                            r47 a = m57Var3.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                            v47 v47Var4 = s57Var2.d;
                                            int i62 = g57Var2.u;
                                            v47Var4.e = i62;
                                            int i7 = g57Var2.v;
                                            v47Var4.f = i7;
                                            v47Var4.d = ou1.b(i62, i7, a);
                                            s57Var2.b();
                                            s57Var2.a(true);
                                            break;
                                        } else {
                                            m57Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    g57 g57Var3 = m57Var3.e;
                                    s57 s57Var3 = m57Var3.d0;
                                    v47 v47Var5 = s57Var3.d;
                                    int i8 = s57Var3.x;
                                    boolean z72 = s57Var3.b;
                                    if (v47Var5.d != null && !z72) {
                                        v47Var5.d = null;
                                        g57Var3.e(false);
                                        m57Var3.g(false, true);
                                        m57Var3.l(true);
                                        break;
                                    } else if (g57Var3.v - g57Var3.u <= uc7.s1(i8).l4.V1.f()) {
                                        r47 a2 = m57Var3.a(null);
                                        if (a2 != null) {
                                            if (!g57Var3.w()) {
                                                v47Var5.e = 0;
                                                int min = Math.min(uc7.s1(i8).l4.V1.f(), ou1.d(a2));
                                                v47Var5.f = min;
                                                v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                                View b62 = m57Var3.b();
                                                if (b62 instanceof wb2) {
                                                    g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                                }
                                                if (!z72) {
                                                    m57Var3.s.getSwipeBack().e(m57Var3.J);
                                                }
                                                m57Var3.g(true, true);
                                                break;
                                            } else {
                                                v47Var5.e = g57Var3.u;
                                                v47Var5.f = g57Var3.v;
                                                hmb hmbVar2 = g57Var3.W;
                                                v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var3.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                                s57Var3.b();
                                                s57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        m57Var3.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    m57Var3.d0.c(false);
                                    break;
                                case 4:
                                    m57Var3.d0.c(false);
                                    break;
                                case 5:
                                    m57Var3.d0.a(true);
                                    break;
                                case 6:
                                    s57 s57Var4 = m57Var3.d0;
                                    if (!s57Var4.b) {
                                        ks1 ks1Var = (ks1) s57Var4;
                                        ks1Var.a(true);
                                        zu1 zu1Var = ks1Var.I;
                                        zu1Var.F5 = null;
                                        zu1Var.D5 = null;
                                        zu1Var.x5.f(null, null, zu1Var.l6, null);
                                        zu1Var.D6();
                                        break;
                                    } else {
                                        ks1 ks1Var2 = (ks1) s57Var4;
                                        ks1Var2.a(true);
                                        zu1 zu1Var2 = ks1Var2.I;
                                        zu1Var2.D5 = null;
                                        zu1Var2.dc(zu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    m57Var3.d0.c(true);
                                    break;
                                case 8:
                                    m57Var3.d0.a(true);
                                    break;
                                case 9:
                                    ks1 ks1Var3 = (ks1) m57Var3.d0;
                                    ks1Var3.a(true);
                                    zu1 zu1Var3 = ks1Var3.I;
                                    zu1Var3.x5.d(null, zu1Var3.l6);
                                    zu1Var3.D6();
                                    break;
                                case 10:
                                    m57Var3.d0.a(true);
                                    break;
                                case 11:
                                    ks1 ks1Var4 = (ks1) m57Var3.d0;
                                    ks1Var4.a(true);
                                    zu1 zu1Var4 = ks1Var4.I;
                                    zu1Var4.Y5 = null;
                                    nr1 nr1Var = zu1Var4.a0;
                                    if (nr1Var != null) {
                                        nr1Var.M3 = null;
                                        nr1Var.N3 = false;
                                    }
                                    v47 v47Var6 = zu1Var4.x5;
                                    if (v47Var6 != null) {
                                        i52 = ((e) zu1Var4).currentAccount;
                                        r47 r47Var = zu1Var4.F5;
                                        v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                    }
                                    zu1Var4.D6();
                                    break;
                                case 12:
                                    v47 v47Var7 = m57Var3.d0.d;
                                    if (v47Var7.o) {
                                        boolean z8 = !v47Var7.q;
                                        v47Var7.q = z8;
                                        m57Var3.H.a(z8, true);
                                        m57Var3.I.a(v47Var7.q, true);
                                        if (m57Var3.r.e.size() > 0 && (message2 = ((r47) m57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = v47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (m57Var3.r.f.size() > 0 && (message = ((r47) m57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = v47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        m57Var3.i();
                                        m57Var3.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    v47 v47Var8 = m57Var3.d0.d;
                                    boolean z11 = v47Var8.r;
                                    v47Var8.r = !z11;
                                    m57Var3.F.a(z11, true);
                                    if (m57Var3.r.e.size() > 0 && (message4 = ((r47) m57Var3.r.e.get(0)).k) != null) {
                                        message4.invert_media = v47Var8.r;
                                    }
                                    if (m57Var3.r.f.size() > 0 && (message3 = ((r47) m57Var3.r.f.get(0)).k) != null) {
                                        message3.invert_media = v47Var8.r;
                                    }
                                    m57Var3.i();
                                    m57Var3.V = true;
                                    break;
                            }
                        }
                    });
                    context3 = context;
                    b8 b8Var4 = new b8(1, s57Var.G, context3, false, false);
                    this.E = b8Var4;
                    b8Var4.j(ob6.M0(2131746155, r11), R.drawable.msg_forward_replace, r11);
                    final byte b7 = 4;
                    b8Var4.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                        public final /* synthetic */ m57 b;

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
                            m57 m57Var3 = this.b;
                            switch (b52) {
                                case 0:
                                    m57Var3.d0.d.d = null;
                                    m57Var3.e.e(false);
                                    m57Var3.g(false, false);
                                    m57Var3.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    g57 g57Var2 = m57Var3.e;
                                    s57 s57Var2 = m57Var3.d0;
                                    if (m57Var3.a(null) != null) {
                                        if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                            hmb hmbVar = g57Var2.W;
                                            r47 a = m57Var3.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                            v47 v47Var4 = s57Var2.d;
                                            int i62 = g57Var2.u;
                                            v47Var4.e = i62;
                                            int i7 = g57Var2.v;
                                            v47Var4.f = i7;
                                            v47Var4.d = ou1.b(i62, i7, a);
                                            s57Var2.b();
                                            s57Var2.a(true);
                                            break;
                                        } else {
                                            m57Var3.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    g57 g57Var3 = m57Var3.e;
                                    s57 s57Var3 = m57Var3.d0;
                                    v47 v47Var5 = s57Var3.d;
                                    int i8 = s57Var3.x;
                                    boolean z72 = s57Var3.b;
                                    if (v47Var5.d != null && !z72) {
                                        v47Var5.d = null;
                                        g57Var3.e(false);
                                        m57Var3.g(false, true);
                                        m57Var3.l(true);
                                        break;
                                    } else if (g57Var3.v - g57Var3.u <= uc7.s1(i8).l4.V1.f()) {
                                        r47 a2 = m57Var3.a(null);
                                        if (a2 != null) {
                                            if (!g57Var3.w()) {
                                                v47Var5.e = 0;
                                                int min = Math.min(uc7.s1(i8).l4.V1.f(), ou1.d(a2));
                                                v47Var5.f = min;
                                                v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                                View b62 = m57Var3.b();
                                                if (b62 instanceof wb2) {
                                                    g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                                }
                                                if (!z72) {
                                                    m57Var3.s.getSwipeBack().e(m57Var3.J);
                                                }
                                                m57Var3.g(true, true);
                                                break;
                                            } else {
                                                v47Var5.e = g57Var3.u;
                                                v47Var5.f = g57Var3.v;
                                                hmb hmbVar2 = g57Var3.W;
                                                v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var3.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                                s57Var3.b();
                                                s57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        m57Var3.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    m57Var3.d0.c(false);
                                    break;
                                case 4:
                                    m57Var3.d0.c(false);
                                    break;
                                case 5:
                                    m57Var3.d0.a(true);
                                    break;
                                case 6:
                                    s57 s57Var4 = m57Var3.d0;
                                    if (!s57Var4.b) {
                                        ks1 ks1Var = (ks1) s57Var4;
                                        ks1Var.a(true);
                                        zu1 zu1Var = ks1Var.I;
                                        zu1Var.F5 = null;
                                        zu1Var.D5 = null;
                                        zu1Var.x5.f(null, null, zu1Var.l6, null);
                                        zu1Var.D6();
                                        break;
                                    } else {
                                        ks1 ks1Var2 = (ks1) s57Var4;
                                        ks1Var2.a(true);
                                        zu1 zu1Var2 = ks1Var2.I;
                                        zu1Var2.D5 = null;
                                        zu1Var2.dc(zu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    m57Var3.d0.c(true);
                                    break;
                                case 8:
                                    m57Var3.d0.a(true);
                                    break;
                                case 9:
                                    ks1 ks1Var3 = (ks1) m57Var3.d0;
                                    ks1Var3.a(true);
                                    zu1 zu1Var3 = ks1Var3.I;
                                    zu1Var3.x5.d(null, zu1Var3.l6);
                                    zu1Var3.D6();
                                    break;
                                case 10:
                                    m57Var3.d0.a(true);
                                    break;
                                case 11:
                                    ks1 ks1Var4 = (ks1) m57Var3.d0;
                                    ks1Var4.a(true);
                                    zu1 zu1Var4 = ks1Var4.I;
                                    zu1Var4.Y5 = null;
                                    nr1 nr1Var = zu1Var4.a0;
                                    if (nr1Var != null) {
                                        nr1Var.M3 = null;
                                        nr1Var.N3 = false;
                                    }
                                    v47 v47Var6 = zu1Var4.x5;
                                    if (v47Var6 != null) {
                                        i52 = ((e) zu1Var4).currentAccount;
                                        r47 r47Var = zu1Var4.F5;
                                        v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                    }
                                    zu1Var4.D6();
                                    break;
                                case 12:
                                    v47 v47Var7 = m57Var3.d0.d;
                                    if (v47Var7.o) {
                                        boolean z8 = !v47Var7.q;
                                        v47Var7.q = z8;
                                        m57Var3.H.a(z8, true);
                                        m57Var3.I.a(v47Var7.q, true);
                                        if (m57Var3.r.e.size() > 0 && (message2 = ((r47) m57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = v47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (m57Var3.r.f.size() > 0 && (message = ((r47) m57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = v47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        m57Var3.i();
                                        m57Var3.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    v47 v47Var8 = m57Var3.d0.d;
                                    boolean z11 = v47Var8.r;
                                    v47Var8.r = !z11;
                                    m57Var3.F.a(z11, true);
                                    if (m57Var3.r.e.size() > 0 && (message4 = ((r47) m57Var3.r.e.get(0)).k) != null) {
                                        message4.invert_media = v47Var8.r;
                                    }
                                    if (m57Var3.r.f.size() > 0 && (message3 = ((r47) m57Var3.r.f.get(0)).k) != null) {
                                        message3.invert_media = v47Var8.r;
                                    }
                                    m57Var3.i();
                                    m57Var3.V = true;
                                    break;
                            }
                        }
                    });
                    frameLayout2.addView(b8Var4, tre.c(f2, -1));
                    frameLayout2.addView(b8Var3, tre.c(f2, -1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout2, tre.o(-1, 48));
                }
                if (!z2 && !v47Var.u) {
                    View k8Var2 = new k8(context3, o57Var);
                    yob.i(k8Var2, yob.K(0.06f, aob.E8), o57Var);
                    k8Var2.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(k8Var2, tre.o(-1, 8));
                }
                g(v47Var.d != null, false);
                b8 b8Var5 = new b8(1, s57Var.G, context3, false, false);
                b8Var5.j(ob6.M0(2131754211, r11), R.drawable.msg_select, r11);
                final byte b8 = 5;
                b8Var5.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                    public final /* synthetic */ m57 b;

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
                        m57 m57Var3 = this.b;
                        switch (b52) {
                            case 0:
                                m57Var3.d0.d.d = null;
                                m57Var3.e.e(false);
                                m57Var3.g(false, false);
                                m57Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                g57 g57Var2 = m57Var3.e;
                                s57 s57Var2 = m57Var3.d0;
                                if (m57Var3.a(null) != null) {
                                    if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                        hmb hmbVar = g57Var2.W;
                                        r47 a = m57Var3.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                        v47 v47Var4 = s57Var2.d;
                                        int i62 = g57Var2.u;
                                        v47Var4.e = i62;
                                        int i7 = g57Var2.v;
                                        v47Var4.f = i7;
                                        v47Var4.d = ou1.b(i62, i7, a);
                                        s57Var2.b();
                                        s57Var2.a(true);
                                        break;
                                    } else {
                                        m57Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                g57 g57Var3 = m57Var3.e;
                                s57 s57Var3 = m57Var3.d0;
                                v47 v47Var5 = s57Var3.d;
                                int i8 = s57Var3.x;
                                boolean z72 = s57Var3.b;
                                if (v47Var5.d != null && !z72) {
                                    v47Var5.d = null;
                                    g57Var3.e(false);
                                    m57Var3.g(false, true);
                                    m57Var3.l(true);
                                    break;
                                } else if (g57Var3.v - g57Var3.u <= uc7.s1(i8).l4.V1.f()) {
                                    r47 a2 = m57Var3.a(null);
                                    if (a2 != null) {
                                        if (!g57Var3.w()) {
                                            v47Var5.e = 0;
                                            int min = Math.min(uc7.s1(i8).l4.V1.f(), ou1.d(a2));
                                            v47Var5.f = min;
                                            v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                            View b62 = m57Var3.b();
                                            if (b62 instanceof wb2) {
                                                g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                            }
                                            if (!z72) {
                                                m57Var3.s.getSwipeBack().e(m57Var3.J);
                                            }
                                            m57Var3.g(true, true);
                                            break;
                                        } else {
                                            v47Var5.e = g57Var3.u;
                                            v47Var5.f = g57Var3.v;
                                            hmb hmbVar2 = g57Var3.W;
                                            v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var3.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                            s57Var3.b();
                                            s57Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    m57Var3.f();
                                    break;
                                }
                                break;
                            case 3:
                                m57Var3.d0.c(false);
                                break;
                            case 4:
                                m57Var3.d0.c(false);
                                break;
                            case 5:
                                m57Var3.d0.a(true);
                                break;
                            case 6:
                                s57 s57Var4 = m57Var3.d0;
                                if (!s57Var4.b) {
                                    ks1 ks1Var = (ks1) s57Var4;
                                    ks1Var.a(true);
                                    zu1 zu1Var = ks1Var.I;
                                    zu1Var.F5 = null;
                                    zu1Var.D5 = null;
                                    zu1Var.x5.f(null, null, zu1Var.l6, null);
                                    zu1Var.D6();
                                    break;
                                } else {
                                    ks1 ks1Var2 = (ks1) s57Var4;
                                    ks1Var2.a(true);
                                    zu1 zu1Var2 = ks1Var2.I;
                                    zu1Var2.D5 = null;
                                    zu1Var2.dc(zu1Var2.F5);
                                    break;
                                }
                            case 7:
                                m57Var3.d0.c(true);
                                break;
                            case 8:
                                m57Var3.d0.a(true);
                                break;
                            case 9:
                                ks1 ks1Var3 = (ks1) m57Var3.d0;
                                ks1Var3.a(true);
                                zu1 zu1Var3 = ks1Var3.I;
                                zu1Var3.x5.d(null, zu1Var3.l6);
                                zu1Var3.D6();
                                break;
                            case 10:
                                m57Var3.d0.a(true);
                                break;
                            case 11:
                                ks1 ks1Var4 = (ks1) m57Var3.d0;
                                ks1Var4.a(true);
                                zu1 zu1Var4 = ks1Var4.I;
                                zu1Var4.Y5 = null;
                                nr1 nr1Var = zu1Var4.a0;
                                if (nr1Var != null) {
                                    nr1Var.M3 = null;
                                    nr1Var.N3 = false;
                                }
                                v47 v47Var6 = zu1Var4.x5;
                                if (v47Var6 != null) {
                                    i52 = ((e) zu1Var4).currentAccount;
                                    r47 r47Var = zu1Var4.F5;
                                    v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                }
                                zu1Var4.D6();
                                break;
                            case 12:
                                v47 v47Var7 = m57Var3.d0.d;
                                if (v47Var7.o) {
                                    boolean z8 = !v47Var7.q;
                                    v47Var7.q = z8;
                                    m57Var3.H.a(z8, true);
                                    m57Var3.I.a(v47Var7.q, true);
                                    if (m57Var3.r.e.size() > 0 && (message2 = ((r47) m57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z9 = v47Var7.q;
                                        messageMedia2.force_small_media = z9;
                                        messageMedia2.force_large_media = !z9;
                                    }
                                    if (m57Var3.r.f.size() > 0 && (message = ((r47) m57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z10 = v47Var7.q;
                                        messageMedia.force_small_media = z10;
                                        messageMedia.force_large_media = !z10;
                                    }
                                    m57Var3.i();
                                    m57Var3.V = true;
                                    break;
                                }
                                break;
                            default:
                                v47 v47Var8 = m57Var3.d0.d;
                                boolean z11 = v47Var8.r;
                                v47Var8.r = !z11;
                                m57Var3.F.a(z11, true);
                                if (m57Var3.r.e.size() > 0 && (message4 = ((r47) m57Var3.r.e.get(0)).k) != null) {
                                    message4.invert_media = v47Var8.r;
                                }
                                if (m57Var3.r.f.size() > 0 && (message3 = ((r47) m57Var3.r.f.get(0)).k) != null) {
                                    message3.invert_media = v47Var8.r;
                                }
                                m57Var3.i();
                                m57Var3.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var5, tre.o(-1, 48));
                b8 b8Var6 = new b8(1, s57Var.G, context, false, true);
                b8Var6.j(ob6.M0(z4 ? 2131751325 : 2131751324, r11), R.drawable.msg_delete, r11);
                int i7 = aob.q7;
                int i8 = aob.p7;
                b8Var6.c(i7, i8);
                b8Var6.h(0.12f, i8);
                final byte b9 = 6;
                b8Var6.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                    public final /* synthetic */ m57 b;

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
                        m57 m57Var3 = this.b;
                        switch (b52) {
                            case 0:
                                m57Var3.d0.d.d = null;
                                m57Var3.e.e(false);
                                m57Var3.g(false, false);
                                m57Var3.s.getSwipeBack().b(true);
                                break;
                            case 1:
                                g57 g57Var2 = m57Var3.e;
                                s57 s57Var2 = m57Var3.d0;
                                if (m57Var3.a(null) != null) {
                                    if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                        hmb hmbVar = g57Var2.W;
                                        r47 a = m57Var3.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                        v47 v47Var4 = s57Var2.d;
                                        int i62 = g57Var2.u;
                                        v47Var4.e = i62;
                                        int i72 = g57Var2.v;
                                        v47Var4.f = i72;
                                        v47Var4.d = ou1.b(i62, i72, a);
                                        s57Var2.b();
                                        s57Var2.a(true);
                                        break;
                                    } else {
                                        m57Var3.f();
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                g57 g57Var3 = m57Var3.e;
                                s57 s57Var3 = m57Var3.d0;
                                v47 v47Var5 = s57Var3.d;
                                int i82 = s57Var3.x;
                                boolean z72 = s57Var3.b;
                                if (v47Var5.d != null && !z72) {
                                    v47Var5.d = null;
                                    g57Var3.e(false);
                                    m57Var3.g(false, true);
                                    m57Var3.l(true);
                                    break;
                                } else if (g57Var3.v - g57Var3.u <= uc7.s1(i82).l4.V1.f()) {
                                    r47 a2 = m57Var3.a(null);
                                    if (a2 != null) {
                                        if (!g57Var3.w()) {
                                            v47Var5.e = 0;
                                            int min = Math.min(uc7.s1(i82).l4.V1.f(), ou1.d(a2));
                                            v47Var5.f = min;
                                            v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                            View b62 = m57Var3.b();
                                            if (b62 instanceof wb2) {
                                                g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                            }
                                            if (!z72) {
                                                m57Var3.s.getSwipeBack().e(m57Var3.J);
                                            }
                                            m57Var3.g(true, true);
                                            break;
                                        } else {
                                            v47Var5.e = g57Var3.u;
                                            v47Var5.f = g57Var3.v;
                                            hmb hmbVar2 = g57Var3.W;
                                            v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var3.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                            s57Var3.b();
                                            s57Var3.a(true);
                                            break;
                                        }
                                    }
                                } else {
                                    m57Var3.f();
                                    break;
                                }
                                break;
                            case 3:
                                m57Var3.d0.c(false);
                                break;
                            case 4:
                                m57Var3.d0.c(false);
                                break;
                            case 5:
                                m57Var3.d0.a(true);
                                break;
                            case 6:
                                s57 s57Var4 = m57Var3.d0;
                                if (!s57Var4.b) {
                                    ks1 ks1Var = (ks1) s57Var4;
                                    ks1Var.a(true);
                                    zu1 zu1Var = ks1Var.I;
                                    zu1Var.F5 = null;
                                    zu1Var.D5 = null;
                                    zu1Var.x5.f(null, null, zu1Var.l6, null);
                                    zu1Var.D6();
                                    break;
                                } else {
                                    ks1 ks1Var2 = (ks1) s57Var4;
                                    ks1Var2.a(true);
                                    zu1 zu1Var2 = ks1Var2.I;
                                    zu1Var2.D5 = null;
                                    zu1Var2.dc(zu1Var2.F5);
                                    break;
                                }
                            case 7:
                                m57Var3.d0.c(true);
                                break;
                            case 8:
                                m57Var3.d0.a(true);
                                break;
                            case 9:
                                ks1 ks1Var3 = (ks1) m57Var3.d0;
                                ks1Var3.a(true);
                                zu1 zu1Var3 = ks1Var3.I;
                                zu1Var3.x5.d(null, zu1Var3.l6);
                                zu1Var3.D6();
                                break;
                            case 10:
                                m57Var3.d0.a(true);
                                break;
                            case 11:
                                ks1 ks1Var4 = (ks1) m57Var3.d0;
                                ks1Var4.a(true);
                                zu1 zu1Var4 = ks1Var4.I;
                                zu1Var4.Y5 = null;
                                nr1 nr1Var = zu1Var4.a0;
                                if (nr1Var != null) {
                                    nr1Var.M3 = null;
                                    nr1Var.N3 = false;
                                }
                                v47 v47Var6 = zu1Var4.x5;
                                if (v47Var6 != null) {
                                    i52 = ((e) zu1Var4).currentAccount;
                                    r47 r47Var = zu1Var4.F5;
                                    v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                }
                                zu1Var4.D6();
                                break;
                            case 12:
                                v47 v47Var7 = m57Var3.d0.d;
                                if (v47Var7.o) {
                                    boolean z8 = !v47Var7.q;
                                    v47Var7.q = z8;
                                    m57Var3.H.a(z8, true);
                                    m57Var3.I.a(v47Var7.q, true);
                                    if (m57Var3.r.e.size() > 0 && (message2 = ((r47) m57Var3.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                        boolean z9 = v47Var7.q;
                                        messageMedia2.force_small_media = z9;
                                        messageMedia2.force_large_media = !z9;
                                    }
                                    if (m57Var3.r.f.size() > 0 && (message = ((r47) m57Var3.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                        boolean z10 = v47Var7.q;
                                        messageMedia.force_small_media = z10;
                                        messageMedia.force_large_media = !z10;
                                    }
                                    m57Var3.i();
                                    m57Var3.V = true;
                                    break;
                                }
                                break;
                            default:
                                v47 v47Var8 = m57Var3.d0.d;
                                boolean z11 = v47Var8.r;
                                v47Var8.r = !z11;
                                m57Var3.F.a(z11, true);
                                if (m57Var3.r.e.size() > 0 && (message4 = ((r47) m57Var3.r.e.get(0)).k) != null) {
                                    message4.invert_media = v47Var8.r;
                                }
                                if (m57Var3.r.f.size() > 0 && (message3 = ((r47) m57Var3.r.f.get(0)).k) != null) {
                                    message3.invert_media = v47Var8.r;
                                }
                                m57Var3.i();
                                m57Var3.V = true;
                                break;
                        }
                    }
                });
                actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var6, tre.o(-1, 48));
                context2 = context;
                m57Var2 = this;
                viewOutlineProvider = r11;
                i2 = m57Var2.a;
                if (i2 == 1) {
                    m57Var2.r = v47Var.b;
                } else if (i2 == 0) {
                    m57Var2.r = v47Var.a;
                } else if (i2 == 2) {
                    m57Var2.r = v47Var.c;
                }
                m = m57Var2.e.m(context2);
                m57Var2.d = m;
                m.setElevation(hl.L(8.0f));
                m.setOutlineProvider(viewOutlineProvider);
                if (m.getParent() instanceof ViewGroup) {
                    ((ViewGroup) m.getParent()).removeView(m);
                }
                m57Var2.addView(m, tre.d(-1, -1.0f, 51, 0.0f, a.getCurrentActionBarHeight() / hl.p, 0.0f, 0.0f));
                m57Var2.e.Q(m57Var2.f);
            }
        }
        v47Var = v47Var3;
        viewOutlineProvider = null;
        viewOutlineProvider = null;
        if (i != 1 || v47Var.b == null) {
            final m57 m57Var3 = this;
            m57Var = m57Var3;
            if (i == 2) {
                m57Var = m57Var3;
                if (v47Var.c != null) {
                    r57 r57Var3 = new r57(context, R.raw.position_below, ob6.M0(2131748681, null), R.raw.position_above, ob6.M0(2131748677, null), s57Var.G);
                    m57Var3.F = r57Var3;
                    r57Var3.a(!v47Var.r, false);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(r57Var3, tre.o(-1, 48));
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    m57Var3.G = frameLayout3;
                    int i9 = aob.I5;
                    hf0 Y2 = aob.Y(aob.v0(i9, o57Var), 0, 0);
                    uob M2 = yob.M(i9);
                    frameLayout3.setBackground(Y2);
                    yob.j(frameLayout3, Y2, null, M2, o57Var);
                    r57 r57Var4 = new r57(context, R.raw.media_shrink, ob6.M0(2131748653, null), R.raw.media_enlarge, ob6.M0(2131748652, null), s57Var.G);
                    m57Var3.H = r57Var4;
                    r57Var4.setBackground(null);
                    r57Var4.setVisibility(v47Var.p ? 4 : 0);
                    frameLayout3.addView(r57Var4, tre.o(-1, 48));
                    r57 r57Var5 = new r57(context, R.raw.media_shrink, ob6.M0(2131748639, null), R.raw.media_enlarge, ob6.M0(2131748638, null), s57Var.G);
                    m57Var3.I = r57Var5;
                    r57Var5.setBackground(null);
                    r57Var5.setVisibility(!v47Var.p ? 4 : 0);
                    frameLayout3.setAlpha(v47Var.o ? 1.0f : 0.5f);
                    frameLayout3.addView(r57Var5, tre.o(-1, 48));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(frameLayout3, tre.o(-1, 48));
                    frameLayout3.setVisibility((!v47Var.n || v47Var.o) ? 0 : 8);
                    r57Var4.a(v47Var.q, false);
                    r57Var5.a(v47Var.q, false);
                    View k8Var3 = new k8(context, o57Var);
                    yob.i(k8Var3, yob.K(0.06f, aob.E8), o57Var);
                    k8Var3.setTag(R.id.fit_width_tag, 1);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(k8Var3, tre.o(-1, 8));
                    b8 b8Var7 = new b8(1, s57Var.G, context, false, false);
                    b8Var7.j(ob6.M0(2131754211, null), R.drawable.msg_select, null);
                    final byte b10 = 10;
                    b8Var7.setOnClickListener(new View.OnClickListener(m57Var3) { // from class: a57
                        public final /* synthetic */ m57 b;

                        {
                            this.b = m57Var3;
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
                            m57 m57Var32 = this.b;
                            switch (b52) {
                                case 0:
                                    m57Var32.d0.d.d = null;
                                    m57Var32.e.e(false);
                                    m57Var32.g(false, false);
                                    m57Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    g57 g57Var2 = m57Var32.e;
                                    s57 s57Var2 = m57Var32.d0;
                                    if (m57Var32.a(null) != null) {
                                        if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                            hmb hmbVar = g57Var2.W;
                                            r47 a = m57Var32.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                            v47 v47Var4 = s57Var2.d;
                                            int i62 = g57Var2.u;
                                            v47Var4.e = i62;
                                            int i72 = g57Var2.v;
                                            v47Var4.f = i72;
                                            v47Var4.d = ou1.b(i62, i72, a);
                                            s57Var2.b();
                                            s57Var2.a(true);
                                            break;
                                        } else {
                                            m57Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    g57 g57Var3 = m57Var32.e;
                                    s57 s57Var3 = m57Var32.d0;
                                    v47 v47Var5 = s57Var3.d;
                                    int i82 = s57Var3.x;
                                    boolean z72 = s57Var3.b;
                                    if (v47Var5.d != null && !z72) {
                                        v47Var5.d = null;
                                        g57Var3.e(false);
                                        m57Var32.g(false, true);
                                        m57Var32.l(true);
                                        break;
                                    } else if (g57Var3.v - g57Var3.u <= uc7.s1(i82).l4.V1.f()) {
                                        r47 a2 = m57Var32.a(null);
                                        if (a2 != null) {
                                            if (!g57Var3.w()) {
                                                v47Var5.e = 0;
                                                int min = Math.min(uc7.s1(i82).l4.V1.f(), ou1.d(a2));
                                                v47Var5.f = min;
                                                v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                                View b62 = m57Var32.b();
                                                if (b62 instanceof wb2) {
                                                    g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                                }
                                                if (!z72) {
                                                    m57Var32.s.getSwipeBack().e(m57Var32.J);
                                                }
                                                m57Var32.g(true, true);
                                                break;
                                            } else {
                                                v47Var5.e = g57Var3.u;
                                                v47Var5.f = g57Var3.v;
                                                hmb hmbVar2 = g57Var3.W;
                                                v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var32.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                                s57Var3.b();
                                                s57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        m57Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    m57Var32.d0.c(false);
                                    break;
                                case 4:
                                    m57Var32.d0.c(false);
                                    break;
                                case 5:
                                    m57Var32.d0.a(true);
                                    break;
                                case 6:
                                    s57 s57Var4 = m57Var32.d0;
                                    if (!s57Var4.b) {
                                        ks1 ks1Var = (ks1) s57Var4;
                                        ks1Var.a(true);
                                        zu1 zu1Var = ks1Var.I;
                                        zu1Var.F5 = null;
                                        zu1Var.D5 = null;
                                        zu1Var.x5.f(null, null, zu1Var.l6, null);
                                        zu1Var.D6();
                                        break;
                                    } else {
                                        ks1 ks1Var2 = (ks1) s57Var4;
                                        ks1Var2.a(true);
                                        zu1 zu1Var2 = ks1Var2.I;
                                        zu1Var2.D5 = null;
                                        zu1Var2.dc(zu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    m57Var32.d0.c(true);
                                    break;
                                case 8:
                                    m57Var32.d0.a(true);
                                    break;
                                case 9:
                                    ks1 ks1Var3 = (ks1) m57Var32.d0;
                                    ks1Var3.a(true);
                                    zu1 zu1Var3 = ks1Var3.I;
                                    zu1Var3.x5.d(null, zu1Var3.l6);
                                    zu1Var3.D6();
                                    break;
                                case 10:
                                    m57Var32.d0.a(true);
                                    break;
                                case 11:
                                    ks1 ks1Var4 = (ks1) m57Var32.d0;
                                    ks1Var4.a(true);
                                    zu1 zu1Var4 = ks1Var4.I;
                                    zu1Var4.Y5 = null;
                                    nr1 nr1Var = zu1Var4.a0;
                                    if (nr1Var != null) {
                                        nr1Var.M3 = null;
                                        nr1Var.N3 = false;
                                    }
                                    v47 v47Var6 = zu1Var4.x5;
                                    if (v47Var6 != null) {
                                        i52 = ((e) zu1Var4).currentAccount;
                                        r47 r47Var = zu1Var4.F5;
                                        v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                    }
                                    zu1Var4.D6();
                                    break;
                                case 12:
                                    v47 v47Var7 = m57Var32.d0.d;
                                    if (v47Var7.o) {
                                        boolean z8 = !v47Var7.q;
                                        v47Var7.q = z8;
                                        m57Var32.H.a(z8, true);
                                        m57Var32.I.a(v47Var7.q, true);
                                        if (m57Var32.r.e.size() > 0 && (message2 = ((r47) m57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = v47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (m57Var32.r.f.size() > 0 && (message = ((r47) m57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = v47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        m57Var32.i();
                                        m57Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    v47 v47Var8 = m57Var32.d0.d;
                                    boolean z11 = v47Var8.r;
                                    v47Var8.r = !z11;
                                    m57Var32.F.a(z11, true);
                                    if (m57Var32.r.e.size() > 0 && (message4 = ((r47) m57Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = v47Var8.r;
                                    }
                                    if (m57Var32.r.f.size() > 0 && (message3 = ((r47) m57Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = v47Var8.r;
                                    }
                                    m57Var32.i();
                                    m57Var32.V = true;
                                    break;
                            }
                        }
                    });
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var7, tre.o(-1, 48));
                    b8 b8Var8 = new b8(1, s57Var.G, context, false, true);
                    context2 = context;
                    b8Var8.j(ob6.M0(2131751326, null), R.drawable.msg_delete, null);
                    int i10 = aob.q7;
                    int i11 = aob.p7;
                    b8Var8.c(i10, i11);
                    final byte b11 = 11;
                    b8Var8.setOnClickListener(new View.OnClickListener(m57Var3) { // from class: a57
                        public final /* synthetic */ m57 b;

                        {
                            this.b = m57Var3;
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
                            m57 m57Var32 = this.b;
                            switch (b52) {
                                case 0:
                                    m57Var32.d0.d.d = null;
                                    m57Var32.e.e(false);
                                    m57Var32.g(false, false);
                                    m57Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    g57 g57Var2 = m57Var32.e;
                                    s57 s57Var2 = m57Var32.d0;
                                    if (m57Var32.a(null) != null) {
                                        if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                            hmb hmbVar = g57Var2.W;
                                            r47 a = m57Var32.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                            v47 v47Var4 = s57Var2.d;
                                            int i62 = g57Var2.u;
                                            v47Var4.e = i62;
                                            int i72 = g57Var2.v;
                                            v47Var4.f = i72;
                                            v47Var4.d = ou1.b(i62, i72, a);
                                            s57Var2.b();
                                            s57Var2.a(true);
                                            break;
                                        } else {
                                            m57Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    g57 g57Var3 = m57Var32.e;
                                    s57 s57Var3 = m57Var32.d0;
                                    v47 v47Var5 = s57Var3.d;
                                    int i82 = s57Var3.x;
                                    boolean z72 = s57Var3.b;
                                    if (v47Var5.d != null && !z72) {
                                        v47Var5.d = null;
                                        g57Var3.e(false);
                                        m57Var32.g(false, true);
                                        m57Var32.l(true);
                                        break;
                                    } else if (g57Var3.v - g57Var3.u <= uc7.s1(i82).l4.V1.f()) {
                                        r47 a2 = m57Var32.a(null);
                                        if (a2 != null) {
                                            if (!g57Var3.w()) {
                                                v47Var5.e = 0;
                                                int min = Math.min(uc7.s1(i82).l4.V1.f(), ou1.d(a2));
                                                v47Var5.f = min;
                                                v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                                View b62 = m57Var32.b();
                                                if (b62 instanceof wb2) {
                                                    g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                                }
                                                if (!z72) {
                                                    m57Var32.s.getSwipeBack().e(m57Var32.J);
                                                }
                                                m57Var32.g(true, true);
                                                break;
                                            } else {
                                                v47Var5.e = g57Var3.u;
                                                v47Var5.f = g57Var3.v;
                                                hmb hmbVar2 = g57Var3.W;
                                                v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var32.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                                s57Var3.b();
                                                s57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        m57Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    m57Var32.d0.c(false);
                                    break;
                                case 4:
                                    m57Var32.d0.c(false);
                                    break;
                                case 5:
                                    m57Var32.d0.a(true);
                                    break;
                                case 6:
                                    s57 s57Var4 = m57Var32.d0;
                                    if (!s57Var4.b) {
                                        ks1 ks1Var = (ks1) s57Var4;
                                        ks1Var.a(true);
                                        zu1 zu1Var = ks1Var.I;
                                        zu1Var.F5 = null;
                                        zu1Var.D5 = null;
                                        zu1Var.x5.f(null, null, zu1Var.l6, null);
                                        zu1Var.D6();
                                        break;
                                    } else {
                                        ks1 ks1Var2 = (ks1) s57Var4;
                                        ks1Var2.a(true);
                                        zu1 zu1Var2 = ks1Var2.I;
                                        zu1Var2.D5 = null;
                                        zu1Var2.dc(zu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    m57Var32.d0.c(true);
                                    break;
                                case 8:
                                    m57Var32.d0.a(true);
                                    break;
                                case 9:
                                    ks1 ks1Var3 = (ks1) m57Var32.d0;
                                    ks1Var3.a(true);
                                    zu1 zu1Var3 = ks1Var3.I;
                                    zu1Var3.x5.d(null, zu1Var3.l6);
                                    zu1Var3.D6();
                                    break;
                                case 10:
                                    m57Var32.d0.a(true);
                                    break;
                                case 11:
                                    ks1 ks1Var4 = (ks1) m57Var32.d0;
                                    ks1Var4.a(true);
                                    zu1 zu1Var4 = ks1Var4.I;
                                    zu1Var4.Y5 = null;
                                    nr1 nr1Var = zu1Var4.a0;
                                    if (nr1Var != null) {
                                        nr1Var.M3 = null;
                                        nr1Var.N3 = false;
                                    }
                                    v47 v47Var6 = zu1Var4.x5;
                                    if (v47Var6 != null) {
                                        i52 = ((e) zu1Var4).currentAccount;
                                        r47 r47Var = zu1Var4.F5;
                                        v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                    }
                                    zu1Var4.D6();
                                    break;
                                case 12:
                                    v47 v47Var7 = m57Var32.d0.d;
                                    if (v47Var7.o) {
                                        boolean z8 = !v47Var7.q;
                                        v47Var7.q = z8;
                                        m57Var32.H.a(z8, true);
                                        m57Var32.I.a(v47Var7.q, true);
                                        if (m57Var32.r.e.size() > 0 && (message2 = ((r47) m57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = v47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (m57Var32.r.f.size() > 0 && (message = ((r47) m57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = v47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        m57Var32.i();
                                        m57Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    v47 v47Var8 = m57Var32.d0.d;
                                    boolean z11 = v47Var8.r;
                                    v47Var8.r = !z11;
                                    m57Var32.F.a(z11, true);
                                    if (m57Var32.r.e.size() > 0 && (message4 = ((r47) m57Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = v47Var8.r;
                                    }
                                    if (m57Var32.r.f.size() > 0 && (message3 = ((r47) m57Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = v47Var8.r;
                                    }
                                    m57Var32.i();
                                    m57Var32.V = true;
                                    break;
                            }
                        }
                    });
                    b8Var8.h(0.12f, i11);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(b8Var8, tre.o(-1, 48));
                    final byte b12 = 12;
                    frameLayout3.setOnClickListener(new View.OnClickListener(m57Var3) { // from class: a57
                        public final /* synthetic */ m57 b;

                        {
                            this.b = m57Var3;
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
                            m57 m57Var32 = this.b;
                            switch (b52) {
                                case 0:
                                    m57Var32.d0.d.d = null;
                                    m57Var32.e.e(false);
                                    m57Var32.g(false, false);
                                    m57Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    g57 g57Var2 = m57Var32.e;
                                    s57 s57Var2 = m57Var32.d0;
                                    if (m57Var32.a(null) != null) {
                                        if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                            hmb hmbVar = g57Var2.W;
                                            r47 a = m57Var32.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                            v47 v47Var4 = s57Var2.d;
                                            int i62 = g57Var2.u;
                                            v47Var4.e = i62;
                                            int i72 = g57Var2.v;
                                            v47Var4.f = i72;
                                            v47Var4.d = ou1.b(i62, i72, a);
                                            s57Var2.b();
                                            s57Var2.a(true);
                                            break;
                                        } else {
                                            m57Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    g57 g57Var3 = m57Var32.e;
                                    s57 s57Var3 = m57Var32.d0;
                                    v47 v47Var5 = s57Var3.d;
                                    int i82 = s57Var3.x;
                                    boolean z72 = s57Var3.b;
                                    if (v47Var5.d != null && !z72) {
                                        v47Var5.d = null;
                                        g57Var3.e(false);
                                        m57Var32.g(false, true);
                                        m57Var32.l(true);
                                        break;
                                    } else if (g57Var3.v - g57Var3.u <= uc7.s1(i82).l4.V1.f()) {
                                        r47 a2 = m57Var32.a(null);
                                        if (a2 != null) {
                                            if (!g57Var3.w()) {
                                                v47Var5.e = 0;
                                                int min = Math.min(uc7.s1(i82).l4.V1.f(), ou1.d(a2));
                                                v47Var5.f = min;
                                                v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                                View b62 = m57Var32.b();
                                                if (b62 instanceof wb2) {
                                                    g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                                }
                                                if (!z72) {
                                                    m57Var32.s.getSwipeBack().e(m57Var32.J);
                                                }
                                                m57Var32.g(true, true);
                                                break;
                                            } else {
                                                v47Var5.e = g57Var3.u;
                                                v47Var5.f = g57Var3.v;
                                                hmb hmbVar2 = g57Var3.W;
                                                v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var32.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                                s57Var3.b();
                                                s57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        m57Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    m57Var32.d0.c(false);
                                    break;
                                case 4:
                                    m57Var32.d0.c(false);
                                    break;
                                case 5:
                                    m57Var32.d0.a(true);
                                    break;
                                case 6:
                                    s57 s57Var4 = m57Var32.d0;
                                    if (!s57Var4.b) {
                                        ks1 ks1Var = (ks1) s57Var4;
                                        ks1Var.a(true);
                                        zu1 zu1Var = ks1Var.I;
                                        zu1Var.F5 = null;
                                        zu1Var.D5 = null;
                                        zu1Var.x5.f(null, null, zu1Var.l6, null);
                                        zu1Var.D6();
                                        break;
                                    } else {
                                        ks1 ks1Var2 = (ks1) s57Var4;
                                        ks1Var2.a(true);
                                        zu1 zu1Var2 = ks1Var2.I;
                                        zu1Var2.D5 = null;
                                        zu1Var2.dc(zu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    m57Var32.d0.c(true);
                                    break;
                                case 8:
                                    m57Var32.d0.a(true);
                                    break;
                                case 9:
                                    ks1 ks1Var3 = (ks1) m57Var32.d0;
                                    ks1Var3.a(true);
                                    zu1 zu1Var3 = ks1Var3.I;
                                    zu1Var3.x5.d(null, zu1Var3.l6);
                                    zu1Var3.D6();
                                    break;
                                case 10:
                                    m57Var32.d0.a(true);
                                    break;
                                case 11:
                                    ks1 ks1Var4 = (ks1) m57Var32.d0;
                                    ks1Var4.a(true);
                                    zu1 zu1Var4 = ks1Var4.I;
                                    zu1Var4.Y5 = null;
                                    nr1 nr1Var = zu1Var4.a0;
                                    if (nr1Var != null) {
                                        nr1Var.M3 = null;
                                        nr1Var.N3 = false;
                                    }
                                    v47 v47Var6 = zu1Var4.x5;
                                    if (v47Var6 != null) {
                                        i52 = ((e) zu1Var4).currentAccount;
                                        r47 r47Var = zu1Var4.F5;
                                        v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                    }
                                    zu1Var4.D6();
                                    break;
                                case 12:
                                    v47 v47Var7 = m57Var32.d0.d;
                                    if (v47Var7.o) {
                                        boolean z8 = !v47Var7.q;
                                        v47Var7.q = z8;
                                        m57Var32.H.a(z8, true);
                                        m57Var32.I.a(v47Var7.q, true);
                                        if (m57Var32.r.e.size() > 0 && (message2 = ((r47) m57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = v47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (m57Var32.r.f.size() > 0 && (message = ((r47) m57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = v47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        m57Var32.i();
                                        m57Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    v47 v47Var8 = m57Var32.d0.d;
                                    boolean z11 = v47Var8.r;
                                    v47Var8.r = !z11;
                                    m57Var32.F.a(z11, true);
                                    if (m57Var32.r.e.size() > 0 && (message4 = ((r47) m57Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = v47Var8.r;
                                    }
                                    if (m57Var32.r.f.size() > 0 && (message3 = ((r47) m57Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = v47Var8.r;
                                    }
                                    m57Var32.i();
                                    m57Var32.V = true;
                                    break;
                            }
                        }
                    });
                    final byte b13 = 13;
                    r57Var3.setOnClickListener(new View.OnClickListener(m57Var3) { // from class: a57
                        public final /* synthetic */ m57 b;

                        {
                            this.b = m57Var3;
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
                            m57 m57Var32 = this.b;
                            switch (b52) {
                                case 0:
                                    m57Var32.d0.d.d = null;
                                    m57Var32.e.e(false);
                                    m57Var32.g(false, false);
                                    m57Var32.s.getSwipeBack().b(true);
                                    break;
                                case 1:
                                    g57 g57Var2 = m57Var32.e;
                                    s57 s57Var2 = m57Var32.d0;
                                    if (m57Var32.a(null) != null) {
                                        if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                            hmb hmbVar = g57Var2.W;
                                            r47 a = m57Var32.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                            v47 v47Var4 = s57Var2.d;
                                            int i62 = g57Var2.u;
                                            v47Var4.e = i62;
                                            int i72 = g57Var2.v;
                                            v47Var4.f = i72;
                                            v47Var4.d = ou1.b(i62, i72, a);
                                            s57Var2.b();
                                            s57Var2.a(true);
                                            break;
                                        } else {
                                            m57Var32.f();
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    g57 g57Var3 = m57Var32.e;
                                    s57 s57Var3 = m57Var32.d0;
                                    v47 v47Var5 = s57Var3.d;
                                    int i82 = s57Var3.x;
                                    boolean z72 = s57Var3.b;
                                    if (v47Var5.d != null && !z72) {
                                        v47Var5.d = null;
                                        g57Var3.e(false);
                                        m57Var32.g(false, true);
                                        m57Var32.l(true);
                                        break;
                                    } else if (g57Var3.v - g57Var3.u <= uc7.s1(i82).l4.V1.f()) {
                                        r47 a2 = m57Var32.a(null);
                                        if (a2 != null) {
                                            if (!g57Var3.w()) {
                                                v47Var5.e = 0;
                                                int min = Math.min(uc7.s1(i82).l4.V1.f(), ou1.d(a2));
                                                v47Var5.f = min;
                                                v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                                View b62 = m57Var32.b();
                                                if (b62 instanceof wb2) {
                                                    g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                                }
                                                if (!z72) {
                                                    m57Var32.s.getSwipeBack().e(m57Var32.J);
                                                }
                                                m57Var32.g(true, true);
                                                break;
                                            } else {
                                                v47Var5.e = g57Var3.u;
                                                v47Var5.f = g57Var3.v;
                                                hmb hmbVar2 = g57Var3.W;
                                                v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var32.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                                s57Var3.b();
                                                s57Var3.a(true);
                                                break;
                                            }
                                        }
                                    } else {
                                        m57Var32.f();
                                        break;
                                    }
                                    break;
                                case 3:
                                    m57Var32.d0.c(false);
                                    break;
                                case 4:
                                    m57Var32.d0.c(false);
                                    break;
                                case 5:
                                    m57Var32.d0.a(true);
                                    break;
                                case 6:
                                    s57 s57Var4 = m57Var32.d0;
                                    if (!s57Var4.b) {
                                        ks1 ks1Var = (ks1) s57Var4;
                                        ks1Var.a(true);
                                        zu1 zu1Var = ks1Var.I;
                                        zu1Var.F5 = null;
                                        zu1Var.D5 = null;
                                        zu1Var.x5.f(null, null, zu1Var.l6, null);
                                        zu1Var.D6();
                                        break;
                                    } else {
                                        ks1 ks1Var2 = (ks1) s57Var4;
                                        ks1Var2.a(true);
                                        zu1 zu1Var2 = ks1Var2.I;
                                        zu1Var2.D5 = null;
                                        zu1Var2.dc(zu1Var2.F5);
                                        break;
                                    }
                                case 7:
                                    m57Var32.d0.c(true);
                                    break;
                                case 8:
                                    m57Var32.d0.a(true);
                                    break;
                                case 9:
                                    ks1 ks1Var3 = (ks1) m57Var32.d0;
                                    ks1Var3.a(true);
                                    zu1 zu1Var3 = ks1Var3.I;
                                    zu1Var3.x5.d(null, zu1Var3.l6);
                                    zu1Var3.D6();
                                    break;
                                case 10:
                                    m57Var32.d0.a(true);
                                    break;
                                case 11:
                                    ks1 ks1Var4 = (ks1) m57Var32.d0;
                                    ks1Var4.a(true);
                                    zu1 zu1Var4 = ks1Var4.I;
                                    zu1Var4.Y5 = null;
                                    nr1 nr1Var = zu1Var4.a0;
                                    if (nr1Var != null) {
                                        nr1Var.M3 = null;
                                        nr1Var.N3 = false;
                                    }
                                    v47 v47Var6 = zu1Var4.x5;
                                    if (v47Var6 != null) {
                                        i52 = ((e) zu1Var4).currentAccount;
                                        r47 r47Var = zu1Var4.F5;
                                        v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                                    }
                                    zu1Var4.D6();
                                    break;
                                case 12:
                                    v47 v47Var7 = m57Var32.d0.d;
                                    if (v47Var7.o) {
                                        boolean z8 = !v47Var7.q;
                                        v47Var7.q = z8;
                                        m57Var32.H.a(z8, true);
                                        m57Var32.I.a(v47Var7.q, true);
                                        if (m57Var32.r.e.size() > 0 && (message2 = ((r47) m57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                            boolean z9 = v47Var7.q;
                                            messageMedia2.force_small_media = z9;
                                            messageMedia2.force_large_media = !z9;
                                        }
                                        if (m57Var32.r.f.size() > 0 && (message = ((r47) m57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                            boolean z10 = v47Var7.q;
                                            messageMedia.force_small_media = z10;
                                            messageMedia.force_large_media = !z10;
                                        }
                                        m57Var32.i();
                                        m57Var32.V = true;
                                        break;
                                    }
                                    break;
                                default:
                                    v47 v47Var8 = m57Var32.d0.d;
                                    boolean z11 = v47Var8.r;
                                    v47Var8.r = !z11;
                                    m57Var32.F.a(z11, true);
                                    if (m57Var32.r.e.size() > 0 && (message4 = ((r47) m57Var32.r.e.get(0)).k) != null) {
                                        message4.invert_media = v47Var8.r;
                                    }
                                    if (m57Var32.r.f.size() > 0 && (message3 = ((r47) m57Var32.r.f.get(0)).k) != null) {
                                        message3.invert_media = v47Var8.r;
                                    }
                                    m57Var32.i();
                                    m57Var32.V = true;
                                    break;
                            }
                        }
                    });
                    m57Var2 = m57Var3;
                    i2 = m57Var2.a;
                    if (i2 == 1) {
                    }
                    m = m57Var2.e.m(context2);
                    m57Var2.d = m;
                    m.setElevation(hl.L(8.0f));
                    m.setOutlineProvider(viewOutlineProvider);
                    if (m.getParent() instanceof ViewGroup) {
                    }
                    m57Var2.addView(m, tre.d(-1, -1.0f, 51, 0.0f, a.getCurrentActionBarHeight() / hl.p, 0.0f, 0.0f));
                    m57Var2.e.Q(m57Var2.f);
                }
            }
        } else {
            if (!yac.h(s57Var.x).p()) {
                for (int i12 = 0; i12 < v47Var.b.e.size(); i12++) {
                    if (((r47) v47Var.b.e.get(i12)).D == 36) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            r57 r57Var6 = new r57(context, R.raw.name_hide, ob6.M0(v47Var.j ? 2131745060 : 2131745059, null), R.raw.name_show, ob6.M0(v47Var.j ? 2131749063 : 2131749062, null), s57Var.G);
            this.s.a(r57Var6, tre.o(-1, 48));
            if (v47Var.g) {
                r57Var = r57Var6;
                r57 r57Var7 = new r57(context, R.raw.caption_hide, ob6.M0(2131745072, null), R.raw.caption_show, ob6.M0(2131749075, null), s57Var.G);
                r57Var7.a(v47Var.l, false);
                this.s.a(r57Var7, tre.o(-1, 48));
                r57Var2 = r57Var7;
            } else {
                r57Var = r57Var6;
                r57Var2 = null;
            }
            b8 b8Var9 = new b8(0, s57Var.G, context, true, false);
            final byte b14 = 7;
            b8Var9.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                public final /* synthetic */ m57 b;

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
                    byte b52 = b14;
                    m57 m57Var32 = this.b;
                    switch (b52) {
                        case 0:
                            m57Var32.d0.d.d = null;
                            m57Var32.e.e(false);
                            m57Var32.g(false, false);
                            m57Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            g57 g57Var2 = m57Var32.e;
                            s57 s57Var2 = m57Var32.d0;
                            if (m57Var32.a(null) != null) {
                                if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                    hmb hmbVar = g57Var2.W;
                                    r47 a = m57Var32.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                    v47 v47Var4 = s57Var2.d;
                                    int i62 = g57Var2.u;
                                    v47Var4.e = i62;
                                    int i72 = g57Var2.v;
                                    v47Var4.f = i72;
                                    v47Var4.d = ou1.b(i62, i72, a);
                                    s57Var2.b();
                                    s57Var2.a(true);
                                    break;
                                } else {
                                    m57Var32.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            g57 g57Var3 = m57Var32.e;
                            s57 s57Var3 = m57Var32.d0;
                            v47 v47Var5 = s57Var3.d;
                            int i82 = s57Var3.x;
                            boolean z72 = s57Var3.b;
                            if (v47Var5.d != null && !z72) {
                                v47Var5.d = null;
                                g57Var3.e(false);
                                m57Var32.g(false, true);
                                m57Var32.l(true);
                                break;
                            } else if (g57Var3.v - g57Var3.u <= uc7.s1(i82).l4.V1.f()) {
                                r47 a2 = m57Var32.a(null);
                                if (a2 != null) {
                                    if (!g57Var3.w()) {
                                        v47Var5.e = 0;
                                        int min = Math.min(uc7.s1(i82).l4.V1.f(), ou1.d(a2));
                                        v47Var5.f = min;
                                        v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                        View b62 = m57Var32.b();
                                        if (b62 instanceof wb2) {
                                            g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                        }
                                        if (!z72) {
                                            m57Var32.s.getSwipeBack().e(m57Var32.J);
                                        }
                                        m57Var32.g(true, true);
                                        break;
                                    } else {
                                        v47Var5.e = g57Var3.u;
                                        v47Var5.f = g57Var3.v;
                                        hmb hmbVar2 = g57Var3.W;
                                        v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var32.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                        s57Var3.b();
                                        s57Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                m57Var32.f();
                                break;
                            }
                            break;
                        case 3:
                            m57Var32.d0.c(false);
                            break;
                        case 4:
                            m57Var32.d0.c(false);
                            break;
                        case 5:
                            m57Var32.d0.a(true);
                            break;
                        case 6:
                            s57 s57Var4 = m57Var32.d0;
                            if (!s57Var4.b) {
                                ks1 ks1Var = (ks1) s57Var4;
                                ks1Var.a(true);
                                zu1 zu1Var = ks1Var.I;
                                zu1Var.F5 = null;
                                zu1Var.D5 = null;
                                zu1Var.x5.f(null, null, zu1Var.l6, null);
                                zu1Var.D6();
                                break;
                            } else {
                                ks1 ks1Var2 = (ks1) s57Var4;
                                ks1Var2.a(true);
                                zu1 zu1Var2 = ks1Var2.I;
                                zu1Var2.D5 = null;
                                zu1Var2.dc(zu1Var2.F5);
                                break;
                            }
                        case 7:
                            m57Var32.d0.c(true);
                            break;
                        case 8:
                            m57Var32.d0.a(true);
                            break;
                        case 9:
                            ks1 ks1Var3 = (ks1) m57Var32.d0;
                            ks1Var3.a(true);
                            zu1 zu1Var3 = ks1Var3.I;
                            zu1Var3.x5.d(null, zu1Var3.l6);
                            zu1Var3.D6();
                            break;
                        case 10:
                            m57Var32.d0.a(true);
                            break;
                        case 11:
                            ks1 ks1Var4 = (ks1) m57Var32.d0;
                            ks1Var4.a(true);
                            zu1 zu1Var4 = ks1Var4.I;
                            zu1Var4.Y5 = null;
                            nr1 nr1Var = zu1Var4.a0;
                            if (nr1Var != null) {
                                nr1Var.M3 = null;
                                nr1Var.N3 = false;
                            }
                            v47 v47Var6 = zu1Var4.x5;
                            if (v47Var6 != null) {
                                i52 = ((e) zu1Var4).currentAccount;
                                r47 r47Var = zu1Var4.F5;
                                v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                            }
                            zu1Var4.D6();
                            break;
                        case 12:
                            v47 v47Var7 = m57Var32.d0.d;
                            if (v47Var7.o) {
                                boolean z8 = !v47Var7.q;
                                v47Var7.q = z8;
                                m57Var32.H.a(z8, true);
                                m57Var32.I.a(v47Var7.q, true);
                                if (m57Var32.r.e.size() > 0 && (message2 = ((r47) m57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z9 = v47Var7.q;
                                    messageMedia2.force_small_media = z9;
                                    messageMedia2.force_large_media = !z9;
                                }
                                if (m57Var32.r.f.size() > 0 && (message = ((r47) m57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z10 = v47Var7.q;
                                    messageMedia.force_small_media = z10;
                                    messageMedia.force_large_media = !z10;
                                }
                                m57Var32.i();
                                m57Var32.V = true;
                                break;
                            }
                            break;
                        default:
                            v47 v47Var8 = m57Var32.d0.d;
                            boolean z11 = v47Var8.r;
                            v47Var8.r = !z11;
                            m57Var32.F.a(z11, true);
                            if (m57Var32.r.e.size() > 0 && (message4 = ((r47) m57Var32.r.e.get(0)).k) != null) {
                                message4.invert_media = v47Var8.r;
                            }
                            if (m57Var32.r.f.size() > 0 && (message3 = ((r47) m57Var32.r.f.get(0)).k) != null) {
                                message3.invert_media = v47Var8.r;
                            }
                            m57Var32.i();
                            m57Var32.V = true;
                            break;
                    }
                }
            });
            b8Var9.j(ob6.M0(2131752513, null), R.drawable.msg_forward_replace, null);
            this.s.a(b8Var9, tre.o(-1, 48));
            k8 k8Var4 = new k8(context, o57Var);
            yob.i(k8Var4, yob.K(0.06f, aob.E8), o57Var);
            k8Var4.setTag(R.id.fit_width_tag, 1);
            final byte b15 = 8;
            this.s.a(k8Var4, tre.o(-1, 8));
            b8 b8Var10 = new b8(1, s57Var.G, context, false, false);
            b8Var10.j(ob6.M0(2131754211, null), R.drawable.msg_select, null);
            b8Var10.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                public final /* synthetic */ m57 b;

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
                    m57 m57Var32 = this.b;
                    switch (b52) {
                        case 0:
                            m57Var32.d0.d.d = null;
                            m57Var32.e.e(false);
                            m57Var32.g(false, false);
                            m57Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            g57 g57Var2 = m57Var32.e;
                            s57 s57Var2 = m57Var32.d0;
                            if (m57Var32.a(null) != null) {
                                if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                    hmb hmbVar = g57Var2.W;
                                    r47 a = m57Var32.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                    v47 v47Var4 = s57Var2.d;
                                    int i62 = g57Var2.u;
                                    v47Var4.e = i62;
                                    int i72 = g57Var2.v;
                                    v47Var4.f = i72;
                                    v47Var4.d = ou1.b(i62, i72, a);
                                    s57Var2.b();
                                    s57Var2.a(true);
                                    break;
                                } else {
                                    m57Var32.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            g57 g57Var3 = m57Var32.e;
                            s57 s57Var3 = m57Var32.d0;
                            v47 v47Var5 = s57Var3.d;
                            int i82 = s57Var3.x;
                            boolean z72 = s57Var3.b;
                            if (v47Var5.d != null && !z72) {
                                v47Var5.d = null;
                                g57Var3.e(false);
                                m57Var32.g(false, true);
                                m57Var32.l(true);
                                break;
                            } else if (g57Var3.v - g57Var3.u <= uc7.s1(i82).l4.V1.f()) {
                                r47 a2 = m57Var32.a(null);
                                if (a2 != null) {
                                    if (!g57Var3.w()) {
                                        v47Var5.e = 0;
                                        int min = Math.min(uc7.s1(i82).l4.V1.f(), ou1.d(a2));
                                        v47Var5.f = min;
                                        v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                        View b62 = m57Var32.b();
                                        if (b62 instanceof wb2) {
                                            g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                        }
                                        if (!z72) {
                                            m57Var32.s.getSwipeBack().e(m57Var32.J);
                                        }
                                        m57Var32.g(true, true);
                                        break;
                                    } else {
                                        v47Var5.e = g57Var3.u;
                                        v47Var5.f = g57Var3.v;
                                        hmb hmbVar2 = g57Var3.W;
                                        v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var32.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                        s57Var3.b();
                                        s57Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                m57Var32.f();
                                break;
                            }
                            break;
                        case 3:
                            m57Var32.d0.c(false);
                            break;
                        case 4:
                            m57Var32.d0.c(false);
                            break;
                        case 5:
                            m57Var32.d0.a(true);
                            break;
                        case 6:
                            s57 s57Var4 = m57Var32.d0;
                            if (!s57Var4.b) {
                                ks1 ks1Var = (ks1) s57Var4;
                                ks1Var.a(true);
                                zu1 zu1Var = ks1Var.I;
                                zu1Var.F5 = null;
                                zu1Var.D5 = null;
                                zu1Var.x5.f(null, null, zu1Var.l6, null);
                                zu1Var.D6();
                                break;
                            } else {
                                ks1 ks1Var2 = (ks1) s57Var4;
                                ks1Var2.a(true);
                                zu1 zu1Var2 = ks1Var2.I;
                                zu1Var2.D5 = null;
                                zu1Var2.dc(zu1Var2.F5);
                                break;
                            }
                        case 7:
                            m57Var32.d0.c(true);
                            break;
                        case 8:
                            m57Var32.d0.a(true);
                            break;
                        case 9:
                            ks1 ks1Var3 = (ks1) m57Var32.d0;
                            ks1Var3.a(true);
                            zu1 zu1Var3 = ks1Var3.I;
                            zu1Var3.x5.d(null, zu1Var3.l6);
                            zu1Var3.D6();
                            break;
                        case 10:
                            m57Var32.d0.a(true);
                            break;
                        case 11:
                            ks1 ks1Var4 = (ks1) m57Var32.d0;
                            ks1Var4.a(true);
                            zu1 zu1Var4 = ks1Var4.I;
                            zu1Var4.Y5 = null;
                            nr1 nr1Var = zu1Var4.a0;
                            if (nr1Var != null) {
                                nr1Var.M3 = null;
                                nr1Var.N3 = false;
                            }
                            v47 v47Var6 = zu1Var4.x5;
                            if (v47Var6 != null) {
                                i52 = ((e) zu1Var4).currentAccount;
                                r47 r47Var = zu1Var4.F5;
                                v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                            }
                            zu1Var4.D6();
                            break;
                        case 12:
                            v47 v47Var7 = m57Var32.d0.d;
                            if (v47Var7.o) {
                                boolean z8 = !v47Var7.q;
                                v47Var7.q = z8;
                                m57Var32.H.a(z8, true);
                                m57Var32.I.a(v47Var7.q, true);
                                if (m57Var32.r.e.size() > 0 && (message2 = ((r47) m57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z9 = v47Var7.q;
                                    messageMedia2.force_small_media = z9;
                                    messageMedia2.force_large_media = !z9;
                                }
                                if (m57Var32.r.f.size() > 0 && (message = ((r47) m57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z10 = v47Var7.q;
                                    messageMedia.force_small_media = z10;
                                    messageMedia.force_large_media = !z10;
                                }
                                m57Var32.i();
                                m57Var32.V = true;
                                break;
                            }
                            break;
                        default:
                            v47 v47Var8 = m57Var32.d0.d;
                            boolean z11 = v47Var8.r;
                            v47Var8.r = !z11;
                            m57Var32.F.a(z11, true);
                            if (m57Var32.r.e.size() > 0 && (message4 = ((r47) m57Var32.r.e.get(0)).k) != null) {
                                message4.invert_media = v47Var8.r;
                            }
                            if (m57Var32.r.f.size() > 0 && (message3 = ((r47) m57Var32.r.f.get(0)).k) != null) {
                                message3.invert_media = v47Var8.r;
                            }
                            m57Var32.i();
                            m57Var32.V = true;
                            break;
                    }
                }
            });
            this.s.a(b8Var10, tre.o(-1, 48));
            b8 b8Var11 = new b8(1, s57Var.G, context, false, true);
            b8Var11.j(ob6.M0(2131751327, null), R.drawable.msg_delete, null);
            int i13 = aob.q7;
            int i14 = aob.p7;
            b8Var11.c(i13, i14);
            final byte b16 = 9;
            b8Var11.setOnClickListener(new View.OnClickListener(this) { // from class: a57
                public final /* synthetic */ m57 b;

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
                    m57 m57Var32 = this.b;
                    switch (b52) {
                        case 0:
                            m57Var32.d0.d.d = null;
                            m57Var32.e.e(false);
                            m57Var32.g(false, false);
                            m57Var32.s.getSwipeBack().b(true);
                            break;
                        case 1:
                            g57 g57Var2 = m57Var32.e;
                            s57 s57Var2 = m57Var32.d0;
                            if (m57Var32.a(null) != null) {
                                if (g57Var2.v - g57Var2.u <= uc7.s1(s57Var2.x).l4.V1.f()) {
                                    hmb hmbVar = g57Var2.W;
                                    r47 a = m57Var32.a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                                    v47 v47Var4 = s57Var2.d;
                                    int i62 = g57Var2.u;
                                    v47Var4.e = i62;
                                    int i72 = g57Var2.v;
                                    v47Var4.f = i72;
                                    v47Var4.d = ou1.b(i62, i72, a);
                                    s57Var2.b();
                                    s57Var2.a(true);
                                    break;
                                } else {
                                    m57Var32.f();
                                    break;
                                }
                            }
                            break;
                        case 2:
                            g57 g57Var3 = m57Var32.e;
                            s57 s57Var3 = m57Var32.d0;
                            v47 v47Var5 = s57Var3.d;
                            int i82 = s57Var3.x;
                            boolean z72 = s57Var3.b;
                            if (v47Var5.d != null && !z72) {
                                v47Var5.d = null;
                                g57Var3.e(false);
                                m57Var32.g(false, true);
                                m57Var32.l(true);
                                break;
                            } else if (g57Var3.v - g57Var3.u <= uc7.s1(i82).l4.V1.f()) {
                                r47 a2 = m57Var32.a(null);
                                if (a2 != null) {
                                    if (!g57Var3.w()) {
                                        v47Var5.e = 0;
                                        int min = Math.min(uc7.s1(i82).l4.V1.f(), ou1.d(a2));
                                        v47Var5.f = min;
                                        v47Var5.d = ou1.b(v47Var5.e, min, a2);
                                        View b62 = m57Var32.b();
                                        if (b62 instanceof wb2) {
                                            g57Var3.Z((wb2) b62, v47Var5.e, v47Var5.f);
                                        }
                                        if (!z72) {
                                            m57Var32.s.getSwipeBack().e(m57Var32.J);
                                        }
                                        m57Var32.g(true, true);
                                        break;
                                    } else {
                                        v47Var5.e = g57Var3.u;
                                        v47Var5.f = g57Var3.v;
                                        hmb hmbVar2 = g57Var3.W;
                                        v47Var5.d = ou1.b(v47Var5.e, v47Var5.f, m57Var32.a(hmbVar2 != null ? ((wb2) hmbVar2).getMessageObject() : null));
                                        s57Var3.b();
                                        s57Var3.a(true);
                                        break;
                                    }
                                }
                            } else {
                                m57Var32.f();
                                break;
                            }
                            break;
                        case 3:
                            m57Var32.d0.c(false);
                            break;
                        case 4:
                            m57Var32.d0.c(false);
                            break;
                        case 5:
                            m57Var32.d0.a(true);
                            break;
                        case 6:
                            s57 s57Var4 = m57Var32.d0;
                            if (!s57Var4.b) {
                                ks1 ks1Var = (ks1) s57Var4;
                                ks1Var.a(true);
                                zu1 zu1Var = ks1Var.I;
                                zu1Var.F5 = null;
                                zu1Var.D5 = null;
                                zu1Var.x5.f(null, null, zu1Var.l6, null);
                                zu1Var.D6();
                                break;
                            } else {
                                ks1 ks1Var2 = (ks1) s57Var4;
                                ks1Var2.a(true);
                                zu1 zu1Var2 = ks1Var2.I;
                                zu1Var2.D5 = null;
                                zu1Var2.dc(zu1Var2.F5);
                                break;
                            }
                        case 7:
                            m57Var32.d0.c(true);
                            break;
                        case 8:
                            m57Var32.d0.a(true);
                            break;
                        case 9:
                            ks1 ks1Var3 = (ks1) m57Var32.d0;
                            ks1Var3.a(true);
                            zu1 zu1Var3 = ks1Var3.I;
                            zu1Var3.x5.d(null, zu1Var3.l6);
                            zu1Var3.D6();
                            break;
                        case 10:
                            m57Var32.d0.a(true);
                            break;
                        case 11:
                            ks1 ks1Var4 = (ks1) m57Var32.d0;
                            ks1Var4.a(true);
                            zu1 zu1Var4 = ks1Var4.I;
                            zu1Var4.Y5 = null;
                            nr1 nr1Var = zu1Var4.a0;
                            if (nr1Var != null) {
                                nr1Var.M3 = null;
                                nr1Var.N3 = false;
                            }
                            v47 v47Var6 = zu1Var4.x5;
                            if (v47Var6 != null) {
                                i52 = ((e) zu1Var4).currentAccount;
                                r47 r47Var = zu1Var4.F5;
                                v47Var6.e(i52, null, null, r47Var == zu1Var4.m4 ? null : r47Var, zu1Var4.D5, zu1Var4.H5);
                            }
                            zu1Var4.D6();
                            break;
                        case 12:
                            v47 v47Var7 = m57Var32.d0.d;
                            if (v47Var7.o) {
                                boolean z8 = !v47Var7.q;
                                v47Var7.q = z8;
                                m57Var32.H.a(z8, true);
                                m57Var32.I.a(v47Var7.q, true);
                                if (m57Var32.r.e.size() > 0 && (message2 = ((r47) m57Var32.r.e.get(0)).k) != null && (messageMedia2 = message2.media) != null) {
                                    boolean z9 = v47Var7.q;
                                    messageMedia2.force_small_media = z9;
                                    messageMedia2.force_large_media = !z9;
                                }
                                if (m57Var32.r.f.size() > 0 && (message = ((r47) m57Var32.r.f.get(0)).k) != null && (messageMedia = message.media) != null) {
                                    boolean z10 = v47Var7.q;
                                    messageMedia.force_small_media = z10;
                                    messageMedia.force_large_media = !z10;
                                }
                                m57Var32.i();
                                m57Var32.V = true;
                                break;
                            }
                            break;
                        default:
                            v47 v47Var8 = m57Var32.d0.d;
                            boolean z11 = v47Var8.r;
                            v47Var8.r = !z11;
                            m57Var32.F.a(z11, true);
                            if (m57Var32.r.e.size() > 0 && (message4 = ((r47) m57Var32.r.e.get(0)).k) != null) {
                                message4.invert_media = v47Var8.r;
                            }
                            if (m57Var32.r.f.size() > 0 && (message3 = ((r47) m57Var32.r.f.get(0)).k) != null) {
                                message3.invert_media = v47Var8.r;
                            }
                            m57Var32.i();
                            m57Var32.V = true;
                            break;
                    }
                }
            });
            b8Var11.h(0.12f, i14);
            this.s.a(b8Var11, tre.o(-1, 48));
            r57 r57Var8 = r57Var;
            r57Var8.a(v47Var.k, false);
            r57 r57Var9 = r57Var2;
            m57 m57Var4 = this;
            r57Var8.setOnClickListener(new e57(this, z, context, r57Var9, r57Var8, (byte) 0));
            m57Var = m57Var4;
            if (r57Var9 != null) {
                r57Var9.setOnClickListener(new lw4(m57Var4, r57Var9, r57Var8, (byte) 8));
                m57Var = m57Var4;
            }
        }
        context2 = context;
        m57Var2 = m57Var;
        i2 = m57Var2.a;
        if (i2 == 1) {
        }
        m = m57Var2.e.m(context2);
        m57Var2.d = m;
        m.setElevation(hl.L(8.0f));
        m.setOutlineProvider(viewOutlineProvider);
        if (m.getParent() instanceof ViewGroup) {
        }
        m57Var2.addView(m, tre.d(-1, -1.0f, 51, 0.0f, a.getCurrentActionBarHeight() / hl.p, 0.0f, 0.0f));
        m57Var2.e.Q(m57Var2.f);
    }

    public final r47 a(r47 r47Var) {
        m47 m47Var;
        v47 v47Var = this.d0.d;
        t47 t47Var = v47Var.a;
        if (t47Var == null) {
            return null;
        }
        LongSparseArray longSparseArray = t47Var.d;
        if (longSparseArray == null || longSparseArray.size() <= 0 || (m47Var = (m47) v47Var.a.d.valueAt(0)) == null) {
            return (r47) v47Var.a.e.get(0);
        }
        if (m47Var.i) {
            if (r47Var != null) {
                return r47Var;
            }
            ou1 ou1Var = v47Var.d;
            if (ou1Var != null) {
                return ou1Var.a;
            }
        }
        return m47Var.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View b() {
        int i;
        View childAt;
        r47 a = a(null);
        if (a != null) {
            while (true) {
                gu guVar = this.f;
                if (i >= guVar.getChildCount()) {
                    break;
                }
                childAt = guVar.getChildAt(i);
                pk5 pk5Var = (pk5) childAt;
                i = (pk5Var.getMessageObject() == null || !(pk5Var.getMessageObject() == a || pk5Var.getMessageObject().e1() == a.e1())) ? i + 1 : 0;
            }
            return childAt;
        }
        return null;
    }

    public final m47 c(r47 r47Var) {
        if (r47Var.c1() == 0) {
            return null;
        }
        m47 m47Var = (m47) this.r.d.get(r47Var.c1());
        if (m47Var == null || (m47Var.d.size() > 1 && m47Var.d(r47Var) != null)) {
            return m47Var;
        }
        return null;
    }

    public final boolean d(wb2 wb2Var) {
        r47 a;
        if (wb2Var == null || wb2Var.getMessageObject() == null || (a = a(null)) == null) {
            return false;
        }
        return wb2Var.getMessageObject() == a || wb2Var.getMessageObject().e1() == a.e1();
    }

    public final void e(float f, int i) {
        boolean z = this.d0.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        w81 w81Var = this.b;
        z47 z47Var = this.c;
        if (z) {
            z47Var.setTranslationY(0.0f);
            w81Var.invalidateOutline();
            w81Var.setTranslationY(0.0f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY(0.0f);
        } else {
            z47Var.setTranslationY(i);
            w81Var.invalidateOutline();
            w81Var.setTranslationY(f);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationY((f + w81Var.getMeasuredHeight()) - hl.L(2.0f));
        }
        float x = w81Var.getX();
        lmb lmbVar = this.d;
        lmbVar.setTranslationX(x);
        lmbVar.setTranslationY(w81Var.getY());
    }

    public final void f() {
        s57 s57Var = this.d0;
        new d31(s57Var, s57Var.G).I(R.raw.error, ob6.M0(2131746164, null), ob6.M0(2131746163, null)).j();
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
        b8 b8Var = this.E;
        b8 b8Var2 = this.y;
        f57 f57Var = this.x;
        f57 f57Var2 = this.w;
        if (!z2) {
            if (f57Var2 != null) {
                f57Var2.setAlpha(!z ? 1.0f : 0.0f);
                f57Var2.setVisibility(!z ? 0 : 4);
            }
            if (f57Var != null) {
                f57Var.setAlpha(z ? 1.0f : 0.0f);
                f57Var.setVisibility(z ? 0 : 4);
            }
            if (b8Var2 != null) {
                b8Var2.setAlpha(!z ? 1.0f : 0.0f);
                b8Var2.setVisibility(!z ? 0 : 4);
            }
            if (b8Var != null) {
                b8Var.setAlpha(z ? 1.0f : 0.0f);
                b8Var.setVisibility(z ? 0 : 4);
                return;
            }
            return;
        }
        this.Q = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        if (f57Var2 != null) {
            f57Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(f57Var2, (Property<f57, Float>) property, !z ? 1.0f : 0.0f));
        }
        if (f57Var != null) {
            f57Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(f57Var, (Property<f57, Float>) property, z ? 1.0f : 0.0f));
        }
        if (b8Var2 != null) {
            b8Var2.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(b8Var2, (Property<b8, Float>) property, !z ? 1.0f : 0.0f));
        }
        if (b8Var != null) {
            b8Var.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(b8Var, (Property<b8, Float>) property, z ? 1.0f : 0.0f));
        }
        this.Q.playTogether(arrayList);
        this.Q.setDuration(360L);
        this.Q.setInterpolator(k43.h);
        this.Q.addListener(new gf4((byte) 14, this, z));
        this.Q.start();
    }

    public final void h(wb2 wb2Var) {
        URLSpan uRLSpan;
        TLRPC.WebPage webPage;
        if (this.a == 2) {
            v47 v47Var = this.d0.d;
            if (!v47Var.n && (uRLSpan = v47Var.w) != null && (webPage = v47Var.v) != null && !(webPage instanceof TLRPC.TL_webPagePending)) {
                wb2Var.t3(uRLSpan);
                return;
            }
        }
        wb2Var.t3(null);
    }

    public final void i() {
        int i;
        s57 s57Var = this.d0;
        v47 v47Var = s57Var.d;
        i57 i57Var = this.h;
        if (i57Var.k()) {
            this.W = true;
            return;
        }
        for (int i2 = 0; i2 < this.r.f.size(); i2++) {
            r47 r47Var = (r47) this.r.f.get(i2);
            r47Var.M1 = true;
            r47Var.h2 = s57Var.a;
            boolean z = v47Var.k;
            TLRPC.Message message = r47Var.k;
            if (z) {
                i = message.flags & (-5);
                message.flags = i;
                r47Var.g2 = true;
            } else {
                i = message.flags | 4;
                message.flags = i;
                r47Var.g2 = false;
            }
            if (this.a == 2) {
                TLRPC.WebPage webPage = v47Var.v;
                if (webPage != null) {
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (messageMedia == null || messageMedia.webpage != webPage) {
                        message.flags = i | 512;
                        message.media = new TLRPC.TL_messageMediaWebPage();
                        TLRPC.MessageMedia messageMedia2 = r47Var.k.media;
                        messageMedia2.webpage = v47Var.v;
                        boolean z2 = v47Var.q;
                        messageMedia2.force_large_media = !z2;
                        messageMedia2.force_small_media = z2;
                        messageMedia2.manual = true;
                        r47Var.y = null;
                        r47Var.o0();
                        r47Var.p0 = null;
                        r47Var.q0 = null;
                        r47Var.n0 = null;
                        r47Var.o0 = null;
                        r47Var.r0(true);
                        r47Var.K(true);
                    }
                } else {
                    message.flags = i & (-513);
                    message.media = null;
                }
            }
            if (v47Var.l) {
                r47Var.z = null;
            } else {
                r47Var.k0();
            }
            if (r47Var.S3()) {
                u47 u47Var = (u47) r47Var.k.media;
                u47Var.results.total_voters = v47Var.l ? 0 : u47Var.a;
            }
        }
        for (int i3 = 0; i3 < this.r.h.size(); i3++) {
            ((TLRPC.PollAnswerVoters) this.r.h.get(i3)).chosen = !v47Var.k;
        }
        for (int i4 = 0; i4 < this.r.d.size(); i4++) {
            i57Var.U((m47) this.r.d.valueAt(i4));
        }
        this.n.l(0, this.r.f.size());
    }

    public final void j() {
        final int i = this.S;
        final float f = this.T;
        s57 s57Var = this.d0;
        boolean z = s57Var.w;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        gu guVar = this.f;
        if (z) {
            this.T = 0.0f;
            this.S = 0;
            actionBarPopupWindow$ActionBarPopupWindowLayout.setTranslationX(hl.L(8.0f) + guVar.getMeasuredWidth());
        } else {
            int measuredHeight = guVar.getMeasuredHeight();
            int i2 = 0;
            for (int i3 = 0; i3 < guVar.getChildCount(); i3++) {
                View childAt = guVar.getChildAt(i3);
                if (RecyclerView.S(childAt) != -1) {
                    measuredHeight = Math.min(measuredHeight, childAt.getTop());
                    i2++;
                }
            }
            t47 t47Var = this.r;
            if (t47Var == null || i2 == 0 || i2 > t47Var.f.size()) {
                this.S = 0;
            } else {
                int d = c00.d(4.0f, measuredHeight, 0);
                this.S = d;
                this.S = Math.min(((guVar.getMeasuredHeight() - this.S) + d) - ((int) ((((hl.q.y - (Build.VERSION.SDK_INT >= 35 ? hl.n : 0)) * 0.8f) - this.a0) - hl.L(8.0f))), this.S);
            }
            float z2 = bp1.z(getMeasuredHeight() - hl.L(16.0f), (this.b.getMeasuredHeight() - this.S) + (this.a0 - hl.L(8.0f)), 2.0f, hl.L(8.0f)) - this.S;
            this.T = z2;
            if (z2 > hl.L(8.0f)) {
                this.T = hl.L(8.0f);
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
        ValueAnimator valueAnimator = s57Var.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        s57Var.h = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: b57
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                float f3 = 1.0f - floatValue;
                m57 m57Var = m57.this;
                int i5 = (int) ((m57Var.S * floatValue) + (i * f3));
                m57Var.U = i5;
                m57Var.e((m57Var.T * floatValue) + (f * f3), i5);
            }
        });
        s57Var.h.setDuration(250L);
        s57Var.h.setInterpolator(bb2.V);
        s57Var.h.addListener(new ad5(this, (byte) 16));
        hl.d3(s57Var.E, 50L);
        this.U = i;
        e(f, i);
    }

    public final void k() {
        r47 r47Var;
        s57 s57Var = this.d0;
        v47 v47Var = s57Var.d;
        if (this.a == 0) {
            g57 g57Var = this.e;
            if (g57Var.v - g57Var.u <= uc7.s1(s57Var.x).l4.V1.f()) {
                hmb hmbVar = g57Var.W;
                r47 a = a(hmbVar != null ? ((wb2) hmbVar).getMessageObject() : null);
                if (v47Var.d != null && g57Var.w()) {
                    v47Var.e = g57Var.u;
                    v47Var.f = g57Var.v;
                    if (a != null) {
                        ou1 ou1Var = v47Var.d;
                        if (ou1Var.m || (r47Var = ou1Var.a) == null || r47Var.e1() != a.e1()) {
                            v47Var.d = ou1.b(v47Var.e, v47Var.f, a);
                            s57Var.b();
                        }
                    }
                }
                g57Var.e(false);
            }
        }
    }

    public final void l(boolean z) {
        s57 s57Var = this.d0;
        TLRPC.User user = s57Var.n;
        v47 v47Var = s57Var.d;
        TLRPC.Chat chat = s57Var.r;
        z47 z47Var = this.c;
        int i = this.a;
        if (i == 1) {
            t47 t47Var = v47Var.b;
            z47Var.b(ob6.G(t47Var == null ? 0 : t47Var.g.size(), "PreviewForwardMessagesCount", new Object[0]), z);
            z47Var.a(!v47Var.h ? v47Var.m ? user != null ? ob6.a0("ForwardPreviewSendersNameVisible", null, 2131750539, lv2.m(0, user.first_name, user.last_name)) : (!xc2.T(chat) || chat.megagroup) ? ob6.M0(2131750537, null) : ob6.M0(2131750538, null) : user != null ? ob6.a0("ForwardPreviewSendersNameVisible", null, 2131750539, lv2.m(0, user.first_name, user.last_name)) : (!xc2.T(chat) || chat.megagroup) ? ob6.M0(2131750540, null) : ob6.M0(2131750541, null) : !v47Var.k ? user != null ? ob6.a0("ForwardPreviewSendersNameVisible", null, 2131750539, lv2.m(0, user.first_name, user.last_name)) : (!xc2.T(chat) || chat.megagroup) ? ob6.M0(2131750537, null) : ob6.M0(2131750538, null) : user != null ? ob6.a0("ForwardPreviewSendersNameHidden", null, 2131750542, lv2.m(0, user.first_name, user.last_name)) : (!xc2.T(chat) || chat.megagroup) ? ob6.M0(2131750540, null) : ob6.M0(2131750541, null), z);
        } else {
            if (i != 0) {
                if (i == 2) {
                    z47Var.b(ob6.M0(2131748302, null), z);
                    z47Var.a(ob6.M0(2131748303, null), z);
                    return;
                }
                return;
            }
            if (v47Var.d == null || !v47Var.a.j) {
                z47Var.b(ob6.M0(2131748299, null), z);
                z47Var.a(v47Var.a.j ? ob6.M0(2131748300, null) : "", z);
            } else {
                z47Var.b(ob6.M0(2131746609, null), z);
                z47Var.a(ob6.M0(2131746608, null), z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a == 0) {
            hl.d0(this.f, new zj3(this, (byte) 28));
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
        s57 s57Var = this.d0;
        s57Var.w = z;
        this.a0 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.s;
        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(i, makeMeasureSpec);
        int i3 = this.a0;
        int measuredHeight = actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
        Rect rect = this.R;
        this.a0 = Math.max(i3, measuredHeight + rect.top + rect.bottom);
        ((ViewGroup.MarginLayoutParams) this.f.getLayoutParams()).topMargin = a.getCurrentActionBarHeight();
        boolean z2 = s57Var.w;
        w81 w81Var = this.b;
        if (z2) {
            w81Var.getLayoutParams().height = -1;
            ((ViewGroup.MarginLayoutParams) w81Var.getLayoutParams()).topMargin = hl.L(8.0f);
            ((ViewGroup.MarginLayoutParams) w81Var.getLayoutParams()).bottomMargin = hl.L(8.0f);
            w81Var.getLayoutParams().width = (int) Math.min(View.MeasureSpec.getSize(i), Math.max(hl.L(340.0f), View.MeasureSpec.getSize(i) * 0.6f));
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = -1;
        } else {
            ((ViewGroup.MarginLayoutParams) w81Var.getLayoutParams()).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) w81Var.getLayoutParams()).bottomMargin = 0;
            w81Var.getLayoutParams().height = (View.MeasureSpec.getSize(i2) - hl.L(6.0f)) - this.a0;
            if (w81Var.getLayoutParams().height < View.MeasureSpec.getSize(i2) * 0.5f) {
                w81Var.getLayoutParams().height = (int) (View.MeasureSpec.getSize(i2) * 0.5f);
            }
            w81Var.getLayoutParams().width = -1;
            actionBarPopupWindow$ActionBarPopupWindowLayout.getLayoutParams().height = View.MeasureSpec.getSize(i2) - w81Var.getLayoutParams().height;
        }
        int size = (View.MeasureSpec.getSize(i2) + View.MeasureSpec.getSize(i)) << 16;
        if (this.b0 != size) {
            for (int i4 = 0; i4 < this.r.f.size(); i4++) {
                r47 r47Var = (r47) this.r.f.get(i4);
                r47Var.d2 = s57Var.w ? w81Var.getLayoutParams().width : View.MeasureSpec.getSize(i) - hl.L(16.0f);
                r47Var.S1 = false;
                r47Var.M1 = true;
                kr krVar = this.n;
                if (krVar != null) {
                    krVar.f();
                }
            }
            this.L = true;
        }
        this.b0 = size;
        super.onMeasure(i, i2);
    }
}
