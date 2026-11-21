package org.telegram.messenger;

import android.content.SharedPreferences;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class p0 {
    public final hi.w4 A;
    public final hi.w4 B;
    public final hi.t5 C;
    public final hi.t5 D;
    public final hi.t5 E;
    public final h9.g1 F;
    public final h9.g1 G;
    public final h9.g1 H;
    public final hi.w4 I;
    public final hi.w4 J;
    public final hi.t5 K;
    public final hi.t5 L;
    public final hi.t5 M;
    public final hi.t5 N;
    public final hi.t5 O;
    public final hi.w4 P;
    public final hi.t5 Q;
    public final hi.t5 R;
    public final hi.t5 S;
    public final hi.t5 T;
    public final hi.t5 U;
    public final hi.t5 V;
    public final hi.t5 W;
    public final hi.t5 X;
    public final hi.t5 Y;
    public final h9.g1 Z;
    public final HashMap a;
    public final hi.t5 a0;
    public final hi.t5 b;
    public final hi.t5 b0;
    public final hi.t5 c;
    public final hi.t5 c0;
    public final hi.t5 d;
    public final hi.t5 d0;
    public final hi.t5 e;
    public final hi.t5 e0;
    public final hi.t5 f;
    public final hi.t5 f0;
    public final h9.g1 g;
    public final hi.t5 g0;
    public final h9.g1 h;
    public final hi.t5 h0;
    public final hi.w4 i;
    public final hi.t5 i0;
    public final hi.w4 j;
    public final hi.t5 j0;
    public final hi.w4 k;
    public final hi.t5 k0;
    public final hi.w4 l;
    public final h9.g1 l0;
    public final h9.g1 m;
    public final h9.g1 m0;
    public final hi.t5 n;
    public final h9.g1 n0;
    public final hi.t5 o;
    public final h9.g1 o0;
    public final hi.t5 p;
    public final h9.g1 p0;
    public final hi.t5 q;
    public final h9.g1 q0;
    public final h9.g1 r;
    public final h9.g1 r0;
    public final h9.g1 s;
    public final h9.g1 s0;
    public final h9.g1 t;
    public final hi.w4 t0;
    public final h9.g1 u;
    public final h9.g1 u0;
    public final hi.t5 v;
    public final hi.t5 v0;
    public final hi.t5 w;
    public final h9.g1 x;
    public final hi.t5 y;
    public final hi.t5 z;

    public p0() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        this.b = e(10, "stars_paid_messages_channel_amount_default");
        this.c = e(850, "stars_suggested_post_commission_permille");
        this.d = e(5, "stars_suggested_post_amount_min");
        this.e = e(100000, "stars_suggested_post_amount_max");
        this.f = e(850, "ton_suggested_post_commission_permille");
        this.g = f(10000000L, "ton_suggested_post_amount_min");
        this.h = f(10000000000000L, "ton_suggested_post_amount_max");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.i = h(86400L, "stars_suggested_post_age_min");
        this.j = h(300L, "stars_suggested_post_future_min");
        this.k = h(2678400L, "stars_suggested_post_future_max");
        hi.w4 w4Var = new hi.w4(20);
        hashMap.put("ton_usd_rate", (i0) w4Var.b);
        this.l = w4Var;
        g("stars_rating_learnmore_url", "https://telegram.org/blog/telegram-stars");
        this.m = d("need_age_video_verification", false);
        this.n = e(800, "stars_stargift_resale_commission_permille");
        this.o = e(800, "ton_stargift_resale_commission_permille");
        this.p = e(ks.J1, "stars_stargift_resale_amount_min");
        this.q = e(35000, "stars_stargift_resale_amount_max");
        this.r = f(10000000L, "ton_stargift_resale_amount_min");
        this.s = f(10000000000000L, "ton_stargift_resale_amount_max");
        this.t = d("stargifts_fragment_resale_enabled", false);
        this.u = d("stargifts_fixed_sale_enabled", false);
        this.v = g("stargifts_stars_resale", "default");
        this.w = g("stargifts_ton_resale", "default");
        this.x = d("stargifts_craft_minted_first_source", false);
        this.y = e(100, "stargifts_collections_limit");
        e(100, "stargifts_collection_gifts_limit");
        this.z = e(100, "stories_albums_limit");
        e(100, "stories_album_stories_limit");
        this.A = h(30L, "message_typing_draft_ttl");
        this.B = h(10L, "group_call_message_ttl");
        this.C = e(128, "group_call_message_length_limit");
        this.D = e(128, "contact_note_length_limit");
        this.E = e(5, "passkeys_account_passkeys_max");
        boolean z10 = s2.a;
        this.F = d("settings_display_passkeys", true);
        this.G = d("android_disable_blur_in_light_theme", false);
        this.H = d("android_disable_blur_in_dark_theme", false);
        this.I = h(86400L, "no_forwards_request_expire_period");
        this.J = h(2592000L, "poll_close_period_max");
        this.K = g("music_search_username", null);
        this.L = e(12, "poll_answers_max");
        this.M = e(12, "poll_countries_max");
        this.N = e(100, "poll_answer_length_max");
        e(ks.e4, "poll_question_length_max");
        e(ks.e3, "poll_solution_length_max");
        this.O = e(ks.X4, "poll_caption_length_max");
        this.P = h(300L, "poll_answer_delete_period");
        this.Q = e(20, "bots_create_limit_default");
        this.R = e(40, "bots_create_limit_premium");
        this.S = e(2, "bot_additional_usernames_limit");
        this.T = g("phone_country_iso2", "en");
        this.U = e(3, "aicompose_tone_examples_num");
        this.V = e(12, "aicompose_tone_title_length_max");
        this.W = e(1024, "aicompose_tone_prompt_length_max");
        this.X = e(5, "aicompose_tone_saved_limit_default");
        this.Y = e(20, "aicompose_tone_saved_limit_premium");
        this.Z = d("message_primary_edited_date", false);
        this.a0 = e(32768, "rich_message_length_limit");
        this.b0 = e(500, "rich_message_max_blocks");
        this.c0 = e(16, "rich_message_max_depth");
        this.d0 = e(50, "rich_message_max_media");
        this.e0 = e(20, "rich_message_max_table_cols");
        this.f0 = g("rich_message_posting", "premium");
        this.g0 = g("speech_to_text", "enabled");
        e(100, "community_peers_limit");
        e(100, "community_bot_peers_limit");
        this.h0 = e(TLObject.FLAG_12, "message_length_limit_default");
        this.i0 = e(TLObject.FLAG_13, "message_length_limit_premium");
        this.j0 = e(20, "quick_reply_messages_limit");
        this.k0 = e(5, "ephemeral_welcome_messages_max");
        this.l0 = d("android_audio_recorder_v2_disabled", false);
        this.m0 = d("android_round_video_recorder_v2_disabled", false);
        this.n0 = d("stars_spend_topup_invoice_disabled", false);
        h9.g1 g1Var = new h9.g1("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (o0) g1Var.b);
        this.o0 = g1Var;
        this.p0 = d("wallet_available", true);
        this.q0 = d("wallet_paid_message_recipient_message_amount_check", true);
        this.r0 = f(100000000L, "wallet_transfer_min_nanos");
        f(100000000L, "wallet_gasless_min_nanos");
        h9.g1 g1Var2 = new h9.g1("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (o0) g1Var2.b);
        this.s0 = g1Var2;
        hi.w4 w4Var2 = new hi.w4(21);
        hashMap.put("agent_bot_ids", (m0) w4Var2.b);
        this.t0 = w4Var2;
        this.u0 = d("widgets_disabled", false);
        this.v0 = e(6, "widgets_processes");
    }

    public static String i(hi.t5 t5Var) {
        String str = ((n0) t5Var.b).c;
        return ("visible".equals(str) || "hidden".equals(str)) ? str : "default";
    }

    public final boolean a(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject) {
        int size = tL_jsonObject.value.size();
        boolean z10 = false;
        for (int i7 = 0; i7 < size; i7++) {
            TLRPC.TL_jsonObjectValue tL_jsonObjectValue = tL_jsonObject.value.get(i7);
            k0 k0Var = (k0) this.a.get(tL_jsonObjectValue.key);
            if (k0Var != null) {
                z10 |= k0Var.a(editor, tL_jsonObjectValue.value);
            }
        }
        TLRPC.TL_jsonString tL_jsonString = new TLRPC.TL_jsonString();
        tL_jsonString.value = "default";
        boolean b10 = b(editor, tL_jsonObject, "stargifts_stars_resale", tL_jsonString) | z10;
        TLRPC.TL_jsonString tL_jsonString2 = new TLRPC.TL_jsonString();
        tL_jsonString2.value = "default";
        boolean b11 = b10 | b(editor, tL_jsonObject, "stargifts_ton_resale", tL_jsonString2);
        TLRPC.TL_jsonBool tL_jsonBool = new TLRPC.TL_jsonBool();
        tL_jsonBool.value = false;
        boolean b12 = b11 | b(editor, tL_jsonObject, "stargifts_fragment_resale_enabled", tL_jsonBool);
        TLRPC.TL_jsonBool tL_jsonBool2 = new TLRPC.TL_jsonBool();
        tL_jsonBool2.value = false;
        boolean b13 = b12 | b(editor, tL_jsonObject, "stargifts_fixed_sale_enabled", tL_jsonBool2);
        boolean z11 = s2.a;
        TLRPC.TL_jsonBool tL_jsonBool3 = new TLRPC.TL_jsonBool();
        tL_jsonBool3.value = true;
        boolean b14 = b(editor, tL_jsonObject, "wallet_available", tL_jsonBool3) | b13;
        if (((h0) this.u0.b).c) {
            ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.n0.a;
            g0.g3(new cd0(18));
        }
        return b14;
    }

    public final boolean b(SharedPreferences.Editor editor, TLRPC.TL_jsonObject tL_jsonObject, String str, TLRPC.JSONValue jSONValue) {
        int size = tL_jsonObject.value.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                k0 k0Var = (k0) this.a.get(str);
                if (k0Var != null) {
                    return k0Var.a(editor, jSONValue);
                }
            } else {
                if (str.equals(tL_jsonObject.value.get(i7).key)) {
                    break;
                }
                i7++;
            }
        }
        return false;
    }

    public final void c(SharedPreferences sharedPreferences) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            try {
                ((k0) it.next()).b(sharedPreferences);
            } catch (ClassCastException e10) {
                a8.g(e10, true);
            }
        }
    }

    public final h9.g1 d(String str, boolean z10) {
        h9.g1 g1Var = new h9.g1(str, z10);
        this.a.put(str, (h0) g1Var.b);
        return g1Var;
    }

    public final hi.t5 e(int i7, String str) {
        hi.t5 t5Var = new hi.t5(str, i7);
        this.a.put(str, (j0) t5Var.b);
        return t5Var;
    }

    public final h9.g1 f(long j3, String str) {
        h9.g1 g1Var = new h9.g1(str, j3);
        this.a.put(str, (l0) g1Var.b);
        return g1Var;
    }

    public final hi.t5 g(String str, String str2) {
        hi.t5 t5Var = new hi.t5(str, str2);
        this.a.put(str, (n0) t5Var.b);
        return t5Var;
    }

    public final hi.w4 h(long j3, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        hi.w4 w4Var = new hi.w4(str, j3);
        this.a.put(str, (l0) w4Var.b);
        return w4Var;
    }
}
