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
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.ws;
import org.telegram.ui.am0;
import org.telegram.ui.h60;
import org.telegram.ui.jl;
import org.telegram.ui.kn0;
import org.telegram.ui.nm0;
import org.telegram.ui.wj0;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a A[SYNTHETIC] */
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
                jl jlVar = (jl) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i11 = this.b;
                yn ynVar = jlVar.b;
                if (!z10) {
                    if (ynVar.f4) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            ynVar.getMessagesController().pinMessage(ynVar.e, ynVar.f, ((Integer) arrayList.get(i12)).intValue(), true, false, false);
                        }
                    } else {
                        ynVar.getMessagesController().unpinAllMessages(ynVar.e, ynVar.f);
                    }
                }
                if (i11 == ynVar.A3) {
                    ynVar.y3 = null;
                    break;
                }
                break;
            case 3:
                us usVar = (us) this.d;
                int i13 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i13 == usVar.d0 && TextUtils.equals(tL_messages_searchGlobal.q, usVar.e0)) {
                    ConnectionsManager.getInstance(usVar.N).sendRequest(tL_messages_searchGlobal, new l0(usVar, i13, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                ws wsVar = (ws) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i14 == wsVar.a0 && TextUtils.equals(tL_messages_searchGlobal2.q, wsVar.b0)) {
                    ConnectionsManager.getInstance(wsVar.N).sendRequest(tL_messages_searchGlobal2, new l0(wsVar, i14, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                uw0 uw0Var = (uw0) this.d;
                boolean z13 = this.c;
                int i15 = this.b;
                u1 u1Var = (u1) this.e;
                if (z13 && uw0Var.Q == null && uw0Var.R == null && uw0Var.P == null) {
                    uw0Var.J = 2;
                    uw0Var.X0 = true;
                }
                uw0Var.V0 = false;
                if (uw0Var.Y0 || !uw0Var.W0) {
                    uw0Var.U0 = uw0Var.i1[0];
                    DownloadController.getInstance(i15).removeLoadingFileObserver(u1Var);
                    uw0Var.I();
                    uw0Var.x();
                    break;
                } else {
                    uw0Var.C(true);
                    break;
                }
                break;
            case 6:
                h60 h60Var = (h60) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i16 = this.b;
                boolean z14 = this.c;
                String[] strArr = h60Var.T2;
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
                if (!z14 && h60Var.Q0() && !h60Var.a1.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(h60Var.Z0)) {
                    h60Var.u1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    h60Var.u1(null, h60Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(h60Var.Z0), true, z14);
                    break;
                }
                break;
            default:
                kn0 kn0Var = (kn0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i18 = this.b;
                boolean z15 = this.c;
                int i19 = kn0Var.S0;
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
                        nm0 nm0Var = (nm0) kn0Var.B1;
                        nm0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(4));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i10 = i20;
                        String s10 = a4.a.s(sb2, tL_secureFile.id, ".jpg");
                        kn0 kn0Var2 = nm0Var.d;
                        byte[] bArr = new byte[(int) new File(s10).length()];
                        RandomAccessFile randomAccessFile2 = null;
                        try {
                            randomAccessFile = new RandomAccessFile(s10, "rws");
                        } catch (Exception unused) {
                        }
                        try {
                            randomAccessFile.readFully(bArr);
                        } catch (Exception unused2) {
                            randomAccessFile2 = randomAccessFile;
                            randomAccessFile = randomAccessFile2;
                            cf.c k12 = kn0Var2.k1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k12.c);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) k12.e, tL_secureFile, s10, (byte[]) k12.d, (byte[]) k12.a);
                            secureDocument.type = i18;
                            AndroidUtilities.runOnUIThread(new am0(kn0Var, secureDocument, i18, 0));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, kn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                    if (recognize == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            i20 = i10 + 1;
                            z16 = false;
                        }
                        cf.c k122 = kn0Var2.k1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k122.c);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) k122.e, tL_secureFile, s10, (byte[]) k122.d, (byte[]) k122.a);
                        secureDocument2.type = i18;
                        AndroidUtilities.runOnUIThread(new am0(kn0Var, secureDocument2, i18, 0));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, kn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new wj0(5, kn0Var, recognize));
                                    z17 = true;
                                } catch (Throwable th3) {
                                    th = th3;
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

    public /* synthetic */ m0(jl jlVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = jlVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ m0(uw0 uw0Var, boolean z10, int i10, u1 u1Var) {
        this.a = 5;
        this.d = uw0Var;
        this.c = z10;
        this.b = i10;
        this.e = u1Var;
    }

    public /* synthetic */ m0(w61 w61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = w61Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
