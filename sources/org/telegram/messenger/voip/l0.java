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
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.c60;
import org.telegram.ui.dn0;
import org.telegram.ui.fe0;
import org.telegram.ui.gm0;
import org.telegram.ui.kl;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(int i10, int i11, Object obj, Object obj2, boolean z4) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011c A[SYNTHETIC] */
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
                boolean z4 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i11 = this.b;
                xn xnVar = klVar.b;
                if (!z4) {
                    if (xnVar.e4) {
                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                            xnVar.getMessagesController().pinMessage(xnVar.e, xnVar.f, ((Integer) arrayList.get(i12)).intValue(), true, false, false);
                        }
                    } else {
                        xnVar.getMessagesController().unpinAllMessages(xnVar.e, xnVar.f);
                    }
                }
                if (i11 == xnVar.z3) {
                    xnVar.x3 = null;
                    break;
                }
                break;
            case 3:
                ps psVar = (ps) this.d;
                int i13 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z10 = this.c;
                if (i13 == psVar.a0 && TextUtils.equals(tL_messages_searchGlobal.q, psVar.b0)) {
                    ConnectionsManager.getInstance(psVar.K).sendRequest(tL_messages_searchGlobal, new k0(psVar, i13, tL_messages_searchGlobal, z10, 1));
                    break;
                }
                break;
            case 4:
                rs rsVar = (rs) this.d;
                int i14 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z11 = this.c;
                if (i14 == rsVar.X && TextUtils.equals(tL_messages_searchGlobal2.q, rsVar.Y)) {
                    ConnectionsManager.getInstance(rsVar.K).sendRequest(tL_messages_searchGlobal2, new k0(rsVar, i14, tL_messages_searchGlobal2, z11, 2));
                    break;
                }
                break;
            case 5:
                yv0 yv0Var = (yv0) this.d;
                boolean z12 = this.c;
                int i15 = this.b;
                t1 t1Var = (t1) this.e;
                if (z12 && yv0Var.P == null && yv0Var.O == null && yv0Var.N == null) {
                    yv0Var.H = 2;
                    yv0Var.U0 = true;
                }
                yv0Var.S0 = false;
                if (yv0Var.V0 || !yv0Var.T0) {
                    yv0Var.R0 = yv0Var.f1[0];
                    DownloadController.getInstance(i15).removeLoadingFileObserver(t1Var);
                    yv0Var.G();
                    yv0Var.v();
                    break;
                } else {
                    yv0Var.A(true);
                    break;
                }
                break;
            case 6:
                c60 c60Var = (c60) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i16 = this.b;
                boolean z13 = this.c;
                String[] strArr = c60Var.Q2;
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
                if (!z13 && c60Var.Q0() && !c60Var.X0.call.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !ChatObject.isPublic(c60Var.W0)) {
                    c60Var.u1(strArr[0], strArr[1], false, z13);
                    break;
                } else {
                    c60Var.u1(null, c60Var.d.getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername(c60Var.W0), true, z13);
                    break;
                }
                break;
            default:
                dn0 dn0Var = (dn0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i18 = this.b;
                boolean z14 = this.c;
                int i19 = dn0Var.P0;
                int min = Math.min((i19 == 0 || i19 == 4) ? 20 : 1, arrayList2.size());
                boolean z15 = false;
                int i20 = 0;
                boolean z16 = false;
                while (i20 < min) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i20);
                    Bitmap loadBitmap = ImageLoader.loadBitmap(sendingMediaInfo.path, sendingMediaInfo.uri, 2048.0f, 2048.0f, z15);
                    if (loadBitmap == null || (scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap, 2048.0f, 2048.0f, 89, false, 320, 320)) == null) {
                        i10 = i20;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        tL_secureFile.dc_id = (int) scaleAndSaveImage.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        gm0 gm0Var = (gm0) dn0Var.y1;
                        gm0Var.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(FileLoader.getDirectory(4));
                        sb.append("/");
                        sb.append(tL_secureFile.dc_id);
                        sb.append("_");
                        i10 = i20;
                        String q10 = android.support.v4.media.a.q(sb, tL_secureFile.id, ".jpg");
                        dn0 dn0Var2 = gm0Var.d;
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
                            c5.j k12 = dn0Var2.k1(bArr);
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k12.c);
                            randomAccessFile.close();
                            SecureDocument secureDocument = new SecureDocument((SecureDocumentKey) k12.e, tL_secureFile, q10, (byte[]) k12.d, (byte[]) k12.a);
                            secureDocument.type = i18;
                            AndroidUtilities.runOnUIThread(new ey(dn0Var, secureDocument, i18, 28));
                            if (z14) {
                                try {
                                    recognize = MrzRecognizer.recognize(loadBitmap, dn0Var.C.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                                    if (recognize == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            i20 = i10 + 1;
                            z15 = false;
                        }
                        c5.j k122 = dn0Var2.k1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) k122.c);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        SecureDocument secureDocument2 = new SecureDocument((SecureDocumentKey) k122.e, tL_secureFile, q10, (byte[]) k122.d, (byte[]) k122.a);
                        secureDocument2.type = i18;
                        AndroidUtilities.runOnUIThread(new ey(dn0Var, secureDocument2, i18, 28));
                        if (z14 && !z16) {
                            recognize = MrzRecognizer.recognize(loadBitmap, dn0Var.C.type instanceof TLRPC.TL_secureValueTypeDriverLicense);
                            if (recognize == null) {
                                try {
                                    AndroidUtilities.runOnUIThread(new fe0(20, dn0Var, recognize));
                                    z16 = true;
                                } catch (Throwable th3) {
                                    th = th3;
                                    z16 = true;
                                    FileLog.e(th);
                                    i20 = i10 + 1;
                                    z15 = false;
                                }
                            }
                        }
                    }
                    i20 = i10 + 1;
                    z15 = false;
                }
                SharedConfig.saveConfig();
                break;
        }
    }

    public /* synthetic */ l0(kl klVar, boolean z4, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = klVar;
        this.c = z4;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ l0(yv0 yv0Var, boolean z4, int i10, t1 t1Var) {
        this.a = 5;
        this.d = yv0Var;
        this.c = z4;
        this.b = i10;
        this.e = t1Var;
    }

    public /* synthetic */ l0(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z4, int i11) {
        this.a = i11;
        this.d = w51Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z4;
    }
}
