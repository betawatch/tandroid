// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kg8 extends d implements jm7, dla {
    public TLRPC.MessageMedia A0;
    public boolean B0;
    public boolean C0;
    public int E;
    public CharSequence F;
    public Editable G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public final byte O;
    public int P;
    public boolean Q;
    public fdb R;
    public e34 S;
    public mx5 T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public int Y;
    public boolean Z;
    public r7 a;
    public int a0;
    public ig8 b;
    public boolean b0;
    public smb c;
    public ng8 c0;
    public u46 d;
    public final boolean d0;
    public hz0 e;
    public final boolean e0;
    public final yv1 f;
    public jg8 f0;
    public boolean g0;
    public ig5 h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final int n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int[] r;
    public int r0;
    public int s;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public final CharSequence[] w;
    public int w0;
    public final boolean[] x;
    public int x0;
    public int y;
    public int y0;
    public final ei7 z0;

    public kg8(yv1 yv1Var) {
        super(null);
        this.E = 1;
        this.H = true;
        this.I = false;
        this.K = true;
        this.P = gm.L(3.0f);
        this.h0 = -1;
        this.z0 = new ei7(this, (byte) 8);
        this.e0 = true;
        int f = getMessagesController().l4.x3.f();
        this.n = f;
        this.w = new CharSequence[f];
        this.x = new boolean[f];
        this.f = yv1Var;
        this.d0 = z8c.h(j5.a(this.currentAccount).a).p();
        this.M = false;
        this.O = (byte) 2;
    }

    @Override // dla
    public final void L(int i, boolean z) {
        boolean z2;
        boolean z3;
        if (this.d0) {
            if (i > gm.L(50.0f) && this.Z && !gm.E && !gm.O1()) {
                if (z) {
                    this.Y = i;
                    oc7.c1().edit().putInt("kbd_height_land3", this.Y).commit();
                } else {
                    this.X = i;
                    oc7.c1().edit().putInt("kbd_height", this.X).commit();
                }
            }
            if (this.Q) {
                int i2 = z ? this.Y : this.X;
                if (this.C0) {
                    i2 += gm.L(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
                int i3 = layoutParams.width;
                int i4 = gm.q.x;
                if (i3 != i4 || layoutParams.height != i2 || this.B0 != this.C0) {
                    layoutParams.width = i4;
                    layoutParams.height = i2;
                    this.S.setLayoutParams(layoutParams);
                    this.W = layoutParams.height;
                    this.T.a();
                    this.e.requestLayout();
                    boolean z4 = this.B0;
                    if (z4 != this.C0) {
                        i0(z4 ? -gm.L(120.0f) : gm.L(120.0f));
                    }
                    this.B0 = this.C0;
                }
            }
            if (this.a0 == i && this.b0 == z) {
                return;
            }
            this.a0 = i;
            this.b0 = z;
            boolean z5 = this.Z;
            ng8 ng8Var = this.c0;
            if (ng8Var != null) {
                z2 = ng8Var.getEditField().isFocused() && this.T.c() && i > 0;
                this.Z = z2;
            } else {
                this.Z = false;
                z2 = false;
            }
            if (z2 && this.Q) {
                u0(0);
            }
            if (this.W != 0 && !(z3 = this.Z) && z3 != z5 && !this.Q) {
                this.W = 0;
                this.T.a();
                this.e.requestLayout();
            }
            if (this.Z && this.U) {
                this.U = false;
                gm.r(this.z0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.Li));
        hashSet.add(Integer.valueOf(cmb.G6));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        String upperCase;
        anb.h(cmb.c6, getResourceProvider(), this.actionBar);
        a aVar = this.actionBar;
        int i = cmb.F6;
        anb.l(aVar, 1, i, getResourceProvider());
        anb.b(this.actionBar, i, getResourceProvider(), true);
        anb.l(this.actionBar, 3, cmb.y8, getResourceProvider());
        byte b = 5;
        anb.l(this.actionBar, 5, i, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        ylb ylbVar = null;
        boolean z = this.e0;
        if (z) {
            this.actionBar.setTitle(jb6.M0(this.J ? 2131743791 : 2131743759, null));
        } else {
            a aVar2 = this.actionBar;
            if (this.O == 1) {
                aVar2.setTitle(jb6.M0(2131748021, null));
            } else {
                aVar2.setTitle(jb6.M0(2131748022, null));
            }
        }
        tk5 tk5Var = this.parentLayout;
        if (tk5Var != null && ((ActionBarLayout) tk5Var).T0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cg8(this));
        r6 t = this.actionBar.t();
        if (z) {
            upperCase = jb6.M0(this.J ? 2131743792 : 2131743760, null);
        } else {
            upperCase = jb6.M0(2131751690, null).toUpperCase();
        }
        this.a = t.e(1, upperCase);
        this.b = new ig8(this, context);
        hz0 hz0Var = new hz0(this, context, (byte) 4);
        this.e = hz0Var;
        hz0Var.setDelegate(this);
        hz0 hz0Var2 = this.e;
        this.fragmentView = hz0Var2;
        anb.h(cmb.Z6, null, hz0Var2);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new smb(context, ylbVar, (byte) 10);
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.c.setItemAnimator(sc3Var);
        this.c.setVerticalScrollBarEnabled(false);
        ((sc3) this.c.getItemAnimator()).C = false;
        u46 u46Var = new u46(1, false);
        this.d = u46Var;
        this.c.setLayoutManager(u46Var);
        new hu5(new r20(this, b)).h(this.c);
        frameLayout.addView(this.c, qoe.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        this.c.setOnItemClickListener(new kg4(this, (byte) 21));
        this.c.setOnScrollListener(new so7(this, (byte) 2));
        ig5 ig5Var = new ig5(context, 4);
        this.h = ig5Var;
        ig5Var.setText(jb6.M0(2131746888, null));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, qoe.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.d0) {
            nm7.e().b(this, nm7.m4);
            fdb fdbVar = new fdb(context, this.currentAccount, null, this.resourceProvider);
            this.R = fdbVar;
            fdbVar.E = true;
            fdbVar.F = true;
            fdbVar.setHorizontalPadding(gm.L(24.0f));
            frameLayout.addView(this.R, qoe.e(-2, nm7.p2, 51));
        }
        this.T = new mx5(this.e, false, null);
        k0();
        return this.fragmentView;
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            e34 e34Var = this.S;
            if (e34Var != null) {
                e34Var.Q.h1();
            }
            ng8 ng8Var = this.c0;
            if (ng8Var != null) {
                int currentTextColor = ng8Var.getEditField().getCurrentTextColor();
                this.c0.getEditField().setTextColor(-1);
                this.c0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void h0() {
        int i;
        fdb fdbVar = this.R;
        if (fdbVar != null) {
            fdbVar.setDelegate(null);
            this.R.e();
        }
        int i2 = this.E;
        this.x[i2] = false;
        int i3 = i2 + 1;
        this.E = i3;
        if (this.r != null) {
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int[] iArr2 = this.r;
                if (i4 < iArr2.length) {
                    i = iArr2[i4];
                } else {
                    i = this.s + 1;
                    this.s = i;
                }
                iArr[i4] = i;
            }
            this.r = iArr;
        }
        if (this.E == this.w.length) {
            this.b.s(this.p0);
        }
        this.b.i(this.p0);
        v0();
        this.g0 = false;
        this.h0 = (this.o0 + this.E) - 1;
        this.b.g(this.q0);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean hideKeyboardOnShow() {
        return this.h0 < 0;
    }

    public final void i0(float f) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new go1(this, f, (byte) 5));
        ofFloat.addListener(new dg8(this, (byte) 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(gb.w);
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w0 = cmb.w0(null, cmb.c6, false);
            if (this.actionBar.y()) {
                w0 = cmb.w0(null, cmb.v8, false);
            }
            if (on2.h(w0) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final boolean j0(boolean z) {
        TLRPC.MessageMedia messageMedia = this.A0;
        boolean z2 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.w;
        boolean z3 = false;
        if (z2) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i = 0;
            for (int i2 = 0; i2 < Math.min(this.E, charSequenceArr.length); i2++) {
                if (!TextUtils.isEmpty(charSequenceArr[i2])) {
                    i++;
                }
            }
            boolean z4 = (this.J || TextUtils.equals(todoList.title.text, v72.Y(this.F))) && i == todoList.list.size();
            if (z4) {
                for (int i3 = 0; i3 < i; i3++) {
                    if (!TextUtils.equals(charSequenceArr[i3].toString(), todoList.list.get(i3).title.text)) {
                        break;
                    }
                }
            }
            z3 = z4;
        } else {
            boolean isEmpty = TextUtils.isEmpty(v72.Y(this.F));
            if (isEmpty) {
                for (int i4 = 0; i4 < this.E && (isEmpty = TextUtils.isEmpty(v72.Y(charSequenceArr[i4]))); i4++) {
                }
            }
            z3 = isEmpty;
        }
        if (z && !z3) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z5 = this.e0;
            String M0 = jb6.M0(z5 ? 2131752520 : 2131752526, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(z5 ? 2131752521 : 2131752527, null);
            alertDialog$Builder.j(jb6.M0(2131747313, null), new h68((Object) this, (byte) 6));
            alertDialog$Builder.g(jb6.M0(2131752542, null), null);
            showDialog(heVar);
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0() {
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2 = this.M;
        CharSequence[] charSequenceArr = this.w;
        if (z2) {
            int i4 = 0;
            i = 0;
            while (true) {
                boolean[] zArr = this.x;
                if (i4 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(v72.Y(charSequenceArr[i4])) && zArr[i4]) {
                    i++;
                }
                i4++;
            }
        } else {
            i = 0;
        }
        boolean z3 = this.e0;
        if (z3) {
            i2 = getMessagesController().l4.H2.f();
            i3 = getMessagesController().l4.I2.f();
        } else {
            i2 = nm7.d4;
            i3 = 100;
        }
        if ((TextUtils.isEmpty(v72.Y(this.G)) || this.G.length() <= 200) && !TextUtils.isEmpty(v72.Y(this.F)) && this.F.length() <= i2) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i5 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(v72.Y(charSequenceArr[i5]))) {
                    if (charSequenceArr[i5].length() > i3) {
                        i6 = 0;
                        break;
                    }
                    i6++;
                }
                i5++;
            }
            if (i6 >= (z3 ? 1 : 2) && (!this.M || i >= 1)) {
                z = true;
                this.a.setEnabled((this.M && i == 0) || z);
                this.a.setAlpha(z ? 1.0f : 0.5f);
            }
        }
        z = false;
        if (this.M) {
            this.a.setEnabled((this.M && i == 0) || z);
            this.a.setAlpha(z ? 1.0f : 0.5f);
        }
        this.a.setEnabled((this.M && i == 0) || z);
        this.a.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void l0() {
        if (this.C0) {
            this.S.r(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.S.getLayoutParams();
            layoutParams.height -= gm.L(120.0f);
            this.S.setLayoutParams(layoutParams);
            this.W = layoutParams.height;
            this.B0 = this.C0;
            this.C0 = false;
            i0(-gm.L(120.0f));
        }
    }

    public final void m0(boolean z) {
        if (this.d0) {
            byte b = 1;
            if (this.Q) {
                e34 e34Var = this.S;
                e34Var.Q.D0();
                e34Var.J.scrollTo(0, 0);
                e34Var.C(1);
                e34Var.R.g1(0, 0);
                this.S.r(false);
                if (z) {
                    this.S.y();
                }
                this.C0 = false;
                u0(0);
            }
            if (z) {
                e34 e34Var2 = this.S;
                if (e34Var2 == null || e34Var2.getVisibility() != 0) {
                    n0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.S.getMeasuredHeight());
                ofFloat.addUpdateListener(new bg8(this, b));
                ofFloat.addListener(new dg8(this, (byte) 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(gb.w);
                ofFloat.start();
            }
        }
    }

    public final void n0() {
        e34 e34Var;
        d02 emojiButton;
        if (!this.Q && (e34Var = this.S) != null && e34Var.getVisibility() != 8) {
            ng8 ng8Var = this.c0;
            if (ng8Var != null && (emojiButton = ng8Var.getEmojiButton()) != null) {
                emojiButton.j(b02.e, false);
            }
            this.S.setVisibility(8);
        }
        int i = this.W;
        this.W = 0;
        if (i != 0) {
            this.T.a();
        }
    }

    public final void o0(ng8 ng8Var, boolean z) {
        if (this.d0 && z) {
            if (this.c0 == ng8Var && this.Q && this.C0) {
                l0();
                this.Q = false;
            }
            ng8 ng8Var2 = this.c0;
            this.c0 = ng8Var;
            ng8Var.setEmojiButtonVisibility(true);
            d02 emojiButton = ng8Var.getEmojiButton();
            b02 b02Var = b02.e;
            emojiButton.j(b02Var, false);
            smb smbVar = this.c;
            View F = smbVar.F(ng8Var);
            u69 T = F == null ? null : smbVar.T(F);
            fdb fdbVar = this.R;
            if (fdbVar != null) {
                fdbVar.e();
                fdb fdbVar2 = this.R;
                if (fdbVar2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof ng8) && fdbVar2.getDelegate() != view) {
                        this.R.setDelegate((ng8) view);
                    }
                }
            }
            if (ng8Var2 == null || ng8Var2 == ng8Var) {
                return;
            }
            if (this.Q) {
                l0();
                m0(false);
                q0();
            }
            ng8Var2.setEmojiButtonVisibility(false);
            ng8Var2.getEmojiButton().j(b02Var, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!this.Q) {
            return j0(z);
        }
        if (!z) {
            return false;
        }
        m0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (!this.g0 || this.h0 < 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.c.getChildCount()) {
                view = null;
                break;
            }
            view = this.c.getChildAt(i);
            this.c.getClass();
            if (RecyclerView.R(view) == this.h0) {
                break;
            } else {
                i++;
            }
        }
        if (view instanceof ng8) {
            gm.d3(new l(((ng8) view).getTextView(), (byte) 8), 300L);
            this.h0 = -1;
        }
        this.g0 = false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        v0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.V = true;
        if (this.d0) {
            nm7.e().n(this, nm7.m4);
            e34 e34Var = this.S;
            if (e34Var != null) {
                this.e.removeView(e34Var);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onPause() {
        super.onPause();
        if (this.d0) {
            m0(false);
            fdb fdbVar = this.R;
            if (fdbVar != null) {
                fdbVar.e();
            }
            ng8 ng8Var = this.c0;
            if (ng8Var != null) {
                ng8Var.setEmojiButtonVisibility(false);
                this.c0.getTextView().clearFocus();
                gm.t1(this.c0.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        ig8 ig8Var = this.b;
        if (ig8Var != null) {
            ig8Var.f();
        }
        gm.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        int i;
        pz pzVar;
        super.onThemeColorsChanged();
        try {
            smb smbVar = this.c;
            if (smbVar != null) {
                for (int i2 = 0; i2 < smbVar.getChildCount(); i2++) {
                    View childAt = smbVar.getChildAt(i2);
                    u69 T = smbVar.T(childAt);
                    if (T != null && (((i = T.f) == 4 || i == 5) && (childAt instanceof ng8) && (pzVar = ((ng8) childAt).d) != null)) {
                        pzVar.setTextColor(cmb.p1(pzVar.isEnabled() ? 1.0f : 0.6f, getThemedColor(cmb.F6)));
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void p0(ng8 ng8Var) {
        this.c0 = ng8Var;
        if (!this.Q) {
            u0(1);
        } else {
            l0();
            q0();
        }
    }

    public final void q0() {
        this.T.e = true;
        EditTextBoldCursor editField = this.c0.getEditField();
        editField.requestFocus();
        gm.E3(editField);
        u0(gm.D ? 0 : 2);
        if (gm.D || this.Z || gm.E || gm.O1()) {
            return;
        }
        this.U = true;
        ei7 ei7Var = this.z0;
        gm.r(ei7Var);
        gm.d3(ei7Var, 100L);
    }

    public final void r0(TLRPC.MessageMedia messageMedia, boolean z) {
        s0(messageMedia, z, -1);
    }

    public final void s0(TLRPC.MessageMedia messageMedia, boolean z, int i) {
        int i2;
        TLRPC.TodoList todoList;
        this.A0 = messageMedia;
        this.J = z;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(gm.L(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.F = spannableStringBuilder;
            CharSequence m = gw3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
            this.F = m;
            Spannable A5 = k47.A5(m, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt(), false);
            this.F = A5;
            k47.b(A5, tL_messageMediaToDo.todo.title.entities, false, false, false, false, 0);
            int size = tL_messageMediaToDo.todo.list.size();
            this.E = size;
            this.y = size;
            this.s = 0;
            this.r = new int[size];
            int i3 = 0;
            while (true) {
                i2 = this.E;
                todoList = tL_messageMediaToDo.todo;
                if (i3 >= i2) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = todoList.list.get(i3).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.w;
                charSequenceArr[i3] = spannableStringBuilder2;
                CharSequence m2 = gw3.m(spannableStringBuilder2, textPaint.getFontMetricsInt(), false, null, 0);
                charSequenceArr[i3] = m2;
                Spannable A52 = k47.A5(m2, tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
                charSequenceArr[i3] = A52;
                k47.b(A52, tL_textWithEntities.entities, false, false, false, false, 0);
                this.r[i3] = tL_messageMediaToDo.todo.list.get(i3).id;
                this.s = Math.max(this.s, this.r[i3]);
                i3++;
            }
            this.K = todoList.others_can_complete;
            this.I = todoList.others_can_append;
            if (this.J) {
                this.E = i2 + 1;
                v0();
                this.g0 = true;
                this.h0 = this.o0 + (i < 0 ? this.E - 1 : i);
            }
        }
    }

    public final void t0(int i, View view) {
        int length;
        int i2;
        if (view instanceof ng8) {
            ng8 ng8Var = (ng8) view;
            int i3 = this.j0;
            boolean z = this.e0;
            if (i == i3) {
                i2 = z ? getMessagesController().l4.H2.f() : nm7.d4;
                CharSequence charSequence = this.F;
                length = i2 - (charSequence != null ? charSequence.length() : 0);
            } else if (i == this.k0) {
                Editable editable = this.G;
                int length2 = editable != null ? editable.length() : 0;
                i2 = nm7.d3;
                length = 200 - length2;
            } else {
                int i4 = this.o0;
                if (i < i4 || i >= this.E + i4) {
                    return;
                }
                int i5 = i - i4;
                int f = z ? getMessagesController().l4.I2.f() : 100;
                CharSequence charSequence2 = this.w[i5];
                length = f - (charSequence2 != null ? charSequence2.length() : 0);
                i2 = f;
            }
            float f2 = i2;
            if (length > f2 - (0.7f * f2)) {
                ng8Var.setText2("");
                return;
            }
            ng8Var.setText2(String.format("%d", Integer.valueOf(length)));
            lka textView2 = ng8Var.getTextView2();
            int i6 = length < 0 ? cmb.o7 : cmb.z6;
            anb.W(textView2, i6, null);
            textView2.setTag(Integer.valueOf(i6));
        }
    }

    public final void u0(int i) {
        ng8 ng8Var;
        if (this.d0) {
            byte b = 0;
            byte b2 = 1;
            if (i != 1) {
                d02 emojiButton = this.c0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(b02.e, true);
                }
                e34 e34Var = this.S;
                if (e34Var != null) {
                    this.Q = false;
                    this.C0 = false;
                    if (gm.D || gm.E) {
                        e34Var.setVisibility(8);
                    }
                }
                if (i == 0) {
                    this.W = 0;
                }
                this.T.a();
                this.e.requestLayout();
                return;
            }
            e34 e34Var2 = this.S;
            boolean z = e34Var2 != null && e34Var2.getVisibility() == 0;
            e34 e34Var3 = this.S;
            if (e34Var3 != null && e34Var3.d1 != z8c.t0) {
                this.e.removeView(e34Var3);
                e34Var3 = null;
                this.S = null;
            }
            if (e34Var3 == null) {
                e34 e34Var4 = new e34(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.S = e34Var4;
                e34Var4.x2 = false;
                e34Var4.V0 = false;
                e34Var4.setVisibility(8);
                if (gm.O1()) {
                    this.S.setForseMultiwindowLayout(true);
                }
                this.S.setDelegate(new eg8(this));
                this.e.addView(this.S);
            }
            this.S.setVisibility(0);
            this.Q = true;
            e34 e34Var5 = this.S;
            if (this.X <= 0) {
                if (gm.O1()) {
                    this.X = gm.L(150.0f);
                } else {
                    this.X = oc7.c1().getInt("kbd_height", gm.L(200.0f));
                }
            }
            int i2 = this.Y;
            if (i2 <= 0) {
                if (gm.O1()) {
                    i2 = gm.L(150.0f);
                    this.Y = i2;
                } else {
                    i2 = oc7.c1().getInt("kbd_height_land3", gm.L(200.0f));
                    this.Y = i2;
                }
            }
            Point point = gm.q;
            if (point.x <= point.y) {
                i2 = this.X;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e34Var5.getLayoutParams();
            layoutParams.height = i2;
            e34Var5.setLayoutParams(layoutParams);
            if (!gm.E && !gm.O1() && (ng8Var = this.c0) != null) {
                gm.t1(ng8Var.getEditField());
            }
            this.W = i2;
            this.T.a();
            this.e.requestLayout();
            d02 emojiButton2 = this.c0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(b02.d, true);
            }
            if (z || this.Z) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, 0.0f);
            ofFloat.addUpdateListener(new bg8(this, b));
            ofFloat.addListener(new dg8(this, b2));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(gb.w);
            ofFloat.start();
        }
    }

    public final void v0() {
        this.i0 = -1;
        this.j0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.u0 = -1;
        this.x0 = -1;
        this.r0 = -1;
        int i = 0;
        this.y0 = 0;
        boolean z = this.e0;
        if (!z || !this.J) {
            this.i0 = 0;
            this.j0 = 1;
            this.m0 = 2;
            this.y0 = 4;
            this.n0 = 3;
            i = 4;
        }
        int i2 = this.E;
        if (i2 != 0) {
            this.o0 = i;
            i += i2;
            this.y0 = i;
        }
        if (i2 != this.w.length) {
            int i3 = i + 1;
            this.y0 = i3;
            this.p0 = i;
            i = i3;
        }
        int i4 = i + 1;
        this.y0 = i4;
        this.q0 = i;
        if (z && this.J) {
            return;
        }
        int i5 = i + 2;
        this.y0 = i5;
        this.r0 = i4;
        if (z) {
            int i6 = i + 3;
            this.y0 = i6;
            this.w0 = i5;
            if (this.K) {
                this.y0 = i + 4;
                this.v0 = i6;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f.e;
        if (!sd2.T(chat) || chat.megagroup) {
            int i7 = this.y0;
            this.y0 = i7 + 1;
            this.s0 = i7;
        }
        byte b = this.O;
        if (b != 1) {
            int i8 = this.y0;
            this.y0 = i8 + 1;
            this.t0 = i8;
        }
        if (b == 0) {
            int i9 = this.y0;
            this.y0 = i9 + 1;
            this.u0 = i9;
        }
        int i10 = this.y0;
        int i11 = i10 + 1;
        this.y0 = i11;
        this.x0 = i10;
        if (this.M) {
            this.k0 = i11;
            this.y0 = i10 + 3;
            this.l0 = i10 + 2;
        }
    }
}
