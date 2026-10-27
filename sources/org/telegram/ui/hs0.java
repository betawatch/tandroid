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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hs0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.u6 a;
    public final /* synthetic */ PhotoViewer b;

    public hs0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.u6 u6Var) {
        this.b = photoViewer;
        this.a = u6Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.T4 != null || photoViewer.b5 != null) {
            return true;
        }
        if (photoViewer.a5 == null) {
            return photoViewer.j7 != null;
        }
        FileLoader fileLoader = FileLoader.getInstance(photoViewer.T);
        ImageLocation imageLocation = photoViewer.a5;
        File pathToAttach = fileLoader.getPathToAttach(imageLocation == null ? null : imageLocation.location, PhotoViewer.s1(imageLocation), photoViewer.z5 != 0 || photoViewer.B5);
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.T);
        ImageLocation imageLocation2 = photoViewer.a5;
        return pathToAttach.exists() || file.exists() || fileLoader2.getPathToAttach(imageLocation2 != null ? imageLocation2.location : null, PhotoViewer.s1(imageLocation2), false).exists();
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x040b, code lost:
    
        if (org.telegram.ui.Components.b10.t(r3) != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x07f2, code lost:
    
        if (r8 == org.telegram.messenger.UserConfig.getInstance(r16).getClientUserId()) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x07f6, code lost:
    
        if (r4 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x07f8, code lost:
    
        r8 = r7.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0802, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r8).canRevokePmInbox == false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0804, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0807, code lost:
    
        r9 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x080f, code lost:
    
        if (r9.messageOwner.action == null) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0811, code lost:
    
        r9 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x081b, code lost:
    
        if ((r9.messageOwner.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x081e, code lost:
    
        r6 = "Cancel";
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0822, code lost:
    
        r9 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x082a, code lost:
    
        if (r9.isOut() != false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x082c, code lost:
    
        if (r8 != false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0832, code lost:
    
        if (org.telegram.messenger.ChatObject.hasAdminRights(r12) == false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0834, code lost:
    
        r8 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x083d, code lost:
    
        if ((r13 - r8.messageOwner.date) > r15) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x083f, code lost:
    
        r8 = r7.y;
        r15 = new android.widget.FrameLayout(r8);
        r9 = r7.y;
        r8 = new org.telegram.ui.Cells.y1(r9, 1, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.y6.M0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0858, code lost:
    
        if (r12 == null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x085a, code lost:
    
        r2 = null;
        r8.e(org.telegram.messenger.LocaleController.getString("DeleteForAll", org.telegram.messenger.R.string.DeleteForAll), "", false, false, false);
        r6 = "Cancel";
        r4 = 5;
        r5 = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x089f, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x08a1, code lost:
    
        r9 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x08ac, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x08ae, code lost:
    
        r10 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08b7, code lost:
    
        r8.setPadding(r9, 0, r10, 0);
        r15.addView(r8, org.telegram.ui.Components.kb1.h(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.p8(r4, r0));
        r3.o(r15);
        r3.a.G = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08b3, code lost:
    
        r10 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08a6, code lost:
    
        r9 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0876, code lost:
    
        r2 = null;
        r4 = org.telegram.messenger.LocaleController.formatString("DeleteForUser", org.telegram.messenger.R.string.DeleteForUser, org.telegram.messenger.UserObject.getFirstName(r4));
        r6 = "Cancel";
        r5 = 9;
        r4 = 5;
        r8.e(r4, "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0806, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x07f4, code lost:
    
        if (r12 != null) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x06cc, code lost:
    
        if (r4 == r13) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x06dc, code lost:
    
        if (r4.isVideo() != false) goto L327;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0dd0  */
    /* JADX WARN: Removed duplicated region for block: B:538:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0248  */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v166 */
    /* JADX WARN: Type inference failed for: r0v175 */
    /* JADX WARN: Type inference failed for: r0v234 */
    /* JADX WARN: Type inference failed for: r0v235 */
    /* JADX WARN: Type inference failed for: r0v237 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r2v158, types: [org.telegram.messenger.FileLoader] */
    /* JADX WARN: Type inference failed for: r2v162, types: [org.telegram.messenger.FileLoader] */
    /* JADX WARN: Type inference failed for: r2v165 */
    /* JADX WARN: Type inference failed for: r2v166 */
    /* JADX WARN: Type inference failed for: r2v173 */
    /* JADX WARN: Type inference failed for: r3v24, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.PhotoViewer] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v43 */
    @Override // org.telegram.ui.ActionBar.j
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
        mu0 mu0Var;
        mu0 mu0Var2;
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
        org.telegram.ui.Components.dz0 dz0Var;
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
        String str;
        qu0 qu0Var;
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
        mu0 mu0Var3;
        mu0 mu0Var4;
        int i35;
        int i36;
        int i37;
        mu0 mu0Var5;
        MessageObject messageObject20;
        wn wnVar;
        int i38;
        int i39;
        MessageObject messageObject21;
        wn wnVar2;
        wn wnVar3;
        MessageObject messageObject22;
        int i40;
        MessageObject messageObject23;
        org.telegram.ui.ActionBar.w0 w0Var;
        View findViewWithTag;
        org.telegram.ui.Components.ng0 ng0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        qu0 qu0Var2;
        MessageObject messageObject24;
        boolean z10;
        Activity activity10;
        qu0 qu0Var3;
        String b02;
        ImageLocation imageLocation14;
        MessageObject messageObject25;
        MessageObject messageObject26;
        MessageObject messageObject27;
        MessageObject messageObject28;
        ImageLocation imageLocation15;
        ImageLocation imageLocation16;
        MessageObject messageObject29;
        TextView textView;
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
        qu0 qu0Var4;
        qu0 qu0Var5;
        MessageObject messageObject34;
        Activity activity12;
        MessageObject messageObject35;
        boolean z11;
        Activity activity13;
        MessageObject messageObject36;
        ArrayList arrayList;
        wn wnVar4;
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject37;
        MessageObject messageObject38;
        wn wnVar5;
        Activity activity14;
        ?? r02;
        Activity activity15;
        int B1;
        int B12;
        int B13;
        wn wnVar6;
        MessageObject messageObject39;
        MessageObject messageObject40;
        int i49;
        qu0 qu0Var6;
        MessageObject messageObject41;
        MessageObject messageObject42;
        MessageObject messageObject43;
        String str2;
        wn wnVar7;
        int i50;
        MessageObject messageObject44;
        MessageObject messageObject45;
        wn wnVar8;
        Activity activity16;
        Activity activity17;
        wn wnVar9;
        rf.g o12;
        org.telegram.ui.Components.w7 w7Var;
        mu0 mu0Var6;
        Activity activity18;
        Activity activity19;
        wn wnVar10;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject46;
        Activity activity20;
        MessageObject messageObject47;
        String string;
        int B14;
        View d;
        int B15;
        int B16;
        MessageObject messageObject48;
        MessageObject messageObject49;
        MessageObject messageObject50;
        ImageLocation imageLocation17;
        mu0 mu0Var7;
        ?? r14;
        File file;
        mu0 mu0Var8;
        int i51;
        mu0 mu0Var9;
        int i52;
        boolean a2;
        ImageLocation imageLocation18;
        int i53;
        ImageLocation imageLocation19;
        long j15;
        boolean z12;
        File pathToAttach;
        int i54;
        ImageLocation imageLocation20;
        boolean z13;
        MessageObject messageObject51;
        ?? r22;
        File file2;
        Activity activity21;
        Activity activity22;
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
        TLObject r12;
        int i59;
        wn wnVar11;
        MessageObject messageObject60;
        boolean z14;
        boolean K1;
        org.telegram.ui.ActionBar.u6 u6Var = this.a;
        boolean z15 = true;
        z15 = true;
        z15 = true;
        ?? r72 = this.b;
        if (i10 == -1) {
            pt0 pt0Var = r72.L1;
            if (pt0Var == null || !pt0Var.n0()) {
                K1 = r72.K1();
                if (K1) {
                    r72.F0(false);
                    return;
                } else {
                    r72.H0(true, false);
                    return;
                }
            }
            return;
        }
        final int i60 = 0;
        if (i10 == 2) {
            mu0Var6 = r72.j7;
            if (mu0Var6 != null) {
                z14 = r72.k2;
                if (!z14) {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) {
                activity18 = r72.y;
                if (activity18.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    activity19 = r72.y;
                    activity19.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                    return;
                }
            }
            final ArrayList arrayList2 = new ArrayList(1);
            wnVar10 = r72.l4;
            if (wnVar10 != null) {
                wnVar11 = r72.l4;
                messageObject60 = r72.T4;
                groupedMessages2 = wnVar11.K8(messageObject60.getGroupId());
            } else {
                groupedMessages2 = null;
            }
            if (groupedMessages2 != null) {
                arrayList2.addAll(groupedMessages2.messages);
            } else {
                messageObject46 = r72.T4;
                arrayList2.add(messageObject46);
            }
            if (arrayList2.size() > 1) {
                boolean z16 = false;
                boolean z17 = false;
                boolean z18 = false;
                for (int i61 = 0; i61 < arrayList2.size(); i61++) {
                    MessageObject messageObject61 = (MessageObject) arrayList2.get(i61);
                    if (messageObject61.isLivePhoto()) {
                        z18 = true;
                    } else if (messageObject61.isVideo()) {
                        z16 = true;
                    } else {
                        z17 = true;
                    }
                }
                activity20 = r72.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity20, u6Var);
                alertDialog$Builder.l(LocaleController.getString("SaveGroupMedia", R.string.SaveGroupMedia));
                alertDialog$Builder.g(LocaleController.getString("SaveGroupMediaMessage", R.string.SaveGroupMediaMessage));
                alertDialog$Builder.a.I = org.telegram.ui.ActionBar.y6.pg;
                messageObject47 = r72.T4;
                if (messageObject47 != null) {
                    messageObject48 = r72.T4;
                    if (messageObject48.isVideo()) {
                        messageObject49 = r72.T4;
                        if (!messageObject49.isLivePhoto()) {
                            string = LocaleController.getString("ThisMedia", R.string.ThisMedia);
                            final int i62 = true ? 1 : 0;
                            alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.zr0
                                public final /* synthetic */ hs0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.b2
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i63) {
                                    switch (i62) {
                                        case 0:
                                            hs0 hs0Var = this.b;
                                            hs0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer2 = hs0Var.b;
                                            arrayList3.add(photoViewer2.T4);
                                            PhotoViewer.D(photoViewer2, arrayList3);
                                            break;
                                        default:
                                            hs0 hs0Var2 = this.b;
                                            PhotoViewer photoViewer3 = hs0Var2.b;
                                            MessageObject messageObject62 = photoViewer3.T4;
                                            if (messageObject62 != null) {
                                                File file3 = null;
                                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.T).getPathToAttach(photoViewer3.r1(photoViewer3.P4, null), true) : FileLoader.getInstance(photoViewer3.T).getPathToMessage(photoViewer3.T4.messageOwner);
                                                boolean isVideo = photoViewer3.T4.isVideo();
                                                boolean isLivePhoto = photoViewer3.T4.isLivePhoto();
                                                if (isLivePhoto) {
                                                    TLRPC.Document document2 = MessageObject.getMedia(photoViewer3.T4.messageOwner) != null ? MessageObject.getMedia(photoViewer3.T4.messageOwner).document : null;
                                                    if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                                        file3 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, true);
                                                    }
                                                }
                                                if (!isLivePhoto) {
                                                    if (pathToAttach2 != null && pathToAttach2.exists()) {
                                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new bs0(hs0Var2, isVideo, 0));
                                                        break;
                                                    } else {
                                                        photoViewer3.X2();
                                                        break;
                                                    }
                                                } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new yr0(hs0Var2, 1));
                                                    break;
                                                } else {
                                                    photoViewer3.X2();
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                }
                            });
                            String formatPluralString = (!z16 || z18) ? LocaleController.formatPluralString("AllNMedia", arrayList2.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList2.size(), new Object[0]);
                            final boolean z19 = z17;
                            final boolean z20 = z16;
                            final boolean z21 = z18;
                            alertDialog$Builder.k(formatPluralString, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.es0
                                @Override // org.telegram.ui.ActionBar.b2
                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i63) {
                                    hs0 hs0Var = hs0.this;
                                    PhotoViewer photoViewer2 = hs0Var.b;
                                    int[] iArr = new int[1];
                                    final jr0 jr0Var = new jr0(hs0Var, new int[1], iArr, z20, z19, z21);
                                    int i64 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i64 >= arrayList3.size()) {
                                            return;
                                        }
                                        MessageObject messageObject62 = (MessageObject) arrayList3.get(i64);
                                        if (messageObject62 != null) {
                                            File file3 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer2.T).getPathToAttach(photoViewer2.r1(photoViewer2.P4, null), true) : FileLoader.getInstance(photoViewer2.T).getPathToMessage(messageObject62.messageOwner);
                                            boolean isVideo = messageObject62.isVideo();
                                            boolean isLivePhoto = messageObject62.isLivePhoto();
                                            if (isLivePhoto) {
                                                TLRPC.Document document2 = MessageObject.getMedia(messageObject62.messageOwner) != null ? MessageObject.getMedia(messageObject62.messageOwner).document : null;
                                                if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer2.T).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                                    file3 = FileLoader.getInstance(photoViewer2.T).getPathToAttach(document2, true);
                                                }
                                            }
                                            if (isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                if (file3 == null || !file3.exists()) {
                                                    final int i65 = 1;
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer2.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.as0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i65) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(jr0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(jr0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(jr0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i66 = 0;
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer2.y, new Utilities.Callback() { // from class: org.telegram.ui.as0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(jr0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(jr0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(jr0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i67 = 2;
                                                MediaController.saveFile(pathToAttach2.toString(), photoViewer2.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.as0
                                                    @Override // org.telegram.messenger.Utilities.Callback
                                                    public final void run(Object obj) {
                                                        switch (i67) {
                                                            case 0:
                                                                AndroidUtilities.runOnUIThread(jr0Var);
                                                                break;
                                                            case 1:
                                                                AndroidUtilities.runOnUIThread(jr0Var);
                                                                break;
                                                            default:
                                                                AndroidUtilities.runOnUIThread(jr0Var);
                                                                break;
                                                        }
                                                    }
                                                });
                                            }
                                        }
                                        i64++;
                                    }
                                }
                            });
                            alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new org.telegram.ui.Components.voip.c1(16));
                            org.telegram.ui.ActionBar.e2 a10 = alertDialog$Builder.a();
                            B14 = r72.B1(org.telegram.ui.ActionBar.y6.ug);
                            a10.j(B14);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i63 = org.telegram.ui.ActionBar.y6.q7;
                                org.telegram.ui.ActionBar.f7.V((TextView) d, i63, r72.v2);
                                B16 = r72.B1(i63);
                                d.setBackground(org.telegram.ui.ActionBar.y6.I0(AndroidUtilities.dp(3.0f), B16));
                                ViewGroup viewGroup = a10.v0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            B15 = r72.B1(org.telegram.ui.ActionBar.y6.hg);
                            a10.p(B15);
                            return;
                        }
                    }
                }
                string = LocaleController.getString("ThisPhoto", R.string.ThisPhoto);
                final int i622 = true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.zr0
                    public final /* synthetic */ hs0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i632) {
                        switch (i622) {
                            case 0:
                                hs0 hs0Var = this.b;
                                hs0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer2 = hs0Var.b;
                                arrayList3.add(photoViewer2.T4);
                                PhotoViewer.D(photoViewer2, arrayList3);
                                break;
                            default:
                                hs0 hs0Var2 = this.b;
                                PhotoViewer photoViewer3 = hs0Var2.b;
                                MessageObject messageObject62 = photoViewer3.T4;
                                if (messageObject62 != null) {
                                    File file3 = null;
                                    File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.T).getPathToAttach(photoViewer3.r1(photoViewer3.P4, null), true) : FileLoader.getInstance(photoViewer3.T).getPathToMessage(photoViewer3.T4.messageOwner);
                                    boolean isVideo = photoViewer3.T4.isVideo();
                                    boolean isLivePhoto = photoViewer3.T4.isLivePhoto();
                                    if (isLivePhoto) {
                                        TLRPC.Document document2 = MessageObject.getMedia(photoViewer3.T4.messageOwner) != null ? MessageObject.getMedia(photoViewer3.T4.messageOwner).document : null;
                                        if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                            file3 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, true);
                                        }
                                    }
                                    if (!isLivePhoto) {
                                        if (pathToAttach2 != null && pathToAttach2.exists()) {
                                            MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new bs0(hs0Var2, isVideo, 0));
                                            break;
                                        } else {
                                            photoViewer3.X2();
                                            break;
                                        }
                                    } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new yr0(hs0Var2, 1));
                                        break;
                                    } else {
                                        photoViewer3.X2();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                String formatPluralString2 = (!z16 || z18) ? LocaleController.formatPluralString("AllNMedia", arrayList2.size(), new Object[0]) : LocaleController.formatPluralString("AllNPhotos", arrayList2.size(), new Object[0]);
                final boolean z192 = z17;
                final boolean z202 = z16;
                final boolean z212 = z18;
                alertDialog$Builder.k(formatPluralString2, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.es0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i632) {
                        hs0 hs0Var = hs0.this;
                        PhotoViewer photoViewer2 = hs0Var.b;
                        int[] iArr = new int[1];
                        final jr0 jr0Var = new jr0(hs0Var, new int[1], iArr, z202, z192, z212);
                        int i64 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i64 >= arrayList3.size()) {
                                return;
                            }
                            MessageObject messageObject62 = (MessageObject) arrayList3.get(i64);
                            if (messageObject62 != null) {
                                File file3 = null;
                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer2.T).getPathToAttach(photoViewer2.r1(photoViewer2.P4, null), true) : FileLoader.getInstance(photoViewer2.T).getPathToMessage(messageObject62.messageOwner);
                                boolean isVideo = messageObject62.isVideo();
                                boolean isLivePhoto = messageObject62.isLivePhoto();
                                if (isLivePhoto) {
                                    TLRPC.Document document2 = MessageObject.getMedia(messageObject62.messageOwner) != null ? MessageObject.getMedia(messageObject62.messageOwner).document : null;
                                    if (document2 != null && ((file3 = FileLoader.getInstance(photoViewer2.T).getPathToAttach(document2, false)) == null || !file3.exists())) {
                                        file3 = FileLoader.getInstance(photoViewer2.T).getPathToAttach(document2, true);
                                    }
                                }
                                if (isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        final int i65 = 1;
                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer2.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.as0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i65) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(jr0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(jr0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(jr0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i66 = 0;
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer2.y, new Utilities.Callback() { // from class: org.telegram.ui.as0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(jr0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(jr0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(jr0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i67 = 2;
                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer2.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.as0
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj) {
                                            switch (i67) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(jr0Var);
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(jr0Var);
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(jr0Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i64++;
                        }
                    }
                });
                alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new org.telegram.ui.Components.voip.c1(16));
                org.telegram.ui.ActionBar.e2 a102 = alertDialog$Builder.a();
                B14 = r72.B1(org.telegram.ui.ActionBar.y6.ug);
                a102.j(B14);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                B15 = r72.B1(org.telegram.ui.ActionBar.y6.hg);
                a102.p(B15);
                return;
            }
            messageObject50 = r72.T4;
            if (messageObject50 != null) {
                messageObject55 = r72.T4;
                if (MessageObject.getMedia(messageObject55.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) {
                    messageObject58 = r72.T4;
                    if (MessageObject.getMedia(messageObject58.messageOwner).webpage != null) {
                        messageObject59 = r72.T4;
                        if (MessageObject.getMedia(messageObject59.messageOwner).webpage.document == null) {
                            i58 = r72.P4;
                            r12 = r72.r1(i58, null);
                            i59 = r72.T;
                            file = FileLoader.getInstance(i59).getPathToAttach(r12, true);
                            if (!file.exists()) {
                                file = new File(FileLoader.getDirectory(4), file.getName());
                            }
                            messageObject57 = r72.T4;
                            a2 = messageObject57.isVideo();
                        }
                    }
                }
                i57 = r72.T;
                FileLoader fileLoader = FileLoader.getInstance(i57);
                messageObject56 = r72.T4;
                file = fileLoader.getPathToMessage(messageObject56.messageOwner);
                messageObject57 = r72.T4;
                a2 = messageObject57.isVideo();
            } else {
                imageLocation17 = r72.a5;
                if (imageLocation17 != null) {
                    imageLocation18 = r72.a5;
                    String s12 = PhotoViewer.s1(imageLocation18);
                    i53 = r72.T;
                    ?? fileLoader2 = FileLoader.getInstance(i53);
                    imageLocation19 = r72.a5;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation19 == null ? null : imageLocation19.location;
                    j15 = r72.z5;
                    if (j15 == 0) {
                        z13 = r72.B5;
                        if (!z13) {
                            z12 = false;
                            pathToAttach = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated, s12, z12);
                            if (pathToAttach != null && !pathToAttach.exists()) {
                                i54 = r72.T;
                                ?? fileLoader3 = FileLoader.getInstance(i54);
                                imageLocation20 = r72.a5;
                                pathToAttach = fileLoader3.getPathToAttach(imageLocation20 != null ? null : imageLocation20.location, s12, false);
                            }
                            if (s12 != null) {
                                s12 = s12.toLowerCase();
                            }
                            r14 = s12 == null && (s12.equals("webm") || s12.equals("mp4") || s12.equals("gif"));
                            file = pathToAttach;
                        }
                    }
                    z12 = true;
                    pathToAttach = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated, s12, z12);
                    if (pathToAttach != null) {
                        i54 = r72.T;
                        ?? fileLoader32 = FileLoader.getInstance(i54);
                        imageLocation20 = r72.a5;
                        pathToAttach = fileLoader32.getPathToAttach(imageLocation20 != null ? null : imageLocation20.location, s12, false);
                    }
                    if (s12 != null) {
                    }
                    r14 = s12 == null && (s12.equals("webm") || s12.equals("mp4") || s12.equals("gif"));
                    file = pathToAttach;
                } else {
                    mu0Var7 = r72.j7;
                    if (mu0Var7 != null) {
                        mu0Var8 = r72.j7;
                        i51 = r72.P4;
                        file = mu0Var8.b(i51);
                        mu0Var9 = r72.j7;
                        i52 = r72.P4;
                        a2 = mu0Var9.a(i52);
                    } else {
                        r14 = 0;
                        file = null;
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(FileLoader.getDirectory(4), file.getName());
                }
                messageObject51 = r72.T4;
                if (messageObject51 != null) {
                    messageObject54 = r72.T4;
                    if (messageObject54.isLivePhoto()) {
                        r22 = true;
                        if (r22 != false) {
                            messageObject52 = r72.T4;
                            if (MessageObject.getMedia(messageObject52.messageOwner) != null) {
                                messageObject53 = r72.T4;
                                document = MessageObject.getMedia(messageObject53.messageOwner).document;
                            } else {
                                document = null;
                            }
                            if (document != null) {
                                i55 = r72.T;
                                file2 = FileLoader.getInstance(i55).getPathToAttach(document, false);
                                if (file2 == null || !file2.exists()) {
                                    i56 = r72.T;
                                    file2 = FileLoader.getInstance(i56).getPathToAttach(document, true);
                                }
                                if (r22 == true) {
                                    if (file == null || !file.exists()) {
                                        r72.X2();
                                        return;
                                    }
                                    String file3 = file.toString();
                                    activity21 = r72.y;
                                    MediaController.saveFile(file3, activity21, r14, null, null, new bs0(this, r14, 1));
                                    return;
                                }
                                if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                                    r72.X2();
                                    return;
                                }
                                String file4 = file.toString();
                                String file5 = file2.toString();
                                activity22 = r72.y;
                                MediaController.saveFile(file4, file5, activity22, new yr0(this, 0));
                                return;
                            }
                        }
                        file2 = null;
                        if (r22 == true) {
                        }
                    }
                }
                r22 = false;
                if (r22 != false) {
                }
                file2 = null;
                if (r22 == true) {
                }
            }
            r14 = a2;
            if (file != null) {
                file = new File(FileLoader.getDirectory(4), file.getName());
            }
            messageObject51 = r72.T4;
            if (messageObject51 != null) {
            }
            r22 = false;
            if (r22 != false) {
            }
            file2 = null;
            if (r22 == true) {
            }
        } else {
            if (i10 == 24) {
                rf.b L = rf.b.L();
                o12 = r72.o1();
                L.O(o12);
                w7Var = r72.G0;
                w7Var.performClick();
                return;
            }
            if (i10 == 3) {
                if (r72.E5 != 0) {
                    r72.s4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", r72.E5);
                    org.telegram.ui.Components.ua0 ua0Var = new org.telegram.ui.Components.ua0(bundle, null);
                    wnVar8 = r72.l4;
                    if (wnVar8 != null) {
                        wnVar9 = r72.l4;
                        ua0Var.a0(wnVar9.G8());
                    }
                    r72.H0(false, false);
                    activity16 = r72.y;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = r72.y;
                        ((LaunchActivity) activity17).v0(ua0Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 5 || i10 == 21) {
                messageObject = r72.T4;
                if (messageObject == null) {
                    return;
                }
                Bundle bundle2 = new Bundle();
                long j16 = r72.E5;
                messageObject2 = r72.T4;
                if (messageObject2 != null) {
                    messageObject5 = r72.T4;
                    j16 = messageObject5.getDialogId();
                }
                if (DialogObject.isEncryptedDialog(j16)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(j16));
                } else if (DialogObject.isUserDialog(j16)) {
                    bundle2.putLong("user_id", j16);
                } else {
                    i11 = r72.T;
                    TLRPC.Chat chat2 = MessagesController.getInstance(i11).getChat(Long.valueOf(-j16));
                    if (chat2 != null && chat2.migrated_to != null) {
                        bundle2.putLong("migrated_to", j16);
                        j16 = -chat2.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -j16);
                }
                messageObject3 = r72.T4;
                bundle2.putInt("message_id", messageObject3.getId());
                if (i10 == 21) {
                    messageObject4 = r72.T4;
                    bundle2.putInt("reply_to", messageObject4.getId());
                }
                i12 = r72.T;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                activity = r72.y;
                if (activity instanceof LaunchActivity) {
                    activity2 = r72.y;
                    LaunchActivity launchActivity = (LaunchActivity) activity2;
                    launchActivity.v0(new wn(bundle2), launchActivity.S() > 1 || AndroidUtilities.isTablet(), true);
                }
                r72.H0(false, false);
                r72.T4 = null;
                VideoAds videoAds = r72.U4;
                if (videoAds != null) {
                    videoAds.stop();
                    r72.U4 = null;
                    return;
                }
                return;
            }
            if (i10 == 25) {
                if (r72.m4 != null) {
                    qu0Var6 = r72.d;
                    if (qu0Var6 == null) {
                        return;
                    }
                    messageObject41 = r72.T4;
                    if (messageObject41 != null) {
                        messageObject42 = r72.T4;
                        if (messageObject42.messageOwner == null) {
                            return;
                        }
                        messageObject43 = r72.T4;
                        if (!TextUtils.isEmpty(messageObject43.messageOwner.attachPath)) {
                            messageObject45 = r72.T4;
                            str2 = messageObject45.messageOwner.attachPath;
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                        str2 = null;
                        if (TextUtils.isEmpty(str2)) {
                            i50 = r72.T;
                            FileLoader fileLoader4 = FileLoader.getInstance(i50);
                            messageObject44 = r72.T4;
                            File pathToMessage = fileLoader4.getPathToMessage(messageObject44.messageOwner, true);
                            if (pathToMessage != null && pathToMessage.exists()) {
                                str2 = pathToMessage.getAbsolutePath();
                            }
                        }
                        String str3 = str2;
                        if (TextUtils.isEmpty(str3)) {
                            return;
                        }
                        wnVar7 = r72.l4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str3, 0, false, 0, 0, 0L));
                        this.b.j2(arrayList3, 0, 11, false, new fs0(), wnVar7);
                        r72.Z0(null, null, false, null);
                        r72.p2();
                        ht.o().v();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                messageObject34 = r72.T4;
                if (messageObject34 == null) {
                    return;
                }
                activity12 = r72.y;
                if (!(activity12 instanceof LaunchActivity)) {
                    return;
                }
                messageObject35 = r72.T4;
                if (!messageObject35.scheduled) {
                    messageObject40 = r72.T4;
                    long dialogId = messageObject40.getDialogId();
                    if (DialogObject.isChatDialog(dialogId)) {
                        i49 = r72.T;
                        z11 = ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(i49).getChat(Long.valueOf(-dialogId)));
                        activity13 = r72.y;
                        messageObject36 = r72.T4;
                        ((LaunchActivity) activity13).P0(messageObject36.currentAccount);
                        arrayList = new ArrayList(1);
                        wnVar4 = r72.l4;
                        if (wnVar4 == null) {
                            wnVar6 = r72.l4;
                            messageObject39 = r72.T4;
                            groupedMessages = wnVar6.K8(messageObject39.getGroupId());
                        } else {
                            groupedMessages = null;
                        }
                        if (groupedMessages == null) {
                            arrayList.addAll(groupedMessages.messages);
                        } else {
                            messageObject37 = r72.T4;
                            arrayList.add(messageObject37);
                        }
                        if (!z11 && arrayList.size() <= 1) {
                            PhotoViewer.D(r72, arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            ey eyVar = new ey(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            messageObject38 = r72.T4;
                            arrayList4.add(messageObject38);
                            wnVar5 = r72.l4;
                            eyVar.C2 = new e7(this, arrayList4, wnVar5, 18);
                            activity14 = r72.y;
                            ((LaunchActivity) activity14).v0(eyVar, false, true);
                            r72.H0(false, false);
                            return;
                        }
                        for (int i64 = 0; i64 < arrayList.size(); i64++) {
                            if (!((MessageObject) arrayList.get(i64)).isPhoto() || ((MessageObject) arrayList.get(i64)).isVideo()) {
                                r02 = false;
                                break;
                            }
                        }
                        r02 = true;
                        activity15 = r72.y;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, u6Var);
                        alertDialog$Builder2.l(LocaleController.getString("ForwardGroupMedia", R.string.ForwardGroupMedia));
                        alertDialog$Builder2.g(LocaleController.getString("ForwardGroupMediaMessage", R.string.ForwardGroupMediaMessage));
                        alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.y6.pg;
                        alertDialog$Builder2.h(r02 != false ? LocaleController.getString("ThisPhoto", R.string.ThisPhoto) : LocaleController.getString("ThisMedia", R.string.ThisMedia), new org.telegram.ui.ActionBar.b2(this) { // from class: org.telegram.ui.zr0
                            public final /* synthetic */ hs0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.b2
                            public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i632) {
                                switch (i60) {
                                    case 0:
                                        hs0 hs0Var = this.b;
                                        hs0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer2 = hs0Var.b;
                                        arrayList32.add(photoViewer2.T4);
                                        PhotoViewer.D(photoViewer2, arrayList32);
                                        break;
                                    default:
                                        hs0 hs0Var2 = this.b;
                                        PhotoViewer photoViewer3 = hs0Var2.b;
                                        MessageObject messageObject62 = photoViewer3.T4;
                                        if (messageObject62 != null) {
                                            File file32 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.T).getPathToAttach(photoViewer3.r1(photoViewer3.P4, null), true) : FileLoader.getInstance(photoViewer3.T).getPathToMessage(photoViewer3.T4.messageOwner);
                                            boolean isVideo = photoViewer3.T4.isVideo();
                                            boolean isLivePhoto = photoViewer3.T4.isLivePhoto();
                                            if (isLivePhoto) {
                                                TLRPC.Document document2 = MessageObject.getMedia(photoViewer3.T4.messageOwner) != null ? MessageObject.getMedia(photoViewer3.T4.messageOwner).document : null;
                                                if (document2 != null && ((file32 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, false)) == null || !file32.exists())) {
                                                    file32 = FileLoader.getInstance(photoViewer3.T).getPathToAttach(document2, true);
                                                }
                                            }
                                            if (!isLivePhoto) {
                                                if (pathToAttach2 != null && pathToAttach2.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new bs0(hs0Var2, isVideo, 0));
                                                    break;
                                                } else {
                                                    photoViewer3.X2();
                                                    break;
                                                }
                                            } else if (pathToAttach2 != null && pathToAttach2.exists() && file32 != null && file32.exists()) {
                                                MediaController.saveFile(pathToAttach2.toString(), file32.toString(), photoViewer3.y, new yr0(hs0Var2, 1));
                                                break;
                                            } else {
                                                photoViewer3.X2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.k(r02 != false ? LocaleController.formatPluralString("AllNPhotos", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("AllNMedia", arrayList.size(), new Object[0]), new cf0(9, this, arrayList));
                        alertDialog$Builder2.i(LocaleController.getString("Cancel", R.string.Cancel), new org.telegram.ui.Components.voip.c1(17));
                        org.telegram.ui.ActionBar.e2 a11 = alertDialog$Builder2.a();
                        B1 = r72.B1(org.telegram.ui.ActionBar.y6.ug);
                        a11.j(B1);
                        a11.show();
                        View d10 = a11.d(-3);
                        if (d10 instanceof TextView) {
                            int i65 = org.telegram.ui.ActionBar.y6.q7;
                            org.telegram.ui.ActionBar.f7.V((TextView) d10, i65, r72.v2);
                            B13 = r72.B1(i65);
                            d10.setBackground(org.telegram.ui.ActionBar.y6.I0(AndroidUtilities.dp(3.0f), B13));
                            ViewGroup viewGroup2 = a11.v0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d10.bringToFront();
                            }
                        }
                        B12 = r72.B1(org.telegram.ui.ActionBar.y6.hg);
                        a11.p(B12);
                        return;
                    }
                }
                z11 = false;
                activity13 = r72.y;
                messageObject36 = r72.T4;
                ((LaunchActivity) activity13).P0(messageObject36.currentAccount);
                arrayList = new ArrayList(1);
                wnVar4 = r72.l4;
                if (wnVar4 == null) {
                }
                if (groupedMessages == null) {
                }
                if (!z11) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i10 == 18) {
                    PhotoViewer.F(r72);
                    return;
                }
                if (i10 == 26) {
                    activity11 = r72.y;
                    if (activity11 != null) {
                        qu0Var4 = r72.d;
                        if (qu0Var4 == null) {
                            return;
                        }
                        qu0Var5 = r72.d;
                        qu0Var5.J();
                        r72.H0(true, false);
                        return;
                    }
                    return;
                }
                if (i10 == 7) {
                    activity9 = r72.y;
                    if (activity9 == null) {
                        return;
                    }
                    qu0Var2 = r72.d;
                    if (qu0Var2 == null) {
                        return;
                    }
                    messageObject24 = r72.T4;
                    if (messageObject24 != null) {
                        messageObject32 = r72.T4;
                        if (!messageObject32.scheduled) {
                            messageObject33 = r72.T4;
                            long dialogId2 = messageObject33.getDialogId();
                            if (DialogObject.isChatDialog(dialogId2)) {
                                i48 = r72.T;
                                z10 = ChatObject.isChannel(MessagesController.getInstance(i48).getChat(Long.valueOf(-dialogId2)));
                                activity10 = r72.y;
                                ?? alertDialog$Builder3 = new AlertDialog$Builder(activity10);
                                qu0Var3 = r72.d;
                                b02 = qu0Var3.b0();
                                if (b02 == null) {
                                    alertDialog$Builder3.l(LocaleController.getString("AreYouSureDeletePhotoTitle", R.string.AreYouSureDeletePhotoTitle));
                                    alertDialog$Builder3.g(b02);
                                } else {
                                    if (!r72.t4) {
                                        imageLocation14 = r72.a5;
                                        if (imageLocation14 != null) {
                                            imageLocation15 = r72.a5;
                                            imageLocation16 = r72.Z4;
                                        }
                                        messageObject25 = r72.T4;
                                        if (messageObject25 != null) {
                                            messageObject28 = r72.T4;
                                        }
                                        messageObject26 = r72.T4;
                                        if (messageObject26 != null) {
                                            messageObject27 = r72.T4;
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
                                messageObject29 = r72.T4;
                                if (messageObject29 != null) {
                                    messageObject30 = r72.T4;
                                    if (!messageObject30.scheduled) {
                                        messageObject31 = r72.T4;
                                        long dialogId3 = messageObject31.getDialogId();
                                        if (!DialogObject.isEncryptedDialog(dialogId3)) {
                                            if (DialogObject.isUserDialog(dialogId3)) {
                                                i47 = r72.T;
                                                user = MessagesController.getInstance(i47).getUser(Long.valueOf(dialogId3));
                                                chat = null;
                                            } else {
                                                i41 = r72.T;
                                                chat = MessagesController.getInstance(i41).getChat(Long.valueOf(-dialogId3));
                                                user = null;
                                            }
                                            if (user != null || !ChatObject.isChannel(chat)) {
                                                i42 = r72.T;
                                                int currentTime = ConnectionsManager.getInstance(i42).getCurrentTime();
                                                if (user != null) {
                                                    i46 = r72.T;
                                                    i44 = MessagesController.getInstance(i46).revokeTimePmLimit;
                                                } else {
                                                    i43 = r72.T;
                                                    i44 = MessagesController.getInstance(i43).revokeTimeLimit;
                                                }
                                                if (user != null) {
                                                    long j17 = user.id;
                                                    i45 = r72.T;
                                                }
                                            }
                                        }
                                    }
                                }
                                org.telegram.ui.ActionBar.b2 b2Var = null;
                                String str4 = "Cancel";
                                alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new cf0(10, this, zArr));
                                alertDialog$Builder3.h(LocaleController.getString(str4, R.string.Cancel), b2Var);
                                org.telegram.ui.ActionBar.e2 a12 = alertDialog$Builder3.a();
                                r72.V2(alertDialog$Builder3);
                                textView = (TextView) a12.d(-1);
                                if (textView == null) {
                                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.q7, r72.v2);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z10 = false;
                    activity10 = r72.y;
                    ?? alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    qu0Var3 = r72.d;
                    b02 = qu0Var3.b0();
                    if (b02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    messageObject29 = r72.T4;
                    if (messageObject29 != null) {
                    }
                    org.telegram.ui.ActionBar.b2 b2Var2 = null;
                    String str42 = "Cancel";
                    alertDialog$Builder32.k(LocaleController.getString("Delete", R.string.Delete), new cf0(10, this, zArr2));
                    alertDialog$Builder32.h(LocaleController.getString(str42, R.string.Cancel), b2Var2);
                    org.telegram.ui.ActionBar.e2 a122 = alertDialog$Builder32.a();
                    r72.V2(alertDialog$Builder32);
                    textView = (TextView) a122.d(-1);
                    if (textView == null) {
                    }
                } else {
                    if (i10 == 9 || i10 == 16) {
                        PhotoViewer.H(r72);
                        return;
                    }
                    if (i10 == 10) {
                        try {
                            if (r72.t4) {
                                activity5 = r72.y;
                                messageObject11 = r72.T4;
                                qf.d.r(activity5, MessageObject.getMedia(messageObject11.messageOwner).webpage.url);
                                r72.H0(false, false);
                                return;
                            }
                            messageObject6 = r72.T4;
                            if (messageObject6 == null) {
                                mu0Var = r72.j7;
                                if (mu0Var != null) {
                                    mu0Var2 = r72.j7;
                                    i13 = r72.P4;
                                    TLObject d11 = mu0Var2.d(i13);
                                    activity3 = r72.y;
                                    if (AndroidUtilities.openForView(d11, activity3)) {
                                        r72.H0(false, false);
                                        return;
                                    } else {
                                        r72.X2();
                                        return;
                                    }
                                }
                                return;
                            }
                            messageObject7 = r72.T4;
                            activity4 = r72.y;
                            messageObject8 = r72.T4;
                            if (!messageObject8.isVideo()) {
                                messageObject9 = r72.T4;
                                if (!messageObject9.isPhoto()) {
                                    messageObject10 = r72.T4;
                                    if (!messageObject10.isSticker()) {
                                        z15 = false;
                                    }
                                }
                            }
                            if (AndroidUtilities.openForView(messageObject7, activity4, u6Var, z15)) {
                                r72.H0(false, false);
                                return;
                            } else {
                                r72.X2();
                                return;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (i10 == 11 || i10 == 13) {
                        activity6 = r72.y;
                        if (activity6 != null) {
                            messageObject12 = r72.T4;
                            if (messageObject12 == null) {
                                return;
                            }
                            messageObject13 = r72.T4;
                            if (MessageObject.getMedia(messageObject13.messageOwner) instanceof TLRPC.TL_messageMediaPhoto) {
                                messageObject17 = r72.T4;
                                tLObject = MessageObject.getMedia(messageObject17.messageOwner).photo;
                            } else {
                                messageObject14 = r72.T4;
                                if (!(MessageObject.getMedia(messageObject14.messageOwner) instanceof TLRPC.TL_messageMediaDocument)) {
                                    return;
                                }
                                messageObject15 = r72.T4;
                                tLObject = MessageObject.getMedia(messageObject15.messageOwner).document;
                            }
                            TLObject tLObject2 = tLObject;
                            activity7 = r72.y;
                            messageObject16 = r72.T4;
                            r72.U3 = new gs0(this, activity7, messageObject16, tLObject2, this.a);
                            dz0Var = r72.U3;
                            dz0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i10 == 6) {
                        w0Var = r72.o0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!r72.t4) {
                            r72.k3();
                            return;
                        }
                        ng0Var = r72.f0;
                        if (ng0Var.e()) {
                            if (PhotoViewer.b9 != null) {
                                PhotoViewer.b9.Q0();
                            }
                            r72.J3 = true;
                            photoViewer = PhotoViewer.a9;
                            PhotoViewer.b9 = photoViewer;
                            PhotoViewer.a9 = null;
                            r72.e = false;
                            r72.f = false;
                            su0 su0Var = r72.d5;
                            if (su0Var != null && !su0Var.a.getVisible()) {
                                r72.d5.a.setVisible(true, true);
                            }
                            r72.m6 = 1.0f;
                            r72.e0.invalidate();
                            r72.T0();
                            return;
                        }
                        return;
                    }
                    if (i10 == 8) {
                        messageObject22 = r72.T4;
                        if (messageObject22 == null) {
                            return;
                        }
                        i40 = r72.T;
                        FileLoader fileLoader5 = FileLoader.getInstance(i40);
                        messageObject23 = r72.T4;
                        fileLoader5.cancelLoadFile(messageObject23.getDocument());
                        r72.r2(false);
                        r72.i0.setTag(r3);
                        r72.i0.setVisibility(0);
                        return;
                    }
                    if (i10 == 12) {
                        messageObject19 = r72.T4;
                        if (messageObject19 != null) {
                            messageObject20 = r72.T4;
                            TLRPC.Document document2 = messageObject20.getDocument();
                            wnVar = r72.l4;
                            if (wnVar != null) {
                                wnVar2 = r72.l4;
                                if (wnVar2.Y != null) {
                                    wnVar3 = r72.l4;
                                    wnVar3.Y.j(document2);
                                    i39 = r72.T;
                                    MessagesController messagesController = MessagesController.getInstance(i39);
                                    messageObject21 = r72.T4;
                                    messagesController.saveGif(messageObject21, document2);
                                }
                            }
                            i38 = r72.T;
                            MediaDataController.getInstance(i38).addRecentGif(document2, (int) (System.currentTimeMillis() / 1000), true);
                            i39 = r72.T;
                            MessagesController messagesController2 = MessagesController.getInstance(i39);
                            messageObject21 = r72.T4;
                            messagesController2.saveGif(messageObject21, document2);
                        } else {
                            mu0Var3 = r72.j7;
                            if (mu0Var3 == null) {
                                return;
                            }
                            mu0Var4 = r72.j7;
                            i35 = r72.P4;
                            TLObject d12 = mu0Var4.d(i35);
                            if (d12 instanceof TLRPC.Document) {
                                TLRPC.Document document3 = (TLRPC.Document) d12;
                                i36 = r72.T;
                                MediaDataController.getInstance(i36).addRecentGif(document3, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = r72.T;
                                MessagesController messagesController3 = MessagesController.getInstance(i37);
                                mu0Var5 = r72.j7;
                                messagesController3.saveGif(mu0Var5.g(), document3);
                            }
                        }
                        ku0 ku0Var = r72.e0;
                        if (ku0Var != null) {
                            org.telegram.ui.Components.wc.a0(ku0Var, u6Var).o(org.telegram.ui.Components.vc.y, u6Var).j();
                            return;
                        }
                        return;
                    }
                    if (i10 == 14) {
                        ArrayList arrayList5 = r72.f7;
                        i18 = r72.P4;
                        TLRPC.Photo photo3 = (TLRPC.Photo) arrayList5.get(i18);
                        if (photo3 == null || photo3.sizes.isEmpty()) {
                            return;
                        }
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 800);
                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photo3.sizes, 90);
                        i19 = r72.T;
                        UserConfig userConfig = UserConfig.getInstance(i19);
                        j11 = r72.z5;
                        if (j11 == userConfig.clientUserId) {
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                            tL_inputPhoto.id = photo3.id;
                            tL_inputPhoto.access_hash = photo3.access_hash;
                            tL_inputPhoto.file_reference = photo3.file_reference;
                            i32 = r72.T;
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new cs0(this, userConfig, photo3, i60));
                            i33 = r72.T;
                            TLRPC.User user2 = MessagesController.getInstance(i33).getUser(Long.valueOf(userConfig.clientUserId));
                            if (user2 != null) {
                                TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                                userProfilePhoto.photo_id = photo3.id;
                                userProfilePhoto.dc_id = photo3.dc_id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user2);
                                userConfig.saveConfig(true);
                                i34 = r72.T;
                                NotificationCenter.getInstance(i34).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                            }
                        } else {
                            i20 = r72.T;
                            MessagesController messagesController4 = MessagesController.getInstance(i20);
                            j12 = r72.z5;
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
                            i21 = r72.T;
                            MessagesController messagesController5 = MessagesController.getInstance(i21);
                            j13 = r72.z5;
                            messagesController5.changeChatAvatar(-j13, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                            TLRPC.ChatPhoto chatPhoto = chat3.photo;
                            chatPhoto.dc_id = photo3.dc_id;
                            chatPhoto.photo_small = closestPhotoSizeWithSize2.location;
                            chatPhoto.photo_big = closestPhotoSizeWithSize.location;
                            i22 = r72.T;
                            NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                        }
                        r72.h7 = ImageLocation.getForPhoto(closestPhotoSizeWithSize, photo3);
                        ArrayList arrayList6 = r72.f7;
                        i23 = r72.P4;
                        arrayList6.remove(i23);
                        r72.f7.add(0, photo3);
                        ArrayList arrayList7 = r72.a7;
                        i24 = r72.P4;
                        ImageLocation imageLocation21 = (ImageLocation) arrayList7.get(i24);
                        ArrayList arrayList8 = r72.a7;
                        i25 = r72.P4;
                        arrayList8.remove(i25);
                        r72.a7.add(0, imageLocation21);
                        ArrayList arrayList9 = r72.b7;
                        i26 = r72.P4;
                        ImageLocation imageLocation22 = (ImageLocation) arrayList9.get(i26);
                        ArrayList arrayList10 = r72.b7;
                        i27 = r72.P4;
                        arrayList10.remove(i27);
                        r72.b7.add(0, imageLocation22);
                        ArrayList arrayList11 = r72.c7;
                        i28 = r72.P4;
                        Long l4 = (Long) arrayList11.get(i28);
                        ArrayList arrayList12 = r72.c7;
                        i29 = r72.P4;
                        arrayList12.remove(i29);
                        r72.c7.add(0, l4);
                        ArrayList arrayList13 = r72.d7;
                        i30 = r72.P4;
                        TLRPC.Message message = (TLRPC.Message) arrayList13.get(i30);
                        ArrayList arrayList14 = r72.d7;
                        i31 = r72.P4;
                        arrayList14.remove(i31);
                        r72.d7.add(0, message);
                        r72.P4 = -1;
                        r72.E2(0);
                        org.telegram.ui.Components.g40 g40Var = r72.l1;
                        g40Var.d.clear();
                        g40Var.e.clear();
                        g40Var.c.clear();
                        r72.l1.b();
                        undoView = r72.n1;
                        j14 = r72.z5;
                        imageLocation12 = r72.a5;
                        imageLocation13 = r72.Z4;
                        undoView.m(j14, imageLocation12 == imageLocation13 ? null : 1, 22);
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ds0
                            public final /* synthetic */ hs0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i60) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.o0;
                                        if (w0Var2 != null) {
                                            w0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.o0.t(19);
                                        photoViewer2.o0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.S(19);
                                        photoViewer3.o0.t(20);
                                        break;
                                }
                            }
                        }, 300L);
                        return;
                    }
                    if (i10 == 15) {
                        i16 = r72.T;
                        FileLoader fileLoader6 = FileLoader.getInstance(i16);
                        imageLocation7 = r72.a5;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation7 == null ? null : imageLocation7.location;
                        imageLocation8 = r72.a5;
                        File pathToAttach2 = fileLoader6.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.s1(imageLocation8), true);
                        imageLocation9 = r72.a5;
                        boolean z22 = imageLocation9.imageType == 2;
                        if (z22) {
                            i17 = r72.T;
                            FileLoader fileLoader7 = FileLoader.getInstance(i17);
                            imageLocation10 = r72.Z4;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation10 == null ? null : imageLocation10.location;
                            imageLocation11 = r72.Z4;
                            str = fileLoader7.getPathToAttach(tL_fileLocationToBeDeprecated3, PhotoViewer.s1(imageLocation11), true).getAbsolutePath();
                        } else {
                            str = null;
                        }
                        qu0Var = r72.d;
                        qu0Var.f(pathToAttach2.getAbsolutePath(), str, z22);
                        return;
                    }
                    if (i10 == 19) {
                        int i66 = r72.Q4;
                        if (i66 < 0 || i66 >= r72.Y6.size()) {
                            return;
                        }
                        MessageObject messageObject62 = (MessageObject) r72.Y6.get(r72.Q4);
                        r72.n5 = true;
                        final int i67 = true ? 1 : 0;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ds0
                            public final /* synthetic */ hs0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i67) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.o0;
                                        if (w0Var2 != null) {
                                            w0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.o0.t(19);
                                        photoViewer2.o0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.S(19);
                                        photoViewer3.o0.t(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.T(r72);
                        i15 = r72.T;
                        MessagesController.getInstance(i15).getTranslateController().translatePhoto(messageObject62, new rr0(r72, 3));
                        return;
                    }
                    if (i10 == 20) {
                        r72.n5 = false;
                        final int i68 = 2;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.ds0
                            public final /* synthetic */ hs0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i68) {
                                    case 0:
                                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.b.o0;
                                        if (w0Var2 != null) {
                                            w0Var2.t(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.o0.t(19);
                                        photoViewer2.o0.S(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.S(19);
                                        photoViewer3.o0.t(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.T(r72);
                        return;
                    }
                    if (i10 == 22) {
                        r72.Z2 = !r72.Z2;
                        boolean z23 = r72.Z2;
                        messageObject18 = r72.T4;
                        org.telegram.ui.Components.t81.I(messageObject18, z23);
                        org.telegram.ui.Components.t81 t81Var = r72.F2;
                        if (t81Var != null) {
                            t81Var.N(r72.Z2);
                        }
                        r72.s0.f(r72.Z2);
                        r72.s0.setSelectorColor(r72.Z2 ? 259241196 : 268435455);
                        return;
                    }
                    if (i10 != 23) {
                        return;
                    }
                    imageLocation = r72.Z4;
                    if (imageLocation != null) {
                        imageLocation5 = r72.Z4;
                        if (imageLocation5.photo != null) {
                            imageLocation6 = r72.Z4;
                            photo2 = imageLocation6.photo;
                            photo = photo2;
                            if (photo == null) {
                                return;
                            }
                            i14 = r72.T;
                            activity8 = r72.y;
                            j10 = r72.z5;
                            org.telegram.ui.Components.g5.I(i14, activity8, j10, photo, new di.b());
                            return;
                        }
                    }
                    imageLocation2 = r72.a5;
                    if (imageLocation2 != null) {
                        imageLocation3 = r72.a5;
                        if (imageLocation3.photo != null) {
                            imageLocation4 = r72.a5;
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
