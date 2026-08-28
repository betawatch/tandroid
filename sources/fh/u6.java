package fh;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.oa;
import gh.v7;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class u6 extends sa implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean T;
    public final int U;
    public final long V;
    public final boolean W;
    public final boolean X;
    public final TL_stars.StarGift Y;
    public GiftAuctionController.Auction Z;
    public final zf.k a0;
    public final String b0;
    public final Runnable c0;
    public final o6 d0;
    public final LinearLayout e0;
    public final long f0;
    public final org.telegram.ui.Cells.w0 g0;
    public final TLRPC.MessageAction h0;
    public final MessageObject i0;
    public final kh.d j0;
    public final FrameLayout k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public final p6 o0;
    public z41 p0;
    public int q0;
    public final eq[] r0;
    public boolean s0;

    public u6(Context context, int i9, final TL_stars.StarGift starGift, final zf.k kVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, false, false, false, 2, null);
        float f10;
        boolean z12;
        Integer num;
        kg.f fVar;
        LinearLayout linearLayout;
        this.m0 = false;
        this.n0 = false;
        this.q0 = -2;
        new AnimationNotificationsLocker();
        this.r0 = new eq[1];
        this.s0 = false;
        boolean z13 = j10 == UserConfig.getInstance(i9).getClientUserId();
        this.T = z13;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-10.0f);
        if (z13) {
            this.l0 = true;
        }
        this.U = i9;
        this.V = j10;
        this.Y = starGift;
        if (starGift == null || !starGift.auction) {
            f10 = 4.0f;
        } else {
            f10 = 4.0f;
            this.Z = GiftAuctionController.getInstance(i9).subscribeToGiftAuction(starGift.id, this);
        }
        this.a0 = kVar;
        this.c0 = runnable;
        this.W = z10;
        this.X = z11;
        if (z10) {
            this.m0 = true;
        } else if (z11) {
            this.m0 = false;
        }
        this.v = 0.2f;
        if (j10 >= 0) {
            this.b0 = UserObject.getForcedFirstName(MessagesController.getInstance(i9).getUser(Long.valueOf(j10)));
            z12 = z13;
        } else {
            z12 = z13;
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
            this.b0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, this.resourcesProvider, false);
        this.g0 = w0Var;
        w0Var.setDelegate(new n6());
        o6 o6Var = new o6(this, context);
        this.d0 = o6Var;
        Drawable e10 = kh.r6.e(null, i9, j10, org.telegram.ui.ActionBar.f6.I.q());
        o6Var.V(e10);
        ng.c cVar = new ng.c();
        if (e10 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e10).getColor());
        } else {
            if (e10 instanceof jb0) {
                jb0 jb0Var = (jb0) e10;
                if (jb0Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = jb0Var.a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(org.telegram.ui.ActionBar.f6.h5));
        kg.f fVar2 = new kg.f(cVar);
        org.telegram.ui.ActionBar.b6 b6Var = this.resourcesProvider;
        int i10 = org.telegram.ui.ActionBar.f6.h5;
        fVar2.n(new lg.b(i10, b6Var));
        fVar2.p(AndroidUtilities.dp(20.0f));
        fVar2.o(AndroidUtilities.dp(f10));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e0 = linearLayout2;
        linearLayout2.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            fVar = fVar2;
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.h0 = tL_messageActionStarGift;
            linearLayout = linearLayout2;
        } else {
            fVar = fVar2;
            if (kVar == null || kVar.b == null) {
                linearLayout = linearLayout2;
                if (kVar == null || kVar.a == null) {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                tL_messageActionGiftPremium.months = kVar.d();
                tL_messageActionGiftPremium.currency = kVar.a();
                long e11 = kVar.e();
                tL_messageActionGiftPremium.amount = e11;
                if (kVar.h != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * e11);
                }
                tL_messageActionGiftPremium.flags |= 2;
                tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                this.h0 = tL_messageActionGiftPremium;
            } else {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = kVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = kVar.a();
                long e12 = kVar.e();
                tL_messageActionGiftCode.amount = e12;
                if (kVar.h != null) {
                    linearLayout = linearLayout2;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e12);
                } else {
                    linearLayout = linearLayout2;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.h0 = tL_messageActionGiftCode;
            }
        }
        TLRPC.MessageAction messageAction = this.h0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z14 = this.m0;
            tL_messageActionStarGift2.can_upgrade = z14 || (z12 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z12 && z14) ? starGift.upgrade_stars : 0L;
            tL_messageActionStarGift2.convert_stars = z14 ? 0L : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = MessagesController.getInstance(i9).getPeer(UserConfig.getInstance(i9).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i9).getPeer(j10);
        tL_messageService.action = this.h0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i9).getSendPaidMessagesStars(j10) : 0L;
        this.f0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i9, tL_messageService, false, false);
        this.i0 = messageObject;
        w0Var.T(messageObject, true);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(w0Var, g7.e6.t(-1, -1, 119, 0, sendPaidMessagesStars > 0 ? 0 : 8, 0, 8));
        o6Var.addView(linearLayout3, g7.e6.e(-1, -1, 119));
        p6 p6Var = new p6(this, context, (xu0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i9).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i9);
        this.o0 = p6Var;
        org.telegram.ui.Cells.d3 d3Var = p6Var.b;
        d3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.i3());
        d3Var.M = true;
        p6Var.setShowLimitWhenNear(50);
        this.L = d3Var;
        p6Var.setShowLimitOnFocus(true);
        p6Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(p6Var, 3);
        d3Var.getEditText().setImeOptions(6);
        d3Var.getEditText().setOnEditorActionListener(new m.u2(gVar, 1));
        int i11 = this.backgroundPaddingLeft;
        p6Var.setPadding(i11, 0, i11, 0);
        q6 q6Var = new q6();
        q6Var.C = false;
        q6Var.m = false;
        q6Var.n(350L);
        q6Var.o(gr.h);
        q6Var.D = 40L;
        this.d.setItemAnimator(q6Var);
        this.p0.N(false);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout4.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, this.resourcesProvider));
        int i12 = this.backgroundPaddingLeft;
        linearLayout4.setPadding(i12, 0, i12, 0);
        this.containerView.addView(linearLayout4, g7.e6.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(g7.e6.z(-1.0f), g7.e6.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout4.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.a7, this.resourcesProvider)));
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout4.addView(frameLayout, g7.e6.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.k0 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.k0 = frameLayout2;
            frameLayout2.addView(frameLayout, g7.e6.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i10, this.resourcesProvider));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.f6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView, g7.e6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        g10.setTextSize(1, 13.0f);
        g10.setGravity(21);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.resourcesProvider));
        if (starGift != null) {
            g10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(g10, g7.e6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View r6Var = new r6(context, starGift, clamp);
        r6Var.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(6.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider)));
        frameLayout.addView(r6Var, g7.e6.e(-1, -1, 119));
        s6 s6Var = new s6(context, clamp);
        s6Var.setWillNotDraw(false);
        frameLayout.addView(s6Var, g7.e6.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        s6Var.addView(textView2, g7.e6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        s6Var.addView(textView3, g7.e6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        kh.d dVar = new kh.d(context, this.resourcesProvider, true);
        this.j0 = dVar;
        dVar.e();
        Y(false);
        linearLayout4.addView(dVar, g7.e6.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new z(this, j10, context, runnable, starGift));
        of.y yVar = this.c;
        this.M = true;
        yVar.k1(true);
        this.p0.N(false);
        this.c.h1(this.p0.x.size(), AndroidUtilities.dp(200.0f));
        wk0 wk0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.k0 == null) ? 40 : 0)));
        this.d.i(new t6(this));
        this.d.setOnItemClickListener(new mk0() { // from class: fh.m6
            @Override // org.telegram.ui.Components.mk0
            public final void a(int i15, View view2) {
                TL_stars.StarGift starGift2;
                u6 u6Var = u6.this;
                TL_stars.StarGift starGift3 = u6Var.Y;
                boolean z15 = u6Var.T;
                org.telegram.ui.Cells.w0 w0Var2 = u6Var.g0;
                TLRPC.MessageAction messageAction2 = u6Var.h0;
                MessageObject messageObject2 = u6Var.i0;
                z41 z41Var = u6Var.p0;
                if (!u6Var.M) {
                    i15--;
                }
                l41 G = z41Var.G(i15);
                if (G == null) {
                    return;
                }
                int i16 = G.d;
                if (i16 == 1) {
                    boolean z16 = !u6Var.l0;
                    u6Var.l0 = z16;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z16;
                    }
                    messageObject2.updateMessageText();
                    w0Var2.T(messageObject2, true);
                    u6Var.p0.N(true);
                    return;
                }
                if (i16 == 2) {
                    if (z10 || z11) {
                        int i17 = -u6Var.q0;
                        u6Var.q0 = i17;
                        AndroidUtilities.shakeViewSpring(view2, i17);
                        return;
                    }
                    boolean z17 = u6Var.m0;
                    u6Var.m0 = !z17;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z17 || (z15 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z15 || z17) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z17 ? starGift3.convert_stars : 0L;
                    }
                    messageObject2.updateMessageText();
                    w0Var2.T(messageObject2, true);
                    u6Var.p0.N(true);
                    u6Var.Y(true);
                    return;
                }
                if (i16 == 3) {
                    boolean z18 = u6Var.n0;
                    u6Var.n0 = !z18;
                    boolean z19 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    zf.k kVar2 = kVar;
                    if (z19) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z18) {
                            tL_messageActionGiftPremium2.currency = kVar2.a();
                            long e13 = kVar2.e();
                            tL_messageActionGiftPremium2.amount = e13;
                            if (kVar2.h != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e13);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            tL_messageActionGiftPremium2.amount = kVar2.g();
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z18) {
                            tL_messageActionGiftCode2.currency = kVar2.a();
                            long e14 = kVar2.e();
                            tL_messageActionGiftCode2.amount = e14;
                            if (kVar2.h != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e14);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            tL_messageActionGiftCode2.amount = kVar2.g();
                        }
                    }
                    messageObject2.updateMessageText();
                    w0Var2.T(messageObject2, true);
                    u6Var.p0.N(true);
                    u6Var.Y(true);
                }
            }
        });
        this.e.setTitle(y());
    }

    public static void O(u6 u6Var, TLRPC.User user, Boolean bool, String str) {
        int i9 = 1;
        if (bool.booleanValue()) {
            Runnable runnable = u6Var.c0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(u6Var.o0);
            u6Var.dismiss();
            AndroidUtilities.runOnUIThread(new l6(i9, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, new oc(u6Var.topBulletinContainer, u6Var.resourcesProvider), R.raw.error, 36);
        }
        u6Var.j0.setLoading(false);
    }

    public static void P(u6 u6Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = u6Var.c0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(u6Var.o0);
            u6Var.dismiss();
            AndroidUtilities.runOnUIThread(new l6(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, new oc(u6Var.topBulletinContainer, u6Var.resourcesProvider), R.raw.error, 36);
        }
        u6Var.j0.setLoading(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void R(final u6 u6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        TLObject tLObject;
        int i9 = u6Var.U;
        p6 p6Var = u6Var.o0;
        kh.d dVar = u6Var.j0;
        if (dVar.J) {
            return;
        }
        int i10 = 5;
        if (u6Var.Z != null) {
            x xVar = new x(context, u6Var.resourcesProvider, new w(j10, u6Var.l0, u6Var.V()), u6Var.Z);
            xVar.show();
            xVar.j0 = runnable;
            AndroidUtilities.hideKeyboard(p6Var);
            u6Var.dismiss();
            if (u6Var.s0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new j6(u6Var, i10), 500L);
            return;
        }
        final int i11 = 1;
        dVar.setLoading(true);
        org.telegram.ui.Cells.d3 d3Var = p6Var.b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var.k(true);
        } else if (d3Var.v) {
            d3Var.d();
        }
        final int i12 = 0;
        if (starGift != null) {
            v7.y(i9, false).i(u6Var.Y, u6Var.l0, u6Var.m0, u6Var.V, u6Var.V(), new h6(u6Var, i11));
            return;
        }
        zf.k kVar = u6Var.a0;
        final TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(u6Var.V));
        if (user == null) {
            dVar.setLoading(false);
            return;
        }
        if (u6Var.n0) {
            tLObject = kVar.c;
            TLObject tLObject2 = kVar.d;
            if (tLObject != null || tLObject2 != null) {
                if (tLObject == null) {
                    tLObject = tLObject2 != null ? tLObject2 : null;
                }
                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                        v7.y(i9, false).g(u6Var.V, tL_premiumGiftCodeOption, u6Var.V(), new Utilities.Callback2(u6Var) { // from class: fh.i6
                            public final /* synthetic */ u6 b;

                            {
                                this.b = u6Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i11) {
                                    case 0:
                                        u6.O(this.b, user, bool, str);
                                        break;
                                    default:
                                        u6.P(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    } else {
                        bg.u0.k(new ArrayList(Arrays.asList(user)), tL_premiumGiftCodeOption, null, u6Var.V(), new bg.i1(u6Var, i11), new f1(3, u6Var, user), new bg.i(u6Var, 10));
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                    TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                        v7.y(i9, false).g(u6Var.V, tL_premiumGiftOption, u6Var.V(), new Utilities.Callback2(u6Var) { // from class: fh.i6
                            public final /* synthetic */ u6 b;

                            {
                                this.b = u6Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i12) {
                                    case 0:
                                        u6.O(this.b, user, bool, str);
                                        break;
                                    default:
                                        u6.P(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (BuildVars.useInvoiceBilling()) {
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                            if (parse.getHost().equals("t.me")) {
                                if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                    launchActivity.U0 = new j6(u6Var, i12);
                                } else {
                                    launchActivity.T0 = true;
                                }
                            }
                            ve.e.s(launchActivity, kVar.a.bot_url);
                            u6Var.dismiss();
                            return;
                        }
                        return;
                    }
                    if (!BillingController.getInstance().isReady() || kVar.h == null) {
                        return;
                    }
                    TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                    tL_inputStorePaymentGiftPremium.user_id = MessagesController.getInstance(i9).getInputUser(user);
                    tL_inputStorePaymentGiftPremium.currency = kVar.h.a().c;
                    tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentGiftPremium.currency)) * (r4.b / Math.pow(10.0d, 6.0d)));
                    BillingController.getInstance().addResultListener(kVar.a.store_product, new k6(u6Var, i12));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                    ConnectionsManager.getInstance(i9).sendRequest(tL_payments_canPurchaseStore, new bg.b0(u6Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, i10));
                    return;
                }
                return;
            }
        }
        tLObject = kVar.b;
        if (tLObject == null && (tLObject = kVar.a) == null) {
            dVar.setLoading(false);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
        }
    }

    public static void T(u6 u6Var) {
        new gh.k5(u6Var.getContext(), u6Var.U, u6Var.V, u6Var.resourcesProvider, null).V1(u6Var.Y.id, u6Var.b0);
    }

    public final TLRPC.TL_textWithEntities V() {
        if (MessagesController.getInstance(this.U).getSendPaidMessagesStars(this.V) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.h0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            return ((TLRPC.TL_messageActionStarGift) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            return ((TLRPC.TL_messageActionGiftCode) messageAction).message;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            return ((TLRPC.TL_messageActionGiftPremium) messageAction).message;
        }
        return null;
    }

    public oc W() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return oc.a0(U);
    }

    public final void X(boolean z10) {
        int i9 = this.U;
        MessagesController messagesController = MessagesController.getInstance(i9);
        long j10 = this.V;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        TLObject userOrChat = MessagesController.getInstance(i9).getUserOrChat(j10);
        int i10 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i9).putUser(user, true);
            NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        if (o2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) o2Var.getParentActivity()).O().getFragmentStack());
            org.telegram.ui.ActionBar.b5 parentLayout = o2Var.getParentLayout();
            int size = arrayList.size();
            qn qnVar = null;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                if (o2Var2 instanceof qn) {
                    qnVar = (qn) o2Var2;
                    if (qnVar.a() != j10) {
                        o2Var2.removeSelfFromStack();
                    }
                } else if (o2Var2 instanceof ProfileActivity) {
                    if (z10 && parentLayout.getLastFragment() == o2Var2) {
                        o2Var2.finishFragment();
                    } else {
                        o2Var2.removeSelfFromStack();
                    }
                }
            }
            if (qnVar == null || qnVar.a() != j10) {
                ((ActionBarLayout) parentLayout).Q(new qn(e2.c.g(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Y(boolean z10) {
        GiftAuctionController.Auction auction = this.Z;
        int i9 = this.U;
        kh.d dVar = this.j0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i9).getCurrentTime();
            if (this.Z.isUpcoming(currentTime)) {
                int i10 = this.Z.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i10)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.Z.auctionStateActive;
            if (tL_starGiftAuctionState == null) {
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(null, z10);
                return;
            } else {
                int i11 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i11)), z10);
                return;
            }
        }
        TL_stars.StarGift starGift = this.Y;
        eq[] eqVarArr = this.r0;
        if (starGift != null) {
            long j10 = v7.y(i9, false).p().amount;
            long j11 = starGift.stars + (this.m0 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.o0.getText()) ? 0L : this.f0);
            dVar.g(oa.V0(false, LocaleController.formatPluralStringComma(this.T ? "Gift2SendSelf" : "Gift2Send", (int) j11), eqVarArr), z10, true);
            if (!v7.y(i9, false).e || j11 <= j10) {
                dVar.f(null, z10);
                return;
            } else {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j10), z10);
                return;
            }
        }
        zf.k kVar = this.a0;
        if (kVar != null) {
            if (this.n0) {
                dVar.g(oa.R0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(kVar.g(), ',')), 1.0f, eqVarArr), z10, true);
                eqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, kVar.c())), z10, true);
            }
            dVar.f(null, z10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starBalanceUpdated) {
            Y(true);
            z41 z41Var = this.p0;
            if (z41Var == null || this.a0 == null) {
                return;
            }
            z41Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        p6 p6Var = this.o0;
        org.telegram.ui.Cells.d3 d3Var = p6Var.b;
        org.telegram.ui.Cells.d3 d3Var2 = p6Var.b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var2.k(true);
            return;
        }
        if (d3Var2.v) {
            d3Var2.d();
            return;
        }
        d3Var2.r();
        if (this.Z != null) {
            GiftAuctionController.getInstance(this.U).unsubscribeFromGiftAuction(this.Z.giftId, this);
        }
        this.s0 = true;
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.U).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        p6 p6Var = this.o0;
        org.telegram.ui.Cells.d3 d3Var = p6Var.b;
        org.telegram.ui.Cells.d3 d3Var2 = p6Var.b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var2.k(true);
        } else if (d3Var2.v) {
            d3Var2.d();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.U).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.d.a0();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.Z = auction;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        p6 p6Var = this.o0;
        if (p6Var != null) {
            p6Var.b.s();
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.U, 0, true, new h6(this, 0), this.resourcesProvider);
        this.p0 = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(this.T ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }
}
