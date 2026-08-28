package ih;

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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class u6 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject A;
    public VideoEditedInfo B;
    public boolean C;
    public boolean D;
    public boolean E;
    public final long F;
    public MessageObject G;
    public TL_bots.botPreviewMedia H;
    public final /* synthetic */ v6 I;
    public final boolean b;
    public final kh.a8 c;
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

    public u6(v6 v6Var, kh.a8 a8Var) {
        this.I = v6Var;
        this.c = a8Var;
        this.b = a8Var.g;
        File file = a8Var.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z10 = a8Var.w;
        this.D = z10;
        this.E = z10;
        long j10 = a8Var.J0;
        if (j10 != 0) {
            this.F = j10;
            return;
        }
        if (a8Var.g) {
            this.F = a8Var.e;
            return;
        }
        TLRPC.InputPeer inputPeer = a8Var.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.F = UserConfig.getInstance(v6Var.a).clientUserId;
        } else {
            this.F = DialogObject.getPeerDialogId(inputPeer);
        }
    }

    public final void a() {
        boolean z10 = this.E;
        kh.a8 a8Var = this.c;
        v6 v6Var = this.I;
        if (z10) {
            v6Var.w.c(a8Var);
            ((ArrayList) v6Var.b.f(this.F)).remove(this);
        }
        this.v = true;
        if (a8Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.A);
        }
        FileLoader.getInstance(v6Var.a).cancelFileUpload(this.e, false);
        if (this.w >= 0) {
            ConnectionsManager.getInstance(v6Var.a).cancelRequest(this.w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        jh.u uVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        jh.u uVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        v6 v6Var = this.I;
        int i9 = v6Var.a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.E;
        long j10 = this.F;
        if (!z10 && (arrayList = (ArrayList) v6Var.b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) v6Var.c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                v6Var.d = 0;
            } else {
                v6Var.d++;
            }
        }
        boolean z11 = this.b;
        kh.a8 a8Var = this.c;
        if (z11 && (hashMap = (HashMap) v6Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(a8Var.f));
        }
        if (this.H != null) {
            n6 A = v6Var.A(this.F, 4, -1, false);
            if (a8Var == null || !a8Var.g) {
                if (A instanceof f6) {
                    ((f6) A).I(this.H);
                }
                String str = a8Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.H;
                LongSparseArray longSparseArray5 = jh.u.B;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i9)) != null) {
                    f6 f6Var = (f6) longSparseArray2.get(j10);
                    int i10 = f6Var.c;
                    ArrayList arrayList3 = f6Var.G;
                    if (i10 == i9) {
                        if (TextUtils.equals(f6Var.E, str)) {
                            f6Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            k6 k6Var = f6Var.q;
                            AndroidUtilities.cancelRunOnUIThread(k6Var);
                            AndroidUtilities.runOnUIThread(k6Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = jh.u.A;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i9)) != null && (uVar = (jh.u) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList4 = uVar.f;
                    for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                        f6 f6Var2 = (f6) arrayList4.get(i11);
                        if (f6Var2.c == i9 && TextUtils.equals(f6Var2.E, str)) {
                            f6Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof f6) {
                    ((f6) A).G(a8Var.L0, this.H);
                }
                String str2 = a8Var.K0;
                TLRPC.InputMedia inputMedia = a8Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.H;
                LongSparseArray longSparseArray7 = jh.u.B;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i9)) != null) {
                    f6 f6Var3 = (f6) longSparseArray4.get(j10);
                    int i12 = f6Var3.c;
                    ArrayList arrayList5 = f6Var3.G;
                    if (i12 == i9) {
                        if (TextUtils.equals(f6Var3.E, str2)) {
                            f6Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            k6 k6Var2 = f6Var3.q;
                            AndroidUtilities.cancelRunOnUIThread(k6Var2);
                            AndroidUtilities.runOnUIThread(k6Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = jh.u.A;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i9)) != null && (uVar2 = (jh.u) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList6 = uVar2.f;
                    for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                        f6 f6Var4 = (f6) arrayList6.get(i13);
                        if (f6Var4.c == i9 && TextUtils.equals(f6Var4.E, str2)) {
                            f6Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.H = null;
        }
        NotificationCenter.getInstance(i9).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (a8Var != null && !a8Var.h && !this.d) {
            a8Var.i(false);
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
        int i9;
        TL_stories.TL_stories_sendStory tL_stories_sendStory;
        r6 r6Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int i10 = this.I.a;
        if (this.v) {
            return;
        }
        kh.a8 a8Var = this.c;
        a8Var.getClass();
        ArrayList arrayList2 = a8Var.F0;
        if (a8Var.n && !a8Var.j && (messageMedia = a8Var.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = a8Var.t;
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
                TLRPC.Photo photo = a8Var.t.photo;
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
                if (a8Var.E()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    List list = a8Var.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (list != null) {
                        if (list.isEmpty()) {
                            ArrayList arrayList3 = a8Var.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList3 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList4 = a8Var.V0;
                        if (arrayList4 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList4);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(a8Var.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (a8Var.c0 != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= a8Var.c0.attributes.size()) {
                                break;
                            }
                            if (a8Var.c0.attributes.get(i11) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) a8Var.c0.attributes.get(i11);
                                break;
                            }
                            i11++;
                        }
                    } else {
                        SendMessagesHelper.fillVideoAttribute(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i12 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i12 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.x;
                    if (a8Var.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i12 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (a8Var.Z * a8Var.h0)) / 1000.0d;
                    }
                    List list2 = a8Var.U0;
                    if (list2 != null && (!list2.isEmpty() || ((arrayList = a8Var.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList5 = new ArrayList<>(a8Var.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList5;
                        ArrayList arrayList6 = a8Var.V0;
                        if (arrayList6 != null) {
                            arrayList5.addAll(arrayList6);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = a8Var.y == null && (a8Var.Y || !a8Var.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int i13 = !UserConfig.getInstance(i10).isPremium() ? MessagesController.getInstance(i10).storyCaptionLengthLimitPremium : MessagesController.getInstance(i10).storyCaptionLengthLimitDefault;
            long j10 = this.F;
            z11 = this.b;
            if (z11) {
                if (a8Var.J0 != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = MessagesController.getInstance(i10).getInputUser(a8Var.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = a8Var.K0;
                    tL_stories_sendStory = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                    boolean z12 = z10;
                    tL_stories_sendStory2.random_id = this.a;
                    tL_stories_sendStory2.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    tL_stories_sendStory2.media = inputMedia;
                    tL_stories_sendStory2.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory2.pinned = a8Var.G0;
                    tL_stories_sendStory2.noforwards = !a8Var.H0;
                    tL_stories_sendStory2.albums = a8Var.w0 != null ? new ArrayList<>(a8Var.w0) : null;
                    TLRPC.InputDocument inputDocument = a8Var.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory2.flags |= 512;
                        tL_stories_sendStory2.music = inputDocument;
                    }
                    CharSequence charSequence3 = a8Var.C0;
                    if (charSequence3 != null) {
                        tL_stories_sendStory2.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence3};
                        if (charSequence3.length() > i13) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i13);
                        }
                        if (MessagesController.getInstance(i10).storyEntitiesAllowed()) {
                            tL_stories_sendStory2.entities = MediaDataController.getInstance(i10).getEntities(charSequenceArr, true);
                        } else {
                            tL_stories_sendStory2.entities.clear();
                        }
                        i9 = 0;
                        if (charSequenceArr[0].length() > i13) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i13);
                        }
                        tL_stories_sendStory2.caption = charSequenceArr[0].toString();
                    } else {
                        i9 = 0;
                    }
                    if (a8Var.n) {
                        tL_stories_sendStory2.flags |= 64;
                        tL_stories_sendStory2.fwd_from_id = MessagesController.getInstance(i10).getInputPeer(a8Var.q);
                        tL_stories_sendStory2.fwd_from_story = a8Var.r;
                        tL_stories_sendStory2.fwd_modified = !z12;
                    }
                    int i14 = a8Var.I0;
                    if (i14 == Integer.MAX_VALUE) {
                        tL_stories_sendStory2.pinned = true;
                    } else {
                        tL_stories_sendStory2.flags |= 8;
                        tL_stories_sendStory2.period = i14;
                    }
                    if (a8Var.T0 != null) {
                        while (i9 < a8Var.T0.size()) {
                            TL_stories.MediaArea mediaArea = ((VideoEditedInfo.MediaEntity) a8Var.T0.get(i9)).mediaArea;
                            if (mediaArea != null) {
                                tL_stories_sendStory2.media_areas.add(mediaArea);
                            }
                            i9++;
                        }
                        if (!tL_stories_sendStory2.media_areas.isEmpty()) {
                            tL_stories_sendStory2.flags |= 32;
                        }
                    }
                    tL_stories_sendStory = tL_stories_sendStory2;
                }
            } else if (a8Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = MessagesController.getInstance(i10).getInputUser(a8Var.J0);
                editpreviewmedia.media = a8Var.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = a8Var.K0;
                tL_stories_sendStory = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = a8Var.f;
                tL_stories_editStory.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = a8Var.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && a8Var.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (a8Var.k && (charSequence2 = a8Var.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence2};
                    if (charSequence2.length() > i13) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i13);
                    }
                    if (MessagesController.getInstance(i10).storyEntitiesAllowed()) {
                        tL_stories_editStory.entities = MediaDataController.getInstance(i10).getEntities(charSequenceArr2, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > i13) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i13);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (a8Var.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList7 = a8Var.m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (a8Var.T0 != null) {
                    for (int i15 = 0; i15 < a8Var.T0.size(); i15++) {
                        TL_stories.MediaArea mediaArea2 = ((VideoEditedInfo.MediaEntity) a8Var.T0.get(i15)).mediaArea;
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
            r6Var = new r6(this, 0);
            if (BuildVars.DEBUG_PRIVATE_VERSION || z11 || (charSequence = a8Var.C0) == null || !charSequence.toString().contains("#failtest") || this.D) {
                this.w = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_sendStory, r6Var, 64);
            }
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "FORCED_TO_FAIL";
            r6Var.run(null, tL_error);
            return;
        }
        tL_inputMediaPhoto = null;
        z10 = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (a8Var.E()) {
            }
        }
        if (!UserConfig.getInstance(i10).isPremium()) {
        }
        long j102 = this.F;
        z11 = this.b;
        if (z11) {
        }
        r6Var = new r6(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        this.w = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_sendStory, r6Var, 64);
    }

    public final void d() {
        kh.a8 a8Var = this.c;
        if (a8Var.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.c.c0);
            c(tL_inputFileStoryDocument);
        } else if ((a8Var.g || (a8Var.n && a8Var.t != null)) && !a8Var.j && a8Var.o0 == null) {
            c(null);
            return;
        }
        kh.r9 r9Var = this.c.E0;
        this.C = r9Var != null && r9Var.a == 1;
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
            String absolutePath = kh.a8.x(this.I.a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.A = new MessageObject(this.I.a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.c.s(new t6(this, 1));
        } else {
            File w8 = kh.a8.w(this.I.a, "jpg");
            this.e = w8.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new h3.g0(23, this, w8));
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.A) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i11 = NotificationCenter.fileNewChunkAvailable;
        v6 v6Var = this.I;
        if (i9 == i11) {
            if (objArr[0] == this.A) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(v6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.x < 0 && this.n * this.y >= 1000.0f) {
                    this.x = longValue;
                }
                FileLoader.getInstance(v6Var.a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.x >= 0) {
                    return;
                }
                this.x = longValue2;
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.A) {
                if (!this.b) {
                    kh.a8 a8Var = this.c;
                    a8Var.w = true;
                    a8Var.x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = a8Var.x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.E = true;
                    this.D = true;
                    v6Var.w.d(a8Var);
                }
                b();
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i9 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
            b();
            return;
        }
        if (i9 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            NotificationCenter.getInstance(v6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        kh.a8 a8Var = this.c;
        a8Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.I.a);
        String str = this.e;
        boolean z10 = !a8Var.K;
        if (this.s) {
            VideoEditedInfo videoEditedInfo = this.B;
            r6 = Math.max(1, (int) (videoEditedInfo != null ? videoEditedInfo.estimatedSize : 0L));
        }
        fileLoader.uploadFile(str, false, z10, r6, a8Var.K ? 33554432 : 16777216, true);
    }
}
