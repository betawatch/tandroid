package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hk0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        boolean z10;
        String M0;
        boolean z11;
        String a02;
        org.telegram.ui.ActionBar.d2 T;
        org.telegram.ui.Components.ac I;
        cl0 cl0Var;
        cl0 cl0Var2;
        mj mjVar;
        org.telegram.messenger.video.o oVar;
        int i3 = 16;
        switch (this.a) {
            case 0:
                dl0 dl0Var = (dl0) this.b;
                TLRPC.Message[] messageArr = (TLRPC.Message[]) this.c;
                Object parentActivity = dl0Var.getParentActivity();
                Object obj = parentActivity;
                if (parentActivity == null) {
                    obj = org.telegram.messenger.t0.b;
                }
                if (obj == null) {
                    obj = LaunchActivity.K1;
                }
                if (obj != null) {
                    dl0Var.b1 = true;
                    dl0Var.g1 = 1;
                    TLRPC.InputInvoice inputInvoice = dl0Var.c1;
                    boolean z12 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
                    boolean z13 = z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
                    boolean z14 = z12 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
                    if (!z12 && (cl0Var2 = dl0Var.a1) != null) {
                        cl0Var2.e(1);
                    }
                    dl0Var.z0();
                    if (z12 && (cl0Var = dl0Var.a1) != null) {
                        cl0Var.e(dl0Var.g1);
                    }
                    long w02 = dl0Var.w0();
                    if (w02 <= 0) {
                        str = "";
                        if (w02 < 0) {
                            z10 = false;
                            TLRPC.Chat M02 = dl0Var.getMessagesController().M0(Long.valueOf(-w02));
                            if (M02 != null) {
                                str = M02.title;
                            }
                            long v02 = dl0Var.v0();
                            int i10 = !z12 ? (z13 || z14) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                            if (z12) {
                                M0 = null;
                            } else {
                                M0 = org.telegram.messenger.bd.M0(z14 ? 2131745102 : z13 ? 2131745110 : 2131745169, null);
                            }
                            int i11 = 2;
                            if (z12) {
                                z11 = z10;
                                String str2 = dl0Var.S0[z11 ? 1 : 0];
                                String str3 = dl0Var.r0;
                                Object[] objArr = new Object[2];
                                objArr[z11 ? 1 : 0] = str2;
                                objArr[1] = str3;
                                a02 = org.telegram.messenger.bd.a0(null, null, 2131747409, objArr);
                            } else if (z14) {
                                a02 = org.telegram.messenger.bd.H(',', "StarsGiveawaySentPopupInfo", (int) v02);
                                z11 = z10;
                            } else {
                                z11 = z10;
                                String str4 = z13 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo";
                                Object[] objArr2 = new Object[1];
                                objArr2[z11 ? 1 : 0] = str;
                                a02 = org.telegram.messenger.bd.K(str4, (int) v02, ',', objArr2);
                            }
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(a02);
                            T = LaunchActivity.T();
                            if (T == null) {
                                org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(T);
                                if (w02 == 0 || M0 == null || z14) {
                                    String str5 = M0;
                                    I = str5 != null ? a03.I(i10, str5, X2) : a03.Q(i10, 36, X2);
                                } else {
                                    I = a03.L(i10, M0, X2, org.telegram.messenger.bd.M0(2131743562, null), new ci.u3(w02, i11));
                                }
                                org.telegram.ui.Components.ac acVar = I;
                                boolean z15 = z11;
                                acVar.r = z15;
                                acVar.j = 5000;
                                if (messageArr[z15 ? 1 : 0] != null) {
                                    ei.u3 u3Var = new ei.u3(dl0Var, acVar, z13, messageArr, 3);
                                    org.telegram.ui.Components.fb fbVar = acVar.e;
                                    if (fbVar != null) {
                                        fbVar.setOnClickListener(u3Var);
                                    }
                                }
                                acVar.k(z14);
                                break;
                            }
                        }
                    } else {
                        str = org.telegram.messenger.l10.k(dl0Var.getMessagesController().a2(Long.valueOf(w02)));
                    }
                    z10 = false;
                    long v022 = dl0Var.v0();
                    int i102 = !z12 ? (z13 || z14) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
                    if (z12) {
                    }
                    int i112 = 2;
                    if (z12) {
                    }
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(a02);
                    T = LaunchActivity.T();
                    if (T == null) {
                    }
                }
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                iy0.d1(photoViewer.F, photoViewer.n4, false, (ei.b) this.c, null);
                break;
            case 2:
                PhotoViewer photoViewer2 = (PhotoViewer) this.b;
                vo0 vo0Var = (vo0) this.c;
                Drawable[] drawableArr = PhotoViewer.V8;
                if (vo0Var.getWindow() != null) {
                    vo0Var.A0(true);
                    wm wmVar = photoViewer2.m4;
                    if (wmVar != null && (mjVar = wmVar.a0) != null) {
                        mjVar.j0(false);
                        break;
                    }
                }
                break;
            case 3:
                ai.m1 m1Var = (ai.m1) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                Drawable[] drawableArr2 = PhotoViewer.V8;
                m1Var.a(bitmap);
                break;
            case 4:
                PhotoViewer photoViewer3 = (PhotoViewer) this.b;
                ug.n0 n0Var = (ug.n0) this.c;
                Drawable[] drawableArr3 = PhotoViewer.V8;
                n0Var.e.h();
                n0Var.c.postRunnable(new hb1(i3));
                photoViewer3.f0.removeView(photoViewer3.O1);
                break;
            case 5:
                org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Drawable[] drawableArr4 = PhotoViewer.V8;
                if (t5Var != null) {
                    ArrayList arrayList = t5Var.h;
                    org.telegram.ui.Components.q5 q5Var = t5Var.n;
                    if (q5Var != null) {
                        arrayList.add(q5Var);
                    }
                    org.telegram.ui.Components.q5 q5Var2 = t5Var.r;
                    if (q5Var2 != null) {
                        arrayList.add(q5Var2);
                    }
                    org.telegram.ui.Components.q5 q5Var3 = t5Var.s;
                    if (q5Var3 != null) {
                        arrayList.add(q5Var3);
                    }
                    t5Var.n = new org.telegram.ui.Components.q5(bitmap2);
                    t5Var.r = null;
                    t5Var.s = null;
                    t5Var.t();
                    break;
                }
                break;
            case 6:
                vn0 vn0Var = (vn0) this.b;
                View view = (View) this.c;
                vn0Var.getClass();
                view.setOutlineProvider(null);
                PhotoViewer photoViewer4 = vn0Var.c;
                ImageView imageView = photoViewer4.y3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                fq0 fq0Var = photoViewer4.F2;
                if (fq0Var != null) {
                    fq0Var.setOutlineProvider(null);
                    break;
                }
                break;
            case 7:
                dp0 dp0Var = (dp0) this.b;
                org.telegram.ui.Components.m51 m51Var = (org.telegram.ui.Components.m51) this.c;
                dp0Var.getClass();
                if (m51Var.U() > 0 && m51Var.S() >= m51Var.U() - 590) {
                    dp0Var.a.f0.invalidate();
                    break;
                }
                break;
            case 8:
                gp0 gp0Var = (gp0) this.b;
                ug.n0 n0Var2 = (ug.n0) this.c;
                n0Var2.e.h();
                n0Var2.c.postRunnable(new hb1(i3));
                try {
                    gp0Var.b.f0.removeView(n0Var2);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 9:
                po0 po0Var = (po0) this.b;
                ai.c0 c0Var = (ai.c0) this.c;
                PhotoViewer photoViewer5 = po0Var.b;
                if (photoViewer5.D3 != null) {
                    ImageView imageView2 = photoViewer5.y3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer5.y3.setImageBitmap(photoViewer5.D3);
                    }
                    ((ImageReceiver) c0Var.b).v0(photoViewer5.D3);
                    break;
                }
                break;
            case 10:
                qp0 qp0Var = (qp0) this.b;
                AnimatorSet animatorSet = (AnimatorSet) this.c;
                qp0Var.r.m7.d();
                animatorSet.start();
                break;
            case 11:
                qp0 qp0Var2 = (qp0) this.b;
                mq0 mq0Var = (mq0) this.c;
                qp0Var2.r.t4 = false;
                if (!mq0Var.s) {
                    mq0Var.a.O0(false, true);
                    break;
                }
                break;
            case 12:
                pr0 pr0Var = (pr0) this.b;
                String str6 = (String) this.c;
                pr0Var.getClass();
                org.telegram.messenger.g0.g(str6);
                pr0Var.c(true);
                break;
            case 13:
                pr0 pr0Var2 = (pr0) this.b;
                TLRPC.PollAnswer pollAnswer = (TLRPC.PollAnswer) this.c;
                pr0Var2.getClass();
                org.telegram.messenger.g0.g(org.telegram.messenger.zi.h0(pollAnswer.text, false));
                pr0Var2.c(true);
                break;
            case 14:
                pr0 pr0Var3 = (pr0) this.b;
                byte[] bArr = (byte[]) this.c;
                org.telegram.messenger.yy C = org.telegram.messenger.yy.C(pr0Var3.I.I1);
                org.telegram.messenger.zi ziVar = pr0Var3.I;
                if (ziVar != null && (org.telegram.messenger.zi.n1(ziVar) instanceof TLRPC.TL_messageMediaPoll)) {
                    long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                    int f12 = ziVar.f1();
                    TLRPC.TL_messages_deletePollAnswer tL_messages_deletePollAnswer = new TLRPC.TL_messages_deletePollAnswer();
                    tL_messages_deletePollAnswer.peer = C.getMessagesController().j1(B0);
                    tL_messages_deletePollAnswer.msg_id = f12;
                    tL_messages_deletePollAnswer.option = bArr;
                    ConnectionsManager connectionsManager = C.getConnectionsManager();
                    org.telegram.messenger.p5 p5Var = Utilities.d;
                    Objects.requireNonNull(p5Var);
                    connectionsManager.sendRequestTyped(tL_messages_deletePollAnswer, new org.telegram.messenger.v3(p5Var), new org.telegram.messenger.d(C, 7));
                }
                pr0Var3.c(true);
                break;
            case 15:
                PrivacyControlActivity.b0((PrivacyControlActivity) this.b, (TLObject) this.c);
                break;
            case 16:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) this.b;
                boolean[] zArr = (boolean[]) this.c;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.I0();
                    break;
                }
                break;
            case 17:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.d = (TL_account.Password) this.c;
                privacySettingsActivity.D0();
                break;
            case 18:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) this.b;
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.c;
                boolean z16 = !privacySettingsActivity2.W;
                privacySettingsActivity2.W = z16;
                q8Var.setChecked(z16);
                break;
            case 19:
                ((it0) this.b).getMessagesController().f5(null, ((Long) this.c).longValue());
                break;
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                Object[] objArr3 = (Object[]) this.c;
                RectF rectF = ProfileActivity.T6;
                profileActivity.getNotificationCenter().n(profileActivity, 4);
                profileActivity.getNotificationCenter().k(4, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) objArr3[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.id);
                profileActivity.presentFragment(new wm(bundle), true);
                break;
            case 21:
                ProfileActivity profileActivity2 = (ProfileActivity) this.b;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) this.c;
                long j10 = profileActivity2.A2;
                if (j10 == 0) {
                    profileActivity2.getNotificationCenter().n(profileActivity2, 4);
                    if (org.telegram.messenger.g0.Q1()) {
                        profileActivity2.getNotificationCenter().k(4, Long.valueOf(-profileActivity2.f1));
                    } else {
                        profileActivity2.getNotificationCenter().k(4, new Object[0]);
                    }
                    profileActivity2.getMessagesController().f0(profileActivity2.f1, profileActivity2.getMessagesController().a2(Long.valueOf(profileActivity2.getUserConfig().e())));
                    profileActivity2.J1 = 0;
                    profileActivity2.finishFragment();
                    break;
                } else {
                    TLRPC.User a22 = profileActivity2.getMessagesController().a2(Long.valueOf(j10));
                    profileActivity2.getMessagesController().f0(profileActivity2.f1, a22);
                    if (profileActivity2.E2 != null && a22 != null && org.telegram.ui.Components.fc.a(profileActivity2)) {
                        org.telegram.ui.Components.fc.D(profileActivity2, a22, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.D5(true, false);
                        break;
                    }
                }
                break;
            case 22:
                ProfileActivity profileActivity3 = (ProfileActivity) this.b;
                TLRPC.Chat chat = (TLRPC.Chat) this.c;
                RectF rectF2 = ProfileActivity.T6;
                org.telegram.messenger.g0.g("https://" + profileActivity3.getMessagesController().V2 + "/" + org.telegram.messenger.t3.K(chat, false));
                break;
            case 23:
                ProfileActivity profileActivity4 = (ProfileActivity) this.b;
                TL_fragment.TL_collectibleInfo tL_collectibleInfo = (TL_fragment.TL_collectibleInfo) this.c;
                RectF rectF3 = ProfileActivity.T6;
                profileActivity4.getClass();
                org.telegram.ui.Components.ac.e();
                sf.c.t(profileActivity4.getParentActivity(), tL_collectibleInfo.url);
                break;
            case 24:
                ProfileActivity profileActivity5 = (ProfileActivity) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                RectF rectF4 = ProfileActivity.T6;
                profileActivity5.E2 = profileActivity5.getMessagesStorage().O(profileActivity5.f1);
                countDownLatch.countDown();
                break;
            case 25:
                ProfileActivity profileActivity6 = (ProfileActivity) this.b;
                View view2 = (View) this.c;
                RectF rectF5 = ProfileActivity.T6;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.l8) view2).setChecked(profileActivity6.s2.g());
                break;
            case 26:
                ProfileActivity profileActivity7 = (ProfileActivity) this.b;
                TLObject tLObject = (TLObject) this.c;
                RectF rectF6 = ProfileActivity.T6;
                profileActivity7.getClass();
                profileActivity7.G2 = ((TLRPC.TL_channels_channelParticipant) tLObject).participant;
                break;
            case 27:
                ProfileActivity profileActivity8 = (ProfileActivity) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                RectF rectF7 = ProfileActivity.T6;
                if (!zArr2[0] && (oVar = profileActivity8.y5) != null) {
                    oVar.run();
                }
                profileActivity8.y5 = null;
                break;
            case 28:
                lu0 lu0Var = (lu0) this.b;
                a0.h hVar = (a0.h) this.c;
                ProfileActivity profileActivity9 = lu0Var.S2.c;
                org.telegram.ui.Components.fc.x(profileActivity9.getParentActivity(), profileActivity9.n5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).id : 0L, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, lu0Var.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, lu0Var.J0)).j();
                break;
            default:
                bv0 bv0Var = (bv0) this.b;
                a0.h hVar2 = (a0.h) this.c;
                ProfileActivity profileActivity10 = bv0Var.S2;
                org.telegram.ui.Components.fc.x(profileActivity10.getParentActivity(), profileActivity10.n5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).id : 0L, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.tj, bv0Var.J0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.vj, bv0Var.J0)).j();
                break;
        }
    }

    public /* synthetic */ hk0(org.telegram.ui.Components.oo0 oo0Var, a0.h hVar, int i3, int i10) {
        this.a = i10;
        this.b = oo0Var;
        this.c = hVar;
    }
}
