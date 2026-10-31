package org.telegram.messenger;

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s0 {
    public final l2.f A;
    public final l2.f B;
    public final l2.f C;
    public final o0 D;
    public final o0 E;
    public final n2.u F;
    public final k2.m0 G;
    public final k2.m0 H;
    public final k2.m0 I;
    public final k2.m0 J;
    public final o0 K;
    public final k2.m0 L;
    public final k2.m0 M;
    public final k2.m0 N;
    public final n2.u O;
    public final k2.m0 P;
    public final k2.m0 Q;
    public final k2.m0 R;
    public final k2.m0 S;
    public final k2.m0 T;
    public final l2.f U;
    public final k2.m0 V;
    public final k2.m0 W;
    public final k2.m0 X;
    public final k2.m0 Y;
    public final k2.m0 Z;
    public final HashMap a;
    public final n2.u a0;
    public final k2.m0 b;
    public final k2.m0 b0;
    public final k2.m0 c;
    public final k2.m0 c0;
    public final k2.m0 d;
    public final k2.m0 d0;
    public final k2.m0 e;
    public final k2.m0 e0;
    public final k2.m0 f;
    public final l2.f f0;
    public final o0 g;
    public final l2.f g0;
    public final o0 h;
    public final l2.f h0;
    public final o0 i;
    public final k2.m0 i0;
    public final o0 j;
    public final l2.f j0;
    public final o0 k;
    public final l2.f k0;
    public final n2.u l;
    public final o0 l0;
    public final l2.f m;
    public final k2.m0 m0;
    public final k2.m0 n;
    public final l2.f n0;
    public final k2.m0 o;
    public final k2.m0 p;
    public final k2.m0 q;
    public final o0 r;
    public final o0 s;
    public final k2.m0 t;
    public final k2.m0 u;
    public final o0 v;
    public final o0 w;
    public final k2.m0 x;
    public final k2.m0 y;
    public final k2.m0 z;

    public s0() {
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
        n2.u uVar = new n2.u(3);
        hashMap.put("ton_usd_rate", (k0) uVar.b);
        this.l = uVar;
        f("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.m = c("need_age_video_verification", false);
        this.n = d(800, "stars_stargift_resale_commission_permille");
        this.o = d(800, "ton_stargift_resale_commission_permille");
        this.p = d(zs.J1, "stars_stargift_resale_amount_min");
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
        boolean z10 = v2.a;
        this.A = c("settings_display_passkeys", true);
        this.B = c("android_disable_blur_in_light_theme", false);
        this.C = c("android_disable_blur_in_dark_theme", false);
        this.D = g(86400L, "no_forwards_request_expire_period");
        this.E = g(2592000L, "poll_close_period_max");
        this.F = f("music_search_username", null);
        this.G = d(12, "poll_answers_max");
        this.H = d(12, "poll_countries_max");
        this.I = d(100, "poll_answer_length_max");
        d(zs.e4, "poll_question_length_max");
        d(zs.e3, "poll_solution_length_max");
        this.J = d(zs.X4, "poll_caption_length_max");
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
        k2.m0 m0Var = new k2.m0("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (r0) m0Var.a);
        this.i0 = m0Var;
        this.j0 = c("wallet_available", true);
        this.k0 = c("wallet_paid_message_recipient_message_amount_check", true);
        this.l0 = e(100000000L, "wallet_transfer_min_nanos");
        e(100000000L, "wallet_gasless_min_nanos");
        k2.m0 m0Var2 = new k2.m0("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (r0) m0Var2.a);
        this.m0 = m0Var2;
        l2.f fVar = new l2.f(8);
        hashMap.put("agent_bot_ids", (p0) fVar.b);
        this.n0 = fVar;
    }

    public final boolean a(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i10);
            m0 m0Var = (m0) this.a.get(tL_jsonObjectValue.key);
            if (m0Var != null) {
                z10 |= m0Var.a(editor, tL_jsonObjectValue.value);
            }
        }
        return z10;
    }

    public final void b(SharedPreferences sharedPreferences) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            try {
                ((m0) it.next()).b(sharedPreferences);
            } catch (ClassCastException e) {
                f8.g(e, true);
            }
        }
    }

    public final l2.f c(String str, boolean z10) {
        l2.f fVar = new l2.f(str, z10);
        this.a.put(str, (j0) fVar.b);
        return fVar;
    }

    public final k2.m0 d(int i10, String str) {
        k2.m0 m0Var = new k2.m0();
        m0Var.a = new l0(str, i10);
        this.a.put(str, (l0) m0Var.a);
        return m0Var;
    }

    public final o0 e(long j10, String str) {
        o0 o0Var = new o0(str, j10, 0);
        this.a.put(str, o0Var.a);
        return o0Var;
    }

    public final n2.u f(String str, String str2) {
        n2.u uVar = new n2.u(str, str2);
        this.a.put(str, (q0) uVar.b);
        return uVar;
    }

    public final o0 g(long j10, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        o0 o0Var = new o0(str, j10, 1);
        this.a.put(str, o0Var.a);
        return o0Var;
    }
}
