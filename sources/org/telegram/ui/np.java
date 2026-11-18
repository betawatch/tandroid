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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class np extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
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
    public kp Y0;
    public int Z;
    public final String Z0;
    public mp a;
    public int a0;
    public final boolean a1;
    public di.b1 b;
    public int b0;
    public final boolean b1;
    public jg.b0 c;
    public int c0;
    public ValueAnimator c1;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public org.telegram.ui.Components.n6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.ActionBar.d5 h;
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
    public np(long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        TLRPC.UserFull d2;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        this.I = false;
        this.K = 0.0f;
        this.L = false;
        this.M = false;
        this.S = "";
        this.a1 = z11;
        this.s = j10;
        TLRPC.User c22 = org.telegram.messenger.mp.u1(this.currentAccount).c2(Long.valueOf(j3));
        this.w = c22;
        this.E = i7;
        this.J = z10;
        boolean z14 = true;
        boolean z15 = !z10;
        this.U0 = z15;
        this.P0 = z15;
        this.Z0 = str2;
        this.x = getMessagesController().O0(Long.valueOf(this.s));
        this.y = getMessagesController().P0(this.s);
        this.V = c22 != null && c22.bot_guard;
        String str3 = str != null ? str : "";
        this.T = str3;
        this.U = str3;
        this.G = org.telegram.messenger.v3.Y(this.x);
        TLRPC.Chat chat2 = this.x;
        if (chat2 != null) {
            this.F = org.telegram.messenger.v3.T(chat2) && !this.x.megagroup;
            this.H = org.telegram.messenger.v3.c0(this.x);
            this.O = this.x.admin_rights;
        }
        if (this.O == null) {
            this.O = t0(i7 != 2 || ((chat = this.x) != null && chat.creator));
        }
        if (i7 == 0 || i7 == 2) {
            if (i7 == 2 && (d2 = getMessagesController().d2(j3)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.F ? d2.bot_broadcast_admin_rights : d2.bot_group_admin_rights;
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
                if (i7 == 2) {
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
                if (i7 == 2) {
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
            if (i7 == 1) {
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
                this.S = org.telegram.messenger.v3.D(this.P);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z14 = false;
                }
                this.b1 = z14;
            }
            z13 = false;
        }
        z0(z13);
    }

    public static void Z(np npVar, long j3) {
        if (j3 != 0) {
            npVar.s = j3;
            npVar.x = org.telegram.messenger.mp.u1(npVar.currentAccount).O0(Long.valueOf(j3));
            npVar.w0(true);
        }
    }

    public static void a0(final np npVar, hi.w4 w4Var, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        int i7 = 0;
        if (intValue == 0) {
            npVar.P.until_date = 0;
            npVar.a.g(npVar.N0);
        } else if (intValue == 1) {
            npVar.P.until_date = ConnectionsManager.getInstance(npVar.currentAccount).getCurrentTime() + 86400;
            npVar.a.g(npVar.N0);
        } else if (intValue == 2) {
            npVar.P.until_date = ConnectionsManager.getInstance(npVar.currentAccount).getCurrentTime() + 604800;
            npVar.a.g(npVar.N0);
        } else if (intValue == 3) {
            npVar.P.until_date = ConnectionsManager.getInstance(npVar.currentAccount).getCurrentTime() + 2592000;
            npVar.a.g(npVar.N0);
        } else if (intValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(npVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() { // from class: org.telegram.ui.gp
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                        final np npVar2 = np.this;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.clear();
                        calendar2.set(i10, i11, i12);
                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                        try {
                            TimePickerDialog timePickerDialog = new TimePickerDialog(npVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.jp
                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                    np npVar3 = np.this;
                                    npVar3.P.until_date = (i14 * 60) + (i13 * 3600) + time;
                                    npVar3.a.g(npVar3.N0);
                                }
                            }, 0, 0, true);
                            timePickerDialog.setButton(-1, org.telegram.messenger.gd.M0(2131745355, null), timePickerDialog);
                            timePickerDialog.setButton(-2, org.telegram.messenger.gd.M0(2131752578, null), new hp());
                            npVar2.showDialog(timePickerDialog);
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
                datePickerDialog.setButton(-1, org.telegram.messenger.gd.M0(2131745355, null), datePickerDialog);
                datePickerDialog.setButton(-2, org.telegram.messenger.gd.M0(2131752578, null), new hp());
                datePickerDialog.setOnShowListener(new ip(i7, datePicker));
                npVar.showDialog(datePickerDialog);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        ((org.telegram.ui.ActionBar.x2) w4Var.b).y0.run();
    }

    public static /* synthetic */ boolean b0(np npVar, TLRPC.TL_error tL_error) {
        npVar.y0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!org.telegram.messenger.v3.T(npVar.x)) {
            ug.l0 l0Var = new ug.l0(11, npVar.currentAccount, npVar.getParentActivity(), npVar, npVar.getResourceProvider());
            ArrayList arrayList = new ArrayList();
            arrayList.add(npVar.w);
            l0Var.D1(npVar.x, arrayList, null, null, null);
            l0Var.show();
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
    public static void c0(np npVar, Context context, View view, int i7) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.Chat chat;
        boolean z13;
        boolean z14;
        boolean z15;
        View m10;
        boolean z16 = npVar.F;
        TLRPC.User user = npVar.w;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = npVar.Q;
        int i10 = npVar.E;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = npVar.N;
        if (npVar.J || (npVar.x.creator && i10 == 0 && i7 == npVar.f0)) {
            if (i7 == npVar.A0) {
                if (!(view instanceof org.telegram.ui.Cells.r8) || ((org.telegram.ui.Cells.r8) view).isEnabled()) {
                    npVar.B0 = !npVar.B0;
                    npVar.z0(false);
                    npVar.a.g(npVar.A0);
                    if (npVar.B0) {
                        npVar.a.o(npVar.A0 + 1, 10);
                        return;
                    } else {
                        npVar.a.p(npVar.A0 + 1, 10);
                        return;
                    }
                }
                return;
            }
            int i11 = npVar.O0;
            if (i7 == i11) {
                if (!(view instanceof org.telegram.ui.Cells.r8) || ((org.telegram.ui.Cells.r8) view).isEnabled()) {
                    npVar.P0 = !npVar.P0;
                    npVar.z0(false);
                    npVar.a.g(npVar.O0);
                    if (npVar.P0) {
                        npVar.a.o(npVar.O0 + 1, 3);
                        return;
                    } else {
                        npVar.a.p(npVar.O0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i12 = npVar.T0;
            if (i7 == i12) {
                if (!(view instanceof org.telegram.ui.Cells.r8) || ((org.telegram.ui.Cells.r8) view).isEnabled()) {
                    npVar.U0 = !npVar.U0;
                    npVar.z0(false);
                    npVar.a.g(npVar.T0);
                    if (npVar.U0) {
                        npVar.a.o(npVar.T0 + 1, 3);
                        return;
                    } else {
                        npVar.a.p(npVar.T0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            if (i7 == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                npVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            if (i7 == npVar.q0) {
                if (i10 == 0) {
                    org.telegram.messenger.mp.u1(npVar.currentAccount).b5(npVar.s, npVar.w, new TLRPC.TL_chatAdminRights(), npVar.T, npVar.F, npVar.getFragmentForAlert(0), npVar.a1, false, null, null, null);
                    kp kpVar = npVar.Y0;
                    if (kpVar != null) {
                        kpVar.b(0, tL_chatAdminRights, npVar.P, npVar.T);
                    }
                    npVar.finishFragment();
                    return;
                }
                if (i10 == 1) {
                    npVar.R = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    npVar.P = tL_chatBannedRights3;
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
                    npVar.w0(true);
                    return;
                }
                return;
            }
            if (i7 == npVar.u0) {
                npVar.u0(null, null);
                return;
            }
            if (i7 == npVar.N0) {
                if (npVar.getParentActivity() == null) {
                    return;
                }
                hi.w4 w4Var = new hi.w4(context, (org.telegram.ui.ActionBar.i6) null);
                ((org.telegram.ui.ActionBar.x2) w4Var.b).v0 = false;
                LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
                org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(context, org.telegram.ui.ActionBar.n6.n5, 23, 15, false, null);
                o4Var.setHeight(47);
                o4Var.setText(org.telegram.messenger.gd.M0(2131743477, null));
                g10.addView(o4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                int i13 = -1;
                g10.addView(linearLayout, c8.ma.o(-1, -2));
                org.telegram.ui.ActionBar.q2[] q2VarArr = new org.telegram.ui.ActionBar.q2[5];
                int i14 = 0;
                for (int i15 = 5; i14 < i15; i15 = 5) {
                    org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(0, context, null);
                    q2VarArr[i14] = q2Var;
                    q2Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                    q2VarArr[i14].setTag(Integer.valueOf(i14));
                    q2VarArr[i14].setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(false));
                    q2VarArr[i14].a(i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 3 ? org.telegram.messenger.gd.M0(2131743478, null) : org.telegram.messenger.gd.G(1, "Months", new Object[0]) : org.telegram.messenger.gd.G(1, "Weeks", new Object[0]) : org.telegram.messenger.gd.G(1, "Days", new Object[0]) : org.telegram.messenger.gd.M0(2131743447, null), 0, null, false);
                    linearLayout.addView(q2VarArr[i14], c8.ma.o(i13, -2));
                    q2VarArr[i14].setOnClickListener(new ni.b(19, npVar, w4Var));
                    i14++;
                    i13 = -1;
                }
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) w4Var.b;
                x2Var.O = g10;
                npVar.showDialog(x2Var);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.d2) {
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                int i16 = npVar.Q0;
                if (i7 == i16 || i7 == npVar.R0 || i7 == npVar.S0) {
                    if (i7 == i16) {
                        z13 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z13;
                    } else if (i7 == npVar.R0) {
                        z13 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z13;
                    } else {
                        z13 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z13;
                    }
                    npVar.a.g(i11);
                    d2Var.c(z13, true);
                    return;
                }
                int i17 = npVar.V0;
                if (i7 == i17 || i7 == npVar.W0 || i7 == npVar.X0) {
                    if (i7 == i17) {
                        z14 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z14;
                    } else if (i7 == npVar.W0) {
                        z14 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z14;
                    } else {
                        z14 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z14;
                    }
                    npVar.a.g(i12);
                    d2Var.c(z14, true);
                    return;
                }
                if (i10 != 1 || npVar.P == null) {
                    return;
                }
                d2Var.b();
                if (d2Var.r.b != null) {
                    if (i10 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar.getParentActivity());
                        String M0 = org.telegram.messenger.gd.M0(2131743482, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.S = M0;
                        u1Var.U = org.telegram.messenger.gd.M0(2131743481, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                        u1Var.show();
                        return;
                    }
                    return;
                }
                if (i7 == npVar.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = npVar.P;
                    z15 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z15;
                } else if (i7 == npVar.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = npVar.P;
                    z15 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z15;
                } else if (i7 == npVar.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = npVar.P;
                    z15 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z15;
                } else if (i7 == npVar.k0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = npVar.P;
                    z15 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z15;
                } else if (i7 == npVar.F0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = npVar.P;
                    z15 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z15;
                } else if (i7 == npVar.H0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = npVar.P;
                    z15 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z15;
                } else if (i7 == npVar.G0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = npVar.P;
                    z15 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z15;
                } else if (i7 == npVar.I0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = npVar.P;
                    z15 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z15;
                    tL_chatBannedRights11.send_gifs = z15;
                    tL_chatBannedRights11.send_games = z15;
                    tL_chatBannedRights11.send_stickers = z15;
                } else if (i7 == npVar.K0) {
                    if ((npVar.P.send_plain || tL_chatBannedRights2.send_plain) && (m10 = npVar.c.m(npVar.z0)) != null) {
                        org.telegram.messenger.g0.F3(m10);
                        org.telegram.messenger.q2.E.a();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = npVar.P;
                        z15 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z15;
                    }
                } else if (i7 == npVar.J0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = npVar.P;
                    z15 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z15;
                } else {
                    z15 = false;
                }
                npVar.a.g(npVar.A0);
                d2Var.c(!z15, true);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.r8) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                Switch r12 = r8Var.d;
                if (r12.G != null) {
                    if (i10 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(npVar.getParentActivity());
                        String M02 = org.telegram.messenger.gd.M0(2131743482, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        u1Var2.S = M02;
                        u1Var2.U = org.telegram.messenger.gd.M0(2131743481, null);
                        alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                        u1Var2.show();
                        return;
                    }
                    return;
                }
                if (!r8Var.isEnabled()) {
                    if (i10 == 2 || i10 == 0) {
                        if ((i7 != npVar.Y || tL_chatBannedRights2 == null || tL_chatBannedRights2.change_info) && ((i7 != npVar.i0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.pin_messages) && (i7 != npVar.j0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(npVar.getParentActivity());
                        String M03 = org.telegram.messenger.gd.M0(2131743482, null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                        u1Var3.S = M03;
                        u1Var3.U = org.telegram.messenger.gd.M0(2131743480, null);
                        alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                        u1Var3.show();
                        return;
                    }
                    return;
                }
                if (i10 != 2 && i7 != npVar.l0) {
                    r8Var.setChecked(!r12.h);
                }
                boolean z17 = r12.h;
                if (i7 == npVar.X) {
                    z17 = !npVar.L;
                    npVar.L = z17;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = npVar.O;
                    FrameLayout frameLayout = npVar.e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = npVar.b.getChildCount();
                    for (int i18 = 0; i18 < childCount; i18++) {
                        View childAt = npVar.b.getChildAt(i18);
                        npVar.b.getClass();
                        int R = RecyclerView.R(childAt);
                        if (childAt instanceof org.telegram.ui.Cells.r8) {
                            boolean z18 = npVar.L;
                            if (z18) {
                                if (R == npVar.X) {
                                    z12 = tL_chatAdminRights2.add_admins || ((chat = npVar.x) != null && chat.creator);
                                    z11 = z18;
                                } else if (R == npVar.Y) {
                                    z11 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info) {
                                    }
                                    z12 = false;
                                } else if (R == npVar.Z) {
                                    z11 = tL_chatAdminRights.post_messages;
                                    z12 = tL_chatAdminRights2.post_messages;
                                } else if (R == npVar.a0) {
                                    z11 = tL_chatAdminRights.manage_direct_messages;
                                    z12 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (R == npVar.b0) {
                                    z11 = tL_chatAdminRights.manage_welcome_messages;
                                    z12 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (R == npVar.c0) {
                                    z11 = tL_chatAdminRights.edit_messages;
                                    z12 = tL_chatAdminRights2.edit_messages;
                                } else if (R == npVar.d0) {
                                    z11 = tL_chatAdminRights.delete_messages;
                                    z12 = tL_chatAdminRights2.delete_messages;
                                } else if (R == npVar.g0) {
                                    z11 = tL_chatAdminRights.ban_users;
                                    z12 = tL_chatAdminRights2.ban_users;
                                } else if (R == npVar.h0) {
                                    z11 = tL_chatAdminRights.invite_users;
                                    z12 = tL_chatAdminRights2.invite_users;
                                } else if (R == npVar.i0) {
                                    z11 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages) {
                                    }
                                    z12 = false;
                                } else if (R == npVar.j0) {
                                    z11 = tL_chatAdminRights.manage_ranks;
                                    z12 = tL_chatAdminRights2.manage_ranks;
                                } else if (R == npVar.L0) {
                                    z11 = tL_chatAdminRights.manage_call;
                                    z12 = tL_chatAdminRights2.manage_call;
                                } else if (R == npVar.e0) {
                                    z11 = tL_chatAdminRights.add_admins;
                                    z12 = tL_chatAdminRights2.add_admins;
                                } else {
                                    if (R == npVar.f0) {
                                        z11 = tL_chatAdminRights.anonymous;
                                        if (!tL_chatAdminRights2.anonymous) {
                                            TLRPC.Chat chat2 = npVar.x;
                                            if (chat2 != null) {
                                            }
                                        }
                                        z12 = true;
                                    } else if (R == npVar.n0) {
                                        z11 = tL_chatAdminRights.manage_topics;
                                        z12 = tL_chatAdminRights2.manage_topics;
                                    } else if (R == npVar.o0) {
                                        z11 = tL_chatAdminRights.manage_linked_peers;
                                        z12 = tL_chatAdminRights2.manage_linked_peers;
                                    } else {
                                        z11 = false;
                                    }
                                    z12 = false;
                                }
                                org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) childAt;
                                r8Var2.setChecked(z11);
                                r8Var2.b(z12, true);
                            } else if ((R != npVar.Y || tL_chatBannedRights2.change_info) && ((R != npVar.i0 || tL_chatBannedRights2.pin_messages) && (R != npVar.j0 || tL_chatBannedRights2.edit_rank))) {
                                org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) childAt;
                                r8Var3.setChecked(false);
                                r8Var3.b(R == npVar.X, true);
                            } else {
                                org.telegram.ui.Cells.r8 r8Var4 = (org.telegram.ui.Cells.r8) childAt;
                                r8Var4.setChecked(true);
                                r8Var4.b(false, false);
                            }
                        }
                    }
                    npVar.a.f();
                    org.telegram.ui.Components.n6 n6Var = npVar.f;
                    if (n6Var != null) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.ui.Cells.c0.u(null, 2131754457, sb2, " ");
                        sb2.append(org.telegram.messenger.gd.M0(npVar.L ? 2131754456 : 2131754455, null));
                        n6Var.c(sb2.toString(), true, npVar.L);
                    }
                    ValueAnimator valueAnimator = npVar.c1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        npVar.c1 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(npVar.K, npVar.L ? 1.0f : 0.0f);
                    npVar.c1 = ofFloat;
                    ofFloat.addUpdateListener(new a3(npVar, 6));
                    npVar.c1.setDuration((long) (Math.abs(npVar.K - (npVar.L ? 1.0f : 0.0f)) * 200.0f));
                    npVar.c1.start();
                } else if (i7 == npVar.Y) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.change_info;
                        tL_chatAdminRights.change_info = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights14 = npVar.P;
                        z17 = !tL_chatBannedRights14.change_info;
                        tL_chatBannedRights14.change_info = z17;
                    }
                } else if (i7 == npVar.Z) {
                    z17 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z17;
                } else if (i7 == npVar.l0) {
                    org.telegram.ui.Components.b5.s0(npVar, org.telegram.messenger.gd.M0(2131754180, null), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, z17 ? z16 ? 2131754191 : 2131754190 : z16 ? 2131754182 : 2131754181, org.telegram.messenger.n5.u(user))), org.telegram.messenger.gd.M0(!z17 ? 2131754189 : 2131754198, null), false, new ep(npVar, !z17 ? user.id : 0L, 1));
                } else if (i7 == npVar.b0) {
                    z17 = !tL_chatAdminRights.manage_welcome_messages;
                    tL_chatAdminRights.manage_welcome_messages = z17;
                } else if (i7 == npVar.a0) {
                    z17 = !tL_chatAdminRights.manage_direct_messages;
                    tL_chatAdminRights.manage_direct_messages = z17;
                } else if (i7 == npVar.c0) {
                    z17 = !tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.edit_messages = z17;
                } else if (i7 == npVar.d0) {
                    z17 = !tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.delete_messages = z17;
                } else if (i7 == npVar.e0) {
                    z17 = !tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.add_admins = z17;
                } else if (i7 == npVar.f0) {
                    z17 = !tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.anonymous = z17;
                } else if (i7 == npVar.g0) {
                    z17 = !tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.ban_users = z17;
                } else if (i7 == npVar.L0) {
                    z17 = !tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.manage_call = z17;
                } else if (i7 == npVar.n0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.manage_topics;
                        tL_chatAdminRights.manage_topics = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = npVar.P;
                        z17 = !tL_chatBannedRights15.manage_topics;
                        tL_chatBannedRights15.manage_topics = z17;
                    }
                } else if (i7 == npVar.o0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.manage_linked_peers;
                        tL_chatAdminRights.manage_linked_peers = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = npVar.P;
                        z17 = !tL_chatBannedRights16.manage_linked_peers;
                        tL_chatBannedRights16.manage_linked_peers = z17;
                    }
                } else if (i7 == npVar.h0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.invite_users;
                        tL_chatAdminRights.invite_users = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = npVar.P;
                        z17 = !tL_chatBannedRights17.invite_users;
                        tL_chatBannedRights17.invite_users = z17;
                    }
                } else if (i7 == npVar.i0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.pin_messages;
                        tL_chatAdminRights.pin_messages = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = npVar.P;
                        z17 = !tL_chatBannedRights18.pin_messages;
                        tL_chatBannedRights18.pin_messages = z17;
                    }
                } else if (i7 == npVar.j0) {
                    if (i10 == 0 || i10 == 2) {
                        z17 = !tL_chatAdminRights.manage_ranks;
                        tL_chatAdminRights.manage_ranks = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights19 = npVar.P;
                        z17 = !tL_chatBannedRights19.edit_rank;
                        tL_chatBannedRights19.edit_rank = z17;
                    }
                } else if (i10 == 1 && (tL_chatBannedRights = npVar.P) != null) {
                    boolean z19 = r12.h;
                    if (i7 == npVar.z0) {
                        z17 = !tL_chatBannedRights.send_plain;
                        tL_chatBannedRights.send_plain = z17;
                    }
                    if (!z19 || ((tL_chatBannedRights.send_plain && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_inline && tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) || !tL_chatBannedRights.view_messages)) {
                        z10 = false;
                    } else {
                        z10 = false;
                        tL_chatBannedRights.view_messages = false;
                    }
                    int i19 = npVar.K0;
                    if (i19 >= 0) {
                        npVar.a.g(i19);
                    }
                    int i20 = npVar.A0;
                    if (i20 >= 0) {
                        npVar.a.g(i20);
                    }
                    if (i10 == 2) {
                        r8Var.setChecked((npVar.L && z17) ? true : z10);
                    }
                    npVar.z0(true);
                }
                z10 = false;
                if (i10 == 2) {
                }
                npVar.z0(true);
            }
        }
    }

    public static void d0(np npVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i7;
        boolean z10 = npVar.F;
        TLRPC.User user = npVar.w;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                npVar.Y0.a(user);
                npVar.removeSelfFromStack();
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (npVar.getParentActivity() == null) {
            return;
        }
        int i10 = 5;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar.getParentActivity());
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                if (z10) {
                    u1Var.S = org.telegram.messenger.gd.M0(2131751311, null);
                } else {
                    u1Var.S = org.telegram.messenger.gd.M0(2131751304, null);
                }
                u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131751282, npVar.x.title, org.telegram.messenger.o10.k(user, true)));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751285, null), new dp(npVar, i10));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                npVar.showDialog(u1Var);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(npVar.currentAccount).sendRequest(new TL_account.getPassword(), new u7(10, npVar, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.t0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.Components.b5.e0(tL_error, npVar, z10, npVar.G, tL_channels_editCreator);
                return;
            }
            if (npVar.getParentActivity() == null || org.telegram.messenger.j10.i(org.telegram.messenger.c.a(npVar.currentAccount).a).q()) {
                npVar.presentFragment(new p81(1));
                return;
            } else {
                npVar.showDialog(new ug.l0(5, npVar.currentAccount, npVar.getParentActivity(), npVar, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(npVar.getParentActivity());
        String M0 = org.telegram.messenger.gd.M0(2131751286, null);
        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
        u1Var2.S = M0;
        LinearLayout linearLayout = new LinearLayout(npVar.getParentActivity());
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.o(linearLayout);
        TextView textView = new TextView(npVar.getParentActivity());
        int i11 = org.telegram.ui.ActionBar.n6.j5;
        org.telegram.ui.ActionBar.u6.U(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
        if (z10) {
            org.telegram.messenger.f3.q("EditChannelAdminTransferAlertText", null, 2131751272, new Object[]{org.telegram.messenger.o10.k(user, true)}, textView);
        } else {
            org.telegram.messenger.f3.q("EditAdminTransferAlertText", null, 2131751290, new Object[]{org.telegram.messenger.o10.k(user, true)}, textView);
        }
        linearLayout.addView(textView, c8.ma.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(npVar.getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(npVar.getParentActivity());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i11, null, mode);
        TextView textView2 = new TextView(npVar.getParentActivity());
        org.telegram.ui.ActionBar.u6.U(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131751289, null)));
        if (org.telegram.messenger.gd.a0) {
            linearLayout2.addView(textView2, c8.ma.o(-1, -2));
            linearLayout2.addView(imageView, c8.ma.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, c8.ma.o(-2, -2));
            linearLayout2.addView(textView2, c8.ma.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(npVar.getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(npVar.getParentActivity());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.u6.s(imageView2, i11, null, mode);
        TextView textView3 = new TextView(npVar.getParentActivity());
        org.telegram.ui.ActionBar.u6.U(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131751288, null)));
        if (org.telegram.messenger.gd.a0) {
            linearLayout3.addView(textView3, c8.ma.o(-1, -2));
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ma.r(-2, -2, 5));
        } else {
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ma.o(-2, -2));
            linearLayout3.addView(textView3, c8.ma.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131751280, null), new dp(npVar, 6));
            alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        } else {
            TextView textView4 = new TextView(npVar.getParentActivity());
            org.telegram.ui.ActionBar.u6.U(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.f3.k(textView4, (org.telegram.messenger.gd.a0 ? i7 : 3) | 48, null, 2131751287);
            linearLayout.addView(textView4, c8.ma.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder2.h(org.telegram.messenger.gd.M0(2131747638, null), null);
        }
        npVar.showDialog(u1Var2);
    }

    public static void e0(np npVar, long j3) {
        TLRPC.ChatFull chatFull = npVar.y;
        long j10 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User c22 = j10 != 0 ? npVar.getMessagesController().c2(Long.valueOf(j10)) : null;
        if (c22 != null && j3 != 0 && c22.id != j3) {
            new org.telegram.ui.Components.x20(npVar.getParentActivity(), npVar.resourceProvider, c22, npVar.w, new ep(npVar, j3, 0)).show();
            return;
        }
        npVar.n = j3;
        npVar.r = true;
        npVar.s0();
    }

    public static /* synthetic */ void f0(np npVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            npVar.s = j3;
            npVar.x = org.telegram.messenger.mp.u1(npVar.currentAccount).O0(Long.valueOf(j3));
            npVar.u0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void k0(np npVar, View view) {
        if (view instanceof org.telegram.ui.Cells.o4) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            String str = npVar.T;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount > 4.8f) {
                o4Var.setText2("");
                return;
            }
            o4Var.setText2(String.format("%d", Integer.valueOf(codePointCount)));
            org.telegram.ui.ActionBar.n5 textView2 = o4Var.getTextView2();
            int i7 = codePointCount < 0 ? org.telegram.ui.ActionBar.n6.p7 : org.telegram.ui.ActionBar.n6.A6;
            org.telegram.ui.ActionBar.u6.X(textView2, i7, null);
            textView2.setTag(Integer.valueOf(i7));
        }
    }

    public static boolean q0(np npVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = npVar.Q;
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

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.D5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d6));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.E;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131751321, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131754461, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131743490, null));
        }
        int i11 = 11;
        this.simpleActionBar.setActionBarMenuOnItemClick(new x7(this, i11));
        if (this.J || (!this.F && this.x.creator && org.telegram.messenger.o10.C(this.w))) {
            this.h = this.simpleActionBar.s(org.telegram.messenger.gd.M0(2131745751, null));
        }
        w7 w7Var = new w7(this, context, i7);
        this.fragmentView = w7Var;
        w7Var.setFocusableInTouchMode(true);
        di.b1 b1Var = new di.b1(i11, context, this);
        this.b = b1Var;
        boolean z10 = false;
        b1Var.setClipChildren(i10 != 2);
        jg.b0 b0Var = new jg.b0(i7, z10, 5);
        this.c = b0Var;
        b0Var.E = 100;
        this.b.setLayoutManager(b0Var);
        di.b1 b1Var2 = this.b;
        mp mpVar = new mp(this, context);
        this.a = mpVar;
        b1Var2.setAdapter(mpVar);
        v4.k kVar = new v4.k();
        if (i10 == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        kVar.m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.n(350L);
        this.b.setItemAnimator(kVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
        w7Var.addView(this.b, c8.ma.c(-1.0f, -1));
        this.b.r1();
        int i12 = 7;
        this.b.setOnScrollListener(new g3(this, i12));
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new fi.g4(i12, this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.x;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.y = chatFull;
            s0();
            return;
        }
        if (i7 == org.telegram.messenger.ks.y1) {
            if ((-this.s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.s4 s4Var = this.parentLayout;
                if (s4Var == null || s4Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(4, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.r8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 262144, new Class[]{org.telegram.ui.Cells.o4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.qa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, new Class[]{org.telegram.ui.Cells.w2.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.q5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onBackPressed(boolean z10) {
        return r0(z10);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.ks.y1);
        getNotificationCenter().c(this, org.telegram.messenger.ks.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.ks.y1);
        getNotificationCenter().n(this, org.telegram.messenger.ks.T);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        mp mpVar = this.a;
        if (mpVar != null) {
            mpVar.f();
        }
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean r0(boolean z10) {
        int i7 = this.E;
        if (i7 != 2) {
            if (!(i7 == 1 ? this.S.equals(org.telegram.messenger.v3.D(this.P)) : this.U.equals(this.T))) {
                int i10 = 0;
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.gd.M0(2131743489, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0("UserRestrictionsApplyChangesText", null, 2131743488, org.telegram.messenger.mp.u1(this.currentAccount).O0(Long.valueOf(this.s)).title));
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754214, null), new dp(this, i10));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131747387, null), new dp(this, 4));
                    showDialog(u1Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void s0() {
        boolean z10;
        TLRPC.User user;
        int i7 = this.l0;
        if (i7 >= 0) {
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) this.c.m(i7);
            if (r8Var == null) {
                this.a.g(this.l0);
                return;
            }
            TLRPC.ChatFull chatFull = this.y;
            if (chatFull != null && (user = this.w) != null) {
                if ((this.r ? this.n : chatFull.guard_bot_id) == user.id) {
                    z10 = true;
                    r8Var.setChecked(z10);
                }
            }
            z10 = false;
            r8Var.setChecked(z10);
        }
    }

    public final void u0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.v3.T(this.x)) {
            org.telegram.messenger.mp.u1(this.currentAccount).T(getParentActivity(), this.s, this, new z6(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.v3.T(this.x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.x;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().s1(this.w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new bi.g2(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 12));
    }

    @Override // org.telegram.ui.ActionBar.h2
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
        np npVar = this;
        if (npVar.I) {
            return;
        }
        boolean T = org.telegram.messenger.v3.T(npVar.x);
        int i7 = npVar.E;
        int i10 = 2;
        if (!T) {
            if (i7 != 1) {
                if (i7 == 0) {
                    if (npVar.v0()) {
                        if (npVar.w0 != -1) {
                            String str2 = npVar.T;
                        }
                    }
                }
                if (i7 == 2) {
                    if (npVar.T == null) {
                    }
                }
            }
            org.telegram.messenger.mp.u1(npVar.currentAccount).T(npVar.getParentActivity(), npVar.s, npVar, new dp(npVar, 7), null);
            return;
        }
        boolean z11 = npVar.G;
        TLRPC.User user = npVar.w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = npVar.N;
        if (z10 && z11 && !npVar.M && tL_chatAdminRights.manage_linked_peers && tL_chatAdminRights.change_info) {
            org.telegram.ui.Components.b5.s0(npVar, org.telegram.messenger.gd.M0(2131751908, null), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131751910, org.telegram.messenger.n5.u(user))), org.telegram.messenger.gd.M0(2131751909, null), false, new fp(npVar, r6));
            return;
        }
        if (npVar.w0 != -1 && (str = npVar.T) != null && str.codePointCount(0, str.length()) > 16) {
            npVar.b.y0(npVar.w0);
            Vibrator vibrator = (Vibrator) npVar.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            v4.f1 K = npVar.b.K(npVar.w0);
            if (K != null) {
                org.telegram.messenger.g0.D3(K.a);
                return;
            }
            return;
        }
        if (i7 == 0 || i7 == 2) {
            boolean z12 = npVar.F;
            if (z12) {
                tL_chatAdminRights.pin_messages = false;
                tL_chatAdminRights.manage_ranks = false;
            } else {
                tL_chatAdminRights.edit_messages = false;
                tL_chatAdminRights.post_messages = false;
            }
            if (tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || ((npVar.H && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || (z12 && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)))) {
                tL_chatAdminRights.other = false;
            } else {
                tL_chatAdminRights.other = true;
            }
        }
        if (i7 == 0) {
            int i11 = npVar.Y0 == null ? 1 : 0;
            npVar.y0(true);
            org.telegram.messenger.mp.u1(npVar.currentAccount).b5(npVar.s, npVar.w, npVar.N, npVar.T, npVar.F, npVar, (!npVar.a1 || z11) ? 0 : 1, false, null, new fp(npVar, i10), new dp(npVar, 8));
            npVar = npVar;
            r6 = i11;
        } else {
            if (i7 == 1) {
                if (npVar.w0 >= 0) {
                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                    tL_messages_editChatParticipantRank.peer = org.telegram.messenger.mp.n1(npVar.x);
                    tL_messages_editChatParticipantRank.participant = org.telegram.messenger.mp.p1(user);
                    String str3 = npVar.T;
                    tL_messages_editChatParticipantRank.rank = str3 != null ? str3 : "";
                    ConnectionsManager.getInstance(npVar.currentAccount).sendRequest(tL_messages_editChatParticipantRank, null);
                }
                org.telegram.messenger.mp.u1(npVar.currentAccount).Y4(npVar.s, npVar.w, null, npVar.P, npVar.F, npVar.getFragmentForAlert(1), null);
                TLRPC.TL_chatBannedRights tL_chatBannedRights = npVar.P;
                if (tL_chatBannedRights.send_messages || tL_chatBannedRights.send_stickers || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_media || tL_chatBannedRights.send_gifs || tL_chatBannedRights.send_games || tL_chatBannedRights.send_inline) {
                    i10 = 1;
                } else {
                    tL_chatBannedRights.until_date = 0;
                }
                kp kpVar = npVar.Y0;
                if (kpVar != null) {
                    kpVar.b(i10, tL_chatAdminRights, tL_chatBannedRights, npVar.T);
                }
            } else if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(npVar.getParentActivity());
                String M0 = npVar.L ? org.telegram.messenger.gd.M0(2131754460, null) : org.telegram.messenger.gd.M0(2131754461, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                boolean z13 = org.telegram.messenger.v3.T(npVar.x) && !npVar.x.megagroup;
                TLRPC.Chat chat = npVar.x;
                String str4 = chat != null ? chat.title : "";
                u1Var.U = org.telegram.messenger.g0.W2(npVar.L ? z13 ? org.telegram.messenger.gd.a0(null, null, 2131754454, str4) : org.telegram.messenger.gd.a0(null, null, 2131754453, str4) : org.telegram.messenger.gd.a0(null, null, 2131754397, org.telegram.messenger.o10.q(user), str4));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.k(npVar.L ? org.telegram.messenger.gd.M0(2131754464, null) : org.telegram.messenger.gd.M0(2131754461, null), new dp(npVar, r6));
                npVar.showDialog(u1Var);
                r6 = 0;
            }
        }
        if (r6 != 0) {
            npVar.finishFragment();
        }
    }

    public final void y0(boolean z10) {
        this.I = z10;
        this.simpleActionBar.getBackButton().setEnabled(!this.I);
        org.telegram.ui.ActionBar.d5 d5Var = this.h;
        if (d5Var != null) {
            d5Var.b(this.I);
        }
    }

    public final void z0(boolean z10) {
        int i7;
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
                if (org.telegram.messenger.v3.T(this.x)) {
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
        } else if (z12 || (this.T.isEmpty() && !(this.x.creator && org.telegram.messenger.o10.C(user)))) {
            int i32 = this.W;
            this.W = i32 + 1;
            this.s0 = i32;
        } else {
            int i33 = this.W;
            this.p0 = i33;
            this.W = i33 + 2;
            this.w0 = i33 + 1;
            if (this.x.creator && org.telegram.messenger.o10.C(user)) {
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
            if (min == -1 && (i7 = this.t0) != -1) {
                this.a.o(Math.min(i7, this.u0), 2);
            } else {
                if (min == -1 || this.t0 != -1) {
                    return;
                }
                this.a.p(min, 2);
            }
        }
    }
}
