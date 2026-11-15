package org.telegram.messenger.voip;

import a8.r7;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.a8;
import org.telegram.messenger.bi;
import org.telegram.messenger.cw;
import org.telegram.messenger.dw;
import org.telegram.messenger.dz;
import org.telegram.messenger.fc;
import org.telegram.messenger.gz;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.messenger.w7;
import org.telegram.messenger.wr;
import org.telegram.messenger.z5;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u11;
import org.telegram.ui.an;
import org.telegram.ui.c40;
import org.telegram.ui.ek0;
import org.telegram.ui.jd0;
import org.telegram.ui.jj0;
import org.telegram.ui.rk;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l0(int i7, int i10, Object obj, Object obj2, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.c = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        if (r7 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7;
        int min;
        boolean z10;
        int i10;
        Bitmap K;
        TLRPC.PhotoSize Y;
        int i11;
        wr wrVar;
        RandomAccessFile randomAccessFile;
        int i12;
        boolean z11;
        boolean z12;
        wr i13;
        wr j3;
        switch (this.a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$55((String) this.e, this.b, this.c);
                break;
            case 1:
                ((ConnectionsManager) this.d).lambda$cancelRequest$10((Runnable) this.e, this.b, this.c);
                break;
            case 2:
                rk rkVar = (rk) this.d;
                boolean z13 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i14 = this.b;
                an anVar = rkVar.b;
                if (!z13) {
                    if (anVar.w4) {
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            anVar.getMessagesController().C3(anVar.e, anVar.f, ((Integer) arrayList.get(i15)).intValue(), true, false, false);
                        }
                    } else {
                        np messagesController = anVar.getMessagesController();
                        TLRPC.Chat chat = anVar.e;
                        TLRPC.User user = anVar.f;
                        messagesController.getClass();
                        if (chat != null || user != null) {
                            TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
                            tL_messages_unpinAllMessages.peer = messagesController.j1(chat != null ? -chat.id : user.id);
                            messagesController.getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new bi(messagesController, chat, user, 6));
                        }
                    }
                }
                if (i14 == anVar.R3) {
                    anVar.P3 = null;
                    break;
                }
                break;
            case 3:
                bs bsVar = (bs) this.d;
                int i16 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z14 = this.c;
                if (i16 == bsVar.g0 && TextUtils.equals(tL_messages_searchGlobal.q, bsVar.h0)) {
                    ConnectionsManager.getInstance(bsVar.Q).sendRequest(tL_messages_searchGlobal, new k0(bsVar, i16, tL_messages_searchGlobal, z14, 1));
                    break;
                }
                break;
            case 4:
                ds dsVar = (ds) this.d;
                int i17 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z15 = this.c;
                if (i17 == dsVar.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, dsVar.e0)) {
                    ConnectionsManager.getInstance(dsVar.Q).sendRequest(tL_messages_searchGlobal2, new k0(dsVar, i17, tL_messages_searchGlobal2, z15, 2));
                    break;
                }
                break;
            case 5:
                au0 au0Var = (au0) this.d;
                boolean z16 = this.c;
                int i18 = this.b;
                q1 q1Var = (q1) this.e;
                if (z16 && au0Var.R == null && au0Var.S == null && au0Var.Q == null) {
                    au0Var.K = 2;
                    au0Var.Y0 = true;
                }
                au0Var.W0 = false;
                if (au0Var.Z0 || !au0Var.X0) {
                    au0Var.V0 = au0Var.j1[0];
                    z5.q(i18).v(q1Var);
                    au0Var.I();
                    au0Var.x();
                    break;
                } else {
                    au0Var.C(true);
                    break;
                }
                break;
            case 6:
                c40 c40Var = (c40) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i19 = this.b;
                boolean z17 = this.c;
                String[] strArr = c40Var.S4;
                if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
                    strArr[i19] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                } else {
                    strArr[i19] = "";
                }
                for (int i20 = 0; i20 < 2; i20++) {
                    String str = strArr[i20];
                    if (str == null) {
                        break;
                    } else {
                        if (str.length() == 0) {
                            strArr[i20] = null;
                        }
                    }
                }
                if (!z17 && c40Var.S0() && !c40Var.V2.b.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !t3.t0(c40Var.U2)) {
                    c40Var.z1(strArr[0], strArr[1], false, z17);
                    break;
                } else {
                    c40Var.z1(null, np.s1(c40Var.o1.a).V2 + "/" + t3.K(c40Var.U2, false), true, z17);
                    break;
                }
                break;
            default:
                ek0 ek0Var = (ek0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i21 = this.b;
                boolean z18 = this.c;
                int i22 = ek0Var.T0;
                i7 = 4;
                min = Math.min((i22 == 0 || i22 == 4) ? 20 : 1, arrayList2.size());
                z10 = false;
                i10 = 0;
                boolean z19 = false;
                while (i10 < min) {
                    dz dzVar = (dz) arrayList2.get(i10);
                    K = fc.K(dzVar.c, dzVar.a, 2048.0f, 2048.0f, z10);
                    if (K == null || (Y = fc.Y(K, 2048.0f, 2048.0f, 89, ns.r5, ns.r5)) == null) {
                        i12 = min;
                        i11 = i10;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        i11 = i10;
                        tL_secureFile.dc_id = (int) Y.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        jj0 jj0Var = (jj0) ek0Var.C1;
                        jj0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w7.z(i7));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        String r10 = a8.p0.r(sb2, tL_secureFile.id, ".jpg");
                        ek0 ek0Var2 = jj0Var.d;
                        byte[] bArr = new byte[(int) new File(r10).length()];
                        wrVar = null;
                        try {
                            randomAccessFile = new RandomAccessFile(r10, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        r7 o12 = ek0Var2.o1(bArr);
                        i12 = min;
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) o12.d);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        cw cwVar = new cw((dw) o12.f, tL_secureFile, r10, (byte[]) o12.e, (byte[]) o12.b);
                        cwVar.i = i21;
                        org.telegram.messenger.g0.h3(new u11(ek0Var, cwVar, i21, 6));
                        if (z18 && !z19) {
                            try {
                                z12 = ek0Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense;
                                if (!z12 || (j3 = MrzRecognizer.i(K)) == null) {
                                    try {
                                        j3 = MrzRecognizer.j(K);
                                        break;
                                    } catch (Exception unused4) {
                                        break;
                                    }
                                }
                                wrVar = j3;
                                if (wrVar != null) {
                                    try {
                                        org.telegram.messenger.g0.h3(new jd0(15, ek0Var, wrVar));
                                        z19 = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z11 = true;
                                        z19 = true;
                                        a8.g(th, z11);
                                        i10 = i11 + 1;
                                        min = i12;
                                        i7 = 4;
                                        z10 = false;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z11 = true;
                            }
                        }
                    }
                    i10 = i11 + 1;
                    min = i12;
                    i7 = 4;
                    z10 = false;
                }
                gz.y();
                break;
        }
        return;
        if (!z12 && (i13 = MrzRecognizer.i(K)) != null) {
            wrVar = i13;
        }
        if (wrVar != null) {
        }
        i10 = i11 + 1;
        min = i12;
        i7 = 4;
        z10 = false;
    }

    public /* synthetic */ l0(rk rkVar, boolean z10, ArrayList arrayList, int i7) {
        this.a = 2;
        this.d = rkVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i7;
    }

    public /* synthetic */ l0(au0 au0Var, boolean z10, int i7, q1 q1Var) {
        this.a = 5;
        this.d = au0Var;
        this.c = z10;
        this.b = i7;
        this.e = q1Var;
    }

    public /* synthetic */ l0(p41 p41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.a = i10;
        this.d = p41Var;
        this.b = i7;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
