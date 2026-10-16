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
import org.telegram.ui.kc1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class io extends ni implements nw0, NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int m1 = 0;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public wz E;
    public int E0;
    public final di.h4 F;
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
    public final c5.f M0;
    public Editable N;
    public final c5.f N0;
    public Editable O;
    public final c5.f[] O0;
    public Editable P;
    public final ArrayList P0;
    public final rh.s Q;
    public int Q0;
    public boolean R;
    public int R0;
    public boolean S;
    public final int S0;
    public boolean T;
    public final int[] T0;
    public int U;
    public final org.telegram.ui.Cells.l7 U0;
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
    public org.telegram.ui.Cells.d6 g1;
    public boolean h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public ho j0;
    public pn j1;
    public int k0;
    public int k1;
    public int l0;
    public final rh.f l1;
    public int m0;
    public final boolean n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public final go r;
    public int r0;
    public final kc1 s;
    public int s0;
    public int t0;
    public int u0;
    public final un v;
    public int v0;
    public final ig.e0 w;
    public int w0;
    public final wn x;
    public int x0;
    public final v40 y;
    public int y0;
    public int z0;

    public io(vi viVar, Context context, boolean z10, org.telegram.ui.ActionBar.c6 c6Var, Boolean bool) {
        super(context, c6Var, viVar);
        this.M = 1;
        this.R = true;
        this.S = true;
        this.T = true;
        this.b0 = true;
        this.f0 = true;
        this.g0 = true;
        this.k0 = -1;
        c5.f fVar = new c5.f(this);
        this.M0 = fVar;
        c5.f fVar2 = new c5.f(this);
        this.N0 = fVar2;
        int i10 = 2;
        this.O0 = new c5.f[]{fVar, fVar2};
        ArrayList arrayList = new ArrayList();
        this.P0 = arrayList;
        this.T0 = new int[]{3600, 10800, 28800, 86400, 259200};
        this.U0 = new org.telegram.ui.Cells.l7(this, 7);
        this.V0 = false;
        this.W0 = -1;
        this.h1 = false;
        this.i1 = false;
        Paint paint = new Paint(1);
        this.l1 = new rh.f();
        this.n = z10;
        int answersMaxCount = getAnswersMaxCount();
        this.J = answersMaxCount;
        this.K = new CharSequence[answersMaxCount];
        this.L = new boolean[answersMaxCount];
        boolean isPremium = AccountInstance.getInstance(this.b.M1).getUserConfig().isPremium();
        this.I = isPremium;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            this.c0 = booleanValue;
            this.e0 = booleanValue;
            boolean z11 = !booleanValue;
            this.T = z11;
            this.R = z11;
        }
        k0();
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.hl, this.a));
        this.b.u1.setDelegate(this);
        go goVar = new go(this, context);
        this.r = goVar;
        kc1 kc1Var = new kc1(context, 5, null);
        this.s = kc1Var;
        this.c = kc1Var;
        this.d = kc1Var;
        this.h = true;
        this.f = true;
        un unVar = new un(this);
        this.v = unVar;
        kc1Var.setItemAnimator(unVar);
        arrayList.clear();
        unVar.m = false;
        unVar.C = false;
        unVar.o(es.h);
        unVar.n(350L);
        kc1Var.setClipToPadding(false);
        kc1Var.setVerticalScrollBarEnabled(false);
        kc1Var.setSections(true);
        ig.e0 e0Var = new ig.e0(this, AndroidUtilities.dp(65.0f) + AndroidUtilities.statusBarHeight, kc1Var, 4);
        this.w = e0Var;
        kc1Var.setLayoutManager(e0Var);
        e0Var.O = true;
        new s4.y(new ci.f(this, i10)).d(kc1Var);
        addView(kc1Var, w7.z5.e(-1, -1, 51));
        kc1Var.setPreserveFocusAfterLayout(true);
        kc1Var.setAdapter(goVar);
        kc1Var.setOnItemClickListener(new jn(this, c6Var, viVar, context));
        kc1Var.setOnScrollListener(new ah.d0(this, 23));
        v40 v40Var = new v40(context, 4);
        this.y = v40Var;
        v40Var.setAlpha(0.0f);
        v40Var.setVisibility(4);
        addView(v40Var, w7.z5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 51));
        this.S0 = MessagesController.getInstance(this.b.M1).config.pollCaptionLengthMax.get();
        this.Q = new rh.s(this.b.M1);
        NotificationCenter.getInstance(this.b.M1).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (isPremium) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            wn wnVar = new wn(context, this.b.M1, null, c6Var);
            this.x = wnVar;
            wnVar.y = true;
            wnVar.E = true;
            wnVar.setHorizontalPadding(AndroidUtilities.dp(24.0f));
            addView(wnVar, w7.z5.e(-2, 160, 51));
        }
        this.F = new di.h4(this.b.u1, false, null);
        W();
    }

    public static void N(io ioVar, int i10) {
        v40 v40Var = ioVar.y;
        s4.b1 K = ioVar.s.K(ioVar.t0 + i10);
        if (K != null) {
            View view = K.a;
            if (view instanceof org.telegram.ui.Cells.d6) {
                org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                    wn wnVar = ioVar.x;
                    if (wnVar != null) {
                        wnVar.f();
                    }
                    v40Var.setText(LocaleController.getString(R.string.PollAddTextOrRemoveMedia));
                    v40Var.f(d6Var.getCheckBox(), true);
                    ImageView imageView = v40Var.c;
                    imageView.setTranslationX(imageView.getTranslationX() + AndroidUtilities.dp(48.0f));
                    v40Var.setTranslationY(v40Var.getTranslationY() + AndroidUtilities.dp(10.0f));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void O(io ioVar, View view, int i10) {
        int i11;
        int length;
        int i12;
        int i13;
        int length2;
        float f7;
        boolean z10 = ioVar.n;
        if (!(view instanceof org.telegram.ui.Cells.d6)) {
            return;
        }
        org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
        if (i10 == ioVar.n0) {
            i13 = ioVar.S0;
            Editable editable = ioVar.O;
            if (editable != null) {
                length2 = editable.length();
                i12 = i13 - length2;
                f7 = i13;
                if (i12 > f7 - (0.7f * f7)) {
                    d6Var.setText2("");
                    return;
                }
                d6Var.setText2(String.format("%d", Integer.valueOf(i12)));
                org.telegram.ui.ActionBar.h5 textView2 = d6Var.getTextView2();
                int i14 = i12 < 0 ? org.telegram.ui.ActionBar.g6.p7 : org.telegram.ui.ActionBar.g6.A6;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, ioVar.a));
                textView2.setTag(Integer.valueOf(i14));
                return;
            }
            length2 = 0;
            i12 = i13 - length2;
            f7 = i13;
            if (i12 > f7 - (0.7f * f7)) {
            }
        } else if (i10 == ioVar.m0) {
            i13 = z10 ? ioVar.getMessagesController().todoTitleLengthMax : 255;
            Editable editable2 = ioVar.N;
            if (editable2 != null) {
                length2 = editable2.length();
                i12 = i13 - length2;
                f7 = i13;
                if (i12 > f7 - (0.7f * f7)) {
                }
            }
            length2 = 0;
            i12 = i13 - length2;
            f7 = i13;
            if (i12 > f7 - (0.7f * f7)) {
            }
        } else {
            if (i10 == ioVar.p0) {
                Editable editable3 = ioVar.P;
                i11 = 200;
                length = 200 - (editable3 != null ? editable3.length() : 0);
            } else {
                int i15 = ioVar.t0;
                if (i10 < i15 || i10 >= ioVar.M + i15) {
                    return;
                }
                int i16 = i10 - i15;
                i11 = z10 ? ioVar.getMessagesController().todoItemLengthMax : 100;
                CharSequence charSequence = ioVar.K[i16];
                length = i11 - (charSequence != null ? charSequence.length() : 0);
            }
            int i17 = i11;
            i12 = length;
            i13 = i17;
            f7 = i13;
            if (i12 > f7 - (0.7f * f7)) {
            }
        }
    }

    public static void P(io ioVar, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        if (ioVar.I && z10) {
            if (ioVar.g1 == d6Var && ioVar.a1 && ioVar.h1) {
                ioVar.Z();
                ioVar.a1 = false;
            }
            org.telegram.ui.Cells.d6 d6Var2 = ioVar.g1;
            ioVar.g1 = d6Var;
            d6Var.setEmojiButtonVisibility(true);
            bh emojiButton = d6Var.getEmojiButton();
            zg zgVar = zg.e;
            emojiButton.j(zgVar, false);
            kc1 kc1Var = ioVar.s;
            View F = kc1Var.F(d6Var);
            s4.b1 T = F == null ? null : kc1Var.T(F);
            wn wnVar = ioVar.x;
            if (wnVar != null) {
                wnVar.f();
                if (T != null) {
                    View view = T.a;
                    if ((view instanceof org.telegram.ui.Cells.d6) && wnVar.getDelegate() != view) {
                        wnVar.setDelegate((org.telegram.ui.Cells.d6) view);
                    }
                }
            }
            if (d6Var2 == null || d6Var2 == d6Var) {
                return;
            }
            if (ioVar.a1) {
                ioVar.Z();
                ioVar.c0(false);
                ioVar.f0();
            }
            d6Var2.setEmojiButtonVisibility(false);
            d6Var2.getEmojiButton().j(zgVar, false);
        }
    }

    public static void Q(io ioVar, org.telegram.ui.Cells.d6 d6Var) {
        ioVar.g1 = d6Var;
        if (!ioVar.a1) {
            ioVar.i0(1);
        } else {
            ioVar.Z();
            ioVar.f0();
        }
    }

    public static void R(io ioVar, int i10) {
        vi viVar;
        org.telegram.ui.ActionBar.m2 m2Var;
        rh.f fVar = ioVar.l1;
        if (fVar.b(i10) == null) {
            ioVar.e0(i10);
            return;
        }
        rh.e b10 = fVar.b(i10);
        if (b10 == null || (viVar = ioVar.b) == null || (m2Var = viVar.f0) == null) {
            return;
        }
        Activity parentActivity = m2Var.getParentActivity();
        if (b10 instanceof sh.d) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(((sh.d) b10).b);
            PhotoViewer.t1().K2(parentActivity, null, null);
            PhotoViewer.t1().g2(arrayList, 0, 14, false, new mn(ioVar, i10), null);
            return;
        }
        if (b10 instanceof sh.h) {
            sh.h hVar = (sh.h) b10;
            org.telegram.ui.xt.q().w(parentActivity);
            org.telegram.ui.xt.q().v(new on(ioVar, i10));
            org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
            TLRPC.Document document = hVar.b;
            q6.t(document, null, "", null, null, MessageObject.isAnimatedEmoji(document) ? 2 : 0, false, hVar.c, ioVar.a, 200);
            return;
        }
        if (b10 instanceof sh.c) {
            sh.c cVar = (sh.c) b10;
            ioVar.j0(i10, new org.telegram.ui.bg(1, cVar.d, AndroidUtilities.formatFileSize(cVar.e, true, true) + " " + cVar.f), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof sh.g) {
            sh.g gVar = (sh.g) b10;
            TLRPC.Document document2 = gVar.b.getDocument();
            ioVar.j0(i10, new di.n5(MessageObject.getMusicTitle(document2, true), MessageObject.getMusicAuthor(document2, true) + " - " + LocaleController.formatShortDuration((int) MessageObject.getDocumentDuration(document2)), gVar, 2), AndroidUtilities.dp(240.0f), AndroidUtilities.dp(60.0f));
            return;
        }
        if (b10 instanceof sh.f) {
            ioVar.j0(i10, new xi((sh.f) b10, 1), AndroidUtilities.dp(300.0f), (AndroidUtilities.dp(300.0f) * 9) / 16);
        } else if (!(b10 instanceof sh.e)) {
            ioVar.e0(i10);
        } else {
            sh.e eVar = (sh.e) b10;
            g5.f0(ioVar.getContext(), ioVar.a, eVar.b, eVar.n, new fn(ioVar, i10, 1), new gn(ioVar, i10, 0));
        }
    }

    public static CharSequence b0(CharSequence charSequence) {
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

    public static pn g0(org.telegram.ui.ActionBar.m2 m2Var, int i10, Utilities.Callback callback, qg qgVar) {
        if (m2Var == null) {
            return null;
        }
        pn pnVar = new pn(m2Var.getContext(), m2Var, m2Var.getResourceProvider(), qgVar);
        pnVar.c2 = new rn(callback, m2Var, pnVar);
        pnVar.d2 = new sn(callback, pnVar);
        pnVar.j0.f0();
        pnVar.N1(1, true);
        pnVar.j1(i10);
        pnVar.w2 = new hn(callback);
        pnVar.X = new tn(callback, m2Var, pnVar);
        pnVar.Y = new u2(11, callback, pnVar);
        pnVar.t1();
        pnVar.setFocusable(true);
        pnVar.show();
        return pnVar;
    }

    private int getAnswersMaxCount() {
        return this.n ? getMessagesController().todoItemsMax : getMessagesController().config.pollAnswersMax.get();
    }

    private int getCurrentAccount() {
        vi viVar = this.b;
        return viVar != null ? viVar.M1 : UserConfig.selectedAccount;
    }

    private MessagesController getMessagesController() {
        return MessagesController.getInstance(getCurrentAccount());
    }

    @Override // org.telegram.ui.Components.ni
    public final void B() {
        go goVar = this.r;
        if (goVar != null) {
            goVar.l();
        }
        if (this.I) {
            c0(false);
            wn wnVar = this.x;
            if (wnVar != null) {
                wnVar.f();
            }
            org.telegram.ui.Cells.d6 d6Var = this.g1;
            if (d6Var != null) {
                d6Var.setEmojiButtonVisibility(false);
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
    public final void C(int i10, int i11) {
        int dp;
        int i12;
        vi viVar = this.b;
        if (viVar.u1.R() > AndroidUtilities.dp(20.0f) || this.a1 || this.f1 || this.h1) {
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
        kc1 kc1Var = this.s;
        if (i14 != i13 || kc1Var.getPaddingBottom() != this.e) {
            this.R0 = i13;
            kc1Var.o1(0, 0, 0, this.e);
            kc1Var.setItemAnimator(null);
            this.r.m(0);
        }
        this.i0 = false;
    }

    @Override // org.telegram.ui.Components.ni
    public final void G(ni niVar) {
        vi viVar = this.b;
        try {
            viVar.a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        if (this.n) {
            viVar.a1.setTitle(LocaleController.getString(R.string.TodoTitle));
        } else if (this.e0) {
            viVar.a1.setTitle(LocaleController.getString(R.string.NewQuiz));
        } else {
            viVar.a1.setTitle(LocaleController.getString(R.string.NewPoll));
        }
        viVar.a2();
        this.w.h1(0, 0);
    }

    @Override // org.telegram.ui.Components.nw0
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
            di.h4 h4Var = this.F;
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
                    h4Var.a();
                    viVar.u1.requestLayout();
                    boolean z13 = this.i1;
                    if (z13 != this.h1) {
                        T(z13 ? -AndroidUtilities.dp(120.0f) : AndroidUtilities.dp(120.0f));
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
            org.telegram.ui.Cells.d6 d6Var = this.g1;
            if (d6Var != null) {
                this.e1 = d6Var.getEditField().isFocused() && h4Var.c() && i10 > 0;
            } else {
                this.e1 = false;
            }
            if (this.e1 && this.a1) {
                i0(0);
            }
            if (this.b1 != 0 && !(z11 = this.e1) && z11 != z14 && !this.a1) {
                this.b1 = 0;
                h4Var.a();
                viVar.u1.requestLayout();
            }
            if (this.e1 && this.G) {
                this.G = false;
                AndroidUtilities.cancelRunOnUIThread(this.U0);
            }
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final void J() {
        this.s.x0(1);
    }

    public final void S() {
        wn wnVar = this.x;
        if (wnVar != null) {
            wnVar.setDelegate(null);
            wnVar.f();
        }
        this.s.setItemAnimator(this.v);
        int i10 = this.M;
        this.L[i10] = false;
        int i11 = i10 + 1;
        this.M = i11;
        int length = this.K.length;
        go goVar = this.r;
        if (i11 == length) {
            goVar.u(this.u0);
        }
        goVar.o(this.u0);
        k0();
        this.k0 = (this.t0 + this.M) - 1;
        goVar.m(this.v0);
        goVar.m(this.A0);
    }

    public final void T(float f7) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new org.telegram.ui.qg(this, f7, 2));
        ofFloat.addListener(new ln(this, 0));
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
        ofFloat.start();
    }

    public final void U() {
        boolean z10 = (this.c0 || this.a0) ? false : true;
        if (!z10) {
            this.T = false;
        }
        int i10 = this.C0;
        if (i10 < 0) {
            return;
        }
        s4.b1 K = this.s.K(i10);
        if (K == null) {
            this.r.m(this.C0);
            return;
        }
        org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) K.a;
        if (!z10) {
            a6Var.setChecked(false);
        }
        a6Var.getCheckBox().a.a(!z10, true);
    }

    public final boolean V() {
        boolean z10 = TextUtils.isEmpty(b0(this.N)) && TextUtils.isEmpty(b0(this.O)) && TextUtils.isEmpty(b0(this.P)) && this.l1.a.size() == 0;
        if (z10) {
            for (int i10 = 0; i10 < this.M && (z10 = TextUtils.isEmpty(b0(this.K[i10]))); i10++) {
            }
        }
        if (!z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.f0.getParentActivity());
            boolean z11 = this.n;
            alertDialog$Builder.a.R = LocaleController.getString(z11 ? R.string.CancelTodoAlertTitle : R.string.CancelPollAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(z11 ? R.string.CancelTodoAlertText : R.string.CancelPollAlertText);
            alertDialog$Builder.k(LocaleController.getString(R.string.PassportDiscard), new s(this, 23));
            i2.d.r(R.string.Cancel, alertDialog$Builder, null);
        }
        return z10;
    }

    public final void W() {
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
                if (!TextUtils.isEmpty(b0(charSequenceArr[i11])) && zArr[i11]) {
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
        boolean z12 = (TextUtils.isEmpty(b0(this.O)) || this.O.length() <= this.S0) && (TextUtils.isEmpty(b0(this.P)) || this.P.length() <= 200) && !TextUtils.isEmpty(b0(this.N)) && this.N.length() <= i12;
        int i14 = 0;
        int i15 = 0;
        boolean z13 = false;
        while (true) {
            if (i14 >= charSequenceArr.length) {
                break;
            }
            if (!TextUtils.isEmpty(b0(charSequenceArr[i14]))) {
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
        viVar.a2();
    }

    public final void X(org.telegram.ui.Cells.r8 r8Var, boolean z10) {
        if (this.V != 0) {
            r8Var.o(LocaleController.getString(R.string.PollV2PollEnds), LocaleController.formatShortDateTime(this.V), z10, false);
        } else if (this.U != 0) {
            r8Var.o(LocaleController.getString(R.string.PollV2PollDuration), LocaleController.formatPluralString("Hours", this.U / 3600, new Object[0]), z10, false);
        } else {
            r8Var.o(LocaleController.getString(R.string.PollV2PollEnds), null, z10, false);
        }
    }

    public final void Y(sh.e eVar, boolean z10) {
        TLRPC.Photo photo;
        String str = eVar.b;
        rh.s sVar = this.Q;
        boolean containsKey = sVar.c.containsKey(str);
        TLRPC.WebPage webPage = (TLRPC.WebPage) sVar.b.get(eVar.b);
        ne.b bVar = eVar.s;
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

    public final void Z() {
        if (this.h1) {
            this.E.u(false);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.E.getLayoutParams();
            layoutParams.height -= AndroidUtilities.dp(120.0f);
            this.E.setLayoutParams(layoutParams);
            this.b1 = layoutParams.height;
            this.i1 = this.h1;
            this.h1 = false;
            T(-AndroidUtilities.dp(120.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(View view, org.telegram.ui.Cells.d6 d6Var, boolean z10) {
        int b10;
        wn wnVar;
        org.telegram.ui.ActionBar.m2 m2Var;
        if (view.getTag() != null) {
            return;
        }
        view.setTag(1);
        kc1 kc1Var = this.s;
        s4.b1 G = kc1Var.G(d6Var);
        if (G == null || (b10 = G.b()) == -1) {
            return;
        }
        int i10 = b10 - this.t0;
        rh.f fVar = this.l1;
        boolean z11 = fVar.b(i10) != null;
        if (z10 && z11 && (m2Var = this.b.f0) != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(m2Var.getParentActivity(), 0, this.a);
            alertDialog$Builder.a.R = LocaleController.getString(!this.c0 ? R.string.DiscardPollOptionWithMediaAlertTitle : R.string.DiscardQuizOptionWithMediaAlertTitle);
            alertDialog$Builder.a.T = LocaleController.getString(!this.c0 ? R.string.DiscardPollOptionWithMediaMessage : R.string.DiscardQuizOptionWithMediaMessage);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new androidx.car.app.utils.a(this, view, d6Var, 28));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.setOnCancelListener(new kh(view, 1));
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
            a2Var.show();
            TextView textView = (TextView) a2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.q7, false));
                return;
            }
            return;
        }
        fVar.h(i10);
        kc1Var.setItemAnimator(this.v);
        go goVar = this.r;
        goVar.u(b10);
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
            goVar.o((this.t0 + charSequenceArr.length) - 1);
        }
        s4.b1 K = kc1Var.K(b10 - 1);
        EditTextBoldCursor textView2 = d6Var.getTextView();
        if (K != null) {
            View view2 = K.a;
            if (view2 instanceof org.telegram.ui.Cells.d6) {
                ((org.telegram.ui.Cells.d6) view2).getTextView().requestFocus();
                textView2.clearFocus();
                W();
                k0();
                wnVar = this.x;
                if (wnVar != null) {
                    wnVar.f();
                    wnVar.setDelegate(null);
                }
                goVar.m(this.v0);
                goVar.m(this.A0);
            }
        }
        if (textView2.isFocused()) {
            AndroidUtilities.hideKeyboard(textView2);
            c0(true);
        } else if (this.h1) {
            c0(true);
        }
        textView2.clearFocus();
        W();
        k0();
        wnVar = this.x;
        if (wnVar != null) {
        }
        goVar.m(this.v0);
        goVar.m(this.A0);
    }

    public final void c0(boolean z10) {
        if (this.I) {
            int i10 = 0;
            if (this.a1) {
                wz wzVar = this.E;
                wzVar.P.B0();
                wzVar.I.scrollTo(0, 0);
                wzVar.F(1);
                wzVar.Q.h1(0, 0);
                this.E.u(false);
                if (z10) {
                    this.E.C();
                }
                this.h1 = false;
                i0(0);
            }
            if (z10) {
                wz wzVar2 = this.E;
                if (wzVar2 == null || wzVar2.getVisibility() != 0) {
                    d0();
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.E.getMeasuredHeight());
                ofFloat.addUpdateListener(new in(this, i10));
                this.f1 = true;
                ofFloat.addListener(new ln(this, 2));
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
                ofFloat.start();
            }
        }
    }

    public final void d0() {
        wz wzVar;
        bh emojiButton;
        if (!this.a1 && (wzVar = this.E) != null && wzVar.getVisibility() != 8) {
            org.telegram.ui.Cells.d6 d6Var = this.g1;
            if (d6Var != null && (emojiButton = d6Var.getEmojiButton()) != null) {
                emojiButton.j(zg.e, false);
            }
            this.E.setVisibility(8);
        }
        int i10 = this.b1;
        this.b1 = 0;
        if (i10 != 0) {
            this.F.a();
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.WebPage webPage;
        if (i10 != NotificationCenter.didReceivedWebpagesInUpdates) {
            if (i10 == NotificationCenter.emojiLoaded) {
                wz wzVar = this.E;
                if (wzVar != null) {
                    wzVar.P.f1();
                }
                org.telegram.ui.Cells.d6 d6Var = this.g1;
                if (d6Var != null) {
                    int currentTextColor = d6Var.getEditField().getCurrentTextColor();
                    this.g1.getEditField().setTextColor(-1);
                    this.g1.getEditField().setTextColor(currentTextColor);
                    return;
                }
                return;
            }
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (Map.Entry entry : this.Q.b.entrySet()) {
            if (entry.getValue() != null && (webPage = (TLRPC.WebPage) hVar.f(((TLRPC.WebPage) entry.getValue()).id)) != null) {
                entry.setValue(webPage);
            }
        }
        rh.f fVar = this.l1;
        int size = fVar.a.size();
        for (int i12 = 0; i12 < size; i12++) {
            rh.e eVar = (rh.e) fVar.a.get(i12);
            if (eVar instanceof sh.e) {
                Y((sh.e) eVar, true);
            }
        }
    }

    public final void e0(int i10) {
        this.k1 = i10;
        org.telegram.ui.ActionBar.m2 m2Var = this.b.f0;
        this.l1.b(i10);
        this.j1 = g0(m2Var, (i10 == -2 || i10 == -3) ? 74 : 41026, new fn(this, i10, 0), new qg(this, 26));
    }

    public final void f0() {
        org.telegram.ui.Cells.d6 d6Var = this.g1;
        if (d6Var != null) {
            this.F.e = true;
            EditTextBoldCursor editField = d6Var.getEditField();
            editField.requestFocus();
            AndroidUtilities.showKeyboard(editField);
        }
        i0(AndroidUtilities.usingHardwareInput ? 0 : 2);
        if (AndroidUtilities.usingHardwareInput || this.e1 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
            return;
        }
        this.G = true;
        org.telegram.ui.Cells.l7 l7Var = this.U0;
        AndroidUtilities.cancelRunOnUIThread(l7Var);
        AndroidUtilities.runOnUIThread(l7Var, 100L);
    }

    @Override // org.telegram.ui.Components.ni
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(70.0f);
    }

    @Override // org.telegram.ui.Components.ni
    public int getCurrentItemTop() {
        View childAt;
        kc1 kc1Var = this.s;
        if (kc1Var.getChildCount() <= 1 || (childAt = kc1Var.getChildAt(1)) == null) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View F = kc1Var.F(childAt);
        wl0 wl0Var = (wl0) (F == null ? null : kc1Var.T(F));
        int y3 = (((int) childAt.getY()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(20.0f);
        int i10 = (y3 <= 0 || wl0Var == null || wl0Var.b() != 1) ? 0 : y3;
        if (y3 < 0 || wl0Var == null || wl0Var.b() != 1) {
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
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        kc1 kc1Var = this.s;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 32768, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.g6.b7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 16, new Class[]{xn.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 48, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        int i13 = org.telegram.ui.ActionBar.g6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.A6));
        int i14 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 4, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.H6));
        int i15 = org.telegram.ui.ActionBar.g6.m6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"moveImageView"}, null, null, -1, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 196608, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"deleteImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 262144, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"textView2"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.k7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.d6.class}, new String[]{"checkBox"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.M6));
        int i17 = org.telegram.ui.ActionBar.g6.N6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.w8.class}, new String[]{"checkBox"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.k0, null, null, org.telegram.ui.ActionBar.g6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.il));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 32, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(kc1Var, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        return arrayList;
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean h() {
        return this.X0;
    }

    public final void h0(int i10, rh.e eVar) {
        int i11;
        rh.f fVar = this.l1;
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
            s4.b1 K = this.s.K(i11);
            if (K != null) {
                View view = K.a;
                if (view instanceof org.telegram.ui.Cells.d6) {
                    ((org.telegram.ui.Cells.d6) view).e.a(eVar, true);
                }
            }
            this.r.m(i11);
        }
        if (eVar instanceof sh.e) {
            sh.e eVar2 = (sh.e) eVar;
            String str = eVar2.b;
            bi.f0 f0Var = new bi.f0(10, this, eVar);
            rh.s sVar = this.Q;
            HashMap hashMap = sVar.c;
            HashMap hashMap2 = sVar.b;
            if (hashMap2.containsKey(str)) {
                f0Var.run((TLRPC.WebPage) hashMap2.get(str), null);
            } else {
                boolean containsKey = hashMap.containsKey(str);
                ArrayList arrayList = (ArrayList) hashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    hashMap.put(str, arrayList);
                }
                arrayList.add(f0Var);
                if (!containsKey) {
                    TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                    getwebpagepreview.message = str;
                    ConnectionsManager.getInstance(sVar.a).sendRequestTyped(getwebpagepreview, new org.telegram.messenger.a(), new rh.r(0, sVar, str));
                }
            }
            Y(eVar2, false);
        }
        W();
    }

    @Override // org.telegram.ui.Components.ni
    public final int i() {
        return 1;
    }

    public final void i0(int i10) {
        bh emojiButton;
        org.telegram.ui.Cells.d6 d6Var;
        if (this.I) {
            di.h4 h4Var = this.F;
            vi viVar = this.b;
            int i11 = 1;
            if (i10 != 1) {
                org.telegram.ui.Cells.d6 d6Var2 = this.g1;
                emojiButton = d6Var2 != null ? d6Var2.getEmojiButton() : null;
                if (emojiButton != null) {
                    emojiButton.j(zg.e, true);
                }
                wz wzVar = this.E;
                if (wzVar != null) {
                    this.a1 = false;
                    this.h1 = false;
                    if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                        wzVar.setVisibility(8);
                    }
                }
                if (i10 == 0) {
                    this.b1 = 0;
                }
                h4Var.a();
                viVar.u1.requestLayout();
                return;
            }
            wz wzVar2 = this.E;
            boolean z10 = wzVar2 != null && wzVar2.getVisibility() == 0;
            wz wzVar3 = this.E;
            if (wzVar3 != null && wzVar3.c1 != UserConfig.selectedAccount) {
                viVar.u1.removeView(wzVar3);
                this.E = null;
            }
            if (this.E == null) {
                wz wzVar4 = new wz(null, true, false, false, getContext(), true, null, null, true, this.a, false, false);
                this.E = wzVar4;
                wzVar4.c = 3;
                wzVar4.w0 = false;
                wzVar4.w2 = false;
                wzVar4.setShouldDrawBackground(false);
                wz wzVar5 = this.E;
                wzVar5.U0 = false;
                wzVar5.setVisibility(8);
                if (AndroidUtilities.isTablet()) {
                    this.E.setForseMultiwindowLayout(true);
                }
                this.E.setDelegate(new kn(this));
                viVar.u1.addView(this.E);
                this.E.setBottomInset(AndroidUtilities.navigationBarHeight);
            }
            this.E.setVisibility(0);
            this.a1 = true;
            wz wzVar6 = this.E;
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
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) wzVar6.getLayoutParams();
            layoutParams.height = AndroidUtilities.navigationBarHeight + i12;
            wzVar6.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet() && (d6Var = this.g1) != null) {
                AndroidUtilities.hideKeyboard(d6Var.getEditField());
            }
            this.b1 = i12;
            h4Var.a();
            viVar.u1.requestLayout();
            org.telegram.ui.Cells.d6 d6Var3 = this.g1;
            emojiButton = d6Var3 != null ? d6Var3.getEmojiButton() : null;
            if (emojiButton != null) {
                emojiButton.j(zg.d, true);
            }
            if (z10 || this.e1) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b1, 0.0f);
            ofFloat.addUpdateListener(new in(this, i11));
            ofFloat.addListener(new ln(this, i11));
            ofFloat.setDuration(250L);
            ofFloat.setInterpolator(org.telegram.ui.ActionBar.o1.w);
            ofFloat.start();
        }
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean j() {
        if (!this.a1) {
            return !V();
        }
        c0(true);
        return true;
    }

    public final void j0(int i10, Utilities.CallbackReturn callbackReturn, int i11, int i12) {
        l80 F = l80.F(this, null, new View(getContext()));
        F.s = 0;
        F.t = false;
        F.c(R.drawable.msg_replace, LocaleController.getString(R.string.ReplaceAttachedPollMedia), new gn(this, i10, 1), false);
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new gn(this, i10, 2), true);
        cn0 cn0Var = new cn0(getContext(), this.a);
        F.p = new org.telegram.ui.ye(cn0Var, 1);
        F.S = AndroidUtilities.dp(185.0f);
        F.Y();
        cn0Var.e(F);
        Drawable drawable = (Drawable) callbackReturn.run(cn0Var.s);
        dh.d c10 = cn0Var.n.c(null, null, false);
        c10.o(fh.b.k(cn0Var.b));
        c10.p(AndroidUtilities.dp(8.0f));
        c10.j.e = true;
        c10.q(AndroidUtilities.dp(16.0f));
        cn0Var.F = c10;
        cn0Var.E = drawable;
        Point point = AndroidUtilities.displaySize;
        int i13 = (point.x - i11) / 2;
        int i14 = (point.y - i12) / 2;
        int i15 = i11 + i13;
        int i16 = i12 + i14;
        c10.setBounds(i13 - AndroidUtilities.dp(8.0f), i14 - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f) + i15, AndroidUtilities.dp(8.0f) + i16);
        cn0Var.E.setBounds(i13, i14, i15, i16);
        ((FrameLayout.LayoutParams) cn0Var.x.getLayoutParams()).gravity = 1;
        cn0Var.L = true;
        cn0Var.show();
    }

    public final void k0() {
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
        c5.f fVar = this.M0;
        fVar.a = -1;
        c5.f fVar2 = this.N0;
        fVar2.a = -1;
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
            TLRPC.Chat chat = ((org.telegram.ui.fo) this.b.f0).e;
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
                fVar.a = i22;
                int i23 = i21 + 5;
                this.Q0 = i23;
                fVar2.a = i21 + 4;
                if (fVar2.b) {
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
    public final void o() {
        this.H = true;
        vi viVar = this.b;
        NotificationCenter.getInstance(viVar.M1).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        if (this.I) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            wz wzVar = this.E;
            if (wzVar != null) {
                viVar.u1.removeView(wzVar);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.i0) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.ni
    public final boolean s() {
        return V();
    }

    public void setDelegate(ho hoVar) {
        this.j0 = hoVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }

    @Override // org.telegram.ui.Components.ni
    public final void t() {
        this.b.a2();
    }

    @Override // org.telegram.ui.Components.ni
    public final void v(float f7) {
        this.b.a2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v31 */
    @Override // org.telegram.ui.Components.ni
    public final void w(int i10) {
        int i11;
        if (i10 != 40) {
            return;
        }
        boolean z10 = this.n;
        int i12 = 0;
        int i13 = 1;
        vi viVar = this.b;
        CharSequence[] charSequenceArr = this.K;
        if (z10) {
            CharSequence[] charSequenceArr2 = {b0(this.N)};
            int i14 = viVar.M1;
            ArrayList<TLRPC.MessageEntity> entities = MediaDataController.getInstance(i14).getEntities(charSequenceArr2, true);
            CharSequence charSequence = charSequenceArr2[0];
            if (entities != null) {
                int size = entities.size();
                for (int i15 = 0; i15 < size; i15++) {
                    TLRPC.MessageEntity messageEntity = entities.get(i15);
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
            for (int i16 = 0; i16 < charSequenceArr.length; i16++) {
                if (!TextUtils.isEmpty(b0(charSequenceArr[i16]))) {
                    CharSequence[] charSequenceArr3 = {b0(charSequenceArr[i16])};
                    ArrayList<TLRPC.MessageEntity> entities2 = MediaDataController.getInstance(i14).getEntities(charSequenceArr3, true);
                    CharSequence charSequence2 = charSequenceArr3[0];
                    if (entities2 != null) {
                        int size2 = entities2.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            TLRPC.MessageEntity messageEntity2 = entities2.get(i17);
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
            g5.Z(i14, viVar.l1() + 1, viVar.p1(), new bi.q4(this, (org.telegram.ui.fo) viVar.f0, tL_messageMediaToDo, 6));
            return;
        }
        boolean z12 = this.c0;
        kc1 kc1Var = this.s;
        boolean[] zArr = this.L;
        if (z12 && !this.X0) {
            int i18 = 0;
            while (i12 < zArr.length) {
                if (!TextUtils.isEmpty(b0(charSequenceArr[i12])) && zArr[i12]) {
                    i18++;
                }
                i12++;
            }
            if (i18 <= 0) {
                for (int i19 = this.t0; i19 < this.t0 + this.M; i19++) {
                    s4.b1 K = kc1Var.K(i19);
                    if (K != null) {
                        View view = K.a;
                        if (view instanceof org.telegram.ui.Cells.d6) {
                            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
                            if (d6Var.getTop() > AndroidUtilities.dp(40.0f)) {
                                wn wnVar = this.x;
                                if (wnVar != null) {
                                    wnVar.f();
                                }
                                String string = LocaleController.getString(R.string.PollTapToSelect);
                                v40 v40Var = this.y;
                                v40Var.setText(string);
                                v40Var.f(d6Var.getCheckBox(), true);
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
        int i20 = 0;
        while (true) {
            int length = charSequenceArr.length;
            rh.f fVar = this.l1;
            if (i20 >= length) {
                CharSequence[] charSequenceArr4 = {b0(this.N)};
                int i21 = viVar.M1;
                ArrayList<TLRPC.MessageEntity> entities3 = MediaDataController.getInstance(i21).getEntities(charSequenceArr4, true);
                CharSequence charSequence3 = charSequenceArr4[0];
                if (entities3 != null) {
                    int size3 = entities3.size();
                    for (int i22 = 0; i22 < size3; i22++) {
                        TLRPC.MessageEntity messageEntity3 = entities3.get(i22);
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
                tL_poll.subscribers_only = this.M0.b;
                if (this.N0.b) {
                    ArrayList arrayList = this.P0;
                    if (!arrayList.isEmpty()) {
                        TLRPC.Poll poll = tL_messageMediaPoll.poll;
                        poll.flags |= 4096;
                        poll.countries_iso2.addAll(arrayList);
                    }
                }
                TLRPC.Poll poll2 = tL_messageMediaPoll.poll;
                poll2.creator = true;
                int i23 = this.U;
                if (i23 != 0) {
                    poll2.hide_results_until_close = this.W;
                    poll2.close_period = i23;
                    poll2.flags |= 16;
                } else {
                    int i24 = this.V;
                    if (i24 != 0) {
                        poll2.hide_results_until_close = this.W;
                        poll2.close_date = i24;
                        poll2.flags |= 32;
                    }
                }
                poll2.question = new TLRPC.TL_textWithEntities();
                tL_messageMediaPoll.poll.question.text = charSequence3.toString();
                tL_messageMediaPoll.poll.question.entities = entities3;
                ArrayList arrayList2 = new ArrayList(this.J);
                int i25 = 0;
                while (i25 < charSequenceArr.length) {
                    if (TextUtils.isEmpty(b0(charSequenceArr[i25]))) {
                        fVar.h(tL_messageMediaPoll.poll.answers.size());
                        i11 = i12;
                    } else {
                        CharSequence[] charSequenceArr5 = new CharSequence[i13];
                        charSequenceArr5[i12] = b0(charSequenceArr[i25]);
                        ArrayList<TLRPC.MessageEntity> entities4 = MediaDataController.getInstance(i21).getEntities(charSequenceArr5, i13);
                        CharSequence charSequence4 = charSequenceArr5[i12];
                        if (entities4 != null) {
                            int size4 = entities4.size();
                            int i26 = i12;
                            while (i26 < size4) {
                                TLRPC.MessageEntity messageEntity4 = entities4.get(i26);
                                int i27 = i12;
                                if (messageEntity4.offset + messageEntity4.length > charSequence4.length()) {
                                    messageEntity4.length = charSequence4.length() - messageEntity4.offset;
                                }
                                i26++;
                                i12 = i27;
                            }
                        }
                        i11 = i12;
                        TLRPC.TL_pollAnswer tL_pollAnswer = new TLRPC.TL_pollAnswer();
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
                        tL_pollAnswer.text = tL_textWithEntities2;
                        tL_textWithEntities2.text = charSequence4.toString();
                        tL_pollAnswer.text.entities = entities4;
                        byte[] bArr = new byte[1];
                        tL_pollAnswer.option = bArr;
                        bArr[i11] = (byte) (tL_messageMediaPoll.poll.answers.size() + 48);
                        if ((this.b0 || this.c0) && zArr[i25]) {
                            arrayList2.add(Integer.valueOf(tL_messageMediaPoll.poll.answers.size()));
                        }
                        tL_messageMediaPoll.poll.answers.add(tL_pollAnswer);
                    }
                    i25++;
                    i12 = i11;
                    i13 = 1;
                }
                int i28 = i12;
                tL_messageMediaPoll.results = new TLRPC.TL_pollResults();
                CharSequence b02 = b0(this.P);
                if (b02 != null) {
                    tL_messageMediaPoll.results.solution = b02.toString();
                    CharSequence[] charSequenceArr6 = new CharSequence[1];
                    charSequenceArr6[i28] = b02;
                    ArrayList<TLRPC.MessageEntity> entities5 = MediaDataController.getInstance(i21).getEntities(charSequenceArr6, true);
                    if (entities5 != null && !entities5.isEmpty()) {
                        tL_messageMediaPoll.results.solution_entities = entities5;
                    }
                    if (!TextUtils.isEmpty(tL_messageMediaPoll.results.solution)) {
                        tL_messageMediaPoll.results.flags |= 16;
                    }
                }
                g5.Z(i21, viVar.l1() + 1, viVar.p1(), new bi.u3(this, (org.telegram.ui.fo) viVar.f0, tL_messageMediaPoll, arrayList2, 8));
                return;
            }
            if (TextUtils.isEmpty(b0(charSequenceArr[i20])) && fVar.b(i20) != null) {
                this.V0 = true;
                this.W0 = i20;
                kc1Var.x0(this.t0 + i20);
                return;
            }
            i20++;
        }
    }
}
