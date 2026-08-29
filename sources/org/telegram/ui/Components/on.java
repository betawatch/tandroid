package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.wa1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class on extends fi implements gv0, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int i1 = 0;
    public fz A;
    public int A0;
    public final nh.w3 B;
    public int B0;
    public boolean C;
    public int C0;
    public boolean D;
    public int D0;
    public final boolean E;
    public int E0;
    public final int F;
    public int F0;
    public final CharSequence[] G;
    public int G0;
    public final boolean[] H;
    public int H0;
    public int I;
    public final m.a I0;
    public Editable J;
    public final m.a J0;
    public Editable K;
    public final m.a[] K0;
    public Editable L;
    public final ArrayList L0;
    public final bh.w M;
    public int M0;
    public boolean N;
    public int N0;
    public boolean O;
    public final int O0;
    public boolean P;
    public final int[] P0;
    public int Q;
    public final lh.m7 Q0;
    public int R;
    public boolean R0;
    public boolean S;
    public int S0;
    public boolean T;
    public boolean T0;
    public boolean U;
    public int U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean W0;
    public int X0;
    public int Y0;
    public int Z0;
    public final boolean a0;
    public boolean a1;
    public boolean b0;
    public boolean b1;
    public boolean c0;
    public org.telegram.ui.Cells.a6 c1;
    public boolean d0;
    public boolean d1;
    public boolean e0;
    public boolean e1;
    public nn f0;
    public xm f1;
    public int g0;
    public int g1;
    public int h0;
    public final bh.i h1;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final boolean n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final mn r;
    public int r0;
    public final wa1 s;
    public int s0;
    public int t0;
    public int u0;
    public final cn v;
    public int v0;
    public final gj w;
    public int w0;
    public final en x;
    public int x0;
    public final g40 y;
    public int y0;
    public int z0;

    public on(ni niVar, Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, Boolean bool) {
        super(context, c6Var, niVar);
        this.I = 1;
        this.N = true;
        this.O = true;
        this.P = true;
        this.U = true;
        this.b0 = true;
        this.c0 = true;
        this.g0 = -1;
        m.a aVar = new m.a(this);
        this.I0 = aVar;
        m.a aVar2 = new m.a(this);
        this.J0 = aVar2;
        int i10 = 2;
        this.K0 = new m.a[]{aVar, aVar2};
        ArrayList arrayList = new ArrayList();
        this.L0 = arrayList;
        this.P0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.Q0 = new lh.m7(this, 18);
        this.R0 = false;
        this.S0 = -1;
        this.d1 = false;
        this.e1 = false;
        Paint paint = new Paint(1);
        this.h1 = new bh.i();
        this.n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.F = answersMaxCount;
        this.G = new CharSequence[answersMaxCount];
        this.H = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.b.F1).getUserConfig().isPremium();
        this.E = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.V = booleanValue;
            this.a0 = booleanValue;
            boolean z11 = !booleanValue;
            this.P = z11;
            this.N = z11;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.hl, this.a));
        this.b.n1.setDelegate(this);
        mn mnVar = new mn(this, context);
        this.r = mnVar;
        wa1 wa1Var = new wa1(context, 4, null);
        this.s = wa1Var;
        this.c = wa1Var;
        this.d = wa1Var;
        this.h = true;
        this.f = true;
        cn cnVar = new cn(this);
        this.v = cnVar;
        wa1Var.setItemAnimator(cnVar);
        arrayList.clear();
        cnVar.m = false;
        cnVar.C = false;
        cnVar.o(jr.h);
        cnVar.n(350L);
        wa1Var.setClipToPadding(false);
        wa1Var.setVerticalScrollBarEnabled(false);
        wa1Var.setSections(true);
        gj gjVar = new gj(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, wa1Var, 3);
        this.w = gjVar;
        wa1Var.setLayoutManager(gjVar);
        gjVar.O = true;
        new f2.e0(new mh.f(this, i10)).d(wa1Var);
        addView(wa1Var, i7.f6.e(-1, -1, 51));
        wa1Var.setPreserveFocusAfterLayout(true);
        wa1Var.setAdapter(mnVar);
        wa1Var.setOnItemClickListener(new qm(this, c6Var, niVar, context));
        wa1Var.setOnScrollListener(new cg.g2(this, 25));
        g40 g40Var = new g40(context, 4);
        this.y = g40Var;
        g40Var.setAlpha(0.0f);
        g40Var.setVisibility(4);
        addView(g40Var, i7.f6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.O0 = MessagesController.getInstance(this.b.F1).config.pollCaptionLengthMax.get();
        this.M = new bh.w(this.b.F1);
        NotificationCenter.getInstance(this.b.F1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            en enVar = new en(context, this.b.F1, null, c6Var);
            this.x = enVar;
            enVar.y = true;
            enVar.A = true;
            enVar.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView(enVar, i7.f6.e(-2, 160, 51));
        }
        this.B = new nh.w3(this.b.n1, false, null);
        T();
    }

    public static void J(on onVar, int i10) {
        g40 g40Var = onVar.y;
        f2.n1 K = onVar.s.K(onVar.p0 + i10);
        if (K != null) {
            View view = K.a;
            if (view instanceof org.telegram.ui.Cells.a6) {
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                if (a6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    en enVar = onVar.x;
                    if (enVar != null) {
                        enVar.f();
                    }
                    g40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    g40Var.f(a6Var.getCheckBox(), true);
                    ImageView imageView = g40Var.c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    g40Var.setTranslationY(g40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void K(on onVar, View view, int i10) {
        int length;
        int i11;
        int length2;
        float f9;
        boolean z10 = onVar.n;
        if (!(view instanceof org.telegram.ui.Cells.a6)) {
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
        if (i10 == onVar.j0) {
            i11 = onVar.O0;
            Editable editable = onVar.K;
            if (editable != null) {
                length2 = editable.length();
                length = i11 - length2;
                f9 = i11;
                if (length > f9 - (0.7f * f9)) {
                    a6Var.setText2("");
                    return;
                }
                a6Var.setText2(String.format("%d", Integer.valueOf(length)));
                org.telegram.ui.ActionBar.h5 textView2 = a6Var.getTextView2();
                int i12 = length < 0 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.A6;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, onVar.a));
                textView2.setTag(Integer.valueOf(i12));
                return;
            }
            length2 = 0;
            length = i11 - length2;
            f9 = i11;
            if (length > f9 - (0.7f * f9)) {
            }
        } else if (i10 == onVar.i0) {
            i11 = z10 ? onVar.getMessagesController().todoTitleLengthMax : 255;
            Editable editable2 = onVar.J;
            if (editable2 != null) {
                length2 = editable2.length();
                length = i11 - length2;
                f9 = i11;
                if (length > f9 - (0.7f * f9)) {
                }
            }
            length2 = 0;
            length = i11 - length2;
            f9 = i11;
            if (length > f9 - (0.7f * f9)) {
            }
        } else {
            if (i10 == onVar.l0) {
                Editable editable3 = onVar.L;
                length = 200 - (editable3 != null ? editable3.length() : 0);
                i11 = 200;
            } else {
                int i13 = onVar.p0;
                if (i10 < i13 || i10 >= onVar.I + i13) {
                    return;
                }
                int i14 = i10 - i13;
                int i15 = z10 ? onVar.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence = onVar.G[i14];
                int i16 = i15;
                length = i15 - (charSequence != null ? charSequence.length() : 0);
                i11 = i16;
            }
            f9 = i11;
            if (length > f9 - (0.7f * f9)) {
            }
        }
    }

    public static void L(on onVar, org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        if (onVar.E && z10) {
            if (onVar.c1 == a6Var && onVar.W0 && onVar.d1) {
                onVar.W();
                onVar.W0 = false;
            }
            org.telegram.ui.Cells.a6 a6Var2 = onVar.c1;
            onVar.c1 = a6Var;
            a6Var.setEmojiButtonVisibility(true);
            tg emojiButton = a6Var.getEmojiButton();
            rg rgVar = rg.e;
            emojiButton.j(rgVar, false);
            wa1 wa1Var = onVar.s;
            View F = wa1Var.F(a6Var);
            f2.n1 T = F == null ? null : wa1Var.T(F);
            en enVar = onVar.x;
            if (enVar != null) {
                enVar.f();
                if (T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.a6) && enVar.getDelegate() != view) {
                        enVar.setDelegate((org.telegram.ui.Cells.a6) view);
                    }
                }
            }
            if (a6Var2 == null || a6Var2 == a6Var) {
                return;
            }
            if (onVar.W0) {
                onVar.W();
                onVar.Z(false);
                onVar.c0();
            }
            a6Var2.setEmojiButtonVisibility(false);
            a6Var2.getEmojiButton().j(rgVar, false);
        }
    }

    public static void M(on onVar, org.telegram.ui.Cells.a6 a6Var) {
        onVar.c1 = a6Var;
        if (!onVar.W0) {
            onVar.f0(1);
        } else {
            onVar.W();
            onVar.c0();
        }
    }

    public static void O(on onVar, int i10) {
        ni niVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        bh.i iVar = onVar.h1;
        if (iVar.b(i10) == null) {
            onVar.b0(i10);
            return;
        }
        bh.h b10 = iVar.b(i10);
        if (b10 == null || (niVar = onVar.b) == null || (o2Var = niVar.b0) == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        if (b10 instanceof ch.d) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((ch.d) b10).b);
            PhotoViewer.t1().K2(parentActivity, null, null);
            PhotoViewer.t1().f2(arrayList, 0, 14, false, new um(onVar, i10), null);
            return;
        }
        if (b10 instanceof ch.i) {
            ch.i iVar2 = (ch.i) b10;
            org.telegram.ui.ht.q().w(parentActivity);
            org.telegram.ui.ht.q().v(new wm(onVar, i10));
            org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
            TLRPC.Document document = iVar2.b;
            q6.t(document, null, "", null, null, MessageObject.isAnimatedEmoji(document) ? 2 : 0, false, iVar2.c, onVar.a, 200);
            return;
        }
        if (b10 instanceof ch.c) {
            ch.c cVar = (ch.c) b10;
            onVar.g0(i10, new org.telegram.ui.hf(1, cVar.d, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof ch.h) {
            ch.h hVar = (ch.h) b10;
            TLRPC.Document document2 = hVar.b.getDocument();
            onVar.g0(i10, new nh.v4(MessageObject.getMusicTitle(document2, true), MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), hVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof ch.g) {
            onVar.g0(i10, new pi((ch.g) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
        } else if (!(b10 instanceof ch.e)) {
            onVar.b0(i10);
        } else {
            ch.e eVar = (ch.e) b10;
            c5.g0(onVar.getContext(), onVar.a, eVar.b, eVar.n, new mm(onVar, i10, 1), new nm(onVar, i10, 0));
        }
    }

    public static CharSequence Y(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence trimmedString = AndroidUtilities.getTrimmedString(charSequence);
        while (TextUtils.indexOf(trimmedString, "\n\n\n") >= 0) {
            trimmedString = TextUtils.replace(trimmedString, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        while (TextUtils.indexOf(trimmedString, "\n\n\n") == 0) {
            trimmedString = TextUtils.replace(trimmedString, new String[]{"\n\n\n"}, new CharSequence[]{"\n\n"});
        }
        return trimmedString;
    }

    public static xm d0(org.telegram.ui.ActionBar.o2 o2Var, int i10, Utilities.Callback callback, ig igVar) {
        if (o2Var == null) {
            return null;
        }
        xm xmVar = new xm(o2Var.getContext(), o2Var, o2Var.getResourceProvider(), igVar);
        xmVar.V1 = new zm(callback, o2Var, xmVar);
        xmVar.W1 = new an(callback, xmVar);
        xmVar.f0.f0();
        xmVar.J1(1, true);
        xmVar.h1(i10);
        xmVar.p2 = new om(callback);
        xmVar.T = new bn(callback, o2Var, xmVar);
        xmVar.U = new j1(17, callback, xmVar);
        xmVar.r1();
        xmVar.setFocusable(true);
        xmVar.show();
        return xmVar;
    }

    private int getAnswersMaxCount() {
        return this.n ? getMessagesController().todoItemsMax : getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        ni niVar = this.b;
        return niVar != null ? niVar.F1 : UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override // org.telegram.ui.Components.fi
    public final void D(fi fiVar) {
        ni niVar = this.b;
        try {
            niVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            niVar.T0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.a0) {
            niVar.T0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            niVar.T0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        niVar.W1();
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.fi
    public final void F() {
        this.s.x0(1);
    }

    @Override // org.telegram.ui.Components.gv0
    public final void G(int i10, boolean z10) {
        boolean z11;
        if (this.E) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.a1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.Z0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.Z0).commit();
                } else {
                    this.Y0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Y0).commit();
                }
            }
            boolean z12 = this.W0;
            ni niVar = this.b;
            nh.w3 w3Var = this.B;
            if (z12) {
                int i11 = z10 ? this.Z0 : this.Y0;
                if (this.d1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.e1 != this.d1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.A.setLayoutParams(layoutParams);
                    this.X0 = layoutParams.height;
                    w3Var.a();
                    niVar.n1.requestLayout();
                    boolean z13 = this.e1;
                    if (z13 != this.d1) {
                        Q(z13 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.e1 = this.d1;
                }
            }
            if (this.U0 == i10 && this.V0 == z10) {
                return;
            }
            this.U0 = i10;
            this.V0 = z10;
            boolean z14 = this.a1;
            org.telegram.ui.Cells.a6 a6Var = this.c1;
            if (a6Var != null) {
                this.a1 = a6Var.getEditField().isFocused() && w3Var.c() && i10 > 0;
            } else {
                this.a1 = false;
            }
            if (this.a1 && this.W0) {
                f0(0);
            }
            if (this.X0 != 0 && !(z11 = this.a1) && z11 != z14 && !this.W0) {
                this.X0 = 0;
                w3Var.a();
                niVar.n1.requestLayout();
            }
            if (this.a1 && this.C) {
                this.C = false;
                AndroidUtilities.cancelRunOnUIThread(this.Q0);
            }
        }
    }

    public final void P() {
        en enVar = this.x;
        if (enVar != null) {
            enVar.setDelegate(null);
            enVar.f();
        }
        this.s.setItemAnimator(this.v);
        int i10 = this.I;
        this.H[i10] = false;
        int i11 = i10 + 1;
        this.I = i11;
        int length = this.G.length;
        mn mnVar = this.r;
        if (i11 == length) {
            mnVar.u(this.q0);
        }
        mnVar.o(this.q0);
        h0();
        this.g0 = (this.p0 + this.I) - 1;
        mnVar.m(this.r0);
        mnVar.m(this.w0);
    }

    public final void Q(float f9) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.ag(this, f9, 2));
        ofFloat.addListener(new tm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
        ofFloat.start();
    }

    public final void R() {
        boolean z10 = (this.V || this.T) ? false : true;
        if (!z10) {
            this.P = false;
        }
        int i10 = this.y0;
        if (i10 < 0) {
            return;
        }
        f2.n1 K = this.s.K(i10);
        if (K == null) {
            this.r.m(this.y0);
            return;
        }
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) K.a;
        if (!z10) {
            y5Var.setChecked(false);
        }
        y5Var.getCheckBox().a.a(!z10, true);
    }

    public final boolean S() {
        boolean z10 = TextUtils.isEmpty(Y(this.J)) && TextUtils.isEmpty(Y(this.K)) && TextUtils.isEmpty(Y(this.L)) && this.h1.a.size() == 0;
        if (z10) {
            for (int i10 = 0; i10 < this.I && (z10 = TextUtils.isEmpty(Y(this.G[i10]))); i10++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.b0.getParentActivity());
            boolean z11 = this.n;
            alertDialog$Builder.a.N = LocaleController.getString(z11 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(z11 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new u(this, 23));
            j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void T() {
        int i10;
        boolean z10 = this.V;
        CharSequence[] charSequenceArr = this.G;
        if (z10) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.H;
                if (i11 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(Y(charSequenceArr[i11])) && zArr[i11]) {
                    i10++;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        boolean z11 = this.n;
        int i12 = z11 ? getMessagesController().todoTitleLengthMax : 255;
        int i13 = z11 ? getMessagesController().todoItemLengthMax : 100;
        boolean z12 = (TextUtils.isEmpty(Y(this.K)) || this.K.length() <= this.O0) && (TextUtils.isEmpty(Y(this.L)) || this.L.length() <= 200) && !TextUtils.isEmpty(Y(this.J)) && this.J.length() <= i12;
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(Y(charSequenceArr[i14]))) {
                if (charSequenceArr[i14].length() > i13) {
                    i15 = 0;
                    z13 = true;
                    break;
                } else {
                    i15++;
                    z13 = true;
                }
            }
            i14++;
        }
        if (i15 < 1 || (this.V && i10 < 1)) {
            z12 = false;
        }
        if (TextUtils.isEmpty(this.L) && TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.K) && !z13 && this.h1.a.size() <= 0) {
            this.d0 = true;
        } else {
            this.d0 = false;
        }
        boolean z14 = this.d0;
        ni niVar = this.b;
        niVar.setAllowNestedScroll(z14);
        this.T0 = z12;
        niVar.W1();
    }

    public final void U(org.telegram.ui.Cells.m8 m8Var, boolean z10) {
        if (this.R != 0) {
            m8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.R), z10, false);
        } else if (this.Q != 0) {
            m8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.Q / 3600, new Object[0]), z10, false);
        } else {
            m8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void V(ch.e eVar, boolean z10) {
        TLRPC.Photo photo;
        String str = eVar.b;
        bh.w wVar = this.M;
        boolean containsKey = wVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) wVar.b.get(eVar.b);
        vd.a aVar = eVar.s;
        ImageReceiver imageReceiver = eVar.a;
        eVar.r.a(containsKey || (webPage instanceof TLRPC.TL_webPagePending), z10);
        eVar.n = webPage;
        if (webPage == null || (photo = webPage.photo) == null) {
            aVar.a(false, z10);
            imageReceiver.clearImage();
        } else {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            aVar.a(true, z10);
        }
    }

    public final void W() {
        if (this.d1) {
            this.A.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.A.setLayoutParams(layoutParams);
            this.X0 = layoutParams.height;
            this.e1 = this.d1;
            this.d1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(View view, org.telegram.ui.Cells.a6 a6Var, boolean z10) {
        int b10;
        en enVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        if (view.getTag() != null) {
            return;
        }
        view.setTag(1);
        wa1 wa1Var = this.s;
        f2.n1 G = wa1Var.G(a6Var);
        if (G == null || (b10 = G.b()) == -1) {
            return;
        }
        int i10 = b10 - this.p0;
        bh.i iVar = this.h1;
        boolean z11 = iVar.b(i10) != null;
        if (z10 && z11 && (o2Var = this.b.b0) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, this.a);
            alertDialog$Builder.a.N = LocaleController.getString(!this.V ? R.string.DiscardPollOptionWithMediaAlertTitle : R.string.DiscardQuizOptionWithMediaAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(!this.V ? R.string.DiscardPollOptionWithMediaMessage : R.string.DiscardQuizOptionWithMediaMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, view, a6Var, 24));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new ch(view, 1));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q7, false));
                return;
            }
            return;
        }
        iVar.h(i10);
        wa1Var.setItemAnimator(this.v);
        mn mnVar = this.r;
        mnVar.u(b10);
        int i11 = i10 + 1;
        CharSequence[] charSequenceArr = this.G;
        System.arraycopy(charSequenceArr, i11, charSequenceArr, i10, (charSequenceArr.length - 1) - i10);
        boolean[] zArr = this.H;
        System.arraycopy(zArr, i11, zArr, i10, (zArr.length - 1) - i10);
        charSequenceArr[charSequenceArr.length - 1] = null;
        zArr[zArr.length - 1] = false;
        int i12 = this.I - 1;
        this.I = i12;
        if (i12 == charSequenceArr.length - 1) {
            mnVar.o((this.p0 + charSequenceArr.length) - 1);
        }
        f2.n1 K = wa1Var.K(b10 - 1);
        EditTextBoldCursor textView2 = a6Var.getTextView();
        if (K != null) {
            View view2 = K.a;
            if (view2 instanceof org.telegram.ui.Cells.a6) {
                ((org.telegram.ui.Cells.a6) view2).getTextView().requestFocus();
                textView2.clearFocus();
                T();
                h0();
                enVar = this.x;
                if (enVar != null) {
                    enVar.f();
                    enVar.setDelegate(null);
                }
                mnVar.m(this.r0);
                mnVar.m(this.w0);
            }
        }
        if (textView2.isFocused()) {
            AndroidUtilities.hideKeyboard(textView2);
            Z(true);
        } else if (this.d1) {
            Z(true);
        }
        textView2.clearFocus();
        T();
        h0();
        enVar = this.x;
        if (enVar != null) {
        }
        mnVar.m(this.r0);
        mnVar.m(this.w0);
    }

    public final void Z(boolean z10) {
        if (this.E) {
            int i10 = 0;
            if (this.W0) {
                fz fzVar = this.A;
                fzVar.L.B0();
                fzVar.E.scrollTo(0, 0);
                fzVar.G(1);
                fzVar.M.h1(0, 0);
                this.A.t(false);
                if (z10) {
                    this.A.B();
                }
                this.d1 = false;
                f0(0);
            }
            if (z10) {
                fz fzVar2 = this.A;
                if (fzVar2 == null || fzVar2.getVisibility() != 0) {
                    a0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.A.getMeasuredHeight());
                ofFloat.addUpdateListener(new pm(this, i10));
                this.b1 = true;
                ofFloat.addListener(new tm(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                ofFloat.start();
            }
        }
    }

    public final void a0() {
        fz fzVar;
        tg emojiButton;
        if (!this.W0 && (fzVar = this.A) != null && fzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.a6 a6Var = this.c1;
            if (a6Var != null && (emojiButton = a6Var.getEmojiButton()) != null) {
                emojiButton.j(rg.e, false);
            }
            this.A.setVisibility(8);
        }
        int i10 = this.X0;
        this.X0 = 0;
        if (i10 != 0) {
            this.B.a();
        }
    }

    public final void b0(int i10) {
        this.g1 = i10;
        org.telegram.ui.ActionBar.o2 o2Var = this.b.b0;
        this.h1.b(i10);
        this.f1 = d0(o2Var, (i10 == -2 || i10 == -3) ? 74 : 41026, new mm(this, i10, 0), new ig(this, 26));
    }

    public final void c0() {
        org.telegram.ui.Cells.a6 a6Var = this.c1;
        if (a6Var != null) {
            this.B.e = true;
            EditTextBoldCursor editField = a6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        f0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.a1 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.C = true;
        lh.m7 m7Var = this.Q0;
        AndroidUtilities.cancelRunOnUIThread(m7Var);
        AndroidUtilities.runOnUIThread(m7Var, 100L);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 != NotificationCenter.didReceivedWebpagesInUpdates) {
            if (i10 == NotificationCenter.emojiLoaded) {
                fz fzVar = this.A;
                if (fzVar != null) {
                    fzVar.L.f1();
                }
                org.telegram.ui.Cells.a6 a6Var = this.c1;
                if (a6Var != null) {
                    int currentTextColor = a6Var.getEditField().getCurrentTextColor();
                    this.c1.getEditField().setTextColor(-1);
                    this.c1.getEditField().setTextColor(currentTextColor);
                    return;
                }
                return;
            }
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (Map.Entry entry : this.M.b.entrySet()) {
            if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                entry.setValue(webPage);
            }
        }
        bh.i iVar = this.h1;
        int size = iVar.a.size();
        for (int i12 = 0; i12 < size; i12++) {
            bh.h hVar2 = (bh.h) iVar.a.get(i12);
            if (hVar2 instanceof ch.e) {
                V((ch.e) hVar2, true);
            }
        }
    }

    public final void e0(int i10, bh.h hVar) {
        int i11;
        bh.i iVar = this.h1;
        if (hVar != null) {
            iVar.a.put(i10, hVar);
        } else {
            iVar.a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.j0;
        } else if (i10 == -3) {
            i11 = this.l0;
        } else {
            int i12 = this.p0;
            i11 = (i12 < 0 || i10 < 0 || i10 >= this.I) ? -1 : i10 + i12;
        }
        if (i11 >= 0) {
            f2.n1 K = this.s.K(i11);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.a6) {
                    ((org.telegram.ui.Cells.a6) view).e.a(hVar, true);
                }
            }
            this.r.m(i11);
        }
        if (hVar instanceof ch.e) {
            ch.e eVar = (ch.e) hVar;
            String str = eVar.b;
            bh.v vVar = new bh.v(16, this, hVar);
            bh.w wVar = this.M;
            HashMap hashMap = wVar.c;
            HashMap hashMap2 = wVar.b;
            if (hashMap2.containsKey(str)) {
                vVar.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(vVar);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(wVar.a).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new bh.v(0, wVar, str));
                }
            }
            V(eVar, false);
        }
        T();
    }

    public final void f0(int i10) {
        tg emojiButton;
        org.telegram.ui.Cells.a6 a6Var;
        if (this.E) {
            nh.w3 w3Var = this.B;
            ni niVar = this.b;
            int i11 = 1;
            if (i10 != 1) {
                org.telegram.ui.Cells.a6 a6Var2 = this.c1;
                emojiButton = a6Var2 != null ? a6Var2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.j(rg.e, true);
                }
                fz fzVar = this.A;
                if (fzVar != null) {
                    this.W0 = false;
                    this.d1 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        fzVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.X0 = 0;
                }
                w3Var.a();
                niVar.n1.requestLayout();
                return;
            }
            fz fzVar2 = this.A;
            boolean z10 = fzVar2 != null && fzVar2.getVisibility() == 0;
            fz fzVar3 = this.A;
            if (fzVar3 != null && fzVar3.Y0 != UserConfig.selectedAccount) {
                niVar.n1.removeView(fzVar3);
                this.A = null;
            }
            if (this.A == null) {
                fz fzVar4 = new fz(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                this.A = fzVar4;
                fzVar4.c = 3;
                fzVar4.s0 = false;
                fzVar4.t2 = false;
                fzVar4.setShouldDrawBackground(false);
                fz fzVar5 = this.A;
                fzVar5.Q0 = false;
                fzVar5.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.A.setForseMultiwindowLayout(true);
                }
                this.A.setDelegate(new sm(this));
                niVar.n1.addView(this.A);
                this.A.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
            this.A.setVisibility(0);
            this.W0 = true;
            fz fzVar6 = this.A;
            if (this.Y0 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.Y0 = AndroidUtilities.dp(150.0f);
                } else {
                    this.Y0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.Z0 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.Z0 = AndroidUtilities.dp(150.0f);
                } else {
                    this.Z0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i12 = point.x > point.y ? this.Z0 : this.Y0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fzVar6.getLayoutParams();
            layoutParams.height = AndroidUtilities.navigationBarHeight + i12;
            fzVar6.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (a6Var = this.c1) != null) {
                AndroidUtilities.hideKeyboard(a6Var.getEditField());
            }
            this.X0 = i12;
            w3Var.a();
            niVar.n1.requestLayout();
            org.telegram.ui.Cells.a6 a6Var3 = this.c1;
            emojiButton = a6Var3 != null ? a6Var3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.j(rg.d, true);
            }
            if (z10 || this.a1) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X0, 0.0f);
            ofFloat.addUpdateListener(new pm(this, i11));
            ofFloat.addListener(new tm(this, i11));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean g() {
        return this.T0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        j70 F = j70.F(this, null, new View(getContext()));
        F.s = 0;
        F.t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new nm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new nm(this, i10, 2), true);
        yl0 yl0Var = new yl0(getContext(), this.a);
        F.p = new org.telegram.ui.ie(yl0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        yl0Var.e(F);
        Drawable drawable = (Drawable) callbackReturn.run(yl0Var.s);
        ng.d c3 = yl0Var.n.c(null, null, false);
        c3.n(pg.a.j(yl0Var.b));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.h.e = true;
        c3.p(AndroidUtilities.dp(16.0f));
        yl0Var.B = c3;
        yl0Var.A = drawable;
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c3.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        yl0Var.A.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) yl0Var.x.getLayoutParams()).gravity = 1;
        yl0Var.H = true;
        yl0Var.show();
    }

    @Override // org.telegram.ui.Components.fi
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override // org.telegram.ui.Components.fi
    public int getCurrentItemTop() {
        View childAt;
        wa1 wa1Var = this.s;
        if (wa1Var.getChildCount() <= 1 || (childAt = wa1Var.getChildAt(1)) == null) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View F = wa1Var.F(childAt);
        vk0 vk0Var = (vk0) (F == null ? null : wa1Var.T(F));
        int y8 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        int i10 = (y8 <= 0 || vk0Var == null || vk0Var.b() != 1) ? 0 : y8;
        if (y8 < 0 || vk0Var == null || vk0Var.b() != 1) {
            y8 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y8;
    }

    public int getEmojiPadding() {
        return this.X0;
    }

    @Override // org.telegram.ui.Components.fi
    public int getFirstOffset() {
        return AndroidUtilities.dp(17.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.fi
    public int getListTopPadding() {
        return this.N0;
    }

    @Override // org.telegram.ui.Components.fi
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        wa1 wa1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 16, new Class[]{fn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 32, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 48, new Class[]{org.telegram.ui.Cells.y8.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i13 = org.telegram.ui.ActionBar.g6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 262144, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 262144, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 4, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        int i15 = org.telegram.ui.ActionBar.g6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 196608, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 262144, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.a6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        int i17 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.il));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 32, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(wa1Var, 0, new Class[]{org.telegram.ui.Cells.m8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.fi
    public final int h() {
        return 1;
    }

    public final void h0() {
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.B0 = -1;
        this.x0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.y0 = -1;
        this.A0 = -1;
        this.z0 = -1;
        this.C0 = -1;
        m.a aVar = this.I0;
        aVar.b = -1;
        m.a aVar2 = this.J0;
        aVar2.b = -1;
        this.H0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.q0 = -1;
        this.p0 = -1;
        this.t0 = -1;
        this.j0 = -1;
        this.h0 = 1;
        this.M0 = 3;
        this.i0 = 2;
        boolean z10 = this.n;
        if (!z10) {
            this.M0 = 4;
            this.j0 = 3;
        }
        int i10 = this.M0;
        int i11 = i10 + 1;
        this.n0 = i10;
        int i12 = i10 + 2;
        this.M0 = i12;
        this.o0 = i11;
        int i13 = this.I;
        if (i13 != 0) {
            this.p0 = i12;
            this.M0 = i12 + i13;
        }
        if (i13 != this.G.length) {
            int i14 = this.M0;
            this.M0 = i14 + 1;
            this.q0 = i14;
        }
        int i15 = this.M0;
        this.r0 = i15;
        int i16 = i15 + 2;
        this.M0 = i16;
        this.s0 = i15 + 1;
        if (z10) {
            int i17 = i15 + 3;
            this.M0 = i17;
            this.v0 = i16;
            if (this.c0) {
                this.M0 = i15 + 4;
                this.u0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.tn) this.b.b0).e;
            boolean z11 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z11) {
                this.T = true;
            } else {
                int i18 = this.M0;
                this.M0 = i18 + 1;
                this.x0 = i18;
            }
            int i19 = this.M0;
            int i20 = i19 + 1;
            this.M0 = i20;
            this.B0 = i19;
            if (z11) {
                this.P = false;
            } else {
                this.M0 = i19 + 2;
                this.y0 = i20;
            }
            int i21 = this.M0;
            this.z0 = i21;
            this.A0 = i21 + 1;
            int i22 = i21 + 3;
            this.M0 = i22;
            this.C0 = i21 + 2;
            if (z11) {
                aVar.b = i22;
                int i23 = i21 + 5;
                this.M0 = i23;
                aVar2.b = i21 + 4;
                if (aVar2.a) {
                    this.M0 = i21 + 6;
                    this.H0 = i23;
                }
            }
            int i24 = this.M0;
            int i25 = i24 + 1;
            this.M0 = i25;
            this.D0 = i24;
            if (this.Q != 0 || this.R != 0) {
                this.E0 = i25;
                this.F0 = i24 + 2;
                this.M0 = i24 + 4;
                this.G0 = i24 + 3;
            }
            int i26 = this.M0;
            int i27 = i26 + 1;
            this.M0 = i27;
            this.t0 = i26;
            if (this.V) {
                this.k0 = i27;
                this.l0 = i26 + 2;
                this.M0 = i26 + 4;
                this.m0 = i26 + 3;
            }
        }
        int i28 = this.M0;
        this.M0 = i28 + 1;
        this.w0 = i28;
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean i() {
        if (!this.W0) {
            return !S();
        }
        Z(true);
        return true;
    }

    @Override // org.telegram.ui.Components.fi
    public final void m() {
        this.D = true;
        ni niVar = this.b;
        NotificationCenter.getInstance(niVar.F1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.E) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            fz fzVar = this.A;
            if (fzVar != null) {
                niVar.n1.removeView(fzVar);
            }
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final boolean p() {
        return S();
    }

    @Override // org.telegram.ui.Components.fi
    public final void q() {
        this.b.W1();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.e0) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.fi
    public final void s(float f9) {
        this.b.W1();
    }

    public void setDelegate(nn nnVar) {
        this.f0 = nnVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.b.getSheetContainer().invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v31 */
    @Override // org.telegram.ui.Components.fi
    public final void t(int i10) {
        if (i10 != 40) {
            return;
        }
        boolean z10 = this.n;
        int i11 = 0;
        int i12 = 1;
        ni niVar = this.b;
        CharSequence[] charSequenceArr = this.G;
        if (z10) {
            CharSequence[] charSequenceArr2 = {Y(this.J)};
            int i13 = niVar.F1;
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i13).getEntities(charSequenceArr2, true);
            CharSequence charSequence = charSequenceArr2[0];
            if (entities != null) {
                int size = entities.size();
                for (int i14 = 0; i14 < size; i14++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i14);
                    if (messageEntity.offset + messageEntity.length > charSequence.length()) {
                        messageEntity.length = charSequence.length() - messageEntity.offset;
                    }
                }
            }
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = new TLRPC.TL_messageMediaToDo();
            TLRPC.TodoList todoList = new TLRPC.TodoList();
            tL_messageMediaToDo.todo = todoList;
            boolean z11 = this.c0;
            todoList.others_can_append = z11 && this.b0;
            todoList.others_can_complete = z11;
            todoList.title = new TLRPC.TL_textWithEntities();
            tL_messageMediaToDo.todo.title.text = charSequence.toString();
            tL_messageMediaToDo.todo.title.entities = entities;
            for (int i15 = 0; i15 < charSequenceArr.length; i15++) {
                if (!TextUtils.isEmpty(Y(charSequenceArr[i15]))) {
                    CharSequence[] charSequenceArr3 = {Y(charSequenceArr[i15])};
                    ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i13).getEntities(charSequenceArr3, true);
                    CharSequence charSequence2 = charSequenceArr3[0];
                    if (entities2 != null) {
                        int size2 = entities2.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i16);
                            if (messageEntity2.offset + messageEntity2.length > charSequence2.length()) {
                                messageEntity2.length = charSequence2.length() - messageEntity2.offset;
                            }
                        }
                    }
                    TLRPC.TodoItem todoItem = new TLRPC.TodoItem();
                    TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                    todoItem.title = tL_textWithEntities;
                    tL_textWithEntities.text = charSequence2.toString();
                    todoItem.title.entities = entities2;
                    todoItem.id = tL_messageMediaToDo.todo.list.size() + 1;
                    tL_messageMediaToDo.todo.list.add(todoItem);
                }
            }
            c5.a0(i13, niVar.j1() + 1, niVar.n1(), new ih.i(this, (org.telegram.ui.tn) niVar.b0, tL_messageMediaToDo, 8));
            return;
        }
        boolean z12 = this.V;
        wa1 wa1Var = this.s;
        boolean[] zArr = this.H;
        if (z12 && !this.T0) {
            int i17 = 0;
            while (i11 < zArr.length) {
                if (!TextUtils.isEmpty(Y(charSequenceArr[i11])) && zArr[i11]) {
                    i17++;
                }
                i11++;
            }
            if (i17 <= 0) {
                for (int i18 = this.p0; i18 < this.p0 + this.I; i18++) {
                    f2.n1 K = wa1Var.K(i18);
                    if (K != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.a6) {
                            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                            if (a6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                en enVar = this.x;
                                if (enVar != null) {
                                    enVar.f();
                                }
                                String string = LocaleController.getString(R.string.PollTapToSelect);
                                g40 g40Var = this.y;
                                g40Var.setText(string);
                                g40Var.f(a6Var.getCheckBox(), true);
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return;
            }
            return;
        }
        int i19 = 0;
        while (true) {
            int length = charSequenceArr.length;
            bh.i iVar = this.h1;
            if (i19 >= length) {
                CharSequence[] charSequenceArr4 = {Y(this.J)};
                int i20 = niVar.F1;
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i20).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                if (entities3 != null) {
                    int size3 = entities3.size();
                    for (int i21 = 0; i21 < size3; i21++) {
                        TLRPC.MessageEntity messageEntity3 = entities3.get(i21);
                        if (messageEntity3.offset + messageEntity3.length > charSequence3.length()) {
                            messageEntity3.length = charSequence3.length() - messageEntity3.offset;
                        }
                    }
                }
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = new TLRPC.TL_messageMediaPoll();
                TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
                tL_messageMediaPoll.poll = tL_poll;
                tL_poll.multiple_choice = this.U;
                tL_poll.quiz = this.V;
                tL_poll.public_voters = !this.T;
                tL_poll.open_answers = this.P;
                tL_poll.revoting_disabled = !this.N;
                tL_poll.shuffle_answers = this.O;
                tL_poll.subscribers_only = this.I0.a;
                if (this.J0.a) {
                    ArrayList arrayList = this.L0;
                    if (!arrayList.isEmpty()) {
                        TLRPC.Poll poll = tL_messageMediaPoll.poll;
                        poll.flags |= 4096;
                        poll.countries_iso2.addAll(arrayList);
                    }
                }
                TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                poll2.creator = true;
                int i22 = this.Q;
                if (i22 != 0) {
                    poll2.hide_results_until_close = this.S;
                    poll2.close_period = i22;
                    poll2.flags |= 16;
                } else {
                    int i23 = this.R;
                    if (i23 != 0) {
                        poll2.hide_results_until_close = this.S;
                        poll2.close_date = i23;
                        poll2.flags |= 32;
                    }
                }
                poll2.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList2 = new ArrayList(this.F);
                int i24 = 0;
                while (i24 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i24]))) {
                        iVar.h(tL_messageMediaPoll.poll.answers.size());
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[i12];
                        charSequenceArr5[i11] = Y(charSequenceArr[i24]);
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i20).getEntities(charSequenceArr5, i12);
                        CharSequence charSequence4 = charSequenceArr5[i11];
                        if (entities4 != null) {
                            int size4 = entities4.size();
                            for (int i25 = 0; i25 < size4; i25++) {
                                TLRPC.MessageEntity messageEntity4 = entities4.get(i25);
                                if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                    messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                }
                            }
                        }
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = entities4;
                        tL_pollAnswer.option = new byte[]{(byte) (tL_messageMediaPoll.poll.answers.size() + 48)};
                        if ((this.U || this.V) && zArr[i24]) {
                            arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i24++;
                    i11 = 0;
                    i12 = 1;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence Y = Y(this.L);
                if (Y != null) {
                    tL_messageMediaPoll.results.solution = Y.toString();
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i20).getEntities(new CharSequence[]{Y}, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                c5.a0(i20, niVar.j1() + 1, niVar.n1(), new eg.d1(this, (org.telegram.ui.tn) niVar.b0, tL_messageMediaPoll, arrayList2, 9));
                return;
            }
            if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && iVar.b(i19) != null) {
                this.R0 = true;
                this.S0 = i19;
                wa1Var.x0(this.p0 + i19);
                return;
            }
            i19++;
        }
    }

    @Override // org.telegram.ui.Components.fi
    public final void x() {
        mn mnVar = this.r;
        if (mnVar != null) {
            mnVar.l();
        }
        if (this.E) {
            Z(false);
            en enVar = this.x;
            if (enVar != null) {
                enVar.f();
            }
            org.telegram.ui.Cells.a6 a6Var = this.c1;
            if (a6Var != null) {
                a6Var.setEmojiButtonVisibility(false);
                this.c1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.c1.getEditField());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // org.telegram.ui.Components.fi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        ni niVar = this.b;
        if (niVar.n1.R() > AndroidUtilities.dp(20.0f) || this.W0 || this.b1 || this.d1) {
            dp = AndroidUtilities.dp(52.0f);
            niVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(13.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    niVar.setAllowNestedScroll(this.d0);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(13.0f);
            if (dp < 0) {
            }
            niVar.setAllowNestedScroll(this.d0);
        }
        int i13 = dp + AndroidUtilities.statusBarHeight;
        this.e0 = true;
        int i14 = this.N0;
        wa1 wa1Var = this.s;
        if (i14 != i13 || wa1Var.getPaddingBottom() != this.e) {
            this.N0 = i13;
            wa1Var.o1(0, 0, 0, this.e);
            wa1Var.setItemAnimator(null);
            this.r.m(0);
        }
        this.e0 = false;
    }
}
