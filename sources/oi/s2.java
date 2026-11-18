package oi;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.n10;
import org.telegram.messenger.q10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.f60;
import org.telegram.ui.f9;
import org.telegram.ui.uy0;
import org.telegram.ui.w8;
import org.telegram.ui.x6;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class s2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View C1;
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        TLRPC.Photo photo;
        int i7 = this.a;
        int i10 = 0;
        int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                ((s3) obj2).f2((String) obj);
                break;
            case 1:
                s3 s3Var = (s3) obj2;
                b2 b2Var = (b2) obj;
                s3Var.getClass();
                long j3 = b2Var.a;
                int i12 = b2Var.d;
                int i13 = b2Var.c;
                ArrayList arrayList = s3Var.t3;
                int i14 = 0;
                while (true) {
                    if (i14 >= arrayList.size()) {
                        i14 = -1;
                    } else if (((a) arrayList.get(i14)).a != j3) {
                        i14++;
                    }
                }
                if (i14 >= 0) {
                    KeyEvent.Callback m10 = s3Var.f3.m(i14);
                    if (m10 instanceof z5) {
                        z5 z5Var = (z5) m10;
                        z5Var.B();
                        e1 editText = z5Var.getEditText();
                        int length = editText.length();
                        editText.setSelection(Math.max(0, Math.min(i13, length)), Math.max(0, Math.min(i12, length)));
                        break;
                    } else if (m10 instanceof l5) {
                        l5 l5Var = (l5) m10;
                        e1 m11 = l5Var.m(b2Var.b);
                        if (m11 == null) {
                            m11 = l5Var.m(0);
                        }
                        if (m11 != null) {
                            m11.O();
                            int length2 = m11.length();
                            m11.setSelection(Math.max(0, Math.min(i13, length2)), Math.max(0, Math.min(i12, length2)));
                            break;
                        }
                    } else if (m10 instanceof i0) {
                        e1 captionEditText = ((i0) m10).getCaptionEditText();
                        captionEditText.O();
                        int length3 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i13, length3)), Math.max(0, Math.min(i12, length3)));
                        break;
                    }
                }
                break;
            case 2:
                j3 j3Var = (j3) obj2;
                a aVar = (a) obj;
                if (aVar == null) {
                    j3Var.getClass();
                    C1 = null;
                } else {
                    C1 = j3Var.e.C1(aVar);
                }
                if (C1 instanceof z5) {
                    z5 z5Var2 = (z5) C1;
                    z5Var2.B();
                    z5Var2.getEditText().setSelection(z5Var2.getEditText().length());
                    break;
                }
                break;
            case 3:
                x4 x4Var = (x4) obj2;
                TLObject tLObject = (TLObject) obj;
                boolean z10 = x4Var.e;
                boolean z11 = x4Var.d;
                w4 w4Var = x4Var.s;
                if (!x4Var.x) {
                    x4Var.E = 0;
                    if (!x4Var.c && !z11 && !z10) {
                        if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                            x4Var.y = true;
                            x4Var.e();
                            w4Var.c(photo);
                            break;
                        }
                    } else if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (z10) {
                            int i15 = x4Var.a;
                            if (document.id != 0 && document.access_hash != 0) {
                                x4Var.y = true;
                                x4Var.e();
                                if (!TextUtils.isEmpty(x4Var.G) && fj.W2(document) && (w10 = w7.w(document.thumbs, ks.r5, false, null, false)) != null) {
                                    w7.G(i15).e0(x4Var.G, w10);
                                    File file = new File(x4Var.G);
                                    w7.G(i15);
                                    org.telegram.messenger.g0.F(file, w7.J(w10, null, true, true));
                                }
                                w4Var.e(document);
                                break;
                            } else {
                                x4Var.y = true;
                                x4Var.e();
                                w4Var.a();
                                break;
                            }
                        } else if (z11) {
                            x4Var.y = true;
                            x4Var.e();
                            w4Var.f(document);
                            break;
                        } else {
                            x4Var.y = true;
                            x4Var.e();
                            w4Var.d(document);
                            break;
                        }
                    }
                    x4Var.y = true;
                    x4Var.e();
                    w4Var.a();
                    break;
                }
                break;
            case 4:
                x4 x4Var2 = (x4) obj2;
                String str = (String) obj;
                if (!x4Var2.x && !x4Var2.y) {
                    x4Var2.a(str);
                    break;
                }
                break;
            case 5:
                o5 m12 = ((l5) obj2).w.m((TL_iv.pageTableCell) obj);
                if (m12 != null) {
                    e1 e1Var = m12.a;
                    e1Var.O();
                    e1Var.setSelection(e1Var.length());
                    break;
                }
                break;
            case 6:
                ((VideoAds) obj2).lambda$showPremium$19((ug.z0) obj);
                break;
            case 7:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                break;
            case 8:
                ((VideoAds) obj2).lambda$show$16((x10) obj);
                break;
            case 9:
                uy0.e1((Context) obj2, null, false, (fi.h0) obj, null);
                break;
            case 10:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                break;
            case 11:
                ((GroupCallMessagesController) obj2).lambda$sendCallMessage$5((String) obj);
                break;
            case 12:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                break;
            case 13:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                break;
            case 14:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                break;
            case 15:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                break;
            case 16:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) obj);
                break;
            case 17:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 18:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                break;
            case 19:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((q10) obj);
                break;
            case 20:
                ((org.telegram.ui.o) obj2).c0((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 21:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                vf.b bVar = (vf.b) obj;
                org.telegram.ui.t3 t3Var = g4Var.L;
                if (t3Var != null) {
                    t3Var.a(true);
                }
                if (g4Var.O0 == bVar) {
                    g4Var.O0 = null;
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.g4) obj2).T0.d();
                ((AnimatorSet) obj).start();
                break;
            case 23:
                org.telegram.ui.e2.a((org.telegram.ui.e2) obj2, (SpannableString) obj);
                break;
            case 24:
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) ((org.telegram.ui.m4) obj2).b;
                if (!arrayList2.isEmpty()) {
                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                        p4Var.getMessagesController().T4(p4Var.Z() * 60, ((Long) arrayList2.get(i16)).longValue());
                    }
                    if (p4Var.Z() > 0) {
                        n10.u(gd.a0("AutodeleteTimerEnabledForChats", null, 2131753776, gd.c0(p4Var.Z() * 60), gd.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size()))), lc.b0(p4Var), R.raw.fire_on, 36);
                        break;
                    } else {
                        lc.b0(p4Var).Q(R.raw.fire_off, 36, gd.a0("AutodeleteTimerDisabledForChats", null, 2131753777, gd.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size())))).j();
                        break;
                    }
                }
                break;
            case 25:
                org.telegram.ui.t5 t5Var = (org.telegram.ui.t5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                t5Var.U = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    t5Var.getMessagesController().I0().b(t5Var.S, t5Var.U, new org.telegram.ui.l5(t5Var, i10));
                }
                t5Var.i0.animate().cancel();
                t5Var.i0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new ki.n3(t5Var, 18));
                t5Var.I0(true);
                t5Var.J0(true);
                t5Var.H0(null);
                break;
            case 26:
                org.telegram.ui.x5 x5Var = (org.telegram.ui.x5) obj2;
                org.telegram.messenger.t2 t2Var = (org.telegram.messenger.t2) obj;
                ArrayList arrayList3 = x5Var.c;
                int i17 = 0;
                while (true) {
                    if (i17 < arrayList3.size()) {
                        if (((org.telegram.ui.w5) arrayList3.get(i17)).c == null || ((org.telegram.ui.w5) arrayList3.get(i17)).c.a != t2Var.a) {
                            i17++;
                        } else {
                            i10 = i17;
                        }
                    }
                }
                v4.f1 K = x5Var.b.K(i10);
                if (K != null) {
                    View view = K.a;
                    f60 f60Var = new f60(x5Var.getParentActivity(), x5Var);
                    f60Var.h(true);
                    f60Var.setParentWindow(org.telegram.ui.Components.b5.N(x5Var, f60Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    f60Var.setCallback(new org.telegram.ui.u5(x5Var, t2Var, i11));
                    break;
                }
                break;
            case 27:
                x6.c0((x6) obj2, (org.telegram.ui.ActionBar.u1) obj);
                break;
            case 28:
                yg0 yg0Var = new yg0((Context) obj2, gd.M0(2131748978, null), ((String[]) obj)[0], gd.M0(2131746314, null), false);
                yg0Var.J0();
                yg0Var.show();
                break;
            default:
                ((w8) obj2).b.i0(((TLRPC.Message) i5.c.h(1, ((f9) obj).c)).id, 100);
                break;
        }
    }
}
