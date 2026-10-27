package k2;

import a8.yb;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Looper;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.KeyEvent;
import bi.u7;
import bi.ua;
import f9.s1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import li.a5;
import li.c2;
import li.d6;
import li.g1;
import li.m3;
import li.p5;
import li.s5;
import li.v3;
import li.z4;
import m4.j1;
import m4.n1;
import m4.t1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.c31;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:243|(2:244|245)|246|(1:248)|258|259|260|(3:307|308|(12:310|311|(2:302|303)|264|(1:266)|267|268|269|(1:(1:272))(7:274|275|276|277|278|279|280)|273|250|(1:256)(2:254|255)))|262|(0)|264|(0)|267|268|269|(0)(0)|273|250|(2:252|256)(1:257)) */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0417, code lost:
    
        if (r5 == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0492, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x04e4, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0494 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0450 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        f fVar;
        String str;
        String str2;
        String str3;
        InputStream openInputStream;
        Cursor query;
        TLRPC.Document document;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        TLRPC.Photo photo;
        t1 t1Var;
        m4.c cVar;
        m4.c cVar2;
        int i10 = -1;
        int i11 = 4;
        boolean z10 = false;
        int i12 = 0;
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) this.c;
                if (f0Var.d == null || (fVar = ((l0) f0Var.b.b).i) == null || audioDeviceInfo.equals(fVar.i)) {
                    return;
                }
                fVar.i = audioDeviceInfo;
                Context context = fVar.a;
                b2.f fVar2 = fVar.j;
                List a2 = fVar.a();
                s1 s1Var = b.e;
                fVar.b(b.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), fVar2, audioDeviceInfo, a2));
                return;
            case 1:
                String[] strArr = (String[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                li.r a10 = li.r.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (a10 == null) {
                    a10 = li.r.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                    z10 = true;
                }
                AndroidUtilities.runOnUIThread(new u7(callback2, a10 != null ? a10.a : null, z10, 7));
                return;
            case 2:
                li.w wVar = (li.w) this.b;
                TLObject tLObject = (TLObject) this.c;
                wVar.g0 = false;
                wVar.h0 = 0;
                fi.d dVar = wVar.f0;
                dVar.setLoading(false);
                if (!(tLObject instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject).result;
                if (richMessage == null) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                wVar.i0 = richMessage;
                wVar.c0.set(richMessage);
                dVar.i(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                wVar.P();
                k71 k71Var = wVar.Z;
                if (k71Var != null) {
                    k71Var.O(true);
                    return;
                }
                return;
            case 3:
                v3 v3Var = (v3) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = AndroidUtilities.getPath(uri);
                } catch (Exception e) {
                    FileLog.e(e);
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    boolean t10 = b10.t(str);
                    str3 = str;
                    break;
                }
                try {
                    query = v3Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                } catch (Exception e10) {
                    e = e10;
                    str2 = null;
                    FileLog.e(e);
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = v3Var.getContext().getContentResolver().openInputStream(uri);
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
                                } catch (Exception e11) {
                                    e = e11;
                                    FileLog.e(e);
                                    if (TextUtils.isEmpty(str2)) {
                                    }
                                    String replace2 = str2.replace('/', '_').replace('\\', '_');
                                    openInputStream = v3Var.getContext().getContentResolver().openInputStream(uri);
                                    if (openInputStream == null) {
                                    }
                                    str3 = r3;
                                    if (TextUtils.isEmpty(str3)) {
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str2 = "document_" + SharedConfig.getLastLocalId();
                            }
                            String replace22 = str2.replace('/', '_').replace('\\', '_');
                            openInputStream = v3Var.getContext().getContentResolver().openInputStream(uri);
                            if (openInputStream == null) {
                                try {
                                    File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    try {
                                        AndroidUtilities.copyFile(openInputStream, fileOutputStream);
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
                            if (TextUtils.isEmpty(str3) && b10.t(str3)) {
                                AndroidUtilities.runOnUIThread(new e0(i11, v3Var, str3));
                                return;
                            }
                            return;
                        }
                    } finally {
                    }
                }
                str2 = null;
                if (query != null) {
                }
                if (TextUtils.isEmpty(str2)) {
                }
                String replace222 = str2.replace('/', '_').replace('\\', '_');
                openInputStream = v3Var.getContext().getContentResolver().openInputStream(uri);
                if (openInputStream == null) {
                }
                str3 = r3;
                if (TextUtils.isEmpty(str3)) {
                    return;
                } else {
                    return;
                }
            case 4:
                ((v3) this.b).i2((String) this.c);
                return;
            case 5:
                v3 v3Var2 = (v3) this.b;
                c2 c2Var = (c2) this.c;
                v3Var2.getClass();
                long j10 = c2Var.a;
                int i13 = c2Var.d;
                int i14 = c2Var.c;
                ArrayList arrayList = v3Var2.t3;
                int i15 = 0;
                while (true) {
                    if (i15 < arrayList.size()) {
                        if (((li.a) arrayList.get(i15)).a == j10) {
                            i10 = i15;
                        } else {
                            i15++;
                        }
                    }
                }
                if (i10 < 0) {
                    return;
                }
                KeyEvent.Callback m10 = v3Var2.f3.m(i10);
                if (m10 instanceof d6) {
                    d6 d6Var = (d6) m10;
                    d6Var.A();
                    g1 editText = d6Var.getEditText();
                    int length = editText.length();
                    editText.setSelection(Math.max(0, Math.min(i14, length)), Math.max(0, Math.min(i13, length)));
                    return;
                }
                if (!(m10 instanceof p5)) {
                    if (m10 instanceof li.k0) {
                        g1 captionEditText = ((li.k0) m10).getCaptionEditText();
                        captionEditText.r();
                        int length2 = captionEditText.length();
                        captionEditText.setSelection(Math.max(0, Math.min(i14, length2)), Math.max(0, Math.min(i13, length2)));
                        return;
                    }
                    return;
                }
                p5 p5Var = (p5) m10;
                g1 k10 = p5Var.k(c2Var.b);
                if (k10 == null) {
                    k10 = p5Var.k(0);
                }
                if (k10 == null) {
                    return;
                }
                k10.r();
                int length3 = k10.length();
                k10.setSelection(Math.max(0, Math.min(i14, length3)), Math.max(0, Math.min(i13, length3)));
                return;
            case 6:
                m3 m3Var = (m3) this.b;
                li.a aVar = (li.a) this.c;
                if (aVar == null) {
                    m3Var.getClass();
                } else {
                    r3 = m3Var.e.F1(aVar);
                }
                if (r3 instanceof d6) {
                    d6 d6Var2 = (d6) r3;
                    d6Var2.A();
                    d6Var2.getEditText().setSelection(d6Var2.getEditText().length());
                    return;
                }
                return;
            case 7:
                a5 a5Var = (a5) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                boolean z11 = a5Var.e;
                boolean z12 = a5Var.d;
                z4 z4Var = a5Var.s;
                if (a5Var.w) {
                    return;
                }
                a5Var.y = 0;
                if (a5Var.c || z12 || z11) {
                    if ((tLObject2 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject2).document) != null) {
                        if (!z11) {
                            if (z12) {
                                a5Var.x = true;
                                a5Var.e();
                                z4Var.e(document);
                                return;
                            } else {
                                a5Var.x = true;
                                a5Var.e();
                                z4Var.c(document);
                                return;
                            }
                        }
                        int i16 = a5Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            a5Var.x = true;
                            a5Var.e();
                            z4Var.onError();
                            return;
                        }
                        a5Var.x = true;
                        a5Var.e();
                        if (!TextUtils.isEmpty(a5Var.F) && MessageObject.isDocumentHasThumb(document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 320)) != null) {
                            FileLoader.getInstance(i16).setLocalPathTo(closestPhotoSizeWithSize, a5Var.F);
                            AndroidUtilities.copyFileSafe(new File(a5Var.F), FileLoader.getInstance(i16).getPathToAttach(closestPhotoSizeWithSize, true));
                        }
                        z4Var.d(document);
                        return;
                    }
                } else if ((tLObject2 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo) != null) {
                    a5Var.x = true;
                    a5Var.e();
                    z4Var.b(photo);
                    return;
                }
                a5Var.x = true;
                a5Var.e();
                z4Var.onError();
                return;
            case 8:
                a5 a5Var2 = (a5) this.b;
                String str4 = (String) this.c;
                if (a5Var2.w || a5Var2.x) {
                    return;
                }
                a5Var2.a(str4);
                return;
            case 9:
                s5 m11 = ((p5) this.b).v.m((TL_iv.pageTableCell) this.c);
                if (m11 == null) {
                    return;
                }
                g1 g1Var = m11.a;
                g1Var.r();
                g1Var.setSelection(g1Var.length());
                return;
            case 10:
                ((m4.f0) this.b).u(null, (n1) this.c);
                return;
            case 11:
                m4.f0 f0Var2 = (m4.f0) this.b;
                Runnable runnable = (Runnable) this.c;
                f0Var2.getClass();
                runnable.run();
                return;
            case 12:
                ((c0.i) this.c).a(Boolean.valueOf(((m4.f0) this.b).o()));
                return;
            case 13:
                k9.w wVar2 = (k9.w) this.b;
                ResultReceiver resultReceiver = (ResultReceiver) this.c;
                try {
                    t1Var = (t1) wVar2.a;
                    yb.l(t1Var, "SessionResult must not be null");
                } catch (InterruptedException e12) {
                    e = e12;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    t1Var = new t1(-1);
                } catch (CancellationException e13) {
                    e2.a.m("MediaSessionLegacyStub", "Custom command cancelled", e13);
                    t1Var = new t1(1);
                } catch (ExecutionException e14) {
                    e = e14;
                    e2.a.m("MediaSessionLegacyStub", "Custom command failed", e);
                    t1Var = new t1(-1);
                }
                resultReceiver.send(t1Var.a, t1Var.b);
                return;
            case 14:
                j1 j1Var = (j1) this.b;
                m4.m mVar = (m4.m) this.c;
                com.google.firebase.messaging.q qVar = j1Var.b;
                m4.w l4 = qVar.l(mVar.asBinder());
                if (l4 != null) {
                    qVar.B(l4);
                    return;
                }
                return;
            case 15:
                ((j1) this.b).b.i((m4.w) this.c);
                return;
            case 16:
                n2.d dVar2 = (n2.d) this.b;
                b2.x xVar = (b2.x) this.c;
                n2.e eVar = dVar2.d;
                if (eVar.E == 0 || dVar2.c) {
                    return;
                }
                Looper looper = eVar.I;
                looper.getClass();
                dVar2.b = eVar.b(looper, dVar2.a, xVar, false);
                eVar.x.add(dVar2);
                return;
            case 17:
                ((ua) this.b).run((SpannableString) this.c);
                return;
            case 18:
                ni.q qVar2 = (ni.q) this.b;
                ni.o oVar = (ni.o) this.c;
                synchronized (qVar2.a) {
                    try {
                        if (qVar2.s) {
                            return;
                        }
                        ArrayList arrayList2 = (ArrayList) qVar2.n.get(oVar);
                        if (arrayList2 != null) {
                            int size = arrayList2.size();
                            int i17 = 0;
                            while (i17 < size) {
                                Object obj = arrayList2.get(i17);
                                i17++;
                                if (((ni.p) obj).a != null) {
                                    ni.m mVar2 = (ni.m) qVar2.h.get(oVar);
                                    if (mVar2 != null) {
                                        cVar2 = mVar2.a;
                                    } else {
                                        if (qVar2.a()) {
                                            try {
                                                com.google.android.gms.internal.play_billing.s0 c10 = qVar2.v.a.c(oVar.a, oVar.b);
                                                c10.b();
                                                cVar = new m4.c(i11, c10, r3);
                                            } catch (LinkageError | OutOfMemoryError | RuntimeException e15) {
                                                if (qVar2.c != null) {
                                                    try {
                                                        FileLog.e(e15);
                                                    } catch (LinkageError | RuntimeException unused) {
                                                    }
                                                }
                                                cVar = new m4.c(i11, r3, e15);
                                            }
                                            synchronized (qVar2.a) {
                                                try {
                                                    if (qVar2.s) {
                                                        return;
                                                    }
                                                    if (mVar2 == null && ((Throwable) cVar.c) == null) {
                                                        qVar2.c(oVar, cVar);
                                                    }
                                                    ArrayList arrayList3 = (ArrayList) qVar2.n.remove(oVar);
                                                    if (arrayList3 == null) {
                                                        return;
                                                    }
                                                    int size2 = arrayList3.size();
                                                    while (i12 < size2) {
                                                        Object obj2 = arrayList3.get(i12);
                                                        i12++;
                                                        ni.p pVar = (ni.p) obj2;
                                                        try {
                                                            ni.n nVar = pVar.a;
                                                            pVar.a = null;
                                                            if (nVar != null) {
                                                                nVar.a(cVar);
                                                            }
                                                        } catch (LinkageError | RuntimeException e16) {
                                                            if (qVar2.c != null) {
                                                                try {
                                                                    FileLog.e(e16);
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
                                        cVar2 = new m4.c(i11, r3, qVar2.w);
                                    }
                                    cVar = cVar2;
                                    synchronized (qVar2.a) {
                                    }
                                }
                            }
                        }
                        qVar2.n.remove(oVar);
                        return;
                    } finally {
                    }
                }
            case 19:
                o2.q qVar3 = (o2.q) this.b;
                o2.j jVar = (o2.j) this.c;
                jg.i iVar = qVar3.c;
                Uri uri2 = jVar.x;
                p2.c cVar3 = (p2.c) ((o2.k) iVar.a).b.d.get(uri2);
                if (cVar3 != null) {
                    p2.c.b(cVar3, uri2, true);
                    return;
                }
                return;
            case 20:
                ((VideoAds) this.b).lambda$showPremium$19((tg.y0) this.c);
                return;
            case 21:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                return;
            case 22:
                ((VideoAds) this.b).lambda$show$16((Utilities.Callback) this.c);
                return;
            case 23:
                c31.T((Context) this.b, null, false, (di.k0) this.c, null);
                return;
            case 24:
                ((ConferenceCall) this.b).lambda$processUpdates$4((TLRPC.Updates) this.c);
                return;
            case 25:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                return;
            case 26:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                return;
            case 27:
                ((VoIPService) this.b).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) this.c);
                return;
            case 28:
                ((VoIPService) this.b).lambda$createGroupInstance$71((String) this.c);
                return;
            default:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$56((org.telegram.messenger.voip.j0) this.c);
                return;
        }
    }

    public /* synthetic */ e0(m4.f0 f0Var, m4.w wVar, Runnable runnable) {
        this.a = 11;
        this.b = f0Var;
        this.c = runnable;
    }
}
