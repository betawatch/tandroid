package org.telegram.messenger.voip;

import a8.me;
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
import org.telegram.ui.Components.ct;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.am0;
import org.telegram.ui.fx;
import org.telegram.ui.jl;
import org.telegram.ui.kn0;
import org.telegram.ui.nm0;
import org.telegram.ui.wn;
import org.telegram.ui.x50;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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

    /* JADX WARN: Can't wrap try/catch for region: R(8:16|(2:17|18)|(2:20|21)|22|23|24|25|(3:28|29|(4:31|32|33|34)(1:40))) */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118 A[SYNTHETIC] */
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
                jl jlVar = (jl) this.d;
                boolean z10 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i12 = this.b;
                wn wnVar = jlVar.b;
                if (!z10) {
                    if (wnVar.t4) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            wnVar.getMessagesController().pinMessage(wnVar.e, wnVar.f, ((Integer) arrayList.get(i13)).intValue(), true, false, false);
                        }
                    } else {
                        wnVar.getMessagesController().unpinAllMessages(wnVar.e, wnVar.f);
                    }
                }
                if (i12 == wnVar.O3) {
                    wnVar.M3 = null;
                    break;
                }
                break;
            case 3:
                ct ctVar = (ct) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i14 == ctVar.f0 && TextUtils.equals(tL_messages_searchGlobal.q, ctVar.g0)) {
                    ConnectionsManager.getInstance(ctVar.P).sendRequest(tL_messages_searchGlobal, new i0(ctVar, i14, tL_messages_searchGlobal, z11, 1));
                    break;
                }
                break;
            case 4:
                et etVar = (et) this.d;
                int i15 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z12 = this.c;
                if (i15 == etVar.c0 && TextUtils.equals(tL_messages_searchGlobal2.q, etVar.d0)) {
                    ConnectionsManager.getInstance(etVar.P).sendRequest(tL_messages_searchGlobal2, new i0(etVar, i15, tL_messages_searchGlobal2, z12, 2));
                    break;
                }
                break;
            case 5:
                ex0 ex0Var = (ex0) this.d;
                boolean z13 = this.c;
                int i16 = this.b;
                s1 s1Var = (s1) this.e;
                if (z13 && ex0Var.Q == null && ex0Var.R == null && ex0Var.P == null) {
                    ex0Var.J = 2;
                    ex0Var.X0 = true;
                }
                ex0Var.V0 = false;
                if (ex0Var.Y0 || !ex0Var.W0) {
                    ex0Var.U0 = ex0Var.i1[0];
                    DownloadController.getInstance(i16).removeLoadingFileObserver(s1Var);
                    ex0Var.I();
                    ex0Var.x();
                    break;
                } else {
                    ex0Var.C(true);
                    break;
                }
                break;
            case 6:
                x50 x50Var = (x50) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i17 = this.b;
                boolean z14 = this.c;
                String[] strArr = x50Var.T2;
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
                if (!z14 && x50Var.Q0() && !x50Var.a1.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(x50Var.Z0)) {
                    x50Var.u1(strArr[0], strArr[1], false, z14);
                    break;
                } else {
                    x50Var.u1(null, x50Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(x50Var.Z0), true, z14);
                    break;
                }
                break;
            default:
                kn0 kn0Var = (kn0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i19 = this.b;
                boolean z15 = this.c;
                int i20 = kn0Var.S0;
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
                        nm0 nm0Var = (nm0) kn0Var.B1;
                        nm0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(FileLoader.getDirectory(i10));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        i11 = i22;
                        String r6 = a1.g.r(sb2, tL_secureFile.id, ".jpg");
                        kn0 kn0Var2 = nm0Var.d;
                        byte[] bArr = new byte[(int) new File(r6).length()];
                        RandomAccessFile randomAccessFile2 = null;
                        try {
                            randomAccessFile = new RandomAccessFile(r6, "rws");
                        } catch (Exception unused) {
                        }
                        try {
                            randomAccessFile.readFully(bArr);
                        } catch (Exception unused2) {
                            randomAccessFile2 = randomAccessFile;
                            randomAccessFile = randomAccessFile2;
                            me k12 = kn0Var2.k1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k12.c);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) k12.e, tL_secureFile, r6, (byte[]) k12.d, (byte[]) k12.a);
                            secureDocument.type = i19;
                            AndroidUtilities.runOnUIThread(new fx(kn0Var, secureDocument, i19, 5));
                            if (z15) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, kn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
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
                        me k122 = kn0Var2.k1(bArr);
                        randomAccessFile.seek(0L);
                        randomAccessFile.write((byte[]) k122.c);
                        randomAccessFile.close();
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) k122.e, tL_secureFile, r6, (byte[]) k122.d, (byte[]) k122.a);
                        secureDocument2.type = i19;
                        AndroidUtilities.runOnUIThread(new fx(kn0Var, secureDocument2, i19, 5));
                        if (z15 && !z17) {
                            recognize = MrzRecognizer.recognize(loadBitmap, kn0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new am0(0, kn0Var, recognize));
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

    public /* synthetic */ j0(jl jlVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = jlVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ j0(ex0 ex0Var, boolean z10, int i10, s1 s1Var) {
        this.a = 5;
        this.d = ex0Var;
        this.c = z10;
        this.b = i10;
        this.e = s1Var;
    }

    public /* synthetic */ j0(k71 k71Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = k71Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
