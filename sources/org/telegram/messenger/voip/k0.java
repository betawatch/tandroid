package org.telegram.messenger.voip;

import a8.r7;
import android.graphics.Bitmap;
import android.text.TextUtils;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.a8;
import org.telegram.messenger.di;
import org.telegram.messenger.ew;
import org.telegram.messenger.fw;
import org.telegram.messenger.fz;
import org.telegram.messenger.gc;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.messenger.w7;
import org.telegram.messenger.z5;
import org.telegram.messenger.zr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
import org.telegram.ui.bd0;
import org.telegram.ui.cn;
import org.telegram.ui.dk0;
import org.telegram.ui.e40;
import org.telegram.ui.f10;
import org.telegram.ui.ij0;
import org.telegram.ui.tk;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k0(int i7, int i10, Object obj, Object obj2, boolean z9) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i7;
        this.c = z9;
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
        boolean z9;
        int i10;
        Bitmap K;
        TLRPC.PhotoSize Y;
        int i11;
        zr zrVar;
        RandomAccessFile randomAccessFile;
        int i12;
        boolean z10;
        boolean z11;
        zr i13;
        zr j3;
        switch (this.a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$55((String) this.e, this.b, this.c);
                break;
            case 1:
                ((ConnectionsManager) this.d).lambda$cancelRequest$10((Runnable) this.e, this.b, this.c);
                break;
            case 2:
                tk tkVar = (tk) this.d;
                boolean z12 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i14 = this.b;
                cn cnVar = tkVar.b;
                if (!z12) {
                    if (cnVar.v4) {
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            cnVar.getMessagesController().C3(cnVar.e, cnVar.f, ((Integer) arrayList.get(i15)).intValue(), true, false, false);
                        }
                    } else {
                        qp messagesController = cnVar.getMessagesController();
                        TLRPC.Chat chat = cnVar.e;
                        TLRPC.User user = cnVar.f;
                        messagesController.getClass();
                        if (chat != null || user != null) {
                            TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
                            tL_messages_unpinAllMessages.peer = messagesController.j1(chat != null ? -chat.id : user.id);
                            messagesController.getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new di(messagesController, chat, user, 6));
                        }
                    }
                }
                if (i14 == cnVar.Q3) {
                    cnVar.O3 = null;
                    break;
                }
                break;
            case 3:
                vr vrVar = (vr) this.d;
                int i16 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z13 = this.c;
                if (i16 == vrVar.f0 && TextUtils.equals(tL_messages_searchGlobal.q, vrVar.g0)) {
                    ConnectionsManager.getInstance(vrVar.P).sendRequest(tL_messages_searchGlobal, new j0(vrVar, i16, tL_messages_searchGlobal, z13, 1));
                    break;
                }
                break;
            case 4:
                xr xrVar = (xr) this.d;
                int i17 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z14 = this.c;
                if (i17 == xrVar.c0 && TextUtils.equals(tL_messages_searchGlobal2.q, xrVar.d0)) {
                    ConnectionsManager.getInstance(xrVar.P).sendRequest(tL_messages_searchGlobal2, new j0(xrVar, i17, tL_messages_searchGlobal2, z14, 2));
                    break;
                }
                break;
            case 5:
                bu0 bu0Var = (bu0) this.d;
                boolean z15 = this.c;
                int i18 = this.b;
                q1 q1Var = (q1) this.e;
                if (z15 && bu0Var.Q == null && bu0Var.R == null && bu0Var.P == null) {
                    bu0Var.J = 2;
                    bu0Var.X0 = true;
                }
                bu0Var.V0 = false;
                if (bu0Var.Y0 || !bu0Var.W0) {
                    bu0Var.U0 = bu0Var.i1[0];
                    z5.q(i18).v(q1Var);
                    bu0Var.I();
                    bu0Var.x();
                    break;
                } else {
                    bu0Var.C(true);
                    break;
                }
                break;
            case 6:
                e40 e40Var = (e40) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i19 = this.b;
                boolean z16 = this.c;
                String[] strArr = e40Var.K4;
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
                if (!z16 && e40Var.S0() && !e40Var.R2.b.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !t3.t0(e40Var.Q2)) {
                    e40Var.z1(strArr[0], strArr[1], false, z16);
                    break;
                } else {
                    e40Var.z1(null, qp.s1(e40Var.k1.a).U2 + "/" + t3.K(e40Var.Q2, false), true, z16);
                    break;
                }
                break;
            default:
                dk0 dk0Var = (dk0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i21 = this.b;
                boolean z17 = this.c;
                int i22 = dk0Var.S0;
                i7 = 4;
                min = Math.min((i22 == 0 || i22 == 4) ? 20 : 1, arrayList2.size());
                z9 = false;
                i10 = 0;
                boolean z18 = false;
                while (i10 < min) {
                    fz fzVar = (fz) arrayList2.get(i10);
                    K = gc.K(fzVar.c, fzVar.a, 2048.0f, 2048.0f, z9);
                    if (K == null || (Y = gc.Y(K, 2048.0f, 2048.0f, 89, qs.r5, qs.r5)) == null) {
                        i12 = min;
                        i11 = i10;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        i11 = i10;
                        tL_secureFile.dc_id = (int) Y.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        ij0 ij0Var = (ij0) dk0Var.B1;
                        ij0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w7.z(i7));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        String r10 = a8.p0.r(sb2, tL_secureFile.id, ".jpg");
                        dk0 dk0Var2 = ij0Var.d;
                        byte[] bArr = new byte[(int) new File(r10).length()];
                        zrVar = null;
                        try {
                            randomAccessFile = new RandomAccessFile(r10, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        r7 o12 = dk0Var2.o1(bArr);
                        i12 = min;
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) o12.d);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        ew ewVar = new ew((fw) o12.f, tL_secureFile, r10, (byte[]) o12.e, (byte[]) o12.b);
                        ewVar.i = i21;
                        org.telegram.messenger.g0.h3(new f10(dk0Var, ewVar, i21, 3));
                        if (z17 && !z18) {
                            try {
                                z11 = dk0Var.F.type instanceof TLRPC.TL_secureValueTypeDriverLicense;
                                if (!z11 || (j3 = MrzRecognizer.i(K)) == null) {
                                    try {
                                        j3 = MrzRecognizer.j(K);
                                        break;
                                    } catch (Exception unused4) {
                                        break;
                                    }
                                }
                                zrVar = j3;
                                if (zrVar != null) {
                                    try {
                                        org.telegram.messenger.g0.h3(new bd0(19, dk0Var, zrVar));
                                        z18 = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z10 = true;
                                        z18 = true;
                                        a8.g(th, z10);
                                        i10 = i11 + 1;
                                        min = i12;
                                        i7 = 4;
                                        z9 = false;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z10 = true;
                            }
                        }
                    }
                    i10 = i11 + 1;
                    min = i12;
                    i7 = 4;
                    z9 = false;
                }
                iz.y();
                break;
        }
        return;
        if (!z11 && (i13 = MrzRecognizer.i(K)) != null) {
            zrVar = i13;
        }
        if (zrVar != null) {
        }
        i10 = i11 + 1;
        min = i12;
        i7 = 4;
        z9 = false;
    }

    public /* synthetic */ k0(tk tkVar, boolean z9, ArrayList arrayList, int i7) {
        this.a = 2;
        this.d = tkVar;
        this.c = z9;
        this.e = arrayList;
        this.b = i7;
    }

    public /* synthetic */ k0(bu0 bu0Var, boolean z9, int i7, q1 q1Var) {
        this.a = 5;
        this.d = bu0Var;
        this.c = z9;
        this.b = i7;
        this.e = q1Var;
    }

    public /* synthetic */ k0(m41 m41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z9, int i10) {
        this.a = i10;
        this.d = m41Var;
        this.b = i7;
        this.e = tL_messages_searchGlobal;
        this.c = z9;
    }
}
