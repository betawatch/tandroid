package org.telegram.messenger;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLiteException;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class yr extends c1 {
    public static volatile yr[] e0 = new yr[4];
    public static final Object[] f0 = new Object[4];
    public static final String[] g0;
    public int D;
    public int E;
    public int F;
    public int G;
    public final ArrayList H;
    public final SparseArray I;
    public final a0.h J;
    public int K;
    public int L;
    public volatile int M;
    public volatile int N;
    public boolean O;
    public final CountDownLatch P;
    public boolean Q;
    public final LongSparseIntArray R;
    public boolean S;
    public final int[][] T;
    public final int[][] U;
    public final int[][] V;
    public final int[][] W;
    public final int[][] X;
    public final int[][] Y;
    public final int[] Z;
    public final p5 a;
    public final int[] a0;
    public SQLiteDatabase b;
    public final a0.h b0;
    public File c;
    public final a0.h c0;
    public File d;
    public final d6.i d0;
    public File e;
    public final AtomicLong f;
    public final SparseArray h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public byte[] y;

    static {
        for (int i7 = 0; i7 < 4; i7++) {
            f0[i7] = new Object();
        }
        g0 = new String[]{"messages_holes", "media_holes_v2", "scheduled_messages_v2", "quick_replies", "messages_v2", "download_queue", "user_contacts_v7", "user_phones_v7", "dialogs", "dialog_filter", "dialog_filter_ep", "dialog_filter_pin_v2", "randoms_v2", "enc_tasks_v4", "messages_seq", "params", "media_v4", "bot_keyboard", "bot_keyboard_topics", "chat_settings_v2", "user_settings", "chat_pinned_v2", "chat_pinned_count", "chat_hints", "botcache", "users_data", "users", "chats", "enc_chats", "channel_users_v2", "channel_admins_v3", "contacts", "dialog_photos", "dialog_settings", "web_recent_v3", "stickers_v2", "stickers_featured", "stickers_dice", "stickersets", "hashtag_recent_v2", "webpage_pending_v2", "sent_files_v2", "search_recent", "media_counts_v2", "keyvalue", "bot_info_v2", "pending_tasks", "requested_holes", "sharing_locations", "shortcut_widget", "emoji_keywords_v2", "emoji_keywords_info_v2", "wallpapers2", "unread_push_messages", "polls_v2", "reactions", "reaction_mentions", "downloading_documents", "animated_emoji", "attach_menu_bots", "premium_promo", "emoji_statuses", "messages_holes_topics", "messages_topics", "saved_dialogs", "media_topics", "media_holes_topics", "topics", "media_counts_topics", "reaction_mentions_topics", "emoji_groups", "poll_votes_mentions", "poll_votes_mentions_topics", "ephemeral_messages", "widget_state", "widget_heights"};
    }

    public yr(int i7) {
        super(i7);
        this.f = new AtomicLong(System.currentTimeMillis());
        this.h = new SparseArray();
        this.n = 0;
        this.r = 0;
        this.s = 0;
        this.w = 0;
        this.x = 0;
        this.y = null;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = new ArrayList();
        this.I = new SparseArray();
        this.J = new a0.h();
        this.P = new CountDownLatch(1);
        this.R = new LongSparseIntArray();
        this.T = new int[][]{new int[2], new int[2]};
        this.U = new int[][]{new int[2], new int[2]};
        this.V = new int[][]{new int[2], new int[2]};
        this.W = new int[][]{new int[2], new int[2]};
        this.X = new int[][]{new int[2], new int[2]};
        this.Y = new int[][]{new int[2], new int[2]};
        this.Z = new int[2];
        this.a0 = new int[2];
        this.b0 = new a0.h();
        this.c0 = new a0.h();
        this.d0 = new d6.i(10);
        p5 p5Var = new p5(jg.g.j(i7, "storageQueue_"));
        this.a = p5Var;
        p5Var.setPriority(8);
        p5Var.c(new rq(this, 8));
    }

    public static void A(SQLiteDatabase sQLiteDatabase) {
        k5.v(sQLiteDatabase, "CREATE TABLE messages_holes(uid INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_dialogs ON messages_holes(uid, end);", "CREATE TABLE media_holes_v2(uid INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_v2 ON media_holes_v2(uid, type, end);");
        k5.v(sQLiteDatabase, "CREATE TABLE scheduled_messages_v2(mid INTEGER, uid INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS send_state_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_date_idx_scheduled_messages_v2 ON scheduled_messages_v2(uid, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_scheduled_messages_v2 ON scheduled_messages_v2(mid, reply_to_message_id);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS idx_to_reply_scheduled_messages_v2 ON scheduled_messages_v2(reply_to_message_id, mid);", "CREATE TABLE messages_v2(mid INTEGER, uid INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, group_id INTEGER, reply_to_story_id INTEGER, PRIMARY KEY(mid, uid))", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_v2 ON messages_v2(uid, mid, read_state, out);", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_v2 ON messages_v2(uid, date, mid);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_v2 ON messages_v2(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_v2 ON messages_v2(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_v2 ON messages_v2(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_v2 ON messages_v2(uid, mention, read_state);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_v2 ON messages_v2(mid, is_channel);", "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_v2 ON messages_v2(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_v2 ON messages_v2(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS uid_mid_groupid_messages_v2 ON messages_v2(uid, mid, group_id);");
        k5.v(sQLiteDatabase, "CREATE TABLE saved_dialogs(did INTEGER, date INTEGER, last_mid INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, last_mid_group INTEGER, count INTEGER, forumChatId INTEGER, unread_count INTEGER, max_read_id INTEGER, read_outbox INTEGER, PRIMARY KEY (did, forumChatId))", "CREATE INDEX IF NOT EXISTS date_idx_4_saved_dialogs ON saved_dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_saved_dialogs ON saved_dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_saved_dialogs ON saved_dialogs(folder_id);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS flags_idx_4_saved_dialogs ON saved_dialogs(flags);", "CREATE INDEX IF NOT EXISTS forum_idx_dialogs ON saved_dialogs(forumChatId);", "CREATE TABLE download_queue(uid INTEGER, type INTEGER, date INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type));", "CREATE INDEX IF NOT EXISTS type_date_idx_download_queue ON download_queue(type, date);");
        k5.v(sQLiteDatabase, "CREATE TABLE user_contacts_v7(key TEXT PRIMARY KEY, uid INTEGER, fname TEXT, sname TEXT, imported INTEGER)", "CREATE TABLE user_phones_v7(key TEXT, phone TEXT, sphone TEXT, deleted INTEGER, PRIMARY KEY (key, phone))", "CREATE INDEX IF NOT EXISTS sphone_deleted_idx_user_phones ON user_phones_v7(sphone, deleted);", "CREATE TABLE dialogs(did INTEGER PRIMARY KEY, date INTEGER, unread_count INTEGER, last_mid INTEGER, inbox_max INTEGER, outbox_max INTEGER, last_mid_i INTEGER, unread_count_i INTEGER, pts INTEGER, date_i INTEGER, pinned INTEGER, flags INTEGER, folder_id INTEGER, data BLOB, unread_reactions INTEGER, last_mid_group INTEGER, ttl_period INTEGER, unread_poll_votes INTEGER)");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS date_idx_4_dialogs ON dialogs(date);", "CREATE INDEX IF NOT EXISTS last_mid_idx_4_dialogs ON dialogs(last_mid);", "CREATE INDEX IF NOT EXISTS unread_count_idx_dialogs ON dialogs(unread_count);", "CREATE INDEX IF NOT EXISTS last_mid_i_idx_dialogs ON dialogs(last_mid_i);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_count_i_idx_dialogs ON dialogs(unread_count_i);", "CREATE INDEX IF NOT EXISTS folder_id_idx_4_dialogs ON dialogs(folder_id);", "CREATE INDEX IF NOT EXISTS flags_idx_4_dialogs ON dialogs(flags);", "CREATE TABLE dialog_filter(id INTEGER PRIMARY KEY, ord INTEGER, unread_count INTEGER, flags INTEGER, title TEXT, color INTEGER DEFAULT -1, entities BLOB, noanimate INTEGER)");
        k5.v(sQLiteDatabase, "CREATE TABLE dialog_filter_ep(id INTEGER, peer INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE dialog_filter_pin_v2(id INTEGER, peer INTEGER, pin INTEGER, PRIMARY KEY (id, peer))", "CREATE TABLE randoms_v2(random_id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (random_id, mid, uid))", "CREATE INDEX IF NOT EXISTS mid_idx_randoms_v2 ON randoms_v2(mid, uid);");
        k5.v(sQLiteDatabase, "CREATE TABLE enc_tasks_v4(mid INTEGER, uid INTEGER, date INTEGER, media INTEGER, PRIMARY KEY(mid, uid, media))", "CREATE INDEX IF NOT EXISTS date_idx_enc_tasks_v4 ON enc_tasks_v4(date);", "CREATE TABLE messages_seq(mid INTEGER PRIMARY KEY, seq_in INTEGER, seq_out INTEGER);", "CREATE INDEX IF NOT EXISTS seq_idx_messages_seq ON messages_seq(seq_in, seq_out);");
        k5.v(sQLiteDatabase, "CREATE TABLE params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)", "INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)", "CREATE TABLE media_v4(mid INTEGER, uid INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_v4 ON media_v4(uid, mid, type, date);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_type_date_mid_idx_media_v4 ON media_v4(uid, type, date DESC, mid DESC);", "CREATE INDEX IF NOT EXISTS media_v4_music_browse_idx ON media_v4(uid, date DESC, mid DESC) WHERE type = 4 AND mid > 0 AND uid != 0;", "CREATE TABLE bot_keyboard(uid INTEGER PRIMARY KEY, mid INTEGER, info BLOB)", "CREATE INDEX IF NOT EXISTS bot_keyboard_idx_mid_v2 ON bot_keyboard(mid, uid);");
        k5.v(sQLiteDatabase, "CREATE TABLE bot_keyboard_topics(uid INTEGER, tid INTEGER, mid INTEGER, info BLOB, PRIMARY KEY(uid, tid))", "CREATE INDEX IF NOT EXISTS bot_keyboard_topics_idx_mid_v2 ON bot_keyboard_topics(mid, uid, tid);", "CREATE TABLE chat_settings_v2(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER, online INTEGER, inviter INTEGER, links INTEGER, participants_count INTEGER)", "CREATE INDEX IF NOT EXISTS chat_settings_pinned_idx ON chat_settings_v2(uid, pinned) WHERE pinned != 0;");
        k5.v(sQLiteDatabase, "CREATE TABLE user_settings(uid INTEGER PRIMARY KEY, info BLOB, pinned INTEGER)", "CREATE INDEX IF NOT EXISTS user_settings_pinned_idx ON user_settings(uid, pinned) WHERE pinned != 0;", "CREATE TABLE chat_pinned_v2(uid INTEGER, mid INTEGER, data BLOB, PRIMARY KEY (uid, mid));", "CREATE TABLE chat_pinned_count(uid INTEGER PRIMARY KEY, count INTEGER, end INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE chat_hints(did INTEGER, type INTEGER, rating REAL, date INTEGER, PRIMARY KEY(did, type))", "CREATE INDEX IF NOT EXISTS chat_hints_rating_idx ON chat_hints(rating);", "CREATE TABLE botcache(id TEXT PRIMARY KEY, date INTEGER, data BLOB)", "CREATE INDEX IF NOT EXISTS botcache_date_idx ON botcache(date);");
        k5.v(sQLiteDatabase, "CREATE TABLE users_data(uid INTEGER PRIMARY KEY, about TEXT)", "CREATE TABLE users(uid INTEGER PRIMARY KEY, name TEXT, status INTEGER, data BLOB)", "CREATE TABLE chats(uid INTEGER PRIMARY KEY, name TEXT, data BLOB)", "CREATE TABLE enc_chats(uid INTEGER PRIMARY KEY, user INTEGER, name TEXT, data BLOB, g BLOB, authkey BLOB, ttl INTEGER, layer INTEGER, seq_in INTEGER, seq_out INTEGER, use_count INTEGER, exchange_id INTEGER, key_date INTEGER, fprint INTEGER, fauthkey BLOB, khash BLOB, in_seq_no INTEGER, admin_id INTEGER, mtproto_seq INTEGER)");
        k5.v(sQLiteDatabase, "CREATE TABLE channel_users_v2(did INTEGER, uid INTEGER, date INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE channel_admins_v3(did INTEGER, uid INTEGER, data BLOB, PRIMARY KEY(did, uid))", "CREATE TABLE contacts(uid INTEGER PRIMARY KEY, mutual INTEGER)", "CREATE TABLE dialog_photos(uid INTEGER, id INTEGER, num INTEGER, data BLOB, PRIMARY KEY (uid, id))");
        k5.v(sQLiteDatabase, "CREATE TABLE dialog_photos_count(uid INTEGER PRIMARY KEY, count INTEGER)", "CREATE TABLE dialog_settings(did INTEGER PRIMARY KEY, flags INTEGER);", "CREATE TABLE web_recent_v3(id TEXT, type INTEGER, image_url TEXT, thumb_url TEXT, local_url TEXT, width INTEGER, height INTEGER, size INTEGER, date INTEGER, document BLOB, PRIMARY KEY (id, type));", "CREATE TABLE stickers_v2(id INTEGER PRIMARY KEY, data BLOB, date INTEGER, hash INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE stickers_featured(id INTEGER PRIMARY KEY, data BLOB, unread BLOB, date INTEGER, hash INTEGER, premium INTEGER, emoji INTEGER);", "CREATE TABLE stickers_dice(emoji TEXT PRIMARY KEY, data BLOB, date INTEGER);", "CREATE TABLE hashtag_recent_v2(id TEXT PRIMARY KEY, date INTEGER);", "CREATE TABLE webpage_pending_v2(id INTEGER, mid INTEGER, uid INTEGER, PRIMARY KEY (id, mid, uid));");
        k5.v(sQLiteDatabase, "CREATE TABLE sent_files_v2(uid TEXT, type INTEGER, data BLOB, parent TEXT, PRIMARY KEY (uid, type))", "CREATE TABLE search_recent(did INTEGER PRIMARY KEY, date INTEGER);", "CREATE TABLE media_counts_v2(uid INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, type))", "CREATE TABLE keyvalue(id TEXT PRIMARY KEY, value TEXT)");
        k5.v(sQLiteDatabase, "CREATE TABLE bot_info_v2(uid INTEGER, dialogId INTEGER, info BLOB, PRIMARY KEY(uid, dialogId))", "CREATE TABLE pending_tasks(id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE requested_holes(uid INTEGER, seq_out_start INTEGER, seq_out_end INTEGER, PRIMARY KEY (uid, seq_out_start, seq_out_end));", "CREATE TABLE sharing_locations(uid INTEGER PRIMARY KEY, mid INTEGER, date INTEGER, period INTEGER, message BLOB, proximity INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE stickersets2(id INTEGER PRIMATE KEY, data BLOB, hash INTEGER, date INTEGER, short_name TEXT);", "CREATE INDEX IF NOT EXISTS stickersets2_id_index ON stickersets2(id);", "CREATE INDEX IF NOT EXISTS stickersets2_id_short_name ON stickersets2(id, short_name);", "CREATE INDEX IF NOT EXISTS stickers_featured_emoji_index ON stickers_featured(emoji);");
        k5.v(sQLiteDatabase, "CREATE TABLE shortcut_widget(id INTEGER, did INTEGER, ord INTEGER, PRIMARY KEY (id, did));", "CREATE INDEX IF NOT EXISTS shortcut_widget_did ON shortcut_widget(did);", "CREATE TABLE emoji_keywords_v2(lang TEXT, keyword TEXT, emoji TEXT, PRIMARY KEY(lang, keyword, emoji));", "CREATE INDEX IF NOT EXISTS emoji_keywords_v2_keyword ON emoji_keywords_v2(keyword);");
        k5.v(sQLiteDatabase, "CREATE TABLE emoji_keywords_info_v2(lang TEXT PRIMARY KEY, alias TEXT, version INTEGER, date INTEGER);", "CREATE TABLE wallpapers2(uid INTEGER PRIMARY KEY, data BLOB, num INTEGER)", "CREATE INDEX IF NOT EXISTS wallpapers_num ON wallpapers2(num);", "CREATE TABLE unread_push_messages(uid INTEGER, mid INTEGER, random INTEGER, date INTEGER, data BLOB, fm TEXT, name TEXT, uname TEXT, flags INTEGER, topicId INTEGER, is_reaction INTEGER, PRIMARY KEY(uid, mid))");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_date ON unread_push_messages(date);", "CREATE INDEX IF NOT EXISTS unread_push_messages_idx_random ON unread_push_messages(random);", "CREATE TABLE polls_v2(mid INTEGER, uid INTEGER, id INTEGER, PRIMARY KEY (mid, uid));", "CREATE INDEX IF NOT EXISTS polls_id_v2 ON polls_v2(id);");
        k5.v(sQLiteDatabase, "CREATE TABLE reactions(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE reaction_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_did ON reaction_mentions(dialog_id);", "CREATE TABLE downloading_documents(data BLOB, hash INTEGER, id INTEGER, state INTEGER, date INTEGER, PRIMARY KEY(hash, id));");
        k5.v(sQLiteDatabase, "CREATE TABLE animated_emoji(document_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE attach_menu_bots(data BLOB, hash INTEGER, date INTEGER);", "CREATE TABLE premium_promo(data BLOB, date INTEGER);", "CREATE TABLE emoji_statuses(data BLOB, type INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE messages_holes_topics(uid INTEGER, topic_id INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, start));", "CREATE INDEX IF NOT EXISTS uid_end_messages_holes_4_topics ON messages_holes_topics(uid, topic_id, end);", "CREATE TABLE messages_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, read_state INTEGER, send_state INTEGER, date INTEGER, data BLOB, out INTEGER, ttl INTEGER, media INTEGER, replydata BLOB, imp INTEGER, mention INTEGER, forwards INTEGER, replies_data BLOB, thread_reply_id INTEGER, is_channel INTEGER, reply_to_message_id INTEGER, custom_params BLOB, reply_to_story_id INTEGER, PRIMARY KEY(mid, topic_id, uid))", "CREATE INDEX IF NOT EXISTS uid_date_mid_idx_messages_topics ON messages_topics(uid, date, mid);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS mid_out_idx_messages_topics ON messages_topics(mid, out);", "CREATE INDEX IF NOT EXISTS task_idx_messages_topics ON messages_topics(uid, out, read_state, ttl, date, send_state);", "CREATE INDEX IF NOT EXISTS send_state_idx_messages_topics ON messages_topics(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS is_channel_idx_messages_topics ON messages_topics(mid, is_channel);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_messages_topics ON messages_topics(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_messages_topics ON messages_topics(reply_to_message_id, mid);", "CREATE INDEX IF NOT EXISTS mid_uid_messages_topics ON messages_topics(mid, uid);", "CREATE INDEX IF NOT EXISTS uid_mid_read_out_idx_messages_topics ON messages_topics(uid, topic_id, mid, read_state, out);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS uid_mention_idx_messages_topics ON messages_topics(uid, topic_id, mention, read_state);", "CREATE INDEX IF NOT EXISTS uid_topic_id_messages_topics ON messages_topics(uid, topic_id);", "CREATE INDEX IF NOT EXISTS uid_topic_id_date_mid_messages_topics ON messages_topics(uid, topic_id, date, mid);", "CREATE INDEX IF NOT EXISTS uid_topic_id_mid_messages_topics ON messages_topics(uid, topic_id, mid);");
        k5.v(sQLiteDatabase, "CREATE TABLE media_topics(mid INTEGER, uid INTEGER, topic_id INTEGER, date INTEGER, type INTEGER, data BLOB, PRIMARY KEY(mid, uid, topic_id, type))", "CREATE INDEX IF NOT EXISTS uid_mid_type_date_idx_media_topics ON media_topics(uid, topic_id, mid, type, date);", "CREATE TABLE media_holes_topics(uid INTEGER, topic_id INTEGER, type INTEGER, start INTEGER, end INTEGER, PRIMARY KEY(uid, topic_id, type, start));", "CREATE INDEX IF NOT EXISTS uid_end_media_holes_topics ON media_holes_topics(uid, topic_id, type, end);");
        k5.v(sQLiteDatabase, "CREATE TABLE topics(did INTEGER, topic_id INTEGER, data BLOB, top_message INTEGER, topic_message BLOB, unread_count INTEGER, max_read_id INTEGER, unread_mentions INTEGER, unread_reactions INTEGER, read_outbox INTEGER, pinned INTEGER, total_messages_count INTEGER, hidden INTEGER, edit_date INTEGER, nopaid_messages_exception INTEGER, unread_poll_votes INTEGER, PRIMARY KEY(did, topic_id));", "CREATE INDEX IF NOT EXISTS did_top_message_topics ON topics(did, top_message);", "CREATE INDEX IF NOT EXISTS did_topics ON topics(did);", "CREATE TABLE media_counts_topics(uid INTEGER, topic_id INTEGER, type INTEGER, count INTEGER, old INTEGER, PRIMARY KEY(uid, topic_id, type))");
        k5.v(sQLiteDatabase, "CREATE TABLE reaction_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS reaction_mentions_topics_did ON reaction_mentions_topics(dialog_id, topic_id);", "CREATE TABLE emoji_groups(type INTEGER PRIMARY KEY, data BLOB)", "CREATE TABLE app_config(data BLOB)");
        k5.v(sQLiteDatabase, "CREATE TABLE web_browser_settings(data BLOB)", "CREATE TABLE effects(data BLOB)", "CREATE TABLE stories (dialog_id INTEGER, story_id INTEGER, data BLOB, custom_params BLOB, PRIMARY KEY (dialog_id, story_id));", "CREATE TABLE stories_counter (dialog_id INTEGER PRIMARY KEY, count INTEGER, max_read INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE profile_stories (dialog_id INTEGER, story_id INTEGER, data BLOB, type INTEGER, seen INTEGER, pin INTEGER, PRIMARY KEY(dialog_id, story_id, type));", "CREATE TABLE profile_stories_albums (dialog_id INTEGER, album_id INTEGER, order_index INTEGER, data BLOB, PRIMARY KEY(dialog_id, album_id));", "CREATE TABLE profile_stories_albums_links (dialog_id INTEGER, album_id INTEGER, story_id INTEGER, order_index INTEGER, PRIMARY KEY (dialog_id, album_id, story_id));", "CREATE TABLE story_drafts (id INTEGER PRIMARY KEY, date INTEGER, data BLOB, type INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE story_pushes (uid INTEGER, sid INTEGER, date INTEGER, localName TEXT, flags INTEGER, expire_date INTEGER, live INTEGER, PRIMARY KEY(uid, sid));", "CREATE TABLE unconfirmed_auth (data BLOB);", "CREATE TABLE saved_reaction_tags (topic_id INTEGER PRIMARY KEY, data BLOB);", "CREATE TABLE tag_message_id(mid INTEGER, topic_id INTEGER, tag INTEGER, text TEXT);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS tag_idx_tag_message_id ON tag_message_id(tag);", "CREATE INDEX IF NOT EXISTS tag_text_idx_tag_message_id ON tag_message_id(tag, text COLLATE NOCASE);", "CREATE INDEX IF NOT EXISTS tag_topic_idx_tag_message_id ON tag_message_id(topic_id, tag);", "CREATE INDEX IF NOT EXISTS tag_topic_text_idx_tag_message_id ON tag_message_id(topic_id, tag, text COLLATE NOCASE);");
        k5.v(sQLiteDatabase, "CREATE TABLE business_replies(topic_id INTEGER PRIMARY KEY, name TEXT, order_value INTEGER, count INTEGER);", "CREATE TABLE quick_replies_messages(mid INTEGER, topic_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, topic_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_quick_replies_messages ON quick_replies_messages(mid, send_state, date);", "CREATE INDEX IF NOT EXISTS topic_date_idx_quick_replies_messages ON quick_replies_messages(topic_id, date);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS reply_to_idx_quick_replies_messages ON quick_replies_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_quick_replies_messages ON quick_replies_messages(reply_to_message_id, mid);", "CREATE TABLE welcome_messages(mid INTEGER, dialog_id INTEGER, send_state INTEGER, date INTEGER, data BLOB, ttl INTEGER, replydata BLOB, reply_to_message_id INTEGER, PRIMARY KEY(mid, dialog_id))", "CREATE INDEX IF NOT EXISTS send_state_idx_welcome_messages ON welcome_messages(mid, send_state, date);");
        k5.v(sQLiteDatabase, "CREATE INDEX IF NOT EXISTS dialog_date_idx_welcome_messages ON welcome_messages(dialog_id, date);", "CREATE INDEX IF NOT EXISTS reply_to_idx_welcome_messages ON welcome_messages(mid, reply_to_message_id);", "CREATE INDEX IF NOT EXISTS idx_to_reply_welcome_messages ON welcome_messages(reply_to_message_id, mid);", "CREATE TABLE business_links(data BLOB, order_value INTEGER);");
        k5.v(sQLiteDatabase, "CREATE TABLE fact_checks(hash INTEGER PRIMARY KEY, data BLOB, expires INTEGER);", "CREATE TABLE popular_bots(uid INTEGER PRIMARY KEY, time INTEGER, offset TEXT, pos INTEGER);", "CREATE TABLE star_gifts2(id INTEGER PRIMARY KEY, data BLOB, hash INTEGER, time INTEGER, pos INTEGER);", "CREATE TABLE gift_themes (slug TEXT PRIMARY KEY, data BLOB);");
        k5.v(sQLiteDatabase, "CREATE TABLE poll_votes_mentions(message_id INTEGER, state INTEGER, dialog_id INTEGER, PRIMARY KEY(message_id, dialog_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_did ON poll_votes_mentions(dialog_id);", "CREATE TABLE poll_votes_mentions_topics(message_id INTEGER, state INTEGER, dialog_id INTEGER, topic_id INTEGER, PRIMARY KEY(message_id, dialog_id, topic_id))", "CREATE INDEX IF NOT EXISTS poll_votes_mentions_topics_did ON poll_votes_mentions_topics(dialog_id, topic_id);");
        k5.v(sQLiteDatabase, "CREATE TABLE ephemeral_messages (id INTEGER, dialog_id INTEGER, topic_id INTEGER, date INTEGER, data BLOB, PRIMARY KEY(dialog_id, id));", "CREATE INDEX IF NOT EXISTS ephemeral_messages_date_idx ON ephemeral_messages(date);", "CREATE TABLE widget_state(uid INTEGER, mid INTEGER, local TEXT, PRIMARY KEY(uid, mid));", "CREATE TABLE widget_heights(uid INTEGER, mid INTEGER, width INTEGER, height INTEGER, date INTEGER, anchor INTEGER default 0, PRIMARY KEY(uid, mid, width));");
        jg.g.z(sQLiteDatabase, "PRAGMA user_version = 181");
    }

    public static void J(TLRPC.Message message) {
        if (message == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported_old) {
            if (messageMedia.bytes.length == 0) {
                Pattern pattern = Utilities.a;
                byte b10 = (byte) 0;
                messageMedia.bytes = new byte[]{b10, b10, b10, (byte) TLRPC.LAYER};
                return;
            }
            return;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            TLRPC.TL_messageMediaUnsupported_old tL_messageMediaUnsupported_old = new TLRPC.TL_messageMediaUnsupported_old();
            message.media = tL_messageMediaUnsupported_old;
            Pattern pattern2 = Utilities.a;
            byte b11 = (byte) 0;
            tL_messageMediaUnsupported_old.bytes = new byte[]{b11, b11, b11, (byte) TLRPC.LAYER};
            message.flags |= 512;
        }
    }

    public static String K(TLRPC.User user) {
        StringBuilder sb2 = new StringBuilder();
        String str = user.first_name;
        if (str != null && str.length() > 0) {
            sb2.append(user.first_name);
        }
        String str2 = user.last_name;
        if (str2 != null && str2.length() > 0) {
            if (sb2.length() > 0) {
                sb2.append(" ");
            }
            sb2.append(user.last_name);
        }
        sb2.append(";;;");
        String str3 = user.username;
        if (str3 == null || str3.length() <= 0) {
            ArrayList<TLRPC.TL_username> arrayList = user.usernames;
            if (arrayList != null && arrayList.size() > 0) {
                for (int i7 = 0; i7 < user.usernames.size(); i7++) {
                    TLRPC.TL_username tL_username = user.usernames.get(i7);
                    if (tL_username != null && tL_username.active) {
                        sb2.append(tL_username.username);
                        sb2.append(";;");
                    }
                }
            }
        } else {
            sb2.append(user.username);
        }
        return sb2.toString().toLowerCase();
    }

    public static ArrayList L1(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) arrayList.get(i7);
                if (inputPeer != null) {
                    long j3 = inputPeer.user_id;
                    if (j3 == 0) {
                        long j10 = inputPeer.chat_id;
                        if (j10 == 0) {
                            j10 = inputPeer.channel_id;
                        }
                        j3 = -j10;
                    }
                    arrayList2.add(Long.valueOf(j3));
                }
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ void a(yr yrVar, ArrayList arrayList) {
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Pair pair = (Pair) obj;
            yrVar.getMessagesController().n4(((Integer) pair.second).intValue(), ((Long) pair.first).longValue(), false);
        }
    }

    public static yr a0(int i7) {
        yr yrVar;
        yr yrVar2 = e0[i7];
        if (yrVar2 != null) {
            return yrVar2;
        }
        synchronized (f0[i7]) {
            try {
                yrVar = e0[i7];
                if (yrVar == null) {
                    yr[] yrVarArr = e0;
                    yr yrVar3 = new yr(i7);
                    yrVarArr[i7] = yrVar3;
                    yrVar = yrVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yrVar;
    }

    public static void c(TLRPC.Peer peer, ArrayList arrayList, ArrayList arrayList2) {
        if (peer instanceof TLRPC.TL_peerUser) {
            if (arrayList.contains(Long.valueOf(peer.user_id))) {
                return;
            }
            arrayList.add(Long.valueOf(peer.user_id));
        } else if (peer instanceof TLRPC.TL_peerChannel) {
            if (arrayList2.contains(Long.valueOf(peer.channel_id))) {
                return;
            }
            arrayList2.add(Long.valueOf(peer.channel_id));
        } else {
            if (!(peer instanceof TLRPC.TL_peerChat) || arrayList2.contains(Long.valueOf(peer.chat_id))) {
                return;
            }
            arrayList2.add(Long.valueOf(peer.chat_id));
        }
    }

    public static void d(TLRPC.Message message, a0.h hVar, a0.h hVar2) {
        long C1;
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        int i7 = messageReplyHeader.reply_to_msg_id;
        if ((message.flags & TLObject.FLAG_30) != 0) {
            C1 = message.quick_reply_shortcut_id;
        } else {
            TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
            C1 = peer != null ? ij.C1(peer) : ij.B0(message);
        }
        SparseArray sparseArray = (SparseArray) hVar.f(C1);
        ArrayList arrayList = (ArrayList) hVar2.f(C1);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            hVar.k(sparseArray, C1);
        }
        if (arrayList == null) {
            arrayList = k5.j(hVar2, C1);
        }
        ArrayList arrayList2 = (ArrayList) sparseArray.get(message.reply_to.reply_to_msg_id);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            sparseArray.put(message.reply_to.reply_to_msg_id, arrayList2);
            if (!arrayList.contains(Integer.valueOf(message.reply_to.reply_to_msg_id))) {
                arrayList.add(Integer.valueOf(message.reply_to.reply_to_msg_id));
            }
        }
        arrayList2.add(message);
    }

    public static int d0(TLRPC.Message message) {
        if (!(message instanceof TLRPC.TL_message_secret)) {
            if (message instanceof TLRPC.TL_message) {
                TLRPC.MessageMedia messageMedia = message.media;
                if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) || (messageMedia instanceof TLRPC.TL_messageMediaDocument)) && messageMedia.ttl_seconds != 0) {
                    return 1;
                }
            }
            return ((message.media instanceof TLRPC.TL_messageMediaPhoto) || ij.M4(message)) ? 0 : -1;
        }
        if (!(message.media instanceof TLRPC.TL_messageMediaPhoto) && !ij.u3(message) && !ij.S4(message) && !ij.M4(message) && !ij.k4(message)) {
            return -1;
        }
        int i7 = message.ttl;
        return (i7 <= 0 || i7 > 60) ? 0 : 1;
    }

    public static void e(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        String str;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer3;
        TLRPC.Peer peer4;
        TLRPC.WebPage webPage;
        TLRPC.Peer peer5;
        TL_stories.StoryFwdHeader storyFwdHeader;
        TL_stories.StoryItem storyItem;
        TLRPC.Peer peer6;
        TLRPC.Peer peer7;
        long C1 = ij.C1(message.from_id);
        if (m5.E(C1)) {
            if (!arrayList.contains(Long.valueOf(C1))) {
                arrayList.add(Long.valueOf(C1));
            }
        } else if (m5.z(C1)) {
            long j3 = -C1;
            if (!arrayList2.contains(Long.valueOf(j3))) {
                arrayList2.add(Long.valueOf(j3));
            }
        }
        long j10 = message.via_bot_id;
        if (j10 != 0 && !arrayList.contains(Long.valueOf(j10))) {
            arrayList.add(Long.valueOf(message.via_bot_id));
        }
        TLRPC.Peer peer8 = message.guestchat_via_from;
        if (peer8 != null) {
            c(peer8, arrayList, arrayList2);
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction != null) {
            long j11 = messageAction.user_id;
            if (j11 != 0 && !arrayList.contains(Long.valueOf(j11))) {
                arrayList.add(Long.valueOf(message.action.user_id));
            }
            long j12 = message.action.channel_id;
            if (j12 != 0 && !arrayList2.contains(Long.valueOf(j12))) {
                arrayList2.add(Long.valueOf(message.action.channel_id));
            }
            long j13 = message.action.chat_id;
            if (j13 != 0 && !arrayList2.contains(Long.valueOf(j13))) {
                arrayList2.add(Long.valueOf(message.action.chat_id));
            }
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionGiftCode) {
                c(((TLRPC.TL_messageActionGiftCode) messageAction2).boost_peer, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction3 = message.action;
            if (messageAction3 instanceof TLRPC.TL_messageActionGeoProximityReached) {
                TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction3;
                c(tL_messageActionGeoProximityReached.from_id, arrayList, arrayList2);
                c(tL_messageActionGeoProximityReached.to_id, arrayList, arrayList2);
            }
            TLRPC.MessageAction messageAction4 = message.action;
            if (messageAction4 instanceof TLRPC.TL_messageActionManagedBotCreated) {
                arrayList.add(Long.valueOf(((TLRPC.TL_messageActionManagedBotCreated) messageAction4).bot_id));
            }
            TLRPC.MessageAction messageAction5 = message.action;
            if (messageAction5 instanceof TLRPC.TL_messageActionChangeCommunity) {
                long j14 = ((TLRPC.TL_messageActionChangeCommunity) messageAction5).community_id;
                if (j14 > 0) {
                    arrayList2.add(Long.valueOf(j14));
                }
            }
            if (!message.action.users.isEmpty()) {
                for (int i7 = 0; i7 < message.action.users.size(); i7++) {
                    Long l10 = message.action.users.get(i7);
                    if (!arrayList.contains(l10)) {
                        arrayList.add(l10);
                    }
                }
            }
        }
        if (!message.entities.isEmpty()) {
            for (int i10 = 0; i10 < message.entities.size(); i10++) {
                TLRPC.MessageEntity messageEntity = message.entities.get(i10);
                if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_messageEntityMentionName) messageEntity).user_id));
                } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                    arrayList.add(Long.valueOf(((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id));
                } else if (arrayList3 != null && (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    arrayList3.add(Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) messageEntity).document_id));
                }
            }
        }
        TLRPC.MessageAction messageAction6 = message.action;
        if (messageAction6 instanceof TLRPC.TL_messageActionStarGift) {
            TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGift) messageAction6).gift;
            if (starGift != null && (peer7 = starGift.released_by) != null) {
                c(peer7, arrayList, arrayList2);
            }
        } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftUnique) {
            TL_stars.StarGift starGift2 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction6).gift;
            if (starGift2 != null && (peer = starGift2.released_by) != null) {
                c(peer, arrayList, arrayList2);
            }
        } else if (messageAction6 instanceof TLRPC.TL_messageActionRequestedPeer) {
            TLRPC.TL_messageActionRequestedPeer tL_messageActionRequestedPeer = (TLRPC.TL_messageActionRequestedPeer) messageAction6;
            for (int i11 = 0; i11 < tL_messageActionRequestedPeer.peers.size(); i11++) {
                c(tL_messageActionRequestedPeer.peers.get(i11), arrayList, arrayList2);
            }
        }
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia != null) {
            long j15 = messageMedia.user_id;
            if (j15 != 0 && !arrayList.contains(Long.valueOf(j15))) {
                arrayList.add(Long.valueOf(message.media.user_id));
            }
            TLRPC.MessageMedia messageMedia2 = message.media;
            if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                ArrayList<Long> arrayList4 = ((TLRPC.TL_messageMediaGiveaway) messageMedia2).channels;
                int size = arrayList4.size();
                int i12 = 0;
                while (i12 < size) {
                    Long l11 = arrayList4.get(i12);
                    i12++;
                    Long l12 = l11;
                    if (!arrayList2.contains(l12)) {
                        arrayList2.add(l12);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia3 = message.media;
            if (messageMedia3 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                ArrayList<Long> arrayList5 = ((TLRPC.TL_messageMediaGiveawayResults) messageMedia3).winners;
                int size2 = arrayList5.size();
                int i13 = 0;
                while (i13 < size2) {
                    Long l13 = arrayList5.get(i13);
                    i13++;
                    Long l14 = l13;
                    if (!arrayList.contains(l14)) {
                        arrayList.add(l14);
                    }
                }
            }
            TLRPC.MessageMedia messageMedia4 = message.media;
            if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia4;
                if (!tL_messageMediaPoll.poll.answers.isEmpty()) {
                    for (int i14 = 0; i14 < tL_messageMediaPoll.poll.answers.size(); i14++) {
                        TLRPC.Peer peer9 = tL_messageMediaPoll.poll.answers.get(i14).added_by;
                        if (peer9 != null) {
                            c(peer9, arrayList, arrayList2);
                        }
                    }
                }
                TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
                if (pollResults != null) {
                    ArrayList<TLRPC.Peer> arrayList6 = pollResults.recent_voters;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        for (int i15 = 0; i15 < tL_messageMediaPoll.results.recent_voters.size(); i15++) {
                            c(tL_messageMediaPoll.results.recent_voters.get(i15), arrayList, arrayList2);
                        }
                    }
                    if (!tL_messageMediaPoll.results.results.isEmpty()) {
                        ArrayList<TLRPC.PollAnswerVoters> arrayList7 = tL_messageMediaPoll.results.results;
                        int size3 = arrayList7.size();
                        int i16 = 0;
                        while (i16 < size3) {
                            TLRPC.PollAnswerVoters pollAnswerVoters = arrayList7.get(i16);
                            i16++;
                            TLRPC.PollAnswerVoters pollAnswerVoters2 = pollAnswerVoters;
                            ArrayList<TLRPC.Peer> arrayList8 = pollAnswerVoters2.recent_voters;
                            if (arrayList8 != null && !arrayList8.isEmpty()) {
                                ArrayList<TLRPC.Peer> arrayList9 = pollAnswerVoters2.recent_voters;
                                int size4 = arrayList9.size();
                                int i17 = 0;
                                while (i17 < size4) {
                                    TLRPC.Peer peer10 = arrayList9.get(i17);
                                    i17++;
                                    c(peer10, arrayList, arrayList2);
                                }
                            }
                        }
                    }
                }
            }
            TLRPC.MessageMedia messageMedia5 = message.media;
            if ((messageMedia5 instanceof TLRPC.TL_messageMediaStory) && (storyItem = messageMedia5.storyItem) != null) {
                TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                if (storyFwdHeader2 != null) {
                    c(storyFwdHeader2.from, arrayList, arrayList2);
                }
                TL_stories.StoryItem storyItem2 = message.media.storyItem;
                if (storyItem2 != null && storyItem2.media_areas != null) {
                    for (int i18 = 0; i18 < message.media.storyItem.media_areas.size(); i18++) {
                        if (message.media.storyItem.media_areas.get(i18) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            long j16 = ((TL_stories.TL_mediaAreaChannelPost) message.media.storyItem.media_areas.get(i18)).channel_id;
                            if (!arrayList2.contains(Long.valueOf(j16))) {
                                arrayList2.add(Long.valueOf(j16));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem3 = message.media.storyItem;
                if (storyItem3 != null && (peer6 = storyItem3.from_id) != null) {
                    c(peer6, arrayList, arrayList2);
                }
            }
            TLRPC.MessageMedia messageMedia6 = message.media;
            if ((messageMedia6 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia6.webpage) != null && webPage.attributes != null) {
                for (int i19 = 0; i19 < message.media.webpage.attributes.size(); i19++) {
                    if (message.media.webpage.attributes.get(i19) instanceof TLRPC.TL_webPageAttributeStory) {
                        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) message.media.webpage.attributes.get(i19);
                        TL_stories.StoryItem storyItem4 = tL_webPageAttributeStory.storyItem;
                        if (storyItem4 != null && (storyFwdHeader = storyItem4.fwd_from) != null) {
                            c(storyFwdHeader.from, arrayList, arrayList2);
                        }
                        TL_stories.StoryItem storyItem5 = tL_webPageAttributeStory.storyItem;
                        if (storyItem5 != null && storyItem5.media_areas != null) {
                            for (int i20 = 0; i20 < tL_webPageAttributeStory.storyItem.media_areas.size(); i20++) {
                                if (tL_webPageAttributeStory.storyItem.media_areas.get(i20) instanceof TL_stories.TL_mediaAreaChannelPost) {
                                    long j17 = ((TL_stories.TL_mediaAreaChannelPost) tL_webPageAttributeStory.storyItem.media_areas.get(i20)).channel_id;
                                    if (!arrayList2.contains(Long.valueOf(j17))) {
                                        arrayList2.add(Long.valueOf(j17));
                                    }
                                }
                            }
                        }
                        TL_stories.StoryItem storyItem6 = tL_webPageAttributeStory.storyItem;
                        if (storyItem6 != null && (peer5 = storyItem6.from_id) != null) {
                            c(peer5, arrayList, arrayList2);
                        }
                    }
                }
            }
            TLRPC.Peer peer11 = message.media.peer;
            if (peer11 != null) {
                c(peer11, arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplies messageReplies = message.replies;
        if (messageReplies != null) {
            int size5 = messageReplies.recent_repliers.size();
            for (int i21 = 0; i21 < size5; i21++) {
                c(message.replies.recent_repliers.get(i21), arrayList, arrayList2);
            }
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        if (messageReplyHeader != null && (peer4 = messageReplyHeader.reply_to_peer_id) != null) {
            c(peer4, arrayList, arrayList2);
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
        if (messageFwdHeader2 != null) {
            c(messageFwdHeader2.from_id, arrayList, arrayList2);
            c(message.fwd_from.saved_from_peer, arrayList, arrayList2);
        }
        TLRPC.MessageReplyHeader messageReplyHeader2 = message.reply_to;
        if (messageReplyHeader2 != null && (messageFwdHeader = messageReplyHeader2.reply_from) != null && (peer3 = messageFwdHeader.from_id) != null) {
            c(peer3, arrayList, arrayList2);
        }
        HashMap<String, String> hashMap = message.params;
        if (hashMap != null && (str = hashMap.get("fwd_peer")) != null) {
            long longValue = Utilities.A(str).longValue();
            if (longValue < 0) {
                long j18 = -longValue;
                if (!arrayList2.contains(Long.valueOf(j18))) {
                    arrayList2.add(Long.valueOf(j18));
                }
            }
        }
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions == null || tL_messageReactions.top_reactors == null) {
            return;
        }
        for (int i22 = 0; i22 < message.reactions.top_reactors.size(); i22++) {
            TLRPC.MessageReactor messageReactor = message.reactions.top_reactors.get(i22);
            if (messageReactor != null && (peer2 = messageReactor.peer_id) != null) {
                c(peer2, arrayList, arrayList2);
            }
        }
    }

    public static boolean s0(a0.h hVar) {
        return hVar == null || hVar.m() == 0;
    }

    public static boolean t0(LongSparseIntArray longSparseIntArray) {
        return longSparseIntArray == null || longSparseIntArray.size() == 0;
    }

    public static boolean v0(TLRPC.MessageAction messageAction) {
        return (messageAction instanceof TLRPC.TL_messageActionPinMessage) || (messageAction instanceof TLRPC.TL_messageActionPaymentSent) || (messageAction instanceof TLRPC.TL_messageActionGameScore) || (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) || (messageAction instanceof TLRPC.TL_messageActionPollAppendAnswer) || (messageAction instanceof TLRPC.TL_messageActionPollDeleteAnswer);
    }

    public static void w(long j3, SQLitePreparedStatement sQLitePreparedStatement, SQLitePreparedStatement sQLitePreparedStatement2, int i7, long j10) {
        int i10;
        int i11;
        sQLitePreparedStatement.requery();
        sQLitePreparedStatement.bindLong(1, j3);
        if (j10 != 0) {
            sQLitePreparedStatement.bindLong(2, j10);
            i10 = 3;
        } else {
            i10 = 2;
        }
        int i12 = i10 + 1;
        sQLitePreparedStatement.bindInteger(i10, i7 == 1 ? 1 : 0);
        sQLitePreparedStatement.bindInteger(i12, i7);
        sQLitePreparedStatement.step();
        for (int i13 = 0; i13 < 9; i13++) {
            sQLitePreparedStatement2.requery();
            sQLitePreparedStatement2.bindLong(1, j3);
            if (j10 != 0) {
                sQLitePreparedStatement2.bindLong(2, j10);
                i11 = 3;
            } else {
                i11 = 2;
            }
            int i14 = i11 + 1;
            sQLitePreparedStatement2.bindInteger(i11, i13);
            int i15 = i11 + 2;
            sQLitePreparedStatement2.bindInteger(i14, i7 == 1 ? 1 : 0);
            sQLitePreparedStatement2.bindInteger(i15, i7);
            sQLitePreparedStatement2.step();
        }
    }

    public static boolean y0(TLRPC.Message message) {
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (replyMarkup == null || (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            return false;
        }
        return !replyMarkup.selective || message.mentioned;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0498 A[Catch: all -> 0x04c0, Exception -> 0x04c3, TryCatch #25 {Exception -> 0x04c3, all -> 0x04c0, blocks: (B:15:0x03fc, B:17:0x0498, B:19:0x049e, B:20:0x04ed, B:25:0x04c9), top: B:14:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x04c9 A[Catch: all -> 0x04c0, Exception -> 0x04c3, TryCatch #25 {Exception -> 0x04c3, all -> 0x04c0, blocks: (B:15:0x03fc, B:17:0x0498, B:19:0x049e, B:20:0x04ed, B:25:0x04c9), top: B:14:0x03fc }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036c  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v41 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0(int i7, long j3) {
        SQLiteCursor sQLiteCursor;
        yr yrVar;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        String str;
        ArrayList arrayList;
        TLRPC.Message TLdeserialize;
        char c10;
        String str2;
        String str3;
        String str4;
        String str5;
        long j10;
        String str6;
        String str7;
        String str8;
        String str9;
        SQLiteCursor sQLiteCursor4;
        SQLiteCursor sQLiteCursor5;
        int i10;
        String str10;
        int i11;
        long j11;
        ?? r12 = 0;
        if (i7 == 3) {
            try {
                SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT last_mid FROM dialogs WHERE did = " + j3, new Object[0]);
                try {
                    int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : -1;
                    queryFinalized.dispose();
                    if (intValue != 0) {
                        return;
                    }
                } catch (Exception e10) {
                    e = e10;
                    yrVar = this;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                    sQLiteCursor2 = null;
                    try {
                        yrVar.n(e);
                        if (sQLiteCursor != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLitePreparedStatement2 == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor != null) {
                        }
                        if (sQLiteCursor2 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                    sQLiteCursor2 = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLiteCursor2 != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                yrVar = this;
                sQLitePreparedStatement = null;
                sQLitePreparedStatement2 = null;
                sQLiteCursor = null;
                sQLiteCursor2 = null;
                yrVar.n(e);
                if (sQLiteCursor != null) {
                }
                if (sQLiteCursor2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                if (sQLitePreparedStatement2 == null) {
                }
            } catch (Throwable th4) {
                th = th4;
                sQLitePreparedStatement = null;
                sQLitePreparedStatement2 = null;
                sQLiteCursor = null;
                sQLiteCursor2 = null;
                if (sQLiteCursor != null) {
                }
                if (sQLiteCursor2 != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                if (sQLitePreparedStatement2 != null) {
                }
                throw th;
            }
        }
        char c11 = 2;
        if (m5.C(j3) || i7 == 2) {
            SQLiteCursor queryFinalized2 = this.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j3, new Object[0]);
            try {
                ArrayList arrayList2 = new ArrayList();
                String str11 = "SELECT data FROM messages_v2 WHERE uid = ";
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                SQLiteCursor sQLiteCursor6 = queryFinalized2;
                while (sQLiteCursor6.next()) {
                    try {
                        try {
                            NativeByteBuffer byteBufferValue = sQLiteCursor6.byteBufferValue(r12);
                            if (byteBufferValue != 0) {
                                try {
                                    TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r12), r12);
                                    TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                                    byteBufferValue.reuse();
                                    str = str11;
                                    c10 = 2;
                                    sQLiteCursor3 = sQLiteCursor6;
                                    arrayList = arrayList4;
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLiteCursor3 = sQLiteCursor6;
                                    str = str11;
                                    arrayList = arrayList4;
                                }
                                try {
                                    try {
                                        b(TLdeserialize, arrayList2, arrayList, arrayList3, false);
                                    } catch (Throwable th5) {
                                        th = th5;
                                        sQLiteCursor = sQLiteCursor3;
                                        sQLitePreparedStatement = null;
                                        sQLitePreparedStatement2 = null;
                                        sQLiteCursor2 = null;
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLiteCursor2 != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    try {
                                        n(e);
                                        sQLiteCursor3.dispose();
                                        D(arrayList, true);
                                        g0.h3(new sp(this, arrayList3, 4));
                                        getFileLoader().getClass();
                                        w7.p(i7, arrayList2);
                                        String str12 = "DELETE FROM widget_heights WHERE uid = ";
                                        if (i7 == 0) {
                                        }
                                        str7 = "DELETE FROM media_counts_v2 WHERE uid = ";
                                        str8 = "DELETE FROM messages_holes WHERE uid = ";
                                        str9 = "DELETE FROM widget_heights WHERE uid = ";
                                        str6 = "DELETE FROM media_holes_v2 WHERE uid = ";
                                        j10 = j3;
                                        yrVar = this;
                                        yrVar.b.executeFast("DELETE FROM dialogs WHERE did = " + j10).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j10).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j10).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j10).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
                                        if (!m5.C(j10)) {
                                        }
                                        yrVar.b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j10).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10).stepThis().dispose();
                                        yrVar.b.executeFast(str9 + j10).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10).stepThis().dispose();
                                        yrVar.b.executeFast(str3 + j10).stepThis().dispose();
                                        yrVar.b.executeFast(str2 + j10).stepThis().dispose();
                                        yrVar.b.executeFast(str7 + j10).stepThis().dispose();
                                        yrVar.b.executeFast(str5 + j10).stepThis().dispose();
                                        yrVar.b.executeFast(str8 + j10).stepThis().dispose();
                                        yrVar.b.executeFast(str6 + j10).stepThis().dispose();
                                        ui mediaDataController = yrVar.getMediaDataController();
                                        mediaDataController.getClass();
                                        g0.h3(new yg(mediaDataController, j10, 0));
                                        g0.h3(new rq(yrVar, 10));
                                        yrVar.t1(false);
                                        ArrayList arrayList5 = new ArrayList();
                                        arrayList5.add(Long.valueOf(j10));
                                        yrVar.l2(arrayList5);
                                        return;
                                    } catch (Exception e14) {
                                        e = e14;
                                        yrVar = this;
                                        sQLiteCursor = sQLiteCursor3;
                                        sQLitePreparedStatement = null;
                                        sQLitePreparedStatement2 = null;
                                        sQLiteCursor2 = null;
                                        yrVar.n(e);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        if (sQLiteCursor2 != null) {
                                            sQLiteCursor2.dispose();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLitePreparedStatement2 == null) {
                                            sQLitePreparedStatement2.dispose();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            } else {
                                c10 = c11;
                                sQLiteCursor3 = sQLiteCursor6;
                                str = str11;
                                arrayList = arrayList4;
                            }
                            arrayList4 = arrayList;
                            sQLiteCursor6 = sQLiteCursor3;
                            c11 = c10;
                            str11 = str;
                            r12 = 0;
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor3 = sQLiteCursor6;
                            sQLiteCursor = sQLiteCursor3;
                            sQLitePreparedStatement = null;
                            sQLitePreparedStatement2 = null;
                            sQLiteCursor2 = null;
                            if (sQLiteCursor != null) {
                            }
                            if (sQLiteCursor2 != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLitePreparedStatement2 != null) {
                            }
                            throw th;
                        }
                    } catch (Exception e15) {
                        e = e15;
                        sQLiteCursor3 = sQLiteCursor6;
                        str = str11;
                        arrayList = arrayList4;
                    }
                }
                sQLiteCursor3 = sQLiteCursor6;
                str = str11;
                arrayList = arrayList4;
                sQLiteCursor3.dispose();
                D(arrayList, true);
                g0.h3(new sp(this, arrayList3, 4));
                getFileLoader().getClass();
                w7.p(i7, arrayList2);
            } catch (Exception e16) {
                e = e16;
                yrVar = this;
                sQLiteCursor3 = queryFinalized2;
            } catch (Throwable th7) {
                th = th7;
                sQLiteCursor3 = queryFinalized2;
            }
        } else {
            str = "SELECT data FROM messages_v2 WHERE uid = ";
        }
        String str122 = "DELETE FROM widget_heights WHERE uid = ";
        try {
            if (i7 == 0) {
                str5 = "DELETE FROM media_v4 WHERE uid = ";
                if (i7 == 3) {
                    str2 = "DELETE FROM bot_keyboard_topics WHERE uid = ";
                    str3 = "DELETE FROM bot_keyboard WHERE uid = ";
                    str4 = str5;
                } else {
                    if (i7 != 2) {
                        str2 = "DELETE FROM bot_keyboard_topics WHERE uid = ";
                        str3 = "DELETE FROM bot_keyboard WHERE uid = ";
                        str7 = "DELETE FROM media_counts_v2 WHERE uid = ";
                        str8 = "DELETE FROM messages_holes WHERE uid = ";
                        str9 = "DELETE FROM widget_heights WHERE uid = ";
                        str6 = "DELETE FROM media_holes_v2 WHERE uid = ";
                        j10 = j3;
                        yrVar = this;
                        yrVar.b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j10).stepThis().dispose();
                        yrVar.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10).stepThis().dispose();
                        yrVar.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10).stepThis().dispose();
                        yrVar.b.executeFast(str9 + j10).stepThis().dispose();
                        yrVar.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10).stepThis().dispose();
                        yrVar.b.executeFast(str3 + j10).stepThis().dispose();
                        yrVar.b.executeFast(str2 + j10).stepThis().dispose();
                        yrVar.b.executeFast(str7 + j10).stepThis().dispose();
                        yrVar.b.executeFast(str5 + j10).stepThis().dispose();
                        yrVar.b.executeFast(str8 + j10).stepThis().dispose();
                        yrVar.b.executeFast(str6 + j10).stepThis().dispose();
                        ui mediaDataController2 = yrVar.getMediaDataController();
                        mediaDataController2.getClass();
                        g0.h3(new yg(mediaDataController2, j10, 0));
                        g0.h3(new rq(yrVar, 10));
                        yrVar.t1(false);
                        ArrayList arrayList52 = new ArrayList();
                        arrayList52.add(Long.valueOf(j10));
                        yrVar.l2(arrayList52);
                        return;
                    }
                    SQLiteCursor queryFinalized3 = this.b.queryFinalized("SELECT last_mid_i, last_mid FROM dialogs WHERE did = " + j3, new Object[0]);
                    try {
                        if (queryFinalized3.next()) {
                            long longValue = queryFinalized3.longValue(0);
                            long longValue2 = queryFinalized3.longValue(1);
                            try {
                                ?? r13 = 0;
                                int i12 = -1;
                                SQLiteCursor sQLiteCursor7 = this.b.queryFinalized(str + j3 + " AND mid IN (" + longValue + "," + longValue2 + ")", new Object[0]);
                                while (sQLiteCursor7.next()) {
                                    try {
                                        NativeByteBuffer byteBufferValue2 = sQLiteCursor7.byteBufferValue(r13);
                                        if (byteBufferValue2 != 0) {
                                            sQLiteCursor5 = sQLiteCursor7;
                                            try {
                                                try {
                                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r13), r13);
                                                    if (TLdeserialize2 != null) {
                                                        i10 = i12;
                                                        str10 = str122;
                                                        try {
                                                            TLdeserialize2.readAttachPath(byteBufferValue2, getUserConfig().n);
                                                        } catch (Exception e17) {
                                                            e = e17;
                                                            try {
                                                                n(e);
                                                                sQLiteCursor5.dispose();
                                                                this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM widget_state WHERE uid = " + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                                this.b.executeFast(str10 + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                                SQLiteDatabase sQLiteDatabase = this.b;
                                                                StringBuilder sb2 = new StringBuilder();
                                                                sb2.append("DELETE FROM messages_holes WHERE uid = ");
                                                                sb2.append(j3);
                                                                sQLiteDatabase.executeFast(sb2.toString()).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j3).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j3).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j3).stepThis().dispose();
                                                                this.b.executeFast(str5 + j3).stepThis().dispose();
                                                                this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j3).stepThis().dispose();
                                                                ui mediaDataController3 = getMediaDataController();
                                                                mediaDataController3.getClass();
                                                                g0.h3(new yg(mediaDataController3, j3, 0));
                                                                sQLitePreparedStatement = this.b.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
                                                                sQLitePreparedStatement2 = this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                                                i11 = i10;
                                                                if (i11 != -1) {
                                                                }
                                                                sQLitePreparedStatement.dispose();
                                                                try {
                                                                    sQLitePreparedStatement2.dispose();
                                                                } catch (Exception e18) {
                                                                    e = e18;
                                                                    sQLiteCursor = sQLiteCursor4;
                                                                    sQLitePreparedStatement = null;
                                                                    sQLiteCursor2 = null;
                                                                    yrVar.n(e);
                                                                    if (sQLiteCursor != null) {
                                                                    }
                                                                    if (sQLiteCursor2 != null) {
                                                                    }
                                                                    if (sQLitePreparedStatement != null) {
                                                                    }
                                                                    if (sQLitePreparedStatement2 == null) {
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    sQLiteCursor = sQLiteCursor4;
                                                                    sQLitePreparedStatement = null;
                                                                    sQLiteCursor2 = null;
                                                                    if (sQLiteCursor != null) {
                                                                    }
                                                                    if (sQLiteCursor2 != null) {
                                                                    }
                                                                    if (sQLitePreparedStatement != null) {
                                                                    }
                                                                    if (sQLitePreparedStatement2 != null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                                try {
                                                                    ArrayList arrayList6 = new ArrayList();
                                                                    arrayList6.add(Long.valueOf(j11));
                                                                    yrVar.l2(arrayList6);
                                                                    sQLiteCursor4.dispose();
                                                                    return;
                                                                } catch (Exception e19) {
                                                                    e = e19;
                                                                    sQLiteCursor = sQLiteCursor4;
                                                                    sQLitePreparedStatement = null;
                                                                    sQLitePreparedStatement2 = null;
                                                                    sQLiteCursor2 = null;
                                                                    yrVar.n(e);
                                                                    if (sQLiteCursor != null) {
                                                                    }
                                                                    if (sQLiteCursor2 != null) {
                                                                    }
                                                                    if (sQLitePreparedStatement != null) {
                                                                    }
                                                                    if (sQLitePreparedStatement2 == null) {
                                                                    }
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    sQLiteCursor = sQLiteCursor4;
                                                                    sQLitePreparedStatement = null;
                                                                    sQLitePreparedStatement2 = null;
                                                                    sQLiteCursor2 = null;
                                                                    if (sQLiteCursor != null) {
                                                                    }
                                                                    if (sQLiteCursor2 != null) {
                                                                    }
                                                                    if (sQLitePreparedStatement != null) {
                                                                    }
                                                                    if (sQLitePreparedStatement2 != null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Exception e20) {
                                                                e = e20;
                                                                yrVar = this;
                                                                sQLiteCursor = queryFinalized3;
                                                                sQLiteCursor2 = sQLiteCursor5;
                                                                sQLitePreparedStatement = null;
                                                                sQLitePreparedStatement2 = null;
                                                                yrVar.n(e);
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                if (sQLiteCursor2 != null) {
                                                                }
                                                                if (sQLitePreparedStatement != null) {
                                                                }
                                                                if (sQLitePreparedStatement2 == null) {
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                                sQLiteCursor = queryFinalized3;
                                                                sQLiteCursor2 = sQLiteCursor5;
                                                                sQLitePreparedStatement = null;
                                                                sQLitePreparedStatement2 = null;
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                if (sQLiteCursor2 != null) {
                                                                }
                                                                if (sQLitePreparedStatement != null) {
                                                                }
                                                                if (sQLitePreparedStatement2 != null) {
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } else {
                                                        i10 = i12;
                                                        str10 = str122;
                                                    }
                                                    byteBufferValue2.reuse();
                                                    if (TLdeserialize2 != null) {
                                                        i12 = TLdeserialize2.id;
                                                        sQLiteCursor7 = sQLiteCursor5;
                                                        str122 = str10;
                                                        r13 = 0;
                                                    }
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    sQLiteCursor = queryFinalized3;
                                                    sQLiteCursor2 = sQLiteCursor5;
                                                    sQLitePreparedStatement = null;
                                                    sQLitePreparedStatement2 = null;
                                                    if (sQLiteCursor != null) {
                                                        sQLiteCursor.dispose();
                                                    }
                                                    if (sQLiteCursor2 != null) {
                                                        sQLiteCursor2.dispose();
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                        sQLitePreparedStatement.dispose();
                                                    }
                                                    if (sQLitePreparedStatement2 != null) {
                                                        sQLitePreparedStatement2.dispose();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e21) {
                                                e = e21;
                                                i10 = i12;
                                                str10 = str122;
                                                n(e);
                                                sQLiteCursor5.dispose();
                                                this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                this.b.executeFast("DELETE FROM widget_state WHERE uid = " + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                this.b.executeFast(str10 + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                this.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                                SQLiteDatabase sQLiteDatabase2 = this.b;
                                                StringBuilder sb22 = new StringBuilder();
                                                sb22.append("DELETE FROM messages_holes WHERE uid = ");
                                                sb22.append(j3);
                                                sQLiteDatabase2.executeFast(sb22.toString()).stepThis().dispose();
                                                this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j3).stepThis().dispose();
                                                this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j3).stepThis().dispose();
                                                this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j3).stepThis().dispose();
                                                this.b.executeFast(str5 + j3).stepThis().dispose();
                                                this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j3).stepThis().dispose();
                                                ui mediaDataController32 = getMediaDataController();
                                                mediaDataController32.getClass();
                                                g0.h3(new yg(mediaDataController32, j3, 0));
                                                sQLitePreparedStatement = this.b.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
                                                sQLitePreparedStatement2 = this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                                i11 = i10;
                                                if (i11 != -1) {
                                                }
                                                sQLitePreparedStatement.dispose();
                                                sQLitePreparedStatement2.dispose();
                                                ArrayList arrayList62 = new ArrayList();
                                                arrayList62.add(Long.valueOf(j11));
                                                yrVar.l2(arrayList62);
                                                sQLiteCursor4.dispose();
                                                return;
                                            }
                                        } else {
                                            sQLiteCursor5 = sQLiteCursor7;
                                            i10 = i12;
                                            str10 = str122;
                                        }
                                        i12 = i10;
                                        sQLiteCursor7 = sQLiteCursor5;
                                        str122 = str10;
                                        r13 = 0;
                                    } catch (Exception e22) {
                                        e = e22;
                                        sQLiteCursor5 = sQLiteCursor7;
                                    } catch (Throwable th12) {
                                        th = th12;
                                        sQLiteCursor5 = sQLiteCursor7;
                                    }
                                }
                                sQLiteCursor5 = sQLiteCursor7;
                                i10 = i12;
                                str10 = str122;
                                sQLiteCursor5.dispose();
                                this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                this.b.executeFast("DELETE FROM widget_state WHERE uid = " + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                this.b.executeFast(str10 + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                this.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j3 + " AND mid != " + longValue + " AND mid != " + longValue2).stepThis().dispose();
                                SQLiteDatabase sQLiteDatabase22 = this.b;
                                StringBuilder sb222 = new StringBuilder();
                                sb222.append("DELETE FROM messages_holes WHERE uid = ");
                                sb222.append(j3);
                                sQLiteDatabase22.executeFast(sb222.toString()).stepThis().dispose();
                                this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + j3).stepThis().dispose();
                                this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + j3).stepThis().dispose();
                                this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + j3).stepThis().dispose();
                                this.b.executeFast(str5 + j3).stepThis().dispose();
                                this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j3).stepThis().dispose();
                                ui mediaDataController322 = getMediaDataController();
                                mediaDataController322.getClass();
                                g0.h3(new yg(mediaDataController322, j3, 0));
                                sQLitePreparedStatement = this.b.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
                                try {
                                    sQLitePreparedStatement2 = this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                    i11 = i10;
                                    if (i11 != -1) {
                                        yrVar = this;
                                        sQLiteCursor4 = queryFinalized3;
                                        try {
                                            w(j3, sQLitePreparedStatement, sQLitePreparedStatement2, i11, 0L);
                                            j11 = j3;
                                        } catch (Exception e23) {
                                            e = e23;
                                            sQLiteCursor = sQLiteCursor4;
                                            sQLiteCursor2 = null;
                                            yrVar.n(e);
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLitePreparedStatement2 == null) {
                                            }
                                        } catch (Throwable th13) {
                                            th = th13;
                                            sQLiteCursor = sQLiteCursor4;
                                            sQLiteCursor2 = null;
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLiteCursor2 != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            if (sQLitePreparedStatement2 != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        j11 = j3;
                                        sQLiteCursor4 = queryFinalized3;
                                        yrVar = this;
                                    }
                                    sQLitePreparedStatement.dispose();
                                    sQLitePreparedStatement2.dispose();
                                    ArrayList arrayList622 = new ArrayList();
                                    arrayList622.add(Long.valueOf(j11));
                                    yrVar.l2(arrayList622);
                                } catch (Exception e24) {
                                    e = e24;
                                    yrVar = this;
                                    sQLiteCursor = queryFinalized3;
                                    sQLitePreparedStatement2 = null;
                                    sQLiteCursor2 = null;
                                    yrVar.n(e);
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLiteCursor2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLitePreparedStatement2 == null) {
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    sQLiteCursor = queryFinalized3;
                                    sQLitePreparedStatement2 = null;
                                    sQLiteCursor2 = null;
                                    if (sQLiteCursor != null) {
                                    }
                                    if (sQLiteCursor2 != null) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    throw th;
                                }
                            } catch (Exception e25) {
                                e = e25;
                                sQLiteCursor4 = queryFinalized3;
                                yrVar = this;
                                sQLiteCursor = sQLiteCursor4;
                                sQLitePreparedStatement = null;
                                sQLitePreparedStatement2 = null;
                                sQLiteCursor2 = null;
                                yrVar.n(e);
                                if (sQLiteCursor != null) {
                                }
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLitePreparedStatement2 == null) {
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                sQLiteCursor4 = queryFinalized3;
                                sQLiteCursor = sQLiteCursor4;
                                sQLitePreparedStatement = null;
                                sQLitePreparedStatement2 = null;
                                sQLiteCursor2 = null;
                                if (sQLiteCursor != null) {
                                }
                                if (sQLiteCursor2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                throw th;
                            }
                        } else {
                            yrVar = this;
                            sQLiteCursor4 = queryFinalized3;
                        }
                        sQLiteCursor4.dispose();
                        return;
                    } catch (Exception e26) {
                        e = e26;
                        yrVar = this;
                        sQLiteCursor4 = queryFinalized3;
                    } catch (Throwable th16) {
                        th = th16;
                        sQLiteCursor4 = queryFinalized3;
                    }
                }
            } else {
                str2 = "DELETE FROM bot_keyboard_topics WHERE uid = ";
                str3 = "DELETE FROM bot_keyboard WHERE uid = ";
                str4 = "DELETE FROM media_v4 WHERE uid = ";
            }
            yrVar.b.executeFast("DELETE FROM dialogs WHERE did = " + j10).stepThis().dispose();
            yrVar.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j10).stepThis().dispose();
            yrVar.b.executeFast("DELETE FROM chat_pinned_count WHERE uid = " + j10).stepThis().dispose();
            yrVar.b.executeFast("DELETE FROM channel_users_v2 WHERE did = " + j10).stepThis().dispose();
            yrVar.b.executeFast("DELETE FROM search_recent WHERE did = " + j10).stepThis().dispose();
            if (!m5.C(j10)) {
                str5 = str4;
                yrVar.b.executeFast("DELETE FROM enc_chats WHERE uid = " + m5.h(j10)).stepThis().dispose();
            } else if (m5.z(j10)) {
                SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("DELETE FROM chat_settings_v2 WHERE uid = ");
                str5 = str4;
                sb3.append(-j10);
                sQLiteDatabase3.executeFast(sb3.toString()).stepThis().dispose();
            } else {
                str5 = str4;
            }
            yrVar.b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j10).stepThis().dispose();
            yrVar.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + j10).stepThis().dispose();
            yrVar.b.executeFast("DELETE FROM widget_state WHERE uid = " + j10).stepThis().dispose();
            yrVar.b.executeFast(str9 + j10).stepThis().dispose();
            yrVar.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10).stepThis().dispose();
            yrVar.b.executeFast(str3 + j10).stepThis().dispose();
            yrVar.b.executeFast(str2 + j10).stepThis().dispose();
            yrVar.b.executeFast(str7 + j10).stepThis().dispose();
            yrVar.b.executeFast(str5 + j10).stepThis().dispose();
            yrVar.b.executeFast(str8 + j10).stepThis().dispose();
            yrVar.b.executeFast(str6 + j10).stepThis().dispose();
            ui mediaDataController22 = yrVar.getMediaDataController();
            mediaDataController22.getClass();
            g0.h3(new yg(mediaDataController22, j10, 0));
            g0.h3(new rq(yrVar, 10));
            yrVar.t1(false);
            ArrayList arrayList522 = new ArrayList();
            arrayList522.add(Long.valueOf(j10));
            yrVar.l2(arrayList522);
            return;
        } catch (Exception e27) {
            e = e27;
            sQLitePreparedStatement = null;
            sQLitePreparedStatement2 = null;
            sQLiteCursor = null;
            sQLiteCursor2 = null;
            yrVar.n(e);
            if (sQLiteCursor != null) {
            }
            if (sQLiteCursor2 != null) {
            }
            if (sQLitePreparedStatement != null) {
            }
            if (sQLitePreparedStatement2 == null) {
            }
        } catch (Throwable th17) {
            th = th17;
            sQLitePreparedStatement = null;
            sQLitePreparedStatement2 = null;
            sQLiteCursor = null;
            sQLiteCursor2 = null;
            if (sQLiteCursor != null) {
            }
            if (sQLiteCursor2 != null) {
            }
            if (sQLitePreparedStatement != null) {
            }
            if (sQLitePreparedStatement2 != null) {
            }
            throw th;
        }
        str7 = "DELETE FROM media_counts_v2 WHERE uid = ";
        str8 = "DELETE FROM messages_holes WHERE uid = ";
        str9 = "DELETE FROM widget_heights WHERE uid = ";
        str6 = "DELETE FROM media_holes_v2 WHERE uid = ";
        j10 = j3;
        yrVar = this;
    }

    public final void A1(int i7, int i10, int i11, int i12) {
        this.a.c(new jr(this, i7, i10, i11, i12, 0));
    }

    public final void B(long j3, SparseArray sparseArray) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                ArrayList arrayList = new ArrayList();
                if (sparseArray.size() != 0) {
                    this.b.beginTransaction();
                    SQLitePreparedStatement executeFast = this.b.executeFast("REPLACE INTO enc_tasks_v4 VALUES(?, ?, ?, ?)");
                    int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                        try {
                            int keyAt = sparseArray.keyAt(i10);
                            ArrayList arrayList2 = (ArrayList) sparseArray.get(keyAt);
                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                int intValue = ((Integer) arrayList2.get(i11)).intValue();
                                executeFast.requery();
                                executeFast.bindInteger(1, intValue);
                                executeFast.bindLong(2, j3);
                                executeFast.bindInteger(3, keyAt);
                                executeFast.bindInteger(4, 1);
                                i7 = Math.min(i7, intValue);
                                executeFast.step();
                                arrayList.add((Integer) arrayList2.get(i11));
                            }
                        } catch (Exception e10) {
                            e = e10;
                            sQLitePreparedStatement = executeFast;
                            o(e, true);
                            SQLiteDatabase sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            sQLitePreparedStatement = executeFast;
                            SQLiteDatabase sQLiteDatabase2 = this.b;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.commitTransaction();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                    executeFast.dispose();
                    this.b.commitTransaction();
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase3.executeFast("UPDATE messages_v2 SET ttl = 0 WHERE uid = " + j3 + " AND mid IN(" + TextUtils.join(", ", arrayList) + ")").stepThis().dispose();
                    getMessagesController().n0(i7, j3, sparseArray);
                }
                SQLiteDatabase sQLiteDatabase4 = this.b;
                if (sQLiteDatabase4 != null) {
                    sQLiteDatabase4.commitTransaction();
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(16:2|3|4|(4:5|6|7|(21:9|10|(1:12)(1:319)|13|14|15|16|17|18|19|20|21|(37:25|26|27|(5:29|30|(2:32|(1:34)(1:35))|36|(2:42|(1:44))(4:38|39|40|41))(2:170|171)|45|46|(3:48|49|(28:51|52|(1:54)(1:161)|55|(1:57)(1:160)|58|(1:60)(1:159)|61|62|(3:64|65|(1:67))|68|69|70|(1:72)|73|74|(1:76)|77|78|(9:80|(7:82|(1:84)|85|86|87|88|(1:153)(4:94|(1:152)(5:98|99|100|101|(1:103))|104|(1:106)))(1:157)|108|(3:129|130|(1:132))|110|(3:112|(1:114)|115)(2:118|(3:120|(1:122)|123)(2:124|(2:126|(1:128))))|116|117|41)(1:158)|107|108|(0)|110|(0)(0)|116|117|41))(1:163)|162|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|62|(0)|68|69|70|(0)|73|74|(0)|77|78|(0)(0)|107|108|(0)|110|(0)(0)|116|117|41|22|23)|175|176|177|178|180|181|(9:183|(6:186|187|188|(2:190|191)(1:193)|192|184)|199|200|(6:203|204|(3:205|206|(3:208|(2:210|(2:212|213)(1:277))(2:279|280)|278)(2:281|282))|(2:219|(12:221|222|223|224|(2:259|260)|226|227|228|229|(1:255)(5:235|(2:239|(5:241|242|243|244|(1:246)))|254|244|(0))|247|248)(2:275|276))(2:215|216)|217|201)|285|286|287|288)(2:290|291)|289)(1:322))|323|324|325|326|(7:384|385|(4:388|(4:393|(2:395|(1:397))(2:403|(1:405))|398|(2:400|401)(1:402))(2:390|391)|392|386)|406|407|(5:409|(3:413|410|411)|414|415|416)(1:423)|417)(1:328)|329|(6:331|332|333|334|335|336)(1:380)|337|(1:339)|340|(1:342)|343)|(5:345|(4:348|(4:351|(2:355|356)|357|349)|360|346)|361|362|(8:364|365|366|367|368|(1:370)|137|138))|374|365|366|367|368|(0)|137|138|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x069a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02df A[Catch: all -> 0x029b, Exception -> 0x02a0, TryCatch #9 {Exception -> 0x02a0, blocks: (B:108:0x02ca, B:130:0x02d0, B:132:0x02d6, B:110:0x02d9, B:112:0x02df, B:114:0x02ef, B:118:0x02f9, B:120:0x0301, B:122:0x030b, B:123:0x0312, B:124:0x031c, B:126:0x0324, B:128:0x032f, B:151:0x0297, B:157:0x02b6), top: B:129:0x02d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f9 A[Catch: all -> 0x029b, Exception -> 0x02a0, TryCatch #9 {Exception -> 0x02a0, blocks: (B:108:0x02ca, B:130:0x02d0, B:132:0x02d6, B:110:0x02d9, B:112:0x02df, B:114:0x02ef, B:118:0x02f9, B:120:0x0301, B:122:0x030b, B:123:0x0312, B:124:0x031c, B:126:0x0324, B:128:0x032f, B:151:0x0297, B:157:0x02b6), top: B:129:0x02d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06dc  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04a9 A[Catch: all -> 0x0445, Exception -> 0x049c, TRY_LEAVE, TryCatch #14 {Exception -> 0x049c, blocks: (B:243:0x0498, B:244:0x04a5, B:246:0x04a9), top: B:242:0x0498 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06d9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c1 A[Catch: all -> 0x00df, Exception -> 0x00e5, TRY_ENTER, TRY_LEAVE, TryCatch #19 {Exception -> 0x00e5, blocks: (B:30:0x00bd, B:32:0x00ca, B:34:0x00d0, B:35:0x00ef, B:36:0x00fc, B:44:0x0103, B:49:0x0136, B:65:0x019e, B:67:0x01a2, B:72:0x01c1, B:76:0x01e8, B:84:0x0225), top: B:29:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e8 A[Catch: all -> 0x00df, Exception -> 0x00e5, TRY_ENTER, TRY_LEAVE, TryCatch #19 {Exception -> 0x00e5, blocks: (B:30:0x00bd, B:32:0x00ca, B:34:0x00d0, B:35:0x00ef, B:36:0x00fc, B:44:0x0103, B:49:0x0136, B:65:0x019e, B:67:0x01a2, B:72:0x01c1, B:76:0x01e8, B:84:0x0225), top: B:29:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f6 A[Catch: all -> 0x02aa, Exception -> 0x02af, TryCatch #1 {Exception -> 0x02af, blocks: (B:27:0x00b3, B:46:0x0114, B:52:0x0143, B:55:0x0162, B:58:0x0179, B:61:0x0182, B:69:0x01a9, B:74:0x01d3, B:78:0x01f0, B:80:0x01f6, B:82:0x0201, B:86:0x0228, B:171:0x010e), top: B:26:0x00b3 }] */
    /* JADX WARN: Type inference failed for: r0v182, types: [org.telegram.tgnet.TLRPC$TL_dialogFolder] */
    /* JADX WARN: Type inference failed for: r0v98, types: [org.telegram.tgnet.TLRPC$TL_dialog] */
    /* JADX WARN: Type inference failed for: r0v99 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void B0(int i7, int i10, int i11, long[] jArr) {
        SQLiteCursor sQLiteCursor;
        yr yrVar;
        TLRPC.TL_messages_dialogs tL_messages_dialogs;
        ArrayList arrayList;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList2;
        TLRPC.TL_messages_dialogs tL_messages_dialogs2;
        HashSet hashSet;
        int i12;
        a0.h hVar;
        ArrayList arrayList3;
        int i13;
        int i14;
        int i15;
        SQLiteCursor sQLiteCursor4;
        yr yrVar2;
        ArrayList arrayList4;
        TLRPC.TL_messages_dialogs tL_messages_dialogs3;
        ArrayList arrayList5;
        ArrayList arrayList6;
        HashSet hashSet2;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        TLRPC.TL_messages_dialogs tL_messages_dialogs4;
        ArrayList arrayList10;
        TLRPC.Dialog dialog;
        ArrayList arrayList11;
        NativeByteBuffer byteBufferValue;
        int i16;
        TLRPC.TL_messages_dialogs tL_messages_dialogs5;
        ?? tL_dialog;
        ArrayList arrayList12;
        int i17;
        int i18;
        long longValue;
        NativeByteBuffer byteBufferValue2;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        HashSet hashSet3;
        NativeByteBuffer byteBufferValue3;
        yr yrVar3 = this;
        TLRPC.TL_messages_dialogs tL_messages_dialogs6 = new TLRPC.TL_messages_dialogs();
        ArrayList arrayList16 = new ArrayList();
        try {
            try {
                ArrayList arrayList17 = new ArrayList();
                HashSet hashSet4 = new HashSet();
                arrayList17.add(Long.valueOf(yrVar3.getUserConfig().e()));
                ArrayList arrayList18 = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                ArrayList arrayList21 = new ArrayList();
                a0.h hVar2 = new a0.h();
                a0.h hVar3 = new a0.h();
                ArrayList arrayList22 = new ArrayList(2);
                arrayList22.add(Integer.valueOf(i7));
                int i19 = 0;
                sQLiteCursor2 = null;
                while (true) {
                    try {
                        try {
                            arrayList2 = arrayList16;
                            if (i19 >= arrayList22.size()) {
                                break;
                            }
                            try {
                                Integer num = (Integer) arrayList22.get(i19);
                                num.getClass();
                                if (i19 == 0) {
                                    i15 = i10;
                                    i13 = i19;
                                    i14 = i11;
                                } else {
                                    i13 = i19;
                                    i14 = 100;
                                    i15 = 0;
                                }
                                ArrayList arrayList23 = new ArrayList();
                                HashSet hashSet5 = hashSet4;
                                SQLiteDatabase sQLiteDatabase = yrVar3.b;
                                Locale locale = Locale.US;
                                ArrayList arrayList24 = arrayList19;
                                try {
                                    StringBuilder sb2 = new StringBuilder();
                                    try {
                                        try {
                                            sb2.append("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, s.flags, m.date, d.pts, d.inbox_max, d.outbox_max, m.replydata, d.pinned, d.unread_count_i, d.flags, d.folder_id, d.data, d.unread_reactions, d.last_mid_group, d.ttl_period, d.unread_poll_votes FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid AND d.last_mid_group IS NULL LEFT JOIN dialog_settings as s ON d.did = s.did WHERE d.folder_id = ");
                                            sb2.append(num);
                                            sb2.append(" ORDER BY d.pinned DESC, d.date DESC LIMIT ");
                                            sb2.append(i15);
                                            sb2.append(",");
                                            sb2.append(i14);
                                        } catch (Exception e10) {
                                            e = e10;
                                            yrVar3 = this;
                                        }
                                        try {
                                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                            while (queryFinalized.next()) {
                                                try {
                                                    try {
                                                        try {
                                                            long longValue2 = queryFinalized.longValue(0);
                                                            if (m5.D(longValue2)) {
                                                                try {
                                                                    try {
                                                                        tL_dialog = new TLRPC.TL_dialogFolder();
                                                                        if (!queryFinalized.isNull(18)) {
                                                                            NativeByteBuffer byteBufferValue4 = queryFinalized.byteBufferValue(18);
                                                                            if (byteBufferValue4 != null) {
                                                                                tL_dialog.folder = TLRPC.TL_folder.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(false), false);
                                                                                byteBufferValue4.reuse();
                                                                            } else {
                                                                                TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
                                                                                tL_dialog.folder = tL_folder;
                                                                                tL_folder.id = m5.i(longValue2);
                                                                            }
                                                                        }
                                                                        TLRPC.TL_folder tL_folder2 = tL_dialog.folder;
                                                                        if (tL_folder2 != null) {
                                                                            if (i13 == 0) {
                                                                                arrayList22.add(Integer.valueOf(tL_folder2.id));
                                                                            }
                                                                        }
                                                                    } catch (Exception e11) {
                                                                        e = e11;
                                                                        yrVar = this;
                                                                        sQLiteCursor2 = queryFinalized;
                                                                        tL_messages_dialogs = tL_messages_dialogs6;
                                                                        arrayList = arrayList2;
                                                                        tL_messages_dialogs.dialogs.clear();
                                                                        tL_messages_dialogs.users.clear();
                                                                        tL_messages_dialogs.chats.clear();
                                                                        arrayList.clear();
                                                                        yrVar.n(e);
                                                                        yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                                                                        if (sQLiteCursor2 == null) {
                                                                        }
                                                                        sQLiteCursor2.dispose();
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    sQLiteCursor3 = queryFinalized;
                                                                    if (sQLiteCursor3 != null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                tL_dialog = new TLRPC.TL_dialog();
                                                            }
                                                            TLRPC.Dialog dialog2 = tL_dialog;
                                                            dialog2.id = longValue2;
                                                            dialog2.top_message = queryFinalized.intValue(1);
                                                            dialog2.unread_count = queryFinalized.intValue(2);
                                                            dialog2.last_message_date = queryFinalized.intValue(3);
                                                            int intValue = queryFinalized.intValue(10);
                                                            dialog2.pts = intValue;
                                                            if (intValue != 0) {
                                                                arrayList12 = arrayList22;
                                                                if (!m5.E(dialog2.id)) {
                                                                    i17 = 1;
                                                                    dialog2.flags = i17;
                                                                    dialog2.read_inbox_max_id = queryFinalized.intValue(11);
                                                                    dialog2.read_outbox_max_id = queryFinalized.intValue(12);
                                                                    int intValue2 = queryFinalized.intValue(14);
                                                                    dialog2.pinnedNum = intValue2;
                                                                    dialog2.pinned = intValue2 == 0;
                                                                    dialog2.unread_mentions_count = queryFinalized.intValue(15);
                                                                    int intValue3 = queryFinalized.intValue(16);
                                                                    dialog2.unread_mark = (intValue3 & 1) == 0;
                                                                    dialog2.view_forum_as_messages = (intValue3 & 64) == 0;
                                                                    long longValue3 = queryFinalized.longValue(8);
                                                                    i18 = (int) longValue3;
                                                                    ArrayList arrayList25 = arrayList12;
                                                                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                                                                    dialog2.notify_settings = tL_peerNotifySettings;
                                                                    if ((i18 & 1) != 0) {
                                                                        int i20 = (int) (longValue3 >> 32);
                                                                        tL_peerNotifySettings.mute_until = i20;
                                                                        if (i20 == 0) {
                                                                            tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                                                        }
                                                                    }
                                                                    dialog2.folder_id = queryFinalized.intValue(17);
                                                                    dialog2.unread_reactions_count = queryFinalized.intValue(19);
                                                                    longValue = queryFinalized.longValue(20);
                                                                    if (longValue != 0) {
                                                                        arrayList23.add(new Pair(Long.valueOf(longValue2), Long.valueOf(longValue)));
                                                                    }
                                                                    dialog2.ttl_period = queryFinalized.intValue(21);
                                                                    dialog2.unread_poll_votes_count = queryFinalized.intValue(22);
                                                                    tL_messages_dialogs6.dialogs.add(dialog2);
                                                                    if (jArr != null) {
                                                                        arrayList20.add(Long.valueOf(longValue2));
                                                                    }
                                                                    byteBufferValue2 = queryFinalized.byteBufferValue(4);
                                                                    if (byteBufferValue2 == null) {
                                                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                                        if (TLdeserialize != null) {
                                                                            arrayList14 = arrayList20;
                                                                            TLdeserialize.readAttachPath(byteBufferValue2, getUserConfig().n);
                                                                            byteBufferValue2.reuse();
                                                                            ij.N5(queryFinalized.intValue(5), TLdeserialize);
                                                                            TLdeserialize.id = queryFinalized.intValue(6);
                                                                            int intValue4 = queryFinalized.intValue(9);
                                                                            if (intValue4 != 0) {
                                                                                dialog2.last_message_date = intValue4;
                                                                            }
                                                                            TLdeserialize.send_state = queryFinalized.intValue(7);
                                                                            TLdeserialize.dialog_id = dialog2.id;
                                                                            tL_messages_dialogs6.messages.add(TLdeserialize);
                                                                            e(TLdeserialize, arrayList17, arrayList18, arrayList21);
                                                                            try {
                                                                                TLRPC.MessageReplyHeader messageReplyHeader = TLdeserialize.reply_to;
                                                                                if (messageReplyHeader == null || messageReplyHeader.reply_to_msg_id == 0 || !v0(TLdeserialize.action)) {
                                                                                    arrayList13 = arrayList23;
                                                                                    tL_messages_dialogs5 = tL_messages_dialogs6;
                                                                                } else {
                                                                                    if (queryFinalized.isNull(13) || (byteBufferValue3 = queryFinalized.byteBufferValue(13)) == null) {
                                                                                        arrayList13 = arrayList23;
                                                                                        tL_messages_dialogs5 = tL_messages_dialogs6;
                                                                                    } else {
                                                                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                                                                        TLdeserialize.replyMessage = TLdeserialize2;
                                                                                        arrayList13 = arrayList23;
                                                                                        tL_messages_dialogs5 = tL_messages_dialogs6;
                                                                                        try {
                                                                                            TLdeserialize2.readAttachPath(byteBufferValue3, getUserConfig().n);
                                                                                            byteBufferValue3.reuse();
                                                                                            TLRPC.Message message = TLdeserialize.replyMessage;
                                                                                            if (message != null) {
                                                                                                e(message, arrayList17, arrayList18, arrayList21);
                                                                                            }
                                                                                        } catch (Exception e12) {
                                                                                            e = e12;
                                                                                            sQLiteCursor4 = queryFinalized;
                                                                                            yrVar2 = this;
                                                                                            yrVar2.n(e);
                                                                                            if (!m5.C(longValue2)) {
                                                                                            }
                                                                                            if (m5.C(longValue2)) {
                                                                                            }
                                                                                            queryFinalized = sQLiteCursor4;
                                                                                            hashSet5 = hashSet3;
                                                                                            arrayList24 = arrayList15;
                                                                                            arrayList20 = arrayList14;
                                                                                            arrayList22 = arrayList25;
                                                                                            tL_messages_dialogs6 = tL_messages_dialogs5;
                                                                                            arrayList23 = arrayList13;
                                                                                        }
                                                                                    }
                                                                                    if (TLdeserialize.replyMessage == null) {
                                                                                        d(TLdeserialize, hVar2, hVar3);
                                                                                    }
                                                                                }
                                                                            } catch (Exception e13) {
                                                                                e = e13;
                                                                                arrayList13 = arrayList23;
                                                                                tL_messages_dialogs5 = tL_messages_dialogs6;
                                                                            }
                                                                        } else {
                                                                            arrayList13 = arrayList23;
                                                                            tL_messages_dialogs5 = tL_messages_dialogs6;
                                                                            arrayList14 = arrayList20;
                                                                            sQLiteCursor4 = queryFinalized;
                                                                            yrVar2 = this;
                                                                            byteBufferValue2.reuse();
                                                                        }
                                                                        if (!m5.C(longValue2)) {
                                                                            try {
                                                                                try {
                                                                                    if (dialog2.read_inbox_max_id > dialog2.top_message) {
                                                                                        dialog2.read_inbox_max_id = 0;
                                                                                    }
                                                                                } catch (Exception e14) {
                                                                                    e = e14;
                                                                                    yrVar = yrVar2;
                                                                                    sQLiteCursor2 = sQLiteCursor4;
                                                                                    arrayList = arrayList2;
                                                                                    tL_messages_dialogs = tL_messages_dialogs5;
                                                                                    tL_messages_dialogs.dialogs.clear();
                                                                                    tL_messages_dialogs.users.clear();
                                                                                    tL_messages_dialogs.chats.clear();
                                                                                    arrayList.clear();
                                                                                    yrVar.n(e);
                                                                                    yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                                                                                    if (sQLiteCursor2 == null) {
                                                                                    }
                                                                                    sQLiteCursor2.dispose();
                                                                                }
                                                                            } catch (Throwable th3) {
                                                                                th = th3;
                                                                                sQLiteCursor3 = sQLiteCursor4;
                                                                                if (sQLiteCursor3 != null) {
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        }
                                                                        if (m5.C(longValue2)) {
                                                                            arrayList15 = arrayList24;
                                                                            if (m5.E(longValue2)) {
                                                                                if (!arrayList17.contains(Long.valueOf(longValue2))) {
                                                                                    arrayList17.add(Long.valueOf(longValue2));
                                                                                }
                                                                                hashSet3 = hashSet5;
                                                                                hashSet3.add(Long.valueOf(longValue2));
                                                                            } else {
                                                                                hashSet3 = hashSet5;
                                                                                if (m5.z(longValue2)) {
                                                                                    long j3 = -longValue2;
                                                                                    if (!arrayList18.contains(Long.valueOf(j3))) {
                                                                                        arrayList18.add(Long.valueOf(j3));
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int h = m5.h(longValue2);
                                                                            arrayList15 = arrayList24;
                                                                            if (!arrayList15.contains(Integer.valueOf(h))) {
                                                                                arrayList15.add(Integer.valueOf(h));
                                                                            }
                                                                            hashSet3 = hashSet5;
                                                                        }
                                                                        queryFinalized = sQLiteCursor4;
                                                                        hashSet5 = hashSet3;
                                                                        arrayList24 = arrayList15;
                                                                        arrayList20 = arrayList14;
                                                                        arrayList22 = arrayList25;
                                                                        tL_messages_dialogs6 = tL_messages_dialogs5;
                                                                        arrayList23 = arrayList13;
                                                                    } else {
                                                                        arrayList13 = arrayList23;
                                                                        tL_messages_dialogs5 = tL_messages_dialogs6;
                                                                        arrayList14 = arrayList20;
                                                                    }
                                                                    sQLiteCursor4 = queryFinalized;
                                                                    yrVar2 = this;
                                                                    if (!m5.C(longValue2)) {
                                                                    }
                                                                    if (m5.C(longValue2)) {
                                                                    }
                                                                    queryFinalized = sQLiteCursor4;
                                                                    hashSet5 = hashSet3;
                                                                    arrayList24 = arrayList15;
                                                                    arrayList20 = arrayList14;
                                                                    arrayList22 = arrayList25;
                                                                    tL_messages_dialogs6 = tL_messages_dialogs5;
                                                                    arrayList23 = arrayList13;
                                                                }
                                                            } else {
                                                                arrayList12 = arrayList22;
                                                            }
                                                            i17 = 0;
                                                            dialog2.flags = i17;
                                                            dialog2.read_inbox_max_id = queryFinalized.intValue(11);
                                                            dialog2.read_outbox_max_id = queryFinalized.intValue(12);
                                                            int intValue22 = queryFinalized.intValue(14);
                                                            dialog2.pinnedNum = intValue22;
                                                            dialog2.pinned = intValue22 == 0;
                                                            dialog2.unread_mentions_count = queryFinalized.intValue(15);
                                                            int intValue32 = queryFinalized.intValue(16);
                                                            dialog2.unread_mark = (intValue32 & 1) == 0;
                                                            dialog2.view_forum_as_messages = (intValue32 & 64) == 0;
                                                            long longValue32 = queryFinalized.longValue(8);
                                                            i18 = (int) longValue32;
                                                            ArrayList arrayList252 = arrayList12;
                                                            TLRPC.TL_peerNotifySettings tL_peerNotifySettings2 = new TLRPC.TL_peerNotifySettings();
                                                            dialog2.notify_settings = tL_peerNotifySettings2;
                                                            if ((i18 & 1) != 0) {
                                                            }
                                                            dialog2.folder_id = queryFinalized.intValue(17);
                                                            dialog2.unread_reactions_count = queryFinalized.intValue(19);
                                                            longValue = queryFinalized.longValue(20);
                                                            if (longValue != 0) {
                                                            }
                                                            dialog2.ttl_period = queryFinalized.intValue(21);
                                                            dialog2.unread_poll_votes_count = queryFinalized.intValue(22);
                                                            tL_messages_dialogs6.dialogs.add(dialog2);
                                                            if (jArr != null) {
                                                            }
                                                            byteBufferValue2 = queryFinalized.byteBufferValue(4);
                                                            if (byteBufferValue2 == null) {
                                                            }
                                                            sQLiteCursor4 = queryFinalized;
                                                            yrVar2 = this;
                                                            if (!m5.C(longValue2)) {
                                                            }
                                                            if (m5.C(longValue2)) {
                                                            }
                                                            queryFinalized = sQLiteCursor4;
                                                            hashSet5 = hashSet3;
                                                            arrayList24 = arrayList15;
                                                            arrayList20 = arrayList14;
                                                            arrayList22 = arrayList252;
                                                            tL_messages_dialogs6 = tL_messages_dialogs5;
                                                            arrayList23 = arrayList13;
                                                        } catch (Exception e15) {
                                                            e = e15;
                                                            sQLiteCursor4 = queryFinalized;
                                                            tL_messages_dialogs5 = tL_messages_dialogs6;
                                                            yrVar2 = this;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        sQLiteCursor4 = queryFinalized;
                                                    }
                                                } catch (Exception e16) {
                                                    e = e16;
                                                    sQLiteCursor4 = queryFinalized;
                                                    tL_messages_dialogs2 = tL_messages_dialogs6;
                                                }
                                            }
                                            arrayList4 = arrayList23;
                                            tL_messages_dialogs3 = tL_messages_dialogs6;
                                            arrayList5 = arrayList20;
                                            arrayList6 = arrayList22;
                                            hashSet2 = hashSet5;
                                            arrayList7 = arrayList24;
                                            sQLiteCursor4 = queryFinalized;
                                            yrVar3 = this;
                                            try {
                                                sQLiteCursor4.dispose();
                                            } catch (Exception e17) {
                                                e = e17;
                                                tL_messages_dialogs2 = tL_messages_dialogs3;
                                            }
                                        } catch (Exception e18) {
                                            e = e18;
                                            yrVar3 = this;
                                            tL_messages_dialogs2 = tL_messages_dialogs6;
                                            yrVar = yrVar3;
                                            tL_messages_dialogs = tL_messages_dialogs2;
                                            arrayList = arrayList2;
                                            tL_messages_dialogs.dialogs.clear();
                                            tL_messages_dialogs.users.clear();
                                            tL_messages_dialogs.chats.clear();
                                            arrayList.clear();
                                            yrVar.n(e);
                                            yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                                            if (sQLiteCursor2 == null) {
                                            }
                                            sQLiteCursor2.dispose();
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        yrVar3 = this;
                                        sQLiteCursor3 = sQLiteCursor2;
                                        if (sQLiteCursor3 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Exception e19) {
                                    e = e19;
                                }
                            } catch (Exception e20) {
                                e = e20;
                            }
                            try {
                                if (arrayList4.isEmpty()) {
                                    arrayList8 = arrayList21;
                                    arrayList9 = arrayList7;
                                    tL_messages_dialogs4 = tL_messages_dialogs3;
                                    sQLiteCursor2 = null;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    int i21 = 0;
                                    while (i21 < arrayList4.size()) {
                                        ArrayList arrayList26 = arrayList4;
                                        try {
                                            Pair pair = (Pair) arrayList26.get(i21);
                                            sb3.append("uid = ");
                                            sb3.append(pair.first);
                                            sb3.append(" AND group_id = ");
                                            sb3.append(pair.second);
                                            i21++;
                                            if (i21 < arrayList26.size()) {
                                                sb3.append(" OR ");
                                            }
                                            arrayList4 = arrayList26;
                                        } catch (Exception e21) {
                                            e = e21;
                                            yrVar = yrVar3;
                                            arrayList = arrayList2;
                                            tL_messages_dialogs = tL_messages_dialogs3;
                                            sQLiteCursor2 = null;
                                            tL_messages_dialogs.dialogs.clear();
                                            tL_messages_dialogs.users.clear();
                                            tL_messages_dialogs.chats.clear();
                                            arrayList.clear();
                                            yrVar.n(e);
                                            yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                                            if (sQLiteCursor2 == null) {
                                            }
                                            sQLiteCursor2.dispose();
                                        } catch (Throwable th6) {
                                            th = th6;
                                            sQLiteCursor3 = null;
                                            if (sQLiteCursor3 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    SQLiteDatabase sQLiteDatabase2 = yrVar3.b;
                                    Locale locale2 = Locale.US;
                                    int i22 = 0;
                                    sQLiteCursor4 = sQLiteDatabase2.queryFinalized("SELECT uid, data, read_state, mid, send_state, date, replydata, group_id FROM messages_v2 WHERE " + ((Object) sb3) + " ORDER BY date DESC", new Object[0]);
                                    while (sQLiteCursor4.next()) {
                                        long longValue4 = sQLiteCursor4.longValue(i22);
                                        NativeByteBuffer byteBufferValue5 = sQLiteCursor4.byteBufferValue(1);
                                        tL_messages_dialogs2 = tL_messages_dialogs3;
                                        int i23 = 0;
                                        while (true) {
                                            try {
                                                if (i23 >= tL_messages_dialogs2.dialogs.size()) {
                                                    arrayList10 = arrayList7;
                                                    dialog = null;
                                                    break;
                                                }
                                                dialog = tL_messages_dialogs2.dialogs.get(i23);
                                                if (dialog != null) {
                                                    arrayList10 = arrayList7;
                                                    i16 = i23;
                                                    if (dialog.id == longValue4) {
                                                        break;
                                                    }
                                                } else {
                                                    arrayList10 = arrayList7;
                                                    i16 = i23;
                                                }
                                                i23 = i16 + 1;
                                                arrayList7 = arrayList10;
                                            } catch (Exception e22) {
                                                e = e22;
                                                yrVar = yrVar3;
                                                sQLiteCursor2 = sQLiteCursor4;
                                                tL_messages_dialogs = tL_messages_dialogs2;
                                                arrayList = arrayList2;
                                                tL_messages_dialogs.dialogs.clear();
                                                tL_messages_dialogs.users.clear();
                                                tL_messages_dialogs.chats.clear();
                                                arrayList.clear();
                                                yrVar.n(e);
                                                yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                                                if (sQLiteCursor2 == null) {
                                                    return;
                                                }
                                                sQLiteCursor2.dispose();
                                            }
                                        }
                                        if (dialog == null || byteBufferValue5 == null) {
                                            arrayList11 = arrayList21;
                                        } else {
                                            TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(false), false);
                                            if (TLdeserialize3 != null) {
                                                arrayList11 = arrayList21;
                                                try {
                                                    TLdeserialize3.readAttachPath(byteBufferValue5, yrVar3.getUserConfig().n);
                                                    byteBufferValue5.reuse();
                                                    ij.N5(sQLiteCursor4.intValue(2), TLdeserialize3);
                                                    TLdeserialize3.id = sQLiteCursor4.intValue(3);
                                                    int intValue5 = sQLiteCursor4.intValue(5);
                                                    if (intValue5 != 0) {
                                                        try {
                                                            try {
                                                                dialog.last_message_date = intValue5;
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                sQLiteCursor3 = sQLiteCursor4;
                                                                if (sQLiteCursor3 != null) {
                                                                    sQLiteCursor3.dispose();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (Exception e23) {
                                                            e = e23;
                                                            yrVar = this;
                                                            sQLiteCursor2 = sQLiteCursor4;
                                                            tL_messages_dialogs = tL_messages_dialogs2;
                                                            arrayList = arrayList2;
                                                            tL_messages_dialogs.dialogs.clear();
                                                            tL_messages_dialogs.users.clear();
                                                            tL_messages_dialogs.chats.clear();
                                                            arrayList.clear();
                                                            yrVar.n(e);
                                                            yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                                                            if (sQLiteCursor2 == null) {
                                                            }
                                                            sQLiteCursor2.dispose();
                                                        }
                                                    }
                                                    TLdeserialize3.send_state = sQLiteCursor4.intValue(4);
                                                    TLdeserialize3.dialog_id = longValue4;
                                                    tL_messages_dialogs2.messages.add(TLdeserialize3);
                                                    e(TLdeserialize3, arrayList17, arrayList18, null);
                                                    try {
                                                        TLRPC.MessageReplyHeader messageReplyHeader2 = TLdeserialize3.reply_to;
                                                        if (messageReplyHeader2 != null && messageReplyHeader2.reply_to_msg_id != 0 && v0(TLdeserialize3.action)) {
                                                            if (!sQLiteCursor4.isNull(7) && (byteBufferValue = sQLiteCursor4.byteBufferValue(7)) != null) {
                                                                TLRPC.Message TLdeserialize4 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                                TLdeserialize3.replyMessage = TLdeserialize4;
                                                                TLdeserialize4.readAttachPath(byteBufferValue, getUserConfig().n);
                                                                byteBufferValue.reuse();
                                                                TLRPC.Message message2 = TLdeserialize3.replyMessage;
                                                                if (message2 != null) {
                                                                    try {
                                                                        e(message2, arrayList17, arrayList18, null);
                                                                        if (TLdeserialize3.replyMessage == null) {
                                                                            d(TLdeserialize3, hVar2, hVar3);
                                                                        }
                                                                    } catch (Exception e24) {
                                                                        e = e24;
                                                                        yrVar3 = this;
                                                                        yrVar3.n(e);
                                                                        tL_messages_dialogs3 = tL_messages_dialogs2;
                                                                        arrayList21 = arrayList11;
                                                                        arrayList7 = arrayList10;
                                                                        i22 = 0;
                                                                    }
                                                                }
                                                            }
                                                            if (TLdeserialize3.replyMessage == null) {
                                                            }
                                                        }
                                                        yrVar3 = this;
                                                    } catch (Exception e25) {
                                                        e = e25;
                                                    }
                                                } catch (Exception e26) {
                                                    e = e26;
                                                    yrVar3 = this;
                                                    yrVar = yrVar3;
                                                    sQLiteCursor2 = sQLiteCursor4;
                                                    tL_messages_dialogs = tL_messages_dialogs2;
                                                    arrayList = arrayList2;
                                                    tL_messages_dialogs.dialogs.clear();
                                                    tL_messages_dialogs.users.clear();
                                                    tL_messages_dialogs.chats.clear();
                                                    arrayList.clear();
                                                    yrVar.n(e);
                                                    yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                                                    if (sQLiteCursor2 == null) {
                                                    }
                                                    sQLiteCursor2.dispose();
                                                } catch (Throwable th8) {
                                                    th = th8;
                                                    yrVar2 = this;
                                                    sQLiteCursor3 = sQLiteCursor4;
                                                    if (sQLiteCursor3 != null) {
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                arrayList11 = arrayList21;
                                                byteBufferValue5.reuse();
                                            }
                                        }
                                        tL_messages_dialogs3 = tL_messages_dialogs2;
                                        arrayList21 = arrayList11;
                                        arrayList7 = arrayList10;
                                        i22 = 0;
                                    }
                                    arrayList8 = arrayList21;
                                    arrayList9 = arrayList7;
                                    tL_messages_dialogs4 = tL_messages_dialogs3;
                                    sQLiteCursor4.dispose();
                                    sQLiteCursor2 = sQLiteCursor4;
                                }
                                hashSet4 = hashSet2;
                                tL_messages_dialogs6 = tL_messages_dialogs4;
                                arrayList20 = arrayList5;
                                arrayList16 = arrayList2;
                                arrayList21 = arrayList8;
                                arrayList19 = arrayList9;
                                arrayList22 = arrayList6;
                                i19 = i13 + 1;
                            } catch (Exception e27) {
                                e = e27;
                                tL_messages_dialogs2 = tL_messages_dialogs3;
                                yrVar = yrVar3;
                                sQLiteCursor2 = null;
                                tL_messages_dialogs = tL_messages_dialogs2;
                                arrayList = arrayList2;
                                tL_messages_dialogs.dialogs.clear();
                                tL_messages_dialogs.users.clear();
                                tL_messages_dialogs.chats.clear();
                                arrayList.clear();
                                yrVar.n(e);
                                yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                                if (sQLiteCursor2 == null) {
                                }
                                sQLiteCursor2.dispose();
                            } catch (Throwable th9) {
                                th = th9;
                                sQLiteCursor = null;
                                sQLiteCursor3 = sQLiteCursor;
                                if (sQLiteCursor3 != null) {
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                        }
                    } catch (Exception e28) {
                        e = e28;
                        yrVar = yrVar3;
                        tL_messages_dialogs = tL_messages_dialogs6;
                        arrayList = arrayList16;
                    }
                }
                ArrayList arrayList27 = arrayList19;
                ArrayList arrayList28 = arrayList20;
                tL_messages_dialogs2 = tL_messages_dialogs6;
                hashSet = hashSet4;
                try {
                    yrVar3.K0(hVar2, hVar3, arrayList17, arrayList18, 0);
                    yrVar = yrVar3;
                    if (jArr != null) {
                        try {
                            ArrayList arrayList29 = new ArrayList();
                            for (int i24 = 0; i24 < jArr.length; i24++) {
                                long j10 = jArr[i24];
                                if (!m5.C(j10)) {
                                    if (j10 <= 0) {
                                        long j11 = -j10;
                                        if (!arrayList18.contains(Long.valueOf(j11))) {
                                            arrayList18.add(Long.valueOf(j11));
                                        }
                                    } else if (!arrayList17.contains(Long.valueOf(j10))) {
                                        arrayList17.add(Long.valueOf(j10));
                                    }
                                    if (!arrayList28.contains(Long.valueOf(jArr[i24]))) {
                                        arrayList29.add(Long.valueOf(jArr[i24]));
                                    }
                                }
                            }
                            if (arrayList29.isEmpty()) {
                                i12 = 0;
                                hVar = null;
                            } else {
                                hVar = new a0.h(arrayList29.size());
                                SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                                Locale locale3 = Locale.US;
                                i12 = 0;
                                SQLiteCursor queryFinalized2 = sQLiteDatabase3.queryFinalized("SELECT did, folder_id FROM dialogs WHERE did IN(" + TextUtils.join(",", arrayList29) + ")", new Object[0]);
                                while (queryFinalized2.next()) {
                                    try {
                                        hVar.k(Integer.valueOf(queryFinalized2.intValue(1)), queryFinalized2.longValue(0));
                                    } catch (Exception e29) {
                                        e = e29;
                                        sQLiteCursor2 = queryFinalized2;
                                        tL_messages_dialogs = tL_messages_dialogs2;
                                        arrayList = arrayList2;
                                        tL_messages_dialogs.dialogs.clear();
                                        tL_messages_dialogs.users.clear();
                                        tL_messages_dialogs.chats.clear();
                                        arrayList.clear();
                                        yrVar.n(e);
                                        yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                                        if (sQLiteCursor2 == null) {
                                        }
                                        sQLiteCursor2.dispose();
                                    } catch (Throwable th11) {
                                        th = th11;
                                        sQLiteCursor3 = queryFinalized2;
                                        if (sQLiteCursor3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                queryFinalized2.dispose();
                                sQLiteCursor2 = null;
                            }
                            g0.h3(new bq(yrVar, hVar, 2));
                        } catch (Exception e30) {
                            e = e30;
                        }
                    } else {
                        i12 = 0;
                    }
                    if (arrayList27.isEmpty()) {
                        arrayList = arrayList2;
                    } else {
                        try {
                            arrayList = arrayList2;
                        } catch (Exception e31) {
                            e = e31;
                            arrayList = arrayList2;
                            tL_messages_dialogs = tL_messages_dialogs2;
                            tL_messages_dialogs.dialogs.clear();
                            tL_messages_dialogs.users.clear();
                            tL_messages_dialogs.chats.clear();
                            arrayList.clear();
                            yrVar.n(e);
                            yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                            if (sQLiteCursor2 == null) {
                            }
                            sQLiteCursor2.dispose();
                        }
                        try {
                            yrVar.V(TextUtils.join(",", arrayList27), arrayList, arrayList17);
                        } catch (Exception e32) {
                            e = e32;
                            tL_messages_dialogs = tL_messages_dialogs2;
                            tL_messages_dialogs.dialogs.clear();
                            tL_messages_dialogs.users.clear();
                            tL_messages_dialogs.chats.clear();
                            arrayList.clear();
                            yrVar.n(e);
                            yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                            if (sQLiteCursor2 == null) {
                            }
                            sQLiteCursor2.dispose();
                        }
                    }
                    if (!arrayList18.isEmpty()) {
                        yrVar.Q(TextUtils.join(",", arrayList18), tL_messages_dialogs2.chats);
                    }
                    if (!arrayList17.isEmpty()) {
                        yrVar.m0(arrayList17, tL_messages_dialogs2.users);
                    }
                } catch (Exception e33) {
                    e = e33;
                    yrVar = yrVar3;
                    tL_messages_dialogs = tL_messages_dialogs2;
                    arrayList = arrayList2;
                    tL_messages_dialogs.dialogs.clear();
                    tL_messages_dialogs.users.clear();
                    tL_messages_dialogs.chats.clear();
                    arrayList.clear();
                    yrVar.n(e);
                    yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, null, i7, 0, 100, 1, true, false, true);
                    if (sQLiteCursor2 == null) {
                    }
                    sQLiteCursor2.dispose();
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Exception e34) {
            e = e34;
            yrVar = yrVar3;
            tL_messages_dialogs = tL_messages_dialogs6;
            arrayList = arrayList16;
            sQLiteCursor2 = null;
        } catch (Throwable th13) {
            th = th13;
            sQLiteCursor = null;
        }
        if (!hashSet.isEmpty()) {
            HashSet hashSet6 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Long l10 = (Long) it.next();
                for (int i25 = i12; i25 < tL_messages_dialogs2.users.size(); i25++) {
                    if (tL_messages_dialogs2.users.get(i25).id == l10.longValue() && tL_messages_dialogs2.users.get(i25).premium) {
                        hashSet6.add(l10);
                    }
                }
            }
            if (!hashSet6.isEmpty()) {
                arrayList3 = yrVar.L0(hashSet6);
                tL_messages_dialogs = tL_messages_dialogs2;
                yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, arrayList3, i7, i10, i11, 1, false, false, true);
                if (sQLiteCursor2 == null) {
                    return;
                }
                sQLiteCursor2.dispose();
            }
        }
        arrayList3 = null;
        tL_messages_dialogs = tL_messages_dialogs2;
        yrVar.getMessagesController().J3(tL_messages_dialogs, arrayList, arrayList3, i7, i10, i11, 1, false, false, true);
        if (sQLiteCursor2 == null) {
        }
        sQLiteCursor2.dispose();
    }

    public final void B1(int i7, int i10, int i11, int i12) {
        try {
            if (this.E == i7 && this.F == i10 && this.G == i11 && this.s == i12) {
                return;
            }
            SQLitePreparedStatement executeFast = this.b.executeFast("UPDATE params SET seq = ?, pts = ?, date = ?, qts = ? WHERE id = 1");
            executeFast.bindInteger(1, i7);
            executeFast.bindInteger(2, i10);
            executeFast.bindInteger(3, i11);
            executeFast.bindInteger(4, i12);
            executeFast.step();
            executeFast.dispose();
            this.E = i7;
            this.F = i10;
            this.G = i11;
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    public final void C(vo voVar) {
        try {
            this.H.remove(voVar);
            this.I.remove(voVar.a);
            this.b.executeFast("DELETE FROM dialog_filter WHERE id = " + voVar.a).stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + voVar.a).stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + voVar.a).stepThis().dispose();
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x045f  */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C0() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        try {
            SparseArray sparseArray = new SparseArray();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            ArrayList arrayList12 = new ArrayList();
            ArrayList arrayList13 = new ArrayList();
            sQLiteCursor = this.b.queryFinalized("SELECT m.read_state, m.data, m.send_state, m.mid, m.date, r.random_id, m.uid, s.seq_in, s.seq_out, m.ttl FROM messages_v2 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid AND r.uid = m.uid LEFT JOIN messages_seq as s ON m.mid = s.mid WHERE (m.mid < 0 AND m.send_state = 1) OR (m.mid > 0 AND m.send_state = 3) ORDER BY m.mid DESC LIMIT 1000", new Object[0]);
            while (sQLiteCursor.next()) {
                try {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    if (byteBufferValue != null) {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        TLdeserialize.send_state = sQLiteCursor.intValue(2);
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                        byteBufferValue.reuse();
                        if (sparseArray.indexOfKey(TLdeserialize.id) < 0) {
                            ij.N5(sQLiteCursor.intValue(0), TLdeserialize);
                            TLdeserialize.id = sQLiteCursor.intValue(3);
                            TLdeserialize.date = sQLiteCursor.intValue(4);
                            if (!sQLiteCursor.isNull(5)) {
                                TLdeserialize.random_id = sQLiteCursor.longValue(5);
                            }
                            TLdeserialize.dialog_id = sQLiteCursor.longValue(6);
                            TLdeserialize.seq_in = sQLiteCursor.intValue(7);
                            TLdeserialize.seq_out = sQLiteCursor.intValue(8);
                            TLdeserialize.ttl = sQLiteCursor.intValue(9);
                            if (TLdeserialize.media instanceof TLRPC.TL_messageMediaPaidMedia) {
                                arrayList13.add(TLdeserialize);
                            } else {
                                arrayList5.add(TLdeserialize);
                            }
                            sparseArray.put(TLdeserialize.id, TLdeserialize);
                            if (m5.C(TLdeserialize.dialog_id)) {
                                int h = m5.h(TLdeserialize.dialog_id);
                                if (!arrayList12.contains(Integer.valueOf(h))) {
                                    arrayList12.add(Integer.valueOf(h));
                                }
                            } else if (m5.E(TLdeserialize.dialog_id)) {
                                if (!arrayList10.contains(Long.valueOf(TLdeserialize.dialog_id))) {
                                    arrayList10.add(Long.valueOf(TLdeserialize.dialog_id));
                                }
                            } else if (!arrayList11.contains(Long.valueOf(-TLdeserialize.dialog_id))) {
                                arrayList11.add(Long.valueOf(-TLdeserialize.dialog_id));
                            }
                            e(TLdeserialize, arrayList10, arrayList11, null);
                            if (TLdeserialize.send_state != 3 && ((TLdeserialize.peer_id.channel_id == 0 && !TLdeserialize.unread && !m5.C(TLdeserialize.dialog_id)) || TLdeserialize.id > 0)) {
                                TLdeserialize.send_state = 0;
                            }
                        }
                    } else {
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                    }
                    arrayList7 = arrayList3;
                    arrayList8 = arrayList4;
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor3 = sQLiteCursor;
                    n(e);
                    if (sQLiteCursor3 != 0) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor2 = sQLiteCursor;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
            }
            ArrayList arrayList14 = arrayList7;
            ArrayList arrayList15 = arrayList8;
            sQLiteCursor.dispose();
            if (!arrayList13.isEmpty()) {
                try {
                    int size = arrayList13.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList13.get(i7);
                        i7++;
                        TLRPC.Message message = (TLRPC.Message) obj;
                        this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + message.dialog_id + " AND mid = " + message.id).stepThis().dispose();
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor3 = 0;
                    n(e);
                    if (sQLiteCursor3 != 0) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor2 = null;
                    if (sQLiteCursor2 != null) {
                    }
                    throw th;
                }
            }
            ?? r62 = 0;
            sQLiteCursor3 = this.b.queryFinalized("SELECT m.data, m.send_state, m.mid, m.date, r.random_id, m.uid, m.ttl FROM scheduled_messages_v2 as m LEFT JOIN randoms_v2 as r ON r.mid = m.mid AND r.uid = m.uid WHERE (m.mid < 0 AND m.send_state = 1) OR (m.mid > 0 AND m.send_state = 3) ORDER BY date ASC", new Object[0]);
            while (sQLiteCursor3.next()) {
                try {
                    try {
                        NativeByteBuffer byteBufferValue2 = sQLiteCursor3.byteBufferValue(r62);
                        if (byteBufferValue2 != 0) {
                            TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r62), r62);
                            TLdeserialize2.send_state = sQLiteCursor3.intValue(1);
                            TLdeserialize2.readAttachPath(byteBufferValue2, getUserConfig().n);
                            byteBufferValue2.reuse();
                            if (sparseArray.indexOfKey(TLdeserialize2.id) < 0) {
                                TLdeserialize2.id = sQLiteCursor3.intValue(2);
                                TLdeserialize2.date = sQLiteCursor3.intValue(3);
                                if (!sQLiteCursor3.isNull(4)) {
                                    TLdeserialize2.random_id = sQLiteCursor3.longValue(4);
                                }
                                TLdeserialize2.dialog_id = sQLiteCursor3.longValue(5);
                                TLdeserialize2.ttl = sQLiteCursor3.intValue(6);
                                arrayList6.add(TLdeserialize2);
                                sparseArray.put(TLdeserialize2.id, TLdeserialize2);
                                if (m5.C(TLdeserialize2.dialog_id)) {
                                    int h7 = m5.h(TLdeserialize2.dialog_id);
                                    if (!arrayList12.contains(Integer.valueOf(h7))) {
                                        arrayList12.add(Integer.valueOf(h7));
                                    }
                                } else if (m5.E(TLdeserialize2.dialog_id)) {
                                    if (!arrayList10.contains(Long.valueOf(TLdeserialize2.dialog_id))) {
                                        arrayList10.add(Long.valueOf(TLdeserialize2.dialog_id));
                                    }
                                } else if (!arrayList11.contains(Long.valueOf(-TLdeserialize2.dialog_id))) {
                                    arrayList11.add(Long.valueOf(-TLdeserialize2.dialog_id));
                                }
                                e(TLdeserialize2, arrayList10, arrayList11, null);
                                if (TLdeserialize2.send_state != 3) {
                                    if (TLdeserialize2.peer_id.channel_id == 0) {
                                        if (!TLdeserialize2.unread) {
                                            if (m5.C(TLdeserialize2.dialog_id)) {
                                            }
                                            TLdeserialize2.send_state = 0;
                                        }
                                    }
                                    if (TLdeserialize2.id > 0) {
                                        TLdeserialize2.send_state = 0;
                                    }
                                }
                                r62 = 0;
                            }
                        }
                        r62 = 0;
                    } catch (Exception e12) {
                        e = e12;
                        sQLiteCursor3 = sQLiteCursor3;
                        n(e);
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor2 = sQLiteCursor3;
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                    throw th;
                }
            }
            sQLiteCursor3.dispose();
            getUserConfig().e();
            boolean z9 = false;
            sQLiteCursor3 = this.b.queryFinalized("SELECT m.data, m.send_state, m.mid, m.date, m.topic_id, m.ttl FROM quick_replies_messages as m WHERE (m.mid < 0 AND m.send_state = 1) OR (m.mid > 0 AND m.send_state = 3) ORDER BY mid DESC", new Object[0]);
            while (sQLiteCursor3.next()) {
                NativeByteBuffer byteBufferValue3 = sQLiteCursor3.byteBufferValue(z9 ? 1 : 0);
                if (byteBufferValue3 != null) {
                    TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(z9), z9);
                    TLdeserialize3.send_state = sQLiteCursor3.intValue(1);
                    TLdeserialize3.readAttachPath(byteBufferValue3, getUserConfig().n);
                    byteBufferValue3.reuse();
                    if (sparseArray.indexOfKey(TLdeserialize3.id) < 0) {
                        TLdeserialize3.id = sQLiteCursor3.intValue(2);
                        int intValue = sQLiteCursor3.intValue(4);
                        SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT name FROM business_replies WHERE topic_id = ?", Integer.valueOf(intValue));
                        String stringValue = queryFinalized.next() ? queryFinalized.stringValue(1) : null;
                        queryFinalized.dispose();
                        if (stringValue == null) {
                            this.b.executeFast("DELETE FROM quick_replies_messages WHERE mid = " + TLdeserialize3.id + " AND topic_id = " + intValue).stepThis().dispose();
                        } else {
                            TLRPC.TL_inputQuickReplyShortcut tL_inputQuickReplyShortcut = new TLRPC.TL_inputQuickReplyShortcut();
                            tL_inputQuickReplyShortcut.shortcut = stringValue;
                            TLdeserialize3.quick_reply_shortcut = tL_inputQuickReplyShortcut;
                            TLdeserialize3.quick_reply_shortcut_id = intValue;
                            if (intValue != 0) {
                                TLdeserialize3.flags |= TLObject.FLAG_30;
                            }
                            TLdeserialize3.date = sQLiteCursor3.intValue(3);
                            TLdeserialize3.ttl = sQLiteCursor3.intValue(5);
                            arrayList6.add(TLdeserialize3);
                            sparseArray.put(TLdeserialize3.id, TLdeserialize3);
                            if (m5.C(TLdeserialize3.dialog_id)) {
                                int h10 = m5.h(TLdeserialize3.dialog_id);
                                if (!arrayList12.contains(Integer.valueOf(h10))) {
                                    arrayList12.add(Integer.valueOf(h10));
                                }
                            } else if (m5.E(TLdeserialize3.dialog_id)) {
                                if (!arrayList10.contains(Long.valueOf(TLdeserialize3.dialog_id))) {
                                    arrayList10.add(Long.valueOf(TLdeserialize3.dialog_id));
                                }
                            } else if (!arrayList11.contains(Long.valueOf(-TLdeserialize3.dialog_id))) {
                                arrayList11.add(Long.valueOf(-TLdeserialize3.dialog_id));
                            }
                            e(TLdeserialize3, arrayList10, arrayList11, null);
                            if (TLdeserialize3.send_state != 3) {
                                if (TLdeserialize3.peer_id.channel_id == 0 && !TLdeserialize3.unread && !m5.C(TLdeserialize3.dialog_id)) {
                                    z9 = false;
                                    TLdeserialize3.send_state = 0;
                                }
                                if (TLdeserialize3.id > 0) {
                                    z9 = false;
                                    TLdeserialize3.send_state = 0;
                                }
                            }
                        }
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                }
            }
            sQLiteCursor = null;
            sQLiteCursor3.dispose();
            if (!arrayList12.isEmpty()) {
                V(TextUtils.join(",", arrayList12), arrayList9, arrayList10);
            }
            if (arrayList10.isEmpty()) {
                arrayList = arrayList14;
            } else {
                arrayList = arrayList14;
                m0(arrayList10, arrayList);
            }
            if (arrayList11.isEmpty()) {
                arrayList2 = arrayList15;
            } else {
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = z9 ? 1 : 0; i10 < arrayList11.size(); i10++) {
                    Long l10 = (Long) arrayList11.get(i10);
                    if (sb2.length() != 0) {
                        sb2.append(",");
                    }
                    sb2.append(l10);
                }
                arrayList2 = arrayList15;
                Q(sb2.toString(), arrayList2);
            }
            gz sendMessagesHelper = getSendMessagesHelper();
            sendMessagesHelper.getClass();
            g0.h3(new yj(sendMessagesHelper, arrayList, arrayList2, arrayList9, arrayList5, arrayList6, 1));
        } catch (Exception e13) {
            e = e13;
            sQLiteCursor = null;
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursor = null;
        }
    }

    public final void C1(int i7, long j3, List list, boolean z9) {
        this.a.c(new xq(this, j3, list, z9, i7, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(ArrayList arrayList, boolean z9) {
        SQLiteDatabase sQLiteDatabase;
        Exception e10;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement executeFast;
        SQLiteDatabase sQLiteDatabase3;
        if (arrayList.isEmpty()) {
            return;
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            if (z9) {
                try {
                    this.b.beginTransaction();
                } catch (Exception e11) {
                    e10 = e11;
                    o(e10, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (z9 || (sQLiteDatabase2 = this.b) == null) {
                    }
                    sQLiteDatabase2.commitTransaction();
                    return;
                }
            }
            executeFast = this.b.executeFast("DELETE FROM download_queue WHERE uid = ? AND type = ?");
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Pair pair = (Pair) arrayList.get(i7);
                executeFast.requery();
                executeFast.bindLong(1, ((Long) pair.first).longValue());
                executeFast.bindInteger(2, ((Integer) pair.second).intValue());
                executeFast.step();
            }
            executeFast.dispose();
            if (z9) {
                this.b.commitTransaction();
            }
            g0.h3(new sp(this, arrayList, 10));
            if (!z9 || (sQLiteDatabase3 = this.b) == null) {
                return;
            }
            sQLiteDatabase3.commitTransaction();
        } catch (Exception e12) {
            e10 = e12;
            sQLitePreparedStatement = executeFast;
            o(e10, true);
            if (sQLitePreparedStatement != null) {
            }
            if (z9) {
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            if (z9 && (sQLiteDatabase = this.b) != null) {
                sQLiteDatabase.commitTransaction();
            }
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:71|(2:73|(11:75|(1:77)|78|79|80|(1:126)(1:84)|85|86|(1:122)(4:92|(1:121)(5:96|97|98|99|(1:101))|102|(1:104))|105|106))|127|(3:129|78|79)|80|(1:82)|126|85|86|(1:88)|122|105|106) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ff, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0200, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x03f4, code lost:
    
        if (r3.migrated_to == null) goto L194;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        String str;
        ArrayList arrayList;
        a0.h hVar;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        SQLiteCursor sQLiteCursor3;
        ArrayList arrayList4;
        a0.h hVar2;
        ArrayList arrayList5;
        a0.h hVar3;
        int i7;
        a0.h hVar4;
        a0.h hVar5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        String str3;
        ArrayList arrayList9;
        ArrayList arrayList10;
        TLRPC.MessageReplyHeader messageReplyHeader;
        NativeByteBuffer byteBufferValue;
        try {
            try {
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                a0.h hVar6 = new a0.h();
                SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT d.did, d.unread_count, s.flags FROM dialogs as d LEFT JOIN dialog_settings as s ON d.did = s.did WHERE d.unread_count > 0", new Object[0]);
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int currentTime = getConnectionsManager().getCurrentTime();
                    while (true) {
                        str = ",";
                        if (!queryFinalized.next()) {
                            break;
                        }
                        long longValue = queryFinalized.longValue(2);
                        boolean z9 = (longValue & 1) != 0;
                        int i10 = (int) (longValue >> 32);
                        if (queryFinalized.isNull(2) || !z9 || (i10 != 0 && i10 < currentTime)) {
                            long longValue2 = queryFinalized.longValue(0);
                            if (!m5.D(longValue2)) {
                                hVar6.k(Integer.valueOf(queryFinalized.intValue(1)), longValue2);
                                if (sb2.length() != 0) {
                                    sb2.append(",");
                                }
                                sb2.append(longValue2);
                                if (m5.C(longValue2)) {
                                    int h = m5.h(longValue2);
                                    if (!arrayList13.contains(Integer.valueOf(h))) {
                                        arrayList13.add(Integer.valueOf(h));
                                    }
                                } else if (!m5.E(longValue2)) {
                                    long j3 = -longValue2;
                                    if (!arrayList12.contains(Long.valueOf(j3))) {
                                        arrayList12.add(Long.valueOf(j3));
                                    }
                                } else if (!arrayList11.contains(Long.valueOf(longValue2))) {
                                    arrayList11.add(Long.valueOf(longValue2));
                                }
                            }
                        }
                    }
                    queryFinalized.dispose();
                    a0.h hVar7 = new a0.h();
                    a0.h hVar8 = new a0.h();
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = new ArrayList();
                    ArrayList arrayList16 = new ArrayList();
                    ArrayList arrayList17 = new ArrayList();
                    ArrayList arrayList18 = new ArrayList();
                    if (sb2.length() > 0) {
                        SQLiteDatabase sQLiteDatabase = this.b;
                        StringBuilder sb3 = new StringBuilder();
                        a0.h hVar9 = hVar6;
                        sb3.append("SELECT read_state, data, send_state, mid, date, uid, replydata FROM messages_v2 WHERE uid IN (");
                        sb3.append(sb2.toString());
                        sb3.append(") AND out = 0 AND read_state IN(0,2) ORDER BY date DESC LIMIT 50");
                        sQLiteCursor3 = sQLiteDatabase.queryFinalized(sb3.toString(), new Object[0]);
                        int i11 = 0;
                        while (sQLiteCursor3.next()) {
                            try {
                                try {
                                    NativeByteBuffer byteBufferValue2 = sQLiteCursor3.byteBufferValue(1);
                                    if (byteBufferValue2 != null) {
                                        arrayList9 = arrayList17;
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                        arrayList8 = arrayList18;
                                        TLdeserialize.readAttachPath(byteBufferValue2, getUserConfig().n);
                                        byteBufferValue2.reuse();
                                        ij.N5(sQLiteCursor3.intValue(0), TLdeserialize);
                                        TLdeserialize.id = sQLiteCursor3.intValue(3);
                                        TLdeserialize.date = sQLiteCursor3.intValue(4);
                                        str3 = str;
                                        TLdeserialize.dialog_id = sQLiteCursor3.longValue(5);
                                        arrayList14.add(TLdeserialize);
                                        int max = Math.max(i11, TLdeserialize.date);
                                        e(TLdeserialize, arrayList11, arrayList12, null);
                                        TLdeserialize.send_state = sQLiteCursor3.intValue(2);
                                        if (TLdeserialize.peer_id.channel_id == 0) {
                                            if (!TLdeserialize.unread) {
                                                if (m5.C(TLdeserialize.dialog_id)) {
                                                }
                                                TLdeserialize.send_state = 0;
                                                if (m5.C(TLdeserialize.dialog_id) || sQLiteCursor3.isNull(5)) {
                                                    arrayList7 = arrayList14;
                                                    arrayList10 = arrayList13;
                                                } else {
                                                    arrayList7 = arrayList14;
                                                    arrayList10 = arrayList13;
                                                    TLdeserialize.random_id = sQLiteCursor3.longValue(5);
                                                }
                                                messageReplyHeader = TLdeserialize.reply_to;
                                                if (messageReplyHeader == null && messageReplyHeader.reply_to_msg_id != 0 && v0(TLdeserialize.action)) {
                                                    if (sQLiteCursor3.isNull(6) || (byteBufferValue = sQLiteCursor3.byteBufferValue(6)) == null) {
                                                        sQLiteCursor2 = sQLiteCursor3;
                                                    } else {
                                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                        TLdeserialize.replyMessage = TLdeserialize2;
                                                        sQLiteCursor2 = sQLiteCursor3;
                                                        try {
                                                            TLdeserialize2.readAttachPath(byteBufferValue, getUserConfig().n);
                                                            byteBufferValue.reuse();
                                                            TLRPC.Message message = TLdeserialize.replyMessage;
                                                            if (message != null) {
                                                                e(message, arrayList11, arrayList12, null);
                                                            }
                                                        } catch (Exception e10) {
                                                            e = e10;
                                                            try {
                                                                n(e);
                                                                i11 = max;
                                                                sQLiteCursor3 = sQLiteCursor2;
                                                                arrayList13 = arrayList10;
                                                                str = str3;
                                                                arrayList17 = arrayList9;
                                                                arrayList18 = arrayList8;
                                                                arrayList14 = arrayList7;
                                                            } catch (Exception e11) {
                                                                e = e11;
                                                                n(e);
                                                                if (sQLiteCursor2 == null) {
                                                                    sQLiteCursor2.dispose();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                        }
                                                    }
                                                    if (TLdeserialize.replyMessage == null) {
                                                        d(TLdeserialize, hVar7, hVar8);
                                                    }
                                                } else {
                                                    sQLiteCursor2 = sQLiteCursor3;
                                                }
                                                i11 = max;
                                            }
                                        }
                                        if (TLdeserialize.id > 0) {
                                            TLdeserialize.send_state = 0;
                                        }
                                        if (m5.C(TLdeserialize.dialog_id)) {
                                        }
                                        arrayList7 = arrayList14;
                                        arrayList10 = arrayList13;
                                        messageReplyHeader = TLdeserialize.reply_to;
                                        if (messageReplyHeader == null) {
                                        }
                                        sQLiteCursor2 = sQLiteCursor3;
                                        i11 = max;
                                    } else {
                                        arrayList7 = arrayList14;
                                        arrayList8 = arrayList18;
                                        str3 = str;
                                        arrayList9 = arrayList17;
                                        arrayList10 = arrayList13;
                                        sQLiteCursor2 = sQLiteCursor3;
                                    }
                                    sQLiteCursor3 = sQLiteCursor2;
                                    arrayList13 = arrayList10;
                                    str = str3;
                                    arrayList17 = arrayList9;
                                    arrayList18 = arrayList8;
                                    arrayList14 = arrayList7;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteCursor = sQLiteCursor3;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                sQLiteCursor2 = sQLiteCursor3;
                            }
                        }
                        ArrayList arrayList19 = arrayList14;
                        ArrayList arrayList20 = arrayList18;
                        str2 = str;
                        ArrayList arrayList21 = arrayList17;
                        ArrayList arrayList22 = arrayList13;
                        sQLiteCursor3.dispose();
                        this.b.executeFast("DELETE FROM unread_push_messages WHERE date <= " + i11).stepThis().dispose();
                        ?? r92 = 0;
                        SQLiteCursor queryFinalized2 = this.b.queryFinalized("SELECT data, mid, date, uid, random, fm, name, uname, flags, topicId, is_reaction FROM unread_push_messages WHERE 1 ORDER BY date DESC LIMIT 50", new Object[0]);
                        while (queryFinalized2.next()) {
                            try {
                                NativeByteBuffer byteBufferValue3 = queryFinalized2.byteBufferValue(r92);
                                if (byteBufferValue3 != 0) {
                                    TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(r92), r92);
                                    byteBufferValue3.reuse();
                                    TLdeserialize3.id = queryFinalized2.intValue(1);
                                    TLdeserialize3.date = queryFinalized2.intValue(2);
                                    hVar4 = hVar7;
                                    hVar5 = hVar8;
                                    TLdeserialize3.dialog_id = queryFinalized2.longValue(3);
                                    TLdeserialize3.random_id = queryFinalized2.longValue(4);
                                    String stringValue = queryFinalized2.isNull(5) ? null : queryFinalized2.stringValue(5);
                                    String stringValue2 = queryFinalized2.isNull(6) ? null : queryFinalized2.stringValue(6);
                                    String stringValue3 = queryFinalized2.isNull(7) ? null : queryFinalized2.stringValue(7);
                                    int intValue = queryFinalized2.intValue(8);
                                    int intValue2 = queryFinalized2.intValue(9);
                                    if (ij.a1(TLdeserialize3) == 0 && m5.E(TLdeserialize3.dialog_id)) {
                                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                        TLdeserialize3.from_id = tL_peerUser;
                                        arrayList6 = arrayList22;
                                        tL_peerUser.user_id = TLdeserialize3.dialog_id;
                                    } else {
                                        arrayList6 = arrayList22;
                                    }
                                    if (m5.E(TLdeserialize3.dialog_id)) {
                                        if (!arrayList11.contains(Long.valueOf(TLdeserialize3.dialog_id))) {
                                            arrayList11.add(Long.valueOf(TLdeserialize3.dialog_id));
                                        }
                                    } else if (m5.z(TLdeserialize3.dialog_id) && !arrayList12.contains(Long.valueOf(-TLdeserialize3.dialog_id))) {
                                        arrayList12.add(Long.valueOf(-TLdeserialize3.dialog_id));
                                    }
                                    if (intValue2 != 0) {
                                        TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                                        TLdeserialize3.reply_to = tL_messageReplyHeader;
                                        tL_messageReplyHeader.forum_topic = true;
                                        tL_messageReplyHeader.reply_to_top_id = intValue2;
                                    }
                                    ij ijVar = new ij(this.currentAccount, TLdeserialize3, stringValue, stringValue2, stringValue3, (intValue & 1) != 0, (intValue & 2) != 0, (TLdeserialize3.flags & TLObject.FLAG_31) != 0, false);
                                    int intValue3 = queryFinalized2.intValue(10);
                                    ijVar.I = intValue3 == 1;
                                    ijVar.J = intValue3 == 2;
                                    arrayList15.add(ijVar);
                                    e(TLdeserialize3, arrayList11, arrayList12, null);
                                } else {
                                    hVar4 = hVar7;
                                    hVar5 = hVar8;
                                    arrayList6 = arrayList22;
                                }
                                hVar7 = hVar4;
                                hVar8 = hVar5;
                                arrayList22 = arrayList6;
                                r92 = 0;
                            } catch (Exception e13) {
                                e = e13;
                                sQLiteCursor2 = queryFinalized2;
                                n(e);
                                if (sQLiteCursor2 == null) {
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = queryFinalized2;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        }
                        a0.h hVar10 = hVar7;
                        a0.h hVar11 = hVar8;
                        ArrayList arrayList23 = arrayList22;
                        sQLiteCursor2 = null;
                        queryFinalized2.dispose();
                        arrayList = arrayList19;
                        K0(hVar10, hVar11, arrayList11, arrayList12, 0);
                        if (arrayList23.isEmpty()) {
                            arrayList2 = arrayList20;
                        } else {
                            arrayList2 = arrayList20;
                            V(TextUtils.join(str2, arrayList23), arrayList2, arrayList11);
                        }
                        if (!arrayList11.isEmpty()) {
                            m0(arrayList11, arrayList16);
                        }
                        if (arrayList12.isEmpty()) {
                            arrayList3 = arrayList21;
                        } else {
                            arrayList3 = arrayList21;
                            Q(TextUtils.join(str2, arrayList12), arrayList3);
                            int i12 = 0;
                            while (i12 < arrayList3.size()) {
                                TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i12);
                                if (chat != null) {
                                    if (!t3.r0(chat)) {
                                        if (!chat.min) {
                                        }
                                    }
                                    long j10 = -chat.id;
                                    this.b.executeFast("UPDATE dialogs SET unread_count = 0 WHERE did = " + j10).stepThis().dispose();
                                    SQLiteDatabase sQLiteDatabase2 = this.b;
                                    Locale locale = Locale.US;
                                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET read_state = 3 WHERE uid = " + j10 + " AND mid > 0 AND read_state IN(0,2) AND out = 0").stepThis().dispose();
                                    arrayList3.remove(i12);
                                    i12 += -1;
                                    hVar3 = hVar9;
                                    hVar3.l(j10);
                                    for (int i13 = 0; i13 < arrayList.size(); i13 = i7 + 1) {
                                        int i14 = i13;
                                        if (((TLRPC.Message) arrayList.get(i13)).dialog_id == j10) {
                                            arrayList.remove(i14);
                                            i7 = i14 - 1;
                                        } else {
                                            i7 = i14;
                                        }
                                    }
                                    i12++;
                                    hVar9 = hVar3;
                                    sQLiteCursor2 = null;
                                }
                                hVar3 = hVar9;
                                i12++;
                                hVar9 = hVar3;
                                sQLiteCursor2 = null;
                            }
                        }
                        hVar = hVar9;
                    } else {
                        arrayList = arrayList14;
                        hVar = hVar6;
                        arrayList2 = arrayList18;
                        str2 = ",";
                        arrayList3 = arrayList17;
                    }
                    Collections.reverse(arrayList);
                    arrayList11.clear();
                    arrayList12.clear();
                    sQLiteCursor3 = this.b.queryFinalized("SELECT uid, sid, date, expire_date, localName, flags FROM story_pushes", new Object[0]);
                    HashMap hashMap = new HashMap();
                    while (sQLiteCursor3.next()) {
                        long longValue3 = sQLiteCursor3.longValue(0);
                        if (longValue3 >= 0) {
                            if (!arrayList11.contains(Long.valueOf(longValue3))) {
                                arrayList11.add(Long.valueOf(longValue3));
                            }
                        } else if (!arrayList12.contains(Long.valueOf(longValue3))) {
                            arrayList12.add(Long.valueOf(longValue3));
                        }
                        int intValue4 = sQLiteCursor3.intValue(1);
                        long longValue4 = sQLiteCursor3.longValue(2);
                        long longValue5 = sQLiteCursor3.longValue(3);
                        String stringValue4 = sQLiteCursor3.stringValue(4);
                        int intValue5 = sQLiteCursor3.intValue(5);
                        ct ctVar = (ct) hashMap.get(Long.valueOf(longValue3));
                        if (ctVar != null) {
                            arrayList4 = arrayList2;
                            hVar2 = hVar;
                            arrayList5 = arrayList;
                            ctVar.c.put(Integer.valueOf(intValue4), new Pair(Long.valueOf(longValue4), Long.valueOf(longValue5)));
                            ctVar.e = ctVar.a();
                            ctVar.d |= (intValue5 & 1) != 0;
                            if (!TextUtils.isEmpty(stringValue4)) {
                                ctVar.b = stringValue4;
                            }
                        } else {
                            arrayList4 = arrayList2;
                            hVar2 = hVar;
                            arrayList5 = arrayList;
                            ct ctVar2 = new ct(stringValue4, longValue3, intValue4, longValue4, longValue5);
                            ctVar2.d = (intValue5 & 1) != 0;
                            hashMap.put(Long.valueOf(longValue3), ctVar2);
                        }
                        arrayList2 = arrayList4;
                        hVar = hVar2;
                        arrayList = arrayList5;
                    }
                    ArrayList arrayList24 = arrayList2;
                    a0.h hVar12 = hVar;
                    ArrayList arrayList25 = arrayList;
                    sQLiteCursor3.dispose();
                    if (!arrayList11.isEmpty()) {
                        m0(arrayList11, arrayList16);
                    }
                    if (!arrayList12.isEmpty()) {
                        Q(TextUtils.join(str2, arrayList12), arrayList3);
                    }
                    g0.h3(new bi.n8(this, hVar12, arrayList25, arrayList15, arrayList16, arrayList3, arrayList24, hashMap, 3));
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor2 = queryFinalized;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e15) {
            e = e15;
            sQLiteCursor2 = null;
        } catch (Throwable th6) {
            th = th6;
            sQLiteCursor = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D1(long j3, List list, boolean z9, boolean z10, int i7) {
        yr yrVar;
        boolean z11;
        boolean z12;
        HashSet hashSet;
        HashMap hashMap;
        boolean z13;
        int i10;
        int i11;
        SQLitePreparedStatement sQLitePreparedStatement;
        TLRPC.TL_forumTopic tL_forumTopic;
        long o4;
        boolean contains;
        NativeByteBuffer nativeByteBuffer;
        NativeByteBuffer nativeByteBuffer2;
        int i12;
        int i13;
        yr yrVar2 = this;
        long j10 = j3;
        boolean z14 = true;
        z14 = true;
        z14 = true;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        sQLitePreparedStatement2 = null;
        sQLitePreparedStatement2 = null;
        try {
            try {
                hashSet = new HashSet();
                hashMap = new HashMap();
                z13 = false;
                i10 = 0;
            } catch (Exception e10) {
                e = e10;
                yrVar = yrVar2;
            }
            while (true) {
                i11 = 2;
                if (i10 >= list.size()) {
                    break;
                }
                try {
                    TLRPC.TL_forumTopic tL_forumTopic2 = (TLRPC.TL_forumTopic) list.get(i10);
                    SQLiteCursor queryFinalized = yrVar2.b.queryFinalized("SELECT did, pinned FROM topics WHERE did = " + j10 + " AND topic_id = " + tL_forumTopic2.id, new Object[0]);
                    boolean next = queryFinalized.next();
                    if (next) {
                        hashMap.put(Integer.valueOf(i10), Integer.valueOf(queryFinalized.intValue(2)));
                    }
                    queryFinalized.dispose();
                    if (next) {
                        hashSet.add(Integer.valueOf(i10));
                    }
                    i10++;
                } catch (Exception e11) {
                    e = e11;
                    yrVar = yrVar2;
                    z12 = z14;
                }
                e = e11;
                yrVar = yrVar2;
                z12 = z14;
                try {
                    yrVar.o(e, z12);
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    yrVar.b.commitTransaction();
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    yrVar.b.commitTransaction();
                    throw th;
                }
            }
            if (z9) {
                yrVar2.b.executeFast("DELETE FROM topics WHERE did = " + j10).stepThis().dispose();
            }
            sQLitePreparedStatement2 = yrVar2.b.executeFast("REPLACE INTO topics VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            if (z10) {
                yrVar2.b.beginTransaction();
            }
            int i14 = 0;
            while (i14 < list.size()) {
                try {
                    try {
                        tL_forumTopic = (TLRPC.TL_forumTopic) list.get(i14);
                        o4 = yrVar2.u0(4, j10) ? m5.o(tL_forumTopic.from_id) : tL_forumTopic.id;
                        contains = hashSet.contains(Integer.valueOf(i14));
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindLong(z14 ? 1 : 0, j10);
                        sQLitePreparedStatement2.bindLong(i11, o4);
                        z11 = z14 ? 1 : 0;
                        try {
                            nativeByteBuffer = new NativeByteBuffer(tL_forumTopic.getObjectSize());
                            tL_forumTopic.serializeToStream(nativeByteBuffer);
                            sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer);
                            sQLitePreparedStatement2.bindInteger(4, tL_forumTopic.top_message);
                            nativeByteBuffer2 = new NativeByteBuffer(tL_forumTopic.topicStartMessage.getObjectSize());
                            tL_forumTopic.topicStartMessage.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement2.bindByteBuffer(5, nativeByteBuffer2);
                            i12 = i14;
                            sQLitePreparedStatement2.bindInteger(6, tL_forumTopic.unread_count);
                            sQLitePreparedStatement2.bindInteger(7, tL_forumTopic.read_inbox_max_id);
                            sQLitePreparedStatement2.bindInteger(8, tL_forumTopic.unread_mentions_count);
                            sQLitePreparedStatement2.bindInteger(9, tL_forumTopic.unread_reactions_count);
                            sQLitePreparedStatement2.bindInteger(10, tL_forumTopic.read_outbox_max_id);
                        } catch (Exception e12) {
                            e = e12;
                            yrVar = yrVar2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        yrVar = yrVar2;
                    }
                } catch (Exception e13) {
                    e = e13;
                    yrVar = yrVar2;
                    z11 = z14;
                    z12 = z11;
                    yrVar.o(e, z12);
                    if (sQLitePreparedStatement2 != null) {
                    }
                    yrVar.b.commitTransaction();
                }
                try {
                    if (tL_forumTopic.isShort) {
                        try {
                            if (hashMap.containsKey(Integer.valueOf(i12))) {
                                sQLitePreparedStatement2.bindInteger(11, ((Integer) hashMap.get(Integer.valueOf(i12))).intValue());
                                sQLitePreparedStatement2.bindInteger(12, tL_forumTopic.totalMessagesCount);
                                sQLitePreparedStatement2.bindInteger(13, tL_forumTopic.hidden ? 1 : 0);
                                sQLitePreparedStatement2.bindInteger(14, i7);
                                sQLitePreparedStatement2.bindInteger(15, tL_forumTopic.nopaid_messages_exception ? 1 : 0);
                                sQLitePreparedStatement2.bindInteger(16, tL_forumTopic.unread_poll_votes_count);
                                sQLitePreparedStatement2.step();
                                nativeByteBuffer2.reuse();
                                nativeByteBuffer.reuse();
                                if (contains) {
                                    sQLitePreparedStatement = sQLitePreparedStatement2;
                                    long j11 = o4;
                                    yrVar = this;
                                    try {
                                        SQLiteDatabase sQLiteDatabase = yrVar.b;
                                        Locale locale = Locale.ENGLISH;
                                        sQLiteDatabase.executeFast("DELETE FROM messages_holes_topics WHERE uid = " + j10 + " AND topic_id = " + j11).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM media_holes_topics WHERE uid = " + j10 + " AND topic_id = " + j11).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM messages_topics WHERE uid = " + j10 + " AND topic_id = " + j11).stepThis().dispose();
                                        yrVar.b.executeFast("DELETE FROM media_topics WHERE uid = " + j10 + " AND topic_id = " + j11).stepThis().dispose();
                                        SQLitePreparedStatement executeFast = yrVar.b.executeFast("REPLACE INTO messages_holes_topics VALUES(?, ?, ?, ?)");
                                        i13 = i12;
                                        w(j10, executeFast, yrVar.b.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)"), tL_forumTopic.top_message, j11);
                                        executeFast.dispose();
                                        executeFast.dispose();
                                    } catch (Exception e14) {
                                        e = e14;
                                        sQLitePreparedStatement2 = sQLitePreparedStatement;
                                        z12 = z11;
                                        yrVar.o(e, z12);
                                        if (sQLitePreparedStatement2 != null) {
                                        }
                                        yrVar.b.commitTransaction();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        sQLitePreparedStatement2 = sQLitePreparedStatement;
                                        if (sQLitePreparedStatement2 != null) {
                                        }
                                        yrVar.b.commitTransaction();
                                        throw th;
                                    }
                                } else {
                                    long j12 = o4;
                                    SQLitePreparedStatement sQLitePreparedStatement3 = sQLitePreparedStatement2;
                                    try {
                                        int i15 = tL_forumTopic.top_message;
                                        sQLitePreparedStatement = sQLitePreparedStatement3;
                                        try {
                                            u(i15, i15, j3, j12, "messages_holes_topics");
                                            try {
                                                int i16 = tL_forumTopic.top_message;
                                                t(i16, j3, 0L, i16, -1);
                                                yrVar = this;
                                                i13 = i12;
                                            } catch (Exception e15) {
                                                e = e15;
                                                yrVar = this;
                                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                                z12 = z11;
                                                yrVar.o(e, z12);
                                                if (sQLitePreparedStatement2 != null) {
                                                }
                                                yrVar.b.commitTransaction();
                                            } catch (Throwable th5) {
                                                th = th5;
                                                yrVar = this;
                                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                                if (sQLitePreparedStatement2 != null) {
                                                }
                                                yrVar.b.commitTransaction();
                                                throw th;
                                            }
                                        } catch (Exception e16) {
                                            e = e16;
                                            yrVar = this;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            yrVar = this;
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        yrVar = this;
                                        sQLitePreparedStatement = sQLitePreparedStatement3;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        yrVar = this;
                                        sQLitePreparedStatement = sQLitePreparedStatement3;
                                    }
                                }
                                i14 = i13 + 1;
                                j10 = j3;
                                yrVar2 = yrVar;
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                z14 = z11;
                                z13 = false;
                                i11 = 2;
                            }
                        } catch (Exception e18) {
                            e = e18;
                            yrVar = yrVar2;
                            z12 = z11;
                            yrVar.o(e, z12);
                            if (sQLitePreparedStatement2 != null) {
                            }
                            yrVar.b.commitTransaction();
                        }
                    }
                    sQLitePreparedStatement2.bindInteger(15, tL_forumTopic.nopaid_messages_exception ? 1 : 0);
                    sQLitePreparedStatement2.bindInteger(16, tL_forumTopic.unread_poll_votes_count);
                    sQLitePreparedStatement2.step();
                    nativeByteBuffer2.reuse();
                    nativeByteBuffer.reuse();
                    if (contains) {
                    }
                    i14 = i13 + 1;
                    j10 = j3;
                    yrVar2 = yrVar;
                    sQLitePreparedStatement2 = sQLitePreparedStatement;
                    z14 = z11;
                    z13 = false;
                    i11 = 2;
                } catch (Exception e19) {
                    e = e19;
                    yrVar = this;
                    z12 = z11;
                    yrVar.o(e, z12);
                    if (sQLitePreparedStatement2 != null) {
                    }
                    yrVar.b.commitTransaction();
                } catch (Throwable th8) {
                    th = th8;
                    yrVar = this;
                    if (sQLitePreparedStatement2 != null) {
                    }
                    yrVar.b.commitTransaction();
                    throw th;
                }
                sQLitePreparedStatement2.bindInteger(11, tL_forumTopic.pinned ? tL_forumTopic.pinnedOrder + 1 : 0);
                sQLitePreparedStatement2.bindInteger(12, tL_forumTopic.totalMessagesCount);
                sQLitePreparedStatement2.bindInteger(13, tL_forumTopic.hidden ? 1 : 0);
                sQLitePreparedStatement2.bindInteger(14, i7);
            }
            yrVar = yrVar2;
            z11 = z14 ? 1 : 0;
            boolean z15 = z13;
            sQLitePreparedStatement = sQLitePreparedStatement2;
            yrVar.t1(z15);
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            yrVar.b.commitTransaction();
        } catch (Throwable th9) {
            th = th9;
            yrVar = yrVar2;
        }
    }

    public final void E(ArrayList arrayList, long j3) {
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.US;
            sQLiteDatabase.executeFast("DELETE FROM unread_push_messages WHERE uid = " + j3 + " AND mid IN(" + TextUtils.join(",", arrayList) + ")").stepThis().dispose();
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final /* synthetic */ void E0(int r49, int r50, int r51, long r52, long r54, org.telegram.tgnet.TLRPC.messages_Messages r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 3871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yr.E0(int, int, int, long, long, org.telegram.tgnet.TLRPC$messages_Messages, boolean):void");
    }

    public final void E1(long j3, long j10) {
        this.a.c(new vp(0, j3, j10, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(long j3, long j10, int i7, int i10) {
        SQLitePreparedStatement sQLitePreparedStatement;
        int i11;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i12;
        if (i10 == -1) {
            if (j10 != 0) {
                if (i7 == 0) {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    StringBuilder t6 = a8.p0.t(j3, "DELETE FROM media_holes_topics WHERE uid = ", " AND topic_id = ");
                    t6.append(j10);
                    sQLiteDatabase.executeFast(t6.toString()).stepThis().dispose();
                } else {
                    SQLiteDatabase sQLiteDatabase2 = this.b;
                    Locale locale2 = Locale.US;
                    StringBuilder t10 = a8.p0.t(j3, "DELETE FROM media_holes_topics WHERE uid = ", " AND topic_id = ");
                    t10.append(j10);
                    t10.append(" AND start = 0");
                    sQLiteDatabase2.executeFast(t10.toString()).stepThis().dispose();
                }
            } else if (i7 == 0) {
                SQLiteDatabase sQLiteDatabase3 = this.b;
                Locale locale3 = Locale.US;
                sQLiteDatabase3.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j3).stepThis().dispose();
            } else {
                SQLiteDatabase sQLiteDatabase4 = this.b;
                Locale locale4 = Locale.US;
                sQLiteDatabase4.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j3 + " AND start = 0").stepThis().dispose();
            }
            try {
                sQLitePreparedStatement2 = j10 != 0 ? this.b.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                for (int i13 = 0; i13 < 9; i13++) {
                    try {
                        try {
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindLong(1, j3);
                            if (j10 != 0) {
                                sQLitePreparedStatement2.bindLong(2, j10);
                                i12 = 3;
                            } else {
                                i12 = 2;
                            }
                            sQLitePreparedStatement2.bindInteger(i12, i13);
                            sQLitePreparedStatement2.bindInteger(i12 + 1, 1);
                            sQLitePreparedStatement2.bindInteger(i12 + 2, 1);
                            sQLitePreparedStatement2.step();
                        } catch (Exception e10) {
                            throw e10;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th;
                    }
                }
                if (sQLitePreparedStatement2 != null) {
                    sQLitePreparedStatement2.dispose();
                    return;
                }
                return;
            } catch (Exception e11) {
                sQLitePreparedStatement2 = null;
                throw e11;
            } catch (Throwable th3) {
                th = th3;
                sQLitePreparedStatement2 = null;
                if (sQLitePreparedStatement2 != null) {
                }
                throw th;
            }
        }
        if (j10 != 0) {
            if (i7 == 0) {
                SQLiteDatabase sQLiteDatabase5 = this.b;
                Locale locale5 = Locale.US;
                StringBuilder t11 = a8.p0.t(j3, "DELETE FROM media_holes_topics WHERE uid = ", " AND topic_id = ");
                t11.append(j10);
                t11.append(" AND type = ");
                t11.append(i10);
                jg.g.z(sQLiteDatabase5, t11.toString());
            } else {
                SQLiteDatabase sQLiteDatabase6 = this.b;
                Locale locale6 = Locale.US;
                StringBuilder t12 = a8.p0.t(j3, "DELETE FROM media_holes_topics WHERE uid = ", " AND topic_id = ");
                t12.append(j10);
                t12.append(" AND type = ");
                t12.append(i10);
                t12.append(" AND start = 0");
                sQLiteDatabase6.executeFast(t12.toString()).stepThis().dispose();
            }
        } else if (i7 == 0) {
            SQLiteDatabase sQLiteDatabase7 = this.b;
            Locale locale7 = Locale.US;
            jg.g.z(sQLiteDatabase7, "DELETE FROM media_holes_v2 WHERE uid = " + j3 + " AND type = " + i10);
        } else {
            SQLiteDatabase sQLiteDatabase8 = this.b;
            Locale locale8 = Locale.US;
            sQLiteDatabase8.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j3 + " AND type = " + i10 + " AND start = 0").stepThis().dispose();
        }
        try {
            sQLitePreparedStatement = j10 != 0 ? this.b.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)") : this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
            try {
                try {
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindLong(1, j3);
                    if (j10 != 0) {
                        sQLitePreparedStatement.bindLong(2, j10);
                        i11 = 3;
                    } else {
                        i11 = 2;
                    }
                    sQLitePreparedStatement.bindInteger(i11, i10);
                    sQLitePreparedStatement.bindInteger(i11 + 1, 1);
                    sQLitePreparedStatement.bindInteger(i11 + 2, 1);
                    sQLitePreparedStatement.step();
                    sQLitePreparedStatement.dispose();
                    sQLitePreparedStatement.dispose();
                } catch (Exception e12) {
                    throw e12;
                }
            } catch (Throwable th4) {
                th = th4;
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                throw th;
            }
        } catch (Exception e13) {
            sQLitePreparedStatement = null;
            throw e13;
        } catch (Throwable th5) {
            th = th5;
            sQLitePreparedStatement = null;
            if (sQLitePreparedStatement != null) {
            }
            throw th;
        }
    }

    public final TLRPC.ChatFull F0(final long j3, final boolean z9, final CountDownLatch countDownLatch, final boolean z10, final boolean z11, final int i7) {
        final TLRPC.ChatFull[] chatFullArr = new TLRPC.ChatFull[1];
        this.a.c(new Runnable(chatFullArr, j3, z9, z10, z11, i7, countDownLatch) { // from class: org.telegram.messenger.kr
            public final /* synthetic */ TLRPC.ChatFull[] b;
            public final /* synthetic */ long c;
            public final /* synthetic */ boolean d;
            public final /* synthetic */ boolean e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ CountDownLatch h;

            {
                this.h = countDownLatch;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.b[0] = yr.this.G0(this.c, this.d, this.e, this.f);
                CountDownLatch countDownLatch2 = this.h;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                }
            }
        });
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (Throwable unused) {
            }
        }
        return chatFullArr[0];
    }

    public final void F1(long j3, boolean z9) {
        this.a.c(new zp(0, j3, this, z9));
    }

    public final void G(int i7, long j3, long j10, String str) {
        SQLitePreparedStatement executeFast;
        int i10 = 2;
        if (j10 != 0) {
            if (i7 == 0) {
                this.b.executeFast(String.format(Locale.US, a8.p0.p("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d"), Long.valueOf(j3), Long.valueOf(j10))).stepThis().dispose();
            } else {
                this.b.executeFast(String.format(Locale.US, a8.p0.p("DELETE FROM ", str, " WHERE uid = %d AND topic_id = %d AND start = 0"), Long.valueOf(j3), Long.valueOf(j10))).stepThis().dispose();
            }
        } else if (i7 == 0) {
            this.b.executeFast(String.format(Locale.US, a8.p0.p("DELETE FROM ", str, " WHERE uid = %d"), Long.valueOf(j3))).stepThis().dispose();
        } else {
            this.b.executeFast(String.format(Locale.US, a8.p0.p("DELETE FROM ", str, " WHERE uid = %d AND start = 0"), Long.valueOf(j3))).stepThis().dispose();
        }
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (j10 != 0) {
                    executeFast = this.b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                } else {
                    executeFast = this.b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                }
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, j3);
                if (j10 != 0) {
                    sQLitePreparedStatement.bindLong(2, j10);
                    i10 = 3;
                }
                sQLitePreparedStatement.bindInteger(i10, 1);
                sQLitePreparedStatement.bindInteger(i10 + 1, 1);
                sQLitePreparedStatement.step();
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                throw e10;
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:0|1|(3:2|3|(3:5|6|7))|(6:(3:308|309|(39:311|312|313|314|10|11|12|13|14|15|(2:17|(3:19|(3:21|(2:23|24)(2:26|27)|25)|28))(2:207|(3:209|(3:212|213|210)|214)(2:215|(13:217|218|219|220|221|222|223|(13:226|227|228|(2:267|268)(1:230)|231|(2:233|234)(1:266)|(3:236|237|(3:239|(2:262|263)(6:242|(2:244|245)|246|247|248|250)|251))(1:265)|264|(0)|262|263|251|224)|277|278|279|(2:282|280)|283)))|(2:30|(1:32))|(3:38|(3:41|42|39)|43)|62|63|64|65|66|67|(5:194|195|196|68|69)|71|72|73|74|75|76|78|79|(6:81|82|83|84|(1:86)(1:157)|87)(1:170)|88|89|(3:126|127|(11:129|(2:137|138)(1:131)|132|133|134|135|93|94|(6:96|(1:98)|99|100|101|(3:103|(2:105|106)|113))|119|120))|91|92|93|94|(0)|119|120))|93|94|(0)|119|120)|9|10|11|12|13|14|15|(0)(0)|(0)|(5:34|36|38|(1:39)|43)|62|63|64|65|66|67|(2:68|69)|71|72|73|74|75|76|78|79|(0)(0)|88|89|(0)|91|92|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(38:0|1|2|3|(3:5|6|7)|(6:(3:308|309|(39:311|312|313|314|10|11|12|13|14|15|(2:17|(3:19|(3:21|(2:23|24)(2:26|27)|25)|28))(2:207|(3:209|(3:212|213|210)|214)(2:215|(13:217|218|219|220|221|222|223|(13:226|227|228|(2:267|268)(1:230)|231|(2:233|234)(1:266)|(3:236|237|(3:239|(2:262|263)(6:242|(2:244|245)|246|247|248|250)|251))(1:265)|264|(0)|262|263|251|224)|277|278|279|(2:282|280)|283)))|(2:30|(1:32))|(3:38|(3:41|42|39)|43)|62|63|64|65|66|67|(5:194|195|196|68|69)|71|72|73|74|75|76|78|79|(6:81|82|83|84|(1:86)(1:157)|87)(1:170)|88|89|(3:126|127|(11:129|(2:137|138)(1:131)|132|133|134|135|93|94|(6:96|(1:98)|99|100|101|(3:103|(2:105|106)|113))|119|120))|91|92|93|94|(0)|119|120))|93|94|(0)|119|120)|9|10|11|12|13|14|15|(0)(0)|(0)|(5:34|36|38|(1:39)|43)|62|63|64|65|66|67|(2:68|69)|71|72|73|74|75|76|78|79|(0)(0)|88|89|(0)|91|92|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02fb, code lost:
    
        if (r6.pinned_msg_id > ((java.lang.Integer) r11.get(0)).intValue()) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x03b4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03b5, code lost:
    
        r13 = r7;
        r14 = r21;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03b9, code lost:
    
        r5 = true;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03ad, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03ae, code lost:
    
        r13 = r7;
        r14 = r21;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03c5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03c6, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03c8, code lost:
    
        r8 = r6;
        r13 = r20;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03bc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03bd, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03bf, code lost:
    
        r8 = r6;
        r13 = r20;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x03d9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03da, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03dc, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x03dd, code lost:
    
        r5 = r8;
        r8 = r6;
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03e0, code lost:
    
        r13 = r20;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x03cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x03ce, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03d0, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03d1, code lost:
    
        r13 = r8;
        r8 = r6;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03d4, code lost:
    
        r13 = r20;
        r14 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03f3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03f4, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03f0, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0403, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0404, code lost:
    
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03ff, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0400, code lost:
    
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x00b7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x00bb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x00bc, code lost:
    
        r5 = true;
        r8 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03ea, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x03eb, code lost:
    
        r8 = null;
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x03e5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x03e6, code lost:
    
        r8 = null;
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0410, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0411, code lost:
    
        r8 = r6;
        r13 = 0;
        r14 = 0;
        r5 = true;
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0407, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0408, code lost:
    
        r8 = r6;
        r13 = 0;
        r14 = 0;
        r6 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092 A[Catch: all -> 0x00b7, Exception -> 0x00bb, TRY_ENTER, TryCatch #13 {all -> 0x00b7, blocks: (B:17:0x0092, B:19:0x0096, B:21:0x009d, B:23:0x00af, B:26:0x00c0, B:30:0x0205, B:32:0x020b, B:34:0x0214, B:36:0x0218, B:39:0x021f, B:41:0x022c, B:210:0x00d1, B:212:0x00db, B:218:0x00f5, B:280:0x01d5, B:282:0x01dd), top: B:15:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00cc A[Catch: all -> 0x03e5, Exception -> 0x03ea, TRY_ENTER, TRY_LEAVE, TryCatch #51 {Exception -> 0x03ea, all -> 0x03e5, blocks: (B:13:0x0082, B:65:0x0245, B:73:0x02a3, B:207:0x00cc, B:215:0x00f1), top: B:12:0x0082 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0205 A[Catch: all -> 0x00b7, Exception -> 0x01f1, TryCatch #9 {Exception -> 0x01f1, blocks: (B:30:0x0205, B:32:0x020b, B:34:0x0214, B:36:0x0218, B:39:0x021f, B:41:0x022c, B:218:0x00f5, B:280:0x01d5, B:282:0x01dd), top: B:217:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022c A[Catch: all -> 0x00b7, Exception -> 0x01f1, TRY_LEAVE, TryCatch #9 {Exception -> 0x01f1, blocks: (B:30:0x0205, B:32:0x020b, B:34:0x0214, B:36:0x0218, B:39:0x021f, B:41:0x022c, B:218:0x00f5, B:280:0x01d5, B:282:0x01dd), top: B:217:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c3 A[Catch: all -> 0x0291, Exception -> 0x0298, TRY_ENTER, TRY_LEAVE, TryCatch #42 {Exception -> 0x0298, all -> 0x0291, blocks: (B:195:0x027c, B:81:0x02c3), top: B:194:0x027c }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x034a A[Catch: all -> 0x0329, Exception -> 0x0332, TRY_ENTER, TRY_LEAVE, TryCatch #49 {Exception -> 0x0332, all -> 0x0329, blocks: (B:96:0x034a, B:103:0x035c, B:105:0x0362, B:135:0x0325), top: B:134:0x0325 }] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v34 */
    /* JADX WARN: Type inference failed for: r14v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.ChatFull G0(final long j3, boolean z9, final boolean z10, final boolean z11) {
        int i7;
        final TLRPC.ChatFull chatFull;
        SQLiteCursor sQLiteCursor;
        int i10;
        final int i11;
        final ?? r14;
        int i12;
        boolean z12;
        SQLiteCursor queryFinalized;
        int i13;
        TLRPC.ChatFull chatFull2;
        SQLiteDatabase sQLiteDatabase;
        StringBuilder sb2;
        ArrayList arrayList;
        boolean z13;
        TLRPC.User TLdeserialize;
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.User user;
        TLRPC.User user2;
        SQLiteCursor queryFinalized2;
        int i14;
        ?? r21;
        SQLiteCursor sQLiteCursor2;
        int i15;
        ArrayList<Long> arrayList2;
        int i16;
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        final HashMap hashMap = new HashMap();
        final ArrayList arrayList5 = new ArrayList();
        boolean z14 = true;
        try {
            queryFinalized = this.b.queryFinalized("SELECT info, pinned, online, inviter, links FROM chat_settings_v2 WHERE uid = " + j3, new Object[0]);
            try {
                i13 = 2;
            } catch (Exception e10) {
                e = e10;
                i10 = 0;
                chatFull = null;
                sQLiteCursor = queryFinalized;
            } catch (Throwable th2) {
                th = th2;
                i7 = 0;
                chatFull = null;
                sQLiteCursor = queryFinalized;
            }
        } catch (Exception e11) {
            e = e11;
            i10 = 0;
            chatFull = null;
            sQLiteCursor = null;
        } catch (Throwable th3) {
            th = th3;
            i7 = 0;
            chatFull = null;
            sQLiteCursor = null;
        }
        try {
            if (queryFinalized.next()) {
                try {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    if (byteBufferValue != null) {
                        TLRPC.ChatFull TLdeserialize2 = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        try {
                            byteBufferValue.reuse();
                            TLdeserialize2.pinned_msg_id = queryFinalized.intValue(1);
                            TLdeserialize2.online_count = queryFinalized.intValue(2);
                            TLdeserialize2.inviterId = queryFinalized.longValue(3);
                            TLdeserialize2.invitesCount = queryFinalized.intValue(4);
                            chatFull2 = TLdeserialize2;
                            queryFinalized.dispose();
                            ArrayList arrayList6 = new ArrayList();
                            ArrayList arrayList7 = new ArrayList();
                            if (!(chatFull2 instanceof TLRPC.TL_communityFull)) {
                                ArrayList<TL_communities.CommunityPeer> arrayList8 = chatFull2.linked_peers;
                                if (arrayList8 != null) {
                                    int size = arrayList8.size();
                                    for (int i17 = 0; i17 < size; i17++) {
                                        long o4 = m5.o(chatFull2.linked_peers.get(i17).peer);
                                        if (o4 > 0) {
                                            arrayList6.add(Long.valueOf(o4));
                                        } else {
                                            arrayList7.add(Long.valueOf(-o4));
                                        }
                                    }
                                }
                            } else if (chatFull2 instanceof TLRPC.TL_chatFull) {
                                for (int i18 = 0; i18 < chatFull2.participants.participants.size(); i18++) {
                                    arrayList6.add(Long.valueOf(chatFull2.participants.participants.get(i18).user_id));
                                }
                            } else if (chatFull2 instanceof TLRPC.TL_channelFull) {
                                try {
                                    sQLiteDatabase = this.b;
                                    sb2 = new StringBuilder("SELECT us.data, us.status, cu.data, cu.date FROM channel_users_v2 as cu LEFT JOIN users as us ON us.uid = cu.uid WHERE cu.did = ");
                                    arrayList = arrayList3;
                                } catch (Exception e12) {
                                    e = e12;
                                }
                                try {
                                    sb2.append(-j3);
                                    sb2.append(" ORDER BY cu.date DESC");
                                    SQLiteCursor queryFinalized3 = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                    try {
                                        try {
                                            chatFull2.participants = new TLRPC.TL_chatParticipants();
                                            while (queryFinalized3.next()) {
                                                try {
                                                    NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                                                    if (byteBufferValue2 != null) {
                                                        try {
                                                            try {
                                                                TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                                byteBufferValue2.reuse();
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                chatFull = chatFull2;
                                                                sQLiteCursor = queryFinalized3;
                                                                arrayList3 = arrayList;
                                                                i11 = 0;
                                                                r14 = 0;
                                                                if (sQLiteCursor != null) {
                                                                }
                                                                final qp messagesController = getMessagesController();
                                                                messagesController.getClass();
                                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                                    @Override // java.lang.Runnable
                                                                    public final void run() {
                                                                        qp qpVar = qp.this;
                                                                        a0.h hVar = qpVar.l1;
                                                                        long j10 = j3;
                                                                        boolean z15 = z11;
                                                                        if (j10 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j10, 0L) > 60000) {
                                                                            qpVar.V2(0, j10, z10);
                                                                        }
                                                                        TLRPC.ChatFull chatFull3 = chatFull;
                                                                        if (chatFull3 != null) {
                                                                            if (hVar.f(j10) == null) {
                                                                                hVar.k(chatFull3, j10);
                                                                                qpVar.s7.M(-j10);
                                                                            }
                                                                            qpVar.Y3(arrayList3, true);
                                                                            qpVar.S3(arrayList4, true);
                                                                            if (chatFull3.stickerset != null) {
                                                                                qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                                            }
                                                                            if (chatFull3.emojiset != null) {
                                                                                qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                                            }
                                                                            qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                                        }
                                                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j10), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                                    }
                                                                });
                                                                throw th;
                                                            }
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            z13 = z14;
                                                            arrayList3 = arrayList;
                                                            try {
                                                                o(e, z13);
                                                                arrayList = arrayList3;
                                                                z14 = true;
                                                                i13 = 2;
                                                            } catch (Exception e14) {
                                                                e = e14;
                                                                chatFull = chatFull2;
                                                                sQLiteCursor = queryFinalized3;
                                                                z12 = true;
                                                                i11 = 0;
                                                                r14 = 0;
                                                                try {
                                                                    o(e, z12);
                                                                    if (sQLiteCursor != null) {
                                                                        sQLiteCursor.dispose();
                                                                    }
                                                                    final qp messagesController2 = getMessagesController();
                                                                    messagesController2.getClass();
                                                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            qp qpVar = qp.this;
                                                                            a0.h hVar = qpVar.l1;
                                                                            long j10 = j3;
                                                                            boolean z15 = z11;
                                                                            if (j10 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j10, 0L) > 60000) {
                                                                                qpVar.V2(0, j10, z10);
                                                                            }
                                                                            TLRPC.ChatFull chatFull3 = chatFull;
                                                                            if (chatFull3 != null) {
                                                                                if (hVar.f(j10) == null) {
                                                                                    hVar.k(chatFull3, j10);
                                                                                    qpVar.s7.M(-j10);
                                                                                }
                                                                                qpVar.Y3(arrayList3, true);
                                                                                qpVar.S3(arrayList4, true);
                                                                                if (chatFull3.stickerset != null) {
                                                                                    qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                                                }
                                                                                if (chatFull3.emojiset != null) {
                                                                                    qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                                                }
                                                                                qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                                            }
                                                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j10), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                                        }
                                                                    });
                                                                    return chatFull;
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    if (sQLiteCursor != null) {
                                                                    }
                                                                    final qp messagesController3 = getMessagesController();
                                                                    messagesController3.getClass();
                                                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            qp qpVar = qp.this;
                                                                            a0.h hVar = qpVar.l1;
                                                                            long j10 = j3;
                                                                            boolean z15 = z11;
                                                                            if (j10 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j10, 0L) > 60000) {
                                                                                qpVar.V2(0, j10, z10);
                                                                            }
                                                                            TLRPC.ChatFull chatFull3 = chatFull;
                                                                            if (chatFull3 != null) {
                                                                                if (hVar.f(j10) == null) {
                                                                                    hVar.k(chatFull3, j10);
                                                                                    qpVar.s7.M(-j10);
                                                                                }
                                                                                qpVar.Y3(arrayList3, true);
                                                                                qpVar.S3(arrayList4, true);
                                                                                if (chatFull3.stickerset != null) {
                                                                                    qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                                                }
                                                                                if (chatFull3.emojiset != null) {
                                                                                    qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                                                }
                                                                                qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                                            }
                                                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j10), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                                        }
                                                                    });
                                                                    throw th;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        TLdeserialize = null;
                                                    }
                                                    NativeByteBuffer byteBufferValue3 = queryFinalized3.byteBufferValue(i13);
                                                    if (byteBufferValue3 != null) {
                                                        channelParticipant = TLRPC.ChannelParticipant.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                                        byteBufferValue3.reuse();
                                                    } else {
                                                        channelParticipant = null;
                                                    }
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    arrayList3 = arrayList;
                                                }
                                                if (channelParticipant != null) {
                                                    user = TLdeserialize;
                                                    if (channelParticipant.user_id == getUserConfig().n) {
                                                        user2 = getUserConfig().f();
                                                        if (user2 != null || channelParticipant == null) {
                                                            arrayList3 = arrayList;
                                                        } else {
                                                            TLRPC.UserStatus userStatus = user2.status;
                                                            if (userStatus != null) {
                                                                userStatus.expires = queryFinalized3.intValue(1);
                                                            }
                                                            arrayList3 = arrayList;
                                                            try {
                                                                try {
                                                                    arrayList3.add(user2);
                                                                    channelParticipant.date = queryFinalized3.intValue(3);
                                                                    TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                                                                    tL_chatChannelParticipant.user_id = ij.C1(channelParticipant.peer);
                                                                    tL_chatChannelParticipant.date = channelParticipant.date;
                                                                    tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                                                                    tL_chatChannelParticipant.channelParticipant = channelParticipant;
                                                                    chatFull2.participants.participants.add(tL_chatChannelParticipant);
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    chatFull = chatFull2;
                                                                    sQLiteCursor = queryFinalized3;
                                                                    i11 = 0;
                                                                    r14 = 0;
                                                                    if (sQLiteCursor != null) {
                                                                        sQLiteCursor.dispose();
                                                                    }
                                                                    final qp messagesController32 = getMessagesController();
                                                                    messagesController32.getClass();
                                                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                                        @Override // java.lang.Runnable
                                                                        public final void run() {
                                                                            qp qpVar = qp.this;
                                                                            a0.h hVar = qpVar.l1;
                                                                            long j10 = j3;
                                                                            boolean z15 = z11;
                                                                            if (j10 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j10, 0L) > 60000) {
                                                                                qpVar.V2(0, j10, z10);
                                                                            }
                                                                            TLRPC.ChatFull chatFull3 = chatFull;
                                                                            if (chatFull3 != null) {
                                                                                if (hVar.f(j10) == null) {
                                                                                    hVar.k(chatFull3, j10);
                                                                                    qpVar.s7.M(-j10);
                                                                                }
                                                                                qpVar.Y3(arrayList3, true);
                                                                                qpVar.S3(arrayList4, true);
                                                                                if (chatFull3.stickerset != null) {
                                                                                    qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                                                }
                                                                                if (chatFull3.emojiset != null) {
                                                                                    qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                                                }
                                                                                qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                                            }
                                                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j10), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                                        }
                                                                    });
                                                                    throw th;
                                                                }
                                                            } catch (Exception e16) {
                                                                e = e16;
                                                                z13 = true;
                                                                o(e, z13);
                                                                arrayList = arrayList3;
                                                                z14 = true;
                                                                i13 = 2;
                                                            }
                                                        }
                                                        arrayList = arrayList3;
                                                        z14 = true;
                                                        i13 = 2;
                                                    }
                                                } else {
                                                    user = TLdeserialize;
                                                }
                                                user2 = user;
                                                if (user2 != null) {
                                                }
                                                arrayList3 = arrayList;
                                                arrayList = arrayList3;
                                                z14 = true;
                                                i13 = 2;
                                            }
                                            arrayList3 = arrayList;
                                            queryFinalized3.dispose();
                                            for (int i19 = 0; i19 < chatFull2.bot_info.size(); i19++) {
                                                arrayList6.add(Long.valueOf(chatFull2.bot_info.get(i19).user_id));
                                            }
                                        } catch (Exception e17) {
                                            e = e17;
                                            arrayList3 = arrayList;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        arrayList3 = arrayList;
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    arrayList3 = arrayList;
                                    chatFull = chatFull2;
                                    z12 = true;
                                    sQLiteCursor = null;
                                    i11 = 0;
                                    r14 = 0;
                                    o(e, z12);
                                    if (sQLiteCursor != null) {
                                    }
                                    final qp messagesController22 = getMessagesController();
                                    messagesController22.getClass();
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qp qpVar = qp.this;
                                            a0.h hVar = qpVar.l1;
                                            long j10 = j3;
                                            boolean z15 = z11;
                                            if (j10 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j10, 0L) > 60000) {
                                                qpVar.V2(0, j10, z10);
                                            }
                                            TLRPC.ChatFull chatFull3 = chatFull;
                                            if (chatFull3 != null) {
                                                if (hVar.f(j10) == null) {
                                                    hVar.k(chatFull3, j10);
                                                    qpVar.s7.M(-j10);
                                                }
                                                qpVar.Y3(arrayList3, true);
                                                qpVar.S3(arrayList4, true);
                                                if (chatFull3.stickerset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                }
                                                if (chatFull3.emojiset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                }
                                                qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                            }
                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j10), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                        }
                                    });
                                    return chatFull;
                                } catch (Throwable th8) {
                                    th = th8;
                                    arrayList3 = arrayList;
                                    chatFull = chatFull2;
                                    sQLiteCursor = null;
                                    i11 = 0;
                                    r14 = 0;
                                    if (sQLiteCursor != null) {
                                    }
                                    final qp messagesController322 = getMessagesController();
                                    messagesController322.getClass();
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qp qpVar = qp.this;
                                            a0.h hVar = qpVar.l1;
                                            long j10 = j3;
                                            boolean z15 = z11;
                                            if (j10 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j10, 0L) > 60000) {
                                                qpVar.V2(0, j10, z10);
                                            }
                                            TLRPC.ChatFull chatFull3 = chatFull;
                                            if (chatFull3 != null) {
                                                if (hVar.f(j10) == null) {
                                                    hVar.k(chatFull3, j10);
                                                    qpVar.s7.M(-j10);
                                                }
                                                qpVar.Y3(arrayList3, true);
                                                qpVar.S3(arrayList4, true);
                                                if (chatFull3.stickerset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                }
                                                if (chatFull3.emojiset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                }
                                                qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                            }
                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j10), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                        }
                                    });
                                    throw th;
                                }
                            }
                            if (chatFull2 != null) {
                                long j10 = chatFull2.inviterId;
                                if (j10 != 0) {
                                    arrayList6.add(Long.valueOf(j10));
                                }
                            }
                            if (chatFull2 != null && (arrayList2 = chatFull2.recent_requesters) != null && !arrayList2.isEmpty()) {
                                for (i16 = 0; i16 < Math.min(3, chatFull2.recent_requesters.size()); i16++) {
                                    ArrayList<Long> arrayList9 = chatFull2.recent_requesters;
                                    arrayList6.add(arrayList9.get((arrayList9.size() - 1) - i16));
                                }
                            }
                            int i20 = 0;
                            n0(arrayList6, arrayList3, false);
                            Q(TextUtils.join(",", arrayList7), arrayList4);
                            SQLiteDatabase sQLiteDatabase2 = getMessagesStorage().b;
                            Locale locale = Locale.US;
                            long j11 = -j3;
                            i20 = 0;
                            queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + j11 + " ORDER BY mid DESC", new Object[0]);
                            while (queryFinalized2.next()) {
                                try {
                                    try {
                                        int intValue = queryFinalized2.intValue(i20);
                                        arrayList5.add(Integer.valueOf(intValue));
                                        hashMap.put(Integer.valueOf(intValue), null);
                                        i20 = 0;
                                    } catch (Exception e19) {
                                        e = e19;
                                        chatFull = chatFull2;
                                        z12 = true;
                                        i11 = 0;
                                        int i21 = 0;
                                        sQLiteCursor = queryFinalized2;
                                        r14 = i21;
                                        o(e, z12);
                                        if (sQLiteCursor != null) {
                                        }
                                        final qp messagesController222 = getMessagesController();
                                        messagesController222.getClass();
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                qp qpVar = qp.this;
                                                a0.h hVar = qpVar.l1;
                                                long j102 = j3;
                                                boolean z15 = z11;
                                                if (j102 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                    qpVar.V2(0, j102, z10);
                                                }
                                                TLRPC.ChatFull chatFull3 = chatFull;
                                                if (chatFull3 != null) {
                                                    if (hVar.f(j102) == null) {
                                                        hVar.k(chatFull3, j102);
                                                        qpVar.s7.M(-j102);
                                                    }
                                                    qpVar.Y3(arrayList3, true);
                                                    qpVar.S3(arrayList4, true);
                                                    if (chatFull3.stickerset != null) {
                                                        qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                    }
                                                    if (chatFull3.emojiset != null) {
                                                        qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                    }
                                                    qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                }
                                                qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                            }
                                        });
                                        return chatFull;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        chatFull = chatFull2;
                                        i11 = 0;
                                        r14 = 0;
                                        sQLiteCursor = queryFinalized2;
                                        if (sQLiteCursor != null) {
                                        }
                                        final qp messagesController3222 = getMessagesController();
                                        messagesController3222.getClass();
                                        g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                qp qpVar = qp.this;
                                                a0.h hVar = qpVar.l1;
                                                long j102 = j3;
                                                boolean z15 = z11;
                                                if (j102 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                    qpVar.V2(0, j102, z10);
                                                }
                                                TLRPC.ChatFull chatFull3 = chatFull;
                                                if (chatFull3 != null) {
                                                    if (hVar.f(j102) == null) {
                                                        hVar.k(chatFull3, j102);
                                                        qpVar.s7.M(-j102);
                                                    }
                                                    qpVar.Y3(arrayList3, true);
                                                    qpVar.S3(arrayList4, true);
                                                    if (chatFull3.stickerset != null) {
                                                        qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                    }
                                                    if (chatFull3.emojiset != null) {
                                                        qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                    }
                                                    qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                }
                                                qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                            }
                                        });
                                        throw th;
                                    }
                                } catch (Exception e20) {
                                    e = e20;
                                    int i22 = i20;
                                } catch (Throwable th10) {
                                    th = th10;
                                    int i23 = i20;
                                }
                            }
                            queryFinalized2.dispose();
                            queryFinalized2 = this.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + j11, new Object[0]);
                            if (queryFinalized2.next()) {
                                i14 = 0;
                                r21 = false;
                            } else {
                                i11 = queryFinalized2.intValue(0);
                                try {
                                    r21 = queryFinalized2.intValue(1) != 0;
                                    i14 = i11;
                                } catch (Exception e21) {
                                    e = e21;
                                    chatFull = chatFull2;
                                    z12 = true;
                                    int i212 = 0;
                                    sQLiteCursor = queryFinalized2;
                                    r14 = i212;
                                    o(e, z12);
                                    if (sQLiteCursor != null) {
                                    }
                                    final qp messagesController2222 = getMessagesController();
                                    messagesController2222.getClass();
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qp qpVar = qp.this;
                                            a0.h hVar = qpVar.l1;
                                            long j102 = j3;
                                            boolean z15 = z11;
                                            if (j102 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                qpVar.V2(0, j102, z10);
                                            }
                                            TLRPC.ChatFull chatFull3 = chatFull;
                                            if (chatFull3 != null) {
                                                if (hVar.f(j102) == null) {
                                                    hVar.k(chatFull3, j102);
                                                    qpVar.s7.M(-j102);
                                                }
                                                qpVar.Y3(arrayList3, true);
                                                qpVar.S3(arrayList4, true);
                                                if (chatFull3.stickerset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                }
                                                if (chatFull3.emojiset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                }
                                                qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                            }
                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                        }
                                    });
                                    return chatFull;
                                } catch (Throwable th11) {
                                    th = th11;
                                    chatFull = chatFull2;
                                    r14 = 0;
                                    sQLiteCursor = queryFinalized2;
                                    if (sQLiteCursor != null) {
                                    }
                                    final qp messagesController32222 = getMessagesController();
                                    messagesController32222.getClass();
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qp qpVar = qp.this;
                                            a0.h hVar = qpVar.l1;
                                            long j102 = j3;
                                            boolean z15 = z11;
                                            if (j102 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                qpVar.V2(0, j102, z10);
                                            }
                                            TLRPC.ChatFull chatFull3 = chatFull;
                                            if (chatFull3 != null) {
                                                if (hVar.f(j102) == null) {
                                                    hVar.k(chatFull3, j102);
                                                    qpVar.s7.M(-j102);
                                                }
                                                qpVar.Y3(arrayList3, true);
                                                qpVar.S3(arrayList4, true);
                                                if (chatFull3.stickerset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                }
                                                if (chatFull3.emojiset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                }
                                                qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                            }
                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                        }
                                    });
                                    throw th;
                                }
                            }
                            queryFinalized2.dispose();
                            if (chatFull2 != null) {
                                try {
                                    if (chatFull2.pinned_msg_id != 0) {
                                        if (arrayList5.isEmpty()) {
                                            i15 = 0;
                                        } else {
                                            try {
                                                i15 = 0;
                                            } catch (Exception e22) {
                                                e = e22;
                                                chatFull = chatFull2;
                                                i11 = i14;
                                                r14 = r21;
                                                z12 = true;
                                                sQLiteCursor = null;
                                                o(e, z12);
                                                if (sQLiteCursor != null) {
                                                }
                                                final qp messagesController22222 = getMessagesController();
                                                messagesController22222.getClass();
                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        qp qpVar = qp.this;
                                                        a0.h hVar = qpVar.l1;
                                                        long j102 = j3;
                                                        boolean z15 = z11;
                                                        if (j102 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                            qpVar.V2(0, j102, z10);
                                                        }
                                                        TLRPC.ChatFull chatFull3 = chatFull;
                                                        if (chatFull3 != null) {
                                                            if (hVar.f(j102) == null) {
                                                                hVar.k(chatFull3, j102);
                                                                qpVar.s7.M(-j102);
                                                            }
                                                            qpVar.Y3(arrayList3, true);
                                                            qpVar.S3(arrayList4, true);
                                                            if (chatFull3.stickerset != null) {
                                                                qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                            }
                                                            if (chatFull3.emojiset != null) {
                                                                qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                            }
                                                            qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                        }
                                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                    }
                                                });
                                                return chatFull;
                                            } catch (Throwable th12) {
                                                th = th12;
                                                chatFull = chatFull2;
                                                i11 = i14;
                                                r14 = r21;
                                                sQLiteCursor = null;
                                                if (sQLiteCursor != null) {
                                                }
                                                final qp messagesController322222 = getMessagesController();
                                                messagesController322222.getClass();
                                                g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        qp qpVar = qp.this;
                                                        a0.h hVar = qpVar.l1;
                                                        long j102 = j3;
                                                        boolean z15 = z11;
                                                        if (j102 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                            qpVar.V2(0, j102, z10);
                                                        }
                                                        TLRPC.ChatFull chatFull3 = chatFull;
                                                        if (chatFull3 != null) {
                                                            if (hVar.f(j102) == null) {
                                                                hVar.k(chatFull3, j102);
                                                                qpVar.s7.M(-j102);
                                                            }
                                                            qpVar.Y3(arrayList3, true);
                                                            qpVar.S3(arrayList4, true);
                                                            if (chatFull3.stickerset != null) {
                                                                qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                            }
                                                            if (chatFull3.emojiset != null) {
                                                                qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                            }
                                                            qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                        }
                                                        qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                    }
                                                });
                                                throw th;
                                            }
                                        }
                                        arrayList5.clear();
                                        arrayList5.add(Integer.valueOf(chatFull2.pinned_msg_id));
                                        sQLiteCursor2 = null;
                                        try {
                                            hashMap.put(Integer.valueOf(chatFull2.pinned_msg_id), null);
                                            if (!arrayList5.isEmpty()) {
                                                try {
                                                    ArrayList P0 = getMediaDataController().P0(j11, z9 ? j3 : 0L, arrayList5, true);
                                                    if (P0 != null) {
                                                        int size2 = P0.size();
                                                        while (i15 < size2) {
                                                            ij ijVar = (ij) P0.get(i15);
                                                            hashMap.put(Integer.valueOf(ijVar.f1()), ijVar);
                                                            i15++;
                                                        }
                                                    }
                                                } catch (Exception e23) {
                                                    e = e23;
                                                    arrayList5 = arrayList5;
                                                    SQLiteCursor sQLiteCursor3 = sQLiteCursor2;
                                                    chatFull = chatFull2;
                                                    sQLiteCursor = sQLiteCursor3;
                                                    i11 = i14;
                                                    i12 = r21;
                                                    z12 = true;
                                                    r14 = i12;
                                                    o(e, z12);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final qp messagesController222222 = getMessagesController();
                                                    messagesController222222.getClass();
                                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            qp qpVar = qp.this;
                                                            a0.h hVar = qpVar.l1;
                                                            long j102 = j3;
                                                            boolean z15 = z11;
                                                            if (j102 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                                qpVar.V2(0, j102, z10);
                                                            }
                                                            TLRPC.ChatFull chatFull3 = chatFull;
                                                            if (chatFull3 != null) {
                                                                if (hVar.f(j102) == null) {
                                                                    hVar.k(chatFull3, j102);
                                                                    qpVar.s7.M(-j102);
                                                                }
                                                                qpVar.Y3(arrayList3, true);
                                                                qpVar.S3(arrayList4, true);
                                                                if (chatFull3.stickerset != null) {
                                                                    qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                                }
                                                                if (chatFull3.emojiset != null) {
                                                                    qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                                }
                                                                qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                            }
                                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                        }
                                                    });
                                                    return chatFull;
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    arrayList5 = arrayList5;
                                                    SQLiteCursor sQLiteCursor4 = sQLiteCursor2;
                                                    chatFull = chatFull2;
                                                    sQLiteCursor = sQLiteCursor4;
                                                    i11 = i14;
                                                    r14 = r21;
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    final qp messagesController3222222 = getMessagesController();
                                                    messagesController3222222.getClass();
                                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            qp qpVar = qp.this;
                                                            a0.h hVar = qpVar.l1;
                                                            long j102 = j3;
                                                            boolean z15 = z11;
                                                            if (j102 > 0 && !z15 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                                qpVar.V2(0, j102, z10);
                                                            }
                                                            TLRPC.ChatFull chatFull3 = chatFull;
                                                            if (chatFull3 != null) {
                                                                if (hVar.f(j102) == null) {
                                                                    hVar.k(chatFull3, j102);
                                                                    qpVar.s7.M(-j102);
                                                                }
                                                                qpVar.Y3(arrayList3, true);
                                                                qpVar.S3(arrayList4, true);
                                                                if (chatFull3.stickerset != null) {
                                                                    qpVar.getMediaDataController().Y(chatFull3.stickerset);
                                                                }
                                                                if (chatFull3.emojiset != null) {
                                                                    qpVar.getMediaDataController().Y(chatFull3.emojiset);
                                                                }
                                                                qpVar.getNotificationCenter().k(qs.T, chatFull3, 0, Boolean.valueOf(z15), Boolean.FALSE);
                                                            }
                                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                        }
                                                    });
                                                    throw th;
                                                }
                                            }
                                            final qp messagesController4 = getMessagesController();
                                            messagesController4.getClass();
                                            final TLRPC.ChatFull chatFull3 = chatFull2;
                                            final int i24 = i14;
                                            final boolean z15 = r21;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    qp qpVar = qp.this;
                                                    a0.h hVar = qpVar.l1;
                                                    long j102 = j3;
                                                    boolean z152 = z11;
                                                    if (j102 > 0 && !z152 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                        qpVar.V2(0, j102, z10);
                                                    }
                                                    TLRPC.ChatFull chatFull32 = chatFull3;
                                                    if (chatFull32 != null) {
                                                        if (hVar.f(j102) == null) {
                                                            hVar.k(chatFull32, j102);
                                                            qpVar.s7.M(-j102);
                                                        }
                                                        qpVar.Y3(arrayList3, true);
                                                        qpVar.S3(arrayList4, true);
                                                        if (chatFull32.stickerset != null) {
                                                            qpVar.getMediaDataController().Y(chatFull32.stickerset);
                                                        }
                                                        if (chatFull32.emojiset != null) {
                                                            qpVar.getMediaDataController().Y(chatFull32.emojiset);
                                                        }
                                                        qpVar.getNotificationCenter().k(qs.T, chatFull32, 0, Boolean.valueOf(z152), Boolean.FALSE);
                                                    }
                                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i24), Boolean.valueOf(z15));
                                                }
                                            });
                                            return chatFull3;
                                        } catch (Exception e24) {
                                            e = e24;
                                            SQLiteCursor sQLiteCursor32 = sQLiteCursor2;
                                            chatFull = chatFull2;
                                            sQLiteCursor = sQLiteCursor32;
                                            i11 = i14;
                                            i12 = r21;
                                            z12 = true;
                                            r14 = i12;
                                            o(e, z12);
                                            if (sQLiteCursor != null) {
                                            }
                                            final qp messagesController2222222 = getMessagesController();
                                            messagesController2222222.getClass();
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    qp qpVar = qp.this;
                                                    a0.h hVar = qpVar.l1;
                                                    long j102 = j3;
                                                    boolean z152 = z11;
                                                    if (j102 > 0 && !z152 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                        qpVar.V2(0, j102, z10);
                                                    }
                                                    TLRPC.ChatFull chatFull32 = chatFull;
                                                    if (chatFull32 != null) {
                                                        if (hVar.f(j102) == null) {
                                                            hVar.k(chatFull32, j102);
                                                            qpVar.s7.M(-j102);
                                                        }
                                                        qpVar.Y3(arrayList3, true);
                                                        qpVar.S3(arrayList4, true);
                                                        if (chatFull32.stickerset != null) {
                                                            qpVar.getMediaDataController().Y(chatFull32.stickerset);
                                                        }
                                                        if (chatFull32.emojiset != null) {
                                                            qpVar.getMediaDataController().Y(chatFull32.emojiset);
                                                        }
                                                        qpVar.getNotificationCenter().k(qs.T, chatFull32, 0, Boolean.valueOf(z152), Boolean.FALSE);
                                                    }
                                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                }
                                            });
                                            return chatFull;
                                        } catch (Throwable th14) {
                                            th = th14;
                                            SQLiteCursor sQLiteCursor42 = sQLiteCursor2;
                                            chatFull = chatFull2;
                                            sQLiteCursor = sQLiteCursor42;
                                            i11 = i14;
                                            r14 = r21;
                                            if (sQLiteCursor != null) {
                                            }
                                            final qp messagesController32222222 = getMessagesController();
                                            messagesController32222222.getClass();
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    qp qpVar = qp.this;
                                                    a0.h hVar = qpVar.l1;
                                                    long j102 = j3;
                                                    boolean z152 = z11;
                                                    if (j102 > 0 && !z152 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                        qpVar.V2(0, j102, z10);
                                                    }
                                                    TLRPC.ChatFull chatFull32 = chatFull;
                                                    if (chatFull32 != null) {
                                                        if (hVar.f(j102) == null) {
                                                            hVar.k(chatFull32, j102);
                                                            qpVar.s7.M(-j102);
                                                        }
                                                        qpVar.Y3(arrayList3, true);
                                                        qpVar.S3(arrayList4, true);
                                                        if (chatFull32.stickerset != null) {
                                                            qpVar.getMediaDataController().Y(chatFull32.stickerset);
                                                        }
                                                        if (chatFull32.emojiset != null) {
                                                            qpVar.getMediaDataController().Y(chatFull32.emojiset);
                                                        }
                                                        qpVar.getNotificationCenter().k(qs.T, chatFull32, 0, Boolean.valueOf(z152), Boolean.FALSE);
                                                    }
                                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                                }
                                            });
                                            throw th;
                                        }
                                    }
                                } catch (Exception e25) {
                                    e = e25;
                                    sQLiteCursor2 = null;
                                    SQLiteCursor sQLiteCursor322 = sQLiteCursor2;
                                    chatFull = chatFull2;
                                    sQLiteCursor = sQLiteCursor322;
                                    i11 = i14;
                                    i12 = r21;
                                    z12 = true;
                                    r14 = i12;
                                    o(e, z12);
                                    if (sQLiteCursor != null) {
                                    }
                                    final qp messagesController22222222 = getMessagesController();
                                    messagesController22222222.getClass();
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qp qpVar = qp.this;
                                            a0.h hVar = qpVar.l1;
                                            long j102 = j3;
                                            boolean z152 = z11;
                                            if (j102 > 0 && !z152 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                qpVar.V2(0, j102, z10);
                                            }
                                            TLRPC.ChatFull chatFull32 = chatFull;
                                            if (chatFull32 != null) {
                                                if (hVar.f(j102) == null) {
                                                    hVar.k(chatFull32, j102);
                                                    qpVar.s7.M(-j102);
                                                }
                                                qpVar.Y3(arrayList3, true);
                                                qpVar.S3(arrayList4, true);
                                                if (chatFull32.stickerset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull32.stickerset);
                                                }
                                                if (chatFull32.emojiset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull32.emojiset);
                                                }
                                                qpVar.getNotificationCenter().k(qs.T, chatFull32, 0, Boolean.valueOf(z152), Boolean.FALSE);
                                            }
                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                        }
                                    });
                                    return chatFull;
                                } catch (Throwable th15) {
                                    th = th15;
                                    sQLiteCursor2 = null;
                                    SQLiteCursor sQLiteCursor422 = sQLiteCursor2;
                                    chatFull = chatFull2;
                                    sQLiteCursor = sQLiteCursor422;
                                    i11 = i14;
                                    r14 = r21;
                                    if (sQLiteCursor != null) {
                                    }
                                    final qp messagesController322222222 = getMessagesController();
                                    messagesController322222222.getClass();
                                    g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qp qpVar = qp.this;
                                            a0.h hVar = qpVar.l1;
                                            long j102 = j3;
                                            boolean z152 = z11;
                                            if (j102 > 0 && !z152 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                                qpVar.V2(0, j102, z10);
                                            }
                                            TLRPC.ChatFull chatFull32 = chatFull;
                                            if (chatFull32 != null) {
                                                if (hVar.f(j102) == null) {
                                                    hVar.k(chatFull32, j102);
                                                    qpVar.s7.M(-j102);
                                                }
                                                qpVar.Y3(arrayList3, true);
                                                qpVar.S3(arrayList4, true);
                                                if (chatFull32.stickerset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull32.stickerset);
                                                }
                                                if (chatFull32.emojiset != null) {
                                                    qpVar.getMediaDataController().Y(chatFull32.emojiset);
                                                }
                                                qpVar.getNotificationCenter().k(qs.T, chatFull32, 0, Boolean.valueOf(z152), Boolean.FALSE);
                                            }
                                            qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                        }
                                    });
                                    throw th;
                                }
                            }
                            i15 = 0;
                            sQLiteCursor2 = null;
                            if (!arrayList5.isEmpty()) {
                            }
                            final qp messagesController42 = getMessagesController();
                            messagesController42.getClass();
                            final TLRPC.ChatFull chatFull32 = chatFull2;
                            final int i242 = i14;
                            final boolean z152 = r21;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qp qpVar = qp.this;
                                    a0.h hVar = qpVar.l1;
                                    long j102 = j3;
                                    boolean z1522 = z11;
                                    if (j102 > 0 && !z1522 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                        qpVar.V2(0, j102, z10);
                                    }
                                    TLRPC.ChatFull chatFull322 = chatFull32;
                                    if (chatFull322 != null) {
                                        if (hVar.f(j102) == null) {
                                            hVar.k(chatFull322, j102);
                                            qpVar.s7.M(-j102);
                                        }
                                        qpVar.Y3(arrayList3, true);
                                        qpVar.S3(arrayList4, true);
                                        if (chatFull322.stickerset != null) {
                                            qpVar.getMediaDataController().Y(chatFull322.stickerset);
                                        }
                                        if (chatFull322.emojiset != null) {
                                            qpVar.getMediaDataController().Y(chatFull322.emojiset);
                                        }
                                        qpVar.getNotificationCenter().k(qs.T, chatFull322, 0, Boolean.valueOf(z1522), Boolean.FALSE);
                                    }
                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i242), Boolean.valueOf(z152));
                                }
                            });
                            return chatFull32;
                        } catch (Exception e26) {
                            e = e26;
                            sQLiteCursor = queryFinalized;
                            z12 = true;
                            chatFull = TLdeserialize2;
                            i11 = 0;
                            r14 = 0;
                            o(e, z12);
                            if (sQLiteCursor != null) {
                            }
                            final qp messagesController222222222 = getMessagesController();
                            messagesController222222222.getClass();
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qp qpVar = qp.this;
                                    a0.h hVar = qpVar.l1;
                                    long j102 = j3;
                                    boolean z1522 = z11;
                                    if (j102 > 0 && !z1522 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                        qpVar.V2(0, j102, z10);
                                    }
                                    TLRPC.ChatFull chatFull322 = chatFull;
                                    if (chatFull322 != null) {
                                        if (hVar.f(j102) == null) {
                                            hVar.k(chatFull322, j102);
                                            qpVar.s7.M(-j102);
                                        }
                                        qpVar.Y3(arrayList3, true);
                                        qpVar.S3(arrayList4, true);
                                        if (chatFull322.stickerset != null) {
                                            qpVar.getMediaDataController().Y(chatFull322.stickerset);
                                        }
                                        if (chatFull322.emojiset != null) {
                                            qpVar.getMediaDataController().Y(chatFull322.emojiset);
                                        }
                                        qpVar.getNotificationCenter().k(qs.T, chatFull322, 0, Boolean.valueOf(z1522), Boolean.FALSE);
                                    }
                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                }
                            });
                            return chatFull;
                        } catch (Throwable th16) {
                            th = th16;
                            sQLiteCursor = queryFinalized;
                            chatFull = TLdeserialize2;
                            i11 = 0;
                            r14 = 0;
                            if (sQLiteCursor != null) {
                            }
                            final qp messagesController3222222222 = getMessagesController();
                            messagesController3222222222.getClass();
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qp qpVar = qp.this;
                                    a0.h hVar = qpVar.l1;
                                    long j102 = j3;
                                    boolean z1522 = z11;
                                    if (j102 > 0 && !z1522 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                                        qpVar.V2(0, j102, z10);
                                    }
                                    TLRPC.ChatFull chatFull322 = chatFull;
                                    if (chatFull322 != null) {
                                        if (hVar.f(j102) == null) {
                                            hVar.k(chatFull322, j102);
                                            qpVar.s7.M(-j102);
                                        }
                                        qpVar.Y3(arrayList3, true);
                                        qpVar.S3(arrayList4, true);
                                        if (chatFull322.stickerset != null) {
                                            qpVar.getMediaDataController().Y(chatFull322.stickerset);
                                        }
                                        if (chatFull322.emojiset != null) {
                                            qpVar.getMediaDataController().Y(chatFull322.emojiset);
                                        }
                                        qpVar.getNotificationCenter().k(qs.T, chatFull322, 0, Boolean.valueOf(z1522), Boolean.FALSE);
                                    }
                                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                                }
                            });
                            throw th;
                        }
                    }
                } catch (Exception e27) {
                    e = e27;
                    sQLiteCursor = queryFinalized;
                    z12 = true;
                    chatFull = null;
                } catch (Throwable th17) {
                    th = th17;
                    sQLiteCursor = queryFinalized;
                    chatFull = null;
                }
            }
            if (!arrayList5.isEmpty()) {
            }
            final qp messagesController422 = getMessagesController();
            messagesController422.getClass();
            final TLRPC.ChatFull chatFull322 = chatFull2;
            final int i2422 = i14;
            final boolean z1522 = r21;
            g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                @Override // java.lang.Runnable
                public final void run() {
                    qp qpVar = qp.this;
                    a0.h hVar = qpVar.l1;
                    long j102 = j3;
                    boolean z15222 = z11;
                    if (j102 > 0 && !z15222 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                        qpVar.V2(0, j102, z10);
                    }
                    TLRPC.ChatFull chatFull3222 = chatFull322;
                    if (chatFull3222 != null) {
                        if (hVar.f(j102) == null) {
                            hVar.k(chatFull3222, j102);
                            qpVar.s7.M(-j102);
                        }
                        qpVar.Y3(arrayList3, true);
                        qpVar.S3(arrayList4, true);
                        if (chatFull3222.stickerset != null) {
                            qpVar.getMediaDataController().Y(chatFull3222.stickerset);
                        }
                        if (chatFull3222.emojiset != null) {
                            qpVar.getMediaDataController().Y(chatFull3222.emojiset);
                        }
                        qpVar.getNotificationCenter().k(qs.T, chatFull3222, 0, Boolean.valueOf(z15222), Boolean.FALSE);
                    }
                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i2422), Boolean.valueOf(z1522));
                }
            });
            return chatFull322;
        } catch (Exception e28) {
            e = e28;
            i11 = i14;
            i12 = r21;
            SQLiteCursor sQLiteCursor5 = sQLiteCursor2;
            chatFull = chatFull2;
            sQLiteCursor = sQLiteCursor5;
            z12 = true;
            r14 = i12;
            o(e, z12);
            if (sQLiteCursor != null) {
            }
            final qp messagesController2222222222 = getMessagesController();
            messagesController2222222222.getClass();
            g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                @Override // java.lang.Runnable
                public final void run() {
                    qp qpVar = qp.this;
                    a0.h hVar = qpVar.l1;
                    long j102 = j3;
                    boolean z15222 = z11;
                    if (j102 > 0 && !z15222 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                        qpVar.V2(0, j102, z10);
                    }
                    TLRPC.ChatFull chatFull3222 = chatFull;
                    if (chatFull3222 != null) {
                        if (hVar.f(j102) == null) {
                            hVar.k(chatFull3222, j102);
                            qpVar.s7.M(-j102);
                        }
                        qpVar.Y3(arrayList3, true);
                        qpVar.S3(arrayList4, true);
                        if (chatFull3222.stickerset != null) {
                            qpVar.getMediaDataController().Y(chatFull3222.stickerset);
                        }
                        if (chatFull3222.emojiset != null) {
                            qpVar.getMediaDataController().Y(chatFull3222.emojiset);
                        }
                        qpVar.getNotificationCenter().k(qs.T, chatFull3222, 0, Boolean.valueOf(z15222), Boolean.FALSE);
                    }
                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                }
            });
            return chatFull;
        } catch (Throwable th18) {
            th = th18;
            i11 = i14;
            r14 = r21;
            SQLiteCursor sQLiteCursor6 = sQLiteCursor2;
            chatFull = chatFull2;
            sQLiteCursor = sQLiteCursor6;
            if (sQLiteCursor != null) {
            }
            final qp messagesController32222222222 = getMessagesController();
            messagesController32222222222.getClass();
            g0.h3(new Runnable() { // from class: org.telegram.messenger.cm
                @Override // java.lang.Runnable
                public final void run() {
                    qp qpVar = qp.this;
                    a0.h hVar = qpVar.l1;
                    long j102 = j3;
                    boolean z15222 = z11;
                    if (j102 > 0 && !z15222 && System.currentTimeMillis() - qpVar.w1.get(j102, 0L) > 60000) {
                        qpVar.V2(0, j102, z10);
                    }
                    TLRPC.ChatFull chatFull3222 = chatFull;
                    if (chatFull3222 != null) {
                        if (hVar.f(j102) == null) {
                            hVar.k(chatFull3222, j102);
                            qpVar.s7.M(-j102);
                        }
                        qpVar.Y3(arrayList3, true);
                        qpVar.S3(arrayList4, true);
                        if (chatFull3222.stickerset != null) {
                            qpVar.getMediaDataController().Y(chatFull3222.stickerset);
                        }
                        if (chatFull3222.emojiset != null) {
                            qpVar.getMediaDataController().Y(chatFull3222.emojiset);
                        }
                        qpVar.getNotificationCenter().k(qs.T, chatFull3222, 0, Boolean.valueOf(z15222), Boolean.FALSE);
                    }
                    qpVar.getNotificationCenter().k(qs.F0, Long.valueOf(-j102), arrayList5, hashMap, Integer.valueOf(i11), Boolean.valueOf(r14));
                }
            });
            throw th;
        }
        chatFull2 = null;
        queryFinalized.dispose();
        ArrayList arrayList62 = new ArrayList();
        ArrayList arrayList72 = new ArrayList();
        if (!(chatFull2 instanceof TLRPC.TL_communityFull)) {
        }
        if (chatFull2 != null) {
        }
        if (chatFull2 != null) {
            while (i16 < Math.min(3, chatFull2.recent_requesters.size())) {
            }
        }
        int i202 = 0;
        n0(arrayList62, arrayList3, false);
        Q(TextUtils.join(",", arrayList72), arrayList4);
        SQLiteDatabase sQLiteDatabase22 = getMessagesStorage().b;
        Locale locale2 = Locale.US;
        long j112 = -j3;
        i202 = 0;
        queryFinalized2 = sQLiteDatabase22.queryFinalized("SELECT mid FROM chat_pinned_v2 WHERE uid = " + j112 + " ORDER BY mid DESC", new Object[0]);
        while (queryFinalized2.next()) {
        }
        queryFinalized2.dispose();
        queryFinalized2 = this.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + j112, new Object[0]);
        if (queryFinalized2.next()) {
        }
        queryFinalized2.dispose();
        if (chatFull2 != null) {
        }
        i15 = 0;
        sQLiteCursor2 = null;
    }

    public final void G1(ArrayList arrayList, ArrayList arrayList2, long j3, int i7) {
        if (arrayList == null && arrayList2 == null && j3 == 0) {
            return;
        }
        this.a.c(new z1(this, arrayList, arrayList2, i7, j3));
    }

    public final void H() {
        try {
            this.P.await();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0 A[Catch: all -> 0x0072, Exception -> 0x0076, TryCatch #1 {all -> 0x0072, blocks: (B:5:0x0037, B:7:0x0040, B:9:0x0067, B:13:0x007b, B:16:0x009a, B:19:0x00b1, B:22:0x00ba, B:24:0x00d0, B:26:0x00d8, B:27:0x00dd, B:29:0x00f9, B:30:0x0100, B:32:0x011c, B:34:0x0126, B:36:0x0149, B:37:0x014b, B:39:0x015f, B:41:0x0163, B:43:0x0167, B:45:0x016f, B:47:0x0177, B:49:0x017d, B:52:0x018d, B:54:0x0199, B:55:0x01a8, B:57:0x01ac, B:58:0x01be, B:60:0x01c4, B:62:0x01ca, B:63:0x01cd, B:65:0x01d3, B:67:0x01e5, B:71:0x01ed, B:73:0x01f3, B:75:0x01fd, B:78:0x0205, B:80:0x0212, B:86:0x01b2, B:91:0x01b6, B:98:0x021c), top: B:4:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9 A[Catch: all -> 0x0072, Exception -> 0x0076, TryCatch #1 {all -> 0x0072, blocks: (B:5:0x0037, B:7:0x0040, B:9:0x0067, B:13:0x007b, B:16:0x009a, B:19:0x00b1, B:22:0x00ba, B:24:0x00d0, B:26:0x00d8, B:27:0x00dd, B:29:0x00f9, B:30:0x0100, B:32:0x011c, B:34:0x0126, B:36:0x0149, B:37:0x014b, B:39:0x015f, B:41:0x0163, B:43:0x0167, B:45:0x016f, B:47:0x0177, B:49:0x017d, B:52:0x018d, B:54:0x0199, B:55:0x01a8, B:57:0x01ac, B:58:0x01be, B:60:0x01c4, B:62:0x01ca, B:63:0x01cd, B:65:0x01d3, B:67:0x01e5, B:71:0x01ed, B:73:0x01f3, B:75:0x01fd, B:78:0x0205, B:80:0x0212, B:86:0x01b2, B:91:0x01b6, B:98:0x021c), top: B:4:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011c A[Catch: all -> 0x0072, Exception -> 0x0076, TryCatch #1 {all -> 0x0072, blocks: (B:5:0x0037, B:7:0x0040, B:9:0x0067, B:13:0x007b, B:16:0x009a, B:19:0x00b1, B:22:0x00ba, B:24:0x00d0, B:26:0x00d8, B:27:0x00dd, B:29:0x00f9, B:30:0x0100, B:32:0x011c, B:34:0x0126, B:36:0x0149, B:37:0x014b, B:39:0x015f, B:41:0x0163, B:43:0x0167, B:45:0x016f, B:47:0x0177, B:49:0x017d, B:52:0x018d, B:54:0x0199, B:55:0x01a8, B:57:0x01ac, B:58:0x01be, B:60:0x01c4, B:62:0x01ca, B:63:0x01cd, B:65:0x01d3, B:67:0x01e5, B:71:0x01ed, B:73:0x01f3, B:75:0x01fd, B:78:0x0205, B:80:0x0212, B:86:0x01b2, B:91:0x01b6, B:98:0x021c), top: B:4:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c4 A[Catch: all -> 0x0072, Exception -> 0x0076, TryCatch #1 {all -> 0x0072, blocks: (B:5:0x0037, B:7:0x0040, B:9:0x0067, B:13:0x007b, B:16:0x009a, B:19:0x00b1, B:22:0x00ba, B:24:0x00d0, B:26:0x00d8, B:27:0x00dd, B:29:0x00f9, B:30:0x0100, B:32:0x011c, B:34:0x0126, B:36:0x0149, B:37:0x014b, B:39:0x015f, B:41:0x0163, B:43:0x0167, B:45:0x016f, B:47:0x0177, B:49:0x017d, B:52:0x018d, B:54:0x0199, B:55:0x01a8, B:57:0x01ac, B:58:0x01be, B:60:0x01c4, B:62:0x01ca, B:63:0x01cd, B:65:0x01d3, B:67:0x01e5, B:71:0x01ed, B:73:0x01f3, B:75:0x01fd, B:78:0x0205, B:80:0x0212, B:86:0x01b2, B:91:0x01b6, B:98:0x021c), top: B:4:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d3 A[Catch: all -> 0x0072, Exception -> 0x0076, TryCatch #1 {all -> 0x0072, blocks: (B:5:0x0037, B:7:0x0040, B:9:0x0067, B:13:0x007b, B:16:0x009a, B:19:0x00b1, B:22:0x00ba, B:24:0x00d0, B:26:0x00d8, B:27:0x00dd, B:29:0x00f9, B:30:0x0100, B:32:0x011c, B:34:0x0126, B:36:0x0149, B:37:0x014b, B:39:0x015f, B:41:0x0163, B:43:0x0167, B:45:0x016f, B:47:0x0177, B:49:0x017d, B:52:0x018d, B:54:0x0199, B:55:0x01a8, B:57:0x01ac, B:58:0x01be, B:60:0x01c4, B:62:0x01ca, B:63:0x01cd, B:65:0x01d3, B:67:0x01e5, B:71:0x01ed, B:73:0x01f3, B:75:0x01fd, B:78:0x0205, B:80:0x0212, B:86:0x01b2, B:91:0x01b6, B:98:0x021c), top: B:4:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ed A[Catch: all -> 0x0072, Exception -> 0x0076, TryCatch #1 {all -> 0x0072, blocks: (B:5:0x0037, B:7:0x0040, B:9:0x0067, B:13:0x007b, B:16:0x009a, B:19:0x00b1, B:22:0x00ba, B:24:0x00d0, B:26:0x00d8, B:27:0x00dd, B:29:0x00f9, B:30:0x0100, B:32:0x011c, B:34:0x0126, B:36:0x0149, B:37:0x014b, B:39:0x015f, B:41:0x0163, B:43:0x0167, B:45:0x016f, B:47:0x0177, B:49:0x017d, B:52:0x018d, B:54:0x0199, B:55:0x01a8, B:57:0x01ac, B:58:0x01be, B:60:0x01c4, B:62:0x01ca, B:63:0x01cd, B:65:0x01d3, B:67:0x01e5, B:71:0x01ed, B:73:0x01f3, B:75:0x01fd, B:78:0x0205, B:80:0x0212, B:86:0x01b2, B:91:0x01b6, B:98:0x021c), top: B:4:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0099  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TLRPC.TL_messages_dialogs H0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor queryFinalized;
        TLRPC.Dialog dialog;
        NativeByteBuffer byteBufferValue;
        NativeByteBuffer byteBufferValue2;
        int i7;
        int i10;
        long longValue;
        long longValue2;
        NativeByteBuffer byteBufferValue3;
        long j3;
        NativeByteBuffer byteBufferValue4;
        yr yrVar = this;
        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        try {
            SQLiteDatabase sQLiteDatabase = yrVar.b;
            Locale locale = Locale.US;
            ?? r10 = 0;
            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, s.flags, m.date, d.pts, d.inbox_max, d.outbox_max, m.replydata, d.pinned, d.unread_count_i, d.flags, d.folder_id, d.data, d.unread_reactions, d.last_mid_group, d.ttl_period, d.unread_poll_votes FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid LEFT JOIN dialog_settings as s ON d.did = s.did WHERE d.did IN (" + str + ") ORDER BY d.pinned DESC, d.date DESC", new Object[0]);
            while (queryFinalized2.next()) {
                try {
                    try {
                        long longValue3 = queryFinalized2.longValue(r10);
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.id = longValue3;
                        tL_dialog.top_message = queryFinalized2.intValue(1);
                        tL_dialog.unread_count = queryFinalized2.intValue(2);
                        tL_dialog.last_message_date = queryFinalized2.intValue(3);
                        int intValue = queryFinalized2.intValue(10);
                        tL_dialog.pts = intValue;
                        if (intValue != 0 && !m5.E(tL_dialog.id)) {
                            i10 = 1;
                            tL_dialog.flags = i10;
                            tL_dialog.read_inbox_max_id = queryFinalized2.intValue(11);
                            tL_dialog.read_outbox_max_id = queryFinalized2.intValue(12);
                            int intValue2 = queryFinalized2.intValue(14);
                            tL_dialog.pinnedNum = intValue2;
                            tL_dialog.pinned = intValue2 == 0 ? true : r10;
                            tL_dialog.unread_mentions_count = queryFinalized2.intValue(15);
                            int intValue3 = queryFinalized2.intValue(16);
                            tL_dialog.unread_mark = (intValue3 & 1) == 0 ? true : r10;
                            tL_dialog.view_forum_as_messages = (intValue3 & 64) == 0 ? true : r10;
                            longValue = queryFinalized2.longValue(8);
                            TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                            tL_dialog.notify_settings = tL_peerNotifySettings;
                            if ((((int) longValue) & 1) != 0) {
                                int i11 = (int) (longValue >> 32);
                                tL_peerNotifySettings.mute_until = i11;
                                if (i11 == 0) {
                                    tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                            }
                            tL_dialog.folder_id = queryFinalized2.intValue(17);
                            tL_dialog.unread_reactions_count = queryFinalized2.intValue(19);
                            longValue2 = queryFinalized2.longValue(20);
                            if (longValue2 != 0) {
                                hVar2.a(longValue3, Long.valueOf(longValue2));
                            }
                            tL_dialog.ttl_period = queryFinalized2.intValue(21);
                            tL_dialog.unread_poll_votes_count = queryFinalized2.intValue(22);
                            tL_messages_dialogs.dialogs.add(tL_dialog);
                            byteBufferValue3 = queryFinalized2.byteBufferValue(4);
                            if (byteBufferValue3 != 0) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(r10), r10);
                                if (TLdeserialize != null) {
                                    TLdeserialize.readAttachPath(byteBufferValue3, yrVar.getUserConfig().n);
                                    byteBufferValue3.reuse();
                                    ij.N5(queryFinalized2.intValue(5), TLdeserialize);
                                    TLdeserialize.id = queryFinalized2.intValue(6);
                                    int intValue4 = queryFinalized2.intValue(9);
                                    if (intValue4 != 0) {
                                        tL_dialog.last_message_date = intValue4;
                                    }
                                    TLdeserialize.send_state = queryFinalized2.intValue(7);
                                    TLdeserialize.dialog_id = tL_dialog.id;
                                    tL_messages_dialogs.messages.add(TLdeserialize);
                                    e(TLdeserialize, arrayList, arrayList2, null);
                                    try {
                                        TLRPC.MessageReplyHeader messageReplyHeader = TLdeserialize.reply_to;
                                        if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0 && v0(TLdeserialize.action)) {
                                            if (queryFinalized2.isNull(13) || (byteBufferValue4 = queryFinalized2.byteBufferValue(13)) == 0) {
                                                j3 = longValue3;
                                            } else {
                                                TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(r10), r10);
                                                TLdeserialize.replyMessage = TLdeserialize2;
                                                j3 = longValue3;
                                                try {
                                                    TLdeserialize2.readAttachPath(byteBufferValue4, yrVar.getUserConfig().n);
                                                    byteBufferValue4.reuse();
                                                    TLRPC.Message message = TLdeserialize.replyMessage;
                                                    if (message != null) {
                                                        e(message, arrayList, arrayList2, null);
                                                    }
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    yrVar.o(e, true);
                                                    if (!m5.C(j3)) {
                                                    }
                                                    if (!m5.C(j3)) {
                                                    }
                                                    r10 = 0;
                                                }
                                            }
                                            if (TLdeserialize.replyMessage == null) {
                                                hVar.k(TLdeserialize, tL_dialog.id);
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        j3 = longValue3;
                                    }
                                } else {
                                    j3 = longValue3;
                                    byteBufferValue3.reuse();
                                }
                                if (!m5.C(j3) && tL_dialog.read_inbox_max_id > tL_dialog.top_message) {
                                    tL_dialog.read_inbox_max_id = 0;
                                }
                                if (!m5.C(j3)) {
                                    int i12 = (int) (j3 & 4294967295L);
                                    if (!arrayList3.contains(Integer.valueOf(i12))) {
                                        arrayList3.add(Integer.valueOf(i12));
                                    }
                                } else if (!m5.E(j3)) {
                                    long j10 = -j3;
                                    if (!arrayList2.contains(Long.valueOf(j10))) {
                                        arrayList2.add(Long.valueOf(j10));
                                    }
                                } else if (!arrayList.contains(Long.valueOf(j3))) {
                                    arrayList.add(Long.valueOf(j3));
                                }
                                r10 = 0;
                            }
                            j3 = longValue3;
                            if (!m5.C(j3)) {
                                tL_dialog.read_inbox_max_id = 0;
                            }
                            if (!m5.C(j3)) {
                            }
                            r10 = 0;
                        }
                        i10 = r10;
                        tL_dialog.flags = i10;
                        tL_dialog.read_inbox_max_id = queryFinalized2.intValue(11);
                        tL_dialog.read_outbox_max_id = queryFinalized2.intValue(12);
                        int intValue22 = queryFinalized2.intValue(14);
                        tL_dialog.pinnedNum = intValue22;
                        tL_dialog.pinned = intValue22 == 0 ? true : r10;
                        tL_dialog.unread_mentions_count = queryFinalized2.intValue(15);
                        int intValue32 = queryFinalized2.intValue(16);
                        tL_dialog.unread_mark = (intValue32 & 1) == 0 ? true : r10;
                        tL_dialog.view_forum_as_messages = (intValue32 & 64) == 0 ? true : r10;
                        longValue = queryFinalized2.longValue(8);
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings2 = new TLRPC.TL_peerNotifySettings();
                        tL_dialog.notify_settings = tL_peerNotifySettings2;
                        if ((((int) longValue) & 1) != 0) {
                        }
                        tL_dialog.folder_id = queryFinalized2.intValue(17);
                        tL_dialog.unread_reactions_count = queryFinalized2.intValue(19);
                        longValue2 = queryFinalized2.longValue(20);
                        if (longValue2 != 0) {
                        }
                        tL_dialog.ttl_period = queryFinalized2.intValue(21);
                        tL_dialog.unread_poll_votes_count = queryFinalized2.intValue(22);
                        tL_messages_dialogs.dialogs.add(tL_dialog);
                        byteBufferValue3 = queryFinalized2.byteBufferValue(4);
                        if (byteBufferValue3 != 0) {
                        }
                        j3 = longValue3;
                        if (!m5.C(j3)) {
                        }
                        if (!m5.C(j3)) {
                        }
                        r10 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor = queryFinalized2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = queryFinalized2;
                }
            }
            queryFinalized2.dispose();
            if (hVar2.i()) {
                queryFinalized = null;
            } else {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = 0;
                    while (i13 < hVar2.m()) {
                        sb2.append("uid = ");
                        sb2.append(hVar2.j(i13));
                        sb2.append(" AND group_id = ");
                        sb2.append(hVar2.n(i13));
                        i13++;
                        if (i13 < hVar2.m()) {
                            sb2.append(" OR ");
                        }
                    }
                    SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                    Locale locale2 = Locale.US;
                    int i14 = 0;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT uid, data, read_state, mid, send_state, date, replydata FROM messages_v2 WHERE " + ((Object) sb2) + " ORDER BY date DESC", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            try {
                                long longValue4 = queryFinalized.longValue(i14);
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= tL_messages_dialogs.dialogs.size()) {
                                        dialog = null;
                                        break;
                                    }
                                    dialog = tL_messages_dialogs.dialogs.get(i15);
                                    if (dialog != null && dialog.id == longValue4) {
                                        break;
                                    }
                                    i15++;
                                }
                                if (dialog != null && (byteBufferValue = queryFinalized.byteBufferValue(1)) != null) {
                                    TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                    if (TLdeserialize3 != null) {
                                        TLdeserialize3.readAttachPath(byteBufferValue, yrVar.getUserConfig().n);
                                        byteBufferValue.reuse();
                                        ij.N5(queryFinalized.intValue(2), TLdeserialize3);
                                        TLdeserialize3.id = queryFinalized.intValue(3);
                                        int intValue5 = queryFinalized.intValue(5);
                                        if (intValue5 != 0) {
                                            dialog.last_message_date = intValue5;
                                        }
                                        TLdeserialize3.send_state = queryFinalized.intValue(4);
                                        TLdeserialize3.dialog_id = dialog.id;
                                        tL_messages_dialogs.messages.add(TLdeserialize3);
                                        e(TLdeserialize3, arrayList, arrayList2, null);
                                        try {
                                            TLRPC.MessageReplyHeader messageReplyHeader2 = TLdeserialize3.reply_to;
                                            if (messageReplyHeader2 != null && messageReplyHeader2.reply_to_msg_id != 0 && v0(TLdeserialize3.action)) {
                                                if (!queryFinalized.isNull(6) && (byteBufferValue2 = queryFinalized.byteBufferValue(6)) != null) {
                                                    TLRPC.Message TLdeserialize4 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                    TLdeserialize3.replyMessage = TLdeserialize4;
                                                    TLdeserialize4.readAttachPath(byteBufferValue2, yrVar.getUserConfig().n);
                                                    byteBufferValue2.reuse();
                                                    TLRPC.Message message2 = TLdeserialize3.replyMessage;
                                                    if (message2 != null) {
                                                        e(message2, arrayList, arrayList2, null);
                                                    }
                                                }
                                                if (TLdeserialize3.replyMessage == null) {
                                                    hVar.k(TLdeserialize3, dialog.id);
                                                }
                                            }
                                        } catch (Exception e13) {
                                            yrVar.o(e13, true);
                                        }
                                    } else {
                                        byteBufferValue.reuse();
                                    }
                                }
                                i14 = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            sQLiteCursor = queryFinalized;
                            try {
                                throw e;
                            } catch (Throwable th4) {
                                th = th4;
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e15) {
                    e = e15;
                    sQLiteCursor = null;
                    throw e;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            if (!hVar.i()) {
                int m10 = hVar.m();
                int i16 = 0;
                while (i16 < m10) {
                    long j11 = hVar.j(i16);
                    TLRPC.Message message3 = (TLRPC.Message) hVar.n(i16);
                    SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid = " + message3.id + " and uid = " + j11, new Object[0]);
                    while (queryFinalized3.next()) {
                        NativeByteBuffer byteBufferValue5 = queryFinalized3.byteBufferValue(0);
                        if (byteBufferValue5 != null) {
                            TLRPC.Message TLdeserialize5 = TLRPC.Message.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(false), false);
                            TLdeserialize5.readAttachPath(byteBufferValue5, yrVar.getUserConfig().n);
                            byteBufferValue5.reuse();
                            TLdeserialize5.id = queryFinalized3.intValue(1);
                            TLdeserialize5.date = queryFinalized3.intValue(2);
                            i7 = m10;
                            TLdeserialize5.dialog_id = queryFinalized3.longValue(3);
                            e(TLdeserialize5, arrayList, arrayList2, null);
                            message3.replyMessage = TLdeserialize5;
                            TLdeserialize5.dialog_id = message3.dialog_id;
                        } else {
                            i7 = m10;
                        }
                        yrVar = this;
                        m10 = i7;
                    }
                    int i17 = m10;
                    queryFinalized3.dispose();
                    i16++;
                    yrVar = this;
                    m10 = i17;
                }
            }
            if (queryFinalized != null) {
                queryFinalized.dispose();
            }
            return tL_messages_dialogs;
        } catch (Exception e16) {
            e = e16;
            sQLiteCursor = null;
        } catch (Throwable th6) {
            th = th6;
            sQLiteCursor = null;
        }
    }

    public final void H1(int i7) {
        H();
        this.n = i7;
    }

    public final void I(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        p5 p5Var = this.a;
        if (currentThread != p5Var) {
            p5Var.c(runnable);
        } else {
            runnable.run();
        }
    }

    public final void I0(ArrayList arrayList) {
        try {
            a0.h hVar = new a0.h();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (!((i00) arrayList.get(i7)).i && !((i00) arrayList.get(i7)).j && ((i00) arrayList.get(i7)).g != null) {
                    long j3 = ((i00) arrayList.get(i7)).g.grouped_id;
                    if (j3 != 0) {
                        ArrayList arrayList2 = (ArrayList) hVar.f(j3);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            hVar.k(arrayList2, j3);
                        }
                        arrayList2.add((i00) arrayList.get(i7));
                    }
                }
            }
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                long j10 = hVar.j(i10);
                ArrayList arrayList3 = (ArrayList) hVar.n(i10);
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + ((i00) arrayList3.get(0)).b + " AND group_id = " + j10 + " ORDER BY date DESC", new Object[0]);
                ArrayList arrayList4 = null;
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, p10.i(this.currentAccount).n);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(new ij(this.currentAccount, TLdeserialize, false, false));
                }
                queryFinalized.dispose();
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ((i00) arrayList3.get(i11)).h = arrayList4;
                }
            }
        } catch (Throwable th2) {
            o(th2, true);
        }
    }

    public final void I1(int i7) {
        H();
        this.r = i7;
    }

    public final void J0(ArrayList arrayList, long j3) {
        if (arrayList == null) {
            return;
        }
        try {
            a0.h hVar = new a0.h();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (((TLRPC.TL_forumTopic) arrayList.get(i7)).topMessage != null) {
                    long j10 = ((TLRPC.TL_forumTopic) arrayList.get(i7)).topMessage.grouped_id;
                    if (j10 != 0) {
                        ArrayList arrayList2 = (ArrayList) hVar.f(j10);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            hVar.k(arrayList2, j10);
                        }
                        arrayList2.add((TLRPC.TL_forumTopic) arrayList.get(i7));
                    }
                }
            }
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                long j11 = hVar.j(i10);
                ArrayList arrayList3 = (ArrayList) hVar.n(i10);
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j3 + " AND group_id = " + j11 + " ORDER BY date DESC", new Object[0]);
                ArrayList<ij> arrayList4 = null;
                while (queryFinalized.next()) {
                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    if (TLdeserialize != null) {
                        TLdeserialize.readAttachPath(byteBufferValue, p10.i(this.currentAccount).n);
                    }
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList<>();
                    }
                    arrayList4.add(new ij(this.currentAccount, TLdeserialize, false, false));
                }
                queryFinalized.dispose();
                for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                    ((TLRPC.TL_forumTopic) arrayList3.get(i11)).groupedMessages = arrayList4;
                }
            }
        } catch (Throwable th2) {
            o(th2, true);
        }
    }

    public final void J1(int i7) {
        H();
        this.s = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012f A[Catch: all -> 0x01b2, Exception -> 0x01b5, TryCatch #7 {Exception -> 0x01b5, all -> 0x01b2, blocks: (B:37:0x0129, B:39:0x012f, B:41:0x0135), top: B:36:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c0 A[Catch: all -> 0x0174, Exception -> 0x0179, TRY_LEAVE, TryCatch #6 {Exception -> 0x0179, all -> 0x0174, blocks: (B:47:0x014e, B:49:0x015e, B:51:0x0184, B:53:0x0191, B:55:0x0198, B:58:0x017d, B:76:0x01c0), top: B:46:0x014e }] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01bb -> B:33:0x009a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K0(a0.h hVar, a0.h hVar2, ArrayList arrayList, ArrayList arrayList2, int i7) {
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        SQLiteCursor queryFinalized;
        boolean z12;
        SQLiteCursor sQLiteCursor;
        ?? r22;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        yr yrVar = this;
        a0.h hVar3 = hVar;
        if (hVar3.i()) {
            return;
        }
        int i11 = 1;
        boolean z13 = i7 == 1;
        boolean z14 = i7 == 5;
        boolean z15 = i7 == 9;
        long e10 = yrVar.getUserConfig().e();
        int m10 = hVar3.m();
        int i12 = 0;
        while (i12 < m10) {
            long j3 = hVar3.j(i12);
            SparseArray sparseArray = (SparseArray) hVar3.n(i12);
            ArrayList arrayList3 = (ArrayList) hVar2.f(j3);
            if (arrayList3 == null) {
                z9 = z15;
                z10 = z13;
            } else {
                int i13 = 0;
                SQLiteCursor sQLiteCursor4 = null;
                while (i13 < 2) {
                    if (i13 != i11 || z13) {
                        int i14 = i13 == i11 ? i11 : 0;
                        try {
                            if (z15) {
                                try {
                                    try {
                                        SQLiteDatabase sQLiteDatabase = yrVar.b;
                                        Locale locale = Locale.US;
                                        String join = TextUtils.join(",", arrayList3);
                                        z11 = z15;
                                        StringBuilder sb2 = new StringBuilder();
                                        i10 = i13;
                                        sb2.append("SELECT data, mid, date, dialog_id FROM welcome_messages WHERE mid IN(");
                                        sb2.append(join);
                                        sb2.append(") AND dialog_id = ");
                                        sb2.append(j3);
                                        queryFinalized = sQLiteDatabase.queryFinalized(sb2.toString(), new Object[0]);
                                    } catch (Exception e11) {
                                        throw e11;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLiteCursor4 != null) {
                                        sQLiteCursor4.dispose();
                                    }
                                    throw th;
                                }
                            } else {
                                z11 = z15;
                                i10 = i13;
                                if (z14) {
                                    SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                                    Locale locale2 = Locale.US;
                                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data, mid, date, topic_id FROM quick_replies_messages WHERE mid IN(" + TextUtils.join(",", arrayList3) + ") AND topic_id = " + j3, new Object[0]);
                                } else if (i14 != 0) {
                                    SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                                    Locale locale3 = Locale.US;
                                    String join2 = TextUtils.join(",", arrayList3);
                                    StringBuilder sb3 = new StringBuilder();
                                    z12 = z13;
                                    sb3.append("SELECT data, mid, date, uid FROM scheduled_messages_v2 WHERE mid IN(");
                                    sb3.append(join2);
                                    sb3.append(") AND uid = ");
                                    sb3.append(j3);
                                    sQLiteCursor3 = sQLiteDatabase3.queryFinalized(sb3.toString(), new Object[0]);
                                    r22 = 0;
                                    sQLiteCursor = sQLiteCursor3;
                                    if (sQLiteCursor.next()) {
                                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r22);
                                        if (byteBufferValue != 0) {
                                            try {
                                                try {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r22), r22);
                                                    TLdeserialize.readAttachPath(byteBufferValue, yrVar.getUserConfig().n);
                                                    byteBufferValue.reuse();
                                                    TLdeserialize.id = sQLiteCursor2.intValue(1);
                                                    TLdeserialize.date = sQLiteCursor2.intValue(2);
                                                    if (z14) {
                                                        TLdeserialize.dialog_id = e10;
                                                        TLdeserialize.flags |= TLObject.FLAG_30;
                                                        TLdeserialize.quick_reply_shortcut_id = sQLiteCursor2.intValue(3);
                                                    } else {
                                                        TLdeserialize.dialog_id = sQLiteCursor2.longValue(3);
                                                    }
                                                    e(TLdeserialize, arrayList, arrayList2, null);
                                                    ArrayList arrayList4 = (ArrayList) sparseArray.get(TLdeserialize.id);
                                                    if (arrayList4 != null) {
                                                        int size = arrayList4.size();
                                                        for (int i15 = 0; i15 < size; i15++) {
                                                            ((TLRPC.Message) arrayList4.get(i15)).replyMessage = TLdeserialize;
                                                            ij.B0(TLdeserialize);
                                                        }
                                                    }
                                                } catch (Exception e12) {
                                                    throw e12;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    if (sQLiteCursor4 != null) {
                                                    }
                                                    throw th;
                                                }
                                                sQLiteCursor4 = sQLiteCursor;
                                            } catch (Exception e13) {
                                                e = e13;
                                                throw e;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                sQLiteCursor4 = sQLiteCursor2;
                                                if (sQLiteCursor4 != null) {
                                                }
                                                throw th;
                                            }
                                            sQLiteCursor2 = sQLiteCursor4;
                                        } else {
                                            sQLiteCursor2 = sQLiteCursor;
                                        }
                                        yrVar = this;
                                        sQLiteCursor3 = sQLiteCursor2;
                                        r22 = 0;
                                        sQLiteCursor = sQLiteCursor3;
                                        if (sQLiteCursor.next()) {
                                        }
                                    } else {
                                        SQLiteCursor sQLiteCursor5 = sQLiteCursor;
                                        sQLiteCursor5.dispose();
                                        sQLiteCursor4 = sQLiteCursor5;
                                    }
                                } else {
                                    z12 = z13;
                                    SQLiteDatabase sQLiteDatabase4 = yrVar.b;
                                    Locale locale4 = Locale.US;
                                    r22 = 0;
                                    sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT data, mid, date, uid FROM messages_v2 WHERE mid IN(" + TextUtils.join(",", arrayList3) + ") AND uid = " + j3, new Object[0]);
                                    if (sQLiteCursor.next()) {
                                    }
                                }
                            }
                            if (sQLiteCursor.next()) {
                            }
                        } catch (Exception e14) {
                            e = e14;
                            sQLiteCursor2 = sQLiteCursor;
                        } catch (Throwable th5) {
                            th = th5;
                            sQLiteCursor2 = sQLiteCursor;
                        }
                        sQLiteCursor3 = queryFinalized;
                        z12 = z13;
                        r22 = 0;
                        sQLiteCursor = sQLiteCursor3;
                    } else {
                        z11 = z15;
                        i10 = i13;
                        z12 = z13;
                    }
                    i13 = i10 + 1;
                    yrVar = this;
                    z13 = z12;
                    z15 = z11;
                    i11 = 1;
                }
                z9 = z15;
                z10 = z13;
                if (sQLiteCursor4 != null) {
                    sQLiteCursor4.dispose();
                }
            }
            i12++;
            yrVar = this;
            hVar3 = hVar;
            z13 = z10;
            z15 = z9;
            i11 = 1;
        }
    }

    public final void K1(int i7) {
        H();
        this.w = i7;
    }

    public final void L(String str, ArrayList arrayList) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM animated_emoji WHERE document_id IN (" + str + ")", new Object[0]);
                while (sQLiteCursor.next()) {
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                    try {
                        TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(true), true);
                        if (TLdeserialize != null && TLdeserialize.id != 0) {
                            arrayList.add(TLdeserialize);
                        }
                    } catch (Exception e10) {
                        o(e10, true);
                    }
                    if (byteBufferValue != null) {
                        byteBufferValue.reuse();
                    }
                }
            } catch (SQLiteException e11) {
                e11.printStackTrace();
                if (sQLiteCursor == null) {
                    return;
                }
            }
            sQLiteCursor.dispose();
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public final ArrayList L0(HashSet hashSet) {
        ArrayList arrayList = new ArrayList();
        try {
            String join = TextUtils.join(",", hashSet);
            SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT info, pinned FROM user_settings WHERE uid IN(" + join + ")", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.UserFull TLdeserialize = TLRPC.UserFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.pinned_msg_id = queryFinalized.intValue(1);
                    arrayList.add(TLdeserialize);
                    byteBufferValue.reuse();
                }
            }
            queryFinalized.dispose();
            return arrayList;
        } catch (Exception e10) {
            o(e10, true);
            return arrayList;
        }
    }

    public final void M(String str, RequestDelegate requestDelegate) {
        if (str != null) {
            this.a.c(new dg(this, getConnectionsManager().getCurrentTime(), str, requestDelegate, 15));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x02c7, code lost:
    
        r7 = (jg.d0) r6.f(r13.id);
        r8 = r13.status;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02d1, code lost:
    
        if (r8 == null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02d3, code lost:
    
        r28 = r3;
        r29 = r6;
        r8.expires = r2.intValue(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02e5, code lost:
    
        if (r5 != 1) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02e7, code lost:
    
        r7.c = org.telegram.messenger.g0.r0(r13.first_name, r13.last_name, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x031b, code lost:
    
        r7.a = r13;
        r7 = r19 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02f2, code lost:
    
        r7.c = org.telegram.messenger.g0.r0("@" + org.telegram.messenger.t10.n(r13), null, "@" + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02e0, code lost:
    
        r28 = r3;
        r29 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03ea, code lost:
    
        if (r3.contains(" " + r13) != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x004c, code lost:
    
        if (r14.length() == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        if (r9.startsWith(r3) == false) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028f A[Catch: all -> 0x00e0, Exception -> 0x00e4, TryCatch #11 {Exception -> 0x00e4, all -> 0x00e0, blocks: (B:24:0x00b0, B:26:0x00b6, B:29:0x00d4, B:35:0x00e8, B:37:0x00ee, B:53:0x0106, B:55:0x0110, B:64:0x011c, B:66:0x0127, B:73:0x0134, B:75:0x0142, B:79:0x014f, B:100:0x0209, B:102:0x020f, B:105:0x0223, B:107:0x022c, B:110:0x023e, B:112:0x0248, B:115:0x0261, B:117:0x0267, B:121:0x027f, B:125:0x028f, B:127:0x029a, B:130:0x02ad, B:134:0x032f, B:136:0x02c7, B:138:0x02d3, B:141:0x02e7, B:142:0x031b, B:145:0x02f2, B:164:0x0350, B:179:0x03ba, B:182:0x03d1, B:184:0x03d7, B:275:0x052d, B:277:0x0533, B:280:0x0547, B:282:0x0550, B:285:0x055c, B:287:0x0564, B:290:0x057b, B:292:0x0581, B:296:0x0599, B:302:0x05a4, B:304:0x05ab, B:306:0x05ba, B:308:0x05c0, B:311:0x05d2, B:313:0x065f, B:314:0x0661, B:316:0x066d, B:319:0x0677, B:320:0x06c7, B:323:0x069e, B:300:0x06d6, B:332:0x06e6, B:366:0x0758, B:368:0x075e, B:371:0x076a, B:374:0x077e, B:376:0x0785, B:379:0x0791, B:381:0x0799, B:384:0x07b4, B:386:0x07ba, B:390:0x07d2, B:396:0x07e1, B:398:0x07e8, B:400:0x07f7, B:403:0x0801, B:404:0x0838, B:408:0x080e, B:394:0x0845, B:419:0x0860), top: B:23:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x036e A[Catch: all -> 0x004f, Exception -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0053, all -> 0x004f, blocks: (B:451:0x0048, B:17:0x006c, B:21:0x0088, B:83:0x015e, B:85:0x016d, B:88:0x018e, B:90:0x019c, B:92:0x01ad, B:94:0x01be, B:99:0x01e4, B:168:0x036e, B:274:0x0506, B:336:0x06fe, B:338:0x0708, B:340:0x070c, B:349:0x0723), top: B:450:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06d6 A[Catch: all -> 0x00e0, Exception -> 0x00e4, LOOP:6: B:284:0x055a->B:300:0x06d6, LOOP_END, TryCatch #11 {Exception -> 0x00e4, all -> 0x00e0, blocks: (B:24:0x00b0, B:26:0x00b6, B:29:0x00d4, B:35:0x00e8, B:37:0x00ee, B:53:0x0106, B:55:0x0110, B:64:0x011c, B:66:0x0127, B:73:0x0134, B:75:0x0142, B:79:0x014f, B:100:0x0209, B:102:0x020f, B:105:0x0223, B:107:0x022c, B:110:0x023e, B:112:0x0248, B:115:0x0261, B:117:0x0267, B:121:0x027f, B:125:0x028f, B:127:0x029a, B:130:0x02ad, B:134:0x032f, B:136:0x02c7, B:138:0x02d3, B:141:0x02e7, B:142:0x031b, B:145:0x02f2, B:164:0x0350, B:179:0x03ba, B:182:0x03d1, B:184:0x03d7, B:275:0x052d, B:277:0x0533, B:280:0x0547, B:282:0x0550, B:285:0x055c, B:287:0x0564, B:290:0x057b, B:292:0x0581, B:296:0x0599, B:302:0x05a4, B:304:0x05ab, B:306:0x05ba, B:308:0x05c0, B:311:0x05d2, B:313:0x065f, B:314:0x0661, B:316:0x066d, B:319:0x0677, B:320:0x06c7, B:323:0x069e, B:300:0x06d6, B:332:0x06e6, B:366:0x0758, B:368:0x075e, B:371:0x076a, B:374:0x077e, B:376:0x0785, B:379:0x0791, B:381:0x0799, B:384:0x07b4, B:386:0x07ba, B:390:0x07d2, B:396:0x07e1, B:398:0x07e8, B:400:0x07f7, B:403:0x0801, B:404:0x0838, B:408:0x080e, B:394:0x0845, B:419:0x0860), top: B:23:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06fe A[Catch: all -> 0x004f, Exception -> 0x0053, TRY_ENTER, TryCatch #7 {Exception -> 0x0053, all -> 0x004f, blocks: (B:451:0x0048, B:17:0x006c, B:21:0x0088, B:83:0x015e, B:85:0x016d, B:88:0x018e, B:90:0x019c, B:92:0x01ad, B:94:0x01be, B:99:0x01e4, B:168:0x036e, B:274:0x0506, B:336:0x06fe, B:338:0x0708, B:340:0x070c, B:349:0x0723), top: B:450:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0723 A[Catch: all -> 0x004f, Exception -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0053, all -> 0x004f, blocks: (B:451:0x0048, B:17:0x006c, B:21:0x0088, B:83:0x015e, B:85:0x016d, B:88:0x018e, B:90:0x019c, B:92:0x01ad, B:94:0x01be, B:99:0x01e4, B:168:0x036e, B:274:0x0506, B:336:0x06fe, B:338:0x0708, B:340:0x070c, B:349:0x0723), top: B:450:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0845 A[Catch: all -> 0x00e0, Exception -> 0x00e4, LOOP:10: B:378:0x078f->B:394:0x0845, LOOP_END, TryCatch #11 {Exception -> 0x00e4, all -> 0x00e0, blocks: (B:24:0x00b0, B:26:0x00b6, B:29:0x00d4, B:35:0x00e8, B:37:0x00ee, B:53:0x0106, B:55:0x0110, B:64:0x011c, B:66:0x0127, B:73:0x0134, B:75:0x0142, B:79:0x014f, B:100:0x0209, B:102:0x020f, B:105:0x0223, B:107:0x022c, B:110:0x023e, B:112:0x0248, B:115:0x0261, B:117:0x0267, B:121:0x027f, B:125:0x028f, B:127:0x029a, B:130:0x02ad, B:134:0x032f, B:136:0x02c7, B:138:0x02d3, B:141:0x02e7, B:142:0x031b, B:145:0x02f2, B:164:0x0350, B:179:0x03ba, B:182:0x03d1, B:184:0x03d7, B:275:0x052d, B:277:0x0533, B:280:0x0547, B:282:0x0550, B:285:0x055c, B:287:0x0564, B:290:0x057b, B:292:0x0581, B:296:0x0599, B:302:0x05a4, B:304:0x05ab, B:306:0x05ba, B:308:0x05c0, B:311:0x05d2, B:313:0x065f, B:314:0x0661, B:316:0x066d, B:319:0x0677, B:320:0x06c7, B:323:0x069e, B:300:0x06d6, B:332:0x06e6, B:366:0x0758, B:368:0x075e, B:371:0x076a, B:374:0x077e, B:376:0x0785, B:379:0x0791, B:381:0x0799, B:384:0x07b4, B:386:0x07ba, B:390:0x07d2, B:396:0x07e1, B:398:0x07e8, B:400:0x07f7, B:403:0x0801, B:404:0x0838, B:408:0x080e, B:394:0x0845, B:419:0x0860), top: B:23:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:434:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad A[Catch: all -> 0x004f, Exception -> 0x0053, TryCatch #7 {Exception -> 0x0053, all -> 0x004f, blocks: (B:451:0x0048, B:17:0x006c, B:21:0x0088, B:83:0x015e, B:85:0x016d, B:88:0x018e, B:90:0x019c, B:92:0x01ad, B:94:0x01be, B:99:0x01e4, B:168:0x036e, B:274:0x0506, B:336:0x06fe, B:338:0x0708, B:340:0x070c, B:349:0x0723), top: B:450:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01be A[Catch: all -> 0x004f, Exception -> 0x0053, TRY_LEAVE, TryCatch #7 {Exception -> 0x0053, all -> 0x004f, blocks: (B:451:0x0048, B:17:0x006c, B:21:0x0088, B:83:0x015e, B:85:0x016d, B:88:0x018e, B:90:0x019c, B:92:0x01ad, B:94:0x01be, B:99:0x01e4, B:168:0x036e, B:274:0x0506, B:336:0x06fe, B:338:0x0708, B:340:0x070c, B:349:0x0723), top: B:450:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e4 A[Catch: all -> 0x004f, Exception -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0053, all -> 0x004f, blocks: (B:451:0x0048, B:17:0x006c, B:21:0x0088, B:83:0x015e, B:85:0x016d, B:88:0x018e, B:90:0x019c, B:92:0x01ad, B:94:0x01be, B:99:0x01e4, B:168:0x036e, B:274:0x0506, B:336:0x06fe, B:338:0x0708, B:340:0x070c, B:349:0x0723), top: B:450:0x0048 }] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M0(int i7, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i10) {
        SQLiteCursor sQLiteCursor;
        int i11;
        String[] strArr;
        SQLiteCursor queryFinalized;
        String str2;
        int i12;
        ArrayList arrayList5;
        a0.h hVar;
        int i13;
        String str3;
        int i14;
        a0.h hVar2;
        String str4;
        String str5;
        ArrayList arrayList6;
        int i15;
        int i16;
        a0.h hVar3;
        String str6;
        Object obj;
        String str7;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.User user;
        SQLiteCursor sQLiteCursor2;
        a0.h hVar4;
        ArrayList arrayList7;
        ?? r52;
        String str8;
        a0.h hVar5;
        String str9;
        int i17;
        String str10;
        int i18;
        TLRPC.User a22;
        long e10 = p10.i(this.currentAccount).e();
        try {
            String lowerCase = str.trim().toLowerCase();
            if (TextUtils.isEmpty(lowerCase)) {
                return;
            }
            String lowerCase2 = id.L0(2131745904).toLowerCase();
            String lowerCase3 = id.L0(2131746267).toLowerCase();
            String str11 = "replies";
            String R0 = id.E0().R0(lowerCase);
            if (!lowerCase.equals(R0)) {
                try {
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = null;
                    try {
                        n(e);
                        if (sQLiteCursor == null) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = null;
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            R0 = null;
            int i19 = 1 + (R0 != null ? 1 : 0);
            String[] strArr2 = new String[i19];
            strArr2[0] = lowerCase;
            if (R0 != null) {
                strArr2[1] = R0;
            }
            ArrayList arrayList8 = new ArrayList();
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            a0.h hVar6 = new a0.h();
            if (i10 >= 0) {
                strArr = strArr2;
                i11 = i19;
                queryFinalized = R().queryFinalized("SELECT did, date FROM dialogs WHERE folder_id = ? ORDER BY date DESC LIMIT 600", Integer.valueOf(i10));
            } else {
                i11 = i19;
                strArr = strArr2;
                queryFinalized = R().queryFinalized("SELECT did, date FROM dialogs ORDER BY date DESC LIMIT 600", new Object[0]);
            }
            while (queryFinalized.next()) {
                try {
                    String str12 = lowerCase;
                    long longValue = queryFinalized.longValue(0);
                    jg.d0 d0Var = new jg.d0();
                    String str13 = str11;
                    d0Var.b = queryFinalized.intValue(1);
                    hVar6.k(d0Var, longValue);
                    if (i7 != 15 || (arrayList4 != null && arrayList4.contains(Long.valueOf(longValue)))) {
                        if (m5.C(longValue)) {
                            if (i7 == 0 || i7 == 3) {
                                int h = m5.h(longValue);
                                if (!arrayList10.contains(Integer.valueOf(h))) {
                                    arrayList10.add(Integer.valueOf(h));
                                }
                            }
                        } else if (m5.E(longValue)) {
                            if ((i7 != 4 || longValue != e10) && i7 != 6 && i7 != 5 && i7 != 2 && !arrayList8.contains(Long.valueOf(longValue))) {
                                arrayList8.add(Long.valueOf(longValue));
                            }
                        } else if (i7 != 4) {
                            long j3 = -longValue;
                            if (!arrayList9.contains(Long.valueOf(j3))) {
                                arrayList9.add(Long.valueOf(j3));
                            }
                        }
                    }
                    lowerCase = str12;
                    str11 = str13;
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor = queryFinalized;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = queryFinalized;
                }
            }
            String str14 = lowerCase;
            String str15 = str11;
            queryFinalized.dispose();
            if (i7 != 4) {
                str2 = str14;
            } else {
                str2 = str14;
            }
            if (!"saved messages".startsWith(str2)) {
                i12 = 0;
                if ((i7 != 4 && lowerCase3.startsWith(str2)) || str15.startsWith(str2)) {
                    a22 = getMessagesController().a2(708513L);
                    if (a22 == null) {
                        a22 = getMessagesController().a2(1271266957L);
                    }
                    if (a22 != null) {
                        jg.d0 d0Var2 = new jg.d0();
                        d0Var2.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        d0Var2.c = id.L0(2131746267);
                        d0Var2.a = a22;
                        hVar6.k(d0Var2, a22.id);
                        i12++;
                    }
                }
                String str16 = ";;;";
                String str17 = " ";
                if (arrayList8.isEmpty()) {
                    arrayList5 = arrayList10;
                    hVar = hVar6;
                    i13 = i11;
                    str3 = ";;;";
                } else {
                    SQLiteDatabase R = R();
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized2 = R.queryFinalized("SELECT data, status, name FROM users WHERE uid IN(" + TextUtils.join(",", arrayList8) + ")", new Object[0]);
                    while (queryFinalized2.next()) {
                        String stringValue = queryFinalized2.stringValue(2);
                        String R02 = id.E0().R0(stringValue);
                        if (stringValue.equals(R02)) {
                            R02 = null;
                        }
                        int lastIndexOf = stringValue.lastIndexOf(str16);
                        int i20 = i12;
                        String substring = lastIndexOf != -1 ? stringValue.substring(lastIndexOf + 3) : null;
                        int i21 = i11;
                        String str18 = str16;
                        int i22 = i21;
                        int i23 = 0;
                        boolean z9 = false;
                        while (true) {
                            if (i23 >= i22) {
                                arrayList7 = arrayList10;
                                break;
                            }
                            int i24 = i23;
                            String str19 = strArr[i24];
                            if (stringValue.startsWith(str19)) {
                                arrayList7 = arrayList10;
                            } else {
                                arrayList7 = arrayList10;
                                if (!stringValue.contains(" " + str19)) {
                                    if (R02 != null) {
                                        if (!R02.startsWith(str19)) {
                                            if (R02.contains(" " + str19)) {
                                            }
                                        }
                                    }
                                    r52 = (substring == null || !substring.startsWith(str19)) ? z9 : 2;
                                    if (r52 == 0) {
                                        str8 = R02;
                                        str9 = substring;
                                        NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                                        if (byteBufferValue == null) {
                                            break;
                                        }
                                        str10 = stringValue;
                                        TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        byteBufferValue.reuse();
                                        if (i7 != 15) {
                                            i18 = i22;
                                            break;
                                        }
                                        if (arrayList4 != null) {
                                            i18 = i22;
                                            if (arrayList4.contains(Long.valueOf(TLdeserialize.id))) {
                                                break;
                                            }
                                            i17 = i18;
                                            hVar5 = hVar6;
                                        } else {
                                            hVar5 = hVar6;
                                            i17 = i22;
                                        }
                                    } else {
                                        str8 = R02;
                                        hVar5 = hVar6;
                                        str9 = substring;
                                        i17 = i22;
                                        str10 = stringValue;
                                    }
                                    i23 = i24 + 1;
                                    R02 = str8;
                                    substring = str9;
                                    stringValue = str10;
                                    i22 = i17;
                                    hVar6 = hVar5;
                                    z9 = r52;
                                    arrayList10 = arrayList7;
                                }
                            }
                            r52 = 1;
                            if (r52 == 0) {
                            }
                            i23 = i24 + 1;
                            R02 = str8;
                            substring = str9;
                            stringValue = str10;
                            i22 = i17;
                            hVar6 = hVar5;
                            z9 = r52;
                            arrayList10 = arrayList7;
                        }
                        a0.h hVar7 = hVar6;
                        int i25 = i22;
                        i12 = i20;
                        str16 = str18;
                        arrayList10 = arrayList7;
                        i11 = i25;
                        hVar6 = hVar7;
                    }
                    arrayList5 = arrayList10;
                    hVar = hVar6;
                    int i26 = i12;
                    i13 = i11;
                    str3 = str16;
                    queryFinalized2.dispose();
                    i12 = i26;
                }
                if (arrayList9.isEmpty()) {
                    i14 = i13;
                    hVar2 = hVar;
                } else {
                    SQLiteDatabase R2 = R();
                    Locale locale2 = Locale.US;
                    SQLiteCursor queryFinalized3 = R2.queryFinalized("SELECT data, name FROM chats WHERE uid IN(" + TextUtils.join(",", arrayList9) + ")", new Object[0]);
                    while (queryFinalized3.next()) {
                        try {
                            String stringValue2 = queryFinalized3.stringValue(1);
                            String R03 = id.E0().R0(stringValue2);
                            if (stringValue2.equals(R03)) {
                                R03 = null;
                            }
                            int i27 = i13;
                            int i28 = 0;
                            while (i28 < i27) {
                                String str20 = strArr[i28];
                                if (!stringValue2.startsWith(str20)) {
                                    if (!stringValue2.contains(" " + str20)) {
                                        if (R03 != null) {
                                            if (!R03.startsWith(str20)) {
                                            }
                                        }
                                        sQLiteCursor2 = queryFinalized3;
                                        try {
                                            i28++;
                                            queryFinalized3 = sQLiteCursor2;
                                        } catch (Exception e13) {
                                            e = e13;
                                            sQLiteCursor = sQLiteCursor2;
                                            n(e);
                                            if (sQLiteCursor == null) {
                                                sQLiteCursor.dispose();
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            sQLiteCursor = sQLiteCursor2;
                                            if (sQLiteCursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                NativeByteBuffer byteBufferValue2 = queryFinalized3.byteBufferValue(0);
                                if (byteBufferValue2 == null) {
                                    break;
                                }
                                sQLiteCursor2 = queryFinalized3;
                                TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                byteBufferValue2.reuse();
                                if ((i7 != 15 || (arrayList4 != null && arrayList4.contains(Long.valueOf(-TLdeserialize2.id)))) && ((i7 != 6 || !t3.V(TLdeserialize2)) && (i7 != 5 || t3.V(TLdeserialize2)))) {
                                    if (TLdeserialize2.monoforum) {
                                        String i29 = qg.d.i(this.currentAccount, TLdeserialize2, true);
                                        if (i29 == null) {
                                            i29 = "";
                                        }
                                        String lowerCase4 = i29.toLowerCase();
                                        String R04 = id.E0().R0(lowerCase4);
                                        if (lowerCase4.equals(R04)) {
                                            R04 = null;
                                        }
                                        if (!lowerCase4.startsWith(str20)) {
                                            if (!lowerCase4.contains(" " + str20)) {
                                                if (R04 != null) {
                                                    if (!R04.startsWith(str20)) {
                                                        if (R04.contains(" " + str20)) {
                                                        }
                                                    }
                                                }
                                                String str21 = R04;
                                                stringValue2 = lowerCase4;
                                                R03 = str21;
                                            }
                                        }
                                    }
                                    if (!TLdeserialize2.deactivated) {
                                        if (t3.T(TLdeserialize2)) {
                                            if (!t3.r0(TLdeserialize2)) {
                                            }
                                        }
                                        hVar4 = hVar;
                                        jg.d0 d0Var3 = (jg.d0) hVar4.f(-TLdeserialize2.id);
                                        d0Var3.c = g0.r0(TLdeserialize2.monoforum ? qg.d.i(this.currentAccount, TLdeserialize2, false) : TLdeserialize2.title, null, str20);
                                        d0Var3.a = TLdeserialize2;
                                        i12++;
                                        hVar = hVar4;
                                        i13 = i27;
                                        queryFinalized3 = sQLiteCursor2;
                                    }
                                    hVar4 = hVar;
                                    hVar = hVar4;
                                    i13 = i27;
                                    queryFinalized3 = sQLiteCursor2;
                                }
                                i28++;
                                queryFinalized3 = sQLiteCursor2;
                            }
                            sQLiteCursor2 = queryFinalized3;
                            hVar4 = hVar;
                            hVar = hVar4;
                            i13 = i27;
                            queryFinalized3 = sQLiteCursor2;
                        } catch (Exception e14) {
                            e = e14;
                            sQLiteCursor2 = queryFinalized3;
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor2 = queryFinalized3;
                        }
                    }
                    sQLiteCursor2 = queryFinalized3;
                    i14 = i13;
                    hVar2 = hVar;
                    sQLiteCursor2.dispose();
                }
                if (!arrayList5.isEmpty() || i7 == 15) {
                    str4 = " ";
                    str5 = str3;
                } else {
                    SQLiteDatabase R3 = R();
                    Locale locale3 = Locale.US;
                    SQLiteCursor queryFinalized4 = R3.queryFinalized("SELECT q.data, u.name, q.user, q.g, q.authkey, q.ttl, u.data, u.status, q.layer, q.seq_in, q.seq_out, q.use_count, q.exchange_id, q.key_date, q.fprint, q.fauthkey, q.khash, q.in_seq_no, q.admin_id, q.mtproto_seq FROM enc_chats as q INNER JOIN users as u ON q.user = u.uid WHERE q.uid IN(" + TextUtils.join(",", arrayList5) + ")", new Object[0]);
                    while (queryFinalized4.next()) {
                        String stringValue3 = queryFinalized4.stringValue(1);
                        String R05 = id.E0().R0(stringValue3);
                        if (stringValue3.equals(R05)) {
                            R05 = null;
                        }
                        String str22 = str3;
                        int lastIndexOf2 = stringValue3.lastIndexOf(str22);
                        String substring2 = lastIndexOf2 != -1 ? stringValue3.substring(lastIndexOf2 + 2) : null;
                        int i30 = 0;
                        char c10 = 0;
                        while (true) {
                            if (i30 >= i14) {
                                break;
                            }
                            String str23 = strArr[i30];
                            if (!stringValue3.startsWith(str23)) {
                                if (!stringValue3.contains(str17 + str23)) {
                                    if (R05 != null) {
                                        if (!R05.startsWith(str23)) {
                                            if (R05.contains(str17 + str23)) {
                                            }
                                        }
                                    }
                                    if (substring2 != null && substring2.startsWith(str23)) {
                                        c10 = 2;
                                    }
                                    if (c10 == 0) {
                                        NativeByteBuffer byteBufferValue3 = queryFinalized4.byteBufferValue(0);
                                        if (byteBufferValue3 != null) {
                                            encryptedChat = TLRPC.EncryptedChat.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                            byteBufferValue3.reuse();
                                        } else {
                                            encryptedChat = null;
                                        }
                                        NativeByteBuffer byteBufferValue4 = queryFinalized4.byteBufferValue(6);
                                        if (byteBufferValue4 != null) {
                                            user = TLRPC.User.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(false), false);
                                            byteBufferValue4.reuse();
                                        } else {
                                            user = null;
                                        }
                                        if (encryptedChat != null && user != null) {
                                            str7 = str17;
                                            jg.d0 d0Var4 = (jg.d0) hVar2.f(m5.F(encryptedChat.id));
                                            encryptedChat.user_id = queryFinalized4.longValue(2);
                                            encryptedChat.a_or_b = queryFinalized4.byteArrayValue(3);
                                            encryptedChat.auth_key = queryFinalized4.byteArrayValue(4);
                                            encryptedChat.ttl = queryFinalized4.intValue(5);
                                            encryptedChat.layer = queryFinalized4.intValue(8);
                                            encryptedChat.seq_in = queryFinalized4.intValue(9);
                                            encryptedChat.seq_out = queryFinalized4.intValue(10);
                                            int intValue = queryFinalized4.intValue(11);
                                            encryptedChat.key_use_count_in = (short) (intValue >> 16);
                                            encryptedChat.key_use_count_out = (short) intValue;
                                            encryptedChat.exchange_id = queryFinalized4.longValue(12);
                                            encryptedChat.key_create_date = queryFinalized4.intValue(13);
                                            encryptedChat.future_key_fingerprint = queryFinalized4.longValue(14);
                                            encryptedChat.future_auth_key = queryFinalized4.byteArrayValue(15);
                                            encryptedChat.key_hash = queryFinalized4.byteArrayValue(16);
                                            encryptedChat.in_seq_no = queryFinalized4.intValue(17);
                                            long longValue2 = queryFinalized4.longValue(18);
                                            if (longValue2 != 0) {
                                                encryptedChat.admin_id = longValue2;
                                            }
                                            encryptedChat.mtproto_seq = queryFinalized4.intValue(19);
                                            TLRPC.UserStatus userStatus = user.status;
                                            if (userStatus != null) {
                                                userStatus.expires = queryFinalized4.intValue(7);
                                            }
                                            if (c10 == 1) {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(g5.n(user.first_name, user.last_name));
                                                d0Var4.c = spannableStringBuilder;
                                                spannableStringBuilder.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Z8)), 0, d0Var4.c.length(), 33);
                                            } else {
                                                d0Var4.c = g0.r0("@" + t10.n(user), null, "@" + str23);
                                            }
                                            d0Var4.a = encryptedChat;
                                            arrayList3.add(user);
                                            i12++;
                                        }
                                    } else {
                                        i30++;
                                        str17 = str17;
                                    }
                                }
                            }
                            c10 = 1;
                            if (c10 == 0) {
                            }
                        }
                        str7 = str17;
                        str3 = str22;
                        str17 = str7;
                    }
                    str4 = str17;
                    str5 = str3;
                    queryFinalized4.dispose();
                }
                arrayList6 = new ArrayList(i12);
                for (i15 = 0; i15 < hVar2.m(); i15++) {
                    jg.d0 d0Var5 = (jg.d0) hVar2.n(i15);
                    if (d0Var5.a != null && d0Var5.c != null) {
                        arrayList6.add(d0Var5);
                    }
                }
                Collections.sort(arrayList6, new jl(12));
                for (i16 = 0; i16 < arrayList6.size(); i16++) {
                    jg.d0 d0Var6 = (jg.d0) arrayList6.get(i16);
                    arrayList.add(d0Var6.a);
                    arrayList2.add(d0Var6.c);
                }
                if (i7 == 2 || i7 == 15 || i7 == 6 || i7 == 5) {
                    return;
                }
                queryFinalized = R().queryFinalized("SELECT u.data, u.status, u.name, u.uid FROM users as u INNER JOIN contacts as c ON u.uid = c.uid", new Object[0]);
                while (queryFinalized.next()) {
                    if (hVar2.h(queryFinalized.longValue(3)) < 0) {
                        String stringValue4 = queryFinalized.stringValue(2);
                        String R06 = id.E0().R0(stringValue4);
                        if (stringValue4.equals(R06)) {
                            R06 = null;
                        }
                        int lastIndexOf3 = stringValue4.lastIndexOf(str5);
                        String substring3 = lastIndexOf3 != -1 ? stringValue4.substring(lastIndexOf3 + 3) : null;
                        int i31 = 0;
                        boolean z10 = false;
                        while (true) {
                            if (i31 >= i14) {
                                hVar3 = hVar2;
                                str6 = str4;
                                break;
                            }
                            String str24 = strArr[i31];
                            if (stringValue4.startsWith(str24)) {
                                hVar3 = hVar2;
                                str6 = str4;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                hVar3 = hVar2;
                                str6 = str4;
                                sb2.append(str6);
                                sb2.append(str24);
                                if (!stringValue4.contains(sb2.toString())) {
                                    if (R06 != null) {
                                        if (!R06.startsWith(str24)) {
                                            if (R06.contains(str6 + str24)) {
                                            }
                                        }
                                    }
                                    if (substring3 != null && substring3.startsWith(str24)) {
                                        z10 = 2;
                                    }
                                    if (z10) {
                                        i31++;
                                        str4 = str6;
                                        hVar2 = hVar3;
                                    } else {
                                        NativeByteBuffer byteBufferValue5 = queryFinalized.byteBufferValue(0);
                                        if (byteBufferValue5 != null) {
                                            TLRPC.User TLdeserialize3 = TLRPC.User.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(false), false);
                                            byteBufferValue5.reuse();
                                            TLRPC.UserStatus userStatus2 = TLdeserialize3.status;
                                            if (userStatus2 != null) {
                                                userStatus2.expires = queryFinalized.intValue(1);
                                            }
                                            if (z10) {
                                                arrayList2.add(g0.r0(TLdeserialize3.first_name, TLdeserialize3.last_name, str24));
                                                obj = null;
                                            } else {
                                                obj = null;
                                                arrayList2.add(g0.r0("@" + t10.n(TLdeserialize3), null, "@" + str24));
                                            }
                                            arrayList.add(TLdeserialize3);
                                        }
                                    }
                                }
                            }
                            z10 = true;
                            if (z10) {
                            }
                        }
                        str4 = str6;
                        hVar2 = hVar3;
                    }
                }
                queryFinalized.dispose();
                return;
            }
            TLRPC.User f10 = p10.i(this.currentAccount).f();
            jg.d0 d0Var7 = new jg.d0();
            d0Var7.b = ConnectionsManager.DEFAULT_DATACENTER_ID;
            d0Var7.c = lowerCase2;
            d0Var7.a = f10;
            hVar6.k(d0Var7, f10.id);
            i12 = 1;
            if (i7 != 4) {
                a22 = getMessagesController().a2(708513L);
                if (a22 == null) {
                }
                if (a22 != null) {
                }
                String str162 = ";;;";
                String str172 = " ";
                if (arrayList8.isEmpty()) {
                }
                if (arrayList9.isEmpty()) {
                }
                if (arrayList5.isEmpty()) {
                }
                str4 = " ";
                str5 = str3;
                arrayList6 = new ArrayList(i12);
                while (i15 < hVar2.m()) {
                }
                Collections.sort(arrayList6, new jl(12));
                while (i16 < arrayList6.size()) {
                }
                if (i7 == 2) {
                    return;
                } else {
                    return;
                }
            }
            a22 = getMessagesController().a2(708513L);
            if (a22 == null) {
            }
            if (a22 != null) {
            }
            String str1622 = ";;;";
            String str1722 = " ";
            if (arrayList8.isEmpty()) {
            }
            if (arrayList9.isEmpty()) {
            }
            if (arrayList5.isEmpty()) {
            }
            str4 = " ";
            str5 = str3;
            arrayList6 = new ArrayList(i12);
            while (i15 < hVar2.m()) {
            }
            Collections.sort(arrayList6, new jl(12));
            while (i16 < arrayList6.size()) {
            }
            if (i7 == 2) {
            }
        } catch (Exception e15) {
            e = e15;
            sQLiteCursor = null;
        } catch (Throwable th7) {
            th = th7;
            sQLiteCursor = null;
        }
    }

    public final void M1(long j3, TLRPC.TL_chatBannedRights tL_chatBannedRights, int i7) {
        if (tL_chatBannedRights == null || j3 == 0) {
            return;
        }
        this.a.c(new hk(this, j3, i7, tL_chatBannedRights, 7));
    }

    public final int N(long j3) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Integer[] numArr = {0};
        this.a.c(new jm(this, j3, numArr, countDownLatch, 13));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return numArr[0].intValue();
    }

    public final void N0(int i7, TLRPC.Message message) {
        this.a.c(new l7(this, i7, message, 1));
    }

    public final void N1(TLRPC.ChatFull chatFull, boolean z9) {
        this.a.c(new yf(this, chatFull, z9, 11));
    }

    public final TLRPC.Chat O(long j3) {
        try {
            ArrayList arrayList = new ArrayList();
            Q("" + j3, arrayList);
            if (arrayList.isEmpty()) {
                return null;
            }
            return (TLRPC.Chat) arrayList.get(0);
        } catch (Exception e10) {
            o(e10, true);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01be  */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O0(String str, String str2, long j3, long j10, int i7, boolean z9) {
        SQLitePreparedStatement sQLitePreparedStatement;
        ?? r82;
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor;
        Throwable th2;
        boolean z10;
        NativeByteBuffer byteBufferValue;
        boolean z11;
        TLRPC.Message message;
        SQLitePreparedStatement executeFast;
        int i10 = 0;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        while (i10 < 2) {
            boolean z12 = i10 == 1;
            if (!z12 || j10 != 0) {
                if (z12) {
                    try {
                        SQLiteDatabase sQLiteDatabase = getMessagesStorage().b;
                        Locale locale = Locale.ENGLISH;
                        SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("UPDATE " + str2 + " SET state = 0 WHERE message_id = ? AND dialog_id = ? AND topic_id = ? ");
                        executeFast2.bindInteger(1, i7);
                        executeFast2.bindLong(2, j3);
                        executeFast2.bindLong(3, j10);
                        executeFast2.step();
                        executeFast2.dispose();
                        SQLiteDatabase sQLiteDatabase2 = this.b;
                        Locale locale2 = Locale.US;
                        r82 = 0;
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_topics WHERE uid = " + j3 + " AND mid = " + i7, new Object[0]);
                    } catch (SQLiteException e10) {
                        e = e10;
                        sQLitePreparedStatement = sQLitePreparedStatement2;
                        z10 = true;
                        sQLiteCursor = null;
                        o(e, z10);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor == null) {
                        }
                    }
                } else {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase3 = getMessagesStorage().b;
                            Locale locale3 = Locale.ENGLISH;
                            sQLitePreparedStatement = sQLiteDatabase3.executeFast("UPDATE " + str + " SET state = 0 WHERE message_id = ? AND dialog_id = ?");
                            try {
                                try {
                                    sQLitePreparedStatement.bindInteger(1, i7);
                                    sQLitePreparedStatement.bindLong(2, j3);
                                    sQLitePreparedStatement.step();
                                    sQLitePreparedStatement.dispose();
                                } catch (SQLiteException e11) {
                                    e = e11;
                                    z10 = true;
                                    sQLiteCursor = null;
                                    try {
                                        o(e, z10);
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLiteCursor == null) {
                                            sQLiteCursor.dispose();
                                            return;
                                        }
                                        return;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        sQLitePreparedStatement = sQLitePreparedStatement2;
                    }
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabase4 = this.b;
                            Locale locale4 = Locale.US;
                            queryFinalized = sQLiteDatabase4.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j3 + " AND mid = " + i7, new Object[0]);
                            r82 = 0;
                        } catch (SQLiteException e13) {
                            e = e13;
                            z10 = true;
                            sQLitePreparedStatement = null;
                            sQLiteCursor = null;
                            o(e, z10);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor == null) {
                            }
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        sQLitePreparedStatement = null;
                        sQLiteCursor = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        throw th2;
                    }
                }
                SQLiteCursor sQLiteCursor2 = queryFinalized;
                if (z9) {
                    try {
                        if (sQLiteCursor2.next() && (byteBufferValue = sQLiteCursor2.byteBufferValue(r82)) != 0) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r82), r82);
                            z11 = z12;
                            TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                            byteBufferValue.reuse();
                            TLRPC.TL_messageReactions tL_messageReactions = TLdeserialize.reactions;
                            if (tL_messageReactions != null && tL_messageReactions.recent_reactions != null) {
                                for (int i11 = 0; i11 < TLdeserialize.reactions.recent_reactions.size(); i11++) {
                                    TLdeserialize.reactions.recent_reactions.get(i11).unread = false;
                                }
                            }
                            message = TLdeserialize;
                            sQLiteCursor2.dispose();
                            if (message == null) {
                                if (z11) {
                                    SQLiteDatabase sQLiteDatabase5 = getMessagesStorage().b;
                                    Locale locale5 = Locale.US;
                                    executeFast = sQLiteDatabase5.executeFast("UPDATE messages_topics SET data = ? WHERE uid = " + j3 + " AND mid = " + i7);
                                } else {
                                    try {
                                        SQLiteDatabase sQLiteDatabase6 = getMessagesStorage().b;
                                        Locale locale6 = Locale.US;
                                        executeFast = sQLiteDatabase6.executeFast("UPDATE messages_v2 SET data = ? WHERE uid = " + j3 + " AND mid = " + i7);
                                    } catch (SQLiteException e14) {
                                        e = e14;
                                        sQLitePreparedStatement = null;
                                        z10 = true;
                                        sQLiteCursor = null;
                                        o(e, z10);
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor == null) {
                                        }
                                    }
                                }
                                sQLitePreparedStatement = executeFast;
                                try {
                                    ij.r5(message);
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                    message.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer);
                                    sQLitePreparedStatement.step();
                                    sQLitePreparedStatement.dispose();
                                    nativeByteBuffer.reuse();
                                } catch (Exception e15) {
                                    try {
                                        a8.g(e15, true);
                                    } catch (SQLiteException e16) {
                                        e = e16;
                                        z10 = true;
                                        sQLiteCursor = null;
                                        o(e, z10);
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        if (sQLiteCursor == null) {
                                        }
                                    }
                                }
                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                            } else {
                                sQLitePreparedStatement2 = null;
                            }
                        }
                    } catch (SQLiteException e17) {
                        e = e17;
                        sQLiteCursor = sQLiteCursor2;
                        sQLitePreparedStatement = null;
                        z10 = true;
                        o(e, z10);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor == null) {
                        }
                    } catch (Throwable th7) {
                        th2 = th7;
                        sQLiteCursor = sQLiteCursor2;
                        sQLitePreparedStatement = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        throw th2;
                    }
                }
                z11 = z12;
                message = null;
                sQLiteCursor2.dispose();
                if (message == null) {
                }
            }
            i10++;
        }
        if (sQLitePreparedStatement2 != null) {
            sQLitePreparedStatement2.dispose();
        }
    }

    public final void O1(TLRPC.ChatParticipants chatParticipants) {
        if (chatParticipants == null) {
            return;
        }
        this.a.c(new hi(29, this, chatParticipants));
    }

    public final TLRPC.Chat P(long j3) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.Chat[] chatArr = new TLRPC.Chat[1];
        this.a.c(new jm(this, chatArr, j3, countDownLatch, 14));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return chatArr[0];
    }

    public final ArrayList P0(long j3, ArrayList arrayList, boolean z9, boolean z10, int i7, int i10) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (!z9) {
            return Q0(i7, i10, j3, arrayList, z10);
        }
        this.a.c(new rp(this, j3, arrayList, z10, i7, i10));
        return null;
    }

    public final void P1(int i7) {
        g0.h3(new rq(this, 4));
        a8.b("MessagesStorage start db migration from " + i7 + " to 181");
        a8.b("MessagesStorage db migration finished to varsion " + l5.c(this, this.b, i7));
        g0.h3(new rq(this, 5));
    }

    public final void Q(String str, ArrayList arrayList) {
        if (str == null || str.length() == 0 || arrayList == null) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a8.p0.p("SELECT data FROM chats WHERE uid IN(", str, ")"), new Object[0]);
        ArrayList arrayList2 = null;
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false, true);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        arrayList.add(TLdeserialize);
                        if (TLdeserialize.linked_monoforum_id != 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(Long.valueOf(TLdeserialize.linked_monoforum_id));
                        }
                        if (TLdeserialize.linked_community_id != 0) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(Long.valueOf(TLdeserialize.linked_community_id));
                        }
                    }
                }
            } catch (Exception e10) {
                o(e10, true);
            }
        }
        queryFinalized.dispose();
        if (arrayList2 != null) {
            SQLiteDatabase sQLiteDatabase2 = this.b;
            Locale locale2 = Locale.US;
            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized(a8.p0.p("SELECT data FROM chats WHERE uid IN(", TextUtils.join(", ", arrayList2), ")"), new Object[0]);
            while (queryFinalized2.next()) {
                try {
                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(0);
                    if (byteBufferValue2 != null) {
                        TLRPC.Chat TLdeserialize2 = TLRPC.Chat.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false, true);
                        byteBufferValue2.reuse();
                        if (TLdeserialize2 != null) {
                            arrayList.add(TLdeserialize2);
                        }
                    }
                } catch (Exception e11) {
                    o(e11, true);
                }
            }
            queryFinalized2.dispose();
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x037c -> B:55:0x01d1). Please report as a decompilation issue!!! */
    public final java.util.ArrayList Q0(int r47, int r48, long r49, java.util.ArrayList r51, boolean r52) {
        /*
            Method dump skipped, instructions count: 4095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yr.Q0(int, int, long, java.util.ArrayList, boolean):java.util.ArrayList");
    }

    public final void Q1(long j3, int i7, boolean z9, boolean z10) {
        this.a.c(new xq(this, z9, z10 ? "unread_reactions" : "unread_poll_votes", j3, i7, z10 ? "unread_reactions" : "unread_poll_votes"));
    }

    public final SQLiteDatabase R() {
        return this.b;
    }

    public final void R0(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray) {
        this.a.c(new em(this, longSparseIntArray, longSparseIntArray2, sparseIntArray, 19));
    }

    public final void R1(long j3, long j10, ArrayList arrayList, ArrayList arrayList2) {
        I(new l9(this, j3, j10, arrayList, arrayList2, 6));
    }

    public final long S() {
        File file = this.c;
        long length = file != null ? file.length() : 0L;
        File file2 = this.e;
        return file2 != null ? file2.length() + length : length;
    }

    public final void S0(int i7, int i10, long j3, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.a.c(new b1(i10, i7, j3, arrayList, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0496  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1(long j3, long j10, ArrayList arrayList, ArrayList arrayList2) {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        SQLiteDatabase sQLiteDatabase;
        boolean z9;
        SQLiteDatabase sQLiteDatabase2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        SQLitePreparedStatement sQLitePreparedStatement2;
        ArrayList arrayList7;
        TLRPC.TL_messages_dialogs tL_messages_dialogs;
        SQLiteCursor sQLiteCursor2;
        ArrayList arrayList8;
        SQLiteCursor sQLiteCursor3;
        TLRPC.TL_messages_dialogs tL_messages_dialogs2;
        TLRPC.Dialog dialog;
        ArrayList arrayList9;
        TLRPC.TL_dialog tL_dialog;
        SQLitePreparedStatement executeFast;
        try {
            ArrayList arrayList10 = new ArrayList();
            try {
                try {
                    if (arrayList.isEmpty()) {
                        arrayList3 = arrayList10;
                        arrayList3.add(Long.valueOf(-j10));
                    } else {
                        if (j10 != 0) {
                            arrayList10.add(Long.valueOf(-j10));
                            executeFast = this.b.executeFast("UPDATE dialogs SET (last_mid, last_mid_group) = (SELECT mid, group_id FROM messages_v2 WHERE uid = ? AND date = (SELECT MAX(date) FROM messages_v2 WHERE uid = ?)) WHERE did = ?");
                        } else {
                            if (j3 == 0) {
                                String join = TextUtils.join(",", arrayList);
                                SQLiteDatabase sQLiteDatabase3 = this.b;
                                Locale locale = Locale.US;
                                SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT did FROM dialogs WHERE last_mid IN(" + join + ") AND flags = 0", new Object[0]);
                                while (queryFinalized.next()) {
                                    try {
                                        arrayList10.add(Long.valueOf(queryFinalized.longValue(0)));
                                    } catch (Exception e10) {
                                        e = e10;
                                        sQLiteCursor = queryFinalized;
                                        z9 = true;
                                        sQLitePreparedStatement = null;
                                        try {
                                            o(e, z9);
                                            sQLiteDatabase2 = this.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement == null) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase = this.b;
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.commitTransaction();
                                            }
                                            if (sQLiteCursor != null) {
                                                sQLiteCursor.dispose();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                                sQLitePreparedStatement.dispose();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLiteCursor = queryFinalized;
                                        sQLitePreparedStatement = null;
                                        sQLiteDatabase = this.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                queryFinalized.dispose();
                            } else {
                                arrayList10.add(Long.valueOf(j3));
                            }
                            executeFast = this.b.executeFast("UPDATE dialogs SET (last_mid, last_mid_group) = (SELECT mid, group_id FROM messages_v2 WHERE uid = ? AND date = (SELECT MAX(date) FROM messages_v2 WHERE uid = ? AND date != 0)) WHERE did = ?");
                        }
                        try {
                            this.b.beginTransaction();
                            int i7 = 0;
                            while (i7 < arrayList10.size()) {
                                long longValue = ((Long) arrayList10.get(i7)).longValue();
                                executeFast.requery();
                                executeFast.bindLong(1, longValue);
                                executeFast.bindLong(2, longValue);
                                executeFast.bindLong(3, longValue);
                                executeFast.step();
                                i7++;
                                arrayList10 = arrayList10;
                            }
                            ArrayList arrayList11 = arrayList10;
                            executeFast.dispose();
                            this.b.commitTransaction();
                            arrayList3 = arrayList11;
                        } catch (Exception e11) {
                            e = e11;
                            sQLitePreparedStatement = executeFast;
                            z9 = true;
                            sQLiteCursor = null;
                            o(e, z9);
                            sQLiteDatabase2 = this.b;
                            if (sQLiteDatabase2 != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement == null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = null;
                            sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    if (arrayList2 != null) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            Long l10 = (Long) arrayList2.get(i10);
                            if (!arrayList3.contains(l10)) {
                                arrayList3.add(l10);
                            }
                        }
                    }
                    String join2 = TextUtils.join(",", arrayList3);
                    TLRPC.TL_messages_dialogs tL_messages_dialogs3 = new TLRPC.TL_messages_dialogs();
                    ArrayList arrayList12 = new ArrayList();
                    arrayList4 = new ArrayList();
                    arrayList5 = new ArrayList();
                    arrayList6 = new ArrayList();
                    a0.h hVar = new a0.h();
                    SQLiteDatabase sQLiteDatabase4 = this.b;
                    Locale locale2 = Locale.US;
                    int i11 = 0;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase4.queryFinalized("SELECT d.did, d.last_mid, d.unread_count, d.date, m.data, m.read_state, m.mid, m.send_state, m.date, d.pts, d.inbox_max, d.outbox_max, d.pinned, d.unread_count_i, d.flags, d.folder_id, d.data, d.unread_reactions, d.last_mid_group, d.ttl_period, d.unread_poll_votes FROM dialogs as d LEFT JOIN messages_v2 as m ON d.last_mid = m.mid AND d.did = m.uid AND d.last_mid_group IS NULL WHERE d.did IN(" + join2 + ")", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            arrayList9 = arrayList12;
                        } catch (Exception e12) {
                            e = e12;
                            sQLitePreparedStatement2 = null;
                            sQLiteCursor = queryFinalized2;
                        } catch (Throwable th5) {
                            th = th5;
                            sQLitePreparedStatement2 = null;
                            sQLiteCursor = queryFinalized2;
                        }
                        try {
                            long longValue2 = queryFinalized2.longValue(i11);
                            if (m5.D(longValue2)) {
                                TLRPC.TL_dialogFolder tL_dialogFolder = new TLRPC.TL_dialogFolder();
                                tL_dialog = tL_dialogFolder;
                                if (!queryFinalized2.isNull(16)) {
                                    NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(16);
                                    if (byteBufferValue != null) {
                                        tL_dialogFolder.folder = TLRPC.TL_folder.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                        byteBufferValue.reuse();
                                        tL_dialog = tL_dialogFolder;
                                    } else {
                                        TLRPC.TL_folder tL_folder = new TLRPC.TL_folder();
                                        tL_dialogFolder.folder = tL_folder;
                                        tL_folder.id = queryFinalized2.intValue(15);
                                        tL_dialog = tL_dialogFolder;
                                    }
                                }
                            } else {
                                tL_dialog = new TLRPC.TL_dialog();
                            }
                            tL_dialog.id = longValue2;
                            tL_dialog.top_message = queryFinalized2.intValue(1);
                            tL_dialog.read_inbox_max_id = queryFinalized2.intValue(10);
                            tL_dialog.read_outbox_max_id = queryFinalized2.intValue(11);
                            tL_dialog.unread_count = queryFinalized2.intValue(2);
                            tL_dialog.unread_mentions_count = queryFinalized2.intValue(13);
                            tL_dialog.last_message_date = queryFinalized2.intValue(3);
                            tL_dialog.pts = queryFinalized2.intValue(9);
                            tL_dialog.flags = j10 == 0 ? 0 : 1;
                            int intValue = queryFinalized2.intValue(12);
                            tL_dialog.pinnedNum = intValue;
                            tL_dialog.pinned = intValue != 0;
                            int intValue2 = queryFinalized2.intValue(14);
                            tL_dialog.unread_mark = (intValue2 & 1) != 0;
                            tL_dialog.view_forum_as_messages = (intValue2 & 64) != 0;
                            tL_dialog.folder_id = queryFinalized2.intValue(15);
                            tL_dialog.unread_reactions_count = queryFinalized2.intValue(17);
                            long longValue3 = queryFinalized2.longValue(18);
                            if (longValue3 != 0) {
                                hVar.k(Long.valueOf(longValue3), longValue2);
                            }
                            tL_dialog.ttl_period = queryFinalized2.intValue(19);
                            tL_dialog.unread_poll_votes_count = queryFinalized2.intValue(20);
                            tL_messages_dialogs3.dialogs.add(tL_dialog);
                            NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(4);
                            if (byteBufferValue2 != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                TLdeserialize.readAttachPath(byteBufferValue2, getUserConfig().n);
                                byteBufferValue2.reuse();
                                ij.N5(queryFinalized2.intValue(5), TLdeserialize);
                                TLdeserialize.id = queryFinalized2.intValue(6);
                                TLdeserialize.send_state = queryFinalized2.intValue(7);
                                int intValue3 = queryFinalized2.intValue(8);
                                if (intValue3 != 0) {
                                    tL_dialog.last_message_date = intValue3;
                                }
                                TLdeserialize.dialog_id = tL_dialog.id;
                                tL_messages_dialogs3.messages.add(TLdeserialize);
                                e(TLdeserialize, arrayList4, arrayList5, null);
                            }
                            if (!m5.C(longValue2) && tL_dialog.read_inbox_max_id > tL_dialog.top_message) {
                                tL_dialog.read_inbox_max_id = 0;
                            }
                            if (m5.C(longValue2)) {
                                int i12 = (int) (4294967295L & longValue2);
                                if (!arrayList6.contains(Integer.valueOf(i12))) {
                                    arrayList6.add(Integer.valueOf(i12));
                                }
                            } else if (!m5.E(longValue2)) {
                                long j11 = -longValue2;
                                if (!arrayList5.contains(Long.valueOf(j11))) {
                                    arrayList5.add(Long.valueOf(j11));
                                }
                            } else if (!arrayList4.contains(Long.valueOf(longValue2))) {
                                arrayList4.add(Long.valueOf(longValue2));
                            }
                            arrayList12 = arrayList9;
                            i11 = 0;
                        } catch (Exception e13) {
                            e = e13;
                            sQLiteCursor = queryFinalized2;
                            sQLitePreparedStatement = null;
                            z9 = true;
                            o(e, z9);
                            sQLiteDatabase2 = this.b;
                            if (sQLiteDatabase2 != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement == null) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor = queryFinalized2;
                            sQLitePreparedStatement = null;
                            sQLiteDatabase = this.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    arrayList7 = arrayList12;
                    queryFinalized2.dispose();
                    if (hVar.i()) {
                        tL_messages_dialogs = tL_messages_dialogs3;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor2 = null;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = 0;
                        while (i13 < hVar.m()) {
                            try {
                                sb2.append("uid = ");
                                sb2.append(hVar.j(i13));
                                sb2.append(" AND group_id = ");
                                sb2.append(hVar.n(i13));
                                i13++;
                                if (i13 < hVar.m()) {
                                    sb2.append(" OR ");
                                }
                            } catch (Exception e14) {
                                e = e14;
                                sQLitePreparedStatement = null;
                                z9 = true;
                                sQLiteCursor = null;
                                o(e, z9);
                                sQLiteDatabase2 = this.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement == null) {
                                    sQLitePreparedStatement.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        SQLiteDatabase sQLiteDatabase5 = this.b;
                        Locale locale3 = Locale.US;
                        int i14 = 0;
                        SQLiteCursor queryFinalized3 = sQLiteDatabase5.queryFinalized("SELECT uid, data, read_state, mid, send_state, date, group_id FROM messages_v2 WHERE " + ((Object) sb2), new Object[0]);
                        while (queryFinalized3.next()) {
                            try {
                                long longValue4 = queryFinalized3.longValue(i14);
                                int i15 = 0;
                                while (true) {
                                    if (i15 >= tL_messages_dialogs3.dialogs.size()) {
                                        tL_messages_dialogs2 = tL_messages_dialogs3;
                                        dialog = null;
                                        break;
                                    }
                                    try {
                                        dialog = tL_messages_dialogs3.dialogs.get(i15);
                                        if (dialog != null) {
                                            tL_messages_dialogs2 = tL_messages_dialogs3;
                                            if (dialog.id == longValue4) {
                                                break;
                                            }
                                        } else {
                                            tL_messages_dialogs2 = tL_messages_dialogs3;
                                        }
                                        i15++;
                                        tL_messages_dialogs3 = tL_messages_dialogs2;
                                    } catch (Exception e15) {
                                        e = e15;
                                        sQLiteCursor = queryFinalized3;
                                        sQLitePreparedStatement = null;
                                        z9 = true;
                                        o(e, z9);
                                        sQLiteDatabase2 = this.b;
                                        if (sQLiteDatabase2 != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement == null) {
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLiteCursor = queryFinalized3;
                                        sQLitePreparedStatement = null;
                                        sQLiteDatabase = this.b;
                                        if (sQLiteDatabase != null) {
                                        }
                                        if (sQLiteCursor != null) {
                                        }
                                        if (sQLitePreparedStatement != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (dialog != null) {
                                    NativeByteBuffer byteBufferValue3 = queryFinalized3.byteBufferValue(1);
                                    if (byteBufferValue3 != null) {
                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                        TLdeserialize2.readAttachPath(byteBufferValue3, getUserConfig().n);
                                        byteBufferValue3.reuse();
                                        ij.N5(queryFinalized3.intValue(2), TLdeserialize2);
                                        TLdeserialize2.id = queryFinalized3.intValue(3);
                                        TLdeserialize2.send_state = queryFinalized3.intValue(4);
                                        int intValue4 = queryFinalized3.intValue(5);
                                        if (intValue4 != 0) {
                                            dialog.last_message_date = intValue4;
                                        }
                                        sQLiteCursor3 = queryFinalized3;
                                        try {
                                            TLdeserialize2.dialog_id = dialog.id;
                                            tL_messages_dialogs2.messages.add(TLdeserialize2);
                                            sQLitePreparedStatement2 = null;
                                        } catch (Exception e16) {
                                            e = e16;
                                            sQLitePreparedStatement2 = null;
                                            sQLiteCursor = sQLiteCursor3;
                                            sQLitePreparedStatement = sQLitePreparedStatement2;
                                            z9 = true;
                                            o(e, z9);
                                            sQLiteDatabase2 = this.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement == null) {
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            sQLitePreparedStatement2 = null;
                                            sQLiteCursor = sQLiteCursor3;
                                            sQLitePreparedStatement = sQLitePreparedStatement2;
                                            sQLiteDatabase = this.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                        try {
                                            e(TLdeserialize2, arrayList4, arrayList5, null);
                                        } catch (Exception e17) {
                                            e = e17;
                                            sQLiteCursor = sQLiteCursor3;
                                            sQLitePreparedStatement = sQLitePreparedStatement2;
                                            z9 = true;
                                            o(e, z9);
                                            sQLiteDatabase2 = this.b;
                                            if (sQLiteDatabase2 != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement == null) {
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            sQLiteCursor = sQLiteCursor3;
                                            sQLitePreparedStatement = sQLitePreparedStatement2;
                                            sQLiteDatabase = this.b;
                                            if (sQLiteDatabase != null) {
                                            }
                                            if (sQLiteCursor != null) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        sQLiteCursor3 = queryFinalized3;
                                    }
                                    queryFinalized3 = sQLiteCursor3;
                                }
                                tL_messages_dialogs3 = tL_messages_dialogs2;
                                i14 = 0;
                            } catch (Exception e18) {
                                e = e18;
                                sQLiteCursor3 = queryFinalized3;
                            } catch (Throwable th10) {
                                th = th10;
                                sQLiteCursor3 = queryFinalized3;
                            }
                        }
                        sQLiteCursor3 = queryFinalized3;
                        tL_messages_dialogs = tL_messages_dialogs3;
                        sQLitePreparedStatement2 = null;
                        sQLiteCursor3.dispose();
                        sQLiteCursor2 = sQLiteCursor3;
                    }
                } catch (Exception e19) {
                    e = e19;
                    z9 = true;
                    sQLitePreparedStatement = null;
                }
            } catch (Throwable th11) {
                th = th11;
                sQLitePreparedStatement = null;
            }
            try {
                if (arrayList6.isEmpty()) {
                    arrayList8 = arrayList7;
                } else {
                    arrayList8 = arrayList7;
                    V(TextUtils.join(",", arrayList6), arrayList8, arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    Q(TextUtils.join(",", arrayList5), tL_messages_dialogs.chats);
                }
                if (!arrayList4.isEmpty()) {
                    n0(arrayList4, tL_messages_dialogs.users, false);
                }
                getMessagesController().q7.E(arrayList, j3);
                if (!tL_messages_dialogs.dialogs.isEmpty() || !arrayList8.isEmpty()) {
                    qp messagesController = getMessagesController();
                    messagesController.getClass();
                    Utilities.d.c(new yf((Object) messagesController, (Object) tL_messages_dialogs, true, 1));
                }
                SQLiteDatabase sQLiteDatabase6 = this.b;
                if (sQLiteDatabase6 != null) {
                    sQLiteDatabase6.commitTransaction();
                }
                if (sQLiteCursor2 != null) {
                    sQLiteCursor2.dispose();
                }
            } catch (Exception e20) {
                e = e20;
                sQLitePreparedStatement = sQLitePreparedStatement2;
                sQLiteCursor = sQLiteCursor2;
                z9 = true;
                o(e, z9);
                sQLiteDatabase2 = this.b;
                if (sQLiteDatabase2 != null) {
                }
                if (sQLiteCursor != null) {
                }
                if (sQLitePreparedStatement == null) {
                }
            } catch (Throwable th12) {
                th = th12;
                sQLitePreparedStatement = sQLitePreparedStatement2;
                sQLiteCursor = sQLiteCursor2;
                sQLiteDatabase = this.b;
                if (sQLiteDatabase != null) {
                }
                if (sQLiteCursor != null) {
                }
                if (sQLitePreparedStatement != null) {
                }
                throw th;
            }
        } catch (Exception e21) {
            e = e21;
            sQLitePreparedStatement = null;
            sQLiteCursor = null;
        } catch (Throwable th13) {
            th = th13;
            sQLitePreparedStatement = null;
            sQLiteCursor = null;
        }
    }

    public final int T(long j3) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                if (this.J.f(j3) == null) {
                    sQLiteCursor = this.b.queryFinalized("SELECT folder_id FROM dialogs WHERE did = ?", Long.valueOf(j3));
                    r4 = sQLiteCursor.next() ? sQLiteCursor.intValue(0) : -1;
                    sQLiteCursor.dispose();
                }
                return r4;
            } catch (Exception e10) {
                o(e10, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return 0;
            }
        } finally {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T0(int i7, long j3, ArrayList arrayList) {
        Exception exc;
        Throwable th2;
        SQLiteCursor sQLiteCursor = null;
        try {
            String join = TextUtils.join(",", arrayList);
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.US;
            try {
                sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 2 WHERE mid IN (" + join + ") AND uid = " + j3).stepThis().dispose();
                if (i7 == 0) {
                    return;
                }
                SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT mid, ttl FROM messages_v2 WHERE mid IN (" + join + ") AND uid = " + j3 + " AND ttl > 0", new Object[0]);
                ArrayList arrayList2 = null;
                while (queryFinalized.next()) {
                    try {
                        if (arrayList2 == null) {
                            try {
                                arrayList2 = new ArrayList();
                            } catch (Exception e10) {
                                exc = e10;
                                sQLiteCursor = queryFinalized;
                                try {
                                    o(exc, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th3) {
                                    th = th3;
                                    th2 = th;
                                    if (sQLiteCursor == null) {
                                        throw th2;
                                    }
                                    sQLiteCursor.dispose();
                                    throw th2;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                sQLiteCursor = queryFinalized;
                                if (sQLiteCursor == null) {
                                }
                            }
                        }
                        arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
                    } catch (Exception e11) {
                        e = e11;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                if (arrayList2 != null) {
                    try {
                    } catch (Exception e12) {
                        e = e12;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                    try {
                        this.a.c(new lr(this, arrayList2, j3, 1));
                    } catch (Exception e13) {
                        e = e13;
                        exc = e;
                        sQLiteCursor = queryFinalized;
                        o(exc, true);
                        if (sQLiteCursor != null) {
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        th2 = th;
                        sQLiteCursor = queryFinalized;
                        if (sQLiteCursor == null) {
                        }
                    }
                }
                try {
                    queryFinalized.dispose();
                } catch (Exception e14) {
                    e = e14;
                    exc = e;
                    sQLiteCursor = queryFinalized;
                    o(exc, true);
                    if (sQLiteCursor != null) {
                    }
                } catch (Throwable th8) {
                    th = th8;
                    th2 = th;
                    sQLiteCursor = queryFinalized;
                    if (sQLiteCursor == null) {
                    }
                }
            } catch (Exception e15) {
                exc = e15;
            } catch (Throwable th9) {
                th2 = th9;
            }
        } catch (Exception e16) {
            exc = e16;
        } catch (Throwable th10) {
            th = th10;
            th2 = th;
            if (sQLiteCursor == null) {
            }
        }
    }

    public final void T1(LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, a0.h hVar, LongSparseIntArray longSparseIntArray3) {
        if (t0(longSparseIntArray) && t0(longSparseIntArray2) && s0(hVar) && t0(longSparseIntArray3)) {
            return;
        }
        this.a.c(new mn(this, longSparseIntArray, longSparseIntArray2, hVar, longSparseIntArray3, 11));
    }

    public final int U(final long j3, final boolean z9) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final Integer[] numArr = {0};
        this.a.c(new Runnable() { // from class: org.telegram.messenger.gr
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
            
                if (r9 == null) goto L21;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                yr yrVar = yr.this;
                yrVar.getClass();
                boolean z10 = z9;
                long j10 = j3;
                Integer[] numArr2 = numArr;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        if (z10) {
                            sQLiteCursor = yrVar.b.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + j10, new Object[0]);
                            if (sQLiteCursor.next()) {
                                numArr2[0] = Integer.valueOf(sQLiteCursor.intValue(0));
                            }
                        } else {
                            sQLiteCursor = yrVar.b.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + j10, new Object[0]);
                            if (sQLiteCursor.next()) {
                                int intValue = sQLiteCursor.intValue(0);
                                int intValue2 = sQLiteCursor.intValue(1);
                                if (intValue2 > intValue) {
                                    numArr2[0] = 0;
                                } else {
                                    numArr2[0] = Integer.valueOf(intValue2);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        yrVar.o(e10, true);
                    }
                    sQLiteCursor.dispose();
                    countDownLatch.countDown();
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return numArr[0].intValue();
    }

    public final void U0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        g0.h3(new sp(this, arrayList, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0414 A[Catch: Exception -> 0x00c1, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c1, blocks: (B:3:0x000d, B:36:0x031c, B:38:0x0322, B:43:0x0404, B:45:0x0414, B:50:0x032e, B:52:0x033b, B:53:0x0349, B:55:0x034f, B:57:0x035b, B:59:0x03ae, B:60:0x0363, B:62:0x0387, B:63:0x038d, B:65:0x0392, B:67:0x0399, B:71:0x03b2, B:72:0x03bf, B:74:0x03c5, B:75:0x03ce, B:77:0x03d4, B:79:0x03de, B:81:0x03f8, B:82:0x03e6, B:85:0x03fa, B:86:0x03fd, B:93:0x0080, B:96:0x0087, B:98:0x008d, B:102:0x00a3, B:103:0x017b, B:105:0x019b, B:106:0x01a1, B:108:0x01e0, B:110:0x01f2, B:116:0x00c9, B:117:0x00ed, B:121:0x00f5, B:123:0x00fc, B:125:0x012a, B:126:0x0161, B:127:0x014b, B:128:0x0165, B:130:0x009b, B:132:0x01fc, B:134:0x0207, B:136:0x020e, B:137:0x0244, B:139:0x024a, B:141:0x0263, B:143:0x0269, B:145:0x026f, B:147:0x0276, B:149:0x0296, B:150:0x029d, B:152:0x02ad, B:154:0x02b8, B:156:0x02c1, B:160:0x02cf, B:162:0x02d9, B:164:0x02e0, B:169:0x02e7, B:172:0x02ee, B:174:0x02f4), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x033b A[Catch: Exception -> 0x00c1, TryCatch #1 {Exception -> 0x00c1, blocks: (B:3:0x000d, B:36:0x031c, B:38:0x0322, B:43:0x0404, B:45:0x0414, B:50:0x032e, B:52:0x033b, B:53:0x0349, B:55:0x034f, B:57:0x035b, B:59:0x03ae, B:60:0x0363, B:62:0x0387, B:63:0x038d, B:65:0x0392, B:67:0x0399, B:71:0x03b2, B:72:0x03bf, B:74:0x03c5, B:75:0x03ce, B:77:0x03d4, B:79:0x03de, B:81:0x03f8, B:82:0x03e6, B:85:0x03fa, B:86:0x03fd, B:93:0x0080, B:96:0x0087, B:98:0x008d, B:102:0x00a3, B:103:0x017b, B:105:0x019b, B:106:0x01a1, B:108:0x01e0, B:110:0x01f2, B:116:0x00c9, B:117:0x00ed, B:121:0x00f5, B:123:0x00fc, B:125:0x012a, B:126:0x0161, B:127:0x014b, B:128:0x0165, B:130:0x009b, B:132:0x01fc, B:134:0x0207, B:136:0x020e, B:137:0x0244, B:139:0x024a, B:141:0x0263, B:143:0x0269, B:145:0x026f, B:147:0x0276, B:149:0x0296, B:150:0x029d, B:152:0x02ad, B:154:0x02b8, B:156:0x02c1, B:160:0x02cf, B:162:0x02d9, B:164:0x02e0, B:169:0x02e7, B:172:0x02ee, B:174:0x02f4), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03c5 A[Catch: Exception -> 0x00c1, TryCatch #1 {Exception -> 0x00c1, blocks: (B:3:0x000d, B:36:0x031c, B:38:0x0322, B:43:0x0404, B:45:0x0414, B:50:0x032e, B:52:0x033b, B:53:0x0349, B:55:0x034f, B:57:0x035b, B:59:0x03ae, B:60:0x0363, B:62:0x0387, B:63:0x038d, B:65:0x0392, B:67:0x0399, B:71:0x03b2, B:72:0x03bf, B:74:0x03c5, B:75:0x03ce, B:77:0x03d4, B:79:0x03de, B:81:0x03f8, B:82:0x03e6, B:85:0x03fa, B:86:0x03fd, B:93:0x0080, B:96:0x0087, B:98:0x008d, B:102:0x00a3, B:103:0x017b, B:105:0x019b, B:106:0x01a1, B:108:0x01e0, B:110:0x01f2, B:116:0x00c9, B:117:0x00ed, B:121:0x00f5, B:123:0x00fc, B:125:0x012a, B:126:0x0161, B:127:0x014b, B:128:0x0165, B:130:0x009b, B:132:0x01fc, B:134:0x0207, B:136:0x020e, B:137:0x0244, B:139:0x024a, B:141:0x0263, B:143:0x0269, B:145:0x026f, B:147:0x0276, B:149:0x0296, B:150:0x029d, B:152:0x02ad, B:154:0x02b8, B:156:0x02c1, B:160:0x02cf, B:162:0x02d9, B:164:0x02e0, B:169:0x02e7, B:172:0x02ee, B:174:0x02f4), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0080 A[Catch: Exception -> 0x00c1, TRY_ENTER, TryCatch #1 {Exception -> 0x00c1, blocks: (B:3:0x000d, B:36:0x031c, B:38:0x0322, B:43:0x0404, B:45:0x0414, B:50:0x032e, B:52:0x033b, B:53:0x0349, B:55:0x034f, B:57:0x035b, B:59:0x03ae, B:60:0x0363, B:62:0x0387, B:63:0x038d, B:65:0x0392, B:67:0x0399, B:71:0x03b2, B:72:0x03bf, B:74:0x03c5, B:75:0x03ce, B:77:0x03d4, B:79:0x03de, B:81:0x03f8, B:82:0x03e6, B:85:0x03fa, B:86:0x03fd, B:93:0x0080, B:96:0x0087, B:98:0x008d, B:102:0x00a3, B:103:0x017b, B:105:0x019b, B:106:0x01a1, B:108:0x01e0, B:110:0x01f2, B:116:0x00c9, B:117:0x00ed, B:121:0x00f5, B:123:0x00fc, B:125:0x012a, B:126:0x0161, B:127:0x014b, B:128:0x0165, B:130:0x009b, B:132:0x01fc, B:134:0x0207, B:136:0x020e, B:137:0x0244, B:139:0x024a, B:141:0x0263, B:143:0x0269, B:145:0x026f, B:147:0x0276, B:149:0x0296, B:150:0x029d, B:152:0x02ad, B:154:0x02b8, B:156:0x02c1, B:160:0x02cf, B:162:0x02d9, B:164:0x02e0, B:169:0x02e7, B:172:0x02ee, B:174:0x02f4), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032 A[Catch: Exception -> 0x0028, TRY_ENTER, TryCatch #0 {Exception -> 0x0028, blocks: (B:177:0x001f, B:9:0x0032, B:10:0x0051, B:12:0x0057, B:15:0x005e, B:18:0x0065, B:25:0x006f, B:21:0x0073, B:34:0x0079), top: B:176:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U1(ArrayList arrayList, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, a0.h hVar, LongSparseIntArray longSparseIntArray3) {
        boolean z9;
        boolean z10;
        LongSparseIntArray longSparseIntArray4;
        int i7;
        LongSparseIntArray longSparseIntArray5;
        String str;
        LongSparseIntArray longSparseIntArray6;
        int i10;
        int i11;
        int i12;
        try {
            LongSparseIntArray longSparseIntArray7 = new LongSparseIntArray();
            LongSparseIntArray longSparseIntArray8 = new LongSparseIntArray();
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            if (arrayList != null) {
                try {
                    if (!arrayList.isEmpty()) {
                        z10 = false;
                        String str2 = ",";
                        char c10 = 2;
                        if (z10) {
                            String join = TextUtils.join(",", arrayList);
                            SQLiteDatabase sQLiteDatabase = this.b;
                            Locale locale = Locale.US;
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT uid, read_state, out FROM messages_v2 WHERE mid IN(" + join + ") AND is_channel = 0", new Object[0]);
                            while (queryFinalized.next()) {
                                if (queryFinalized.intValue(2) == 0 && queryFinalized.intValue(1) == 0) {
                                    long longValue = queryFinalized.longValue(0);
                                    int i14 = longSparseIntArray7.get(longValue);
                                    if (i14 == 0) {
                                        longSparseIntArray7.put(longValue, 1);
                                    } else {
                                        longSparseIntArray7.put(longValue, i14 + 1);
                                    }
                                }
                            }
                            queryFinalized.dispose();
                            longSparseIntArray4 = longSparseIntArray7;
                        } else {
                            if (!t0(longSparseIntArray)) {
                                int i15 = 0;
                                while (i15 < longSparseIntArray.size()) {
                                    String str3 = str2;
                                    long keyAt = longSparseIntArray.keyAt(i15);
                                    int i16 = longSparseIntArray.get(keyAt);
                                    int i17 = longSparseIntArray3 == null ? -2 : longSparseIntArray3.get(keyAt, -2);
                                    if (i17 >= 0) {
                                        longSparseIntArray7.put(keyAt, i17);
                                        boolean z11 = r2.a;
                                        a8.b(keyAt + " update unread messages count by still unread " + i17);
                                    } else {
                                        if (longSparseIntArray3 == null || i17 == -2) {
                                            i7 = 1;
                                        } else {
                                            SQLiteDatabase sQLiteDatabase2 = this.b;
                                            Locale locale2 = Locale.US;
                                            SQLiteCursor queryFinalized2 = sQLiteDatabase2.queryFinalized("SELECT start, end FROM messages_holes WHERE uid = " + keyAt + " AND end > " + i16, new Object[i13]);
                                            i7 = 1;
                                            while (queryFinalized2.next()) {
                                                i7 = i13;
                                            }
                                            queryFinalized2.dispose();
                                        }
                                        if (i7 != 0) {
                                            SQLiteDatabase sQLiteDatabase3 = this.b;
                                            Locale locale3 = Locale.US;
                                            SQLiteCursor queryFinalized3 = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + keyAt + " AND mid > " + i16 + " AND read_state IN(0,2) AND out = 0", new Object[i13]);
                                            if (queryFinalized3.next()) {
                                                int intValue = queryFinalized3.intValue(i13);
                                                longSparseIntArray7.put(keyAt, intValue);
                                                boolean z12 = r2.a;
                                                a8.b(keyAt + " update unread messages count " + intValue);
                                            } else {
                                                boolean z13 = r2.a;
                                                a8.b(keyAt + " can't update unread messages count cursor trouble");
                                            }
                                            queryFinalized3.dispose();
                                        } else {
                                            boolean z14 = r2.a;
                                            a8.b(keyAt + " can't update unread messages count");
                                        }
                                    }
                                    SQLiteCursor queryFinalized4 = this.b.queryFinalized("SELECT inbox_max FROM dialogs WHERE did = " + keyAt, new Object[0]);
                                    int intValue2 = queryFinalized4.next() ? queryFinalized4.intValue(0) : 0;
                                    queryFinalized4.dispose();
                                    a8.b(keyAt + " set inbox max " + i16);
                                    SQLitePreparedStatement executeFast = this.b.executeFast("UPDATE dialogs SET inbox_max = max((SELECT inbox_max FROM dialogs WHERE did = ?), ?) WHERE did = ?");
                                    executeFast.requery();
                                    executeFast.bindLong(1, keyAt);
                                    char c11 = 2;
                                    executeFast.bindInteger(2, i16);
                                    executeFast.bindLong(3, keyAt);
                                    executeFast.step();
                                    executeFast.dispose();
                                    if (u0(14, keyAt)) {
                                        longSparseIntArray5 = longSparseIntArray7;
                                        str = str3;
                                        c11 = 2;
                                        g2(keyAt, intValue2, i16);
                                    } else {
                                        longSparseIntArray5 = longSparseIntArray7;
                                        str = str3;
                                    }
                                    i15++;
                                    c10 = c11;
                                    str2 = str;
                                    longSparseIntArray7 = longSparseIntArray5;
                                    i13 = 0;
                                }
                            }
                            longSparseIntArray4 = longSparseIntArray7;
                            int i18 = 3;
                            String str4 = str2;
                            if (!s0(hVar)) {
                                int m10 = hVar.m();
                                int i19 = 0;
                                while (i19 < m10) {
                                    ArrayList arrayList3 = (ArrayList) hVar.n(i19);
                                    ArrayList arrayList4 = new ArrayList(arrayList3);
                                    String join2 = TextUtils.join(str4, arrayList3);
                                    SQLiteDatabase sQLiteDatabase4 = this.b;
                                    Locale locale4 = Locale.US;
                                    int i20 = 0;
                                    SQLiteCursor queryFinalized5 = sQLiteDatabase4.queryFinalized("SELECT uid, read_state, out, mention, mid, is_channel FROM messages_v2 WHERE mid IN(" + join2 + ")", new Object[0]);
                                    long j3 = 0;
                                    while (queryFinalized5.next()) {
                                        String str5 = str4;
                                        long longValue2 = queryFinalized5.longValue(i20);
                                        arrayList4.remove(Integer.valueOf(queryFinalized5.intValue(4)));
                                        if (queryFinalized5.intValue(1) < 2 && queryFinalized5.intValue(2) == 0 && queryFinalized5.intValue(i18) == 1) {
                                            int i21 = longSparseIntArray8.get(longValue2, -1);
                                            if (i21 < 0) {
                                                SQLiteCursor queryFinalized6 = this.b.queryFinalized("SELECT unread_count_i FROM dialogs WHERE did = " + longValue2, new Object[0]);
                                                int intValue3 = queryFinalized6.next() ? queryFinalized6.intValue(0) : 0;
                                                queryFinalized6.dispose();
                                                longSparseIntArray8.put(longValue2, Math.max(0, intValue3 - 1));
                                            } else {
                                                longSparseIntArray8.put(longValue2, Math.max(0, i21 - 1));
                                            }
                                        }
                                        j3 = queryFinalized5.longValue(5);
                                        str4 = str5;
                                        i20 = 0;
                                        i18 = 3;
                                    }
                                    String str6 = str4;
                                    queryFinalized5.dispose();
                                    if (!arrayList4.isEmpty() && j3 != 0 && !arrayList2.contains(Long.valueOf(j3))) {
                                        arrayList2.add(Long.valueOf(j3));
                                    }
                                    i19++;
                                    str4 = str6;
                                    i18 = 3;
                                }
                            }
                            if (!t0(longSparseIntArray2)) {
                                for (int i22 = 0; i22 < longSparseIntArray2.size(); i22++) {
                                    long keyAt2 = longSparseIntArray2.keyAt(i22);
                                    int i23 = longSparseIntArray2.get(keyAt2);
                                    SQLitePreparedStatement executeFast2 = this.b.executeFast("UPDATE dialogs SET outbox_max = max((SELECT outbox_max FROM dialogs WHERE did = ?), ?) WHERE did = ?");
                                    executeFast2.requery();
                                    executeFast2.bindLong(1, keyAt2);
                                    executeFast2.bindInteger(2, i23);
                                    executeFast2.bindLong(3, keyAt2);
                                    executeFast2.step();
                                    executeFast2.dispose();
                                }
                            }
                        }
                        if (longSparseIntArray4.size() <= 0 && longSparseIntArray8.size() <= 0) {
                            longSparseIntArray6 = longSparseIntArray4;
                            W1(longSparseIntArray6, longSparseIntArray8, true);
                            getMessagesController().H3(longSparseIntArray6, longSparseIntArray8);
                            if (arrayList2.isEmpty()) {
                                qp messagesController = getMessagesController();
                                messagesController.getClass();
                                g0.h3(new qj(messagesController, arrayList2, 5));
                                return;
                            }
                            return;
                        }
                        this.b.beginTransaction();
                        if (longSparseIntArray4.size() <= 0) {
                            ArrayList arrayList5 = new ArrayList();
                            SQLitePreparedStatement executeFast3 = this.b.executeFast("UPDATE dialogs SET unread_count = ? WHERE did = ?");
                            int i24 = 0;
                            while (i24 < longSparseIntArray4.size()) {
                                LongSparseIntArray longSparseIntArray9 = longSparseIntArray4;
                                long keyAt3 = longSparseIntArray9.keyAt(i24);
                                if (u0(13, keyAt3)) {
                                    longSparseIntArray9.removeAt(i24);
                                    i24--;
                                    i12 = 1;
                                } else {
                                    int valueAt = longSparseIntArray9.valueAt(i24);
                                    SQLiteCursor queryFinalized7 = this.b.queryFinalized("SELECT unread_count FROM dialogs WHERE did = " + keyAt3, new Object[0]);
                                    int intValue4 = queryFinalized7.next() ? queryFinalized7.intValue(0) : 0;
                                    queryFinalized7.dispose();
                                    if (intValue4 == valueAt) {
                                        longSparseIntArray9.removeAt(i24);
                                        i24--;
                                        i12 = 1;
                                    } else {
                                        executeFast3.requery();
                                        i12 = 1;
                                        executeFast3.bindInteger(1, valueAt);
                                        executeFast3.bindLong(2, keyAt3);
                                        executeFast3.step();
                                        arrayList5.add(Long.valueOf(keyAt3));
                                    }
                                }
                                i24 += i12;
                                longSparseIntArray4 = longSparseIntArray9;
                            }
                            longSparseIntArray6 = longSparseIntArray4;
                            i10 = 0;
                            executeFast3.dispose();
                            l2(arrayList5);
                        } else {
                            longSparseIntArray6 = longSparseIntArray4;
                            i10 = 0;
                        }
                        if (longSparseIntArray8.size() > 0) {
                            SQLitePreparedStatement executeFast4 = this.b.executeFast("UPDATE dialogs SET unread_count_i = ? WHERE did = ?");
                            int i25 = i10;
                            while (i25 < longSparseIntArray8.size()) {
                                long keyAt4 = longSparseIntArray8.keyAt(i25);
                                if (u0(13, keyAt4)) {
                                    longSparseIntArray8.removeAt(i25);
                                    i25--;
                                    i11 = 1;
                                } else {
                                    executeFast4.requery();
                                    i11 = 1;
                                    executeFast4.bindInteger(1, longSparseIntArray8.valueAt(i25));
                                    executeFast4.bindLong(2, keyAt4);
                                    executeFast4.step();
                                }
                                i25 += i11;
                            }
                            executeFast4.dispose();
                        }
                        this.b.commitTransaction();
                        W1(longSparseIntArray6, longSparseIntArray8, true);
                        getMessagesController().H3(longSparseIntArray6, longSparseIntArray8);
                        if (arrayList2.isEmpty()) {
                        }
                    }
                } catch (Exception e10) {
                    e = e10;
                    z9 = true;
                    o(e, z9);
                    return;
                }
            }
            z10 = true;
            String str22 = ",";
            char c102 = 2;
            if (z10) {
            }
            if (longSparseIntArray4.size() <= 0) {
                longSparseIntArray6 = longSparseIntArray4;
                W1(longSparseIntArray6, longSparseIntArray8, true);
                getMessagesController().H3(longSparseIntArray6, longSparseIntArray8);
                if (arrayList2.isEmpty()) {
                }
            }
            this.b.beginTransaction();
            if (longSparseIntArray4.size() <= 0) {
            }
            if (longSparseIntArray8.size() > 0) {
            }
            this.b.commitTransaction();
            W1(longSparseIntArray6, longSparseIntArray8, true);
            getMessagesController().H3(longSparseIntArray6, longSparseIntArray8);
            if (arrayList2.isEmpty()) {
            }
        } catch (Exception e11) {
            e = e11;
            z9 = true;
        }
    }

    public final void V(String str, ArrayList arrayList, ArrayList arrayList2) {
        if (str == null || str.length() == 0) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a8.p0.p("SELECT data, user, g, authkey, ttl, layer, seq_in, seq_out, use_count, exchange_id, key_date, fprint, fauthkey, khash, in_seq_no, admin_id, mtproto_seq FROM enc_chats WHERE uid IN(", str, ")"), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.EncryptedChat TLdeserialize = TLRPC.EncryptedChat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        long longValue = queryFinalized.longValue(1);
                        TLdeserialize.user_id = longValue;
                        if (arrayList2 != null && !arrayList2.contains(Long.valueOf(longValue))) {
                            arrayList2.add(Long.valueOf(TLdeserialize.user_id));
                        }
                        TLdeserialize.a_or_b = queryFinalized.byteArrayValue(2);
                        TLdeserialize.auth_key = queryFinalized.byteArrayValue(3);
                        TLdeserialize.ttl = queryFinalized.intValue(4);
                        TLdeserialize.layer = queryFinalized.intValue(5);
                        TLdeserialize.seq_in = queryFinalized.intValue(6);
                        TLdeserialize.seq_out = queryFinalized.intValue(7);
                        int intValue = queryFinalized.intValue(8);
                        TLdeserialize.key_use_count_in = (short) (intValue >> 16);
                        TLdeserialize.key_use_count_out = (short) intValue;
                        TLdeserialize.exchange_id = queryFinalized.longValue(9);
                        TLdeserialize.key_create_date = queryFinalized.intValue(10);
                        TLdeserialize.future_key_fingerprint = queryFinalized.longValue(11);
                        TLdeserialize.future_auth_key = queryFinalized.byteArrayValue(12);
                        TLdeserialize.key_hash = queryFinalized.byteArrayValue(13);
                        TLdeserialize.in_seq_no = queryFinalized.intValue(14);
                        long longValue2 = queryFinalized.longValue(15);
                        if (longValue2 != 0) {
                            TLdeserialize.admin_id = longValue2;
                        }
                        TLdeserialize.mtproto_seq = queryFinalized.intValue(16);
                        arrayList.add(TLdeserialize);
                    }
                }
            } catch (Exception e10) {
                o(e10, true);
            }
        }
        queryFinalized.dispose();
    }

    public final void V0(int i7) {
        if (!as.a) {
            int i10 = 0;
            while (!as.a) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                i10++;
                if (i10 > 5) {
                    break;
                }
            }
        }
        File h = t0.h();
        if (this.currentAccount != 0) {
            File file = new File(h, a8.p0.n(this.currentAccount, "/", new StringBuilder("account")));
            file.mkdirs();
            h = file;
        }
        this.c = new File(h, "cache4.db");
        this.d = new File(h, "cache4.db-wal");
        this.e = new File(h, "cache4.db-shm");
        this.O = false;
        boolean exists = this.c.exists();
        int i11 = 2;
        try {
            SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(this.c.getPath());
            this.b = sQLiteDatabase;
            sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
            this.b.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
            this.b.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
            this.b.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
            if (exists) {
                int intValue = this.b.executeInt("PRAGMA user_version", new Object[0]).intValue();
                if (r2.a) {
                    a8.b("current db version = " + intValue);
                }
                if (intValue == 0) {
                    throw new Exception("malformed");
                }
                try {
                    SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT seq, pts, date, qts, lsv, sg, pbytes FROM params WHERE id = 1", new Object[0]);
                    if (queryFinalized.next()) {
                        this.w = queryFinalized.intValue(0);
                        this.r = queryFinalized.intValue(1);
                        this.n = queryFinalized.intValue(2);
                        this.s = queryFinalized.intValue(3);
                        this.x = queryFinalized.intValue(4);
                        this.D = queryFinalized.intValue(5);
                        if (queryFinalized.isNull(6)) {
                            this.y = null;
                        } else {
                            byte[] byteArrayValue = queryFinalized.byteArrayValue(6);
                            this.y = byteArrayValue;
                            if (byteArrayValue != null && byteArrayValue.length == 1) {
                                this.y = null;
                            }
                        }
                    }
                    queryFinalized.dispose();
                } catch (Exception e11) {
                    a8.g(e11, true);
                    if (e11.getMessage() != null && e11.getMessage().contains("malformed")) {
                        throw new RuntimeException("malformed");
                    }
                    try {
                        this.b.executeFast("CREATE TABLE IF NOT EXISTS params(id INTEGER PRIMARY KEY, seq INTEGER, pts INTEGER, date INTEGER, qts INTEGER, lsv INTEGER, sg INTEGER, pbytes BLOB)").stepThis().dispose();
                        this.b.executeFast("INSERT INTO params VALUES(1, 0, 0, 0, 0, 0, 0, NULL)").stepThis().dispose();
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                }
                if (intValue < 181) {
                    try {
                        P1(intValue);
                    } catch (Exception e13) {
                        boolean z9 = r2.a;
                        a8.g(e13, true);
                        throw new RuntimeException("malformed");
                    }
                }
            } else {
                if (r2.a) {
                    a8.b("create new database");
                }
                A(this.b);
            }
            this.O = true;
        } catch (Exception e14) {
            a8.g(e14, true);
            if (i7 < 3 && e14.getMessage() != null && e14.getMessage().contains("malformed")) {
                if (i7 == 2) {
                    p(true);
                    s();
                } else {
                    p(false);
                }
                V0(i7 == 1 ? 2 : 3);
                return;
            }
        }
        g0.h3(new rq(this, i11));
        this.a.c(new rq(this, 27));
        this.a.c(new rq(this, 22));
        this.a.c(new rq(this, 28));
        try {
            this.P.countDown();
        } catch (Throwable unused) {
        }
        g0.h3(new rq(this, r5));
    }

    public final void V1(TLRPC.EncryptedChat encryptedChat) {
        if (encryptedChat == null) {
            return;
        }
        this.a.c(new eq(this, encryptedChat, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TL_ephemeral.EphemeralMessage W(int i7, long j3) {
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer byteBufferValue;
        SQLiteCursor sQLiteCursor2 = null;
        r1 = null;
        TL_ephemeral.EphemeralMessage ephemeralMessage = null;
        sQLiteCursor2 = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.US;
            try {
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = " + j3 + " AND id = " + i7, new Object[0]);
                try {
                    try {
                        if (sQLiteCursor.next() && (byteBufferValue = sQLiteCursor.byteBufferValue(0)) != null) {
                            TL_ephemeral.EphemeralMessage TLdeserialize = TL_ephemeral.EphemeralMessage.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            ephemeralMessage = TLdeserialize;
                        }
                        sQLiteCursor.dispose();
                        return ephemeralMessage;
                    } catch (Exception e10) {
                        e = e10;
                        o(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor2 = sQLiteCursor;
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                sQLiteCursor = null;
                o(e, true);
                if (sQLiteCursor != null) {
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                if (sQLiteCursor2 != null) {
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void W0(ArrayList arrayList, ck ckVar) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        I(new lg(this, arrayList, ckVar, 16));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r21v11 int, still in use, count: 2, list:
          (r21v11 int) from 0x0678: IF  (r21v11 int) == (0 int)  -> B:359:0x067a A[HIDDEN]
          (r21v11 int) from 0x066b: PHI (r21v12 int) = (r21v11 int) binds: [B:358:0x0678] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x08aa  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0957  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0b25  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W1(org.telegram.messenger.support.LongSparseIntArray r31, org.telegram.messenger.support.LongSparseIntArray r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 2897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yr.W1(org.telegram.messenger.support.LongSparseIntArray, org.telegram.messenger.support.LongSparseIntArray, boolean):void");
    }

    public final ArrayList X(long j3, long j10) {
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.b.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = ? AND topic_id = ? AND date >= ? ORDER BY date DESC LIMIT 30", Long.valueOf(j3), Long.valueOf(j10), Integer.valueOf(getConnectionsManager().getCurrentTime() - 172800));
                while (sQLiteCursor.next()) {
                    TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) sQLiteCursor.tlObjectValue(0, new ch(5), false);
                    if (ephemeralMessage != null && ephemeralMessage.anchor_msg_id == 0) {
                        arrayList.add(ephemeralMessage);
                    }
                }
                sQLiteCursor.dispose();
                return arrayList;
            } catch (Exception e10) {
                o(e10, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return arrayList;
            }
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public final void X0(ArrayList arrayList, bk bkVar) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        I(new lg(this, arrayList, bkVar, 23));
    }

    public final void X1(long j3, TLRPC.Message message) {
        this.a.c(new a4(this, message, j3, 27));
    }

    public final ArrayList Y(ArrayList arrayList, long j3) {
        ArrayList arrayList2 = new ArrayList();
        if (!arrayList.isEmpty()) {
            SQLiteCursor sQLiteCursor = null;
            try {
                try {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM ephemeral_messages WHERE dialog_id = " + j3 + " AND id IN (" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TL_ephemeral.EphemeralMessage TLdeserialize = TL_ephemeral.EphemeralMessage.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                arrayList2.add(TLdeserialize);
                            }
                        }
                    }
                    sQLiteCursor.dispose();
                    return arrayList2;
                } catch (Exception e10) {
                    o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            } catch (Throwable th2) {
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                throw th2;
            }
        }
        return arrayList2;
    }

    public final void Y0(TLRPC.TL_messages_dialogs tL_messages_dialogs, TLRPC.TL_messages_dialogs tL_messages_dialogs2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SparseArray sparseArray, ArrayList arrayList4, HashMap hashMap, HashSet hashSet, Runnable runnable) {
        m1(arrayList, arrayList2, true, false);
        int size = sparseArray.size();
        int i7 = 0;
        boolean z9 = false;
        while (i7 < size) {
            C((vo) sparseArray.valueAt(i7));
            i7++;
            z9 = true;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            vo voVar = (vo) this.I.get(((Integer) it.next()).intValue());
            if (voVar != null) {
                voVar.e = -1;
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            vo voVar2 = (vo) this.I.get(((Integer) entry.getKey()).intValue());
            if (voVar2 != null) {
                Iterator it2 = ((HashSet) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    voVar2.j.delete(((Long) it2.next()).longValue());
                }
                z9 = true;
            }
        }
        int size2 = arrayList3.size();
        int i10 = 0;
        while (i10 < size2) {
            x1((vo) arrayList3.get(i10), false);
            i10++;
            z9 = true;
        }
        int size3 = this.H.size();
        boolean z10 = false;
        for (int i11 = 0; i11 < size3; i11++) {
            vo voVar3 = (vo) this.H.get(i11);
            int indexOf = arrayList4.indexOf(Integer.valueOf(voVar3.a));
            if (voVar3.f != indexOf) {
                voVar3.f = indexOf;
                z10 = true;
                z9 = true;
            }
        }
        if (z10) {
            Collections.sort(this.H, new jl(11));
            z1();
        }
        int i12 = z9 ? 1 : 2;
        j(true);
        qp messagesController = getMessagesController();
        ArrayList arrayList5 = new ArrayList(this.H);
        messagesController.getClass();
        Utilities.d.c(new bn(messagesController, tL_messages_dialogs, null, tL_messages_dialogs2, i12, arrayList5, arrayList, arrayList2, runnable));
    }

    public final void Y1(long j3, TLRPC.Poll poll, TLRPC.PollResults pollResults) {
        this.a.c(new jm(this, j3, poll, pollResults, 16));
    }

    public final int Z(long j3) {
        LongSparseIntArray longSparseIntArray = this.R;
        int i7 = longSparseIntArray.get(j3, -1);
        if (i7 == -1) {
            i7 = 0;
            if (j3 < 0) {
                TLRPC.Chat O = O(-j3);
                if (O != null && O.forum) {
                    i7 = O.forum_tabs ? 3 : 1;
                }
                if (O != null && O.monoforum) {
                    i7 |= 4;
                }
            } else {
                TLRPC.User j02 = j0(j3);
                if (j02 != null && j02.bot_forum_view) {
                    i7 = 8;
                }
            }
            longSparseIntArray.put(j3, i7);
        }
        return i7;
    }

    public final void Z0(HashMap hashMap, boolean z9, boolean z10) {
        if (!hashMap.isEmpty() || z9 || z10) {
            this.a.c(new yf(this, hashMap, z9, 2));
        }
    }

    public final void Z1(long j3, int i7, TLRPC.TL_messageReactions tL_messageReactions) {
        this.a.c(new hk(this, i7, j3, tL_messageReactions, 9));
    }

    public final void a1(a0.h hVar, a0.h hVar2, a0.h hVar3, boolean z9) {
        if (s0(hVar) && s0(hVar2) && s0(hVar3)) {
            return;
        }
        this.a.c(new ln((c1) this, (Object) hVar, (Object) hVar2, (Object) hVar3, z9, 3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:299|300|(4:302|303|(2:305|306)(1:361)|307)|308|309|(2:311|312)(1:349)|313|314|315|316|317|318|(4:320|321|(2:323|324)|326)) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:28|(1:30)(2:75|(1:77)(2:78|(1:80)(2:81|(1:83)(12:84|32|33|34|(1:36)(1:69)|37|38|(5:40|41|42|43|44)|66|(1:68)|54|55))))|31|32|33|34|(0)(0)|37|38|(0)|66|(0)|54|55) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:(6:(4:302|303|(2:305|306)(1:361)|307)|314|315|316|317|318)|308|309|(2:311|312)(1:349)|313|(4:320|321|(2:323|324)|326)) */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0247, code lost:
    
        r27.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x023a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x023b, code lost:
    
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x023e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x023f, code lost:
    
        r36 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x01e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x01f2, code lost:
    
        n(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x01f5, code lost:
    
        if (r3 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x01f7, code lost:
    
        r3.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x01fa, code lost:
    
        r2 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x00f3, code lost:
    
        if (r11 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x031d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x031e, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0319, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x031a, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0352 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x029d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0274 A[Catch: all -> 0x027a, Exception -> 0x027f, TRY_LEAVE, TryCatch #61 {Exception -> 0x027f, all -> 0x027a, blocks: (B:280:0x026e, B:282:0x0274), top: B:279:0x026e }] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x01e0 A[Catch: all -> 0x01e6, Exception -> 0x01e9, TRY_LEAVE, TryCatch #7 {Exception -> 0x01e9, blocks: (B:309:0x01c0, B:311:0x01e0), top: B:308:0x01c0, outer: #36 }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0220 A[Catch: all -> 0x0226, Exception -> 0x022a, TRY_LEAVE, TryCatch #67 {Exception -> 0x022a, all -> 0x0226, blocks: (B:321:0x021a, B:323:0x0220), top: B:320:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02ea A[Catch: all -> 0x0319, Exception -> 0x031d, TryCatch #59 {Exception -> 0x031d, all -> 0x0319, blocks: (B:34:0x02e1, B:36:0x02ea, B:38:0x02ef, B:40:0x02f7), top: B:33:0x02e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:384:0x00f8 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f7 A[Catch: all -> 0x0319, Exception -> 0x031d, TRY_LEAVE, TryCatch #59 {Exception -> 0x031d, all -> 0x0319, blocks: (B:34:0x02e1, B:36:0x02ea, B:38:0x02ef, B:40:0x02f7), top: B:33:0x02e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x034c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x054b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long[] a2(long j3, long j10, Integer num, int i7, int i10, int i11, int i12) {
        String str;
        String str2;
        Integer num2;
        SQLiteCursor sQLiteCursor;
        long j11;
        Integer num3;
        SQLiteCursor sQLiteCursor2;
        long j12;
        SQLiteDatabase sQLiteDatabase;
        SQLiteCursor sQLiteCursor3;
        long j13;
        int i13;
        int i14;
        int i15;
        SQLiteCursor queryFinalized;
        int i16;
        SQLiteCursor queryFinalized2;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        String str3;
        String str4;
        SQLitePreparedStatement executeFast;
        SQLitePreparedStatement executeFast2;
        SQLitePreparedStatement executeFast3;
        SQLitePreparedStatement executeFast4;
        SQLitePreparedStatement sQLitePreparedStatement3;
        int i17;
        SQLitePreparedStatement sQLitePreparedStatement4;
        SQLitePreparedStatement executeFast5;
        SQLitePreparedStatement sQLitePreparedStatement5;
        int i18 = i11;
        SQLiteCursor sQLiteCursor4 = null;
        SQLitePreparedStatement sQLitePreparedStatement6 = null;
        SQLitePreparedStatement sQLitePreparedStatement7 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement8 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement9 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement10 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement11 = null;
        r23 = null;
        SQLitePreparedStatement sQLitePreparedStatement12 = null;
        SQLitePreparedStatement sQLitePreparedStatement13 = null;
        if (num == null) {
            try {
                try {
                    sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    str = "DELETE FROM messages_seq WHERE mid = ";
                } catch (Exception e10) {
                    e = e10;
                    str = "DELETE FROM messages_seq WHERE mid = ";
                }
                try {
                    str2 = "DELETE FROM messages_v2 WHERE mid = ";
                    try {
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT mid, uid FROM randoms_v2 WHERE random_id = " + j3 + " LIMIT 1", new Object[0]);
                    } catch (Exception e11) {
                        e = e11;
                        num2 = num;
                        sQLiteCursor = null;
                        n(e);
                        if (sQLiteCursor != null) {
                        }
                        j11 = j10;
                        if (num2 != null) {
                        }
                        return null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    str2 = "DELETE FROM messages_v2 WHERE mid = ";
                    num2 = num;
                    sQLiteCursor = null;
                    n(e);
                    if (sQLiteCursor != null) {
                    }
                    j11 = j10;
                    if (num2 != null) {
                    }
                    return null;
                }
                try {
                    try {
                        if (sQLiteCursor.next()) {
                            num2 = Integer.valueOf(sQLiteCursor.intValue(0));
                            try {
                                j11 = sQLiteCursor.longValue(1);
                            } catch (Exception e13) {
                                e = e13;
                                n(e);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                j11 = j10;
                                if (num2 != null) {
                                }
                                return null;
                            }
                        } else {
                            j11 = j10;
                            num2 = num;
                        }
                        sQLiteCursor.dispose();
                    } catch (Exception e14) {
                        e = e14;
                        num2 = num;
                    }
                    if (num2 != null) {
                        num3 = num2;
                        long j14 = j11;
                        sQLiteCursor2 = sQLiteCursor;
                        j12 = j14;
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor4 = sQLiteCursor;
                    if (sQLiteCursor4 != null) {
                        sQLiteCursor4.dispose();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                if (sQLiteCursor4 != null) {
                }
                throw th;
            }
        }
        str = "DELETE FROM messages_seq WHERE mid = ";
        str2 = "DELETE FROM messages_v2 WHERE mid = ";
        j12 = j10;
        num3 = num;
        sQLiteCursor2 = null;
        getUserConfig().e();
        int intValue = num3.intValue();
        if (num3.intValue() < 0 && i18 == 1) {
            try {
                sQLitePreparedStatement5 = this.b.executeFast("UPDATE randoms_v2 SET mid = ? WHERE random_id = ? AND mid = ?");
                try {
                    try {
                        sQLitePreparedStatement5.bindInteger(1, i7);
                        sQLitePreparedStatement5.bindLong(2, j3);
                        sQLitePreparedStatement5.bindInteger(3, intValue);
                        sQLitePreparedStatement5.step();
                    } catch (Exception e15) {
                        e = e15;
                        n(e);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement6 = sQLitePreparedStatement5;
                    throw th;
                }
            } catch (Exception e16) {
                e = e16;
                sQLitePreparedStatement5 = null;
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
            sQLitePreparedStatement5.dispose();
        } else if (num3.intValue() > 0) {
            TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = new TL_update.TL_updateDeleteScheduledMessages();
            tL_updateDeleteScheduledMessages.messages.add(num3);
            if (m5.z(j12)) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                tL_updateDeleteScheduledMessages.peer = tL_peerChannel;
                tL_peerChannel.channel_id = -j12;
            } else {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_updateDeleteScheduledMessages.peer = tL_peerUser;
                tL_peerUser.user_id = j12;
            }
            TLRPC.TL_updates tL_updates = new TLRPC.TL_updates();
            tL_updates.updates.add(tL_updateDeleteScheduledMessages);
            Utilities.d.c(new zq(1, this, tL_updates));
            try {
                SQLiteDatabase sQLiteDatabase2 = this.b;
                Locale locale2 = Locale.US;
                sQLiteDatabase2.executeFast("DELETE FROM randoms_v2 WHERE random_id = " + j3 + " AND mid = " + num3 + " AND uid = " + j12).stepThis().dispose();
            } catch (Exception e17) {
                n(e17);
            }
            return null;
        }
        if (i18 == -1 || i18 == 0) {
            try {
                try {
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    Locale locale3 = Locale.US;
                    sQLiteCursor3 = sQLiteDatabase3.queryFinalized("SELECT uid FROM messages_v2 WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                } catch (Throwable th6) {
                    th = th6;
                }
            } catch (Exception e18) {
                e = e18;
            }
            try {
                try {
                    try {
                        if (sQLiteCursor3.next()) {
                            j13 = sQLiteCursor3.longValue(0);
                            i18 = 0;
                        } else {
                            j13 = 0;
                        }
                        sQLiteCursor3.dispose();
                    } catch (Exception e19) {
                        e = e19;
                        sQLiteCursor2 = sQLiteCursor3;
                        n(e);
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        sQLiteCursor3 = sQLiteCursor2;
                        j13 = 0;
                        SQLiteDatabase sQLiteDatabase4 = this.b;
                        Locale locale4 = Locale.US;
                        sQLiteCursor3 = sQLiteDatabase4.queryFinalized("SELECT topic_id FROM quick_replies_messages WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                        if (sQLiteCursor3.next()) {
                        }
                        sQLiteCursor3.dispose();
                        int i19 = i16;
                        SQLiteDatabase sQLiteDatabase5 = this.b;
                        Locale locale5 = Locale.US;
                        i13 = i19;
                        queryFinalized = sQLiteDatabase5.queryFinalized("SELECT dialog_id FROM welcome_messages WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                        if (queryFinalized.next()) {
                        }
                        queryFinalized.dispose();
                        sQLiteCursor2 = queryFinalized;
                        i15 = -1;
                        i14 = i13;
                        if (i18 != i15) {
                        }
                        try {
                            try {
                                SQLiteDatabase sQLiteDatabase6 = this.b;
                                Locale locale6 = Locale.US;
                                queryFinalized2 = sQLiteDatabase6.queryFinalized("SELECT uid FROM scheduled_messages_v2 WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                            } catch (Exception e20) {
                                e = e20;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                        }
                        try {
                            if (queryFinalized2.next()) {
                            }
                            queryFinalized2.dispose();
                        } catch (Exception e21) {
                            e = e21;
                            sQLiteCursor2 = queryFinalized2;
                            n(e);
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            if (j13 == 0) {
                            }
                            if (intValue != i7) {
                            }
                            if (i18 == 0) {
                            }
                            return new long[]{j13, num3.intValue()};
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteCursor2 = queryFinalized2;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                        if (j13 == 0) {
                        }
                        if (intValue != i7) {
                        }
                        if (i18 == 0) {
                        }
                        return new long[]{j13, num3.intValue()};
                    } catch (Throwable th9) {
                        th = th9;
                        sQLiteCursor2 = sQLiteCursor3;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                    SQLiteDatabase sQLiteDatabase52 = this.b;
                    Locale locale52 = Locale.US;
                    i13 = i19;
                    queryFinalized = sQLiteDatabase52.queryFinalized("SELECT dialog_id FROM welcome_messages WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                } catch (Throwable th10) {
                    th = th10;
                }
                SQLiteDatabase sQLiteDatabase42 = this.b;
                Locale locale42 = Locale.US;
                sQLiteCursor3 = sQLiteDatabase42.queryFinalized("SELECT topic_id FROM quick_replies_messages WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                if (sQLiteCursor3.next()) {
                    i16 = i12;
                } else {
                    i16 = sQLiteCursor3.intValue(0);
                    i18 = 2;
                }
                sQLiteCursor3.dispose();
                int i192 = i16;
                try {
                    if (queryFinalized.next()) {
                        j13 = queryFinalized.longValue(0);
                        i18 = 3;
                    }
                    queryFinalized.dispose();
                    sQLiteCursor2 = queryFinalized;
                    i15 = -1;
                    i14 = i13;
                } catch (Exception e22) {
                    e = e22;
                    sQLiteCursor2 = queryFinalized;
                    try {
                        n(e);
                        if (sQLiteCursor2 != null) {
                        }
                        i14 = i13;
                        i15 = -1;
                        if (i18 != i15) {
                        }
                        SQLiteDatabase sQLiteDatabase62 = this.b;
                        Locale locale62 = Locale.US;
                        queryFinalized2 = sQLiteDatabase62.queryFinalized("SELECT uid FROM scheduled_messages_v2 WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
                        if (queryFinalized2.next()) {
                        }
                        queryFinalized2.dispose();
                        if (j13 == 0) {
                        }
                        if (intValue != i7) {
                        }
                        if (i18 == 0) {
                        }
                        return new long[]{j13, num3.intValue()};
                    } catch (Throwable th11) {
                        th = th11;
                        sQLiteCursor3 = sQLiteCursor2;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    sQLiteCursor3 = queryFinalized;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
            } catch (Throwable th13) {
                if (sQLiteCursor3 != null) {
                    sQLiteCursor3.dispose();
                }
                throw th13;
            }
        } else {
            i15 = -1;
            j13 = 0;
            i14 = i12;
        }
        if (i18 != i15 || i18 == 1) {
            SQLiteDatabase sQLiteDatabase622 = this.b;
            Locale locale622 = Locale.US;
            queryFinalized2 = sQLiteDatabase622.queryFinalized("SELECT uid FROM scheduled_messages_v2 WHERE mid = " + num3 + " LIMIT 1", new Object[0]);
            if (queryFinalized2.next()) {
                j13 = queryFinalized2.longValue(0);
                i18 = 1;
            }
            queryFinalized2.dispose();
        }
        if (j13 == 0 || i18 == 2) {
            if (intValue != i7 && i10 != 0) {
                try {
                } catch (Exception e23) {
                    e = e23;
                    sQLitePreparedStatement3 = null;
                } catch (Throwable th14) {
                    th = th14;
                    sQLitePreparedStatement3 = null;
                }
                if (i18 == 0) {
                    executeFast5 = this.b.executeFast("UPDATE messages_v2 SET send_state = 0, date = ? WHERE mid = ? AND uid = ?");
                } else if (i18 == 1) {
                    executeFast5 = this.b.executeFast("UPDATE scheduled_messages_v2 SET send_state = 0, date = ? WHERE mid = ? AND uid = ?");
                } else if (i18 == 2) {
                    executeFast5 = this.b.executeFast("UPDATE quick_replies_messages SET send_state = 0, date = ? WHERE mid = ? AND topic_id = ?");
                } else {
                    if (i18 != 3) {
                        i17 = i10;
                        sQLitePreparedStatement4 = null;
                        sQLitePreparedStatement4.bindInteger(1, i17);
                        sQLitePreparedStatement4.bindInteger(2, i7);
                        sQLitePreparedStatement4.bindLong(3, i18 != 2 ? i14 : j13);
                        sQLitePreparedStatement4.step();
                        if (i18 == 0) {
                            sQLitePreparedStatement3 = this.b.executeFast("UPDATE messages_topics SET send_state = 0, date = ? WHERE mid = ? AND uid = ?");
                            try {
                                sQLitePreparedStatement3.bindInteger(1, i17);
                                sQLitePreparedStatement3.bindInteger(2, i7);
                                sQLitePreparedStatement3.bindLong(3, j13);
                                sQLitePreparedStatement3.step();
                                sQLitePreparedStatement7 = sQLitePreparedStatement3;
                            } catch (Exception e24) {
                                e = e24;
                                sQLitePreparedStatement8 = sQLitePreparedStatement4;
                                try {
                                    n(e);
                                    if (sQLitePreparedStatement8 != null) {
                                        sQLitePreparedStatement8.dispose();
                                    }
                                    if (sQLitePreparedStatement3 != null) {
                                        sQLitePreparedStatement3.dispose();
                                    }
                                    return new long[]{j13, i7};
                                } catch (Throwable th15) {
                                    th = th15;
                                    if (sQLitePreparedStatement8 != null) {
                                        sQLitePreparedStatement8.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th16) {
                                th = th16;
                                sQLitePreparedStatement8 = sQLitePreparedStatement4;
                                if (sQLitePreparedStatement8 != null) {
                                }
                                throw th;
                            }
                        }
                        sQLitePreparedStatement4.dispose();
                        if (sQLitePreparedStatement7 != null) {
                            sQLitePreparedStatement7.dispose();
                        }
                        return new long[]{j13, i7};
                    }
                    executeFast5 = this.b.executeFast("UPDATE welcome_messages SET send_state = 0, date = ? WHERE mid = ? AND dialog_id = ?");
                }
                i17 = i10;
                sQLitePreparedStatement4 = executeFast5;
                sQLitePreparedStatement4.bindInteger(1, i17);
                sQLitePreparedStatement4.bindInteger(2, i7);
                sQLitePreparedStatement4.bindLong(3, i18 != 2 ? i14 : j13);
                sQLitePreparedStatement4.step();
                if (i18 == 0) {
                }
                sQLitePreparedStatement4.dispose();
                if (sQLitePreparedStatement7 != null) {
                }
                return new long[]{j13, i7};
            }
            if (i18 == 0) {
                try {
                    sQLitePreparedStatement2 = this.b.executeFast("UPDATE messages_v2 SET mid = ?, send_state = 0 WHERE mid = ? AND uid = ?");
                    try {
                        sQLitePreparedStatement2.bindInteger(1, i7);
                        sQLitePreparedStatement2.bindInteger(2, intValue);
                        sQLitePreparedStatement2.bindLong(3, j13);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement = this.b.executeFast("UPDATE messages_topics SET mid = ?, send_state = 0 WHERE mid = ? AND uid = ?");
                        try {
                            try {
                                sQLitePreparedStatement.bindInteger(1, i7);
                                sQLitePreparedStatement.bindInteger(2, intValue);
                                sQLitePreparedStatement.bindLong(3, j13);
                                sQLitePreparedStatement.step();
                                sQLitePreparedStatement2.dispose();
                                sQLitePreparedStatement.dispose();
                                sQLitePreparedStatement2 = null;
                            } catch (Exception unused) {
                                try {
                                    SQLiteDatabase sQLiteDatabase7 = this.b;
                                    Locale locale7 = Locale.US;
                                    sQLiteDatabase7.executeFast(str2 + num3 + " AND uid = " + j13).stepThis().dispose();
                                    SQLiteDatabase sQLiteDatabase8 = this.b;
                                    StringBuilder sb2 = new StringBuilder(str);
                                    sb2.append(num3);
                                    sQLiteDatabase8.executeFast(sb2.toString()).stepThis().dispose();
                                    this.b.executeFast("DELETE FROM messages_topics WHERE mid = " + num3 + " AND uid = " + j13).stepThis().dispose();
                                } catch (Exception e25) {
                                    n(e25);
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                        sQLitePreparedStatement2 = null;
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    try {
                                        sQLitePreparedStatement2 = this.b.executeFast("UPDATE media_v4 SET mid = ? WHERE mid = ? AND uid = ?");
                                        sQLitePreparedStatement2.bindInteger(1, i7);
                                        sQLitePreparedStatement2.bindInteger(2, intValue);
                                        sQLitePreparedStatement2.bindLong(3, j13);
                                        sQLitePreparedStatement2.step();
                                        sQLitePreparedStatement2.dispose();
                                        str3 = "DELETE FROM media_v4 WHERE mid = ";
                                        sQLitePreparedStatement2 = null;
                                        try {
                                            try {
                                                sQLitePreparedStatement2 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                                                sQLitePreparedStatement2.bindInteger(1, i7);
                                                sQLitePreparedStatement2.bindInteger(2, intValue);
                                                sQLitePreparedStatement2.bindLong(3, j13);
                                                sQLitePreparedStatement2.step();
                                                sQLitePreparedStatement2.dispose();
                                                str4 = "DELETE FROM media_topics WHERE mid = ";
                                            } catch (Exception unused2) {
                                                SQLiteDatabase sQLiteDatabase9 = this.b;
                                                Locale locale8 = Locale.US;
                                                str4 = "DELETE FROM media_topics WHERE mid = ";
                                                try {
                                                    sQLiteDatabase9.executeFast(str4 + num3 + " AND uid = " + j13).stepThis().dispose();
                                                } catch (Exception e26) {
                                                    e = e26;
                                                    n(e);
                                                    if (sQLitePreparedStatement2 != null) {
                                                    }
                                                    if (ij.g3(i7)) {
                                                    }
                                                    executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                                    executeFast.bindInteger(1, i7);
                                                    executeFast.bindInteger(2, intValue);
                                                    executeFast.step();
                                                    executeFast.dispose();
                                                    return new long[]{j13, num3.intValue()};
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                    sQLitePreparedStatement2.dispose();
                                                } else {
                                                    sQLitePreparedStatement12 = sQLitePreparedStatement2;
                                                }
                                                if (ij.g3(i7)) {
                                                }
                                                executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                                executeFast.bindInteger(1, i7);
                                                executeFast.bindInteger(2, intValue);
                                                executeFast.step();
                                                executeFast.dispose();
                                                return new long[]{j13, num3.intValue()};
                                            }
                                            executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                            executeFast.bindInteger(1, i7);
                                            executeFast.bindInteger(2, intValue);
                                            executeFast.step();
                                            executeFast.dispose();
                                            return new long[]{j13, num3.intValue()};
                                        } catch (Throwable th17) {
                                            th = th17;
                                        }
                                        if (ij.g3(i7)) {
                                        }
                                    } finally {
                                        if (sQLitePreparedStatement2 != null) {
                                            sQLitePreparedStatement2.dispose();
                                        }
                                    }
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                try {
                                    sQLitePreparedStatement2 = this.b.executeFast("UPDATE media_v4 SET mid = ? WHERE mid = ? AND uid = ?");
                                    sQLitePreparedStatement2.bindInteger(1, i7);
                                    sQLitePreparedStatement2.bindInteger(2, intValue);
                                    sQLitePreparedStatement2.bindLong(3, j13);
                                    sQLitePreparedStatement2.step();
                                    sQLitePreparedStatement2.dispose();
                                    str3 = "DELETE FROM media_v4 WHERE mid = ";
                                } catch (Exception unused3) {
                                    SQLiteDatabase sQLiteDatabase10 = this.b;
                                    Locale locale9 = Locale.US;
                                    str3 = "DELETE FROM media_v4 WHERE mid = ";
                                    try {
                                        sQLiteDatabase10.executeFast(str3 + num3 + " AND uid = " + j13).stepThis().dispose();
                                    } catch (Exception e27) {
                                        e = e27;
                                        n(e);
                                        if (sQLitePreparedStatement2 != null) {
                                        }
                                        sQLitePreparedStatement2 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                                        sQLitePreparedStatement2.bindInteger(1, i7);
                                        sQLitePreparedStatement2.bindInteger(2, intValue);
                                        sQLitePreparedStatement2.bindLong(3, j13);
                                        sQLitePreparedStatement2.step();
                                        sQLitePreparedStatement2.dispose();
                                        str4 = "DELETE FROM media_topics WHERE mid = ";
                                        if (ij.g3(i7)) {
                                        }
                                        executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                        executeFast.bindInteger(1, i7);
                                        executeFast.bindInteger(2, intValue);
                                        executeFast.step();
                                        executeFast.dispose();
                                        return new long[]{j13, num3.intValue()};
                                    }
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                        sQLitePreparedStatement2 = null;
                                    }
                                    sQLitePreparedStatement2 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                                    sQLitePreparedStatement2.bindInteger(1, i7);
                                    sQLitePreparedStatement2.bindInteger(2, intValue);
                                    sQLitePreparedStatement2.bindLong(3, j13);
                                    sQLitePreparedStatement2.step();
                                    sQLitePreparedStatement2.dispose();
                                    str4 = "DELETE FROM media_topics WHERE mid = ";
                                    if (ij.g3(i7)) {
                                    }
                                    executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                    executeFast.bindInteger(1, i7);
                                    executeFast.bindInteger(2, intValue);
                                    executeFast.step();
                                    executeFast.dispose();
                                    return new long[]{j13, num3.intValue()};
                                }
                                sQLitePreparedStatement2 = null;
                                try {
                                    sQLitePreparedStatement2 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                                    sQLitePreparedStatement2.bindInteger(1, i7);
                                    sQLitePreparedStatement2.bindInteger(2, intValue);
                                    sQLitePreparedStatement2.bindLong(3, j13);
                                    sQLitePreparedStatement2.step();
                                    sQLitePreparedStatement2.dispose();
                                    str4 = "DELETE FROM media_topics WHERE mid = ";
                                } catch (Exception e28) {
                                    e = e28;
                                    str4 = "DELETE FROM media_topics WHERE mid = ";
                                    n(e);
                                    if (sQLitePreparedStatement2 != null) {
                                    }
                                    if (ij.g3(i7)) {
                                    }
                                    executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                    executeFast.bindInteger(1, i7);
                                    executeFast.bindInteger(2, intValue);
                                    executeFast.step();
                                    executeFast.dispose();
                                    return new long[]{j13, num3.intValue()};
                                }
                                if (ij.g3(i7)) {
                                }
                                try {
                                    executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                                    executeFast.bindInteger(1, i7);
                                    executeFast.bindInteger(2, intValue);
                                    executeFast.step();
                                    executeFast.dispose();
                                } catch (Exception e29) {
                                    e = e29;
                                }
                                return new long[]{j13, num3.intValue()};
                            }
                        } catch (Throwable th18) {
                            th = th18;
                            sQLitePreparedStatement13 = sQLitePreparedStatement2;
                            if (sQLitePreparedStatement13 != null) {
                                sQLitePreparedStatement13.dispose();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception unused4) {
                        sQLitePreparedStatement = null;
                    } catch (Throwable th19) {
                        th = th19;
                        sQLitePreparedStatement = null;
                        sQLitePreparedStatement13 = sQLitePreparedStatement2;
                        if (sQLitePreparedStatement13 != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        throw th;
                    }
                } catch (Exception unused5) {
                    sQLitePreparedStatement2 = null;
                    sQLitePreparedStatement = null;
                } catch (Throwable th20) {
                    th = th20;
                    sQLitePreparedStatement = null;
                    if (sQLitePreparedStatement13 != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                try {
                    try {
                        sQLitePreparedStatement2 = this.b.executeFast("UPDATE media_v4 SET mid = ? WHERE mid = ? AND uid = ?");
                        sQLitePreparedStatement2.bindInteger(1, i7);
                        sQLitePreparedStatement2.bindInteger(2, intValue);
                        sQLitePreparedStatement2.bindLong(3, j13);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        str3 = "DELETE FROM media_v4 WHERE mid = ";
                    } catch (Exception e30) {
                        e = e30;
                        str3 = "DELETE FROM media_v4 WHERE mid = ";
                        n(e);
                        if (sQLitePreparedStatement2 != null) {
                        }
                        sQLitePreparedStatement2 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                        sQLitePreparedStatement2.bindInteger(1, i7);
                        sQLitePreparedStatement2.bindInteger(2, intValue);
                        sQLitePreparedStatement2.bindLong(3, j13);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        str4 = "DELETE FROM media_topics WHERE mid = ";
                        if (ij.g3(i7)) {
                        }
                        executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                        executeFast.bindInteger(1, i7);
                        executeFast.bindInteger(2, intValue);
                        executeFast.step();
                        executeFast.dispose();
                        return new long[]{j13, num3.intValue()};
                    }
                    sQLitePreparedStatement2 = this.b.executeFast("UPDATE media_topics SET mid = ? WHERE mid = ? AND uid = ?");
                    sQLitePreparedStatement2.bindInteger(1, i7);
                    sQLitePreparedStatement2.bindInteger(2, intValue);
                    sQLitePreparedStatement2.bindLong(3, j13);
                    sQLitePreparedStatement2.step();
                    sQLitePreparedStatement2.dispose();
                    str4 = "DELETE FROM media_topics WHERE mid = ";
                    if (ij.g3(i7)) {
                        try {
                            SQLiteDatabase sQLiteDatabase11 = this.b;
                            Locale locale10 = Locale.US;
                            sQLiteDatabase11.executeFast(str3 + num3 + " AND uid = " + j13).stepThis().dispose();
                            this.b.executeFast(str4 + num3 + " AND uid = " + j13).stepThis().dispose();
                        } catch (Exception e31) {
                            n(e31);
                        }
                    }
                    executeFast = this.b.executeFast("UPDATE dialogs SET last_mid = ? WHERE last_mid = ?");
                    try {
                        executeFast.bindInteger(1, i7);
                        executeFast.bindInteger(2, intValue);
                        executeFast.step();
                        executeFast.dispose();
                    } catch (Exception e32) {
                        e = e32;
                        sQLitePreparedStatement12 = executeFast;
                        n(e);
                        if (sQLitePreparedStatement12 != null) {
                            sQLitePreparedStatement12.dispose();
                        }
                        return new long[]{j13, num3.intValue()};
                    } catch (Throwable th21) {
                        th = th21;
                        sQLitePreparedStatement12 = executeFast;
                        if (sQLitePreparedStatement12 != null) {
                            sQLitePreparedStatement12.dispose();
                        }
                        throw th;
                    }
                } finally {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                }
                sQLitePreparedStatement2 = null;
            } else if (i18 == 1) {
                try {
                    try {
                        executeFast2 = this.b.executeFast("UPDATE scheduled_messages_v2 SET mid = ?, send_state = 0 WHERE mid = ? AND uid = ?");
                    } catch (Exception unused6) {
                    }
                } catch (Throwable th22) {
                    th = th22;
                    if (sQLitePreparedStatement11 != null) {
                        sQLitePreparedStatement11.dispose();
                    }
                    throw th;
                }
                try {
                    executeFast2.bindInteger(1, i7);
                    executeFast2.bindInteger(2, intValue);
                    executeFast2.bindLong(3, j13);
                    executeFast2.step();
                    executeFast2.dispose();
                } catch (Exception unused7) {
                    sQLitePreparedStatement11 = executeFast2;
                    try {
                        SQLiteDatabase sQLiteDatabase12 = this.b;
                        Locale locale11 = Locale.US;
                        sQLiteDatabase12.executeFast("DELETE FROM scheduled_messages_v2 WHERE mid = " + num3 + " AND uid = " + j13).stepThis().dispose();
                    } catch (Exception e33) {
                        n(e33);
                        if (sQLitePreparedStatement11 != null) {
                            sQLitePreparedStatement11.dispose();
                        }
                        return new long[]{j13, num3.intValue()};
                    }
                    if (sQLitePreparedStatement11 != null) {
                    }
                    return new long[]{j13, num3.intValue()};
                } catch (Throwable th23) {
                    th = th23;
                    sQLitePreparedStatement11 = executeFast2;
                    if (sQLitePreparedStatement11 != null) {
                    }
                    throw th;
                }
            } else {
                try {
                    if (i18 == 2) {
                        try {
                            executeFast3 = this.b.executeFast("UPDATE quick_replies_messages SET mid = ?, topic_id = ?, send_state = 0 WHERE mid = ? AND topic_id = ?");
                        } catch (Exception unused8) {
                        }
                        try {
                            executeFast3.bindInteger(1, i7);
                            executeFast3.bindInteger(2, i12);
                            executeFast3.bindInteger(3, intValue);
                            executeFast3.bindLong(4, i14);
                            executeFast3.step();
                            executeFast3.dispose();
                        } catch (Exception unused9) {
                            sQLitePreparedStatement10 = executeFast3;
                            try {
                                SQLiteDatabase sQLiteDatabase13 = this.b;
                                Locale locale12 = Locale.US;
                                sQLiteDatabase13.executeFast("DELETE FROM quick_replies_messages WHERE mid = " + num3 + " AND topic_id = " + i14).stepThis().dispose();
                            } catch (Exception e34) {
                                n(e34);
                            }
                            if (sQLitePreparedStatement10 != null) {
                                sQLitePreparedStatement10.dispose();
                            }
                            return new long[]{j13, num3.intValue()};
                        } catch (Throwable th24) {
                            th = th24;
                            sQLitePreparedStatement10 = executeFast3;
                            if (sQLitePreparedStatement10 != null) {
                                sQLitePreparedStatement10.dispose();
                            }
                            throw th;
                        }
                    } else {
                        try {
                            if (i18 == 3) {
                                try {
                                    executeFast4 = this.b.executeFast("UPDATE welcome_messages SET mid = ?, dialog_id = ?, send_state = 0 WHERE mid = ? AND dialog_id = ?");
                                } catch (Exception unused10) {
                                }
                                try {
                                    executeFast4.bindInteger(1, i7);
                                    executeFast4.bindInteger(2, i12);
                                    executeFast4.bindInteger(3, intValue);
                                    executeFast4.bindLong(4, j12);
                                    executeFast4.step();
                                    executeFast4.dispose();
                                } catch (Exception unused11) {
                                    sQLitePreparedStatement9 = executeFast4;
                                    try {
                                        SQLiteDatabase sQLiteDatabase14 = this.b;
                                        Locale locale13 = Locale.US;
                                        sQLiteDatabase14.executeFast("DELETE FROM welcome_messages WHERE mid = " + num3 + " AND dialog_id = " + j12).stepThis().dispose();
                                    } catch (Exception e35) {
                                        n(e35);
                                    }
                                    if (sQLitePreparedStatement9 != null) {
                                        sQLitePreparedStatement9.dispose();
                                    }
                                    return new long[]{j13, num3.intValue()};
                                } catch (Throwable th25) {
                                    th = th25;
                                    sQLitePreparedStatement9 = executeFast4;
                                    if (sQLitePreparedStatement9 != null) {
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th26) {
                            th = th26;
                            if (sQLitePreparedStatement9 != null) {
                                sQLitePreparedStatement9.dispose();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th27) {
                    th = th27;
                }
            }
            return new long[]{j13, num3.intValue()};
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z9) {
        long j3;
        int i7;
        TLRPC.Document G0 = ij.G0(message);
        TLRPC.Photo D1 = ij.D1(message);
        int i10 = 0;
        if (!ij.S4(message)) {
            if (ij.x4(message) || ij.M2(message)) {
                if (G0 != null) {
                    j3 = G0.id;
                    i7 = 1;
                }
                return false;
            }
            if (ij.M4(message) || ij.k4(message) || ij.u3(message)) {
                if (G0 != null) {
                    j3 = G0.id;
                    i7 = 4;
                }
                return false;
            }
            if (G0 != null) {
                if (getMediaDataController().z0.c(G0.id) != null) {
                    return false;
                }
                j3 = G0.id;
                i7 = 8;
            } else if (D1 == null || w7.w(D1.sizes, g0.Z0(false), false, null, false) == null) {
                j3 = 0;
                i7 = 0;
            } else {
                j3 = D1.id;
                i7 = 1;
            }
            if (j3 != 0) {
            }
            if (D1 != null) {
            }
            return true;
        }
        if (G0 == null || getMediaDataController().z0.c(G0.id) != null) {
            return false;
        }
        j3 = G0.id;
        i7 = 2;
        if (j3 != 0) {
            arrayList2.add(new Pair(Long.valueOf(j3), Integer.valueOf(i7)));
        }
        if (D1 != null) {
            if (G0 != null) {
                String r10 = w7.r(null, G0);
                if (!TextUtils.isEmpty(r10)) {
                    arrayList3.add(r10);
                }
                getFileLoader().getClass();
                File J = w7.J(G0, null, z9, true);
                if (J.toString().length() > 0) {
                    arrayList.add(J);
                }
                int size = G0.thumbs.size();
                while (i10 < size) {
                    TLRPC.PhotoSize photoSize = G0.thumbs.get(i10);
                    getFileLoader().getClass();
                    File I = w7.I(photoSize);
                    if (I.toString().length() > 0) {
                        arrayList.add(I);
                    }
                    i10++;
                }
            }
            return false;
        }
        int size2 = D1.sizes.size();
        while (i10 < size2) {
            TLRPC.PhotoSize photoSize2 = D1.sizes.get(i10);
            String r11 = w7.r(null, photoSize2);
            if (!TextUtils.isEmpty(r11)) {
                arrayList3.add(r11);
            }
            getFileLoader().getClass();
            File J2 = w7.J(photoSize2, null, z9, true);
            if (J2.toString().length() > 0) {
                arrayList.add(J2);
            }
            i10++;
        }
        return true;
    }

    public final TLRPC.Message b0(long j3, long j10) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        this.a.c(new l9(this, j3, j10, atomicReference, countDownLatch, 5));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return (TLRPC.Message) atomicReference.get();
    }

    public final void b1(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLitePreparedStatement executeFast = this.b.executeFast("REPLACE INTO chats VALUES(?, ?, ?)");
        for (int i7 = 0; i7 < list.size(); i7++) {
            TLRPC.Chat chat = (TLRPC.Chat) list.get(i7);
            if (chat.min) {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a8.p0.o(chat.id, "SELECT data FROM chats WHERE uid = "), new Object[0]);
                if (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Chat TLdeserialize = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                            if (TLdeserialize != null) {
                                TLdeserialize.title = chat.title;
                                TLdeserialize.photo = chat.photo;
                                TLdeserialize.broadcast = chat.broadcast;
                                TLdeserialize.verified = chat.verified;
                                TLdeserialize.megagroup = chat.megagroup;
                                TLdeserialize.call_not_empty = chat.call_not_empty;
                                TLdeserialize.call_active = chat.call_active;
                                TLdeserialize.monoforum = chat.monoforum;
                                TLdeserialize.broadcast_messages_allowed = chat.broadcast_messages_allowed;
                                if ((chat.flags2 & 262144) != 0) {
                                    TLdeserialize.linked_monoforum_id = chat.linked_monoforum_id;
                                    TLdeserialize.flags2 |= 262144;
                                }
                                if (c8.zc.a(chat.flags2, TLObject.FLAG_20)) {
                                    TLdeserialize.linked_community_id = chat.linked_community_id;
                                    TLdeserialize.flags2 |= TLObject.FLAG_20;
                                }
                                TLRPC.TL_chatBannedRights tL_chatBannedRights = chat.default_banned_rights;
                                if (tL_chatBannedRights != null) {
                                    TLdeserialize.default_banned_rights = tL_chatBannedRights;
                                    TLdeserialize.flags |= 262144;
                                }
                                TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
                                if (tL_chatAdminRights != null) {
                                    TLdeserialize.admin_rights = tL_chatAdminRights;
                                    TLdeserialize.flags |= TLObject.FLAG_14;
                                }
                                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = chat.banned_rights;
                                if (tL_chatBannedRights2 != null) {
                                    TLdeserialize.banned_rights = tL_chatBannedRights2;
                                    TLdeserialize.flags |= 32768;
                                }
                                String str = chat.username;
                                if (str != null) {
                                    TLdeserialize.username = str;
                                    TLdeserialize.flags |= 64;
                                } else {
                                    TLdeserialize.username = null;
                                    TLdeserialize.flags &= -65;
                                }
                                int i10 = chat.participants_count;
                                if (i10 > 0) {
                                    TLdeserialize.participants_count = i10;
                                }
                                chat = TLdeserialize;
                            }
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                queryFinalized.dispose();
            }
            executeFast.requery();
            chat.flags |= 131072;
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(chat.getObjectSize());
            chat.serializeToStream(nativeByteBuffer);
            executeFast.bindLong(1, chat.id);
            String str2 = chat.title;
            if (str2 != null) {
                executeFast.bindString(2, str2.toLowerCase());
            } else {
                executeFast.bindString(2, "");
            }
            executeFast.bindByteBuffer(3, nativeByteBuffer);
            executeFast.step();
            nativeByteBuffer.reuse();
            this.R.delete(-chat.id);
        }
        executeFast.dispose();
    }

    public final void b2(final int i7, final long j3, final long j10, final String str, final boolean z9) {
        this.a.c(new Runnable() { // from class: org.telegram.messenger.sq
            @Override // java.lang.Runnable
            public final void run() {
                TLRPC.TL_message e02;
                SQLitePreparedStatement executeFast;
                yr yrVar = yr.this;
                int i10 = i7;
                long j11 = j3;
                boolean z10 = z9;
                long j12 = j10;
                String str2 = str;
                SQLitePreparedStatement sQLitePreparedStatement = null;
                try {
                    try {
                        yrVar.b.beginTransaction();
                        e02 = yrVar.e0(i10, j11);
                        e02.voiceTranscriptionFinal = z10;
                        e02.voiceTranscriptionId = j12;
                        e02.voiceTranscription = str2;
                        executeFast = yrVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?");
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    executeFast.requery();
                    NativeByteBuffer c10 = xi.c(e02);
                    if (c10 != null) {
                        executeFast.bindByteBuffer(1, c10);
                    } else {
                        executeFast.bindNull(1);
                    }
                    executeFast.bindInteger(2, i10);
                    executeFast.bindLong(3, j11);
                    executeFast.step();
                    executeFast.dispose();
                    yrVar.b.commitTransaction();
                    if (c10 != null) {
                        c10.reuse();
                    }
                    SQLiteDatabase sQLiteDatabase = yrVar.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                    }
                } catch (Exception e11) {
                    e = e11;
                    sQLitePreparedStatement = executeFast;
                    yrVar.o(e, true);
                    SQLiteDatabase sQLiteDatabase2 = yrVar.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = executeFast;
                    SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            }
        });
    }

    public final TLRPC.Message c0(long j3, long j10) {
        TLRPC.Message message;
        SQLiteCursor sQLiteCursor = null;
        TLRPC.Message message2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        try {
            try {
                SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j3 + " AND mid = " + j10 + " LIMIT 1", new Object[0]);
                while (queryFinalized.next()) {
                    try {
                        NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                TLdeserialize.readAttachPath(byteBufferValue, getUserConfig().n);
                            }
                            byteBufferValue.reuse();
                            message2 = TLdeserialize;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        TLRPC.Message message3 = message2;
                        sQLiteCursor = queryFinalized;
                        message = message3;
                        o(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        return message;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor2 = queryFinalized;
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                        }
                        throw th;
                    }
                }
                queryFinalized.dispose();
                return message2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
            message = null;
        }
    }

    public final void c1(ArrayList arrayList, boolean z9) {
        if (!arrayList.isEmpty() || z9) {
            this.a.c(new dq(this, z9, new ArrayList(arrayList)));
        }
    }

    public final void c2(final long j3, final ArrayList arrayList, final boolean z9, final int i7, final int i10, final boolean z10, final HashMap hashMap) {
        this.a.c(new Runnable() { // from class: org.telegram.messenger.pr
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0353  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x0358  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x035d  */
            /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:73:0x0365  */
            /* JADX WARN: Removed duplicated region for block: B:75:0x036a  */
            /* JADX WARN: Removed duplicated region for block: B:77:0x036f  */
            /* JADX WARN: Type inference failed for: r10v10 */
            /* JADX WARN: Type inference failed for: r10v2 */
            /* JADX WARN: Type inference failed for: r10v21 */
            /* JADX WARN: Type inference failed for: r10v23, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r10v24 */
            /* JADX WARN: Type inference failed for: r10v3, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r2v3 */
            /* JADX WARN: Type inference failed for: r2v36 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void run() {
                SQLitePreparedStatement sQLitePreparedStatement;
                Object obj;
                SQLitePreparedStatement sQLitePreparedStatement2;
                SQLiteDatabase sQLiteDatabase;
                boolean z11;
                SQLiteDatabase sQLiteDatabase2;
                ArrayList arrayList2;
                HashMap hashMap2;
                int i11;
                int i12;
                int max;
                final ?? r10;
                SQLiteCursor queryFinalized;
                int i13;
                int i14;
                boolean z12;
                int max2;
                final ?? r102;
                NativeByteBuffer nativeByteBuffer;
                int i15 = i7;
                final yr yrVar = yr.this;
                boolean z13 = z9;
                final HashMap hashMap3 = hashMap;
                int i16 = i10;
                final long j10 = j3;
                ArrayList arrayList3 = arrayList;
                SQLiteCursor sQLiteCursor = null;
                try {
                    if (z13) {
                        yrVar.b.beginTransaction();
                        if (hashMap3 != null) {
                            if (i16 == 0) {
                                yrVar.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j10).stepThis().dispose();
                            }
                            i13 = 0;
                        } else {
                            SQLiteDatabase sQLiteDatabase3 = yrVar.b;
                            Locale locale = Locale.US;
                            queryFinalized = sQLiteDatabase3.queryFinalized("SELECT COUNT(mid) FROM chat_pinned_v2 WHERE uid = " + j10 + " AND mid IN (" + TextUtils.join(",", arrayList3) + ")", new Object[0]);
                            try {
                                int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                queryFinalized.dispose();
                                i13 = intValue;
                            } catch (Exception e10) {
                                e = e10;
                                sQLiteCursor = queryFinalized;
                                obj = null;
                                z11 = true;
                                sQLitePreparedStatement2 = obj;
                                yrVar.o(e, z11);
                                sQLiteDatabase2 = yrVar.b;
                                if (sQLiteDatabase2 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement2 == 0) {
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = queryFinalized;
                                sQLitePreparedStatement = null;
                                sQLiteDatabase = yrVar.b;
                                if (sQLiteDatabase != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        sQLitePreparedStatement2 = yrVar.b.executeFast("REPLACE INTO chat_pinned_v2 VALUES(?, ?, ?)");
                        try {
                            try {
                                int size = arrayList3.size();
                                int i17 = 0;
                                while (i17 < size) {
                                    Integer num = (Integer) arrayList3.get(i17);
                                    sQLitePreparedStatement2.requery();
                                    ArrayList arrayList4 = arrayList3;
                                    sQLitePreparedStatement2.bindLong(1, j10);
                                    int i18 = i16;
                                    sQLitePreparedStatement2.bindInteger(2, num.intValue());
                                    ij ijVar = hashMap3 != null ? (ij) hashMap3.get(num) : null;
                                    if (ijVar != null) {
                                        nativeByteBuffer = new NativeByteBuffer(ijVar.k.getObjectSize());
                                        ijVar.k.serializeToStream(nativeByteBuffer);
                                        sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer);
                                    } else {
                                        sQLitePreparedStatement2.bindNull(3);
                                        nativeByteBuffer = null;
                                    }
                                    sQLitePreparedStatement2.step();
                                    if (nativeByteBuffer != null) {
                                        nativeByteBuffer.reuse();
                                    }
                                    i17++;
                                    arrayList3 = arrayList4;
                                    i16 = i18;
                                }
                                final ArrayList arrayList5 = arrayList3;
                                final int i19 = i16;
                                sQLitePreparedStatement2.dispose();
                                yrVar.b.commitTransaction();
                                SQLiteDatabase sQLiteDatabase4 = yrVar.b;
                                Locale locale2 = Locale.US;
                                queryFinalized = sQLiteDatabase4.queryFinalized("SELECT COUNT(mid) FROM chat_pinned_v2 WHERE uid = " + j10, new Object[0]);
                                int intValue2 = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                                queryFinalized.dispose();
                                if (hashMap3 != null) {
                                    max2 = Math.max(i15, intValue2);
                                    r102 = z10;
                                } else {
                                    SQLiteCursor queryFinalized2 = yrVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + j10, new Object[0]);
                                    if (queryFinalized2.next()) {
                                        i14 = queryFinalized2.intValue(0);
                                        if (queryFinalized2.intValue(1) != 0) {
                                            z12 = true;
                                            queryFinalized2.dispose();
                                            max2 = Math.max((arrayList5.size() - i13) + i14, intValue2);
                                            r102 = z12;
                                        }
                                    } else {
                                        i14 = 0;
                                    }
                                    z12 = false;
                                    queryFinalized2.dispose();
                                    max2 = Math.max((arrayList5.size() - i13) + i14, intValue2);
                                    r102 = z12;
                                }
                                sQLitePreparedStatement2 = yrVar.b.executeFast("REPLACE INTO chat_pinned_count VALUES(?, ?, ?)");
                                sQLitePreparedStatement2.requery();
                                sQLitePreparedStatement2.bindLong(1, j10);
                                sQLitePreparedStatement2.bindInteger(2, max2);
                                sQLitePreparedStatement2.bindInteger(3, r102);
                                sQLitePreparedStatement2.step();
                                sQLitePreparedStatement2.dispose();
                                final int i20 = 0;
                                final int i21 = max2;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.vq
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i22 = i20;
                                        boolean z14 = r102;
                                        int i23 = i21;
                                        int i24 = i19;
                                        HashMap hashMap4 = hashMap3;
                                        ArrayList arrayList6 = arrayList5;
                                        long j11 = j10;
                                        yr yrVar2 = yrVar;
                                        switch (i22) {
                                            case 0:
                                                yrVar2.getNotificationCenter().k(56, Long.valueOf(j11), arrayList6, Boolean.TRUE, null, hashMap4, Integer.valueOf(i24), Integer.valueOf(i23), Boolean.valueOf(z14));
                                                break;
                                            default:
                                                yrVar2.getNotificationCenter().k(56, Long.valueOf(j11), arrayList6, Boolean.FALSE, null, hashMap4, Integer.valueOf(i24), Integer.valueOf(i23), Boolean.valueOf(z14));
                                                break;
                                        }
                                    }
                                });
                            } catch (Exception e11) {
                                e = e11;
                                obj = sQLitePreparedStatement2;
                                z11 = true;
                                sQLitePreparedStatement2 = obj;
                                yrVar.o(e, z11);
                                sQLiteDatabase2 = yrVar.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement2 == 0) {
                                    sQLitePreparedStatement2.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            sQLitePreparedStatement = sQLitePreparedStatement2;
                            sQLiteDatabase = yrVar.b;
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.commitTransaction();
                            }
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    } else {
                        if (arrayList3 == null) {
                            yrVar.b.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j10).stepThis().dispose();
                            if (m5.z(j10)) {
                                SQLiteDatabase sQLiteDatabase5 = yrVar.b;
                                Locale locale3 = Locale.US;
                                sQLiteDatabase5.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + (-j10)).stepThis().dispose();
                            } else {
                                SQLiteDatabase sQLiteDatabase6 = yrVar.b;
                                Locale locale4 = Locale.US;
                                sQLiteDatabase6.executeFast("UPDATE user_settings SET pinned = 0 WHERE uid = " + j10).stepThis().dispose();
                            }
                            arrayList2 = arrayList3;
                            hashMap2 = hashMap3;
                            i11 = i16;
                            max = 0;
                            r10 = 1;
                        } else {
                            String join = TextUtils.join(",", arrayList3);
                            if (m5.z(j10)) {
                                SQLiteDatabase sQLiteDatabase7 = yrVar.b;
                                Locale locale5 = Locale.US;
                                arrayList2 = arrayList3;
                                hashMap2 = hashMap3;
                                i11 = i16;
                                sQLiteDatabase7.executeFast("UPDATE chat_settings_v2 SET pinned = 0 WHERE uid = " + (-j10) + " AND pinned IN (" + join + ")").stepThis().dispose();
                            } else {
                                arrayList2 = arrayList3;
                                hashMap2 = hashMap3;
                                i11 = i16;
                                SQLiteDatabase sQLiteDatabase8 = yrVar.b;
                                Locale locale6 = Locale.US;
                                sQLiteDatabase8.executeFast("UPDATE user_settings SET pinned = 0 WHERE uid = " + j10 + " AND pinned IN (" + join + ")").stepThis().dispose();
                            }
                            SQLiteDatabase sQLiteDatabase9 = yrVar.b;
                            Locale locale7 = Locale.US;
                            sQLiteDatabase9.executeFast("DELETE FROM chat_pinned_v2 WHERE uid = " + j10 + " AND mid IN(" + join + ")").stepThis().dispose();
                            SQLiteCursor queryFinalized3 = yrVar.b.queryFinalized("SELECT changes()", new Object[0]);
                            try {
                                int intValue3 = queryFinalized3.next() ? queryFinalized3.intValue(0) : 0;
                                queryFinalized3.dispose();
                                SQLiteCursor queryFinalized4 = yrVar.b.queryFinalized("SELECT COUNT(mid) FROM chat_pinned_v2 WHERE uid = " + j10, new Object[0]);
                                int intValue4 = queryFinalized4.next() ? queryFinalized4.intValue(0) : 0;
                                queryFinalized4.dispose();
                                boolean z14 = false;
                                queryFinalized3 = yrVar.b.queryFinalized("SELECT count, end FROM chat_pinned_count WHERE uid = " + j10, new Object[0]);
                                if (queryFinalized3.next()) {
                                    i12 = Math.max(0, queryFinalized3.intValue(0) - intValue3);
                                    if (queryFinalized3.intValue(1) != 0) {
                                        z14 = true;
                                    }
                                } else {
                                    i12 = 0;
                                }
                                queryFinalized3.dispose();
                                max = Math.max(intValue4, i12);
                                r10 = z14;
                            } catch (Exception e12) {
                                e = e12;
                                sQLitePreparedStatement2 = 0;
                                z11 = true;
                                sQLiteCursor = queryFinalized3;
                                yrVar.o(e, z11);
                                sQLiteDatabase2 = yrVar.b;
                                if (sQLiteDatabase2 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement2 == 0) {
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement = null;
                                sQLiteCursor = queryFinalized3;
                                sQLiteDatabase = yrVar.b;
                                if (sQLiteDatabase != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        SQLitePreparedStatement executeFast = yrVar.b.executeFast("REPLACE INTO chat_pinned_count VALUES(?, ?, ?)");
                        try {
                            executeFast.requery();
                            executeFast.bindLong(1, j10);
                            executeFast.bindInteger(2, max);
                            executeFast.bindInteger(3, r10);
                            executeFast.step();
                            executeFast.dispose();
                            final int i22 = 1;
                            final int i23 = max;
                            final HashMap hashMap4 = hashMap2;
                            final ArrayList arrayList6 = arrayList2;
                            final int i24 = i11;
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.vq
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i222 = i22;
                                    boolean z142 = r10;
                                    int i232 = i23;
                                    int i242 = i24;
                                    HashMap hashMap42 = hashMap4;
                                    ArrayList arrayList62 = arrayList6;
                                    long j11 = j10;
                                    yr yrVar2 = yrVar;
                                    switch (i222) {
                                        case 0:
                                            yrVar2.getNotificationCenter().k(56, Long.valueOf(j11), arrayList62, Boolean.TRUE, null, hashMap42, Integer.valueOf(i242), Integer.valueOf(i232), Boolean.valueOf(z142));
                                            break;
                                        default:
                                            yrVar2.getNotificationCenter().k(56, Long.valueOf(j11), arrayList62, Boolean.FALSE, null, hashMap42, Integer.valueOf(i242), Integer.valueOf(i232), Boolean.valueOf(z142));
                                            break;
                                    }
                                }
                            });
                        } catch (Exception e13) {
                            e = e13;
                            obj = executeFast;
                            z11 = true;
                            sQLitePreparedStatement2 = obj;
                            yrVar.o(e, z11);
                            sQLiteDatabase2 = yrVar.b;
                            if (sQLiteDatabase2 != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement2 == 0) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            sQLitePreparedStatement = executeFast;
                            sQLiteDatabase = yrVar.b;
                            if (sQLiteDatabase != null) {
                            }
                            if (sQLiteCursor != null) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    SQLiteDatabase sQLiteDatabase10 = yrVar.b;
                    if (sQLiteDatabase10 != null) {
                        sQLiteDatabase10.commitTransaction();
                    }
                } catch (Exception e14) {
                    e = e14;
                    obj = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement = null;
                }
            }
        });
    }

    public final void d1(TLRPC.messages_Dialogs messages_dialogs, int i7) {
        if (messages_dialogs.dialogs.isEmpty()) {
            return;
        }
        this.a.c(new l7(this, messages_dialogs, i7, 18));
    }

    public final void d2(long j3, long j10, int i7, int i10) {
        this.a.c(new mg(this, j3, j10, i7, i10, 2));
    }

    public final TLRPC.TL_message e0(int i7, long j3) {
        SQLiteCursor queryFinalized;
        boolean z9;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                queryFinalized = this.b.queryFinalized("SELECT custom_params FROM messages_v2 WHERE mid = ? AND uid = ?", Integer.valueOf(i7), Long.valueOf(j3));
            } catch (SQLiteException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (queryFinalized.next()) {
                xi.b(tL_message, queryFinalized.byteBufferValue(0));
                z9 = true;
            } else {
                z9 = false;
            }
            queryFinalized.dispose();
            if (!z9) {
                sQLiteCursor = this.b.queryFinalized("SELECT custom_params FROM messages_topics WHERE mid = ? AND uid = ?", Integer.valueOf(i7), Long.valueOf(j3));
                if (sQLiteCursor.next()) {
                    xi.b(tL_message, sQLiteCursor.byteBufferValue(0));
                }
                sQLiteCursor.dispose();
                return tL_message;
            }
        } catch (SQLiteException e11) {
            e = e11;
            sQLiteCursor = queryFinalized;
            o(e, true);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            return tL_message;
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
        return tL_message;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void e1(org.telegram.tgnet.TLRPC.messages_Dialogs r31, int r32) {
        /*
            Method dump skipped, instructions count: 1861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yr.e1(org.telegram.tgnet.TLRPC$messages_Dialogs, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e2(final long j3, final long j10, final int i7, int i10) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        boolean z9;
        String str;
        String str2;
        int i11;
        final int i12;
        final int i13;
        SQLiteCursor sQLiteCursor4;
        TLRPC.MessageReplies messageReplies;
        NativeByteBuffer byteBufferValue;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (u0(13, j3)) {
                    str = " AND read_state IN(0, 1) AND out = 0";
                    str2 = "UPDATE messages_topics SET read_state = read_state | 2 WHERE uid = ";
                } else {
                    SQLitePreparedStatement executeFast = this.b.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
                    try {
                        SQLiteDatabase sQLiteDatabase = this.b;
                        Locale locale = Locale.US;
                        str = " AND read_state IN(0, 1) AND out = 0";
                        str2 = "UPDATE messages_topics SET read_state = read_state | 2 WHERE uid = ";
                        sQLiteCursor4 = sQLiteDatabase.queryFinalized("SELECT replies_data FROM messages_v2 WHERE mid = " + j10 + " AND uid = " + j3, new Object[0]);
                        try {
                            if (!sQLiteCursor4.next() || (byteBufferValue = sQLiteCursor4.byteBufferValue(0)) == null) {
                                messageReplies = null;
                            } else {
                                messageReplies = TLRPC.MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                            }
                            sQLiteCursor4.dispose();
                            if (messageReplies != null) {
                                messageReplies.read_max_id = i7;
                                executeFast.requery();
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageReplies.getObjectSize());
                                messageReplies.serializeToStream(nativeByteBuffer);
                                executeFast.bindByteBuffer(1, nativeByteBuffer);
                                executeFast.bindInteger(2, (int) j10);
                                executeFast.bindLong(3, j3);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                            }
                            executeFast.dispose();
                        } catch (Exception e10) {
                            e = e10;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor2 = sQLiteCursor4;
                            z9 = true;
                            sQLiteCursor3 = sQLiteCursor2;
                            o(e, z9);
                            if (sQLitePreparedStatement != null) {
                            }
                            if (sQLiteCursor3 != null) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            sQLitePreparedStatement = executeFast;
                            sQLiteCursor = sQLiteCursor4;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            if (sQLiteCursor != 0) {
                                sQLiteCursor.dispose();
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        sQLiteCursor3 = null;
                        z9 = true;
                        sQLitePreparedStatement = executeFast;
                        o(e, z9);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor3 != null) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteCursor4 = null;
                    }
                }
                SQLiteDatabase sQLiteDatabase2 = this.b;
                Locale locale2 = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT max_read_id FROM topics WHERE did = " + j3 + " AND topic_id = " + j10, new Object[0]);
                try {
                    boolean z10 = queryFinalized.next() && i7 >= queryFinalized.intValue(0);
                    queryFinalized.dispose();
                    this.b.executeFast("UPDATE messages_topics SET read_state = read_state | 1 WHERE uid = " + j3 + " AND topic_id = " + j10 + " AND mid <= " + i7 + " AND read_state IN(0, 2) AND out = 0").stepThis().dispose();
                    SQLiteDatabase sQLiteDatabase3 = this.b;
                    StringBuilder sb2 = new StringBuilder(str2);
                    sb2.append(j3);
                    sb2.append(" AND topic_id = ");
                    sb2.append(j10);
                    sb2.append(" AND mid <= ");
                    sb2.append(i7);
                    String str3 = str;
                    sb2.append(str3);
                    sQLiteDatabase3.executeFast(sb2.toString()).stepThis().dispose();
                    if (i10 < 0) {
                        SQLiteCursor queryFinalized2 = this.b.queryFinalized("SELECT count(mid) FROM messages_topics WHERE uid = " + j3 + " AND topic_id = " + j10 + " AND mid > " + i7 + " AND read_state IN(0, 2) AND out = 0", new Object[0]);
                        int intValue = queryFinalized2.next() ? queryFinalized2.intValue(0) : 0;
                        queryFinalized2.dispose();
                        if (intValue == 0) {
                            i12 = intValue;
                            i13 = 0;
                            if (z10) {
                                return;
                            }
                            if (i13 >= 0) {
                                boolean z11 = r2.a;
                                SQLiteDatabase sQLiteDatabase4 = this.b;
                                Locale locale3 = Locale.ENGLISH;
                                sQLiteDatabase4.executeFast("UPDATE topics SET max_read_id = " + i7 + ", unread_count = " + i12 + ", unread_mentions = " + i13 + " WHERE did = " + j3 + " AND topic_id = " + j10).stepThis().dispose();
                            } else {
                                SQLiteDatabase sQLiteDatabase5 = this.b;
                                Locale locale4 = Locale.ENGLISH;
                                sQLiteDatabase5.executeFast("UPDATE topics SET max_read_id = " + i7 + ", unread_count = " + i12 + " WHERE did = " + j3 + " AND topic_id = " + j10).stepThis().dispose();
                            }
                            g0.h3(new Runnable() { // from class: org.telegram.messenger.nr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    k00 k00Var = yr.this.getMessagesController().q7;
                                    long j11 = -j3;
                                    TLRPC.TL_forumTopic f10 = k00Var.f(j11, j10);
                                    if (f10 != null) {
                                        f10.read_inbox_max_id = i7;
                                        f10.unread_count = i12;
                                        int i14 = i13;
                                        if (i14 >= 0) {
                                            f10.unread_mentions_count = i14;
                                        }
                                        k00Var.y(j11, true);
                                    }
                                }
                            });
                            u1(j3);
                            return;
                        }
                        SQLiteCursor queryFinalized3 = this.b.queryFinalized("SELECT count(mid) FROM messages_topics WHERE uid = " + j3 + " AND topic_id = " + j10 + " AND mid > " + i7 + str3, new Object[0]);
                        int intValue2 = queryFinalized3.next() ? queryFinalized3.intValue(0) : -1;
                        queryFinalized3.dispose();
                        if (u0(4, j3)) {
                            i11 = 0;
                        } else {
                            queryFinalized = this.b.queryFinalized("SELECT unread_mentions FROM topics WHERE did = " + j3 + " AND topic_id = " + j10, new Object[0]);
                            i11 = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
                            queryFinalized.dispose();
                        }
                        if (intValue2 <= i11) {
                            i11 = intValue2;
                        }
                        i12 = intValue;
                        i13 = i11;
                        if (z10) {
                        }
                    } else {
                        i11 = 0;
                        i12 = i10;
                        if (i10 != 0) {
                            i13 = -1;
                            if (z10) {
                            }
                        }
                        i13 = i11;
                        if (z10) {
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    sQLiteCursor2 = queryFinalized;
                    z9 = true;
                    sQLiteCursor3 = sQLiteCursor2;
                    o(e, z9);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (sQLiteCursor3 != null) {
                        sQLiteCursor3.dispose();
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                sQLiteCursor = " AND read_state IN(0, 1) AND out = 0";
            }
        } catch (Exception e13) {
            e = e13;
            sQLiteCursor2 = null;
        } catch (Throwable th5) {
            th = th5;
            sQLiteCursor = 0;
        }
    }

    public final void f(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.c(new lg((Object) this, (Object) str, (Object) str2, 19));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    public final org.telegram.messenger.cr f0(long r83, long r85, int r87, int r88, int r89, int r90, int r91, int r92, int r93, long r94, int r96, boolean r97, boolean r98, org.telegram.messenger.a00 r99) {
        /*
            Method dump skipped, instructions count: 9534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yr.f0(long, long, int, int, int, int, int, int, int, long, int, boolean, boolean, org.telegram.messenger.a00):org.telegram.messenger.cr");
    }

    public final void f1(ArrayList arrayList, boolean z9) {
        if (arrayList.isEmpty()) {
            return;
        }
        I(new dq(this, arrayList, z9, 1));
    }

    public final void f2(long j3, TLRPC.TL_forumTopic tL_forumTopic, int i7) {
        int currentTime = getConnectionsManager().getCurrentTime();
        if (tL_forumTopic == null) {
            return;
        }
        this.a.c(new b1(this, i7, tL_forumTopic, j3, currentTime));
    }

    public final void g(SQLitePreparedStatement sQLitePreparedStatement, TLRPC.Message message) {
        ArrayList<TLRPC.ReactionCount> arrayList;
        long e10 = getUserConfig().e();
        TLRPC.TL_messageReactions tL_messageReactions = message.reactions;
        if (tL_messageReactions == null || !tL_messageReactions.reactions_as_tags || (arrayList = tL_messageReactions.results) == null || arrayList.isEmpty()) {
            return;
        }
        id E0 = id.E0();
        String str = message.message;
        if (str == null) {
            str = "";
        }
        int i7 = 0;
        String S0 = E0.S0(str, true, false);
        ArrayList<TLRPC.ReactionCount> arrayList2 = message.reactions.results;
        int size = arrayList2.size();
        while (i7 < size) {
            TLRPC.ReactionCount reactionCount = arrayList2.get(i7);
            i7++;
            TLRPC.ReactionCount reactionCount2 = reactionCount;
            TLRPC.Reaction reaction = reactionCount2.reaction;
            if ((reaction instanceof TLRPC.TL_reactionEmoji) || (reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, message.id);
                sQLitePreparedStatement.bindLong(2, ij.R1(e10, message));
                TLRPC.Reaction reaction2 = reactionCount2.reaction;
                sQLitePreparedStatement.bindLong(3, reaction2 instanceof TLRPC.TL_reactionEmoji ? ((TLRPC.TL_reactionEmoji) reaction2).emoticon.hashCode() : reaction2 instanceof TLRPC.TL_reactionCustomEmoji ? ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id : 0L);
                sQLitePreparedStatement.bindString(4, S0 == null ? "" : S0);
                sQLitePreparedStatement.step();
            }
        }
    }

    public final Object[] g0(int i7, String str) {
        if (str == null || str.toLowerCase().endsWith("attheme")) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Object[] objArr = new Object[2];
        this.a.c(new bk(this, str, i7, objArr, countDownLatch, 3));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        if (objArr[0] != null) {
            return objArr;
        }
        return null;
    }

    public final void g1(ArrayList arrayList, boolean z9) {
        SQLitePreparedStatement sQLitePreparedStatement = null;
        if (z9) {
            try {
                try {
                    this.b.beginTransaction();
                } catch (Exception e10) {
                    o(e10, true);
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
                throw th2;
            }
        }
        sQLitePreparedStatement = this.b.executeFast("INSERT OR REPLACE INTO ephemeral_messages (dialog_id, id, topic_id, date, data) VALUES (?, ?, ?, ?, ?);");
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            TL_ephemeral.EphemeralMessage ephemeralMessage = (TL_ephemeral.EphemeralMessage) obj;
            if (!ephemeralMessage.welcome) {
                sQLitePreparedStatement.requery();
                sQLitePreparedStatement.bindLong(1, m5.o(ephemeralMessage.peer_id));
                sQLitePreparedStatement.bindInteger(2, ephemeralMessage.id);
                sQLitePreparedStatement.bindInteger(3, ephemeralMessage.top_msg_id);
                sQLitePreparedStatement.bindInteger(4, ephemeralMessage.date);
                sQLitePreparedStatement.bindTlObject(5, ephemeralMessage);
                sQLitePreparedStatement.step();
            }
        }
        if (z9) {
            this.b.commitTransaction();
        }
        if (sQLitePreparedStatement != null) {
            sQLitePreparedStatement.dispose();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g2(long j3, long j10, long j11) {
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT topic_id FROM topics WHERE did = " + j3 + " AND max_read_id < " + j11 + " AND (top_message > " + j10 + " OR unread_count > 0)", new Object[0]);
                while (sQLiteCursor.next()) {
                    long j12 = j3;
                    try {
                        e2(j12, sQLiteCursor.longValue(0), (int) j11, -1);
                        j3 = j12;
                    } catch (Exception e10) {
                        e = e10;
                        o(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    }
                }
                sQLiteCursor.dispose();
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                if (sQLiteCursor != null) {
                    throw th3;
                }
                sQLiteCursor.dispose();
                throw th3;
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            Throwable th32 = th;
            if (sQLiteCursor != null) {
            }
        }
    }

    public final void h() {
        g0.h3(new rq(this, 13));
    }

    public final HashMap h0() {
        HashMap hashMap = new HashMap();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = this.b.queryFinalized("SELECT uid, info, participants_count FROM chat_settings_v2 WHERE participants_count > 1", new Object[0]);
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(1);
                    int intValue = sQLiteCursor.intValue(2);
                    if (byteBufferValue != null) {
                        TLRPC.ChatFull TLdeserialize = TLRPC.ChatFull.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                        if (TLdeserialize instanceof TLRPC.TL_channelFull) {
                            hashMap.put(Long.valueOf(longValue), Integer.valueOf(intValue));
                        }
                    }
                }
                sQLiteCursor.dispose();
                return hashMap;
            } catch (Exception e10) {
                o(e10, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
                return hashMap;
            }
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public final void h1(int i7, int i10, int i11, long j3, long j10, TLRPC.messages_Messages messages_messages, boolean z9) {
        this.a.c(new tg(this, i11, messages_messages, j3, j10, i7, i10, z9));
    }

    public final void h2(int i7, long j3, long j10, boolean z9) {
        this.a.c(new bi.o9(this, j10, z9, "unread_poll_votes", j3, i7, "poll_votes_mentions_topics", "unread_poll_votes", "poll_votes_mentions"));
    }

    public final void i(Long l10) {
        SQLiteCursor queryFinalized;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = this.b;
                Locale locale = Locale.US;
                queryFinalized = sQLiteDatabase.queryFinalized("SELECT COUNT(mid) FROM scheduled_messages_v2 WHERE uid = " + l10, new Object[0]);
            } catch (Exception e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int intValue = queryFinalized.next() ? queryFinalized.intValue(0) : 0;
            queryFinalized.dispose();
            g0.h3(new l7(this, l10, intValue, 17));
        } catch (Exception e11) {
            e = e11;
            sQLiteCursor = queryFinalized;
            o(e, true);
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteCursor = queryFinalized;
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    public final p5 i0() {
        return this.a;
    }

    public final void i1(int i7, int i10, long j3, ArrayList arrayList, boolean z9) {
        j1(arrayList, z9, true, false, i7, false, i10, j3);
    }

    public final void i2(int i7, long j3, long j10, boolean z9) {
        this.a.c(new bi.o9(this, j10, z9, "unread_reactions", j3, i7, "reaction_mentions_topics", "unread_reactions", "reaction_mentions"));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r16v2 int, still in use, count: 2, list:
          (r16v2 int) from 0x0546: IF  (r16v2 int) == (0 int)  -> B:310:0x0548 A[HIDDEN] (LINE:1351)
          (r16v2 int) from 0x053f: PHI (r16v3 int) = (r16v2 int) binds: [B:309:0x0546] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d0 A[Catch: all -> 0x0031, Exception -> 0x0035, TryCatch #5 {Exception -> 0x0035, all -> 0x0031, blocks: (B:7:0x000a, B:25:0x0039, B:27:0x003c, B:73:0x0135, B:75:0x015b, B:77:0x0166, B:79:0x018a, B:82:0x0194, B:83:0x019b, B:85:0x01a1, B:87:0x01e1, B:88:0x01ae, B:90:0x01b2, B:92:0x01bf, B:94:0x01c3, B:97:0x01c8, B:99:0x01d5, B:102:0x01f4, B:105:0x0202, B:107:0x021b, B:109:0x0228, B:111:0x023c, B:113:0x0244, B:117:0x02bc, B:118:0x025d, B:120:0x027a, B:123:0x0284, B:124:0x028b, B:126:0x028f, B:129:0x0294, B:130:0x02af, B:132:0x02a3, B:135:0x02ca, B:137:0x02d0, B:139:0x02e2, B:143:0x03b1, B:144:0x02fa, B:146:0x0300, B:148:0x0306, B:150:0x0313, B:152:0x032f, B:156:0x0347, B:159:0x0356, B:160:0x035e, B:163:0x039b, B:165:0x0365, B:167:0x036b, B:168:0x0378, B:170:0x037e, B:172:0x0382, B:173:0x038f, B:178:0x03a1, B:181:0x03b9, B:182:0x03c0, B:186:0x03c9, B:190:0x03d2, B:195:0x03e8, B:196:0x0400, B:198:0x0406, B:200:0x040a, B:202:0x0414, B:203:0x041b, B:205:0x041f, B:207:0x042c, B:208:0x0431, B:210:0x0435, B:212:0x0439, B:214:0x0444, B:215:0x0449, B:217:0x044d, B:219:0x045a, B:220:0x045d, B:222:0x0461, B:224:0x0465, B:226:0x0470, B:227:0x0475, B:229:0x0479, B:231:0x0486, B:232:0x0489, B:234:0x048d, B:236:0x0491, B:238:0x049c, B:239:0x04a1, B:241:0x04a5, B:243:0x04b2, B:244:0x04b5, B:246:0x04b9, B:248:0x04bd, B:250:0x04c8, B:251:0x04cd, B:253:0x04d1, B:255:0x04de, B:257:0x04e3, B:259:0x04e9, B:261:0x04fd, B:263:0x0508, B:266:0x0513, B:273:0x0533, B:278:0x054b, B:280:0x054f, B:281:0x0565, B:283:0x0568, B:286:0x058d, B:287:0x056d, B:289:0x0571, B:291:0x057b, B:293:0x0580, B:295:0x0584, B:301:0x0554, B:303:0x0558, B:306:0x055d, B:307:0x0561, B:308:0x0542, B:315:0x05e7, B:316:0x0599, B:318:0x05a6, B:320:0x05ac, B:322:0x05b0, B:323:0x05b9, B:325:0x05bd, B:327:0x05c0, B:329:0x05c4, B:331:0x05cd, B:334:0x05d9, B:336:0x05dd, B:341:0x05b5, B:344:0x05f3, B:346:0x0602, B:353:0x061f, B:357:0x0636, B:359:0x063a, B:360:0x0650, B:362:0x0653, B:364:0x0657, B:367:0x0666, B:369:0x066a, B:373:0x0672, B:372:0x0674, B:377:0x063f, B:379:0x0643, B:382:0x0648, B:383:0x064c, B:384:0x062c, B:392:0x06c7, B:393:0x067e, B:395:0x068a, B:397:0x0690, B:399:0x0694, B:400:0x069d, B:402:0x06a0, B:404:0x06a4, B:407:0x06ad, B:409:0x06b1, B:411:0x06ba, B:414:0x06c5, B:417:0x0699, B:420:0x06cc, B:422:0x06d0, B:427:0x06db, B:429:0x06df, B:433:0x06e4, B:435:0x06e8, B:442:0x03eb, B:444:0x03ef, B:446:0x03f7, B:447:0x03f9, B:449:0x03fd), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0347 A[Catch: all -> 0x0031, Exception -> 0x0035, TryCatch #5 {Exception -> 0x0035, all -> 0x0031, blocks: (B:7:0x000a, B:25:0x0039, B:27:0x003c, B:73:0x0135, B:75:0x015b, B:77:0x0166, B:79:0x018a, B:82:0x0194, B:83:0x019b, B:85:0x01a1, B:87:0x01e1, B:88:0x01ae, B:90:0x01b2, B:92:0x01bf, B:94:0x01c3, B:97:0x01c8, B:99:0x01d5, B:102:0x01f4, B:105:0x0202, B:107:0x021b, B:109:0x0228, B:111:0x023c, B:113:0x0244, B:117:0x02bc, B:118:0x025d, B:120:0x027a, B:123:0x0284, B:124:0x028b, B:126:0x028f, B:129:0x0294, B:130:0x02af, B:132:0x02a3, B:135:0x02ca, B:137:0x02d0, B:139:0x02e2, B:143:0x03b1, B:144:0x02fa, B:146:0x0300, B:148:0x0306, B:150:0x0313, B:152:0x032f, B:156:0x0347, B:159:0x0356, B:160:0x035e, B:163:0x039b, B:165:0x0365, B:167:0x036b, B:168:0x0378, B:170:0x037e, B:172:0x0382, B:173:0x038f, B:178:0x03a1, B:181:0x03b9, B:182:0x03c0, B:186:0x03c9, B:190:0x03d2, B:195:0x03e8, B:196:0x0400, B:198:0x0406, B:200:0x040a, B:202:0x0414, B:203:0x041b, B:205:0x041f, B:207:0x042c, B:208:0x0431, B:210:0x0435, B:212:0x0439, B:214:0x0444, B:215:0x0449, B:217:0x044d, B:219:0x045a, B:220:0x045d, B:222:0x0461, B:224:0x0465, B:226:0x0470, B:227:0x0475, B:229:0x0479, B:231:0x0486, B:232:0x0489, B:234:0x048d, B:236:0x0491, B:238:0x049c, B:239:0x04a1, B:241:0x04a5, B:243:0x04b2, B:244:0x04b5, B:246:0x04b9, B:248:0x04bd, B:250:0x04c8, B:251:0x04cd, B:253:0x04d1, B:255:0x04de, B:257:0x04e3, B:259:0x04e9, B:261:0x04fd, B:263:0x0508, B:266:0x0513, B:273:0x0533, B:278:0x054b, B:280:0x054f, B:281:0x0565, B:283:0x0568, B:286:0x058d, B:287:0x056d, B:289:0x0571, B:291:0x057b, B:293:0x0580, B:295:0x0584, B:301:0x0554, B:303:0x0558, B:306:0x055d, B:307:0x0561, B:308:0x0542, B:315:0x05e7, B:316:0x0599, B:318:0x05a6, B:320:0x05ac, B:322:0x05b0, B:323:0x05b9, B:325:0x05bd, B:327:0x05c0, B:329:0x05c4, B:331:0x05cd, B:334:0x05d9, B:336:0x05dd, B:341:0x05b5, B:344:0x05f3, B:346:0x0602, B:353:0x061f, B:357:0x0636, B:359:0x063a, B:360:0x0650, B:362:0x0653, B:364:0x0657, B:367:0x0666, B:369:0x066a, B:373:0x0672, B:372:0x0674, B:377:0x063f, B:379:0x0643, B:382:0x0648, B:383:0x064c, B:384:0x062c, B:392:0x06c7, B:393:0x067e, B:395:0x068a, B:397:0x0690, B:399:0x0694, B:400:0x069d, B:402:0x06a0, B:404:0x06a4, B:407:0x06ad, B:409:0x06b1, B:411:0x06ba, B:414:0x06c5, B:417:0x0699, B:420:0x06cc, B:422:0x06d0, B:427:0x06db, B:429:0x06df, B:433:0x06e4, B:435:0x06e8, B:442:0x03eb, B:444:0x03ef, B:446:0x03f7, B:447:0x03f9, B:449:0x03fd), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0356 A[Catch: all -> 0x0031, Exception -> 0x0035, TryCatch #5 {Exception -> 0x0035, all -> 0x0031, blocks: (B:7:0x000a, B:25:0x0039, B:27:0x003c, B:73:0x0135, B:75:0x015b, B:77:0x0166, B:79:0x018a, B:82:0x0194, B:83:0x019b, B:85:0x01a1, B:87:0x01e1, B:88:0x01ae, B:90:0x01b2, B:92:0x01bf, B:94:0x01c3, B:97:0x01c8, B:99:0x01d5, B:102:0x01f4, B:105:0x0202, B:107:0x021b, B:109:0x0228, B:111:0x023c, B:113:0x0244, B:117:0x02bc, B:118:0x025d, B:120:0x027a, B:123:0x0284, B:124:0x028b, B:126:0x028f, B:129:0x0294, B:130:0x02af, B:132:0x02a3, B:135:0x02ca, B:137:0x02d0, B:139:0x02e2, B:143:0x03b1, B:144:0x02fa, B:146:0x0300, B:148:0x0306, B:150:0x0313, B:152:0x032f, B:156:0x0347, B:159:0x0356, B:160:0x035e, B:163:0x039b, B:165:0x0365, B:167:0x036b, B:168:0x0378, B:170:0x037e, B:172:0x0382, B:173:0x038f, B:178:0x03a1, B:181:0x03b9, B:182:0x03c0, B:186:0x03c9, B:190:0x03d2, B:195:0x03e8, B:196:0x0400, B:198:0x0406, B:200:0x040a, B:202:0x0414, B:203:0x041b, B:205:0x041f, B:207:0x042c, B:208:0x0431, B:210:0x0435, B:212:0x0439, B:214:0x0444, B:215:0x0449, B:217:0x044d, B:219:0x045a, B:220:0x045d, B:222:0x0461, B:224:0x0465, B:226:0x0470, B:227:0x0475, B:229:0x0479, B:231:0x0486, B:232:0x0489, B:234:0x048d, B:236:0x0491, B:238:0x049c, B:239:0x04a1, B:241:0x04a5, B:243:0x04b2, B:244:0x04b5, B:246:0x04b9, B:248:0x04bd, B:250:0x04c8, B:251:0x04cd, B:253:0x04d1, B:255:0x04de, B:257:0x04e3, B:259:0x04e9, B:261:0x04fd, B:263:0x0508, B:266:0x0513, B:273:0x0533, B:278:0x054b, B:280:0x054f, B:281:0x0565, B:283:0x0568, B:286:0x058d, B:287:0x056d, B:289:0x0571, B:291:0x057b, B:293:0x0580, B:295:0x0584, B:301:0x0554, B:303:0x0558, B:306:0x055d, B:307:0x0561, B:308:0x0542, B:315:0x05e7, B:316:0x0599, B:318:0x05a6, B:320:0x05ac, B:322:0x05b0, B:323:0x05b9, B:325:0x05bd, B:327:0x05c0, B:329:0x05c4, B:331:0x05cd, B:334:0x05d9, B:336:0x05dd, B:341:0x05b5, B:344:0x05f3, B:346:0x0602, B:353:0x061f, B:357:0x0636, B:359:0x063a, B:360:0x0650, B:362:0x0653, B:364:0x0657, B:367:0x0666, B:369:0x066a, B:373:0x0672, B:372:0x0674, B:377:0x063f, B:379:0x0643, B:382:0x0648, B:383:0x064c, B:384:0x062c, B:392:0x06c7, B:393:0x067e, B:395:0x068a, B:397:0x0690, B:399:0x0694, B:400:0x069d, B:402:0x06a0, B:404:0x06a4, B:407:0x06ad, B:409:0x06b1, B:411:0x06ba, B:414:0x06c5, B:417:0x0699, B:420:0x06cc, B:422:0x06d0, B:427:0x06db, B:429:0x06df, B:433:0x06e4, B:435:0x06e8, B:442:0x03eb, B:444:0x03ef, B:446:0x03f7, B:447:0x03f9, B:449:0x03fd), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0365 A[Catch: all -> 0x0031, Exception -> 0x0035, TryCatch #5 {Exception -> 0x0035, all -> 0x0031, blocks: (B:7:0x000a, B:25:0x0039, B:27:0x003c, B:73:0x0135, B:75:0x015b, B:77:0x0166, B:79:0x018a, B:82:0x0194, B:83:0x019b, B:85:0x01a1, B:87:0x01e1, B:88:0x01ae, B:90:0x01b2, B:92:0x01bf, B:94:0x01c3, B:97:0x01c8, B:99:0x01d5, B:102:0x01f4, B:105:0x0202, B:107:0x021b, B:109:0x0228, B:111:0x023c, B:113:0x0244, B:117:0x02bc, B:118:0x025d, B:120:0x027a, B:123:0x0284, B:124:0x028b, B:126:0x028f, B:129:0x0294, B:130:0x02af, B:132:0x02a3, B:135:0x02ca, B:137:0x02d0, B:139:0x02e2, B:143:0x03b1, B:144:0x02fa, B:146:0x0300, B:148:0x0306, B:150:0x0313, B:152:0x032f, B:156:0x0347, B:159:0x0356, B:160:0x035e, B:163:0x039b, B:165:0x0365, B:167:0x036b, B:168:0x0378, B:170:0x037e, B:172:0x0382, B:173:0x038f, B:178:0x03a1, B:181:0x03b9, B:182:0x03c0, B:186:0x03c9, B:190:0x03d2, B:195:0x03e8, B:196:0x0400, B:198:0x0406, B:200:0x040a, B:202:0x0414, B:203:0x041b, B:205:0x041f, B:207:0x042c, B:208:0x0431, B:210:0x0435, B:212:0x0439, B:214:0x0444, B:215:0x0449, B:217:0x044d, B:219:0x045a, B:220:0x045d, B:222:0x0461, B:224:0x0465, B:226:0x0470, B:227:0x0475, B:229:0x0479, B:231:0x0486, B:232:0x0489, B:234:0x048d, B:236:0x0491, B:238:0x049c, B:239:0x04a1, B:241:0x04a5, B:243:0x04b2, B:244:0x04b5, B:246:0x04b9, B:248:0x04bd, B:250:0x04c8, B:251:0x04cd, B:253:0x04d1, B:255:0x04de, B:257:0x04e3, B:259:0x04e9, B:261:0x04fd, B:263:0x0508, B:266:0x0513, B:273:0x0533, B:278:0x054b, B:280:0x054f, B:281:0x0565, B:283:0x0568, B:286:0x058d, B:287:0x056d, B:289:0x0571, B:291:0x057b, B:293:0x0580, B:295:0x0584, B:301:0x0554, B:303:0x0558, B:306:0x055d, B:307:0x0561, B:308:0x0542, B:315:0x05e7, B:316:0x0599, B:318:0x05a6, B:320:0x05ac, B:322:0x05b0, B:323:0x05b9, B:325:0x05bd, B:327:0x05c0, B:329:0x05c4, B:331:0x05cd, B:334:0x05d9, B:336:0x05dd, B:341:0x05b5, B:344:0x05f3, B:346:0x0602, B:353:0x061f, B:357:0x0636, B:359:0x063a, B:360:0x0650, B:362:0x0653, B:364:0x0657, B:367:0x0666, B:369:0x066a, B:373:0x0672, B:372:0x0674, B:377:0x063f, B:379:0x0643, B:382:0x0648, B:383:0x064c, B:384:0x062c, B:392:0x06c7, B:393:0x067e, B:395:0x068a, B:397:0x0690, B:399:0x0694, B:400:0x069d, B:402:0x06a0, B:404:0x06a4, B:407:0x06ad, B:409:0x06b1, B:411:0x06ba, B:414:0x06c5, B:417:0x0699, B:420:0x06cc, B:422:0x06d0, B:427:0x06db, B:429:0x06df, B:433:0x06e4, B:435:0x06e8, B:442:0x03eb, B:444:0x03ef, B:446:0x03f7, B:447:0x03f9, B:449:0x03fd), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0508 A[Catch: all -> 0x0031, Exception -> 0x0035, TryCatch #5 {Exception -> 0x0035, all -> 0x0031, blocks: (B:7:0x000a, B:25:0x0039, B:27:0x003c, B:73:0x0135, B:75:0x015b, B:77:0x0166, B:79:0x018a, B:82:0x0194, B:83:0x019b, B:85:0x01a1, B:87:0x01e1, B:88:0x01ae, B:90:0x01b2, B:92:0x01bf, B:94:0x01c3, B:97:0x01c8, B:99:0x01d5, B:102:0x01f4, B:105:0x0202, B:107:0x021b, B:109:0x0228, B:111:0x023c, B:113:0x0244, B:117:0x02bc, B:118:0x025d, B:120:0x027a, B:123:0x0284, B:124:0x028b, B:126:0x028f, B:129:0x0294, B:130:0x02af, B:132:0x02a3, B:135:0x02ca, B:137:0x02d0, B:139:0x02e2, B:143:0x03b1, B:144:0x02fa, B:146:0x0300, B:148:0x0306, B:150:0x0313, B:152:0x032f, B:156:0x0347, B:159:0x0356, B:160:0x035e, B:163:0x039b, B:165:0x0365, B:167:0x036b, B:168:0x0378, B:170:0x037e, B:172:0x0382, B:173:0x038f, B:178:0x03a1, B:181:0x03b9, B:182:0x03c0, B:186:0x03c9, B:190:0x03d2, B:195:0x03e8, B:196:0x0400, B:198:0x0406, B:200:0x040a, B:202:0x0414, B:203:0x041b, B:205:0x041f, B:207:0x042c, B:208:0x0431, B:210:0x0435, B:212:0x0439, B:214:0x0444, B:215:0x0449, B:217:0x044d, B:219:0x045a, B:220:0x045d, B:222:0x0461, B:224:0x0465, B:226:0x0470, B:227:0x0475, B:229:0x0479, B:231:0x0486, B:232:0x0489, B:234:0x048d, B:236:0x0491, B:238:0x049c, B:239:0x04a1, B:241:0x04a5, B:243:0x04b2, B:244:0x04b5, B:246:0x04b9, B:248:0x04bd, B:250:0x04c8, B:251:0x04cd, B:253:0x04d1, B:255:0x04de, B:257:0x04e3, B:259:0x04e9, B:261:0x04fd, B:263:0x0508, B:266:0x0513, B:273:0x0533, B:278:0x054b, B:280:0x054f, B:281:0x0565, B:283:0x0568, B:286:0x058d, B:287:0x056d, B:289:0x0571, B:291:0x057b, B:293:0x0580, B:295:0x0584, B:301:0x0554, B:303:0x0558, B:306:0x055d, B:307:0x0561, B:308:0x0542, B:315:0x05e7, B:316:0x0599, B:318:0x05a6, B:320:0x05ac, B:322:0x05b0, B:323:0x05b9, B:325:0x05bd, B:327:0x05c0, B:329:0x05c4, B:331:0x05cd, B:334:0x05d9, B:336:0x05dd, B:341:0x05b5, B:344:0x05f3, B:346:0x0602, B:353:0x061f, B:357:0x0636, B:359:0x063a, B:360:0x0650, B:362:0x0653, B:364:0x0657, B:367:0x0666, B:369:0x066a, B:373:0x0672, B:372:0x0674, B:377:0x063f, B:379:0x0643, B:382:0x0648, B:383:0x064c, B:384:0x062c, B:392:0x06c7, B:393:0x067e, B:395:0x068a, B:397:0x0690, B:399:0x0694, B:400:0x069d, B:402:0x06a0, B:404:0x06a4, B:407:0x06ad, B:409:0x06b1, B:411:0x06ba, B:414:0x06c5, B:417:0x0699, B:420:0x06cc, B:422:0x06d0, B:427:0x06db, B:429:0x06df, B:433:0x06e4, B:435:0x06e8, B:442:0x03eb, B:444:0x03ef, B:446:0x03f7, B:447:0x03f9, B:449:0x03fd), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x06d3  */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean r28) {
        /*
            Method dump skipped, instructions count: 1793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yr.j(boolean):void");
    }

    public final TLRPC.User j0(long j3) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(j3));
            n0(arrayList2, arrayList, false);
            if (arrayList.isEmpty()) {
                return null;
            }
            return (TLRPC.User) arrayList.get(0);
        } catch (Exception e10) {
            o(e10, true);
            return null;
        }
    }

    public final void j1(final ArrayList arrayList, final boolean z9, boolean z10, final boolean z11, final int i7, final boolean z12, final int i10, final long j3) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (!z10) {
            k1(arrayList, z9, z11, i7, z12, i10, j3);
        } else {
            this.a.c(new Runnable() { // from class: org.telegram.messenger.pq
                @Override // java.lang.Runnable
                public final void run() {
                    yr.this.k1(arrayList, z9, z11, i7, z12, i10, j3);
                }
            });
        }
    }

    public final void j2(TLRPC.UserFull userFull, boolean z9) {
        this.a.c(new yf(this, userFull, z9, 8));
    }

    public final void k(int i7) {
        SparseArray sparseArray = this.h;
        ArrayList arrayList = (ArrayList) sparseArray.get(i7);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.a.a((Runnable) arrayList.get(i10));
        }
        sparseArray.remove(i7);
    }

    public final TLRPC.User k0(long j3) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        TLRPC.User[] userArr = new TLRPC.User[1];
        this.a.c(new jm(this, userArr, j3, countDownLatch, 11));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return userArr[0];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void k1(java.util.ArrayList r65, boolean r66, boolean r67, int r68, boolean r69, int r70, long r71) {
        /*
            Method dump skipped, instructions count: 9101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.yr.k1(java.util.ArrayList, boolean, boolean, int, boolean, int, long):void");
    }

    public final void k2(ArrayList arrayList, boolean z9) {
        if (arrayList.isEmpty()) {
            return;
        }
        this.a.c(new dq(this, arrayList, z9, 0));
    }

    public final void l(int i7) {
        boolean z9;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                int i10 = 0;
                sQLiteCursor = this.b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = ?", Integer.valueOf(i7));
                while (sQLiteCursor.next()) {
                    long longValue = sQLiteCursor.longValue(0);
                    if (!m5.E(longValue) && !m5.C(longValue)) {
                        TLRPC.Chat O = O(-longValue);
                        if (t3.r0(O) || O.migrated_to != null) {
                        }
                    }
                    z9 = false;
                }
                z9 = true;
                sQLiteCursor.dispose();
                if (z9) {
                    g0.h3(new tp(this, i7, i10));
                    this.b.executeFast("DELETE FROM dialogs WHERE did = " + (2305843009213693952L | i7)).stepThis().dispose();
                }
                sQLiteCursor.dispose();
            } catch (Exception e10) {
                o(e10, true);
                if (sQLiteCursor != null) {
                    sQLiteCursor.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    public final ArrayList l0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        try {
            n0(arrayList, arrayList2, false);
            return arrayList2;
        } catch (Exception e10) {
            arrayList2.clear();
            o(e10, true);
            return arrayList2;
        }
    }

    public final void l1(String str, TLObject tLObject, int i7, String str2) {
        if (str == null || tLObject == null || str2 == null) {
            return;
        }
        this.a.c(new bk(this, str, tLObject, i7, str2, 4));
    }

    public final void l2(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT DISTINCT id FROM shortcut_widget WHERE did IN(" + TextUtils.join(",", arrayList) + ",-1)", new Object[0]);
            ArrayList arrayList2 = null;
            while (queryFinalized.next()) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(Integer.valueOf(queryFinalized.intValue(0)));
            }
            queryFinalized.dispose();
            if (arrayList2 != null) {
                g0.h3(new k(4, arrayList2));
            }
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    public final boolean m(long j3) {
        boolean[] zArr = new boolean[1];
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.c(new fq(this, j3, zArr, countDownLatch, 2));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return zArr[0];
    }

    public final void m0(ArrayList arrayList, ArrayList arrayList2) {
        n0(arrayList, arrayList2, false);
    }

    public final void m1(List list, List list2, boolean z9, boolean z10) {
        if (list == null || !list.isEmpty() || list2 == null || !list2.isEmpty()) {
            if (!z10) {
                n1(list, list2, z9);
            } else {
                this.a.c(new aa.d0(this, list, list2, z9, 21));
            }
        }
    }

    public final void n(Exception exc) {
        o(exc, true);
    }

    public final void n0(ArrayList arrayList, ArrayList arrayList2, boolean z9) {
        if (arrayList.isEmpty() || arrayList2 == null) {
            return;
        }
        if (arrayList.size() > 50) {
            int i7 = 0;
            while (i7 < arrayList.size()) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                TLRPC.User a22 = getMessagesController().a2(l10);
                if (a22 != null) {
                    arrayList2.add(a22);
                    arrayList.remove(i7);
                    i7--;
                }
                i7++;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a8.p0.p("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", arrayList), ")"), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        TLRPC.UserStatus userStatus = TLdeserialize.status;
                        if (userStatus != null) {
                            userStatus.expires = queryFinalized.intValue(1);
                        }
                        arrayList2.add(TLdeserialize);
                        if (arrayList.size() > 50 && z9) {
                            getMessagesController().X3(TLdeserialize, true, false);
                        }
                    }
                }
            } catch (Exception e10) {
                o(e10, true);
            }
        }
        queryFinalized.dispose();
    }

    public final void n1(List list, List list2, boolean z9) {
        if (z9) {
            try {
                try {
                    this.b.beginTransaction();
                } catch (Exception e10) {
                    o(e10, true);
                    SQLiteDatabase sQLiteDatabase = this.b;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.commitTransaction();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                SQLiteDatabase sQLiteDatabase2 = this.b;
                if (sQLiteDatabase2 != null) {
                    sQLiteDatabase2.commitTransaction();
                }
                throw th2;
            }
        }
        o1(list);
        b1(list2);
        SQLiteDatabase sQLiteDatabase3 = this.b;
        if (sQLiteDatabase3 != null) {
            sQLiteDatabase3.commitTransaction();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x039e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0351 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(Throwable th2, boolean z9) {
        String str;
        String str2;
        String str3;
        String str4;
        long j3;
        boolean z10;
        boolean z11;
        yr yrVar;
        ?? r11;
        boolean z12;
        yr yrVar2;
        yr yrVar3;
        SQLiteDatabase sQLiteDatabase;
        int intValue;
        SQLiteCursor sQLiteCursor;
        HashSet hashSet;
        int i7;
        if (!(th2 instanceof SQLiteException) || th2.getMessage() == null || !th2.getMessage().contains("is malformed") || this.S) {
            a8.g(th2, z9);
            return;
        }
        this.S = true;
        a8.d("disk image malformed detected, try recover");
        String str5 = "PRAGMA journal_mode = WAL";
        String str6 = "PRAGMA temp_store = MEMORY";
        String str7 = "PRAGMA secure_delete = ON";
        this.b.close();
        File file = this.c;
        File file2 = this.d;
        File file3 = this.e;
        File file4 = new File(t0.h(), jg.g.k(this.currentAccount, "recover_database_", "/"));
        file4.mkdirs();
        File file5 = new File(file4, "cache4.db");
        File file6 = new File(file4, "cache4.db-wal");
        File file7 = new File(file4, "cache4.db-shm");
        try {
            file5.delete();
            file6.delete();
            file7.delete();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        a8.b("start recover database");
        try {
            j3 = System.currentTimeMillis();
            try {
                sQLiteDatabase = new SQLiteDatabase(file5.getPath());
                sQLiteDatabase.executeFast("PRAGMA secure_delete = ON").stepThis().dispose();
                sQLiteDatabase.executeFast("PRAGMA temp_store = MEMORY").stepThis().dispose();
                sQLiteDatabase.executeFast("PRAGMA journal_mode = WAL").stepThis().dispose();
                sQLiteDatabase.executeFast("PRAGMA journal_size_limit = 10485760").stepThis().dispose();
                A(sQLiteDatabase);
                sQLiteDatabase.executeFast("ATTACH DATABASE \"" + file.getAbsolutePath() + "\" AS old;").stepThis().dispose();
                str = "PRAGMA journal_size_limit = 10485760";
                try {
                    intValue = sQLiteDatabase.executeInt("PRAGMA old.user_version", new Object[0]).intValue();
                } catch (Exception e11) {
                    e = e11;
                    str2 = "PRAGMA journal_mode = WAL";
                    str3 = str6;
                    str4 = str7;
                    a8.g(e, true);
                    z10 = false;
                    if (z10) {
                    }
                    z11 = false;
                    a8.d("Database restored = " + z11);
                    if (z11) {
                    }
                    r11 = 1;
                    z12 = z11;
                    yrVar2 = yrVar3;
                    if (!z12) {
                    }
                    if (z12) {
                    }
                    if (!z12) {
                    }
                }
            } catch (Exception e12) {
                e = e12;
                str = "PRAGMA journal_size_limit = 10485760";
            }
        } catch (Exception e13) {
            e = e13;
            str = "PRAGMA journal_size_limit = 10485760";
            str2 = "PRAGMA journal_mode = WAL";
            str3 = "PRAGMA temp_store = MEMORY";
            str4 = "PRAGMA secure_delete = ON";
            j3 = 0;
        }
        if (intValue != 181) {
            a8.d("can't restore database from version " + intValue);
            str2 = "PRAGMA journal_mode = WAL";
            str3 = "PRAGMA temp_store = MEMORY";
            str4 = "PRAGMA secure_delete = ON";
            z11 = false;
            a8.d("Database restored = " + z11);
            if (z11) {
                yrVar3 = this;
            } else {
                try {
                    yrVar = this;
                } catch (SQLiteException e14) {
                    e = e14;
                    yrVar = this;
                }
                try {
                    SQLiteDatabase sQLiteDatabase2 = new SQLiteDatabase(yrVar.c.getPath());
                    yrVar.b = sQLiteDatabase2;
                    sQLiteDatabase2.executeFast(str4).stepThis().dispose();
                    yrVar.b.executeFast(str3).stepThis().dispose();
                    yrVar.b.executeFast(str2).stepThis().dispose();
                    yrVar.b.executeFast(str).stepThis().dispose();
                    yrVar3 = yrVar;
                } catch (SQLiteException e15) {
                    e = e15;
                    r11 = 1;
                    a8.g(new Exception(e), true);
                    z12 = false;
                    yrVar2 = yrVar;
                    if (!z12) {
                    }
                    if (z12) {
                    }
                    if (!z12) {
                    }
                }
            }
            r11 = 1;
            z12 = z11;
            yrVar2 = yrVar3;
            if (!z12) {
                yrVar2.p(r11);
                yrVar2.V0(r11);
                z12 = yrVar2.O;
                a8.d("Try create new database = " + z12);
            }
            if (z12) {
                yrVar2.s1();
            }
            if (!z12) {
                a8.g(new Exception(th2), z9);
                return;
            }
            yrVar2.S = false;
            yrVar2.s();
            g0.h3(new rq(yrVar2, 24));
            a8.g(new Exception("database restored!!"), true);
            return;
        }
        HashSet hashSet2 = new HashSet();
        hashSet2.add("messages_v2");
        hashSet2.add("messages_holes");
        hashSet2.add("scheduled_messages_v2");
        hashSet2.add("media_holes_v2");
        hashSet2.add("media_v4");
        hashSet2.add("messages_holes_topics");
        hashSet2.add("messages_topics");
        hashSet2.add("media_topics");
        hashSet2.add("media_holes_topics");
        hashSet2.add("topics");
        hashSet2.add("media_counts_v2");
        hashSet2.add("media_counts_topics");
        hashSet2.add("dialogs");
        hashSet2.add("dialog_filter");
        hashSet2.add("dialog_filter_ep");
        hashSet2.add("dialog_filter_pin_v2");
        int i10 = 0;
        while (true) {
            String[] strArr = g0;
            if (i10 >= 76) {
                break;
            }
            String str8 = strArr[i10];
            if (hashSet2.contains(str8)) {
                hashSet = hashSet2;
                i7 = i10;
            } else {
                Locale locale = Locale.US;
                hashSet = hashSet2;
                StringBuilder sb2 = new StringBuilder();
                i7 = i10;
                sb2.append("INSERT OR IGNORE INTO ");
                sb2.append(str8);
                sb2.append(" SELECT * FROM old.");
                sb2.append(str8);
                sb2.append(";");
                sQLiteDatabase.executeFast(sb2.toString()).stepThis().dispose();
            }
            i10 = i7 + 1;
            hashSet2 = hashSet;
        }
        int i11 = 0;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM old.dialogs", new Object[0]);
        while (queryFinalized.next()) {
            long longValue = queryFinalized.longValue(i11);
            if (m5.C(longValue)) {
                arrayList.add(Long.valueOf(longValue));
            } else {
                arrayList2.add(Long.valueOf(longValue));
            }
            i11 = 0;
        }
        queryFinalized.dispose();
        int i12 = 0;
        while (i12 < arrayList.size()) {
            Long l10 = (Long) arrayList.get(i12);
            l10.getClass();
            Locale locale2 = Locale.US;
            sQLiteDatabase.executeFast("INSERT OR IGNORE INTO messages_v2 SELECT * FROM old.messages_v2 WHERE uid = " + l10 + ";").stepThis().dispose();
            sQLiteDatabase.executeFast("INSERT OR IGNORE INTO messages_holes SELECT * FROM old.messages_holes WHERE uid = " + l10 + ";").stepThis().dispose();
            sQLiteDatabase.executeFast("INSERT OR IGNORE INTO media_holes_v2 SELECT * FROM old.media_holes_v2 WHERE uid = " + l10 + ";").stepThis().dispose();
            sQLiteDatabase.executeFast("INSERT OR IGNORE INTO media_v4 SELECT * FROM old.media_v4 WHERE uid = " + l10 + ";").stepThis().dispose();
            i12++;
            arrayList = arrayList;
        }
        SQLitePreparedStatement executeFast = sQLiteDatabase.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
        SQLitePreparedStatement executeFast2 = sQLiteDatabase.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
        int i13 = 0;
        while (i13 < arrayList2.size()) {
            Long l11 = (Long) arrayList2.get(i13);
            int i14 = i13;
            SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT last_mid_i, last_mid FROM old.dialogs WHERE did = " + l11, new Object[0]);
            if (queryFinalized2.next()) {
                str2 = str5;
                try {
                    long longValue2 = queryFinalized2.longValue(0);
                    str3 = str6;
                    str4 = str7;
                    try {
                        long longValue3 = queryFinalized2.longValue(1);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("INSERT OR IGNORE INTO messages_v2 SELECT * FROM old.messages_v2 WHERE uid = ");
                        sb3.append(l11);
                        sQLiteCursor = queryFinalized2;
                        sb3.append(" AND mid IN (");
                        sb3.append(longValue2);
                        sb3.append(",");
                        sb3.append(longValue3);
                        sb3.append(")");
                        sQLiteDatabase.executeFast(sb3.toString()).stepThis().dispose();
                        w(l11.longValue(), executeFast, executeFast2, (int) longValue3, 0L);
                    } catch (Exception e16) {
                        e = e16;
                        a8.g(e, true);
                        z10 = false;
                        if (z10) {
                        }
                        z11 = false;
                        a8.d("Database restored = " + z11);
                        if (z11) {
                        }
                        r11 = 1;
                        z12 = z11;
                        yrVar2 = yrVar3;
                        if (!z12) {
                        }
                        if (z12) {
                        }
                        if (!z12) {
                        }
                    }
                } catch (Exception e17) {
                    e = e17;
                    str3 = str6;
                    str4 = str7;
                    a8.g(e, true);
                    z10 = false;
                    if (z10) {
                    }
                    z11 = false;
                    a8.d("Database restored = " + z11);
                    if (z11) {
                    }
                    r11 = 1;
                    z12 = z11;
                    yrVar2 = yrVar3;
                    if (!z12) {
                    }
                    if (z12) {
                    }
                    if (!z12) {
                    }
                }
            } else {
                sQLiteCursor = queryFinalized2;
                str2 = str5;
                str3 = str6;
                str4 = str7;
            }
            sQLiteCursor.dispose();
            i13 = i14 + 1;
            str5 = str2;
            str6 = str3;
            str7 = str4;
        }
        str2 = str5;
        str3 = str6;
        str4 = str7;
        executeFast.dispose();
        executeFast2.dispose();
        sQLiteDatabase.executeFast("DETACH DATABASE old;").stepThis().dispose();
        sQLiteDatabase.close();
        z10 = true;
        if (z10) {
            try {
                file.delete();
                file2.delete();
                file3.delete();
                g0.E(file5, file);
                g0.E(file6, file2);
                g0.E(file7, file3);
                file5.delete();
                file6.delete();
                file7.delete();
                a8.b("database recovered time " + (System.currentTimeMillis() - j3));
                z11 = true;
            } catch (IOException e18) {
                e18.printStackTrace();
            }
            a8.d("Database restored = " + z11);
            if (z11) {
            }
            r11 = 1;
            z12 = z11;
            yrVar2 = yrVar3;
            if (!z12) {
            }
            if (z12) {
            }
            if (!z12) {
            }
        }
        z11 = false;
        a8.d("Database restored = " + z11);
        if (z11) {
        }
        r11 = 1;
        z12 = z11;
        yrVar2 = yrVar3;
        if (!z12) {
        }
        if (z12) {
        }
        if (!z12) {
        }
    }

    public final void o0(ArrayList arrayList, HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        if (hashSet.size() > 50) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                TLRPC.User a22 = getMessagesController().a2((Long) it.next());
                if (a22 != null) {
                    arrayList.add(a22);
                    it.remove();
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a8.p0.p("SELECT data, status FROM users WHERE uid IN(", TextUtils.join(",", hashSet), ")"), new Object[0]);
        while (queryFinalized.next()) {
            try {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    byteBufferValue.reuse();
                    if (TLdeserialize != null) {
                        TLRPC.UserStatus userStatus = TLdeserialize.status;
                        if (userStatus != null) {
                            userStatus.expires = queryFinalized.intValue(1);
                        }
                        arrayList.add(TLdeserialize);
                    }
                }
            } catch (Exception e10) {
                o(e10, true);
            }
        }
        queryFinalized.dispose();
    }

    public final void o1(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        SQLitePreparedStatement executeFast = this.b.executeFast("REPLACE INTO users VALUES(?, ?, ?, ?)");
        for (int i7 = 0; i7 < list.size(); i7++) {
            TLRPC.User user = (TLRPC.User) list.get(i7);
            if (user != null) {
                if (user.min) {
                    SQLiteDatabase sQLiteDatabase = this.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized(a8.p0.o(user.id, "SELECT data FROM users WHERE uid = "), new Object[0]);
                    if (queryFinalized.next()) {
                        try {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.User TLdeserialize = TLRPC.User.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                if (TLdeserialize != null) {
                                    String str = user.username;
                                    if (str != null) {
                                        TLdeserialize.username = str;
                                        TLdeserialize.flags |= 8;
                                    } else {
                                        TLdeserialize.username = null;
                                        TLdeserialize.flags &= -9;
                                    }
                                    if (user.apply_min_photo) {
                                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                        if (userProfilePhoto != null) {
                                            TLdeserialize.photo = userProfilePhoto;
                                            TLdeserialize.flags |= 32;
                                        } else {
                                            TLdeserialize.photo = null;
                                            TLdeserialize.flags &= -33;
                                        }
                                    }
                                    user = TLdeserialize;
                                }
                            }
                        } catch (Exception e10) {
                            o(e10, true);
                        }
                    }
                    queryFinalized.dispose();
                }
                executeFast.requery();
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(user.getObjectSize());
                user.serializeToStream(nativeByteBuffer);
                executeFast.bindLong(1, user.id);
                executeFast.bindString(2, K(user));
                TLRPC.UserStatus userStatus = user.status;
                if (userStatus != null) {
                    if (userStatus instanceof TLRPC.TL_userStatusRecently) {
                        userStatus.expires = userStatus.by_me ? -1000 : -100;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastWeek) {
                        userStatus.expires = userStatus.by_me ? -1001 : -101;
                    } else if (userStatus instanceof TLRPC.TL_userStatusLastMonth) {
                        userStatus.expires = userStatus.by_me ? -1002 : -102;
                    }
                    executeFast.bindInteger(3, userStatus.expires);
                } else {
                    executeFast.bindInteger(3, 0);
                }
                executeFast.bindByteBuffer(4, nativeByteBuffer);
                executeFast.step();
                nativeByteBuffer.reuse();
                this.R.delete(user.id);
            }
        }
        executeFast.dispose();
    }

    public final void p(boolean z9) {
        if (z9) {
            s1();
        } else {
            q();
        }
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.b = null;
        }
        if (z9) {
            File file = this.c;
            if (file != null) {
                file.delete();
                this.c = null;
            }
            File file2 = this.d;
            if (file2 != null) {
                file2.delete();
                this.d = null;
            }
            File file3 = this.e;
            if (file3 != null) {
                file3.delete();
                this.e = null;
            }
        }
    }

    public final void p0() {
        this.a.c(new rq(this, 21));
    }

    public final void p1(int i7, ArrayList arrayList) {
        this.a.c(new up(this, i7, arrayList, 0));
    }

    public final void q() {
        this.n = 0;
        this.w = 0;
        this.r = 0;
        this.s = 0;
        this.x = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.H.clear();
        this.I.clear();
        this.J.b();
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.y = null;
        this.D = 0;
    }

    public final void q0(final int i7, final int i10, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, final boolean z9) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.c(new Runnable() { // from class: org.telegram.messenger.mr
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                yr yrVar = yr.this;
                int i11 = i7;
                CountDownLatch countDownLatch2 = countDownLatch;
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        SQLiteDatabase sQLiteDatabase = yrVar.b;
                        Locale locale = Locale.US;
                        try {
                            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT did FROM shortcut_widget WHERE id = " + i11 + " ORDER BY ord ASC", new Object[0]);
                            while (true) {
                                try {
                                    boolean next = queryFinalized.next();
                                    arrayList4 = arrayList;
                                    arrayList5 = arrayList2;
                                    arrayList6 = arrayList3;
                                    if (!next) {
                                        break;
                                    }
                                    long longValue = queryFinalized.longValue(0);
                                    if (longValue != -1) {
                                        arrayList4.add(Long.valueOf(longValue));
                                        if (arrayList5 != null && arrayList6 != null) {
                                            if (m5.E(longValue)) {
                                                arrayList7.add(Long.valueOf(longValue));
                                            } else {
                                                arrayList8.add(Long.valueOf(-longValue));
                                            }
                                        }
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    sQLiteCursor = queryFinalized;
                                    yrVar.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    countDownLatch2.countDown();
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteCursor = queryFinalized;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    countDownLatch2.countDown();
                                    throw th;
                                }
                            }
                            queryFinalized.dispose();
                            if (!z9 && arrayList4.isEmpty()) {
                                if (i10 == 0) {
                                    SQLiteCursor queryFinalized2 = yrVar.b.queryFinalized("SELECT did FROM dialogs WHERE folder_id = 0 ORDER BY pinned DESC, date DESC LIMIT 0,10", new Object[0]);
                                    while (queryFinalized2.next()) {
                                        long longValue2 = queryFinalized2.longValue(0);
                                        if (!m5.D(longValue2)) {
                                            arrayList4.add(Long.valueOf(longValue2));
                                            if (arrayList5 != null && arrayList6 != null) {
                                                if (m5.E(longValue2)) {
                                                    arrayList7.add(Long.valueOf(longValue2));
                                                } else {
                                                    arrayList8.add(Long.valueOf(-longValue2));
                                                }
                                            }
                                        }
                                    }
                                    queryFinalized2.dispose();
                                } else {
                                    SQLiteCursor queryFinalized3 = yrVar.getMessagesStorage().b.queryFinalized("SELECT did FROM chat_hints WHERE type = 0 ORDER BY rating DESC LIMIT 4", new Object[0]);
                                    while (queryFinalized3.next()) {
                                        long longValue3 = queryFinalized3.longValue(0);
                                        arrayList4.add(Long.valueOf(longValue3));
                                        if (arrayList5 != null && arrayList6 != null) {
                                            if (m5.E(longValue3)) {
                                                arrayList7.add(Long.valueOf(longValue3));
                                            } else {
                                                arrayList8.add(Long.valueOf(-longValue3));
                                            }
                                        }
                                    }
                                    queryFinalized3.dispose();
                                }
                            }
                            if (arrayList5 != null && arrayList6 != null) {
                                if (!arrayList8.isEmpty()) {
                                    yrVar.Q(TextUtils.join(",", arrayList8), arrayList6);
                                }
                                if (!arrayList7.isEmpty()) {
                                    yrVar.n0(arrayList7, arrayList5, false);
                                }
                            }
                            countDownLatch2.countDown();
                        } catch (Exception e11) {
                            e = e11;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
        });
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
    }

    public final void q1(long j3) {
        this.a.c(new xp(this, j3, 6));
    }

    public final void r(int i7) {
        this.a.c(new tp(this, i7, 4));
    }

    public final boolean r0(a0.h hVar, TLRPC.Chat chat) {
        long j3 = chat.linked_community_id;
        if (j3 == 0) {
            return false;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) hVar.f(j3);
        if (chat2 == null) {
            chat2 = O(chat.linked_community_id);
            hVar.k(chat2, chat.linked_community_id);
        }
        return chat2 != null && chat2.collapsed_in_dialogs;
    }

    public final void r1(TLRPC.Message message, ArrayList arrayList, ArrayList arrayList2, boolean z9) {
        if (message == null || (message instanceof TLRPC.TL_messageEmpty)) {
            return;
        }
        this.a.c(new ln(this, message, z9, arrayList, arrayList2, 1));
    }

    public final void s() {
        for (int i7 = 0; i7 < 2; i7++) {
            getUserConfig().x(i7, 0, 0, 0L, 0L, 0L, 0L);
            getUserConfig().z(i7, 0);
        }
        getUserConfig().v(false);
    }

    public final void s1() {
        q();
        g0.h3(new rq(this, 9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i7, long j3, long j10, int i10, int i11) {
        yr yrVar;
        SQLiteCursor sQLiteCursor;
        String str;
        SQLiteCursor queryFinalized;
        ArrayList arrayList;
        String str2;
        int i12;
        long j11;
        SQLitePreparedStatement executeFast;
        int i13;
        int i14;
        boolean z9;
        char c10;
        SQLiteDatabase sQLiteDatabase;
        StringBuilder sb2;
        boolean z10;
        String str3;
        int i15 = i7;
        int i16 = i10;
        ?? r15 = " AND topic_id = ";
        String str4 = " AND type = ";
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (j10 == 0) {
                    try {
                        if (i11 < 0) {
                            str = " AND topic_id = ";
                            yr yrVar2 = this;
                            SQLiteDatabase sQLiteDatabase2 = yrVar2.b;
                            Locale locale = Locale.US;
                            queryFinalized = sQLiteDatabase2.queryFinalized("SELECT type, start, end FROM media_holes_v2 WHERE uid = " + j3 + " AND type >= 0 AND ((end >= " + i15 + " AND end <= " + i16 + ") OR (start >= " + i15 + " AND start <= " + i16 + ") OR (start >= " + i15 + " AND end <= " + i16 + ") OR (start <= " + i15 + " AND end >= " + i16 + "))", new Object[0]);
                            r15 = yrVar2;
                        } else {
                            str = " AND topic_id = ";
                            SQLiteDatabase sQLiteDatabase3 = this.b;
                            Locale locale2 = Locale.US;
                            try {
                                StringBuilder sb3 = new StringBuilder("SELECT type, start, end FROM media_holes_v2 WHERE uid = ");
                                sb3.append(j3);
                                sb3.append(" AND type = ");
                                sb3.append(i11);
                                sb3.append(" AND ((end >= ");
                                sb3.append(i15);
                                sb3.append(" AND end <= ");
                                sb3.append(i16);
                                sb3.append(") OR (start >= ");
                                sb3.append(i15);
                                sb3.append(" AND start <= ");
                                sb3.append(i16);
                                sb3.append(") OR (start >= ");
                                sb3.append(i15);
                                sb3.append(" AND end <= ");
                                sb3.append(i16);
                                sb3.append(") OR (start <= ");
                                sb3.append(i15);
                                sb3.append(" AND end >= ");
                                sb3.append(i16);
                                sb3.append("))");
                                queryFinalized = sQLiteDatabase3.queryFinalized(sb3.toString(), new Object[0]);
                                r15 = sb3;
                            } catch (Exception e10) {
                                e = e10;
                                yrVar = this;
                                sQLiteCursor = null;
                                try {
                                    yrVar.n(e);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor == null) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteCursor = null;
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        }
                        sQLiteCursor = queryFinalized;
                    } catch (Exception e11) {
                        e = e11;
                        yrVar = r15;
                        sQLiteCursor = null;
                        yrVar.n(e);
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor == null) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = null;
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLiteCursor != null) {
                        }
                        throw th;
                    }
                } else if (i11 < 0) {
                    SQLiteDatabase sQLiteDatabase4 = this.b;
                    Locale locale3 = Locale.US;
                    sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT type, start, end FROM media_holes_topics WHERE uid = " + j3 + " AND topic_id = " + j10 + " AND type >= 0 AND ((end >= " + i15 + " AND end <= " + i16 + ") OR (start >= " + i15 + " AND start <= " + i16 + ") OR (start >= " + i15 + " AND end <= " + i16 + ") OR (start <= " + i15 + " AND end >= " + i16 + "))", new Object[0]);
                    str = " AND topic_id = ";
                    str4 = " AND type = ";
                } else {
                    SQLiteDatabase sQLiteDatabase5 = this.b;
                    Locale locale4 = Locale.US;
                    StringBuilder sb4 = new StringBuilder("SELECT type, start, end FROM media_holes_topics WHERE uid = ");
                    sb4.append(j3);
                    sb4.append(" AND topic_id = ");
                    sb4.append(j10);
                    str4 = " AND type = ";
                    sb4.append(str4);
                    sb4.append(i11);
                    sb4.append(" AND ((end >= ");
                    sb4.append(i15);
                    sb4.append(" AND end <= ");
                    sb4.append(i16);
                    sb4.append(") OR (start >= ");
                    sb4.append(i15);
                    sb4.append(" AND start <= ");
                    sb4.append(i16);
                    sb4.append(") OR (start >= ");
                    sb4.append(i15);
                    sb4.append(" AND end <= ");
                    sb4.append(i16);
                    sb4.append(") OR (start <= ");
                    sb4.append(i15);
                    sb4.append(" AND end >= ");
                    sb4.append(i16);
                    sb4.append("))");
                    sQLiteCursor = sQLiteDatabase5.queryFinalized(sb4.toString(), new Object[0]);
                    str = " AND topic_id = ";
                }
                ArrayList arrayList2 = null;
                while (sQLiteCursor.next()) {
                    try {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        int intValue = sQLiteCursor.intValue(0);
                        int intValue2 = sQLiteCursor.intValue(1);
                        int intValue3 = sQLiteCursor.intValue(2);
                        if (intValue2 != intValue3 || intValue2 != 1) {
                            arrayList2.add(new rr(intValue, intValue2, intValue3));
                        }
                    } catch (Exception e12) {
                        e = e12;
                        yrVar = this;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                sQLiteCursor.dispose();
                if (arrayList2 != null) {
                    int i17 = 0;
                    while (i17 < arrayList2.size()) {
                        rr rrVar = (rr) arrayList2.get(i17);
                        int i18 = rrVar.b;
                        int i19 = rrVar.c;
                        int i20 = rrVar.a;
                        int i21 = i18 - 1;
                        if (i16 < i21 || i15 > i20 + 1) {
                            yrVar = this;
                            arrayList = arrayList2;
                            str2 = str;
                            i12 = i17;
                            if (i16 >= i21) {
                                if (i18 != i7) {
                                    if (j10 != 0) {
                                        try {
                                            SQLiteDatabase sQLiteDatabase6 = yrVar.b;
                                            Locale locale5 = Locale.US;
                                            sQLiteDatabase6.executeFast("UPDATE media_holes_topics SET end = " + i7 + " WHERE uid = " + j3 + str2 + j10 + str4 + i19 + " AND start = " + i20 + " AND end = " + i18).stepThis().dispose();
                                        } catch (Exception e13) {
                                            e = e13;
                                            z10 = false;
                                            yrVar = this;
                                            yrVar.o(e, z10);
                                            i16 = i10;
                                            i14 = i7;
                                            z9 = true;
                                            c10 = 2;
                                            i17 = i12 + 1;
                                            str = str2;
                                            i15 = i14;
                                            arrayList2 = arrayList;
                                        }
                                    } else {
                                        try {
                                            SQLiteDatabase sQLiteDatabase7 = yrVar.b;
                                            Locale locale6 = Locale.US;
                                            sQLiteDatabase7.executeFast("UPDATE media_holes_v2 SET end = " + i7 + " WHERE uid = " + j3 + str4 + i19 + " AND start = " + i20 + " AND end = " + i18).stepThis().dispose();
                                        } catch (Exception e14) {
                                            e = e14;
                                            z10 = false;
                                            yrVar.o(e, z10);
                                            i16 = i10;
                                            i14 = i7;
                                            z9 = true;
                                            c10 = 2;
                                            i17 = i12 + 1;
                                            str = str2;
                                            i15 = i14;
                                            arrayList2 = arrayList;
                                        }
                                    }
                                }
                                i16 = i10;
                            } else if (i7 <= i20 + 1) {
                                i16 = i10;
                                if (i20 != i16) {
                                    if (j10 != 0) {
                                        try {
                                            sQLiteDatabase = yrVar.b;
                                            Locale locale7 = Locale.US;
                                            sb2 = new StringBuilder();
                                            sb2.append("UPDATE media_holes_topics SET start = ");
                                            sb2.append(i16);
                                            sb2.append(" WHERE uid = ");
                                            sb2.append(j3);
                                            sb2.append(str2);
                                        } catch (Exception e15) {
                                            e = e15;
                                        }
                                        try {
                                            sb2.append(j10);
                                            sb2.append(str4);
                                            sb2.append(i19);
                                            sb2.append(" AND start = ");
                                            sb2.append(i20);
                                            sb2.append(" AND end = ");
                                            sb2.append(i18);
                                            sQLiteDatabase.executeFast(sb2.toString()).stepThis().dispose();
                                        } catch (Exception e16) {
                                            e = e16;
                                            yrVar.o(e, false);
                                            i14 = i7;
                                            z9 = true;
                                            c10 = 2;
                                            i17 = i12 + 1;
                                            str = str2;
                                            i15 = i14;
                                            arrayList2 = arrayList;
                                        }
                                    } else {
                                        SQLiteDatabase sQLiteDatabase8 = yrVar.b;
                                        Locale locale8 = Locale.US;
                                        sQLiteDatabase8.executeFast("UPDATE media_holes_v2 SET start = " + i16 + " WHERE uid = " + j3 + str4 + i19 + " AND start = " + i20 + " AND end = " + i18).stepThis().dispose();
                                    }
                                }
                            } else {
                                i16 = i10;
                                if (j10 != 0) {
                                    SQLiteDatabase sQLiteDatabase9 = yrVar.b;
                                    Locale locale9 = Locale.US;
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("DELETE FROM media_holes_topics WHERE uid = ");
                                    sb5.append(j3);
                                    sb5.append(str2);
                                    j11 = j10;
                                    sb5.append(j11);
                                    sb5.append(str4);
                                    sb5.append(i19);
                                    sb5.append(" AND start = ");
                                    sb5.append(i20);
                                    sb5.append(" AND end = ");
                                    sb5.append(i18);
                                    sQLiteDatabase9.executeFast(sb5.toString()).stepThis().dispose();
                                    executeFast = yrVar.b.executeFast("REPLACE INTO media_holes_topics VALUES(?, ?, ?, ?, ?)");
                                } else {
                                    j11 = j10;
                                    SQLiteDatabase sQLiteDatabase10 = yrVar.b;
                                    Locale locale10 = Locale.US;
                                    sQLiteDatabase10.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j3 + str4 + i19 + " AND start = " + i20 + " AND end = " + i18).stepThis().dispose();
                                    executeFast = yrVar.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
                                }
                                try {
                                    executeFast.requery();
                                    executeFast.bindLong(1, j3);
                                    if (j10 != 0) {
                                        executeFast.bindLong(2, j11);
                                        i13 = 3;
                                    } else {
                                        i13 = 2;
                                    }
                                    executeFast.bindInteger(i13, i19);
                                    executeFast.bindInteger(i13 + 1, i20);
                                    i14 = i7;
                                    executeFast.bindInteger(i13 + 2, i14);
                                    executeFast.step();
                                    executeFast.requery();
                                    z9 = true;
                                    executeFast.bindLong(1, j3);
                                    c10 = 2;
                                    executeFast.bindInteger(2, i19);
                                    executeFast.bindInteger(3, i16);
                                    executeFast.bindInteger(4, i18);
                                    executeFast.step();
                                    executeFast.dispose();
                                    i17 = i12 + 1;
                                    str = str2;
                                    i15 = i14;
                                    arrayList2 = arrayList;
                                } catch (Exception e17) {
                                    e = e17;
                                    sQLiteCursor = null;
                                    sQLitePreparedStatement = executeFast;
                                    yrVar.n(e);
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor == null) {
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    sQLiteCursor = null;
                                    sQLitePreparedStatement = executeFast;
                                    if (sQLitePreparedStatement != null) {
                                    }
                                    if (sQLiteCursor != null) {
                                    }
                                    throw th;
                                }
                            }
                        } else {
                            if (j10 != 0) {
                                yrVar = this;
                                try {
                                    try {
                                        SQLiteDatabase sQLiteDatabase11 = yrVar.b;
                                        Locale locale11 = Locale.US;
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("DELETE FROM media_holes_topics WHERE uid = ");
                                        sb6.append(j3);
                                        str3 = str;
                                        sb6.append(str3);
                                        i12 = i17;
                                        sb6.append(j10);
                                        sb6.append(str4);
                                        sb6.append(i19);
                                        sb6.append(" AND start = ");
                                        sb6.append(i20);
                                        sb6.append(" AND end = ");
                                        sb6.append(i18);
                                        sQLiteDatabase11.executeFast(sb6.toString()).stepThis().dispose();
                                        arrayList = arrayList2;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        sQLiteCursor = null;
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e18) {
                                    e = e18;
                                    sQLiteCursor = null;
                                    yrVar.n(e);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor == null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                str3 = str;
                                i12 = i17;
                                SQLiteDatabase sQLiteDatabase12 = this.b;
                                Locale locale12 = Locale.US;
                                arrayList = arrayList2;
                                sQLiteDatabase12.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + j3 + str4 + i19 + " AND start = " + i20 + " AND end = " + i18).stepThis().dispose();
                            }
                            str2 = str3;
                        }
                        i14 = i7;
                        z9 = true;
                        c10 = 2;
                        i17 = i12 + 1;
                        str = str2;
                        i15 = i14;
                        arrayList2 = arrayList;
                    }
                }
            } catch (Exception e19) {
                e = e19;
            }
        } catch (Throwable th8) {
            th = th8;
        }
    }

    public final void t1(boolean z9) {
        int size = this.H.size();
        for (int i7 = 0; i7 < size; i7++) {
            vo voVar = (vo) this.H.get(i7);
            if (z9) {
                int i10 = voVar.g;
                int i11 = qp.C8;
                if ((i10 & 32) != 0) {
                    voVar.e = -1;
                }
            } else {
                voVar.e = -1;
            }
        }
        j(false);
        g0.h3(new rq(this, 25));
    }

    public final void u(int i7, int i10, long j3, long j10, String str) {
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        int i11;
        int i12;
        int i13;
        int i14;
        SQLiteCursor queryFinalized;
        int i15;
        ArrayList arrayList;
        int i16;
        boolean z9;
        SQLitePreparedStatement executeFast;
        long j11;
        int i17;
        int i18;
        int i19;
        int i20 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        boolean z10 = false;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                try {
                    if (i20 != 0) {
                        i11 = 2;
                        i12 = 3;
                        i13 = 4;
                        i14 = 1;
                        queryFinalized = this.b.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND topic_id = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j3), Long.valueOf(j10), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i10)), new Object[0]);
                    } else {
                        i11 = 2;
                        i12 = 3;
                        i13 = 4;
                        i14 = 1;
                        queryFinalized = this.b.queryFinalized(String.format(Locale.US, "SELECT start, end FROM " + str + " WHERE uid = %d AND ((end >= %d AND end <= %d) OR (start >= %d AND start <= %d) OR (start >= %d AND end <= %d) OR (start <= %d AND end >= %d))", Long.valueOf(j3), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i10), Integer.valueOf(i7), Integer.valueOf(i10)), new Object[0]);
                    }
                    sQLiteCursor2 = queryFinalized;
                    ArrayList arrayList2 = null;
                    while (sQLiteCursor2.next()) {
                        try {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            int intValue = sQLiteCursor2.intValue(0);
                            int i21 = i14;
                            int intValue2 = sQLiteCursor2.intValue(i21);
                            if (intValue != intValue2 || intValue != i21) {
                                arrayList2.add(new rr(intValue, intValue2));
                            }
                            i14 = 1;
                        } catch (Exception e10) {
                            e = e10;
                        }
                    }
                    sQLiteCursor2.dispose();
                    if (arrayList2 != null) {
                        int i22 = 0;
                        while (i22 < arrayList2.size()) {
                            rr rrVar = (rr) arrayList2.get(i22);
                            int i23 = rrVar.b;
                            int i24 = rrVar.a;
                            int i25 = i23 - 1;
                            boolean z11 = z10;
                            int i26 = i20;
                            if (i10 >= i25) {
                                i15 = i22;
                                if (i7 <= i24 + 1) {
                                    if (i26 != 0) {
                                        Long valueOf = Long.valueOf(j3);
                                        Long valueOf2 = Long.valueOf(j10);
                                        Integer valueOf3 = Integer.valueOf(i24);
                                        Integer valueOf4 = Integer.valueOf(i23);
                                        arrayList = arrayList2;
                                        Object[] objArr = new Object[i13];
                                        objArr[z11 ? 1 : 0] = valueOf;
                                        objArr[1] = valueOf2;
                                        objArr[i11] = valueOf3;
                                        objArr[i12] = valueOf4;
                                        this.b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr)).stepThis().dispose();
                                    } else {
                                        arrayList = arrayList2;
                                        Long valueOf5 = Long.valueOf(j3);
                                        Integer valueOf6 = Integer.valueOf(i24);
                                        Integer valueOf7 = Integer.valueOf(i23);
                                        Object[] objArr2 = new Object[i12];
                                        objArr2[z11 ? 1 : 0] = valueOf5;
                                        objArr2[1] = valueOf6;
                                        objArr2[i11] = valueOf7;
                                        this.b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr2)).stepThis().dispose();
                                    }
                                    i18 = i11;
                                    i16 = 3;
                                    z9 = false;
                                    i22 = i15 + 1;
                                    i12 = i16;
                                    i11 = i18;
                                    z10 = z9;
                                    i20 = i26;
                                    arrayList2 = arrayList;
                                    i13 = 4;
                                }
                            } else {
                                i15 = i22;
                            }
                            arrayList = arrayList2;
                            if (i10 >= i25) {
                                if (i23 != i7) {
                                    if (i26 != 0) {
                                        try {
                                            SQLiteDatabase sQLiteDatabase = this.b;
                                            Locale locale = Locale.US;
                                            Long valueOf8 = Long.valueOf(j3);
                                            Long valueOf9 = Long.valueOf(j10);
                                            Integer valueOf10 = Integer.valueOf(i24);
                                            Integer valueOf11 = Integer.valueOf(i23);
                                            Object[] objArr3 = new Object[4];
                                            objArr3[z11 ? 1 : 0] = valueOf8;
                                            objArr3[1] = valueOf9;
                                            objArr3[i11] = valueOf10;
                                            objArr3[3] = valueOf11;
                                            sQLiteDatabase.executeFast(String.format(locale, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr3)).stepThis().dispose();
                                            Long valueOf12 = Long.valueOf(j3);
                                            Long valueOf13 = Long.valueOf(j10);
                                            Integer valueOf14 = Integer.valueOf(i24);
                                            Integer valueOf15 = Integer.valueOf(i7);
                                            Object[] objArr4 = new Object[4];
                                            objArr4[z11 ? 1 : 0] = valueOf12;
                                            objArr4[1] = valueOf13;
                                            objArr4[i11] = valueOf14;
                                            objArr4[3] = valueOf15;
                                            this.b.executeFast(String.format(locale, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr4)).stepThis().dispose();
                                        } catch (Exception e11) {
                                            o(e11, z11);
                                        }
                                    } else {
                                        SQLiteDatabase sQLiteDatabase2 = this.b;
                                        Locale locale2 = Locale.US;
                                        Long valueOf16 = Long.valueOf(j3);
                                        Integer valueOf17 = Integer.valueOf(i24);
                                        Integer valueOf18 = Integer.valueOf(i23);
                                        Object[] objArr5 = new Object[3];
                                        objArr5[z11 ? 1 : 0] = valueOf16;
                                        objArr5[1] = valueOf17;
                                        objArr5[i11] = valueOf18;
                                        sQLiteDatabase2.executeFast(String.format(locale2, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr5)).stepThis().dispose();
                                        Long valueOf19 = Long.valueOf(j3);
                                        Integer valueOf20 = Integer.valueOf(i24);
                                        Integer valueOf21 = Integer.valueOf(i7);
                                        Object[] objArr6 = new Object[3];
                                        objArr6[z11 ? 1 : 0] = valueOf19;
                                        objArr6[1] = valueOf20;
                                        objArr6[i11] = valueOf21;
                                        this.b.executeFast(String.format(locale2, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr6)).stepThis().dispose();
                                    }
                                }
                            } else if (i7 > i24 + 1) {
                                if (i26 != 0) {
                                    Long valueOf22 = Long.valueOf(j3);
                                    Long valueOf23 = Long.valueOf(j10);
                                    Integer valueOf24 = Integer.valueOf(i24);
                                    Integer valueOf25 = Integer.valueOf(i23);
                                    Object[] objArr7 = new Object[4];
                                    objArr7[0] = valueOf22;
                                    objArr7[1] = valueOf23;
                                    objArr7[i11] = valueOf24;
                                    objArr7[3] = valueOf25;
                                    this.b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr7)).stepThis().dispose();
                                    executeFast = this.b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?, ?)");
                                    i16 = 3;
                                    z9 = false;
                                } else {
                                    Long valueOf26 = Long.valueOf(j3);
                                    Integer valueOf27 = Integer.valueOf(i24);
                                    Integer valueOf28 = Integer.valueOf(i23);
                                    i16 = 3;
                                    Object[] objArr8 = new Object[3];
                                    z9 = false;
                                    objArr8[0] = valueOf26;
                                    objArr8[1] = valueOf27;
                                    objArr8[i11] = valueOf28;
                                    this.b.executeFast(String.format(Locale.US, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr8)).stepThis().dispose();
                                    executeFast = this.b.executeFast("REPLACE INTO " + str + " VALUES(?, ?, ?)");
                                }
                                try {
                                    executeFast.requery();
                                    executeFast.bindLong(1, j3);
                                    if (i26 != 0) {
                                        j11 = j10;
                                        executeFast.bindLong(i11, j11);
                                        i17 = i16;
                                    } else {
                                        j11 = j10;
                                        i17 = 2;
                                    }
                                    executeFast.bindInteger(i17, i24);
                                    executeFast.bindInteger(i17 + 1, i7);
                                    executeFast.step();
                                    executeFast.requery();
                                    executeFast.bindLong(1, j3);
                                    if (i26 != 0) {
                                        i18 = 2;
                                        executeFast.bindLong(2, j11);
                                        i19 = i16;
                                    } else {
                                        i18 = 2;
                                        i19 = 2;
                                    }
                                    executeFast.bindInteger(i19, i10);
                                    executeFast.bindInteger(i19 + 1, i23);
                                    executeFast.step();
                                    executeFast.dispose();
                                    i22 = i15 + 1;
                                    i12 = i16;
                                    i11 = i18;
                                    z10 = z9;
                                    i20 = i26;
                                    arrayList2 = arrayList;
                                    i13 = 4;
                                } catch (Exception e12) {
                                    e = e12;
                                    sQLiteCursor2 = null;
                                    sQLitePreparedStatement = executeFast;
                                    n(e);
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor2 != null) {
                                        sQLiteCursor2.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteCursor = null;
                                    sQLitePreparedStatement = executeFast;
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            } else if (i24 != i10) {
                                if (i26 != 0) {
                                    try {
                                        SQLiteDatabase sQLiteDatabase3 = this.b;
                                        Locale locale3 = Locale.US;
                                        Long valueOf29 = Long.valueOf(j3);
                                        Long valueOf30 = Long.valueOf(j10);
                                        Integer valueOf31 = Integer.valueOf(i24);
                                        Integer valueOf32 = Integer.valueOf(i23);
                                        Object[] objArr9 = new Object[4];
                                        objArr9[0] = valueOf29;
                                        objArr9[1] = valueOf30;
                                        objArr9[i11] = valueOf31;
                                        objArr9[3] = valueOf32;
                                        sQLiteDatabase3.executeFast(String.format(locale3, "DELETE FROM " + str + " WHERE uid = %d AND topic_id = %d AND start = %d AND end = %d", objArr9)).stepThis().dispose();
                                        Long valueOf33 = Long.valueOf(j3);
                                        Long valueOf34 = Long.valueOf(j10);
                                        Integer valueOf35 = Integer.valueOf(i10);
                                        Integer valueOf36 = Integer.valueOf(i23);
                                        Object[] objArr10 = new Object[4];
                                        objArr10[0] = valueOf33;
                                        objArr10[1] = valueOf34;
                                        objArr10[i11] = valueOf35;
                                        objArr10[3] = valueOf36;
                                        this.b.executeFast(String.format(locale3, "REPLACE INTO " + str + " VALUES(%d, %d, %d, %d)", objArr10)).stepThis().dispose();
                                    } catch (Exception e13) {
                                        o(e13, false);
                                    }
                                } else {
                                    SQLiteDatabase sQLiteDatabase4 = this.b;
                                    Locale locale4 = Locale.US;
                                    Long valueOf37 = Long.valueOf(j3);
                                    Integer valueOf38 = Integer.valueOf(i24);
                                    Integer valueOf39 = Integer.valueOf(i23);
                                    Object[] objArr11 = new Object[3];
                                    objArr11[0] = valueOf37;
                                    objArr11[1] = valueOf38;
                                    objArr11[i11] = valueOf39;
                                    sQLiteDatabase4.executeFast(String.format(locale4, "DELETE FROM " + str + " WHERE uid = %d AND start = %d AND end = %d", objArr11)).stepThis().dispose();
                                    Long valueOf40 = Long.valueOf(j3);
                                    Integer valueOf41 = Integer.valueOf(i10);
                                    Integer valueOf42 = Integer.valueOf(i23);
                                    Object[] objArr12 = new Object[3];
                                    objArr12[0] = valueOf40;
                                    objArr12[1] = valueOf41;
                                    objArr12[i11] = valueOf42;
                                    this.b.executeFast(String.format(locale4, "REPLACE INTO " + str + " VALUES(%d, %d, %d)", objArr12)).stepThis().dispose();
                                }
                            }
                            i18 = i11;
                            i16 = 3;
                            z9 = false;
                            i22 = i15 + 1;
                            i12 = i16;
                            i11 = i18;
                            z10 = z9;
                            i20 = i26;
                            arrayList2 = arrayList;
                            i13 = 4;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Exception e14) {
                e = e14;
                sQLiteCursor2 = null;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }

    public final boolean u0(int i7, long j3) {
        return (i7 & Z(j3)) != 0;
    }

    public final void u1(long j3) {
        LongSparseIntArray longSparseIntArray;
        SQLiteCursor sQLiteCursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.b;
            Locale locale = Locale.ENGLISH;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT topic_id FROM topics WHERE did = " + j3 + " AND unread_count > 0", new Object[0]);
            try {
                if (queryFinalized.next()) {
                    longSparseIntArray = null;
                } else {
                    longSparseIntArray = new LongSparseIntArray();
                    longSparseIntArray.put(j3, 0);
                }
                queryFinalized.dispose();
                if (longSparseIntArray != null) {
                    this.b.executeFast("UPDATE dialogs SET unread_count = 0, unread_count_i = 0 WHERE did = " + j3).stepThis().dispose();
                }
                W1(longSparseIntArray, null, true);
                getMessagesController().H3(longSparseIntArray, null);
            } catch (Throwable th2) {
                th = th2;
                sQLiteCursor = queryFinalized;
                try {
                    o(th, true);
                } finally {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean v(long j3) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Boolean[] boolArr = {Boolean.FALSE};
        this.a.c(new jm(this, j3, boolArr, countDownLatch, 12));
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            o(e10, true);
        }
        return boolArr[0].booleanValue();
    }

    public final void v1(String str, TLObject tLObject) {
        if (tLObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.a.c(new lg((Object) this, (Object) tLObject, str, 18));
    }

    public final boolean w0(long j3) {
        return u0(4, j3);
    }

    public final void w1(int i7, long j3) {
        this.a.c(new aq(this, i7, j3, 2));
    }

    public final SQLiteCursor x(int i7, int i10, long j3) {
        SQLiteDatabase sQLiteDatabase = this.b;
        Locale locale = Locale.US;
        StringBuilder t6 = a8.p0.t(j3, "SELECT data, seen, pin FROM profile_stories JOIN profile_stories_albums_links ON profile_stories.story_id = profile_stories_albums_links.story_id WHERE profile_stories.dialog_id = ", " AND profile_stories_albums_links.dialog_id = ");
        t6.append(j3);
        t6.append("  AND profile_stories_albums_links.album_id = ");
        t6.append(i7);
        t6.append(" AND profile_stories.type = ");
        t6.append(i10);
        t6.append(" ORDER BY profile_stories_albums_links.order_index ASC;");
        return sQLiteDatabase.queryFinalized(t6.toString(), new Object[0]);
    }

    public final boolean x0(a0.h hVar, TLRPC.User user) {
        long j3 = user.linked_community_id;
        if (j3 == 0) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) hVar.f(j3);
        if (chat == null) {
            chat = O(user.linked_community_id);
            hVar.k(chat, user.linked_community_id);
        }
        return chat != null && chat.collapsed_in_dialogs;
    }

    public final void x1(vo voVar, boolean z9) {
        int i7;
        SQLitePreparedStatement executeFast;
        ArrayList arrayList = this.H;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                if (!arrayList.contains(voVar)) {
                    if (!z9) {
                        arrayList.add(voVar);
                    } else if (((vo) arrayList.get(0)).e()) {
                        arrayList.add(1, voVar);
                    } else {
                        arrayList.add(0, voVar);
                    }
                    this.I.put(voVar.a, voVar);
                }
                executeFast = this.b.executeFast("REPLACE INTO dialog_filter VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            int i10 = voVar.a;
            LongSparseIntArray longSparseIntArray = voVar.j;
            executeFast.bindInteger(1, i10);
            executeFast.bindInteger(2, voVar.f);
            executeFast.bindInteger(3, voVar.d);
            executeFast.bindInteger(4, voVar.g);
            executeFast.bindString(5, voVar.a == 0 ? "ALL_CHATS" : voVar.b);
            executeFast.bindInteger(6, voVar.m);
            Vector vector = new Vector(new ch(4));
            vector.objects.addAll(voVar.c);
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(vector.getObjectSize());
            vector.serializeToStream(nativeByteBuffer);
            executeFast.bindByteBuffer(7, nativeByteBuffer);
            executeFast.bindInteger(8, voVar.n ? 1 : 0);
            executeFast.step();
            executeFast.dispose();
            nativeByteBuffer.reuse();
            this.b.executeFast("DELETE FROM dialog_filter_ep WHERE id = " + voVar.a).stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_filter_pin_v2 WHERE id = " + voVar.a).stepThis().dispose();
            this.b.beginTransaction();
            SQLitePreparedStatement executeFast2 = this.b.executeFast("REPLACE INTO dialog_filter_pin_v2 VALUES(?, ?, ?)");
            int size = voVar.h.size();
            for (int i11 = 0; i11 < size; i11++) {
                long longValue = ((Long) voVar.h.get(i11)).longValue();
                executeFast2.requery();
                executeFast2.bindInteger(1, voVar.a);
                executeFast2.bindLong(2, longValue);
                executeFast2.bindInteger(3, longSparseIntArray.get(longValue, TLObject.FLAG_31));
                executeFast2.step();
            }
            int size2 = longSparseIntArray.size();
            for (int i12 = 0; i12 < size2; i12++) {
                long keyAt = longSparseIntArray.keyAt(i12);
                if (m5.C(keyAt)) {
                    executeFast2.requery();
                    executeFast2.bindInteger(1, voVar.a);
                    executeFast2.bindLong(2, keyAt);
                    executeFast2.bindInteger(3, longSparseIntArray.valueAt(i12));
                    executeFast2.step();
                }
            }
            executeFast2.dispose();
            executeFast = this.b.executeFast("REPLACE INTO dialog_filter_ep VALUES(?, ?)");
            int size3 = voVar.i.size();
            for (i7 = 0; i7 < size3; i7++) {
                executeFast.requery();
                executeFast.bindInteger(1, voVar.a);
                executeFast.bindLong(2, ((Long) voVar.i.get(i7)).longValue());
                executeFast.step();
            }
            executeFast.dispose();
            this.b.commitTransaction();
            SQLiteDatabase sQLiteDatabase = this.b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.commitTransaction();
            }
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement = executeFast;
            o(e, true);
            SQLiteDatabase sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
                sQLiteDatabase2.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = executeFast;
            SQLiteDatabase sQLiteDatabase3 = this.b;
            if (sQLiteDatabase3 != null) {
                sQLiteDatabase3.commitTransaction();
            }
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    public final void y(long j3, TLRPC.Message message) {
        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
        tL_forumTopic.topicStartMessage = message;
        tL_forumTopic.top_message = message.id;
        tL_forumTopic.topMessage = message;
        tL_forumTopic.from_id = message.from_id;
        tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
        tL_forumTopic.unread_count = 0;
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) messageAction;
            tL_forumTopic.id = message.id;
            long j10 = tL_messageActionTopicCreate.icon_emoji_id;
            tL_forumTopic.icon_emoji_id = j10;
            tL_forumTopic.title = tL_messageActionTopicCreate.title;
            tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
            if (j10 != 0) {
                tL_forumTopic.flags |= 1;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(tL_forumTopic);
            D1(j3, arrayList, false, false, message.date);
            g0.h3(new a4(this, j3, tL_forumTopic, 22));
            return;
        }
        if (messageAction instanceof TLRPC.TL_messageActionTopicEdit) {
            TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction;
            tL_forumTopic.id = (int) ij.c2(this.currentAccount, message, true, false);
            tL_forumTopic.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
            tL_forumTopic.title = tL_messageActionTopicEdit.title;
            tL_forumTopic.closed = tL_messageActionTopicEdit.closed;
            tL_forumTopic.hidden = tL_messageActionTopicEdit.hidden;
            int i7 = tL_messageActionTopicEdit.flags;
            int i10 = (i7 & 1) != 0 ? 1 : 0;
            if ((i7 & 2) != 0) {
                i10 += 2;
            }
            if ((i7 & 4) != 0) {
                i10 += 8;
            }
            if ((i7 & 8) != 0) {
                i10 += 32;
            }
            this.a.c(new b1(this, i10, tL_forumTopic, j3, message.date));
        }
    }

    public final void y1() {
        this.a.c(new sp(this, new ArrayList(getMessagesController().P0), 7));
    }

    public final long z(NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return 0L;
        }
        long andAdd = this.f.getAndAdd(1L);
        this.a.c(new a4(this, andAdd, nativeByteBuffer, 25));
        return andAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x046d A[Catch: all -> 0x0352, Exception -> 0x0478, TryCatch #4 {Exception -> 0x0478, blocks: (B:36:0x02e9, B:38:0x02ef, B:59:0x0372, B:61:0x0376, B:63:0x046d, B:64:0x047f), top: B:35:0x02e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0521  */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z0() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        ArrayList arrayList;
        int i7;
        SQLitePreparedStatement executeFast;
        ArrayList arrayList2;
        int i10;
        int i11;
        try {
            arrayList = new ArrayList();
            this.b.executeFast("DELETE FROM ephemeral_messages").stepThis().dispose();
            this.b.executeFast("DELETE FROM widget_state").stepThis().dispose();
            this.b.executeFast("DELETE FROM widget_heights").stepThis().dispose();
            org.telegram.utils.twidget.n0.u(this.currentAccount);
            this.b.executeFast("DELETE FROM poll_votes_mentions").stepThis().dispose();
            this.b.executeFast("DELETE FROM poll_votes_mentions_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM reaction_mentions").stepThis().dispose();
            this.b.executeFast("DELETE FROM reaction_mentions_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM downloading_documents").stepThis().dispose();
            this.b.executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
            this.b.executeFast("DELETE FROM animated_emoji").stepThis().dispose();
            this.b.executeFast("DELETE FROM stickers_v2").stepThis().dispose();
            this.b.executeFast("DELETE FROM stickersets2").stepThis().dispose();
            this.b.executeFast("DELETE FROM messages_holes_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM messages_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM saved_dialogs").stepThis().dispose();
            this.b.executeFast("DELETE FROM topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_holes_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_counts_topics").stepThis().dispose();
            this.b.executeFast("DELETE FROM chat_pinned_v2").stepThis().dispose();
            this.b.executeFast("DELETE FROM chat_pinned_count").stepThis().dispose();
            this.b.executeFast("DELETE FROM profile_stories").stepThis().dispose();
            this.b.executeFast("DELETE FROM profile_stories_albums").stepThis().dispose();
            this.b.executeFast("DELETE FROM profile_stories_albums_links").stepThis().dispose();
            this.b.executeFast("DELETE FROM story_pushes").stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_photos").stepThis().dispose();
            this.b.executeFast("DELETE FROM dialog_photos_count").stepThis().dispose();
            this.b.executeFast("DELETE FROM saved_reaction_tags").stepThis().dispose();
            this.b.executeFast("DELETE FROM business_replies").stepThis().dispose();
            this.b.executeFast("DELETE FROM quick_replies_messages").stepThis().dispose();
            this.b.executeFast("DELETE FROM welcome_messages").stepThis().dispose();
            this.b.executeFast("DELETE FROM effects").stepThis().dispose();
            this.b.executeFast("DELETE FROM app_config").stepThis().dispose();
            this.b.executeFast("DELETE FROM star_gifts2").stepThis().dispose();
            this.b.executeFast("DELETE FROM premium_promo").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_counts_v2").stepThis().dispose();
            this.b.executeFast("DELETE FROM media_v4").stepThis().dispose();
            i7 = 0;
            SQLiteCursor queryFinalized = this.b.queryFinalized("SELECT did FROM dialogs WHERE 1", new Object[0]);
            while (queryFinalized.next()) {
                try {
                    long longValue = queryFinalized.longValue(0);
                    if (!m5.C(longValue)) {
                        arrayList.add(Long.valueOf(longValue));
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor = queryFinalized;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor = queryFinalized;
                }
            }
            queryFinalized.dispose();
            executeFast = this.b.executeFast("REPLACE INTO messages_holes VALUES(?, ?, ?)");
        } catch (Exception e11) {
            e = e11;
            sQLitePreparedStatement = null;
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = null;
        }
        try {
            SQLitePreparedStatement executeFast2 = this.b.executeFast("REPLACE INTO media_holes_v2 VALUES(?, ?, ?, ?)");
            try {
                this.b.beginTransaction();
                int i12 = 0;
                SQLiteCursor sQLiteCursor2 = null;
                while (i12 < arrayList.size()) {
                    try {
                        Long l10 = (Long) arrayList.get(i12);
                        sQLiteCursor2 = this.b.queryFinalized("SELECT COUNT(mid) FROM messages_v2 WHERE uid = " + l10, new Object[i7]);
                        int intValue = sQLiteCursor2.next() ? sQLiteCursor2.intValue(i7) : i7;
                        sQLiteCursor2.dispose();
                        if (intValue <= 2) {
                            arrayList2 = arrayList;
                            i10 = i12;
                        } else {
                            sQLiteCursor = this.b.queryFinalized("SELECT last_mid_i, last_mid FROM dialogs WHERE did = " + l10, new Object[i7]);
                            try {
                                try {
                                    if (sQLiteCursor.next()) {
                                        long longValue2 = sQLiteCursor.longValue(i7);
                                        arrayList2 = arrayList;
                                        long longValue3 = sQLiteCursor.longValue(1);
                                        SQLiteCursor queryFinalized2 = this.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + l10 + " AND mid IN (" + longValue2 + "," + longValue3 + ")", new Object[i7]);
                                        int i13 = -1;
                                        ?? r62 = i7;
                                        while (queryFinalized2.next()) {
                                            try {
                                                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(r62);
                                                if (byteBufferValue != 0) {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r62), r62);
                                                    if (TLdeserialize != null) {
                                                        int i14 = TLdeserialize.id;
                                                        try {
                                                            i10 = i12;
                                                            i13 = i14;
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            i10 = i12;
                                                            i13 = i14;
                                                            n(e);
                                                            i11 = i13;
                                                            queryFinalized2.dispose();
                                                            this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + l10 + " AND mid != " + longValue2 + " AND mid != " + longValue3).stepThis().dispose();
                                                            SQLiteDatabase sQLiteDatabase3 = this.b;
                                                            StringBuilder sb2 = new StringBuilder();
                                                            sb2.append("DELETE FROM messages_holes WHERE uid = ");
                                                            sb2.append(l10);
                                                            sQLiteDatabase3.executeFast(sb2.toString()).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + l10).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + l10).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + l10).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM media_v4 WHERE uid = " + l10).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + l10).stepThis().dispose();
                                                            g0.h3(new yg(ui.b0(this.currentAccount), l10.longValue(), 0));
                                                            if (i11 != -1) {
                                                            }
                                                            sQLiteCursor.dispose();
                                                            sQLiteCursor2 = null;
                                                            i12 = i10 + 1;
                                                            arrayList = arrayList2;
                                                            i7 = 0;
                                                        }
                                                        try {
                                                            TLdeserialize.readAttachPath(byteBufferValue, p10.i(this.currentAccount).n);
                                                        } catch (Exception e13) {
                                                            e = e13;
                                                            n(e);
                                                            i11 = i13;
                                                            queryFinalized2.dispose();
                                                            this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + l10 + " AND mid != " + longValue2 + " AND mid != " + longValue3).stepThis().dispose();
                                                            SQLiteDatabase sQLiteDatabase32 = this.b;
                                                            StringBuilder sb22 = new StringBuilder();
                                                            sb22.append("DELETE FROM messages_holes WHERE uid = ");
                                                            sb22.append(l10);
                                                            sQLiteDatabase32.executeFast(sb22.toString()).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + l10).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + l10).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + l10).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM media_v4 WHERE uid = " + l10).stepThis().dispose();
                                                            this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + l10).stepThis().dispose();
                                                            g0.h3(new yg(ui.b0(this.currentAccount), l10.longValue(), 0));
                                                            if (i11 != -1) {
                                                            }
                                                            sQLiteCursor.dispose();
                                                            sQLiteCursor2 = null;
                                                            i12 = i10 + 1;
                                                            arrayList = arrayList2;
                                                            i7 = 0;
                                                        }
                                                    } else {
                                                        i10 = i12;
                                                    }
                                                    byteBufferValue.reuse();
                                                } else {
                                                    i10 = i12;
                                                }
                                                i12 = i10;
                                                r62 = 0;
                                            } catch (Exception e14) {
                                                e = e14;
                                                i10 = i12;
                                            }
                                        }
                                        i10 = i12;
                                        i11 = i13;
                                        queryFinalized2.dispose();
                                        this.b.executeFast("DELETE FROM messages_v2 WHERE uid = " + l10 + " AND mid != " + longValue2 + " AND mid != " + longValue3).stepThis().dispose();
                                        SQLiteDatabase sQLiteDatabase322 = this.b;
                                        StringBuilder sb222 = new StringBuilder();
                                        sb222.append("DELETE FROM messages_holes WHERE uid = ");
                                        sb222.append(l10);
                                        sQLiteDatabase322.executeFast(sb222.toString()).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM bot_keyboard WHERE uid = " + l10).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM bot_keyboard_topics WHERE uid = " + l10).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM media_counts_v2 WHERE uid = " + l10).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM media_v4 WHERE uid = " + l10).stepThis().dispose();
                                        this.b.executeFast("DELETE FROM media_holes_v2 WHERE uid = " + l10).stepThis().dispose();
                                        g0.h3(new yg(ui.b0(this.currentAccount), l10.longValue(), 0));
                                        if (i11 != -1) {
                                            w(l10.longValue(), executeFast, executeFast2, i11, 0L);
                                        }
                                    } else {
                                        arrayList2 = arrayList;
                                        i10 = i12;
                                    }
                                    sQLiteCursor.dispose();
                                    sQLiteCursor2 = null;
                                } catch (Exception e15) {
                                    e = e15;
                                    sQLitePreparedStatement = executeFast;
                                    sQLitePreparedStatement2 = executeFast2;
                                    try {
                                        n(e);
                                        sQLiteDatabase2 = this.b;
                                        if (sQLiteDatabase2 != null) {
                                            sQLiteDatabase2.commitTransaction();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                            sQLitePreparedStatement2.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        s1();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        sQLiteDatabase = this.b;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.commitTransaction();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                        }
                                        if (sQLitePreparedStatement2 != null) {
                                            sQLitePreparedStatement2.dispose();
                                        }
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        s1();
                                        throw th;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                sQLitePreparedStatement = executeFast;
                                sQLitePreparedStatement2 = executeFast2;
                                sQLiteDatabase = this.b;
                                if (sQLiteDatabase != null) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                if (sQLitePreparedStatement2 != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                s1();
                                throw th;
                            }
                        }
                        i12 = i10 + 1;
                        arrayList = arrayList2;
                        i7 = 0;
                    } catch (Exception e16) {
                        e = e16;
                        sQLiteCursor = sQLiteCursor2;
                    } catch (Throwable th6) {
                        th = th6;
                        sQLiteCursor = sQLiteCursor2;
                    }
                }
                executeFast.dispose();
                executeFast2.dispose();
                try {
                    this.b.commitTransaction();
                    this.b.executeFast("PRAGMA journal_size_limit = 0").stepThis().dispose();
                    this.b.executeFast("VACUUM").stepThis().dispose();
                    this.b.executeFast("PRAGMA journal_size_limit = -1").stepThis().dispose();
                    getMessagesController().S1().b();
                    g0.h3(new rq(this, 20));
                    SQLiteDatabase sQLiteDatabase4 = this.b;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.commitTransaction();
                    }
                    if (sQLiteCursor2 != null) {
                        sQLiteCursor2.dispose();
                    }
                } catch (Exception e17) {
                    e = e17;
                    sQLiteCursor = sQLiteCursor2;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                    n(e);
                    sQLiteDatabase2 = this.b;
                    if (sQLiteDatabase2 != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    s1();
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor = sQLiteCursor2;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                    sQLiteDatabase = this.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    if (sQLitePreparedStatement2 != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    s1();
                    throw th;
                }
            } catch (Exception e18) {
                e = e18;
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement2 = executeFast2;
                sQLiteCursor = null;
            } catch (Throwable th8) {
                th = th8;
                sQLitePreparedStatement = executeFast;
                sQLitePreparedStatement2 = executeFast2;
                sQLiteCursor = null;
            }
        } catch (Exception e19) {
            e = e19;
            sQLitePreparedStatement = executeFast;
            sQLiteCursor = null;
            sQLitePreparedStatement2 = null;
            n(e);
            sQLiteDatabase2 = this.b;
            if (sQLiteDatabase2 != null) {
            }
            if (sQLitePreparedStatement != null) {
            }
            if (sQLitePreparedStatement2 != null) {
            }
            if (sQLiteCursor != null) {
            }
            s1();
        } catch (Throwable th9) {
            th = th9;
            sQLitePreparedStatement = executeFast;
            sQLiteCursor = null;
            sQLitePreparedStatement2 = null;
            sQLiteDatabase = this.b;
            if (sQLiteDatabase != null) {
            }
            if (sQLitePreparedStatement != null) {
            }
            if (sQLitePreparedStatement2 != null) {
            }
            if (sQLiteCursor != null) {
            }
            s1();
            throw th;
        }
        s1();
    }

    public final void z1() {
        ArrayList arrayList = this.H;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                sQLitePreparedStatement = this.b.executeFast("UPDATE dialog_filter SET ord = ?, flags = ? WHERE id = ?");
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    vo voVar = (vo) arrayList.get(i7);
                    sQLitePreparedStatement.requery();
                    sQLitePreparedStatement.bindInteger(1, voVar.f);
                    sQLitePreparedStatement.bindInteger(2, voVar.g);
                    sQLitePreparedStatement.bindInteger(3, voVar.a);
                    sQLitePreparedStatement.step();
                }
                sQLitePreparedStatement.dispose();
            } catch (Exception e10) {
                o(e10, true);
                if (sQLitePreparedStatement != null) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th2) {
            if (sQLitePreparedStatement != null) {
                sQLitePreparedStatement.dispose();
            }
            throw th2;
        }
    }
}
