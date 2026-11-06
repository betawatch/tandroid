package di;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gz;
import org.telegram.messenger.h20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.j20;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class x6 implements ls {
    public long D;
    public ij E;
    public j20 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public ij K;
    public TL_bots.botPreviewMedia L;
    public final /* synthetic */ y6 M;
    public final boolean b;
    public final fi.e7 c;
    public boolean d;
    public String e;
    public final String f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public boolean w;
    public int x;
    public long y = -1;
    public final long a = Utilities.b.nextLong();

    public x6(y6 y6Var, fi.e7 e7Var) {
        this.M = y6Var;
        this.c = e7Var;
        this.b = e7Var.g;
        File file = e7Var.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z9 = e7Var.w;
        this.H = z9;
        this.I = z9;
        long j3 = e7Var.J0;
        if (j3 != 0) {
            this.J = j3;
            return;
        }
        if (e7Var.g) {
            this.J = e7Var.e;
            return;
        }
        TLRPC.InputPeer inputPeer = e7Var.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.J = p10.i(y6Var.a).n;
        } else {
            this.J = org.telegram.messenger.m5.n(inputPeer);
        }
    }

    public final void a() {
        boolean z9 = this.I;
        fi.e7 e7Var = this.c;
        y6 y6Var = this.M;
        if (z9) {
            y6Var.w.b(e7Var);
            ((ArrayList) y6Var.b.f(this.J)).remove(this);
        }
        this.w = true;
        if (e7Var.E()) {
            MediaController.B().i(this.E);
        }
        org.telegram.messenger.w7.G(y6Var.a).b(this.e, false);
        if (this.x >= 0) {
            ConnectionsManager.getInstance(y6Var.a).cancelRequest(this.x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ei.r rVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ei.r rVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        y6 y6Var = this.M;
        int i7 = y6Var.a;
        qs.f(i7).n(this, qs.U1);
        qs.f(i7).n(this, qs.V1);
        qs.f(i7).n(this, qs.W1);
        qs.f(i7).n(this, qs.c2);
        qs.f(i7).n(this, qs.a2);
        qs.f(i7).n(this, qs.b2);
        boolean z9 = this.I;
        long j3 = this.J;
        if (!z9 && (arrayList = (ArrayList) y6Var.b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) y6Var.c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                y6Var.d = 0;
            } else {
                y6Var.d++;
            }
        }
        boolean z10 = this.b;
        fi.e7 e7Var = this.c;
        if (z10 && (hashMap = (HashMap) y6Var.e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(e7Var.f));
        }
        if (this.L != null) {
            q6 A = y6Var.A(4, -1, this.J, false);
            if (e7Var == null || !e7Var.g) {
                if (A instanceof j6) {
                    ((j6) A).I(this.L);
                }
                String str = e7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = ei.r.F;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    j6 j6Var = (j6) longSparseArray2.get(j3);
                    int i10 = j6Var.c;
                    ArrayList arrayList3 = j6Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(j6Var.E, str)) {
                            j6Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            n6 n6Var = j6Var.q;
                            org.telegram.messenger.g0.r(n6Var);
                            org.telegram.messenger.g0.h3(n6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ei.r.E;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i7)) != null && (rVar = (ei.r) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList4 = rVar.f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        j6 j6Var2 = (j6) arrayList4.get(i11);
                        if (j6Var2.c == i7 && TextUtils.equals(j6Var2.E, str)) {
                            j6Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof j6) {
                    ((j6) A).G(e7Var.L0, this.L);
                }
                String str2 = e7Var.K0;
                TLRPC.InputMedia inputMedia = e7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = ei.r.F;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i7)) != null) {
                    j6 j6Var3 = (j6) longSparseArray4.get(j3);
                    int i12 = j6Var3.c;
                    ArrayList arrayList5 = j6Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(j6Var3.E, str2)) {
                            j6Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            n6 n6Var2 = j6Var3.q;
                            org.telegram.messenger.g0.r(n6Var2);
                            org.telegram.messenger.g0.h3(n6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ei.r.E;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i7)) != null && (rVar2 = (ei.r) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList6 = rVar2.f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        j6 j6Var4 = (j6) arrayList6.get(i13);
                        if (j6Var4.c == i7 && TextUtils.equals(j6Var4.E, str2)) {
                            j6Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        qs.f(i7).k(qs.v5, new Object[0]);
        if (e7Var != null && !e7Var.h && !this.d) {
            e7Var.i(false);
            this.d = true;
        }
        qs.e().k(qs.B5, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
    
        if (r1.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.InputFile inputFile) {
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
        boolean z9;
        boolean z10;
        TL_stories.TL_stories_sendStory tL_stories_sendStory;
        CharSequence charSequence;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int i7 = this.M.a;
        if (this.w) {
            return;
        }
        fi.e7 e7Var = this.c;
        e7Var.getClass();
        ArrayList arrayList2 = e7Var.F0;
        int i10 = 0;
        if (e7Var.n && !e7Var.j && (messageMedia = e7Var.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = e7Var.t;
                TLRPC.Document document = messageMedia2.document;
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputMediaDocument.id = tL_inputDocument;
                tL_inputMediaDocument.spoiler = messageMedia2.spoiler;
                tL_inputMediaPhoto2 = tL_inputMediaDocument;
            } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                TLRPC.Photo photo = e7Var.t.photo;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto3.id = tL_inputPhoto;
                tL_inputMediaPhoto2 = tL_inputMediaPhoto3;
            }
            z9 = true;
            tL_inputMediaPhoto = tL_inputMediaPhoto2;
            TLRPC.InputMedia inputMedia = tL_inputMediaPhoto;
            inputMedia = tL_inputMediaPhoto;
            if (tL_inputMediaPhoto == null && inputFile != null) {
                if (e7Var.E()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    List list = e7Var.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (list != null) {
                        if (list.isEmpty()) {
                            ArrayList arrayList3 = e7Var.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList3 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList4 = e7Var.V0;
                        if (arrayList4 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList4);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(e7Var.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (e7Var.c0 != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= e7Var.c0.attributes.size()) {
                                break;
                            }
                            if (e7Var.c0.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) e7Var.c0.attributes.get(i11);
                                break;
                            }
                            i11++;
                        }
                    } else {
                        gz.x(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i12 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i12 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.y;
                    if (e7Var.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i12 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (e7Var.Z * e7Var.h0)) / 1000.0d;
                    }
                    List list2 = e7Var.U0;
                    if (list2 != null && (!list2.isEmpty() || ((arrayList = e7Var.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList5 = new ArrayList<>(e7Var.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList5;
                        ArrayList arrayList6 = e7Var.V0;
                        if (arrayList6 != null) {
                            arrayList5.addAll(arrayList6);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = e7Var.y == null && (e7Var.Y || !e7Var.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int i13 = !p10.i(i7).q() ? qp.s1(i7).W4 : qp.s1(i7).V4;
            z10 = this.b;
            long j3 = this.J;
            if (z10) {
                if (e7Var.J0 != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = qp.s1(i7).o1(e7Var.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = e7Var.K0;
                    tL_stories_sendStory = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                    tL_stories_sendStory2.random_id = this.a;
                    tL_stories_sendStory2.peer = qp.s1(i7).j1(j3);
                    tL_stories_sendStory2.media = inputMedia;
                    tL_stories_sendStory2.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory2.pinned = e7Var.G0;
                    tL_stories_sendStory2.noforwards = !e7Var.H0;
                    tL_stories_sendStory2.albums = e7Var.w0 != null ? new ArrayList<>(e7Var.w0) : null;
                    TLRPC.InputDocument inputDocument = e7Var.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory2.flags |= 512;
                        tL_stories_sendStory2.music = inputDocument;
                    }
                    CharSequence charSequence2 = e7Var.C0;
                    if (charSequence2 != null) {
                        tL_stories_sendStory2.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence2};
                        if (charSequence2.length() > i13) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i13);
                        }
                        if (qp.s1(i7).X4()) {
                            tL_stories_sendStory2.entities = ui.b0(i7).W(charSequenceArr, true, true);
                        } else {
                            tL_stories_sendStory2.entities.clear();
                        }
                        if (charSequenceArr[0].length() > i13) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i13);
                        }
                        tL_stories_sendStory2.caption = charSequenceArr[0].toString();
                    }
                    if (e7Var.n) {
                        tL_stories_sendStory2.flags |= 64;
                        tL_stories_sendStory2.fwd_from_id = qp.s1(i7).m1(e7Var.q);
                        tL_stories_sendStory2.fwd_from_story = e7Var.r;
                        tL_stories_sendStory2.fwd_modified = !z9;
                    }
                    int i14 = e7Var.I0;
                    if (i14 == Integer.MAX_VALUE) {
                        tL_stories_sendStory2.pinned = true;
                    } else {
                        tL_stories_sendStory2.flags |= 8;
                        tL_stories_sendStory2.period = i14;
                    }
                    if (e7Var.T0 != null) {
                        for (int i15 = 0; i15 < e7Var.T0.size(); i15++) {
                            TL_stories.MediaArea mediaArea = ((h20) e7Var.T0.get(i15)).M;
                            if (mediaArea != null) {
                                tL_stories_sendStory2.media_areas.add(mediaArea);
                            }
                        }
                        if (!tL_stories_sendStory2.media_areas.isEmpty()) {
                            tL_stories_sendStory2.flags |= 32;
                        }
                    }
                    tL_stories_sendStory = tL_stories_sendStory2;
                }
            } else if (e7Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = qp.s1(i7).o1(e7Var.J0);
                editpreviewmedia.media = e7Var.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = e7Var.K0;
                tL_stories_sendStory = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = e7Var.f;
                tL_stories_editStory.peer = qp.s1(i7).j1(j3);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = e7Var.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && e7Var.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (e7Var.k && (charSequence = e7Var.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence};
                    if (charSequence.length() > i13) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i13);
                    }
                    if (qp.s1(i7).X4()) {
                        tL_stories_editStory.entities = ui.b0(i7).W(charSequenceArr2, true, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > i13) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i13);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (e7Var.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList7 = e7Var.m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (e7Var.T0 != null) {
                    for (int i16 = 0; i16 < e7Var.T0.size(); i16++) {
                        TL_stories.MediaArea mediaArea2 = ((h20) e7Var.T0.get(i16)).M;
                        if (mediaArea2 != null) {
                            tL_stories_editStory.media_areas.add(mediaArea2);
                        }
                    }
                }
                if (!tL_stories_editStory.media_areas.isEmpty()) {
                    tL_stories_editStory.flags |= 8;
                }
                tL_stories_sendStory = tL_stories_editStory;
            }
            u6 u6Var = new u6(this, i10);
            boolean z11 = org.telegram.messenger.r2.a;
            this.x = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_sendStory, u6Var, 64);
        }
        tL_inputMediaPhoto = null;
        z9 = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (e7Var.E()) {
            }
        }
        if (!p10.i(i7).q()) {
        }
        z10 = this.b;
        long j32 = this.J;
        if (z10) {
        }
        u6 u6Var2 = new u6(this, i10);
        boolean z112 = org.telegram.messenger.r2.a;
        this.x = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_sendStory, u6Var2, 64);
    }

    public final void d() {
        fi.e7 e7Var = this.c;
        if (e7Var.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i7 = qp.C8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((e7Var.g || (e7Var.n && e7Var.t != null)) && !e7Var.j && e7Var.o0 == null) {
            c(null);
            return;
        }
        fi.q8 q8Var = this.c.E0;
        int i10 = 1;
        this.G = q8Var != null && q8Var.a == 1;
        qs.f(this.M.a).b(this, qs.U1);
        qs.f(this.M.a).b(this, qs.V1);
        qs.f(this.M.a).b(this, qs.W1);
        qs.f(this.M.a).b(this, qs.c2);
        qs.f(this.M.a).b(this, qs.a2);
        qs.f(this.M.a).b(this, qs.b2);
        boolean E = this.c.E();
        this.s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = fi.e7.x(this.M.a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new ij(this.M.a, tL_message, null, false, false);
            this.c.s(new w6(this, i10));
        } else {
            File w10 = fi.e7.w(this.M.a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.i.c(new z0(13, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.b, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.a);
        try {
            org.telegram.messenger.t0.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        y6 y6Var = this.M;
        int i11 = y6Var.a;
        if (i7 == qs.a2) {
            if (objArr[0] == this.E) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = qs.b2;
        int i13 = qs.A5;
        if (i7 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                qs.f(i11).k(i13, this.e, Float.valueOf(this.h));
                if (this.y < 0 && this.n * this.D >= 1000.0f) {
                    this.y = longValue;
                }
                org.telegram.messenger.w7.G(i11).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.y >= 0) {
                    return;
                }
                this.y = longValue2;
                return;
            }
            return;
        }
        if (i7 == qs.c2) {
            if (objArr[0] == this.E) {
                if (!this.b) {
                    fi.e7 e7Var = this.c;
                    e7Var.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    e7Var.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    y6Var.w.d(e7Var);
                }
                b();
                return;
            }
            return;
        }
        if (i7 == qs.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i7 == qs.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            qs.e().k(qs.P4, 1, hd.M0(2131744453, null));
            b();
            return;
        }
        if (i7 == qs.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            qs.f(i11).k(i13, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        fi.e7 e7Var = this.c;
        e7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.M.a);
        String str = this.e;
        boolean z9 = !e7Var.K;
        if (this.s) {
            j20 j20Var = this.F;
            r6 = Math.max(1, (int) (j20Var != null ? j20Var.q : 0L));
        }
        G.g0(str, false, z9, r6, e7Var.K ? 33554432 : 16777216, true);
    }
}
