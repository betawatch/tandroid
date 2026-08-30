package kh;

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
import java.util.ArrayList;
import java.util.Arrays;
import lh.ja;
import lh.t7;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class e6 extends sa implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean U;
    public final int V;
    public final long W;
    public final boolean X;
    public final boolean Y;
    public final TL_stars.StarGift Z;
    public GiftAuctionController.Auction a0;
    public final eg.n b0;
    public final String c0;
    public final Runnable d0;
    public final y5 e0;
    public final LinearLayout f0;
    public final long g0;
    public final org.telegram.ui.Cells.v0 h0;
    public final TLRPC.MessageAction i0;
    public final MessageObject j0;
    public final ph.d k0;
    public final FrameLayout l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public final z5 p0;
    public w51 q0;
    public int r0;
    public final mq[] s0;
    public boolean t0;

    public e6(Context context, int i10, final TL_stars.StarGift starGift, final eg.n nVar, long j10, Runnable runnable, final boolean z4, final boolean z10) {
        super(context, null, true, false, false, false, false, 2, null);
        float f10;
        boolean z11;
        Integer num;
        pg.d dVar;
        LinearLayout linearLayout;
        this.n0 = false;
        this.o0 = false;
        this.r0 = -2;
        new AnimationNotificationsLocker();
        this.s0 = new mq[1];
        this.t0 = false;
        boolean z12 = j10 == UserConfig.getInstance(i10).getClientUserId();
        this.U = z12;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.F = AndroidUtilities.dp(4.0f);
        this.G = AndroidUtilities.dp(-10.0f);
        if (z12) {
            this.m0 = true;
        }
        this.V = i10;
        this.W = j10;
        this.Z = starGift;
        if (starGift == null || !starGift.auction) {
            f10 = 4.0f;
        } else {
            f10 = 4.0f;
            this.a0 = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.id, this);
        }
        this.b0 = nVar;
        this.d0 = runnable;
        this.X = z4;
        this.Y = z10;
        if (z4) {
            this.n0 = true;
        } else if (z10) {
            this.n0 = false;
        }
        this.v = 0.2f;
        if (j10 >= 0) {
            this.c0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
            z11 = z12;
        } else {
            z11 = z12;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.c0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, this.resourcesProvider, false);
        this.h0 = v0Var;
        v0Var.setDelegate(new x5());
        y5 y5Var = new y5(this, context);
        this.e0 = y5Var;
        Drawable e = ph.l5.e(null, i10, j10, j6.I.q());
        y5Var.V(e);
        sg.c cVar = new sg.c();
        if (e instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e).getColor());
        } else {
            if (e instanceof dc0) {
                dc0 dc0Var = (dc0) e;
                if (dc0Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = dc0Var.a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(j6.h5));
        pg.d dVar2 = new pg.d(cVar);
        org.telegram.ui.ActionBar.f6 f6Var = this.resourcesProvider;
        int i11 = j6.h5;
        dVar2.n(new qg.b(i11, f6Var));
        dVar2.p(AndroidUtilities.dp(20.0f));
        dVar2.o(AndroidUtilities.dp(f10));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f0 = linearLayout2;
        linearLayout2.setOrientation(1);
        if (starGift != null) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = new TLRPC.TL_messageActionStarGift();
            tL_messageActionStarGift.gift = starGift;
            tL_messageActionStarGift.flags |= 2;
            tL_messageActionStarGift.message = new TLRPC.TL_textWithEntities();
            dVar = dVar2;
            tL_messageActionStarGift.convert_stars = starGift.convert_stars;
            tL_messageActionStarGift.forceIn = true;
            this.i0 = tL_messageActionStarGift;
            linearLayout = linearLayout2;
        } else {
            dVar = dVar2;
            if (nVar == null || nVar.b == null) {
                linearLayout = linearLayout2;
                if (nVar == null || nVar.a == null) {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                tL_messageActionGiftPremium.months = nVar.d();
                tL_messageActionGiftPremium.currency = nVar.a();
                long e6 = nVar.e();
                tL_messageActionGiftPremium.amount = e6;
                if (nVar.h != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * e6);
                }
                tL_messageActionGiftPremium.flags |= 2;
                tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                this.i0 = tL_messageActionGiftPremium;
            } else {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = nVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = nVar.a();
                long e10 = nVar.e();
                tL_messageActionGiftCode.amount = e10;
                if (nVar.h != null) {
                    linearLayout = linearLayout2;
                    tL_messageActionGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode.currency) - 6) * e10);
                } else {
                    linearLayout = linearLayout2;
                }
                tL_messageActionGiftCode.flags |= 16;
                tL_messageActionGiftCode.message = new TLRPC.TL_textWithEntities();
                this.i0 = tL_messageActionGiftCode;
            }
        }
        TLRPC.MessageAction messageAction = this.i0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction;
            boolean z13 = this.n0;
            tL_messageActionStarGift2.can_upgrade = z13 || (z11 && starGift != null && starGift.can_upgrade);
            tL_messageActionStarGift2.upgrade_stars = (!z11 && z13) ? starGift.upgrade_stars : 0L;
            tL_messageActionStarGift2.convert_stars = z13 ? 0L : starGift.convert_stars;
        }
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        tL_messageService.id = 1;
        tL_messageService.dialog_id = j10;
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j10);
        tL_messageService.action = this.i0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i10).getSendPaidMessagesStars(j10) : 0L;
        this.g0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.j0 = messageObject;
        v0Var.U(messageObject, true);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(v0Var, k7.b6.t(-1, -1, 119, 0, sendPaidMessagesStars > 0 ? 0 : 8, 0, 8));
        y5Var.addView(linearLayout3, k7.b6.e(-1, -1, 119));
        z5 z5Var = new z5(this, context, (qv0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, dVar, i10);
        this.p0 = z5Var;
        org.telegram.ui.Cells.d3 d3Var = z5Var.b;
        d3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.h3());
        d3Var.N = true;
        z5Var.setShowLimitWhenNear(50);
        this.M = d3Var;
        z5Var.setShowLimitOnFocus(true);
        z5Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(z5Var, 3);
        d3Var.getEditText().setImeOptions(6);
        d3Var.getEditText().setOnEditorActionListener(new m.u2(gVar, 1));
        int i12 = this.backgroundPaddingLeft;
        z5Var.setPadding(i12, 0, i12, 0);
        a6 a6Var = new a6();
        a6Var.C = false;
        a6Var.m = false;
        a6Var.n(350L);
        a6Var.o(nr.h);
        a6Var.D = 40L;
        this.d.setItemAnimator(a6Var);
        this.q0.N(false);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout4.setBackgroundColor(j6.v0(i11, this.resourcesProvider));
        int i13 = this.backgroundPaddingLeft;
        linearLayout4.setPadding(i13, 0, i13, 0);
        this.containerView.addView(linearLayout4, k7.b6.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(j6.v0(j6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(k7.b6.z(-1.0f), k7.b6.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout4.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(j6.b0(AndroidUtilities.dp(6.0f), j6.v0(j6.a7, this.resourcesProvider)));
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout4.addView(frameLayout, k7.b6.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.l0 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.l0 = frameLayout2;
            frameLayout2.addView(frameLayout, k7.b6.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(j6.v0(i11, this.resourcesProvider));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i14 = j6.G6;
        textView.setTextColor(j6.v0(i14, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView i15 = yh.i(frameLayout, textView, k7.b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        i15.setTextSize(1, 13.0f);
        i15.setGravity(21);
        i15.setTypeface(AndroidUtilities.bold());
        i15.setTextColor(j6.v0(i14, this.resourcesProvider));
        if (starGift != null) {
            i15.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(i15, k7.b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View b6Var = new b6(context, starGift, clamp);
        b6Var.setBackground(j6.b0(AndroidUtilities.dp(6.0f), j6.v0(j6.Oh, this.resourcesProvider)));
        frameLayout.addView(b6Var, k7.b6.e(-1, -1, 119));
        c6 c6Var = new c6(context, clamp);
        c6Var.setWillNotDraw(false);
        frameLayout.addView(c6Var, k7.b6.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        c6Var.addView(textView2, k7.b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        c6Var.addView(textView3, k7.b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        ph.d dVar3 = new ph.d(context, this.resourcesProvider, true);
        this.k0 = dVar3;
        dVar3.e();
        Z(false);
        linearLayout4.addView(dVar3, k7.b6.t(-1, 48, 119, 10, 10, 10, 10));
        dVar3.setOnClickListener(new u(this, j10, context, runnable, starGift));
        org.telegram.ui.k kVar = this.c;
        this.N = true;
        kVar.k1(true);
        this.q0.N(false);
        this.c.h1(this.q0.x.size(), AndroidUtilities.dp(200.0f));
        sl0 sl0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.l0 == null) ? 40 : 0)));
        this.d.i(new d6(this));
        this.d.setOnItemClickListener(new il0() { // from class: kh.w5
            @Override // org.telegram.ui.Components.il0
            public final void f(int i17, View view2) {
                TL_stars.StarGift starGift2;
                e6 e6Var = e6.this;
                TL_stars.StarGift starGift3 = e6Var.Z;
                boolean z14 = e6Var.U;
                org.telegram.ui.Cells.v0 v0Var2 = e6Var.h0;
                TLRPC.MessageAction messageAction2 = e6Var.i0;
                MessageObject messageObject2 = e6Var.j0;
                w51 w51Var = e6Var.q0;
                if (!e6Var.N) {
                    i17--;
                }
                i51 G = w51Var.G(i17);
                if (G == null) {
                    return;
                }
                int i18 = G.d;
                if (i18 == 1) {
                    boolean z15 = !e6Var.m0;
                    e6Var.m0 = z15;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z15;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.U(messageObject2, true);
                    e6Var.q0.N(true);
                    return;
                }
                if (i18 == 2) {
                    if (z4 || z10) {
                        int i19 = -e6Var.r0;
                        e6Var.r0 = i19;
                        AndroidUtilities.shakeViewSpring(view2, i19);
                        return;
                    }
                    boolean z16 = e6Var.n0;
                    e6Var.n0 = !z16;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z16 || (z14 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z14 || z16) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z16 ? starGift3.convert_stars : 0L;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.U(messageObject2, true);
                    e6Var.q0.N(true);
                    e6Var.Z(true);
                    return;
                }
                if (i18 == 3) {
                    boolean z17 = e6Var.o0;
                    e6Var.o0 = !z17;
                    boolean z18 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    eg.n nVar2 = nVar;
                    if (z18) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z17) {
                            tL_messageActionGiftPremium2.currency = nVar2.a();
                            long e11 = nVar2.e();
                            tL_messageActionGiftPremium2.amount = e11;
                            if (nVar2.h != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e11);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            tL_messageActionGiftPremium2.amount = nVar2.g();
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z17) {
                            tL_messageActionGiftCode2.currency = nVar2.a();
                            long e12 = nVar2.e();
                            tL_messageActionGiftCode2.amount = e12;
                            if (nVar2.h != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e12);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            tL_messageActionGiftCode2.amount = nVar2.g();
                        }
                    }
                    messageObject2.updateMessageText();
                    v0Var2.U(messageObject2, true);
                    e6Var.q0.N(true);
                    e6Var.Z(true);
                }
            }
        });
        this.e.setTitle(y());
    }

    public static void P(e6 e6Var, TLRPC.User user, Boolean bool, String str) {
        int i10 = 1;
        if (bool.booleanValue()) {
            Runnable runnable = e6Var.d0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(e6Var.p0);
            e6Var.dismiss();
            AndroidUtilities.runOnUIThread(new v5(i10, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            yh.s(R.string.UnknownErrorCode, new Object[]{str}, new qc(e6Var.topBulletinContainer, e6Var.resourcesProvider), R.raw.error, 36);
        }
        e6Var.k0.setLoading(false);
    }

    public static void Q(e6 e6Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = e6Var.d0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(e6Var.p0);
            e6Var.dismiss();
            AndroidUtilities.runOnUIThread(new v5(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            yh.s(R.string.UnknownErrorCode, new Object[]{str}, new qc(e6Var.topBulletinContainer, e6Var.resourcesProvider), R.raw.error, 36);
        }
        e6Var.k0.setLoading(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void S(final e6 e6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        TLObject tLObject;
        int i10 = e6Var.V;
        z5 z5Var = e6Var.p0;
        ph.d dVar = e6Var.k0;
        if (dVar.K) {
            return;
        }
        int i11 = 5;
        if (e6Var.a0 != null) {
            s sVar = new s(context, e6Var.resourcesProvider, new r(j10, e6Var.m0, e6Var.W()), e6Var.a0);
            sVar.show();
            sVar.k0 = runnable;
            AndroidUtilities.hideKeyboard(z5Var);
            e6Var.dismiss();
            if (e6Var.t0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new u5(e6Var, i11), 500L);
            return;
        }
        final int i12 = 1;
        dVar.setLoading(true);
        org.telegram.ui.Cells.d3 d3Var = z5Var.b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var.k(true);
        } else if (d3Var.v) {
            d3Var.d();
        }
        final int i13 = 0;
        if (starGift != null) {
            t7.y(i10, false).i(e6Var.Z, e6Var.m0, e6Var.n0, e6Var.W, e6Var.W(), new s5(e6Var, i12));
            return;
        }
        eg.n nVar = e6Var.b0;
        final TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(e6Var.W));
        if (user == null) {
            dVar.setLoading(false);
            return;
        }
        if (e6Var.o0) {
            tLObject = nVar.c;
            TLObject tLObject2 = nVar.d;
            if (tLObject != null || tLObject2 != null) {
                if (tLObject == null) {
                    tLObject = tLObject2 != null ? tLObject2 : null;
                }
                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                        t7.y(i10, false).g(e6Var.W, tL_premiumGiftCodeOption, e6Var.W(), new Utilities.Callback2(e6Var) { // from class: kh.t5
                            public final /* synthetic */ e6 b;

                            {
                                this.b = e6Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i12) {
                                    case 0:
                                        e6.P(this.b, user, bool, str);
                                        break;
                                    default:
                                        e6.Q(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    } else {
                        gg.p0.k(new ArrayList(Arrays.asList(user)), tL_premiumGiftCodeOption, null, e6Var.W(), new eg.y1(e6Var, 2), new a1(3, e6Var, user), new cg.h0(e6Var, 17));
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                    TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                        t7.y(i10, false).g(e6Var.W, tL_premiumGiftOption, e6Var.W(), new Utilities.Callback2(e6Var) { // from class: kh.t5
                            public final /* synthetic */ e6 b;

                            {
                                this.b = e6Var;
                            }

                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj, Object obj2) {
                                Boolean bool = (Boolean) obj;
                                String str = (String) obj2;
                                switch (i13) {
                                    case 0:
                                        e6.P(this.b, user, bool, str);
                                        break;
                                    default:
                                        e6.Q(this.b, user, bool, str);
                                        break;
                                }
                            }
                        });
                        return;
                    }
                    if (BuildVars.useInvoiceBilling()) {
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                            if (parse.getHost().equals("t.me")) {
                                if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                    launchActivity.V0 = new u5(e6Var, i13);
                                } else {
                                    launchActivity.U0 = true;
                                }
                            }
                            af.g.s(launchActivity, nVar.a.bot_url);
                            e6Var.dismiss();
                            return;
                        }
                        return;
                    }
                    if (!BillingController.getInstance().isReady() || nVar.h == null) {
                        return;
                    }
                    TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                    tL_inputStorePaymentGiftPremium.user_id = MessagesController.getInstance(i10).getInputUser(user);
                    tL_inputStorePaymentGiftPremium.currency = nVar.h.a().c;
                    tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentGiftPremium.currency)) * (r3.b / Math.pow(10.0d, 6.0d)));
                    BillingController.getInstance().addResultListener(nVar.a.store_product, new cg.o(e6Var, i12));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new gg.y(e6Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, i11));
                    return;
                }
                return;
            }
        }
        tLObject = nVar.b;
        if (tLObject == null && (tLObject = nVar.a) == null) {
            dVar.setLoading(false);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
        }
    }

    public static void U(e6 e6Var) {
        new lh.g5(e6Var.getContext(), e6Var.V, e6Var.W, e6Var.resourcesProvider, null).V1(e6Var.Z.id, e6Var.c0);
    }

    public final TLRPC.TL_textWithEntities W() {
        if (MessagesController.getInstance(this.V).getSendPaidMessagesStars(this.W) > 0) {
            return null;
        }
        TLRPC.MessageAction messageAction = this.i0;
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

    public qc X() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return qc.a0(U);
    }

    public final void Y(boolean z4) {
        int i10 = this.V;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.W;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        int i11 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i10).putUser(user, true);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.n;
        if (p2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) p2Var.getParentActivity()).O().getFragmentStack());
            org.telegram.ui.ActionBar.e5 parentLayout = p2Var.getParentLayout();
            int size = arrayList.size();
            xn xnVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj;
                if (p2Var2 instanceof xn) {
                    xnVar = (xn) p2Var2;
                    if (xnVar.a() != j10) {
                        p2Var2.removeSelfFromStack();
                    }
                } else if (p2Var2 instanceof ProfileActivity) {
                    if (z4 && parentLayout.getLastFragment() == p2Var2) {
                        p2Var2.finishFragment();
                    } else {
                        p2Var2.removeSelfFromStack();
                    }
                }
            }
            if (xnVar == null || xnVar.a() != j10) {
                ((ActionBarLayout) parentLayout).Q(new xn(a2.g(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Z(boolean z4) {
        GiftAuctionController.Auction auction = this.a0;
        int i10 = this.V;
        ph.d dVar = this.k0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.a0.isUpcoming(currentTime)) {
                int i11 = this.a0.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z4, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z4);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.a0.auctionStateActive;
            if (tL_starGiftAuctionState == null) {
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z4, true);
                dVar.f(null, z4);
                return;
            } else {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z4, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i12)), z4);
                return;
            }
        }
        TL_stars.StarGift starGift = this.Z;
        mq[] mqVarArr = this.s0;
        if (starGift != null) {
            long j10 = t7.y(i10, false).p().amount;
            long j11 = starGift.stars + (this.n0 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.p0.getText()) ? 0L : this.g0);
            dVar.g(ja.V0(false, LocaleController.formatPluralStringComma(this.U ? "Gift2SendSelf" : "Gift2Send", (int) j11), mqVarArr), z4, true);
            if (!t7.y(i10, false).e || j11 <= j10) {
                dVar.f(null, z4);
                return;
            } else {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j10), z4);
                return;
            }
        }
        eg.n nVar = this.b0;
        if (nVar != null) {
            if (this.o0) {
                dVar.g(ja.R0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(nVar.g(), ',')), 1.0f, mqVarArr), z4, true);
                mqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, nVar.c())), z4, true);
            }
            dVar.f(null, z4);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            Z(true);
            w51 w51Var = this.q0;
            if (w51Var == null || this.b0 == null) {
                return;
            }
            w51Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        z5 z5Var = this.p0;
        org.telegram.ui.Cells.d3 d3Var = z5Var.b;
        org.telegram.ui.Cells.d3 d3Var2 = z5Var.b;
        if (d3Var.getEmojiPadding() > 0) {
            d3Var2.k(true);
            return;
        }
        if (d3Var2.v) {
            d3Var2.d();
            return;
        }
        d3Var2.r();
        if (this.a0 != null) {
            GiftAuctionController.getInstance(this.V).unsubscribeFromGiftAuction(this.a0.giftId, this);
        }
        this.t0 = true;
        super.dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.V).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void onBackPressed() {
        z5 z5Var = this.p0;
        org.telegram.ui.Cells.d3 d3Var = z5Var.b;
        org.telegram.ui.Cells.d3 d3Var2 = z5Var.b;
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
        NotificationCenter.getInstance(this.V).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.d.a0();
    }

    @Override // org.telegram.messenger.GiftAuctionController.OnAuctionUpdateListener
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.a0 = auction;
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        z5 z5Var = this.p0;
        if (z5Var != null) {
            z5Var.b.s();
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.V, 0, true, new s5(this, 0), this.resourcesProvider);
        this.q0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(this.U ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }
}
