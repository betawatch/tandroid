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
import bi.vb;
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
import org.telegram.messenger.vl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.l51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.oz0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.u40;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.dk;
import org.telegram.ui.go;
import org.telegram.ui.l20;
import org.telegram.ui.m11;
import org.telegram.ui.ub;
import org.telegram.ui.um;
import org.telegram.ui.wo;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public class w0 extends a0 implements DownloadController.FileDownloadProgressListener, NotificationCenter.NotificationCenterDelegate, n4 {
    public static final HashMap j2;
    public boolean A0;
    public TLRPC.VideoSize A1;
    public boolean B0;
    public final RadialProgress2 B1;
    public final ah.k1 C0;
    public int C1;
    public float D0;
    public boolean D1;
    public boolean E;
    public float E0;
    public RectF E1;
    public boolean F;
    public final zh.y3 F0;
    public final la F1;
    public boolean G;
    public gy0 G0;
    public boolean G1;
    public final int H;
    public MessageObject H0;
    public ColorMatrixColorFilter H1;
    public final ImageReceiver I;
    public int I0;
    public CornerPathEffect I1;
    public Drawable J;
    public CharSequence J0;
    public Path J1;
    public Path K;
    public yh.e1 K0;
    public f01 K1;
    public final org.telegram.ui.Components.i9 L;
    public int L0;
    public final View L1;
    public StaticLayout M;
    public int M0;
    public final Path M1;
    public int N;
    public Paint N0;
    public final sg.y1 N1;
    public int O;
    public TextPaint O0;
    public int O1;
    public StaticLayout P;
    public final ArrayList P0;
    public final ArrayList P1;
    public int Q;
    public final ArrayList Q0;
    public BotInlineKeyboard.Source Q1;
    public int R;
    public final Path R0;
    public boolean R1;
    public int S;
    public int S0;
    public float S1;
    public int T;
    public int T0;
    public final Paint T1;
    public int U;
    public final RectF U0;
    public boolean U1;
    public int V;
    public boolean V0;
    public View.OnClickListener V1;
    public boolean W;
    public boolean W0;
    public int W1;
    public t0 X0;
    public final Path X1;
    public final org.telegram.ui.ActionBar.f6 Y0;
    public final float[] Y1;
    public int Z0;
    public final float[] Z1;
    public boolean a0;
    public int a1;
    public final Path a2;
    public RadialProgressView b0;
    public StaticLayout b1;
    public final int[] b2;
    public float c0;
    public Paint c1;
    public int c2;
    public final bi.j9 d0;
    public f01 d1;
    public SpannableStringBuilder d2;
    public boolean e0;
    public StaticLayout e1;
    public boolean e2;
    public int f;
    public boolean f0;
    public boolean f1;
    public Runnable f2;
    public boolean g0;
    public boolean g1;
    public PorterDuffColorFilter g2;
    public int h;
    public boolean h0;
    public int h1;
    public int h2;
    public boolean i0;
    public final org.telegram.ui.Components.e6 i1;
    public final v0 i2;
    public int j0;
    public l20 j1;
    public boolean k0;
    public u0 k1;
    public int l0;
    public int l1;
    public boolean m0;
    public int m1;
    public final zc n;
    public a21 n0;
    public int n1;
    public final RectF o0;
    public f01 o1;
    public final ArrayList p0;
    public StaticLayout p1;
    public final Stack q0;
    public boolean q1;
    public h90 r;
    public org.telegram.ui.Components.v5 r0;
    public TextPaint r1;
    public final boolean s;
    public TextPaint s0;
    public StaticLayout s1;
    public float t0;
    public float t1;
    public float u0;
    public StaticLayout u1;
    public View v;
    public int v0;
    public float v1;
    public final int w;
    public boolean w0;
    public final TextPaint w1;
    public URLSpan x;
    public ImageLocation x0;
    public final TextPaint x1;
    public wh.h y;
    public float y0;
    public final TextPaint y1;
    public float z0;
    public TLRPC.Document z1;

    static {
        HashMap hashMap = new HashMap();
        j2 = hashMap;
        i2.g.q(1, hashMap, "1⃣", 3, "2⃣");
        i2.g.q(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public w0(Context context) {
        this(context, null, false);
    }

    public static float P(StaticLayout staticLayout) {
        float f7 = 0.0f;
        for (int i10 = 0; i10 < staticLayout.getLineCount(); i10++) {
            float ceil = (int) Math.ceil(staticLayout.getLineWidth(i10));
            if (ceil > f7) {
                f7 = ceil;
            }
        }
        return f7;
    }

    private void setStarsPaused(boolean z10) {
        sg.y1 y1Var = this.N1;
        if (z10 == y1Var.g) {
            return;
        }
        y1Var.g = z10;
        if (z10) {
            y1Var.Q = System.currentTimeMillis();
            return;
        }
        for (int i10 = 0; i10 < y1Var.n.size(); i10++) {
            sg.x1 x1Var = (sg.x1) y1Var.n.get(i10);
            x1Var.a = (System.currentTimeMillis() - y1Var.Q) + x1Var.a;
        }
        invalidate();
    }

    public static SpannableStringBuilder x(int i10, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceArrows(str, false, AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(1.3f), 0.8f, i10));
        spannableStringBuilder.insert(0, (CharSequence) "*");
        spannableStringBuilder.setSpan(new p2(AndroidUtilities.dp(18.0f)), 0, 1, 33);
        if (Build.VERSION.SDK_INT >= 29) {
            android.support.v4.media.session.y.l();
            spannableStringBuilder.setSpan(android.support.v4.media.session.y.g(AndroidUtilities.dp(12.0f)), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_NORMAL), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void A(Canvas canvas) {
        float f7;
        float f10;
        Canvas canvas2 = canvas;
        canvas2.save();
        float f11 = 2.0f;
        canvas2.translate(this.j0 / 2.0f, getPaddingTop());
        canvas2.save();
        canvas2.translate(this.T, this.S);
        StaticLayout staticLayout = this.M;
        org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas2, staticLayout, this.r0, 0.0f, this.p0, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout != null ? F(staticLayout.getPaint().getColor()) : null);
        canvas2.restore();
        zh.y3 y3Var = this.F0;
        float f12 = 4.0f;
        if (y3Var.d()) {
            canvas2.save();
            canvas2.translate((getWidth() - y3Var.Q.e) / 2.0f, y3Var.p ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(16.0f) + this.S + this.O);
            y3Var.b(canvas2);
            canvas2.restore();
        }
        canvas2.restore();
        a21 a21Var = this.n0;
        org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
        if (a21Var != null) {
            float alpha = getAlpha();
            if (f6Var != null) {
                f6Var.l(this.u0, this.t0 + 0.0f, getMeasuredWidth(), this.v0);
            } else {
                org.telegram.ui.ActionBar.j6.q(this.u0, this.t0 + 0.0f, getMeasuredWidth(), this.v0);
            }
            this.n0.c(canvas, getWidth(), this.j0, 0.0f, 1.0f, alpha, this.m0);
            canvas2 = canvas;
        }
        ArrayList arrayList = this.P1;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (f6Var != null) {
            f6Var.l(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.j6.q(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        }
        float width = (getWidth() - this.a1) / 2.0f;
        float dp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O + this.f;
        float dp2 = (this.a1 - AndroidUtilities.dp(4.0f)) / 2.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            e0 e0Var = (e0) arrayList.get(i10);
            float a2 = e0Var.a();
            float dp3 = ((AndroidUtilities.dp(f12) + dp2) * i10) + width;
            float f13 = dp3 + dp2;
            RectF rectF = this.U0;
            rectF.set(dp3, dp, f13, e0Var.f + dp);
            canvas2.save();
            if (a2 != 1.0f) {
                f7 = 4.0f;
                canvas2.scale(a2, a2, rectF.centerX(), rectF.centerY());
            } else {
                f7 = 4.0f;
            }
            float dp4 = AndroidUtilities.dp(Math.min(6.75f, SharedConfig.bubbleRadius));
            float[] fArr = this.Z1;
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
            Path path = this.a2;
            path.rewind();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas2.drawPath(path, H("paintChatActionBackground"));
            if (J()) {
                canvas2.drawPath(path, org.telegram.ui.ActionBar.j6.h2);
            }
            canvas2.save();
            canvas2.clipPath(path);
            z zVar = e0Var.s;
            if (zVar != null) {
                int i11 = (int) dp;
                zVar.setBounds((int) dp3, i11, (int) f13, e0Var.f + i11);
                e0Var.s.setAlpha(255);
                e0Var.s.draw(canvas2);
            }
            canvas2.restore();
            canvas2.save();
            float dp7 = e0Var.t != null ? AndroidUtilities.dp(26.0f) : 0;
            float A = com.google.android.gms.internal.vision.e2.A(dp2 - (e0Var.h.l() + (e0Var.t != null ? AndroidUtilities.dp(f7) : 0)), dp7, f11, dp3);
            Drawable drawable = e0Var.t;
            if (drawable != null) {
                int i12 = (int) A;
                f10 = 2.0f;
                drawable.setBounds(i12, (int) (((e0Var.f - AndroidUtilities.dp(24.0f)) / f11) + dp), AndroidUtilities.dp(24.0f) + i12, AndroidUtilities.dp(24.0f) + ((int) (((e0Var.f - AndroidUtilities.dp(24.0f)) / 2.0f) + dp)));
                e0Var.t.setAlpha(e0Var.m ? 128 : 255);
                e0Var.t.draw(canvas2);
                A += dp7;
            } else {
                f10 = 2.0f;
            }
            e0Var.h.p = Math.max(1, (((int) dp2) - AndroidUtilities.dp(15.0f)) - r6);
            e0Var.h.f(canvas2, A, (AndroidUtilities.dp(40.0f) / f10) + dp, e0Var.m ? 0.5f : 1.0f);
            canvas2.restore();
            canvas2.restore();
            i10++;
            f12 = 4.0f;
            f11 = 2.0f;
        }
    }

    public final void B(Canvas canvas, boolean z10) {
        if (this.s) {
            if (J() && !z10) {
                return;
            }
            if (!J() && z10) {
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
        org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
        if (f6Var != null) {
            f6Var.l(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.j6.q(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        }
        MessageObject messageObject = this.H0;
        if (messageObject == null || !messageObject.shouldDrawReactions()) {
            return;
        }
        ah.k1 k1Var = this.C0;
        boolean z11 = k1Var.b;
        v0 v0Var = this.i2;
        if (!z11 || (v0Var.b && k1Var.l)) {
            k1Var.a = 1.0f;
            if (alpha < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (alpha * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            k1Var.d(canvas2, v0Var.b ? v0Var.c : 1.0f, num);
            if (alpha < 1.0f) {
                canvas2.restore();
            }
        }
    }

    public final void D(um umVar, Canvas canvas, int i10, Integer num, float f7) {
        ah.k1 k1Var = this.C0;
        if (k1Var.b) {
            return;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
        if (f6Var != null) {
            f6Var.l(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        } else {
            org.telegram.ui.ActionBar.j6.q(this.u0, this.t0 + AndroidUtilities.dp(4.0f), getMeasuredWidth(), this.v0);
        }
        k1Var.D = f7;
        k1Var.f(umVar, canvas, i10, num);
    }

    public final ColorFilter F(int i10) {
        if (i10 != this.h2 || this.g2 == null) {
            this.h2 = i10;
            this.g2 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        return this.g2;
    }

    public final int G(MessageObject messageObject) {
        int i10;
        int i11 = this.Z0;
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

    public Paint H(String str) {
        org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
        Paint G = f6Var != null ? f6Var.G(str) : null;
        return G != null ? G : org.telegram.ui.ActionBar.j6.S0(str);
    }

    public final float I(MessageObject messageObject) {
        MessagesController messagesController;
        String str;
        if (messageObject == null) {
            return 1.0f;
        }
        try {
            if (messageObject.type == 22 && (str = (messagesController = MessagesController.getInstance(this.H)).uploadingWallpaper) != null && TextUtils.equals(messageObject.messageOwner.action.wallpaper.uploadingImage, str)) {
                return messagesController.uploadingWallpaperInfo.r;
            }
            return 1.0f;
        } catch (Exception e7) {
            FileLog.e(e7);
            return 1.0f;
        }
    }

    public final boolean J() {
        if (this.N0 != null) {
            return false;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
        return f6Var != null ? f6Var.o0() : org.telegram.ui.ActionBar.j6.a1();
    }

    public final void K() {
        t0 t0Var = this.X0;
        if (t0Var != null && t0Var.f()) {
            super.invalidate();
        } else if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public final boolean L(MessageObject messageObject) {
        if (messageObject == null) {
            return false;
        }
        int i10 = messageObject.type;
        return i10 == 30 || i10 == 18 || i10 == 25 || N();
    }

    public final boolean M() {
        TLRPC.Message message;
        MessageObject messageObject = this.H0;
        return (messageObject == null || (message = messageObject.messageOwner) == null || !(message.action instanceof TLRPC.TL_messageActionSuggestedPostApproval)) ? false : true;
    }

    public final boolean N() {
        MessageObject messageObject;
        int i10;
        if (this.F0.d() || this.G0 != null || (i10 = (messageObject = this.H0).type) == 31 || i10 == 37 || i10 == 33 || i10 == 35 || i10 == 34 || i10 == 21 || i10 == 22 || messageObject.isStoryMention()) {
            return true;
        }
        TLRPC.Message message = this.H0.messageOwner;
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
        MessageObject messageObject = this.H0;
        if (messageObject == null) {
            return false;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageAction messageAction = message.action;
        if (((messageAction instanceof TLRPC.TL_messageActionGiftCode) || (messageAction instanceof TLRPC.TL_messageActionGiftStars)) && (message.from_id instanceof TLRPC.TL_peerUser)) {
            return UserObject.isUserSelf(MessagesController.getInstance(this.H).getUser(Long.valueOf(this.H0.messageOwner.from_id.user_id)));
        }
        return false;
    }

    public final void Q(CharacterStyle characterStyle) {
        if (this.X0 == null || !(characterStyle instanceof URLSpan)) {
            return;
        }
        String url = ((URLSpan) characterStyle).getURL();
        if (url.startsWith("task")) {
            this.X0.b0(this, this.H0.getReplyMsgId(), Integer.parseInt(url.substring(5)));
            return;
        }
        if (url.startsWith("topic")) {
            URLSpan uRLSpan = this.x;
            if (uRLSpan instanceof l51) {
                TLObject tLObject = ((l51) uRLSpan).c;
                if (tLObject instanceof TLRPC.TL_forumTopic) {
                    og.d.m(this.X0.K0(), -this.X0.a(), (TLRPC.TL_forumTopic) tLObject, 0);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("invite")) {
            URLSpan uRLSpan2 = this.x;
            if (uRLSpan2 instanceof l51) {
                TLObject tLObject2 = ((l51) uRLSpan2).c;
                if (tLObject2 instanceof TLRPC.TL_chatInviteExported) {
                    this.X0.M0((TLRPC.TL_chatInviteExported) tLObject2);
                    return;
                }
                return;
            }
        }
        if (url.startsWith("game")) {
            this.X0.K(this, this.H0.getReplyMsgId());
        } else if (url.startsWith("http")) {
            of.f.s(getContext(), url);
        } else {
            this.X0.r1(Long.parseLong(url));
        }
    }

    public final void R() {
        TLRPC.TL_premiumGiftOption tL_premiumGiftOption = new TLRPC.TL_premiumGiftOption();
        MessageObject messageObject = this.H0;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        tL_premiumGiftOption.amount = messageAction.amount;
        tL_premiumGiftOption.months = messageAction.months;
        tL_premiumGiftOption.currency = messageAction.currency;
        String str = null;
        if (messageObject != null && (messageAction instanceof TLRPC.TL_messageActionGiftCode) && !O()) {
            str = ((TLRPC.TL_messageActionGiftCode) this.H0.messageOwner.action).slug;
        }
        if (this.X0 != null) {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(this, tL_premiumGiftOption, str, 4));
        }
    }

    public final void S() {
        TLRPC.Message message;
        MessageObject messageObject = this.H0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return;
        }
        TLRPC.MessageAction messageAction = message.action;
        boolean z10 = messageAction instanceof TLRPC.TL_messageActionGiftStars;
        bi.j9 j9Var = this.d0;
        if (z10) {
            Context context = getContext();
            TLRPC.Message message2 = this.H0.messageOwner;
            int i10 = message2.date;
            TLRPC.Peer peer = message2.from_id;
            TLRPC.Peer peer2 = message2.peer_id;
            TLRPC.TL_messageActionGiftStars tL_messageActionGiftStars = (TLRPC.TL_messageActionGiftStars) message2.action;
            org.telegram.ui.ActionBar.f6 f6Var = j9Var.J;
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
            zh.v7.h1(context, false, 0L, this.H, starsTransaction, f6Var);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionPrizeStars) {
            Context context2 = getContext();
            TLRPC.Message message3 = this.H0.messageOwner;
            int i11 = message3.date;
            TLRPC.Peer peer3 = message3.from_id;
            TLRPC.Peer peer4 = message3.peer_id;
            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) message3.action;
            org.telegram.ui.ActionBar.f6 f6Var2 = j9Var.J;
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
            zh.v7.h1(context2, false, 0L, this.H, starsTransaction2, f6Var2);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionGiftTon) {
            Context context3 = getContext();
            TLRPC.Message message4 = this.H0.messageOwner;
            int i12 = message4.date;
            TLRPC.Peer peer5 = message4.from_id;
            TLRPC.Peer peer6 = message4.peer_id;
            TLRPC.TL_messageActionGiftTon tL_messageActionGiftTon = (TLRPC.TL_messageActionGiftTon) message4.action;
            org.telegram.ui.ActionBar.f6 f6Var3 = j9Var.J;
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
            zh.v7.h1(context3, false, 0L, this.H, starsTransaction3, f6Var3);
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            if (((TLRPC.TL_messageActionStarGift) messageAction).forceIn) {
                return;
            }
            zh.w3 w3Var = new zh.w3(getContext(), this.H, this.H0.getDialogId(), this.Y0, null);
            w3Var.i2(this.H0, null);
            w3Var.show();
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
            if (!((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift.burned) {
                zh.w3 w3Var2 = new zh.w3(getContext(), this.H, this.H0.getDialogId(), this.Y0, null);
                w3Var2.i2(this.H0, null);
                w3Var2.show();
                return;
            } else {
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U == null) {
                    return;
                }
                org.telegram.messenger.w1.o(R.string.UniqueGiftNotFoundBurned, yc.a0(U), R.raw.fire_on, 36);
                return;
            }
        }
        if (messageAction instanceof TLRPC.TL_messageActionSetChatTheme) {
            TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction).theme;
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    zh.w3 w3Var3 = new zh.w3(getContext(), this.H, this.H0.getDialogId(), this.Y0, null);
                    w3Var3.h2(starGift.slug, (TL_stars.TL_starGiftUnique) starGift, null);
                    w3Var3.show();
                }
            }
        }
    }

    public final void T(int i10, boolean z10, boolean z11) {
        int i11 = this.I0;
        if (i11 == i10 || i11 / 3600 == i10 / 3600) {
            return;
        }
        String string = z10 ? i10 == 2147483646 ? LocaleController.getString("MessageScheduledUntilOnline", R.string.MessageScheduledUntilOnline) : LocaleController.formatString("MessageScheduledOn", R.string.MessageScheduledOn, LocaleController.formatDateChat(i10)) : LocaleController.formatDateChat(i10);
        this.I0 = i10;
        CharSequence charSequence = this.J0;
        if (charSequence == null || !TextUtils.equals(string, charSequence)) {
            this.J0 = string;
            this.d2 = null;
            X(z11);
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
    public final void U(MessageObject messageObject, boolean z10) {
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z11;
        String str;
        String str2;
        TLRPC.Document document;
        TLRPC.Document document2;
        String str3;
        ArrayList<TLRPC.TL_stickerPack> arrayList;
        MessageObject messageObject2;
        int i10;
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
        float f7;
        TLRPC.WallPaper wallPaper;
        TLRPC.MessageAction messageAction;
        String str4;
        int i11;
        StaticLayout staticLayout;
        MessageObject messageObject3 = messageObject;
        if (messageObject3 == null) {
            return;
        }
        if (this.H0 != messageObject3 || (!((staticLayout = this.M) == null || TextUtils.equals(staticLayout.getText(), messageObject3.messageText)) || (!(this.B0 || messageObject3.replyMessageObject == null) || z10 || messageObject3.type == 21 || messageObject3.forceUpdate))) {
            if (BuildVars.DEBUG_PRIVATE_VERSION && Thread.currentThread() != ApplicationLoader.applicationHandler.getLooper().getThread()) {
                FileLog.e(new IllegalStateException("Wrong thread!!!"));
            }
            this.P1.clear();
            this.Q1 = null;
            this.d2 = null;
            MessageObject messageObject4 = this.H0;
            boolean z16 = messageObject4 == null || messageObject4.stableId != messageObject3.stableId;
            if (messageObject4 != null) {
                messageObject3.playedGiftAnimation = messageObject4.playedGiftAnimation;
            }
            this.H0 = messageObject3;
            messageObject3.forceUpdate = false;
            this.B0 = messageObject3.replyMessageObject != null;
            DownloadController.getInstance(this.H).removeLoadingFileObserver(this);
            this.V = 0;
            this.G = false;
            u0 u0Var = this.k1;
            if (u0Var != null && z16) {
                org.telegram.ui.Components.z5.release((w0) u0Var.i, (org.telegram.ui.Components.v5) u0Var.h);
                this.k1 = null;
                this.f1 = false;
            }
            if (z16 || messageObject3.reactionsChanged) {
                messageObject3.reactionsChanged = false;
                TLRPC.Message message = messageObject3.messageOwner;
                boolean z17 = (message == null || (tL_messageReactions = message.reactions) == null || !tL_messageReactions.reactions_as_tags) ? false : true;
                if (messageObject3.shouldDrawReactions()) {
                    this.C0.s(messageObject3, !messageObject3.shouldDrawReactionsInLayout(), z17, this.Y0);
                } else {
                    this.C0.s(null, false, false, this.Y0);
                }
            }
            if (messageObject3.type == 32) {
                if (this.G0 == null) {
                    gy0 gy0Var = new gy0(this.H, this, this.Y0);
                    this.G0 = gy0Var;
                    if (this.U1) {
                        gy0Var.d.v0 = gy0Var.b;
                    }
                }
                gy0 gy0Var2 = this.G0;
                gy0Var2.getClass();
                TLRPC.TL_messageActionSuggestBirthday tL_messageActionSuggestBirthday = (TLRPC.TL_messageActionSuggestBirthday) messageObject3.messageOwner.action;
                gy0Var2.e = tL_messageActionSuggestBirthday.birthday;
                f01 f01Var = new f01(TextUtils.concat(messageObject3.messageText, ":"), 13.0f, null);
                f01Var.n(6);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                f01Var.a();
                f01Var.q(AndroidUtilities.dp(174.0f) - AndroidUtilities.dp(32.0f));
                gy0Var2.f = f01Var;
                int i12 = (tL_messageActionSuggestBirthday.birthday.flags & 1) != 0 ? 3 : 2;
                f01[] f01VarArr = new f01[i12];
                gy0Var2.g = f01VarArr;
                gy0Var2.h = new f01[i12];
                f01VarArr[0] = new f01(LocaleController.getString(R.string.DateDay), 11.0f, null);
                gy0Var2.h[0] = new f01("" + tL_messageActionSuggestBirthday.birthday.day, 11.0f, AndroidUtilities.bold());
                gy0Var2.g[1] = new f01(LocaleController.getString(R.string.DateMonth), 11.0f, null);
                f01[] f01VarArr2 = gy0Var2.h;
                StringBuilder sb2 = new StringBuilder("");
                int i13 = tL_messageActionSuggestBirthday.birthday.month - 1;
                sb2.append((i13 < 0 || i13 >= 12) ? i2.g.i(i13, "") : LocaleController.getString(new int[]{R.string.January, R.string.February, R.string.March, R.string.April, R.string.May, R.string.June, R.string.July, R.string.August, R.string.September, R.string.October, R.string.November, R.string.December}[i13]));
                f01VarArr2[1] = new f01(sb2.toString(), 11.0f, AndroidUtilities.bold());
                if ((tL_messageActionSuggestBirthday.birthday.flags & 1) != 0) {
                    gy0Var2.g[2] = new f01(LocaleController.getString(R.string.DateYear), 11.0f, null);
                    gy0Var2.h[2] = new f01("" + tL_messageActionSuggestBirthday.birthday.year, 11.0f, AndroidUtilities.bold());
                }
                gy0Var2.i = !messageObject3.isOutOwner();
                org.telegram.ui.ActionBar.f6 f6Var = gy0Var2.c;
                gy0Var2.l.setColor(f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q() ? org.telegram.ui.ActionBar.j6.l1(0.12f, -1) : org.telegram.ui.ActionBar.j6.l1(0.12f, -16777216));
                gy0Var2.j = new f01(LocaleController.getString(R.string.SuggestedDateOfBirthView), 14.0f, AndroidUtilities.bold());
            } else {
                gy0 gy0Var3 = this.G0;
                if (gy0Var3 != null) {
                    gy0Var3.d.v0 = null;
                    this.G0 = null;
                }
            }
            boolean z18 = !z16;
            this.F0.f(messageObject3, z18);
            this.I.setAutoRepeatCount(0);
            this.I.clearDecorators();
            if (messageObject3.type != 22) {
                this.J = null;
            }
            if (messageObject3.actionDeleteGroupEventId != -1) {
                w7.z5.b(this, 0.02f, 1.2f);
                this.W1 = Math.max(AndroidUtilities.dp(250.0f), di.f4.a(messageObject3.messageText, (TextPaint) H("paintChatActionText")));
                m11 S0 = ub.S0(messageObject3.messageText);
                if (S0 != null) {
                    S0.h = this;
                }
            } else {
                setStateListAnimator(null);
                this.W1 = 0;
            }
            if (messageObject3.isStoryMention()) {
                TLRPC.User user = MessagesController.getInstance(this.H).getUser(Long.valueOf(messageObject3.messageOwner.media.user_id));
                this.L.m(this.H, user);
                TL_stories.StoryItem storyItem = messageObject3.messageOwner.media.storyItem;
                if (storyItem == null || !storyItem.noforwards) {
                    bi.p9.x(this.I, storyItem);
                } else {
                    this.I.setForUserOrChat(user, this.L, null, true, 0, true);
                }
                this.I.setRoundRadius((int) (this.Z0 / 2.0f));
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
                                org.telegram.ui.ActionBar.f6 f6Var2 = this.Y0;
                                boolean a2 = f6Var2 != null ? f6Var2.a() : org.telegram.ui.ActionBar.j6.I.q();
                                this.I.clearImage();
                                int i16 = this.H;
                                String wallpaperEmoticon = ChatThemeController.getWallpaperEmoticon(wallPaper);
                                int i17 = di.d7.B0;
                                org.telegram.ui.ActionBar.d4 theme = ChatThemeController.getInstance(i16).getTheme(gg.b.d(wallpaperEmoticon));
                                Drawable r02 = theme == null ? org.telegram.ui.ActionBar.j6.r0() : di.d7.g(i16, theme, a2);
                                this.J = r02;
                                if (r02 != null) {
                                    r02.setCallback(this);
                                }
                            } else if (wallPaper != null && (str4 = wallPaper.uploadingImage) != null) {
                                this.I.setImage(ImageLocation.getForPath(str4), "150_150_wallpaper" + wallPaper.id + go.e(wallPaper.settings), null, null, go.b(wallPaper), 0L, null, wallPaper, 1);
                                this.J = null;
                            } else if (wallPaper != null) {
                                TLObject tLObject = messageObject3.photoThumbsObject;
                                TLRPC.Document document6 = tLObject instanceof TLRPC.Document ? (TLRPC.Document) tLObject : wallPaper.document;
                                this.I.setImage(ImageLocation.getForDocument(document6), "150_150_wallpaper" + wallPaper.id + go.e(wallPaper.settings), null, null, go.b(wallPaper), 0L, null, wallPaper, 1);
                                this.J = null;
                            } else {
                                this.J = null;
                            }
                            this.I.setRoundRadius((int) (this.Z0 / 2.0f));
                            if (I(messageObject) != 1.0f) {
                                this.B1.o(1.0f, z18);
                                this.B1.setIcon(4, z18, z18);
                            } else {
                                this.B1.setIcon(3, z18, z18);
                            }
                        }
                    }
                    TLRPC.Message message2 = messageObject3.messageOwner;
                    wallPaper = (message2 == null || (messageAction = message2.action) == null) ? null : messageAction.wallpaper;
                    if (TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
                    }
                    this.I.setRoundRadius((int) (this.Z0 / 2.0f));
                    if (I(messageObject) != 1.0f) {
                    }
                } else if (i14 == 21) {
                    this.I.setRoundRadius((int) (this.Z0 / 2.0f));
                    this.I.setAllowStartLottieAnimation(true);
                    this.I.setDelegate(null);
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
                        z15 = false;
                    } else if (closestVideoSizeWithSize != null) {
                        z15 = false;
                        this.I.setImage(forPhoto, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject, 0);
                        messageObject3 = messageObject;
                    } else {
                        z15 = false;
                        this.I.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo), "150_150", ImageLocation.getForObject(photoSize2, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 0);
                    }
                    this.I.setAllowStartLottieAnimation(z15);
                    u40 u40Var = MessagesController.getInstance(this.H).photoSuggestion.get(messageObject3.messageOwner.local_id);
                    if (u40Var != null) {
                        f7 = 1.0f;
                        if (u40Var.W != 1.0f) {
                            this.B1.setIcon(3, z18, z18);
                        }
                    } else {
                        f7 = 1.0f;
                    }
                    this.B1.o(f7, z18);
                    this.B1.setIcon(4, z18, z18);
                } else if (i14 == 31 || i14 == 33 || i14 == 30 || i14 == 18 || i14 == 25 || i14 == 35) {
                    this.I.setRoundRadius(0);
                    TLRPC.MessageAction messageAction2 = messageObject3.messageOwner.action;
                    if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                        TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction2;
                        long j3 = MessagesController.getInstance(this.H).config.noForwardsRequestExpirePeriod.get(TimeUnit.SECONDS);
                        if (tL_messageActionNoForwardsRequest.expired) {
                            z11 = z16;
                        } else {
                            z11 = z16;
                            if (messageObject3.messageOwner.date + j3 >= ConnectionsManager.getInstance(this.H).getCurrentTime()) {
                                z14 = false;
                                this.R1 = z14;
                                if (!messageObject3.isOut() && !tL_messageActionNoForwardsRequest.expired && !this.R1) {
                                    BotInlineKeyboard.Builder builder = new BotInlineKeyboard.Builder();
                                    builder.addSharingOfferKeyboard();
                                    this.Q1 = builder.build();
                                }
                                document = null;
                            }
                        }
                        z14 = true;
                        this.R1 = z14;
                        if (!messageObject3.isOut()) {
                            BotInlineKeyboard.Builder builder2 = new BotInlineKeyboard.Builder();
                            builder2.addSharingOfferKeyboard();
                            this.Q1 = builder2.build();
                        }
                        document = null;
                    } else {
                        z11 = z16;
                        if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                            TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                            TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                            if (starGift != null) {
                                document5 = zf.d.e(starGift);
                                if (this.K0 == null) {
                                    this.K0 = new yh.e1(this, this.Y0, false);
                                }
                                this.K0.d((TL_stars.starGiftAttributeBackdrop) zh.s5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.K0.e((TL_stars.starGiftAttributePattern) zh.s5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                            } else {
                                document5 = null;
                            }
                            this.R1 = tL_messageActionStarGiftPurchaseOffer.expires_at < ConnectionsManager.getInstance(this.H).getCurrentTime();
                            if (!messageObject3.isOut() && !tL_messageActionStarGiftPurchaseOffer.accepted && !tL_messageActionStarGiftPurchaseOffer.declined && !this.R1) {
                                BotInlineKeyboard.Builder builder3 = new BotInlineKeyboard.Builder();
                                builder3.addGiftOfferKeyboard();
                                this.Q1 = builder3.build();
                            }
                            document = document5;
                        } else if (messageAction2 instanceof TLRPC.TL_messageActionSetChatTheme) {
                            TL_stars.StarGift starGift2 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) messageAction2).theme).gift;
                            if (starGift2 != null) {
                                document4 = zf.d.e(starGift2);
                                if (this.K0 == null) {
                                    this.K0 = new yh.e1(this, this.Y0, false);
                                }
                                this.K0.d((TL_stars.starGiftAttributeBackdrop) zh.s5.l(starGift2.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                this.K0.e((TL_stars.starGiftAttributePattern) zh.s5.l(starGift2.attributes, TL_stars.starGiftAttributePattern.class));
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
                                source = this.Q1;
                                if (source != null) {
                                    int rowsCount = source.getRowsCount();
                                    for (int i19 = 0; i19 < rowsCount; i19++) {
                                        int columnsCount = this.Q1.getColumnsCount(i19);
                                        int i20 = 0;
                                        while (i20 < columnsCount) {
                                            BotInlineKeyboard.Button button = this.Q1.getButton(i19, i20);
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
                                            int b10 = w7.b0.b(i21, 1, i20 == 0);
                                            e0Var.g = b10;
                                            e0Var.g = w7.b0.b(b10, 2, i20 == 1);
                                            e0Var.h = new f01(button.getText(), (TextPaint) H("paintChatBotButton"));
                                            this.P1.add(e0Var);
                                            i20++;
                                        }
                                    }
                                }
                                this.D1 = messageObject3.wasUnread;
                                this.z1 = document;
                                if (document == null) {
                                    this.I.setAllowStartLottieAnimation(true);
                                    int i22 = messageObject3.type;
                                    if (i22 != 31 && i22 != 37 && i22 != 33) {
                                        this.I.setDelegate(this.F1);
                                    }
                                    this.A1 = null;
                                    int i23 = 0;
                                    while (true) {
                                        if (i23 >= document.video_thumbs.size()) {
                                            break;
                                        }
                                        if ("f".equals(document.video_thumbs.get(i23).type)) {
                                            this.A1 = document.video_thumbs.get(i23);
                                            break;
                                        }
                                        i23++;
                                    }
                                    if (z11 || messageObject3.type != 18) {
                                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.a7, 0.3f);
                                        this.I.setAutoRepeat(0);
                                        ImageReceiver imageReceiver = this.I;
                                        ImageLocation forDocument = ImageLocation.getForDocument(document);
                                        Locale locale = Locale.US;
                                        imageReceiver.setImage(forDocument, i2.g.i(messageObject3.stableId, "160_160_nr_messageId="), svgThumb, "tgs", messageObject2, 1);
                                    }
                                } else if (str2 != null) {
                                    MediaDataController.getInstance(this.H).loadStickersByEmojiOrName(str2, false, !z12);
                                }
                            }
                            document = null;
                            messageObject2 = messageObject3;
                            z12 = false;
                            str2 = null;
                            source = this.Q1;
                            if (source != null) {
                            }
                            this.D1 = messageObject3.wasUnread;
                            this.z1 = document;
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
                                        source = this.Q1;
                                        if (source != null) {
                                        }
                                        this.D1 = messageObject3.wasUnread;
                                        this.z1 = document;
                                        if (document == null) {
                                        }
                                    }
                                    document = null;
                                    messageObject2 = messageObject3;
                                    z12 = false;
                                    str2 = null;
                                    source = this.Q1;
                                    if (source != null) {
                                    }
                                    this.D1 = messageObject3.wasUnread;
                                    this.z1 = document;
                                    if (document == null) {
                                    }
                                }
                            }
                            if (messageAction2 instanceof TLRPC.TL_messageActionGiftTon) {
                                str = UserConfig.getInstance(this.H).premiumTonStickerPack;
                                if (str == null) {
                                    MediaDataController.getInstance(this.H).checkTonGiftStickers();
                                    return;
                                }
                            } else {
                                str = UserConfig.getInstance(this.H).premiumGiftsStickerPack;
                                if (str == null) {
                                    MediaDataController.getInstance(this.H).checkPremiumGiftStickers();
                                    return;
                                }
                            }
                            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.H).getStickerSetByName(str);
                            ?? r22 = stickerSetByName;
                            if (stickerSetByName == null) {
                                r22 = MediaDataController.getInstance(this.H).getStickerSetByEmojiOrName(str);
                            }
                            if (r22 != 0) {
                                TLRPC.MessageAction messageAction3 = messageObject3.messageOwner.action;
                                int i24 = messageAction3.months;
                                if (messageObject3.type == 30) {
                                    String str5 = "3⃣";
                                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftTon) {
                                        long j10 = messageAction3.cryptoAmount;
                                        if (j10 > 10000000000L) {
                                            if (j10 <= 50000000000L) {
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
                                        long j11 = messageAction3 instanceof TLRPC.TL_messageActionGiftStars ? ((TLRPC.TL_messageActionGiftStars) messageAction3).stars : ((TLRPC.TL_messageActionPrizeStars) messageAction3).stars;
                                        if (j11 > 1000) {
                                            if (j11 >= 2500) {
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
                                    source = this.Q1;
                                    if (source != null) {
                                    }
                                    this.D1 = messageObject3.wasUnread;
                                    this.z1 = document;
                                    if (document == null) {
                                    }
                                } else {
                                    String str6 = (String) j2.get(Integer.valueOf(i24));
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
                                                Long l4 = arrayList4.get(i27);
                                                i27++;
                                                long longValue2 = l4.longValue();
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
                                    z12 = r22;
                                } else {
                                    str2 = str;
                                    document = r22.documents.get(0);
                                    messageObject2 = r22;
                                    z12 = r22;
                                }
                                source = this.Q1;
                                if (source != null) {
                                }
                                this.D1 = messageObject3.wasUnread;
                                this.z1 = document;
                                if (document == null) {
                                }
                            } else {
                                str2 = str;
                                document = null;
                                z13 = r22;
                                messageObject2 = null;
                                z12 = z13;
                                source = this.Q1;
                                if (source != null) {
                                }
                                this.D1 = messageObject3.wasUnread;
                                this.z1 = document;
                                if (document == null) {
                                }
                            }
                        }
                    }
                    z13 = false;
                    str2 = null;
                    messageObject2 = null;
                    z12 = z13;
                    source = this.Q1;
                    if (source != null) {
                    }
                    this.D1 = messageObject3.wasUnread;
                    this.z1 = document;
                    if (document == null) {
                    }
                } else if (i14 == 37) {
                    TLRPC.Chat chat = MessagesController.getInstance(this.H).getChat(Long.valueOf(((TLRPC.TL_messageActionChangeCommunity) messageObject3.messageOwner.action).community_id));
                    this.I.setAllowStartLottieAnimation(true);
                    this.I.setDelegate(null);
                    this.I.setRoundRadius(AndroidUtilities.dp(14.0f));
                    this.I.setAutoRepeatCount(1);
                    this.L.q(chat);
                    this.I.setForUserOrChat(chat, new pq(getContext(), AndroidUtilities.dp(14.0f)), chat);
                } else if (i14 == 11) {
                    this.I.setAllowStartLottieAnimation(true);
                    this.I.setDelegate(null);
                    this.I.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
                    this.I.setAutoRepeatCount(1);
                    this.L.n(messageObject3.getDialogId(), null, null);
                    if (messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                        this.I.setImage(null, null, this.L, null, messageObject3, 0);
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
                                if (!messageObject3.mediaExists && !DownloadController.getInstance(this.H).canDownloadMedia(4, videoSize.size)) {
                                    this.x0 = ImageLocation.getForPhoto(videoSize, photo2);
                                    DownloadController.getInstance(this.H).addLoadingFileObserver(FileLoader.getAttachFileName(videoSize), messageObject3, this);
                                }
                                if (videoSize == null) {
                                    this.I.setImage(ImageLocation.getForPhoto(videoSize, photo2), ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 1);
                                } else {
                                    this.I.setImage(ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject3.photoThumbsObject), "150_150", ImageLocation.getForObject(photoSize, messageObject3.photoThumbsObject), "50_50_b", messageObject3.strippedThumb, 0L, null, messageObject3, 1);
                                }
                            }
                            videoSize = null;
                            if (videoSize == null) {
                            }
                        } else {
                            this.I.setImageBitmap(this.L);
                        }
                    }
                    this.I.setVisible(!PhotoViewer.M1(messageObject3), false);
                } else {
                    this.I.setAllowStartLottieAnimation(true);
                    this.I.setDelegate(null);
                    this.I.setImageBitmap((Bitmap) null);
                }
            }
            if (this.k0 && this.e0 && this.i0 && (this.f0 || this.g0 || this.h0)) {
                this.l0 = AndroidUtilities.dp(33.0f);
                if (this.n0 == null) {
                    a21 a21Var = new a21(this.H, this, this.Y0, true);
                    this.n0 = a21Var;
                    a21Var.r = new s0(this, 1);
                }
                if (this.n0.f(this.H0)) {
                    if (this.U1) {
                        this.n0.a();
                    }
                    i11 = 0;
                } else {
                    this.n0.b();
                    this.n0 = null;
                    i11 = 0;
                    this.l0 = 0;
                }
            } else {
                a21 a21Var2 = this.n0;
                if (a21Var2 != null) {
                    a21Var2.b();
                    this.n0 = null;
                }
                i11 = 0;
                this.l0 = 0;
            }
            int paddingTop = getPaddingTop();
            int i30 = this.l0;
            if (paddingTop != i30) {
                setPadding(i11, i30, i11, i11);
            }
            this.L1.setVisibility((!L(messageObject) || this.F0.d()) ? 8 : 0);
            og.d.b(messageObject3);
            requestLayout();
        }
    }

    public final void V(int i10, int i11) {
        this.L0 = i10;
        this.M0 = i11;
    }

    public final void W(float f7, int i10) {
        this.w0 = true;
        this.v0 = i10;
        this.t0 = f7;
        this.u0 = 0.0f;
    }

    public final void X(boolean z10) {
        if (getMeasuredWidth() != 0) {
            w(getMeasuredWidth(), this.J0);
            invalidate();
        }
        if (this.A0) {
            r();
        } else if (z10) {
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
            MessageObject messageObject2 = this.H0;
            if (messageObject2 != null) {
                U(messageObject2, true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.diceStickersDidLoad && Objects.equals(objArr[0], UserConfig.getInstance(this.H).premiumGiftsStickerPack) && (messageObject = this.H0) != null) {
            U(messageObject, true);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view != this.L1) {
            return super.drawChild(canvas, view, j3);
        }
        float a2 = this.n.a(0.02f);
        canvas.save();
        canvas.scale(a2, a2, (view.getMeasuredWidth() / 2.0f) + view.getX(), (view.getMeasuredHeight() / 2.0f) + view.getY());
        boolean drawChild = super.drawChild(canvas, view, j3);
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Cells.n4
    public final void f(TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        t0 t0Var = this.X0;
        if (t0Var != null) {
            t0Var.l2(this, reactionCount, z10, f7, f10);
        }
    }

    public /* bridge */ /* synthetic */ ImageReceiver getAvatarImage() {
        return null;
    }

    @Override // org.telegram.ui.Cells.a0
    public int getBoundsLeft() {
        zh.y3 y3Var = this.F0;
        if (y3Var.d()) {
            int width = ((int) (getWidth() - (y3Var.Q.e + AndroidUtilities.dp(8.0f)))) / 2;
            return y3Var.p ? width : Math.min(this.S0, width);
        }
        if (L(this.H0)) {
            return i2.g.C(getWidth(), this.a1, 2, this.j0 / 2);
        }
        int i10 = this.S0;
        ImageReceiver imageReceiver = this.I;
        if (imageReceiver != null && imageReceiver.getVisible()) {
            i10 = Math.min((int) imageReceiver.getImageX(), i10);
        }
        return (this.j0 / 2) + i10;
    }

    @Override // org.telegram.ui.Cells.a0
    public int getBoundsRight() {
        int i10;
        int i11;
        zh.y3 y3Var = this.F0;
        if (y3Var.d()) {
            int dp = ((int) ((y3Var.Q.e + AndroidUtilities.dp(8.0f)) + getWidth())) / 2;
            return y3Var.p ? dp : Math.max(this.T0, dp);
        }
        if (L(this.H0)) {
            i10 = this.j0 / 2;
            i11 = (getWidth() + this.a1) / 2;
        } else {
            i10 = this.T0;
            ImageReceiver imageReceiver = this.I;
            if (imageReceiver != null && imageReceiver.getVisible()) {
                i10 = Math.max((int) imageReceiver.getImageX2(), i10);
            }
            i11 = this.j0 / 2;
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
        return this.I0;
    }

    public t0 getDelegate() {
        return this.X0;
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
        return this.H0;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.w;
    }

    public ImageReceiver getPhotoImage() {
        return this.I;
    }

    public ah.k1 getReactionsLayout() {
        return this.C0;
    }

    @Override // org.telegram.ui.Cells.n4
    public /* bridge */ /* synthetic */ float getSlidingOffsetX() {
        return 0.0f;
    }

    public v0 getTransitionParams() {
        return this.i2;
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
        Runnable runnable = this.f2;
        if (runnable != null) {
            runnable.run();
        }
        if (!this.e2 || getParent() == null) {
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
        t0 t0Var = this.X0;
        if (t0Var != null) {
            return t0Var.j2(this, this.y0, this.z0);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        t0 t0Var;
        super.onAttachedToWindow();
        this.U1 = true;
        this.I.onAttachedToWindow();
        setStarsPaused(false);
        this.r0 = org.telegram.ui.Components.z5.update(0, this, (!this.s || (t0Var = this.X0) == null || t0Var.f()) ? false : true, this.r0, this.M);
        u0 u0Var = this.k1;
        if (u0Var != null) {
            u0Var.h = org.telegram.ui.Components.z5.update(0, (View) u0Var.i, false, (org.telegram.ui.Components.v5) u0Var.h, (StaticLayout) u0Var.f);
        }
        int i10 = this.H;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        MessageObject messageObject = this.H0;
        if (messageObject != null && messageObject.type == 21) {
            U(messageObject, true);
        }
        zh.y3 y3Var = this.F0;
        y3Var.P = true;
        if (y3Var.N != null) {
            y3Var.d.onAttachedToWindow();
            y3Var.e.a();
            y3Var.y.d.onAttachedToWindow();
        }
        ah.k1 k1Var = this.C0;
        ArrayList arrayList = k1Var.v;
        k1Var.G = true;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ah.h1) arrayList.get(i11)).a();
        }
        a21 a21Var = this.n0;
        if (a21Var != null) {
            a21Var.a();
        }
        gy0 gy0Var = this.G0;
        if (gy0Var != null) {
            gy0Var.d.v0 = gy0Var.b;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.U1 = false;
        int i10 = this.H;
        DownloadController.getInstance(i10).removeLoadingFileObserver(this);
        this.I.onDetachedFromWindow();
        setStarsPaused(true);
        this.A0 = false;
        org.telegram.ui.Components.z5.release(this, this.r0);
        u0 u0Var = this.k1;
        if (u0Var != null) {
            org.telegram.ui.Components.z5.release((w0) u0Var.i, (org.telegram.ui.Components.v5) u0Var.h);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdatePremiumGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.didUpdateTonGiftStickers);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        this.d0.g();
        this.i2.a = false;
        zh.y3 y3Var = this.F0;
        y3Var.P = false;
        y3Var.d.onDetachedFromWindow();
        y3Var.e.b();
        yh.k0 k0Var = y3Var.y;
        k0Var.d.onDetachedFromWindow();
        org.telegram.ui.Components.z5.release((View) null, k0Var.q);
        k0Var.q = null;
        this.C0.q();
        a21 a21Var = this.n0;
        if (a21Var != null) {
            a21Var.b();
        }
        gy0 gy0Var = this.G0;
        if (gy0Var != null) {
            gy0Var.d.v0 = null;
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
        w0 w0Var;
        float f7;
        float f10;
        float dp;
        Canvas canvas2;
        float f11;
        w0 w0Var2;
        float f12;
        float f13;
        f01 f01Var;
        u0 u0Var;
        StaticLayout staticLayout;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z10;
        float f14;
        float clamp;
        Paint H;
        boolean a2;
        ColorMatrix colorMatrix;
        int i12;
        TextPaint textPaint3;
        int i13;
        int i14;
        f01 f01Var2;
        int dp2;
        t0 t0Var;
        int size;
        int i15;
        TextPaint textPaint4;
        Canvas canvas3 = canvas;
        canvas3.save();
        canvas3.translate(this.j0 / 2.0f, getPaddingTop());
        MessageObject messageObject = this.H0;
        float e7 = this.i1.e(!this.g1);
        int i16 = this.Z0;
        zh.y3 y3Var = this.F0;
        boolean d = y3Var.d();
        bi.j9 j9Var = this.d0;
        TextPaint textPaint5 = this.x1;
        ImageReceiver imageReceiver = this.I;
        if (!d && this.G0 == null && L(messageObject)) {
            this.Z0 = this.a1 - AndroidUtilities.dp(106.0f);
            if (N()) {
                i16 = G(messageObject);
                float f15 = (this.V - i16) / 2.0f;
                float dp3 = AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O;
                if (messageObject.isStoryMention()) {
                    j9Var.d = messageObject.messageOwner.media.storyItem;
                }
                float f16 = i16;
                j9Var.F.set(f15, dp3, f15 + f16, f16 + dp3);
                int i17 = messageObject.type;
                if (i17 == 31 || i17 == 33 || i17 == 34 || i17 == 35) {
                    f15 += AndroidUtilities.dp(10.0f);
                    dp3 += AndroidUtilities.dp(10.0f);
                    i16 -= AndroidUtilities.dp(20.0f);
                }
                if (messageObject.type == 37) {
                    f15 += AndroidUtilities.dp(2.0f);
                }
                imageReceiver.setImageCoords(f15, dp3, Math.max(0, i16), Math.max(0, i16));
                int i18 = messageObject.type;
                if (i18 == 31 || i18 == 33 || i18 == 34 || i18 == 35) {
                    i16 = AndroidUtilities.dp(20.0f) + i16;
                }
            } else {
                int i19 = messageObject.type;
                if (i19 == 11) {
                    int i20 = this.V;
                    float f17 = this.Z0;
                    imageReceiver.setImageCoords((i20 - r4) / 2.0f, (this.a1 * 0.075f) + this.S + this.O, f17, f17);
                } else {
                    if (i19 == 25) {
                        i16 = (int) (this.Z0 * (AndroidUtilities.isTablet() ? 1.0f : 1.2f));
                        float f18 = i16;
                        imageReceiver.setImageCoords((this.V - i16) / 2.0f, ((this.a1 * 0.075f) + (this.S + this.O)) - AndroidUtilities.dp(22.0f), f18, f18);
                    } else if (messageObject.isStarGiftAction()) {
                        float f19 = i16;
                        imageReceiver.setImageCoords((this.V - i16) / 2.0f, (this.a1 * 0.075f) + this.S + this.O + AndroidUtilities.dp(2.0f), f19, f19);
                    } else if (messageObject.type == 30) {
                        i16 = (int) (this.Z0 * 1.1f);
                        TLRPC.Message message = messageObject.messageOwner;
                        if (message == null || (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                            float f20 = i16;
                            imageReceiver.setImageCoords((this.V - i16) / 2.0f, ((this.a1 * 0.075f) + (this.S + this.O)) - AndroidUtilities.dp(12.0f), f20, f20);
                        } else {
                            float f21 = i16;
                            imageReceiver.setImageCoords((this.V - i16) / 2.0f, ((this.a1 * 0.075f) + (this.S + this.O)) - AndroidUtilities.dp(22.0f), f21, f21);
                        }
                    } else {
                        i16 = (int) (this.Z0 * 1.0f);
                        float f22 = i16;
                        imageReceiver.setImageCoords((this.V - i16) / 2.0f, ((this.a1 * 0.075f) + (this.S + this.O)) - AndroidUtilities.dp(4.0f), f22, f22);
                    }
                    textPaint4 = (TextPaint) H("paintChatActionText");
                    this.s0 = textPaint4;
                    if (textPaint4 != null) {
                        TextPaint textPaint6 = this.w1;
                        if (textPaint6 != null && textPaint6.getColor() != this.s0.getColor()) {
                            this.w1.setColor(this.s0.getColor());
                        }
                        TextPaint textPaint7 = this.y1;
                        if (textPaint7 != null && textPaint7.getColor() != this.s0.getColor()) {
                            textPaint7.setColor(this.s0.getColor());
                            textPaint7.linkColor = this.s0.getColor();
                        }
                        if (textPaint5 != null && textPaint5.getColor() != this.s0.getColor()) {
                            textPaint5.setColor(this.s0.getColor());
                            textPaint5.linkColor = this.s0.getColor();
                        }
                    }
                }
            }
            textPaint4 = (TextPaint) H("paintChatActionText");
            this.s0 = textPaint4;
            if (textPaint4 != null) {
            }
        }
        int i21 = i16;
        y(canvas3, false);
        boolean d10 = y3Var.d();
        RadialProgress2 radialProgress22 = this.B1;
        if (d10) {
            canvas3.save();
            float width = (getWidth() - y3Var.c()) / 2.0f;
            this.D0 = width;
            float dp4 = y3Var.p ? AndroidUtilities.dp(4.0f) : AndroidUtilities.dp(16.0f) + this.S + this.O;
            this.E0 = dp4;
            canvas3.translate(width, dp4);
            y3Var.a(canvas3);
            t0 t0Var2 = this.X0;
            if (t0Var2 == null || t0Var2.f()) {
                y3Var.b(canvas3);
            }
            canvas3.restore();
        } else if (this.G0 != null) {
            canvas3.save();
            this.G0.a(canvas3);
            canvas3.restore();
        } else if (L(messageObject) || (messageObject != null && messageObject.type == 11)) {
            yh.e1 e1Var = this.K0;
            if (e1Var != null && ((i10 = messageObject.type) == 31 || i10 == 37 || i10 == 33)) {
                e1Var.setBounds((int) (imageReceiver.getImageX() - AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageY() - AndroidUtilities.dp(14.0f)), (int) (imageReceiver.getImageWidth() + imageReceiver.getImageX() + AndroidUtilities.dp(13.33f)), (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(14.0f)));
                this.K0.draw(canvas3);
            }
            if (this.J != null) {
                canvas3.save();
                canvas3.translate(imageReceiver.getImageX(), imageReceiver.getImageY());
                Path path = this.K;
                if (path == null) {
                    this.K = new Path();
                } else {
                    path.rewind();
                }
                this.K.addCircle(imageReceiver.getImageWidth() / 2.0f, imageReceiver.getImageHeight() / 2.0f, imageReceiver.getImageWidth() / 2.0f, Path.Direction.CW);
                canvas3.clipPath(this.K);
                this.J.setBounds(0, 0, (int) imageReceiver.getImageWidth(), (int) imageReceiver.getImageHeight());
                this.J.draw(canvas3);
                canvas3.restore();
            } else if (messageObject.isStoryMention()) {
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                long j3 = messageMedia.user_id;
                j9Var.c = messageMedia.id;
                bi.p9.h(j3, canvas3, imageReceiver, j9Var);
            } else {
                imageReceiver.draw(canvas3);
            }
            if (messageObject.type == 37) {
                yf.p.a(canvas3, org.telegram.ui.ActionBar.j6.S0, imageReceiver.getImageX() + AndroidUtilities.dp(26.0f), imageReceiver.getImageY() + AndroidUtilities.dp(26.0f), AndroidUtilities.dp(52.0f));
            }
            radialProgress22.a.set(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageWidth() + imageReceiver.getImageX(), imageReceiver.getImageHeight() + imageReceiver.getImageY());
            int i22 = messageObject.type;
            if (i22 == 21) {
                u40 u40Var = MessagesController.getInstance(this.H).photoSuggestion.get(messageObject.messageOwner.local_id);
                if (u40Var != null) {
                    radialProgress22.o(u40Var.W, true);
                    radialProgress22.setCircleRadius(((int) (imageReceiver.getImageWidth() * 0.5f)) + 1);
                    radialProgress22.G = AndroidUtilities.dp(24.0f);
                    radialProgress22.g(org.telegram.ui.ActionBar.j6.le, org.telegram.ui.ActionBar.j6.me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.oe);
                    if (u40Var.W == 1.0f) {
                        radialProgress22.setIcon(4, true, true);
                    } else {
                        radialProgress22.setIcon(3, true, true);
                    }
                }
                radialProgress22.draw(canvas3);
            } else if (i22 == 22) {
                float I = I(messageObject);
                radialProgress22.o(I, true);
                radialProgress22.setCircleRadius(AndroidUtilities.dp(26.0f));
                radialProgress22.G = AndroidUtilities.dp(24.0f);
                radialProgress22.g(org.telegram.ui.ActionBar.j6.le, org.telegram.ui.ActionBar.j6.me, org.telegram.ui.ActionBar.j6.ne, org.telegram.ui.ActionBar.j6.oe);
                if (I == 1.0f) {
                    radialProgress22.setIcon(4, true, true);
                } else {
                    radialProgress22.setIcon(3, true, true);
                }
                radialProgress22.draw(canvas3);
                textPaint = this.s0;
                arrayList = this.p0;
                if (textPaint != null || this.M == null) {
                    radialProgress2 = radialProgress22;
                    textPaint2 = textPaint5;
                    i11 = 22;
                } else {
                    canvas3.save();
                    canvas3.translate(this.T, this.S);
                    if (this.M.getPaint() != this.s0) {
                        r();
                    }
                    canvas3.save();
                    wh.h.d(canvas3, arrayList);
                    wh.h.f(canvas3, this.M);
                    t0 t0Var3 = this.X0;
                    if (t0Var3 == null || t0Var3.f()) {
                        StaticLayout staticLayout2 = this.M;
                        textPaint2 = textPaint5;
                        radialProgress2 = radialProgress22;
                        i11 = 22;
                        org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, staticLayout2, this.r0, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout2 == null ? null : F(staticLayout2.getPaint().getColor()));
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
                        wh.h hVar = (wh.h) obj;
                        hVar.h(this.M.getPaint().getColor());
                        hVar.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (this.s0 != null && this.P != null) {
                    canvas3.save();
                    canvas3.translate(this.U, this.S - this.Q);
                    if (this.P.getPaint() != this.s0) {
                        r();
                    }
                    canvas3.save();
                    wh.h.d(canvas3, arrayList);
                    wh.h.f(canvas3, this.P);
                    t0Var = this.X0;
                    if (t0Var != null || t0Var.f()) {
                        StaticLayout staticLayout3 = this.P;
                        org.telegram.ui.Components.v5 v5Var = this.r0;
                        StaticLayout staticLayout4 = this.M;
                        org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, staticLayout3, v5Var, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout4 != null ? null : F(staticLayout4.getPaint().getColor()));
                        canvas3 = canvas;
                    }
                    canvas3.restore();
                    size = arrayList.size();
                    i15 = 0;
                    while (i15 < size) {
                        Object obj2 = arrayList.get(i15);
                        i15++;
                        wh.h hVar2 = (wh.h) obj2;
                        hVar2.h(this.P.getPaint().getColor());
                        hVar2.draw(canvas3);
                    }
                    canvas3.restore();
                }
                if (y3Var.d() && L(messageObject)) {
                    canvas3.save();
                    float f23 = (this.V - this.a1) / 2.0f;
                    if (messageObject.type != i11) {
                        f23 += AndroidUtilities.dp(8.0f);
                    }
                    float f24 = f23;
                    if (N()) {
                        RectF rectF = this.E1;
                        float dp5 = rectF != null ? rectF.top : AndroidUtilities.dp(4.0f) + this.S + this.O;
                        if (i21 > 0) {
                            f7 = 16.0f;
                            dp2 = org.telegram.messenger.w1.D(16.0f, 2, i21);
                        } else {
                            f7 = 16.0f;
                            dp2 = AndroidUtilities.dp(16.0f);
                        }
                        f10 = dp5 + dp2;
                    } else {
                        f7 = 16.0f;
                        float f25 = (this.a1 * 0.075f) + this.S + this.O;
                        if (messageObject.type != 21) {
                            i21 = this.Z0;
                        }
                        float dp6 = f25 + i21 + AndroidUtilities.dp(4.0f);
                        if (messageObject.type == 21) {
                            dp6 += AndroidUtilities.dp(16.0f);
                        }
                        f10 = dp6;
                        if (messageObject.isStarGiftAction()) {
                            f10 += AndroidUtilities.dp(12.0f);
                        } else if (messageObject.type == 30 && !messageObject.isStarGiftAction()) {
                            f10 -= AndroidUtilities.dp(3.66f);
                        }
                    }
                    int i24 = messageObject.type;
                    if (i24 == 31 || i24 == 37 || i24 == 33) {
                        f10 -= AndroidUtilities.dp(3.66f);
                    }
                    canvas3.translate(f24, f10);
                    if (this.b1 != null) {
                        canvas3.save();
                        canvas3.translate(((this.a1 - AndroidUtilities.dp(f7)) - this.b1.getWidth()) / 2.0f, 0.0f);
                        this.b1.draw(canvas3);
                        canvas3.restore();
                        float height = this.b1.getHeight() + f10;
                        if (this.e1 != null) {
                            canvas3.save();
                            canvas3.translate(((this.a1 - AndroidUtilities.dp(f7)) - this.e1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + this.b1.getHeight());
                            this.e1.draw(canvas3);
                            canvas3.restore();
                            height += AndroidUtilities.dp(10.0f) + this.e1.getHeight();
                        }
                        dp = height + AndroidUtilities.dp(messageObject.type == 25 ? 6.0f : 0.0f);
                    } else {
                        dp = f10 - AndroidUtilities.dp(4.0f);
                    }
                    float f26 = dp;
                    canvas3.restore();
                    if (this.b1 == null || (f01Var2 = this.d1) == null) {
                        canvas2 = canvas3;
                        f11 = 0.0f;
                    } else {
                        float l4 = f01Var2.l() + AndroidUtilities.dp(12.0f);
                        float A = com.google.android.gms.internal.vision.e2.A(this.a1 - AndroidUtilities.dp(f7), l4, 2.0f, f24);
                        float height2 = f10 + this.b1.getHeight() + AndroidUtilities.dp(14.0f);
                        if (this.c1 == null) {
                            this.c1 = new Paint(1);
                        }
                        this.c1.setColor(org.telegram.ui.ActionBar.j6.e1() ? 285212671 : TLObject.FLAG_28);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(A, height2 - AndroidUtilities.dp(8.0f), l4 + A, AndroidUtilities.dp(8.0f) + height2);
                        canvas3.drawRoundRect(rectF2, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.c1);
                        Canvas canvas4 = canvas3;
                        f11 = 0.0f;
                        this.d1.c(A + AndroidUtilities.dp(6.0f), height2, 1.0f, -855638017, canvas4);
                        canvas2 = canvas4;
                        f26 += AndroidUtilities.dp(24.0f);
                    }
                    float dp7 = f26 + AndroidUtilities.dp(4.0f);
                    if (messageObject.type == 18) {
                        dp7 += AndroidUtilities.dp(2.0f);
                    }
                    float f27 = dp7;
                    canvas2.save();
                    canvas2.translate(f24, f27);
                    if (messageObject.type == i11) {
                        RadialProgress2 radialProgress23 = radialProgress2;
                        if ((radialProgress23.c ? radialProgress23.j : radialProgress23.i).b() == 1.0f) {
                            i12 = 4;
                            if (radialProgress23.a() == 4) {
                                if (this.k1 != null) {
                                    canvas2.save();
                                    canvas2.translate((this.a1 - ((StaticLayout) this.k1.f).getWidth()) / 2.0f, f11);
                                    this.k1.b = ((this.a1 - ((StaticLayout) r3.f).getWidth()) / 2.0f) + f24;
                                    this.k1.e = f27;
                                    int color = textPaint2.getColor();
                                    u0 u0Var2 = this.k1;
                                    f12 = 8.0f;
                                    f13 = 16.0f;
                                    wh.h.g(this, false, color, 0, (AtomicReference) u0Var2.g, 1, (StaticLayout) u0Var2.f, u0Var2.c, canvas, false);
                                    u0 u0Var3 = this.k1;
                                    org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, (StaticLayout) u0Var3.f, (org.telegram.ui.Components.v5) u0Var3.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, F(textPaint2.getColor()));
                                    canvas3 = canvas;
                                    canvas3.restore();
                                    w0Var = this;
                                } else {
                                    f12 = 8.0f;
                                    f13 = 16.0f;
                                    w0Var = this;
                                    canvas3 = canvas2;
                                }
                                canvas3.restore();
                                if (w0Var.b1 == null) {
                                    AndroidUtilities.dp(f12);
                                }
                                u0Var = w0Var.k1;
                                if (u0Var != null) {
                                    AndroidUtilities.lerp(w0Var.h1, ((StaticLayout) u0Var.f).getHeight(), e7);
                                }
                                staticLayout = w0Var.p1;
                                if (staticLayout != null) {
                                    staticLayout.getHeight();
                                }
                                w0Var.getHeight();
                                AndroidUtilities.dp(f12);
                                f6Var = w0Var.Y0;
                                if (f6Var == null) {
                                    f6Var.l(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(4.0f), w0Var.getMeasuredWidth(), w0Var.v0);
                                } else {
                                    org.telegram.ui.ActionBar.j6.q(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(4.0f), w0Var.getMeasuredWidth(), w0Var.v0);
                                }
                                float a10 = w0Var.n.a(0.02f);
                                canvas3.save();
                                RectF rectF3 = w0Var.o0;
                                canvas3.scale(a10, a10, rectF3.centerX(), rectF3.centerY());
                                if (w0Var.p1 != null) {
                                    canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), w0Var.H("paintChatActionBackgroundSelected"));
                                    if (w0Var.J()) {
                                        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), w0Var.H("paintChatActionBackgroundDarken"));
                                    }
                                    float f28 = w0Var.S1;
                                    Paint paint = w0Var.T1;
                                    if (f28 > 0.0f) {
                                        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                    }
                                    if (w0Var.getMessageObject().type == 31 || w0Var.getMessageObject().type == 37 || w0Var.getMessageObject().type == 33) {
                                        boolean a11 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.e1();
                                        int color2 = paint.getColor();
                                        paint.setColor(a11 ? 620756991 : TLObject.FLAG_28);
                                        canvas3.drawRoundRect(rectF3, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), paint);
                                        paint.setColor(color2);
                                    }
                                    if (w0Var.getMessageObject().type == 31 || w0Var.getMessageObject().type == 37 || w0Var.getMessageObject().type == 33 || w0Var.getMessageObject().type == 21 || w0Var.getMessageObject().type == 22 || w0Var.getMessageObject().type == 24) {
                                        w0Var.invalidate();
                                    } else {
                                        Path path2 = w0Var.M1;
                                        path2.rewind();
                                        path2.addRoundRect(rectF3, AndroidUtilities.dp(f13), AndroidUtilities.dp(f13), Path.Direction.CW);
                                        canvas3.save();
                                        canvas3.clipPath(path2);
                                        w0Var.N1.d(canvas3);
                                        if (!w0Var.N1.g) {
                                            w0Var.invalidate();
                                        }
                                        canvas3.restore();
                                    }
                                }
                                z10 = messageObject.settingAvatar;
                                if (z10) {
                                    float f29 = w0Var.c0;
                                    if (f29 != 1.0f) {
                                        w0Var.c0 = f29 + 0.10666667f;
                                        f14 = 0.0f;
                                        clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                                        w0Var.c0 = clamp;
                                        if (clamp != f14) {
                                            if (w0Var.b0 == null) {
                                                w0Var.b0 = new RadialProgressView(w0Var.getContext());
                                            }
                                            int dp8 = AndroidUtilities.dp(f13);
                                            canvas3.save();
                                            float f30 = w0Var.c0;
                                            canvas3.scale(f30, f30, rectF3.centerX(), rectF3.centerY());
                                            w0Var.b0.setSize(dp8);
                                            w0Var.b0.setProgressColor(org.telegram.ui.ActionBar.j6.u0(org.telegram.ui.ActionBar.j6.ic));
                                            w0Var.b0.a(canvas3, rectF3.centerX(), rectF3.centerY());
                                            canvas3.restore();
                                        }
                                        if (w0Var.c0 != 1.0f && w0Var.p1 != null) {
                                            canvas3.save();
                                            float f31 = 1.0f - w0Var.c0;
                                            canvas3.scale(f31, f31, rectF3.centerX(), rectF3.centerY());
                                            canvas3.translate(f24, rectF3.top + AndroidUtilities.dp(7.0f));
                                            canvas3.translate(((w0Var.a1 - AndroidUtilities.dp(f13)) - w0Var.p1.getWidth()) / 2.0f, 0.0f);
                                            w0Var.p1.draw(canvas3);
                                            canvas3.restore();
                                        }
                                        if (messageObject.flickerLoading) {
                                            h90 h90Var = w0Var.r;
                                            if (h90Var != null) {
                                                h90Var.d(rectF3);
                                                w0Var.r.j(16.0f);
                                                w0Var.r.a();
                                                w0Var.r.draw(canvas3);
                                                if (w0Var.r.b()) {
                                                    w0Var.r.b = -1L;
                                                }
                                            }
                                        } else {
                                            if (w0Var.r == null) {
                                                h90 h90Var2 = new h90(f6Var);
                                                w0Var.r = h90Var2;
                                                h90Var2.g();
                                                h90 h90Var3 = w0Var.r;
                                                h90Var3.C = true;
                                                h90Var3.f(org.telegram.ui.ActionBar.j6.l1(0.08f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
                                                w0Var.r.w.setStrokeWidth(AndroidUtilities.dp(1.0f));
                                            }
                                            h90 h90Var4 = w0Var.r;
                                            h90Var4.c = -1L;
                                            h90Var4.d(rectF3);
                                            w0Var.r.j(16.0f);
                                            w0Var.r.draw(canvas3);
                                        }
                                        canvas3.restore();
                                        if (w0Var.E1 != null && w0Var.J1 != null && w0Var.K1 != null) {
                                            H = w0Var.H("paintChatActionBackground");
                                            Paint H2 = w0Var.H("paintChatActionBackgroundDarken");
                                            float dp9 = (w0Var.E1.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                            float dp10 = w0Var.E1.top - AndroidUtilities.dp(2.0f);
                                            if (f6Var == null) {
                                                f6Var.l(w0Var.u0 + dp9, w0Var.t0 + AndroidUtilities.dp(4.0f) + dp10, w0Var.getMeasuredWidth(), w0Var.v0);
                                            } else {
                                                org.telegram.ui.ActionBar.j6.q(w0Var.u0 + dp9, w0Var.t0 + AndroidUtilities.dp(4.0f) + dp10, w0Var.getMeasuredWidth(), w0Var.v0);
                                            }
                                            canvas3.save();
                                            canvas3.translate(dp9, dp10);
                                            ColorFilter colorFilter = H.getColorFilter();
                                            PathEffect pathEffect = H.getPathEffect();
                                            a2 = f6Var == null ? f6Var.a() : org.telegram.ui.ActionBar.j6.e1();
                                            if (w0Var.H1 != null || w0Var.G1 != a2) {
                                                colorMatrix = new ColorMatrix();
                                                if ((H.getColorFilter() instanceof ColorMatrixColorFilter) && Build.VERSION.SDK_INT >= 26) {
                                                    ((ColorMatrixColorFilter) H.getColorFilter()).getColorMatrix(colorMatrix);
                                                }
                                                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !a2 ? 0.1f : -0.08f);
                                                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !a2 ? 0.15f : 0.1f);
                                                w0Var.H1 = new ColorMatrixColorFilter(colorMatrix);
                                                w0Var.G1 = a2;
                                            }
                                            H.setColorFilter(w0Var.H1);
                                            H.setPathEffect(w0Var.I1);
                                            canvas3.drawPath(w0Var.J1, H);
                                            H.setColorFilter(colorFilter);
                                            H.setPathEffect(pathEffect);
                                            if (w0Var.J()) {
                                                PathEffect pathEffect2 = H2.getPathEffect();
                                                H2.setPathEffect(w0Var.I1);
                                                canvas3.drawPath(w0Var.J1, H2);
                                                H2.setPathEffect(pathEffect2);
                                            }
                                            canvas3.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                            w0Var.K1.c(AndroidUtilities.dp(40.43f) - (w0Var.K1.h() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas3);
                                            canvas3.restore();
                                        }
                                    }
                                }
                                if (!z10) {
                                    float f32 = w0Var.c0;
                                    f14 = 0.0f;
                                    if (f32 != 0.0f) {
                                        w0Var.c0 = f32 - 0.10666667f;
                                    }
                                    clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                                    w0Var.c0 = clamp;
                                    if (clamp != f14) {
                                    }
                                    if (w0Var.c0 != 1.0f) {
                                        canvas3.save();
                                        float f312 = 1.0f - w0Var.c0;
                                        canvas3.scale(f312, f312, rectF3.centerX(), rectF3.centerY());
                                        canvas3.translate(f24, rectF3.top + AndroidUtilities.dp(7.0f));
                                        canvas3.translate(((w0Var.a1 - AndroidUtilities.dp(f13)) - w0Var.p1.getWidth()) / 2.0f, 0.0f);
                                        w0Var.p1.draw(canvas3);
                                        canvas3.restore();
                                    }
                                    if (messageObject.flickerLoading) {
                                    }
                                    canvas3.restore();
                                    if (w0Var.E1 != null) {
                                        H = w0Var.H("paintChatActionBackground");
                                        Paint H22 = w0Var.H("paintChatActionBackgroundDarken");
                                        float dp92 = (w0Var.E1.right - AndroidUtilities.dp(65.0f)) + AndroidUtilities.dp(2.0f);
                                        float dp102 = w0Var.E1.top - AndroidUtilities.dp(2.0f);
                                        if (f6Var == null) {
                                        }
                                        canvas3.save();
                                        canvas3.translate(dp92, dp102);
                                        ColorFilter colorFilter2 = H.getColorFilter();
                                        PathEffect pathEffect3 = H.getPathEffect();
                                        if (f6Var == null) {
                                        }
                                        if (w0Var.H1 != null) {
                                        }
                                        colorMatrix = new ColorMatrix();
                                        if (H.getColorFilter() instanceof ColorMatrixColorFilter) {
                                            ((ColorMatrixColorFilter) H.getColorFilter()).getColorMatrix(colorMatrix);
                                        }
                                        AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, !a2 ? 0.1f : -0.08f);
                                        AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, !a2 ? 0.15f : 0.1f);
                                        w0Var.H1 = new ColorMatrixColorFilter(colorMatrix);
                                        w0Var.G1 = a2;
                                        H.setColorFilter(w0Var.H1);
                                        H.setPathEffect(w0Var.I1);
                                        canvas3.drawPath(w0Var.J1, H);
                                        H.setColorFilter(colorFilter2);
                                        H.setPathEffect(pathEffect3);
                                        if (w0Var.J()) {
                                        }
                                        canvas3.rotate(45.0f, AndroidUtilities.dp(40.43f), AndroidUtilities.dp(24.56f));
                                        w0Var.K1.c(AndroidUtilities.dp(40.43f) - (w0Var.K1.h() / 2.0f), AndroidUtilities.dp(26.0f), 1.0f, -1, canvas3);
                                        canvas3.restore();
                                    }
                                }
                                f14 = 0.0f;
                                clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                                w0Var.c0 = clamp;
                                if (clamp != f14) {
                                }
                                if (w0Var.c0 != 1.0f) {
                                }
                                if (messageObject.flickerLoading) {
                                }
                                canvas3.restore();
                                if (w0Var.E1 != null) {
                                }
                            }
                        } else {
                            i12 = 4;
                        }
                        canvas3 = canvas2;
                        f12 = 8.0f;
                        f13 = 16.0f;
                        if (this.s1 == null) {
                            TextPaint textPaint8 = new TextPaint();
                            this.r1 = textPaint8;
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
                                vb vbVar = new vb();
                                vbVar.r = true;
                                vbVar.a(this);
                                spannableString.setSpan(vbVar, 0, spannableString.length(), 33);
                                spannableStringBuilder.replace(indexOf, i14 + indexOf, (CharSequence) spannableString);
                            }
                            TextPaint textPaint9 = this.r1;
                            u0 u0Var4 = this.k1;
                            this.s1 = new StaticLayout(spannableStringBuilder, textPaint9, u0Var4 == null ? 1 : u0Var4.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        }
                        float I2 = I(messageObject);
                        if (this.u1 == null || this.t1 != I2) {
                            this.t1 = I2;
                            String n10 = a4.a.n((int) (I2 * 100.0f), "%", new StringBuilder());
                            u0 u0Var5 = this.k1;
                            TextPaint textPaint10 = textPaint2;
                            textPaint3 = textPaint10;
                            this.u1 = new StaticLayout(n10, textPaint10, u0Var5 == null ? 1 : u0Var5.d, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        } else {
                            textPaint3 = textPaint2;
                        }
                        this.r1.setColor(textPaint3.getColor());
                        if (radialProgress23.a() == i12) {
                            float b10 = (radialProgress23.c ? radialProgress23.j : radialProgress23.i).b();
                            int color3 = textPaint3.getColor();
                            float f33 = 1.0f - b10;
                            this.r1.setAlpha((int) (Color.alpha(color3) * f33));
                            textPaint3.setAlpha((int) (Color.alpha(color3) * b10));
                            textPaint3.linkColor = textPaint3.getColor();
                            if (this.k1 != null) {
                                float f34 = (b10 * 0.2f) + 0.8f;
                                canvas3.save();
                                canvas3.scale(f34, f34, this.a1 / 2.0f, ((StaticLayout) this.k1.f).getHeight() / 2.0f);
                                canvas3.translate((this.a1 - ((StaticLayout) this.k1.f).getWidth()) / 2.0f, 0.0f);
                                this.k1.b = ((this.a1 - ((StaticLayout) r0.f).getWidth()) / 2.0f) + f24;
                                this.k1.e = f27;
                                int color4 = textPaint3.getColor();
                                u0 u0Var6 = this.k1;
                                i13 = color3;
                                wh.h.g(this, false, color4, 0, (AtomicReference) u0Var6.g, 1, (StaticLayout) u0Var6.f, u0Var6.c, canvas3, false);
                                u0 u0Var7 = this.k1;
                                w0Var2 = this;
                                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, (StaticLayout) u0Var7.f, (org.telegram.ui.Components.v5) u0Var7.h, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, F(textPaint3.getColor()));
                                canvas3 = canvas;
                                canvas3.restore();
                            } else {
                                w0Var2 = this;
                                i13 = color3;
                            }
                            textPaint3.setAlpha((int) (Color.alpha(i13) * f33));
                            textPaint3.linkColor = textPaint3.getColor();
                            float f35 = (f33 * 0.2f) + 0.8f;
                            canvas3.save();
                            canvas3.scale(f35, f35, w0Var2.a1 / 2.0f, w0Var2.s1.getHeight() / 2.0f);
                            canvas3.translate((w0Var2.a1 - w0Var2.s1.getWidth()) / 2.0f, 0.0f);
                            wh.h.f(canvas3, w0Var2.s1);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.translate(0.0f, AndroidUtilities.dp(4.0f) + w0Var2.s1.getHeight());
                            canvas3.scale(f35, f35, w0Var2.a1 / 2.0f, w0Var2.u1.getHeight() / 2.0f);
                            canvas3.translate((w0Var2.a1 - w0Var2.u1.getWidth()) / 2.0f, 0.0f);
                            wh.h.f(canvas3, w0Var2.u1);
                            canvas3.restore();
                            textPaint3.setColor(i13);
                            textPaint3.linkColor = i13;
                        } else {
                            w0Var2 = this;
                            canvas3.save();
                            canvas3.translate((w0Var2.a1 - w0Var2.s1.getWidth()) / 2.0f, 0.0f);
                            w0Var2.s1.draw(canvas3);
                            canvas3.restore();
                            canvas3.save();
                            canvas3.translate((w0Var2.a1 - w0Var2.u1.getWidth()) / 2.0f, AndroidUtilities.dp(4.0f) + w0Var2.s1.getHeight());
                            wh.h.f(canvas3, w0Var2.u1);
                            canvas3.restore();
                        }
                        w0Var = w0Var2;
                        canvas3.restore();
                        if (w0Var.b1 == null) {
                        }
                        u0Var = w0Var.k1;
                        if (u0Var != null) {
                        }
                        staticLayout = w0Var.p1;
                        if (staticLayout != null) {
                        }
                        w0Var.getHeight();
                        AndroidUtilities.dp(f12);
                        f6Var = w0Var.Y0;
                        if (f6Var == null) {
                        }
                        float a102 = w0Var.n.a(0.02f);
                        canvas3.save();
                        RectF rectF32 = w0Var.o0;
                        canvas3.scale(a102, a102, rectF32.centerX(), rectF32.centerY());
                        if (w0Var.p1 != null) {
                        }
                        z10 = messageObject.settingAvatar;
                        if (z10) {
                        }
                        if (!z10) {
                        }
                        f14 = 0.0f;
                        clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                        w0Var.c0 = clamp;
                        if (clamp != f14) {
                        }
                        if (w0Var.c0 != 1.0f) {
                        }
                        if (messageObject.flickerLoading) {
                        }
                        canvas3.restore();
                        if (w0Var.E1 != null) {
                        }
                    } else {
                        w0Var2 = this;
                        canvas3 = canvas2;
                        TextPaint textPaint11 = textPaint2;
                        f12 = 8.0f;
                        f13 = 16.0f;
                        u0 u0Var8 = w0Var2.k1;
                        if (u0Var8 != null) {
                            float height3 = ((StaticLayout) u0Var8.f).getHeight();
                            if (e7 < 1.0f) {
                                height3 = AndroidUtilities.lerp(w0Var2.h1, height3, e7);
                                RectF rectF4 = AndroidUtilities.rectTmp;
                                rectF4.set(0.0f, -AndroidUtilities.dp(20.0f), w0Var2.getWidth(), height3);
                                canvas3.saveLayerAlpha(rectF4, 255, 31);
                            } else {
                                canvas3.save();
                            }
                            canvas3.translate(((w0Var2.a1 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) w0Var2.k1.f).getWidth()) / 2.0f, 0.0f);
                            w0Var2.k1.b = (((w0Var2.a1 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) w0Var2.k1.f).getWidth()) / 2.0f) + f24;
                            u0 u0Var9 = w0Var2.k1;
                            u0Var9.e = f27;
                            int color5 = u0Var9.a.getColor();
                            u0 u0Var10 = w0Var2.k1;
                            float f36 = height3;
                            wh.h.g(w0Var2, false, color5, 0, (AtomicReference) u0Var10.g, 1, (StaticLayout) u0Var10.f, u0Var10.c, canvas3, false);
                            u0 u0Var11 = w0Var2.k1;
                            StaticLayout staticLayout5 = (StaticLayout) u0Var11.f;
                            org.telegram.ui.Components.v5 v5Var2 = (org.telegram.ui.Components.v5) u0Var11.h;
                            ColorFilter F = w0Var2.F(textPaint11.getColor());
                            w0Var = w0Var2;
                            org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, staticLayout5, v5Var2, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, F);
                            canvas3 = canvas;
                            if (e7 < 1.0f && w0Var.o1 != null) {
                                canvas3.save();
                                if (w0Var.j1 == null) {
                                    w0Var.j1 = new l20();
                                }
                                canvas3.translate((-((w0Var.a1 - AndroidUtilities.dp(16.0f)) - ((StaticLayout) w0Var.k1.f).getWidth())) / 2.0f, 0.0f);
                                RectF rectF5 = AndroidUtilities.rectTmp;
                                rectF5.set((w0Var.l1 - w0Var.o1.h()) + AndroidUtilities.dp(8.0f), (w0Var.m1 - w0Var.n1) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + w0Var.l1, w0Var.m1);
                                float f37 = 1.0f - e7;
                                w0Var.j1.a(canvas3, rectF5, f37);
                                rectF5.set((w0Var.l1 - w0Var.o1.h()) - AndroidUtilities.dp(16.0f), (w0Var.m1 - w0Var.n1) - AndroidUtilities.dp(6.0f), (w0Var.l1 - w0Var.o1.h()) + AndroidUtilities.dp(8.0f), w0Var.m1);
                                w0Var.j1.b(canvas3, rectF5, 2, f37);
                                rectF5.set(0.0f, f36 - AndroidUtilities.dp(12.0f), w0Var.getWidth(), f36);
                                w0Var.j1.b(canvas3, rectF5, 3, (1.0f - f37) * f37 * 4.0f);
                                canvas3.restore();
                            }
                            canvas3.restore();
                            if (e7 < 1.0f && (f01Var = w0Var.o1) != null) {
                                f01Var.c((w0Var.l1 - f01Var.h()) + AndroidUtilities.dp(5.0f), (w0Var.m1 - (w0Var.n1 / 2.0f)) - AndroidUtilities.dp(1.0f), 1.0f - e7, w0Var.k1.a.getColor(), canvas3);
                            }
                            canvas3.restore();
                            if (w0Var.b1 == null) {
                            }
                            u0Var = w0Var.k1;
                            if (u0Var != null) {
                            }
                            staticLayout = w0Var.p1;
                            if (staticLayout != null) {
                            }
                            w0Var.getHeight();
                            AndroidUtilities.dp(f12);
                            f6Var = w0Var.Y0;
                            if (f6Var == null) {
                            }
                            float a1022 = w0Var.n.a(0.02f);
                            canvas3.save();
                            RectF rectF322 = w0Var.o0;
                            canvas3.scale(a1022, a1022, rectF322.centerX(), rectF322.centerY());
                            if (w0Var.p1 != null) {
                            }
                            z10 = messageObject.settingAvatar;
                            if (z10) {
                            }
                            if (!z10) {
                            }
                            f14 = 0.0f;
                            clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                            w0Var.c0 = clamp;
                            if (clamp != f14) {
                            }
                            if (w0Var.c0 != 1.0f) {
                            }
                            if (messageObject.flickerLoading) {
                            }
                            canvas3.restore();
                            if (w0Var.E1 != null) {
                            }
                        }
                        w0Var = w0Var2;
                        canvas3.restore();
                        if (w0Var.b1 == null) {
                        }
                        u0Var = w0Var.k1;
                        if (u0Var != null) {
                        }
                        staticLayout = w0Var.p1;
                        if (staticLayout != null) {
                        }
                        w0Var.getHeight();
                        AndroidUtilities.dp(f12);
                        f6Var = w0Var.Y0;
                        if (f6Var == null) {
                        }
                        float a10222 = w0Var.n.a(0.02f);
                        canvas3.save();
                        RectF rectF3222 = w0Var.o0;
                        canvas3.scale(a10222, a10222, rectF3222.centerX(), rectF3222.centerY());
                        if (w0Var.p1 != null) {
                        }
                        z10 = messageObject.settingAvatar;
                        if (z10) {
                        }
                        if (!z10) {
                        }
                        f14 = 0.0f;
                        clamp = Utilities.clamp(w0Var.c0, 1.0f, f14);
                        w0Var.c0 = clamp;
                        if (clamp != f14) {
                        }
                        if (w0Var.c0 != 1.0f) {
                        }
                        if (messageObject.flickerLoading) {
                        }
                        canvas3.restore();
                        if (w0Var.E1 != null) {
                        }
                    }
                } else {
                    w0Var = this;
                }
                w0Var.B(canvas3, false);
                w0Var.i2.a();
                canvas3.restore();
            }
            textPaint = this.s0;
            arrayList = this.p0;
            if (textPaint != null) {
            }
            radialProgress2 = radialProgress22;
            textPaint2 = textPaint5;
            i11 = 22;
            if (this.s0 != null) {
                canvas3.save();
                canvas3.translate(this.U, this.S - this.Q);
                if (this.P.getPaint() != this.s0) {
                }
                canvas3.save();
                wh.h.d(canvas3, arrayList);
                wh.h.f(canvas3, this.P);
                t0Var = this.X0;
                if (t0Var != null) {
                }
                StaticLayout staticLayout32 = this.P;
                org.telegram.ui.Components.v5 v5Var3 = this.r0;
                StaticLayout staticLayout42 = this.M;
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, staticLayout32, v5Var3, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f, staticLayout42 != null ? null : F(staticLayout42.getPaint().getColor()));
                canvas3 = canvas;
                canvas3.restore();
                size = arrayList.size();
                i15 = 0;
                while (i15 < size) {
                }
                canvas3.restore();
            }
            if (y3Var.d()) {
            }
            w0Var = this;
            w0Var.B(canvas3, false);
            w0Var.i2.a();
            canvas3.restore();
        }
        textPaint = this.s0;
        arrayList = this.p0;
        if (textPaint != null) {
        }
        radialProgress2 = radialProgress22;
        textPaint2 = textPaint5;
        i11 = 22;
        if (this.s0 != null) {
        }
        if (y3Var.d()) {
        }
        w0Var = this;
        w0Var.B(canvas3, false);
        w0Var.i2.a();
        canvas3.restore();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        MessageObject messageObject = this.H0;
        if (TextUtils.isEmpty(this.J0) && messageObject == null) {
            return;
        }
        if (this.d2 == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(!TextUtils.isEmpty(this.J0) ? this.J0 : messageObject.messageText);
            for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(characterStyle);
                int spanEnd = spannableStringBuilder.getSpanEnd(characterStyle);
                spannableStringBuilder.removeSpan(characterStyle);
                spannableStringBuilder.setSpan(new i(1, this, characterStyle), spanStart, spanEnd, 33);
            }
            this.d2 = spannableStringBuilder;
        }
        if (Build.VERSION.SDK_INT < 24) {
            accessibilityNodeInfo.setContentDescription(this.d2.toString());
        } else {
            accessibilityNodeInfo.setText(this.d2);
        }
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        RectF rectF = this.o0;
        this.L1.layout((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
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
        float f7;
        float dp;
        float dp2;
        float f10;
        TLRPC.Message message;
        int i13;
        int dp3;
        int i14;
        int dp4;
        int i15;
        MessageObject messageObject = this.H0;
        if (messageObject == null && this.J0 == null) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(14.0f) + this.l0 + this.O);
            return;
        }
        if (L(messageObject)) {
            this.a1 = Math.min((int) (AndroidUtilities.isTablet() ? AndroidUtilities.getMinTabletSide() * 0.6f : (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f)), ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
            if ((!AndroidUtilities.isTablet() && ((i15 = messageObject.type) == 18 || i15 == 30 || M())) || messageObject.type == 35) {
                this.a1 = (int) (this.a1 * 1.2f);
            }
            this.Z0 = this.a1 - AndroidUtilities.dp(106.0f);
            if (messageObject.type == 31) {
                this.a1 = Math.min(this.a1, AndroidUtilities.dp(192.0f));
                this.Z0 = AndroidUtilities.dp(78.0f);
            }
            if (messageObject.type == 33) {
                this.a1 = Math.min(this.a1, AndroidUtilities.dp(220.0f));
                this.Z0 = AndroidUtilities.dp(78.0f);
            }
            int i16 = messageObject.type;
            ImageReceiver imageReceiver = this.I;
            if (i16 == 37) {
                this.Z0 = AndroidUtilities.dp(52.0f);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(14.0f));
            } else if (N()) {
                imageReceiver.setRoundRadius(this.Z0 / 2);
            } else {
                imageReceiver.setRoundRadius(0);
            }
        }
        int max = Math.max(AndroidUtilities.dp(30.0f), View.MeasureSpec.getSize(i10));
        if (this.V != max) {
            this.A0 = true;
            this.V = max;
            r();
        }
        if (messageObject != null) {
            if (messageObject.type == 11) {
                i14 = AndroidUtilities.roundMessageSize;
                dp4 = AndroidUtilities.dp(10.0f);
            } else if (L(messageObject)) {
                i14 = this.a1;
                dp4 = AndroidUtilities.dp(12.0f);
            }
            i12 = dp4 + i14;
            zh.y3 y3Var = this.F0;
            d = y3Var.d();
            ah.k1 k1Var = this.C0;
            if (!d) {
                r9 = org.telegram.messenger.w1.C(8.0f, y3Var.M, y3Var.p ? 0 : AndroidUtilities.dp(16.0f) + this.S + this.O);
                if (!k1Var.s) {
                    dp3 = AndroidUtilities.dp(8.0f) + k1Var.o;
                    k1Var.p = dp3;
                    r9 += dp3;
                }
                if (this.H0 != null && !k1Var.s) {
                    int dp5 = AndroidUtilities.dp(8.0f) + k1Var.o;
                    k1Var.p = dp5;
                    i12 += dp5;
                }
                if (M()) {
                    i12 = org.telegram.messenger.w1.C(24.0f, this.Q, i12);
                }
                if (messageObject == null && N()) {
                    setMeasuredDimension(max, this.l0 + r9);
                } else {
                    setMeasuredDimension(max, AndroidUtilities.dp(14.0f) + this.l0 + this.O + i12);
                }
                k1Var.d = (getMeasuredHeight() - getPaddingTop()) - k1Var.p;
                return;
            }
            gy0 gy0Var = this.G0;
            if (gy0Var != null) {
                r9 = AndroidUtilities.dp(12.0f) + AndroidUtilities.dp(140.0f) + ((int) gy0Var.f.j()) + (gy0Var.i ? AndroidUtilities.dp(40.0f) : 0);
                if (!k1Var.s) {
                    dp3 = AndroidUtilities.dp(8.0f) + k1Var.o;
                    k1Var.p = dp3;
                    r9 += dp3;
                }
            } else if (L(messageObject)) {
                boolean z10 = messageObject != null && messageObject.type == 25;
                int G = G(messageObject);
                if (N()) {
                    f7 = 8.0f;
                    int dp6 = AndroidUtilities.dp(4.0f) + this.S + this.O + (G > 0 ? org.telegram.messenger.w1.D(16.0f, 2, G) : AndroidUtilities.dp(16.0f));
                    u0 u0Var = this.k1;
                    dp = dp6 + (u0Var == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) u0Var.f).getHeight());
                } else {
                    f7 = 8.0f;
                    dp = (this.k1 == null ? 0 : AndroidUtilities.dp(4.0f) + ((StaticLayout) r2.f).getHeight()) + (this.a1 * 0.075f) + this.S + this.O + G + AndroidUtilities.dp(4.0f);
                }
                this.C1 = 0;
                if (this.b1 != null) {
                    float height = dp + r4.getHeight();
                    if (this.b1.getLineCount() > 1) {
                        this.C1 = (this.b1.getHeight() - this.b1.getLineTop(1)) + this.C1;
                    }
                    dp2 = height + AndroidUtilities.dp(z10 ? 6.0f : 0.0f);
                    if (this.e1 != null) {
                        dp2 += AndroidUtilities.dp(9.0f) + r3.getHeight();
                    }
                    if (this.d1 != null) {
                        dp2 += AndroidUtilities.dp(24.0f);
                    }
                } else {
                    dp2 = dp - AndroidUtilities.dp(12.0f);
                    this.C1 -= AndroidUtilities.dp(30.0f);
                }
                u0 u0Var2 = this.k1;
                int height2 = u0Var2 == null ? 0 : ((StaticLayout) u0Var2.f).getHeight();
                if (this.k1 == null) {
                    this.C1 = 0;
                } else if (this.e1 != null) {
                    this.C1 = org.telegram.messenger.w1.C(10.0f, height2, this.C1);
                } else {
                    MessageObject messageObject2 = this.H0;
                    if (messageObject2.type == 18 || messageObject2.isStarGiftAction()) {
                        this.C1 = vl.D(this.p1 == null ? 0.0f : 10.0f, height2, this.C1);
                    } else if (this.H0.type == 30) {
                        this.C1 = vl.D(20.0f, height2, this.C1);
                    } else if (this.g1) {
                        this.C1 += height2;
                    } else if (((StaticLayout) this.k1.f).getLineCount() > 2) {
                        this.C1 = ((((StaticLayout) this.k1.f).getLineCount() * (((StaticLayout) this.k1.f).getLineBottom(0) - ((StaticLayout) this.k1.f).getLineTop(0))) - 2) + this.C1;
                    }
                }
                if (this.d1 != null) {
                    this.C1 = AndroidUtilities.dp(24.0f) + this.C1;
                }
                int dp7 = this.C1 - AndroidUtilities.dp(z10 ? 14.0f : 0.0f);
                this.C1 = dp7;
                i12 += dp7;
                int dp8 = AndroidUtilities.dp(14.0f) + this.O + i12;
                StaticLayout staticLayout = this.p1;
                RectF rectF = this.o0;
                if (staticLayout != null) {
                    float A = com.google.android.gms.internal.vision.e2.A((dp8 - dp2) - staticLayout.getHeight(), AndroidUtilities.dp(f7), 2.0f, dp2);
                    if (this.H0.isStarGiftAction()) {
                        A += AndroidUtilities.dp(4.0f);
                    }
                    float f11 = (this.V - this.v1) / 2.0f;
                    f10 = 2.0f;
                    rectF.set(f11 - AndroidUtilities.dp(18.0f), A - AndroidUtilities.dp(f7), f11 + this.v1 + AndroidUtilities.dp(18.0f), A + (this.p1 != null ? r6.getHeight() : 0) + AndroidUtilities.dp(f7));
                } else {
                    f10 = 2.0f;
                    i12 -= AndroidUtilities.dp(40.0f);
                    this.C1 -= AndroidUtilities.dp(40.0f);
                    MessageObject messageObject3 = this.H0;
                    if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (message.action instanceof TLRPC.TL_messageActionStarGift)) {
                        i12 -= AndroidUtilities.dp(f7);
                        this.C1 -= AndroidUtilities.dp(f7);
                    }
                }
                int measuredWidth = getMeasuredWidth() << (getMeasuredHeight() + 16);
                sg.y1 y1Var = this.N1;
                y1Var.a.set(rectF);
                y1Var.b.set(rectF);
                if (this.O1 != measuredWidth) {
                    this.O1 = measuredWidth;
                    y1Var.f();
                }
                if (N()) {
                    int dp9 = AndroidUtilities.dp(4.0f) + this.S + this.O;
                    this.f = 0;
                    int D = G > 0 ? org.telegram.messenger.w1.D(16.0f, 2, G) : AndroidUtilities.dp(16.0f);
                    this.f = D;
                    StaticLayout staticLayout2 = this.e1;
                    if (staticLayout2 != null) {
                        this.f = org.telegram.messenger.w1.C(10.0f, staticLayout2.getHeight(), D);
                    }
                    if (this.d1 != null) {
                        this.f = AndroidUtilities.dp(15.0f) + this.f;
                    }
                    int i17 = this.f + height2;
                    this.f = i17;
                    float f12 = (this.V - this.v1) / f10;
                    if (this.p1 != null) {
                        this.h = AndroidUtilities.dp(7.0f) + i17 + dp9;
                        rectF.set(f12 - AndroidUtilities.dp(18.0f), this.h, f12 + this.v1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.w1.D(8.0f, 2, this.p1.getHeight() + this.h));
                        this.f = (int) (rectF.height() + AndroidUtilities.dp(4.0f) + this.f);
                    } else if (!M() && (i13 = messageObject.type) != 34 && i13 != 33 && i13 != 35) {
                        rectF.set(f12 - AndroidUtilities.dp(18.0f), this.h, f12 + this.v1 + AndroidUtilities.dp(18.0f), org.telegram.messenger.w1.D(8.0f, 2, AndroidUtilities.dp(17.0f) + this.h));
                        this.f = AndroidUtilities.dp(17.0f) + this.f;
                    }
                    int dp10 = AndroidUtilities.dp(15.0f) + this.f;
                    this.f = dp10;
                    int dp11 = AndroidUtilities.dp(6.0f) + dp9 + dp10;
                    if (!k1Var.s) {
                        int dp12 = AndroidUtilities.dp(8.0f) + k1Var.o;
                        k1Var.p = dp12;
                        dp11 += dp12;
                    }
                    r9 = dp11;
                    if (this.Q1 != null) {
                        r9 += AndroidUtilities.dp(44.0f);
                    }
                }
                rectF.inset(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
            }
            if (this.H0 != null) {
                int dp52 = AndroidUtilities.dp(8.0f) + k1Var.o;
                k1Var.p = dp52;
                i12 += dp52;
            }
            if (M()) {
            }
            if (messageObject == null) {
            }
            setMeasuredDimension(max, AndroidUtilities.dp(14.0f) + this.l0 + this.O + i12);
            k1Var.d = (getMeasuredHeight() - getPaddingTop()) - k1Var.p;
            return;
        }
        i12 = 0;
        zh.y3 y3Var2 = this.F0;
        d = y3Var2.d();
        ah.k1 k1Var2 = this.C0;
        if (!d) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        TLRPC.PhotoSize photoSize;
        MessageObject messageObject = this.H0;
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
        this.I.setImage(this.x0, ImageLoader.AUTOPLAY_FILTER, ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50_b", this.L, 0L, null, messageObject, 1);
        DownloadController.getInstance(this.H).removeLoadingFileObserver(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        u40 u40Var;
        u0 u0Var;
        u0 u0Var2;
        TLRPC.Message message;
        boolean z10;
        int i10;
        BotInlineKeyboard.ButtonCustom buttonCustom;
        MessageObject messageObject;
        TLRPC.Message message2;
        MessageObject messageObject2;
        TLRPC.Message message3;
        TLRPC.Message message4;
        long j3;
        TLObject chat;
        int i11;
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
        int i12;
        MessageObject messageObject3 = this.H0;
        float x10 = motionEvent.getX() - (this.j0 / 2.0f);
        this.y0 = x10;
        float y3 = motionEvent.getY() + getPaddingTop();
        this.z0 = y3;
        if (messageObject3 == null) {
            if (this.V1 != null) {
                if (motionEvent.getAction() == 0) {
                    if (x10 >= this.S0 && x10 <= this.T0) {
                        this.F = true;
                        return true;
                    }
                } else if (this.F) {
                    if (motionEvent.getAction() == 1) {
                        this.V1.onClick(this);
                        this.F = false;
                    } else if (motionEvent.getAction() == 3) {
                        this.F = false;
                    }
                }
            }
            return super.onTouchEvent(motionEvent);
        }
        a21 a21Var = this.n0;
        if (a21Var != null && a21Var.d(motionEvent, false)) {
            return true;
        }
        gy0 gy0Var = this.G0;
        if (gy0Var != null) {
            zc zcVar = gy0Var.m;
            boolean contains = gy0Var.k.contains(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0) {
                zcVar.c(contains);
            } else if (motionEvent.getAction() != 2) {
                if (motionEvent.getAction() == 1) {
                    if (zcVar.h) {
                        gy0Var.b();
                    }
                    zcVar.c(false);
                } else if (motionEvent.getAction() == 3) {
                    zcVar.c(false);
                }
            }
            if (zcVar.h) {
                return true;
            }
        }
        zh.y3 y3Var = this.F0;
        if ((y3Var.d() && y3Var.e(this.D0, this.E0, motionEvent)) || this.C0.c(motionEvent)) {
            return true;
        }
        int action = motionEvent.getAction();
        zf.b bVar = zf.b.a;
        RectF rectF = this.o0;
        ImageReceiver imageReceiver = this.I;
        int i13 = this.H;
        View view = this.L1;
        zc zcVar2 = this.n;
        if (action == 0) {
            if (this.X0 != null) {
                if ((messageObject3.type == 11 || L(messageObject3)) && imageReceiver.isInsideImage(x10, y3)) {
                    this.W = true;
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (this.B1.i.q == 4 && (((i12 = messageObject3.type) == 21 || i12 == 22) && this.E1.contains(x10, y3))) {
                    this.W = true;
                    z13 = true;
                }
                u0 u0Var3 = this.k1;
                if (u0Var3 == null || !this.g1) {
                    z14 = z13;
                } else {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f7 = u0Var3.b;
                    z14 = z13;
                    rectF2.set(f7, u0Var3.e, ((StaticLayout) u0Var3.f).getWidth() + f7, this.k1.e + ((StaticLayout) r1.f).getHeight());
                    if (rectF2.contains(x10, y3)) {
                        this.E = true;
                        z15 = true;
                        if (L(messageObject3) || this.p1 == null || !(rectF.contains(x10, y3) || (this.q1 && this.E1.contains(x10, y3)))) {
                            z16 = true;
                        } else {
                            z16 = true;
                            this.a0 = true;
                            view.setPressed(true);
                            zcVar2.c(true);
                            z15 = true;
                        }
                        if (!z15 && M()) {
                            this.E = z16;
                            z15 = true;
                        }
                        if (!z15) {
                            MessageObject messageObject4 = this.H0;
                            if (zf.d.g((messageObject4 == null || (message5 = messageObject4.messageOwner) == null) ? null : message5.action, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                                this.E = true;
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
                if (L(messageObject3)) {
                }
                z16 = true;
                if (!z15) {
                    this.E = z16;
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
            if (this.F) {
                if (motionEvent.getAction() == 2) {
                    if (x10 < this.S0 || x10 > this.T0) {
                        z10 = false;
                        this.F = false;
                    }
                } else if (motionEvent.getAction() == 1) {
                    View.OnClickListener onClickListener = this.V1;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    this.F = false;
                } else if (motionEvent.getAction() == 3) {
                    this.F = false;
                }
                z10 = false;
            } else {
                if (this.E) {
                    int action2 = motionEvent.getAction();
                    if (action2 == 1) {
                        this.E = false;
                        view.setPressed(false);
                        zcVar2.c(false);
                        if (this.X0 == null || messageObject3.replyMessageObject == null || (message = messageObject3.messageOwner) == null || !zf.d.g(message.action, TLRPC.TL_messageActionTodoAppendTasks.class, TLRPC.TL_messageActionTodoCompletions.class, TLRPC.TL_messageActionSuggestedPostApproval.class, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class)) {
                            if (this.g1 && !this.f1 && (u0Var2 = this.k1) != null) {
                                int height = ((StaticLayout) u0Var2.f).getHeight() - this.h1;
                                this.f1 = true;
                                t0 t0Var = this.X0;
                                if (t0Var == null) {
                                    return true;
                                }
                                t0Var.X(this);
                                if (!(getParent() instanceof ll0)) {
                                    return true;
                                }
                                ((ll0) getParent()).v0(0, AndroidUtilities.dp(24.0f) + height, null);
                                return true;
                            }
                            if (this.G0 != null && this.E1.contains(motionEvent.getX(), motionEvent.getY())) {
                                this.G0.b();
                                return true;
                            }
                        } else {
                            this.X0.K(this, this.H0.getReplyMsgId());
                        }
                    } else if (action2 == 2) {
                        u0 u0Var4 = this.k1;
                        if (u0Var4 == null || !this.g1) {
                            this.E = false;
                        } else {
                            RectF rectF3 = AndroidUtilities.rectTmp;
                            float f10 = u0Var4.b;
                            rectF3.set(f10, u0Var4.e, ((StaticLayout) u0Var4.f).getWidth() + f10, this.k1.e + ((StaticLayout) r9.f).getHeight());
                            if (!rectF3.contains(x10, y3)) {
                                this.E = false;
                            }
                        }
                        z10 = true;
                    } else if (action2 == 3) {
                        this.E = false;
                        zcVar2.c(false);
                    }
                } else if (this.a0) {
                    int action3 = motionEvent.getAction();
                    if (action3 == 1) {
                        this.W = false;
                        this.a0 = false;
                        view.setPressed(false);
                        zcVar2.c(false);
                        if (this.X0 != null) {
                            int i14 = messageObject3.type;
                            if (i14 == 37) {
                                playSoundEffect(0);
                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                if (U != null) {
                                    new gi.k0(U, ((TLRPC.TL_messageActionChangeCommunity) messageObject3.messageOwner.action).community_id, null, null).show();
                                }
                            } else if (i14 == 31) {
                                playSoundEffect(0);
                                S();
                            } else if (i14 == 25) {
                                playSoundEffect(0);
                                if (this.X0 != null) {
                                    AndroidUtilities.runOnUIThread(new na(4, this, (TLRPC.TL_messageActionGiftCode) this.H0.messageOwner.action));
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
                                        MessageSuggestionParams obtainSuggestionOffer = this.H0.obtainSuggestionOffer();
                                        zf.a aVar = obtainSuggestionOffer.amount;
                                        if (aVar != null && aVar.a == bVar) {
                                            new zh.k7(getContext(), this.Y0, obtainSuggestionOffer.amount.a(), 13, og.d.h(i13, this.H0.getDialogId()), null, this.H0.getDialogId()).show();
                                        }
                                    }
                                }
                                if (MessagesController.getInstance(i13).photoSuggestion.get(messageObject3.messageOwner.local_id) == null) {
                                    if (this.q1) {
                                        this.X0.i0(this);
                                    } else {
                                        this.X0.q0(this);
                                    }
                                }
                            }
                        }
                    } else if (action3 != 2) {
                        if (action3 == 3) {
                            this.W = false;
                            this.a0 = false;
                            view.setPressed(false);
                            zcVar2.c(false);
                        }
                    } else if (!L(messageObject3) || (!rectF.contains(x10, y3) && !this.E1.contains(x10, y3))) {
                        this.a0 = false;
                        view.setPressed(false);
                        zcVar2.c(false);
                    }
                } else if (this.W) {
                    int action4 = motionEvent.getAction();
                    if (action4 == 1) {
                        this.W = false;
                        if (this.g1 && !this.f1 && (u0Var = this.k1) != null) {
                            int height2 = ((StaticLayout) u0Var.f).getHeight() - this.h1;
                            this.f1 = true;
                            t0 t0Var2 = this.X0;
                            if (t0Var2 == null) {
                                return true;
                            }
                            t0Var2.X(this);
                            if (!(getParent() instanceof ll0)) {
                                return true;
                            }
                            ((ll0) getParent()).v0(0, AndroidUtilities.dp(16.0f) + height2, null);
                            return true;
                        }
                        int i15 = messageObject3.type;
                        if (i15 == 31) {
                            S();
                        } else if (i15 == 25) {
                            if (this.X0 != null) {
                                AndroidUtilities.runOnUIThread(new na(4, this, (TLRPC.TL_messageActionGiftCode) this.H0.messageOwner.action));
                            }
                        } else if (i15 == 18) {
                            R();
                        } else if (i15 == 30) {
                            S();
                        } else if (this.X0 != null) {
                            if (i15 != 21 || (u40Var = MessagesController.getInstance(i13).photoSuggestion.get(messageObject3.messageOwner.local_id)) == null) {
                                this.X0.i0(this);
                                playSoundEffect(0);
                            } else {
                                u40Var.c();
                            }
                        }
                    } else if (action4 != 2) {
                        if (action4 == 3) {
                            this.W = false;
                        }
                    } else if (N()) {
                        if (!this.E1.contains(x10, y3)) {
                            this.W = false;
                        }
                    } else if (!imageReceiver.isInsideImage(x10, y3)) {
                        this.W = false;
                    }
                }
                z10 = false;
            }
        }
        if (!z10 && (motionEvent.getAction() == 0 || ((this.x != null || this.y != null) && motionEvent.getAction() == 1))) {
            u0 u0Var5 = this.k1;
            if (u0Var5 != null && (arrayList = u0Var5.c) != null && !arrayList.isEmpty() && !this.G) {
                ArrayList arrayList2 = this.k1.c;
                int size = arrayList2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i16);
                    i16++;
                    wh.h hVar = (wh.h) obj;
                    Rect bounds = hVar.getBounds();
                    u0 u0Var6 = this.k1;
                    if (bounds.contains((int) (x10 - u0Var6.b), (int) (y3 - u0Var6.e))) {
                        this.x = null;
                        if (motionEvent.getAction() == 0) {
                            this.y = hVar;
                        } else {
                            wh.h hVar2 = this.y;
                            if (hVar == hVar2) {
                                this.G = true;
                                hVar2.q = new s0(this, 2);
                                float sqrt = (float) Math.sqrt(Math.pow(((StaticLayout) this.k1.f).getHeight(), 2.0d) + Math.pow(((StaticLayout) this.k1.f).getWidth(), 2.0d));
                                wh.h hVar3 = this.y;
                                u0 u0Var7 = this.k1;
                                hVar3.j((int) (x10 - u0Var7.b), (int) (y3 - u0Var7.e), sqrt, false);
                                invalidate();
                            }
                        }
                        z10 = true;
                    }
                }
            }
            if (!z10 && (staticLayout = this.M) != null) {
                if (x10 >= this.R) {
                    float f11 = this.S;
                    if (y3 >= f11 && x10 <= r7 + this.N && y3 <= r8 + this.O) {
                        float f12 = y3 - f11;
                        float f13 = x10 - this.T;
                        if (!z10) {
                            int lineForVertical = staticLayout.getLineForVertical((int) f12);
                            int offsetForHorizontal = this.M.getOffsetForHorizontal(lineForVertical, f13);
                            float lineLeft = this.M.getLineLeft(lineForVertical);
                            if (lineLeft <= f13 && this.M.getLineWidth(lineForVertical) + lineLeft >= f13) {
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
            ArrayList arrayList3 = this.P1;
            if (!arrayList3.isEmpty()) {
                int x11 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                float width = (getWidth() - this.a1) / 2.0f;
                float dp = AndroidUtilities.dp(4.0f) + AndroidUtilities.dp(4.0f) + this.S + this.O + this.f;
                float dp2 = (this.a1 - AndroidUtilities.dp(4.0f)) / 2.0f;
                int action5 = motionEvent.getAction();
                org.telegram.ui.ActionBar.f6 f6Var = this.Y0;
                if (action5 == 0) {
                    this.c2 = -1;
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        e0 e0Var = (e0) arrayList3.get(i17);
                        float dp3 = ((AndroidUtilities.dp(4.0f) + dp2) * i17) + width;
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(dp3, dp, dp3 + dp2, e0Var.f + dp);
                        float f14 = x11;
                        float f15 = y10;
                        if (rectF4.contains(f14, f15)) {
                            this.c2 = i17;
                            K();
                            if (e0Var.s == null) {
                                z Y = org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nc, f6Var), 6, 6);
                                e0Var.s = Y;
                                Y.setCallback(this);
                            }
                            e0Var.s.setHotspot(f14, f15);
                            e0Var.s.setState(this.b2);
                            e0Var.b(!e0Var.m);
                            z12 = true;
                            z10 = z12;
                        }
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (this.c2 != -1) {
                        playSoundEffect(0);
                        e0 e0Var2 = (e0) arrayList3.get(this.c2);
                        z zVar = e0Var2.s;
                        if (zVar != null) {
                            zVar.setState(StateSet.NOTHING);
                        }
                        e0Var2.b(false);
                        if (this.X0 != null && !e0Var2.m && (buttonCustom = e0Var2.j) != null && getMessageObject() != null) {
                            int i18 = buttonCustom.id;
                            if (i18 == 5) {
                                t0 t0Var3 = this.X0;
                                org.telegram.ui.ActionBar.n2 K0 = t0Var3 != null ? t0Var3.K0() : null;
                                if (K0 != null && this.H0 != null) {
                                    org.telegram.ui.Components.e5.v0(K0, LocaleController.getString(R.string.GiftOfferRejectConfirmTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferRejectConfirmText, DialogObject.getShortName(this.H0.getDialogId()))), LocaleController.getString(R.string.GiftOfferRejectConfirmConfirm), true, new na(2, this, K0));
                                }
                            } else if (i18 == 6) {
                                MessageObject messageObject5 = this.H0;
                                if (messageObject5 != null && (message4 = messageObject5.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction2 = message4.action;
                                    if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                        TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction2;
                                        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                                        Context context = getContext();
                                        long dialogId = this.H0.getDialogId();
                                        int id2 = this.H0.getId();
                                        int[] iArr = zh.a0.w0;
                                        zf.a m10 = zf.a.m(tL_messageActionStarGiftPurchaseOffer.price);
                                        zf.b bVar2 = m10.a;
                                        zf.a i19 = zf.a.i((m10.b * (bVar2 == bVar ? MessagesController.getInstance(i13).config.starsStarGiftResaleCommissionPermille.get() : MessagesController.getInstance(i13).config.tonStarGiftResaleCommissionPermille.get())) / 1000, bVar2);
                                        TL_stars.StarGift starGift = tL_messageActionStarGiftPurchaseOffer.gift;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(starGift.title);
                                        sb2.append(" #");
                                        String k10 = i2.g.k(starGift.num, ',', sb2);
                                        if (dialogId >= 0) {
                                            j3 = 0;
                                            chat = MessagesController.getInstance(i13).getUser(Long.valueOf(dialogId));
                                        } else {
                                            j3 = 0;
                                            chat = MessagesController.getInstance(i13).getChat(Long.valueOf(-dialogId));
                                        }
                                        String d = m10.d();
                                        String d10 = i19.d();
                                        boolean z17 = bVar2 == zf.b.b;
                                        LinearLayout f16 = vl.f(context, 1);
                                        f16.addView(new zh.z2(context, starGift, chat), w7.x5.t(-1, -2, 48, 0, -4, 0, 0));
                                        TextView textView = new TextView(context);
                                        vl.n(org.telegram.ui.ActionBar.j6.j5, f6Var, textView, 1, 16.0f);
                                        textView.setText(AndroidUtilities.replaceTags(bVar2 == bVar ? LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellStars, d, DialogObject.getShortName(dialogId), k10, d10) : LocaleController.formatString(R.string.GiftOfferTransferInfoTextSellTON, d, DialogObject.getShortName(dialogId), k10, d10)));
                                        f16.addView(textView, w7.x5.t(-1, -2, 48, 24, 4, 24, 4));
                                        FrameLayout frameLayout = new FrameLayout(context);
                                        frameLayout.setClipChildren(false);
                                        frameLayout.setClipToPadding(false);
                                        oz0 oz0Var = new oz0(context, f6Var);
                                        frameLayout.addView(oz0Var, w7.x5.e(-1, -1, 119));
                                        zh.w3.q1(oz0Var, zh.s5.l(starGift.attributes, TL_stars.starGiftAttributeModel.class));
                                        zh.w3.q1(oz0Var, zh.s5.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class));
                                        zh.w3.q1(oz0Var, zh.s5.l(starGift.attributes, TL_stars.starGiftAttributePattern.class));
                                        f16.addView(frameLayout, w7.x5.t(-1, -2, 48, 23, 16, 23, 4));
                                        zf.a j10 = zf.a.j(starGift.value_usd_amount / Math.pow(10.0d, BillingController.getInstance().getCurrencyExp("USD")), bVar2);
                                        if (j10.c() > 0.0d && starGift.value_usd_amount > j3) {
                                            if (j10.b >= i19.b) {
                                                int round = (int) Math.round((1.0d - (i19.c() / j10.c())) * 100.0d);
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountLowerHint2, a4.a.m(round, "%"), starGift.title));
                                                z11 = round > 10;
                                                i11 = 1;
                                            } else {
                                                i11 = 1;
                                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferAmountHigherHint2, a4.a.m((int) Math.round(((i19.c() / j10.c()) - 1.0d) * 100.0d), "%"), starGift.title));
                                                z11 = false;
                                            }
                                            TextView textView2 = new TextView(context);
                                            textView2.setTextSize(i11, 13.0f);
                                            textView2.setGravity(17);
                                            textView2.setText(replaceTags);
                                            textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(z11 ? org.telegram.ui.ActionBar.j6.p7 : org.telegram.ui.ActionBar.j6.y6, f6Var));
                                            f16.addView(textView2, w7.x5.t(-1, -2, 49, 40, 12, 40, 9));
                                        }
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
                                        alertDialog$Builder.n(f16);
                                        alertDialog$Builder.k(zh.v7.S0(LocaleController.formatString(R.string.GiftOfferSellFor, d10), z17), new ut(id2, i13, R));
                                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                        alertDialog$Builder.a.show();
                                    }
                                }
                            } else if (i18 == 7) {
                                t0 t0Var4 = this.X0;
                                org.telegram.ui.ActionBar.n2 K02 = t0Var4 != null ? t0Var4.K0() : null;
                                if (K02 != null && (messageObject2 = this.H0) != null && (message3 = messageObject2.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction3 = message3.action;
                                    if (messageAction3 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                        final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest = (TLRPC.TL_messageActionNoForwardsRequest) messageAction3;
                                        final int i20 = 0;
                                        org.telegram.ui.Components.e5.v0(K02, LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest.prev_value ? R.string.SharingOfferDisableCancelText : R.string.SharingOfferEnableCancelText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) { // from class: org.telegram.ui.Cells.p0
                                            public final /* synthetic */ w0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i20) {
                                                    case 0:
                                                        w0 w0Var = this.b;
                                                        MessagesController.getInstance(w0Var.H).toggleChatNoForwards(w0Var.H0.getDialogId(), w0Var.H0.getId(), tL_messageActionNoForwardsRequest.prev_value, null);
                                                        break;
                                                    default:
                                                        w0 w0Var2 = this.b;
                                                        MessagesController.getInstance(w0Var2.H).toggleChatNoForwards(w0Var2.H0.getDialogId(), w0Var2.H0.getId(), tL_messageActionNoForwardsRequest.new_value, null);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            } else if (i18 == 8) {
                                t0 t0Var5 = this.X0;
                                org.telegram.ui.ActionBar.n2 K03 = t0Var5 != null ? t0Var5.K0() : null;
                                if (K03 != null && (messageObject = this.H0) != null && (message2 = messageObject.messageOwner) != null) {
                                    TLRPC.MessageAction messageAction4 = message2.action;
                                    if (messageAction4 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                        final TLRPC.TL_messageActionNoForwardsRequest tL_messageActionNoForwardsRequest2 = (TLRPC.TL_messageActionNoForwardsRequest) messageAction4;
                                        final int i21 = 1;
                                        org.telegram.ui.Components.e5.v0(K03, LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableCancelTitle : R.string.SharingOfferEnableCancelTitle), LocaleController.getString(tL_messageActionNoForwardsRequest2.new_value ? R.string.SharingOfferDisableConfirmText : R.string.SharingOfferEnableConfirmText), LocaleController.getString(R.string.SharingOfferCancelYes), false, new Runnable(this) { // from class: org.telegram.ui.Cells.p0
                                            public final /* synthetic */ w0 b;

                                            {
                                                this.b = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                switch (i21) {
                                                    case 0:
                                                        w0 w0Var = this.b;
                                                        MessagesController.getInstance(w0Var.H).toggleChatNoForwards(w0Var.H0.getDialogId(), w0Var.H0.getId(), tL_messageActionNoForwardsRequest2.prev_value, null);
                                                        break;
                                                    default:
                                                        w0 w0Var2 = this.b;
                                                        MessagesController.getInstance(w0Var2.H).toggleChatNoForwards(w0Var2.H0.getDialogId(), w0Var2.H0.getId(), tL_messageActionNoForwardsRequest2.new_value, null);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        }
                        this.c2 = -1;
                        K();
                    }
                } else if (motionEvent.getAction() == 3 && (i10 = this.c2) != -1) {
                    e0 e0Var3 = (e0) arrayList3.get(i10);
                    z zVar2 = e0Var3.s;
                    if (zVar2 != null) {
                        zVar2.setState(StateSet.NOTHING);
                    }
                    e0Var3.b(false);
                    this.c2 = -1;
                    K();
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
        long j3;
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
        int i10;
        int i11;
        char c10;
        Object valueOf;
        TLRPC.Peer peer;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        int i12;
        TLRPC.Chat chat;
        TLRPC.User user;
        CharSequence replaceCharSequence;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.H0;
        int i13 = this.H;
        if (messageObject != null) {
            if (messageObject.isExpiredStory()) {
                charSequence = messageObject.messageOwner.media.user_id != UserConfig.getInstance(i13).getClientUserId() ? bi.p9.e(R.string.ExpiredStoryMention, true, new Object[0]) : bi.p9.e(R.string.ExpiredStoryMentioned, true, MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.getDialogId())).first_name);
            } else {
                t0 t0Var = this.X0;
                if (t0Var != null && t0Var.d() == 0 && MessageObject.isTopicActionMessage(messageObject)) {
                    TLRPC.TL_forumTopic findTopic = MessagesController.getInstance(i13).getTopicsController().findTopic(-messageObject.getDialogId(), MessageObject.getTopicId(i13, messageObject.messageOwner, true));
                    int i14 = og.d.a;
                    if (findTopic != null) {
                        TLRPC.MessageAction messageAction2 = messageObject.messageOwner.action;
                        if (messageAction2 instanceof TLRPC.TL_messageActionTopicCreate) {
                            charSequence = AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.TopicWasCreatedAction), og.d.j(findTopic, null, null));
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
                                j3 = 0;
                                if ((i15 & 4) != 0) {
                                    replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(tL_messageActionTopicEdit.closed ? R.string.TopicWasClosedAction : R.string.TopicWasReopenedAction), og.d.j(findTopic, null, null)), formatName);
                                } else {
                                    int i16 = i15 & 1;
                                    if (i16 != 0 && (i15 & 2) != 0) {
                                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                        tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                        tL_forumTopic.title = tL_messageActionTopicEdit.title;
                                        replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction2), og.d.j(tL_forumTopic, null, null)), formatName);
                                    } else if (i16 != 0) {
                                        replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasRenamedToAction), tL_messageActionTopicEdit.title), formatName);
                                    } else {
                                        if ((i15 & 2) != 0) {
                                            TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                            tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                            tL_forumTopic2.title = "";
                                            replaceCharSequence = AndroidUtilities.replaceCharSequence("%1$s", AndroidUtilities.replaceCharSequence("%2$s", LocaleController.getString(R.string.TopicWasIconChangedToAction), og.d.j(tL_forumTopic2, null, null)), formatName);
                                        }
                                        charSequence = null;
                                        if (charSequence == null) {
                                            TLRPC.Message message2 = messageObject.messageOwner;
                                            if (message2 == null || (messageMedia = message2.media) == null || messageMedia.ttl_seconds == 0) {
                                                charSequence = org.telegram.ui.Components.z5.cloneSpans(messageObject.messageText);
                                            } else if (messageMedia.photo != null) {
                                                charSequence = LocaleController.getString(R.string.AttachPhotoExpired);
                                            } else {
                                                TLRPC.Document document = messageMedia.document;
                                                charSequence = ((document instanceof TLRPC.TL_documentEmpty) || ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && document == null)) ? messageMedia.voice ? LocaleController.getString(R.string.AttachVoiceExpired) : messageMedia.round ? LocaleController.getString(R.string.AttachRoundExpired) : LocaleController.getString(R.string.AttachVideoExpired) : org.telegram.ui.Components.z5.cloneSpans(messageObject.messageText);
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
                j3 = 0;
                charSequence = null;
                if (charSequence == null) {
                }
            }
            j3 = 0;
            if (charSequence == null) {
            }
        } else {
            j3 = 0;
            charSequence = this.J0;
        }
        MessageObject messageObject2 = this.H0;
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
                spannableStringBuilder2.setSpan(new nq(i12, 0), 0, 1, 33);
                charSequence = spannableStringBuilder2;
            }
        }
        w(this.V, charSequence);
        if (this.G0 != null) {
            this.M = null;
            this.O = 0;
            this.P = null;
            this.Q = 0;
            this.S = 0;
        }
        if (messageObject != null) {
            TLRPC.Message message3 = messageObject.messageOwner;
            if (message3 != null) {
                TLRPC.MessageAction messageAction3 = message3.action;
                if ((messageAction3 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction3).balance_too_low) {
                    v(null, null, charSequence, false, !ChatObject.canManageMonoForum(i13, messageObject.getDialogId()) ? LocaleController.getString(R.string.StarsBuy) : null, 11, null, this.a1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                }
            }
            CharSequence charSequence6 = charSequence;
            if (message3 != null) {
                TLRPC.MessageAction messageAction4 = message3.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionSuggestedPostApproval) && ((TLRPC.TL_messageActionSuggestedPostApproval) messageAction4).rejected) {
                    v(null, null, charSequence6, false, null, 11, null, this.a1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                }
            }
            int i17 = messageObject.type;
            if (i17 == 11) {
                float dp = AndroidUtilities.dp(19.0f) + this.O;
                float f7 = AndroidUtilities.roundMessageSize;
                this.I.setImageCoords((this.V - AndroidUtilities.roundMessageSize) / 2.0f, dp, f7, f7);
            } else if (i17 == 25) {
                u();
            } else {
                TextPaint textPaint = this.x1;
                if (i17 == 30) {
                    TLRPC.User user2 = MessagesController.getInstance(i13).getUser(Long.valueOf(this.H0.getDialogId()));
                    TLRPC.MessageAction messageAction5 = messageObject.messageOwner.action;
                    if (messageAction5 instanceof TLRPC.TL_messageActionGiftStars) {
                        v(LocaleController.formatPluralStringComma("ActionGiftStarsTitle", (int) ((TLRPC.TL_messageActionGiftStars) messageAction5).stars), null, AndroidUtilities.replaceTags(this.H0.isOutOwner() ? LocaleController.formatString(R.string.ActionGiftStarsSubtitle, UserObject.getForcedFirstName(user2)) : LocaleController.getString(R.string.ActionGiftStarsSubtitleYou)), false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.a1, true);
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
                            org.telegram.ui.g5 g5Var = new org.telegram.ui.g5(this, 18.0f, i13);
                            g5Var.e(user3);
                            spannableStringBuilder3.setSpan(g5Var, spannableStringBuilder3.length() - 2, spannableStringBuilder3.length() - 1, 33);
                        }
                        spannableStringBuilder3.append((CharSequence) UserObject.getForcedFirstName(user3));
                        v(spannableStringBuilder3, null, LocaleController.getString(R.string.Gift2ActionUpgradeRefundedText), false, LocaleController.getString(R.string.ActionGiftStarsView), 12, LocaleController.getString(R.string.Gift2UniqueRibbon), this.a1, true);
                    } else if (messageAction5 instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction5;
                        long j10 = tL_messageActionStarGift.convert_stars;
                        long clientUserId2 = UserConfig.getInstance(i13).getClientUserId();
                        TLRPC.Peer peer2 = tL_messageActionStarGift.peer;
                        boolean z11 = peer2 != null && (!tL_messageActionStarGift.prepaid_upgrade || (peer2 instanceof TLRPC.TL_peerChannel));
                        boolean z12 = messageObject.getDialogId() == clientUserId2 && !z11;
                        long fromChatId2 = messageObject.getFromChatId();
                        if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                            fromChatId2 = DialogObject.getPeerDialogId(peer);
                        }
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        TLObject userOrChat = MessagesController.getInstance(i13).getUserOrChat(fromChatId2);
                        long peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGift.to_id);
                        boolean z13 = z11;
                        TLObject userOrChat2 = MessagesController.getInstance(i13).getUserOrChat(peerDialogId);
                        boolean z14 = tL_messageActionStarGift.can_upgrade && !tL_messageActionStarGift.converted && tL_messageActionStarGift.upgrade_stars > j3 && !tL_messageActionStarGift.upgraded;
                        if (peerDialogId != j3 && tL_messageActionStarGift.auction_acquired && userOrChat2 != null) {
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2ActionTitleTo)).append((CharSequence) " ");
                            if (DialogObject.hasPhoto(userOrChat2)) {
                                spannableStringBuilder4.append((CharSequence) "a ");
                                org.telegram.ui.g5 g5Var2 = new org.telegram.ui.g5(this, 18.0f, i13);
                                int i18 = g5Var2.e;
                                org.telegram.ui.Components.i9 i9Var = g5Var2.c;
                                i9Var.j(i18, userOrChat2);
                                g5Var2.b.setForUserOrChat(userOrChat2, i9Var);
                                spannableStringBuilder4.setSpan(g5Var2, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                            }
                            spannableStringBuilder4.append((CharSequence) DialogObject.getShortName(userOrChat2));
                        } else if (!z12) {
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(tL_messageActionStarGift.prepaid_upgrade ? R.string.Gift2ActionUpgradeTitle : R.string.Gift2ActionTitle)).append((CharSequence) " ");
                            if (DialogObject.hasPhoto(userOrChat)) {
                                spannableStringBuilder4.append((CharSequence) "a ");
                                org.telegram.ui.g5 g5Var3 = new org.telegram.ui.g5(this, 18.0f, i13);
                                int i19 = g5Var3.e;
                                org.telegram.ui.Components.i9 i9Var2 = g5Var3.c;
                                i9Var2.j(i19, userOrChat);
                                g5Var3.b.setForUserOrChat(userOrChat, i9Var2);
                                spannableStringBuilder4.setSpan(g5Var3, spannableStringBuilder4.length() - 2, spannableStringBuilder4.length() - 1, 33);
                            }
                            spannableStringBuilder4.append((CharSequence) DialogObject.getShortName(userOrChat));
                        } else if (tL_messageActionStarGift.gift_num <= 0 || (starGift = tL_messageActionStarGift.gift) == null || (str = starGift.title) == null) {
                            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.Gift2ActionSelfTitle));
                        } else {
                            spannableStringBuilder4.append((CharSequence) str).append((CharSequence) " #").append((CharSequence) LocaleController.formatNumber(tL_messageActionStarGift.gift_num, ','));
                        }
                        boolean z15 = ((messageObject.isOutOwner() && !z12) || !tL_messageActionStarGift.converted) && tL_messageActionStarGift.convert_stars > j3 && MessagesController.getInstance(i13).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(i13).getCurrentTime() - messageObject.messageOwner.date) > 0 && !tL_messageActionStarGift.refunded;
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
                                replaceTags = tL_messageActionStarGift.converted ? LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j10) : (!z15 || j10 <= j3) ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionInfoChannelNoConvert)) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfoChannel", (int) j10));
                            } else if (z12) {
                                replaceTags = (!tL_messageActionStarGift.converted || j10 <= j3) ? tL_messageActionStarGift.can_upgrade ? AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoUpgrade)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2ActionSelfInfoNoConvert)) : LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j10);
                            } else if (z14) {
                                replaceTags = AndroidUtilities.replaceTags(messageObject.isOutOwner() ? LocaleController.formatString(R.string.Gift2ActionUpgradeOut, UserObject.getForcedFirstName(user2)) : LocaleController.getString(R.string.Gift2ActionUpgrade));
                            } else {
                                replaceTags = messageObject.isOutOwner() ? (!z15 || j10 <= j3) ? tL_messageActionStarGift.can_upgrade ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoUpgrade, UserObject.getForcedFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActionOutInfoNoConvert, UserObject.getForcedFirstName(user2))) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionOutInfo", (int) j10, UserObject.getForcedFirstName(user2))) : tL_messageActionStarGift.converted ? LocaleController.formatPluralStringComma("Gift2ActionConvertedInfo", (int) j10) : tL_messageActionStarGift.saved ? !z15 ? LocaleController.getString(R.string.Gift2ActionBotSavedInfo) : LocaleController.getString(R.string.Gift2ActionSavedInfo) : !z15 ? LocaleController.getString(R.string.Gift2ActionBotInfo) : AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2ActionInfo", (int) j10));
                            }
                        }
                        TL_stars.StarGift starGift2 = tL_messageActionStarGift.gift;
                        if (starGift2 == null || !starGift2.limited) {
                            str2 = null;
                        } else {
                            int i20 = R.string.Gift2Limited1OfRibbon;
                            int i21 = starGift2.availability_total;
                            if (i21 > 1500) {
                                c10 = 0;
                                valueOf = AndroidUtilities.formatWholeNumber(i21, 0);
                            } else {
                                c10 = 0;
                                valueOf = Integer.valueOf(i21);
                            }
                            Object[] objArr = new Object[1];
                            objArr[c10] = valueOf;
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
                        if (!messageObject.isOutOwner() && z14) {
                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder();
                            spannableStringBuilder6.append("^  ");
                            nq nqVar = new nq(R.drawable.gift_unpack, 0);
                            nqVar.setScale(0.8f, 0.8f);
                            spannableStringBuilder6.setSpan(nqVar, 0, 1, 33);
                            spannableStringBuilder6.append(LocaleController.getString(R.string.Gift2Unpack));
                            charSequence5 = spannableStringBuilder6;
                        }
                        TL_stars.StarGift starGift3 = tL_messageActionStarGift.gift;
                        if (starGift3 == null || starGift3.released_by == null || (publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i13).getUserOrChat(DialogObject.getPeerDialogId(tL_messageActionStarGift.gift.released_by)))) == null) {
                            spannableStringBuilder = null;
                        } else {
                            String formatString2 = LocaleController.formatString(R.string.Gift2ActionReleasedBy, "@".concat(publicUsername));
                            int i22 = zh.w3.q1;
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
                                spannableStringBuilder7.setSpan(new wo(1), indexOf, i10 + indexOf, 0);
                            }
                            spannableStringBuilder = spannableStringBuilder7;
                        }
                        v(spannableStringBuilder4, spannableStringBuilder, replaceTags, false, charSequence5, 11, str2, this.a1, true);
                    } else if (messageAction5 instanceof TLRPC.TL_messageActionGiftTon) {
                        v(LocaleController.getString(R.string.ActionGiftTonTitle), null, this.H0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.a1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else {
                        v(LocaleController.getString(R.string.ActionStarGiveawayPrizeTitle), null, this.H0.messageText, false, LocaleController.getString(R.string.ActionGiftStarsView), 11, null, this.a1, true);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
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
                                formatShortDuration2 = com.google.android.gms.internal.vision.e2.i(1, 0, formatShortDuration2);
                            }
                            spannableStringBuilder8.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftOfferStatusPending, formatShortDuration2)));
                        }
                    }
                    v(null, null, spannableStringBuilder8, false, null, 11, null, this.a1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i17 == 34) {
                    v(null, null, charSequence6, false, null, 11, null, this.a1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
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
                    v(null, null, spannableStringBuilder9, false, null, 11, null, this.a1, false);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i17 == 31) {
                    TL_stars.StarGift starGift4 = ((TLRPC.TL_chatThemeUniqueGift) ((TLRPC.TL_messageActionSetChatTheme) message3.action).theme).gift;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(starGift4.title);
                    sb2.append(" #");
                    String k10 = i2.g.k(starGift4.num, ',', sb2);
                    long fromChatId3 = messageObject.getFromChatId();
                    v(null, null, AndroidUtilities.replaceTags(UserConfig.getInstance(i13).getClientUserId() == fromChatId3 ? LocaleController.formatString(R.string.GiftThemesSetByYou, k10) : LocaleController.formatString(R.string.GiftThemesSetByOther, DialogObject.getShortName(i13, fromChatId3), k10)), false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.a1, true);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i17 == 37) {
                    TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) message3.action;
                    long peerDialogId2 = DialogObject.getPeerDialogId(message3.peer_id);
                    boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(-peerDialogId2, i13);
                    boolean z16 = peerDialogId2 > j3;
                    String shortName2 = DialogObject.getShortName(i13, DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                    String shortName3 = DialogObject.getShortName(i13, -tL_messageActionChangeCommunity.community_id);
                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder();
                    spannableStringBuilder10.append((CharSequence) gi.u0.a(messageObject, shortName3, shortName2, isChannelAndNotMegaGroup, z16));
                    v(null, null, spannableStringBuilder10, false, LocaleController.getString(R.string.GiftThemesSetActionView), 11, null, this.a1, true);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
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
                    MessageObject messageObject3 = this.H0;
                    v(LocaleController.formatPluralStringComma("ActionGiftPremiumTitle2", messageObject.messageOwner.action.months), null, charSequence7, true, LocaleController.getString((messageObject3 == null || !(messageObject3.messageOwner.action instanceof TLRPC.TL_messageActionGiftCode) || O()) ? R.string.ActionGiftPremiumView : R.string.GiftPremiumUseGiftBtn), 11, null, this.a1, false);
                } else if (i17 == 21) {
                    TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = (TLRPC.TL_messageActionSuggestProfilePhoto) message3.action;
                    TLRPC.User user4 = MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.isOutOwner() ? j3 : messageObject.getDialogId()));
                    boolean z17 = tL_messageActionSuggestProfilePhoto.video || !((photo = tL_messageActionSuggestProfilePhoto.photo) == null || (arrayList2 = photo.video_sizes) == null || arrayList2.isEmpty());
                    if (user4.id == UserConfig.getInstance(i13).clientUserId) {
                        TLRPC.User user5 = MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.getDialogId()));
                        formatString = z17 ? LocaleController.formatString(R.string.ActionSuggestVideoFromYouDescription, user5.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoFromYouDescription, user5.first_name);
                    } else {
                        formatString = z17 ? LocaleController.formatString(R.string.ActionSuggestVideoToYouDescription, user4.first_name) : LocaleController.formatString(R.string.ActionSuggestPhotoToYouDescription, user4.first_name);
                    }
                    v(null, null, formatString, false, (tL_messageActionSuggestProfilePhoto.video || !((arrayList = tL_messageActionSuggestProfilePhoto.photo.video_sizes) == null || arrayList.isEmpty())) ? LocaleController.getString(R.string.ViewVideoAction) : LocaleController.getString(R.string.ViewPhotoAction), 11, null, this.a1, true);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (i17 == 22) {
                    TLRPC.User user6 = MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.isOutOwner() ? j3 : messageObject.getDialogId()));
                    if (messageObject.getDialogId() < j3) {
                        charSequence3 = messageObject.messageText;
                    } else if (!messageObject.isOutOwner() && messageObject.isWallpaperForBoth() && messageObject.isCurrentWallpaper()) {
                        charSequence2 = messageObject.messageText;
                        string = LocaleController.getString(R.string.RemoveWallpaperAction);
                        z10 = false;
                        v(null, null, charSequence2, false, string, 11, null, this.a1, z10);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else if (user6 == null || user6.id != UserConfig.getInstance(i13).clientUserId) {
                        charSequence2 = messageObject.messageText;
                        string = LocaleController.getString(R.string.ViewWallpaperAction);
                        z10 = true;
                        v(null, null, charSequence2, false, string, 11, null, this.a1, z10);
                        this.M = null;
                        this.O = 0;
                        this.P = null;
                        this.Q = 0;
                        this.S = 0;
                    } else {
                        charSequence3 = messageObject.messageText;
                    }
                    charSequence2 = charSequence3;
                    string = null;
                    z10 = true;
                    v(null, null, charSequence2, false, string, 11, null, this.a1, z10);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                } else if (messageObject.isStoryMention()) {
                    TLRPC.User user7 = MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.messageOwner.media.user_id));
                    v(null, null, user7.self ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryYouMentionedTitle, MessagesController.getInstance(i13).getUser(Long.valueOf(messageObject.getDialogId())).first_name)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryMentionedTitle, user7.first_name)), false, LocaleController.getString(R.string.StoryMentionedAction), 11, null, this.a1, true);
                    this.M = null;
                    this.O = 0;
                    this.P = null;
                    this.Q = 0;
                    this.S = 0;
                }
            }
        }
        int dp2 = AndroidUtilities.dp(12.0f);
        ah.k1 k1Var = this.C0;
        k1Var.c = dp2;
        k1Var.p(this.V - AndroidUtilities.dp(24.0f), 1);
    }

    public final void s() {
        float f7 = this.S0;
        RectF rectF = this.U0;
        this.S0 = (int) Math.min(f7, rectF.left);
        this.T0 = (int) Math.max(this.T0, rectF.right);
    }

    public void setCustomText(CharSequence charSequence) {
        this.J0 = charSequence;
        if (charSequence != null) {
            X(false);
        }
    }

    public void setDelegate(t0 t0Var) {
        this.X0 = t0Var;
    }

    public void setInvalidateColors(boolean z10) {
        if (this.W0 == z10) {
            return;
        }
        this.W0 = z10;
        invalidate();
    }

    public void setInvalidateListener(Runnable runnable) {
        this.f2 = runnable;
    }

    public void setInvalidateWithParent(View view) {
        this.v = view;
    }

    public void setInvalidatesParent(boolean z10) {
        this.e2 = z10;
    }

    public void setMessageObject(MessageObject messageObject) {
        U(messageObject, false);
    }

    public void setOnActionClickListener(View.OnClickListener onClickListener) {
        this.V1 = onClickListener;
    }

    public void setOverrideTextMaxWidth(int i10) {
        this.W1 = i10;
    }

    public void setScrimReaction(Integer num) {
        this.C0.C = num;
    }

    public void setShowTopic(boolean z10) {
        if (this.m0 != z10) {
            this.m0 = z10;
            K();
            invalidate();
        }
    }

    public void setSpoilersSuppressed(boolean z10) {
        ArrayList arrayList = this.p0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((wh.h) obj).invalidateSelf();
        }
    }

    public final boolean t(float f7, int i10) {
        ah.k1 k1Var = this.C0;
        if (!k1Var.K) {
            return false;
        }
        float y3 = getY() + k1Var.d;
        return y3 > f7 && (y3 + ((float) k1Var.o)) - ((float) AndroidUtilities.dp(16.0f)) < ((float) i10);
    }

    public final void u() {
        SpannableStringBuilder spannableStringBuilder;
        int dp = this.a1 - AndroidUtilities.dp(16.0f);
        float dp2 = AndroidUtilities.dp(14.0f);
        TextPaint textPaint = this.w1;
        textPaint.setTextSize(dp2);
        float dp3 = AndroidUtilities.dp(13.0f);
        TextPaint textPaint2 = this.x1;
        textPaint2.setTextSize(dp3);
        TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) this.H0.messageOwner.action;
        int i10 = tL_messageActionGiftCode.months;
        TLRPC.Chat chat = MessagesController.getInstance(this.H).getChat(Long.valueOf(-DialogObject.getPeerDialogId(tL_messageActionGiftCode.boost_peer)));
        String str = chat == null ? null : chat.title;
        boolean z10 = tL_messageActionGiftCode.via_giveaway;
        String string = tL_messageActionGiftCode.unclaimed ? LocaleController.getString("BoostingUnclaimedPrize", R.string.BoostingUnclaimedPrize) : LocaleController.getString("BoostingCongratulations", R.string.BoostingCongratulations);
        String formatPluralString = i10 == 12 ? LocaleController.formatPluralString("BoldYears", 1, new Object[0]) : LocaleController.formatPluralString("BoldMonths", i10, new Object[0]);
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
        valueOf.setSpan(new e51(AndroidUtilities.bold()), 0, valueOf.length(), 33);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        this.b1 = new StaticLayout(valueOf, textPaint, dp, alignment, 1.1f, 0.0f, false);
        this.e1 = null;
        this.d1 = null;
        u0 u0Var = this.k1;
        if (u0Var != null) {
            org.telegram.ui.Components.z5.release((w0) u0Var.i, (org.telegram.ui.Components.v5) u0Var.h);
        }
        u0 u0Var2 = new u0(this);
        this.k1 = u0Var2;
        u0Var2.a(spannableStringBuilder, textPaint2, dp);
        SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(string2);
        valueOf2.setSpan(new e51(AndroidUtilities.bold()), 0, valueOf2.length(), 33);
        this.g1 = false;
        this.h1 = 0;
        this.o1 = null;
        StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) H("paintChatActionText"), dp, alignment, 1.0f, 0.0f, false);
        this.p1 = staticLayout;
        this.q1 = true;
        this.v1 = P(staticLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final void v(CharSequence charSequence, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence2, boolean z10, CharSequence charSequence3, int i10, String str, int i11, boolean z11) {
        ?? r42;
        int i12;
        CharSequence charSequence4;
        int a2;
        CharSequence charSequence5 = charSequence2;
        int dp = i11 - AndroidUtilities.dp(16.0f);
        MessageObject messageObject = this.H0;
        if (messageObject != null && messageObject.type == 30) {
            dp -= AndroidUtilities.dp(16.0f);
        }
        int i13 = dp;
        if (charSequence != null) {
            MessageObject messageObject2 = this.H0;
            TextPaint textPaint = this.w1;
            if (messageObject2 == null || messageObject2.type != 30) {
                textPaint.setTextSize(AndroidUtilities.dp(16.0f));
            } else {
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
            }
            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(charSequence);
            valueOf.setSpan(new e51(AndroidUtilities.bold()), 0, valueOf.length(), 33);
            r42 = 0;
            this.b1 = new StaticLayout(valueOf, textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        } else {
            r42 = 0;
            this.b1 = null;
        }
        this.e1 = null;
        if (spannableStringBuilder != null) {
            f01 f01Var = new f01(spannableStringBuilder, 10.0f, null);
            this.d1 = f01Var;
            f01Var.a.linkColor = -1;
        } else {
            this.d1 = null;
        }
        MessageObject messageObject3 = this.H0;
        TextPaint textPaint2 = this.x1;
        if (messageObject3 != null && messageObject3.type == 35) {
            textPaint2.setTextSize(AndroidUtilities.dp(14.3f));
        } else if (messageObject3 == null || !(N() || (i12 = this.H0.type) == 30 || i12 == 18 || i12 == 31 || i12 == 37 || i12 == 33)) {
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
        } else {
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }
        int dp2 = i13 - AndroidUtilities.dp(12.0f);
        MessageObject messageObject4 = this.H0;
        if (messageObject4 != null && messageObject4.type == 22 && messageObject4.getDialogId() >= 0 && (a2 = di.f4.a(charSequence5, textPaint2)) < dp2 && a2 > dp2 / 5.0f) {
            dp2 = a2;
        }
        if (charSequence5 == null) {
            u0 u0Var = this.k1;
            if (u0Var != null) {
                org.telegram.ui.Components.z5.release((w0) u0Var.i, (org.telegram.ui.Components.v5) u0Var.h);
                this.k1 = null;
            }
            this.g1 = r42;
        } else {
            if (this.k1 == null) {
                this.k1 = new u0(this);
            }
            try {
                charSequence4 = Emoji.replaceEmoji(charSequence5, textPaint2.getFontMetricsInt(), r42);
            } catch (Exception unused) {
                charSequence4 = charSequence5;
            }
            this.k1.a(charSequence4, textPaint2, dp2);
            if (!z10 || ((StaticLayout) this.k1.f).getLineCount() <= 3) {
                this.g1 = r42;
                this.i1.f(true, true);
                this.h1 = r42;
            } else {
                this.g1 = !this.f1;
                this.h1 = ((StaticLayout) this.k1.f).getLineBottom(2);
                this.o1 = new f01(LocaleController.getString(R.string.Gift2CaptionMore), textPaint2.getTextSize() / AndroidUtilities.density, AndroidUtilities.bold());
                int lineBottom = ((StaticLayout) this.k1.f).getLineBottom(2);
                this.m1 = lineBottom;
                this.n1 = lineBottom - ((StaticLayout) this.k1.f).getLineTop(2);
                this.l1 = (int) ((StaticLayout) this.k1.f).getLineRight(2);
            }
            if (this.g1) {
                int lineEnd = ((StaticLayout) this.k1.f).getLineEnd(2) - 1;
                u0 u0Var2 = this.k1;
                CharSequence charSequence6 = charSequence4;
                if (lineEnd >= 0) {
                    charSequence6 = charSequence4.subSequence(r42, lineEnd);
                }
                u0Var2.a(charSequence6, textPaint2, dp2);
            }
        }
        if (charSequence3 != null) {
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(charSequence3);
            valueOf2.setSpan(new e51(AndroidUtilities.bold()), r42, valueOf2.length(), 33);
            StaticLayout staticLayout = new StaticLayout(valueOf2, (TextPaint) H("paintChatActionText"), i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            this.p1 = staticLayout;
            this.q1 = z11 && !this.g1;
            this.v1 = P(staticLayout);
        } else {
            this.p1 = null;
            this.q1 = r42;
            this.v1 = 0.0f;
        }
        if (str == null) {
            this.J1 = null;
            this.K1 = null;
            return;
        }
        if (this.I1 == null) {
            this.I1 = new CornerPathEffect(AndroidUtilities.dp(5.0f));
        }
        if (this.J1 == null) {
            Path path = new Path();
            this.J1 = path;
            yh.k1.c(path, 1.35f, r42);
        }
        f01 f01Var2 = new f01(str, i10, AndroidUtilities.bold());
        this.K1 = f01Var2;
        f01Var2.p = AndroidUtilities.dp(62.0f);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.J || super.verifyDrawable(drawable);
    }

    public final void w(int i10, CharSequence charSequence) {
        CharSequence charSequence2;
        t0 t0Var;
        TLRPC.Message message;
        MessageObject messageObject;
        int i11;
        int dp = i10 - AndroidUtilities.dp(30.0f);
        if (this.i0) {
            dp -= AndroidUtilities.dp(64.0f);
        }
        if (M()) {
            dp = Math.min(dp - AndroidUtilities.dp(this.i0 ? 28.0f : 82.0f), AndroidUtilities.dp(272.0f));
        }
        if (dp < 0) {
            return;
        }
        int i12 = this.W1;
        if (i12 > 0) {
            dp = Math.min(i12, dp);
        }
        int i13 = dp;
        this.V0 = true;
        TextPaint textPaint = (M() || ((messageObject = this.H0) != null && ((i11 = messageObject.type) == 34 || i11 == 35))) ? (TextPaint) H("paintChatActionText3") : (messageObject == null || !messageObject.drawServiceWithDefaultTypeface) ? (TextPaint) H("paintChatActionText") : (TextPaint) H("paintChatActionText2");
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
        this.M = staticLayout;
        this.P = null;
        MessageObject messageObject2 = this.H0;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (!tL_messageActionSuggestedPostApproval.rejected && !tL_messageActionSuggestedPostApproval.balance_too_low) {
                    this.P = new StaticLayout(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.getString(R.string.SuggestionAgreementReached)), textPaint.getFontMetricsInt(), false, null, 0, 1.0f, 0), textPaint, i13, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                }
            }
        }
        this.r0 = org.telegram.ui.Components.z5.update(0, this, (!this.s || (t0Var = this.X0) == null || t0Var.f()) ? false : true, this.r0, this.M);
        this.O = 0;
        this.N = 0;
        this.Q = 0;
        StaticLayout staticLayout2 = this.P;
        if (staticLayout2 != null) {
            int height = staticLayout2.getHeight();
            this.Q = height;
            this.Q = AndroidUtilities.dp(12.0f) + height;
        }
        MessageObject messageObject3 = this.H0;
        if (messageObject3 == null || !messageObject3.isRepostPreview) {
            try {
                int lineCount = this.M.getLineCount();
                for (int i14 = 0; i14 < lineCount; i14++) {
                    try {
                        float lineWidth = this.M.getLineWidth(i14);
                        float f7 = i13;
                        if (lineWidth > f7) {
                            lineWidth = f7;
                        }
                        this.O = (int) Math.max(this.O, Math.ceil(this.M.getLineBottom(i14)));
                        this.N = (int) Math.max(this.N, Math.ceil(lineWidth));
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.R = (i10 - this.N) / 2;
        int dp2 = AndroidUtilities.dp(7.0f);
        this.S = dp2;
        if (this.P != null) {
            this.S = org.telegram.messenger.w1.C(11.0f, this.Q, dp2);
        }
        this.T = (i10 - (M() ? this.N : this.M.getWidth())) / 2;
        this.U = (i10 - i13) / 2;
        Stack stack = this.q0;
        ArrayList arrayList = this.p0;
        stack.addAll(arrayList);
        arrayList.clear();
        if (charSequence3 instanceof Spannable) {
            StaticLayout staticLayout3 = this.M;
            int i15 = this.R;
            wh.h.a(this, staticLayout3, i15, i15 + this.N, (Spannable) charSequence3, stack, arrayList, null);
        }
    }

    public final void y(Canvas canvas, boolean z10) {
        Paint paint;
        Paint paint2;
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        w0 w0Var;
        Paint paint3;
        Paint paint4;
        int i10;
        int i11;
        Canvas canvas2;
        int i12;
        u0 u0Var;
        RectF rectF;
        ArrayList arrayList;
        int i13;
        float f13;
        int i14;
        Paint paint5;
        int i15;
        float f14;
        ArrayList arrayList2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i16;
        w0 w0Var2 = this;
        if (!w0Var2.s || ((!w0Var2.J() || z10) && (w0Var2.J() || !z10))) {
            Paint H = w0Var2.H("paintChatActionBackground");
            Paint H2 = w0Var2.H("paintChatActionBackgroundDarken");
            w0Var2.s0 = (TextPaint) w0Var2.H("paintChatActionText");
            int i17 = w0Var2.L0;
            org.telegram.ui.ActionBar.f6 f6Var3 = w0Var2.Y0;
            if (i17 >= 0) {
                int v02 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var3);
                if (w0Var2.N0 == null) {
                    Paint paint6 = new Paint(1);
                    w0Var2.N0 = paint6;
                    paint6.setColor(v02);
                    TextPaint textPaint = new TextPaint(1);
                    w0Var2.O0 = textPaint;
                    textPaint.setTypeface(AndroidUtilities.bold());
                    w0Var2.O0.setTextSize(AndroidUtilities.dp(Math.max(16, SharedConfig.fontSize) - 2));
                    w0Var2.O0.setColor(org.telegram.ui.ActionBar.j6.v0(w0Var2.M0, f6Var3));
                }
                H = w0Var2.N0;
                w0Var2.s0 = w0Var2.O0;
            }
            boolean z11 = w0Var2.V0;
            Path path = w0Var2.R0;
            if (z11) {
                w0Var2.V0 = false;
                w0Var2.S0 = w0Var2.getWidth();
                w0Var2.T0 = 0;
                ArrayList arrayList3 = w0Var2.P0;
                arrayList3.clear();
                StaticLayout staticLayout = w0Var2.M;
                int lineCount = staticLayout == null ? 0 : staticLayout.getLineCount();
                int dp = AndroidUtilities.dp(11.0f);
                f7 = 6.0f;
                int dp2 = AndroidUtilities.dp(8.0f);
                int i18 = 0;
                f10 = 8.0f;
                int i19 = 0;
                while (i18 < lineCount) {
                    int ceil = (int) Math.ceil(w0Var2.M.getLineWidth(i18));
                    if (i18 != 0 && (i16 = i19 - ceil) > 0 && i16 <= (dp * 1.5f) + dp2) {
                        ceil = i19;
                    }
                    i18 = com.google.android.gms.internal.vision.e2.e(ceil, i18, 1, arrayList3);
                    i19 = ceil;
                }
                f11 = 2.0f;
                f12 = 4.0f;
                for (int i20 = lineCount - 2; i20 >= 0; i20--) {
                    int intValue = ((Integer) arrayList3.get(i20)).intValue();
                    int i21 = i19 - intValue;
                    if (i21 <= 0 || i21 > (dp * 1.5f) + dp2) {
                        i19 = intValue;
                    }
                    arrayList3.set(i20, Integer.valueOf(i19));
                }
                int dp3 = AndroidUtilities.dp(4.0f);
                int measuredWidth = w0Var2.getMeasuredWidth() / 2;
                int dp4 = AndroidUtilities.dp(3.0f);
                int dp5 = AndroidUtilities.dp(6.0f);
                int i22 = dp - dp4;
                ArrayList arrayList4 = w0Var2.Q0;
                arrayList4.clear();
                path.reset();
                float f15 = measuredWidth;
                path.moveTo(f15, dp3);
                int i23 = i19;
                int i24 = 0;
                int i25 = 0;
                while (true) {
                    rectF = w0Var2.U0;
                    if (i25 >= lineCount) {
                        break;
                    }
                    int i26 = lineCount;
                    int intValue2 = ((Integer) arrayList3.get(i25)).intValue();
                    int lineBottom = w0Var2.M.getLineBottom(i25);
                    int i27 = i26 - 1;
                    if (i25 < i27) {
                        paint5 = H2;
                        i15 = ((Integer) arrayList3.get(i25 + 1)).intValue();
                    } else {
                        paint5 = H2;
                        i15 = 0;
                    }
                    int i28 = lineBottom - i24;
                    if (i25 == 0 || intValue2 > i23) {
                        i28 = AndroidUtilities.dp(3.0f) + i28;
                    }
                    if (i25 == i27 || intValue2 > i15) {
                        i28 = AndroidUtilities.dp(3.0f) + i28;
                    }
                    Paint paint7 = H;
                    float f16 = (intValue2 / 2.0f) + f15;
                    int i29 = (i25 == i27 || intValue2 >= i15 || i25 == 0 || intValue2 >= i23) ? dp2 : dp5;
                    if (i25 == 0 || intValue2 > i23) {
                        f14 = f16;
                        arrayList2 = arrayList3;
                        f6Var2 = f6Var3;
                        rectF.set((f14 - dp4) - dp, dp3, f14 + i22, (dp * 2) + dp3);
                        s();
                        path.arcTo(rectF, -90.0f, 90.0f);
                    } else {
                        f14 = f16;
                        if (intValue2 < i23) {
                            float f17 = f14 + i22;
                            f6Var2 = f6Var3;
                            arrayList2 = arrayList3;
                            rectF.set(f17, dp3, (i29 * 2) + f17, r0 + dp3);
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
                        rectF.set((f14 - dp4) - dp, dp3 - (dp * 2), f14 + i22, dp3);
                        s();
                        path.arcTo(rectF, 0.0f, 90.0f);
                    } else if (intValue2 < i15) {
                        float f18 = f14 + i22;
                        rectF.set(f18, dp3 - r0, (i29 * 2) + f18, dp3);
                        s();
                        path.arcTo(rectF, 180.0f, -90.0f);
                    }
                    i25++;
                    w0Var2 = this;
                    i23 = intValue2;
                    i24 = lineBottom;
                    lineCount = i26;
                    H2 = paint5;
                    H = paint7;
                    f6Var3 = f6Var2;
                    arrayList3 = arrayList2;
                }
                paint = H;
                paint2 = H2;
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
                    this.M.getLineBottom(i31);
                    float f19 = measuredWidth - (intValue3 / 2);
                    int i32 = (i31 == i30 || intValue3 >= intValue4 || i31 == 0 || intValue3 >= i13) ? dp2 : dp5;
                    if (i31 == i30 || intValue3 > intValue4) {
                        arrayList5 = arrayList;
                        f13 = f19;
                        i14 = i32;
                        rectF.set(f13 - i22, dp3 - (dp * 2), f13 + dp4 + dp, dp3);
                        s();
                        path.arcTo(rectF, 90.0f, 90.0f);
                    } else if (intValue3 < intValue4) {
                        float f20 = f19 - i22;
                        arrayList5 = arrayList;
                        f13 = f19;
                        i14 = i32;
                        rectF.set(f20 - (i32 * 2), dp3 - r2, f20, dp3);
                        s();
                        path.arcTo(rectF, 90.0f, -90.0f);
                    } else {
                        arrayList5 = arrayList;
                        f13 = f19;
                        i14 = i32;
                    }
                    dp3 -= ((Integer) arrayList4.get(i31)).intValue();
                    if (i31 == 0 || intValue3 > i13) {
                        rectF.set(f13 - i22, dp3, f13 + dp4 + dp, (dp * 2) + dp3);
                        s();
                        path.arcTo(rectF, 180.0f, 90.0f);
                    } else if (intValue3 < i13) {
                        float f21 = f13 - i22;
                        rectF.set(f21 - (i14 * 2), dp3, f21, r9 + dp3);
                        s();
                        path.arcTo(rectF, 0.0f, -90.0f);
                    }
                    i31--;
                }
                w0Var = this;
                path.close();
                if (w0Var.M() && !w0Var.N()) {
                    rectF.left = (f15 - (w0Var.N / 2.0f)) - AndroidUtilities.dp(17.0f);
                    rectF.top = dp3;
                    rectF.right = (w0Var.N / 2.0f) + f15 + AndroidUtilities.dp(17.0f);
                    rectF.bottom = AndroidUtilities.dp(28.0f) + dp3 + w0Var.O + w0Var.Q;
                    path.reset();
                    path.addRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
                    path.close();
                }
            } else {
                paint = H;
                paint2 = H2;
                f6Var = f6Var3;
                f7 = 6.0f;
                f10 = 8.0f;
                f11 = 2.0f;
                f12 = 4.0f;
                w0Var = w0Var2;
            }
            if (!w0Var.w0) {
                w0Var.v0 = ((ViewGroup) w0Var.getParent()).getMeasuredHeight();
            }
            if (f6Var != null) {
                f6Var.l(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(f12), w0Var.getMeasuredWidth(), w0Var.v0);
            } else {
                org.telegram.ui.ActionBar.j6.q(w0Var.u0, w0Var.t0 + AndroidUtilities.dp(f12), w0Var.getMeasuredWidth(), w0Var.v0);
            }
            if (!z10 || (w0Var.getAlpha() == 1.0f && !(w0Var instanceof dk))) {
                paint3 = paint2;
                paint4 = paint;
                boolean z12 = w0Var instanceof dk;
                if (z12) {
                    int alpha = paint4.getAlpha();
                    int alpha2 = paint3.getAlpha();
                    paint4.setAlpha((int) (alpha * (z12 ? 0.75f : 1.0f)));
                    paint3.setAlpha((int) (alpha2 * (z12 ? 0.75f : 1.0f)));
                    i10 = alpha;
                    i11 = alpha2;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
            } else {
                i10 = paint.getAlpha();
                i11 = paint2.getAlpha();
                boolean z13 = w0Var instanceof dk;
                paint4 = paint;
                paint4.setAlpha((int) (w0Var.getAlpha() * i10 * (z13 ? 0.75f : 1.0f)));
                float alpha3 = w0Var.getAlpha() * i11;
                float f22 = z13 ? 0.75f : 1.0f;
                paint3 = paint2;
                paint3.setAlpha((int) (alpha3 * f22));
            }
            MessageObject messageObject = w0Var.H0;
            if (messageObject == null || !messageObject.isRepostPreview) {
                canvas2 = canvas;
                canvas2.drawPath(path, paint4);
                if (w0Var.J() && paint3.getAlpha() > 0) {
                    canvas2.drawPath(path, paint3);
                }
                if (w0Var.S1 > 0.0f) {
                    Paint paint8 = w0Var.T1;
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
            MessageObject messageObject2 = w0Var.H0;
            zh.y3 y3Var = w0Var.F0;
            if (y3Var.d()) {
                float dp6 = y3Var.Q.e + AndroidUtilities.dp(f10);
                float width = (w0Var.getWidth() - dp6) / f11;
                float dp7 = y3Var.p ? 0.0f : AndroidUtilities.dp(12.0f) + w0Var.S + w0Var.O;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(width, dp7, dp6 + width, y3Var.M + dp7 + AndroidUtilities.dp(f10));
                if (w0Var.E1 == null) {
                    w0Var.E1 = new RectF();
                }
                w0Var.E1.set(rectF2);
                canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.J()) {
                    canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.G0 != null) {
                float dp8 = AndroidUtilities.dp(174.0f);
                gy0 gy0Var = w0Var.G0;
                gy0Var.getClass();
                float dp9 = AndroidUtilities.dp(140.0f) + ((int) gy0Var.f.j()) + (gy0Var.i ? AndroidUtilities.dp(40.0f) : 0);
                float width2 = (w0Var.getWidth() - dp8) / f11;
                if (w0Var.E1 == null) {
                    w0Var.E1 = new RectF();
                }
                w0Var.E1.set(width2, AndroidUtilities.dp(f12), dp8 + width2, AndroidUtilities.dp(f12) + dp9);
                canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint4);
                if (w0Var.J()) {
                    canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint3);
                }
            } else if (w0Var.L(messageObject2)) {
                float width3 = (w0Var.getWidth() - w0Var.a1) / f11;
                float f23 = w0Var.S + w0Var.O;
                if (w0Var.N()) {
                    float dp10 = f23 + AndroidUtilities.dp(f12);
                    AndroidUtilities.rectTmp.set(width3, dp10, w0Var.a1 + width3, w0Var.f + dp10);
                } else {
                    float dp11 = f23 + AndroidUtilities.dp(12.0f);
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f24 = w0Var.a1;
                    rectF3.set(width3, dp11, width3 + f24, f24 + dp11 + w0Var.C1);
                }
                if (messageObject2 != null && messageObject2.type == 18 && !w0Var.g1 && (u0Var = w0Var.k1) != null && w0Var.h1 > 0) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    rectF4.bottom = com.google.android.gms.internal.vision.e2.b(1.0f, w0Var.i1.c, ((StaticLayout) u0Var.f).getHeight() - w0Var.h1, rectF4.bottom);
                }
                if (w0Var.E1 == null) {
                    w0Var.E1 = new RectF();
                }
                w0Var.E1.set(AndroidUtilities.rectTmp);
                if (messageObject2 == null || (!((i12 = messageObject2.type) == 33 || i12 == 35) || w0Var.Q1 == null)) {
                    canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint4);
                    if (w0Var.J()) {
                        canvas2.drawRoundRect(w0Var.E1, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint3);
                    }
                } else {
                    float dp12 = AndroidUtilities.dp(16.0f);
                    float[] fArr = w0Var.Y1;
                    Arrays.fill(fArr, dp12);
                    float dp13 = AndroidUtilities.dp(f7);
                    fArr[7] = dp13;
                    fArr[6] = dp13;
                    fArr[5] = dp13;
                    fArr[4] = dp13;
                    Path path2 = w0Var.X1;
                    path2.rewind();
                    path2.addRoundRect(w0Var.E1, fArr, Path.Direction.CW);
                    canvas2.drawPath(path2, paint4);
                    if (w0Var.J()) {
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

    public w0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.n = new zc(this);
        int i10 = UserConfig.selectedAccount;
        this.H = i10;
        bi.j9 j9Var = new bi.j9(null, false);
        this.d0 = j9Var;
        this.m0 = true;
        this.o0 = new RectF();
        this.p0 = new ArrayList();
        this.q0 = new Stack();
        this.C0 = new ah.k1(this);
        this.L0 = -1;
        this.M0 = -1;
        this.P0 = new ArrayList();
        this.Q0 = new ArrayList();
        this.R0 = new Path();
        this.U0 = new RectF();
        this.V0 = true;
        this.W0 = false;
        this.f1 = false;
        this.g1 = false;
        this.i1 = new org.telegram.ui.Components.e6(this, 0L, 320L, pr.h);
        this.q1 = true;
        TextPaint textPaint = new TextPaint(1);
        this.w1 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.x1 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.y1 = textPaint3;
        this.B1 = new RadialProgress2(this, null);
        this.F1 = new la(this, 2);
        this.M1 = new Path();
        this.P1 = new ArrayList();
        this.T1 = new Paint(1);
        this.X1 = new Path();
        this.Y1 = new float[8];
        this.Z1 = new float[8];
        this.a2 = new Path();
        this.b2 = new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed};
        this.i2 = new v0(this);
        j9Var.a = false;
        this.s = z10;
        this.Y0 = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.I = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.roundMessageSize / 2);
        this.L = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.w = DownloadController.getInstance(i10).generateObserverTag();
        this.F0 = new zh.y3(i10, this, f6Var);
        textPaint.setTextSize(TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics()));
        textPaint3.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        textPaint2.setTextSize(TypedValue.applyDimension(1, 15.0f, getResources().getDisplayMetrics()));
        View view = new View(context);
        this.L1 = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, -16777216), 7, AndroidUtilities.dp(16.0f)));
        view.setVisibility(8);
        addView(view);
        sg.y1 y1Var = new sg.y1(10);
        this.N1 = y1Var;
        y1Var.N = 100;
        y1Var.J = false;
        y1Var.M = true;
        y1Var.G = false;
        y1Var.K = true;
        y1Var.H = true;
        y1Var.r = 1;
        y1Var.w = 0.98f;
        y1Var.v = 0.98f;
        y1Var.u = 0.98f;
        y1Var.g = false;
        y1Var.o = 0.0f;
        y1Var.x = 750L;
        y1Var.y = 750;
        y1Var.c();
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        View view = this.v;
        if (view != null) {
            view.invalidate();
        }
        if (!this.e2 || getParent() == null) {
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
        if (!this.e2 || getParent() == null) {
            return;
        }
        View view2 = (View) getParent();
        if (view2.getParent() != null) {
            view2.invalidate();
            ((View) view2.getParent()).invalidate();
        }
    }

    @Override // org.telegram.ui.Cells.n4
    public final /* synthetic */ void e(boolean z10, boolean z11) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
