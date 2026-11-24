// default package

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class g4b implements jm7 {
    public long E;
    public k47 F;
    public rcc G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public k47 L;
    public TL_bots.botPreviewMedia M;
    public final /* synthetic */ h4b N;
    public final boolean b;
    public final g6b c;
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

    public g4b(h4b h4bVar, g6b g6bVar) {
        this.N = h4bVar;
        this.c = g6bVar;
        this.b = g6bVar.g;
        File file = g6bVar.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z = g6bVar.w;
        this.I = z;
        this.J = z;
        long j = g6bVar.J0;
        if (j != 0) {
            this.K = j;
            return;
        }
        if (g6bVar.g) {
            this.K = g6bVar.e;
            return;
        }
        TLRPC.InputPeer inputPeer = g6bVar.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.K = z8c.h(h4bVar.a).n;
        } else {
            this.K = pg3.m(inputPeer);
        }
    }

    public final void a() {
        h4b h4bVar = this.N;
        int i = h4bVar.a;
        boolean z = this.J;
        g6b g6bVar = this.c;
        if (z) {
            h4bVar.w.b(g6bVar);
            ((ArrayList) h4bVar.b.f(this.K)).remove(this);
        }
        this.w = true;
        if (g6bVar.D()) {
            MediaController.w().d(this.F);
        }
        bc4.G(i).b(this.e, false);
        if (this.x >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ks0 ks0Var;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ks0 ks0Var2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        h4b h4bVar = this.N;
        int i = h4bVar.a;
        nm7.f(i).n(this, nm7.U1);
        nm7.f(i).n(this, nm7.V1);
        nm7.f(i).n(this, nm7.W1);
        nm7.f(i).n(this, nm7.c2);
        nm7.f(i).n(this, nm7.a2);
        nm7.f(i).n(this, nm7.b2);
        boolean z = this.J;
        long j = this.K;
        if (!z && (arrayList = (ArrayList) h4bVar.b.f(j)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) h4bVar.c.f(j);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                h4bVar.d = 0;
            } else {
                h4bVar.d++;
            }
        }
        boolean z2 = this.b;
        g6b g6bVar = this.c;
        if (z2 && (hashMap = (HashMap) h4bVar.e.f(j)) != null) {
            hashMap.remove(Integer.valueOf(g6bVar.f));
        }
        if (this.M != null) {
            z3b z3 = h4bVar.z(4, -1, this.K, false);
            if (g6bVar == null || !g6bVar.g) {
                if (z3 instanceof t3b) {
                    ((t3b) z3).I(this.M);
                }
                String str = g6bVar.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = ks0.G;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i)) != null) {
                    t3b t3bVar = (t3b) longSparseArray2.get(j);
                    int i2 = t3bVar.c;
                    ArrayList arrayList3 = t3bVar.G;
                    if (i2 == i) {
                        if (TextUtils.equals(t3bVar.E, str)) {
                            t3bVar.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            w3b w3bVar = t3bVar.q;
                            gm.r(w3bVar);
                            gm.c3(w3bVar);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ks0.F;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i)) != null && (ks0Var = (ks0) longSparseArray.get(j)) != null) {
                    ArrayList arrayList4 = ks0Var.f;
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        t3b t3bVar2 = (t3b) arrayList4.get(i3);
                        if (t3bVar2.c == i && TextUtils.equals(t3bVar2.E, str)) {
                            t3bVar2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (z3 instanceof t3b) {
                    ((t3b) z3).G(g6bVar.L0, this.M);
                }
                String str2 = g6bVar.K0;
                TLRPC.InputMedia inputMedia = g6bVar.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = ks0.G;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i)) != null) {
                    t3b t3bVar3 = (t3b) longSparseArray4.get(j);
                    int i4 = t3bVar3.c;
                    ArrayList arrayList5 = t3bVar3.G;
                    if (i4 == i) {
                        if (TextUtils.equals(t3bVar3.E, str2)) {
                            t3bVar3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            w3b w3bVar2 = t3bVar3.q;
                            gm.r(w3bVar2);
                            gm.c3(w3bVar2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ks0.F;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i)) != null && (ks0Var2 = (ks0) longSparseArray3.get(j)) != null) {
                    ArrayList arrayList6 = ks0Var2.f;
                    for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                        t3b t3bVar4 = (t3b) arrayList6.get(i5);
                        if (t3bVar4.c == i && TextUtils.equals(t3bVar4.E, str2)) {
                            t3bVar4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        nm7.f(i).k(nm7.z5, new Object[0]);
        if (g6bVar != null && !g6bVar.h && !this.d) {
            g6bVar.i(false);
            this.d = true;
        }
        nm7.e().k(nm7.F5, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
    
        if (r1.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.InputFile inputFile) {
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
        boolean z;
        TL_stories.TL_stories_sendStory tL_stories_sendStory;
        TL_stories.TL_stories_sendStory tL_stories_sendStory2;
        CharSequence charSequence;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int i = this.N.a;
        if (this.w) {
            return;
        }
        g6b g6bVar = this.c;
        g6bVar.getClass();
        ArrayList arrayList2 = g6bVar.F0;
        byte b = 0;
        if (g6bVar.n && !g6bVar.j && (messageMedia = g6bVar.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = g6bVar.t;
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
                TLRPC.Photo photo = g6bVar.t.photo;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto3.id = tL_inputPhoto;
                tL_inputMediaPhoto2 = tL_inputMediaPhoto3;
            }
            z = true;
            tL_inputMediaPhoto = tL_inputMediaPhoto2;
            TLRPC.InputMedia inputMedia = tL_inputMediaPhoto;
            inputMedia = tL_inputMediaPhoto;
            if (tL_inputMediaPhoto == null && inputFile != null) {
                if (g6bVar.D()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    ArrayList arrayList3 = g6bVar.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (arrayList3 != null) {
                        if (arrayList3.isEmpty()) {
                            ArrayList arrayList4 = g6bVar.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList4 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList5 = g6bVar.V0;
                        if (arrayList5 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList5);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(g6bVar.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (g6bVar.c0 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= g6bVar.c0.attributes.size()) {
                                break;
                            }
                            if (g6bVar.c0.attributes.get(i2) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) g6bVar.c0.attributes.get(i2);
                                break;
                            }
                            i2++;
                        }
                    } else {
                        a6a.w(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i3 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i3 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.y;
                    if (g6bVar.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i3 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (g6bVar.Z * g6bVar.h0)) / 1000.0d;
                    }
                    ArrayList arrayList6 = g6bVar.U0;
                    if (arrayList6 != null && (!arrayList6.isEmpty() || ((arrayList = g6bVar.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList7 = new ArrayList<>(g6bVar.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList7;
                        ArrayList arrayList8 = g6bVar.V0;
                        if (arrayList8 != null) {
                            arrayList7.addAll(arrayList8);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = g6bVar.y == null && (g6bVar.Y || !g6bVar.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int f = (!z8c.h(i).p() ? oc7.r1(i).l4.j1 : oc7.r1(i).l4.i1).f();
            long j = g6bVar.J0;
            long j2 = this.K;
            if (this.b) {
                if (j != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = oc7.r1(i).n1(g6bVar.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = g6bVar.K0;
                    tL_stories_sendStory2 = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory3 = new TL_stories.TL_stories_sendStory();
                    tL_stories_sendStory3.random_id = this.a;
                    tL_stories_sendStory3.peer = oc7.r1(i).i1(j2);
                    tL_stories_sendStory3.media = inputMedia;
                    tL_stories_sendStory3.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory3.pinned = g6bVar.G0;
                    tL_stories_sendStory3.noforwards = !g6bVar.H0;
                    tL_stories_sendStory3.albums = g6bVar.w0 != null ? new ArrayList<>(g6bVar.w0) : null;
                    TLRPC.InputDocument inputDocument = g6bVar.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory3.flags |= 512;
                        tL_stories_sendStory3.music = inputDocument;
                    }
                    CharSequence charSequence2 = g6bVar.C0;
                    if (charSequence2 != null) {
                        tL_stories_sendStory3.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence2};
                        if (charSequence2.length() > f) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, f);
                        }
                        if (oc7.r1(i).f5()) {
                            tL_stories_sendStory3.entities = hs6.d0(i).Y(charSequenceArr, true, true);
                        } else {
                            tL_stories_sendStory3.entities.clear();
                        }
                        if (charSequenceArr[0].length() > f) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, f);
                        }
                        tL_stories_sendStory3.caption = charSequenceArr[0].toString();
                    }
                    if (g6bVar.n) {
                        tL_stories_sendStory3.flags |= 64;
                        tL_stories_sendStory3.fwd_from_id = oc7.r1(i).l1(g6bVar.q);
                        tL_stories_sendStory3.fwd_from_story = g6bVar.r;
                        tL_stories_sendStory3.fwd_modified = !z;
                    }
                    int i4 = g6bVar.I0;
                    if (i4 == Integer.MAX_VALUE) {
                        tL_stories_sendStory3.pinned = true;
                    } else {
                        tL_stories_sendStory3.flags |= 8;
                        tL_stories_sendStory3.period = i4;
                    }
                    tL_stories_sendStory = tL_stories_sendStory3;
                    if (g6bVar.T0 != null) {
                        for (int i5 = 0; i5 < g6bVar.T0.size(); i5++) {
                            TL_stories.MediaArea mediaArea = ((pcc) g6bVar.T0.get(i5)).N;
                            if (mediaArea != null) {
                                tL_stories_sendStory3.media_areas.add(mediaArea);
                            }
                        }
                        boolean isEmpty = tL_stories_sendStory3.media_areas.isEmpty();
                        tL_stories_sendStory = tL_stories_sendStory3;
                        if (!isEmpty) {
                            tL_stories_sendStory3.flags |= 32;
                            tL_stories_sendStory = tL_stories_sendStory3;
                        }
                    }
                    tL_stories_sendStory2 = tL_stories_sendStory;
                }
            } else if (j != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = oc7.r1(i).n1(g6bVar.J0);
                editpreviewmedia.media = g6bVar.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = g6bVar.K0;
                tL_stories_sendStory2 = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = g6bVar.f;
                tL_stories_editStory.peer = oc7.r1(i).i1(j2);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = g6bVar.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && g6bVar.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (g6bVar.k && (charSequence = g6bVar.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence};
                    if (charSequence.length() > f) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, f);
                    }
                    if (oc7.r1(i).f5()) {
                        tL_stories_editStory.entities = hs6.d0(i).Y(charSequenceArr2, true, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > f) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, f);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (g6bVar.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList9 = g6bVar.m;
                if (arrayList9 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList9);
                }
                if (g6bVar.T0 != null) {
                    for (int i6 = 0; i6 < g6bVar.T0.size(); i6++) {
                        TL_stories.MediaArea mediaArea2 = ((pcc) g6bVar.T0.get(i6)).N;
                        if (mediaArea2 != null) {
                            tL_stories_editStory.media_areas.add(mediaArea2);
                        }
                    }
                }
                boolean isEmpty2 = tL_stories_editStory.media_areas.isEmpty();
                tL_stories_sendStory = tL_stories_editStory;
                if (!isEmpty2) {
                    tL_stories_editStory.flags |= 8;
                    tL_stories_sendStory = tL_stories_editStory;
                }
                tL_stories_sendStory2 = tL_stories_sendStory;
            }
            c4b c4bVar = new c4b(this, b);
            boolean z2 = e21.a;
            this.x = ConnectionsManager.getInstance(i).sendRequest(tL_stories_sendStory2, c4bVar, 64);
        }
        tL_inputMediaPhoto = null;
        z = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (g6bVar.D()) {
            }
        }
        int f2 = (!z8c.h(i).p() ? oc7.r1(i).l4.j1 : oc7.r1(i).l4.i1).f();
        long j3 = g6bVar.J0;
        long j22 = this.K;
        if (this.b) {
        }
        c4b c4bVar2 = new c4b(this, b);
        boolean z22 = e21.a;
        this.x = ConnectionsManager.getInstance(i).sendRequest(tL_stories_sendStory2, c4bVar2, 64);
    }

    public final void d() {
        g6b g6bVar = this.c;
        if (g6bVar.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i = oc7.s5;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((g6bVar.g || (g6bVar.n && g6bVar.t != null)) && !g6bVar.j && g6bVar.o0 == null) {
            c(null);
            return;
        }
        y7b y7bVar = this.c.E0;
        byte b = 1;
        this.H = y7bVar != null && y7bVar.a == 1;
        nm7.f(this.N.a).a(this, nm7.U1);
        nm7.f(this.N.a).a(this, nm7.V1);
        nm7.f(this.N.a).a(this, nm7.W1);
        nm7.f(this.N.a).a(this, nm7.c2);
        nm7.f(this.N.a).a(this, nm7.a2);
        nm7.f(this.N.a).a(this, nm7.b2);
        boolean D = this.c.D();
        this.s = D;
        if (D) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = g6b.w(this.N.a, "mp4").getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.F = new k47(this.N.a, tL_message, null, false, false);
            this.c.s(new f4b(this, b));
        } else {
            File w = g6b.w(this.N.a, "jpg");
            this.e = w.getAbsolutePath();
            Utilities.i.c(new uva(this, w, (byte) 14));
        }
        Intent intent = new Intent(a.b, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.N.a);
        try {
            a.b.startService(intent);
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        h4b h4bVar = this.N;
        int i3 = h4bVar.a;
        if (i == nm7.a2) {
            if (objArr[0] == this.F) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i4 = nm7.b2;
        int i5 = nm7.E5;
        if (i == i4) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                nm7.f(i3).k(i5, this.e, Float.valueOf(this.h));
                if (this.y < 0 && this.n * this.E >= 1000.0f) {
                    this.y = longValue;
                }
                bc4.G(i3).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.y >= 0) {
                    return;
                }
                this.y = longValue2;
                return;
            }
            return;
        }
        if (i == nm7.c2) {
            if (objArr[0] == this.F) {
                if (!this.b) {
                    g6b g6bVar = this.c;
                    g6bVar.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    g6bVar.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    h4bVar.w.d(g6bVar);
                }
                b();
                return;
            }
            return;
        }
        if (i == nm7.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i == nm7.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            nm7.e().k(nm7.T4, 1, jb6.M0(2131744138, null));
            b();
            return;
        }
        if (i == nm7.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            nm7.f(i3).k(i5, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        g6b g6bVar = this.c;
        g6bVar.getClass();
        bc4 G = bc4.G(this.N.a);
        String str = this.e;
        boolean z = !g6bVar.K;
        if (this.s) {
            rcc rccVar = this.G;
            r6 = Math.max(1, (int) (rccVar != null ? rccVar.q : 0L));
        }
        G.g0(str, false, z, r6, g6bVar.K ? 33554432 : 16777216, true);
    }
}
