package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class kq extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public int A0;
    public final boolean B;
    public int B0;
    public final boolean C;
    public int C0;
    public final boolean D;
    public int D0;
    public boolean E;
    public int E0;
    public final boolean F;
    public int F0;
    public float G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public final TLRPC.TL_chatAdminRights J;
    public int J0;
    public final TLRPC.TL_chatAdminRights K;
    public int K0;
    public TLRPC.TL_chatBannedRights L;
    public boolean L0;
    public final TLRPC.TL_chatBannedRights M;
    public int M0;
    public boolean N;
    public int N0;
    public final String O;
    public int O0;
    public String P;
    public int P0;
    public final String Q;
    public boolean Q0;
    public final boolean R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public int T0;
    public int U;
    public hq U0;
    public int V;
    public final String V0;
    public int W;
    public final boolean W0;
    public int X;
    public final boolean X0;
    public int Y;
    public ValueAnimator Y0;
    public int Z;
    public ValueAnimator Z0;
    public jq a;
    public int a0;
    public mh.d1 b;
    public int b0;
    public k c;
    public int c0;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public org.telegram.ui.Components.k6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.or h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public long n;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public boolean r;
    public int r0;
    public long s;
    public int s0;
    public int t0;
    public int u0;
    public final TLRPC.User v;
    public int v0;
    public TLRPC.Chat w;
    public int w0;
    public TLRPC.ChatFull x;
    public boolean x0;
    public final int y;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z4, boolean z10, String str2) {
        super(null);
        boolean z11;
        TLRPC.UserFull userFull;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        this.E = false;
        this.G = 0.0f;
        this.H = false;
        this.I = false;
        this.O = "";
        this.W0 = z10;
        this.s = j11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        this.v = user;
        this.y = i10;
        this.F = z4;
        boolean z12 = true;
        boolean z13 = !z4;
        this.Q0 = z13;
        this.L0 = z13;
        this.V0 = str2;
        this.w = getMessagesController().getChat(Long.valueOf(this.s));
        this.x = getMessagesController().getChatFull(this.s);
        this.R = user != null && user.bot_guard;
        String str3 = str != null ? str : "";
        this.P = str3;
        this.Q = str3;
        this.C = ChatObject.isCommunity(this.w);
        TLRPC.Chat chat2 = this.w;
        if (chat2 != null) {
            this.B = ChatObject.isChannel(chat2) && !this.w.megagroup;
            this.D = ChatObject.isForum(this.w);
            this.K = this.w.admin_rights;
        }
        if (this.K == null) {
            this.K = o0(i10 != 2 || ((chat = this.w) != null && chat.creator));
        }
        if (i10 == 0 || i10 == 2) {
            if (i10 == 2 && (userFull = getMessagesController().getUserFull(j10)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.B ? userFull.bot_broadcast_admin_rights : userFull.bot_group_admin_rights;
                if (tL_chatAdminRights3 != null) {
                    if (tL_chatAdminRights2 == null) {
                        tL_chatAdminRights2 = tL_chatAdminRights3;
                    } else {
                        tL_chatAdminRights2.ban_users = tL_chatAdminRights2.ban_users || tL_chatAdminRights3.ban_users;
                        tL_chatAdminRights2.add_admins = tL_chatAdminRights2.add_admins || tL_chatAdminRights3.add_admins;
                        tL_chatAdminRights2.post_messages = tL_chatAdminRights2.post_messages || tL_chatAdminRights3.post_messages;
                        tL_chatAdminRights2.pin_messages = tL_chatAdminRights2.pin_messages || tL_chatAdminRights3.pin_messages;
                        tL_chatAdminRights2.manage_ranks = tL_chatAdminRights2.manage_ranks || tL_chatAdminRights3.manage_ranks;
                        tL_chatAdminRights2.delete_messages = tL_chatAdminRights2.delete_messages || tL_chatAdminRights3.delete_messages;
                        tL_chatAdminRights2.change_info = tL_chatAdminRights2.change_info || tL_chatAdminRights3.change_info;
                        tL_chatAdminRights2.anonymous = tL_chatAdminRights2.anonymous || tL_chatAdminRights3.anonymous;
                        tL_chatAdminRights2.edit_messages = tL_chatAdminRights2.edit_messages || tL_chatAdminRights3.edit_messages;
                        tL_chatAdminRights2.manage_call = tL_chatAdminRights2.manage_call || tL_chatAdminRights3.manage_call;
                        tL_chatAdminRights2.manage_topics = tL_chatAdminRights2.manage_topics || tL_chatAdminRights3.manage_topics;
                        tL_chatAdminRights2.post_stories = tL_chatAdminRights2.post_stories || tL_chatAdminRights3.post_stories;
                        tL_chatAdminRights2.edit_stories = tL_chatAdminRights2.edit_stories || tL_chatAdminRights3.edit_stories;
                        tL_chatAdminRights2.delete_stories = tL_chatAdminRights2.delete_stories || tL_chatAdminRights3.delete_stories;
                        tL_chatAdminRights2.manage_direct_messages = tL_chatAdminRights2.manage_direct_messages || tL_chatAdminRights3.manage_direct_messages;
                        tL_chatAdminRights2.manage_welcome_messages = tL_chatAdminRights2.manage_welcome_messages || tL_chatAdminRights3.manage_welcome_messages;
                        tL_chatAdminRights2.manage_linked_peers = tL_chatAdminRights2.manage_linked_peers || tL_chatAdminRights3.manage_linked_peers;
                        tL_chatAdminRights2.other = tL_chatAdminRights2.other || tL_chatAdminRights3.other;
                    }
                }
            }
            if (tL_chatAdminRights2 == null) {
                this.I = false;
                if (i10 == 2) {
                    this.J = o0(false);
                    boolean z14 = this.B;
                    this.H = z14;
                    this.G = z14 ? 1.0f : 0.0f;
                    this.X0 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.J = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.K;
                    tL_chatAdminRights4.change_info = tL_chatAdminRights5.change_info;
                    tL_chatAdminRights4.post_messages = tL_chatAdminRights5.post_messages;
                    tL_chatAdminRights4.edit_messages = tL_chatAdminRights5.edit_messages;
                    tL_chatAdminRights4.delete_messages = tL_chatAdminRights5.delete_messages;
                    tL_chatAdminRights4.manage_call = tL_chatAdminRights5.manage_call;
                    tL_chatAdminRights4.ban_users = tL_chatAdminRights5.ban_users;
                    tL_chatAdminRights4.invite_users = tL_chatAdminRights5.invite_users;
                    tL_chatAdminRights4.pin_messages = tL_chatAdminRights5.pin_messages;
                    tL_chatAdminRights4.manage_ranks = tL_chatAdminRights5.manage_ranks;
                    tL_chatAdminRights4.manage_topics = tL_chatAdminRights5.manage_topics;
                    tL_chatAdminRights4.post_stories = tL_chatAdminRights5.post_stories;
                    tL_chatAdminRights4.edit_stories = tL_chatAdminRights5.edit_stories;
                    tL_chatAdminRights4.delete_stories = tL_chatAdminRights5.delete_stories;
                    tL_chatAdminRights4.manage_direct_messages = tL_chatAdminRights5.manage_direct_messages;
                    tL_chatAdminRights4.manage_welcome_messages = tL_chatAdminRights5.manage_welcome_messages;
                    tL_chatAdminRights4.manage_linked_peers = tL_chatAdminRights5.manage_linked_peers;
                    tL_chatAdminRights4.other = tL_chatAdminRights5.other;
                    this.X0 = false;
                }
            } else {
                this.I = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.J = tL_chatAdminRights6;
                boolean z15 = tL_chatAdminRights2.change_info;
                tL_chatAdminRights6.change_info = z15;
                boolean z16 = tL_chatAdminRights2.post_messages;
                tL_chatAdminRights6.post_messages = z16;
                boolean z17 = tL_chatAdminRights2.edit_messages;
                tL_chatAdminRights6.edit_messages = z17;
                boolean z18 = tL_chatAdminRights2.delete_messages;
                tL_chatAdminRights6.delete_messages = z18;
                boolean z19 = tL_chatAdminRights2.manage_call;
                tL_chatAdminRights6.manage_call = z19;
                boolean z20 = tL_chatAdminRights2.ban_users;
                tL_chatAdminRights6.ban_users = z20;
                boolean z21 = tL_chatAdminRights2.invite_users;
                tL_chatAdminRights6.invite_users = z21;
                boolean z22 = tL_chatAdminRights2.pin_messages;
                tL_chatAdminRights6.pin_messages = z22;
                boolean z23 = tL_chatAdminRights2.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z23;
                boolean z24 = tL_chatAdminRights2.manage_topics;
                tL_chatAdminRights6.manage_topics = z24;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights2.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights2.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights2.delete_stories;
                boolean z25 = tL_chatAdminRights2.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z25;
                boolean z26 = tL_chatAdminRights2.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z26;
                boolean z27 = tL_chatAdminRights2.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z27;
                boolean z28 = tL_chatAdminRights2.add_admins;
                tL_chatAdminRights6.add_admins = z28;
                boolean z29 = tL_chatAdminRights2.anonymous;
                tL_chatAdminRights6.anonymous = z29;
                boolean z30 = tL_chatAdminRights2.other;
                tL_chatAdminRights6.other = z30;
                boolean z31 = z15 || z16 || z25 || z26 || z17 || z18 || z20 || z21 || z27 || z22 || z23 || z28 || z19 || z29 || z24 || z30;
                this.X0 = z31;
                if (i10 == 2) {
                    boolean z32 = this.B || z31;
                    this.H = z32;
                    this.G = z32 ? 1.0f : 0.0f;
                    this.X0 = false;
                }
            }
            TLRPC.Chat chat3 = this.w;
            if (chat3 != null) {
                this.M = chat3.default_banned_rights;
            }
            if (this.M == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                this.M = tL_chatBannedRights3;
                tL_chatBannedRights3.view_messages = false;
                tL_chatBannedRights3.send_media = false;
                tL_chatBannedRights3.send_messages = false;
                tL_chatBannedRights3.embed_links = false;
                tL_chatBannedRights3.send_stickers = false;
                tL_chatBannedRights3.send_gifs = false;
                tL_chatBannedRights3.send_games = false;
                tL_chatBannedRights3.send_inline = false;
                tL_chatBannedRights3.send_polls = false;
                tL_chatBannedRights3.invite_users = false;
                tL_chatBannedRights3.change_info = false;
                tL_chatBannedRights3.pin_messages = false;
                tL_chatBannedRights3.manage_topics = false;
                tL_chatBannedRights3.send_plain = false;
                tL_chatBannedRights3.send_videos = false;
                tL_chatBannedRights3.send_photos = false;
                tL_chatBannedRights3.send_audios = false;
                tL_chatBannedRights3.send_docs = false;
                tL_chatBannedRights3.send_voices = false;
                tL_chatBannedRights3.send_roundvideos = false;
                tL_chatBannedRights3.edit_rank = false;
                tL_chatBannedRights3.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.M;
            if (tL_chatBannedRights4.change_info || this.B) {
                z11 = true;
            } else {
                z11 = true;
                this.J.change_info = true;
            }
            if (!tL_chatBannedRights4.pin_messages) {
                this.J.pin_messages = z11;
            }
        } else if (i10 == 1) {
            this.M = tL_chatBannedRights;
            if (tL_chatBannedRights == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights5 = new TLRPC.TL_chatBannedRights();
                this.M = tL_chatBannedRights5;
                tL_chatBannedRights5.view_messages = false;
                tL_chatBannedRights5.send_media = false;
                tL_chatBannedRights5.send_messages = false;
                tL_chatBannedRights5.embed_links = false;
                tL_chatBannedRights5.send_stickers = false;
                tL_chatBannedRights5.send_gifs = false;
                tL_chatBannedRights5.send_games = false;
                tL_chatBannedRights5.send_inline = false;
                tL_chatBannedRights5.send_polls = false;
                tL_chatBannedRights5.invite_users = false;
                tL_chatBannedRights5.change_info = false;
                tL_chatBannedRights5.pin_messages = false;
                tL_chatBannedRights5.manage_topics = false;
                tL_chatBannedRights5.send_plain = false;
                tL_chatBannedRights5.send_videos = false;
                tL_chatBannedRights5.send_photos = false;
                tL_chatBannedRights5.send_audios = false;
                tL_chatBannedRights5.send_docs = false;
                tL_chatBannedRights5.send_voices = false;
                tL_chatBannedRights5.send_roundvideos = false;
                tL_chatBannedRights5.edit_rank = false;
                tL_chatBannedRights5.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = new TLRPC.TL_chatBannedRights();
            this.L = tL_chatBannedRights6;
            if (tL_chatBannedRights2 == null) {
                tL_chatBannedRights6.view_messages = false;
                tL_chatBannedRights6.send_media = false;
                tL_chatBannedRights6.send_messages = false;
                tL_chatBannedRights6.embed_links = false;
                tL_chatBannedRights6.send_stickers = false;
                tL_chatBannedRights6.send_gifs = false;
                tL_chatBannedRights6.send_games = false;
                tL_chatBannedRights6.send_inline = false;
                tL_chatBannedRights6.send_polls = false;
                tL_chatBannedRights6.invite_users = false;
                tL_chatBannedRights6.change_info = false;
                tL_chatBannedRights6.pin_messages = false;
                tL_chatBannedRights6.manage_topics = false;
                tL_chatBannedRights6.edit_rank = false;
                tL_chatBannedRights6.send_reactions = false;
            } else {
                tL_chatBannedRights6.view_messages = tL_chatBannedRights2.view_messages;
                tL_chatBannedRights6.send_messages = tL_chatBannedRights2.send_messages;
                tL_chatBannedRights6.send_media = tL_chatBannedRights2.send_media;
                tL_chatBannedRights6.send_stickers = tL_chatBannedRights2.send_stickers;
                tL_chatBannedRights6.send_gifs = tL_chatBannedRights2.send_gifs;
                tL_chatBannedRights6.send_games = tL_chatBannedRights2.send_games;
                tL_chatBannedRights6.send_inline = tL_chatBannedRights2.send_inline;
                tL_chatBannedRights6.embed_links = tL_chatBannedRights2.embed_links;
                tL_chatBannedRights6.send_polls = tL_chatBannedRights2.send_polls;
                tL_chatBannedRights6.invite_users = tL_chatBannedRights2.invite_users;
                tL_chatBannedRights6.change_info = tL_chatBannedRights2.change_info;
                tL_chatBannedRights6.pin_messages = tL_chatBannedRights2.pin_messages;
                tL_chatBannedRights6.until_date = tL_chatBannedRights2.until_date;
                tL_chatBannedRights6.manage_topics = tL_chatBannedRights2.manage_topics;
                tL_chatBannedRights6.send_photos = tL_chatBannedRights2.send_photos;
                tL_chatBannedRights6.send_videos = tL_chatBannedRights2.send_videos;
                tL_chatBannedRights6.send_roundvideos = tL_chatBannedRights2.send_roundvideos;
                tL_chatBannedRights6.send_audios = tL_chatBannedRights2.send_audios;
                tL_chatBannedRights6.send_voices = tL_chatBannedRights2.send_voices;
                tL_chatBannedRights6.send_docs = tL_chatBannedRights2.send_docs;
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.L;
                tL_chatBannedRights7.send_plain = tL_chatBannedRights2.send_plain;
                tL_chatBannedRights7.edit_rank = tL_chatBannedRights2.edit_rank;
                tL_chatBannedRights7.send_reactions = tL_chatBannedRights2.send_reactions;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.M;
            if (tL_chatBannedRights8.view_messages) {
                this.L.view_messages = true;
            }
            if (tL_chatBannedRights8.send_messages) {
                this.L.send_messages = true;
            }
            if (tL_chatBannedRights8.send_media) {
                this.L.send_media = true;
            }
            if (tL_chatBannedRights8.send_stickers) {
                this.L.send_stickers = true;
            }
            if (tL_chatBannedRights8.send_gifs) {
                this.L.send_gifs = true;
            }
            if (tL_chatBannedRights8.send_games) {
                this.L.send_games = true;
            }
            if (tL_chatBannedRights8.send_inline) {
                this.L.send_inline = true;
            }
            if (tL_chatBannedRights8.embed_links) {
                this.L.embed_links = true;
            }
            if (tL_chatBannedRights8.send_polls) {
                this.L.send_polls = true;
            }
            if (tL_chatBannedRights8.invite_users) {
                this.L.invite_users = true;
            }
            if (tL_chatBannedRights8.change_info) {
                this.L.change_info = true;
            }
            if (tL_chatBannedRights8.pin_messages) {
                this.L.pin_messages = true;
            }
            if (tL_chatBannedRights8.edit_rank) {
                this.L.edit_rank = true;
            }
            if (tL_chatBannedRights8.send_reactions) {
                this.L.send_reactions = true;
            }
            if (tL_chatBannedRights8.manage_topics) {
                this.L.manage_topics = true;
            }
            if (tL_chatBannedRights8.send_photos) {
                this.L.send_photos = true;
            }
            if (tL_chatBannedRights8.send_videos) {
                this.L.send_videos = true;
            }
            if (tL_chatBannedRights8.send_audios) {
                this.L.send_audios = true;
            }
            if (tL_chatBannedRights8.send_docs) {
                this.L.send_docs = true;
            }
            if (tL_chatBannedRights8.send_voices) {
                this.L.send_voices = true;
            }
            if (tL_chatBannedRights8.send_roundvideos) {
                this.L.send_roundvideos = true;
            }
            if (tL_chatBannedRights8.send_plain) {
                this.L.send_plain = true;
            }
            this.O = ChatObject.getBannedRightsString(this.L);
            if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                z12 = false;
            }
            this.X0 = z12;
        }
        u0(false);
    }

    public static void U(kq kqVar, long j10) {
        if (j10 != 0) {
            kqVar.s = j10;
            kqVar.w = MessagesController.getInstance(kqVar.currentAccount).getChat(Long.valueOf(j10));
            kqVar.r0(true);
        }
    }

    public static void V(final kq kqVar, org.telegram.ui.ActionBar.c3 c3Var, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 0) {
            kqVar.L.until_date = 0;
            kqVar.a.m(kqVar.J0);
        } else if (intValue == 1) {
            kqVar.L.until_date = ConnectionsManager.getInstance(kqVar.currentAccount).getCurrentTime() + 86400;
            kqVar.a.m(kqVar.J0);
        } else if (intValue == 2) {
            kqVar.L.until_date = ConnectionsManager.getInstance(kqVar.currentAccount).getCurrentTime() + 604800;
            kqVar.a.m(kqVar.J0);
        } else if (intValue == 3) {
            kqVar.L.until_date = ConnectionsManager.getInstance(kqVar.currentAccount).getCurrentTime() + 2592000;
            kqVar.a.m(kqVar.J0);
        } else if (intValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(kqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() { // from class: org.telegram.ui.dq
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                        final kq kqVar2 = kq.this;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.clear();
                        calendar2.set(i10, i11, i12);
                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                        try {
                            TimePickerDialog timePickerDialog = new TimePickerDialog(kqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.gq
                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                    kq kqVar3 = kq.this;
                                    kqVar3.L.until_date = (i14 * 60) + (i13 * 3600) + time;
                                    kqVar3.a.m(kqVar3.J0);
                                }
                            }, 0, 0, true);
                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new eq());
                            kqVar2.showDialog(timePickerDialog);
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                    }
                }, calendar.get(1), calendar.get(2), calendar.get(5));
                DatePicker datePicker = datePickerDialog.getDatePicker();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                calendar2.set(11, calendar2.getMinimum(11));
                calendar2.set(12, calendar2.getMinimum(12));
                calendar2.set(13, calendar2.getMinimum(13));
                calendar2.set(14, calendar2.getMinimum(14));
                datePicker.setMinDate(calendar2.getTimeInMillis());
                calendar2.setTimeInMillis(System.currentTimeMillis() + 31536000000L);
                calendar2.set(11, calendar2.getMaximum(11));
                calendar2.set(12, calendar2.getMaximum(12));
                calendar2.set(13, calendar2.getMaximum(13));
                calendar2.set(14, calendar2.getMaximum(14));
                datePicker.setMaxDate(calendar2.getTimeInMillis());
                datePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), datePickerDialog);
                datePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new eq());
                datePickerDialog.setOnShowListener(new fq(0, datePicker));
                kqVar.showDialog(datePickerDialog);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        c3Var.a.dismissRunnable.run();
    }

    public static /* synthetic */ boolean W(kq kqVar, TLRPC.TL_error tL_error) {
        kqVar.t0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!ChatObject.isChannel(kqVar.w)) {
            fg.v0 v0Var = new fg.v0(11, kqVar.currentAccount, kqVar.getParentActivity(), kqVar, kqVar.getResourceProvider());
            ArrayList arrayList = new ArrayList();
            arrayList.add(kqVar.v);
            v0Var.I1(kqVar.w, arrayList, null, null, null);
            v0Var.show();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x048c, code lost:
    
        if (r5.creator == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04a1, code lost:
    
        if (r6.change_info != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04f4, code lost:
    
        if (r6.pin_messages != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0522, code lost:
    
        if (r5.creator == false) goto L240;
     */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0776  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(kq kqVar, Context context, View view, int i10) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        View m9;
        boolean z13 = kqVar.B;
        TLRPC.User user = kqVar.v;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = kqVar.M;
        int i11 = kqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = kqVar.J;
        if (kqVar.F || (kqVar.w.creator && i11 == 0 && i10 == kqVar.b0)) {
            boolean z14 = false;
            if (i10 == kqVar.w0) {
                if (!(view instanceof org.telegram.ui.Cells.r8) || ((org.telegram.ui.Cells.r8) view).isEnabled()) {
                    kqVar.x0 = !kqVar.x0;
                    kqVar.u0(false);
                    kqVar.a.m(kqVar.w0);
                    if (kqVar.x0) {
                        kqVar.a.s(kqVar.w0 + 1, 10);
                        return;
                    } else {
                        kqVar.a.t(kqVar.w0 + 1, 10);
                        return;
                    }
                }
                return;
            }
            int i12 = kqVar.K0;
            if (i10 == i12) {
                if (!(view instanceof org.telegram.ui.Cells.r8) || ((org.telegram.ui.Cells.r8) view).isEnabled()) {
                    kqVar.L0 = !kqVar.L0;
                    kqVar.u0(false);
                    kqVar.a.m(kqVar.K0);
                    if (kqVar.L0) {
                        kqVar.a.s(kqVar.K0 + 1, 3);
                        return;
                    } else {
                        kqVar.a.t(kqVar.K0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i13 = kqVar.P0;
            if (i10 == i13) {
                if (!(view instanceof org.telegram.ui.Cells.r8) || ((org.telegram.ui.Cells.r8) view).isEnabled()) {
                    kqVar.Q0 = !kqVar.Q0;
                    kqVar.u0(false);
                    kqVar.a.m(kqVar.P0);
                    if (kqVar.Q0) {
                        kqVar.a.s(kqVar.P0 + 1, 3);
                        return;
                    } else {
                        kqVar.a.t(kqVar.P0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            if (i10 == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                kqVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            if (i10 == kqVar.m0) {
                if (i11 == 0) {
                    MessagesController.getInstance(kqVar.currentAccount).setUserAdminRole(kqVar.s, kqVar.v, new TLRPC.TL_chatAdminRights(), kqVar.P, kqVar.B, kqVar.getFragmentForAlert(0), kqVar.W0, false, null, null);
                    hq hqVar = kqVar.U0;
                    if (hqVar != null) {
                        hqVar.b(0, tL_chatAdminRights, kqVar.L, kqVar.P);
                    }
                    kqVar.finishFragment();
                    return;
                }
                if (i11 == 1) {
                    kqVar.N = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    kqVar.L = tL_chatBannedRights3;
                    tL_chatBannedRights3.view_messages = true;
                    tL_chatBannedRights3.send_media = true;
                    tL_chatBannedRights3.send_messages = true;
                    tL_chatBannedRights3.send_stickers = true;
                    tL_chatBannedRights3.send_gifs = true;
                    tL_chatBannedRights3.send_games = true;
                    tL_chatBannedRights3.send_inline = true;
                    tL_chatBannedRights3.embed_links = true;
                    tL_chatBannedRights3.pin_messages = true;
                    tL_chatBannedRights3.edit_rank = true;
                    tL_chatBannedRights3.send_reactions = true;
                    tL_chatBannedRights3.send_polls = true;
                    tL_chatBannedRights3.invite_users = true;
                    tL_chatBannedRights3.change_info = true;
                    tL_chatBannedRights3.manage_topics = true;
                    tL_chatBannedRights3.until_date = 0;
                    kqVar.r0(true);
                    return;
                }
                return;
            }
            if (i10 == kqVar.q0) {
                kqVar.p0(null, null);
                return;
            }
            if (i10 == kqVar.J0) {
                if (kqVar.getParentActivity() == null) {
                    return;
                }
                org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(context, null);
                org.telegram.ui.ActionBar.h3 h3Var = c3Var.a;
                h3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.k6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString(R.string.UserRestrictionsDuration));
                linearLayout.addView(m4Var);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                int i14 = -2;
                linearLayout.addView(linearLayout2, k7.c6.n(-1, -2));
                org.telegram.ui.ActionBar.a3[] a3VarArr = new org.telegram.ui.ActionBar.a3[5];
                int i15 = 0;
                for (int i16 = 5; i15 < i16; i16 = 5) {
                    org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, 0, null);
                    a3VarArr[i15] = a3Var;
                    a3Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                    a3VarArr[i15].setTag(Integer.valueOf(i15));
                    a3VarArr[i15].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.K0(false));
                    a3VarArr[i15].a(i15 != 0 ? i15 != 1 ? i15 != 2 ? i15 != 3 ? LocaleController.getString(R.string.UserRestrictionsCustom) : LocaleController.formatPluralString("Months", 1, new Object[0]) : LocaleController.formatPluralString("Weeks", 1, new Object[0]) : LocaleController.formatPluralString("Days", 1, new Object[0]) : LocaleController.getString(R.string.UserRestrictionsUntilForever), 0, null, false);
                    linearLayout2.addView(a3VarArr[i15], k7.c6.n(-1, i14));
                    a3VarArr[i15].setOnClickListener(new org.telegram.messenger.video.g(22, kqVar, c3Var));
                    i15++;
                    i14 = -2;
                }
                c3Var.b(linearLayout);
                kqVar.showDialog(h3Var);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.z1) {
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                int i17 = kqVar.M0;
                if (i10 == i17 || i10 == kqVar.N0 || i10 == kqVar.O0) {
                    if (i10 == i17) {
                        z11 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z11;
                    } else if (i10 == kqVar.N0) {
                        z11 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z11;
                    } else {
                        z11 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z11;
                    }
                    kqVar.a.m(i12);
                    z1Var.c(z11, true);
                    return;
                }
                int i18 = kqVar.R0;
                if (i10 == i18 || i10 == kqVar.S0 || i10 == kqVar.T0) {
                    if (i10 == i18) {
                        z12 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z12;
                    } else if (i10 == kqVar.S0) {
                        z12 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z12;
                    } else {
                        z12 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z12;
                    }
                    kqVar.a.m(i13);
                    z1Var.c(z12, true);
                    return;
                }
                if (i11 != 1 || kqVar.L == null) {
                    return;
                }
                z1Var.b();
                if (z1Var.r.b != null) {
                    if (i11 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kqVar.getParentActivity());
                        String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                        d2Var.O = string;
                        d2Var.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        d2Var.show();
                        return;
                    }
                    return;
                }
                if (i10 == kqVar.y0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = kqVar.L;
                    z14 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z14;
                } else if (i10 == kqVar.z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = kqVar.L;
                    z14 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z14;
                } else if (i10 == kqVar.A0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = kqVar.L;
                    z14 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z14;
                } else if (i10 == kqVar.g0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = kqVar.L;
                    z14 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z14;
                } else if (i10 == kqVar.B0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = kqVar.L;
                    z14 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z14;
                } else if (i10 == kqVar.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = kqVar.L;
                    z14 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z14;
                } else if (i10 == kqVar.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = kqVar.L;
                    z14 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z14;
                } else if (i10 == kqVar.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = kqVar.L;
                    z14 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z14;
                    tL_chatBannedRights11.send_gifs = z14;
                    tL_chatBannedRights11.send_games = z14;
                    tL_chatBannedRights11.send_stickers = z14;
                } else if (i10 == kqVar.G0) {
                    if ((kqVar.L.send_plain || tL_chatBannedRights2.send_plain) && (m9 = kqVar.c.m(kqVar.v0)) != null) {
                        AndroidUtilities.shakeViewSpring(m9);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = kqVar.L;
                        z14 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z14;
                    }
                } else if (i10 == kqVar.F0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = kqVar.L;
                    z14 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z14;
                }
                kqVar.a.m(kqVar.w0);
                z1Var.c(!z14, true);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.r8) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                Switch r12 = r8Var.d;
                if (r12.C != null) {
                    if (i11 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kqVar.getParentActivity());
                        String string2 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
                        d2Var2.O = string2;
                        d2Var2.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        d2Var2.show();
                        return;
                    }
                    return;
                }
                if (!r8Var.isEnabled()) {
                    if (i11 == 2 || i11 == 0) {
                        if ((i10 != kqVar.U || tL_chatBannedRights2 == null || tL_chatBannedRights2.change_info) && ((i10 != kqVar.e0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.pin_messages) && (i10 != kqVar.f0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(kqVar.getParentActivity());
                        String string3 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.a;
                        d2Var3.O = string3;
                        d2Var3.Q = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.OK), null);
                        d2Var3.show();
                        return;
                    }
                    return;
                }
                if (i11 != 2 && i10 != kqVar.h0) {
                    r8Var.setChecked(!r12.h);
                }
                boolean z15 = r12.h;
                if (i10 == kqVar.T) {
                    z15 = !kqVar.H;
                    kqVar.H = z15;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = kqVar.K;
                    FrameLayout frameLayout = kqVar.e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = kqVar.b.getChildCount();
                    int i19 = 0;
                    while (i19 < childCount) {
                        View childAt = kqVar.b.getChildAt(i19);
                        kqVar.b.getClass();
                        int R = RecyclerView.R(childAt);
                        if (childAt instanceof org.telegram.ui.Cells.r8) {
                            boolean z16 = kqVar.H;
                            if (z16) {
                                if (R == kqVar.T) {
                                    if (!tL_chatAdminRights2.add_admins) {
                                        TLRPC.Chat chat = kqVar.w;
                                        if (chat != null) {
                                        }
                                        z10 = false;
                                    }
                                    z10 = true;
                                } else if (R == kqVar.U) {
                                    z16 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info) {
                                    }
                                    z10 = false;
                                } else if (R == kqVar.V) {
                                    z16 = tL_chatAdminRights.post_messages;
                                    z10 = tL_chatAdminRights2.post_messages;
                                } else if (R == kqVar.W) {
                                    z16 = tL_chatAdminRights.manage_direct_messages;
                                    z10 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (R == kqVar.X) {
                                    z16 = tL_chatAdminRights.manage_welcome_messages;
                                    z10 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (R == kqVar.Y) {
                                    z16 = tL_chatAdminRights.edit_messages;
                                    z10 = tL_chatAdminRights2.edit_messages;
                                } else if (R == kqVar.Z) {
                                    z16 = tL_chatAdminRights.delete_messages;
                                    z10 = tL_chatAdminRights2.delete_messages;
                                } else if (R == kqVar.c0) {
                                    z16 = tL_chatAdminRights.ban_users;
                                    z10 = tL_chatAdminRights2.ban_users;
                                } else if (R == kqVar.d0) {
                                    z16 = tL_chatAdminRights.invite_users;
                                    z10 = tL_chatAdminRights2.invite_users;
                                } else if (R == kqVar.e0) {
                                    z16 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages) {
                                    }
                                    z10 = false;
                                } else if (R == kqVar.f0) {
                                    z16 = tL_chatAdminRights.manage_ranks;
                                    z10 = tL_chatAdminRights2.manage_ranks;
                                } else if (R == kqVar.H0) {
                                    z16 = tL_chatAdminRights.manage_call;
                                    z10 = tL_chatAdminRights2.manage_call;
                                } else if (R == kqVar.a0) {
                                    z16 = tL_chatAdminRights.add_admins;
                                    z10 = tL_chatAdminRights2.add_admins;
                                } else if (R == kqVar.b0) {
                                    z16 = tL_chatAdminRights.anonymous;
                                    if (!tL_chatAdminRights2.anonymous) {
                                        TLRPC.Chat chat2 = kqVar.w;
                                        if (chat2 != null) {
                                        }
                                        z10 = false;
                                    }
                                    z10 = true;
                                } else if (R == kqVar.j0) {
                                    z16 = tL_chatAdminRights.manage_topics;
                                    z10 = tL_chatAdminRights2.manage_topics;
                                } else if (R == kqVar.k0) {
                                    z16 = tL_chatAdminRights.manage_linked_peers;
                                    z10 = tL_chatAdminRights2.manage_linked_peers;
                                } else {
                                    z10 = false;
                                    z16 = false;
                                }
                                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) childAt;
                                r8Var2.setChecked(z16);
                                r8Var2.b(z10, true);
                                i19++;
                                z14 = false;
                            } else if ((R != kqVar.U || tL_chatBannedRights2.change_info) && ((R != kqVar.e0 || tL_chatBannedRights2.pin_messages) && (R != kqVar.f0 || tL_chatBannedRights2.edit_rank))) {
                                org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) childAt;
                                r8Var3.setChecked(z14);
                                r8Var3.b(R == kqVar.T, true);
                            } else {
                                org.telegram.ui.Cells.r8 r8Var4 = (org.telegram.ui.Cells.r8) childAt;
                                r8Var4.setChecked(true);
                                r8Var4.b(z14, z14);
                            }
                        }
                        i19++;
                        z14 = false;
                    }
                    kqVar.a.l();
                    org.telegram.ui.Components.k6 k6Var = kqVar.f;
                    if (k6Var != null) {
                        StringBuilder sb = new StringBuilder();
                        b.i(R.string.AddBotButton, " ", sb);
                        sb.append(LocaleController.getString(kqVar.H ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                        k6Var.c(sb.toString(), true, kqVar.H);
                    }
                    ValueAnimator valueAnimator = kqVar.Z0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        kqVar.Z0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(kqVar.G, kqVar.H ? 1.0f : 0.0f);
                    kqVar.Z0 = ofFloat;
                    ofFloat.addUpdateListener(new bq(kqVar, 1));
                    kqVar.Z0.setDuration((long) (Math.abs(kqVar.G - (kqVar.H ? 1.0f : 0.0f)) * 200.0f));
                    kqVar.Z0.start();
                } else if (i10 == kqVar.U) {
                    if (i11 == 0 || i11 == 2) {
                        z15 = !tL_chatAdminRights.change_info;
                        tL_chatAdminRights.change_info = z15;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights14 = kqVar.L;
                        z15 = !tL_chatBannedRights14.change_info;
                        tL_chatBannedRights14.change_info = z15;
                    }
                } else if (i10 == kqVar.V) {
                    z15 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z15;
                } else if (i10 == kqVar.h0) {
                    org.telegram.ui.Components.z4.v0(kqVar, LocaleController.getString(R.string.ApproveNewMembersTitle), AndroidUtilities.replaceTags(LocaleController.formatString(z15 ? z13 ? R.string.ApproveNewMembersDisabledMessageChannel : R.string.ApproveNewMembersDisabledMessageGroup : z13 ? R.string.ApproveNewMembersMessageChannel : R.string.ApproveNewMembersMessageGroup, DialogObject.getShortName(user))), LocaleController.getString(!z15 ? R.string.ApproveNewMembersEnable : R.string.ApproveNewMembersDisable), false, new aq(kqVar, !z15 ? user.id : 0L, 1));
                } else if (i10 == kqVar.X) {
                    z15 = !tL_chatAdminRights.manage_welcome_messages;
                    tL_chatAdminRights.manage_welcome_messages = z15;
                } else if (i10 == kqVar.W) {
                    z15 = !tL_chatAdminRights.manage_direct_messages;
                    tL_chatAdminRights.manage_direct_messages = z15;
                } else if (i10 == kqVar.Y) {
                    z15 = !tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.edit_messages = z15;
                } else if (i10 == kqVar.Z) {
                    z15 = !tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.delete_messages = z15;
                } else if (i10 == kqVar.a0) {
                    z15 = !tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.add_admins = z15;
                } else if (i10 == kqVar.b0) {
                    z15 = !tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.anonymous = z15;
                } else if (i10 == kqVar.c0) {
                    z15 = !tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.ban_users = z15;
                } else if (i10 == kqVar.H0) {
                    z15 = !tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.manage_call = z15;
                } else if (i10 == kqVar.j0) {
                    if (i11 == 0 || i11 == 2) {
                        z15 = !tL_chatAdminRights.manage_topics;
                        tL_chatAdminRights.manage_topics = z15;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = kqVar.L;
                        z15 = !tL_chatBannedRights15.manage_topics;
                        tL_chatBannedRights15.manage_topics = z15;
                    }
                } else if (i10 == kqVar.k0) {
                    if (i11 == 0 || i11 == 2) {
                        z15 = !tL_chatAdminRights.manage_linked_peers;
                        tL_chatAdminRights.manage_linked_peers = z15;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = kqVar.L;
                        z15 = !tL_chatBannedRights16.manage_linked_peers;
                        tL_chatBannedRights16.manage_linked_peers = z15;
                    }
                } else if (i10 == kqVar.d0) {
                    if (i11 == 0 || i11 == 2) {
                        z15 = !tL_chatAdminRights.invite_users;
                        tL_chatAdminRights.invite_users = z15;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = kqVar.L;
                        z15 = !tL_chatBannedRights17.invite_users;
                        tL_chatBannedRights17.invite_users = z15;
                    }
                } else if (i10 == kqVar.e0) {
                    if (i11 == 0 || i11 == 2) {
                        z15 = !tL_chatAdminRights.pin_messages;
                        tL_chatAdminRights.pin_messages = z15;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = kqVar.L;
                        z15 = !tL_chatBannedRights18.pin_messages;
                        tL_chatBannedRights18.pin_messages = z15;
                    }
                } else if (i10 == kqVar.f0) {
                    if (i11 == 0 || i11 == 2) {
                        z15 = !tL_chatAdminRights.manage_ranks;
                        tL_chatAdminRights.manage_ranks = z15;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights19 = kqVar.L;
                        z15 = !tL_chatBannedRights19.edit_rank;
                        tL_chatBannedRights19.edit_rank = z15;
                    }
                } else if (i11 == 1 && (tL_chatBannedRights = kqVar.L) != null) {
                    if (i10 == kqVar.v0) {
                        z4 = !tL_chatBannedRights.send_plain;
                        tL_chatBannedRights.send_plain = z4;
                    } else {
                        z4 = z15;
                    }
                    if (z15 && ((!tL_chatBannedRights.send_plain || !tL_chatBannedRights.embed_links || !tL_chatBannedRights.send_inline || !tL_chatBannedRights.send_photos || !tL_chatBannedRights.send_videos || !tL_chatBannedRights.send_audios || !tL_chatBannedRights.send_docs || !tL_chatBannedRights.send_voices || !tL_chatBannedRights.send_roundvideos || !tL_chatBannedRights.send_polls || !tL_chatBannedRights.send_reactions) && tL_chatBannedRights.view_messages)) {
                        tL_chatBannedRights.view_messages = false;
                    }
                    int i20 = kqVar.G0;
                    if (i20 >= 0) {
                        kqVar.a.m(i20);
                    }
                    int i21 = kqVar.w0;
                    if (i21 >= 0) {
                        kqVar.a.m(i21);
                    }
                    z15 = z4;
                    if (i11 == 2) {
                        r8Var.setChecked(kqVar.H && z15);
                    }
                    kqVar.u0(true);
                }
                if (i11 == 2) {
                }
                kqVar.u0(true);
            }
        }
    }

    public static void Y(kq kqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        boolean z4 = kqVar.B;
        TLRPC.User user = kqVar.v;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                kqVar.U0.a(user);
                kqVar.removeSelfFromStack();
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (kqVar.getParentActivity() == null) {
            return;
        }
        int i10 = 2;
        int i11 = 5;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kqVar.getParentActivity());
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                if (z4) {
                    d2Var.O = LocaleController.getString(R.string.EditAdminChannelTransfer);
                } else {
                    d2Var.O = LocaleController.getString(R.string.EditAdminGroupTransfer);
                }
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, kqVar.w.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new zp(kqVar, i11));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                kqVar.showDialog(d2Var);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(kqVar.currentAccount).sendRequest(new TL_account.getPassword(), new lo(i10, kqVar, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.Components.z4.h0(tL_error, kqVar, z4, kqVar.C, tL_channels_editCreator);
                return;
            }
            if (kqVar.getParentActivity() == null || AccountInstance.getInstance(kqVar.currentAccount).getUserConfig().isPremium()) {
                kqVar.presentFragment(new be1(1));
                return;
            } else {
                kqVar.showDialog(new fg.v0(5, kqVar.currentAccount, kqVar.getParentActivity(), kqVar, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.o0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kqVar.getParentActivity());
        String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.a;
        d2Var2.O = string;
        LinearLayout linearLayout = new LinearLayout(kqVar.getParentActivity());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(kqVar.getParentActivity());
        int i12 = org.telegram.ui.ActionBar.k6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z4) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
        }
        linearLayout.addView(textView, k7.c6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(kqVar.getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(kqVar.getParentActivity());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i12, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(kqVar.getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, k7.c6.n(-1, -2));
            linearLayout2.addView(imageView, k7.c6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, k7.c6.n(-2, -2));
            linearLayout2.addView(textView2, k7.c6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(kqVar.getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(kqVar.getParentActivity());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i12, false), mode));
        TextView textView3 = new TextView(kqVar.getParentActivity());
        textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y3.q(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, k7.c6.n(-1, -2));
            linearLayout3.addView(imageView2, k7.c6.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, k7.c6.n(-2, -2));
            linearLayout3.addView(textView3, k7.c6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new zp(kqVar, 6));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(kqVar.getParentActivity());
            textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i12, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
        }
        kqVar.showDialog(d2Var2);
    }

    public static void Z(kq kqVar, long j10) {
        TLRPC.ChatFull chatFull = kqVar.x;
        long j11 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User user = j11 != 0 ? kqVar.getMessagesController().getUser(Long.valueOf(j11)) : null;
        if (user != null && j10 != 0 && user.id != j10) {
            new org.telegram.ui.Components.a40(kqVar.getParentActivity(), kqVar.resourceProvider, user, kqVar.v, new aq(kqVar, j10, 0)).show();
            return;
        }
        kqVar.n = j10;
        kqVar.r = true;
        kqVar.n0();
    }

    public static /* synthetic */ void a0(kq kqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            kqVar.s = j10;
            kqVar.w = MessagesController.getInstance(kqVar.currentAccount).getChat(Long.valueOf(j10));
            kqVar.p0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void f0(kq kqVar, View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            String str = kqVar.P;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount > 4.8f) {
                m4Var.setText2("");
                return;
            }
            m4Var.setText2(String.format("%d", Integer.valueOf(codePointCount)));
            org.telegram.ui.ActionBar.l5 textView2 = m4Var.getTextView2();
            int i10 = codePointCount < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
            textView2.setTag(Integer.valueOf(i10));
        }
    }

    public static boolean l0(kq kqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = kqVar.M;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public static TLRPC.TL_chatAdminRights o0(boolean z4) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z4;
        tL_chatAdminRights.manage_ranks = z4;
        tL_chatAdminRights.manage_welcome_messages = z4;
        tL_chatAdminRights.manage_direct_messages = z4;
        tL_chatAdminRights.delete_stories = z4;
        tL_chatAdminRights.edit_stories = z4;
        tL_chatAdminRights.post_stories = z4;
        tL_chatAdminRights.manage_topics = z4;
        tL_chatAdminRights.manage_call = z4;
        tL_chatAdminRights.add_admins = z4;
        tL_chatAdminRights.pin_messages = z4;
        tL_chatAdminRights.invite_users = z4;
        tL_chatAdminRights.ban_users = z4;
        tL_chatAdminRights.delete_messages = z4;
        tL_chatAdminRights.edit_messages = z4;
        tL_chatAdminRights.post_messages = z4;
        tL_chatAdminRights.change_info = z4;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights s0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z4 = true;
        tL_chatAdminRights3.change_info = tL_chatAdminRights.change_info || tL_chatAdminRights2.change_info;
        tL_chatAdminRights3.post_messages = tL_chatAdminRights.post_messages || tL_chatAdminRights2.post_messages;
        tL_chatAdminRights3.edit_messages = tL_chatAdminRights.edit_messages || tL_chatAdminRights2.edit_messages;
        tL_chatAdminRights3.delete_messages = tL_chatAdminRights.delete_messages || tL_chatAdminRights2.delete_messages;
        tL_chatAdminRights3.ban_users = tL_chatAdminRights.ban_users || tL_chatAdminRights2.ban_users;
        tL_chatAdminRights3.invite_users = tL_chatAdminRights.invite_users || tL_chatAdminRights2.invite_users;
        tL_chatAdminRights3.pin_messages = tL_chatAdminRights.pin_messages || tL_chatAdminRights2.pin_messages;
        tL_chatAdminRights3.manage_ranks = tL_chatAdminRights.manage_ranks || tL_chatAdminRights2.manage_ranks;
        tL_chatAdminRights3.add_admins = tL_chatAdminRights.add_admins || tL_chatAdminRights2.add_admins;
        tL_chatAdminRights3.manage_call = tL_chatAdminRights.manage_call || tL_chatAdminRights2.manage_call;
        tL_chatAdminRights3.manage_topics = tL_chatAdminRights.manage_topics || tL_chatAdminRights2.manage_topics;
        tL_chatAdminRights3.post_stories = tL_chatAdminRights.post_stories || tL_chatAdminRights2.post_stories;
        tL_chatAdminRights3.edit_stories = tL_chatAdminRights.edit_stories || tL_chatAdminRights2.edit_stories;
        tL_chatAdminRights3.delete_stories = tL_chatAdminRights.delete_stories || tL_chatAdminRights2.delete_stories;
        tL_chatAdminRights3.manage_direct_messages = tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights2.manage_direct_messages;
        tL_chatAdminRights3.manage_welcome_messages = tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights2.manage_welcome_messages;
        if (!tL_chatAdminRights.manage_linked_peers && !tL_chatAdminRights2.manage_linked_peers) {
            z4 = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z4;
        return tL_chatAdminRights3;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i10 = this.y;
        if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new fg.l1(this, 21));
        boolean z4 = false;
        if (this.F || (!this.B && this.w.creator && UserObject.isUserSelf(this.v))) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i11 = org.telegram.ui.ActionBar.k6.v8;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            this.h = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i11, false)));
            n10.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            n10.k(1).setIcon(this.h);
        }
        w7 w7Var = new w7(this, context, 1);
        this.fragmentView = w7Var;
        w7Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.a7, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        mh.d1 d1Var = new mh.d1(this, context, 6);
        this.b = d1Var;
        d1Var.setClipChildren(i10 != 2);
        k kVar = new k(r1, z4, 3);
        this.c = kVar;
        kVar.E = 100;
        this.b.setLayoutManager(kVar);
        mh.d1 d1Var2 = this.b;
        jq jqVar = new jq(this, context);
        this.a = jqVar;
        d1Var2.setAdapter(jqVar);
        f2.l lVar = new f2.l();
        if (i10 == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        lVar.m = false;
        lVar.C = false;
        lVar.o(org.telegram.ui.Components.pr.h);
        lVar.n(350L);
        this.b.setItemAnimator(lVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, k7.c6.c(-1.0f, -1));
        this.b.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setOnScrollListener(new l3(this, 6));
        this.b.setOnItemClickListener(new hg.v0(7, this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.w;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.x = chatFull;
            n0();
            return;
        }
        if (i10 == NotificationCenter.dialogDeleted) {
            if ((-this.s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
                if (f5Var == null || f5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 9);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 16, new Class[]{org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.r8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.y8.class, org.telegram.ui.Cells.c6.class}, null, null, null, org.telegram.ui.ActionBar.k6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.k0, null, null, org.telegram.ui.ActionBar.k6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        int i11 = org.telegram.ui.ActionBar.k6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262144, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.y8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"valueTextView"}, null, null, -1, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, fVar, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.k6.r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 8192, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 16384, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.E5));
        return arrayList;
    }

    public final boolean m0(boolean z4) {
        int i10 = this.y;
        if (i10 != 2) {
            if (!(i10 == 1 ? this.O.equals(ChatObject.getBannedRightsString(this.L)) : this.Q.equals(this.P))) {
                int i11 = 0;
                if (z4) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                    d2Var.O = string;
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.s)).title));
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new zp(this, i11));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new zp(this, 4));
                    showDialog(d2Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void n0() {
        boolean z4;
        TLRPC.User user;
        int i10 = this.h0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) this.c.m(i10);
            if (r8Var == null) {
                this.a.m(this.h0);
                return;
            }
            TLRPC.ChatFull chatFull = this.x;
            if (chatFull != null && (user = this.v) != null) {
                if ((this.r ? this.n : chatFull.guard_bot_id) == user.id) {
                    z4 = true;
                    r8Var.setChecked(z4);
                }
            }
            z4 = false;
            r8Var.setChecked(z4);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        return m0(z4);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        jq jqVar = this.a;
        if (jqVar != null) {
            jqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final void p0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.w)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.s, this, new d7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (ChatObject.isChannel(this.w)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.w;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().getInputUser(this.v);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new lh.b1(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 9));
    }

    public final boolean q0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.J;
        boolean z4 = tL_chatAdminRights.change_info;
        boolean z10 = this.D;
        if (z4 && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!z10 || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z4 || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((z10 && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r1.codePointCount(0, r1.length()) > 16) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r0.q0() == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0(boolean z4) {
        String str;
        kq kqVar = this;
        if (kqVar.E) {
            return;
        }
        boolean isChannel = ChatObject.isChannel(kqVar.w);
        int i10 = kqVar.y;
        int i11 = 2;
        if (!isChannel) {
            if (i10 != 1) {
                if (i10 == 0) {
                    if (kqVar.q0()) {
                        if (kqVar.s0 != -1) {
                            String str2 = kqVar.P;
                        }
                    }
                }
                if (i10 == 2) {
                    if (kqVar.P == null) {
                    }
                }
            }
            MessagesController.getInstance(kqVar.currentAccount).convertToMegaGroup(kqVar.getParentActivity(), kqVar.s, kqVar, new zp(kqVar, 7));
            return;
        }
        boolean z10 = kqVar.C;
        TLRPC.User user = kqVar.v;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = kqVar.J;
        if (z4 && z10 && !kqVar.I && tL_chatAdminRights.manage_linked_peers && tL_chatAdminRights.change_info) {
            org.telegram.ui.Components.z4.v0(kqVar, LocaleController.getString(R.string.CommunityMakeAdminTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CommunityMakeAdminMessage, DialogObject.getShortName(user))), LocaleController.getString(R.string.CommunityMakeAdminPromote), false, new cq(kqVar, r6));
            return;
        }
        if (kqVar.s0 != -1 && (str = kqVar.P) != null && str.codePointCount(0, str.length()) > 16) {
            kqVar.b.x0(kqVar.s0);
            Vibrator vibrator = (Vibrator) kqVar.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            f2.m1 K = kqVar.b.K(kqVar.s0);
            if (K != null) {
                AndroidUtilities.shakeView(K.a);
                return;
            }
            return;
        }
        if (i10 == 0 || i10 == 2) {
            boolean z11 = kqVar.B;
            if (z11) {
                tL_chatAdminRights.pin_messages = false;
                tL_chatAdminRights.manage_ranks = false;
            } else {
                tL_chatAdminRights.edit_messages = false;
                tL_chatAdminRights.post_messages = false;
            }
            if (tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || ((kqVar.D && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || (z11 && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)))) {
                tL_chatAdminRights.other = false;
            } else {
                tL_chatAdminRights.other = true;
            }
        }
        if (i10 == 0) {
            int i12 = kqVar.U0 == null ? 1 : 0;
            kqVar.t0(true);
            MessagesController.getInstance(kqVar.currentAccount).setUserAdminRole(kqVar.s, kqVar.v, kqVar.J, kqVar.P, kqVar.B, kqVar, (!kqVar.W0 || z10) ? 0 : 1, false, null, new cq(kqVar, i11), new zp(kqVar, 8));
            kqVar = kqVar;
            r6 = i12;
        } else {
            if (i10 == 1) {
                if (kqVar.s0 >= 0) {
                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                    tL_messages_editChatParticipantRank.peer = MessagesController.getInputPeer(kqVar.w);
                    tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                    String str3 = kqVar.P;
                    tL_messages_editChatParticipantRank.rank = str3 != null ? str3 : "";
                    ConnectionsManager.getInstance(kqVar.currentAccount).sendRequest(tL_messages_editChatParticipantRank, null);
                }
                MessagesController.getInstance(kqVar.currentAccount).setParticipantBannedRole(kqVar.s, kqVar.v, null, kqVar.L, kqVar.B, kqVar.getFragmentForAlert(1));
                TLRPC.TL_chatBannedRights tL_chatBannedRights = kqVar.L;
                if (tL_chatBannedRights.send_messages || tL_chatBannedRights.send_stickers || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_media || tL_chatBannedRights.send_gifs || tL_chatBannedRights.send_games || tL_chatBannedRights.send_inline) {
                    i11 = 1;
                } else {
                    tL_chatBannedRights.until_date = 0;
                }
                hq hqVar = kqVar.U0;
                if (hqVar != null) {
                    hqVar.b(i11, tL_chatAdminRights, tL_chatBannedRights, kqVar.P);
                }
            } else if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kqVar.getParentActivity());
                String string = kqVar.H ? LocaleController.getString(R.string.AddBotAdmin) : LocaleController.getString(R.string.AddBot);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
                d2Var.O = string;
                boolean z12 = ChatObject.isChannel(kqVar.w) && !kqVar.w.megagroup;
                TLRPC.Chat chat = kqVar.w;
                String str4 = chat != null ? chat.title : "";
                d2Var.Q = AndroidUtilities.replaceTags(kqVar.H ? z12 ? LocaleController.formatString(R.string.AddBotMessageAdminChannel, str4) : LocaleController.formatString(R.string.AddBotMessageAdminGroup, str4) : LocaleController.formatString(R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(kqVar.H ? R.string.AddAsAdmin : R.string.AddBot), new zp(kqVar, r6));
                kqVar.showDialog(d2Var);
                r6 = 0;
            }
        }
        if (r6 != 0) {
            kqVar.finishFragment();
        }
    }

    public final void t0(boolean z4) {
        ValueAnimator valueAnimator = this.Y0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.E = z4;
        this.actionBar.getBackButton().setEnabled(!this.E);
        org.telegram.ui.Components.or orVar = this.h;
        if (orVar != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(orVar.c, this.E ? 1.0f : 0.0f);
            this.Y0 = ofFloat;
            ofFloat.addUpdateListener(new bq(this, 0));
            this.Y0.addListener(new s5(this, 23));
            this.Y0.setDuration((long) (Math.abs(this.h.c - (this.E ? 1.0f : 0.0f)) * 150.0f));
            this.Y0.start();
        }
    }

    public final void u0(boolean z4) {
        int i10;
        int min = Math.min(this.p0, this.q0);
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.K0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.P0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.B0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.u0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.S = 3;
        boolean z10 = this.C;
        boolean z11 = this.B;
        boolean z12 = this.D;
        int i11 = this.y;
        if (i11 == 0 || i11 == 2) {
            if (z10) {
                this.U = 3;
                this.k0 = 4;
                this.a0 = 5;
                this.S = 7;
                this.c0 = 6;
            } else if (z11) {
                this.U = 3;
                this.S = 5;
                this.K0 = 4;
                if (this.L0) {
                    this.M0 = 5;
                    this.N0 = 6;
                    this.S = 8;
                    this.O0 = 7;
                }
                int i12 = this.S;
                int i13 = i12 + 1;
                this.S = i13;
                this.P0 = i12;
                if (this.Q0) {
                    this.R0 = i13;
                    this.S0 = i12 + 2;
                    this.S = i12 + 4;
                    this.T0 = i12 + 3;
                }
                int i14 = this.S;
                this.W = i14;
                this.X = i14 + 1;
                this.d0 = i14 + 2;
                this.H0 = i14 + 3;
                this.a0 = i14 + 4;
                this.S = i14 + 6;
                this.c0 = i14 + 5;
            } else {
                if (i11 == 2) {
                    this.S = 4;
                    this.T = 3;
                }
                int i15 = this.S;
                this.U = i15;
                this.Z = i15 + 1;
                this.c0 = i15 + 2;
                this.d0 = i15 + 3;
                int i16 = i15 + 5;
                this.S = i16;
                this.e0 = i15 + 4;
                if (i11 != 2) {
                    this.S = i15 + 6;
                    this.f0 = i16;
                }
                if (ChatObject.isChannel(this.w)) {
                    int i17 = this.S;
                    int i18 = i17 + 1;
                    this.S = i18;
                    this.P0 = i17;
                    if (this.Q0) {
                        this.R0 = i18;
                        this.S0 = i17 + 2;
                        this.S = i17 + 4;
                        this.T0 = i17 + 3;
                    }
                }
                int i19 = this.S;
                this.X = i19;
                this.H0 = i19 + 1;
                this.a0 = i19 + 2;
                int i20 = i19 + 4;
                this.S = i20;
                this.b0 = i19 + 3;
                if (z12) {
                    this.S = i19 + 5;
                    this.j0 = i20;
                }
                if (this.R) {
                    int i21 = this.S;
                    this.h0 = i21;
                    this.S = i21 + 2;
                    this.i0 = i21 + 1;
                }
            }
        } else if (i11 == 1) {
            this.v0 = 3;
            this.S = 5;
            this.w0 = 4;
            if (this.x0) {
                this.y0 = 5;
                this.z0 = 6;
                this.B0 = 7;
                this.A0 = 8;
                this.C0 = 9;
                this.D0 = 10;
                this.E0 = 11;
                this.F0 = 12;
                this.G0 = 13;
                this.S = 15;
                this.g0 = 14;
            }
            int i22 = this.S;
            this.d0 = i22;
            this.e0 = i22 + 1;
            this.f0 = i22 + 2;
            int i23 = i22 + 4;
            this.S = i23;
            this.U = i22 + 3;
            if (z12) {
                this.S = i22 + 5;
                this.j0 = i23;
            }
            int i24 = this.S;
            this.I0 = i24;
            this.S = i24 + 2;
            this.J0 = i24 + 1;
        }
        boolean z13 = this.F;
        TLRPC.User user = this.v;
        if (z13) {
            if (!z11 && (i11 == 0 || ((i11 == 2 && this.H) || i11 == 1))) {
                int i25 = this.S;
                this.l0 = i25;
                this.s0 = i25 + 1;
                this.S = i25 + 3;
                this.t0 = i25 + 2;
            }
            TLRPC.Chat chat = this.w;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.J;
                if (!z11 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z12 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z10) {
                        int i26 = this.l0;
                        if (i26 == -1) {
                            int i27 = this.S;
                            this.S = i27 + 1;
                            this.p0 = i27;
                        }
                        int i28 = this.S;
                        int i29 = i28 + 1;
                        this.S = i29;
                        this.q0 = i28;
                        if (i26 != -1) {
                            this.S = i28 + 2;
                            this.p0 = i29;
                        }
                    }
                }
            }
            if (this.X0) {
                if (this.l0 == -1) {
                    int i30 = this.S;
                    this.S = i30 + 1;
                    this.l0 = i30;
                }
                int i31 = this.S;
                this.m0 = i31;
                this.S = i31 + 2;
                this.n0 = i31 + 1;
            }
        } else if (i11 != 0) {
            int i32 = this.S;
            this.S = i32 + 1;
            this.l0 = i32;
        } else if (z11 || (this.P.isEmpty() && !(this.w.creator && UserObject.isUserSelf(user)))) {
            int i33 = this.S;
            this.S = i33 + 1;
            this.o0 = i33;
        } else {
            int i34 = this.S;
            this.l0 = i34;
            this.S = i34 + 2;
            this.s0 = i34 + 1;
            if (this.w.creator && UserObject.isUserSelf(user)) {
                int i35 = this.S;
                this.S = i35 + 1;
                this.t0 = i35;
            } else {
                int i36 = this.S;
                this.S = i36 + 1;
                this.o0 = i36;
            }
        }
        if (i11 == 2) {
            int i37 = this.S;
            this.S = i37 + 1;
            this.u0 = i37;
        }
        if (z4) {
            if (min == -1 && (i10 = this.p0) != -1) {
                this.a.s(Math.min(i10, this.q0), 2);
            } else {
                if (min == -1 || this.p0 != -1) {
                    return;
                }
                this.a.t(min, 2);
            }
        }
    }
}
