// default package

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cm6 extends d implements gha, el4, jm7 {
    public boolean E;
    public boolean F;
    public int G;
    public a8 H;
    public a8 I;
    public a8 J;
    public ej6 K;
    public final qz4[] L;
    public int M;
    public FrameLayout N;
    public b61 O;
    public fn0 P;
    public View Q;
    public yl6 R;
    public bm6 S;
    public int T;
    public String U;
    public int V;
    public int a;
    public fha b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public zja s;
    public SparseArray w;
    public a8 x;
    public a8 y;

    public cm6(Bundle bundle, fha fhaVar) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new qz4[2];
        this.M = -1;
        this.b = fhaVar;
    }

    @Override // el4
    public final List C() {
        Activity parentActivity = getParentActivity();
        np3 np3Var = hba.m;
        return Arrays.asList(new dl4((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new xl6(this, (byte) 1)));
    }

    @Override // gha
    public final void Q() {
        fha fhaVar;
        bm6 bm6Var = this.S;
        if (bm6Var != null && (fhaVar = this.b) != null) {
            bm6Var.setNewMediaCounts(fhaVar.c);
        }
        f0();
    }

    public final void b0() {
        if (this.S == null) {
            return;
        }
        int i = 0;
        int L = this.K != null ? gm.L(72.0f) : 0;
        bm6 bm6Var = this.S;
        int currentActionBarHeight = a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = nha.t2;
        bm6Var.i1(eh0.d(currentActionBarHeight - a.getCurrentActionBarHeight()) - gm.L(6.666f), eh0.c(this.mSystemInsets.b), eh0.c(this.mSystemInsets.d + L), this.mSystemInsets.d + L);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + gm.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            if (this.Q.getLayoutParams().height != topPanelShift) {
                this.Q.getLayoutParams().height = topPanelShift;
                this.Q.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i2 = this.mSystemInsets.d;
            layoutParams.height = i2 + L;
            View view2 = this.navigationBarFadeView;
            if (i2 < gm.L(40.0f) && L <= 0) {
                i = 8;
            }
            view2.setVisibility(i);
            this.navigationBarFadeView.requestLayout();
        }
        c0();
    }

    public final void c0() {
        if (this.K == null) {
            return;
        }
        float f = this.P.e;
        float L = gm.L(72.0f) + this.mSystemInsets.d;
        this.K.setTranslationY((L * f) + (-r2));
        float f2 = 1.0f - f;
        this.K.setAlpha(f2);
        this.K.setVisibility(f < 1.0f ? 0 : 4);
        this.N.setTranslationY((L * f2) + (-this.mSystemInsets.d));
        this.N.setAlpha(f);
        this.N.setVisibility(f > 0.0f ? 0 : 4);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean canBeginSlide() {
        if (this.S.u0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        eh0 eh0Var;
        int i;
        setHasOwnBackground(true);
        final byte b = 0;
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 9));
        ne6 ne6Var = new ne6((byte) 3, context, this);
        this.fragmentView = ne6Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().E1().b && getMessagesController().E1().e()) {
            this.T = 11;
        }
        eh0 baseSimpleGlass = getBaseSimpleGlass();
        bm6 bm6Var = new bm6(this, context, this.e, this.b, this.c, this.d, this.T, this, new am6(this), getResourceProvider(), baseSimpleGlass.c);
        this.S = bm6Var;
        bm6Var.setOnTopPanelShiftChanged(new xl6(this, b));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        ne6Var.addView(this.S, qoe.c(-1.0f, -1));
        byte b2 = 10;
        if (d0()) {
            zja a = this.simpleActionBar.t().a(0, R.drawable.ic_ab_other);
            this.s = a;
            a.setContentDescription(jb6.M0(2131754838, null));
            this.s.Y(false, false);
            a8 e = this.s.e(8, R.drawable.msg_zoomin, jb6.M0(2131748407, null));
            this.I = e;
            e.setOnClickListener(new View.OnClickListener(this) { // from class: zl6
                public final /* synthetic */ cm6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z3b z3bVar;
                    z3b z3bVar2;
                    z3b z3bVar3;
                    z3b z3bVar4;
                    int i2;
                    byte b3 = b;
                    xx0 xx0Var = xx0.E;
                    cm6 cm6Var = this.b;
                    switch (b3) {
                        case 0:
                            Boolean O1 = cm6Var.S.O1(null, null);
                            if (O1 != null) {
                                cm6Var.h0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = cm6Var.S.P1(null, null);
                            if (P1 != null) {
                                cm6Var.h0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = cm6Var.E;
                            if (z && !cm6Var.F) {
                                xx0Var.a();
                                a8 a8Var = cm6Var.x;
                                int i3 = -cm6Var.G;
                                cm6Var.G = i3;
                                gm.A3(i3, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = cm6Var.x;
                                boolean z2 = !z;
                                cm6Var.E = z2;
                                a8Var2.setChecked(z2);
                                bm6 bm6Var2 = cm6Var.S;
                                boolean z3 = cm6Var.E;
                                boolean z4 = cm6Var.F;
                                xfa xfaVar = bm6Var2.f0;
                                if (xfaVar != null && (z3bVar2 = xfaVar.s) != null) {
                                    z3bVar2.n = z3;
                                    z3bVar2.o = z4;
                                    z3bVar2.d(true);
                                }
                                jea jeaVar = bm6Var2.h0;
                                if (jeaVar != null && (z3bVar = jeaVar.s) != null) {
                                    z3bVar.n = z3;
                                    z3bVar.o = z4;
                                    z3bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = cm6Var.F;
                            if (z5 && !cm6Var.E) {
                                xx0Var.a();
                                a8 a8Var3 = cm6Var.y;
                                int i4 = -cm6Var.G;
                                cm6Var.G = i4;
                                gm.A3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = cm6Var.y;
                                boolean z6 = !z5;
                                cm6Var.F = z6;
                                a8Var4.setChecked(z6);
                                bm6 bm6Var3 = cm6Var.S;
                                boolean z7 = cm6Var.E;
                                boolean z8 = cm6Var.F;
                                xfa xfaVar2 = bm6Var3.f0;
                                if (xfaVar2 != null && (z3bVar4 = xfaVar2.s) != null) {
                                    z3bVar4.n = z7;
                                    z3bVar4.o = z8;
                                    z3bVar4.d(true);
                                }
                                jea jeaVar2 = bm6Var3.h0;
                                if (jeaVar2 != null && (z3bVar3 = jeaVar2.s) != null) {
                                    z3bVar3.n = z7;
                                    z3bVar3.o = z8;
                                    z3bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            cm6 cm6Var2 = this.b;
                            yl6 yl6Var = cm6Var2.R;
                            if (yl6Var != null) {
                                yl6Var.run();
                                cm6Var2.R = null;
                            }
                            u31.e();
                            byte b4 = 0;
                            boolean z9 = cm6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (cm6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < cm6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k47) cm6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            cm6Var2.S.E(false);
                            if (z9) {
                                cm6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                cm6Var2.getMessagesController().N1().q0(cm6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                cm6Var2.R = new yl6(cm6Var2, arrayList, z9, b4);
                                d65 d65Var = new d65(cm6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? c41.b0(cm6Var2).L(R.raw.contact_check, jb6.G(i2, "StorySavedTitle", new Object[0]), jb6.M0(2131744170, null), jb6.M0(2131743574, null), d65Var).j() : c41.b0(cm6Var2).J(R.raw.chats_archived, jb6.G(i2, "StoryArchived", new Object[0]), jb6.M0(2131743574, null), 5000, false, d65Var).j()).w = new lj6((Object) cm6Var2, (Object) zArr2, (byte) 2);
                                break;
                            }
                            break;
                    }
                }
            });
            a8 e2 = this.s.e(9, R.drawable.msg_zoomout, jb6.M0(2131748406, null));
            this.J = e2;
            e2.setOnClickListener(new View.OnClickListener(this) { // from class: zl6
                public final /* synthetic */ cm6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z3b z3bVar;
                    z3b z3bVar2;
                    z3b z3bVar3;
                    z3b z3bVar4;
                    int i2;
                    byte b3 = r2;
                    xx0 xx0Var = xx0.E;
                    cm6 cm6Var = this.b;
                    switch (b3) {
                        case 0:
                            Boolean O1 = cm6Var.S.O1(null, null);
                            if (O1 != null) {
                                cm6Var.h0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = cm6Var.S.P1(null, null);
                            if (P1 != null) {
                                cm6Var.h0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = cm6Var.E;
                            if (z && !cm6Var.F) {
                                xx0Var.a();
                                a8 a8Var = cm6Var.x;
                                int i3 = -cm6Var.G;
                                cm6Var.G = i3;
                                gm.A3(i3, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = cm6Var.x;
                                boolean z2 = !z;
                                cm6Var.E = z2;
                                a8Var2.setChecked(z2);
                                bm6 bm6Var2 = cm6Var.S;
                                boolean z3 = cm6Var.E;
                                boolean z4 = cm6Var.F;
                                xfa xfaVar = bm6Var2.f0;
                                if (xfaVar != null && (z3bVar2 = xfaVar.s) != null) {
                                    z3bVar2.n = z3;
                                    z3bVar2.o = z4;
                                    z3bVar2.d(true);
                                }
                                jea jeaVar = bm6Var2.h0;
                                if (jeaVar != null && (z3bVar = jeaVar.s) != null) {
                                    z3bVar.n = z3;
                                    z3bVar.o = z4;
                                    z3bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = cm6Var.F;
                            if (z5 && !cm6Var.E) {
                                xx0Var.a();
                                a8 a8Var3 = cm6Var.y;
                                int i4 = -cm6Var.G;
                                cm6Var.G = i4;
                                gm.A3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = cm6Var.y;
                                boolean z6 = !z5;
                                cm6Var.F = z6;
                                a8Var4.setChecked(z6);
                                bm6 bm6Var3 = cm6Var.S;
                                boolean z7 = cm6Var.E;
                                boolean z8 = cm6Var.F;
                                xfa xfaVar2 = bm6Var3.f0;
                                if (xfaVar2 != null && (z3bVar4 = xfaVar2.s) != null) {
                                    z3bVar4.n = z7;
                                    z3bVar4.o = z8;
                                    z3bVar4.d(true);
                                }
                                jea jeaVar2 = bm6Var3.h0;
                                if (jeaVar2 != null && (z3bVar3 = jeaVar2.s) != null) {
                                    z3bVar3.n = z7;
                                    z3bVar3.o = z8;
                                    z3bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            cm6 cm6Var2 = this.b;
                            yl6 yl6Var = cm6Var2.R;
                            if (yl6Var != null) {
                                yl6Var.run();
                                cm6Var2.R = null;
                            }
                            u31.e();
                            byte b4 = 0;
                            boolean z9 = cm6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (cm6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < cm6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k47) cm6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            cm6Var2.S.E(false);
                            if (z9) {
                                cm6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                cm6Var2.getMessagesController().N1().q0(cm6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                cm6Var2.R = new yl6(cm6Var2, arrayList, z9, b4);
                                d65 d65Var = new d65(cm6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? c41.b0(cm6Var2).L(R.raw.contact_check, jb6.G(i2, "StorySavedTitle", new Object[0]), jb6.M0(2131744170, null), jb6.M0(2131743574, null), d65Var).j() : c41.b0(cm6Var2).J(R.raw.chats_archived, jb6.G(i2, "StoryArchived", new Object[0]), jb6.M0(2131743574, null), 5000, false, d65Var).j()).w = new lj6((Object) cm6Var2, (Object) zArr2, (byte) 2);
                                break;
                            }
                            break;
                    }
                }
            });
            a8 e3 = this.s.e(10, R.drawable.msg_calendar2, jb6.M0(2131752595, null));
            this.H = e3;
            e3.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.s.a(-1);
            zja zjaVar = this.s;
            a8 d = zjaVar.d(6, 0, null, jb6.M0(2131748410, null), true, true, zjaVar.n0);
            this.x = d;
            d.setChecked(this.E);
            final byte b3 = 2;
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: zl6
                public final /* synthetic */ cm6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z3b z3bVar;
                    z3b z3bVar2;
                    z3b z3bVar3;
                    z3b z3bVar4;
                    int i2;
                    byte b32 = b3;
                    xx0 xx0Var = xx0.E;
                    cm6 cm6Var = this.b;
                    switch (b32) {
                        case 0:
                            Boolean O1 = cm6Var.S.O1(null, null);
                            if (O1 != null) {
                                cm6Var.h0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = cm6Var.S.P1(null, null);
                            if (P1 != null) {
                                cm6Var.h0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = cm6Var.E;
                            if (z && !cm6Var.F) {
                                xx0Var.a();
                                a8 a8Var = cm6Var.x;
                                int i3 = -cm6Var.G;
                                cm6Var.G = i3;
                                gm.A3(i3, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = cm6Var.x;
                                boolean z2 = !z;
                                cm6Var.E = z2;
                                a8Var2.setChecked(z2);
                                bm6 bm6Var2 = cm6Var.S;
                                boolean z3 = cm6Var.E;
                                boolean z4 = cm6Var.F;
                                xfa xfaVar = bm6Var2.f0;
                                if (xfaVar != null && (z3bVar2 = xfaVar.s) != null) {
                                    z3bVar2.n = z3;
                                    z3bVar2.o = z4;
                                    z3bVar2.d(true);
                                }
                                jea jeaVar = bm6Var2.h0;
                                if (jeaVar != null && (z3bVar = jeaVar.s) != null) {
                                    z3bVar.n = z3;
                                    z3bVar.o = z4;
                                    z3bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = cm6Var.F;
                            if (z5 && !cm6Var.E) {
                                xx0Var.a();
                                a8 a8Var3 = cm6Var.y;
                                int i4 = -cm6Var.G;
                                cm6Var.G = i4;
                                gm.A3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = cm6Var.y;
                                boolean z6 = !z5;
                                cm6Var.F = z6;
                                a8Var4.setChecked(z6);
                                bm6 bm6Var3 = cm6Var.S;
                                boolean z7 = cm6Var.E;
                                boolean z8 = cm6Var.F;
                                xfa xfaVar2 = bm6Var3.f0;
                                if (xfaVar2 != null && (z3bVar4 = xfaVar2.s) != null) {
                                    z3bVar4.n = z7;
                                    z3bVar4.o = z8;
                                    z3bVar4.d(true);
                                }
                                jea jeaVar2 = bm6Var3.h0;
                                if (jeaVar2 != null && (z3bVar3 = jeaVar2.s) != null) {
                                    z3bVar3.n = z7;
                                    z3bVar3.o = z8;
                                    z3bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            cm6 cm6Var2 = this.b;
                            yl6 yl6Var = cm6Var2.R;
                            if (yl6Var != null) {
                                yl6Var.run();
                                cm6Var2.R = null;
                            }
                            u31.e();
                            byte b4 = 0;
                            boolean z9 = cm6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (cm6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < cm6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k47) cm6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            cm6Var2.S.E(false);
                            if (z9) {
                                cm6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                cm6Var2.getMessagesController().N1().q0(cm6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                cm6Var2.R = new yl6(cm6Var2, arrayList, z9, b4);
                                d65 d65Var = new d65(cm6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? c41.b0(cm6Var2).L(R.raw.contact_check, jb6.G(i2, "StorySavedTitle", new Object[0]), jb6.M0(2131744170, null), jb6.M0(2131743574, null), d65Var).j() : c41.b0(cm6Var2).J(R.raw.chats_archived, jb6.G(i2, "StoryArchived", new Object[0]), jb6.M0(2131743574, null), 5000, false, d65Var).j()).w = new lj6((Object) cm6Var2, (Object) zArr2, (byte) 2);
                                break;
                            }
                            break;
                    }
                }
            });
            zja zjaVar2 = this.s;
            a8 d2 = zjaVar2.d(7, 0, null, jb6.M0(2131748409, null), true, true, zjaVar2.n0);
            this.y = d2;
            d2.setChecked(this.F);
            final byte b4 = 3;
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: zl6
                public final /* synthetic */ cm6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z3b z3bVar;
                    z3b z3bVar2;
                    z3b z3bVar3;
                    z3b z3bVar4;
                    int i2;
                    byte b32 = b4;
                    xx0 xx0Var = xx0.E;
                    cm6 cm6Var = this.b;
                    switch (b32) {
                        case 0:
                            Boolean O1 = cm6Var.S.O1(null, null);
                            if (O1 != null) {
                                cm6Var.h0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = cm6Var.S.P1(null, null);
                            if (P1 != null) {
                                cm6Var.h0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = cm6Var.E;
                            if (z && !cm6Var.F) {
                                xx0Var.a();
                                a8 a8Var = cm6Var.x;
                                int i3 = -cm6Var.G;
                                cm6Var.G = i3;
                                gm.A3(i3, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = cm6Var.x;
                                boolean z2 = !z;
                                cm6Var.E = z2;
                                a8Var2.setChecked(z2);
                                bm6 bm6Var2 = cm6Var.S;
                                boolean z3 = cm6Var.E;
                                boolean z4 = cm6Var.F;
                                xfa xfaVar = bm6Var2.f0;
                                if (xfaVar != null && (z3bVar2 = xfaVar.s) != null) {
                                    z3bVar2.n = z3;
                                    z3bVar2.o = z4;
                                    z3bVar2.d(true);
                                }
                                jea jeaVar = bm6Var2.h0;
                                if (jeaVar != null && (z3bVar = jeaVar.s) != null) {
                                    z3bVar.n = z3;
                                    z3bVar.o = z4;
                                    z3bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = cm6Var.F;
                            if (z5 && !cm6Var.E) {
                                xx0Var.a();
                                a8 a8Var3 = cm6Var.y;
                                int i4 = -cm6Var.G;
                                cm6Var.G = i4;
                                gm.A3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = cm6Var.y;
                                boolean z6 = !z5;
                                cm6Var.F = z6;
                                a8Var4.setChecked(z6);
                                bm6 bm6Var3 = cm6Var.S;
                                boolean z7 = cm6Var.E;
                                boolean z8 = cm6Var.F;
                                xfa xfaVar2 = bm6Var3.f0;
                                if (xfaVar2 != null && (z3bVar4 = xfaVar2.s) != null) {
                                    z3bVar4.n = z7;
                                    z3bVar4.o = z8;
                                    z3bVar4.d(true);
                                }
                                jea jeaVar2 = bm6Var3.h0;
                                if (jeaVar2 != null && (z3bVar3 = jeaVar2.s) != null) {
                                    z3bVar3.n = z7;
                                    z3bVar3.o = z8;
                                    z3bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            cm6 cm6Var2 = this.b;
                            yl6 yl6Var = cm6Var2.R;
                            if (yl6Var != null) {
                                yl6Var.run();
                                cm6Var2.R = null;
                            }
                            u31.e();
                            byte b42 = 0;
                            boolean z9 = cm6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (cm6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < cm6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k47) cm6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            cm6Var2.S.E(false);
                            if (z9) {
                                cm6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                cm6Var2.getMessagesController().N1().q0(cm6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                cm6Var2.R = new yl6(cm6Var2, arrayList, z9, b42);
                                d65 d65Var = new d65(cm6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? c41.b0(cm6Var2).L(R.raw.contact_check, jb6.G(i2, "StorySavedTitle", new Object[0]), jb6.M0(2131744170, null), jb6.M0(2131743574, null), d65Var).j() : c41.b0(cm6Var2).J(R.raw.chats_archived, jb6.G(i2, "StoryArchived", new Object[0]), jb6.M0(2131743574, null), 5000, false, d65Var).j()).w = new lj6((Object) cm6Var2, (Object) zArr2, (byte) 2);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        int i2 = this.a;
        qz4[] qz4VarArr = this.L;
        if (i2 == 1) {
            ej6 ej6Var = new ej6(context, getResourceProvider());
            this.K = ej6Var;
            ej6Var.setClipChildren(false);
            this.K.setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(12.0f));
            qz4VarArr[0] = qz4.c(context, getResourceProvider(), pz4.Q, 2131746384);
            qz4VarArr[1] = qz4.c(context, getResourceProvider(), pz4.R, 2131746360);
            for (int i3 = 0; i3 < qz4VarArr.length; i3++) {
                qz4VarArr[i3].setOnClickListener(new v0(this, i3, b2));
                this.K.addView(qz4VarArr[i3]);
                this.K.j(qz4VarArr[i3], true, false);
            }
            eh0Var = baseSimpleGlass;
            im0 c = eh0Var.c.c(this.K, qqd.g(getResourceProvider()), false);
            wi8.r(c, gm.L(28.0f), 7.666f);
            this.K.setBackground(c);
            ne6Var.addView(this.K, qoe.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(gm.L(16.0f), gm.L(8.0f), gm.L(16.0f), gm.L(8.0f));
            b61 b61Var = new b61(getResourceProvider(), context, true);
            this.O = b61Var;
            b61Var.i(jb6.M0(2131745643, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            final byte b5 = 4;
            this.O.setOnClickListener(new View.OnClickListener(this) { // from class: zl6
                public final /* synthetic */ cm6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z3b z3bVar;
                    z3b z3bVar2;
                    z3b z3bVar3;
                    z3b z3bVar4;
                    int i22;
                    byte b32 = b5;
                    xx0 xx0Var = xx0.E;
                    cm6 cm6Var = this.b;
                    switch (b32) {
                        case 0:
                            Boolean O1 = cm6Var.S.O1(null, null);
                            if (O1 != null) {
                                cm6Var.h0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = cm6Var.S.P1(null, null);
                            if (P1 != null) {
                                cm6Var.h0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = cm6Var.E;
                            if (z && !cm6Var.F) {
                                xx0Var.a();
                                a8 a8Var = cm6Var.x;
                                int i32 = -cm6Var.G;
                                cm6Var.G = i32;
                                gm.A3(i32, a8Var, null);
                                break;
                            } else {
                                a8 a8Var2 = cm6Var.x;
                                boolean z2 = !z;
                                cm6Var.E = z2;
                                a8Var2.setChecked(z2);
                                bm6 bm6Var2 = cm6Var.S;
                                boolean z3 = cm6Var.E;
                                boolean z4 = cm6Var.F;
                                xfa xfaVar = bm6Var2.f0;
                                if (xfaVar != null && (z3bVar2 = xfaVar.s) != null) {
                                    z3bVar2.n = z3;
                                    z3bVar2.o = z4;
                                    z3bVar2.d(true);
                                }
                                jea jeaVar = bm6Var2.h0;
                                if (jeaVar != null && (z3bVar = jeaVar.s) != null) {
                                    z3bVar.n = z3;
                                    z3bVar.o = z4;
                                    z3bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = cm6Var.F;
                            if (z5 && !cm6Var.E) {
                                xx0Var.a();
                                a8 a8Var3 = cm6Var.y;
                                int i4 = -cm6Var.G;
                                cm6Var.G = i4;
                                gm.A3(i4, a8Var3, null);
                                break;
                            } else {
                                a8 a8Var4 = cm6Var.y;
                                boolean z6 = !z5;
                                cm6Var.F = z6;
                                a8Var4.setChecked(z6);
                                bm6 bm6Var3 = cm6Var.S;
                                boolean z7 = cm6Var.E;
                                boolean z8 = cm6Var.F;
                                xfa xfaVar2 = bm6Var3.f0;
                                if (xfaVar2 != null && (z3bVar4 = xfaVar2.s) != null) {
                                    z3bVar4.n = z7;
                                    z3bVar4.o = z8;
                                    z3bVar4.d(true);
                                }
                                jea jeaVar2 = bm6Var3.h0;
                                if (jeaVar2 != null && (z3bVar3 = jeaVar2.s) != null) {
                                    z3bVar3.n = z7;
                                    z3bVar3.o = z8;
                                    z3bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            cm6 cm6Var2 = this.b;
                            yl6 yl6Var = cm6Var2.R;
                            if (yl6Var != null) {
                                yl6Var.run();
                                cm6Var2.R = null;
                            }
                            u31.e();
                            byte b42 = 0;
                            boolean z9 = cm6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (cm6Var2.w != null) {
                                i22 = 0;
                                for (int i5 = 0; i5 < cm6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((k47) cm6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i22++;
                                    }
                                }
                            } else {
                                i22 = 0;
                            }
                            cm6Var2.S.E(false);
                            if (z9) {
                                cm6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                cm6Var2.getMessagesController().N1().q0(cm6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                cm6Var2.R = new yl6(cm6Var2, arrayList, z9, b42);
                                d65 d65Var = new d65(cm6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? c41.b0(cm6Var2).L(R.raw.contact_check, jb6.G(i22, "StorySavedTitle", new Object[0]), jb6.M0(2131744170, null), jb6.M0(2131743574, null), d65Var).j() : c41.b0(cm6Var2).J(R.raw.chats_archived, jb6.G(i22, "StoryArchived", new Object[0]), jb6.M0(2131743574, null), 5000, false, d65Var).j()).w = new lj6((Object) cm6Var2, (Object) zArr2, (byte) 2);
                                break;
                            }
                            break;
                    }
                }
            });
            this.N.addView(this.O, qoe.c(56.0f, -1));
            this.N.setVisibility(4);
            ne6Var.addView(this.N, qoe.e(-1, 72, 80));
            this.P = new fn0(0, new cj6(this, r13), d53.h, 320L, false);
            setBulletinDelegate(new s20(this, (byte) 12));
        } else {
            eh0Var = baseSimpleGlass;
        }
        View view = new View(context);
        this.Q = view;
        this.S.e(view);
        View view2 = this.Q;
        view2.setBackground(eh0Var.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(eh0Var.b(view3));
        View view4 = this.navigationBarFadeView;
        ej6 ej6Var2 = this.K;
        ne6Var.addView(view4, ej6Var2 != null ? ne6Var.indexOfChild(ej6Var2) : ne6Var.getChildCount(), qoe.e(-1, 0, 80));
        eh0Var.g(ne6Var, this.simpleActionBar, getResourceProvider());
        eh0Var.o = new dh0(this, ne6Var, (byte) 6);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        g0(false);
        if (this.a == 3 && (i = this.r) != -1) {
            this.simpleActionBar.setSubtitle(jb6.H(' ', "FoundStories", i));
        }
        b0();
        f0();
        if (this.a == 1) {
            r13 = this.T != 9 ? (byte) 0 : (byte) 1;
            ej6 ej6Var3 = this.K;
            if (ej6Var3 != null && this.M != r13) {
                this.M = r13;
                ej6Var3.r(qz4VarArr[r13], false);
            }
        }
        return ne6Var;
    }

    public final boolean d0() {
        int i = this.a;
        return i == 1 || i == 2;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.E0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            bm6 bm6Var = this.S;
            if (bm6Var != null) {
                bm6Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    public final void f0() {
        int i;
        bm6 bm6Var = this.S;
        if (bm6Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = bm6Var.getClosestTab();
        if (this.a != 3 || closestTab == 8) {
            int[] iArr = this.b.c;
            boolean z = jb6.a0;
            if (closestTab == 8 || closestTab == 9) {
                a8 a8Var = this.J;
                if (a8Var != null) {
                    a8Var.setEnabled(this.S.t());
                    a8 a8Var2 = this.J;
                    a8Var2.setAlpha(a8Var2.isEnabled() ? 1.0f : 0.5f);
                }
                a8 a8Var3 = this.I;
                if (a8Var3 != null) {
                    a8Var3.setEnabled(this.S.s());
                    a8 a8Var4 = this.I;
                    a8Var4.setAlpha(a8Var4.isEnabled() ? 1.0f : 0.5f);
                }
                int W = this.S.W(closestTab);
                if (this.a == 3) {
                    if (W > 0) {
                        e0(jb6.H(' ', "FoundStories", W));
                    }
                } else if (closestTab == 8) {
                    e0(W > 0 ? jb6.G(W, "ProfileMyStoriesCount", new Object[0]) : null);
                } else {
                    e0(W > 0 ? jb6.G(W, "ProfileStoriesArchiveCount", new Object[0]) : null);
                }
                g0(true);
                zja zjaVar = this.s;
                if (zjaVar != null) {
                    zjaVar.Y(W > 0, true);
                }
                b61 b61Var = this.O;
                if (b61Var != null) {
                    boolean z2 = !z && this.V == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.w;
                        b61Var.i(jb6.G(sparseArray == null ? 0 : sparseArray.size(), "ArchiveStories", new Object[0]), z2, true);
                    } else {
                        b61Var.i(jb6.M0(2131745643, null), z2, true);
                    }
                    this.V = closestTab;
                }
                a8 a8Var5 = this.H;
                if (a8Var5 != null) {
                    boolean z3 = W > 0;
                    a8Var5.setEnabled(z3);
                    this.H.setAlpha(z3 ? 1.0f : 0.5f);
                    return;
                }
                return;
            }
            if (closestTab == 11) {
                e0(jb6.G(getMessagesController().E1().c(), "SavedDialogsTabCount", new Object[0]));
                return;
            }
            if (closestTab >= 0) {
                if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                    if (closestTab == 0) {
                        if (this.S.getPhotosVideosTypeFilter() == 1) {
                            e0(jb6.G(iArr[6], "Photos", new Object[0]));
                            return;
                        } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                            e0(jb6.G(iArr[7], "Videos", new Object[0]));
                            return;
                        } else {
                            e0(jb6.G(iArr[0], "Media", new Object[0]));
                            return;
                        }
                    }
                    if (closestTab == 1) {
                        e0(jb6.G(iArr[1], "Files", new Object[0]));
                        return;
                    }
                    if (closestTab == 2) {
                        e0(jb6.G(iArr[2], "Voice", new Object[0]));
                        return;
                    }
                    if (closestTab == 3) {
                        e0(jb6.G(iArr[3], "Links", new Object[0]));
                        return;
                    }
                    if (closestTab == 4) {
                        e0(jb6.G(iArr[4], "MusicFiles", new Object[0]));
                        return;
                    }
                    if (closestTab == 5) {
                        e0(jb6.G(iArr[5], "GIFs", new Object[0]));
                        return;
                    }
                    if (closestTab == 15 && (i = iArr[8]) >= 0) {
                        e0(jb6.G(i, "ProfilePollsCount", new Object[0]));
                    } else if (closestTab == 10) {
                        qb7 K0 = oc7.r1(this.currentAccount).K0(this.e);
                        e0(jb6.G(K0 == null ? 0 : K0.b.size() + K0.c, "Channels", new Object[0]));
                    }
                }
            }
        }
    }

    public final void g0(boolean z) {
        String str;
        int i = this.a;
        boolean z2 = true;
        if (i == 3) {
            str = this.h;
        } else {
            if (i == 2) {
                str = jb6.M0(2131746367, null);
            } else if (i == 1) {
                bm6 bm6Var = this.S;
                if (bm6Var != null && bm6Var.getClosestTab() != 9) {
                    z2 = false;
                }
                str = jb6.M0(z2 ? 2131746367 : 2131746388, null);
            } else {
                long j = (this.f == 0 || this.e != getUserConfig().e()) ? this.e : this.f;
                if (j == 2666000) {
                    str = jb6.M0(2131754217, null);
                } else if (this.f != 0 && j == getUserConfig().e()) {
                    str = jb6.M0(2131748060, null);
                } else if (pg3.B(j)) {
                    TLRPC.EncryptedChat Z0 = getMessagesController().Z0(Integer.valueOf((int) (j & 4294967295L)));
                    TLRPC.User W1 = Z0 != null ? getMessagesController().W1(Long.valueOf(Z0.user_id)) : null;
                    if (W1 != null) {
                        str = bw2.m(0, W1.first_name, W1.last_name);
                    }
                    str = null;
                } else if (pg3.D(j)) {
                    TLRPC.User W12 = getMessagesController().W1(Long.valueOf(j));
                    if (W12 != null) {
                        str = W12.self ? jb6.M0(2131745635, null) : bw2.m(0, W12.first_name, W12.last_name);
                    }
                    str = null;
                } else {
                    TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j));
                    if (L0 != null) {
                        str = L0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = jb6.M0(2131745149, null);
                }
            }
        }
        String str2 = str;
        boolean z3 = z2;
        if (TextUtils.equals(this.U, str2)) {
            return;
        }
        this.U = str2;
        rja rjaVar = this.simpleActionBar;
        if (!z) {
            rjaVar.setTitle(str2);
        } else {
            rjaVar.getClass();
            rjaVar.I(str2, z3, 320L, d53.h);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        return (getLastStoryViewer() == null || !getLastStoryViewer().y()) ? navigationBarColor : getLastStoryViewer().e(navigationBarColor);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    public final void h0(boolean z, boolean z2) {
        this.J.setEnabled(z);
        this.J.animate().alpha(z ? 1.0f : 0.5f).start();
        this.I.setEnabled(z2);
        this.I.animate().alpha(z2 ? 1.0f : 0.5f).start();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.S.u0()) {
            return false;
        }
        bm6 bm6Var = this.S;
        return bm6Var.getSelectedTab() == bm6Var.L0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!hasShownSheet()) {
            bm6 bm6Var = this.S;
            if (!bm6Var.F1) {
                return super.onBackPressed(z);
            }
            if (z) {
                bm6Var.E(false);
            }
        } else if (z) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i = this.a;
        this.T = getArguments().getInt("start_from", i == 2 ? 9 : i == 1 ? 8 : 0);
        getNotificationCenter().b(this, nm7.E0);
        getNotificationCenter().b(this, nm7.j5);
        getNotificationCenter().b(this, nm7.b3);
        if (pg3.D(this.e) && this.f == 0) {
            TLRPC.User W1 = getMessagesController().W1(Long.valueOf(this.e));
            if (m9c.D(W1)) {
                getMessagesController().k3(this.classGuid, W1, false);
                this.d = getMessagesController().X1(this.e);
            }
        }
        fha fhaVar = this.b;
        if (fhaVar == null) {
            fhaVar = new fha(this);
            this.b = fhaVar;
        }
        fhaVar.y.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, nm7.E0);
        getNotificationCenter().n(this, nm7.j5);
        getNotificationCenter().n(this, nm7.b3);
        yl6 yl6Var = this.R;
        if (yl6Var != null) {
            this.R = null;
            gm.c3(yl6Var);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onInsets(int i, int i2, int i3, int i4) {
        b0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
