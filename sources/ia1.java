// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ia1 extends d implements jm7, aj6 {
    public boolean E;
    public boolean F;
    public ArrayList G;
    public final ArrayList H;
    public qk3 I;
    public FrameLayout J;
    public y91 K;
    public TLRPC.User L;
    public TLRPC.Chat M;
    public Long N;
    public e7a O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public jp0 a;
    public u46 b;
    public q7c c;
    public View d;
    public cw6 e;
    public wp4 f;
    public tk4 h;
    public w91 n;
    public boolean r;
    public boolean s;
    public zja w;
    public final ArrayList x;
    public boolean y;

    public ia1(Bundle bundle) {
        super(bundle);
        this.r = true;
        this.x = new ArrayList();
        this.H = new ArrayList();
    }

    public static void l0(final Context context, int i, TLRPC.InputGroupCall inputGroupCall, String str, final ylb ylbVar, boolean z, final boolean z2) {
        int i2;
        final byte b;
        int i3 = cmb.g5;
        int v0 = cmb.v0(i3, ylbVar);
        final my0 my0Var = new my0(1, ylbVar, context, false);
        my0Var.s0(v0);
        my0Var.K(v0);
        my0Var.t0(i3);
        my0Var.L(i3);
        final String[] strArr = {str};
        LinearLayout i4 = hg9.i(context, 1);
        i4.setPadding(0, 0, 0, gm.L(8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        i4.addView(frameLayout, qoe.t(-1, 92, 17, 0, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.story_link);
        imageView.setScaleX(2.0f);
        imageView.setScaleY(2.0f);
        frameLayout2.addView(imageView, qoe.e(-1, -1, 17));
        int L = gm.L(80.0f);
        int i5 = cmb.Ei;
        ShapeDrawable K = cmb.K(L, cmb.v0(i5, ylbVar));
        wmb M = anb.M(i5);
        frameLayout2.setBackground(K);
        anb.j(frameLayout2, K, M, null, ylbVar);
        frameLayout.addView(frameLayout2, qoe.d(80, 80.0f, 1, 0.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        int i6 = cmb.x6;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        anb.s(imageView2, i6, ylbVar, mode);
        int i7 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i7, ylbVar), 1, -1);
        wmb M2 = anb.M(i7);
        imageView2.setBackground(f0);
        anb.j(imageView2, f0, null, M2, ylbVar);
        if (z2) {
            frameLayout.addView(imageView2, qoe.d(56, 56.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        int i8 = cmb.F6;
        l66 a = jxe.a(context, 20.0f, i8, true, ylbVar);
        a.setText(jb6.M0(2131749229, null));
        a.setGravity(17);
        i4.addView(a, qoe.t(-1, -2, 17, 32, 16, 32, 8));
        l66 a2 = jxe.a(context, 14.0f, i8, false, ylbVar);
        a2.setText(jb6.M0(2131749230, null));
        a2.setGravity(17);
        a2.setMaxWidth(hg5.a(a2.getText(), a2.getPaint()));
        i4.addView(a2, qoe.t(-1, -2, 17, 32, 0, 32, 18));
        String substring = str.startsWith("https://") ? str.substring(8) : str;
        final FrameLayout frameLayout3 = new FrameLayout(context);
        rve.b(frameLayout3, 0.01f, 1.2f);
        int i9 = cmb.Z6;
        fg0 Z = cmb.Z(cmb.v0(i9, ylbVar), cmb.v(cmb.v0(i9, ylbVar), cmb.v0(i7, ylbVar)), 12, 12);
        wmb M3 = anb.M(i9);
        wmb p = anb.p(i9, i7);
        frameLayout3.setBackground(Z);
        anb.j(frameLayout3, Z, M3, p, ylbVar);
        i4.addView(frameLayout3, qoe.t(-1, -2, 7, 16, 0, 16, 0));
        l66 a3 = jxe.a(context, 13.0f, i8, false, ylbVar);
        a3.setPadding(gm.L(16.0f), gm.L(14.0f), 0, gm.L(14.0f));
        a3.setText(substring);
        frameLayout3.addView(a3, qoe.d(-1, -1.0f, nm7.D1, 0.0f, 0.0f, 30.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView3.setContentDescription(jb6.M0(2131754838, null));
        imageView3.setScaleType(scaleType);
        anb.s(imageView3, cmb.q5, ylbVar, mode);
        frameLayout3.addView(imageView3, qoe.e(40, 48, 21));
        LinearLayout i10 = hg9.i(context, 0);
        i4.addView(i10, qoe.k(16.0f, 12.0f, 16.0f, 0.0f, -1, -2));
        b61 b61Var = new b61(ylbVar, context, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c ");
        spannableStringBuilder.append((CharSequence) jb6.M0(2131749237, null));
        spannableStringBuilder.setSpan(new pn2(R.drawable.msg_copy_filled, 0), 0, 1, 33);
        b61Var.i(spannableStringBuilder, false, true);
        i10.addView(b61Var, qoe.q(-1, 48, 1.0f, 51, 0, 0, 6, 0));
        b61 b61Var2 = new b61(ylbVar, context, true);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c ");
        spannableStringBuilder2.append((CharSequence) jb6.M0(2131749231, null));
        spannableStringBuilder2.setSpan(new pn2(R.drawable.msg_share_filled, 0), 0, 1, 33);
        b61Var2.i(spannableStringBuilder2, false, true);
        i10.addView(b61Var2, qoe.q(-1, 48, 1.0f, 51, 6, 0, 0, 0));
        my0[] my0VarArr = new my0[1];
        if (z) {
            z91 z91Var = new z91(context, ylbVar);
            z91Var.setGravity(17);
            anb.X(z91Var, cmb.y6, ylbVar);
            z91Var.setText(" " + jb6.M0(2131749236, null) + " ");
            z91Var.setTextSize(14.0f);
            i4.addView(z91Var, qoe.t(nm7.T2, -2, 1, 28, 12, 28, 8));
            i2 = i;
            wc7 wc7Var = new wc7((Object) str, i2, (Object) my0VarArr, (byte) 9);
            l66 a4 = jxe.a(context, 14.0f, i8, false, ylbVar);
            a4.setText(gm.D2(gm.N2(jb6.M0(2131749235, null), -1, 0, wc7Var, null), true));
            a4.setGravity(17);
            a4.setMaxWidth(hg5.a(a4.getText(), a4.getPaint()));
            i4.addView(a4, qoe.t(-1, -2, 17, 32, 8, 32, 12));
            rve.b(a4, 0.05f, 1.2f);
            b = 1;
            a4.setOnClickListener(new k81(wc7Var, b));
        } else {
            i2 = i;
            b = 1;
        }
        my0Var.O = i4;
        my0Var.show();
        final byte b2 = 0;
        my0VarArr[0] = my0Var;
        frameLayout3.setOnClickListener(new View.OnClickListener() { // from class: s91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                ylb ylbVar2 = ylbVar;
                my0 my0Var2 = my0Var;
                String[] strArr2 = strArr;
                switch (b3) {
                    case 0:
                        gm.g(strArr2[0]);
                        new c41(my0Var2.F, ylbVar2).i(jb6.M0(2131748678, null)).j();
                        break;
                    default:
                        gm.g(strArr2[0]);
                        new c41(my0Var2.F, ylbVar2).i(jb6.M0(2131748678, null)).j();
                        break;
                }
            }
        });
        b61Var.setOnClickListener(new View.OnClickListener() { // from class: s91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                ylb ylbVar2 = ylbVar;
                my0 my0Var2 = my0Var;
                String[] strArr2 = strArr;
                switch (b3) {
                    case 0:
                        gm.g(strArr2[0]);
                        new c41(my0Var2.F, ylbVar2).i(jb6.M0(2131748678, null)).j();
                        break;
                    default:
                        gm.g(strArr2[0]);
                        new c41(my0Var2.F, ylbVar2).i(jb6.M0(2131748678, null)).j();
                        break;
                }
            }
        });
        final qu quVar = new qu((Object) inputGroupCall, i2, (Object) strArr, (Object) frameLayout3, (Object) a3, (Object) my0Var, (Object) ylbVar, (byte) 2);
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: t91
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                my0 my0Var2 = my0.this;
                dy0 dy0Var = my0Var2.c;
                ylb ylbVar2 = ylbVar;
                bu5 G = bu5.G(dy0Var, ylbVar2, frameLayout3);
                String M0 = jb6.M0(2131751704, null);
                String[] strArr2 = strArr;
                G.b(R.drawable.msg_copy, M0, new tv0(strArr2, my0Var2, ylbVar2, (byte) 14), false);
                G.b(R.drawable.msg_qrcode, jb6.M0(2131750405, null), new y31(context, strArr2, (byte) 6), false);
                G.l(R.drawable.msg_delete, quVar, jb6.M0(2131745756, null), z2, true);
                G.a0();
            }
        });
        b61Var2.setOnClickListener(new oh(context, str, strArr, ylbVar, my0Var, (byte) 3));
        if (z2) {
            imageView2.setOnClickListener(new ef((Object) my0Var, (Object) ylbVar, (Object) imageView2, (Object) quVar, (byte) 7));
        }
    }

    @Override // org.telegram.ui.ActionBar.d, aj6
    public final boolean X(MotionEvent motionEvent, boolean z) {
        return true;
    }

    public final void a0(ArrayList arrayList, ea1 ea1Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        boolean f0 = f0(arrayList);
        ArrayList arrayList2 = this.H;
        if (f0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.remove(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id));
            }
            jh2 jh2Var = ea1Var.e;
            if (jh2Var != null) {
                jh2Var.a(false, true);
            }
            n0();
            return;
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Integer valueOf = Integer.valueOf(((TLRPC.Message) arrayList.get(i2)).id);
            if (!arrayList2.contains(valueOf)) {
                arrayList2.add(valueOf);
            }
        }
        jh2 jh2Var2 = ea1Var.e;
        if (jh2Var2 != null) {
            jh2Var2.a(true, true);
        }
        n0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.a7));
        hashSet.add(Integer.valueOf(cmb.q7));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.o6));
        hashSet.add(Integer.valueOf(cmb.y9));
        hashSet.add(Integer.valueOf(cmb.z9));
        hashSet.add(Integer.valueOf(cmb.Yl));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.b7));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final void b0() {
        this.f.setTranslationY(((-this.S) - this.Q) - this.R);
    }

    public final void c0() {
        q7c q7cVar = this.c;
        iq5 iq5Var = this.mSystemInsets;
        eh0.e(q7cVar, iq5Var.b, iq5Var.d, a.getCurrentActionBarHeight() + ((int) this.I.c(gm.L(7.0f))), this.P);
        this.d.getLayoutParams().height = this.simpleActionBar.getExtraHeight() + a.getCurrentActionBarHeight() + this.mSystemInsets.b + ((int) this.I.c(gm.L(7.0f)));
        ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).topMargin = (eh0.d(this.mSystemInsets.b) - gm.L(14.0f)) - gm.L(7.0f);
        ((ViewGroup.MarginLayoutParams) this.a.getLayoutParams()).topMargin = a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.setPadding(0, 0, 0, this.S + this.P);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        byte b2 = 0;
        if (!this.s) {
            this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        }
        this.simpleActionBar.setTitle(jb6.M0(2131752549, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 16));
        zja a = this.simpleActionBar.t().a(10, R.drawable.ic_ab_other);
        this.w = a;
        a.setContentDescription(jb6.M0(2131754838, null));
        byte b3 = 3;
        a8 e = this.w.e(3, R.drawable.msg_delete, jb6.M0(2131751526, null));
        int i = cmb.o7;
        e.d(getThemedColor(i), getThemedColor(i));
        q7c q7cVar = new q7c(this, new f(this, (byte) 21), new v91(this), new v91(this));
        this.c = q7cVar;
        q7cVar.setCaptureSectionsDecoratorAllowed(true);
        this.c.r1();
        this.c.setSectionsDrawBackground(true);
        this.c.g3.r = false;
        w91 w91Var = new w91(b2, context, this);
        this.n = w91Var;
        this.fragmentView = w91Var;
        tk4 tk4Var = new tk4(context, null);
        this.h = tk4Var;
        tk4Var.setViewType(8);
        anb.h(cmb.Z6, null, this.h);
        this.h.x = false;
        this.a = new jp0(this, context, this.h);
        this.c.setClipToPadding(false);
        this.c.setEmptyView(this.a);
        q7c q7cVar2 = this.c;
        u46 u46Var = new u46(1, false);
        this.b = u46Var;
        q7cVar2.setLayoutManager(u46Var);
        this.c.setVerticalScrollbarPosition(jb6.a0 ? 1 : 2);
        cw6 cw6Var = new cw6(this.c, this.b);
        this.e = cw6Var;
        sy4 sy4Var = this.glassEngine;
        Objects.requireNonNull(sy4Var);
        cw6Var.n = new xg0(sy4Var, (byte) 27);
        this.n.addView(this.c, qoe.e(-1, -1, 3));
        this.n.addView(this.a, qoe.c(-1.0f, -1));
        View view = new View(context);
        this.d = view;
        view.setBackground(getBaseSimpleGlass().a(this.d));
        this.n.addView(this.d, qoe.e(-1, 0, 48));
        this.c.setOnScrollListener(new x91(this));
        boolean z = this.y;
        jp0 jp0Var = this.a;
        if (z) {
            jp0Var.d();
        } else {
            jp0Var.e();
        }
        wp4 wp4Var = new wp4(this.resourceProvider, context, false);
        this.f = wp4Var;
        wp4Var.c.setImageResource(R.drawable.filled_calls_plus);
        this.f.setContentDescription(jb6.M0(2131752587, null));
        this.f.setOnClickListener(new m91(this, b));
        this.n.addView(this.f, wp4.b());
        qk3 qk3Var = new qk3(context);
        this.I = qk3Var;
        qk3Var.setPadding(gm.L(11.0f), gm.L(7.0f) + gm.L(14.0f), gm.L(11.0f), gm.L(7.0f) + gm.L(14.0f));
        this.I.setOnAnimatedHeightChangedListener(new n91(this, (byte) 1));
        qk3 qk3Var2 = this.I;
        im0 c = getBaseSimpleGlass().c.c(this.I, null, false);
        c.p(qqd.n(this.resourceProvider));
        c.r(gm.L(24.0f));
        c.q(gm.L(7.0f));
        qk3Var2.setBlurredBackground(c);
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        this.I.addView(frameLayout);
        this.I.j(this.J, true, false);
        y91 y91Var = new y91(this, context, this, this.n, this.resourceProvider);
        this.K = y91Var;
        this.J.addView(y91Var);
        this.I.setCallFragmentContextView(this.K);
        this.n.addView(this.I, qoe.d(-1, -2.0f, 48, -5.0f, -14.0f, -5.0f, 0.0f));
        this.n.addView(this.simpleActionBar);
        setBulletinDelegate(new s20(this, b3));
        if (this.s) {
            View view2 = this.fragmentView;
            v91 v91Var = new v91(this);
            WeakHashMap weakHashMap = kfc.a;
            cfc.i(view2, v91Var);
        }
        return this.fragmentView;
    }

    public final void d0(int i, int i2) {
        if (this.y) {
            return;
        }
        this.y = true;
        jp0 jp0Var = this.a;
        if (jp0Var != null && !this.E) {
            jp0Var.d();
        }
        q7c q7cVar = this.c;
        if (q7cVar != null) {
            q7cVar.g3.O(true);
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = i2;
        tL_messages_search.peer = new TLRPC.TL_inputPeerEmpty();
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterPhoneCalls();
        tL_messages_search.q = "";
        tL_messages_search.offset_id = i;
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_search, new tg(this, (byte) 10), 2), this.classGuid);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x00cd  */
    @Override // jm7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Long l;
        q7c q7cVar;
        int i3;
        TLRPC.User W1;
        byte b;
        ArrayList arrayList;
        fa1 fa1Var;
        byte b2 = 2;
        ArrayList arrayList2 = this.x;
        byte b3 = 1;
        if (i != 1) {
            if (i == nm7.v) {
                if (!this.E || ((Boolean) objArr[2]).booleanValue()) {
                    return;
                }
                ArrayList arrayList3 = (ArrayList) objArr[0];
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    fa1 fa1Var2 = (fa1) it.next();
                    Iterator it2 = fa1Var2.c.iterator();
                    while (it2.hasNext()) {
                        if (arrayList3.contains(Integer.valueOf(((TLRPC.Message) it2.next()).id))) {
                            it2.remove();
                            r3 = 1;
                        }
                    }
                    if (fa1Var2.c.isEmpty()) {
                        it.remove();
                    }
                }
                if (r3 == 0 || (q7cVar = this.c) == null) {
                    return;
                }
                q7cVar.g3.O(true);
                return;
            }
            if (i == nm7.A2) {
                oc7 messagesController = getMessagesController();
                messagesController.getClass();
                this.G = new ArrayList(messagesController.h.keySet());
                q7c q7cVar2 = this.c;
                if (q7cVar2 != null) {
                    q7cVar2.g3.O(true);
                    return;
                }
                return;
            }
            if (i != nm7.T) {
                if (i == nm7.w2 && (l = this.N) != null && l.equals((Long) objArr[0])) {
                    sic.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
                    this.N = null;
                    return;
                }
                return;
            }
            Long l2 = this.N;
            if (l2 == null || ((TLRPC.ChatFull) objArr[0]).id != l2.longValue() || getMessagesController().f1(this.N.longValue(), true, null) == null) {
                return;
            }
            sic.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
            this.N = null;
            return;
        }
        if (!this.E || ((Boolean) objArr[2]).booleanValue()) {
            return;
        }
        ArrayList arrayList4 = (ArrayList) objArr[1];
        int size = arrayList4.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList4.get(i4);
            int i5 = i4 + 1;
            k47 k47Var = (k47) obj;
            TLRPC.MessageAction messageAction = k47Var.k.action;
            if (messageAction instanceof TLRPC.TL_messageActionPhoneCall) {
                long Z0 = k47Var.Z0();
                long j = Z0 == getUserConfig().e() ? k47Var.k.peer_id.user_id : Z0;
                byte b4 = Z0 == getUserConfig().e() ? (byte) 0 : (byte) 1;
                TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = k47Var.k.action.reason;
                if (b4 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                    b4 = b2;
                }
                if (b4 != 0 || (!(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) && !(phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                    r12 = b4;
                }
                if (!arrayList2.isEmpty()) {
                    fa1 fa1Var3 = (fa1) arrayList2.get(0);
                    ArrayList arrayList5 = fa1Var3.b;
                    if (arrayList5.size() == 1) {
                        i3 = i5;
                        if (((TLRPC.User) arrayList5.get(0)).id == j && fa1Var3.d == r12) {
                            fa1Var3.c.add(0, k47Var.k);
                            i4 = i3;
                        }
                        fa1 fa1Var4 = new fa1();
                        ArrayList arrayList6 = fa1Var4.c;
                        arrayList6.clear();
                        arrayList6.add(k47Var.k);
                        ArrayList arrayList7 = fa1Var4.b;
                        arrayList7.clear();
                        W1 = getMessagesController().W1(Long.valueOf(j));
                        if (W1 != null) {
                            arrayList7.add(W1);
                        }
                        fa1Var4.d = r12;
                        fa1Var4.e = k47Var.I4();
                        arrayList2.add(0, fa1Var4);
                        this.c.g3.O(true);
                        b = b2;
                    }
                }
                i3 = i5;
                fa1 fa1Var42 = new fa1();
                ArrayList arrayList62 = fa1Var42.c;
                arrayList62.clear();
                arrayList62.add(k47Var.k);
                ArrayList arrayList72 = fa1Var42.b;
                arrayList72.clear();
                W1 = getMessagesController().W1(Long.valueOf(j));
                if (W1 != null) {
                }
                fa1Var42.d = r12;
                fa1Var42.e = k47Var.I4();
                arrayList2.add(0, fa1Var42);
                this.c.g3.O(true);
                b = b2;
            } else {
                i3 = i5;
                if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                    TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                    long Z02 = k47Var.Z0();
                    Set<Long> set = (Set) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new x00(b3)).collect(Collectors.toSet());
                    set.add(Long.valueOf(Z02 == getUserConfig().e() ? k47Var.k.peer_id.user_id : Z02));
                    byte b5 = Z02 == getUserConfig().e() ? (byte) 0 : (byte) 1;
                    if (b5 == 1 && tL_messageActionConferenceCall.missed) {
                        b5 = b2;
                    }
                    r12 = (b5 == 0 && tL_messageActionConferenceCall.missed) ? (byte) 3 : b5;
                    if (arrayList2.isEmpty()) {
                        b = b2;
                        arrayList = arrayList2;
                    } else {
                        int i6 = 0;
                        while (true) {
                            if (i6 >= arrayList2.size()) {
                                b = b2;
                                arrayList = arrayList2;
                                fa1Var = null;
                                break;
                            }
                            fa1Var = (fa1) arrayList2.get(i6);
                            b = b2;
                            arrayList = arrayList2;
                            if (fa1Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            }
                            i6++;
                            b2 = b;
                            arrayList2 = arrayList;
                        }
                        if (fa1Var != null) {
                            ArrayList arrayList8 = fa1Var.b;
                            fa1Var.c.add(0, k47Var.k);
                            for (Long l3 : set) {
                                long longValue = l3.longValue();
                                int size2 = arrayList8.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 < size2) {
                                        Object obj2 = arrayList8.get(i7);
                                        i7++;
                                        if (longValue == ((TLRPC.User) obj2).id) {
                                            break;
                                        }
                                    } else {
                                        TLRPC.User W12 = getMessagesController().W1(l3);
                                        if (W12 != null) {
                                            arrayList8.add(W12);
                                        }
                                    }
                                }
                            }
                            this.c.g3.O(true);
                            i4 = i3;
                            b2 = b;
                            arrayList2 = arrayList;
                        }
                    }
                    fa1 fa1Var5 = new fa1();
                    fa1Var5.a = tL_messageActionConferenceCall.call_id;
                    ArrayList arrayList9 = fa1Var5.c;
                    arrayList9.clear();
                    arrayList9.add(k47Var.k);
                    ArrayList arrayList10 = fa1Var5.b;
                    arrayList10.clear();
                    for (Long l4 : set) {
                        l4.getClass();
                        TLRPC.User W13 = getMessagesController().W1(l4);
                        if (W13 != null) {
                            arrayList10.add(W13);
                        }
                    }
                    fa1Var5.d = r12;
                    fa1Var5.e = k47Var.I4();
                    arrayList2 = arrayList;
                    arrayList2.add(0, fa1Var5);
                    this.c.g3.O(true);
                } else {
                    b = b2;
                }
            }
            i4 = i3;
            b2 = b;
        }
        zja zjaVar = this.w;
        if (zjaVar != null) {
            zjaVar.setVisibility(arrayList2.isEmpty() ? 8 : 0);
        }
    }

    public final void e0(boolean z) {
        jh2 jh2Var;
        this.simpleActionBar.w();
        this.H.clear();
        int childCount = this.c.getChildCount();
        int i = 0;
        while (true) {
            q7c q7cVar = this.c;
            if (i >= childCount) {
                q7cVar.g3.O(true);
                return;
            }
            View childAt = q7cVar.getChildAt(i);
            if ((childAt instanceof ea1) && (jh2Var = ((ea1) childAt).e) != null) {
                jh2Var.a(false, z);
            }
            i++;
        }
    }

    public final boolean f0(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (this.H.contains(Integer.valueOf(((TLRPC.Message) arrayList.get(i)).id))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x01db, code lost:
    
        if (r5.d != r15) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(TLObject tLObject, TLRPC.TL_error tL_error) {
        boolean z;
        TLRPC.messages_Messages messages_messages;
        TLRPC.User W1;
        byte b;
        fa1 fa1Var;
        TLRPC.User W12;
        ArrayList arrayList = this.x;
        byte b2 = 0;
        byte b3 = 1;
        if (tL_error == null) {
            TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
            oc7.r1(this.currentAccount).d4(messages_messages2.users, false);
            oc7.r1(this.currentAccount).X3(messages_messages2.chats, false);
            this.F = messages_messages2.messages.isEmpty();
            fa1 fa1Var2 = !arrayList.isEmpty() ? (fa1) b10.f(1, arrayList) : null;
            int i = 0;
            while (i < messages_messages2.messages.size()) {
                TLRPC.Message message = messages_messages2.messages.get(i);
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction == null || (messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                    messages_messages = messages_messages2;
                } else {
                    long B1 = k47.B1(message.from_id);
                    if (B1 == getUserConfig().e()) {
                        B1 = message.peer_id.user_id;
                    }
                    HashSet hashSet = new HashSet();
                    byte b4 = k47.B1(message.from_id) == getUserConfig().e() ? b2 : b3;
                    TLRPC.MessageAction messageAction2 = message.action;
                    byte b5 = 2;
                    if (messageAction2 instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction2;
                        hashSet.add(Long.valueOf(B1));
                        hashSet.addAll((java.util.Collection) Collection.-EL.stream(tL_messageActionConferenceCall.other_participants).map(new x00(b3)).collect(Collectors.toSet()));
                        if (b4 == b3 && tL_messageActionConferenceCall.missed) {
                            b4 = 2;
                        }
                        byte b6 = (b4 == 0 && tL_messageActionConferenceCall.missed) ? (byte) 3 : b4;
                        messages_messages = messages_messages2;
                        if (fa1Var2 != null) {
                            b = b6;
                            if (fa1Var2.a == tL_messageActionConferenceCall.call_id) {
                                fa1Var = fa1Var2;
                                if (fa1Var == null) {
                                    ArrayList arrayList2 = fa1Var.b;
                                    fa1Var.c.add(0, message);
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        Long l = (Long) it.next();
                                        long longValue = l.longValue();
                                        int size = arrayList2.size();
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= size) {
                                                TLRPC.User W13 = getMessagesController().W1(l);
                                                if (W13 != null) {
                                                    arrayList2.add(W13);
                                                }
                                            } else {
                                                Object obj = arrayList2.get(i2);
                                                i2++;
                                                if (longValue == ((TLRPC.User) obj).id) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    if (fa1Var2 != null && !arrayList.contains(fa1Var2)) {
                                        arrayList.add(fa1Var2);
                                    }
                                    fa1Var2 = new fa1();
                                    fa1Var2.a = tL_messageActionConferenceCall.call_id;
                                    ArrayList arrayList3 = fa1Var2.c;
                                    arrayList3.clear();
                                    arrayList3.add(message);
                                    Iterator it2 = hashSet.iterator();
                                    while (it2.hasNext()) {
                                        Long l2 = (Long) it2.next();
                                        l2.getClass();
                                        ArrayList arrayList4 = fa1Var2.b;
                                        if (Collection.-EL.stream(arrayList4).noneMatch(new ve((byte) 1, B1)) && (W12 = getMessagesController().W1(l2)) != null) {
                                            arrayList4.add(W12);
                                        }
                                    }
                                    fa1Var2.d = b;
                                    TLRPC.MessageAction messageAction3 = message.action;
                                    fa1Var2.e = messageAction3 != null && messageAction3.video;
                                }
                            }
                        } else {
                            b = b6;
                        }
                        int i3 = b2;
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                fa1Var = null;
                                break;
                            }
                            fa1Var = (fa1) arrayList.get(i3);
                            int i4 = i3;
                            if (fa1Var.a == tL_messageActionConferenceCall.call_id) {
                                break;
                            } else {
                                i3 = i4 + 1;
                            }
                        }
                        if (fa1Var == null) {
                        }
                    } else {
                        messages_messages = messages_messages2;
                        hashSet.add(Long.valueOf(B1));
                        TLRPC.PhoneCallDiscardReason phoneCallDiscardReason = message.action.reason;
                        if (b4 == 1 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) {
                            b4 = 2;
                        }
                        byte b7 = (b4 == 0 && ((phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonMissed) || (phoneCallDiscardReason instanceof TLRPC.TL_phoneCallDiscardReasonBusy))) ? (byte) 3 : b4;
                        if (fa1Var2 != null) {
                            ArrayList arrayList5 = fa1Var2.b;
                            if (hashSet.size() == arrayList5.size()) {
                                int size2 = arrayList5.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size2) {
                                        Object obj2 = arrayList5.get(i5);
                                        i5++;
                                        if (!hashSet.contains(Long.valueOf(((TLRPC.User) obj2).id))) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        if (fa1Var2 != null && !arrayList.contains(fa1Var2)) {
                            arrayList.add(fa1Var2);
                        }
                        fa1Var2 = new fa1();
                        fa1Var2.c.clear();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            Long l3 = (Long) it3.next();
                            l3.getClass();
                            ArrayList arrayList6 = fa1Var2.b;
                            if (Collection.-EL.stream(arrayList6).noneMatch(new ve(b5, B1)) && (W1 = getMessagesController().W1(l3)) != null) {
                                arrayList6.add(W1);
                            }
                        }
                        fa1Var2.d = b7;
                        TLRPC.MessageAction messageAction4 = message.action;
                        fa1Var2.e = messageAction4 != null && messageAction4.video;
                        fa1Var2.c.add(message);
                    }
                }
                i++;
                messages_messages2 = messages_messages;
                b2 = 0;
                b3 = 1;
            }
            if (fa1Var2 != null && !fa1Var2.c.isEmpty() && !arrayList.contains(fa1Var2)) {
                arrayList.add(fa1Var2);
            }
            z = true;
        } else {
            z = true;
            this.F = true;
        }
        this.y = false;
        if (!this.E) {
            resumeDelayedFragmentAnimation();
        }
        this.E = z;
        this.w.setVisibility(arrayList.isEmpty() ? 8 : 0);
        jp0 jp0Var = this.a;
        if (jp0Var != null) {
            jp0Var.e();
        }
        q7c q7cVar = this.c;
        if (q7cVar != null) {
            q7cVar.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.c, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, cmb.g6));
        wp4 wp4Var = this.f;
        if (wp4Var != null) {
            arrayList.add(new cnb(wp4Var.c, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.N9));
            arrayList.add(new cnb(this.f.c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.O9));
            arrayList.add(new cnb(this.f.c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.P9));
        }
        return arrayList;
    }

    public final void h0(he heVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        heVar.dismiss();
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error != null) {
                if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    showDialog(new c23(getParentActivity(), hashSet));
                    return;
                } else {
                    c41.b0(this).g0(tL_error, false);
                    return;
                }
            }
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        getMessagesController().d4(groupcall.users, false);
        getMessagesController().X3(groupcall.chats, false);
        if (groupcall.participants.isEmpty()) {
            showDialog(new c23(getParentActivity(), hashSet));
        } else {
            sic.g(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
        }
    }

    public final void i0(he heVar, TLObject tLObject, HashSet hashSet, TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage, boolean z, TLRPC.TL_error tL_error) {
        heVar.dismiss();
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (tL_error != null) {
                if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    showDialog(new c23(getParentActivity(), hashSet));
                    return;
                } else {
                    c41.b0(this).g0(tL_error, false);
                    return;
                }
            }
            return;
        }
        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
        getMessagesController().d4(groupcall.users, false);
        getMessagesController().X3(groupcall.chats, false);
        if (groupcall.participants.isEmpty()) {
            showDialog(new c23(getParentActivity(), hashSet));
        } else {
            sic.g(getParentActivity(), this.currentAccount, tL_inputGroupCallInviteMessage, z, groupcall.call, null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // aj6
    public final nz4 j() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.i;
        }
        return null;
    }

    public final void j0(c6c c6cVar, View view) {
        int i = c6cVar.d;
        byte b = 0;
        if (i == 2) {
            k0(true);
            u31 J = c41.b0(this).J(R.raw.contact_check, gm.S2(jb6.M0(2131749215, null)), jb6.M0(2131743572, null), 5000, true, new n91(this, (byte) 0));
            J.j = 5000;
            J.j();
            return;
        }
        if (i == 1) {
            presentFragment(new ca1(ts2.l("isCall", true), getCurrentAccount(), this));
            return;
        }
        Object obj = c6cVar.H;
        boolean z = obj instanceof fa1;
        int i2 = nm7.s;
        if (!z) {
            if (view instanceof ha1) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", ((ha1) view).c.id);
                getNotificationCenter().k(i2, new Object[0]);
                presentFragment(new yv1(bundle), this.r);
                return;
            }
            return;
        }
        fa1 fa1Var = (fa1) obj;
        ArrayList arrayList = fa1Var.c;
        if (this.simpleActionBar.x()) {
            a0(arrayList, (ea1) view);
            return;
        }
        if (fa1Var.a == 0 || arrayList.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", k47.B0((TLRPC.Message) arrayList.get(0)));
            bundle2.putInt("message_id", ((TLRPC.Message) arrayList.get(0)).id);
            getNotificationCenter().k(i2, new Object[0]);
            presentFragment(new yv1(bundle2), this.r);
            return;
        }
        boolean z2 = fa1Var.e;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = fa1Var.b;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            hashSet.add(Long.valueOf(((TLRPC.User) obj2).id));
        }
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = ((TLRPC.Message) arrayList.get(0)).id;
        he heVar = new he(3, null, getParentActivity());
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = tL_inputGroupCallInviteMessage;
        getgroupcall.limit = getMessagesController().l4.w3.f();
        heVar.setOnCancelListener(new p91(this, getConnectionsManager().sendRequest(getgroupcall, new o91(this, heVar, hashSet, tL_inputGroupCallInviteMessage, z2, (byte) 0)), b));
        heVar.q(600L);
    }

    public final void k0(boolean z) {
        if (z == getUserConfig().X) {
            return;
        }
        z8c userConfig = getUserConfig();
        if (userConfig.X != z) {
            userConfig.X = z;
            userConfig.u(false);
        }
        this.c.g3.O(true);
        nm7.f(this.currentAccount).k(nm7.S5, new Object[0]);
    }

    public final void m0(boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        he heVar = alertDialog$Builder.a;
        if (z) {
            heVar.S = jb6.M0(2131751526, null);
            heVar.U = jb6.M0(2131751525, null);
        } else {
            heVar.S = jb6.M0(2131751496, null);
            heVar.U = jb6.M0(2131751436, null);
        }
        boolean[] zArr = {false};
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        oh2 oh2Var = new oh2(getParentActivity(), 1);
        oh2Var.setBackground(cmb.L0(false));
        oh2Var.e(jb6.M0(2131751495, null), "", false, false, false);
        oh2Var.setPadding(jb6.a0 ? gm.L(8.0f) : 0, 0, jb6.a0 ? 0 : gm.L(8.0f), 0);
        frameLayout.addView(oh2Var, qoe.d(-1, 48.0f, 51, 8.0f, 0.0f, 8.0f, 0.0f));
        oh2Var.setOnClickListener(new gf(zArr, (byte) 6));
        alertDialog$Builder.n(frameLayout);
        alertDialog$Builder.j(jb6.M0(2131751535, null), new ci((Object) this, z, (Object) zArr, (byte) 2));
        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
        showDialog(heVar);
        TextView textView = (TextView) heVar.c(-1);
        if (textView != null) {
            anb.X(textView, cmb.p7, null);
        }
    }

    public final void n0() {
        boolean z;
        boolean x = this.simpleActionBar.x();
        ArrayList arrayList = this.H;
        if (x) {
            z = true;
            if (arrayList.isEmpty()) {
                e0(true);
                return;
            }
        } else {
            rja rjaVar = this.simpleActionBar;
            if (rjaVar.e == null) {
                rjaVar.q().c(2, R.drawable.msg_delete, gm.L(54.0f), jb6.M0(2131751535, null));
            }
            this.simpleActionBar.J();
            z = false;
        }
        this.simpleActionBar.F(arrayList.size(), z);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!this.simpleActionBar.x()) {
            return super.onBackPressed(z);
        }
        if (!z) {
            return false;
        }
        e0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        d0(0, 50);
        oc7 messagesController = getMessagesController();
        messagesController.getClass();
        this.G = new ArrayList(messagesController.h.keySet());
        e7a e7aVar = this.O;
        if (e7aVar != null) {
            e7aVar.a();
            this.O = null;
        }
        nm7 notificationCenter = getNotificationCenter();
        notificationCenter.getClass();
        e7a e7aVar2 = new e7a(notificationCenter, this);
        e7aVar2.b(1);
        e7aVar2.b(nm7.v);
        e7aVar2.b(nm7.A2);
        e7aVar2.b(nm7.T);
        e7aVar2.b(nm7.w2);
        this.O = e7aVar2;
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.r = bundle.getBoolean("needFinishFragment", true);
            this.s = this.arguments.getBoolean("hasMainTabs", false);
        }
        this.P = this.s ? gm.L(72.0f) : 0;
        this.Q = this.s ? gm.L(64.0f) : 0;
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        e7a e7aVar = this.O;
        if (e7aVar != null) {
            e7aVar.a();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.S = i4;
        c0();
        b0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        boolean z;
        if (i == 101 || i == 102 || i == 103) {
            int length = iArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = true;
                    break;
                } else {
                    if (iArr[i2] != 0) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            }
            if (iArr.length <= 0 || !z) {
                sic.h(getParentActivity(), null, i);
            } else if (i == 103) {
                sic.l(this.M, null, false, null, getParentActivity(), this, getAccountInstance());
            } else {
                TLRPC.UserFull X1 = this.L != null ? getMessagesController().X1(this.L.id) : null;
                sic.m(this.L, i == 102, i == 102 || (X1 != null && X1.video_calls_available), getParentActivity(), null, getAccountInstance());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        q7c q7cVar = this.c;
        if (q7cVar != null) {
            q7cVar.g3.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            q7c q7cVar = this.c;
            if (q7cVar != null) {
                int childCount = q7cVar.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.c.getChildAt(i);
                    if (childAt instanceof ea1) {
                        ((ea1) childAt).d.y(0);
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // aj6
    public final void u() {
        if (this.b.K0() < 15) {
            this.c.z0(0);
            return;
        }
        cw6 cw6Var = this.e;
        cw6Var.b = 1;
        cw6Var.l(0, 0, false, false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // aj6
    public final nz4 z() {
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        baseSimpleGlass.getClass();
        if (sy4.f().a) {
            return baseSimpleGlass.h;
        }
        return null;
    }

    public ia1() {
        this(null);
    }

    @Override // aj6
    public final void F() {
    }
}
