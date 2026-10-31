package org.telegram.messenger.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.b6;
import org.telegram.messenger.b8;
import org.telegram.messenger.ci;
import org.telegram.messenger.f8;
import org.telegram.messenger.hc;
import org.telegram.messenger.is;
import org.telegram.messenger.pw;
import org.telegram.messenger.pz;
import org.telegram.messenger.qw;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.p51;
import org.telegram.ui.b50;
import org.telegram.ui.ll0;
import org.telegram.ui.nl;
import org.telegram.ui.pk0;
import org.telegram.ui.uf0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ p0(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x010c, code lost:
    
        if (r7 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int min;
        boolean z10;
        int i11;
        Bitmap K;
        TLRPC.PhotoSize Y;
        int i12;
        is isVar;
        RandomAccessFile randomAccessFile;
        int i13;
        boolean z11;
        boolean z12;
        is i14;
        is j10;
        switch (this.a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$55((String) this.e, this.b, this.c);
                break;
            case 1:
                ((ConnectionsManager) this.d).lambda$cancelRequest$10((Runnable) this.e, this.b, this.c);
                break;
            case 2:
                nl nlVar = (nl) this.d;
                boolean z13 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i15 = this.b;
                un unVar = nlVar.b;
                if (!z13) {
                    if (unVar.v4) {
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            unVar.getMessagesController().z3(unVar.e, unVar.f, ((Integer) arrayList.get(i16)).intValue(), true, false, false);
                        }
                    } else {
                        vp messagesController = unVar.getMessagesController();
                        TLRPC.Chat chat = unVar.e;
                        TLRPC.User user = unVar.f;
                        messagesController.getClass();
                        if (chat != null || user != null) {
                            TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
                            tL_messages_unpinAllMessages.peer = messagesController.i1(chat != null ? -chat.id : user.id);
                            messagesController.getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new ci(messagesController, chat, user, 6));
                        }
                    }
                }
                if (i15 == unVar.Q3) {
                    unVar.O3 = null;
                    break;
                }
                break;
            case 3:
                gs gsVar = (gs) this.d;
                int i17 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z14 = this.c;
                if (i17 == gsVar.f0 && TextUtils.equals(tL_messages_searchGlobal.q, gsVar.g0)) {
                    ConnectionsManager.getInstance(gsVar.P).sendRequest(tL_messages_searchGlobal, new o0(gsVar, i17, tL_messages_searchGlobal, z14, 1));
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.is isVar2 = (org.telegram.ui.Components.is) this.d;
                int i18 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z15 = this.c;
                if (i18 == isVar2.c0 && TextUtils.equals(tL_messages_searchGlobal2.q, isVar2.d0)) {
                    ConnectionsManager.getInstance(isVar2.P).sendRequest(tL_messages_searchGlobal2, new o0(isVar2, i18, tL_messages_searchGlobal2, z15, 2));
                    break;
                }
                break;
            case 5:
                cv0 cv0Var = (cv0) this.d;
                boolean z16 = this.c;
                int i19 = this.b;
                q1 q1Var = (q1) this.e;
                if (z16 && cv0Var.Q == null && cv0Var.R == null && cv0Var.P == null) {
                    cv0Var.J = 2;
                    cv0Var.X0 = true;
                }
                cv0Var.V0 = false;
                if (cv0Var.Y0 || !cv0Var.W0) {
                    cv0Var.U0 = cv0Var.i1[0];
                    b6.q(i19).v(q1Var);
                    cv0Var.I();
                    cv0Var.x();
                    break;
                } else {
                    cv0Var.C(true);
                    break;
                }
                break;
            case 6:
                b50 b50Var = (b50) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i20 = this.b;
                boolean z17 = this.c;
                String[] strArr = b50Var.K4;
                if (tLObject instanceof TL_phone.exportedGroupCallInvite) {
                    strArr[i20] = ((TL_phone.exportedGroupCallInvite) tLObject).link;
                } else {
                    strArr[i20] = "";
                }
                for (int i21 = 0; i21 < 2; i21++) {
                    String str = strArr[i21];
                    if (str == null) {
                        break;
                    } else {
                        if (str.length() == 0) {
                            strArr[i21] = null;
                        }
                    }
                }
                if (!z17 && b50Var.S0() && !b50Var.R2.b.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !w3.t0(b50Var.Q2)) {
                    b50Var.w1(strArr[0], strArr[1], false, z17);
                    break;
                } else {
                    b50Var.w1(null, vp.r1(b50Var.k1.a).U2 + "/" + w3.K(b50Var.Q2, false), true, z17);
                    break;
                }
                break;
            default:
                ll0 ll0Var = (ll0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i22 = this.b;
                boolean z18 = this.c;
                int i23 = ll0Var.S0;
                i10 = 4;
                min = Math.min((i23 == 0 || i23 == 4) ? 20 : 1, arrayList2.size());
                z10 = false;
                i11 = 0;
                boolean z19 = false;
                while (i11 < min) {
                    pz pzVar = (pz) arrayList2.get(i11);
                    K = hc.K(pzVar.c, pzVar.a, 2048.0f, 2048.0f, z10);
                    if (K == null || (Y = hc.Y(K, 2048.0f, 2048.0f, 89, zs.r5, zs.r5)) == null) {
                        i13 = min;
                        i12 = i11;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        i12 = i11;
                        tL_secureFile.dc_id = (int) Y.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        pk0 pk0Var = (pk0) ll0Var.B1;
                        pk0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b8.z(i10));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        String q6 = a1.g.q(sb2, tL_secureFile.id, ".jpg");
                        ll0 ll0Var2 = pk0Var.d;
                        byte[] bArr = new byte[(int) new File(q6).length()];
                        isVar = null;
                        try {
                            randomAccessFile = new RandomAccessFile(q6, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        bh.d n12 = ll0Var2.n1(bArr);
                        i13 = min;
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) n12.c);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        pw pwVar = new pw((qw) n12.e, tL_secureFile, q6, (byte[]) n12.d, (byte[]) n12.a);
                        pwVar.i = i22;
                        org.telegram.messenger.i0.g3(new ji0(ll0Var, pwVar, i22, 20));
                        if (z18 && !z19) {
                            try {
                                z12 = ll0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense;
                                if (!z12 || (j10 = MrzRecognizer.i(K)) == null) {
                                    try {
                                        j10 = MrzRecognizer.j(K);
                                        break;
                                    } catch (Exception unused4) {
                                        break;
                                    }
                                }
                                isVar = j10;
                                if (isVar != null) {
                                    try {
                                        org.telegram.messenger.i0.g3(new uf0(11, ll0Var, isVar));
                                        z19 = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z11 = true;
                                        z19 = true;
                                        f8.g(th, z11);
                                        i11 = i12 + 1;
                                        min = i13;
                                        i10 = 4;
                                        z10 = false;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z11 = true;
                            }
                        }
                    }
                    i11 = i12 + 1;
                    min = i13;
                    i10 = 4;
                    z10 = false;
                }
                tz.y();
                break;
        }
        return;
        if (!z12 && (i14 = MrzRecognizer.i(K)) != null) {
            isVar = i14;
        }
        if (isVar != null) {
        }
        i11 = i12 + 1;
        min = i13;
        i10 = 4;
        z10 = false;
    }

    public /* synthetic */ p0(nl nlVar, boolean z10, ArrayList arrayList, int i10) {
        this.a = 2;
        this.d = nlVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i10;
    }

    public /* synthetic */ p0(cv0 cv0Var, boolean z10, int i10, q1 q1Var) {
        this.a = 5;
        this.d = cv0Var;
        this.c = z10;
        this.b = i10;
        this.e = q1Var;
    }

    public /* synthetic */ p0(p51 p51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = p51Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
