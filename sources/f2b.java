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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class f2b implements gk7 {
    public long E;
    public k27 F;
    public oac G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public k27 L;
    public TL_bots.botPreviewMedia M;
    public final /* synthetic */ g2b N;
    public final boolean b;
    public final f4b c;
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

    public f2b(g2b g2bVar, f4b f4bVar) {
        this.N = g2bVar;
        this.c = f4bVar;
        this.b = f4bVar.g;
        File file = f4bVar.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z = f4bVar.w;
        this.I = z;
        this.J = z;
        long j = f4bVar.J0;
        if (j != 0) {
            this.K = j;
            return;
        }
        if (f4bVar.g) {
            this.K = f4bVar.e;
            return;
        }
        TLRPC.InputPeer inputPeer = f4bVar.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.K = y6c.h(g2bVar.a).n;
        } else {
            this.K = cf3.m(inputPeer);
        }
    }

    public final void a() {
        g2b g2bVar = this.N;
        int i = g2bVar.a;
        boolean z = this.J;
        f4b f4bVar = this.c;
        if (z) {
            g2bVar.w.b(f4bVar);
            ((ArrayList) g2bVar.b.f(this.K)).remove(this);
        }
        this.w = true;
        if (f4bVar.D()) {
            MediaController.w().d(this.F);
        }
        ba4.G(i).b(this.e, false);
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
        g2b g2bVar = this.N;
        int i = g2bVar.a;
        kk7.f(i).n(this, kk7.T1);
        kk7.f(i).n(this, kk7.U1);
        kk7.f(i).n(this, kk7.V1);
        kk7.f(i).n(this, kk7.b2);
        kk7.f(i).n(this, kk7.Z1);
        kk7.f(i).n(this, kk7.a2);
        boolean z = this.J;
        long j = this.K;
        if (!z && (arrayList = (ArrayList) g2bVar.b.f(j)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) g2bVar.c.f(j);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                g2bVar.d = 0;
            } else {
                g2bVar.d++;
            }
        }
        boolean z2 = this.b;
        f4b f4bVar = this.c;
        if (z2 && (hashMap = (HashMap) g2bVar.e.f(j)) != null) {
            hashMap.remove(Integer.valueOf(f4bVar.f));
        }
        if (this.M != null) {
            y1b z3 = g2bVar.z(4, -1, this.K, false);
            if (f4bVar == null || !f4bVar.g) {
                if (z3 instanceof s1b) {
                    ((s1b) z3).I(this.M);
                }
                String str = f4bVar.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = kr0.G;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i)) != null) {
                    s1b s1bVar = (s1b) longSparseArray2.get(j);
                    int i2 = s1bVar.c;
                    ArrayList arrayList3 = s1bVar.G;
                    if (i2 == i) {
                        if (TextUtils.equals(s1bVar.E, str)) {
                            s1bVar.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            v1b v1bVar = s1bVar.q;
                            gl.r(v1bVar);
                            gl.d3(v1bVar);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = kr0.F;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i)) != null && (kr0Var = (kr0) longSparseArray.get(j)) != null) {
                    ArrayList arrayList4 = kr0Var.f;
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        s1b s1bVar2 = (s1b) arrayList4.get(i3);
                        if (s1bVar2.c == i && TextUtils.equals(s1bVar2.E, str)) {
                            s1bVar2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (z3 instanceof s1b) {
                    ((s1b) z3).G(f4bVar.L0, this.M);
                }
                String str2 = f4bVar.K0;
                TLRPC.InputMedia inputMedia = f4bVar.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = kr0.G;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i)) != null) {
                    s1b s1bVar3 = (s1b) longSparseArray4.get(j);
                    int i4 = s1bVar3.c;
                    ArrayList arrayList5 = s1bVar3.G;
                    if (i4 == i) {
                        if (TextUtils.equals(s1bVar3.E, str2)) {
                            s1bVar3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            v1b v1bVar2 = s1bVar3.q;
                            gl.r(v1bVar2);
                            gl.d3(v1bVar2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = kr0.F;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i)) != null && (kr0Var2 = (kr0) longSparseArray3.get(j)) != null) {
                    ArrayList arrayList6 = kr0Var2.f;
                    for (int i5 = 0; i5 < arrayList6.size(); i5++) {
                        s1b s1bVar4 = (s1b) arrayList6.get(i5);
                        if (s1bVar4.c == i && TextUtils.equals(s1bVar4.E, str2)) {
                            s1bVar4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        kk7.f(i).k(kk7.x5, new Object[0]);
        if (f4bVar != null && !f4bVar.h && !this.d) {
            f4bVar.i(false);
            this.d = true;
        }
        kk7.e().k(kk7.D5, this.e);
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
        f4b f4bVar = this.c;
        f4bVar.getClass();
        ArrayList arrayList2 = f4bVar.F0;
        byte b = 0;
        if (f4bVar.n && !f4bVar.j && (messageMedia = f4bVar.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = f4bVar.t;
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
                TLRPC.Photo photo = f4bVar.t.photo;
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
                if (f4bVar.D()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    ArrayList arrayList3 = f4bVar.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (arrayList3 != null) {
                        if (arrayList3.isEmpty()) {
                            ArrayList arrayList4 = f4bVar.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList4 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList5 = f4bVar.V0;
                        if (arrayList5 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList5);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(f4bVar.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (f4bVar.c0 != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= f4bVar.c0.attributes.size()) {
                                break;
                            }
                            if (f4bVar.c0.attributes.get(i2) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) f4bVar.c0.attributes.get(i2);
                                break;
                            }
                            i2++;
                        }
                    } else {
                        z3a.w(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i3 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i3 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.y;
                    if (f4bVar.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i3 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (f4bVar.Z * f4bVar.h0)) / 1000.0d;
                    }
                    ArrayList arrayList6 = f4bVar.U0;
                    if (arrayList6 != null && (!arrayList6.isEmpty() || ((arrayList = f4bVar.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList7 = new ArrayList<>(f4bVar.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList7;
                        ArrayList arrayList8 = f4bVar.V0;
                        if (arrayList8 != null) {
                            arrayList7.addAll(arrayList8);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = f4bVar.y == null && (f4bVar.Y || !f4bVar.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int f = (!y6c.h(i).p() ? na7.q1(i).k4.j1 : na7.q1(i).k4.i1).f();
            long j = f4bVar.J0;
            long j2 = this.K;
            if (this.b) {
                if (j != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = na7.q1(i).m1(f4bVar.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = f4bVar.K0;
                    tL_stories_sendStory2 = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory3 = new TL_stories.TL_stories_sendStory();
                    tL_stories_sendStory3.random_id = this.a;
                    tL_stories_sendStory3.peer = na7.q1(i).h1(j2);
                    tL_stories_sendStory3.media = inputMedia;
                    tL_stories_sendStory3.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory3.pinned = f4bVar.G0;
                    tL_stories_sendStory3.noforwards = !f4bVar.H0;
                    tL_stories_sendStory3.albums = f4bVar.w0 != null ? new ArrayList<>(f4bVar.w0) : null;
                    TLRPC.InputDocument inputDocument = f4bVar.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory3.flags |= 512;
                        tL_stories_sendStory3.music = inputDocument;
                    }
                    CharSequence charSequence2 = f4bVar.C0;
                    if (charSequence2 != null) {
                        tL_stories_sendStory3.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence2};
                        if (charSequence2.length() > f) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, f);
                        }
                        if (na7.q1(i).c5()) {
                            tL_stories_sendStory3.entities = hq6.d0(i).Y(charSequenceArr, true, true);
                        } else {
                            tL_stories_sendStory3.entities.clear();
                        }
                        if (charSequenceArr[0].length() > f) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, f);
                        }
                        tL_stories_sendStory3.caption = charSequenceArr[0].toString();
                    }
                    if (f4bVar.n) {
                        tL_stories_sendStory3.flags |= 64;
                        tL_stories_sendStory3.fwd_from_id = na7.q1(i).k1(f4bVar.q);
                        tL_stories_sendStory3.fwd_from_story = f4bVar.r;
                        tL_stories_sendStory3.fwd_modified = !z;
                    }
                    int i4 = f4bVar.I0;
                    if (i4 == Integer.MAX_VALUE) {
                        tL_stories_sendStory3.pinned = true;
                    } else {
                        tL_stories_sendStory3.flags |= 8;
                        tL_stories_sendStory3.period = i4;
                    }
                    tL_stories_sendStory = tL_stories_sendStory3;
                    if (f4bVar.T0 != null) {
                        for (int i5 = 0; i5 < f4bVar.T0.size(); i5++) {
                            TL_stories.MediaArea mediaArea = ((mac) f4bVar.T0.get(i5)).N;
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
                editpreviewmedia.bot = na7.q1(i).m1(f4bVar.J0);
                editpreviewmedia.media = f4bVar.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = f4bVar.K0;
                tL_stories_sendStory2 = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = f4bVar.f;
                tL_stories_editStory.peer = na7.q1(i).h1(j2);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = f4bVar.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && f4bVar.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (f4bVar.k && (charSequence = f4bVar.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence};
                    if (charSequence.length() > f) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, f);
                    }
                    if (na7.q1(i).c5()) {
                        tL_stories_editStory.entities = hq6.d0(i).Y(charSequenceArr2, true, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > f) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, f);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (f4bVar.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList9 = f4bVar.m;
                if (arrayList9 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList9);
                }
                if (f4bVar.T0 != null) {
                    for (int i6 = 0; i6 < f4bVar.T0.size(); i6++) {
                        TL_stories.MediaArea mediaArea2 = ((mac) f4bVar.T0.get(i6)).N;
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
            b2b b2bVar = new b2b(this, b);
            boolean z2 = w01.a;
            this.x = ConnectionsManager.getInstance(i).sendRequest(tL_stories_sendStory2, b2bVar, 64);
        }
        tL_inputMediaPhoto = null;
        z = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (f4bVar.D()) {
            }
        }
        int f2 = (!y6c.h(i).p() ? na7.q1(i).k4.j1 : na7.q1(i).k4.i1).f();
        long j3 = f4bVar.J0;
        long j22 = this.K;
        if (this.b) {
        }
        b2b b2bVar2 = new b2b(this, b);
        boolean z22 = w01.a;
        this.x = ConnectionsManager.getInstance(i).sendRequest(tL_stories_sendStory2, b2bVar2, 64);
    }

    public final void d() {
        f4b f4bVar = this.c;
        if (f4bVar.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i = na7.q5;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((f4bVar.g || (f4bVar.n && f4bVar.t != null)) && !f4bVar.j && f4bVar.o0 == null) {
            c(null);
            return;
        }
        w5b w5bVar = this.c.E0;
        byte b = 1;
        this.H = w5bVar != null && w5bVar.a == 1;
        kk7.f(this.N.a).a(this, kk7.T1);
        kk7.f(this.N.a).a(this, kk7.U1);
        kk7.f(this.N.a).a(this, kk7.V1);
        kk7.f(this.N.a).a(this, kk7.b2);
        kk7.f(this.N.a).a(this, kk7.Z1);
        kk7.f(this.N.a).a(this, kk7.a2);
        boolean D = this.c.D();
        this.s = D;
        if (D) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = f4b.w(this.N.a, "mp4").getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.F = new k27(this.N.a, tL_message, null, false, false);
            this.c.s(new e2b(this, b));
        } else {
            File w = f4b.w(this.N.a, "jpg");
            this.e = w.getAbsolutePath();
            Utilities.i.c(new iya(this, w, (byte) 12));
        }
        Intent intent = new Intent(a.b, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.N.a);
        try {
            a.b.startService(intent);
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        g2b g2bVar = this.N;
        int i3 = g2bVar.a;
        if (i == kk7.Z1) {
            if (objArr[0] == this.F) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i4 = kk7.a2;
        int i5 = kk7.C5;
        if (i == i4) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                kk7.f(i3).k(i5, this.e, Float.valueOf(this.h));
                if (this.y < 0 && this.n * this.E >= 1000.0f) {
                    this.y = longValue;
                }
                ba4.G(i3).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.y >= 0) {
                    return;
                }
                this.y = longValue2;
                return;
            }
            return;
        }
        if (i == kk7.b2) {
            if (objArr[0] == this.F) {
                if (!this.b) {
                    f4b f4bVar = this.c;
                    f4bVar.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    f4bVar.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    g2bVar.w.d(f4bVar);
                }
                b();
                return;
            }
            return;
        }
        if (i == kk7.T1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i == kk7.U1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            kk7.e().k(kk7.R4, 1, k96.M0(2131744212, null));
            b();
            return;
        }
        if (i == kk7.V1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            kk7.f(i3).k(i5, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        f4b f4bVar = this.c;
        f4bVar.getClass();
        ba4 G = ba4.G(this.N.a);
        String str = this.e;
        boolean z = !f4bVar.K;
        if (this.s) {
            oac oacVar = this.G;
            r6 = Math.max(1, (int) (oacVar != null ? oacVar.q : 0L));
        }
        G.g0(str, false, z, r6, f4bVar.K ? 33554432 : 16777216, true);
    }
}
