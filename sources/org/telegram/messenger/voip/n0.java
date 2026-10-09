package org.telegram.messenger.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import ci.u5;
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
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ht;
import org.telegram.ui.Components.kt;
import org.telegram.ui.bi0;
import org.telegram.ui.g60;
import org.telegram.ui.nn0;
import org.telegram.ui.ol;
import org.telegram.ui.qm0;
import org.telegram.ui.tf0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = z10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:16|(2:17|18)|(2:20|21)|22|23|24|25|(3:28|29|(4:31|32|33|34)(1:40))) */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.PhotoSize scaleAndSaveImage;
        int i10;
        int i11;
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
                ol olVar = (ol) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i12 = this.b;
                zn znVar = olVar.b;
                if (!z10) {
                    if (znVar.h4) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            znVar.getMessagesController().pinMessage(znVar.e, znVar.f, ((Integer) arrayList.get(i13)).intValue(), true, false, false);
                        }
                    } else {
                        znVar.getMessagesController().unpinAllMessages(znVar.e, znVar.f);
                    }
                }
                if (i12 == znVar.C3) {
                    znVar.A3 = null;
                    break;
                }
                break;
            case 3:
                ht htVar = (ht) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i14 == htVar.d0 && TextUtils.equals(tL_messages_searchGlobal.q, htVar.e0)) {
                    ConnectionsManager.getInstance(htVar.N).sendRequest(tL_messages_searchGlobal, new m0(htVar, i14, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                kt ktVar = (kt) this.d;
                int i15 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i15 == ktVar.a0 && TextUtils.equals(tL_messages_searchGlobal2.q, ktVar.b0)) {
                    ConnectionsManager.getInstance(ktVar.N).sendRequest(tL_messages_searchGlobal2, new m0(ktVar, i15, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                ax0 ax0Var = (ax0) this.d;
                boolean z13 = this.c;
                int i16 = this.b;
                u1 u1Var = (u1) this.e;
                if (z13 && ax0Var.Q == null && ax0Var.R == null && ax0Var.P == null) {
                    ax0Var.J = 2;
                    ax0Var.X0 = true;
                }
                ax0Var.V0 = false;
                if (ax0Var.Y0 || !ax0Var.W0) {
                    ax0Var.U0 = ax0Var.i1[0];
                    DownloadController.getInstance(i16).removeLoadingFileObserver(u1Var);
                    ax0Var.I();
                    ax0Var.x();
                    break;
                } else {
                    ax0Var.C(true);
                    break;
                }
                break;
            case 6:
                g60 g60Var = (g60) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i17 = this.b;
                boolean z14 = this.c;
                String[] strArr = g60Var.T2;
                if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
                    strArr[i17] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                } else {
                    strArr[i17] = "";
                }
                for (int i18 = 0; i18 < 2; i18++) {
                    String str = strArr[i18];
                    if (str == null) {
                        break;
                    } else {
                        if (str.length() == 0) {
                            strArr[i18] = null;
                        }
                    }
                }
                if (!z14 && g60Var.R0() && !g60Var.a1.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(g60Var.Z0)) {
                    g60Var.v1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    g60Var.v1(null, g60Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(g60Var.Z0), true, z14);
                    break;
                }
                break;
            default:
                nn0 nn0Var = (nn0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i19 = this.b;
                boolean z15 = this.c;
                int i20 = nn0Var.S0;
                int i21 = 4;
                int min = Math.min((i20 == 0 || i20 == 4) ? 20 : 1, arrayList2.size());
                boolean z16 = false;
                int i22 = 0;
                boolean z17 = false;
                while (i22 < min) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i22);
                    Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, sendingMediaInfo.uri, 2048.0f, 2048.0f, z16);
                    if (loadBitmap == null || (scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap, 2048.0f, 2048.0f, 89, false, 320, 320)) == null) {
                        i10 = i21;
                        i11 = i22;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        i10 = i21;
                        tL_secureFile.dc_id = (int) scaleAndSaveImage.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        qm0 qm0Var = (qm0) nn0Var.B1;
                        qm0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(i10));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i11 = i22;
                        String s10 = a1.g.s(sb2, tL_secureFile.id, ".jpg");
                        nn0 nn0Var2 = qm0Var.d;
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
                            u5 j12 = nn0Var2.j1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) j12.c);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) j12.e, tL_secureFile, s10, (byte[]) j12.d, (byte[]) j12.a);
                            secureDocument.type = i19;
                            AndroidUtilities.runOnUIThread(new bi0(nn0Var, secureDocument, i19, 1));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, nn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                    if (recognize == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            i22 = i11 + 1;
                            i21 = i10;
                            z16 = false;
                        }
                        u5 j122 = nn0Var2.j1(bArr);
                        randomAccessFile.seek(0L);
                        randomAccessFile.write((byte[]) j122.c);
                        randomAccessFile.close();
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) j122.e, tL_secureFile, s10, (byte[]) j122.d, (byte[]) j122.a);
                        secureDocument2.type = i19;
                        AndroidUtilities.runOnUIThread(new bi0(nn0Var, secureDocument2, i19, 1));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, nn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new tf0(16, nn0Var, recognize));
                                    z17 = true;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z17 = true;
                                    FileLog.e(th);
                                    i22 = i11 + 1;
                                    i21 = i10;
                                    z16 = false;
                                }
                            }
                        }
                    }
                    i22 = i11 + 1;
                    i21 = i10;
                    z16 = false;
                }
                SharedConfig.saveConfig();
                break;
        }
    }

    public /* synthetic */ n0(ol olVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = olVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ n0(ax0 ax0Var, boolean z10, int i10, u1 u1Var) {
        this.a = 5;
        this.d = ax0Var;
        this.c = z10;
        this.b = i10;
        this.e = u1Var;
    }

    public /* synthetic */ n0(c71 c71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = c71Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
