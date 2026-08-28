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
import org.telegram.ui.va1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class jn extends ci implements wu0, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int i1 = 0;
    public wy A;
    public int A0;
    public final kh.b4 B;
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
    public final yg.r M;
    public int M0;
    public boolean N;
    public int N0;
    public boolean O;
    public final int O0;
    public boolean P;
    public final int[] P0;
    public int Q;
    public final m.i3 Q0;
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
    public org.telegram.ui.Cells.c6 c1;
    public boolean d0;
    public boolean d1;
    public boolean e0;
    public boolean e1;
    public in f0;
    public sm f1;
    public int g0;
    public int g1;
    public int h0;
    public final yg.f h1;
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
    public final hn r;
    public int r0;
    public final va1 s;
    public int s0;
    public int t0;
    public int u0;
    public final xm v;
    public int v0;
    public final dj w;
    public int w0;
    public final zm x;
    public int x0;
    public final s30 y;
    public int y0;
    public int z0;

    public jn(ki kiVar, Context context, boolean z10, org.telegram.ui.ActionBar.b6 b6Var, Boolean bool) {
        super(context, b6Var, kiVar);
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
        int i9 = 2;
        this.K0 = new m.a[]{aVar, aVar2};
        ArrayList arrayList = new ArrayList();
        this.L0 = arrayList;
        this.P0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.Q0 = new m.i3(this, 15);
        this.R0 = false;
        this.S0 = -1;
        this.d1 = false;
        this.e1 = false;
        Paint paint = new Paint(1);
        this.h1 = new yg.f();
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
        g0();
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.hl, this.a));
        this.b.n1.setDelegate(this);
        hn hnVar = new hn(this, context);
        this.r = hnVar;
        va1 va1Var = new va1(context, 5, null);
        this.s = va1Var;
        this.c = va1Var;
        this.d = va1Var;
        this.h = true;
        this.f = true;
        xm xmVar = new xm(this);
        this.v = xmVar;
        va1Var.setItemAnimator(xmVar);
        arrayList.clear();
        xmVar.m = false;
        xmVar.C = false;
        xmVar.o(gr.h);
        xmVar.n(350L);
        va1Var.setClipToPadding(false);
        va1Var.setVerticalScrollBarEnabled(false);
        va1Var.setSections(true);
        dj djVar = new dj(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, va1Var, 3);
        this.w = djVar;
        va1Var.setLayoutManager(djVar);
        djVar.O = true;
        new f2.h0(new jh.f(this, i9)).d(va1Var);
        addView(va1Var, g7.e6.e(-1, -1, 51));
        va1Var.setPreserveFocusAfterLayout(true);
        va1Var.setAdapter(hnVar);
        va1Var.setOnItemClickListener(new mm(this, b6Var, kiVar, context));
        va1Var.setOnScrollListener(new bg.o2(this, 29));
        s30 s30Var = new s30(context, 4);
        this.y = s30Var;
        s30Var.setAlpha(0.0f);
        s30Var.setVisibility(4);
        addView(s30Var, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.O0 = MessagesController.getInstance(this.b.F1).config.pollCaptionLengthMax.get();
        this.M = new yg.r(this.b.F1);
        NotificationCenter.getInstance(this.b.F1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            zm zmVar = new zm(context, this.b.F1, null, b6Var);
            this.x = zmVar;
            zmVar.y = true;
            zmVar.A = true;
            zmVar.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView(zmVar, g7.e6.e(-2, 160, 51));
        }
        this.B = new kh.b4(this.b.n1, false, null);
        S();
    }

    public static void J(jn jnVar, int i9) {
        s30 s30Var = jnVar.y;
        f2.q1 K = jnVar.s.K(jnVar.p0 + i9);
        if (K != null) {
            View view = K.a;
            if (view instanceof org.telegram.ui.Cells.c6) {
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    zm zmVar = jnVar.x;
                    if (zmVar != null) {
                        zmVar.f();
                    }
                    s30Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    s30Var.f(c6Var.getCheckBox(), true);
                    ImageView imageView = s30Var.c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    s30Var.setTranslationY(s30Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void K(jn jnVar, View view, int i9) {
        int length;
        int i10;
        int length2;
        float f10;
        boolean z10 = jnVar.n;
        if (!(view instanceof org.telegram.ui.Cells.c6)) {
            return;
        }
        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
        if (i9 == jnVar.j0) {
            i10 = jnVar.O0;
            Editable editable = jnVar.K;
            if (editable != null) {
                length2 = editable.length();
                length = i10 - length2;
                f10 = i10;
                if (length > f10 - (0.7f * f10)) {
                    c6Var.setText2("");
                    return;
                }
                c6Var.setText2(String.format("%d", Integer.valueOf(length)));
                org.telegram.ui.ActionBar.h5 textView2 = c6Var.getTextView2();
                int i11 = length < 0 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.A6;
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, jnVar.a));
                textView2.setTag(Integer.valueOf(i11));
                return;
            }
            length2 = 0;
            length = i10 - length2;
            f10 = i10;
            if (length > f10 - (0.7f * f10)) {
            }
        } else if (i9 == jnVar.i0) {
            i10 = z10 ? jnVar.getMessagesController().todoTitleLengthMax : 255;
            Editable editable2 = jnVar.J;
            if (editable2 != null) {
                length2 = editable2.length();
                length = i10 - length2;
                f10 = i10;
                if (length > f10 - (0.7f * f10)) {
                }
            }
            length2 = 0;
            length = i10 - length2;
            f10 = i10;
            if (length > f10 - (0.7f * f10)) {
            }
        } else {
            if (i9 == jnVar.l0) {
                Editable editable3 = jnVar.L;
                length = 200 - (editable3 != null ? editable3.length() : 0);
                i10 = 200;
            } else {
                int i12 = jnVar.p0;
                if (i9 < i12 || i9 >= jnVar.I + i12) {
                    return;
                }
                int i13 = i9 - i12;
                int i14 = z10 ? jnVar.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence = jnVar.G[i13];
                int i15 = i14;
                length = i14 - (charSequence != null ? charSequence.length() : 0);
                i10 = i15;
            }
            f10 = i10;
            if (length > f10 - (0.7f * f10)) {
            }
        }
    }

    public static void L(jn jnVar, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        if (jnVar.E && z10) {
            if (jnVar.c1 == c6Var && jnVar.W0 && jnVar.d1) {
                jnVar.V();
                jnVar.W0 = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = jnVar.c1;
            jnVar.c1 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            qg emojiButton = c6Var.getEmojiButton();
            og ogVar = og.e;
            emojiButton.j(ogVar, false);
            va1 va1Var = jnVar.s;
            View F = va1Var.F(c6Var);
            f2.q1 T = F == null ? null : va1Var.T(F);
            zm zmVar = jnVar.x;
            if (zmVar != null) {
                zmVar.f();
                if (T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && zmVar.getDelegate() != view) {
                        zmVar.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 == null || c6Var2 == c6Var) {
                return;
            }
            if (jnVar.W0) {
                jnVar.V();
                jnVar.Y(false);
                jnVar.b0();
            }
            c6Var2.setEmojiButtonVisibility(false);
            c6Var2.getEmojiButton().j(ogVar, false);
        }
    }

    public static void M(jn jnVar, org.telegram.ui.Cells.c6 c6Var) {
        jnVar.c1 = c6Var;
        if (!jnVar.W0) {
            jnVar.e0(1);
        } else {
            jnVar.V();
            jnVar.b0();
        }
    }

    public static void N(jn jnVar, int i9) {
        ki kiVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        yg.f fVar = jnVar.h1;
        if (fVar.b(i9) == null) {
            jnVar.a0(i9);
            return;
        }
        yg.e b10 = fVar.b(i9);
        if (b10 == null || (kiVar = jnVar.b) == null || (o2Var = kiVar.b0) == null) {
            return;
        }
        Activity parentActivity = o2Var.getParentActivity();
        if (b10 instanceof zg.d) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((zg.d) b10).b);
            PhotoViewer.t1().K2(parentActivity, null, null);
            PhotoViewer.t1().f2(arrayList, 0, 14, false, new pm(jnVar, i9), null);
            return;
        }
        if (b10 instanceof zg.h) {
            zg.h hVar = (zg.h) b10;
            org.telegram.ui.ht.q().w(parentActivity);
            org.telegram.ui.ht.q().v(new rm(jnVar, i9));
            org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
            TLRPC.Document document = hVar.b;
            q10.t(document, null, "", null, null, MessageObject.isAnimatedEmoji(document) ? 2 : 0, false, hVar.c, jnVar.a, 200);
            return;
        }
        if (b10 instanceof zg.c) {
            zg.c cVar = (zg.c) b10;
            jnVar.f0(i9, new org.telegram.ui.lf(1, cVar.d, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof zg.g) {
            zg.g gVar = (zg.g) b10;
            TLRPC.Document document2 = gVar.b.getDocument();
            jnVar.f0(i9, new kh.f5(MessageObject.getMusicTitle(document2, true), MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof zg.f) {
            jnVar.f0(i9, new mi((zg.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
        } else if (!(b10 instanceof zg.e)) {
            jnVar.a0(i9);
        } else {
            zg.e eVar = (zg.e) b10;
            y4.g0(jnVar.getContext(), jnVar.a, eVar.b, eVar.n, new im(jnVar, i9, 1), new jm(jnVar, i9, 0));
        }
    }

    public static CharSequence X(CharSequence charSequence) {
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

    public static sm c0(org.telegram.ui.ActionBar.o2 o2Var, int i9, Utilities.Callback callback, fg fgVar) {
        if (o2Var == null) {
            return null;
        }
        sm smVar = new sm(o2Var.getContext(), o2Var, o2Var.getResourceProvider(), fgVar);
        smVar.V1 = new um(callback, o2Var, smVar);
        smVar.W1 = new vm(callback, smVar);
        smVar.f0.e0();
        smVar.J1(1, true);
        smVar.h1(i9);
        smVar.p2 = new km(callback);
        smVar.T = new wm(callback, o2Var, smVar);
        smVar.U = new g1(17, callback, smVar);
        smVar.r1();
        smVar.setFocusable(true);
        smVar.show();
        return smVar;
    }

    private int getAnswersMaxCount() {
        return this.n ? getMessagesController().todoItemsMax : getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        ki kiVar = this.b;
        return kiVar != null ? kiVar.F1 : UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override // org.telegram.ui.Components.ci
    public final void D(ci ciVar) {
        ki kiVar = this.b;
        try {
            kiVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            kiVar.T0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.a0) {
            kiVar.T0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            kiVar.T0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        kiVar.W1();
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ci
    public final void F() {
        this.s.x0(1);
    }

    @Override // org.telegram.ui.Components.wu0
    public final void G(int i9, boolean z10) {
        boolean z11;
        if (this.E) {
            if (i9 > AndroidUtilities.dp(50.0f) && this.a1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.Z0 = i9;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.Z0).commit();
                } else {
                    this.Y0 = i9;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Y0).commit();
                }
            }
            boolean z12 = this.W0;
            ki kiVar = this.b;
            kh.b4 b4Var = this.B;
            if (z12) {
                int i10 = z10 ? this.Z0 : this.Y0;
                if (this.d1) {
                    i10 += AndroidUtilities.dp(120.0f);
                }
                int i11 = i10 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
                int i12 = layoutParams.width;
                int i13 = AndroidUtilities.displaySize.x;
                if (i12 != i13 || layoutParams.height != i11 || this.e1 != this.d1) {
                    layoutParams.width = i13;
                    layoutParams.height = i11;
                    this.A.setLayoutParams(layoutParams);
                    this.X0 = layoutParams.height;
                    b4Var.a();
                    kiVar.n1.requestLayout();
                    boolean z13 = this.e1;
                    if (z13 != this.d1) {
                        P(z13 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.e1 = this.d1;
                }
            }
            if (this.U0 == i9 && this.V0 == z10) {
                return;
            }
            this.U0 = i9;
            this.V0 = z10;
            boolean z14 = this.a1;
            org.telegram.ui.Cells.c6 c6Var = this.c1;
            if (c6Var != null) {
                this.a1 = c6Var.getEditField().isFocused() && b4Var.c() && i9 > 0;
            } else {
                this.a1 = false;
            }
            if (this.a1 && this.W0) {
                e0(0);
            }
            if (this.X0 != 0 && !(z11 = this.a1) && z11 != z14 && !this.W0) {
                this.X0 = 0;
                b4Var.a();
                kiVar.n1.requestLayout();
            }
            if (this.a1 && this.C) {
                this.C = false;
                AndroidUtilities.cancelRunOnUIThread(this.Q0);
            }
        }
    }

    public final void O() {
        zm zmVar = this.x;
        if (zmVar != null) {
            zmVar.setDelegate(null);
            zmVar.f();
        }
        this.s.setItemAnimator(this.v);
        int i9 = this.I;
        this.H[i9] = false;
        int i10 = i9 + 1;
        this.I = i10;
        int length = this.G.length;
        hn hnVar = this.r;
        if (i10 == length) {
            hnVar.u(this.q0);
        }
        hnVar.o(this.q0);
        g0();
        this.g0 = (this.p0 + this.I) - 1;
        hnVar.m(this.r0);
        hnVar.m(this.w0);
    }

    public final void P(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.cg(this, f10, 2));
        ofFloat.addListener(new om(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
        ofFloat.start();
    }

    public final void Q() {
        boolean z10 = (this.V || this.T) ? false : true;
        if (!z10) {
            this.P = false;
        }
        int i9 = this.y0;
        if (i9 < 0) {
            return;
        }
        f2.q1 K = this.s.K(i9);
        if (K == null) {
            this.r.m(this.y0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.a;
        if (!z10) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().a.a(!z10, true);
    }

    public final boolean R() {
        boolean z10 = TextUtils.isEmpty(X(this.J)) && TextUtils.isEmpty(X(this.K)) && TextUtils.isEmpty(X(this.L)) && this.h1.a.size() == 0;
        if (z10) {
            for (int i9 = 0; i9 < this.I && (z10 = TextUtils.isEmpty(X(this.G[i9]))); i9++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.b0.getParentActivity());
            boolean z11 = this.n;
            alertDialog$Builder.a.N = LocaleController.getString(z11 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(z11 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void S() {
        int i9;
        boolean z10 = this.V;
        CharSequence[] charSequenceArr = this.G;
        if (z10) {
            int i10 = 0;
            i9 = 0;
            while (true) {
                boolean[] zArr = this.H;
                if (i10 >= zArr.length) {
                    break;
                }
                if (!TextUtils.isEmpty(X(charSequenceArr[i10])) && zArr[i10]) {
                    i9++;
                }
                i10++;
            }
        } else {
            i9 = 0;
        }
        boolean z11 = this.n;
        int i11 = z11 ? getMessagesController().todoTitleLengthMax : 255;
        int i12 = z11 ? getMessagesController().todoItemLengthMax : 100;
        boolean z12 = (TextUtils.isEmpty(X(this.K)) || this.K.length() <= this.O0) && (TextUtils.isEmpty(X(this.L)) || this.L.length() <= 200) && !TextUtils.isEmpty(X(this.J)) && this.J.length() <= i11;
        int i13 = 0;
        int i14 = 0;
        boolean z13 = false;
        while (true) {
            if (i13 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(X(charSequenceArr[i13]))) {
                if (charSequenceArr[i13].length() > i12) {
                    i14 = 0;
                    z13 = true;
                    break;
                } else {
                    i14++;
                    z13 = true;
                }
            }
            i13++;
        }
        if (i14 < 1 || (this.V && i9 < 1)) {
            z12 = false;
        }
        if (TextUtils.isEmpty(this.L) && TextUtils.isEmpty(this.J) && TextUtils.isEmpty(this.K) && !z13 && this.h1.a.size() <= 0) {
            this.d0 = true;
        } else {
            this.d0 = false;
        }
        boolean z14 = this.d0;
        ki kiVar = this.b;
        kiVar.setAllowNestedScroll(z14);
        this.T0 = z12;
        kiVar.W1();
    }

    public final void T(org.telegram.ui.Cells.p8 p8Var, boolean z10) {
        if (this.R != 0) {
            p8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.R), z10, false);
        } else if (this.Q != 0) {
            p8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.Q / 3600, new Object[0]), z10, false);
        } else {
            p8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void U(zg.e eVar, boolean z10) {
        TLRPC.Photo photo;
        String str = eVar.b;
        yg.r rVar = this.M;
        boolean containsKey = rVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) rVar.b.get(eVar.b);
        td.a aVar = eVar.s;
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

    public final void V() {
        if (this.d1) {
            this.A.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.A.setLayoutParams(layoutParams);
            this.X0 = layoutParams.height;
            this.e1 = this.d1;
            this.d1 = false;
            P(-AndroidUtilities.dp(120.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(View view, org.telegram.ui.Cells.c6 c6Var, boolean z10) {
        int b10;
        zm zmVar;
        org.telegram.ui.ActionBar.o2 o2Var;
        if (view.getTag() != null) {
            return;
        }
        view.setTag(1);
        va1 va1Var = this.s;
        f2.q1 G = va1Var.G(c6Var);
        if (G == null || (b10 = G.b()) == -1) {
            return;
        }
        int i9 = b10 - this.p0;
        yg.f fVar = this.h1;
        boolean z11 = fVar.b(i9) != null;
        if (z10 && z11 && (o2Var = this.b.b0) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(o2Var.getParentActivity(), 0, this.a);
            alertDialog$Builder.a.N = LocaleController.getString(!this.V ? R.string.DiscardPollOptionWithMediaAlertTitle : R.string.DiscardQuizOptionWithMediaAlertTitle);
            alertDialog$Builder.a.P = LocaleController.getString(!this.V ? R.string.DiscardPollOptionWithMediaMessage : R.string.DiscardQuizOptionWithMediaMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, view, c6Var, 26));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new zg(view, 1));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        fVar.h(i9);
        va1Var.setItemAnimator(this.v);
        hn hnVar = this.r;
        hnVar.u(b10);
        int i10 = i9 + 1;
        CharSequence[] charSequenceArr = this.G;
        System.arraycopy(charSequenceArr, i10, charSequenceArr, i9, (charSequenceArr.length - 1) - i9);
        boolean[] zArr = this.H;
        System.arraycopy(zArr, i10, zArr, i9, (zArr.length - 1) - i9);
        charSequenceArr[charSequenceArr.length - 1] = null;
        zArr[zArr.length - 1] = false;
        int i11 = this.I - 1;
        this.I = i11;
        if (i11 == charSequenceArr.length - 1) {
            hnVar.o((this.p0 + charSequenceArr.length) - 1);
        }
        f2.q1 K = va1Var.K(b10 - 1);
        EditTextBoldCursor textView2 = c6Var.getTextView();
        if (K != null) {
            View view2 = K.a;
            if (view2 instanceof org.telegram.ui.Cells.c6) {
                ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                textView2.clearFocus();
                S();
                g0();
                zmVar = this.x;
                if (zmVar != null) {
                    zmVar.f();
                    zmVar.setDelegate(null);
                }
                hnVar.m(this.r0);
                hnVar.m(this.w0);
            }
        }
        if (textView2.isFocused()) {
            AndroidUtilities.hideKeyboard(textView2);
            Y(true);
        } else if (this.d1) {
            Y(true);
        }
        textView2.clearFocus();
        S();
        g0();
        zmVar = this.x;
        if (zmVar != null) {
        }
        hnVar.m(this.r0);
        hnVar.m(this.w0);
    }

    public final void Y(boolean z10) {
        if (this.E) {
            int i9 = 0;
            if (this.W0) {
                wy wyVar = this.A;
                wyVar.L.B0();
                wyVar.E.scrollTo(0, 0);
                wyVar.G(1);
                wyVar.M.h1(0, 0);
                this.A.t(false);
                if (z10) {
                    this.A.A();
                }
                this.d1 = false;
                e0(0);
            }
            if (z10) {
                wy wyVar2 = this.A;
                if (wyVar2 == null || wyVar2.getVisibility() != 0) {
                    Z();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.A.getMeasuredHeight());
                ofFloat.addUpdateListener(new lm(this, i9));
                this.b1 = true;
                ofFloat.addListener(new om(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
                ofFloat.start();
            }
        }
    }

    public final void Z() {
        wy wyVar;
        qg emojiButton;
        if (!this.W0 && (wyVar = this.A) != null && wyVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.c1;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(og.e, false);
            }
            this.A.setVisibility(8);
        }
        int i9 = this.X0;
        this.X0 = 0;
        if (i9 != 0) {
            this.B.a();
        }
    }

    public final void a0(int i9) {
        this.g1 = i9;
        org.telegram.ui.ActionBar.o2 o2Var = this.b.b0;
        this.h1.b(i9);
        this.f1 = c0(o2Var, (i9 == -2 || i9 == -3) ? 74 : 41026, new im(this, i9, 0), new fg(this, 26));
    }

    public final void b0() {
        org.telegram.ui.Cells.c6 c6Var = this.c1;
        if (c6Var != null) {
            this.B.e = true;
            EditTextBoldCursor editField = c6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        e0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.a1 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.C = true;
        m.i3 i3Var = this.Q0;
        AndroidUtilities.cancelRunOnUIThread(i3Var);
        AndroidUtilities.runOnUIThread(i3Var, 100L);
    }

    public final void d0(int i9, yg.e eVar) {
        int i10;
        yg.f fVar = this.h1;
        if (eVar != null) {
            fVar.a.put(i9, eVar);
        } else {
            fVar.a.remove(i9);
        }
        if (i9 == -2) {
            i10 = this.j0;
        } else if (i9 == -3) {
            i10 = this.l0;
        } else {
            int i11 = this.p0;
            i10 = (i11 < 0 || i9 < 0 || i9 >= this.I) ? -1 : i9 + i11;
        }
        if (i10 >= 0) {
            f2.q1 K = this.s.K(i10);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.c6) {
                    ((org.telegram.ui.Cells.c6) view).e.a(eVar, true);
                }
            }
            this.r.m(i10);
        }
        if (eVar instanceof zg.e) {
            zg.e eVar2 = (zg.e) eVar;
            String str = eVar2.b;
            bg.y0 y0Var = new bg.y0(16, this, eVar);
            yg.r rVar = this.M;
            HashMap hashMap = rVar.c;
            HashMap hashMap2 = rVar.b;
            if (hashMap2.containsKey(str)) {
                y0Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(y0Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(rVar.a).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new bg.y0(27, rVar, str));
                }
            }
            U(eVar2, false);
        }
        S();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i9 != NotificationCenter.didReceivedWebpagesInUpdates) {
            if (i9 == NotificationCenter.emojiLoaded) {
                wy wyVar = this.A;
                if (wyVar != null) {
                    wyVar.L.f1();
                }
                org.telegram.ui.Cells.c6 c6Var = this.c1;
                if (c6Var != null) {
                    int currentTextColor = c6Var.getEditField().getCurrentTextColor();
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
        yg.f fVar = this.h1;
        int size = fVar.a.size();
        for (int i11 = 0; i11 < size; i11++) {
            yg.e eVar = (yg.e) fVar.a.get(i11);
            if (eVar instanceof zg.e) {
                U((zg.e) eVar, true);
            }
        }
    }

    public final void e0(int i9) {
        qg emojiButton;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.E) {
            kh.b4 b4Var = this.B;
            ki kiVar = this.b;
            int i10 = 1;
            if (i9 != 1) {
                org.telegram.ui.Cells.c6 c6Var2 = this.c1;
                emojiButton = c6Var2 != null ? c6Var2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.j(og.e, true);
                }
                wy wyVar = this.A;
                if (wyVar != null) {
                    this.W0 = false;
                    this.d1 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        wyVar.setVisibility(8);
                    }
                }
                if (i9 == 0) {
                    this.X0 = 0;
                }
                b4Var.a();
                kiVar.n1.requestLayout();
                return;
            }
            wy wyVar2 = this.A;
            boolean z10 = wyVar2 != null && wyVar2.getVisibility() == 0;
            wy wyVar3 = this.A;
            if (wyVar3 != null && wyVar3.Y0 != UserConfig.selectedAccount) {
                kiVar.n1.removeView(wyVar3);
                this.A = null;
            }
            if (this.A == null) {
                wy wyVar4 = new wy(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                this.A = wyVar4;
                wyVar4.c = 3;
                wyVar4.s0 = false;
                wyVar4.t2 = false;
                wyVar4.setShouldDrawBackground(false);
                wy wyVar5 = this.A;
                wyVar5.Q0 = false;
                wyVar5.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.A.setForseMultiwindowLayout(true);
                }
                this.A.setDelegate(new nm(this));
                kiVar.n1.addView(this.A);
                this.A.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
            this.A.setVisibility(0);
            this.W0 = true;
            wy wyVar6 = this.A;
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
            int i11 = point.x > point.y ? this.Z0 : this.Y0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wyVar6.getLayoutParams();
            layoutParams.height = AndroidUtilities.navigationBarHeight + i11;
            wyVar6.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.c1) != null) {
                AndroidUtilities.hideKeyboard(c6Var.getEditField());
            }
            this.X0 = i11;
            b4Var.a();
            kiVar.n1.requestLayout();
            org.telegram.ui.Cells.c6 c6Var3 = this.c1;
            emojiButton = c6Var3 != null ? c6Var3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            if (z10 || this.a1) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X0, 0.0f);
            ofFloat.addUpdateListener(new lm(this, i10));
            ofFloat.addListener(new om(this, i10));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.q1.w);
            ofFloat.start();
        }
    }

    public final void f0(int i9, Utilities.CallbackReturn callbackReturn, int i10, int i11) {
        x60 F = x60.F(this, null, new View(getContext()));
        F.s = 0;
        F.t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new jm(this, i9, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new jm(this, i9, 2), true);
        ll0 ll0Var = new ll0(getContext(), this.a);
        F.p = new org.telegram.ui.ke(ll0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        ll0Var.e(F);
        Drawable drawable = (Drawable) callbackReturn.run(ll0Var.s);
        kg.d c10 = ll0Var.n.c(null, null, false);
        c10.n(mg.c.j(ll0Var.b));
        c10.o(AndroidUtilities.dp(8.0f));
        c10.h.e = true;
        c10.p(AndroidUtilities.dp(16.0f));
        ll0Var.B = c10;
        ll0Var.A = drawable;
        Point point = AndroidUtilities.displaySize;
        int i12 = (point.x - i10) / 2;
        int i13 = (point.y - i11) / 2;
        int i14 = i10 + i12;
        int i15 = i11 + i13;
        c10.setBounds(i12 - AndroidUtilities.dp(8.0f), i13 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i14, AndroidUtilities.dp(8.0f) + i15);
        ll0Var.A.setBounds(i12, i13, i14, i15);
        ((FrameLayout.LayoutParams) ll0Var.x.getLayoutParams()).gravity = 1;
        ll0Var.H = true;
        ll0Var.show();
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean g() {
        return this.T0;
    }

    public final void g0() {
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
        int i9 = this.M0;
        int i10 = i9 + 1;
        this.n0 = i9;
        int i11 = i9 + 2;
        this.M0 = i11;
        this.o0 = i10;
        int i12 = this.I;
        if (i12 != 0) {
            this.p0 = i11;
            this.M0 = i11 + i12;
        }
        if (i12 != this.G.length) {
            int i13 = this.M0;
            this.M0 = i13 + 1;
            this.q0 = i13;
        }
        int i14 = this.M0;
        this.r0 = i14;
        int i15 = i14 + 2;
        this.M0 = i15;
        this.s0 = i14 + 1;
        if (z10) {
            int i16 = i14 + 3;
            this.M0 = i16;
            this.v0 = i15;
            if (this.c0) {
                this.M0 = i14 + 4;
                this.u0 = i16;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.qn) this.b.b0).e;
            boolean z11 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z11) {
                this.T = true;
            } else {
                int i17 = this.M0;
                this.M0 = i17 + 1;
                this.x0 = i17;
            }
            int i18 = this.M0;
            int i19 = i18 + 1;
            this.M0 = i19;
            this.B0 = i18;
            if (z11) {
                this.P = false;
            } else {
                this.M0 = i18 + 2;
                this.y0 = i19;
            }
            int i20 = this.M0;
            this.z0 = i20;
            this.A0 = i20 + 1;
            int i21 = i20 + 3;
            this.M0 = i21;
            this.C0 = i20 + 2;
            if (z11) {
                aVar.b = i21;
                int i22 = i20 + 5;
                this.M0 = i22;
                aVar2.b = i20 + 4;
                if (aVar2.a) {
                    this.M0 = i20 + 6;
                    this.H0 = i22;
                }
            }
            int i23 = this.M0;
            int i24 = i23 + 1;
            this.M0 = i24;
            this.D0 = i23;
            if (this.Q != 0 || this.R != 0) {
                this.E0 = i24;
                this.F0 = i23 + 2;
                this.M0 = i23 + 4;
                this.G0 = i23 + 3;
            }
            int i25 = this.M0;
            int i26 = i25 + 1;
            this.M0 = i26;
            this.t0 = i25;
            if (this.V) {
                this.k0 = i26;
                this.l0 = i25 + 2;
                this.M0 = i25 + 4;
                this.m0 = i25 + 3;
            }
        }
        int i27 = this.M0;
        this.M0 = i27 + 1;
        this.w0 = i27;
    }

    @Override // org.telegram.ui.Components.ci
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override // org.telegram.ui.Components.ci
    public int getCurrentItemTop() {
        View childAt;
        va1 va1Var = this.s;
        if (va1Var.getChildCount() <= 1 || (childAt = va1Var.getChildAt(1)) == null) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View F = va1Var.F(childAt);
        ik0 ik0Var = (ik0) (F == null ? null : va1Var.T(F));
        int y10 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        int i9 = (y10 <= 0 || ik0Var == null || ik0Var.b() != 1) ? 0 : y10;
        if (y10 < 0 || ik0Var == null || ik0Var.b() != 1) {
            y10 = i9;
        }
        return AndroidUtilities.dp(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.X0;
    }

    @Override // org.telegram.ui.Components.ci
    public int getFirstOffset() {
        return AndroidUtilities.dp(17.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ci
    public int getListTopPadding() {
        return this.N0;
    }

    @Override // org.telegram.ui.Components.ci
    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        int i9 = org.telegram.ui.ActionBar.f6.A5;
        va1 va1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 32768, null, null, null, null, i9));
        int i10 = org.telegram.ui.ActionBar.f6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 16, new Class[]{an.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 32, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 48, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        int i12 = org.telegram.ui.ActionBar.f6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.H6));
        int i14 = org.telegram.ui.ActionBar.f6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i14));
        int i15 = org.telegram.ui.ActionBar.f6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.M6));
        int i16 = org.telegram.ui.ActionBar.f6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.t8.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.il));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 32, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(va1Var, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"imageView"}, null, null, -1, null, i15));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ci
    public final int h() {
        return 1;
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean i() {
        if (!this.W0) {
            return !R();
        }
        Y(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ci
    public final void m() {
        this.D = true;
        ki kiVar = this.b;
        NotificationCenter.getInstance(kiVar.F1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.E) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            wy wyVar = this.A;
            if (wyVar != null) {
                kiVar.n1.removeView(wyVar);
            }
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final boolean p() {
        return R();
    }

    @Override // org.telegram.ui.Components.ci
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

    @Override // org.telegram.ui.Components.ci
    public final void s(float f10) {
        this.b.W1();
    }

    public void setDelegate(in inVar) {
        this.f0 = inVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v31 */
    @Override // org.telegram.ui.Components.ci
    public final void t(int i9) {
        if (i9 != 40) {
            return;
        }
        boolean z10 = this.n;
        int i10 = 0;
        int i11 = 1;
        ki kiVar = this.b;
        CharSequence[] charSequenceArr = this.G;
        if (z10) {
            CharSequence[] charSequenceArr2 = {X(this.J)};
            int i12 = kiVar.F1;
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i12).getEntities(charSequenceArr2, true);
            CharSequence charSequence = charSequenceArr2[0];
            if (entities != null) {
                int size = entities.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i13);
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
            for (int i14 = 0; i14 < charSequenceArr.length; i14++) {
                if (!TextUtils.isEmpty(X(charSequenceArr[i14]))) {
                    CharSequence[] charSequenceArr3 = {X(charSequenceArr[i14])};
                    ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i12).getEntities(charSequenceArr3, true);
                    CharSequence charSequence2 = charSequenceArr3[0];
                    if (entities2 != null) {
                        int size2 = entities2.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i15);
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
            y4.a0(i12, kiVar.j1() + 1, kiVar.n1(), new fh.i(this, (org.telegram.ui.qn) kiVar.b0, tL_messageMediaToDo, 8));
            return;
        }
        boolean z12 = this.V;
        va1 va1Var = this.s;
        boolean[] zArr = this.H;
        if (z12 && !this.T0) {
            int i16 = 0;
            while (i10 < zArr.length) {
                if (!TextUtils.isEmpty(X(charSequenceArr[i10])) && zArr[i10]) {
                    i16++;
                }
                i10++;
            }
            if (i16 <= 0) {
                for (int i17 = this.p0; i17 < this.p0 + this.I; i17++) {
                    f2.q1 K = va1Var.K(i17);
                    if (K != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.c6) {
                            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                            if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                zm zmVar = this.x;
                                if (zmVar != null) {
                                    zmVar.f();
                                }
                                String string = LocaleController.getString(R.string.PollTapToSelect);
                                s30 s30Var = this.y;
                                s30Var.setText(string);
                                s30Var.f(c6Var.getCheckBox(), true);
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
        int i18 = 0;
        while (true) {
            int length = charSequenceArr.length;
            yg.f fVar = this.h1;
            if (i18 >= length) {
                CharSequence[] charSequenceArr4 = {X(this.J)};
                int i19 = kiVar.F1;
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i19).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                if (entities3 != null) {
                    int size3 = entities3.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        TLRPC.MessageEntity messageEntity3 = entities3.get(i20);
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
                int i21 = this.Q;
                if (i21 != 0) {
                    poll2.hide_results_until_close = this.S;
                    poll2.close_period = i21;
                    poll2.flags |= 16;
                } else {
                    int i22 = this.R;
                    if (i22 != 0) {
                        poll2.hide_results_until_close = this.S;
                        poll2.close_date = i22;
                        poll2.flags |= 32;
                    }
                }
                poll2.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList2 = new ArrayList(this.F);
                int i23 = 0;
                while (i23 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(X(charSequenceArr[i23]))) {
                        fVar.h(tL_messageMediaPoll.poll.answers.size());
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[i11];
                        charSequenceArr5[i10] = X(charSequenceArr[i23]);
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i19).getEntities(charSequenceArr5, i11);
                        CharSequence charSequence4 = charSequenceArr5[i10];
                        if (entities4 != null) {
                            int size4 = entities4.size();
                            for (int i24 = 0; i24 < size4; i24++) {
                                TLRPC.MessageEntity messageEntity4 = entities4.get(i24);
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
                        if ((this.U || this.V) && zArr[i23]) {
                            arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i23++;
                    i10 = 0;
                    i11 = 1;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence X = X(this.L);
                if (X != null) {
                    tL_messageMediaPoll.results.solution = X.toString();
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i19).getEntities(new CharSequence[]{X}, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                y4.a0(i19, kiVar.j1() + 1, kiVar.n1(), new bg.j1(this, (org.telegram.ui.qn) kiVar.b0, tL_messageMediaPoll, arrayList2, 9));
                return;
            }
            if (TextUtils.isEmpty(X(charSequenceArr[i18])) && fVar.b(i18) != null) {
                this.R0 = true;
                this.S0 = i18;
                va1Var.x0(this.p0 + i18);
                return;
            }
            i18++;
        }
    }

    @Override // org.telegram.ui.Components.ci
    public final void x() {
        hn hnVar = this.r;
        if (hnVar != null) {
            hnVar.l();
        }
        if (this.E) {
            Y(false);
            zm zmVar = this.x;
            if (zmVar != null) {
                zmVar.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.c1;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.c1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.c1.getEditField());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // org.telegram.ui.Components.ci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i9, int i10) {
        int dp;
        int i11;
        ki kiVar = this.b;
        if (kiVar.n1.R() > AndroidUtilities.dp(20.0f) || this.W0 || this.b1 || this.d1) {
            dp = AndroidUtilities.dp(52.0f);
            kiVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i11 = (int) (i10 / 3.5f);
                    dp = i11 - AndroidUtilities.dp(13.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    kiVar.setAllowNestedScroll(this.d0);
                }
            }
            i11 = (i10 / 5) * 2;
            dp = i11 - AndroidUtilities.dp(13.0f);
            if (dp < 0) {
            }
            kiVar.setAllowNestedScroll(this.d0);
        }
        int i12 = dp + AndroidUtilities.statusBarHeight;
        this.e0 = true;
        int i13 = this.N0;
        va1 va1Var = this.s;
        if (i13 != i12 || va1Var.getPaddingBottom() != this.e) {
            this.N0 = i12;
            va1Var.o1(0, 0, 0, this.e);
            va1Var.setItemAnimator(null);
            this.r.m(0);
        }
        this.e0 = false;
    }
}
