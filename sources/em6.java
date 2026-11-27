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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class em6 extends e implements xia, el4, fn7 {
    public boolean E;
    public boolean F;
    public int G;
    public b8 H;
    public b8 I;
    public b8 J;
    public hj6 K;
    public final uz4[] L;
    public int M;
    public FrameLayout N;
    public c51 O;
    public fm0 P;
    public View Q;
    public svc R;
    public dm6 S;
    public int T;
    public String U;
    public int V;
    public int a;
    public wia b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public sla s;
    public SparseArray w;
    public b8 x;
    public b8 y;

    public em6(Bundle bundle, wia wiaVar) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new uz4[2];
        this.M = -1;
        this.b = wiaVar;
    }

    @Override // el4
    public final List D() {
        Activity parentActivity = getParentActivity();
        uo3 uo3Var = xca.m;
        return Arrays.asList(new dl4((parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false) ? "Disable" : "Enable").concat(" shape detector learning debug"), new zl6(this, (byte) 1)));
    }

    @Override // xia
    public final void Q() {
        wia wiaVar;
        dm6 dm6Var = this.S;
        if (dm6Var != null && (wiaVar = this.b) != null) {
            dm6Var.setNewMediaCounts(wiaVar.c);
        }
        e0();
    }

    public final void a0() {
        if (this.S == null) {
            return;
        }
        int i = 0;
        int L = this.K != null ? hl.L(72.0f) : 0;
        dm6 dm6Var = this.S;
        int currentActionBarHeight = a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = eja.t2;
        dm6Var.i1(eg0.f(currentActionBarHeight - a.getCurrentActionBarHeight()) - hl.L(6.666f), eg0.e(this.mSystemInsets.b), eg0.e(this.mSystemInsets.d + L), this.mSystemInsets.d + L);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + hl.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
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
            if (i2 < hl.L(40.0f) && L <= 0) {
                i = 8;
            }
            view2.setVisibility(i);
            this.navigationBarFadeView.requestLayout();
        }
        b0();
    }

    public final void b0() {
        if (this.K == null) {
            return;
        }
        float f = this.P.e;
        float L = hl.L(72.0f) + this.mSystemInsets.d;
        this.K.setTranslationY((L * f) + (-r2));
        float f2 = 1.0f - f;
        this.K.setAlpha(f2);
        this.K.setVisibility(f < 1.0f ? 0 : 4);
        this.N.setTranslationY((L * f2) + (-this.mSystemInsets.d));
        this.N.setAlpha(f);
        this.N.setVisibility(f > 0.0f ? 0 : 4);
    }

    public final boolean c0() {
        int i = this.a;
        return i == 1 || i == 2;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        if (this.S.u0()) {
            return super.canBeginSlide();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        eg0 eg0Var;
        int i;
        setHasOwnBackground(true);
        final byte b = 0;
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 9));
        d26 d26Var = new d26((byte) 4, context, this);
        this.fragmentView = d26Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().F1().b && getMessagesController().F1().e()) {
            this.T = 11;
        }
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        dm6 dm6Var = new dm6(this, context, this.e, this.b, this.c, this.d, this.T, this, new cm6(this), getResourceProvider(), baseSimpleGlass.c);
        this.S = dm6Var;
        dm6Var.setOnTopPanelShiftChanged(new zl6(this, b));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        d26Var.addView(this.S, tre.c(-1.0f, -1));
        final byte b2 = 3;
        if (c0()) {
            sla a = this.simpleActionBar.v().a(0, R.drawable.ic_ab_other);
            this.s = a;
            a.setContentDescription(ob6.M0(2131754834, null));
            this.s.Y(false, false);
            b8 e = this.s.e(8, R.drawable.msg_zoomin, ob6.M0(2131748404, null));
            this.I = e;
            e.setOnClickListener(new View.OnClickListener(this) { // from class: am6
                public final /* synthetic */ em6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    int i2;
                    byte b3 = b;
                    yw0 yw0Var = yw0.E;
                    em6 em6Var = this.b;
                    byte b4 = 1;
                    switch (b3) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = em6Var.E;
                            if (z && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i3 = -em6Var.G;
                                em6Var.G = i3;
                                hl.A3(i3, b8Var, null);
                                break;
                            } else {
                                b8 b8Var2 = em6Var.x;
                                boolean z2 = !z;
                                em6Var.E = z2;
                                b8Var2.setChecked(z2);
                                dm6 dm6Var2 = em6Var.S;
                                boolean z3 = em6Var.E;
                                boolean z4 = em6Var.F;
                                oha ohaVar = dm6Var2.f0;
                                if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                    u5bVar2.n = z3;
                                    u5bVar2.o = z4;
                                    u5bVar2.d(true);
                                }
                                aga agaVar = dm6Var2.h0;
                                if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                    u5bVar.n = z3;
                                    u5bVar.o = z4;
                                    u5bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = em6Var.F;
                            if (z5 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i4 = -em6Var.G;
                                em6Var.G = i4;
                                hl.A3(i4, b8Var3, null);
                                break;
                            } else {
                                b8 b8Var4 = em6Var.y;
                                boolean z6 = !z5;
                                em6Var.F = z6;
                                b8Var4.setChecked(z6);
                                dm6 dm6Var3 = em6Var.S;
                                boolean z7 = em6Var.E;
                                boolean z8 = em6Var.F;
                                oha ohaVar2 = dm6Var3.f0;
                                if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                    u5bVar4.n = z7;
                                    u5bVar4.o = z8;
                                    u5bVar4.d(true);
                                }
                                aga agaVar2 = dm6Var3.h0;
                                if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                    u5bVar3.n = z7;
                                    u5bVar3.o = z8;
                                    u5bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            boolean z9 = em6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < em6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z9) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z9, b4);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? d31.b0(em6Var2).L(R.raw.contact_check, ob6.G(i2, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j() : d31.b0(em6Var2).J(R.raw.chats_archived, ob6.G(i2, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j()).w = new z56(em6Var2, zArr2, (byte) 28);
                                break;
                            }
                            break;
                    }
                }
            });
            b8 e2 = this.s.e(9, R.drawable.msg_zoomout, ob6.M0(2131748403, null));
            this.J = e2;
            e2.setOnClickListener(new View.OnClickListener(this) { // from class: am6
                public final /* synthetic */ em6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    int i2;
                    byte b3 = r2;
                    yw0 yw0Var = yw0.E;
                    em6 em6Var = this.b;
                    byte b4 = 1;
                    switch (b3) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = em6Var.E;
                            if (z && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i3 = -em6Var.G;
                                em6Var.G = i3;
                                hl.A3(i3, b8Var, null);
                                break;
                            } else {
                                b8 b8Var2 = em6Var.x;
                                boolean z2 = !z;
                                em6Var.E = z2;
                                b8Var2.setChecked(z2);
                                dm6 dm6Var2 = em6Var.S;
                                boolean z3 = em6Var.E;
                                boolean z4 = em6Var.F;
                                oha ohaVar = dm6Var2.f0;
                                if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                    u5bVar2.n = z3;
                                    u5bVar2.o = z4;
                                    u5bVar2.d(true);
                                }
                                aga agaVar = dm6Var2.h0;
                                if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                    u5bVar.n = z3;
                                    u5bVar.o = z4;
                                    u5bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = em6Var.F;
                            if (z5 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i4 = -em6Var.G;
                                em6Var.G = i4;
                                hl.A3(i4, b8Var3, null);
                                break;
                            } else {
                                b8 b8Var4 = em6Var.y;
                                boolean z6 = !z5;
                                em6Var.F = z6;
                                b8Var4.setChecked(z6);
                                dm6 dm6Var3 = em6Var.S;
                                boolean z7 = em6Var.E;
                                boolean z8 = em6Var.F;
                                oha ohaVar2 = dm6Var3.f0;
                                if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                    u5bVar4.n = z7;
                                    u5bVar4.o = z8;
                                    u5bVar4.d(true);
                                }
                                aga agaVar2 = dm6Var3.h0;
                                if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                    u5bVar3.n = z7;
                                    u5bVar3.o = z8;
                                    u5bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            boolean z9 = em6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < em6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z9) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z9, b4);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? d31.b0(em6Var2).L(R.raw.contact_check, ob6.G(i2, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j() : d31.b0(em6Var2).J(R.raw.chats_archived, ob6.G(i2, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j()).w = new z56(em6Var2, zArr2, (byte) 28);
                                break;
                            }
                            break;
                    }
                }
            });
            b8 e3 = this.s.e(10, R.drawable.msg_calendar2, ob6.M0(2131752623, null));
            this.H = e3;
            e3.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.s.a(-1);
            sla slaVar = this.s;
            b8 d = slaVar.d(6, 0, null, ob6.M0(2131748407, null), true, true, slaVar.n0);
            this.x = d;
            d.setChecked(this.E);
            final byte b3 = 2;
            this.x.setOnClickListener(new View.OnClickListener(this) { // from class: am6
                public final /* synthetic */ em6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    int i2;
                    byte b32 = b3;
                    yw0 yw0Var = yw0.E;
                    em6 em6Var = this.b;
                    byte b4 = 1;
                    switch (b32) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = em6Var.E;
                            if (z && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i3 = -em6Var.G;
                                em6Var.G = i3;
                                hl.A3(i3, b8Var, null);
                                break;
                            } else {
                                b8 b8Var2 = em6Var.x;
                                boolean z2 = !z;
                                em6Var.E = z2;
                                b8Var2.setChecked(z2);
                                dm6 dm6Var2 = em6Var.S;
                                boolean z3 = em6Var.E;
                                boolean z4 = em6Var.F;
                                oha ohaVar = dm6Var2.f0;
                                if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                    u5bVar2.n = z3;
                                    u5bVar2.o = z4;
                                    u5bVar2.d(true);
                                }
                                aga agaVar = dm6Var2.h0;
                                if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                    u5bVar.n = z3;
                                    u5bVar.o = z4;
                                    u5bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = em6Var.F;
                            if (z5 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i4 = -em6Var.G;
                                em6Var.G = i4;
                                hl.A3(i4, b8Var3, null);
                                break;
                            } else {
                                b8 b8Var4 = em6Var.y;
                                boolean z6 = !z5;
                                em6Var.F = z6;
                                b8Var4.setChecked(z6);
                                dm6 dm6Var3 = em6Var.S;
                                boolean z7 = em6Var.E;
                                boolean z8 = em6Var.F;
                                oha ohaVar2 = dm6Var3.f0;
                                if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                    u5bVar4.n = z7;
                                    u5bVar4.o = z8;
                                    u5bVar4.d(true);
                                }
                                aga agaVar2 = dm6Var3.h0;
                                if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                    u5bVar3.n = z7;
                                    u5bVar3.o = z8;
                                    u5bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            boolean z9 = em6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < em6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z9) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z9, b4);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? d31.b0(em6Var2).L(R.raw.contact_check, ob6.G(i2, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j() : d31.b0(em6Var2).J(R.raw.chats_archived, ob6.G(i2, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j()).w = new z56(em6Var2, zArr2, (byte) 28);
                                break;
                            }
                            break;
                    }
                }
            });
            sla slaVar2 = this.s;
            b8 d2 = slaVar2.d(7, 0, null, ob6.M0(2131748406, null), true, true, slaVar2.n0);
            this.y = d2;
            d2.setChecked(this.F);
            this.y.setOnClickListener(new View.OnClickListener(this) { // from class: am6
                public final /* synthetic */ em6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    int i2;
                    byte b32 = b2;
                    yw0 yw0Var = yw0.E;
                    em6 em6Var = this.b;
                    byte b4 = 1;
                    switch (b32) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = em6Var.E;
                            if (z && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i3 = -em6Var.G;
                                em6Var.G = i3;
                                hl.A3(i3, b8Var, null);
                                break;
                            } else {
                                b8 b8Var2 = em6Var.x;
                                boolean z2 = !z;
                                em6Var.E = z2;
                                b8Var2.setChecked(z2);
                                dm6 dm6Var2 = em6Var.S;
                                boolean z3 = em6Var.E;
                                boolean z4 = em6Var.F;
                                oha ohaVar = dm6Var2.f0;
                                if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                    u5bVar2.n = z3;
                                    u5bVar2.o = z4;
                                    u5bVar2.d(true);
                                }
                                aga agaVar = dm6Var2.h0;
                                if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                    u5bVar.n = z3;
                                    u5bVar.o = z4;
                                    u5bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = em6Var.F;
                            if (z5 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i4 = -em6Var.G;
                                em6Var.G = i4;
                                hl.A3(i4, b8Var3, null);
                                break;
                            } else {
                                b8 b8Var4 = em6Var.y;
                                boolean z6 = !z5;
                                em6Var.F = z6;
                                b8Var4.setChecked(z6);
                                dm6 dm6Var3 = em6Var.S;
                                boolean z7 = em6Var.E;
                                boolean z8 = em6Var.F;
                                oha ohaVar2 = dm6Var3.f0;
                                if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                    u5bVar4.n = z7;
                                    u5bVar4.o = z8;
                                    u5bVar4.d(true);
                                }
                                aga agaVar2 = dm6Var3.h0;
                                if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                    u5bVar3.n = z7;
                                    u5bVar3.o = z8;
                                    u5bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            boolean z9 = em6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i2 = 0;
                                for (int i5 = 0; i5 < em6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i2++;
                                    }
                                }
                            } else {
                                i2 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z9) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z9, b4);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? d31.b0(em6Var2).L(R.raw.contact_check, ob6.G(i2, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j() : d31.b0(em6Var2).J(R.raw.chats_archived, ob6.G(i2, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j()).w = new z56(em6Var2, zArr2, (byte) 28);
                                break;
                            }
                            break;
                    }
                }
            });
        }
        int i2 = this.a;
        uz4[] uz4VarArr = this.L;
        if (i2 == 1) {
            hj6 hj6Var = new hj6(context, getResourceProvider());
            this.K = hj6Var;
            hj6Var.setClipChildren(false);
            this.K.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
            uz4VarArr[0] = uz4.c(context, getResourceProvider(), tz4.S, 2131746378);
            uz4VarArr[1] = uz4.c(context, getResourceProvider(), tz4.T, 2131746354);
            for (int i3 = 0; i3 < uz4VarArr.length; i3++) {
                uz4VarArr[i3].setOnClickListener(new w0(this, i3, (byte) 11));
                this.K.addView(uz4VarArr[i3]);
                this.K.j(uz4VarArr[i3], true, false);
            }
            eg0Var = baseSimpleGlass;
            jl0 c = eg0Var.c.c(this.K, dtd.g(getResourceProvider()), false);
            ik8.r(c, hl.L(28.0f), 7.666f);
            this.K.setBackground(c);
            d26Var.addView(this.K, tre.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(hl.L(16.0f), hl.L(8.0f), hl.L(16.0f), hl.L(8.0f));
            c51 c51Var = new c51(getResourceProvider(), context, true);
            this.O = c51Var;
            c51Var.i(ob6.M0(2131745637, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            final byte b4 = 4;
            this.O.setOnClickListener(new View.OnClickListener(this) { // from class: am6
                public final /* synthetic */ em6 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    int i22;
                    byte b32 = b4;
                    yw0 yw0Var = yw0.E;
                    em6 em6Var = this.b;
                    byte b42 = 1;
                    switch (b32) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                break;
                            }
                            break;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                break;
                            }
                            break;
                        case 2:
                            boolean z = em6Var.E;
                            if (z && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i32 = -em6Var.G;
                                em6Var.G = i32;
                                hl.A3(i32, b8Var, null);
                                break;
                            } else {
                                b8 b8Var2 = em6Var.x;
                                boolean z2 = !z;
                                em6Var.E = z2;
                                b8Var2.setChecked(z2);
                                dm6 dm6Var2 = em6Var.S;
                                boolean z3 = em6Var.E;
                                boolean z4 = em6Var.F;
                                oha ohaVar = dm6Var2.f0;
                                if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                    u5bVar2.n = z3;
                                    u5bVar2.o = z4;
                                    u5bVar2.d(true);
                                }
                                aga agaVar = dm6Var2.h0;
                                if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                    u5bVar.n = z3;
                                    u5bVar.o = z4;
                                    u5bVar.d(true);
                                    break;
                                }
                            }
                            break;
                        case 3:
                            boolean z5 = em6Var.F;
                            if (z5 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i4 = -em6Var.G;
                                em6Var.G = i4;
                                hl.A3(i4, b8Var3, null);
                                break;
                            } else {
                                b8 b8Var4 = em6Var.y;
                                boolean z6 = !z5;
                                em6Var.F = z6;
                                b8Var4.setChecked(z6);
                                dm6 dm6Var3 = em6Var.S;
                                boolean z7 = em6Var.E;
                                boolean z8 = em6Var.F;
                                oha ohaVar2 = dm6Var3.f0;
                                if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                    u5bVar4.n = z7;
                                    u5bVar4.o = z8;
                                    u5bVar4.d(true);
                                }
                                aga agaVar2 = dm6Var3.h0;
                                if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                    u5bVar3.n = z7;
                                    u5bVar3.o = z8;
                                    u5bVar3.d(true);
                                    break;
                                }
                            }
                            break;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            boolean z9 = em6Var2.S.getClosestTab() == 9;
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i22 = 0;
                                for (int i5 = 0; i5 < em6Var2.w.size(); i5++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i5)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i22++;
                                    }
                                }
                            } else {
                                i22 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z9) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i6);
                                    zArr[i6] = storyItem2.pinned;
                                    storyItem2.pinned = z9;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z9, b42);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                (z9 ? d31.b0(em6Var2).L(R.raw.contact_check, ob6.G(i22, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j() : d31.b0(em6Var2).J(R.raw.chats_archived, ob6.G(i22, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j()).w = new z56(em6Var2, zArr2, (byte) 28);
                                break;
                            }
                            break;
                    }
                }
            });
            this.N.addView(this.O, tre.c(56.0f, -1));
            this.N.setVisibility(4);
            d26Var.addView(this.N, tre.e(-1, 72, 80));
            this.P = new fm0(0, new bm6(this, b), k43.h, 320L, false);
            setBulletinDelegate(new t10(this, (byte) 12));
        } else {
            eg0Var = baseSimpleGlass;
        }
        View view = new View(context);
        this.Q = view;
        this.S.e(view);
        View view2 = this.Q;
        view2.setBackground(eg0Var.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(eg0Var.b(view3));
        View view4 = this.navigationBarFadeView;
        hj6 hj6Var2 = this.K;
        d26Var.addView(view4, hj6Var2 != null ? d26Var.indexOfChild(hj6Var2) : d26Var.getChildCount(), tre.e(-1, 0, 80));
        eg0Var.i(d26Var, this.simpleActionBar, getResourceProvider());
        eg0Var.o = new dg0(this, d26Var, (byte) 6);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        f0(false);
        if (this.a == 3 && (i = this.r) != -1) {
            this.simpleActionBar.setSubtitle(ob6.H(' ', "FoundStories", i));
        }
        a0();
        e0();
        if (this.a == 1) {
            r13 = this.T != 9 ? (byte) 0 : (byte) 1;
            hj6 hj6Var3 = this.K;
            if (hj6Var3 != null && this.M != r13) {
                this.M = r13;
                hj6Var3.r(uz4VarArr[r13], false);
            }
        }
        return d26Var;
    }

    public final void d0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.E0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            dm6 dm6Var = this.S;
            if (dm6Var != null) {
                dm6Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0() {
        int i;
        dm6 dm6Var = this.S;
        if (dm6Var == null || this.simpleActionBar == null) {
            return;
        }
        int closestTab = dm6Var.getClosestTab();
        if (this.a != 3 || closestTab == 8) {
            int[] iArr = this.b.c;
            boolean z = ob6.a0;
            if (closestTab == 8 || closestTab == 9) {
                b8 b8Var = this.J;
                if (b8Var != null) {
                    b8Var.setEnabled(this.S.t());
                    b8 b8Var2 = this.J;
                    b8Var2.setAlpha(b8Var2.isEnabled() ? 1.0f : 0.5f);
                }
                b8 b8Var3 = this.I;
                if (b8Var3 != null) {
                    b8Var3.setEnabled(this.S.s());
                    b8 b8Var4 = this.I;
                    b8Var4.setAlpha(b8Var4.isEnabled() ? 1.0f : 0.5f);
                }
                int W = this.S.W(closestTab);
                if (this.a == 3) {
                    if (W > 0) {
                        d0(ob6.H(' ', "FoundStories", W));
                    }
                } else if (closestTab == 8) {
                    d0(W > 0 ? ob6.G(W, "ProfileMyStoriesCount", new Object[0]) : null);
                } else {
                    d0(W > 0 ? ob6.G(W, "ProfileStoriesArchiveCount", new Object[0]) : null);
                }
                f0(true);
                sla slaVar = this.s;
                if (slaVar != null) {
                    slaVar.Y(W > 0, true);
                }
                c51 c51Var = this.O;
                if (c51Var != null) {
                    boolean z2 = !z && this.V == closestTab;
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.w;
                        c51Var.i(ob6.G(sparseArray == null ? 0 : sparseArray.size(), "ArchiveStories", new Object[0]), z2, true);
                    } else {
                        c51Var.i(ob6.M0(2131745637, null), z2, true);
                    }
                    this.V = closestTab;
                }
                b8 b8Var5 = this.H;
                if (b8Var5 != null) {
                    boolean z3 = W > 0;
                    b8Var5.setEnabled(z3);
                    this.H.setAlpha(z3 ? 1.0f : 0.5f);
                    return;
                }
                return;
            }
            if (closestTab == 11) {
                d0(ob6.G(getMessagesController().F1().c(), "SavedDialogsTabCount", new Object[0]));
                return;
            }
            if (closestTab >= 0) {
                if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                    if (closestTab == 0) {
                        if (this.S.getPhotosVideosTypeFilter() == 1) {
                            d0(ob6.G(iArr[6], "Photos", new Object[0]));
                            return;
                        } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                            d0(ob6.G(iArr[7], "Videos", new Object[0]));
                            return;
                        } else {
                            d0(ob6.G(iArr[0], "Media", new Object[0]));
                            return;
                        }
                    }
                    if (closestTab == 1) {
                        d0(ob6.G(iArr[1], "Files", new Object[0]));
                        return;
                    }
                    if (closestTab == 2) {
                        d0(ob6.G(iArr[2], "Voice", new Object[0]));
                        return;
                    }
                    if (closestTab == 3) {
                        d0(ob6.G(iArr[3], "Links", new Object[0]));
                        return;
                    }
                    if (closestTab == 4) {
                        d0(ob6.G(iArr[4], "MusicFiles", new Object[0]));
                        return;
                    }
                    if (closestTab == 5) {
                        d0(ob6.G(iArr[5], "GIFs", new Object[0]));
                        return;
                    }
                    if (closestTab == 15 && (i = iArr[8]) >= 0) {
                        d0(ob6.G(i, "ProfilePollsCount", new Object[0]));
                    } else if (closestTab == 10) {
                        wb7 L0 = uc7.s1(this.currentAccount).L0(this.e);
                        d0(ob6.G(L0 == null ? 0 : L0.b.size() + L0.c, "Channels", new Object[0]));
                    }
                }
            }
        }
    }

    public final void f0(boolean z) {
        String str;
        int i = this.a;
        boolean z2 = true;
        if (i == 3) {
            str = this.h;
        } else {
            if (i == 2) {
                str = ob6.M0(2131746361, null);
            } else if (i == 1) {
                dm6 dm6Var = this.S;
                if (dm6Var != null && dm6Var.getClosestTab() != 9) {
                    z2 = false;
                }
                str = ob6.M0(z2 ? 2131746361 : 2131746382, null);
            } else {
                long j = (this.f == 0 || this.e != getUserConfig().e()) ? this.e : this.f;
                if (j == 2666000) {
                    str = ob6.M0(2131754245, null);
                } else if (this.f != 0 && j == getUserConfig().e()) {
                    str = ob6.M0(2131748057, null);
                } else if (wf3.B(j)) {
                    TLRPC.EncryptedChat a1 = getMessagesController().a1(Integer.valueOf((int) (j & 4294967295L)));
                    TLRPC.User X1 = a1 != null ? getMessagesController().X1(Long.valueOf(a1.user_id)) : null;
                    if (X1 != null) {
                        str = lv2.m(0, X1.first_name, X1.last_name);
                    }
                    str = null;
                } else if (wf3.D(j)) {
                    TLRPC.User X12 = getMessagesController().X1(Long.valueOf(j));
                    if (X12 != null) {
                        str = X12.self ? ob6.M0(2131745629, null) : lv2.m(0, X12.first_name, X12.last_name);
                    }
                    str = null;
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
                    if (M0 != null) {
                        str = M0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = ob6.M0(2131745143, null);
                }
            }
        }
        String str2 = str;
        boolean z3 = z2;
        if (TextUtils.equals(this.U, str2)) {
            return;
        }
        this.U = str2;
        jla jlaVar = this.simpleActionBar;
        if (!z) {
            jlaVar.setTitle(str2);
        } else {
            jlaVar.getClass();
            jlaVar.K(str2, z3, 320L, k43.h);
        }
    }

    public final void g0(boolean z, boolean z2) {
        this.J.setEnabled(z);
        this.J.animate().alpha(z ? 1.0f : 0.5f).start();
        this.I.setEnabled(z2);
        this.I.animate().alpha(z2 ? 1.0f : 0.5f).start();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        return (getLastStoryViewer() == null || !getLastStoryViewer().z()) ? navigationBarColor : getLastStoryViewer().e(navigationBarColor);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.S.u0()) {
            return false;
        }
        dm6 dm6Var = this.S;
        return dm6Var.getSelectedTab() == dm6Var.L0.getFirstTabId();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        if (!hasShownSheet()) {
            dm6 dm6Var = this.S;
            if (!dm6Var.F1) {
                return super.onBackPressed(z);
            }
            if (z) {
                dm6Var.E(false);
            }
        } else if (z) {
            closeSheet();
            return false;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        this.a = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i = this.a;
        this.T = getArguments().getInt("start_from", i == 2 ? 9 : i == 1 ? 8 : 0);
        getNotificationCenter().b(this, jn7.E0);
        getNotificationCenter().b(this, jn7.i5);
        getNotificationCenter().b(this, jn7.b3);
        if (wf3.D(this.e) && this.f == 0) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e));
            if (lbc.D(X1)) {
                getMessagesController().o3(this.classGuid, X1, false);
                this.d = getMessagesController().Y1(this.e);
            }
        }
        wia wiaVar = this.b;
        if (wiaVar == null) {
            wiaVar = new wia(this);
            this.b = wiaVar;
        }
        wiaVar.y.add(this);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.E0);
        getNotificationCenter().n(this, jn7.i5);
        getNotificationCenter().n(this, jn7.b3);
        svc svcVar = this.R;
        if (svcVar != null) {
            this.R = null;
            hl.c3(svcVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        a0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
