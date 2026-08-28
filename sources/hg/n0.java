package hg;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import gh.f1;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.z8;
import org.telegram.ui.k51;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n0 {
    public static n0 B;
    public static n0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final l0 b;
    public final l0 c;
    public final l0 d;
    public final FrameLayout e;
    public final n0 f;
    public float g;
    public float h;
    public final k0 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final r0 p;
    public float q;
    public float r;
    public boolean s;
    public final sj0 t;
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
    /* JADX WARN: Type inference failed for: r5v46, types: [org.telegram.ui.Components.mi0] */
    /* JADX WARN: Type inference failed for: r5v50, types: [org.telegram.ui.Components.mi0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n0(Context context, o2 o2Var, uj0 uj0Var, View view, View view2, float f10, float f11, r0 r0Var, int i9, int i10, boolean z10) {
        MessageObject messageObject;
        Context context2;
        View view3;
        p0 p0Var;
        long j10;
        MessageObject messageObject2;
        uj0 uj0Var2;
        int i11;
        View view4;
        o2 o2Var2;
        qn qnVar;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        int round;
        int i13;
        int i14;
        FrameLayout frameLayout;
        k0 k0Var;
        l0 l0Var;
        l0 l0Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r11;
        int i15;
        l0 l0Var3;
        MessageObject messageObject3;
        int i16;
        int i17;
        boolean z11;
        qn qnVar2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z10;
        boolean z12 = view instanceof t1;
        if (z12) {
            messageObject = ((t1) view).getMessageObject();
            this.n = messageObject.getId();
            this.o = messageObject.getGroupId();
        } else if (view instanceof w0) {
            messageObject = ((w0) view).getMessageObject();
            this.n = messageObject.getId();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            messageObject = null;
        }
        this.p = r0Var;
        this.a = i10;
        this.v = view;
        p0 l10 = z12 ? ((t1) view).J.l(r0Var) : view instanceof w0 ? ((w0) view).y0.l(r0Var) : null;
        if (z10 && i10 == 2) {
            view3 = view2;
            p0Var = l10;
            j10 = 0;
            messageObject2 = messageObject;
            uj0Var2 = uj0Var;
            view4 = view;
            o2Var2 = o2Var;
            n0 n0Var = new n0(context, o2Var2, uj0Var2, view4, view3, f10, f11, r0Var, i9, 1, true);
            context2 = context;
            i11 = i9;
            this.f = n0Var;
            C = n0Var;
        } else {
            context2 = context;
            view3 = view2;
            p0Var = l10;
            j10 = 0;
            messageObject2 = messageObject;
            uj0Var2 = uj0Var;
            i11 = i9;
            view4 = view;
            o2Var2 = o2Var;
        }
        qn qnVar3 = o2Var2 instanceof qn ? (qn) o2Var2 : null;
        if (uj0Var2 != null) {
            f1 f1Var = uj0Var2.b;
            int i18 = 0;
            while (true) {
                if (i18 >= f1Var.getChildCount()) {
                    break;
                }
                if ((f1Var.getChildAt(i18) instanceof sj0) && ((sj0) f1Var.getChildAt(i18)).e.equals(this.p)) {
                    this.t = (sj0) f1Var.getChildAt(i18);
                    break;
                }
                i18++;
            }
        }
        if (i10 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (messageObject2 == null || (tL_messageReactions = messageObject2.messageOwner.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && qnVar3 != null && qnVar3.a() < j10) {
                f12 = 0.0f;
                int i19 = 0;
                while (i19 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i19).reaction) && arrayList.get(i19).unread) {
                        z8 z8Var = new z8((b6) null);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        long peerId = MessageObject.getPeerId(arrayList.get(i19).peer_id);
                        if (peerId < j10) {
                            qnVar2 = qnVar3;
                            TLRPC.Chat chat = MessagesController.getInstance(i11).getChat(Long.valueOf(-peerId));
                            if (chat != null) {
                                z8Var.k(i11, chat);
                                imageReceiver.setForUserOrChat(chat, z8Var);
                                m0 m0Var = new m0();
                                m0Var.a = imageReceiver;
                                m0Var.e = j2.b(j2.e(random, 100), 100.0f, 0.1f, 0.3f);
                                m0Var.h = j2.b(j2.e(random, 100), 100.0f, 0.4f, 0.8f);
                                m0Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                m0Var.b = (int) j2.b(j2.e(random, 100), 100.0f, 200.0f, 400.0f);
                                float f16 = 0.6f;
                                float f17 = 0.2f;
                                if (this.x.isEmpty()) {
                                    int i20 = 0;
                                    float f18 = 0.0f;
                                    float f19 = 0.0f;
                                    float f20 = 0.0f;
                                    while (i20 < 10) {
                                        int i21 = i20;
                                        float d = aa.d.d(j2.e(random, 100), f16, 100.0f, f17);
                                        float d9 = aa.d.d(j2.e(random, 100), 0.4f, 100.0f, f17);
                                        float f21 = 2.14748365E9f;
                                        for (int i22 = 0; i22 < this.x.size(); i22++) {
                                            float f22 = ((m0) this.x.get(i22)).f - d;
                                            float f23 = ((m0) this.x.get(i22)).g - d9;
                                            float f24 = (f23 * f23) + (f22 * f22);
                                            if (f24 < f21) {
                                                f21 = f24;
                                            }
                                        }
                                        if (f21 > f18) {
                                            f19 = d;
                                            f20 = d9;
                                            f18 = f21;
                                        }
                                        i20 = i21 + 1;
                                        f16 = 0.6f;
                                        f17 = 0.2f;
                                    }
                                    m0Var.f = f19;
                                    m0Var.g = f20;
                                } else {
                                    m0Var.f = aa.d.d(j2.e(random, 100), 0.6f, 100.0f, 0.2f);
                                    m0Var.g = (j2.e(random, 100) * 0.4f) / 100.0f;
                                }
                                this.x.add(m0Var);
                            }
                        } else {
                            qnVar2 = qnVar3;
                            TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(peerId));
                            if (user != null) {
                                z8Var.m(i11, user);
                                imageReceiver.setForUserOrChat(user, z8Var);
                                m0 m0Var2 = new m0();
                                m0Var2.a = imageReceiver;
                                m0Var2.e = j2.b(j2.e(random, 100), 100.0f, 0.1f, 0.3f);
                                m0Var2.h = j2.b(j2.e(random, 100), 100.0f, 0.4f, 0.8f);
                                m0Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                m0Var2.b = (int) j2.b(j2.e(random, 100), 100.0f, 200.0f, 400.0f);
                                float f162 = 0.6f;
                                float f172 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(m0Var2);
                            }
                        }
                    } else {
                        qnVar2 = qnVar3;
                    }
                    i19++;
                    i11 = i9;
                    qnVar3 = qnVar2;
                }
                qnVar = qnVar3;
                sj0 sj0Var = this.t;
                boolean z13 = sj0Var == null || !(f10 == f12 || f11 == f12);
                if (view3 == null) {
                    view3.getLocationOnScreen(this.j);
                    int[] iArr = this.j;
                    float f25 = iArr[0];
                    float f26 = iArr[1];
                    f15 = view3.getScaleX() * view3.getWidth();
                    if (view3 instanceof k51) {
                        float f27 = ((k51) view3).C;
                        if (f27 > f12) {
                            f15 = view3.getWidth() * ((f27 * 2.0f) + 1.0f);
                            f25 = org.telegram.messenger.l0.a(f15, view3.getWidth(), 2.0f, f25);
                            f26 -= f15 - view3.getWidth();
                        }
                    }
                    f14 = f26;
                    f13 = f25;
                } else {
                    if (sj0Var == null) {
                        if (p0Var != null) {
                            ImageReceiver imageReceiver2 = p0Var.C;
                            view4.getLocationInWindow(this.j);
                            float imageX = this.j[0] + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageX());
                            float imageY = this.j[1] + (imageReceiver2 == null ? 0.0f : imageReceiver2.getImageY());
                            if (imageReceiver2 == null) {
                                f13 = imageX;
                                f14 = imageY;
                            } else {
                                f15 = imageReceiver2.getImageHeight();
                                f13 = imageX;
                                f14 = imageY;
                            }
                        } else if (view4 != null) {
                            ((View) view4.getParent()).getLocationInWindow(this.j);
                            int[] iArr2 = this.j;
                            f14 = iArr2[1] + f11 + (view4 instanceof t1 ? ((t1) view4).R : 0);
                            f13 = iArr2[0] + f10;
                        } else {
                            f13 = f10;
                            f14 = f11;
                        }
                        i12 = 2;
                        f15 = 0.0f;
                        if (i10 == i12) {
                            int dp = AndroidUtilities.dp((z10 && SharedConfig.deviceIsHigh()) ? 60.0f : 34.0f);
                            round = (int) ((dp * 2.0f) / AndroidUtilities.density);
                            i13 = dp;
                        } else if (i10 != 1) {
                            int dp2 = AndroidUtilities.dp(350.0f);
                            Point point = AndroidUtilities.displaySize;
                            int round2 = Math.round(Math.min(dp2, Math.min(point.x, point.y)) * 0.8f);
                            int dp3 = AndroidUtilities.dp(350.0f);
                            Point point2 = AndroidUtilities.displaySize;
                            round = (int) (Math.round(Math.min(dp3, Math.min(point2.x, point2.y)) * 0.7f) / AndroidUtilities.density);
                            i13 = round2;
                        } else if (z10) {
                            i13 = AndroidUtilities.dp(SharedConfig.deviceIsHigh() ? 240.0f : 140.0f);
                            round = SharedConfig.deviceIsHigh() ? (int) ((AndroidUtilities.dp(80.0f) * 2.0f) / AndroidUtilities.density) : e();
                        } else {
                            i13 = AndroidUtilities.dp(80.0f);
                            round = e();
                        }
                        i14 = i13 >> 1;
                        int i23 = round >> 1;
                        float f28 = f15 / i14;
                        this.g = 0.0f;
                        this.h = 0.0f;
                        frameLayout = new FrameLayout(context2);
                        this.e = frameLayout;
                        int i24 = round;
                        View view5 = view4;
                        int i25 = i13;
                        MessageObject messageObject4 = messageObject2;
                        k0Var = new k0(this, context2, o2Var, view5, z10, messageObject4, qnVar, i14, i10, z13, f28, f13, f14, r0Var);
                        this.i = k0Var;
                        l0Var = new l0(this, context2);
                        this.b = l0Var;
                        l0Var2 = new l0(this, context2);
                        this.c = l0Var2;
                        l0 l0Var4 = new l0(this, context2);
                        this.d = l0Var4;
                        tL_availableReaction = r0Var.f != null ? MediaDataController.getInstance(i9).getReactionsMap().get(this.p.f) : null;
                        if (tL_availableReaction != null && r0Var.g == j10) {
                            this.l = true;
                            return;
                        }
                        if (tL_availableReaction != null) {
                            int i26 = 2;
                            if (i10 != 2) {
                                if ((i10 == 1 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_CHAT)) || i10 == 0) {
                                    TLRPC.Document document = i10 == 1 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                                    String a2 = i10 == 1 ? a() : e2.c.l(i24, "_", i24);
                                    ImageReceiver imageReceiver3 = l0Var.getImageReceiver();
                                    StringBuilder sb2 = new StringBuilder();
                                    int i27 = D;
                                    D = i27 + 1;
                                    sb2.append(i27);
                                    sb2.append("_");
                                    sb2.append(this.n);
                                    sb2.append("_");
                                    imageReceiver3.setUniqKeyPrefix(sb2.toString());
                                    l0Var.j(ImageLocation.getForDocument(document), a2, null, null, 0, null);
                                    z11 = false;
                                    l0Var.getImageReceiver().setAutoRepeat(0);
                                    l0Var.getImageReceiver().setAllowStartAnimation(false);
                                } else {
                                    z11 = false;
                                }
                                if (l0Var.getImageReceiver().getLottieAnimation() != null) {
                                    l0Var.getImageReceiver().getLottieAnimation().L(z11 ? 1 : 0, z11, z11);
                                    l0Var.getImageReceiver().getLottieAnimation().start();
                                }
                                i26 = 2;
                                r11 = z11;
                            } else {
                                r11 = 0;
                            }
                            if (i10 == i26) {
                                TLRPC.Document document2 = z10 ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                                ImageReceiver imageReceiver4 = l0Var2.getImageReceiver();
                                StringBuilder sb3 = new StringBuilder();
                                int i28 = D;
                                D = i28 + 1;
                                sb3.append(i28);
                                sb3.append("_");
                                sb3.append(this.n);
                                sb3.append("_");
                                imageReceiver4.setUniqKeyPrefix(sb3.toString());
                                l0Var2.j(ImageLocation.getForDocument(document2), e2.c.l(i23, "_", i23), null, null, 0, null);
                            } else if (i10 == 0) {
                                TLRPC.Document document3 = tL_availableReaction.activate_animation;
                                ImageReceiver imageReceiver5 = l0Var2.getImageReceiver();
                                StringBuilder sb4 = new StringBuilder();
                                int i29 = D;
                                D = i29 + 1;
                                sb4.append(i29);
                                sb4.append("_");
                                sb4.append(this.n);
                                sb4.append("_");
                                imageReceiver5.setUniqKeyPrefix(sb4.toString());
                                l0Var2.j(ImageLocation.getForDocument(document3), e2.c.l(i23, "_", i23), null, null, 0, null);
                            }
                            l0Var3 = l0Var4;
                        } else {
                            r11 = 0;
                            r11 = 0;
                            if (i10 == 0) {
                                i15 = i9;
                                k5 k5Var = new k5(1, i15, r0Var.g);
                                k5Var.o(l0Var2);
                                l0Var2.D = k5Var;
                                if (l0Var2.F) {
                                    k5Var.a(l0Var2);
                                }
                            } else {
                                i15 = i9;
                                if (i10 == 2) {
                                    l0Var3 = l0Var4;
                                    messageObject3 = messageObject4;
                                    k5 k5Var2 = new k5(2, i15, r0Var.g);
                                    k5Var2.o(l0Var2);
                                    l0Var2.D = k5Var2;
                                    if (l0Var2.F) {
                                        k5Var2.a(l0Var2);
                                    }
                                    if (i10 != 0 || i10 == 1) {
                                        k5 k5Var3 = new k5(2, i15, r0Var.g);
                                        k5Var3.setColorFilter(new PorterDuffColorFilter(messageObject3 == null ? f6.v0(messageObject3.shouldDrawWithoutBackground() ? messageObject3.isOutOwner() ? f6.Sb : f6.Cj : messageObject3.isOutOwner() ? f6.Gj : f6.Fj, o2Var != null ? o2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                                        boolean z14 = i10 != 0;
                                        l0Var.E = d.a(k5Var3, z14, !z14);
                                        k0Var.setClipChildren(false);
                                    }
                                }
                            }
                            l0Var3 = l0Var4;
                            messageObject3 = messageObject4;
                            if (i10 != 0) {
                            }
                            k5 k5Var32 = new k5(2, i15, r0Var.g);
                            if (messageObject3 == null) {
                            }
                            k5Var32.setColorFilter(new PorterDuffColorFilter(messageObject3 == null ? f6.v0(messageObject3.shouldDrawWithoutBackground() ? messageObject3.isOutOwner() ? f6.Sb : f6.Cj : messageObject3.isOutOwner() ? f6.Gj : f6.Fj, o2Var != null ? o2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                            if (i10 != 0) {
                            }
                            l0Var.E = d.a(k5Var32, z14, !z14);
                            k0Var.setClipChildren(false);
                        }
                        l0Var2.getImageReceiver().setAutoRepeat(r11);
                        l0Var2.getImageReceiver().setAllowStartAnimation(r11);
                        if (l0Var2.getImageReceiver().getLottieAnimation() != null) {
                            if (i10 == 2) {
                                l0Var2.getImageReceiver().getLottieAnimation().L(l0Var2.getImageReceiver().getLottieAnimation().e[r11] - 1, r11, r11);
                            } else {
                                l0Var2.getImageReceiver().getLottieAnimation().L(r11, r11, r11);
                                l0Var2.getImageReceiver().getLottieAnimation().start();
                            }
                        }
                        i16 = i25 - i14;
                        i17 = i16 >> 1;
                        i16 = i10 == 1 ? i17 : i16;
                        frameLayout.addView(l0Var2);
                        l0Var2.getLayoutParams().width = i14;
                        l0Var2.getLayoutParams().height = i14;
                        ((FrameLayout.LayoutParams) l0Var2.getLayoutParams()).topMargin = i17;
                        ((FrameLayout.LayoutParams) l0Var2.getLayoutParams()).leftMargin = i16;
                        if (i10 != 1 && !z10) {
                            if (tL_availableReaction != null) {
                                l0Var3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                            }
                            frameLayout.addView(l0Var3);
                            l0Var3.getLayoutParams().width = i14;
                            l0Var3.getLayoutParams().height = i14;
                            ((FrameLayout.LayoutParams) l0Var3.getLayoutParams()).topMargin = i17;
                            ((FrameLayout.LayoutParams) l0Var3.getLayoutParams()).leftMargin = i16;
                        }
                        k0Var.addView(frameLayout);
                        frameLayout.getLayoutParams().width = i25;
                        frameLayout.getLayoutParams().height = i25;
                        int i30 = -i17;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i30;
                        int i31 = -i16;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i31;
                        k0Var.addView(l0Var);
                        l0Var.getLayoutParams().width = i25;
                        l0Var.getLayoutParams().height = i25;
                        l0Var.getLayoutParams().width = i25;
                        l0Var.getLayoutParams().height = i25;
                        ((FrameLayout.LayoutParams) l0Var.getLayoutParams()).topMargin = i30;
                        ((FrameLayout.LayoutParams) l0Var.getLayoutParams()).leftMargin = i31;
                        frameLayout.setPivotX(i16);
                        frameLayout.setPivotY(i17);
                    }
                    sj0Var.getLocationOnScreen(this.j);
                    float x10 = this.j[0] + this.t.b.getX();
                    float y10 = this.j[1] + this.t.b.getY();
                    f15 = this.t.getScaleX() * this.t.b.getWidth();
                    f13 = x10;
                    f14 = y10;
                }
                i12 = 2;
                if (i10 == i12) {
                }
                i14 = i13 >> 1;
                int i232 = round >> 1;
                float f282 = f15 / i14;
                this.g = 0.0f;
                this.h = 0.0f;
                frameLayout = new FrameLayout(context2);
                this.e = frameLayout;
                int i242 = round;
                View view52 = view4;
                int i252 = i13;
                MessageObject messageObject42 = messageObject2;
                k0Var = new k0(this, context2, o2Var, view52, z10, messageObject42, qnVar, i14, i10, z13, f282, f13, f14, r0Var);
                this.i = k0Var;
                l0Var = new l0(this, context2);
                this.b = l0Var;
                l0Var2 = new l0(this, context2);
                this.c = l0Var2;
                l0 l0Var42 = new l0(this, context2);
                this.d = l0Var42;
                if (r0Var.f != null) {
                }
                if (tL_availableReaction != null) {
                }
                if (tL_availableReaction != null) {
                }
                l0Var2.getImageReceiver().setAutoRepeat(r11);
                l0Var2.getImageReceiver().setAllowStartAnimation(r11);
                if (l0Var2.getImageReceiver().getLottieAnimation() != null) {
                }
                i16 = i252 - i14;
                i17 = i16 >> 1;
                if (i10 == 1) {
                }
                frameLayout.addView(l0Var2);
                l0Var2.getLayoutParams().width = i14;
                l0Var2.getLayoutParams().height = i14;
                ((FrameLayout.LayoutParams) l0Var2.getLayoutParams()).topMargin = i17;
                ((FrameLayout.LayoutParams) l0Var2.getLayoutParams()).leftMargin = i16;
                if (i10 != 1) {
                    if (tL_availableReaction != null) {
                    }
                    frameLayout.addView(l0Var3);
                    l0Var3.getLayoutParams().width = i14;
                    l0Var3.getLayoutParams().height = i14;
                    ((FrameLayout.LayoutParams) l0Var3.getLayoutParams()).topMargin = i17;
                    ((FrameLayout.LayoutParams) l0Var3.getLayoutParams()).leftMargin = i16;
                }
                k0Var.addView(frameLayout);
                frameLayout.getLayoutParams().width = i252;
                frameLayout.getLayoutParams().height = i252;
                int i302 = -i17;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i302;
                int i312 = -i16;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i312;
                k0Var.addView(l0Var);
                l0Var.getLayoutParams().width = i252;
                l0Var.getLayoutParams().height = i252;
                l0Var.getLayoutParams().width = i252;
                l0Var.getLayoutParams().height = i252;
                ((FrameLayout.LayoutParams) l0Var.getLayoutParams()).topMargin = i302;
                ((FrameLayout.LayoutParams) l0Var.getLayoutParams()).leftMargin = i312;
                frameLayout.setPivotX(i16);
                frameLayout.setPivotY(i17);
            }
        }
        qnVar = qnVar3;
        f12 = 0.0f;
        sj0 sj0Var2 = this.t;
        if (sj0Var2 == null) {
        }
        if (view3 == null) {
        }
        i12 = 2;
        if (i10 == i12) {
        }
        i14 = i13 >> 1;
        int i2322 = round >> 1;
        float f2822 = f15 / i14;
        this.g = 0.0f;
        this.h = 0.0f;
        frameLayout = new FrameLayout(context2);
        this.e = frameLayout;
        int i2422 = round;
        View view522 = view4;
        int i2522 = i13;
        MessageObject messageObject422 = messageObject2;
        k0Var = new k0(this, context2, o2Var, view522, z10, messageObject422, qnVar, i14, i10, z13, f2822, f13, f14, r0Var);
        this.i = k0Var;
        l0Var = new l0(this, context2);
        this.b = l0Var;
        l0Var2 = new l0(this, context2);
        this.c = l0Var2;
        l0 l0Var422 = new l0(this, context2);
        this.d = l0Var422;
        if (r0Var.f != null) {
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction != null) {
        }
        l0Var2.getImageReceiver().setAutoRepeat(r11);
        l0Var2.getImageReceiver().setAllowStartAnimation(r11);
        if (l0Var2.getImageReceiver().getLottieAnimation() != null) {
        }
        i16 = i2522 - i14;
        i17 = i16 >> 1;
        if (i10 == 1) {
        }
        frameLayout.addView(l0Var2);
        l0Var2.getLayoutParams().width = i14;
        l0Var2.getLayoutParams().height = i14;
        ((FrameLayout.LayoutParams) l0Var2.getLayoutParams()).topMargin = i17;
        ((FrameLayout.LayoutParams) l0Var2.getLayoutParams()).leftMargin = i16;
        if (i10 != 1) {
        }
        k0Var.addView(frameLayout);
        frameLayout.getLayoutParams().width = i2522;
        frameLayout.getLayoutParams().height = i2522;
        int i3022 = -i17;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i3022;
        int i3122 = -i16;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i3122;
        k0Var.addView(l0Var);
        l0Var.getLayoutParams().width = i2522;
        l0Var.getLayoutParams().height = i2522;
        l0Var.getLayoutParams().width = i2522;
        l0Var.getLayoutParams().height = i2522;
        ((FrameLayout.LayoutParams) l0Var.getLayoutParams()).topMargin = i3022;
        ((FrameLayout.LayoutParams) l0Var.getLayoutParams()).leftMargin = i3122;
        frameLayout.setPivotX(i16);
        frameLayout.setPivotY(i17);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        int i9 = 0;
        while (i9 < 2) {
            n0 n0Var = i9 == 0 ? B : C;
            if (n0Var != null) {
                if (z10) {
                    n0Var.c();
                } else {
                    n0Var.l = true;
                }
            }
            i9++;
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
    public static void d(o2 o2Var, uj0 uj0Var, View view, View view2, float f10, float f11, r0 r0Var, int i9, int i10) {
        if (view == null || r0Var == null || o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        boolean z10 = true;
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i10 == 2 || i10 == 0) {
                d(o2Var, null, view, view2, 0.0f, 0.0f, r0Var, i9, 1);
            }
            n0 n0Var = new n0(o2Var.getParentActivity(), o2Var, uj0Var, view, view2, f10, f11, r0Var, i9, i10, false);
            if (i10 == 1) {
                C = n0Var;
            } else {
                B = n0Var;
            }
            if (o2Var instanceof qn) {
                qn qnVar = (qn) o2Var;
                if (i10 != 0) {
                }
                o1 o1Var = qnVar.M8;
                if (o1Var != null) {
                }
            }
            z10 = false;
            n0Var.w = z10;
            if (z10) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = o2Var.getParentActivity().getWindowManager();
                n0Var.k = windowManager;
                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, n0Var.i, layoutParams);
                n0Var.k.addView(n0Var.i, layoutParams);
            } else {
                ((FrameLayout) o2Var.getParentActivity().getWindow().getDecorView()).addView(n0Var.i);
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
        n0 n0Var = B;
        if (n0Var != null) {
            n0Var.s = true;
            n0Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        n0 n0Var2 = C;
        if (n0Var2 != null) {
            View view = n0Var2.v;
            if (view instanceof t1) {
                ((t1) view).J.b(n0Var2.p);
            } else if (view instanceof w0) {
                ((w0) view).y0.b(n0Var2.p);
            }
        }
    }

    public static void g() {
        n0 n0Var = C;
        if (n0Var == null || n0Var.s) {
            return;
        }
        n0Var.s = true;
        n0Var.y = System.currentTimeMillis();
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
            k0 k0Var = this.i;
            if (z10) {
                this.k.removeView(k0Var);
            } else {
                AndroidUtilities.removeFromParent(k0Var);
            }
        } catch (Exception unused) {
        }
    }
}
