package org.telegram.messenger.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.z5;
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
import org.telegram.ui.Components.at;
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y31;
import org.telegram.ui.fl;
import org.telegram.ui.q50;
import org.telegram.ui.qn;
import org.telegram.ui.vm0;
import org.telegram.ui.xg0;
import org.telegram.ui.zl0;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
                fl flVar = (fl) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i12 = this.b;
                qn qnVar = flVar.b;
                if (!z10) {
                    if (qnVar.h4) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            qnVar.getMessagesController().pinMessage(qnVar.e, qnVar.f, ((Integer) arrayList.get(i13)).intValue(), true, false, false);
                        }
                    } else {
                        qnVar.getMessagesController().unpinAllMessages(qnVar.e, qnVar.f);
                    }
                }
                if (i12 == qnVar.C3) {
                    qnVar.A3 = null;
                    break;
                }
                break;
            case 3:
                at atVar = (at) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i14 == atVar.d0 && TextUtils.equals(tL_messages_searchGlobal.q, atVar.e0)) {
                    ConnectionsManager.getInstance(atVar.N).sendRequest(tL_messages_searchGlobal, new j0(atVar, i14, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                ct ctVar = (ct) this.d;
                int i15 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i15 == ctVar.a0 && TextUtils.equals(tL_messages_searchGlobal2.q, ctVar.b0)) {
                    ConnectionsManager.getInstance(ctVar.N).sendRequest(tL_messages_searchGlobal2, new j0(ctVar, i15, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                tw0 tw0Var = (tw0) this.d;
                boolean z13 = this.c;
                int i16 = this.b;
                u1 u1Var = (u1) this.e;
                if (z13 && tw0Var.Q == null && tw0Var.R == null && tw0Var.P == null) {
                    tw0Var.J = 2;
                    tw0Var.X0 = true;
                }
                tw0Var.V0 = false;
                if (tw0Var.Y0 || !tw0Var.W0) {
                    tw0Var.U0 = tw0Var.i1[0];
                    DownloadController.getInstance(i16).removeLoadingFileObserver(u1Var);
                    tw0Var.I();
                    tw0Var.x();
                    break;
                } else {
                    tw0Var.C(true);
                    break;
                }
                break;
            case 6:
                q50 q50Var = (q50) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i17 = this.b;
                boolean z14 = this.c;
                String[] strArr = q50Var.T2;
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
                if (!z14 && q50Var.R0() && !q50Var.a1.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(q50Var.Z0)) {
                    q50Var.v1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    q50Var.v1(null, q50Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(q50Var.Z0), true, z14);
                    break;
                }
                break;
            default:
                vm0 vm0Var = (vm0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i19 = this.b;
                boolean z15 = this.c;
                int i20 = vm0Var.S0;
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
                        zl0 zl0Var = (zl0) vm0Var.B1;
                        zl0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(i10));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i11 = i22;
                        String r10 = a1.g.r(sb2, tL_secureFile.id, ".jpg");
                        vm0 vm0Var2 = zl0Var.d;
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
                            z5 j12 = vm0Var2.j1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) j12.a);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) j12.e, tL_secureFile, r10, (byte[]) j12.d, (byte[]) j12.b);
                            secureDocument.type = i19;
                            AndroidUtilities.runOnUIThread(new y31(vm0Var, secureDocument, i19, 6));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, vm0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
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
                        z5 j122 = vm0Var2.j1(bArr);
                        randomAccessFile.seek(0L);
                        randomAccessFile.write((byte[]) j122.a);
                        randomAccessFile.close();
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) j122.e, tL_secureFile, r10, (byte[]) j122.d, (byte[]) j122.b);
                        secureDocument2.type = i19;
                        AndroidUtilities.runOnUIThread(new y31(vm0Var, secureDocument2, i19, 6));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, vm0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new xg0(10, vm0Var, recognize));
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

    public /* synthetic */ k0(fl flVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = flVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ k0(tw0 tw0Var, boolean z10, int i10, u1 u1Var) {
        this.a = 5;
        this.d = tw0Var;
        this.c = z10;
        this.b = i10;
        this.e = u1Var;
    }

    public /* synthetic */ k0(u61 u61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = u61Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
