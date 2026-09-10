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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class bw0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.zv0 {
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
    public org.telegram.ui.Components.zy0 Q;
    public org.telegram.ui.Components.rz R;
    public bi.b5 S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public int Z;
    public org.telegram.ui.ActionBar.w0 a;
    public boolean a0;
    public zv0 b;
    public org.telegram.ui.Cells.e6 b0;
    public ic1 c;
    public final boolean c0;
    public s4.c0 d;
    public final boolean d0;
    public jd e;
    public aw0 e0;
    public final eo f;
    public boolean f0;
    public int g0;
    public org.telegram.ui.Components.s40 h;
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
    public final x5 y0;
    public TLRPC.MessageMedia z0;

    public bw0(eo eoVar) {
        super(null);
        this.y = 1;
        this.G = true;
        this.H = false;
        this.J = true;
        this.O = AndroidUtilities.dp(3.0f);
        this.g0 = -1;
        this.y0 = new x5(this, 12);
        this.d0 = true;
        int i10 = getMessagesController().todoItemsMax;
        this.n = i10;
        this.v = new CharSequence[i10];
        this.w = new boolean[i10];
        this.f = eoVar;
        this.c0 = AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium();
        this.L = false;
        this.N = 2;
    }

    public static void c0(bw0 bw0Var, View view, int i10) {
        int length;
        int i11;
        boolean z10 = bw0Var.d0;
        if (view instanceof org.telegram.ui.Cells.e6) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            if (i10 == bw0Var.i0) {
                i11 = z10 ? bw0Var.getMessagesController().todoTitleLengthMax : 255;
                CharSequence charSequence = bw0Var.E;
                length = i11 - (charSequence != null ? charSequence.length() : 0);
            } else if (i10 == bw0Var.j0) {
                Editable editable = bw0Var.F;
                i11 = 200;
                length = 200 - (editable != null ? editable.length() : 0);
            } else {
                int i12 = bw0Var.n0;
                if (i10 < i12 || i10 >= bw0Var.y + i12) {
                    return;
                }
                int i13 = i10 - i12;
                int i14 = z10 ? bw0Var.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence2 = bw0Var.v[i13];
                length = i14 - (charSequence2 != null ? charSequence2.length() : 0);
                i11 = i14;
            }
            float f7 = i11;
            if (length > f7 - (0.7f * f7)) {
                e6Var.setText2("");
                return;
            }
            e6Var.setText2(String.format("%d", Integer.valueOf(length)));
            org.telegram.ui.ActionBar.l5 textView2 = e6Var.getTextView2();
            int i15 = length < 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            textView2.setTag(Integer.valueOf(i15));
        }
    }

    public static void d0(bw0 bw0Var, org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        if (bw0Var.c0 && z10) {
            if (bw0Var.b0 == e6Var && bw0Var.P && bw0Var.B0) {
                bw0Var.j0();
                bw0Var.P = false;
            }
            org.telegram.ui.Cells.e6 e6Var2 = bw0Var.b0;
            bw0Var.b0 = e6Var;
            e6Var.setEmojiButtonVisibility(true);
            org.telegram.ui.Components.dh emojiButton = e6Var.getEmojiButton();
            org.telegram.ui.Components.bh bhVar = org.telegram.ui.Components.bh.e;
            emojiButton.j(bhVar, false);
            ic1 ic1Var = bw0Var.c;
            View F = ic1Var.F(e6Var);
            s4.c1 T = F == null ? null : ic1Var.T(F);
            org.telegram.ui.Components.zy0 zy0Var = bw0Var.Q;
            if (zy0Var != null) {
                zy0Var.f();
                org.telegram.ui.Components.zy0 zy0Var2 = bw0Var.Q;
                if (zy0Var2 != null && T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.e6) && zy0Var2.getDelegate() != view) {
                        bw0Var.Q.setDelegate((org.telegram.ui.Cells.e6) view);
                    }
                }
            }
            if (e6Var2 == null || e6Var2 == e6Var) {
                return;
            }
            if (bw0Var.P) {
                bw0Var.j0();
                bw0Var.k0(false);
                bw0Var.m0();
            }
            e6Var2.setEmojiButtonVisibility(false);
            e6Var2.getEmojiButton().j(bhVar, false);
        }
    }

    public static void e0(bw0 bw0Var, org.telegram.ui.Cells.e6 e6Var) {
        bw0Var.b0 = e6Var;
        if (!bw0Var.P) {
            bw0Var.q0(1);
        } else {
            bw0Var.j0();
            bw0Var.m0();
        }
    }

    @Override // org.telegram.ui.Components.zv0
    public final void H(int i10, boolean z10) {
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
                        g0(z12 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
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
            org.telegram.ui.Cells.e6 e6Var = this.b0;
            if (e6Var != null) {
                this.Y = e6Var.getEditField().isFocused() && this.S.c() && i10 > 0;
            } else {
                this.Y = false;
            }
            if (this.Y && this.P) {
                q0(0);
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

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        String upperCase;
        this.actionBar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.d6));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        lVar.C(getThemedColor(i10), false);
        this.actionBar.C(getThemedColor(i10), true);
        this.actionBar.A(getThemedColor(org.telegram.ui.ActionBar.j6.z8), false);
        this.actionBar.setTitleColor(getThemedColor(i10));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.d0;
        if (z10) {
            this.actionBar.setTitle(LocaleController.getString(this.I ? R.string.TodoAddTasksTitle : R.string.TodoEditTitle));
        } else if (this.N == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && ((ActionBarLayout) f5Var).M0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new tv0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (z10) {
            upperCase = LocaleController.getString(this.I ? R.string.TodoAddTasksButton : R.string.TodoEditTasksButton);
        } else {
            upperCase = LocaleController.getString(R.string.Create).toUpperCase();
        }
        this.a = n10.e(1, upperCase);
        this.b = new zv0(this, context);
        jd jdVar = new jd(3, context, this);
        this.e = jdVar;
        jdVar.setDelegate(this);
        jd jdVar2 = this.e;
        this.fragmentView = jdVar2;
        jdVar2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        this.c = new ic1(context, 10, null);
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.wr.h);
        jVar.n(350L);
        this.c.setItemAnimator(jVar);
        this.c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.c.getItemAnimator()).C = false;
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        this.c.setLayoutManager(c0Var);
        new s4.y(new ai.k(this, 6)).d(this.c);
        frameLayout.addView(this.c, w7.a6.e(-1, -1, 51));
        this.c.setAdapter(this.b);
        int i11 = 23;
        this.c.setOnItemClickListener(new i(this, i11));
        this.c.setOnScrollListener(new j3(this, i11));
        org.telegram.ui.Components.s40 s40Var = new org.telegram.ui.Components.s40(context, 4);
        this.h = s40Var;
        s40Var.setText(LocaleController.getString(R.string.PollTapToSelect));
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        frameLayout.addView(this.h, w7.a6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        if (this.c0) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.zy0 zy0Var = new org.telegram.ui.Components.zy0(context, this.currentAccount, null, this.resourceProvider);
            this.Q = zy0Var;
            zy0Var.y = true;
            zy0Var.E = true;
            zy0Var.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            frameLayout.addView(this.Q, w7.a6.e(-2, 160, 51));
        }
        this.S = new bi.b5(this.e, false, null);
        i0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.Components.rz rzVar = this.R;
            if (rzVar != null) {
                rzVar.P.e1();
            }
            org.telegram.ui.Cells.e6 e6Var = this.b0;
            if (e6Var != null) {
                int currentTextColor = e6Var.getEditField().getCurrentTextColor();
                this.b0.getEditField().setTextColor(-1);
                this.b0.getEditField().setTextColor(currentTextColor);
            }
        }
    }

    public final void f0() {
        int i10;
        org.telegram.ui.Components.zy0 zy0Var = this.Q;
        if (zy0Var != null) {
            zy0Var.setDelegate(null);
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
        r0();
        this.f0 = false;
        this.g0 = (this.n0 + this.y) - 1;
        this.b.m(this.p0);
    }

    public final void g0(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new og(this, f7, 3));
        ofFloat.addListener(new uv0(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
        ofFloat.start();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.e6.class, org.telegram.ui.Cells.x8.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i11 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i12 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i13 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"moveImageView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 196608, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 262144, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i15 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 32, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i14));
        return arrayList;
    }

    public final boolean h0(boolean z10) {
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
            boolean z13 = (this.I || TextUtils.equals(todoList.title.text, org.telegram.ui.Components.zn.Y(this.E))) && i10 == todoList.list.size();
            if (z13) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (!TextUtils.equals(charSequenceArr[i12].toString(), todoList.list.get(i12).title.text)) {
                        break;
                    }
                }
            }
            z12 = z13;
        } else {
            boolean isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.zn.Y(this.E));
            if (isEmpty) {
                for (int i13 = 0; i13 < this.y && (isEmpty = TextUtils.isEmpty(org.telegram.ui.Components.zn.Y(charSequenceArr[i13]))); i13++) {
                }
            }
            z12 = isEmpty;
        }
        if (z10 && !z12) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z14 = this.d0;
            alertDialog$Builder.a.R = LocaleController.getString(z14 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(z14 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new ul0(this, 4));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(alertDialog$Builder.a);
        }
        return z12;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean hideKeyboardOnShow() {
        return this.g0 < 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0() {
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
                if (!TextUtils.isEmpty(org.telegram.ui.Components.zn.Y(charSequenceArr[i11])) && zArr[i11]) {
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
        if ((TextUtils.isEmpty(org.telegram.ui.Components.zn.Y(this.F)) || this.F.length() <= 200) && !TextUtils.isEmpty(org.telegram.ui.Components.zn.Y(this.E)) && this.E.length() <= i12) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                if (i14 >= charSequenceArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(org.telegram.ui.Components.zn.Y(charSequenceArr[i14]))) {
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

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().H0) {
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false);
            if (this.actionBar.s()) {
                w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.w8, false);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    public final void j0() {
        if (this.B0) {
            this.R.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.R.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.R.setLayoutParams(layoutParams);
            this.V = layoutParams.height;
            this.A0 = this.B0;
            this.B0 = false;
            g0(-AndroidUtilities.dp(120.0f));
        }
    }

    public final void k0(boolean z10) {
        if (this.c0) {
            int i10 = 1;
            if (this.P) {
                org.telegram.ui.Components.rz rzVar = this.R;
                rzVar.P.B0();
                rzVar.I.scrollTo(0, 0);
                rzVar.H(1);
                rzVar.Q.h1(0, 0);
                this.R.t(false);
                if (z10) {
                    this.R.A();
                }
                this.B0 = false;
                q0(0);
            }
            if (z10) {
                org.telegram.ui.Components.rz rzVar2 = this.R;
                if (rzVar2 == null || rzVar2.getVisibility() != 0) {
                    l0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.R.getMeasuredHeight());
                ofFloat.addUpdateListener(new sv0(this, i10));
                ofFloat.addListener(new uv0(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                ofFloat.start();
            }
        }
    }

    public final void l0() {
        org.telegram.ui.Components.rz rzVar;
        org.telegram.ui.Components.dh emojiButton;
        if (!this.P && (rzVar = this.R) != null && rzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.e6 e6Var = this.b0;
            if (e6Var != null && (emojiButton = e6Var.getEmojiButton()) != null) {
                emojiButton.j(org.telegram.ui.Components.bh.e, false);
            }
            this.R.setVisibility(8);
        }
        int i10 = this.V;
        this.V = 0;
        if (i10 != 0) {
            this.S.a();
        }
    }

    public final void m0() {
        this.S.e = true;
        EditTextBoldCursor editField = this.b0.getEditField();
        editField.requestFocus();
        AndroidUtilities.showKeyboard(editField);
        q0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.Y || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.T = true;
        x5 x5Var = this.y0;
        AndroidUtilities.cancelRunOnUIThread(x5Var);
        AndroidUtilities.runOnUIThread(x5Var, 100L);
    }

    public final void n0(zg zgVar) {
        this.e0 = zgVar;
    }

    public final void o0(TLRPC.MessageMedia messageMedia, boolean z10) {
        p0(messageMedia, z10, -1);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z10) {
        if (!this.P) {
            return h0(z10);
        }
        if (!z10) {
            return false;
        }
        k0(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
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
        if (view instanceof org.telegram.ui.Cells.e6) {
            AndroidUtilities.runOnUIThread(new kh(5, ((org.telegram.ui.Cells.e6) view).getTextView()), 300L);
            this.g0 = -1;
        }
        this.f0 = false;
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
        this.U = true;
        if (this.c0) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            org.telegram.ui.Components.rz rzVar = this.R;
            if (rzVar != null) {
                this.e.removeView(rzVar);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        if (this.c0) {
            k0(false);
            org.telegram.ui.Components.zy0 zy0Var = this.Q;
            if (zy0Var != null) {
                zy0Var.f();
            }
            org.telegram.ui.Cells.e6 e6Var = this.b0;
            if (e6Var != null) {
                e6Var.setEmojiButtonVisibility(false);
                this.b0.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.b0.getEditField());
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        zv0 zv0Var = this.b;
        if (zv0Var != null) {
            zv0Var.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.MessageMedia messageMedia, boolean z10, int i10) {
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
                r0();
                this.f0 = true;
                int i13 = this.n0;
                if (i10 < 0) {
                    i10 = this.y - 1;
                }
                this.g0 = i13 + i10;
            }
        }
    }

    public final void q0(int i10) {
        org.telegram.ui.Cells.e6 e6Var;
        if (this.c0) {
            int i11 = 0;
            int i12 = 1;
            if (i10 != 1) {
                org.telegram.ui.Components.dh emojiButton = this.b0.getEmojiButton();
                if (emojiButton != null) {
                    emojiButton.j(org.telegram.ui.Components.bh.e, true);
                }
                org.telegram.ui.Components.rz rzVar = this.R;
                if (rzVar != null) {
                    this.P = false;
                    this.B0 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        rzVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.V = 0;
                }
                this.S.a();
                this.e.requestLayout();
                return;
            }
            org.telegram.ui.Components.rz rzVar2 = this.R;
            boolean z10 = rzVar2 != null && rzVar2.getVisibility() == 0;
            org.telegram.ui.Components.rz rzVar3 = this.R;
            if (rzVar3 != null && rzVar3.c1 != UserConfig.selectedAccount) {
                this.e.removeView(rzVar3);
                this.R = null;
            }
            if (this.R == null) {
                org.telegram.ui.Components.rz rzVar4 = new org.telegram.ui.Components.rz(null, true, false, false, getParentActivity(), true, null, null, true, this.resourceProvider, false, false);
                this.R = rzVar4;
                rzVar4.x2 = false;
                rzVar4.U0 = false;
                rzVar4.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.R.setForseMultiwindowLayout(true);
                }
                this.R.setDelegate(new vv0(this));
                this.e.addView(this.R);
            }
            this.R.setVisibility(0);
            this.P = true;
            org.telegram.ui.Components.rz rzVar5 = this.R;
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
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) rzVar5.getLayoutParams();
            layoutParams.height = i13;
            rzVar5.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (e6Var = this.b0) != null) {
                AndroidUtilities.hideKeyboard(e6Var.getEditField());
            }
            this.V = i13;
            this.S.a();
            this.e.requestLayout();
            org.telegram.ui.Components.dh emojiButton2 = this.b0.getEmojiButton();
            if (emojiButton2 != null) {
                emojiButton2.j(org.telegram.ui.Components.bh.d, true);
            }
            if (z10 || this.Y) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.V, 0.0f);
            ofFloat.addUpdateListener(new sv0(this, i11));
            ofFloat.addListener(new uv0(this, i12));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
            ofFloat.start();
        }
    }

    public final void r0() {
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
