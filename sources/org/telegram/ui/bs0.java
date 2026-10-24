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

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bs0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ org.telegram.ui.ActionBar.g6 a;
    public final /* synthetic */ PhotoViewer b;

    public bs0(PhotoViewer photoViewer, org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = photoViewer;
        this.a = g6Var;
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
        File pathToAttach = fileLoader.getPathToAttach(imageLocation == null ? null : imageLocation.location, PhotoViewer.r1(imageLocation), photoViewer.z5 != 0 || photoViewer.B5);
        File file = new File(FileLoader.getDirectory(4), pathToAttach.getName());
        FileLoader fileLoader2 = FileLoader.getInstance(photoViewer.T);
        ImageLocation imageLocation2 = photoViewer.a5;
        return pathToAttach.exists() || file.exists() || fileLoader2.getPathToAttach(imageLocation2 != null ? imageLocation2.location : null, PhotoViewer.r1(imageLocation2), false).exists();
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x040b, code lost:
    
        if (si.o0.t(r3) != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x07f7, code lost:
    
        if (r8 == org.telegram.messenger.UserConfig.getInstance(r16).getClientUserId()) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x07fb, code lost:
    
        if (r4 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x07fd, code lost:
    
        r8 = r7.T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0807, code lost:
    
        if (org.telegram.messenger.MessagesController.getInstance(r8).canRevokePmInbox == false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0809, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x080c, code lost:
    
        r9 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0814, code lost:
    
        if (r9.messageOwner.action == null) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0816, code lost:
    
        r9 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0820, code lost:
    
        if ((r9.messageOwner.action instanceof org.telegram.tgnet.TLRPC.TL_messageActionEmpty) == false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0823, code lost:
    
        r6 = "Cancel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0826, code lost:
    
        r9 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x082e, code lost:
    
        if (r9.isOut() != false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0830, code lost:
    
        if (r8 != false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0836, code lost:
    
        if (org.telegram.messenger.ChatObject.hasAdminRights(r10) == false) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0838, code lost:
    
        r8 = r7.T4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0841, code lost:
    
        if ((r12 - r8.messageOwner.date) > r13) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0843, code lost:
    
        r9 = r7.y;
        r8 = new android.widget.FrameLayout(r9);
        r12 = r7.y;
        r8 = new org.telegram.ui.Cells.z1(r12, 1, r2);
        r8.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.M0(false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x085d, code lost:
    
        if (r10 == null) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x085f, code lost:
    
        r4 = r8;
        r2 = null;
        r8.e(org.telegram.messenger.LocaleController.getString("DeleteForAll", org.telegram.messenger.R.string.DeleteForAll), "", false, false, false);
        r5 = 5;
        r6 = "Cancel";
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x089f, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x08a1, code lost:
    
        r9 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x08ac, code lost:
    
        if (org.telegram.messenger.LocaleController.isRTL == false) goto L384;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x08ae, code lost:
    
        r10 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x08b7, code lost:
    
        r8.setPadding(r9, 0, r10, 0);
        r4.addView(r8, w7.z5.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r8.setOnClickListener(new org.telegram.ui.o8(r5, r0));
        r3.o(r4);
        r3.a.G = 9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x08b3, code lost:
    
        r10 = org.telegram.messenger.AndroidUtilities.dp(16.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x08a6, code lost:
    
        r9 = org.telegram.messenger.AndroidUtilities.dp(8.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0878, code lost:
    
        r2 = null;
        r4 = org.telegram.messenger.LocaleController.formatString("DeleteForUser", org.telegram.messenger.R.string.DeleteForUser, org.telegram.messenger.UserObject.getFirstName(r4));
        r4 = r8;
        r5 = 5;
        r6 = "Cancel";
        r8.e(r4, "", false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x080b, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x07f9, code lost:
    
        if (r10 != null) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x06cf, code lost:
    
        if (r4 == r12) goto L309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x06df, code lost:
    
        if (r4.isVideo() != false) goto L326;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0772  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:343:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0dd1  */
    /* JADX WARN: Removed duplicated region for block: B:539:? A[RETURN, SYNTHETIC] */
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
    /* JADX WARN: Type inference failed for: r2v131, types: [org.telegram.messenger.FileLoader] */
    /* JADX WARN: Type inference failed for: r2v135, types: [org.telegram.messenger.FileLoader] */
    /* JADX WARN: Type inference failed for: r2v138 */
    /* JADX WARN: Type inference failed for: r2v139 */
    /* JADX WARN: Type inference failed for: r2v146 */
    /* JADX WARN: Type inference failed for: r3v27, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.telegram.ui.PhotoViewer] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v41 */
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
        gu0 gu0Var;
        gu0 gu0Var2;
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
        org.telegram.ui.Components.ty0 ty0Var;
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
        ku0 ku0Var;
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
        gu0 gu0Var3;
        gu0 gu0Var4;
        int i35;
        int i36;
        int i37;
        gu0 gu0Var5;
        MessageObject messageObject20;
        sn snVar;
        int i38;
        int i39;
        MessageObject messageObject21;
        sn snVar2;
        sn snVar3;
        MessageObject messageObject22;
        int i40;
        MessageObject messageObject23;
        org.telegram.ui.ActionBar.u0 u0Var;
        View findViewWithTag;
        org.telegram.ui.Components.pg0 pg0Var;
        PhotoViewer photoViewer;
        Activity activity9;
        ku0 ku0Var2;
        MessageObject messageObject24;
        boolean z10;
        Activity activity10;
        ku0 ku0Var3;
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
        ku0 ku0Var4;
        ku0 ku0Var5;
        MessageObject messageObject34;
        Activity activity12;
        MessageObject messageObject35;
        boolean z11;
        Activity activity13;
        MessageObject messageObject36;
        ArrayList arrayList;
        sn snVar4;
        String str2;
        MessageObject.GroupedMessages groupedMessages;
        MessageObject messageObject37;
        MessageObject messageObject38;
        sn snVar5;
        Activity activity14;
        ?? r02;
        Activity activity15;
        int A1;
        int A12;
        int A13;
        sn snVar6;
        MessageObject messageObject39;
        MessageObject messageObject40;
        int i49;
        ku0 ku0Var6;
        MessageObject messageObject41;
        MessageObject messageObject42;
        MessageObject messageObject43;
        String str3;
        sn snVar7;
        int i50;
        MessageObject messageObject44;
        MessageObject messageObject45;
        sn snVar8;
        Activity activity16;
        Activity activity17;
        sn snVar9;
        qf.g n12;
        org.telegram.ui.Components.u7 u7Var;
        gu0 gu0Var6;
        Activity activity18;
        Activity activity19;
        sn snVar10;
        MessageObject.GroupedMessages groupedMessages2;
        MessageObject messageObject46;
        Activity activity20;
        MessageObject messageObject47;
        String string;
        int A14;
        View d;
        int A15;
        int A16;
        MessageObject messageObject48;
        MessageObject messageObject49;
        MessageObject messageObject50;
        ImageLocation imageLocation17;
        gu0 gu0Var7;
        ?? r14;
        File file;
        gu0 gu0Var8;
        int i51;
        gu0 gu0Var9;
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
        TLObject q12;
        int i59;
        sn snVar11;
        MessageObject messageObject60;
        boolean z14;
        boolean J1;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        boolean z15 = true;
        z15 = true;
        z15 = true;
        ?? r72 = this.b;
        if (i10 == -1) {
            jt0 jt0Var = r72.L1;
            if (jt0Var == null || !jt0Var.o0()) {
                J1 = r72.J1();
                if (J1) {
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
            gu0Var6 = r72.j7;
            if (gu0Var6 != null) {
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
            snVar10 = r72.l4;
            if (snVar10 != null) {
                snVar11 = r72.l4;
                messageObject60 = r72.T4;
                groupedMessages2 = snVar11.D8(messageObject60.getGroupId());
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
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity20, g6Var);
                alertDialog$Builder.l(LocaleController.getString("SaveGroupMedia", R.string.SaveGroupMedia));
                alertDialog$Builder.g(LocaleController.getString("SaveGroupMediaMessage", R.string.SaveGroupMediaMessage));
                alertDialog$Builder.a.I = org.telegram.ui.ActionBar.k6.pg;
                messageObject47 = r72.T4;
                if (messageObject47 != null) {
                    messageObject48 = r72.T4;
                    if (messageObject48.isVideo()) {
                        messageObject49 = r72.T4;
                        if (!messageObject49.isLivePhoto()) {
                            string = LocaleController.getString("ThisMedia", R.string.ThisMedia);
                            final int i62 = true ? 1 : 0;
                            alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.tr0
                                public final /* synthetic */ bs0 b;

                                {
                                    this.b = this;
                                }

                                @Override // org.telegram.ui.ActionBar.z1
                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i63) {
                                    switch (i62) {
                                        case 0:
                                            bs0 bs0Var = this.b;
                                            bs0Var.getClass();
                                            ArrayList arrayList3 = new ArrayList(1);
                                            PhotoViewer photoViewer2 = bs0Var.b;
                                            arrayList3.add(photoViewer2.T4);
                                            PhotoViewer.D(photoViewer2, arrayList3);
                                            break;
                                        default:
                                            bs0 bs0Var2 = this.b;
                                            PhotoViewer photoViewer3 = bs0Var2.b;
                                            MessageObject messageObject62 = photoViewer3.T4;
                                            if (messageObject62 != null) {
                                                File file3 = null;
                                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.T).getPathToAttach(photoViewer3.q1(photoViewer3.P4, null), true) : FileLoader.getInstance(photoViewer3.T).getPathToMessage(photoViewer3.T4.messageOwner);
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
                                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new vr0(bs0Var2, isVideo, 0));
                                                        break;
                                                    } else {
                                                        photoViewer3.W2();
                                                        break;
                                                    }
                                                } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new sr0(bs0Var2, 1));
                                                    break;
                                                } else {
                                                    photoViewer3.W2();
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
                            alertDialog$Builder.k(formatPluralString, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yr0
                                @Override // org.telegram.ui.ActionBar.z1
                                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i63) {
                                    bs0 bs0Var = bs0.this;
                                    PhotoViewer photoViewer2 = bs0Var.b;
                                    int[] iArr = new int[1];
                                    final dr0 dr0Var = new dr0(bs0Var, new int[1], iArr, z20, z19, z21);
                                    int i64 = 0;
                                    while (true) {
                                        ArrayList arrayList3 = arrayList2;
                                        if (i64 >= arrayList3.size()) {
                                            return;
                                        }
                                        MessageObject messageObject62 = (MessageObject) arrayList3.get(i64);
                                        if (messageObject62 != null) {
                                            File file3 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer2.T).getPathToAttach(photoViewer2.q1(photoViewer2.P4, null), true) : FileLoader.getInstance(photoViewer2.T).getPathToMessage(messageObject62.messageOwner);
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
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer2.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.ur0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i65) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(dr0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(dr0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(dr0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    final int i66 = 0;
                                                    MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer2.y, new Utilities.Callback() { // from class: org.telegram.ui.ur0
                                                        @Override // org.telegram.messenger.Utilities.Callback
                                                        public final void run(Object obj) {
                                                            switch (i66) {
                                                                case 0:
                                                                    AndroidUtilities.runOnUIThread(dr0Var);
                                                                    break;
                                                                case 1:
                                                                    AndroidUtilities.runOnUIThread(dr0Var);
                                                                    break;
                                                                default:
                                                                    AndroidUtilities.runOnUIThread(dr0Var);
                                                                    break;
                                                            }
                                                        }
                                                    });
                                                }
                                            } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                                iArr[0] = iArr[0] + 1;
                                                final int i67 = 2;
                                                MediaController.saveFile(pathToAttach2.toString(), photoViewer2.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.ur0
                                                    @Override // org.telegram.messenger.Utilities.Callback
                                                    public final void run(Object obj) {
                                                        switch (i67) {
                                                            case 0:
                                                                AndroidUtilities.runOnUIThread(dr0Var);
                                                                break;
                                                            case 1:
                                                                AndroidUtilities.runOnUIThread(dr0Var);
                                                                break;
                                                            default:
                                                                AndroidUtilities.runOnUIThread(dr0Var);
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
                            alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new wv(13));
                            org.telegram.ui.ActionBar.c2 a10 = alertDialog$Builder.a();
                            A14 = r72.A1(org.telegram.ui.ActionBar.k6.ug);
                            a10.j(A14);
                            a10.show();
                            d = a10.d(-3);
                            if (d instanceof TextView) {
                                int i63 = org.telegram.ui.ActionBar.k6.q7;
                                org.telegram.ui.ActionBar.r6.W((TextView) d, i63, r72.v2);
                                A16 = r72.A1(i63);
                                d.setBackground(org.telegram.ui.ActionBar.k6.I0(AndroidUtilities.dp(3.0f), A16));
                                ViewGroup viewGroup = a10.v0;
                                if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                                    d.bringToFront();
                                }
                            }
                            A15 = r72.A1(org.telegram.ui.ActionBar.k6.hg);
                            a10.p(A15);
                            return;
                        }
                    }
                }
                string = LocaleController.getString("ThisPhoto", R.string.ThisPhoto);
                final int i622 = true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.tr0
                    public final /* synthetic */ bs0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i632) {
                        switch (i622) {
                            case 0:
                                bs0 bs0Var = this.b;
                                bs0Var.getClass();
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer2 = bs0Var.b;
                                arrayList3.add(photoViewer2.T4);
                                PhotoViewer.D(photoViewer2, arrayList3);
                                break;
                            default:
                                bs0 bs0Var2 = this.b;
                                PhotoViewer photoViewer3 = bs0Var2.b;
                                MessageObject messageObject62 = photoViewer3.T4;
                                if (messageObject62 != null) {
                                    File file3 = null;
                                    File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.T).getPathToAttach(photoViewer3.q1(photoViewer3.P4, null), true) : FileLoader.getInstance(photoViewer3.T).getPathToMessage(photoViewer3.T4.messageOwner);
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
                                            MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new vr0(bs0Var2, isVideo, 0));
                                            break;
                                        } else {
                                            photoViewer3.W2();
                                            break;
                                        }
                                    } else if (pathToAttach2 != null && pathToAttach2.exists() && file3 != null && file3.exists()) {
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer3.y, new sr0(bs0Var2, 1));
                                        break;
                                    } else {
                                        photoViewer3.W2();
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
                alertDialog$Builder.k(formatPluralString2, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yr0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i632) {
                        bs0 bs0Var = bs0.this;
                        PhotoViewer photoViewer2 = bs0Var.b;
                        int[] iArr = new int[1];
                        final dr0 dr0Var = new dr0(bs0Var, new int[1], iArr, z202, z192, z212);
                        int i64 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i64 >= arrayList3.size()) {
                                return;
                            }
                            MessageObject messageObject62 = (MessageObject) arrayList3.get(i64);
                            if (messageObject62 != null) {
                                File file3 = null;
                                File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(messageObject62.messageOwner).webpage != null && MessageObject.getMedia(messageObject62.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer2.T).getPathToAttach(photoViewer2.q1(photoViewer2.P4, null), true) : FileLoader.getInstance(photoViewer2.T).getPathToMessage(messageObject62.messageOwner);
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
                                        MediaController.saveFile(pathToAttach2.toString(), photoViewer2.y, 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.ur0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i65) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(dr0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(dr0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(dr0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        final int i66 = 0;
                                        MediaController.saveFile(pathToAttach2.toString(), file3.toString(), photoViewer2.y, new Utilities.Callback() { // from class: org.telegram.ui.ur0
                                            @Override // org.telegram.messenger.Utilities.Callback
                                            public final void run(Object obj) {
                                                switch (i66) {
                                                    case 0:
                                                        AndroidUtilities.runOnUIThread(dr0Var);
                                                        break;
                                                    case 1:
                                                        AndroidUtilities.runOnUIThread(dr0Var);
                                                        break;
                                                    default:
                                                        AndroidUtilities.runOnUIThread(dr0Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!isLivePhoto && pathToAttach2 != null && pathToAttach2.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final int i67 = 2;
                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer2.y, isVideo ? 1 : 0, null, null, new Utilities.Callback() { // from class: org.telegram.ui.ur0
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj) {
                                            switch (i67) {
                                                case 0:
                                                    AndroidUtilities.runOnUIThread(dr0Var);
                                                    break;
                                                case 1:
                                                    AndroidUtilities.runOnUIThread(dr0Var);
                                                    break;
                                                default:
                                                    AndroidUtilities.runOnUIThread(dr0Var);
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
                alertDialog$Builder.i(LocaleController.getString("Cancel", R.string.Cancel), new wv(13));
                org.telegram.ui.ActionBar.c2 a102 = alertDialog$Builder.a();
                A14 = r72.A1(org.telegram.ui.ActionBar.k6.ug);
                a102.j(A14);
                a102.show();
                d = a102.d(-3);
                if (d instanceof TextView) {
                }
                A15 = r72.A1(org.telegram.ui.ActionBar.k6.hg);
                a102.p(A15);
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
                            q12 = r72.q1(i58, null);
                            i59 = r72.T;
                            file = FileLoader.getInstance(i59).getPathToAttach(q12, true);
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
                    String r12 = PhotoViewer.r1(imageLocation18);
                    i53 = r72.T;
                    ?? fileLoader2 = FileLoader.getInstance(i53);
                    imageLocation19 = r72.a5;
                    TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation19 == null ? null : imageLocation19.location;
                    j15 = r72.z5;
                    if (j15 == 0) {
                        z13 = r72.B5;
                        if (!z13) {
                            z12 = false;
                            pathToAttach = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated, r12, z12);
                            if (pathToAttach != null && !pathToAttach.exists()) {
                                i54 = r72.T;
                                ?? fileLoader3 = FileLoader.getInstance(i54);
                                imageLocation20 = r72.a5;
                                pathToAttach = fileLoader3.getPathToAttach(imageLocation20 != null ? null : imageLocation20.location, r12, false);
                            }
                            if (r12 != null) {
                                r12 = r12.toLowerCase();
                            }
                            r14 = r12 == null && (r12.equals("webm") || r12.equals("mp4") || r12.equals("gif"));
                            file = pathToAttach;
                        }
                    }
                    z12 = true;
                    pathToAttach = fileLoader2.getPathToAttach(tL_fileLocationToBeDeprecated, r12, z12);
                    if (pathToAttach != null) {
                        i54 = r72.T;
                        ?? fileLoader32 = FileLoader.getInstance(i54);
                        imageLocation20 = r72.a5;
                        pathToAttach = fileLoader32.getPathToAttach(imageLocation20 != null ? null : imageLocation20.location, r12, false);
                    }
                    if (r12 != null) {
                    }
                    r14 = r12 == null && (r12.equals("webm") || r12.equals("mp4") || r12.equals("gif"));
                    file = pathToAttach;
                } else {
                    gu0Var7 = r72.j7;
                    if (gu0Var7 != null) {
                        gu0Var8 = r72.j7;
                        i51 = r72.P4;
                        file = gu0Var8.b(i51);
                        gu0Var9 = r72.j7;
                        i52 = r72.P4;
                        a2 = gu0Var9.a(i52);
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
                                        r72.W2();
                                        return;
                                    }
                                    String file3 = file.toString();
                                    activity21 = r72.y;
                                    MediaController.saveFile(file3, activity21, r14, null, null, new vr0(this, r14, 1));
                                    return;
                                }
                                if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                                    r72.W2();
                                    return;
                                }
                                String file4 = file.toString();
                                String file5 = file2.toString();
                                activity22 = r72.y;
                                MediaController.saveFile(file4, file5, activity22, new sr0(this, 0));
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
                qf.b Y = qf.b.Y();
                n12 = r72.n1();
                Y.d0(n12);
                u7Var = r72.G0;
                u7Var.performClick();
                return;
            }
            if (i10 == 3) {
                if (r72.E5 != 0) {
                    r72.s4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", r72.E5);
                    org.telegram.ui.Components.xa0 xa0Var = new org.telegram.ui.Components.xa0(bundle, null);
                    snVar8 = r72.l4;
                    if (snVar8 != null) {
                        snVar9 = r72.l4;
                        xa0Var.X(snVar9.A8());
                    }
                    r72.H0(false, false);
                    activity16 = r72.y;
                    if (activity16 instanceof LaunchActivity) {
                        activity17 = r72.y;
                        ((LaunchActivity) activity17).v0(xa0Var, false, true);
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
                    launchActivity.v0(new sn(bundle2), launchActivity.S() > 1 || AndroidUtilities.isTablet(), true);
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
                    ku0Var6 = r72.d;
                    if (ku0Var6 == null) {
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
                            str3 = messageObject45.messageOwner.attachPath;
                            if (!TextUtils.isEmpty(str3)) {
                            }
                        }
                        str3 = null;
                        if (TextUtils.isEmpty(str3)) {
                            i50 = r72.T;
                            FileLoader fileLoader4 = FileLoader.getInstance(i50);
                            messageObject44 = r72.T4;
                            File pathToMessage = fileLoader4.getPathToMessage(messageObject44.messageOwner, true);
                            if (pathToMessage != null && pathToMessage.exists()) {
                                str3 = pathToMessage.getAbsolutePath();
                            }
                        }
                        String str4 = str3;
                        if (TextUtils.isEmpty(str4)) {
                            return;
                        }
                        snVar7 = r72.l4;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str4, 0, false, 0, 0, 0L));
                        this.b.i2(arrayList3, 0, 11, false, new zr0(), snVar7);
                        r72.Z0(null, null, false, null);
                        r72.o2();
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
                        snVar4 = r72.l4;
                        if (snVar4 == null) {
                            snVar6 = r72.l4;
                            messageObject39 = r72.T4;
                            str2 = "Cancel";
                            groupedMessages = snVar6.D8(messageObject39.getGroupId());
                        } else {
                            str2 = "Cancel";
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
                            snVar5 = r72.l4;
                            eyVar.C2 = new e7(this, arrayList4, snVar5, 18);
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
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(activity15, g6Var);
                        alertDialog$Builder2.l(LocaleController.getString("ForwardGroupMedia", R.string.ForwardGroupMedia));
                        alertDialog$Builder2.g(LocaleController.getString("ForwardGroupMediaMessage", R.string.ForwardGroupMediaMessage));
                        alertDialog$Builder2.a.I = org.telegram.ui.ActionBar.k6.pg;
                        alertDialog$Builder2.h(r02 != false ? LocaleController.getString("ThisPhoto", R.string.ThisPhoto) : LocaleController.getString("ThisMedia", R.string.ThisMedia), new org.telegram.ui.ActionBar.z1(this) { // from class: org.telegram.ui.tr0
                            public final /* synthetic */ bs0 b;

                            {
                                this.b = this;
                            }

                            @Override // org.telegram.ui.ActionBar.z1
                            public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i632) {
                                switch (i60) {
                                    case 0:
                                        bs0 bs0Var = this.b;
                                        bs0Var.getClass();
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer2 = bs0Var.b;
                                        arrayList32.add(photoViewer2.T4);
                                        PhotoViewer.D(photoViewer2, arrayList32);
                                        break;
                                    default:
                                        bs0 bs0Var2 = this.b;
                                        PhotoViewer photoViewer3 = bs0Var2.b;
                                        MessageObject messageObject62 = photoViewer3.T4;
                                        if (messageObject62 != null) {
                                            File file32 = null;
                                            File pathToAttach2 = ((MessageObject.getMedia(messageObject62.messageOwner) instanceof TLRPC.TL_messageMediaWebPage) && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage != null && MessageObject.getMedia(photoViewer3.T4.messageOwner).webpage.document == null) ? FileLoader.getInstance(photoViewer3.T).getPathToAttach(photoViewer3.q1(photoViewer3.P4, null), true) : FileLoader.getInstance(photoViewer3.T).getPathToMessage(photoViewer3.T4.messageOwner);
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
                                                    MediaController.saveFile(pathToAttach2.toString(), photoViewer3.y, isVideo ? 1 : 0, null, null, new vr0(bs0Var2, isVideo, 0));
                                                    break;
                                                } else {
                                                    photoViewer3.W2();
                                                    break;
                                                }
                                            } else if (pathToAttach2 != null && pathToAttach2.exists() && file32 != null && file32.exists()) {
                                                MediaController.saveFile(pathToAttach2.toString(), file32.toString(), photoViewer3.y, new sr0(bs0Var2, 1));
                                                break;
                                            } else {
                                                photoViewer3.W2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.k(r02 != false ? LocaleController.formatPluralString("AllNPhotos", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("AllNMedia", arrayList.size(), new Object[0]), new ql0(5, this, arrayList));
                        alertDialog$Builder2.i(LocaleController.getString(str2, R.string.Cancel), new wv(14));
                        org.telegram.ui.ActionBar.c2 a11 = alertDialog$Builder2.a();
                        A1 = r72.A1(org.telegram.ui.ActionBar.k6.ug);
                        a11.j(A1);
                        a11.show();
                        View d10 = a11.d(-3);
                        if (d10 instanceof TextView) {
                            int i65 = org.telegram.ui.ActionBar.k6.q7;
                            org.telegram.ui.ActionBar.r6.W((TextView) d10, i65, r72.v2);
                            A13 = r72.A1(i65);
                            d10.setBackground(org.telegram.ui.ActionBar.k6.I0(AndroidUtilities.dp(3.0f), A13));
                            ViewGroup viewGroup2 = a11.v0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                d10.bringToFront();
                            }
                        }
                        A12 = r72.A1(org.telegram.ui.ActionBar.k6.hg);
                        a11.p(A12);
                        return;
                    }
                }
                z11 = false;
                activity13 = r72.y;
                messageObject36 = r72.T4;
                ((LaunchActivity) activity13).P0(messageObject36.currentAccount);
                arrayList = new ArrayList(1);
                snVar4 = r72.l4;
                if (snVar4 == null) {
                }
                if (groupedMessages == null) {
                }
                if (!z11) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i10 == 18) {
                    PhotoViewer.E(r72);
                    return;
                }
                if (i10 == 26) {
                    activity11 = r72.y;
                    if (activity11 != null) {
                        ku0Var4 = r72.d;
                        if (ku0Var4 == null) {
                            return;
                        }
                        ku0Var5 = r72.d;
                        ku0Var5.J();
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
                    ku0Var2 = r72.d;
                    if (ku0Var2 == null) {
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
                                ku0Var3 = r72.d;
                                b02 = ku0Var3.b0();
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
                                String str5 = "Cancel";
                                org.telegram.ui.ActionBar.z1 z1Var = null;
                                alertDialog$Builder3.k(LocaleController.getString("Delete", R.string.Delete), new ql0(6, this, zArr));
                                alertDialog$Builder3.h(LocaleController.getString(str5, R.string.Cancel), z1Var);
                                org.telegram.ui.ActionBar.c2 a12 = alertDialog$Builder3.a();
                                r72.U2(alertDialog$Builder3);
                                textView = (TextView) a12.d(-1);
                                if (textView == null) {
                                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.q7, r72.v2);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    z10 = false;
                    activity10 = r72.y;
                    ?? alertDialog$Builder32 = new AlertDialog$Builder(activity10);
                    ku0Var3 = r72.d;
                    b02 = ku0Var3.b0();
                    if (b02 == null) {
                    }
                    boolean[] zArr2 = new boolean[1];
                    messageObject29 = r72.T4;
                    if (messageObject29 != null) {
                    }
                    String str52 = "Cancel";
                    org.telegram.ui.ActionBar.z1 z1Var2 = null;
                    alertDialog$Builder32.k(LocaleController.getString("Delete", R.string.Delete), new ql0(6, this, zArr2));
                    alertDialog$Builder32.h(LocaleController.getString(str52, R.string.Cancel), z1Var2);
                    org.telegram.ui.ActionBar.c2 a122 = alertDialog$Builder32.a();
                    r72.U2(alertDialog$Builder32);
                    textView = (TextView) a122.d(-1);
                    if (textView == null) {
                    }
                } else {
                    if (i10 == 9 || i10 == 16) {
                        PhotoViewer.G(r72);
                        return;
                    }
                    if (i10 == 10) {
                        try {
                            if (r72.t4) {
                                activity5 = r72.y;
                                messageObject11 = r72.T4;
                                pf.d.r(activity5, MessageObject.getMedia(messageObject11.messageOwner).webpage.url);
                                r72.H0(false, false);
                                return;
                            }
                            messageObject6 = r72.T4;
                            if (messageObject6 == null) {
                                gu0Var = r72.j7;
                                if (gu0Var != null) {
                                    gu0Var2 = r72.j7;
                                    i13 = r72.P4;
                                    TLObject d11 = gu0Var2.d(i13);
                                    activity3 = r72.y;
                                    if (AndroidUtilities.openForView(d11, activity3)) {
                                        r72.H0(false, false);
                                        return;
                                    } else {
                                        r72.W2();
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
                            if (AndroidUtilities.openForView(messageObject7, activity4, g6Var, z15)) {
                                r72.H0(false, false);
                                return;
                            } else {
                                r72.W2();
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
                            r72.U3 = new as0(this, activity7, messageObject16, tLObject2, this.a);
                            ty0Var = r72.U3;
                            ty0Var.show();
                            return;
                        }
                        return;
                    }
                    if (i10 == 6) {
                        u0Var = r72.o0;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = u0Var.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        if (!r72.t4) {
                            r72.j3();
                            return;
                        }
                        pg0Var = r72.f0;
                        if (pg0Var.e()) {
                            if (PhotoViewer.b9 != null) {
                                PhotoViewer.b9.R0();
                            }
                            r72.J3 = true;
                            photoViewer = PhotoViewer.a9;
                            PhotoViewer.b9 = photoViewer;
                            PhotoViewer.a9 = null;
                            r72.e = false;
                            r72.f = false;
                            mu0 mu0Var = r72.d5;
                            if (mu0Var != null && !mu0Var.a.getVisible()) {
                                r72.d5.a.setVisible(true, true);
                            }
                            r72.m6 = 1.0f;
                            r72.e0.invalidate();
                            r72.U0();
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
                        r72.q2(false);
                        r72.i0.setTag(r3);
                        r72.i0.setVisibility(0);
                        return;
                    }
                    if (i10 == 12) {
                        messageObject19 = r72.T4;
                        if (messageObject19 != null) {
                            messageObject20 = r72.T4;
                            TLRPC.Document document2 = messageObject20.getDocument();
                            snVar = r72.l4;
                            if (snVar != null) {
                                snVar2 = r72.l4;
                                if (snVar2.Y != null) {
                                    snVar3 = r72.l4;
                                    snVar3.Y.k(document2);
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
                            gu0Var3 = r72.j7;
                            if (gu0Var3 == null) {
                                return;
                            }
                            gu0Var4 = r72.j7;
                            i35 = r72.P4;
                            TLObject d12 = gu0Var4.d(i35);
                            if (d12 instanceof TLRPC.Document) {
                                TLRPC.Document document3 = (TLRPC.Document) d12;
                                i36 = r72.T;
                                MediaDataController.getInstance(i36).addRecentGif(document3, (int) (System.currentTimeMillis() / 1000), true);
                                i37 = r72.T;
                                MessagesController messagesController3 = MessagesController.getInstance(i37);
                                gu0Var5 = r72.j7;
                                messagesController3.saveGif(gu0Var5.g(), document3);
                            }
                        }
                        eu0 eu0Var = r72.e0;
                        if (eu0Var != null) {
                            org.telegram.ui.Components.xc.Z(eu0Var, g6Var).o(org.telegram.ui.Components.wc.y, g6Var).j();
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
                            ConnectionsManager.getInstance(i32).sendRequest(tL_photos_updateProfilePhoto, new wr0(this, userConfig, photo3, i60));
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
                        r72.D2(0);
                        org.telegram.ui.Components.e40 e40Var = r72.l1;
                        e40Var.d.clear();
                        e40Var.e.clear();
                        e40Var.c.clear();
                        r72.l1.b();
                        undoView = r72.n1;
                        j14 = r72.z5;
                        imageLocation12 = r72.a5;
                        imageLocation13 = r72.Z4;
                        undoView.m(j14, imageLocation12 == imageLocation13 ? null : 1, 22);
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.xr0
                            public final /* synthetic */ bs0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i60) {
                                    case 0:
                                        org.telegram.ui.ActionBar.u0 u0Var2 = this.b.b.o0;
                                        if (u0Var2 != null) {
                                            u0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.o0.r(19);
                                        photoViewer2.o0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.K(19);
                                        photoViewer3.o0.r(20);
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
                        File pathToAttach2 = fileLoader6.getPathToAttach(tL_fileLocationToBeDeprecated2, PhotoViewer.r1(imageLocation8), true);
                        imageLocation9 = r72.a5;
                        boolean z22 = imageLocation9.imageType == 2;
                        if (z22) {
                            i17 = r72.T;
                            FileLoader fileLoader7 = FileLoader.getInstance(i17);
                            imageLocation10 = r72.Z4;
                            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation10 == null ? null : imageLocation10.location;
                            imageLocation11 = r72.Z4;
                            str = fileLoader7.getPathToAttach(tL_fileLocationToBeDeprecated3, PhotoViewer.r1(imageLocation11), true).getAbsolutePath();
                        } else {
                            str = null;
                        }
                        ku0Var = r72.d;
                        ku0Var.f(pathToAttach2.getAbsolutePath(), str, z22);
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
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.xr0
                            public final /* synthetic */ bs0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i67) {
                                    case 0:
                                        org.telegram.ui.ActionBar.u0 u0Var2 = this.b.b.o0;
                                        if (u0Var2 != null) {
                                            u0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.o0.r(19);
                                        photoViewer2.o0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.K(19);
                                        photoViewer3.o0.r(20);
                                        break;
                                }
                            }
                        }, 32L);
                        PhotoViewer.T(r72);
                        i15 = r72.T;
                        MessagesController.getInstance(i15).getTranslateController().translatePhoto(messageObject62, new lr0(r72, 3));
                        return;
                    }
                    if (i10 == 20) {
                        r72.n5 = false;
                        final int i68 = 2;
                        AndroidUtilities.runOnUIThread(new Runnable(this) { // from class: org.telegram.ui.xr0
                            public final /* synthetic */ bs0 b;

                            {
                                this.b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i68) {
                                    case 0:
                                        org.telegram.ui.ActionBar.u0 u0Var2 = this.b.b.o0;
                                        if (u0Var2 != null) {
                                            u0Var2.r(14);
                                            break;
                                        }
                                        break;
                                    case 1:
                                        PhotoViewer photoViewer2 = this.b.b;
                                        photoViewer2.o0.r(19);
                                        photoViewer2.o0.K(20);
                                        break;
                                    default:
                                        PhotoViewer photoViewer3 = this.b.b;
                                        photoViewer3.o0.K(19);
                                        photoViewer3.o0.r(20);
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
                        org.telegram.ui.Components.j81.I(messageObject18, z23);
                        org.telegram.ui.Components.j81 j81Var = r72.F2;
                        if (j81Var != null) {
                            j81Var.N(r72.Z2);
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
                            org.telegram.ui.Components.f5.J(i14, activity8, j10, photo, new ci.b());
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
