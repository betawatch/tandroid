package org.telegram.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class or0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.ActionBar.c6 a;
    public final /* synthetic */ PhotoViewer b;

    public or0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.c6 c6Var) {
        this.b = photoViewer;
        this.a = c6Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.P4 != null || photoViewer.X4 != null) {
            return true;
        }
        if (photoViewer.W4 == null) {
            return photoViewer.f7 != null;
        }
        FileLoader fileLoader = FileLoader.getInstance(photoViewer.P);
        ImageLocation imageLocation = photoViewer.W4;
        File pathToAttach = fileLoader.getPathToAttach(imageLocation == null ? null : imageLocation.location, PhotoViewer.q1(imageLocation), photoViewer.v5 != 0 || photoViewer.x5);
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.P);
        ImageLocation imageLocation2 = photoViewer.W4;
        return pathToAttach.exists() || file.exists() || fileLoader2.getPathToAttach(imageLocation2 != null ? imageLocation2.location : null, PhotoViewer.q1(imageLocation2), false).exists();
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x0407, code lost:
    
        if (com.google.android.recaptcha.internal.a.v(r0) != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x07fb, code lost:
    
        if (r14 == org.telegram.messenger.UserConfig.getInstance(r13).getClientUserId()) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x07ff, code lost:
    
        if (r9 == null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0801, code lost:
    
        r13 = r7.P;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x080b, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r13).canRevokePmInbox == false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x080d, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0810, code lost:
    
        r14 = r7.P4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0818, code lost:
    
        if (r14.messageOwner.action == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x081a, code lost:
    
        r14 = r7.P4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0824, code lost:
    
        if ((r14.messageOwner.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0826, code lost:
    
        r14 = r7.P4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x082e, code lost:
    
        if (r14.isOut() != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0830, code lost:
    
        if (r13 != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0836, code lost:
    
        if (org.telegram.messenger.ChatObject.hasAdminRights(r10) == false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0838, code lost:
    
        r13 = r7.P4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0841, code lost:
    
        if ((r11 - r13.messageOwner.date) > r12) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0843, code lost:
    
        r11 = r7.y;
        r14 = new android.widget.FrameLayout(r11);
        r11 = r7.y;
        r8 = new org.telegram.ui.Cells.y1(r11, 1, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.K0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0860, code lost:
    
        if (r10 == null) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0862, code lost:
    
        r2 = "Cancel";
        r11 = 0;
        r15 = null;
        r8.e(org.telegram.messenger.LocaleController.getString("DeleteForAll", org.telegram.messenger.R.string.DeleteForAll), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x089b, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x089d, code lost:
    
        r6 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x08a8, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x08aa, code lost:
    
        r9 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x08b3, code lost:
    
        r8.setPadding(r6, r11, r9, r11);
        r14.addView(r8, i7.f6.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.k8(5, r0));
        r3.n(r14);
        r3.a.C = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x08af, code lost:
    
        r9 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x08a2, code lost:
    
        r6 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0877, code lost:
    
        r2 = "Cancel";
        r15 = null;
        r11 = 0;
        r8.e(org.telegram.messenger.LocaleController.formatString("DeleteForUser", org.telegram.messenger.R.string.DeleteForUser, org.telegram.messenger.UserObject.getFirstName(r9)), "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x080f, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x07fd, code lost:
    
        if (r10 != null) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x06cf, code lost:
    
        if (r9 == r11) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x06df, code lost:
    
        if (r9.isVideo() != false) goto L323;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0778  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0dd2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:531:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0240  */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v18 */
    @Override // org.telegram.ui.ActionBar.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i10) {
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11;
        MessageObject messageObject3;
        int i12;
        Activity activity;
        Activity activity2;
        MessageObject messageObject4;
        MessageObject messageObject5;
        MessageObject messageObject6;
        tt0 tt0Var;
        tt0 tt0Var2;
        int i13;
        Activity activity3;
        MessageObject messageObject7;
        Activity activity4;
        MessageObject messageObject8;
        MessageObject messageObject9;
        MessageObject messageObject10;
        Activity activity5;
        MessageObject messageObject11;
        Activity activity6;
        MessageObject messageObject12;
        MessageObject messageObject13;
        MessageObject messageObject14;
        MessageObject messageObject15;
        TLObject tLObject;
        Activity activity7;
        MessageObject messageObject16;
        org.telegram.ui.Components.nx0 nx0Var;
        MessageObject messageObject17;
        ImageLocation imageLocation;
        ImageLocation imageLocation2;
        TLRPC.Photo photo;
        ImageLocation imageLocation3;
        ImageLocation imageLocation4;
        TLRPC.Photo photo2;
        int i14;
        Activity activity8;
        long j10;
        ImageLocation imageLocation5;
        ImageLocation imageLocation6;
        MessageObject messageObject18;
        int i15;
        int i16;
        ImageLocation imageLocation7;
        ImageLocation imageLocation8;
        ImageLocation imageLocation9;
        xt0 xt0Var;
        int i17;
        ImageLocation imageLocation10;
        ImageLocation imageLocation11;
        int i18;
        int i19;
        long j11;
        int i20;
        long j12;
        int i21;
        long j13;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        UndoView undoView;
        long j14;
        ImageLocation imageLocation12;
        ImageLocation imageLocation13;
        int i32;
        int i33;
        int i34;
        MessageObject messageObject19;
        tt0 tt0Var3;
        tt0 tt0Var4;
        int i35;
        int i36;
        int i37;
        tt0 tt0Var5;
        MessageObject messageObject20;
        tn tnVar;
        int i38;
        int i39;
        MessageObject messageObject21;
        tn tnVar2;
        tn tnVar3;
        MessageObject messageObject22;
        int i40;
        MessageObject messageObject23;
        org.telegram.ui.ActionBar.w0 w0Var;
        View findViewWithTag;
        org.telegram.ui.Components.mf0 mf0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        xt0 xt0Var2;
        MessageObject messageObject24;
        boolean z10;
        Activity activity10;
        xt0 xt0Var3;
        CharSequence a02;
        ImageLocation imageLocation14;
        MessageObject messageObject25;
        MessageObject messageObject26;
        MessageObject messageObject27;
        MessageObject messageObject28;
        ImageLocation imageLocation15;
        ImageLocation imageLocation16;
        MessageObject messageObject29;
        TextView textView;
        int z12;
        MessageObject messageObject30;
        MessageObject messageObject31;
        int i41;
        TLRPC.Chat chat;
        TLRPC.User user;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        MessageObject messageObject32;
        MessageObject messageObject33;
        int i48;
        Activity activity11;
        xt0 xt0Var4;
        xt0 xt0Var5;
        MessageObject messageObject34;
        Activity activity12;
        MessageObject messageObject35;
        boolean z11;
        Activity activity13;
        MessageObject messageObject36;
        ArrayList arrayList;
        tn tnVar4;
        String str;
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject37;
        MessageObject messageObject38;
        tn tnVar5;
        Activity activity14;
        boolean z13;
        Activity activity15;
        int z14;
        int z15;
        int z16;
        int z17;
        tn tnVar6;
        MessageObject messageObject39;
        MessageObject messageObject40;
        int i49;
        xt0 xt0Var6;
        MessageObject messageObject41;
        MessageObject messageObject42;
        MessageObject messageObject43;
        String str2;
        tn tnVar7;
        int i50;
        MessageObject messageObject44;
        MessageObject messageObject45;
        tn tnVar8;
        Activity activity16;
        Activity activity17;
        tn tnVar9;
        ze.g m12;
        org.telegram.ui.Components.r7 r7Var;
        tn tnVar10;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject46;
        Activity activity18;
        MessageObject messageObject47;
        String string;
        int z18;
        View d;
        int z19;
        int z110;
        int z111;
        MessageObject messageObject48;
        MessageObject messageObject49;
        MessageObject messageObject50;
        ImageLocation imageLocation17;
        tt0 tt0Var6;
        File file;
        ?? r14;
        tt0 tt0Var7;
        int i51;
        tt0 tt0Var8;
        int i52;
        boolean a2;
        ImageLocation imageLocation18;
        int i53;
        ImageLocation imageLocation19;
        long j15;
        boolean z20;
        File pathToAttach;
        int i54;
        ImageLocation imageLocation20;
        boolean z21;
        MessageObject messageObject51;
        boolean z22;
        Activity activity19;
        Activity activity20;
        MessageObject messageObject52;
        TLRPC.Document document;
        int i55;
        int i56;
        MessageObject messageObject53;
        MessageObject messageObject54;
        MessageObject messageObject55;
        int i57;
        MessageObject messageObject56;
        MessageObject messageObject57;
        MessageObject messageObject58;
        MessageObject messageObject59;
        int i58;
        TLObject p12;
        int i59;
        tn tnVar11;
        MessageObject messageObject60;
        Activity activity21;
        Activity activity22;
        boolean H1;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        boolean z23 = true;
        z23 = true;
        z23 = true;
        PhotoViewer photoViewer2 = this.b;
        if (i10 == -1) {
            ws0 ws0Var = photoViewer2.H1;
            if (ws0Var == null || !ws0Var.o0()) {
                H1 = photoViewer2.H1();
                if (H1) {
                    photoViewer2.E0(false);
                    return;
                } else {
                    photoViewer2.G0(true, false);
                    return;
                }
            }
            return;
        }
        int i60 = 28;
        File file2 = null;
        if (i10 == 2) {
            int i61 = Build.VERSION.SDK_INT;
            if (i61 >= 23 && (i61 <= 28 || BuildVars.NO_SCOPED_STORAGE)) {
                activity21 = photoViewer2.y;
                if (activity21.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    activity22 = photoViewer2.y;
                    activity22.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            final ArrayList arrayList2 = new ArrayList(1);
            tnVar10 = photoViewer2.h4;
            if (tnVar10 != null) {
                tnVar11 = photoViewer2.h4;
                messageObject60 = photoViewer2.P4;
                groupedMessages2 = tnVar11.y8(messageObject60.getGroupId());
            } else {
                groupedMessages2 = null;
            }
            if (groupedMessages2 != null) {
                arrayList2.addAll(groupedMessages2.messages);
            } else {
                messageObject46 = photoViewer2.P4;
                arrayList2.add(messageObject46);
            }
            if (arrayList2.size() > 1) {
                boolean z24 = false;
                boolean z25 = false;
                boolean z26 = false;
                for (int i62 = 0; i62 < arrayList2.size(); i62++) {
                    MessageObject messageObject61 = (MessageObject) arrayList2.get(i62);
                    if (messageObject61.isLivePhoto()) {
                        z26 = true;
                    } else if (messageObject61.isVideo()) {
                        z24 = true;
                    } else {
                        z25 = true;
                    }
                }
                activity18 = photoViewer2.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity18, c6Var);
                alertDialog$Builder.l(LocaleController.getString("SaveGroupMedia", R.string.SaveGroupMedia));
                alertDialog$Builder.g(LocaleController.getString("SaveGroupMediaMessage", R.string.SaveGroupMediaMessage));
                alertDialog$Builder.a.E = org.telegram.ui.ActionBar.g6.pg;
                messageObject47 = photoViewer2.P4;
                if (messageObject47 != null) {
                    messageObject48 = photoViewer2.P4;
                    if (messageObject48.isVideo()) {
                        messageObject49 = photoViewer2.P4;
                        if (!messageObject49.isLivePhoto()) {
                            string = LocaleController.getString("ThisMedia", R.string.ThisMedia);
                            final int i63 = true ? 1 : 0;
                            alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.gr0
                                public final /* synthetic */ or0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.b2
                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i64) {
                                    switch (i63) {
                                        case 0:
                                            or0 or0Var = this.b;
                                            or0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer3 = or0Var.b;
                                            arrayList3.add(photoViewer3.P4);
                                            PhotoViewer.C(photoViewer3, arrayList3);
                                            break;
                                        default:
                                            or0 or0Var2 = this.b;
                                            PhotoViewer photoViewer4 = or0Var2.b;
                                            MessageObject messageObject62 = photoViewer4.P4;
                                            if (messageObject62 != null) {
                                                File file3 = null;
                                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer4.P4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer4.P4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer4.P).getPathToAttach(photoViewer4.p1(photoViewer4.L4, null), true) : FileLoader.getInstance(photoViewer4.P).getPathToMessage(photoViewer4.P4.messageOwner);
                                                boolean isVideo = photoViewer4.P4.isVideo();
                                                boolean isLivePhoto = photoViewer4.P4.isLivePhoto();
                                                if (isLivePhoto) {
                                                    TLRPC.Document document2 = MessageObject.getMedia(photoViewer4.P4.messageOwner) != null ? MessageObject.getMedia(photoViewer4.P4.messageOwner).document : null;
                                                    if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer4.P).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                                        file3 = FileLoader.getInstance(photoViewer4.P).getPathToAttach(document2, true);
                                                    }
                                                }
                                                if (!isLivePhoto) {
                                                    if (pathToAttach2 != null && pathToAttach2.exists()) {
                                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new ir0(or0Var2, isVideo, 0));
                                                        break;
                                                    } else {
                                                        photoViewer4.U2();
                                                        break;
                                                    }
                                                } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer4.y, new fr0(or0Var2, 1));
                                                    break;
                                                } else {
                                                    photoViewer4.U2();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            String formatPluralString = (!z24 || z26) ? LocaleController.formatPluralString("AllNMedia", arrayList2.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList2.size(), new Object[0]);
                            final boolean z27 = z24;
                            final boolean z28 = z25;
                            final boolean z29 = z26;
                            alertDialog$Builder.k(formatPluralString, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.lr0
                                @Override // org.telegram.ui.ActionBar.b2
                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i64) {
                                    or0 or0Var = or0.this;
                                    PhotoViewer photoViewer3 = or0Var.b;
                                    int[] iArr = new int[1];
                                    final qq0 qq0Var = new qq0(or0Var, new int[1], iArr, z27, z28, z29);
                                    int i65 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i65 >= arrayList3.size()) {
                                            return;
                                        }
                                        MessageObject messageObject62 = (MessageObject) arrayList3.get(i65);
                                        if (messageObject62 != null) {
                                            File file3 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.P).getPathToAttach(photoViewer3.p1(photoViewer3.L4, null), true) : FileLoader.getInstance(photoViewer3.P).getPathToMessage(messageObject62.messageOwner);
                                            boolean isVideo = messageObject62.isVideo();
                                            boolean isLivePhoto = messageObject62.isLivePhoto();
                                            if (isLivePhoto) {
                                                TLRPC.Document document2 = MessageObject.getMedia(messageObject62.messageOwner) != null ? MessageObject.getMedia(messageObject62.messageOwner).document : null;
                                                if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer3.P).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                                    file3 = FileLoader.getInstance(photoViewer3.P).getPathToAttach(document2, true);
                                                }
                                            }
                                            if (isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                if (file3 == null || !file3.exists()) {
                                                    final int i66 = 1;
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.hr0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(qq0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(qq0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(qq0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i67 = 0;
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new Utilities.Callback() { // from class: org.telegram.ui.hr0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i67) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(qq0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(qq0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(qq0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i68 = 2;
                                                MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.hr0
                                                    @Override // org.telegram.messenger.Utilities.Callback
                                                    public final void run(Object obj) {
                                                        switch (i68) {
                                                            case 0:
                                                                AndroidUtilities.runOnUIThread(qq0Var);
                                                                break;
                                                            case 1:
                                                                AndroidUtilities.runOnUIThread(qq0Var);
                                                                break;
                                                            default:
                                                                AndroidUtilities.runOnUIThread(qq0Var);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        i65++;
                                    }
                                }
                            });
                            alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new org.telegram.ui.Components.xo0(27));
                            org.telegram.ui.ActionBar.c2 a10 = alertDialog$Builder.a();
                            z18 = photoViewer2.z1(org.telegram.ui.ActionBar.g6.ug);
                            a10.i(z18);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i64 = org.telegram.ui.ActionBar.g6.q7;
                                z110 = photoViewer2.z1(i64);
                                ((TextView) d).setTextColor(z110);
                                z111 = photoViewer2.z1(i64);
                                d.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(3.0f), z111));
                                ViewGroup viewGroup = a10.p0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            z19 = photoViewer2.z1(org.telegram.ui.ActionBar.g6.hg);
                            a10.o(z19);
                            return;
                        }
                    }
                }
                string = LocaleController.getString("ThisPhoto", R.string.ThisPhoto);
                final int i632 = true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.gr0
                    public final /* synthetic */ or0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i642) {
                        switch (i632) {
                            case 0:
                                or0 or0Var = this.b;
                                or0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer3 = or0Var.b;
                                arrayList3.add(photoViewer3.P4);
                                PhotoViewer.C(photoViewer3, arrayList3);
                                break;
                            default:
                                or0 or0Var2 = this.b;
                                PhotoViewer photoViewer4 = or0Var2.b;
                                MessageObject messageObject62 = photoViewer4.P4;
                                if (messageObject62 != null) {
                                    File file3 = null;
                                    File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer4.P4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer4.P4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer4.P).getPathToAttach(photoViewer4.p1(photoViewer4.L4, null), true) : FileLoader.getInstance(photoViewer4.P).getPathToMessage(photoViewer4.P4.messageOwner);
                                    boolean isVideo = photoViewer4.P4.isVideo();
                                    boolean isLivePhoto = photoViewer4.P4.isLivePhoto();
                                    if (isLivePhoto) {
                                        TLRPC.Document document2 = MessageObject.getMedia(photoViewer4.P4.messageOwner) != null ? MessageObject.getMedia(photoViewer4.P4.messageOwner).document : null;
                                        if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer4.P).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                            file3 = FileLoader.getInstance(photoViewer4.P).getPathToAttach(document2, true);
                                        }
                                    }
                                    if (!isLivePhoto) {
                                        if (pathToAttach2 != null && pathToAttach2.exists()) {
                                            MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new ir0(or0Var2, isVideo, 0));
                                            break;
                                        } else {
                                            photoViewer4.U2();
                                            break;
                                        }
                                    } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer4.y, new fr0(or0Var2, 1));
                                        break;
                                    } else {
                                        photoViewer4.U2();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                if (z24) {
                }
                final boolean z272 = z24;
                final boolean z282 = z25;
                final boolean z292 = z26;
                alertDialog$Builder.k(formatPluralString, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.lr0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i642) {
                        or0 or0Var = or0.this;
                        PhotoViewer photoViewer3 = or0Var.b;
                        int[] iArr = new int[1];
                        final qq0 qq0Var = new qq0(or0Var, new int[1], iArr, z272, z282, z292);
                        int i65 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i65 >= arrayList3.size()) {
                                return;
                            }
                            MessageObject messageObject62 = (MessageObject) arrayList3.get(i65);
                            if (messageObject62 != null) {
                                File file3 = null;
                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.P).getPathToAttach(photoViewer3.p1(photoViewer3.L4, null), true) : FileLoader.getInstance(photoViewer3.P).getPathToMessage(messageObject62.messageOwner);
                                boolean isVideo = messageObject62.isVideo();
                                boolean isLivePhoto = messageObject62.isLivePhoto();
                                if (isLivePhoto) {
                                    TLRPC.Document document2 = MessageObject.getMedia(messageObject62.messageOwner) != null ? MessageObject.getMedia(messageObject62.messageOwner).document : null;
                                    if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer3.P).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                        file3 = FileLoader.getInstance(photoViewer3.P).getPathToAttach(document2, true);
                                    }
                                }
                                if (isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        final int i66 = 1;
                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.hr0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(qq0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(qq0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(qq0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i67 = 0;
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new Utilities.Callback() { // from class: org.telegram.ui.hr0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i67) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(qq0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(qq0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(qq0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i68 = 2;
                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.hr0
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj) {
                                            switch (i68) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(qq0Var);
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(qq0Var);
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(qq0Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i65++;
                        }
                    }
                });
                alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new org.telegram.ui.Components.xo0(27));
                org.telegram.ui.ActionBar.c2 a102 = alertDialog$Builder.a();
                z18 = photoViewer2.z1(org.telegram.ui.ActionBar.g6.ug);
                a102.i(z18);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                z19 = photoViewer2.z1(org.telegram.ui.ActionBar.g6.hg);
                a102.o(z19);
                return;
            }
            messageObject50 = photoViewer2.P4;
            if (messageObject50 != null) {
                messageObject55 = photoViewer2.P4;
                if (MessageObject.getMedia(messageObject55.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) {
                    messageObject58 = photoViewer2.P4;
                    if (MessageObject.getMedia(messageObject58.messageOwner).webpage != null) {
                        messageObject59 = photoViewer2.P4;
                        if (MessageObject.getMedia(messageObject59.messageOwner).webpage.document == null) {
                            i58 = photoViewer2.L4;
                            p12 = photoViewer2.p1(i58, null);
                            i59 = photoViewer2.P;
                            file = FileLoader.getInstance(i59).getPathToAttach(p12, true);
                            if (!file.exists()) {
                                file = new File(FileLoader.getDirectory(4), file.getName());
                            }
                            messageObject57 = photoViewer2.P4;
                            a2 = messageObject57.isVideo();
                        }
                    }
                }
                i57 = photoViewer2.P;
                FileLoader fileLoader = FileLoader.getInstance(i57);
                messageObject56 = photoViewer2.P4;
                file = fileLoader.getPathToMessage(messageObject56.messageOwner);
                messageObject57 = photoViewer2.P4;
                a2 = messageObject57.isVideo();
            } else {
                imageLocation17 = photoViewer2.W4;
                if (imageLocation17 != null) {
                    imageLocation18 = photoViewer2.W4;
                    String q12 = PhotoViewer.q1(imageLocation18);
                    i53 = photoViewer2.P;
                    FileLoader fileLoader2 = FileLoader.getInstance(i53);
                    imageLocation19 = photoViewer2.W4;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation19 == null ? null : imageLocation19.location;
                    j15 = photoViewer2.v5;
                    if (j15 == 0) {
                        z21 = photoViewer2.x5;
                        if (!z21) {
                            z20 = false;
                            pathToAttach = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated, q12, z20);
                            if (pathToAttach != null && !pathToAttach.exists()) {
                                i54 = photoViewer2.P;
                                FileLoader fileLoader3 = FileLoader.getInstance(i54);
                                imageLocation20 = photoViewer2.W4;
                                pathToAttach = fileLoader3.getPathToAttach(imageLocation20 != null ? null : imageLocation20.location, q12, false);
                            }
                            if (q12 != null) {
                                q12 = q12.toLowerCase();
                            }
                            r14 = q12 == null && (q12.equals("webm") || q12.equals("mp4") || q12.equals("gif"));
                            file = pathToAttach;
                        }
                    }
                    z20 = true;
                    pathToAttach = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated, q12, z20);
                    if (pathToAttach != null) {
                        i54 = photoViewer2.P;
                        FileLoader fileLoader32 = FileLoader.getInstance(i54);
                        imageLocation20 = photoViewer2.W4;
                        pathToAttach = fileLoader32.getPathToAttach(imageLocation20 != null ? null : imageLocation20.location, q12, false);
                    }
                    if (q12 != null) {
                    }
                    r14 = q12 == null && (q12.equals("webm") || q12.equals("mp4") || q12.equals("gif"));
                    file = pathToAttach;
                } else {
                    tt0Var6 = photoViewer2.f7;
                    if (tt0Var6 != null) {
                        tt0Var7 = photoViewer2.f7;
                        i51 = photoViewer2.L4;
                        file = tt0Var7.b(i51);
                        tt0Var8 = photoViewer2.f7;
                        i52 = photoViewer2.L4;
                        a2 = tt0Var8.a(i52);
                    } else {
                        file = null;
                        r14 = 0;
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(FileLoader.getDirectory(4), file.getName());
                }
                messageObject51 = photoViewer2.P4;
                if (messageObject51 != null) {
                    messageObject54 = photoViewer2.P4;
                    if (messageObject54.isLivePhoto()) {
                        z22 = true;
                        if (z22) {
                            messageObject52 = photoViewer2.P4;
                            if (MessageObject.getMedia(messageObject52.messageOwner) != null) {
                                messageObject53 = photoViewer2.P4;
                                document = MessageObject.getMedia(messageObject53.messageOwner).document;
                            } else {
                                document = null;
                            }
                            if (document != null) {
                                i55 = photoViewer2.P;
                                file2 = FileLoader.getInstance(i55).getPathToAttach(document, false);
                                if (file2 == null || !file2.exists()) {
                                    i56 = photoViewer2.P;
                                    file2 = FileLoader.getInstance(i56).getPathToAttach(document, true);
                                }
                            }
                        }
                        if (!z22) {
                            if (file == null || !file.exists()) {
                                photoViewer2.U2();
                                return;
                            }
                            String file3 = file.toString();
                            activity19 = photoViewer2.y;
                            MediaController.saveFile(file3, activity19, r14, null, null, new ir0(this, r14, true ? 1 : 0));
                            return;
                        }
                        if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                            photoViewer2.U2();
                            return;
                        }
                        String file4 = file.toString();
                        String file5 = file2.toString();
                        activity20 = photoViewer2.y;
                        MediaController.saveFile(file4, file5, activity20, new fr0(this, 0));
                        return;
                    }
                }
                z22 = false;
                if (z22) {
                }
                if (!z22) {
                }
            }
            r14 = a2;
            if (file != null) {
                file = new File(FileLoader.getDirectory(4), file.getName());
            }
            messageObject51 = photoViewer2.P4;
            if (messageObject51 != null) {
            }
            z22 = false;
            if (z22) {
            }
            if (!z22) {
            }
        } else {
            if (i10 == 24) {
                ze.b H = ze.b.H();
                m12 = photoViewer2.m1();
                H.V(m12);
                r7Var = photoViewer2.C0;
                r7Var.performClick();
                return;
            }
            if (i10 == 3) {
                if (photoViewer2.A5 != 0) {
                    photoViewer2.o4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", photoViewer2.A5);
                    org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(bundle, null);
                    tnVar8 = photoViewer2.h4;
                    if (tnVar8 != null) {
                        tnVar9 = photoViewer2.h4;
                        y90Var.X(tnVar9.v8());
                    }
                    photoViewer2.G0(false, false);
                    activity16 = photoViewer2.y;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = photoViewer2.y;
                        ((LaunchActivity) activity17).q0(y90Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 5 || i10 == 21) {
                messageObject = photoViewer2.P4;
                if (messageObject == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                long j16 = photoViewer2.A5;
                messageObject2 = photoViewer2.P4;
                if (messageObject2 != null) {
                    messageObject5 = photoViewer2.P4;
                    j16 = messageObject5.getDialogId();
                }
                if (DialogObject.isEncryptedDialog(j16)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(j16));
                } else if (DialogObject.isUserDialog(j16)) {
                    bundle2.putLong("user_id", j16);
                } else {
                    i11 = photoViewer2.P;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j16));
                    if (chat2 != null && chat2.migrated_to != null) {
                        bundle2.putLong("migrated_to", j16);
                        j16 = -chat2.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j16);
                }
                messageObject3 = photoViewer2.P4;
                bundle2.putInt("message_id", messageObject3.getId());
                if (i10 == 21) {
                    messageObject4 = photoViewer2.P4;
                    bundle2.putInt("reply_to", messageObject4.getId());
                }
                i12 = photoViewer2.P;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                activity = photoViewer2.y;
                if (activity instanceof LaunchActivity) {
                    activity2 = photoViewer2.y;
                    LaunchActivity launchActivity = (LaunchActivity) activity2;
                    launchActivity.q0(new tn(bundle2), launchActivity.S() > 1 || AndroidUtilities.isTablet(), true);
                }
                photoViewer2.G0(false, false);
                photoViewer2.P4 = null;
                VideoAds videoAds = photoViewer2.Q4;
                if (videoAds != null) {
                    videoAds.stop();
                    photoViewer2.Q4 = null;
                    return;
                }
                return;
            }
            if (i10 == 25) {
                if (photoViewer2.i4 != null) {
                    xt0Var6 = photoViewer2.d;
                    if (xt0Var6 == null) {
                        return;
                    }
                    messageObject41 = photoViewer2.P4;
                    if (messageObject41 != null) {
                        messageObject42 = photoViewer2.P4;
                        if (messageObject42.messageOwner == null) {
                            return;
                        }
                        messageObject43 = photoViewer2.P4;
                        if (!TextUtils.isEmpty(messageObject43.messageOwner.attachPath)) {
                            messageObject45 = photoViewer2.P4;
                            str2 = messageObject45.messageOwner.attachPath;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                        str2 = null;
                        if (TextUtils.isEmpty(str2)) {
                            i50 = photoViewer2.P;
                            FileLoader fileLoader4 = FileLoader.getInstance(i50);
                            messageObject44 = photoViewer2.P4;
                            File pathToMessage = fileLoader4.getPathToMessage(messageObject44.messageOwner, true);
                            if (pathToMessage != null && pathToMessage.exists()) {
                                str2 = pathToMessage.getAbsolutePath();
                            }
                        }
                        String str3 = str2;
                        if (TextUtils.isEmpty(str3)) {
                            return;
                        }
                        tnVar7 = photoViewer2.h4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str3, 0, false, 0, 0, 0L));
                        this.b.f2(arrayList3, 0, 11, false, new mr0(), tnVar7);
                        photoViewer2.X0(null, null, false, null);
                        photoViewer2.l2();
                        ht.q().x();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                messageObject34 = photoViewer2.P4;
                if (messageObject34 == null) {
                    return;
                }
                activity12 = photoViewer2.y;
                if (!(activity12 instanceof LaunchActivity)) {
                    return;
                }
                messageObject35 = photoViewer2.P4;
                if (!messageObject35.scheduled) {
                    messageObject40 = photoViewer2.P4;
                    long dialogId = messageObject40.getDialogId();
                    if (DialogObject.isChatDialog(dialogId)) {
                        i49 = photoViewer2.P;
                        z11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i49).getChat(Long.valueOf(-dialogId)));
                        activity13 = photoViewer2.y;
                        messageObject36 = photoViewer2.P4;
                        ((LaunchActivity) activity13).K0(messageObject36.currentAccount);
                        arrayList = new ArrayList(1);
                        tnVar4 = photoViewer2.h4;
                        if (tnVar4 == null) {
                            tnVar6 = photoViewer2.h4;
                            messageObject39 = photoViewer2.P4;
                            str = "Cancel";
                            groupedMessages = tnVar6.y8(messageObject39.getGroupId());
                        } else {
                            str = "Cancel";
                            groupedMessages = null;
                        }
                        if (groupedMessages == null) {
                            arrayList.addAll(groupedMessages.messages);
                        } else {
                            messageObject37 = photoViewer2.P4;
                            arrayList.add(messageObject37);
                        }
                        if (!z11 && arrayList.size() <= 1) {
                            PhotoViewer.C(photoViewer2, arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            fy fyVar = new fy(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            messageObject38 = photoViewer2.P4;
                            arrayList4.add(messageObject38);
                            tnVar5 = photoViewer2.h4;
                            fyVar.y2 = new z6(this, arrayList4, tnVar5, 18);
                            activity14 = photoViewer2.y;
                            ((LaunchActivity) activity14).q0(fyVar, false, true);
                            photoViewer2.G0(false, false);
                            return;
                        }
                        for (int i65 = 0; i65 < arrayList.size(); i65++) {
                            if (!((MessageObject) arrayList.get(i65)).isPhoto() || ((MessageObject) arrayList.get(i65)).isVideo()) {
                                z13 = false;
                                break;
                            }
                        }
                        z13 = true;
                        activity15 = photoViewer2.y;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, c6Var);
                        alertDialog$Builder2.l(LocaleController.getString("ForwardGroupMedia", R.string.ForwardGroupMedia));
                        alertDialog$Builder2.g(LocaleController.getString("ForwardGroupMediaMessage", R.string.ForwardGroupMediaMessage));
                        alertDialog$Builder2.a.E = org.telegram.ui.ActionBar.g6.pg;
                        final int i66 = 0;
                        alertDialog$Builder2.h(z13 ? LocaleController.getString("ThisPhoto", R.string.ThisPhoto) : LocaleController.getString("ThisMedia", R.string.ThisMedia), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.gr0
                            public final /* synthetic */ or0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.b2
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i642) {
                                switch (i66) {
                                    case 0:
                                        or0 or0Var = this.b;
                                        or0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer3 = or0Var.b;
                                        arrayList32.add(photoViewer3.P4);
                                        PhotoViewer.C(photoViewer3, arrayList32);
                                        break;
                                    default:
                                        or0 or0Var2 = this.b;
                                        PhotoViewer photoViewer4 = or0Var2.b;
                                        MessageObject messageObject62 = photoViewer4.P4;
                                        if (messageObject62 != null) {
                                            File file32 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer4.P4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer4.P4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer4.P).getPathToAttach(photoViewer4.p1(photoViewer4.L4, null), true) : FileLoader.getInstance(photoViewer4.P).getPathToMessage(photoViewer4.P4.messageOwner);
                                            boolean isVideo = photoViewer4.P4.isVideo();
                                            boolean isLivePhoto = photoViewer4.P4.isLivePhoto();
                                            if (isLivePhoto) {
                                                TLRPC.Document document2 = MessageObject.getMedia(photoViewer4.P4.messageOwner) != null ? MessageObject.getMedia(photoViewer4.P4.messageOwner).document : null;
                                                if (document2 != null && ((file32 = FileLoader.getInstance(photoViewer4.P).getPathToAttach(document2, false)) == null || !file32.exists())) {
                                                    file32 = FileLoader.getInstance(photoViewer4.P).getPathToAttach(document2, true);
                                                }
                                            }
                                            if (!isLivePhoto) {
                                                if (pathToAttach2 != null && pathToAttach2.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer4.y, isVideo ? 1 : 0, null, null, new ir0(or0Var2, isVideo, 0));
                                                    break;
                                                } else {
                                                    photoViewer4.U2();
                                                    break;
                                                }
                                            } else if (pathToAttach2 != null && pathToAttach2.exists() && file32 != null && file32.exists()) {
                                                MediaController.saveFile(pathToAttach2.toString(), file32.toString(), photoViewer4.y, new fr0(or0Var2, 1));
                                                break;
                                            } else {
                                                photoViewer4.U2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.k(z13 ? LocaleController.formatPluralString("AllNPhotos", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("AllNMedia", arrayList.size(), new Object[0]), new kl0(7, this, arrayList));
                        alertDialog$Builder2.i(LocaleController.getString(str, R.string.Cancel), new org.telegram.ui.Components.xo0(i60));
                        org.telegram.ui.ActionBar.c2 a11 = alertDialog$Builder2.a();
                        z14 = photoViewer2.z1(org.telegram.ui.ActionBar.g6.ug);
                        a11.i(z14);
                        a11.show();
                        View d10 = a11.d(-3);
                        if (d10 instanceof TextView) {
                            int i67 = org.telegram.ui.ActionBar.g6.q7;
                            z16 = photoViewer2.z1(i67);
                            ((TextView) d10).setTextColor(z16);
                            z17 = photoViewer2.z1(i67);
                            d10.setBackground(org.telegram.ui.ActionBar.g6.G0(AndroidUtilities.dp(3.0f), z17));
                            ViewGroup viewGroup2 = a11.p0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d10.bringToFront();
                            }
                        }
                        z15 = photoViewer2.z1(org.telegram.ui.ActionBar.g6.hg);
                        a11.o(z15);
                        return;
                    }
                }
                z11 = false;
                activity13 = photoViewer2.y;
                messageObject36 = photoViewer2.P4;
                ((LaunchActivity) activity13).K0(messageObject36.currentAccount);
                arrayList = new ArrayList(1);
                tnVar4 = photoViewer2.h4;
                if (tnVar4 == null) {
                }
                if (groupedMessages == null) {
                }
                if (!z11) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i10 == 18) {
                    PhotoViewer.D(photoViewer2);
                    return;
                }
                if (i10 == 26) {
                    activity11 = photoViewer2.y;
                    if (activity11 != null) {
                        xt0Var4 = photoViewer2.d;
                        if (xt0Var4 == null) {
                            return;
                        }
                        xt0Var5 = photoViewer2.d;
                        xt0Var5.I();
                        photoViewer2.G0(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == 7) {
                    activity9 = photoViewer2.y;
                    if (activity9 == null) {
                        return;
                    }
                    xt0Var2 = photoViewer2.d;
                    if (xt0Var2 == null) {
                        return;
                    }
                    messageObject24 = photoViewer2.P4;
                    if (messageObject24 != null) {
                        messageObject32 = photoViewer2.P4;
                        if (!messageObject32.scheduled) {
                            messageObject33 = photoViewer2.P4;
                            long dialogId2 = messageObject33.getDialogId();
                            if (DialogObject.isChatDialog(dialogId2)) {
                                i48 = photoViewer2.P;
                                z10 = ChatObject.isChannel(MessagesController.getInstance(i48).getChat(Long.valueOf(-dialogId2)));
                                activity10 = photoViewer2.y;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(activity10);
                                xt0Var3 = photoViewer2.d;
                                a02 = xt0Var3.a0();
                                if (a02 == null) {
                                    alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                                    alertDialog$Builder3.g(a02);
                                } else {
                                    if (!photoViewer2.p4) {
                                        imageLocation14 = photoViewer2.W4;
                                        if (imageLocation14 != null) {
                                            imageLocation15 = photoViewer2.W4;
                                            imageLocation16 = photoViewer2.V4;
                                        }
                                        messageObject25 = photoViewer2.P4;
                                        if (messageObject25 != null) {
                                            messageObject28 = photoViewer2.P4;
                                        }
                                        messageObject26 = photoViewer2.P4;
                                        if (messageObject26 != null) {
                                            messageObject27 = photoViewer2.P4;
                                            if (messageObject27.isGif()) {
                                                alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeleteGIFTitle", R.string.AreYouSureDeleteGIFTitle));
                                                if (z10) {
                                                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteGIFEveryone", R.string.AreYouSureDeleteGIFEveryone, new Object[0]));
                                                } else {
                                                    alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteGIF", R.string.AreYouSureDeleteGIF, new Object[0]));
                                                }
                                            }
                                        }
                                        alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                                        if (z10) {
                                            alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeletePhotoEveryone", R.string.AreYouSureDeletePhotoEveryone, new Object[0]));
                                        } else {
                                            alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeletePhoto", R.string.AreYouSureDeletePhoto, new Object[0]));
                                        }
                                    }
                                    alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeleteVideoTitle", R.string.AreYouSureDeleteVideoTitle));
                                    if (z10) {
                                        alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteVideoEveryone", R.string.AreYouSureDeleteVideoEveryone, new Object[0]));
                                    } else {
                                        alertDialog$Builder3.g(LocaleController.formatString("AreYouSureDeleteVideo", R.string.AreYouSureDeleteVideo, new Object[0]));
                                    }
                                }
                                boolean[] zArr = new boolean[1];
                                messageObject29 = photoViewer2.P4;
                                if (messageObject29 != null) {
                                    messageObject30 = photoViewer2.P4;
                                    if (!messageObject30.scheduled) {
                                        messageObject31 = photoViewer2.P4;
                                        long dialogId3 = messageObject31.getDialogId();
                                        if (!DialogObject.isEncryptedDialog(dialogId3)) {
                                            if (DialogObject.isUserDialog(dialogId3)) {
                                                i47 = photoViewer2.P;
                                                user = MessagesController.getInstance(i47).getUser(Long.valueOf(dialogId3));
                                                chat = null;
                                            } else {
                                                i41 = photoViewer2.P;
                                                chat = MessagesController.getInstance(i41).getChat(Long.valueOf(-dialogId3));
                                                user = null;
                                            }
                                            if (user != null || !ChatObject.isChannel(chat)) {
                                                i42 = photoViewer2.P;
                                                int currentTime = ConnectionsManager.getInstance(i42).getCurrentTime();
                                                if (user != null) {
                                                    i46 = photoViewer2.P;
                                                    i44 = MessagesController.getInstance(i46).revokeTimePmLimit;
                                                } else {
                                                    i43 = photoViewer2.P;
                                                    i44 = MessagesController.getInstance(i43).revokeTimeLimit;
                                                }
                                                if (user != null) {
                                                    long j17 = user.id;
                                                    i45 = photoViewer2.P;
                                                }
                                            }
                                        }
                                    }
                                }
                                String str4 = "Cancel";
                                org.telegram.ui.ActionBar.b2 b2Var = null;
                                alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new kl0(8, this, zArr));
                                alertDialog$Builder3.h(LocaleController.getString(str4, R.string.Cancel), b2Var);
                                org.telegram.ui.ActionBar.c2 a12 = alertDialog$Builder3.a();
                                photoViewer2.S2(alertDialog$Builder3);
                                textView = (TextView) a12.d(-1);
                                if (textView == null) {
                                    z12 = photoViewer2.z1(org.telegram.ui.ActionBar.g6.q7);
                                    textView.setTextColor(z12);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z10 = false;
                    activity10 = photoViewer2.y;
                    AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    xt0Var3 = photoViewer2.d;
                    a02 = xt0Var3.a0();
                    if (a02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    messageObject29 = photoViewer2.P4;
                    if (messageObject29 != null) {
                    }
                    String str42 = "Cancel";
                    org.telegram.ui.ActionBar.b2 b2Var2 = null;
                    alertDialog$Builder32.k(LocaleController.getString("Delete", R.string.Delete), new kl0(8, this, zArr2));
                    alertDialog$Builder32.h(LocaleController.getString(str42, R.string.Cancel), b2Var2);
                    org.telegram.ui.ActionBar.c2 a122 = alertDialog$Builder32.a();
                    photoViewer2.S2(alertDialog$Builder32);
                    textView = (TextView) a122.d(-1);
                    if (textView == null) {
                    }
                } else {
                    String str5 = null;
                    if (i10 == 9 || i10 == 16) {
                        PhotoViewer.F(photoViewer2);
                        return;
                    }
                    if (i10 == 10) {
                        try {
                            if (photoViewer2.p4) {
                                activity5 = photoViewer2.y;
                                messageObject11 = photoViewer2.P4;
                                ye.d.s(activity5, MessageObject.getMedia(messageObject11.messageOwner).webpage.url);
                                photoViewer2.G0(false, false);
                                return;
                            }
                            messageObject6 = photoViewer2.P4;
                            if (messageObject6 == null) {
                                tt0Var = photoViewer2.f7;
                                if (tt0Var != null) {
                                    tt0Var2 = photoViewer2.f7;
                                    i13 = photoViewer2.L4;
                                    TLObject d11 = tt0Var2.d(i13);
                                    activity3 = photoViewer2.y;
                                    if (AndroidUtilities.openForView(d11, activity3)) {
                                        photoViewer2.G0(false, false);
                                        return;
                                    } else {
                                        photoViewer2.U2();
                                        return;
                                    }
                                }
                                return;
                            }
                            messageObject7 = photoViewer2.P4;
                            activity4 = photoViewer2.y;
                            messageObject8 = photoViewer2.P4;
                            if (!messageObject8.isVideo()) {
                                messageObject9 = photoViewer2.P4;
                                if (!messageObject9.isPhoto()) {
                                    messageObject10 = photoViewer2.P4;
                                    if (!messageObject10.isSticker()) {
                                        z23 = false;
                                    }
                                }
                            }
                            if (AndroidUtilities.openForView(messageObject7, activity4, c6Var, z23)) {
                                photoViewer2.G0(false, false);
                                return;
                            } else {
                                photoViewer2.U2();
                                return;
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                    if (i10 == 11 || i10 == 13) {
                        activity6 = photoViewer2.y;
                        if (activity6 != null) {
                            messageObject12 = photoViewer2.P4;
                            if (messageObject12 == null) {
                                return;
                            }
                            messageObject13 = photoViewer2.P4;
                            if (MessageObject.getMedia(messageObject13.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                                messageObject17 = photoViewer2.P4;
                                tLObject = MessageObject.getMedia(messageObject17.messageOwner).photo;
                            } else {
                                messageObject14 = photoViewer2.P4;
                                if (!(MessageObject.getMedia(messageObject14.messageOwner) instanceof TLRPC.TL_messageMediaDocument)) {
                                    return;
                                }
                                messageObject15 = photoViewer2.P4;
                                tLObject = MessageObject.getMedia(messageObject15.messageOwner).document;
                            }
                            TLObject tLObject2 = tLObject;
                            activity7 = photoViewer2.y;
                            messageObject16 = photoViewer2.P4;
                            photoViewer2.Q3 = new nr0(this, activity7, messageObject16, tLObject2, this.a);
                            nx0Var = photoViewer2.Q3;
                            nx0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i10 == 6) {
                        w0Var = photoViewer2.k0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!photoViewer2.p4) {
                            photoViewer2.h3();
                            return;
                        }
                        mf0Var = photoViewer2.b0;
                        if (mf0Var.e()) {
                            if (PhotoViewer.W8 != null) {
                                PhotoViewer.W8.P0();
                            }
                            photoViewer2.F3 = true;
                            photoViewer = PhotoViewer.V8;
                            PhotoViewer.W8 = photoViewer;
                            PhotoViewer.V8 = null;
                            photoViewer2.e = false;
                            photoViewer2.f = false;
                            zt0 zt0Var = photoViewer2.Z4;
                            if (zt0Var != null && !zt0Var.a.getVisible()) {
                                photoViewer2.Z4.a.setVisible(true, true);
                            }
                            photoViewer2.i6 = 1.0f;
                            photoViewer2.a0.invalidate();
                            photoViewer2.S0();
                            return;
                        }
                        return;
                    }
                    if (i10 == 8) {
                        messageObject22 = photoViewer2.P4;
                        if (messageObject22 == null) {
                            return;
                        }
                        i40 = photoViewer2.P;
                        FileLoader fileLoader5 = FileLoader.getInstance(i40);
                        messageObject23 = photoViewer2.P4;
                        fileLoader5.cancelLoadFile(messageObject23.getDocument());
                        photoViewer2.n2(false);
                        photoViewer2.e0.setTag(r3);
                        photoViewer2.e0.setVisibility(0);
                        return;
                    }
                    if (i10 == 12) {
                        messageObject19 = photoViewer2.P4;
                        if (messageObject19 != null) {
                            messageObject20 = photoViewer2.P4;
                            TLRPC.Document document2 = messageObject20.getDocument();
                            tnVar = photoViewer2.h4;
                            if (tnVar != null) {
                                tnVar2 = photoViewer2.h4;
                                if (tnVar2.U != null) {
                                    tnVar3 = photoViewer2.h4;
                                    tnVar3.U.n(document2);
                                    i39 = photoViewer2.P;
                                    MessagesController messagesController = MessagesController.getInstance(i39);
                                    messageObject21 = photoViewer2.P4;
                                    messagesController.saveGif(messageObject21, document2);
                                }
                            }
                            i38 = photoViewer2.P;
                            MediaDataController.getInstance(i38).addRecentGif(document2, (int) (System.currentTimeMillis() / 1000), true);
                            i39 = photoViewer2.P;
                            MessagesController messagesController2 = MessagesController.getInstance(i39);
                            messageObject21 = photoViewer2.P4;
                            messagesController2.saveGif(messageObject21, document2);
                        } else {
                            tt0Var3 = photoViewer2.f7;
                            if (tt0Var3 == null) {
                                return;
                            }
                            tt0Var4 = photoViewer2.f7;
                            i35 = photoViewer2.L4;
                            TLObject d12 = tt0Var4.d(i35);
                            if (d12 instanceof TLRPC.Document) {
                                TLRPC.Document document3 = (TLRPC.Document) d12;
                                i36 = photoViewer2.P;
                                MediaDataController.getInstance(i36).addRecentGif(document3, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = photoViewer2.P;
                                MessagesController messagesController3 = MessagesController.getInstance(i37);
                                tt0Var5 = photoViewer2.f7;
                                messagesController3.saveGif(tt0Var5.g(), document3);
                            }
                        }
                        rt0 rt0Var = photoViewer2.a0;
                        if (rt0Var != null) {
                            org.telegram.ui.Components.tc.Z(rt0Var, c6Var).o(org.telegram.ui.Components.sc.y, c6Var).j();
                            return;
                        }
                        return;
                    }
                    if (i10 == 14) {
                        ArrayList arrayList5 = photoViewer2.b7;
                        i18 = photoViewer2.L4;
                        TLRPC.Photo photo3 = (TLRPC.Photo) arrayList5.get(i18);
                        if (photo3 == null || photo3.sizes.isEmpty()) {
                            return;
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 800);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 90);
                        i19 = photoViewer2.P;
                        UserConfig userConfig = UserConfig.getInstance(i19);
                        j11 = photoViewer2.v5;
                        if (j11 == userConfig.clientUserId) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = photoViewer2.P;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new jr0(this, userConfig, photo3, 0));
                            i33 = photoViewer2.P;
                            TLRPC.User user2 = MessagesController.getInstance(i33).getUser(Long.valueOf(userConfig.clientUserId));
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                userProfilePhoto.photo_id = photo3.id;
                                userProfilePhoto.dc_id = photo3.dc_id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user2);
                                userConfig.saveConfig(true);
                                i34 = photoViewer2.P;
                                NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                            }
                        } else {
                            i20 = photoViewer2.P;
                            MessagesController messagesController4 = MessagesController.getInstance(i20);
                            j12 = photoViewer2.v5;
                            TLRPC.Chat chat3 = messagesController4.getChat(Long.valueOf(-j12));
                            if (chat3 == null) {
                                return;
                            }
                            TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                            tL_inputChatPhoto.id = tL_inputPhoto2;
                            tL_inputPhoto2.id = photo3.id;
                            tL_inputPhoto2.access_hash = photo3.access_hash;
                            tL_inputPhoto2.file_reference = photo3.file_reference;
                            i21 = photoViewer2.P;
                            MessagesController messagesController5 = MessagesController.getInstance(i21);
                            j13 = photoViewer2.v5;
                            messagesController5.changeChatAvatar(-j13, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                            TLRPC.ChatPhoto chatPhoto = chat3.photo;
                            chatPhoto.dc_id = photo3.dc_id;
                            chatPhoto.photo_small = closestPhotoSizeWithSize2.location;
                            chatPhoto.photo_big = closestPhotoSizeWithSize.location;
                            i22 = photoViewer2.P;
                            NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                        }
                        photoViewer2.d7 = ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo3);
                        ArrayList arrayList6 = photoViewer2.b7;
                        i23 = photoViewer2.L4;
                        arrayList6.remove(i23);
                        photoViewer2.b7.add(0, photo3);
                        ArrayList arrayList7 = photoViewer2.W6;
                        i24 = photoViewer2.L4;
                        ImageLocation imageLocation21 = (ImageLocation) arrayList7.get(i24);
                        ArrayList arrayList8 = photoViewer2.W6;
                        i25 = photoViewer2.L4;
                        arrayList8.remove(i25);
                        photoViewer2.W6.add(0, imageLocation21);
                        ArrayList arrayList9 = photoViewer2.X6;
                        i26 = photoViewer2.L4;
                        ImageLocation imageLocation22 = (ImageLocation) arrayList9.get(i26);
                        ArrayList arrayList10 = photoViewer2.X6;
                        i27 = photoViewer2.L4;
                        arrayList10.remove(i27);
                        photoViewer2.X6.add(0, imageLocation22);
                        ArrayList arrayList11 = photoViewer2.Y6;
                        i28 = photoViewer2.L4;
                        Long l10 = (Long) arrayList11.get(i28);
                        ArrayList arrayList12 = photoViewer2.Y6;
                        i29 = photoViewer2.L4;
                        arrayList12.remove(i29);
                        photoViewer2.Y6.add(0, l10);
                        ArrayList arrayList13 = photoViewer2.Z6;
                        i30 = photoViewer2.L4;
                        TLRPC.Message message = (TLRPC.Message) arrayList13.get(i30);
                        ArrayList arrayList14 = photoViewer2.Z6;
                        i31 = photoViewer2.L4;
                        arrayList14.remove(i31);
                        photoViewer2.Z6.add(0, message);
                        photoViewer2.L4 = -1;
                        photoViewer2.B2(0);
                        org.telegram.ui.Components.t30 t30Var = photoViewer2.h1;
                        t30Var.d.clear();
                        t30Var.e.clear();
                        t30Var.c.clear();
                        photoViewer2.h1.b();
                        undoView = photoViewer2.j1;
                        j14 = photoViewer2.v5;
                        imageLocation12 = photoViewer2.W4;
                        imageLocation13 = photoViewer2.V4;
                        undoView.m(j14, imageLocation12 == imageLocation13 ? null : 1, 22);
                        final int i68 = 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.kr0
                            public final /* synthetic */ or0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i68) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.k0;
                                        if (w0Var2 != null) {
                                            w0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.k0.r(19);
                                        photoViewer3.k0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.k0.K(19);
                                        photoViewer4.k0.r(20);
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    if (i10 == 15) {
                        i16 = photoViewer2.P;
                        FileLoader fileLoader6 = FileLoader.getInstance(i16);
                        imageLocation7 = photoViewer2.W4;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation7 == null ? null : imageLocation7.location;
                        imageLocation8 = photoViewer2.W4;
                        File pathToAttach2 = fileLoader6.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.q1(imageLocation8), true);
                        imageLocation9 = photoViewer2.W4;
                        boolean z30 = imageLocation9.imageType == 2;
                        if (z30) {
                            i17 = photoViewer2.P;
                            FileLoader fileLoader7 = FileLoader.getInstance(i17);
                            imageLocation10 = photoViewer2.V4;
                            TLObject tLObject3 = imageLocation10 != null ? imageLocation10.location : null;
                            imageLocation11 = photoViewer2.V4;
                            str5 = fileLoader7.getPathToAttach(tLObject3, PhotoViewer.q1(imageLocation11), true).getAbsolutePath();
                        }
                        xt0Var = photoViewer2.d;
                        xt0Var.f(pathToAttach2.getAbsolutePath(), str5, z30);
                        return;
                    }
                    if (i10 == 19) {
                        int i69 = photoViewer2.M4;
                        if (i69 < 0 || i69 >= photoViewer2.U6.size()) {
                            return;
                        }
                        MessageObject messageObject62 = (MessageObject) photoViewer2.U6.get(photoViewer2.M4);
                        photoViewer2.j5 = true;
                        final int i70 = true ? 1 : 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.kr0
                            public final /* synthetic */ or0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i70) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.k0;
                                        if (w0Var2 != null) {
                                            w0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.k0.r(19);
                                        photoViewer3.k0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.k0.K(19);
                                        photoViewer4.k0.r(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.S(photoViewer2);
                        i15 = photoViewer2.P;
                        MessagesController.getInstance(i15).getTranslateController().translatePhoto(messageObject62, new yq0(photoViewer2, 3));
                        return;
                    }
                    if (i10 == 20) {
                        photoViewer2.j5 = false;
                        final int i71 = 2;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.kr0
                            public final /* synthetic */ or0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i71) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.k0;
                                        if (w0Var2 != null) {
                                            w0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.k0.r(19);
                                        photoViewer3.k0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer4 = this.b.b;
                                        photoViewer4.k0.K(19);
                                        photoViewer4.k0.r(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.S(photoViewer2);
                        return;
                    }
                    if (i10 == 22) {
                        photoViewer2.V2 = !photoViewer2.V2;
                        boolean z31 = photoViewer2.V2;
                        messageObject18 = photoViewer2.P4;
                        org.telegram.ui.Components.x61.J(messageObject18, z31);
                        org.telegram.ui.Components.x61 x61Var = photoViewer2.B2;
                        if (x61Var != null) {
                            x61Var.O(photoViewer2.V2);
                        }
                        photoViewer2.o0.d(photoViewer2.V2);
                        photoViewer2.o0.setSelectorColor(photoViewer2.V2 ? 259241196 : 268435455);
                        return;
                    }
                    if (i10 != 23) {
                        return;
                    }
                    imageLocation = photoViewer2.V4;
                    if (imageLocation != null) {
                        imageLocation5 = photoViewer2.V4;
                        if (imageLocation5.photo != null) {
                            imageLocation6 = photoViewer2.V4;
                            photo2 = imageLocation6.photo;
                            photo = photo2;
                            if (photo == null) {
                                return;
                            }
                            i14 = photoViewer2.P;
                            activity8 = photoViewer2.y;
                            j10 = photoViewer2.v5;
                            org.telegram.ui.Components.c5.J(i14, activity8, j10, photo, new lh.b());
                            return;
                        }
                    }
                    imageLocation2 = photoViewer2.W4;
                    if (imageLocation2 != null) {
                        imageLocation3 = photoViewer2.W4;
                        if (imageLocation3.photo != null) {
                            imageLocation4 = photoViewer2.W4;
                            photo2 = imageLocation4.photo;
                            photo = photo2;
                            if (photo == null) {
                            }
                        }
                    }
                    photo = null;
                    if (photo == null) {
                    }
                }
            }
        }
    }
}
