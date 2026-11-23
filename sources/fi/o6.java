package fi;

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
import org.telegram.messenger.az;
import org.telegram.messenger.d20;
import org.telegram.messenger.f20;
import org.telegram.messenger.gj;
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class o6 implements gs {
    public long E;
    public gj F;
    public f20 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public gj L;
    public TL_bots.botPreviewMedia M;
    public final /* synthetic */ p6 N;
    public final boolean b;
    public final hi.c7 c;
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

    public o6(p6 p6Var, hi.c7 c7Var) {
        this.N = p6Var;
        this.c = c7Var;
        this.b = c7Var.g;
        File file = c7Var.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z10 = c7Var.w;
        this.I = z10;
        this.J = z10;
        long j3 = c7Var.J0;
        if (j3 != 0) {
            this.K = j3;
            return;
        }
        if (c7Var.g) {
            this.K = c7Var.e;
            return;
        }
        TLRPC.InputPeer inputPeer = c7Var.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.K = k10.i(p6Var.a).n;
        } else {
            this.K = org.telegram.messenger.n5.n(inputPeer);
        }
    }

    public final void a() {
        boolean z10 = this.J;
        hi.c7 c7Var = this.c;
        p6 p6Var = this.N;
        if (z10) {
            p6Var.w.b(c7Var);
            ((ArrayList) p6Var.b.f(this.K)).remove(this);
        }
        this.w = true;
        if (c7Var.E()) {
            MediaController.B().i(this.F);
        }
        org.telegram.messenger.w7.G(p6Var.a).b(this.e, false);
        if (this.x >= 0) {
            ConnectionsManager.getInstance(p6Var.a).cancelRequest(this.x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        gi.q qVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        gi.q qVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        p6 p6Var = this.N;
        int i7 = p6Var.a;
        ls.f(i7).n(this, ls.U1);
        ls.f(i7).n(this, ls.V1);
        ls.f(i7).n(this, ls.W1);
        ls.f(i7).n(this, ls.c2);
        ls.f(i7).n(this, ls.a2);
        ls.f(i7).n(this, ls.b2);
        boolean z10 = this.J;
        long j3 = this.K;
        if (!z10 && (arrayList = (ArrayList) p6Var.b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) p6Var.c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                p6Var.d = 0;
            } else {
                p6Var.d++;
            }
        }
        boolean z11 = this.b;
        hi.c7 c7Var = this.c;
        if (z11 && (hashMap = (HashMap) p6Var.e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(c7Var.f));
        }
        if (this.M != null) {
            h6 A = p6Var.A(4, -1, this.K, false);
            if (c7Var == null || !c7Var.g) {
                if (A instanceof a6) {
                    ((a6) A).I(this.M);
                }
                String str = c7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = gi.q.G;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i7)) != null) {
                    a6 a6Var = (a6) longSparseArray2.get(j3);
                    int i10 = a6Var.c;
                    ArrayList arrayList3 = a6Var.G;
                    if (i10 == i7) {
                        if (TextUtils.equals(a6Var.E, str)) {
                            a6Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            e6 e6Var = a6Var.q;
                            org.telegram.messenger.g0.r(e6Var);
                            org.telegram.messenger.g0.g3(e6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = gi.q.F;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i7)) != null && (qVar = (gi.q) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList4 = qVar.f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        a6 a6Var2 = (a6) arrayList4.get(i11);
                        if (a6Var2.c == i7 && TextUtils.equals(a6Var2.E, str)) {
                            a6Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof a6) {
                    ((a6) A).G(c7Var.L0, this.M);
                }
                String str2 = c7Var.K0;
                TLRPC.InputMedia inputMedia = c7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = gi.q.G;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i7)) != null) {
                    a6 a6Var3 = (a6) longSparseArray4.get(j3);
                    int i12 = a6Var3.c;
                    ArrayList arrayList5 = a6Var3.G;
                    if (i12 == i7) {
                        if (TextUtils.equals(a6Var3.E, str2)) {
                            a6Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            e6 e6Var2 = a6Var3.q;
                            org.telegram.messenger.g0.r(e6Var2);
                            org.telegram.messenger.g0.g3(e6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = gi.q.F;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i7)) != null && (qVar2 = (gi.q) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList6 = qVar2.f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        a6 a6Var4 = (a6) arrayList6.get(i13);
                        if (a6Var4.c == i7 && TextUtils.equals(a6Var4.E, str2)) {
                            a6Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        ls.f(i7).k(ls.y5, new Object[0]);
        if (c7Var != null && !c7Var.h && !this.d) {
            c7Var.i(false);
            this.d = true;
        }
        ls.e().k(ls.E5, this.e);
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
        boolean z10;
        boolean z11;
        TL_stories.TL_stories_sendStory tL_stories_sendStory;
        CharSequence charSequence;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int i7 = this.N.a;
        if (this.w) {
            return;
        }
        hi.c7 c7Var = this.c;
        c7Var.getClass();
        ArrayList arrayList2 = c7Var.F0;
        int i10 = 0;
        if (c7Var.n && !c7Var.j && (messageMedia = c7Var.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = c7Var.t;
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
                TLRPC.Photo photo = c7Var.t.photo;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto3.id = tL_inputPhoto;
                tL_inputMediaPhoto2 = tL_inputMediaPhoto3;
            }
            z10 = true;
            tL_inputMediaPhoto = tL_inputMediaPhoto2;
            TLRPC.InputMedia inputMedia = tL_inputMediaPhoto;
            inputMedia = tL_inputMediaPhoto;
            if (tL_inputMediaPhoto == null && inputFile != null) {
                if (c7Var.E()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    List list = c7Var.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (list != null) {
                        if (list.isEmpty()) {
                            ArrayList arrayList3 = c7Var.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList3 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList4 = c7Var.V0;
                        if (arrayList4 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList4);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(c7Var.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (c7Var.c0 != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= c7Var.c0.attributes.size()) {
                                break;
                            }
                            if (c7Var.c0.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) c7Var.c0.attributes.get(i11);
                                break;
                            }
                            i11++;
                        }
                    } else {
                        az.x(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i12 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i12 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.y;
                    if (c7Var.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i12 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (c7Var.Z * c7Var.h0)) / 1000.0d;
                    }
                    List list2 = c7Var.U0;
                    if (list2 != null && (!list2.isEmpty() || ((arrayList = c7Var.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList5 = new ArrayList<>(c7Var.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList5;
                        ArrayList arrayList6 = c7Var.V0;
                        if (arrayList6 != null) {
                            arrayList5.addAll(arrayList6);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = c7Var.y == null && (c7Var.Y || !c7Var.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int i13 = !k10.i(i7).q() ? np.u1(i7).Z4 : np.u1(i7).Y4;
            z11 = this.b;
            long j3 = this.K;
            if (z11) {
                if (c7Var.J0 != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = np.u1(i7).q1(c7Var.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = c7Var.K0;
                    tL_stories_sendStory = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                    tL_stories_sendStory2.random_id = this.a;
                    tL_stories_sendStory2.peer = np.u1(i7).l1(j3);
                    tL_stories_sendStory2.media = inputMedia;
                    tL_stories_sendStory2.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory2.pinned = c7Var.G0;
                    tL_stories_sendStory2.noforwards = !c7Var.H0;
                    tL_stories_sendStory2.albums = c7Var.w0 != null ? new ArrayList<>(c7Var.w0) : null;
                    TLRPC.InputDocument inputDocument = c7Var.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory2.flags |= 512;
                        tL_stories_sendStory2.music = inputDocument;
                    }
                    CharSequence charSequence2 = c7Var.C0;
                    if (charSequence2 != null) {
                        tL_stories_sendStory2.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence2};
                        if (charSequence2.length() > i13) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i13);
                        }
                        if (np.u1(i7).j5()) {
                            tL_stories_sendStory2.entities = si.d0(i7).Y(charSequenceArr, true, true);
                        } else {
                            tL_stories_sendStory2.entities.clear();
                        }
                        if (charSequenceArr[0].length() > i13) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i13);
                        }
                        tL_stories_sendStory2.caption = charSequenceArr[0].toString();
                    }
                    if (c7Var.n) {
                        tL_stories_sendStory2.flags |= 64;
                        tL_stories_sendStory2.fwd_from_id = np.u1(i7).o1(c7Var.q);
                        tL_stories_sendStory2.fwd_from_story = c7Var.r;
                        tL_stories_sendStory2.fwd_modified = !z10;
                    }
                    int i14 = c7Var.I0;
                    if (i14 == Integer.MAX_VALUE) {
                        tL_stories_sendStory2.pinned = true;
                    } else {
                        tL_stories_sendStory2.flags |= 8;
                        tL_stories_sendStory2.period = i14;
                    }
                    if (c7Var.T0 != null) {
                        for (int i15 = 0; i15 < c7Var.T0.size(); i15++) {
                            TL_stories.MediaArea mediaArea = ((d20) c7Var.T0.get(i15)).M;
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
            } else if (c7Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = np.u1(i7).q1(c7Var.J0);
                editpreviewmedia.media = c7Var.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = c7Var.K0;
                tL_stories_sendStory = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = c7Var.f;
                tL_stories_editStory.peer = np.u1(i7).l1(j3);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = c7Var.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && c7Var.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (c7Var.k && (charSequence = c7Var.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence};
                    if (charSequence.length() > i13) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i13);
                    }
                    if (np.u1(i7).j5()) {
                        tL_stories_editStory.entities = si.d0(i7).Y(charSequenceArr2, true, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > i13) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i13);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (c7Var.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList7 = c7Var.m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (c7Var.T0 != null) {
                    for (int i16 = 0; i16 < c7Var.T0.size(); i16++) {
                        TL_stories.MediaArea mediaArea2 = ((d20) c7Var.T0.get(i16)).M;
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
            l6 l6Var = new l6(this, i10);
            boolean z12 = org.telegram.messenger.s2.a;
            this.x = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_sendStory, l6Var, 64);
        }
        tL_inputMediaPhoto = null;
        z10 = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (c7Var.E()) {
            }
        }
        if (!k10.i(i7).q()) {
        }
        z11 = this.b;
        long j32 = this.K;
        if (z11) {
        }
        l6 l6Var2 = new l6(this, i10);
        boolean z122 = org.telegram.messenger.s2.a;
        this.x = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_sendStory, l6Var2, 64);
    }

    public final void d() {
        hi.c7 c7Var = this.c;
        if (c7Var.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i7 = np.I8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((c7Var.g || (c7Var.n && c7Var.t != null)) && !c7Var.j && c7Var.o0 == null) {
            c(null);
            return;
        }
        hi.n8 n8Var = this.c.E0;
        int i10 = 1;
        this.H = n8Var != null && n8Var.a == 1;
        ls.f(this.N.a).b(this, ls.U1);
        ls.f(this.N.a).b(this, ls.V1);
        ls.f(this.N.a).b(this, ls.W1);
        ls.f(this.N.a).b(this, ls.c2);
        ls.f(this.N.a).b(this, ls.a2);
        ls.f(this.N.a).b(this, ls.b2);
        boolean E = this.c.E();
        this.s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = hi.c7.x(this.N.a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.F = new gj(this.N.a, tL_message, null, false, false);
            this.c.s(new n6(this, i10));
        } else {
            File w10 = hi.c7.w(this.N.a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.i.c(new l4(8, this, w10));
        }
        Intent intent = new Intent(org.telegram.messenger.t0.b, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.N.a);
        try {
            org.telegram.messenger.t0.b.startService(intent);
        } catch (Throwable th2) {
            org.telegram.messenger.a8.g(th2, true);
        }
    }

    @Override // org.telegram.messenger.gs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p6 p6Var = this.N;
        int i11 = p6Var.a;
        if (i7 == ls.a2) {
            if (objArr[0] == this.F) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = ls.b2;
        int i13 = ls.D5;
        if (i7 == i12) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                ls.f(i11).k(i13, this.e, Float.valueOf(this.h));
                if (this.y < 0 && this.n * this.E >= 1000.0f) {
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
        if (i7 == ls.c2) {
            if (objArr[0] == this.F) {
                if (!this.b) {
                    hi.c7 c7Var = this.c;
                    c7Var.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    c7Var.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    p6Var.w.d(c7Var);
                }
                b();
                return;
            }
            return;
        }
        if (i7 == ls.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i7 == ls.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            ls.e().k(ls.S4, 1, hd.N0(2131744209, null));
            b();
            return;
        }
        if (i7 == ls.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            ls.f(i11).k(i13, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        hi.c7 c7Var = this.c;
        c7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.N.a);
        String str = this.e;
        boolean z10 = !c7Var.K;
        if (this.s) {
            f20 f20Var = this.G;
            r6 = Math.max(1, (int) (f20Var != null ? f20Var.q : 0L));
        }
        G.g0(str, false, z10, r6, c7Var.K ? 33554432 : 16777216, true);
    }
}
