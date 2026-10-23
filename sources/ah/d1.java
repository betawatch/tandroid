package ah;

import ai.u1;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.r5;
import org.telegram.ui.k51;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class d1 {
    public static d1 B;
    public static d1 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final b1 b;
    public final b1 c;
    public final b1 d;
    public final FrameLayout e;
    public final d1 f;
    public float g;
    public float h;
    public final a1 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final i1 p;
    public float q;
    public float r;
    public boolean s;
    public final el0 t;
    public boolean u;
    public final View v;
    public boolean w;
    public long y;
    public boolean z;
    public final int[] j = new int[2];
    public final ArrayList x = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x06b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x029a  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v38, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r5v39, types: [org.telegram.messenger.ImageReceiver] */
    /* JADX WARN: Type inference failed for: r5v46, types: [org.telegram.ui.Components.yj0] */
    /* JADX WARN: Type inference failed for: r5v50, types: [org.telegram.ui.Components.yj0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d1(Context context, o2 o2Var, gl0 gl0Var, View view, View view2, float f7, float f10, i1 i1Var, int i10, int i11, boolean z10) {
        MessageObject messageObject;
        Context context2;
        View view3;
        g1 g1Var;
        long j10;
        MessageObject messageObject2;
        gl0 gl0Var2;
        int i12;
        View view4;
        o2 o2Var2;
        sn snVar;
        int i13;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        int i14;
        int round;
        int i15;
        int i16;
        FrameLayout frameLayout;
        a1 a1Var;
        ?? r15;
        b1 b1Var;
        b1 b1Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r11;
        int i17;
        b1 b1Var3;
        MessageObject messageObject3;
        int i18;
        int i19;
        boolean z11;
        sn snVar2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z10;
        boolean z12 = view instanceof t1;
        if (z12) {
            messageObject = ((t1) view).getMessageObject();
            this.n = messageObject.getId();
            this.o = messageObject.getGroupId();
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
            this.n = messageObject.getId();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            messageObject = null;
        }
        this.p = i1Var;
        this.a = i11;
        this.v = view;
        g1 l4 = z12 ? ((t1) view).N.l(i1Var) : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).E0.l(i1Var) : null;
        if (z10 && i11 == 2) {
            view3 = view2;
            g1Var = l4;
            j10 = 0;
            messageObject2 = messageObject;
            gl0Var2 = gl0Var;
            view4 = view;
            o2Var2 = o2Var;
            d1 d1Var = new d1(context, o2Var2, gl0Var2, view4, view3, f7, f10, i1Var, i10, 1, true);
            context2 = context;
            i12 = i10;
            this.f = d1Var;
            C = d1Var;
        } else {
            context2 = context;
            view3 = view2;
            g1Var = l4;
            j10 = 0;
            messageObject2 = messageObject;
            gl0Var2 = gl0Var;
            i12 = i10;
            view4 = view;
            o2Var2 = o2Var;
        }
        sn snVar3 = o2Var2 instanceof sn ? (sn) o2Var2 : null;
        if (gl0Var2 != null) {
            u1 u1Var = gl0Var2.b;
            int i20 = 0;
            while (true) {
                if (i20 >= u1Var.getChildCount()) {
                    break;
                }
                if ((u1Var.getChildAt(i20) instanceof el0) && ((el0) u1Var.getChildAt(i20)).e.equals(this.p)) {
                    this.t = (el0) u1Var.getChildAt(i20);
                    break;
                }
                i20++;
            }
        }
        int i21 = 1;
        if (i11 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (messageObject2 == null || (tL_messageReactions = messageObject2.messageOwner.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && snVar3 != null && snVar3.a() < j10) {
                f11 = 0.0f;
                int i22 = 0;
                while (i22 < arrayList.size()) {
                    int i23 = i21;
                    if (this.p.equals(arrayList.get(i22).reaction) && arrayList.get(i22).unread) {
                        h9 h9Var = new h9((g6) null);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        long peerId = MessageObject.getPeerId(arrayList.get(i22).peer_id);
                        if (peerId < j10) {
                            snVar2 = snVar3;
                            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerId));
                            if (chat != null) {
                                h9Var.k(i12, chat);
                                imageReceiver.setForUserOrChat(chat, h9Var);
                                c1 c1Var = new c1();
                                c1Var.a = imageReceiver;
                                c1Var.e = a1.g.d(org.telegram.ui.Cells.b1.g(random, 100), 100.0f, 0.1f, 0.3f);
                                c1Var.h = a1.g.d(org.telegram.ui.Cells.b1.g(random, 100), 100.0f, 0.4f, 0.8f);
                                c1Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f17 = 0.4f;
                                c1Var.b = (int) a1.g.d(org.telegram.ui.Cells.b1.g(random, 100), 100.0f, 200.0f, 400.0f);
                                float f18 = 0.6f;
                                float f19 = 0.2f;
                                if (this.x.isEmpty()) {
                                    float f20 = 0.0f;
                                    float f21 = 0.0f;
                                    float f22 = 0.0f;
                                    int i24 = 0;
                                    while (i24 < 10) {
                                        int i25 = i24;
                                        float B2 = a1.g.B(org.telegram.ui.Cells.b1.g(random, 100), f18, 100.0f, f19);
                                        float B3 = a1.g.B(org.telegram.ui.Cells.b1.g(random, 100), f17, 100.0f, f19);
                                        float f23 = 2.14748365E9f;
                                        for (int i26 = 0; i26 < this.x.size(); i26++) {
                                            float f24 = ((c1) this.x.get(i26)).f - B2;
                                            float f25 = ((c1) this.x.get(i26)).g - B3;
                                            float f26 = (f25 * f25) + (f24 * f24);
                                            if (f26 < f23) {
                                                f23 = f26;
                                            }
                                        }
                                        if (f23 > f20) {
                                            f21 = B2;
                                            f22 = B3;
                                            f20 = f23;
                                        }
                                        i24 = i25 + 1;
                                        f18 = 0.6f;
                                        f19 = 0.2f;
                                        f17 = 0.4f;
                                    }
                                    c1Var.f = f21;
                                    c1Var.g = f22;
                                } else {
                                    c1Var.f = a1.g.B(org.telegram.ui.Cells.b1.g(random, 100), 0.6f, 100.0f, 0.2f);
                                    c1Var.g = (org.telegram.ui.Cells.b1.g(random, 100) * 0.4f) / 100.0f;
                                }
                                this.x.add(c1Var);
                            }
                        } else {
                            snVar2 = snVar3;
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
                            if (user != null) {
                                h9Var.m(i12, user);
                                imageReceiver.setForUserOrChat(user, h9Var);
                                c1 c1Var2 = new c1();
                                c1Var2.a = imageReceiver;
                                c1Var2.e = a1.g.d(org.telegram.ui.Cells.b1.g(random, 100), 100.0f, 0.1f, 0.3f);
                                c1Var2.h = a1.g.d(org.telegram.ui.Cells.b1.g(random, 100), 100.0f, 0.4f, 0.8f);
                                c1Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                float f172 = 0.4f;
                                c1Var2.b = (int) a1.g.d(org.telegram.ui.Cells.b1.g(random, 100), 100.0f, 200.0f, 400.0f);
                                float f182 = 0.6f;
                                float f192 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(c1Var2);
                            }
                        }
                    } else {
                        snVar2 = snVar3;
                    }
                    i22++;
                    i12 = i10;
                    snVar3 = snVar2;
                    i21 = i23;
                }
                snVar = snVar3;
                i13 = i21;
                el0 el0Var = this.t;
                ?? r10 = (el0Var == null || !(f7 == f11 || f10 == f11)) ? i13 : 0;
                if (view3 != null) {
                    if (el0Var != null) {
                        el0Var.getLocationOnScreen(this.j);
                        float x10 = this.j[0] + this.t.b.getX();
                        float y3 = this.j[i13] + this.t.b.getY();
                        f12 = this.t.getScaleX() * this.t.b.getWidth();
                        f13 = x10;
                        f14 = y3;
                    } else if (g1Var != null) {
                        ImageReceiver imageReceiver2 = g1Var.C;
                        view4.getLocationInWindow(this.j);
                        float imageX = this.j[0] + (imageReceiver2 == null ? f11 : imageReceiver2.getImageX());
                        float imageY = this.j[i13] + (imageReceiver2 == null ? f11 : imageReceiver2.getImageY());
                        f12 = imageReceiver2 == null ? f11 : imageReceiver2.getImageHeight();
                        f13 = imageX;
                        f14 = imageY;
                    } else if (view4 != null) {
                        ((View) view4.getParent()).getLocationInWindow(this.j);
                        int[] iArr = this.j;
                        f15 = iArr[0] + f7;
                        f16 = iArr[i13] + f10 + (view4 instanceof t1 ? ((t1) view4).V : 0);
                        f12 = f11;
                    } else {
                        f12 = f11;
                        f13 = f7;
                        f14 = f10;
                    }
                    if (i11 == 2) {
                        int dp = AndroidUtilities.dp((z10 && SharedConfig.deviceIsHigh()) ? 60.0f : 34.0f);
                        round = (int) ((dp * 2.0f) / AndroidUtilities.density);
                        i15 = dp;
                        i14 = i13;
                    } else {
                        i14 = i13;
                        if (i11 != i14) {
                            int dp2 = AndroidUtilities.dp(350.0f);
                            Point point = AndroidUtilities.displaySize;
                            int round2 = Math.round(Math.min(dp2, Math.min(point.x, point.y)) * 0.8f);
                            int dp3 = AndroidUtilities.dp(350.0f);
                            Point point2 = AndroidUtilities.displaySize;
                            round = (int) (Math.round(Math.min(dp3, Math.min(point2.x, point2.y)) * 0.7f) / AndroidUtilities.density);
                            i15 = round2;
                        } else if (z10) {
                            i15 = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 240.0f : 140.0f);
                            round = SharedConfig.deviceIsHigh() ? (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density) : e();
                        } else {
                            i15 = AndroidUtilities.dp(80.0f);
                            round = e();
                        }
                    }
                    i16 = i15 >> 1;
                    int i27 = round >> 1;
                    float f27 = f12 / i16;
                    float f28 = f11;
                    this.g = f28;
                    this.h = f28;
                    frameLayout = new FrameLayout(context2);
                    this.e = frameLayout;
                    int i28 = round;
                    View view5 = view4;
                    int i29 = i15;
                    MessageObject messageObject4 = messageObject2;
                    r15 = i14;
                    a1Var = new a1(this, context2, o2Var, view5, z10, messageObject4, snVar, i16, i11, r10, f27, f13, f14, i1Var);
                    this.i = a1Var;
                    b1Var = new b1(this, context2);
                    this.b = b1Var;
                    b1Var2 = new b1(this, context2);
                    this.c = b1Var2;
                    b1 b1Var4 = new b1(this, context2);
                    this.d = b1Var4;
                    tL_availableReaction = i1Var.f != null ? MediaDataController.getInstance(i10).getReactionsMap().get(this.p.f) : null;
                    if (tL_availableReaction != null && i1Var.g == j10) {
                        this.l = r15;
                        return;
                    }
                    if (tL_availableReaction != null) {
                        int i30 = 2;
                        if (i11 != 2) {
                            if ((i11 == r15 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_CHAT)) || i11 == 0) {
                                TLRPC.Document document = i11 == r15 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                                String a2 = i11 == r15 ? a() : a1.g.k(i28, i28, "_");
                                ImageReceiver imageReceiver3 = b1Var.getImageReceiver();
                                StringBuilder sb2 = new StringBuilder();
                                int i31 = D;
                                D = i31 + 1;
                                sb2.append(i31);
                                sb2.append("_");
                                sb2.append(this.n);
                                sb2.append("_");
                                imageReceiver3.setUniqKeyPrefix(sb2.toString());
                                b1Var.j(ImageLocation.getForDocument(document), a2, null, null, 0, null);
                                z11 = false;
                                b1Var.getImageReceiver().setAutoRepeat(0);
                                b1Var.getImageReceiver().setAllowStartAnimation(false);
                            } else {
                                z11 = false;
                            }
                            if (b1Var.getImageReceiver().getLottieAnimation() != null) {
                                b1Var.getImageReceiver().getLottieAnimation().N(z11 ? 1 : 0, z11, z11);
                                b1Var.getImageReceiver().getLottieAnimation().start();
                            }
                            i30 = 2;
                            r11 = z11;
                        } else {
                            r11 = 0;
                        }
                        if (i11 == i30) {
                            TLRPC.Document document2 = z10 ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                            ImageReceiver imageReceiver4 = b1Var2.getImageReceiver();
                            StringBuilder sb3 = new StringBuilder();
                            int i32 = D;
                            D = i32 + 1;
                            sb3.append(i32);
                            sb3.append("_");
                            sb3.append(this.n);
                            sb3.append("_");
                            imageReceiver4.setUniqKeyPrefix(sb3.toString());
                            b1Var2.j(ImageLocation.getForDocument(document2), a1.g.k(i27, i27, "_"), null, null, 0, null);
                        } else if (i11 == 0) {
                            TLRPC.Document document3 = tL_availableReaction.activate_animation;
                            ImageReceiver imageReceiver5 = b1Var2.getImageReceiver();
                            StringBuilder sb4 = new StringBuilder();
                            int i33 = D;
                            D = i33 + 1;
                            sb4.append(i33);
                            sb4.append("_");
                            sb4.append(this.n);
                            sb4.append("_");
                            imageReceiver5.setUniqKeyPrefix(sb4.toString());
                            b1Var2.j(ImageLocation.getForDocument(document3), a1.g.k(i27, i27, "_"), null, null, 0, null);
                        }
                        b1Var3 = b1Var4;
                    } else {
                        r11 = 0;
                        r11 = 0;
                        if (i11 == 0) {
                            i17 = i10;
                            r5 r5Var = new r5(r15 == true ? 1 : 0, i17, i1Var.g);
                            r5Var.o(b1Var2);
                            b1Var2.H = r5Var;
                            if (b1Var2.J) {
                                r5Var.a(b1Var2);
                            }
                        } else {
                            i17 = i10;
                            if (i11 == 2) {
                                b1Var3 = b1Var4;
                                messageObject3 = messageObject4;
                                r5 r5Var2 = new r5(2, i17, i1Var.g);
                                r5Var2.o(b1Var2);
                                b1Var2.H = r5Var2;
                                if (b1Var2.J) {
                                    r5Var2.a(b1Var2);
                                }
                                if (i11 != 0 || i11 == r15) {
                                    r5 r5Var3 = new r5(2, i17, i1Var.g);
                                    r5Var3.setColorFilter(new PorterDuffColorFilter(messageObject3 == null ? k6.w0(messageObject3.shouldDrawWithoutBackground() ? messageObject3.isOutOwner() ? k6.Sb : k6.Cj : messageObject3.isOutOwner() ? k6.Gj : k6.Fj, o2Var != null ? o2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                                    boolean z13 = i11 != 0 ? r15 == true ? 1 : 0 : false;
                                    b1Var.I = e.a(r5Var3, z13, !z13);
                                    a1Var.setClipChildren(false);
                                }
                            }
                        }
                        b1Var3 = b1Var4;
                        messageObject3 = messageObject4;
                        if (i11 != 0) {
                        }
                        r5 r5Var32 = new r5(2, i17, i1Var.g);
                        if (messageObject3 == null) {
                        }
                        r5Var32.setColorFilter(new PorterDuffColorFilter(messageObject3 == null ? k6.w0(messageObject3.shouldDrawWithoutBackground() ? messageObject3.isOutOwner() ? k6.Sb : k6.Cj : messageObject3.isOutOwner() ? k6.Gj : k6.Fj, o2Var != null ? o2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                        if (i11 != 0) {
                        }
                        b1Var.I = e.a(r5Var32, z13, !z13);
                        a1Var.setClipChildren(false);
                    }
                    b1Var2.getImageReceiver().setAutoRepeat(r11);
                    b1Var2.getImageReceiver().setAllowStartAnimation(r11);
                    if (b1Var2.getImageReceiver().getLottieAnimation() != null) {
                        if (i11 == 2) {
                            b1Var2.getImageReceiver().getLottieAnimation().N(b1Var2.getImageReceiver().getLottieAnimation().e[r11] - (r15 == true ? 1 : 0), r11, r11);
                        } else {
                            b1Var2.getImageReceiver().getLottieAnimation().N(r11, r11, r11);
                            b1Var2.getImageReceiver().getLottieAnimation().start();
                        }
                    }
                    i18 = i29 - i16;
                    i19 = i18 >> 1;
                    i18 = i11 == r15 ? i19 : i18;
                    frameLayout.addView(b1Var2);
                    b1Var2.getLayoutParams().width = i16;
                    b1Var2.getLayoutParams().height = i16;
                    ((FrameLayout.LayoutParams) b1Var2.getLayoutParams()).topMargin = i19;
                    ((FrameLayout.LayoutParams) b1Var2.getLayoutParams()).leftMargin = i18;
                    if (i11 != r15 && !z10) {
                        if (tL_availableReaction != null) {
                            b1Var3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                        }
                        frameLayout.addView(b1Var3);
                        b1Var3.getLayoutParams().width = i16;
                        b1Var3.getLayoutParams().height = i16;
                        ((FrameLayout.LayoutParams) b1Var3.getLayoutParams()).topMargin = i19;
                        ((FrameLayout.LayoutParams) b1Var3.getLayoutParams()).leftMargin = i18;
                    }
                    a1Var.addView(frameLayout);
                    frameLayout.getLayoutParams().width = i29;
                    frameLayout.getLayoutParams().height = i29;
                    int i34 = -i19;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i34;
                    int i35 = -i18;
                    ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i35;
                    a1Var.addView(b1Var);
                    b1Var.getLayoutParams().width = i29;
                    b1Var.getLayoutParams().height = i29;
                    b1Var.getLayoutParams().width = i29;
                    b1Var.getLayoutParams().height = i29;
                    ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).topMargin = i34;
                    ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).leftMargin = i35;
                    frameLayout.setPivotX(i18);
                    frameLayout.setPivotY(i19);
                }
                view3.getLocationOnScreen(this.j);
                int[] iArr2 = this.j;
                f15 = iArr2[0];
                f16 = iArr2[i13];
                f12 = view3.getScaleX() * view3.getWidth();
                if (view3 instanceof k51) {
                    float f29 = ((k51) view3).G;
                    if (f29 > f11) {
                        f12 = view3.getWidth() * ((f29 * 2.0f) + 1.0f);
                        f15 = org.telegram.messenger.v0.y(f12, view3.getWidth(), 2.0f, f15);
                        f16 -= f12 - view3.getWidth();
                    }
                }
                f14 = f16;
                f13 = f15;
                if (i11 == 2) {
                }
                i16 = i15 >> 1;
                int i272 = round >> 1;
                float f272 = f12 / i16;
                float f282 = f11;
                this.g = f282;
                this.h = f282;
                frameLayout = new FrameLayout(context2);
                this.e = frameLayout;
                int i282 = round;
                View view52 = view4;
                int i292 = i15;
                MessageObject messageObject42 = messageObject2;
                r15 = i14;
                a1Var = new a1(this, context2, o2Var, view52, z10, messageObject42, snVar, i16, i11, r10, f272, f13, f14, i1Var);
                this.i = a1Var;
                b1Var = new b1(this, context2);
                this.b = b1Var;
                b1Var2 = new b1(this, context2);
                this.c = b1Var2;
                b1 b1Var42 = new b1(this, context2);
                this.d = b1Var42;
                if (i1Var.f != null) {
                }
                if (tL_availableReaction != null) {
                }
                if (tL_availableReaction != null) {
                }
                b1Var2.getImageReceiver().setAutoRepeat(r11);
                b1Var2.getImageReceiver().setAllowStartAnimation(r11);
                if (b1Var2.getImageReceiver().getLottieAnimation() != null) {
                }
                i18 = i292 - i16;
                i19 = i18 >> 1;
                if (i11 == r15) {
                }
                frameLayout.addView(b1Var2);
                b1Var2.getLayoutParams().width = i16;
                b1Var2.getLayoutParams().height = i16;
                ((FrameLayout.LayoutParams) b1Var2.getLayoutParams()).topMargin = i19;
                ((FrameLayout.LayoutParams) b1Var2.getLayoutParams()).leftMargin = i18;
                if (i11 != r15) {
                    if (tL_availableReaction != null) {
                    }
                    frameLayout.addView(b1Var3);
                    b1Var3.getLayoutParams().width = i16;
                    b1Var3.getLayoutParams().height = i16;
                    ((FrameLayout.LayoutParams) b1Var3.getLayoutParams()).topMargin = i19;
                    ((FrameLayout.LayoutParams) b1Var3.getLayoutParams()).leftMargin = i18;
                }
                a1Var.addView(frameLayout);
                frameLayout.getLayoutParams().width = i292;
                frameLayout.getLayoutParams().height = i292;
                int i342 = -i19;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i342;
                int i352 = -i18;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i352;
                a1Var.addView(b1Var);
                b1Var.getLayoutParams().width = i292;
                b1Var.getLayoutParams().height = i292;
                b1Var.getLayoutParams().width = i292;
                b1Var.getLayoutParams().height = i292;
                ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).topMargin = i342;
                ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).leftMargin = i352;
                frameLayout.setPivotX(i18);
                frameLayout.setPivotY(i19);
            }
        }
        snVar = snVar3;
        i13 = 1;
        f11 = 0.0f;
        el0 el0Var2 = this.t;
        if (el0Var2 == null) {
        }
        if (view3 != null) {
        }
        f14 = f16;
        f13 = f15;
        if (i11 == 2) {
        }
        i16 = i15 >> 1;
        int i2722 = round >> 1;
        float f2722 = f12 / i16;
        float f2822 = f11;
        this.g = f2822;
        this.h = f2822;
        frameLayout = new FrameLayout(context2);
        this.e = frameLayout;
        int i2822 = round;
        View view522 = view4;
        int i2922 = i15;
        MessageObject messageObject422 = messageObject2;
        r15 = i14;
        a1Var = new a1(this, context2, o2Var, view522, z10, messageObject422, snVar, i16, i11, r10, f2722, f13, f14, i1Var);
        this.i = a1Var;
        b1Var = new b1(this, context2);
        this.b = b1Var;
        b1Var2 = new b1(this, context2);
        this.c = b1Var2;
        b1 b1Var422 = new b1(this, context2);
        this.d = b1Var422;
        if (i1Var.f != null) {
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction != null) {
        }
        b1Var2.getImageReceiver().setAutoRepeat(r11);
        b1Var2.getImageReceiver().setAllowStartAnimation(r11);
        if (b1Var2.getImageReceiver().getLottieAnimation() != null) {
        }
        i18 = i2922 - i16;
        i19 = i18 >> 1;
        if (i11 == r15) {
        }
        frameLayout.addView(b1Var2);
        b1Var2.getLayoutParams().width = i16;
        b1Var2.getLayoutParams().height = i16;
        ((FrameLayout.LayoutParams) b1Var2.getLayoutParams()).topMargin = i19;
        ((FrameLayout.LayoutParams) b1Var2.getLayoutParams()).leftMargin = i18;
        if (i11 != r15) {
        }
        a1Var.addView(frameLayout);
        frameLayout.getLayoutParams().width = i2922;
        frameLayout.getLayoutParams().height = i2922;
        int i3422 = -i19;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i3422;
        int i3522 = -i18;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i3522;
        a1Var.addView(b1Var);
        b1Var.getLayoutParams().width = i2922;
        b1Var.getLayoutParams().height = i2922;
        b1Var.getLayoutParams().width = i2922;
        b1Var.getLayoutParams().height = i2922;
        ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).topMargin = i3422;
        ((FrameLayout.LayoutParams) b1Var.getLayoutParams()).leftMargin = i3522;
        frameLayout.setPivotX(i18);
        frameLayout.setPivotY(i19);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        int i10 = 0;
        while (i10 < 2) {
            d1 d1Var = i10 == 0 ? B : C;
            if (d1Var != null) {
                if (z10) {
                    d1Var.c();
                } else {
                    d1Var.l = true;
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
    public static void d(o2 o2Var, gl0 gl0Var, View view, View view2, float f7, float f10, i1 i1Var, int i10, int i11) {
        if (view == null || i1Var == null || o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        boolean z10 = true;
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i11 == 2 || i11 == 0) {
                d(o2Var, null, view, view2, 0.0f, 0.0f, i1Var, i10, 1);
            }
            d1 d1Var = new d1(o2Var.getParentActivity(), o2Var, gl0Var, view, view2, f7, f10, i1Var, i10, i11, false);
            if (i11 == 1) {
                C = d1Var;
            } else {
                B = d1Var;
            }
            if (o2Var instanceof sn) {
                sn snVar = (sn) o2Var;
                if (i11 != 0) {
                }
                org.telegram.ui.ActionBar.m1 m1Var = snVar.c9;
                if (m1Var != null) {
                }
            }
            z10 = false;
            d1Var.w = z10;
            if (z10) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = o2Var.getParentActivity().getWindowManager();
                d1Var.k = windowManager;
                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, d1Var.i, layoutParams);
                d1Var.k.addView(d1Var.i, layoutParams);
            } else {
                ((FrameLayout) o2Var.getParentActivity().getWindow().getDecorView()).addView(d1Var.i);
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
        d1 d1Var = B;
        if (d1Var != null) {
            d1Var.s = true;
            d1Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        d1 d1Var2 = C;
        if (d1Var2 != null) {
            View view = d1Var2.v;
            if (view instanceof t1) {
                ((t1) view).N.b(d1Var2.p);
            } else if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).E0.b(d1Var2.p);
            }
        }
    }

    public static void g() {
        d1 d1Var = C;
        if (d1Var == null || d1Var.s) {
            return;
        }
        d1Var.s = true;
        d1Var.y = System.currentTimeMillis();
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
            a1 a1Var = this.i;
            if (z10) {
                this.k.removeView(a1Var);
            } else {
                AndroidUtilities.removeFromParent(a1Var);
            }
        } catch (Exception unused) {
        }
    }
}
