package org.telegram.messenger.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.at;
import org.telegram.messenger.b6;
import org.telegram.messenger.b8;
import org.telegram.messenger.di;
import org.telegram.messenger.f8;
import org.telegram.messenger.ic;
import org.telegram.messenger.js;
import org.telegram.messenger.qw;
import org.telegram.messenger.qz;
import org.telegram.messenger.rw;
import org.telegram.messenger.uz;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.q51;
import org.telegram.ui.a50;
import org.telegram.ui.if0;
import org.telegram.ui.jl0;
import org.telegram.ui.nk0;
import org.telegram.ui.nl;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
        js jsVar;
        RandomAccessFile randomAccessFile;
        int i13;
        boolean z11;
        boolean z12;
        js i14;
        js j10;
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
                        wp messagesController = unVar.getMessagesController();
                        TLRPC.Chat chat = unVar.e;
                        TLRPC.User user = unVar.f;
                        messagesController.getClass();
                        if (chat != null || user != null) {
                            TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
                            tL_messages_unpinAllMessages.peer = messagesController.i1(chat != null ? -chat.id : user.id);
                            messagesController.getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new di(messagesController, chat, user, 6));
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
                is isVar = (is) this.d;
                int i18 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z15 = this.c;
                if (i18 == isVar.c0 && TextUtils.equals(tL_messages_searchGlobal2.q, isVar.d0)) {
                    ConnectionsManager.getInstance(isVar.P).sendRequest(tL_messages_searchGlobal2, new o0(isVar, i18, tL_messages_searchGlobal2, z15, 2));
                    break;
                }
                break;
            case 5:
                dv0 dv0Var = (dv0) this.d;
                boolean z16 = this.c;
                int i19 = this.b;
                q1 q1Var = (q1) this.e;
                if (z16 && dv0Var.Q == null && dv0Var.R == null && dv0Var.P == null) {
                    dv0Var.J = 2;
                    dv0Var.X0 = true;
                }
                dv0Var.V0 = false;
                if (dv0Var.Y0 || !dv0Var.W0) {
                    dv0Var.U0 = dv0Var.i1[0];
                    b6.q(i19).v(q1Var);
                    dv0Var.I();
                    dv0Var.x();
                    break;
                } else {
                    dv0Var.C(true);
                    break;
                }
                break;
            case 6:
                a50 a50Var = (a50) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i20 = this.b;
                boolean z17 = this.c;
                String[] strArr = a50Var.K4;
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
                if (!z17 && a50Var.S0() && !a50Var.R2.b.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !w3.t0(a50Var.Q2)) {
                    a50Var.w1(strArr[0], strArr[1], false, z17);
                    break;
                } else {
                    a50Var.w1(null, wp.r1(a50Var.k1.a).U2 + "/" + w3.K(a50Var.Q2, false), true, z17);
                    break;
                }
                break;
            default:
                jl0 jl0Var = (jl0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i22 = this.b;
                boolean z18 = this.c;
                int i23 = jl0Var.S0;
                i10 = 4;
                min = Math.min((i23 == 0 || i23 == 4) ? 20 : 1, arrayList2.size());
                z10 = false;
                i11 = 0;
                boolean z19 = false;
                while (i11 < min) {
                    qz qzVar = (qz) arrayList2.get(i11);
                    K = ic.K(qzVar.c, qzVar.a, 2048.0f, 2048.0f, z10);
                    if (K == null || (Y = ic.Y(K, 2048.0f, 2048.0f, 89, at.r5, at.r5)) == null) {
                        i13 = min;
                        i12 = i11;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        i12 = i11;
                        tL_secureFile.dc_id = (int) Y.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        nk0 nk0Var = (nk0) jl0Var.B1;
                        nk0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b8.z(i10));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        String q6 = a1.g.q(sb2, tL_secureFile.id, ".jpg");
                        jl0 jl0Var2 = nk0Var.d;
                        byte[] bArr = new byte[(int) new File(q6).length()];
                        jsVar = null;
                        try {
                            randomAccessFile = new RandomAccessFile(q6, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        bh.d o12 = jl0Var2.o1(bArr);
                        i13 = min;
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) o12.c);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        qw qwVar = new qw((rw) o12.e, tL_secureFile, q6, (byte[]) o12.d, (byte[]) o12.a);
                        qwVar.i = i22;
                        org.telegram.messenger.i0.g3(new ki0(jl0Var, qwVar, i22, 20));
                        if (z18 && !z19) {
                            try {
                                z12 = jl0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense;
                                if (!z12 || (j10 = MrzRecognizer.i(K)) == null) {
                                    try {
                                        j10 = MrzRecognizer.j(K);
                                        break;
                                    } catch (Exception unused4) {
                                        break;
                                    }
                                }
                                jsVar = j10;
                                if (jsVar != null) {
                                    try {
                                        org.telegram.messenger.i0.g3(new if0(12, jl0Var, jsVar));
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
                uz.y();
                break;
        }
        return;
        if (!z12 && (i14 = MrzRecognizer.i(K)) != null) {
            jsVar = i14;
        }
        if (jsVar != null) {
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

    public /* synthetic */ p0(dv0 dv0Var, boolean z10, int i10, q1 q1Var) {
        this.a = 5;
        this.d = dv0Var;
        this.c = z10;
        this.b = i10;
        this.e = q1Var;
    }

    public /* synthetic */ p0(q51 q51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = q51Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
