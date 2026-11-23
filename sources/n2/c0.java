package n2;

import android.animation.AnimatorSet;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import di.p6;
import h9.s1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import ki.n3;
import oi.a6;
import oi.d2;
import oi.f1;
import oi.k3;
import oi.m5;
import oi.p5;
import oi.t3;
import oi.x4;
import oi.y4;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.m10;
import org.telegram.messenger.p10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.messenger.w10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.kc;
import org.telegram.ui.e2;
import org.telegram.ui.g4;
import org.telegram.ui.l5;
import org.telegram.ui.m4;
import org.telegram.ui.p4;
import org.telegram.ui.t5;
import org.telegram.ui.ty0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c0(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:158|159|160|161|(1:163)|173|174|175|(3:222|223|(12:225|226|(2:217|218)|179|(1:181)|182|183|184|(1:(1:187))(7:189|190|191|192|193|194|195)|188|165|(1:171)(2:169|170)))|177|(0)|179|(0)|182|183|184|(0)(0)|188|165|(2:167|171)(1:172)) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x036a, code lost:
    
        if (r1 == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03e4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0436, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        e eVar;
        String str;
        String str2;
        String str3;
        InputStream openInputStream;
        Cursor query;
        TLRPC.Document document;
        TLRPC.PhotoSize w10;
        TLRPC.Photo photo;
        int i7 = this.a;
        boolean z10 = false;
        boolean z11 = false;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                d0 d0Var = (d0) obj2;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (d0Var.d == null || (eVar = ((j0) d0Var.b.b).i) == null || audioDeviceInfo.equals(eVar.i)) {
                    return;
                }
                eVar.i = audioDeviceInfo;
                Context context = eVar.a;
                e2.e eVar2 = eVar.j;
                List a10 = eVar.a();
                s1 s1Var = b.e;
                eVar.b(b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar2, audioDeviceInfo, a10));
                return;
            case 1:
                p10 p10Var = (p10) obj;
                oi.q a11 = oi.q.a(((String[]) obj2)[0], org.telegram.messenger.g0.L(26.0f), false);
                if (a11 == null) {
                    a11 = oi.q.a(gd.N0(2131754004, null), org.telegram.messenger.g0.L(26.0f), false);
                    z10 = true;
                }
                org.telegram.messenger.g0.g3(new p6(p10Var, a11 != null ? a11.a : null, z10, 7));
                return;
            case 2:
                oi.v vVar = (oi.v) obj2;
                TLObject tLObject = (TLObject) obj;
                vVar.c2 = false;
                vVar.d2 = 0;
                hi.e eVar3 = vVar.b2;
                eVar3.setLoading(false);
                if (!(tLObject instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    org.telegram.messenger.g0.E3(4.0f, eVar3, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject).result;
                if (richMessage == null) {
                    org.telegram.messenger.g0.E3(4.0f, eVar3, null);
                    return;
                }
                vVar.e2 = richMessage;
                vVar.Y1.set(richMessage);
                eVar3.i(gd.N0(2131754058, null), true, true);
                vVar.e1();
                b51 b51Var = vVar.V1;
                if (b51Var != null) {
                    b51Var.O(true);
                    return;
                }
                return;
            case 3:
                t3 t3Var = (t3) obj2;
                Uri uri = (Uri) obj;
                try {
                    str = org.telegram.messenger.g0.T0(uri);
                } catch (Exception e10) {
                    a8.g(e10, true);
                    str = null;
                }
                int i10 = 4;
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
                    str3 = r3;
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
                                    str3 = r3;
                                    if (TextUtils.isEmpty(str3)) {
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str2 = "document_" + bz.p();
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
                                        r3 = absolutePath;
                                    } finally {
                                    }
                                } finally {
                                }
                            } else if (openInputStream != null) {
                                openInputStream.close();
                            }
                            str3 = r3;
                            if (TextUtils.isEmpty(str3) && a8.p0.B(str3)) {
                                org.telegram.messenger.g0.g3(new c0(i10, t3Var, str3));
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
                str3 = r3;
                if (TextUtils.isEmpty(str3)) {
                    return;
                } else {
                    return;
                }
            case 4:
                ((t3) obj2).f2((String) obj);
                return;
            case 5:
                t3 t3Var2 = (t3) obj2;
                d2 d2Var = (d2) obj;
                t3Var2.getClass();
                long j3 = d2Var.a;
                int i11 = d2Var.d;
                int i12 = d2Var.c;
                ArrayList arrayList = t3Var2.t3;
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        i13 = -1;
                    } else if (((oi.a) arrayList.get(i13)).a != j3) {
                        i13++;
                    }
                }
                if (i13 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = t3Var2.f3.m(i13);
                if (m10 instanceof a6) {
                    a6 a6Var = (a6) m10;
                    a6Var.B();
                    f1 editText = a6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i12, length)), Math.max(0, Math.min(i11, length)));
                    return;
                }
                if (!(m10 instanceof m5)) {
                    if (m10 instanceof oi.j0) {
                        f1 captionEditText = ((oi.j0) m10).getCaptionEditText();
                        captionEditText.O();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i12, length2)), Math.max(0, Math.min(i11, length2)));
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
                m11.setSelection(Math.max(0, Math.min(i12, length3)), Math.max(0, Math.min(i11, length3)));
                return;
            case 6:
                k3 k3Var = (k3) obj2;
                oi.a aVar = (oi.a) obj;
                if (aVar == null) {
                    k3Var.getClass();
                } else {
                    r3 = k3Var.e.C1(aVar);
                }
                if (r3 instanceof a6) {
                    a6 a6Var2 = (a6) r3;
                    a6Var2.B();
                    a6Var2.getEditText().setSelection(a6Var2.getEditText().length());
                    return;
                }
                return;
            case 7:
                y4 y4Var = (y4) obj2;
                TLObject tLObject2 = (TLObject) obj;
                boolean z12 = y4Var.e;
                boolean z13 = y4Var.d;
                x4 x4Var = y4Var.s;
                if (y4Var.x) {
                    return;
                }
                y4Var.E = 0;
                if (y4Var.c || z13 || z12) {
                    if ((tLObject2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject2).document) != null) {
                        if (!z12) {
                            if (z13) {
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
                        int i14 = y4Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            y4Var.y = true;
                            y4Var.e();
                            x4Var.a();
                            return;
                        }
                        y4Var.y = true;
                        y4Var.e();
                        if (!TextUtils.isEmpty(y4Var.G) && fj.W2(document) && (w10 = w7.w(document.thumbs, ks.r5, false, null, false)) != null) {
                            w7.G(i14).e0(y4Var.G, w10);
                            File file2 = new File(y4Var.G);
                            w7.G(i14);
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
            case 8:
                y4 y4Var2 = (y4) obj2;
                String str4 = (String) obj;
                if (y4Var2.x || y4Var2.y) {
                    return;
                }
                y4Var2.a(str4);
                return;
            case 9:
                p5 m12 = ((m5) obj2).w.m((TL_iv.pageTableCell) obj);
                if (m12 == null) {
                    return;
                }
                f1 f1Var = m12.a;
                f1Var.O();
                f1Var.setSelection(f1Var.length());
                return;
            case 10:
                ((VideoAds) obj2).lambda$showPremium$19((ug.y0) obj);
                return;
            case 11:
                ((VideoAds) obj2).lambda$load$0((TLObject) obj);
                return;
            case 12:
                ((VideoAds) obj2).lambda$show$16((w10) obj);
                return;
            case 13:
                ty0.e1((Context) obj2, null, false, (fi.h0) obj, null);
                return;
            case 14:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                return;
            case 15:
                ((GroupCallMessagesController) obj2).lambda$sendCallMessage$5((String) obj);
                return;
            case 16:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                return;
            case 17:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                return;
            case 18:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                return;
            case 19:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                return;
            case 20:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.l0) obj);
                return;
            case 21:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                return;
            case 22:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                return;
            case 23:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((p10) obj);
                return;
            case 24:
                ((org.telegram.ui.o) obj2).c0((TLRPC.TL_messages_archivedStickers) obj);
                return;
            case 25:
                g4 g4Var = (g4) obj2;
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
            case 26:
                ((g4) obj2).T0.d();
                ((AnimatorSet) obj).start();
                return;
            case 27:
                e2.a((e2) obj2, (SpannableString) obj);
                return;
            case 28:
                ArrayList arrayList2 = (ArrayList) obj;
                p4 p4Var = (p4) ((m4) obj2).b;
                if (arrayList2.isEmpty()) {
                    return;
                }
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    p4Var.getMessagesController().T4(p4Var.Z() * 60, ((Long) arrayList2.get(i15)).longValue());
                }
                if (p4Var.Z() > 0) {
                    m10.u(gd.a0("AutodeleteTimerEnabledForChats", null, 2131753775, gd.c0(p4Var.Z() * 60), gd.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size()))), kc.b0(p4Var), R.raw.fire_on, 36);
                    return;
                } else {
                    kc.b0(p4Var).Q(R.raw.fire_off, 36, gd.a0("AutodeleteTimerDisabledForChats", null, 2131753776, gd.G(arrayList2.size(), "Chats", Integer.valueOf(arrayList2.size())))).j();
                    return;
                }
            default:
                t5 t5Var = (t5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                t5Var.U = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    t5Var.getMessagesController().I0().b(t5Var.S, t5Var.U, new l5(t5Var, z11 ? 1 : 0));
                }
                t5Var.i0.animate().cancel();
                t5Var.i0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new n3(t5Var, 18));
                t5Var.I0(true);
                t5Var.J0(true);
                t5Var.H0(null);
                return;
        }
    }
}
