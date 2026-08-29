package ih;

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
import jh.ia;
import jh.s7;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class e6 extends xa implements NotificationCenter.NotificationCenterDelegate, GiftAuctionController.OnAuctionUpdateListener {
    public final boolean T;
    public final int U;
    public final long V;
    public final boolean W;
    public final boolean X;
    public final TL_stars.StarGift Y;
    public GiftAuctionController.Auction Z;
    public final cg.n a0;
    public final String b0;
    public final Runnable c0;
    public final y5 d0;
    public final LinearLayout e0;
    public final long f0;
    public final org.telegram.ui.Cells.v0 g0;
    public final TLRPC.MessageAction h0;
    public final MessageObject i0;
    public final nh.d j0;
    public final FrameLayout k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public final z5 o0;
    public k51 p0;
    public int q0;
    public final iq[] r0;
    public boolean s0;

    public e6(Context context, int i10, final TL_stars.StarGift starGift, final cg.n nVar, long j10, Runnable runnable, final boolean z10, final boolean z11) {
        super(context, null, true, false, false, false, false, 2, null);
        float f9;
        boolean z12;
        Integer num;
        ng.f fVar;
        LinearLayout linearLayout;
        this.m0 = false;
        this.n0 = false;
        this.q0 = -2;
        new AnimationNotificationsLocker();
        this.r0 = new iq[1];
        this.s0 = false;
        boolean z13 = j10 == UserConfig.getInstance(i10).getClientUserId();
        this.T = z13;
        setImageReceiverNumLevel(0, 4);
        fixNavigationBar();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-10.0f);
        if (z13) {
            this.l0 = true;
        }
        this.U = i10;
        this.V = j10;
        this.Y = starGift;
        if (starGift == null || !starGift.auction) {
            f9 = 4.0f;
        } else {
            f9 = 4.0f;
            this.Z = GiftAuctionController.getInstance(i10).subscribeToGiftAuction(starGift.id, this);
        }
        this.a0 = nVar;
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
            this.b0 = UserObject.getForcedFirstName(MessagesController.getInstance(i10).getUser(Long.valueOf(j10)));
            z12 = z13;
        } else {
            z12 = z13;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.b0 = chat == null ? "" : chat.title;
        }
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, this.resourcesProvider, false);
        this.g0 = v0Var;
        v0Var.setDelegate(new x5());
        y5 y5Var = new y5(this, context);
        this.d0 = y5Var;
        Drawable e10 = nh.f6.e(null, i10, j10, g6.I.q());
        y5Var.V(e10);
        qg.c cVar = new qg.c();
        if (e10 instanceof ColorDrawable) {
            num = Integer.valueOf(((ColorDrawable) e10).getColor());
        } else {
            if (e10 instanceof yb0) {
                yb0 yb0Var = (yb0) e10;
                if (yb0Var.q < 0) {
                    num = -16777216;
                } else {
                    int[] iArr = yb0Var.a;
                    if (iArr != null && iArr.length > 0) {
                        num = Integer.valueOf(iArr[0]);
                    }
                }
            }
            num = null;
        }
        cVar.a(num != null ? num.intValue() : getThemedColor(g6.h5));
        ng.f fVar2 = new ng.f(cVar);
        org.telegram.ui.ActionBar.c6 c6Var = this.resourcesProvider;
        int i11 = g6.h5;
        fVar2.n(new og.b(i11, c6Var));
        fVar2.p(AndroidUtilities.dp(20.0f));
        fVar2.o(AndroidUtilities.dp(f9));
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
            if (nVar == null || nVar.b == null) {
                linearLayout = linearLayout2;
                if (nVar == null || nVar.a == null) {
                    throw new RuntimeException("SendGiftSheet with no star gift and no premium tier");
                }
                TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = new TLRPC.TL_messageActionGiftPremium();
                tL_messageActionGiftPremium.months = nVar.d();
                tL_messageActionGiftPremium.currency = nVar.a();
                long e11 = nVar.e();
                tL_messageActionGiftPremium.amount = e11;
                if (nVar.h != null) {
                    tL_messageActionGiftPremium.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium.currency) - 6) * e11);
                }
                tL_messageActionGiftPremium.flags |= 2;
                tL_messageActionGiftPremium.message = new TLRPC.TL_textWithEntities();
                this.h0 = tL_messageActionGiftPremium;
            } else {
                TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = new TLRPC.TL_messageActionGiftCode();
                tL_messageActionGiftCode.unclaimed = true;
                tL_messageActionGiftCode.via_giveaway = false;
                tL_messageActionGiftCode.months = nVar.d();
                tL_messageActionGiftCode.flags |= 4;
                tL_messageActionGiftCode.currency = nVar.a();
                long e12 = nVar.e();
                tL_messageActionGiftCode.amount = e12;
                if (nVar.h != null) {
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
        tL_messageService.from_id = MessagesController.getInstance(i10).getPeer(UserConfig.getInstance(i10).getClientUserId());
        tL_messageService.peer_id = MessagesController.getInstance(i10).getPeer(j10);
        tL_messageService.action = this.h0;
        long sendPaidMessagesStars = starGift != null ? MessagesController.getInstance(i10).getSendPaidMessagesStars(j10) : 0L;
        this.f0 = sendPaidMessagesStars;
        MessageObject messageObject = new MessageObject(i10, tL_messageService, false, false);
        this.i0 = messageObject;
        v0Var.U(messageObject, true);
        LinearLayout linearLayout3 = linearLayout;
        linearLayout3.addView(v0Var, i7.f6.t(-1, -1, 119, 0, sendPaidMessagesStars > 0 ? 0 : 8, 0, 8));
        y5Var.addView(linearLayout3, i7.f6.e(-1, -1, 119));
        z5 z5Var = new z5(this, context, (hv0) this.containerView, LocaleController.getString(starGift != null ? R.string.Gift2Message : R.string.Gift2MessageOptional), MessagesController.getInstance(i10).stargiftsMessageLengthMax, this.resourcesProvider, fVar, i10);
        this.o0 = z5Var;
        org.telegram.ui.Cells.b3 b3Var = z5Var.b;
        b3Var.getEditText().addTextChangedListener(new org.telegram.ui.Cells.f3());
        b3Var.M = true;
        z5Var.setShowLimitWhenNear(50);
        this.L = b3Var;
        z5Var.setShowLimitOnFocus(true);
        z5Var.setDivider(false);
        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(z5Var, 3);
        b3Var.getEditText().setImeOptions(6);
        b3Var.getEditText().setOnEditorActionListener(new m.u2(gVar, 1));
        int i12 = this.backgroundPaddingLeft;
        z5Var.setPadding(i12, 0, i12, 0);
        a6 a6Var = new a6();
        a6Var.C = false;
        a6Var.m = false;
        a6Var.n(350L);
        a6Var.o(jr.h);
        a6Var.D = 40L;
        this.d.setItemAnimator(a6Var);
        this.p0.N(false);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(1);
        linearLayout4.setBackgroundColor(g6.v0(i11, this.resourcesProvider));
        int i13 = this.backgroundPaddingLeft;
        linearLayout4.setPadding(i13, 0, i13, 0);
        this.containerView.addView(linearLayout4, i7.f6.e(-1, -2, 87));
        View view = new View(context);
        view.setBackgroundColor(g6.v0(g6.K5, this.resourcesProvider));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i7.f6.z(-1.0f), i7.f6.z(1.0f / AndroidUtilities.density));
        layoutParams.gravity = 55;
        linearLayout4.addView(view, layoutParams);
        float clamp = Utilities.clamp(starGift == null ? 0.0f : starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(g6.b0(AndroidUtilities.dp(6.0f), g6.v0(g6.a7, this.resourcesProvider)));
        if (starGift == null || !starGift.auction) {
            frameLayout.setVisibility((starGift == null || !starGift.limited) ? 8 : 0);
            linearLayout4.addView(frameLayout, i7.f6.k(10.0f, 10.0f, 10.0f, 0.0f, -1, 30));
            this.k0 = null;
        } else {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.k0 = frameLayout2;
            frameLayout2.addView(frameLayout, i7.f6.k(10.0f, 14.0f, 10.0f, 14.0f, -1, 30));
            frameLayout2.setBackgroundColor(g6.v0(i11, this.resourcesProvider));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 13.0f);
        textView.setGravity(19);
        textView.setTypeface(AndroidUtilities.bold());
        int i14 = g6.G6;
        textView.setTextColor(g6.v0(i14, this.resourcesProvider));
        if (starGift != null) {
            textView.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        TextView h = th.h(frameLayout, textView, i7.f6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        h.setTextSize(1, 13.0f);
        h.setGravity(21);
        h.setTypeface(AndroidUtilities.bold());
        h.setTextColor(g6.v0(i14, this.resourcesProvider));
        if (starGift != null) {
            h.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        frameLayout.addView(h, i7.f6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View b6Var = new b6(context, starGift, clamp);
        b6Var.setBackground(g6.b0(AndroidUtilities.dp(6.0f), g6.v0(g6.Oh, this.resourcesProvider)));
        frameLayout.addView(b6Var, i7.f6.e(-1, -1, 119));
        c6 c6Var2 = new c6(context, clamp);
        c6Var2.setWillNotDraw(false);
        frameLayout.addView(c6Var2, i7.f6.e(-1, -1, 119));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(19);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        if (starGift != null) {
            textView2.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        }
        c6Var2.addView(textView2, i7.f6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(21);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        if (starGift != null) {
            textView3.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        }
        c6Var2.addView(textView3, i7.f6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        nh.d dVar = new nh.d(context, this.resourcesProvider, true);
        this.j0 = dVar;
        dVar.e();
        Z(false);
        linearLayout4.addView(dVar, i7.f6.t(-1, 48, 119, 10, 10, 10, 10));
        dVar.setOnClickListener(new v(this, j10, context, runnable, starGift));
        org.telegram.ui.k kVar = this.c;
        this.M = true;
        kVar.k1(true);
        this.p0.N(false);
        this.c.h1(this.p0.x.size(), AndroidUtilities.dp(200.0f));
        jl0 jl0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(68 + ((starGift != null && starGift.limited && this.k0 == null) ? 40 : 0)));
        this.d.i(new d6(this));
        this.d.setOnItemClickListener(new zk0() { // from class: ih.w5
            @Override // org.telegram.ui.Components.zk0
            public final void c(int i16, View view2) {
                TL_stars.StarGift starGift2;
                e6 e6Var = e6.this;
                TL_stars.StarGift starGift3 = e6Var.Y;
                boolean z15 = e6Var.T;
                org.telegram.ui.Cells.v0 v0Var2 = e6Var.g0;
                TLRPC.MessageAction messageAction2 = e6Var.h0;
                MessageObject messageObject2 = e6Var.i0;
                k51 k51Var = e6Var.p0;
                if (!e6Var.M) {
                    i16--;
                }
                w41 G = k51Var.G(i16);
                if (G == null) {
                    return;
                }
                int i17 = G.d;
                if (i17 == 1) {
                    boolean z16 = !e6Var.l0;
                    e6Var.l0 = z16;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        ((TLRPC.TL_messageActionStarGift) messageAction2).name_hidden = z16;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.U(messageObject2, true);
                    e6Var.p0.N(true);
                    return;
                }
                if (i17 == 2) {
                    if (z10 || z11) {
                        int i18 = -e6Var.q0;
                        e6Var.q0 = i18;
                        AndroidUtilities.shakeViewSpring(view2, i18);
                        return;
                    }
                    boolean z17 = e6Var.m0;
                    e6Var.m0 = !z17;
                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift3 = (TLRPC.TL_messageActionStarGift) messageAction2;
                        tL_messageActionStarGift3.can_upgrade = !z17 || (z15 && (starGift2 = starGift) != null && starGift2.can_upgrade);
                        tL_messageActionStarGift3.upgrade_stars = (z15 || z17) ? 0L : starGift3.upgrade_stars;
                        tL_messageActionStarGift3.convert_stars = z17 ? starGift3.convert_stars : 0L;
                    }
                    messageObject2.updateMessageText();
                    v0Var2.U(messageObject2, true);
                    e6Var.p0.N(true);
                    e6Var.Z(true);
                    return;
                }
                if (i17 == 3) {
                    boolean z18 = e6Var.n0;
                    e6Var.n0 = !z18;
                    boolean z19 = messageAction2 instanceof TLRPC.TL_messageActionGiftPremium;
                    cg.n nVar2 = nVar;
                    if (z19) {
                        TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium2 = (TLRPC.TL_messageActionGiftPremium) messageAction2;
                        if (z18) {
                            tL_messageActionGiftPremium2.currency = nVar2.a();
                            long e13 = nVar2.e();
                            tL_messageActionGiftPremium2.amount = e13;
                            if (nVar2.h != null) {
                                tL_messageActionGiftPremium2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftPremium2.currency) - 6) * e13);
                            }
                        } else {
                            tL_messageActionGiftPremium2.currency = "XTR";
                            tL_messageActionGiftPremium2.amount = nVar2.g();
                        }
                    } else if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode2 = (TLRPC.TL_messageActionGiftCode) messageAction2;
                        if (z18) {
                            tL_messageActionGiftCode2.currency = nVar2.a();
                            long e14 = nVar2.e();
                            tL_messageActionGiftCode2.amount = e14;
                            if (nVar2.h != null) {
                                tL_messageActionGiftCode2.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_messageActionGiftCode2.currency) - 6) * e14);
                            }
                        } else {
                            tL_messageActionGiftCode2.currency = "XTR";
                            tL_messageActionGiftCode2.amount = nVar2.g();
                        }
                    }
                    messageObject2.updateMessageText();
                    v0Var2.U(messageObject2, true);
                    e6Var.p0.N(true);
                    e6Var.Z(true);
                }
            }
        });
        this.e.setTitle(y());
    }

    public static void P(e6 e6Var, TLRPC.User user, Boolean bool, String str) {
        int i10 = 1;
        if (bool.booleanValue()) {
            Runnable runnable = e6Var.c0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(e6Var.o0);
            e6Var.dismiss();
            AndroidUtilities.runOnUIThread(new v5(i10, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            th.r(R.string.UnknownErrorCode, new Object[]{str}, new tc(e6Var.topBulletinContainer, e6Var.resourcesProvider), R.raw.error, 36);
        }
        e6Var.j0.setLoading(false);
    }

    public static void Q(e6 e6Var, TLRPC.User user, Boolean bool, String str) {
        if (bool.booleanValue()) {
            Runnable runnable = e6Var.c0;
            if (runnable != null) {
                runnable.run();
            }
            AndroidUtilities.hideKeyboard(e6Var.o0);
            e6Var.dismiss();
            AndroidUtilities.runOnUIThread(new v5(2, user), 250L);
        } else if (!TextUtils.isEmpty(str)) {
            th.r(R.string.UnknownErrorCode, new Object[]{str}, new tc(e6Var.topBulletinContainer, e6Var.resourcesProvider), R.raw.error, 36);
        }
        e6Var.j0.setLoading(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void S(final e6 e6Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        TLObject tLObject;
        int i10 = e6Var.U;
        z5 z5Var = e6Var.o0;
        nh.d dVar = e6Var.j0;
        if (dVar.J) {
            return;
        }
        int i11 = 5;
        if (e6Var.Z != null) {
            t tVar = new t(context, e6Var.resourcesProvider, new s(j10, e6Var.l0, e6Var.W()), e6Var.Z);
            tVar.show();
            tVar.j0 = runnable;
            AndroidUtilities.hideKeyboard(z5Var);
            e6Var.dismiss();
            if (e6Var.s0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new u5(e6Var, i11), 500L);
            return;
        }
        final int i12 = 1;
        dVar.setLoading(true);
        org.telegram.ui.Cells.b3 b3Var = z5Var.b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var.k(true);
        } else if (b3Var.v) {
            b3Var.d();
        }
        final int i13 = 0;
        if (starGift != null) {
            s7.y(i10, false).i(e6Var.Y, e6Var.l0, e6Var.m0, e6Var.V, e6Var.W(), new s5(e6Var, i12));
            return;
        }
        cg.n nVar = e6Var.a0;
        final TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(e6Var.V));
        if (user == null) {
            dVar.setLoading(false);
            return;
        }
        if (e6Var.n0) {
            tLObject = nVar.c;
            TLObject tLObject2 = nVar.d;
            if (tLObject != null || tLObject2 != null) {
                if (tLObject == null) {
                    tLObject = tLObject2 != null ? tLObject2 : null;
                }
                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                        s7.y(i10, false).g(e6Var.V, tL_premiumGiftCodeOption, e6Var.W(), new Utilities.Callback2(e6Var) { // from class: ih.t5
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
                        eg.q0.k(new ArrayList(Arrays.asList(user)), tL_premiumGiftCodeOption, null, e6Var.W(), new cg.z1(e6Var, 2), new b1(3, e6Var, user), new ag.i0(e6Var, 17));
                        return;
                    }
                }
                if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                    TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                    if ("XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                        s7.y(i10, false).g(e6Var.V, tL_premiumGiftOption, e6Var.W(), new Utilities.Callback2(e6Var) { // from class: ih.t5
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
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                            if (parse.getHost().equals("t.me")) {
                                if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                    launchActivity.U0 = new u5(e6Var, i13);
                                } else {
                                    launchActivity.T0 = true;
                                }
                            }
                            ye.d.s(launchActivity, nVar.a.bot_url);
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
                    BillingController.getInstance().addResultListener(nVar.a.store_product, new ag.p(e6Var, i12));
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_payments_canPurchaseStore, new eg.z(e6Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, i11));
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
        new jh.h5(e6Var.getContext(), e6Var.U, e6Var.V, e6Var.resourcesProvider, null).V1(e6Var.Y.id, e6Var.b0);
    }

    public final TLRPC.TL_textWithEntities W() {
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

    public tc X() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return null;
        }
        return tc.a0(U);
    }

    public final void Y(boolean z10) {
        int i10 = this.U;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.V;
        TLRPC.UserFull userFull = messagesController.getUserFull(j10);
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j10);
        int i11 = 0;
        if (userFull != null && (userOrChat instanceof TLRPC.User)) {
            TLRPC.User user = (TLRPC.User) userOrChat;
            user.premium = true;
            MessagesController.getInstance(i10).putUser(user, true);
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(user.id), userFull);
        }
        org.telegram.ui.ActionBar.o2 o2Var = this.n;
        if (o2Var != null) {
            ArrayList arrayList = new ArrayList(((LaunchActivity) o2Var.getParentActivity()).O().getFragmentStack());
            org.telegram.ui.ActionBar.b5 parentLayout = o2Var.getParentLayout();
            int size = arrayList.size();
            tn tnVar = null;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj;
                if (o2Var2 instanceof tn) {
                    tnVar = (tn) o2Var2;
                    if (tnVar.a() != j10) {
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
            if (tnVar == null || tnVar.a() != j10) {
                ((ActionBarLayout) parentLayout).Q(new tn(j7.l1.g(j10, "user_id")), true);
            }
        }
        dismiss();
    }

    public final void Z(boolean z10) {
        GiftAuctionController.Auction auction = this.Z;
        int i10 = this.U;
        nh.d dVar = this.j0;
        if (auction != null) {
            int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
            if (this.Z.isUpcoming(currentTime)) {
                int i11 = this.Z.gift.auction_start_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(i11)), z10);
                return;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.Z.auctionStateActive;
            if (tL_starGiftAuctionState == null) {
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(null, z10);
                return;
            } else {
                int i12 = tL_starGiftAuctionState.end_date - currentTime;
                dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), z10, true);
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(i12)), z10);
                return;
            }
        }
        TL_stars.StarGift starGift = this.Y;
        iq[] iqVarArr = this.r0;
        if (starGift != null) {
            long j10 = s7.y(i10, false).p().amount;
            long j11 = starGift.stars + (this.m0 ? starGift.upgrade_stars : 0L) + (TextUtils.isEmpty(this.o0.getText()) ? 0L : this.f0);
            dVar.g(ia.V0(false, LocaleController.formatPluralStringComma(this.T ? "Gift2SendSelf" : "Gift2Send", (int) j11), iqVarArr), z10, true);
            if (!s7.y(i10, false).e || j11 <= j10) {
                dVar.f(null, z10);
                return;
            } else {
                dVar.f(LocaleController.formatPluralStringComma("Gift2SendYourBalance", (int) j10), z10);
                return;
            }
        }
        cg.n nVar = this.a0;
        if (nVar != null) {
            if (this.n0) {
                dVar.g(ia.R0(LocaleController.formatString(R.string.Gift2SendPremiumStars, LocaleController.formatNumber(nVar.g(), ',')), 1.0f, iqVarArr), z10, true);
                iqVarArr[0].spaceScaleX = 0.85f;
            } else {
                dVar.g(new SpannableStringBuilder(LocaleController.formatString(R.string.Gift2SendPremium, nVar.c())), z10, true);
            }
            dVar.f(null, z10);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starBalanceUpdated) {
            Z(true);
            k51 k51Var = this.p0;
            if (k51Var == null || this.a0 == null) {
                return;
            }
            k51Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        z5 z5Var = this.o0;
        org.telegram.ui.Cells.b3 b3Var = z5Var.b;
        org.telegram.ui.Cells.b3 b3Var2 = z5Var.b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var2.k(true);
            return;
        }
        if (b3Var2.v) {
            b3Var2.d();
            return;
        }
        b3Var2.r();
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
        z5 z5Var = this.o0;
        org.telegram.ui.Cells.b3 b3Var = z5Var.b;
        org.telegram.ui.Cells.b3 b3Var2 = z5Var.b;
        if (b3Var.getEmojiPadding() > 0) {
            b3Var2.k(true);
        } else if (b3Var2.v) {
            b3Var2.d();
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
        z5 z5Var = this.o0;
        if (z5Var != null) {
            z5Var.b.s();
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.U, 0, true, new s5(this, 0), this.resourcesProvider);
        this.p0 = k51Var;
        k51Var.r = false;
        return k51Var;
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(this.T ? R.string.Gift2TitleSelf2 : R.string.Gift2Title);
    }
}
