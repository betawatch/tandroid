package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                i0.g3(new e4(14, (y1) this.b, tLObject));
                break;
            case 1:
                i0.g3(new e4(2, (b6) this.b, tLObject));
                break;
            case 2:
                m7 m7Var = (m7) this.b;
                if (tL_error != null) {
                    m7Var.j(0, false);
                    break;
                } else if (tLObject instanceof Vector) {
                    m7Var.E0 = false;
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (m7Var.q0 == null) {
                            m7Var.q0 = new HashMap();
                        }
                        for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i10);
                            m7Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    for (int i11 = 0; i11 < m7Var.I0.size(); i11++) {
                        l7 l7Var = (l7) m7Var.I0.get(i11);
                        if (m7Var.M != null || m7Var.a0 == l7Var.e) {
                            m7Var.I0.remove(i11);
                            if (!m7Var.m(l7Var, null)) {
                                TLRPC.TL_upload_file tL_upload_file = l7Var.f;
                                if (tL_upload_file != null) {
                                    tL_upload_file.disableFree = false;
                                    tL_upload_file.freeResources();
                                    break;
                                } else {
                                    TLRPC.TL_upload_webFile tL_upload_webFile = l7Var.g;
                                    if (tL_upload_webFile != null) {
                                        tL_upload_webFile.disableFree = false;
                                        tL_upload_webFile.freeResources();
                                        break;
                                    } else {
                                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile = l7Var.h;
                                        if (tL_upload_cdnFile != null) {
                                            tL_upload_cdnFile.disableFree = false;
                                            tL_upload_cdnFile.freeResources();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                } else {
                    m7Var.getClass();
                    break;
                }
                break;
            case 3:
                i0.g3(new a((Runnable) this.b, 25));
                break;
            case 4:
                jp jpVar = (jp) this.b;
                if (jpVar != null) {
                    TLRPC.ChannelParticipant channelParticipant = tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null;
                    jpVar.a((tL_error != null || channelParticipant == null || channelParticipant.left) ? false : true, channelParticipant != null ? channelParticipant.admin_rights : null, channelParticipant != null ? channelParticipant.rank : null);
                    break;
                }
                break;
            case 5:
                i0.g3(new pi(25, (pp) this.b, tLObject));
                break;
            case 6:
                qp qpVar = (qp) this.b;
                ArrayList arrayList = new ArrayList();
                if (tLObject instanceof TLRPC.TL_savedMusic) {
                    ArrayList<TLRPC.Document> arrayList2 = ((TLRPC.TL_savedMusic) tLObject).documents;
                    int size = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TLRPC.Document document = arrayList2.get(i12);
                        i12++;
                        arrayList.add(qpVar.d(document));
                    }
                }
                i0.g3(new lg(qpVar, tLObject, arrayList, 15));
                break;
            case 7:
                y00 y00Var = (y00) this.b;
                if (tLObject != null) {
                    y00Var.getMessagesController().L3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    y00Var.getClass();
                    break;
                }
            default:
                e20 e20Var = (e20) this.b;
                e20Var.getClass();
                i0.g3(new ir(21, e20Var, tLObject));
                break;
        }
    }
}
