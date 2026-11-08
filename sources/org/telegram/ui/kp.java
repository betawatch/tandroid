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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public class kp extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
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
    public hp X0;
    public int Y;
    public final String Y0;
    public int Z;
    public final boolean Z0;
    public jp a;
    public int a0;
    public final boolean a1;
    public bi.q1 b;
    public int b0;
    public ValueAnimator b1;
    public jg.b0 c;
    public int c0;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public org.telegram.ui.Components.j6 f;
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
    public kp(long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i7, boolean z9, boolean z10, String str2) {
        super(null);
        boolean z11;
        boolean z12;
        TLRPC.UserFull b22;
        TLRPC.Chat chat;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
        this.H = false;
        this.J = 0.0f;
        this.K = false;
        this.L = false;
        this.R = "";
        this.Z0 = z10;
        this.s = j10;
        TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(Long.valueOf(j3));
        this.w = a22;
        this.D = i7;
        this.I = z9;
        boolean z13 = true;
        boolean z14 = !z9;
        this.T0 = z14;
        this.O0 = z14;
        this.Y0 = str2;
        this.x = getMessagesController().M0(Long.valueOf(this.s));
        this.y = getMessagesController().N0(this.s);
        this.U = a22 != null && a22.bot_guard;
        String str3 = str != null ? str : "";
        this.S = str3;
        this.T = str3;
        this.F = org.telegram.messenger.t3.Y(this.x);
        TLRPC.Chat chat2 = this.x;
        if (chat2 != null) {
            this.E = org.telegram.messenger.t3.T(chat2) && !this.x.megagroup;
            this.G = org.telegram.messenger.t3.c0(this.x);
            this.N = this.x.admin_rights;
        }
        if (this.N == null) {
            this.N = t0(i7 != 2 || ((chat = this.x) != null && chat.creator));
        }
        if (i7 == 0 || i7 == 2) {
            if (i7 == 2 && (b22 = getMessagesController().b2(j3)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights3 = this.E ? b22.bot_broadcast_admin_rights : b22.bot_group_admin_rights;
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
                if (i7 == 2) {
                    this.M = t0(false);
                    boolean z15 = this.E;
                    this.K = z15;
                    this.J = z15 ? 1.0f : 0.0f;
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
                this.a1 = z32;
                if (i7 == 2) {
                    boolean z33 = this.E || z32;
                    this.K = z33;
                    this.J = z33 ? 1.0f : 0.0f;
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
                z11 = true;
            } else {
                z11 = true;
                this.M.change_info = true;
            }
            if (!tL_chatBannedRights4.pin_messages) {
                this.M.pin_messages = z11;
            }
            z12 = false;
        } else {
            if (i7 == 1) {
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
                this.R = org.telegram.messenger.t3.D(this.O);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z13 = false;
                }
                this.a1 = z13;
            }
            z12 = false;
        }
        z0(z12);
    }

    public static void Z(kp kpVar, long j3) {
        if (j3 != 0) {
            kpVar.s = j3;
            kpVar.x = org.telegram.messenger.qp.s1(kpVar.currentAccount).M0(Long.valueOf(j3));
            kpVar.w0(true);
        }
    }

    public static void a0(final kp kpVar, h9.f1 f1Var, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        int i7 = 0;
        if (intValue == 0) {
            kpVar.O.until_date = 0;
            kpVar.a.g(kpVar.M0);
        } else if (intValue == 1) {
            kpVar.O.until_date = ConnectionsManager.getInstance(kpVar.currentAccount).getCurrentTime() + 86400;
            kpVar.a.g(kpVar.M0);
        } else if (intValue == 2) {
            kpVar.O.until_date = ConnectionsManager.getInstance(kpVar.currentAccount).getCurrentTime() + 604800;
            kpVar.a.g(kpVar.M0);
        } else if (intValue == 3) {
            kpVar.O.until_date = ConnectionsManager.getInstance(kpVar.currentAccount).getCurrentTime() + 2592000;
            kpVar.a.g(kpVar.M0);
        } else if (intValue == 4) {
            Calendar calendar = Calendar.getInstance();
            try {
                DatePickerDialog datePickerDialog = new DatePickerDialog(kpVar.getParentActivity(), new DatePickerDialog.OnDateSetListener() { // from class: org.telegram.ui.dp
                    @Override // android.app.DatePickerDialog.OnDateSetListener
                    public final void onDateSet(DatePicker datePicker, int i10, int i11, int i12) {
                        final kp kpVar2 = kp.this;
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.clear();
                        calendar2.set(i10, i11, i12);
                        final int time = (int) (calendar2.getTime().getTime() / 1000);
                        try {
                            TimePickerDialog timePickerDialog = new TimePickerDialog(kpVar2.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: org.telegram.ui.gp
                                @Override // android.app.TimePickerDialog.OnTimeSetListener
                                public final void onTimeSet(TimePicker timePicker, int i13, int i14) {
                                    kp kpVar3 = kp.this;
                                    kpVar3.O.until_date = (i14 * 60) + (i13 * 3600) + time;
                                    kpVar3.a.g(kpVar3.M0);
                                }
                            }, 0, 0, true);
                            timePickerDialog.setButton(-1, org.telegram.messenger.id.M0(2131745553, null), timePickerDialog);
                            timePickerDialog.setButton(-2, org.telegram.messenger.id.M0(2131752589, null), new ep());
                            kpVar2.showDialog(timePickerDialog);
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
                datePickerDialog.setButton(-1, org.telegram.messenger.id.M0(2131745553, null), datePickerDialog);
                datePickerDialog.setButton(-2, org.telegram.messenger.id.M0(2131752589, null), new ep());
                datePickerDialog.setOnShowListener(new fp(i7, datePicker));
                kpVar.showDialog(datePickerDialog);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        ((org.telegram.ui.ActionBar.v2) f1Var.b).x0.run();
    }

    public static /* synthetic */ boolean b0(kp kpVar, TLRPC.TL_error tL_error) {
        kpVar.y0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!org.telegram.messenger.t3.T(kpVar.x)) {
            ug.i0 i0Var = new ug.i0(11, kpVar.currentAccount, kpVar.getParentActivity(), kpVar, kpVar.getResourceProvider());
            ArrayList arrayList = new ArrayList();
            arrayList.add(kpVar.w);
            i0Var.C1(kpVar.x, arrayList, null, null, null);
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
    public static void c0(kp kpVar, Context context, View view, int i7) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z9;
        boolean z10;
        boolean z11;
        TLRPC.Chat chat;
        boolean z12;
        boolean z13;
        boolean z14;
        View m10;
        boolean z15 = kpVar.E;
        TLRPC.User user = kpVar.w;
        TLRPC.TL_chatBannedRights tL_chatBannedRights2 = kpVar.P;
        int i10 = kpVar.D;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = kpVar.M;
        if (kpVar.I || (kpVar.x.creator && i10 == 0 && i7 == kpVar.e0)) {
            if (i7 == kpVar.z0) {
                if (!(view instanceof org.telegram.ui.Cells.q8) || ((org.telegram.ui.Cells.q8) view).isEnabled()) {
                    kpVar.A0 = !kpVar.A0;
                    kpVar.z0(false);
                    kpVar.a.g(kpVar.z0);
                    if (kpVar.A0) {
                        kpVar.a.o(kpVar.z0 + 1, 10);
                        return;
                    } else {
                        kpVar.a.p(kpVar.z0 + 1, 10);
                        return;
                    }
                }
                return;
            }
            int i11 = kpVar.N0;
            if (i7 == i11) {
                if (!(view instanceof org.telegram.ui.Cells.q8) || ((org.telegram.ui.Cells.q8) view).isEnabled()) {
                    kpVar.O0 = !kpVar.O0;
                    kpVar.z0(false);
                    kpVar.a.g(kpVar.N0);
                    if (kpVar.O0) {
                        kpVar.a.o(kpVar.N0 + 1, 3);
                        return;
                    } else {
                        kpVar.a.p(kpVar.N0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            int i12 = kpVar.S0;
            if (i7 == i12) {
                if (!(view instanceof org.telegram.ui.Cells.q8) || ((org.telegram.ui.Cells.q8) view).isEnabled()) {
                    kpVar.T0 = !kpVar.T0;
                    kpVar.z0(false);
                    kpVar.a.g(kpVar.S0);
                    if (kpVar.T0) {
                        kpVar.a.o(kpVar.S0 + 1, 3);
                        return;
                    } else {
                        kpVar.a.p(kpVar.S0 + 1, 3);
                        return;
                    }
                }
                return;
            }
            if (i7 == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                kpVar.presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            if (i7 == kpVar.p0) {
                if (i10 == 0) {
                    org.telegram.messenger.qp.s1(kpVar.currentAccount).P4(kpVar.s, kpVar.w, new TLRPC.TL_chatAdminRights(), kpVar.S, kpVar.E, kpVar.getFragmentForAlert(0), kpVar.Z0, false, null, null, null);
                    hp hpVar = kpVar.X0;
                    if (hpVar != null) {
                        hpVar.b(0, tL_chatAdminRights, kpVar.O, kpVar.S);
                    }
                    kpVar.finishFragment();
                    return;
                }
                if (i10 == 1) {
                    kpVar.Q = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
                    kpVar.O = tL_chatBannedRights3;
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
                    kpVar.w0(true);
                    return;
                }
                return;
            }
            if (i7 == kpVar.t0) {
                kpVar.u0(null, null);
                return;
            }
            if (i7 == kpVar.M0) {
                if (kpVar.getParentActivity() == null) {
                    return;
                }
                h9.f1 f1Var = new h9.f1(context, (org.telegram.ui.ActionBar.f6) null);
                ((org.telegram.ui.ActionBar.v2) f1Var.b).u0 = false;
                LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
                org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(context, org.telegram.ui.ActionBar.k6.n5, 23, 15, false, null);
                n4Var.setHeight(47);
                n4Var.setText(org.telegram.messenger.id.M0(2131743717, null));
                f10.addView(n4Var);
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                int i13 = -1;
                f10.addView(linearLayout, c8.ha.o(-1, -2));
                org.telegram.ui.ActionBar.o2[] o2VarArr = new org.telegram.ui.ActionBar.o2[5];
                int i14 = 0;
                for (int i15 = 5; i14 < i15; i15 = 5) {
                    org.telegram.ui.ActionBar.o2 o2Var = new org.telegram.ui.ActionBar.o2(0, context, null);
                    o2VarArr[i14] = o2Var;
                    o2Var.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                    o2VarArr[i14].setTag(Integer.valueOf(i14));
                    o2VarArr[i14].setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(false));
                    o2VarArr[i14].a(i14 != 0 ? i14 != 1 ? i14 != 2 ? i14 != 3 ? org.telegram.messenger.id.M0(2131743718, null) : org.telegram.messenger.id.G(1, "Months", new Object[0]) : org.telegram.messenger.id.G(1, "Weeks", new Object[0]) : org.telegram.messenger.id.G(1, "Days", new Object[0]) : org.telegram.messenger.id.M0(2131743687, null), 0, null, false);
                    linearLayout.addView(o2VarArr[i14], c8.ha.o(i13, -2));
                    o2VarArr[i14].setOnClickListener(new org.telegram.ui.ActionBar.l1(16, kpVar, f1Var));
                    i14++;
                    i13 = -1;
                }
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) f1Var.b;
                v2Var.N = f10;
                kpVar.showDialog(v2Var);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.c2) {
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                int i16 = kpVar.P0;
                if (i7 == i16 || i7 == kpVar.Q0 || i7 == kpVar.R0) {
                    if (i7 == i16) {
                        z12 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z12;
                    } else if (i7 == kpVar.Q0) {
                        z12 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z12;
                    } else {
                        z12 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z12;
                    }
                    kpVar.a.g(i11);
                    c2Var.c(z12, true);
                    return;
                }
                int i17 = kpVar.U0;
                if (i7 == i17 || i7 == kpVar.V0 || i7 == kpVar.W0) {
                    if (i7 == i17) {
                        z13 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z13;
                    } else if (i7 == kpVar.V0) {
                        z13 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z13;
                    } else {
                        z13 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z13;
                    }
                    kpVar.a.g(i12);
                    c2Var.c(z13, true);
                    return;
                }
                if (i10 != 1 || kpVar.O == null) {
                    return;
                }
                c2Var.b();
                if (c2Var.r.b != null) {
                    if (i10 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getParentActivity());
                        String M0 = org.telegram.messenger.id.M0(2131743722, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                        u1Var.R = M0;
                        u1Var.T = org.telegram.messenger.id.M0(2131743721, null);
                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var.show();
                        return;
                    }
                    return;
                }
                if (i7 == kpVar.B0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = kpVar.O;
                    z14 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z14;
                } else if (i7 == kpVar.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = kpVar.O;
                    z14 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z14;
                } else if (i7 == kpVar.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = kpVar.O;
                    z14 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z14;
                } else if (i7 == kpVar.j0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = kpVar.O;
                    z14 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z14;
                } else if (i7 == kpVar.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = kpVar.O;
                    z14 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z14;
                } else if (i7 == kpVar.G0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = kpVar.O;
                    z14 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z14;
                } else if (i7 == kpVar.F0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = kpVar.O;
                    z14 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z14;
                } else if (i7 == kpVar.H0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = kpVar.O;
                    z14 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z14;
                    tL_chatBannedRights11.send_gifs = z14;
                    tL_chatBannedRights11.send_games = z14;
                    tL_chatBannedRights11.send_stickers = z14;
                } else if (i7 == kpVar.J0) {
                    if ((kpVar.O.send_plain || tL_chatBannedRights2.send_plain) && (m10 = kpVar.c.m(kpVar.y0)) != null) {
                        org.telegram.messenger.g0.H3(m10);
                        org.telegram.messenger.p2.D.a();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = kpVar.O;
                        z14 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z14;
                    }
                } else if (i7 == kpVar.I0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = kpVar.O;
                    z14 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z14;
                } else {
                    z14 = false;
                }
                kpVar.a.g(kpVar.z0);
                c2Var.c(!z14, true);
                return;
            }
            if (view instanceof org.telegram.ui.Cells.q8) {
                org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                Switch r12 = q8Var.d;
                if (r12.F != null) {
                    if (i10 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kpVar.getParentActivity());
                        String M02 = org.telegram.messenger.id.M0(2131743722, null);
                        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
                        u1Var2.R = M02;
                        u1Var2.T = org.telegram.messenger.id.M0(2131743721, null);
                        alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var2.show();
                        return;
                    }
                    return;
                }
                if (!q8Var.isEnabled()) {
                    if (i10 == 2 || i10 == 0) {
                        if ((i7 != kpVar.X || tL_chatBannedRights2 == null || tL_chatBannedRights2.change_info) && ((i7 != kpVar.h0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.pin_messages) && (i7 != kpVar.i0 || tL_chatBannedRights2 == null || tL_chatBannedRights2.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(kpVar.getParentActivity());
                        String M03 = org.telegram.messenger.id.M0(2131743722, null);
                        org.telegram.ui.ActionBar.u1 u1Var3 = alertDialog$Builder3.a;
                        u1Var3.R = M03;
                        u1Var3.T = org.telegram.messenger.id.M0(2131743720, null);
                        alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131747832, null), null);
                        u1Var3.show();
                        return;
                    }
                    return;
                }
                if (i10 != 2 && i7 != kpVar.k0) {
                    q8Var.setChecked(!r12.h);
                }
                boolean z16 = r12.h;
                if (i7 == kpVar.W) {
                    z16 = !kpVar.K;
                    kpVar.K = z16;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = kpVar.N;
                    FrameLayout frameLayout = kpVar.e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = kpVar.b.getChildCount();
                    for (int i18 = 0; i18 < childCount; i18++) {
                        View childAt = kpVar.b.getChildAt(i18);
                        kpVar.b.getClass();
                        int R = RecyclerView.R(childAt);
                        if (childAt instanceof org.telegram.ui.Cells.q8) {
                            boolean z17 = kpVar.K;
                            if (z17) {
                                if (R == kpVar.W) {
                                    z11 = tL_chatAdminRights2.add_admins || ((chat = kpVar.x) != null && chat.creator);
                                    z10 = z17;
                                } else if (R == kpVar.X) {
                                    z10 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info) {
                                    }
                                    z11 = false;
                                } else if (R == kpVar.Y) {
                                    z10 = tL_chatAdminRights.post_messages;
                                    z11 = tL_chatAdminRights2.post_messages;
                                } else if (R == kpVar.Z) {
                                    z10 = tL_chatAdminRights.manage_direct_messages;
                                    z11 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (R == kpVar.a0) {
                                    z10 = tL_chatAdminRights.manage_welcome_messages;
                                    z11 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (R == kpVar.b0) {
                                    z10 = tL_chatAdminRights.edit_messages;
                                    z11 = tL_chatAdminRights2.edit_messages;
                                } else if (R == kpVar.c0) {
                                    z10 = tL_chatAdminRights.delete_messages;
                                    z11 = tL_chatAdminRights2.delete_messages;
                                } else if (R == kpVar.f0) {
                                    z10 = tL_chatAdminRights.ban_users;
                                    z11 = tL_chatAdminRights2.ban_users;
                                } else if (R == kpVar.g0) {
                                    z10 = tL_chatAdminRights.invite_users;
                                    z11 = tL_chatAdminRights2.invite_users;
                                } else if (R == kpVar.h0) {
                                    z10 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages) {
                                    }
                                    z11 = false;
                                } else if (R == kpVar.i0) {
                                    z10 = tL_chatAdminRights.manage_ranks;
                                    z11 = tL_chatAdminRights2.manage_ranks;
                                } else if (R == kpVar.K0) {
                                    z10 = tL_chatAdminRights.manage_call;
                                    z11 = tL_chatAdminRights2.manage_call;
                                } else if (R == kpVar.d0) {
                                    z10 = tL_chatAdminRights.add_admins;
                                    z11 = tL_chatAdminRights2.add_admins;
                                } else {
                                    if (R == kpVar.e0) {
                                        z10 = tL_chatAdminRights.anonymous;
                                        if (!tL_chatAdminRights2.anonymous) {
                                            TLRPC.Chat chat2 = kpVar.x;
                                            if (chat2 != null) {
                                            }
                                        }
                                        z11 = true;
                                    } else if (R == kpVar.m0) {
                                        z10 = tL_chatAdminRights.manage_topics;
                                        z11 = tL_chatAdminRights2.manage_topics;
                                    } else if (R == kpVar.n0) {
                                        z10 = tL_chatAdminRights.manage_linked_peers;
                                        z11 = tL_chatAdminRights2.manage_linked_peers;
                                    } else {
                                        z10 = false;
                                    }
                                    z11 = false;
                                }
                                org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) childAt;
                                q8Var2.setChecked(z10);
                                q8Var2.b(z11, true);
                            } else if ((R != kpVar.X || tL_chatBannedRights2.change_info) && ((R != kpVar.h0 || tL_chatBannedRights2.pin_messages) && (R != kpVar.i0 || tL_chatBannedRights2.edit_rank))) {
                                org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) childAt;
                                q8Var3.setChecked(false);
                                q8Var3.b(R == kpVar.W, true);
                            } else {
                                org.telegram.ui.Cells.q8 q8Var4 = (org.telegram.ui.Cells.q8) childAt;
                                q8Var4.setChecked(true);
                                q8Var4.b(false, false);
                            }
                        }
                    }
                    kpVar.a.f();
                    org.telegram.ui.Components.j6 j6Var = kpVar.f;
                    if (j6Var != null) {
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.camera.q.q(null, 2131754459, sb2, " ");
                        sb2.append(org.telegram.messenger.id.M0(kpVar.K ? 2131754458 : 2131754457, null));
                        j6Var.c(sb2.toString(), true, kpVar.K);
                    }
                    ValueAnimator valueAnimator = kpVar.b1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        kpVar.b1 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(kpVar.J, kpVar.K ? 1.0f : 0.0f);
                    kpVar.b1 = ofFloat;
                    ofFloat.addUpdateListener(new a3(kpVar, 6));
                    kpVar.b1.setDuration((long) (Math.abs(kpVar.J - (kpVar.K ? 1.0f : 0.0f)) * 200.0f));
                    kpVar.b1.start();
                } else if (i7 == kpVar.X) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.change_info;
                        tL_chatAdminRights.change_info = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights14 = kpVar.O;
                        z16 = !tL_chatBannedRights14.change_info;
                        tL_chatBannedRights14.change_info = z16;
                    }
                } else if (i7 == kpVar.Y) {
                    z16 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z16;
                } else if (i7 == kpVar.k0) {
                    org.telegram.ui.Components.v4.s0(kpVar, org.telegram.messenger.id.M0(2131754182, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, z16 ? z15 ? 2131754193 : 2131754192 : z15 ? 2131754184 : 2131754183, org.telegram.messenger.m5.u(user))), org.telegram.messenger.id.M0(!z16 ? 2131754191 : 2131754200, null), false, new bp(kpVar, !z16 ? user.id : 0L, 1));
                } else if (i7 == kpVar.a0) {
                    z16 = !tL_chatAdminRights.manage_welcome_messages;
                    tL_chatAdminRights.manage_welcome_messages = z16;
                } else if (i7 == kpVar.Z) {
                    z16 = !tL_chatAdminRights.manage_direct_messages;
                    tL_chatAdminRights.manage_direct_messages = z16;
                } else if (i7 == kpVar.b0) {
                    z16 = !tL_chatAdminRights.edit_messages;
                    tL_chatAdminRights.edit_messages = z16;
                } else if (i7 == kpVar.c0) {
                    z16 = !tL_chatAdminRights.delete_messages;
                    tL_chatAdminRights.delete_messages = z16;
                } else if (i7 == kpVar.d0) {
                    z16 = !tL_chatAdminRights.add_admins;
                    tL_chatAdminRights.add_admins = z16;
                } else if (i7 == kpVar.e0) {
                    z16 = !tL_chatAdminRights.anonymous;
                    tL_chatAdminRights.anonymous = z16;
                } else if (i7 == kpVar.f0) {
                    z16 = !tL_chatAdminRights.ban_users;
                    tL_chatAdminRights.ban_users = z16;
                } else if (i7 == kpVar.K0) {
                    z16 = !tL_chatAdminRights.manage_call;
                    tL_chatAdminRights.manage_call = z16;
                } else if (i7 == kpVar.m0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.manage_topics;
                        tL_chatAdminRights.manage_topics = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights15 = kpVar.O;
                        z16 = !tL_chatBannedRights15.manage_topics;
                        tL_chatBannedRights15.manage_topics = z16;
                    }
                } else if (i7 == kpVar.n0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.manage_linked_peers;
                        tL_chatAdminRights.manage_linked_peers = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights16 = kpVar.O;
                        z16 = !tL_chatBannedRights16.manage_linked_peers;
                        tL_chatBannedRights16.manage_linked_peers = z16;
                    }
                } else if (i7 == kpVar.g0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.invite_users;
                        tL_chatAdminRights.invite_users = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights17 = kpVar.O;
                        z16 = !tL_chatBannedRights17.invite_users;
                        tL_chatBannedRights17.invite_users = z16;
                    }
                } else if (i7 == kpVar.h0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.pin_messages;
                        tL_chatAdminRights.pin_messages = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights18 = kpVar.O;
                        z16 = !tL_chatBannedRights18.pin_messages;
                        tL_chatBannedRights18.pin_messages = z16;
                    }
                } else if (i7 == kpVar.i0) {
                    if (i10 == 0 || i10 == 2) {
                        z16 = !tL_chatAdminRights.manage_ranks;
                        tL_chatAdminRights.manage_ranks = z16;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights19 = kpVar.O;
                        z16 = !tL_chatBannedRights19.edit_rank;
                        tL_chatBannedRights19.edit_rank = z16;
                    }
                } else if (i10 == 1 && (tL_chatBannedRights = kpVar.O) != null) {
                    boolean z18 = r12.h;
                    if (i7 == kpVar.y0) {
                        z16 = !tL_chatBannedRights.send_plain;
                        tL_chatBannedRights.send_plain = z16;
                    }
                    if (!z18 || ((tL_chatBannedRights.send_plain && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_inline && tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) || !tL_chatBannedRights.view_messages)) {
                        z9 = false;
                    } else {
                        z9 = false;
                        tL_chatBannedRights.view_messages = false;
                    }
                    int i19 = kpVar.J0;
                    if (i19 >= 0) {
                        kpVar.a.g(i19);
                    }
                    int i20 = kpVar.z0;
                    if (i20 >= 0) {
                        kpVar.a.g(i20);
                    }
                    if (i10 == 2) {
                        q8Var.setChecked((kpVar.K && z16) ? true : z9);
                    }
                    kpVar.z0(true);
                }
                z9 = false;
                if (i10 == 2) {
                }
                kpVar.z0(true);
            }
        }
    }

    public static void d0(kp kpVar, TLRPC.TL_error tL_error, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i7;
        boolean z9 = kpVar.E;
        TLRPC.User user = kpVar.w;
        if (tL_error == null) {
            if (inputCheckPasswordSRP != null) {
                kpVar.X0.a(user);
                kpVar.removeSelfFromStack();
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (kpVar.getParentActivity() == null) {
            return;
        }
        int i10 = 5;
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            if (inputCheckPasswordSRP == null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getParentActivity());
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                if (z9) {
                    u1Var.R = org.telegram.messenger.id.M0(2131751323, null);
                } else {
                    u1Var.R = org.telegram.messenger.id.M0(2131751316, null);
                }
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131751294, kpVar.x.title, org.telegram.messenger.t10.j(user, true)));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751297, null), new ap(kpVar, i10));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                kpVar.showDialog(u1Var);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(kpVar.currentAccount).sendRequest(new TL_account.getPassword(), new ld(8, kpVar, twoStepVerificationActivity), 8);
                return;
            }
            if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.t0();
                    twoStepVerificationActivity.finishFragment();
                }
                org.telegram.ui.Components.v4.e0(tL_error, kpVar, z9, kpVar.F, tL_channels_editCreator);
                return;
            }
            if (kpVar.getParentActivity() == null || org.telegram.messenger.p10.i(org.telegram.messenger.c.a(kpVar.currentAccount).a).q()) {
                kpVar.presentFragment(new n81(1));
                return;
            } else {
                kpVar.showDialog(new ug.i0(5, kpVar.currentAccount, kpVar.getParentActivity(), kpVar, null));
                return;
            }
        }
        if (twoStepVerificationActivity != null) {
            twoStepVerificationActivity.t0();
        }
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(kpVar.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131751298, null);
        org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder2.a;
        u1Var2.R = M0;
        LinearLayout linearLayout = new LinearLayout(kpVar.getParentActivity());
        linearLayout.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder2.o(linearLayout);
        TextView textView = new TextView(kpVar.getParentActivity());
        int i11 = org.telegram.ui.ActionBar.k6.j5;
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        if (z9) {
            org.telegram.messenger.k5.r("EditChannelAdminTransferAlertText", null, 2131751284, new Object[]{org.telegram.messenger.t10.j(user, true)}, textView);
        } else {
            org.telegram.messenger.k5.r("EditAdminTransferAlertText", null, 2131751302, new Object[]{org.telegram.messenger.t10.j(user, true)}, textView);
        }
        linearLayout.addView(textView, c8.ha.o(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(kpVar.getParentActivity());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(kpVar.getParentActivity());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, mode);
        TextView textView2 = new TextView(kpVar.getParentActivity());
        org.telegram.ui.ActionBar.r6.V(textView2, i11, null);
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751301, null)));
        if (org.telegram.messenger.id.a0) {
            linearLayout2.addView(textView2, c8.ha.o(-1, -2));
            linearLayout2.addView(imageView, c8.ha.r(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, c8.ha.o(-2, -2));
            linearLayout2.addView(textView2, c8.ha.o(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(kpVar.getParentActivity());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(kpVar.getParentActivity());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(11.0f) : 0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(11.0f), 0);
        org.telegram.ui.ActionBar.r6.t(imageView2, i11, null, mode);
        TextView textView3 = new TextView(kpVar.getParentActivity());
        org.telegram.ui.ActionBar.r6.V(textView3, i11, null);
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((org.telegram.messenger.id.a0 ? 5 : 3) | 48);
        textView3.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131751300, null)));
        if (org.telegram.messenger.id.a0) {
            linearLayout3.addView(textView3, c8.ha.o(-1, -2));
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ha.r(-2, -2, 5));
        } else {
            i7 = 5;
            linearLayout3.addView(imageView2, c8.ha.o(-2, -2));
            linearLayout3.addView(textView3, c8.ha.o(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131751292, null), new ap(kpVar, 6));
            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131752589, null), null);
        } else {
            TextView textView4 = new TextView(kpVar.getParentActivity());
            org.telegram.ui.ActionBar.r6.V(textView4, i11, null);
            textView4.setTextSize(1, 16.0f);
            org.telegram.messenger.k5.m(textView4, (org.telegram.messenger.id.a0 ? i7 : 3) | 48, null, 2131751299);
            linearLayout.addView(textView4, c8.ha.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder2.h(org.telegram.messenger.id.M0(2131747832, null), null);
        }
        kpVar.showDialog(u1Var2);
    }

    public static void e0(kp kpVar, long j3) {
        TLRPC.ChatFull chatFull = kpVar.y;
        long j10 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User a22 = j10 != 0 ? kpVar.getMessagesController().a2(Long.valueOf(j10)) : null;
        if (a22 != null && j3 != 0 && a22.id != j3) {
            new org.telegram.ui.Components.m20(kpVar.getParentActivity(), kpVar.resourceProvider, a22, kpVar.w, new bp(kpVar, j3, 0)).show();
            return;
        }
        kpVar.n = j3;
        kpVar.r = true;
        kpVar.s0();
    }

    public static /* synthetic */ void f0(kp kpVar, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j3) {
        if (j3 != 0) {
            kpVar.s = j3;
            kpVar.x = org.telegram.messenger.qp.s1(kpVar.currentAccount).M0(Long.valueOf(j3));
            kpVar.u0(inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public static void k0(kp kpVar, View view) {
        if (view instanceof org.telegram.ui.Cells.n4) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            String str = kpVar.S;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount > 4.8f) {
                n4Var.setText2("");
                return;
            }
            n4Var.setText2(String.format("%d", Integer.valueOf(codePointCount)));
            org.telegram.ui.ActionBar.k5 textView2 = n4Var.getTextView2();
            int i7 = codePointCount < 0 ? org.telegram.ui.ActionBar.k6.p7 : org.telegram.ui.ActionBar.k6.A6;
            org.telegram.ui.ActionBar.r6.Y(textView2, i7, null);
            textView2.setTag(Integer.valueOf(i7));
        }
    }

    public static boolean q0(kp kpVar) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = kpVar.P;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public static TLRPC.TL_chatAdminRights t0(boolean z9) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z9;
        tL_chatAdminRights.manage_ranks = z9;
        tL_chatAdminRights.manage_welcome_messages = z9;
        tL_chatAdminRights.manage_direct_messages = z9;
        tL_chatAdminRights.delete_stories = z9;
        tL_chatAdminRights.edit_stories = z9;
        tL_chatAdminRights.post_stories = z9;
        tL_chatAdminRights.manage_topics = z9;
        tL_chatAdminRights.manage_call = z9;
        tL_chatAdminRights.add_admins = z9;
        tL_chatAdminRights.pin_messages = z9;
        tL_chatAdminRights.invite_users = z9;
        tL_chatAdminRights.ban_users = z9;
        tL_chatAdminRights.delete_messages = z9;
        tL_chatAdminRights.edit_messages = z9;
        tL_chatAdminRights.post_messages = z9;
        tL_chatAdminRights.change_info = z9;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights x0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z9 = true;
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
            z9 = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z9;
        return tL_chatAdminRights3;
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        int i10 = this.D;
        if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131751333, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131754463, null));
        } else {
            this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131743730, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 8));
        if (this.I || (!this.E && this.x.creator && org.telegram.messenger.t10.B(this.w))) {
            this.h = this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        }
        w7 w7Var = new w7(this, context, i7);
        this.fragmentView = w7Var;
        w7Var.setFocusableInTouchMode(true);
        bi.q1 q1Var = new bi.q1(11, context, this);
        this.b = q1Var;
        boolean z9 = false;
        q1Var.setClipChildren(i10 != 2);
        jg.b0 b0Var = new jg.b0(i7, z9, 5);
        this.c = b0Var;
        b0Var.E = 100;
        this.b.setLayoutManager(b0Var);
        bi.q1 q1Var2 = this.b;
        jp jpVar = new jp(this, context);
        this.a = jpVar;
        q1Var2.setAdapter(jpVar);
        v4.k kVar = new v4.k();
        if (i10 == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        kVar.m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.n(350L);
        this.b.setItemAnimator(kVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.id.a0 ? 1 : 2);
        w7Var.addView(this.b, c8.ha.c(-1.0f, -1));
        this.b.r1();
        int i11 = 7;
        this.b.setOnScrollListener(new g3(this, i11));
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new di.p4(i11, this, context));
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.x;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.y = chatFull;
            s0();
            return;
        }
        if (i7 == org.telegram.messenger.qs.y1) {
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

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(4, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.U6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"checkBox"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.V6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 262144, new Class[]{org.telegram.ui.Cells.n4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.oa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, new Class[]{org.telegram.ui.Cells.v2.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.q5));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        return r0(z9);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
        getNotificationCenter().c(this, org.telegram.messenger.qs.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, org.telegram.messenger.qs.y1);
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        jp jpVar = this.a;
        if (jpVar != null) {
            jpVar.f();
        }
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final boolean r0(boolean z9) {
        int i7 = this.D;
        if (i7 != 2) {
            if (!(i7 == 1 ? this.R.equals(org.telegram.messenger.t3.D(this.O)) : this.T.equals(this.S))) {
                int i10 = 0;
                if (z9) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = org.telegram.messenger.id.M0(2131743729, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("UserRestrictionsApplyChangesText", null, 2131743728, org.telegram.messenger.qp.s1(this.currentAccount).M0(Long.valueOf(this.s)).title));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new ap(this, i10));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747581, null), new ap(this, 4));
                    showDialog(u1Var);
                }
                return false;
            }
        }
        return true;
    }

    public final void s0() {
        boolean z9;
        TLRPC.User user;
        int i7 = this.k0;
        if (i7 >= 0) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) this.c.m(i7);
            if (q8Var == null) {
                this.a.g(this.k0);
                return;
            }
            TLRPC.ChatFull chatFull = this.y;
            if (chatFull != null && (user = this.w) != null) {
                if ((this.r ? this.n : chatFull.guard_bot_id) == user.id) {
                    z9 = true;
                    q8Var.setChecked(z9);
                }
            }
            z9 = false;
            q8Var.setChecked(z9);
        }
    }

    public final void u0(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (inputCheckPasswordSRP != null && !org.telegram.messenger.t3.T(this.x)) {
            org.telegram.messenger.qp.s1(this.currentAccount).T(getParentActivity(), this.s, this, new a7(this, inputCheckPasswordSRP, twoStepVerificationActivity, 10), null);
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
        getConnectionsManager().sendRequest(tL_channels_editCreator, new bi.g2(this, inputCheckPasswordSRP, twoStepVerificationActivity, tL_channels_editCreator, 11));
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
        boolean z9 = tL_chatAdminRights.change_info;
        boolean z10 = this.G;
        if (z9 && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!z10 || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z9 || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((z10 && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
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
    public final void w0(boolean z9) {
        String str;
        kp kpVar = this;
        if (kpVar.H) {
            return;
        }
        boolean T = org.telegram.messenger.t3.T(kpVar.x);
        int i7 = kpVar.D;
        int i10 = 2;
        if (!T) {
            if (i7 != 1) {
                if (i7 == 0) {
                    if (kpVar.v0()) {
                        if (kpVar.v0 != -1) {
                            String str2 = kpVar.S;
                        }
                    }
                }
                if (i7 == 2) {
                    if (kpVar.S == null) {
                    }
                }
            }
            org.telegram.messenger.qp.s1(kpVar.currentAccount).T(kpVar.getParentActivity(), kpVar.s, kpVar, new ap(kpVar, 7), null);
            return;
        }
        boolean z10 = kpVar.F;
        TLRPC.User user = kpVar.w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = kpVar.M;
        if (z9 && z10 && !kpVar.L && tL_chatAdminRights.manage_linked_peers && tL_chatAdminRights.change_info) {
            org.telegram.ui.Components.v4.s0(kpVar, org.telegram.messenger.id.M0(2131751919, null), org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131751921, org.telegram.messenger.m5.u(user))), org.telegram.messenger.id.M0(2131751920, null), false, new cp(kpVar, r6));
            return;
        }
        if (kpVar.v0 != -1 && (str = kpVar.S) != null && str.codePointCount(0, str.length()) > 16) {
            kpVar.b.y0(kpVar.v0);
            Vibrator vibrator = (Vibrator) kpVar.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            v4.d1 K = kpVar.b.K(kpVar.v0);
            if (K != null) {
                org.telegram.messenger.g0.F3(K.a);
                return;
            }
            return;
        }
        if (i7 == 0 || i7 == 2) {
            boolean z11 = kpVar.E;
            if (z11) {
                tL_chatAdminRights.pin_messages = false;
                tL_chatAdminRights.manage_ranks = false;
            } else {
                tL_chatAdminRights.edit_messages = false;
                tL_chatAdminRights.post_messages = false;
            }
            if (tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || ((kpVar.G && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || (z11 && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)))) {
                tL_chatAdminRights.other = false;
            } else {
                tL_chatAdminRights.other = true;
            }
        }
        if (i7 == 0) {
            int i11 = kpVar.X0 == null ? 1 : 0;
            kpVar.y0(true);
            org.telegram.messenger.qp.s1(kpVar.currentAccount).P4(kpVar.s, kpVar.w, kpVar.M, kpVar.S, kpVar.E, kpVar, (!kpVar.Z0 || z10) ? 0 : 1, false, null, new cp(kpVar, i10), new ap(kpVar, 8));
            kpVar = kpVar;
            r6 = i11;
        } else {
            if (i7 == 1) {
                if (kpVar.v0 >= 0) {
                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                    tL_messages_editChatParticipantRank.peer = org.telegram.messenger.qp.l1(kpVar.x);
                    tL_messages_editChatParticipantRank.participant = org.telegram.messenger.qp.n1(user);
                    String str3 = kpVar.S;
                    tL_messages_editChatParticipantRank.rank = str3 != null ? str3 : "";
                    ConnectionsManager.getInstance(kpVar.currentAccount).sendRequest(tL_messages_editChatParticipantRank, null);
                }
                org.telegram.messenger.qp.s1(kpVar.currentAccount).M4(kpVar.s, kpVar.w, null, kpVar.O, kpVar.E, kpVar.getFragmentForAlert(1), null);
                TLRPC.TL_chatBannedRights tL_chatBannedRights = kpVar.O;
                if (tL_chatBannedRights.send_messages || tL_chatBannedRights.send_stickers || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_media || tL_chatBannedRights.send_gifs || tL_chatBannedRights.send_games || tL_chatBannedRights.send_inline) {
                    i10 = 1;
                } else {
                    tL_chatBannedRights.until_date = 0;
                }
                hp hpVar = kpVar.X0;
                if (hpVar != null) {
                    hpVar.b(i10, tL_chatAdminRights, tL_chatBannedRights, kpVar.S);
                }
            } else if (i7 == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kpVar.getParentActivity());
                String M0 = kpVar.K ? org.telegram.messenger.id.M0(2131754462, null) : org.telegram.messenger.id.M0(2131754463, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                boolean z12 = org.telegram.messenger.t3.T(kpVar.x) && !kpVar.x.megagroup;
                TLRPC.Chat chat = kpVar.x;
                String str4 = chat != null ? chat.title : "";
                u1Var.T = org.telegram.messenger.g0.X2(kpVar.K ? z12 ? org.telegram.messenger.id.a0(null, null, 2131754456, str4) : org.telegram.messenger.id.a0(null, null, 2131754455, str4) : org.telegram.messenger.id.a0(null, null, 2131754399, org.telegram.messenger.t10.p(user), str4));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.k(kpVar.K ? org.telegram.messenger.id.M0(2131754466, null) : org.telegram.messenger.id.M0(2131754463, null), new ap(kpVar, r6));
                kpVar.showDialog(u1Var);
                r6 = 0;
            }
        }
        if (r6 != 0) {
            kpVar.finishFragment();
        }
    }

    public final void y0(boolean z9) {
        this.H = z9;
        this.simpleActionBar.getBackButton().setEnabled(!this.H);
        org.telegram.ui.ActionBar.b5 b5Var = this.h;
        if (b5Var != null) {
            b5Var.b(this.H);
        }
    }

    public final void z0(boolean z9) {
        int i7;
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
        boolean z10 = this.F;
        boolean z11 = this.E;
        boolean z12 = this.G;
        int i10 = this.D;
        if (i10 == 0 || i10 == 2) {
            if (z10) {
                this.X = 3;
                this.n0 = 4;
                this.d0 = 5;
                this.V = 7;
                this.f0 = 6;
            } else if (z11) {
                this.X = 3;
                this.V = 5;
                this.N0 = 4;
                if (this.O0) {
                    this.P0 = 5;
                    this.Q0 = 6;
                    this.V = 8;
                    this.R0 = 7;
                }
                int i11 = this.V;
                int i12 = i11 + 1;
                this.V = i12;
                this.S0 = i11;
                if (this.T0) {
                    this.U0 = i12;
                    this.V0 = i11 + 2;
                    this.V = i11 + 4;
                    this.W0 = i11 + 3;
                }
                int i13 = this.V;
                this.Z = i13;
                this.a0 = i13 + 1;
                this.g0 = i13 + 2;
                this.K0 = i13 + 3;
                this.d0 = i13 + 4;
                this.V = i13 + 6;
                this.f0 = i13 + 5;
            } else {
                if (i10 == 2) {
                    this.V = 4;
                    this.W = 3;
                }
                int i14 = this.V;
                this.X = i14;
                this.c0 = i14 + 1;
                this.f0 = i14 + 2;
                this.g0 = i14 + 3;
                int i15 = i14 + 5;
                this.V = i15;
                this.h0 = i14 + 4;
                if (i10 != 2) {
                    this.V = i14 + 6;
                    this.i0 = i15;
                }
                if (org.telegram.messenger.t3.T(this.x)) {
                    int i16 = this.V;
                    int i17 = i16 + 1;
                    this.V = i17;
                    this.S0 = i16;
                    if (this.T0) {
                        this.U0 = i17;
                        this.V0 = i16 + 2;
                        this.V = i16 + 4;
                        this.W0 = i16 + 3;
                    }
                }
                int i18 = this.V;
                this.a0 = i18;
                this.K0 = i18 + 1;
                this.d0 = i18 + 2;
                int i19 = i18 + 4;
                this.V = i19;
                this.e0 = i18 + 3;
                if (z12) {
                    this.V = i18 + 5;
                    this.m0 = i19;
                }
                if (this.U) {
                    int i20 = this.V;
                    this.k0 = i20;
                    this.V = i20 + 2;
                    this.l0 = i20 + 1;
                }
            }
        } else if (i10 == 1) {
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
            int i21 = this.V;
            this.g0 = i21;
            this.h0 = i21 + 1;
            this.i0 = i21 + 2;
            int i22 = i21 + 4;
            this.V = i22;
            this.X = i21 + 3;
            if (z12) {
                this.V = i21 + 5;
                this.m0 = i22;
            }
            int i23 = this.V;
            this.L0 = i23;
            this.V = i23 + 2;
            this.M0 = i23 + 1;
        }
        boolean z13 = this.I;
        TLRPC.User user = this.w;
        if (z13) {
            if (!z11 && (i10 == 0 || ((i10 == 2 && this.K) || i10 == 1))) {
                int i24 = this.V;
                this.o0 = i24;
                this.v0 = i24 + 1;
                this.V = i24 + 3;
                this.w0 = i24 + 2;
            }
            TLRPC.Chat chat = this.x;
            if (chat != null && chat.creator && i10 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.M;
                if (!z11 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z12 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z10) {
                        int i25 = this.o0;
                        if (i25 == -1) {
                            int i26 = this.V;
                            this.V = i26 + 1;
                            this.s0 = i26;
                        }
                        int i27 = this.V;
                        int i28 = i27 + 1;
                        this.V = i28;
                        this.t0 = i27;
                        if (i25 != -1) {
                            this.V = i27 + 2;
                            this.s0 = i28;
                        }
                    }
                }
            }
            if (this.a1) {
                if (this.o0 == -1) {
                    int i29 = this.V;
                    this.V = i29 + 1;
                    this.o0 = i29;
                }
                int i30 = this.V;
                this.p0 = i30;
                this.V = i30 + 2;
                this.q0 = i30 + 1;
            }
        } else if (i10 != 0) {
            int i31 = this.V;
            this.V = i31 + 1;
            this.o0 = i31;
        } else if (z11 || (this.S.isEmpty() && !(this.x.creator && org.telegram.messenger.t10.B(user)))) {
            int i32 = this.V;
            this.V = i32 + 1;
            this.r0 = i32;
        } else {
            int i33 = this.V;
            this.o0 = i33;
            this.V = i33 + 2;
            this.v0 = i33 + 1;
            if (this.x.creator && org.telegram.messenger.t10.B(user)) {
                int i34 = this.V;
                this.V = i34 + 1;
                this.w0 = i34;
            } else {
                int i35 = this.V;
                this.V = i35 + 1;
                this.r0 = i35;
            }
        }
        if (i10 == 2) {
            int i36 = this.V;
            this.V = i36 + 1;
            this.x0 = i36;
        }
        if (z9) {
            if (min == -1 && (i7 = this.s0) != -1) {
                this.a.o(Math.min(i7, this.t0), 2);
            } else {
                if (min == -1 || this.s0 != -1) {
                    return;
                }
                this.a.p(min, 2);
            }
        }
    }
}
