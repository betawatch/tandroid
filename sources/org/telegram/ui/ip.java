package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
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
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.Switch;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class ip extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public int A0;
    public boolean B0;
    public int C0;
    public int D0;
    public final int E;
    public int E0;
    public final boolean F;
    public int F0;
    public final boolean G;
    public int G0;
    public final boolean H;
    public int H0;
    public boolean I;
    public int I0;
    public final boolean J;
    public int J0;
    public float K;
    public int K0;
    public boolean L;
    public int L0;
    public final boolean M;
    public int M0;
    public final TLRPC.TL_chatAdminRights N;
    public int N0;
    public final TLRPC.TL_chatAdminRights O;
    public int O0;
    public TLRPC.TL_chatBannedRights P;
    public boolean P0;
    public final TLRPC.TL_chatBannedRights Q;
    public int Q0;
    public boolean R;
    public int R0;
    public final String S;
    public int S0;
    public String T;
    public int T0;
    public final String U;
    public boolean U0;
    public final boolean V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public int X0;
    public int Y;
    public fp Y0;
    public int Z;
    public final String Z0;
    public hp a;
    public int a0;
    public final boolean a1;
    public ci.j1 b;
    public int b0;
    public final boolean b1;
    public kg.y c;
    public int c0;
    public ValueAnimator c1;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public org.telegram.ui.Components.h6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.ActionBar.b5 h;
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
    public int v0;
    public final TLRPC.User w;
    public int w0;
    public TLRPC.Chat x;
    public int x0;
    public TLRPC.ChatFull y;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i3, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        TLRPC.UserFull b22;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        this.I = false;
        this.K = 0.0f;
        this.L = false;
        this.M = false;
        this.S = "";
        this.a1 = z11;
        this.s = j11;
        TLRPC.User a22 = org.telegram.messenger.hp.s1(this.currentAccount).a2(Long.valueOf(j10));
        this.w = a22;
        this.E = i3;
        this.J = z10;
        boolean z14 = true;
        boolean z15 = !z10;
        this.U0 = z15;
        this.P0 = z15;
        this.Z0 = str2;
        this.x = getMessagesController().M0(Long.valueOf(this.s));
        this.y = getMessagesController().N0(this.s);
        this.V = a22 != null && a22.bot_guard;
        String str3 = str != null ? str : "";
        this.T = str3;
        this.U = str3;
        this.G = org.telegram.messenger.t3.Y(this.x);
        TLRPC.Chat chat2 = this.x;
        if (chat2 != null) {
            this.F = org.telegram.messenger.t3.T(chat2) && !this.x.megagroup;
            this.H = org.telegram.messenger.t3.c0(this.x);
            this.O = this.x.admin_rights;
        }
        if (this.O == null) {
            this.O = t0(i3 != 2 || ((chat = this.x) != null && chat.creator));
        }
        if (i3 == 0 || i3 == 2) {
            if (i3 == 2 && (b22 = getMessagesController().b2(j10)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.F ? b22.bot_broadcast_admin_rights : b22.bot_group_admin_rights;
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
                this.M = false;
                if (i3 == 2) {
                    this.N = t0(false);
                    boolean z16 = this.F;
                    this.L = z16;
                    this.K = z16 ? 1.0f : 0.0f;
                    this.b1 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.N = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.O;
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
                    this.b1 = false;
                }
            } else {
                this.M = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.N = tL_chatAdminRights6;
                boolean z17 = tL_chatAdminRights2.change_info;
                tL_chatAdminRights6.change_info = z17;
                boolean z18 = tL_chatAdminRights2.post_messages;
                tL_chatAdminRights6.post_messages = z18;
                boolean z19 = tL_chatAdminRights2.edit_messages;
                tL_chatAdminRights6.edit_messages = z19;
                boolean z20 = tL_chatAdminRights2.delete_messages;
                tL_chatAdminRights6.delete_messages = z20;
                boolean z21 = tL_chatAdminRights2.manage_call;
                tL_chatAdminRights6.manage_call = z21;
                boolean z22 = tL_chatAdminRights2.ban_users;
                tL_chatAdminRights6.ban_users = z22;
                boolean z23 = tL_chatAdminRights2.invite_users;
                tL_chatAdminRights6.invite_users = z23;
                boolean z24 = tL_chatAdminRights2.pin_messages;
                tL_chatAdminRights6.pin_messages = z24;
                boolean z25 = tL_chatAdminRights2.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z25;
                boolean z26 = tL_chatAdminRights2.manage_topics;
                tL_chatAdminRights6.manage_topics = z26;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights2.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights2.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights2.delete_stories;
                boolean z27 = tL_chatAdminRights2.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z27;
                boolean z28 = tL_chatAdminRights2.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z28;
                boolean z29 = tL_chatAdminRights2.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z29;
                boolean z30 = tL_chatAdminRights2.add_admins;
                tL_chatAdminRights6.add_admins = z30;
                boolean z31 = tL_chatAdminRights2.anonymous;
                tL_chatAdminRights6.anonymous = z31;
                boolean z32 = tL_chatAdminRights2.other;
                tL_chatAdminRights6.other = z32;
                boolean z33 = z17 || z18 || z27 || z28 || z19 || z20 || z22 || z23 || z29 || z24 || z25 || z30 || z21 || z31 || z26 || z32;
                this.b1 = z33;
                if (i3 == 2) {
                    boolean z34 = this.F || z33;
                    this.L = z34;
                    this.K = z34 ? 1.0f : 0.0f;
                    this.b1 = false;
                }
            }
            TLRPC.Chat chat3 = this.x;
            if (chat3 != null) {
                this.Q = chat3.default_banned_rights;
            }
            if (this.Q == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                this.Q = tL_chatBannedRights3;
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
            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.Q;
            if (tL_chatBannedRights4.change_info || this.F) {
                z12 = true;
            } else {
                z12 = true;
                this.N.change_info = true;
            }
            if (!tL_chatBannedRights4.pin_messages) {
                this.N.pin_messages = z12;
            }
            z13 = false;
        } else {
            if (i3 == 1) {
                this.Q = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = new TLRPC.TL_chatBannedRights();
                    this.Q = tL_chatBannedRights5;
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
                this.P = tL_chatBannedRights6;
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
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.P;
                    tL_chatBannedRights7.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights7.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights7.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.Q;
                if (tL_chatBannedRights8.view_messages) {
                    this.P.view_messages = true;
                }
                if (tL_chatBannedRights8.send_messages) {
                    this.P.send_messages = true;
                }
                if (tL_chatBannedRights8.send_media) {
                    this.P.send_media = true;
                }
                if (tL_chatBannedRights8.send_stickers) {
                    this.P.send_stickers = true;
                }
                if (tL_chatBannedRights8.send_gifs) {
                    this.P.send_gifs = true;
                }
                if (tL_chatBannedRights8.send_games) {
                    this.P.send_games = true;
                }
                if (tL_chatBannedRights8.send_inline) {
                    this.P.send_inline = true;
                }
                if (tL_chatBannedRights8.embed_links) {
                    this.P.embed_links = true;
                }
                if (tL_chatBannedRights8.send_polls) {
                    this.P.send_polls = true;
                }
                if (tL_chatBannedRights8.invite_users) {
                    this.P.invite_users = true;
                }
                if (tL_chatBannedRights8.change_info) {
                    this.P.change_info = true;
                }
                if (tL_chatBannedRights8.pin_messages) {
                    this.P.pin_messages = true;
                }
                if (tL_chatBannedRights8.edit_rank) {
                    this.P.edit_rank = true;
                }
                if (tL_chatBannedRights8.send_reactions) {
                    this.P.send_reactions = true;
                }
                if (tL_chatBannedRights8.manage_topics) {
                    this.P.manage_topics = true;
                }
                if (tL_chatBannedRights8.send_photos) {
                    this.P.send_photos = true;
                }
                if (tL_chatBannedRights8.send_videos) {
                    this.P.send_videos = true;
                }
                if (tL_chatBannedRights8.send_audios) {
                    this.P.send_audios = true;
                }
                if (tL_chatBannedRights8.send_docs) {
                    this.P.send_docs = true;
                }
                if (tL_chatBannedRights8.send_voices) {
                    this.P.send_voices = true;
                }
                if (tL_chatBannedRights8.send_roundvideos) {
                    this.P.send_roundvideos = true;
                }
                if (tL_chatBannedRights8.send_plain) {
                    this.P.send_plain = true;
                }
                this.S = org.telegram.messenger.t3.D(this.P);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z14 = false;
                }
                this.b1 = z14;
            }
            z13 = false;
        }
        z0(z13);
    }

    public static void Z(ip ipVar, long j10) {
        if (j10 != 0) {
            ipVar.s = j10;
            ipVar.x = org.telegram.messenger.hp.s1(ipVar.currentAccount).M0(Long.valueOf(j10));
            ipVar.w0(true);
        }
    }

    public static void a0(final ip ipVar, hi.d dVar, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        int i3 = 0;
        if (intValue == 0) {
            ipVar.P.until_date = 0;
            ipVar.a.g(ipVar.N0);
        } else if (intValue == 1) {
            ipVar.P.until_date = ConnectionsManager.getInstance(ipVar.currentAccount).getCurrentTime() + 86400;
            ipVar.a.g(ipVar.N0);
        } else if (intValue == 2) {
            ipVar.P.until_date = ConnectionsManager.getInstance(ipVar.currentAccount).getCurrentTime() + 604800;
            ipVar.a.g(ipVar.N0);
        } else if (intValue == 3) {
            ipVar.P.until_date = ConnectionsManager.getInstance(ipVar.currentAccount).getCurrentTime() + 2592000;
            ipVar.a.g(ipVar.N0);
        } else if (intValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(ipVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() { // from class: org.telegram.ui.bp
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                        final ip ipVar2 = ip.this;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.clear();
                        calendar2.set(i10, i11, i12);
                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                        try {
                            TimePickerDialog timePickerDialog = new TimePickerDialog(ipVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.ep
                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                    ip ipVar3 = ip.this;
                                    ipVar3.P.until_date = (i14 * 60) + (i13 * 3600) + time;
                                    ipVar3.a.g(ipVar3.N0);
                                }
                            }, 0, 0, true);
                            timePickerDialog.setButton(-1, org.telegram.messenger.bd.M0(2131745560, null), timePickerDialog);
                            timePickerDialog.setButton(-2, org.telegram.messenger.bd.M0(2131752589, null), new cp());
                            ipVar2.showDialog(timePickerDialog);
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
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
                datePickerDialog.setButton(-1, org.telegram.messenger.bd.M0(2131745560, null), datePickerDialog);
                datePickerDialog.setButton(-2, org.telegram.messenger.bd.M0(2131752589, null), new cp());
                datePickerDialog.setOnShowListener(new dp(i3, datePicker));
                ipVar.showDialog(datePickerDialog);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        ((org.telegram.ui.ActionBar.t2) dVar.b).y0.run();
    }

    public static /* synthetic */ boolean b0(ip ipVar, TLRPC.TL_error tL_error) {
        ipVar.y0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!org.telegram.messenger.t3.T(ipVar.x)) {
            vg.i0 i0Var = new vg.i0(11, ipVar.currentAccount, ipVar.getParentActivity(), ipVar, ipVar.getResourceProvider());
            ArrayList arrayList = new ArrayList();
            arrayList.add(ipVar.w);
            i0Var.C1(ipVar.x, arrayList, null, null, null);
            i0Var.show();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x04a9, code lost:
    
        if (r6.change_info != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04fe, code lost:
    
        if (r6.pin_messages != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x052c, code lost:
    
        if (r13.creator == false) goto L303;
     */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0788  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c0(ip ipVar, Context context, View view, int i3) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.Chat chat;
        boolean z13;
        boolean z14;
        boolean z15;
        View m10;
        boolean z16 = ipVar.F;
        TLRPC.User user = ipVar.w;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = ipVar.Q;
        int i10 = ipVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = ipVar.N;
        if (ipVar.J || (ipVar.x.creator && i10 == 0 && i3 == ipVar.f0)) {
            if (i3 == ipVar.A0) {
                if (!(view instanceof org.telegram.ui.Cells.p8) || ((org.telegram.ui.Cells.p8) view).isEnabled()) {
                    ipVar.B0 = !ipVar.B0;
                    ipVar.z0(false);
                    ipVar.a.g(ipVar.A0);
                    if (ipVar.B0) {
                        ipVar.a.o(ipVar.A0 + 1, 10);
                        return;
                    } else {
                        ipVar.a.p(ipVar.A0 + 1, 10);
                        return;
                    }
                }
                return;
            }
            int i11 = ipVar.O0;
            if (i3 == i11) {
                if (!(view instanceof org.telegram.ui.Cells.p8) || ((org.telegram.ui.Cells.p8) view).isEnabled()) {
                    ipVar.P0 = !ipVar.P0;
                    ipVar.z0(false);
                    ipVar.a.g(ipVar.O0);
                    if (ipVar.P0) {
                        ipVar.a.o(ipVar.O0 + 1, 3);
                        return;
                    } else {
                        ipVar.a.p(ipVar.O0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i12 = ipVar.T0;
            if (i3 == i12) {
                if (!(view instanceof org.telegram.ui.Cells.p8) || ((org.telegram.ui.Cells.p8) view).isEnabled()) {
                    ipVar.U0 = !ipVar.U0;
                    ipVar.z0(false);
                    ipVar.a.g(ipVar.T0);
                    if (ipVar.U0) {
                        ipVar.a.o(ipVar.T0 + 1, 3);
                        return;
                    } else {
                        ipVar.a.p(ipVar.T0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            if (i3 == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                ipVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            if (i3 == ipVar.q0) {
                if (i10 == 0) {
                    org.telegram.messenger.hp.s1(ipVar.currentAccount).P4(ipVar.s, ipVar.w, new TLRPC.TL_chatAdminRights(), ipVar.T, ipVar.F, ipVar.getFragmentForAlert(0), ipVar.a1, false, null, null, null);
                    fp fpVar = ipVar.Y0;
                    if (fpVar != null) {
                        fpVar.b(0, tL_chatAdminRights, ipVar.P, ipVar.T);
                    }
                    ipVar.finishFragment();
                    return;
                }
                if (i10 == 1) {
                    ipVar.R = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    ipVar.P = tL_chatBannedRights3;
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
                    ipVar.w0(true);
                    return;
                }
                return;
            }
            if (i3 == ipVar.u0) {
                ipVar.u0(null, null);
                return;
            }
            if (i3 == ipVar.N0) {
                if (ipVar.getParentActivity() == null) {
                    return;
                }
                hi.d dVar = new hi.d(context, (org.telegram.ui.ActionBar.e6) null);
                ((org.telegram.ui.ActionBar.t2) dVar.b).v0 = false;
                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, org.telegram.ui.ActionBar.k6.n5, 23, 15, false, null);
                n4Var.setHeight(47);
                n4Var.setText(org.telegram.messenger.bd.M0(2131743724, null));
                f10.addView(n4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                int i13 = -1;
                f10.addView(linearLayout, b8.mf.o(-1, -2));
                org.telegram.ui.ActionBar.m2[] m2VarArr = new org.telegram.ui.ActionBar.m2[5];
                int i14 = 0;
                for (int i15 = 5; i14 < i15; i15 = 5) {
                    org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(0, context, null);
                    m2VarArr[i14] = m2Var;
                    m2Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                    m2VarArr[i14].setTag(Integer.valueOf(i14));
                    m2VarArr[i14].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                    m2VarArr[i14].a(i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 3 ? org.telegram.messenger.bd.M0(2131743725, null) : org.telegram.messenger.bd.G(1, "Months", new Object[0]) : org.telegram.messenger.bd.G(1, "Weeks", new Object[0]) : org.telegram.messenger.bd.G(1, "Days", new Object[0]) : org.telegram.messenger.bd.M0(2131743694, null), 0, null, false);
                    linearLayout.addView(m2VarArr[i14], b8.mf.o(i13, -2));
                    m2VarArr[i14].setOnClickListener(new org.telegram.messenger.video.g(22, ipVar, dVar));
                    i14++;
                    i13 = -1;
                }
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) dVar.b;
                t2Var.O = f10;
                ipVar.showDialog(t2Var);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.c2) {
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                int i16 = ipVar.Q0;
                if (i3 == i16 || i3 == ipVar.R0 || i3 == ipVar.S0) {
                    if (i3 == i16) {
                        z13 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z13;
                    } else if (i3 == ipVar.R0) {
                        z13 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z13;
                    } else {
                        z13 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z13;
                    }
                    ipVar.a.g(i11);
                    c2Var.c(z13, true);
                    return;
                }
                int i17 = ipVar.V0;
                if (i3 == i17 || i3 == ipVar.W0 || i3 == ipVar.X0) {
                    if (i3 == i17) {
                        z14 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z14;
                    } else if (i3 == ipVar.W0) {
                        z14 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z14;
                    } else {
                        z14 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z14;
                    }
                    ipVar.a.g(i12);
                    c2Var.c(z14, true);
                    return;
                }
                if (i10 != 1 || ipVar.P == null) {
                    return;
                }
                c2Var.b();
                if (c2Var.r.b != null) {
                    if (i10 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ipVar.getParentActivity());
                        String M0 = org.telegram.messenger.bd.M0(2131743729, null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                        s1Var.S = M0;
                        s1Var.U = org.telegram.messenger.bd.M0(2131743728, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var.show();
                        return;
                    }
                    return;
                }
                if (i3 == ipVar.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = ipVar.P;
                    z15 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z15;
                } else if (i3 == ipVar.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = ipVar.P;
                    z15 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z15;
                } else if (i3 == ipVar.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = ipVar.P;
                    z15 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z15;
                } else if (i3 == ipVar.k0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = ipVar.P;
                    z15 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z15;
                } else if (i3 == ipVar.F0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = ipVar.P;
                    z15 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z15;
                } else if (i3 == ipVar.H0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = ipVar.P;
                    z15 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z15;
                } else if (i3 == ipVar.G0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = ipVar.P;
                    z15 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z15;
                } else if (i3 == ipVar.I0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = ipVar.P;
                    z15 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z15;
                    tL_chatBannedRights11.send_gifs = z15;
                    tL_chatBannedRights11.send_games = z15;
                    tL_chatBannedRights11.send_stickers = z15;
                } else if (i3 == ipVar.K0) {
                    if ((ipVar.P.send_plain || tL_chatBannedRights2.send_plain) && (m10 = ipVar.c.m(ipVar.z0)) != null) {
                        org.telegram.messenger.g0.H3(m10);
                        org.telegram.messenger.p2.E.a();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = ipVar.P;
                        z15 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z15;
                    }
                } else if (i3 == ipVar.J0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = ipVar.P;
                    z15 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z15;
                } else {
                    z15 = false;
                }
                ipVar.a.g(ipVar.A0);
                c2Var.c(!z15, true);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.p8) {
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                Switch r12 = p8Var.d;
                if (r12.G != null) {
                    if (i10 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ipVar.getParentActivity());
                        String M02 = org.telegram.messenger.bd.M0(2131743729, null);
                        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
                        s1Var2.S = M02;
                        s1Var2.U = org.telegram.messenger.bd.M0(2131743728, null);
                        alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var2.show();
                        return;
                    }
                    return;
                }
                if (!p8Var.isEnabled()) {
                    if (i10 == 2 || i10 == 0) {
                        if ((i3 != ipVar.Y || tL_chatBannedRights2 == null || tL_chatBannedRights2.change_info) && ((i3 != ipVar.i0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.pin_messages) && (i3 != ipVar.j0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ipVar.getParentActivity());
                        String M03 = org.telegram.messenger.bd.M0(2131743729, null);
                        org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder3.a;
                        s1Var3.S = M03;
                        s1Var3.U = org.telegram.messenger.bd.M0(2131743727, null);
                        alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                        s1Var3.show();
                        return;
                    }
                    return;
                }
                if (i10 != 2 && i3 != ipVar.l0) {
                    p8Var.setChecked(!r12.h);
                }
                boolean z17 = r12.h;
                if (i3 == ipVar.X) {
                    z17 = !ipVar.L;
                    ipVar.L = z17;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = ipVar.O;
                    FrameLayout frameLayout = ipVar.e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = ipVar.b.getChildCount();
                    for (int i18 = 0; i18 < childCount; i18++) {
                        View childAt = ipVar.b.getChildAt(i18);
                        ipVar.b.getClass();
                        int R = RecyclerView.R(childAt);
                        if (childAt instanceof org.telegram.ui.Cells.p8) {
                            boolean z18 = ipVar.L;
                            if (z18) {
                                if (R == ipVar.X) {
                                    z12 = tL_chatAdminRights2.add_admins || ((chat = ipVar.x) != null && chat.creator);
                                    z11 = z18;
                                } else if (R == ipVar.Y) {
                                    z11 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info) {
                                    }
                                    z12 = false;
                                } else if (R == ipVar.Z) {
                                    z11 = tL_chatAdminRights.post_messages;
                                    z12 = tL_chatAdminRights2.post_messages;
                                } else if (R == ipVar.a0) {
                                    z11 = tL_chatAdminRights.manage_direct_messages;
                                    z12 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (R == ipVar.b0) {
                                    z11 = tL_chatAdminRights.manage_welcome_messages;
                                    z12 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (R == ipVar.c0) {
                                    z11 = tL_chatAdminRights.edit_messages;
                                    z12 = tL_chatAdminRights2.edit_messages;
                                } else if (R == ipVar.d0) {
                                    z11 = tL_chatAdminRights.delete_messages;
                                    z12 = tL_chatAdminRights2.delete_messages;
                                } else if (R == ipVar.g0) {
                                    z11 = tL_chatAdminRights.ban_users;
                                    z12 = tL_chatAdminRights2.ban_users;
                                } else if (R == ipVar.h0) {
                                    z11 = tL_chatAdminRights.invite_users;
                                    z12 = tL_chatAdminRights2.invite_users;
                                } else if (R == ipVar.i0) {
                                    z11 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages) {
                                    }
                                    z12 = false;
                                } else if (R == ipVar.j0) {
                                    z11 = tL_chatAdminRights.manage_ranks;
                                    z12 = tL_chatAdminRights2.manage_ranks;
                                } else if (R == ipVar.L0) {
                                    z11 = tL_chatAdminRights.manage_call;
                                    z12 = tL_chatAdminRights2.manage_call;
                                } else if (R == ipVar.e0) {
                                    z11 = tL_chatAdminRights.add_admins;
                                    z12 = tL_chatAdminRights2.add_admins;
                                } else {
                                    if (R == ipVar.f0) {
                                        z11 = tL_chatAdminRights.anonymous;
                                        if (!tL_chatAdminRights2.anonymous) {
                                            TLRPC.Chat chat2 = ipVar.x;
                                            if (chat2 != null) {
                                            }
                                        }
                                        z12 = true;
                                    } else if (R == ipVar.n0) {
                                        z11 = tL_chatAdminRights.manage_topics;
                                        z12 = tL_chatAdminRights2.manage_topics;
                                    } else if (R == ipVar.o0) {
                                        z11 = tL_chatAdminRights.manage_linked_peers;
                                        z12 = tL_chatAdminRights2.manage_linked_peers;
                                    } else {
                                        z11 = false;
                                    }
                                    z12 = false;
                                }
                                org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) childAt;
                                p8Var2.setChecked(z11);
                                p8Var2.b(z12, true);
                            } else if ((R != ipVar.Y || tL_chatBannedRights2.change_info) && ((R != ipVar.i0 || tL_chatBannedRights2.pin_messages) && (R != ipVar.j0 || tL_chatBannedRights2.edit_rank))) {
                                org.telegram.ui.Cells.p8 p8Var3 = (org.telegram.ui.Cells.p8) childAt;
                                p8Var3.setChecked(false);
                                p8Var3.b(R == ipVar.X, true);
                            } else {
                                org.telegram.ui.Cells.p8 p8Var4 = (org.telegram.ui.Cells.p8) childAt;
                                p8Var4.setChecked(true);
                                p8Var4.b(false, false);
                            }
                        }
                    }
                    ipVar.a.f();
                    org.telegram.ui.Components.h6 h6Var = ipVar.f;
                    if (h6Var != null) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.camera.q.q(null, 2131754459, sb2, " ");
                        sb2.append(org.telegram.messenger.bd.M0(ipVar.L ? 2131754458 : 2131754457, null));
                        h6Var.c(sb2.toString(), true, ipVar.L);
                    }
                    ValueAnimator valueAnimator = ipVar.c1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ipVar.c1 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(ipVar.K, ipVar.L ? 1.0f : 0.0f);
                    ipVar.c1 = ofFloat;
                    ofFloat.addUpdateListener(new b3(ipVar, 6));
                    ipVar.c1.setDuration((long) (Math.abs(ipVar.K - (ipVar.L ? 1.0f : 0.0f)) * 200.0f));
                    ipVar.c1.start();
                } else if (i3 == ipVar.Y) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.change_info;
                        tL_chatAdminRights.change_info = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights14 = ipVar.P;
                        z17 = !tL_chatBannedRights14.change_info;
                        tL_chatBannedRights14.change_info = z17;
                    }
                } else if (i3 == ipVar.Z) {
                    z17 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z17;
                } else if (i3 == ipVar.l0) {
                    org.telegram.ui.Components.t4.u0(ipVar, org.telegram.messenger.bd.M0(2131754182, null), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, z17 ? z16 ? 2131754193 : 2131754192 : z16 ? 2131754184 : 2131754183, org.telegram.messenger.m5.u(user))), org.telegram.messenger.bd.M0(!z17 ? 2131754191 : 2131754200, null), false, new zo(ipVar, !z17 ? user.id : 0L, 1));
                } else if (i3 == ipVar.b0) {
                    z17 = !tL_chatAdminRights.manage_welcome_messages;
                    tL_chatAdminRights.manage_welcome_messages = z17;
                } else if (i3 == ipVar.a0) {
                    z17 = !tL_chatAdminRights.manage_direct_messages;
                    tL_chatAdminRights.manage_direct_messages = z17;
                } else if (i3 == ipVar.c0) {
                    z17 = !tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.edit_messages = z17;
                } else if (i3 == ipVar.d0) {
                    z17 = !tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.delete_messages = z17;
                } else if (i3 == ipVar.e0) {
                    z17 = !tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.add_admins = z17;
                } else if (i3 == ipVar.f0) {
                    z17 = !tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.anonymous = z17;
                } else if (i3 == ipVar.g0) {
                    z17 = !tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.ban_users = z17;
                } else if (i3 == ipVar.L0) {
                    z17 = !tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.manage_call = z17;
                } else if (i3 == ipVar.n0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.manage_topics;
                        tL_chatAdminRights.manage_topics = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = ipVar.P;
                        z17 = !tL_chatBannedRights15.manage_topics;
                        tL_chatBannedRights15.manage_topics = z17;
                    }
                } else if (i3 == ipVar.o0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.manage_linked_peers;
                        tL_chatAdminRights.manage_linked_peers = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = ipVar.P;
                        z17 = !tL_chatBannedRights16.manage_linked_peers;
                        tL_chatBannedRights16.manage_linked_peers = z17;
                    }
                } else if (i3 == ipVar.h0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.invite_users;
                        tL_chatAdminRights.invite_users = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = ipVar.P;
                        z17 = !tL_chatBannedRights17.invite_users;
                        tL_chatBannedRights17.invite_users = z17;
                    }
                } else if (i3 == ipVar.i0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.pin_messages;
                        tL_chatAdminRights.pin_messages = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = ipVar.P;
                        z17 = !tL_chatBannedRights18.pin_messages;
                        tL_chatBannedRights18.pin_messages = z17;
                    }
                } else if (i3 == ipVar.j0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.manage_ranks;
                        tL_chatAdminRights.manage_ranks = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights19 = ipVar.P;
                        z17 = !tL_chatBannedRights19.edit_rank;
                        tL_chatBannedRights19.edit_rank = z17;
                    }
                } else if (i10 == 1 && (tL_chatBannedRights = ipVar.P) != null) {
                    boolean z19 = r12.h;
                    if (i3 == ipVar.z0) {
                        z17 = !tL_chatBannedRights.send_plain;
                        tL_chatBannedRights.send_plain = z17;
                    }
                    if (!z19 || ((tL_chatBannedRights.send_plain && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_inline && tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) || !tL_chatBannedRights.view_messages)) {
                        z10 = false;
                    } else {
                        z10 = false;
                        tL_chatBannedRights.view_messages = false;
                    }
                    int i19 = ipVar.K0;
                    if (i19 >= 0) {
                        ipVar.a.g(i19);
                    }
                    int i20 = ipVar.A0;
                    if (i20 >= 0) {
                        ipVar.a.g(i20);
                    }
                    if (i10 == 2) {
                        p8Var.setChecked((ipVar.L && z17) ? true : z10);
                    }
                    ipVar.z0(true);
                }
                z10 = false;
                if (i10 == 2) {
                }
                ipVar.z0(true);
            }
        }
    }

    public static void d0(ip ipVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i3;
        boolean z10 = ipVar.F;
        TLRPC.User user = ipVar.w;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                ipVar.Y0.a(user);
                ipVar.removeSelfFromStack();
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (ipVar.getParentActivity() == null) {
            return;
        }
        int i10 = 5;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ipVar.getParentActivity());
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                if (z10) {
                    s1Var.S = org.telegram.messenger.bd.M0(2131751323, null);
                } else {
                    s1Var.S = org.telegram.messenger.bd.M0(2131751316, null);
                }
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131751294, ipVar.x.title, org.telegram.messenger.l10.j(user, true)));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751297, null), new yo(ipVar, i10));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                ipVar.showDialog(s1Var);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(ipVar.currentAccount).sendRequest(new TL_account.getPassword(), new org.telegram.ui.ActionBar.h6(11, ipVar, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.t0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.Components.t4.g0(tL_error, ipVar, z10, ipVar.G, tL_channels_editCreator);
                return;
            }
            if (ipVar.getParentActivity() == null || org.telegram.messenger.h10.i(org.telegram.messenger.c.a(ipVar.currentAccount).a).q()) {
                ipVar.presentFragment(new d81(1));
                return;
            } else {
                ipVar.showDialog(new vg.i0(5, ipVar.currentAccount, ipVar.getParentActivity(), ipVar, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ipVar.getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131751298, null);
        org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.a;
        s1Var2.S = M0;
        LinearLayout linearLayout = new LinearLayout(ipVar.getParentActivity());
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.o(linearLayout);
        TextView textView = new TextView(ipVar.getParentActivity());
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        if (z10) {
            org.telegram.messenger.k5.r("EditChannelAdminTransferAlertText", null, 2131751284, new Object[]{org.telegram.messenger.l10.j(user, true)}, textView);
        } else {
            org.telegram.messenger.k5.r("EditAdminTransferAlertText", null, 2131751302, new Object[]{org.telegram.messenger.l10.j(user, true)}, textView);
        }
        linearLayout.addView(textView, b8.mf.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(ipVar.getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(ipVar.getParentActivity());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, mode);
        TextView textView2 = new TextView(ipVar.getParentActivity());
        org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751301, null)));
        if (org.telegram.messenger.bd.a0) {
            linearLayout2.addView(textView2, b8.mf.o(-1, -2));
            linearLayout2.addView(imageView, b8.mf.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, b8.mf.o(-2, -2));
            linearLayout2.addView(textView2, b8.mf.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(ipVar.getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(ipVar.getParentActivity());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(org.telegram.messenger.bd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.bd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, mode);
        TextView textView3 = new TextView(ipVar.getParentActivity());
        org.telegram.ui.ActionBar.r6.V(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131751300, null)));
        if (org.telegram.messenger.bd.a0) {
            linearLayout3.addView(textView3, b8.mf.o(-1, -2));
            i3 = 5;
            linearLayout3.addView(imageView2, b8.mf.r(-2, -2, 5));
        } else {
            i3 = 5;
            linearLayout3.addView(imageView2, b8.mf.o(-2, -2));
            linearLayout3.addView(textView3, b8.mf.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751292, null), new yo(ipVar, 6));
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(ipVar.getParentActivity());
            org.telegram.ui.ActionBar.r6.V(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.k5.m(textView4, (org.telegram.messenger.bd.a0 ? i3 : 3) | 48, null, 2131751299);
            linearLayout.addView(textView4, b8.mf.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131747839, null), null);
        }
        ipVar.showDialog(s1Var2);
    }

    public static void e0(ip ipVar, long j10) {
        TLRPC.ChatFull chatFull = ipVar.y;
        long j11 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User a22 = j11 != 0 ? ipVar.getMessagesController().a2(Long.valueOf(j11)) : null;
        if (a22 != null && j10 != 0 && a22.id != j10) {
            new org.telegram.ui.Components.i20(ipVar.getParentActivity(), ipVar.resourceProvider, a22, ipVar.w, new zo(ipVar, j10, 0)).show();
            return;
        }
        ipVar.n = j10;
        ipVar.r = true;
        ipVar.s0();
    }

    public static /* synthetic */ void f0(ip ipVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            ipVar.s = j10;
            ipVar.x = org.telegram.messenger.hp.s1(ipVar.currentAccount).M0(Long.valueOf(j10));
            ipVar.u0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void k0(ip ipVar, View view) {
        if (view instanceof org.telegram.ui.Cells.n4) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            String str = ipVar.T;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount > 4.8f) {
                n4Var.setText2("");
                return;
            }
            n4Var.setText2(String.format("%d", Integer.valueOf(codePointCount)));
            org.telegram.ui.ActionBar.k5 textView2 = n4Var.getTextView2();
            int i3 = codePointCount < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.A6;
            org.telegram.ui.ActionBar.r6.Y(textView2, i3, null);
            textView2.setTag(Integer.valueOf(i3));
        }
    }

    public static boolean q0(ip ipVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = ipVar.Q;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public static TLRPC.TL_chatAdminRights t0(boolean z10) {
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

    public static TLRPC.TL_chatAdminRights x0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
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

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d6));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        int i3 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.E;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751333, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131754463, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131743737, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 9));
        if (this.J || (!this.F && this.x.creator && org.telegram.messenger.l10.B(this.w))) {
            this.h = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        }
        x7 x7Var = new x7(this, context, i3);
        this.fragmentView = x7Var;
        x7Var.setFocusableInTouchMode(true);
        ci.j1 j1Var = new ci.j1(11, context, this);
        this.b = j1Var;
        boolean z10 = false;
        j1Var.setClipChildren(i10 != 2);
        kg.y yVar = new kg.y(i3, z10, 5);
        this.c = yVar;
        yVar.E = 100;
        this.b.setLayoutManager(yVar);
        ci.j1 j1Var2 = this.b;
        hp hpVar = new hp(this, context);
        this.a = hpVar;
        j1Var2.setAdapter(hpVar);
        u4.k kVar = new u4.k();
        if (i10 == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        kVar.m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.n(350L);
        this.b.setItemAnimator(kVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        x7Var.addView(this.b, b8.mf.c(-1.0f, -1));
        this.b.r1();
        int i11 = 7;
        this.b.setOnScrollListener(new h3(this, i11));
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new ei.q4(i11, this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.x;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.y = chatFull;
            s0();
            return;
        }
        if (i3 == org.telegram.messenger.hs.y1) {
            if ((-this.s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                if (q4Var == null || q4Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(4, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, new Class[]{org.telegram.ui.Cells.v2.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        return r0(z10);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
        getNotificationCenter().c(this, org.telegram.messenger.hs.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.hs.y1);
        getNotificationCenter().n(this, org.telegram.messenger.hs.T);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        hp hpVar = this.a;
        if (hpVar != null) {
            hpVar.f();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean r0(boolean z10) {
        int i3 = this.E;
        if (i3 != 2) {
            if (!(i3 == 1 ? this.S.equals(org.telegram.messenger.t3.D(this.P)) : this.U.equals(this.T))) {
                int i10 = 0;
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.bd.M0(2131743736, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("UserRestrictionsApplyChangesText", null, 2131743735, org.telegram.messenger.hp.s1(this.currentAccount).M0(Long.valueOf(this.s)).title));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new yo(this, i10));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, null), new yo(this, 4));
                    showDialog(s1Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void s0() {
        boolean z10;
        TLRPC.User user;
        int i3 = this.l0;
        if (i3 >= 0) {
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) this.c.m(i3);
            if (p8Var == null) {
                this.a.g(this.l0);
                return;
            }
            TLRPC.ChatFull chatFull = this.y;
            if (chatFull != null && (user = this.w) != null) {
                if ((this.r ? this.n : chatFull.guard_bot_id) == user.id) {
                    z10 = true;
                    p8Var.setChecked(z10);
                }
            }
            z10 = false;
            p8Var.setChecked(z10);
        }
    }

    public final void u0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.x)) {
            org.telegram.messenger.hp.s1(this.currentAccount).T(getParentActivity(), this.s, this, new b7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.t3.T(this.x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.x;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().q1(this.w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new ai.q1(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
        boolean z10 = tL_chatAdminRights.change_info;
        boolean z11 = this.H;
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
    
        if (r0.v0() == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w0(boolean z10) {
        String str;
        ip ipVar = this;
        if (ipVar.I) {
            return;
        }
        boolean T = org.telegram.messenger.t3.T(ipVar.x);
        int i3 = ipVar.E;
        int i10 = 2;
        if (!T) {
            if (i3 != 1) {
                if (i3 == 0) {
                    if (ipVar.v0()) {
                        if (ipVar.w0 != -1) {
                            String str2 = ipVar.T;
                        }
                    }
                }
                if (i3 == 2) {
                    if (ipVar.T == null) {
                    }
                }
            }
            org.telegram.messenger.hp.s1(ipVar.currentAccount).T(ipVar.getParentActivity(), ipVar.s, ipVar, new yo(ipVar, 7), null);
            return;
        }
        boolean z11 = ipVar.G;
        TLRPC.User user = ipVar.w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = ipVar.N;
        if (z10 && z11 && !ipVar.M && tL_chatAdminRights.manage_linked_peers && tL_chatAdminRights.change_info) {
            org.telegram.ui.Components.t4.u0(ipVar, org.telegram.messenger.bd.M0(2131751919, null), org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131751921, org.telegram.messenger.m5.u(user))), org.telegram.messenger.bd.M0(2131751920, null), false, new ap(ipVar, r6));
            return;
        }
        if (ipVar.w0 != -1 && (str = ipVar.T) != null && str.codePointCount(0, str.length()) > 16) {
            ipVar.b.y0(ipVar.w0);
            Vibrator vibrator = (Vibrator) ipVar.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            u4.d1 K = ipVar.b.K(ipVar.w0);
            if (K != null) {
                org.telegram.messenger.g0.F3(K.a);
                return;
            }
            return;
        }
        if (i3 == 0 || i3 == 2) {
            boolean z12 = ipVar.F;
            if (z12) {
                tL_chatAdminRights.pin_messages = false;
                tL_chatAdminRights.manage_ranks = false;
            } else {
                tL_chatAdminRights.edit_messages = false;
                tL_chatAdminRights.post_messages = false;
            }
            if (tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || ((ipVar.H && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || (z12 && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)))) {
                tL_chatAdminRights.other = false;
            } else {
                tL_chatAdminRights.other = true;
            }
        }
        if (i3 == 0) {
            int i11 = ipVar.Y0 == null ? 1 : 0;
            ipVar.y0(true);
            org.telegram.messenger.hp.s1(ipVar.currentAccount).P4(ipVar.s, ipVar.w, ipVar.N, ipVar.T, ipVar.F, ipVar, (!ipVar.a1 || z11) ? 0 : 1, false, null, new ap(ipVar, i10), new yo(ipVar, 8));
            ipVar = ipVar;
            r6 = i11;
        } else {
            if (i3 == 1) {
                if (ipVar.w0 >= 0) {
                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                    tL_messages_editChatParticipantRank.peer = org.telegram.messenger.hp.l1(ipVar.x);
                    tL_messages_editChatParticipantRank.participant = org.telegram.messenger.hp.n1(user);
                    String str3 = ipVar.T;
                    tL_messages_editChatParticipantRank.rank = str3 != null ? str3 : "";
                    ConnectionsManager.getInstance(ipVar.currentAccount).sendRequest(tL_messages_editChatParticipantRank, null);
                }
                org.telegram.messenger.hp.s1(ipVar.currentAccount).M4(ipVar.s, ipVar.w, null, ipVar.P, ipVar.F, ipVar.getFragmentForAlert(1), null);
                TLRPC.TL_chatBannedRights tL_chatBannedRights = ipVar.P;
                if (tL_chatBannedRights.send_messages || tL_chatBannedRights.send_stickers || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_media || tL_chatBannedRights.send_gifs || tL_chatBannedRights.send_games || tL_chatBannedRights.send_inline) {
                    i10 = 1;
                } else {
                    tL_chatBannedRights.until_date = 0;
                }
                fp fpVar = ipVar.Y0;
                if (fpVar != null) {
                    fpVar.b(i10, tL_chatAdminRights, tL_chatBannedRights, ipVar.T);
                }
            } else if (i3 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ipVar.getParentActivity());
                String M0 = ipVar.L ? org.telegram.messenger.bd.M0(2131754462, null) : org.telegram.messenger.bd.M0(2131754463, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                boolean z13 = org.telegram.messenger.t3.T(ipVar.x) && !ipVar.x.megagroup;
                TLRPC.Chat chat = ipVar.x;
                String str4 = chat != null ? chat.title : "";
                s1Var.U = org.telegram.messenger.g0.X2(ipVar.L ? z13 ? org.telegram.messenger.bd.a0(null, null, 2131754456, str4) : org.telegram.messenger.bd.a0(null, null, 2131754455, str4) : org.telegram.messenger.bd.a0(null, null, 2131754399, org.telegram.messenger.l10.p(user), str4));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.k(ipVar.L ? org.telegram.messenger.bd.M0(2131754466, null) : org.telegram.messenger.bd.M0(2131754463, null), new yo(ipVar, r6));
                ipVar.showDialog(s1Var);
                r6 = 0;
            }
        }
        if (r6 != 0) {
            ipVar.finishFragment();
        }
    }

    public final void y0(boolean z10) {
        this.I = z10;
        this.simpleActionBar.getBackButton().setEnabled(!this.I);
        org.telegram.ui.ActionBar.b5 b5Var = this.h;
        if (b5Var != null) {
            b5Var.b(this.I);
        }
    }

    public final void z0(boolean z10) {
        int i3;
        int min = Math.min(this.t0, this.u0);
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
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.z0 = -1;
        this.A0 = -1;
        this.O0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.T0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.X0 = -1;
        this.C0 = -1;
        this.D0 = -1;
        this.E0 = -1;
        this.F0 = -1;
        this.G0 = -1;
        this.H0 = -1;
        this.I0 = -1;
        this.J0 = -1;
        this.K0 = -1;
        this.L0 = -1;
        this.M0 = -1;
        this.N0 = -1;
        this.y0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.W = 3;
        boolean z11 = this.G;
        boolean z12 = this.F;
        boolean z13 = this.H;
        int i10 = this.E;
        if (i10 == 0 || i10 == 2) {
            if (z11) {
                this.Y = 3;
                this.o0 = 4;
                this.e0 = 5;
                this.W = 7;
                this.g0 = 6;
            } else if (z12) {
                this.Y = 3;
                this.W = 5;
                this.O0 = 4;
                if (this.P0) {
                    this.Q0 = 5;
                    this.R0 = 6;
                    this.W = 8;
                    this.S0 = 7;
                }
                int i11 = this.W;
                int i12 = i11 + 1;
                this.W = i12;
                this.T0 = i11;
                if (this.U0) {
                    this.V0 = i12;
                    this.W0 = i11 + 2;
                    this.W = i11 + 4;
                    this.X0 = i11 + 3;
                }
                int i13 = this.W;
                this.a0 = i13;
                this.b0 = i13 + 1;
                this.h0 = i13 + 2;
                this.L0 = i13 + 3;
                this.e0 = i13 + 4;
                this.W = i13 + 6;
                this.g0 = i13 + 5;
            } else {
                if (i10 == 2) {
                    this.W = 4;
                    this.X = 3;
                }
                int i14 = this.W;
                this.Y = i14;
                this.d0 = i14 + 1;
                this.g0 = i14 + 2;
                this.h0 = i14 + 3;
                int i15 = i14 + 5;
                this.W = i15;
                this.i0 = i14 + 4;
                if (i10 != 2) {
                    this.W = i14 + 6;
                    this.j0 = i15;
                }
                if (org.telegram.messenger.t3.T(this.x)) {
                    int i16 = this.W;
                    int i17 = i16 + 1;
                    this.W = i17;
                    this.T0 = i16;
                    if (this.U0) {
                        this.V0 = i17;
                        this.W0 = i16 + 2;
                        this.W = i16 + 4;
                        this.X0 = i16 + 3;
                    }
                }
                int i18 = this.W;
                this.b0 = i18;
                this.L0 = i18 + 1;
                this.e0 = i18 + 2;
                int i19 = i18 + 4;
                this.W = i19;
                this.f0 = i18 + 3;
                if (z13) {
                    this.W = i18 + 5;
                    this.n0 = i19;
                }
                if (this.V) {
                    int i20 = this.W;
                    this.l0 = i20;
                    this.W = i20 + 2;
                    this.m0 = i20 + 1;
                }
            }
        } else if (i10 == 1) {
            this.z0 = 3;
            this.W = 5;
            this.A0 = 4;
            if (this.B0) {
                this.C0 = 5;
                this.D0 = 6;
                this.F0 = 7;
                this.E0 = 8;
                this.G0 = 9;
                this.H0 = 10;
                this.I0 = 11;
                this.J0 = 12;
                this.K0 = 13;
                this.W = 15;
                this.k0 = 14;
            }
            int i21 = this.W;
            this.h0 = i21;
            this.i0 = i21 + 1;
            this.j0 = i21 + 2;
            int i22 = i21 + 4;
            this.W = i22;
            this.Y = i21 + 3;
            if (z13) {
                this.W = i21 + 5;
                this.n0 = i22;
            }
            int i23 = this.W;
            this.M0 = i23;
            this.W = i23 + 2;
            this.N0 = i23 + 1;
        }
        boolean z14 = this.J;
        TLRPC.User user = this.w;
        if (z14) {
            if (!z12 && (i10 == 0 || ((i10 == 2 && this.L) || i10 == 1))) {
                int i24 = this.W;
                this.p0 = i24;
                this.w0 = i24 + 1;
                this.W = i24 + 3;
                this.x0 = i24 + 2;
            }
            TLRPC.Chat chat = this.x;
            if (chat != null && chat.creator && i10 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i25 = this.p0;
                        if (i25 == -1) {
                            int i26 = this.W;
                            this.W = i26 + 1;
                            this.t0 = i26;
                        }
                        int i27 = this.W;
                        int i28 = i27 + 1;
                        this.W = i28;
                        this.u0 = i27;
                        if (i25 != -1) {
                            this.W = i27 + 2;
                            this.t0 = i28;
                        }
                    }
                }
            }
            if (this.b1) {
                if (this.p0 == -1) {
                    int i29 = this.W;
                    this.W = i29 + 1;
                    this.p0 = i29;
                }
                int i30 = this.W;
                this.q0 = i30;
                this.W = i30 + 2;
                this.r0 = i30 + 1;
            }
        } else if (i10 != 0) {
            int i31 = this.W;
            this.W = i31 + 1;
            this.p0 = i31;
        } else if (z12 || (this.T.isEmpty() && !(this.x.creator && org.telegram.messenger.l10.B(user)))) {
            int i32 = this.W;
            this.W = i32 + 1;
            this.s0 = i32;
        } else {
            int i33 = this.W;
            this.p0 = i33;
            this.W = i33 + 2;
            this.w0 = i33 + 1;
            if (this.x.creator && org.telegram.messenger.l10.B(user)) {
                int i34 = this.W;
                this.W = i34 + 1;
                this.x0 = i34;
            } else {
                int i35 = this.W;
                this.W = i35 + 1;
                this.s0 = i35;
            }
        }
        if (i10 == 2) {
            int i36 = this.W;
            this.W = i36 + 1;
            this.y0 = i36;
        }
        if (z10) {
            if (min == -1 && (i3 = this.t0) != -1) {
                this.a.o(Math.min(i3, this.u0), 2);
            } else {
                if (min == -1 || this.t0 != -1) {
                    return;
                }
                this.a.p(min, 2);
            }
        }
    }
}
