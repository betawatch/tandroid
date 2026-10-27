package org.telegram.ui;

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
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ov0 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.vw0 {
    public boolean A0;
    public boolean B0;
    public CharSequence E;
    public Editable F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final int N;
    public int O;
    public boolean P;
    public org.telegram.ui.Components.uz0 Q;
    public org.telegram.ui.Components.sz R;
    public fi.z3 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.w0 a;
    public boolean a0;
    public mv0 b;
    public org.telegram.ui.Cells.h6 b0;
    public bb1 c;
    public final boolean c0;
    public s4.c0 d;
    public final boolean d0;
    public jd e;
    public nv0 e0;
    public final wn f;
    public boolean f0;
    public int g0;
    public org.telegram.ui.Components.t40 h;
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
    public final CharSequence[] v;
    public int v0;
    public final boolean[] w;
    public int w0;
    public int x;
    public int x0;
    public int y;
    public final y5 y0;
    public TLRPC.MessageMedia z0;

    public ov0(wn wnVar) {
        super(null);
        this.y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.g0 = -1;
        this.y0 = new y5(this, 13);
        this.c.getChildCount();
        this.d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.n = i10;
        this.v = new CharSequence[i10];
        this.w = new boolean[i10];
        this.f = wnVar;
        this.c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static void d0(ov0 ov0Var, View view, int i10) {
        int length;
        int i11;
        boolean z10 = ov0Var.d0;
        if (view instanceof org.telegram.ui.Cells.h6) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (i10 == ov0Var.i0) {
                i11 = z10 ? ov0Var.getMessagesController().todoTitleLengthMax : 255;
                CharSequence charSequence = ov0Var.E;
                length = i11 - (charSequence != null ? charSequence.length() : 0);
            } else if (i10 == ov0Var.j0) {
                Editable editable = ov0Var.F;
                i11 = 200;
                length = 200 - (editable != null ? editable.length() : 0);
            } else {
                int i12 = ov0Var.n0;
                if (i10 < i12 || i10 >= ov0Var.y + i12) {
                    return;
                }
                int i13 = i10 - i12;
                int i14 = z10 ? ov0Var.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence2 = ov0Var.v[i13];
                length = i14 - (charSequence2 != null ? charSequence2.length() : 0);
                i11 = i14;
            }
            float f7 = i11;
            if (length > f7 - (0.7f * f7)) {
                h6Var.setText2("");
                return;
            }
            h6Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.b6 textView2 = h6Var.getTextView2();
            int i15 = length < 0 ? org.telegram.ui.ActionBar.y6.p7 : org.telegram.ui.ActionBar.y6.A6;
            org.telegram.ui.ActionBar.f7.Y(textView2, i15, null);
            textView2.setTag(Integer.valueOf(i15));
        }
    }

    public static void e0(ov0 ov0Var, org.telegram.ui.Cells.h6 h6Var, boolean z10) {
        if (ov0Var.c0 && z10) {
            if (ov0Var.b0 == h6Var && ov0Var.P && ov0Var.B0) {
                ov0Var.k0();
                ov0Var.P = false;
            }
            org.telegram.ui.Cells.h6 h6Var2 = ov0Var.b0;
            ov0Var.b0 = h6Var;
            h6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.ah emojiButton = h6Var.getEmojiButton();
            org.telegram.ui.Components.yg ygVar = org.telegram.ui.Components.yg.e;
            emojiButton.j(ygVar, false);
            bb1 bb1Var = ov0Var.c;
            View F = bb1Var.F(h6Var);
            s4.e1 T = F == null ? null : bb1Var.T(F);
            org.telegram.ui.Components.uz0 uz0Var = ov0Var.Q;
            if (uz0Var != null) {
                uz0Var.f();
                org.telegram.ui.Components.uz0 uz0Var2 = ov0Var.Q;
                if (uz0Var2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.h6) && uz0Var2.getDelegate() != view) {
                        ov0Var.Q.setDelegate((org.telegram.ui.Cells.h6) view);
                    }
                }
            }
            if (h6Var2 == null || h6Var2 == h6Var) {
                return;
            }
            if (ov0Var.P) {
                ov0Var.k0();
                ov0Var.l0(false);
                ov0Var.n0();
            }
            h6Var2.setEmojiButtonVisibility(false);
            h6Var2.getEmojiButton().j(ygVar, false);
        }
    }

    public static void f0(ov0 ov0Var, org.telegram.ui.Cells.h6 h6Var) {
        ov0Var.b0 = h6Var;
        if (!ov0Var.P) {
            ov0Var.r0(1);
        } else {
            ov0Var.k0();
            ov0Var.n0();
        }
    }

    @Override // org.telegram.ui.Components.vw0
    public final void I(int i10, boolean z10) {
        boolean z11;
        if (this.c0) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.Y && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.X = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.X).commit();
                } else {
                    this.W = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.W).commit();
                }
            }
            if (this.P) {
                int i11 = z10 ? this.X : this.W;
                if (this.B0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.A0 != this.B0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.R.setLayoutParams(layoutParams);
                    this.V = layoutParams.height;
                    this.S.a();
                    this.e.requestLayout();
                    boolean z12 = this.A0;
                    if (z12 != this.B0) {
                        h0(z12 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.A0 = this.B0;
                }
            }
            if (this.Z == i10 && this.a0 == z10) {
                return;
            }
            this.Z = i10;
            this.a0 = z10;
            boolean z13 = this.Y;
            org.telegram.ui.Cells.h6 h6Var = this.b0;
            if (h6Var != null) {
                this.Y = h6Var.getEditField().isFocused() && this.S.c() && i10 > 0;
            } else {
                this.Y = false;
            }
            if (this.Y && this.P) {
                r0(0);
            }
            if (this.V != 0 && !(z11 = this.Y) && z11 != z13 && !this.P) {
                this.V = 0;
                this.S.a();
                this.e.requestLayout();
            }
            if (this.Y && this.T) {
                this.T = false;
                AndroidUtilities.cancelRunOnUIThread(this.y0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.s8));
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        String upperCase;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.d6, this.actionBar, getResourceProvider());
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.m(kVar, 1, i10, getResourceProvider());
        org.telegram.ui.ActionBar.f7.b(this.actionBar, i10, getResourceProvider(), true);
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 3, org.telegram.ui.ActionBar.y6.z8, getResourceProvider());
        org.telegram.ui.ActionBar.f7.m(this.actionBar, 5, i10, getResourceProvider());
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.d0;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(this.I ? R.string.TodoAddTasksTitle : R.string.TodoEditTitle));
        } else if (this.N == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && ((ActionBarLayout) j5Var).S0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new gv0(this));
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        if (z10) {
            upperCase = LocaleController.getString(this.I ? R.string.TodoAddTasksButton : R.string.TodoEditTasksButton);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.a = l4.e(1, upperCase);
        this.b = new mv0(this, context);
        jd jdVar = new jd(3, context, this);
        this.e = jdVar;
        jdVar.setDelegate(this);
        jd jdVar2 = this.e;
        this.fragmentView = jdVar2;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.a7, jdVar2, null);
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new bb1(context, 11, null);
        s4.l lVar = new s4.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.ds.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setVerticalScrollBarEnabled(false);
        ((s4.l) this.c.getItemAnimator()).C = false;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        this.c.setLayoutManager(c0Var);
        new s4.z(new ei.f(this, 6)).h(this.c);
        frameLayout.addView(this.c, org.telegram.ui.Components.kb1.i(-1, -1, 51));
        this.c.setAdapter(this.b);
        int i11 = 24;
        this.c.setOnItemClickListener(new h(this, i11));
        this.c.setOnScrollListener(new i3(this, i11));
        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(context, 4);
        this.h = t40Var;
        t40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.c0) {
            NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.uz0 uz0Var = new org.telegram.ui.Components.uz0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = uz0Var;
            uz0Var.y = true;
            uz0Var.E = true;
            uz0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.Q, org.telegram.ui.Components.kb1.i(-2, 160, 51));
        }
        this.S = new fi.z3(this.e, false, null);
        j0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.sz szVar = this.R;
            if (szVar != null) {
                szVar.P.g1();
            }
            org.telegram.ui.Cells.h6 h6Var = this.b0;
            if (h6Var != null) {
                int currentTextColor = h6Var.getEditField().getCurrentTextColor();
                this.b0.getEditField().setTextColor(-1);
                this.b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void g0() {
        int i10;
        org.telegram.ui.Components.uz0 uz0Var = this.Q;
        if (uz0Var != null) {
            uz0Var.setDelegate(null);
            this.Q.f();
        }
        int i11 = this.y;
        this.w[i11] = false;
        int i12 = i11 + 1;
        this.y = i12;
        if (this.r != null) {
            int[] iArr = new int[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                int[] iArr2 = this.r;
                if (i13 < iArr2.length) {
                    i10 = iArr2[i13];
                } else {
                    i10 = this.s + 1;
                    this.s = i10;
                }
                iArr[i13] = i10;
            }
            this.r = iArr;
        }
        if (this.y == this.v.length) {
            this.b.u(this.o0);
        }
        this.b.o(this.o0);
        s0();
        this.f0 = false;
        this.g0 = (this.n0 + this.y) - 1;
        this.b.m(this.p0);
    }

    public final void h0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new eg(this, f7, 3));
        ofFloat.addListener(new hv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean hideKeyboardOnShow() {
        return this.g0 < 0;
    }

    public final boolean i0(boolean z10) {
        TLRPC.MessageMedia messageMedia = this.z0;
        boolean z11 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z12 = false;
        if (z11) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i10 = 0;
            for (int i11 = 0; i11 < Math.min(this.y, charSequenceArr.length); i11++) {
                if (!TextUtils.isEmpty(charSequenceArr[i11])) {
                    i10++;
                }
            }
            boolean z13 = (this.I || TextUtils.equals(todoList.title.text, org.telegram.ui.Components.go.b0(this.E))) && i10 == todoList.list.size();
            if (z13) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (!TextUtils.equals(charSequenceArr[i12].toString(), todoList.list.get(i12).title.text)) {
                        break;
                    }
                }
            }
            z12 = z13;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.go.b0(this.E));
            if (isEmpty) {
                for (int i13 = 0; i13 < this.y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.go.b0(charSequenceArr[i13]))); i13++) {
                }
            }
            z12 = isEmpty;
        }
        if (z10 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.d0;
            alertDialog$Builder.a.R = LocaleController.getString(z14 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(z14 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new jl0(this, 5));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.a);
        }
        return z12;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false);
            if (this.actionBar.q()) {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.w8, false);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0() {
        int i10;
        boolean z10;
        boolean z11 = this.L;
        CharSequence[] charSequenceArr = this.v;
        if (z11) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.w;
                if (i11 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.go.b0(charSequenceArr[i11])) && zArr[i11]) {
                    i10++;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        boolean z12 = this.d0;
        int i12 = z12 ? getMessagesController().todoTitleLengthMax : 255;
        int i13 = z12 ? getMessagesController().todoItemLengthMax : 100;
        if ((TextUtils.isEmpty(org.telegram.ui.Components.go.b0(this.F)) || this.F.length() <= 200) && !TextUtils.isEmpty(org.telegram.ui.Components.go.b0(this.E)) && this.E.length() <= i12) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i14 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.go.b0(charSequenceArr[i14]))) {
                    if (charSequenceArr[i14].length() > i13) {
                        i15 = 0;
                        break;
                    }
                    i15++;
                }
                i14++;
            }
            if (i15 >= (z12 ? 1 : 2) && (!this.L || i10 >= 1)) {
                z10 = true;
                this.a.setEnabled((this.L && i10 == 0) || z10);
                this.a.setAlpha(z10 ? 1.0f : 0.5f);
            }
        }
        z10 = false;
        if (this.L) {
            this.a.setEnabled((this.L && i10 == 0) || z10);
            this.a.setAlpha(z10 ? 1.0f : 0.5f);
        }
        this.a.setEnabled((this.L && i10 == 0) || z10);
        this.a.setAlpha(z10 ? 1.0f : 0.5f);
    }

    public final void k0() {
        if (this.B0) {
            this.R.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            h0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void l0(boolean z10) {
        if (this.c0) {
            int i10 = 1;
            if (this.P) {
                org.telegram.ui.Components.sz szVar = this.R;
                szVar.P.C0();
                szVar.I.scrollTo(0, 0);
                szVar.G(1);
                szVar.Q.h1(0, 0);
                this.R.t(false);
                if (z10) {
                    this.R.B();
                }
                this.B0 = false;
                r0(0);
            }
            if (z10) {
                org.telegram.ui.Components.sz szVar2 = this.R;
                if (szVar2 == null || szVar2.getVisibility() != 0) {
                    m0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                ofFloat.addUpdateListener(new fv0(this, i10));
                ofFloat.addListener(new hv0(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                ofFloat.start();
            }
        }
    }

    public final void m0() {
        org.telegram.ui.Components.sz szVar;
        org.telegram.ui.Components.ah emojiButton;
        if (!this.P && (szVar = this.R) != null && szVar.getVisibility() != 8) {
            org.telegram.ui.Cells.h6 h6Var = this.b0;
            if (h6Var != null && (emojiButton = h6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.yg.e, false);
            }
            this.R.setVisibility(8);
        }
        int i10 = this.V;
        this.V = 0;
        if (i10 != 0) {
            this.S.a();
        }
    }

    public final void n0() {
        this.S.e = true;
        EditTextBoldCursor editField = this.b0.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        r0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.Y || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.T = true;
        y5 y5Var = this.y0;
        AndroidUtilities.cancelRunOnUIThread(y5Var);
        AndroidUtilities.runOnUIThread(y5Var, 100L);
    }

    public final void o0(pg pgVar) {
        this.e0 = pgVar;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onBackPressed(boolean z10) {
        if (!this.P) {
            return i0(z10);
        }
        if (!z10) {
            return false;
        }
        l0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (!this.f0 || this.g0 < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= this.c.getChildCount()) {
                view = null;
                break;
            }
            view = this.c.getChildAt(i10);
            this.c.getClass();
            if (RecyclerView.R(view) == this.g0) {
                break;
            } else {
                i10++;
            }
        }
        if (view instanceof org.telegram.ui.Cells.h6) {
            AndroidUtilities.runOnUIThread(new ch(((org.telegram.ui.Cells.h6) view).getTextView(), 5), 300L);
            this.g0 = -1;
        }
        this.f0 = false;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        s0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.U = true;
        if (this.c0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.sz szVar = this.R;
            if (szVar != null) {
                this.e.removeView(szVar);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        if (this.c0) {
            l0(false);
            org.telegram.ui.Components.uz0 uz0Var = this.Q;
            if (uz0Var != null) {
                uz0Var.f();
            }
            org.telegram.ui.Cells.h6 h6Var = this.b0;
            if (h6Var != null) {
                h6Var.setEmojiButtonVisibility(false);
                this.b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.b0.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        mv0 mv0Var = this.b;
        if (mv0Var != null) {
            mv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onThemeColorsChanged() {
        int i10;
        org.telegram.ui.Cells.g6 g6Var;
        super.onThemeColorsChanged();
        try {
            bb1 bb1Var = this.c;
            if (bb1Var == null) {
                return;
            }
            for (int i11 = 0; i11 < bb1Var.getChildCount(); i11++) {
                View childAt = bb1Var.getChildAt(i11);
                s4.e1 T = bb1Var.T(childAt);
                if (T != null && (((i10 = T.f) == 4 || i10 == 5) && (childAt instanceof org.telegram.ui.Cells.h6) && (g6Var = ((org.telegram.ui.Cells.h6) childAt).d) != null)) {
                    g6Var.setTextColor(org.telegram.ui.ActionBar.y6.o1(g6Var.isEnabled() ? 1.0f : 0.6f, getThemedColor(org.telegram.ui.ActionBar.y6.G6)));
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10) {
        q0(messageMedia, z10, -1);
    }

    public final void q0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
        int i11;
        this.z0 = messageMedia;
        this.I = z10;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.E = spannableStringBuilder;
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.E = replaceEmoji;
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.E = replaceAnimatedEmoji;
            MessageObject.addEntitiesToText(replaceAnimatedEmoji, tL_messageMediaToDo.todo.title.entities, false, false, false, false);
            int size = tL_messageMediaToDo.todo.list.size();
            this.y = size;
            this.x = size;
            this.s = 0;
            this.r = new int[size];
            int i12 = 0;
            while (true) {
                i11 = this.y;
                if (i12 >= i11) {
                    break;
                }
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageMediaToDo.todo.list.get(i12).title;
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                CharSequence[] charSequenceArr = this.v;
                charSequenceArr[i12] = spannableStringBuilder2;
                charSequenceArr[i12] = Emoji.replaceEmoji(charSequenceArr[i12], textPaint.getFontMetricsInt(), false);
                charSequenceArr[i12] = MessageObject.replaceAnimatedEmoji(charSequenceArr[i12], tL_textWithEntities.entities, textPaint.getFontMetricsInt());
                MessageObject.addEntitiesToText(charSequenceArr[i12], tL_textWithEntities.entities, false, false, false, false);
                this.r[i12] = tL_messageMediaToDo.todo.list.get(i12).id;
                this.s = Math.max(this.s, this.r[i12]);
                i12++;
            }
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            this.J = todoList.others_can_complete;
            this.H = todoList.others_can_append;
            if (this.I) {
                this.y = i11 + 1;
                s0();
                this.f0 = true;
                int i13 = this.n0;
                if (i10 < 0) {
                    i10 = this.y - 1;
                }
                this.g0 = i13 + i10;
            }
        }
    }

    public final void r0(int i10) {
        org.telegram.ui.Cells.h6 h6Var;
        if (this.c0) {
            int i11 = 0;
            int i12 = 1;
            if (i10 != 1) {
                org.telegram.ui.Components.ah emojiButton = this.b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.yg.e, true);
                }
                org.telegram.ui.Components.sz szVar = this.R;
                if (szVar != null) {
                    this.P = false;
                    this.B0 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        szVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.V = 0;
                }
                this.S.a();
                this.e.requestLayout();
                return;
            }
            org.telegram.ui.Components.sz szVar2 = this.R;
            boolean z10 = szVar2 != null && szVar2.getVisibility() == 0;
            org.telegram.ui.Components.sz szVar3 = this.R;
            if (szVar3 != null && szVar3.c1 != UserConfig.selectedAccount) {
                this.e.removeView(szVar3);
                this.R = null;
            }
            if (this.R == null) {
                org.telegram.ui.Components.sz szVar4 = new org.telegram.ui.Components.sz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.R = szVar4;
                szVar4.x2 = false;
                szVar4.U0 = false;
                szVar4.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.R.setForseMultiwindowLayout(true);
                }
                this.R.setDelegate(new iv0(this));
                this.e.addView(this.R);
            }
            this.R.setVisibility(0);
            this.P = true;
            org.telegram.ui.Components.sz szVar5 = this.R;
            if (this.W <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.W = AndroidUtilities.dp(150.0f);
                } else {
                    this.W = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.X <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.X = AndroidUtilities.dp(150.0f);
                } else {
                    this.X = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i13 = point.x > point.y ? this.X : this.W;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) szVar5.getLayoutParams();
            layoutParams.height = i13;
            szVar5.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (h6Var = this.b0) != null) {
                AndroidUtilities.hideKeyboard(h6Var.getEditField());
            }
            this.V = i13;
            this.S.a();
            this.e.requestLayout();
            org.telegram.ui.Components.ah emojiButton2 = this.b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.yg.d, true);
            }
            if (z10 || this.Y) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
            ofFloat.addUpdateListener(new fv0(this, i11));
            ofFloat.addListener(new hv0(this, i12));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.start();
        }
    }

    public final void s0() {
        this.h0 = -1;
        this.i0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.t0 = -1;
        this.w0 = -1;
        this.q0 = -1;
        this.x0 = 0;
        boolean z10 = this.d0;
        if (!z10 || !this.I) {
            this.h0 = 0;
            this.i0 = 1;
            this.l0 = 2;
            this.x0 = 4;
            this.m0 = 3;
        }
        int i10 = this.y;
        if (i10 != 0) {
            int i11 = this.x0;
            this.n0 = i11;
            this.x0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.x0;
            this.x0 = i12 + 1;
            this.o0 = i12;
        }
        int i13 = this.x0;
        int i14 = i13 + 1;
        this.x0 = i14;
        this.p0 = i13;
        if (z10 && this.I) {
            return;
        }
        int i15 = i13 + 2;
        this.x0 = i15;
        this.q0 = i14;
        if (z10) {
            int i16 = i13 + 3;
            this.x0 = i16;
            this.v0 = i15;
            if (this.J) {
                this.x0 = i13 + 4;
                this.u0 = i16;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f.e;
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            int i17 = this.x0;
            this.x0 = i17 + 1;
            this.r0 = i17;
        }
        int i18 = this.N;
        if (i18 != 1) {
            int i19 = this.x0;
            this.x0 = i19 + 1;
            this.s0 = i19;
        }
        if (i18 == 0) {
            int i20 = this.x0;
            this.x0 = i20 + 1;
            this.t0 = i20;
        }
        int i21 = this.x0;
        int i22 = i21 + 1;
        this.x0 = i22;
        this.w0 = i21;
        if (this.L) {
            this.j0 = i22;
            this.x0 = i21 + 3;
            this.k0 = i21 + 2;
        }
    }
}
