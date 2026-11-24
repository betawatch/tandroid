// default package

import android.animation.ValueAnimator;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ke2 extends d implements jm7 {
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
    public he2 Y0;
    public int Z;
    public final String Z0;
    public je2 a;
    public int a0;
    public final boolean a1;
    public fv b;
    public int b0;
    public final boolean b1;
    public zs c;
    public int c0;
    public ValueAnimator c1;
    public FrameLayout d;
    public int d0;
    public FrameLayout e;
    public int e0;
    public io f;
    public int f0;
    public int g0;
    public uja h;
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
    public ke2(long j, long j2, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i, boolean z, boolean z2, String str2) {
        super(null);
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        boolean z3;
        boolean z4;
        TLRPC.UserFull X1;
        TLRPC.TL_chatBannedRights tL_chatBannedRights3;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = tL_chatAdminRights;
        this.I = false;
        this.K = 0.0f;
        this.L = false;
        this.M = false;
        this.S = "";
        this.a1 = z2;
        this.s = j2;
        TLRPC.User W1 = oc7.r1(this.currentAccount).W1(Long.valueOf(j));
        this.w = W1;
        this.E = i;
        this.J = z;
        boolean z5 = true;
        boolean z6 = !z;
        this.U0 = z6;
        this.P0 = z6;
        this.Z0 = str2;
        this.x = getMessagesController().L0(Long.valueOf(this.s));
        this.y = getMessagesController().M0(this.s);
        this.V = W1 != null && W1.bot_guard;
        String str3 = str != null ? str : "";
        this.T = str3;
        this.U = str3;
        this.G = sd2.Y(this.x);
        TLRPC.Chat chat = this.x;
        if (chat != null) {
            this.F = sd2.T(chat) && !this.x.megagroup;
            this.H = sd2.c0(this.x);
            chat = this.x;
            this.O = chat.admin_rights;
        }
        if (this.O == null) {
            this.O = e0(i != 2 || (chat != null && chat.creator));
        }
        if (i == 0 || i == 2) {
            if (i == 2 && (X1 = getMessagesController().X1(j)) != null) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights4 = this.F ? X1.bot_broadcast_admin_rights : X1.bot_group_admin_rights;
                if (tL_chatAdminRights4 != null) {
                    if (tL_chatAdminRights3 == null) {
                        tL_chatAdminRights3 = tL_chatAdminRights4;
                    } else {
                        tL_chatAdminRights3.ban_users = tL_chatAdminRights3.ban_users || tL_chatAdminRights4.ban_users;
                        tL_chatAdminRights3.add_admins = tL_chatAdminRights3.add_admins || tL_chatAdminRights4.add_admins;
                        tL_chatAdminRights3.post_messages = tL_chatAdminRights3.post_messages || tL_chatAdminRights4.post_messages;
                        tL_chatAdminRights3.pin_messages = tL_chatAdminRights3.pin_messages || tL_chatAdminRights4.pin_messages;
                        tL_chatAdminRights3.manage_ranks = tL_chatAdminRights3.manage_ranks || tL_chatAdminRights4.manage_ranks;
                        tL_chatAdminRights3.delete_messages = tL_chatAdminRights3.delete_messages || tL_chatAdminRights4.delete_messages;
                        tL_chatAdminRights3.change_info = tL_chatAdminRights3.change_info || tL_chatAdminRights4.change_info;
                        tL_chatAdminRights3.anonymous = tL_chatAdminRights3.anonymous || tL_chatAdminRights4.anonymous;
                        tL_chatAdminRights3.edit_messages = tL_chatAdminRights3.edit_messages || tL_chatAdminRights4.edit_messages;
                        tL_chatAdminRights3.manage_call = tL_chatAdminRights3.manage_call || tL_chatAdminRights4.manage_call;
                        tL_chatAdminRights3.manage_topics = tL_chatAdminRights3.manage_topics || tL_chatAdminRights4.manage_topics;
                        tL_chatAdminRights3.post_stories = tL_chatAdminRights3.post_stories || tL_chatAdminRights4.post_stories;
                        tL_chatAdminRights3.edit_stories = tL_chatAdminRights3.edit_stories || tL_chatAdminRights4.edit_stories;
                        tL_chatAdminRights3.delete_stories = tL_chatAdminRights3.delete_stories || tL_chatAdminRights4.delete_stories;
                        tL_chatAdminRights3.manage_direct_messages = tL_chatAdminRights3.manage_direct_messages || tL_chatAdminRights4.manage_direct_messages;
                        tL_chatAdminRights3.manage_welcome_messages = tL_chatAdminRights3.manage_welcome_messages || tL_chatAdminRights4.manage_welcome_messages;
                        tL_chatAdminRights3.manage_linked_peers = tL_chatAdminRights3.manage_linked_peers || tL_chatAdminRights4.manage_linked_peers;
                        tL_chatAdminRights3.other = tL_chatAdminRights3.other || tL_chatAdminRights4.other;
                    }
                }
            }
            if (tL_chatAdminRights3 == null) {
                this.M = false;
                if (i == 2) {
                    tL_chatAdminRights2 = e0(false);
                    this.N = tL_chatAdminRights2;
                    boolean z7 = this.F;
                    this.L = z7;
                    this.K = z7 ? 1.0f : 0.0f;
                    this.b1 = false;
                } else {
                    tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                    this.N = tL_chatAdminRights2;
                    TLRPC.TL_chatAdminRights tL_chatAdminRights5 = this.O;
                    tL_chatAdminRights2.change_info = tL_chatAdminRights5.change_info;
                    tL_chatAdminRights2.post_messages = tL_chatAdminRights5.post_messages;
                    tL_chatAdminRights2.edit_messages = tL_chatAdminRights5.edit_messages;
                    tL_chatAdminRights2.delete_messages = tL_chatAdminRights5.delete_messages;
                    tL_chatAdminRights2.manage_call = tL_chatAdminRights5.manage_call;
                    tL_chatAdminRights2.ban_users = tL_chatAdminRights5.ban_users;
                    tL_chatAdminRights2.invite_users = tL_chatAdminRights5.invite_users;
                    tL_chatAdminRights2.pin_messages = tL_chatAdminRights5.pin_messages;
                    tL_chatAdminRights2.manage_ranks = tL_chatAdminRights5.manage_ranks;
                    tL_chatAdminRights2.manage_topics = tL_chatAdminRights5.manage_topics;
                    tL_chatAdminRights2.post_stories = tL_chatAdminRights5.post_stories;
                    tL_chatAdminRights2.edit_stories = tL_chatAdminRights5.edit_stories;
                    tL_chatAdminRights2.delete_stories = tL_chatAdminRights5.delete_stories;
                    tL_chatAdminRights2.manage_direct_messages = tL_chatAdminRights5.manage_direct_messages;
                    tL_chatAdminRights2.manage_welcome_messages = tL_chatAdminRights5.manage_welcome_messages;
                    tL_chatAdminRights2.manage_linked_peers = tL_chatAdminRights5.manage_linked_peers;
                    tL_chatAdminRights2.other = tL_chatAdminRights5.other;
                    this.b1 = false;
                }
            } else {
                this.M = true;
                TLRPC.TL_chatAdminRights tL_chatAdminRights6 = new TLRPC.TL_chatAdminRights();
                this.N = tL_chatAdminRights6;
                boolean z8 = tL_chatAdminRights3.change_info;
                tL_chatAdminRights6.change_info = z8;
                boolean z9 = tL_chatAdminRights3.post_messages;
                tL_chatAdminRights6.post_messages = z9;
                boolean z10 = tL_chatAdminRights3.edit_messages;
                tL_chatAdminRights6.edit_messages = z10;
                boolean z11 = tL_chatAdminRights3.delete_messages;
                tL_chatAdminRights6.delete_messages = z11;
                boolean z12 = tL_chatAdminRights3.manage_call;
                tL_chatAdminRights6.manage_call = z12;
                boolean z13 = tL_chatAdminRights3.ban_users;
                tL_chatAdminRights6.ban_users = z13;
                boolean z14 = tL_chatAdminRights3.invite_users;
                tL_chatAdminRights6.invite_users = z14;
                boolean z15 = tL_chatAdminRights3.pin_messages;
                tL_chatAdminRights6.pin_messages = z15;
                boolean z16 = tL_chatAdminRights3.manage_ranks;
                tL_chatAdminRights6.manage_ranks = z16;
                boolean z17 = tL_chatAdminRights3.manage_topics;
                tL_chatAdminRights6.manage_topics = z17;
                tL_chatAdminRights6.post_stories = tL_chatAdminRights3.post_stories;
                tL_chatAdminRights6.edit_stories = tL_chatAdminRights3.edit_stories;
                tL_chatAdminRights6.delete_stories = tL_chatAdminRights3.delete_stories;
                boolean z18 = tL_chatAdminRights3.manage_direct_messages;
                tL_chatAdminRights6.manage_direct_messages = z18;
                boolean z19 = tL_chatAdminRights3.manage_welcome_messages;
                tL_chatAdminRights6.manage_welcome_messages = z19;
                boolean z20 = tL_chatAdminRights3.manage_linked_peers;
                tL_chatAdminRights6.manage_linked_peers = z20;
                boolean z21 = tL_chatAdminRights3.add_admins;
                tL_chatAdminRights6.add_admins = z21;
                boolean z22 = tL_chatAdminRights3.anonymous;
                tL_chatAdminRights6.anonymous = z22;
                boolean z23 = tL_chatAdminRights3.other;
                tL_chatAdminRights6.other = z23;
                boolean z24 = z8 || z9 || z18 || z19 || z10 || z11 || z13 || z14 || z20 || z15 || z16 || z21 || z12 || z22 || z17 || z23;
                this.b1 = z24;
                if (i == 2) {
                    boolean z25 = this.F || z24;
                    this.L = z25;
                    this.K = z25 ? 1.0f : 0.0f;
                    this.b1 = false;
                }
                tL_chatAdminRights2 = tL_chatAdminRights6;
            }
            TLRPC.Chat chat2 = this.x;
            if (chat2 != null) {
                this.Q = chat2.default_banned_rights;
            }
            if (this.Q == null) {
                TLRPC.TL_chatBannedRights tL_chatBannedRights4 = new TLRPC.TL_chatBannedRights();
                this.Q = tL_chatBannedRights4;
                tL_chatBannedRights4.view_messages = false;
                tL_chatBannedRights4.send_media = false;
                tL_chatBannedRights4.send_messages = false;
                tL_chatBannedRights4.embed_links = false;
                tL_chatBannedRights4.send_stickers = false;
                tL_chatBannedRights4.send_gifs = false;
                tL_chatBannedRights4.send_games = false;
                tL_chatBannedRights4.send_inline = false;
                tL_chatBannedRights4.send_polls = false;
                tL_chatBannedRights4.invite_users = false;
                tL_chatBannedRights4.change_info = false;
                tL_chatBannedRights4.pin_messages = false;
                tL_chatBannedRights4.manage_topics = false;
                tL_chatBannedRights4.send_plain = false;
                tL_chatBannedRights4.send_videos = false;
                tL_chatBannedRights4.send_photos = false;
                tL_chatBannedRights4.send_audios = false;
                tL_chatBannedRights4.send_docs = false;
                tL_chatBannedRights4.send_voices = false;
                tL_chatBannedRights4.send_roundvideos = false;
                tL_chatBannedRights4.edit_rank = false;
                tL_chatBannedRights4.send_reactions = false;
            }
            TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.Q;
            if (tL_chatBannedRights5.change_info || this.F) {
                z3 = true;
            } else {
                z3 = true;
                tL_chatAdminRights2.change_info = true;
            }
            if (!tL_chatBannedRights5.pin_messages) {
                tL_chatAdminRights2.pin_messages = z3;
            }
            z4 = false;
        } else {
            if (i == 1) {
                this.Q = tL_chatBannedRights;
                if (tL_chatBannedRights == null) {
                    tL_chatBannedRights3 = new TLRPC.TL_chatBannedRights();
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
                } else {
                    tL_chatBannedRights3 = tL_chatBannedRights;
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
                    tL_chatBannedRights6 = this.P;
                    tL_chatBannedRights6.send_plain = tL_chatBannedRights2.send_plain;
                    tL_chatBannedRights6.edit_rank = tL_chatBannedRights2.edit_rank;
                    tL_chatBannedRights6.send_reactions = tL_chatBannedRights2.send_reactions;
                }
                if (tL_chatBannedRights3.view_messages) {
                    tL_chatBannedRights6.view_messages = true;
                }
                if (tL_chatBannedRights3.send_messages) {
                    tL_chatBannedRights6.send_messages = true;
                }
                if (tL_chatBannedRights3.send_media) {
                    tL_chatBannedRights6.send_media = true;
                }
                if (tL_chatBannedRights3.send_stickers) {
                    tL_chatBannedRights6.send_stickers = true;
                }
                if (tL_chatBannedRights3.send_gifs) {
                    tL_chatBannedRights6.send_gifs = true;
                }
                if (tL_chatBannedRights3.send_games) {
                    tL_chatBannedRights6.send_games = true;
                }
                if (tL_chatBannedRights3.send_inline) {
                    tL_chatBannedRights6.send_inline = true;
                }
                if (tL_chatBannedRights3.embed_links) {
                    tL_chatBannedRights6.embed_links = true;
                }
                if (tL_chatBannedRights3.send_polls) {
                    tL_chatBannedRights6.send_polls = true;
                }
                if (tL_chatBannedRights3.invite_users) {
                    tL_chatBannedRights6.invite_users = true;
                }
                if (tL_chatBannedRights3.change_info) {
                    tL_chatBannedRights6.change_info = true;
                }
                if (tL_chatBannedRights3.pin_messages) {
                    tL_chatBannedRights6.pin_messages = true;
                }
                if (tL_chatBannedRights3.edit_rank) {
                    tL_chatBannedRights6.edit_rank = true;
                }
                if (tL_chatBannedRights3.send_reactions) {
                    tL_chatBannedRights6.send_reactions = true;
                }
                if (tL_chatBannedRights3.manage_topics) {
                    tL_chatBannedRights6.manage_topics = true;
                }
                if (tL_chatBannedRights3.send_photos) {
                    tL_chatBannedRights6.send_photos = true;
                }
                if (tL_chatBannedRights3.send_videos) {
                    tL_chatBannedRights6.send_videos = true;
                }
                if (tL_chatBannedRights3.send_audios) {
                    tL_chatBannedRights6.send_audios = true;
                }
                if (tL_chatBannedRights3.send_docs) {
                    tL_chatBannedRights6.send_docs = true;
                }
                if (tL_chatBannedRights3.send_voices) {
                    tL_chatBannedRights6.send_voices = true;
                }
                if (tL_chatBannedRights3.send_roundvideos) {
                    tL_chatBannedRights6.send_roundvideos = true;
                }
                if (tL_chatBannedRights3.send_plain) {
                    tL_chatBannedRights6.send_plain = true;
                }
                this.S = sd2.D(tL_chatBannedRights6);
                if (tL_chatBannedRights2 != null && tL_chatBannedRights2.view_messages) {
                    z5 = false;
                }
                this.b1 = z5;
            }
            z4 = false;
        }
        s0(z4);
    }

    public static TLRPC.TL_chatAdminRights e0(boolean z) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
        tL_chatAdminRights.manage_linked_peers = z;
        tL_chatAdminRights.manage_ranks = z;
        tL_chatAdminRights.manage_welcome_messages = z;
        tL_chatAdminRights.manage_direct_messages = z;
        tL_chatAdminRights.delete_stories = z;
        tL_chatAdminRights.edit_stories = z;
        tL_chatAdminRights.post_stories = z;
        tL_chatAdminRights.manage_topics = z;
        tL_chatAdminRights.manage_call = z;
        tL_chatAdminRights.add_admins = z;
        tL_chatAdminRights.pin_messages = z;
        tL_chatAdminRights.invite_users = z;
        tL_chatAdminRights.ban_users = z;
        tL_chatAdminRights.delete_messages = z;
        tL_chatAdminRights.edit_messages = z;
        tL_chatAdminRights.post_messages = z;
        tL_chatAdminRights.change_info = z;
        return tL_chatAdminRights;
    }

    public static TLRPC.TL_chatAdminRights p0(TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatAdminRights tL_chatAdminRights2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
        boolean z = true;
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
            z = false;
        }
        tL_chatAdminRights3.manage_linked_peers = z;
        return tL_chatAdminRights3;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.D5));
        hashSet.add(Integer.valueOf(cmb.C5));
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.G6));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.K6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.o7));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.r8));
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    public final boolean b0() {
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.Q;
        return tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_stickers && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions;
    }

    public final boolean c0(boolean z) {
        int i = this.E;
        if (i != 2) {
            if (!(i == 1 ? this.S.equals(sd2.D(this.P)) : this.U.equals(this.T))) {
                byte b = 0;
                if (z) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    String M0 = jb6.M0(2131743413, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.S = M0;
                    heVar.U = gm.S2(jb6.a0("UserRestrictionsApplyChangesText", null, 2131743412, oc7.r1(this.currentAccount).L0(Long.valueOf(this.s)).title));
                    alertDialog$Builder.j(jb6.M0(2131754181, null), new be2(this, b));
                    alertDialog$Builder.g(jb6.M0(2131747313, null), new be2(this, (byte) 4));
                    showDialog(heVar);
                }
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        rja rjaVar = this.simpleActionBar;
        int i = this.E;
        if (i == 0) {
            rjaVar.setTitle(jb6.M0(2131751269, null));
        } else if (i == 2) {
            rjaVar.setTitle(jb6.M0(2131754460, null));
        } else {
            rjaVar.setTitle(jb6.M0(2131743414, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 28));
        if (this.J || (!this.F && this.x.creator && m9c.D(this.w))) {
            this.h = this.simpleActionBar.s(jb6.M0(2131745680, null));
        }
        z81 z81Var = new z81(this, context, b);
        this.fragmentView = z81Var;
        z81Var.setFocusableInTouchMode(true);
        fv fvVar = new fv((byte) 12, context, (Object) this);
        this.b = fvVar;
        boolean z = false;
        fvVar.setClipChildren(i != 2);
        zs zsVar = new zs((byte) 4, b, z);
        this.c = zsVar;
        zsVar.E = (byte) 100;
        this.b.setLayoutManager(zsVar);
        fv fvVar2 = this.b;
        je2 je2Var = new je2(this, context);
        this.a = je2Var;
        fvVar2.setAdapter(je2Var);
        sc3 sc3Var = new sc3();
        if (i == 2) {
            this.b.setResetSelectorOnChanged(false);
        }
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        this.b.setItemAnimator(sc3Var);
        this.b.setVerticalScrollbarPosition(jb6.a0 ? 1 : 2);
        z81Var.addView(this.b, qoe.c(-1.0f, -1));
        this.b.r1();
        this.b.setOnScrollListener(new y(this, (byte) 25));
        this.b.setSectionsDrawBackground(true);
        this.b.setOnItemClickListener(new k0(this, context, (byte) 10));
        return this.fragmentView;
    }

    public final void d0() {
        boolean z;
        TLRPC.User user;
        int i = this.l0;
        if (i >= 0) {
            ajb ajbVar = (ajb) this.c.m(i);
            if (ajbVar == null) {
                this.a.g(this.l0);
                return;
            }
            TLRPC.ChatFull chatFull = this.y;
            if (chatFull != null && (user = this.w) != null) {
                if ((this.r ? this.n : chatFull.guard_bot_id) == user.id) {
                    z = true;
                    ajbVar.setChecked(z);
                }
            }
            z = false;
            ajbVar.setChecked(z);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            TLRPC.Chat chat = this.x;
            if (chat == null || chatFull.id != chat.id) {
                return;
            }
            this.y = chatFull;
            d0();
            return;
        }
        if (i == nm7.y1) {
            if ((-this.s) == ((Long) objArr[0]).longValue()) {
                tk5 tk5Var = this.parentLayout;
                if (tk5Var == null || tk5Var.getLastFragment() != this) {
                    removeSelfFromStack();
                } else {
                    finishFragment();
                }
            }
        }
    }

    public final void f0(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        if (getParentActivity() == null) {
            return;
        }
        if (tL_inputCheckPasswordSRP != null && !sd2.T(this.x)) {
            oc7.r1(this.currentAccount).P(getParentActivity(), this.s, this, new jf((Object) this, (Object) tL_inputCheckPasswordSRP, (Object) twoStepVerificationActivity, (byte) 29), null);
            return;
        }
        TLRPC.TL_channels_editCreator tL_channels_editCreator = new TLRPC.TL_channels_editCreator();
        if (sd2.T(this.x)) {
            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
            tL_channels_editCreator.channel = tL_inputChannel;
            TLRPC.Chat chat = this.x;
            tL_inputChannel.channel_id = chat.id;
            tL_inputChannel.access_hash = chat.access_hash;
        } else {
            tL_channels_editCreator.channel = new TLRPC.TL_inputChannelEmpty();
        }
        tL_channels_editCreator.password = tL_inputCheckPasswordSRP != null ? tL_inputCheckPasswordSRP : new TLRPC.TL_inputCheckPasswordEmpty();
        tL_channels_editCreator.user_id = getMessagesController().p1(this.w);
        getConnectionsManager().sendRequest(tL_channels_editCreator, new av0((Object) this, (Object) tL_inputCheckPasswordSRP, (Object) twoStepVerificationActivity, (Object) tL_channels_editCreator, (byte) 4));
    }

    public final boolean g0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
        boolean z = tL_chatAdminRights.change_info;
        boolean z2 = this.H;
        if (z && tL_chatAdminRights.delete_messages && tL_chatAdminRights.ban_users && tL_chatAdminRights.invite_users && tL_chatAdminRights.pin_messages && tL_chatAdminRights.manage_ranks && ((!z2 || tL_chatAdminRights.manage_topics) && tL_chatAdminRights.manage_call && !tL_chatAdminRights.add_admins && !tL_chatAdminRights.anonymous)) {
            return true;
        }
        if (z || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks) {
            return false;
        }
        return ((z2 && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.manage_call || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        za2 za2Var = new za2(this, (byte) 1);
        arrayList.add(new cnb(this.b, 0, new Class[]{ajb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.T6));
        arrayList.add(new cnb(this.b, 0, new Class[]{ajb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.U6));
        arrayList.add(new cnb(this.b, 262144, new Class[]{jf5.class}, new String[]{"textView2"}, (Drawable[]) null, (bnb) null, cmb.o7));
        arrayList.add(new cnb(this.b, 0, new Class[]{v8c.class}, new String[]{"statusColor"}, (Drawable[]) null, za2Var, cmb.x6));
        arrayList.add(new cnb(this.b, 0, new Class[]{v8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, za2Var, cmb.m6));
        arrayList.add(new cnb((View) null, 0, new Class[]{vg3.class}, new String[]{"textView"}, (Drawable[]) null, (bnb) null, cmb.p5));
        return arrayList;
    }

    public final void h0(k6d k6dVar, View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue == 0) {
            this.P.until_date = 0;
            this.a.g(this.N0);
        } else if (intValue == 1) {
            this.P.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 86400;
            this.a.g(this.N0);
        } else if (intValue == 2) {
            this.P.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 604800;
            this.a.g(this.N0);
        } else if (intValue != 3) {
            byte b = 4;
            if (intValue == 4) {
                Calendar calendar = Calendar.getInstance();
                try {
                    DatePickerDialog datePickerDialog = new DatePickerDialog(getParentActivity(), new DatePickerDialog.OnDateSetListener() { // from class: ee2
                        @Override // android.app.DatePickerDialog.OnDateSetListener
                        public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                            final ke2 ke2Var = ke2.this;
                            ke2Var.getClass();
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.clear();
                            calendar2.set(i, i2, i3);
                            final int time = (int) (calendar2.getTime().getTime() / 1000);
                            try {
                                TimePickerDialog timePickerDialog = new TimePickerDialog(ke2Var.getParentActivity(), new TimePickerDialog.OnTimeSetListener() { // from class: ge2
                                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                                    public final void onTimeSet(TimePicker timePicker, int i4, int i5) {
                                        ke2 ke2Var2 = ke2.this;
                                        ke2Var2.P.until_date = (i5 * 60) + (i4 * 3600) + time;
                                        ke2Var2.a.g(ke2Var2.N0);
                                    }
                                }, 0, 0, true);
                                timePickerDialog.setButton(-1, jb6.M0(2131745284, null), timePickerDialog);
                                timePickerDialog.setButton(-2, jb6.M0(2131752542, null), new fe2());
                                ke2Var.showDialog(timePickerDialog);
                            } catch (Exception e) {
                                fc4.g(e, true);
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
                    datePickerDialog.setButton(-1, jb6.M0(2131745284, null), datePickerDialog);
                    datePickerDialog.setButton(-2, jb6.M0(2131752542, null), new fe2());
                    datePickerDialog.setOnShowListener(new jh(datePicker, b));
                    showDialog(datePickerDialog);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        } else {
            this.P.until_date = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 2592000;
            this.a.g(this.N0);
        }
        ((my0) k6dVar.b).y0.run();
    }

    public final void i0(long j) {
        TLRPC.ChatFull chatFull = this.y;
        long j2 = chatFull != null ? chatFull.guard_bot_id : 0L;
        TLRPC.User W1 = j2 != 0 ? getMessagesController().W1(Long.valueOf(j2)) : null;
        if (W1 != null && j != 0 && W1.id != j) {
            new ud5(getParentActivity(), this.resourceProvider, W1, this.w, new ce2(this, j, (byte) 0)).show();
            return;
        }
        this.n = j;
        this.r = true;
        d0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0481, code lost:
    
        if (r8.change_info != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04d5, code lost:
    
        if (r8.pin_messages != false) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0503, code lost:
    
        if (r7.creator == false) goto L294;
     */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0760  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(Context context, View view, int i) {
        ajb ajbVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        TLRPC.Chat chat;
        boolean z5;
        boolean z6;
        boolean z7;
        View m;
        boolean z8 = this.J;
        int i2 = this.E;
        if (z8 || (this.x.creator && i2 == 0 && i == this.f0)) {
            if (i == this.A0) {
                if (!(view instanceof ajb) || ((ajb) view).isEnabled()) {
                    this.B0 = !this.B0;
                    s0(false);
                    this.a.g(this.A0);
                    boolean z9 = this.B0;
                    je2 je2Var = this.a;
                    int i3 = this.A0 + 1;
                    if (z9) {
                        je2Var.p(i3, 10);
                        return;
                    } else {
                        je2Var.q(i3, 10);
                        return;
                    }
                }
                return;
            }
            int i4 = this.O0;
            int i5 = 3;
            if (i == i4) {
                if (!(view instanceof ajb) || ((ajb) view).isEnabled()) {
                    this.P0 = !this.P0;
                    s0(false);
                    this.a.g(this.O0);
                    boolean z10 = this.P0;
                    je2 je2Var2 = this.a;
                    int i6 = this.O0 + 1;
                    if (z10) {
                        je2Var2.p(i6, 3);
                        return;
                    } else {
                        je2Var2.q(i6, 3);
                        return;
                    }
                }
                return;
            }
            int i7 = this.T0;
            if (i == i7) {
                if (!(view instanceof ajb) || ((ajb) view).isEnabled()) {
                    this.U0 = !this.U0;
                    s0(false);
                    this.a.g(this.T0);
                    boolean z11 = this.U0;
                    je2 je2Var3 = this.a;
                    int i8 = this.T0 + 1;
                    if (z11) {
                        je2Var3.p(i8, 3);
                        return;
                    } else {
                        je2Var3.q(i8, 3);
                        return;
                    }
                }
                return;
            }
            TLRPC.User user = this.w;
            if (i == 0) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.id);
                presentFragment(new ProfileActivity(bundle, null));
                return;
            }
            int i9 = this.q0;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
            if (i == i9) {
                if (i2 == 0) {
                    oc7.r1(this.currentAccount).X4(this.s, this.w, new TLRPC.TL_chatAdminRights(), this.T, this.F, getFragmentForAlert(0), this.a1, false, null, null, null);
                    he2 he2Var = this.Y0;
                    if (he2Var != null) {
                        he2Var.b(0, tL_chatAdminRights, this.P, this.T);
                    }
                    finishFragment();
                    return;
                }
                if (i2 == 1) {
                    this.R = true;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = new TLRPC.TL_chatBannedRights();
                    this.P = tL_chatBannedRights2;
                    tL_chatBannedRights2.view_messages = true;
                    tL_chatBannedRights2.send_media = true;
                    tL_chatBannedRights2.send_messages = true;
                    tL_chatBannedRights2.send_stickers = true;
                    tL_chatBannedRights2.send_gifs = true;
                    tL_chatBannedRights2.send_games = true;
                    tL_chatBannedRights2.send_inline = true;
                    tL_chatBannedRights2.embed_links = true;
                    tL_chatBannedRights2.pin_messages = true;
                    tL_chatBannedRights2.edit_rank = true;
                    tL_chatBannedRights2.send_reactions = true;
                    tL_chatBannedRights2.send_polls = true;
                    tL_chatBannedRights2.invite_users = true;
                    tL_chatBannedRights2.change_info = true;
                    tL_chatBannedRights2.manage_topics = true;
                    tL_chatBannedRights2.until_date = 0;
                    o0(true);
                    return;
                }
                return;
            }
            if (i == this.u0) {
                f0(null, null);
                return;
            }
            if (i == this.N0) {
                if (getParentActivity() != null) {
                    k6d k6dVar = new k6d(context, (ylb) null);
                    Object obj = k6dVar.b;
                    ((my0) obj).v0 = false;
                    LinearLayout i10 = hg9.i(context, 1);
                    jf5 jf5Var = new jf5(context, cmb.m5, 23, 15, false, null);
                    jf5Var.setHeight(47);
                    jf5Var.setText(jb6.M0(2131743401, null));
                    i10.addView(jf5Var);
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    i10.addView(linearLayout, qoe.o(-1, -2));
                    int i11 = 5;
                    gy0[] gy0VarArr = new gy0[5];
                    int i12 = 0;
                    while (i12 < i11) {
                        gy0 gy0Var = new gy0(0, null, context);
                        gy0VarArr[i12] = gy0Var;
                        gy0Var.setPadding(gm.L(7.0f), 0, gm.L(7.0f), 0);
                        gy0VarArr[i12].setTag(Integer.valueOf(i12));
                        gy0VarArr[i12].setBackgroundDrawable(cmb.L0(false));
                        gy0VarArr[i12].a(i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != i5 ? jb6.M0(2131743402, null) : jb6.G(1, "Months", new Object[0]) : jb6.G(1, "Weeks", new Object[0]) : jb6.G(1, "Days", new Object[0]) : jb6.M0(2131743371, null), 0, null, false);
                        linearLayout.addView(gy0VarArr[i12], qoe.o(-1, -2));
                        gy0VarArr[i12].setOnClickListener(new rc1((Object) this, (Object) k6dVar, (byte) 18));
                        i12++;
                        i11 = 5;
                        i5 = 3;
                    }
                    my0 my0Var = (my0) obj;
                    my0Var.O = i10;
                    showDialog(my0Var);
                    return;
                }
                return;
            }
            boolean z12 = view instanceof oh2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.Q;
            if (z12) {
                oh2 oh2Var = (oh2) view;
                int i13 = this.Q0;
                if (i == i13 || i == this.R0 || i == this.S0) {
                    if (i == i13) {
                        z5 = !tL_chatAdminRights.post_messages;
                        tL_chatAdminRights.post_messages = z5;
                    } else if (i == this.R0) {
                        z5 = !tL_chatAdminRights.edit_messages;
                        tL_chatAdminRights.edit_messages = z5;
                    } else {
                        z5 = !tL_chatAdminRights.delete_messages;
                        tL_chatAdminRights.delete_messages = z5;
                    }
                    this.a.g(i4);
                    oh2Var.c(z5, true);
                    return;
                }
                int i14 = this.V0;
                if (i == i14 || i == this.W0 || i == this.X0) {
                    if (i == i14) {
                        z6 = !tL_chatAdminRights.post_stories;
                        tL_chatAdminRights.post_stories = z6;
                    } else if (i == this.W0) {
                        z6 = !tL_chatAdminRights.edit_stories;
                        tL_chatAdminRights.edit_stories = z6;
                    } else {
                        z6 = !tL_chatAdminRights.delete_stories;
                        tL_chatAdminRights.delete_stories = z6;
                    }
                    this.a.g(i7);
                    oh2Var.c(z6, true);
                    return;
                }
                if (i2 != 1 || this.P == null) {
                    return;
                }
                oh2Var.b();
                if (oh2Var.r.b != null) {
                    if (i2 != 2) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                        String M0 = jb6.M0(2131743406, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.M0(2131743405, null);
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        heVar.show();
                        return;
                    }
                    return;
                }
                if (i == this.C0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.P;
                    z7 = !tL_chatBannedRights4.send_photos;
                    tL_chatBannedRights4.send_photos = z7;
                } else if (i == this.D0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.P;
                    z7 = !tL_chatBannedRights5.send_videos;
                    tL_chatBannedRights5.send_videos = z7;
                } else if (i == this.E0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.P;
                    z7 = !tL_chatBannedRights6.send_audios;
                    tL_chatBannedRights6.send_audios = z7;
                } else if (i == this.k0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.P;
                    z7 = !tL_chatBannedRights7.send_reactions;
                    tL_chatBannedRights7.send_reactions = z7;
                } else if (i == this.F0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.P;
                    z7 = !tL_chatBannedRights8.send_docs;
                    tL_chatBannedRights8.send_docs = z7;
                } else if (i == this.H0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights9 = this.P;
                    z7 = !tL_chatBannedRights9.send_roundvideos;
                    tL_chatBannedRights9.send_roundvideos = z7;
                } else if (i == this.G0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = this.P;
                    z7 = !tL_chatBannedRights10.send_voices;
                    tL_chatBannedRights10.send_voices = z7;
                } else if (i == this.I0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = this.P;
                    z7 = !tL_chatBannedRights11.send_stickers;
                    tL_chatBannedRights11.send_inline = z7;
                    tL_chatBannedRights11.send_gifs = z7;
                    tL_chatBannedRights11.send_games = z7;
                    tL_chatBannedRights11.send_stickers = z7;
                } else if (i == this.K0) {
                    if ((this.P.send_plain || tL_chatBannedRights3.send_plain) && (m = this.c.m(this.z0)) != null) {
                        gm.B3(m);
                        xx0.E.a();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = this.P;
                        z7 = !tL_chatBannedRights12.embed_links;
                        tL_chatBannedRights12.embed_links = z7;
                    }
                } else if (i == this.J0) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = this.P;
                    z7 = !tL_chatBannedRights13.send_polls;
                    tL_chatBannedRights13.send_polls = z7;
                } else {
                    z7 = false;
                }
                this.a.g(this.A0);
                oh2Var.c(!z7, true);
                return;
            }
            if (view instanceof ajb) {
                ajb ajbVar2 = (ajb) view;
                Switch r2 = ajbVar2.d;
                if (r2.G != null) {
                    if (i2 != 2) {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
                        String M02 = jb6.M0(2131743406, null);
                        he heVar2 = alertDialog$Builder2.a;
                        heVar2.S = M02;
                        heVar2.U = jb6.M0(2131743405, null);
                        alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                        heVar2.show();
                        return;
                    }
                    return;
                }
                if (!ajbVar2.isEnabled()) {
                    if (i2 == 2 || i2 == 0) {
                        if ((i != this.Y || tL_chatBannedRights3 == null || tL_chatBannedRights3.change_info) && ((i != this.i0 || tL_chatBannedRights3 == null || tL_chatBannedRights3.pin_messages) && (i != this.j0 || tL_chatBannedRights3 == null || tL_chatBannedRights3.edit_rank))) {
                            return;
                        }
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(getParentActivity());
                        String M03 = jb6.M0(2131743406, null);
                        he heVar3 = alertDialog$Builder3.a;
                        heVar3.S = M03;
                        heVar3.U = jb6.M0(2131743404, null);
                        alertDialog$Builder3.j(jb6.M0(2131747564, null), null);
                        heVar3.show();
                        return;
                    }
                    return;
                }
                if (i2 != 2 && i != this.l0) {
                    ajbVar2.setChecked(!r2.h);
                }
                boolean z13 = r2.h;
                if (i == this.X) {
                    z13 = !this.L;
                    this.L = z13;
                    FrameLayout frameLayout = this.e;
                    if (frameLayout != null) {
                        frameLayout.invalidate();
                    }
                    int childCount = this.b.getChildCount();
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt = this.b.getChildAt(i15);
                        this.b.getClass();
                        int R = RecyclerView.R(childAt);
                        if (childAt instanceof ajb) {
                            boolean z14 = this.L;
                            if (z14) {
                                int i16 = this.X;
                                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = this.O;
                                if (R == i16) {
                                    z4 = tL_chatAdminRights2.add_admins || ((chat = this.x) != null && chat.creator);
                                    z3 = z14;
                                } else if (R == this.Y) {
                                    z3 = tL_chatAdminRights.change_info;
                                    if (tL_chatAdminRights2.change_info) {
                                    }
                                    z4 = false;
                                } else if (R == this.Z) {
                                    z3 = tL_chatAdminRights.post_messages;
                                    z4 = tL_chatAdminRights2.post_messages;
                                } else if (R == this.a0) {
                                    z3 = tL_chatAdminRights.manage_direct_messages;
                                    z4 = tL_chatAdminRights2.manage_direct_messages;
                                } else if (R == this.b0) {
                                    z3 = tL_chatAdminRights.manage_welcome_messages;
                                    z4 = tL_chatAdminRights2.manage_welcome_messages;
                                } else if (R == this.c0) {
                                    z3 = tL_chatAdminRights.edit_messages;
                                    z4 = tL_chatAdminRights2.edit_messages;
                                } else if (R == this.d0) {
                                    z3 = tL_chatAdminRights.delete_messages;
                                    z4 = tL_chatAdminRights2.delete_messages;
                                } else if (R == this.g0) {
                                    z3 = tL_chatAdminRights.ban_users;
                                    z4 = tL_chatAdminRights2.ban_users;
                                } else if (R == this.h0) {
                                    z3 = tL_chatAdminRights.invite_users;
                                    z4 = tL_chatAdminRights2.invite_users;
                                } else if (R == this.i0) {
                                    z3 = tL_chatAdminRights.pin_messages;
                                    if (tL_chatAdminRights2.pin_messages) {
                                    }
                                    z4 = false;
                                } else if (R == this.j0) {
                                    z3 = tL_chatAdminRights.manage_ranks;
                                    z4 = tL_chatAdminRights2.manage_ranks;
                                } else if (R == this.L0) {
                                    z3 = tL_chatAdminRights.manage_call;
                                    z4 = tL_chatAdminRights2.manage_call;
                                } else if (R == this.e0) {
                                    z3 = tL_chatAdminRights.add_admins;
                                    z4 = tL_chatAdminRights2.add_admins;
                                } else {
                                    if (R == this.f0) {
                                        z3 = tL_chatAdminRights.anonymous;
                                        if (!tL_chatAdminRights2.anonymous) {
                                            TLRPC.Chat chat2 = this.x;
                                            if (chat2 != null) {
                                            }
                                        }
                                        z4 = true;
                                    } else if (R == this.n0) {
                                        z3 = tL_chatAdminRights.manage_topics;
                                        z4 = tL_chatAdminRights2.manage_topics;
                                    } else if (R == this.o0) {
                                        z3 = tL_chatAdminRights.manage_linked_peers;
                                        z4 = tL_chatAdminRights2.manage_linked_peers;
                                    } else {
                                        z3 = false;
                                    }
                                    z4 = false;
                                }
                                ajb ajbVar3 = (ajb) childAt;
                                ajbVar3.setChecked(z3);
                                ajbVar3.b(z4, true);
                            } else if ((R != this.Y || tL_chatBannedRights3.change_info) && ((R != this.i0 || tL_chatBannedRights3.pin_messages) && (R != this.j0 || tL_chatBannedRights3.edit_rank))) {
                                ajb ajbVar4 = (ajb) childAt;
                                ajbVar4.setChecked(false);
                                ajbVar4.b(R == this.X, true);
                            } else {
                                ajb ajbVar5 = (ajb) childAt;
                                ajbVar5.setChecked(true);
                                ajbVar5.b(false, false);
                            }
                        }
                    }
                    this.a.f();
                    io ioVar = this.f;
                    if (ioVar != null) {
                        StringBuilder sb = new StringBuilder(jb6.M0(2131754456, null));
                        sb.append(" ");
                        sb.append(jb6.M0(this.L ? 2131754455 : 2131754454, null));
                        ioVar.c(sb.toString(), true, this.L);
                    }
                    ValueAnimator valueAnimator = this.c1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.c1 = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.K, this.L ? 1.0f : 0.0f);
                    this.c1 = ofFloat;
                    ofFloat.addUpdateListener(new et1(this, (byte) 8));
                    this.c1.setDuration((long) (Math.abs(this.K - (this.L ? 1.0f : 0.0f)) * 200.0f));
                    this.c1.start();
                } else if (i != this.Y) {
                    if (i != this.Z) {
                        if (i == this.l0) {
                            String t = pg3.t(user);
                            String M04 = jb6.M0(2131754147, null);
                            String M05 = jb6.M0(!z13 ? 2131754156 : 2131754165, null);
                            boolean z15 = this.F;
                            SpannableStringBuilder S2 = gm.S2(jb6.a0(null, null, z13 ? z15 ? 2131754158 : 2131754157 : z15 ? 2131754149 : 2131754148, t));
                            ce2 ce2Var = new ce2(this, !z13 ? user.id : 0L, (byte) 1);
                            ajbVar = ajbVar2;
                            ik.s0(this, M04, S2, M05, false, ce2Var);
                        } else {
                            ajbVar = ajbVar2;
                            if (i == this.b0) {
                                z13 = !tL_chatAdminRights.manage_welcome_messages;
                                tL_chatAdminRights.manage_welcome_messages = z13;
                            } else if (i == this.a0) {
                                z13 = !tL_chatAdminRights.manage_direct_messages;
                                tL_chatAdminRights.manage_direct_messages = z13;
                            } else if (i == this.c0) {
                                z13 = !tL_chatAdminRights.edit_messages;
                                tL_chatAdminRights.edit_messages = z13;
                            } else if (i == this.d0) {
                                z13 = !tL_chatAdminRights.delete_messages;
                                tL_chatAdminRights.delete_messages = z13;
                            } else if (i == this.e0) {
                                z13 = !tL_chatAdminRights.add_admins;
                                tL_chatAdminRights.add_admins = z13;
                            } else if (i == this.f0) {
                                z13 = !tL_chatAdminRights.anonymous;
                                tL_chatAdminRights.anonymous = z13;
                            } else if (i == this.g0) {
                                z13 = !tL_chatAdminRights.ban_users;
                                tL_chatAdminRights.ban_users = z13;
                            } else if (i == this.L0) {
                                z13 = !tL_chatAdminRights.manage_call;
                                tL_chatAdminRights.manage_call = z13;
                            } else if (i == this.n0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.manage_topics;
                                    tL_chatAdminRights.manage_topics = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights14 = this.P;
                                    z13 = !tL_chatBannedRights14.manage_topics;
                                    tL_chatBannedRights14.manage_topics = z13;
                                }
                            } else if (i == this.o0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.manage_linked_peers;
                                    tL_chatAdminRights.manage_linked_peers = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights15 = this.P;
                                    z13 = !tL_chatBannedRights15.manage_linked_peers;
                                    tL_chatBannedRights15.manage_linked_peers = z13;
                                }
                            } else if (i == this.h0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.invite_users;
                                    tL_chatAdminRights.invite_users = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights16 = this.P;
                                    z13 = !tL_chatBannedRights16.invite_users;
                                    tL_chatBannedRights16.invite_users = z13;
                                }
                            } else if (i == this.i0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.pin_messages;
                                    tL_chatAdminRights.pin_messages = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights17 = this.P;
                                    z13 = !tL_chatBannedRights17.pin_messages;
                                    tL_chatBannedRights17.pin_messages = z13;
                                }
                            } else if (i == this.j0) {
                                if (i2 == 0 || i2 == 2) {
                                    z13 = !tL_chatAdminRights.manage_ranks;
                                    tL_chatAdminRights.manage_ranks = z13;
                                } else {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights18 = this.P;
                                    z13 = !tL_chatBannedRights18.edit_rank;
                                    tL_chatBannedRights18.edit_rank = z13;
                                }
                            } else if (i2 == 1 && (tL_chatBannedRights = this.P) != null) {
                                if (i == this.z0) {
                                    z = !tL_chatBannedRights.send_plain;
                                    tL_chatBannedRights.send_plain = z;
                                } else {
                                    z = z13;
                                }
                                if (!z13 || ((tL_chatBannedRights.send_plain && tL_chatBannedRights.embed_links && tL_chatBannedRights.send_inline && tL_chatBannedRights.send_photos && tL_chatBannedRights.send_videos && tL_chatBannedRights.send_audios && tL_chatBannedRights.send_docs && tL_chatBannedRights.send_voices && tL_chatBannedRights.send_roundvideos && tL_chatBannedRights.send_polls && tL_chatBannedRights.send_reactions) || !tL_chatBannedRights.view_messages)) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    tL_chatBannedRights.view_messages = false;
                                }
                                int i17 = this.K0;
                                if (i17 >= 0) {
                                    this.a.g(i17);
                                }
                                int i18 = this.A0;
                                if (i18 >= 0) {
                                    this.a.g(i18);
                                }
                                z13 = z;
                                if (i2 == 2) {
                                    ajbVar.setChecked((this.L && z13) ? true : z2);
                                }
                                s0(true);
                            }
                        }
                        z2 = false;
                        if (i2 == 2) {
                        }
                        s0(true);
                    }
                    z13 = !tL_chatAdminRights.post_messages;
                    tL_chatAdminRights.post_messages = z13;
                } else if (i2 == 0 || i2 == 2) {
                    z13 = !tL_chatAdminRights.change_info;
                    tL_chatAdminRights.change_info = z13;
                } else {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights19 = this.P;
                    z13 = !tL_chatBannedRights19.change_info;
                    tL_chatBannedRights19.change_info = z13;
                }
                ajbVar = ajbVar2;
                z2 = false;
                if (i2 == 2) {
                }
                s0(true);
            }
        }
    }

    public final /* synthetic */ void k0(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, long j) {
        if (j != 0) {
            this.s = j;
            this.x = oc7.r1(this.currentAccount).L0(Long.valueOf(j));
            f0(tL_inputCheckPasswordSRP, twoStepVerificationActivity);
        }
    }

    public final void l0(TLRPC.TL_error tL_error, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, TLRPC.TL_channels_editCreator tL_channels_editCreator) {
        int i;
        TLRPC.User user = this.w;
        if (tL_error == null) {
            if (tL_inputCheckPasswordSRP != null) {
                this.Y0.a(user);
                removeSelfFromStack();
                twoStepVerificationActivity.t0();
                twoStepVerificationActivity.finishFragment();
                return;
            }
            return;
        }
        if (getParentActivity() != null) {
            boolean equals = "PASSWORD_HASH_INVALID".equals(tL_error.text);
            boolean z = this.F;
            byte b = 5;
            if (equals) {
                if (tL_inputCheckPasswordSRP == null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    he heVar = alertDialog$Builder.a;
                    if (z) {
                        heVar.S = jb6.M0(2131751259, null);
                    } else {
                        heVar.S = jb6.M0(2131751252, null);
                    }
                    heVar.U = gm.S2(jb6.a0(null, null, 2131751230, this.x.title, m9c.k(user, true)));
                    alertDialog$Builder.j(jb6.M0(2131751233, null), new be2(this, b));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    showDialog(heVar);
                    return;
                }
                return;
            }
            if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                if ("SRP_ID_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new pm(this, twoStepVerificationActivity, (byte) 22), 8);
                    return;
                }
                if (!tL_error.text.equals("CHANNELS_TOO_MUCH")) {
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.t0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    ik.e0(tL_error, this, z, this.G, tL_channels_editCreator);
                    return;
                }
                if (getParentActivity() == null || z8c.h(j5.a(this.currentAccount).a).p()) {
                    presentFragment(new avb(1));
                    return;
                } else {
                    showDialog(new i46(5, this.currentAccount, null, getParentActivity(), this));
                    return;
                }
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.t0();
            }
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131751234, null);
            he heVar2 = alertDialog$Builder2.a;
            heVar2.S = M0;
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setPadding(gm.L(24.0f), gm.L(2.0f), gm.L(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder2.n(linearLayout);
            TextView textView = new TextView(getParentActivity());
            int i2 = cmb.i5;
            anb.X(textView, i2, null);
            textView.setTextSize(1, 16.0f);
            textView.setGravity((jb6.a0 ? 5 : 3) | 48);
            if (z) {
                hg9.q("EditChannelAdminTransferAlertText", null, 2131751220, new Object[]{m9c.k(user, true)}, textView);
            } else {
                hg9.q("EditAdminTransferAlertText", null, 2131751238, new Object[]{m9c.k(user, true)}, textView);
            }
            linearLayout.addView(textView, qoe.o(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getParentActivity());
            imageView.setImageResource(R.drawable.list_circle);
            imageView.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            anb.s(imageView, i2, null, mode);
            TextView textView2 = new TextView(getParentActivity());
            anb.X(textView2, i2, null);
            textView2.setTextSize(1, 16.0f);
            textView2.setGravity((jb6.a0 ? 5 : 3) | 48);
            textView2.setText(gm.S2(jb6.M0(2131751237, null)));
            if (jb6.a0) {
                linearLayout2.addView(textView2, qoe.o(-1, -2));
                linearLayout2.addView(imageView, qoe.r(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, qoe.o(-2, -2));
                linearLayout2.addView(textView2, qoe.o(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getParentActivity());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getParentActivity());
            imageView2.setImageResource(R.drawable.list_circle);
            imageView2.setPadding(jb6.a0 ? gm.L(11.0f) : 0, gm.L(9.0f), jb6.a0 ? 0 : gm.L(11.0f), 0);
            anb.s(imageView2, i2, null, mode);
            TextView textView3 = new TextView(getParentActivity());
            anb.X(textView3, i2, null);
            textView3.setTextSize(1, 16.0f);
            textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
            textView3.setText(gm.S2(jb6.M0(2131751236, null)));
            if (jb6.a0) {
                linearLayout3.addView(textView3, qoe.o(-1, -2));
                i = 5;
                linearLayout3.addView(imageView2, qoe.r(-2, -2, 5));
            } else {
                i = 5;
                linearLayout3.addView(imageView2, qoe.o(-2, -2));
                linearLayout3.addView(textView3, qoe.o(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder2.j(jb6.M0(2131751228, null), new be2(this, (byte) 6));
                alertDialog$Builder2.g(jb6.M0(2131752542, null), null);
            } else {
                TextView textView4 = new TextView(getParentActivity());
                anb.X(textView4, i2, null);
                textView4.setTextSize(1, 16.0f);
                hg9.p(textView4, (jb6.a0 ? i : 3) | 48, null, 2131751235);
                linearLayout.addView(textView4, qoe.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder2.g(jb6.M0(2131747564, null), null);
            }
            showDialog(heVar2);
        }
    }

    public final void m0(long j) {
        if (j != 0) {
            this.s = j;
            this.x = oc7.r1(this.currentAccount).L0(Long.valueOf(j));
            o0(true);
        }
    }

    public final /* synthetic */ boolean n0(TLRPC.TL_error tL_error) {
        q0(false);
        if (tL_error == null || !"USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return true;
        }
        if (!sd2.T(this.x)) {
            i46 i46Var = new i46(11, this.currentAccount, getResourceProvider(), getParentActivity(), this);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.w);
            i46Var.t1(this.x, arrayList, null, null, null);
            i46Var.show();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r1.codePointCount(0, r1.length()) > 16) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r0.g0() == false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(boolean z) {
        String str;
        ke2 ke2Var = this;
        if (ke2Var.I) {
            return;
        }
        boolean T = sd2.T(ke2Var.x);
        int i = ke2Var.E;
        byte b = 2;
        if (!T) {
            if (i != 1) {
                if (i == 0) {
                    if (ke2Var.g0()) {
                        if (ke2Var.w0 != -1) {
                            String str2 = ke2Var.T;
                        }
                    }
                }
                if (i == 2) {
                    if (ke2Var.T == null) {
                    }
                }
            }
            oc7.r1(ke2Var.currentAccount).P(ke2Var.getParentActivity(), ke2Var.s, ke2Var, new be2(ke2Var, (byte) 7), null);
            return;
        }
        boolean z2 = ke2Var.G;
        TLRPC.User user = ke2Var.w;
        TLRPC.TL_chatAdminRights tL_chatAdminRights = ke2Var.N;
        if (z && z2 && !ke2Var.M && tL_chatAdminRights.manage_linked_peers && tL_chatAdminRights.change_info) {
            ik.s0(ke2Var, jb6.M0(2131751856, null), gm.S2(jb6.a0(null, null, 2131751858, pg3.t(user))), jb6.M0(2131751857, null), false, new de2(ke2Var, r6));
            return;
        }
        if (ke2Var.w0 != -1 && (str = ke2Var.T) != null && str.codePointCount(0, str.length()) > 16) {
            ke2Var.b.z0(ke2Var.w0);
            Vibrator vibrator = (Vibrator) ke2Var.getParentActivity().getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
            }
            u69 K = ke2Var.b.K(ke2Var.w0);
            if (K != null) {
                gm.z3(K.a);
                return;
            }
            return;
        }
        if (i == 0 || i == 2) {
            boolean z3 = ke2Var.F;
            if (z3) {
                tL_chatAdminRights.pin_messages = false;
                tL_chatAdminRights.manage_ranks = false;
            } else {
                tL_chatAdminRights.edit_messages = false;
                tL_chatAdminRights.post_messages = false;
            }
            if (tL_chatAdminRights.change_info || tL_chatAdminRights.post_messages || tL_chatAdminRights.edit_messages || tL_chatAdminRights.manage_direct_messages || tL_chatAdminRights.manage_welcome_messages || tL_chatAdminRights.delete_messages || tL_chatAdminRights.ban_users || tL_chatAdminRights.invite_users || ((ke2Var.H && tL_chatAdminRights.manage_topics) || tL_chatAdminRights.pin_messages || tL_chatAdminRights.manage_ranks || tL_chatAdminRights.add_admins || tL_chatAdminRights.anonymous || tL_chatAdminRights.manage_call || (z3 && (tL_chatAdminRights.post_stories || tL_chatAdminRights.edit_stories || tL_chatAdminRights.delete_stories)))) {
                tL_chatAdminRights.other = false;
            } else {
                tL_chatAdminRights.other = true;
            }
        }
        if (i == 0) {
            byte b2 = ke2Var.Y0 == null ? (byte) 1 : (byte) 0;
            ke2Var.q0(true);
            oc7.r1(ke2Var.currentAccount).X4(ke2Var.s, ke2Var.w, ke2Var.N, ke2Var.T, ke2Var.F, ke2Var, (!ke2Var.a1 || z2) ? (byte) 0 : (byte) 1, false, null, new de2(ke2Var, b), new be2(ke2Var, (byte) 8));
            ke2Var = ke2Var;
            r6 = b2;
        } else {
            if (i == 1) {
                if (ke2Var.w0 >= 0) {
                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                    tL_messages_editChatParticipantRank.peer = oc7.k1(ke2Var.x);
                    tL_messages_editChatParticipantRank.participant = oc7.m1(user);
                    String str3 = ke2Var.T;
                    tL_messages_editChatParticipantRank.rank = str3 != null ? str3 : "";
                    ConnectionsManager.getInstance(ke2Var.currentAccount).sendRequest(tL_messages_editChatParticipantRank, null);
                }
                oc7.r1(ke2Var.currentAccount).U4(ke2Var.s, ke2Var.w, null, ke2Var.P, ke2Var.F, ke2Var.getFragmentForAlert(1), null);
                TLRPC.TL_chatBannedRights tL_chatBannedRights = ke2Var.P;
                if (tL_chatBannedRights.send_messages || tL_chatBannedRights.send_stickers || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_media || tL_chatBannedRights.send_gifs || tL_chatBannedRights.send_games || tL_chatBannedRights.send_inline) {
                    b = 1;
                } else {
                    tL_chatBannedRights.until_date = 0;
                }
                he2 he2Var = ke2Var.Y0;
                if (he2Var != null) {
                    he2Var.b(b, tL_chatAdminRights, tL_chatBannedRights, ke2Var.T);
                }
            } else if (i == 2) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ke2Var.getParentActivity());
                String M0 = ke2Var.L ? jb6.M0(2131754459, null) : jb6.M0(2131754460, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                boolean z4 = sd2.T(ke2Var.x) && !ke2Var.x.megagroup;
                TLRPC.Chat chat = ke2Var.x;
                String str4 = chat != null ? chat.title : "";
                heVar.U = gm.S2(ke2Var.L ? z4 ? jb6.a0(null, null, 2131754453, str4) : jb6.a0(null, null, 2131754452, str4) : jb6.a0(null, null, 2131754396, m9c.r(user), str4));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.j(ke2Var.L ? jb6.M0(2131754463, null) : jb6.M0(2131754460, null), new be2(ke2Var, r6));
                ke2Var.showDialog(heVar);
                r6 = 0;
            }
        }
        if (r6 != 0) {
            ke2Var.finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        return c0(z);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.y1);
        getNotificationCenter().b(this, nm7.T);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.y1);
        getNotificationCenter().n(this, nm7.T);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        je2 je2Var = this.a;
        if (je2Var != null) {
            je2Var.f();
        }
        gm.V2(getParentActivity(), this.classGuid);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void q0(boolean z) {
        this.I = z;
        this.simpleActionBar.getBackButton().setEnabled(!this.I);
        uja ujaVar = this.h;
        if (ujaVar != null) {
            ujaVar.b(this.I);
        }
    }

    public final void r0(View view) {
        if (view instanceof jf5) {
            jf5 jf5Var = (jf5) view;
            String str = this.T;
            int codePointCount = 16 - (str != null ? str.codePointCount(0, str.length()) : 0);
            if (codePointCount > 4.8f) {
                jf5Var.setText2("");
                return;
            }
            jf5Var.setText2(String.format("%d", Integer.valueOf(codePointCount)));
            lka textView2 = jf5Var.getTextView2();
            int i = codePointCount < 0 ? cmb.o7 : cmb.z6;
            anb.W(textView2, i, null);
            textView2.setTag(Integer.valueOf(i));
        }
    }

    public final void s0(boolean z) {
        int i;
        int i2;
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
        int i3 = 3;
        this.W = 3;
        int i4 = 8;
        boolean z2 = this.G;
        boolean z3 = this.F;
        boolean z4 = this.H;
        int i5 = this.E;
        if (i5 == 0 || i5 == 2) {
            if (z2) {
                this.Y = 3;
                this.o0 = 4;
                this.e0 = 5;
                this.W = 7;
                this.g0 = 6;
                i3 = 7;
            } else if (z3) {
                this.Y = 3;
                this.W = 5;
                this.O0 = 4;
                if (this.P0) {
                    this.Q0 = 5;
                    this.R0 = 6;
                    this.W = 8;
                    this.S0 = 7;
                } else {
                    i4 = 5;
                }
                int i6 = i4 + 1;
                this.W = i6;
                this.T0 = i4;
                if (this.U0) {
                    this.V0 = i6;
                    int i7 = i4 + 3;
                    this.W0 = i4 + 2;
                    int i8 = i4 + 4;
                    this.W = i8;
                    this.X0 = i7;
                    i6 = i8;
                }
                this.a0 = i6;
                this.b0 = i6 + 1;
                this.h0 = i6 + 2;
                this.L0 = i6 + 3;
                int i9 = i6 + 5;
                this.e0 = i6 + 4;
                i3 = i6 + 6;
                this.W = i3;
                this.g0 = i9;
            } else {
                if (i5 == 2) {
                    this.W = 4;
                    this.X = 3;
                    i3 = 4;
                }
                this.Y = i3;
                this.d0 = i3 + 1;
                this.g0 = i3 + 2;
                this.h0 = i3 + 3;
                int i10 = i3 + 5;
                this.W = i10;
                this.i0 = i3 + 4;
                if (i5 != 2) {
                    this.W = i3 + 6;
                    this.j0 = i10;
                }
                if (sd2.T(this.x)) {
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
                }
                int i13 = this.W;
                this.b0 = i13;
                this.L0 = i13 + 1;
                this.e0 = i13 + 2;
                int i14 = i13 + 4;
                this.W = i14;
                this.f0 = i13 + 3;
                if (z4) {
                    i3 = i13 + 5;
                    this.W = i3;
                    this.n0 = i14;
                } else {
                    i3 = i14;
                }
                if (this.V) {
                    int i15 = i3 + 1;
                    this.l0 = i3;
                    i3 += 2;
                    this.W = i3;
                    this.m0 = i15;
                }
            }
        } else if (i5 == 1) {
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
                i2 = 15;
                this.W = 15;
                this.k0 = 14;
            } else {
                i2 = 5;
            }
            this.h0 = i2;
            this.i0 = i2 + 1;
            this.j0 = i2 + 2;
            int i16 = i2 + 4;
            this.W = i16;
            this.Y = i2 + 3;
            if (z4) {
                int i17 = i2 + 5;
                this.W = i17;
                this.n0 = i16;
                i16 = i17;
            }
            this.M0 = i16;
            int i18 = i16 + 2;
            this.W = i18;
            this.N0 = i16 + 1;
            i3 = i18;
        }
        boolean z5 = this.J;
        TLRPC.User user = this.w;
        if (z5) {
            if (!z3 && (i5 == 0 || ((i5 == 2 && this.L) || i5 == 1))) {
                this.p0 = i3;
                int i19 = i3 + 2;
                this.w0 = i3 + 1;
                i3 += 3;
                this.W = i3;
                this.x0 = i19;
            }
            TLRPC.Chat chat = this.x;
            if (chat != null && chat.creator && i5 == 0) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = this.N;
                if (!z3 ? !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.ban_users || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.pin_messages || !tL_chatAdminRights.manage_ranks || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || ((z4 && !tL_chatAdminRights.manage_topics) || !tL_chatAdminRights.manage_welcome_messages)) : !(!tL_chatAdminRights.change_info || !tL_chatAdminRights.post_messages || !tL_chatAdminRights.edit_messages || !tL_chatAdminRights.delete_messages || !tL_chatAdminRights.invite_users || !tL_chatAdminRights.add_admins || !tL_chatAdminRights.manage_call || !tL_chatAdminRights.post_stories || !tL_chatAdminRights.edit_stories || !tL_chatAdminRights.delete_stories || !tL_chatAdminRights.manage_direct_messages || !tL_chatAdminRights.manage_welcome_messages)) {
                    if (!user.bot && !z2) {
                        int i20 = this.p0;
                        if (i20 == -1) {
                            int i21 = i3 + 1;
                            this.W = i21;
                            this.t0 = i3;
                            i3 = i21;
                        }
                        int i22 = i3 + 1;
                        this.W = i22;
                        this.u0 = i3;
                        if (i20 != -1) {
                            i3 += 2;
                            this.W = i3;
                            this.t0 = i22;
                        } else {
                            i3 = i22;
                        }
                    }
                }
            }
            if (this.b1) {
                if (this.p0 == -1) {
                    int i23 = i3 + 1;
                    this.W = i23;
                    this.p0 = i3;
                    i3 = i23;
                }
                int i24 = i3 + 1;
                this.q0 = i3;
                i3 += 2;
                this.W = i3;
                this.r0 = i24;
            }
        } else {
            if (i5 != 0) {
                i = i3 + 1;
                this.W = i;
                this.p0 = i3;
            } else if (z3 || (this.T.isEmpty() && !(this.x.creator && m9c.D(user)))) {
                int i25 = this.W;
                i = i25 + 1;
                this.W = i;
                this.s0 = i25;
            } else {
                int i26 = this.W;
                this.p0 = i26;
                this.W = i26 + 2;
                this.w0 = i26 + 1;
                if (this.x.creator && m9c.D(user)) {
                    int i27 = this.W;
                    i = i27 + 1;
                    this.W = i;
                    this.x0 = i27;
                } else {
                    int i28 = this.W;
                    i = i28 + 1;
                    this.W = i;
                    this.s0 = i28;
                }
            }
            i3 = i;
        }
        if (i5 == 2) {
            this.W = i3 + 1;
            this.y0 = i3;
        }
        if (z) {
            int i29 = this.t0;
            if (min == -1) {
                if (i29 != -1) {
                    this.a.p(Math.min(i29, this.u0), 2);
                }
            } else if (i29 == -1) {
                this.a.q(min, 2);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
