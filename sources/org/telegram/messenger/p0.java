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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class p0 {
    public final h6.o A;
    public final h6.o B;
    public final hi.u0 C;
    public final hi.u0 D;
    public final hi.u0 E;
    public final j6.r F;
    public final j6.r G;
    public final j6.r H;
    public final h6.o I;
    public final h6.o J;
    public final hi.u0 K;
    public final hi.u0 L;
    public final hi.u0 M;
    public final hi.u0 N;
    public final hi.u0 O;
    public final h6.o P;
    public final hi.u0 Q;
    public final hi.u0 R;
    public final hi.u0 S;
    public final hi.u0 T;
    public final hi.u0 U;
    public final hi.u0 V;
    public final hi.u0 W;
    public final hi.u0 X;
    public final hi.u0 Y;
    public final j6.r Z;
    public final HashMap a;
    public final hi.u0 a0;
    public final hi.u0 b;
    public final hi.u0 b0;
    public final hi.u0 c;
    public final hi.u0 c0;
    public final hi.u0 d;
    public final hi.u0 d0;
    public final hi.u0 e;
    public final hi.u0 e0;
    public final hi.u0 f;
    public final hi.u0 f0;
    public final j6.r g;
    public final hi.u0 g0;
    public final j6.r h;
    public final hi.u0 h0;
    public final h6.o i;
    public final hi.u0 i0;
    public final h6.o j;
    public final hi.u0 j0;
    public final h6.o k;
    public final hi.u0 k0;
    public final h6.o l;
    public final j6.r l0;
    public final j6.r m;
    public final j6.r m0;
    public final hi.u0 n;
    public final j6.r n0;
    public final hi.u0 o;
    public final j6.r o0;
    public final hi.u0 p;
    public final j6.r p0;
    public final hi.u0 q;
    public final j6.r q0;
    public final j6.r r;
    public final j6.r r0;
    public final j6.r s;
    public final j6.r s0;
    public final j6.r t;
    public final h6.o t0;
    public final j6.r u;
    public final j6.r u0;
    public final hi.u0 v;
    public final hi.u0 v0;
    public final hi.u0 w;
    public final j6.r x;
    public final hi.u0 y;
    public final hi.u0 z;

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
        h6.o oVar = new h6.o(22);
        hashMap.put("ton_usd_rate", (i0) oVar.b);
        this.l = oVar;
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
        j6.r rVar = new j6.r("bot_allowed_suffixes", Collections.singleton("bot"));
        hashMap.put("bot_allowed_suffixes", (o0) rVar.b);
        this.o0 = rVar;
        this.p0 = d("wallet_available", true);
        this.q0 = d("wallet_paid_message_recipient_message_amount_check", true);
        this.r0 = f(100000000L, "wallet_transfer_min_nanos");
        f(100000000L, "wallet_gasless_min_nanos");
        j6.r rVar2 = new j6.r("wallet_card_bg_gifts", Collections.EMPTY_SET);
        hashMap.put("wallet_card_bg_gifts", (o0) rVar2.b);
        this.s0 = rVar2;
        h6.o oVar2 = new h6.o(23);
        hashMap.put("agent_bot_ids", (m0) oVar2.b);
        this.t0 = oVar2;
        this.u0 = d("widgets_disabled", false);
        this.v0 = e(6, "widgets_processes");
    }

    public static String i(hi.u0 u0Var) {
        String str = ((n0) u0Var.b).c;
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

    public final j6.r d(String str, boolean z10) {
        j6.r rVar = new j6.r(str, z10);
        this.a.put(str, (h0) rVar.b);
        return rVar;
    }

    public final hi.u0 e(int i7, String str) {
        hi.u0 u0Var = new hi.u0(str, i7);
        this.a.put(str, (j0) u0Var.b);
        return u0Var;
    }

    public final j6.r f(long j3, String str) {
        j6.r rVar = new j6.r(str, j3);
        this.a.put(str, (l0) rVar.b);
        return rVar;
    }

    public final hi.u0 g(String str, String str2) {
        hi.u0 u0Var = new hi.u0(str, str2);
        this.a.put(str, (n0) u0Var.b);
        return u0Var;
    }

    public final h6.o h(long j3, String str) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        h6.o oVar = new h6.o(str, j3);
        this.a.put(str, (l0) oVar.b);
        return oVar;
    }
}
