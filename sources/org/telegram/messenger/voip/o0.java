package org.telegram.messenger.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import bi.u6;
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
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.zs;
import org.telegram.ui.ak0;
import org.telegram.ui.eo;
import org.telegram.ui.j60;
import org.telegram.ui.on0;
import org.telegram.ui.pl;
import org.telegram.ui.rm0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
                pl plVar = (pl) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i11 = this.b;
                eo eoVar = plVar.b;
                if (!z10) {
                    if (eoVar.h4) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            eoVar.getMessagesController().pinMessage(eoVar.e, eoVar.f, ((Integer) arrayList.get(i12)).intValue(), true, false, false);
                        }
                    } else {
                        eoVar.getMessagesController().unpinAllMessages(eoVar.e, eoVar.f);
                    }
                }
                if (i11 == eoVar.C3) {
                    eoVar.A3 = null;
                    break;
                }
                break;
            case 3:
                xs xsVar = (xs) this.d;
                int i13 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i13 == xsVar.d0 && TextUtils.equals(tL_messages_searchGlobal.q, xsVar.e0)) {
                    ConnectionsManager.getInstance(xsVar.N).sendRequest(tL_messages_searchGlobal, new n0(xsVar, i13, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                zs zsVar = (zs) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i14 == zsVar.a0 && TextUtils.equals(tL_messages_searchGlobal2.q, zsVar.b0)) {
                    ConnectionsManager.getInstance(zsVar.N).sendRequest(tL_messages_searchGlobal2, new n0(zsVar, i14, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                iw0 iw0Var = (iw0) this.d;
                boolean z13 = this.c;
                int i15 = this.b;
                t1 t1Var = (t1) this.e;
                if (z13 && iw0Var.R == null && iw0Var.S == null && iw0Var.Q == null) {
                    iw0Var.K = 2;
                    iw0Var.X0 = true;
                }
                iw0Var.V0 = false;
                if (iw0Var.Y0 || !iw0Var.W0) {
                    iw0Var.U0 = iw0Var.i1[0];
                    DownloadController.getInstance(i15).removeLoadingFileObserver(t1Var);
                    iw0Var.I();
                    iw0Var.x();
                    break;
                } else {
                    iw0Var.C(true);
                    break;
                }
                break;
            case 6:
                j60 j60Var = (j60) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i16 = this.b;
                boolean z14 = this.c;
                String[] strArr = j60Var.T2;
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
                if (!z14 && j60Var.Q0() && !j60Var.a1.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(j60Var.Z0)) {
                    j60Var.u1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    j60Var.u1(null, j60Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(j60Var.Z0), true, z14);
                    break;
                }
                break;
            default:
                on0 on0Var = (on0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i18 = this.b;
                boolean z15 = this.c;
                int i19 = on0Var.S0;
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
                        rm0 rm0Var = (rm0) on0Var.B1;
                        rm0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(4));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i10 = i20;
                        String r10 = a4.a.r(sb2, tL_secureFile.id, ".jpg");
                        on0 on0Var2 = rm0Var.d;
                        byte[] bArr = new byte[(int) new File(r10).length()];
                        RandomAccessFile randomAccessFile2 = null;
                        try {
                            randomAccessFile = new RandomAccessFile(r10, "rws");
                        } catch (Exception unused) {
                        }
                        try {
                            randomAccessFile.readFully(bArr);
                        } catch (Exception unused2) {
                            randomAccessFile2 = randomAccessFile;
                            randomAccessFile = randomAccessFile2;
                            u6 k12 = on0Var2.k1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k12.c);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) k12.e, tL_secureFile, r10, (byte[]) k12.d, (byte[]) k12.a);
                            secureDocument.type = i18;
                            AndroidUtilities.runOnUIThread(new my(on0Var, secureDocument, i18, 28));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, on0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                    if (recognize == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            i20 = i10 + 1;
                            z16 = false;
                        }
                        u6 k122 = on0Var2.k1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k122.c);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) k122.e, tL_secureFile, r10, (byte[]) k122.d, (byte[]) k122.a);
                        secureDocument2.type = i18;
                        AndroidUtilities.runOnUIThread(new my(on0Var, secureDocument2, i18, 28));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, on0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new ak0(5, on0Var, recognize));
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

    public /* synthetic */ o0(pl plVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = plVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ o0(iw0 iw0Var, boolean z10, int i10, t1 t1Var) {
        this.a = 5;
        this.d = iw0Var;
        this.c = z10;
        this.b = i10;
        this.e = t1Var;
    }

    public /* synthetic */ o0(j61 j61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = j61Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
