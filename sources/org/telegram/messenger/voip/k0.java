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
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.ns;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.el;
import org.telegram.ui.lf0;
import org.telegram.ui.ll0;
import org.telegram.ui.r50;
import org.telegram.ui.tn;
import org.telegram.ui.vm0;
import org.telegram.ui.yl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k0(int i10, int i11, Object obj, Object obj2, boolean z10) {
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
                el elVar = (el) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i11 = this.b;
                tn tnVar = elVar.b;
                if (!z10) {
                    if (tnVar.d4) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            tnVar.getMessagesController().pinMessage(tnVar.e, tnVar.f, ((Integer) arrayList.get(i12)).intValue(), true, false, false);
                        }
                    } else {
                        tnVar.getMessagesController().unpinAllMessages(tnVar.e, tnVar.f);
                    }
                }
                if (i11 == tnVar.y3) {
                    tnVar.w3 = null;
                    break;
                }
                break;
            case 3:
                ls lsVar = (ls) this.d;
                int i13 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i13 == lsVar.Z && TextUtils.equals(tL_messages_searchGlobal.q, lsVar.a0)) {
                    ConnectionsManager.getInstance(lsVar.J).sendRequest(tL_messages_searchGlobal, new j0(lsVar, i13, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                ns nsVar = (ns) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i14 == nsVar.W && TextUtils.equals(tL_messages_searchGlobal2.q, nsVar.X)) {
                    ConnectionsManager.getInstance(nsVar.J).sendRequest(tL_messages_searchGlobal2, new j0(nsVar, i14, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                pv0 pv0Var = (pv0) this.d;
                boolean z13 = this.c;
                int i15 = this.b;
                s1 s1Var = (s1) this.e;
                if (z13 && pv0Var.O == null && pv0Var.N == null && pv0Var.M == null) {
                    pv0Var.G = 2;
                    pv0Var.T0 = true;
                }
                pv0Var.R0 = false;
                if (pv0Var.U0 || !pv0Var.S0) {
                    pv0Var.Q0 = pv0Var.e1[0];
                    DownloadController.getInstance(i15).removeLoadingFileObserver(s1Var);
                    pv0Var.G();
                    pv0Var.v();
                    break;
                } else {
                    pv0Var.A(true);
                    break;
                }
                break;
            case 6:
                r50 r50Var = (r50) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i16 = this.b;
                boolean z14 = this.c;
                String[] strArr = r50Var.P2;
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
                if (!z14 && r50Var.Q0() && !r50Var.W0.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(r50Var.V0)) {
                    r50Var.u1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    r50Var.u1(null, r50Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(r50Var.V0), true, z14);
                    break;
                }
                break;
            default:
                vm0 vm0Var = (vm0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i18 = this.b;
                boolean z15 = this.c;
                int i19 = vm0Var.O0;
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
                        yl0 yl0Var = (yl0) vm0Var.x1;
                        yl0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(4));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i10 = i20;
                        String p10 = a4.w.p(sb2, tL_secureFile.id, ".jpg");
                        vm0 vm0Var2 = yl0Var.d;
                        byte[] bArr = new byte[(int) new File(p10).length()];
                        RandomAccessFile randomAccessFile2 = null;
                        try {
                            randomAccessFile = new RandomAccessFile(p10, "rws");
                        } catch (Exception unused) {
                        }
                        try {
                            randomAccessFile.readFully(bArr);
                        } catch (Exception unused2) {
                            randomAccessFile2 = randomAccessFile;
                            randomAccessFile = randomAccessFile2;
                            a5.j k12 = vm0Var2.k1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k12.c);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) k12.e, tL_secureFile, p10, (byte[]) k12.d, (byte[]) k12.a);
                            secureDocument.type = i18;
                            AndroidUtilities.runOnUIThread(new ll0(vm0Var, secureDocument, i18, 0));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, vm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                    if (recognize == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            i20 = i10 + 1;
                            z16 = false;
                        }
                        a5.j k122 = vm0Var2.k1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k122.c);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) k122.e, tL_secureFile, p10, (byte[]) k122.d, (byte[]) k122.a);
                        secureDocument2.type = i18;
                        AndroidUtilities.runOnUIThread(new ll0(vm0Var, secureDocument2, i18, 0));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, vm0Var.B.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new lf0(11, vm0Var, recognize));
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

    public /* synthetic */ k0(el elVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = elVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ k0(pv0 pv0Var, boolean z10, int i10, s1 s1Var) {
        this.a = 5;
        this.d = pv0Var;
        this.c = z10;
        this.b = i10;
        this.e = s1Var;
    }

    public /* synthetic */ k0(k51 k51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = k51Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
