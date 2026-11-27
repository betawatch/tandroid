// default package

import android.app.Dialog;
import android.os.Bundle;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.l;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class go1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ go1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        int i3;
        boolean z;
        na4 na4Var;
        r47 r47Var;
        da4 da4Var;
        da4 da4Var2;
        zu1 zu1Var;
        zc zcVar;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout;
        byte b = this.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                    break;
                }
                break;
            case 1:
                ((p) obj).a(Boolean.FALSE, null);
                break;
            case 2:
                eq1 eq1Var = (eq1) obj;
                i = ((e) ((zu1) eq1Var.d)).currentAccount;
                jn7.f(i).j(eq1Var.b);
                break;
            case 3:
                fq1 fq1Var = (fq1) obj;
                i2 = ((e) ((zu1) fq1Var.e)).currentAccount;
                jn7.f(i2).j(fq1Var.c);
                break;
            case 4:
                ((wq1) obj).G3.G4();
                break;
            case 5:
                ((zq1) obj).T.D0.J(false);
                break;
            case 6:
                Bundle bundle = new Bundle();
                it1 it1Var = ((ct1) obj).c.a;
                i3 = ((e) it1Var.R).currentAccount;
                bundle.putLong("user_id", yac.h(i3).n);
                it1Var.R.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 7:
                ((kt1) obj).b.E7(true);
                break;
            case 8:
                ((dq1) obj).c(false);
                break;
            case 9:
                zu1 zu1Var2 = ((ku1) obj).h;
                zu1Var2.getNotificationCenter().j(zu1Var2.fa);
                break;
            case 10:
                zu1 zu1Var3 = ((qu1) obj).b;
                zu1Var3.k0.getSearchField().requestFocus();
                hl.E3(zu1Var3.k0.getSearchField());
                if (zu1Var3.Ma > 0) {
                    hm1 hm1Var = new hm1(zu1Var3, (byte) 27);
                    zu1Var3.Na = hm1Var;
                    hl.d3(hm1Var, 200L);
                    break;
                }
                break;
            case 11:
                int i4 = ChatActivityEnterView.X7;
                ((bw1) obj).a(Boolean.FALSE, 0, 0);
                break;
            case 12:
                ((Dialog) obj).dismiss();
                break;
            case 13:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) ((wx1) obj).c;
                int i5 = ChatActivityEnterView.X7;
                chatActivityEnterView.e2(true);
                break;
            case 14:
                ChatActivityEnterView chatActivityEnterView2 = ((xx1) obj).f;
                int i6 = ChatActivityEnterView.X7;
                chatActivityEnterView2.f2();
                break;
            case 15:
                hl.B2((tnc) obj);
                break;
            case 16:
                ChatActivityEnterView chatActivityEnterView3 = ((l) obj).U0;
                if (!MediaController.z().J()) {
                    uc7.e1().edit().putInt("voicepausehint", 3).apply();
                }
                if (chatActivityEnterView3.j5) {
                    chatActivityEnterView3.x4 = true;
                }
                MediaController.z().H0(chatActivityEnterView3.P);
                chatActivityEnterView3.O3.z0(0);
                ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView3.Z1;
                if (slideTextView != null) {
                    slideTextView.setEnabled(false);
                    break;
                }
                break;
            case 17:
                ((iz1) obj).s = null;
                break;
            case 18:
                sz1 sz1Var = (sz1) obj;
                sz1Var.I = false;
                boolean e = ea4.e(sz1Var.r);
                if (e && (((zcVar = (zu1Var = sz1Var.r).Z3) == null || zcVar.getVisibility() != 0 || zu1Var.Z3.getAlpha() < 0.5f) && ea4.d(sz1Var.F))) {
                    zu1 zu1Var4 = sz1Var.r;
                    if (!zu1Var4.ub || !zu1Var4.vb) {
                        z = true;
                        MediaController z3 = MediaController.z();
                        na4Var = sz1Var.h;
                        if (na4Var.b == null) {
                            sz1Var.s = null;
                        }
                        r47Var = sz1Var.s;
                        if (r47Var != null ? !(!PhotoViewer.C0() || !PhotoViewer.q0().V0()) : !(!z3.H(r47Var) || z3.G())) {
                            z2 = true;
                        }
                        na4Var.c(e, e, z2, ea4.l(sz1Var.r));
                        sz1Var.e();
                        da4Var = sz1Var.G;
                        if (da4Var != null) {
                            da4Var.a.b(z);
                            sz1Var.G.a.c();
                        }
                        if (!sz1Var.x || sz1Var.e.size() > 0 || sz1Var.h.b != null || ((da4Var2 = sz1Var.G) != null && !da4Var2.a.c.isEmpty())) {
                            sz1Var.h(z ? 100L : 400L);
                            break;
                        }
                    }
                }
                z = false;
                MediaController z32 = MediaController.z();
                na4Var = sz1Var.h;
                if (na4Var.b == null) {
                }
                r47Var = sz1Var.s;
                if (r47Var != null) {
                    na4Var.c(e, e, z2, ea4.l(sz1Var.r));
                    sz1Var.e();
                    da4Var = sz1Var.G;
                    if (da4Var != null) {
                    }
                    if (!sz1Var.x) {
                    }
                    sz1Var.h(z ? 100L : 400L);
                } else {
                    na4Var.c(e, e, z2, ea4.l(sz1Var.r));
                    sz1Var.e();
                    da4Var = sz1Var.G;
                    if (da4Var != null) {
                    }
                    if (!sz1Var.x) {
                    }
                    sz1Var.h(z ? 100L : 400L);
                }
                break;
            case 19:
                ((a12) obj).l0.x3.f();
                break;
            case 20:
                i22 i22Var = (i22) obj;
                i22Var.R = i22Var.r;
                break;
            case 21:
                u32 u32Var = (u32) ((ak) obj).b;
                try {
                    File file = u32Var.P;
                    if (file == null) {
                        u32Var.S();
                    } else {
                        u32Var.R(file);
                    }
                    u32Var.Z();
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
            case 22:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout2 = ((l52) obj).b;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                chatAttachAlertPhotoLayout2.r0(-1, true);
                break;
            case 23:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout3 = ((j52) obj).c;
                r52 r52Var = chatAttachAlertPhotoLayout3.Q;
                if (r52Var != null && !chatAttachAlertPhotoLayout3.b.J) {
                    r52Var.setSystemUiVisibility(1028);
                    break;
                }
                break;
            case 24:
                c62 c62Var = (c62) obj;
                n12 n12Var = c62Var.b;
                if (c62Var.R && (chatAttachAlertPhotoLayout = n12Var.d2) != null) {
                    chatAttachAlertPhotoLayout.d1.setIcon(R.drawable.ic_ab_back);
                    chatAttachAlertPhotoLayout.d1.setText(ob6.M0(2131753749, null));
                    chatAttachAlertPhotoLayout.d1.setRightIcon(0);
                    break;
                }
                break;
            case 25:
                a72 a72Var = (a72) obj;
                a72Var.m1 = -1;
                a72Var.l1 = null;
                break;
            case 26:
                g92 g92Var = ((d92) obj).a;
                g92Var.e.setImageDrawable(g92Var.r);
                g92Var.c0.o(R.drawable.msg_addphoto, ob6.M0(2131752177, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = g92Var.D0;
                if (user != null) {
                    user.photo = null;
                    g92Var.getMessagesController().i4(g92Var.D0, true, false);
                }
                g92Var.P0 = true;
                if (g92Var.S0 == null) {
                    g92Var.S0 = new b29(R.raw.camera_outline, hl.L(50.0f), hl.L(50.0f), false, null);
                }
                g92Var.c0.e.setTranslationX(-hl.L(8.0f));
                g92Var.c0.e.setAnimation(g92Var.S0);
                break;
            case 27:
                rb2 rb2Var = ((ec2) obj).e;
                if (rb2Var != null) {
                    rb2Var.i();
                    break;
                }
                break;
            case 28:
                ((nc2) obj).l();
                break;
            default:
                ((fd2) obj).setVisibility(8);
                break;
        }
    }
}
