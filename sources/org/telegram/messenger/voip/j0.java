package org.telegram.messenger.voip;

import android.graphics.Bitmap;
import android.text.TextUtils;
import b8.ke;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.rr;
import org.telegram.messenger.t3;
import org.telegram.messenger.uh;
import org.telegram.messenger.w7;
import org.telegram.messenger.wv;
import org.telegram.messenger.xv;
import org.telegram.messenger.xy;
import org.telegram.messenger.z5;
import org.telegram.messenger.zb;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.dj0;
import org.telegram.ui.nk;
import org.telegram.ui.rw;
import org.telegram.ui.tb0;
import org.telegram.ui.wm;
import org.telegram.ui.x30;
import org.telegram.ui.yj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j0(int i3, int i10, Object obj, Object obj2, boolean z10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = i3;
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
        int i3;
        int min;
        boolean z10;
        int i10;
        Bitmap K;
        TLRPC.PhotoSize Y;
        int i11;
        rr rrVar;
        RandomAccessFile randomAccessFile;
        int i12;
        boolean z11;
        boolean z12;
        rr i13;
        rr j10;
        switch (this.a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$55((String) this.e, this.b, this.c);
                break;
            case 1:
                ((ConnectionsManager) this.d).lambda$cancelRequest$10((Runnable) this.e, this.b, this.c);
                break;
            case 2:
                nk nkVar = (nk) this.d;
                boolean z13 = this.c;
                ArrayList arrayList = (ArrayList) this.e;
                int i14 = this.b;
                wm wmVar = nkVar.b;
                if (!z13) {
                    if (wmVar.w4) {
                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                            wmVar.getMessagesController().C3(wmVar.e, wmVar.f, ((Integer) arrayList.get(i15)).intValue(), true, false, false);
                        }
                    } else {
                        hp messagesController = wmVar.getMessagesController();
                        TLRPC.Chat chat = wmVar.e;
                        TLRPC.User user = wmVar.f;
                        messagesController.getClass();
                        if (chat != null || user != null) {
                            TLRPC.TL_messages_unpinAllMessages tL_messages_unpinAllMessages = new TLRPC.TL_messages_unpinAllMessages();
                            tL_messages_unpinAllMessages.peer = messagesController.j1(chat != null ? -chat.id : user.id);
                            messagesController.getConnectionsManager().sendRequest(tL_messages_unpinAllMessages, new uh(messagesController, chat, user, 6));
                        }
                    }
                }
                if (i14 == wmVar.R3) {
                    wmVar.P3 = null;
                    break;
                }
                break;
            case 3:
                vr vrVar = (vr) this.d;
                int i16 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z14 = this.c;
                if (i16 == vrVar.g0 && TextUtils.equals(tL_messages_searchGlobal.q, vrVar.h0)) {
                    ConnectionsManager.getInstance(vrVar.Q).sendRequest(tL_messages_searchGlobal, new i0(vrVar, i16, tL_messages_searchGlobal, z14, 1));
                    break;
                }
                break;
            case 4:
                xr xrVar = (xr) this.d;
                int i17 = this.b;
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = (TLRPC.TL_messages_searchGlobal) this.e;
                boolean z15 = this.c;
                if (i17 == xrVar.d0 && TextUtils.equals(tL_messages_searchGlobal2.q, xrVar.e0)) {
                    ConnectionsManager.getInstance(xrVar.Q).sendRequest(tL_messages_searchGlobal2, new i0(xrVar, i17, tL_messages_searchGlobal2, z15, 2));
                    break;
                }
                break;
            case 5:
                yt0 yt0Var = (yt0) this.d;
                boolean z16 = this.c;
                int i18 = this.b;
                q1 q1Var = (q1) this.e;
                if (z16 && yt0Var.R == null && yt0Var.S == null && yt0Var.Q == null) {
                    yt0Var.K = 2;
                    yt0Var.Y0 = true;
                }
                yt0Var.W0 = false;
                if (yt0Var.Z0 || !yt0Var.X0) {
                    yt0Var.V0 = yt0Var.j1[0];
                    z5.q(i18).v(q1Var);
                    yt0Var.I();
                    yt0Var.x();
                    break;
                } else {
                    yt0Var.C(true);
                    break;
                }
                break;
            case 6:
                x30 x30Var = (x30) this.d;
                TLObject tLObject = (TLObject) this.e;
                int i19 = this.b;
                boolean z17 = this.c;
                String[] strArr = x30Var.L4;
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
                if (!z17 && x30Var.S0() && !x30Var.S2.b.join_muted) {
                    strArr[0] = null;
                }
                if (strArr[0] != null || strArr[1] != null || !t3.t0(x30Var.R2)) {
                    x30Var.w1(strArr[0], strArr[1], false, z17);
                    break;
                } else {
                    x30Var.w1(null, hp.s1(x30Var.l1.a).V2 + "/" + t3.K(x30Var.R2, false), true, z17);
                    break;
                }
                break;
            default:
                yj0 yj0Var = (yj0) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                int i21 = this.b;
                boolean z18 = this.c;
                int i22 = yj0Var.T0;
                i3 = 4;
                min = Math.min((i22 == 0 || i22 == 4) ? 20 : 1, arrayList2.size());
                z10 = false;
                i10 = 0;
                boolean z19 = false;
                while (i10 < min) {
                    xy xyVar = (xy) arrayList2.get(i10);
                    K = zb.K(xyVar.c, xyVar.a, 2048.0f, 2048.0f, z10);
                    if (K == null || (Y = zb.Y(K, 2048.0f, 2048.0f, 89, hs.r5, hs.r5)) == null) {
                        i12 = min;
                        i11 = i10;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        i11 = i10;
                        tL_secureFile.dc_id = (int) Y.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        dj0 dj0Var = (dj0) yj0Var.C1;
                        dj0Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w7.z(i3));
                        sb2.append("/");
                        sb2.append(tL_secureFile.dc_id);
                        sb2.append("_");
                        String r5 = a1.g.r(sb2, tL_secureFile.id, ".jpg");
                        yj0 yj0Var2 = dj0Var.d;
                        byte[] bArr = new byte[(int) new File(r5).length()];
                        rrVar = null;
                        try {
                            randomAccessFile = new RandomAccessFile(r5, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        ke o12 = yj0Var2.o1(bArr);
                        i12 = min;
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) o12.d);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        wv wvVar = new wv((xv) o12.f, tL_secureFile, r5, (byte[]) o12.e, (byte[]) o12.b);
                        wvVar.i = i21;
                        org.telegram.messenger.g0.h3(new rw(yj0Var, wvVar, i21, 4));
                        if (z18 && !z19) {
                            try {
                                z12 = yj0Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense;
                                if (!z12 || (j10 = MrzRecognizer.i(K)) == null) {
                                    try {
                                        j10 = MrzRecognizer.j(K);
                                        break;
                                    } catch (Exception unused4) {
                                        break;
                                    }
                                }
                                rrVar = j10;
                                if (rrVar != null) {
                                    try {
                                        org.telegram.messenger.g0.h3(new tb0(23, yj0Var, rrVar));
                                        z19 = true;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z11 = true;
                                        z19 = true;
                                        a8.g(th, z11);
                                        i10 = i11 + 1;
                                        min = i12;
                                        i3 = 4;
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
                    i3 = 4;
                    z10 = false;
                }
                az.y();
                break;
        }
        return;
        if (!z12 && (i13 = MrzRecognizer.i(K)) != null) {
            rrVar = i13;
        }
        if (rrVar != null) {
        }
        i10 = i11 + 1;
        min = i12;
        i3 = 4;
        z10 = false;
    }

    public /* synthetic */ j0(nk nkVar, boolean z10, ArrayList arrayList, int i3) {
        this.a = 2;
        this.d = nkVar;
        this.c = z10;
        this.e = arrayList;
        this.b = i3;
    }

    public /* synthetic */ j0(yt0 yt0Var, boolean z10, int i3, q1 q1Var) {
        this.a = 5;
        this.d = yt0Var;
        this.c = z10;
        this.b = i3;
        this.e = q1Var;
    }

    public /* synthetic */ j0(f41 f41Var, int i3, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.a = i10;
        this.d = f41Var;
        this.b = i3;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
