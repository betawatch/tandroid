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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class f70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, le.d, View.OnClickListener, qh.d {
    public boolean E;
    public bi.e7 F;
    public final long G;
    public final long H;
    public TLRPC.ChatFull I;
    public a0.i J;
    public final int K;
    public String L;
    public final int M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public boolean S;
    public boolean T;
    public final int U;
    public final boolean V;
    public final boolean W;
    public org.telegram.ui.Components.m30 X;
    public org.telegram.ui.Components.m30 Y;
    public a0.i Z;
    public final int a;
    public ArrayList a0;
    public final le.e b;
    public org.telegram.ui.Components.m30 b0;
    public final le.b c;
    public int c0;
    public bi.a4 d;
    public org.telegram.ui.Components.ae0 d0;
    public di.r6 e;
    public boolean e0;
    public org.telegram.ui.Components.b20 f;
    public final HashSet f0;
    public boolean g0;
    public x60 h;
    public boolean h0;
    public ArrayList i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public int m0;
    public org.telegram.ui.Components.ll0 n;
    public int n0;
    public final Rect o0;
    public final bh.f p0;
    public final gh.d q0;
    public s4.c0 r;
    public bh.l r0;
    public org.telegram.ui.Components.xw0 s;
    public final ArrayList s0;
    public final RectF t0;
    public final RectF u0;
    public d70 v;
    public b70 w;
    public a70 x;
    public org.telegram.ui.Components.y10 y;

    public f70(Bundle bundle) {
        super(bundle);
        int i10 = Build.VERSION.SDK_INT;
        this.a = i10 >= 31 ? 48 : 0;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.b = new le.e(3, this, prVar, 350L);
        this.c = new le.b(4, this, prVar, 350L, false);
        this.Z = new a0.i();
        this.a0 = new ArrayList();
        this.f0 = new HashSet();
        this.l0 = -4;
        this.o0 = new Rect();
        ArrayList arrayList = new ArrayList(2);
        this.s0 = arrayList;
        RectF rectF = new RectF();
        this.t0 = rectF;
        RectF rectF2 = new RectF();
        this.u0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        int i11 = bundle.getInt("chatType", 0);
        this.M = i11;
        this.N = bundle.getBoolean("forImport", false);
        boolean z10 = bundle.getBoolean("isAlwaysShare", false);
        this.O = z10;
        boolean z11 = bundle.getBoolean("isNeverShare", false);
        this.P = z11;
        boolean z12 = bundle.getBoolean("isCall", false);
        this.Q = z12;
        boolean z13 = bundle.getBoolean("addToGroup", false);
        this.R = z13;
        this.U = bundle.getInt("chatAddType", 0);
        this.V = bundle.getBoolean("allowPremium", false);
        this.W = bundle.getBoolean("allowMiniapps", false);
        this.G = bundle.getLong("chatId");
        this.H = bundle.getLong("channelId");
        if (z10 || z11 || z13) {
            this.K = 0;
        } else if (z12) {
            this.K = getMessagesController().conferenceCallSizeLimit - 1;
        } else {
            MessagesController messagesController = getMessagesController();
            this.K = i11 == 0 ? messagesController.maxMegagroupCount : messagesController.maxBroadcastCount;
        }
        if (i10 >= 31) {
            this.p0 = new bh.f(false);
            this.q0 = new gh.d(null);
        } else {
            this.p0 = null;
            this.q0 = null;
        }
    }

    public static void U(f70 f70Var, Context context, View view, int i10) {
        long j3;
        int i11 = f70Var.K;
        long j10 = f70Var.H;
        d70 d70Var = f70Var.v;
        int i12 = 3;
        int i13 = 0;
        if (i10 == d70Var.w) {
            int i14 = f70Var.currentAccount;
            org.telegram.ui.ActionBar.f6 f6Var = f70Var.resourceProvider;
            v60 v60Var = new v60(f70Var, i13);
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
            b2Var.q(500L);
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i14).sendRequest(createconferencecall, new bi.fa(i14, b2Var, context, f6Var, v60Var, 3));
            return;
        }
        if (i10 == 0 && d70Var.F != 0 && !d70Var.n) {
            org.telegram.ui.Components.ae0 ae0Var = new org.telegram.ui.Components.ae0(context, f70Var, f70Var.I, f70Var.G, j10 != 0);
            f70Var.d0 = ae0Var;
            f70Var.showDialog(ae0Var);
            return;
        }
        if (view instanceof org.telegram.ui.Cells.f4) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            if (f4Var.r) {
                org.telegram.ui.Components.m30 m30Var = f70Var.X;
                if (m30Var == null) {
                    org.telegram.ui.Components.m30 m30Var2 = new org.telegram.ui.Components.m30(f70Var.f.r.getContext(), "premium");
                    f70Var.X = m30Var2;
                    f70Var.h.a(m30Var2);
                    f70Var.X.setOnClickListener(f70Var);
                } else {
                    f70Var.h.c(m30Var);
                    f70Var.X = null;
                }
                f70Var.k0();
                return;
            }
            if (f4Var.s) {
                org.telegram.ui.Components.m30 m30Var3 = f70Var.Y;
                if (m30Var3 == null) {
                    org.telegram.ui.Components.m30 m30Var4 = new org.telegram.ui.Components.m30(f70Var.f.r.getContext(), "miniapps");
                    f70Var.Y = m30Var4;
                    f70Var.h.a(m30Var4);
                    f70Var.Y.setOnClickListener(f70Var);
                } else {
                    f70Var.h.c(m30Var3);
                    f70Var.Y = null;
                }
                f70Var.k0();
                return;
            }
            Object object = f4Var.getObject();
            boolean z10 = object instanceof TLRPC.User;
            if (z10) {
                j3 = ((TLRPC.User) object).id;
            } else if (!(object instanceof TLRPC.Chat)) {
                return;
            } else {
                j3 = -((TLRPC.Chat) object).id;
            }
            a0.i iVar = f70Var.J;
            if (iVar == null || iVar.h(j3) < 0) {
                if (f4Var.O) {
                    int i15 = -f70Var.l0;
                    f70Var.l0 = i15;
                    AndroidUtilities.shakeViewSpring(f4Var, i15);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String userName = j3 >= 0 ? UserObject.getUserName(MessagesController.getInstance(f70Var.currentAccount).getUser(Long.valueOf(j3))) : "";
                    (MessagesController.getInstance(f70Var.currentAccount).premiumFeaturesBlocked() ? org.telegram.ui.Components.yc.a0(f70Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName))) : org.telegram.ui.Components.yc.a0(f70Var).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new v60(f70Var, 2))).j();
                    return;
                }
                org.telegram.ui.Components.m30 m30Var5 = (org.telegram.ui.Components.m30) f70Var.Z.f(j3);
                if (m30Var5 != null) {
                    f70Var.h.c(m30Var5);
                } else {
                    if (i11 != 0 && f70Var.Z.m() == i11) {
                        return;
                    }
                    if (f70Var.M == 0 && f70Var.Z.m() == f70Var.getMessagesController().maxGroupCount) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(f70Var.getParentActivity());
                        String string = LocaleController.getString(R.string.AppName);
                        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
                        b2Var2.R = string;
                        b2Var2.T = LocaleController.getString(R.string.SoftUserLimitAlert);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        f70Var.showDialog(b2Var2);
                        return;
                    }
                    if (z10) {
                        TLRPC.User user = (TLRPC.User) object;
                        if (f70Var.R && user.bot) {
                            if (j10 == 0 && user.bot_nochats) {
                                try {
                                    org.telegram.ui.Components.yc.a0(f70Var).t(LocaleController.getString(R.string.BotCantJoinGroups), null).j();
                                    return;
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                    return;
                                }
                            }
                            if (j10 != 0) {
                                TLRPC.Chat chat = f70Var.getMessagesController().getChat(Long.valueOf(j10));
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f70Var.getParentActivity());
                                boolean canAddAdmins = ChatObject.canAddAdmins(chat);
                                org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder2.a;
                                if (canAddAdmins) {
                                    b2Var3.R = LocaleController.getString(R.string.AddBotAdminAlert);
                                    b2Var3.T = LocaleController.getString(R.string.AddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.AddAsAdmin), new z10(i12, f70Var, user));
                                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                                } else {
                                    b2Var3.T = LocaleController.getString(R.string.CantAddBotAsAdmin);
                                    alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                                }
                                f70Var.showDialog(b2Var3);
                                return;
                            }
                        }
                        f70Var.getMessagesController().putUser(user, !f70Var.T);
                    } else if (object instanceof TLRPC.Chat) {
                        f70Var.getMessagesController().putChat((TLRPC.Chat) object, !f70Var.T);
                    }
                    org.telegram.ui.Components.m30 m30Var6 = new org.telegram.ui.Components.m30(f70Var.f.r.getContext(), object);
                    f70Var.h.a(m30Var6);
                    m30Var6.setOnClickListener(f70Var);
                }
                f70Var.s0();
                if (f70Var.T || f70Var.S) {
                    AndroidUtilities.showKeyboard(f70Var.f.r);
                } else {
                    f70Var.k0();
                }
                if (f70Var.f.r.length() > 0) {
                    f70Var.f.r.setText((CharSequence) null);
                }
            }
        }
    }

    public static void Z(f70 f70Var) {
        if (f70Var.F == null) {
            return;
        }
        f70Var.c.a(!f70Var.Z.i(), true);
    }

    public static void a0(f70 f70Var, Canvas canvas, RectF rectF, Paint paint) {
        gh.d dVar;
        canvas.drawRect(rectF, paint);
        if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || (dVar = f70Var.q0) == null) {
            return;
        }
        dVar.v(canvas, rectF.left, rectF.top, rectF.right, rectF.bottom);
        int alpha = paint.getAlpha();
        paint.setAlpha(178);
        canvas.drawRect(rectF, paint);
        paint.setAlpha(alpha);
    }

    @Override // le.d
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 != 3) {
            if (i10 == 4) {
                g0();
                i0();
                return;
            }
            return;
        }
        int paddingTop = this.n.getPaddingTop();
        j0();
        org.telegram.ui.Components.b20 b20Var = this.f;
        le.e eVar2 = this.b;
        b20Var.setTranslationY(eVar2.e);
        i0();
        this.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar2.e);
        this.d.invalidate();
        int paddingTop2 = this.n.getPaddingTop();
        if (paddingTop2 == paddingTop || ((le.b) this.e.c).f) {
            return;
        }
        this.n.scrollBy(0, paddingTop - paddingTop2);
    }

    @Override // qh.d
    public final View N() {
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean canBeginSlide() {
        return f0(true);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        org.telegram.ui.ActionBar.k createActionBar = super.createActionBar(context);
        createActionBar.setAddToContainer(false);
        return createActionBar;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        int i10 = 0;
        this.T = false;
        this.S = false;
        this.a0.clear();
        this.Z.b();
        this.b0 = null;
        boolean z10 = this.R;
        int i11 = 1;
        int i12 = this.M;
        int i13 = 2;
        if (i12 == 2) {
            this.E = true;
        } else {
            this.E = !z10;
        }
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        boolean isEmpty = TextUtils.isEmpty(this.L);
        boolean z11 = this.P;
        boolean z12 = this.O;
        boolean z13 = this.Q;
        if (!isEmpty) {
            this.actionBar.setTitle(this.L);
        } else if (i12 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else if (z13) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewCall));
        } else if (!z10) {
            int i14 = this.U;
            if (z12) {
                if (i14 == 2) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.FilterAlwaysShow));
                } else if (i14 == 1) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysAllow));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AlwaysShareWithTitle));
                }
            } else if (!z11) {
                this.actionBar.setTitle(LocaleController.getString(i12 == 0 ? R.string.NewGroup : R.string.NewBroadcastList));
            } else if (i14 == 2) {
                this.actionBar.setTitle(LocaleController.getString(R.string.FilterNeverShow));
            } else if (i14 == 1) {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverAllow));
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.NeverShareWithTitle));
            }
        } else if (this.H != 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAddSubscribers));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.GroupAddMembers));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 27));
        this.f = new org.telegram.ui.Components.b20(context, this.resourceProvider);
        j0 j0Var = new j0(this, context, 7);
        this.fragmentView = j0Var;
        j0Var.setFocusableInTouchMode(true);
        j0Var.setDescendantFocusability(131072);
        x60 x60Var = new x60(this, context, this.currentAccount);
        this.h = x60Var;
        x60Var.setDelegate(new u60(this, i10));
        this.h.getSpansContainer().setOnClickListener(new w60(this, i10));
        x60 x60Var2 = this.h;
        this.Z = x60Var2.b;
        this.a0 = x60Var2.c;
        r0();
        this.f.r.setOnEditorActionListener(new ia(this, 4));
        this.f.r.setOnKeyListener(new y60(i10, this));
        this.f.r.addTextChangedListener(new l0(this, 6));
        ArrayList arrayList = this.i0;
        if (arrayList != null) {
            p0(arrayList, this.j0, this.k0);
        }
        org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(context, null);
        t00Var.setViewType(6);
        t00Var.w = false;
        org.telegram.ui.Components.xw0 xw0Var = new org.telegram.ui.Components.xw0(context, t00Var, 1, null);
        this.s = xw0Var;
        xw0Var.addView(t00Var);
        this.s.e(true, false);
        this.s.d.setText(LocaleController.getString(R.string.NoResult));
        j0Var.addView(this.s);
        this.r = new s4.c0(1, false);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.n = ll0Var;
        ll0Var.setFastScrollEnabled(0);
        this.n.setEmptyView(this.s);
        org.telegram.ui.Components.ll0 ll0Var2 = this.n;
        d70 d70Var = new d70(this, context);
        this.v = d70Var;
        ll0Var2.setAdapter(d70Var);
        this.n.setLayoutManager(this.r);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.setClipToPadding(false);
        this.n.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        org.telegram.ui.Components.ll0 ll0Var3 = this.n;
        float f7 = -this.a;
        j0Var.addView(ll0Var3, w7.x5.d(-1, -1.0f, 119, 0.0f, f7, 0.0f, f7));
        this.n.setOnItemClickListener(new bi.x5(17, this, context));
        this.n.setOnScrollListener(new i3(this, 13));
        org.telegram.ui.Components.ll0 ll0Var4 = this.n;
        ll0Var4.Y1 = true;
        ll0Var4.Z1 = 0;
        org.telegram.ui.Components.y10 y10Var = new org.telegram.ui.Components.y10(context, this.resourceProvider, false);
        this.y = y10Var;
        if (z11 || z12 || z10) {
            y10Var.c.setImageResource(R.drawable.floating_check);
        } else {
            org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
            g2Var.l = 180;
            g2Var.invalidateSelf();
            this.y.c.setImageDrawable(g2Var);
        }
        if (!z13) {
            j0Var.addView(this.y, org.telegram.ui.Components.y10.b());
        }
        this.y.setOnClickListener(new w60(this, i11));
        this.y.e(this.E, false);
        this.y.setContentDescription(LocaleController.getString(R.string.Next));
        int i15 = 3;
        if (z13) {
            this.F = new bi.e7(this, context);
            View view = new View(context);
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d7, this.resourceProvider));
            this.F.addView(view, w7.x5.d(-1, 1.0f / AndroidUtilities.density, 55, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            this.F.addView(linearLayout, w7.x5.e(-1, -2, 87));
            di.d dVar = new di.d(context, this.resourceProvider, true);
            dVar.e();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) "x  ");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.nq(R.drawable.profile_phone, 0), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVoice));
            dVar.g(spannableStringBuilder, false, true);
            linearLayout.addView(dVar, w7.x5.p(-1, 48, 1.0f, 119, 0, 0, 6, 0));
            dVar.setOnClickListener(new w60(this, i13));
            di.d dVar2 = new di.d(context, this.resourceProvider, true);
            dVar2.e();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) "x  ");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.nq(R.drawable.profile_video, 0), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GroupCallCreateVideo));
            dVar2.g(spannableStringBuilder2, false, true);
            linearLayout.addView(dVar2, w7.x5.p(-1, 48, 1.0f, 119, 6, 0, 0, 0));
            dVar2.setOnClickListener(new w60(this, i15));
            j0Var.addView(this.F, w7.x5.e(-1, -2, 87));
            g0();
        }
        s0();
        bi.a4 a4Var = new bi.a4(this, context);
        this.d = a4Var;
        j0Var.addView(a4Var, w7.x5.e(-1, 0, 48));
        j0Var.addView(this.actionBar);
        j0Var.addView(this.f, w7.x5.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        j0Var.addView(this.h);
        org.telegram.ui.Components.ll0 ll0Var5 = this.n;
        Objects.requireNonNull(ll0Var5);
        this.r0 = new bh.l(ll0Var5, j0Var, new xs(ll0Var5, i10));
        this.n.C0(new v60(this, i15));
        di.r6 r6Var = new di.r6(context, this.parentLayout);
        this.e = r6Var;
        r6Var.b(false, false);
        j0Var.addView(this.e, w7.x5.e(-1, 5, 48));
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null) {
            launchActivity.g1.d.add(this);
        }
        View view2 = this.fragmentView;
        u60 u60Var = new u60(this, i15);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(view2, u60Var);
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.contactsDidLoad) {
            d70 d70Var = this.v;
            if (d70Var != null) {
                d70Var.l();
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.chatDidCreated) {
                removeSelfFromStack();
            }
        } else if (this.n != null) {
            int intValue = ((Integer) objArr[0]).intValue();
            int childCount = this.n.getChildCount();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) == 0 && (MessagesController.UPDATE_MASK_NAME & intValue) == 0 && (MessagesController.UPDATE_MASK_STATUS & intValue) == 0) {
                return;
            }
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.n.getChildAt(i12);
                if (childAt instanceof org.telegram.ui.Cells.f4) {
                    ((org.telegram.ui.Cells.f4) childAt).f(intValue);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e0() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.p0) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int dp2 = AndroidUtilities.dp(48.0f) + this.c0;
        float measuredWidth = this.fragmentView.getMeasuredWidth();
        float measuredHeight = this.actionBar.getMeasuredHeight() + dp2;
        RectF rectF = this.t0;
        rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
        float f7 = -dp;
        rectF.inset(0.0f, f7);
        if (this.F != null) {
            float measuredHeight2 = this.fragmentView.getMeasuredHeight() - this.F.getMeasuredHeight();
            float measuredWidth2 = this.fragmentView.getMeasuredWidth();
            float measuredHeight3 = this.fragmentView.getMeasuredHeight();
            RectF rectF2 = this.u0;
            rectF2.set(0.0f, measuredHeight2, measuredWidth2, measuredHeight3);
            rectF2.inset(0.0f, f7);
        }
        fVar.g((this.F == null || this.c.e <= 0.0f) ? 1 : 2, this.s0);
        fVar.e(this.r0, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f0(boolean z10) {
        boolean z11;
        if (this.e0) {
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < this.Z.m(); i10++) {
                hashSet.add(Long.valueOf(this.Z.j(i10)));
            }
            boolean z12 = this.g0;
            boolean z13 = this.X == null;
            HashSet hashSet2 = this.f0;
            if (z12 != z13) {
                if (this.h0 != (this.Y == null) && hashSet.size() == hashSet2.size()) {
                    z11 = false;
                    if (!z11) {
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Long l4 = (Long) it.next();
                            l4.getClass();
                            if (!hashSet2.contains(l4)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                    if (z11) {
                        if (z10) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new u60(this, 1));
                            alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new u60(this, 2));
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

    public final void g0() {
        bi.e7 e7Var = this.F;
        if (e7Var == null) {
            return;
        }
        float f7 = this.c.e;
        e7Var.setTranslationY((1.0f - f7) * AndroidUtilities.dp(12.0f));
        this.F.setAlpha(f7);
        this.F.setVisibility(f7 > 0.0f ? 0 : 8);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 16);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 32768, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.c7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 16, new Class[]{org.telegram.ui.Cells.e4.class}, null, null, null, org.telegram.ui.ActionBar.j6.e7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"drawable"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Zh));
        int i12 = org.telegram.ui.ActionBar.j6.ai;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4, new Class[]{org.telegram.ui.Cells.e4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.i7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.j7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.n6));
        int i13 = org.telegram.ui.ActionBar.j6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.f4.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        int i14 = org.telegram.ui.ActionBar.j6.T7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.ci));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.bi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, org.telegram.ui.ActionBar.j6.di));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h.getSpansContainer(), 0, new Class[]{org.telegram.ui.Components.m30.class}, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s.d, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.s.e, 4, null, null, null, null, i13));
        org.telegram.ui.Components.ae0 ae0Var = this.d0;
        if (ae0Var != null) {
            arrayList.addAll(ae0Var.getThemeDescriptions());
        }
        return arrayList;
    }

    public final void h0() {
        org.telegram.ui.Components.y10 y10Var = this.y;
        if (y10Var != null) {
            y10Var.setTranslationY(-Math.max(this.m0, this.n0));
        }
    }

    public final void i0() {
        if (this.n.Y0()) {
            this.n.setClipBounds(null);
            return;
        }
        int dp = (int) ((AndroidUtilities.dp(76.0f) + this.m0) * this.c.e);
        int i10 = this.a;
        int measuredHeight = this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(i10 + 48) + ((int) this.b.e);
        int measuredWidth = this.n.getMeasuredWidth();
        int B = org.telegram.messenger.w1.B(i10, this.n.getMeasuredHeight(), dp);
        Rect rect = this.o0;
        rect.set(0, measuredHeight, measuredWidth, B);
        this.n.setClipBounds(rect);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // qh.d
    public final void j(r0.l1 l1Var) {
        this.n0 = l1Var.a.f(8).d;
        h0();
    }

    public final void j0() {
        int dp = this.Q ? AndroidUtilities.dp(76.0f) : 0;
        this.n.setPadding(0, this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(r3 + 48) + ((int) this.b.e), 0, AndroidUtilities.dp(this.a) + this.m0 + dp);
        this.s.setPadding(0, 0, 0, this.m0);
    }

    public final void k0() {
        long j3;
        int childCount = this.n.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.n.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.f4) {
                org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) childAt;
                Object object = f4Var.getObject();
                if (object instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) object).id;
                } else if (object instanceof TLRPC.Chat) {
                    j3 = -((TLRPC.Chat) object).id;
                } else {
                    boolean z10 = object instanceof String;
                    if (z10 && "premium".equalsIgnoreCase((String) object)) {
                        f4Var.c(this.X != null, true);
                        f4Var.setCheckBoxEnabled(true);
                    } else if (z10 && "miniapps".equalsIgnoreCase((String) object)) {
                        f4Var.c(this.Y != null, true);
                        f4Var.setCheckBoxEnabled(true);
                    } else {
                        j3 = 0;
                    }
                }
                if (j3 != 0) {
                    a0.i iVar = this.J;
                    if (iVar == null || iVar.h(j3) < 0) {
                        f4Var.c(this.Z.h(j3) >= 0, true);
                        f4Var.setCheckBoxEnabled(true);
                    } else {
                        f4Var.c(true, false);
                        f4Var.setCheckBoxEnabled(false);
                    }
                }
            } else if (childAt instanceof org.telegram.ui.Cells.u3) {
                this.n.getClass();
                if (RecyclerView.R(childAt) == this.v.v) {
                    ((org.telegram.ui.Cells.u3) childAt).b((this.X == null && this.Z.i()) ? "" : LocaleController.getString(R.string.DeselectAll), new w60(this, 4));
                }
            }
        }
    }

    public final HashSet l0() {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.Z.m(); i10++) {
            hashSet.add(Long.valueOf(this.Z.j(i10)));
        }
        return hashSet;
    }

    public final void m0(int i10) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.Z.m(); i11++) {
            arrayList.add(getMessagesController().getUser(Long.valueOf(this.Z.j(i11))));
        }
        a70 a70Var = this.x;
        if (a70Var != null) {
            a70Var.j(i10, arrayList);
        }
        finishFragment();
    }

    public final boolean o0() {
        boolean i10 = this.Z.i();
        boolean z10 = this.R;
        int i11 = this.M;
        if (!i10 || i11 == 2 || !z10) {
            long j3 = this.G;
            int i12 = 1;
            if (!z10) {
                if (i11 == 2) {
                    ArrayList<TLRPC.InputUser> arrayList = new ArrayList<>();
                    for (int i13 = 0; i13 < this.Z.m(); i13++) {
                        TLRPC.InputUser inputUser = getMessagesController().getInputUser(getMessagesController().getUser(Long.valueOf(this.Z.j(i13))));
                        if (inputUser != null) {
                            arrayList.add(inputUser);
                        }
                    }
                    getMessagesController().addUsersToChannel(j3, arrayList, null);
                    getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j3);
                    bundle.putBoolean("just_created_chat", true);
                    presentFragment(new co(bundle), true);
                    return true;
                }
                if (this.E) {
                    if (z10) {
                        m0(0);
                        return true;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < this.Z.m(); i14++) {
                        arrayList2.add(Long.valueOf(this.Z.j(i14)));
                    }
                    if (this.O || this.P) {
                        b70 b70Var = this.w;
                        if (b70Var != null) {
                            b70Var.b(arrayList2, this.X != null, this.Y != null);
                        }
                        finishFragment();
                        return true;
                    }
                    Bundle bundle2 = new Bundle();
                    int size = arrayList2.size();
                    long[] jArr = new long[size];
                    for (int i15 = 0; i15 < size; i15++) {
                        jArr[i15] = ((Long) arrayList2.get(i15)).longValue();
                    }
                    bundle2.putLongArray("result", jArr);
                    bundle2.putInt("chatType", i11);
                    bundle2.putBoolean("forImport", this.N);
                    presentFragment(new l70(bundle2));
                    return true;
                }
            } else if (getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String formatPluralString = LocaleController.formatPluralString("AddManyMembersAlertTitle", this.Z.m(), new Object[0]);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = formatPluralString;
                StringBuilder sb2 = new StringBuilder();
                for (int i16 = 0; i16 < this.Z.m(); i16++) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.Z.j(i16)));
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
                if (j3 == 0) {
                    j3 = this.H;
                }
                TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j3));
                if (this.Z.m() > 5) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddManyMembersAlertNamesText", this.Z.m(), chat != null ? chat.title : "")));
                    String format = String.format("%d", Integer.valueOf(this.Z.m()));
                    int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                    if (indexOf >= 0) {
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), indexOf, format.length() + indexOf, 33);
                    }
                    b2Var.T = spannableStringBuilder;
                } else {
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddMembersAlertNamesText, sb2, chat != null ? chat.title : ""));
                }
                org.telegram.ui.Cells.z1[] z1VarArr = new org.telegram.ui.Cells.z1[1];
                if (!ChatObject.isChannel(chat)) {
                    LinearLayout linearLayout = new LinearLayout(getParentActivity());
                    linearLayout.setOrientation(1);
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(getParentActivity(), 1, this.resourceProvider);
                    z1VarArr[0] = z1Var;
                    z1Var.setBackground(org.telegram.ui.ActionBar.j6.K0(false));
                    z1VarArr[0].setMultiline(true);
                    if (this.Z.m() == 1) {
                        z1VarArr[0].e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AddOneMemberForwardMessages, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.Z.j(0)))))), "", true, false, false);
                    } else {
                        z1VarArr[0].e(LocaleController.getString(R.string.AddMembersForwardMessages), "", true, false, false);
                    }
                    z1VarArr[0].setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
                    linearLayout.addView(z1VarArr[0], w7.x5.n(-1, -2));
                    z1VarArr[0].setOnClickListener(new w20(z1VarArr, i12));
                    alertDialog$Builder.n(linearLayout);
                }
                alertDialog$Builder.k(LocaleController.getString(R.string.Add), new z10(4, this, z1VarArr));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(b2Var);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        if (f0(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.m30 m30Var = (org.telegram.ui.Components.m30) view;
        if (m30Var.y) {
            this.b0 = null;
            this.h.c(m30Var);
            s0();
            k0();
            return;
        }
        org.telegram.ui.Components.m30 m30Var2 = this.b0;
        if (m30Var2 != null) {
            m30Var2.a();
        }
        this.b0 = m30Var;
        m30Var.b();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.chatDidCreated);
        getUserConfig().loadGlobalTTl();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatDidCreated);
    }

    public final void p0(ArrayList arrayList, boolean z10, boolean z11) {
        org.telegram.ui.Components.m30 m30Var;
        org.telegram.ui.Components.m30 m30Var2;
        HashSet hashSet = this.f0;
        hashSet.clear();
        hashSet.addAll(arrayList);
        this.g0 = z10;
        this.h0 = z11;
        x60 x60Var = this.h;
        if (x60Var == null) {
            this.i0 = arrayList;
            this.j0 = z10;
            this.k0 = z11;
            return;
        }
        if (z10 && this.X == null) {
            org.telegram.ui.Components.m30 m30Var3 = new org.telegram.ui.Components.m30(getParentActivity(), "premium");
            this.X = m30Var3;
            this.h.a(m30Var3);
            this.X.setOnClickListener(this);
        } else if (!z10 && (m30Var = this.X) != null) {
            x60Var.c(m30Var);
            this.X = null;
        }
        if (z11 && this.Y == null) {
            org.telegram.ui.Components.m30 m30Var4 = new org.telegram.ui.Components.m30(getParentActivity(), "miniApps");
            this.Y = m30Var4;
            this.h.a(m30Var4);
            this.Y.setOnClickListener(this);
        } else if (!z11 && (m30Var2 = this.Y) != null) {
            this.h.c(m30Var2);
            this.Y = null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Long l4 = (Long) obj;
            long longValue = l4.longValue();
            Object chat = longValue < 0 ? getMessagesController().getChat(Long.valueOf(-longValue)) : getMessagesController().getUser(l4);
            if (chat != null) {
                org.telegram.ui.Components.m30 m30Var5 = new org.telegram.ui.Components.m30(getParentActivity(), chat);
                this.h.a(m30Var5);
                m30Var5.setOnClickListener(this);
            }
        }
        org.telegram.ui.Components.e20 e20Var = this.h.d;
        AnimatorSet animatorSet = e20Var.a;
        if (animatorSet != null && animatorSet.isRunning()) {
            e20Var.a.setupEndValues();
            e20Var.a.cancel();
        }
        AndroidUtilities.updateVisibleRows(this.n);
    }

    public final void q0(int i10) {
        if (this.isPaused) {
            return;
        }
        AndroidUtilities.doOnPreDraw(this.n, new org.telegram.ui.Components.m8(this, i10, 17));
    }

    public final void r0() {
        d70 d70Var;
        di.h2 h2Var = this.f.r;
        if (h2Var == null) {
            return;
        }
        if (this.M == 2) {
            h2Var.setHint(LocaleController.getString(R.string.AddMutual));
            return;
        }
        if (this.R || ((d70Var = this.v) != null && d70Var.G == 0)) {
            h2Var.setHint(LocaleController.getString(R.string.SearchForPeople));
            return;
        }
        if (this.O || this.P) {
            h2Var.setHint(LocaleController.getString(R.string.SearchForPeopleAndGroups));
        } else if (this.Q) {
            h2Var.setHint(LocaleController.getString(R.string.NewCallSearch));
        } else {
            h2Var.setHint(LocaleController.getString(R.string.SendMessageTo));
        }
    }

    public final void s0() {
        boolean z10 = this.O;
        int i10 = this.M;
        boolean z11 = this.R;
        if (!z10 && !this.P && !z11) {
            if (i10 == 2) {
                this.actionBar.setSubtitle(LocaleController.formatPluralString("Members", this.Z.m(), new Object[0]));
            } else {
                boolean i11 = this.Z.i();
                int i12 = this.K;
                if (i11) {
                    this.actionBar.setSubtitle(LocaleController.formatString(R.string.MembersCountZero, LocaleController.formatPluralString("Members", i12 + (this.Q ? 1 : 0), new Object[0])));
                } else {
                    this.actionBar.setSubtitle(String.format(LocaleController.getPluralString("MembersCountSelected", this.Z.m()), Integer.valueOf(this.Z.m()), Integer.valueOf(i12)));
                }
            }
        }
        if (i10 == 2 || !z11) {
            return;
        }
        if (this.E && this.a0.isEmpty()) {
            this.y.e(false, true);
            this.E = false;
        } else {
            if (this.E || this.a0.isEmpty()) {
                return;
            }
            this.y.e(true, true);
            this.E = true;
        }
    }

    @Override // qh.d
    public final /* synthetic */ void J() {
    }

    public void n0(HashSet hashSet) {
    }

    @Override // qh.d
    public final /* synthetic */ void s() {
    }

    @Override // le.d
    public final /* synthetic */ void z(float f7, int i10) {
    }
}
