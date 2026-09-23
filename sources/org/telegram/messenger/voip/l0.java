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
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.us;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.f60;
import org.telegram.ui.gl0;
import org.telegram.ui.in0;
import org.telegram.ui.kl;
import org.telegram.ui.lm0;
import org.telegram.ui.xn;
import org.telegram.ui.yl0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(int i10, int i11, Object obj, Object obj2, boolean z10) {
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
                kl klVar = (kl) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i11 = this.b;
                xn xnVar = klVar.b;
                if (!z10) {
                    if (xnVar.h4) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            xnVar.getMessagesController().pinMessage(xnVar.e, xnVar.f, ((Integer) arrayList.get(i12)).intValue(), true, false, false);
                        }
                    } else {
                        xnVar.getMessagesController().unpinAllMessages(xnVar.e, xnVar.f);
                    }
                }
                if (i11 == xnVar.C3) {
                    xnVar.A3 = null;
                    break;
                }
                break;
            case 3:
                ss ssVar = (ss) this.d;
                int i13 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i13 == ssVar.d0 && TextUtils.equals(tL_messages_searchGlobal.q, ssVar.e0)) {
                    ConnectionsManager.getInstance(ssVar.N).sendRequest(tL_messages_searchGlobal, new k0(ssVar, i13, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                us usVar = (us) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i14 == usVar.a0 && TextUtils.equals(tL_messages_searchGlobal2.q, usVar.b0)) {
                    ConnectionsManager.getInstance(usVar.N).sendRequest(tL_messages_searchGlobal2, new k0(usVar, i14, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                xv0 xv0Var = (xv0) this.d;
                boolean z13 = this.c;
                int i15 = this.b;
                t1 t1Var = (t1) this.e;
                if (z13 && xv0Var.Q == null && xv0Var.R == null && xv0Var.P == null) {
                    xv0Var.J = 2;
                    xv0Var.X0 = true;
                }
                xv0Var.V0 = false;
                if (xv0Var.Y0 || !xv0Var.W0) {
                    xv0Var.U0 = xv0Var.i1[0];
                    DownloadController.getInstance(i15).removeLoadingFileObserver(t1Var);
                    xv0Var.I();
                    xv0Var.x();
                    break;
                } else {
                    xv0Var.C(true);
                    break;
                }
                break;
            case 6:
                f60 f60Var = (f60) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i16 = this.b;
                boolean z14 = this.c;
                String[] strArr = f60Var.T2;
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
                if (!z14 && f60Var.Q0() && !f60Var.a1.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(f60Var.Z0)) {
                    f60Var.u1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    f60Var.u1(null, f60Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(f60Var.Z0), true, z14);
                    break;
                }
                break;
            default:
                in0 in0Var = (in0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i18 = this.b;
                boolean z15 = this.c;
                int i19 = in0Var.S0;
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
                        lm0 lm0Var = (lm0) in0Var.B1;
                        lm0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(4));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i10 = i20;
                        String s10 = a4.a.s(sb2, tL_secureFile.id, ".jpg");
                        in0 in0Var2 = lm0Var.d;
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
                            cf.c k12 = in0Var2.k1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k12.c);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) k12.e, tL_secureFile, s10, (byte[]) k12.d, (byte[]) k12.a);
                            secureDocument.type = i18;
                            AndroidUtilities.runOnUIThread(new yl0(in0Var, secureDocument, i18, 0));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, in0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                    if (recognize == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            i20 = i10 + 1;
                            z16 = false;
                        }
                        cf.c k122 = in0Var2.k1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k122.c);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) k122.e, tL_secureFile, s10, (byte[]) k122.d, (byte[]) k122.a);
                        secureDocument2.type = i18;
                        AndroidUtilities.runOnUIThread(new yl0(in0Var, secureDocument2, i18, 0));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, in0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new gl0(2, in0Var, recognize));
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

    public /* synthetic */ l0(kl klVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = klVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ l0(xv0 xv0Var, boolean z10, int i10, t1 t1Var) {
        this.a = 5;
        this.d = xv0Var;
        this.c = z10;
        this.b = i10;
        this.e = t1Var;
    }

    public /* synthetic */ l0(v51 v51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = v51Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
