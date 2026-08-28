package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AlignmentSpan;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.nz0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ox0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.g01;
import org.telegram.ui.im;
import org.telegram.ui.pb;
import org.telegram.ui.rj;
import org.telegram.ui.s10;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class w0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, o4 {
    public static final HashMap f2;
    public boolean A;
    public float A0;
    public RectF A1;
    public boolean B;
    public final gh.m5 B0;
    public final ia B1;
    public boolean C;
    public ox0 C0;
    public boolean C1;
    public final int D;
    public MessageObject D0;
    public ColorMatrixColorFilter D1;
    public final ImageReceiver E;
    public int E0;
    public CornerPathEffect E1;
    public Drawable F;
    public CharSequence F0;
    public Path F1;
    public Path G;
    public fh.b2 G0;
    public nz0 G1;
    public final org.telegram.ui.Components.z8 H;
    public int H0;
    public final View H1;
    public StaticLayout I;
    public int I0;
    public final Path I1;
    public int J;
    public Paint J0;
    public final zf.v1 J1;
    public int K;
    public TextPaint K0;
    public int K1;
    public StaticLayout L;
    public final ArrayList L0;
    public final ArrayList L1;
    public int M;
    public final ArrayList M0;
    public BotInlineKeyboard.Source M1;
    public int N;
    public final Path N0;
    public boolean N1;
    public int O;
    public int O0;
    public float O1;
    public int P;
    public int P0;
    public final Paint P1;
    public int Q;
    public final RectF Q0;
    public boolean Q1;
    public int R;
    public boolean R0;
    public View.OnClickListener R1;
    public boolean S;
    public boolean S0;
    public int S1;
    public boolean T;
    public t0 T0;
    public final Path T1;
    public RadialProgressView U;
    public final org.telegram.ui.ActionBar.b6 U0;
    public final float[] U1;
    public float V;
    public int V0;
    public final float[] V1;
    public final ih.l7 W;
    public int W0;
    public final Path W1;
    public StaticLayout X0;
    public final int[] X1;
    public Paint Y0;
    public int Y1;
    public nz0 Z0;
    public SpannableStringBuilder Z1;
    public boolean a0;
    public StaticLayout a1;
    public boolean a2;
    public boolean b0;
    public boolean b1;
    public Runnable b2;
    public boolean c0;
    public boolean c1;
    public PorterDuffColorFilter c2;
    public boolean d0;
    public int d1;
    public int d2;
    public boolean e0;
    public final org.telegram.ui.Components.y5 e1;
    public final v0 e2;
    public int f;
    public int f0;
    public s10 f1;
    public boolean g0;
    public u0 g1;
    public int h;
    public int h0;
    public int h1;
    public boolean i0;
    public int i1;
    public h11 j0;
    public int j1;
    public final RectF k0;
    public nz0 k1;
    public final ArrayList l0;
    public StaticLayout l1;
    public final Stack m0;
    public boolean m1;
    public final pc n;
    public org.telegram.ui.Components.p5 n0;
    public TextPaint n1;
    public TextPaint o0;
    public StaticLayout o1;
    public float p0;
    public float p1;
    public float q0;
    public StaticLayout q1;
    public p80 r;
    public int r0;
    public float r1;
    public final boolean s;
    public boolean s0;
    public final TextPaint s1;
    public ImageLocation t0;
    public final TextPaint t1;
    public float u0;
    public final TextPaint u1;
    public View v;
    public float v0;
    public TLRPC.Document v1;
    public final int w;
    public boolean w0;
    public TLRPC.VideoSize w1;
    public URLSpan x;
    public boolean x0;
    public final RadialProgress2 x1;
    public dh.l y;
    public final hg.s0 y0;
    public int y1;
    public float z0;
    public boolean z1;

    static {
        HashMap hashMap = new HashMap();
        f2 = hashMap;
        ta.b.h(1, hashMap, "1⃣", 3, "2⃣");
        ta.b.h(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public w0(Context context) {
        this(context, null, false);
    }

    public static float O(StaticLayout staticLayout) {
        float f10 = 0.0f;
        for (int i9 = 0; i9 < staticLayout.getLineCount(); i9++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i9));
            if (ceil > f10) {
                f10 = ceil;
            }
        }
        return f10;
    }

    private void setStarsPaused(boolean z10) {
        zf.v1 v1Var = this.J1;
        if (z10 == v1Var.g) {
            return;
        }
        v1Var.g = z10;
        if (z10) {
            v1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i9 = 0; i9 < v1Var.n.size(); i9++) {
            zf.u1 u1Var = (zf.u1) v1Var.n.get(i9);
            u1Var.a = (System.currentTimeMillis() - v1Var.Q) + u1Var.a;
        }
        invalidate();
    }

    public static SpannableStringBuilder x(int i9, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i9));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.z.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.z.f(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas, boolean z10) {
        if (this.s) {
            if (I() && !z10) {
                return;
            }
            if (!I() && z10) {
                return;
            }
        }
        C(canvas, z10, null);
    }

    public final void C(Canvas canvas, boolean z10, Integer num) {
        Canvas canvas2;
        float alpha = z10 ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.U0;
        if (b6Var != null) {
            b6Var.o(this.q0, this.p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.r0);
        } else {
            org.telegram.ui.ActionBar.f6.q(this.q0, this.p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.r0);
        }
        MessageObject messageObject = this.D0;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        hg.s0 s0Var = this.y0;
        boolean z11 = s0Var.b;
        v0 v0Var = this.e2;
        if (!z11 || (v0Var.b && s0Var.l)) {
            s0Var.a = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            s0Var.d(canvas2, v0Var.b ? v0Var.c : 1.0f, num);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    public final void D(im imVar, Canvas canvas, int i9, Integer num, float f10) {
        hg.s0 s0Var = this.y0;
        if (s0Var.b) {
            return;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.U0;
        if (b6Var != null) {
            b6Var.o(this.q0, this.p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.r0);
        } else {
            org.telegram.ui.ActionBar.f6.q(this.q0, this.p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.r0);
        }
        s0Var.D = f10;
        s0Var.f(imVar, canvas, i9, num);
    }

    public final ColorFilter E(int i9) {
        if (i9 != this.d2 || this.c2 == null) {
            this.d2 = i9;
            this.c2 = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
        }
        return this.c2;
    }

    public final int F(MessageObject messageObject) {
        int i9;
        int i10 = this.V0;
        int i11 = messageObject.type;
        if (i11 == 37) {
            i10 = AndroidUtilities.dp(52.0f);
        } else if (i11 == 21 || M()) {
            i10 = AndroidUtilities.dp(78.0f);
        }
        if (L() || (i9 = messageObject.type) == 34 || i9 == 35) {
            return 0;
        }
        return i10;
    }

    public Paint G(String str) {
        org.telegram.ui.ActionBar.b6 b6Var = this.U0;
        Paint O = b6Var != null ? b6Var.O(str) : null;
        return O != null ? O : org.telegram.ui.ActionBar.f6.S0(str);
    }

    public final float H(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject == null) {
            return 1.0f;
        }
        try {
            if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.D)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                return messagesController.uploadingWallpaperInfo.r;
            }
            return 1.0f;
        } catch (Exception e10) {
            FileLog.e(e10);
            return 1.0f;
        }
    }

    public final boolean I() {
        if (this.J0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.U0;
        return b6Var != null ? b6Var.t0() : org.telegram.ui.ActionBar.f6.a1();
    }

    public final void J() {
        t0 t0Var = this.T0;
        if (t0Var != null && t0Var.h()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean K(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        int i9 = messageObject.type;
        return i9 == 30 || i9 == 18 || i9 == 25 || M();
    }

    public final boolean L() {
        TLRPC.Message message;
        MessageObject messageObject = this.D0;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean M() {
        MessageObject messageObject;
        int i9;
        if (this.B0.d() || this.C0 != null || (i9 = (messageObject = this.D0).type) == 31 || i9 == 37 || i9 == 33 || i9 == 35 || i9 == 34 || i9 == 21 || i9 == 22 || messageObject.isStoryMention()) {
            return true;
        }
        TLRPC.Message message = this.D0.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low || ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected;
        }
        return false;
    }

    public final boolean N() {
        MessageObject messageObject = this.D0;
        if (messageObject == null) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return UserObject.isUserSelf(MessagesController.getInstance(this.D).getUser(Long.valueOf(this.D0.messageOwner.from_id.user_id)));
        }
        return false;
    }

    public final void P(CharacterStyle characterStyle) {
        if (this.T0 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.T0.L(this, this.D0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.x;
            if (uRLSpan instanceof p41) {
                TLObject tLObject = ((p41) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    vf.c.m(this.T0.y0(), -this.T0.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.x;
            if (uRLSpan2 instanceof p41) {
                TLObject tLObject2 = ((p41) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.T0.C0((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.T0.E(this, this.D0.getReplyMsgId());
        } else if (url.startsWith("http")) {
            ve.e.s(getContext(), url);
        } else {
            this.T0.o1(Long.parseLong(url));
        }
    }

    public final void Q() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.D0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !N()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action).slug;
        }
        if (this.T0 != null) {
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e(this, tL_premiumGiftOption, str, 9));
        }
    }

    public final void R() {
        TLRPC.Message message;
        MessageObject messageObject = this.D0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        ih.l7 l7Var = this.W;
        if (z10) {
            Context context = getContext();
            TLRPC.Message message2 = this.D0.messageOwner;
            int i9 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            org.telegram.ui.ActionBar.b6 b6Var = l7Var.J;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i9;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            gh.oa.h1(context, false, 0L, this.D, starsTransaction, b6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.D0.messageOwner;
            int i10 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.b6 b6Var2 = l7Var.J;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i10;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= 8192;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            gh.oa.h1(context2, false, 0L, this.D, starsTransaction2, b6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.D0.messageOwner;
            int i11 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.b6 b6Var3 = l7Var.J;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i11;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            gh.oa.h1(context3, false, 0L, this.D, starsTransaction3, b6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            gh.k5 k5Var = new gh.k5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
            k5Var.i2(this.D0, null);
            k5Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                gh.k5 k5Var2 = new gh.k5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                k5Var2.i2(this.D0, null);
                k5Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.messenger.l0.p(R.string.UniqueGiftNotFoundBurned, oc.a0(U), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    gh.k5 k5Var3 = new gh.k5(getContext(), this.D, this.D0.getDialogId(), this.U0, null);
                    k5Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    k5Var3.show();
                }
            }
        }
    }

    public final void S(int i9, boolean z10, boolean z11) {
        int i10 = this.E0;
        if (i10 == i9 || i10 / 3600 == i9 / 3600) {
            return;
        }
        String string = z10 ? i9 == 2147483646 ? LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline) : LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i9)) : LocaleController.formatDateChat(i9);
        this.E0 = i9;
        CharSequence charSequence = this.F0;
        if (charSequence == null || !TextUtils.equals(string, charSequence)) {
            this.F0 = string;
            this.Z1 = null;
            W(z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x089e A[EDGE_INSN: B:415:0x089e->B:411:0x089e BREAK  A[LOOP:6: B:386:0x084e->B:413:0x0899], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [org.telegram.tgnet.TLRPC$messages_StickerSet] */
    /* JADX WARN: Type inference failed for: r2v157 */
    /* JADX WARN: Type inference failed for: r2v158 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(MessageObject messageObject, boolean z10) {
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z11;
        String str;
        String str2;
        TLRPC.Document document;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        MessageObject messageObject2;
        int i9;
        TLRPC.Document document3;
        boolean z12;
        TLRPC.Document document4;
        TLRPC.Document document5;
        BotInlineKeyboard.Source source;
        boolean z13;
        boolean z14;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z15;
        float f10;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str4;
        int i10;
        StaticLayout staticLayout;
        MessageObject messageObject3 = messageObject;
        if (messageObject3 == null) {
            return;
        }
        if (this.D0 != messageObject3 || (!((staticLayout = this.I) == null || TextUtils.equals(staticLayout.getText(), messageObject3.messageText)) || (!(this.x0 || messageObject3.replyMessageObject == null) || z10 || messageObject3.type == 21 || messageObject3.forceUpdate))) {
            if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
                FileLog.e(new IllegalStateException("Wrong thread!!!"));
            }
            this.L1.clear();
            this.M1 = null;
            this.Z1 = null;
            MessageObject messageObject4 = this.D0;
            boolean z16 = messageObject4 == null || messageObject4.stableId != messageObject3.stableId;
            if (messageObject4 != null) {
                messageObject3.playedGiftAnimation = messageObject4.playedGiftAnimation;
            }
            this.D0 = messageObject3;
            messageObject3.forceUpdate = false;
            this.x0 = messageObject3.replyMessageObject != null;
            DownloadController.getInstance(this.D).removeLoadingFileObserver(this);
            this.R = 0;
            this.C = false;
            u0 u0Var = this.g1;
            if (u0Var != null && z16) {
                org.telegram.ui.Components.t5.release((w0) u0Var.i, (org.telegram.ui.Components.p5) u0Var.h);
                this.g1 = null;
                this.b1 = false;
            }
            if (z16 || messageObject3.reactionsChanged) {
                messageObject3.reactionsChanged = false;
                TLRPC.Message message = messageObject3.messageOwner;
                boolean z17 = (message == null || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                if (messageObject3.shouldDrawReactions()) {
                    this.y0.s(messageObject3, !messageObject3.shouldDrawReactionsInLayout(), z17, this.U0);
                } else {
                    this.y0.s(null, false, false, this.U0);
                }
            }
            if (messageObject3.type == 32) {
                if (this.C0 == null) {
                    ox0 ox0Var = new ox0(this.D, this, this.U0);
                    this.C0 = ox0Var;
                    if (this.Q1) {
                        ox0Var.d.r0 = ox0Var.b;
                    }
                }
                ox0 ox0Var2 = this.C0;
                ox0Var2.getClass();
                TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject3.messageOwner.action;
                ox0Var2.e = tL_messageActionSuggestBirthday.birthday;
                nz0 nz0Var = new nz0(TextUtils.concat(messageObject3.messageText, ":"), 13.0f, null);
                nz0Var.n(6);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                nz0Var.a();
                nz0Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
                ox0Var2.f = nz0Var;
                int i11 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
                nz0[] nz0VarArr = new nz0[i11];
                ox0Var2.g = nz0VarArr;
                ox0Var2.h = new nz0[i11];
                nz0VarArr[0] = new nz0(LocaleController.getString(R.string.DateDay), 11.0f, null);
                ox0Var2.h[0] = new nz0("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
                ox0Var2.g[1] = new nz0(LocaleController.getString(R.string.DateMonth), 11.0f, null);
                nz0[] nz0VarArr2 = ox0Var2.h;
                StringBuilder sb2 = new StringBuilder("");
                int i12 = tL_messageActionSuggestBirthday.birthday.month - 1;
                sb2.append((i12 < 0 || i12 >= 12) ? j3.r0.l(i12, "") : LocaleController.getString(new int[]{R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December}[i12]));
                nz0VarArr2[1] = new nz0(sb2.toString(), 11.0f, AndroidUtilities.bold());
                if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
                    ox0Var2.g[2] = new nz0(LocaleController.getString(R.string.DateYear), 11.0f, null);
                    ox0Var2.h[2] = new nz0("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
                }
                ox0Var2.i = !messageObject3.isOutOwner();
                org.telegram.ui.ActionBar.b6 b6Var = ox0Var2.c;
                ox0Var2.l.setColor(b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.I.q() ? org.telegram.ui.ActionBar.f6.l1(0.12f, -1) : org.telegram.ui.ActionBar.f6.l1(0.12f, -16777216));
                ox0Var2.j = new nz0(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
            } else {
                ox0 ox0Var3 = this.C0;
                if (ox0Var3 != null) {
                    ox0Var3.d.r0 = null;
                    this.C0 = null;
                }
            }
            boolean z18 = !z16;
            this.B0.f(messageObject3, z18);
            this.E.setAutoRepeatCount(0);
            this.E.clearDecorators();
            if (messageObject3.type != 22) {
                this.F = null;
            }
            if (messageObject3.actionDeleteGroupEventId != -1) {
                g7.g6.b(this, 0.02f, 1.2f);
                this.S1 = Math.max(AndroidUtilities.dp(250.0f), kh.x3.a(messageObject3.messageText, (TextPaint) G("paintChatActionText")));
                g01 S0 = pb.S0(messageObject3.messageText);
                if (S0 != null) {
                    S0.h = this;
                }
            } else {
                setStateListAnimator(null);
                this.S1 = 0;
            }
            if (messageObject3.isStoryMention()) {
                TLRPC.User user = MessagesController.getInstance(this.D).getUser(Long.valueOf(messageObject3.messageOwner.media.user_id));
                this.H.m(this.D, user);
                TL_stories.StoryItem storyItem = messageObject3.messageOwner.media.storyItem;
                if (storyItem == null || !storyItem.noforwards) {
                    ih.p7.x(this.E, storyItem);
                } else {
                    this.E.setForUserOrChat(user, this.H, null, true, 0, true);
                }
                this.E.setRoundRadius((int) (this.V0 / 2.0f));
            } else {
                int i13 = messageObject3.type;
                if (i13 == 22) {
                    if (messageObject3.strippedThumb == null) {
                        int size = messageObject3.photoThumbs.size();
                        for (int i14 = 0; i14 < size && !(messageObject3.photoThumbs.get(i14) instanceof TLRPC.TL_photoStrippedSize); i14++) {
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject3.currentEvent;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                            if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                                org.telegram.ui.ActionBar.b6 b6Var2 = this.U0;
                                boolean a2 = b6Var2 != null ? b6Var2.a() : org.telegram.ui.ActionBar.f6.I.q();
                                this.E.clearImage();
                                int i15 = this.D;
                                String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(wallPaper);
                                int i16 = kh.r6.x0;
                                org.telegram.ui.ActionBar.b4 theme = ChatThemeController.getInstance(i15).getTheme(nf.b.d(wallpaperEmoticon));
                                Drawable r02 = theme == null ? org.telegram.ui.ActionBar.f6.r0() : kh.r6.g(i15, theme, a2);
                                this.F = r02;
                                if (r02 != null) {
                                    r02.setCallback(this);
                                }
                            } else if (wallPaper != null && (str4 = wallPaper.uploadingImage) != null) {
                                this.E.setImage(ImageLocation.getForPath(str4), "150_150_wallpaper" + wallPaper.id + tn.e(wallPaper.settings), null, null, tn.b(wallPaper), 0L, null, wallPaper, 1);
                                this.F = null;
                            } else if (wallPaper != null) {
                                TLObject tLObject = messageObject3.photoThumbsObject;
                                TLRPC.Document document6 = tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document;
                                this.E.setImage(ImageLocation.getForDocument(document6), "150_150_wallpaper" + wallPaper.id + tn.e(wallPaper.settings), null, null, tn.b(wallPaper), 0L, null, wallPaper, 1);
                                this.F = null;
                            } else {
                                this.F = null;
                            }
                            this.E.setRoundRadius((int) (this.V0 / 2.0f));
                            if (H(messageObject) != 1.0f) {
                                this.x1.o(1.0f, z18);
                                this.x1.setIcon(4, z18, z18);
                            } else {
                                this.x1.setIcon(3, z18, z18);
                            }
                        }
                    }
                    TLRPC.Message message2 = messageObject3.messageOwner;
                    wallPaper = (message2 == null || (messageAction = message2.action) == null) ? null : messageAction.wallpaper;
                    if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                    }
                    this.E.setRoundRadius((int) (this.V0 / 2.0f));
                    if (H(messageObject) != 1.0f) {
                    }
                } else if (i13 == 21) {
                    this.E.setRoundRadius((int) (this.V0 / 2.0f));
                    this.E.setAllowStartLottieAnimation(true);
                    this.E.setDelegate(null);
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) messageObject3.messageOwner.action;
                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_messageActionSuggestProfilePhoto.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                    ArrayList<TLRPC.VideoSize> arrayList2 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    ImageLocation forPhoto = (arrayList2 == null || arrayList2.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = messageObject3.messageOwner.action.photo;
                    if (messageObject3.strippedThumb == null) {
                        int size2 = messageObject3.photoThumbs.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            photoSize2 = messageObject3.photoThumbs.get(i17);
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    photoSize2 = null;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                    if (closestPhotoSizeWithSize == null) {
                        z15 = false;
                    } else if (closestVideoSizeWithSize != null) {
                        z15 = false;
                        this.E.setImage(forPhoto, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject, 0);
                        messageObject3 = messageObject;
                    } else {
                        z15 = false;
                        this.E.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 0);
                    }
                    this.E.setAllowStartLottieAnimation(z15);
                    e40 e40Var = MessagesController.getInstance(this.D).photoSuggestion.get(messageObject3.messageOwner.local_id);
                    if (e40Var != null) {
                        f10 = 1.0f;
                        if (e40Var.S != 1.0f) {
                            this.x1.setIcon(3, z18, z18);
                        }
                    } else {
                        f10 = 1.0f;
                    }
                    this.x1.o(f10, z18);
                    this.x1.setIcon(4, z18, z18);
                } else if (i13 == 31 || i13 == 33 || i13 == 30 || i13 == 18 || i13 == 25 || i13 == 35) {
                    this.E.setRoundRadius(0);
                    TLRPC.MessageAction messageAction2 = messageObject3.messageOwner.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                        long j10 = MessagesController.getInstance(this.D).config.noForwardsRequestExpirePeriod.get(TimeUnit.SECONDS);
                        if (tL_messageActionNoForwardsRequest.expired) {
                            z11 = z16;
                        } else {
                            z11 = z16;
                            if (messageObject3.messageOwner.date + j10 >= ConnectionsManager.getInstance(this.D).getCurrentTime()) {
                                z14 = false;
                                this.N1 = z14;
                                if (!messageObject3.isOut() && !tL_messageActionNoForwardsRequest.expired && !this.N1) {
                                    BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
                                    builder.addSharingOfferKeyboard();
                                    this.M1 = builder.build();
                                }
                                document = null;
                            }
                        }
                        z14 = true;
                        this.N1 = z14;
                        if (!messageObject3.isOut()) {
                            BotInlineKeyboard.Builder builder2 = new BotInlineKeyboard.Builder();
                            builder2.addSharingOfferKeyboard();
                            this.M1 = builder2.build();
                        }
                        document = null;
                    } else {
                        z11 = z16;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                            if (starGift != null) {
                                document5 = gf.d.e(starGift);
                                if (this.G0 == null) {
                                    this.G0 = new fh.b2(this, this.U0, false);
                                }
                                this.G0.d((TL_stars.starGiftAttributeBackdrop) gh.v7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.G0.e((TL_stars.starGiftAttributePattern) gh.v7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                            } else {
                                document5 = null;
                            }
                            this.N1 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(this.D).getCurrentTime();
                            if (!messageObject3.isOut() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.N1) {
                                BotInlineKeyboard.Builder builder3 = new BotInlineKeyboard.Builder();
                                builder3.addGiftOfferKeyboard();
                                this.M1 = builder3.build();
                            }
                            document = document5;
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                            TL_stars.StarGift starGift2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                            if (starGift2 != null) {
                                document4 = gf.d.e(starGift2);
                                if (this.G0 == null) {
                                    this.G0 = new fh.b2(this, this.U0, false);
                                }
                                this.G0.d((TL_stars.starGiftAttributeBackdrop) gh.v7.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.G0.e((TL_stars.starGiftAttributePattern) gh.v7.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                            } else {
                                document4 = null;
                            }
                            document = document4;
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                            if (starGift3 != null) {
                                document = starGift3.sticker;
                                messageObject2 = messageObject3;
                                z12 = false;
                                str2 = null;
                                source = this.M1;
                                if (source != null) {
                                    int rowsCount = source.getRowsCount();
                                    for (int i18 = 0; i18 < rowsCount; i18++) {
                                        int columnsCount = this.M1.getColumnsCount(i18);
                                        int i19 = 0;
                                        while (i19 < columnsCount) {
                                            BotInlineKeyboard.Button button = this.M1.getButton(i18, i19);
                                            e0 e0Var = new e0(new s0(this, 0));
                                            e0Var.j = (BotInlineKeyboard.ButtonCustom) button;
                                            int iconRes = button.getIconRes();
                                            if (iconRes != 0) {
                                                Drawable drawable = getResources().getDrawable(iconRes);
                                                e0Var.t = drawable;
                                                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                            }
                                            e0Var.f = AndroidUtilities.dp(40.0f);
                                            int i20 = e0Var.g | 8;
                                            e0Var.g = i20;
                                            int b10 = g7.z7.b(i20, 1, i19 == 0);
                                            e0Var.g = b10;
                                            e0Var.g = g7.z7.b(b10, 2, i19 == 1);
                                            e0Var.h = new nz0(button.getText(), (TextPaint) G("paintChatBotButton"));
                                            this.L1.add(e0Var);
                                            i19++;
                                        }
                                    }
                                }
                                this.z1 = messageObject3.wasUnread;
                                this.v1 = document;
                                if (document == null) {
                                    this.E.setAllowStartLottieAnimation(true);
                                    int i21 = messageObject3.type;
                                    if (i21 != 31 && i21 != 37 && i21 != 33) {
                                        this.E.setDelegate(this.B1);
                                    }
                                    this.w1 = null;
                                    int i22 = 0;
                                    while (true) {
                                        if (i22 >= document.video_thumbs.size()) {
                                            break;
                                        }
                                        if ("f".equals(document.video_thumbs.get(i22).type)) {
                                            this.w1 = document.video_thumbs.get(i22);
                                            break;
                                        }
                                        i22++;
                                    }
                                    if (z11 || messageObject3.type != 18) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.f6.a7, 0.3f);
                                        this.E.setAutoRepeat(0);
                                        ImageReceiver imageReceiver = this.E;
                                        ImageLocation forDocument = ImageLocation.getForDocument(document);
                                        Locale locale = Locale.US;
                                        imageReceiver.setImage(forDocument, j3.r0.l(messageObject3.stableId, "160_160_nr_messageId="), svgThumb, "tgs", messageObject2, 1);
                                    }
                                } else if (str2 != null) {
                                    MediaDataController.getInstance(this.D).loadStickersByEmojiOrName(str2, false, !z12);
                                }
                            }
                            document = null;
                            messageObject2 = messageObject3;
                            z12 = false;
                            str2 = null;
                            source = this.M1;
                            if (source != null) {
                            }
                            this.z1 = messageObject3.wasUnread;
                            this.v1 = document;
                            if (document == null) {
                            }
                        } else {
                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                                if (tL_messageActionStarGiftUnique.refunded) {
                                    TL_stars.StarGift starGift4 = tL_messageActionStarGiftUnique.gift;
                                    if (starGift4 != null) {
                                        document = starGift4.getDocument();
                                        messageObject2 = messageObject3;
                                        z12 = false;
                                        str2 = null;
                                        source = this.M1;
                                        if (source != null) {
                                        }
                                        this.z1 = messageObject3.wasUnread;
                                        this.v1 = document;
                                        if (document == null) {
                                        }
                                    }
                                    document = null;
                                    messageObject2 = messageObject3;
                                    z12 = false;
                                    str2 = null;
                                    source = this.M1;
                                    if (source != null) {
                                    }
                                    this.z1 = messageObject3.wasUnread;
                                    this.v1 = document;
                                    if (document == null) {
                                    }
                                }
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                str = UserConfig.getInstance(this.D).premiumTonStickerPack;
                                if (str == null) {
                                    MediaDataController.getInstance(this.D).checkTonGiftStickers();
                                    return;
                                }
                            } else {
                                str = UserConfig.getInstance(this.D).premiumGiftsStickerPack;
                                if (str == null) {
                                    MediaDataController.getInstance(this.D).checkPremiumGiftStickers();
                                    return;
                                }
                            }
                            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.D).getStickerSetByName(str);
                            ?? r22 = stickerSetByName;
                            if (stickerSetByName == null) {
                                r22 = MediaDataController.getInstance(this.D).getStickerSetByEmojiOrName(str);
                            }
                            if (r22 != 0) {
                                TLRPC.MessageAction messageAction3 = messageObject3.messageOwner.action;
                                int i23 = messageAction3.months;
                                if (messageObject3.type == 30) {
                                    String str5 = "3⃣";
                                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                        long j11 = messageAction3.cryptoAmount;
                                        if (j11 > 10000000000L) {
                                            if (j11 <= 50000000000L) {
                                                str5 = "1⃣";
                                            }
                                            i9 = 0;
                                            while (true) {
                                                if (i9 < r22.packs.size()) {
                                                    break;
                                                }
                                                TLRPC.TL_stickerPack tL_stickerPack = r22.packs.get(i9);
                                                if (TextUtils.equals(tL_stickerPack.emoticon, str5) && !tL_stickerPack.documents.isEmpty()) {
                                                    long longValue = tL_stickerPack.documents.get(0).longValue();
                                                    for (int i24 = 0; i24 < r22.documents.size(); i24++) {
                                                        document3 = r22.documents.get(i24);
                                                        if (document3 != null && document3.id == longValue) {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    i9++;
                                                }
                                            }
                                            document3 = null;
                                            document2 = document3;
                                        }
                                        str5 = "2⃣";
                                        i9 = 0;
                                        while (true) {
                                            if (i9 < r22.packs.size()) {
                                            }
                                            i9++;
                                        }
                                        document3 = null;
                                        document2 = document3;
                                    } else {
                                        long j12 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                        if (j12 > 1000) {
                                            if (j12 >= 2500) {
                                                str5 = "4⃣";
                                            }
                                            i9 = 0;
                                            while (true) {
                                                if (i9 < r22.packs.size()) {
                                                }
                                                i9++;
                                            }
                                            document3 = null;
                                            document2 = document3;
                                        }
                                        str5 = "2⃣";
                                        i9 = 0;
                                        while (true) {
                                            if (i9 < r22.packs.size()) {
                                            }
                                            i9++;
                                        }
                                        document3 = null;
                                        document2 = document3;
                                    }
                                    source = this.M1;
                                    if (source != null) {
                                    }
                                    this.z1 = messageObject3.wasUnread;
                                    this.v1 = document;
                                    if (document == null) {
                                    }
                                } else {
                                    String str6 = (String) f2.get(Integer.valueOf(i23));
                                    ArrayList<TLRPC.TL_stickerPack> arrayList3 = r22.packs;
                                    int size3 = arrayList3.size();
                                    int i25 = 0;
                                    document2 = null;
                                    while (i25 < size3) {
                                        TLRPC.TL_stickerPack tL_stickerPack2 = arrayList3.get(i25);
                                        i25++;
                                        TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                        if (Objects.equals(tL_stickerPack3.emoticon, str6)) {
                                            ArrayList<Long> arrayList4 = tL_stickerPack3.documents;
                                            int size4 = arrayList4.size();
                                            TLRPC.Document document7 = document2;
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= size4) {
                                                    str3 = str6;
                                                    arrayList = arrayList3;
                                                    break;
                                                }
                                                Long l10 = arrayList4.get(i26);
                                                i26++;
                                                long longValue2 = l10.longValue();
                                                ArrayList<TLRPC.Document> arrayList5 = r22.documents;
                                                int size5 = arrayList5.size();
                                                int i27 = 0;
                                                while (true) {
                                                    if (i27 >= size5) {
                                                        str3 = str6;
                                                        arrayList = arrayList3;
                                                        break;
                                                    }
                                                    TLRPC.Document document8 = arrayList5.get(i27);
                                                    i27++;
                                                    TLRPC.Document document9 = document8;
                                                    str3 = str6;
                                                    arrayList = arrayList3;
                                                    if (document9.id == longValue2) {
                                                        document7 = document9;
                                                        break;
                                                    } else {
                                                        str6 = str3;
                                                        arrayList3 = arrayList;
                                                    }
                                                }
                                                if (document7 != null) {
                                                    break;
                                                }
                                                str6 = str3;
                                                arrayList3 = arrayList;
                                            }
                                            document2 = document7;
                                        } else {
                                            str3 = str6;
                                            arrayList = arrayList3;
                                        }
                                        if (document2 != null) {
                                            break;
                                        }
                                        str6 = str3;
                                        arrayList3 = arrayList;
                                    }
                                }
                                if (document2 != null || r22.documents.isEmpty()) {
                                    str2 = str;
                                    messageObject2 = r22;
                                    document = document2;
                                    z12 = r22;
                                } else {
                                    str2 = str;
                                    document = r22.documents.get(0);
                                    messageObject2 = r22;
                                    z12 = r22;
                                }
                                source = this.M1;
                                if (source != null) {
                                }
                                this.z1 = messageObject3.wasUnread;
                                this.v1 = document;
                                if (document == null) {
                                }
                            } else {
                                str2 = str;
                                document = null;
                                z13 = r22;
                                messageObject2 = null;
                                z12 = z13;
                                source = this.M1;
                                if (source != null) {
                                }
                                this.z1 = messageObject3.wasUnread;
                                this.v1 = document;
                                if (document == null) {
                                }
                            }
                        }
                    }
                    z13 = false;
                    str2 = null;
                    messageObject2 = null;
                    z12 = z13;
                    source = this.M1;
                    if (source != null) {
                    }
                    this.z1 = messageObject3.wasUnread;
                    this.v1 = document;
                    if (document == null) {
                    }
                } else if (i13 == 37) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.D).getChat(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) messageObject3.messageOwner.action).community_id));
                    this.E.setAllowStartLottieAnimation(true);
                    this.E.setDelegate(null);
                    this.E.setRoundRadius(AndroidUtilities.dp(14.0f));
                    this.E.setAutoRepeatCount(1);
                    this.H.q(chat);
                    this.E.setForUserOrChat(chat, new gq(getContext(), AndroidUtilities.dp(14.0f)), chat);
                } else if (i13 == 11) {
                    this.E.setAllowStartLottieAnimation(true);
                    this.E.setDelegate(null);
                    this.E.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
                    this.E.setAutoRepeatCount(1);
                    this.H.n(messageObject3.getDialogId(), null, null);
                    if (messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        this.E.setImage(null, null, this.H, null, messageObject3, 0);
                    } else {
                        if (messageObject3.strippedThumb == null) {
                            int size6 = messageObject3.photoThumbs.size();
                            for (int i28 = 0; i28 < size6; i28++) {
                                photoSize = messageObject3.photoThumbs.get(i28);
                                if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                                    break;
                                }
                            }
                        }
                        photoSize = null;
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, 640);
                        if (closestPhotoSizeWithSize2 != null) {
                            TLRPC.Photo photo2 = messageObject3.messageOwner.action.photo;
                            if (!photo2.video_sizes.isEmpty() && SharedConfig.isAutoplayGifs()) {
                                videoSize = FileLoader.getClosestVideoSizeWithSize(photo2.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                                if (!messageObject3.mediaExists && !DownloadController.getInstance(this.D).canDownloadMedia(4, videoSize.size)) {
                                    this.t0 = ImageLocation.getForPhoto(videoSize, photo2);
                                    DownloadController.getInstance(this.D).addLoadingFileObserver(FileLoader.getAttachFileName(videoSize), messageObject3, this);
                                }
                                if (videoSize == null) {
                                    this.E.setImage(ImageLocation.getForPhoto(videoSize, photo2), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 1);
                                } else {
                                    this.E.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject3.photoThumbsObject), "150_150", ImageLocation.getForObject(photoSize, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 1);
                                }
                            }
                            videoSize = null;
                            if (videoSize == null) {
                            }
                        } else {
                            this.E.setImageBitmap(this.H);
                        }
                    }
                    this.E.setVisible(!PhotoViewer.M1(messageObject3), false);
                } else {
                    this.E.setAllowStartLottieAnimation(true);
                    this.E.setDelegate(null);
                    this.E.setImageBitmap((Bitmap) null);
                }
            }
            if (this.g0 && this.a0 && this.e0 && (this.b0 || this.c0 || this.d0)) {
                this.h0 = AndroidUtilities.dp(33.0f);
                if (this.j0 == null) {
                    h11 h11Var = new h11(this.D, this, this.U0, true);
                    this.j0 = h11Var;
                    h11Var.r = new s0(this, 1);
                }
                if (this.j0.f(this.D0)) {
                    if (this.Q1) {
                        this.j0.a();
                    }
                    i10 = 0;
                } else {
                    this.j0.b();
                    this.j0 = null;
                    i10 = 0;
                    this.h0 = 0;
                }
            } else {
                h11 h11Var2 = this.j0;
                if (h11Var2 != null) {
                    h11Var2.b();
                    this.j0 = null;
                }
                i10 = 0;
                this.h0 = 0;
            }
            int paddingTop = getPaddingTop();
            int i29 = this.h0;
            if (paddingTop != i29) {
                setPadding(i10, i29, i10, i10);
            }
            this.H1.setVisibility((!K(messageObject) || this.B0.d()) ? 8 : 0);
            vf.c.b(messageObject3);
            requestLayout();
        }
    }

    public final void U(int i9, int i10) {
        this.H0 = i9;
        this.I0 = i10;
    }

    public final void V(float f10, int i9) {
        this.s0 = true;
        this.r0 = i9;
        this.p0 = f10;
        this.q0 = 0.0f;
    }

    public final void W(boolean z10) {
        if (getMeasuredWidth() != 0) {
            w(getMeasuredWidth(), this.F0);
            invalidate();
        }
        if (this.w0) {
            r();
        } else if (z10) {
            AndroidUtilities.runOnUIThread(new s0(this, 3));
        } else {
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        MessageObject messageObject;
        if (i9 == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
            return;
        }
        if (i9 == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i9 == NotificationCenter.didUpdatePremiumGiftStickers || i9 == NotificationCenter.starGiftsLoaded || i9 == NotificationCenter.didUpdateTonGiftStickers) {
            MessageObject messageObject2 = this.D0;
            if (messageObject2 != null) {
                T(messageObject2, true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.D).premiumGiftsStickerPack) && (messageObject = this.D0) != null) {
            T(messageObject, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.H1) {
            return super.drawChild(canvas, view, j10);
        }
        float a2 = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.o4
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        t0 t0Var = this.T0;
        if (t0Var != null) {
            t0Var.a2(this, reactionCount, z10, f10, f11);
        }
    }

    public /* bridge */ /* synthetic */ ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a0
    public int getBoundsLeft() {
        gh.m5 m5Var = this.B0;
        if (m5Var.d()) {
            int width = ((int) (getWidth() - (m5Var.Q.e + AndroidUtilities.dp(8.0f)))) / 2;
            return m5Var.p ? width : Math.min(this.O0, width);
        }
        if (K(this.D0)) {
            return j3.r0.d(getWidth(), this.W0, 2, this.f0 / 2);
        }
        int i9 = this.O0;
        ImageReceiver imageReceiver = this.E;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            i9 = Math.min((int) imageReceiver.getImageX(), i9);
        }
        return (this.f0 / 2) + i9;
    }

    @Override // org.telegram.ui.Cells.a0
    public int getBoundsRight() {
        int i9;
        int i10;
        gh.m5 m5Var = this.B0;
        if (m5Var.d()) {
            int dp = ((int) ((m5Var.Q.e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            return m5Var.p ? dp : Math.max(this.P0, dp);
        }
        if (K(this.D0)) {
            i9 = this.f0 / 2;
            i10 = (getWidth() + this.W0) / 2;
        } else {
            i9 = this.P0;
            ImageReceiver imageReceiver = this.E;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i9 = Math.max((int) imageReceiver.getImageX2(), i9);
            }
            i10 = this.f0 / 2;
        }
        return i10 + i9;
    }

    @Override // org.telegram.ui.Cells.o4
    public /* bridge */ /* synthetic */ float getCheckBoxTranslation() {
        return 0.0f;
    }

    public /* bridge */ /* synthetic */ MessageObject.GroupedMessagePosition getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.E0;
    }

    public t0 getDelegate() {
        return this.T0;
    }

    @Override // org.telegram.ui.Cells.o4
    public float getDeltaBottom() {
        return 0.0f;
    }

    public float getDeltaLeft() {
        return 0.0f;
    }

    public float getDeltaRight() {
        return 0.0f;
    }

    public float getDeltaTop() {
        return 0.0f;
    }

    public int getLayoutHeight() {
        return getMeasuredHeight();
    }

    @Override // org.telegram.ui.Cells.o4
    public MessageObject getMessageObject() {
        return this.D0;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.w;
    }

    public ImageReceiver getPhotoImage() {
        return this.E;
    }

    public hg.s0 getReactionsLayout() {
        return this.y0;
    }

    @Override // org.telegram.ui.Cells.o4
    public /* bridge */ /* synthetic */ float getSlidingOffsetX() {
        return 0.0f;
    }

    public v0 getTransitionParams() {
        return this.e2;
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Cells.a0, android.view.View
    public final void invalidate() {
        super.invalidate();
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        Runnable runnable = this.b2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.a2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Cells.a0
    public final boolean m() {
        t0 t0Var = this.T0;
        if (t0Var != null) {
            return t0Var.Z1(this, this.u0, this.v0);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t0 t0Var;
        super.onAttachedToWindow();
        this.Q1 = true;
        this.E.onAttachedToWindow();
        setStarsPaused(false);
        this.n0 = org.telegram.ui.Components.t5.update(0, this, (!this.s || (t0Var = this.T0) == null || t0Var.h()) ? false : true, this.n0, this.I);
        u0 u0Var = this.g1;
        if (u0Var != null) {
            u0Var.h = org.telegram.ui.Components.t5.update(0, (View) u0Var.i, false, (org.telegram.ui.Components.p5) u0Var.h, (StaticLayout) u0Var.f);
        }
        int i9 = this.D;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.D0;
        if (messageObject != null && messageObject.type == 21) {
            T(messageObject, true);
        }
        gh.m5 m5Var = this.B0;
        m5Var.P = true;
        if (m5Var.N != null) {
            m5Var.d.onAttachedToWindow();
            m5Var.e.a();
            m5Var.y.d.onAttachedToWindow();
        }
        hg.s0 s0Var = this.y0;
        ArrayList arrayList = s0Var.v;
        s0Var.G = true;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((hg.p0) arrayList.get(i10)).a();
        }
        h11 h11Var = this.j0;
        if (h11Var != null) {
            h11Var.a();
        }
        ox0 ox0Var = this.C0;
        if (ox0Var != null) {
            ox0Var.d.r0 = ox0Var.b;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q1 = false;
        int i9 = this.D;
        DownloadController.getInstance(i9).removeLoadingFileObserver(this);
        this.E.onDetachedFromWindow();
        setStarsPaused(true);
        this.w0 = false;
        org.telegram.ui.Components.t5.release(this, this.n0);
        u0 u0Var = this.g1;
        if (u0Var != null) {
            org.telegram.ui.Components.t5.release((w0) u0Var.i, (org.telegram.ui.Components.p5) u0Var.h);
        }
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.W.g();
        this.e2.a = false;
        gh.m5 m5Var = this.B0;
        m5Var.P = false;
        m5Var.d.onDetachedFromWindow();
        m5Var.e.b();
        fh.a1 a1Var = m5Var.y;
        a1Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.t5.release((View) null, a1Var.q);
        a1Var.q = null;
        this.y0.q();
        h11 h11Var = this.j0;
        if (h11Var != null) {
            h11Var.b();
        }
        ox0 ox0Var = this.C0;
        if (ox0Var != null) {
            ox0Var.d.r0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0c4c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0c53  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0c64  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0c71  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0cb5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0ddc  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0e27  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0e6d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0eee  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0f22  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0f5d  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0fc6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0f8c  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0f98  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0f9c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0f90  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0f62  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0ec1  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0c85  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x055a A[LOOP:1: B:85:0x0558->B:86:0x055a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x057c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        int i9;
        TextPaint textPaint;
        ArrayList arrayList;
        RadialProgress2 radialProgress2;
        TextPaint textPaint2;
        int i10;
        w0 w0Var;
        float f10;
        float f11;
        float dp;
        Canvas canvas2;
        float f12;
        w0 w0Var2;
        float f13;
        float f14;
        nz0 nz0Var;
        u0 u0Var;
        StaticLayout staticLayout;
        org.telegram.ui.ActionBar.b6 b6Var;
        boolean z10;
        float f15;
        float clamp;
        Paint G;
        boolean a2;
        ColorMatrix colorMatrix;
        int i11;
        TextPaint textPaint3;
        int i12;
        int i13;
        nz0 nz0Var2;
        int dp2;
        t0 t0Var;
        int size;
        int i14;
        TextPaint textPaint4;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.f0 / 2.0f, getPaddingTop());
        MessageObject messageObject = this.D0;
        float e10 = this.e1.e(!this.c1);
        int i15 = this.V0;
        gh.m5 m5Var = this.B0;
        boolean d = m5Var.d();
        ih.l7 l7Var = this.W;
        TextPaint textPaint5 = this.t1;
        ImageReceiver imageReceiver = this.E;
        if (!d && this.C0 == null && K(messageObject)) {
            this.V0 = this.W0 - AndroidUtilities.dp(106.0f);
            if (M()) {
                i15 = F(messageObject);
                float f16 = (this.R - i15) / 2.0f;
                float dp3 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f) + this.O + this.K;
                if (messageObject.isStoryMention()) {
                    l7Var.d = messageObject.messageOwner.media.storyItem;
                }
                float f17 = i15;
                l7Var.F.set(f16, dp3, f16 + f17, f17 + dp3);
                int i16 = messageObject.type;
                if (i16 == 31 || i16 == 33 || i16 == 34 || i16 == 35) {
                    f16 += AndroidUtilities.dp(10.0f);
                    dp3 += AndroidUtilities.dp(10.0f);
                    i15 -= AndroidUtilities.dp(20.0f);
                }
                if (messageObject.type == 37) {
                    f16 += AndroidUtilities.dp(2.0f);
                }
                imageReceiver.setImageCoords(f16, dp3, Math.max(0, i15), Math.max(0, i15));
                int i17 = messageObject.type;
                if (i17 == 31 || i17 == 33 || i17 == 34 || i17 == 35) {
                    i15 = AndroidUtilities.dp(20.0f) + i15;
                }
            } else {
                int i18 = messageObject.type;
                if (i18 == 11) {
                    int i19 = this.R;
                    float f18 = this.V0;
                    imageReceiver.setImageCoords((i19 - r4) / 2.0f, (this.W0 * 0.075f) + this.O + this.K, f18, f18);
                } else {
                    if (i18 == 25) {
                        i15 = (int) (this.V0 * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                        float f19 = i15;
                        imageReceiver.setImageCoords((this.R - i15) / 2.0f, ((this.W0 * 0.075f) + (this.O + this.K)) - AndroidUtilities.dp(22.0f), f19, f19);
                    } else if (messageObject.isStarGiftAction()) {
                        float f20 = i15;
                        imageReceiver.setImageCoords((this.R - i15) / 2.0f, (this.W0 * 0.075f) + this.O + this.K + AndroidUtilities.dp(2.0f), f20, f20);
                    } else if (messageObject.type == 30) {
                        i15 = (int) (this.V0 * 1.1f);
                        TLRPC.Message message = messageObject.messageOwner;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f21 = i15;
                            imageReceiver.setImageCoords((this.R - i15) / 2.0f, ((this.W0 * 0.075f) + (this.O + this.K)) - AndroidUtilities.dp(12.0f), f21, f21);
                        } else {
                            float f22 = i15;
                            imageReceiver.setImageCoords((this.R - i15) / 2.0f, ((this.W0 * 0.075f) + (this.O + this.K)) - AndroidUtilities.dp(22.0f), f22, f22);
                        }
                    } else {
                        i15 = (int) (this.V0 * 1.0f);
                        float f23 = i15;
                        imageReceiver.setImageCoords((this.R - i15) / 2.0f, ((this.W0 * 0.075f) + (this.O + this.K)) - AndroidUtilities.dp(4.0f), f23, f23);
                    }
                    textPaint4 = (TextPaint) G("paintChatActionText");
                    this.o0 = textPaint4;
                    if (textPaint4 != null) {
                        TextPaint textPaint6 = this.s1;
                        if (textPaint6 != null && textPaint6.getColor() != this.o0.getColor()) {
                            this.s1.setColor(this.o0.getColor());
                        }
                        TextPaint textPaint7 = this.u1;
                        if (textPaint7 != null && textPaint7.getColor() != this.o0.getColor()) {
                            textPaint7.setColor(this.o0.getColor());
                            textPaint7.linkColor = this.o0.getColor();
                        }
                        if (textPaint5 != null && textPaint5.getColor() != this.o0.getColor()) {
                            textPaint5.setColor(this.o0.getColor());
                            textPaint5.linkColor = this.o0.getColor();
                        }
                    }
                }
            }
            textPaint4 = (TextPaint) G("paintChatActionText");
            this.o0 = textPaint4;
            if (textPaint4 != null) {
            }
        }
        int i20 = i15;
        y(canvas3, false);
        boolean d9 = m5Var.d();
        RadialProgress2 radialProgress22 = this.x1;
        if (d9) {
            canvas3.save();
            float width = (getWidth() - m5Var.c()) / 2.0f;
            this.z0 = width;
            float dp4 = m5Var.p ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(16.0f) + this.O + this.K;
            this.A0 = dp4;
            canvas3.translate(width, dp4);
            m5Var.a(canvas3);
            t0 t0Var2 = this.T0;
            if (t0Var2 == null || t0Var2.h()) {
                m5Var.b(canvas3);
            }
            canvas3.restore();
        } else if (this.C0 != null) {
            canvas3.save();
            this.C0.a(canvas3);
            canvas3.restore();
        } else if (K(messageObject) || (messageObject != null && messageObject.type == 11)) {
            fh.b2 b2Var = this.G0;
            if (b2Var != null && ((i9 = messageObject.type) == 31 || i9 == 37 || i9 == 33)) {
                b2Var.setBounds((int) (imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (imageReceiver.getImageWidth() + imageReceiver.getImageX() + AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(14.0f)));
                this.G0.draw(canvas3);
            }
            if (this.F != null) {
                canvas3.save();
                canvas3.translate(imageReceiver.getImageX(), imageReceiver.getImageY());
                Path path = this.G;
                if (path == null) {
                    this.G = new Path();
                } else {
                    path.rewind();
                }
                this.G.addCircle(imageReceiver.getImageWidth() / 2.0f, imageReceiver.getImageHeight() / 2.0f, imageReceiver.getImageWidth() / 2.0f, Path.Direction.CW);
                canvas3.clipPath(this.G);
                this.F.setBounds(0, 0, (int) imageReceiver.getImageWidth(), (int) imageReceiver.getImageHeight());
                this.F.draw(canvas3);
                canvas3.restore();
            } else if (messageObject.isStoryMention()) {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                long j10 = messageMedia.user_id;
                l7Var.c = messageMedia.id;
                ih.p7.h(j10, canvas3, imageReceiver, l7Var);
            } else {
                imageReceiver.draw(canvas3);
            }
            if (messageObject.type == 37) {
                ff.s.a(canvas3, org.telegram.ui.ActionBar.f6.S0, imageReceiver.getImageX() + AndroidUtilities.dp(26.0f), imageReceiver.getImageY() + AndroidUtilities.dp(26.0f), AndroidUtilities.dp(52.0f));
            }
            radialProgress22.a.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageWidth() + imageReceiver.getImageX(), imageReceiver.getImageHeight() + imageReceiver.getImageY());
            int i21 = messageObject.type;
            if (i21 == 21) {
                e40 e40Var = MessagesController.getInstance(this.D).photoSuggestion.get(messageObject.messageOwner.local_id);
                if (e40Var != null) {
                    radialProgress22.o(e40Var.S, true);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.getImageWidth() * 0.5f)) + 1);
                    radialProgress22.G = AndroidUtilities.dp(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.f6.le, org.telegram.ui.ActionBar.f6.me, org.telegram.ui.ActionBar.f6.ne, org.telegram.ui.ActionBar.f6.oe);
                    if (e40Var.S == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                }
                radialProgress22.draw(canvas3);
            } else if (i21 == 22) {
                float H = H(messageObject);
                radialProgress22.o(H, true);
                radialProgress22.setCircleRadius(AndroidUtilities.dp(26.0f));
                radialProgress22.G = AndroidUtilities.dp(24.0f);
                radialProgress22.g(org.telegram.ui.ActionBar.f6.le, org.telegram.ui.ActionBar.f6.me, org.telegram.ui.ActionBar.f6.ne, org.telegram.ui.ActionBar.f6.oe);
                if (H == 1.0f) {
                    radialProgress22.setIcon(4, true, true);
                } else {
                    radialProgress22.setIcon(3, true, true);
                }
                radialProgress22.draw(canvas3);
                textPaint = this.o0;
                arrayList = this.l0;
                if (textPaint != null || this.I == null) {
                    radialProgress2 = radialProgress22;
                    textPaint2 = textPaint5;
                    i10 = 22;
                } else {
                    canvas3.save();
                    canvas3.translate(this.P, this.O);
                    if (this.I.getPaint() != this.o0) {
                        r();
                    }
                    canvas3.save();
                    dh.l.d(canvas3, arrayList);
                    dh.l.f(canvas3, this.I);
                    t0 t0Var3 = this.T0;
                    if (t0Var3 == null || t0Var3.h()) {
                        StaticLayout staticLayout2 = this.I;
                        textPaint2 = textPaint5;
                        radialProgress2 = radialProgress22;
                        i10 = 22;
                        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, staticLayout2, this.n0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout2 == null ? null : E(staticLayout2.getPaint().getColor()));
                        canvas3 = canvas;
                    } else {
                        radialProgress2 = radialProgress22;
                        textPaint2 = textPaint5;
                        i10 = 22;
                    }
                    canvas3.restore();
                    int size2 = arrayList.size();
                    int i22 = 0;
                    while (i22 < size2) {
                        Object obj = arrayList.get(i22);
                        i22++;
                        dh.l lVar = (dh.l) obj;
                        lVar.h(this.I.getPaint().getColor());
                        lVar.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (this.o0 != null && this.L != null) {
                    canvas3.save();
                    canvas3.translate(this.Q, this.O - this.M);
                    if (this.L.getPaint() != this.o0) {
                        r();
                    }
                    canvas3.save();
                    dh.l.d(canvas3, arrayList);
                    dh.l.f(canvas3, this.L);
                    t0Var = this.T0;
                    if (t0Var != null || t0Var.h()) {
                        StaticLayout staticLayout3 = this.L;
                        org.telegram.ui.Components.p5 p5Var = this.n0;
                        StaticLayout staticLayout4 = this.I;
                        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, staticLayout3, p5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout4 != null ? null : E(staticLayout4.getPaint().getColor()));
                        canvas3 = canvas;
                    }
                    canvas3.restore();
                    size = arrayList.size();
                    i14 = 0;
                    while (i14 < size) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        dh.l lVar2 = (dh.l) obj2;
                        lVar2.h(this.L.getPaint().getColor());
                        lVar2.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (m5Var.d() && K(messageObject)) {
                    canvas3.save();
                    float f24 = (this.R - this.W0) / 2.0f;
                    if (messageObject.type != i10) {
                        f24 += AndroidUtilities.dp(8.0f);
                    }
                    float f25 = f24;
                    if (M()) {
                        RectF rectF = this.A1;
                        float dp5 = rectF != null ? rectF.top : AndroidUtilities.dp(4.0f) + this.O + this.K;
                        if (i20 > 0) {
                            f10 = 16.0f;
                            dp2 = org.telegram.messenger.l0.D(16.0f, 2, i20);
                        } else {
                            f10 = 16.0f;
                            dp2 = AndroidUtilities.dp(16.0f);
                        }
                        f11 = dp5 + dp2;
                    } else {
                        f10 = 16.0f;
                        float f26 = (this.W0 * 0.075f) + this.O + this.K;
                        if (messageObject.type != 21) {
                            i20 = this.V0;
                        }
                        float dp6 = f26 + i20 + AndroidUtilities.dp(4.0f);
                        if (messageObject.type == 21) {
                            dp6 += AndroidUtilities.dp(16.0f);
                        }
                        f11 = dp6;
                        if (messageObject.isStarGiftAction()) {
                            f11 += AndroidUtilities.dp(12.0f);
                        } else if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                            f11 -= AndroidUtilities.dp(3.66f);
                        }
                    }
                    int i23 = messageObject.type;
                    if (i23 == 31 || i23 == 37 || i23 == 33) {
                        f11 -= AndroidUtilities.dp(3.66f);
                    }
                    canvas3.translate(f25, f11);
                    if (this.X0 != null) {
                        canvas3.save();
                        canvas3.translate(((this.W0 - AndroidUtilities.dp(f10)) - this.X0.getWidth()) / 2.0f, 0.0f);
                        this.X0.draw(canvas3);
                        canvas3.restore();
                        float height = this.X0.getHeight() + f11;
                        if (this.a1 != null) {
                            canvas3.save();
                            canvas3.translate(((this.W0 - AndroidUtilities.dp(f10)) - this.a1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + this.X0.getHeight());
                            this.a1.draw(canvas3);
                            canvas3.restore();
                            height += AndroidUtilities.dp(10.0f) + this.a1.getHeight();
                        }
                        dp = height + AndroidUtilities.dp(messageObject.type == 25 ? 6.0f : 0.0f);
                    } else {
                        dp = f11 - AndroidUtilities.dp(4.0f);
                    }
                    float f27 = dp;
                    canvas3.restore();
                    if (this.X0 == null || (nz0Var2 = this.Z0) == null) {
                        canvas2 = canvas3;
                        f12 = 0.0f;
                    } else {
                        float l10 = nz0Var2.l() + AndroidUtilities.dp(12.0f);
                        float A = e2.c.A(this.W0 - AndroidUtilities.dp(f10), l10, 2.0f, f25);
                        float height2 = f11 + this.X0.getHeight() + AndroidUtilities.dp(14.0f);
                        if (this.Y0 == null) {
                            this.Y0 = new Paint(1);
                        }
                        this.Y0.setColor(org.telegram.ui.ActionBar.f6.e1() ? 285212671 : TLObject.FLAG_28);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(A, height2 - AndroidUtilities.dp(8.0f), l10 + A, AndroidUtilities.dp(8.0f) + height2);
                        canvas3.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.Y0);
                        Canvas canvas4 = canvas3;
                        f12 = 0.0f;
                        this.Z0.c(A + AndroidUtilities.dp(6.0f), height2, 1.0f, -855638017, canvas4);
                        canvas2 = canvas4;
                        f27 += AndroidUtilities.dp(24.0f);
                    }
                    float dp7 = f27 + AndroidUtilities.dp(4.0f);
                    if (messageObject.type == 18) {
                        dp7 += AndroidUtilities.dp(2.0f);
                    }
                    float f28 = dp7;
                    canvas2.save();
                    canvas2.translate(f25, f28);
                    if (messageObject.type == i10) {
                        RadialProgress2 radialProgress23 = radialProgress2;
                        if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                            i11 = 4;
                            if (radialProgress23.a() == 4) {
                                if (this.g1 != null) {
                                    canvas2.save();
                                    canvas2.translate((this.W0 - ((StaticLayout) this.g1.f).getWidth()) / 2.0f, f12);
                                    this.g1.b = ((this.W0 - ((StaticLayout) r3.f).getWidth()) / 2.0f) + f25;
                                    this.g1.e = f28;
                                    int color = textPaint2.getColor();
                                    u0 u0Var2 = this.g1;
                                    f13 = 8.0f;
                                    f14 = 16.0f;
                                    dh.l.g(this, false, color, 0, (AtomicReference) u0Var2.g, 1, (StaticLayout) u0Var2.f, u0Var2.c, canvas, false);
                                    u0 u0Var3 = this.g1;
                                    org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, (StaticLayout) u0Var3.f, (org.telegram.ui.Components.p5) u0Var3.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, E(textPaint2.getColor()));
                                    canvas3 = canvas;
                                    canvas3.restore();
                                    w0Var = this;
                                } else {
                                    f13 = 8.0f;
                                    f14 = 16.0f;
                                    w0Var = this;
                                    canvas3 = canvas2;
                                }
                                canvas3.restore();
                                if (w0Var.X0 == null) {
                                    AndroidUtilities.dp(f13);
                                }
                                u0Var = w0Var.g1;
                                if (u0Var != null) {
                                    AndroidUtilities.lerp(w0Var.d1, ((StaticLayout) u0Var.f).getHeight(), e10);
                                }
                                staticLayout = w0Var.l1;
                                if (staticLayout != null) {
                                    staticLayout.getHeight();
                                }
                                w0Var.getHeight();
                                AndroidUtilities.dp(f13);
                                b6Var = w0Var.U0;
                                if (b6Var == null) {
                                    b6Var.o(w0Var.q0, w0Var.p0 + AndroidUtilities.dp(4.0f), w0Var.getMeasuredWidth(), w0Var.r0);
                                } else {
                                    org.telegram.ui.ActionBar.f6.q(w0Var.q0, w0Var.p0 + AndroidUtilities.dp(4.0f), w0Var.getMeasuredWidth(), w0Var.r0);
                                }
                                float a3 = w0Var.n.a(0.02f);
                                canvas3.save();
                                RectF rectF3 = w0Var.k0;
                                canvas3.scale(a3, a3, rectF3.centerX(), rectF3.centerY());
                                if (w0Var.l1 != null) {
                                    canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), w0Var.G("paintChatActionBackgroundSelected"));
                                    if (w0Var.I()) {
                                        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), w0Var.G("paintChatActionBackgroundDarken"));
                                    }
                                    float f29 = w0Var.O1;
                                    Paint paint = w0Var.P1;
                                    if (f29 > 0.0f) {
                                        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                    }
                                    if (w0Var.getMessageObject().type == 31 || w0Var.getMessageObject().type == 37 || w0Var.getMessageObject().type == 33) {
                                        boolean a10 = b6Var != null ? b6Var.a() : org.telegram.ui.ActionBar.f6.e1();
                                        int color2 = paint.getColor();
                                        paint.setColor(a10 ? 620756991 : TLObject.FLAG_28);
                                        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                        paint.setColor(color2);
                                    }
                                    if (w0Var.getMessageObject().type == 31 || w0Var.getMessageObject().type == 37 || w0Var.getMessageObject().type == 33 || w0Var.getMessageObject().type == 21 || w0Var.getMessageObject().type == 22 || w0Var.getMessageObject().type == 24) {
                                        w0Var.invalidate();
                                    } else {
                                        Path path2 = w0Var.I1;
                                        path2.rewind();
                                        path2.addRoundRect(rectF3, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), Path.Direction.CW);
                                        canvas3.save();
                                        canvas3.clipPath(path2);
                                        w0Var.J1.d(canvas3);
                                        if (!w0Var.J1.g) {
                                            w0Var.invalidate();
                                        }
                                        canvas3.restore();
                                    }
                                }
                                z10 = messageObject.settingAvatar;
                                if (z10) {
                                    float f30 = w0Var.V;
                                    if (f30 != 1.0f) {
                                        w0Var.V = f30 + 0.10666667f;
                                        f15 = 0.0f;
                                        clamp = Utilities.clamp(w0Var.V, 1.0f, f15);
                                        w0Var.V = clamp;
                                        if (clamp != f15) {
                                            if (w0Var.U == null) {
                                                w0Var.U = new RadialProgressView(w0Var.getContext());
                                            }
                                            int dp8 = AndroidUtilities.dp(f14);
                                            canvas3.save();
                                            float f31 = w0Var.V;
                                            canvas3.scale(f31, f31, rectF3.centerX(), rectF3.centerY());
                                            w0Var.U.setSize(dp8);
                                            w0Var.U.setProgressColor(org.telegram.ui.ActionBar.f6.u0(org.telegram.ui.ActionBar.f6.ic));
                                            w0Var.U.a(canvas3, rectF3.centerX(), rectF3.centerY());
                                            canvas3.restore();
                                        }
                                        if (w0Var.V != 1.0f && w0Var.l1 != null) {
                                            canvas3.save();
                                            float f32 = 1.0f - w0Var.V;
                                            canvas3.scale(f32, f32, rectF3.centerX(), rectF3.centerY());
                                            canvas3.translate(f25, rectF3.top + AndroidUtilities.dp(7.0f));
                                            canvas3.translate(((w0Var.W0 - AndroidUtilities.dp(f14)) - w0Var.l1.getWidth()) / 2.0f, 0.0f);
                                            w0Var.l1.draw(canvas3);
                                            canvas3.restore();
                                        }
                                        if (messageObject.flickerLoading) {
                                            p80 p80Var = w0Var.r;
                                            if (p80Var != null) {
                                                p80Var.d(rectF3);
                                                w0Var.r.j(16.0f);
                                                w0Var.r.a();
                                                w0Var.r.draw(canvas3);
                                                if (w0Var.r.b()) {
                                                    w0Var.r.b = -1L;
                                                }
                                            }
                                        } else {
                                            if (w0Var.r == null) {
                                                p80 p80Var2 = new p80(b6Var);
                                                w0Var.r = p80Var2;
                                                p80Var2.g();
                                                p80 p80Var3 = w0Var.r;
                                                p80Var3.C = true;
                                                p80Var3.f(org.telegram.ui.ActionBar.f6.l1(0.08f, -1), org.telegram.ui.ActionBar.f6.l1(0.2f, -1), org.telegram.ui.ActionBar.f6.l1(0.2f, -1), org.telegram.ui.ActionBar.f6.l1(0.7f, -1));
                                                w0Var.r.w.setStrokeWidth(AndroidUtilities.dp(1.0f));
                                            }
                                            p80 p80Var4 = w0Var.r;
                                            p80Var4.c = -1L;
                                            p80Var4.d(rectF3);
                                            w0Var.r.j(16.0f);
                                            w0Var.r.draw(canvas3);
                                        }
                                        canvas3.restore();
                                        if (w0Var.A1 != null && w0Var.F1 != null && w0Var.G1 != null) {
                                            G = w0Var.G("paintChatActionBackground");
                                            Paint G2 = w0Var.G("paintChatActionBackgroundDarken");
                                            float dp9 = (w0Var.A1.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                            float dp10 = w0Var.A1.top - AndroidUtilities.dp(2.0f);
                                            if (b6Var == null) {
                                                b6Var.o(w0Var.q0 + dp9, w0Var.p0 + AndroidUtilities.dp(4.0f) + dp10, w0Var.getMeasuredWidth(), w0Var.r0);
                                            } else {
                                                org.telegram.ui.ActionBar.f6.q(w0Var.q0 + dp9, w0Var.p0 + AndroidUtilities.dp(4.0f) + dp10, w0Var.getMeasuredWidth(), w0Var.r0);
                                            }
                                            canvas3.save();
                                            canvas3.translate(dp9, dp10);
                                            ColorFilter colorFilter = G.getColorFilter();
                                            PathEffect pathEffect = G.getPathEffect();
                                            a2 = b6Var == null ? b6Var.a() : org.telegram.ui.ActionBar.f6.e1();
                                            if (w0Var.D1 != null || w0Var.C1 != a2) {
                                                colorMatrix = new ColorMatrix();
                                                if ((G.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                                    ((ColorMatrixColorFilter) G.getColorFilter()).getColorMatrix(colorMatrix);
                                                }
                                                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !a2 ? 0.1f : -0.08f);
                                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !a2 ? 0.15f : 0.1f);
                                                w0Var.D1 = new ColorMatrixColorFilter(colorMatrix);
                                                w0Var.C1 = a2;
                                            }
                                            G.setColorFilter(w0Var.D1);
                                            G.setPathEffect(w0Var.E1);
                                            canvas3.drawPath(w0Var.F1, G);
                                            G.setColorFilter(colorFilter);
                                            G.setPathEffect(pathEffect);
                                            if (w0Var.I()) {
                                                PathEffect pathEffect2 = G2.getPathEffect();
                                                G2.setPathEffect(w0Var.E1);
                                                canvas3.drawPath(w0Var.F1, G2);
                                                G2.setPathEffect(pathEffect2);
                                            }
                                            canvas3.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                            w0Var.G1.c(AndroidUtilities.dp(40.43f) - (w0Var.G1.h() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas3);
                                            canvas3.restore();
                                        }
                                    }
                                }
                                if (!z10) {
                                    float f33 = w0Var.V;
                                    f15 = 0.0f;
                                    if (f33 != 0.0f) {
                                        w0Var.V = f33 - 0.10666667f;
                                    }
                                    clamp = Utilities.clamp(w0Var.V, 1.0f, f15);
                                    w0Var.V = clamp;
                                    if (clamp != f15) {
                                    }
                                    if (w0Var.V != 1.0f) {
                                        canvas3.save();
                                        float f322 = 1.0f - w0Var.V;
                                        canvas3.scale(f322, f322, rectF3.centerX(), rectF3.centerY());
                                        canvas3.translate(f25, rectF3.top + AndroidUtilities.dp(7.0f));
                                        canvas3.translate(((w0Var.W0 - AndroidUtilities.dp(f14)) - w0Var.l1.getWidth()) / 2.0f, 0.0f);
                                        w0Var.l1.draw(canvas3);
                                        canvas3.restore();
                                    }
                                    if (messageObject.flickerLoading) {
                                    }
                                    canvas3.restore();
                                    if (w0Var.A1 != null) {
                                        G = w0Var.G("paintChatActionBackground");
                                        Paint G22 = w0Var.G("paintChatActionBackgroundDarken");
                                        float dp92 = (w0Var.A1.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                        float dp102 = w0Var.A1.top - AndroidUtilities.dp(2.0f);
                                        if (b6Var == null) {
                                        }
                                        canvas3.save();
                                        canvas3.translate(dp92, dp102);
                                        ColorFilter colorFilter2 = G.getColorFilter();
                                        PathEffect pathEffect3 = G.getPathEffect();
                                        if (b6Var == null) {
                                        }
                                        if (w0Var.D1 != null) {
                                        }
                                        colorMatrix = new ColorMatrix();
                                        if (G.getColorFilter() instanceof ColorMatrixColorFilter) {
                                            ((ColorMatrixColorFilter) G.getColorFilter()).getColorMatrix(colorMatrix);
                                        }
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !a2 ? 0.1f : -0.08f);
                                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !a2 ? 0.15f : 0.1f);
                                        w0Var.D1 = new ColorMatrixColorFilter(colorMatrix);
                                        w0Var.C1 = a2;
                                        G.setColorFilter(w0Var.D1);
                                        G.setPathEffect(w0Var.E1);
                                        canvas3.drawPath(w0Var.F1, G);
                                        G.setColorFilter(colorFilter2);
                                        G.setPathEffect(pathEffect3);
                                        if (w0Var.I()) {
                                        }
                                        canvas3.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                        w0Var.G1.c(AndroidUtilities.dp(40.43f) - (w0Var.G1.h() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas3);
                                        canvas3.restore();
                                    }
                                }
                                f15 = 0.0f;
                                clamp = Utilities.clamp(w0Var.V, 1.0f, f15);
                                w0Var.V = clamp;
                                if (clamp != f15) {
                                }
                                if (w0Var.V != 1.0f) {
                                }
                                if (messageObject.flickerLoading) {
                                }
                                canvas3.restore();
                                if (w0Var.A1 != null) {
                                }
                            }
                        } else {
                            i11 = 4;
                        }
                        canvas3 = canvas2;
                        f13 = 8.0f;
                        f14 = 16.0f;
                        if (this.o1 == null) {
                            TextPaint textPaint8 = new TextPaint();
                            this.n1 = textPaint8;
                            textPaint8.setTextSize(AndroidUtilities.dp(13.0f));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                            int indexOf = spannableStringBuilder.toString().indexOf("...");
                            if (indexOf < 0) {
                                indexOf = spannableStringBuilder.toString().indexOf("…");
                                i13 = 1;
                            } else {
                                i13 = 3;
                            }
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString("…");
                                ih.s9 s9Var = new ih.s9();
                                s9Var.r = true;
                                s9Var.a(this);
                                spannableString.setSpan(s9Var, 0, spannableString.length(), 33);
                                spannableStringBuilder.replace(indexOf, i13 + indexOf, (CharSequence) spannableString);
                            }
                            TextPaint textPaint9 = this.n1;
                            u0 u0Var4 = this.g1;
                            this.o1 = new StaticLayout(spannableStringBuilder, textPaint9, u0Var4 == null ? 1 : u0Var4.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        float H2 = H(messageObject);
                        if (this.q1 == null || this.p1 != H2) {
                            this.p1 = H2;
                            String l11 = aa.d.l((int) (H2 * 100.0f), "%", new StringBuilder());
                            u0 u0Var5 = this.g1;
                            TextPaint textPaint10 = textPaint2;
                            textPaint3 = textPaint10;
                            this.q1 = new StaticLayout(l11, textPaint10, u0Var5 == null ? 1 : u0Var5.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            textPaint3 = textPaint2;
                        }
                        this.n1.setColor(textPaint3.getColor());
                        if (radialProgress23.a() == i11) {
                            float b10 = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                            int color3 = textPaint3.getColor();
                            float f34 = 1.0f - b10;
                            this.n1.setAlpha((int) (Color.alpha(color3) * f34));
                            textPaint3.setAlpha((int) (Color.alpha(color3) * b10));
                            textPaint3.linkColor = textPaint3.getColor();
                            if (this.g1 != null) {
                                float f35 = (b10 * 0.2f) + 0.8f;
                                canvas3.save();
                                canvas3.scale(f35, f35, this.W0 / 2.0f, ((StaticLayout) this.g1.f).getHeight() / 2.0f);
                                canvas3.translate((this.W0 - ((StaticLayout) this.g1.f).getWidth()) / 2.0f, 0.0f);
                                this.g1.b = ((this.W0 - ((StaticLayout) r0.f).getWidth()) / 2.0f) + f25;
                                this.g1.e = f28;
                                int color4 = textPaint3.getColor();
                                u0 u0Var6 = this.g1;
                                i12 = color3;
                                dh.l.g(this, false, color4, 0, (AtomicReference) u0Var6.g, 1, (StaticLayout) u0Var6.f, u0Var6.c, canvas3, false);
                                u0 u0Var7 = this.g1;
                                w0Var2 = this;
                                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, (StaticLayout) u0Var7.f, (org.telegram.ui.Components.p5) u0Var7.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, E(textPaint3.getColor()));
                                canvas3 = canvas;
                                canvas3.restore();
                            } else {
                                w0Var2 = this;
                                i12 = color3;
                            }
                            textPaint3.setAlpha((int) (Color.alpha(i12) * f34));
                            textPaint3.linkColor = textPaint3.getColor();
                            float f36 = (f34 * 0.2f) + 0.8f;
                            canvas3.save();
                            canvas3.scale(f36, f36, w0Var2.W0 / 2.0f, w0Var2.o1.getHeight() / 2.0f);
                            canvas3.translate((w0Var2.W0 - w0Var2.o1.getWidth()) / 2.0f, 0.0f);
                            dh.l.f(canvas3, w0Var2.o1);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.translate(0.0f, AndroidUtilities.dp(4.0f) + w0Var2.o1.getHeight());
                            canvas3.scale(f36, f36, w0Var2.W0 / 2.0f, w0Var2.q1.getHeight() / 2.0f);
                            canvas3.translate((w0Var2.W0 - w0Var2.q1.getWidth()) / 2.0f, 0.0f);
                            dh.l.f(canvas3, w0Var2.q1);
                            canvas3.restore();
                            textPaint3.setColor(i12);
                            textPaint3.linkColor = i12;
                        } else {
                            w0Var2 = this;
                            canvas3.save();
                            canvas3.translate((w0Var2.W0 - w0Var2.o1.getWidth()) / 2.0f, 0.0f);
                            w0Var2.o1.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.translate((w0Var2.W0 - w0Var2.q1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + w0Var2.o1.getHeight());
                            dh.l.f(canvas3, w0Var2.q1);
                            canvas3.restore();
                        }
                        w0Var = w0Var2;
                        canvas3.restore();
                        if (w0Var.X0 == null) {
                        }
                        u0Var = w0Var.g1;
                        if (u0Var != null) {
                        }
                        staticLayout = w0Var.l1;
                        if (staticLayout != null) {
                        }
                        w0Var.getHeight();
                        AndroidUtilities.dp(f13);
                        b6Var = w0Var.U0;
                        if (b6Var == null) {
                        }
                        float a32 = w0Var.n.a(0.02f);
                        canvas3.save();
                        RectF rectF32 = w0Var.k0;
                        canvas3.scale(a32, a32, rectF32.centerX(), rectF32.centerY());
                        if (w0Var.l1 != null) {
                        }
                        z10 = messageObject.settingAvatar;
                        if (z10) {
                        }
                        if (!z10) {
                        }
                        f15 = 0.0f;
                        clamp = Utilities.clamp(w0Var.V, 1.0f, f15);
                        w0Var.V = clamp;
                        if (clamp != f15) {
                        }
                        if (w0Var.V != 1.0f) {
                        }
                        if (messageObject.flickerLoading) {
                        }
                        canvas3.restore();
                        if (w0Var.A1 != null) {
                        }
                    } else {
                        w0Var2 = this;
                        canvas3 = canvas2;
                        TextPaint textPaint11 = textPaint2;
                        f13 = 8.0f;
                        f14 = 16.0f;
                        u0 u0Var8 = w0Var2.g1;
                        if (u0Var8 != null) {
                            float height3 = ((StaticLayout) u0Var8.f).getHeight();
                            if (e10 < 1.0f) {
                                height3 = AndroidUtilities.lerp(w0Var2.d1, height3, e10);
                                RectF rectF4 = AndroidUtilities.rectTmp;
                                rectF4.set(0.0f, -AndroidUtilities.dp(20.0f), w0Var2.getWidth(), height3);
                                canvas3.saveLayerAlpha(rectF4, 255, 31);
                            } else {
                                canvas3.save();
                            }
                            canvas3.translate(((w0Var2.W0 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) w0Var2.g1.f).getWidth()) / 2.0f, 0.0f);
                            w0Var2.g1.b = (((w0Var2.W0 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) w0Var2.g1.f).getWidth()) / 2.0f) + f25;
                            u0 u0Var9 = w0Var2.g1;
                            u0Var9.e = f28;
                            int color5 = u0Var9.a.getColor();
                            u0 u0Var10 = w0Var2.g1;
                            float f37 = height3;
                            dh.l.g(w0Var2, false, color5, 0, (AtomicReference) u0Var10.g, 1, (StaticLayout) u0Var10.f, u0Var10.c, canvas3, false);
                            u0 u0Var11 = w0Var2.g1;
                            StaticLayout staticLayout5 = (StaticLayout) u0Var11.f;
                            org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) u0Var11.h;
                            ColorFilter E = w0Var2.E(textPaint11.getColor());
                            w0Var = w0Var2;
                            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, staticLayout5, p5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, E);
                            canvas3 = canvas;
                            if (e10 < 1.0f && w0Var.k1 != null) {
                                canvas3.save();
                                if (w0Var.f1 == null) {
                                    w0Var.f1 = new s10();
                                }
                                canvas3.translate((-((w0Var.W0 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) w0Var.g1.f).getWidth())) / 2.0f, 0.0f);
                                RectF rectF5 = AndroidUtilities.rectTmp;
                                rectF5.set((w0Var.h1 - w0Var.k1.h()) + AndroidUtilities.dp(8.0f), (w0Var.i1 - w0Var.j1) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + w0Var.h1, w0Var.i1);
                                float f38 = 1.0f - e10;
                                w0Var.f1.a(canvas3, rectF5, f38);
                                rectF5.set((w0Var.h1 - w0Var.k1.h()) - AndroidUtilities.dp(16.0f), (w0Var.i1 - w0Var.j1) - AndroidUtilities.dp(6.0f), (w0Var.h1 - w0Var.k1.h()) + AndroidUtilities.dp(8.0f), w0Var.i1);
                                w0Var.f1.b(canvas3, rectF5, 2, f38);
                                rectF5.set(0.0f, f37 - AndroidUtilities.dp(12.0f), w0Var.getWidth(), f37);
                                w0Var.f1.b(canvas3, rectF5, 3, (1.0f - f38) * f38 * 4.0f);
                                canvas3.restore();
                            }
                            canvas3.restore();
                            if (e10 < 1.0f && (nz0Var = w0Var.k1) != null) {
                                nz0Var.c((w0Var.h1 - nz0Var.h()) + AndroidUtilities.dp(5.0f), (w0Var.i1 - (w0Var.j1 / 2.0f)) - AndroidUtilities.dp(1.0f), 1.0f - e10, w0Var.g1.a.getColor(), canvas3);
                            }
                            canvas3.restore();
                            if (w0Var.X0 == null) {
                            }
                            u0Var = w0Var.g1;
                            if (u0Var != null) {
                            }
                            staticLayout = w0Var.l1;
                            if (staticLayout != null) {
                            }
                            w0Var.getHeight();
                            AndroidUtilities.dp(f13);
                            b6Var = w0Var.U0;
                            if (b6Var == null) {
                            }
                            float a322 = w0Var.n.a(0.02f);
                            canvas3.save();
                            RectF rectF322 = w0Var.k0;
                            canvas3.scale(a322, a322, rectF322.centerX(), rectF322.centerY());
                            if (w0Var.l1 != null) {
                            }
                            z10 = messageObject.settingAvatar;
                            if (z10) {
                            }
                            if (!z10) {
                            }
                            f15 = 0.0f;
                            clamp = Utilities.clamp(w0Var.V, 1.0f, f15);
                            w0Var.V = clamp;
                            if (clamp != f15) {
                            }
                            if (w0Var.V != 1.0f) {
                            }
                            if (messageObject.flickerLoading) {
                            }
                            canvas3.restore();
                            if (w0Var.A1 != null) {
                            }
                        }
                        w0Var = w0Var2;
                        canvas3.restore();
                        if (w0Var.X0 == null) {
                        }
                        u0Var = w0Var.g1;
                        if (u0Var != null) {
                        }
                        staticLayout = w0Var.l1;
                        if (staticLayout != null) {
                        }
                        w0Var.getHeight();
                        AndroidUtilities.dp(f13);
                        b6Var = w0Var.U0;
                        if (b6Var == null) {
                        }
                        float a3222 = w0Var.n.a(0.02f);
                        canvas3.save();
                        RectF rectF3222 = w0Var.k0;
                        canvas3.scale(a3222, a3222, rectF3222.centerX(), rectF3222.centerY());
                        if (w0Var.l1 != null) {
                        }
                        z10 = messageObject.settingAvatar;
                        if (z10) {
                        }
                        if (!z10) {
                        }
                        f15 = 0.0f;
                        clamp = Utilities.clamp(w0Var.V, 1.0f, f15);
                        w0Var.V = clamp;
                        if (clamp != f15) {
                        }
                        if (w0Var.V != 1.0f) {
                        }
                        if (messageObject.flickerLoading) {
                        }
                        canvas3.restore();
                        if (w0Var.A1 != null) {
                        }
                    }
                } else {
                    w0Var = this;
                }
                w0Var.A(canvas3, false);
                w0Var.e2.a();
                canvas3.restore();
            }
            textPaint = this.o0;
            arrayList = this.l0;
            if (textPaint != null) {
            }
            radialProgress2 = radialProgress22;
            textPaint2 = textPaint5;
            i10 = 22;
            if (this.o0 != null) {
                canvas3.save();
                canvas3.translate(this.Q, this.O - this.M);
                if (this.L.getPaint() != this.o0) {
                }
                canvas3.save();
                dh.l.d(canvas3, arrayList);
                dh.l.f(canvas3, this.L);
                t0Var = this.T0;
                if (t0Var != null) {
                }
                StaticLayout staticLayout32 = this.L;
                org.telegram.ui.Components.p5 p5Var3 = this.n0;
                StaticLayout staticLayout42 = this.I;
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, staticLayout32, p5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout42 != null ? null : E(staticLayout42.getPaint().getColor()));
                canvas3 = canvas;
                canvas3.restore();
                size = arrayList.size();
                i14 = 0;
                while (i14 < size) {
                }
                canvas3.restore();
            }
            if (m5Var.d()) {
            }
            w0Var = this;
            w0Var.A(canvas3, false);
            w0Var.e2.a();
            canvas3.restore();
        }
        textPaint = this.o0;
        arrayList = this.l0;
        if (textPaint != null) {
        }
        radialProgress2 = radialProgress22;
        textPaint2 = textPaint5;
        i10 = 22;
        if (this.o0 != null) {
        }
        if (m5Var.d()) {
        }
        w0Var = this;
        w0Var.A(canvas3, false);
        w0Var.e2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        MessageObject messageObject = this.D0;
        if (TextUtils.isEmpty(this.F0) && messageObject == null) {
            return;
        }
        if (this.Z1 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.F0) ? this.F0 : messageObject.messageText);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new i(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.Z1 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.Z1.toString());
        } else {
            accessibilityNodeInfo.setText(this.Z1);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        RectF rectF = this.k0;
        this.H1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i9, int i10) {
        int i11;
        boolean d;
        float f10;
        float dp;
        float dp2;
        float f11;
        TLRPC.Message message;
        int i12;
        int dp3;
        int i13;
        int dp4;
        int i14;
        MessageObject messageObject = this.D0;
        if (messageObject == null && this.F0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(14.0f) + this.h0 + this.K);
            return;
        }
        if (K(messageObject)) {
            this.W0 = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            if ((!AndroidUtilities.isTablet() && ((i14 = messageObject.type) == 18 || i14 == 30 || L())) || messageObject.type == 35) {
                this.W0 = (int) (this.W0 * 1.2f);
            }
            this.V0 = this.W0 - AndroidUtilities.dp(106.0f);
            if (messageObject.type == 31) {
                this.W0 = Math.min(this.W0, AndroidUtilities.dp(192.0f));
                this.V0 = AndroidUtilities.dp(78.0f);
            }
            if (messageObject.type == 33) {
                this.W0 = Math.min(this.W0, AndroidUtilities.dp(220.0f));
                this.V0 = AndroidUtilities.dp(78.0f);
            }
            int i15 = messageObject.type;
            ImageReceiver imageReceiver = this.E;
            if (i15 == 37) {
                this.V0 = AndroidUtilities.dp(52.0f);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
            } else if (M()) {
                imageReceiver.setRoundRadius(this.V0 / 2);
            } else {
                imageReceiver.setRoundRadius(0);
            }
        }
        int max = Math.max(AndroidUtilities.dp(30.0f), View.MeasureSpec.getSize(i9));
        if (this.R != max) {
            this.w0 = true;
            this.R = max;
            r();
        }
        if (messageObject != null) {
            if (messageObject.type == 11) {
                i13 = AndroidUtilities.roundMessageSize;
                dp4 = AndroidUtilities.dp(10.0f);
            } else if (K(messageObject)) {
                i13 = this.W0;
                dp4 = AndroidUtilities.dp(12.0f);
            }
            i11 = dp4 + i13;
            gh.m5 m5Var = this.B0;
            d = m5Var.d();
            hg.s0 s0Var = this.y0;
            if (!d) {
                r9 = org.telegram.messenger.l0.C(8.0f, m5Var.M, m5Var.p ? 0 : AndroidUtilities.dp(16.0f) + this.O + this.K);
                if (!s0Var.s) {
                    dp3 = AndroidUtilities.dp(8.0f) + s0Var.o;
                    s0Var.p = dp3;
                    r9 += dp3;
                }
                if (this.D0 != null && !s0Var.s) {
                    int dp5 = AndroidUtilities.dp(8.0f) + s0Var.o;
                    s0Var.p = dp5;
                    i11 += dp5;
                }
                if (L()) {
                    i11 = org.telegram.messenger.l0.C(24.0f, this.M, i11);
                }
                if (messageObject == null && M()) {
                    setMeasuredDimension(max, this.h0 + r9);
                } else {
                    setMeasuredDimension(max, AndroidUtilities.dp(14.0f) + this.h0 + this.K + i11);
                }
                s0Var.d = (getMeasuredHeight() - getPaddingTop()) - s0Var.p;
                return;
            }
            ox0 ox0Var = this.C0;
            if (ox0Var != null) {
                r9 = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(140.0f) + ((int) ox0Var.f.j()) + (ox0Var.i ? AndroidUtilities.dp(40.0f) : 0);
                if (!s0Var.s) {
                    dp3 = AndroidUtilities.dp(8.0f) + s0Var.o;
                    s0Var.p = dp3;
                    r9 += dp3;
                }
            } else if (K(messageObject)) {
                boolean z10 = messageObject != null && messageObject.type == 25;
                int F = F(messageObject);
                if (M()) {
                    f10 = 8.0f;
                    int dp6 = AndroidUtilities.dp(4.0f) + this.O + this.K + (F > 0 ? org.telegram.messenger.l0.D(16.0f, 2, F) : AndroidUtilities.dp(16.0f));
                    u0 u0Var = this.g1;
                    dp = dp6 + (u0Var == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) u0Var.f).getHeight());
                } else {
                    f10 = 8.0f;
                    dp = (this.g1 == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) r2.f).getHeight()) + (this.W0 * 0.075f) + this.O + this.K + F + AndroidUtilities.dp(4.0f);
                }
                this.y1 = 0;
                if (this.X0 != null) {
                    float height = dp + r4.getHeight();
                    if (this.X0.getLineCount() > 1) {
                        this.y1 = (this.X0.getHeight() - this.X0.getLineTop(1)) + this.y1;
                    }
                    dp2 = height + AndroidUtilities.dp(z10 ? 6.0f : 0.0f);
                    if (this.a1 != null) {
                        dp2 += AndroidUtilities.dp(9.0f) + r3.getHeight();
                    }
                    if (this.Z0 != null) {
                        dp2 += AndroidUtilities.dp(24.0f);
                    }
                } else {
                    dp2 = dp - AndroidUtilities.dp(12.0f);
                    this.y1 -= AndroidUtilities.dp(30.0f);
                }
                u0 u0Var2 = this.g1;
                int height2 = u0Var2 == null ? 0 : ((StaticLayout) u0Var2.f).getHeight();
                if (this.g1 == null) {
                    this.y1 = 0;
                } else if (this.a1 != null) {
                    this.y1 = org.telegram.messenger.l0.C(10.0f, height2, this.y1);
                } else {
                    MessageObject messageObject2 = this.D0;
                    if (messageObject2.type == 18 || messageObject2.isStarGiftAction()) {
                        this.y1 = ll.D(this.l1 == null ? 0.0f : 10.0f, height2, this.y1);
                    } else if (this.D0.type == 30) {
                        this.y1 = ll.D(20.0f, height2, this.y1);
                    } else if (this.c1) {
                        this.y1 += height2;
                    } else if (((StaticLayout) this.g1.f).getLineCount() > 2) {
                        this.y1 = ((((StaticLayout) this.g1.f).getLineCount() * (((StaticLayout) this.g1.f).getLineBottom(0) - ((StaticLayout) this.g1.f).getLineTop(0))) - 2) + this.y1;
                    }
                }
                if (this.Z0 != null) {
                    this.y1 = AndroidUtilities.dp(24.0f) + this.y1;
                }
                int dp7 = this.y1 - AndroidUtilities.dp(z10 ? 14.0f : 0.0f);
                this.y1 = dp7;
                i11 += dp7;
                int dp8 = AndroidUtilities.dp(14.0f) + this.K + i11;
                StaticLayout staticLayout = this.l1;
                RectF rectF = this.k0;
                if (staticLayout != null) {
                    float A = e2.c.A((dp8 - dp2) - staticLayout.getHeight(), AndroidUtilities.dp(f10), 2.0f, dp2);
                    if (this.D0.isStarGiftAction()) {
                        A += AndroidUtilities.dp(4.0f);
                    }
                    float f12 = (this.R - this.r1) / 2.0f;
                    f11 = 2.0f;
                    rectF.set(f12 - AndroidUtilities.dp(18.0f), A - AndroidUtilities.dp(f10), f12 + this.r1 + AndroidUtilities.dp(18.0f), A + (this.l1 != null ? r6.getHeight() : 0) + AndroidUtilities.dp(f10));
                } else {
                    f11 = 2.0f;
                    i11 -= AndroidUtilities.dp(40.0f);
                    this.y1 -= AndroidUtilities.dp(40.0f);
                    MessageObject messageObject3 = this.D0;
                    if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        i11 -= AndroidUtilities.dp(f10);
                        this.y1 -= AndroidUtilities.dp(f10);
                    }
                }
                int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                zf.v1 v1Var = this.J1;
                v1Var.a.set(rectF);
                v1Var.b.set(rectF);
                if (this.K1 != measuredWidth) {
                    this.K1 = measuredWidth;
                    v1Var.f();
                }
                if (M()) {
                    int dp9 = AndroidUtilities.dp(4.0f) + this.O + this.K;
                    this.f = 0;
                    int D = F > 0 ? org.telegram.messenger.l0.D(16.0f, 2, F) : AndroidUtilities.dp(16.0f);
                    this.f = D;
                    StaticLayout staticLayout2 = this.a1;
                    if (staticLayout2 != null) {
                        this.f = org.telegram.messenger.l0.C(10.0f, staticLayout2.getHeight(), D);
                    }
                    if (this.Z0 != null) {
                        this.f = AndroidUtilities.dp(15.0f) + this.f;
                    }
                    int i16 = this.f + height2;
                    this.f = i16;
                    float f13 = (this.R - this.r1) / f11;
                    if (this.l1 != null) {
                        this.h = AndroidUtilities.dp(7.0f) + i16 + dp9;
                        rectF.set(f13 - AndroidUtilities.dp(18.0f), this.h, f13 + this.r1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.l0.D(8.0f, 2, this.l1.getHeight() + this.h));
                        this.f = (int) (rectF.height() + AndroidUtilities.dp(4.0f) + this.f);
                    } else if (!L() && (i12 = messageObject.type) != 34 && i12 != 33 && i12 != 35) {
                        rectF.set(f13 - AndroidUtilities.dp(18.0f), this.h, f13 + this.r1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.l0.D(8.0f, 2, AndroidUtilities.dp(17.0f) + this.h));
                        this.f = AndroidUtilities.dp(17.0f) + this.f;
                    }
                    int dp10 = AndroidUtilities.dp(15.0f) + this.f;
                    this.f = dp10;
                    int dp11 = AndroidUtilities.dp(6.0f) + dp9 + dp10;
                    if (!s0Var.s) {
                        int dp12 = AndroidUtilities.dp(8.0f) + s0Var.o;
                        s0Var.p = dp12;
                        dp11 += dp12;
                    }
                    r9 = dp11;
                    if (this.M1 != null) {
                        r9 += AndroidUtilities.dp(44.0f);
                    }
                }
                rectF.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
            }
            if (this.D0 != null) {
                int dp52 = AndroidUtilities.dp(8.0f) + s0Var.o;
                s0Var.p = dp52;
                i11 += dp52;
            }
            if (L()) {
            }
            if (messageObject == null) {
            }
            setMeasuredDimension(max, AndroidUtilities.dp(14.0f) + this.h0 + this.K + i11);
            s0Var.d = (getMeasuredHeight() - getPaddingTop()) - s0Var.p;
            return;
        }
        i11 = 0;
        gh.m5 m5Var2 = this.B0;
        d = m5Var2.d();
        hg.s0 s0Var2 = this.y0;
        if (!d) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.D0;
        if (messageObject == null || messageObject.type != 11) {
            return;
        }
        int size = messageObject.photoThumbs.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                photoSize = null;
                break;
            }
            photoSize = messageObject.photoThumbs.get(i9);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i9++;
            }
        }
        this.E.setImage(this.t0, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.H, 0L, null, messageObject, 1);
        DownloadController.getInstance(this.D).removeLoadingFileObserver(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        e40 e40Var;
        u0 u0Var;
        u0 u0Var2;
        TLRPC.Message message;
        boolean z10;
        int i9;
        BotInlineKeyboard.ButtonCustom buttonCustom;
        MessageObject messageObject;
        TLRPC.Message message2;
        MessageObject messageObject2;
        TLRPC.Message message3;
        TLRPC.Message message4;
        long j10;
        TLObject chat;
        int i10;
        SpannableStringBuilder replaceTags;
        boolean z11;
        boolean z12;
        StaticLayout staticLayout;
        ArrayList arrayList;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        TLRPC.Message message5;
        int i11;
        MessageObject messageObject3 = this.D0;
        float x10 = motionEvent.getX() - (this.f0 / 2.0f);
        this.u0 = x10;
        float y10 = motionEvent.getY() + getPaddingTop();
        this.v0 = y10;
        if (messageObject3 == null) {
            if (this.R1 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.O0 && x10 <= this.P0) {
                        this.B = true;
                        return true;
                    }
                } else if (this.B) {
                    if (motionEvent.getAction() == 1) {
                        this.R1.onClick(this);
                        this.B = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.B = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        h11 h11Var = this.j0;
        if (h11Var != null && h11Var.d(motionEvent, false)) {
            return true;
        }
        ox0 ox0Var = this.C0;
        if (ox0Var != null) {
            pc pcVar = ox0Var.m;
            boolean contains = ox0Var.k.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                pcVar.c(contains);
            } else if (motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1) {
                    if (pcVar.h) {
                        ox0Var.b();
                    }
                    pcVar.c(false);
                } else if (motionEvent.getAction() == 3) {
                    pcVar.c(false);
                }
            }
            if (pcVar.h) {
                return true;
            }
        }
        gh.m5 m5Var = this.B0;
        if ((m5Var.d() && m5Var.e(this.z0, this.A0, motionEvent)) || this.y0.c(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        gf.b bVar = gf.b.a;
        RectF rectF = this.k0;
        ImageReceiver imageReceiver = this.E;
        int i12 = this.D;
        View view = this.H1;
        pc pcVar2 = this.n;
        if (action == 0) {
            if (this.T0 != null) {
                if ((messageObject3.type == 11 || K(messageObject3)) && imageReceiver.isInsideImage(x10, y10)) {
                    this.S = true;
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.x1.i.q == 4 && (((i11 = messageObject3.type) == 21 || i11 == 22) && this.A1.contains(x10, y10))) {
                    this.S = true;
                    z13 = true;
                }
                u0 u0Var3 = this.g1;
                if (u0Var3 == null || !this.c1) {
                    z14 = z13;
                } else {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f10 = u0Var3.b;
                    z14 = z13;
                    rectF2.set(f10, u0Var3.e, ((StaticLayout) u0Var3.f).getWidth() + f10, this.g1.e + ((StaticLayout) r1.f).getHeight());
                    if (rectF2.contains(x10, y10)) {
                        this.A = true;
                        z15 = true;
                        if (K(messageObject3) || this.l1 == null || !(rectF.contains(x10, y10) || (this.m1 && this.A1.contains(x10, y10)))) {
                            z16 = true;
                        } else {
                            z16 = true;
                            this.T = true;
                            view.setPressed(true);
                            pcVar2.c(true);
                            z15 = true;
                        }
                        if (!z15 && L()) {
                            this.A = z16;
                            z15 = true;
                        }
                        if (!z15) {
                            MessageObject messageObject4 = this.D0;
                            if (gf.d.g((messageObject4 == null || (message5 = messageObject4.messageOwner) == null) ? null : message5.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                this.A = true;
                                z15 = true;
                            }
                        }
                        if (z15) {
                            q();
                        }
                        z10 = z15;
                    }
                }
                z15 = z14;
                if (K(messageObject3)) {
                }
                z16 = true;
                if (!z15) {
                    this.A = z16;
                    z15 = true;
                }
                if (!z15) {
                }
                if (z15) {
                }
                z10 = z15;
            }
            z10 = false;
        } else {
            if (motionEvent.getAction() != 2) {
                k();
            }
            if (this.B) {
                if (motionEvent.getAction() == 2) {
                    if (x10 < this.O0 || x10 > this.P0) {
                        z10 = false;
                        this.B = false;
                    }
                } else if (motionEvent.getAction() == 1) {
                    View.OnClickListener onClickListener = this.R1;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    this.B = false;
                } else if (motionEvent.getAction() == 3) {
                    this.B = false;
                }
                z10 = false;
            } else {
                if (this.A) {
                    int action2 = motionEvent.getAction();
                    if (action2 == 1) {
                        this.A = false;
                        view.setPressed(false);
                        pcVar2.c(false);
                        if (this.T0 == null || messageObject3.replyMessageObject == null || (message = messageObject3.messageOwner) == null || !gf.d.g(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                            if (this.c1 && !this.b1 && (u0Var2 = this.g1) != null) {
                                int height = ((StaticLayout) u0Var2.f).getHeight() - this.d1;
                                this.b1 = true;
                                t0 t0Var = this.T0;
                                if (t0Var == null) {
                                    return true;
                                }
                                t0Var.I(this);
                                if (!(getParent() instanceof wk0)) {
                                    return true;
                                }
                                ((wk0) getParent()).v0(0, AndroidUtilities.dp(24.0f) + height, null);
                                return true;
                            }
                            if (this.C0 != null && this.A1.contains(motionEvent.getX(), motionEvent.getY())) {
                                this.C0.b();
                                return true;
                            }
                        } else {
                            this.T0.E(this, this.D0.getReplyMsgId());
                        }
                    } else if (action2 == 2) {
                        u0 u0Var4 = this.g1;
                        if (u0Var4 == null || !this.c1) {
                            this.A = false;
                        } else {
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            float f11 = u0Var4.b;
                            rectF3.set(f11, u0Var4.e, ((StaticLayout) u0Var4.f).getWidth() + f11, this.g1.e + ((StaticLayout) r9.f).getHeight());
                            if (!rectF3.contains(x10, y10)) {
                                this.A = false;
                            }
                        }
                        z10 = true;
                    } else if (action2 == 3) {
                        this.A = false;
                        pcVar2.c(false);
                    }
                } else if (this.T) {
                    int action3 = motionEvent.getAction();
                    if (action3 == 1) {
                        this.S = false;
                        this.T = false;
                        view.setPressed(false);
                        pcVar2.c(false);
                        if (this.T0 != null) {
                            int i13 = messageObject3.type;
                            if (i13 == 37) {
                                playSoundEffect(0);
                                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                if (U != null) {
                                    new nh.j0(U, ((TLRPC.TL_messageActionChangeCommunity) messageObject3.messageOwner.action).community_id, null, null).show();
                                }
                            } else if (i13 == 31) {
                                playSoundEffect(0);
                                R();
                            } else if (i13 == 25) {
                                playSoundEffect(0);
                                if (this.T0 != null) {
                                    AndroidUtilities.runOnUIThread(new ka(4, this, (TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action));
                                }
                            } else if (i13 == 18) {
                                playSoundEffect(0);
                                Q();
                            } else if (i13 == 30) {
                                playSoundEffect(0);
                                R();
                            } else {
                                TLRPC.Message message6 = messageObject3.messageOwner;
                                if (message6 != null) {
                                    TLRPC.MessageAction messageAction = message6.action;
                                    if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                        playSoundEffect(0);
                                        MessageSuggestionParams obtainSuggestionOffer = this.D0.obtainSuggestionOffer();
                                        gf.a aVar = obtainSuggestionOffer.amount;
                                        if (aVar != null && aVar.a == bVar) {
                                            new gh.ea(getContext(), this.U0, obtainSuggestionOffer.amount.a(), 13, vf.c.h(i12, this.D0.getDialogId()), null, this.D0.getDialogId()).show();
                                        }
                                    }
                                }
                                if (MessagesController.getInstance(i12).photoSuggestion.get(messageObject3.messageOwner.local_id) == null) {
                                    if (this.m1) {
                                        this.T0.O(this);
                                    } else {
                                        this.T0.c0(this);
                                    }
                                }
                            }
                        }
                    } else if (action3 != 2) {
                        if (action3 == 3) {
                            this.S = false;
                            this.T = false;
                            view.setPressed(false);
                            pcVar2.c(false);
                        }
                    } else if (!K(messageObject3) || (!rectF.contains(x10, y10) && !this.A1.contains(x10, y10))) {
                        this.T = false;
                        view.setPressed(false);
                        pcVar2.c(false);
                    }
                } else if (this.S) {
                    int action4 = motionEvent.getAction();
                    if (action4 == 1) {
                        this.S = false;
                        if (this.c1 && !this.b1 && (u0Var = this.g1) != null) {
                            int height2 = ((StaticLayout) u0Var.f).getHeight() - this.d1;
                            this.b1 = true;
                            t0 t0Var2 = this.T0;
                            if (t0Var2 == null) {
                                return true;
                            }
                            t0Var2.I(this);
                            if (!(getParent() instanceof wk0)) {
                                return true;
                            }
                            ((wk0) getParent()).v0(0, AndroidUtilities.dp(16.0f) + height2, null);
                            return true;
                        }
                        int i14 = messageObject3.type;
                        if (i14 == 31) {
                            R();
                        } else if (i14 == 25) {
                            if (this.T0 != null) {
                                AndroidUtilities.runOnUIThread(new ka(4, this, (TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action));
                            }
                        } else if (i14 == 18) {
                            Q();
                        } else if (i14 == 30) {
                            R();
                        } else if (this.T0 != null) {
                            if (i14 != 21 || (e40Var = MessagesController.getInstance(i12).photoSuggestion.get(messageObject3.messageOwner.local_id)) == null) {
                                this.T0.O(this);
                                playSoundEffect(0);
                            } else {
                                e40Var.c();
                            }
                        }
                    } else if (action4 != 2) {
                        if (action4 == 3) {
                            this.S = false;
                        }
                    } else if (M()) {
                        if (!this.A1.contains(x10, y10)) {
                            this.S = false;
                        }
                    } else if (!imageReceiver.isInsideImage(x10, y10)) {
                        this.S = false;
                    }
                }
                z10 = false;
            }
        }
        if (!z10 && (motionEvent.getAction() == 0 || ((this.x != null || this.y != null) && motionEvent.getAction() == 1))) {
            u0 u0Var5 = this.g1;
            if (u0Var5 != null && (arrayList = u0Var5.c) != null && !arrayList.isEmpty() && !this.C) {
                ArrayList arrayList2 = this.g1.c;
                int size = arrayList2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i15);
                    i15++;
                    dh.l lVar = (dh.l) obj;
                    Rect bounds = lVar.getBounds();
                    u0 u0Var6 = this.g1;
                    if (bounds.contains((int) (x10 - u0Var6.b), (int) (y10 - u0Var6.e))) {
                        this.x = null;
                        if (motionEvent.getAction() == 0) {
                            this.y = lVar;
                        } else {
                            dh.l lVar2 = this.y;
                            if (lVar == lVar2) {
                                this.C = true;
                                lVar2.q = new s0(this, 2);
                                float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.g1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.g1.f).getWidth(), 2.0d));
                                dh.l lVar3 = this.y;
                                u0 u0Var7 = this.g1;
                                lVar3.j((int) (x10 - u0Var7.b), (int) (y10 - u0Var7.e), sqrt, false);
                                invalidate();
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (staticLayout = this.I) != null) {
                if (x10 >= this.N) {
                    float f12 = this.O;
                    if (y10 >= f12 && x10 <= r7 + this.J && y10 <= r8 + this.K) {
                        float f13 = y10 - f12;
                        float f14 = x10 - this.P;
                        if (!z10) {
                            int lineForVertical = staticLayout.getLineForVertical((int) f13);
                            int offsetForHorizontal = this.I.getOffsetForHorizontal(lineForVertical, f14);
                            float lineLeft = this.I.getLineLeft(lineForVertical);
                            if (lineLeft <= f14 && this.I.getLineWidth(lineForVertical) + lineLeft >= f14) {
                                CharSequence charSequence = messageObject3.messageText;
                                if (charSequence instanceof Spannable) {
                                    URLSpan[] uRLSpanArr = (URLSpan[]) ((Spannable) charSequence).getSpans(offsetForHorizontal, offsetForHorizontal, URLSpan.class);
                                    if (uRLSpanArr.length != 0) {
                                        if (motionEvent.getAction() == 0) {
                                            this.x = uRLSpanArr[0];
                                        } else {
                                            URLSpan uRLSpan = uRLSpanArr[0];
                                            URLSpan uRLSpan2 = this.x;
                                            if (uRLSpan == uRLSpan2) {
                                                P(uRLSpan2);
                                            }
                                        }
                                        z10 = true;
                                    } else {
                                        this.x = null;
                                    }
                                }
                            }
                            this.x = null;
                        }
                    }
                }
            }
            this.x = null;
        }
        if (!z10) {
            ArrayList arrayList3 = this.L1;
            if (!arrayList3.isEmpty()) {
                int x11 = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                float width = (getWidth() - this.W0) / 2.0f;
                float dp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.O + this.K + this.f;
                float dp2 = (this.W0 - AndroidUtilities.dp(4.0f)) / 2.0f;
                int action5 = motionEvent.getAction();
                org.telegram.ui.ActionBar.b6 b6Var = this.U0;
                if (action5 == 0) {
                    this.Y1 = -1;
                    for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                        e0 e0Var = (e0) arrayList3.get(i16);
                        float dp3 = ((AndroidUtilities.dp(4.0f) + dp2) * i16) + width;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(dp3, dp, dp3 + dp2, e0Var.f + dp);
                        float f15 = x11;
                        float f16 = y11;
                        if (rectF4.contains(f15, f16)) {
                            this.Y1 = i16;
                            J();
                            if (e0Var.s == null) {
                                z Y = org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.nc, b6Var), 6, 6);
                                e0Var.s = Y;
                                Y.setCallback(this);
                            }
                            e0Var.s.setHotspot(f15, f16);
                            e0Var.s.setState(this.X1);
                            e0Var.b(!e0Var.m);
                            z12 = true;
                            z10 = z12;
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.Y1 != -1) {
                        playSoundEffect(0);
                        e0 e0Var2 = (e0) arrayList3.get(this.Y1);
                        z zVar = e0Var2.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (this.T0 != null && !e0Var2.m && (buttonCustom = e0Var2.j) != null && getMessageObject() != null) {
                            int i17 = buttonCustom.id;
                            if (i17 == 5) {
                                t0 t0Var3 = this.T0;
                                org.telegram.ui.ActionBar.o2 y02 = t0Var3 != null ? t0Var3.y0() : null;
                                if (y02 != null && this.D0 != null) {
                                    org.telegram.ui.Components.y4.v0(y02, LocaleController.getString(R.string.GiftOfferRejectConfirmTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferRejectConfirmText, DialogObject.getShortName(this.D0.getDialogId()))), LocaleController.getString(R.string.GiftOfferRejectConfirmConfirm), true, new ka(2, this, y02));
                                }
                            } else if (i17 == 6) {
                                MessageObject messageObject5 = this.D0;
                                if (messageObject5 != null && (message4 = messageObject5.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction2 = message4.action;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                                        Context context = getContext();
                                        long dialogId = this.D0.getDialogId();
                                        int id2 = this.D0.getId();
                                        int[] iArr = gh.o0.s0;
                                        gf.a m10 = gf.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                        gf.b bVar2 = m10.a;
                                        gf.a i18 = gf.a.i((m10.b * (bVar2 == bVar ? MessagesController.getInstance(i12).config.starsStarGiftResaleCommissionPermille.get() : MessagesController.getInstance(i12).config.tonStarGiftResaleCommissionPermille.get())) / 1000, bVar2);
                                        TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(starGift.title);
                                        sb2.append(" #");
                                        String n10 = j3.r0.n(starGift.num, ',', sb2);
                                        if (dialogId >= 0) {
                                            j10 = 0;
                                            chat = MessagesController.getInstance(i12).getUser(Long.valueOf(dialogId));
                                        } else {
                                            j10 = 0;
                                            chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-dialogId));
                                        }
                                        String d = m10.d();
                                        String d9 = i18.d();
                                        boolean z17 = bVar2 == gf.b.b;
                                        LinearLayout f17 = ll.f(context, 1);
                                        f17.addView(new gh.k4(context, starGift, chat), g7.e6.t(-1, -2, 48, 0, -4, 0, 0));
                                        TextView textView = new TextView(context);
                                        ll.n(org.telegram.ui.ActionBar.f6.j5, b6Var, textView, 1, 16.0f);
                                        textView.setText(AndroidUtilities.replaceTags(bVar2 == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellStars, d, DialogObject.getShortName(dialogId), n10, d9) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellTON, d, DialogObject.getShortName(dialogId), n10, d9)));
                                        f17.addView(textView, g7.e6.t(-1, -2, 48, 24, 4, 24, 4));
                                        FrameLayout frameLayout = new FrameLayout(context);
                                        frameLayout.setClipChildren(false);
                                        frameLayout.setClipToPadding(false);
                                        wy0 wy0Var = new wy0(context, b6Var);
                                        frameLayout.addView(wy0Var, g7.e6.e(-1, -1, 119));
                                        gh.k5.q1(wy0Var, gh.v7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                        gh.k5.q1(wy0Var, gh.v7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        gh.k5.q1(wy0Var, gh.v7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                        f17.addView(frameLayout, g7.e6.t(-1, -2, 48, 23, 16, 23, 4));
                                        gf.a j11 = gf.a.j(starGift.value_usd_amount / Math.pow(10.0d, BillingController.getInstance().getCurrencyExp("USD")), bVar2);
                                        if (j11.c() > 0.0d && starGift.value_usd_amount > j10) {
                                            if (j11.b >= i18.b) {
                                                int round = (int) Math.round((1.0d - (i18.c() / j11.c())) * 100.0d);
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountLowerHint2, ta.b.c(round, "%"), starGift.title));
                                                z11 = round > 10;
                                                i10 = 1;
                                            } else {
                                                i10 = 1;
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, ta.b.c((int) Math.round(((i18.c() / j11.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                z11 = false;
                                            }
                                            TextView textView2 = new TextView(context);
                                            textView2.setTextSize(i10, 13.0f);
                                            textView2.setGravity(17);
                                            textView2.setText(replaceTags);
                                            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(z11 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.y6, b6Var));
                                            f17.addView(textView2, g7.e6.t(-1, -2, 49, 40, 12, 40, 9));
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
                                        alertDialog$Builder.n(f17);
                                        alertDialog$Builder.k(gh.oa.S0(LocaleController.formatString(R.string.GiftOfferSellFor, d9), z17), new gh.h0(id2, i12, R));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder.a.show();
                                    }
                                }
                            } else if (i17 == 7) {
                                t0 t0Var4 = this.T0;
                                org.telegram.ui.ActionBar.o2 y03 = t0Var4 != null ? t0Var4.y0() : null;
                                if (y03 != null && (messageObject2 = this.D0) != null && (message3 = messageObject2.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction3 = message3.action;
                                    if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                        final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                        final int i19 = 0;
                                        org.telegram.ui.Components.y4.v0(y03, LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelText : R.string.SharingOfferEnableCancelText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) { // from class: org.telegram.ui.Cells.p0
                                            public final /* synthetic */ w0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i19) {
                                                    case 0:
                                                        w0 w0Var = this.b;
                                                        MessagesController.getInstance(w0Var.D).toggleChatNoForwards(w0Var.D0.getDialogId(), w0Var.D0.getId(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                        break;
                                                    default:
                                                        w0 w0Var2 = this.b;
                                                        MessagesController.getInstance(w0Var2.D).toggleChatNoForwards(w0Var2.D0.getDialogId(), w0Var2.D0.getId(), tL_messageActionNoForwardsRequest.new_value, null);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            } else if (i17 == 8) {
                                t0 t0Var5 = this.T0;
                                org.telegram.ui.ActionBar.o2 y04 = t0Var5 != null ? t0Var5.y0() : null;
                                if (y04 != null && (messageObject = this.D0) != null && (message2 = messageObject.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction4 = message2.action;
                                    if (messageAction4 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                        final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction4;
                                        final int i20 = 1;
                                        org.telegram.ui.Components.y4.v0(y04, LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableConfirmText : R.string.SharingOfferEnableConfirmText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) { // from class: org.telegram.ui.Cells.p0
                                            public final /* synthetic */ w0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        w0 w0Var = this.b;
                                                        MessagesController.getInstance(w0Var.D).toggleChatNoForwards(w0Var.D0.getDialogId(), w0Var.D0.getId(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                        break;
                                                    default:
                                                        w0 w0Var2 = this.b;
                                                        MessagesController.getInstance(w0Var2.D).toggleChatNoForwards(w0Var2.D0.getDialogId(), w0Var2.D0.getId(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                        this.Y1 = -1;
                        J();
                    }
                } else if (motionEvent.getAction() == 3 && (i9 = this.Y1) != -1) {
                    e0 e0Var3 = (e0) arrayList3.get(i9);
                    z zVar2 = e0Var3.s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var3.b(false);
                    this.Y1 = -1;
                    J();
                }
            }
            z12 = false;
            z10 = z12;
        }
        return !z10 ? super.onTouchEvent(motionEvent) : z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x06df, code lost:
    
        if (r9 == false) goto L314;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r() {
        long j10;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence string;
        CharSequence charSequence3;
        boolean z10;
        CharSequence formatString;
        ArrayList<TLRPC.VideoSize> arrayList;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList2;
        CharSequence charSequence4;
        TL_stars.StarGift starGift;
        String str;
        CharSequence replaceTags;
        String str2;
        CharSequence charSequence5;
        SpannableStringBuilder spannableStringBuilder;
        String publicUsername;
        int i9;
        int i10;
        char c10;
        Object valueOf;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i11;
        TLRPC.Chat chat;
        TLRPC.User user;
        CharSequence replaceCharSequence;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.D0;
        int i12 = this.D;
        if (messageObject != null) {
            if (messageObject.isExpiredStory()) {
                charSequence = messageObject.messageOwner.media.user_id != UserConfig.getInstance(i12).getClientUserId() ? ih.p7.e(R.string.ExpiredStoryMention, true, new Object[0]) : ih.p7.e(R.string.ExpiredStoryMentioned, true, MessagesController.getInstance(i12).getUser(Long.valueOf(messageObject.getDialogId())).first_name);
            } else {
                t0 t0Var = this.T0;
                if (t0Var != null && t0Var.b() == 0 && MessageObject.isTopicActionMessage(messageObject)) {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i12).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(i12, messageObject.messageOwner, true));
                    int i13 = vf.c.a;
                    if (findTopic != null) {
                        TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), vf.c.j(findTopic, null, null));
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionTopicEdit) {
                            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction2;
                            long fromChatId = messageObject.getFromChatId();
                            if (DialogObject.isUserDialog(fromChatId)) {
                                user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                                chat = null;
                            } else {
                                chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId));
                                user = null;
                            }
                            String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : chat != null ? chat.title : null;
                            int i14 = tL_messageActionTopicEdit.flags;
                            if ((i14 & 8) != 0) {
                                charSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(tL_messageActionTopicEdit.hidden ? R.string.TopicHidden2 : R.string.TopicShown2), formatName);
                            } else {
                                j10 = 0;
                                if ((i14 & 4) != 0) {
                                    replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(tL_messageActionTopicEdit.closed ? R.string.TopicWasClosedAction : R.string.TopicWasReopenedAction), vf.c.j(findTopic, null, null)), formatName);
                                } else {
                                    int i15 = i14 & 1;
                                    if (i15 != 0 && (i14 & 2) != 0) {
                                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                        tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                        tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                        replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction2), vf.c.j(tL_forumTopic, null, null)), formatName);
                                    } else if (i15 != 0) {
                                        replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction), tL_messageActionTopicEdit.title), formatName);
                                    } else {
                                        if ((i14 & 2) != 0) {
                                            TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                            tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                            tL_forumTopic2.title = "";
                                            replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasIconChangedToAction), vf.c.j(tL_forumTopic2, null, null)), formatName);
                                        }
                                        charSequence = null;
                                        if (charSequence == null) {
                                            TLRPC.Message message2 = messageObject.messageOwner;
                                            if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                                                charSequence = org.telegram.ui.Components.t5.cloneSpans(messageObject.messageText);
                                            } else if (messageMedia.photo != null) {
                                                charSequence = LocaleController.getString(R.string.AttachPhotoExpired);
                                            } else {
                                                TLRPC.Document document = messageMedia.document;
                                                charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? LocaleController.getString(R.string.AttachVoiceExpired) : messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachVideoExpired) : org.telegram.ui.Components.t5.cloneSpans(messageObject.messageText);
                                            }
                                        }
                                    }
                                }
                                charSequence = replaceCharSequence;
                                if (charSequence == null) {
                                }
                            }
                        }
                    }
                }
                j10 = 0;
                charSequence = null;
                if (charSequence == null) {
                }
            }
            j10 = 0;
            if (charSequence == null) {
            }
        } else {
            j10 = 0;
            charSequence = this.F0;
        }
        MessageObject messageObject2 = this.D0;
        if (messageObject2 != null && messageObject2.isRepostPreview) {
            charSequence = "";
        }
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i11 = R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i11 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i11 = 0;
            }
            if (i11 != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                spannableStringBuilder2.insert(0, (CharSequence) "i ");
                spannableStringBuilder2.setSpan(new eq(i11, 0), 0, 1, 33);
                charSequence = spannableStringBuilder2;
            }
        }
        w(this.R, charSequence);
        if (this.C0 != null) {
            this.I = null;
            this.K = 0;
            this.L = null;
            this.M = 0;
            this.O = 0;
        }
        if (messageObject != null) {
            TLRPC.Message message3 = messageObject.messageOwner;
            if (message3 != null) {
                TLRPC.MessageAction messageAction3 = message3.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).balance_too_low) {
                    v(null, null, charSequence, false, !ChatObject.canManageMonoForum(i12, messageObject.getDialogId()) ? LocaleController.getString(R.string.StarsBuy) : null, 11, null, this.W0, false);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                }
            }
            CharSequence charSequence6 = charSequence;
            if (message3 != null) {
                TLRPC.MessageAction messageAction4 = message3.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction4).rejected) {
                    v(null, null, charSequence6, false, null, 11, null, this.W0, false);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                }
            }
            int i16 = messageObject.type;
            if (i16 == 11) {
                float dp = AndroidUtilities.dp(19.0f) + this.K;
                float f10 = AndroidUtilities.roundMessageSize;
                this.E.setImageCoords((this.R - AndroidUtilities.roundMessageSize) / 2.0f, dp, f10, f10);
            } else if (i16 == 25) {
                u();
            } else {
                TextPaint textPaint = this.t1;
                if (i16 == 30) {
                    TLRPC.User user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(this.D0.getDialogId()));
                    TLRPC.MessageAction messageAction5 = messageObject.messageOwner.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionGiftStars) {
                        v(LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction5).stars), null, AndroidUtilities.replaceTags(this.D0.isOutOwner() ? LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user2)) : LocaleController.getString(R.string.ActionGiftStarsSubtitleYou)), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                    } else if ((messageAction5 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction5).refunded) {
                        long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action;
                        if (messageObject.isOutOwner() != (!tL_messageActionStarGiftUnique.upgrade)) {
                            clientUserId = messageObject.getDialogId();
                        }
                        TLRPC.User user3 = MessagesController.getInstance(i12).getUser(Long.valueOf(clientUserId));
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(tL_messageActionStarGiftUnique.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                        if (user3 != null && user3.photo != null) {
                            spannableStringBuilder3.append((CharSequence) "a ");
                            org.telegram.ui.f5 f5Var = new org.telegram.ui.f5(this, 18.0f, i12);
                            f5Var.e(user3);
                            spannableStringBuilder3.setSpan(f5Var, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                        }
                        spannableStringBuilder3.append((CharSequence) UserObject.getForcedFirstName(user3));
                        v(spannableStringBuilder3, null, LocaleController.getString(R.string.Gift2ActionUpgradeRefundedText), false, LocaleController.getString(R.string.ActionGiftStarsView), 12, LocaleController.getString(R.string.Gift2UniqueRibbon), this.W0, true);
                    } else if (messageAction5 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction5;
                        long j11 = tL_messageActionStarGift.convert_stars;
                        long clientUserId2 = UserConfig.getInstance(i12).getClientUserId();
                        TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                        boolean z11 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                        boolean z12 = messageObject.getDialogId() == clientUserId2 && !z11;
                        long fromChatId2 = messageObject.getFromChatId();
                        if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                            fromChatId2 = DialogObject.getPeerDialogId(peer);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(fromChatId2);
                        long peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                        boolean z13 = z11;
                        TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(peerDialogId);
                        boolean z14 = tL_messageActionStarGift.can_upgrade && !tL_messageActionStarGift.converted && tL_messageActionStarGift.upgrade_stars > j10 && !tL_messageActionStarGift.upgraded;
                        if (peerDialogId != j10 && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTitleTo)).append((CharSequence) " ");
                            if (DialogObject.hasPhoto(userOrChat2)) {
                                spannableStringBuilder4.append((CharSequence) "a ");
                                org.telegram.ui.f5 f5Var2 = new org.telegram.ui.f5(this, 18.0f, i12);
                                int i17 = f5Var2.e;
                                org.telegram.ui.Components.z8 z8Var = f5Var2.c;
                                z8Var.j(i17, userOrChat2);
                                f5Var2.b.setForUserOrChat(userOrChat2, z8Var);
                                spannableStringBuilder4.setSpan(f5Var2, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                            }
                            spannableStringBuilder4.append((CharSequence) DialogObject.getShortName(userOrChat2));
                        } else if (!z12) {
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(tL_messageActionStarGift.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                            if (DialogObject.hasPhoto(userOrChat)) {
                                spannableStringBuilder4.append((CharSequence) "a ");
                                org.telegram.ui.f5 f5Var3 = new org.telegram.ui.f5(this, 18.0f, i12);
                                int i18 = f5Var3.e;
                                org.telegram.ui.Components.z8 z8Var2 = f5Var3.c;
                                z8Var2.j(i18, userOrChat);
                                f5Var3.b.setForUserOrChat(userOrChat, z8Var2);
                                spannableStringBuilder4.setSpan(f5Var3, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                            }
                            spannableStringBuilder4.append((CharSequence) DialogObject.getShortName(userOrChat));
                        } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                        } else {
                            spannableStringBuilder4.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) LocaleController.formatNumber(tL_messageActionStarGift.gift_num, ','));
                        }
                        boolean z15 = ((messageObject.isOutOwner() && !z12) || !tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j10 && MessagesController.getInstance(i12).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(i12).getCurrentTime() - messageObject.messageOwner.date) > 0 && !tL_messageActionStarGift.refunded;
                        if (tL_messageActionStarGift.refunded) {
                            replaceTags = LocaleController.getString(R.string.Gift2ActionConvertRefundedText);
                        } else {
                            TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                                MessageObject.addEntitiesToText(spannableStringBuilder5, tL_messageActionStarGift.message.entities, false, false, true, true);
                                replaceTags = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder5, textPaint.getFontMetricsInt(), false, (int[]) null), tL_messageActionStarGift.message.entities, textPaint.getFontMetricsInt());
                            } else if (tL_messageActionStarGift.auction_acquired) {
                                replaceTags = LocaleController.formatString(R.string.Gift2ActionWonActionText, LocaleController.formatNumber(tL_messageActionStarGift.gift.stars + tL_messageActionStarGift.upgrade_stars, ','));
                            } else if (z13) {
                                replaceTags = tL_messageActionStarGift.converted ? LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11) : (!z15 || j11 <= j10) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert)) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfoChannel", (int) j11));
                            } else if (z12) {
                                replaceTags = (!tL_messageActionStarGift.converted || j11 <= j10) ? tL_messageActionStarGift.can_upgrade ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert)) : LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                            } else if (z14) {
                                replaceTags = AndroidUtilities.replaceTags(messageObject.isOutOwner() ? LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user2)) : LocaleController.getString(R.string.Gift2ActionUpgrade));
                            } else {
                                replaceTags = messageObject.isOutOwner() ? (!z15 || j11 <= j10) ? tL_messageActionStarGift.can_upgrade ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j11, UserObject.getForcedFirstName(user2))) : tL_messageActionStarGift.converted ? LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11) : tL_messageActionStarGift.saved ? !z15 ? LocaleController.getString(R.string.Gift2ActionBotSavedInfo) : LocaleController.getString(R.string.Gift2ActionSavedInfo) : !z15 ? LocaleController.getString(R.string.Gift2ActionBotInfo) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                            }
                        }
                        TL_stars.StarGift starGift2 = tL_messageActionStarGift.gift;
                        if (starGift2 == null || !starGift2.limited) {
                            str2 = null;
                        } else {
                            int i19 = R.string.Gift2Limited1OfRibbon;
                            int i20 = starGift2.availability_total;
                            if (i20 > 1500) {
                                c10 = 0;
                                valueOf = AndroidUtilities.formatWholeNumber(i20, 0);
                            } else {
                                c10 = 0;
                                valueOf = Integer.valueOf(i20);
                            }
                            Object[] objArr = new Object[1];
                            objArr[c10] = valueOf;
                            str2 = LocaleController.formatString(i19, objArr);
                        }
                        CharSequence string2 = LocaleController.getString(R.string.ActionGiftStarsView);
                        if (messageObject.isOutOwner()) {
                            charSequence5 = string2;
                            if (!tL_messageActionStarGift.forceIn) {
                            }
                        }
                        charSequence5 = string2;
                        charSequence5 = string2;
                        if (!messageObject.isOutOwner() && z14) {
                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                            spannableStringBuilder6.append("^  ");
                            eq eqVar = new eq(R.drawable.gift_unpack, 0);
                            eqVar.setScale(0.8f, 0.8f);
                            spannableStringBuilder6.setSpan(eqVar, 0, 1, 33);
                            spannableStringBuilder6.append(LocaleController.getString(R.string.Gift2Unpack));
                            charSequence5 = spannableStringBuilder6;
                        }
                        TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                        if (starGift3 == null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                            spannableStringBuilder = null;
                        } else {
                            String formatString2 = LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@".concat(publicUsername));
                            int i21 = gh.k5.m1;
                            int indexOf = formatString2.indexOf("**");
                            int indexOf2 = formatString2.indexOf("**", indexOf + 1);
                            String replace = formatString2.replace("**", "");
                            if (indexOf < 0 || indexOf2 < 0 || (i10 = indexOf2 - indexOf) <= 2) {
                                indexOf = -1;
                                i9 = 0;
                            } else {
                                i9 = i10 - 2;
                            }
                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(replace);
                            if (indexOf >= 0) {
                                spannableStringBuilder7.setSpan(new gh.n3(0), indexOf, i9 + indexOf, 0);
                            }
                            spannableStringBuilder = spannableStringBuilder7;
                        }
                        v(spannableStringBuilder4, spannableStringBuilder, replaceTags, false, charSequence5, 11, str2, this.W0, true);
                    } else if (messageAction5 instanceof TLRPC.TL_messageActionGiftTon) {
                        v(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                        this.I = null;
                        this.K = 0;
                        this.L = null;
                        this.M = 0;
                        this.O = 0;
                    } else {
                        v(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.D0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.W0, true);
                        this.I = null;
                        this.K = 0;
                        this.L = null;
                        this.M = 0;
                        this.O = 0;
                    }
                } else if (i16 == 33) {
                    TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder(charSequence6);
                    spannableStringBuilder8.append((CharSequence) "\n\n");
                    if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                        spannableStringBuilder8.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                    } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                        spannableStringBuilder8.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                    } else {
                        int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i12).getCurrentTime());
                        if (max == 0) {
                            spannableStringBuilder8.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                        } else {
                            String formatShortDuration2 = LocaleController.formatShortDuration2(max);
                            if (formatShortDuration2.endsWith(".")) {
                                formatShortDuration2 = e2.c.m(formatShortDuration2, 1, 0);
                            }
                            spannableStringBuilder8.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, formatShortDuration2)));
                        }
                    }
                    v(null, null, spannableStringBuilder8, false, null, 11, null, this.W0, false);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                } else if (i16 == 34) {
                    v(null, null, charSequence6, false, null, 11, null, this.W0, false);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                } else if (i16 == 35) {
                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                    String shortName = DialogObject.getShortName(MessagesController.getInstance(i12).getUser(Long.valueOf(messageObject.getDialogId())));
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder9.append(messageObject.isOut() ? LocaleController.getString(R.string.SharingOfferDisableHeaderYou) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferDisableHeaderOther, shortName)));
                    } else {
                        spannableStringBuilder9.append(messageObject.isOut() ? LocaleController.getString(R.string.SharingOfferEnableHeaderYou) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SharingOfferEnableHeaderOther, shortName)));
                    }
                    if (tL_messageActionNoForwardsRequest.new_value) {
                        spannableStringBuilder9.append((CharSequence) "\n\n");
                        spannableStringBuilder9.append((CharSequence) x(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable1)));
                        spannableStringBuilder9.append((CharSequence) "\n\n");
                        spannableStringBuilder9.append((CharSequence) x(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable2)));
                        spannableStringBuilder9.append((CharSequence) "\n\n");
                        spannableStringBuilder9.append((CharSequence) x(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable3)));
                        spannableStringBuilder9.append((CharSequence) "\n\n");
                        spannableStringBuilder9.append((CharSequence) x(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferDisable4)));
                    } else {
                        spannableStringBuilder9.append((CharSequence) "\n\n");
                        spannableStringBuilder9.append((CharSequence) x(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable1)));
                        spannableStringBuilder9.append((CharSequence) "\n\n");
                        spannableStringBuilder9.append((CharSequence) x(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable2)));
                        spannableStringBuilder9.append((CharSequence) "\n\n");
                        spannableStringBuilder9.append((CharSequence) x(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable3)));
                        spannableStringBuilder9.append((CharSequence) "\n\n");
                        spannableStringBuilder9.append((CharSequence) x(R.drawable.floating_check, LocaleController.getString(R.string.SharingOfferEnable4)));
                    }
                    v(null, null, spannableStringBuilder9, false, null, 11, null, this.W0, false);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                } else if (i16 == 31) {
                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(starGift4.title);
                    sb2.append(" #");
                    String n10 = j3.r0.n(starGift4.num, ',', sb2);
                    long fromChatId3 = messageObject.getFromChatId();
                    v(null, null, AndroidUtilities.replaceTags(UserConfig.getInstance(i12).getClientUserId() == fromChatId3 ? LocaleController.formatString(R.string.GiftThemesSetByYou, n10) : LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i12, fromChatId3), n10)), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                } else if (i16 == 37) {
                    TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                    long peerDialogId2 = DialogObject.getPeerDialogId(message3.peer_id);
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(-peerDialogId2, i12);
                    boolean z16 = peerDialogId2 > j10;
                    String shortName2 = DialogObject.getShortName(i12, DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                    String shortName3 = DialogObject.getShortName(i12, -tL_messageActionChangeCommunity.community_id);
                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder();
                    spannableStringBuilder10.append((CharSequence) nh.r0.a(messageObject, shortName3, shortName2, isChannelAndNotMegaGroup, z16));
                    v(null, null, spannableStringBuilder10, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.W0, true);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                } else if (i16 == 18) {
                    TLRPC.MessageAction messageAction6 = message3.action;
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = messageAction6 instanceof TLRPC.TL_messageActionGiftPremium ? ((TLRPC.TL_messageActionGiftPremium) messageAction6).message : messageAction6 instanceof TLRPC.TL_messageActionGiftCode ? ((TLRPC.TL_messageActionGiftCode) messageAction6).message : null;
                    if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        charSequence4 = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder(tL_textWithEntities2.text);
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        MessageObject.addEntitiesToText(spannableStringBuilder11, tL_textWithEntities2.entities, false, false, true, true);
                        charSequence4 = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji((CharSequence) spannableStringBuilder11, textPaint.getFontMetricsInt(), false, (int[]) null), tL_textWithEntities2.entities, textPaint.getFontMetricsInt());
                    }
                    if (charSequence4 == null) {
                        charSequence4 = LocaleController.getString(R.string.ActionGiftPremiumText);
                    }
                    CharSequence charSequence7 = charSequence4;
                    MessageObject messageObject3 = this.D0;
                    v(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, charSequence7, true, LocaleController.getString((messageObject3 == null || !(messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionGiftCode) || N()) ? R.string.ActionGiftPremiumView : R.string.GiftPremiumUseGiftBtn), 11, null, this.W0, false);
                } else if (i16 == 21) {
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                    TLRPC.User user4 = MessagesController.getInstance(i12).getUser(Long.valueOf(messageObject.isOutOwner() ? j10 : messageObject.getDialogId()));
                    boolean z17 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                    if (user4.id == UserConfig.getInstance(i12).clientUserId) {
                        TLRPC.User user5 = MessagesController.getInstance(i12).getUser(Long.valueOf(messageObject.getDialogId()));
                        formatString = z17 ? LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user5.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user5.first_name);
                    } else {
                        formatString = z17 ? LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user4.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user4.first_name);
                    }
                    v(null, null, formatString, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? LocaleController.getString(R.string.ViewVideoAction) : LocaleController.getString(R.string.ViewPhotoAction), 11, null, this.W0, true);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                } else if (i16 == 22) {
                    TLRPC.User user6 = MessagesController.getInstance(i12).getUser(Long.valueOf(messageObject.isOutOwner() ? j10 : messageObject.getDialogId()));
                    if (messageObject.getDialogId() < j10) {
                        charSequence3 = messageObject.messageText;
                    } else if (!messageObject.isOutOwner() && messageObject.isWallpaperForBoth() && messageObject.isCurrentWallpaper()) {
                        charSequence2 = messageObject.messageText;
                        string = LocaleController.getString(R.string.RemoveWallpaperAction);
                        z10 = false;
                        v(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                        this.I = null;
                        this.K = 0;
                        this.L = null;
                        this.M = 0;
                        this.O = 0;
                    } else if (user6 == null || user6.id != UserConfig.getInstance(i12).clientUserId) {
                        charSequence2 = messageObject.messageText;
                        string = LocaleController.getString(R.string.ViewWallpaperAction);
                        z10 = true;
                        v(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                        this.I = null;
                        this.K = 0;
                        this.L = null;
                        this.M = 0;
                        this.O = 0;
                    } else {
                        charSequence3 = messageObject.messageText;
                    }
                    charSequence2 = charSequence3;
                    string = null;
                    z10 = true;
                    v(null, null, charSequence2, false, string, 11, null, this.W0, z10);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                } else if (messageObject.isStoryMention()) {
                    TLRPC.User user7 = MessagesController.getInstance(i12).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                    v(null, null, user7.self ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i12).getUser(Long.valueOf(messageObject.getDialogId())).first_name)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user7.first_name)), false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.W0, true);
                    this.I = null;
                    this.K = 0;
                    this.L = null;
                    this.M = 0;
                    this.O = 0;
                }
            }
        }
        int dp2 = AndroidUtilities.dp(12.0f);
        hg.s0 s0Var = this.y0;
        s0Var.c = dp2;
        s0Var.p(this.R - AndroidUtilities.dp(24.0f), 1);
    }

    public final void s() {
        float f10 = this.O0;
        RectF rectF = this.Q0;
        this.O0 = (int) Math.min(f10, rectF.left);
        this.P0 = (int) Math.max(this.P0, rectF.right);
    }

    public void setCustomText(CharSequence charSequence) {
        this.F0 = charSequence;
        if (charSequence != null) {
            W(false);
        }
    }

    public void setDelegate(t0 t0Var) {
        this.T0 = t0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.S0 == z10) {
            return;
        }
        this.S0 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.b2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.a2 = z10;
    }

    public void setMessageObject(MessageObject messageObject) {
        T(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.R1 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i9) {
        this.S1 = i9;
    }

    public void setScrimReaction(Integer num) {
        this.y0.C = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.i0 != z10) {
            this.i0 = z10;
            J();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        ArrayList arrayList = this.l0;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((dh.l) obj).invalidateSelf();
        }
    }

    public final boolean t(float f10, int i9) {
        hg.s0 s0Var = this.y0;
        if (!s0Var.K) {
            return false;
        }
        float y10 = getY() + s0Var.d;
        return y10 > f10 && (y10 + ((float) s0Var.o)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i9);
    }

    public final void u() {
        SpannableStringBuilder spannableStringBuilder;
        int dp = this.W0 - AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(14.0f);
        TextPaint textPaint = this.s1;
        textPaint.setTextSize(dp2);
        float dp3 = AndroidUtilities.dp(13.0f);
        TextPaint textPaint2 = this.t1;
        textPaint2.setTextSize(dp3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.D0.messageOwner.action;
        int i9 = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.D).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        String str = chat == null ? null : chat.title;
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        String string = tL_messageActionGiftCode.unclaimed ? LocaleController.getString("BoostingUnclaimedPrize", R.string.BoostingUnclaimedPrize) : LocaleController.getString("BoostingCongratulations", R.string.BoostingCongratulations);
        String formatPluralString = i9 == 12 ? LocaleController.formatPluralString("BoldYears", 1, new Object[0]) : LocaleController.formatPluralString("BoldMonths", i9, new Object[0]);
        if (!z10) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(str == null ? LocaleController.getString(R.string.BoostingReceivedGiftNoName) : LocaleController.formatString("BoostingReceivedGiftFrom", R.string.BoostingReceivedGiftFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedGiftDuration, formatPluralString)));
        } else if (tL_messageActionGiftCode.unclaimed) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingYouHaveUnclaimedPrize, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingUnclaimedPrizeDuration, formatPluralString)));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeFrom, str)));
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BoostingReceivedPrizeDuration, formatPluralString)));
        }
        String string2 = LocaleController.getString("BoostingReceivedGiftOpenBtn", R.string.BoostingReceivedGiftOpenBtn);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(string);
        valueOf.setSpan(new i41(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.X0 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.a1 = null;
        this.Z0 = null;
        u0 u0Var = this.g1;
        if (u0Var != null) {
            org.telegram.ui.Components.t5.release((w0) u0Var.i, (org.telegram.ui.Components.p5) u0Var.h);
        }
        u0 u0Var2 = new u0(this);
        this.g1 = u0Var2;
        u0Var2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new i41(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.c1 = false;
        this.d1 = 0;
        this.k1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.l1 = staticLayout;
        this.m1 = true;
        this.r1 = O(staticLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i9, String str, int i10, boolean z11) {
        ?? r42;
        int i11;
        CharSequence charSequence4;
        int a2;
        CharSequence charSequence5 = charSequence2;
        int dp = i10 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.D0;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        int i12 = dp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.D0;
            TextPaint textPaint = this.s1;
            if (messageObject2 == null || messageObject2.type != 30) {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new i41(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.X0 = new StaticLayout(valueOf, textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.X0 = null;
        }
        this.a1 = null;
        if (spannableStringBuilder != null) {
            nz0 nz0Var = new nz0(spannableStringBuilder, 10.0f, null);
            this.Z0 = nz0Var;
            nz0Var.a.linkColor = -1;
        } else {
            this.Z0 = null;
        }
        MessageObject messageObject3 = this.D0;
        TextPaint textPaint2 = this.t1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 == null || !(M() || (i11 = this.D0.type) == 30 || i11 == 18 || i11 == 31 || i11 == 37 || i11 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }
        int dp2 = i12 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.D0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = kh.x3.a(charSequence5, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        if (charSequence5 == null) {
            u0 u0Var = this.g1;
            if (u0Var != null) {
                org.telegram.ui.Components.t5.release((w0) u0Var.i, (org.telegram.ui.Components.p5) u0Var.h);
                this.g1 = null;
            }
            this.c1 = r42;
        } else {
            if (this.g1 == null) {
                this.g1 = new u0(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence5, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
                charSequence4 = charSequence5;
            }
            this.g1.a(charSequence4, textPaint2, dp2);
            if (!z10 || ((StaticLayout) this.g1.f).getLineCount() <= 3) {
                this.c1 = r42;
                this.e1.f(true, true);
                this.d1 = r42;
            } else {
                this.c1 = !this.b1;
                this.d1 = ((StaticLayout) this.g1.f).getLineBottom(2);
                this.k1 = new nz0(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.g1.f).getLineBottom(2);
                this.i1 = lineBottom;
                this.j1 = lineBottom - ((StaticLayout) this.g1.f).getLineTop(2);
                this.h1 = (int) ((StaticLayout) this.g1.f).getLineRight(2);
            }
            if (this.c1) {
                int lineEnd = ((StaticLayout) this.g1.f).getLineEnd(2) - 1;
                u0 u0Var2 = this.g1;
                CharSequence charSequence6 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence6 = charSequence4.subSequence(r42, lineEnd);
                }
                u0Var2.a(charSequence6, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new i41(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.l1 = staticLayout;
            this.m1 = z11 && !this.c1;
            this.r1 = O(staticLayout);
        } else {
            this.l1 = null;
            this.m1 = r42;
            this.r1 = 0.0f;
        }
        if (str == null) {
            this.F1 = null;
            this.G1 = null;
            return;
        }
        if (this.E1 == null) {
            this.E1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
        }
        if (this.F1 == null) {
            Path path = new Path();
            this.F1 = path;
            fh.i2.c(path, 1.35f, r42);
        }
        nz0 nz0Var2 = new nz0(str, i9, AndroidUtilities.bold());
        this.G1 = nz0Var2;
        nz0Var2.p = AndroidUtilities.dp(62.0f);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.F || super.verifyDrawable(drawable);
    }

    public final void w(int i9, CharSequence charSequence) {
        CharSequence charSequence2;
        t0 t0Var;
        TLRPC.Message message;
        MessageObject messageObject;
        int i10;
        int dp = i9 - AndroidUtilities.dp(30.0f);
        if (this.e0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (L()) {
            dp = Math.min(dp - AndroidUtilities.dp(this.e0 ? 28.0f : 82.0f), AndroidUtilities.dp(272.0f));
        }
        if (dp < 0) {
            return;
        }
        int i11 = this.S1;
        if (i11 > 0) {
            dp = Math.min(i11, dp);
        }
        int i12 = dp;
        this.R0 = true;
        TextPaint textPaint = (L() || ((messageObject = this.D0) != null && ((i10 = messageObject.type) == 34 || i10 == 35))) ? (TextPaint) G("paintChatActionText3") : (messageObject == null || !messageObject.drawServiceWithDefaultTypeface) ? (TextPaint) G("paintChatActionText") : (TextPaint) G("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (L()) {
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                for (Emoji.EmojiSpan emojiSpan : (Emoji.EmojiSpan[]) spannable.getSpans(0, spannable.length(), Emoji.EmojiSpan.class)) {
                    spannable.removeSpan(emojiSpan);
                }
            }
            charSequence2 = Emoji.replaceEmoji(charSequence, textPaint.getFontMetricsInt(), false, null, 0, 0.85f, 0);
        } else {
            charSequence2 = charSequence;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, i12, L() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        CharSequence charSequence3 = charSequence2;
        this.I = staticLayout;
        this.L = null;
        MessageObject messageObject2 = this.D0;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.L = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint, i12, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.n0 = org.telegram.ui.Components.t5.update(0, this, (!this.s || (t0Var = this.T0) == null || t0Var.h()) ? false : true, this.n0, this.I);
        this.K = 0;
        this.J = 0;
        this.M = 0;
        StaticLayout staticLayout2 = this.L;
        if (staticLayout2 != null) {
            int height = staticLayout2.getHeight();
            this.M = height;
            this.M = AndroidUtilities.dp(12.0f) + height;
        }
        MessageObject messageObject3 = this.D0;
        if (messageObject3 == null || !messageObject3.isRepostPreview) {
            try {
                int lineCount = this.I.getLineCount();
                for (int i13 = 0; i13 < lineCount; i13++) {
                    try {
                        float lineWidth = this.I.getLineWidth(i13);
                        float f10 = i12;
                        if (lineWidth > f10) {
                            lineWidth = f10;
                        }
                        this.K = (int) Math.max(this.K, Math.ceil(this.I.getLineBottom(i13)));
                        this.J = (int) Math.max(this.J, Math.ceil(lineWidth));
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        this.N = (i9 - this.J) / 2;
        int dp2 = AndroidUtilities.dp(7.0f);
        this.O = dp2;
        if (this.L != null) {
            this.O = org.telegram.messenger.l0.C(11.0f, this.M, dp2);
        }
        this.P = (i9 - (L() ? this.J : this.I.getWidth())) / 2;
        this.Q = (i9 - i12) / 2;
        Stack stack = this.m0;
        ArrayList arrayList = this.l0;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence3 instanceof Spannable) {
            StaticLayout staticLayout3 = this.I;
            int i14 = this.N;
            dh.l.a(this, staticLayout3, i14, i14 + this.J, (Spannable) charSequence3, stack, arrayList, null);
        }
    }

    public final void y(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.b6 b6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        w0 w0Var;
        Paint paint3;
        Paint paint4;
        int i9;
        int i10;
        Canvas canvas2;
        int i11;
        u0 u0Var;
        RectF rectF;
        ArrayList arrayList;
        int i12;
        float f14;
        int i13;
        Paint paint5;
        int i14;
        float f15;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i15;
        w0 w0Var2 = this;
        if (!w0Var2.s || ((!w0Var2.I() || z10) && (w0Var2.I() || !z10))) {
            Paint G = w0Var2.G("paintChatActionBackground");
            Paint G2 = w0Var2.G("paintChatActionBackgroundDarken");
            w0Var2.o0 = (TextPaint) w0Var2.G("paintChatActionText");
            int i16 = w0Var2.H0;
            org.telegram.ui.ActionBar.b6 b6Var3 = w0Var2.U0;
            if (i16 >= 0) {
                int v02 = org.telegram.ui.ActionBar.f6.v0(i16, b6Var3);
                if (w0Var2.J0 == null) {
                    Paint paint6 = new Paint(1);
                    w0Var2.J0 = paint6;
                    paint6.setColor(v02);
                    TextPaint textPaint = new TextPaint(1);
                    w0Var2.K0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    w0Var2.K0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    w0Var2.K0.setColor(org.telegram.ui.ActionBar.f6.v0(w0Var2.I0, b6Var3));
                }
                G = w0Var2.J0;
                w0Var2.o0 = w0Var2.K0;
            }
            boolean z11 = w0Var2.R0;
            Path path = w0Var2.N0;
            if (z11) {
                w0Var2.R0 = false;
                w0Var2.O0 = w0Var2.getWidth();
                w0Var2.P0 = 0;
                ArrayList arrayList3 = w0Var2.L0;
                arrayList3.clear();
                StaticLayout staticLayout = w0Var2.I;
                int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
                int dp = AndroidUtilities.dp(11.0f);
                f10 = 6.0f;
                int dp2 = AndroidUtilities.dp(8.0f);
                int i17 = 0;
                f11 = 8.0f;
                int i18 = 0;
                while (i17 < lineCount) {
                    int ceil = (int) Math.ceil(w0Var2.I.getLineWidth(i17));
                    if (i17 != 0 && (i15 = i18 - ceil) > 0 && i15 <= (dp * 1.5f) + dp2) {
                        ceil = i18;
                    }
                    i17 = j3.r0.e(ceil, i17, 1, arrayList3);
                    i18 = ceil;
                }
                f12 = 2.0f;
                f13 = 4.0f;
                for (int i19 = lineCount - 2; i19 >= 0; i19--) {
                    int intValue = ((Integer) arrayList3.get(i19)).intValue();
                    int i20 = i18 - intValue;
                    if (i20 <= 0 || i20 > (dp * 1.5f) + dp2) {
                        i18 = intValue;
                    }
                    arrayList3.set(i19, Integer.valueOf(i18));
                }
                int dp3 = AndroidUtilities.dp(4.0f);
                int measuredWidth = w0Var2.getMeasuredWidth() / 2;
                int dp4 = AndroidUtilities.dp(3.0f);
                int dp5 = AndroidUtilities.dp(6.0f);
                int i21 = dp - dp4;
                ArrayList arrayList4 = w0Var2.M0;
                arrayList4.clear();
                path.reset();
                float f16 = measuredWidth;
                path.moveTo(f16, dp3);
                int i22 = i18;
                int i23 = 0;
                int i24 = 0;
                while (true) {
                    rectF = w0Var2.Q0;
                    if (i24 >= lineCount) {
                        break;
                    }
                    int i25 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i24)).intValue();
                    int lineBottom = w0Var2.I.getLineBottom(i24);
                    int i26 = i25 - 1;
                    if (i24 < i26) {
                        paint5 = G2;
                        i14 = ((Integer) arrayList3.get(i24 + 1)).intValue();
                    } else {
                        paint5 = G2;
                        i14 = 0;
                    }
                    int i27 = lineBottom - i23;
                    if (i24 == 0 || intValue2 > i22) {
                        i27 = AndroidUtilities.dp(3.0f) + i27;
                    }
                    if (i24 == i26 || intValue2 > i14) {
                        i27 = AndroidUtilities.dp(3.0f) + i27;
                    }
                    Paint paint7 = G;
                    float f17 = (intValue2 / 2.0f) + f16;
                    int i28 = (i24 == i26 || intValue2 >= i14 || i24 == 0 || intValue2 >= i22) ? dp2 : dp5;
                    if (i24 == 0 || intValue2 > i22) {
                        f15 = f17;
                        arrayList2 = arrayList3;
                        b6Var2 = b6Var3;
                        rectF.set((f15 - dp4) - dp, dp3, f15 + i21, (dp * 2) + dp3);
                        s();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f15 = f17;
                        if (intValue2 < i22) {
                            float f18 = f15 + i21;
                            b6Var2 = b6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f18, dp3, (i28 * 2) + f18, r0 + dp3);
                            s();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            b6Var2 = b6Var3;
                        }
                    }
                    dp3 += i27;
                    if (i24 != i26 && intValue2 < i14) {
                        dp3 -= AndroidUtilities.dp(3.0f);
                        i27 -= AndroidUtilities.dp(3.0f);
                    }
                    if (i24 != 0 && intValue2 < i22) {
                        dp3 -= AndroidUtilities.dp(3.0f);
                        i27 -= AndroidUtilities.dp(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i27));
                    if (i24 == i26 || intValue2 > i14) {
                        rectF.set((f15 - dp4) - dp, dp3 - (dp * 2), f15 + i21, dp3);
                        s();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    } else if (intValue2 < i14) {
                        float f19 = f15 + i21;
                        rectF.set(f19, dp3 - r0, (i28 * 2) + f19, dp3);
                        s();
                        path.arcTo(rectF, 180.0f, -90.0f);
                    }
                    i24++;
                    w0Var2 = this;
                    i22 = intValue2;
                    i23 = lineBottom;
                    lineCount = i25;
                    G2 = paint5;
                    G = paint7;
                    b6Var3 = b6Var2;
                    arrayList3 = arrayList2;
                }
                paint = G;
                paint2 = G2;
                ArrayList arrayList5 = arrayList3;
                b6Var = b6Var3;
                int i29 = lineCount - 1;
                int i30 = i29;
                while (i30 >= 0) {
                    if (i30 != 0) {
                        arrayList = arrayList5;
                        i12 = ((Integer) arrayList.get(i30 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i12 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i30)).intValue();
                    int intValue4 = i30 != i29 ? ((Integer) arrayList.get(i30 + 1)).intValue() : 0;
                    this.I.getLineBottom(i30);
                    float f20 = measuredWidth - (intValue3 / 2);
                    int i31 = (i30 == i29 || intValue3 >= intValue4 || i30 == 0 || intValue3 >= i12) ? dp2 : dp5;
                    if (i30 == i29 || intValue3 > intValue4) {
                        arrayList5 = arrayList;
                        f14 = f20;
                        i13 = i31;
                        rectF.set(f14 - i21, dp3 - (dp * 2), f14 + dp4 + dp, dp3);
                        s();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < intValue4) {
                        float f21 = f20 - i21;
                        arrayList5 = arrayList;
                        f14 = f20;
                        i13 = i31;
                        rectF.set(f21 - (i31 * 2), dp3 - r2, f21, dp3);
                        s();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f14 = f20;
                        i13 = i31;
                    }
                    dp3 -= ((Integer) arrayList4.get(i30)).intValue();
                    if (i30 == 0 || intValue3 > i12) {
                        rectF.set(f14 - i21, dp3, f14 + dp4 + dp, (dp * 2) + dp3);
                        s();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    } else if (intValue3 < i12) {
                        float f22 = f14 - i21;
                        rectF.set(f22 - (i13 * 2), dp3, f22, r9 + dp3);
                        s();
                        path.arcTo(rectF, 0.0f, -90.0f);
                    }
                    i30--;
                }
                w0Var = this;
                path.close();
                if (w0Var.L() && !w0Var.M()) {
                    rectF.left = (f16 - (w0Var.J / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp3;
                    rectF.right = (w0Var.J / 2.0f) + f16 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp3 + w0Var.K + w0Var.M;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = G;
                paint2 = G2;
                b6Var = b6Var3;
                f10 = 6.0f;
                f11 = 8.0f;
                f12 = 2.0f;
                f13 = 4.0f;
                w0Var = w0Var2;
            }
            if (!w0Var.s0) {
                w0Var.r0 = ((ViewGroup) w0Var.getParent()).getMeasuredHeight();
            }
            if (b6Var != null) {
                b6Var.o(w0Var.q0, w0Var.p0 + AndroidUtilities.dp(f13), w0Var.getMeasuredWidth(), w0Var.r0);
            } else {
                org.telegram.ui.ActionBar.f6.q(w0Var.q0, w0Var.p0 + AndroidUtilities.dp(f13), w0Var.getMeasuredWidth(), w0Var.r0);
            }
            if (!z10 || (w0Var.getAlpha() == 1.0f && !(w0Var instanceof rj))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = w0Var instanceof rj;
                if (z12) {
                    int alpha = paint4.getAlpha();
                    int alpha2 = paint3.getAlpha();
                    paint4.setAlpha((int) (alpha * (z12 ? 0.75f : 1.0f)));
                    paint3.setAlpha((int) (alpha2 * (z12 ? 0.75f : 1.0f)));
                    i9 = alpha;
                    i10 = alpha2;
                } else {
                    i9 = -1;
                    i10 = -1;
                }
            } else {
                i9 = paint.getAlpha();
                i10 = paint2.getAlpha();
                boolean z13 = w0Var instanceof rj;
                paint4 = paint;
                paint4.setAlpha((int) (w0Var.getAlpha() * i9 * (z13 ? 0.75f : 1.0f)));
                float alpha3 = w0Var.getAlpha() * i10;
                float f23 = z13 ? 0.75f : 1.0f;
                paint3 = paint2;
                paint3.setAlpha((int) (alpha3 * f23));
            }
            MessageObject messageObject = w0Var.D0;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (w0Var.I() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (w0Var.O1 > 0.0f) {
                    Paint paint8 = w0Var.P1;
                    int alpha4 = paint8.getAlpha();
                    if (z10) {
                        paint8.setAlpha((int) (w0Var.getAlpha() * alpha4));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha4);
                }
            } else {
                canvas2 = canvas;
            }
            MessageObject messageObject2 = w0Var.D0;
            gh.m5 m5Var = w0Var.B0;
            if (m5Var.d()) {
                float dp6 = m5Var.Q.e + AndroidUtilities.dp(f11);
                float width = (w0Var.getWidth() - dp6) / f12;
                float dp7 = m5Var.p ? 0.0f : AndroidUtilities.dp(12.0f) + w0Var.O + w0Var.K;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(width, dp7, dp6 + width, m5Var.M + dp7 + AndroidUtilities.dp(f11));
                if (w0Var.A1 == null) {
                    w0Var.A1 = new RectF();
                }
                w0Var.A1.set(rectF2);
                canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.I()) {
                    canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.C0 != null) {
                float dp8 = AndroidUtilities.dp(174.0f);
                ox0 ox0Var = w0Var.C0;
                ox0Var.getClass();
                float dp9 = AndroidUtilities.dp(140.0f) + ((int) ox0Var.f.j()) + (ox0Var.i ? AndroidUtilities.dp(40.0f) : 0);
                float width2 = (w0Var.getWidth() - dp8) / f12;
                if (w0Var.A1 == null) {
                    w0Var.A1 = new RectF();
                }
                w0Var.A1.set(width2, AndroidUtilities.dp(f13), dp8 + width2, AndroidUtilities.dp(f13) + dp9);
                canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.I()) {
                    canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.K(messageObject2)) {
                float width3 = (w0Var.getWidth() - w0Var.W0) / f12;
                float f24 = w0Var.O + w0Var.K;
                if (w0Var.M()) {
                    float dp10 = f24 + AndroidUtilities.dp(f13);
                    AndroidUtilities.rectTmp.set(width3, dp10, w0Var.W0 + width3, w0Var.f + dp10);
                } else {
                    float dp11 = f24 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f25 = w0Var.W0;
                    rectF3.set(width3, dp11, width3 + f25, f25 + dp11 + w0Var.y1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !w0Var.c1 && (u0Var = w0Var.g1) != null && w0Var.d1 > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = j3.r0.C(1.0f, w0Var.e1.c, ((StaticLayout) u0Var.f).getHeight() - w0Var.d1, rectF4.bottom);
                }
                if (w0Var.A1 == null) {
                    w0Var.A1 = new RectF();
                }
                w0Var.A1.set(AndroidUtilities.rectTmp);
                if (messageObject2 == null || (!((i11 = messageObject2.type) == 33 || i11 == 35) || w0Var.M1 == null)) {
                    canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (w0Var.I()) {
                        canvas2.drawRoundRect(w0Var.A1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                } else {
                    float dp12 = AndroidUtilities.dp(16.0f);
                    float[] fArr = w0Var.U1;
                    Arrays.fill(fArr, dp12);
                    float dp13 = AndroidUtilities.dp(f10);
                    fArr[7] = dp13;
                    fArr[6] = dp13;
                    fArr[5] = dp13;
                    fArr[4] = dp13;
                    Path path2 = w0Var.T1;
                    path2.rewind();
                    path2.addRoundRect(w0Var.A1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (w0Var.I()) {
                        canvas2.drawPath(path2, paint3);
                    }
                }
            }
            if (i9 >= 0) {
                paint4.setAlpha(i9);
                paint3.setAlpha(i10);
            }
        }
    }

    public final void z(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.f0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.P, this.O);
        StaticLayout staticLayout = this.I;
        org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas2, staticLayout, this.n0, 0.0f, this.l0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? E(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        gh.m5 m5Var = this.B0;
        float f13 = 4.0f;
        if (m5Var.d()) {
            canvas2.save();
            canvas2.translate((getWidth() - m5Var.Q.e) / 2.0f, m5Var.p ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(16.0f) + this.O + this.K);
            m5Var.b(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        h11 h11Var = this.j0;
        org.telegram.ui.ActionBar.b6 b6Var = this.U0;
        if (h11Var != null) {
            float alpha = getAlpha();
            if (b6Var != null) {
                b6Var.o(this.q0, this.p0 + 0.0f, getMeasuredWidth(), this.r0);
            } else {
                org.telegram.ui.ActionBar.f6.q(this.q0, this.p0 + 0.0f, getMeasuredWidth(), this.r0);
            }
            this.j0.c(canvas, getWidth(), this.f0, 0.0f, 1.0f, alpha, this.i0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.L1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (b6Var != null) {
            b6Var.o(this.q0, this.p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.r0);
        } else {
            org.telegram.ui.ActionBar.f6.q(this.q0, this.p0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.r0);
        }
        float width = (getWidth() - this.W0) / 2.0f;
        float dp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.O + this.K + this.f;
        float dp2 = (this.W0 - AndroidUtilities.dp(4.0f)) / 2.0f;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            e0 e0Var = (e0) arrayList.get(i9);
            float a2 = e0Var.a();
            float dp3 = ((AndroidUtilities.dp(f13) + dp2) * i9) + width;
            float f14 = dp3 + dp2;
            RectF rectF = this.Q0;
            rectF.set(dp3, dp, f14, e0Var.f + dp);
            canvas2.save();
            if (a2 != 1.0f) {
                f10 = 4.0f;
                canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
            } else {
                f10 = 4.0f;
            }
            float dp4 = AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius));
            float[] fArr = this.V1;
            Arrays.fill(fArr, dp4);
            if ((e0Var.g & 9) == 9) {
                float dp5 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[7] = dp5;
                fArr[6] = dp5;
            }
            if ((e0Var.g & 10) == 10) {
                float dp6 = AndroidUtilities.dp(SharedConfig.bubbleRadius);
                fArr[5] = dp6;
                fArr[4] = dp6;
            }
            Path path = this.W1;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, G("paintChatActionBackground"));
            if (I()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.f6.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            z zVar = e0Var.s;
            if (zVar != null) {
                int i10 = (int) dp;
                zVar.setBounds((int) dp3, i10, (int) f14, e0Var.f + i10);
                e0Var.s.setAlpha(255);
                e0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float dp7 = e0Var.t != null ? AndroidUtilities.dp(26.0f) : 0;
            float A = e2.c.A(dp2 - (e0Var.h.l() + (e0Var.t != null ? AndroidUtilities.dp(f10) : 0)), dp7, f12, dp3);
            Drawable drawable = e0Var.t;
            if (drawable != null) {
                int i11 = (int) A;
                f11 = 2.0f;
                drawable.setBounds(i11, (int) (((e0Var.f - AndroidUtilities.dp(24.0f)) / f12) + dp), AndroidUtilities.dp(24.0f) + i11, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f - AndroidUtilities.dp(24.0f)) / 2.0f) + dp)));
                e0Var.t.setAlpha(e0Var.m ? 128 : 255);
                e0Var.t.draw(canvas2);
                A += dp7;
            } else {
                f11 = 2.0f;
            }
            e0Var.h.p = Math.max(1, (((int) dp2) - AndroidUtilities.dp(15.0f)) - r6);
            e0Var.h.f(canvas2, A, (AndroidUtilities.dp(40.0f) / f11) + dp, e0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i9++;
            f13 = 4.0f;
            f12 = 2.0f;
        }
    }

    public w0(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.n = new pc(this);
        int i9 = UserConfig.selectedAccount;
        this.D = i9;
        ih.l7 l7Var = new ih.l7(null, false);
        this.W = l7Var;
        this.i0 = true;
        this.k0 = new RectF();
        this.l0 = new ArrayList();
        this.m0 = new Stack();
        this.y0 = new hg.s0(this);
        this.H0 = -1;
        this.I0 = -1;
        this.L0 = new ArrayList();
        this.M0 = new ArrayList();
        this.N0 = new Path();
        this.Q0 = new RectF();
        this.R0 = true;
        this.S0 = false;
        this.b1 = false;
        this.c1 = false;
        this.e1 = new org.telegram.ui.Components.y5(this, 0L, 320L, gr.h);
        this.m1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.s1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.t1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.u1 = textPaint3;
        this.x1 = new RadialProgress2(this, null);
        this.B1 = new ia(this, 2);
        this.I1 = new Path();
        this.L1 = new ArrayList();
        this.P1 = new Paint(1);
        this.T1 = new Path();
        this.U1 = new float[8];
        this.V1 = new float[8];
        this.W1 = new Path();
        this.X1 = new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed};
        this.e2 = new v0(this);
        l7Var.a = false;
        this.s = z10;
        this.U0 = b6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.H = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        this.w = DownloadController.getInstance(i9).generateObserverTag();
        this.B0 = new gh.m5(i9, this, b6Var);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.H1 = view;
        view.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        zf.v1 v1Var = new zf.v1(10);
        this.J1 = v1Var;
        v1Var.N = 100;
        v1Var.J = false;
        v1Var.M = true;
        v1Var.G = false;
        v1Var.K = true;
        v1Var.H = true;
        v1Var.r = 1;
        v1Var.w = 0.98f;
        v1Var.v = 0.98f;
        v1Var.u = 0.98f;
        v1Var.g = false;
        v1Var.o = 0.0f;
        v1Var.x = 750L;
        v1Var.y = 750;
        v1Var.c();
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.a2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i9, int i10, int i11, int i12) {
        super.invalidate(i9, i10, i11, i12);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.a2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.o4
    public final /* synthetic */ void c(boolean z10, boolean z11) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
