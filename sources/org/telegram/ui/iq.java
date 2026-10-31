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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class iq extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public boolean A0;
    public int B0;
    public int C0;
    public final int D;
    public int D0;
    public final boolean E;
    public int E0;
    public final boolean F;
    public int F0;
    public final boolean G;
    public int G0;
    public boolean H;
    public int H0;
    public final boolean I;
    public int I0;
    public float J;
    public int J0;
    public boolean K;
    public int K0;
    public final boolean L;
    public int L0;
    public final TLRPC.TL_chatAdminRights M;
    public int M0;
    public final TLRPC.TL_chatAdminRights N;
    public int N0;
    public TLRPC.TL_chatBannedRights O;
    public boolean O0;
    public final TLRPC.TL_chatBannedRights P;
    public int P0;
    public boolean Q;
    public int Q0;
    public final String R;
    public int R0;
    public String S;
    public int S0;
    public final String T;
    public boolean T0;
    public final boolean U;
    public int U0;
    public int V;
    public int V0;
    public int W;
    public int W0;
    public int X;
    public fq X0;
    public int Y;
    public final String Y0;
    public int Z;
    public final boolean Z0;
    public hq a;
    public int a0;
    public final boolean a1;
    public ag.b1 b;
    public int b0;
    public ValueAnimator b1;
    public dh.f c;
    public int c0;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public org.telegram.ui.Components.f6 f;
    public int f0;
    public int g0;
    public org.telegram.ui.ActionBar.l5 h;
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
    public iq(long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean z10, boolean z11, String str2) {
        super(null);
        boolean z12;
        boolean z13;
        TLRPC.UserFull a2;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        this.H = false;
        this.J = 0.0f;
        this.K = false;
        this.L = false;
        this.R = "";
        this.Z0 = z11;
        this.s = j11;
        TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(j10));
        this.w = Z1;
        this.D = i10;
        this.I = z10;
        boolean z14 = true;
        boolean z15 = !z10;
        this.T0 = z15;
        this.O0 = z15;
        this.Y0 = str2;
        this.x = getMessagesController().L0(Long.valueOf(this.s));
        this.y = getMessagesController().M0(this.s);
        this.U = Z1 != null && Z1.bot_guard;
        String str3 = str != null ? str : "";
        this.S = str3;
        this.T = str3;
        this.F = org.telegram.messenger.w3.Y(this.x);
        TLRPC.Chat chat2 = this.x;
        if (chat2 != null) {
            this.E = org.telegram.messenger.w3.T(chat2) && !this.x.megagroup;
            this.G = org.telegram.messenger.w3.c0(this.x);
            this.N = this.x.admin_rights;
        }
        if (this.N == null) {
            this.N = s0(i10 != 2 || ((chat = this.x) != null && chat.creator));
        }
        if (i10 == 0 || i10 == 2) {
            if (i10 == 2 && (a2 = getMessagesController().a2(j10)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.E ? a2.bot_broadcast_admin_rights : a2.bot_group_admin_rights;
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
                this.L = false;
                if (i10 == 2) {
                    this.M = s0(false);
                    boolean z16 = this.E;
                    this.K = z16;
                    this.J = z16 ? 1.0f : 0.0f;
                    this.a1 = false;
                } else {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights4 = new TLRPC.TL_chatAdminRights();
                    this.M = tL_chatAdminRights4;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.N;
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
                    this.a1 = false;
                }
            } else {
                this.L = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.M = tL_chatAdminRights6;
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
                this.a1 = z33;
                if (i10 == 2) {
                    boolean z34 = this.E || z33;
                    this.K = z34;
                    this.J = z34 ? 1.0f : 0.0f;
                    this.a1 = false;
                }
            }
            TLRPC.Chat chat3 = this.x;
            if (chat3 != null) {
                this.P = chat3.default_banned_rights;
            }
            if (this.P == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                this.P = tL_chatBannedRights3;
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
            TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.P;
            if (tL_chatBannedRights4.change_info || this.E) {
                z12 = true;
            } else {
                z12 = true;
                this.M.change_info = true;
            }
            if (!tL_chatBannedRights4.pin_messages) {
                this.M.pin_messages = z12;
            }
            z13 = false;
        } else {
            if (i10 == 1) {
                this.P = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = new TLRPC.TL_chatBannedRights();
                    this.P = tL_chatBannedRights5;
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
                this.O = tL_chatBannedRights6;
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
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.O;
                    tL_chatBannedRights7.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights7.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights7.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.P;
                if (tL_chatBannedRights8.view_messages) {
                    this.O.view_messages = true;
                }
                if (tL_chatBannedRights8.send_messages) {
                    this.O.send_messages = true;
                }
                if (tL_chatBannedRights8.send_media) {
                    this.O.send_media = true;
                }
                if (tL_chatBannedRights8.send_stickers) {
                    this.O.send_stickers = true;
                }
                if (tL_chatBannedRights8.send_gifs) {
                    this.O.send_gifs = true;
                }
                if (tL_chatBannedRights8.send_games) {
                    this.O.send_games = true;
                }
                if (tL_chatBannedRights8.send_inline) {
                    this.O.send_inline = true;
                }
                if (tL_chatBannedRights8.embed_links) {
                    this.O.embed_links = true;
                }
                if (tL_chatBannedRights8.send_polls) {
                    this.O.send_polls = true;
                }
                if (tL_chatBannedRights8.invite_users) {
                    this.O.invite_users = true;
                }
                if (tL_chatBannedRights8.change_info) {
                    this.O.change_info = true;
                }
                if (tL_chatBannedRights8.pin_messages) {
                    this.O.pin_messages = true;
                }
                if (tL_chatBannedRights8.edit_rank) {
                    this.O.edit_rank = true;
                }
                if (tL_chatBannedRights8.send_reactions) {
                    this.O.send_reactions = true;
                }
                if (tL_chatBannedRights8.manage_topics) {
                    this.O.manage_topics = true;
                }
                if (tL_chatBannedRights8.send_photos) {
                    this.O.send_photos = true;
                }
                if (tL_chatBannedRights8.send_videos) {
                    this.O.send_videos = true;
                }
                if (tL_chatBannedRights8.send_audios) {
                    this.O.send_audios = true;
                }
                if (tL_chatBannedRights8.send_docs) {
                    this.O.send_docs = true;
                }
                if (tL_chatBannedRights8.send_voices) {
                    this.O.send_voices = true;
                }
                if (tL_chatBannedRights8.send_roundvideos) {
                    this.O.send_roundvideos = true;
                }
                if (tL_chatBannedRights8.send_plain) {
                    this.O.send_plain = true;
                }
                this.R = org.telegram.messenger.w3.D(this.O);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z14 = false;
                }
                this.a1 = z14;
            }
            z13 = false;
        }
        y0(z13);
    }

    public static void Y(iq iqVar, long j10) {
        if (j10 != 0) {
            iqVar.s = j10;
            iqVar.x = org.telegram.messenger.vp.r1(iqVar.currentAccount).L0(Long.valueOf(j10));
            iqVar.v0(true);
        }
    }

    public static void Z(final iq iqVar, l2.f fVar, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        int i10 = 0;
        if (intValue == 0) {
            iqVar.O.until_date = 0;
            iqVar.a.g(iqVar.M0);
        } else if (intValue == 1) {
            iqVar.O.until_date = ConnectionsManager.getInstance(iqVar.currentAccount).getCurrentTime() + 86400;
            iqVar.a.g(iqVar.M0);
        } else if (intValue == 2) {
            iqVar.O.until_date = ConnectionsManager.getInstance(iqVar.currentAccount).getCurrentTime() + 604800;
            iqVar.a.g(iqVar.M0);
        } else if (intValue == 3) {
            iqVar.O.until_date = ConnectionsManager.getInstance(iqVar.currentAccount).getCurrentTime() + 2592000;
            iqVar.a.g(iqVar.M0);
        } else if (intValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(iqVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() { // from class: org.telegram.ui.bq
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i11, int i12, int i13) {
                        final iq iqVar2 = iq.this;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.clear();
                        calendar2.set(i11, i12, i13);
                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                        try {
                            TimePickerDialog timePickerDialog = new TimePickerDialog(iqVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.eq
                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
                                    iq iqVar3 = iq.this;
                                    iqVar3.O.until_date = (i15 * 60) + (i14 * 3600) + time;
                                    iqVar3.a.g(iqVar3.M0);
                                }
                            }, 0, 0, true);
                            timePickerDialog.setButton(-1, org.telegram.messenger.cd.L0(2131745567, null), timePickerDialog);
                            timePickerDialog.setButton(-2, org.telegram.messenger.cd.L0(2131752589, null), new cq());
                            iqVar2.showDialog(timePickerDialog);
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
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
                datePickerDialog.setButton(-1, org.telegram.messenger.cd.L0(2131745567, null), datePickerDialog);
                datePickerDialog.setButton(-2, org.telegram.messenger.cd.L0(2131752589, null), new cq());
                datePickerDialog.setOnShowListener(new dq(i10, datePicker));
                iqVar.showDialog(datePickerDialog);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        ((org.telegram.ui.ActionBar.z2) fVar.b).x0.run();
    }

    public static /* synthetic */ boolean a0(iq iqVar, TLRPC.TL_error tL_error) {
        iqVar.x0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!org.telegram.messenger.w3.T(iqVar.x)) {
            kg.q0 q0Var = new kg.q0(11, iqVar.currentAccount, iqVar.getParentActivity(), iqVar, iqVar.getResourceProvider());
            ArrayList arrayList = new ArrayList();
            arrayList.add(iqVar.w);
            q0Var.C1(iqVar.x, arrayList, null, null, null);
            q0Var.show();
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
    public static void b0(iq iqVar, Context context, View view, int i10) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.Chat chat;
        boolean z13;
        boolean z14;
        boolean z15;
        View m10;
        boolean z16 = iqVar.E;
        TLRPC.User user = iqVar.w;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = iqVar.P;
        int i11 = iqVar.D;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = iqVar.M;
        if (iqVar.I || (iqVar.x.creator && i11 == 0 && i10 == iqVar.e0)) {
            if (i10 == iqVar.z0) {
                if (!(view instanceof org.telegram.ui.Cells.s8) || ((org.telegram.ui.Cells.s8) view).isEnabled()) {
                    iqVar.A0 = !iqVar.A0;
                    iqVar.y0(false);
                    iqVar.a.g(iqVar.z0);
                    if (iqVar.A0) {
                        iqVar.a.o(iqVar.z0 + 1, 10);
                        return;
                    } else {
                        iqVar.a.p(iqVar.z0 + 1, 10);
                        return;
                    }
                }
                return;
            }
            int i12 = iqVar.N0;
            if (i10 == i12) {
                if (!(view instanceof org.telegram.ui.Cells.s8) || ((org.telegram.ui.Cells.s8) view).isEnabled()) {
                    iqVar.O0 = !iqVar.O0;
                    iqVar.y0(false);
                    iqVar.a.g(iqVar.N0);
                    if (iqVar.O0) {
                        iqVar.a.o(iqVar.N0 + 1, 3);
                        return;
                    } else {
                        iqVar.a.p(iqVar.N0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i13 = iqVar.S0;
            if (i10 == i13) {
                if (!(view instanceof org.telegram.ui.Cells.s8) || ((org.telegram.ui.Cells.s8) view).isEnabled()) {
                    iqVar.T0 = !iqVar.T0;
                    iqVar.y0(false);
                    iqVar.a.g(iqVar.S0);
                    if (iqVar.T0) {
                        iqVar.a.o(iqVar.S0 + 1, 3);
                        return;
                    } else {
                        iqVar.a.p(iqVar.S0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            if (i10 == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                iqVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            if (i10 == iqVar.p0) {
                if (i11 == 0) {
                    org.telegram.messenger.vp.r1(iqVar.currentAccount).M4(iqVar.s, iqVar.w, new TLRPC.TL_chatAdminRights(), iqVar.S, iqVar.E, iqVar.getFragmentForAlert(0), iqVar.Z0, false, null, null, null);
                    fq fqVar = iqVar.X0;
                    if (fqVar != null) {
                        fqVar.b(0, tL_chatAdminRights, iqVar.O, iqVar.S);
                    }
                    iqVar.finishFragment();
                    return;
                }
                if (i11 == 1) {
                    iqVar.Q = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    iqVar.O = tL_chatBannedRights3;
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
                    iqVar.v0(true);
                    return;
                }
                return;
            }
            if (i10 == iqVar.t0) {
                iqVar.t0(null, null);
                return;
            }
            if (i10 == iqVar.M0) {
                if (iqVar.getParentActivity() == null) {
                    return;
                }
                l2.f fVar = new l2.f(context, (org.telegram.ui.ActionBar.p6) null);
                ((org.telegram.ui.ActionBar.z2) fVar.b).u0 = false;
                LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
                org.telegram.ui.Cells.p4 p4Var = new org.telegram.ui.Cells.p4(context, org.telegram.ui.ActionBar.t6.n5, 23, 15, false, null);
                p4Var.setHeight(47);
                p4Var.setText(org.telegram.messenger.cd.L0(2131743740, null));
                f7.addView(p4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                int i14 = -1;
                f7.addView(linearLayout, w7.b6.o(-1, -2));
                org.telegram.ui.ActionBar.s2[] s2VarArr = new org.telegram.ui.ActionBar.s2[5];
                int i15 = 0;
                for (int i16 = 5; i15 < i16; i16 = 5) {
                    org.telegram.ui.ActionBar.s2 s2Var = new org.telegram.ui.ActionBar.s2(0, context, null);
                    s2VarArr[i15] = s2Var;
                    s2Var.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
                    s2VarArr[i15].setTag(Integer.valueOf(i15));
                    s2VarArr[i15].setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(false));
                    s2VarArr[i15].a(i15 != 0 ? i15 != 1 ? i15 != 2 ? i15 != 3 ? org.telegram.messenger.cd.L0(2131743741, null) : org.telegram.messenger.cd.G(1, "Months", new Object[0]) : org.telegram.messenger.cd.G(1, "Weeks", new Object[0]) : org.telegram.messenger.cd.G(1, "Days", new Object[0]) : org.telegram.messenger.cd.L0(2131743710, null), 0, null, false);
                    linearLayout.addView(s2VarArr[i15], w7.b6.o(i14, -2));
                    s2VarArr[i15].setOnClickListener(new ud(8, iqVar, fVar));
                    i15++;
                    i14 = -1;
                }
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) fVar.b;
                z2Var.N = f7;
                iqVar.showDialog(z2Var);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.c2) {
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                int i17 = iqVar.P0;
                if (i10 == i17 || i10 == iqVar.Q0 || i10 == iqVar.R0) {
                    if (i10 == i17) {
                        z13 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z13;
                    } else if (i10 == iqVar.Q0) {
                        z13 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z13;
                    } else {
                        z13 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z13;
                    }
                    iqVar.a.g(i12);
                    c2Var.c(z13, true);
                    return;
                }
                int i18 = iqVar.U0;
                if (i10 == i18 || i10 == iqVar.V0 || i10 == iqVar.W0) {
                    if (i10 == i18) {
                        z14 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z14;
                    } else if (i10 == iqVar.V0) {
                        z14 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z14;
                    } else {
                        z14 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z14;
                    }
                    iqVar.a.g(i13);
                    c2Var.c(z14, true);
                    return;
                }
                if (i11 != 1 || iqVar.O == null) {
                    return;
                }
                c2Var.b();
                if (c2Var.r.b != null) {
                    if (i11 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iqVar.getParentActivity());
                        String L0 = org.telegram.messenger.cd.L0(2131743745, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                        x1Var.R = L0;
                        x1Var.T = org.telegram.messenger.cd.L0(2131743744, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var.show();
                        return;
                    }
                    return;
                }
                if (i10 == iqVar.B0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = iqVar.O;
                    z15 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z15;
                } else if (i10 == iqVar.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = iqVar.O;
                    z15 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z15;
                } else if (i10 == iqVar.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = iqVar.O;
                    z15 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z15;
                } else if (i10 == iqVar.j0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = iqVar.O;
                    z15 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z15;
                } else if (i10 == iqVar.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = iqVar.O;
                    z15 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z15;
                } else if (i10 == iqVar.G0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = iqVar.O;
                    z15 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z15;
                } else if (i10 == iqVar.F0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = iqVar.O;
                    z15 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z15;
                } else if (i10 == iqVar.H0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = iqVar.O;
                    z15 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z15;
                    tL_chatBannedRights11.send_gifs = z15;
                    tL_chatBannedRights11.send_games = z15;
                    tL_chatBannedRights11.send_stickers = z15;
                } else if (i10 == iqVar.J0) {
                    if ((iqVar.O.send_plain || tL_chatBannedRights2.send_plain) && (m10 = iqVar.c.m(iqVar.y0)) != null) {
                        org.telegram.messenger.i0.G3(m10);
                        org.telegram.messenger.t2.D.a();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = iqVar.O;
                        z15 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z15;
                    }
                } else if (i10 == iqVar.I0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = iqVar.O;
                    z15 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z15;
                } else {
                    z15 = false;
                }
                iqVar.a.g(iqVar.z0);
                c2Var.c(!z15, true);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.s8) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                Switch r12 = s8Var.d;
                if (r12.F != null) {
                    if (i11 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(iqVar.getParentActivity());
                        String L02 = org.telegram.messenger.cd.L0(2131743745, null);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
                        x1Var2.R = L02;
                        x1Var2.T = org.telegram.messenger.cd.L0(2131743744, null);
                        alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var2.show();
                        return;
                    }
                    return;
                }
                if (!s8Var.isEnabled()) {
                    if (i11 == 2 || i11 == 0) {
                        if ((i10 != iqVar.X || tL_chatBannedRights2 == null || tL_chatBannedRights2.change_info) && ((i10 != iqVar.h0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.pin_messages) && (i10 != iqVar.i0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(iqVar.getParentActivity());
                        String L03 = org.telegram.messenger.cd.L0(2131743745, null);
                        org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder3.a;
                        x1Var3.R = L03;
                        x1Var3.T = org.telegram.messenger.cd.L0(2131743743, null);
                        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                        x1Var3.show();
                        return;
                    }
                    return;
                }
                if (i11 != 2 && i10 != iqVar.k0) {
                    s8Var.setChecked(!r12.h);
                }
                boolean z17 = r12.h;
                if (i10 == iqVar.W) {
                    z17 = !iqVar.K;
                    iqVar.K = z17;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = iqVar.N;
                    FrameLayout frameLayout = iqVar.e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = iqVar.b.getChildCount();
                    for (int i19 = 0; i19 < childCount; i19++) {
                        View childAt = iqVar.b.getChildAt(i19);
                        iqVar.b.getClass();
                        int R = RecyclerView.R(childAt);
                        if (childAt instanceof org.telegram.ui.Cells.s8) {
                            boolean z18 = iqVar.K;
                            if (z18) {
                                if (R == iqVar.W) {
                                    z12 = tL_chatAdminRights2.add_admins || ((chat = iqVar.x) != null && chat.creator);
                                    z11 = z18;
                                } else if (R == iqVar.X) {
                                    z11 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info) {
                                    }
                                    z12 = false;
                                } else if (R == iqVar.Y) {
                                    z11 = tL_chatAdminRights.post_messages;
                                    z12 = tL_chatAdminRights2.post_messages;
                                } else if (R == iqVar.Z) {
                                    z11 = tL_chatAdminRights.manage_direct_messages;
                                    z12 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (R == iqVar.a0) {
                                    z11 = tL_chatAdminRights.manage_welcome_messages;
                                    z12 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (R == iqVar.b0) {
                                    z11 = tL_chatAdminRights.edit_messages;
                                    z12 = tL_chatAdminRights2.edit_messages;
                                } else if (R == iqVar.c0) {
                                    z11 = tL_chatAdminRights.delete_messages;
                                    z12 = tL_chatAdminRights2.delete_messages;
                                } else if (R == iqVar.f0) {
                                    z11 = tL_chatAdminRights.ban_users;
                                    z12 = tL_chatAdminRights2.ban_users;
                                } else if (R == iqVar.g0) {
                                    z11 = tL_chatAdminRights.invite_users;
                                    z12 = tL_chatAdminRights2.invite_users;
                                } else if (R == iqVar.h0) {
                                    z11 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages) {
                                    }
                                    z12 = false;
                                } else if (R == iqVar.i0) {
                                    z11 = tL_chatAdminRights.manage_ranks;
                                    z12 = tL_chatAdminRights2.manage_ranks;
                                } else if (R == iqVar.K0) {
                                    z11 = tL_chatAdminRights.manage_call;
                                    z12 = tL_chatAdminRights2.manage_call;
                                } else if (R == iqVar.d0) {
                                    z11 = tL_chatAdminRights.add_admins;
                                    z12 = tL_chatAdminRights2.add_admins;
                                } else {
                                    if (R == iqVar.e0) {
                                        z11 = tL_chatAdminRights.anonymous;
                                        if (!tL_chatAdminRights2.anonymous) {
                                            TLRPC.Chat chat2 = iqVar.x;
                                            if (chat2 != null) {
                                            }
                                        }
                                        z12 = true;
                                    } else if (R == iqVar.m0) {
                                        z11 = tL_chatAdminRights.manage_topics;
                                        z12 = tL_chatAdminRights2.manage_topics;
                                    } else if (R == iqVar.n0) {
                                        z11 = tL_chatAdminRights.manage_linked_peers;
                                        z12 = tL_chatAdminRights2.manage_linked_peers;
                                    } else {
                                        z11 = false;
                                    }
                                    z12 = false;
                                }
                                org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) childAt;
                                s8Var2.setChecked(z11);
                                s8Var2.b(z12, true);
                            } else if ((R != iqVar.X || tL_chatBannedRights2.change_info) && ((R != iqVar.h0 || tL_chatBannedRights2.pin_messages) && (R != iqVar.i0 || tL_chatBannedRights2.edit_rank))) {
                                org.telegram.ui.Cells.s8 s8Var3 = (org.telegram.ui.Cells.s8) childAt;
                                s8Var3.setChecked(false);
                                s8Var3.b(R == iqVar.W, true);
                            } else {
                                org.telegram.ui.Cells.s8 s8Var4 = (org.telegram.ui.Cells.s8) childAt;
                                s8Var4.setChecked(true);
                                s8Var4.b(false, false);
                            }
                        }
                    }
                    iqVar.a.f();
                    org.telegram.ui.Components.f6 f6Var = iqVar.f;
                    if (f6Var != null) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.z20.q(null, 2131754459, sb2, " ");
                        sb2.append(org.telegram.messenger.cd.L0(iqVar.K ? 2131754458 : 2131754457, null));
                        f6Var.c(sb2.toString(), true, iqVar.K);
                    }
                    ValueAnimator valueAnimator = iqVar.b1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        iqVar.b1 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(iqVar.J, iqVar.K ? 1.0f : 0.0f);
                    iqVar.b1 = ofFloat;
                    ofFloat.addUpdateListener(new a3(iqVar, 6));
                    iqVar.b1.setDuration((long) (Math.abs(iqVar.J - (iqVar.K ? 1.0f : 0.0f)) * 200.0f));
                    iqVar.b1.start();
                } else if (i10 == iqVar.X) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.change_info;
                        tL_chatAdminRights.change_info = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights14 = iqVar.O;
                        z17 = !tL_chatBannedRights14.change_info;
                        tL_chatBannedRights14.change_info = z17;
                    }
                } else if (i10 == iqVar.Y) {
                    z17 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z17;
                } else if (i10 == iqVar.k0) {
                    org.telegram.ui.Components.s4.u0(iqVar, org.telegram.messenger.cd.L0(2131754182, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, z17 ? z16 ? 2131754193 : 2131754192 : z16 ? 2131754184 : 2131754183, org.telegram.messenger.o5.u(user))), org.telegram.messenger.cd.L0(!z17 ? 2131754191 : 2131754200, null), false, new zp(iqVar, !z17 ? user.id : 0L, 1));
                } else if (i10 == iqVar.a0) {
                    z17 = !tL_chatAdminRights.manage_welcome_messages;
                    tL_chatAdminRights.manage_welcome_messages = z17;
                } else if (i10 == iqVar.Z) {
                    z17 = !tL_chatAdminRights.manage_direct_messages;
                    tL_chatAdminRights.manage_direct_messages = z17;
                } else if (i10 == iqVar.b0) {
                    z17 = !tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.edit_messages = z17;
                } else if (i10 == iqVar.c0) {
                    z17 = !tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.delete_messages = z17;
                } else if (i10 == iqVar.d0) {
                    z17 = !tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.add_admins = z17;
                } else if (i10 == iqVar.e0) {
                    z17 = !tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.anonymous = z17;
                } else if (i10 == iqVar.f0) {
                    z17 = !tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.ban_users = z17;
                } else if (i10 == iqVar.K0) {
                    z17 = !tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.manage_call = z17;
                } else if (i10 == iqVar.m0) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.manage_topics;
                        tL_chatAdminRights.manage_topics = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = iqVar.O;
                        z17 = !tL_chatBannedRights15.manage_topics;
                        tL_chatBannedRights15.manage_topics = z17;
                    }
                } else if (i10 == iqVar.n0) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.manage_linked_peers;
                        tL_chatAdminRights.manage_linked_peers = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = iqVar.O;
                        z17 = !tL_chatBannedRights16.manage_linked_peers;
                        tL_chatBannedRights16.manage_linked_peers = z17;
                    }
                } else if (i10 == iqVar.g0) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.invite_users;
                        tL_chatAdminRights.invite_users = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = iqVar.O;
                        z17 = !tL_chatBannedRights17.invite_users;
                        tL_chatBannedRights17.invite_users = z17;
                    }
                } else if (i10 == iqVar.h0) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.pin_messages;
                        tL_chatAdminRights.pin_messages = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = iqVar.O;
                        z17 = !tL_chatBannedRights18.pin_messages;
                        tL_chatBannedRights18.pin_messages = z17;
                    }
                } else if (i10 == iqVar.i0) {
                    if (i11 == 0 || i11 == 2) {
                        z17 = !tL_chatAdminRights.manage_ranks;
                        tL_chatAdminRights.manage_ranks = z17;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights19 = iqVar.O;
                        z17 = !tL_chatBannedRights19.edit_rank;
                        tL_chatBannedRights19.edit_rank = z17;
                    }
                } else if (i11 == 1 && (tL_chatBannedRights = iqVar.O) != null) {
                    boolean z19 = r12.h;
                    if (i10 == iqVar.y0) {
                        z17 = !tL_chatBannedRights.send_plain;
                        tL_chatBannedRights.send_plain = z17;
                    }
                    if (!z19 || ((tL_chatBannedRights.send_plain && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_inline && tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) || !tL_chatBannedRights.view_messages)) {
                        z10 = false;
                    } else {
                        z10 = false;
                        tL_chatBannedRights.view_messages = false;
                    }
                    int i20 = iqVar.J0;
                    if (i20 >= 0) {
                        iqVar.a.g(i20);
                    }
                    int i21 = iqVar.z0;
                    if (i21 >= 0) {
                        iqVar.a.g(i21);
                    }
                    if (i11 == 2) {
                        s8Var.setChecked((iqVar.K && z17) ? true : z10);
                    }
                    iqVar.y0(true);
                }
                z10 = false;
                if (i11 == 2) {
                }
                iqVar.y0(true);
            }
        }
    }

    public static void c0(iq iqVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i10;
        boolean z10 = iqVar.E;
        TLRPC.User user = iqVar.w;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                iqVar.X0.a(user);
                iqVar.removeSelfFromStack();
                twoStepVerificationActivity.s0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (iqVar.getParentActivity() == null) {
            return;
        }
        int i11 = 5;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iqVar.getParentActivity());
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                if (z10) {
                    x1Var.R = org.telegram.messenger.cd.L0(2131751323, null);
                } else {
                    x1Var.R = org.telegram.messenger.cd.L0(2131751316, null);
                }
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131751294, iqVar.x.title, org.telegram.messenger.h20.j(user, true)));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751297, null), new yp(iqVar, i11));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                iqVar.showDialog(x1Var);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(iqVar.currentAccount).sendRequest(new TL_account.getPassword(), new ag.k0(22, iqVar, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.s0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.Components.s4.g0(tL_error, iqVar, z10, iqVar.F, tL_channels_editCreator);
                return;
            }
            if (iqVar.getParentActivity() == null || org.telegram.messenger.d20.i(org.telegram.messenger.c.a(iqVar.currentAccount).a).q()) {
                iqVar.presentFragment(new ea1(1));
                return;
            } else {
                iqVar.showDialog(new kg.q0(5, iqVar.currentAccount, iqVar.getParentActivity(), iqVar, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.s0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(iqVar.getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131751298, null);
        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.a;
        x1Var2.R = L0;
        LinearLayout linearLayout = new LinearLayout(iqVar.getParentActivity());
        linearLayout.setPadding(org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.o(linearLayout);
        TextView textView = new TextView(iqVar.getParentActivity());
        int i12 = org.telegram.ui.ActionBar.t6.j5;
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        if (z10) {
            org.telegram.messenger.m5.q("EditChannelAdminTransferAlertText", null, 2131751284, new Object[]{org.telegram.messenger.h20.j(user, true)}, textView);
        } else {
            org.telegram.messenger.m5.q("EditAdminTransferAlertText", null, 2131751302, new Object[]{org.telegram.messenger.h20.j(user, true)}, textView);
        }
        linearLayout.addView(textView, w7.b6.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(iqVar.getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(iqVar.getParentActivity());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i12, null, mode);
        TextView textView2 = new TextView(iqVar.getParentActivity());
        org.telegram.ui.ActionBar.a7.V(textView2, i12, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751301, null)));
        if (org.telegram.messenger.cd.X) {
            linearLayout2.addView(textView2, w7.b6.o(-1, -2));
            linearLayout2.addView(imageView, w7.b6.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, w7.b6.o(-2, -2));
            linearLayout2.addView(textView2, w7.b6.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(iqVar.getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(iqVar.getParentActivity());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(11.0f) : 0, org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(11.0f), 0);
        org.telegram.ui.ActionBar.a7.t(imageView2, i12, null, mode);
        TextView textView3 = new TextView(iqVar.getParentActivity());
        org.telegram.ui.ActionBar.a7.V(textView3, i12, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131751300, null)));
        if (org.telegram.messenger.cd.X) {
            linearLayout3.addView(textView3, w7.b6.o(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, w7.b6.r(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, w7.b6.o(-2, -2));
            linearLayout3.addView(textView3, w7.b6.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751292, null), new yp(iqVar, 6));
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(iqVar.getParentActivity());
            org.telegram.ui.ActionBar.a7.V(textView4, i12, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.m5.l(textView4, (org.telegram.messenger.cd.X ? i10 : 3) | 48, null, 2131751299);
            linearLayout.addView(textView4, w7.b6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131747847, null), null);
        }
        iqVar.showDialog(x1Var2);
    }

    public static void d0(iq iqVar, long j10) {
        TLRPC.ChatFull chatFull = iqVar.y;
        long j11 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User Z1 = j11 != 0 ? iqVar.getMessagesController().Z1(Long.valueOf(j11)) : null;
        if (Z1 != null && j10 != 0 && Z1.id != j10) {
            new org.telegram.ui.Components.e30(iqVar.getParentActivity(), iqVar.resourceProvider, Z1, iqVar.w, new zp(iqVar, j10, 0)).show();
            return;
        }
        iqVar.n = j10;
        iqVar.r = true;
        iqVar.r0();
    }

    public static /* synthetic */ void e0(iq iqVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j10) {
        if (j10 != 0) {
            iqVar.s = j10;
            iqVar.x = org.telegram.messenger.vp.r1(iqVar.currentAccount).L0(Long.valueOf(j10));
            iqVar.t0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void j0(iq iqVar, View view) {
        if (view instanceof org.telegram.ui.Cells.p4) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            String str = iqVar.S;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount > 4.8f) {
                p4Var.setText2("");
                return;
            }
            p4Var.setText2(String.format("%d", Integer.valueOf(codePointCount)));
            org.telegram.ui.ActionBar.u5 textView2 = p4Var.getTextView2();
            int i10 = codePointCount < 0 ? org.telegram.ui.ActionBar.t6.p7 : org.telegram.ui.ActionBar.t6.A6;
            org.telegram.ui.ActionBar.a7.Y(textView2, i10, null);
            textView2.setTag(Integer.valueOf(i10));
        }
    }

    public static boolean p0(iq iqVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = iqVar.P;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public static TLRPC.TL_chatAdminRights s0(boolean z10) {
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

    public static TLRPC.TL_chatAdminRights w0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
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

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.D5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d6));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        int i10 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i11 = this.D;
        if (i11 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751333, null));
        } else if (i11 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131754463, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131743753, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 29));
        if (this.I || (!this.E && this.x.creator && org.telegram.messenger.h20.B(this.w))) {
            this.h = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        }
        w7 w7Var = new w7(this, context, i10);
        this.fragmentView = w7Var;
        w7Var.setFocusableInTouchMode(true);
        int i12 = 6;
        ag.b1 b1Var = new ag.b1(this, context, i12);
        this.b = b1Var;
        boolean z10 = false;
        b1Var.setClipChildren(i11 != 2);
        dh.f fVar = new dh.f(i10, z10, 4);
        this.c = fVar;
        fVar.E = 100;
        this.b.setLayoutManager(fVar);
        ag.b1 b1Var2 = this.b;
        hq hqVar = new hq(this, context);
        this.a = hqVar;
        b1Var2.setAdapter(hqVar);
        s4.j jVar = new s4.j();
        if (i11 == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        jVar.m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.b.setItemAnimator(jVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        w7Var.addView(this.b, w7.b6.c(-1.0f, -1));
        this.b.r1();
        this.b.setOnScrollListener(new h3(this, 7));
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new mg.q0(i12, this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.x;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.y = chatFull;
            r0();
            return;
        }
        if (i10 == org.telegram.messenger.zs.y1) {
            if ((-this.s) == ((Long) objArr[0]).longValue()) {
                org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                if (z4Var == null || z4Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(4, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.s8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 262144, new Class[]{org.telegram.ui.Cells.p4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, new Class[]{org.telegram.ui.Cells.x2.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        return q0(z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
        getNotificationCenter().c(this, org.telegram.messenger.zs.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.zs.y1);
        getNotificationCenter().n(this, org.telegram.messenger.zs.T);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        hq hqVar = this.a;
        if (hqVar != null) {
            hqVar.f();
        }
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final boolean q0(boolean z10) {
        int i10 = this.D;
        if (i10 != 2) {
            if (!(i10 == 1 ? this.R.equals(org.telegram.messenger.w3.D(this.O)) : this.T.equals(this.S))) {
                int i11 = 0;
                if (z10) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String L0 = org.telegram.messenger.cd.L0(2131743752, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("UserRestrictionsApplyChangesText", null, 2131743751, org.telegram.messenger.vp.r1(this.currentAccount).L0(Long.valueOf(this.s)).title));
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new yp(this, i11));
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, null), new yp(this, 4));
                    showDialog(x1Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void r0() {
        boolean z10;
        TLRPC.User user;
        int i10 = this.k0;
        if (i10 >= 0) {
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) this.c.m(i10);
            if (s8Var == null) {
                this.a.g(this.k0);
                return;
            }
            TLRPC.ChatFull chatFull = this.y;
            if (chatFull != null && (user = this.w) != null) {
                if ((this.r ? this.n : chatFull.guard_bot_id) == user.id) {
                    z10 = true;
                    s8Var.setChecked(z10);
                }
            }
            z10 = false;
            s8Var.setChecked(z10);
        }
    }

    public final void t0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.w3.T(this.x)) {
            org.telegram.messenger.vp.r1(this.currentAccount).T(getParentActivity(), this.s, this, new a7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (org.telegram.messenger.w3.T(this.x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.x;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = inputCheckPasswordSRP != null ? inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().p1(this.w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new mb(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 2));
    }

    public final boolean u0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
        boolean z10 = tL_chatAdminRights.change_info;
        boolean z11 = this.G;
        if (z10 && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!z11 || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z10 || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((z11 && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        if (r1.codePointCount(0, r1.length()) > 16) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r0.u0() == false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v0(boolean z10) {
        String str;
        iq iqVar = this;
        if (iqVar.H) {
            return;
        }
        boolean T = org.telegram.messenger.w3.T(iqVar.x);
        int i10 = iqVar.D;
        int i11 = 2;
        if (!T) {
            if (i10 != 1) {
                if (i10 == 0) {
                    if (iqVar.u0()) {
                        if (iqVar.v0 != -1) {
                            String str2 = iqVar.S;
                        }
                    }
                }
                if (i10 == 2) {
                    if (iqVar.S == null) {
                    }
                }
            }
            org.telegram.messenger.vp.r1(iqVar.currentAccount).T(iqVar.getParentActivity(), iqVar.s, iqVar, new yp(iqVar, 7), null);
            return;
        }
        boolean z11 = iqVar.F;
        TLRPC.User user = iqVar.w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = iqVar.M;
        if (z10 && z11 && !iqVar.L && tL_chatAdminRights.manage_linked_peers && tL_chatAdminRights.change_info) {
            org.telegram.ui.Components.s4.u0(iqVar, org.telegram.messenger.cd.L0(2131751919, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131751921, org.telegram.messenger.o5.u(user))), org.telegram.messenger.cd.L0(2131751920, null), false, new aq(iqVar, r6));
            return;
        }
        if (iqVar.v0 != -1 && (str = iqVar.S) != null && str.codePointCount(0, str.length()) > 16) {
            iqVar.b.y0(iqVar.v0);
            Vibrator vibrator = (Vibrator) iqVar.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            s4.c1 K = iqVar.b.K(iqVar.v0);
            if (K != null) {
                org.telegram.messenger.i0.E3(K.a);
                return;
            }
            return;
        }
        if (i10 == 0 || i10 == 2) {
            boolean z12 = iqVar.E;
            if (z12) {
                tL_chatAdminRights.pin_messages = false;
                tL_chatAdminRights.manage_ranks = false;
            } else {
                tL_chatAdminRights.edit_messages = false;
                tL_chatAdminRights.post_messages = false;
            }
            if (tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || ((iqVar.G && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || (z12 && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)))) {
                tL_chatAdminRights.other = false;
            } else {
                tL_chatAdminRights.other = true;
            }
        }
        if (i10 == 0) {
            int i12 = iqVar.X0 == null ? 1 : 0;
            iqVar.x0(true);
            org.telegram.messenger.vp.r1(iqVar.currentAccount).M4(iqVar.s, iqVar.w, iqVar.M, iqVar.S, iqVar.E, iqVar, (!iqVar.Z0 || z11) ? 0 : 1, false, null, new aq(iqVar, i11), new yp(iqVar, 8));
            iqVar = iqVar;
            r6 = i12;
        } else {
            if (i10 == 1) {
                if (iqVar.v0 >= 0) {
                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                    tL_messages_editChatParticipantRank.peer = org.telegram.messenger.vp.k1(iqVar.x);
                    tL_messages_editChatParticipantRank.participant = org.telegram.messenger.vp.m1(user);
                    String str3 = iqVar.S;
                    tL_messages_editChatParticipantRank.rank = str3 != null ? str3 : "";
                    ConnectionsManager.getInstance(iqVar.currentAccount).sendRequest(tL_messages_editChatParticipantRank, null);
                }
                org.telegram.messenger.vp.r1(iqVar.currentAccount).J4(iqVar.s, iqVar.w, null, iqVar.O, iqVar.E, iqVar.getFragmentForAlert(1), null);
                TLRPC.TL_chatBannedRights tL_chatBannedRights = iqVar.O;
                if (tL_chatBannedRights.send_messages || tL_chatBannedRights.send_stickers || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_media || tL_chatBannedRights.send_gifs || tL_chatBannedRights.send_games || tL_chatBannedRights.send_inline) {
                    i11 = 1;
                } else {
                    tL_chatBannedRights.until_date = 0;
                }
                fq fqVar = iqVar.X0;
                if (fqVar != null) {
                    fqVar.b(i11, tL_chatAdminRights, tL_chatBannedRights, iqVar.S);
                }
            } else if (i10 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(iqVar.getParentActivity());
                String L0 = iqVar.K ? org.telegram.messenger.cd.L0(2131754462, null) : org.telegram.messenger.cd.L0(2131754463, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                x1Var.R = L0;
                boolean z13 = org.telegram.messenger.w3.T(iqVar.x) && !iqVar.x.megagroup;
                TLRPC.Chat chat = iqVar.x;
                String str4 = chat != null ? chat.title : "";
                x1Var.T = org.telegram.messenger.i0.W2(iqVar.K ? z13 ? org.telegram.messenger.cd.a0(null, null, 2131754456, str4) : org.telegram.messenger.cd.a0(null, null, 2131754455, str4) : org.telegram.messenger.cd.a0(null, null, 2131754399, org.telegram.messenger.h20.p(user), str4));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                alertDialog$Builder.k(iqVar.K ? org.telegram.messenger.cd.L0(2131754466, null) : org.telegram.messenger.cd.L0(2131754463, null), new yp(iqVar, r6));
                iqVar.showDialog(x1Var);
                r6 = 0;
            }
        }
        if (r6 != 0) {
            iqVar.finishFragment();
        }
    }

    public final void x0(boolean z10) {
        this.H = z10;
        this.simpleActionBar.getBackButton().setEnabled(!this.H);
        org.telegram.ui.ActionBar.l5 l5Var = this.h;
        if (l5Var != null) {
            l5Var.b(this.H);
        }
    }

    public final void y0(boolean z10) {
        int i10;
        int min = Math.min(this.s0, this.t0);
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
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.u0 = -1;
        this.v0 = -1;
        this.w0 = -1;
        this.y0 = -1;
        this.z0 = -1;
        this.N0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        this.R0 = -1;
        this.S0 = -1;
        this.U0 = -1;
        this.V0 = -1;
        this.W0 = -1;
        this.B0 = -1;
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
        this.x0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.V = 3;
        boolean z11 = this.F;
        boolean z12 = this.E;
        boolean z13 = this.G;
        int i11 = this.D;
        if (i11 == 0 || i11 == 2) {
            if (z11) {
                this.X = 3;
                this.n0 = 4;
                this.d0 = 5;
                this.V = 7;
                this.f0 = 6;
            } else if (z12) {
                this.X = 3;
                this.V = 5;
                this.N0 = 4;
                if (this.O0) {
                    this.P0 = 5;
                    this.Q0 = 6;
                    this.V = 8;
                    this.R0 = 7;
                }
                int i12 = this.V;
                int i13 = i12 + 1;
                this.V = i13;
                this.S0 = i12;
                if (this.T0) {
                    this.U0 = i13;
                    this.V0 = i12 + 2;
                    this.V = i12 + 4;
                    this.W0 = i12 + 3;
                }
                int i14 = this.V;
                this.Z = i14;
                this.a0 = i14 + 1;
                this.g0 = i14 + 2;
                this.K0 = i14 + 3;
                this.d0 = i14 + 4;
                this.V = i14 + 6;
                this.f0 = i14 + 5;
            } else {
                if (i11 == 2) {
                    this.V = 4;
                    this.W = 3;
                }
                int i15 = this.V;
                this.X = i15;
                this.c0 = i15 + 1;
                this.f0 = i15 + 2;
                this.g0 = i15 + 3;
                int i16 = i15 + 5;
                this.V = i16;
                this.h0 = i15 + 4;
                if (i11 != 2) {
                    this.V = i15 + 6;
                    this.i0 = i16;
                }
                if (org.telegram.messenger.w3.T(this.x)) {
                    int i17 = this.V;
                    int i18 = i17 + 1;
                    this.V = i18;
                    this.S0 = i17;
                    if (this.T0) {
                        this.U0 = i18;
                        this.V0 = i17 + 2;
                        this.V = i17 + 4;
                        this.W0 = i17 + 3;
                    }
                }
                int i19 = this.V;
                this.a0 = i19;
                this.K0 = i19 + 1;
                this.d0 = i19 + 2;
                int i20 = i19 + 4;
                this.V = i20;
                this.e0 = i19 + 3;
                if (z13) {
                    this.V = i19 + 5;
                    this.m0 = i20;
                }
                if (this.U) {
                    int i21 = this.V;
                    this.k0 = i21;
                    this.V = i21 + 2;
                    this.l0 = i21 + 1;
                }
            }
        } else if (i11 == 1) {
            this.y0 = 3;
            this.V = 5;
            this.z0 = 4;
            if (this.A0) {
                this.B0 = 5;
                this.C0 = 6;
                this.E0 = 7;
                this.D0 = 8;
                this.F0 = 9;
                this.G0 = 10;
                this.H0 = 11;
                this.I0 = 12;
                this.J0 = 13;
                this.V = 15;
                this.j0 = 14;
            }
            int i22 = this.V;
            this.g0 = i22;
            this.h0 = i22 + 1;
            this.i0 = i22 + 2;
            int i23 = i22 + 4;
            this.V = i23;
            this.X = i22 + 3;
            if (z13) {
                this.V = i22 + 5;
                this.m0 = i23;
            }
            int i24 = this.V;
            this.L0 = i24;
            this.V = i24 + 2;
            this.M0 = i24 + 1;
        }
        boolean z14 = this.I;
        TLRPC.User user = this.w;
        if (z14) {
            if (!z12 && (i11 == 0 || ((i11 == 2 && this.K) || i11 == 1))) {
                int i25 = this.V;
                this.o0 = i25;
                this.v0 = i25 + 1;
                this.V = i25 + 3;
                this.w0 = i25 + 2;
            }
            TLRPC.Chat chat = this.x;
            if (chat != null && chat.creator && i11 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
                if (!z12 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z13 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z11) {
                        int i26 = this.o0;
                        if (i26 == -1) {
                            int i27 = this.V;
                            this.V = i27 + 1;
                            this.s0 = i27;
                        }
                        int i28 = this.V;
                        int i29 = i28 + 1;
                        this.V = i29;
                        this.t0 = i28;
                        if (i26 != -1) {
                            this.V = i28 + 2;
                            this.s0 = i29;
                        }
                    }
                }
            }
            if (this.a1) {
                if (this.o0 == -1) {
                    int i30 = this.V;
                    this.V = i30 + 1;
                    this.o0 = i30;
                }
                int i31 = this.V;
                this.p0 = i31;
                this.V = i31 + 2;
                this.q0 = i31 + 1;
            }
        } else if (i11 != 0) {
            int i32 = this.V;
            this.V = i32 + 1;
            this.o0 = i32;
        } else if (z12 || (this.S.isEmpty() && !(this.x.creator && org.telegram.messenger.h20.B(user)))) {
            int i33 = this.V;
            this.V = i33 + 1;
            this.r0 = i33;
        } else {
            int i34 = this.V;
            this.o0 = i34;
            this.V = i34 + 2;
            this.v0 = i34 + 1;
            if (this.x.creator && org.telegram.messenger.h20.B(user)) {
                int i35 = this.V;
                this.V = i35 + 1;
                this.w0 = i35;
            } else {
                int i36 = this.V;
                this.V = i36 + 1;
                this.r0 = i36;
            }
        }
        if (i11 == 2) {
            int i37 = this.V;
            this.V = i37 + 1;
            this.x0 = i37;
        }
        if (z10) {
            if (min == -1 && (i10 = this.s0) != -1) {
                this.a.o(Math.min(i10, this.t0), 2);
            } else {
                if (min == -1 || this.s0 != -1) {
                    return;
                }
                this.a.p(min, 2);
            }
        }
    }
}
