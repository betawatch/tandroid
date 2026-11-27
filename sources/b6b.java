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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class b6b implements fn7 {
    public long E;
    public r47 F;
    public oec G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public r47 L;
    public TL_bots.botPreviewMedia M;
    public final /* synthetic */ c6b N;
    public final boolean b;
    public final c8b c;
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

    public b6b(c6b c6bVar, c8b c8bVar) {
        this.N = c6bVar;
        this.c = c8bVar;
        this.b = c8bVar.g;
        File file = c8bVar.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z = c8bVar.w;
        this.I = z;
        this.J = z;
        long j = c8bVar.J0;
        if (j != 0) {
            this.K = j;
            return;
        }
        if (c8bVar.g) {
            this.K = c8bVar.e;
            return;
        }
        TLRPC.InputPeer inputPeer = c8bVar.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.K = yac.h(c6bVar.a).n;
        } else {
            this.K = wf3.m(inputPeer);
        }
    }

    public final void a() {
        c6b c6bVar = this.N;
        int i = c6bVar.a;
        boolean z = this.J;
        c8b c8bVar = this.c;
        if (z) {
            c6bVar.w.b(c8bVar);
            ((ArrayList) c6bVar.b.f(this.K)).remove(this);
        }
        this.w = true;
        if (c8bVar.D()) {
            MediaController.z().d(this.F);
        }
        xb4.G(i).b(this.e, false);
        if (this.x >= 0) {
            ConnectionsManager.getInstance(i).cancelRequest(this.x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        kr0 kr0Var;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        kr0 kr0Var2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        c6b c6bVar = this.N;
        int i = c6bVar.a;
        jn7.f(i).n(this, jn7.U1);
        jn7.f(i).n(this, jn7.V1);
        jn7.f(i).n(this, jn7.W1);
        jn7.f(i).n(this, jn7.c2);
        jn7.f(i).n(this, jn7.a2);
        jn7.f(i).n(this, jn7.b2);
        boolean z = this.J;
        long j = this.K;
        if (!z && (arrayList = (ArrayList) c6bVar.b.f(j)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) c6bVar.c.f(j);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                c6bVar.d = 0;
            } else {
                c6bVar.d++;
            }
        }
        boolean z2 = this.b;
        c8b c8bVar = this.c;
        if (z2 && (hashMap = (HashMap) c6bVar.e.f(j)) != null) {
            hashMap.remove(Integer.valueOf(c8bVar.f));
        }
        if (this.M != null) {
            u5b z3 = c6bVar.z(4, -1, this.K, false);
            if (c8bVar == null || !c8bVar.g) {
                if (z3 instanceof o5b) {
                    ((o5b) z3).I(this.M);
                }
                String str = c8bVar.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = kr0.G;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i)) != null) {
                    o5b o5bVar = (o5b) longSparseArray2.get(j);
                    int i2 = o5bVar.c;
                    ArrayList arrayList3 = o5bVar.G;
                    if (i2 == i) {
                        if (TextUtils.equals(o5bVar.E, str)) {
                            o5bVar.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            r5b r5bVar = o5bVar.q;
                            hl.r(r5bVar);
                            hl.c3(r5bVar);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = kr0.F;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i)) != null && (kr0Var = (kr0) longSparseArray.get(j)) != null) {
                    ArrayList arrayList4 = kr0Var.f;
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        o5b o5bVar2 = (o5b) arrayList4.get(i3);
                        if (o5bVar2.c == i && TextUtils.equals(o5bVar2.E, str)) {
                            o5bVar2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (z3 instanceof o5b) {
                    ((o5b) z3).G(c8bVar.L0, this.M);
                }
                String str2 = c8bVar.K0;
                TLRPC.InputMedia inputMedia = c8bVar.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = kr0.G;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i)) != null) {
                    o5b o5bVar3 = (o5b) longSparseArray4.get(j);
                    int i4 = o5bVar3.c;
                    ArrayList arrayList5 = o5bVar3.G;
                    if (i4 == i) {
                        if (TextUtils.equals(o5bVar3.E, str2)) {
                            o5bVar3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            r5b r5bVar2 = o5bVar3.q;
                            hl.r(r5bVar2);
                            hl.c3(r5bVar2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = kr0.F;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i)) != null && (kr0Var2 = (kr0) longSparseArray3.get(j)) != null) {
                    ArrayList arrayList6 = kr0Var2.f;
                    for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                        o5b o5bVar4 = (o5b) arrayList6.get(i5);
                        if (o5bVar4.c == i && TextUtils.equals(o5bVar4.E, str2)) {
                            o5bVar4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        jn7.f(i).k(jn7.y5, new Object[0]);
        if (c8bVar != null && !c8bVar.h && !this.d) {
            c8bVar.i(false);
            this.d = true;
        }
        jn7.e().k(jn7.E5, this.e);
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
        c8b c8bVar = this.c;
        c8bVar.getClass();
        ArrayList arrayList2 = c8bVar.F0;
        byte b = 0;
        if (c8bVar.n && !c8bVar.j && (messageMedia = c8bVar.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = c8bVar.t;
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
                TLRPC.Photo photo = c8bVar.t.photo;
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
                if (c8bVar.D()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    ArrayList arrayList3 = c8bVar.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (arrayList3 != null) {
                        if (arrayList3.isEmpty()) {
                            ArrayList arrayList4 = c8bVar.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList4 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList5 = c8bVar.V0;
                        if (arrayList5 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList5);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(c8bVar.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (c8bVar.c0 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= c8bVar.c0.attributes.size()) {
                                break;
                            }
                            if (c8bVar.c0.attributes.get(i2) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) c8bVar.c0.attributes.get(i2);
                                break;
                            }
                            i2++;
                        }
                    } else {
                        r7a.w(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i3 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i3 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.y;
                    if (c8bVar.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i3 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (c8bVar.Z * c8bVar.h0)) / 1000.0d;
                    }
                    ArrayList arrayList6 = c8bVar.U0;
                    if (arrayList6 != null && (!arrayList6.isEmpty() || ((arrayList = c8bVar.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList7 = new ArrayList<>(c8bVar.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList7;
                        ArrayList arrayList8 = c8bVar.V0;
                        if (arrayList8 != null) {
                            arrayList7.addAll(arrayList8);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = c8bVar.y == null && (c8bVar.Y || !c8bVar.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int f = (!yac.h(i).p() ? uc7.s1(i).k4.r1 : uc7.s1(i).k4.q1).f();
            long j = c8bVar.J0;
            long j2 = this.K;
            if (this.b) {
                if (j != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = uc7.s1(i).o1(c8bVar.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = c8bVar.K0;
                    tL_stories_sendStory2 = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory3 = new TL_stories.TL_stories_sendStory();
                    tL_stories_sendStory3.random_id = this.a;
                    tL_stories_sendStory3.peer = uc7.s1(i).j1(j2);
                    tL_stories_sendStory3.media = inputMedia;
                    tL_stories_sendStory3.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory3.pinned = c8bVar.G0;
                    tL_stories_sendStory3.noforwards = !c8bVar.H0;
                    tL_stories_sendStory3.albums = c8bVar.w0 != null ? new ArrayList<>(c8bVar.w0) : null;
                    TLRPC.InputDocument inputDocument = c8bVar.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory3.flags |= 512;
                        tL_stories_sendStory3.music = inputDocument;
                    }
                    CharSequence charSequence2 = c8bVar.C0;
                    if (charSequence2 != null) {
                        tL_stories_sendStory3.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence2};
                        if (charSequence2.length() > f) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, f);
                        }
                        if (uc7.s1(i).l5()) {
                            tL_stories_sendStory3.entities = ls6.d0(i).Y(charSequenceArr, true, true);
                        } else {
                            tL_stories_sendStory3.entities.clear();
                        }
                        if (charSequenceArr[0].length() > f) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, f);
                        }
                        tL_stories_sendStory3.caption = charSequenceArr[0].toString();
                    }
                    if (c8bVar.n) {
                        tL_stories_sendStory3.flags |= 64;
                        tL_stories_sendStory3.fwd_from_id = uc7.s1(i).m1(c8bVar.q);
                        tL_stories_sendStory3.fwd_from_story = c8bVar.r;
                        tL_stories_sendStory3.fwd_modified = !z;
                    }
                    int i4 = c8bVar.I0;
                    if (i4 == Integer.MAX_VALUE) {
                        tL_stories_sendStory3.pinned = true;
                    } else {
                        tL_stories_sendStory3.flags |= 8;
                        tL_stories_sendStory3.period = i4;
                    }
                    tL_stories_sendStory = tL_stories_sendStory3;
                    if (c8bVar.T0 != null) {
                        for (int i5 = 0; i5 < c8bVar.T0.size(); i5++) {
                            TL_stories.MediaArea mediaArea = ((mec) c8bVar.T0.get(i5)).N;
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
                editpreviewmedia.bot = uc7.s1(i).o1(c8bVar.J0);
                editpreviewmedia.media = c8bVar.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = c8bVar.K0;
                tL_stories_sendStory2 = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = c8bVar.f;
                tL_stories_editStory.peer = uc7.s1(i).j1(j2);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = c8bVar.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && c8bVar.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (c8bVar.k && (charSequence = c8bVar.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence};
                    if (charSequence.length() > f) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, f);
                    }
                    if (uc7.s1(i).l5()) {
                        tL_stories_editStory.entities = ls6.d0(i).Y(charSequenceArr2, true, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > f) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, f);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (c8bVar.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList9 = c8bVar.m;
                if (arrayList9 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList9);
                }
                if (c8bVar.T0 != null) {
                    for (int i6 = 0; i6 < c8bVar.T0.size(); i6++) {
                        TL_stories.MediaArea mediaArea2 = ((mec) c8bVar.T0.get(i6)).N;
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
            x5b x5bVar = new x5b(this, b);
            boolean z2 = f11.a;
            this.x = ConnectionsManager.getInstance(i).sendRequest(tL_stories_sendStory2, x5bVar, 64);
        }
        tL_inputMediaPhoto = null;
        z = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (c8bVar.D()) {
            }
        }
        int f2 = (!yac.h(i).p() ? uc7.s1(i).k4.r1 : uc7.s1(i).k4.q1).f();
        long j3 = c8bVar.J0;
        long j22 = this.K;
        if (this.b) {
        }
        x5b x5bVar2 = new x5b(this, b);
        boolean z22 = f11.a;
        this.x = ConnectionsManager.getInstance(i).sendRequest(tL_stories_sendStory2, x5bVar2, 64);
    }

    public final void d() {
        c8b c8bVar = this.c;
        if (c8bVar.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i = uc7.r5;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((c8bVar.g || (c8bVar.n && c8bVar.t != null)) && !c8bVar.j && c8bVar.o0 == null) {
            c(null);
            return;
        }
        u9b u9bVar = this.c.E0;
        byte b = 1;
        this.H = u9bVar != null && u9bVar.a == 1;
        jn7.f(this.N.a).a(this, jn7.U1);
        jn7.f(this.N.a).a(this, jn7.V1);
        jn7.f(this.N.a).a(this, jn7.W1);
        jn7.f(this.N.a).a(this, jn7.c2);
        jn7.f(this.N.a).a(this, jn7.a2);
        jn7.f(this.N.a).a(this, jn7.b2);
        boolean D = this.c.D();
        this.s = D;
        if (D) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = c8b.w(this.N.a, "mp4").getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.F = new r47(this.N.a, tL_message, null, false, false);
            this.c.s(new a6b(this, b));
        } else {
            File w = c8b.w(this.N.a, "jpg");
            this.e = w.getAbsolutePath();
            Utilities.i.c(new z3b(this, w, (byte) 9));
        }
        Intent intent = new Intent(a.b, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.N.a);
        try {
            a.b.startService(intent);
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        c6b c6bVar = this.N;
        int i3 = c6bVar.a;
        if (i == jn7.a2) {
            if (objArr[0] == this.F) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i4 = jn7.b2;
        int i5 = jn7.D5;
        if (i == i4) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                jn7.f(i3).k(i5, this.e, Float.valueOf(this.h));
                if (this.y < 0 && this.n * this.E >= 1000.0f) {
                    this.y = longValue;
                }
                xb4.G(i3).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.y >= 0) {
                    return;
                }
                this.y = longValue2;
                return;
            }
            return;
        }
        if (i == jn7.c2) {
            if (objArr[0] == this.F) {
                if (!this.b) {
                    c8b c8bVar = this.c;
                    c8bVar.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    c8bVar.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    c6bVar.w.d(c8bVar);
                }
                b();
                return;
            }
            return;
        }
        if (i == jn7.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i == jn7.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            jn7.e().k(jn7.S4, 1, ob6.M0(2131744106, null));
            b();
            return;
        }
        if (i == jn7.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            jn7.f(i3).k(i5, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        c8b c8bVar = this.c;
        c8bVar.getClass();
        xb4 G = xb4.G(this.N.a);
        String str = this.e;
        boolean z = !c8bVar.K;
        if (this.s) {
            oec oecVar = this.G;
            r6 = Math.max(1, (int) (oecVar != null ? oecVar.q : 0L));
        }
        G.g0(str, false, z, r6, c8bVar.K ? 33554432 : 16777216, true);
    }
}
