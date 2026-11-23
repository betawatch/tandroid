package oi;

import android.animation.AnimatorSet;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.o10;
import org.telegram.messenger.r10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.f60;
import org.telegram.ui.uy0;
import org.telegram.ui.x6;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:178|(2:179|180)|181|(1:183)|193|(2:194|195)|(3:242|243|(12:245|246|(2:237|238)|199|(1:201)|202|203|204|(1:(1:207))(7:209|210|211|212|213|214|215)|208|185|(1:191)(2:189|190)))|197|(0)|199|(0)|202|203|204|(0)(0)|208|185|(2:187|191)(1:192)) */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03d1, code lost:
    
        if (r2 == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x044b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x049e, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x044d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0409 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        String str3;
        InputStream openInputStream;
        Cursor query;
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        TLRPC.Photo photo;
        int i7 = this.a;
        int i10 = 2;
        ?? r42 = null;
        int i11 = 0;
        int i12 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                v vVar = (v) obj2;
                TLObject tLObject = (TLObject) obj;
                vVar.c2 = false;
                vVar.d2 = 0;
                hi.e eVar = vVar.b2;
                eVar.setLoading(false);
                if (!(tLObject instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    org.telegram.messenger.g0.E3(4.0f, eVar, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject).result;
                if (richMessage == null) {
                    org.telegram.messenger.g0.E3(4.0f, eVar, null);
                    return;
                }
                vVar.e2 = richMessage;
                vVar.Y1.set(richMessage);
                eVar.i(hd.N0(2131754058, null), true, true);
                vVar.e1();
                c51 c51Var = vVar.V1;
                if (c51Var != null) {
                    c51Var.O(true);
                    return;
                }
                return;
            case 1:
                t3 t3Var = (t3) obj2;
                Uri uri = (Uri) obj;
                try {
                    str = org.telegram.messenger.g0.T0(uri);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    boolean B = a8.p0.B(str);
                    str3 = str;
                    break;
                }
                try {
                    query = t3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                } catch (Exception e11) {
                    e = e11;
                    str2 = null;
                    a8.g(e, true);
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str3 = r42;
                    if (TextUtils.isEmpty(str3)) {
                    }
                }
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str2 = query.getString(0);
                            if (query != null) {
                                try {
                                    query.close();
                                } catch (Exception e12) {
                                    e = e12;
                                    a8.g(e, true);
                                    if (TextUtils.isEmpty(str2)) {
                                    }
                                    String replace2 = str2.replace('/', '_').replace('\\', '_');
                                    openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                                    if (openInputStream == null) {
                                    }
                                    str3 = r42;
                                    if (TextUtils.isEmpty(str3)) {
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str2 = "document_" + cz.p();
                            }
                            String replace22 = str2.replace('/', '_').replace('\\', '_');
                            openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                            if (openInputStream == null) {
                                try {
                                    File file = new File(w7.z(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    try {
                                        org.telegram.messenger.g0.D(openInputStream, fileOutputStream);
                                        fileOutputStream.close();
                                        String absolutePath = file.getAbsolutePath();
                                        openInputStream.close();
                                        r42 = absolutePath;
                                    } finally {
                                    }
                                } finally {
                                }
                            } else if (openInputStream != null) {
                                openInputStream.close();
                            }
                            str3 = r42;
                            if (TextUtils.isEmpty(str3) && a8.p0.B(str3)) {
                                org.telegram.messenger.g0.g3(new t(i10, t3Var, str3));
                                return;
                            }
                            return;
                        }
                    } catch (Throwable th2) {
                        try {
                            query.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
                str2 = null;
                if (query != null) {
                }
                if (TextUtils.isEmpty(str2)) {
                }
                String replace222 = str2.replace('/', '_').replace('\\', '_');
                openInputStream = t3Var.getContext().getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                }
                str3 = r42;
                if (TextUtils.isEmpty(str3)) {
                    return;
                } else {
                    return;
                }
            case 2:
                ((t3) obj2).f2((String) obj);
                return;
            case 3:
                t3 t3Var2 = (t3) obj2;
                d2 d2Var = (d2) obj;
                t3Var2.getClass();
                long j3 = d2Var.a;
                int i13 = d2Var.d;
                int i14 = d2Var.c;
                ArrayList arrayList = t3Var2.t3;
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList.size()) {
                        i15 = -1;
                    } else if (((a) arrayList.get(i15)).a != j3) {
                        i15++;
                    }
                }
                if (i15 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = t3Var2.f3.m(i15);
                if (m10 instanceof a6) {
                    a6 a6Var = (a6) m10;
                    a6Var.B();
                    f1 editText = a6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i14, length)), Math.max(0, Math.min(i13, length)));
                    return;
                }
                if (!(m10 instanceof m5)) {
                    if (m10 instanceof j0) {
                        f1 captionEditText = ((j0) m10).getCaptionEditText();
                        captionEditText.O();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i14, length2)), Math.max(0, Math.min(i13, length2)));
                        return;
                    }
                    return;
                }
                m5 m5Var = (m5) m10;
                f1 m11 = m5Var.m(d2Var.b);
                if (m11 == null) {
                    m11 = m5Var.m(0);
                }
                if (m11 == null) {
                    return;
                }
                m11.O();
                int length3 = m11.length();
                m11.setSelection(Math.max(0, Math.min(i14, length3)), Math.max(0, Math.min(i13, length3)));
                return;
            case 4:
                k3 k3Var = (k3) obj2;
                a aVar = (a) obj;
                if (aVar == null) {
                    k3Var.getClass();
                } else {
                    r42 = k3Var.e.C1(aVar);
                }
                if (r42 instanceof a6) {
                    a6 a6Var2 = (a6) r42;
                    a6Var2.B();
                    a6Var2.getEditText().setSelection(a6Var2.getEditText().length());
                    return;
                }
                return;
            case 5:
                y4 y4Var = (y4) obj2;
                TLObject tLObject2 = (TLObject) obj;
                boolean z10 = y4Var.e;
                boolean z11 = y4Var.d;
                x4 x4Var = y4Var.s;
                if (y4Var.x) {
                    return;
                }
                y4Var.E = 0;
                if (y4Var.c || z11 || z10) {
                    if ((tLObject2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject2).document) != null) {
                        if (!z10) {
                            if (z11) {
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
                        int i16 = y4Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            y4Var.y = true;
                            y4Var.e();
                            x4Var.a();
                            return;
                        }
                        y4Var.y = true;
                        y4Var.e();
                        if (!TextUtils.isEmpty(y4Var.G) && gj.W2(document) && (w10 = w7.w(document.thumbs, ls.r5, false, null, false)) != null) {
                            w7.G(i16).e0(y4Var.G, w10);
                            File file2 = new File(y4Var.G);
                            w7.G(i16);
                            org.telegram.messenger.g0.F(file2, w7.J(w10, null, true, true));
                        }
                        x4Var.e(document);
                        return;
                    }
                } else if ((tLObject2 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo) != null) {
                    y4Var.y = true;
                    y4Var.e();
                    x4Var.c(photo);
                    return;
                }
                y4Var.y = true;
                y4Var.e();
                x4Var.a();
                return;
            case 6:
                y4 y4Var2 = (y4) obj2;
                String str4 = (String) obj;
                if (y4Var2.x || y4Var2.y) {
                    return;
                }
                y4Var2.a(str4);
                return;
            case 7:
                p5 m12 = ((m5) obj2).w.m((TL_iv.pageTableCell) obj);
                if (m12 == null) {
                    return;
                }
                f1 f1Var = m12.a;
                f1Var.O();
                f1Var.setSelection(f1Var.length());
                return;
            case 8:
                ((VideoAds) obj2).lambda$showPremium$19((ug.y0) obj);
                return;
            case 9:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                return;
            case 10:
                ((VideoAds) obj2).lambda$show$16((y10) obj);
                return;
            case 11:
                uy0.e1((Context) obj2, null, false, (fi.h0) obj, null);
                return;
            case 12:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                return;
            case 13:
                ((GroupCallMessagesController) obj2).lambda$sendCallMessage$5((String) obj);
                return;
            case 14:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                return;
            case 15:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                return;
            case 16:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                return;
            case 17:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                return;
            case 18:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) obj);
                return;
            case 19:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                return;
            case 20:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                return;
            case 21:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((r10) obj);
                return;
            case 22:
                ((org.telegram.ui.o) obj2).c0((TLRPC.TL_messages_archivedStickers) obj);
                return;
            case 23:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) obj2;
                vf.b bVar = (vf.b) obj;
                org.telegram.ui.t3 t3Var3 = g4Var.L;
                if (t3Var3 != null) {
                    t3Var3.a(true);
                }
                if (g4Var.O0 == bVar) {
                    g4Var.O0 = null;
                    return;
                }
                return;
            case 24:
                ((org.telegram.ui.g4) obj2).T0.d();
                ((AnimatorSet) obj).start();
                return;
            case 25:
                org.telegram.ui.e2.a((org.telegram.ui.e2) obj2, (SpannableString) obj);
                return;
            case 26:
                ArrayList arrayList2 = (ArrayList) obj;
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) ((org.telegram.ui.m4) obj2).b;
                if (arrayList2.isEmpty()) {
                    return;
                }
                for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                    p4Var.getMessagesController().T4(p4Var.Z() * 60, ((Long) arrayList2.get(i17)).longValue());
                }
                if (p4Var.Z() > 0) {
                    o10.u(hd.a0("AutodeleteTimerEnabledForChats", null, 2131753775, hd.c0(p4Var.Z() * 60), hd.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size()))), lc.b0(p4Var), R.raw.fire_on, 36);
                    return;
                } else {
                    lc.b0(p4Var).Q(R.raw.fire_off, 36, hd.a0("AutodeleteTimerDisabledForChats", null, 2131753776, hd.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size())))).j();
                    return;
                }
            case 27:
                org.telegram.ui.t5 t5Var = (org.telegram.ui.t5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                t5Var.U = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    t5Var.getMessagesController().I0().b(t5Var.S, t5Var.U, new org.telegram.ui.l5(t5Var, i11));
                }
                t5Var.i0.animate().cancel();
                t5Var.i0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new ki.m3(t5Var, 18));
                t5Var.I0(true);
                t5Var.J0(true);
                t5Var.H0(null);
                return;
            case 28:
                org.telegram.ui.x5 x5Var = (org.telegram.ui.x5) obj2;
                org.telegram.messenger.t2 t2Var = (org.telegram.messenger.t2) obj;
                ArrayList arrayList3 = x5Var.c;
                int i18 = 0;
                while (true) {
                    if (i18 < arrayList3.size()) {
                        if (((org.telegram.ui.w5) arrayList3.get(i18)).c == null || ((org.telegram.ui.w5) arrayList3.get(i18)).c.a != t2Var.a) {
                            i18++;
                        } else {
                            i11 = i18;
                        }
                    }
                }
                v4.f1 K = x5Var.b.K(i11);
                if (K != null) {
                    View view = K.a;
                    f60 f60Var = new f60(x5Var.getParentActivity(), x5Var);
                    f60Var.h(true);
                    f60Var.setParentWindow(org.telegram.ui.Components.c5.N(x5Var, f60Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    f60Var.setCallback(new org.telegram.ui.u5(x5Var, t2Var, i12));
                    return;
                }
                return;
            default:
                x6.c0((x6) obj2, (org.telegram.ui.ActionBar.t1) obj);
                return;
        }
    }
}
