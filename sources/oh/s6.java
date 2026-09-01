package oh;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class s6 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject B;
    public VideoEditedInfo C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final long G;
    public MessageObject H;
    public TL_bots.botPreviewMedia I;
    public final /* synthetic */ t6 J;
    public final boolean b;
    public final qh.s6 c;
    public boolean d;
    public String e;
    public final String f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public boolean v;
    public int w;
    public long y;
    public long x = -1;
    public final long a = Utilities.random.nextLong();

    public s6(t6 t6Var, qh.s6 s6Var) {
        this.J = t6Var;
        this.c = s6Var;
        this.b = s6Var.g;
        File file = s6Var.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z4 = s6Var.w;
        this.E = z4;
        this.F = z4;
        long j10 = s6Var.J0;
        if (j10 != 0) {
            this.G = j10;
            return;
        }
        if (s6Var.g) {
            this.G = s6Var.e;
            return;
        }
        TLRPC.InputPeer inputPeer = s6Var.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.G = UserConfig.getInstance(t6Var.a).clientUserId;
        } else {
            this.G = DialogObject.getPeerDialogId(inputPeer);
        }
    }

    public final void a() {
        boolean z4 = this.F;
        qh.s6 s6Var = this.c;
        t6 t6Var = this.J;
        if (z4) {
            t6Var.w.c(s6Var);
            ((ArrayList) t6Var.b.f(this.G)).remove(this);
        }
        this.v = true;
        if (s6Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.B);
        }
        FileLoader.getInstance(t6Var.a).cancelFileUpload(this.e, false);
        if (this.w >= 0) {
            ConnectionsManager.getInstance(t6Var.a).cancelRequest(this.w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ph.p pVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ph.p pVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        t6 t6Var = this.J;
        int i10 = t6Var.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z4 = this.F;
        long j10 = this.G;
        if (!z4 && (arrayList = (ArrayList) t6Var.b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) t6Var.c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                t6Var.d = 0;
            } else {
                t6Var.d++;
            }
        }
        boolean z10 = this.b;
        qh.s6 s6Var = this.c;
        if (z10 && (hashMap = (HashMap) t6Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(s6Var.f));
        }
        if (this.I != null) {
            l6 A = t6Var.A(this.G, 4, -1, false);
            if (s6Var == null || !s6Var.g) {
                if (A instanceof d6) {
                    ((d6) A).I(this.I);
                }
                String str = s6Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.I;
                LongSparseArray longSparseArray5 = ph.p.C;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    d6 d6Var = (d6) longSparseArray2.get(j10);
                    int i11 = d6Var.c;
                    ArrayList arrayList3 = d6Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(d6Var.E, str)) {
                            d6Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            i6 i6Var = d6Var.q;
                            AndroidUtilities.cancelRunOnUIThread(i6Var);
                            AndroidUtilities.runOnUIThread(i6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ph.p.B;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i10)) != null && (pVar = (ph.p) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList4 = pVar.f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        d6 d6Var2 = (d6) arrayList4.get(i12);
                        if (d6Var2.c == i10 && TextUtils.equals(d6Var2.E, str)) {
                            d6Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof d6) {
                    ((d6) A).G(s6Var.L0, this.I);
                }
                String str2 = s6Var.K0;
                TLRPC.InputMedia inputMedia = s6Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.I;
                LongSparseArray longSparseArray7 = ph.p.C;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    d6 d6Var3 = (d6) longSparseArray4.get(j10);
                    int i13 = d6Var3.c;
                    ArrayList arrayList5 = d6Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(d6Var3.E, str2)) {
                            d6Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            i6 i6Var2 = d6Var3.q;
                            AndroidUtilities.cancelRunOnUIThread(i6Var2);
                            AndroidUtilities.runOnUIThread(i6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ph.p.B;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i10)) != null && (pVar2 = (ph.p) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList6 = pVar2.f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        d6 d6Var4 = (d6) arrayList6.get(i14);
                        if (d6Var4.c == i10 && TextUtils.equals(d6Var4.E, str2)) {
                            d6Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.I = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (s6Var != null && !s6Var.h && !this.d) {
            s6Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        if (r1.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.InputFile inputFile) {
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
        boolean z4;
        boolean z10;
        int i10;
        TL_stories.TL_stories_sendStory tL_stories_sendStory;
        p6 p6Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int i11 = this.J.a;
        if (this.v) {
            return;
        }
        qh.s6 s6Var = this.c;
        s6Var.getClass();
        ArrayList arrayList2 = s6Var.F0;
        if (s6Var.n && !s6Var.j && (messageMedia = s6Var.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = s6Var.t;
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
                TLRPC.Photo photo = s6Var.t.photo;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto3.id = tL_inputPhoto;
                tL_inputMediaPhoto2 = tL_inputMediaPhoto3;
            }
            z4 = true;
            tL_inputMediaPhoto = tL_inputMediaPhoto2;
            TLRPC.InputMedia inputMedia = tL_inputMediaPhoto;
            inputMedia = tL_inputMediaPhoto;
            if (tL_inputMediaPhoto == null && inputFile != null) {
                if (s6Var.E()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    List list = s6Var.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (list != null) {
                        if (list.isEmpty()) {
                            ArrayList arrayList3 = s6Var.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList3 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList4 = s6Var.V0;
                        if (arrayList4 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList4);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(s6Var.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (s6Var.c0 != null) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= s6Var.c0.attributes.size()) {
                                break;
                            }
                            if (s6Var.c0.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) s6Var.c0.attributes.get(i12);
                                break;
                            }
                            i12++;
                        }
                    } else {
                        SendMessagesHelper.fillVideoAttribute(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i13 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i13 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.x;
                    if (s6Var.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i13 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (s6Var.Z * s6Var.h0)) / 1000.0d;
                    }
                    List list2 = s6Var.U0;
                    if (list2 != null && (!list2.isEmpty() || ((arrayList = s6Var.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList5 = new ArrayList<>(s6Var.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList5;
                        ArrayList arrayList6 = s6Var.V0;
                        if (arrayList6 != null) {
                            arrayList5.addAll(arrayList6);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = s6Var.y == null && (s6Var.Y || !s6Var.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int i14 = !UserConfig.getInstance(i11).isPremium() ? MessagesController.getInstance(i11).storyCaptionLengthLimitPremium : MessagesController.getInstance(i11).storyCaptionLengthLimitDefault;
            long j10 = this.G;
            z10 = this.b;
            if (z10) {
                if (s6Var.J0 != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(s6Var.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = s6Var.K0;
                    tL_stories_sendStory = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                    boolean z11 = z4;
                    tL_stories_sendStory2.random_id = this.a;
                    tL_stories_sendStory2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                    tL_stories_sendStory2.media = inputMedia;
                    tL_stories_sendStory2.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory2.pinned = s6Var.G0;
                    tL_stories_sendStory2.noforwards = !s6Var.H0;
                    tL_stories_sendStory2.albums = s6Var.w0 != null ? new ArrayList<>(s6Var.w0) : null;
                    TLRPC.InputDocument inputDocument = s6Var.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory2.flags |= 512;
                        tL_stories_sendStory2.music = inputDocument;
                    }
                    CharSequence charSequence3 = s6Var.C0;
                    if (charSequence3 != null) {
                        tL_stories_sendStory2.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence3};
                        if (charSequence3.length() > i14) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i14);
                        }
                        if (MessagesController.getInstance(i11).storyEntitiesAllowed()) {
                            tL_stories_sendStory2.entities = MediaDataController.getInstance(i11).getEntities(charSequenceArr, true);
                        } else {
                            tL_stories_sendStory2.entities.clear();
                        }
                        i10 = 0;
                        if (charSequenceArr[0].length() > i14) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i14);
                        }
                        tL_stories_sendStory2.caption = charSequenceArr[0].toString();
                    } else {
                        i10 = 0;
                    }
                    if (s6Var.n) {
                        tL_stories_sendStory2.flags |= 64;
                        tL_stories_sendStory2.fwd_from_id = MessagesController.getInstance(i11).getInputPeer(s6Var.q);
                        tL_stories_sendStory2.fwd_from_story = s6Var.r;
                        tL_stories_sendStory2.fwd_modified = !z11;
                    }
                    int i15 = s6Var.I0;
                    if (i15 == Integer.MAX_VALUE) {
                        tL_stories_sendStory2.pinned = true;
                    } else {
                        tL_stories_sendStory2.flags |= 8;
                        tL_stories_sendStory2.period = i15;
                    }
                    if (s6Var.T0 != null) {
                        while (i10 < s6Var.T0.size()) {
                            TL_stories.MediaArea mediaArea = ((VideoEditedInfo.MediaEntity) s6Var.T0.get(i10)).mediaArea;
                            if (mediaArea != null) {
                                tL_stories_sendStory2.media_areas.add(mediaArea);
                            }
                            i10++;
                        }
                        if (!tL_stories_sendStory2.media_areas.isEmpty()) {
                            tL_stories_sendStory2.flags |= 32;
                        }
                    }
                    tL_stories_sendStory = tL_stories_sendStory2;
                }
            } else if (s6Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(s6Var.J0);
                editpreviewmedia.media = s6Var.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = s6Var.K0;
                tL_stories_sendStory = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = s6Var.f;
                tL_stories_editStory.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = s6Var.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && s6Var.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (s6Var.k && (charSequence2 = s6Var.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence2};
                    if (charSequence2.length() > i14) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i14);
                    }
                    if (MessagesController.getInstance(i11).storyEntitiesAllowed()) {
                        tL_stories_editStory.entities = MediaDataController.getInstance(i11).getEntities(charSequenceArr2, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > i14) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i14);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (s6Var.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList7 = s6Var.m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (s6Var.T0 != null) {
                    for (int i16 = 0; i16 < s6Var.T0.size(); i16++) {
                        TL_stories.MediaArea mediaArea2 = ((VideoEditedInfo.MediaEntity) s6Var.T0.get(i16)).mediaArea;
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
            p6Var = new p6(this, 0);
            if (BuildVars.DEBUG_PRIVATE_VERSION || z10 || (charSequence = s6Var.C0) == null || !charSequence.toString().contains("#failtest") || this.E) {
                this.w = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_sendStory, p6Var, 64);
            }
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "FORCED_TO_FAIL";
            p6Var.run(null, tL_error);
            return;
        }
        tL_inputMediaPhoto = null;
        z4 = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (s6Var.E()) {
            }
        }
        if (!UserConfig.getInstance(i11).isPremium()) {
        }
        long j102 = this.G;
        z10 = this.b;
        if (z10) {
        }
        p6Var = new p6(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        this.w = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_sendStory, p6Var, 64);
    }

    public final void d() {
        qh.s6 s6Var = this.c;
        if (s6Var.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.c.c0);
            c(tL_inputFileStoryDocument);
        } else if ((s6Var.g || (s6Var.n && s6Var.t != null)) && !s6Var.j && s6Var.o0 == null) {
            c(null);
            return;
        }
        qh.b8 b8Var = this.c.E0;
        this.D = b8Var != null && b8Var.a == 1;
        NotificationCenter.getInstance(this.J.a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.J.a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.J.a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.J.a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.J.a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.J.a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.c.E();
        this.s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = qh.s6.x(this.J.a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.B = new MessageObject(this.J.a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.c.s(new r6(this, 1));
        } else {
            File w10 = qh.s6.w(this.J.a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new z1(11, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.J.a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.B) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        t6 t6Var = this.J;
        if (i10 == i12) {
            if (objArr[0] == this.B) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(t6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.x < 0 && this.n * this.y >= 1000.0f) {
                    this.x = longValue;
                }
                FileLoader.getInstance(t6Var.a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.x >= 0) {
                    return;
                }
                this.x = longValue2;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.B) {
                if (!this.b) {
                    qh.s6 s6Var = this.c;
                    s6Var.w = true;
                    s6Var.x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = s6Var.x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.F = true;
                    this.E = true;
                    t6Var.w.d(s6Var);
                }
                b();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
            b();
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            NotificationCenter.getInstance(t6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        qh.s6 s6Var = this.c;
        s6Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.J.a);
        String str = this.e;
        boolean z4 = !s6Var.K;
        if (this.s) {
            VideoEditedInfo videoEditedInfo = this.C;
            r6 = Math.max(1, (int) (videoEditedInfo != null ? videoEditedInfo.estimatedSize : 0L));
        }
        fileLoader.uploadFile(str, false, z4, r6, s6Var.K ? 33554432 : 16777216, true);
    }
}
