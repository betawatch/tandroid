package li;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRouting;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.ya;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.sy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j3(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        TLRPC.Photo photo;
        n2.e eVar;
        j2.n nVar;
        j2.n nVar2;
        View view = null;
        int i7 = 1;
        int i10 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (this.a) {
            case 0:
                k3 k3Var = (k3) this.b;
                a aVar = (a) this.c;
                if (aVar == null) {
                    k3Var.getClass();
                } else {
                    view = k3Var.e.C1(aVar);
                }
                if (view instanceof a6) {
                    a6 a6Var = (a6) view;
                    a6Var.B();
                    a6Var.getEditText().setSelection(a6Var.getEditText().length());
                    return;
                }
                return;
            case 1:
                y4 y4Var = (y4) this.b;
                TLObject tLObject = (TLObject) this.c;
                boolean z9 = y4Var.e;
                boolean z10 = y4Var.d;
                x4 x4Var = y4Var.s;
                if (y4Var.x) {
                    return;
                }
                y4Var.D = 0;
                if (y4Var.c || z10 || z9) {
                    if ((tLObject instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject).document) != null) {
                        if (!z9) {
                            if (z10) {
                                y4Var.y = true;
                                y4Var.e();
                                x4Var.f(document);
                                return;
                            } else {
                                y4Var.y = true;
                                y4Var.e();
                                x4Var.d(document);
                                return;
                            }
                        }
                        int i11 = y4Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            y4Var.y = true;
                            y4Var.e();
                            x4Var.a();
                            return;
                        }
                        y4Var.y = true;
                        y4Var.e();
                        if (!TextUtils.isEmpty(y4Var.F) && ij.X2(document) && (w10 = w7.w(document.thumbs, qs.r5, false, null, false)) != null) {
                            w7.G(i11).e0(y4Var.F, w10);
                            File file = new File(y4Var.F);
                            w7.G(i11);
                            org.telegram.messenger.g0.F(file, w7.J(w10, null, true, true));
                        }
                        x4Var.e(document);
                        return;
                    }
                } else if ((tLObject instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject).photo) != null) {
                    y4Var.y = true;
                    y4Var.e();
                    x4Var.c(photo);
                    return;
                }
                y4Var.y = true;
                y4Var.e();
                x4Var.a();
                return;
            case 2:
                y4 y4Var2 = (y4) this.b;
                String str = (String) this.c;
                if (y4Var2.x || y4Var2.y) {
                    return;
                }
                y4Var2.a(str);
                return;
            case 3:
                p5 m10 = ((m5) this.b).w.m((TL_iv.pageTableCell) this.c);
                if (m10 == null) {
                    return;
                }
                g1 g1Var = m10.a;
                g1Var.N();
                g1Var.setSelection(g1Var.length());
                return;
            case 4:
                ((m2.h) this.b).d.reportTrackChangeEvent((TrackChangeEvent) this.c);
                return;
            case 5:
                ((m2.h) this.b).d.reportNetworkEvent((NetworkEvent) this.c);
                return;
            case 6:
                ((m2.h) this.b).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.c);
                return;
            case 7:
                ((m2.h) this.b).d.reportPlaybackMetrics((PlaybackMetrics) this.c);
                return;
            case 8:
                ((m2.h) this.b).d.reportPlaybackStateEvent((PlaybackStateEvent) this.c);
                return;
            case 9:
                j2.n nVar3 = (j2.n) this.b;
                String str2 = (String) this.c;
                n2.s sVar = (n2.s) nVar3.c;
                String str3 = h2.m0.a;
                m2.e eVar2 = ((l2.c0) sVar).a.s;
                m2.a U = eVar2.U();
                eVar2.V(U, 1012, new m2.d(U, str2, 8));
                return;
            case 10:
                j2.n nVar4 = (j2.n) this.b;
                l2.c cVar = (l2.c) this.c;
                n2.s sVar2 = (n2.s) nVar4.c;
                String str4 = h2.m0.a;
                j2.n.U(((l2.c0) sVar2).a.F, cVar);
                return;
            case 11:
                n2.b0.a((n2.b0) this.b, (AudioRouting) this.c);
                return;
            case 12:
                n2.b0 b0Var = (n2.b0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (b0Var.d == null || (eVar = ((n2.h0) b0Var.b.b).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                e2.e eVar3 = eVar.j;
                List a10 = eVar.a();
                h9.t1 t1Var = n2.b.e;
                eVar.b(n2.b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar3, audioDeviceInfo, a10));
                return;
            case 13:
                ((ya) this.b).a((SpannableString) this.c);
                return;
            case 14:
                ni.s sVar3 = (ni.s) this.b;
                ni.q qVar = (ni.q) this.c;
                synchronized (sVar3.a) {
                    try {
                        if (sVar3.s) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) sVar3.n.get(qVar);
                        if (arrayList != null) {
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                if (((ni.r) obj).a != null) {
                                    ni.o oVar = (ni.o) sVar3.h.get(qVar);
                                    if (oVar != null) {
                                        nVar2 = oVar.a;
                                    } else {
                                        int i13 = 9;
                                        if (sVar3.a()) {
                                            try {
                                                com.google.android.gms.internal.play_billing.s0 c10 = sVar3.w.a.c(qVar.a, qVar.b);
                                                c10.b();
                                                nVar = new j2.n(c10, view, objArr2 == true ? 1 : 0, i13);
                                            } catch (LinkageError | OutOfMemoryError | RuntimeException e10) {
                                                if (sVar3.c != null) {
                                                    try {
                                                        a8.g(e10, true);
                                                    } catch (LinkageError | RuntimeException unused) {
                                                    }
                                                }
                                                nVar = new j2.n(view, e10, objArr == true ? 1 : 0, i13);
                                            }
                                            nVar2 = nVar;
                                        } else {
                                            nVar2 = new j2.n(view, sVar3.x, objArr3 == true ? 1 : 0, i13);
                                        }
                                    }
                                    synchronized (sVar3.a) {
                                        try {
                                            if (sVar3.s) {
                                                return;
                                            }
                                            if (oVar == null && ((Throwable) nVar2.c) == null) {
                                                sVar3.c(qVar, nVar2);
                                            }
                                            ArrayList arrayList2 = (ArrayList) sVar3.n.remove(qVar);
                                            if (arrayList2 == null) {
                                                return;
                                            }
                                            int size2 = arrayList2.size();
                                            while (i10 < size2) {
                                                Object obj2 = arrayList2.get(i10);
                                                i10++;
                                                ni.r rVar = (ni.r) obj2;
                                                try {
                                                    ni.p pVar = rVar.a;
                                                    rVar.a = null;
                                                    if (pVar != null) {
                                                        pVar.b(nVar2);
                                                    }
                                                } catch (LinkageError | RuntimeException e11) {
                                                    if (sVar3.c != null) {
                                                        try {
                                                            a8.g(e11, true);
                                                        } catch (LinkageError | RuntimeException unused2) {
                                                        }
                                                    }
                                                }
                                            }
                                            return;
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                        sVar3.n.remove(qVar);
                        return;
                    } finally {
                    }
                }
            case 15:
                ((VideoAds) this.b).lambda$showPremium$19((ug.w0) this.c);
                return;
            case 16:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 17:
                ((VideoAds) this.b).lambda$show$16((c20) this.c);
                return;
            case 18:
                sy0.d1((Context) this.b, null, false, (di.i0) this.c, null);
                return;
            case 19:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 20:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 21:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                return;
            case 22:
                ((VoIPService) this.b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.c);
                return;
            case 23:
                ((VoIPService) this.b).lambda$createGroupInstance$71((String) this.c);
                return;
            case 24:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.k0) this.c);
                return;
            case 25:
                ((VoIPService) this.b).lambda$startScreenCapture$58((TLRPC.Updates) this.c);
                return;
            case 26:
                ((AudioManager) this.b).setCommunicationDevice((AudioDeviceInfo) this.c);
                return;
            case 27:
                ((VoipAudioManager) this.b).lambda$isBluetoothAndSpeakerOnAsync$4((v10) this.c);
                return;
            case 28:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically = ((hm0) this.c).canScrollVertically(-1);
                boolean z11 = !canScrollVertically;
                if (kVar.C1 == z11) {
                    return;
                }
                ValueAnimator valueAnimator = kVar.E1;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                float f10 = kVar.D1;
                kVar.C1 = z11;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, canScrollVertically ? 0.0f : 1.0f);
                kVar.E1 = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, 4));
                kVar.E1.addListener(new org.telegram.ui.ActionBar.c(kVar, z11, i7));
                kVar.E1.setDuration(320L);
                kVar.E1.setInterpolator(xq.h);
                kVar.E1.start();
                return;
            default:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.b;
                boolean canScrollVertically2 = ((RecyclerView) this.c).canScrollVertically(-1);
                boolean z12 = !canScrollVertically2;
                if (kVar2.C1 == z12) {
                    return;
                }
                ValueAnimator valueAnimator2 = kVar2.E1;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                float f11 = kVar2.D1;
                kVar2.C1 = z12;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, canScrollVertically2 ? 0.0f : 1.0f);
                kVar2.E1 = ofFloat2;
                ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, 3));
                kVar2.E1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z12, objArr4 == true ? 1 : 0));
                kVar2.E1.setDuration(320L);
                kVar2.E1.setInterpolator(xq.h);
                kVar2.E1.start();
                return;
        }
    }
}
