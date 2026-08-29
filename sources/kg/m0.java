package kg;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Random;
import jh.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.x3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.m51;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m0 {
    public static m0 B;
    public static m0 C;
    public static int D;
    public static long E;
    public boolean A;
    public final int a;
    public final k0 b;
    public final k0 c;
    public final k0 d;
    public final FrameLayout e;
    public final m0 f;
    public float g;
    public float h;
    public final j0 i;
    public WindowManager k;
    public boolean l;
    public float m;
    public final int n;
    public final long o;
    public final q0 p;
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
    public m0(Context context, o2 o2Var, fk0 fk0Var, View view, View view2, float f9, float f10, q0 q0Var, int i10, int i11, boolean z10) {
        MessageObject messageObject;
        Context context2;
        View view3;
        o0 o0Var;
        long j10;
        MessageObject messageObject2;
        fk0 fk0Var2;
        int i12;
        View view4;
        o2 o2Var2;
        tn tnVar;
        float f11;
        float f12;
        float f13;
        int i13;
        float f14;
        int round;
        int i14;
        int i15;
        FrameLayout frameLayout;
        j0 j0Var;
        k0 k0Var;
        k0 k0Var2;
        TLRPC.TL_availableReaction tL_availableReaction;
        ?? r11;
        int i16;
        k0 k0Var3;
        MessageObject messageObject3;
        int i17;
        int i18;
        boolean z11;
        tn tnVar2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.t = null;
        this.z = z10;
        boolean z12 = view instanceof s1;
        if (z12) {
            messageObject = ((s1) view).getMessageObject();
            this.n = messageObject.getId();
            this.o = messageObject.getGroupId();
        } else if (view instanceof v0) {
            messageObject = ((v0) view).getMessageObject();
            this.n = messageObject.getId();
            this.o = 0L;
        } else {
            this.n = 0;
            this.o = 0L;
            messageObject = null;
        }
        this.p = q0Var;
        this.a = i11;
        this.v = view;
        o0 m10 = z12 ? ((s1) view).J.m(q0Var) : view instanceof v0 ? ((v0) view).y0.m(q0Var) : null;
        if (z10 && i11 == 2) {
            view3 = view2;
            o0Var = m10;
            j10 = 0;
            messageObject2 = messageObject;
            fk0Var2 = fk0Var;
            view4 = view;
            o2Var2 = o2Var;
            m0 m0Var = new m0(context, o2Var2, fk0Var2, view4, view3, f9, f10, q0Var, i10, 1, true);
            context2 = context;
            i12 = i10;
            this.f = m0Var;
            C = m0Var;
        } else {
            context2 = context;
            view3 = view2;
            o0Var = m10;
            j10 = 0;
            messageObject2 = messageObject;
            fk0Var2 = fk0Var;
            i12 = i10;
            view4 = view;
            o2Var2 = o2Var;
        }
        tn tnVar3 = o2Var2 instanceof tn ? (tn) o2Var2 : null;
        if (fk0Var2 != null) {
            e1 e1Var = fk0Var2.b;
            int i19 = 0;
            while (true) {
                if (i19 >= e1Var.getChildCount()) {
                    break;
                }
                if ((e1Var.getChildAt(i19) instanceof dk0) && ((dk0) e1Var.getChildAt(i19)).e.equals(this.p)) {
                    this.t = (dk0) e1Var.getChildAt(i19);
                    break;
                }
                i19++;
            }
        }
        if (i11 == 1) {
            Random random = new Random();
            ArrayList<TLRPC.MessagePeerReaction> arrayList = (messageObject2 == null || (tL_messageReactions = messageObject2.messageOwner.reactions) == null) ? null : tL_messageReactions.recent_reactions;
            if (arrayList != null && tnVar3 != null && tnVar3.a() < j10) {
                f11 = 0.0f;
                int i20 = 0;
                while (i20 < arrayList.size()) {
                    if (this.p.equals(arrayList.get(i20).reaction) && arrayList.get(i20).unread) {
                        e9 e9Var = new e9((c6) null);
                        ImageReceiver imageReceiver = new ImageReceiver();
                        long peerId = MessageObject.getPeerId(arrayList.get(i20).peer_id);
                        if (peerId < j10) {
                            tnVar2 = tnVar3;
                            TLRPC.Chat chat = MessagesController.getInstance(i12).getChat(Long.valueOf(-peerId));
                            if (chat != null) {
                                e9Var.k(i12, chat);
                                imageReceiver.setForUserOrChat(chat, e9Var);
                                l0 l0Var = new l0();
                                l0Var.a = imageReceiver;
                                l0Var.e = u3.c.c(th.f(random, 100), 100.0f, 0.1f, 0.3f);
                                l0Var.h = u3.c.c(th.f(random, 100), 100.0f, 0.4f, 0.8f);
                                l0Var.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                l0Var.b = (int) u3.c.c(th.f(random, 100), 100.0f, 200.0f, 400.0f);
                                float f15 = 0.6f;
                                float f16 = 0.2f;
                                if (this.x.isEmpty()) {
                                    int i21 = 0;
                                    float f17 = 0.0f;
                                    float f18 = 0.0f;
                                    float f19 = 0.0f;
                                    while (i21 < 10) {
                                        int i22 = i21;
                                        float d = a4.w.d(th.f(random, 100), f15, 100.0f, f16);
                                        float d10 = a4.w.d(th.f(random, 100), 0.4f, 100.0f, f16);
                                        float f20 = 2.14748365E9f;
                                        for (int i23 = 0; i23 < this.x.size(); i23++) {
                                            float f21 = ((l0) this.x.get(i23)).f - d;
                                            float f22 = ((l0) this.x.get(i23)).g - d10;
                                            float f23 = (f22 * f22) + (f21 * f21);
                                            if (f23 < f20) {
                                                f20 = f23;
                                            }
                                        }
                                        if (f20 > f17) {
                                            f18 = d;
                                            f19 = d10;
                                            f17 = f20;
                                        }
                                        i21 = i22 + 1;
                                        f15 = 0.6f;
                                        f16 = 0.2f;
                                    }
                                    l0Var.f = f18;
                                    l0Var.g = f19;
                                } else {
                                    l0Var.f = a4.w.d(th.f(random, 100), 0.6f, 100.0f, 0.2f);
                                    l0Var.g = (th.f(random, 100) * 0.4f) / 100.0f;
                                }
                                this.x.add(l0Var);
                            }
                        } else {
                            tnVar2 = tnVar3;
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(peerId));
                            if (user != null) {
                                e9Var.m(i12, user);
                                imageReceiver.setForUserOrChat(user, e9Var);
                                l0 l0Var2 = new l0();
                                l0Var2.a = imageReceiver;
                                l0Var2.e = u3.c.c(th.f(random, 100), 100.0f, 0.1f, 0.3f);
                                l0Var2.h = u3.c.c(th.f(random, 100), 100.0f, 0.4f, 0.8f);
                                l0Var2.i = (Math.abs(random.nextInt() % 100) * 60) / 100.0f;
                                l0Var2.b = (int) u3.c.c(th.f(random, 100), 100.0f, 200.0f, 400.0f);
                                float f152 = 0.6f;
                                float f162 = 0.2f;
                                if (this.x.isEmpty()) {
                                }
                                this.x.add(l0Var2);
                            }
                        }
                    } else {
                        tnVar2 = tnVar3;
                    }
                    i20++;
                    i12 = i10;
                    tnVar3 = tnVar2;
                }
                tnVar = tnVar3;
                dk0 dk0Var = this.t;
                boolean z13 = dk0Var == null || !(f9 == f11 || f10 == f11);
                if (view3 == null) {
                    view3.getLocationOnScreen(this.j);
                    int[] iArr = this.j;
                    float f24 = iArr[0];
                    float f25 = iArr[1];
                    f14 = view3.getScaleX() * view3.getWidth();
                    if (view3 instanceof m51) {
                        float f26 = ((m51) view3).C;
                        if (f26 > f11) {
                            f14 = view3.getWidth() * ((f26 * 2.0f) + 1.0f);
                            f24 = x3.a(f14, view3.getWidth(), 2.0f, f24);
                            f25 -= f14 - view3.getWidth();
                        }
                    }
                    f13 = f25;
                    f12 = f24;
                } else {
                    if (dk0Var == null) {
                        if (o0Var != null) {
                            ImageReceiver imageReceiver2 = o0Var.C;
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
                            f13 = iArr2[1] + f10 + (view4 instanceof s1 ? ((s1) view4).R : 0);
                            f12 = iArr2[0] + f9;
                        } else {
                            f12 = f9;
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
                        j0Var = new j0(this, context2, o2Var, view5, z10, messageObject4, tnVar, i15, i11, z13, f27, f12, f13, q0Var);
                        this.i = j0Var;
                        k0Var = new k0(this, context2);
                        this.b = k0Var;
                        k0Var2 = new k0(this, context2);
                        this.c = k0Var2;
                        k0 k0Var4 = new k0(this, context2);
                        this.d = k0Var4;
                        tL_availableReaction = q0Var.f != null ? MediaDataController.getInstance(i10).getReactionsMap().get(this.p.f) : null;
                        if (tL_availableReaction != null && q0Var.g == j10) {
                            this.l = true;
                            return;
                        }
                        if (tL_availableReaction != null) {
                            int i27 = 2;
                            if (i11 != 2) {
                                if ((i11 == 1 && LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_CHAT)) || i11 == 0) {
                                    TLRPC.Document document = i11 == 1 ? tL_availableReaction.around_animation : tL_availableReaction.effect_animation;
                                    String a2 = i11 == 1 ? a() : com.google.android.recaptcha.internal.a.k(i25, "_", i25);
                                    ImageReceiver imageReceiver3 = k0Var.getImageReceiver();
                                    StringBuilder sb2 = new StringBuilder();
                                    int i28 = D;
                                    D = i28 + 1;
                                    sb2.append(i28);
                                    sb2.append("_");
                                    sb2.append(this.n);
                                    sb2.append("_");
                                    imageReceiver3.setUniqKeyPrefix(sb2.toString());
                                    k0Var.j(ImageLocation.getForDocument(document), a2, null, null, 0, null);
                                    z11 = false;
                                    k0Var.getImageReceiver().setAutoRepeat(0);
                                    k0Var.getImageReceiver().setAllowStartAnimation(false);
                                } else {
                                    z11 = false;
                                }
                                if (k0Var.getImageReceiver().getLottieAnimation() != null) {
                                    k0Var.getImageReceiver().getLottieAnimation().L(z11 ? 1 : 0, z11, z11);
                                    k0Var.getImageReceiver().getLottieAnimation().start();
                                }
                                i27 = 2;
                                r11 = z11;
                            } else {
                                r11 = 0;
                            }
                            if (i11 == i27) {
                                TLRPC.Document document2 = z10 ? tL_availableReaction.select_animation : tL_availableReaction.appear_animation;
                                ImageReceiver imageReceiver4 = k0Var2.getImageReceiver();
                                StringBuilder sb3 = new StringBuilder();
                                int i29 = D;
                                D = i29 + 1;
                                sb3.append(i29);
                                sb3.append("_");
                                sb3.append(this.n);
                                sb3.append("_");
                                imageReceiver4.setUniqKeyPrefix(sb3.toString());
                                k0Var2.j(ImageLocation.getForDocument(document2), com.google.android.recaptcha.internal.a.k(i24, "_", i24), null, null, 0, null);
                            } else if (i11 == 0) {
                                TLRPC.Document document3 = tL_availableReaction.activate_animation;
                                ImageReceiver imageReceiver5 = k0Var2.getImageReceiver();
                                StringBuilder sb4 = new StringBuilder();
                                int i30 = D;
                                D = i30 + 1;
                                sb4.append(i30);
                                sb4.append("_");
                                sb4.append(this.n);
                                sb4.append("_");
                                imageReceiver5.setUniqKeyPrefix(sb4.toString());
                                k0Var2.j(ImageLocation.getForDocument(document3), com.google.android.recaptcha.internal.a.k(i24, "_", i24), null, null, 0, null);
                            }
                            k0Var3 = k0Var4;
                        } else {
                            r11 = 0;
                            r11 = 0;
                            if (i11 == 0) {
                                i16 = i10;
                                p5 p5Var = new p5(1, i16, q0Var.g);
                                p5Var.o(k0Var2);
                                k0Var2.D = p5Var;
                                if (k0Var2.F) {
                                    p5Var.a(k0Var2);
                                }
                            } else {
                                i16 = i10;
                                if (i11 == 2) {
                                    k0Var3 = k0Var4;
                                    messageObject3 = messageObject4;
                                    p5 p5Var2 = new p5(2, i16, q0Var.g);
                                    p5Var2.o(k0Var2);
                                    k0Var2.D = p5Var2;
                                    if (k0Var2.F) {
                                        p5Var2.a(k0Var2);
                                    }
                                    if (i11 != 0 || i11 == 1) {
                                        p5 p5Var3 = new p5(2, i16, q0Var.g);
                                        p5Var3.setColorFilter(new PorterDuffColorFilter(messageObject3 == null ? g6.v0(messageObject3.shouldDrawWithoutBackground() ? messageObject3.isOutOwner() ? g6.Sb : g6.Cj : messageObject3.isOutOwner() ? g6.Gj : g6.Fj, o2Var != null ? o2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                                        boolean z14 = i11 != 0;
                                        k0Var.E = d.a(p5Var3, z14, !z14);
                                        j0Var.setClipChildren(false);
                                    }
                                }
                            }
                            k0Var3 = k0Var4;
                            messageObject3 = messageObject4;
                            if (i11 != 0) {
                            }
                            p5 p5Var32 = new p5(2, i16, q0Var.g);
                            if (messageObject3 == null) {
                            }
                            p5Var32.setColorFilter(new PorterDuffColorFilter(messageObject3 == null ? g6.v0(messageObject3.shouldDrawWithoutBackground() ? messageObject3.isOutOwner() ? g6.Sb : g6.Cj : messageObject3.isOutOwner() ? g6.Gj : g6.Fj, o2Var != null ? o2Var.getResourceProvider() : null) : -1, PorterDuff.Mode.SRC_IN));
                            if (i11 != 0) {
                            }
                            k0Var.E = d.a(p5Var32, z14, !z14);
                            j0Var.setClipChildren(false);
                        }
                        k0Var2.getImageReceiver().setAutoRepeat(r11);
                        k0Var2.getImageReceiver().setAllowStartAnimation(r11);
                        if (k0Var2.getImageReceiver().getLottieAnimation() != null) {
                            if (i11 == 2) {
                                k0Var2.getImageReceiver().getLottieAnimation().L(k0Var2.getImageReceiver().getLottieAnimation().e[r11] - 1, r11, r11);
                            } else {
                                k0Var2.getImageReceiver().getLottieAnimation().L(r11, r11, r11);
                                k0Var2.getImageReceiver().getLottieAnimation().start();
                            }
                        }
                        i17 = i26 - i15;
                        i18 = i17 >> 1;
                        i17 = i11 == 1 ? i18 : i17;
                        frameLayout.addView(k0Var2);
                        k0Var2.getLayoutParams().width = i15;
                        k0Var2.getLayoutParams().height = i15;
                        ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).topMargin = i18;
                        ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).leftMargin = i17;
                        if (i11 != 1 && !z10) {
                            if (tL_availableReaction != null) {
                                k0Var3.getImageReceiver().setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", null, "webp", tL_availableReaction, 1);
                            }
                            frameLayout.addView(k0Var3);
                            k0Var3.getLayoutParams().width = i15;
                            k0Var3.getLayoutParams().height = i15;
                            ((FrameLayout.LayoutParams) k0Var3.getLayoutParams()).topMargin = i18;
                            ((FrameLayout.LayoutParams) k0Var3.getLayoutParams()).leftMargin = i17;
                        }
                        j0Var.addView(frameLayout);
                        frameLayout.getLayoutParams().width = i26;
                        frameLayout.getLayoutParams().height = i26;
                        int i31 = -i18;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i31;
                        int i32 = -i17;
                        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i32;
                        j0Var.addView(k0Var);
                        k0Var.getLayoutParams().width = i26;
                        k0Var.getLayoutParams().height = i26;
                        k0Var.getLayoutParams().width = i26;
                        k0Var.getLayoutParams().height = i26;
                        ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).topMargin = i31;
                        ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).leftMargin = i32;
                        frameLayout.setPivotX(i17);
                        frameLayout.setPivotY(i18);
                    }
                    dk0Var.getLocationOnScreen(this.j);
                    float x4 = this.j[0] + this.t.b.getX();
                    float y8 = this.j[1] + this.t.b.getY();
                    f14 = this.t.getScaleX() * this.t.b.getWidth();
                    f12 = x4;
                    f13 = y8;
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
                j0Var = new j0(this, context2, o2Var, view52, z10, messageObject42, tnVar, i15, i11, z13, f272, f12, f13, q0Var);
                this.i = j0Var;
                k0Var = new k0(this, context2);
                this.b = k0Var;
                k0Var2 = new k0(this, context2);
                this.c = k0Var2;
                k0 k0Var42 = new k0(this, context2);
                this.d = k0Var42;
                if (q0Var.f != null) {
                }
                if (tL_availableReaction != null) {
                }
                if (tL_availableReaction != null) {
                }
                k0Var2.getImageReceiver().setAutoRepeat(r11);
                k0Var2.getImageReceiver().setAllowStartAnimation(r11);
                if (k0Var2.getImageReceiver().getLottieAnimation() != null) {
                }
                i17 = i262 - i15;
                i18 = i17 >> 1;
                if (i11 == 1) {
                }
                frameLayout.addView(k0Var2);
                k0Var2.getLayoutParams().width = i15;
                k0Var2.getLayoutParams().height = i15;
                ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).topMargin = i18;
                ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).leftMargin = i17;
                if (i11 != 1) {
                    if (tL_availableReaction != null) {
                    }
                    frameLayout.addView(k0Var3);
                    k0Var3.getLayoutParams().width = i15;
                    k0Var3.getLayoutParams().height = i15;
                    ((FrameLayout.LayoutParams) k0Var3.getLayoutParams()).topMargin = i18;
                    ((FrameLayout.LayoutParams) k0Var3.getLayoutParams()).leftMargin = i17;
                }
                j0Var.addView(frameLayout);
                frameLayout.getLayoutParams().width = i262;
                frameLayout.getLayoutParams().height = i262;
                int i312 = -i18;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i312;
                int i322 = -i17;
                ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i322;
                j0Var.addView(k0Var);
                k0Var.getLayoutParams().width = i262;
                k0Var.getLayoutParams().height = i262;
                k0Var.getLayoutParams().width = i262;
                k0Var.getLayoutParams().height = i262;
                ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).topMargin = i312;
                ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).leftMargin = i322;
                frameLayout.setPivotX(i17);
                frameLayout.setPivotY(i18);
            }
        }
        tnVar = tnVar3;
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
        j0Var = new j0(this, context2, o2Var, view522, z10, messageObject422, tnVar, i15, i11, z13, f2722, f12, f13, q0Var);
        this.i = j0Var;
        k0Var = new k0(this, context2);
        this.b = k0Var;
        k0Var2 = new k0(this, context2);
        this.c = k0Var2;
        k0 k0Var422 = new k0(this, context2);
        this.d = k0Var422;
        if (q0Var.f != null) {
        }
        if (tL_availableReaction != null) {
        }
        if (tL_availableReaction != null) {
        }
        k0Var2.getImageReceiver().setAutoRepeat(r11);
        k0Var2.getImageReceiver().setAllowStartAnimation(r11);
        if (k0Var2.getImageReceiver().getLottieAnimation() != null) {
        }
        i17 = i2622 - i15;
        i18 = i17 >> 1;
        if (i11 == 1) {
        }
        frameLayout.addView(k0Var2);
        k0Var2.getLayoutParams().width = i15;
        k0Var2.getLayoutParams().height = i15;
        ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).topMargin = i18;
        ((FrameLayout.LayoutParams) k0Var2.getLayoutParams()).leftMargin = i17;
        if (i11 != 1) {
        }
        j0Var.addView(frameLayout);
        frameLayout.getLayoutParams().width = i2622;
        frameLayout.getLayoutParams().height = i2622;
        int i3122 = -i18;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).topMargin = i3122;
        int i3222 = -i17;
        ((FrameLayout.LayoutParams) frameLayout.getLayoutParams()).leftMargin = i3222;
        j0Var.addView(k0Var);
        k0Var.getLayoutParams().width = i2622;
        k0Var.getLayoutParams().height = i2622;
        k0Var.getLayoutParams().width = i2622;
        k0Var.getLayoutParams().height = i2622;
        ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).topMargin = i3122;
        ((FrameLayout.LayoutParams) k0Var.getLayoutParams()).leftMargin = i3222;
        frameLayout.setPivotX(i17);
        frameLayout.setPivotY(i18);
    }

    public static String a() {
        return e() + "_" + e() + "_nolimit_pcache";
    }

    public static void b(boolean z10) {
        int i10 = 0;
        while (i10 < 2) {
            m0 m0Var = i10 == 0 ? B : C;
            if (m0Var != null) {
                if (z10) {
                    m0Var.c();
                } else {
                    m0Var.l = true;
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
    public static void d(o2 o2Var, fk0 fk0Var, View view, View view2, float f9, float f10, q0 q0Var, int i10, int i11) {
        if (view == null || q0Var == null || o2Var == null || o2Var.getParentActivity() == null) {
            return;
        }
        boolean z10 = true;
        if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true)) {
            if (i11 == 2 || i11 == 0) {
                d(o2Var, null, view, view2, 0.0f, 0.0f, q0Var, i10, 1);
            }
            m0 m0Var = new m0(o2Var.getParentActivity(), o2Var, fk0Var, view, view2, f9, f10, q0Var, i10, i11, false);
            if (i11 == 1) {
                C = m0Var;
            } else {
                B = m0Var;
            }
            if (o2Var instanceof tn) {
                tn tnVar = (tn) o2Var;
                if (i11 != 0) {
                }
                o1 o1Var = tnVar.M8;
                if (o1Var != null) {
                }
            }
            z10 = false;
            m0Var.w = z10;
            if (z10) {
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                layoutParams.height = -1;
                layoutParams.width = -1;
                layoutParams.type = MediaDataController.MAX_STYLE_RUNS_COUNT;
                layoutParams.flags = 65816;
                layoutParams.format = -3;
                WindowManager windowManager = o2Var.getParentActivity().getWindowManager();
                m0Var.k = windowManager;
                AndroidUtilities.setPreferredMaxRefreshRate(windowManager, m0Var.i, layoutParams);
                m0Var.k.addView(m0Var.i, layoutParams);
            } else {
                ((FrameLayout) o2Var.getParentActivity().getWindow().getDecorView()).addView(m0Var.i);
            }
            view.invalidate();
            if (!(view instanceof s1) || ((s1) view).getCurrentMessagesGroup() == null || view.getParent() == null) {
                return;
            }
            ((View) view.getParent()).invalidate();
        }
    }

    public static int e() {
        return (int) ((AndroidUtilities.dp(40.0f) * 2.0f) / AndroidUtilities.density);
    }

    public static void f() {
        m0 m0Var = B;
        if (m0Var != null) {
            m0Var.s = true;
            m0Var.y = System.currentTimeMillis();
            if (B.a != 0 || System.currentTimeMillis() - E <= 200) {
                return;
            }
            E = System.currentTimeMillis();
            B.v.performHapticFeedback(3);
            return;
        }
        g();
        m0 m0Var2 = C;
        if (m0Var2 != null) {
            View view = m0Var2.v;
            if (view instanceof s1) {
                ((s1) view).J.b(m0Var2.p);
            } else if (view instanceof v0) {
                ((v0) view).y0.b(m0Var2.p);
            }
        }
    }

    public static void g() {
        m0 m0Var = C;
        if (m0Var == null || m0Var.s) {
            return;
        }
        m0Var.s = true;
        m0Var.y = System.currentTimeMillis();
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
            j0 j0Var = this.i;
            if (z10) {
                this.k.removeView(j0Var);
            } else {
                AndroidUtilities.removeFromParent(j0Var);
            }
        } catch (Exception unused) {
        }
    }
}
