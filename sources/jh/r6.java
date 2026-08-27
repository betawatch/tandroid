package jh;

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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class r6 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject A;
    public VideoEditedInfo B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final long F;
    public MessageObject G;
    public TL_bots.botPreviewMedia H;
    public final /* synthetic */ s6 I;
    public final boolean b;
    public final lh.z7 c;
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

    public r6(s6 s6Var, lh.z7 z7Var) {
        this.I = s6Var;
        this.c = z7Var;
        this.b = z7Var.g;
        File file = z7Var.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z10 = z7Var.w;
        this.D = z10;
        this.E = z10;
        long j10 = z7Var.J0;
        if (j10 != 0) {
            this.F = j10;
            return;
        }
        if (z7Var.g) {
            this.F = z7Var.e;
            return;
        }
        TLRPC.InputPeer inputPeer = z7Var.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.F = UserConfig.getInstance(s6Var.a).clientUserId;
        } else {
            this.F = DialogObject.getPeerDialogId(inputPeer);
        }
    }

    public final void a() {
        boolean z10 = this.E;
        lh.z7 z7Var = this.c;
        s6 s6Var = this.I;
        if (z10) {
            s6Var.w.c(z7Var);
            ((ArrayList) s6Var.b.f(this.F)).remove(this);
        }
        this.v = true;
        if (z7Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.A);
        }
        FileLoader.getInstance(s6Var.a).cancelFileUpload(this.e, false);
        if (this.w >= 0) {
            ConnectionsManager.getInstance(s6Var.a).cancelRequest(this.w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        kh.v vVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        kh.v vVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        s6 s6Var = this.I;
        int i10 = s6Var.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.E;
        long j10 = this.F;
        if (!z10 && (arrayList = (ArrayList) s6Var.b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) s6Var.c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                s6Var.d = 0;
            } else {
                s6Var.d++;
            }
        }
        boolean z11 = this.b;
        lh.z7 z7Var = this.c;
        if (z11 && (hashMap = (HashMap) s6Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(z7Var.f));
        }
        if (this.H != null) {
            j6 A = s6Var.A(this.F, 4, -1, false);
            if (z7Var == null || !z7Var.g) {
                if (A instanceof b6) {
                    ((b6) A).I(this.H);
                }
                String str = z7Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.H;
                LongSparseArray longSparseArray5 = kh.v.B;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    b6 b6Var = (b6) longSparseArray2.get(j10);
                    int i11 = b6Var.c;
                    ArrayList arrayList3 = b6Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(b6Var.E, str)) {
                            b6Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            g6 g6Var = b6Var.q;
                            AndroidUtilities.cancelRunOnUIThread(g6Var);
                            AndroidUtilities.runOnUIThread(g6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = kh.v.A;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i10)) != null && (vVar = (kh.v) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList4 = vVar.f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        b6 b6Var2 = (b6) arrayList4.get(i12);
                        if (b6Var2.c == i10 && TextUtils.equals(b6Var2.E, str)) {
                            b6Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof b6) {
                    ((b6) A).G(z7Var.L0, this.H);
                }
                String str2 = z7Var.K0;
                TLRPC.InputMedia inputMedia = z7Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.H;
                LongSparseArray longSparseArray7 = kh.v.B;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    b6 b6Var3 = (b6) longSparseArray4.get(j10);
                    int i13 = b6Var3.c;
                    ArrayList arrayList5 = b6Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(b6Var3.E, str2)) {
                            b6Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            g6 g6Var2 = b6Var3.q;
                            AndroidUtilities.cancelRunOnUIThread(g6Var2);
                            AndroidUtilities.runOnUIThread(g6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = kh.v.A;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i10)) != null && (vVar2 = (kh.v) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList6 = vVar2.f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        b6 b6Var4 = (b6) arrayList6.get(i14);
                        if (b6Var4.c == i10 && TextUtils.equals(b6Var4.E, str2)) {
                            b6Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.H = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (z7Var != null && !z7Var.h && !this.d) {
            z7Var.i(false);
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
        boolean z10;
        boolean z11;
        int i10;
        TL_stories.TL_stories_sendStory tL_stories_sendStory;
        n6 n6Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int i11 = this.I.a;
        if (this.v) {
            return;
        }
        lh.z7 z7Var = this.c;
        z7Var.getClass();
        ArrayList arrayList2 = z7Var.F0;
        if (z7Var.n && !z7Var.j && (messageMedia = z7Var.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = z7Var.t;
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
                TLRPC.Photo photo = z7Var.t.photo;
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
                if (z7Var.E()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    List list = z7Var.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (list != null) {
                        if (list.isEmpty()) {
                            ArrayList arrayList3 = z7Var.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList3 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList4 = z7Var.V0;
                        if (arrayList4 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList4);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(z7Var.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (z7Var.c0 != null) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= z7Var.c0.attributes.size()) {
                                break;
                            }
                            if (z7Var.c0.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) z7Var.c0.attributes.get(i12);
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
                    if (z7Var.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i13 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (z7Var.Z * z7Var.h0)) / 1000.0d;
                    }
                    List list2 = z7Var.U0;
                    if (list2 != null && (!list2.isEmpty() || ((arrayList = z7Var.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList5 = new ArrayList<>(z7Var.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList5;
                        ArrayList arrayList6 = z7Var.V0;
                        if (arrayList6 != null) {
                            arrayList5.addAll(arrayList6);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = z7Var.y == null && (z7Var.Y || !z7Var.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int i14 = !UserConfig.getInstance(i11).isPremium() ? MessagesController.getInstance(i11).storyCaptionLengthLimitPremium : MessagesController.getInstance(i11).storyCaptionLengthLimitDefault;
            long j10 = this.F;
            z11 = this.b;
            if (z11) {
                if (z7Var.J0 != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(z7Var.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = z7Var.K0;
                    tL_stories_sendStory = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                    boolean z12 = z10;
                    tL_stories_sendStory2.random_id = this.a;
                    tL_stories_sendStory2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                    tL_stories_sendStory2.media = inputMedia;
                    tL_stories_sendStory2.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory2.pinned = z7Var.G0;
                    tL_stories_sendStory2.noforwards = !z7Var.H0;
                    tL_stories_sendStory2.albums = z7Var.w0 != null ? new ArrayList<>(z7Var.w0) : null;
                    TLRPC.InputDocument inputDocument = z7Var.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory2.flags |= 512;
                        tL_stories_sendStory2.music = inputDocument;
                    }
                    CharSequence charSequence3 = z7Var.C0;
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
                    if (z7Var.n) {
                        tL_stories_sendStory2.flags |= 64;
                        tL_stories_sendStory2.fwd_from_id = MessagesController.getInstance(i11).getInputPeer(z7Var.q);
                        tL_stories_sendStory2.fwd_from_story = z7Var.r;
                        tL_stories_sendStory2.fwd_modified = !z12;
                    }
                    int i15 = z7Var.I0;
                    if (i15 == Integer.MAX_VALUE) {
                        tL_stories_sendStory2.pinned = true;
                    } else {
                        tL_stories_sendStory2.flags |= 8;
                        tL_stories_sendStory2.period = i15;
                    }
                    if (z7Var.T0 != null) {
                        while (i10 < z7Var.T0.size()) {
                            TL_stories.MediaArea mediaArea = ((VideoEditedInfo.MediaEntity) z7Var.T0.get(i10)).mediaArea;
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
            } else if (z7Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(z7Var.J0);
                editpreviewmedia.media = z7Var.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = z7Var.K0;
                tL_stories_sendStory = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = z7Var.f;
                tL_stories_editStory.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = z7Var.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && z7Var.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (z7Var.k && (charSequence2 = z7Var.C0) != null) {
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
                if (z7Var.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList7 = z7Var.m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (z7Var.T0 != null) {
                    for (int i16 = 0; i16 < z7Var.T0.size(); i16++) {
                        TL_stories.MediaArea mediaArea2 = ((VideoEditedInfo.MediaEntity) z7Var.T0.get(i16)).mediaArea;
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
            n6Var = new n6(this, 0);
            if (BuildVars.DEBUG_PRIVATE_VERSION || z11 || (charSequence = z7Var.C0) == null || !charSequence.toString().contains("#failtest") || this.D) {
                this.w = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_sendStory, n6Var, 64);
            }
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "FORCED_TO_FAIL";
            n6Var.run(null, tL_error);
            return;
        }
        tL_inputMediaPhoto = null;
        z10 = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (z7Var.E()) {
            }
        }
        if (!UserConfig.getInstance(i11).isPremium()) {
        }
        long j102 = this.F;
        z11 = this.b;
        if (z11) {
        }
        n6Var = new n6(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        this.w = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_sendStory, n6Var, 64);
    }

    public final void d() {
        lh.z7 z7Var = this.c;
        if (z7Var.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.c.c0);
            c(tL_inputFileStoryDocument);
        } else if ((z7Var.g || (z7Var.n && z7Var.t != null)) && !z7Var.j && z7Var.o0 == null) {
            c(null);
            return;
        }
        lh.o9 o9Var = this.c.E0;
        this.C = o9Var != null && o9Var.a == 1;
        NotificationCenter.getInstance(this.I.a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.I.a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.I.a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.I.a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.I.a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.I.a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.c.E();
        this.s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = lh.z7.x(this.I.a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.A = new MessageObject(this.I.a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.c.s(new q6(this, 1));
        } else {
            File w10 = lh.z7.w(this.I.a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new p6(2, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.I.a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.A) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        s6 s6Var = this.I;
        if (i10 == i12) {
            if (objArr[0] == this.A) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(s6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.x < 0 && this.n * this.y >= 1000.0f) {
                    this.x = longValue;
                }
                FileLoader.getInstance(s6Var.a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.x >= 0) {
                    return;
                }
                this.x = longValue2;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.A) {
                if (!this.b) {
                    lh.z7 z7Var = this.c;
                    z7Var.w = true;
                    z7Var.x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = z7Var.x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.E = true;
                    this.D = true;
                    s6Var.w.d(z7Var);
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
            NotificationCenter.getInstance(s6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        lh.z7 z7Var = this.c;
        z7Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.I.a);
        String str = this.e;
        boolean z10 = !z7Var.K;
        if (this.s) {
            VideoEditedInfo videoEditedInfo = this.B;
            r6 = Math.max(1, (int) (videoEditedInfo != null ? videoEditedInfo.estimatedSize : 0L));
        }
        fileLoader.uploadFile(str, false, z10, r6, z7Var.K ? 33554432 : 16777216, true);
    }
}
