// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class k91 extends d implements jm7 {
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ee0 I;
    public int J;
    public int K;
    public int L;
    public js M;
    public oo8 N;
    public yv1 O;
    public hg5 P;
    public int Q;
    public int R;
    public ValueAnimator S;
    public final SparseArray T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public final byte Y;
    public boolean Z;
    public z81 a;
    public final int a0;
    public fv b;
    public final int b0;
    public u46 c;
    public ec0 c0;
    public final TextPaint d;
    public int d0;
    public final TextPaint e;
    public boolean e0;
    public final TextPaint f;
    public int f0;
    public z3b g0;
    public TextView h;
    public k6d h0;
    public int i0;
    public xg0 j0;
    public a91 k0;
    public View l0;
    public final Path m0;
    public TextView n;
    public final rna n0;
    public int o0;
    public boolean p0;
    public int q0;
    public final Paint r;
    public int r0;
    public final Paint s;
    public int s0;
    public sb w;
    public final Paint x;
    public long y;

    /* JADX WARN: Multi-variable type inference failed */
    public k91(int i, int i2, Bundle bundle) {
        super(bundle);
        this.d = new TextPaint(1);
        this.e = new TextPaint(1);
        this.f = new TextPaint(1);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Paint(1);
        this.x = new Paint(1);
        this.T = new SparseArray();
        this.V = 0;
        this.m0 = new Path();
        this.n0 = new rna();
        this.Y = i;
        if (i2 != 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(i2 * 1000);
            this.a0 = calendar.get(1);
            this.b0 = calendar.get(2);
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gm.L(2.0f));
    }

    public final void A0(h91 h91Var, boolean z) {
        int i;
        int i2;
        if (this.Q == 0 || this.R == 0) {
            SparseArray sparseArray = h91Var.x;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                h91Var.a(sparseArray.keyAt(i3), 0, 0, false, z);
            }
            return;
        }
        if (h91Var.n != null) {
            if (!z) {
                SparseArray sparseArray2 = h91Var.x;
                for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                    h91Var.a(sparseArray2.keyAt(i4), 0, 0, false, false);
                }
            }
            int i5 = h91Var.e;
            int i6 = -1;
            int i7 = -1;
            int i8 = 0;
            for (int i9 = 0; i9 < h91Var.d; i9++) {
                i91 i91Var = (i91) h91Var.n.get(i9, null);
                if (i91Var != null && (i2 = i91Var.h) >= this.Q && i2 <= this.R) {
                    if (i6 == -1) {
                        i6 = i5;
                    }
                    i7 = i5;
                }
                i5++;
                if (i5 >= 7) {
                    if (i6 == -1 || i7 == -1) {
                        i = i8;
                        h91Var.a(i, 0, 0, false, z);
                    } else {
                        i = i8;
                        h91Var.a(i, i6, i7, true, z);
                    }
                    i8 = i + 1;
                    i6 = -1;
                    i7 = -1;
                    i5 = 0;
                }
            }
            int i10 = i8;
            if (i6 == -1 || i7 == -1) {
                h91Var.a(i10, 0, 0, false, z);
            } else {
                h91Var.a(i10, i6, i7, true, z);
            }
        }
    }

    public final void B0() {
        String M0;
        hg5 hg5Var;
        if (!this.e0) {
            this.simpleActionBar.setTitle(jb6.M0(2131752595, null));
            this.I.c(true, 0.0f);
            return;
        }
        int i = this.Q;
        int i2 = this.R;
        int abs = (i == i2 && i == 0) ? 0 : (Math.abs(i - i2) / 86400) + 1;
        boolean z = this.p0;
        int i3 = this.o0;
        if (abs == i3 && z == this.H) {
            return;
        }
        boolean z2 = i3 > abs;
        this.o0 = abs;
        boolean z3 = this.H;
        this.p0 = z3;
        if (abs > 0) {
            M0 = jb6.G(abs, "Days", new Object[0]);
            this.I.c(true, 1.0f);
        } else if (z3) {
            M0 = jb6.M0(2131745394, null);
            this.I.c(true, 1.0f);
        } else {
            M0 = jb6.M0(2131752595, null);
            this.I.c(true, 0.0f);
        }
        String str = M0;
        if (abs > 1) {
            this.n.setText(jb6.a0("ClearHistoryForTheseDays", null, 2131752024, new Object[0]));
        } else if (abs > 0 || this.H) {
            this.n.setText(jb6.a0("ClearHistoryForThisDay", null, 2131752023, new Object[0]));
        }
        this.c0.a((abs > 0 || this.H) ? this.n : this.h, true);
        rja rjaVar = this.simpleActionBar;
        rjaVar.getClass();
        rjaVar.I(str, z2, 150L, d53.h);
        if ((!this.H || abs > 0) && (hg5Var = this.P) != null) {
            hg5Var.f(true);
        }
        if (abs > 0 || this.H) {
            if (this.n.getVisibility() == 8) {
                this.n.setAlpha(0.0f);
                this.n.setTranslationY(-gm.L(20.0f));
            }
            this.n.setVisibility(0);
            this.h.animate().setListener(null).cancel();
            this.n.animate().setListener(null).cancel();
            this.h.animate().alpha(0.0f).translationY(gm.L(20.0f)).setDuration(150L).setListener(new jf4(this.h)).start();
            this.n.animate().alpha(abs == 0 ? 0.5f : 1.0f).translationY(0.0f).start();
            this.h.setEnabled(false);
            this.n.setEnabled(true);
            return;
        }
        if (this.h.getVisibility() == 8) {
            this.h.setAlpha(0.0f);
            this.h.setTranslationY(gm.L(20.0f));
        }
        this.h.setVisibility(0);
        this.h.animate().setListener(null).cancel();
        this.n.animate().setListener(null).cancel();
        this.h.animate().alpha(1.0f).translationY(0.0f).start();
        this.n.animate().alpha(0.0f).translationY(-gm.L(20.0f)).setDuration(150L).setListener(new jf4(this.n)).start();
        this.h.setEnabled(true);
        this.n.setEnabled(false);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        float L = gm.L(16.0f);
        TextPaint textPaint = this.d;
        textPaint.setTextSize(L);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        float L2 = gm.L(11.0f);
        TextPaint textPaint2 = this.f;
        textPaint2.setTextSize(L2);
        textPaint2.setTextAlign(align);
        textPaint2.setTypeface(gm.o());
        float L3 = gm.L(16.0f);
        TextPaint textPaint3 = this.e;
        textPaint3.setTextSize(L3);
        textPaint3.setTypeface(gm.o());
        textPaint3.setTextAlign(align);
        z81 z81Var = new z81(this, context);
        this.a = z81Var;
        z81Var.setBackgroundColor(getThemedColor(cmb.Z6));
        this.a.addView(this.simpleActionBar);
        this.simpleActionBar.setTitle(jb6.M0(2131752595, null));
        fv fvVar = new fv((byte) 4, context, (Object) this);
        this.b = fvVar;
        u46 u46Var = new u46();
        this.c = u46Var;
        fvVar.setLayoutManager(u46Var);
        final byte b = 1;
        this.c.j1(true);
        fv fvVar2 = this.b;
        js jsVar = new js(this, (byte) 2);
        this.M = jsVar;
        fvVar2.setAdapter(jsVar);
        this.b.j(new y(this, (byte) 13));
        final byte b2 = 0;
        boolean z = this.f0 == 0 && this.e0;
        this.a.addView(this.b, qoe.d(-1, -1.0f, 0, 0.0f, 36.0f, 0.0f, z ? 48.0f : 0.0f));
        a91 a91Var = new a91(this, context, new String[]{jb6.M0(2131752593, null), jb6.M0(2131752589, null), jb6.M0(2131752588, null), jb6.M0(2131752590, null), jb6.M0(2131752594, null), jb6.M0(2131752592, null), jb6.M0(2131752591, null)}, b2);
        this.k0 = a91Var;
        a91Var.setPadding(gm.L(4.0f), 0, gm.L(4.0f), 0);
        a91 a91Var2 = this.k0;
        im0 c = getBaseSimpleGlass().c.c(this.k0, null, false);
        c.p(qqd.l(this.resourceProvider));
        c.q(gm.L(9.66f));
        c.r(gm.L(18.0f));
        a91Var2.setBackground(c);
        this.k0.setTranslationY(eh0.d(0) - gm.L(9.66f));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 15));
        this.fragmentView = this.a;
        Calendar calendar = Calendar.getInstance();
        this.J = calendar.get(1);
        int i = calendar.get(2);
        this.K = i;
        int i2 = this.a0;
        if (i2 != 0) {
            int h = aq1.h(this.J, i2, 12, i) - this.b0;
            this.L = h + 1;
            this.c.g1(h, gm.L(120.0f));
        }
        if (this.L < 3) {
            this.L = 3;
        }
        ee0 ee0Var = new ee0(false);
        this.I = ee0Var;
        this.simpleActionBar.setBackButtonDrawable(ee0Var);
        this.I.c(false, 0.0f);
        w0();
        y0();
        textPaint3.setColor(-1);
        if (z) {
            this.c0 = new ec0(this, context);
            TextView textView = new TextView(context);
            this.h = textView;
            textView.setGravity(17);
            this.h.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
            this.h.setSingleLine();
            this.h.setTextSize(1, 15.0f);
            this.h.setTypeface(gm.o());
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: y81
                public final /* synthetic */ k91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (b2) {
                        case 0:
                            k91 k91Var = this.b;
                            k91Var.H = true;
                            k91Var.B0();
                            break;
                        default:
                            k91 k91Var2 = this.b;
                            int i3 = k91Var2.o0;
                            if (i3 != 0) {
                                ik.q(k91Var2, i3, k91Var2.getMessagesController().W1(Long.valueOf(k91Var2.y)), null, false, new nl9(k91Var2, (byte) 13), null);
                                break;
                            } else {
                                if (k91Var2.P == null) {
                                    hg5 hg5Var = new hg5(k91Var2.a.getContext(), 3);
                                    hg5Var.p(true);
                                    hg5Var.h = gm.L(310.0f);
                                    hg5Var.d = 2300L;
                                    hg5Var.U = true;
                                    hg5Var.e = true;
                                    hg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                                    hg5Var.v0 = -gm.L(10.0f);
                                    k91Var2.P = hg5Var;
                                    hg5Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                                    k91Var2.P.k(k91Var2.getBaseSimpleGlass().c);
                                    k91Var2.a.addView(k91Var2.P, qoe.e(-1, nm7.f2, 55));
                                    k91Var2.P.t(jb6.M0(2131745393, null));
                                }
                                k91Var2.P.x(k91Var2.c0, true);
                                break;
                            }
                    }
                }
            });
            this.h.setText(jb6.M0(2131745394, null));
            this.c0.addView(this.h, qoe.e(-2, 38, 17));
            TextView textView2 = new TextView(context);
            this.n = textView2;
            textView2.setGravity(17);
            this.n.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
            this.n.setSingleLine();
            this.n.setTextSize(1, 15.0f);
            this.n.setTypeface(gm.o());
            this.n.setOnClickListener(new View.OnClickListener(this) { // from class: y81
                public final /* synthetic */ k91 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (b) {
                        case 0:
                            k91 k91Var = this.b;
                            k91Var.H = true;
                            k91Var.B0();
                            break;
                        default:
                            k91 k91Var2 = this.b;
                            int i3 = k91Var2.o0;
                            if (i3 != 0) {
                                ik.q(k91Var2, i3, k91Var2.getMessagesController().W1(Long.valueOf(k91Var2.y)), null, false, new nl9(k91Var2, (byte) 13), null);
                                break;
                            } else {
                                if (k91Var2.P == null) {
                                    hg5 hg5Var = new hg5(k91Var2.a.getContext(), 3);
                                    hg5Var.p(true);
                                    hg5Var.h = gm.L(310.0f);
                                    hg5Var.d = 2300L;
                                    hg5Var.U = true;
                                    hg5Var.e = true;
                                    hg5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
                                    hg5Var.v0 = -gm.L(10.0f);
                                    k91Var2.P = hg5Var;
                                    hg5Var.setPadding(gm.L(8.0f), 0, gm.L(8.0f), 0);
                                    k91Var2.P.k(k91Var2.getBaseSimpleGlass().c);
                                    k91Var2.a.addView(k91Var2.P, qoe.e(-1, nm7.f2, 55));
                                    k91Var2.P.t(jb6.M0(2131745393, null));
                                }
                                k91Var2.P.x(k91Var2.c0, true);
                                break;
                            }
                    }
                }
            });
            this.n.setVisibility(8);
            this.c0.addView(this.n, qoe.e(-2, 38, 17));
            this.a.addView(this.c0, qoe.e(-1, 50, 80));
            this.c0.a(this.h, false);
            int L4 = gm.L(19.0f);
            TextView textView3 = this.h;
            int i3 = cmb.rf;
            anb.R(textView3, cmb.Y(on2.p(cmb.w0(null, i3, false), 51), L4, L4), null, anb.g(i3, 51), null);
            TextView textView4 = this.n;
            int i4 = cmb.p7;
            anb.R(textView4, cmb.Y(on2.p(cmb.w0(null, i4, false), 51), L4, L4), null, anb.g(i4, 51), null);
            anb.X(this.h, i3, null);
            anb.X(this.n, i4, null);
        }
        View view = new View(context);
        this.l0 = view;
        this.a.addView(view, qoe.e(-1, 0, 48));
        this.l0.getLayoutParams().height = gm.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        this.a.addView(this.k0, qoe.d(-1, 56.0f, 0, -4.0f, 0.0f, -4.0f, 0.0f));
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.B5 && this.g0 == ((z3b) objArr[0])) {
            z0();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        int i = cmb.a;
        int i2 = cmb.a;
        int i3 = cmb.a;
        return super.getThemeDescriptions();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return on2.h(cmb.w0(null, cmb.c6, true)) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!this.H) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.H = false;
            this.R = 0;
            this.Q = 0;
            B0();
            s0();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        this.y = getArguments().getLong("dialog_id");
        this.E = getArguments().getLong("topic_id");
        int i = getArguments().getInt(TeXSymbolParser.TYPE_ATTR);
        this.f0 = i;
        if (i == 2) {
            this.g0 = oc7.r1(this.currentAccount).N1().z(0, -1, this.y, true);
        } else if (i == 3) {
            this.g0 = oc7.r1(this.currentAccount).N1().z(1, -1, this.y, true);
        }
        z3b z3bVar = this.g0;
        if (z3bVar != null) {
            this.h0 = new k6d((Object) this, (byte) 15);
        }
        if (this.y >= 0) {
            this.e0 = true;
        } else {
            this.e0 = false;
        }
        if (z3bVar != null) {
            nm7.f(this.currentAccount).b(this, nm7.B5);
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.g0 != null) {
            nm7.f(this.currentAccount).n(this, nm7.B5);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.l0.getLayoutParams().height = gm.L(44.0f) + a.getCurrentActionBarHeight() + i2;
        this.k0.setTranslationY(eh0.d(i2) - gm.L(9.66f));
        u0(i2, i4);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        if (this.actionBar == null || this.I == null || this.d == null || this.f == null || this.e == null) {
            return;
        }
        int w0 = cmb.w0(null, cmb.c6, false);
        int w02 = cmb.w0(null, cmb.F6, false);
        int w03 = cmb.w0(null, cmb.h6, false);
        if (w0 == this.q0 && w02 == this.r0 && w03 == this.s0) {
            return;
        }
        this.q0 = w0;
        this.r0 = w02;
        this.s0 = w03;
        y0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        sb sbVar;
        if (z && (sbVar = this.w) != null && sbVar.getVisibility() == 0) {
            this.w.setVisibility(8);
            this.w.setBackground(null);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationProgress(boolean z, float f) {
        super.onTransitionAnimationProgress(z, f);
        sb sbVar = this.w;
        if (sbVar == null || sbVar.getVisibility() != 0) {
            return;
        }
        sb sbVar2 = this.w;
        if (z) {
            sbVar2.setAlpha(1.0f - f);
        } else {
            sbVar2.setAlpha(f);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.Z = true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.l0.setBackground(this.simpleActionBar.getBackground());
        this.simpleActionBar.setBackground(null);
        iq5 iq5Var = this.mSystemInsets;
        u0(iq5Var.b, iq5Var.d);
    }

    public final void s0() {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.setInterpolator(d53.f);
        duration.addUpdateListener(new f0(this, (byte) 24));
        duration.addListener(new b91((Object) this, (byte) 0));
        duration.start();
        this.S = duration;
        for (int i = 0; i < this.b.getChildCount(); i++) {
            A0((h91) this.b.getChildAt(i), true);
        }
        for (int i2 = 0; i2 < this.b.getCachedChildCount(); i2++) {
            h91 h91Var = (h91) this.b.P(i2);
            A0(h91Var, false);
            int i3 = this.Q;
            int i4 = this.R;
            int i5 = h91.E;
            h91Var.c(i3, i4);
            h91Var.b(1.0f);
        }
        for (int i6 = 0; i6 < this.b.getHiddenChildCount(); i6++) {
            h91 h91Var2 = (h91) this.b.W(i6);
            A0(h91Var2, false);
            int i7 = this.Q;
            int i8 = this.R;
            int i9 = h91.E;
            h91Var2.c(i7, i8);
            h91Var2.b(1.0f);
        }
        for (int i10 = 0; i10 < this.b.getAttachedScrapChildCount(); i10++) {
            h91 h91Var3 = (h91) this.b.O(i10);
            A0(h91Var3, false);
            int i11 = this.Q;
            int i12 = this.R;
            int i13 = h91.E;
            h91Var3.c(i11, i12);
            h91Var3.b(1.0f);
        }
    }

    public final void t0() {
        if (this.F || this.U) {
            return;
        }
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i2 = 0; i2 < this.b.getChildCount(); i2++) {
            View childAt = this.b.getChildAt(i2);
            if (childAt instanceof h91) {
                h91 h91Var = (h91) childAt;
                int i3 = (h91Var.b * 100) + h91Var.c;
                if (i3 < i) {
                    i = i3;
                }
            }
        }
        int i4 = this.X;
        if ((i4 % 100) + ((i4 / 100) * 12) + 3 >= (i % 100) + ((i / 100) * 12)) {
            w0();
        }
    }

    public final void u0(int i, int i2) {
        eh0.e(this.b, i, i2, gm.L(42.0f) + a.getCurrentActionBarHeight(), this.c0 != null ? gm.L(50.0f) : 0);
        ec0 ec0Var = this.c0;
        if (ec0Var != null) {
            ec0Var.setTranslationY((-i2) - gm.L(6.0f));
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final /* synthetic */ void v0(TLRPC.TL_error tL_error, TLObject tLObject, Calendar calendar) {
        SparseArray sparseArray;
        long j;
        long j2;
        if (tL_error == null) {
            TLRPC.TL_messages_searchResultsCalendar tL_messages_searchResultsCalendar = (TLRPC.TL_messages_searchResultsCalendar) tLObject;
            int i = 0;
            while (true) {
                int size = tL_messages_searchResultsCalendar.periods.size();
                sparseArray = this.T;
                j = 1000;
                if (i >= size) {
                    break;
                }
                calendar.setTimeInMillis(tL_messages_searchResultsCalendar.periods.get(i).date * 1000);
                int i2 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.put(i2, sparseArray2);
                }
                i91 i91Var = new i91();
                i91Var.a = new k47(this.currentAccount, tL_messages_searchResultsCalendar.messages.get(i), false, false);
                i91Var.h = (int) (calendar.getTimeInMillis() / 1000);
                int i3 = this.V + tL_messages_searchResultsCalendar.periods.get(i).count;
                this.V = i3;
                i91Var.c = i3;
                int i4 = calendar.get(5) - 1;
                if (sparseArray2.get(i4, null) == null || !((i91) sparseArray2.get(i4, null)).g) {
                    sparseArray2.put(i4, i91Var);
                }
                int i5 = this.X;
                if (i2 < i5 || i5 == 0) {
                    this.X = i2;
                }
                i++;
            }
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int i6 = tL_messages_searchResultsCalendar.min_date;
            this.d0 = i6;
            while (true) {
                calendar.setTimeInMillis(i6 * j);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                j2 = j;
                if (calendar.getTimeInMillis() / j > currentTimeMillis) {
                    break;
                }
                int i7 = calendar.get(2) + (calendar.get(1) * 100);
                SparseArray sparseArray3 = (SparseArray) sparseArray.get(i7);
                if (sparseArray3 == null) {
                    sparseArray3 = new SparseArray();
                    sparseArray.put(i7, sparseArray3);
                }
                int i8 = calendar.get(5) - 1;
                if (sparseArray3.get(i8, null) == null) {
                    i91 i91Var2 = new i91();
                    i91Var2.g = false;
                    i91Var2.h = (int) (calendar.getTimeInMillis() / j2);
                    sparseArray3.put(i8, i91Var2);
                }
                i6 += 86400;
                j = j2;
            }
            this.F = false;
            if (tL_messages_searchResultsCalendar.messages.isEmpty()) {
                this.U = true;
            } else {
                this.W = ((TLRPC.Message) b10.f(1, tL_messages_searchResultsCalendar.messages)).id;
                this.U = false;
                t0();
            }
            if (this.Z) {
                this.G = true;
            }
            this.b.invalidate();
            int timeInMillis = ((int) (((calendar.getTimeInMillis() / j2) - tL_messages_searchResultsCalendar.min_date) / 2629800)) + 1;
            this.M.l(0, this.L);
            int i9 = this.L;
            if (timeInMillis > i9) {
                this.M.p(i9 + 1, timeInMillis);
                this.L = timeInMillis;
            }
            if (this.U) {
                resumeDelayedFragmentAnimation();
            }
        }
    }

    public final void w0() {
        if (this.F || this.U) {
            return;
        }
        if (this.g0 != null) {
            z0();
            this.g0.p(100, false);
            this.F = this.g0.k();
            return;
        }
        this.F = true;
        TLRPC.TL_messages_getSearchResultsCalendar tL_messages_getSearchResultsCalendar = new TLRPC.TL_messages_getSearchResultsCalendar();
        byte b = this.Y;
        if (b == 1) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotos();
        } else if (b == 2) {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterVideo();
        } else {
            tL_messages_getSearchResultsCalendar.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
        }
        tL_messages_getSearchResultsCalendar.peer = getMessagesController().i1(this.y);
        if (this.E != 0 && this.y == getUserConfig().e()) {
            tL_messages_getSearchResultsCalendar.flags |= 4;
            tL_messages_getSearchResultsCalendar.saved_peer_id = getMessagesController().i1(this.E);
        }
        tL_messages_getSearchResultsCalendar.offset_id = this.W;
        Calendar calendar = Calendar.getInstance();
        this.b.setItemAnimator(null);
        getConnectionsManager().sendRequest(tL_messages_getSearchResultsCalendar, new pm(this, calendar, (byte) 9));
    }

    public final void x0() {
        if (this.w == null) {
            return;
        }
        int measuredWidth = (int) (this.parentLayout.getView().getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (this.parentLayout.getView().getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        this.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / nm7.J2));
        this.w.setBackground(new BitmapDrawable(createBitmap));
        this.w.setAlpha(0.0f);
        this.w.setVisibility(0);
    }

    public final void y0() {
        this.e.setColor(-1);
        int i = cmb.F6;
        this.d.setColor(cmb.w0(null, i, false));
        this.f.setColor(cmb.w0(null, i, false));
        this.I.a(cmb.w0(null, i, false));
    }

    public final void z0() {
        this.F = this.g0.k();
        Calendar calendar = Calendar.getInstance();
        SparseArray sparseArray = this.T;
        sparseArray.clear();
        this.d0 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        for (int i = 0; i < this.g0.i.size(); i++) {
            k47 k47Var = (k47) this.g0.i.get(i);
            this.d0 = Math.min(this.d0, k47Var.k.date);
            calendar.setTimeInMillis(k47Var.k.date * 1000);
            int i2 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(i2);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.put(i2, sparseArray2);
            }
            int i3 = calendar.get(5) - 1;
            i91 i91Var = (i91) sparseArray2.get(i3);
            if (i91Var == null) {
                i91Var = new i91();
                i91Var.b = new ArrayList();
            }
            i91Var.b.add(Integer.valueOf(k47Var.e1()));
            i91Var.a = k47Var;
            i91Var.h = (int) (calendar.getTimeInMillis() / 1000);
            sparseArray2.put(i3, i91Var);
            int i4 = this.X;
            if (i2 < i4 || i4 == 0) {
                this.X = i2;
            }
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        for (int i5 = this.d0; i5 < currentTimeMillis; i5 += 86400) {
            calendar.setTimeInMillis(i5 * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            int i6 = calendar.get(2) + (calendar.get(1) * 100);
            SparseArray sparseArray3 = (SparseArray) sparseArray.get(i6);
            if (sparseArray3 == null) {
                sparseArray3 = new SparseArray();
                sparseArray.put(i6, sparseArray3);
            }
            int i7 = calendar.get(5) - 1;
            if (sparseArray3.get(i7, null) == null) {
                i91 i91Var2 = new i91();
                i91Var2.g = false;
                i91Var2.h = (int) (calendar.getTimeInMillis() / 1000);
                sparseArray3.put(i7, i91Var2);
            }
        }
        this.U = this.g0.r;
        if (this.Z) {
            this.G = true;
        }
        this.b.invalidate();
        int timeInMillis = ((int) (((calendar.getTimeInMillis() / 1000) - this.d0) / 2629800)) + 1;
        this.M.l(0, this.L);
        int i8 = this.L;
        if (timeInMillis > i8) {
            this.M.p(i8 + 1, timeInMillis);
            this.L = timeInMillis;
        }
        if (this.U) {
            resumeDelayedFragmentAnimation();
        }
    }
}
