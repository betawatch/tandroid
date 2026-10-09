package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
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
import org.telegram.messenger.SharedConfig;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zk(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        AndroidUtilities.runOnUIThread(new x21((z21) this.c, (bq) this.d, this.b, SvgHelper.getBitmap(R.raw.default_pattern, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(140.0f), -16777216, AndroidUtilities.density), 0));
    }

    private final void b() {
        MessageObject messageObject = (MessageObject) this.c;
        org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
        HashMap hashMap = j41.P;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(j41.o(messageObject)));
        }
        if (l1Var != null) {
            l1Var.g0(3);
        }
        int i10 = this.b;
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
    }

    private final void c() {
        int i10;
        org.telegram.ui.xx xxVar = (org.telegram.ui.xx) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.ty tyVar = xxVar.f0;
        ArrayList arrayList = tyVar.R1;
        if (arrayList == null || (i10 = this.b) < 0 || i10 >= arrayList.size()) {
            return;
        }
        tyVar.R1.add(i10, dialog);
        tyVar.e0[0].q(true);
    }

    private final void e() {
        org.telegram.ui.ry ryVar = (org.telegram.ui.ry) this.c;
        TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
        org.telegram.ui.sy syVar = ryVar.g;
        org.telegram.ui.ty tyVar = ryVar.h;
        tyVar.S1 = true;
        tyVar.getMessagesController().addDialogToFolder(dialog.id, 0, this.b, 0L);
        tyVar.S1 = false;
        ArrayList<TLRPC.Dialog> dialogs = tyVar.getMessagesController().getDialogs(0);
        int indexOf = dialogs.indexOf(dialog);
        if (indexOf < 0) {
            syVar.q(false);
            return;
        }
        ArrayList<TLRPC.Dialog> dialogs2 = tyVar.getMessagesController().getDialogs(1);
        if (!dialogs2.isEmpty() || indexOf != 1) {
            tyVar.x4(true, true);
            syVar.x.D();
            syVar.q(true);
            tyVar.l3();
        }
        if (dialogs2.isEmpty()) {
            dialogs.remove(0);
            if (indexOf == 1) {
                tyVar.x4(true, true);
                syVar.q(true);
                tyVar.l3();
            } else {
                if (!tyVar.R1.isEmpty()) {
                    tyVar.R1.remove(0);
                }
                syVar.x.D();
                syVar.q(true);
            }
        }
    }

    private final void f() {
        org.telegram.ui.g60 g60Var = (org.telegram.ui.g60) this.c;
        org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var == null) {
            return;
        }
        b2Var.setOnCancelListener(new org.telegram.ui.ca(g60Var, this.b, 5));
        b2VarArr[0].show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x01e0: MOVE (r9 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:481), block:B:116:0x01e0 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0622  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0624  */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r92;
        long j3;
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
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i16 = 4;
        UndoView undoView = null;
        r9 = null;
        String str = null;
        UndoView undoView2 = null;
        SQLiteCursor sQLiteCursor3 = null;
        SQLiteCursor sQLiteCursor4 = null;
        UndoView undoView3 = null;
        int i17 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Wallet.a5.u0(((gl) this.c).getContext(), this.b, (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 1:
                lo loVar = (lo) this.c;
                int i18 = this.b;
                View view = (View) this.d;
                loVar.V = 0;
                loVar.U = i18;
                if (view instanceof org.telegram.ui.Cells.r8) {
                    loVar.X((org.telegram.ui.Cells.r8) view, true);
                    return;
                } else {
                    loVar.r.m(loVar.I0);
                    return;
                }
            case 2:
                vv vvVar = (vv) this.c;
                a0.i iVar = (a0.i) this.d;
                int i19 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = vvVar.b1.c;
                if (n2Var instanceof org.telegram.ui.zn) {
                    org.telegram.ui.zn znVar = (org.telegram.ui.zn) n2Var;
                    znVar.T7();
                    undoView = znVar.y3;
                } else if (n2Var instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) n2Var).M;
                }
                if (undoView != null) {
                    if (iVar.m() == 1) {
                        undoView.m(((TLRPC.Dialog) iVar.n(0)).id, Integer.valueOf(i19), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i19), Integer.valueOf(iVar.m()), null, null);
                        return;
                    }
                }
                return;
            case 3:
                vy vyVar = (vy) this.c;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.d;
                int i20 = this.b;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var == null) {
                    return;
                }
                b2Var.setOnCancelListener(new org.telegram.ui.ca(vyVar, i20, i16));
                b2VarArr[0].show();
                return;
            case 4:
                int i21 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions tL_chatlists_getLeaveChatlistSuggestions = new TL_chatlists.TL_chatlists_getLeaveChatlistSuggestions();
                TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
                tL_chatlists_getLeaveChatlistSuggestions.chatlist = tL_inputChatlistDialogFilter;
                tL_inputChatlistDialogFilter.filter_id = i21;
                n2Var2.getConnectionsManager().sendRequest(tL_chatlists_getLeaveChatlistSuggestions, new gg.u(n2Var2, i21, callback, 5));
                return;
            case 5:
                h40 h40Var = (h40) this.c;
                int i22 = this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                gg.b2 b2Var2 = h40Var.d;
                i40 i40Var = h40Var.w;
                if (i22 != h40Var.n) {
                    return;
                }
                h40Var.h = false;
                TLRPC.Chat chat = i40Var.V;
                ay0 ay0Var = i40Var.s;
                if (!ChatObject.isChannel(chat)) {
                    a0.i iVar2 = b2Var2.h;
                    ArrayList arrayList3 = b2Var2.g;
                    arrayList3.clear();
                    arrayList3.addAll(arrayList2);
                    int size4 = arrayList2.size();
                    for (int i23 = 0; i23 < size4; i23++) {
                        TLObject tLObject = (TLObject) arrayList2.get(i23);
                        if (tLObject instanceof TLRPC.ChatParticipant) {
                            iVar2.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                        } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                            iVar2.k(tLObject, MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer));
                        }
                    }
                    b2Var2.i();
                }
                int i24 = h40Var.f - 1;
                boolean z10 = ay0Var.getVisibility() == 0;
                h40Var.l();
                if (h40Var.f > i24) {
                    i40Var.K(i24);
                }
                if (h40Var.h || b2Var2.e() || !i40Var.d.S0()) {
                    return;
                }
                ay0Var.e(false, z10);
                return;
            case 6:
                v40 v40Var = (v40) this.c;
                int i25 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList4 = v40Var.O;
                int i26 = v40Var.N;
                if (i25 != v40Var.T) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(v40Var.b0[0] ? "$" : "#");
                sb2.append(v40Var.Y);
                String sb3 = sb2.toString();
                ai.w8 w8Var = v40Var.Q;
                if (w8Var == null || !TextUtils.equals(w8Var.C, sb3)) {
                    v40Var.Q = new ai.w8(i26, null, sb3);
                }
                if (v40Var.Q.i.size() <= 0) {
                    r92 = 1;
                    v40Var.Q.p(4, true);
                } else {
                    r92 = 1;
                }
                v40Var.P = r92;
                TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= r92;
                v40Var.Y = str2;
                tL_channels_searchPosts.hashtag = str2;
                tL_channels_searchPosts.limit = 10;
                if (arrayList4.isEmpty()) {
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    MessageObject messageObject = (MessageObject) hg.c.g(r92, arrayList4);
                    tL_channels_searchPosts.offset_rate = v40Var.Z;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(i26).getInputPeer(messageObject.messageOwner.peer_id);
                }
                v40Var.U = ConnectionsManager.getInstance(i26).sendRequest(tL_channels_searchPosts, new gg.u(v40Var, i25, sb3, 6));
                return;
            case 7:
                t60 t60Var = (t60) this.c;
                int i27 = this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.d;
                if (t60Var.m0 == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("InstantCamera create camera session " + i27);
                }
                if (t60Var.B0 && i27 == t60Var.A0) {
                    t60Var.p("camera open submitted: surface=" + i27);
                }
                if (!t60Var.s0) {
                    if (i27 == 1) {
                        return;
                    }
                    surfaceTexture.setDefaultBufferSize(t60Var.n0[0].getWidth(), t60Var.n0[0].getHeight());
                    t60Var.t0 = new CameraSession(t60Var.I, t60Var.n0[0], t60Var.o0, 256, true);
                    t60Var.v();
                    e60 e60Var = t60Var.m0;
                    CameraSession cameraSession = t60Var.t0;
                    Handler handler = e60Var.getHandler();
                    if (handler != null) {
                        e60Var.sendMessage(handler.obtainMessage(3, cameraSession), 0);
                    }
                    CameraController.getInstance().openRound(t60Var.t0, surfaceTexture, new v50(t60Var, 1), new v50(t60Var, 2));
                    return;
                }
                if (t60Var.u0) {
                    Camera2Session camera2Session = t60Var.v0[i27];
                    if (camera2Session != null) {
                        camera2Session.open(surfaceTexture);
                        return;
                    }
                    return;
                }
                if (i27 == 1) {
                    return;
                }
                e60 e60Var2 = t60Var.m0;
                Camera2Session camera2Session2 = t60Var.w0;
                Handler handler2 = e60Var2.getHandler();
                if (handler2 != null) {
                    e60Var2.sendMessage(handler2.obtainMessage(3, camera2Session2), 0);
                }
                t60Var.w0.open(surfaceTexture);
                return;
            case 8:
                l60 l60Var = (l60) this.c;
                int i28 = this.b;
                h60 h60Var = (h60) this.d;
                t60 t60Var2 = l60Var.H0;
                VideoEditedInfo videoEditedInfo = t60Var2.S;
                int i29 = t60Var2.f;
                f60 f60Var = t60Var2.n;
                if (videoEditedInfo == null) {
                    VideoEditedInfo videoEditedInfo2 = new VideoEditedInfo();
                    t60Var2.S = videoEditedInfo2;
                    videoEditedInfo2.startTime = -1L;
                    videoEditedInfo2.endTime = -1L;
                }
                if (t60Var2.S.needConvert()) {
                    t60Var2.M = null;
                    t60Var2.N = null;
                    t60Var2.O = null;
                    t60Var2.P = null;
                    VideoEditedInfo videoEditedInfo3 = t60Var2.S;
                    long j10 = videoEditedInfo3.estimatedDuration;
                    j3 = 0;
                    double d = j10;
                    long j11 = videoEditedInfo3.startTime;
                    if (j11 < 0) {
                        j11 = 0;
                    }
                    long j12 = videoEditedInfo3.endTime;
                    if (j12 >= 0) {
                        j10 = j12;
                    }
                    long j13 = j10 - j11;
                    videoEditedInfo3.estimatedDuration = j13;
                    videoEditedInfo3.estimatedSize = Math.max(1L, (long) ((j13 / d) * t60Var2.Q));
                    VideoEditedInfo videoEditedInfo4 = t60Var2.S;
                    videoEditedInfo4.bitrate = MediaController.VIDEO_BITRATE_480;
                    long j14 = videoEditedInfo4.startTime;
                    if (j14 > 0) {
                        videoEditedInfo4.startTime = j14 * 1000;
                    }
                    long j15 = videoEditedInfo4.endTime;
                    if (j15 > 0) {
                        videoEditedInfo4.endTime = j15 * 1000;
                    }
                    FileLoader.getInstance(i29).cancelFileUpload(t60Var2.f0.getAbsolutePath(), false);
                } else {
                    j3 = 0;
                    t60Var2.S.estimatedSize = Math.max(1L, t60Var2.Q);
                }
                VideoEditedInfo videoEditedInfo5 = t60Var2.S;
                videoEditedInfo5.roundVideo = true;
                videoEditedInfo5.file = t60Var2.M;
                videoEditedInfo5.encryptedFile = t60Var2.N;
                videoEditedInfo5.key = t60Var2.O;
                videoEditedInfo5.iv = t60Var2.P;
                videoEditedInfo5.framerate = 25;
                videoEditedInfo5.originalWidth = 360;
                videoEditedInfo5.resultWidth = 360;
                videoEditedInfo5.originalHeight = 360;
                videoEditedInfo5.resultHeight = 360;
                videoEditedInfo5.originalPath = l60Var.a.getAbsolutePath();
                VideoEditedInfo videoEditedInfo6 = t60Var2.S;
                int i30 = 1;
                if (i28 != 1) {
                    l60Var.h(l60Var.a);
                    videoEditedInfo6.estimatedDuration = t60Var2.k0;
                    NotificationCenter.getInstance(i29).lambda$postNotificationNameOnUIThread$1(NotificationCenter.audioDidSent, Integer.valueOf(t60Var2.V), videoEditedInfo6, l60Var.a.getAbsolutePath(), l60Var.A0);
                    return;
                }
                if (f60Var.c()) {
                    Activity parentActivity = f60Var.getParentActivity();
                    long a2 = f60Var.a();
                    rz rzVar = new rz(l60Var, h60Var, videoEditedInfo6, i30);
                    i60 i60Var = new i60(l60Var, 0);
                    org.telegram.ui.ActionBar.e6 e6Var = t60Var2.Z0;
                    Pattern pattern = g5.a;
                    g5.J(parentActivity, a2, -1L, 0, false, rzVar, i60Var, new e5(e6Var), e6Var);
                } else {
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, l60Var.a.getAbsolutePath(), 0, true, 0, 0, 0L);
                    if (h60Var != null) {
                        photoEntry.ttl = h60Var.c;
                        photoEntry.effectId = h60Var.d;
                    }
                    t60Var2.n.r(photoEntry, videoEditedInfo6, h60Var == null || h60Var.a, h60Var != null ? h60Var.b : 0, 0, false, h60Var != null ? h60Var.e : j3);
                }
                t60Var2.S = null;
                return;
            case 9:
                kk0 kk0Var = (kk0) this.c;
                int i31 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i32 = kk0Var.f;
                TextView textView = kk0Var.b;
                MessageObject messageObject2 = kk0Var.s;
                ImageView imageView = kk0Var.d;
                y9 y9Var = kk0Var.e;
                ArrayList arrayList5 = kk0Var.r;
                ArrayList arrayList6 = kk0Var.n;
                if (arrayList6.isEmpty() || arrayList6.size() < i31) {
                    formatPluralString = LocaleController.formatPluralString("ReactionsCount", i31, new Object[0]);
                } else {
                    formatPluralString = String.format(LocaleController.getPluralString("Reacted", i31), i31 == arrayList6.size() ? String.valueOf(i31) : i31 + "/" + arrayList6.size());
                }
                if (kk0Var.getMeasuredWidth() > 0) {
                    kk0Var.v = kk0Var.getMeasuredWidth();
                }
                textView.setText(formatPluralString);
                TLRPC.TL_messageReactions tL_messageReactions = messageObject2.messageOwner.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    for (TLRPC.TL_availableReaction tL_availableReaction : MediaDataController.getInstance(i32).getReactionsList()) {
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            arrayList = arrayList5;
                            y9Var.i(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            y9Var.setVisibility(0);
                            y9Var.setAlpha(0.0f);
                            y9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList7 = tL_messages_messageReactionsList.users;
                            size = arrayList7.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList7.get(i10);
                                int i33 = i10 + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = messageObject2.messageOwner.from_id;
                                int i34 = size;
                                if (peer == null || user2.id == peer.user_id) {
                                    i13 = i33;
                                } else {
                                    int i35 = i17;
                                    while (true) {
                                        if (i35 < arrayList.size()) {
                                            i13 = i33;
                                            if (((jk0) arrayList.get(i35)).b == user2.id) {
                                                break;
                                            }
                                            i35++;
                                            i33 = i13;
                                        } else {
                                            i13 = i33;
                                            arrayList.add(new jk0(0, user2));
                                        }
                                    }
                                }
                                size = i34;
                                i10 = i13;
                                i17 = 0;
                            }
                            ArrayList<TLRPC.Chat> arrayList8 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList8.size();
                            i11 = 0;
                            while (i11 < size2) {
                                TLRPC.Chat chat2 = arrayList8.get(i11);
                                i11++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = messageObject2.messageOwner.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i36 = 0;
                                    while (true) {
                                        if (i36 < arrayList.size()) {
                                            int i37 = i36;
                                            if (((jk0) arrayList.get(i36)).b == (-chat3.id)) {
                                                break;
                                            } else {
                                                i36 = i37 + 1;
                                            }
                                        } else {
                                            arrayList.add(new jk0(0, chat3));
                                        }
                                    }
                                }
                            }
                            j10 j10Var = kk0Var.a;
                            m9 m9Var = kk0Var.c;
                            kk0Var.setEnabled(arrayList.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList.size()) {
                                    m9Var.b(i12, ((jk0) arrayList.get(i12)).a, i32);
                                } else {
                                    m9Var.b(i12, null, i32);
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
                                    m9Var.setTranslationX(f7);
                                    m9Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    m9Var.animate().alpha(1.0f).setDuration(220L).start();
                                    j10Var.animate().alpha(0.0f).setDuration(220L).setListener(new fa(j10Var)).start();
                                    return;
                                }
                                dp = AndroidUtilities.dp(12.0f);
                            }
                            f7 = dp;
                            if (LocaleController.isRTL) {
                            }
                            m9Var.setTranslationX(f7);
                            m9Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            m9Var.animate().alpha(1.0f).setDuration(220L).start();
                            j10Var.animate().alpha(0.0f).setDuration(220L).setListener(new fa(j10Var)).start();
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
                j10 j10Var2 = kk0Var.a;
                m9 m9Var2 = kk0Var.c;
                kk0Var.setEnabled(arrayList.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f7 = dp;
                if (LocaleController.isRTL) {
                }
                m9Var2.setTranslationX(f7);
                m9Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                m9Var2.animate().alpha(1.0f).setDuration(220L).start();
                j10Var2.animate().alpha(0.0f).setDuration(220L).setListener(new fa(j10Var2)).start();
                return;
            case 10:
                ir0 ir0Var = (ir0) this.c;
                int i38 = this.b;
                ArrayList arrayList9 = (ArrayList) this.d;
                gr0 gr0Var = ir0Var.e;
                mr0 mr0Var = ir0Var.K;
                if (i38 != ir0Var.r) {
                    return;
                }
                ir0Var.h();
                ir0Var.I = false;
                ir0Var.v = i38;
                if (ir0Var.s != i38) {
                    gr0Var.b();
                }
                oq0 oq0Var = mr0Var.F;
                ir0 ir0Var2 = mr0Var.M;
                if (oq0Var.getAdapter() != ir0Var2) {
                    mr0.G0(mr0Var);
                    ir0Var2.l();
                }
                for (int i39 = 0; i39 < arrayList9.size(); i39++) {
                    TLObject tLObject2 = ((ar0) arrayList9.get(i39)).b;
                    if (tLObject2 instanceof TLRPC.User) {
                        i15 = ((org.telegram.ui.ActionBar.f3) mr0Var).currentAccount;
                        MessagesController.getInstance(i15).putUser((TLRPC.User) tLObject2, true);
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        i14 = ((org.telegram.ui.ActionBar.f3) mr0Var).currentAccount;
                        MessagesController.getInstance(i14).putChat((TLRPC.Chat) tLObject2, true);
                    }
                }
                Object[] objArr = !ir0Var.d.isEmpty() && arrayList9.isEmpty();
                if (ir0Var.d.isEmpty()) {
                    arrayList9.isEmpty();
                }
                if (objArr != false) {
                    mr0.G0(mr0Var);
                }
                ir0Var.d = arrayList9;
                gr0Var.f(arrayList9, null);
                int i40 = ir0Var.J;
                if (ir0Var.h() != 0 || gr0Var.e() || ir0Var.I) {
                    mr0Var.x0.b(i40);
                } else {
                    mr0Var.Q.e(false, true);
                }
                ir0Var.l();
                mr0Var.L0(true);
                return;
            case 11:
                r0.getStoriesController().c(this.b, ((bw0) this.c).j1, (TL_stories.StoryItem) this.d);
                return;
            case 12:
                bw0 bw0Var = (bw0) this.c;
                int i41 = this.b;
                p80 p80Var = (p80) this.d;
                bw0Var.d1(i41);
                p80Var.u();
                return;
            case 13:
                bw0 bw0Var2 = (bw0) this.c;
                bw0Var2.S(this.b, (qm0) this.d, false);
                bw0Var2.J1 = null;
                return;
            case 14:
                fu0 fu0Var = (fu0) this.c;
                int i42 = this.b;
                p80 p80Var2 = (p80) this.d;
                fu0Var.d.c1(i42, false);
                p80Var2.u();
                return;
            case 15:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) this.c;
                a0.i iVar3 = (a0.i) this.d;
                int i43 = this.b;
                if (n2Var3 instanceof org.telegram.ui.zn) {
                    org.telegram.ui.zn znVar2 = (org.telegram.ui.zn) n2Var3;
                    znVar2.T7();
                    undoView3 = znVar2.y3;
                } else if (n2Var3 instanceof ProfileActivity) {
                    undoView3 = ((ProfileActivity) n2Var3).M;
                }
                UndoView undoView4 = undoView3;
                if (undoView4 != null) {
                    if (iVar3.m() == 1) {
                        undoView4.m(((TLRPC.Dialog) iVar3.n(0)).id, Integer.valueOf(i43), 53);
                        return;
                    } else {
                        undoView4.k(0L, 53, Integer.valueOf(i43), Integer.valueOf(iVar3.m()), null, null);
                        return;
                    }
                }
                return;
            case 16:
                mv0 mv0Var = (mv0) this.c;
                int i44 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i44 != mv0Var.E) {
                    return;
                }
                mv0Var.y = ConnectionsManager.getInstance(mv0Var.d).sendRequest(tL_messages_search, new ai.j8(mv0Var, i44, i16));
                return;
            case 17:
                mv0 mv0Var2 = (mv0) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i45 = this.b;
                ArrayList arrayList10 = mv0Var2.h;
                int i46 = mv0Var2.d;
                if ((tLObject3 instanceof TLRPC.messages_Messages) && i45 == mv0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject3;
                    MessagesController.getInstance(i46).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i46).putChats(messages_messages.chats, false);
                    MessagesStorage.getInstance(i46).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    for (int i47 = 0; i47 < messages_messages.messages.size(); i47++) {
                        MessageObject messageObject3 = new MessageObject(i46, messages_messages.messages.get(i47), false, true);
                        if (messageObject3.hasValidGroupId()) {
                            messageObject3.isPrimaryGroupMessage = true;
                        }
                        messageObject3.setQuery(mv0Var2.w);
                        arrayList10.add(messageObject3);
                    }
                    mv0Var2.v = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        mv0Var2.s = arrayList10.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        mv0Var2.s = true;
                    }
                    mv0Var2.G(false);
                    mv0Var2.r = false;
                    mv0Var2.y = -1;
                    return;
                }
                return;
            case 18:
                ax0 ax0Var = (ax0) this.c;
                int i48 = this.b;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.d;
                ax0Var.Y0 = false;
                if (!ax0Var.V0 && ax0Var.W0) {
                    ax0Var.C(true);
                    return;
                }
                ax0Var.m0 = ax0Var.f1[0];
                ax0Var.l();
                DownloadController.getInstance(i48).removeLoadingFileObserver(u1Var);
                ax0Var.I();
                ax0Var.x();
                return;
            case 19:
                int i49 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num = (Integer) this.d;
                try {
                    SQLiteDatabase database = MessagesStorage.getInstance(i49).getDatabase();
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
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 20:
                int i50 = this.b;
                Integer num2 = (Integer) this.c;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.d;
                try {
                    try {
                        SQLiteDatabase database2 = MessagesStorage.getInstance(i50).getDatabase();
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
                                    callback2.run(Long.valueOf(r4.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    callback2.run(0L, null);
                                }
                                sQLiteCursor3 = sQLiteCursor;
                            } catch (Exception e10) {
                                e = e10;
                                FileLog.e(e);
                                callback2.run(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor4 = sQLiteCursor2;
                        if (sQLiteCursor4 != null) {
                            sQLiteCursor4.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor4 != null) {
                    }
                    throw th;
                }
                break;
            case 21:
                ky0 ky0Var = (ky0) this.c;
                a0.i iVar4 = (a0.i) this.d;
                int i51 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var4 = ky0Var.b1.L;
                if (n2Var4 instanceof org.telegram.ui.zn) {
                    org.telegram.ui.zn znVar3 = (org.telegram.ui.zn) n2Var4;
                    znVar3.T7();
                    undoView2 = znVar3.y3;
                } else if (n2Var4 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) n2Var4).M;
                }
                UndoView undoView5 = undoView2;
                if (undoView5 != null) {
                    if (iVar4.m() == 1) {
                        undoView5.m(((TLRPC.Dialog) iVar4.n(0)).id, Integer.valueOf(i51), 53);
                        return;
                    } else {
                        undoView5.k(0L, 53, Integer.valueOf(i51), Integer.valueOf(iVar4.m()), null, null);
                        return;
                    }
                }
                return;
            case 22:
                oz0 oz0Var = (oz0) this.c;
                String str3 = (String) this.d;
                int i52 = this.b;
                ArrayList<MediaDataController.KeywordResult> arrayList11 = new ArrayList<>(1);
                arrayList11.add(new MediaDataController.KeywordResult(str3, null));
                MediaDataController.getInstance(oz0Var.a).fillWithAnimatedEmoji(arrayList11, 15, false, false, false, new ai.d9(oz0Var, i52, str3, arrayList11));
                return;
            case 23:
                q21 q21Var = (q21) this.c;
                String str4 = (String) this.d;
                int i53 = this.b;
                p21 p21Var = q21Var.r.n;
                try {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        q21Var.d = -1;
                        AndroidUtilities.runOnUIThread(new ai.d9(q21Var, q21Var.d, new ArrayList(), new ArrayList(), 29));
                        return;
                    }
                    String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                    if (!lowerCase.equals(translitString) && translitString.length() != 0) {
                        str = translitString;
                        break;
                    }
                    int i54 = 0;
                    int i55 = i54 + 1;
                    String[] strArr = new String[i55];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    int size5 = p21Var.d.size();
                    for (int i56 = 0; i56 < size5; i56++) {
                        ArrayList arrayList14 = (ArrayList) p21Var.d.get(i56);
                        String i57 = org.telegram.ui.ActionBar.g5.i(((org.telegram.ui.ActionBar.k6) arrayList14.get(0)).f);
                        String lowerCase2 = i57.toLowerCase();
                        int i58 = 0;
                        while (true) {
                            if (i58 < i55) {
                                String str5 = strArr[i58];
                                if (lowerCase2.contains(str5)) {
                                    arrayList12.add(arrayList14);
                                    arrayList13.add(q21.E(i57, str5));
                                } else {
                                    i58++;
                                }
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ai.d9(q21Var, i53, arrayList12, arrayList13, 29));
                    return;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 24:
                a();
                return;
            case 25:
                b();
                return;
            case 26:
                c();
                return;
            case 27:
                e();
                return;
            case 28:
                f();
                return;
            default:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
                int i59 = this.b;
                Pattern pattern2 = LaunchActivity.B1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
                if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
                    if (tL_help_appUpdate.can_not_skip) {
                        launchActivity.I0(i59, tL_help_appUpdate, false);
                    } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                        ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i59);
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ zk(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ zk(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
