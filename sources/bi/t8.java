package bi;

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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class t8 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject E;
    public VideoEditedInfo F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public MessageObject K;
    public TL_bots.botPreviewMedia L;
    public final /* synthetic */ u8 M;
    public final boolean b;
    public final di.o8 c;
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

    public t8(u8 u8Var, di.o8 o8Var) {
        this.M = u8Var;
        this.c = o8Var;
        this.b = o8Var.g;
        File file = o8Var.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z10 = o8Var.w;
        this.H = z10;
        this.I = z10;
        long j3 = o8Var.J0;
        if (j3 != 0) {
            this.J = j3;
            return;
        }
        if (o8Var.g) {
            this.J = o8Var.e;
            return;
        }
        TLRPC.InputPeer inputPeer = o8Var.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.J = UserConfig.getInstance(u8Var.a).clientUserId;
        } else {
            this.J = DialogObject.getPeerDialogId(inputPeer);
        }
    }

    public final void a() {
        boolean z10 = this.I;
        di.o8 o8Var = this.c;
        u8 u8Var = this.M;
        if (z10) {
            u8Var.w.b(o8Var);
            ((ArrayList) u8Var.b.f(this.J)).remove(this);
        }
        this.v = true;
        if (o8Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(u8Var.a).cancelFileUpload(this.e, false);
        if (this.w >= 0) {
            ConnectionsManager.getInstance(u8Var.a).cancelRequest(this.w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ci.y yVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ci.y yVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        u8 u8Var = this.M;
        int i10 = u8Var.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j3 = this.J;
        if (!z10 && (arrayList = (ArrayList) u8Var.b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) u8Var.c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                u8Var.d = 0;
            } else {
                u8Var.d++;
            }
        }
        boolean z11 = this.b;
        di.o8 o8Var = this.c;
        if (z11 && (hashMap = (HashMap) u8Var.e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(o8Var.f));
        }
        if (this.L != null) {
            l8 A = u8Var.A(this.J, 4, -1, false);
            if (o8Var == null || !o8Var.g) {
                if (A instanceof b8) {
                    ((b8) A).I(this.L);
                }
                String str = o8Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = ci.y.F;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    b8 b8Var = (b8) longSparseArray2.get(j3);
                    int i11 = b8Var.c;
                    ArrayList arrayList3 = b8Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(b8Var.E, str)) {
                            b8Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            g8 g8Var = b8Var.q;
                            AndroidUtilities.cancelRunOnUIThread(g8Var);
                            AndroidUtilities.runOnUIThread(g8Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ci.y.E;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i10)) != null && (yVar = (ci.y) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList4 = yVar.f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        b8 b8Var2 = (b8) arrayList4.get(i12);
                        if (b8Var2.c == i10 && TextUtils.equals(b8Var2.E, str)) {
                            b8Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof b8) {
                    ((b8) A).G(o8Var.L0, this.L);
                }
                String str2 = o8Var.K0;
                TLRPC.InputMedia inputMedia = o8Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = ci.y.F;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    b8 b8Var3 = (b8) longSparseArray4.get(j3);
                    int i13 = b8Var3.c;
                    ArrayList arrayList5 = b8Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(b8Var3.E, str2)) {
                            b8Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            g8 g8Var2 = b8Var3.q;
                            AndroidUtilities.cancelRunOnUIThread(g8Var2);
                            AndroidUtilities.runOnUIThread(g8Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ci.y.E;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i10)) != null && (yVar2 = (ci.y) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList6 = yVar2.f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        b8 b8Var4 = (b8) arrayList6.get(i14);
                        if (b8Var4.c == i10 && TextUtils.equals(b8Var4.E, str2)) {
                            b8Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (o8Var != null && !o8Var.h && !this.d) {
            o8Var.i(false);
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
        p8 p8Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int i11 = this.M.a;
        if (this.v) {
            return;
        }
        di.o8 o8Var = this.c;
        o8Var.getClass();
        ArrayList arrayList2 = o8Var.F0;
        if (o8Var.n && !o8Var.j && (messageMedia = o8Var.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = o8Var.t;
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
                TLRPC.Photo photo = o8Var.t.photo;
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
                if (o8Var.E()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    List list = o8Var.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (list != null) {
                        if (list.isEmpty()) {
                            ArrayList arrayList3 = o8Var.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList3 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList4 = o8Var.V0;
                        if (arrayList4 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList4);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(o8Var.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (o8Var.c0 != null) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= o8Var.c0.attributes.size()) {
                                break;
                            }
                            if (o8Var.c0.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) o8Var.c0.attributes.get(i12);
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
                    if (o8Var.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i13 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (o8Var.Z * o8Var.h0)) / 1000.0d;
                    }
                    List list2 = o8Var.U0;
                    if (list2 != null && (!list2.isEmpty() || ((arrayList = o8Var.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList5 = new ArrayList<>(o8Var.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList5;
                        ArrayList arrayList6 = o8Var.V0;
                        if (arrayList6 != null) {
                            arrayList5.addAll(arrayList6);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = o8Var.y == null && (o8Var.Y || !o8Var.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int i14 = !UserConfig.getInstance(i11).isPremium() ? MessagesController.getInstance(i11).storyCaptionLengthLimitPremium : MessagesController.getInstance(i11).storyCaptionLengthLimitDefault;
            long j3 = this.J;
            z11 = this.b;
            if (z11) {
                if (o8Var.J0 != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(o8Var.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = o8Var.K0;
                    tL_stories_sendStory = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                    boolean z12 = z10;
                    tL_stories_sendStory2.random_id = this.a;
                    tL_stories_sendStory2.peer = MessagesController.getInstance(i11).getInputPeer(j3);
                    tL_stories_sendStory2.media = inputMedia;
                    tL_stories_sendStory2.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory2.pinned = o8Var.G0;
                    tL_stories_sendStory2.noforwards = !o8Var.H0;
                    tL_stories_sendStory2.albums = o8Var.w0 != null ? new ArrayList<>(o8Var.w0) : null;
                    TLRPC.InputDocument inputDocument = o8Var.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory2.flags |= 512;
                        tL_stories_sendStory2.music = inputDocument;
                    }
                    CharSequence charSequence3 = o8Var.C0;
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
                    if (o8Var.n) {
                        tL_stories_sendStory2.flags |= 64;
                        tL_stories_sendStory2.fwd_from_id = MessagesController.getInstance(i11).getInputPeer(o8Var.q);
                        tL_stories_sendStory2.fwd_from_story = o8Var.r;
                        tL_stories_sendStory2.fwd_modified = !z12;
                    }
                    int i15 = o8Var.I0;
                    if (i15 == Integer.MAX_VALUE) {
                        tL_stories_sendStory2.pinned = true;
                    } else {
                        tL_stories_sendStory2.flags |= 8;
                        tL_stories_sendStory2.period = i15;
                    }
                    if (o8Var.T0 != null) {
                        while (i10 < o8Var.T0.size()) {
                            TL_stories.MediaArea mediaArea = ((VideoEditedInfo.MediaEntity) o8Var.T0.get(i10)).mediaArea;
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
            } else if (o8Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(o8Var.J0);
                editpreviewmedia.media = o8Var.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = o8Var.K0;
                tL_stories_sendStory = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = o8Var.f;
                tL_stories_editStory.peer = MessagesController.getInstance(i11).getInputPeer(j3);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = o8Var.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && o8Var.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (o8Var.k && (charSequence2 = o8Var.C0) != null) {
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
                if (o8Var.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList7 = o8Var.m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (o8Var.T0 != null) {
                    for (int i16 = 0; i16 < o8Var.T0.size(); i16++) {
                        TL_stories.MediaArea mediaArea2 = ((VideoEditedInfo.MediaEntity) o8Var.T0.get(i16)).mediaArea;
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
            p8Var = new p8(this, 0);
            if (BuildVars.DEBUG_PRIVATE_VERSION || z11 || (charSequence = o8Var.C0) == null || !charSequence.toString().contains("#failtest") || this.H) {
                this.w = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_sendStory, p8Var, 64);
            }
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "FORCED_TO_FAIL";
            p8Var.run(null, tL_error);
            return;
        }
        tL_inputMediaPhoto = null;
        z10 = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (o8Var.E()) {
            }
        }
        if (!UserConfig.getInstance(i11).isPremium()) {
        }
        long j32 = this.J;
        z11 = this.b;
        if (z11) {
        }
        p8Var = new p8(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        this.w = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_sendStory, p8Var, 64);
    }

    public final void d() {
        di.o8 o8Var = this.c;
        if (o8Var.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.c.c0);
            c(tL_inputFileStoryDocument);
        } else if ((o8Var.g || (o8Var.n && o8Var.t != null)) && !o8Var.j && o8Var.o0 == null) {
            c(null);
            return;
        }
        di.ga gaVar = this.c.E0;
        this.G = gaVar != null && gaVar.a == 1;
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.c.E();
        this.s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = di.o8.x(this.M.a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new MessageObject(this.M.a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.c.s(new r8(this, 1));
        } else {
            File w10 = di.o8.w(this.M.a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new s8(0, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.E) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        u8 u8Var = this.M;
        if (i10 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(u8Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.x < 0 && this.n * this.y >= 1000.0f) {
                    this.x = longValue;
                }
                FileLoader.getInstance(u8Var.a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.x >= 0) {
                    return;
                }
                this.x = longValue2;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.b) {
                    di.o8 o8Var = this.c;
                    o8Var.w = true;
                    o8Var.x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = o8Var.x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    u8Var.w.d(o8Var);
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
            NotificationCenter.getInstance(u8Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        di.o8 o8Var = this.c;
        o8Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.a);
        String str = this.e;
        boolean z10 = !o8Var.K;
        if (this.s) {
            VideoEditedInfo videoEditedInfo = this.F;
            r6 = Math.max(1, (int) (videoEditedInfo != null ? videoEditedInfo.estimatedSize : 0L));
        }
        fileLoader.uploadFile(str, false, z10, r6, o8Var.K ? 33554432 : 16777216, true);
    }
}
