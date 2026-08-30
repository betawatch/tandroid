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
import org.telegram.ui.jb1;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qn extends di implements pv0, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int j1 = 0;
    public int A0;
    public kz B;
    public int B0;
    public final ph.i3 C;
    public int C0;
    public boolean D;
    public int D0;
    public boolean E;
    public int E0;
    public final boolean F;
    public int F0;
    public final int G;
    public int G0;
    public final CharSequence[] H;
    public int H0;
    public final boolean[] I;
    public int I0;
    public int J;
    public final b7.l0 J0;
    public Editable K;
    public final b7.l0 K0;
    public Editable L;
    public final b7.l0[] L0;
    public Editable M;
    public final ArrayList M0;
    public final dh.w N;
    public int N0;
    public boolean O;
    public int O0;
    public boolean P;
    public final int P0;
    public boolean Q;
    public final int[] Q0;
    public int R;
    public final m2.b R0;
    public int S;
    public boolean S0;
    public boolean T;
    public int T0;
    public boolean U;
    public boolean U0;
    public boolean V;
    public int V0;
    public boolean W;
    public boolean W0;
    public boolean X0;
    public int Y0;
    public int Z0;
    public boolean a0;
    public int a1;
    public final boolean b0;
    public boolean b1;
    public boolean c0;
    public boolean c1;
    public boolean d0;
    public org.telegram.ui.Cells.c6 d1;
    public boolean e0;
    public boolean e1;
    public boolean f0;
    public boolean f1;
    public pn g0;
    public zm g1;
    public int h0;
    public int h1;
    public int i0;
    public final dh.i i1;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public final boolean n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final on r;
    public int r0;
    public final jb1 s;
    public int s0;
    public int t0;
    public int u0;
    public final en v;
    public int v0;
    public final ej w;
    public int w0;
    public final gn x;
    public int x0;
    public final k40 y;
    public int y0;
    public int z0;

    public qn(li liVar, Context context, boolean z4, org.telegram.ui.ActionBar.f6 f6Var, Boolean bool) {
        super(context, f6Var, liVar);
        this.J = 1;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.V = true;
        this.c0 = true;
        this.d0 = true;
        this.h0 = -1;
        b7.l0 l0Var = new b7.l0(this);
        this.J0 = l0Var;
        b7.l0 l0Var2 = new b7.l0(this);
        this.K0 = l0Var2;
        int i10 = 2;
        this.L0 = new b7.l0[]{l0Var, l0Var2};
        ArrayList arrayList = new ArrayList();
        this.M0 = arrayList;
        this.Q0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.R0 = new m2.b(this, 17);
        this.S0 = false;
        this.T0 = -1;
        this.e1 = false;
        this.f1 = false;
        Paint paint = new Paint(1);
        this.i1 = new dh.i();
        this.n = z4;
        int answersMaxCount = getAnswersMaxCount();
        this.G = answersMaxCount;
        this.H = new CharSequence[answersMaxCount];
        this.I = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.b.G1).getUserConfig().isPremium();
        this.F = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.W = booleanValue;
            this.b0 = booleanValue;
            boolean z10 = !booleanValue;
            this.Q = z10;
            this.O = z10;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hl, this.a));
        this.b.o1.setDelegate(this);
        on onVar = new on(this, context);
        this.r = onVar;
        jb1 jb1Var = new jb1(context, 4, null);
        this.s = jb1Var;
        this.c = jb1Var;
        this.d = jb1Var;
        this.h = true;
        this.f = true;
        en enVar = new en(this);
        this.v = enVar;
        jb1Var.setItemAnimator(enVar);
        arrayList.clear();
        enVar.m = false;
        enVar.C = false;
        enVar.o(nr.h);
        enVar.n(350L);
        jb1Var.setClipToPadding(false);
        jb1Var.setVerticalScrollBarEnabled(false);
        jb1Var.setSections(true);
        ej ejVar = new ej(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, jb1Var, 3);
        this.w = ejVar;
        jb1Var.setLayoutManager(ejVar);
        ejVar.O = true;
        new f2.e0(new oh.f(this, i10)).d(jb1Var);
        addView(jb1Var, k7.b6.e(-1, -1, 51));
        jb1Var.setPreserveFocusAfterLayout(true);
        jb1Var.setAdapter(onVar);
        jb1Var.setOnItemClickListener(new tm(this, f6Var, liVar, context));
        jb1Var.setOnScrollListener(new eg.f2(this, 23));
        k40 k40Var = new k40(context, 4);
        this.y = k40Var;
        k40Var.setAlpha(0.0f);
        k40Var.setVisibility(4);
        addView(k40Var, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.P0 = MessagesController.getInstance(this.b.G1).config.pollCaptionLengthMax.get();
        this.N = new dh.w(this.b.G1);
        NotificationCenter.getInstance(this.b.G1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            gn gnVar = new gn(context, this.b.G1, null, f6Var);
            this.x = gnVar;
            gnVar.y = true;
            gnVar.B = true;
            gnVar.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView(gnVar, k7.b6.e(-2, 160, 51));
        }
        this.C = new ph.i3(this.b.o1, false, null);
        T();
    }

    public static void J(qn qnVar, int i10) {
        k40 k40Var = qnVar.y;
        f2.l1 K = qnVar.s.K(qnVar.q0 + i10);
        if (K != null) {
            View view = K.a;
            if (view instanceof org.telegram.ui.Cells.c6) {
                org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    gn gnVar = qnVar.x;
                    if (gnVar != null) {
                        gnVar.f();
                    }
                    k40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    k40Var.f(c6Var.getCheckBox(), true);
                    ImageView imageView = k40Var.c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    k40Var.setTranslationY(k40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void K(qn qnVar, View view, int i10) {
        int length;
        int i11;
        int length2;
        float f10;
        boolean z4 = qnVar.n;
        if (!(view instanceof org.telegram.ui.Cells.c6)) {
            return;
        }
        org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
        if (i10 == qnVar.k0) {
            i11 = qnVar.P0;
            Editable editable = qnVar.L;
            if (editable != null) {
                length2 = editable.length();
                length = i11 - length2;
                f10 = i11;
                if (length > f10 - (0.7f * f10)) {
                    c6Var.setText2("");
                    return;
                }
                c6Var.setText2(String.format("%d", Integer.valueOf(length)));
                org.telegram.ui.ActionBar.k5 textView2 = c6Var.getTextView2();
                int i12 = length < 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.A6;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, qnVar.a));
                textView2.setTag(Integer.valueOf(i12));
                return;
            }
            length2 = 0;
            length = i11 - length2;
            f10 = i11;
            if (length > f10 - (0.7f * f10)) {
            }
        } else if (i10 == qnVar.j0) {
            i11 = z4 ? qnVar.getMessagesController().todoTitleLengthMax : 255;
            Editable editable2 = qnVar.K;
            if (editable2 != null) {
                length2 = editable2.length();
                length = i11 - length2;
                f10 = i11;
                if (length > f10 - (0.7f * f10)) {
                }
            }
            length2 = 0;
            length = i11 - length2;
            f10 = i11;
            if (length > f10 - (0.7f * f10)) {
            }
        } else {
            if (i10 == qnVar.m0) {
                Editable editable3 = qnVar.M;
                length = 200 - (editable3 != null ? editable3.length() : 0);
                i11 = 200;
            } else {
                int i13 = qnVar.q0;
                if (i10 < i13 || i10 >= qnVar.J + i13) {
                    return;
                }
                int i14 = i10 - i13;
                int i15 = z4 ? qnVar.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence = qnVar.H[i14];
                int i16 = i15;
                length = i15 - (charSequence != null ? charSequence.length() : 0);
                i11 = i16;
            }
            f10 = i11;
            if (length > f10 - (0.7f * f10)) {
            }
        }
    }

    public static void M(qn qnVar, org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        if (qnVar.F && z4) {
            if (qnVar.d1 == c6Var && qnVar.X0 && qnVar.e1) {
                qnVar.W();
                qnVar.X0 = false;
            }
            org.telegram.ui.Cells.c6 c6Var2 = qnVar.d1;
            qnVar.d1 = c6Var;
            c6Var.setEmojiButtonVisibility(true);
            qg emojiButton = c6Var.getEmojiButton();
            og ogVar = og.e;
            emojiButton.j(ogVar, false);
            jb1 jb1Var = qnVar.s;
            View F = jb1Var.F(c6Var);
            f2.l1 T = F == null ? null : jb1Var.T(F);
            gn gnVar = qnVar.x;
            if (gnVar != null) {
                gnVar.f();
                if (T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.c6) && gnVar.getDelegate() != view) {
                        gnVar.setDelegate((org.telegram.ui.Cells.c6) view);
                    }
                }
            }
            if (c6Var2 == null || c6Var2 == c6Var) {
                return;
            }
            if (qnVar.X0) {
                qnVar.W();
                qnVar.Z(false);
                qnVar.c0();
            }
            c6Var2.setEmojiButtonVisibility(false);
            c6Var2.getEmojiButton().j(ogVar, false);
        }
    }

    public static void N(qn qnVar, org.telegram.ui.Cells.c6 c6Var) {
        qnVar.d1 = c6Var;
        if (!qnVar.X0) {
            qnVar.f0(1);
        } else {
            qnVar.W();
            qnVar.c0();
        }
    }

    public static void O(qn qnVar, int i10) {
        li liVar;
        org.telegram.ui.ActionBar.p2 p2Var;
        dh.i iVar = qnVar.i1;
        if (iVar.b(i10) == null) {
            qnVar.b0(i10);
            return;
        }
        dh.h b10 = iVar.b(i10);
        if (b10 == null || (liVar = qnVar.b) == null || (p2Var = liVar.c0) == null) {
            return;
        }
        Activity parentActivity = p2Var.getParentActivity();
        if (b10 instanceof eh.d) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((eh.d) b10).b);
            PhotoViewer.t1().K2(parentActivity, null, null);
            PhotoViewer.t1().f2(arrayList, 0, 14, false, new wm(qnVar, i10), null);
            return;
        }
        if (b10 instanceof eh.i) {
            eh.i iVar2 = (eh.i) b10;
            org.telegram.ui.pt.q().w(parentActivity);
            org.telegram.ui.pt.q().v(new ym(qnVar, i10));
            org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
            TLRPC.Document document = iVar2.b;
            q10.t(document, null, "", null, null, MessageObject.isAnimatedEmoji(document) ? 2 : 0, false, iVar2.c, qnVar.a, 200);
            return;
        }
        if (b10 instanceof eh.c) {
            eh.c cVar = (eh.c) b10;
            qnVar.g0(i10, new org.telegram.ui.pf(1, cVar.d, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof eh.h) {
            eh.h hVar = (eh.h) b10;
            TLRPC.Document document2 = hVar.b.getDocument();
            qnVar.g0(i10, new i(MessageObject.getMusicTitle(document2, true), MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), hVar, 1), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof eh.g) {
            qnVar.g0(i10, new ni((eh.g) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
        } else if (!(b10 instanceof eh.e)) {
            qnVar.b0(i10);
        } else {
            eh.e eVar = (eh.e) b10;
            z4.g0(qnVar.getContext(), qnVar.a, eVar.b, eVar.n, new pm(qnVar, i10, 1), new qm(qnVar, i10, 0));
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

    public static zm d0(org.telegram.ui.ActionBar.p2 p2Var, int i10, Utilities.Callback callback, fg fgVar) {
        if (p2Var == null) {
            return null;
        }
        zm zmVar = new zm(p2Var.getContext(), p2Var, p2Var.getResourceProvider(), fgVar);
        zmVar.W1 = new bn(callback, p2Var, zmVar);
        zmVar.X1 = new cn(callback, zmVar);
        zmVar.g0.f0();
        zmVar.J1(1, true);
        zmVar.h1(i10);
        zmVar.q2 = new rm(callback);
        zmVar.U = new dn(callback, p2Var, zmVar);
        zmVar.V = new o1(16, callback, zmVar);
        zmVar.r1();
        zmVar.setFocusable(true);
        zmVar.show();
        return zmVar;
    }

    private int getAnswersMaxCount() {
        return this.n ? getMessagesController().todoItemsMax : getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        li liVar = this.b;
        return liVar != null ? liVar.G1 : UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override // org.telegram.ui.Components.di
    public final void D(di diVar) {
        li liVar = this.b;
        try {
            liVar.U0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            liVar.U0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.b0) {
            liVar.U0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            liVar.U0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        liVar.W1();
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.di
    public final void F() {
        this.s.x0(1);
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        boolean z10;
        if (this.F) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.b1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z4) {
                    this.a1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.a1).commit();
                } else {
                    this.Z0 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.Z0).commit();
                }
            }
            boolean z11 = this.X0;
            li liVar = this.b;
            ph.i3 i3Var = this.C;
            if (z11) {
                int i11 = z4 ? this.a1 : this.Z0;
                if (this.e1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.f1 != this.e1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.B.setLayoutParams(layoutParams);
                    this.Y0 = layoutParams.height;
                    i3Var.a();
                    liVar.o1.requestLayout();
                    boolean z12 = this.f1;
                    if (z12 != this.e1) {
                        Q(z12 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.f1 = this.e1;
                }
            }
            if (this.V0 == i10 && this.W0 == z4) {
                return;
            }
            this.V0 = i10;
            this.W0 = z4;
            boolean z13 = this.b1;
            org.telegram.ui.Cells.c6 c6Var = this.d1;
            if (c6Var != null) {
                this.b1 = c6Var.getEditField().isFocused() && i3Var.c() && i10 > 0;
            } else {
                this.b1 = false;
            }
            if (this.b1 && this.X0) {
                f0(0);
            }
            if (this.Y0 != 0 && !(z10 = this.b1) && z10 != z13 && !this.X0) {
                this.Y0 = 0;
                i3Var.a();
                liVar.o1.requestLayout();
            }
            if (this.b1 && this.D) {
                this.D = false;
                AndroidUtilities.cancelRunOnUIThread(this.R0);
            }
        }
    }

    public final void P() {
        gn gnVar = this.x;
        if (gnVar != null) {
            gnVar.setDelegate(null);
            gnVar.f();
        }
        this.s.setItemAnimator(this.v);
        int i10 = this.J;
        this.I[i10] = false;
        int i11 = i10 + 1;
        this.J = i11;
        int length = this.H.length;
        on onVar = this.r;
        if (i11 == length) {
            onVar.u(this.r0);
        }
        onVar.o(this.r0);
        h0();
        this.h0 = (this.q0 + this.J) - 1;
        onVar.m(this.s0);
        onVar.m(this.x0);
    }

    public final void Q(float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.gg(this, f10, 2));
        ofFloat.addListener(new vm(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
        ofFloat.start();
    }

    public final void R() {
        boolean z4 = (this.W || this.U) ? false : true;
        if (!z4) {
            this.Q = false;
        }
        int i10 = this.z0;
        if (i10 < 0) {
            return;
        }
        f2.l1 K = this.s.K(i10);
        if (K == null) {
            this.r.m(this.z0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.a;
        if (!z4) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().a.a(!z4, true);
    }

    public final boolean S() {
        boolean z4 = TextUtils.isEmpty(Y(this.K)) && TextUtils.isEmpty(Y(this.L)) && TextUtils.isEmpty(Y(this.M)) && this.i1.a.size() == 0;
        if (z4) {
            for (int i10 = 0; i10 < this.J && (z4 = TextUtils.isEmpty(Y(this.H[i10]))); i10++) {
            }
        }
        if (!z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.c0.getParentActivity());
            boolean z10 = this.n;
            alertDialog$Builder.a.O = LocaleController.getString(z10 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(z10 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new t(this, 23));
            kh.a2.u(R.string.Cancel, alertDialog$Builder, null);
        }
        return z4;
    }

    public final void T() {
        int i10;
        boolean z4 = this.W;
        CharSequence[] charSequenceArr = this.H;
        if (z4) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.I;
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
        boolean z10 = this.n;
        int i12 = z10 ? getMessagesController().todoTitleLengthMax : 255;
        int i13 = z10 ? getMessagesController().todoItemLengthMax : 100;
        boolean z11 = (TextUtils.isEmpty(Y(this.L)) || this.L.length() <= this.P0) && (TextUtils.isEmpty(Y(this.M)) || this.M.length() <= 200) && !TextUtils.isEmpty(Y(this.K)) && this.K.length() <= i12;
        int i14 = 0;
        int i15 = 0;
        boolean z12 = false;
        while (true) {
            if (i14 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(Y(charSequenceArr[i14]))) {
                if (charSequenceArr[i14].length() > i13) {
                    i15 = 0;
                    z12 = true;
                    break;
                } else {
                    i15++;
                    z12 = true;
                }
            }
            i14++;
        }
        if (i15 < 1 || (this.W && i10 < 1)) {
            z11 = false;
        }
        if (TextUtils.isEmpty(this.M) && TextUtils.isEmpty(this.K) && TextUtils.isEmpty(this.L) && !z12 && this.i1.a.size() <= 0) {
            this.e0 = true;
        } else {
            this.e0 = false;
        }
        boolean z13 = this.e0;
        li liVar = this.b;
        liVar.setAllowNestedScroll(z13);
        this.U0 = z11;
        liVar.W1();
    }

    public final void U(org.telegram.ui.Cells.o8 o8Var, boolean z4) {
        if (this.S != 0) {
            o8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.S), z4, false);
        } else if (this.R != 0) {
            o8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.R / 3600, new Object[0]), z4, false);
        } else {
            o8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z4, false);
        }
    }

    public final void V(eh.e eVar, boolean z4) {
        TLRPC.Photo photo;
        String str = eVar.b;
        dh.w wVar = this.N;
        boolean containsKey = wVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) wVar.b.get(eVar.b);
        xd.a aVar = eVar.s;
        ImageReceiver imageReceiver = eVar.a;
        eVar.r.a(containsKey || (webPage instanceof TLRPC.TL_webPagePending), z4);
        eVar.n = webPage;
        if (webPage == null || (photo = webPage.photo) == null) {
            aVar.a(false, z4);
            imageReceiver.clearImage();
        } else {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            aVar.a(true, z4);
        }
    }

    public final void W() {
        if (this.e1) {
            this.B.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.B.setLayoutParams(layoutParams);
            this.Y0 = layoutParams.height;
            this.f1 = this.e1;
            this.e1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(View view, org.telegram.ui.Cells.c6 c6Var, boolean z4) {
        int b10;
        gn gnVar;
        org.telegram.ui.ActionBar.p2 p2Var;
        if (view.getTag() != null) {
            return;
        }
        view.setTag(1);
        jb1 jb1Var = this.s;
        f2.l1 G = jb1Var.G(c6Var);
        if (G == null || (b10 = G.b()) == -1) {
            return;
        }
        int i10 = b10 - this.q0;
        dh.i iVar = this.i1;
        boolean z10 = iVar.b(i10) != null;
        if (z4 && z10 && (p2Var = this.b.c0) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(p2Var.getParentActivity(), 0, this.a);
            alertDialog$Builder.a.O = LocaleController.getString(!this.W ? R.string.DiscardPollOptionWithMediaAlertTitle : R.string.DiscardQuizOptionWithMediaAlertTitle);
            alertDialog$Builder.a.Q = LocaleController.getString(!this.W ? R.string.DiscardPollOptionWithMediaMessage : R.string.DiscardQuizOptionWithMediaMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, view, c6Var, 22));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new zg(view, 1));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            d2Var.show();
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        iVar.h(i10);
        jb1Var.setItemAnimator(this.v);
        on onVar = this.r;
        onVar.u(b10);
        int i11 = i10 + 1;
        CharSequence[] charSequenceArr = this.H;
        System.arraycopy(charSequenceArr, i11, charSequenceArr, i10, (charSequenceArr.length - 1) - i10);
        boolean[] zArr = this.I;
        System.arraycopy(zArr, i11, zArr, i10, (zArr.length - 1) - i10);
        charSequenceArr[charSequenceArr.length - 1] = null;
        zArr[zArr.length - 1] = false;
        int i12 = this.J - 1;
        this.J = i12;
        if (i12 == charSequenceArr.length - 1) {
            onVar.o((this.q0 + charSequenceArr.length) - 1);
        }
        f2.l1 K = jb1Var.K(b10 - 1);
        EditTextBoldCursor textView2 = c6Var.getTextView();
        if (K != null) {
            View view2 = K.a;
            if (view2 instanceof org.telegram.ui.Cells.c6) {
                ((org.telegram.ui.Cells.c6) view2).getTextView().requestFocus();
                textView2.clearFocus();
                T();
                h0();
                gnVar = this.x;
                if (gnVar != null) {
                    gnVar.f();
                    gnVar.setDelegate(null);
                }
                onVar.m(this.s0);
                onVar.m(this.x0);
            }
        }
        if (textView2.isFocused()) {
            AndroidUtilities.hideKeyboard(textView2);
            Z(true);
        } else if (this.e1) {
            Z(true);
        }
        textView2.clearFocus();
        T();
        h0();
        gnVar = this.x;
        if (gnVar != null) {
        }
        onVar.m(this.s0);
        onVar.m(this.x0);
    }

    public final void Z(boolean z4) {
        if (this.F) {
            int i10 = 0;
            if (this.X0) {
                kz kzVar = this.B;
                kzVar.M.B0();
                kzVar.F.scrollTo(0, 0);
                kzVar.G(1);
                kzVar.N.h1(0, 0);
                this.B.t(false);
                if (z4) {
                    this.B.B();
                }
                this.e1 = false;
                f0(0);
            }
            if (z4) {
                kz kzVar2 = this.B;
                if (kzVar2 == null || kzVar2.getVisibility() != 0) {
                    a0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.B.getMeasuredHeight());
                ofFloat.addUpdateListener(new sm(this, i10));
                this.c1 = true;
                ofFloat.addListener(new vm(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                ofFloat.start();
            }
        }
    }

    public final void a0() {
        kz kzVar;
        qg emojiButton;
        if (!this.X0 && (kzVar = this.B) != null && kzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.c6 c6Var = this.d1;
            if (c6Var != null && (emojiButton = c6Var.getEmojiButton()) != null) {
                emojiButton.j(og.e, false);
            }
            this.B.setVisibility(8);
        }
        int i10 = this.Y0;
        this.Y0 = 0;
        if (i10 != 0) {
            this.C.a();
        }
    }

    public final void b0(int i10) {
        this.h1 = i10;
        org.telegram.ui.ActionBar.p2 p2Var = this.b.c0;
        this.i1.b(i10);
        this.g1 = d0(p2Var, (i10 == -2 || i10 == -3) ? 74 : 41026, new pm(this, i10, 0), new fg(this, 26));
    }

    public final void c0() {
        org.telegram.ui.Cells.c6 c6Var = this.d1;
        if (c6Var != null) {
            this.C.e = true;
            EditTextBoldCursor editField = c6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        f0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.b1 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.D = true;
        m2.b bVar = this.R0;
        AndroidUtilities.cancelRunOnUIThread(bVar);
        AndroidUtilities.runOnUIThread(bVar, 100L);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 != NotificationCenter.didReceivedWebpagesInUpdates) {
            if (i10 == NotificationCenter.emojiLoaded) {
                kz kzVar = this.B;
                if (kzVar != null) {
                    kzVar.M.f1();
                }
                org.telegram.ui.Cells.c6 c6Var = this.d1;
                if (c6Var != null) {
                    int currentTextColor = c6Var.getEditField().getCurrentTextColor();
                    this.d1.getEditField().setTextColor(-1);
                    this.d1.getEditField().setTextColor(currentTextColor);
                    return;
                }
                return;
            }
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (Map.Entry entry : this.N.b.entrySet()) {
            if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                entry.setValue(webPage);
            }
        }
        dh.i iVar = this.i1;
        int size = iVar.a.size();
        for (int i12 = 0; i12 < size; i12++) {
            dh.h hVar2 = (dh.h) iVar.a.get(i12);
            if (hVar2 instanceof eh.e) {
                V((eh.e) hVar2, true);
            }
        }
    }

    public final void e0(int i10, dh.h hVar) {
        int i11;
        dh.i iVar = this.i1;
        if (hVar != null) {
            iVar.a.put(i10, hVar);
        } else {
            iVar.a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.k0;
        } else if (i10 == -3) {
            i11 = this.m0;
        } else {
            int i12 = this.q0;
            i11 = (i12 < 0 || i10 < 0 || i10 >= this.J) ? -1 : i10 + i12;
        }
        if (i11 >= 0) {
            f2.l1 K = this.s.K(i11);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.c6) {
                    ((org.telegram.ui.Cells.c6) view).e.a(hVar, true);
                }
            }
            this.r.m(i11);
        }
        if (hVar instanceof eh.e) {
            eh.e eVar = (eh.e) hVar;
            String str = eVar.b;
            dh.v vVar = new dh.v(15, this, hVar);
            dh.w wVar = this.N;
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
                    ConnectionsManager.getInstance(wVar.a).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new dh.v(0, wVar, str));
                }
            }
            V(eVar, false);
        }
        T();
    }

    public final void f0(int i10) {
        qg emojiButton;
        org.telegram.ui.Cells.c6 c6Var;
        if (this.F) {
            ph.i3 i3Var = this.C;
            li liVar = this.b;
            int i11 = 1;
            if (i10 != 1) {
                org.telegram.ui.Cells.c6 c6Var2 = this.d1;
                emojiButton = c6Var2 != null ? c6Var2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.j(og.e, true);
                }
                kz kzVar = this.B;
                if (kzVar != null) {
                    this.X0 = false;
                    this.e1 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        kzVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.Y0 = 0;
                }
                i3Var.a();
                liVar.o1.requestLayout();
                return;
            }
            kz kzVar2 = this.B;
            boolean z4 = kzVar2 != null && kzVar2.getVisibility() == 0;
            kz kzVar3 = this.B;
            if (kzVar3 != null && kzVar3.Z0 != UserConfig.selectedAccount) {
                liVar.o1.removeView(kzVar3);
                this.B = null;
            }
            if (this.B == null) {
                kz kzVar4 = new kz(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                this.B = kzVar4;
                kzVar4.c = 3;
                kzVar4.t0 = false;
                kzVar4.u2 = false;
                kzVar4.setShouldDrawBackground(false);
                kz kzVar5 = this.B;
                kzVar5.R0 = false;
                kzVar5.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.B.setForseMultiwindowLayout(true);
                }
                this.B.setDelegate(new um(this));
                liVar.o1.addView(this.B);
                this.B.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
            this.B.setVisibility(0);
            this.X0 = true;
            kz kzVar6 = this.B;
            if (this.Z0 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.Z0 = AndroidUtilities.dp(150.0f);
                } else {
                    this.Z0 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.a1 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.a1 = AndroidUtilities.dp(150.0f);
                } else {
                    this.a1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i12 = point.x > point.y ? this.a1 : this.Z0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar6.getLayoutParams();
            layoutParams.height = AndroidUtilities.navigationBarHeight + i12;
            kzVar6.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (c6Var = this.d1) != null) {
                AndroidUtilities.hideKeyboard(c6Var.getEditField());
            }
            this.Y0 = i12;
            i3Var.a();
            liVar.o1.requestLayout();
            org.telegram.ui.Cells.c6 c6Var3 = this.d1;
            emojiButton = c6Var3 != null ? c6Var3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.j(og.d, true);
            }
            if (z4 || this.b1) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y0, 0.0f);
            ofFloat.addUpdateListener(new sm(this, i11));
            ofFloat.addListener(new vm(this, i11));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.r1.w);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.di
    public final boolean g() {
        return this.U0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        o70 F = o70.F(this, null, new View(getContext()));
        F.s = 0;
        F.t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new qm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new qm(this, i10, 2), true);
        im0 im0Var = new im0(getContext(), this.a);
        F.p = new org.telegram.ui.pe(im0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        im0Var.e(F);
        Drawable drawable = (Drawable) callbackReturn.run(im0Var.s);
        pg.b c3 = im0Var.n.c(null, null, false);
        c3.n(rg.b.j(im0Var.b));
        c3.o(AndroidUtilities.dp(8.0f));
        c3.h.e = true;
        c3.p(AndroidUtilities.dp(16.0f));
        im0Var.C = c3;
        im0Var.B = drawable;
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c3.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        im0Var.B.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) im0Var.x.getLayoutParams()).gravity = 1;
        im0Var.I = true;
        im0Var.show();
    }

    @Override // org.telegram.ui.Components.di
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override // org.telegram.ui.Components.di
    public int getCurrentItemTop() {
        View childAt;
        jb1 jb1Var = this.s;
        if (jb1Var.getChildCount() <= 1 || (childAt = jb1Var.getChildAt(1)) == null) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View F = jb1Var.F(childAt);
        el0 el0Var = (el0) (F == null ? null : jb1Var.T(F));
        int y10 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        int i10 = (y10 <= 0 || el0Var == null || el0Var.b() != 1) ? 0 : y10;
        if (y10 < 0 || el0Var == null || el0Var.b() != 1) {
            y10 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y10;
    }

    public int getEmojiPadding() {
        return this.Y0;
    }

    @Override // org.telegram.ui.Components.di
    public int getFirstOffset() {
        return AndroidUtilities.dp(17.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.di
    public int getListTopPadding() {
        return this.O0;
    }

    @Override // org.telegram.ui.Components.di
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        jb1 jb1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 16, new Class[]{hn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 48, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i15 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 196608, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 262144, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i17 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.il));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 32, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(jb1Var, 0, new Class[]{org.telegram.ui.Cells.o8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.di
    public final int h() {
        return 1;
    }

    public final void h0() {
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.C0 = -1;
        this.y0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.z0 = -1;
        this.B0 = -1;
        this.A0 = -1;
        this.D0 = -1;
        b7.l0 l0Var = this.J0;
        l0Var.b = -1;
        b7.l0 l0Var2 = this.K0;
        l0Var2.b = -1;
        this.I0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.r0 = -1;
        this.q0 = -1;
        this.u0 = -1;
        this.k0 = -1;
        this.i0 = 1;
        this.N0 = 3;
        this.j0 = 2;
        boolean z4 = this.n;
        if (!z4) {
            this.N0 = 4;
            this.k0 = 3;
        }
        int i10 = this.N0;
        int i11 = i10 + 1;
        this.o0 = i10;
        int i12 = i10 + 2;
        this.N0 = i12;
        this.p0 = i11;
        int i13 = this.J;
        if (i13 != 0) {
            this.q0 = i12;
            this.N0 = i12 + i13;
        }
        if (i13 != this.H.length) {
            int i14 = this.N0;
            this.N0 = i14 + 1;
            this.r0 = i14;
        }
        int i15 = this.N0;
        this.s0 = i15;
        int i16 = i15 + 2;
        this.N0 = i16;
        this.t0 = i15 + 1;
        if (z4) {
            int i17 = i15 + 3;
            this.N0 = i17;
            this.w0 = i16;
            if (this.d0) {
                this.N0 = i15 + 4;
                this.v0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.xn) this.b.c0).e;
            boolean z10 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z10) {
                this.U = true;
            } else {
                int i18 = this.N0;
                this.N0 = i18 + 1;
                this.y0 = i18;
            }
            int i19 = this.N0;
            int i20 = i19 + 1;
            this.N0 = i20;
            this.C0 = i19;
            if (z10) {
                this.Q = false;
            } else {
                this.N0 = i19 + 2;
                this.z0 = i20;
            }
            int i21 = this.N0;
            this.A0 = i21;
            this.B0 = i21 + 1;
            int i22 = i21 + 3;
            this.N0 = i22;
            this.D0 = i21 + 2;
            if (z10) {
                l0Var.b = i22;
                int i23 = i21 + 5;
                this.N0 = i23;
                l0Var2.b = i21 + 4;
                if (l0Var2.a) {
                    this.N0 = i21 + 6;
                    this.I0 = i23;
                }
            }
            int i24 = this.N0;
            int i25 = i24 + 1;
            this.N0 = i25;
            this.E0 = i24;
            if (this.R != 0 || this.S != 0) {
                this.F0 = i25;
                this.G0 = i24 + 2;
                this.N0 = i24 + 4;
                this.H0 = i24 + 3;
            }
            int i26 = this.N0;
            int i27 = i26 + 1;
            this.N0 = i27;
            this.u0 = i26;
            if (this.W) {
                this.l0 = i27;
                this.m0 = i26 + 2;
                this.N0 = i26 + 4;
                this.n0 = i26 + 3;
            }
        }
        int i28 = this.N0;
        this.N0 = i28 + 1;
        this.x0 = i28;
    }

    @Override // org.telegram.ui.Components.di
    public final boolean i() {
        if (!this.X0) {
            return !S();
        }
        Z(true);
        return true;
    }

    @Override // org.telegram.ui.Components.di
    public final void m() {
        this.E = true;
        li liVar = this.b;
        NotificationCenter.getInstance(liVar.G1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.F) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            kz kzVar = this.B;
            if (kzVar != null) {
                liVar.o1.removeView(kzVar);
            }
        }
    }

    @Override // org.telegram.ui.Components.di
    public final boolean p() {
        return S();
    }

    @Override // org.telegram.ui.Components.di
    public final void q() {
        this.b.W1();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f0) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.di
    public final void s(float f10) {
        this.b.W1();
    }

    public void setDelegate(pn pnVar) {
        this.g0 = pnVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.b.getSheetContainer().invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v31 */
    @Override // org.telegram.ui.Components.di
    public final void t(int i10) {
        if (i10 != 40) {
            return;
        }
        boolean z4 = this.n;
        int i11 = 0;
        int i12 = 1;
        li liVar = this.b;
        CharSequence[] charSequenceArr = this.H;
        if (z4) {
            CharSequence[] charSequenceArr2 = {Y(this.K)};
            int i13 = liVar.G1;
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
            boolean z10 = this.d0;
            todoList.others_can_append = z10 && this.c0;
            todoList.others_can_complete = z10;
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
            z4.a0(i13, liVar.j1() + 1, liVar.n1(), new kh.h(this, (org.telegram.ui.xn) liVar.c0, tL_messageMediaToDo, 8));
            return;
        }
        boolean z11 = this.W;
        jb1 jb1Var = this.s;
        boolean[] zArr = this.I;
        if (z11 && !this.U0) {
            int i17 = 0;
            while (i11 < zArr.length) {
                if (!TextUtils.isEmpty(Y(charSequenceArr[i11])) && zArr[i11]) {
                    i17++;
                }
                i11++;
            }
            if (i17 <= 0) {
                for (int i18 = this.q0; i18 < this.q0 + this.J; i18++) {
                    f2.l1 K = jb1Var.K(i18);
                    if (K != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.c6) {
                            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
                            if (c6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                gn gnVar = this.x;
                                if (gnVar != null) {
                                    gnVar.f();
                                }
                                String string = LocaleController.getString(R.string.PollTapToSelect);
                                k40 k40Var = this.y;
                                k40Var.setText(string);
                                k40Var.f(c6Var.getCheckBox(), true);
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
            dh.i iVar = this.i1;
            if (i19 >= length) {
                CharSequence[] charSequenceArr4 = {Y(this.K)};
                int i20 = liVar.G1;
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
                tL_poll.multiple_choice = this.V;
                tL_poll.quiz = this.W;
                tL_poll.public_voters = !this.U;
                tL_poll.open_answers = this.Q;
                tL_poll.revoting_disabled = !this.O;
                tL_poll.shuffle_answers = this.P;
                tL_poll.subscribers_only = this.J0.a;
                if (this.K0.a) {
                    ArrayList arrayList = this.M0;
                    if (!arrayList.isEmpty()) {
                        TLRPC.Poll poll = tL_messageMediaPoll.poll;
                        poll.flags |= 4096;
                        poll.countries_iso2.addAll(arrayList);
                    }
                }
                TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                poll2.creator = true;
                int i22 = this.R;
                if (i22 != 0) {
                    poll2.hide_results_until_close = this.T;
                    poll2.close_period = i22;
                    poll2.flags |= 16;
                } else {
                    int i23 = this.S;
                    if (i23 != 0) {
                        poll2.hide_results_until_close = this.T;
                        poll2.close_date = i23;
                        poll2.flags |= 32;
                    }
                }
                poll2.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList2 = new ArrayList(this.G);
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
                        if ((this.V || this.W) && zArr[i24]) {
                            arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i24++;
                    i11 = 0;
                    i12 = 1;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence Y = Y(this.M);
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
                z4.a0(i20, liVar.j1() + 1, liVar.n1(), new gg.c1(this, (org.telegram.ui.xn) liVar.c0, tL_messageMediaPoll, arrayList2, 9));
                return;
            }
            if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && iVar.b(i19) != null) {
                this.S0 = true;
                this.T0 = i19;
                jb1Var.x0(this.q0 + i19);
                return;
            }
            i19++;
        }
    }

    @Override // org.telegram.ui.Components.di
    public final void x() {
        on onVar = this.r;
        if (onVar != null) {
            onVar.l();
        }
        if (this.F) {
            Z(false);
            gn gnVar = this.x;
            if (gnVar != null) {
                gnVar.f();
            }
            org.telegram.ui.Cells.c6 c6Var = this.d1;
            if (c6Var != null) {
                c6Var.setEmojiButtonVisibility(false);
                this.d1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.d1.getEditField());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // org.telegram.ui.Components.di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        li liVar = this.b;
        if (liVar.o1.R() > AndroidUtilities.dp(20.0f) || this.X0 || this.c1 || this.e1) {
            dp = AndroidUtilities.dp(52.0f);
            liVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(13.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    liVar.setAllowNestedScroll(this.e0);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(13.0f);
            if (dp < 0) {
            }
            liVar.setAllowNestedScroll(this.e0);
        }
        int i13 = dp + AndroidUtilities.statusBarHeight;
        this.f0 = true;
        int i14 = this.O0;
        jb1 jb1Var = this.s;
        if (i14 != i13 || jb1Var.getPaddingBottom() != this.e) {
            this.O0 = i13;
            jb1Var.o1(0, 0, 0, this.e);
            jb1Var.setItemAnimator(null);
            this.r.m(0);
        }
        this.f0 = false;
    }
}
