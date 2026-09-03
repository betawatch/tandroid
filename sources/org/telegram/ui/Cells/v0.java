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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.d21;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.m51;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ai;
import org.telegram.ui.bk;
import org.telegram.ui.co;
import org.telegram.ui.i20;
import org.telegram.ui.rm;
import org.telegram.ui.ub;
import org.telegram.ui.y01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class v0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, n4 {
    public static final HashMap g2;
    public float A0;
    public boolean A1;
    public boolean B;
    public float B0;
    public RectF B1;
    public boolean C;
    public final lh.i5 C0;
    public final ga C1;
    public boolean D;
    public ky0 D0;
    public boolean D1;
    public final int E;
    public MessageObject E0;
    public ColorMatrixColorFilter E1;
    public final ImageReceiver F;
    public int F0;
    public CornerPathEffect F1;
    public Drawable G;
    public CharSequence G0;
    public Path G1;
    public Path H;
    public kh.u1 H0;
    public k01 H1;
    public final org.telegram.ui.Components.z8 I;
    public int I0;
    public final View I1;
    public StaticLayout J;
    public int J0;
    public final Path J1;
    public int K;
    public Paint K0;
    public final eg.p2 K1;
    public int L;
    public TextPaint L0;
    public int L1;
    public StaticLayout M;
    public final ArrayList M0;
    public final ArrayList M1;
    public int N;
    public final ArrayList N0;
    public BotInlineKeyboard.Source N1;
    public int O;
    public final Path O0;
    public boolean O1;
    public int P;
    public int P0;
    public float P1;
    public int Q;
    public int Q0;
    public final Paint Q1;
    public int R;
    public final RectF R0;
    public boolean R1;
    public int S;
    public boolean S0;
    public View.OnClickListener S1;
    public boolean T;
    public boolean T0;
    public int T1;
    public boolean U;
    public t0 U0;
    public final Path U1;
    public RadialProgressView V;
    public final org.telegram.ui.ActionBar.f6 V0;
    public final float[] V1;
    public float W;
    public int W0;
    public final float[] W1;
    public int X0;
    public final Path X1;
    public StaticLayout Y0;
    public final int[] Y1;
    public Paint Z0;
    public int Z1;
    public final nh.i7 a0;
    public k01 a1;
    public SpannableStringBuilder a2;
    public boolean b0;
    public StaticLayout b1;
    public boolean b2;
    public boolean c0;
    public boolean c1;
    public Runnable c2;
    public boolean d0;
    public boolean d1;
    public PorterDuffColorFilter d2;
    public boolean e0;
    public int e1;
    public int e2;
    public int f;
    public boolean f0;
    public final org.telegram.ui.Components.z5 f1;
    public final u0 f2;
    public int g0;
    public i20 g1;
    public int h;
    public boolean h0;
    public eg.p h1;
    public int i0;
    public int i1;
    public boolean j0;
    public int j1;
    public d21 k0;
    public int k1;
    public final RectF l0;
    public k01 l1;
    public final ArrayList m0;
    public StaticLayout m1;
    public final rc n;
    public final Stack n0;
    public boolean n1;
    public org.telegram.ui.Components.q5 o0;
    public TextPaint o1;
    public TextPaint p0;
    public StaticLayout p1;
    public float q0;
    public float q1;
    public j90 r;
    public float r0;
    public StaticLayout r1;
    public final boolean s;
    public int s0;
    public float s1;
    public boolean t0;
    public final TextPaint t1;
    public ImageLocation u0;
    public final TextPaint u1;
    public View v;
    public float v0;
    public final TextPaint v1;
    public final int w;
    public float w0;
    public TLRPC.Document w1;
    public URLSpan x;
    public boolean x0;
    public TLRPC.VideoSize x1;
    public ih.k y;
    public boolean y0;
    public final RadialProgress2 y1;
    public final mg.r0 z0;
    public int z1;

    static {
        HashMap hashMap = new HashMap();
        g2 = hashMap;
        vh.w2.l(1, hashMap, "1⃣", 3, "2⃣");
        vh.w2.l(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public v0(Context context) {
        this(context, null, false);
    }

    public static float P(StaticLayout staticLayout) {
        float f10 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (ceil > f10) {
                f10 = ceil;
            }
        }
        return f10;
    }

    private void setStarsPaused(boolean z4) {
        eg.p2 p2Var = this.K1;
        if (z4 == p2Var.g) {
            return;
        }
        p2Var.g = z4;
        if (z4) {
            p2Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < p2Var.n.size(); i10++) {
            eg.o2 o2Var = (eg.o2) p2Var.n.get(i10);
            o2Var.a = (System.currentTimeMillis() - p2Var.Q) + o2Var.a;
        }
        invalidate();
    }

    public static SpannableStringBuilder x(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i10));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new o2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.y.k();
            spannableStringBuilder.setSpan(android.support.v4.media.session.y.f(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas) {
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f12 = 2.0f;
        canvas2.translate(this.g0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.Q, this.P);
        StaticLayout staticLayout = this.J;
        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas2, staticLayout, this.o0, 0.0f, this.m0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? E(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        lh.i5 i5Var = this.C0;
        float f13 = 4.0f;
        if (i5Var.d()) {
            canvas2.save();
            canvas2.translate((getWidth() - i5Var.Q.e) / 2.0f, i5Var.p ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(16.0f) + this.P + this.L);
            i5Var.b(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        d21 d21Var = this.k0;
        org.telegram.ui.ActionBar.f6 f6Var = this.V0;
        if (d21Var != null) {
            float alpha = getAlpha();
            if (f6Var != null) {
                f6Var.l(this.r0, this.q0 + 0.0f, getMeasuredWidth(), this.s0);
            } else {
                org.telegram.ui.ActionBar.j6.q(this.r0, this.q0 + 0.0f, getMeasuredWidth(), this.s0);
            }
            this.k0.c(canvas, getWidth(), this.g0, 0.0f, 1.0f, alpha, this.j0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.M1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (f6Var != null) {
            f6Var.l(this.r0, this.q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.s0);
        } else {
            org.telegram.ui.ActionBar.j6.q(this.r0, this.q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.s0);
        }
        float width = (getWidth() - this.X0) / 2.0f;
        float dp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.P + this.L + this.f;
        float dp2 = (this.X0 - AndroidUtilities.dp(4.0f)) / 2.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            e0 e0Var = (e0) arrayList.get(i10);
            float a2 = e0Var.a();
            float dp3 = ((AndroidUtilities.dp(f13) + dp2) * i10) + width;
            float f14 = dp3 + dp2;
            RectF rectF = this.R0;
            rectF.set(dp3, dp, f14, e0Var.f + dp);
            canvas2.save();
            if (a2 != 1.0f) {
                f10 = 4.0f;
                canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
            } else {
                f10 = 4.0f;
            }
            float dp4 = AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius));
            float[] fArr = this.W1;
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
            Path path = this.X1;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, G("paintChatActionBackground"));
            if (I()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            z zVar = e0Var.s;
            if (zVar != null) {
                int i11 = (int) dp;
                zVar.setBounds((int) dp3, i11, (int) f14, e0Var.f + i11);
                e0Var.s.setAlpha(255);
                e0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float dp7 = e0Var.t != null ? AndroidUtilities.dp(26.0f) : 0;
            float x10 = e2.c.x(dp2 - (e0Var.h.l() + (e0Var.t != null ? AndroidUtilities.dp(f10) : 0)), dp7, f12, dp3);
            Drawable drawable = e0Var.t;
            if (drawable != null) {
                int i12 = (int) x10;
                f11 = 2.0f;
                drawable.setBounds(i12, (int) (((e0Var.f - AndroidUtilities.dp(24.0f)) / f12) + dp), AndroidUtilities.dp(24.0f) + i12, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f - AndroidUtilities.dp(24.0f)) / 2.0f) + dp)));
                e0Var.t.setAlpha(e0Var.m ? 128 : 255);
                e0Var.t.draw(canvas2);
                x10 += dp7;
            } else {
                f11 = 2.0f;
            }
            e0Var.h.p = Math.max(1, (((int) dp2) - AndroidUtilities.dp(15.0f)) - r6);
            e0Var.h.f(canvas2, x10, (AndroidUtilities.dp(40.0f) / f11) + dp, e0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i10++;
            f13 = 4.0f;
            f12 = 2.0f;
        }
    }

    public final void B(Canvas canvas, boolean z4) {
        if (this.s) {
            if (I() && !z4) {
                return;
            }
            if (!I() && z4) {
                return;
            }
        }
        C(canvas, z4, null);
    }

    public final void C(Canvas canvas, boolean z4, Integer num) {
        Canvas canvas2;
        float alpha = z4 ? getAlpha() : 1.0f;
        if (alpha <= 0.0f) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.V0;
        if (f6Var != null) {
            f6Var.l(this.r0, this.q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.s0);
        } else {
            org.telegram.ui.ActionBar.j6.q(this.r0, this.q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.s0);
        }
        MessageObject messageObject = this.E0;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        mg.r0 r0Var = this.z0;
        boolean z10 = r0Var.b;
        u0 u0Var = this.f2;
        if (!z10 || (u0Var.b && r0Var.l)) {
            r0Var.a = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            r0Var.d(canvas2, u0Var.b ? u0Var.c : 1.0f, num);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    public final void D(rm rmVar, Canvas canvas, int i10, Integer num, float f10) {
        mg.r0 r0Var = this.z0;
        if (r0Var.b) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.V0;
        if (f6Var != null) {
            f6Var.l(this.r0, this.q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.s0);
        } else {
            org.telegram.ui.ActionBar.j6.q(this.r0, this.q0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.s0);
        }
        r0Var.D = f10;
        r0Var.f(rmVar, canvas, i10, num);
    }

    public final ColorFilter E(int i10) {
        if (i10 != this.e2 || this.d2 == null) {
            this.e2 = i10;
            this.d2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.d2;
    }

    public final int F(MessageObject messageObject) {
        int i10;
        int i11 = this.W0;
        int i12 = messageObject.type;
        if (i12 == 37) {
            i11 = AndroidUtilities.dp(52.0f);
        } else if (i12 == 21 || N()) {
            i11 = AndroidUtilities.dp(78.0f);
        }
        if (M() || (i10 = messageObject.type) == 34 || i10 == 35) {
            return 0;
        }
        return i11;
    }

    public Paint G(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.V0;
        Paint G = f6Var != null ? f6Var.G(str) : null;
        return G != null ? G : org.telegram.ui.ActionBar.j6.S0(str);
    }

    public final float H(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject == null) {
            return 1.0f;
        }
        try {
            if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.E)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                return messagesController.uploadingWallpaperInfo.r;
            }
            return 1.0f;
        } catch (Exception e) {
            FileLog.e(e);
            return 1.0f;
        }
    }

    public final boolean I() {
        if (this.K0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.V0;
        return f6Var != null ? f6Var.m0() : org.telegram.ui.ActionBar.j6.a1();
    }

    public final void J() {
        t0 t0Var = this.U0;
        if (t0Var != null && t0Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean K(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        int i10 = messageObject.type;
        return i10 == 30 || i10 == 18 || i10 == 25 || N();
    }

    public final boolean M() {
        TLRPC.Message message;
        MessageObject messageObject = this.E0;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean N() {
        MessageObject messageObject;
        int i10;
        if (this.C0.d() || this.D0 != null || (i10 = (messageObject = this.E0).type) == 31 || i10 == 37 || i10 == 33 || i10 == 35 || i10 == 34 || i10 == 21 || i10 == 22 || messageObject.isStoryMention()) {
            return true;
        }
        TLRPC.Message message = this.E0.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
            return ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low || ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).rejected;
        }
        return false;
    }

    public final boolean O() {
        MessageObject messageObject = this.E0;
        if (messageObject == null) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return UserObject.isUserSelf(MessagesController.getInstance(this.E).getUser(Long.valueOf(this.E0.messageOwner.from_id.user_id)));
        }
        return false;
    }

    public final void Q(CharacterStyle characterStyle) {
        if (this.U0 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.U0.j0(this, this.E0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.x;
            if (uRLSpan instanceof m51) {
                TLObject tLObject = ((m51) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    ag.f.m(this.U0.T0(), -this.U0.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.x;
            if (uRLSpan2 instanceof m51) {
                TLObject tLObject2 = ((m51) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.U0.V0((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.U0.V(this, this.E0.getReplyMsgId());
        } else if (url.startsWith("http")) {
            ze.d.s(getContext(), url);
        } else {
            this.U0.C1(Long.parseLong(url));
        }
    }

    public final void R() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.E0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !O()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.E0.messageOwner.action).slug;
        }
        if (this.U0 != null) {
            AndroidUtilities.runOnUIThread(new lh.p6(this, tL_premiumGiftOption, str, 21));
        }
    }

    public final void S() {
        TLRPC.Message message;
        MessageObject messageObject = this.E0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z4 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        nh.i7 i7Var = this.a0;
        if (z4) {
            Context context = getContext();
            TLRPC.Message message2 = this.E0.messageOwner;
            int i10 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            org.telegram.ui.ActionBar.f6 f6Var = i7Var.J;
            TL_stars.StarsTransaction starsTransaction = new TL_stars.StarsTransaction();
            starsTransaction.title = null;
            starsTransaction.description = null;
            starsTransaction.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer = new TL_stars.TL_starsTransactionPeer();
            starsTransaction.peer = tL_starsTransactionPeer;
            tL_starsTransactionPeer.peer = peer;
            starsTransaction.date = i10;
            starsTransaction.amount = TL_stars.StarsAmount.ofStars(tL_messageActionGiftStars.stars);
            starsTransaction.id = tL_messageActionGiftStars.transaction_id;
            starsTransaction.gift = true;
            starsTransaction.sent_by = peer;
            starsTransaction.received_by = peer2;
            lh.ja.h1(context, false, 0L, this.E, starsTransaction, f6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.E0.messageOwner;
            int i11 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.f6 f6Var2 = i7Var.J;
            TL_stars.StarsTransaction starsTransaction2 = new TL_stars.StarsTransaction();
            starsTransaction2.title = null;
            starsTransaction2.description = null;
            starsTransaction2.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer2 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction2.peer = tL_starsTransactionPeer2;
            tL_starsTransactionPeer2.peer = tL_messageActionPrizeStars.boost_peer;
            starsTransaction2.date = i11;
            starsTransaction2.amount = TL_stars.StarsAmount.ofStars(tL_messageActionPrizeStars.stars);
            starsTransaction2.id = tL_messageActionPrizeStars.transaction_id;
            starsTransaction2.gift = true;
            starsTransaction2.flags |= 8192;
            starsTransaction2.giveaway_post_id = tL_messageActionPrizeStars.giveaway_msg_id;
            starsTransaction2.sent_by = peer3;
            starsTransaction2.received_by = peer4;
            lh.ja.h1(context2, false, 0L, this.E, starsTransaction2, f6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.E0.messageOwner;
            int i12 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.f6 f6Var3 = i7Var.J;
            TL_stars.StarsTransaction starsTransaction3 = new TL_stars.StarsTransaction();
            starsTransaction3.title = null;
            starsTransaction3.description = null;
            starsTransaction3.photo = null;
            TL_stars.TL_starsTransactionPeer tL_starsTransactionPeer3 = new TL_stars.TL_starsTransactionPeer();
            starsTransaction3.peer = tL_starsTransactionPeer3;
            tL_starsTransactionPeer3.peer = peer5;
            starsTransaction3.date = i12;
            TL_stars.TL_starsTonAmount tL_starsTonAmount = new TL_stars.TL_starsTonAmount();
            starsTransaction3.amount = tL_starsTonAmount;
            tL_starsTonAmount.amount = tL_messageActionGiftTon.cryptoAmount;
            starsTransaction3.id = tL_messageActionGiftTon.transaction_id;
            starsTransaction3.gift = true;
            starsTransaction3.sent_by = peer5;
            starsTransaction3.received_by = peer6;
            lh.ja.h1(context3, false, 0L, this.E, starsTransaction3, f6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            lh.g5 g5Var = new lh.g5(getContext(), this.E, this.E0.getDialogId(), this.V0, null);
            g5Var.i2(this.E0, null);
            g5Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                lh.g5 g5Var2 = new lh.g5(getContext(), this.E, this.E0.getDialogId(), this.V0, null);
                g5Var2.i2(this.E0, null);
                g5Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                kf.k0.v(R.string.UniqueGiftNotFoundBurned, qc.a0(U), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    lh.g5 g5Var3 = new lh.g5(getContext(), this.E, this.E0.getDialogId(), this.V0, null);
                    g5Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    g5Var3.show();
                }
            }
        }
    }

    public final void T(int i10, boolean z4, boolean z10) {
        int i11 = this.F0;
        if (i11 == i10 || i11 / 3600 == i10 / 3600) {
            return;
        }
        String string = z4 ? i10 == 2147483646 ? LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline) : LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i10)) : LocaleController.formatDateChat(i10);
        this.F0 = i10;
        CharSequence charSequence = this.G0;
        if (charSequence == null || !TextUtils.equals(string, charSequence)) {
            this.G0 = string;
            this.a2 = null;
            X(z10);
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
    public final void U(MessageObject messageObject, boolean z4) {
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        String str;
        String str2;
        TLRPC.Document document;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        MessageObject messageObject2;
        int i10;
        TLRPC.Document document3;
        boolean z11;
        TLRPC.Document document4;
        TLRPC.Document document5;
        BotInlineKeyboard.Source source;
        boolean z12;
        boolean z13;
        TLRPC.PhotoSize photoSize;
        TLRPC.VideoSize videoSize;
        TLRPC.PhotoSize photoSize2;
        boolean z14;
        float f10;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str4;
        int i11;
        StaticLayout staticLayout;
        MessageObject messageObject3 = messageObject;
        if (messageObject3 == null) {
            return;
        }
        if (this.E0 != messageObject3 || (!((staticLayout = this.J) == null || TextUtils.equals(staticLayout.getText(), messageObject3.messageText)) || (!(this.y0 || messageObject3.replyMessageObject == null) || z4 || messageObject3.type == 21 || messageObject3.forceUpdate))) {
            if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
                FileLog.e(new IllegalStateException("Wrong thread!!!"));
            }
            this.M1.clear();
            this.N1 = null;
            this.a2 = null;
            MessageObject messageObject4 = this.E0;
            boolean z15 = messageObject4 == null || messageObject4.stableId != messageObject3.stableId;
            if (messageObject4 != null) {
                messageObject3.playedGiftAnimation = messageObject4.playedGiftAnimation;
            }
            this.E0 = messageObject3;
            messageObject3.forceUpdate = false;
            this.y0 = messageObject3.replyMessageObject != null;
            DownloadController.getInstance(this.E).removeLoadingFileObserver(this);
            this.S = 0;
            this.D = false;
            eg.p pVar = this.h1;
            if (pVar != null && z15) {
                org.telegram.ui.Components.u5.release((v0) pVar.i, (org.telegram.ui.Components.q5) pVar.h);
                this.h1 = null;
                this.c1 = false;
            }
            if (z15 || messageObject3.reactionsChanged) {
                messageObject3.reactionsChanged = false;
                TLRPC.Message message = messageObject3.messageOwner;
                boolean z16 = (message == null || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                if (messageObject3.shouldDrawReactions()) {
                    this.z0.s(messageObject3, !messageObject3.shouldDrawReactionsInLayout(), z16, this.V0);
                } else {
                    this.z0.s(null, false, false, this.V0);
                }
            }
            if (messageObject3.type == 32) {
                if (this.D0 == null) {
                    ky0 ky0Var = new ky0(this.E, this, this.V0);
                    this.D0 = ky0Var;
                    if (this.R1) {
                        ky0Var.d.s0 = ky0Var.b;
                    }
                }
                ky0 ky0Var2 = this.D0;
                ky0Var2.getClass();
                TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject3.messageOwner.action;
                ky0Var2.e = tL_messageActionSuggestBirthday.birthday;
                k01 k01Var = new k01(TextUtils.concat(messageObject3.messageText, ":"), 13.0f, null);
                k01Var.n(6);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                k01Var.a();
                k01Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
                ky0Var2.f = k01Var;
                int i12 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
                k01[] k01VarArr = new k01[i12];
                ky0Var2.g = k01VarArr;
                ky0Var2.h = new k01[i12];
                k01VarArr[0] = new k01(LocaleController.getString(R.string.DateDay), 11.0f, null);
                ky0Var2.h[0] = new k01("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
                ky0Var2.g[1] = new k01(LocaleController.getString(R.string.DateMonth), 11.0f, null);
                k01[] k01VarArr2 = ky0Var2.h;
                StringBuilder sb = new StringBuilder("");
                int i13 = tL_messageActionSuggestBirthday.birthday.month - 1;
                sb.append((i13 < 0 || i13 >= 12) ? kf.k0.j(i13, "") : LocaleController.getString(new int[]{R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December}[i13]));
                k01VarArr2[1] = new k01(sb.toString(), 11.0f, AndroidUtilities.bold());
                if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
                    ky0Var2.g[2] = new k01(LocaleController.getString(R.string.DateYear), 11.0f, null);
                    ky0Var2.h[2] = new k01("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
                }
                ky0Var2.i = !messageObject3.isOutOwner();
                org.telegram.ui.ActionBar.f6 f6Var = ky0Var2.c;
                ky0Var2.l.setColor(f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q() ? org.telegram.ui.ActionBar.j6.l1(0.12f, -1) : org.telegram.ui.ActionBar.j6.l1(0.12f, -16777216));
                ky0Var2.j = new k01(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
            } else {
                ky0 ky0Var3 = this.D0;
                if (ky0Var3 != null) {
                    ky0Var3.d.s0 = null;
                    this.D0 = null;
                }
            }
            boolean z17 = !z15;
            this.C0.f(messageObject3, z17);
            this.F.setAutoRepeatCount(0);
            this.F.clearDecorators();
            if (messageObject3.type != 22) {
                this.G = null;
            }
            if (messageObject3.actionDeleteGroupEventId != -1) {
                k7.d6.b(this, 0.02f, 1.2f);
                this.T1 = Math.max(AndroidUtilities.dp(250.0f), ph.f3.a(messageObject3.messageText, (TextPaint) G("paintChatActionText")));
                y01 S0 = ub.S0(messageObject3.messageText);
                if (S0 != null) {
                    S0.h = this;
                }
            } else {
                setStateListAnimator(null);
                this.T1 = 0;
            }
            if (messageObject3.isStoryMention()) {
                TLRPC.User user = MessagesController.getInstance(this.E).getUser(Long.valueOf(messageObject3.messageOwner.media.user_id));
                this.I.m(this.E, user);
                TL_stories.StoryItem storyItem = messageObject3.messageOwner.media.storyItem;
                if (storyItem == null || !storyItem.noforwards) {
                    nh.m7.x(this.F, storyItem);
                } else {
                    this.F.setForUserOrChat(user, this.I, null, true, 0, true);
                }
                this.F.setRoundRadius((int) (this.W0 / 2.0f));
            } else {
                int i14 = messageObject3.type;
                if (i14 == 22) {
                    if (messageObject3.strippedThumb == null) {
                        int size = messageObject3.photoThumbs.size();
                        for (int i15 = 0; i15 < size && !(messageObject3.photoThumbs.get(i15) instanceof TLRPC.TL_photoStrippedSize); i15++) {
                        }
                    }
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject3.currentEvent;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            wallPaper = ((TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction).new_value;
                            if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                                org.telegram.ui.ActionBar.f6 f6Var2 = this.V0;
                                boolean a2 = f6Var2 != null ? f6Var2.a() : org.telegram.ui.ActionBar.j6.I.q();
                                this.F.clearImage();
                                int i16 = this.E;
                                String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(wallPaper);
                                int i17 = ph.k5.y0;
                                org.telegram.ui.ActionBar.e4 theme = ChatThemeController.getInstance(i16).getTheme(sf.b.d(wallpaperEmoticon));
                                Drawable r02 = theme == null ? org.telegram.ui.ActionBar.j6.r0() : ph.k5.g(i16, theme, a2);
                                this.G = r02;
                                if (r02 != null) {
                                    r02.setCallback(this);
                                }
                            } else if (wallPaper != null && (str4 = wallPaper.uploadingImage) != null) {
                                this.F.setImage(ImageLocation.getForPath(str4), "150_150_wallpaper" + wallPaper.id + co.e(wallPaper.settings), null, null, co.b(wallPaper), 0L, null, wallPaper, 1);
                                this.G = null;
                            } else if (wallPaper != null) {
                                TLObject tLObject = messageObject3.photoThumbsObject;
                                TLRPC.Document document6 = tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document;
                                this.F.setImage(ImageLocation.getForDocument(document6), "150_150_wallpaper" + wallPaper.id + co.e(wallPaper.settings), null, null, co.b(wallPaper), 0L, null, wallPaper, 1);
                                this.G = null;
                            } else {
                                this.G = null;
                            }
                            this.F.setRoundRadius((int) (this.W0 / 2.0f));
                            if (H(messageObject) != 1.0f) {
                                this.y1.o(1.0f, z17);
                                this.y1.setIcon(4, z17, z17);
                            } else {
                                this.y1.setIcon(3, z17, z17);
                            }
                        }
                    }
                    TLRPC.Message message2 = messageObject3.messageOwner;
                    wallPaper = (message2 == null || (messageAction = message2.action) == null) ? null : messageAction.wallpaper;
                    if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                    }
                    this.F.setRoundRadius((int) (this.W0 / 2.0f));
                    if (H(messageObject) != 1.0f) {
                    }
                } else if (i14 == 21) {
                    this.F.setRoundRadius((int) (this.W0 / 2.0f));
                    this.F.setAllowStartLottieAnimation(true);
                    this.F.setDelegate(null);
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) messageObject3.messageOwner.action;
                    TLRPC.VideoSize closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_messageActionSuggestProfilePhoto.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
                    ArrayList<TLRPC.VideoSize> arrayList2 = tL_messageActionSuggestProfilePhoto.photo.video_sizes;
                    ImageLocation forPhoto = (arrayList2 == null || arrayList2.isEmpty()) ? null : ImageLocation.getForPhoto(closestVideoSizeWithSize, tL_messageActionSuggestProfilePhoto.photo);
                    TLRPC.Photo photo = messageObject3.messageOwner.action.photo;
                    if (messageObject3.strippedThumb == null) {
                        int size2 = messageObject3.photoThumbs.size();
                        for (int i18 = 0; i18 < size2; i18++) {
                            photoSize2 = messageObject3.photoThumbs.get(i18);
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                break;
                            }
                        }
                    }
                    photoSize2 = null;
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject3.photoThumbs, MediaDataController.MAX_STYLE_RUNS_COUNT);
                    if (closestPhotoSizeWithSize == null) {
                        z14 = false;
                    } else if (closestVideoSizeWithSize != null) {
                        z14 = false;
                        this.F.setImage(forPhoto, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject, 0);
                        messageObject3 = messageObject;
                    } else {
                        z14 = false;
                        this.F.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 0);
                    }
                    this.F.setAllowStartLottieAnimation(z14);
                    x40 x40Var = MessagesController.getInstance(this.E).photoSuggestion.get(messageObject3.messageOwner.local_id);
                    if (x40Var != null) {
                        f10 = 1.0f;
                        if (x40Var.T != 1.0f) {
                            this.y1.setIcon(3, z17, z17);
                        }
                    } else {
                        f10 = 1.0f;
                    }
                    this.y1.o(f10, z17);
                    this.y1.setIcon(4, z17, z17);
                } else if (i14 == 31 || i14 == 33 || i14 == 30 || i14 == 18 || i14 == 25 || i14 == 35) {
                    this.F.setRoundRadius(0);
                    TLRPC.MessageAction messageAction2 = messageObject3.messageOwner.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                        long j10 = MessagesController.getInstance(this.E).config.noForwardsRequestExpirePeriod.get(TimeUnit.SECONDS);
                        if (tL_messageActionNoForwardsRequest.expired) {
                            z10 = z15;
                        } else {
                            z10 = z15;
                            if (messageObject3.messageOwner.date + j10 >= ConnectionsManager.getInstance(this.E).getCurrentTime()) {
                                z13 = false;
                                this.O1 = z13;
                                if (!messageObject3.isOut() && !tL_messageActionNoForwardsRequest.expired && !this.O1) {
                                    BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
                                    builder.addSharingOfferKeyboard();
                                    this.N1 = builder.build();
                                }
                                document = null;
                            }
                        }
                        z13 = true;
                        this.O1 = z13;
                        if (!messageObject3.isOut()) {
                            BotInlineKeyboard.Builder builder2 = new BotInlineKeyboard.Builder();
                            builder2.addSharingOfferKeyboard();
                            this.N1 = builder2.build();
                        }
                        document = null;
                    } else {
                        z10 = z15;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                            if (starGift != null) {
                                document5 = lf.d.e(starGift);
                                if (this.H0 == null) {
                                    this.H0 = new kh.u1(this, this.V0, false);
                                }
                                this.H0.d((TL_stars.starGiftAttributeBackdrop) lh.t7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.H0.e((TL_stars.starGiftAttributePattern) lh.t7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                            } else {
                                document5 = null;
                            }
                            this.O1 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(this.E).getCurrentTime();
                            if (!messageObject3.isOut() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.O1) {
                                BotInlineKeyboard.Builder builder3 = new BotInlineKeyboard.Builder();
                                builder3.addGiftOfferKeyboard();
                                this.N1 = builder3.build();
                            }
                            document = document5;
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                            TL_stars.StarGift starGift2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                            if (starGift2 != null) {
                                document4 = lf.d.e(starGift2);
                                if (this.H0 == null) {
                                    this.H0 = new kh.u1(this, this.V0, false);
                                }
                                this.H0.d((TL_stars.starGiftAttributeBackdrop) lh.t7.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.H0.e((TL_stars.starGiftAttributePattern) lh.t7.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
                            } else {
                                document4 = null;
                            }
                            document = document4;
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                            TL_stars.StarGift starGift3 = ((TLRPC.TL_messageActionStarGift) messageAction2).gift;
                            if (starGift3 != null) {
                                document = starGift3.sticker;
                                messageObject2 = messageObject3;
                                z11 = false;
                                str2 = null;
                                source = this.N1;
                                if (source != null) {
                                    int rowsCount = source.getRowsCount();
                                    for (int i19 = 0; i19 < rowsCount; i19++) {
                                        int columnsCount = this.N1.getColumnsCount(i19);
                                        int i20 = 0;
                                        while (i20 < columnsCount) {
                                            BotInlineKeyboard.Button button = this.N1.getButton(i19, i20);
                                            e0 e0Var = new e0(new s0(this, 0));
                                            e0Var.j = (BotInlineKeyboard.ButtonCustom) button;
                                            int iconRes = button.getIconRes();
                                            if (iconRes != 0) {
                                                Drawable drawable = getResources().getDrawable(iconRes);
                                                e0Var.t = drawable;
                                                drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                                            }
                                            e0Var.f = AndroidUtilities.dp(40.0f);
                                            int i21 = e0Var.g | 8;
                                            e0Var.g = i21;
                                            int b10 = k7.w8.b(i21, 1, i20 == 0);
                                            e0Var.g = b10;
                                            e0Var.g = k7.w8.b(b10, 2, i20 == 1);
                                            e0Var.h = new k01(button.getText(), (TextPaint) G("paintChatBotButton"));
                                            this.M1.add(e0Var);
                                            i20++;
                                        }
                                    }
                                }
                                this.A1 = messageObject3.wasUnread;
                                this.w1 = document;
                                if (document == null) {
                                    this.F.setAllowStartLottieAnimation(true);
                                    int i22 = messageObject3.type;
                                    if (i22 != 31 && i22 != 37 && i22 != 33) {
                                        this.F.setDelegate(this.C1);
                                    }
                                    this.x1 = null;
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= document.video_thumbs.size()) {
                                            break;
                                        }
                                        if ("f".equals(document.video_thumbs.get(i23).type)) {
                                            this.x1 = document.video_thumbs.get(i23);
                                            break;
                                        }
                                        i23++;
                                    }
                                    if (z10 || messageObject3.type != 18) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.a7, 0.3f);
                                        this.F.setAutoRepeat(0);
                                        ImageReceiver imageReceiver = this.F;
                                        ImageLocation forDocument = ImageLocation.getForDocument(document);
                                        Locale locale = Locale.US;
                                        imageReceiver.setImage(forDocument, kf.k0.j(messageObject3.stableId, "160_160_nr_messageId="), svgThumb, "tgs", messageObject2, 1);
                                    }
                                } else if (str2 != null) {
                                    MediaDataController.getInstance(this.E).loadStickersByEmojiOrName(str2, false, !z11);
                                }
                            }
                            document = null;
                            messageObject2 = messageObject3;
                            z11 = false;
                            str2 = null;
                            source = this.N1;
                            if (source != null) {
                            }
                            this.A1 = messageObject3.wasUnread;
                            this.w1 = document;
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
                                        z11 = false;
                                        str2 = null;
                                        source = this.N1;
                                        if (source != null) {
                                        }
                                        this.A1 = messageObject3.wasUnread;
                                        this.w1 = document;
                                        if (document == null) {
                                        }
                                    }
                                    document = null;
                                    messageObject2 = messageObject3;
                                    z11 = false;
                                    str2 = null;
                                    source = this.N1;
                                    if (source != null) {
                                    }
                                    this.A1 = messageObject3.wasUnread;
                                    this.w1 = document;
                                    if (document == null) {
                                    }
                                }
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                str = UserConfig.getInstance(this.E).premiumTonStickerPack;
                                if (str == null) {
                                    MediaDataController.getInstance(this.E).checkTonGiftStickers();
                                    return;
                                }
                            } else {
                                str = UserConfig.getInstance(this.E).premiumGiftsStickerPack;
                                if (str == null) {
                                    MediaDataController.getInstance(this.E).checkPremiumGiftStickers();
                                    return;
                                }
                            }
                            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.E).getStickerSetByName(str);
                            ?? r22 = stickerSetByName;
                            if (stickerSetByName == null) {
                                r22 = MediaDataController.getInstance(this.E).getStickerSetByEmojiOrName(str);
                            }
                            if (r22 != 0) {
                                TLRPC.MessageAction messageAction3 = messageObject3.messageOwner.action;
                                int i24 = messageAction3.months;
                                if (messageObject3.type == 30) {
                                    String str5 = "3⃣";
                                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                        long j11 = messageAction3.cryptoAmount;
                                        if (j11 > 10000000000L) {
                                            if (j11 <= 50000000000L) {
                                                str5 = "1⃣";
                                            }
                                            i10 = 0;
                                            while (true) {
                                                if (i10 < r22.packs.size()) {
                                                    break;
                                                }
                                                TLRPC.TL_stickerPack tL_stickerPack = r22.packs.get(i10);
                                                if (TextUtils.equals(tL_stickerPack.emoticon, str5) && !tL_stickerPack.documents.isEmpty()) {
                                                    long longValue = tL_stickerPack.documents.get(0).longValue();
                                                    for (int i25 = 0; i25 < r22.documents.size(); i25++) {
                                                        document3 = r22.documents.get(i25);
                                                        if (document3 != null && document3.id == longValue) {
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    i10++;
                                                }
                                            }
                                            document3 = null;
                                            document2 = document3;
                                        }
                                        str5 = "2⃣";
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < r22.packs.size()) {
                                            }
                                            i10++;
                                        }
                                        document3 = null;
                                        document2 = document3;
                                    } else {
                                        long j12 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                        if (j12 > 1000) {
                                            if (j12 >= 2500) {
                                                str5 = "4⃣";
                                            }
                                            i10 = 0;
                                            while (true) {
                                                if (i10 < r22.packs.size()) {
                                                }
                                                i10++;
                                            }
                                            document3 = null;
                                            document2 = document3;
                                        }
                                        str5 = "2⃣";
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < r22.packs.size()) {
                                            }
                                            i10++;
                                        }
                                        document3 = null;
                                        document2 = document3;
                                    }
                                    source = this.N1;
                                    if (source != null) {
                                    }
                                    this.A1 = messageObject3.wasUnread;
                                    this.w1 = document;
                                    if (document == null) {
                                    }
                                } else {
                                    String str6 = (String) g2.get(Integer.valueOf(i24));
                                    ArrayList<TLRPC.TL_stickerPack> arrayList3 = r22.packs;
                                    int size3 = arrayList3.size();
                                    int i26 = 0;
                                    document2 = null;
                                    while (i26 < size3) {
                                        TLRPC.TL_stickerPack tL_stickerPack2 = arrayList3.get(i26);
                                        i26++;
                                        TLRPC.TL_stickerPack tL_stickerPack3 = tL_stickerPack2;
                                        if (Objects.equals(tL_stickerPack3.emoticon, str6)) {
                                            ArrayList<Long> arrayList4 = tL_stickerPack3.documents;
                                            int size4 = arrayList4.size();
                                            TLRPC.Document document7 = document2;
                                            int i27 = 0;
                                            while (true) {
                                                if (i27 >= size4) {
                                                    str3 = str6;
                                                    arrayList = arrayList3;
                                                    break;
                                                }
                                                Long l10 = arrayList4.get(i27);
                                                i27++;
                                                long longValue2 = l10.longValue();
                                                ArrayList<TLRPC.Document> arrayList5 = r22.documents;
                                                int size5 = arrayList5.size();
                                                int i28 = 0;
                                                while (true) {
                                                    if (i28 >= size5) {
                                                        str3 = str6;
                                                        arrayList = arrayList3;
                                                        break;
                                                    }
                                                    TLRPC.Document document8 = arrayList5.get(i28);
                                                    i28++;
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
                                    z11 = r22;
                                } else {
                                    str2 = str;
                                    document = r22.documents.get(0);
                                    messageObject2 = r22;
                                    z11 = r22;
                                }
                                source = this.N1;
                                if (source != null) {
                                }
                                this.A1 = messageObject3.wasUnread;
                                this.w1 = document;
                                if (document == null) {
                                }
                            } else {
                                str2 = str;
                                document = null;
                                z12 = r22;
                                messageObject2 = null;
                                z11 = z12;
                                source = this.N1;
                                if (source != null) {
                                }
                                this.A1 = messageObject3.wasUnread;
                                this.w1 = document;
                                if (document == null) {
                                }
                            }
                        }
                    }
                    z12 = false;
                    str2 = null;
                    messageObject2 = null;
                    z11 = z12;
                    source = this.N1;
                    if (source != null) {
                    }
                    this.A1 = messageObject3.wasUnread;
                    this.w1 = document;
                    if (document == null) {
                    }
                } else if (i14 == 37) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) messageObject3.messageOwner.action).community_id));
                    this.F.setAllowStartLottieAnimation(true);
                    this.F.setDelegate(null);
                    this.F.setRoundRadius(AndroidUtilities.dp(14.0f));
                    this.F.setAutoRepeatCount(1);
                    this.I.q(chat);
                    this.F.setForUserOrChat(chat, new nq(getContext(), AndroidUtilities.dp(14.0f)), chat);
                } else if (i14 == 11) {
                    this.F.setAllowStartLottieAnimation(true);
                    this.F.setDelegate(null);
                    this.F.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
                    this.F.setAutoRepeatCount(1);
                    this.I.n(messageObject3.getDialogId(), null, null);
                    if (messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        this.F.setImage(null, null, this.I, null, messageObject3, 0);
                    } else {
                        if (messageObject3.strippedThumb == null) {
                            int size6 = messageObject3.photoThumbs.size();
                            for (int i29 = 0; i29 < size6; i29++) {
                                photoSize = messageObject3.photoThumbs.get(i29);
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
                                if (!messageObject3.mediaExists && !DownloadController.getInstance(this.E).canDownloadMedia(4, videoSize.size)) {
                                    this.u0 = ImageLocation.getForPhoto(videoSize, photo2);
                                    DownloadController.getInstance(this.E).addLoadingFileObserver(FileLoader.getAttachFileName(videoSize), messageObject3, this);
                                }
                                if (videoSize == null) {
                                    this.F.setImage(ImageLocation.getForPhoto(videoSize, photo2), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 1);
                                } else {
                                    this.F.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject3.photoThumbsObject), "150_150", ImageLocation.getForObject(photoSize, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 1);
                                }
                            }
                            videoSize = null;
                            if (videoSize == null) {
                            }
                        } else {
                            this.F.setImageBitmap(this.I);
                        }
                    }
                    this.F.setVisible(!PhotoViewer.M1(messageObject3), false);
                } else {
                    this.F.setAllowStartLottieAnimation(true);
                    this.F.setDelegate(null);
                    this.F.setImageBitmap((Bitmap) null);
                }
            }
            if (this.h0 && this.b0 && this.f0 && (this.c0 || this.d0 || this.e0)) {
                this.i0 = AndroidUtilities.dp(33.0f);
                if (this.k0 == null) {
                    d21 d21Var = new d21(this.E, this, this.V0, true);
                    this.k0 = d21Var;
                    d21Var.r = new s0(this, 1);
                }
                if (this.k0.f(this.E0)) {
                    if (this.R1) {
                        this.k0.a();
                    }
                    i11 = 0;
                } else {
                    this.k0.b();
                    this.k0 = null;
                    i11 = 0;
                    this.i0 = 0;
                }
            } else {
                d21 d21Var2 = this.k0;
                if (d21Var2 != null) {
                    d21Var2.b();
                    this.k0 = null;
                }
                i11 = 0;
                this.i0 = 0;
            }
            int paddingTop = getPaddingTop();
            int i30 = this.i0;
            if (paddingTop != i30) {
                setPadding(i11, i30, i11, i11);
            }
            this.I1.setVisibility((!K(messageObject) || this.C0.d()) ? 8 : 0);
            ag.f.b(messageObject3);
            requestLayout();
        }
    }

    public final void V(int i10, int i11) {
        this.I0 = i10;
        this.J0 = i11;
    }

    public final void W(float f10, int i10) {
        this.t0 = true;
        this.s0 = i10;
        this.q0 = f10;
        this.r0 = 0.0f;
    }

    public final void X(boolean z4) {
        if (getMeasuredWidth() != 0) {
            w(getMeasuredWidth(), this.G0);
            invalidate();
        }
        if (this.x0) {
            r();
        } else if (z4) {
            AndroidUtilities.runOnUIThread(new s0(this, 3));
        } else {
            requestLayout();
        }
    }

    @Override // org.telegram.ui.Cells.n4
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessageObject messageObject;
        if (i10 == NotificationCenter.startSpoilers) {
            setSpoilersSuppressed(false);
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            return;
        }
        if (i10 == NotificationCenter.stopSpoilers) {
            setSpoilersSuppressed(true);
            return;
        }
        if (i10 == NotificationCenter.didUpdatePremiumGiftStickers || i10 == NotificationCenter.starGiftsLoaded || i10 == NotificationCenter.didUpdateTonGiftStickers) {
            MessageObject messageObject2 = this.E0;
            if (messageObject2 != null) {
                U(messageObject2, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.E).premiumGiftsStickerPack) && (messageObject = this.E0) != null) {
            U(messageObject, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.I1) {
            return super.drawChild(canvas, view, j10);
        }
        float a2 = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.n4
    public final void f(TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        t0 t0Var = this.U0;
        if (t0Var != null) {
            t0Var.y2(this, reactionCount, z4, f10, f11);
        }
    }

    public /* bridge */ /* synthetic */ ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a0
    public int getBoundsLeft() {
        lh.i5 i5Var = this.C0;
        if (i5Var.d()) {
            int width = ((int) (getWidth() - (i5Var.Q.e + AndroidUtilities.dp(8.0f)))) / 2;
            return i5Var.p ? width : Math.min(this.P0, width);
        }
        if (K(this.E0)) {
            return kf.k0.d(getWidth(), this.X0, 2, this.g0 / 2);
        }
        int i10 = this.P0;
        ImageReceiver imageReceiver = this.F;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            i10 = Math.min((int) imageReceiver.getImageX(), i10);
        }
        return (this.g0 / 2) + i10;
    }

    @Override // org.telegram.ui.Cells.a0
    public int getBoundsRight() {
        int i10;
        int i11;
        lh.i5 i5Var = this.C0;
        if (i5Var.d()) {
            int dp = ((int) ((i5Var.Q.e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            return i5Var.p ? dp : Math.max(this.Q0, dp);
        }
        if (K(this.E0)) {
            i10 = this.g0 / 2;
            i11 = (getWidth() + this.X0) / 2;
        } else {
            i10 = this.Q0;
            ImageReceiver imageReceiver = this.F;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.max((int) imageReceiver.getImageX2(), i10);
            }
            i11 = this.g0 / 2;
        }
        return i11 + i10;
    }

    @Override // org.telegram.ui.Cells.n4
    public /* bridge */ /* synthetic */ float getCheckBoxTranslation() {
        return 0.0f;
    }

    public /* bridge */ /* synthetic */ MessageObject.GroupedMessagePosition getCurrentPosition() {
        return null;
    }

    public int getCustomDate() {
        return this.F0;
    }

    public t0 getDelegate() {
        return this.U0;
    }

    @Override // org.telegram.ui.Cells.n4
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

    @Override // org.telegram.ui.Cells.n4
    public MessageObject getMessageObject() {
        return this.E0;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.w;
    }

    public ImageReceiver getPhotoImage() {
        return this.F;
    }

    public mg.r0 getReactionsLayout() {
        return this.z0;
    }

    @Override // org.telegram.ui.Cells.n4
    public /* bridge */ /* synthetic */ float getSlidingOffsetX() {
        return 0.0f;
    }

    public u0 getTransitionParams() {
        return this.f2;
    }

    @Override // org.telegram.ui.Cells.n4
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Cells.n4
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
        Runnable runnable = this.c2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.b2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.n4
    public final /* synthetic */ boolean j() {
        return false;
    }

    @Override // org.telegram.ui.Cells.a0
    public final boolean m() {
        t0 t0Var = this.U0;
        if (t0Var != null) {
            return t0Var.w2(this, this.v0, this.w0);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t0 t0Var;
        super.onAttachedToWindow();
        this.R1 = true;
        this.F.onAttachedToWindow();
        setStarsPaused(false);
        this.o0 = org.telegram.ui.Components.u5.update(0, this, (!this.s || (t0Var = this.U0) == null || t0Var.f()) ? false : true, this.o0, this.J);
        eg.p pVar = this.h1;
        if (pVar != null) {
            pVar.h = org.telegram.ui.Components.u5.update(0, (View) pVar.i, false, (org.telegram.ui.Components.q5) pVar.h, (StaticLayout) pVar.f);
        }
        int i10 = this.E;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.E0;
        if (messageObject != null && messageObject.type == 21) {
            U(messageObject, true);
        }
        lh.i5 i5Var = this.C0;
        i5Var.P = true;
        if (i5Var.N != null) {
            i5Var.d.onAttachedToWindow();
            i5Var.e.a();
            i5Var.y.d.onAttachedToWindow();
        }
        mg.r0 r0Var = this.z0;
        ArrayList arrayList = r0Var.v;
        r0Var.G = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((mg.o0) arrayList.get(i11)).a();
        }
        d21 d21Var = this.k0;
        if (d21Var != null) {
            d21Var.a();
        }
        ky0 ky0Var = this.D0;
        if (ky0Var != null) {
            ky0Var.d.s0 = ky0Var.b;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R1 = false;
        int i10 = this.E;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.F.onDetachedFromWindow();
        setStarsPaused(true);
        this.x0 = false;
        org.telegram.ui.Components.u5.release(this, this.o0);
        eg.p pVar = this.h1;
        if (pVar != null) {
            org.telegram.ui.Components.u5.release((v0) pVar.i, (org.telegram.ui.Components.q5) pVar.h);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.a0.g();
        this.f2.a = false;
        lh.i5 i5Var = this.C0;
        i5Var.P = false;
        i5Var.d.onDetachedFromWindow();
        i5Var.e.b();
        kh.v0 v0Var = i5Var.y;
        v0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.u5.release((View) null, v0Var.q);
        v0Var.q = null;
        this.z0.q();
        d21 d21Var = this.k0;
        if (d21Var != null) {
            d21Var.b();
        }
        ky0 ky0Var = this.D0;
        if (ky0Var != null) {
            ky0Var.d.s0 = null;
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
        int i10;
        TextPaint textPaint;
        ArrayList arrayList;
        RadialProgress2 radialProgress2;
        TextPaint textPaint2;
        int i11;
        v0 v0Var;
        float f10;
        float f11;
        float dp;
        Canvas canvas2;
        float f12;
        v0 v0Var2;
        float f13;
        float f14;
        k01 k01Var;
        eg.p pVar;
        StaticLayout staticLayout;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z4;
        float f15;
        float clamp;
        Paint G;
        boolean a2;
        ColorMatrix colorMatrix;
        int i12;
        TextPaint textPaint3;
        int i13;
        int i14;
        k01 k01Var2;
        int dp2;
        t0 t0Var;
        int size;
        int i15;
        TextPaint textPaint4;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.g0 / 2.0f, getPaddingTop());
        MessageObject messageObject = this.E0;
        float e = this.f1.e(!this.d1);
        int i16 = this.W0;
        lh.i5 i5Var = this.C0;
        boolean d = i5Var.d();
        nh.i7 i7Var = this.a0;
        TextPaint textPaint5 = this.u1;
        ImageReceiver imageReceiver = this.F;
        if (!d && this.D0 == null && K(messageObject)) {
            this.W0 = this.X0 - AndroidUtilities.dp(106.0f);
            if (N()) {
                i16 = F(messageObject);
                float f16 = (this.S - i16) / 2.0f;
                float dp3 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f) + this.P + this.L;
                if (messageObject.isStoryMention()) {
                    i7Var.d = messageObject.messageOwner.media.storyItem;
                }
                float f17 = i16;
                i7Var.F.set(f16, dp3, f16 + f17, f17 + dp3);
                int i17 = messageObject.type;
                if (i17 == 31 || i17 == 33 || i17 == 34 || i17 == 35) {
                    f16 += AndroidUtilities.dp(10.0f);
                    dp3 += AndroidUtilities.dp(10.0f);
                    i16 -= AndroidUtilities.dp(20.0f);
                }
                if (messageObject.type == 37) {
                    f16 += AndroidUtilities.dp(2.0f);
                }
                imageReceiver.setImageCoords(f16, dp3, Math.max(0, i16), Math.max(0, i16));
                int i18 = messageObject.type;
                if (i18 == 31 || i18 == 33 || i18 == 34 || i18 == 35) {
                    i16 = AndroidUtilities.dp(20.0f) + i16;
                }
            } else {
                int i19 = messageObject.type;
                if (i19 == 11) {
                    int i20 = this.S;
                    float f18 = this.W0;
                    imageReceiver.setImageCoords((i20 - r4) / 2.0f, (this.X0 * 0.075f) + this.P + this.L, f18, f18);
                } else {
                    if (i19 == 25) {
                        i16 = (int) (this.W0 * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                        float f19 = i16;
                        imageReceiver.setImageCoords((this.S - i16) / 2.0f, ((this.X0 * 0.075f) + (this.P + this.L)) - AndroidUtilities.dp(22.0f), f19, f19);
                    } else if (messageObject.isStarGiftAction()) {
                        float f20 = i16;
                        imageReceiver.setImageCoords((this.S - i16) / 2.0f, (this.X0 * 0.075f) + this.P + this.L + AndroidUtilities.dp(2.0f), f20, f20);
                    } else if (messageObject.type == 30) {
                        i16 = (int) (this.W0 * 1.1f);
                        TLRPC.Message message = messageObject.messageOwner;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f21 = i16;
                            imageReceiver.setImageCoords((this.S - i16) / 2.0f, ((this.X0 * 0.075f) + (this.P + this.L)) - AndroidUtilities.dp(12.0f), f21, f21);
                        } else {
                            float f22 = i16;
                            imageReceiver.setImageCoords((this.S - i16) / 2.0f, ((this.X0 * 0.075f) + (this.P + this.L)) - AndroidUtilities.dp(22.0f), f22, f22);
                        }
                    } else {
                        i16 = (int) (this.W0 * 1.0f);
                        float f23 = i16;
                        imageReceiver.setImageCoords((this.S - i16) / 2.0f, ((this.X0 * 0.075f) + (this.P + this.L)) - AndroidUtilities.dp(4.0f), f23, f23);
                    }
                    textPaint4 = (TextPaint) G("paintChatActionText");
                    this.p0 = textPaint4;
                    if (textPaint4 != null) {
                        TextPaint textPaint6 = this.t1;
                        if (textPaint6 != null && textPaint6.getColor() != this.p0.getColor()) {
                            this.t1.setColor(this.p0.getColor());
                        }
                        TextPaint textPaint7 = this.v1;
                        if (textPaint7 != null && textPaint7.getColor() != this.p0.getColor()) {
                            textPaint7.setColor(this.p0.getColor());
                            textPaint7.linkColor = this.p0.getColor();
                        }
                        if (textPaint5 != null && textPaint5.getColor() != this.p0.getColor()) {
                            textPaint5.setColor(this.p0.getColor());
                            textPaint5.linkColor = this.p0.getColor();
                        }
                    }
                }
            }
            textPaint4 = (TextPaint) G("paintChatActionText");
            this.p0 = textPaint4;
            if (textPaint4 != null) {
            }
        }
        int i21 = i16;
        y(canvas3, false);
        boolean d10 = i5Var.d();
        RadialProgress2 radialProgress22 = this.y1;
        if (d10) {
            canvas3.save();
            float width = (getWidth() - i5Var.c()) / 2.0f;
            this.A0 = width;
            float dp4 = i5Var.p ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(16.0f) + this.P + this.L;
            this.B0 = dp4;
            canvas3.translate(width, dp4);
            i5Var.a(canvas3);
            t0 t0Var2 = this.U0;
            if (t0Var2 == null || t0Var2.f()) {
                i5Var.b(canvas3);
            }
            canvas3.restore();
        } else if (this.D0 != null) {
            canvas3.save();
            this.D0.a(canvas3);
            canvas3.restore();
        } else if (K(messageObject) || (messageObject != null && messageObject.type == 11)) {
            kh.u1 u1Var = this.H0;
            if (u1Var != null && ((i10 = messageObject.type) == 31 || i10 == 37 || i10 == 33)) {
                u1Var.setBounds((int) (imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (imageReceiver.getImageWidth() + imageReceiver.getImageX() + AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(14.0f)));
                this.H0.draw(canvas3);
            }
            if (this.G != null) {
                canvas3.save();
                canvas3.translate(imageReceiver.getImageX(), imageReceiver.getImageY());
                Path path = this.H;
                if (path == null) {
                    this.H = new Path();
                } else {
                    path.rewind();
                }
                this.H.addCircle(imageReceiver.getImageWidth() / 2.0f, imageReceiver.getImageHeight() / 2.0f, imageReceiver.getImageWidth() / 2.0f, Path.Direction.CW);
                canvas3.clipPath(this.H);
                this.G.setBounds(0, 0, (int) imageReceiver.getImageWidth(), (int) imageReceiver.getImageHeight());
                this.G.draw(canvas3);
                canvas3.restore();
            } else if (messageObject.isStoryMention()) {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                long j10 = messageMedia.user_id;
                i7Var.c = messageMedia.id;
                nh.m7.h(j10, canvas3, imageReceiver, i7Var);
            } else {
                imageReceiver.draw(canvas3);
            }
            if (messageObject.type == 37) {
                kf.r.a(canvas3, org.telegram.ui.ActionBar.j6.S0, imageReceiver.getImageX() + AndroidUtilities.dp(26.0f), imageReceiver.getImageY() + AndroidUtilities.dp(26.0f), AndroidUtilities.dp(52.0f));
            }
            radialProgress22.a.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageWidth() + imageReceiver.getImageX(), imageReceiver.getImageHeight() + imageReceiver.getImageY());
            int i22 = messageObject.type;
            if (i22 == 21) {
                x40 x40Var = MessagesController.getInstance(this.E).photoSuggestion.get(messageObject.messageOwner.local_id);
                if (x40Var != null) {
                    radialProgress22.o(x40Var.T, true);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.getImageWidth() * 0.5f)) + 1);
                    radialProgress22.G = AndroidUtilities.dp(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.j6.le, org.telegram.ui.ActionBar.j6.me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.oe);
                    if (x40Var.T == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                }
                radialProgress22.draw(canvas3);
            } else if (i22 == 22) {
                float H = H(messageObject);
                radialProgress22.o(H, true);
                radialProgress22.setCircleRadius(AndroidUtilities.dp(26.0f));
                radialProgress22.G = AndroidUtilities.dp(24.0f);
                radialProgress22.g(org.telegram.ui.ActionBar.j6.le, org.telegram.ui.ActionBar.j6.me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.oe);
                if (H == 1.0f) {
                    radialProgress22.setIcon(4, true, true);
                } else {
                    radialProgress22.setIcon(3, true, true);
                }
                radialProgress22.draw(canvas3);
                textPaint = this.p0;
                arrayList = this.m0;
                if (textPaint != null || this.J == null) {
                    radialProgress2 = radialProgress22;
                    textPaint2 = textPaint5;
                    i11 = 22;
                } else {
                    canvas3.save();
                    canvas3.translate(this.Q, this.P);
                    if (this.J.getPaint() != this.p0) {
                        r();
                    }
                    canvas3.save();
                    ih.k.d(canvas3, arrayList);
                    ih.k.f(canvas3, this.J);
                    t0 t0Var3 = this.U0;
                    if (t0Var3 == null || t0Var3.f()) {
                        StaticLayout staticLayout2 = this.J;
                        textPaint2 = textPaint5;
                        radialProgress2 = radialProgress22;
                        i11 = 22;
                        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, staticLayout2, this.o0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout2 == null ? null : E(staticLayout2.getPaint().getColor()));
                        canvas3 = canvas;
                    } else {
                        radialProgress2 = radialProgress22;
                        textPaint2 = textPaint5;
                        i11 = 22;
                    }
                    canvas3.restore();
                    int size2 = arrayList.size();
                    int i23 = 0;
                    while (i23 < size2) {
                        Object obj = arrayList.get(i23);
                        i23++;
                        ih.k kVar = (ih.k) obj;
                        kVar.h(this.J.getPaint().getColor());
                        kVar.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (this.p0 != null && this.M != null) {
                    canvas3.save();
                    canvas3.translate(this.R, this.P - this.N);
                    if (this.M.getPaint() != this.p0) {
                        r();
                    }
                    canvas3.save();
                    ih.k.d(canvas3, arrayList);
                    ih.k.f(canvas3, this.M);
                    t0Var = this.U0;
                    if (t0Var != null || t0Var.f()) {
                        StaticLayout staticLayout3 = this.M;
                        org.telegram.ui.Components.q5 q5Var = this.o0;
                        StaticLayout staticLayout4 = this.J;
                        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, staticLayout3, q5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout4 != null ? null : E(staticLayout4.getPaint().getColor()));
                        canvas3 = canvas;
                    }
                    canvas3.restore();
                    size = arrayList.size();
                    i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList.get(i15);
                        i15++;
                        ih.k kVar2 = (ih.k) obj2;
                        kVar2.h(this.M.getPaint().getColor());
                        kVar2.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (i5Var.d() && K(messageObject)) {
                    canvas3.save();
                    float f24 = (this.S - this.X0) / 2.0f;
                    if (messageObject.type != i11) {
                        f24 += AndroidUtilities.dp(8.0f);
                    }
                    float f25 = f24;
                    if (N()) {
                        RectF rectF = this.B1;
                        float dp5 = rectF != null ? rectF.top : AndroidUtilities.dp(4.0f) + this.P + this.L;
                        if (i21 > 0) {
                            f10 = 16.0f;
                            dp2 = org.telegram.messenger.y3.D(16.0f, 2, i21);
                        } else {
                            f10 = 16.0f;
                            dp2 = AndroidUtilities.dp(16.0f);
                        }
                        f11 = dp5 + dp2;
                    } else {
                        f10 = 16.0f;
                        float f26 = (this.X0 * 0.075f) + this.P + this.L;
                        if (messageObject.type != 21) {
                            i21 = this.W0;
                        }
                        float dp6 = f26 + i21 + AndroidUtilities.dp(4.0f);
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
                    int i24 = messageObject.type;
                    if (i24 == 31 || i24 == 37 || i24 == 33) {
                        f11 -= AndroidUtilities.dp(3.66f);
                    }
                    canvas3.translate(f25, f11);
                    if (this.Y0 != null) {
                        canvas3.save();
                        canvas3.translate(((this.X0 - AndroidUtilities.dp(f10)) - this.Y0.getWidth()) / 2.0f, 0.0f);
                        this.Y0.draw(canvas3);
                        canvas3.restore();
                        float height = this.Y0.getHeight() + f11;
                        if (this.b1 != null) {
                            canvas3.save();
                            canvas3.translate(((this.X0 - AndroidUtilities.dp(f10)) - this.b1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + this.Y0.getHeight());
                            this.b1.draw(canvas3);
                            canvas3.restore();
                            height += AndroidUtilities.dp(10.0f) + this.b1.getHeight();
                        }
                        dp = height + AndroidUtilities.dp(messageObject.type == 25 ? 6.0f : 0.0f);
                    } else {
                        dp = f11 - AndroidUtilities.dp(4.0f);
                    }
                    float f27 = dp;
                    canvas3.restore();
                    if (this.Y0 == null || (k01Var2 = this.a1) == null) {
                        canvas2 = canvas3;
                        f12 = 0.0f;
                    } else {
                        float l10 = k01Var2.l() + AndroidUtilities.dp(12.0f);
                        float x10 = e2.c.x(this.X0 - AndroidUtilities.dp(f10), l10, 2.0f, f25);
                        float height2 = f11 + this.Y0.getHeight() + AndroidUtilities.dp(14.0f);
                        if (this.Z0 == null) {
                            this.Z0 = new Paint(1);
                        }
                        this.Z0.setColor(org.telegram.ui.ActionBar.j6.e1() ? 285212671 : TLObject.FLAG_28);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(x10, height2 - AndroidUtilities.dp(8.0f), l10 + x10, AndroidUtilities.dp(8.0f) + height2);
                        canvas3.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.Z0);
                        Canvas canvas4 = canvas3;
                        f12 = 0.0f;
                        this.a1.c(x10 + AndroidUtilities.dp(6.0f), height2, 1.0f, -855638017, canvas4);
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
                    if (messageObject.type == i11) {
                        RadialProgress2 radialProgress23 = radialProgress2;
                        if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                            i12 = 4;
                            if (radialProgress23.a() == 4) {
                                if (this.h1 != null) {
                                    canvas2.save();
                                    canvas2.translate((this.X0 - ((StaticLayout) this.h1.f).getWidth()) / 2.0f, f12);
                                    this.h1.a = ((this.X0 - ((StaticLayout) r3.f).getWidth()) / 2.0f) + f25;
                                    this.h1.b = f28;
                                    int color = textPaint2.getColor();
                                    eg.p pVar2 = this.h1;
                                    f13 = 8.0f;
                                    f14 = 16.0f;
                                    ih.k.g(this, false, color, 0, (AtomicReference) pVar2.g, 1, (StaticLayout) pVar2.f, pVar2.e, canvas, false);
                                    eg.p pVar3 = this.h1;
                                    org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, (StaticLayout) pVar3.f, (org.telegram.ui.Components.q5) pVar3.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, E(textPaint2.getColor()));
                                    canvas3 = canvas;
                                    canvas3.restore();
                                    v0Var = this;
                                } else {
                                    f13 = 8.0f;
                                    f14 = 16.0f;
                                    v0Var = this;
                                    canvas3 = canvas2;
                                }
                                canvas3.restore();
                                if (v0Var.Y0 == null) {
                                    AndroidUtilities.dp(f13);
                                }
                                pVar = v0Var.h1;
                                if (pVar != null) {
                                    AndroidUtilities.lerp(v0Var.e1, ((StaticLayout) pVar.f).getHeight(), e);
                                }
                                staticLayout = v0Var.m1;
                                if (staticLayout != null) {
                                    staticLayout.getHeight();
                                }
                                v0Var.getHeight();
                                AndroidUtilities.dp(f13);
                                f6Var = v0Var.V0;
                                if (f6Var == null) {
                                    f6Var.l(v0Var.r0, v0Var.q0 + AndroidUtilities.dp(4.0f), v0Var.getMeasuredWidth(), v0Var.s0);
                                } else {
                                    org.telegram.ui.ActionBar.j6.q(v0Var.r0, v0Var.q0 + AndroidUtilities.dp(4.0f), v0Var.getMeasuredWidth(), v0Var.s0);
                                }
                                float a10 = v0Var.n.a(0.02f);
                                canvas3.save();
                                RectF rectF3 = v0Var.l0;
                                canvas3.scale(a10, a10, rectF3.centerX(), rectF3.centerY());
                                if (v0Var.m1 != null) {
                                    canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), v0Var.G("paintChatActionBackgroundSelected"));
                                    if (v0Var.I()) {
                                        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), v0Var.G("paintChatActionBackgroundDarken"));
                                    }
                                    float f29 = v0Var.P1;
                                    Paint paint = v0Var.Q1;
                                    if (f29 > 0.0f) {
                                        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                    }
                                    if (v0Var.getMessageObject().type == 31 || v0Var.getMessageObject().type == 37 || v0Var.getMessageObject().type == 33) {
                                        boolean a11 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.e1();
                                        int color2 = paint.getColor();
                                        paint.setColor(a11 ? 620756991 : TLObject.FLAG_28);
                                        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                        paint.setColor(color2);
                                    }
                                    if (v0Var.getMessageObject().type == 31 || v0Var.getMessageObject().type == 37 || v0Var.getMessageObject().type == 33 || v0Var.getMessageObject().type == 21 || v0Var.getMessageObject().type == 22 || v0Var.getMessageObject().type == 24) {
                                        v0Var.invalidate();
                                    } else {
                                        Path path2 = v0Var.J1;
                                        path2.rewind();
                                        path2.addRoundRect(rectF3, AndroidUtilities.dp(f14), AndroidUtilities.dp(f14), Path.Direction.CW);
                                        canvas3.save();
                                        canvas3.clipPath(path2);
                                        v0Var.K1.d(canvas3);
                                        if (!v0Var.K1.g) {
                                            v0Var.invalidate();
                                        }
                                        canvas3.restore();
                                    }
                                }
                                z4 = messageObject.settingAvatar;
                                if (z4) {
                                    float f30 = v0Var.W;
                                    if (f30 != 1.0f) {
                                        v0Var.W = f30 + 0.10666667f;
                                        f15 = 0.0f;
                                        clamp = Utilities.clamp(v0Var.W, 1.0f, f15);
                                        v0Var.W = clamp;
                                        if (clamp != f15) {
                                            if (v0Var.V == null) {
                                                v0Var.V = new RadialProgressView(v0Var.getContext());
                                            }
                                            int dp8 = AndroidUtilities.dp(f14);
                                            canvas3.save();
                                            float f31 = v0Var.W;
                                            canvas3.scale(f31, f31, rectF3.centerX(), rectF3.centerY());
                                            v0Var.V.setSize(dp8);
                                            v0Var.V.setProgressColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.ic));
                                            v0Var.V.a(canvas3, rectF3.centerX(), rectF3.centerY());
                                            canvas3.restore();
                                        }
                                        if (v0Var.W != 1.0f && v0Var.m1 != null) {
                                            canvas3.save();
                                            float f32 = 1.0f - v0Var.W;
                                            canvas3.scale(f32, f32, rectF3.centerX(), rectF3.centerY());
                                            canvas3.translate(f25, rectF3.top + AndroidUtilities.dp(7.0f));
                                            canvas3.translate(((v0Var.X0 - AndroidUtilities.dp(f14)) - v0Var.m1.getWidth()) / 2.0f, 0.0f);
                                            v0Var.m1.draw(canvas3);
                                            canvas3.restore();
                                        }
                                        if (messageObject.flickerLoading) {
                                            j90 j90Var = v0Var.r;
                                            if (j90Var != null) {
                                                j90Var.d(rectF3);
                                                v0Var.r.j(16.0f);
                                                v0Var.r.a();
                                                v0Var.r.draw(canvas3);
                                                if (v0Var.r.b()) {
                                                    v0Var.r.b = -1L;
                                                }
                                            }
                                        } else {
                                            if (v0Var.r == null) {
                                                j90 j90Var2 = new j90(f6Var);
                                                v0Var.r = j90Var2;
                                                j90Var2.g();
                                                j90 j90Var3 = v0Var.r;
                                                j90Var3.C = true;
                                                j90Var3.f(org.telegram.ui.ActionBar.j6.l1(0.08f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
                                                v0Var.r.w.setStrokeWidth(AndroidUtilities.dp(1.0f));
                                            }
                                            j90 j90Var4 = v0Var.r;
                                            j90Var4.c = -1L;
                                            j90Var4.d(rectF3);
                                            v0Var.r.j(16.0f);
                                            v0Var.r.draw(canvas3);
                                        }
                                        canvas3.restore();
                                        if (v0Var.B1 != null && v0Var.G1 != null && v0Var.H1 != null) {
                                            G = v0Var.G("paintChatActionBackground");
                                            Paint G2 = v0Var.G("paintChatActionBackgroundDarken");
                                            float dp9 = (v0Var.B1.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                            float dp10 = v0Var.B1.top - AndroidUtilities.dp(2.0f);
                                            if (f6Var == null) {
                                                f6Var.l(v0Var.r0 + dp9, v0Var.q0 + AndroidUtilities.dp(4.0f) + dp10, v0Var.getMeasuredWidth(), v0Var.s0);
                                            } else {
                                                org.telegram.ui.ActionBar.j6.q(v0Var.r0 + dp9, v0Var.q0 + AndroidUtilities.dp(4.0f) + dp10, v0Var.getMeasuredWidth(), v0Var.s0);
                                            }
                                            canvas3.save();
                                            canvas3.translate(dp9, dp10);
                                            ColorFilter colorFilter = G.getColorFilter();
                                            PathEffect pathEffect = G.getPathEffect();
                                            a2 = f6Var == null ? f6Var.a() : org.telegram.ui.ActionBar.j6.e1();
                                            if (v0Var.E1 != null || v0Var.D1 != a2) {
                                                colorMatrix = new ColorMatrix();
                                                if ((G.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                                    ((ColorMatrixColorFilter) G.getColorFilter()).getColorMatrix(colorMatrix);
                                                }
                                                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !a2 ? 0.1f : -0.08f);
                                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !a2 ? 0.15f : 0.1f);
                                                v0Var.E1 = new ColorMatrixColorFilter(colorMatrix);
                                                v0Var.D1 = a2;
                                            }
                                            G.setColorFilter(v0Var.E1);
                                            G.setPathEffect(v0Var.F1);
                                            canvas3.drawPath(v0Var.G1, G);
                                            G.setColorFilter(colorFilter);
                                            G.setPathEffect(pathEffect);
                                            if (v0Var.I()) {
                                                PathEffect pathEffect2 = G2.getPathEffect();
                                                G2.setPathEffect(v0Var.F1);
                                                canvas3.drawPath(v0Var.G1, G2);
                                                G2.setPathEffect(pathEffect2);
                                            }
                                            canvas3.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                            v0Var.H1.c(AndroidUtilities.dp(40.43f) - (v0Var.H1.h() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas3);
                                            canvas3.restore();
                                        }
                                    }
                                }
                                if (!z4) {
                                    float f33 = v0Var.W;
                                    f15 = 0.0f;
                                    if (f33 != 0.0f) {
                                        v0Var.W = f33 - 0.10666667f;
                                    }
                                    clamp = Utilities.clamp(v0Var.W, 1.0f, f15);
                                    v0Var.W = clamp;
                                    if (clamp != f15) {
                                    }
                                    if (v0Var.W != 1.0f) {
                                        canvas3.save();
                                        float f322 = 1.0f - v0Var.W;
                                        canvas3.scale(f322, f322, rectF3.centerX(), rectF3.centerY());
                                        canvas3.translate(f25, rectF3.top + AndroidUtilities.dp(7.0f));
                                        canvas3.translate(((v0Var.X0 - AndroidUtilities.dp(f14)) - v0Var.m1.getWidth()) / 2.0f, 0.0f);
                                        v0Var.m1.draw(canvas3);
                                        canvas3.restore();
                                    }
                                    if (messageObject.flickerLoading) {
                                    }
                                    canvas3.restore();
                                    if (v0Var.B1 != null) {
                                        G = v0Var.G("paintChatActionBackground");
                                        Paint G22 = v0Var.G("paintChatActionBackgroundDarken");
                                        float dp92 = (v0Var.B1.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                        float dp102 = v0Var.B1.top - AndroidUtilities.dp(2.0f);
                                        if (f6Var == null) {
                                        }
                                        canvas3.save();
                                        canvas3.translate(dp92, dp102);
                                        ColorFilter colorFilter2 = G.getColorFilter();
                                        PathEffect pathEffect3 = G.getPathEffect();
                                        if (f6Var == null) {
                                        }
                                        if (v0Var.E1 != null) {
                                        }
                                        colorMatrix = new ColorMatrix();
                                        if (G.getColorFilter() instanceof ColorMatrixColorFilter) {
                                            ((ColorMatrixColorFilter) G.getColorFilter()).getColorMatrix(colorMatrix);
                                        }
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !a2 ? 0.1f : -0.08f);
                                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !a2 ? 0.15f : 0.1f);
                                        v0Var.E1 = new ColorMatrixColorFilter(colorMatrix);
                                        v0Var.D1 = a2;
                                        G.setColorFilter(v0Var.E1);
                                        G.setPathEffect(v0Var.F1);
                                        canvas3.drawPath(v0Var.G1, G);
                                        G.setColorFilter(colorFilter2);
                                        G.setPathEffect(pathEffect3);
                                        if (v0Var.I()) {
                                        }
                                        canvas3.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                        v0Var.H1.c(AndroidUtilities.dp(40.43f) - (v0Var.H1.h() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas3);
                                        canvas3.restore();
                                    }
                                }
                                f15 = 0.0f;
                                clamp = Utilities.clamp(v0Var.W, 1.0f, f15);
                                v0Var.W = clamp;
                                if (clamp != f15) {
                                }
                                if (v0Var.W != 1.0f) {
                                }
                                if (messageObject.flickerLoading) {
                                }
                                canvas3.restore();
                                if (v0Var.B1 != null) {
                                }
                            }
                        } else {
                            i12 = 4;
                        }
                        canvas3 = canvas2;
                        f13 = 8.0f;
                        f14 = 16.0f;
                        if (this.p1 == null) {
                            TextPaint textPaint8 = new TextPaint();
                            this.o1 = textPaint8;
                            textPaint8.setTextSize(AndroidUtilities.dp(13.0f));
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.ActionSettingWallpaper));
                            int indexOf = spannableStringBuilder.toString().indexOf("...");
                            if (indexOf < 0) {
                                indexOf = spannableStringBuilder.toString().indexOf("…");
                                i14 = 1;
                            } else {
                                i14 = 3;
                            }
                            if (indexOf >= 0) {
                                SpannableString spannableString = new SpannableString("…");
                                nh.o9 o9Var = new nh.o9();
                                o9Var.r = true;
                                o9Var.a(this);
                                spannableString.setSpan(o9Var, 0, spannableString.length(), 33);
                                spannableStringBuilder.replace(indexOf, i14 + indexOf, (CharSequence) spannableString);
                            }
                            TextPaint textPaint9 = this.o1;
                            eg.p pVar4 = this.h1;
                            this.p1 = new StaticLayout(spannableStringBuilder, textPaint9, pVar4 == null ? 1 : pVar4.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        float H2 = H(messageObject);
                        if (this.r1 == null || this.q1 != H2) {
                            this.q1 = H2;
                            String m9 = android.support.v4.media.a.m((int) (H2 * 100.0f), "%", new StringBuilder());
                            eg.p pVar5 = this.h1;
                            TextPaint textPaint10 = textPaint2;
                            textPaint3 = textPaint10;
                            this.r1 = new StaticLayout(m9, textPaint10, pVar5 == null ? 1 : pVar5.c, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            textPaint3 = textPaint2;
                        }
                        this.o1.setColor(textPaint3.getColor());
                        if (radialProgress23.a() == i12) {
                            float b10 = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                            int color3 = textPaint3.getColor();
                            float f34 = 1.0f - b10;
                            this.o1.setAlpha((int) (Color.alpha(color3) * f34));
                            textPaint3.setAlpha((int) (Color.alpha(color3) * b10));
                            textPaint3.linkColor = textPaint3.getColor();
                            if (this.h1 != null) {
                                float f35 = (b10 * 0.2f) + 0.8f;
                                canvas3.save();
                                canvas3.scale(f35, f35, this.X0 / 2.0f, ((StaticLayout) this.h1.f).getHeight() / 2.0f);
                                canvas3.translate((this.X0 - ((StaticLayout) this.h1.f).getWidth()) / 2.0f, 0.0f);
                                this.h1.a = ((this.X0 - ((StaticLayout) r0.f).getWidth()) / 2.0f) + f25;
                                this.h1.b = f28;
                                int color4 = textPaint3.getColor();
                                eg.p pVar6 = this.h1;
                                i13 = color3;
                                ih.k.g(this, false, color4, 0, (AtomicReference) pVar6.g, 1, (StaticLayout) pVar6.f, pVar6.e, canvas3, false);
                                eg.p pVar7 = this.h1;
                                v0Var2 = this;
                                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, (StaticLayout) pVar7.f, (org.telegram.ui.Components.q5) pVar7.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, E(textPaint3.getColor()));
                                canvas3 = canvas;
                                canvas3.restore();
                            } else {
                                v0Var2 = this;
                                i13 = color3;
                            }
                            textPaint3.setAlpha((int) (Color.alpha(i13) * f34));
                            textPaint3.linkColor = textPaint3.getColor();
                            float f36 = (f34 * 0.2f) + 0.8f;
                            canvas3.save();
                            canvas3.scale(f36, f36, v0Var2.X0 / 2.0f, v0Var2.p1.getHeight() / 2.0f);
                            canvas3.translate((v0Var2.X0 - v0Var2.p1.getWidth()) / 2.0f, 0.0f);
                            ih.k.f(canvas3, v0Var2.p1);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.translate(0.0f, AndroidUtilities.dp(4.0f) + v0Var2.p1.getHeight());
                            canvas3.scale(f36, f36, v0Var2.X0 / 2.0f, v0Var2.r1.getHeight() / 2.0f);
                            canvas3.translate((v0Var2.X0 - v0Var2.r1.getWidth()) / 2.0f, 0.0f);
                            ih.k.f(canvas3, v0Var2.r1);
                            canvas3.restore();
                            textPaint3.setColor(i13);
                            textPaint3.linkColor = i13;
                        } else {
                            v0Var2 = this;
                            canvas3.save();
                            canvas3.translate((v0Var2.X0 - v0Var2.p1.getWidth()) / 2.0f, 0.0f);
                            v0Var2.p1.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.translate((v0Var2.X0 - v0Var2.r1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + v0Var2.p1.getHeight());
                            ih.k.f(canvas3, v0Var2.r1);
                            canvas3.restore();
                        }
                        v0Var = v0Var2;
                        canvas3.restore();
                        if (v0Var.Y0 == null) {
                        }
                        pVar = v0Var.h1;
                        if (pVar != null) {
                        }
                        staticLayout = v0Var.m1;
                        if (staticLayout != null) {
                        }
                        v0Var.getHeight();
                        AndroidUtilities.dp(f13);
                        f6Var = v0Var.V0;
                        if (f6Var == null) {
                        }
                        float a102 = v0Var.n.a(0.02f);
                        canvas3.save();
                        RectF rectF32 = v0Var.l0;
                        canvas3.scale(a102, a102, rectF32.centerX(), rectF32.centerY());
                        if (v0Var.m1 != null) {
                        }
                        z4 = messageObject.settingAvatar;
                        if (z4) {
                        }
                        if (!z4) {
                        }
                        f15 = 0.0f;
                        clamp = Utilities.clamp(v0Var.W, 1.0f, f15);
                        v0Var.W = clamp;
                        if (clamp != f15) {
                        }
                        if (v0Var.W != 1.0f) {
                        }
                        if (messageObject.flickerLoading) {
                        }
                        canvas3.restore();
                        if (v0Var.B1 != null) {
                        }
                    } else {
                        v0Var2 = this;
                        canvas3 = canvas2;
                        TextPaint textPaint11 = textPaint2;
                        f13 = 8.0f;
                        f14 = 16.0f;
                        eg.p pVar8 = v0Var2.h1;
                        if (pVar8 != null) {
                            float height3 = ((StaticLayout) pVar8.f).getHeight();
                            if (e < 1.0f) {
                                height3 = AndroidUtilities.lerp(v0Var2.e1, height3, e);
                                RectF rectF4 = AndroidUtilities.rectTmp;
                                rectF4.set(0.0f, -AndroidUtilities.dp(20.0f), v0Var2.getWidth(), height3);
                                canvas3.saveLayerAlpha(rectF4, 255, 31);
                            } else {
                                canvas3.save();
                            }
                            canvas3.translate(((v0Var2.X0 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) v0Var2.h1.f).getWidth()) / 2.0f, 0.0f);
                            v0Var2.h1.a = (((v0Var2.X0 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) v0Var2.h1.f).getWidth()) / 2.0f) + f25;
                            eg.p pVar9 = v0Var2.h1;
                            pVar9.b = f28;
                            int color5 = pVar9.d.getColor();
                            eg.p pVar10 = v0Var2.h1;
                            float f37 = height3;
                            ih.k.g(v0Var2, false, color5, 0, (AtomicReference) pVar10.g, 1, (StaticLayout) pVar10.f, pVar10.e, canvas3, false);
                            eg.p pVar11 = v0Var2.h1;
                            StaticLayout staticLayout5 = (StaticLayout) pVar11.f;
                            org.telegram.ui.Components.q5 q5Var2 = (org.telegram.ui.Components.q5) pVar11.h;
                            ColorFilter E = v0Var2.E(textPaint11.getColor());
                            v0Var = v0Var2;
                            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, staticLayout5, q5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, E);
                            canvas3 = canvas;
                            if (e < 1.0f && v0Var.l1 != null) {
                                canvas3.save();
                                if (v0Var.g1 == null) {
                                    v0Var.g1 = new i20();
                                }
                                canvas3.translate((-((v0Var.X0 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) v0Var.h1.f).getWidth())) / 2.0f, 0.0f);
                                RectF rectF5 = AndroidUtilities.rectTmp;
                                rectF5.set((v0Var.i1 - v0Var.l1.h()) + AndroidUtilities.dp(8.0f), (v0Var.j1 - v0Var.k1) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + v0Var.i1, v0Var.j1);
                                float f38 = 1.0f - e;
                                v0Var.g1.a(canvas3, rectF5, f38);
                                rectF5.set((v0Var.i1 - v0Var.l1.h()) - AndroidUtilities.dp(16.0f), (v0Var.j1 - v0Var.k1) - AndroidUtilities.dp(6.0f), (v0Var.i1 - v0Var.l1.h()) + AndroidUtilities.dp(8.0f), v0Var.j1);
                                v0Var.g1.b(canvas3, rectF5, 2, f38);
                                rectF5.set(0.0f, f37 - AndroidUtilities.dp(12.0f), v0Var.getWidth(), f37);
                                v0Var.g1.b(canvas3, rectF5, 3, (1.0f - f38) * f38 * 4.0f);
                                canvas3.restore();
                            }
                            canvas3.restore();
                            if (e < 1.0f && (k01Var = v0Var.l1) != null) {
                                k01Var.c((v0Var.i1 - k01Var.h()) + AndroidUtilities.dp(5.0f), (v0Var.j1 - (v0Var.k1 / 2.0f)) - AndroidUtilities.dp(1.0f), 1.0f - e, v0Var.h1.d.getColor(), canvas3);
                            }
                            canvas3.restore();
                            if (v0Var.Y0 == null) {
                            }
                            pVar = v0Var.h1;
                            if (pVar != null) {
                            }
                            staticLayout = v0Var.m1;
                            if (staticLayout != null) {
                            }
                            v0Var.getHeight();
                            AndroidUtilities.dp(f13);
                            f6Var = v0Var.V0;
                            if (f6Var == null) {
                            }
                            float a1022 = v0Var.n.a(0.02f);
                            canvas3.save();
                            RectF rectF322 = v0Var.l0;
                            canvas3.scale(a1022, a1022, rectF322.centerX(), rectF322.centerY());
                            if (v0Var.m1 != null) {
                            }
                            z4 = messageObject.settingAvatar;
                            if (z4) {
                            }
                            if (!z4) {
                            }
                            f15 = 0.0f;
                            clamp = Utilities.clamp(v0Var.W, 1.0f, f15);
                            v0Var.W = clamp;
                            if (clamp != f15) {
                            }
                            if (v0Var.W != 1.0f) {
                            }
                            if (messageObject.flickerLoading) {
                            }
                            canvas3.restore();
                            if (v0Var.B1 != null) {
                            }
                        }
                        v0Var = v0Var2;
                        canvas3.restore();
                        if (v0Var.Y0 == null) {
                        }
                        pVar = v0Var.h1;
                        if (pVar != null) {
                        }
                        staticLayout = v0Var.m1;
                        if (staticLayout != null) {
                        }
                        v0Var.getHeight();
                        AndroidUtilities.dp(f13);
                        f6Var = v0Var.V0;
                        if (f6Var == null) {
                        }
                        float a10222 = v0Var.n.a(0.02f);
                        canvas3.save();
                        RectF rectF3222 = v0Var.l0;
                        canvas3.scale(a10222, a10222, rectF3222.centerX(), rectF3222.centerY());
                        if (v0Var.m1 != null) {
                        }
                        z4 = messageObject.settingAvatar;
                        if (z4) {
                        }
                        if (!z4) {
                        }
                        f15 = 0.0f;
                        clamp = Utilities.clamp(v0Var.W, 1.0f, f15);
                        v0Var.W = clamp;
                        if (clamp != f15) {
                        }
                        if (v0Var.W != 1.0f) {
                        }
                        if (messageObject.flickerLoading) {
                        }
                        canvas3.restore();
                        if (v0Var.B1 != null) {
                        }
                    }
                } else {
                    v0Var = this;
                }
                v0Var.B(canvas3, false);
                v0Var.f2.a();
                canvas3.restore();
            }
            textPaint = this.p0;
            arrayList = this.m0;
            if (textPaint != null) {
            }
            radialProgress2 = radialProgress22;
            textPaint2 = textPaint5;
            i11 = 22;
            if (this.p0 != null) {
                canvas3.save();
                canvas3.translate(this.R, this.P - this.N);
                if (this.M.getPaint() != this.p0) {
                }
                canvas3.save();
                ih.k.d(canvas3, arrayList);
                ih.k.f(canvas3, this.M);
                t0Var = this.U0;
                if (t0Var != null) {
                }
                StaticLayout staticLayout32 = this.M;
                org.telegram.ui.Components.q5 q5Var3 = this.o0;
                StaticLayout staticLayout42 = this.J;
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, staticLayout32, q5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout42 != null ? null : E(staticLayout42.getPaint().getColor()));
                canvas3 = canvas;
                canvas3.restore();
                size = arrayList.size();
                i15 = 0;
                while (i15 < size) {
                }
                canvas3.restore();
            }
            if (i5Var.d()) {
            }
            v0Var = this;
            v0Var.B(canvas3, false);
            v0Var.f2.a();
            canvas3.restore();
        }
        textPaint = this.p0;
        arrayList = this.m0;
        if (textPaint != null) {
        }
        radialProgress2 = radialProgress22;
        textPaint2 = textPaint5;
        i11 = 22;
        if (this.p0 != null) {
        }
        if (i5Var.d()) {
        }
        v0Var = this;
        v0Var.B(canvas3, false);
        v0Var.f2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        MessageObject messageObject = this.E0;
        if (TextUtils.isEmpty(this.G0) && messageObject == null) {
            return;
        }
        if (this.a2 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.G0) ? this.G0 : messageObject.messageText);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new i(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.a2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.a2.toString());
        } else {
            accessibilityNodeInfo.setText(this.a2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        RectF rectF = this.l0;
        this.I1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean d;
        float f10;
        float dp;
        float dp2;
        float f11;
        TLRPC.Message message;
        int i13;
        int dp3;
        int i14;
        int dp4;
        int i15;
        MessageObject messageObject = this.E0;
        if (messageObject == null && this.G0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(14.0f) + this.i0 + this.L);
            return;
        }
        if (K(messageObject)) {
            this.X0 = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            if ((!AndroidUtilities.isTablet() && ((i15 = messageObject.type) == 18 || i15 == 30 || M())) || messageObject.type == 35) {
                this.X0 = (int) (this.X0 * 1.2f);
            }
            this.W0 = this.X0 - AndroidUtilities.dp(106.0f);
            if (messageObject.type == 31) {
                this.X0 = Math.min(this.X0, AndroidUtilities.dp(192.0f));
                this.W0 = AndroidUtilities.dp(78.0f);
            }
            if (messageObject.type == 33) {
                this.X0 = Math.min(this.X0, AndroidUtilities.dp(220.0f));
                this.W0 = AndroidUtilities.dp(78.0f);
            }
            int i16 = messageObject.type;
            ImageReceiver imageReceiver = this.F;
            if (i16 == 37) {
                this.W0 = AndroidUtilities.dp(52.0f);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
            } else if (N()) {
                imageReceiver.setRoundRadius(this.W0 / 2);
            } else {
                imageReceiver.setRoundRadius(0);
            }
        }
        int max = Math.max(AndroidUtilities.dp(30.0f), View.MeasureSpec.getSize(i10));
        if (this.S != max) {
            this.x0 = true;
            this.S = max;
            r();
        }
        if (messageObject != null) {
            if (messageObject.type == 11) {
                i14 = AndroidUtilities.roundMessageSize;
                dp4 = AndroidUtilities.dp(10.0f);
            } else if (K(messageObject)) {
                i14 = this.X0;
                dp4 = AndroidUtilities.dp(12.0f);
            }
            i12 = dp4 + i14;
            lh.i5 i5Var = this.C0;
            d = i5Var.d();
            mg.r0 r0Var = this.z0;
            if (!d) {
                r9 = org.telegram.messenger.y3.C(8.0f, i5Var.M, i5Var.p ? 0 : AndroidUtilities.dp(16.0f) + this.P + this.L);
                if (!r0Var.s) {
                    dp3 = AndroidUtilities.dp(8.0f) + r0Var.o;
                    r0Var.p = dp3;
                    r9 += dp3;
                }
                if (this.E0 != null && !r0Var.s) {
                    int dp5 = AndroidUtilities.dp(8.0f) + r0Var.o;
                    r0Var.p = dp5;
                    i12 += dp5;
                }
                if (M()) {
                    i12 = org.telegram.messenger.y3.C(24.0f, this.N, i12);
                }
                if (messageObject == null && N()) {
                    setMeasuredDimension(max, this.i0 + r9);
                } else {
                    setMeasuredDimension(max, AndroidUtilities.dp(14.0f) + this.i0 + this.L + i12);
                }
                r0Var.d = (getMeasuredHeight() - getPaddingTop()) - r0Var.p;
                return;
            }
            ky0 ky0Var = this.D0;
            if (ky0Var != null) {
                r9 = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(140.0f) + ((int) ky0Var.f.j()) + (ky0Var.i ? AndroidUtilities.dp(40.0f) : 0);
                if (!r0Var.s) {
                    dp3 = AndroidUtilities.dp(8.0f) + r0Var.o;
                    r0Var.p = dp3;
                    r9 += dp3;
                }
            } else if (K(messageObject)) {
                boolean z4 = messageObject != null && messageObject.type == 25;
                int F = F(messageObject);
                if (N()) {
                    f10 = 8.0f;
                    int dp6 = AndroidUtilities.dp(4.0f) + this.P + this.L + (F > 0 ? org.telegram.messenger.y3.D(16.0f, 2, F) : AndroidUtilities.dp(16.0f));
                    eg.p pVar = this.h1;
                    dp = dp6 + (pVar == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) pVar.f).getHeight());
                } else {
                    f10 = 8.0f;
                    dp = (this.h1 == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) r2.f).getHeight()) + (this.X0 * 0.075f) + this.P + this.L + F + AndroidUtilities.dp(4.0f);
                }
                this.z1 = 0;
                if (this.Y0 != null) {
                    float height = dp + r4.getHeight();
                    if (this.Y0.getLineCount() > 1) {
                        this.z1 = (this.Y0.getHeight() - this.Y0.getLineTop(1)) + this.z1;
                    }
                    dp2 = height + AndroidUtilities.dp(z4 ? 6.0f : 0.0f);
                    if (this.b1 != null) {
                        dp2 += AndroidUtilities.dp(9.0f) + r3.getHeight();
                    }
                    if (this.a1 != null) {
                        dp2 += AndroidUtilities.dp(24.0f);
                    }
                } else {
                    dp2 = dp - AndroidUtilities.dp(12.0f);
                    this.z1 -= AndroidUtilities.dp(30.0f);
                }
                eg.p pVar2 = this.h1;
                int height2 = pVar2 == null ? 0 : ((StaticLayout) pVar2.f).getHeight();
                if (this.h1 == null) {
                    this.z1 = 0;
                } else if (this.b1 != null) {
                    this.z1 = org.telegram.messenger.y3.C(10.0f, height2, this.z1);
                } else {
                    MessageObject messageObject2 = this.E0;
                    if (messageObject2.type == 18 || messageObject2.isStarGiftAction()) {
                        this.z1 = org.telegram.ui.b.C(this.m1 == null ? 0.0f : 10.0f, height2, this.z1);
                    } else if (this.E0.type == 30) {
                        this.z1 = org.telegram.ui.b.C(20.0f, height2, this.z1);
                    } else if (this.d1) {
                        this.z1 += height2;
                    } else if (((StaticLayout) this.h1.f).getLineCount() > 2) {
                        this.z1 = ((((StaticLayout) this.h1.f).getLineCount() * (((StaticLayout) this.h1.f).getLineBottom(0) - ((StaticLayout) this.h1.f).getLineTop(0))) - 2) + this.z1;
                    }
                }
                if (this.a1 != null) {
                    this.z1 = AndroidUtilities.dp(24.0f) + this.z1;
                }
                int dp7 = this.z1 - AndroidUtilities.dp(z4 ? 14.0f : 0.0f);
                this.z1 = dp7;
                i12 += dp7;
                int dp8 = AndroidUtilities.dp(14.0f) + this.L + i12;
                StaticLayout staticLayout = this.m1;
                RectF rectF = this.l0;
                if (staticLayout != null) {
                    float x10 = e2.c.x((dp8 - dp2) - staticLayout.getHeight(), AndroidUtilities.dp(f10), 2.0f, dp2);
                    if (this.E0.isStarGiftAction()) {
                        x10 += AndroidUtilities.dp(4.0f);
                    }
                    float f12 = (this.S - this.s1) / 2.0f;
                    f11 = 2.0f;
                    rectF.set(f12 - AndroidUtilities.dp(18.0f), x10 - AndroidUtilities.dp(f10), f12 + this.s1 + AndroidUtilities.dp(18.0f), x10 + (this.m1 != null ? r6.getHeight() : 0) + AndroidUtilities.dp(f10));
                } else {
                    f11 = 2.0f;
                    i12 -= AndroidUtilities.dp(40.0f);
                    this.z1 -= AndroidUtilities.dp(40.0f);
                    MessageObject messageObject3 = this.E0;
                    if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        i12 -= AndroidUtilities.dp(f10);
                        this.z1 -= AndroidUtilities.dp(f10);
                    }
                }
                int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                eg.p2 p2Var = this.K1;
                p2Var.a.set(rectF);
                p2Var.b.set(rectF);
                if (this.L1 != measuredWidth) {
                    this.L1 = measuredWidth;
                    p2Var.f();
                }
                if (N()) {
                    int dp9 = AndroidUtilities.dp(4.0f) + this.P + this.L;
                    this.f = 0;
                    int D = F > 0 ? org.telegram.messenger.y3.D(16.0f, 2, F) : AndroidUtilities.dp(16.0f);
                    this.f = D;
                    StaticLayout staticLayout2 = this.b1;
                    if (staticLayout2 != null) {
                        this.f = org.telegram.messenger.y3.C(10.0f, staticLayout2.getHeight(), D);
                    }
                    if (this.a1 != null) {
                        this.f = AndroidUtilities.dp(15.0f) + this.f;
                    }
                    int i17 = this.f + height2;
                    this.f = i17;
                    float f13 = (this.S - this.s1) / f11;
                    if (this.m1 != null) {
                        this.h = AndroidUtilities.dp(7.0f) + i17 + dp9;
                        rectF.set(f13 - AndroidUtilities.dp(18.0f), this.h, f13 + this.s1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.y3.D(8.0f, 2, this.m1.getHeight() + this.h));
                        this.f = (int) (rectF.height() + AndroidUtilities.dp(4.0f) + this.f);
                    } else if (!M() && (i13 = messageObject.type) != 34 && i13 != 33 && i13 != 35) {
                        rectF.set(f13 - AndroidUtilities.dp(18.0f), this.h, f13 + this.s1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.y3.D(8.0f, 2, AndroidUtilities.dp(17.0f) + this.h));
                        this.f = AndroidUtilities.dp(17.0f) + this.f;
                    }
                    int dp10 = AndroidUtilities.dp(15.0f) + this.f;
                    this.f = dp10;
                    int dp11 = AndroidUtilities.dp(6.0f) + dp9 + dp10;
                    if (!r0Var.s) {
                        int dp12 = AndroidUtilities.dp(8.0f) + r0Var.o;
                        r0Var.p = dp12;
                        dp11 += dp12;
                    }
                    r9 = dp11;
                    if (this.N1 != null) {
                        r9 += AndroidUtilities.dp(44.0f);
                    }
                }
                rectF.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
            }
            if (this.E0 != null) {
                int dp52 = AndroidUtilities.dp(8.0f) + r0Var.o;
                r0Var.p = dp52;
                i12 += dp52;
            }
            if (M()) {
            }
            if (messageObject == null) {
            }
            setMeasuredDimension(max, AndroidUtilities.dp(14.0f) + this.i0 + this.L + i12);
            r0Var.d = (getMeasuredHeight() - getPaddingTop()) - r0Var.p;
            return;
        }
        i12 = 0;
        lh.i5 i5Var2 = this.C0;
        d = i5Var2.d();
        mg.r0 r0Var2 = this.z0;
        if (!d) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.E0;
        if (messageObject == null || messageObject.type != 11) {
            return;
        }
        int size = messageObject.photoThumbs.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                photoSize = null;
                break;
            }
            photoSize = messageObject.photoThumbs.get(i10);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                break;
            } else {
                i10++;
            }
        }
        this.F.setImage(this.u0, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.I, 0L, null, messageObject, 1);
        DownloadController.getInstance(this.E).removeLoadingFileObserver(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        x40 x40Var;
        eg.p pVar;
        eg.p pVar2;
        TLRPC.Message message;
        boolean z4;
        int i10;
        BotInlineKeyboard.ButtonCustom buttonCustom;
        MessageObject messageObject;
        TLRPC.Message message2;
        MessageObject messageObject2;
        TLRPC.Message message3;
        TLRPC.Message message4;
        long j10;
        TLObject chat;
        int i11;
        SpannableStringBuilder replaceTags;
        boolean z10;
        boolean z11;
        StaticLayout staticLayout;
        ArrayList arrayList;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        TLRPC.Message message5;
        int i12;
        MessageObject messageObject3 = this.E0;
        float x10 = motionEvent.getX() - (this.g0 / 2.0f);
        this.v0 = x10;
        float y10 = motionEvent.getY() + getPaddingTop();
        this.w0 = y10;
        if (messageObject3 == null) {
            if (this.S1 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.P0 && x10 <= this.Q0) {
                        this.C = true;
                        return true;
                    }
                } else if (this.C) {
                    if (motionEvent.getAction() == 1) {
                        this.S1.onClick(this);
                        this.C = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.C = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        d21 d21Var = this.k0;
        if (d21Var != null && d21Var.d(motionEvent, false)) {
            return true;
        }
        ky0 ky0Var = this.D0;
        if (ky0Var != null) {
            rc rcVar = ky0Var.m;
            boolean contains = ky0Var.k.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                rcVar.c(contains);
            } else if (motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1) {
                    if (rcVar.h) {
                        ky0Var.b();
                    }
                    rcVar.c(false);
                } else if (motionEvent.getAction() == 3) {
                    rcVar.c(false);
                }
            }
            if (rcVar.h) {
                return true;
            }
        }
        lh.i5 i5Var = this.C0;
        if ((i5Var.d() && i5Var.e(this.A0, this.B0, motionEvent)) || this.z0.c(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        lf.b bVar = lf.b.a;
        RectF rectF = this.l0;
        ImageReceiver imageReceiver = this.F;
        int i13 = this.E;
        View view = this.I1;
        rc rcVar2 = this.n;
        if (action == 0) {
            if (this.U0 != null) {
                if ((messageObject3.type == 11 || K(messageObject3)) && imageReceiver.isInsideImage(x10, y10)) {
                    this.T = true;
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (this.y1.i.q == 4 && (((i12 = messageObject3.type) == 21 || i12 == 22) && this.B1.contains(x10, y10))) {
                    this.T = true;
                    z12 = true;
                }
                eg.p pVar3 = this.h1;
                if (pVar3 == null || !this.d1) {
                    z13 = z12;
                } else {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f10 = pVar3.a;
                    z13 = z12;
                    rectF2.set(f10, pVar3.b, ((StaticLayout) pVar3.f).getWidth() + f10, this.h1.b + ((StaticLayout) r1.f).getHeight());
                    if (rectF2.contains(x10, y10)) {
                        this.B = true;
                        z14 = true;
                        if (K(messageObject3) || this.m1 == null || !(rectF.contains(x10, y10) || (this.n1 && this.B1.contains(x10, y10)))) {
                            z15 = true;
                        } else {
                            z15 = true;
                            this.U = true;
                            view.setPressed(true);
                            rcVar2.c(true);
                            z14 = true;
                        }
                        if (!z14 && M()) {
                            this.B = z15;
                            z14 = true;
                        }
                        if (!z14) {
                            MessageObject messageObject4 = this.E0;
                            if (lf.d.g((messageObject4 == null || (message5 = messageObject4.messageOwner) == null) ? null : message5.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                this.B = true;
                                z14 = true;
                            }
                        }
                        if (z14) {
                            q();
                        }
                        z4 = z14;
                    }
                }
                z14 = z13;
                if (K(messageObject3)) {
                }
                z15 = true;
                if (!z14) {
                    this.B = z15;
                    z14 = true;
                }
                if (!z14) {
                }
                if (z14) {
                }
                z4 = z14;
            }
            z4 = false;
        } else {
            if (motionEvent.getAction() != 2) {
                k();
            }
            if (this.C) {
                if (motionEvent.getAction() == 2) {
                    if (x10 < this.P0 || x10 > this.Q0) {
                        z4 = false;
                        this.C = false;
                    }
                } else if (motionEvent.getAction() == 1) {
                    View.OnClickListener onClickListener = this.S1;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    this.C = false;
                } else if (motionEvent.getAction() == 3) {
                    this.C = false;
                }
                z4 = false;
            } else {
                if (this.B) {
                    int action2 = motionEvent.getAction();
                    if (action2 == 1) {
                        this.B = false;
                        view.setPressed(false);
                        rcVar2.c(false);
                        if (this.U0 == null || messageObject3.replyMessageObject == null || (message = messageObject3.messageOwner) == null || !lf.d.g(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                            if (this.d1 && !this.c1 && (pVar2 = this.h1) != null) {
                                int height = ((StaticLayout) pVar2.f).getHeight() - this.e1;
                                this.c1 = true;
                                t0 t0Var = this.U0;
                                if (t0Var == null) {
                                    return true;
                                }
                                t0Var.b0(this);
                                if (!(getParent() instanceof rl0)) {
                                    return true;
                                }
                                ((rl0) getParent()).v0(0, AndroidUtilities.dp(24.0f) + height, null);
                                return true;
                            }
                            if (this.D0 != null && this.B1.contains(motionEvent.getX(), motionEvent.getY())) {
                                this.D0.b();
                                return true;
                            }
                        } else {
                            this.U0.V(this, this.E0.getReplyMsgId());
                        }
                    } else if (action2 == 2) {
                        eg.p pVar4 = this.h1;
                        if (pVar4 == null || !this.d1) {
                            this.B = false;
                        } else {
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            float f11 = pVar4.a;
                            rectF3.set(f11, pVar4.b, ((StaticLayout) pVar4.f).getWidth() + f11, this.h1.b + ((StaticLayout) r9.f).getHeight());
                            if (!rectF3.contains(x10, y10)) {
                                this.B = false;
                            }
                        }
                        z4 = true;
                    } else if (action2 == 3) {
                        this.B = false;
                        rcVar2.c(false);
                    }
                } else if (this.U) {
                    int action3 = motionEvent.getAction();
                    if (action3 == 1) {
                        this.T = false;
                        this.U = false;
                        view.setPressed(false);
                        rcVar2.c(false);
                        if (this.U0 != null) {
                            int i14 = messageObject3.type;
                            if (i14 == 37) {
                                playSoundEffect(0);
                                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                if (U != null) {
                                    new sh.i0(U, ((TLRPC.TL_messageActionChangeCommunity) messageObject3.messageOwner.action).community_id, null, null).show();
                                }
                            } else if (i14 == 31) {
                                playSoundEffect(0);
                                S();
                            } else if (i14 == 25) {
                                playSoundEffect(0);
                                if (this.U0 != null) {
                                    AndroidUtilities.runOnUIThread(new ia(4, this, (TLRPC.TL_messageActionGiftCode) this.E0.messageOwner.action));
                                }
                            } else if (i14 == 18) {
                                playSoundEffect(0);
                                R();
                            } else if (i14 == 30) {
                                playSoundEffect(0);
                                S();
                            } else {
                                TLRPC.Message message6 = messageObject3.messageOwner;
                                if (message6 != null) {
                                    TLRPC.MessageAction messageAction = message6.action;
                                    if ((messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).balance_too_low) {
                                        playSoundEffect(0);
                                        MessageSuggestionParams obtainSuggestionOffer = this.E0.obtainSuggestionOffer();
                                        lf.a aVar = obtainSuggestionOffer.amount;
                                        if (aVar != null && aVar.a == bVar) {
                                            new lh.z9(getContext(), this.V0, obtainSuggestionOffer.amount.a(), 13, ag.f.h(i13, this.E0.getDialogId()), null, this.E0.getDialogId()).show();
                                        }
                                    }
                                }
                                if (MessagesController.getInstance(i13).photoSuggestion.get(messageObject3.messageOwner.local_id) == null) {
                                    if (this.n1) {
                                        this.U0.o0(this);
                                    } else {
                                        this.U0.w0(this);
                                    }
                                }
                            }
                        }
                    } else if (action3 != 2) {
                        if (action3 == 3) {
                            this.T = false;
                            this.U = false;
                            view.setPressed(false);
                            rcVar2.c(false);
                        }
                    } else if (!K(messageObject3) || (!rectF.contains(x10, y10) && !this.B1.contains(x10, y10))) {
                        this.U = false;
                        view.setPressed(false);
                        rcVar2.c(false);
                    }
                } else if (this.T) {
                    int action4 = motionEvent.getAction();
                    if (action4 == 1) {
                        this.T = false;
                        if (this.d1 && !this.c1 && (pVar = this.h1) != null) {
                            int height2 = ((StaticLayout) pVar.f).getHeight() - this.e1;
                            this.c1 = true;
                            t0 t0Var2 = this.U0;
                            if (t0Var2 == null) {
                                return true;
                            }
                            t0Var2.b0(this);
                            if (!(getParent() instanceof rl0)) {
                                return true;
                            }
                            ((rl0) getParent()).v0(0, AndroidUtilities.dp(16.0f) + height2, null);
                            return true;
                        }
                        int i15 = messageObject3.type;
                        if (i15 == 31) {
                            S();
                        } else if (i15 == 25) {
                            if (this.U0 != null) {
                                AndroidUtilities.runOnUIThread(new ia(4, this, (TLRPC.TL_messageActionGiftCode) this.E0.messageOwner.action));
                            }
                        } else if (i15 == 18) {
                            R();
                        } else if (i15 == 30) {
                            S();
                        } else if (this.U0 != null) {
                            if (i15 != 21 || (x40Var = MessagesController.getInstance(i13).photoSuggestion.get(messageObject3.messageOwner.local_id)) == null) {
                                this.U0.o0(this);
                                playSoundEffect(0);
                            } else {
                                x40Var.c();
                            }
                        }
                    } else if (action4 != 2) {
                        if (action4 == 3) {
                            this.T = false;
                        }
                    } else if (N()) {
                        if (!this.B1.contains(x10, y10)) {
                            this.T = false;
                        }
                    } else if (!imageReceiver.isInsideImage(x10, y10)) {
                        this.T = false;
                    }
                }
                z4 = false;
            }
        }
        if (!z4 && (motionEvent.getAction() == 0 || ((this.x != null || this.y != null) && motionEvent.getAction() == 1))) {
            eg.p pVar5 = this.h1;
            if (pVar5 != null && (arrayList = pVar5.e) != null && !arrayList.isEmpty() && !this.D) {
                ArrayList arrayList2 = this.h1.e;
                int size = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i16);
                    i16++;
                    ih.k kVar = (ih.k) obj;
                    Rect bounds = kVar.getBounds();
                    eg.p pVar6 = this.h1;
                    if (bounds.contains((int) (x10 - pVar6.a), (int) (y10 - pVar6.b))) {
                        this.x = null;
                        if (motionEvent.getAction() == 0) {
                            this.y = kVar;
                        } else {
                            ih.k kVar2 = this.y;
                            if (kVar == kVar2) {
                                this.D = true;
                                kVar2.q = new s0(this, 2);
                                float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.h1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.h1.f).getWidth(), 2.0d));
                                ih.k kVar3 = this.y;
                                eg.p pVar7 = this.h1;
                                kVar3.j((int) (x10 - pVar7.a), (int) (y10 - pVar7.b), sqrt, false);
                                invalidate();
                            }
                        }
                        z4 = true;
                    }
                }
            }
            if (!z4 && (staticLayout = this.J) != null) {
                if (x10 >= this.O) {
                    float f12 = this.P;
                    if (y10 >= f12 && x10 <= r7 + this.K && y10 <= r8 + this.L) {
                        float f13 = y10 - f12;
                        float f14 = x10 - this.Q;
                        if (!z4) {
                            int lineForVertical = staticLayout.getLineForVertical((int) f13);
                            int offsetForHorizontal = this.J.getOffsetForHorizontal(lineForVertical, f14);
                            float lineLeft = this.J.getLineLeft(lineForVertical);
                            if (lineLeft <= f14 && this.J.getLineWidth(lineForVertical) + lineLeft >= f14) {
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
                                                Q(uRLSpan2);
                                            }
                                        }
                                        z4 = true;
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
        if (!z4) {
            ArrayList arrayList3 = this.M1;
            if (!arrayList3.isEmpty()) {
                int x11 = (int) motionEvent.getX();
                int y11 = (int) motionEvent.getY();
                float width = (getWidth() - this.X0) / 2.0f;
                float dp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.P + this.L + this.f;
                float dp2 = (this.X0 - AndroidUtilities.dp(4.0f)) / 2.0f;
                int action5 = motionEvent.getAction();
                org.telegram.ui.ActionBar.f6 f6Var = this.V0;
                if (action5 == 0) {
                    this.Z1 = -1;
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        e0 e0Var = (e0) arrayList3.get(i17);
                        float dp3 = ((AndroidUtilities.dp(4.0f) + dp2) * i17) + width;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(dp3, dp, dp3 + dp2, e0Var.f + dp);
                        float f15 = x11;
                        float f16 = y11;
                        if (rectF4.contains(f15, f16)) {
                            this.Z1 = i17;
                            J();
                            if (e0Var.s == null) {
                                z Y = org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nc, f6Var), 6, 6);
                                e0Var.s = Y;
                                Y.setCallback(this);
                            }
                            e0Var.s.setHotspot(f15, f16);
                            e0Var.s.setState(this.Y1);
                            e0Var.b(!e0Var.m);
                            z11 = true;
                            z4 = z11;
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.Z1 != -1) {
                        playSoundEffect(0);
                        e0 e0Var2 = (e0) arrayList3.get(this.Z1);
                        z zVar = e0Var2.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (this.U0 != null && !e0Var2.m && (buttonCustom = e0Var2.j) != null && getMessageObject() != null) {
                            int i18 = buttonCustom.id;
                            if (i18 == 5) {
                                t0 t0Var3 = this.U0;
                                org.telegram.ui.ActionBar.p2 T0 = t0Var3 != null ? t0Var3.T0() : null;
                                if (T0 != null && this.E0 != null) {
                                    org.telegram.ui.Components.z4.v0(T0, LocaleController.getString(R.string.GiftOfferRejectConfirmTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferRejectConfirmText, DialogObject.getShortName(this.E0.getDialogId()))), LocaleController.getString(R.string.GiftOfferRejectConfirmConfirm), true, new ia(2, this, T0));
                                }
                            } else if (i18 == 6) {
                                MessageObject messageObject5 = this.E0;
                                if (messageObject5 != null && (message4 = messageObject5.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction2 = message4.action;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                                        Context context = getContext();
                                        long dialogId = this.E0.getDialogId();
                                        int id2 = this.E0.getId();
                                        int[] iArr = lh.n0.t0;
                                        lf.a m9 = lf.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                        lf.b bVar2 = m9.a;
                                        lf.a i19 = lf.a.i((m9.b * (bVar2 == bVar ? MessagesController.getInstance(i13).config.starsStarGiftResaleCommissionPermille.get() : MessagesController.getInstance(i13).config.tonStarGiftResaleCommissionPermille.get())) / 1000, bVar2);
                                        TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(starGift.title);
                                        sb.append(" #");
                                        String l10 = kf.k0.l(starGift.num, ',', sb);
                                        if (dialogId >= 0) {
                                            j10 = 0;
                                            chat = MessagesController.getInstance(i13).getUser(Long.valueOf(dialogId));
                                        } else {
                                            j10 = 0;
                                            chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialogId));
                                        }
                                        String d = m9.d();
                                        String d10 = i19.d();
                                        boolean z16 = bVar2 == lf.b.b;
                                        LinearLayout f17 = org.telegram.messenger.y3.f(context, 1);
                                        f17.addView(new lh.h4(context, starGift, chat), k7.b6.t(-1, -2, 48, 0, -4, 0, 0));
                                        TextView textView = new TextView(context);
                                        org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 16.0f);
                                        textView.setText(AndroidUtilities.replaceTags(bVar2 == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellStars, d, DialogObject.getShortName(dialogId), l10, d10) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellTON, d, DialogObject.getShortName(dialogId), l10, d10)));
                                        f17.addView(textView, k7.b6.t(-1, -2, 48, 24, 4, 24, 4));
                                        FrameLayout frameLayout = new FrameLayout(context);
                                        frameLayout.setClipChildren(false);
                                        frameLayout.setClipToPadding(false);
                                        sz0 sz0Var = new sz0(context, f6Var);
                                        frameLayout.addView(sz0Var, k7.b6.e(-1, -1, 119));
                                        lh.g5.q1(sz0Var, lh.t7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                        lh.g5.q1(sz0Var, lh.t7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        lh.g5.q1(sz0Var, lh.t7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                        f17.addView(frameLayout, k7.b6.t(-1, -2, 48, 23, 16, 23, 4));
                                        lf.a j11 = lf.a.j(starGift.value_usd_amount / Math.pow(10.0d, BillingController.getInstance().getCurrencyExp("USD")), bVar2);
                                        if (j11.c() > 0.0d && starGift.value_usd_amount > j10) {
                                            if (j11.b >= i19.b) {
                                                int round = (int) Math.round((1.0d - (i19.c() / j11.c())) * 100.0d);
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountLowerHint2, android.support.v4.media.a.l(round, "%"), starGift.title));
                                                z10 = round > 10;
                                                i11 = 1;
                                            } else {
                                                i11 = 1;
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, android.support.v4.media.a.l((int) Math.round(((i19.c() / j11.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                z10 = false;
                                            }
                                            TextView textView2 = new TextView(context);
                                            textView2.setTextSize(i11, 13.0f);
                                            textView2.setGravity(17);
                                            textView2.setText(replaceTags);
                                            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(z10 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.y6, f6Var));
                                            f17.addView(textView2, k7.b6.t(-1, -2, 49, 40, 12, 40, 9));
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                                        alertDialog$Builder.n(f17);
                                        alertDialog$Builder.k(lh.ja.S0(LocaleController.formatString(R.string.GiftOfferSellFor, d10), z16), new lh.g0(id2, i13, R));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder.a.show();
                                    }
                                }
                            } else if (i18 == 7) {
                                t0 t0Var4 = this.U0;
                                org.telegram.ui.ActionBar.p2 T02 = t0Var4 != null ? t0Var4.T0() : null;
                                if (T02 != null && (messageObject2 = this.E0) != null && (message3 = messageObject2.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction3 = message3.action;
                                    if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                        final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                        final int i20 = 0;
                                        org.telegram.ui.Components.z4.v0(T02, LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelText : R.string.SharingOfferEnableCancelText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) { // from class: org.telegram.ui.Cells.p0
                                            public final /* synthetic */ v0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        v0 v0Var = this.b;
                                                        MessagesController.getInstance(v0Var.E).toggleChatNoForwards(v0Var.E0.getDialogId(), v0Var.E0.getId(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                        break;
                                                    default:
                                                        v0 v0Var2 = this.b;
                                                        MessagesController.getInstance(v0Var2.E).toggleChatNoForwards(v0Var2.E0.getDialogId(), v0Var2.E0.getId(), tL_messageActionNoForwardsRequest.new_value, null);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            } else if (i18 == 8) {
                                t0 t0Var5 = this.U0;
                                org.telegram.ui.ActionBar.p2 T03 = t0Var5 != null ? t0Var5.T0() : null;
                                if (T03 != null && (messageObject = this.E0) != null && (message2 = messageObject.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction4 = message2.action;
                                    if (messageAction4 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                        final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction4;
                                        final int i21 = 1;
                                        org.telegram.ui.Components.z4.v0(T03, LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableConfirmText : R.string.SharingOfferEnableConfirmText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) { // from class: org.telegram.ui.Cells.p0
                                            public final /* synthetic */ v0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i21) {
                                                    case 0:
                                                        v0 v0Var = this.b;
                                                        MessagesController.getInstance(v0Var.E).toggleChatNoForwards(v0Var.E0.getDialogId(), v0Var.E0.getId(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                        break;
                                                    default:
                                                        v0 v0Var2 = this.b;
                                                        MessagesController.getInstance(v0Var2.E).toggleChatNoForwards(v0Var2.E0.getDialogId(), v0Var2.E0.getId(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                        this.Z1 = -1;
                        J();
                    }
                } else if (motionEvent.getAction() == 3 && (i10 = this.Z1) != -1) {
                    e0 e0Var3 = (e0) arrayList3.get(i10);
                    z zVar2 = e0Var3.s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var3.b(false);
                    this.Z1 = -1;
                    J();
                }
            }
            z11 = false;
            z4 = z11;
        }
        return !z4 ? super.onTouchEvent(motionEvent) : z4;
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
        boolean z4;
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
        int i10;
        int i11;
        char c3;
        Object valueOf;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i12;
        TLRPC.Chat chat;
        TLRPC.User user;
        CharSequence replaceCharSequence;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.E0;
        int i13 = this.E;
        if (messageObject != null) {
            if (messageObject.isExpiredStory()) {
                charSequence = messageObject.messageOwner.media.user_id != UserConfig.getInstance(i13).getClientUserId() ? nh.m7.e(R.string.ExpiredStoryMention, true, new Object[0]) : nh.m7.e(R.string.ExpiredStoryMentioned, true, MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.getDialogId())).first_name);
            } else {
                t0 t0Var = this.U0;
                if (t0Var != null && t0Var.d() == 0 && MessageObject.isTopicActionMessage(messageObject)) {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i13).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(i13, messageObject.messageOwner, true));
                    int i14 = ag.f.a;
                    if (findTopic != null) {
                        TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), ag.f.j(findTopic, null, null));
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
                            int i15 = tL_messageActionTopicEdit.flags;
                            if ((i15 & 8) != 0) {
                                charSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(tL_messageActionTopicEdit.hidden ? R.string.TopicHidden2 : R.string.TopicShown2), formatName);
                            } else {
                                j10 = 0;
                                if ((i15 & 4) != 0) {
                                    replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(tL_messageActionTopicEdit.closed ? R.string.TopicWasClosedAction : R.string.TopicWasReopenedAction), ag.f.j(findTopic, null, null)), formatName);
                                } else {
                                    int i16 = i15 & 1;
                                    if (i16 != 0 && (i15 & 2) != 0) {
                                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                        tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                        tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                        replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction2), ag.f.j(tL_forumTopic, null, null)), formatName);
                                    } else if (i16 != 0) {
                                        replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction), tL_messageActionTopicEdit.title), formatName);
                                    } else {
                                        if ((i15 & 2) != 0) {
                                            TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                            tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                            tL_forumTopic2.title = "";
                                            replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasIconChangedToAction), ag.f.j(tL_forumTopic2, null, null)), formatName);
                                        }
                                        charSequence = null;
                                        if (charSequence == null) {
                                            TLRPC.Message message2 = messageObject.messageOwner;
                                            if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                                                charSequence = org.telegram.ui.Components.u5.cloneSpans(messageObject.messageText);
                                            } else if (messageMedia.photo != null) {
                                                charSequence = LocaleController.getString(R.string.AttachPhotoExpired);
                                            } else {
                                                TLRPC.Document document = messageMedia.document;
                                                charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? LocaleController.getString(R.string.AttachVoiceExpired) : messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachVideoExpired) : org.telegram.ui.Components.u5.cloneSpans(messageObject.messageText);
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
            charSequence = this.G0;
        }
        MessageObject messageObject2 = this.E0;
        if (messageObject2 != null && messageObject2.isRepostPreview) {
            charSequence = "";
        }
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageAction = message.action) != null) {
            if (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                i12 = R.drawable.mini_checklist_add;
            } else if (messageAction instanceof TLRPC.TL_messageActionTodoCompletions) {
                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction;
                i12 = tL_messageActionTodoCompletions.incompleted.size() > tL_messageActionTodoCompletions.completed.size() ? R.drawable.mini_checklist_undone : R.drawable.mini_checklist_done;
            } else {
                i12 = 0;
            }
            if (i12 != 0) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence);
                spannableStringBuilder2.insert(0, (CharSequence) "i ");
                spannableStringBuilder2.setSpan(new lq(i12, 0), 0, 1, 33);
                charSequence = spannableStringBuilder2;
            }
        }
        w(this.S, charSequence);
        if (this.D0 != null) {
            this.J = null;
            this.L = 0;
            this.M = null;
            this.N = 0;
            this.P = 0;
        }
        if (messageObject != null) {
            TLRPC.Message message3 = messageObject.messageOwner;
            if (message3 != null) {
                TLRPC.MessageAction messageAction3 = message3.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).balance_too_low) {
                    v(null, null, charSequence, false, !ChatObject.canManageMonoForum(i13, messageObject.getDialogId()) ? LocaleController.getString(R.string.StarsBuy) : null, 11, null, this.X0, false);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                }
            }
            CharSequence charSequence6 = charSequence;
            if (message3 != null) {
                TLRPC.MessageAction messageAction4 = message3.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction4).rejected) {
                    v(null, null, charSequence6, false, null, 11, null, this.X0, false);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                }
            }
            int i17 = messageObject.type;
            if (i17 == 11) {
                float dp = AndroidUtilities.dp(19.0f) + this.L;
                float f10 = AndroidUtilities.roundMessageSize;
                this.F.setImageCoords((this.S - AndroidUtilities.roundMessageSize) / 2.0f, dp, f10, f10);
            } else if (i17 == 25) {
                u();
            } else {
                TextPaint textPaint = this.u1;
                if (i17 == 30) {
                    TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(this.E0.getDialogId()));
                    TLRPC.MessageAction messageAction5 = messageObject.messageOwner.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionGiftStars) {
                        v(LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction5).stars), null, AndroidUtilities.replaceTags(this.E0.isOutOwner() ? LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user2)) : LocaleController.getString(R.string.ActionGiftStarsSubtitleYou)), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.X0, true);
                    } else if ((messageAction5 instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction5).refunded) {
                        long clientUserId = UserConfig.getInstance(i13).getClientUserId();
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action;
                        if (messageObject.isOutOwner() != (!tL_messageActionStarGiftUnique.upgrade)) {
                            clientUserId = messageObject.getDialogId();
                        }
                        TLRPC.User user3 = MessagesController.getInstance(i13).getUser(Long.valueOf(clientUserId));
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                        spannableStringBuilder3.append((CharSequence) LocaleController.getString(tL_messageActionStarGiftUnique.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                        if (user3 != null && user3.photo != null) {
                            spannableStringBuilder3.append((CharSequence) "a ");
                            org.telegram.ui.k5 k5Var = new org.telegram.ui.k5(this, 18.0f, i13);
                            k5Var.e(user3);
                            spannableStringBuilder3.setSpan(k5Var, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                        }
                        spannableStringBuilder3.append((CharSequence) UserObject.getForcedFirstName(user3));
                        v(spannableStringBuilder3, null, LocaleController.getString(R.string.Gift2ActionUpgradeRefundedText), false, LocaleController.getString(R.string.ActionGiftStarsView), 12, LocaleController.getString(R.string.Gift2UniqueRibbon), this.X0, true);
                    } else if (messageAction5 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction5;
                        long j11 = tL_messageActionStarGift.convert_stars;
                        long clientUserId2 = UserConfig.getInstance(i13).getClientUserId();
                        TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                        boolean z10 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                        boolean z11 = messageObject.getDialogId() == clientUserId2 && !z10;
                        long fromChatId2 = messageObject.getFromChatId();
                        if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                            fromChatId2 = DialogObject.getPeerDialogId(peer);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        TLObject userOrChat = MessagesController.getInstance(i13).getUserOrChat(fromChatId2);
                        long peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                        boolean z12 = z10;
                        TLObject userOrChat2 = MessagesController.getInstance(i13).getUserOrChat(peerDialogId);
                        boolean z13 = tL_messageActionStarGift.can_upgrade && !tL_messageActionStarGift.converted && tL_messageActionStarGift.upgrade_stars > j10 && !tL_messageActionStarGift.upgraded;
                        if (peerDialogId != j10 && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTitleTo)).append((CharSequence) " ");
                            if (DialogObject.hasPhoto(userOrChat2)) {
                                spannableStringBuilder4.append((CharSequence) "a ");
                                org.telegram.ui.k5 k5Var2 = new org.telegram.ui.k5(this, 18.0f, i13);
                                int i18 = k5Var2.e;
                                org.telegram.ui.Components.z8 z8Var = k5Var2.c;
                                z8Var.j(i18, userOrChat2);
                                k5Var2.b.setForUserOrChat(userOrChat2, z8Var);
                                spannableStringBuilder4.setSpan(k5Var2, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                            }
                            spannableStringBuilder4.append((CharSequence) DialogObject.getShortName(userOrChat2));
                        } else if (!z11) {
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(tL_messageActionStarGift.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                            if (DialogObject.hasPhoto(userOrChat)) {
                                spannableStringBuilder4.append((CharSequence) "a ");
                                org.telegram.ui.k5 k5Var3 = new org.telegram.ui.k5(this, 18.0f, i13);
                                int i19 = k5Var3.e;
                                org.telegram.ui.Components.z8 z8Var2 = k5Var3.c;
                                z8Var2.j(i19, userOrChat);
                                k5Var3.b.setForUserOrChat(userOrChat, z8Var2);
                                spannableStringBuilder4.setSpan(k5Var3, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                            }
                            spannableStringBuilder4.append((CharSequence) DialogObject.getShortName(userOrChat));
                        } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                        } else {
                            spannableStringBuilder4.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) LocaleController.formatNumber(tL_messageActionStarGift.gift_num, ','));
                        }
                        boolean z14 = ((messageObject.isOutOwner() && !z11) || !tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j10 && MessagesController.getInstance(i13).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(i13).getCurrentTime() - messageObject.messageOwner.date) > 0 && !tL_messageActionStarGift.refunded;
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
                            } else if (z12) {
                                replaceTags = tL_messageActionStarGift.converted ? LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11) : (!z14 || j11 <= j10) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert)) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfoChannel", (int) j11));
                            } else if (z11) {
                                replaceTags = (!tL_messageActionStarGift.converted || j11 <= j10) ? tL_messageActionStarGift.can_upgrade ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert)) : LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11);
                            } else if (z13) {
                                replaceTags = AndroidUtilities.replaceTags(messageObject.isOutOwner() ? LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user2)) : LocaleController.getString(R.string.Gift2ActionUpgrade));
                            } else {
                                replaceTags = messageObject.isOutOwner() ? (!z14 || j11 <= j10) ? tL_messageActionStarGift.can_upgrade ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j11, UserObject.getForcedFirstName(user2))) : tL_messageActionStarGift.converted ? LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j11) : tL_messageActionStarGift.saved ? !z14 ? LocaleController.getString(R.string.Gift2ActionBotSavedInfo) : LocaleController.getString(R.string.Gift2ActionSavedInfo) : !z14 ? LocaleController.getString(R.string.Gift2ActionBotInfo) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j11));
                            }
                        }
                        TL_stars.StarGift starGift2 = tL_messageActionStarGift.gift;
                        if (starGift2 == null || !starGift2.limited) {
                            str2 = null;
                        } else {
                            int i20 = R.string.Gift2Limited1OfRibbon;
                            int i21 = starGift2.availability_total;
                            if (i21 > 1500) {
                                c3 = 0;
                                valueOf = AndroidUtilities.formatWholeNumber(i21, 0);
                            } else {
                                c3 = 0;
                                valueOf = Integer.valueOf(i21);
                            }
                            Object[] objArr = new Object[1];
                            objArr[c3] = valueOf;
                            str2 = LocaleController.formatString(i20, objArr);
                        }
                        CharSequence string2 = LocaleController.getString(R.string.ActionGiftStarsView);
                        if (messageObject.isOutOwner()) {
                            charSequence5 = string2;
                            if (!tL_messageActionStarGift.forceIn) {
                            }
                        }
                        charSequence5 = string2;
                        charSequence5 = string2;
                        if (!messageObject.isOutOwner() && z13) {
                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                            spannableStringBuilder6.append("^  ");
                            lq lqVar = new lq(R.drawable.gift_unpack, 0);
                            lqVar.setScale(0.8f, 0.8f);
                            spannableStringBuilder6.setSpan(lqVar, 0, 1, 33);
                            spannableStringBuilder6.append(LocaleController.getString(R.string.Gift2Unpack));
                            charSequence5 = spannableStringBuilder6;
                        }
                        TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                        if (starGift3 == null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i13).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                            spannableStringBuilder = null;
                        } else {
                            String formatString2 = LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@".concat(publicUsername));
                            int i22 = lh.g5.n1;
                            int indexOf = formatString2.indexOf("**");
                            int indexOf2 = formatString2.indexOf("**", indexOf + 1);
                            String replace = formatString2.replace("**", "");
                            if (indexOf < 0 || indexOf2 < 0 || (i11 = indexOf2 - indexOf) <= 2) {
                                indexOf = -1;
                                i10 = 0;
                            } else {
                                i10 = i11 - 2;
                            }
                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(replace);
                            if (indexOf >= 0) {
                                spannableStringBuilder7.setSpan(new lh.l3(0), indexOf, i10 + indexOf, 0);
                            }
                            spannableStringBuilder = spannableStringBuilder7;
                        }
                        v(spannableStringBuilder4, spannableStringBuilder, replaceTags, false, charSequence5, 11, str2, this.X0, true);
                    } else if (messageAction5 instanceof TLRPC.TL_messageActionGiftTon) {
                        v(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.E0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.X0, true);
                        this.J = null;
                        this.L = 0;
                        this.M = null;
                        this.N = 0;
                        this.P = 0;
                    } else {
                        v(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.E0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.X0, true);
                        this.J = null;
                        this.L = 0;
                        this.M = null;
                        this.N = 0;
                        this.P = 0;
                    }
                } else if (i17 == 33) {
                    TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) message3.action;
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder(charSequence6);
                    spannableStringBuilder8.append((CharSequence) "\n\n");
                    if (tL_messageActionStarGiftPurchaseOffer.accepted) {
                        spannableStringBuilder8.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusAccepted)));
                    } else if (tL_messageActionStarGiftPurchaseOffer.declined) {
                        spannableStringBuilder8.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusRejected)));
                    } else {
                        int max = Math.max(0, tL_messageActionStarGiftPurchaseOffer.expires_at - ConnectionsManager.getInstance(i13).getCurrentTime());
                        if (max == 0) {
                            spannableStringBuilder8.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftOfferStatusExpired)));
                        } else {
                            String formatShortDuration2 = LocaleController.formatShortDuration2(max);
                            if (formatShortDuration2.endsWith(".")) {
                                formatShortDuration2 = e2.c.j(formatShortDuration2, 1, 0);
                            }
                            spannableStringBuilder8.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, formatShortDuration2)));
                        }
                    }
                    v(null, null, spannableStringBuilder8, false, null, 11, null, this.X0, false);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                } else if (i17 == 34) {
                    v(null, null, charSequence6, false, null, 11, null, this.X0, false);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                } else if (i17 == 35) {
                    TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) message3.action;
                    SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
                    String shortName = DialogObject.getShortName(MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.getDialogId())));
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
                    v(null, null, spannableStringBuilder9, false, null, 11, null, this.X0, false);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                } else if (i17 == 31) {
                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                    StringBuilder sb = new StringBuilder();
                    sb.append(starGift4.title);
                    sb.append(" #");
                    String l10 = kf.k0.l(starGift4.num, ',', sb);
                    long fromChatId3 = messageObject.getFromChatId();
                    v(null, null, AndroidUtilities.replaceTags(UserConfig.getInstance(i13).getClientUserId() == fromChatId3 ? LocaleController.formatString(R.string.GiftThemesSetByYou, l10) : LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i13, fromChatId3), l10)), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.X0, true);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                } else if (i17 == 37) {
                    TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                    long peerDialogId2 = DialogObject.getPeerDialogId(message3.peer_id);
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(-peerDialogId2, i13);
                    boolean z15 = peerDialogId2 > j10;
                    String shortName2 = DialogObject.getShortName(i13, DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                    String shortName3 = DialogObject.getShortName(i13, -tL_messageActionChangeCommunity.community_id);
                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder();
                    spannableStringBuilder10.append((CharSequence) sh.o0.a(messageObject, shortName3, shortName2, isChannelAndNotMegaGroup, z15));
                    v(null, null, spannableStringBuilder10, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.X0, true);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                } else if (i17 == 18) {
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
                    MessageObject messageObject3 = this.E0;
                    v(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, charSequence7, true, LocaleController.getString((messageObject3 == null || !(messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionGiftCode) || O()) ? R.string.ActionGiftPremiumView : R.string.GiftPremiumUseGiftBtn), 11, null, this.X0, false);
                } else if (i17 == 21) {
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                    TLRPC.User user4 = MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.isOutOwner() ? j10 : messageObject.getDialogId()));
                    boolean z16 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                    if (user4.id == UserConfig.getInstance(i13).clientUserId) {
                        TLRPC.User user5 = MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.getDialogId()));
                        formatString = z16 ? LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user5.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user5.first_name);
                    } else {
                        formatString = z16 ? LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user4.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user4.first_name);
                    }
                    v(null, null, formatString, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? LocaleController.getString(R.string.ViewVideoAction) : LocaleController.getString(R.string.ViewPhotoAction), 11, null, this.X0, true);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                } else if (i17 == 22) {
                    TLRPC.User user6 = MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.isOutOwner() ? j10 : messageObject.getDialogId()));
                    if (messageObject.getDialogId() < j10) {
                        charSequence3 = messageObject.messageText;
                    } else if (!messageObject.isOutOwner() && messageObject.isWallpaperForBoth() && messageObject.isCurrentWallpaper()) {
                        charSequence2 = messageObject.messageText;
                        string = LocaleController.getString(R.string.RemoveWallpaperAction);
                        z4 = false;
                        v(null, null, charSequence2, false, string, 11, null, this.X0, z4);
                        this.J = null;
                        this.L = 0;
                        this.M = null;
                        this.N = 0;
                        this.P = 0;
                    } else if (user6 == null || user6.id != UserConfig.getInstance(i13).clientUserId) {
                        charSequence2 = messageObject.messageText;
                        string = LocaleController.getString(R.string.ViewWallpaperAction);
                        z4 = true;
                        v(null, null, charSequence2, false, string, 11, null, this.X0, z4);
                        this.J = null;
                        this.L = 0;
                        this.M = null;
                        this.N = 0;
                        this.P = 0;
                    } else {
                        charSequence3 = messageObject.messageText;
                    }
                    charSequence2 = charSequence3;
                    string = null;
                    z4 = true;
                    v(null, null, charSequence2, false, string, 11, null, this.X0, z4);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                } else if (messageObject.isStoryMention()) {
                    TLRPC.User user7 = MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                    v(null, null, user7.self ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.getDialogId())).first_name)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user7.first_name)), false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.X0, true);
                    this.J = null;
                    this.L = 0;
                    this.M = null;
                    this.N = 0;
                    this.P = 0;
                }
            }
        }
        int dp2 = AndroidUtilities.dp(12.0f);
        mg.r0 r0Var = this.z0;
        r0Var.c = dp2;
        r0Var.p(this.S - AndroidUtilities.dp(24.0f), 1);
    }

    public final void s() {
        float f10 = this.P0;
        RectF rectF = this.R0;
        this.P0 = (int) Math.min(f10, rectF.left);
        this.Q0 = (int) Math.max(this.Q0, rectF.right);
    }

    public void setCustomText(CharSequence charSequence) {
        this.G0 = charSequence;
        if (charSequence != null) {
            X(false);
        }
    }

    public void setDelegate(t0 t0Var) {
        this.U0 = t0Var;
    }

    public void setInvalidateColors(boolean z4) {
        if (this.T0 == z4) {
            return;
        }
        this.T0 = z4;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.c2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z4) {
        this.b2 = z4;
    }

    public void setMessageObject(MessageObject messageObject) {
        U(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.S1 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.T1 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.z0.C = num;
    }

    public void setShowTopic(boolean z4) {
        if (this.j0 != z4) {
            this.j0 = z4;
            J();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z4) {
        ArrayList arrayList = this.m0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ih.k) obj).invalidateSelf();
        }
    }

    public final boolean t(float f10, int i10) {
        mg.r0 r0Var = this.z0;
        if (!r0Var.K) {
            return false;
        }
        float y10 = getY() + r0Var.d;
        return y10 > f10 && (y10 + ((float) r0Var.o)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i10);
    }

    public final void u() {
        SpannableStringBuilder spannableStringBuilder;
        int dp = this.X0 - AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(14.0f);
        TextPaint textPaint = this.t1;
        textPaint.setTextSize(dp2);
        float dp3 = AndroidUtilities.dp(13.0f);
        TextPaint textPaint2 = this.u1;
        textPaint2.setTextSize(dp3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.E0.messageOwner.action;
        int i10 = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.E).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        String str = chat == null ? null : chat.title;
        boolean z4 = tL_messageActionGiftCode.via_giveaway;
        String string = tL_messageActionGiftCode.unclaimed ? LocaleController.getString("BoostingUnclaimedPrize", R.string.BoostingUnclaimedPrize) : LocaleController.getString("BoostingCongratulations", R.string.BoostingCongratulations);
        String formatPluralString = i10 == 12 ? LocaleController.formatPluralString("BoldYears", 1, new Object[0]) : LocaleController.formatPluralString("BoldMonths", i10, new Object[0]);
        if (!z4) {
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
        valueOf.setSpan(new f51(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.Y0 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.b1 = null;
        this.a1 = null;
        eg.p pVar = this.h1;
        if (pVar != null) {
            org.telegram.ui.Components.u5.release((v0) pVar.i, (org.telegram.ui.Components.q5) pVar.h);
        }
        eg.p pVar2 = new eg.p(this);
        this.h1 = pVar2;
        pVar2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new f51(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.d1 = false;
        this.e1 = 0;
        this.l1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.m1 = staticLayout;
        this.n1 = true;
        this.s1 = P(staticLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z4, CharSequence charSequence3, int i10, String str, int i11, boolean z10) {
        ?? r42;
        int i12;
        CharSequence charSequence4;
        int a2;
        CharSequence charSequence5 = charSequence2;
        int dp = i11 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.E0;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        int i13 = dp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.E0;
            TextPaint textPaint = this.t1;
            if (messageObject2 == null || messageObject2.type != 30) {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new f51(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.Y0 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.Y0 = null;
        }
        this.b1 = null;
        if (spannableStringBuilder != null) {
            k01 k01Var = new k01(spannableStringBuilder, 10.0f, null);
            this.a1 = k01Var;
            k01Var.a.linkColor = -1;
        } else {
            this.a1 = null;
        }
        MessageObject messageObject3 = this.E0;
        TextPaint textPaint2 = this.u1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 == null || !(N() || (i12 = this.E0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }
        int dp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.E0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = ph.f3.a(charSequence5, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        if (charSequence5 == null) {
            eg.p pVar = this.h1;
            if (pVar != null) {
                org.telegram.ui.Components.u5.release((v0) pVar.i, (org.telegram.ui.Components.q5) pVar.h);
                this.h1 = null;
            }
            this.d1 = r42;
        } else {
            if (this.h1 == null) {
                this.h1 = new eg.p(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence5, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
                charSequence4 = charSequence5;
            }
            this.h1.a(charSequence4, textPaint2, dp2);
            if (!z4 || ((StaticLayout) this.h1.f).getLineCount() <= 3) {
                this.d1 = r42;
                this.f1.f(true, true);
                this.e1 = r42;
            } else {
                this.d1 = !this.c1;
                this.e1 = ((StaticLayout) this.h1.f).getLineBottom(2);
                this.l1 = new k01(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.h1.f).getLineBottom(2);
                this.j1 = lineBottom;
                this.k1 = lineBottom - ((StaticLayout) this.h1.f).getLineTop(2);
                this.i1 = (int) ((StaticLayout) this.h1.f).getLineRight(2);
            }
            if (this.d1) {
                int lineEnd = ((StaticLayout) this.h1.f).getLineEnd(2) - 1;
                eg.p pVar2 = this.h1;
                CharSequence charSequence6 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence6 = charSequence4.subSequence(r42, lineEnd);
                }
                pVar2.a(charSequence6, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new f51(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) G("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.m1 = staticLayout;
            this.n1 = z10 && !this.d1;
            this.s1 = P(staticLayout);
        } else {
            this.m1 = null;
            this.n1 = r42;
            this.s1 = 0.0f;
        }
        if (str == null) {
            this.G1 = null;
            this.H1 = null;
            return;
        }
        if (this.F1 == null) {
            this.F1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
        }
        if (this.G1 == null) {
            Path path = new Path();
            this.G1 = path;
            kh.a2.c(path, 1.35f, r42);
        }
        k01 k01Var2 = new k01(str, i10, AndroidUtilities.bold());
        this.H1 = k01Var2;
        k01Var2.p = AndroidUtilities.dp(62.0f);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.G || super.verifyDrawable(drawable);
    }

    public final void w(int i10, CharSequence charSequence) {
        CharSequence charSequence2;
        t0 t0Var;
        TLRPC.Message message;
        MessageObject messageObject;
        int i11;
        int dp = i10 - AndroidUtilities.dp(30.0f);
        if (this.f0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (M()) {
            dp = Math.min(dp - AndroidUtilities.dp(this.f0 ? 28.0f : 82.0f), AndroidUtilities.dp(272.0f));
        }
        if (dp < 0) {
            return;
        }
        int i12 = this.T1;
        if (i12 > 0) {
            dp = Math.min(i12, dp);
        }
        int i13 = dp;
        this.S0 = true;
        TextPaint textPaint = (M() || ((messageObject = this.E0) != null && ((i11 = messageObject.type) == 34 || i11 == 35))) ? (TextPaint) G("paintChatActionText3") : (messageObject == null || !messageObject.drawServiceWithDefaultTypeface) ? (TextPaint) G("paintChatActionText") : (TextPaint) G("paintChatActionText2");
        textPaint.linkColor = textPaint.getColor();
        if (M()) {
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
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, i13, M() ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        CharSequence charSequence3 = charSequence2;
        this.J = staticLayout;
        this.M = null;
        MessageObject messageObject2 = this.E0;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.M = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.o0 = org.telegram.ui.Components.u5.update(0, this, (!this.s || (t0Var = this.U0) == null || t0Var.f()) ? false : true, this.o0, this.J);
        this.L = 0;
        this.K = 0;
        this.N = 0;
        StaticLayout staticLayout2 = this.M;
        if (staticLayout2 != null) {
            int height = staticLayout2.getHeight();
            this.N = height;
            this.N = AndroidUtilities.dp(12.0f) + height;
        }
        MessageObject messageObject3 = this.E0;
        if (messageObject3 == null || !messageObject3.isRepostPreview) {
            try {
                int lineCount = this.J.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    try {
                        float lineWidth = this.J.getLineWidth(i14);
                        float f10 = i13;
                        if (lineWidth > f10) {
                            lineWidth = f10;
                        }
                        this.L = (int) Math.max(this.L, Math.ceil(this.J.getLineBottom(i14)));
                        this.K = (int) Math.max(this.K, Math.ceil(lineWidth));
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        this.O = (i10 - this.K) / 2;
        int dp2 = AndroidUtilities.dp(7.0f);
        this.P = dp2;
        if (this.M != null) {
            this.P = org.telegram.messenger.y3.C(11.0f, this.N, dp2);
        }
        this.Q = (i10 - (M() ? this.K : this.J.getWidth())) / 2;
        this.R = (i10 - i13) / 2;
        Stack stack = this.n0;
        ArrayList arrayList = this.m0;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence3 instanceof Spannable) {
            StaticLayout staticLayout3 = this.J;
            int i15 = this.O;
            ih.k.a(this, staticLayout3, i15, i15 + this.K, (Spannable) charSequence3, stack, arrayList, null);
        }
    }

    public final void y(Canvas canvas, boolean z4) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        v0 v0Var;
        Paint paint3;
        Paint paint4;
        int i10;
        int i11;
        Canvas canvas2;
        int i12;
        eg.p pVar;
        RectF rectF;
        ArrayList arrayList;
        int i13;
        float f14;
        int i14;
        Paint paint5;
        int i15;
        float f15;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i16;
        v0 v0Var2 = this;
        if (!v0Var2.s || ((!v0Var2.I() || z4) && (v0Var2.I() || !z4))) {
            Paint G = v0Var2.G("paintChatActionBackground");
            Paint G2 = v0Var2.G("paintChatActionBackgroundDarken");
            v0Var2.p0 = (TextPaint) v0Var2.G("paintChatActionText");
            int i17 = v0Var2.I0;
            org.telegram.ui.ActionBar.f6 f6Var3 = v0Var2.V0;
            if (i17 >= 0) {
                int v02 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var3);
                if (v0Var2.K0 == null) {
                    Paint paint6 = new Paint(1);
                    v0Var2.K0 = paint6;
                    paint6.setColor(v02);
                    TextPaint textPaint = new TextPaint(1);
                    v0Var2.L0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    v0Var2.L0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    v0Var2.L0.setColor(org.telegram.ui.ActionBar.j6.v0(v0Var2.J0, f6Var3));
                }
                G = v0Var2.K0;
                v0Var2.p0 = v0Var2.L0;
            }
            boolean z10 = v0Var2.S0;
            Path path = v0Var2.O0;
            if (z10) {
                v0Var2.S0 = false;
                v0Var2.P0 = v0Var2.getWidth();
                v0Var2.Q0 = 0;
                ArrayList arrayList3 = v0Var2.M0;
                arrayList3.clear();
                StaticLayout staticLayout = v0Var2.J;
                int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
                int dp = AndroidUtilities.dp(11.0f);
                f10 = 6.0f;
                int dp2 = AndroidUtilities.dp(8.0f);
                int i18 = 0;
                f11 = 8.0f;
                int i19 = 0;
                while (i18 < lineCount) {
                    int ceil = (int) Math.ceil(v0Var2.J.getLineWidth(i18));
                    if (i18 != 0 && (i16 = i19 - ceil) > 0 && i16 <= (dp * 1.5f) + dp2) {
                        ceil = i19;
                    }
                    i18 = ai.d(ceil, i18, 1, arrayList3);
                    i19 = ceil;
                }
                f12 = 2.0f;
                f13 = 4.0f;
                for (int i20 = lineCount - 2; i20 >= 0; i20--) {
                    int intValue = ((Integer) arrayList3.get(i20)).intValue();
                    int i21 = i19 - intValue;
                    if (i21 <= 0 || i21 > (dp * 1.5f) + dp2) {
                        i19 = intValue;
                    }
                    arrayList3.set(i20, Integer.valueOf(i19));
                }
                int dp3 = AndroidUtilities.dp(4.0f);
                int measuredWidth = v0Var2.getMeasuredWidth() / 2;
                int dp4 = AndroidUtilities.dp(3.0f);
                int dp5 = AndroidUtilities.dp(6.0f);
                int i22 = dp - dp4;
                ArrayList arrayList4 = v0Var2.N0;
                arrayList4.clear();
                path.reset();
                float f16 = measuredWidth;
                path.moveTo(f16, dp3);
                int i23 = i19;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    rectF = v0Var2.R0;
                    if (i25 >= lineCount) {
                        break;
                    }
                    int i26 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i25)).intValue();
                    int lineBottom = v0Var2.J.getLineBottom(i25);
                    int i27 = i26 - 1;
                    if (i25 < i27) {
                        paint5 = G2;
                        i15 = ((Integer) arrayList3.get(i25 + 1)).intValue();
                    } else {
                        paint5 = G2;
                        i15 = 0;
                    }
                    int i28 = lineBottom - i24;
                    if (i25 == 0 || intValue2 > i23) {
                        i28 = AndroidUtilities.dp(3.0f) + i28;
                    }
                    if (i25 == i27 || intValue2 > i15) {
                        i28 = AndroidUtilities.dp(3.0f) + i28;
                    }
                    Paint paint7 = G;
                    float f17 = (intValue2 / 2.0f) + f16;
                    int i29 = (i25 == i27 || intValue2 >= i15 || i25 == 0 || intValue2 >= i23) ? dp2 : dp5;
                    if (i25 == 0 || intValue2 > i23) {
                        f15 = f17;
                        arrayList2 = arrayList3;
                        f6Var2 = f6Var3;
                        rectF.set((f15 - dp4) - dp, dp3, f15 + i22, (dp * 2) + dp3);
                        s();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f15 = f17;
                        if (intValue2 < i23) {
                            float f18 = f15 + i22;
                            f6Var2 = f6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f18, dp3, (i29 * 2) + f18, r0 + dp3);
                            s();
                            path.arcTo(rectF, -90.0f, -90.0f);
                        } else {
                            arrayList2 = arrayList3;
                            f6Var2 = f6Var3;
                        }
                    }
                    dp3 += i28;
                    if (i25 != i27 && intValue2 < i15) {
                        dp3 -= AndroidUtilities.dp(3.0f);
                        i28 -= AndroidUtilities.dp(3.0f);
                    }
                    if (i25 != 0 && intValue2 < i23) {
                        dp3 -= AndroidUtilities.dp(3.0f);
                        i28 -= AndroidUtilities.dp(3.0f);
                    }
                    arrayList4.add(Integer.valueOf(i28));
                    if (i25 == i27 || intValue2 > i15) {
                        rectF.set((f15 - dp4) - dp, dp3 - (dp * 2), f15 + i22, dp3);
                        s();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    } else if (intValue2 < i15) {
                        float f19 = f15 + i22;
                        rectF.set(f19, dp3 - r0, (i29 * 2) + f19, dp3);
                        s();
                        path.arcTo(rectF, 180.0f, -90.0f);
                    }
                    i25++;
                    v0Var2 = this;
                    i23 = intValue2;
                    i24 = lineBottom;
                    lineCount = i26;
                    G2 = paint5;
                    G = paint7;
                    f6Var3 = f6Var2;
                    arrayList3 = arrayList2;
                }
                paint = G;
                paint2 = G2;
                ArrayList arrayList5 = arrayList3;
                f6Var = f6Var3;
                int i30 = lineCount - 1;
                int i31 = i30;
                while (i31 >= 0) {
                    if (i31 != 0) {
                        arrayList = arrayList5;
                        i13 = ((Integer) arrayList.get(i31 - 1)).intValue();
                    } else {
                        arrayList = arrayList5;
                        i13 = 0;
                    }
                    int intValue3 = ((Integer) arrayList.get(i31)).intValue();
                    int intValue4 = i31 != i30 ? ((Integer) arrayList.get(i31 + 1)).intValue() : 0;
                    this.J.getLineBottom(i31);
                    float f20 = measuredWidth - (intValue3 / 2);
                    int i32 = (i31 == i30 || intValue3 >= intValue4 || i31 == 0 || intValue3 >= i13) ? dp2 : dp5;
                    if (i31 == i30 || intValue3 > intValue4) {
                        arrayList5 = arrayList;
                        f14 = f20;
                        i14 = i32;
                        rectF.set(f14 - i22, dp3 - (dp * 2), f14 + dp4 + dp, dp3);
                        s();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < intValue4) {
                        float f21 = f20 - i22;
                        arrayList5 = arrayList;
                        f14 = f20;
                        i14 = i32;
                        rectF.set(f21 - (i32 * 2), dp3 - r2, f21, dp3);
                        s();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f14 = f20;
                        i14 = i32;
                    }
                    dp3 -= ((Integer) arrayList4.get(i31)).intValue();
                    if (i31 == 0 || intValue3 > i13) {
                        rectF.set(f14 - i22, dp3, f14 + dp4 + dp, (dp * 2) + dp3);
                        s();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    } else if (intValue3 < i13) {
                        float f22 = f14 - i22;
                        rectF.set(f22 - (i14 * 2), dp3, f22, r9 + dp3);
                        s();
                        path.arcTo(rectF, 0.0f, -90.0f);
                    }
                    i31--;
                }
                v0Var = this;
                path.close();
                if (v0Var.M() && !v0Var.N()) {
                    rectF.left = (f16 - (v0Var.K / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp3;
                    rectF.right = (v0Var.K / 2.0f) + f16 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp3 + v0Var.L + v0Var.N;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = G;
                paint2 = G2;
                f6Var = f6Var3;
                f10 = 6.0f;
                f11 = 8.0f;
                f12 = 2.0f;
                f13 = 4.0f;
                v0Var = v0Var2;
            }
            if (!v0Var.t0) {
                v0Var.s0 = ((ViewGroup) v0Var.getParent()).getMeasuredHeight();
            }
            if (f6Var != null) {
                f6Var.l(v0Var.r0, v0Var.q0 + AndroidUtilities.dp(f13), v0Var.getMeasuredWidth(), v0Var.s0);
            } else {
                org.telegram.ui.ActionBar.j6.q(v0Var.r0, v0Var.q0 + AndroidUtilities.dp(f13), v0Var.getMeasuredWidth(), v0Var.s0);
            }
            if (!z4 || (v0Var.getAlpha() == 1.0f && !(v0Var instanceof bk))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z11 = v0Var instanceof bk;
                if (z11) {
                    int alpha = paint4.getAlpha();
                    int alpha2 = paint3.getAlpha();
                    paint4.setAlpha((int) (alpha * (z11 ? 0.75f : 1.0f)));
                    paint3.setAlpha((int) (alpha2 * (z11 ? 0.75f : 1.0f)));
                    i10 = alpha;
                    i11 = alpha2;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
            } else {
                i10 = paint.getAlpha();
                i11 = paint2.getAlpha();
                boolean z12 = v0Var instanceof bk;
                paint4 = paint;
                paint4.setAlpha((int) (v0Var.getAlpha() * i10 * (z12 ? 0.75f : 1.0f)));
                float alpha3 = v0Var.getAlpha() * i11;
                float f23 = z12 ? 0.75f : 1.0f;
                paint3 = paint2;
                paint3.setAlpha((int) (alpha3 * f23));
            }
            MessageObject messageObject = v0Var.E0;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (v0Var.I() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (v0Var.P1 > 0.0f) {
                    Paint paint8 = v0Var.Q1;
                    int alpha4 = paint8.getAlpha();
                    if (z4) {
                        paint8.setAlpha((int) (v0Var.getAlpha() * alpha4));
                    }
                    canvas2.drawPath(path, paint8);
                    paint8.setAlpha(alpha4);
                }
            } else {
                canvas2 = canvas;
            }
            MessageObject messageObject2 = v0Var.E0;
            lh.i5 i5Var = v0Var.C0;
            if (i5Var.d()) {
                float dp6 = i5Var.Q.e + AndroidUtilities.dp(f11);
                float width = (v0Var.getWidth() - dp6) / f12;
                float dp7 = i5Var.p ? 0.0f : AndroidUtilities.dp(12.0f) + v0Var.P + v0Var.L;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(width, dp7, dp6 + width, i5Var.M + dp7 + AndroidUtilities.dp(f11));
                if (v0Var.B1 == null) {
                    v0Var.B1 = new RectF();
                }
                v0Var.B1.set(rectF2);
                canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.I()) {
                    canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.D0 != null) {
                float dp8 = AndroidUtilities.dp(174.0f);
                ky0 ky0Var = v0Var.D0;
                ky0Var.getClass();
                float dp9 = AndroidUtilities.dp(140.0f) + ((int) ky0Var.f.j()) + (ky0Var.i ? AndroidUtilities.dp(40.0f) : 0);
                float width2 = (v0Var.getWidth() - dp8) / f12;
                if (v0Var.B1 == null) {
                    v0Var.B1 = new RectF();
                }
                v0Var.B1.set(width2, AndroidUtilities.dp(f13), dp8 + width2, AndroidUtilities.dp(f13) + dp9);
                canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (v0Var.I()) {
                    canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (v0Var.K(messageObject2)) {
                float width3 = (v0Var.getWidth() - v0Var.X0) / f12;
                float f24 = v0Var.P + v0Var.L;
                if (v0Var.N()) {
                    float dp10 = f24 + AndroidUtilities.dp(f13);
                    AndroidUtilities.rectTmp.set(width3, dp10, v0Var.X0 + width3, v0Var.f + dp10);
                } else {
                    float dp11 = f24 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f25 = v0Var.X0;
                    rectF3.set(width3, dp11, width3 + f25, f25 + dp11 + v0Var.z1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !v0Var.d1 && (pVar = v0Var.h1) != null && v0Var.e1 > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = ai.c(1.0f, v0Var.f1.c, ((StaticLayout) pVar.f).getHeight() - v0Var.e1, rectF4.bottom);
                }
                if (v0Var.B1 == null) {
                    v0Var.B1 = new RectF();
                }
                v0Var.B1.set(AndroidUtilities.rectTmp);
                if (messageObject2 == null || (!((i12 = messageObject2.type) == 33 || i12 == 35) || v0Var.N1 == null)) {
                    canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (v0Var.I()) {
                        canvas2.drawRoundRect(v0Var.B1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                } else {
                    float dp12 = AndroidUtilities.dp(16.0f);
                    float[] fArr = v0Var.V1;
                    Arrays.fill(fArr, dp12);
                    float dp13 = AndroidUtilities.dp(f10);
                    fArr[7] = dp13;
                    fArr[6] = dp13;
                    fArr[5] = dp13;
                    fArr[4] = dp13;
                    Path path2 = v0Var.U1;
                    path2.rewind();
                    path2.addRoundRect(v0Var.B1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (v0Var.I()) {
                        canvas2.drawPath(path2, paint3);
                    }
                }
            }
            if (i10 >= 0) {
                paint4.setAlpha(i10);
                paint3.setAlpha(i11);
            }
        }
    }

    public v0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context);
        this.n = new rc(this);
        int i10 = UserConfig.selectedAccount;
        this.E = i10;
        nh.i7 i7Var = new nh.i7(null, false);
        this.a0 = i7Var;
        this.j0 = true;
        this.l0 = new RectF();
        this.m0 = new ArrayList();
        this.n0 = new Stack();
        this.z0 = new mg.r0(this);
        this.I0 = -1;
        this.J0 = -1;
        this.M0 = new ArrayList();
        this.N0 = new ArrayList();
        this.O0 = new Path();
        this.R0 = new RectF();
        this.S0 = true;
        this.T0 = false;
        this.c1 = false;
        this.d1 = false;
        this.f1 = new org.telegram.ui.Components.z5(this, 0L, 320L, mr.h);
        this.n1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.t1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.u1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.v1 = textPaint3;
        this.y1 = new RadialProgress2(this, null);
        this.C1 = new ga(this, 2);
        this.J1 = new Path();
        this.M1 = new ArrayList();
        this.Q1 = new Paint(1);
        this.U1 = new Path();
        this.V1 = new float[8];
        this.W1 = new float[8];
        this.X1 = new Path();
        this.Y1 = new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed};
        this.f2 = new u0(this);
        i7Var.a = false;
        this.s = z4;
        this.V0 = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.I = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
        this.w = DownloadController.getInstance(i10).generateObserverTag();
        this.C0 = new lh.i5(i10, this, f6Var);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.I1 = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        eg.p2 p2Var = new eg.p2(10);
        this.K1 = p2Var;
        p2Var.N = 100;
        p2Var.J = false;
        p2Var.M = true;
        p2Var.G = false;
        p2Var.K = true;
        p2Var.H = true;
        p2Var.r = 1;
        p2Var.w = 0.98f;
        p2Var.v = 0.98f;
        p2Var.u = 0.98f;
        p2Var.g = false;
        p2Var.o = 0.0f;
        p2Var.x = 750L;
        p2Var.y = 750;
        p2Var.c();
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.b2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.b2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.n4
    public final /* synthetic */ void c(boolean z4, boolean z10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
