package ei;

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
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.li;
import org.telegram.messenger.yy;
import org.telegram.messenger.z10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class y6 implements cs {
    public long E;
    public zi F;
    public b20 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final long K;
    public zi L;
    public TL_bots.botPreviewMedia M;
    public final /* synthetic */ z6 N;
    public final boolean b;
    public final gi.f7 c;
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

    public y6(z6 z6Var, gi.f7 f7Var) {
        this.N = z6Var;
        this.c = f7Var;
        this.b = f7Var.g;
        File file = f7Var.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z10 = f7Var.w;
        this.I = z10;
        this.J = z10;
        long j10 = f7Var.J0;
        if (j10 != 0) {
            this.K = j10;
            return;
        }
        if (f7Var.g) {
            this.K = f7Var.e;
            return;
        }
        TLRPC.InputPeer inputPeer = f7Var.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.K = h10.i(z6Var.a).n;
        } else {
            this.K = org.telegram.messenger.m5.n(inputPeer);
        }
    }

    public final void a() {
        boolean z10 = this.J;
        gi.f7 f7Var = this.c;
        z6 z6Var = this.N;
        if (z10) {
            z6Var.w.b(f7Var);
            ((ArrayList) z6Var.b.f(this.K)).remove(this);
        }
        this.w = true;
        if (f7Var.E()) {
            MediaController.B().i(this.F);
        }
        org.telegram.messenger.w7.G(z6Var.a).b(this.e, false);
        if (this.x >= 0) {
            ConnectionsManager.getInstance(z6Var.a).cancelRequest(this.x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        fi.q qVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        fi.q qVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        z6 z6Var = this.N;
        int i3 = z6Var.a;
        hs.f(i3).n(this, hs.U1);
        hs.f(i3).n(this, hs.V1);
        hs.f(i3).n(this, hs.W1);
        hs.f(i3).n(this, hs.c2);
        hs.f(i3).n(this, hs.a2);
        hs.f(i3).n(this, hs.b2);
        boolean z10 = this.J;
        long j10 = this.K;
        if (!z10 && (arrayList = (ArrayList) z6Var.b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) z6Var.c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                z6Var.d = 0;
            } else {
                z6Var.d++;
            }
        }
        boolean z11 = this.b;
        gi.f7 f7Var = this.c;
        if (z11 && (hashMap = (HashMap) z6Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(f7Var.f));
        }
        if (this.M != null) {
            r6 A = z6Var.A(4, -1, this.K, false);
            if (f7Var == null || !f7Var.g) {
                if (A instanceof k6) {
                    ((k6) A).I(this.M);
                }
                String str = f7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.M;
                LongSparseArray longSparseArray5 = fi.q.G;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i3)) != null) {
                    k6 k6Var = (k6) longSparseArray2.get(j10);
                    int i10 = k6Var.c;
                    ArrayList arrayList3 = k6Var.G;
                    if (i10 == i3) {
                        if (TextUtils.equals(k6Var.E, str)) {
                            k6Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            o6 o6Var = k6Var.q;
                            org.telegram.messenger.g0.r(o6Var);
                            org.telegram.messenger.g0.h3(o6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = fi.q.F;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i3)) != null && (qVar = (fi.q) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList4 = qVar.f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        k6 k6Var2 = (k6) arrayList4.get(i11);
                        if (k6Var2.c == i3 && TextUtils.equals(k6Var2.E, str)) {
                            k6Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof k6) {
                    ((k6) A).G(f7Var.L0, this.M);
                }
                String str2 = f7Var.K0;
                TLRPC.InputMedia inputMedia = f7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.M;
                LongSparseArray longSparseArray7 = fi.q.G;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i3)) != null) {
                    k6 k6Var3 = (k6) longSparseArray4.get(j10);
                    int i12 = k6Var3.c;
                    ArrayList arrayList5 = k6Var3.G;
                    if (i12 == i3) {
                        if (TextUtils.equals(k6Var3.E, str2)) {
                            k6Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            o6 o6Var2 = k6Var3.q;
                            org.telegram.messenger.g0.r(o6Var2);
                            org.telegram.messenger.g0.h3(o6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = fi.q.F;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i3)) != null && (qVar2 = (fi.q) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList6 = qVar2.f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        k6 k6Var4 = (k6) arrayList6.get(i13);
                        if (k6Var4.c == i3 && TextUtils.equals(k6Var4.E, str2)) {
                            k6Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.M = null;
        }
        hs.f(i3).k(hs.v5, new Object[0]);
        if (f7Var != null && !f7Var.h && !this.d) {
            f7Var.i(false);
            this.d = true;
        }
        hs.e().k(hs.B5, this.e);
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
        int i3 = this.N.a;
        if (this.w) {
            return;
        }
        gi.f7 f7Var = this.c;
        f7Var.getClass();
        ArrayList arrayList2 = f7Var.F0;
        int i10 = 0;
        if (f7Var.n && !f7Var.j && (messageMedia = f7Var.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = f7Var.t;
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
                TLRPC.Photo photo = f7Var.t.photo;
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
                if (f7Var.E()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    List list = f7Var.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (list != null) {
                        if (list.isEmpty()) {
                            ArrayList arrayList3 = f7Var.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList3 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList4 = f7Var.V0;
                        if (arrayList4 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList4);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(f7Var.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (f7Var.c0 != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= f7Var.c0.attributes.size()) {
                                break;
                            }
                            if (f7Var.c0.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) f7Var.c0.attributes.get(i11);
                                break;
                            }
                            i11++;
                        }
                    } else {
                        yy.x(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i12 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i12 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.y;
                    if (f7Var.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i12 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (f7Var.Z * f7Var.h0)) / 1000.0d;
                    }
                    List list2 = f7Var.U0;
                    if (list2 != null && (!list2.isEmpty() || ((arrayList = f7Var.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList5 = new ArrayList<>(f7Var.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList5;
                        ArrayList arrayList6 = f7Var.V0;
                        if (arrayList6 != null) {
                            arrayList5.addAll(arrayList6);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = f7Var.y == null && (f7Var.Y || !f7Var.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int i13 = !h10.i(i3).q() ? hp.s1(i3).W4 : hp.s1(i3).V4;
            z11 = this.b;
            long j10 = this.K;
            if (z11) {
                if (f7Var.J0 != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = hp.s1(i3).o1(f7Var.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = f7Var.K0;
                    tL_stories_sendStory = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                    tL_stories_sendStory2.random_id = this.a;
                    tL_stories_sendStory2.peer = hp.s1(i3).j1(j10);
                    tL_stories_sendStory2.media = inputMedia;
                    tL_stories_sendStory2.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory2.pinned = f7Var.G0;
                    tL_stories_sendStory2.noforwards = !f7Var.H0;
                    tL_stories_sendStory2.albums = f7Var.w0 != null ? new ArrayList<>(f7Var.w0) : null;
                    TLRPC.InputDocument inputDocument = f7Var.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory2.flags |= 512;
                        tL_stories_sendStory2.music = inputDocument;
                    }
                    CharSequence charSequence2 = f7Var.C0;
                    if (charSequence2 != null) {
                        tL_stories_sendStory2.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence2};
                        if (charSequence2.length() > i13) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i13);
                        }
                        if (hp.s1(i3).X4()) {
                            tL_stories_sendStory2.entities = li.b0(i3).W(charSequenceArr, true, true);
                        } else {
                            tL_stories_sendStory2.entities.clear();
                        }
                        if (charSequenceArr[0].length() > i13) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i13);
                        }
                        tL_stories_sendStory2.caption = charSequenceArr[0].toString();
                    }
                    if (f7Var.n) {
                        tL_stories_sendStory2.flags |= 64;
                        tL_stories_sendStory2.fwd_from_id = hp.s1(i3).m1(f7Var.q);
                        tL_stories_sendStory2.fwd_from_story = f7Var.r;
                        tL_stories_sendStory2.fwd_modified = !z10;
                    }
                    int i14 = f7Var.I0;
                    if (i14 == Integer.MAX_VALUE) {
                        tL_stories_sendStory2.pinned = true;
                    } else {
                        tL_stories_sendStory2.flags |= 8;
                        tL_stories_sendStory2.period = i14;
                    }
                    if (f7Var.T0 != null) {
                        for (int i15 = 0; i15 < f7Var.T0.size(); i15++) {
                            TL_stories.MediaArea mediaArea = ((z10) f7Var.T0.get(i15)).M;
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
            } else if (f7Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = hp.s1(i3).o1(f7Var.J0);
                editpreviewmedia.media = f7Var.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = f7Var.K0;
                tL_stories_sendStory = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = f7Var.f;
                tL_stories_editStory.peer = hp.s1(i3).j1(j10);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = f7Var.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && f7Var.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (f7Var.k && (charSequence = f7Var.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence};
                    if (charSequence.length() > i13) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i13);
                    }
                    if (hp.s1(i3).X4()) {
                        tL_stories_editStory.entities = li.b0(i3).W(charSequenceArr2, true, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > i13) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i13);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (f7Var.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList7 = f7Var.m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (f7Var.T0 != null) {
                    for (int i16 = 0; i16 < f7Var.T0.size(); i16++) {
                        TL_stories.MediaArea mediaArea2 = ((z10) f7Var.T0.get(i16)).M;
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
            v6 v6Var = new v6(this, i10);
            boolean z12 = org.telegram.messenger.r2.a;
            this.x = ConnectionsManager.getInstance(i3).sendRequest(tL_stories_sendStory, v6Var, 64);
        }
        tL_inputMediaPhoto = null;
        z10 = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (f7Var.E()) {
            }
        }
        if (!h10.i(i3).q()) {
        }
        z11 = this.b;
        long j102 = this.K;
        if (z11) {
        }
        v6 v6Var2 = new v6(this, i10);
        boolean z122 = org.telegram.messenger.r2.a;
        this.x = ConnectionsManager.getInstance(i3).sendRequest(tL_stories_sendStory, v6Var2, 64);
    }

    public final void d() {
        gi.f7 f7Var = this.c;
        if (f7Var.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i3 = hp.C8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((f7Var.g || (f7Var.n && f7Var.t != null)) && !f7Var.j && f7Var.o0 == null) {
            c(null);
            return;
        }
        gi.r8 r8Var = this.c.E0;
        int i10 = 1;
        this.H = r8Var != null && r8Var.a == 1;
        hs.f(this.N.a).b(this, hs.U1);
        hs.f(this.N.a).b(this, hs.V1);
        hs.f(this.N.a).b(this, hs.W1);
        hs.f(this.N.a).b(this, hs.c2);
        hs.f(this.N.a).b(this, hs.a2);
        hs.f(this.N.a).b(this, hs.b2);
        boolean E = this.c.E();
        this.s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = gi.f7.x(this.N.a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.F = new zi(this.N.a, tL_message, null, false, false);
            this.c.s(new x6(this, i10));
        } else {
            File w10 = gi.f7.w(this.N.a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.i.c(new b0(16, this, w10));
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

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        z6 z6Var = this.N;
        int i11 = z6Var.a;
        if (i3 == hs.a2) {
            if (objArr[0] == this.F) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = hs.b2;
        int i13 = hs.A5;
        if (i3 == i12) {
            if (objArr[0] == this.F) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                hs.f(i11).k(i13, this.e, Float.valueOf(this.h));
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
        if (i3 == hs.c2) {
            if (objArr[0] == this.F) {
                if (!this.b) {
                    gi.f7 f7Var = this.c;
                    f7Var.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    f7Var.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.J = true;
                    this.I = true;
                    z6Var.w.d(f7Var);
                }
                b();
                return;
            }
            return;
        }
        if (i3 == hs.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i3 == hs.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            hs.e().k(hs.P4, 1, bd.M0(2131744462, null));
            b();
            return;
        }
        if (i3 == hs.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            hs.f(i11).k(i13, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        gi.f7 f7Var = this.c;
        f7Var.getClass();
        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(this.N.a);
        String str = this.e;
        boolean z10 = !f7Var.K;
        if (this.s) {
            b20 b20Var = this.G;
            r6 = Math.max(1, (int) (b20Var != null ? b20Var.q : 0L));
        }
        G.h0(str, false, z10, r6, f7Var.K ? 33554432 : 16777216, true);
    }
}
