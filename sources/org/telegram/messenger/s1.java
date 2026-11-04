package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                g0.h3(new b4(16, (v1) this.b, tLObject));
                break;
            case 1:
                g0.h3(new b4(2, (z5) this.b, tLObject));
                break;
            case 2:
                i7 i7Var = (i7) this.b;
                if (tL_error != null) {
                    i7Var.j(0, false);
                    break;
                } else if (tLObject instanceof Vector) {
                    i7Var.E0 = false;
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (i7Var.q0 == null) {
                            i7Var.q0 = new HashMap();
                        }
                        for (int i3 = 0; i3 < vector.objects.size(); i3++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i3);
                            i7Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    for (int i10 = 0; i10 < i7Var.I0.size(); i10++) {
                        h7 h7Var = (h7) i7Var.I0.get(i10);
                        if (i7Var.M != null || i7Var.a0 == h7Var.e) {
                            i7Var.I0.remove(i10);
                            if (!i7Var.m(h7Var, null)) {
                                TLRPC.TL_upload_file tL_upload_file = h7Var.f;
                                if (tL_upload_file != null) {
                                    tL_upload_file.disableFree = false;
                                    tL_upload_file.freeResources();
                                    break;
                                } else {
                                    TLRPC.TL_upload_webFile tL_upload_webFile = h7Var.g;
                                    if (tL_upload_webFile != null) {
                                        tL_upload_webFile.disableFree = false;
                                        tL_upload_webFile.freeResources();
                                        break;
                                    } else {
                                        TLRPC.TL_upload_cdnFile tL_upload_cdnFile = h7Var.h;
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
                    i7Var.getClass();
                    break;
                }
                break;
            case 3:
                g0.h3(new a((Runnable) this.b, 23));
                break;
            case 4:
                uo uoVar = (uo) this.b;
                if (uoVar != null) {
                    TLRPC.ChannelParticipant channelParticipant = tLObject instanceof TLRPC.TL_channels_channelParticipant ? ((TLRPC.TL_channels_channelParticipant) tLObject).participant : null;
                    uoVar.a((tL_error != null || channelParticipant == null || channelParticipant.left) ? false : true, channelParticipant != null ? channelParticipant.admin_rights : null, channelParticipant != null ? channelParticipant.rank : null);
                    break;
                }
                break;
            case 5:
                g0.h3(new yh(27, (ap) this.b, tLObject));
                break;
            case 6:
                bp bpVar = (bp) this.b;
                ArrayList arrayList = new ArrayList();
                if (tLObject instanceof TLRPC.TL_savedMusic) {
                    ArrayList<TLRPC.Document> arrayList2 = ((TLRPC.TL_savedMusic) tLObject).documents;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Document document = arrayList2.get(i11);
                        i11++;
                        arrayList.add(bpVar.d(document));
                    }
                }
                g0.h3(new dg(bpVar, tLObject, arrayList, 15));
                break;
            case 7:
                c00 c00Var = (c00) this.b;
                if (tLObject != null) {
                    c00Var.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    c00Var.getClass();
                    break;
                }
            default:
                h10 h10Var = (h10) this.b;
                h10Var.getClass();
                g0.h3(new pq(23, h10Var, tLObject));
                break;
        }
    }
}
