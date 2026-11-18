package org.telegram.messenger.voip;

import a8.r7;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.ci;
import org.telegram.messenger.ec;
import org.telegram.messenger.mp;
import org.telegram.messenger.ur;
import org.telegram.messenger.v3;
import org.telegram.messenger.w7;
import org.telegram.messenger.yv;
import org.telegram.messenger.yy;
import org.telegram.messenger.zv;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.z41;
import org.telegram.ui.bn;
import org.telegram.ui.f40;
import org.telegram.ui.hk0;
import org.telegram.ui.mj0;
import org.telegram.ui.sk;
import org.telegram.ui.ve0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        ur urVar;
        RandomAccessFile randomAccessFile;
        int i12;
        boolean z11;
        boolean z12;
        ur i13;
        ur j3;
        switch (this.a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$55((String) this.e, this.b, this.c);
                break;
            case 1:
                ((ConnectionsManager) this.d).lambda$cancelRequest$10((Runnable) this.e, this.b, this.c);
                break;
            case 2:
                sk skVar = (sk) this.d;
                boolean z13 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i14 = this.b;
                bn bnVar = skVar.b;
                if (!z13) {
                    if (bnVar.x4) {
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            bnVar.getMessagesController().J3(bnVar.e, bnVar.f, ((Integer) arrayList.get(i15)).intValue(), true, false, false);
                        }
                    } else {
                        mp messagesController = bnVar.getMessagesController();
                        TLRPC.Chat chat = bnVar.e;
                        TLRPC.User user = bnVar.f;
                        messagesController.getClass();
                        if (chat != null || user != null) {
                            TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
                            tL_messages_unpinAllMessages.peer = messagesController.l1(chat != null ? -chat.id : user.id);
                            messagesController.getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new ci(messagesController, chat, user, 6));
                        }
                    }
                }
                if (i14 == bnVar.R3) {
                    bnVar.P3 = null;
                    break;
                }
                break;
            case 3:
                is isVar = (is) this.d;
                int i16 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z14 = this.c;
                if (i16 == isVar.g0 && TextUtils.equals(tL_messages_searchGlobal.q, isVar.h0)) {
                    ConnectionsManager.getInstance(isVar.Q).sendRequest(tL_messages_searchGlobal, new k0(isVar, i16, tL_messages_searchGlobal, z14, 1));
                    break;
                }
                break;
            case 4:
                ks ksVar = (ks) this.d;
                int i17 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z15 = this.c;
                if (i17 == ksVar.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, ksVar.e0)) {
                    ConnectionsManager.getInstance(ksVar.Q).sendRequest(tL_messages_searchGlobal2, new k0(ksVar, i17, tL_messages_searchGlobal2, z15, 2));
                    break;
                }
                break;
            case 5:
                iu0 iu0Var = (iu0) this.d;
                boolean z16 = this.c;
                int i18 = this.b;
                q1 q1Var = (q1) this.e;
                if (z16 && iu0Var.R == null && iu0Var.S == null && iu0Var.Q == null) {
                    iu0Var.K = 2;
                    iu0Var.Y0 = true;
                }
                iu0Var.W0 = false;
                if (iu0Var.Z0 || !iu0Var.X0) {
                    iu0Var.V0 = iu0Var.j1[0];
                    a6.q(i18).v(q1Var);
                    iu0Var.I();
                    iu0Var.x();
                    break;
                } else {
                    iu0Var.C(true);
                    break;
                }
                break;
            case 6:
                f40 f40Var = (f40) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i19 = this.b;
                boolean z17 = this.c;
                String[] strArr = f40Var.S4;
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
                if (!z17 && f40Var.T0() && !f40Var.V2.b.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !v3.t0(f40Var.U2)) {
                    f40Var.A1(strArr[0], strArr[1], false, z17);
                    break;
                } else {
                    f40Var.A1(null, mp.u1(f40Var.o1.a).X2 + "/" + v3.K(f40Var.U2, false), true, z17);
                    break;
                }
                break;
            default:
                hk0 hk0Var = (hk0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i21 = this.b;
                boolean z18 = this.c;
                int i22 = hk0Var.T0;
                i7 = 4;
                min = Math.min((i22 == 0 || i22 == 4) ? 20 : 1, arrayList2.size());
                z10 = false;
                i10 = 0;
                boolean z19 = false;
                while (i10 < min) {
                    yy yyVar = (yy) arrayList2.get(i10);
                    K = ec.K(yyVar.c, yyVar.a, 2048.0f, 2048.0f, z10);
                    if (K == null || (Y = ec.Y(K, 2048.0f, 2048.0f, 89, org.telegram.messenger.ks.r5, org.telegram.messenger.ks.r5)) == null) {
                        i12 = min;
                        i11 = i10;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        i11 = i10;
                        tL_secureFile.dc_id = (int) Y.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        mj0 mj0Var = (mj0) hk0Var.C1;
                        mj0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w7.z(i7));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        String r10 = a8.p0.r(sb2, tL_secureFile.id, ".jpg");
                        hk0 hk0Var2 = mj0Var.d;
                        byte[] bArr = new byte[(int) new File(r10).length()];
                        urVar = null;
                        try {
                            randomAccessFile = new RandomAccessFile(r10, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        r7 o12 = hk0Var2.o1(bArr);
                        i12 = min;
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) o12.d);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        yv yvVar = new yv((zv) o12.f, tL_secureFile, r10, (byte[]) o12.e, (byte[]) o12.b);
                        yvVar.i = i21;
                        org.telegram.messenger.g0.g3(new h01(hk0Var, yvVar, i21, 7));
                        if (z18 && !z19) {
                            try {
                                z12 = hk0Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense;
                                if (!z12 || (j3 = MrzRecognizer.i(K)) == null) {
                                    try {
                                        j3 = MrzRecognizer.j(K);
                                        break;
                                    } catch (Exception unused4) {
                                        break;
                                    }
                                }
                                urVar = j3;
                                if (urVar != null) {
                                    try {
                                        org.telegram.messenger.g0.g3(new ve0(10, hk0Var, urVar));
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
                bz.y();
                break;
        }
        return;
        if (!z12 && (i13 = MrzRecognizer.i(K)) != null) {
            urVar = i13;
        }
        if (urVar != null) {
        }
        i10 = i11 + 1;
        min = i12;
        i7 = 4;
        z10 = false;
    }

    public /* synthetic */ l0(sk skVar, boolean z10, ArrayList arrayList, int i7) {
        this.a = 2;
        this.d = skVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i7;
    }

    public /* synthetic */ l0(iu0 iu0Var, boolean z10, int i7, q1 q1Var) {
        this.a = 5;
        this.d = iu0Var;
        this.c = z10;
        this.b = i7;
        this.e = q1Var;
    }

    public /* synthetic */ l0(z41 z41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.a = i10;
        this.d = z41Var;
        this.b = i7;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
