// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class oc5 extends d implements jm7, g94, View.OnClickListener, tyc {
    public wp4 E;
    public boolean F;
    public ec0 G;
    public final long H;
    public final long I;
    public TLRPC.ChatFull J;
    public vh6 K;
    public final int L;
    public String M;
    public final int N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public boolean T;
    public boolean U;
    public final int V;
    public final boolean W;
    public final boolean X;
    public wc5 Y;
    public wc5 Z;
    public final byte a;
    public vh6 a0;
    public final h94 b;
    public ArrayList b0;
    public final fn0 c;
    public wc5 c0;
    public yc d;
    public int d0;
    public a91 e;
    public i58 e0;
    public oq4 f;
    public boolean f0;
    public final HashSet g0;
    public fc5 h;
    public boolean h0;
    public boolean i0;
    public ArrayList j0;
    public boolean k0;
    public boolean l0;
    public int m0;
    public r59 n;
    public int n0;
    public int o0;
    public final Rect p0;
    public final mr3 q0;
    public u46 r;
    public final nz4 r0;
    public a1b s;
    public nfc s0;
    public final ArrayList t0;
    public final RectF u0;
    public final RectF v0;
    public mc5 w;
    public jc5 x;
    public ic5 y;

    public oc5(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 31 ? (byte) 48 : (byte) 0;
        d53 d53Var = d53.h;
        this.b = new h94(3, this, d53Var, 350L);
        this.c = new fn0(4, this, d53Var, 350L, false);
        this.a0 = new vh6();
        this.b0 = new ArrayList();
        this.g0 = new HashSet();
        this.m0 = -4;
        this.p0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.t0 = arrayList;
        RectF rectF = new RectF();
        this.u0 = rectF;
        RectF rectF2 = new RectF();
        this.v0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i2 = bundle.getInt("chatType", 0);
        this.N = i2;
        this.O = bundle.getBoolean("forImport", false);
        boolean z = bundle.getBoolean("isAlwaysShare", false);
        this.P = z;
        boolean z2 = bundle.getBoolean("isNeverShare", false);
        this.Q = z2;
        boolean z3 = bundle.getBoolean("isCall", false);
        this.R = z3;
        boolean z4 = bundle.getBoolean("addToGroup", false);
        this.S = z4;
        this.V = bundle.getInt("chatAddType", 0);
        this.W = bundle.getBoolean("allowPremium", false);
        this.X = bundle.getBoolean("allowMiniapps", false);
        this.H = bundle.getLong("chatId");
        this.I = bundle.getLong("channelId");
        if (z || z2 || z4) {
            this.L = 0;
        } else if (z3) {
            this.L = getMessagesController().l4.w3.f() - 1;
        } else {
            this.L = i2 == 0 ? getMessagesController().Q2 : getMessagesController().P2;
        }
        if (i >= 31) {
            this.q0 = new mr3(false);
            this.r0 = new nz4(null);
        } else {
            this.q0 = null;
            this.r0 = null;
        }
    }

    @Override // g94
    public final void D(int i, float f, float f2, h94 h94Var) {
        if (i != 3) {
            if (i == 4) {
                i0();
                k0();
                return;
            }
            return;
        }
        int paddingTop = this.n.getPaddingTop();
        l0();
        oq4 oq4Var = this.f;
        h94 h94Var2 = this.b;
        oq4Var.setTranslationY(h94Var2.f);
        k0();
        this.e.setTranslationY(gm.L(48.0f) + h94Var2.f);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((fn0) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override // tyc
    public final View R() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.Ri));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.m6));
        hashSet.add(Integer.valueOf(cmb.Qi));
        hashSet.add(Integer.valueOf(cmb.Pi));
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        return h0(true);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final a createActionBar(Context context) {
        a createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 0;
        this.U = false;
        this.T = false;
        this.b0.clear();
        this.a0.b();
        this.c0 = null;
        boolean z = this.S;
        byte b2 = 1;
        int i = this.N;
        byte b3 = 2;
        if (i == 2) {
            this.F = true;
        } else {
            this.F = !z;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.M);
        boolean z2 = this.Q;
        boolean z3 = this.P;
        boolean z4 = this.R;
        if (!isEmpty) {
            this.actionBar.setTitle(this.M);
        } else if (i == 2) {
            this.actionBar.setTitle(jb6.M0(2131752479, null));
        } else if (z4) {
            this.actionBar.setTitle(jb6.M0(2131748045, null));
        } else if (z) {
            long j = this.I;
            a aVar = this.actionBar;
            if (j != 0) {
                aVar.setTitle(jb6.M0(2131752479, null));
            } else {
                aVar.setTitle(jb6.M0(2131749257, null));
            }
        } else {
            int i2 = this.V;
            if (z3) {
                a aVar2 = this.actionBar;
                if (i2 == 2) {
                    aVar2.setTitle(jb6.M0(2131750742, null));
                } else if (i2 == 1) {
                    aVar2.setTitle(jb6.M0(2131754234, null));
                } else {
                    aVar2.setTitle(jb6.M0(2131754232, null));
                }
            } else if (z2) {
                a aVar3 = this.actionBar;
                if (i2 == 2) {
                    aVar3.setTitle(jb6.M0(2131750666, null));
                } else if (i2 == 1) {
                    aVar3.setTitle(jb6.M0(2131748049, null));
                } else {
                    aVar3.setTitle(jb6.M0(2131748047, null));
                }
            } else {
                this.actionBar.setTitle(jb6.M0(i == 0 ? 2131748030 : 2131748046, null));
            }
        }
        byte b4 = 24;
        this.actionBar.setActionBarMenuOnItemClick(new fh2(this, b4));
        this.f = new oq4(context, this.resourceProvider);
        yd ydVar = new yd(b4, context, this);
        this.fragmentView = ydVar;
        ydVar.setFocusableInTouchMode(true);
        ydVar.setDescendantFocusability(131072);
        fc5 fc5Var = new fc5(this, context, this.currentAccount);
        this.h = fc5Var;
        fc5Var.setDelegate(new bc5(this, b));
        this.h.getSpansContainer().setOnClickListener(new cc5(this, b2));
        fc5 fc5Var2 = this.h;
        this.a0 = fc5Var2.b;
        this.b0 = fc5Var2.c;
        w0();
        byte b5 = 13;
        this.f.r.setOnEditorActionListener(new j(this, b5));
        this.f.r.setOnKeyListener(new gc5(this, b));
        this.f.r.addTextChangedListener(new b7(this, (byte) 26));
        ArrayList arrayList = this.j0;
        if (arrayList != null) {
            t0(arrayList, this.k0, this.l0);
        }
        tk4 tk4Var = new tk4(context, null);
        tk4Var.setViewType(6);
        tk4Var.x = false;
        a1b a1bVar = new a1b(context, tk4Var, 1, null);
        this.s = a1bVar;
        a1bVar.addView(tk4Var);
        this.s.e(true, false);
        this.s.d.setText(jb6.M0(2131747901, null));
        this.r = new u46(1, false);
        r59 r59Var = new r59(context, null);
        this.n = r59Var;
        r59Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        r59 r59Var2 = this.n;
        mc5 mc5Var = new mc5(this, context);
        this.w = mc5Var;
        r59Var2.setAdapter(mc5Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(jb6.a0 ? 1 : 2);
        r59 r59Var3 = this.n;
        float f = -this.a;
        ydVar.addView(r59Var3, qoe.d(-1, -1.0f, nm7.D1, 0.0f, f, 0.0f, f));
        ydVar.addView(this.s);
        this.n.setOnItemClickListener(new k0(this, context, b5));
        this.n.setOnScrollListener(new ip2(this, (byte) 18));
        r59 r59Var4 = this.n;
        r59Var4.X1 = true;
        r59Var4.Y1 = false;
        wp4 wp4Var = new wp4(this.resourceProvider, context, false);
        this.E = wp4Var;
        if (z2 || z3 || z) {
            wp4Var.c.setImageResource(R.drawable.floating_check);
        } else {
            ee0 ee0Var = new ee0(false);
            ee0Var.l = (short) 180;
            ee0Var.invalidateSelf();
            this.E.c.setImageDrawable(ee0Var);
        }
        if (!z4) {
            ydVar.addView(this.E, wp4.b());
        }
        this.E.setOnClickListener(new cc5(this, b3));
        this.E.e(this.F, false);
        this.E.setContentDescription(jb6.M0(2131747984, null));
        byte b6 = 3;
        if (z4) {
            this.G = new ec0(this, context);
            View view = new View(context);
            anb.h(cmb.c7, this.resourceProvider, view);
            this.G.addView(view, qoe.d(-1, 1.0f / gm.p, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(gm.L(14.0f), gm.L(14.0f), gm.L(14.0f), gm.L(14.0f));
            this.G.addView(linearLayout, qoe.e(-1, -2, 87));
            b61 b61Var = new b61(this.resourceProvider, context, true);
            b61Var.f();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new pn2(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) jb6.M0(2131749238, null));
            b61Var.i(spannableStringBuilder, false, true);
            linearLayout.addView(b61Var, qoe.q(-1, 48, 1.0f, nm7.D1, 0, 0, 6, 0));
            b61Var.setOnClickListener(new cc5(this, b6));
            b61 b61Var2 = new b61(this.resourceProvider, context, true);
            b61Var2.f();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new pn2(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) jb6.M0(2131749239, null));
            b61Var2.i(spannableStringBuilder2, false, true);
            linearLayout.addView(b61Var2, qoe.q(-1, 48, 1.0f, nm7.D1, 6, 0, 0, 0));
            b61Var2.setOnClickListener(new cc5(this, (byte) 4));
            ydVar.addView(this.G, qoe.e(-1, -2, 87));
            i0();
        }
        x0();
        yc ycVar = new yc(this, context);
        this.d = ycVar;
        ydVar.addView(ycVar, qoe.e(-1, 0, 48));
        ydVar.addView(this.actionBar);
        ydVar.addView(this.f, qoe.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        ydVar.addView(this.h);
        r59 r59Var5 = this.n;
        Objects.requireNonNull(r59Var5);
        this.s0 = new nfc(r59Var5, ydVar, new ec5(r59Var5, (byte) 0));
        this.n.E0(new dc5(this, b6));
        a91 a91Var = new a91(context, this.parentLayout);
        this.e = a91Var;
        ((fn0) a91Var.c).a(false, false);
        ydVar.addView(this.e, qoe.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        View view2 = this.fragmentView;
        bc5 bc5Var = new bc5(this, b6);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(view2, bc5Var);
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.N) {
            mc5 mc5Var = this.w;
            if (mc5Var != null) {
                mc5Var.f();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == nm7.R) {
                removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            int i3 = oc7.s5;
            if ((intValue & 2) == 0 && (intValue & 1) == 0 && (intValue & 4) == 0) {
                return;
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = this.n.getChildAt(i4);
                if (childAt instanceof xc5) {
                    ((xc5) childAt).f(intValue);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void g0() {
        mr3 mr3Var;
        if (Build.VERSION.SDK_INT < 31 || (mr3Var = this.q0) == null) {
            return;
        }
        int L = gm.L(48.0f);
        int L2 = gm.L(48.0f) + this.d0;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + L2;
        RectF rectF = this.u0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f = -L;
        rectF.inset(0.0f, f);
        if (this.G != null) {
            float measuredHeight2 = this.fragmentView.getMeasuredHeight() - this.G.getMeasuredHeight();
            float measuredWidth2 = this.fragmentView.getMeasuredWidth();
            float measuredHeight3 = this.fragmentView.getMeasuredHeight();
            RectF rectF2 = this.v0;
            rectF2.set(0.0f, measuredHeight2, measuredWidth2, measuredHeight3);
            rectF2.inset(0.0f, f);
        }
        mr3Var.g((this.G == null || this.c.e <= 0.0f) ? 1 : 2, this.t0);
        mr3Var.e(this.s0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cnb(this.h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.k7));
        arrayList.add(new cnb(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.l7));
        arrayList.add(new cnb(this.n, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.m7));
        arrayList.add(new cnb(this.s, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.s, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        arrayList.add(new cnb(this.n, 4, new Class[]{xc5.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.Qi));
        arrayList.add(new cnb(this.n, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.h7));
        arrayList.add(new cnb(this.n, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.i7));
        arrayList.add(new cnb(this.n, 4, new Class[]{xc5.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.j7));
        arrayList.add(new cnb(this.h.getSpansContainer(), 0, new Class[]{wc5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Si));
        arrayList.add(new cnb(this.h.getSpansContainer(), 0, new Class[]{wc5.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Ti));
        arrayList.add(new cnb(this.s.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
        arrayList.add(new cnb(this.s.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.x6));
        if (this.e0 != null) {
            arrayList.addAll(new ArrayList());
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h0(boolean z) {
        boolean z2;
        byte b = 1;
        if (this.f0) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < this.a0.m(); i++) {
                hashSet.add(Long.valueOf(this.a0.j(i)));
            }
            boolean z3 = this.h0;
            boolean z4 = this.Y == null;
            HashSet hashSet2 = this.g0;
            if (z3 != z4) {
                if (this.i0 != (this.Z == null) && hashSet.size() == hashSet2.size()) {
                    z2 = false;
                    if (!z2) {
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Long l = (Long) it.next();
                            l.getClass();
                            if (!hashSet2.contains(l)) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    if (z2) {
                        if (z) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            String M0 = jb6.M0(2131743413, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            heVar.U = jb6.M0(2131746505, null);
                            alertDialog$Builder.j(jb6.M0(2131754181, null), new bc5(this, b));
                            alertDialog$Builder.g(jb6.M0(2131747313, null), new bc5(this, (byte) 2));
                            showDialog(heVar);
                        }
                        return false;
                    }
                }
            }
            z2 = true;
            if (!z2) {
            }
            if (z2) {
            }
        }
        return true;
    }

    public final void i0() {
        ec0 ec0Var = this.G;
        if (ec0Var == null) {
            return;
        }
        float f = this.c.e;
        ec0Var.setTranslationY((1.0f - f) * gm.L(12.0f));
        this.G.setAlpha(f);
        this.G.setVisibility(f > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        wp4 wp4Var = this.E;
        if (wp4Var != null) {
            wp4Var.setTranslationY(-Math.max(this.n0, this.o0));
        }
    }

    public final void k0() {
        if (this.n.Z0()) {
            this.n.setClipBounds(null);
            return;
        }
        int L = (int) ((gm.L(76.0f) + this.n0) * this.c.e);
        byte b = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + gm.L(b + 48) + ((int) this.b.f);
        int measuredWidth = this.n.getMeasuredWidth();
        int y = kt6.y(b, this.n.getMeasuredHeight(), L);
        Rect rect = this.p0;
        rect.set(0, measuredHeight, measuredWidth, y);
        this.n.setClipBounds(rect);
    }

    public final void l0() {
        int L = this.R ? gm.L(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + gm.L(r3 + 48) + ((int) this.b.f), 0, gm.L(this.a) + this.n0 + L);
        this.s.setPadding(0, 0, 0, this.n0);
    }

    public final void m0() {
        long j;
        int childCount = this.n.getChildCount();
        byte b = 0;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.n.getChildAt(i);
            if (childAt instanceof xc5) {
                xc5 xc5Var = (xc5) childAt;
                Object object = xc5Var.getObject();
                if (object instanceof TLRPC.User) {
                    j = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j = -((TLRPC.Chat) object).id;
                } else {
                    if (object instanceof String) {
                        String str = (String) object;
                        if ("premium".equalsIgnoreCase(str)) {
                            xc5Var.c(this.Y != null, true);
                            xc5Var.setCheckBoxEnabled(true);
                        } else if ("miniapps".equalsIgnoreCase(str)) {
                            xc5Var.c(this.Z != null, true);
                            xc5Var.setCheckBoxEnabled(true);
                        }
                    }
                    j = 0;
                }
                if (j != 0) {
                    vh6 vh6Var = this.K;
                    if (vh6Var == null || vh6Var.h(j) < 0) {
                        xc5Var.c(this.a0.h(j) >= 0, true);
                        xc5Var.setCheckBoxEnabled(true);
                    } else {
                        xc5Var.c(true, false);
                        xc5Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof l55) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.w.w) {
                    ((l55) childAt).a((this.Y == null && this.a0.i()) ? "" : jb6.M0(2131751394, null), new cc5(this, b));
                }
            }
        }
    }

    public final void n0(Canvas canvas, RectF rectF, Paint paint) {
        nz4 nz4Var;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !gda.f() || (nz4Var = this.r0) == null) {
            return;
        }
        nz4Var.e(rectF.left, rectF.top, rectF.right, rectF.bottom, canvas);
        int alpha = paint.getAlpha();
        paint.setAlpha(nm7.H2);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override // tyc
    public final void o(wzc wzcVar) {
        this.o0 = wzcVar.a.f(8).d;
        j0();
    }

    public final HashSet o0() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.a0.m(); i++) {
            hashSet.add(Long.valueOf(this.a0.j(i)));
        }
        return hashSet;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (h0(z)) {
            return super.onBackPressed(z);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wc5 wc5Var = (wc5) view;
        if (wc5Var.E) {
            this.c0 = null;
            this.h.c(wc5Var);
            x0();
            m0();
            return;
        }
        wc5 wc5Var2 = this.c0;
        if (wc5Var2 != null) {
            wc5Var2.a();
        }
        this.c0 = wc5Var;
        wc5Var.b();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.N);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, nm7.R);
        getUserConfig().s();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.N);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, nm7.R);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            oq4 oq4Var = this.f;
            if (oq4Var != null) {
                oq4Var.updateColors();
            }
            wp4 wp4Var = this.E;
            if (wp4Var != null) {
                wp4Var.updateColors();
            }
            y0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0(Context context, View view, int i) {
        long j;
        mc5 mc5Var = this.w;
        byte b = 0;
        if (i == mc5Var.x) {
            int i2 = this.currentAccount;
            ylb ylbVar = this.resourceProvider;
            dc5 dc5Var = new dc5(this, b);
            he heVar = new he(3, null, context);
            heVar.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i2).sendRequest(createconferencecall, new ev0(i2, (Object) heVar, (Object) context, (Object) ylbVar, (Object) dc5Var, (byte) 1));
            return;
        }
        long j2 = this.I;
        if (i == 0 && mc5Var.G != 0 && !mc5Var.n) {
            i58 i58Var = new i58(context, this, this.J, this.H, j2 != 0);
            this.e0 = i58Var;
            showDialog(i58Var);
            return;
        }
        if (view instanceof xc5) {
            xc5 xc5Var = (xc5) view;
            if (xc5Var.r) {
                wc5 wc5Var = this.Y;
                if (wc5Var == null) {
                    wc5 wc5Var2 = new wc5(this.f.r.getContext(), "premium");
                    this.Y = wc5Var2;
                    this.h.a(wc5Var2);
                    this.Y.setOnClickListener(this);
                } else {
                    this.h.c(wc5Var);
                    this.Y = null;
                }
                m0();
                return;
            }
            if (xc5Var.s) {
                wc5 wc5Var3 = this.Z;
                if (wc5Var3 == null) {
                    wc5 wc5Var4 = new wc5(this.f.r.getContext(), "miniapps");
                    this.Z = wc5Var4;
                    this.h.a(wc5Var4);
                    this.Z.setOnClickListener(this);
                } else {
                    this.h.c(wc5Var3);
                    this.Z = null;
                }
                m0();
                return;
            }
            Object object = xc5Var.getObject();
            boolean z = object instanceof TLRPC.User;
            if (z) {
                j = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j = -((TLRPC.Chat) object).id;
            }
            vh6 vh6Var = this.K;
            if (vh6Var == null || vh6Var.h(j) < 0) {
                byte b2 = 2;
                if (xc5Var.P) {
                    int i3 = -this.m0;
                    this.m0 = i3;
                    gm.A3(i3, xc5Var, null);
                    xx0.E.a();
                    String r = j >= 0 ? m9c.r(oc7.r1(this.currentAccount).W1(Long.valueOf(j))) : "";
                    (oc7.r1(this.currentAccount).H3() ? c41.b0(this).Q(R.raw.star_premium_2, 36, gm.S2(jb6.a0(null, null, 2131743447, r))) : c41.b0(this).K(R.raw.star_premium_2, gm.S2(jb6.a0(null, null, 2131743447, r)), jb6.M0(2131743446, null), new dc5(this, b2))).j();
                    return;
                }
                wc5 wc5Var5 = (wc5) this.a0.f(j);
                if (wc5Var5 != null) {
                    this.h.c(wc5Var5);
                } else {
                    int i4 = this.L;
                    if (i4 != 0 && this.a0.m() == i4) {
                        return;
                    }
                    if (this.N == 0 && this.a0.m() == getMessagesController().O2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = jb6.M0(R.string.AppName, null);
                        he heVar2 = alertDialog$Builder.a;
                        heVar2.S = M0;
                        heVar2.U = jb6.M0(2131745028, null);
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        showDialog(heVar2);
                        return;
                    }
                    if (z) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (this.S && user.bot) {
                            if (j2 != 0) {
                                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j2));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                                boolean w = sd2.w(4, L0);
                                he heVar3 = alertDialog$Builder2.a;
                                if (w) {
                                    heVar3.S = jb6.M0(2131754458, null);
                                    heVar3.U = jb6.M0(2131754457, null);
                                    alertDialog$Builder2.j(jb6.M0(2131754463, null), new nv4(this, user, b2));
                                    alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
                                } else {
                                    heVar3.U = jb6.M0(2131752519, null);
                                    alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                                }
                                showDialog(heVar3);
                                return;
                            }
                            if (user.bot_nochats) {
                                try {
                                    c41.b0(this).t(jb6.M0(2131753073, null), null).j();
                                    return;
                                } catch (Exception e) {
                                    fc4.g(e, true);
                                    return;
                                }
                            }
                        }
                        getMessagesController().c4(user, !this.U, false);
                    } else if (object instanceof TLRPC.Chat) {
                        getMessagesController().V3((TLRPC.Chat) object, !this.U);
                    }
                    wc5 wc5Var6 = new wc5(this.f.r.getContext(), object);
                    this.h.a(wc5Var6);
                    wc5Var6.setOnClickListener(this);
                }
                x0();
                if (this.U || this.T) {
                    gm.E3(this.f.r);
                } else {
                    m0();
                }
                if (this.f.r.length() > 0) {
                    this.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    public final void q0(int i) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.a0.m(); i2++) {
            arrayList.add(getMessagesController().W1(Long.valueOf(this.a0.j(i2))));
        }
        ic5 ic5Var = this.y;
        if (ic5Var != null) {
            ic5Var.f(i, arrayList);
        }
        finishFragment();
    }

    public final boolean s0() {
        boolean i = this.a0.i();
        boolean z = this.S;
        int i2 = this.N;
        if (!i || i2 == 2 || !z) {
            long j = this.H;
            if (!z) {
                if (i2 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i3 = 0; i3 < this.a0.m(); i3++) {
                        arrayList.add(getMessagesController().p1(getMessagesController().W1(Long.valueOf(this.a0.j(i3)))));
                    }
                    oc7 messagesController = getMessagesController();
                    messagesController.getClass();
                    if (!arrayList.isEmpty()) {
                        TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = new TLRPC.TL_channels_inviteToChannel();
                        tL_channels_inviteToChannel.channel = messagesController.g1(j);
                        tL_channels_inviteToChannel.users = arrayList;
                        messagesController.getConnectionsManager().sendRequest(tL_channels_inviteToChannel, new jb7((Object) messagesController, (Object) tL_channels_inviteToChannel, j, (byte) 8));
                    }
                    getNotificationCenter().k(nm7.s, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new yv1(bundle), true);
                    return true;
                }
                if (this.F) {
                    if (z) {
                        q0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < this.a0.m(); i4++) {
                        arrayList2.add(Long.valueOf(this.a0.j(i4)));
                    }
                    if (this.P || this.Q) {
                        jc5 jc5Var = this.x;
                        if (jc5Var != null) {
                            jc5Var.a(arrayList2, this.Y != null, this.Z != null);
                        }
                        finishFragment();
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        jArr[i5] = ((Long) arrayList2.get(i5)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i2);
                    bundle2.putBoolean("forImport", this.O);
                    presentFragment(new uc5(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String G = jb6.G(this.a0.m(), "AddManyMembersAlertTitle", new Object[0]);
                he heVar = alertDialog$Builder.a;
                heVar.S = G;
                StringBuilder sb = new StringBuilder();
                for (int i6 = 0; i6 < this.a0.m(); i6++) {
                    TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.a0.j(i6)));
                    if (W1 != null) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append("**");
                        sb.append(bw2.m(0, W1.first_name, W1.last_name));
                        sb.append("**");
                    }
                }
                oc7 messagesController2 = getMessagesController();
                if (j == 0) {
                    j = this.I;
                }
                TLRPC.Chat L0 = messagesController2.L0(Long.valueOf(j));
                if (this.a0.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.G(this.a0.m(), "AddManyMembersAlertNamesText", L0 != null ? L0.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.a0.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new z5c(gm.o()), indexOf, format.length() + indexOf, 33);
                    }
                    heVar.U = spannableStringBuilder;
                } else {
                    heVar.U = gm.S2(jb6.a0(null, null, 2131754396, sb, L0 != null ? L0.title : ""));
                }
                oh2[] oh2VarArr = new oh2[1];
                boolean T = sd2.T(L0);
                byte b = 3;
                if (!T) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    oh2 oh2Var = new oh2(1, this.resourceProvider, getParentActivity());
                    oh2VarArr[0] = oh2Var;
                    oh2Var.setBackground(cmb.L0(false));
                    oh2VarArr[0].setMultiline(true);
                    if (this.a0.m() == 1) {
                        oh2VarArr[0].e(gm.S2(jb6.a0(null, null, 2131754390, m9c.k(getMessagesController().W1(Long.valueOf(this.a0.j(0))), true))), "", true, false, false);
                    } else {
                        oh2VarArr[0].e(jb6.M0(2131754395, null), "", true, false, false);
                    }
                    oh2VarArr[0].setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), 0, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), 0);
                    linearLayout.addView(oh2VarArr[0], qoe.o(-1, -2));
                    oh2VarArr[0].setOnClickListener(new ye(oh2VarArr, b));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.j(jb6.M0(2131754483, null), new nv4(this, oh2VarArr, b));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                showDialog(heVar);
                return true;
            }
        }
        return false;
    }

    public final void t0(ArrayList arrayList, boolean z, boolean z2) {
        HashSet hashSet = this.g0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.h0 = z;
        this.i0 = z2;
        fc5 fc5Var = this.h;
        if (fc5Var == null) {
            this.j0 = arrayList;
            this.k0 = z;
            this.l0 = z2;
            return;
        }
        wc5 wc5Var = this.Y;
        if (z) {
            if (wc5Var == null) {
                wc5 wc5Var2 = new wc5(getParentActivity(), "premium");
                this.Y = wc5Var2;
                this.h.a(wc5Var2);
                this.Y.setOnClickListener(this);
            }
        } else if (wc5Var != null) {
            fc5Var.c(wc5Var);
            this.Y = null;
        }
        wc5 wc5Var3 = this.Z;
        if (z2) {
            if (wc5Var3 == null) {
                wc5 wc5Var4 = new wc5(getParentActivity(), "miniApps");
                this.Z = wc5Var4;
                this.h.a(wc5Var4);
                this.Z.setOnClickListener(this);
            }
        } else if (wc5Var3 != null) {
            this.h.c(wc5Var3);
            this.Z = null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            long longValue = l.longValue();
            Object L0 = longValue < 0 ? getMessagesController().L0(Long.valueOf(-longValue)) : getMessagesController().W1(l);
            if (L0 != null) {
                wc5 wc5Var5 = new wc5(getParentActivity(), L0);
                this.h.a(wc5Var5);
                wc5Var5.setOnClickListener(this);
            }
        }
        rq4 rq4Var = this.h.d;
        AnimatorSet animatorSet = rq4Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            rq4Var.a.setupEndValues();
            rq4Var.a.cancel();
        }
        gm.V3(this.n);
    }

    public final void u0(int i) {
        if (this.isPaused) {
            return;
        }
        gm.K(this.n, new bm3((Object) this, i, (byte) 15));
    }

    public final void v0() {
        if (this.G == null) {
            return;
        }
        this.c.a(!this.a0.i(), true);
    }

    public final void w0() {
        mc5 mc5Var;
        l7 l7Var = this.f.r;
        if (l7Var == null) {
            return;
        }
        if (this.N == 2) {
            l7Var.setHint(jb6.M0(2131754393, null));
            return;
        }
        if (this.S || ((mc5Var = this.w) != null && mc5Var.H == 0)) {
            l7Var.setHint(jb6.M0(2131745503, null));
            return;
        }
        if (this.P || this.Q) {
            l7Var.setHint(jb6.M0(2131745502, null));
        } else if (this.R) {
            l7Var.setHint(jb6.M0(2131748044, null));
        } else {
            l7Var.setHint(jb6.M0(2131745329, null));
        }
    }

    public final void x0() {
        boolean z = this.P;
        int i = this.N;
        boolean z2 = this.S;
        if (!z && !this.Q && !z2) {
            if (i == 2) {
                this.actionBar.setSubtitle(jb6.G(this.a0.m(), "Members", new Object[0]));
            } else {
                boolean i2 = this.a0.i();
                int i3 = this.L;
                if (i2) {
                    this.actionBar.setSubtitle(jb6.a0(null, null, 2131748376, jb6.G(i3 + (this.R ? 1 : 0), "Members", new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(jb6.J0(this.a0.m(), "MembersCountSelected"), Integer.valueOf(this.a0.m()), Integer.valueOf(i3)));
                }
            }
        }
        if (i == 2 || !z2) {
            return;
        }
        if (this.F && this.b0.isEmpty()) {
            this.E.e(false, true);
            this.F = false;
        } else {
            if (this.F || this.b0.isEmpty()) {
                return;
            }
            this.E.e(true, true);
            this.F = true;
        }
    }

    public final void y0() {
        try {
            r59 r59Var = this.n;
            if (r59Var != null) {
                r59Var.x1();
                if (this.n.getFastScroll() != null) {
                    this.n.getFastScroll().invalidate();
                }
            }
            fc5 fc5Var = this.h;
            if (fc5Var == null || fc5Var.getSpansContainer() == null) {
                return;
            }
            ViewGroup spansContainer = this.h.getSpansContainer();
            for (int i = 0; i < spansContainer.getChildCount(); i++) {
                View childAt = spansContainer.getChildAt(i);
                if (childAt instanceof wc5) {
                    childAt.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // tyc
    public final void P() {
    }

    public void r0(HashSet hashSet) {
    }

    @Override // tyc
    public final void v() {
    }

    @Override // g94
    public final void V(float f, int i) {
    }
}
