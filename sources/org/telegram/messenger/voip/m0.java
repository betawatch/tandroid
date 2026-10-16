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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.c90;
import org.telegram.ui.fo;
import org.telegram.ui.n60;
import org.telegram.ui.se0;
import org.telegram.ui.sl;
import org.telegram.ui.sn0;
import org.telegram.ui.vm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                sl slVar = (sl) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i12 = this.b;
                fo foVar = slVar.b;
                if (!z10) {
                    if (foVar.h4) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            foVar.getMessagesController().pinMessage(foVar.e, foVar.f, ((Integer) arrayList.get(i13)).intValue(), true, false, false);
                        }
                    } else {
                        foVar.getMessagesController().unpinAllMessages(foVar.e, foVar.f);
                    }
                }
                if (i12 == foVar.C3) {
                    foVar.A3 = null;
                    break;
                }
                break;
            case 3:
                et etVar = (et) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i14 == etVar.d0 && TextUtils.equals(tL_messages_searchGlobal.q, etVar.e0)) {
                    ConnectionsManager.getInstance(etVar.N).sendRequest(tL_messages_searchGlobal, new l0(etVar, i14, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                gt gtVar = (gt) this.d;
                int i15 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i15 == gtVar.a0 && TextUtils.equals(tL_messages_searchGlobal2.q, gtVar.b0)) {
                    ConnectionsManager.getInstance(gtVar.N).sendRequest(tL_messages_searchGlobal2, new l0(gtVar, i15, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                ww0 ww0Var = (ww0) this.d;
                boolean z13 = this.c;
                int i16 = this.b;
                u1 u1Var = (u1) this.e;
                if (z13 && ww0Var.Q == null && ww0Var.R == null && ww0Var.P == null) {
                    ww0Var.J = 2;
                    ww0Var.X0 = true;
                }
                ww0Var.V0 = false;
                if (ww0Var.Y0 || !ww0Var.W0) {
                    ww0Var.U0 = ww0Var.i1[0];
                    DownloadController.getInstance(i16).removeLoadingFileObserver(u1Var);
                    ww0Var.I();
                    ww0Var.x();
                    break;
                } else {
                    ww0Var.C(true);
                    break;
                }
                break;
            case 6:
                n60 n60Var = (n60) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i17 = this.b;
                boolean z14 = this.c;
                String[] strArr = n60Var.T2;
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
                if (!z14 && n60Var.R0() && !n60Var.a1.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(n60Var.Z0)) {
                    n60Var.v1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    n60Var.v1(null, n60Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(n60Var.Z0), true, z14);
                    break;
                }
                break;
            default:
                sn0 sn0Var = (sn0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i19 = this.b;
                boolean z15 = this.c;
                int i20 = sn0Var.S0;
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
                        vm0 vm0Var = (vm0) sn0Var.B1;
                        vm0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(i10));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i11 = i22;
                        String r10 = a1.g.r(sb2, tL_secureFile.id, ".jpg");
                        sn0 sn0Var2 = vm0Var.d;
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
                            z5 j12 = sn0Var2.j1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) j12.a);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) j12.e, tL_secureFile, r10, (byte[]) j12.d, (byte[]) j12.b);
                            secureDocument.type = i19;
                            AndroidUtilities.runOnUIThread(new c90(sn0Var, secureDocument, i19, 2));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, sn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
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
                        z5 j122 = sn0Var2.j1(bArr);
                        randomAccessFile.seek(0L);
                        randomAccessFile.write((byte[]) j122.a);
                        randomAccessFile.close();
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) j122.e, tL_secureFile, r10, (byte[]) j122.d, (byte[]) j122.b);
                        secureDocument2.type = i19;
                        AndroidUtilities.runOnUIThread(new c90(sn0Var, secureDocument2, i19, 2));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, sn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new se0(22, sn0Var, recognize));
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

    public /* synthetic */ m0(sl slVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = slVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ m0(ww0 ww0Var, boolean z10, int i10, u1 u1Var) {
        this.a = 5;
        this.d = ww0Var;
        this.c = z10;
        this.b = i10;
        this.e = u1Var;
    }

    public /* synthetic */ m0(a71 a71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = a71Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
