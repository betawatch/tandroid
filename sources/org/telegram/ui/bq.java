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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class bq extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean A;
    public int A0;
    public final boolean B;
    public int B0;
    public final boolean C;
    public int C0;
    public boolean D;
    public int D0;
    public final boolean E;
    public int E0;
    public float F;
    public int F0;
    public boolean G;
    public int G0;
    public final boolean H;
    public int H0;
    public final TLRPC.TL_chatAdminRights I;
    public int I0;
    public final TLRPC.TL_chatAdminRights J;
    public int J0;
    public TLRPC.TL_chatBannedRights K;
    public boolean K0;
    public final TLRPC.TL_chatBannedRights L;
    public int L0;
    public boolean M;
    public int M0;
    public final String N;
    public int N0;
    public String O;
    public int O0;
    public final String P;
    public boolean P0;
    public final boolean Q;
    public int Q0;
    public int R;
    public int R0;
    public int S;
    public int S0;
    public int T;
    public yp T0;
    public int U;
    public final String U0;
    public int V;
    public final boolean V0;
    public int W;
    public final boolean W0;
    public int X;
    public ValueAnimator X0;
    public int Y;
    public ValueAnimator Y0;
    public int Z;
    public aq a;
    public int a0;
    public gh.f1 b;
    public int b0;
    public of.y c;
    public int c0;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public org.telegram.ui.Components.j6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.Components.fr h;
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
    public boolean w0;
    public TLRPC.ChatFull x;
    public int x0;
    public final int y;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i9, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        TLRPC.UserFull userFull;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        this.D = false;
        this.F = 0.0f;
        this.G = false;
        this.H = false;
        this.N = "";
        this.V0 = z11;
        this.s = j11;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
        this.v = user;
        this.y = i9;
        this.E = z10;
        boolean z13 = true;
        boolean z14 = !z10;
        this.P0 = z14;
        this.K0 = z14;
        this.U0 = str2;
        this.w = getMessagesController().getChat(Long.valueOf(this.s));
        this.x = getMessagesController().getChatFull(this.s);
        this.Q = user != null && user.bot_guard;
        String str3 = str != null ? str : "";
        this.O = str3;
        this.P = str3;
        this.B = ChatObject.isCommunity(this.w);
        TLRPC.Chat chat2 = this.w;
        if (chat2 != null) {
            this.A = ChatObject.isChannel(chat2) && !this.w.megagroup;
            this.C = ChatObject.isForum(this.w);
            this.J = this.w.admin_rights;
        }
        if (this.J == null) {
            this.J = n0(i9 != 2 || ((chat = this.w) != null && chat.creator));
        }
        if (i9 == 0 || i9 == 2) {
            if (i9 == 2 && (userFull = getMessagesController().getUserFull(j10)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.A ? userFull.bot_broadcast_admin_rights : userFull.bot_group_admin_rights;
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
                this.H = false;
                if (i9 == 2) {
                    this.I = n0(false);
                    boolean z15 = this.A;
                    this.G = z15;
                    this.F = z15 ? 1.0f : 0.0f;
                    this.W0 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.I = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.J;
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
                    this.W0 = false;
                }
            } else {
                this.H = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.I = tL_chatAdminRights6;
                boolean z16 = tL_chatAdminRights2.change_info;
                tL_chatAdminRights6.change_info = z16;
                boolean z17 = tL_chatAdminRights2.post_messages;
                tL_chatAdminRights6.post_messages = z17;
                boolean z18 = tL_chatAdminRights2.edit_messages;
                tL_chatAdminRights6.edit_messages = z18;
                boolean z19 = tL_chatAdminRights2.delete_messages;
                tL_chatAdminRights6.delete_messages = z19;
                boolean z20 = tL_chatAdminRights2.manage_call;
                tL_chatAdminRights6.manage_call = z20;
                boolean z21 = tL_chatAdminRights2.ban_users;
                tL_chatAdminRights6.ban_users = z21;
                boolean z22 = tL_chatAdminRights2.invite_users;
                tL_chatAdminRights6.invite_users = z22;
                boolean z23 = tL_chatAdminRights2.pin_messages;
                tL_chatAdminRights6.pin_messages = z23;
                boolean z24 = tL_chatAdminRights2.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z24;
                boolean z25 = tL_chatAdminRights2.manage_topics;
                tL_chatAdminRights6.manage_topics = z25;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights2.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights2.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights2.delete_stories;
                boolean z26 = tL_chatAdminRights2.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z26;
                boolean z27 = tL_chatAdminRights2.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z27;
                boolean z28 = tL_chatAdminRights2.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z28;
                boolean z29 = tL_chatAdminRights2.add_admins;
                tL_chatAdminRights6.add_admins = z29;
                boolean z30 = tL_chatAdminRights2.anonymous;
                tL_chatAdminRights6.anonymous = z30;
                boolean z31 = tL_chatAdminRights2.other;
                tL_chatAdminRights6.other = z31;
                boolean z32 = z16 || z17 || z26 || z27 || z18 || z19 || z21 || z22 || z28 || z23 || z24 || z29 || z20 || z30 || z25 || z31;
                this.W0 = z32;
                if (i9 == 2) {
                    boolean z33 = this.A || z32;
                    this.G = z33;
                    this.F = z33 ? 1.0f : 0.0f;
                    this.W0 = false;
                }
            }
            TLRPC.Chat chat3 = this.w;
            if (chat3 != null) {
                this.L = chat3.default_banned_rights;
            }
            if (this.L == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                this.L = tL_chatBannedRights3;
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
            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.L;
            if (tL_chatBannedRights4.change_info || this.A) {
                z12 = true;
            } else {
                z12 = true;
                this.I.change_info = true;
            }
            if (!tL_chatBannedRights4.pin_messages) {
                this.I.pin_messages = z12;
            }
        } else if (i9 == 1) {
            this.L = tL_chatBannedRights;
            if (tL_chatBannedRights == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights5 = new TLRPC.TL_chatBannedRights();
                this.L = tL_chatBannedRights5;
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
            this.K = tL_chatBannedRights6;
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
                TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.K;
                tL_chatBannedRights7.send_plain = tL_chatBannedRights2.send_plain;
                tL_chatBannedRights7.edit_rank = tL_chatBannedRights2.edit_rank;
                tL_chatBannedRights7.send_reactions = tL_chatBannedRights2.send_reactions;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.L;
            if (tL_chatBannedRights8.view_messages) {
                this.K.view_messages = true;
            }
            if (tL_chatBannedRights8.send_messages) {
                this.K.send_messages = true;
            }
            if (tL_chatBannedRights8.send_media) {
                this.K.send_media = true;
            }
            if (tL_chatBannedRights8.send_stickers) {
                this.K.send_stickers = true;
            }
            if (tL_chatBannedRights8.send_gifs) {
                this.K.send_gifs = true;
            }
            if (tL_chatBannedRights8.send_games) {
                this.K.send_games = true;
            }
            if (tL_chatBannedRights8.send_inline) {
                this.K.send_inline = true;
            }
            if (tL_chatBannedRights8.embed_links) {
                this.K.embed_links = true;
            }
            if (tL_chatBannedRights8.send_polls) {
                this.K.send_polls = true;
            }
            if (tL_chatBannedRights8.invite_users) {
                this.K.invite_users = true;
            }
            if (tL_chatBannedRights8.change_info) {
                this.K.change_info = true;
            }
            if (tL_chatBannedRights8.pin_messages) {
                this.K.pin_messages = true;
            }
            if (tL_chatBannedRights8.edit_rank) {
                this.K.edit_rank = true;
            }
            if (tL_chatBannedRights8.send_reactions) {
                this.K.send_reactions = true;
            }
            if (tL_chatBannedRights8.manage_topics) {
                this.K.manage_topics = true;
            }
            if (tL_chatBannedRights8.send_photos) {
                this.K.send_photos = true;
            }
            if (tL_chatBannedRights8.send_videos) {
                this.K.send_videos = true;
            }
            if (tL_chatBannedRights8.send_audios) {
                this.K.send_audios = true;
            }
            if (tL_chatBannedRights8.send_docs) {
                this.K.send_docs = true;
            }
            if (tL_chatBannedRights8.send_voices) {
                this.K.send_voices = true;
            }
            if (tL_chatBannedRights8.send_roundvideos) {
                this.K.send_roundvideos = true;
            }
            if (tL_chatBannedRights8.send_plain) {
                this.K.send_plain = true;
            }
            this.N = ChatObject.getBannedRightsString(this.K);
            if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                z13 = false;
            }
            this.W0 = z13;
        }
        t0(false);
    }

    public static void T(bq bqVar, long j10) {
        if (j10 != 0) {
            bqVar.s = j10;
            bqVar.w = MessagesController.getInstance(bqVar.currentAccount).getChat(Long.valueOf(j10));
            bqVar.q0(true);
        }
    }

    public static void U(final bq bqVar, org.telegram.ui.ActionBar.a3 a3Var, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 0) {
            bqVar.K.until_date = 0;
            bqVar.a.m(bqVar.I0);
        } else if (intValue == 1) {
            bqVar.K.until_date = ConnectionsManager.getInstance(bqVar.currentAccount).getCurrentTime() + 86400;
            bqVar.a.m(bqVar.I0);
        } else if (intValue == 2) {
            bqVar.K.until_date = ConnectionsManager.getInstance(bqVar.currentAccount).getCurrentTime() + 604800;
            bqVar.a.m(bqVar.I0);
        } else if (intValue == 3) {
            bqVar.K.until_date = ConnectionsManager.getInstance(bqVar.currentAccount).getCurrentTime() + 2592000;
            bqVar.a.m(bqVar.I0);
        } else if (intValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(bqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() { // from class: org.telegram.ui.tp
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i9, int i10, int i11) {
                        final bq bqVar2 = bq.this;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.clear();
                        calendar2.set(i9, i10, i11);
                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                        try {
                            TimePickerDialog timePickerDialog = new TimePickerDialog(bqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.wp
                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                public final void onTimeSet(TimePicker timePicker, int i12, int i13) {
                                    bq bqVar3 = bq.this;
                                    bqVar3.K.until_date = (i13 * 60) + (i12 * 3600) + time;
                                    bqVar3.a.m(bqVar3.I0);
                                }
                            }, 0, 0, true);
                            timePickerDialog.setButton(-1, LocaleController.getString(R.string.Set), timePickerDialog);
                            timePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new up());
                            bqVar2.showDialog(timePickerDialog);
                        } catch (Exception e10) {
                            FileLog.e(e10);
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
                datePickerDialog.setButton(-2, LocaleController.getString(R.string.Cancel), new up());
                datePickerDialog.setOnShowListener(new vp(0, datePicker));
                bqVar.showDialog(datePickerDialog);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        a3Var.a.dismissRunnable.run();
    }

    public static /* synthetic */ boolean V(bq bqVar, TLRPC.TL_error tL_error) {
        bqVar.s0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!ChatObject.isChannel(bqVar.w)) {
            zf.j0 j0Var = new zf.j0(11, bqVar.currentAccount, bqVar.getParentActivity(), bqVar, bqVar.getResourceProvider());
            ArrayList arrayList = new ArrayList();
            arrayList.add(bqVar.v);
            j0Var.I1(bqVar.w, arrayList, null, null, null);
            j0Var.show();
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
    public static void W(bq bqVar, Context context, View view, int i9) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        View m10;
        boolean z14 = bqVar.A;
        TLRPC.User user = bqVar.v;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = bqVar.L;
        int i10 = bqVar.y;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = bqVar.I;
        if (bqVar.E || (bqVar.w.creator && i10 == 0 && i9 == bqVar.a0)) {
            boolean z15 = false;
            if (i9 == bqVar.v0) {
                if (!(view instanceof org.telegram.ui.Cells.s8) || ((org.telegram.ui.Cells.s8) view).isEnabled()) {
                    bqVar.w0 = !bqVar.w0;
                    bqVar.t0(false);
                    bqVar.a.m(bqVar.v0);
                    if (bqVar.w0) {
                        bqVar.a.s(bqVar.v0 + 1, 10);
                        return;
                    } else {
                        bqVar.a.t(bqVar.v0 + 1, 10);
                        return;
                    }
                }
                return;
            }
            int i11 = bqVar.J0;
            if (i9 == i11) {
                if (!(view instanceof org.telegram.ui.Cells.s8) || ((org.telegram.ui.Cells.s8) view).isEnabled()) {
                    bqVar.K0 = !bqVar.K0;
                    bqVar.t0(false);
                    bqVar.a.m(bqVar.J0);
                    if (bqVar.K0) {
                        bqVar.a.s(bqVar.J0 + 1, 3);
                        return;
                    } else {
                        bqVar.a.t(bqVar.J0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i12 = bqVar.O0;
            if (i9 == i12) {
                if (!(view instanceof org.telegram.ui.Cells.s8) || ((org.telegram.ui.Cells.s8) view).isEnabled()) {
                    bqVar.P0 = !bqVar.P0;
                    bqVar.t0(false);
                    bqVar.a.m(bqVar.O0);
                    if (bqVar.P0) {
                        bqVar.a.s(bqVar.O0 + 1, 3);
                        return;
                    } else {
                        bqVar.a.t(bqVar.O0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            if (i9 == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                bqVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            if (i9 == bqVar.l0) {
                if (i10 == 0) {
                    MessagesController.getInstance(bqVar.currentAccount).setUserAdminRole(bqVar.s, bqVar.v, new TLRPC.TL_chatAdminRights(), bqVar.O, bqVar.A, bqVar.getFragmentForAlert(0), bqVar.V0, false, null, null);
                    yp ypVar = bqVar.T0;
                    if (ypVar != null) {
                        ypVar.b(0, tL_chatAdminRights, bqVar.K, bqVar.O);
                    }
                    bqVar.finishFragment();
                    return;
                }
                if (i10 == 1) {
                    bqVar.M = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    bqVar.K = tL_chatBannedRights3;
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
                    bqVar.q0(true);
                    return;
                }
                return;
            }
            if (i9 == bqVar.p0) {
                bqVar.o0(null, null);
                return;
            }
            if (i9 == bqVar.I0) {
                if (bqVar.getParentActivity() == null) {
                    return;
                }
                org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, null);
                org.telegram.ui.ActionBar.f3 f3Var = a3Var.a;
                f3Var.applyTopPadding = false;
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, org.telegram.ui.ActionBar.f6.n5, 23, 15, false, null);
                m4Var.setHeight(47);
                m4Var.setText(LocaleController.getString(R.string.UserRestrictionsDuration));
                linearLayout.addView(m4Var);
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                int i13 = -2;
                linearLayout.addView(linearLayout2, g7.e6.n(-1, -2));
                org.telegram.ui.ActionBar.y2[] y2VarArr = new org.telegram.ui.ActionBar.y2[5];
                int i14 = 0;
                for (int i15 = 5; i14 < i15; i15 = 5) {
                    org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(context, 0, null);
                    y2VarArr[i14] = y2Var;
                    y2Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                    y2VarArr[i14].setTag(Integer.valueOf(i14));
                    y2VarArr[i14].setBackgroundDrawable(org.telegram.ui.ActionBar.f6.K0(false));
                    y2VarArr[i14].a(i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 3 ? LocaleController.getString(R.string.UserRestrictionsCustom) : LocaleController.formatPluralString("Months", 1, new Object[0]) : LocaleController.formatPluralString("Weeks", 1, new Object[0]) : LocaleController.formatPluralString("Days", 1, new Object[0]) : LocaleController.getString(R.string.UserRestrictionsUntilForever), 0, null, false);
                    linearLayout2.addView(y2VarArr[i14], g7.e6.n(-1, i13));
                    y2VarArr[i14].setOnClickListener(new mh.k3(24, bqVar, a3Var));
                    i14++;
                    i13 = -2;
                }
                a3Var.b(linearLayout);
                bqVar.showDialog(f3Var);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.z1) {
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                int i16 = bqVar.L0;
                if (i9 == i16 || i9 == bqVar.M0 || i9 == bqVar.N0) {
                    if (i9 == i16) {
                        z12 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z12;
                    } else if (i9 == bqVar.M0) {
                        z12 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z12;
                    } else {
                        z12 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z12;
                    }
                    bqVar.a.m(i11);
                    z1Var.c(z12, true);
                    return;
                }
                int i17 = bqVar.Q0;
                if (i9 == i17 || i9 == bqVar.R0 || i9 == bqVar.S0) {
                    if (i9 == i17) {
                        z13 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z13;
                    } else if (i9 == bqVar.R0) {
                        z13 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z13;
                    } else {
                        z13 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z13;
                    }
                    bqVar.a.m(i12);
                    z1Var.c(z13, true);
                    return;
                }
                if (i10 != 1 || bqVar.K == null) {
                    return;
                }
                z1Var.b();
                if (z1Var.r.b != null) {
                    if (i10 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bqVar.getParentActivity());
                        String string = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                        c2Var.N = string;
                        c2Var.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                        c2Var.show();
                        return;
                    }
                    return;
                }
                if (i9 == bqVar.x0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = bqVar.K;
                    z15 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z15;
                } else if (i9 == bqVar.y0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = bqVar.K;
                    z15 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z15;
                } else if (i9 == bqVar.z0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = bqVar.K;
                    z15 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z15;
                } else if (i9 == bqVar.f0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = bqVar.K;
                    z15 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z15;
                } else if (i9 == bqVar.A0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = bqVar.K;
                    z15 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z15;
                } else if (i9 == bqVar.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = bqVar.K;
                    z15 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z15;
                } else if (i9 == bqVar.B0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = bqVar.K;
                    z15 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z15;
                } else if (i9 == bqVar.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = bqVar.K;
                    z15 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z15;
                    tL_chatBannedRights11.send_gifs = z15;
                    tL_chatBannedRights11.send_games = z15;
                    tL_chatBannedRights11.send_stickers = z15;
                } else if (i9 == bqVar.F0) {
                    if ((bqVar.K.send_plain || tL_chatBannedRights2.send_plain) && (m10 = bqVar.c.m(bqVar.u0)) != null) {
                        AndroidUtilities.shakeViewSpring(m10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = bqVar.K;
                        z15 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z15;
                    }
                } else if (i9 == bqVar.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = bqVar.K;
                    z15 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z15;
                }
                bqVar.a.m(bqVar.v0);
                z1Var.c(!z15, true);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.s8) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                Switch r12 = s8Var.d;
                if (r12.B != null) {
                    if (i10 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bqVar.getParentActivity());
                        String string2 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
                        c2Var2.N = string2;
                        c2Var2.P = LocaleController.getString(R.string.UserRestrictionsCantModifyDisabled);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.OK), null);
                        c2Var2.show();
                        return;
                    }
                    return;
                }
                if (!s8Var.isEnabled()) {
                    if (i10 == 2 || i10 == 0) {
                        if ((i9 != bqVar.T || tL_chatBannedRights2 == null || tL_chatBannedRights2.change_info) && ((i9 != bqVar.d0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.pin_messages) && (i9 != bqVar.e0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bqVar.getParentActivity());
                        String string3 = LocaleController.getString(R.string.UserRestrictionsCantModify);
                        org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.a;
                        c2Var3.N = string3;
                        c2Var3.P = LocaleController.getString(R.string.UserRestrictionsCantModifyEnabled);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.OK), null);
                        c2Var3.show();
                        return;
                    }
                    return;
                }
                if (i10 != 2 && i9 != bqVar.g0) {
                    s8Var.setChecked(!r12.h);
                }
                boolean z16 = r12.h;
                if (i9 == bqVar.S) {
                    z16 = !bqVar.G;
                    bqVar.G = z16;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = bqVar.J;
                    FrameLayout frameLayout = bqVar.e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = bqVar.b.getChildCount();
                    int i18 = 0;
                    while (i18 < childCount) {
                        View childAt = bqVar.b.getChildAt(i18);
                        bqVar.b.getClass();
                        int R = RecyclerView.R(childAt);
                        if (childAt instanceof org.telegram.ui.Cells.s8) {
                            boolean z17 = bqVar.G;
                            if (z17) {
                                if (R == bqVar.S) {
                                    if (!tL_chatAdminRights2.add_admins) {
                                        TLRPC.Chat chat = bqVar.w;
                                        if (chat != null) {
                                        }
                                        z11 = false;
                                    }
                                    z11 = true;
                                } else if (R == bqVar.T) {
                                    z17 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info) {
                                    }
                                    z11 = false;
                                } else if (R == bqVar.U) {
                                    z17 = tL_chatAdminRights.post_messages;
                                    z11 = tL_chatAdminRights2.post_messages;
                                } else if (R == bqVar.V) {
                                    z17 = tL_chatAdminRights.manage_direct_messages;
                                    z11 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (R == bqVar.W) {
                                    z17 = tL_chatAdminRights.manage_welcome_messages;
                                    z11 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (R == bqVar.X) {
                                    z17 = tL_chatAdminRights.edit_messages;
                                    z11 = tL_chatAdminRights2.edit_messages;
                                } else if (R == bqVar.Y) {
                                    z17 = tL_chatAdminRights.delete_messages;
                                    z11 = tL_chatAdminRights2.delete_messages;
                                } else if (R == bqVar.b0) {
                                    z17 = tL_chatAdminRights.ban_users;
                                    z11 = tL_chatAdminRights2.ban_users;
                                } else if (R == bqVar.c0) {
                                    z17 = tL_chatAdminRights.invite_users;
                                    z11 = tL_chatAdminRights2.invite_users;
                                } else if (R == bqVar.d0) {
                                    z17 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages) {
                                    }
                                    z11 = false;
                                } else if (R == bqVar.e0) {
                                    z17 = tL_chatAdminRights.manage_ranks;
                                    z11 = tL_chatAdminRights2.manage_ranks;
                                } else if (R == bqVar.G0) {
                                    z17 = tL_chatAdminRights.manage_call;
                                    z11 = tL_chatAdminRights2.manage_call;
                                } else if (R == bqVar.Z) {
                                    z17 = tL_chatAdminRights.add_admins;
                                    z11 = tL_chatAdminRights2.add_admins;
                                } else if (R == bqVar.a0) {
                                    z17 = tL_chatAdminRights.anonymous;
                                    if (!tL_chatAdminRights2.anonymous) {
                                        TLRPC.Chat chat2 = bqVar.w;
                                        if (chat2 != null) {
                                        }
                                        z11 = false;
                                    }
                                    z11 = true;
                                } else if (R == bqVar.i0) {
                                    z17 = tL_chatAdminRights.manage_topics;
                                    z11 = tL_chatAdminRights2.manage_topics;
                                } else if (R == bqVar.j0) {
                                    z17 = tL_chatAdminRights.manage_linked_peers;
                                    z11 = tL_chatAdminRights2.manage_linked_peers;
                                } else {
                                    z11 = false;
                                    z17 = false;
                                }
                                org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) childAt;
                                s8Var2.setChecked(z17);
                                s8Var2.b(z11, true);
                                i18++;
                                z15 = false;
                            } else if ((R != bqVar.T || tL_chatBannedRights2.change_info) && ((R != bqVar.d0 || tL_chatBannedRights2.pin_messages) && (R != bqVar.e0 || tL_chatBannedRights2.edit_rank))) {
                                org.telegram.ui.Cells.s8 s8Var3 = (org.telegram.ui.Cells.s8) childAt;
                                s8Var3.setChecked(z15);
                                s8Var3.b(R == bqVar.S, true);
                            } else {
                                org.telegram.ui.Cells.s8 s8Var4 = (org.telegram.ui.Cells.s8) childAt;
                                s8Var4.setChecked(true);
                                s8Var4.b(z15, z15);
                            }
                        }
                        i18++;
                        z15 = false;
                    }
                    bqVar.a.l();
                    org.telegram.ui.Components.j6 j6Var = bqVar.f;
                    if (j6Var != null) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.ui.Cells.j2.k(R.string.AddBotButton, " ", sb2);
                        sb2.append(LocaleController.getString(bqVar.G ? R.string.AddBotButtonAsAdmin : R.string.AddBotButtonAsMember));
                        j6Var.c(sb2.toString(), true, bqVar.G);
                    }
                    ValueAnimator valueAnimator = bqVar.Y0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        bqVar.Y0 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(bqVar.F, bqVar.G ? 1.0f : 0.0f);
                    bqVar.Y0 = ofFloat;
                    ofFloat.addUpdateListener(new rp(bqVar, 1));
                    bqVar.Y0.setDuration((long) (Math.abs(bqVar.F - (bqVar.G ? 1.0f : 0.0f)) * 200.0f));
                    bqVar.Y0.start();
                } else if (i9 == bqVar.T) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.change_info;
                        tL_chatAdminRights.change_info = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights14 = bqVar.K;
                        z16 = !tL_chatBannedRights14.change_info;
                        tL_chatBannedRights14.change_info = z16;
                    }
                } else if (i9 == bqVar.U) {
                    z16 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z16;
                } else if (i9 == bqVar.g0) {
                    org.telegram.ui.Components.y4.v0(bqVar, LocaleController.getString(R.string.ApproveNewMembersTitle), AndroidUtilities.replaceTags(LocaleController.formatString(z16 ? z14 ? R.string.ApproveNewMembersDisabledMessageChannel : R.string.ApproveNewMembersDisabledMessageGroup : z14 ? R.string.ApproveNewMembersMessageChannel : R.string.ApproveNewMembersMessageGroup, DialogObject.getShortName(user))), LocaleController.getString(!z16 ? R.string.ApproveNewMembersEnable : R.string.ApproveNewMembersDisable), false, new qp(bqVar, !z16 ? user.id : 0L, 1));
                } else if (i9 == bqVar.W) {
                    z16 = !tL_chatAdminRights.manage_welcome_messages;
                    tL_chatAdminRights.manage_welcome_messages = z16;
                } else if (i9 == bqVar.V) {
                    z16 = !tL_chatAdminRights.manage_direct_messages;
                    tL_chatAdminRights.manage_direct_messages = z16;
                } else if (i9 == bqVar.X) {
                    z16 = !tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.edit_messages = z16;
                } else if (i9 == bqVar.Y) {
                    z16 = !tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.delete_messages = z16;
                } else if (i9 == bqVar.Z) {
                    z16 = !tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.add_admins = z16;
                } else if (i9 == bqVar.a0) {
                    z16 = !tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.anonymous = z16;
                } else if (i9 == bqVar.b0) {
                    z16 = !tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.ban_users = z16;
                } else if (i9 == bqVar.G0) {
                    z16 = !tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.manage_call = z16;
                } else if (i9 == bqVar.i0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.manage_topics;
                        tL_chatAdminRights.manage_topics = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = bqVar.K;
                        z16 = !tL_chatBannedRights15.manage_topics;
                        tL_chatBannedRights15.manage_topics = z16;
                    }
                } else if (i9 == bqVar.j0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.manage_linked_peers;
                        tL_chatAdminRights.manage_linked_peers = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = bqVar.K;
                        z16 = !tL_chatBannedRights16.manage_linked_peers;
                        tL_chatBannedRights16.manage_linked_peers = z16;
                    }
                } else if (i9 == bqVar.c0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.invite_users;
                        tL_chatAdminRights.invite_users = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = bqVar.K;
                        z16 = !tL_chatBannedRights17.invite_users;
                        tL_chatBannedRights17.invite_users = z16;
                    }
                } else if (i9 == bqVar.d0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.pin_messages;
                        tL_chatAdminRights.pin_messages = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = bqVar.K;
                        z16 = !tL_chatBannedRights18.pin_messages;
                        tL_chatBannedRights18.pin_messages = z16;
                    }
                } else if (i9 == bqVar.e0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.manage_ranks;
                        tL_chatAdminRights.manage_ranks = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights19 = bqVar.K;
                        z16 = !tL_chatBannedRights19.edit_rank;
                        tL_chatBannedRights19.edit_rank = z16;
                    }
                } else if (i10 == 1 && (tL_chatBannedRights = bqVar.K) != null) {
                    if (i9 == bqVar.u0) {
                        z10 = !tL_chatBannedRights.send_plain;
                        tL_chatBannedRights.send_plain = z10;
                    } else {
                        z10 = z16;
                    }
                    if (z16 && ((!tL_chatBannedRights.send_plain || !tL_chatBannedRights.embed_links || !tL_chatBannedRights.send_inline || !tL_chatBannedRights.send_photos || !tL_chatBannedRights.send_videos || !tL_chatBannedRights.send_audios || !tL_chatBannedRights.send_docs || !tL_chatBannedRights.send_voices || !tL_chatBannedRights.send_roundvideos || !tL_chatBannedRights.send_polls || !tL_chatBannedRights.send_reactions) && tL_chatBannedRights.view_messages)) {
                        tL_chatBannedRights.view_messages = false;
                    }
                    int i19 = bqVar.F0;
                    if (i19 >= 0) {
                        bqVar.a.m(i19);
                    }
                    int i20 = bqVar.v0;
                    if (i20 >= 0) {
                        bqVar.a.m(i20);
                    }
                    z16 = z10;
                    if (i10 == 2) {
                        s8Var.setChecked(bqVar.G && z16);
                    }
                    bqVar.t0(true);
                }
                if (i10 == 2) {
                }
                bqVar.t0(true);
            }
        }
    }

    public static void X(bq bqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        boolean z10 = bqVar.A;
        TLRPC.User user = bqVar.v;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                bqVar.T0.a(user);
                bqVar.removeSelfFromStack();
                twoStepVerificationActivity.n0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (bqVar.getParentActivity() == null) {
            return;
        }
        int i9 = 5;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bqVar.getParentActivity());
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                if (z10) {
                    c2Var.N = LocaleController.getString(R.string.EditAdminChannelTransfer);
                } else {
                    c2Var.N = LocaleController.getString(R.string.EditAdminGroupTransfer);
                }
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.EditAdminTransferReadyAlertText, bqVar.w.title, UserObject.getFirstName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.EditAdminTransferChangeOwner), new pp(bqVar, i9));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                bqVar.showDialog(c2Var);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(bqVar.currentAccount).sendRequest(new TL_account.getPassword(), new rc(9, bqVar, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.n0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.Components.y4.h0(tL_error, bqVar, z10, bqVar.B, tL_channels_editCreator);
                return;
            }
            if (bqVar.getParentActivity() == null || AccountInstance.getInstance(bqVar.currentAccount).getUserConfig().isPremium()) {
                bqVar.presentFragment(new kd1(1));
                return;
            } else {
                bqVar.showDialog(new zf.j0(5, bqVar.currentAccount, bqVar.getParentActivity(), bqVar, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.n0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bqVar.getParentActivity());
        String string = LocaleController.getString(R.string.EditAdminTransferAlertTitle);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.a;
        c2Var2.N = string;
        LinearLayout linearLayout = new LinearLayout(bqVar.getParentActivity());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.n(linearLayout);
        TextView textView = new TextView(bqVar.getParentActivity());
        int i10 = org.telegram.ui.ActionBar.f6.j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        if (z10) {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditChannelAdminTransferAlertText", R.string.EditChannelAdminTransferAlertText, UserObject.getFirstName(user))));
        } else {
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferAlertText", R.string.EditAdminTransferAlertText, UserObject.getFirstName(user))));
        }
        linearLayout.addView(textView, g7.e6.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(bqVar.getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(bqVar.getParentActivity());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        TextView textView2 = new TextView(bqVar.getParentActivity());
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, g7.e6.n(-1, -2));
            linearLayout2.addView(imageView, g7.e6.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, g7.e6.n(-2, -2));
            linearLayout2.addView(textView2, g7.e6.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(bqVar.getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(bqVar.getParentActivity());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), mode));
        TextView textView3 = new TextView(bqVar.getParentActivity());
        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.l0.m(R.string.EditAdminTransferAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, g7.e6.n(-1, -2));
            linearLayout3.addView(imageView2, g7.e6.q(-2, -2, 5));
        } else {
            linearLayout3.addView(imageView2, g7.e6.n(-2, -2));
            linearLayout3.addView(textView3, g7.e6.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder2.k(LocaleController.getString(R.string.EditAdminTransferSetPassword), new pp(bqVar, 6));
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(bqVar.getParentActivity());
            textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            textView4.setTextSize(1, 16.0f);
            textView4.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
            textView4.setText(LocaleController.getString(R.string.EditAdminTransferAlertText3));
            linearLayout.addView(textView4, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder2.h(LocaleController.getString(R.string.OK), null);
        }
        bqVar.showDialog(c2Var2);
    }

    public static void Y(bq bqVar, long j10) {
        TLRPC.ChatFull chatFull = bqVar.x;
        long j11 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User user = j11 != 0 ? bqVar.getMessagesController().getUser(Long.valueOf(j11)) : null;
        if (user != null && j10 != 0 && user.id != j10) {
            new org.telegram.ui.Components.g30(bqVar.getParentActivity(), bqVar.resourceProvider, user, bqVar.v, new qp(bqVar, j10, 0)).show();
            return;
        }
        bqVar.n = j10;
        bqVar.r = true;
        bqVar.m0();
    }

    public static /* synthetic */ void Z(bq bqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            bqVar.s = j10;
            bqVar.w = MessagesController.getInstance(bqVar.currentAccount).getChat(Long.valueOf(j10));
            bqVar.o0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void e0(bq bqVar, View view) {
        if (view instanceof org.telegram.ui.Cells.m4) {
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            String str = bqVar.O;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount > 4.8f) {
                m4Var.setText2("");
                return;
            }
            m4Var.setText2(String.format("%d", Integer.valueOf(codePointCount)));
            org.telegram.ui.ActionBar.h5 textView2 = m4Var.getTextView2();
            int i9 = codePointCount < 0 ? org.telegram.ui.ActionBar.f6.p7 : org.telegram.ui.ActionBar.f6.A6;
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            textView2.setTag(Integer.valueOf(i9));
        }
    }

    public static boolean k0(bq bqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = bqVar.L;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public static TLRPC.TL_chatAdminRights n0(boolean z10) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z10;
        tL_chatAdminRights.manage_ranks = z10;
        tL_chatAdminRights.manage_welcome_messages = z10;
        tL_chatAdminRights.manage_direct_messages = z10;
        tL_chatAdminRights.delete_stories = z10;
        tL_chatAdminRights.edit_stories = z10;
        tL_chatAdminRights.post_stories = z10;
        tL_chatAdminRights.manage_topics = z10;
        tL_chatAdminRights.manage_call = z10;
        tL_chatAdminRights.add_admins = z10;
        tL_chatAdminRights.pin_messages = z10;
        tL_chatAdminRights.invite_users = z10;
        tL_chatAdminRights.ban_users = z10;
        tL_chatAdminRights.delete_messages = z10;
        tL_chatAdminRights.edit_messages = z10;
        tL_chatAdminRights.post_messages = z10;
        tL_chatAdminRights.change_info = z10;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights r0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z10 = true;
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
            z10 = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z10;
        return tL_chatAdminRights3;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i9 = this.y;
        if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditAdmin));
        } else if (i9 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.AddBot));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.UserRestrictions));
        }
        this.actionBar.setActionBarMenuOnItemClick(new fh.w4(this, 29));
        boolean z10 = false;
        if (this.E || (!this.A && this.w.creator && UserObject.isUserSelf(this.v))) {
            org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
            Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
            int i10 = org.telegram.ui.ActionBar.f6.v8;
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
            this.h = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
            n10.h(1, 0, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            n10.k(1).setIcon(this.h);
        }
        t7 t7Var = new t7(this, context, 1);
        this.fragmentView = t7Var;
        t7Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.a7, false));
        View view = this.fragmentView;
        FrameLayout frameLayout = (FrameLayout) view;
        view.setFocusableInTouchMode(true);
        gh.f1 f1Var = new gh.f1(this, context, 8);
        this.b = f1Var;
        f1Var.setClipChildren(i9 != 2);
        of.y yVar = new of.y(r1, z10, 4);
        this.c = yVar;
        yVar.E = 100;
        this.b.setLayoutManager(yVar);
        gh.f1 f1Var2 = this.b;
        aq aqVar = new aq(this, context);
        this.a = aqVar;
        f1Var2.setAdapter(aqVar);
        f2.n nVar = new f2.n();
        if (i9 == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        nVar.m = false;
        nVar.C = false;
        nVar.o(org.telegram.ui.Components.gr.h);
        nVar.n(350L);
        this.b.setItemAnimator(nVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, g7.e6.c(-1.0f, -1));
        this.b.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        this.b.setOnScrollListener(new l3(this, 6));
        this.b.setOnItemClickListener(new bg.b1(9, this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.w;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.x = chatFull;
            m0();
            return;
        }
        if (i9 == NotificationCenter.dialogDeleted) {
            if ((-this.s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
                if (b5Var == null || b5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 9);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 16, new Class[]{org.telegram.ui.Cells.ua.class, org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.s8.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.z8.class, org.telegram.ui.Cells.c6.class}, null, null, null, org.telegram.ui.ActionBar.f6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 32768, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.k0, null, null, org.telegram.ui.ActionBar.f6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i10 = org.telegram.ui.ActionBar.f6.p7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueImageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.m6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.z6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.z8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"valueTextView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 262144, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView2"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 4, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, TLObject.FLAG_23, new Class[]{org.telegram.ui.Cells.c6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.H6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.f6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.b, 0, new Class[]{org.telegram.ui.Cells.ua.class}, null, org.telegram.ui.ActionBar.f6.r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.j5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.q5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 8192, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.D5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 16384, new Class[]{org.telegram.ui.Cells.t2.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.E5));
        return arrayList;
    }

    public final boolean l0(boolean z10) {
        int i9 = this.y;
        if (i9 != 2) {
            if (!(i9 == 1 ? this.N.equals(ChatObject.getBannedRightsString(this.K)) : this.P.equals(this.O))) {
                int i10 = 0;
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String string = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.N = string;
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("UserRestrictionsApplyChangesText", R.string.UserRestrictionsApplyChangesText, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.s)).title));
                    alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new pp(this, i10));
                    alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new pp(this, 4));
                    showDialog(c2Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void m0() {
        boolean z10;
        TLRPC.User user;
        int i9 = this.g0;
        if (i9 >= 0) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) this.c.m(i9);
            if (s8Var == null) {
                this.a.m(this.g0);
                return;
            }
            TLRPC.ChatFull chatFull = this.x;
            if (chatFull != null && (user = this.v) != null) {
                if ((this.r ? this.n : chatFull.guard_bot_id) == user.id) {
                    z10 = true;
                    s8Var.setChecked(z10);
                }
            }
            z10 = false;
            s8Var.setChecked(z10);
        }
    }

    public final void o0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !ChatObject.isChannel(this.w)) {
            MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.s, this, new a7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10));
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
        getConnectionsManager().sendRequest(tL_channels_editCreator, new fh.h1(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        return l0(z10);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        aq aqVar = this.a;
        if (aqVar != null) {
            aqVar.l();
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    public final boolean p0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.I;
        boolean z10 = tL_chatAdminRights.change_info;
        boolean z11 = this.C;
        if (z10 && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!z11 || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z10 || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((z11 && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r1.codePointCount(0, r1.length()) > 16) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r0.p0() == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(boolean z10) {
        String str;
        bq bqVar = this;
        if (bqVar.D) {
            return;
        }
        boolean isChannel = ChatObject.isChannel(bqVar.w);
        int i9 = bqVar.y;
        int i10 = 2;
        if (!isChannel) {
            if (i9 != 1) {
                if (i9 == 0) {
                    if (bqVar.p0()) {
                        if (bqVar.r0 != -1) {
                            String str2 = bqVar.O;
                        }
                    }
                }
                if (i9 == 2) {
                    if (bqVar.O == null) {
                    }
                }
            }
            MessagesController.getInstance(bqVar.currentAccount).convertToMegaGroup(bqVar.getParentActivity(), bqVar.s, bqVar, new pp(bqVar, 7));
            return;
        }
        boolean z11 = bqVar.B;
        TLRPC.User user = bqVar.v;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = bqVar.I;
        if (z10 && z11 && !bqVar.H && tL_chatAdminRights.manage_linked_peers && tL_chatAdminRights.change_info) {
            org.telegram.ui.Components.y4.v0(bqVar, LocaleController.getString(R.string.CommunityMakeAdminTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CommunityMakeAdminMessage, DialogObject.getShortName(user))), LocaleController.getString(R.string.CommunityMakeAdminPromote), false, new sp(bqVar, r6));
            return;
        }
        if (bqVar.r0 != -1 && (str = bqVar.O) != null && str.codePointCount(0, str.length()) > 16) {
            bqVar.b.x0(bqVar.r0);
            Vibrator vibrator = (Vibrator) bqVar.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            f2.q1 K = bqVar.b.K(bqVar.r0);
            if (K != null) {
                AndroidUtilities.shakeView(K.a);
                return;
            }
            return;
        }
        if (i9 == 0 || i9 == 2) {
            boolean z12 = bqVar.A;
            if (z12) {
                tL_chatAdminRights.pin_messages = false;
                tL_chatAdminRights.manage_ranks = false;
            } else {
                tL_chatAdminRights.edit_messages = false;
                tL_chatAdminRights.post_messages = false;
            }
            if (tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || ((bqVar.C && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || (z12 && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)))) {
                tL_chatAdminRights.other = false;
            } else {
                tL_chatAdminRights.other = true;
            }
        }
        if (i9 == 0) {
            int i11 = bqVar.T0 == null ? 1 : 0;
            bqVar.s0(true);
            MessagesController.getInstance(bqVar.currentAccount).setUserAdminRole(bqVar.s, bqVar.v, bqVar.I, bqVar.O, bqVar.A, bqVar, (!bqVar.V0 || z11) ? 0 : 1, false, null, new sp(bqVar, i10), new pp(bqVar, 8));
            bqVar = bqVar;
            r6 = i11;
        } else {
            if (i9 == 1) {
                if (bqVar.r0 >= 0) {
                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                    tL_messages_editChatParticipantRank.peer = MessagesController.getInputPeer(bqVar.w);
                    tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user);
                    String str3 = bqVar.O;
                    tL_messages_editChatParticipantRank.rank = str3 != null ? str3 : "";
                    ConnectionsManager.getInstance(bqVar.currentAccount).sendRequest(tL_messages_editChatParticipantRank, null);
                }
                MessagesController.getInstance(bqVar.currentAccount).setParticipantBannedRole(bqVar.s, bqVar.v, null, bqVar.K, bqVar.A, bqVar.getFragmentForAlert(1));
                TLRPC.TL_chatBannedRights tL_chatBannedRights = bqVar.K;
                if (tL_chatBannedRights.send_messages || tL_chatBannedRights.send_stickers || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_media || tL_chatBannedRights.send_gifs || tL_chatBannedRights.send_games || tL_chatBannedRights.send_inline) {
                    i10 = 1;
                } else {
                    tL_chatBannedRights.until_date = 0;
                }
                yp ypVar = bqVar.T0;
                if (ypVar != null) {
                    ypVar.b(i10, tL_chatAdminRights, tL_chatBannedRights, bqVar.O);
                }
            } else if (i9 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bqVar.getParentActivity());
                String string = bqVar.G ? LocaleController.getString(R.string.AddBotAdmin) : LocaleController.getString(R.string.AddBot);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                boolean z13 = ChatObject.isChannel(bqVar.w) && !bqVar.w.megagroup;
                TLRPC.Chat chat = bqVar.w;
                String str4 = chat != null ? chat.title : "";
                c2Var.P = AndroidUtilities.replaceTags(bqVar.G ? z13 ? LocaleController.formatString(R.string.AddBotMessageAdminChannel, str4) : LocaleController.formatString(R.string.AddBotMessageAdminGroup, str4) : LocaleController.formatString(R.string.AddMembersAlertNamesText, UserObject.getUserName(user), str4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(bqVar.G ? R.string.AddAsAdmin : R.string.AddBot), new pp(bqVar, r6));
                bqVar.showDialog(c2Var);
                r6 = 0;
            }
        }
        if (r6 != 0) {
            bqVar.finishFragment();
        }
    }

    public final void s0(boolean z10) {
        ValueAnimator valueAnimator = this.X0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.D = z10;
        this.actionBar.getBackButton().setEnabled(!this.D);
        org.telegram.ui.Components.fr frVar = this.h;
        if (frVar != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(frVar.c, this.D ? 1.0f : 0.0f);
            this.X0 = ofFloat;
            ofFloat.addUpdateListener(new rp(this, 0));
            this.X0.addListener(new xp(this, 0));
            this.X0.setDuration((long) (Math.abs(this.h.c - (this.D ? 1.0f : 0.0f)) * 150.0f));
            this.X0.start();
        }
    }

    public final void t0(boolean z10) {
        int i9;
        int min = Math.min(this.o0, this.p0);
        this.S = -1;
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
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.J0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.O0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.x0 = -1;
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
        this.t0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.R = 3;
        boolean z11 = this.B;
        boolean z12 = this.A;
        boolean z13 = this.C;
        int i10 = this.y;
        if (i10 == 0 || i10 == 2) {
            if (z11) {
                this.T = 3;
                this.j0 = 4;
                this.Z = 5;
                this.R = 7;
                this.b0 = 6;
            } else if (z12) {
                this.T = 3;
                this.R = 5;
                this.J0 = 4;
                if (this.K0) {
                    this.L0 = 5;
                    this.M0 = 6;
                    this.R = 8;
                    this.N0 = 7;
                }
                int i11 = this.R;
                int i12 = i11 + 1;
                this.R = i12;
                this.O0 = i11;
                if (this.P0) {
                    this.Q0 = i12;
                    this.R0 = i11 + 2;
                    this.R = i11 + 4;
                    this.S0 = i11 + 3;
                }
                int i13 = this.R;
                this.V = i13;
                this.W = i13 + 1;
                this.c0 = i13 + 2;
                this.G0 = i13 + 3;
                this.Z = i13 + 4;
                this.R = i13 + 6;
                this.b0 = i13 + 5;
            } else {
                if (i10 == 2) {
                    this.R = 4;
                    this.S = 3;
                }
                int i14 = this.R;
                this.T = i14;
                this.Y = i14 + 1;
                this.b0 = i14 + 2;
                this.c0 = i14 + 3;
                int i15 = i14 + 5;
                this.R = i15;
                this.d0 = i14 + 4;
                if (i10 != 2) {
                    this.R = i14 + 6;
                    this.e0 = i15;
                }
                if (ChatObject.isChannel(this.w)) {
                    int i16 = this.R;
                    int i17 = i16 + 1;
                    this.R = i17;
                    this.O0 = i16;
                    if (this.P0) {
                        this.Q0 = i17;
                        this.R0 = i16 + 2;
                        this.R = i16 + 4;
                        this.S0 = i16 + 3;
                    }
                }
                int i18 = this.R;
                this.W = i18;
                this.G0 = i18 + 1;
                this.Z = i18 + 2;
                int i19 = i18 + 4;
                this.R = i19;
                this.a0 = i18 + 3;
                if (z13) {
                    this.R = i18 + 5;
                    this.i0 = i19;
                }
                if (this.Q) {
                    int i20 = this.R;
                    this.g0 = i20;
                    this.R = i20 + 2;
                    this.h0 = i20 + 1;
                }
            }
        } else if (i10 == 1) {
            this.u0 = 3;
            this.R = 5;
            this.v0 = 4;
            if (this.w0) {
                this.x0 = 5;
                this.y0 = 6;
                this.A0 = 7;
                this.z0 = 8;
                this.B0 = 9;
                this.C0 = 10;
                this.D0 = 11;
                this.E0 = 12;
                this.F0 = 13;
                this.R = 15;
                this.f0 = 14;
            }
            int i21 = this.R;
            this.c0 = i21;
            this.d0 = i21 + 1;
            this.e0 = i21 + 2;
            int i22 = i21 + 4;
            this.R = i22;
            this.T = i21 + 3;
            if (z13) {
                this.R = i21 + 5;
                this.i0 = i22;
            }
            int i23 = this.R;
            this.H0 = i23;
            this.R = i23 + 2;
            this.I0 = i23 + 1;
        }
        boolean z14 = this.E;
        TLRPC.User user = this.v;
        if (z14) {
            if (!z12 && (i10 == 0 || ((i10 == 2 && this.G) || i10 == 1))) {
                int i24 = this.R;
                this.k0 = i24;
                this.r0 = i24 + 1;
                this.R = i24 + 3;
                this.s0 = i24 + 2;
            }
            TLRPC.Chat chat = this.w;
            if (chat != null && chat.creator && i10 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.I;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i25 = this.k0;
                        if (i25 == -1) {
                            int i26 = this.R;
                            this.R = i26 + 1;
                            this.o0 = i26;
                        }
                        int i27 = this.R;
                        int i28 = i27 + 1;
                        this.R = i28;
                        this.p0 = i27;
                        if (i25 != -1) {
                            this.R = i27 + 2;
                            this.o0 = i28;
                        }
                    }
                }
            }
            if (this.W0) {
                if (this.k0 == -1) {
                    int i29 = this.R;
                    this.R = i29 + 1;
                    this.k0 = i29;
                }
                int i30 = this.R;
                this.l0 = i30;
                this.R = i30 + 2;
                this.m0 = i30 + 1;
            }
        } else if (i10 != 0) {
            int i31 = this.R;
            this.R = i31 + 1;
            this.k0 = i31;
        } else if (z12 || (this.O.isEmpty() && !(this.w.creator && UserObject.isUserSelf(user)))) {
            int i32 = this.R;
            this.R = i32 + 1;
            this.n0 = i32;
        } else {
            int i33 = this.R;
            this.k0 = i33;
            this.R = i33 + 2;
            this.r0 = i33 + 1;
            if (this.w.creator && UserObject.isUserSelf(user)) {
                int i34 = this.R;
                this.R = i34 + 1;
                this.s0 = i34;
            } else {
                int i35 = this.R;
                this.R = i35 + 1;
                this.n0 = i35;
            }
        }
        if (i10 == 2) {
            int i36 = this.R;
            this.R = i36 + 1;
            this.t0 = i36;
        }
        if (z10) {
            if (min == -1 && (i9 = this.o0) != -1) {
                this.a.s(Math.min(i9, this.p0), 2);
            } else {
                if (min == -1 || this.o0 != -1) {
                    return;
                }
                this.a.t(min, 2);
            }
        }
    }
}
