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
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class hv0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.pv0 {
    public CharSequence B;
    public Editable C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final int K;
    public int L;
    public boolean M;
    public org.telegram.ui.Components.ry0 N;
    public org.telegram.ui.Components.mz O;
    public qh.i3 P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public int W;
    public boolean X;
    public org.telegram.ui.Cells.c6 Y;
    public final boolean Z;
    public org.telegram.ui.ActionBar.w0 a;
    public final boolean a0;
    public fv0 b;
    public gv0 b0;
    public kb1 c;
    public boolean c0;
    public f2.j0 d;
    public int d0;
    public jd e;
    public int e0;
    public final xn f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.m40 h;
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
    public final z5 v0;
    public final boolean[] w;
    public TLRPC.MessageMedia w0;
    public int x;
    public boolean x0;
    public int y;
    public boolean y0;

    public hv0(xn xnVar) {
        super(null);
        this.y = 1;
        this.D = true;
        this.E = false;
        this.G = true;
        this.L = AndroidUtilities.dp(3.0f);
        this.d0 = -1;
        this.v0 = new z5(this, 12);
        this.a0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.n = i10;
        this.v = new CharSequence[i10];
        this.w = new boolean[i10];
        this.f = xnVar;
        this.Z = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.I = false;
        this.K = 2;
    }

    public static void c0(hv0 hv0Var, View view, int i10) {
        int length;
        int i11;
        boolean z4 = hv0Var.a0;
        if (view instanceof org.telegram.ui.Cells.c6) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            if (i10 == hv0Var.f0) {
                i11 = z4 ? hv0Var.getMessagesController().todoTitleLengthMax : 255;
                CharSequence charSequence = hv0Var.B;
                length = i11 - (charSequence != null ? charSequence.length() : 0);
            } else if (i10 == hv0Var.g0) {
                Editable editable = hv0Var.C;
                i11 = 200;
                length = 200 - (editable != null ? editable.length() : 0);
            } else {
                int i12 = hv0Var.k0;
                if (i10 < i12 || i10 >= hv0Var.y + i12) {
                    return;
                }
                int i13 = i10 - i12;
                int i14 = z4 ? hv0Var.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence2 = hv0Var.v[i13];
                length = i14 - (charSequence2 != null ? charSequence2.length() : 0);
                i11 = i14;
            }
            float f10 = i11;
            if (length > f10 - (0.7f * f10)) {
                c6Var.setText2("");
                return;
            }
            c6Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.l5 textView2 = c6Var.getTextView2();
            int i15 = length < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i15, false));
            textView2.setTag(Integer.valueOf(i15));
        }
    }

    public static void d0(hv0 hv0Var, org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        if (hv0Var.Z && z4) {
            if (hv0Var.Y == c6Var && hv0Var.M && hv0Var.y0) {
                hv0Var.j0();
                hv0Var.M = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = hv0Var.Y;
            hv0Var.Y = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.qg emojiButton = c6Var.getEmojiButton();
            org.telegram.ui.Components.og ogVar = org.telegram.ui.Components.og.e;
            emojiButton.j(ogVar, false);
            kb1 kb1Var = hv0Var.c;
            View F = kb1Var.F(c6Var);
            f2.m1 T = F == null ? null : kb1Var.T(F);
            org.telegram.ui.Components.ry0 ry0Var = hv0Var.N;
            if (ry0Var != null) {
                ry0Var.f();
                org.telegram.ui.Components.ry0 ry0Var2 = hv0Var.N;
                if (ry0Var2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && ry0Var2.getDelegate() != view) {
                        hv0Var.N.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 == null || c6Var2 == c6Var) {
                return;
            }
            if (hv0Var.M) {
                hv0Var.j0();
                hv0Var.k0(false);
                hv0Var.m0();
            }
            c6Var2.setEmojiButtonVisibility(false);
            c6Var2.getEmojiButton().j(ogVar, false);
        }
    }

    public static void e0(hv0 hv0Var, org.telegram.ui.Cells.c6 c6Var) {
        hv0Var.Y = c6Var;
        if (!hv0Var.M) {
            hv0Var.q0(1);
        } else {
            hv0Var.j0();
            hv0Var.m0();
        }
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        boolean z10;
        if (this.Z) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.V && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z4) {
                    this.U = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.U).commit();
                } else {
                    this.T = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.T).commit();
                }
            }
            if (this.M) {
                int i11 = z4 ? this.U : this.T;
                if (this.y0) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.x0 != this.y0) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.O.setLayoutParams(layoutParams);
                    this.S = layoutParams.height;
                    this.P.a();
                    this.e.requestLayout();
                    boolean z11 = this.x0;
                    if (z11 != this.y0) {
                        g0(z11 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.x0 = this.y0;
                }
            }
            if (this.W == i10 && this.X == z4) {
                return;
            }
            this.W = i10;
            this.X = z4;
            boolean z12 = this.V;
            org.telegram.ui.Cells.c6 c6Var = this.Y;
            if (c6Var != null) {
                this.V = c6Var.getEditField().isFocused() && this.P.c() && i10 > 0;
            } else {
                this.V = false;
            }
            if (this.V && this.M) {
                q0(0);
            }
            if (this.S != 0 && !(z10 = this.V) && z10 != z12 && !this.M) {
                this.S = 0;
                this.P.a();
                this.e.requestLayout();
            }
            if (this.V && this.Q) {
                this.Q = false;
                AndroidUtilities.cancelRunOnUIThread(this.v0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        String upperCase;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        kVar.C(getThemedColor(i10), false);
        this.actionBar.C(getThemedColor(i10), true);
        this.actionBar.B(getThemedColor(org.telegram.ui.ActionBar.k6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i10));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z4 = this.a0;
        if (z4) {
            this.actionBar.setTitle(LocaleController.getString(this.F ? R.string.TodoAddTasksTitle : R.string.TodoEditTitle));
        } else if (this.K == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new zu0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (z4) {
            upperCase = LocaleController.getString(this.F ? R.string.TodoAddTasksButton : R.string.TodoEditTasksButton);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.a = n10.e(1, upperCase);
        this.b = new fv0(this, context);
        jd jdVar = new jd(3, context, this);
        this.e = jdVar;
        jdVar.setDelegate(this);
        jd jdVar2 = this.e;
        this.fragmentView = jdVar2;
        jdVar2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new kb1(context, 10, null);
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.n(350L);
        this.c.setItemAnimator(lVar);
        this.c.setVerticalScrollBarEnabled(false);
        ((f2.l) this.c.getItemAnimator()).C = false;
        f2.j0 j0Var = new f2.j0(1, false);
        this.d = j0Var;
        this.c.setLayoutManager(j0Var);
        new f2.f0(new cp(this, 5)).d(this.c);
        frameLayout.addView(this.c, k7.c6.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        this.c.setOnItemClickListener(new j(this, 22));
        this.c.setOnScrollListener(new l3(this, 24));
        org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(context, 4);
        this.h = m40Var;
        m40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, k7.c6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.Z) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.ry0 ry0Var = new org.telegram.ui.Components.ry0(context, this.currentAccount, null, this.resourceProvider);
            this.N = ry0Var;
            ry0Var.y = true;
            ry0Var.B = true;
            ry0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.N, k7.c6.e(-2, 160, 51));
        }
        this.P = new qh.i3(this.e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.mz mzVar = this.O;
            if (mzVar != null) {
                mzVar.M.f1();
            }
            org.telegram.ui.Cells.c6 c6Var = this.Y;
            if (c6Var != null) {
                int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                this.Y.getEditField().setTextColor(-1);
                this.Y.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.ry0 ry0Var = this.N;
        if (ry0Var != null) {
            ry0Var.setDelegate(null);
            this.N.f();
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
            this.b.u(this.l0);
        }
        this.b.o(this.l0);
        r0();
        this.c0 = false;
        this.d0 = (this.k0 + this.y) - 1;
        this.b.m(this.m0);
    }

    public final void g0(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new gg(this, f10, 3));
        ofFloat.addListener(new av0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.o8.class, org.telegram.ui.Cells.c6.class, org.telegram.ui.Cells.s8.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        int i11 = org.telegram.ui.ActionBar.k6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.H6));
        int i13 = org.telegram.ui.ActionBar.k6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.M6));
        int i15 = org.telegram.ui.ActionBar.k6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 32, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.c, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z4) {
        TLRPC.MessageMedia messageMedia = this.w0;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaToDo;
        CharSequence[] charSequenceArr = this.v;
        boolean z11 = false;
        if (z10) {
            TLRPC.TodoList todoList = ((TLRPC.TL_messageMediaToDo) messageMedia).todo;
            int i10 = 0;
            for (int i11 = 0; i11 < Math.min(this.y, charSequenceArr.length); i11++) {
                if (!TextUtils.isEmpty(charSequenceArr[i11])) {
                    i10++;
                }
            }
            boolean z12 = (this.F || TextUtils.equals(todoList.title.text, org.telegram.ui.Components.sn.Y(this.B))) && i10 == todoList.list.size();
            if (z12) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (!TextUtils.equals(charSequenceArr[i12].toString(), todoList.list.get(i12).title.text)) {
                        break;
                    }
                }
            }
            z11 = z12;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.sn.Y(this.B));
            if (isEmpty) {
                for (int i13 = 0; i13 < this.y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.sn.Y(charSequenceArr[i13]))); i13++) {
                }
            }
            z11 = isEmpty;
        }
        if (z4 && !z11) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z13 = this.a0;
            alertDialog$Builder.a.O = LocaleController.getString(z13 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(z13 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new kl0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.a);
        }
        return z11;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean hideKeyboardOnShow() {
        return this.d0 < 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0() {
        int i10;
        boolean z4;
        boolean z10 = this.I;
        CharSequence[] charSequenceArr = this.v;
        if (z10) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.w;
                if (i11 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.sn.Y(charSequenceArr[i11])) && zArr[i11]) {
                    i10++;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        boolean z11 = this.a0;
        int i12 = z11 ? getMessagesController().todoTitleLengthMax : 255;
        int i13 = z11 ? getMessagesController().todoItemLengthMax : 100;
        if ((TextUtils.isEmpty(org.telegram.ui.Components.sn.Y(this.C)) || this.C.length() <= 200) && !TextUtils.isEmpty(org.telegram.ui.Components.sn.Y(this.B)) && this.B.length() <= i12) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i14 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.sn.Y(charSequenceArr[i14]))) {
                    if (charSequenceArr[i14].length() > i13) {
                        i15 = 0;
                        break;
                    }
                    i15++;
                }
                i14++;
            }
            if (i15 >= (z11 ? 1 : 2) && (!this.I || i10 >= 1)) {
                z4 = true;
                this.a.setEnabled((this.I && i10 == 0) || z4);
                this.a.setAlpha(z4 ? 1.0f : 0.5f);
            }
        }
        z4 = false;
        if (this.I) {
            this.a.setEnabled((this.I && i10 == 0) || z4);
            this.a.setAlpha(z4 ? 1.0f : 0.5f);
        }
        this.a.setEnabled((this.I && i10 == 0) || z4);
        this.a.setAlpha(z4 ? 1.0f : 0.5f);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().E0) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.y0) {
            this.O.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.O.setLayoutParams(layoutParams);
            this.S = layoutParams.height;
            this.x0 = this.y0;
            this.y0 = false;
            g0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void k0(boolean z4) {
        if (this.Z) {
            int i10 = 1;
            if (this.M) {
                org.telegram.ui.Components.mz mzVar = this.O;
                mzVar.M.B0();
                mzVar.F.scrollTo(0, 0);
                mzVar.G(1);
                mzVar.N.h1(0, 0);
                this.O.t(false);
                if (z4) {
                    this.O.B();
                }
                this.y0 = false;
                q0(0);
            }
            if (z4) {
                org.telegram.ui.Components.mz mzVar2 = this.O;
                if (mzVar2 == null || mzVar2.getVisibility() != 0) {
                    l0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.O.getMeasuredHeight());
                ofFloat.addUpdateListener(new yu0(this, i10));
                ofFloat.addListener(new av0(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                ofFloat.start();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.mz mzVar;
        org.telegram.ui.Components.qg emojiButton;
        if (!this.M && (mzVar = this.O) != null && mzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.Y;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.og.e, false);
            }
            this.O.setVisibility(8);
        }
        int i10 = this.S;
        this.S = 0;
        if (i10 != 0) {
            this.P.a();
        }
    }

    public final void m0() {
        this.P.e = true;
        EditTextBoldCursor editField = this.Y.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        q0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.V || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.Q = true;
        z5 z5Var = this.v0;
        AndroidUtilities.cancelRunOnUIThread(z5Var);
        AndroidUtilities.runOnUIThread(z5Var, 100L);
    }

    public final void n0(rg rgVar) {
        this.b0 = rgVar;
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z4) {
        p0(messageMedia, z4, -1);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        if (!this.M) {
            return h0(z4);
        }
        if (!z4) {
            return false;
        }
        k0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        View view;
        super.onBecomeFullyVisible();
        if (!this.c0 || this.d0 < 0) {
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
            if (RecyclerView.R(view) == this.d0) {
                break;
            } else {
                i10++;
            }
        }
        if (view instanceof org.telegram.ui.Cells.c6) {
            AndroidUtilities.runOnUIThread(new ch(5, ((org.telegram.ui.Cells.c6) view).getTextView()), 300L);
            this.d0 = -1;
        }
        this.c0 = false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        r0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        this.R = true;
        if (this.Z) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.mz mzVar = this.O;
            if (mzVar != null) {
                this.e.removeView(mzVar);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        if (this.Z) {
            k0(false);
            org.telegram.ui.Components.ry0 ry0Var = this.N;
            if (ry0Var != null) {
                ry0Var.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.Y;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.Y.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.Y.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        fv0 fv0Var = this.b;
        if (fv0Var != null) {
            fv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z4, int i10) {
        int i11;
        this.w0 = messageMedia;
        this.F = z4;
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_messageMediaToDo.todo.title.text);
            this.B = spannableStringBuilder;
            CharSequence replaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
            this.B = replaceEmoji;
            Spannable replaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(replaceEmoji, tL_messageMediaToDo.todo.title.entities, textPaint.getFontMetricsInt());
            this.B = replaceAnimatedEmoji;
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
            this.G = todoList.others_can_complete;
            this.E = todoList.others_can_append;
            if (this.F) {
                this.y = i11 + 1;
                r0();
                this.c0 = true;
                int i13 = this.k0;
                if (i10 < 0) {
                    i10 = this.y - 1;
                }
                this.d0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        org.telegram.ui.Cells.c6 c6Var;
        if (this.Z) {
            int i11 = 0;
            int i12 = 1;
            if (i10 != 1) {
                org.telegram.ui.Components.qg emojiButton = this.Y.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.og.e, true);
                }
                org.telegram.ui.Components.mz mzVar = this.O;
                if (mzVar != null) {
                    this.M = false;
                    this.y0 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        mzVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.S = 0;
                }
                this.P.a();
                this.e.requestLayout();
                return;
            }
            org.telegram.ui.Components.mz mzVar2 = this.O;
            boolean z4 = mzVar2 != null && mzVar2.getVisibility() == 0;
            org.telegram.ui.Components.mz mzVar3 = this.O;
            if (mzVar3 != null && mzVar3.Z0 != UserConfig.selectedAccount) {
                this.e.removeView(mzVar3);
                this.O = null;
            }
            if (this.O == null) {
                org.telegram.ui.Components.mz mzVar4 = new org.telegram.ui.Components.mz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.O = mzVar4;
                mzVar4.u2 = false;
                mzVar4.R0 = false;
                mzVar4.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.O.setForseMultiwindowLayout(true);
                }
                this.O.setDelegate(new bv0(this));
                this.e.addView(this.O);
            }
            this.O.setVisibility(0);
            this.M = true;
            org.telegram.ui.Components.mz mzVar5 = this.O;
            if (this.T <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.T = AndroidUtilities.dp(150.0f);
                } else {
                    this.T = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.U <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.U = AndroidUtilities.dp(150.0f);
                } else {
                    this.U = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i13 = point.x > point.y ? this.U : this.T;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mzVar5.getLayoutParams();
            layoutParams.height = i13;
            mzVar5.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.Y) != null) {
                AndroidUtilities.hideKeyboard(c6Var.getEditField());
            }
            this.S = i13;
            this.P.a();
            this.e.requestLayout();
            org.telegram.ui.Components.qg emojiButton2 = this.Y.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.og.d, true);
            }
            if (z4 || this.V) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S, 0.0f);
            ofFloat.addUpdateListener(new yu0(this, i11));
            ofFloat.addListener(new av0(this, i12));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
            ofFloat.start();
        }
    }

    public final void r0() {
        this.e0 = -1;
        this.f0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.q0 = -1;
        this.t0 = -1;
        this.n0 = -1;
        this.u0 = 0;
        boolean z4 = this.a0;
        if (!z4 || !this.F) {
            this.e0 = 0;
            this.f0 = 1;
            this.i0 = 2;
            this.u0 = 4;
            this.j0 = 3;
        }
        int i10 = this.y;
        if (i10 != 0) {
            int i11 = this.u0;
            this.k0 = i11;
            this.u0 = i11 + i10;
        }
        if (i10 != this.v.length) {
            int i12 = this.u0;
            this.u0 = i12 + 1;
            this.l0 = i12;
        }
        int i13 = this.u0;
        int i14 = i13 + 1;
        this.u0 = i14;
        this.m0 = i13;
        if (z4 && this.F) {
            return;
        }
        int i15 = i13 + 2;
        this.u0 = i15;
        this.n0 = i14;
        if (z4) {
            int i16 = i13 + 3;
            this.u0 = i16;
            this.s0 = i15;
            if (this.G) {
                this.u0 = i13 + 4;
                this.r0 = i16;
                return;
            }
            return;
        }
        TLRPC.Chat chat = this.f.e;
        if (!ChatObject.isChannel(chat) || chat.megagroup) {
            int i17 = this.u0;
            this.u0 = i17 + 1;
            this.o0 = i17;
        }
        int i18 = this.K;
        if (i18 != 1) {
            int i19 = this.u0;
            this.u0 = i19 + 1;
            this.p0 = i19;
        }
        if (i18 == 0) {
            int i20 = this.u0;
            this.u0 = i20 + 1;
            this.q0 = i20;
        }
        int i21 = this.u0;
        int i22 = i21 + 1;
        this.u0 = i22;
        this.t0 = i21;
        if (this.I) {
            this.g0 = i22;
            this.u0 = i21 + 3;
            this.h0 = i21 + 2;
        }
    }
}
