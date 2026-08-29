package nh;

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.AudioRecordJNI;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.un0;
import org.telegram.ui.d31;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        boolean z10 = false;
        int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                ((Utilities.Callback) obj2).run((Bitmap) obj);
                break;
            case 1:
                f6.a((f6) obj2, (o7) obj);
                break;
            case 2:
                o7 o7Var = (o7) obj;
                f6 f6Var = (f6) ((l3.g0) obj2).d;
                Bitmap bitmap = f6Var.a;
                if (bitmap != null) {
                    bitmap.recycle();
                    if (o7Var.M0 == f6Var.a) {
                        o7Var.M0 = null;
                    }
                    f6Var.a = null;
                    f6Var.invalidate();
                    break;
                }
                break;
            case 3:
                j6 j6Var = (j6) obj2;
                AtomicReference atomicReference = j6Var.a;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                atomicReference.set(new d8.n(new com.google.android.gms.internal.vision.t2((Context) obj, x1Var)));
                j6Var.a(j6Var.f);
                break;
            case 4:
                ((j6) obj2).c.run((h6) obj);
                break;
            case 5:
                p pVar = (p) obj2;
                bg.f3 f3Var = (bg.f3) obj;
                s6 s6Var = pVar.a;
                if (f3Var.getWidth() <= 0) {
                    s6Var.animate().scaleX(0.0f).scaleY(1.0f).withEndAction(new m6(pVar, i11)).start();
                    break;
                } else {
                    float width = f3Var.getWidth() / s6Var.getWidth();
                    ValueAnimator valueAnimator = pVar.w;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    pVar.w = ValueAnimator.ofFloat(0.0f, 1.0f);
                    pVar.w.addUpdateListener(new r6(pVar, s6Var.getScaleX(), width, ((f3Var.getWidth() / 2.0f) + f3Var.getX()) - ((s6Var.getWidth() / 2.0f) + s6Var.getX()), ((f3Var.getHeight() / 2.0f) + f3Var.getY()) - ((s6Var.getHeight() / 2.0f) + s6Var.getY()), 0));
                    pVar.w.addListener(new bg.c3(9, pVar, f3Var));
                    pVar.w.setDuration(320L);
                    pVar.w.setInterpolator(jr.h);
                    pVar.v = f3Var;
                    pVar.w.start();
                    break;
                }
            case 6:
                g7 g7Var = (g7) obj2;
                g7Var.H0 = false;
                g7Var.X.addAll((ArrayList) obj);
                g7Var.m0.N(true);
                break;
            case 7:
                g7.R((g7) obj2, (TLObject) obj);
                break;
            case 8:
                o7 o7Var2 = (o7) obj2;
                TLObject tLObject = (TLObject) obj;
                o7Var2.e1 = 0;
                if (tLObject instanceof Vector) {
                    o7Var2.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            o7Var2.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 9:
                y7.R((y7) obj2, (TLObject) obj);
                break;
            case 10:
                y7 y7Var = (y7) obj2;
                TextView textView = (TextView) obj;
                ClipboardManager clipboardManager = (ClipboardManager) y7Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.e3 e3Var = y7Var.U.b;
                if ((TextUtils.isEmpty(e3Var.getText()) || TextUtils.equals(e3Var.getText(), "https://") || TextUtils.isEmpty(e3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
                    z10 = true;
                }
                org.telegram.ui.b.q(textView.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f), jr.h, 300L);
                break;
            case 11:
                e9 e9Var = (e9) obj2;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) obj).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new b6(12, e9Var, smallGroupsParticipantsCount));
                    break;
                }
                break;
            case 12:
                e9 e9Var2 = (e9) obj2;
                HashMap hashMap = (HashMap) obj;
                if (e9Var2.L == null) {
                    e9Var2.L = new HashMap();
                }
                e9Var2.L.putAll(hashMap);
                break;
            case 13:
                d dVar = (d) obj2;
                Runnable runnable = (Runnable) obj;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 14:
                ob obVar = (ob) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (obVar.k && !obVar.i) {
                    obVar.d.add(new nb(obVar, bitmap2));
                    obVar.k = false;
                    obVar.n.invalidate();
                    break;
                }
                break;
            case 15:
                int[] iArr = (int[]) obj2;
                ConnectionsManager connectionsManager = (ConnectionsManager) obj;
                int i13 = iArr[0];
                if (i13 != 0) {
                    connectionsManager.cancelRequest(i13, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 16:
                ((VideoAds) obj2).lambda$showPremium$19((cg.p1) obj);
                break;
            case 17:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                break;
            case 18:
                ((VideoAds) obj).lambda$show$16((Utilities.Callback) obj2);
                break;
            case 19:
                d31.T((Context) obj2, null, false, (lh.h0) obj, null);
                break;
            case 20:
                ((AudioRecordJNI) obj2).lambda$startThread$0((ByteBuffer) obj);
                break;
            case 21:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                break;
            case 22:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                break;
            case 23:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                break;
            case 24:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                break;
            case 25:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                break;
            case 26:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.k0) obj);
                break;
            case 27:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 28:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                break;
            default:
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) obj2;
                boolean canScrollVertically = ((un0) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically;
                if (lVar.m1 != z11) {
                    ValueAnimator valueAnimator2 = lVar.o1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f9 = lVar.n1;
                    lVar.m1 = z11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, canScrollVertically ? 0.0f : 1.0f);
                    lVar.o1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(lVar, 4));
                    lVar.o1.addListener(new org.telegram.ui.ActionBar.d(lVar, z11, i11));
                    lVar.o1.setDuration(320L);
                    lVar.o1.setInterpolator(jr.h);
                    lVar.o1.start();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b6(VideoAds videoAds, Utilities.Callback callback) {
        this.a = 18;
        this.c = videoAds;
        this.b = callback;
    }
}
