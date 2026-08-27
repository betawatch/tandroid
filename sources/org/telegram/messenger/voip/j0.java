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
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.bm0;
import org.telegram.ui.dl;
import org.telegram.ui.ff0;
import org.telegram.ui.ol0;
import org.telegram.ui.rn;
import org.telegram.ui.s50;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
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
        int i10;
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
                dl dlVar = (dl) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i11 = this.b;
                rn rnVar = dlVar.b;
                if (!z10) {
                    if (rnVar.d4) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            rnVar.getMessagesController().pinMessage(rnVar.e, rnVar.f, ((Integer) arrayList.get(i12)).intValue(), true, false, false);
                        }
                    } else {
                        rnVar.getMessagesController().unpinAllMessages(rnVar.e, rnVar.f);
                    }
                }
                if (i11 == rnVar.y3) {
                    rnVar.w3 = null;
                    break;
                }
                break;
            case 3:
                fs fsVar = (fs) this.d;
                int i13 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i13 == fsVar.Z && TextUtils.equals(tL_messages_searchGlobal.q, fsVar.a0)) {
                    ConnectionsManager.getInstance(fsVar.J).sendRequest(tL_messages_searchGlobal, new i0(fsVar, i13, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                hs hsVar = (hs) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i14 == hsVar.W && TextUtils.equals(tL_messages_searchGlobal2.q, hsVar.X)) {
                    ConnectionsManager.getInstance(hsVar.J).sendRequest(tL_messages_searchGlobal2, new i0(hsVar, i14, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                hv0 hv0Var = (hv0) this.d;
                boolean z13 = this.c;
                int i15 = this.b;
                s1 s1Var = (s1) this.e;
                if (z13 && hv0Var.O == null && hv0Var.N == null && hv0Var.M == null) {
                    hv0Var.G = 2;
                    hv0Var.T0 = true;
                }
                hv0Var.R0 = false;
                if (hv0Var.U0 || !hv0Var.S0) {
                    hv0Var.Q0 = hv0Var.e1[0];
                    DownloadController.getInstance(i15).removeLoadingFileObserver(s1Var);
                    hv0Var.G();
                    hv0Var.v();
                    break;
                } else {
                    hv0Var.A(true);
                    break;
                }
                break;
            case 6:
                s50 s50Var = (s50) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i16 = this.b;
                boolean z14 = this.c;
                String[] strArr = s50Var.P2;
                if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
                    strArr[i16] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                } else {
                    strArr[i16] = "";
                }
                for (int i17 = 0; i17 < 2; i17++) {
                    String str = strArr[i17];
                    if (str == null) {
                        break;
                    } else {
                        if (str.length() == 0) {
                            strArr[i17] = null;
                        }
                    }
                }
                if (!z14 && s50Var.Q0() && !s50Var.W0.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(s50Var.V0)) {
                    s50Var.u1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    s50Var.u1(null, s50Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(s50Var.V0), true, z14);
                    break;
                }
                break;
            default:
                xm0 xm0Var = (xm0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i18 = this.b;
                boolean z15 = this.c;
                int i19 = xm0Var.O0;
                int min = Math.min((i19 == 0 || i19 == 4) ? 20 : 1, arrayList2.size());
                boolean z16 = false;
                int i20 = 0;
                boolean z17 = false;
                while (i20 < min) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i20);
                    Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, sendingMediaInfo.uri, 2048.0f, 2048.0f, z16);
                    if (loadBitmap == null || (scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap, 2048.0f, 2048.0f, 89, false, 320, 320)) == null) {
                        i10 = i20;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        tL_secureFile.dc_id = (int) scaleAndSaveImage.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        bm0 bm0Var = (bm0) xm0Var.x1;
                        bm0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(4));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i10 = i20;
                        String o10 = a9.p.o(sb2, tL_secureFile.id, ".jpg");
                        xm0 xm0Var2 = bm0Var.d;
                        byte[] bArr = new byte[(int) new File(o10).length()];
                        RandomAccessFile randomAccessFile2 = null;
                        try {
                            randomAccessFile = new RandomAccessFile(o10, "rws");
                        } catch (Exception unused) {
                        }
                        try {
                            randomAccessFile.readFully(bArr);
                        } catch (Exception unused2) {
                            randomAccessFile2 = randomAccessFile;
                            randomAccessFile = randomAccessFile2;
                            af.h k12 = xm0Var2.k1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k12.c);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) k12.e, tL_secureFile, o10, (byte[]) k12.d, (byte[]) k12.a);
                            secureDocument.type = i18;
                            AndroidUtilities.runOnUIThread(new ol0(xm0Var, secureDocument, i18, 0));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, xm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                    if (recognize == null) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                            i20 = i10 + 1;
                            z16 = false;
                        }
                        af.h k122 = xm0Var2.k1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k122.c);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) k122.e, tL_secureFile, o10, (byte[]) k122.d, (byte[]) k122.a);
                        secureDocument2.type = i18;
                        AndroidUtilities.runOnUIThread(new ol0(xm0Var, secureDocument2, i18, 0));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, xm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new ff0(14, xm0Var, recognize));
                                    z17 = true;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z17 = true;
                                    FileLog.e(th);
                                    i20 = i10 + 1;
                                    z16 = false;
                                }
                            }
                        }
                    }
                    i20 = i10 + 1;
                    z16 = false;
                }
                SharedConfig.saveConfig();
                break;
        }
    }

    public /* synthetic */ j0(dl dlVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = dlVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ j0(hv0 hv0Var, boolean z10, int i10, s1 s1Var) {
        this.a = 5;
        this.d = hv0Var;
        this.c = z10;
        this.b = i10;
        this.e = s1Var;
    }

    public /* synthetic */ j0(b51 b51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = b51Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
