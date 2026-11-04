package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 {
    public final gi.v5 A;
    public final gi.v5 B;
    public final gi.v5 C;
    public final hi.d D;
    public final hi.d E;
    public final gi.w5 F;
    public final gi.w5 G;
    public final gi.w5 H;
    public final gi.w5 I;
    public final gi.w5 J;
    public final hi.d K;
    public final gi.w5 L;
    public final gi.w5 M;
    public final gi.w5 N;
    public final gi.w5 O;
    public final gi.w5 P;
    public final gi.w5 Q;
    public final gi.w5 R;
    public final gi.w5 S;
    public final gi.w5 T;
    public final gi.v5 U;
    public final gi.w5 V;
    public final gi.w5 W;
    public final gi.w5 X;
    public final gi.w5 Y;
    public final gi.w5 Z;
    public final HashMap a;
    public final gi.w5 a0;
    public final gi.w5 b;
    public final gi.w5 b0;
    public final gi.w5 c;
    public final gi.w5 c0;
    public final gi.w5 d;
    public final gi.w5 d0;
    public final gi.w5 e;
    public final gi.w5 e0;
    public final gi.w5 f;
    public final gi.v5 f0;
    public final gi.v5 g;
    public final gi.v5 g0;
    public final gi.v5 h;
    public final gi.v5 h0;
    public final hi.d i;
    public final gi.v5 i0;
    public final hi.d j;
    public final gi.v5 j0;
    public final hi.d k;
    public final gi.v5 k0;
    public final hi.d l;
    public final gi.v5 l0;
    public final gi.v5 m;
    public final gi.v5 m0;
    public final gi.w5 n;
    public final hi.d n0;
    public final gi.w5 o;
    public final gi.w5 p;
    public final gi.w5 q;
    public final gi.v5 r;
    public final gi.v5 s;
    public final gi.w5 t;
    public final gi.w5 u;
    public final hi.d v;
    public final hi.d w;
    public final gi.w5 x;
    public final gi.w5 y;
    public final gi.w5 z;

    public p0() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.b = d(10, "stars_paid_messages_channel_amount_default");
        this.c = d(850, "stars_suggested_post_commission_permille");
        this.d = d(5, "stars_suggested_post_amount_min");
        this.e = d(100000, "stars_suggested_post_amount_max");
        this.f = d(850, "ton_suggested_post_commission_permille");
        this.g = e(10000000L, "ton_suggested_post_amount_min");
        this.h = e(10000000000000L, "ton_suggested_post_amount_max");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.i = g(86400L, "stars_suggested_post_age_min");
        this.j = g(300L, "stars_suggested_post_future_min");
        this.k = g(2678400L, "stars_suggested_post_future_max");
        hi.d dVar = new hi.d(20);
        hashMap.put("ton_usd_rate", (i0) dVar.b);
        this.l = dVar;
        f("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.m = c("need_age_video_verification", false);
        this.n = d(800, "stars_stargift_resale_commission_permille");
        this.o = d(800, "ton_stargift_resale_commission_permille");
        this.p = d(hs.J1, "stars_stargift_resale_amount_min");
        this.q = d(35000, "stars_stargift_resale_amount_max");
        this.r = e(10000000L, "ton_stargift_resale_amount_min");
        this.s = e(10000000000000L, "ton_stargift_resale_amount_max");
        this.t = d(100, "stargifts_collections_limit");
        d(100, "stargifts_collection_gifts_limit");
        this.u = d(100, "stories_albums_limit");
        d(100, "stories_album_stories_limit");
        this.v = g(30L, "message_typing_draft_ttl");
        this.w = g(10L, "group_call_message_ttl");
        this.x = d(128, "group_call_message_length_limit");
        this.y = d(128, "contact_note_length_limit");
        this.z = d(5, "passkeys_account_passkeys_max");
        boolean z10 = r2.a;
        this.A = c("settings_display_passkeys", true);
        this.B = c("android_disable_blur_in_light_theme", false);
        this.C = c("android_disable_blur_in_dark_theme", false);
        this.D = g(86400L, "no_forwards_request_expire_period");
        this.E = g(2592000L, "poll_close_period_max");
        this.F = f("music_search_username", null);
        this.G = d(12, "poll_answers_max");
        this.H = d(12, "poll_countries_max");
        this.I = d(100, "poll_answer_length_max");
        d(hs.e4, "poll_question_length_max");
        d(hs.e3, "poll_solution_length_max");
        this.J = d(hs.X4, "poll_caption_length_max");
        this.K = g(300L, "poll_answer_delete_period");
        this.L = d(20, "bots_create_limit_default");
        this.M = d(40, "bots_create_limit_premium");
        this.N = d(2, "bot_additional_usernames_limit");
        this.O = f("phone_country_iso2", "en");
        this.P = d(3, "aicompose_tone_examples_num");
        this.Q = d(12, "aicompose_tone_title_length_max");
        this.R = d(1024, "aicompose_tone_prompt_length_max");
        this.S = d(5, "aicompose_tone_saved_limit_default");
        this.T = d(20, "aicompose_tone_saved_limit_premium");
        this.U = c("message_primary_edited_date", false);
        this.V = d(32768, "rich_message_length_limit");
        this.W = d(500, "rich_message_max_blocks");
        this.X = d(16, "rich_message_max_depth");
        this.Y = d(50, "rich_message_max_media");
        this.Z = d(20, "rich_message_max_table_cols");
        this.a0 = f("rich_message_posting", "premium");
        d(100, "community_peers_limit");
        d(100, "community_bot_peers_limit");
        this.b0 = d(TLObject.FLAG_12, "message_length_limit_default");
        this.c0 = d(TLObject.FLAG_13, "message_length_limit_premium");
        this.d0 = d(20, "quick_reply_messages_limit");
        this.e0 = d(5, "ephemeral_welcome_messages_max");
        this.f0 = c("android_audio_recorder_v2_disabled", false);
        this.g0 = c("android_round_video_recorder_v2_disabled", false);
        this.h0 = c("stars_spend_topup_invoice_disabled", false);
        gi.v5 v5Var = new gi.v5("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (o0) v5Var.b);
        this.i0 = v5Var;
        this.j0 = c("wallet_available", true);
        this.k0 = c("wallet_paid_message_recipient_message_amount_check", true);
        this.l0 = e(100000000L, "wallet_transfer_min_nanos");
        e(100000000L, "wallet_gasless_min_nanos");
        gi.v5 v5Var2 = new gi.v5("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (o0) v5Var2.b);
        this.m0 = v5Var2;
        hi.d dVar2 = new hi.d(21);
        hashMap.put("agent_bot_ids", (m0) dVar2.b);
        this.n0 = dVar2;
    }

    public final boolean a(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean z10 = false;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i3);
            k0 k0Var = (k0) this.a.get(tL_jsonObjectValue.key);
            if (k0Var != null) {
                z10 |= k0Var.a(editor, tL_jsonObjectValue.value);
            }
        }
        return z10;
    }

    public final void b(SharedPreferences sharedPreferences) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            try {
                ((k0) it.next()).b(sharedPreferences);
            } catch (ClassCastException e10) {
                a8.g(e10, true);
            }
        }
    }

    public final gi.v5 c(String str, boolean z10) {
        gi.v5 v5Var = new gi.v5(str, z10);
        this.a.put(str, (h0) v5Var.b);
        return v5Var;
    }

    public final gi.w5 d(int i3, String str) {
        gi.w5 w5Var = new gi.w5(str, i3);
        this.a.put(str, (j0) w5Var.b);
        return w5Var;
    }

    public final gi.v5 e(long j10, String str) {
        gi.v5 v5Var = new gi.v5(str, j10);
        this.a.put(str, (l0) v5Var.b);
        return v5Var;
    }

    public final gi.w5 f(String str, String str2) {
        gi.w5 w5Var = new gi.w5(str, str2);
        this.a.put(str, (n0) w5Var.b);
        return w5Var;
    }

    public final hi.d g(long j10, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        hi.d dVar = new hi.d(str, j10);
        this.a.put(str, (l0) dVar.b);
        return dVar;
    }
}
