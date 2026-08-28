package org.telegram.messenger.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.fv0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.z41;
import org.telegram.ui.am0;
import org.telegram.ui.bl;
import org.telegram.ui.cf0;
import org.telegram.ui.jh0;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import org.telegram.ui.wm0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j0(int i9, int i10, Object obj, Object obj2, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i9;
        this.c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.PhotoSize scaleAndSaveImage;
        int i9;
        RandomAccessFile randomAccessFile;
        MrzRecognizer.Result recognize;
        switch (this.a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$55((String) this.e, this.b, this.c);
                break;
            case 1:
                ((ConnectionsManager) this.d).lambda$cancelRequest$10((Runnable) this.e, this.b, this.c);
                break;
            case 2:
                bl blVar = (bl) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i10 = this.b;
                qn qnVar = blVar.b;
                if (!z10) {
                    if (qnVar.d4) {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            qnVar.getMessagesController().pinMessage(qnVar.e, qnVar.f, ((Integer) arrayList.get(i11)).intValue(), true, false, false);
                        }
                    } else {
                        qnVar.getMessagesController().unpinAllMessages(qnVar.e, qnVar.f);
                    }
                }
                if (i10 == qnVar.y3) {
                    qnVar.w3 = null;
                    break;
                }
                break;
            case 3:
                hs hsVar = (hs) this.d;
                int i12 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i12 == hsVar.Z && TextUtils.equals(tL_messages_searchGlobal.q, hsVar.a0)) {
                    ConnectionsManager.getInstance(hsVar.J).sendRequest(tL_messages_searchGlobal, new i0(hsVar, i12, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                js jsVar = (js) this.d;
                int i13 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i13 == jsVar.W && TextUtils.equals(tL_messages_searchGlobal2.q, jsVar.X)) {
                    ConnectionsManager.getInstance(jsVar.J).sendRequest(tL_messages_searchGlobal2, new i0(jsVar, i13, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                fv0 fv0Var = (fv0) this.d;
                boolean z13 = this.c;
                int i14 = this.b;
                t1 t1Var = (t1) this.e;
                if (z13 && fv0Var.O == null && fv0Var.N == null && fv0Var.M == null) {
                    fv0Var.G = 2;
                    fv0Var.T0 = true;
                }
                fv0Var.R0 = false;
                if (fv0Var.U0 || !fv0Var.S0) {
                    fv0Var.Q0 = fv0Var.e1[0];
                    DownloadController.getInstance(i14).removeLoadingFileObserver(t1Var);
                    fv0Var.G();
                    fv0Var.v();
                    break;
                } else {
                    fv0Var.A(true);
                    break;
                }
                break;
            case 6:
                o50 o50Var = (o50) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i15 = this.b;
                boolean z14 = this.c;
                String[] strArr = o50Var.P2;
                if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
                    strArr[i15] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                } else {
                    strArr[i15] = "";
                }
                for (int i16 = 0; i16 < 2; i16++) {
                    String str = strArr[i16];
                    if (str == null) {
                        break;
                    } else {
                        if (str.length() == 0) {
                            strArr[i16] = null;
                        }
                    }
                }
                if (!z14 && o50Var.Q0() && !o50Var.W0.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(o50Var.V0)) {
                    o50Var.u1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    o50Var.u1(null, o50Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(o50Var.V0), true, z14);
                    break;
                }
                break;
            default:
                wm0 wm0Var = (wm0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i17 = this.b;
                boolean z15 = this.c;
                int i18 = wm0Var.O0;
                int min = Math.min((i18 == 0 || i18 == 4) ? 20 : 1, arrayList2.size());
                boolean z16 = false;
                int i19 = 0;
                boolean z17 = false;
                while (i19 < min) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i19);
                    Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, sendingMediaInfo.uri, 2048.0f, 2048.0f, z16);
                    if (loadBitmap == null || (scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap, 2048.0f, 2048.0f, 89, false, 320, 320)) == null) {
                        i9 = i19;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        tL_secureFile.dc_id = (int) scaleAndSaveImage.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        am0 am0Var = (am0) wm0Var.x1;
                        am0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(4));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i9 = i19;
                        String q10 = aa.d.q(sb2, tL_secureFile.id, ".jpg");
                        wm0 wm0Var2 = am0Var.d;
                        byte[] bArr = new byte[(int) new File(q10).length()];
                        RandomAccessFile randomAccessFile2 = null;
                        try {
                            randomAccessFile = new RandomAccessFile(q10, "rws");
                        } catch (Exception unused) {
                        }
                        try {
                            randomAccessFile.readFully(bArr);
                        } catch (Exception unused2) {
                            randomAccessFile2 = randomAccessFile;
                            randomAccessFile = randomAccessFile2;
                            b3.b k12 = wm0Var2.k1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k12.c);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) k12.e, tL_secureFile, q10, (byte[]) k12.d, (byte[]) k12.a);
                            secureDocument.type = i17;
                            AndroidUtilities.runOnUIThread(new jh0(wm0Var, secureDocument, i17, 1));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, wm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                    if (recognize == null) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                            i19 = i9 + 1;
                            z16 = false;
                        }
                        b3.b k122 = wm0Var2.k1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k122.c);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) k122.e, tL_secureFile, q10, (byte[]) k122.d, (byte[]) k122.a);
                        secureDocument2.type = i17;
                        AndroidUtilities.runOnUIThread(new jh0(wm0Var, secureDocument2, i17, 1));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, wm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new cf0(14, wm0Var, recognize));
                                    z17 = true;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z17 = true;
                                    FileLog.e(th);
                                    i19 = i9 + 1;
                                    z16 = false;
                                }
                            }
                        }
                    }
                    i19 = i9 + 1;
                    z16 = false;
                }
                SharedConfig.saveConfig();
                break;
        }
    }

    public /* synthetic */ j0(bl blVar, boolean z10, ArrayList arrayList, int i9) {
        this.a = 2;
        this.d = blVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i9;
    }

    public /* synthetic */ j0(fv0 fv0Var, boolean z10, int i9, t1 t1Var) {
        this.a = 5;
        this.d = fv0Var;
        this.c = z10;
        this.b = i9;
        this.e = t1Var;
    }

    public /* synthetic */ j0(z41 z41Var, int i9, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.a = i10;
        this.d = z41Var;
        this.b = i9;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
