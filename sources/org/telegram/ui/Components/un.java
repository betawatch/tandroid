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
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class un extends ni implements zv0, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int m1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public kz E;
    public int E0;
    public final ci.j4 F;
    public int F0;
    public boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public final int J;
    public int J0;
    public final CharSequence[] K;
    public int K0;
    public final boolean[] L;
    public int L0;
    public int M;
    public final c2.a M0;
    public Editable N;
    public final c2.a N0;
    public Editable O;
    public final c2.a[] O0;
    public Editable P;
    public final ArrayList P0;
    public final qh.r Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public final int S0;
    public boolean T;
    public final int[] T0;
    public int U;
    public final org.telegram.ui.Cells.u6 U0;
    public int V;
    public boolean V0;
    public boolean W;
    public int W0;
    public boolean X0;
    public int Y0;
    public boolean Z0;
    public boolean a0;
    public boolean a1;
    public boolean b0;
    public int b1;
    public boolean c0;
    public int c1;
    public boolean d0;
    public int d1;
    public final boolean e0;
    public boolean e1;
    public boolean f0;
    public boolean f1;
    public boolean g0;
    public org.telegram.ui.Cells.e6 g1;
    public boolean h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public tn j0;
    public cn j1;
    public int k0;
    public int k1;
    public int l0;
    public final qh.f l1;
    public int m0;
    public final boolean n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final sn r;
    public int r0;
    public final fc1 s;
    public int s0;
    public int t0;
    public int u0;
    public final hn v;
    public int v0;
    public final hg.e0 w;
    public int w0;
    public final jn x;
    public int x0;
    public final i40 y;
    public int y0;
    public int z0;

    public un(vi viVar, Context context, boolean z10, org.telegram.ui.ActionBar.f6 f6Var, Boolean bool) {
        super(context, f6Var, viVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.b0 = true;
        this.f0 = true;
        this.g0 = true;
        this.k0 = -1;
        c2.a aVar = new c2.a(this);
        this.M0 = aVar;
        c2.a aVar2 = new c2.a(this);
        this.N0 = aVar2;
        int i10 = 2;
        this.O0 = new c2.a[]{aVar, aVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new org.telegram.ui.Cells.u6(this, 9);
        this.V0 = false;
        this.W0 = -1;
        this.h1 = false;
        this.i1 = false;
        Paint paint = new Paint(1);
        this.l1 = new qh.f();
        this.n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.b.J1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.c0 = booleanValue;
            this.e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        h0();
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.hl, this.a));
        this.b.r1.setDelegate(this);
        sn snVar = new sn(this, context);
        this.r = snVar;
        fc1 fc1Var = new fc1(context, 5, null);
        this.s = fc1Var;
        this.c = fc1Var;
        this.d = fc1Var;
        this.h = true;
        this.f = true;
        hn hnVar = new hn(this);
        this.v = hnVar;
        fc1Var.setItemAnimator(hnVar);
        arrayList.clear();
        hnVar.m = false;
        hnVar.C = false;
        hnVar.o(qr.h);
        hnVar.n(350L);
        fc1Var.setClipToPadding(false);
        fc1Var.setVerticalScrollBarEnabled(false);
        fc1Var.setSections(true);
        hg.e0 e0Var = new hg.e0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, fc1Var, 4);
        this.w = e0Var;
        fc1Var.setLayoutManager(e0Var);
        e0Var.O = true;
        new s4.y(new bi.g(this, i10)).e(fc1Var);
        addView(fc1Var, w7.y5.e(-1, -1, 51));
        fc1Var.setPreserveFocusAfterLayout(true);
        fc1Var.setAdapter(snVar);
        fc1Var.setOnItemClickListener(new vm(this, f6Var, viVar, context));
        fc1Var.setOnScrollListener(new ai.r(this, 23));
        i40 i40Var = new i40(context, 4);
        this.y = i40Var;
        i40Var.setAlpha(0.0f);
        i40Var.setVisibility(4);
        addView(i40Var, w7.y5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
        this.S0 = MessagesController.getInstance(this.b.J1).config.pollCaptionLengthMax.get();
        this.Q = new qh.r(this.b.J1);
        NotificationCenter.getInstance(this.b.J1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            jn jnVar = new jn(context, this.b.J1, null, f6Var);
            this.x = jnVar;
            jnVar.y = true;
            jnVar.E = true;
            jnVar.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView(jnVar, w7.y5.e(-2, 160, 51));
        }
        this.F = new ci.j4(this.b.r1, false, null);
        T();
    }

    public static void K(un unVar, int i10) {
        i40 i40Var = unVar.y;
        s4.c1 L = unVar.s.L(unVar.t0 + i10);
        if (L != null) {
            View view = L.a;
            if (view instanceof org.telegram.ui.Cells.e6) {
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                if (e6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    jn jnVar = unVar.x;
                    if (jnVar != null) {
                        jnVar.f();
                    }
                    i40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    i40Var.f(e6Var.getCheckBox(), true);
                    ImageView imageView = i40Var.c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    i40Var.setTranslationY(i40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void L(un unVar, View view, int i10) {
        int length;
        int i11;
        int length2;
        float f7;
        boolean z10 = unVar.n;
        if (!(view instanceof org.telegram.ui.Cells.e6)) {
            return;
        }
        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
        if (i10 == unVar.n0) {
            i11 = unVar.S0;
            Editable editable = unVar.O;
            if (editable != null) {
                length2 = editable.length();
                length = i11 - length2;
                f7 = i11;
                if (length > f7 - (0.7f * f7)) {
                    e6Var.setText2("");
                    return;
                }
                e6Var.setText2(String.format("%d", Integer.valueOf(length)));
                org.telegram.ui.ActionBar.j5 textView2 = e6Var.getTextView2();
                int i12 = length < 0 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.A6;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, unVar.a));
                textView2.setTag(Integer.valueOf(i12));
                return;
            }
            length2 = 0;
            length = i11 - length2;
            f7 = i11;
            if (length > f7 - (0.7f * f7)) {
            }
        } else if (i10 == unVar.m0) {
            i11 = z10 ? unVar.getMessagesController().todoTitleLengthMax : 255;
            Editable editable2 = unVar.N;
            if (editable2 != null) {
                length2 = editable2.length();
                length = i11 - length2;
                f7 = i11;
                if (length > f7 - (0.7f * f7)) {
                }
            }
            length2 = 0;
            length = i11 - length2;
            f7 = i11;
            if (length > f7 - (0.7f * f7)) {
            }
        } else {
            if (i10 == unVar.p0) {
                Editable editable3 = unVar.P;
                length = 200 - (editable3 != null ? editable3.length() : 0);
                i11 = 200;
            } else {
                int i13 = unVar.t0;
                if (i10 < i13 || i10 >= unVar.M + i13) {
                    return;
                }
                int i14 = i10 - i13;
                int i15 = z10 ? unVar.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence = unVar.K[i14];
                int i16 = i15;
                length = i15 - (charSequence != null ? charSequence.length() : 0);
                i11 = i16;
            }
            f7 = i11;
            if (length > f7 - (0.7f * f7)) {
            }
        }
    }

    public static void M(un unVar, org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        if (unVar.I && z10) {
            if (unVar.g1 == e6Var && unVar.a1 && unVar.h1) {
                unVar.W();
                unVar.a1 = false;
            }
            org.telegram.ui.Cells.e6 e6Var2 = unVar.g1;
            unVar.g1 = e6Var;
            e6Var.setEmojiButtonVisibility(true);
            ah emojiButton = e6Var.getEmojiButton();
            yg ygVar = yg.e;
            emojiButton.j(ygVar, false);
            fc1 fc1Var = unVar.s;
            View G = fc1Var.G(e6Var);
            s4.c1 U = G == null ? null : fc1Var.U(G);
            jn jnVar = unVar.x;
            if (jnVar != null) {
                jnVar.f();
                if (U != null) {
                    View view = U.a;
                    if ((view instanceof org.telegram.ui.Cells.e6) && jnVar.getDelegate() != view) {
                        jnVar.setDelegate((org.telegram.ui.Cells.e6) view);
                    }
                }
            }
            if (e6Var2 == null || e6Var2 == e6Var) {
                return;
            }
            if (unVar.a1) {
                unVar.W();
                unVar.Z(false);
                unVar.c0();
            }
            e6Var2.setEmojiButtonVisibility(false);
            e6Var2.getEmojiButton().j(ygVar, false);
        }
    }

    public static void N(un unVar, org.telegram.ui.Cells.e6 e6Var) {
        unVar.g1 = e6Var;
        if (!unVar.a1) {
            unVar.f0(1);
        } else {
            unVar.W();
            unVar.c0();
        }
    }

    public static void O(un unVar, int i10) {
        vi viVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        qh.f fVar = unVar.l1;
        if (fVar.b(i10) == null) {
            unVar.b0(i10);
            return;
        }
        qh.e b10 = fVar.b(i10);
        if (b10 == null || (viVar = unVar.b) == null || (n2Var = viVar.f0) == null) {
            return;
        }
        Activity parentActivity = n2Var.getParentActivity();
        if (b10 instanceof rh.d) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((rh.d) b10).b);
            PhotoViewer.t1().J2(parentActivity, null, null);
            PhotoViewer.t1().f2(arrayList, 0, 14, false, new zm(unVar, i10), null);
            return;
        }
        if (b10 instanceof rh.h) {
            rh.h hVar = (rh.h) b10;
            org.telegram.ui.st.q().w(parentActivity);
            org.telegram.ui.st.q().v(new bn(unVar, i10));
            org.telegram.ui.st q6 = org.telegram.ui.st.q();
            TLRPC.Document document = hVar.b;
            q6.t(document, null, "", null, null, MessageObject.isAnimatedEmoji(document) ? 2 : 0, false, hVar.c, unVar.a, 200);
            return;
        }
        if (b10 instanceof rh.c) {
            rh.c cVar = (rh.c) b10;
            unVar.g0(i10, new org.telegram.ui.wf(1, cVar.d, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof rh.g) {
            rh.g gVar = (rh.g) b10;
            TLRPC.Document document2 = gVar.b.getDocument();
            unVar.g0(i10, new ci.p5(MessageObject.getMusicTitle(document2, true), MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof rh.f) {
            unVar.g0(i10, new xi((rh.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
        } else if (!(b10 instanceof rh.e)) {
            unVar.b0(i10);
        } else {
            rh.e eVar = (rh.e) b10;
            d5.g0(unVar.getContext(), unVar.a, eVar.b, eVar.n, new rm(unVar, i10, 1), new sm(unVar, i10, 0));
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

    public static cn d0(org.telegram.ui.ActionBar.n2 n2Var, int i10, Utilities.Callback callback, og ogVar) {
        if (n2Var == null) {
            return null;
        }
        cn cnVar = new cn(n2Var.getContext(), n2Var, n2Var.getResourceProvider(), ogVar);
        cnVar.Z1 = new en(callback, n2Var, cnVar);
        cnVar.a2 = new fn(callback, cnVar);
        cnVar.j0.f0();
        cnVar.J1(1, true);
        cnVar.h1(i10);
        cnVar.t2 = new tm(callback);
        cnVar.X = new gn(callback, n2Var, cnVar);
        cnVar.Y = new a3(8, callback, cnVar);
        cnVar.r1();
        cnVar.setFocusable(true);
        cnVar.show();
        return cnVar;
    }

    private int getAnswersMaxCount() {
        return this.n ? getMessagesController().todoItemsMax : getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        vi viVar = this.b;
        return viVar != null ? viVar.J1 : UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override // org.telegram.ui.Components.ni
    public final void E(ni niVar) {
        vi viVar = this.b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            viVar.X0.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.e0) {
            viVar.X0.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            viVar.X0.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        viVar.W1();
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.ni
    public final void G() {
        this.s.y0(1);
    }

    @Override // org.telegram.ui.Components.zv0
    public final void H(int i10, boolean z10) {
        boolean z11;
        if (this.I) {
            if (i10 > AndroidUtilities.dp(50.0f) && this.e1 && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                if (z10) {
                    this.d1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.d1).commit();
                } else {
                    this.c1 = i10;
                    MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.c1).commit();
                }
            }
            boolean z12 = this.a1;
            vi viVar = this.b;
            ci.j4 j4Var = this.F;
            if (z12) {
                int i11 = z10 ? this.d1 : this.c1;
                if (this.h1) {
                    i11 += AndroidUtilities.dp(120.0f);
                }
                int i12 = i11 + AndroidUtilities.navigationBarHeight;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
                int i13 = layoutParams.width;
                int i14 = AndroidUtilities.displaySize.x;
                if (i13 != i14 || layoutParams.height != i12 || this.i1 != this.h1) {
                    layoutParams.width = i14;
                    layoutParams.height = i12;
                    this.E.setLayoutParams(layoutParams);
                    this.b1 = layoutParams.height;
                    j4Var.a();
                    viVar.r1.requestLayout();
                    boolean z13 = this.i1;
                    if (z13 != this.h1) {
                        Q(z13 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
                    }
                    this.i1 = this.h1;
                }
            }
            if (this.Y0 == i10 && this.Z0 == z10) {
                return;
            }
            this.Y0 = i10;
            this.Z0 = z10;
            boolean z14 = this.e1;
            org.telegram.ui.Cells.e6 e6Var = this.g1;
            if (e6Var != null) {
                this.e1 = e6Var.getEditField().isFocused() && j4Var.c() && i10 > 0;
            } else {
                this.e1 = false;
            }
            if (this.e1 && this.a1) {
                f0(0);
            }
            if (this.b1 != 0 && !(z11 = this.e1) && z11 != z14 && !this.a1) {
                this.b1 = 0;
                j4Var.a();
                viVar.r1.requestLayout();
            }
            if (this.e1 && this.G) {
                this.G = false;
                AndroidUtilities.cancelRunOnUIThread(this.U0);
            }
        }
    }

    public final void P() {
        jn jnVar = this.x;
        if (jnVar != null) {
            jnVar.setDelegate(null);
            jnVar.f();
        }
        this.s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        sn snVar = this.r;
        if (i11 == length) {
            snVar.u(this.u0);
        }
        snVar.o(this.u0);
        h0();
        this.k0 = (this.t0 + this.M) - 1;
        snVar.m(this.v0);
        snVar.m(this.A0);
    }

    public final void Q(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.lg(this, f7, 2));
        ofFloat.addListener(new ym(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
        ofFloat.start();
    }

    public final void R() {
        boolean z10 = (this.c0 || this.a0) ? false : true;
        if (!z10) {
            this.T = false;
        }
        int i10 = this.C0;
        if (i10 < 0) {
            return;
        }
        s4.c1 L = this.s.L(i10);
        if (L == null) {
            this.r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) L.a;
        if (!z10) {
            b6Var.setChecked(false);
        }
        b6Var.getCheckBox().a.a(!z10, true);
    }

    public final boolean S() {
        boolean z10 = TextUtils.isEmpty(Y(this.N)) && TextUtils.isEmpty(Y(this.O)) && TextUtils.isEmpty(Y(this.P)) && this.l1.a.size() == 0;
        if (z10) {
            for (int i10 = 0; i10 < this.M && (z10 = TextUtils.isEmpty(Y(this.K[i10]))); i10++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.f0.getParentActivity());
            boolean z11 = this.n;
            alertDialog$Builder.a.R = LocaleController.getString(z11 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            hg.k0.p(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void T() {
        int i10;
        boolean z10 = this.c0;
        CharSequence[] charSequenceArr = this.K;
        if (z10) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                boolean[] zArr = this.L;
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
        boolean z12 = (TextUtils.isEmpty(Y(this.O)) || this.O.length() <= this.S0) && (TextUtils.isEmpty(Y(this.P)) || this.P.length() <= 200) && !TextUtils.isEmpty(Y(this.N)) && this.N.length() <= i12;
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
        if (i15 < 1 || (this.c0 && i10 < 1)) {
            z12 = false;
        }
        if (TextUtils.isEmpty(this.P) && TextUtils.isEmpty(this.N) && TextUtils.isEmpty(this.O) && !z13 && this.l1.a.size() <= 0) {
            this.h0 = true;
        } else {
            this.h0 = false;
        }
        boolean z14 = this.h0;
        vi viVar = this.b;
        viVar.setAllowNestedScroll(z14);
        this.X0 = z12;
        viVar.W1();
    }

    public final void U(org.telegram.ui.Cells.s8 s8Var, boolean z10) {
        if (this.V != 0) {
            s8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.V), z10, false);
        } else if (this.U != 0) {
            s8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.U / 3600, new Object[0]), z10, false);
        } else {
            s8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void V(rh.e eVar, boolean z10) {
        TLRPC.Photo photo;
        String str = eVar.b;
        qh.r rVar = this.Q;
        boolean containsKey = rVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) rVar.b.get(eVar.b);
        le.b bVar = eVar.s;
        ImageReceiver imageReceiver = eVar.a;
        eVar.r.a(containsKey || (webPage instanceof TLRPC.TL_webPagePending), z10);
        eVar.n = webPage;
        if (webPage == null || (photo = webPage.photo) == null) {
            bVar.a(false, z10);
            imageReceiver.clearImage();
        } else {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 40);
            imageReceiver.setImage(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, AndroidUtilities.dp(36.0f), false, closestPhotoSizeWithSize, true), webPage.photo), "48_48", ImageLocation.getForObject(closestPhotoSizeWithSize, webPage.photo), "48_48_b", 0L, null, webPage, 1);
            bVar.a(true, z10);
        }
    }

    public final void W() {
        if (this.h1) {
            this.E.t(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.b1 = layoutParams.height;
            this.i1 = this.h1;
            this.h1 = false;
            Q(-AndroidUtilities.dp(120.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(View view, org.telegram.ui.Cells.e6 e6Var, boolean z10) {
        int b10;
        jn jnVar;
        org.telegram.ui.ActionBar.n2 n2Var;
        if (view.getTag() != null) {
            return;
        }
        view.setTag(1);
        fc1 fc1Var = this.s;
        s4.c1 H = fc1Var.H(e6Var);
        if (H == null || (b10 = H.b()) == -1) {
            return;
        }
        int i10 = b10 - this.t0;
        qh.f fVar = this.l1;
        boolean z11 = fVar.b(i10) != null;
        if (z10 && z11 && (n2Var = this.b.f0) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2Var.getParentActivity(), 0, this.a);
            alertDialog$Builder.a.R = LocaleController.getString(!this.c0 ? R.string.DiscardPollOptionWithMediaAlertTitle : R.string.DiscardQuizOptionWithMediaAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(!this.c0 ? R.string.DiscardPollOptionWithMediaMessage : R.string.DiscardQuizOptionWithMediaMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ai.r5(this, view, e6Var, 27));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new jh(view, 1));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        fVar.h(i10);
        fc1Var.setItemAnimator(this.v);
        sn snVar = this.r;
        snVar.u(b10);
        int i11 = i10 + 1;
        CharSequence[] charSequenceArr = this.K;
        System.arraycopy(charSequenceArr, i11, charSequenceArr, i10, (charSequenceArr.length - 1) - i10);
        boolean[] zArr = this.L;
        System.arraycopy(zArr, i11, zArr, i10, (zArr.length - 1) - i10);
        charSequenceArr[charSequenceArr.length - 1] = null;
        zArr[zArr.length - 1] = false;
        int i12 = this.M - 1;
        this.M = i12;
        if (i12 == charSequenceArr.length - 1) {
            snVar.o((this.t0 + charSequenceArr.length) - 1);
        }
        s4.c1 L = fc1Var.L(b10 - 1);
        EditTextBoldCursor textView2 = e6Var.getTextView();
        if (L != null) {
            View view2 = L.a;
            if (view2 instanceof org.telegram.ui.Cells.e6) {
                ((org.telegram.ui.Cells.e6) view2).getTextView().requestFocus();
                textView2.clearFocus();
                T();
                h0();
                jnVar = this.x;
                if (jnVar != null) {
                    jnVar.f();
                    jnVar.setDelegate(null);
                }
                snVar.m(this.v0);
                snVar.m(this.A0);
            }
        }
        if (textView2.isFocused()) {
            AndroidUtilities.hideKeyboard(textView2);
            Z(true);
        } else if (this.h1) {
            Z(true);
        }
        textView2.clearFocus();
        T();
        h0();
        jnVar = this.x;
        if (jnVar != null) {
        }
        snVar.m(this.v0);
        snVar.m(this.A0);
    }

    public final void Z(boolean z10) {
        if (this.I) {
            int i10 = 0;
            if (this.a1) {
                kz kzVar = this.E;
                kzVar.P.C0();
                kzVar.I.scrollTo(0, 0);
                kzVar.F(1);
                kzVar.Q.h1(0, 0);
                this.E.t(false);
                if (z10) {
                    this.E.A();
                }
                this.h1 = false;
                f0(0);
            }
            if (z10) {
                kz kzVar2 = this.E;
                if (kzVar2 == null || kzVar2.getVisibility() != 0) {
                    a0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                ofFloat.addUpdateListener(new um(this, i10));
                this.f1 = true;
                ofFloat.addListener(new ym(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                ofFloat.start();
            }
        }
    }

    public final void a0() {
        kz kzVar;
        ah emojiButton;
        if (!this.a1 && (kzVar = this.E) != null && kzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.e6 e6Var = this.g1;
            if (e6Var != null && (emojiButton = e6Var.getEmojiButton()) != null) {
                emojiButton.j(yg.e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.b1;
        this.b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    public final void b0(int i10) {
        this.k1 = i10;
        org.telegram.ui.ActionBar.n2 n2Var = this.b.f0;
        this.l1.b(i10);
        this.j1 = d0(n2Var, (i10 == -2 || i10 == -3) ? 74 : 41026, new rm(this, i10, 0), new og(this, 26));
    }

    public final void c0() {
        org.telegram.ui.Cells.e6 e6Var = this.g1;
        if (e6Var != null) {
            this.F.e = true;
            EditTextBoldCursor editField = e6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        f0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.e1 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.G = true;
        org.telegram.ui.Cells.u6 u6Var = this.U0;
        AndroidUtilities.cancelRunOnUIThread(u6Var);
        AndroidUtilities.runOnUIThread(u6Var, 100L);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 != NotificationCenter.didReceivedWebpagesInUpdates) {
            if (i10 == NotificationCenter.emojiLoaded) {
                kz kzVar = this.E;
                if (kzVar != null) {
                    kzVar.P.g1();
                }
                org.telegram.ui.Cells.e6 e6Var = this.g1;
                if (e6Var != null) {
                    int currentTextColor = e6Var.getEditField().getCurrentTextColor();
                    this.g1.getEditField().setTextColor(-1);
                    this.g1.getEditField().setTextColor(currentTextColor);
                    return;
                }
                return;
            }
            return;
        }
        a0.i iVar = (a0.i) objArr[0];
        for (Map.Entry entry : this.Q.b.entrySet()) {
            if (entry.getValue() != null && (webPage = (TLRPC.WebPage) iVar.f(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                entry.setValue(webPage);
            }
        }
        qh.f fVar = this.l1;
        int size = fVar.a.size();
        for (int i12 = 0; i12 < size; i12++) {
            qh.e eVar = (qh.e) fVar.a.get(i12);
            if (eVar instanceof rh.e) {
                V((rh.e) eVar, true);
            }
        }
    }

    public final void e0(int i10, qh.e eVar) {
        int i11;
        qh.f fVar = this.l1;
        if (eVar != null) {
            fVar.a.put(i10, eVar);
        } else {
            fVar.a.remove(i10);
        }
        if (i10 == -2) {
            i11 = this.n0;
        } else if (i10 == -3) {
            i11 = this.p0;
        } else {
            int i12 = this.t0;
            i11 = (i12 < 0 || i10 < 0 || i10 >= this.M) ? -1 : i10 + i12;
        }
        if (i11 >= 0) {
            s4.c1 L = this.s.L(i11);
            if (L != null) {
                View view = L.a;
                if (view instanceof org.telegram.ui.Cells.e6) {
                    ((org.telegram.ui.Cells.e6) view).e.a(eVar, true);
                }
            }
            this.r.m(i11);
        }
        if (eVar instanceof rh.e) {
            rh.e eVar2 = (rh.e) eVar;
            String str = eVar2.b;
            ai.m0 m0Var = new ai.m0(10, this, eVar);
            qh.r rVar = this.Q;
            HashMap hashMap = rVar.c;
            HashMap hashMap2 = rVar.b;
            if (hashMap2.containsKey(str)) {
                m0Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(m0Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(rVar.a).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new ai.m0(20, rVar, str));
                }
            }
            V(eVar2, false);
        }
        T();
    }

    public final void f0(int i10) {
        ah emojiButton;
        org.telegram.ui.Cells.e6 e6Var;
        if (this.I) {
            ci.j4 j4Var = this.F;
            vi viVar = this.b;
            int i11 = 1;
            if (i10 != 1) {
                org.telegram.ui.Cells.e6 e6Var2 = this.g1;
                emojiButton = e6Var2 != null ? e6Var2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.j(yg.e, true);
                }
                kz kzVar = this.E;
                if (kzVar != null) {
                    this.a1 = false;
                    this.h1 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        kzVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.b1 = 0;
                }
                j4Var.a();
                viVar.r1.requestLayout();
                return;
            }
            kz kzVar2 = this.E;
            boolean z10 = kzVar2 != null && kzVar2.getVisibility() == 0;
            kz kzVar3 = this.E;
            if (kzVar3 != null && kzVar3.c1 != UserConfig.selectedAccount) {
                viVar.r1.removeView(kzVar3);
                this.E = null;
            }
            if (this.E == null) {
                kz kzVar4 = new kz(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                this.E = kzVar4;
                kzVar4.c = 3;
                kzVar4.w0 = false;
                kzVar4.w2 = false;
                kzVar4.setShouldDrawBackground(false);
                kz kzVar5 = this.E;
                kzVar5.U0 = false;
                kzVar5.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.E.setForseMultiwindowLayout(true);
                }
                this.E.setDelegate(new xm(this));
                viVar.r1.addView(this.E);
                this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
            this.E.setVisibility(0);
            this.a1 = true;
            kz kzVar6 = this.E;
            if (this.c1 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.c1 = AndroidUtilities.dp(150.0f);
                } else {
                    this.c1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.d1 <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.d1 = AndroidUtilities.dp(150.0f);
                } else {
                    this.d1 = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i12 = point.x > point.y ? this.d1 : this.c1;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) kzVar6.getLayoutParams();
            layoutParams.height = AndroidUtilities.navigationBarHeight + i12;
            kzVar6.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (e6Var = this.g1) != null) {
                AndroidUtilities.hideKeyboard(e6Var.getEditField());
            }
            this.b1 = i12;
            j4Var.a();
            viVar.r1.requestLayout();
            org.telegram.ui.Cells.e6 e6Var3 = this.g1;
            emojiButton = e6Var3 != null ? e6Var3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.j(yg.d, true);
            }
            if (z10 || this.e1) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b1, 0.0f);
            ofFloat.addUpdateListener(new um(this, i11));
            ofFloat.addListener(new ym(this, i11));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.p1.w);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean g() {
        return this.X0;
    }

    public final void g0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        v70 F = v70.F(this, null, new View(getContext()));
        F.s = 0;
        F.t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new sm(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new sm(this, i10, 2), true);
        mm0 mm0Var = new mm0(getContext(), this.a);
        F.p = new org.telegram.ui.re(mm0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        mm0Var.e(F);
        Drawable drawable = (Drawable) callbackReturn.run(mm0Var.s);
        ch.d c10 = mm0Var.n.c(null, null, false);
        c10.o(eh.b.k(mm0Var.b));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(16.0f));
        mm0Var.F = c10;
        mm0Var.E = drawable;
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        mm0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) mm0Var.x.getLayoutParams()).gravity = 1;
        mm0Var.L = true;
        mm0Var.show();
    }

    @Override // org.telegram.ui.Components.ni
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        View childAt;
        fc1 fc1Var = this.s;
        if (fc1Var.getChildCount() <= 1 || (childAt = fc1Var.getChildAt(1)) == null) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View G = fc1Var.G(childAt);
        fl0 fl0Var = (fl0) (G == null ? null : fc1Var.U(G));
        int y3 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        int i10 = (y3 <= 0 || fl0Var == null || fl0Var.b() != 1) ? 0 : y3;
        if (y3 < 0 || fl0Var == null || fl0Var.b() != 1) {
            y3 = i10;
        }
        return AndroidUtilities.dp(25.0f) + y3;
    }

    public int getEmojiPadding() {
        return this.b1;
    }

    @Override // org.telegram.ui.Components.ni
    public int getFirstOffset() {
        return AndroidUtilities.dp(17.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.ni
    public int getListTopPadding() {
        return this.R0;
    }

    @Override // org.telegram.ui.Components.ni
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        fc1 fc1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 48, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 16, new Class[]{kn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 48, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i13 = org.telegram.ui.ActionBar.j6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.A6));
        int i14 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 4, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.H6));
        int i15 = org.telegram.ui.ActionBar.j6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 196608, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 262144, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.e6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.M6));
        int i17 = org.telegram.ui.ActionBar.j6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.il));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 32, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(fc1Var, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ni
    public final int h() {
        return 1;
    }

    public final void h0() {
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.F0 = -1;
        this.B0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.C0 = -1;
        this.E0 = -1;
        this.D0 = -1;
        this.G0 = -1;
        c2.a aVar = this.M0;
        aVar.b = -1;
        c2.a aVar2 = this.N0;
        aVar2.b = -1;
        this.L0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.u0 = -1;
        this.t0 = -1;
        this.x0 = -1;
        this.n0 = -1;
        this.l0 = 1;
        this.Q0 = 3;
        this.m0 = 2;
        boolean z10 = this.n;
        if (!z10) {
            this.Q0 = 4;
            this.n0 = 3;
        }
        int i10 = this.Q0;
        int i11 = i10 + 1;
        this.r0 = i10;
        int i12 = i10 + 2;
        this.Q0 = i12;
        this.s0 = i11;
        int i13 = this.M;
        if (i13 != 0) {
            this.t0 = i12;
            this.Q0 = i12 + i13;
        }
        if (i13 != this.K.length) {
            int i14 = this.Q0;
            this.Q0 = i14 + 1;
            this.u0 = i14;
        }
        int i15 = this.Q0;
        this.v0 = i15;
        int i16 = i15 + 2;
        this.Q0 = i16;
        this.w0 = i15 + 1;
        if (z10) {
            int i17 = i15 + 3;
            this.Q0 = i17;
            this.z0 = i16;
            if (this.g0) {
                this.Q0 = i15 + 4;
                this.y0 = i17;
            }
        } else {
            TLRPC.Chat chat = ((org.telegram.ui.zn) this.b.f0).e;
            boolean z11 = ChatObject.isChannel(chat) && !chat.megagroup;
            if (z11) {
                this.a0 = true;
            } else {
                int i18 = this.Q0;
                this.Q0 = i18 + 1;
                this.B0 = i18;
            }
            int i19 = this.Q0;
            int i20 = i19 + 1;
            this.Q0 = i20;
            this.F0 = i19;
            if (z11) {
                this.T = false;
            } else {
                this.Q0 = i19 + 2;
                this.C0 = i20;
            }
            int i21 = this.Q0;
            this.D0 = i21;
            this.E0 = i21 + 1;
            int i22 = i21 + 3;
            this.Q0 = i22;
            this.G0 = i21 + 2;
            if (z11) {
                aVar.b = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                aVar2.b = i21 + 4;
                if (aVar2.a) {
                    this.Q0 = i21 + 6;
                    this.L0 = i23;
                }
            }
            int i24 = this.Q0;
            int i25 = i24 + 1;
            this.Q0 = i25;
            this.H0 = i24;
            if (this.U != 0 || this.V != 0) {
                this.I0 = i25;
                this.J0 = i24 + 2;
                this.Q0 = i24 + 4;
                this.K0 = i24 + 3;
            }
            int i26 = this.Q0;
            int i27 = i26 + 1;
            this.Q0 = i27;
            this.x0 = i26;
            if (this.c0) {
                this.o0 = i27;
                this.p0 = i26 + 2;
                this.Q0 = i26 + 4;
                this.q0 = i26 + 3;
            }
        }
        int i28 = this.Q0;
        this.Q0 = i28 + 1;
        this.A0 = i28;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean i() {
        if (!this.a1) {
            return !S();
        }
        Z(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ni
    public final void m() {
        this.H = true;
        vi viVar = this.b;
        NotificationCenter.getInstance(viVar.J1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            kz kzVar = this.E;
            if (kzVar != null) {
                viVar.r1.removeView(kzVar);
            }
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean p() {
        return S();
    }

    @Override // org.telegram.ui.Components.ni
    public final void q() {
        this.b.W1();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i0) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ni
    public final void s(float f7) {
        this.b.W1();
    }

    public void setDelegate(tn tnVar) {
        this.j0 = tnVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v31 */
    @Override // org.telegram.ui.Components.ni
    public final void t(int i10) {
        if (i10 != 40) {
            return;
        }
        boolean z10 = this.n;
        int i11 = 0;
        int i12 = 1;
        vi viVar = this.b;
        CharSequence[] charSequenceArr = this.K;
        if (z10) {
            CharSequence[] charSequenceArr2 = {Y(this.N)};
            int i13 = viVar.J1;
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
            boolean z11 = this.g0;
            todoList.others_can_append = z11 && this.f0;
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
            d5.a0(i13, viVar.j1() + 1, viVar.n1(), new ai.d5(this, (org.telegram.ui.zn) viVar.f0, tL_messageMediaToDo, 4));
            return;
        }
        boolean z12 = this.c0;
        fc1 fc1Var = this.s;
        boolean[] zArr = this.L;
        if (z12 && !this.X0) {
            int i17 = 0;
            while (i11 < zArr.length) {
                if (!TextUtils.isEmpty(Y(charSequenceArr[i11])) && zArr[i11]) {
                    i17++;
                }
                i11++;
            }
            if (i17 <= 0) {
                for (int i18 = this.t0; i18 < this.t0 + this.M; i18++) {
                    s4.c1 L = fc1Var.L(i18);
                    if (L != null) {
                        View view = L.a;
                        if (view instanceof org.telegram.ui.Cells.e6) {
                            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                            if (e6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                jn jnVar = this.x;
                                if (jnVar != null) {
                                    jnVar.f();
                                }
                                String string = LocaleController.getString(R.string.PollTapToSelect);
                                i40 i40Var = this.y;
                                i40Var.setText(string);
                                i40Var.f(e6Var.getCheckBox(), true);
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
            qh.f fVar = this.l1;
            if (i19 >= length) {
                CharSequence[] charSequenceArr4 = {Y(this.N)};
                int i20 = viVar.J1;
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
                tL_poll.multiple_choice = this.b0;
                tL_poll.quiz = this.c0;
                tL_poll.public_voters = !this.a0;
                tL_poll.open_answers = this.T;
                tL_poll.revoting_disabled = !this.R;
                tL_poll.shuffle_answers = this.S;
                tL_poll.subscribers_only = this.M0.a;
                if (this.N0.a) {
                    ArrayList arrayList = this.P0;
                    if (!arrayList.isEmpty()) {
                        TLRPC.Poll poll = tL_messageMediaPoll.poll;
                        poll.flags |= 4096;
                        poll.countries_iso2.addAll(arrayList);
                    }
                }
                TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                poll2.creator = true;
                int i22 = this.U;
                if (i22 != 0) {
                    poll2.hide_results_until_close = this.W;
                    poll2.close_period = i22;
                    poll2.flags |= 16;
                } else {
                    int i23 = this.V;
                    if (i23 != 0) {
                        poll2.hide_results_until_close = this.W;
                        poll2.close_date = i23;
                        poll2.flags |= 32;
                    }
                }
                poll2.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList2 = new ArrayList(this.J);
                int i24 = 0;
                while (i24 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(Y(charSequenceArr[i24]))) {
                        fVar.h(tL_messageMediaPoll.poll.answers.size());
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
                        if ((this.b0 || this.c0) && zArr[i24]) {
                            arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i24++;
                    i11 = 0;
                    i12 = 1;
                }
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence Y = Y(this.P);
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
                d5.a0(i20, viVar.j1() + 1, viVar.n1(), new ai.e4(this, (org.telegram.ui.zn) viVar.f0, tL_messageMediaPoll, arrayList2, 7));
                return;
            }
            if (TextUtils.isEmpty(Y(charSequenceArr[i19])) && fVar.b(i19) != null) {
                this.V0 = true;
                this.W0 = i19;
                fc1Var.y0(this.t0 + i19);
                return;
            }
            i19++;
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void x() {
        sn snVar = this.r;
        if (snVar != null) {
            snVar.l();
        }
        if (this.I) {
            Z(false);
            jn jnVar = this.x;
            if (jnVar != null) {
                jnVar.f();
            }
            org.telegram.ui.Cells.e6 e6Var = this.g1;
            if (e6Var != null) {
                e6Var.setEmojiButtonVisibility(false);
                this.g1.getTextView().clearFocus();
                AndroidUtilities.hideKeyboard(this.g1.getEditField());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // org.telegram.ui.Components.ni
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y(int i10, int i11) {
        int dp;
        int i12;
        vi viVar = this.b;
        if (viVar.r1.R() > AndroidUtilities.dp(20.0f) || this.a1 || this.f1 || this.h1) {
            dp = AndroidUtilities.dp(52.0f);
            viVar.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                    dp = i12 - AndroidUtilities.dp(13.0f);
                    if (dp < 0) {
                        dp = 0;
                    }
                    viVar.setAllowNestedScroll(this.h0);
                }
            }
            i12 = (i11 / 5) * 2;
            dp = i12 - AndroidUtilities.dp(13.0f);
            if (dp < 0) {
            }
            viVar.setAllowNestedScroll(this.h0);
        }
        int i13 = dp + AndroidUtilities.statusBarHeight;
        this.i0 = true;
        int i14 = this.R0;
        fc1 fc1Var = this.s;
        if (i14 != i13 || fc1Var.getPaddingBottom() != this.e) {
            this.R0 = i13;
            fc1Var.p1(0, 0, 0, this.e);
            fc1Var.setItemAnimator(null);
            this.r.m(0);
        }
        this.i0 = false;
    }
}
