package org.telegram.ui;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.camera.Camera2Session;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h4(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.Components.m21 m21Var = (org.telegram.ui.Components.m21) this.c;
        String str = (String) this.d;
        int i10 = this.b;
        org.telegram.ui.Components.l21 l21Var = m21Var.r.n;
        try {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                m21Var.d = -1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fz0(m21Var, m21Var.d, new ArrayList(), new ArrayList(), 2));
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i11 = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i11];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = l21Var.d.size();
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList arrayList3 = (ArrayList) l21Var.d.get(i12);
                String i13 = org.telegram.ui.ActionBar.k5.i(((org.telegram.ui.ActionBar.t6) arrayList3.get(0)).e);
                String lowerCase2 = i13.toLowerCase();
                int i14 = 0;
                while (true) {
                    if (i14 < i11) {
                        String str2 = strArr[i14];
                        if (lowerCase2.contains(str2)) {
                            arrayList.add(arrayList3);
                            arrayList2.add(org.telegram.ui.Components.m21.E(i13, str2));
                            break;
                        }
                        i14++;
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fz0(m21Var, i10, arrayList, arrayList2, 2));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:440:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v13 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        UndoView undoView;
        UndoView undoView2;
        ?? r10;
        org.telegram.ui.Components.a60 a60Var;
        long j10;
        String formatPluralString;
        ArrayList arrayList;
        int size;
        int i10;
        int size2;
        int i11;
        int i12;
        int size3;
        int dp;
        float f7;
        int i13;
        int i14;
        int i15;
        int i16;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i17 = 5;
        int i18 = 6;
        UndoView undoView3 = null;
        UndoView undoView4 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        int i19 = 0;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.c;
                int i20 = this.b;
                int[] iArr = (int[]) this.d;
                i4Var.J = i20;
                i4Var.I = iArr;
                i4Var.L.f0();
                return;
            case 1:
                String str = (String) this.c;
                int i21 = this.b;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) this.d;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = new TLRPC.TL_inputGroupCallSlug();
                tL_inputGroupCallSlug.slug = Uri.parse(str).getPathSegments().get(r0.getPathSegments().size() - 1);
                org.telegram.ui.Components.voip.d2.g(LaunchActivity.J1, i21, tL_inputGroupCallSlug, false, null, null);
                h3VarArr[0].dismiss();
                return;
            case 2:
                ((sn) this.c).Oa((ArrayList) this.d, this.b, false, false);
                return;
            case 3:
                sn snVar = (sn) this.c;
                int i22 = this.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.d;
                int i23 = 0;
                snVar.x0.v0(0, i22, null);
                if (!AndroidUtilities.showKeyboard(editTextBoldCursor)) {
                    editTextBoldCursor.clearFocus();
                    editTextBoldCursor.requestFocus();
                }
                AndroidUtilities.runOnUIThread(new ah(editTextBoldCursor, i23), 100L);
                return;
            case 4:
                vl vlVar = (vl) this.c;
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) this.d;
                int i24 = this.b;
                vlVar.getClass();
                MessageObject messageObject = v0Var.getMessageObject();
                em emVar = vlVar.a;
                emVar.Q.j(i24, messageObject.getId(), true, messageObject.getDialogId() == emVar.Q.X6 ? 1 : 0, true, 0);
                return;
            case 5:
                org.telegram.ui.Wallet.o5.E0(((org.telegram.ui.Components.al) this.c).getContext(), this.b, (org.telegram.ui.ActionBar.g6) this.d);
                return;
            case 6:
                org.telegram.ui.Components.fo foVar = (org.telegram.ui.Components.fo) this.c;
                int i25 = this.b;
                View view = (View) this.d;
                foVar.V = 0;
                foVar.U = i25;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    foVar.X((org.telegram.ui.Cells.r8) view, true);
                    return;
                } else {
                    foVar.r.m(foVar.I0);
                    return;
                }
            case 7:
                org.telegram.ui.Components.nv nvVar = (org.telegram.ui.Components.nv) this.c;
                a0.h hVar = (a0.h) this.d;
                int i26 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var = nvVar.e1.c;
                if (o2Var instanceof sn) {
                    sn snVar2 = (sn) o2Var;
                    snVar2.T7();
                    undoView2 = snVar2.K3;
                } else {
                    if (!(o2Var instanceof ProfileActivity)) {
                        undoView = null;
                        if (undoView == null) {
                            if (hVar.m() == 1) {
                                undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i26), 53);
                                return;
                            } else {
                                undoView.k(0L, 53, Integer.valueOf(i26), Integer.valueOf(hVar.m()), null, null);
                                return;
                            }
                        }
                        return;
                    }
                    undoView2 = ((ProfileActivity) o2Var).M;
                }
                undoView = undoView2;
                if (undoView == null) {
                }
            case 8:
                org.telegram.ui.Components.ny nyVar = (org.telegram.ui.Components.ny) this.c;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.d;
                int i27 = this.b;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var == null) {
                    return;
                }
                c2Var.setOnCancelListener(new ai.e0(nyVar, i27, i17));
                c2VarArr[0].show();
                return;
            case 9:
                int i28 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i28;
                o2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new hg.u(o2Var2, i28, callback, i17));
                return;
            case 10:
                org.telegram.ui.Components.z30 z30Var = (org.telegram.ui.Components.z30) this.c;
                int i29 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                hg.a2 a2Var = z30Var.d;
                org.telegram.ui.Components.a40 a40Var = z30Var.w;
                if (i29 != z30Var.n) {
                    return;
                }
                z30Var.h = false;
                TLRPC.Chat chat = a40Var.V;
                org.telegram.ui.Components.wx0 wx0Var = a40Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.h hVar2 = a2Var.h;
                    ArrayList arrayList3 = a2Var.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i30 = 0; i30 < size4; i30++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i30);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            hVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            hVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    a2Var.i();
                }
                int i31 = z30Var.f - 1;
                boolean z10 = wx0Var.getVisibility() == 0;
                z30Var.l();
                if (z30Var.f > i31) {
                    a40Var.J(i31);
                }
                if (z30Var.h || a2Var.e() || !a40Var.d.T0()) {
                    return;
                }
                wx0Var.e(false, z10);
                return;
            case 11:
                org.telegram.ui.Components.n40 n40Var = (org.telegram.ui.Components.n40) this.c;
                int i32 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = n40Var.Q;
                int i33 = n40Var.P;
                if (i32 != n40Var.V) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(n40Var.d0[0] ? "$" : "#");
                sb2.append(n40Var.a0);
                String sb3 = sb2.toString();
                ci.t6 t6Var = n40Var.S;
                if (t6Var == null || !TextUtils.equals(t6Var.C, sb3)) {
                    n40Var.S = new ci.t6(i33, null, sb3);
                }
                if (n40Var.S.i.size() <= 0) {
                    r10 = 1;
                    n40Var.S.p(4, true);
                } else {
                    r10 = 1;
                }
                n40Var.R = r10;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r10;
                n40Var.a0 = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject2 = (MessageObject) i2.o1.i(r10, arrayList4);
                    tL_channels_searchPosts.offset_rate = n40Var.b0;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i33).getInputPeer(messageObject2.messageOwner.peer_id);
                }
                n40Var.W = ConnectionsManager.getInstance(i33).sendRequest(tL_channels_searchPosts, new hg.u(n40Var, i32, sb3, i18));
                return;
            case 12:
                org.telegram.ui.Components.n60 n60Var = (org.telegram.ui.Components.n60) this.c;
                int i34 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (n60Var.m0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i34);
                }
                if (n60Var.B0 && i34 == n60Var.A0) {
                    n60Var.p("camera open submitted: surface=" + i34);
                }
                if (!n60Var.s0) {
                    if (i34 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(n60Var.n0[0].getWidth(), n60Var.n0[0].getHeight());
                    n60Var.t0 = new CameraSession(n60Var.I, n60Var.n0[0], n60Var.o0, 256, true);
                    n60Var.v();
                    org.telegram.ui.Components.x50 x50Var = n60Var.m0;
                    CameraSession cameraSession = n60Var.t0;
                    Handler handler = x50Var.getHandler();
                    if (handler != null) {
                        x50Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(n60Var.t0, surfaceTexture, new org.telegram.ui.Components.n50(n60Var, 1), new org.telegram.ui.Components.n50(n60Var, 2));
                    return;
                }
                if (n60Var.u0) {
                    Camera2Session camera2Session = n60Var.v0[i34];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i34 == 1) {
                    return;
                }
                org.telegram.ui.Components.x50 x50Var2 = n60Var.m0;
                Camera2Session camera2Session2 = n60Var.w0;
                Handler handler2 = x50Var2.getHandler();
                if (handler2 != null) {
                    x50Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                n60Var.w0.open(surfaceTexture);
                return;
            case 13:
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) this.c;
                int i35 = this.b;
                org.telegram.ui.Components.a60 a60Var2 = (org.telegram.ui.Components.a60) this.d;
                org.telegram.ui.Components.n60 n60Var2 = f60Var.H0;
                VideoEditedInfo videoEditedInfo = n60Var2.S;
                int i36 = n60Var2.f;
                org.telegram.ui.Components.y50 y50Var = n60Var2.n;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    n60Var2.S = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (n60Var2.S.needConvert()) {
                    n60Var2.M = null;
                    n60Var2.N = null;
                    n60Var2.O = null;
                    n60Var2.P = null;
                    VideoEditedInfo videoEditedInfo3 = n60Var2.S;
                    long j11 = videoEditedInfo3.estimatedDuration;
                    j10 = 0;
                    double d = j11;
                    a60Var = a60Var2;
                    long j12 = videoEditedInfo3.startTime;
                    if (j12 < 0) {
                        j12 = 0;
                    }
                    long j13 = videoEditedInfo3.endTime;
                    if (j13 >= 0) {
                        j11 = j13;
                    }
                    long j14 = j11 - j12;
                    videoEditedInfo3.estimatedDuration = j14;
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j14 / d) * n60Var2.Q));
                    VideoEditedInfo videoEditedInfo4 = n60Var2.S;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j15 = videoEditedInfo4.startTime;
                    if (j15 > 0) {
                        videoEditedInfo4.startTime = j15 * 1000;
                    }
                    long j16 = videoEditedInfo4.endTime;
                    if (j16 > 0) {
                        videoEditedInfo4.endTime = j16 * 1000;
                    }
                    FileLoader.getInstance(i36).cancelFileUpload(n60Var2.f0.getAbsolutePath(), false);
                } else {
                    a60Var = a60Var2;
                    j10 = 0;
                    n60Var2.S.estimatedSize = Math.max(1L, n60Var2.Q);
                }
                VideoEditedInfo videoEditedInfo5 = n60Var2.S;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = n60Var2.M;
                videoEditedInfo5.encryptedFile = n60Var2.N;
                videoEditedInfo5.key = n60Var2.O;
                videoEditedInfo5.iv = n60Var2.P;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = f60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = n60Var2.S;
                if (i35 != 1) {
                    f60Var.h(f60Var.a);
                    videoEditedInfo6.estimatedDuration = n60Var2.k0;
                    NotificationCenter.getInstance(i36).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(n60Var2.V), videoEditedInfo6, f60Var.a.getAbsolutePath(), f60Var.A0);
                    return;
                }
                if (y50Var.c()) {
                    Activity parentActivity = y50Var.getParentActivity();
                    long a2 = y50Var.a();
                    org.telegram.ui.Components.ry ryVar = new org.telegram.ui.Components.ry(f60Var, a60Var, videoEditedInfo6, 2);
                    org.telegram.ui.Components.c60 c60Var = new org.telegram.ui.Components.c60(f60Var, 0);
                    org.telegram.ui.ActionBar.g6 g6Var = n60Var2.Z0;
                    Pattern pattern = org.telegram.ui.Components.f5.a;
                    org.telegram.ui.Components.f5.K(parentActivity, a2, -1L, 0, false, ryVar, c60Var, new org.telegram.ui.Components.c5(g6Var), g6Var);
                } else {
                    org.telegram.ui.Components.a60 a60Var3 = a60Var;
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, f60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (a60Var3 != null) {
                        photoEntry.ttl = a60Var3.c;
                        photoEntry.effectId = a60Var3.d;
                    }
                    n60Var2.n.s(photoEntry, videoEditedInfo6, a60Var3 == null || a60Var3.a, a60Var3 != null ? a60Var3.b : 0, 0, false, a60Var3 != null ? a60Var3.e : j10);
                }
                n60Var2.S = null;
                return;
            case 14:
                org.telegram.ui.Components.gk0 gk0Var = (org.telegram.ui.Components.gk0) this.c;
                int i37 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i38 = gk0Var.f;
                TextView textView = gk0Var.b;
                MessageObject messageObject3 = gk0Var.s;
                ImageView imageView = gk0Var.d;
                org.telegram.ui.Components.w9 w9Var = gk0Var.e;
                ArrayList arrayList5 = gk0Var.r;
                ArrayList arrayList6 = gk0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i37) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i37, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i37), i37 == arrayList6.size() ? String.valueOf(i37) : i37 + "/" + arrayList6.size());
                }
                if (gk0Var.getMeasuredWidth() > 0) {
                    gk0Var.v = gk0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject3.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i38).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            w9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            w9Var.setVisibility(0);
                            w9Var.setAlpha(0.0f);
                            w9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList7 = tL_messages_messageReactionsList.users;
                            size = arrayList7.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList7.get(i10);
                                int i39 = i10 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject3.messageOwner.from_id;
                                if (peer != null) {
                                    i14 = i39;
                                    if (user2.id != peer.user_id) {
                                        int i40 = 0;
                                        while (true) {
                                            if (i40 < arrayList.size()) {
                                                i13 = size;
                                                int i41 = i40;
                                                if (((org.telegram.ui.Components.fk0) arrayList.get(i40)).b == user2.id) {
                                                    break;
                                                }
                                                i40 = i41 + 1;
                                                size = i13;
                                            } else {
                                                i13 = size;
                                                arrayList.add(new org.telegram.ui.Components.fk0(0, user2));
                                            }
                                        }
                                    } else {
                                        i13 = size;
                                    }
                                } else {
                                    i13 = size;
                                    i14 = i39;
                                }
                                size = i13;
                                i10 = i14;
                            }
                            ArrayList<TLRPC.Chat> arrayList8 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList8.size();
                            i11 = 0;
                            while (i11 < size2) {
                                TLRPC.Chat chat2 = arrayList8.get(i11);
                                i11++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = messageObject3.messageOwner.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i42 = i19;
                                    while (true) {
                                        if (i42 >= arrayList.size()) {
                                            arrayList.add(new org.telegram.ui.Components.fk0(0, chat3));
                                        } else if (((org.telegram.ui.Components.fk0) arrayList.get(i42)).b == (-chat3.id)) {
                                            break;
                                        } else {
                                            i42++;
                                        }
                                    }
                                }
                                i19 = 0;
                            }
                            org.telegram.ui.Components.b10 b10Var = gk0Var.a;
                            org.telegram.ui.Components.k9 k9Var = gk0Var.c;
                            gk0Var.setEnabled(arrayList.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList.size()) {
                                    k9Var.b(i12, ((org.telegram.ui.Components.fk0) arrayList.get(i12)).a, i38);
                                } else {
                                    k9Var.b(i12, null, i38);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                dp = AndroidUtilities.dp(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f7 = 0.0f;
                                    if (LocaleController.isRTL) {
                                        f7 = AndroidUtilities.dp(12.0f);
                                    }
                                    k9Var.setTranslationX(f7);
                                    k9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    k9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    b10Var.animate().alpha(0.0f).setDuration(220L).setListener(new ho(b10Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f7 = dp;
                            if (LocaleController.isRTL) {
                            }
                            k9Var.setTranslationX(f7);
                            k9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            k9Var.animate().alpha(1.0f).setDuration(220L).start();
                            b10Var.animate().alpha(0.0f).setDuration(220L).setListener(new ho(b10Var)).start();
                            return;
                        }
                    }
                }
                arrayList = arrayList5;
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList72 = tL_messages_messageReactionsList.users;
                size = arrayList72.size();
                i10 = 0;
                while (i10 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList82 = tL_messages_messageReactionsList.chats;
                size2 = arrayList82.size();
                i11 = 0;
                while (i11 < size2) {
                }
                org.telegram.ui.Components.b10 b10Var2 = gk0Var.a;
                org.telegram.ui.Components.k9 k9Var2 = gk0Var.c;
                gk0Var.setEnabled(arrayList.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f7 = dp;
                if (LocaleController.isRTL) {
                }
                k9Var2.setTranslationX(f7);
                k9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                k9Var2.animate().alpha(1.0f).setDuration(220L).start();
                b10Var2.animate().alpha(0.0f).setDuration(220L).setListener(new ho(b10Var2)).start();
                return;
            case 15:
                org.telegram.ui.Components.er0 er0Var = (org.telegram.ui.Components.er0) this.c;
                int i43 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                org.telegram.ui.Components.cr0 cr0Var = er0Var.e;
                org.telegram.ui.Components.ir0 ir0Var = er0Var.K;
                if (i43 != er0Var.r) {
                    return;
                }
                er0Var.h();
                er0Var.I = false;
                er0Var.v = i43;
                if (er0Var.s != i43) {
                    cr0Var.b();
                }
                org.telegram.ui.Components.lq0 lq0Var = ir0Var.G;
                org.telegram.ui.Components.er0 er0Var2 = ir0Var.N;
                if (lq0Var.getAdapter() != er0Var2) {
                    org.telegram.ui.Components.ir0.O0(ir0Var);
                    er0Var2.l();
                }
                for (int i44 = 0; i44 < arrayList9.size(); i44++) {
                    TLObject tLObject2 = ((org.telegram.ui.Components.wq0) arrayList9.get(i44)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i16 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                        MessagesController.getInstance(i16).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i15 = ((org.telegram.ui.ActionBar.h3) ir0Var).currentAccount;
                        MessagesController.getInstance(i15).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !er0Var.d.isEmpty() && arrayList9.isEmpty();
                if (er0Var.d.isEmpty()) {
                    arrayList9.isEmpty();
                }
                if (objArr != false) {
                    org.telegram.ui.Components.ir0.O0(ir0Var);
                }
                er0Var.d = arrayList9;
                cr0Var.f(arrayList9, null);
                int i45 = er0Var.J;
                if (er0Var.h() != 0 || cr0Var.e() || er0Var.I) {
                    ir0Var.y0.b(i45);
                } else {
                    ir0Var.R.e(false, true);
                }
                er0Var.l();
                ir0Var.P0(true);
                return;
            case 16:
                r0.getStoriesController().c(this.b, ((org.telegram.ui.Components.xv0) this.c).j1, (TL_stories.StoryItem) this.d);
                return;
            case 17:
                org.telegram.ui.Components.xv0 xv0Var = (org.telegram.ui.Components.xv0) this.c;
                int i46 = this.b;
                org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) this.d;
                xv0Var.g1(i46);
                j80Var.u();
                return;
            case 18:
                org.telegram.ui.Components.xv0 xv0Var2 = (org.telegram.ui.Components.xv0) this.c;
                xv0Var2.T(this.b, (org.telegram.ui.Components.mm0) this.d, false);
                xv0Var2.K1 = null;
                return;
            case 19:
                org.telegram.ui.Components.bu0 bu0Var = (org.telegram.ui.Components.bu0) this.c;
                int i47 = this.b;
                org.telegram.ui.Components.j80 j80Var2 = (org.telegram.ui.Components.j80) this.d;
                bu0Var.d.f1(i47, false);
                j80Var2.u();
                return;
            case 20:
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) this.c;
                a0.h hVar3 = (a0.h) this.d;
                int i48 = this.b;
                if (o2Var3 instanceof sn) {
                    sn snVar3 = (sn) o2Var3;
                    snVar3.T7();
                    undoView3 = snVar3.K3;
                } else if (o2Var3 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) o2Var3).M;
                }
                UndoView undoView5 = undoView3;
                if (undoView5 != null) {
                    if (hVar3.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) hVar3.n(0)).id, Integer.valueOf(i48), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i48), Integer.valueOf(hVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 21:
                org.telegram.ui.Components.iv0 iv0Var = (org.telegram.ui.Components.iv0) this.c;
                int i49 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i49 != iv0Var.E) {
                    return;
                }
                iv0Var.y = ConnectionsManager.getInstance(iv0Var.d).sendRequest(tL_messages_search, new ai.n2(iv0Var, i49, i18));
                return;
            case 22:
                org.telegram.ui.Components.iv0 iv0Var2 = (org.telegram.ui.Components.iv0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i50 = this.b;
                ArrayList arrayList10 = iv0Var2.h;
                int i51 = iv0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i50 == iv0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i51).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i51).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i51).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i52 = 0; i52 < messages_messages.messages.size(); i52++) {
                        MessageObject messageObject4 = new MessageObject(i51, messages_messages.messages.get(i52), false, true);
                        if (messageObject4.hasValidGroupId()) {
                            messageObject4.isPrimaryGroupMessage = true;
                        }
                        messageObject4.setQuery(iv0Var2.w);
                        arrayList10.add(messageObject4);
                    }
                    iv0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        iv0Var2.s = arrayList10.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        iv0Var2.s = true;
                    }
                    iv0Var2.G(false);
                    iv0Var2.r = false;
                    iv0Var2.y = -1;
                    return;
                }
                return;
            case 23:
                org.telegram.ui.Components.ww0 ww0Var = (org.telegram.ui.Components.ww0) this.c;
                int i53 = this.b;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.d;
                ww0Var.Y0 = false;
                if (!ww0Var.V0 && ww0Var.W0) {
                    ww0Var.C(true);
                    return;
                }
                ww0Var.m0 = ww0Var.f1[0];
                ww0Var.l();
                DownloadController.getInstance(i53).removeLoadingFileObserver(t1Var);
                ww0Var.I();
                ww0Var.x();
                return;
            case 24:
                int i54 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i54).getDatabase();
                    if (database != null) {
                        if (tL_messages_emojiGroups == null) {
                            database.executeFast("DELETE FROM emoji_groups WHERE type = " + num).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                            tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                            executeFast.bindInteger(1, num.intValue());
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 25:
                int i55 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i55).getDatabase();
                        if (database2 != null) {
                            sQLiteCursor = database2.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num2);
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                    messages_emojigroups = null;
                                } else {
                                    messages_emojigroups = TLRPC.messages_EmojiGroups.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                    byteBufferValue.reuse();
                                }
                                if (messages_emojigroups instanceof TLRPC.TL_messages_emojiGroups) {
                                    callback2.run(Long.valueOf(r5.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e7) {
                                e = e7;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor3 = num2;
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 26:
                org.telegram.ui.Components.gy0 gy0Var = (org.telegram.ui.Components.gy0) this.c;
                a0.h hVar4 = (a0.h) this.d;
                int i56 = this.b;
                org.telegram.ui.ActionBar.o2 o2Var4 = gy0Var.e1.L;
                if (o2Var4 instanceof sn) {
                    sn snVar4 = (sn) o2Var4;
                    snVar4.T7();
                    undoView4 = snVar4.K3;
                } else if (o2Var4 instanceof ProfileActivity) {
                    undoView4 = ((ProfileActivity) o2Var4).M;
                }
                UndoView undoView6 = undoView4;
                if (undoView6 != null) {
                    if (hVar4.m() == 1) {
                        undoView6.m(((TLRPC.Dialog) hVar4.n(0)).id, Integer.valueOf(i56), 53);
                        return;
                    } else {
                        undoView6.k(0L, 53, Integer.valueOf(i56), Integer.valueOf(hVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 27:
                org.telegram.ui.Components.lz0 lz0Var = (org.telegram.ui.Components.lz0) this.c;
                String str3 = (String) this.d;
                int i57 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList11 = new ArrayList<>(1);
                arrayList11.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(lz0Var.a).fillWithAnimatedEmoji(arrayList11, 15, false, false, false, new org.telegram.ui.Components.fz0((View) lz0Var, i57, str3, (Serializable) arrayList11, 1));
                return;
            case 28:
                a();
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fz0((org.telegram.ui.Components.v21) this.c, (org.telegram.ui.Components.vp) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 3));
                return;
        }
    }

    public /* synthetic */ h4(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ h4(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }

    public /* synthetic */ h4(i4 i4Var, int i10, int[] iArr, int[] iArr2) {
        this.a = 0;
        this.c = i4Var;
        this.b = i10;
        this.d = iArr2;
    }
}
