package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LruCache;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class kj0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public boolean E;
    public boolean F;
    public String G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final a0.g R;
    public org.telegram.ui.Components.kj0 S;
    public LinearLayout T;
    public int U;
    public boolean V;
    public ImageReceiver W;
    public boolean X;
    public boolean Y;
    public final x5 Z;
    public TLRPC.ChatFull a;
    public FrameLayout a0;
    public final long b;
    public gj0 b0;
    public final int c;
    public hg.f c0;
    public ij0 d;
    public final boolean d0;
    public org.telegram.ui.Components.tz e;
    public cb1 e0;
    public org.telegram.ui.Components.vl0 f;
    public s4.c0 h;
    public final MessageObject n;
    public ra1 r;
    public ra1 s;
    public final LruCache v;
    public eb1 w;
    public final ArrayList x;
    public boolean y;

    public kj0(MessageObject messageObject) {
        super(null);
        this.v = new LruCache(15);
        this.x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new x5(this, 10);
        this.n = messageObject;
        if (messageObject.messageOwner.fwd_from == null) {
            this.b = messageObject.getChatId();
            this.c = messageObject.getId();
        } else {
            this.b = -messageObject.getFromChatId();
            this.c = messageObject.messageOwner.fwd_msg_id;
        }
        this.a = getMessagesController().getChatFull(this.b);
    }

    public static /* synthetic */ void U(kj0 kj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        TL_stats.StatsGraph statsGraph;
        TL_stats.StatsGraph statsGraph2;
        kj0Var.y = true;
        if (tL_error != null) {
            kj0Var.g0();
            return;
        }
        if (tLObject instanceof TL_stories.TL_stats_storyStats) {
            TL_stories.TL_stats_storyStats tL_stats_storyStats = (TL_stories.TL_stats_storyStats) tLObject;
            statsGraph = tL_stats_storyStats.views_graph;
            statsGraph2 = tL_stats_storyStats.reactions_by_emotion_graph;
        } else {
            TL_stats.TL_messageStats tL_messageStats = (TL_stats.TL_messageStats) tLObject;
            statsGraph = tL_messageStats.views_graph;
            statsGraph2 = tL_messageStats.reactions_by_emotion_graph;
        }
        kj0Var.r = fb1.f0(statsGraph, LocaleController.getString(R.string.ViewsAndSharesChartTitle), 1, false);
        kj0Var.s = fb1.f0(statsGraph2, LocaleController.getString(R.string.ReactionsByEmotionChartTitle), 2, false);
        ra1 ra1Var = kj0Var.r;
        if (ra1Var == null || ra1Var.d.a.length > 5) {
            kj0Var.g0();
            return;
        }
        kj0Var.y = false;
        TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
        ra1 ra1Var2 = kj0Var.r;
        tL_loadAsyncGraph.token = ra1Var2.g;
        long[] jArr = ra1Var2.d.a;
        tL_loadAsyncGraph.x = jArr[jArr.length - 1];
        tL_loadAsyncGraph.flags |= 1;
        ConnectionsManager.getInstance(kj0Var.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(kj0Var.currentAccount).sendRequest(tL_loadAsyncGraph, new aa(kj0Var, kj0Var.r.g + "_" + tL_loadAsyncGraph.x, tL_loadAsyncGraph, 24), null, null, 0, kj0Var.a.stats_dc, 1, true), kj0Var.classGuid);
    }

    public static /* synthetic */ void V(kj0 kj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = kj0Var.x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                kj0Var.G = tL_publicForwards.next_offset;
            } else {
                kj0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                kj0Var.U = i10;
            } else if (kj0Var.U == 0) {
                kj0Var.U = tL_publicForwards.forwards.size();
            }
            kj0Var.V = kj0Var.G == null;
            kj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            kj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    MessageObject messageObject = new MessageObject(kj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(kj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.tz tzVar = kj0Var.e;
            if (tzVar != null) {
                tzVar.c();
            }
        }
        kj0Var.F = true;
        kj0Var.E = false;
        kj0Var.g0();
    }

    public static /* synthetic */ void W(kj0 kj0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        ArrayList arrayList = kj0Var.x;
        if (tL_error == null) {
            TL_stats.TL_publicForwards tL_publicForwards = (TL_stats.TL_publicForwards) tLObject;
            if ((tL_publicForwards.flags & 1) != 0) {
                kj0Var.G = tL_publicForwards.next_offset;
            } else {
                kj0Var.G = null;
            }
            int i10 = tL_publicForwards.count;
            if (i10 != 0) {
                kj0Var.U = i10;
            } else if (kj0Var.U == 0) {
                kj0Var.U = tL_publicForwards.forwards.size();
            }
            kj0Var.V = kj0Var.G == null;
            kj0Var.getMessagesController().putChats(tL_publicForwards.chats, false);
            kj0Var.getMessagesController().putUsers(tL_publicForwards.users, false);
            ArrayList<TL_stats.PublicForward> arrayList2 = tL_publicForwards.forwards;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                TL_stats.PublicForward publicForward = arrayList2.get(i11);
                i11++;
                TL_stats.PublicForward publicForward2 = publicForward;
                if (publicForward2 instanceof TL_stories.TL_publicForwardStory) {
                    TL_stories.TL_publicForwardStory tL_publicForwardStory = (TL_stories.TL_publicForwardStory) publicForward2;
                    tL_publicForwardStory.story.dialogId = DialogObject.getPeerDialogId(tL_publicForwardStory.peer);
                    TL_stories.StoryItem storyItem = tL_publicForwardStory.story;
                    storyItem.messageId = storyItem.id;
                    MessageObject messageObject = new MessageObject(kj0Var.currentAccount, storyItem);
                    messageObject.generateThumbs(false);
                    arrayList.add(messageObject);
                } else if (publicForward2 instanceof TL_stats.TL_publicForwardMessage) {
                    arrayList.add(new MessageObject(kj0Var.currentAccount, ((TL_stats.TL_publicForwardMessage) publicForward2).message, false, true));
                }
            }
            org.telegram.ui.Components.tz tzVar = kj0Var.e;
            if (tzVar != null) {
                tzVar.c();
            }
        }
        kj0Var.F = true;
        kj0Var.E = false;
        kj0Var.g0();
    }

    public final boolean a0(MessageObject messageObject) {
        if (!messageObject.isStory() || !(messageObject.storyItem instanceof TL_stories.TL_storyItemDeleted)) {
            return false;
        }
        org.telegram.messenger.a2.o(R.string.StoryNotFound, org.telegram.ui.Components.wc.a0(this), R.raw.story_bomb1, 36);
        return true;
    }

    public final void b0() {
        if (this.E) {
            return;
        }
        this.E = true;
        ij0 ij0Var = this.d;
        if (ij0Var != null) {
            ij0Var.l();
        }
        MessageObject messageObject = this.n;
        if (messageObject.isStory()) {
            TL_stats.TL_getStoryPublicForwards tL_getStoryPublicForwards = new TL_stats.TL_getStoryPublicForwards();
            tL_getStoryPublicForwards.limit = 100;
            tL_getStoryPublicForwards.id = messageObject.storyItem.id;
            tL_getStoryPublicForwards.peer = getMessagesController().getInputPeer(-this.b);
            String str = this.G;
            tL_getStoryPublicForwards.offset = str != null ? str : "";
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getStoryPublicForwards, new ej0(this, 1), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
            return;
        }
        TL_stats.TL_getMessagePublicForwards tL_getMessagePublicForwards = new TL_stats.TL_getMessagePublicForwards();
        tL_getMessagePublicForwards.limit = 100;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
        if (messageFwdHeader != null) {
            tL_getMessagePublicForwards.msg_id = messageFwdHeader.saved_from_msg_id;
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-messageObject.getFromChatId());
        } else {
            tL_getMessagePublicForwards.msg_id = messageObject.getId();
            tL_getMessagePublicForwards.channel = getMessagesController().getInputChannel(-messageObject.getDialogId());
        }
        String str2 = this.G;
        tL_getMessagePublicForwards.offset = str2 != null ? str2 : "";
        getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_getMessagePublicForwards, new ej0(this, 2), null, null, 0, this.a.stats_dc, 1, true), this.classGuid);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c0() {
        TL_stats.TL_getMessageStats tL_getMessageStats;
        MessageObject messageObject = this.n;
        if (messageObject.isStory()) {
            TL_stories.TL_stats_getStoryStats tL_stats_getStoryStats = new TL_stories.TL_stats_getStoryStats();
            tL_stats_getStoryStats.id = messageObject.storyItem.id;
            tL_stats_getStoryStats.peer = getMessagesController().getInputPeer(-this.b);
            tL_getMessageStats = tL_stats_getStoryStats;
        } else {
            TL_stats.TL_getMessageStats tL_getMessageStats2 = new TL_stats.TL_getMessageStats();
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader != null) {
                tL_getMessageStats2.msg_id = messageFwdHeader.saved_from_msg_id;
                tL_getMessageStats2.channel = getMessagesController().getInputChannel(-messageObject.getFromChatId());
                tL_getMessageStats = tL_getMessageStats2;
            } else {
                tL_getMessageStats2.msg_id = messageObject.getId();
                tL_getMessageStats2.channel = getMessagesController().getInputChannel(-messageObject.getDialogId());
                tL_getMessageStats = tL_getMessageStats2;
            }
        }
        getConnectionsManager().sendRequest(tL_getMessageStats, new ej0(this, 0), null, null, 0, this.a.stats_dc, 1, true);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        int i10;
        CharSequence charSequence;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, getResourceProvider()));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.tz tzVar = new org.telegram.ui.Components.tz(context, null);
        this.e = tzVar;
        tzVar.setText(LocaleController.getString(R.string.NoResult));
        this.e.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.kj0 kj0Var = new org.telegram.ui.Components.kj0(context);
        this.S = kj0Var;
        kj0Var.setAutoRepeat(true);
        this.S.f(R.raw.statistic_preload, 120, 120, null);
        this.S.d();
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.Oi;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, getResourceProvider()));
        textView.setTag(Integer.valueOf(i11));
        textView.setText(LocaleController.getString(R.string.LoadingStats));
        textView.setGravity(1);
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        int i12 = org.telegram.ui.ActionBar.j6.Pi;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, getResourceProvider()));
        textView2.setTag(Integer.valueOf(i12));
        org.telegram.messenger.em.k(R.string.LoadingStatsDescription, textView2, 1);
        this.T.addView(this.S, w7.a6.t(120, 120, 1, 0, 0, 0, 20));
        this.T.addView(textView, w7.a6.t(-2, -2, 1, 0, 0, 0, 10));
        this.T.addView(textView2, w7.a6.q(-2, -2, 1));
        this.T.setAlpha(0.0f);
        frameLayout2.addView(this.T, w7.a6.d(240, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, getResourceProvider());
        this.f = vl0Var;
        vl0Var.o1();
        org.telegram.ui.Components.vl0 vl0Var2 = this.f;
        s4.c0 c0Var = new s4.c0(1, false);
        this.h = c0Var;
        vl0Var2.setLayoutManager(c0Var);
        ((s4.f1) this.f.getItemAnimator()).m = false;
        org.telegram.ui.Components.vl0 vl0Var3 = this.f;
        ij0 ij0Var = new ij0(this, context);
        this.d = ij0Var;
        vl0Var3.setAdapter(ij0Var);
        this.f.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        this.actionBar.setAdaptiveBackground(this.f);
        this.f.setOnItemClickListener(new i(this, 18));
        this.f.setOnItemLongClickListener(new iu(this, 23));
        this.f.setOnScrollListener(new j3(this, 20));
        this.e.c();
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.a0 = frameLayout3;
        frameLayout3.addView(this.f, w7.a6.c(-1.0f, -1));
        this.a0.addView(this.e, w7.a6.c(-1.0f, -1));
        this.a0.setVisibility(8);
        frameLayout2.addView(this.a0, w7.a6.c(-1.0f, -1));
        AndroidUtilities.runOnUIThread(this.Z, 300L);
        g0();
        this.f.setEmptyView(this.e);
        this.b0 = new gj0(this, context);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.W = imageReceiver;
        imageReceiver.setParentView(this.b0);
        this.W.setRoundRadius(AndroidUtilities.dp(9.0f));
        this.Y = false;
        MessageObject messageObject = this.n;
        if (!messageObject.isStory()) {
            if (!messageObject.needDrawBluredPreview() && (messageObject.isPhoto() || messageObject.isNewGif() || messageObject.isVideo())) {
                String str = messageObject.isWebpage() ? messageObject.messageOwner.media.webpage.type : null;
                if (!"app".equals(str) && !"profile".equals(str) && !"article".equals(str) && (str == null || !str.startsWith("telegram_"))) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                    TLRPC.PhotoSize photoSize = closestPhotoSizeWithSize != closestPhotoSizeWithSize2 ? closestPhotoSizeWithSize2 : null;
                    if (closestPhotoSizeWithSize != null) {
                        this.Y = true;
                        this.X = messageObject.isVideo();
                        String attachFileName = FileLoader.getAttachFileName(photoSize);
                        if (messageObject.mediaExists || DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject) || FileLoader.getInstance(this.currentAccount).isLoadingFile(attachFileName)) {
                            this.W.setImage(ImageLocation.getForObject(photoSize, messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (messageObject.type != 1 || photoSize == null) ? 0 : photoSize.size, null, this.n, 0);
                        } else {
                            this.W.setImage((ImageLocation) null, (String) null, ImageLocation.getForObject(closestPhotoSizeWithSize, messageObject.photoThumbsObject), "50_50", (Drawable) null, this.n, 0);
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(messageObject.caption)) {
                charSequence = messageObject.caption;
            } else if (TextUtils.isEmpty(messageObject.messageOwner.message)) {
                charSequence = messageObject.messageText;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                if (charSequence2.length() > 150) {
                    charSequence2 = charSequence2.subSequence(0, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
                }
                charSequence = Emoji.replaceEmoji(charSequence2, this.b0.getSubtitlePaint().getFontMetricsInt(), false);
            }
            if (messageObject.isVideo() || messageObject.isPhoto()) {
                gj0 gj0Var = this.b0;
                if (gj0Var.getSubtitleTextView() != null) {
                    gj0Var.getSubtitleTextView().setVisibility(8);
                }
            } else {
                this.b0.setSubtitle(charSequence);
            }
        }
        if (this.Y || messageObject.isStory()) {
            this.b0.setRightAvatarPadding(-AndroidUtilities.dp(3.0f));
            i10 = 50;
        } else {
            i10 = 56;
        }
        this.actionBar.addView(this.b0, 0, w7.a6.d(-2, -1.0f, 51, !this.inPreviewMode ? i10 : 0.0f, 0.0f, 40.0f, 0.0f));
        e0();
        this.b0.i(org.telegram.ui.ActionBar.j6.v0(i11, getResourceProvider()), org.telegram.ui.ActionBar.j6.v0(i12, getResourceProvider()));
        View subtitleTextView = this.b0.getSubtitleTextView();
        if (subtitleTextView instanceof org.telegram.ui.ActionBar.l5) {
            ((org.telegram.ui.ActionBar.l5) subtitleTextView).setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i12, getResourceProvider()));
        }
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, getResourceProvider()), false);
        this.actionBar.A(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z8, getResourceProvider()), false);
        com.google.android.gms.internal.vision.e2.t(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 9));
        this.b0.setOnClickListener(new l60(this, 10));
        f0();
        return this.fragmentView;
    }

    public final void d0(View view) {
        if (view instanceof org.telegram.ui.Cells.b5) {
            ((org.telegram.ui.Cells.b5) view).c(0);
        } else if (view instanceof pa1) {
            ((pa1) view).d();
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, getResourceProvider()));
        } else if (view instanceof org.telegram.ui.Cells.c7) {
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, getResourceProvider())), org.telegram.ui.ActionBar.j6.V0(ApplicationLoader.applicationContext, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.b7), 0, 0);
            vqVar.w = true;
            view.setBackground(vqVar);
        } else if (view instanceof jg.c) {
            ((jg.c) view).a();
        } else if (view instanceof jj0) {
            int i10 = jj0.d;
            ((jj0) view).a();
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, getResourceProvider()));
        }
        if (view instanceof org.telegram.ui.Cells.k3) {
            view.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, getResourceProvider()));
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.a == null && chatFull.id == this.b) {
                e0();
                this.a = chatFull;
                c0();
                b0();
                f0();
            }
        }
    }

    public final void e0() {
        MessageObject messageObject = this.n;
        if (!messageObject.isStory()) {
            this.b0.setTitle(LocaleController.getString(R.string.PostStatistics));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.b));
            if (chat == null || this.Y) {
                return;
            }
            this.b0.setChatAvatar(chat);
            return;
        }
        this.b0.setTitle(LocaleController.getString(R.string.StoryStatistics));
        gj0 gj0Var = this.b0;
        if (gj0Var.getSubtitleTextView() != null) {
            gj0Var.getSubtitleTextView().setVisibility(8);
        }
        gj0 gj0Var2 = this.b0;
        gj0Var2.b = true;
        gj0Var2.setStoriesForceState(1);
        ArrayList<TLRPC.PhotoSize> arrayList = messageObject.photoThumbs;
        if (arrayList != null) {
            this.b0.getAvatarImageView().j(ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.getPhotoSize()), messageObject.photoThumbsObject), "50_50", ImageLocation.getForObject(FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, 50), messageObject.photoThumbsObject), "b1", 0, this.n);
            this.b0.setClipChildren(false);
            this.b0.getAvatarImageView().setScaleX(0.96f);
            this.b0.getAvatarImageView().setScaleY(0.96f);
        }
    }

    public final void f0() {
        TLRPC.ChatFull chatFull;
        if (this.d0 && (chatFull = this.a) != null && chatFull.can_view_stats) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            ArrayList arrayList = n10.e;
            if (arrayList != null) {
                arrayList.clear();
            }
            n10.removeAllViews();
            n10.a(0, R.drawable.ic_ab_other).e(1, R.drawable.msg_stats, LocaleController.getString(R.string.ViewChannelStats));
        }
    }

    public final void g0() {
        a0.g gVar = this.R;
        gVar.clear();
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.O = -1;
        this.N = -1;
        this.Q = 0;
        if (this.F && this.y) {
            AndroidUtilities.cancelRunOnUIThread(this.Z);
            if (this.a0.getVisibility() == 8) {
                this.T.animate().alpha(0.0f).setListener(new org.telegram.ui.Components.voip.v2(this, 16));
                this.a0.setVisibility(0);
                this.a0.setAlpha(0.0f);
                this.a0.animate().alpha(1.0f).start();
            }
            int i10 = this.Q;
            this.O = i10;
            this.N = i10 + 1;
            this.Q = i10 + 3;
            gVar.add(Integer.valueOf(i10 + 2));
            if (this.r != null) {
                int i11 = this.Q;
                this.L = i11;
                this.Q = i11 + 2;
                gVar.add(Integer.valueOf(i11 + 1));
            }
            if (this.s != null) {
                int i12 = this.Q;
                this.M = i12;
                this.Q = i12 + 2;
                gVar.add(Integer.valueOf(i12 + 1));
            }
            ArrayList arrayList = this.x;
            if (!arrayList.isEmpty()) {
                int i13 = this.Q;
                int i14 = i13 + 1;
                this.Q = i14;
                this.H = i13;
                this.I = i14;
                int size = arrayList.size() + i14;
                this.J = size;
                this.P = size;
                this.Q = size + 2;
                gVar.add(Integer.valueOf(size + 1));
                if (!this.V) {
                    int i15 = this.Q;
                    this.Q = i15 + 1;
                    this.K = i15;
                }
            }
        }
        ij0 ij0Var = this.d;
        if (ij0Var != null) {
            ij0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 25);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.b5.class}, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        gj0 gj0Var = this.b0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gj0Var != null ? gj0Var.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.Oi));
        gj0 gj0Var2 = this.b0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(gj0Var2 != null ? gj0Var2.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.rj));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.j6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.j6.r0, null, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_31, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_30, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        fb1.k0(this.r, arrayList, eVar);
        fb1.k0(this.s, arrayList, eVar);
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public boolean isLightStatusBar() {
        return i0.a.f(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, getResourceProvider())) > 0.699999988079071d;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        if (this.a != null) {
            c0();
            b0();
        } else {
            MessagesController.getInstance(this.currentAccount).loadFullChat(this.b, this.classGuid, true);
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ij0 ij0Var = this.d;
        if (ij0Var != null) {
            ij0Var.l();
        }
    }

    public kj0(MessageObject messageObject, boolean z10, long j3) {
        super(null);
        this.v = new LruCache(15);
        this.x = new ArrayList();
        this.G = null;
        this.R = new a0.g(0);
        this.Z = new x5(this, 10);
        this.n = messageObject;
        this.c = 0;
        this.b = j3;
        this.a = getMessagesController().getChatFull(j3);
        this.d0 = z10;
    }
}
