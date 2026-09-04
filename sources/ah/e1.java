package ah;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Random;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.w1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.q5;
import org.telegram.ui.co;
import org.telegram.ui.s61;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class e1 {
    public static e1 B;
    public static e1 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final c1 b;
    public final c1 c;
    public final c1 d;
    public final FrameLayout e;
    public final e1 f;
    public float g;
    public float h;
    public final b1 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final j1 p;
    public float q;
    public float r;
    public boolean s;
    public final dk0 t;
    public boolean u;
    public final View v;
    public boolean w;
    public long y;
    public boolean z;
    public final int[] j = new int[2];
    public final ArrayList x = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029b  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v38, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r5v39, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r5v46, types: [org.telegram.ui.Components.xi0] */
    /* JADX WARN: Type inference failed for: r5v50, types: [org.telegram.ui.Components.xi0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e1(Context context, n2 n2Var, fk0 fk0Var, View view, View view2, float f7, float f10, j1 j1Var, int i10, int i11, boolean z10) {
        MessageObject messageObject;
        Context context2;
        View view3;
        h1 h1Var;
        long j3;
        MessageObject messageObject2;
        fk0 fk0Var2;
        int i12;
        View view4;
        n2 n2Var2;
        co coVar;
        float f11;
        float f12;
        float f13;
        int i13;
        float f14;
        int round;
        int i14;
        int i15;
        FrameLayout frameLayout;
        b1 b1Var;
        c1 c1Var;
        c1 c1Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r11;
        int i16;
        c1 c1Var3;
        MessageObject messageObject3;
        int i17;
        int i18;
        boolean z11;
        co coVar2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z10;
        boolean z12 = view instanceof t1;
        if (z12) {
            messageObject = ((t1) view).getMessageObject();
            this.n = messageObject.getId();
            this.o = messageObject.getGroupId();
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
            this.n = messageObject.getId();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            messageObject = null;
        }
        this.p = j1Var;
        this.a = i11;
        this.v = view;
        h1 l4 = z12 ? ((t1) view).N.l(j1Var) : view instanceof org.telegram.ui.Cells.w0 ? ((org.telegram.ui.Cells.w0) view).C0.l(j1Var) : null;
        if (z10 && i11 == 2) {
            view3 = view2;
            h1Var = l4;
            j3 = 0;
            messageObject2 = messageObject;
            fk0Var2 = fk0Var;
            view4 = view;
            n2Var2 = n2Var;
            e1 e1Var = new e1(context, n2Var2, fk0Var2, view4, view3, f7, f10, j1Var, i10, 1, true);
            context2 = context;
            i12 = i10;
            this.f = e1Var;
            C = e1Var;
        } else {
            context2 = context;
            view3 = view2;
            h1Var = l4;
            j3 = 0;
            messageObject2 = messageObject;
            fk0Var2 = fk0Var;
            i12 = i10;
            view4 = view;
            n2Var2 = n2Var;
        }
        co coVar3 = n2Var2 instanceof co ? (co) n2Var2 : null;
        if (fk0Var2 != null) {
            bi.o0 o0Var = fk0Var2.b;
            int i19 = 0;
            while (true) {
                if (i19 >= o0Var.getChildCount()) {
                    break;
                }
                if ((o0Var.getChildAt(i19) instanceof dk0) && ((dk0) o0Var.getChildAt(i19)).e.equals(this.p)) {
                    this.t = (dk0) o0Var.getChildAt(i19);
                    break;
                }
                i19++;
            }
        }
        if (i11 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (messageObject2 == null || (tL_messageReactions = messageObject2.messageOwner.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && coVar3 != null && coVar3.a() < j3) {
                f11 = 0.0f;
                int i20 = 0;
                while (i20 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i20).reaction) && arrayList.get(i20).unread) {
                        i9 i9Var = new i9((f6) null);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        long peerId = MessageObject.getPeerId(arrayList.get(i20).peer_id);
                        if (peerId < j3) {
                            coVar2 = coVar3;
                            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerId));
                            if (chat != null) {
                                i9Var.k(i12, chat);
                                imageReceiver.setForUserOrChat(chat, i9Var);
                                d1 d1Var = new d1();
                                d1Var.a = imageReceiver;
                                d1Var.e = a4.a.e(p6.c(random, 100), 100.0f, 0.1f, 0.3f);
                                d1Var.h = a4.a.e(p6.c(random, 100), 100.0f, 0.4f, 0.8f);
                                d1Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                d1Var.b = (int) a4.a.e(p6.c(random, 100), 100.0f, 200.0f, 400.0f);
                                float f15 = 0.6f;
                                float f16 = 0.2f;
                                if (this.x.isEmpty()) {
                                    int i21 = 0;
                                    float f17 = 0.0f;
                                    float f18 = 0.0f;
                                    float f19 = 0.0f;
                                    while (i21 < 10) {
                                        int i22 = i21;
                                        float A = a4.a.A(p6.c(random, 100), f15, 100.0f, f16);
                                        float A2 = a4.a.A(p6.c(random, 100), 0.4f, 100.0f, f16);
                                        float f20 = 2.14748365E9f;
                                        for (int i23 = 0; i23 < this.x.size(); i23++) {
                                            float f21 = ((d1) this.x.get(i23)).f - A;
                                            float f22 = ((d1) this.x.get(i23)).g - A2;
                                            float f23 = (f22 * f22) + (f21 * f21);
                                            if (f23 < f20) {
                                                f20 = f23;
                                            }
                                        }
                                        if (f20 > f17) {
                                            f18 = A;
                                            f19 = A2;
                                            f17 = f20;
                                        }
                                        i21 = i22 + 1;
                                        f15 = 0.6f;
                                        f16 = 0.2f;
                                    }
                                    d1Var.f = f18;
                                    d1Var.g = f19;
                                } else {
                                    d1Var.f = a4.a.A(p6.c(random, 100), 0.6f, 100.0f, 0.2f);
                                    d1Var.g = (p6.c(random, 100) * 0.4f) / 100.0f;
                                }
                                this.x.add(d1Var);
                            }
                        } else {
                            coVar2 = coVar3;
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
                            if (user != null) {
                                i9Var.m(i12, user);
                                imageReceiver.setForUserOrChat(user, i9Var);
                                d1 d1Var2 = new d1();
                                d1Var2.a = imageReceiver;
                                d1Var2.e = a4.a.e(p6.c(random, 100), 100.0f, 0.1f, 0.3f);
                                d1Var2.h = a4.a.e(p6.c(random, 100), 100.0f, 0.4f, 0.8f);
                                d1Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                d1Var2.b = (int) a4.a.e(p6.c(random, 100), 100.0f, 200.0f, 400.0f);
                                float f152 = 0.6f;
                                float f162 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(d1Var2);
                            }
                        }
                    } else {
                        coVar2 = coVar3;
                    }
                    i20++;
                    i12 = i10;
                    coVar3 = coVar2;
                }
                coVar = coVar3;
                dk0 dk0Var = this.t;
                boolean z13 = dk0Var == null || !(f7 == f11 || f10 == f11);
                if (view3 == null) {
                    view3.getLocationOnScreen(this.j);
                    int[] iArr = this.j;
                    float f24 = iArr[0];
                    float f25 = iArr[1];
                    f14 = view3.getScaleX() * view3.getWidth();
                    if (view3 instanceof s61) {
                        float f26 = ((s61) view3).G;
                        if (f26 > f11) {
                            f14 = view3.getWidth() * ((f26 * 2.0f) + 1.0f);
                            f24 = w1.y(f14, view3.getWidth(), 2.0f, f24);
                            f25 -= f14 - view3.getWidth();
                        }
                    }
                    f13 = f25;
                    f12 = f24;
                } else {
                    if (dk0Var == null) {
                        if (h1Var != null) {
                            ImageReceiver imageReceiver2 = h1Var.C;
                            view4.getLocationInWindow(this.j);
                            float imageX = this.j[0] + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageX());
                            float imageY = this.j[1] + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageY());
                            if (imageReceiver2 == null) {
                                f12 = imageX;
                                f13 = imageY;
                            } else {
                                f14 = imageReceiver2.getImageHeight();
                                f12 = imageX;
                                f13 = imageY;
                            }
                        } else if (view4 != null) {
                            ((View) view4.getParent()).getLocationInWindow(this.j);
                            int[] iArr2 = this.j;
                            f13 = iArr2[1] + f10 + (view4 instanceof t1 ? ((t1) view4).V : 0);
                            f12 = iArr2[0] + f7;
                        } else {
                            f12 = f7;
                            f13 = f10;
                        }
                        i13 = 2;
                        f14 = 0.0f;
                        if (i11 == i13) {
                            int dp = AndroidUtilities.dp((z10 && SharedConfig.deviceIsHigh()) ? 60.0f : 34.0f);
                            round = (int) ((dp * 2.0f) / AndroidUtilities.density);
                            i14 = dp;
                        } else if (i11 != 1) {
                            int dp2 = AndroidUtilities.dp(350.0f);
                            Point point = AndroidUtilities.displaySize;
                            int round2 = Math.round(Math.min(dp2, Math.min(point.x, point.y)) * 0.8f);
                            int dp3 = AndroidUtilities.dp(350.0f);
                            Point point2 = AndroidUtilities.displaySize;
                            round = (int) (Math.round(Math.min(dp3, Math.min(point2.x, point2.y)) * 0.7f) / AndroidUtilities.density);
                            i14 = round2;
                        } else if (z10) {
                            i14 = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 240.0f : 140.0f);
                            round = SharedConfig.deviceIsHigh() ? (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density) : e();
                        } else {
                            i14 = AndroidUtilities.dp(80.0f);
                            round = e();
                        }
                        i15 = i14 >> 1;
                        int i24 = round >> 1;
                        float f27 = f14 / i15;
                        this.g = 0.0f;
                        this.h = 0.0f;
                        frameLayout = new FrameLayout(context2);
                        this.e = frameLayout;
                        int i25 = round;
                        View view5 = view4;
                        int i26 = i14;
                        MessageObject messageObject4 = messageObject2;
                        b1Var = new b1(this, context2, n2Var, view5, z10, messageObject4, coVar, i15, i11, z13, f27, f12, f13, j1Var);
                        this.i = b1Var;
                        c1Var = new c1(this, context2);
                        this.b = c1Var;
                        c1Var2 = new c1(this, context2);
                        this.c = c1Var2;
                        c1 c1Var4 = new c1(this, context2);
                        this.d = c1Var4;
                        tL_availableReaction = j1Var.f != null ? MediaDataController.getInstance(i10).getReactionsMap().get(this.p.f) : null;
                        if (tL_availableReaction != null && j1Var.g == j3) {
                            this.l = true;
                            return;
                        }
                        if (tL_availableReaction != null) {
                            int i27 = 2;
                            if (i11 != 2) {
                                if ((i11 == 1 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_CHAT)) || i11 == 0) {
                                    TLRPC.Document document = i11 == 1 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                                    String a2 = i11 == 1 ? a() : a4.a.k(i25, i25, "_");
                                    ImageReceiver imageReceiver3 = c1Var.getImageReceiver();
                                    StringBuilder sb2 = new StringBuilder();
                                    int i28 = D;
                                    D = i28 + 1;
                                    sb2.append(i28);
                                    sb2.append("_");
                                    sb2.append(this.n);
                                    sb2.append("_");
                                    imageReceiver3.setUniqKeyPrefix(sb2.toString());
                                    c1Var.j(ImageLocation.getForDocument(document), a2, null, null, 0, null);
                                    z11 = false;
                                    c1Var.getImageReceiver().setAutoRepeat(0);
                                    c1Var.getImageReceiver().setAllowStartAnimation(false);
                                } else {
                                    z11 = false;
                                }
                                if (c1Var.getImageReceiver().getLottieAnimation() != null) {
                                    c1Var.getImageReceiver().getLottieAnimation().L(z11 ? 1 : 0, z11, z11);
                                    c1Var.getImageReceiver().getLottieAnimation().start();
                                }
                                i27 = 2;
                                r11 = z11;
                            } else {
                                r11 = 0;
                            }
                            if (i11 == i27) {
                                TLRPC.Document document2 = z10 ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                                ImageReceiver imageReceiver4 = c1Var2.getImageReceiver();
                                StringBuilder sb3 = new StringBuilder();
                                int i29 = D;
                                D = i29 + 1;
                                sb3.append(i29);
                                sb3.append("_");
                                sb3.append(this.n);
                                sb3.append("_");
                                imageReceiver4.setUniqKeyPrefix(sb3.toString());
                                c1Var2.j(ImageLocation.getForDocument(document2), a4.a.k(i24, i24, "_"), null, null, 0, null);
                            } else if (i11 == 0) {
                                TLRPC.Document document3 = tL_availableReaction.activate_animation;
                                ImageReceiver imageReceiver5 = c1Var2.getImageReceiver();
                                StringBuilder sb4 = new StringBuilder();
                                int i30 = D;
                                D = i30 + 1;
                                sb4.append(i30);
                                sb4.append("_");
                                sb4.append(this.n);
                                sb4.append("_");
                                imageReceiver5.setUniqKeyPrefix(sb4.toString());
                                c1Var2.j(ImageLocation.getForDocument(document3), a4.a.k(i24, i24, "_"), null, null, 0, null);
                            }
                            c1Var3 = c1Var4;
                        } else {
                            r11 = 0;
                            r11 = 0;
                            if (i11 == 0) {
                                i16 = i10;
                                q5 q5Var = new q5(1, i16, j1Var.g);
                                q5Var.o(c1Var2);
                                c1Var2.H = q5Var;
                                if (c1Var2.J) {
                                    q5Var.a(c1Var2);
                                }
                            } else {
                                i16 = i10;
                                if (i11 == 2) {
                                    c1Var3 = c1Var4;
                                    messageObject3 = messageObject4;
                                    q5 q5Var2 = new q5(2, i16, j1Var.g);
                                    q5Var2.o(c1Var2);
                                    c1Var2.H = q5Var2;
                                    if (c1Var2.J) {
                                        q5Var2.a(c1Var2);
                                    }
                                    if (i11 != 0 || i11 == 1) {
                                        q5 q5Var3 = new q5(2, i16, j1Var.g);
                                        q5Var3.setColorFilter(new PorterDuffColorFilter(messageObject3 == null ? j6.v0(messageObject3.shouldDrawWithoutBackground() ? messageObject3.isOutOwner() ? j6.Sb : j6.Cj : messageObject3.isOutOwner() ? j6.Gj : j6.Fj, n2Var != null ? n2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                                        boolean z14 = i11 != 0;
                                        c1Var.I = e.a(q5Var3, z14, !z14);
                                        b1Var.setClipChildren(false);
                                    }
                                }
                            }
                            c1Var3 = c1Var4;
                            messageObject3 = messageObject4;
                            if (i11 != 0) {
                            }
                            q5 q5Var32 = new q5(2, i16, j1Var.g);
                            if (messageObject3 == null) {
                            }
                            q5Var32.setColorFilter(new PorterDuffColorFilter(messageObject3 == null ? j6.v0(messageObject3.shouldDrawWithoutBackground() ? messageObject3.isOutOwner() ? j6.Sb : j6.Cj : messageObject3.isOutOwner() ? j6.Gj : j6.Fj, n2Var != null ? n2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                            if (i11 != 0) {
                            }
                            c1Var.I = e.a(q5Var32, z14, !z14);
                            b1Var.setClipChildren(false);
                        }
                        c1Var2.getImageReceiver().setAutoRepeat(r11);
                        c1Var2.getImageReceiver().setAllowStartAnimation(r11);
                        if (c1Var2.getImageReceiver().getLottieAnimation() != null) {
                            if (i11 == 2) {
                                c1Var2.getImageReceiver().getLottieAnimation().L(c1Var2.getImageReceiver().getLottieAnimation().e[r11] - 1, r11, r11);
                            } else {
                                c1Var2.getImageReceiver().getLottieAnimation().L(r11, r11, r11);
                                c1Var2.getImageReceiver().getLottieAnimation().start();
                            }
                        }
                        i17 = i26 - i15;
                        i18 = i17 >> 1;
                        i17 = i11 == 1 ? i18 : i17;
                        frameLayout.addView(c1Var2);
                        c1Var2.getLayoutParams().width = i15;
                        c1Var2.getLayoutParams().height = i15;
                        ((FrameLayout.LayoutParams) c1Var2.getLayoutParams()).topMargin = i18;
                        ((FrameLayout.LayoutParams) c1Var2.getLayoutParams()).leftMargin = i17;
                        if (i11 != 1 && !z10) {
                            if (tL_availableReaction != null) {
                                c1Var3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                            }
                            frameLayout.addView(c1Var3);
                            c1Var3.getLayoutParams().width = i15;
                            c1Var3.getLayoutParams().height = i15;
                            ((FrameLayout.LayoutParams) c1Var3.getLayoutParams()).topMargin = i18;
                            ((FrameLayout.LayoutParams) c1Var3.getLayoutParams()).leftMargin = i17;
                        }
                        b1Var.addView(frameLayout);
                        frameLayout.getLayoutParams().width = i26;
                        frameLayout.getLayoutParams().height = i26;
                        int i31 = -i18;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i31;
                        int i32 = -i17;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i32;
                        b1Var.addView(c1Var);
                        c1Var.getLayoutParams().width = i26;
                        c1Var.getLayoutParams().height = i26;
                        c1Var.getLayoutParams().width = i26;
                        c1Var.getLayoutParams().height = i26;
                        ((FrameLayout.LayoutParams) c1Var.getLayoutParams()).topMargin = i31;
                        ((FrameLayout.LayoutParams) c1Var.getLayoutParams()).leftMargin = i32;
                        frameLayout.setPivotX(i17);
                        frameLayout.setPivotY(i18);
                    }
                    dk0Var.getLocationOnScreen(this.j);
                    float x10 = this.j[0] + this.t.b.getX();
                    float y3 = this.j[1] + this.t.b.getY();
                    f14 = this.t.getScaleX() * this.t.b.getWidth();
                    f12 = x10;
                    f13 = y3;
                }
                i13 = 2;
                if (i11 == i13) {
                }
                i15 = i14 >> 1;
                int i242 = round >> 1;
                float f272 = f14 / i15;
                this.g = 0.0f;
                this.h = 0.0f;
                frameLayout = new FrameLayout(context2);
                this.e = frameLayout;
                int i252 = round;
                View view52 = view4;
                int i262 = i14;
                MessageObject messageObject42 = messageObject2;
                b1Var = new b1(this, context2, n2Var, view52, z10, messageObject42, coVar, i15, i11, z13, f272, f12, f13, j1Var);
                this.i = b1Var;
                c1Var = new c1(this, context2);
                this.b = c1Var;
                c1Var2 = new c1(this, context2);
                this.c = c1Var2;
                c1 c1Var42 = new c1(this, context2);
                this.d = c1Var42;
                if (j1Var.f != null) {
                }
                if (tL_availableReaction != null) {
                }
                if (tL_availableReaction != null) {
                }
                c1Var2.getImageReceiver().setAutoRepeat(r11);
                c1Var2.getImageReceiver().setAllowStartAnimation(r11);
                if (c1Var2.getImageReceiver().getLottieAnimation() != null) {
                }
                i17 = i262 - i15;
                i18 = i17 >> 1;
                if (i11 == 1) {
                }
                frameLayout.addView(c1Var2);
                c1Var2.getLayoutParams().width = i15;
                c1Var2.getLayoutParams().height = i15;
                ((FrameLayout.LayoutParams) c1Var2.getLayoutParams()).topMargin = i18;
                ((FrameLayout.LayoutParams) c1Var2.getLayoutParams()).leftMargin = i17;
                if (i11 != 1) {
                    if (tL_availableReaction != null) {
                    }
                    frameLayout.addView(c1Var3);
                    c1Var3.getLayoutParams().width = i15;
                    c1Var3.getLayoutParams().height = i15;
                    ((FrameLayout.LayoutParams) c1Var3.getLayoutParams()).topMargin = i18;
                    ((FrameLayout.LayoutParams) c1Var3.getLayoutParams()).leftMargin = i17;
                }
                b1Var.addView(frameLayout);
                frameLayout.getLayoutParams().width = i262;
                frameLayout.getLayoutParams().height = i262;
                int i312 = -i18;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i312;
                int i322 = -i17;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i322;
                b1Var.addView(c1Var);
                c1Var.getLayoutParams().width = i262;
                c1Var.getLayoutParams().height = i262;
                c1Var.getLayoutParams().width = i262;
                c1Var.getLayoutParams().height = i262;
                ((FrameLayout.LayoutParams) c1Var.getLayoutParams()).topMargin = i312;
                ((FrameLayout.LayoutParams) c1Var.getLayoutParams()).leftMargin = i322;
                frameLayout.setPivotX(i17);
                frameLayout.setPivotY(i18);
            }
        }
        coVar = coVar3;
        f11 = 0.0f;
        dk0 dk0Var2 = this.t;
        if (dk0Var2 == null) {
        }
        if (view3 == null) {
        }
        i13 = 2;
        if (i11 == i13) {
        }
        i15 = i14 >> 1;
        int i2422 = round >> 1;
        float f2722 = f14 / i15;
        this.g = 0.0f;
        this.h = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.e = frameLayout;
        int i2522 = round;
        View view522 = view4;
        int i2622 = i14;
        MessageObject messageObject422 = messageObject2;
        b1Var = new b1(this, context2, n2Var, view522, z10, messageObject422, coVar, i15, i11, z13, f2722, f12, f13, j1Var);
        this.i = b1Var;
        c1Var = new c1(this, context2);
        this.b = c1Var;
        c1Var2 = new c1(this, context2);
        this.c = c1Var2;
        c1 c1Var422 = new c1(this, context2);
        this.d = c1Var422;
        if (j1Var.f != null) {
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction != null) {
        }
        c1Var2.getImageReceiver().setAutoRepeat(r11);
        c1Var2.getImageReceiver().setAllowStartAnimation(r11);
        if (c1Var2.getImageReceiver().getLottieAnimation() != null) {
        }
        i17 = i2622 - i15;
        i18 = i17 >> 1;
        if (i11 == 1) {
        }
        frameLayout.addView(c1Var2);
        c1Var2.getLayoutParams().width = i15;
        c1Var2.getLayoutParams().height = i15;
        ((FrameLayout.LayoutParams) c1Var2.getLayoutParams()).topMargin = i18;
        ((FrameLayout.LayoutParams) c1Var2.getLayoutParams()).leftMargin = i17;
        if (i11 != 1) {
        }
        b1Var.addView(frameLayout);
        frameLayout.getLayoutParams().width = i2622;
        frameLayout.getLayoutParams().height = i2622;
        int i3122 = -i18;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i3122;
        int i3222 = -i17;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i3222;
        b1Var.addView(c1Var);
        c1Var.getLayoutParams().width = i2622;
        c1Var.getLayoutParams().height = i2622;
        c1Var.getLayoutParams().width = i2622;
        c1Var.getLayoutParams().height = i2622;
        ((FrameLayout.LayoutParams) c1Var.getLayoutParams()).topMargin = i3122;
        ((FrameLayout.LayoutParams) c1Var.getLayoutParams()).leftMargin = i3222;
        frameLayout.setPivotX(i17);
        frameLayout.setPivotY(i18);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        int i10 = 0;
        while (i10 < 2) {
            e1 e1Var = i10 == 0 ? B : C;
            if (e1Var != null) {
                if (z10) {
                    e1Var.c();
                } else {
                    e1Var.l = true;
                }
            }
            i10++;
        }
        C = null;
        B = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r22 != 2) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r1.isShowing() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d(n2 n2Var, fk0 fk0Var, View view, View view2, float f7, float f10, j1 j1Var, int i10, int i11) {
        if (view == null || j1Var == null || n2Var == null || n2Var.getParentActivity() == null) {
            return;
        }
        boolean z10 = true;
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i11 == 2 || i11 == 0) {
                d(n2Var, null, view, view2, 0.0f, 0.0f, j1Var, i10, 1);
            }
            e1 e1Var = new e1(n2Var.getParentActivity(), n2Var, fk0Var, view, view2, f7, f10, j1Var, i10, i11, false);
            if (i11 == 1) {
                C = e1Var;
            } else {
                B = e1Var;
            }
            if (n2Var instanceof co) {
                co coVar = (co) n2Var;
                if (i11 != 0) {
                }
                org.telegram.ui.ActionBar.n1 n1Var = coVar.Q8;
                if (n1Var != null) {
                }
            }
            z10 = false;
            e1Var.w = z10;
            if (z10) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = n2Var.getParentActivity().getWindowManager();
                e1Var.k = windowManager;
                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, e1Var.i, layoutParams);
                e1Var.k.addView(e1Var.i, layoutParams);
            } else {
                ((FrameLayout) n2Var.getParentActivity().getWindow().getDecorView()).addView(e1Var.i);
            }
            view.invalidate();
            if (!(view instanceof t1) || ((t1) view).getCurrentMessagesGroup() == null || view.getParent() == null) {
                return;
            }
            ((View) view.getParent()).invalidate();
        }
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        e1 e1Var = B;
        if (e1Var != null) {
            e1Var.s = true;
            e1Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        e1 e1Var2 = C;
        if (e1Var2 != null) {
            View view = e1Var2.v;
            if (view instanceof t1) {
                ((t1) view).N.b(e1Var2.p);
            } else if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).C0.b(e1Var2.p);
            }
        }
    }

    public static void g() {
        e1 e1Var = C;
        if (e1Var == null || e1Var.s) {
            return;
        }
        e1Var.s = true;
        e1Var.y = System.currentTimeMillis();
        if (C.a != 1 || System.currentTimeMillis() - E <= 200) {
            return;
        }
        E = System.currentTimeMillis();
        View view = C.v;
        if (view != null) {
            view.performHapticFeedback(3);
        }
    }

    public final void c() {
        try {
            boolean z10 = this.w;
            b1 b1Var = this.i;
            if (z10) {
                this.k.removeView(b1Var);
            } else {
                AndroidUtilities.removeFromParent(b1Var);
            }
        } catch (Exception unused) {
        }
    }
}
