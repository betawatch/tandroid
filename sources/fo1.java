// default package

import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.l;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fo1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fo1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0236 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0242 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int i3;
        boolean z;
        ra4 ra4Var;
        yv1 yv1Var;
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        la4 la4Var;
        ha4 ha4Var;
        ha4 ha4Var2;
        yv1 yv1Var2;
        yd ydVar;
        vr1 vr1Var;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        byte b = this.a;
        int i4 = 0;
        d dVar = null;
        int i5 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((a8) obj).performClick();
                break;
            case 1:
                ((p) obj).a(Boolean.FALSE, null);
                break;
            case 2:
                dr1 dr1Var = (dr1) obj;
                i = ((d) ((yv1) dr1Var.d)).currentAccount;
                nm7.f(i).j(dr1Var.b);
                break;
            case 3:
                er1 er1Var = (er1) obj;
                i2 = ((d) ((yv1) er1Var.e)).currentAccount;
                nm7.f(i2).j(er1Var.c);
                break;
            case 4:
                ((vr1) obj).G3.G4();
                break;
            case 5:
                ((yr1) obj).T.D0.J(false);
                break;
            case 6:
                Bundle bundle = new Bundle();
                hu1 hu1Var = ((bu1) obj).c.a;
                i3 = ((d) hu1Var.R).currentAccount;
                bundle.putLong("user_id", z8c.h(i3).n);
                hu1Var.R.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((ju1) obj).b.E7(true);
                break;
            case 8:
                ((cr1) obj).c(false);
                break;
            case 9:
                yv1 yv1Var3 = ((jv1) obj).h;
                yv1Var3.getNotificationCenter().j(yv1Var3.fa);
                break;
            case 10:
                yv1 yv1Var4 = ((pv1) obj).b;
                yv1Var4.k0.getSearchField().requestFocus();
                gm.E3(yv1Var4.k0.getSearchField());
                if (yv1Var4.Ma > 0) {
                    en1 en1Var = new en1(yv1Var4, (byte) 13);
                    yv1Var4.Na = en1Var;
                    gm.d3(en1Var, 200L);
                    break;
                }
                break;
            case 11:
                int i6 = ChatActivityEnterView.z7;
                ((qw1) obj).a(Boolean.FALSE, 0, 0);
                break;
            case 12:
                ((Dialog) obj).dismiss();
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView = ((vy1) obj).f;
                int i7 = ChatActivityEnterView.z7;
                chatActivityEnterView.W1();
                break;
            case 14:
                gm.B2((hlc) obj);
                break;
            case 15:
                ChatActivityEnterView chatActivityEnterView2 = ((l) obj).Q0;
                if (!MediaController.w().F()) {
                    oc7.d1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView2.h5) {
                    chatActivityEnterView2.y4 = true;
                }
                MediaController.w().C0(chatActivityEnterView2.P);
                chatActivityEnterView2.P3.z0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView2.a2;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 16:
                ((d02) obj).s = null;
                break;
            case 17:
                n02 n02Var = (n02) obj;
                n02Var.I = false;
                boolean b2 = ia4.b(n02Var.r);
                if (b2 && (((ydVar = (yv1Var2 = n02Var.r).Z3) == null || ydVar.getVisibility() != 0 || yv1Var2.Z3.getAlpha() < 0.5f) && (vr1Var = n02Var.F) != null && vr1Var.isShown() && vr1Var.getWidth() > 0)) {
                    float f = 1.0f;
                    View view = vr1Var;
                    while (view != null) {
                        f *= view.getAlpha();
                        view = view.getParent() instanceof View ? (View) view.getParent() : null;
                    }
                    vr1Var.getLocationInWindow(new int[2]);
                    if (f >= 0.5f) {
                        if (Math.min(vr1Var.getWidth() + r8[0], vr1Var.getRootView().getWidth()) - Math.max(r8[0], 0) >= vr1Var.getWidth() / 2.0f) {
                            yv1 yv1Var5 = n02Var.r;
                            if (!yv1Var5.tb || !yv1Var5.ub) {
                                z = true;
                                MediaController w = MediaController.w();
                                ra4Var = n02Var.h;
                                if (ra4Var.b == null) {
                                    n02Var.s = null;
                                }
                                k47 k47Var = n02Var.s;
                                boolean z2 = k47Var != null ? PhotoViewer.C0() && PhotoViewer.r0().V0() : !(!w.D(k47Var) || w.C());
                                yv1Var = n02Var.r;
                                launchActivity = (yv1Var == null && (yv1Var.getParentActivity() instanceof LaunchActivity)) ? (LaunchActivity) yv1Var.getParentActivity() : null;
                                if (launchActivity == null) {
                                    ArrayList arrayList = launchActivity.Q;
                                    if (!arrayList.isEmpty()) {
                                        dVar = ((tk5) b10.f(1, arrayList)).getLastFragment();
                                        boolean z3 = ra4Var.b == null && SystemClock.uptimeMillis() - ra4Var.c >= 3600000;
                                        la4Var = ra4Var.b;
                                        if (la4Var != null && (!b2 || z3)) {
                                            ra4Var.e = true;
                                        }
                                        if (la4Var != null && !b2 && ra4Var.g == null) {
                                            ra4Var.g = dVar;
                                        }
                                        d dVar2 = ra4Var.g;
                                        boolean z4 = dVar2 == null && dVar != dVar2;
                                        if (la4Var != null && ra4Var.e && (z3 || (!ra4Var.d ? !((!b2 || ra4Var.f) && !z4) : !z2))) {
                                            ra4Var.a();
                                        }
                                        ra4Var.f = b2;
                                        n02Var.e();
                                        ha4Var = n02Var.G;
                                        if (ha4Var != null) {
                                            ha4Var.a.b(z);
                                            pa4 pa4Var = n02Var.G.a;
                                            pa4Var.getClass();
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            HashMap hashMap = pa4Var.c;
                                            ArrayList arrayList2 = new ArrayList(hashMap.values());
                                            int size = arrayList2.size();
                                            int i8 = 0;
                                            while (i8 < size) {
                                                Object obj2 = arrayList2.get(i8);
                                                i8++;
                                                oa4 oa4Var = (oa4) obj2;
                                                int i9 = (oa4Var.h || oa4Var.f < 0 || uptimeMillis - oa4Var.c < 300000) ? i4 : i5;
                                                if (i9 != 0 || (oa4Var.f < 0 && uptimeMillis - oa4Var.g >= 300)) {
                                                    pa4Var.a(oa4Var, uptimeMillis);
                                                }
                                                if (i9 != 0) {
                                                    ArrayList arrayList3 = pa4Var.d;
                                                    int size2 = arrayList3.size();
                                                    int i10 = i4;
                                                    while (i10 < size2) {
                                                        Object obj3 = arrayList3.get(i10);
                                                        i10++;
                                                        ka4 ka4Var = (ka4) obj3;
                                                        if (ka4Var.a().equals(oa4Var.a.a())) {
                                                            boolean z5 = z;
                                                            oa4Var.h = uptimeMillis - pa4Var.f > 15000;
                                                            oa4Var.f = uptimeMillis;
                                                            hashMap.put(ka4Var.a(), oa4Var.h ? oa4Var : new oa4(pa4Var, ka4Var, uptimeMillis));
                                                            z = z5;
                                                        }
                                                        i4 = 0;
                                                        i5 = 1;
                                                    }
                                                }
                                            }
                                        }
                                        boolean z6 = z;
                                        if (!n02Var.x || n02Var.e.size() > 0 || n02Var.h.b != null || ((ha4Var2 = n02Var.G) != null && !ha4Var2.a.c.isEmpty())) {
                                            n02Var.h(z6 ? 100L : 400L);
                                            break;
                                        }
                                    } else {
                                        actionBarLayout = launchActivity.q0;
                                    }
                                } else {
                                    actionBarLayout = null;
                                }
                                if (actionBarLayout == null && actionBarLayout.getLastFragment() != null) {
                                    dVar = actionBarLayout.getLastFragment();
                                } else if (yv1Var != null && yv1Var.getParentLayout() != null) {
                                    dVar = yv1Var.getParentLayout().getSafeLastFragment();
                                }
                                if (ra4Var.b == null) {
                                }
                                la4Var = ra4Var.b;
                                if (la4Var != null) {
                                    ra4Var.e = true;
                                }
                                if (la4Var != null) {
                                    ra4Var.g = dVar;
                                }
                                d dVar22 = ra4Var.g;
                                if (dVar22 == null) {
                                }
                                if (la4Var != null) {
                                    ra4Var.a();
                                }
                                ra4Var.f = b2;
                                n02Var.e();
                                ha4Var = n02Var.G;
                                if (ha4Var != null) {
                                }
                                boolean z62 = z;
                                if (!n02Var.x) {
                                }
                                n02Var.h(z62 ? 100L : 400L);
                            }
                        }
                    }
                }
                z = false;
                MediaController w2 = MediaController.w();
                ra4Var = n02Var.h;
                if (ra4Var.b == null) {
                }
                k47 k47Var2 = n02Var.s;
                if (k47Var2 != null) {
                }
                yv1Var = n02Var.r;
                if (yv1Var == null) {
                }
                if (launchActivity == null) {
                }
                if (actionBarLayout == null) {
                }
                if (yv1Var != null) {
                    dVar = yv1Var.getParentLayout().getSafeLastFragment();
                }
                if (ra4Var.b == null) {
                }
                la4Var = ra4Var.b;
                if (la4Var != null) {
                }
                if (la4Var != null) {
                }
                d dVar222 = ra4Var.g;
                if (dVar222 == null) {
                }
                if (la4Var != null) {
                }
                ra4Var.f = b2;
                n02Var.e();
                ha4Var = n02Var.G;
                if (ha4Var != null) {
                }
                boolean z622 = z;
                if (!n02Var.x) {
                }
                n02Var.h(z622 ? 100L : 400L);
                break;
            case 18:
                ((v12) obj).r0.x3.f();
                break;
            case 19:
                d32 d32Var = (d32) obj;
                d32Var.R = d32Var.r;
                break;
            case 20:
                p42 p42Var = (p42) ((zk) obj).b;
                try {
                    File file = p42Var.P;
                    if (file == null) {
                        p42Var.S();
                    } else {
                        p42Var.R(file);
                    }
                    p42Var.a0();
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 21:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((g62) obj).b;
                boolean z7 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout2.s0(-1, true);
                break;
            case 22:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((e62) obj).c;
                m62 m62Var = chatAttachAlertPhotoLayout3.Q;
                if (m62Var != null && !chatAttachAlertPhotoLayout3.b.J) {
                    m62Var.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 23:
                x62 x62Var = (x62) obj;
                i22 i22Var = x62Var.b;
                if (x62Var.R && (chatAttachAlertPhotoLayout = i22Var.d2) != null) {
                    chatAttachAlertPhotoLayout.d1.setIcon(R.drawable.ic_ab_back);
                    chatAttachAlertPhotoLayout.d1.setText(jb6.M0(2131753721, null));
                    chatAttachAlertPhotoLayout.d1.setRightIcon(0);
                    break;
                }
                break;
            case 24:
                v72 v72Var = (v72) obj;
                v72Var.m1 = -1;
                v72Var.l1 = null;
                break;
            case 25:
                ba2 ba2Var = ((y92) obj).a;
                ba2Var.e.setImageDrawable(ba2Var.r);
                ba2Var.c0.o(R.drawable.msg_addphoto, jb6.M0(2131752149, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = ba2Var.D0;
                if (user != null) {
                    user.photo = null;
                    ba2Var.getMessagesController().c4(ba2Var.D0, true, false);
                }
                ba2Var.P0 = true;
                if (ba2Var.S0 == null) {
                    ba2Var.S0 = new p09(R.raw.camera_outline, gm.L(50.0f), gm.L(50.0f), false, null);
                }
                ba2Var.c0.e.setTranslationX(-gm.L(8.0f));
                ba2Var.c0.e.setAnimation(ba2Var.S0);
                break;
            case 26:
                mc2 mc2Var = ((zc2) obj).e;
                if (mc2Var != null) {
                    mc2Var.i();
                    break;
                }
                break;
            case 27:
                ((id2) obj).p();
                break;
            case 28:
                ((ae2) obj).setVisibility(8);
                break;
            default:
                qe2 qe2Var = (qe2) ((ni6) obj).b;
                pe2 pe2Var = qe2Var.b;
                if (pe2Var != null) {
                    pe2Var.a(true);
                }
                qe2Var.a.M5(true);
                break;
        }
    }
}
