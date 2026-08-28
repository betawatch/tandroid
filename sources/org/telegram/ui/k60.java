package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class k60 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, td.b, View.OnClickListener, xg.d {
    public boolean A;
    public gh.h1 B;
    public final long C;
    public final long D;
    public TLRPC.ChatFull E;
    public a0.h F;
    public final int G;
    public String H;
    public final int I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public boolean O;
    public boolean P;
    public final int Q;
    public final boolean R;
    public final boolean S;
    public org.telegram.ui.Components.w20 T;
    public org.telegram.ui.Components.w20 U;
    public a0.h V;
    public ArrayList W;
    public org.telegram.ui.Components.w20 X;
    public int Y;
    public org.telegram.ui.Components.hd0 Z;
    public final int a;
    public boolean a0;
    public final td.c b;
    public final HashSet b0;
    public final td.a c;
    public boolean c0;
    public ih.b3 d;
    public boolean d0;
    public kh.h6 e;
    public ArrayList e0;
    public org.telegram.ui.Components.m10 f;
    public boolean f0;
    public boolean g0;
    public c60 h;
    public int h0;
    public int i0;
    public int j0;
    public final Rect k0;
    public final ig.e l0;
    public final ng.d m0;
    public org.telegram.ui.Components.wk0 n;
    public ig.k n0;
    public final ArrayList o0;
    public final RectF p0;
    public final RectF q0;
    public f2.m0 r;
    public org.telegram.ui.Components.gw0 s;
    public i60 v;
    public g60 w;
    public f60 x;
    public org.telegram.ui.Components.j10 y;

    public k60(Bundle bundle) {
        super(bundle);
        int i9 = Build.VERSION.SDK_INT;
        this.a = i9 >= 31 ? 48 : 0;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.b = new td.c(3, this, grVar, 350L);
        this.c = new td.a(4, this, grVar, 350L, false);
        this.V = new a0.h();
        this.W = new ArrayList();
        this.b0 = new HashSet();
        this.h0 = -4;
        this.k0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.o0 = arrayList;
        RectF rectF = new RectF();
        this.p0 = rectF;
        RectF rectF2 = new RectF();
        this.q0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i10 = bundle.getInt("chatType", 0);
        this.I = i10;
        this.J = bundle.getBoolean("forImport", false);
        boolean z10 = bundle.getBoolean("isAlwaysShare", false);
        this.K = z10;
        boolean z11 = bundle.getBoolean("isNeverShare", false);
        this.L = z11;
        boolean z12 = bundle.getBoolean("isCall", false);
        this.M = z12;
        boolean z13 = bundle.getBoolean("addToGroup", false);
        this.N = z13;
        this.Q = bundle.getInt("chatAddType", 0);
        this.R = bundle.getBoolean("allowPremium", false);
        this.S = bundle.getBoolean("allowMiniapps", false);
        this.C = bundle.getLong("chatId");
        this.D = bundle.getLong("channelId");
        if (z10 || z11 || z13) {
            this.G = 0;
        } else if (z12) {
            this.G = getMessagesController().conferenceCallSizeLimit - 1;
        } else {
            MessagesController messagesController = getMessagesController();
            this.G = i10 == 0 ? messagesController.maxMegagroupCount : messagesController.maxBroadcastCount;
        }
        if (i9 >= 31) {
            this.l0 = new ig.e(false);
            this.m0 = new ng.d(null);
        } else {
            this.l0 = null;
            this.m0 = null;
        }
    }

    public static void T(k60 k60Var, Context context, View view, int i9) {
        long j10;
        int i10 = k60Var.G;
        long j11 = k60Var.D;
        i60 i60Var = k60Var.v;
        int i11 = 0;
        if (i9 == i60Var.w) {
            int i12 = k60Var.currentAccount;
            org.telegram.ui.ActionBar.b6 b6Var = k60Var.resourceProvider;
            a60 a60Var = new a60(k60Var, i11);
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
            c2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i12).sendRequest(createconferencecall, new ff.j0(i12, c2Var, context, b6Var, a60Var, 6));
            return;
        }
        if (i9 == 0 && i60Var.B != 0 && !i60Var.n) {
            org.telegram.ui.Components.hd0 hd0Var = new org.telegram.ui.Components.hd0(context, k60Var, k60Var.E, k60Var.C, j11 != 0);
            k60Var.Z = hd0Var;
            k60Var.showDialog(hd0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.g4) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            if (g4Var.r) {
                org.telegram.ui.Components.w20 w20Var = k60Var.T;
                if (w20Var == null) {
                    org.telegram.ui.Components.w20 w20Var2 = new org.telegram.ui.Components.w20(k60Var.f.r.getContext(), "premium");
                    k60Var.T = w20Var2;
                    k60Var.h.a(w20Var2);
                    k60Var.T.setOnClickListener(k60Var);
                } else {
                    k60Var.h.c(w20Var);
                    k60Var.T = null;
                }
                k60Var.j0();
                return;
            }
            if (g4Var.s) {
                org.telegram.ui.Components.w20 w20Var3 = k60Var.U;
                if (w20Var3 == null) {
                    org.telegram.ui.Components.w20 w20Var4 = new org.telegram.ui.Components.w20(k60Var.f.r.getContext(), "miniapps");
                    k60Var.U = w20Var4;
                    k60Var.h.a(w20Var4);
                    k60Var.U.setOnClickListener(k60Var);
                } else {
                    k60Var.h.c(w20Var3);
                    k60Var.U = null;
                }
                k60Var.j0();
                return;
            }
            Object object = g4Var.getObject();
            boolean z10 = object instanceof TLRPC.User;
            if (z10) {
                j10 = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j10 = -((TLRPC.Chat) object).id;
            }
            a0.h hVar = k60Var.F;
            if (hVar == null || hVar.h(j10) < 0) {
                if (g4Var.K) {
                    int i13 = -k60Var.h0;
                    k60Var.h0 = i13;
                    AndroidUtilities.shakeViewSpring(g4Var, i13);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String userName = j10 >= 0 ? UserObject.getUserName(MessagesController.getInstance(k60Var.currentAccount).getUser(Long.valueOf(j10))) : "";
                    (MessagesController.getInstance(k60Var.currentAccount).premiumFeaturesBlocked() ? org.telegram.ui.Components.oc.a0(k60Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.oc.a0(k60Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new a60(k60Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.w20 w20Var5 = (org.telegram.ui.Components.w20) k60Var.V.f(j10);
                if (w20Var5 != null) {
                    k60Var.h.c(w20Var5);
                } else {
                    if (i10 != 0 && k60Var.V.m() == i10) {
                        return;
                    }
                    if (k60Var.I == 0 && k60Var.V.m() == k60Var.getMessagesController().maxGroupCount) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k60Var.getParentActivity());
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
                        c2Var2.N = string;
                        c2Var2.P = LocaleController.getString(R.string.SoftUserLimitAlert);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        k60Var.showDialog(c2Var2);
                        return;
                    }
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (k60Var.N && user.bot) {
                            if (j11 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.oc.a0(k60Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                    return;
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                    return;
                                }
                            }
                            if (j11 != 0) {
                                TLRPC.Chat chat = k60Var.getMessagesController().getChat(Long.valueOf(j11));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k60Var.getParentActivity());
                                boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder2.a;
                                if (canAddAdmins) {
                                    c2Var3.N = LocaleController.getString(R.string.AddBotAdminAlert);
                                    c2Var3.P = LocaleController.getString(R.string.AddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new yr(12, k60Var, user));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                } else {
                                    c2Var3.P = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                }
                                k60Var.showDialog(c2Var3);
                                return;
                            }
                        }
                        k60Var.getMessagesController().putUser(user, !k60Var.P);
                    } else if (object instanceof TLRPC.Chat) {
                        k60Var.getMessagesController().putChat((TLRPC.Chat) object, !k60Var.P);
                    }
                    org.telegram.ui.Components.w20 w20Var6 = new org.telegram.ui.Components.w20(k60Var.f.r.getContext(), object);
                    k60Var.h.a(w20Var6);
                    w20Var6.setOnClickListener(k60Var);
                }
                k60Var.r0();
                if (k60Var.P || k60Var.O) {
                    AndroidUtilities.showKeyboard(k60Var.f.r);
                } else {
                    k60Var.j0();
                }
                if (k60Var.f.r.length() > 0) {
                    k60Var.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    public static void Y(k60 k60Var) {
        if (k60Var.B == null) {
            return;
        }
        k60Var.c.a(!k60Var.V.i(), true);
    }

    public static void Z(k60 k60Var, Canvas canvas, RectF rectF, Paint paint) {
        ng.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || (dVar = k60Var.m0) == null) {
            return;
        }
        dVar.T0(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(178);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 != 3) {
            if (i9 == 4) {
                f0();
                h0();
                return;
            }
            return;
        }
        int paddingTop = this.n.getPaddingTop();
        i0();
        org.telegram.ui.Components.m10 m10Var = this.f;
        td.c cVar2 = this.b;
        m10Var.setTranslationY(cVar2.e);
        h0();
        this.e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar2.e);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((td.a) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override // xg.d
    public final View M() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean canBeginSlide() {
        return e0(true);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        int i9 = 0;
        this.P = false;
        this.O = false;
        this.W.clear();
        this.V.b();
        this.X = null;
        boolean z10 = this.N;
        int i10 = 1;
        int i11 = this.I;
        int i12 = 2;
        if (i11 == 2) {
            this.A = true;
        } else {
            this.A = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.H);
        boolean z11 = this.L;
        boolean z12 = this.K;
        boolean z13 = this.M;
        if (!isEmpty) {
            this.actionBar.setTitle(this.H);
        } else if (i11 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else if (z13) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
        } else if (!z10) {
            int i13 = this.Q;
            if (z12) {
                if (i13 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i13 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (!z11) {
                this.actionBar.setTitle(LocaleController.getString(i11 == 0 ? R.string.NewGroup : R.string.NewBroadcastList));
            } else if (i13 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            } else if (i13 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
            }
        } else if (this.D != 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
        }
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 21));
        this.f = new org.telegram.ui.Components.m10(context, this.resourceProvider);
        m0 m0Var = new m0(this, context, 7);
        this.fragmentView = m0Var;
        m0Var.setFocusableInTouchMode(true);
        m0Var.setDescendantFocusability(131072);
        c60 c60Var = new c60(this, context, this.currentAccount);
        this.h = c60Var;
        c60Var.setDelegate(new z50(this, i9));
        this.h.getSpansContainer().setOnClickListener(new b60(this, i9));
        c60 c60Var2 = this.h;
        this.V = c60Var2.b;
        this.W = c60Var2.c;
        q0();
        this.f.r.setOnEditorActionListener(new ea(this, 4));
        this.f.r.setOnKeyListener(new d60(i9, this));
        this.f.r.addTextChangedListener(new o0(this, 6));
        ArrayList arrayList = this.e0;
        if (arrayList != null) {
            o0(arrayList, this.f0, this.g0);
        }
        org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
        e00Var.setViewType(6);
        e00Var.w = false;
        org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, e00Var, 1, null);
        this.s = gw0Var;
        gw0Var.addView(e00Var);
        this.s.e(true, false);
        this.s.d.setText(LocaleController.getString(R.string.NoResult));
        m0Var.addView(this.s);
        this.r = new f2.m0(1, false);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.n = wk0Var;
        wk0Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        org.telegram.ui.Components.wk0 wk0Var2 = this.n;
        i60 i60Var = new i60(this, context);
        this.v = i60Var;
        wk0Var2.setAdapter(i60Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.wk0 wk0Var3 = this.n;
        float f10 = -this.a;
        m0Var.addView(wk0Var3, g7.e6.d(-1, -1.0f, 119, 0.0f, f10, 0.0f, f10));
        this.n.setOnItemClickListener(new bg.b1(19, this, context));
        this.n.setOnScrollListener(new l3(this, 13));
        org.telegram.ui.Components.wk0 wk0Var4 = this.n;
        wk0Var4.U1 = true;
        wk0Var4.V1 = 0;
        org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(context, this.resourceProvider, false);
        this.y = j10Var;
        if (z11 || z12 || z10) {
            j10Var.c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
            h2Var.l = 180;
            h2Var.invalidateSelf();
            this.y.c.setImageDrawable(h2Var);
        }
        if (!z13) {
            m0Var.addView(this.y, org.telegram.ui.Components.j10.b());
        }
        this.y.setOnClickListener(new b60(this, i10));
        this.y.e(this.A, false);
        this.y.setContentDescription(LocaleController.getString(R.string.Next));
        int i14 = 3;
        if (z13) {
            this.B = new gh.h1(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.d7, this.resourceProvider));
            this.B.addView(view, g7.e6.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.B.addView(linearLayout, g7.e6.e(-1, -2, 87));
            kh.d dVar = new kh.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.eq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, g7.e6.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new b60(this, i12));
            kh.d dVar2 = new kh.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.eq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, g7.e6.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new b60(this, i14));
            m0Var.addView(this.B, g7.e6.e(-1, -2, 87));
            f0();
        }
        r0();
        ih.b3 b3Var = new ih.b3(this, context);
        this.d = b3Var;
        m0Var.addView(b3Var, g7.e6.e(-1, 0, 48));
        m0Var.addView(this.actionBar);
        m0Var.addView(this.f, g7.e6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        m0Var.addView(this.h);
        org.telegram.ui.Components.wk0 wk0Var5 = this.n;
        Objects.requireNonNull(wk0Var5);
        this.n0 = new ig.k(wk0Var5, m0Var, new ns(wk0Var5, i9));
        this.n.C0(new a60(this, i14));
        kh.h6 h6Var = new kh.h6(context, this.parentLayout);
        this.e = h6Var;
        h6Var.b(false, false);
        m0Var.addView(this.e, g7.e6.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            launchActivity.c1.d.add(this);
        }
        View view2 = this.fragmentView;
        z50 z50Var = new z50(this, i14);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(view2, z50Var);
        return this.fragmentView;
    }

    public final void d0() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.l0) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + this.Y;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + dp2;
        RectF rectF = this.p0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f10 = -dp;
        rectF.inset(0.0f, f10);
        if (this.B != null) {
            float measuredHeight2 = this.fragmentView.getMeasuredHeight() - this.B.getMeasuredHeight();
            float measuredWidth2 = this.fragmentView.getMeasuredWidth();
            float measuredHeight3 = this.fragmentView.getMeasuredHeight();
            RectF rectF2 = this.q0;
            rectF2.set(0.0f, measuredHeight2, measuredWidth2, measuredHeight3);
            rectF2.inset(0.0f, f10);
        }
        eVar.g((this.B == null || this.c.e <= 0.0f) ? 1 : 2, this.o0);
        eVar.e(this.n0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.contactsDidLoad) {
            i60 i60Var = this.v;
            if (i60Var != null) {
                i60Var.l();
                return;
            }
            return;
        }
        if (i9 != NotificationCenter.updateInterfaces) {
            if (i9 == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                return;
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.n.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.g4) {
                    ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e0(boolean z10) {
        boolean z11;
        if (this.a0) {
            HashSet hashSet = new HashSet();
            for (int i9 = 0; i9 < this.V.m(); i9++) {
                hashSet.add(Long.valueOf(this.V.j(i9)));
            }
            boolean z12 = this.c0;
            boolean z13 = this.T == null;
            HashSet hashSet2 = this.b0;
            if (z12 != z13) {
                if (this.d0 != (this.U == null) && hashSet.size() == hashSet2.size()) {
                    z11 = false;
                    if (!z11) {
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Long l10 = (Long) it.next();
                            l10.getClass();
                            if (!hashSet2.contains(l10)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (z11) {
                        if (z10) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            alertDialog$Builder.a.N = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                            alertDialog$Builder.a.P = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new z50(this, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new z50(this, 2));
                            showDialog(alertDialog$Builder.a);
                        }
                        return false;
                    }
                }
            }
            z11 = true;
            if (!z11) {
            }
            if (z11) {
            }
        }
        return true;
    }

    public final void f0() {
        gh.h1 h1Var = this.B;
        if (h1Var == null) {
            return;
        }
        float f10 = this.c.e;
        h1Var.setTranslationY((1.0f - f10) * AndroidUtilities.dp(12.0f));
        this.B.setAlpha(f10);
        this.B.setVisibility(f10 > 0.0f ? 0 : 8);
    }

    public final void g0() {
        org.telegram.ui.Components.j10 j10Var = this.y;
        if (j10Var != null) {
            j10Var.setTranslationY(-Math.max(this.i0, this.j0));
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 1, null, null, null, null, i9));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.f6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s, 2048, null, null, null, null, org.telegram.ui.ActionBar.f6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 16, new Class[]{org.telegram.ui.Cells.f4.class}, null, null, null, org.telegram.ui.ActionBar.f6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Zh));
        int i11 = org.telegram.ui.ActionBar.f6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.n6));
        int i12 = org.telegram.ui.ActionBar.f6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.n, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        int i13 = org.telegram.ui.ActionBar.f6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, org.telegram.ui.ActionBar.f6.di));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.w20.class}, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.s.e, 4, null, null, null, null, i12));
        org.telegram.ui.Components.hd0 hd0Var = this.Z;
        if (hd0Var != null) {
            arrayList.addAll(hd0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        if (this.n.Z0()) {
            this.n.setClipBounds(null);
            return;
        }
        int dp = (int) ((AndroidUtilities.dp(76.0f) + this.i0) * this.c.e);
        int i9 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i9 + 48) + ((int) this.b.e);
        int measuredWidth = this.n.getMeasuredWidth();
        int B = org.telegram.messenger.l0.B(i9, this.n.getMeasuredHeight(), dp);
        Rect rect = this.k0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.n.setClipBounds(rect);
    }

    public final void i0() {
        int dp = this.M ? AndroidUtilities.dp(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(r3 + 48) + ((int) this.b.e), 0, AndroidUtilities.dp(this.a) + this.i0 + dp);
        this.s.setPadding(0, 0, 0, this.i0);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        long j10;
        int childCount = this.n.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = this.n.getChildAt(i9);
            if (childAt instanceof org.telegram.ui.Cells.g4) {
                org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) childAt;
                Object object = g4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j10 = -((TLRPC.Chat) object).id;
                } else {
                    boolean z10 = object instanceof String;
                    if (z10 && "premium".equalsIgnoreCase((String) object)) {
                        g4Var.c(this.T != null, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else if (z10 && "miniapps".equalsIgnoreCase((String) object)) {
                        g4Var.c(this.U != null, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else {
                        j10 = 0;
                    }
                }
                if (j10 != 0) {
                    a0.h hVar = this.F;
                    if (hVar == null || hVar.h(j10) < 0) {
                        g4Var.c(this.V.h(j10) >= 0, true);
                        g4Var.setCheckBoxEnabled(true);
                    } else {
                        g4Var.c(true, false);
                        g4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.v3) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    ((org.telegram.ui.Cells.v3) childAt).b((this.T == null && this.V.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new b60(this, 4));
                }
            }
        }
    }

    @Override // xg.d
    public final void k(r0.m1 m1Var) {
        this.j0 = m1Var.a.f(8).d;
        g0();
    }

    public final HashSet k0() {
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < this.V.m(); i9++) {
            hashSet.add(Long.valueOf(this.V.j(i9)));
        }
        return hashSet;
    }

    public final void l0(int i9) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.V.m(); i10++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.V.j(i10))));
        }
        f60 f60Var = this.x;
        if (f60Var != null) {
            f60Var.j(i9, arrayList);
        }
        finishFragment();
    }

    public final boolean n0() {
        boolean i9 = this.V.i();
        boolean z10 = this.N;
        int i10 = this.I;
        if (!i9 || i10 == 2 || !z10) {
            long j10 = this.C;
            int i11 = 1;
            if (!z10) {
                if (i10 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i12 = 0; i12 < this.V.m(); i12++) {
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.V.j(i12))));
                        if (inputUser != null) {
                            arrayList.add(inputUser);
                        }
                    }
                    getMessagesController().addUsersToChannel(j10, arrayList, null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new qn(bundle), true);
                    return true;
                }
                if (this.A) {
                    if (z10) {
                        l0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < this.V.m(); i13++) {
                        arrayList2.add(Long.valueOf(this.V.j(i13)));
                    }
                    if (this.K || this.L) {
                        g60 g60Var = this.w;
                        if (g60Var != null) {
                            g60Var.b(arrayList2, this.T != null, this.U != null);
                        }
                        finishFragment();
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        jArr[i14] = ((Long) arrayList2.get(i14)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i10);
                    bundle2.putBoolean("forImport", this.J);
                    presentFragment(new r60(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.V.m(), new Object[0]);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = formatPluralString;
                StringBuilder sb2 = new StringBuilder();
                for (int i15 = 0; i15 < this.V.m(); i15++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.V.j(i15)));
                    if (user != null) {
                        if (sb2.length() > 0) {
                            sb2.append(", ");
                        }
                        sb2.append("**");
                        sb2.append(ContactsController.formatName(user.first_name, user.last_name));
                        sb2.append("**");
                    }
                }
                MessagesController messagesController = getMessagesController();
                if (j10 == 0) {
                    j10 = this.D;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j10));
                if (this.V.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", this.V.m(), chat != null ? chat.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.V.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                    }
                    c2Var.P = spannableStringBuilder;
                } else {
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddMembersAlertNamesText, sb2, chat != null ? chat.title : ""));
                }
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                if (!ChatObject.isChannel(chat)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1, this.resourceProvider);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
                    z1VarArr[0].setMultiline(true);
                    if (this.V.m() == 1) {
                        z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.V.j(0)))))), "", true, false, false);
                    } else {
                        z1VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                    }
                    z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    linearLayout.addView(z1VarArr[0], g7.e6.n(-1, -2));
                    z1VarArr[0].setOnClickListener(new c20(z1VarArr, i11));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Add), new yr(13, this, z1VarArr));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(c2Var);
                return true;
            }
        }
        return false;
    }

    public final void o0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.w20 w20Var;
        org.telegram.ui.Components.w20 w20Var2;
        HashSet hashSet = this.b0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.c0 = z10;
        this.d0 = z11;
        c60 c60Var = this.h;
        if (c60Var == null) {
            this.e0 = arrayList;
            this.f0 = z10;
            this.g0 = z11;
            return;
        }
        if (z10 && this.T == null) {
            org.telegram.ui.Components.w20 w20Var3 = new org.telegram.ui.Components.w20(getParentActivity(), "premium");
            this.T = w20Var3;
            this.h.a(w20Var3);
            this.T.setOnClickListener(this);
        } else if (!z10 && (w20Var = this.T) != null) {
            c60Var.c(w20Var);
            this.T = null;
        }
        if (z11 && this.U == null) {
            org.telegram.ui.Components.w20 w20Var4 = new org.telegram.ui.Components.w20(getParentActivity(), "miniApps");
            this.U = w20Var4;
            this.h.a(w20Var4);
            this.U.setOnClickListener(this);
        } else if (!z11 && (w20Var2 = this.U) != null) {
            this.h.c(w20Var2);
            this.U = null;
        }
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            Long l10 = (Long) obj;
            long longValue = l10.longValue();
            Object chat = longValue < 0 ? getMessagesController().getChat(Long.valueOf(-longValue)) : getMessagesController().getUser(l10);
            if (chat != null) {
                org.telegram.ui.Components.w20 w20Var5 = new org.telegram.ui.Components.w20(getParentActivity(), chat);
                this.h.a(w20Var5);
                w20Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.p10 p10Var = this.h.d;
        AnimatorSet animatorSet = p10Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            p10Var.a.setupEndValues();
            p10Var.a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.n);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        if (e0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.w20 w20Var = (org.telegram.ui.Components.w20) view;
        if (w20Var.y) {
            this.X = null;
            this.h.c(w20Var);
            r0();
            j0();
            return;
        }
        org.telegram.ui.Components.w20 w20Var2 = this.X;
        if (w20Var2 != null) {
            w20Var2.a();
        }
        this.X = w20Var;
        w20Var.b();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.chatDidCreated);
        getUserConfig().loadGlobalTTl();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatDidCreated);
    }

    public final void p0(int i9) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.n, new org.telegram.ui.Components.qd(this, i9, 15));
    }

    public final void q0() {
        i60 i60Var;
        fg.g gVar = this.f.r;
        if (gVar == null) {
            return;
        }
        if (this.I == 2) {
            gVar.setHint(LocaleController.getString(R.string.AddMutual));
            return;
        }
        if (this.N || ((i60Var = this.v) != null && i60Var.C == 0)) {
            gVar.setHint(LocaleController.getString(R.string.SearchForPeople));
            return;
        }
        if (this.K || this.L) {
            gVar.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else if (this.M) {
            gVar.setHint(LocaleController.getString(R.string.NewCallSearch));
        } else {
            gVar.setHint(LocaleController.getString(R.string.SendMessageTo));
        }
    }

    public final void r0() {
        boolean z10 = this.K;
        int i9 = this.I;
        boolean z11 = this.N;
        if (!z10 && !this.L && !z11) {
            if (i9 == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.V.m(), new Object[0]));
            } else {
                boolean i10 = this.V.i();
                int i11 = this.G;
                if (i10) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i11 + (this.M ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.V.m()), Integer.valueOf(this.V.m()), Integer.valueOf(i11)));
                }
            }
        }
        if (i9 == 2 || !z11) {
            return;
        }
        if (this.A && this.W.isEmpty()) {
            this.y.e(false, true);
            this.A = false;
        } else {
            if (this.A || this.W.isEmpty()) {
                return;
            }
            this.y.e(true, true);
            this.A = true;
        }
    }

    @Override // xg.d
    public final /* synthetic */ void K() {
    }

    public void m0(HashSet hashSet) {
    }

    @Override // xg.d
    public final /* synthetic */ void t() {
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
